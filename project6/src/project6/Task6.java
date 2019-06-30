package project6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Task6 {
    public static Collection<Object[]> boundaryValueTestCase = Arrays.asList(
    		
    		new Object[][]{
		        {0,6,100.0},{1,6,100.0},{30,6,100.0},{59,6,100.0},{60,6,100.0},
		        {61,6,100.0},{90,6,100.0},{119,6,100.0},{120,6,100.0},{121,6,100.0},
		        {150,6,100.0},{179,6,100.0},{180,6,100.0},{181,6,100.0},{240,6,100.0},
		        {299,6,100.0},{300,6,100.0},{301,6,100.0},{150,0,100.0},{150,1,100.0},
		        {150,6,100.0},{150,11,100.0},{150,12,100.0},{150,6,0.0},{150,6,1.0},
		        {150,6,100.0},{-1,6,100.0},{150,-1,100.0},{150,13,100.0},{150,6,-1.0}}
	        );	
	public static  Collection<Object[]> equivalenceClassTestCase = Arrays.asList(
				new Object[][]{
		        {30,1,100.0},{30,2,100.0},{30,3,100.0},{30,5,100.0},{30,9,100.0},
		        {90,1,100.0},{90,2,100.0},{90,3,100.0},{90,5,100.0},{90,9,100.0},
		        {150,1,100.0},{150,2,100.0},{150,3,100.0},{150,5,100.0},{150,9,100.0},
		        {240,1,100.0},{240,2,100.0},{240,3,100.0},{240,5,100.0},{240,9,100.0},
		        {360,1,100.0},{360,2,100.0},{360,3,100.0},{360,5,100.0},{360,9,100.0},
		        {-1,6,100.0},{150,-1,100.0},{150,13,100.0},{150,6,-1.0}}
	        );	
	public static  Collection<Object[]> decisionTableTestCase = Arrays.asList(
	        new Object[][]{
		        {30,1,100.0},{30,7,100.0},{90,2,100.0},{90,7,100.0},{150,3,100.0},
		        {150,7,100.0},{240,3,100.0},{240,7,100.0},{360,6,100.0},{360,9,100.0}}
	        );	
	public static void boundaryValueTesting() {
		int i = 0;
		System.out.println("Boundary Value Testing:");
		for (Object[] objects : boundaryValueTestCase) {
			i++;
			System.out.println("Tese Case "+i+" : "+
			Tel.calculate((int)(objects[0]), 
					(int)(objects[1]), (double)(objects[2])));
		}
	}
	public static void equivalenceClassTesting() {
		int i = 0;
		System.out.println("Equivalence Class Testing:");
		for (Object[] objects : equivalenceClassTestCase) {
			i++;
			System.out.println("Tese Case "+i+" : "+
			Tel.calculate((int)(objects[0]), (int)(objects[1]), 
					(double)(objects[2])));
		}
	}
	public static void decisionTableTesting() {
		int i = 0;
		System.out.println("Decision Table Testing:");
		for (Object[] objects : decisionTableTestCase) {
			i++;
			System.out.println("Tese Case "+i+" : "
			+Tel.calculate((int)(objects[0]), (int)(objects[1])
					, (double)(objects[2])));
		}	
	}
	public static void main(String[] args) {
//		boundaryValueTesting();
//		equivalenceClassTesting();
		decisionTableTesting();
//		Scanner in = new Scanner(System.in);
//		System.out.println("选择您的支付方式：（1.支付宝 2.银行卡）");
//		int t = in.nextInt();
//		if (t==1) {
//			System.out.println("您选择支付宝支付；");
//		}else if (t==2) {
//			System.out.println("您选择银行卡支付；");
//		}else {
//			System.out.println("输入错误");
//		}
//		in.close();
	}
}
