




class SwitchDemo3{
	public static void main(String[] args){

		int x = 65;

		switch (x){

			case 65:
				System.out.println("65");
				break;
			case 'A':
				System.out.println("A");
				break;
			case 66:
				System.out.println("66");
				break;
			case 'B':
				System.out.println("B");
				break;
			default:
				System.out.println("wrong");
		}
	}

}


// error will come as the 65 no and ASCII value of A is also 65 and same follows for B so duplicate case value error will come for pointing A and B
