/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dev_j110_3_2;

import java.util.Iterator;

/**
 *
 * @author Jane
 * @param <T>
 */
public class DEV_J110_3_2<T> implements Iterable<T>{    
    
    private Node head;
    private Node tail;

    @Override
    public Iterator<T> iterator() {
        return this.iterator(); 
    }
    
    
    
    //Добавление значения в начало
    public void addHead(Integer item){
        Node temp = new Node();
        temp.value = item;
        if(head==null){
            head = temp;
            tail = temp;
        } else{
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
    }
    
    //Добавление значений массива в начало
    public void addArrayHead(Integer items[]){
        for(int i=(items.length - 1); i>=0 ; i--)
        {
        Node temp = new Node();
        temp.value = items[i];
        if(head==null){
            head = temp;
            tail = temp;
        } else{
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
        }
    }
    
    //Добавление коллекции, списка в начало
    public void addCollectionHead(DEV_J110_3_2 collection){
        Node item=collection.tail;
        while (item!=null){ 
            Node temp = new Node();
            temp.value = item.value;
        if(head==null){
            head = temp;
            tail = temp;
        } else{
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
        item=item.previous;
        }
        collection.clear();
    }
    
    //Очищение коллекции
    public void clear(){
        head = null;
        tail = null;
    }
    //Извлечение значения из начала списка без его удаления
    public Integer getValueHead(){
        if(head==null) return null;
        return head.value;
    }
    
    //Извлечение значения из начала списка c удалением
    public Integer getValueHeadAndRemove(){
        if(head==null) return null;
        int item = head.value;
        head = head.next;
        head.previous = null;
        return item;
    }
    
    //Добавление значения в конец
    public void addTail(Integer item){
        Node temp = new Node();
        temp.value = item;
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
    }
    
    //Добавление значений массива в конец
    public void addArrayTail (Integer items[]){
        for(int i=0; i<items.length ; i++){
        Node temp = new Node();
        temp.value = items[i];
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
        }
    }
      
    //Добавление коллекции, списка в конец
    public void addCollectionTail(DEV_J110_3_2 collection){
        Node item=collection.head;
        while (item!=null){ 
            Node temp = new Node();
            
            temp.value = item.value;
        if(head==null){
            head = temp;
            tail = temp;
        } else{
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
        item=item.next;
        }
        collection.clear();
    }
    
    //Извлечение значения из конца списка без его удаления
    public Integer getValueTail(){
        if(tail==null) return null;
        return tail.value;
    }
    
    //Извлечение значения из конца списка c удалением
    public Integer getValueTailAndRemove(){
        if(tail==null) return null;
        int item = tail.value;
        tail = tail.previous;
        tail.next = null;
        return item;
    }
    
    //Определение, содержит ли список заданное значение, или нет
    public boolean searchValue(int ger){
        int size = 0;
        Node temp = head;
        while (temp!=null){
            size++;
            if(temp.value==ger) return true;
            temp = temp.next;
        }
        return false;
    }
    
    //Определение, является ли список пустым, или нет
    public boolean nullCheck(){
        if (head==null) return true;
        return false;
    }
    
    //Печать всех значений списка
    public void printAll(){
        int i = 0;
        Node temp = head;
        while (temp!=null){ 
            i++;
            if (temp.value!=null){
            System.out.println(temp.value);
            }
            temp = temp.next;
        }
    }
    
    //Печать всех значений списка в обратном порядке
    public void printAllReverse(){
        int i = 0;
        Node temp = tail;
        while (temp!=null){
            i++;
            if (temp.value!=null){
            System.out.println(temp.value);
            }
            temp = temp.previous;            
        }
    }
    
    private class Node{
        Node next;
        Node previous;
        Integer value;
    }
}
