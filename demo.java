public class Demo {
    public static void main (String args[]) {
        System.out.println("main");
        System.out.println("branch2");
        System.out.println("branch1");
        if (true) {
            System.out.println("branch1");
        }
        else {
            System.out.println("branch2");
        }
    }
}