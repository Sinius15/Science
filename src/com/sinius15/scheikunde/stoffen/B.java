package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class B implements Matter {

	@Override
	public String name() {
		return "boor";
	}

	@Override
	public String symbol() {
		return "B";
	}

	@Override
	public float atomMassa() {
		return 10.81f;
	}

	@Override
	public int atomNumber() {
		return 5;
	}

}
