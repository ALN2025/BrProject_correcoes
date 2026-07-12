// Bytecode for: ext.mods.gameserver.model.records.Sequence
// File: ext\mods\gameserver\model\records\Sequence.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/Sequence.class
  Last modified 9 de jul de 2026; size 2573 bytes
  MD5 checksum e5c4a36df57638aa1fc14b6446d6377d
  Compiled from "Sequence.java"
public final class ext.mods.gameserver.model.records.Sequence extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/Sequence
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 10, methods: 14, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/Sequence.sequenceId:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/Sequence
   #9 = NameAndType        #11:#12        // sequenceId:I
  #10 = Utf8               ext/mods/gameserver/model/records/Sequence
  #11 = Utf8               sequenceId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/Sequence.objectId:I
  #14 = NameAndType        #15:#12        // objectId:I
  #15 = Utf8               objectId
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/Sequence.dist:I
  #17 = NameAndType        #18:#12        // dist:I
  #18 = Utf8               dist
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/records/Sequence.yaw:I
  #20 = NameAndType        #21:#12        // yaw:I
  #21 = Utf8               yaw
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/records/Sequence.pitch:I
  #23 = NameAndType        #24:#12        // pitch:I
  #24 = Utf8               pitch
  #25 = Fieldref           #8.#26         // ext/mods/gameserver/model/records/Sequence.time:I
  #26 = NameAndType        #27:#12        // time:I
  #27 = Utf8               time
  #28 = Fieldref           #8.#29         // ext/mods/gameserver/model/records/Sequence.duration:I
  #29 = NameAndType        #30:#12        // duration:I
  #30 = Utf8               duration
  #31 = Fieldref           #8.#32         // ext/mods/gameserver/model/records/Sequence.turn:I
  #32 = NameAndType        #33:#12        // turn:I
  #33 = Utf8               turn
  #34 = Fieldref           #8.#35         // ext/mods/gameserver/model/records/Sequence.rise:I
  #35 = NameAndType        #36:#12        // rise:I
  #36 = Utf8               rise
  #37 = Fieldref           #8.#38         // ext/mods/gameserver/model/records/Sequence.widescreen:I
  #38 = NameAndType        #39:#12        // widescreen:I
  #39 = Utf8               widescreen
  #40 = InvokeDynamic      #0:#41         // #0:toString:(Lext/mods/gameserver/model/records/Sequence;)Ljava/lang/String;
  #41 = NameAndType        #42:#43        // toString:(Lext/mods/gameserver/model/records/Sequence;)Ljava/lang/String;
  #42 = Utf8               toString
  #43 = Utf8               (Lext/mods/gameserver/model/records/Sequence;)Ljava/lang/String;
  #44 = InvokeDynamic      #0:#45         // #0:hashCode:(Lext/mods/gameserver/model/records/Sequence;)I
  #45 = NameAndType        #46:#47        // hashCode:(Lext/mods/gameserver/model/records/Sequence;)I
  #46 = Utf8               hashCode
  #47 = Utf8               (Lext/mods/gameserver/model/records/Sequence;)I
  #48 = InvokeDynamic      #0:#49         // #0:equals:(Lext/mods/gameserver/model/records/Sequence;Ljava/lang/Object;)Z
  #49 = NameAndType        #50:#51        // equals:(Lext/mods/gameserver/model/records/Sequence;Ljava/lang/Object;)Z
  #50 = Utf8               equals
  #51 = Utf8               (Lext/mods/gameserver/model/records/Sequence;Ljava/lang/Object;)Z
  #52 = Utf8               (IIIIIIIIII)V
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               LocalVariableTable
  #56 = Utf8               this
  #57 = Utf8               Lext/mods/gameserver/model/records/Sequence;
  #58 = Utf8               MethodParameters
  #59 = Utf8               ()Ljava/lang/String;
  #60 = Utf8               ()I
  #61 = Utf8               (Ljava/lang/Object;)Z
  #62 = Utf8               o
  #63 = Utf8               Ljava/lang/Object;
  #64 = Utf8               SourceFile
  #65 = Utf8               Sequence.java
  #66 = Utf8               Record
  #67 = Utf8               BootstrapMethods
  #68 = String             #69            // sequenceId;objectId;dist;yaw;pitch;time;duration;turn;rise;widescreen
  #69 = Utf8               sequenceId;objectId;dist;yaw;pitch;time;duration;turn;rise;widescreen
  #70 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/Sequence.sequenceId:I
  #71 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/Sequence.objectId:I
  #72 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/Sequence.dist:I
  #73 = MethodHandle       1:#19          // REF_getField ext/mods/gameserver/model/records/Sequence.yaw:I
  #74 = MethodHandle       1:#22          // REF_getField ext/mods/gameserver/model/records/Sequence.pitch:I
  #75 = MethodHandle       1:#25          // REF_getField ext/mods/gameserver/model/records/Sequence.time:I
  #76 = MethodHandle       1:#28          // REF_getField ext/mods/gameserver/model/records/Sequence.duration:I
  #77 = MethodHandle       1:#31          // REF_getField ext/mods/gameserver/model/records/Sequence.turn:I
  #78 = MethodHandle       1:#34          // REF_getField ext/mods/gameserver/model/records/Sequence.rise:I
  #79 = MethodHandle       1:#37          // REF_getField ext/mods/gameserver/model/records/Sequence.widescreen:I
  #80 = MethodHandle       6:#81          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #81 = Methodref          #82.#83        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #82 = Class              #84            // java/lang/runtime/ObjectMethods
  #83 = NameAndType        #85:#86        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #84 = Utf8               java/lang/runtime/ObjectMethods
  #85 = Utf8               bootstrap
  #86 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #87 = Utf8               InnerClasses
  #88 = Class              #89            // java/lang/invoke/MethodHandles$Lookup
  #89 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #90 = Class              #91            // java/lang/invoke/MethodHandles
  #91 = Utf8               java/lang/invoke/MethodHandles
  #92 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.Sequence(int, int, int, int, int, int, int, int, int, int);
    descriptor: (IIIIIIIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=11, args_size=11
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field sequenceId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field objectId:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field dist:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field yaw:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field pitch:I
        31: aload_0
        32: iload         6
        34: putfield      #25                 // Field time:I
        37: aload_0
        38: iload         7
        40: putfield      #28                 // Field duration:I
        43: aload_0
        44: iload         8
        46: putfield      #31                 // Field turn:I
        49: aload_0
        50: iload         9
        52: putfield      #34                 // Field rise:I
        55: aload_0
        56: iload         10
        58: putfield      #37                 // Field widescreen:I
        61: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/records/Sequence;
            0      62     1 sequenceId   I
            0      62     2 objectId   I
            0      62     3  dist   I
            0      62     4   yaw   I
            0      62     5 pitch   I
            0      62     6  time   I
            0      62     7 duration   I
            0      62     8  turn   I
            0      62     9  rise   I
            0      62    10 widescreen   I
    MethodParameters:
      Name                           Flags
      sequenceId
      objectId
      dist
      yaw
      pitch
      time
      duration
      turn
      rise
      widescreen

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #40,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/Sequence;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Sequence;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #44,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/Sequence;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Sequence;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #48,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/Sequence;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/Sequence;
            0       8     1     o   Ljava/lang/Object;

  public int sequenceId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field sequenceId:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int objectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field objectId:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int dist();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field dist:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int yaw();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field yaw:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int pitch();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field pitch:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int time();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field time:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int duration();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field duration:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int turn();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field turn:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int rise();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field rise:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;

  public int widescreen();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field widescreen:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Sequence;
}
SourceFile: "Sequence.java"
  Record: length = 0x3E (unknown attribute)
   00 0A 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 0C 00 00
   00 1B 00 0C 00 00 00 1E 00 0C 00 00 00 21 00 0C
   00 00 00 24 00 0C 00 00 00 27 00 0C 00 00
BootstrapMethods:
  0: #80 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/Sequence
      #68 sequenceId;objectId;dist;yaw;pitch;time;duration;turn;rise;widescreen
      #70 REF_getField ext/mods/gameserver/model/records/Sequence.sequenceId:I
      #71 REF_getField ext/mods/gameserver/model/records/Sequence.objectId:I
      #72 REF_getField ext/mods/gameserver/model/records/Sequence.dist:I
      #73 REF_getField ext/mods/gameserver/model/records/Sequence.yaw:I
      #74 REF_getField ext/mods/gameserver/model/records/Sequence.pitch:I
      #75 REF_getField ext/mods/gameserver/model/records/Sequence.time:I
      #76 REF_getField ext/mods/gameserver/model/records/Sequence.duration:I
      #77 REF_getField ext/mods/gameserver/model/records/Sequence.turn:I
      #78 REF_getField ext/mods/gameserver/model/records/Sequence.rise:I
      #79 REF_getField ext/mods/gameserver/model/records/Sequence.widescreen:I
InnerClasses:
  public static final #92= #88 of #90;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
