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
public class Principal {
    public static void main(String[] Args) {
        List<String> ls = new DoubleLinkedList<>();
        Position<String> p1=ls.addLast("a");
        Position<String> p2=ls.addLast("b");
        String s =ls.remove(p2);
        Position<String> p3= ls.addLast("");
        ls.remove(p3);
        List <String> ls2=new DoubleLinkedList<>();
        Position<String> p4= ls2.addLast("x");
        
    }
}
