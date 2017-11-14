package de.all4net.sdh.bhb.client.main;

import com.google.inject.Singleton;

@Singleton
public class AsyncMapperLoaderImpl implements AsyncMapperLoader {

	@Override
	public void load(final String perspective, final AsyncMapperLoaderCallback asyncMapperLoaderCallback) {
		asyncMapperLoaderCallback.onNothingToLoad();
	}
}
