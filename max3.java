package algorithm;

import java.util.Scanner;

public class max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);

		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.print("ù��° ���ڸ� �Է��ϼ���.");
		int a = num.nextInt();

		System.out.print("�ι�° ���ڸ� �Է��ϼ���.");
		int b = num.nextInt();

		System.out.print("����° ���ڸ� �Է��ϼ���.");
		int c = num.nextInt();

		//		1. a,b,c �� ���� ū���� �������
		//		2. ���� ū ���� 2���ϰ��
		//		3. ������ �� ���� ���� ������ ���


		System.out.println("�ִ밪�� \""+max3.max3_mtd(a,b,c)+"\"�Դϴ�.");


	}


	static int max3_mtd(int aa, int bb, int cc){

		int temp_max = aa;

		if(bb > temp_max){
			temp_max = bb;
		}

		if(cc > temp_max){
			temp_max = cc;
		}

		return temp_max;
	}
}

