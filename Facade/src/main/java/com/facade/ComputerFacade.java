package com.facade;

public class ComputerFacade {

  private CPU cpu;
  private Memory memory;
  private HardDrive harddrive;

  public void start() {
    memory = new Memory();
    cpu = new CPU(memory);
    harddrive = new HardDrive();
    long kBootAddress = 0xbfc00000;
    cpu.freeze();
    memory.load(kBootAddress, harddrive.read(0, 512));
    cpu.jump(kBootAddress);
    cpu.execute();
  }
}