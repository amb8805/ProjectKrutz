import java.io.IOException;
import java.lang XMLReader;


// Application will parse the .xml file returned from apkparser. Will then input into the sqliteDB
// Usage: apkParserMain <input.apk>


// 1) Run APK Parser command on the .apk file
// 2) Input the information into the SQLiteDB

public class apkparserMain {
	util u = new util();
	
	//Name of the application being examined 
	private static String appName="/Users/dan/Documents/workspace/ProjectKrutz/tools/CustomJava/src/testinput/0.txt";

	public static void main(String[] args) throws IOException {
		
		//if(args.length!=1){
		//	System.out.println("A single argument with the application name was expected");
		//}else{
		//	appName = args[0];
			apkparserMain ap = new apkparserMain();
			ap.Run();		
		//}
	}
	
	
	public void Run() throws IOException{
		//System.out.println(u.readDoc(appName));

	}

}
