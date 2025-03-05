class Demo{
	public static void main(String[] args){

		byte x = (byte)255;
		System.out.println(x);
	}
}
//if i dont type cast byte then it will consider it as int family, as int value is 2147483647 to - 2147483648, so if I typecast it then it will take value as -128 bcz it is getting wrapped up
