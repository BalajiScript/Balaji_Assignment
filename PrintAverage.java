package startedLearningJava;

public class PrintAverage {

	public static void main(String[] args) {

		int[] nums = { 10, (int) 90.78, 111, 8989, 7876 };

		double sum = 0;

		// compute sum
		for (int num1 : nums)
			sum += num1;

		double average = (sum / nums.length);

		System.out.print("Average : " + average);

	}

}
