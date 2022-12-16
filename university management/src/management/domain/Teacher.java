package management.domain;


import java.awt.*;

public class Teacher {
    private int ID;
    private String Name;
    private String Family_Name;
    private String Personal_Email;
    private String Work_Email;
    private Double Total_Hours_Week;
    private String Photo;


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

    public String getPersonal_Email() {
        return Personal_Email;
    }

    public void setPersonal_Email(String personal_Email) {
        Personal_Email = personal_Email;
    }

    public String getWork_Email() {
        return Work_Email;
    }

    public void setWork_Email(String work_Email) {
        Work_Email = work_Email;
    }

    public Double getTotal_Hours_Week() {
        return Total_Hours_Week;
    }

    public void setTotal_Hours_Week(Double total_Hours_Week) {
        Total_Hours_Week = total_Hours_Week;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    /**
     * Customized Printing Function
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Family_Name='" + Family_Name + '\'' +
                ", Personal_Email='" + Personal_Email + '\'' +
                ", Work_Email='" + Work_Email + '\'' +
                ", Total_Hours_Week=" + Total_Hours_Week +
                ", Photo=" + Photo +
                '}';
    }
}
