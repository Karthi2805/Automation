package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWritter {
	
	public static File filecreation(String myfilename) throws IOException {
		File oFileName = new File("C:\\KarthiLK\\LK\\KLFileTest\\"+myfilename +".txt");
		if (oFileName.exists()) {
			System.out.println("File is already exist in the folder");
		}else {
			System.out.println("File is not exist, so created a new file");
			oFileName.createNewFile();
		}
		return oFileName;
	}
	public static void bufferedReaderWritter () throws IOException {
		File oFile = filecreation("KL Buffered File");
		FileWriter oWrite = new FileWriter(oFile);
		BufferedWriter oBWrite = new BufferedWriter(oWrite);
		oBWrite.write("This is the first line of buffer comments");
		oBWrite.newLine();
		oBWrite.write("Next line comments");
		oBWrite.flush();
		oBWrite.close();
		
		FileReader oRead = new FileReader(oFile);
		BufferedReader oBRead = new BufferedReader(oRead);
		String readLine = oBRead.readLine();
		while (readLine!=null) {
			System.out.println(readLine);
			readLine = oBRead.readLine();
		}
		oBRead.close();
	}
	
	public static void printWritter () throws IOException {
		File oFile = filecreation("KL PrintWritter");
		PrintWriter oWrite = new PrintWriter(oFile);
		oWrite.println("Karthi");
		oWrite.println(true);
		oWrite.println(33);
		oWrite.println(80.5);
		oWrite.flush();
		oWrite.close();
	}
		

	public static void main(String[] args) throws Exception {
		//bufferedReaderWritter();
		printWritter();
	}

}
