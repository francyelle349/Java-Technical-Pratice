public class intern extends Employee {

    Double stipend;

    public intern(Double stipend) {
        this.stipend = stipend;
    }


    @Override
    Double calculateSalary() {
        return stipend;
        }

    
}
