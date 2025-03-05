class IfElse2{
	public static void main(String[] args){

		boolean x=false;
		boolean y=true;

		System.out.println("start");

		if(x=y){
			System.out.println("in if");
		}else{
			System.out.println("in else");
		}
		System.out.println("end");
	}

}


//here the ans is start, in if, end bcz the condition is satistfiying boolean value which means x=y, means true = true
