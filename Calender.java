package dailycalender;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calender {
	Scanner sc=new Scanner(System.in);
		String leap;
		int odddays;
		String dayFromNo;
		DateFormat dateFormat2=new SimpleDateFormat("MM-dd-yyyy");
		String date1=dateFormat2.format(new Date());
		String[]values=date1.split("-");
		int day1=Integer.parseInt(values[1]);
		int month1=Integer.parseInt(values[0]);
		int year1=Integer.parseInt(values[2]);
		int date=1;
		int month=month1;
		int year=year1;
		int day2=day1;

		
		String k;
		public String dayFromNo(int odddays) {
			if(odddays==0) {
				k="Sunday";
			}
			else if(odddays==1) {
				k="Monday";
			}
			else if(odddays==2) {
				k="Tuesday";
			}
			else if(odddays==3) {
				k="Wednesday";
			}
			else if(odddays==4) {
				k="Thursday";
			}
			else if(odddays==5) {
				k="Friday";
			}
			else if(odddays==6) {
				k="Saturday";
			}
			return k;
		}
		
		int l=0;
		public  int odddays(int date,int month,int year) {

			if(year%400==0) {
				l=1;
			    }
			else if(year%100==0) {
				l=0;
				}
			else if(year%4==0) {
				l=1;
				}
			else {
				l=0;
				}
			int count=0;
			int []mon= {0,31,28,31,30,31,30,31,31,30,31,30,31};
			for(int i=0;i<=mon.length;i++) {
				if(l==1) {
					//System.out.println("l="+l);
					mon[2]=29;
				}
				if(i<=month-1) {
				count=count+mon[i];
				}
			}	
			year=year%400;
			year=year-1;	
			int lpodd=(year/4)*2;
			int noodd=year-(year/4);
			int totaldays =lpodd+noodd+count+date;
			int totalodddays=totaldays%7;
			System.out.println("totalodddays"+totalodddays);
			return totalodddays;
		}
		public  void display(int month,int year,int date) {
			int t=odddays(date,month,year);
			System.out.println("total="+t);
			String []month3= {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
			for(int i=0;i<month3.length;i++) {
				if(month-1==i) {
					System.out.println("\t******* "+month3[i]+" "+year+" "+" ********");
				}
			}
			int t1=0, l1=0;
			if(year%400==0) {
				l1=1;
			    }
			else if(year%100==0) {
				l1=0;
				}
			else if(year%4==0) {
				l1=1;
				}
			else {
				l1=0;
				}
			int []mon= {31,28,31,30,31,30,31,31,30,31,30,31};
			for(int i=0;i<mon.length;i++) {
				if(l1==1) {
					mon[1]=29;
				}
				if(month-1==i) {
					t1=mon[i];
				}
			}
			String [] s={"sun","mon","tue","wed","thu","fri","sat"};
			int k=1;
			for(int i=0;i<s.length;i++) {
				System.out.print(s[i]+"\t");
			}
			System.out.println();
			for(int i=0;i<6;i++) {
				for(int j=0;j<7;j++) {
					if(i==0 && j==t) {
						System.out.print(k+"\t");
						if(k==day2 && month==month1 && year==year1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
						k++;
					}
					else if(k>1 &&k<=t1) {
						System.out.print(k+"\t");
						k++;
						if(k==day2 && month==month1 && year==year1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else {
						System.out.print("\t ");
					}		
				}
				System.out.println();
			}
		}
		public void previousmonth() {
			//int date=0;
			//System.out.println("month"+month);
			month=month-1;
			if(month==0) {
				month=12;year--;
			}
			else if(month==13){
				month=1;
			}
			System.out.println("previousmonth="+month);
			display(month,year,date);
		}	
		public void nextmonth() {
			//int date=0;
			month=month+1;
			int year2=year;
			System.out.println(month);
			if(month==13) {
				month=1;
				year=year+1;
				}
			else if(month==0){
				month=12;
			}
			System.out.println("nextmonth="+month);
			display(month,year,date);	
		}
		public void presentmonth() {
			//int date=0;
			// TODO Auto-generated method stub
			month=month1;
			year=year1;
			display(month,year,date);	
		}	
		public String getTodayDay() {
			System.out.println("Enter your date");
			int date3=sc.nextInt();
			int date4=date3+4;
			System.out.println("Enter your month");
			int month3=sc.nextInt();
			System.out.println("enter your year");
			int year3=sc.nextInt();
			int dy=odddays(date4,month3,year3);
			String dy1=dayFromNo(dy);
			System.out.println(date3+":"+month3+":"+year3);
			System.out.println(dy1);
			return dy1;
		}
	}