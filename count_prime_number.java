public class count_prime_number {
//    brute
//    boolean prime(int i){
//        for(int j = 2;j <= Math.sqrt(i);j++){
//            if(i % j == 0)return false;
//        }
//        return true;
//    }
//    public int countPrimes(int n) {
//        int count = 0;
//        for(int i = 2;i < n;i++){
//            if(prime(i))count++;
//        }
//        return count;
//    }

//optimal
//    boolean prime(int i){
//        for(int j = 2;j <= Math.sqrt(i);j++){
//            if(i % j == 0)return false;
//        }
//        return true;
//    }
//    public int countPrimes(int n) {
//        int count = 0;
//        if(n <= 1)return 0;
//        boolean[] arr = new boolean[n];
//        for(int i = 0;i < n;i++){
//            arr[i] = true;
//        }
//        for(int i = 2;i <= Math.sqrt(n);i++){
//            if(prime(i)){
//                for(int j = 2;j * i < n;j++){
//                    arr[j*i] = false;
//                }
//            }
//        }
//        for(int i = 2;i < n;i++){
//            if(arr[i])count++;
//        }
//        return count;
//    }

    public static void main(String[] args) {

    }
}
