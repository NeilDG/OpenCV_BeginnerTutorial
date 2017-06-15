/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.photo.AlignMTB;
import org.opencv.photo.Photo;

import io.FileImageReader;
import io.FileImageWriter;
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
		FileImageWriter.initialize();
	}
	
	public void perform() {
		
		int maxImages = 5;
		Mat[] loadedImages = new Mat[maxImages];
		
		Mat denoiseMat = new Mat();
				
		//load images
		for(int i = 0; i < maxImages; i++) {
			loadedImages[i] = FileImageReader.getInstance().imReadOpenCV(Integer.toString(i + 1), FileType.JPEG);
			loadedImages[i].convertTo(loadedImages[i], CvType.CV_16UC4);
			
			if(i == 0) {
				//simply copy the first image to the final output mat
				loadedImages[0].copyTo(denoiseMat);
			}
		}
		
		//accumulate the values
		
		
		//divide the values depending on how many images were accumulated
		
		
		//save the denoise mat as image
		
		
	}
	
	 public static Mat induceNoise(Mat inputMat) {
        Mat noiseMat = new Mat(inputMat.size(), inputMat.type());
        Core.randn(noiseMat, 25, 25);

        Core.add(noiseMat, inputMat, inputMat);
        return inputMat;
	 }
}
