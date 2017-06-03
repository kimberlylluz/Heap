package Heap;

import java.util.*;

public class MinHeap {
    private ArrayList<Integer> a;

    public MinHeap() {
        a = new ArrayList<>();
    }

    private int par(int n) { return n == 0 ? -1 : (n - 1) >>> 1; }
    private int left(int n) { return n * 2 + 1; }
    private int right(int n) { return n * 2 + 2; }
    public int size() { return a.size(); }

    private int minChildIndex(int n) {
        if (left(n) > a.size() - 1) 
        	return -1;
        if (right(n) > a.size() - 1) 
        	return left(n);
        
        return a.get(left(n)) <= a.get(right(n)) ? left(n) : right(n);
    }

    public void add(int n) {
        a.add(n);
        bubbleUp(a.size() - 1);
    }

    public String remove(int rem) {
    	boolean valid = false;
        if (a.size() == 0) throw new NoSuchElementException();

        if (!isHeap()) 
            System.err.println("Heap property broken!");
        
        int arf;
        for(arf=0; arf<a.size(); arf++){
        	if(rem == a.get(arf)){
        		valid = true;
        		break;
        	}
        }
        
        if(valid == false)
            return "Invalid key value.";
        
        a.set(arf, a.get(a.size() - 1));
        a.remove(a.size() - 1);
        bubbleDown(arf);

        if (!isHeap())
            System.err.println("Heap property broken!");
        	
        return ("Done deleting....\nResulting new heap: " + toString());
    }

    private void bubbleUp(int n) {
        int parIndex = par(n);
        while (n > 0 && a.get(parIndex) > a.get(n)) {
            swap(parIndex, n);
            n = parIndex;
            parIndex = par(n);
        }
    }

    private void bubbleDown(int n) {
        int minChildIndex = minChildIndex(n);
        while (minChildIndex != -1 && a.get(minChildIndex) < a.get(n)) {
            swap(minChildIndex, n);
            n = minChildIndex;
            minChildIndex = minChildIndex(n);
        }
    }

    public boolean isHeap() {
        for (int i = 1; i < a.size(); ++i) {
            if (par(i) <= 0) {
                if (a.get(par(i)) > a.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void swap(int i, int j) {
        int tmp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, tmp);
    }

    public String toString() {
        return a.toString();
    }
}