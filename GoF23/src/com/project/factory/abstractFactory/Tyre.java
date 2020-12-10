package com.project.factory.abstractFactory;

/**
 * ÂÖÌ¥
 * @author chaixf
 *
 */
public interface Tyre {
	void revolve();
}

//¸ß¶ËÂÖÌ¥
class LuxuryTyre implements Tyre{
	@Override
	public void revolve() {
		System.out.println("¸ß¶ËÂÖÌ¥-¸ßËÙĞı×ª²»Ä¥Ëğ");
	}
}

//µÍ¶ËÂÖÌ¥
class LowTyre implements Tyre {
	@Override
	public void revolve() {
		System.out.println("µÍ¶ËÂÖÌ¥-Ğı×ªÄ¥Ëğ");
	}
}