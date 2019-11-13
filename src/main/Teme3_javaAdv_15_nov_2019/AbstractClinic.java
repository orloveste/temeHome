package main.Teme3_javaAdv_15_nov_2019;

public abstract class AbstractClinic {
//    private String Parient;// nu stiu daca am nevoie de el
// ●   Create a field of type AbstractPatient[] named currentPatients; since you want to access
//this field in the subclasses, you need to make sure it’s protected
    protected AbstractPatient[] currentPatient;
//● Create three abstract methods :
    public void takeInNewPatient(AbstractPatient newPatient){ }//(Patient newPatient);
    public void releasePatient(AbstractPatient existingPatient){ }//(Patient existingPatient);
    public void listCurrentPatients(){ }
// ● Create a constructor that takes one parameter of type AbstractPatient[]. This means that
//the constructor takes an array of AbstractPatients. This parameter should set the value
//of the currentPatients field.
//● Create a getter for currentPatients.
    public void setCurrentPatient(AbstractPatient[] currentPatient) {
        this.currentPatient = currentPatient;
}
    public AbstractPatient[] getCurrentPatient() {
        return currentPatient;
    }

}
