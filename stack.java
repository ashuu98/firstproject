  import java.util.*;

  // implementaion of stack using Arraylist.
//  public class stack {
//     static class stackk{
//         static ArrayList<Integer> list=new ArrayList<>();
//         // check empty
//         public static boolean isempty(){
//             return list.size()==0;
//         }
//         // push
//         public static void push(int data){
//             list.add(data);
//         }
//         public static void pop(){
//             if(isempty()){
//                 return ;
//             }
//             list.remove(list.size()-1);
//         }
//         //peak
//         public static int peak(){
//             if(isempty()){
//                 return-1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
 
//     public static void main(String[] args) {
//         // create stack throgh arraylist
//         stackk s=new stackk();
//         s.push(3);
//         s.push(5);
//         s.push(7);

//         while(!s.isempty()){
//             System.out.println(s.peak());
//             s.pop();
//         }

//     }
//  }


// //implementaion of stack using Linkedlist
// public class stack{
//     static class node{
//          int data;
//          node next;
//            node(int data){
//             this.data=data;
//             this.next=null;
//          }
//         }
//     static class stackk{
//         static node  head=null;
     
//         public boolean isempty(){
//             return head==null;
//         }
//     //push
//     public  void push(int data){
//         node newnode=new node(data);
//         if(isempty()){
//             head=newnode;
//             return;
//         }
//         newnode.next=head;
//         head=newnode;
//     }
//     // pop
//     public void pop(){
//     if(isempty()){
//         System.out.println("stack is empty");
//         return;
//         }
//         head=head.next;
//     }

//     // peak
//     public int peek(){
//         if(isempty()){
//             System.out.println("stack is empty");
//             return -1;
//         }
//         return head.data;
//     }
// }
//     public static void main(String[] args){
//        stackk s=new stackk();

//        s.push(3);
//        s.push(4);
//        s.push(7);

//        while(!s.isempty()){
//         System.out.println(s.peek());
//         s.pop();
//        }
         

//     }
// }


// push at botton
// public class stack{
   
//     public static void pushatbuttom(Stack<Integer> s, int data){
//         // base case
//         if(s.isEmpty()){
//             s.push(data);
//             return ;
//         }
//         int top=s.pop();
//         pushatbuttom(s,data);
//         s.push(top);
//     }
//     public static void main(String[] arys){
//         Stack<Integer> s=new Stack<>();
//         s.push(3);
//         s.push(5);  
//         s.push(7);
        
//         pushatbuttom(s,5);
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }

//     }
// }

// reverse a String using stack
public class stack{

    public static String reversestring(String s){
        Stack<Character> st=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            str+=st.pop();
        }
        return str;
    }
    public static void main(String[] args){
       String s="ashutosh";
       System.out.println(reversestring(s));
    }
}