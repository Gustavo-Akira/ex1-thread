package main;

import main.threads.ThreadVetor;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[1000];
		for(int x =0;x<1000;x++) {
			array[x] = (int) (Math.random() * 100);
		}
		ThreadVetor thread = new ThreadVetor(1, array);
		ThreadVetor thread2 = new ThreadVetor(2, array);
		thread.start();
		thread2.start();
	}
}
