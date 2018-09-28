package dailycalender;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Calender c=new Calender();
		//c.getTodayDay();
		//c.previousmonth();
		System.out.println("1 for present month");
		System.out.println("2 for next month");
		System.out.println("3 for last month");
		System.out.println("4 for get present day");
		System.out.println("5 for exit");
		System.out.println();
		int ch;
		
		System.out.println("enter your option");
		ch=sc.nextInt();
        while(ch!=5) {
		switch (ch) {
		case 2:{
			c.nextmonth();
			System.out.println();
			System.out.println("enter your option");
			ch=sc.nextInt();
			break;
		}
		case 3 :{
			c.previousmonth();
			System.out.println();
			System.out.println("enter your option");
			ch=sc.nextInt();
			break;
		}
		case 1:{
			
			c.presentmonth();
			System.out.println();
			System.out.println("enter your option");
			ch=sc.nextInt();
			break;
		}
		case 4:{
			c.getTodayDay();
			System.out.println();
			System.out.println("enter your option");
			ch=sc.nextInt();
			break;
		}
		}
		
		}
        }
	}


