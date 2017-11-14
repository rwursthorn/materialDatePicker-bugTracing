package de.all4net.sdh.bhb.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;

import de.all4net.sdh.bhb.client.main.AsyncMapperLoader;
import de.all4net.sdh.bhb.client.main.AsyncMapperLoaderImpl;

public class ApplicationGinModuleMobile extends AbstractGinModule {

	@Override
	protected void configure() {
		install(new GinModule());

		bind(AsyncMapperLoader.class).to(AsyncMapperLoaderImpl.class);
	}
}
