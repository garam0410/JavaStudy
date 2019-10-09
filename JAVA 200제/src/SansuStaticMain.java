
public class SansuStaticMain {

	public final static int MAN = 3;
	public final static int WOMAN = 4;
	
	public static void main(String[] args) {

		int people1 = WOMAN;
		
		switch(people1) {
		
		case 3 : System.out.println("害切");
			break;
		
		case 4 : System.out.println("食切");
			break;
		}
		
		//int SansuStatic.WOMAN = 4;
		
		int people2 = SansuStatic.WOMAN;
		
		switch(people2) {

		case 1 : System.out.println("害切");
			break;
			
		case 2 : System.out.println("食切");
			break;
		}
	}
}
