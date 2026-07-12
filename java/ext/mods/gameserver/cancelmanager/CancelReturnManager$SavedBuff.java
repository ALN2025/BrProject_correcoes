// Bytecode for: ext.mods.gameserver.cancelmanager.CancelReturnManager$SavedBuff
// File: ext\mods\gameserver\cancelmanager\CancelReturnManager$SavedBuff.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff.class
  Last modified 9 de jul de 2026; size 1107 bytes
  MD5 checksum a9d2a7d032f5d92b3d2f93d6cfef14e9
  Compiled from "CancelReturnManager.java"
final class ext.mods.gameserver.cancelmanager.CancelReturnManager$SavedBuff
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #19                         // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/lang/IllegalArgumentException
   #8 = Utf8               java/lang/IllegalArgumentException
   #9 = String             #10            // Skill ID deve ser positivo
  #10 = Utf8               Skill ID deve ser positivo
  #11 = Methodref          #7.#12         // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
  #12 = NameAndType        #5:#13         // "<init>":(Ljava/lang/String;)V
  #13 = Utf8               (Ljava/lang/String;)V
  #14 = String             #15            // Level deve ser positivo
  #15 = Utf8               Level deve ser positivo
  #16 = String             #17            // Tempo restante deve ser positivo
  #17 = Utf8               Tempo restante deve ser positivo
  #18 = Fieldref           #19.#20        // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff.skillId:I
  #19 = Class              #21            // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff
  #20 = NameAndType        #22:#23        // skillId:I
  #21 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff
  #22 = Utf8               skillId
  #23 = Utf8               I
  #24 = Fieldref           #19.#25        // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff.level:I
  #25 = NameAndType        #26:#23        // level:I
  #26 = Utf8               level
  #27 = Fieldref           #19.#28        // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff.remainingSec:I
  #28 = NameAndType        #29:#23        // remainingSec:I
  #29 = Utf8               remainingSec
  #30 = Utf8               (III)V
  #31 = Utf8               Code
  #32 = Utf8               LineNumberTable
  #33 = Utf8               LocalVariableTable
  #34 = Utf8               this
  #35 = Utf8               Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;
  #36 = Utf8               StackMapTable
  #37 = Utf8               ()I
  #38 = Utf8               SourceFile
  #39 = Utf8               CancelReturnManager.java
  #40 = Utf8               NestHost
  #41 = Class              #42            // ext/mods/gameserver/cancelmanager/CancelReturnManager
  #42 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager
  #43 = Utf8               InnerClasses
  #44 = Utf8               SavedBuff
{
  public ext.mods.gameserver.cancelmanager.CancelReturnManager$SavedBuff(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: iload_1
         5: ifgt          18
         8: new           #7                  // class java/lang/IllegalArgumentException
        11: dup
        12: ldc           #9                  // String Skill ID deve ser positivo
        14: invokespecial #11                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        17: athrow
        18: iload_2
        19: ifgt          32
        22: new           #7                  // class java/lang/IllegalArgumentException
        25: dup
        26: ldc           #14                 // String Level deve ser positivo
        28: invokespecial #11                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        31: athrow
        32: iload_3
        33: ifgt          46
        36: new           #7                  // class java/lang/IllegalArgumentException
        39: dup
        40: ldc           #16                 // String Tempo restante deve ser positivo
        42: invokespecial #11                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        45: athrow
        46: aload_0
        47: iload_1
        48: putfield      #18                 // Field skillId:I
        51: aload_0
        52: iload_2
        53: putfield      #24                 // Field level:I
        56: aload_0
        57: iload_3
        58: putfield      #27                 // Field remainingSec:I
        61: return
      LineNumberTable:
        line 55: 0
        line 56: 4
        line 57: 18
        line 58: 32
        line 59: 46
        line 60: 51
        line 61: 56
        line 62: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;
            0      62     1 skillId   I
            0      62     2 level   I
            0      62     3 remainingSec   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff, int, int, int ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public int skillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field skillId:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;

  public int level();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field level:I
         4: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;

  public int remainingSec();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field remainingSec:I
         4: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;
}
SourceFile: "CancelReturnManager.java"
NestHost: class ext/mods/gameserver/cancelmanager/CancelReturnManager
