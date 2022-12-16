package management.domain;

public class Module {
    private int ID;
    private String Unique_Name;
    private String Type;
    private Double Num_of_hours;
    private int Study_Level;


    /**
     * Getters and Setters
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUnique_Name() {
        return Unique_Name;
    }

    public void setUnique_Name(String unique_Name) {
        Unique_Name = unique_Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Double getNum_of_hours() {
        return Num_of_hours;
    }

    public void setNum_of_hours(Double num_of_hours) {
        Num_of_hours = num_of_hours;
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
        return "Module{" +
                "ID=" + ID +
                ", Unique_Name='" + Unique_Name + '\'' +
                ", Type='" + Type + '\'' +
                ", Num_of_hours=" + Num_of_hours +
                ", Study_Level=" + Study_Level +
                '}';
    }
}
