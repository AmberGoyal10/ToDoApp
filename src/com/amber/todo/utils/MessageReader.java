package com.amber.todo.utils;

import java.util.ResourceBundle;
import static com.amber.todo.utils.Constants.MESSAGE_BUNDLE_FILE_NAME;

public class MessageReader {
	static ResourceBundle rb = ResourceBundle.getBundle(MESSAGE_BUNDLE_FILE_NAME);
	
	public static String getValue(String key) {
		return rb.getString(key);
	}
}
