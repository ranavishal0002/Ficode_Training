package Inheritance;


class Maths {

    public void submit(){
        System.out.println("hey vishal learn maths");
    }
}
class English extends Maths{
    public void learn(){
        System.out.println("Let's learn English together");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        English obj = new English();
//        Maths obj = new Maths();
        obj.learn();
        obj.submit();
    }
}
