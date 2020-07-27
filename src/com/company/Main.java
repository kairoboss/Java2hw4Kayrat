package com.company;

public class Main {

    public static void main(String[] args) {
        Runner runner1 = new Runner("Runner 1","Runner 2" ,new Runner("Runner 2","Runner 3", new Runner("Runner 3","Runner 4", new Runner("Runner 4","Runner 5", new Runner("Runner 5","финишу",null)))));
        runner1.start();


	}
}
