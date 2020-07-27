package com.company;

import org.w3c.dom.ls.LSOutput;

public class Store {
    private int good;
    public synchronized void put(){
        while(good >= 3){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        good++;
        notify();
        System.out.println("Производитель произвел товар ");
        System.out.println("Товаров на складе "+good);
    }
    public synchronized void buy(){
        while(good <1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        good--;
        notify();
        System.out.println("Goods was bought by consumer ");
        System.out.println("Goods "+good);
    }
}
