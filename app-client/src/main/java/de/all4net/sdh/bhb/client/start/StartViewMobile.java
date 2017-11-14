package de.all4net.sdh.bhb.client.start;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;

import gwt.material.design.client.ui.MaterialDatePicker;

@Singleton
public class StartViewMobile extends Composite implements StartView {

	interface Binder extends UiBinder<Widget, StartViewMobile> {
	}

	private static Binder binder = GWT.create(Binder.class);

	@UiField
	MaterialDatePicker datum1;
	@UiField
	MaterialDatePicker datum2;
	@UiField
	MaterialDatePicker datum3;
	@UiField
	MaterialDatePicker datum4;
	@UiField
	MaterialDatePicker datum5;

	public StartViewMobile() {
		initWidget(binder.createAndBindUi(this));
	}
}
