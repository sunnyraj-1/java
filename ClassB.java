public class ClassB {
    int meth1(String s) {
        System.out.println("java");
        System.out.println(s);
        return 10;
    }

    int meth1(int s) {
        System.out.println("java");
        System.out.println(s);
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("Start");
        int c = 10;
    
        ClassB  b = new ClassB();
        int a = new ClassB().meth1("Hello");
        
        System.out.println(a);
        System.out.println("END");
    }
}
