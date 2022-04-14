package me.peppermill.testroom.cache;

import java.util.ArrayList;
import java.util.List;

public class LottoNumber {

    private static final int LOTTO_NUMBER_LOWER_BOUND = 1;
    private static final int LOTTO_NUMBER_UPPER_BOUND = 45;
    private static final List<LottoNumber> CACHE = new ArrayList<>();

    static {
        for (int i = LOTTO_NUMBER_LOWER_BOUND; i<=LOTTO_NUMBER_UPPER_BOUND; i++)
            CACHE.add(new LottoNumber(i));
    }

    private final int number;

    private LottoNumber(final int number) {
        validate(number);
        this.number = number;
    }

    public int getter() {
        return this.number;
    }

    public static List<LottoNumber> values() {
        return CACHE;
    }

    private void validate(final int number) {
        if (number < LOTTO_NUMBER_LOWER_BOUND || number > LOTTO_NUMBER_UPPER_BOUND) {
            throw new IllegalArgumentException("로또 숫자가 유효 범위 밖입니다.");
        }
    }
}
