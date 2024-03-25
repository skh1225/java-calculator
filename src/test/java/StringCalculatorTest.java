import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringCalculatorTest {
	@Test
	void 빈문자열_또는_null() {
		assertThat(StringCalculator.calculate(null)).isEqualTo(0);
		assertThat(StringCalculator.calculate("")).isEqualTo(0);
	}

	@Test
	void 쉼표_콜론을_구분자로_가지는_입력() {
		assertThat(StringCalculator.calculate("1,2,3")).isEqualTo(6);
		assertThat(StringCalculator.calculate("1,2:3")).isEqualTo(6);
		assertThat(StringCalculator.calculate("1:2:3")).isEqualTo(6);
	}

	@Test
	void 하나의_수_입력() {
		assertThat(StringCalculator.calculate("1")).isEqualTo(1);
	}

	@Test
	void 커스텀_구분자를_가진_입력() {
		assertThat(StringCalculator.calculate("//;\n1;2;3")).isEqualTo(6);
	}
}
