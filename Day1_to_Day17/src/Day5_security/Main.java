package Day5_security;

final class SecurityModule {

    public void encryptData() {
        System.out.println("Encrypting data using secure algorithm...");
    }
}
public class Main {
    public static void main(String[] args) {

        SecurityModule obj = new SecurityModule();
        obj.encryptData();
    }
}