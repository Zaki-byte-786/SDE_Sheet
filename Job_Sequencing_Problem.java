import java.util.Arrays;

class job{
    int id;
    int deadline;
    int profit;
    job(int id,int deadline,int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Job_Sequencing_Problem {
    static int[] JobScheduling(job[] job, int n){
        int maxDeadline = -1,maxProfit = 0,count = 0;
        for (int i = 0; i < job.length; i++) {
            maxDeadline = Math.max(maxDeadline,job[i].deadline);
        }

        Arrays.sort(job,(a,b)->b.profit - a.profit);
        int[] visit = new int[maxDeadline + 1];
        for (int i = 0; i < n; i++) {
            for (int j = job[i].deadline; j >= 0 ; j--) {   // if 0th day is the first working day then j>= 0  (gfg)
                                                            // https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
                if (visit[j] == 0){                         // if 1th day is the first working day then j > 0  (coding ninja)
                    visit[j] = job[i].id;                   // https://www.naukri.com/code360/problems/job-sequencing-problem_1169460?leftPanelTabValue=PROBLEM
                    maxProfit += job[i].profit;
                    count++;
                    break;
                }
            }
        }
        int[] ans = {count,maxProfit};
        return ans;
    }
    public static void main(String[] args) {
        int[] id =       {1,2,3,4,5,6,7,8};
        int[] deadline = {4,5,6,6,4,2,2,2};
        int[] profit =   {20,60,70,65,25,80,10,22};
//        job[] job = new job[id.length ];
//        for (int i = 0; i < job.length; i++) {
//            job[i] = new job(id[i],deadline[i],profit[i]);
//        }
//        for (int i = 0; i < job.length; i++) {
//            System.out.println(job[i].id + " " + job[i].deadline + " " + job[i].profit);
//        }
//        System.out.println();
//        Arrays.sort(job,(a,b)->b.profit - a.profit);
//        for (int i = 0; i < job.length; i++) {
//            System.out.println(job[i].id + " " + job[i].deadline + " " + job[i].profit);
//        }
        int n = id.length;
        job[] job = new job[n];
        for (int i = 0; i < n; i++) {
            job[i] = new job(id[i],deadline[i],profit[i]);
        }
        int[] ans = JobScheduling(job,n);
        System.out.println(Arrays.toString(ans));
    }
}


//coding ninja solution
//import java.util.Arrays;
//
//public class Solution {
//    static class job{
//        int id;
//        int deadline;
//        int profit;
//        job(int id,int deadline,int profit){
//            this.id = id;
//            this.deadline = deadline;
//            this.profit = profit;
//        }
//    }
//    public static int[] jobScheduling(int [][]array) {
//        // Write your code here
//        int N = array.length,maxDeadline = -1,count = 0,profit = 0;
//        job[] job = new job[N];
//        for(int i = 0;i < N;i++){
//            maxDeadline = Math.max(maxDeadline,array[i][1]);
//        }
//        for(int i = 0; i < N;i++){
//            job[i] = new job(array[i][0], array[i][1], array[i][2]);
//        }
//        Arrays.sort(job,(a,b)->b.profit - a.profit);
//
//        int[] visit = new int[maxDeadline + 1];
//        for(int i = 0; i < N;i++){
//            for(int j = job[i].deadline-1;j >= 0;j--){
//                if(visit[j] == 0){
//                    visit[j] = job[i].id;
//                    count++;
//                    profit += job[i].profit;
//                    break;
//                }
//            }
//        }
//        int[] ans = {count,profit};
//        return ans;
//
//    }
//}
