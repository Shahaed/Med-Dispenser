/**
 * Created by thomas on 11/5/16.
 */
public class Patient {
    private String lastName;
    private String firstName;
    private String userID;
    private int medicationTypeInt;
    private String medicationTypes;

    Patient(String last, String first, String ID, int medTypeInt, String medTypes){
        lastName = last;
        firstName = first;
        userID = ID;
        medicationTypeInt = medTypeInt;
        medicationTypes = medTypes;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getMedicationTypeInt() {
        return medicationTypeInt;
    }

    public void setMedicationTypeInt(int medicationTypeInt) {
        this.medicationTypeInt = medicationTypeInt;
    }

    public String getMedicationTypes() {
        return medicationTypes;
    }

    public void setMedicationTypes(String medicationTypes) {
        this.medicationTypes = medicationTypes;
    }
}
