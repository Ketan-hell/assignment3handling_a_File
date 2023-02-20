import java.io.*;
public class writeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter input = new FileWriter("/home/kholiaketan2gma/Desktop/Assignment3/assign3.txt");
			input.write("Congratulation ! Assignment 3 Completed Successfully");
	System.out.println("Assignment Complete");
	input.close();
}
catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
