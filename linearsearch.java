import java.util.*;  

public class Main {  
    static void linear(int n, int[] nums) {  
        boolean found = false;  
        for (int i = 0; i < nums.length; i++) {  
            if (nums[i] == n) {  
                System.out.println("Found at index: " + i);  
                found = true;  
                break; // Exit the loop once the element is found  
            }  
        }  
        if (!found) {  
            System.out.println("Not found");  
        }  
    }  

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int[] nums = {12, 3, 2, 22, 4, 44, 5, 55, 67};  
        System.out.println("Enter num to find its index:");  
        int n = sc.nextInt();  
        linear(n, nums);  
        sc.close();  
    }  
}  
