package startedLearningJava;

public class PrintPrimeNum {

	public static void main(String[] args) {

		int min = 1;
		int max = 1000;

		for (int t = min; t <= max; t++) {

			for (int j = 2; j <= t / j; ++j) {

				if (t % j == 0) {

					System.out.println(t + " number is not a prime number, divisible by " + j);
					break;
				}
			}
		}

	}

//	public static void main(String[] args) {
//
//		int min = 1;
//        int max = 10;
//        //find all prime numbers in the given range
//        for(int n=min;n<=max;n++) {
//            //check if this number is prime
//            if(isPrime(n)) {
//                System.out.println(n);
//
//	      }
//     }
//}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / i; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}