class Example {
    private String message;

    public Example() {
        message = "This is a 0-arguments constructor.";
    }

    public void displayMessage() {
        System.out.println(message);
    }
}

public class Q31 {
    public static void main(String[] args) {
        Example obj = new Example();

        obj.displayMessage();
    }
}
