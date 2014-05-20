import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

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

// This class will hold all of the apk information
// A class is created since there may be timing issues between the reading from an apk file and writing to the DB.

public class apkItem {

	private String apkFileName;
	private String apkContents;
	private String versionCode;
	private String versionName;
	private String minsdk;
	private ArrayList<String>permissionList=new ArrayList<String>(); 
	private ArrayList<String>intentList=new ArrayList<String>(); 
	
	public apkItem(String apkFileName, String apkContents) {
		this.apkFileName = apkFileName;
		this.apkContents = apkContents;
	}	
	
	public String getApkFileName() {
		return apkFileName;
	}
	
	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
	}
	
	public String getApkContents() {
		return apkContents;
	}
	
	public void setApkContents(String apkContents) {
		this.apkContents = apkContents;
	}
	
	public String getVersionCode() {
		return versionCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public String getMinsdk() {
		return minsdk;
	}

	public ArrayList<String> getPermissionList() {
		return permissionList;
	}

	public ArrayList<String> getIntentList() {
		return intentList;
	}
	
	public void parseXMLInfo() throws ParserConfigurationException, SAXException, IOException, InterruptedException{	
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

		
	//	System.out.println(findAPKInformation().toString());
		
		Document doc = docBuilder.parse(new InputSource(new StringReader(apkContents)));
		readXMLInfo(doc.getDocumentElement());
		
		//System.out.println(findAPKInformation());
	}

	
	public void readXMLInfo(Node node) {

		
		// Get version information
	   if(node.getNodeName().toString().equals("manifest")){
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
	     
	        	final String permission =currentNode.getAttributes().item(0).getNodeValue().toString(); 
	        	permissionList.add(permission);
	        //	doSomething(currentNode);
	        }
	        
	        // Get the min sdk version
	        if(currentNode.getNodeName().toString().equals("uses-sdk")){
	        	final String sdk =currentNode.getAttributes().item(0).getNodeValue().toString(); 
	        	//System.out.println("MinSDK: " + sdk);
	        	minsdk = sdk;
	        }
	        
	      //  System.out.println(currentNode.getNodeName());
	        // Get Intent Filters
	        // Not working
	        if(currentNode.getNodeName().toString().equals("application")){
	        //	System.out.println("hi"); 
	        //	System.out.println(currentNode.getChildNodes().item(5).getChildNodes().item(1).getNodeName());
	       
	        //	System.out.println(currentNode.getChildNodes().item(5).getChildNodes().item(1).getChildNodes().item(1).getNodeValue());

	        }
 
	    }

	}

	
	
	
	
}
