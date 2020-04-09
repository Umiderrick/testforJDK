package data;


import java.util.Calendar;


public class DataLoader {
	
	static long salesDataMaxDate = 0;


	static {
	}

	DataDump dump =  DataDump.getInstance();

	private final static DataLoader dataLoader = new DataLoader();

	public static DataLoader getInstance() {
		return dataLoader;
	}


	private boolean checkUpdate(long lastUpdate) {
		int hh = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		return !checkPeriod(Calendar.DATE, lastUpdate) && hh >= 8;
	}


	public static boolean checkPeriod(int period, long millis) {
		Calendar cal0 = Calendar.getInstance();
		int P0 = cal0.get(period);
		cal0.setTimeInMillis(millis);
		int P1 = cal0.get(period);
		return P0 == P1;
	}

	
	
}