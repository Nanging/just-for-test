package sTest;

public class Triangle {
	public static void triangle(float a,float b,float c) {
		System.out.print("����:"+ a + " " + b + " " + c + "  ���:");
		if(a <= 0 || b <= 0 || c <= 0) {
			System.out.println("a��b��c�������0");
			return;
		}
		if(a > 1000 || b > 1000 || c > 1000) {
			System.out.println("a��b��cӦ��С�ڵ���1000");
			return;
		}
		if(a+b <= c || b+c <= a || a+c <= b) {
			System.out.println("��������");
			return;
		}
		if(a == b && a == c) {
			System.out.println("�ȱ�������");
			return;
		}
		if(a == b || b == c || a == c) {
			System.out.println("����������");
			return;
		}
		System.out.println("һ��������");
	}
}
