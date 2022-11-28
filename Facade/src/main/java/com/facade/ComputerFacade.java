package com.facade;

public class ComputerFacade {

  private CPU cpu;
  private Memory memory;
  private HardDrive harddrive;

  public void Start() {
    memory = new Memory();
    cpu = new CPU(memory);
    harddrive = new HardDrive();
    long kBootAddress = 0xbfc00000;
    cpu.Freeze();
    memory.Load(kBootAddress, harddrive.Read(0, 512));
    cpu.Jump(kBootAddress);
    cpu.Execute();
  }
}