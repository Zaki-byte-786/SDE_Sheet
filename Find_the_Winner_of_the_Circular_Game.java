import java.util.ArrayList;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class Find_the_Winner_of_the_Circular_Game {
    static int findTheWinner(int n, int k) {
        Node head = new Node(1);
        Node temp = head;
        for (int i = 2; i <= n ; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        temp.next = head;
        Node prev = temp;
        temp = head;
        int size = n,x = k;
        while (size > 1) {
                while (x > 1) {
                    prev = temp;
                    temp = temp.next;
                    x--;
                }
                prev.next = temp.next;
                temp = temp.next;
                size--;
                x = k;

        }
        return temp.data;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
