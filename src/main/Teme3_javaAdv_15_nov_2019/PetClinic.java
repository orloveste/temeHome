package main.Teme3_javaAdv_15_nov_2019;

public class PetClinic extends AbstractClinic{
    @Override
    public void takeInNewPatient(AbstractPatient newPatient) {
        super.takeInNewPatient(newPatient);
    }

    @Override
    public AbstractPatient[] getCurrentPatient() {
        return super.getCurrentPatient();
    }

    @Override
    public void setCurrentPatient(AbstractPatient[] currentPatient) {
        super.setCurrentPatient(currentPatient);
    }

//    @Override
//    protected int cliniCapacity() {
//        return 0;
//    }

    @Override
    public void releasePatient(AbstractPatient existingPatient) {
        super.releasePatient(existingPatient);
    }
    @Override
    public void listCurrentPatients() {
        super.listCurrentPatients();
    }
}
