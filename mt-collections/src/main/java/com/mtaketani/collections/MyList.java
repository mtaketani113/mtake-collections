package com.mtaketani.collections;

import java.util.List;
import java.util.function.Predicate;

public interface MyList<E> extends List<E> {

    /**
     * Removes the element at the specified condition
     *
     * @pram predicate predicate
     * @return MyList
    */
    MyList<E> exclude(Predicate<? super E> predicate);

}
