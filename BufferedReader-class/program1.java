












import java.lang.*;
import java.io.*;
class UserInput{
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String name = br.readLine(); // here if u put int data still it will consider it as string n concat it, so always we ahve to typecast it
		System.out.println(name);


	}
}




// if throws is not written exception will come -- unreported exp IOException must be cauth or declared to be thrown
// in BR if u put 18 as input and in code u ahve asked for String then also he will consider as string and paste the no in the answer
