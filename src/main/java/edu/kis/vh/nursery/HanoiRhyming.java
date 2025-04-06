package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhyming jest rozszerzeniem klasy DefaultNumberRhyming
 * 
 */

public class HanoiRhyming extends DefaultNumberRhyming {
    /**
     * Deklaracja zmiennej do zliczania odrzuconych elementów.
     */
    int totalRejectedCount = 0;

    /**
     * Zwraca liczbę odrzuconych elementów.
     * 
     * @return totalRejectedCount
     */
    public int reportRejected() {
        return totalRejectedCount;
    }

    /**
     * Sprawdza czy element nadaje się do odrzucenia.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejectedCount++;
        else
            super.countIn(in);
    }
}