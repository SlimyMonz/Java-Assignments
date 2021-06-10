/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package lecture.week4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class W4_CalcTest {

	W4_Calc w4 = new W4_Calc();


	@ParameterizedTest
	@ValueSource(doubles = {0, 1, 2, 3, 100})
	public void testCalcAdd(double arg1) {

		double actual = w4.calcAdd(arg1, 0);

		assertEquals(arg1, actual);

	}


}