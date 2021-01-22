package calendarJAVA;

import java.util.Scanner;

public class Prompt {
	
	 private final static String PROMPT = "cal>";
	 
	 public void runPrompt() {
			Scanner scanner = new Scanner(System.in);
			Calendar cal = new Calendar();
			
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
					cal.printCalendar(month);				
				}
				else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
					cal.printCalendar(month);	
					System.out.println("29 30 31");
				}
				else {
					cal.printCalendar(month);	
					System.out.println("29 30 ");
				}
			}
			System.out.printf("bye~");		
	 }

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
