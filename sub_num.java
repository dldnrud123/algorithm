package algorithm;

import java.util.Scanner;

public class sub_num {

	public static void main(String[] args) {
		// ù��° �� - �ι�° �� �������  ����x
		
		int f_num = 0, s_num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("ù��° �� �Է�");
			f_num = sc.nextInt();
			
			System.out.println("�ι�° �� �Է�");
			s_num = sc.nextInt();
			
			
		}while(f_num <= s_num);
		
		System.out.println(f_num-s_num); 
	}

}
