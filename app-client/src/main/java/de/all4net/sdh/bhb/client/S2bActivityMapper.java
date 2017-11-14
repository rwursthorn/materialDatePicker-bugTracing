package de.all4net.sdh.bhb.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import de.all4net.sdh.bhb.client.start.StartActivity;

@Singleton
public class S2bActivityMapper implements ActivityMapper {

	@Inject
	private Provider<StartActivity> startActivity;

	@Override
	public Activity getActivity(final Place place) {
		return startActivity.get();
	}
}
