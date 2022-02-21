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
package us.adarsh_agrahara.auth.register;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;

import us.adarsh_agrahara.auth.dao.UserModel;
import us.adarsh_agrahara.auth.page.AuthBasePage;

@AuthorizeInstantiation("is_anonymous")
public class RegisterPage extends AuthBasePage {
	private static final long serialVersionUID = 1L;

	public RegisterPage() {
		UserModel user = new UserModel();
		add(new RegisterPanel("registerPanel", user));
	}
}
