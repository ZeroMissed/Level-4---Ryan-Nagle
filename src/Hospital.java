import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> doctors = new ArrayList<Doctor>();
	List<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(i % 3).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
