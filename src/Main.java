public class Main {
    protected int exp;


    public void setExp(int exp) {
        this.exp = exp;
    }

    public double calculateSalary() {
        return exp * 50000;
    }

    public static void main(String[] args) {
        // Create a PermEmployee object (inherits from Employee -> inherits from Main)
        PermEmployee permEmp = new PermEmployee();

        permEmp.doFun(); // Custom method from PermEmployee

        // Superclass methods inherited from Main
        permEmp.setExp(5);
        double salary = permEmp.calculateSalary();

        System.out.println("Salary is: " + salary);
    }
}
