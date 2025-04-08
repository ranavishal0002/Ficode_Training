package Polymorphism;

class Mathsoperation{
    public int addition(int a, int b){
        System.out.println("Method 1 is working here: ");
        return a+b;
    }
    public int addition(int a, int b, int c){
        System.out.println("Method 2 is working here: ");
        return a+b+c;
    }

    public void addition(){
        System.out.print("hey now This Function is working");
//        return false;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Mathsoperation obj = new Mathsoperation();
        System.out.println(obj.addition(5,2));
//        obj.addition();
    }
}