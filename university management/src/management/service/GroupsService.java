package management.service;

import management.domain.Groups;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupsService implements CRUDService{

    List<Groups> groupsList = new ArrayList<>();
    public GroupsService(){}


    /**
     * Method that creates a new Group
     */
    @Override
    public void create(){
        Scanner in = new Scanner(System.in);
        Groups Groups = new Groups();

        Groups.setID(groupsList.size());

        System.out.print("please provide the email\n>>>");
        String email = in.nextLine();
        Groups.setEmail(email);

        System.out.print("please provide the Name\n>>>");
        String name = in.nextLine();
        Groups.setName(name);

        System.out.print("please provide the number of students\n>>>");
        int Num_of_Student = in.nextInt();
        Groups.setNum_of_Student(Num_of_Student);

        System.out.print("please provide the Study Level\n>>>");
        int studyLevel = in.nextInt();
        Groups.setStudy_Level(studyLevel);

        groupsList.add(Groups);

    }

    @Override
    public void search() {
        Scanner in = new Scanner(System.in);
        System.out.println("please input the id of the Groups to display.\n>>>");

        System.out.println(groupsList.get(in.nextInt()).toString());
    }


    @Override
    public void displayAll(){
        Scanner in = new Scanner(System.in);
        for ( Groups group : groupsList) {
            System.out.print(group.toString() + "\n");
        }
    }


    @Override
    public void update(){
        Scanner in = new Scanner(System.in);
        System.out.println("please input the Groups you want to update.\n>>>");
        int GroupsId = in.nextInt();

        System.out.println("please provide the Name\n>>>");
        String name = in.nextLine();
        if(!name.isBlank()){groupsList.get(GroupsId).setName(name);}

        System.out.println("please provide the email\n>>>");
        String email = in.nextLine();
        if(!email.isBlank()){groupsList.get(GroupsId).setEmail(email);}

        System.out.println("please provide the Number of Students\n>>>");
        int Num_of_Student = 0;
        Num_of_Student = in.nextInt();
        if(Num_of_Student != 0){groupsList.get(GroupsId).setNum_of_Student(Num_of_Student); }

        System.out.println("please provide the Study Level\n>>>");
        int studyLevel= 0;
        studyLevel = in.nextInt();
        if(studyLevel != 0){groupsList.get(GroupsId).setStudy_Level(studyLevel);}

    }


    @Override
    public void delete(){
        Scanner in = new Scanner(System.in);
        System.out.println("please input the Groups you want to delete.\n>>>");

        groupsList.remove(in.nextInt());
    }

}

