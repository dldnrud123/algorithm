package algorithm;

import java.util.Scanner;

public class max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("첫번째 숫자를 입력하세요.");
		int a = num.nextInt();

		System.out.print("두번째 숫자를 입력하세요.");
		int b = num.nextInt();

		System.out.print("세번째 숫자를 입력하세요.");
		int c = num.nextInt();

		//		1. a,b,c 중 가장 큰값이 있을경우
		//		2. 가장 큰 값이 2개일경우
		//		3. 세가지 값 전부 값을 동일할 경우


		System.out.println("최대값은 \""+max3.max3_mtd(a,b,c)+"\"입니다.");


	}


	static int max3_mtd(int aa, int bb, int cc){

		int temp_max = aa;

		if(bb > temp_max){
			temp_max = bb;
		}

		if(cc > temp_max){
			temp_max = cc;
		}

		return temp_max;
	}
}

