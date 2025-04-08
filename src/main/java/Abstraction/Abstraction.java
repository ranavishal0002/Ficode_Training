package Abstraction;

abstract class Examples{
abstract int sum(int x, int y);
}
 class Addition extends Examples{
 int sum (int x,int y){
     return x+y;
 }
 }
public class Abstraction {
    public static void main(String[] args) {
        Examples obj = new Addition();
        System.out.println("The addition of the  "+obj.sum(8,8));
    }
}
