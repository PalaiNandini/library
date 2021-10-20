public class Office{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee("swati","gupta",567890,20000);
Employee e3=new Employee(e2);
System.out.println("first employee is");
e1.show();
System.out.println("\nSecond employee is");
e2.show();
System.out.println("\nThird employee is");
e3.show();
}
}

