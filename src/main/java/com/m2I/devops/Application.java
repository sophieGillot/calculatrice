package com.m2I.devops;


/**
 * Main of calculator engine
 * 
 * @author Administrateur
 * @version
 */
public class Application {
    
//  private Logger logger=  Logger.getLogger(Application.class.getName();

  public static void main(String[] args) {
    System.out.println("Hello world!");

    final Calculator c = new Calculator();
    System.out.println(c.add(2, 3));

    final int r = c.sub(9, 2);
    System.out.println(r);
  }

}
