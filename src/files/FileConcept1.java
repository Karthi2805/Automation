package files;

import java.io.File;
import java.io.IOException;

public class FileConcept1 {

	public static void folderCreation() {
		File oFolder = new File("C:\\KarthiLK\\LK\\KLFileTest");
		if (oFolder.exists()) {
			System.out.println("Folder is already exist in path");
		} else {
			System.out.println("Folderis not exist, so created a folder");
			oFolder.mkdir();
		}
	}
	
	public static File newFileCreation(String filename) throws IOException {
		File oFileName = new File("C:\\KarthiLK\\LK\\KLFileTest\\"+filename +".pdf");
		if (oFileName.exists()) {
			System.out.println("File is already exist in the folder");
		}else {
			System.out.println("File is not exist, so created a new file");
			oFileName.createNewFile();
		}
		return oFileName;
	}

	public static void main(String[] args) throws IOException {
		folderCreation();
		newFileCreation("KL New File");
		

	}

}
