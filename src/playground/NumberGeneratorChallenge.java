package playground;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGeneratorChallenge {

	public static void main(String[] args) {
		generateRandomNumbers(10);
	}

	static void generateRandomNumbers(Integer n) {
		
		List<Integer> numbers = new ArrayList<>();
		List<Integer> randomNumbers = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			numbers.add(i);
		}

		System.out.println("Starting Numbers: " + numbers);

		Random rand = new Random();

		while (!numbers.isEmpty()) {

			int roundedPosition = Math.round(rand.nextFloat() * numbers.size());

			int finalPosition = roundedPosition == numbers.size() ? roundedPosition - 1 : roundedPosition;

			randomNumbers.add(numbers.remove(finalPosition));
		}

		System.out.println("Random Numbers: " + randomNumbers);
	}
}
