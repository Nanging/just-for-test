package sTest;

import java.util.ArrayList;

public class sTest {
	
	public static void triangletest() {
		Triangle.triangle(0, 500, 499);
		Triangle.triangle(2, 500, 500);
		Triangle.triangle(500, 500, 500);
		Triangle.triangle(999, 499, 501);
		Triangle.triangle(1000, 500, 501);
		Triangle.triangle(500, 1, 500);
		Triangle.triangle(500, 2, 502);
		Triangle.triangle(502, 999, 501);
		Triangle.triangle(500, 1000, 500);
		Triangle.triangle(500, 500, -1);
		Triangle.triangle(500, 501, 2);
		Triangle.triangle(500, 502, 999);
		Triangle.triangle(502, 502, 1001);
	}
	public static void triangletest2() {
		Triangle.triangle(1, 2, 3);
		Triangle.triangle(2, 3, 4);
		Triangle.triangle(3, 3, 4);
		Triangle.triangle(4, 4, 4);
		Triangle.triangle(-1, 2, 3);
		Triangle.triangle(-2, -3, -4);
		Triangle.triangle(-4, -4, -3);
		Triangle.triangle(-4, -4, -4);
		Triangle.triangle(999, 1000, 2001);
		Triangle.triangle(999, 1000, 1001);
		Triangle.triangle(1001, 1001, 1002);
		Triangle.triangle(1002, 1002, 1002);
	}
	public static void calendartest() {
		Calendar.calendar(1000, 5, 15);
		Calendar.calendar(1001, 6, 15);
		Calendar.calendar(1800, 6, 16);
		Calendar.calendar(2518, 6, 14);
		Calendar.calendar(2520, 5, 16);
		Calendar.calendar(1800, 1, 15);
		Calendar.calendar(1800, 2, 16);
		Calendar.calendar(1801, 11, 14);
		Calendar.calendar(1801, 12, 15);
		Calendar.calendar(1802, 5, 1);
		Calendar.calendar(1802, 6, 2);
		Calendar.calendar(1801, 6, 30);
		Calendar.calendar(1801, 6, 31);
//		System.out.println();
		Calendar.calendar(1800, 2, 29);
		Calendar.calendar(1600, 2, 29);
		Calendar.calendar(1999, 12, 31);
	}
	public static void calendartest2() {
		Calendar.calendar(2019, 1, 15);
		Calendar.calendar(2019, 3, 28);
		Calendar.calendar(2019, 5, 29);
		Calendar.calendar(2019, 7, 30);
		Calendar.calendar(2019, 8, 31);
		Calendar.calendar(2019, 4, 16);
		Calendar.calendar(2019, 6, 28);
		Calendar.calendar(2019, 9, 29);
		Calendar.calendar(2019, 11, 30);
		Calendar.calendar(2019, 6, 31);
		Calendar.calendar(2019, 2, 15);
		Calendar.calendar(2019, 2, 28);
		Calendar.calendar(2019, 2, 29);
		Calendar.calendar(2019, 2, 30);
		Calendar.calendar(2019, 2, 31);
		Calendar.calendar(2019, 12, 14);
		Calendar.calendar(2019, 12, 28);
		Calendar.calendar(2019, 12, 29);
		Calendar.calendar(2019, 12, 30);
		Calendar.calendar(2019, 12, 31);
		Calendar.calendar(2020, 1, 15);
		Calendar.calendar(2020, 3, 28);
		Calendar.calendar(2020, 5, 29);
		Calendar.calendar(2020, 7, 30);
		Calendar.calendar(2020, 8, 31);
		Calendar.calendar(2020, 4, 13);
		Calendar.calendar(2020, 6,28);
		Calendar.calendar(2020, 9, 29);
		Calendar.calendar(2020, 11, 30);
		Calendar.calendar(2020, 9, 31);
		Calendar.calendar(2020, 2, 11);
		Calendar.calendar(2020, 2, 28);
		Calendar.calendar(2020, 2, 29);
		Calendar.calendar(2020, 2, 30);
		Calendar.calendar(2020, 2, 31);
		Calendar.calendar(2020, 12, 19);
		Calendar.calendar(2020, 12, 28);
		Calendar.calendar(2020, 12, 29);
		Calendar.calendar(2020, 12, 30);
		Calendar.calendar(2020, 12, 31);
	}
	public static void calendartest7() {
		Calendar.calendar(2019, 6, 15);
		Calendar.calendar(2020, 2, 28);
		Calendar.calendar(2019, 2, 28);
		Calendar.calendar(2019, 4, 28);
		Calendar.calendar(2020, 2, 29);
		Calendar.calendar(2020, 7, 29);
		Calendar.calendar(2019, 2, 29);
		Calendar.calendar(2019, 5, 29);
		Calendar.calendar(2019, 2, 30);
		Calendar.calendar(2019, 4, 30);
		Calendar.calendar(2019, 5, 30);
		Calendar.calendar(2019, 2, 31);
		Calendar.calendar(2019, 1, 31);
		Calendar.calendar(2019, 12, 31);
	}
	
	public static void saletest() {
		ArrayList<Sale> case01 = new ArrayList<>();
		case01.add(new Sale(1, 40, 45));
		case01.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case01);
		System.out.println("----------------------------");
		ArrayList<Sale> case02 = new ArrayList<>();
		case02.add(new Sale(70, 40, 45));
		case02.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case02);
		System.out.println("----------------------------");
		ArrayList<Sale> case03 = new ArrayList<>();
		case03.add(new Sale(35, 40, 45));
		case03.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case03);
		System.out.println("----------------------------");
		ArrayList<Sale> case04 = new ArrayList<>();
		case04.add(new Sale(5, 40, 45));
		case04.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case04);
		System.out.println("----------------------------");
		ArrayList<Sale> case05 = new ArrayList<>();
		case05.add(new Sale(65, 40, 45));
		case05.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case05);
		System.out.println("----------------------------");
		ArrayList<Sale> case06 = new ArrayList<>();
		case06.add(new Sale(0, 45, 45));
		case06.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case06);	
		System.out.println("----------------------------");
		ArrayList<Sale> case07 = new ArrayList<>();
		case07.add(new Sale(71, 45, 45));
		case07.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case07);
		System.out.println("----------------------------");
		
		ArrayList<Sale> case11 = new ArrayList<>();
		case11.add(new Sale(35, 1, 45));
		case11.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case11);
		System.out.println("----------------------------");
		ArrayList<Sale> case12 = new ArrayList<>();
		case12.add(new Sale(35, 80, 45));
		case12.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case12);
		System.out.println("----------------------------");
		ArrayList<Sale> case14 = new ArrayList<>();
		case14.add(new Sale(35, 5, 45));
		case14.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case14);
		System.out.println("----------------------------");
		ArrayList<Sale> case15 = new ArrayList<>();
		case15.add(new Sale(35, 75, 45));
		case15.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case15);
		System.out.println("----------------------------");
		ArrayList<Sale> case16 = new ArrayList<>();
		case16.add(new Sale(35, 0, 45));
		case16.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case16);	
		System.out.println("----------------------------");
		ArrayList<Sale> case17 = new ArrayList<>();
		case17.add(new Sale(35, 81, 45));
		case17.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case17);
		System.out.println("----------------------------");
		ArrayList<Sale> case21 = new ArrayList<>();
		case21.add(new Sale(35, 40, 1));
		case21.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case21);
		System.out.println("----------------------------");
		ArrayList<Sale> case22 = new ArrayList<>();
		case22.add(new Sale(35, 40, 90));
		case22.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case22);
		System.out.println("----------------------------");
		ArrayList<Sale> case24 = new ArrayList<>();
		case24.add(new Sale(35, 40, 5));
		case24.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case24);
		System.out.println("----------------------------");
		ArrayList<Sale> case25 = new ArrayList<>();
		case25.add(new Sale(35, 40, 85));
		case25.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case25);
		System.out.println("----------------------------");
		ArrayList<Sale> case26 = new ArrayList<>();
		case26.add(new Sale(35, 40, 0));
		case26.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case26);	
		System.out.println("----------------------------");
		ArrayList<Sale> case27 = new ArrayList<>();
		case27.add(new Sale(35, 40, 91));
		case27.add(new Sale(-1, 0, 0));
		SaleSystem.sell(case27);
		System.out.println("----------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		triangletest();
		triangletest2();
//		System.out.println("------------------�ָ���------------------------");
//		calendartest();
//		calendartest2();
//		System.out.println("------------------�ָ���------------------------");
//		saletest();
//		System.out.println("------------------�ָ���------------------------");
//		calendartest7();
	}

}
