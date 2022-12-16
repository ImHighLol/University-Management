package management.domain;

import management.domain.ENUM.List_of_tools;
import management.domain.ENUM.State_S;
import management.domain.ENUM.Type_S;

public class Sessions {
    private int ID;
    private String Start_Time;
    private String End_Time;
    private Integer Classroom_num;
    private String Goal;
    private String Summary;
    private List_of_tools Tools;
    private State_S State_session;
    private Type_S Type_session ;


    /**
     * Getters and Setters
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStart_Time() {
        return Start_Time;
    }

    public void setStart_Time(String start_Time) {
        Start_Time = start_Time;
    }

    public String getEnd_Time() {
        return End_Time;
    }

    public void setEnd_Time(String end_Time) {
        End_Time = end_Time;
    }

    public Integer getClassroom_num() {
        return Classroom_num;
    }

    public void setClassroom_num(Integer classroom_num) {
        Classroom_num = classroom_num;
    }

    public String getGoal() {
        return Goal;
    }

    public void setGoal(String goal) {
        Goal = goal;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public List_of_tools getTools() {
        return Tools;
    }

    public void setTools(List_of_tools tools) {
        Tools = tools;
    }

    public State_S getState_session() {
        return State_session;
    }

    public void setState_session(State_S state_session) {
        State_session = state_session;
    }

    public Type_S getType_session() {
        return Type_session;
    }

    public void setType_session(Type_S type_session) {
        Type_session = type_session;
    }

    /**
     * Customized Printing Function
     */
    @Override
    public String toString() {
        return "Sessions{" +
                "ID=" + ID +
                ", Start_Time=" + Start_Time +
                ", End_Time=" + End_Time +
                ", Classroom_num=" + Classroom_num +
                ", Goal='" + Goal + '\'' +
                ", Summary='" + Summary + '\'' +
                ", Tools=" + Tools +
                ", State_session=" + State_session +
                ", Type_session=" + Type_session +
                '}';
    }
}
