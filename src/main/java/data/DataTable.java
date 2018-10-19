package data;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DataTable  implements BTable {
	
	protected final Map<String, Object[]> data;
	
	protected long lastUpdate;
	protected String lastDumpPoint;
	
	DataTable(int size) {
		DataLoader.getInstance();
		this.data = new ConcurrentHashMap<>(size);
		this.lastUpdate = 0;
	}

	public void put(String key, Object[] v) {
		data.put(key, v);
	}

	public Object[] get(String key) {
		return data.get(key);
	}

	public void remove(String key) {
		if (key != null) {
			data.remove(key);
		}
	}
	
	public  Map<String, Object[]> getData(){
		return this.data;
	}
	
	public int size() {
		return data.size();
	}
	
	public void clear(){
		this.data.clear();
	}

	@Override
	public Collection<Object[]> values() {
		return data.values();
	}

	public void lastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public void load() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void dump() {
		throw new UnsupportedOperationException();
	}

	@Override
	public long lastUpdate() {
		return this.lastUpdate;
	}
}
