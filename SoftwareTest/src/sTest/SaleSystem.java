package sTest;

import java.util.ArrayList;

/*Ӷ�����⣺
 * ��������ϵͳ��
 * ������25����λ�۸�ÿ��������۵�����Ϊ70����
 * ��ʾ����30����λ�۸�ÿ�������������Ϊ80����
 * ���裨45����λ�۸�ÿ��������۵�����Ϊ90����
 * ÿ������Աÿ����������һ̨�����Ļ�����
 * ��ϵͳ����������������ܵ�-1ֵ��ʱ��ϵͳ�Զ�ͳ�Ƹ�����Ա���µ������ܶ
 * �����۶�С�ڵ���1000������1000������10%��Ӷ��
 * �����۶���1000-1800֮�䣨����1800����ʱ����15%��Ӷ��
 * �����۶����1800ʱ����20%��Ӷ���ñ߽�ֵ����Ʋ���������
*/
public class SaleSystem {
	private final int priceOfMaster = 25;
	private final int priceOfScreen = 30;
	private final int priceOfPeripheral = 45;
	private int saleOfMaster =  0;
	private int saleOfScreen =  0;
	private int saleOfPeripheral =  0;
	public void sell(ArrayList<Sale> saleList ) {
		saleOfMaster =  0;
		saleOfScreen =  0;
		saleOfPeripheral =  0;
//		System.out.println(saleList.size());
		if (saleList.size() < 1) {
			System.out.println("�����ۼ�¼");
			return;
		}
		if(saleList.get(saleList.size()-1).mNum != -1) {
			System.out.println("����ȱ��-1��Ϊ������־");
		}
		for (int i = 0; i < saleList.size(); i++) {
			Sale sale = saleList.get(i);
			if(sale.mNum == -1) {
				if (i != saleList.size()-1) {
					System.out.println("���������ڽ�������������");
					return;					
				}
				if (saleOfMaster>=1 && saleOfScreen>=1 && saleOfPeripheral>=1) {
					int totalSale = saleOfMaster*priceOfMaster + saleOfScreen*priceOfScreen + saleOfPeripheral*priceOfPeripheral;
					System.out.println("���������ܶ�Ϊ��"+totalSale);
					double salary = 0;
					if (totalSale>=0 && totalSale<=1000) {
						salary = totalSale*0.1;
						System.out.println("����Ӷ��Ϊ��"+salary);
					}else if (totalSale<=1800) {
						salary = totalSale*0.15;
						System.out.println("����Ӷ��Ϊ��"+salary);
					}else if (totalSale>1800) {
						salary = totalSale*0.2;
						System.out.println("����Ӷ��Ϊ��"+salary);
					}else {
						System.out.println("���۶��Ϊ��");
					}
					return;
				}else {
					System.out.println("���²�δ�ɹ�����һ̨�����Ļ���");
					return;
				}
			}else {
				if (sale.mNum>=0 && sale.sNum>=0 && sale.pNum>=0) {
					if(saleOfMaster+sale.mNum>70 || saleOfScreen+sale.sNum>80 || saleOfPeripheral+sale.pNum>90) {
						System.out.println("����ÿ����������");
						return;
					}else {
						saleOfMaster+=sale.mNum;
						saleOfScreen+=sale.sNum;
						saleOfPeripheral+=sale.pNum;
					}
				}else {
					System.out.println("������������Ϊ��");
					return;
				}
			}
		}
	}
}
