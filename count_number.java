package algorithm;

import java.util.Scanner;

public class count_number {

	public static void main(String[] args) {
		// ����� �Է¹޾� ������ �ڸ����� ��ȯ
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է����ּ���!");
		
		int num = sc.nextInt();
		int i = 1;
		int count = 0;
		
		while(i <= num){
			i*=10;
			count ++;
		}
		
		System.out.println(count);
		
	}

}
