import java.util.Arrays;

//class Meeting{
//    int startTime;
//    int endTime;
//    int index;
//    Meeting(int startTime,int endTime,int index){
//        this.startTime = startTime;
//        this.endTime = endTime;
//        this.index = index;
//    }
//}

public class Main {
    public static void main(String[] args) {
            int[] start = {2, 4, 6, 7, 9, 8};
            int[] end =   {1, 3, 0, 5, 8, 5};
            Meeting[] meeting = new Meeting[start.length];
        for (int i = 0; i < start.length; i++) {
            meeting[i] = new Meeting(start[i],end[i],i);
        }
        Arrays.sort(meeting,(a,b) -> a.startTime - b.startTime);
        for (int i = 0; i < start.length; i++) {
            System.out.println(meeting[i].startTime + " " + meeting[i].endTime +" "+meeting[i].index);
        }
        System.out.println();
        Arrays.sort(meeting,(a,b) -> a.endTime - b.endTime);
        for (int i = 0; i < start.length; i++) {
            System.out.println(meeting[i].startTime + " " + meeting[i].endTime+" "+meeting[i].index);
        }
        }
    }