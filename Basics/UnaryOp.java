public class UnaryOp {

    public static void main(String[] args) {
        
        int a = 3;

        int b = 2;

        System.out.println("Pre = " + (++a));
        System.out.println("Post = " + (b++));
        System.out.println(b);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(b--);
        System.out.println(a);
        System.out.println(b);
    }
    
}
