package de.all4net.sdh.bhb.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.ui.RootPanel;

import de.all4net.sdh.bhb.client.gin.ApplicationGinjector;
import de.all4net.sdh.bhb.client.gin.ApplicationGinjectorProvider;

public class App implements EntryPoint {

	@Override
	public void onModuleLoad() {

		// Wenn Zahlen Tausender-Trenner enthalten (das ist der default), können sie nicht in MLongBox angezeigt werden.
		// Daher Zahlenformat ohne Tausender-Trenner setzen.
		changeCachedDecimalFormat(NumberFormat.getFormat("###0.######"));

		ApplicationGinjectorProvider ginjectorProvider = GWT.create(ApplicationGinjectorProvider.class);
		ApplicationGinjector injector = ginjectorProvider.get();
		AppPanel panel = injector.getAppPanel();
		RootPanel.get().add(panel);

		// Hide the loading message
		Element loading = Document.get().getElementById("loading");
		loading.getParentElement().removeChild(loading);
	}

	private static native void changeCachedDecimalFormat(NumberFormat f)
	/*-{
		@com.google.gwt.i18n.client.NumberFormat::cachedDecimalFormat = f;
	}-*/;
}
