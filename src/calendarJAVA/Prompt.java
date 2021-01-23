package calendarJAVA;

import java.util.Scanner;

public class Prompt {
	
	 
	 public void runPrompt() {
		 Scanner scanner = new Scanner(System.in);
		 Calendar cal = new Calendar();
			
		 int month =1;
		 int year =1;
		 String weekday;
			
		 while(true) {
			 System.out.println("년도를 입력하세요.");
				System.out.print("YEAR>");
				year = scanner.nextInt();
				System.out.println("월을 입력하세요.");
				System.out.print("MONTH>");
				month = scanner.nextInt();
				System.out.println("첫번째 요일을 입력하세요. (일, 월, 화, 수, 목, 금, 토)");
			    System.out.print("WEEKDAY>");
				weekday = scanner.next();	
				
				
					
				if ( month<1) {
					break;
				}
				else if (month > 13) {
					continue;
				}
				else {
					cal.printCalendar(year,month,weekday);
				}
			}
			System.out.printf("bye~");		
	 }

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
