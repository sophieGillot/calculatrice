package com.m2I.devops;

/**
 * Calculator engine class.
 * 
 * 
 * @author Administrateur
 * @version 1.0
 *
 */
public class Calculator {
  
    /**
   * 
   * @param valeur1.
   * @param valeur2.
   * @return
   */
  public int add(int valeur1, int valeur2) {
    return valeur1 + valeur2;
  }
  
  /**
   * 	
   * @param valeur1.
   * @param valeur2.
   * @return
   */
  public int sub(int valeur1, int valeur2) {
    return valeur1 - valeur2;
  }
  
  /**
   * 	
   * @param valeur1.
   * @param valeur2.
   * @return
   */
  public int multi(int valeur1, int valeur2) {
    return valeur1 * valeur2;
  }

  /**
   * 
   * @param valeur1.
   * @param valeur2.
   * @return
   */
  public int div(int valeur1, int valeur2) {
    return valeur1 / valeur2;
  }
	
  /**
   * 
   * @param a
   * @return
   */
  public boolean isPair(int a) {
    return (a % 2) == 0 ;
  }
	
}
