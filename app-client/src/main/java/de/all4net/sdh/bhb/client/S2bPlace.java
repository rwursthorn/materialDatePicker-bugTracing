package de.all4net.sdh.bhb.client;

import java.io.Serializable;

import com.google.gwt.place.shared.Place;

public class S2bPlace extends Place implements Serializable {
	private static final long serialVersionUID = 1L;

	private String previousPlaceLabel;

	public S2bPlace() {
		this((String)null);
	}

	protected S2bPlace(final String previousPlaceLabel) {
		this.previousPlaceLabel = previousPlaceLabel;
	}

	protected S2bPlace(final S2bPlace s2bPlace) {
		previousPlaceLabel = s2bPlace.previousPlaceLabel;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof S2bPlace) {
			return getClass().equals(obj.getClass());
		}

		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 1;
		hash = hash * prime + getClass().hashCode();
		return hash;
	}

	public String getPerspective() {
		return null;
	}

	public String getPreviousPlaceLabel() {
		return previousPlaceLabel;
	}

	public void clearPreviousPlaceLabel() {
		previousPlaceLabel = null;
	}

	public boolean hasPreviousPlaceLabel() {
		return !(previousPlaceLabel == null || getPreviousPlaceLabel().isEmpty());
	}
}
