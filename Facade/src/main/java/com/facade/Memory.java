package com.facade;

public class Memory {
  char[] chars = new char[4];

  public char[] getChars() {
    return chars;
  }

  void load(long position, char[] data) {
    System.out.println("Loading data to memory...");
    System.arraycopy(data, 0, chars, 0, 4);
  }
};