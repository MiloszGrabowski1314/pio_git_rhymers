package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultNumberRhyming;
import edu.kis.vh.nursery.FirstInFirstOutRhyming;
import edu.kis.vh.nursery.HanoiRhyming;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public DefaultNumberRhyming GetStandardRhymer() {
        return new DefaultNumberRhyming();
    }

    @Override
    public DefaultNumberRhyming GetFalseRhymer() {
        return new DefaultNumberRhyming();
    }

    @Override
    public DefaultNumberRhyming GetFIFORhymer() {
        return new FirstInFirstOutRhyming();
    }

    @Override
    public DefaultNumberRhyming GetHanoiRhymer() {
        return new HanoiRhyming();
    }

}
