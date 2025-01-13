import java.util.Arrays;

public class anagram_Check {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int[] arr = new int[256];

        for(int i = 0;i < sarr.length;i++){
            arr[sarr[i] - 'a']++;
        }
        for(int i = 0;i < tarr.length;i++){
            arr[tarr[i] - 'a']--;
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0)return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "asaddada";
        char[] carr = s.toCharArray();
        Arrays.sort(carr);
        for(var x : carr){
            System.out.print(x+" ");
        }

        System.out.println();
        int[] freq =new int[26];
        for (int i = 0; i < carr.length; i++) {
            freq[carr[i]-'a']++;
        }
        System.out.println(Arrays.toString(freq));
    }
}
