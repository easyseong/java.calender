package calendarJAVA;

import java.util.Scanner;

public class Prompt {
	
	 private final static String PROMPT = "cal>";
	 
	 public void runPrompt() {
			Scanner scanner = new Scanner(System.in);
			Calendar cal = new Calendar();
			
			int month =1;
			int year =1;
			
			while(true) {
				System.out.println("년을 입력하세요.");
				System.out.print(PROMPT);
				year = scanner.nextInt();
				System.out.println("월을 입력하세요.");
				System.out.print(PROMPT);
				month = scanner.nextInt();	
					
				if ( month<1) {
					break;
				}
				else if (month > 13) {
					continue;
				}
				else {
					cal.printCalendar(year,month);
				}
			}
			System.out.printf("bye~");		
	 }

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
