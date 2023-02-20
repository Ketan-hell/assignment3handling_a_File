import java.io.*;
public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] data = new char[100];
try {
	FileReader output = new FileReader("/home/kholiaketan2gma/Desktop/Assignment3/assign3.txt");
	output.read(data);
	System.out.println("Data recieved from file : \n");
	System.out.println(data);
	output.close();
}
catch(IOException e) {
	e.printStackTrace();
}
	}

}
