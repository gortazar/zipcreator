package es.optsicom.res.client.util.samples;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import es.optsicom.res.client.util.ZipCreate;
import es.optsicom.res.client.util.ZipCreationException;

public class Sample {

	public static void main(String[] args) throws ZipCreationException, IOException {
		ZipCreate zipCreator = new ZipCreate();
		
		// Sets the base folder. Files added will be relativized to this folder
		zipCreator.setBaseDir("images");
		String zipName = "images" + getTimeStamp() + ".zip";
		zipCreator.zip("images", zipName);
	}
	
	public static String getTimeStamp() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String cadenaFecha = formato.format(calendar.getTime());
		
		return cadenaFecha;
	}
	
}
