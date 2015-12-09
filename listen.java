/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listen;

/**
 *
 * @author v990461
 */
public class listen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        LinkedList liste = new LinkedList();
//        liste.add(1);
//        liste.add(2);
//        liste.add(3);
//        
//        int size = liste.size();
//        //size = liste.sizefor();
//        System.out.println(size);
//        
//        int sum = liste.sum();
//        System.out.println(sum);
//        System.out.println(" ");
//        liste.printList();
//        System.out.println(" ");
//        liste.printReverseList();
        
//        LinkedList liste = new LinkedList();
//        for (int i = 1; i <= 8; i++) {
//            liste.add(i);
//        }
        
        //liste.remove(5);
        //liste.printList();
//        boolean contains = liste.contains(5);
//        System.out.println(contains);
        //int wert = liste.getiterativ(5);
        //System.out.println(wert);
//        LinkedList subList = liste.subList(3, 6);
//        subList.printList();
//        for (int i = 0; i < liste.size(); i++) {
//            System.out.println(liste.getiterativ(i));
//        }
//        int size = liste.size();
//        System.out.println(size);
        
        SortedList sort = new SortedList();
        sort.add(2);
        sort.add(8);
        sort.add(3);
        
        //sort.printList();
        System.out.println(" ");
        
        sort.add(5);
        //sort.printList();
        
        boolean enth = sort.contains(8);
        System.out.println(enth);
        
        
    }
    
}
