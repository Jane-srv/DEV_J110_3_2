/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j110_3_2;

/**
 *
 * @author Jane

 */
public class List{

    public static void main(String[] args) {
        DEV_J110_3_2 list = new DEV_J110_3_2();
        System.out.println("Is the list empty:" + list.nullCheck());
        list.addHead(2);
        list.addHead(1);
        list.addHead(0);
        list.addTail(3);
        list.addTail(4);
        System.out.println("Is the list empty:" + list.nullCheck());
        System.out.println("New list:");
        list.printAll();
        System.out.println("Does the list contain 2:" + list.searchValue(2));
        System.out.println("Does the list contain 7:" + list.searchValue(7));
        System.out.println("Head value is:" + list.getValueHeadAndRemove());
        System.out.println("Tail value is:" + list.getValueTailAndRemove());
        System.out.println("New list:");
        list.printAll();
        Integer[] itemsHead = {10, 11, 12};
        list.addArrayHead(itemsHead);
        System.out.println("Adding array to head. New list:");
        list.printAll();
        Integer[] itemsTail = {15, 16, 17};
        list.addArrayTail(itemsTail);
        System.out.println("Adding array to tail. New list:");
        list.printAll();
        System.out.println("Reversed list:");
        list.printAllReverse();
        
        DEV_J110_3_2 collectionHead = new DEV_J110_3_2();
        collectionHead.addHead(102);
        collectionHead.addHead(101);
        collectionHead.addHead(100);
        collectionHead.addTail(103);
        collectionHead.addTail(104);
        System.out.println("Collection:");
        collectionHead.printAll();
        list.addCollectionHead(collectionHead);
        System.out.println("Adding collection to head. New list:");
        list.printAll();
        System.out.println("Is the collection empty:" + collectionHead.nullCheck());
        
        DEV_J110_3_2 collectionTail = new DEV_J110_3_2();
        collectionTail.addHead(202);
        collectionTail.addHead(201);
        collectionTail.addHead(200);
        collectionTail.addTail(203);
        collectionTail.addTail(204);
        System.out.println("Collection:");
        collectionTail.printAll();
        list.addCollectionTail(collectionTail);
        System.out.println("Adding collection to tail. New list:");
        list.printAll();
        System.out.println("Is the collection empty:" + collectionTail.nullCheck());

    }
    
    
}
