package algorithm;

import java.util.Scanner;

public class count_number {

	public static void main(String[] args) {
		// 양수를 입력받아 숫자의 자릿수를 반환
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요!");
		
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
