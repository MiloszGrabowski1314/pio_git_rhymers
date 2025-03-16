package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultNumberRhyming;

    public interface Rhymersfactory {
    
        public DefaultNumberRhyming GetStandardRhymer();
        
        public DefaultNumberRhyming GetFalseRhymer();
        
        public DefaultNumberRhyming GetFIFORhymer();
        
        public DefaultNumberRhyming GetHanoiRhymer();
        
    }
