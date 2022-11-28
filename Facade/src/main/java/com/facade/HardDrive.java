package com.facade;

public class HardDrive {
  char[] sector0 = { 'b', 'o', 'o', 't' };
  char[] sector1 = { 'd', 'a', 't', 'a' };

  char[] Read(long lba, int size) {
    System.out.println("Reading data from hard drive...");
    char[] returnArr;

    if (lba == 0 && size == 512) {
      returnArr = sector0;
    } else {
      returnArr = sector1;
    }
    return returnArr;
  }
}