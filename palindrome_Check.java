public class palindrome_Check {
    String reverse(String s){
        char[] arr = s.toCharArray();
        char temp = 'a';
        int left = 0,right = arr.length - 1;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    boolean isPalindrome(String s) {
        // code here
        String rev = reverse(s);
        return rev.equals(s);

    }

    public static void main(String[] args) {

    }
}
