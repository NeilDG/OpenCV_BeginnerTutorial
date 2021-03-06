/**
 * 
 */
package main;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import utils.Debug;

/**
 * Main Entry point of the class
 * @author NeilDG
 *
 */
public class MainActivity {
	private final static String TAG = "MainActivity";
	
	public static void main(String[] args) {
		//IMPORTANT: Load system library of OpenCV
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		ImageDenoiseWorker imageDenoiseWorker = new ImageDenoiseWorker();
		imageDenoiseWorker.perform();
	}

}
