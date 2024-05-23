import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
        System.out.println(removeElement(new int[]{2,2,3},2));
        System.out.println(removeElement(new int[]{1,2,3,4},1));
        System.out.println(removeElement(new int[]{1,2,3,4},3));
        System.out.println(removeElement(new int[]{2,2,2},2));



    }

    public static int removeElement (int[] nums, int val) {
        int counter = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                counter--;
                if (i==0 && nums.length>1 && nums[i]!=nums[nums.length-1]) {
                    nums[i]=nums[nums.length-1];
                } else if (i==0 && nums.length>1){
                    nums[i]=nums[i+1];
                }else if (i<nums.length-1&&i>0){
                    if (i==nums.length-i) {
                        nums[i]=nums[nums.length-i+1];
                    } else{
                        nums[i]=nums[nums.length-i];
                    }
                } else {
                    nums[i]=51;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }
}