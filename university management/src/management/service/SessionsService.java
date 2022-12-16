package management.service;

import management.domain.ENUM.List_of_tools;
import management.domain.ENUM.State_S;
import management.domain.ENUM.Type_S;
import management.domain.Sessions;
import management.domain.Sessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SessionsService implements CRUDService{

    List<Sessions> sessionsList = new ArrayList<>();
    
    public SessionsService() {}

    @Override
    public void create(){
        Scanner in = new Scanner(System.in);
        Sessions Sessions = new Sessions();

        Sessions.setID(sessionsList.size());

        System.out.print("please provide the Start Time\n>>>");
        String startTime = in.nextLine();
        Sessions.setStart_Time(startTime);

        System.out.print("please provide the End Time\n>>>");
        String endTime = in.nextLine();
        Sessions.setEnd_Time(endTime);

        System.out.print("please provide the Classroom's Number\n>>>");
        int classroomNum = 0;
        classroomNum = in.nextInt();
        Sessions.setClassroom_num(classroomNum);

        System.out.print("please provide the Goal\n>>>");
        String goal = in.nextLine();
        Sessions.setGoal(goal);

        System.out.print("please provide the Summary\n>>>");
        String summary = in.nextLine();
        Sessions.setSummary(summary);

        System.out.print("please provide the Tools\n>>>");
        String toolsInput = in.nextLine();
        List_of_tools tools = toolsInput.isBlank() ? List_of_tools.Software_tools : List_of_tools.valueOf(toolsInput);
        Sessions.setTools(tools);

        System.out.print("please provide the Session's State (\n>>>");
        String sessionStateInput = in.nextLine();
        State_S sessionState = sessionStateInput.isBlank() ? State_S.Running : State_S.valueOf(sessionStateInput);
        Sessions.setState_session(sessionState);

        System.out.print("please provide the Session's Type\n>>>");
        String typeInput = in.nextLine();
        Type_S type = typeInput.isBlank() ? Type_S.Normal : Type_S.valueOf(typeInput);
        Sessions.setType_session(type);



        sessionsList.add(Sessions);

    }

    @Override
    public void search() {
        Scanner in = new Scanner(System.in);
        System.out.print("please input the id of the Sessions to display.\n>>>");

        System.out.print(sessionsList.get(in.nextInt()).toString());
    }

    @Override
    public void displayAll(){
        Scanner in = new Scanner(System.in);
        for ( Sessions Sessions : sessionsList) {
            System.out.print(Sessions.toString() + "\n");
        }
    }

    @Override
    public void update(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the Sessions you want to update.\n>>>");
        int SessionsId = in.nextInt();

        System.out.print("please provide the Start Time\n>>>");
        String startTime = in.nextLine();
        if(!startTime.isBlank()){sessionsList.get(SessionsId).setStart_Time(startTime);}

        System.out.print("please provide the End Time\n>>>");
        String endTime = in.nextLine();
        if(!endTime.isBlank()){sessionsList.get(SessionsId).setEnd_Time(endTime);}

        System.out.print("please provide the goal\n>>>");
        String goal = in.nextLine();
        if(!goal.isBlank()){sessionsList.get(SessionsId).setGoal(goal);}

        System.out.print("please provide the Summary\n>>>");
        String summary = in.nextLine();
        if(!summary.isBlank()){sessionsList.get(SessionsId).setSummary(summary);}

        System.out.print("please provide the Classroom's Number\n>>>");
        int classroomNumber = 0;
        classroomNumber = in.nextInt();
        if(classroomNumber != 0){sessionsList.get(SessionsId).setClassroom_num(classroomNumber);}

        System.out.print("please provide the Tools\n>>>");
        //List_of_tools tools = List_of_tools.Software_tools;
        //tools = List_of_tools.valueOf(in.nextLine());
        String toolsInput = in.nextLine();
        List_of_tools tools = toolsInput.isBlank() ? List_of_tools.Software_tools : List_of_tools.valueOf(toolsInput);
        sessionsList.get(SessionsId).setTools(tools);

        System.out.print("please provide the Session's State\n>>>");
        //State_S sessionState = State_S.Running;
        //sessionState = State_S.valueOf(in.nextLine());
        String sessionStateInput = in.nextLine();
        State_S state = sessionStateInput.isBlank() ? State_S.Running : State_S.valueOf(sessionStateInput);
        sessionsList.get(SessionsId).setState_session(state);

        System.out.print("please provide the Session's Type\n>>>");
        //Type_S type = Type_S.Normal;
        //type = Type_S.valueOf(in.nextLine());
        String typeInput = in.nextLine();
        Type_S type = typeInput.isBlank() ? Type_S.Normal : Type_S.valueOf(typeInput);
        sessionsList.get(SessionsId).setType_session(type);

    }

    @Override
    public void delete(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the Sessions you want to delete.\n>>>");

        sessionsList.remove(in.nextInt());
    }
}
