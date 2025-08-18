package Day3.ScannerDemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRaederDemo {
	public static void main(String args[]) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter the name:  ");
		String name = buffer.readLine();
		
		System.out.println("Enter the age : ");
		int age = Integer.parseInt(buffer.readLine());
		System.out.println(name + +  age);
		
	}

}
