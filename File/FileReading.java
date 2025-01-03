import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReading{
	public static void main(String[] args) {
		String path = "File.txt";
		int n = 10;

		File file = new File(path);

		if(file.exists()){
			System.out.println("File Name: " + file.getName());
			System.out.println("File Size: " + file.length() + " bytes");
			try(FileInputStream fis = new FileInputStream(file)){
				byte[] buffer = new byte[n];
				int bytesRead = fis.read(buffer, 0, n);

				if(bytesRead != -1){
					System.out.println("First " + bytesRead + " bytes of the file: ");
					for(int i=0;i<bytesRead; i++){
						System.out.print((char)buffer[i]);
					}
					System.out.println();
				}
				else {
					System.out.println("File is empty");
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		} else {
			System.out.println("File does not exists");
		}
	}
}