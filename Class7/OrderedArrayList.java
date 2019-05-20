import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T element){
    for(int i = 0; i < super.size(); i ++){
      if(element.compareTo(super.get(i)) >= 0){
        super.add(i, element);
        break;
      }
    }
    return true;
  }
  public  void add(int index, T element){
    this.add(element);
  }
  public T set(int index, T element){
    super.remove(index);
      for(int i = 0; i < super.size(); i ++){
        if(element.compareTo(super.get(i)) >= 0){
          this.add(element);
        }
      }
    return element;
  }
}
