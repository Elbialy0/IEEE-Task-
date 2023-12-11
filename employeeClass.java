public class employeeClass{
    private String name ;
    private String email ;
    private int age ; 
    private float salary ;
    private String phoneNumber;
    private String address;
    public void create(String name , String email , int age , float salary , String phoneNumber , 
    String address)
    {
        this.name=name;
        this.address=address;
        this.age=age;
        this.salary=salary;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public void updateName(String name){this.name=name;}
    public void updateEmail(String email){this.email=email;}
    public void updateAge(int age){this.age=age;}
    public void updateSalary(float salary){this.salary=salary;}
    public void updatePhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}
    public void updateAddress(String address){this.address=address;}
    public void deleteEmployee()
    {
        this.name=null;
        this.email=null;
        this.age=0;
        this.salary=0;
        this.phoneNumber=null;
        this.address=null;
    }
    public void showEmployeeData()
    {
        System.out.println("Name: "+name+" Email: "+email+" Age: "+age+" Salary: "+salary+" Phone Number: "+phoneNumber+" Address: "+address);
    }
   



}
