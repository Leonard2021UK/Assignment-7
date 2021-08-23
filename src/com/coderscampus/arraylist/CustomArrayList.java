package com.coderscampus.arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomArrayList<T> implements CustomList<T> {

    Object[] items = new Object[10];

    /**
     * Counts the number of elements inserted into the array;
     */
    int index = 0;

    /**
     *
     * @param item the item to be added to the <code>CustomList</code>
     * @return boolean - true if the insertion was successful otherwise false
     */
    @Override
    public boolean add(T item) {
        if ( index >= items.length ){
            this.extendArray();
        }
        items[index++] = item;
        return true;
    }

    public boolean add (int index, T item) throws IndexOutOfBoundsException{
        if ( index > getSize() )
            throw new IndexOutOfBoundsException("Index out of bound!");
        this.items[index] = item;
        return true;
    };

    /**
     * Returns the true size of the array
     * @return - size of the list
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
    @SuppressWarnings("unchecked")
    public T get(int index) throws IndexOutOfBoundsException{
        if ( index > getSize() )
            throw new IndexOutOfBoundsException("Index out of bound!");
        return (T) items[index];
    }

    /**
     * extends (doubles) the size of the backing array if the current size is not enough
     */
    private void extendArray(){
        this.items = Arrays.copyOf(this.items,items.length*2);
    }

    @SuppressWarnings("unchecked")
    public T remove (int index) {
        if ( index > getSize() )
            throw new IndexOutOfBoundsException("Index out of bound!");
        T removedValue = (T) this.items[index];
        this.items = IntStream.range(0,this.items.length).filter(i -> i != index).mapToObj(i -> this.items[i]).toArray();
        return removedValue;
    }

}
