public class Counter implements Runnable {
	public void run() {
		int sum = 0;
		int product = 1;
		for(int i = 1; i <= 10; i++){
			System.out.println("i = " + i);
			sum += i;
			product *= i;
		}
		System.out.println("sum = " + sum);
		System.out.println("product = " + product);
	}
}