class IfDemo2{
	public static void main(String[] args){

		int x=10;
		int y=9;

		System.out.println("state1");
		if(--x <= ++y){
			System.out.println("state2");
		}

		System.out.println("state3");
	}
}
