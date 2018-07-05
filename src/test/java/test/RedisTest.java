package test;

import org.junit.Test;

public class RedisTest {
	/*private static Jedis jedis;
	static {
		//jedis = new Jedis("192.168.1.164", 6379);
		jedis = new Jedis("127.0.0.1", 6379);
	}*/

	@Test
	public void serialize() {
//		List<String> tags = new ArrayList<String>();
//		tags.add("java");
//		tags.add("node");
//		tags.add("docker");
//		Set<String> error = new HashSet<String>();
//		error.add("machine learning");
//		error.add("nlp");
//		error.addAll(tags);
//		Map<String, String> recommend = new LinkedHashMap<String, String>();
//		recommend.put("bej", "ut");
//		recommend.put("snh", "jxl");
//		recommend.put("gnz", "zt");
//		ObjectTes ot = new ObjectTes("titlejson", "宝宝", tags, error, recommend);
//		//序列化存储
//		jedis.set(ot.getTitle().getBytes(), SerializeUtils.serialize(ot));
//		//json形式存储
//		String jsonString2 = JSON.toJSONString(ot);  
//		jedis.set(ot.getTitle(), jsonString2);
//		byte[] bytes = jedis.get(ot.getTitle().getBytes());
//		ObjectTes ot_ = (ObjectTes) SerializeUtils.deSerialize(bytes);
//		String ot3 =jedis.get(ot.getTitle());
//		System.out.println(ot_.toString());
//		System.out.println(ot3);
	}
}
