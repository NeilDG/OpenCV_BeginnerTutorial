/**
 * 
 */
package io;

import java.io.File;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import utils.Debug;

/**
 * Convenience class for writing images into a file
 * @author NeilDG
 *
 */
public class FileImageWriter {
	private final static String TAG = "SR_ImageWriter";
	
	private static FileImageWriter sharedInstance = null;
	public static FileImageWriter getInstance() {
		return sharedInstance;
	}
	
	private FileImageWriter() {
		
	}
	
	public static void initialize() {
		sharedInstance = new FileImageWriter();
	}
	
	public static void destroy() {
		sharedInstance = null;
	}
	
	public void saveMatrixToImage(Mat mat, String fileName, ImageFileAttribute.FileType fileType) {
		File imageFile = new File(FileImageReader.DIRECTORY_PATH, fileName + ImageFileAttribute.getFileExtension(fileType));
		Imgcodecs.imwrite(imageFile.getAbsolutePath(), mat);

		Debug.log(TAG, "Saved " + imageFile.getAbsolutePath());
	}
}
