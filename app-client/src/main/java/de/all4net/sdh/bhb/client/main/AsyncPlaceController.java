package de.all4net.sdh.bhb.client.main;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;

import de.all4net.sdh.bhb.client.S2bPlace;
import de.all4net.sdh.bhb.client.start.StartPlace;

@Singleton
public class AsyncPlaceController extends PlaceController {

	@Inject
	private AsyncMapperLoader asyncMapperLoader;

	@Inject
	public AsyncPlaceController(final EventBus eventBus) {
		super(eventBus);
	}

	@Override
	public void goTo(final Place place) {
		if (place instanceof S2bPlace) {
			String perspective = ((S2bPlace)place).getPerspective();
			if (perspective == null) {
				super.goTo(place);
			}
			else {
				asyncMapperLoader.load(perspective, new AsyncMapperLoaderCallback() {
					@Override
					public void onSuccess() {
						AsyncPlaceController.super.goTo(place);
					}

					@Override
					public void onFailure(final Throwable caught) {
						AsyncPlaceController.super.goTo(new StartPlace(null));
					}

					@Override
					public void onNothingToLoad() {
						AsyncPlaceController.super.goTo(place);
					}
				});
			}
		}
		else {
			super.goTo(place);
		}
	}
}
