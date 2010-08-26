package es.optsicom.res.client.util.samples;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import es.optsicom.res.client.util.ZipCreator;
import es.optsicom.res.client.util.ZipCreatorException;

public class Sample {

	public static void main(String[] args) throws ZipCreatorException, IOException {
		ZipCreator zipCreator = new ZipCreator();
		
		// Sets images the base folder. Files added will be relativized to this folder
		zipCreator.setBaseDir("images");
		String zipName = "images1" + getTimeStamp() + ".zip";
		zipCreator.zip("images", zipName);
		
		// Sets the "images/verde-gris" dir the base folder (the project folder)
		zipCreator = new ZipCreator();
		zipCreator.setBaseDir("images/verde-gris");
		zipName = "images2" + getTimeStamp() + ".zip";
		zipCreator.zip("images/verde-gris", zipName);
		
	}
	
	public static String getTimeStamp() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String cadenaFecha = formato.format(calendar.getTime());
		
		return cadenaFecha;
	}
	
}
