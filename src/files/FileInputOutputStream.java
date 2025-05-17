package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class FileInputOutputStream {
	
	public static File createFile(String myfilename) throws IOException {
		File oFileName = new File("C:\\KarthiLK\\LK\\KLFileTest\\"+myfilename +".txt");
		if (oFileName.exists()) {
			System.out.println("File is already exist in the folder");
		}else {
			System.out.println("File is not exist, so created a new file");
			oFileName.createNewFile();
		}
		return oFileName;
	}
	
	public static void inputoutputstream() throws IOException {
		File oFile = createFile("KL File Input Output Stream");
		FileOutputStream out = new FileOutputStream(oFile);
		for (int i = 65; i < 98; i++) {
			out.write(i);
		}
		out.flush();
		out.close();
		
		FileInputStream in = new FileInputStream(oFile);
		int read = in.read();
		while(read!=-1) {
			System.out.print((char)read);
			read = in.read();
		}
		in.close();
	}

	public static void main(String[] args) throws IOException {
		//createFile("KL File Input Output Stream");
		inputoutputstream();
		

	}

}
