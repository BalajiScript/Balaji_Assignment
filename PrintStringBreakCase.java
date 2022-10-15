package startedLearningJava;

public class PrintSwitchString {

	public static void main(String[] args) {
		String[] ab = { "Java", "Javascript", "Mukesh", "Selenium", "Python" };

		for (int j = 0; j <= ab.length; j++) {

			if (ab[j].equalsIgnoreCase("Mukesh")) {
				System.out.println("Print line " + "Mukesh");
				break;
			}

		}
	}
}
