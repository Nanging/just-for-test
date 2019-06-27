package sTest;

public class Calendar {
	public static void calendar(int year,int month,int day) {
		System.out.print("输入:"+ year + " " + month + " " + day + "  输出:");
		if(year < 1000 || year > 2519) {
			System.out.println("年的范围是1000-2519年");
			return;
		}
		if(month <= 0 || month > 12) {
			System.out.println("月的范围是1-12月");
			return;
		}
		if(day <= 0 || day > 31) {
			System.out.println("日的范围是1-31日");
			return;
		}
		if((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))&& month == 2) {   //闰年
			if(day > 29)System.out.println(year + "年" + month + "月没有" + day + "日" );
			else if(day == 29)System.out.println(year+ " 3 1");
			else System.out.println(year + " 2 " + (day+1));
			return;
		}
		if(month == 12 && day == 31) {
			System.out.println((year+1) + " 1 1");
			return;
		}
		if(month == 2) {
			if(day > 28)System.out.println(year + "年" + month + "月没有" + day + "日" );
			else if(day == 28)System.out.println(year+ " 3 1");
			else System.out.println(year + " 2 " + (day+1));
			return;
		}
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if(day == 31)System.out.println(year+ " "+ (month+1)+" 1");
			else System.out.println(year + " "+ month + " " + (day+1));
			return;
		}
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day == 31)System.out.println(year + "年" + month + "月没有31日" );
			else if(day == 30)System.out.println(year+ " "+ (month+1)+" 1");
			else System.out.println(year + " "+ month + " " + (day+1));
		}
	}
}
