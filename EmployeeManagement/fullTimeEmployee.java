public class fullTimeEmployee extends Employee {

    Double monthlySalary;

    public fullTimeEmployee(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }



    @Override
    Double calculateSalary() {
       return this.salary = monthlySalary;
    }
    
    
}
