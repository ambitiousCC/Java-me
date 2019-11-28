package henu;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;
/**
 * @author 		ambitiousCC
 * @version 	1.1
 * @function: 	根据自己的需要生产二维码(可以插入logo图片)
 * @need:		需要QRCode.jar包
 * 
 * 
 *	new QrcodeTool(content,outputImagePath,isLogo,logoSrc);
 */
public class QrcodeTool {
	
	public QrcodeTool(String content,String imgPath) {
		QrcodeTool.setFLAG(false);
		getQrcodeImage(content,imgPath);
	}

	public QrcodeTool(String content,String imgPath,boolean FLAG, String inputImgPath) {
		QrcodeTool.setFLAG(true);
		QrcodeTool.setInputImgPath(inputImgPath);
		getQrcodeImage(content,imgPath);
	}
	
	private static boolean FLAG;
	private static String inputImgPath;
	
	public static boolean isFLAG() {
		return FLAG;
	}

	public static void setFLAG(boolean fLAG) {
		FLAG = fLAG;
	}

	public static String getInputImgPath() {
		return inputImgPath;
	}

	public static void setInputImgPath(String inputImgPath) {
		QrcodeTool.inputImgPath = inputImgPath;
	}

	public static void getQrcodeImage(String content,String imgPath) {
		int width=235;
		int height=235;
		
		Qrcode qrcode = new Qrcode();
		qrcode.setQrcodeEncodeMode('B');
		qrcode.setQrcodeErrorCorrect('M');
		qrcode.setQrcodeVersion(15);
		BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		Graphics2D g = image.createGraphics();
		
		g.setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		g.clearRect(0, 0, width, height);
		byte[] codeQut;
		try {
			codeQut = content.getBytes("utf-8");
			boolean[][] code = qrcode.calQrcode(codeQut);
			for(int i=0;i<code.length;i++) {
				for(int j=0;j<code.length;j++){
					if(code[j][i]) {
						g.fillRect(j*3+2, i*3+2, 3, 3);
					}
				}
			}
			
			if(isFLAG()) {
				//如果有logo，logo的尺寸应该是69*69
				setInputImgPath(ImageUtil.cutImage(getInputImgPath(),69,69));
				File file = new File(getInputImgPath());
				Image srcImage = ImageIO.read(file);
				int imgWidth = srcImage.getWidth(null);
				int imgHeight = srcImage.getHeight(null);
				g.drawImage(srcImage, 83, 83, imgWidth, imgHeight, null);
			}
			
			g.dispose();
			image.flush();
			ImageIO.write(image, "png", new File(imgPath));
			System.out.println("okk");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new QrcodeTool("duang","D:/1.png",true,"D:/Jellyfish.jpg");
	}
}