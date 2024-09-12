class RemoveElementwithNoofElementDeleted {
    public static int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                //System.out.print(" "+nums[i]);
                 //count +=1;
                nums[index]=nums[i];
                index++;
                System.out.print(" " +nums[index]);

            }
           
            
    
        
    }
    return index;
}
    public static void main(String args[]){
        int array[]={3,2,2,3};
        int num = 3;
        int output = removeElement(array,num);
        System.out.println(" the value of k is "+output);

    }

}
