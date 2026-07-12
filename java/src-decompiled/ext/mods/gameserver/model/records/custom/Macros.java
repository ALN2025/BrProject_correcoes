// Bytecode for: ext.mods.gameserver.model.records.custom.Macros
// File: ext\mods\gameserver\model\records\custom\Macros.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/custom/Macros.class
  Last modified 9 de jul de 2026; size 2528 bytes
  MD5 checksum 083171fbfa35bb3ebdd7b8c7a9deb213
  Compiled from "Macros.java"
public final class ext.mods.gameserver.model.records.custom.Macros extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/custom/Macros
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 6, methods: 11, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/custom/Macros.panel:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/custom/Macros
   #9 = NameAndType        #11:#12        // panel:I
  #10 = Utf8               ext/mods/gameserver/model/records/custom/Macros
  #11 = Utf8               panel
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/custom/Macros.slot:I
  #14 = NameAndType        #15:#12        // slot:I
  #15 = Utf8               slot
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/custom/Macros.name:Ljava/lang/String;
  #17 = NameAndType        #18:#19        // name:Ljava/lang/String;
  #18 = Utf8               name
  #19 = Utf8               Ljava/lang/String;
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/records/custom/Macros.action:Ljava/lang/String;
  #21 = NameAndType        #22:#19        // action:Ljava/lang/String;
  #22 = Utf8               action
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/model/records/custom/Macros.acronim:Ljava/lang/String;
  #24 = NameAndType        #25:#19        // acronim:Ljava/lang/String;
  #25 = Utf8               acronim
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/model/records/custom/Macros.command:Ljava/lang/String;
  #27 = NameAndType        #28:#19        // command:Ljava/lang/String;
  #28 = Utf8               command
  #29 = String             #11            // panel
  #30 = Methodref          #31.#32        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #31 = Class              #33            // ext/mods/commons/data/StatSet
  #32 = NameAndType        #34:#35        // getInteger:(Ljava/lang/String;)I
  #33 = Utf8               ext/mods/commons/data/StatSet
  #34 = Utf8               getInteger
  #35 = Utf8               (Ljava/lang/String;)I
  #36 = String             #15            // slot
  #37 = String             #18            // name
  #38 = Methodref          #31.#39        // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #39 = NameAndType        #40:#41        // getString:(Ljava/lang/String;)Ljava/lang/String;
  #40 = Utf8               getString
  #41 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #42 = String             #22            // action
  #43 = String             #25            // acronim
  #44 = String             #28            // command
  #45 = Methodref          #8.#46         // ext/mods/gameserver/model/records/custom/Macros."<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #46 = NameAndType        #5:#47         // "<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #47 = Utf8               (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #48 = InvokeDynamic      #0:#49         // #0:toString:(Lext/mods/gameserver/model/records/custom/Macros;)Ljava/lang/String;
  #49 = NameAndType        #50:#51        // toString:(Lext/mods/gameserver/model/records/custom/Macros;)Ljava/lang/String;
  #50 = Utf8               toString
  #51 = Utf8               (Lext/mods/gameserver/model/records/custom/Macros;)Ljava/lang/String;
  #52 = InvokeDynamic      #0:#53         // #0:hashCode:(Lext/mods/gameserver/model/records/custom/Macros;)I
  #53 = NameAndType        #54:#55        // hashCode:(Lext/mods/gameserver/model/records/custom/Macros;)I
  #54 = Utf8               hashCode
  #55 = Utf8               (Lext/mods/gameserver/model/records/custom/Macros;)I
  #56 = InvokeDynamic      #0:#57         // #0:equals:(Lext/mods/gameserver/model/records/custom/Macros;Ljava/lang/Object;)Z
  #57 = NameAndType        #58:#59        // equals:(Lext/mods/gameserver/model/records/custom/Macros;Ljava/lang/Object;)Z
  #58 = Utf8               equals
  #59 = Utf8               (Lext/mods/gameserver/model/records/custom/Macros;Ljava/lang/Object;)Z
  #60 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #61 = Utf8               Code
  #62 = Utf8               LineNumberTable
  #63 = Utf8               LocalVariableTable
  #64 = Utf8               this
  #65 = Utf8               Lext/mods/gameserver/model/records/custom/Macros;
  #66 = Utf8               set
  #67 = Utf8               Lext/mods/commons/data/StatSet;
  #68 = Utf8               MethodParameters
  #69 = Utf8               ()Ljava/lang/String;
  #70 = Utf8               ()I
  #71 = Utf8               (Ljava/lang/Object;)Z
  #72 = Utf8               o
  #73 = Utf8               Ljava/lang/Object;
  #74 = Utf8               SourceFile
  #75 = Utf8               Macros.java
  #76 = Utf8               Record
  #77 = Utf8               BootstrapMethods
  #78 = String             #79            // panel;slot;name;action;acronim;command
  #79 = Utf8               panel;slot;name;action;acronim;command
  #80 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/custom/Macros.panel:I
  #81 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/custom/Macros.slot:I
  #82 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/custom/Macros.name:Ljava/lang/String;
  #83 = MethodHandle       1:#20          // REF_getField ext/mods/gameserver/model/records/custom/Macros.action:Ljava/lang/String;
  #84 = MethodHandle       1:#23          // REF_getField ext/mods/gameserver/model/records/custom/Macros.acronim:Ljava/lang/String;
  #85 = MethodHandle       1:#26          // REF_getField ext/mods/gameserver/model/records/custom/Macros.command:Ljava/lang/String;
  #86 = MethodHandle       6:#87          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #87 = Methodref          #88.#89        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #88 = Class              #90            // java/lang/runtime/ObjectMethods
  #89 = NameAndType        #91:#92        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #90 = Utf8               java/lang/runtime/ObjectMethods
  #91 = Utf8               bootstrap
  #92 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #93 = Utf8               InnerClasses
  #94 = Class              #95            // java/lang/invoke/MethodHandles$Lookup
  #95 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #96 = Class              #97            // java/lang/invoke/MethodHandles
  #97 = Utf8               java/lang/invoke/MethodHandles
  #98 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.custom.Macros(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #29                 // String panel
         4: invokevirtual #30                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #36                 // String slot
        10: invokevirtual #30                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #37                 // String name
        16: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        19: aload_1
        20: ldc           #42                 // String action
        22: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        25: aload_1
        26: ldc           #43                 // String acronim
        28: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        31: aload_1
        32: ldc           #44                 // String command
        34: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        37: invokespecial #45                 // Method "<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        40: return
      LineNumberTable:
        line 26: 0
        line 27: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/records/custom/Macros;
            0      41     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.custom.Macros(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String);
    descriptor: (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field panel:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field slot:I
        14: aload_0
        15: aload_3
        16: putfield      #16                 // Field name:Ljava/lang/String;
        19: aload_0
        20: aload         4
        22: putfield      #20                 // Field action:Ljava/lang/String;
        25: aload_0
        26: aload         5
        28: putfield      #23                 // Field acronim:Ljava/lang/String;
        31: aload_0
        32: aload         6
        34: putfield      #26                 // Field command:Ljava/lang/String;
        37: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/records/custom/Macros;
            0      38     1 panel   I
            0      38     2  slot   I
            0      38     3  name   Ljava/lang/String;
            0      38     4 action   Ljava/lang/String;
            0      38     5 acronim   Ljava/lang/String;
            0      38     6 command   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      panel
      slot
      name
      action
      acronim
      command

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #48,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/custom/Macros;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/Macros;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #52,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/custom/Macros;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/Macros;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #56,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/custom/Macros;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/custom/Macros;
            0       8     1     o   Ljava/lang/Object;

  public int panel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field panel:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Macros;

  public int slot();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field slot:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Macros;

  public java.lang.String name();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Macros;

  public java.lang.String action();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field action:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Macros;

  public java.lang.String acronim();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field acronim:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Macros;

  public java.lang.String command();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field command:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Macros;
}
SourceFile: "Macros.java"
  Record: length = 0x26 (unknown attribute)
   00 06 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00 00 16 00 13 00 00 00 19 00 13 00 00
   00 1C 00 13 00 00
BootstrapMethods:
  0: #86 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/custom/Macros
      #78 panel;slot;name;action;acronim;command
      #80 REF_getField ext/mods/gameserver/model/records/custom/Macros.panel:I
      #81 REF_getField ext/mods/gameserver/model/records/custom/Macros.slot:I
      #82 REF_getField ext/mods/gameserver/model/records/custom/Macros.name:Ljava/lang/String;
      #83 REF_getField ext/mods/gameserver/model/records/custom/Macros.action:Ljava/lang/String;
      #84 REF_getField ext/mods/gameserver/model/records/custom/Macros.acronim:Ljava/lang/String;
      #85 REF_getField ext/mods/gameserver/model/records/custom/Macros.command:Ljava/lang/String;
InnerClasses:
  public static final #98= #94 of #96;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
