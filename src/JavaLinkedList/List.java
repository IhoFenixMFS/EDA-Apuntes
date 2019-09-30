/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLinkedList;

/**
 *
 * @author Iho
 */
public interface List<E>{
    boolean isEmpty();
    Position<E> addLast(E e);
    void show();
    int size();
    E get();
    E remove (Position <E> p);
}
