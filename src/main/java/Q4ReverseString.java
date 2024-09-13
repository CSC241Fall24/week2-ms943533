public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
        if(s.length() == 1){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args){
        System.out.println(reverse("test string"));
    }
}
