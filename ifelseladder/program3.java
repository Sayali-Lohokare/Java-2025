





class Ifelseladder{
	public static void main(String[] args){

		int x=8;
		int y=9;
		int z=17;


		if(x>y && x>z){
			System.out.println(x + " is greaterr ");
		}else if(y>x && y>z){
			System.out.println(y + " is greater ");
		}else{
			System.out.println(z + " is greater ");
		}
	}
}


// in this code the else if condition of "y>x" is done unnecessarly as we have already checked the "x>y" condition, hence we can skip that condition and still get the same ans
