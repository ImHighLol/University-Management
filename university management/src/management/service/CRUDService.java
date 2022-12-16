package management.service;

/**
 * This is our interface, It lets us create Methods that we will Override in each service
 *
 * The create() Method lets you create a new record( Absence, Group, Module, Session, Student or Teacher).
 *
 * The search() Method will allow us to find a specific value thanks to their ID.
 *
 * The displayAll() Method will allow us to see all existing records.
 *
 * The update() Method permits us to change values in an existing record.
 *
 * The delete() Method will allow us to delete an existing record.
 */
public interface CRUDService {

    void create();

    void search();

    void displayAll();

    void update();

    void delete();

}
