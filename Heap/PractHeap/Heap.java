package Heap.PractHeap;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> ll = new ArrayList<>();

    public void add(int item) {
        ll.add(item);
        upheapify(ll.size() - 1);
    }

    private void upheapify(int ci) {
        int pi = (ci - 1) / 2;
        if (ll.get(pi) > ll.get(ci)) {
            swap(pi, ci);
            upheapify(pi);
        }
    }

    private void swap(int pi, int ci) {
        int pith = ll.get(pi);
        int cith = ll.get(ci);
        ll.set(ci, pith);
        ll.set(pi, cith);
    }

    public int get() {
        return ll.get(0);
    }

    public int size() {
        return ll.size() - 1;
    }

    public void Display() {
        System.out.println(ll);
    }

    public int remove() {
        int rv = ll.get(0);
        swap(0, ll.size() - 1);
        ll.remove(ll.size() - 1);
        downHeapify(0);
        return rv;
    }

    private void downHeapify(int pi) {
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        int mini = pi;
        if (lci < ll.size() && ll.get(lci)< ll.get(mini)) {
            mini = lci;
        }
        if (rci < ll.size() && ll.get(rci)< ll.get(mini)) {
            mini = rci;
        }
        if (mini != pi) {
            swap(pi, mini);
            downHeapify(mini);
        }
    }
}
