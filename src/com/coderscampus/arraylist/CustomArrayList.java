package com.coderscampus.arraylist;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CustomArrayList<T> implements CustomList<T> {

    Object[] items = new Object[10];

    /**
     * Counts the number of elements inserted into the array;
     */
    int index = 0;

    /**
     *
     * @param item the item to be added to the <code>CustomList</code>
     * @return
     */
    @Override
    public boolean add(T item) {
        if ( index >= items.length ){
            this.extendArray();
        }
        items[index++] = item;
        return true;
    }

    /**
     * Returns the true size of the array
     * @return
     */

    @Override
    public int getSize() {
        return index;
    }

    /**
     *
     * @param index represents the position in the backing <code>Object</code> array that we want to access
     * @return
     * @throws IndexOutOfBoundsException
     */
    @Override
    public T get(int index) throws IndexOutOfBoundsException{
        if ( index > getSize() )
            throw new IndexOutOfBoundsException();
        return (T) items[index];
    }

    /**
     * extends (doubles) the size of the backing array if the current size is not enough
     */
    private void extendArray(){
        this.items = Arrays.copyOf(this.items,items.length*2);
    }

}
