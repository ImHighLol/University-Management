package management.domain;



public class Groups {
    private int ID;
    private String Name;
    private int Num_of_Student;
    private String Email;
    private int Study_Level;


    /**
     * Getters and setters
     */

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNum_of_Student() {
        return Num_of_Student;
    }

    public void setNum_of_Student(int num_of_Student) {
        Num_of_Student = num_of_Student;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getStudy_Level() {
        return Study_Level;
    }

    public void setStudy_Level(int study_Level) {
        Study_Level = study_Level;
    }

    /**
     * Customized Printing Function
     */
    @Override
    public String toString() {
        return "Groups{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Num_of_Student=" + Num_of_Student +
                ", Email='" + Email + '\'' +
                ", Study_Level=" + Study_Level +
                '}';
    }
}
