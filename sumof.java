package algorithm;

import java.util.Scanner;

public class sumof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���۰� �Է�");
		int s_num = sc.nextInt();
		
		System.out.println("���� �Է�");
		int e_num = sc.nextInt();
		
		sum s1 = new sum();
		
		// ���۰� ~ ���� ������ �� �հ�
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