import java.io.FileReader;

//janes changes!!
public class EightBall {
	public static void main(String args[]) throws Exception {
		char[] buffer = new char[1024];
		String filename = args[0];
		try {
			filename = "" + (Integer.parseInt(filename) % 3);
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}
		new FileReader(filename).read(buffer);
		System.out.println(buffer);
		
		// Adding this to test query:
		if(filename.length() >= 10 && filename.length() <= 19) {
		} else if(filename.length() >= 20) {
			System.out.println("File name is 20 characters or longer.");
		} else {
			System.out.println("File name is less than 10 characters.");
		}
	}
}
