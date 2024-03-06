package algorithm;

import java.util.Scanner;

public class piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력");
		int num = sc.nextInt();

		npira(num);

	}
	
	//숫자피라미드 쌓기
	static void npira(int n){
		//현재 층에 숫자찍히는 갯수
		int load_num = 1;
		//현재 층의 공간 갯수;
		int space_cnt = load_num + 2*(n-1);

		for(int i = 1; i <= n; i++){
			
			prt_spc(space_cnt/2);
			for(int j = 1; j <= load_num ; j++){
				// 출력되는 값을 i%10을 이용해서 구하는 문제!
				System.out.print(i%10);
			}
			
			prt_spc(space_cnt/2);
			
			load_num+=2;
			space_cnt-=2;
			
			System.out.println();
		}
	}
	
	static void prt_spc(int cnt){
		
		for(int j=1; j <= cnt; j++){
			System.out.print(" ");
		}
	}

}
