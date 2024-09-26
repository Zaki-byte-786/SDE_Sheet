public class search_target_in_rotated_sorted_array {
    static int function(int[] array,int target){
        int left = 0,right = array.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if (array[mid] == target)return mid;
            else if(array[mid] > array[left]){
                if(array[left] > target) left = mid + 1;
                else right = mid - 1;
            }
            else {
                if (target < array[mid])right = mid - 1;
                else left = mid + 1;
            }
    }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        System.out.println(function(array,2));


    }
}
