package com.mtaketani.collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MyArrayListTest {

    /**
     * test of method 'exclude'
     *
     * <p>
     * String list.
     * <p>
     */
    @Test
    public void exculudeStringTest() {

        MyList<String> myList = new MyArrayList<String>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        assertThat(myList.exclude(s -> s.equals("b")).size()).isEqualTo(2);
    }

    /**
     * test of method 'exclude'
     *
     * <p>
     * Argument is null.
     * <p>
     */
    @Test
    public void exculudeArgIsNullTest() {

        MyList<String> myList = new MyArrayList<String>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        try {
            myList.exclude(null);
            fail();
        }catch(IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Args can't set null");
        }

    }


}
