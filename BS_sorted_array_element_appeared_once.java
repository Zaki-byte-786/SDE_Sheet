public class BS_sorted_array_element_appeared_once {
    // brute force
//    static int singleNonDuplicate(int[] array) {
//        if(array.length == 1)return array[0];
//        for(int i = 0;i < array.length;i++){
//            if(i == 0){
//                if(array[i] != array[i+1])return array[i];
//            }
//            else if(i == array.length - 1){
//                if(array[i] != array[i-1])return array[i];
//            }
//            else{
//                if(array[i] != array[i-1] && array[i] != array[i+1])return array[i];
//            }
//        }
//        return -1;
//    }

    // optimize i.e. TC->O(logN) and SC->O(1)

    static int singleNonDuplicate(int[] array){
        int n = array.length;
        if (n == 1)return array[0];
        if (array[0] != array[1])return array[0];
        if (array[n-1] != array[n-2])return array[n-1];
        int left = 1,right = n-2;
        while (left <= right){
            int mid = (left + right) / 2;
            if (array[mid] != array[mid+1] && array[mid] != array[mid-1])return array[mid];
            else if (mid % 2 == 0){
                if (array[mid] == array[mid-1])right = mid - 1;
                else left = mid + 1;
            }
            else{
                if (array[mid] == array[mid-1])left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
