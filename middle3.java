package algorithm;

import java.util.Scanner;

public class middle3 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("첫번째 숫자를 입력하세요.");
		int a = num.nextInt();

		System.out.print("두번째 숫자를 입력하세요.");
		int b = num.nextInt();

		System.out.print("세번째 숫자를 입력하세요.");
		int c = num.nextInt();

		middle md = new middle();

		System.out.println(md.middle3_mtd(a, b, c));
	}

}

class middle{

	int middle3_mtd(int a, int b ,int c){

		int max_num = a, min_num = a, middle_num = 0;

		//max
		if(b > max_num){
			max_num = b;
			
		}
		
		if(c > max_num){
			max_num = c;
		}
		
		System.out.println("최대"+max_num);

		//min
		if(min_num > b){
			min_num = b;
			
		}
		if(min_num > c){
			min_num = c;			
		}
		
		System.out.println("최소"+min_num);
		
		//middle
		if(min_num <= a &&  a <= max_num){

			middle_num = a;

		}
		if(min_num <= b &&  b <= max_num){

			middle_num = b;

		}
		if(min_num <= c &&  c <= max_num){

			middle_num = c;

		}

		return middle_num ;
	}

}
