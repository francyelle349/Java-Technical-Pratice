
abstract class Employee{
    private String name;
   private String profession;
   protected Double salary;



    public void registerEmployee(String name, String profession){
        this.name = name;
        this.profession = profession;
     
    }



   abstract Double calculateSalary();

   public String displayDetails(){

    return name+","+profession+", "+ calculateSalary();


   }







   

}