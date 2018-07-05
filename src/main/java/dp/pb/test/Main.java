/**
 * 
 */
package dp.pb.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pengbo
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// File f =new File("D://ngx.log");
		FileReader reader = new FileReader("D://ngx.log");
		BufferedReader br = new BufferedReader(reader);
		String str = null;
		String ip =null;
		String dt =null;
		IpAnalyze ia =null;
		Map<String,IpAnalyze> fwdf =new HashMap<>();
		while ((str = br.readLine()) != null) {
			int h = str.indexOf('-');
			int l =str.indexOf('[')+1;
			int r =str.indexOf(']')-9;
			int ul =str.indexOf('"')+1;
			int plus =str.substring(ul, str.length()).indexOf('"');
			int rr =str.lastIndexOf('"');
			int ll=str.substring(0, rr).lastIndexOf('"');
			ip = str.substring(0, h);
			dt = str.substring(l, r);
			String url = str.substring(ul, ul+plus);
			String dev = str.substring(ll, rr);
			if(fwdf.containsKey(ip)){
				ia = fwdf.get(ip);
			}else{
				ia=new IpAnalyze();
			}
			//行数据获取完毕
			ia.setIp(ip);
			ia.setMinStamp(dt);
			DevAction dv =new DevAction(dev,url);
			ia.adddva(dt,dv,url);
			fwdf.put(ip, ia);
		}
		br.close();
		reader.close();
	}
}
