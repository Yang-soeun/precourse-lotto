package lotto.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private final String INPUT_BUYING_COST_MESSAGE = "구입금액을 입력해 주세요.";
    private final String INPUT_WINNING_NUMBERS_MESSAGE = "당첨 번호를 입력해 주세요.";
    private final String INPUT_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";
    private final String COMMA = ",";

    public String inputBuyingCost(){
        System.out.println(INPUT_BUYING_COST_MESSAGE);

        return readLine();
    }

    public List<String> inputWinningNumbers(){
        System.out.println(INPUT_WINNING_NUMBERS_MESSAGE);
        String[] inputNumbers = readLine().split(COMMA);

        return Arrays.stream(inputNumbers).toList();
    }

    public String inputBonusNumber(){
        System.out.println(INPUT_BONUS_NUMBER_MESSAGE);

        return readLine();
    }
}