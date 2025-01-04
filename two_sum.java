import java.util.Arrays;
import java.util.HashMap;
 class d{
     int value;
     int index;
     d(int value,int index){
         this.value = value;
         this.index = index;
     }
}
public class two_sum {
//    brute
//    public int[] twoSum(int[] nums, int target) {
//        int[] ans = new int[2];
//        for(int i = 0;i < nums.length;i++){
//            for(int j = i + 1;j < nums.length;j++){
//                if(nums[i] + nums[j] == target){
//                    ans[0] = i;
//                    ans[1] = j;
//                    return ans;
//                }
//            }
//        }
//        return ans;
//    }

//    optimal-1
//public int[] twoSum(int[] nums, int t) {
//    int[] ans = new int[2];
//    HashMap<Integer,Integer> map = new HashMap<>();
//    for(int i = 0;i < nums.length;i++){
//        if(map.containsKey(t-nums[i])){
//            ans[0] = map.get(t-nums[i]);
//            ans[1] = i;
//            return ans;
//        }
//        map.put(nums[i],i);
//    }
//    return ans;
//}

//    optimal-2
//class pair{
//    int value,index;
//    pair(int value,int index){
//        this.value = value;
//        this.index = index;
//    }
//}
//    public int[] twoSum(int[] nums, int t) {
//        int[] ans = new int[2];
//        int n = nums.length;
//        pair[] arr = new pair[n];
//        for(int i = 0;i < n;i++){
//            arr[i] = new pair(nums[i],i);
//        }
//        Arrays.sort(arr,(a,b)->{
//            return a.value - b.value;
//        });
//        int l = 0,r = n-1;
//        while(l <= r){
//            if((arr[l].value + arr[r].value) == t){
//                ans[0] = arr[l].index;
//                ans[1] = arr[r].index;
//                return ans;
//            }
//            else if((arr[l].value + arr[r].value) > t){
//                r--;
//            }
//            else l++;
//        }
//        return ans;
//    }
    public static void main(String[] args) {

        int[] array = {21,20,32,14,51};
////        Arrays.sort(array);
//        d[] arr = new d[array.length];
//        for(int i = 0;i < array.length;i++){
//            arr[i] = new d(array[i],i);
//        }
//        for(int i = 0;i < array.length;i++){
//            System.out.println(arr[i].value+" "+arr[i].index);
//        }
//        System.out.println();
//        Arrays.sort(arr,(a,b)->{
//            return a.value - b.value;
//        });
//        for(int i = 0;i < array.length;i++){
//            System.out.println(arr[i].value+" "+arr[i].index);
//        }
        int n = array.length;
        d[] arr = new d[n];
        for(int i = 0;i < n;i++){
            arr[i] = new d(array[i],i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].value + " "+arr[i].index);
        }
        System.out.println();
        Arrays.sort(arr,(a,b)->{
            return a.value - b.value;
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].value + " "+arr[i].index);
        }
        int l = 0,r = n-1,target = 35;
        while(l <= r){
          if((arr[l].value + arr[r].value) == target){

          }
        }
    }
}
