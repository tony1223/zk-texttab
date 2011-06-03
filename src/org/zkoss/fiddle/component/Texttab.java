package org.zkoss.fiddle.component;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zul.Tab;
import org.zkoss.zul.impl.api.InputElement;

public class Texttab extends Tab {

	public Texttab(){
		super();
	}
	
	public Texttab(String label){
		super(label);
	}
	
	public Texttab(String label, String image) {
		super(label, image);
	}
	
	protected boolean isChildable() {
		return true;
	}
	
	public void beforeChildAdded(Component child, Component refChild) {
		if (!(child instanceof InputElement))
			throw new UiException("Unsupported child for texttab: "+child);
		
		if(this.getChildren().size() >1)
			throw new UiException("only allow one child for texttab: "+child);
		
	}
	

}
