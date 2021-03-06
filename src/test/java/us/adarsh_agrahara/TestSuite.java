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
package us.adarsh_agrahara;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import us.adarsh_agrahara.auth.login.TestLoginPage;
import us.adarsh_agrahara.auth.register.TestRegisterPage;


@RunWith(Suite.class)
@SuiteClasses( {
	TestHomePage.class,
	TestRegisterPage.class,
	TestLoginPage.class
})
public class TestSuite {}
