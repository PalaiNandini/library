class ContactInfo extends Person01{
protected int phone;
public ContactInfo(){
phone=1234;
}

public ContactInfo(String name,String sureName,int phone){
super(name,sureName);
this.phone=phone;
}
public ContactInfo(ContactInfo ci){
super(ci);
phone=ci.phone;
}
public void show()
{
super.show();
System.out.println("phone number="+phone );
}
}
