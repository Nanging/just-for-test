package sTest;

public class Tel {
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
	public static String calculate(int min,int time,double delay) {
		if (min<0||time<0||time>12||delay<0) {
			return "输入错误";
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
}