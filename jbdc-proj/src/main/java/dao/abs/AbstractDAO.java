package dao.abs;

import java.util.Set;

public interface AbstractDAO<T, K> {

    //CRUD OPERATION

    boolean create(T type);
    T findById(K key);
    boolean deleteById(K key);
    boolean update(T type);
    Set<T> all();


}
