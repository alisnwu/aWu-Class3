import java.util.*;
public class NoNullArrayList<E> extends ArrayList<E>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }
  public boolean add(E element){
    if(element == null){
      throw new IllegalArgumentException();
    }
    super.add(element);
    return true;
  }
  public void add(int index, E element){
     if(element == null){
       throw new IllegalArgumentException();
     }
     super.add(index, element);
  }
  public E set(int index, E element){
    if(element == null){
      throw new IllegalArgumentException();
    }
    super.set(index, element);
    return element;
  }
}
