package data;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public final class DataDump {

	private final Map<String, Object> dumpDashboard = new HashMap<>();

	private long dushLastUpdate;

	private static final DataDump dump = new DataDump();

	public static DataDump getInstance() {
		return dump;
	}

	private DataDump() {
		DataLoader.getInstance();
	}

	public Map<String, Object> loadDash(String fpath) throws Exception {
		File fd = new File(fpath);
		if (!fd.exists()) {
			return dumpDashboard;
		}

		if (fd.lastModified() <= this.dushLastUpdate) {
			return this.dumpDashboard;
		}

		try {
			byte b[] = Files.readAllBytes(Paths.get(""));
			Map<String, Object> m = JSON.parseObject(b, Map.class);
			dumpDashboard.putAll(m);
			this.dushLastUpdate = fd.lastModified();
		} catch (Exception e) {
			throw e;
		}
		return dumpDashboard;
	}

	public synchronized void syncDash() {
		byte[] b = JSON.toJSONBytes(dumpDashboard);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("");
			out.write(b);
		} catch (Exception e) {
		} finally {
			IOUtils.close(out);
		}
	}

	public static void main(String[] args) throws Exception {
		DataDump dump = new DataDump();
		dump.loadDash("");
	}
}

