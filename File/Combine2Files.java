// Using FileReader and FileWriter
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Combine2Files {
	public static void main(String[] args) throws IOException {
		String path1 = "File1.txt";
		String path2 = "File2.txt";
		String path3 = "File3.txt";

		try(FileReader fr1 = new FileReader(path1);
			FileReader fr2 = new FileReader(path2);
			FileWriter fw = new FileWriter(path3)) {

			int ch;

			while((ch = fr1.read()) != -1){
				fw.write(ch);
			}

			System.out.println("First file copied");

			while((ch = fr2.read()) != -1){
							fw.write(ch);
						}

			System.out.println("Second file copied");

		}
	}
}








// Using FileInputStream and FileOutputStream
/*
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class Combine2Files{
	public static void main(String[] args) {
		String path1 = "File1.txt";
		String path2 = "File2.txt";
		String path3 = "File3.txt";


		try(FileInputStream fis1 = new FileInputStream(path1);
			FileInputStream fis2 = new FileInputStream(path2);
			FileOutputStream fos = new FileOutputStream(path3)){
			byte[] buffer = new byte[1024];
			int bytesRead;

			while((bytesRead = fis1.read(buffer)) != -1){
				fos.write(buffer, 0, bytesRead);
			}

			System.out.println("First file copied");

			while((bytesRead = fis2.read(buffer)) != -1){
							fos.write(buffer, 0, bytesRead);
						}

			System.out.println("Second file copied");
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
*/