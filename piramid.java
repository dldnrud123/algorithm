package algorithm;

import java.util.Scanner;

public class piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int num = sc.nextInt();

		npira(num);

	}
	
	//�����Ƕ�̵� �ױ�
	static void npira(int n){
		//���� ���� ���������� ����
		int load_num = 1;
		//���� ���� ���� ����;
		int space_cnt = load_num + 2*(n-1);

		for(int i = 1; i <= n; i++){
			
			prt_spc(space_cnt/2);
			for(int j = 1; j <= load_num ; j++){
				// ��µǴ� ���� i%10�� �̿��ؼ� ���ϴ� ����!
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
