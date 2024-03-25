import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static int calculate(String input) {
		int result = 0;
		if (input == null || input.isEmpty()) {
			return 0;
		}

		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
		if (m.find()) {
			String customDelimiter = m.group(1);
			String[] values = m.group(2).split(customDelimiter);
			for (String value : values) {
				result += Integer.parseInt(value);
			}
			return result;
		}

		String[] values = input.split(",|:");
		for (String value : values) {
			result += Integer.parseInt(value);
		}
		return result;
	}
}
