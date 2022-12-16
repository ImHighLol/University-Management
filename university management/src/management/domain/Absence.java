package management.domain;


public class Absence {
    private int ID;
    private String Date;
    private String Motif;
    private String Justification;
    private int studentId;

    /**
     * Getters and Setters
     */

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getMotif() {
        return Motif;
    }

    public void setMotif(String motif) {
        Motif = motif;
    }

    public String getJustification() {
        return Justification;
    }

    public void setJustification(String justification) {
        Justification = justification;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Customized Printing Function
     */
    @Override
    public String toString() {
        return "Absence{" +
                "ID=" + ID +
                ", Date='" + Date + '\'' +
                ", Motif='" + Motif + '\'' +
                ", Justification='" + Justification + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
