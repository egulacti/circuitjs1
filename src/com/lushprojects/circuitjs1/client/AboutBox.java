/*    
    Copyright (C) Paul Falstad and Iain Sharp
    
    This file is part of CircuitJS1.

    CircuitJS1 is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    CircuitJS1 is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CircuitJS1.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.lushprojects.circuitjs1.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Button;

public class AboutBox extends PopupPanel {
	
	VerticalPanel vp;
	Button okButton;
	
	AboutBox(String version) {
		super();
		vp = new VerticalPanel();
		setWidget(vp);
		vp.setWidth("400px");
		vp.add(new HTML("<p>Circuit Simulator version "+version+".</p>"+
		"<p>Student Mode by Ersin Gulacti @ Yontem Teknoloji.<br><a href=\"http://yontemteknoloji.com//\" target=\"_blank\">http://yontemteknoloji.com/</a></p>"+
		"See the GNU General Public License for more details.</p>"+
		"<p style=\"font-size:9px\">For details of licensing see <A href=\"http://www.gnu.org/licenses/\" target=\"_blank\">http://www.gnu.org/licenses/</A>.</p>"+
		"<p style=\"font-size:9px\">Source code (Ersin):<A href=\"https://github.com/egulacti/circuitjs1\" target=\"_blank\">https://github.com/egulacti/circuitjs1</A></p>"    
		));
		
		
		vp.add(okButton = new Button("OK"));
		okButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				close();
			}
		});
		center();
		show();
	}

	public void close() {
		hide();
	}
}
