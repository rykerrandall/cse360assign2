package cse360assign2;

public class Main{
	
	public static void main(String[] args) {
		Calculator trial = new Calculator();
		int results;
		
		trial.add(2);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.subtract(1);
		results = trial.getTotal();
		System.out.println(results);

		trial.multiply(60);
		results = trial.getTotal();
		System.out.println(results);

		trial.divide(2);
		results = trial.getTotal();
		System.out.println(results);

		trial.add(134);
		results = trial.getTotal();
		System.out.println(results);

		trial.subtract(63);
		results = trial.getTotal();
		System.out.println(results);

		trial.divide(0);
		results = trial.getTotal();
		System.out.println(results);

		trial.add(17);
		results = trial.getTotal();
		System.out.println(results);

		trial.multiply(21);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.subtract(123);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.divide(12);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.divide(2);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.subtract(21);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.multiply(13);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.add(100);
		results = trial.getTotal();
		System.out.println(results);
	}
}