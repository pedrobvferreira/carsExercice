package com.ce.app.controller.helper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author pedro.ferreira
 * **/
public abstract class FileConvertHelper {
	static Logger logger = Logger.getLogger(FileConvertHelper.class.getName());
	
	/** Writes a String into a File **/
	public static void writeFileString(String fileName, String text) {
		try {
			// Create an object of BufferedWriter
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(System.getProperty("user.home") + fileName));
			// Write text(content) to file
			writeFile.write(text);
			// Close the BufferedWriter object
			writeFile.close();
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
	}
	
	/** Writes a List String into a File **/
	public static void writeFileList(String fileName, List<String> lstText) {
		try {
			// Create an object of BufferedWriter
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(System.getProperty("user.home") + fileName));
			for (String text : lstText) {
				writeFile.write(text + System.lineSeparator());
			}
			// Close the BufferedWriter object
			writeFile.close();
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
	}
}
