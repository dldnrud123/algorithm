package algorithm;

public class multi_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prt_tbl();

	}


	static void prt_tbl(){

		for(int i = 0; i <= 9; i++){

			if(i == 0){
				System.out.print("   "+"|");
			}else{
				System.out.print(" "+i+" "+"|");
			}

			for(int j = 1; j <= 9; j++){
				if(i == 0){
					System.out.print(" "+j+" ");
				}else{
					System.out.print(" "+j*i+" ");
				}
			}

			if(i == 0){
				System.out.println();
				System.out.print("---+------------------------------------");
			}
				System.out.println("");
			
		}


	}
}
