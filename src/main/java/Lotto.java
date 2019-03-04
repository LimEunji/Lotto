package main.java;

import java.util.concurrent.ThreadLocalRandom;

public class Lotto
{
	private final int count = 6;
	private final int minNum = 1;
	private final int maxNum = 45;

	public int[] getNumbers()
	{
		int[] numbers = new int[count];
		int i = 0;
		while(i<6) setNumber(numbers, i++);
		return numbers;
	}

	private void setNumber(int[] result, int times)
	{
		int randomNum = ThreadLocalRandom.current().nextInt(minNum, maxNum + 1);
		while (checkDuplicated(result, randomNum, times))
			randomNum = ThreadLocalRandom.current().nextInt(minNum,maxNum + 1);
		result[times] = randomNum;
	}

	private boolean checkDuplicated(int[] result, int newNum, int times)
	{
		for (int i = 0; i < times - 1; i++) {
			if (result[i] == newNum) {
				return true;
			}
		}

		return false;
	}
}
