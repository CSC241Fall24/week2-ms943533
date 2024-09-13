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
        int f0 = 0;
        int f1 = 1;
        int f2 = 2;
        int fn = 0;

        for(int i = 3; i <= 3; i++){
            fn = f1 + 2 * f2 + 3 * f0;
            
            f0 = f1;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
