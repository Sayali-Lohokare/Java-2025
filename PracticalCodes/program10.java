






class OperatorsExample{
	public static void main(String[] args){

		int a = 10;
		int b =20;

		boolean x = true;
		boolean y = false;


		System.out.println("Arithmetic Operators :");
		System.out.println("a+b = " + (a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a/b = " + (a/b));
		System.out.println("a%b = " + (a%b));


		System.out.println("Relational Operators:");
		System.out.println("a==b = " + (a==b));
		System.out.println("a>b = " + (a>b));
		System.out.println("a<=b =" + (a<=b));
		

		System.out.println("Logical Operators: ");
		System.out.println("x && y: " + (x&&y));
		System.out.println("x || y: " + (x||y));
		System.out.println("!x: " + (!x));


		System.out.println("Bitwise Operators: ");
		System.out.println("a&b: " + (a&b));
		System.out.println("a|b: " + (a|b));
		System.out.println("a^b: " + (a^b));
		System.out.println("~a: " + (~a));


		System.out.println("Assignment Operators:");
		a += 10;
		System.out.println("a += 10: " + a);
		b *= 2;
		System.out.println("b *= 2: " + b);
	} 


}

