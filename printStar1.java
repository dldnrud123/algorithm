package algorithm;

import java.util.Scanner;

public class printStar1 {

	public static void main(String[] args) {
		// *�� n�� ���, w������ �ٹٲ�

		int n,w;
		int i;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �?");
		n = sc.nextInt();

		System.out.println("� ���� �ٹٲ�?");
		w = sc.nextInt();

//		for(int i = 1; i <= n ; i++){
//			System.out.print("*");
//			
//			if( i % w == 0){
//				System.out.println();
//			}
//		}
		
		for(i = 1; i <= n/w ; i++){
			prt_star(w);
			System.out.println();
		}
		// �� �� ���� - ( ������� ���� �� ���� )
		prt_star(n-((i-1)*w));
		
	}
	
	// * ����ִ� �޼ҵ�
	static void prt_star(int cnt){
		
		for(int j=1; j <= cnt; j++){
			System.out.print("*");
		}
	}

}
