package algorithm;

import java.util.Random;
import java.util.Scanner;

public class revers_num_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� ������ ������ΰ�");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = rd.nextInt(arr.length);
			System.out.print(arr[i]+" ");
		
		}
		System.out.println();
		
		revers_arr(arr);
		
	}

	static void revers_arr(int a[]){
		
		int tmp;
		
		//��������
		for(int i = 0; i < a.length/2; i++){
			tmp = a[(a.length-1) - i];
			a[(a.length-1) - i] = a[i];
			a[i] = tmp;
		}
		
		// �������� ���ĵ� ���ڸ� ����Ʈ
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		
	}
}


