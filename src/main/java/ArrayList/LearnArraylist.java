package ArrayList;

import java.util.ArrayList;

public class LearnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=10; i++){
            list.add(i);
        }
        System.out.print(list);
    }
}
