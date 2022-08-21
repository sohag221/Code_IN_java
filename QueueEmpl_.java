import javax.xml.crypto.Data;

public class QueueEmpl_ {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;

        }
    }
    
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return tail==null && head==null;
        }
        //enqueue;
        public static void enqueue(int data){
            Node newNodem =new Node(data);
            if(tail==null){
                tail= head = newNodem;
                return;
            }
            tail.next=newNodem;
            tail=newNodem;
        }
        //dequeue;
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("The queue is empty )>:");
                return -1;
            }
            if(head==tail){
                tail=null;
            }
            int front=head.data;
            head=head.next;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        Queue q=new Queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
     while(!q.isEmpty()){
        System.out.println(q.peek());
        q.dequeue();

     }


    }
}
