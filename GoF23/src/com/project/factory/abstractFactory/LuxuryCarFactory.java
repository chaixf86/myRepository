package com.project.factory.abstractFactory;

/**
 * ∏ﬂ∂À≥µ≈‰÷√
 * @author chaixf
 *
 */
public class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}
	
}
