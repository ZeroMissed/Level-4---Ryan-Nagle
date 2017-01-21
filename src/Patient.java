
public class Patient {
	boolean pulseCheck = false;

	public void checkPulse() {
		pulseCheck = true;
	}

	public boolean feelsCaredFor() {
		return pulseCheck;
	}

}
