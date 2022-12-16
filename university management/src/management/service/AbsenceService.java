package management.service;

import management.domain.Absence;

import java.sql.*;
import java.util.*;


public class AbsenceService implements CRUDService{

    List<Absence> AbsenceList = new ArrayList<>();

    public AbsenceService() {
    }

    @Override
    public void create(){
        Scanner in = new Scanner(System.in);
        Absence absence = new Absence();

        absence.setID(AbsenceList.size());

        System.out.print("please provide the Date\n>>>");
        String date = in.nextLine();
        absence.setDate(date);

        System.out.print("please provide the Motif\n>>>");
        String motif = in.nextLine();
        absence.setMotif(motif);

        System.out.print("please provide the Justification\n>>>");
        String justification = in.nextLine();
        absence.setJustification(justification);

        System.out.print("please provide the Student's ID\n>>>");
        int studentId = in.nextInt();
        absence.setStudentId(studentId);

        AbsenceList.add(absence);

    }

    @Override
    public void search() {
        Scanner in = new Scanner(System.in);
        System.out.print("please input the id of the Absence to display.\n>>>");

        System.out.print(AbsenceList.get(in.nextInt()).toString());
    }

    @Override
    public void displayAll(){
        Scanner in = new Scanner(System.in);
        for ( Absence absence : AbsenceList) {
            System.out.print(absence.toString() + "\n");
        }
    }

    @Override
    public void update(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the Absence you want to update.\n>>>");
        int absenceId = in.nextInt();

        System.out.print("please provide the Date\n>>>");
        String date = in.nextLine();
        if(!date.isBlank()){AbsenceList.get(absenceId).setDate(date);}

        System.out.print("please provide the Motif\n>>>");
        String motif = in.nextLine();
        if(!motif.isBlank()){AbsenceList.get(absenceId).setMotif(motif);}

        System.out.print("please provide the Justification\n>>>");
        String justification = in.nextLine();
        if(!justification.isBlank()){AbsenceList.get(absenceId).setJustification(justification);}

        System.out.print("please provide the Student's ID\n>>>");
        int studentId = 0;
        studentId = in.nextInt();
        if(studentId != 0){AbsenceList.get(absenceId).setStudentId(studentId);}

    }

    @Override
    public void delete(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the Absence you want to delete.\n>>>");

        AbsenceList.remove(in.nextInt());
    }

    public List<Absence> getAbsenceList() {
        return AbsenceList;
    }

    public void setAbsenceList(List<Absence> absenceList) {
        AbsenceList = absenceList;
    }
}
