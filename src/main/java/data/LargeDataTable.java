package data;

import java.util.ArrayList;
import java.util.List;

public class LargeDataTable implements BTable {

	protected final List<Object[]> data;
	
	protected long lastUpdate;
	
	public LargeDataTable( int size) {
		DataLoader.getInstance();
		this.data = new ArrayList<>();
		this.lastUpdate = 0;
	}

	public long lastUpdate() {
		return lastUpdate;
	}

	public void lastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void add(Object[] arg) {
		if (arg == null) {
			return;
		}
		data.add(arg);
	}

	public List<Object[]> values() {
		return data;
	}

	public int size() {
		return data.size();
	}

	public void clear() {
		this.data.clear();
	}

	@Override
	public Object[] get(String key) {
		throw new UnsupportedOperationException("不支持此方法.");
	}

	@Override
	public void put(String key, Object[] v) {
		this.add(v);
	}


	@Override
	public void load() {
		throw new UnsupportedOperationException();
	}


	@Override
	public void dump() {
		throw new UnsupportedOperationException();
	}

	public void diffLoad() {
		throw new UnsupportedOperationException();
	}
	
	public void rtLoad() {
		throw new UnsupportedOperationException();
	}

}
