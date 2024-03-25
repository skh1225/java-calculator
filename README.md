# java-calculator

## 기능 요구사항
- \[✓] 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.
- \[&nbsp;&nbsp;] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
- \[&nbsp;&nbsp;] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환
- \[&nbsp;&nbsp;] “//”와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다.
- \[&nbsp;&nbsp;] 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다.