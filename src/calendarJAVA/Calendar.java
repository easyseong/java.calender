package calendarJAVA;


public class Calendar {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}public int LEAPmaxDaysOfMonth(int month) {
		return LEAP_MAX_DAYS[month-1];
	}
	
//	
//	System.out.println(" 1  2  3  4  5  6  7");
//	System.out.println(" 8  9 10 11 12 13 14");
//	System.out.println("15 16 17 18 19 20 21");
//	System.out.println("22 23 24 25 26 27 28");
	
	public void printCalendar(int year,int month, String weekday) {
		
		System.out.printf("        %d년 %d월        \n ",year,month);
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("------------------------");
		
		int maxDay;
		int i=1;
		int count;
		if(year%4==0 && (year%400 != 0)) {
			maxDay = LEAPmaxDaysOfMonth(month);
		} else {
			maxDay = maxDaysOfMonth(month);
		}
		
		switch (weekday) {
		case "월":
			System.out.print("    ");
			count = 1;
			for(i=1;i<= maxDay;i++) {
				System.out.printf("%4d ",i);
				count++;
				if(count%7==0) {
					System.out.println();
				}
			}
			break;
		case "화":
			System.out.print("      ");
			count = 2;
			for(i=1;i<= maxDay;i++) {
				System.out.printf("%2d ",i);
				count++;
				if(count%7==0) {
					System.out.println();
				}
			}
			break;
		case "수":
			System.out.print("         ");
			count = 3;
			for(i=1;i<= maxDay;i++) {
				System.out.printf("%2d ",i);
				count++;
				if(count%7==0) {
					System.out.println();
				}
			}
			break;
		case "목":
			System.out.print("              ");
			count =4;
			for(i=1;i<= maxDay;i++) {
				System.out.printf("%2d ",i);
				count++;
				if(count%7==0) {
					System.out.println();
				}
			}
			break;
		case "금":
			System.out.print("                 ");
			count = 5;
			for(i=1;i<= maxDay;i++) {
				System.out.printf("%2d ",i);
				count++;
				if(count%7==0) {
					System.out.println();
				}
			}
			break;
		case "토":
			System.out.print("                     ");
			count = 6;
			for(i=1;i<= maxDay;i++) {
				System.out.printf("%3d",i);
				count++;
				if(count%7==0) {
					System.out.println();
				}
			}
			break;
			
		}
		

		System.out.println();
		}
		
}	

//for(count=1;count<=7;count++);
//if(count%7==0) {
//	System.out.println();
//}
