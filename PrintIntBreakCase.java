package startedLearningJava;

public class PrintSwithCase {

	public static void main(String[] args) {

		int[] tu = { 12, 34, 66, 85, 900 };

		for (int j = 0; j <= tu.length; j++) {

			if (tu[j] == 85) {
				System.out.println(" number is 85");
				break;
			}
			
			//else {
				//System.out.println(tu[j] + " number is not equl to 85");
			}

		}
	}
