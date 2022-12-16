package management.service;

import management.domain.Absence;
import management.domain.ENUM.*;
import management.domain.Student;
import management.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements CRUDService{

    List<Student> studentList = new ArrayList<>();

    AbsenceService absenceService;
    
    public StudentService(AbsenceService absenceService){
        this.absenceService = absenceService;
    }


    @Override
    public void create(){
        Scanner in = new Scanner(System.in);
        Student Student = new Student();

        Student.setID(studentList.size());

        System.out.print("please provide the Name\n>>>");
        String name = in.nextLine();
        Student.setName(name);

        System.out.print("please provide the family Name\n>>>");
        String familyName = in.nextLine();
        Student.setFamily_Name(familyName);

        System.out.print("please provide the Birthday\n>>>");
        String birthday = in.nextLine();
        Student.setBirthday(birthday);

        System.out.print("please provide the Photo\n>>>");
        String photo = in.nextLine();
        Student.setPhoto(photo);

        System.out.print("please provide the State\n>>>");
        String stateInput = in.nextLine();
        State state = stateInput.isBlank() ? State.Present : State.valueOf(stateInput);
        Student.setSTATE(state);

        System.out.print("please provide the Situation\n>>>");
        String situationInput = in.nextLine();
        Situation situation = situationInput.isBlank() ? Situation.Other : Situation.valueOf(situationInput);
        Student.setSITUATION(situation);

        List<Absence> absenceList = absenceService.getAbsenceList();
        Student.setAbsences(absenceList.stream().filter(absence -> (absence.getStudentId() == Student.getID())).toList());

        studentList.add(Student);

    }

    @Override
    public void search() {
        Scanner in = new Scanner(System.in);
        System.out.print("please input the id of the Student to display.\n>>>");
        int studentId = in.nextInt();
        List<Absence> absenceList = absenceService.getAbsenceList();
        studentList.get(studentId).setAbsences(absenceList.stream().filter(absence -> (absence.getStudentId() == studentId)).toList());
        System.out.print(studentList.get(studentId).toString());
    }

    @Override
    public void displayAll(){
        Scanner in = new Scanner(System.in);
        for ( Student Student : studentList) {
            List<Absence> absenceList = absenceService.getAbsenceList();
            studentList.get(Student.getID()).setAbsences(absenceList.stream().filter(absence -> (absence.getStudentId() == Student.getID())).toList());
            System.out.print(Student.toString() + "\n");
        }
    }

    @Override
    public void update(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the Student you want to update.\n>>>");
        int StudentId = in.nextInt();

        System.out.print("please provide the Name\n>>>");
        String name = in.nextLine();
        if(!name.isBlank()){studentList.get(StudentId).setName(name);}

        System.out.print("please provide the Family Name\n>>>");
        String familyName = in.nextLine();
        if(!familyName.isBlank()){studentList.get(StudentId).setFamily_Name(familyName);}

        System.out.print("please provide the goal\n>>>");
        String birthday = in.nextLine();
        if(!birthday.isBlank()){studentList.get(StudentId).setBirthday(birthday);}

        System.out.print("please provide the Photo\n>>>");
        String photo = in.nextLine();
        if(!photo.isBlank()){studentList.get(StudentId).setPhoto(photo);}

        System.out.print("please provide the State\n>>>");
        String stateInput = in.nextLine();
        State state = stateInput.isBlank() ? State.Present : State.valueOf(stateInput);
        studentList.get(StudentId).setSTATE(state);

        System.out.print("please provide the Situation\n>>>");
        String situationInput = in.nextLine();
        Situation situation = situationInput.isBlank() ? Situation.Other : Situation.valueOf(situationInput);
        studentList.get(StudentId).setSITUATION(situation);

        List<Absence> absenceList = absenceService.getAbsenceList();
        studentList.get(StudentId).setAbsences(absenceList.stream().filter(absence -> (absence.getStudentId() == StudentId)).toList());


    }

    @Override
    public void delete(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the Student you want to delete.\n>>>");

        studentList.remove(in.nextInt());
    }

}
