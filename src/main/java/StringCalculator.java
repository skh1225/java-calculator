import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static int calculate(String input) {
		if (isBlank(input)) {
			return 0;
		}
		return sum(split(input));
	}

	public static boolean isBlank(String input) {
		return input == null || input.isEmpty();
	}

	public static int sum(String[] values) {
		int result = 0;
		for (String value : values) {
			isPositiveNumber(value);
			result += Integer.parseInt(value);
		}
		return result;
	}

	public static void isPositiveNumber(String value) {
		if (value.isEmpty() || value.chars().anyMatch(c -> c < '0' || c > '9')) {
			throw new RuntimeException();
		}
	}

	public static String[] split(String input) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
		if (m.find()) {
			return m.group(2).split(m.group(1));
		}
		return input.split(",|:");
	}
}
