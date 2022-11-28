package com.facade;

public class CPU {
  private Memory memory;
  private long position;

  public CPU(Memory memory) {
    this.memory = memory;
  }

  void freeze() {
    System.out.println("*CPU freezes*");
  }

  void jump(long position) {
    System.out.println("CPU jumps to position " + position);
    this.position = position;
  }

  void execute() {
    System.out.println("Printing data...");
    for (char c : memory.getChars()) {
      System.out.println("Position: " + position + "\nData: " + c + "\n");
      position++;
    }
  }
}