// Bytecode for: ext.mods.commons.gui.ConfigGS$SpawnEventConfig
// File: ext\mods\commons\gui\ConfigGS$SpawnEventConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ConfigGS$SpawnEventConfig.class
  Last modified 9 de jul de 2026; size 590 bytes
  MD5 checksum 8865d00fd4f6b03f523afb37346ef962
  Compiled from "ConfigGS.java"
class ext.mods.commons.gui.ConfigGS$SpawnEventConfig
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/ConfigGS$SpawnEventConfig
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/ConfigGS$SpawnEventConfig.label:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/commons/gui/ConfigGS$SpawnEventConfig
   #9 = NameAndType        #11:#12        // label:Ljava/lang/String;
  #10 = Utf8               ext/mods/commons/gui/ConfigGS$SpawnEventConfig
  #11 = Utf8               label
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/commons/gui/ConfigGS$SpawnEventConfig.eventName:Ljava/lang/String;
  #14 = NameAndType        #15:#12        // eventName:Ljava/lang/String;
  #15 = Utf8               eventName
  #16 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;
  #22 = Utf8               SourceFile
  #23 = Utf8               ConfigGS.java
  #24 = Utf8               NestHost
  #25 = Class              #26            // ext/mods/commons/gui/ConfigGS
  #26 = Utf8               ext/mods/commons/gui/ConfigGS
  #27 = Utf8               InnerClasses
  #28 = Utf8               SpawnEventConfig
{
  public final java.lang.String label;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final java.lang.String eventName;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.commons.gui.ConfigGS$SpawnEventConfig(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field label:Ljava/lang/String;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field eventName:Ljava/lang/String;
        14: return
      LineNumberTable:
        line 120: 0
        line 121: 4
        line 122: 9
        line 123: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/ConfigGS$SpawnEventConfig;
            0      15     1 label   Ljava/lang/String;
            0      15     2 eventName   Ljava/lang/String;
}
SourceFile: "ConfigGS.java"
NestHost: class ext/mods/commons/gui/ConfigGS
