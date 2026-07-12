// Bytecode for: ext.mods.battlerboss.holder.TeleportHolder
// File: ext\mods\battlerboss\holder\TeleportHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/TeleportHolder.class
  Last modified 9 de jul de 2026; size 1357 bytes
  MD5 checksum 40698c568cc96858a8460b429972be35
  Compiled from "TeleportHolder.java"
public class ext.mods.battlerboss.holder.TeleportHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/battlerboss/holder/TeleportHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 8, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // arenaX
   #8 = Utf8               arenaX
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;I)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;I)I
  #15 = Fieldref           #16.#17        // ext/mods/battlerboss/holder/TeleportHolder.arenaX:I
  #16 = Class              #18            // ext/mods/battlerboss/holder/TeleportHolder
  #17 = NameAndType        #8:#19         // arenaX:I
  #18 = Utf8               ext/mods/battlerboss/holder/TeleportHolder
  #19 = Utf8               I
  #20 = String             #21            // arenaY
  #21 = Utf8               arenaY
  #22 = Fieldref           #16.#23        // ext/mods/battlerboss/holder/TeleportHolder.arenaY:I
  #23 = NameAndType        #21:#19        // arenaY:I
  #24 = String             #25            // arenaZ
  #25 = Utf8               arenaZ
  #26 = Fieldref           #16.#27        // ext/mods/battlerboss/holder/TeleportHolder.arenaZ:I
  #27 = NameAndType        #25:#19        // arenaZ:I
  #28 = String             #29            // returnX
  #29 = Utf8               returnX
  #30 = Fieldref           #16.#31        // ext/mods/battlerboss/holder/TeleportHolder.returnX:I
  #31 = NameAndType        #29:#19        // returnX:I
  #32 = String             #33            // returnY
  #33 = Utf8               returnY
  #34 = Fieldref           #16.#35        // ext/mods/battlerboss/holder/TeleportHolder.returnY:I
  #35 = NameAndType        #33:#19        // returnY:I
  #36 = String             #37            // returnZ
  #37 = Utf8               returnZ
  #38 = Fieldref           #16.#39        // ext/mods/battlerboss/holder/TeleportHolder.returnZ:I
  #39 = NameAndType        #37:#19        // returnZ:I
  #40 = String             #41            // delay
  #41 = Utf8               delay
  #42 = Fieldref           #16.#43        // ext/mods/battlerboss/holder/TeleportHolder.returnDelay:I
  #43 = NameAndType        #44:#19        // returnDelay:I
  #44 = Utf8               returnDelay
  #45 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #46 = Utf8               Code
  #47 = Utf8               LineNumberTable
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               this
  #50 = Utf8               Lext/mods/battlerboss/holder/TeleportHolder;
  #51 = Utf8               set
  #52 = Utf8               Lext/mods/commons/data/StatSet;
  #53 = Utf8               getArenaX
  #54 = Utf8               ()I
  #55 = Utf8               getArenaY
  #56 = Utf8               getArenaZ
  #57 = Utf8               getReturnX
  #58 = Utf8               getReturnY
  #59 = Utf8               getReturnZ
  #60 = Utf8               getReturnDelay
  #61 = Utf8               SourceFile
  #62 = Utf8               TeleportHolder.java
{
  public ext.mods.battlerboss.holder.TeleportHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String arenaX
         8: iconst_0
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        12: putfield      #15                 // Field arenaX:I
        15: aload_0
        16: aload_1
        17: ldc           #20                 // String arenaY
        19: iconst_0
        20: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        23: putfield      #22                 // Field arenaY:I
        26: aload_0
        27: aload_1
        28: ldc           #24                 // String arenaZ
        30: iconst_0
        31: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        34: putfield      #26                 // Field arenaZ:I
        37: aload_0
        38: aload_1
        39: ldc           #28                 // String returnX
        41: iconst_0
        42: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        45: putfield      #30                 // Field returnX:I
        48: aload_0
        49: aload_1
        50: ldc           #32                 // String returnY
        52: iconst_0
        53: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        56: putfield      #34                 // Field returnY:I
        59: aload_0
        60: aload_1
        61: ldc           #36                 // String returnZ
        63: iconst_0
        64: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        67: putfield      #38                 // Field returnZ:I
        70: aload_0
        71: aload_1
        72: ldc           #40                 // String delay
        74: iconst_0
        75: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        78: putfield      #42                 // Field returnDelay:I
        81: return
      LineNumberTable:
        line 29: 0
        line 30: 4
        line 31: 15
        line 32: 26
        line 34: 37
        line 35: 48
        line 36: 59
        line 37: 70
        line 38: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      82     0  this   Lext/mods/battlerboss/holder/TeleportHolder;
            0      82     1   set   Lext/mods/commons/data/StatSet;

  public int getArenaX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field arenaX:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/TeleportHolder;

  public int getArenaY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field arenaY:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/TeleportHolder;

  public int getArenaZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field arenaZ:I
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/TeleportHolder;

  public int getReturnX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field returnX:I
         4: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/TeleportHolder;

  public int getReturnY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field returnY:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/TeleportHolder;

  public int getReturnZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field returnZ:I
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/TeleportHolder;

  public int getReturnDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field returnDelay:I
         4: ireturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/TeleportHolder;
}
SourceFile: "TeleportHolder.java"
