// Bytecode for: ext.mods.commons.services.IRamAllocationService
// File: ext\mods\commons\services\IRamAllocationService.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/services/IRamAllocationService.class
  Last modified 9 de jul de 2026; size 454 bytes
  MD5 checksum 4f7d197e02dcd420649c25c2149c772c
  Compiled from "IRamAllocationService.java"
public interface ext.mods.commons.services.IRamAllocationService
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/commons/services/IRamAllocationService
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 9, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/commons/services/IRamAllocationService
   #2 = Utf8               ext/mods/commons/services/IRamAllocationService
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               getGsMemoryMB
   #6 = Utf8               ()I
   #7 = Utf8               setGsMemoryMB
   #8 = Utf8               (I)Z
   #9 = Utf8               getLsMemoryMB
  #10 = Utf8               setLsMemoryMB
  #11 = Utf8               getTotalPhysicalMemoryGB
  #12 = Utf8               getAvailablePhysicalMemoryGB
  #13 = Utf8               getTotalMemoryMB
  #14 = Utf8               startMemoryMonitoring
  #15 = Utf8               (Ljava/lang/Runnable;)V
  #16 = Utf8               stopMemoryMonitoring
  #17 = Utf8               ()V
  #18 = Utf8               SourceFile
  #19 = Utf8               IRamAllocationService.java
{
  public abstract int getGsMemoryMB();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean setGsMemoryMB(int);
    descriptor: (I)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getLsMemoryMB();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean setLsMemoryMB(int);
    descriptor: (I)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getTotalPhysicalMemoryGB();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getAvailablePhysicalMemoryGB();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getTotalMemoryMB();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void startMemoryMonitoring(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void stopMemoryMonitoring();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "IRamAllocationService.java"
