public class merge_two_sorted_array {
//    optimal - LEETCODE
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] ans = new int[m+n];
//        int i = 0,j = 0,k= 0;
//        while(i < m && j < n){
//            if(nums1[i] <= nums2[j]){
//                ans[k] = nums1[i];
//                k++;
//                i++;
//            }
//            else{
//                ans[k] = nums2[j];
//                k++;
//                j++;
//            }
//        }
//        while(j < n){
//            ans[k++] = nums2[j++];
//        }
//        while(i < m){
//            ans[k++] = nums1[i++];
//        }
//        for(i = 0;i < n+m;i++){
//            nums1[i] = ans[i];
//        }
//    }

//without space
//void swap(int i,int j,int[] nums1){
//    int temp = nums1[i];
//    nums1[i] = nums1[j];
//    nums1[j] = temp;
//}
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for(int i = 0;i < n;i++){
//            nums1[i+m] = nums2[i];
//        }
//        int i = m-1,j = m;
//        while(i >= 0 && j < m+n && nums1[i] > nums1[j]){
//            swap(i,j,nums1);
//            i--;
//            j++;
//        }
//        Arrays.sort(nums1,0,m);
//        Arrays.sort(nums1,m,m+n);
//    }

//    coding ninja
//static void swap(int i,int j,long[]a,long[]b){
//    long temp = a[i];
//    a[i] = b[j];
//    b[j] = temp;
//}
//    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
//        // Write your code here.
//        int i = a.length - 1,j = 0;
//        while(i >= 0 && j < b.length && a[i] > b[j]){
//            swap(i,j,a,b);
//            i--;
//            j++;
//        }
//        Arrays.sort(a);
//        Arrays.sort(b);
//    }

    public static void main(String[] args) {

    }
}
