package main.java;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String in;
		Lotto lotto = new Lotto();
		while (true) {
			System.out.println("If you press 'n'+Enter, you will get the 6 lotto numbers!\n" +
					"If you press any other with Enter, program will be exited.");

			in = scanner.next();
			if (!in.equals("n")) {
				break;
			}

			int[] numbers = lotto.getNumbers();
			for (int n : numbers) {
				System.out.print(n + " ");
			}

			System.out.println();
		}
	}
}
