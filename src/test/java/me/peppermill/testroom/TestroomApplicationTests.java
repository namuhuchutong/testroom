package me.peppermill.testroom;

import me.peppermill.testroom.cache.LottoNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestroomApplicationTests {

	@DisplayName("캐시 테스트")
	@Test
	public void testLottoGenerator() {
		List<LottoNumber> lottoNumbers1 = LottoNumber.values();
		List<LottoNumber> lottoNumbers2 = LottoNumber.values();
		for (int i = 0; i<45; i++) {
			assertEquals(lottoNumbers1.get(i).getClass(), lottoNumbers2.get(i).getClass());
		}

	}

}
