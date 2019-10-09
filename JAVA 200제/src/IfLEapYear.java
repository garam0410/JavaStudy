
public class IfLEapYear {

	public static void main(String[] args) {
		
		for(int year = 1998; year < 2006; year++) {
			
			boolean yearTF = false;
			
			if(0 == (year % 4) && 0 != (year % 100) || 0 == year % 400) {
				yearTF = true;
			}
			
			else
				yearTF = false;
			
			if(yearTF)
				System.out.println(year + "´Â À±³âÀÔ´Ï´Ù.");
			
			else
				System.out.println(year + "´Â À±³âÀÌ ¾Æ´Õ´Ï´Ù.");
		}
	}
}
