import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;



// Application will parse the .xml file returned from apkparser. Will then input into the sqliteDB
// Usage: apkParserMain <input.apk>

// 1) Run APK analyzer on the .apk file
// 2) Run APK Parser command on the .apk file
// 3) Input the information into the SQLiteDB

public class apkparserMain {
	util u = new util();
	
	//Name of the application being examined 
	private static String appName="/Users/dan/Documents/workspace/ProjectKrutz/tools/CustomJava/src/testinput/0.txt";

	public static void main(String[] args) throws IOException, InterruptedException, ParserConfigurationException, SAXException {
		
		//if(args.length!=1){
		//	System.out.println("A single argument with the application name was expected");
		//}else{
		//	appName = args[0];
			apkparserMain ap = new apkparserMain();
			ap.Run();		
		//}
	}
	
	
	public void Run() throws IOException, InterruptedException, ParserConfigurationException, SAXException{
		//System.out.println(u.readDoc(appName));
	//	System.out.println(RunAPKParser("dan"));
		//findAPKInformation();
		
		parseXMLInfo();
	}
	
	
	
	
	private void parseXMLInfo() throws ParserConfigurationException, SAXException, IOException, InterruptedException{	
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

		Document doc = docBuilder.parse(new InputSource(new StringReader(findAPKInformation())));
		readXMLInfo(doc.getDocumentElement());
		
		//System.out.println(findAPKInformation());
	}
	

	// This will find all of the target apk files, run apkanalyzer on them, and store the information in the SQLiteDB
	private String findAPKInformation() throws IOException, InterruptedException{
		
		StringBuilder retVal = new StringBuilder();
		// Loop through all of the apk files in the target directory
		File path = new File("src/testinput/testAPKInput");
		File [] files = path.listFiles();
		    for (int i = 0; i < files.length; i++){
		        if (files[i].isFile()){ //this line weeds out other directories/folders
		        	// Make sure the file is an apk file
		        	// String ext = FilenameUtils.getExtension("/path/to/file/foo.txt");
		        	//if(FilenameUtils.){String extension = "";
		        	String extension = "";
					int a = files[i].getName().lastIndexOf('.');
					//if (i > 0) {
					    extension = files[i].getName().substring(a+1);
					//}
				
						if(extension.toLowerCase().equals("apk")){
							retVal.append(RunAPKParser(files[i]));
						}
		        	}
		        }
		    		
		    return retVal.toString();
	}
	

	// Analyze the target .apk file and return its generated XML information
	private String RunAPKParser(File inputFile) throws IOException, InterruptedException{
	
		Process proc = Runtime.getRuntime().exec("java -jar src/apkparser/APKParser.jar " + inputFile.getAbsolutePath());

		proc.waitFor();
		// Then retrieve the process output
		InputStream in = proc.getInputStream();
		InputStream err = proc.getErrorStream();

		byte b[]=new byte[in.available()];
		in.read(b,0,b.length);

		byte c[]=new byte[err.available()];
		err.read(c,0,c.length);
		return(new String(b));
	}
	
	
	public static void readXMLInfo(Node node) {
	    // do something with the current node instead of System.out
	 //  System.out.println(node.getNodeName());
	   
		// Contains a list of all the required permissions
		List<String> permissionsList=new ArrayList<String>();
		
		// Contains all used intents 
		List<String> intentList=new ArrayList<String>();
		
		String versionCode ="";
		String versionName ="";
		
		// Get version information
	   if(node.getNodeName().toString().equals("manifest")){
		//   System.out.println(node.getAttributes().item(1).getNodeName());
		//   System.out.println(node.getAttributes().item(2));
		   
		   // Loop through all of the possible values 
		   // This is done just in case the order of the items change at all
		   for (int a = 0; a < node.getAttributes().getLength(); a++) {
			   if(node.getAttributes().item(a).getNodeName().equals("android:versionCode")){
				   versionCode=node.getAttributes().item(a).getNodeValue();
			   }
			   if(node.getAttributes().item(a).getNodeName().equals("android:versionName")){
				   versionName=node.getAttributes().item(a).getNodeValue();
			   }
		   }
		   
	   }
	   	   

	    NodeList nodeList = node.getChildNodes();
	    for (int i = 0; i < nodeList.getLength(); i++) {
	        Node currentNode = nodeList.item(i);
	        
	        
	        // Get the number of permissions used in the Application
	        if(currentNode.getNodeName().toString().equals("uses-permission")){
	        //	System.out.println(currentNode.getNodeName());
	        //	System.out.println(currentNode.getChildNodes().getLength());
	       // 	final String permission =currentNode.getAttributes().item(0).toString().replace("\"", "").replace("android:name=android.permission.", ""); 
	    
	        	final String permission =currentNode.getAttributes().item(0).getNodeValue().toString(); 
	        	permissionsList.add(permission);
	        //	System.out.println(permission);
	        //	doSomething(currentNode);
	        }
	        
	        // Get the min sdk version
	        if(currentNode.getNodeName().toString().equals("uses-sdk")){
	        	//System.out.println("hi"); 
	     //   	final String sdk =currentNode.getAttributes().item(0).toString().replace("\"", "").replace("android:minSdkVersion=", ""); 
	        	final String sdk =currentNode.getAttributes().item(0).getNodeValue().toString(); 
	        	System.out.println(sdk);
	        }
	        
	      //  System.out.println(currentNode.getNodeName());
	        // Get Intent Filters
	        // Not working
	        if(currentNode.getNodeName().toString().equals("application")){
	        //	System.out.println("hi"); 
	        //	System.out.println(currentNode.getChildNodes().item(5).getChildNodes().item(1).getNodeName());
	       
	        //	System.out.println(currentNode.getChildNodes().item(5).getChildNodes().item(1).getChildNodes().item(1).getNodeValue());
	        	

	        }
	        
	        
	        // Get Version Info
	        //if(currentNode.getNodeName().toString().equals("manifest")){
		       //	System.out.println("hi"); 
		        //	System.out.println(currentNode.getChildNodes().item(3).getAttributes());
		        	//final String intent =currentNode.getAttributes().item(0).toString().replace("\"", "").replace("android:minSdkVersion=", ""); 
		        	//System.out.println(intent);
		        	//doSomething(currentNode);
		      //  }
	        
	        
	    //    if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
	            //calls this method for all the children which is Element
	        
	       // if(currentNode.getLocalName().toString().equals("Manifest")){
	            //doSomething(currentNode);
	        	
	       // }
	           //System.out.println(currentNode.getLocalName()); // Manifest
	      //      System.out.println(currentNode.getAttributes().getNamedItem("android:versionName"));
	     //   }
	    }

	    
	    
	    	 System.out.println("Version Code:" + versionCode);
		   System.out.println("Version Name:" + versionName);
	   // System.out.println(permissionsList.get(1));
	}

	
	
}
