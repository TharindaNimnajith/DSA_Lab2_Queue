package dsa;

import java.util.Scanner;

public class QueueApp {
	public static void main(String[] args) {
		QueueX mainQueue = new QueueX(5);
		QueueX printerQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter transaction ID " + (i + 1) + ": ");
			int id = sc.nextInt();
			
			printerQueue.insert(id);
		}
		
		for(int i = 0; i < 5; i++) {
			int id = printerQueue.remove();
			
			if(id % 2 == 0)
				evenQueue.insert(id);
			else
				oddQueue.insert(id);
		}
		
		System.out.println("\nPC1");
		while(!evenQueue.isEmpty()) {
			System.out.println("  Transaction " + evenQueue.remove());
		}
		
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			System.out.println("  Transaction " + oddQueue.remove());
		}
	}
}