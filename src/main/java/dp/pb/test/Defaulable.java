package dp.pb.test;

public interface Defaulable {
	  default String notRequired() { 
	        return "Default implementation"; 
	    }        
}
