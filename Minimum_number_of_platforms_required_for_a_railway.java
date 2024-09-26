import java.util.Arrays;

public class Minimum_number_of_platforms_required_for_a_railway{
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0,ans = 0,count = 0;
        while(i < arr.length){
            if(arr[i] <= dep[j]){
                count++;
                i++;
                ans = Math.max(ans,count);
            }
            else{
                count--;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
