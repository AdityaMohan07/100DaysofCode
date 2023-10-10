public class Day2 {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,12,14,16,18,24,26,28,34,36,38,42,44,48,54};
        int target = 62;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(target<arr[mid]) {
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}


