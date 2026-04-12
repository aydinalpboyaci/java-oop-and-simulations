public class Company {
    String name;
    Employee[] employees;
    int currentEmployeeCount;
    static int maxEmployeeCount = 5;

    Company(String name){
        this.name = name;
        employees = new Employee[maxEmployeeCount];
        currentEmployeeCount = 0;
    }

    void addEmployee(Employee employee){
        if(currentEmployeeCount<maxEmployeeCount){
            employees[currentEmployeeCount] = employee;
            currentEmployeeCount++;
        }
        else{
            System.out.println("Company is full!");
        }
    }

    void displayEmployees(){
        for (int i = 0; i < currentEmployeeCount; i++) {
            System.out.println(employees[i]);
        }
    }

    double getTotalSalary(){
        double totalSalary = 0;
        for (int i = 0; i < currentEmployeeCount; i++) {
            totalSalary += employees[i].salary;
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Company c1 = new Company("AI Tech");
        Employee e1 = new Employee(1,"Anna","Backend",5000.0);
        Employee e2 = new Employee(2,"Devin","Frontend",5000.0);
        Employee e3 = new Employee(3,"John","Full Stack",5000.0);
        c1.addEmployee(e1);
        c1.addEmployee(e2);
        c1.addEmployee(e3);
        c1.displayEmployees();
        System.out.println("Total salary expense:" + c1.getTotalSalary());
    }
}
