class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    public MyLinkedList() {
        this.head = null;
    }
    
    public int get(int index) {
        Node temp = head;
        int c = 0;
        while(temp !=null){
            if(c==index){
                return temp.data;
            }
            c++;
            temp = temp.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node p = new Node(val);
        if(head==null){
            head = p;
        }else{
            Node temp = head;
            p.next = head;
            head = p;
        }
    }
    
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(head==null){
            head= temp;
        }else{
            Node p = head;
            while(p.next !=null){
                p = p.next;
            }
             p.next = temp;
        }
    }
    
    public void addAtIndex(int index, int val) {
        Node p = new Node(val);
        if(index <0){
            index =0;
        }
        if(index == 0){
            p.next = head;
            head = p;
            return ;
        }else{
            Node temp = head;
           for(int i = 0; i<index-1; i++){
            if(temp == null){
                return ;
            }
            temp = temp.next;
           }
           if(temp == null){
            return ;
           }
            p.next = temp.next;
            temp.next = p;
        }
    }
    
    public void deleteAtIndex(int index) {
        Node temp = head;
        if(index<0){
            index = 0;
        }
        if(index == 0){
           head = head.next;
           return;
        }else{
            for(int i = 0; i<index-1; i++){
            if (temp == null || temp.next == null){
                return;
             }
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
            return;
        }
            temp.next = temp.next.next;
        }


    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */