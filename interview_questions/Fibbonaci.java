package interview_questions;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		
		//0,1,1,2,3,5,8
		int firstnum = 0;
		int secnum = 1;
		
		System.out.println("Fibonnaci series till "+ n +" terms");
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println(firstnum);
			int nextnum = firstnum + secnum ;
			firstnum = secnum;
			secnum = nextnum;

		}
		
	}

}
