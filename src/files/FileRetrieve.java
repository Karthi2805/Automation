package files;

import java.io.File;

public class FileRetrieve {

	public static void retrievefile() {
		File oFolder = new File("C:\\KarthiLK\\LK\\KLFileTest");
		String[] fileList = oFolder.list();
		for (String list : fileList) {
			if (list.contains(".txt")) {
				System.out.println(list);

			}
		}
	}

	public static void main(String[] args) {
		retrievefile();

	}

}
