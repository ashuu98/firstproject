 import java.util.*;
 public class stack {
    static class stackk{
        static ArrayList<Integer> list=new ArrayList<>();
        // check empty
        public static boolean isempty(){
            return list.size()==0;
        }
        // push
        public static void push(int data){
            list.add(data);
        }
        public static void pop(){
            if(isempty()){
                return ;
            }
            list.remove(list.size()-1);
        }
        //peak
        public static int peak(){
            if(isempty()){
                return-1;
            }
            return list.get(list.size()-1);
        }
    }
 
    public static void main(String[] args) {
        // create stack throgh arraylist
        stackk s=new stackk();
        s.push(3);
        s.push(5);
        s.push(7);

        while(!s.isempty()){
            System.out.println(s.peak());
            s.pop();
        }

    }
 }