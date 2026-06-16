package Day7;
class Kitchen {
    synchronized void useStove(String chefName) {
        System.out.println(chefName + " is cooking...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(chefName + " interrupted");
        }
        System.out.println(chefName + " finished cooking");
    }
}
class Chef extends Thread {
    Kitchen kitchen;

    Chef(String name, Kitchen kitchen) {
        super(name);
        this.kitchen = kitchen;
    }
    public void run() {
        kitchen.useStove(getName());
    }
}
public class main {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();

        Chef c1 = new Chef("Chef-1", kitchen);
        Chef c2 = new Chef("Chef-2", kitchen);

        c1.start();
   
        c2.start();
    }
}