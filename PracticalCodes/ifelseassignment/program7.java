








class CheckDivisibility{
	public static void main(String[] args){

		int x = 10;
		int y = 15;


		if(x%2==0 && x%5==0 && x%10==0){
			System.out.println(x + " is divisible by 2,5 and 10 ");

		}else{

			System.out.println(x + " is not divisible by 2,5 and 10 ");
		}

		if(y%2==0 && y%5==0 && y%10==0){
			
			System.out.println(y + " is divisible by 2,5 and 10 ");
		}else{
			System.out.println(y + " is not divisible by 2,5 and 10 ");
		}

	}
}
