// Physician class

public class Physician {
    String name, speciality;
    int rank;

    Physician(String name, String speciality, int rank) {
        this.name = name;
        this.speciality = speciality;
        this.rank = rank;
    }

    public void meetPatient(String patient, String med) {
        System.out.println(name + " prescribe " + med + " to " + patient);

        rank++;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void display() {
        System.out.println("Name: " + name + " Speciality: " + speciality + " Rank: " + rank);
    }

}
