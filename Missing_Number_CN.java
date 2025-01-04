public class Missing_Number_CN {
     static int missingNumber(int []a, int N) {
        // Write your code here.
        int l = 0,r = a.length-1,ans = -1;
        if(a[0] != 1)return 1;
        if(a[r] != N)return N;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] - mid > 1){
                ans = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans + 1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3, 5, 6, 7, 8};
        System.out.println(missingNumber(array,8));
    }
}
