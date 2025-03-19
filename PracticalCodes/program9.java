








class OperatorsDemo{

	public static void main(String[] args){

		int x = 10;
		int y = 60;

		int sumResult = x+y;
		boolean isGreater = x>y;
		boolean logicalResult = (x>0) && (y>0);
		x +=5;
		int bitwiseAnd =  x & y;

		System.out.println("Sum :" + sumResult);
		System.out.println("Is Greater :" + isGreater);
		System.out.println("Logical Result :" + logicalResult);
		System.out.println("Update X using Arithmetic Operator :" + x);
		System.out.println("Bitwise AND Result :" + bitwiseAnd);
 

	}
}
