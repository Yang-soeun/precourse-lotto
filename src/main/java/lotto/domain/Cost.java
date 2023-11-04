package lotto.domain;

import static lotto.constant.CostConstant.UNIT;

import lotto.exception.InvalidInput;

public class Cost {
    private final int cost;

    public Cost(int cost) {
        validate(cost);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    private void validate(int cost){
        InvalidInput invalidInput = new InvalidInput();
        invalidInput.notThousandUnitException(cost);
    }
}
