import java.util.Arrays;

public class StringCalculator {
	public static int calculate(String input) {
		int result = 0;
		if (input == null || input.isEmpty()) {
			return 0;
		}
		String[] values = input.split(",|:");
		for (String value : values) {
			result += Integer.parseInt(value);
		}
		return result;
	}
}
