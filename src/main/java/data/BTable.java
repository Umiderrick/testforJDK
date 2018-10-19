package data;

import java.util.Collection;

import com.alibaba.fastjson.JSON;

public interface BTable {
	
	int BUFF_SIZE = 8 * 1024 * 1024;
	
	Object[] get(String key);

	void put(String key, Object[] v);

	int size();

	Collection<Object[]> values();

	void load();

	void dump();

	long lastUpdate();
	
	default Object[] parse(String json) {
		if (json != null && json.length() > 0) {
			try {
				return JSON.parseObject(json, Object[].class);
			} catch (Exception e) {
				// NOP
			}
		}
		return null;
	}
}
