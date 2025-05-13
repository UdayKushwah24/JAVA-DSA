package Queue.QueueImplementation;

public class QueueClient {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.Equeue(10);
        q.Equeue(20);
        q.Equeue(30);
        q.Equeue(40);
        q.Equeue(50);
        q.Display();
        System.out.println(q.size());
        System.out.println(q.Dequeue());
        q.Display();
        System.out.println(q.Dequeue());
        q.Display();
        System.out.println(q.Dequeue());
        q.Display();
        System.out.println(q.Dequeue());
        q.Display();
        System.out.println(q.Dequeue());
        q.Display();
        System.out.println(q.Isempty());
        System.out.println(q.Dequeue());
        q.Display();
        System.out.println(q.size());
        System.out.println(q.Isfull());
    }
}
