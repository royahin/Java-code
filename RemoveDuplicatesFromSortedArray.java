    import java.util.*;
    public class RemoveDuplicatesFromSortedArray{
        public static int removeDuplicates(int[] nums) {
            System.out.print(nums[0]);
            int j=0;
            for (int i=1; i<nums.length; i++){
                if (nums[j]!=nums[i]){
                    ++j;
                    nums[j]=nums[i];
                    
                    System.out.print(nums[j]);
    
                }
            }
             return j+1;
        }
    
    public static void main (String args[]){
        int nums[]= {0,0,1,1,1,2,2,3,3,4};
        int op = (removeDuplicates(nums));
       // removeDuplicates(arr) ;
       System.out.println(op);
    
    }
       
    }
