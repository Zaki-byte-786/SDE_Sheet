import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Meeting{
    int startTime;
    int endTime;
    int index;
    Meeting(int startTime,int endTime,int index){
        this.startTime = startTime;
        this.endTime = endTime;
        this.index = index;
    }
}
public class N_meeting_in_One_room {
    static int maxMeetings(int n, int[] start, int[] end) {
        // add your code here
        Meeting[] meetingArray = new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetingArray[i] = new Meeting(start[i],end[i],i);
        }
        Arrays.sort(meetingArray,(a,b)->a.endTime-b.endTime);
        List<Integer> list = new LinkedList<>();
        list.add(meetingArray[0].index + 1);
        int count = 1, freeAt = meetingArray[0].endTime;
        for (int i = 1; i < n; i++) {
            if(freeAt < meetingArray[i].startTime){
                count++;
                list.add(meetingArray[i].index + 1);
                freeAt = meetingArray[i].endTime;
            }
        }
        System.out.println(list);
        return count;
    }
    public static void main(String[] args) {
        int[] start = {0,3,1,5,5,8};
        int[] end =   {5,4,2,9,7,9};
      int ans  = maxMeetings(start.length,start,end);
        System.out.println(ans);

    }
}
