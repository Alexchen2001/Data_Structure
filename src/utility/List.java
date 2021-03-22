package utility;

public interface List<E> {

    boolean add(E item);
    void add(int index, E item);
    void clear();
    boolean contains(E tiem);
    E get(int index);
    int indexOf(E item);
    boolean isEmpty();
    E remove(int index);
    boolean remove(E item);
    E set(int index, E item);
    int size();


}
