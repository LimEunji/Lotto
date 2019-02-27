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
		setNumber(numbers, 0);
		return numbers;
	}

	private void setNumber(int[] result, int times)
	{
		if (times >= count) {
			return;
		}

		int randomNum = ThreadLocalRandom.current().nextInt(minNum, maxNum + 1);
		if (checkDuplicated(result, randomNum, times)) {
			setNumber(result, times);
		} else {
			result[times] = randomNum;
			setNumber(result, times + 1);
		}
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
