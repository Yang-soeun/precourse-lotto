package lotto.view;

public class OutputView {
    private static final String PURCHASE_MESSAGE = "개를 구매했습니다.";

    public void printPurchaseMessage(int quantity){
        System.out.println(quantity + PURCHASE_MESSAGE);
    }
}