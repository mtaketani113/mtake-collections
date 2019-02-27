package com.mtaketani.collections;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MyArrayList<E> extends ArrayList<E> implements MyList<E> {

    /**
     * {@inheritDoc}
     *
     * @see com.mtaketani.collections.MyList#exclude(Predicate)
     */
    @Override
    public MyList<E> exclude(Predicate<? super E> predicate) {

        //行を削除
        for(int i = 0; i < this.size(); i++) {
            if(predicate.test(this.get(i))) this.remove(i);
        }
        return this;
    }
}
