package dongu;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n, number, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

	    System.out.print("Kaç tane sayı gireceksiniz?: ");
	    n = scanner.nextInt();

	    for (int i = 1; i <= n; i++) {
	        System.out.print(i + ". sayıyı giriniz: ");
	        number = scanner.nextInt();
	        if (number < min) {
	            min = number;
	        }
	        if (number > max) {
	            max = number;
	        }
	    }

	    System.out.println("En küçük sayı: " + min);
	    System.out.println("En büyük sayı: " + max);
	}

	
}
