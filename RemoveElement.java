import java.util.*;
class RemoveElement {
    public static void removeElement(int[] nums, int val) {
        for (int i=0; i<nums.length; i++){
            if (nums[i]!= val){
                System.out.print(" " +nums[i]);
                
            }
        }
        //return i;
    }
    public static void main(String args[]){
        int arr[]={3,2,2,3};
        int the_num =3;
        removeElement(arr,the_num);
    }
}
