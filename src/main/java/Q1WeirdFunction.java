// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if(n < 3){
            return n;
        }
        return fRecursive(n-1) + 2*fRecursive(n-2) + 3*fRecursive(n-3);
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        if(n < 3){
            return n;
        }
        int f = 1;
        int sum = 0;
        if(n >= 3){
            sum += f*(n-f);
            f++;
        }
        return sum;
    }
}
