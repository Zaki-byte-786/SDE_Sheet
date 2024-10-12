import java.util.*;
class Item{
    int value,weight;
    Item(int value,int weight){
        this.value = value;
        this.weight = weight;
    }
}
public class fractional_knapsack_problem {
    static double fractionalKnapsack(int w, Item[] arr, int n) {
        // Your code here
        Arrays.sort(arr,(a,b)->{
            double r1 =(double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2,r1);

        });
        double val = 0.0;
        for(int i = 0;i < n && w > 0;i++){
            if(w >= arr[i].weight){
                val += arr[i].value;
                w -= arr[i].weight;
            }
            else{
                double x = ((double)arr[i].value / arr[i].weight) * w;
                val += x;
                w = 0;
            }
        }

        return val;
    }

    public static void main(String[] args) {
       int []value = {60,100,120};
       int [] weight = {10,20,30};
       int n = value.length;
        Item[] arr = new Item[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Item(value[i],weight[i]);
        }
        double ans = fractionalKnapsack(50,arr,3);
        System.out.println(ans);
    }
}
