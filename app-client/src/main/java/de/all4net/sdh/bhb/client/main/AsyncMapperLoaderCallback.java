package de.all4net.sdh.bhb.client.main;

public interface AsyncMapperLoaderCallback {

	void onSuccess();

	void onFailure(Throwable caught);

	void onNothingToLoad();

}
