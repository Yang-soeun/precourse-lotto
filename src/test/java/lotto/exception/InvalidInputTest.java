package lotto.exception;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InvalidInputTest {

    @DisplayName("로또 넘버가 중복된 숫자면 예외가 발생한다.")
    @Test
    void duplicateNumberException(){
        //given
        InvalidInput invalidInput = new InvalidInput();

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 3, 5, 6));

        //when //then
        assertThatThrownBy(() -> invalidInput.duplicateNumberException(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 로또 번호는 중복되지 않는 6개의 숫자여야 합니다.");
    }

    @DisplayName("숫자가 1~45 범위가 아니면 예외가 발생한다.")
    @Test
    void outOfRangeException(){
        //given
        InvalidInput invalidInput = new InvalidInput();
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 4, 5, 100));

        //when //then
        assertThatThrownBy(() -> invalidInput.outOfRangeException(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 로또 번호의 숫자 범위는 1 ~ 45까지이다.");

    }

    @DisplayName("숫자가 정수가 아닌 경우 예외가 발생한다.")
    @Test
    void notIntegerValueException(){
        //given
        InvalidInput invalidInput = new InvalidInput();
        String number = "a";

        //when //then
        assertThatThrownBy(() -> invalidInput.notIntegerValueException(number))
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("[ERROR] 번호와 금액은 정수여야 합니다.");
    }

    @DisplayName("로또가 6개의 숫자로 이루어져 있지 않으면 예외가 발생한다.")
    @Test
    void sizeExceededException(){
        //given
        InvalidInput invalidInput = new InvalidInput();
        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(List.of(1, 2, 3, 4, 5, 6, 7));

        //when //then
        assertThatThrownBy(() -> invalidInput.sizeExceededException(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 로또는 6개의 숫자여야 합니다.");
    }

}