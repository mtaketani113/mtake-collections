package com.mtaketani.collections;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * Implementation class of MyList.
 *
 * <p>
 * extend ArrayList
 * </p>
 *
 * @author $Author$
 * @version $Revision$
 * @param <E>
 */
public class MyArrayList<E> extends ArrayList<E> implements MyList<E> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2368861840856529128L;

	/**
     * {@inheritDoc}
     *
     * @see com.mtaketani.collections.MyList#exclude(Predicate)
     */
    @Override
    public MyList<E> exclude(Predicate<? super E> predicate) {

        if(predicate == null) {
            throw new IllegalArgumentException("Args can't set null");
        }

        //invert predicate
        Predicate<E> checker = s ->  {return !predicate.test(s);};

        return this.stream().filter(checker)
                        .collect(Collectors.toCollection(MyArrayList::new));
    }
}
