package com.m2I.devops;

public class Application {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Calculator c = new Calculator();
    System.out.println(c.add(2, 3));

    int r = c.sub(9, 2);
    System.out.println(r);
  }

}
