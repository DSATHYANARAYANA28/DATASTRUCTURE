import java.util.LinkedList;  
import java.util.Queue;  

public class Main {  
    public static void calculate(int[] tasks, int time) {  
        Queue<Integer> queue = new LinkedList<>();  
        int total = 0;  

        for (int a : tasks) {  
            queue.add(a);  
        }  

        while (!queue.isEmpty()) {  
            int num = queue.poll();  

            if (num > time) {  
                num -= time;  
                queue.add(num);  
                total += time;  
            } else {  
                total += num;  
            }  
        }  

        System.out.println("Total time spent on tasks: " + total);  
    }  

    public static void main(String[] args) {  
        int[] tasks = {10, 8, 11, 3};  
        int time = 5;  
        calculate(tasks, time);  
    }  
}  
