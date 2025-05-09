package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultNumberRhyming;
import edu.kis.vh.nursery.HanoiRhyming;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        
        testRhymers(factory);
        
    }

    private static void testRhymers(Rhymersfactory factory) {
        DefaultNumberRhyming[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFirstInFirstOutRhyming(), factory.GetHanoiRhyming()};
        
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
        
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));
        
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        
        System.out.println("total rejected is "
                + ((HanoiRhyming) rhymers[3]).reportRejected());
    }
    
}