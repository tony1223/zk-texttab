package org.zkoss.fiddle.component;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zul.Tab;
import org.zkoss.zul.impl.api.InputElement;

public class Texttab extends Tab {

	protected boolean isChildable() {
		return true;
	}
	
	public void beforeChildAdded(Component child, Component refChild) {
		if (!(child instanceof InputElement))
			throw new UiException("Unsupported child for rows: "+child);
	}
	

}
