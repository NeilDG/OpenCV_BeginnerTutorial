/**
 * 
 */
package main;

import org.opencv.core.Mat;

import io.FileImageReader;
import io.ImageFileAttribute.FileType;
import utils.Debug;

/**
 * Class that performs the simple average image denoising
 * @author NeilDG
 *
 */
public class ImageDenoiseWorker {
	private final static String TAG = "ImageDenoiseWorker";
	
	public ImageDenoiseWorker() {
		FileImageReader.initialize();
	}
	
	public void perform() {
		//open first image
		Mat imageMat = FileImageReader.getInstance().imReadOpenCV("1", FileType.JPEG);
		
		Debug.log(TAG, "Image mat properties: " +imageMat.toString());
	}
}
