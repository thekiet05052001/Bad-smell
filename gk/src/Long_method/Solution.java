package Long_method;

public class Solution {
    void printOwing() {
        printBanner();
        printDetails(getOutstanding());
    }

    private double getOutstanding() {
        return 0;
    }

    private void printBanner() {
    }

    void printDetails(double outstanding) {
        String name = null;
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
}
