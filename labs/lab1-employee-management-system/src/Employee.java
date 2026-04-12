public class Employee {
    int id;
    String name;
    String position;
    double salary;

    Employee(int id, String name, String position, double salary){
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString(){
        String st = id + " " + name + " " + position + " " + salary;
        return st;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Anna", "Backend Dev",15000.00);
        System.out.println(e1);
    }

}
