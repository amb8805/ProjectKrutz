import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
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
	final String sqliteDBLocation = "";	// location of the SQLDB that the information will be written to
	
	// shut this off in "real" version, it will be read in as an input variable.
	final String inputLocation = "src/testinput/testAPKInput"; 
	
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
	
		// These actions are done in seperate steps to eliminate the possibility of locking or other timing issues
	
		// Create the raw version of the list
		MasterapkList = buildAPKItems(inputLocation);
		
		
		// Gather the necessary apk information from apk object
		gatherAPKInfo(MasterapkList);
		
		
		// Add the contents of the list to the database
		// Permissions/intents will need to be added as needed
		//for (int i = 0; i < MasterapkList.size(); i++){
			
			// First add the permissions and intents to the database
		
		
			// Next actually add the necessary values
		
		
		
		//}
		
		
		/*
		
		// Loop through all of the items just to test
		for (int i = 0; i < MasterapkList.size(); i++){
			
			System.out.println(MasterapkList.get(i).getApkFileName());
			System.out.println(MasterapkList.get(i).getVersionName());
			System.out.println(MasterapkList.get(i).getVersionCode());
			System.out.println(MasterapkList.get(i).getMinsdk());
			System.out.println(MasterapkList.get(i).getPermissionList().size());
			System.out.println(MasterapkList.get(i).getIntentList().size());
			
			for (int z = 0; z <MasterapkList.get(i).getPermissionList().size(); z++){
				System.out.println(MasterapkList.get(i).getPermissionList().get(z));
			}
			
			for (int z = 0; z <MasterapkList.get(i).getIntentList().size(); z++){
				System.out.println(MasterapkList.get(i).getIntentList().get(z));
			}

		}
		*/
		enterDataIntoDB();
	}
	
	
	private void enterDataIntoDB(){
		//System.out.println("enter DB Data");
		
		// Loop through all of the apkItems
	
			Connection c = null;
		    Statement stmt = null;
		    try {
		    	Class.forName("org.sqlite.JDBC");
		      
		    	c = DriverManager.getConnection("jdbc:sqlite:EvolutionOfAndroidApplications.sqlite");
		    	c.setAutoCommit(false);
		   //   System.out.println("Opened database successfully");
	for (int i = 0; i < MasterapkList.size(); i++){
		System.out.println("Insert Info for:" + MasterapkList.get(i).getApkFileName());
		
			// Check to see if the intent exists in the intent table, if not then add it
				
				 for (int a = 0; a < MasterapkList.get(i).getIntentList().size(); a++) {

					// Check to see if the value exists in the table, if not then add it
					 stmt = c.createStatement();
					 String sql1a="SELECT count(IntentName) as countval FROM apkParser_intents where intentName = '" + MasterapkList.get(i).getIntentList().get(a)  + "' ;";
				     
					 ResultSet rs2 = stmt.executeQuery( sql1a );
					// System.out.println("NOT GETTING HERE");
				     // If none are found, then add it
					
					 	int countval = 0;
					    if (rs2.next()) {
					    	countval = rs2.getInt("countval");
					    }
					     // If none are found, then add it
					     if(countval < 1){
					    	 stmt = c.createStatement();
						     String sql = "INSERT INTO apkParser_intents (IntentName) VALUES ('"+MasterapkList.get(i).getIntentList().get(a)+"' );"; 
						     stmt.executeUpdate(sql);  
						     c.commit();
					     }
				  //   stmt.close();
				  //   rs2.close();	
				   
				 
				}
				

								// Next add the permissions
				// Check to see if the intent exists in the intent table, if not then add it
				for (int a = 0; a < MasterapkList.get(i).getPermissionList().size(); a++) {
			
					// Check to see if the value exists in the table, if not then add it
					 stmt = c.createStatement();
				     ResultSet rs = stmt.executeQuery( "SELECT count(privName) as countval FROM apkParser_privs where privName = '" + MasterapkList.get(i).getPermissionList().get(a)  + "' ;" );
				    
				    int countval = 0;
				    if (rs.next()) {
				    	countval = rs.getInt("countval");
				    }
				     // If none are found, then add it
				     if(countval < 1){
				    	// System.out.println("Insert140:" + MasterapkList.get(i).getPermissionList().get(a));
				    	 stmt = c.createStatement();
					     String sql = "INSERT INTO apkParser_privs (privName) VALUES ('"+MasterapkList.get(i).getPermissionList().get(a)+"' );"; 
					     stmt.executeUpdate(sql);  
					     c.commit();
				     }
				     stmt.close();
				     rs.close();	
				}
			
				
				// Get the rowID
				 stmt = c.createStatement();
			     ResultSet rs = stmt.executeQuery( "SELECT rowid  FROM apkInformation where apkid = '" + MasterapkList.get(i).getApkFileName()  + "' ;" );
			     
			     int RowID=0;
			     if (rs.next()) {
			    	 RowID=rs.getInt("rowid");
			     }
			     stmt.close();
			     rs.close();

			     
			 	// Add the necessary information to the join table
			    // This could probably all be written cleaner and simpler, but I wanted to do this step by step to ensure that
			     //		there would be no issues with information getting out of sync.
			     
			
			    // Intents
			    // For all of the intents in the array, get their intentID value to add it to the  join table
			 	for (int a = 0; a < MasterapkList.get(i).getIntentList().size(); a++) {
			 		
				     stmt = c.createStatement();
				     rs = stmt.executeQuery( "SELECT intentID  FROM apkParser_intents where intentName = '" + MasterapkList.get(i).getIntentList().get(a)  + "' ;" );
				    
				     
				     
				     int intentID=0;
				     if (rs.next()) {
				    	 intentID=rs.getInt("intentID");
				     }
				     
				     stmt.close();
				     rs.close();
				     
				     if(intentID > 0){ // Check to make sure an actual value was returned
				    	// System.out.println(intentID);
				    	 // Make sure the combination does not exist in the linking table
				    	 // It shouldn't, but this is just being on the safe side
				    	 stmt = c.createStatement();
				    	 String sql="SELECT count(intentID) as matchcount FROM apkparser_intents_join where intentID = " + intentID  + " and rowID=" + RowID +  ";";
				    	// System.out.println(sql);
				    	 rs = stmt.executeQuery( sql );
					    // int matchingCount=rs.getInt("matchcount");
				    	 int matchingCount=0;
					     if (rs.next()) {
					    	 matchingCount=rs.getInt("matchcount");
					     }
					     stmt.close();
					     rs.close();
					     //System.out.println(matchingCount);
					     
					     // since it doesn't match, it should be added to the table
					     if(matchingCount == 0){
					    	 stmt = c.createStatement();
						     sql = "INSERT INTO apkparser_intents_join (intentID, rowID) VALUES (" + intentID +","+RowID+");"; 
						    
						    // System.out.println(sql);
						     stmt.executeUpdate(sql);  
						     c.commit();
						     stmt.close();
						  //   c.close();
					     }
					          
				     }
				    
			 	}
			 	
			 	// end of intents linking
				  
					     
				   
				     // Permissions
					    // For all of the intents in the array, get their intentID value to add it to the  join table
					 	for (int x = 0; x < MasterapkList.get(i).getPermissionList().size(); x++) {
					 		
						     stmt = c.createStatement();
						     rs = stmt.executeQuery( "SELECT privID  FROM apkParser_privs where privName = '" + MasterapkList.get(i).getPermissionList().get(x)  + "' ;" );
						     
						     int privID=0;
						     if (rs.next()) {
						    	 privID=rs.getInt("privID");
						     }
						     					     
						     stmt.close();
						     rs.close();
						     
						     if(privID > 0){ // Check to make sure an actual value was returned
						    	// System.out.println(privID);
						    	 // Make sure the combination does not exist in the linking table
						    	 // It shouldn't, but this is just being on the safe side
						    	 stmt = c.createStatement();
						    	String sql="SELECT count(privID) as matchcount FROM apkparser_privs_join where privID = " + privID  + " and rowID=" + RowID +  ";";
						    	// System.out.println(sql);
						    	 rs = stmt.executeQuery( sql );
							    
						    	 //matchingCount=rs.getInt("matchcount");
						    	 
						    	 int matchingCount=0;
							     if (rs.next()) {
							    	 matchingCount=rs.getInt("matchcount");
							     }
							     stmt.close();
							     rs.close();
							     //System.out.println(matchingCount);
							     
							     // since it doesn't match, it should be added to the table
							     if(matchingCount == 0){
							    	 stmt = c.createStatement();
								     sql = "INSERT INTO apkparser_privs_join (privID, rowID) VALUES (" + privID +","+RowID+");"; 
								    
								     System.out.println(sql);
								     stmt.executeUpdate(sql);  
								     c.commit();
								     stmt.close();
								  //   c.close();
							     }
							          
							     stmt.close();
							     rs.close();
						     }
						     // end of priv linking
			 		
			 	}
			    
				
				// Next insert the information into the apk tools table
				 stmt = c.createStatement();
				String sql="SELECT count(rowID) as countrowID FROM toolResults where rowid = '" + RowID  + "' ;";
				// System.out.println(sql);
			     rs = stmt.executeQuery( sql );
			   
			     // If none are found, then add it
			     int countrowID=0;
			     if (rs.next()) {
			    	 countrowID=rs.getInt("countrowID");
			     }
			     
			     
			     if(countrowID < 1){
			    	// System.out.println("Insert251:" + RowID);
			    	 stmt = c.createStatement();
				     sql = "INSERT INTO ToolResults (apkID) VALUES ("+RowID+" );"; 
				     System.out.println(sql);
				     stmt.executeUpdate(sql);  
				     c.commit();
			     }
			     stmt.close();
			     rs.close();	
			    
			   
			     // Now insert the basic toolresult values
			     stmt = c.createStatement();
			    // String sql = "INSERT INTO ToolResults (apkID, apkParser_versionCode, apkParser_VersionName, 
			     //apkParser_minsdk) VALUES (" + RowID + ", '"+versionCode+"','"+versionName+"','"+minsdk+"' );"; 
			    
			     sql = "Update toolResults set apkParser_versionCode='"+MasterapkList.get(i).getVersionCode()+"', apkParser_VersionName='"+MasterapkList.get(i).getVersionName()+"', apkParser_minsdk='"+ MasterapkList.get(i).getMinsdk()+"' where rowID=" + RowID;
			    
			     stmt.executeUpdate(sql);  
			     c.commit(); 
	
			//     c.close();
			 //    stmt.close();
			//     rs.close();
			    
				 }
				     
			 
			
//		      stmt.close();
//		      c.close();	
		     
	
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
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
		File path = new File(inputLocation);
		
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
