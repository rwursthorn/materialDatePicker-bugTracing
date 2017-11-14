package de.all4net.sdh.bhb.client.gin;

import com.google.gwt.core.shared.GWT;

public class ApplicationGinjectorProviderDefault implements ApplicationGinjectorProvider {

	@Override
	public ApplicationGinjector get() {
		return GWT.create(ApplicationGinjectorMobile.class);
	}
}
