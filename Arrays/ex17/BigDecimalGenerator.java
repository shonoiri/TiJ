package ex17;

import java.math.BigDecimal;

import net.mindview.util.Generator;

public class BigDecimalGenerator implements Generator<BigDecimal> {
	private BigDecimal value = new BigDecimal(0);
	private BigDecimal step;

	public BigDecimalGenerator(BigDecimal step) {
		this.step = step;
	}

	@Override
	public BigDecimal next() {
		BigDecimal oldValue = value;
		value = value.add(step);
		return oldValue;
	}
}
