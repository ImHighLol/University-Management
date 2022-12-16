package management.service;

import management.domain.ENUM.Situation;
import management.domain.ENUM.State;
import management.domain.Teacher;
import management.domain.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements CRUDService{

    List<Teacher> teacherList = new ArrayList<>();
    
    public TeacherService(){}

    @Override
    public void create(){
        Scanner in = new Scanner(System.in);
        Teacher Teacher = new Teacher();

        Teacher.setID(teacherList.size());

        System.out.print("please provide the Name\n>>>");
        String name = in.nextLine();
        Teacher.setName(name);

        System.out.print("please provide the family Name\n>>>");
        String familyName = in.nextLine();
        Teacher.setFamily_Name(familyName);

        System.out.print("please provide the Personal Email\n>>>");
        String personalEmail = in.nextLine();
        Teacher.setPersonal_Email(personalEmail);

        System.out.print("please provide the Work Email\n>>>");
        String workEmail = in.nextLine();
        Teacher.setWork_Email(workEmail);

        System.out.print("please provide the Photo\n>>>");
        String photo = in.nextLine();
        Teacher.setPhoto(photo);

        System.out.print("please provide the Total Hours\n>>>");
        Double hours = Double.valueOf(0);
        hours = in.nextDouble();
        Teacher.setTotal_Hours_Week(hours);


        teacherList.add(Teacher);

    }

    @Override
    public void search() {
        Scanner in = new Scanner(System.in);
        System.out.print("please input the id of the Teacher to display.\n>>>");

        System.out.print(teacherList.get(in.nextInt()).toString());
    }

    @Override
    public void displayAll(){
        Scanner in = new Scanner(System.in);
        for ( Teacher Teacher : teacherList) {
            System.out.print(Teacher.toString() + "\n");
        }
    }

    @Override
    public void update(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the Teacher you want to update.\n>>>");
        int TeacherId = in.nextInt();

        System.out.print("please provide the Name\n>>>");
        String name = in.nextLine();
        if(!name.isBlank()){teacherList.get(TeacherId).setName(name);}

        System.out.print("please provide the Family Name\n>>>");
        String familyName = in.nextLine();
        if(!familyName.isBlank()){teacherList.get(TeacherId).setFamily_Name(familyName);}

        System.out.print("please provide the Personal Email\n>>>");
        String personalEmail = in.nextLine();
        if(!personalEmail.isBlank()){teacherList.get(TeacherId).setPersonal_Email(personalEmail);}

        System.out.print("please provide the Work Email\n>>>");
        String workEmail = in.nextLine();
        if(!workEmail.isBlank()){teacherList.get(TeacherId).setPersonal_Email(workEmail);}

        System.out.print("please provide the Photo\n>>>");
        String photo = in.nextLine();
        if(!photo.isBlank()){teacherList.get(TeacherId).setPhoto(photo);}

        System.out.print("please provide the Total Hours\n>>>");
        Double hours = Double.valueOf(0);
        hours = in.nextDouble();
        teacherList.get(TeacherId).setTotal_Hours_Week(hours);


    }

    @Override
    public void delete(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the Teacher you want to delete.\n>>>");

        teacherList.remove(in.nextInt());
    }
}
