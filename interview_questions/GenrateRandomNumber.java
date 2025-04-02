package interview_questions;

import java.util.Random;

public class GenrateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Math.random());
		
		Random random = new Random();
		System.out.println(random.nextInt(100));
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());

	}

}
