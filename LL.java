

public class LL {
        // class for node
    public static class node{
            int data;
            node next;
           //create single node
            public node(int data){
                this.data=data;
                this.next=null;
            }
    }

    public static node head;
    public static node tail;
    public static int size; //(static because all updation ocurs in size)


            //insert new node.
    public void addfirst(int data){
                //create node
                node newnode=new node(data);
                size++;
                //empty node condition
                if(head==null){
                    head=tail=newnode;
                    return;
                }
                //put value in next of head address
                newnode.next=head;
                //newnode as head
                head=newnode;
    }
            
            //add node at last
    public void addlast(int data){
                node newnode=new node(data);
                size++;
                if(head==null){
                    head=tail=newnode;
                    return;
                }
                tail.next=newnode;
                tail=newnode;
    }

    // add in the middle
    public void addmiddle(int data,int idx){
        if (idx==0) {
            addfirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    // remove first node
    public  void removefirst(){
        if(size==0){
            System.out.println("linklist is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
        }
        head=head.next;
        size--;
    }

  // remove last node
  public void removelast(){
    if(size==0){
        System.out.println("ll is empty");
        return;
    }
    else if(size==1){
        head=tail=null;
        size=0;
        return;
    }

    node temp=head;
    for(int i=0;i<size-2;i++){
        temp=temp.next;
    }
     temp.next=null;
     tail=temp;
     size--;
    }

  // search data in node
  public int search(int value){
    node temp=head;
    int i=0;
    while(temp!=null){
        if(value==temp.data){
            return i;
       }
       temp=temp.next;
       i++;
    }
    return -1;
     
  }

  // search recursivly
  public int helper(node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return  idx+1;
  }
  public int recsearch(int key){
   return helper(head,key);
  }
  //reverse ll
  public static void reverse(){
    node prev=null;
    node curr=tail=head;
    node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
  }

  // remove nth node from last(imp)
  public static void removefromlast(int n){
     int size=0;
        node temp=head;
        while(temp==null){
            temp=temp.next;
            size++;
        }
        if(size==n){
            head=head.next;
            return ;
        }
        
        int i=1;
        int pos=size-n;
        node prev=head;
        while(i<pos){
            prev=head.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //mid of the array list
   public node mid(node head){
// slow and fast pointer;
    node slow=head;
    node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    }

    // pallindrom ll
    public boolean isPalindrome(node head) {
        if(head== null || head.next==null){
            return true;
        }
        //middle
        node middle=mid(head);

        // reversing the second half
        node prev=null;
        node curr=middle;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        // check if left & half are same
       node left=head;
       node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
  

// print 
    public void print(){
        if(head==null){
            System.out.println("linklist is empty");
            return;
        }
            node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LL ll=new LL();
        
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(1);  
        //ll.addmiddle(8, 4);
        //ll.print();
        //ll.removefirst();
        //ll.removelast();
        // System.out.println(ll.search(4));
        // System.out.println(ll.search(5));
        // System.out.println(ll.size);
        // System.out.println(ll.recsearch(4));
        //ll.reverse();
        ll.print();
        //ll.removefromlast(3);
         System.out.println(ll.isPalindrome(head));
       
        
    }
}
