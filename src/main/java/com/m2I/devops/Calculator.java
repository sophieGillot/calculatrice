package com.m2I.devops;

public class Calculator {

  public int add(int a, int b) {
    return a + b ;
  }
	
  public int sub(int a, int b) {
    return a - b ;
  }
	
  public int multi(int a, int b) {
    return a * b ;
  }
	
  public int div(int a, int b) {
    return a / b ;
  }
	
  public boolean isPair(int a) {
    return (a % 2) == 0 ;
  }
	
}
