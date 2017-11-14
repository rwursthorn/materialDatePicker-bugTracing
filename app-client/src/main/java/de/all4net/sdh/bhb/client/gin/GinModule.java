package de.all4net.sdh.bhb.client.gin;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

import de.all4net.sdh.bhb.client.AppPanel;
import de.all4net.sdh.bhb.client.MobilePanel;
import de.all4net.sdh.bhb.client.S2bActivityMapper;
import de.all4net.sdh.bhb.client.main.AsyncPlaceController;
import de.all4net.sdh.bhb.client.start.StartView;
import de.all4net.sdh.bhb.client.start.StartViewMobile;

public class GinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

		bind(StartView.class).to(StartViewMobile.class);

		bind(ActivityMapper.class).to(S2bActivityMapper.class);
		bind(PlaceController.class).to(AsyncPlaceController.class);
		bind(AppPanel.class).to(MobilePanel.class);
	}
}
