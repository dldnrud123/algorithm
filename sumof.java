package algorithm;

import java.util.Scanner;

public class sumof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작값 입력");
		int s_num = sc.nextInt();
		
		System.out.println("끝값 입력");
		int e_num = sc.nextInt();
		
		sum s1 = new sum();
		
		// 시작값 ~ 끝값 까지의 총 합계
		System.out.println(s1.sumof_m(s_num, e_num));
	}

}

class sum{
	int sumof_m(int a,int b){
		int val = 0;
		
		for(int i = a; i <= b; i++){
			val += i;
		}
		
		return val;
	}
}