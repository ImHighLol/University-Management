package management.domain;

import management.domain.ENUM.Situation;
import management.domain.ENUM.State;

import java.awt.*;
import java.util.List;

public class Student {
    private int ID;
    private String Name;
    private String Family_Name;
    private String Birthday;
    private State STATE;
    private Situation SITUATION ;
    private String Photo;
    private List<Absence> absences;


    /**
     * Getters and Setters
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

    public String getFamily_Name() {
        return Family_Name;
    }

    public void setFamily_Name(String family_Name) {
        Family_Name = family_Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public State getSTATE() {
        return STATE;
    }

    public void setSTATE(State STATE) {
        this.STATE = STATE;
    }

    public Situation getSITUATION() {
        return SITUATION;
    }

    public void setSITUATION(Situation SITUATION) {
        this.SITUATION = SITUATION;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public List<Absence> getAbsences() {
        return absences;
    }

    public void setAbsences(List<Absence> absences) {
        this.absences = absences;
    }

    /**
     * Customized Printing Function
     */
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Family_Name='" + Family_Name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", STATE=" + STATE +
                ", SITUATION=" + SITUATION +
                ", Photo=" + Photo +
                ", absences=" + absences +
                '}';
    }
}
