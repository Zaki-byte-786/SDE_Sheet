import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class pascal_Triangle {

//    important code for evaluation of factorial

//    static int factorial(int n){
//        int ans = 1;
//        while(n != 0){
//            ans *= n;
//            n--;
//        }
//        return ans;
//    }
//    static int combination(int n,int r){
//        return (factorial(n) / (factorial(n-r) * factorial(r)));
//    }
//    static int combination_Optimized(int n,int r){
//        if (r > n-r)r = n-r;
//        int result = 1;
//        for (int i = 0; i < r; i++) {
//            result *= n-i;
//            result /= i+1;
//        }
//        return result;
//    }


    // function to find element at ith row and jth column with 1 based index


//    static int element_At_I_J(int i,int j){
//        int n = i-1;
//        int r = j-1;
//        if(r > n-r)r = n-r;
//        if (n == 0 || r == 0)return 1;
//        int ans = 1;
//        for(int k = 0;k < r;k++){
//            ans *= n-k;
//            ans /= k+1;
//        }
//        return ans;
//    }


    // function to print kth row of pascal triangle

//    static void printKthLine(int k){
//        for (int j = 1; j <= k; j++) {
//            int x = element_At_I_J(k,j);
//            System.out.print(x+" ");
//        }
//    }

    // function to print kth row of pascal triangle optimized


//    static void printKthLine(int k){
//        int ans = 1;
//        System.out.print(ans+" ");
//        for (int i = 1; i < k ; i++) {
//            ans *= k-i;
//            ans /= i;
//            System.out.print(ans+" ");
//        }
//    }


//    static int factorial(int n){
//        int ans = 1;
//        while(n != 0){
//            ans *= n;
//            n--;
//        }
//        return ans;
//    }
//    static int combination(int n,int r){
//        return (factorial(n) / (factorial(n-r) * factorial(r)));
//    }
//    static int combination_Optimized(int n,int r){
//        if (r > n-r)r = n-r;
//        int result = 1;
//        for (int i = 0; i < r; i++) {
//            result *= n-i;
//            result /= i+1;
//        }
//        return result;
//    }

    // function to print the complete pascal triangle with k lines

//    static void pascal(int k){
//        for (int i = 1; i <= k ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                int x = element_At_I_J(i,j);
//                System.out.print(x+" ");
//            }
//            System.out.println();
//        }
//    }


    // function to return list of list having lin by line pascal triangle row
    // e.g. [[1],[1 1],[1 2 1],[1 3 3 1]]


    static List<Integer> storeKthLine(int k){
        int ans = 1;
        List<Integer> list = new LinkedList<>();
        list.add(ans);
        for (int i = 1; i < k ; i++) {
            ans *= k-i;
            ans /= i;
            list.add(ans);
        }
        return list;
    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();
        for (int i = 1; i <= numRows ; i++) {
            List<Integer> list = new LinkedList<>();
            list = storeKthLine(i);
            ans.add(list);
        }
        return ans;
    }
    public static void main(String[] args) {
//        System.out.println(element_At_I_J(10,3));
//        printKthLine(5);
//        pascal(6);
        System.out.println(generate(5));
    }
}
