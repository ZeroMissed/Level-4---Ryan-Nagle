import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doctor {

	private List<Patient> patients = new ArrayList<Patient>();
	private boolean evil = false;
	private String name;
	private Hospital hospital;

	public Doctor() {
	}

	public Doctor(String name) {
		this.name = name;
		if (name == "666")
			this.joinTheDarkSide();
	}

	public Doctor(String name, Hospital hospital) {
		this.name = name;
		this.hospital = hospital;

		if (name == "666")
			this.joinTheDarkSide();
	}

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patients.size() == 3)
			throw new DoctorFullException();
		patients.add(patient);
	}

	public void doMedicine() {

		for (Patient i : patients) {
			if (evil) {
				i.kill();
				if (!(hospital == null)) {
					hospital.add(new Zombie(new Date().toString()));
					hospital.getPatients().remove(i);
				}
			} else
				i.checkPulse();
		}
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public boolean isEvil() {
		return evil;
	}

	public void joinTheDarkSide() {
		evil = true;
	}

	public Hospital getHospital() {
		return hospital;
	}

}
