package algorithm;

import java.util.Scanner;

public class sub_num {

	public static void main(String[] args) {
		// 첫번째 값 - 두번째 값 결과값이  음수x
		
		int f_num = 0, s_num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("첫번째 값 입력");
			f_num = sc.nextInt();
			
			System.out.println("두번째 값 입력");
			s_num = sc.nextInt();
			
			
		}while(f_num <= s_num);
		
		System.out.println(f_num-s_num); 
	}

}
