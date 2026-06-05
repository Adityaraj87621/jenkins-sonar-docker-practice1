public class HelloWorld {

    public void sayHello() {
        System.out.println("Hello World!");
    }

    public void notCovered() {
        System.out.println("This method is not covered by unit tests");
    }

    public static void main(String[] args) {
        System.out.println("Application Started");

        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
