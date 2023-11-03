package lotto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringConverterTest {
    @DisplayName("문자열 리스트를 정수형 리스트로 변환한다.")
    @Test
    void convertToIntegerList() {
        //given
        StringConverter stringConverter = new StringConverter();
        List<String> numbers = new ArrayList<>();
        numbers.addAll(List.of("1", "2", "3", "4", "5", "6"));

        //when
        List<Integer> convertedNumbers = stringConverter.convertToIntegerList(numbers);

        //then
        assertThat(convertedNumbers).hasSize(6)
                .isEqualTo(Arrays.asList(1, 2, 3, 4, 5, 6));
    }

    @DisplayName("문자열 리스트에 숫자가 아닌 문자열이 들어있으면 반환할때 예외가 발생한다.")
    @Test
    void convertToIntegerListWithNotDigit() {
        //given
        StringConverter stringConverter = new StringConverter();
        List<String> numbers = new ArrayList<>();
        numbers.addAll(List.of("1", "2", "3", "4", "5", "a"));

        //when //then
        assertThatThrownBy(() -> stringConverter.convertToIntegerList(numbers))
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("[ERROR] 번호와 금액은 정수여야 합니다.");
    }

    @DisplayName("문자를 정수로 변환한다.")
    @Test
    void parseInt() {
        //given
        StringConverter stringConverter = new StringConverter();
        String number = "1";

        //when
        int convertedNumber = stringConverter.parseInt(number);

        //then
        assertThat(convertedNumber).isInstanceOf(Integer.class)
                .isEqualTo(1);
    }

    @DisplayName("문자가 숫자가 아니면 정수로 변환할때 오류가 발생한다.")
    @Test
    void test() {
        //given
        StringConverter stringConverter = new StringConverter();
        String number = "a";

        //when //then
        assertThatThrownBy(() -> stringConverter.parseInt(number))
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("[ERROR] 번호와 금액은 정수여야 합니다.");
    }
}