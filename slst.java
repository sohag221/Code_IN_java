class slst{
    private int size;
    Node head;
    slst(){
        this.size=0;
    }
    class Node{
        String data;
        Node  next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //addFirst;
    public  void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    //addlast;
    public  void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=new Node(data);
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    //printlist;

    public void printList(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data);
            currNode=currNode.next;
        }
        System.out.println("!");
    }

    //delete first;
    public  void deletFrst(){
        if(head==null){
            System.out.println("The list is empty!");
            return;
        }
        head=head.next;
        size--;
    }
// delete last;

    public void deletLst(){
        if(head==null){
            System.out.println("The list is empty!");
            return;
       }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node scdlstN=head;
        Node lstN=head.next;
        while(lstN.next!=null){
            scdlstN=scdlstN.next;
            lstN=lstN.next;
        }
        scdlstN.next=null;
    }
    
    //size;
    public int getsize(){
        return size;
    }
    public void previouse(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node preNode=head;
        Node currNotde=head.next;
        while(currNotde!=null){
            Node nextNode= currNotde.next;
            currNotde.next=preNode;

            preNode=currNotde;
            currNotde=nextNode;
        }
        head.next=null;
        head=preNode;
    }
    Node reverse(Node head){
        if (head==null || head.next==null) {
            return head;

        }
        Node newNode=reverse(head.next);
        Node headNext=head.next;
        head.next=head;
        head=null;
        return newNode;
    }

    public static void main(String[] args) {

        slst s=new slst();
        s.addfirst(" code ");
        s.addfirst("sohag's ");
        s.addfirst("is ");
        s.addfirst("this ");
        s.printList();
        int r=  s.getsize();
        System.out.println(r);
        s.deletFrst();
        int t=s.getsize();
        System.out.println(t);
        s.previouse(s.head);
        System.out.println(s);
        s.reverse(s.head);
        System.out.println(s);
    }
}
