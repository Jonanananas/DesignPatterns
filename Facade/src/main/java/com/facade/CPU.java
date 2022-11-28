package com.facade;

public class CPU {
  private Memory memory;
  private long position;

  public CPU(Memory memory) {
    this.memory = memory;
  }

  void Freeze() {
    System.out.println("*CPU freezes*");
  }

  void Jump(long position) {
    System.out.println("CPU jumps to position " + position);
    this.position = position;
  }

  void Execute() {
    System.out.println("Printing data...");
    for (char c : memory.getChars()) {
      System.out.println("Position: " + position + "\nData: " + c + "\n");
      position++;
    }
  }
}