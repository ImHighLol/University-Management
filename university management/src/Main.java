import management.service.*;
import java.sql.* ;
import java.util.Scanner;


public class Main {


   // Connection University = DriverManager.getConnection("jdbc:postgresql://localhost/university", "postgres", "P@ssw0rd");

    //public Main() throws SQLException {}

    public static void main(String[] args){
        /**
         * Service initialization: It will simply allow us to use each service.
         */

        AbsenceService absenceService = new AbsenceService();
        GroupsService groupsService = new GroupsService();
        ModuleService moduleService = new ModuleService();
        SessionsService sessionsService = new SessionsService();
        StudentService studentService = new StudentService(absenceService);
        TeacherService teacherService = new TeacherService();

        /**
         * Avoiding to declare a new scanner each time.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Menu Display.
         */
        int choice = 0;
        while(choice != 7){
            System.out.println("Welcome to the management software! what would you like to manage?");
            System.out.println(
                    "1-)Absence\n" +
                    "2-)Groups\n" +
                    "3-)Module\n" +
                    "4-)Sessions\n" +
                    "5-)Student\n" +
                    "6-)Teacher\n" +
                    "7-)Exit\n" +
                    ">>>");
            choice = in.nextInt();
            /**
             * This switch method Will allow us to use a service depending on the admin's choice
             * Calls to the Management Method (Scroll down)
             */
            switch(choice){
                case 1 -> Management(absenceService);
                case 2 -> Management(groupsService);
                case 3 -> Management(moduleService);
                case 4 -> Management(sessionsService);
                case 5 -> Management(studentService);
                case 6 -> Management(teacherService);
                case 7 -> System.out.println("Goodbye!");
            }
        }
    }

    /**
     * This Method Will:
     * First, Display the second menu and gets the admin's choice.
     * Then it will use that choice and calls for the chosen Method.
     * It also saves us coding time since it's always going to be the same syntax but with different classes names.
     */
    public static void Management(CRUDService service){
        int choice = 0;
        while(choice != 6) {
            System.out.println(
                            "1-)Create\n" +
                            "2-)Search\n" +
                            "3-)Display All\n" +
                            "4-)Update\n" +
                            "5-)Delete\n" +
                            "6-)return to menu\n" +
                            ">>>");
            Scanner in = new Scanner(System.in);
            choice =  in.nextInt();
            switch (choice) {
                case 1 -> service.create();
                case 2 -> service.search();
                case 3 -> service.displayAll();
                case 4 -> service.update();
                case 5 -> service.delete();
                case 6 -> System.out.println("returning to Menu");
            }
        }
    }
}
