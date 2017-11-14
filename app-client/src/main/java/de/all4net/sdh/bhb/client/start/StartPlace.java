package de.all4net.sdh.bhb.client.start;

import de.all4net.sdh.bhb.client.S2bPlace;

public class StartPlace extends S2bPlace {

	private static final long serialVersionUID = 1L;
	private final S2bPlace afterLoginPlace;

	public StartPlace(final S2bPlace afterLoginPlace) {
		this.afterLoginPlace = afterLoginPlace;
	}

	public StartPlace(final S2bPlace afterLoginPlace, final S2bPlace place) {
		super(place);
		this.afterLoginPlace = afterLoginPlace;
	}

	public S2bPlace getAfterLoginPlace() {
		return afterLoginPlace;
	}
}
