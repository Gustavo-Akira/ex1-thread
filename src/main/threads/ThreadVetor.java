package main.threads;

public class ThreadVetor extends Thread{
	
	private int oddOrEven;
	
	private int[] array;
	
	public ThreadVetor(int oddOrEven, int[] array) {
		this.oddOrEven = oddOrEven;
		this.array = array;
	}
	
	@Override
	public void run() {
		System.out.println(calculate());
		this.interrupt();
	}
	
	private long calculate() {
		long time = System.currentTimeMillis();
		if(oddOrEven %2 == 0) {
			 for (int i = 0 ; i < array.length; i++) {
				 int m = array[i];
			 }
		}else {
			for(int m : array) {
				
			}
		}
		return (long)(System.currentTimeMillis() - time);
	}
}
