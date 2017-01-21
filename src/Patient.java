
public class Patient {
	boolean pulseCheck = false;
	boolean alive = true;
	
	public void checkPulse() {
		pulseCheck = true;
	}

	public boolean feelsCaredFor() {
		return pulseCheck;
	}

	public boolean isAlive() {
		return alive;
	}

	public void kill() {
		alive = false;
	}

}
