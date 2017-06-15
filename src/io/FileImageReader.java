/**
 * 
 */
package io;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import io.ImageFileAttribute.FileType;
import utils.Debug;

/**
 * Convenience class for reading images
 * @author NeilDG
 *
 */
public class FileImageReader {
	private final static String TAG = "SR_ImageReader";
	//Change as necessary
	private final static String DIRECTORY_PATH = "C:/Users/NeilDG/Documents/MSCSGithubProjects/OpenCV_BeginnerTutorial/img/test_case";
	
	private static FileImageReader sharedInstance = null;
	public static FileImageReader getInstance() {
		return sharedInstance;
	}
	
	private FileImageReader() {
		
	}
	
	public static void initialize() {
		sharedInstance = new FileImageReader();
	}
	
	public static void destroy() {
		sharedInstance = null;
	}
	
	public void setContext() {
		
	}
	
	/**
	 * Reads an image from file and returns its matrix form represented by openCV
	 * @param fileName
	 * @return
	 */
	public Mat imReadOpenCV(String fileName, FileType fileType) {
		
		if(fileName.toLowerCase().contains(".jpg") == true) {
			Debug.log(TAG, "Filepath for imread: " + fileName);
			return Imgcodecs.imread(fileName);
		}
		else {
			String completeFilePath =  DIRECTORY_PATH + "/" + fileName + ImageFileAttribute.getFileExtension(fileType);
			Debug.log(TAG, "Filepath for imread: " + completeFilePath);
			return Imgcodecs.imread(completeFilePath);
		}
	}
}
