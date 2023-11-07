package EX1;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            employees.add(new Employee("Istudor" + String.valueOf(i), "0001" + String.valueOf(i), LocalDate.of(2000 + i, 1 + i, 1 + 1), "IT", 1234 + i));
        }

        // afisam lista de la inceput
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        System.out.println();

        // adaugam doi angajati identici la mijlocul listei si dupa afisam lista invers (punem iteratorul la sfarsitul listei, indicat prin size())
        employees.add(employees.size() / 2, new Employee("VICTOR", "9999", LocalDate.of(2023, 11, 7), "PLM", 9999));
        employees.add(employees.size() / 2, new Employee("VICTOR", "9999", LocalDate.of(2023, 11, 7), "PLM", 9999));

        ListIterator<Employee> employeeListIterator = employees.listIterator(employees.size());
        while(employeeListIterator.hasPrevious()) {
            System.out.println(employeeListIterator.previous().toString());
        }

        System.out.println();

        // facem un set (hash set) in care obiectele dublicate din el vor disparea dupa ce implementam metodele equals si hashCode in Employee
        Set<Employee> employeeSet = new HashSet<>(employees);
        for (Employee e : employeeSet) {
            System.out.println(e.toString());
        }

        System.out.println();

        // facem un tree set care nu va rula daca nu implementam compareTo (comparam in functie de nume)
        TreeSet<Employee> employeeTreeSet = new TreeSet<>(employees);
        for (Employee e : employeeTreeSet) {
            System.out.println(e.toString());
        }

        System.out.println();

        // facem o mapa pe care o populam cu obiecte Employee din array list ul employees
        // folosind scanner, afisam daca angajatul introdus de noi exista sau nu
        Map<String, Employee> employeeMap = new HashMap<>();
        for (Employee e : employees) {
            employeeMap.put(e.getName(), e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        Employee foundEmployee = employeeMap.get(name);

        if (foundEmployee != null)
            System.out.println("The employee that has been found is: " + foundEmployee);
        else
            System.out.println("No employee found.");

        System.out.println();
    }
}