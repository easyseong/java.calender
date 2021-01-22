package calendarJAVA;
import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public void printBasicCalendar(int month) {
		System.out.printf("         %d월        \n ",month);
		System.out.println("---------------------");
		System.out.println("일  월  화  수  목  금 토");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		
		//System.out.println("22 23 24 25 26 27 28");
			
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		//printBasicCalendar basic = new printBasicCalendar();
		
		int month =1;
		
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();		
				
			if ( month<1) {
				break;
			}
			else if (month > 13) {
				continue;
			}
			else if (month == 2) {
				cal.printBasicCalendar(month);				
			}
			else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				cal.printBasicCalendar(month);	
				System.out.println("29 30 31");
			}
			else {
				cal.printBasicCalendar(month);	
				System.out.println("29 30 ");
			}
		}
		System.out.printf("bye~");
		
			
			
	
		
		
	}

}
