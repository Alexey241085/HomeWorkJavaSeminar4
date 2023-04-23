import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        
        LinkedList <Integer> list = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            double result = 0;
            
            print("Введите число: ");
            double num1 = sc.nextInt();
            print("Введите знак '*', '/' , '+', '-': ");
            String simbol = sc.next();
            print("Введите число: ");
            double num2 = sc.nextInt();
            
            switch (simbol) {
                case "+": result = num1 + num2; 
                    break;
                case "-": result = num1 - num2; 
                    break;
                case "/": result = num1 / num2; 
                    break;
                case "*": result = num1 * num2; 
                    break;
                default:
                    break;
            }
            System.out.println("Ответ: "  + result);
            list.add((int) result);
            
            while(true){
                print("Введите знак '*', '/' , '+', '-': ");
                simbol = sc.next();
                print("Введите число: ");
                num2 = sc.nextInt();

                switch (simbol) {
                    case "+": result = result + num2;
                              list.add((int) result); 
                        break;
                    case "-": result = result - num2;
                              list.add((int) result); 
                        break;
                    case "/": result = result / num2;
                              list.add((int) result); 
                        break;
                    case "*": result = result * num2; 
                                  list.add((int) result);
                        break;
                    case "отмена": 
                        // System.out.println(list);
                        list.removeLast();
                        result = list.getLast();
                        break;
                    default:
                        break;
                    }
                    System.out.println("Ответ: "  + result);

                }
            }  
        }
        
        
        
        public static void print(String a){
            System.out.print(a);
        }  
        
}
    
    