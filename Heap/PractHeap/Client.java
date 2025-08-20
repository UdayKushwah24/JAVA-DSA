package Heap.PractHeap;

 
public class Client {
   
    public static void main(String[] args) {
        Heap mh = new Heap();
        mh.add(5);
        mh.add(7);
        mh.add(9);
        mh.add(4);
        mh.add(2);
        mh.add(3);
        mh.Display();
        System.out.println(mh.remove());
        mh.Display();

    }
}