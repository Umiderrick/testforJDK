/**
 * 
 */
package dp.pb.test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author pengbo
 *
 */
public class FireWallDef extends ConcurrentHashMap<String,IpAnalyze> {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static  FireWallDef ipmap ;
	
	private  FireWallDef(){
		ipmap=new FireWallDef();
	}
	
	public static FireWallDef getIns(){
		 if(ipmap==null){
			return new FireWallDef();
		 }
		 return ipmap;
	}
	
}
