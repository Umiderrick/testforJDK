/**
 * 
 */
package QRCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

/**
 * @author pengbo
 *
 */
public class CreateQrCode {
	@SuppressWarnings("deprecation")
	public static String createQrcode(String _text) {
		String qrcodeFilePath = "";
		try {
			int qrcodeWidth = 300;
			int qrcodeHeight = 300;
			String qrcodeFormat = "png";
			HashMap<EncodeHintType, String> hints = new HashMap<EncodeHintType, String>();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			TestBean tb = new TestBean();
			tb.setAddress("aaaaaaaa");
			tb.setAge(15);
			tb.setName("cccccc");
			BitMatrix bitMatrix = new MultiFormatWriter().encode(_text, BarcodeFormat.QR_CODE, qrcodeWidth,
					qrcodeHeight, hints);

			BufferedImage image = new BufferedImage(qrcodeWidth, qrcodeHeight, BufferedImage.TYPE_INT_RGB);
			Random random = new Random();
			File QrcodeFile = new File("D:\\qrcode\\" + random.nextInt() + "." + qrcodeFormat);
			ImageIO.write(image, qrcodeFormat, QrcodeFile);
			MatrixToImageWriter.writeToFile(bitMatrix, qrcodeFormat, QrcodeFile);
			qrcodeFilePath = QrcodeFile.getAbsolutePath();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return qrcodeFilePath;
	}

	public static void main(String[] args) throws NotFoundException, IOException {
		createQrcode("https://api.drplant.com.cn/dp-repo/login.do");
	}
}
