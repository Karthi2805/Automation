package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWritter {
	
	public static File filecreate(String myfilename) throws IOException {
		File oFileName = new File("C:\\KarthiLK\\LK\\KLFileTest\\"+myfilename +".txt");
		if (oFileName.exists()) {
			System.out.println("File is already exist in the folder");
		}else {
			System.out.println("File is not exist, so created a new file");
			oFileName.createNewFile();
		}
		return oFileName;
	}
	
	public static void fileReaderWritter () throws IOException {
		File oFile = filecreate("KL File ReaderWritter");
		FileWriter oWrite = new FileWriter(oFile);
		oWrite.write("New File Written by code");
		oWrite.write(33);
		oWrite.write("Following comments");
		oWrite.flush();
		oWrite.close();
		
		FileReader oRead = new FileReader(oFile);
		int read = oRead.read();
		while(read!=-1) {
			System.out.print((char)read);
			read = oRead.read();			
		}
		oRead.close();
	}

	public static void main(String[] args) throws IOException {
		//filecreate("KL Test File1");
		fileReaderWritter();
		

	}

}
