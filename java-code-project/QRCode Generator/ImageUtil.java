package henu;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


import javax.imageio.ImageIO;


public class ImageUtil {


public static String cutImage(String srcPath, int width, int height) throws IOException {
		File srcFile = new File(srcPath);
		BufferedImage image = ImageIO.read(srcFile);
		int srcWidth = image.getWidth(null);
		int srcHeight = image.getHeight(null);
		int newWidth = 0, newHeight = 0;
		int x = 0, y = 0;
		double scale_w = (double) width / srcWidth;
		double scale_h = (double) height / srcHeight;
		System.out.println("scale_w=" + scale_w + ",scale_h=" + scale_h);
		// 按原比例缩放图片
		if (scale_w < scale_h) {
			newHeight = height;
			newWidth = (int) (srcWidth * scale_h);
			x = (newWidth - width) / 2;
		} else {
			newHeight = (int) (srcHeight * scale_w);
			newWidth = width;
			y = (newHeight - height) / 2;
		}
		BufferedImage newImage = new BufferedImage(newWidth, newHeight,BufferedImage.TYPE_INT_RGB);
		newImage.getGraphics().drawImage(image.getScaledInstance(newWidth, newHeight,Image.SCALE_SMOOTH), 0, 0, null);
		// 图片格式
		String fileSufix = srcFile.getName().substring(srcFile.getName().lastIndexOf(".") + 1);
		//图片名称
		String fileName = srcFile.getName().substring(srcFile.getName().lastIndexOf("/")+1,srcFile.getName().lastIndexOf("."));
		//使用UUID生产随机名称防止重名
		String string = UUID.randomUUID().toString();
		File destFile = new File(srcFile.getParent(), fileName+"_changed_"+string+ "." + fileSufix);
		// 保存裁剪后的图片
		ImageIO.write(newImage.getSubimage(x, y, width, height), fileSufix,destFile);
		return destFile.toString();
	}


	public static void main(String[] args) throws Exception {
		String path ="D:/Koala.png";
		String cutImage = ImageUtil.cutImage(path, 69, 69);
		System.out.println(cutImage);
	}
}