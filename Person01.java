public class Person01{
protected String name;
protected String sureName;
public Person01(){
name= "nandini";
sureName="Palai";
}
public Person01(String n, String sn)
{
name=n;
sureName=sn;
}
public Person01(Person01 p){
name=p.name;
sureName=p.sureName;
}
public void show(){
System.out.println("name ="+name);
System.out.println("sureName ="+sureName);
}
}
