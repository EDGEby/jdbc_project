package jdbs_test;

import dao.impl.EmployeeDAOImpl;
import dao.impl.OfficeDAOImpl;
import model.Employee;
import model.Office;

public class Test {
    public static void main(String[] args) {


       /* Employee empl1 = new EmployeeDAOImpl().findById(2);
        System.out.println(empl1.getOffice());
        System.out.println(empl1.getPassport());
*/
       // System.out.println(new EmployeeDAOImpl().all().size());

        Office office = new Office();
        office.setAddress("addres");
        office.setPhone1("112");
        office.setPhone2("1332");
        office.setPostalCode(222222);
        office.setTitle("MAin 2");

        boolean isCreated = new OfficeDAOImpl().createOffice(office);
        System.out.println("New office has been created? " + isCreated);
    }
}
