package edu.kis.vh.nursery;

public class HanoiRhyming extends DefaultNumberRhyming {

    int totalRejectedCount = 0;

    public int reportRejected() {
        return totalRejectedCount;
    }
    
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejectedCount++;
        else
            super.countIn(in);
    }
}
