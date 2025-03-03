public class Main  
{  
    static void selectionSort(int n, int[] nums)  
    {  
        for (int i = 0; i < n - 1; i++)  
        {  
            int min= i;  
            for (int j = i + 1; j < n; j++)  
            {  
                if (nums[j] < nums[min])  
                {  
                    min = j;  
                }  
            }  
            int temp = nums[min];  
            nums[min] = nums[i];  
            nums[i] = temp;  
        }  
    }  

    public static void main(String[] args)   
    {  
        int[] nums = {64, 34, 25, 12, 22, 11, 90};  
        selectionSort(6, nums);  
        for (int a : nums) {  
            System.out.print(a + " ");  
        }  
    }  
}  
