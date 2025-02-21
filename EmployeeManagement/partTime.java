public class partTime extends Employee {

    int Totalhours;
    Double hourlyRate;

    public partTime(int Totalhours, Double hourlyRate) {
        this.Totalhours = Totalhours;
        this.hourlyRate = hourlyRate;
    }



    @Override
    Double calculateSalary() {
      return this.salary = Totalhours * hourlyRate;
      
    }
    
}
