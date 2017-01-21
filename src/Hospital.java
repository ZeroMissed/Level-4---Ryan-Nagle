import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> doctors = new ArrayList<Doctor>();
	List<Patient> patients = new ArrayList<Patient>();
	List<Zombie> zombies = new ArrayList<Zombie>();

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(i % doctors.size()).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				e.printStackTrace();
			}
		}
	}

	public void add(Object obj) {
		if(obj instanceof Doctor) 
			this.addDoctor((Doctor) obj);
		if(obj instanceof Patient)
			this.addPatient((Patient) obj);
		if(obj instanceof Zombie)
			this.addZombie((Zombie) obj);
		
	}

	public void addZombie(Zombie zombie) {
		zombies.add(zombie);
	}

	public void makeDoctorsWork() {
		for(Doctor i : doctors) {
			i.doMedicine();
		}
		
	}

	public List<Zombie> getZombies() {
		return zombies;
	}

}
