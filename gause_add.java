package algorithm;

import java.util.Scanner;

// 1���� n������ ���� ���ϱ�
public class gause_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n������ �� n?");
		
		int max_num = sc.nextInt();
		int temp_max = max_num;
		int middle_num = max_num/2;
		int sum = 0;
		
		
		for(int i = 1; i <= middle_num; i++){
			sum += i + temp_max;
			temp_max--;
		}
		
		//Ȧ�� �� ��� 
		if(max_num % 2 != 0) {
			sum += middle_num + 1;
		}
		
		System.out.println(sum);
	}

}