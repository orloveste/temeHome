package main.Teme3_javaAdv_15_nov_2019;

public abstract class AbstractPatient {
//   4 ● Create a protected field called ‘ name’ . What type should this variable be if it represents a
//    name?
    private String name;

    public String getName() {
        return name;
    }

//   4 ● Create a constructor that receives a parameter of type String called newName. This
//    constructor should set the value of the private field name.
    public void setName(String newName) {
         name = newName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
