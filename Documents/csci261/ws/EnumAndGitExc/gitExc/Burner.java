package gitExc;

public class Burner {
	public enum Temperature {HOT,WARM,COLD};
	private Setting setting;
	private Temperature temp;
	private int tracker;
	private static final int TIME_DURATION = 3;
	public Burner() {
		temp = Temperature.COLD;
		setting = Setting.OFF;
		
	}
	public void increaseSetting(){
		switch(setting){
		case OFF : 
			setting = setting.LOW;
		case LOW : 
			setting = setting.MEDIUM;
		case MEDIUM :
			setting = setting.HIGH;
		}
		tracker = 0;
	}
	public void decreaseSetting(){
		switch(setting){
		case HIGH : 
			setting = setting.MEDIUM;
		case LOW : 
			setting = setting.OFF;
		case MEDIUM :
			setting = setting.LOW;
		}
		tracker = 0;
		
	}
	public void updateTemperature(){
		
		
	}
}
