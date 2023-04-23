import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task2 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.printf("Исходный список: %s\n", list);
        
        // enqueue() - помещает элемент в конец очереди
        Scanner sc = new Scanner(System.in);
        System.out.print("Добовляем элемент в конец списка: ");
        enqueue(list, sc.nextInt());
        print(list);
 
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        System.out.printf("Метод dequeue() возвращает : %d и удаляет его:\n", dequeue(list));
        print(list);
        
        // first() - возвращает первый элемент из очереди, не удаляя.
        System.out.printf("Метод first() возвращает : %d и не удаляет его: \n", first(list));
        print(list);

        sc.close();
    }
    
    
    
    public static void print(LinkedList<Integer> list){
        System.out.println(list);
    }


    
    public static void enqueue(LinkedList<Integer> list, int i){
        list.add(i);
    }
    

   
    public static int dequeue(LinkedList<Integer> list){
        
        int item = list.getFirst();
        list.removeFirst();
        return item;
    }

   
   
    public static int first(LinkedList<Integer> list){
        int take = list.getFirst();
        return take;
    }    
}
