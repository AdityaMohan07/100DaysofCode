public class Day1 {
    public static void main(String[] args) {
        int[] nums = {34,56,78,81,19,29,47,};
        int target = 78;
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target){
        if (arr.length ==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}




