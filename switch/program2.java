




class SwitchDemo{
	public static void main(String[] args){

		int x = 3;

		switch(x){

			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				System.out.println("invalid no");
		}
	}
}


// in this code if we remove break then when the comdition gets satisfied still teh rest code gets print, so to avoid that break is used and as we use "else" for exception condition here we have default for exception
