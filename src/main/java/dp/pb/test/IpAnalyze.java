/**
 * 
 */
package dp.pb.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author pengbo
 *
 */
public class IpAnalyze {

	private String ip;
	
	private String minStamp;
	
	// dev
	private Map<String ,DevAction> devs;
	
	public IpAnalyze(){
		devs=new LinkedHashMap<>();
	}

	public String getMinStamp() {
		return minStamp;
	}

	public void setMinStamp(String minStamp) {
		if (minStamp != null)
			this.minStamp = minStamp.intern();
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip.intern();
	}


	public Map<String, DevAction> getDevs() {
		return devs;
	}

	public void setDevs(Map<String, DevAction> devs) {
		this.devs = devs;
	}

	/**
	 * @param dv
	 */
	public void adddva(String tim ,DevAction dv,String url) {
		//时间段筛选\有进行设备urlcount \无新建
		if(devs.containsKey(tim)){
			DevAction devAction = devs.get(tim);
			//时间包含 叠加 
			if(devAction.urls.get(url)!=null){
				devAction.count(url);
			};
		}else{
			devs.put(tim, dv);
		}
		
		
	}
	
	
}
