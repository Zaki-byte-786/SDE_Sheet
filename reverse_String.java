public class reverse_String {
    public static String reverseString(String s) {
        // code here
        char[] arr = s.toCharArray();
        int left = 0,right = arr.length - 1;
        char temp = 'a';
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
//    TC -> O(N)
//    SC -> O(N)
public static void main(String[] args) {

}
}
