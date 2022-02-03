import java.io.IOException;
import java.io.FileWriter;

public class WhyMethod {
	
	public static void main(String[] args) throws IOException {
	
		System.out.println(twoTimes("A", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
	}

	public static String twoTimes(String text, String delimiter) {
		String out= "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	
	}

}
