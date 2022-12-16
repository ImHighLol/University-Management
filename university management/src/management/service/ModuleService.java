package management.service;

import management.domain.Module;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModuleService implements CRUDService{

    List<Module> moduleList = new ArrayList<>();
    
    public ModuleService(){}

    @Override
    public void create(){
        Scanner in = new Scanner(System.in);
        Module module = new Module();

        module.setID(moduleList.size());

        System.out.print("please provide the name\n>>>");
        String name = in.nextLine();
        module.setUnique_Name(name);

        System.out.print("please provide the Type\n>>>");
        String type = in.nextLine();
        module.setType(type);

        System.out.print("please provide the number of hours\n>>>");
        Double Num_of_Hours = in.nextDouble();
        module.setNum_of_hours(Num_of_Hours);

        System.out.print("please provide the Study Level\n>>>");
        int studyLevel = in.nextInt();
        module.setStudy_Level(studyLevel);

        moduleList.add(module);

    }

    @Override
    public void search() {
        Scanner in = new Scanner(System.in);
        System.out.print("please input the id of the module to display.\n>>>");

        System.out.print(moduleList.get(in.nextInt()).toString());
    }

    @Override
    public void displayAll(){
        Scanner in = new Scanner(System.in);
        for ( Module module : moduleList) {
            System.out.print(module.toString() + "\n");
        }
    }

    @Override
    public void update(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the module you want to update.\n>>>");
        int moduleId = in.nextInt();

        System.out.print("please provide the Date\n>>>");
        String name = in.nextLine();
        if(!name.isBlank()){moduleList.get(moduleId).setUnique_Name(name);}

        System.out.print("please provide the Motif\n>>>");
        String type = in.nextLine();
        if(!type.isBlank()){moduleList.get(moduleId).setType(type);}

        System.out.print("please provide the number of hours\n>>>");
        Double Num_of_Hours = Double.valueOf(0);
         Num_of_Hours = in.nextDouble();
        if(Num_of_Hours != 0){moduleList.get(moduleId).setNum_of_hours(Num_of_Hours);}

        System.out.print("please provide the Student's ID\n>>>");
        int studyLevel = 0;
        studyLevel = in.nextInt();
        if(studyLevel != 0){moduleList.get(moduleId).setStudy_Level(studyLevel);}

    }

    @Override
    public void delete(){
        Scanner in = new Scanner(System.in);
        System.out.print("please input the module you want to update.\n>>>");

        moduleList.remove(in.nextInt());
    }
}
