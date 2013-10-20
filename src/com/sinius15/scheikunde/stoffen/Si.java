package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Si implements Matter {

	@Override
	public String name() {
		return "silicium";
	}

	@Override
	public String symbol() {
		return "Si";
	}

	@Override
	public float atomMassa() {
		return 28.09f;
	}

	@Override
	public int atomNumber() {
		return 14;
	}

}
