import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading_FileReader_class {
	public static void main(String[] args) {
		// character count
		int n = 10;
		String path = "File.txt";
		File file = new File(path);
		System.out.println("File name: " + file.getName());
		System.out.println("File size " + file.length() + " bytes");

		System.out.println("File Content: (" +  n + " bytes)");

		try(FileReader fr = new FileReader(path)){
			int ch;
			while((ch = fr.read()) != -1 && n != 0){
				n--;
				System.out.print((char)ch);
			}
			System.out.println();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}








// File reader with buffer
/*
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReading_FileReader_class{
	public static void main(String[] args) throws IOException {
		String path = "File.txt";
		try(FileReader file = new FileReader(path)){
			try(BufferedReader br = new BufferedReader(file)) {
						String line;
						while((line = br.readLine()) != null){
							System.out.println(line);
						}
					} catch (IOException e) {
						e.printStackTrace();
			}
		}
		catch(IOException e){
			e.printStackTrace();

		}

	}
}
*/