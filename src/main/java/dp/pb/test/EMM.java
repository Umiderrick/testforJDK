/**
 * 
 */
package dp.pb.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pengbo
 *
 */
public class EMM {

	public static void main(String[] args){
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a ="2017-11-01 00:00:00";
		String b ="2017-12-01 00:00:00";
		try {
			Date parsea = sdf.parse(a);
			Date parseb = sdf.parse(b);
			System.out.println(parsea.getTime());
			System.out.println(parseb.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
