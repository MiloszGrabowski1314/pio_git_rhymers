package edu.kis.vh.nursery;

public class FirstInFirstOutRhyming extends DefaultNumberRhyming {

    private final DefaultNumberRhyming temp = new DefaultNumberRhyming();
    
    @Override
    public int countOut() {
        while (!callCheck())
            
        temp.countIn(super.countOut());
        
        int ret = temp.countOut();
        
        while (!temp.callCheck())
            
        countIn(temp.countOut());
        
        return ret;
    }
}
