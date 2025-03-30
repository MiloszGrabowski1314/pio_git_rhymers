package edu.kis.vh.nursery;

public class DefaultNumberRhyming {

    private static final int CAPACITY = 12;

    private static final int FULL_INDEX = 11;

    private static final int EMPTY_INDEX = -1;

    private final int[] NUMBERS = new int[CAPACITY];

    private int total = EMPTY_INDEX;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return NUMBERS[total--];
    }

}
