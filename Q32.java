class Eg {
    private String message;

    public Eg(String msg) {
        this.message = msg;
    }

    public void displayMessage() {
        System.out.println(message);
    }
}

public class Q32 {
    public static void main(String[] args) {
        Eg obj = new Eg("This is a parameterized constructor.");
        
        obj.displayMessage();
    }
}
