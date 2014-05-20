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
//	private static String appName="/Users/dan/Documents/workspace/ProjectKrutz/tools/CustomJava/src/testinput/0.txt";

	private List<apkItem>MasterapkList=new ArrayList<apkItem>();
	
	
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
	//	System.out.println("test");
		
		
		// Loop through all the apk files and build the apk objects
		final String intputLocation = "src/testinput/testAPKInput";
	//	System.out.println(buildAPKItems(intputLocation).get(0).getApkFileName());
	//	System.out.println(buildAPKItems(intputLocation).get(0).getApkContents());
		
		
		
		// These actions are done in seperate steps to eliminate the possibility of locking or other timing issues
	
		// Create the raw version of the list
		MasterapkList = buildAPKItems(intputLocation);
		
		
		// Gather the necessary apk information from apk object
		gatherAPKInfo(MasterapkList);
		
		
		// Add the contents of the list to the database
		// Permissions/intents will need to be added as needed
		//for (int i = 0; i < MasterapkList.size(); i++){
			
			// First add the permissions and intents to the database
		
		
			// Next actually add the necessary values
		
		
		
		//}
		
		
		
		
		// Loop through all of the items just to test
		for (int i = 0; i < MasterapkList.size(); i++){
			System.out.println(MasterapkList.get(i).getApkFileName());
			System.out.println(MasterapkList.get(i).getVersionName());
			System.out.println(MasterapkList.get(i).getVersionCode());
			System.out.println(MasterapkList.get(i).getMinsdk());
			System.out.println(MasterapkList.get(i).getPermissionList().size());
		}
		
		
		
		
	}
	
	
	// Modify the contents of the object to create the necessary information for output
	// ? Might be a good idea to refactor this to take place directly in the apkItem object
	private void gatherAPKInfo(List<apkItem>apkList) throws ParserConfigurationException, SAXException, IOException, InterruptedException{

		// Loop through objects in the list
		for (int i = 0; i < apkList.size(); i++){
			apkList.get(i).parseXMLInfo();
		}

	}
	
	
	
	// Add a check to ensure that some input files exist
	// errors could occur later on if this is not done
	private List<apkItem> buildAPKItems(String inputLocation) throws IOException, InterruptedException{
		List<apkItem>apkList=new ArrayList<apkItem>();
		
		// loop through all of the apk files in the input directory
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
						//	System.out.println(files[i].getName());
							apkList.add(new apkItem(files[i].getName(),RunAPKParser(files[i])));
						}
		        	}
		        }
		

		return apkList;
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
	
	

	
}
