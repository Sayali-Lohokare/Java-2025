


class Ifelseladder{
	public static void main(String[] args){

		int courseId = 3;

		if(courseId == 1){
			System.out.println("Java Cousr");
			System.out.println("Includes : Java, OS, DSA");
		}else if(courseId == 2){
			System.out.println("Flutter");
			System.out.println("Includes : Dart, Flutter");
		}else if(courseId == 3){
			System.out.println("WebDEv");
			System.out.println("Includes : HTML,CSS,JS");
		}else if(courseId == 4){
			System.out.println("Backend");
			System.out.println("Includes : AdvJava, Spring");

		}else {
			System.out.println("Invaid course");
		}
	}
}
