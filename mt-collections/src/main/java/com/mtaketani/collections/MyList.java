package com.mtaketani.collections;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * Extension of java.util.List.
 *
 * <p>
 * extends List
 * </p>
 *
 * @author $Author$
 * @version $Revision$
 * @param <E>
 */
public interface MyList<E> extends List<E> {

    /**
     * Removes the element at the specified condition
     *
     * @pram predicate predicate
     * @return MyList
    */
    MyList<E> exclude(Predicate<? super E> predicate);

}
