public class Main {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
        System.out.println(removeElement(new int[]{2,2,3},2));
        System.out.println(removeElement(new int[]{1,2,3,4},1));
        System.out.println(removeElement(new int[]{1,2,3,4},3));
        System.out.println(removeElement(new int[]{2,2,2},2));
        System.out.println(removeElement(new int[]{1},1));
        System.out.println(removeElement(new int[]{4,2,0,2,2,1,4,4,1,4,3,2},4));
        System.out.println(removeElement(new int[]{0,3,1,1,0,1,3,0,3,3,1,1},1));
    }

    public static int removeElement (int[] nums, int val) {
        int counter = nums.length;
        int arrLength = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                counter--;
                nums[i]=51;
            }
        }
        for (int i = 0; i < counter; i++){
            while(nums[arrLength]==51) {
                arrLength--;
            }
            if (nums[i]==51){
                nums[i]=nums[arrLength--];
            }
        }
        return counter;
    }
}