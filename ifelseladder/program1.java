




class Ifelseladder{
	public static void main(String[] args){

		int x=8;
		int y=9;
		int z=17;

		if(x>y && x>z){
			System.out.println(x + " is greater ");
		}else{
			System.out.println(y + " is greater ");
		}
	}


}


// here in if the x condition gets false then it will directly get into else, but if the z value is greater n still the x is false then still we will get y as greater no which is wrong
