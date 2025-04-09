package Encapsulation;

class Person{
   private int ID;
   private String Name;

   public int getID(){
       return ID;
   }
   public void setID(int id){
       this.ID = id;
   }

   public String getName(){
       return Name;
   }

   public void setName(String name){
       this.Name = name;
   }

   }
public class Encapsulation {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.setID(1514);
        obj.setName("vishal");
        System.out.println(obj.getID());
        System.out.println(obj.getName());
    }
}
