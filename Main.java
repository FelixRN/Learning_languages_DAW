import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		String configPath= "C:\\Users\\USUARIO\\Desktop\\book.config";
        String fileValue = loadConfig(configPath);
		System.out.println("file value " + fileValue);
	}

	private static String loadConfig(String configPath) {
    String value = "";
	try {
		Scanner scanner = new Scanner (new File(configPath));

		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			value += line + "\n";
        //value.append(line.append("\n)"));
		}
		scanner.close();
    } catch  (FileNotFoundException e) {
	e.printStackTrace();
	value = "model_type=memory";
}
return value;
}
}