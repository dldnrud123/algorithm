package algorithm;

import java.util.Scanner;

public class printStar1 {

	public static void main(String[] args) {
		// *을 n개 출력, w개마다 줄바꿈

		int n,w;
		int i;
		Scanner sc = new Scanner(System.in);

		System.out.println("별을 몇개?");
		n = sc.nextInt();

		System.out.println("몇개 마다 줄바꿈?");
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
		// 총 별 갯수 - ( 현재까지 찍은 별 갯수 )
		prt_star(n-((i-1)*w));
		
	}
	
	// * 찍어주는 메소드
	static void prt_star(int cnt){
		
		for(int j=1; j <= cnt; j++){
			System.out.print("*");
		}
	}

}
