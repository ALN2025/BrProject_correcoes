// Bytecode for: ext.mods.gameserver.custom.data.EquipGradeRestrictionData$RestrictionInfo
// File: ext\mods\gameserver\custom\data\EquipGradeRestrictionData$RestrictionInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.class
  Last modified 9 de jul de 2026; size 781 bytes
  MD5 checksum e57ba9a0c3b84c807fc94e862857d0e9
  Compiled from "EquipGradeRestrictionData.java"
class ext.mods.gameserver.custom.data.EquipGradeRestrictionData$RestrictionInfo
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.enabled:Z
   #8 = Class              #10            // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo
   #9 = NameAndType        #11:#12        // enabled:Z
  #10 = Utf8               ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo
  #11 = Utf8               enabled
  #12 = Utf8               Z
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.availableFrom:Ljava/time/LocalDateTime;
  #14 = NameAndType        #15:#16        // availableFrom:Ljava/time/LocalDateTime;
  #15 = Utf8               availableFrom
  #16 = Utf8               Ljava/time/LocalDateTime;
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.message:Ljava/lang/String;
  #18 = NameAndType        #19:#20        // message:Ljava/lang/String;
  #19 = Utf8               message
  #20 = Utf8               Ljava/lang/String;
  #21 = Utf8               (ZLjava/time/LocalDateTime;Ljava/lang/String;)V
  #22 = Utf8               Code
  #23 = Utf8               LineNumberTable
  #24 = Utf8               LocalVariableTable
  #25 = Utf8               this
  #26 = Utf8               Lext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo;
  #27 = Utf8               SourceFile
  #28 = Utf8               EquipGradeRestrictionData.java
  #29 = Utf8               NestHost
  #30 = Class              #31            // ext/mods/gameserver/custom/data/EquipGradeRestrictionData
  #31 = Utf8               ext/mods/gameserver/custom/data/EquipGradeRestrictionData
  #32 = Utf8               InnerClasses
  #33 = Utf8               RestrictionInfo
{
  final boolean enabled;
    descriptor: Z
    flags: (0x0010) ACC_FINAL

  final java.time.LocalDateTime availableFrom;
    descriptor: Ljava/time/LocalDateTime;
    flags: (0x0010) ACC_FINAL

  final java.lang.String message;
    descriptor: Ljava/lang/String;
    flags: (0x0010) ACC_FINAL

  public ext.mods.gameserver.custom.data.EquipGradeRestrictionData$RestrictionInfo(boolean, java.time.LocalDateTime, java.lang.String);
    descriptor: (ZLjava/time/LocalDateTime;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field enabled:Z
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field availableFrom:Ljava/time/LocalDateTime;
        14: aload_0
        15: aload_3
        16: putfield      #17                 // Field message:Ljava/lang/String;
        19: return
      LineNumberTable:
        line 117: 0
        line 118: 4
        line 119: 9
        line 120: 14
        line 121: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo;
            0      20     1 enabled   Z
            0      20     2 availableFrom   Ljava/time/LocalDateTime;
            0      20     3 message   Ljava/lang/String;
}
SourceFile: "EquipGradeRestrictionData.java"
NestHost: class ext/mods/gameserver/custom/data/EquipGradeRestrictionData
