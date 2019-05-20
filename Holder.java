
// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
/*

ArrayList (built in class - your super array)
     \
      NoNullArrayList (not built in)
            \
             OrderedArrayList (not built in)
*/


import java.util.*;

/*

NoNullArrayList<T> extends ArrayList<T>
  is an ArrayList of T that cannot take a null as a value.

  Override set and both add methods -> throw an IllegalArgumentException when null is added,
                                     otherwise call the old add method.


  Only have 2 constructors:  default + startingCapacity.

  public boolean add(E element)
  public void add(int index, E element)
  public E set(int index, E element)
  + TWO CONSTRUCTORS
*/

/* sample */

import java.util.ArrayList;

public class NoNullArrayList<E> extends ArrayList<E> {
  public NoNullArrayList(){
    super();
  }

  public boolean add(E element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    super.add(element);
  }

}

/////////////////////////////////////////////////////////////////

/*
OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>
    This is a NoNullArrayList that maintains all elements in a sorted order upon insertion.

    Override both add methods -> find the correct index where the new element should be added,
                                 then add() the new element into that position
                                 (hint: 1.compareTo 2.helper method)

    Override set(index,value) -> remove() the element at index, then add() the new value.

    Only have 2 constructors:  default + startingCapacity.


    There are three main tricky parts:
    1) finding the correct index to add to in OrderedArrayList is the obvious one.
    2) using the super methods at the correct time (e.g. in ordered array list, once you know where to put it, use the super.add method)
    3) How to make it compile properly... because we want our list to accept a generic type.

    
*/
