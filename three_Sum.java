import java.util.*;
import java.util.List;

public class three_Sum {
//    brute
//    public List<List<Integer>> threeSum(int[] arr) {
//        int n = arr.length;
//        HashSet<List<Integer>> set = new HashSet<>();
//        List< List < Integer > > ans = new ArrayList<>();
//        for(int i = 0;i < n;i++){
//            for (int j = i + 1; j < n; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    if(arr[i] + arr[j] + arr[k] == 0){
//                        List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k]);
//                        Collections.sort(list);
//                        if(!set.contains(list)){
//                            ans.add(list);
//                            set.add(list);
//                        }
//                    }
//                }
//            }
//        }
//        return ans;
//    }

// optimal
//    public List<List<Integer>> threeSum(int[] nums) {
//        HashSet<List<Integer>> set = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();
//        int n = nums.length;
//        for(int i = 0;i < n;i++){
//            set2 = new HashSet<>();
//            for(int j = i+1;j < n;j++){
//                if(set2.contains(-(nums[i] + nums[j]))){
//                    List<Integer> list = Arrays.asList(nums[i],nums[j],-(nums[i]+nums[j]));
//                    Collections.sort(list);
//                    set.add(list);
//                }
//                else{
//                    set2.add(nums[j]);
//                }
//            }
//        }
//        return new ArrayList<>(set);
//    }

//    optimal-2
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums);
//        int n = nums.length;
//        for(int i = 0;i < n;i++){
//            if(i > 0 && nums[i] == nums[i-1])continue;
//            int j = i + 1,k = n-1;
//            while(j < k){
//                if(nums[i] + nums[j] + nums[k] > 0){
//                    k--;
//                }
//                else if(nums[i] + nums[j] + nums[k] < 0){
//                    j++;
//                }
//                else{
//                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
//                    ans.add(list);
//                    j++;
//                    k--;
//                    while(j < k && nums[j] == nums[j-1])j++;
//                    while(j < k && nums[k] == nums[k+1])k--;
//                }
//            }
//        }
//        return ans;
//    }
    public static void main(String[] args) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(2,1,3);
        List<Integer> list3 = Arrays.asList(1,2,3);
        set.add(list1);
        set.add(list2);
        set.add(list3);
        System.out.println(set.size());
        int[] array = {-1, -1, 2, 0, 1};
//        System.out.println(triplet(5,array));
    }
}
