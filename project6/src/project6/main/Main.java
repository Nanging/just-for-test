package project6.main;

import java.util.Scanner;

public class Main {
	private static final int rent = 25;
	private static final double price = 0.15;
	private static final double delayrate = 0.05;
	private static final double[] rates = {
			0.010,
			0.015,
			0.020,
			0.025,
			0.030
	};
	public String calculate(int min,int time,double delay) {
		if (min<0||time<0||delay<0) {
			System.out.println("输入错误");
		}
		double total = rent + delay*delayrate;
		if (min>0&&min<=60) {
			if (time<=1) {
				total+=(min*price*rates[0]);
			} else {
				total+=(min*price);
			}
		}else if (min>60&&min<=120) {
			if (time<=2) {
				total+=(min*price*rates[1]);
			} else {
				total+=(min*price);
			}
		}else if (min>120&&min<=180) {
			if (time<=3) {
				total+=(min*price*rates[2]);
			} else {
				total+=(min*price);
			}
		}else if (min>180&&min<=300) {
			if (time<=3) {
				total+=(min*price*rates[3]);
			} else {
				total+=(min*price);
			}
		}else if (min>300) {
			if (time<=6) {
				total+=(min*price*rates[4]);
			} else {
				total+=(min*price);
			}
		}
		return String.format("%.2f", total);
	}
	public static void main(String[] args) {
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
