/*
method over riding
*/
class method_overloading{
    public static void main(String []args){
    doctor d = new doctor();
    d.put("bir hospital",452212,"NMC1230",7899.99);
    d.show();
    }
}
class hospital
{
    String name;
    int contact;
    void set(String name, int contact)
    {
    this.name = name;
    this.contact = contact;
    }
    void show()
    {
    System.out.println(name + " "+ contact);
    }

}
class doctor extends hospital
{
    String regno;
    double salary;
    void put(String name, int contact, String regno, double salary){
      set(name, contact);
      this.regno = regno;
      this.salary = salary;
    }
void show(){
    System.out.println(regno + " "+ salary);
    super.show();
}
}
