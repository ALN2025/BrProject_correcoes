// Bytecode for: ext.mods.gameserver.custom.data.BossHpAnnounceData$HpThreshold
// File: ext\mods\gameserver\custom\data\BossHpAnnounceData$HpThreshold.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.class
  Last modified 9 de jul de 2026; size 635 bytes
  MD5 checksum 08f52972623f282ccf6289fcff318295
  Compiled from "BossHpAnnounceData.java"
public class ext.mods.gameserver.custom.data.BossHpAnnounceData$HpThreshold
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
   #8 = Class              #10            // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
   #9 = NameAndType        #11:#12        // percent:I
  #10 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
  #11 = Utf8               percent
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.message:Ljava/lang/String;
  #14 = NameAndType        #15:#16        // message:Ljava/lang/String;
  #15 = Utf8               message
  #16 = Utf8               Ljava/lang/String;
  #17 = Utf8               (ILjava/lang/String;)V
  #18 = Utf8               Code
  #19 = Utf8               LineNumberTable
  #20 = Utf8               LocalVariableTable
  #21 = Utf8               this
  #22 = Utf8               Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;
  #23 = Utf8               SourceFile
  #24 = Utf8               BossHpAnnounceData.java
  #25 = Utf8               NestHost
  #26 = Class              #27            // ext/mods/gameserver/custom/data/BossHpAnnounceData
  #27 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData
  #28 = Utf8               InnerClasses
  #29 = Utf8               HpThreshold
{
  public final int percent;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final java.lang.String message;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.gameserver.custom.data.BossHpAnnounceData$HpThreshold(int, java.lang.String);
    descriptor: (ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field percent:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field message:Ljava/lang/String;
        14: return
      LineNumberTable:
        line 44: 0
        line 45: 4
        line 46: 9
        line 47: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;
            0      15     1 percent   I
            0      15     2 message   Ljava/lang/String;
}
SourceFile: "BossHpAnnounceData.java"
NestHost: class ext/mods/gameserver/custom/data/BossHpAnnounceData
InnerClasses:
  public static #29= #8 of #26;           // HpThreshold=class ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold of class ext/mods/gameserver/custom/data/BossHpAnnounceData
