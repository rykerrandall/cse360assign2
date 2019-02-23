package cse360assign2;

public class Main{
	
	public static void main(String[] args) {
		Calculator trial = new Calculator();
		int results;
		
		trial.subtract(120);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.divide(6);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.multiply(24);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.add(23);
		results = trial.getTotal();
		System.out.println(results);
		
		String hist;
		hist = trial.getHistory();
		System.out.println(hist);
		
		trial.add(900);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.subtract(105);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.divide(3);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.multiply(3);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.subtract(1);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.add(3);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.divide(0);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.add(19832);
		results = trial.getTotal();
		System.out.println(results);
		
		trial.multiply(0);
		results = trial.getTotal();
		System.out.println(results);
		
		hist = trial.getHistory();
		System.out.println(hist);
		
	}
}