public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
    public String getNiNumber() {
        return this.niNumber;
    }
    public double getSalary() {
        return this.salary;
    }

    public double raiseSalary(double raise) {
        if (raise > 0 ) {
            this.salary += raise;
        }
        return salary;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public String setName(String newName){
        if(newName != null) {
            this.name = newName;
        }
        return this.name;
    }

}
