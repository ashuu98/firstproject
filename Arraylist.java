
 import java.util.*;
// public class Arraylist {

//     public static void main(String[] args) {
//         ArrayList<Integer> num=new ArrayList<>();
//         num.add(4);
//         num.add(5);
//         num.add(3);
//         num.add(8);
        
//         int mv=Integer.MIN_VALUE;
//         // search
//         for(int i=0;i<num.size()-1;i++){
//             if(num.get(i)==3){
//                 System.out.println(i);
                
//             }
//         }
//         //reverse
//         for(int i=num.size()-1;i>=0;i--){
//             System.out.print(num.get(i)+" ");
//         }
//         System.out.println(" ");

//         //find maximum
//         for(int i=0;i<=num.size()-1;i++){
//            if(num.get(i)>mv){
//             mv=num.get(i);
//            }
//         }
//         System.out.println("maximum value :"+mv);
//     }
// }


// swap two no,
// public class Arraylist{
//     public static void swap(int i,int j,ArrayList<Integer>nums){
//        int temp=nums.get(i);
//        nums.set(i,nums.get(j));
//        nums.set(j,temp);

//        System.out.println(nums);
        
//     }
//     public static void main (String[] args){
//       ArrayList<Integer> nums=new ArrayList<>();
//       nums.add(2);
//       nums.add(4);
//       nums.add(52);
//       nums.add(6);
//       nums.add(7);
//       nums.add(24);
//       nums.add(27);

//     System.out.println(nums);
//       swap(1,5,nums);

//       // ascending sorting
//       Collections.sort(nums);
//       System.out.println(nums);
//       // decending sorting
//       Collections.sort(nums,Collections.reverseOrder());
//       System.out.println(nums);
//     }
// }

//multi array
// public class Arraylist {

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();

//         ArrayList<Integer> list1=new ArrayList<>();
//         list1.add(111);
//         list1.add(11);
//         list1.add(1);
//         mainlist.add(list1);

//          ArrayList<Integer> list2=new ArrayList<>();
//         list2.add(11);
//         list2.add(1);
//         list2.add(123);
//         mainlist.add(list2);

//         System.out.println(mainlist);
//         Collections.sort(list1);
//         Collections.sort(list2);
//         System.out.println(mainlist);
//     }
// }

//print arraylist
// public class Arraylist {

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();

//         ArrayList<Integer> list1=new ArrayList<>();
//         ArrayList<Integer> list2=new ArrayList<>();
//         ArrayList<Integer> list3=new ArrayList<>();

//         for(int i=1;i<=5;i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//         }
//         mainlist.add(list1);
//         mainlist.add(list2);
//         mainlist.add(list3);

//         System.out.println(mainlist);

//         for(int i=0;i<mainlist.size();i++){
//             ArrayList<Integer> crrlist=mainlist.get(i);
//             for(int j=0;j<crrlist.size();j++){
//                 System.out.print(crrlist.get(j)+" ");
//             }
//             System.out.println(" ");
//         }

//     }
// }

// contanier with more water
//public class Arraylist {
    // brute force
//   public static void area(ArrayList<Integer> height){
//     int h=0;
//       int max=0;
//       int ca=0;

//       for(int i=0;i<height.size();i++){
//         h=height.get(i);
//         for(int j=i+1;j<height.size();j++){
//             int length=Math.min(h,height.get(j));
//             int width=j-i;
//             ca=(length*width);
//             if(ca>max){
//                 max=ca;
//             }
//         }
//       }
//       System.out.println(max);
//   }

// // 2 pointer apporch
// public static void containwater(ArrayList<Integer> height){
//     int maxwater=0;
//     int left=0;
//     int right=height.size()-1;

//     while(left<right){
//         int width=right-left;
//         int length=Math.min(height.get(right),height.get (left));
//         int currwater=(width*length);
//          maxwater=Math.max(currwater,maxwater);

//         if(height.get(left)<height.get(right)){
//             left++;
//         }
//         else{
//             right--;
//         }
//     }
//     System.out.println(maxwater);
// }
//     public static void main(String[] args) {
//         ArrayList<Integer> height=new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//        //area(height);
//        containwater(height);
//     }
// }

// public class Arraylist {
//     public static boolean pairsum(ArrayList<Integer>list, int target){
//        int bp=-1;
//        int n=list.size();
//        for(int i=0;i<list.size();i++){
//         if(list.get(i)>list.get(i+1)){
//             bp=i;
//             break;
//         }
//        }
//         int lp=bp+1;
//         int rp=bp;
//        while(lp!=rp){
//         if(list.get(lp)+list.get(rp)==target){
//             return true;
            
//         }
//         if(list.get(lp)+list.get(rp)<target){
//             lp=(lp+1)%n;
//         }
//         else{
//             rp=(n+rp-1)%n;
//         }
//        }
//        return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);

//         int target=18;
//         System.out.println(pairsum(list,target));
//     }

    
// }

// monotonic arraylist

// public class Arraylist { 
//     public static boolean monotonic(ArrayList<Integer> list){
//        // increacsing
//        boolean inc=true;
//        boolean dec=true;

//        for(int i=0;i<list.size()-1;i++){
//          if(list.get(i)>list.get(i+1)) inc=false;
//          if(list.get(i)<list.get(i+1)) dec=false;
//        }
//        return inc||dec;

//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(1);
//         list.add(4);
//         list.add(2);
//         list.add(3);
//         System.out.println(monotonic(list));

//     }
// }

// lonly number in arraylist
// public class Arraylist {
//     public static void lonly(ArrayList<Integer> list){
//         int arr[]=new int[2];
        
//         for(int i=0;i<list.size();i++){
//             for(int j=i+1;j<list.size();j++){
//                 if(list.get(i)==list.get(j)){
//                     list.remove(j);
//                 }
//                 int num=list.get(i);
//                 if(list.get(j)==num-1 || list.get(j)==num+1){
//                     list.remove(j);
//                 }
//             }
//             System.out.println(list);
//         }
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(10);
//         list.add(6);
//         list.add(5);
//         list.add(8);

//         lonly(list);
//     }
// }
// import java.util.*;
// public class Arraylist{
//     public static void stringvalid(String str){
//       int count=0;
//       int length=str.length();
//       if(length%2==0){
//         for(int i=0;i<length;i++){
//             if(str.charAt(i)=='&' || str.charAt(i)=='@'){
//                 count++;
//             }
//         }
//       }
//       if(count==2){
//         System.out.println("yes");
//     }
//     else{
//         System.out.println("no");
//     }
//     }
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         String str=s.nextLine();
//         stringvalid(str);
//     }
// }
 
public class Arraylist {

 public static boolean issafe(char board[][],int row,int col){
        //verticalup check
        for(int i=row-1;i>=0;i++){
            if(board[i][col]=='Q'){ return false;}
        }

        //left up diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){ return false;}
        }

        // right up diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q') {return false;
        }
    } return true;
 }
    public static void printboard(char board[][]){
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println( );
       }
       System.out.println( );
    }

    public  static void nqueen(char board[][],int i){
       // base case
       if(i==board.length){
        printboard(board);
        return;
       }
       for(int j=0;j<board.length;j++){
        if(issafe(board,i,j)){
        board[i][j]='Q';
        nqueen(board,i+1); // fun calling.
        board[i][j]='.'; // backtracking.
        }
       }
    }
    public static void main(String[] args) {
        // craete array
        int n=2;
        char board[][]=new char [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
          nqueen(board,0);
    }
}
