import java.io.FileWriter;
import java.io.IOException;

public class appendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter input = new FileWriter("/home/kholiaketan2gma/Desktop/Assignment3/assign3.txt", true);
					input.write("\n This data is appended");
			System.out.println("Assignment to append text to a file Complete");
			input.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
