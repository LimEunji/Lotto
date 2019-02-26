package test.java;

import main.java.Lotto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LottoTests
{
	public static Lotto lotto = new Lotto();

	@Test
	public void lottoMustReturnSixNumbers()
	{
		// Act
		int[] numbers = lotto.getNumbers();

		// Assert
		assertEquals(6, numbers.length);
	}

	@Test
	public void lottoMustNotReturnDuplicatedNumber()
	{
		// Act
		int[] numbers = lotto.getNumbers();

		// Assert
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				assertTrue(numbers[i] != numbers[j]);
			}
		}
	}

	@Test
	public void lottoNumberMustBetween1And45()
	{
		// Act
		int[] numbers = lotto.getNumbers();

		// Assert
		for (int n : numbers) {
			assertTrue(n >= 1 && n <= 45);
		}
	}
}
