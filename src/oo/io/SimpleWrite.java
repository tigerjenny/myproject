package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleWrite {

	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("data.txt");
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.flush();  				//確保會到檔案內  要記得！！		
			fos.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
