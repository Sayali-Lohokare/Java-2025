











import java.lang.*;
import java.io.*;
class UserInput{
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("enter num1");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("enter num2");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println(num1+num2);
	}
}
