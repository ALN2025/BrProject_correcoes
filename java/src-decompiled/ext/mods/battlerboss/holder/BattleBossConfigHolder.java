// Bytecode for: ext.mods.battlerboss.holder.BattleBossConfigHolder
// File: ext\mods\battlerboss\holder\BattleBossConfigHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/BattleBossConfigHolder.class
  Last modified 9 de jul de 2026; size 1315 bytes
  MD5 checksum 1bfcd26cd73cf34bfca048cc214cdc54
  Compiled from "BattleBossConfigHolder.java"
public class ext.mods.battlerboss.holder.BattleBossConfigHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/battlerboss/holder/BattleBossConfigHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/battlerboss/holder/BattleBossConfigHolder._enabled:Z
   #8 = Class              #10            // ext/mods/battlerboss/holder/BattleBossConfigHolder
   #9 = NameAndType        #11:#12        // _enabled:Z
  #10 = Utf8               ext/mods/battlerboss/holder/BattleBossConfigHolder
  #11 = Utf8               _enabled
  #12 = Utf8               Z
  #13 = Fieldref           #8.#14         // ext/mods/battlerboss/holder/BattleBossConfigHolder._days:Ljava/util/List;
  #14 = NameAndType        #15:#16        // _days:Ljava/util/List;
  #15 = Utf8               _days
  #16 = Utf8               Ljava/util/List;
  #17 = Fieldref           #8.#18         // ext/mods/battlerboss/holder/BattleBossConfigHolder._times:Ljava/util/List;
  #18 = NameAndType        #19:#16        // _times:Ljava/util/List;
  #19 = Utf8               _times
  #20 = Fieldref           #8.#21         // ext/mods/battlerboss/holder/BattleBossConfigHolder._duration:I
  #21 = NameAndType        #22:#23        // _duration:I
  #22 = Utf8               _duration
  #23 = Utf8               I
  #24 = Utf8               Signature
  #25 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #26 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #27 = Utf8               (ZLjava/util/List;Ljava/util/List;I)V
  #28 = Utf8               Code
  #29 = Utf8               LineNumberTable
  #30 = Utf8               LocalVariableTable
  #31 = Utf8               this
  #32 = Utf8               Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #33 = Utf8               enabled
  #34 = Utf8               days
  #35 = Utf8               times
  #36 = Utf8               duration
  #37 = Utf8               LocalVariableTypeTable
  #38 = Utf8               (ZLjava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/String;>;I)V
  #39 = Utf8               isEnabled
  #40 = Utf8               ()Z
  #41 = Utf8               getDays
  #42 = Utf8               ()Ljava/util/List;
  #43 = Utf8               ()Ljava/util/List<Ljava/lang/Integer;>;
  #44 = Utf8               getTimes
  #45 = Utf8               ()Ljava/util/List<Ljava/lang/String;>;
  #46 = Utf8               getDuration
  #47 = Utf8               ()I
  #48 = Utf8               SourceFile
  #49 = Utf8               BattleBossConfigHolder.java
{
  public ext.mods.battlerboss.holder.BattleBossConfigHolder(boolean, java.util.List<java.lang.Integer>, java.util.List<java.lang.String>, int);
    descriptor: (ZLjava/util/List;Ljava/util/List;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _enabled:Z
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _days:Ljava/util/List;
        14: aload_0
        15: aload_3
        16: putfield      #17                 // Field _times:Ljava/util/List;
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field _duration:I
        25: return
      LineNumberTable:
        line 29: 0
        line 30: 4
        line 31: 9
        line 32: 14
        line 33: 19
        line 34: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/battlerboss/holder/BattleBossConfigHolder;
            0      26     1 enabled   Z
            0      26     2  days   Ljava/util/List;
            0      26     3 times   Ljava/util/List;
            0      26     4 duration   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     2  days   Ljava/util/List<Ljava/lang/Integer;>;
            0      26     3 times   Ljava/util/List<Ljava/lang/String;>;
    Signature: #38                          // (ZLjava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/String;>;I)V

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _enabled:Z
         4: ireturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/BattleBossConfigHolder;

  public java.util.List<java.lang.Integer> getDays();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _days:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/BattleBossConfigHolder;
    Signature: #43                          // ()Ljava/util/List<Ljava/lang/Integer;>;

  public java.util.List<java.lang.String> getTimes();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _times:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/BattleBossConfigHolder;
    Signature: #45                          // ()Ljava/util/List<Ljava/lang/String;>;

  public int getDuration();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _duration:I
         4: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/BattleBossConfigHolder;
}
SourceFile: "BattleBossConfigHolder.java"
