/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerMaintain;

/**
 *
 * @author Chew
 */
public interface List<T> {
    public boolean add(T item);
    public boolean remove(int index);
    public T get(int index);
    public int indexOf(T item);
    public boolean checkType(T item);
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public void extendSize();
    @Override
    public String toString();
}