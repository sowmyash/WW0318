import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		String strLine = "";
		String filePath = "/Users/Chukka/Desktop/Java/library/Dictionary";
		FileInputStream fstream = null;
		BufferedReader br = null;

		if (doesFileExists(filePath)) {
			System.out.println(" File Exist!!!");

			

				fstream = new FileInputStream(filePath);
				br = new BufferedReader(new InputStreamReader(fstream));
				while ((strLine = br.readLine()) != null) {
					
					String[] strContents = strLine.split("(?<=[-,])");
					for(String str : strContents ) {
						System.out.println(str.replaceAll("[-,]",""));
					}
				
				}
				} else {
			System.out.println("OOPS, File Does Not Exist!!!");
		}
	}
	
	static boolean doesFileExists(String filePath) {
		File file = new File(filePath);
		boolean exists = file.exists();
		return exists;
	}
	
}