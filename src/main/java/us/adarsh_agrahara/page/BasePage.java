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

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

import us.adarsh_agrahara.auth.dao.UserModel;
import us.adarsh_agrahara.panel.AnonymPanel;
import us.adarsh_agrahara.panel.AuthPanel;
import us.adarsh_agrahara.wicket.security.UserSession;

abstract public class BasePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public BasePage() {

		// Language switch
//		add(new LanguagePanel("language", Locale.ENGLISH, Locale.ENGLISH));

		// feedback panel to show errors and informations
		add(new FeedbackPanel("feedback"));

		// panel for guests
		add(new AnonymPanel("anonymPanel"));

		// panel for authenticated users
		add(new AuthPanel("authPanel"));
	}

	@SuppressWarnings("unchecked")
	@Override
	public UserSession<UserModel> getSession() {
		return (UserSession<UserModel>)super.getSession();
	}

	public UserModel getUser() {
		return getSession().getUser();
	}
}
