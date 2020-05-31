package cz_spsejecna_krumpholc_c2a;
import java.util.ArrayList;

public class Halda {

    ArrayList<Integer> halda;

    public Halda() {
        super();
        this.halda = new ArrayList<>();
    }

    private void deletion(int index) {
        int smallestElementIndex = index;
        int rightNodeIndex = 2 * index + 2;
        int leftNodeIndex = 2 * index + 1;

        if (leftNodeIndex < halda.size() && halda.get(leftNodeIndex) < halda.get(smallestElementIndex)) {
            smallestElementIndex = leftNodeIndex;
        }

        if (rightNodeIndex < halda.size() && halda.get(rightNodeIndex) < halda.get(smallestElementIndex)) {
            smallestElementIndex = rightNodeIndex;
        }

        if (smallestElementIndex != index) {
            swap(index, smallestElementIndex);
            deletion(smallestElementIndex);
        }
    }

    public void insert(int v) {
        halda.add(v);
        sortInsert(halda.size(), halda.size() - 1);
    }

    private void sortInsert(int n, int i) {
        int parent = (i - 1) / 2;
        if (halda.get(parent) > 0) {
            if (halda.get(i) < halda.get(parent)) {
                swap(i, parent);
                sortInsert(n, parent);
            }
        }
    }

    private void swap(int i1, int i2) {
        int temp = halda.get(i1);
        halda.set(i1, halda.get(i2));
        halda.set(i2, temp);
    }

    public int min() {
        return halda.get(0);
    }

    public int size() {
        return halda.size();
    }

    public int ExtractMin() {
        int smallestTemp = halda.get(0);
        int lastElementIndex = halda.size() - 1;
        halda.set(0, halda.get(lastElementIndex));
        halda.remove(lastElementIndex);
        deletion(0);
        return smallestTemp;
    }

    public void heapPrint() {
        for (int i = 0; i < halda.size(); i++) {
            System.out.println(halda.get(i));
        }
    }

}