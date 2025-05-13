package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Practice {

    // public static String ConstructSmallNum(String pattern) {
    //     Stack<Integer> stack = new Stack<>();
    //     int len = pattern.length();
    //     int[] ansArr = new int[len+1];
    //     int count = 1;
    //     for (int i = 0; i <= pattern.length(); i++) {
    //         if(i == pattern.length() || pattern.charAt(i) == 'I') {
    //             System.out.println(stack);
    //             ansArr[i] = count;
    //             count++;
    //             while (!stack.isEmpty()) {
    //                 ansArr[stack.pop()] = count;
    //                 count++;
    //             }
    //         } else {
    //             stack.push(i);
    //         }
    //     }
    //     String ans = "";
    //     for(int ele:ansArr) {
    //         ans += ele+" ";
    //     }
    //     System.out.println(stack);
    //     return ans;
    // }
    
    // public static void main(String[] args) {
    //     // String pattern = "IIIDIDDD";
    //     String pattern = "IIIDIDDI";
    //     System.out.println(ConstructSmallNum(pattern));
    // }  
    
    

    /* public static void Insert_Bottom(Stack<Integer> stack , int item) {
        if(stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int ele = stack.pop();
        Insert_Bottom(stack, item);
        stack.push(ele);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        Insert_Bottom(stack, -5);
        System.out.println(stack);
    } */



    /* 
    public static void Insert_Bottom(Stack<Integer> stack , int item) {
        if(stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int ele = stack.pop();
        Insert_Bottom(stack, item);
        stack.push(ele);
    }
      
    public static void Reverse_Stack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int x = stack.pop();
        Reverse_Stack(stack);
        Insert_Bottom(stack, x);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        Reverse_Stack(stack);
        System.out.println(stack);
    } */

   /*  public static void Insert_Bottom(Stack<Integer> stack, int item){
        if(stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int rem = stack.pop();
        Insert_Bottom(stack, item);
        stack.push(rem);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        Insert_Bottom(stack, -5);
        System.out.println(stack);
    } */

    /* public static void Insert_Bottom(Stack<Integer> stack, int item){
        if(stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int rem = stack.pop();
        Insert_Bottom(stack, item);
        stack.push(rem);
    }

    public static void ReverseStack(Stack<Integer> stack){
        if(stack.isEmpty()) {
            return;
        }
        int rem = stack.pop();
        ReverseStack(stack);
        Insert_Bottom(stack, rem);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        ReverseStack(stack);
        System.out.println(stack);
    }
 */



   /*  public static String Con_Small(String pattern) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[pattern.length()+1];
        int count = 1;
        for (int i = 0; i <= pattern.length(); i++) {
            if(i == pattern.length() || pattern.charAt(i) == 'I') {
                arr[i] = count;
                count++;
                while (!stack.isEmpty()) {
                    arr[stack.pop()] = count;
                    count++;
                }
            } else {
                stack.push(i);
            }
        }
        String ans = "";
        for (int element : arr) {
            ans += element+" ";
        }
        return ans;
    }

    public static void main(String[] args) {
        String pattern = "IDIDIID";
        System.out.println(Con_Small(pattern));
    }       */ 


    /* public static int FindCelebrity(int[][] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if(arr[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }

        int celebrity = stack.pop();
        for (int i = 0; i < arr.length; i++) {
            if(celebrity == i) {
                continue;
            }
            if(arr[celebrity][i] == 1 ||  arr[i][celebrity] == 0) {
                return -1;
            }
        }
        return celebrity;
    }
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
        System.out.println(FindCelebrity(arr));
    } */
           



 
/*    
     public static void Insert_Bottom(Stack<Integer> stack, int ele) {
        if(stack.isEmpty()) {
            stack.push(ele);
            return;
        }
        int popEle = stack.pop();
        Insert_Bottom(stack, ele);
        stack.push(popEle);        
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        Insert_Bottom        stack.push(30);
(stack, -5);
        System.out.println(stack);
    }

 */




/* 
    public static void Insert_Bottom(Stack<Integer> stack, int ele) {
        if(stack.isEmpty()) {
            stack.push(ele);
            return;
        }
        int popEle = stack.pop();
        Insert_Bottom(stack, ele);
        stack.push(popEle);        
    }

    public static void Reverse(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int ele = stack.pop();
        Reverse(stack);
        Insert_Bottom(stack, ele);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        Reverse(stack);
        System.out.println(stack);
    }    
        
    */



    
   /*  
    public static void ConstructSmall(String str) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[str.length()+1];
        int count = 1;
        for (int i = 0; i <= str.length(); i++) {
            if(i == str.length() || str.charAt(i) == 'I') {
                ans[i]= count;
                count++;
                while (stack.size() > 0) {
                    ans[stack.pop()] = count;
                    count++;
                }
            } else {
                stack.push(i);
            }
        }
        String s = "";
        for (int i = 0; i < ans.length; i++) {
            s += ans[i];
        }
        System.out.println(s);        
    }
    public static void main(String[] args) {
        String str = "IDIDIDD";
        ConstructSmall(str);
    }     
    */
     



    /* public static void StockSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        
        for (int i = 0; i < ans.length; i++) {
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            // calculate span 
            if(stack.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] = i-stack.peek();
            }
            stack.push(i);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" -> "+ans[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {30, 35, 40, 38, 35};
        // int[] arr = {50, 3, 4, 8, 9};
        StockSpan(arr);
            
    } */


  /*   
   public static void NextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int pop = stack.pop();
                ans[pop] = i-pop;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = 0;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" -> "+ans[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        NextGreater(arr);
    } 
 */
    

   /*  public static void StackSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] = i-stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i] + " -> "+ans[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 11, 9, 7, 13, 3};
        StackSpan(arr);
    }   */    
           


/*     
    public static void Area(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] < height[stack.peek()]) {
                int h = height[stack.pop()];
                int R = i;
                if(stack.isEmpty()) {
                    area = Math.max(area, h*R);
                } else {
                    int l = stack.peek();
                    area = Math.max(h*(R-l-1), area);
                }
            }
            stack.push(i);
        }
        System.out.println(stack);
        int R = height.length;
        while (!stack.isEmpty()) {
            int h = height[stack.pop()];
            if(stack.isEmpty()) {
                area = Math.max(area, h*R);
            } else {
                int l = stack.peek();
                area = Math.max(h*(R-l-1), area);
            }
        }
        System.out.println(area);
    } */


   /*  public static void Area(int[] Height) {
        int height[] = new int[Height.length+1];
        for (int i = 0; i < Height.length; i++) {
            height[i] = Height[i];
        }
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] < height[stack.peek()]) {
                int h = height[stack.pop()];
                int R = i;
                if(stack.isEmpty()) {
                    area = Math.max(area, h*R);
                } else {
                    int l = stack.peek();
                    area = Math.max(h*(R-l-1), area);
                }
            }
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(area);
    }
    public static void main(String[] args) {
        int[] height = {2,3,5,4,6,1,13};
        // int[] height = {2,3,5,4,6,1,13,0};
        Area(height);
    } */


    /* public static void Insert(Stack<Integer> stack, int item) {
        if(stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int p = stack.pop();
        Insert(stack, item);
        stack.push(p);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        Insert(stack, -9);
        System.out.println(stack);
    } */


    /* public static void Insert(Stack<Integer> stack, int item) {
        if(stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int p = stack.pop();
        Insert(stack, item);
        stack.push(p);
    }
    public static void Reverse(Stack<Integer> stack, int item) {
        if(stack.isEmpty()) {
            return;
        }
        int p = stack.pop();
        Reverse(stack, item);
        Insert(stack, p);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        Reverse(stack, -9);
        System.out.println(stack);
    } */


    /* public static void ConstructSmall(String str) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[str.length()+1];
        int count = 1;
        for (int i = 0; i <= str.length(); i++) {
            if(i == str.length() || str.charAt(i) == 'I') {
                arr[i] = count;
                count++;
                while (!stack.isEmpty()) {
                    arr[stack.pop()] = count;
                    count++;
                }
            } else {
                stack.push(i);
            }
        }
        System.out.println(stack);
         
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        String str = "DIDIDIDD";
        ConstructSmall(str);
    } */

    /* public static int celebrity(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if(arr[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }
        System.out.println(stack);
        int cel = stack.pop();
        for (int i = 0; i < arr.length; i++) {
            if(arr[cel][cel] == 0) {
                continue;
            }
            if(arr[i][cel] == 0 || arr[cel][i]==1) {
                return -1;
            }
        }
        return cel;
    }
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, 
                        { 1, 0, 1, 1 }, 
                        { 0, 0, 0, 0 },
                        { 1, 1, 1, 0 } };

        System.out.println(celebrity(arr));
    } */

    /* public static void NextGreater(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ans.length-1; i++) {
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]) {
                    ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" -> "+ans[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,11,9,7,13,3};
        NextGreater(arr);
    } */

   /*  public static void StockSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] = i-stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" -> "+ans[i]);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {5,11,9,7,13,3};
        StockSpan(arr);
    } */

    public static void Histogram(int[] height) {
        Stack<Integer> stack = new Stack<>();
        

    }
    public static void main(String[] args) {
        int[] height = {2,3,5,4,6,1,7};
        Histogram(height);
    }


}
