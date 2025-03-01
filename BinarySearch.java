import java.util.*;  

public class Main {  
    static int binary(int left, int right, int n, int[] nums) {  
        if (left <= right) {  
            int mid = (left + right) / 2;  
            if (n == nums[mid]) {  
                return mid;  
            } else if (n > nums[mid]) {  
                return binary(mid + 1, right, n, nums);  
            } else {  
                return binary(left, mid - 1, n, nums);  
            }  
        }  
        return 200;  
    }  

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int[] nums = {12, 3, 2, 22, 4, 44, 5, 55, 67};  
        Arrays.sort(nums);  
        System.out.println("Enter num to find its index:");  
        int n = sc.nextInt();  
        int res = binary(0, nums.length - 1, n, nums);  
        if (res != 200)  
            System.out.println("Element found at index: " + res);  
        else   
            System.out.println("Element not found");  
        sc.close();  
    }  
}  
