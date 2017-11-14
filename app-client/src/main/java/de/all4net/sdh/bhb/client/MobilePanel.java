package de.all4net.sdh.bhb.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;

import de.all4net.sdh.bhb.client.start.StartPlace;


@Singleton
public class MobilePanel extends Composite implements AppPanel {

	interface Binder extends UiBinder<Widget, MobilePanel> {
	}

	private static Binder binder = GWT.create(Binder.class);

	@UiField
	AcceptsOneWidget mainPanel;

	private final PlaceController placeController;

	@Inject
	public MobilePanel(final EventBus eventBus, final ActivityMapper activityMapper, final PlaceController placeController) {

		this.placeController = placeController;
		initWidget(binder.createAndBindUi(this));

		startActivityManager4mainPanel(activityMapper, eventBus);

		gotoDefaultPlace();
	}

	private void startActivityManager4mainPanel(final ActivityMapper activityMapper, final EventBus eventBus) {
		ActivityManager mpActivityManager = new ActivityManager(activityMapper, eventBus);
		mpActivityManager.setDisplay(mainPanel);
	}

	private void gotoDefaultPlace() {
		placeController.goTo(getDefaultPlace());
	}

	private StartPlace getDefaultPlace() {
		return new StartPlace(null);
	}
}
