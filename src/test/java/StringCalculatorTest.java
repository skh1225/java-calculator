import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	@Test
	void 빈문자열_또는_null() {
		assertThat(StringCalculator.calculate(null)).isEqualTo(0);
		assertThat(StringCalculator.calculate("")).isEqualTo(0);
	}
}
