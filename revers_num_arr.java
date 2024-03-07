package algorithm;

import java.util.Random;
import java.util.Scanner;

public class revers_num_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개의 난수를 만들것인가");
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
		
		//역순정렬
		for(int i = 0; i < a.length/2; i++){
			tmp = a[(a.length-1) - i];
			a[(a.length-1) - i] = a[i];
			a[i] = tmp;
		}
		
		// 역순으로 정렬된 숫자를 프린트
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		
	}
}


