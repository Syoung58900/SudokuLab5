package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	EASY(100), 
	MEDIUM(500), 
	HARD(1000);
	
	private final int iDifficulty;
	
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();
	
	static {
		for (eGameDifficulty d : eGameDifficulty.values()) {
	            lookup.put(d.getDifficulty(), d);
	        }
	    }

	
	private eGameDifficulty(int i){
		this.iDifficulty = i;
	};
	
	public int getDifficulty() {
		return iDifficulty;
	}
	
	static public eGameDifficulty get(int iValue) {
		if (iValue >= 0 && iValue < 100) {
			return null;
		}else if(iValue >= 100 && iValue<500) {
			return EASY;
		}else if(iValue >= 500 && iValue<1000){
			return MEDIUM;
		}else {
			return HARD;
		}
	}
	
}
