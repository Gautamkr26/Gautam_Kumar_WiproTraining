package Day6;
public class NullWrapperDemo {

    public static void main(String[] args) {

        String s = null;

        try {
            Integer i = Integer.valueOf(s);
            System.out.println("Integer: " + i);
        } catch (Exception e) {
            System.out.println("Integer conversion failed");
        }

        try {
            Double d = Double.valueOf(s);
            System.out.println("Double: " + d);
        } catch (Exception e) {
            System.out.println("Double conversion failed");
        }

        // Boolean does not throw exception
        Boolean b = Boolean.valueOf(s);
        System.out.println("Boolean: " + b);
    }
}