/*******************************************************************************
 * Copyright (c) 2012 Anton Bessonov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Creative Commons
 * Attribution 3.0 License which accompanies this distribution,
 * and is available at
 * http://creativecommons.org/licenses/by/3.0/
 * 
 * Contributors:
 *     Anton Bessonov - initial API and implementation
 ******************************************************************************/
package us.adarsh_agrahara.page;

import static us.adarsh_agrahara.wicket.MessageUtils._;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.pages.RedirectPage;
import org.apache.wicket.util.string.Strings;

import us.adarsh_agrahara.auth.dao.UserModel;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;

	public HomePage() {

    	UserModel user = getUser();
    	String userName = "Anonymous";

    	// Set E-Mail as username if have one
    	if(!Strings.isEmpty(user.getEmail())) {
    		userName = user.getEmail();
			
    	} else{
			setResponsePage(new RedirectPage("/login/?1"));
		}
		
    	add(new Label("userGreeting", _("userGreeting", userName)));
		
    }
}
