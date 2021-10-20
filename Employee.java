class Employee extends ContactInfo{
protected int salary;
public Employee(){
salary=20000;
}
public Employee(String name,String sureName,int phone,int salary){
super(name,sureName,phone);
this.salary=salary;
}
public Employee(Employee emp){
super(emp);
salary=emp.salary;
}
public void show()
{
super.show();
System.out.println("salary ="+salary);
}
}
