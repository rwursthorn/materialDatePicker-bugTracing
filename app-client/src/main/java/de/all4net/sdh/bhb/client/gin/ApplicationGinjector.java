package de.all4net.sdh.bhb.client.gin;

import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.inject.client.NoGinModules;

import de.all4net.sdh.bhb.client.AppPanel;

@NoGinModules
public interface ApplicationGinjector extends Ginjector {
	AppPanel getAppPanel();
}
