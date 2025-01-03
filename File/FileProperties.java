import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

class FileProperties{
	public static void main(String[] args){
		String file_path = "File.txt";
		File file = new File(file_path);

		if(file.exists()){
			System.out.println("File name: " + file.getName());
			System.out.println("File size: " + file.length() + " bytes");
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Canonical Path: " + getCanonicalPath(file));
			System.out.println("Parent directory: " + file.getParent());
			System.out.println("File name: " + file.getName());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Writable: " + file.canWrite());
			System.out.println("Executable: " + file.canExecute());
			System.out.println("Is file: " + file.isFile());
			System.out.println("Is directory: " + file.isDirectory());
			System.out.println("Is hidden: " + file.isHidden());
			System.out.println("Last modified: " + formatDate(file.lastModified()));
		}
		else {
			System.out.println("File not exists..");
		}
	}

	private static String getCanonicalPath(File file){
		try{
			return file.getCanonicalPath();
		} catch(IOException e){
			e.printStackTrace();
			return null;
		}
	}

	private static String formatDate(long milliseconds){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		return sdf.format(milliseconds);
	}
}