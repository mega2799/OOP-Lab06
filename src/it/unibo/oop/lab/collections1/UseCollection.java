package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {
    final static int TO_MS = 1_000_000;
    final static int ARRAY_FIRST = 0;
    final static double POPULATION = 7_000_000_000.0;

    private UseCollection() {
    }
    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
    	final ArrayList<Integer> arrayOfInt = new ArrayList<>();
    	for(int i=1000; i < 2000; i++) {
    		arrayOfInt.add(i);
    	}
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
    	final LinkedList<Integer> listOfInt = new LinkedList<>();
    	listOfInt.addAll(arrayOfInt);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
    	int tmp = arrayOfInt.get(ARRAY_FIRST);
    	arrayOfInt.set(ARRAY_FIRST, arrayOfInt.get(arrayOfInt.size() - 1));
    	arrayOfInt.set(arrayOfInt.size() - 1, tmp);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
    	for(int it: arrayOfInt){
    		System.out.println(it);
    	}
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	
    	// ArrayList performance
    	long time = System.nanoTime();
    	for(int i = 0; i < 100_000 ; i++) {
    		arrayOfInt.add(i);
    	}
    	time = System.nanoTime() - time;
        System.out.println("Adding " + 100_000
                + " elements in arrayOfInt took " + time + "ns (" + 
				time / TO_MS + "ms)");
        
        // LinkedList performance 
        time = System.nanoTime();
    	for(int i = 0; i < 100_000 ; i++) {
    		listOfInt.add(i);
    	}
    	time = System.nanoTime() - time;
        System.out.println("Adding " + 100_000
                + " elements in listOfInt took " + time + "ns (" +
				time / TO_MS + "ms)");
        
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        
        // Array 
        int index = arrayOfInt.size() % 2 == 0 ? // intestazione troppo lunga ?
        		arrayOfInt.size() / 2: (arrayOfInt.size() -1) / 2 ; 
        time = System.nanoTime();
        for(int i = 0; i < 1000 ; i++) {
    		arrayOfInt.get(index);
    	}
        time = System.nanoTime() - time;
        System.out.println("Reading " + 1000
                + " the element in the middle of the Array took " + time
                + "ns (" + time / TO_MS + "ms)");
        
        // List 
        index = listOfInt.size() % 2 == 0 ? 
        		listOfInt.size() / 2: (listOfInt.size() -1) / 2 ;
        time = System.nanoTime();
        for(int i = 0; i < 1000 ; i++) {
    		listOfInt.get(index);
    	}
        time = System.nanoTime() - time;
        System.out.println("Reading " + 1000
                + " the element in the middle of the List took " + time
                + "ns (" + time / TO_MS + "ms)");
        
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
	    // final Map<String,Double> world = new HashMap<>();
        final Map<String,Double> world = Map.of ("Africa", 1_110_635_000.0,
				 "Americas", 972_005_000.0, "Antarctica", 0.0,
				 "Asia", 4_298_723_000.0, "Europe", 742_452_000.0,  
				 "Oceania", 38_304_000.0);
        /*
         * 8) Compute the population of the world
         */
        System.out.println("Compute the percent");
        for(final String i: world.keySet()) {
        	System.out.printf("In %s there is the %.2f percent"
        			+ " of the umanity\n", i,
					( world.get(i) / POPULATION ) * 100);
        }
    }
}
