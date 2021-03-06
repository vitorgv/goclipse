/*******************************************************************************
 * Copyright (c) 2000, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui;

import java.text.MessageFormat;

public final class LangUIMessages extends LangUIMessages_Actual {
	
	private LangUIMessages() {} // Do not instantiate
	
	public static String LangPlugin_internal_error = 
			"Internal Error";
	public static String ExceptionDialog_seeErrorLogMessage = 
			"See error log for more details.";
	
	
	
	public static String mainLaunchTab_title = 
			"Main";
	
	public static final String mainTab_projectGroup =
			"Project:";
	public static String mainTab_projectButton =
			"Browse...";
	
	public static String projectField_chooseProject_title = "Project selection";
	public static String projectField_chooseProject_message = "Select a project";
	
	
	public static final String ProgramPathField_title = 
			"Program path:";
	public static String ProgramPathField__searchButton = 
			"Browse...";
	public static String mainTab_ProgramPath_searchButton_title = 
			"Program selection";
	public static String mainTab_ProgramPath_searchButton_message =
			"Select a binary to run";
	
	public static String error_ProgramPathNotValid =
			"Program path not valid.";
	public static String error_ProgramPathNotExistingFile =
			"Program path does not point to an existing file.";
	
	public static String error_CannotBrowse =
			"Cannot open browse dialog.";

	
	public static final String LangArgumentsTab_Program_Arguments = 
			"Program Arguments";
	public static final String LangArgumentsTab_Variables = 
			"Variables";
	public static final String Launch_common_Exception_occurred_reading_configuration_EXCEPTION = 
			"Exception occurred reading launch configuration";
	public static final String LangArgumentsTab_Arguments = 
			"Arguments";
	
	public static String getFormattedString(String message, Object... args) {
		return MessageFormat.format(message, args);
	}
	
}