import java.util.Scanner;

public class Q26 {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public QueueUsingArray(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
        this.size = 0;
    }

    public void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Cannot enqueue " + element);
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            size++;
            System.out.println("Enqueued " + element);
        }
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! The queue is empty.");
            return -1;
        } else {
            int dequeuedElement = queue[front];
            front = (front + 1) % capacity;
            size--;
            return dequeuedElement;
        }
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return queue[front];
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();
        Q26 queue = new Q26(size);

        int choice;
        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued element: " + dequeued);
                    }
                    break;
                case 3:
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front element: " + frontElement);
                    }
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
