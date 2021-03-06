package melnorme.lang.ide.ui;

import java.util.List;

import melnorme.lang.ide.ui.editors.ILangEditorTextHover;

import com.googlecode.goclipse.editors.TextHover;
import com.googlecode.goclipse.ui.GoUIPlugin;

/**
 * Alias for the actual running plugin, used by Lang code. 
 */
public final class LangUIPlugin_Actual extends GoUIPlugin {
	
	protected static GoUIPlugin __getInstance() {
		return GoUIPlugin.getInstance();
	}
	
	// ID to start the debug plugin automatically, if present
	protected static final String DEBUG_PLUGIN_ID = "com.googlecode.goclipse.debug";
	
	public static void initTextHovers(List<Class<? extends ILangEditorTextHover<?>>> textHoverSpecifications) {
		textHoverSpecifications.add(TextHover.class);
	}
	
}