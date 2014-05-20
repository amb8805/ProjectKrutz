import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
//import java.lang XMLReader;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
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
		testXMLReader();
	}
	
	
	private void testXMLReader() throws IOException, ParserConfigurationException, SAXException{

		
	//	File fXmlFile = new File("src/testinput/0.txt");
		
//		System.out.println(u.readDoc(xmlFile.getAbsolutePath()));
	
		
		File fXmlFile = new File("src/testinput/0.txt");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
	 
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();
	 
		
		// *********
		
		
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
	            .newInstance();
	    DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	    Document document = docBuilder.parse(fXmlFile);

	    NodeList nodeList = document.getElementsByTagName("*");
	    for (int i = 0; i < nodeList.getLength(); i++) {
	        Node node = nodeList.item(i);
	        if (node.getNodeType() == Node.ELEMENT_NODE) {
	            // do something with the current element
	            System.out.println(node.getNodeName());
	            System.out.println(node.getNextSibling().getTextContent());
	        }
	    }
		
		
		
		
		// ********
		
		
		
		/*
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		System.out.println("Root element :" + doc.getDocumentElement().getChildNodes());
	 
		NodeList nList = doc.getElementsByTagName("intent-filter");
		System.out.println("Version:" + doc.getElementsByTagName("action android:name"));
		System.out.println("----------------------------");
	 
		
		
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
	 
			Node nNode = nList.item(temp);
	 
		//	System.out.println("\nCurrent Element :" + nNode.getNodeName());
		//	System.out.println("\nCurrent Element :" + nNode.getNodeName());
			
//			android:versionCode
			
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
		//		System.out.println("Staff id : " + eElement.getAttribute("action android:name"));
				
				System.out.println("Staff id : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
	
			}
			
		}
	   
		*/
		
		
	}
	
	
	
	
	
	
	// Change this to get the xml from a particular .apk file
	// 
	
	// Loop through all of the files in the target directory
	
	
	// This will find all of the target apk files, run apkanalyzer on them, and store the information in the SQLiteDB
	private void findAPKInformation() throws IOException, InterruptedException{
		
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
						//	System.out.println(files[i]);
						//	System.out.println("Extension:" + extension);
							parseAPK(RunAPKParser(files[i]));
						}
		        	}
		        }
		    		
	}
	
	// parse the xml information and place it into the database
	private void parseAPK(String xmlInfo){
		System.out.println(xmlInfo);
	}
	
	
	
	
	// Analyze the target .apk file and return its generated XML information
	private String RunAPKParser(File inputFile) throws IOException, InterruptedException{
	
		
//		System.out.println(inputFile.getAbsolutePath());
//		System.exit(0);
	
		//Runtime.getRuntime().exec("java -jar ./apkparser/APKParser.jar");
	//System.out.println(inputFile.getAbsolutePath());

		//    Process proc = Runtime.getRuntime().exec("java -jar src/apkparser/APKParser.jar " + inputFile);
	    //	Process proc = Runtime.getRuntime().exec("java -jar src/apkparser/APKParser.jar src/testinput/testAPKInput/Twitter.apk");
//		Process proc = Runtime.getRuntime().exec("java -jar src/apkparser/APKParser.jar /Users/dan/Documents/workspace/ProjectKrutz/tools/CustomJava/src/testinput/testAPKInput/Twitter.apk");
		Process proc = Runtime.getRuntime().exec("java -jar src/apkparser/APKParser.jar " + inputFile.getAbsolutePath());

		proc.waitFor();
		// Then retrieve the process output
		InputStream in = proc.getInputStream();
		InputStream err = proc.getErrorStream();

		byte b[]=new byte[in.available()];
		in.read(b,0,b.length);
		//System.out.println(new String(b));

		byte c[]=new byte[err.available()];
		err.read(c,0,c.length);
	//	System.out.println(new String(c));
		//return(new String(c));
		return(new String(b));
	}
	
	
	
}
