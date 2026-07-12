// Bytecode for: ext.mods.gameserver.model.records.AdminCommand
// File: ext\mods\gameserver\model\records\AdminCommand.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/AdminCommand.class
  Last modified 9 de jul de 2026; size 2361 bytes
  MD5 checksum 637ecdabe77c8d2449bd82fbd6f82dfa
  Compiled from "AdminCommand.java"
public final class ext.mods.gameserver.model.records.AdminCommand extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/AdminCommand
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 4, methods: 9, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/AdminCommand.name:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/model/records/AdminCommand
   #9 = NameAndType        #11:#12        // name:Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/model/records/AdminCommand
  #11 = Utf8               name
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/AdminCommand.accessLevel:I
  #14 = NameAndType        #15:#16        // accessLevel:I
  #15 = Utf8               accessLevel
  #16 = Utf8               I
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/records/AdminCommand.params:Ljava/lang/String;
  #18 = NameAndType        #19:#12        // params:Ljava/lang/String;
  #19 = Utf8               params
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/records/AdminCommand.desc:Ljava/lang/String;
  #21 = NameAndType        #22:#12        // desc:Ljava/lang/String;
  #22 = Utf8               desc
  #23 = String             #11            // name
  #24 = Methodref          #25.#26        // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #25 = Class              #27            // ext/mods/commons/data/StatSet
  #26 = NameAndType        #28:#29        // getString:(Ljava/lang/String;)Ljava/lang/String;
  #27 = Utf8               ext/mods/commons/data/StatSet
  #28 = Utf8               getString
  #29 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #30 = String             #15            // accessLevel
  #31 = Methodref          #25.#32        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #32 = NameAndType        #33:#34        // getInteger:(Ljava/lang/String;I)I
  #33 = Utf8               getInteger
  #34 = Utf8               (Ljava/lang/String;I)I
  #35 = String             #19            // params
  #36 = String             #37            //
  #37 = Utf8
  #38 = Methodref          #25.#39        // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #39 = NameAndType        #28:#40        // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #40 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #41 = String             #22            // desc
  #42 = String             #43            // The description is missing.
  #43 = Utf8               The description is missing.
  #44 = Methodref          #8.#45         // ext/mods/gameserver/model/records/AdminCommand."<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
  #45 = NameAndType        #5:#46         // "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
  #46 = Utf8               (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
  #47 = InvokeDynamic      #0:#48         // #0:toString:(Lext/mods/gameserver/model/records/AdminCommand;)Ljava/lang/String;
  #48 = NameAndType        #49:#50        // toString:(Lext/mods/gameserver/model/records/AdminCommand;)Ljava/lang/String;
  #49 = Utf8               toString
  #50 = Utf8               (Lext/mods/gameserver/model/records/AdminCommand;)Ljava/lang/String;
  #51 = InvokeDynamic      #0:#52         // #0:hashCode:(Lext/mods/gameserver/model/records/AdminCommand;)I
  #52 = NameAndType        #53:#54        // hashCode:(Lext/mods/gameserver/model/records/AdminCommand;)I
  #53 = Utf8               hashCode
  #54 = Utf8               (Lext/mods/gameserver/model/records/AdminCommand;)I
  #55 = InvokeDynamic      #0:#56         // #0:equals:(Lext/mods/gameserver/model/records/AdminCommand;Ljava/lang/Object;)Z
  #56 = NameAndType        #57:#58        // equals:(Lext/mods/gameserver/model/records/AdminCommand;Ljava/lang/Object;)Z
  #57 = Utf8               equals
  #58 = Utf8               (Lext/mods/gameserver/model/records/AdminCommand;Ljava/lang/Object;)Z
  #59 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #60 = Utf8               Code
  #61 = Utf8               LineNumberTable
  #62 = Utf8               LocalVariableTable
  #63 = Utf8               this
  #64 = Utf8               Lext/mods/gameserver/model/records/AdminCommand;
  #65 = Utf8               set
  #66 = Utf8               Lext/mods/commons/data/StatSet;
  #67 = Utf8               MethodParameters
  #68 = Utf8               ()Ljava/lang/String;
  #69 = Utf8               ()I
  #70 = Utf8               (Ljava/lang/Object;)Z
  #71 = Utf8               o
  #72 = Utf8               Ljava/lang/Object;
  #73 = Utf8               SourceFile
  #74 = Utf8               AdminCommand.java
  #75 = Utf8               Record
  #76 = Utf8               BootstrapMethods
  #77 = String             #78            // name;accessLevel;params;desc
  #78 = Utf8               name;accessLevel;params;desc
  #79 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/AdminCommand.name:Ljava/lang/String;
  #80 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/AdminCommand.accessLevel:I
  #81 = MethodHandle       1:#17          // REF_getField ext/mods/gameserver/model/records/AdminCommand.params:Ljava/lang/String;
  #82 = MethodHandle       1:#20          // REF_getField ext/mods/gameserver/model/records/AdminCommand.desc:Ljava/lang/String;
  #83 = MethodHandle       6:#84          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #84 = Methodref          #85.#86        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #85 = Class              #87            // java/lang/runtime/ObjectMethods
  #86 = NameAndType        #88:#89        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #87 = Utf8               java/lang/runtime/ObjectMethods
  #88 = Utf8               bootstrap
  #89 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #90 = Utf8               InnerClasses
  #91 = Class              #92            // java/lang/invoke/MethodHandles$Lookup
  #92 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #93 = Class              #94            // java/lang/invoke/MethodHandles
  #94 = Utf8               java/lang/invoke/MethodHandles
  #95 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.AdminCommand(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #23                 // String name
         4: invokevirtual #24                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
         7: aload_1
         8: ldc           #30                 // String accessLevel
        10: bipush        8
        12: invokevirtual #31                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        15: aload_1
        16: ldc           #35                 // String params
        18: ldc           #36                 // String
        20: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        23: aload_1
        24: ldc           #41                 // String desc
        26: ldc           #42                 // String The description is missing.
        28: invokevirtual #38                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        31: invokespecial #44                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
        34: return
      LineNumberTable:
        line 26: 0
        line 27: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/records/AdminCommand;
            0      35     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.AdminCommand(java.lang.String, int, java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field name:Ljava/lang/String;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field accessLevel:I
        14: aload_0
        15: aload_3
        16: putfield      #17                 // Field params:Ljava/lang/String;
        19: aload_0
        20: aload         4
        22: putfield      #20                 // Field desc:Ljava/lang/String;
        25: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/records/AdminCommand;
            0      26     1  name   Ljava/lang/String;
            0      26     2 accessLevel   I
            0      26     3 params   Ljava/lang/String;
            0      26     4  desc   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      name
      accessLevel
      params
      desc

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #47,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/AdminCommand;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/AdminCommand;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #51,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/AdminCommand;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/AdminCommand;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #55,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/AdminCommand;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/AdminCommand;
            0       8     1     o   Ljava/lang/Object;

  public java.lang.String name();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/AdminCommand;

  public int accessLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field accessLevel:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/AdminCommand;

  public java.lang.String params();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field params:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/AdminCommand;

  public java.lang.String desc();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field desc:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/AdminCommand;
}
SourceFile: "AdminCommand.java"
  Record: length = 0x1A (unknown attribute)
   00 04 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 0C 00 00 00 16 00 0C 00 00
BootstrapMethods:
  0: #83 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/AdminCommand
      #77 name;accessLevel;params;desc
      #79 REF_getField ext/mods/gameserver/model/records/AdminCommand.name:Ljava/lang/String;
      #80 REF_getField ext/mods/gameserver/model/records/AdminCommand.accessLevel:I
      #81 REF_getField ext/mods/gameserver/model/records/AdminCommand.params:Ljava/lang/String;
      #82 REF_getField ext/mods/gameserver/model/records/AdminCommand.desc:Ljava/lang/String;
InnerClasses:
  public static final #95= #91 of #93;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
