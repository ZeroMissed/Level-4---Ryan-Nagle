import java.util.ArrayList;
import java.util.List;

public class Doctor {

	List<Patient> patients = new ArrayList<Patient>();

	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (patients.size() == 3)
			throw new DoctorFullException();
		patients.add(patient);
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (Patient i : patients) {
			i.checkPulse();
		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

}
