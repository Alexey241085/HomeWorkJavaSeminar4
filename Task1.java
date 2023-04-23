
import java.util.LinkedList;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
// который вернет “перевернутый” список.

public class Task1 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int val = rand.nextInt(5,20);
            list.add(val);
        }

        System.out.println(list);
        System.out.println(reverse_list(list));
    }

    public static LinkedList<Integer> reverse_list(LinkedList<Integer> list){
        LinkedList<Integer> rev_list = new LinkedList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            rev_list.add(list.get(i));
        }
        return rev_list;
    }
}
