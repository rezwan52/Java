// Hospital class

public class Hospital {
    public static void main(String[] args) {
        Physician myPhys = new Physician("Atik", "Child Specialist", 3);

        myPhys.meetPatient("Delo Boudi", "Napa-Extra");

        myPhys.display();
    }
}

// output: Atik prescribe Napa-Extra to Delo Boudi
// output: Name: Atik Speciality: Child Specialist Rank: 4