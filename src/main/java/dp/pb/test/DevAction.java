/**
 * 
 */
package dp.pb.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengbo
 *
 */
public class DevAction {

	private String dev;
	
	Map<String, int[]> urls = new HashMap<>();

	
	public DevAction(String dev, String url){
		this.dev = dev;
		this.count(url);
	}

	public String getDev() {
		return dev;
	}

	public void setDev(String dev) {
		this.dev = dev;
	}

	public void count(String url){
		int [] value = urls.get(url);
		if (value==null){
			value = new int[1];
			urls.put(url, value);
		}
		value[0]++;
	}

	public Map<String, int[]> getUrls() {
		return urls;
	}

	public void setUrls(Map<String, int[]> urls) {
		this.urls = urls;
	}
	
	
	
	

}
