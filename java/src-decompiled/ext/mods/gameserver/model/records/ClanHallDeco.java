// Bytecode for: ext.mods.gameserver.model.records.ClanHallDeco
// File: ext\mods\gameserver\model\records\ClanHallDeco.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/ClanHallDeco.class
  Last modified 9 de jul de 2026; size 2529 bytes
  MD5 checksum a74f2a52fa8b4973835112dfae5f1cd7
  Compiled from "ClanHallDeco.java"
public final class ext.mods.gameserver.model.records.ClanHallDeco extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/ClanHallDeco
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 6, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/ClanHallDeco.name:Ljava/lang/String;
    #8 = Class              #10           // ext/mods/gameserver/model/records/ClanHallDeco
    #9 = NameAndType        #11:#12       // name:Ljava/lang/String;
   #10 = Utf8               ext/mods/gameserver/model/records/ClanHallDeco
   #11 = Utf8               name
   #12 = Utf8               Ljava/lang/String;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/ClanHallDeco.type:I
   #14 = NameAndType        #15:#16       // type:I
   #15 = Utf8               type
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/records/ClanHallDeco.level:I
   #18 = NameAndType        #19:#16       // level:I
   #19 = Utf8               level
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/model/records/ClanHallDeco.depth:I
   #21 = NameAndType        #22:#16       // depth:I
   #22 = Utf8               depth
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/records/ClanHallDeco.days:I
   #24 = NameAndType        #25:#16       // days:I
   #25 = Utf8               days
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/model/records/ClanHallDeco.price:I
   #27 = NameAndType        #28:#16       // price:I
   #28 = Utf8               price
   #29 = String             #11           // name
   #30 = String             #31           //
   #31 = Utf8
   #32 = Methodref          #33.#34       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #33 = Class              #35           // ext/mods/commons/data/StatSet
   #34 = NameAndType        #36:#37       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #35 = Utf8               ext/mods/commons/data/StatSet
   #36 = Utf8               getString
   #37 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #38 = String             #15           // type
   #39 = Methodref          #33.#40       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #40 = NameAndType        #41:#42       // getInteger:(Ljava/lang/String;I)I
   #41 = Utf8               getInteger
   #42 = Utf8               (Ljava/lang/String;I)I
   #43 = String             #19           // level
   #44 = String             #22           // depth
   #45 = Methodref          #33.#46       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #46 = NameAndType        #41:#47       // getInteger:(Ljava/lang/String;)I
   #47 = Utf8               (Ljava/lang/String;)I
   #48 = String             #25           // days
   #49 = String             #28           // price
   #50 = Methodref          #8.#51        // ext/mods/gameserver/model/records/ClanHallDeco."<init>":(Ljava/lang/String;IIIII)V
   #51 = NameAndType        #5:#52        // "<init>":(Ljava/lang/String;IIIII)V
   #52 = Utf8               (Ljava/lang/String;IIIII)V
   #53 = InvokeDynamic      #0:#54        // #0:toString:(Lext/mods/gameserver/model/records/ClanHallDeco;)Ljava/lang/String;
   #54 = NameAndType        #55:#56       // toString:(Lext/mods/gameserver/model/records/ClanHallDeco;)Ljava/lang/String;
   #55 = Utf8               toString
   #56 = Utf8               (Lext/mods/gameserver/model/records/ClanHallDeco;)Ljava/lang/String;
   #57 = InvokeDynamic      #0:#58        // #0:hashCode:(Lext/mods/gameserver/model/records/ClanHallDeco;)I
   #58 = NameAndType        #59:#60       // hashCode:(Lext/mods/gameserver/model/records/ClanHallDeco;)I
   #59 = Utf8               hashCode
   #60 = Utf8               (Lext/mods/gameserver/model/records/ClanHallDeco;)I
   #61 = InvokeDynamic      #0:#62        // #0:equals:(Lext/mods/gameserver/model/records/ClanHallDeco;Ljava/lang/Object;)Z
   #62 = NameAndType        #63:#64       // equals:(Lext/mods/gameserver/model/records/ClanHallDeco;Ljava/lang/Object;)Z
   #63 = Utf8               equals
   #64 = Utf8               (Lext/mods/gameserver/model/records/ClanHallDeco;Ljava/lang/Object;)Z
   #65 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #66 = Utf8               Code
   #67 = Utf8               LineNumberTable
   #68 = Utf8               LocalVariableTable
   #69 = Utf8               this
   #70 = Utf8               Lext/mods/gameserver/model/records/ClanHallDeco;
   #71 = Utf8               set
   #72 = Utf8               Lext/mods/commons/data/StatSet;
   #73 = Utf8               MethodParameters
   #74 = Utf8               ()Ljava/lang/String;
   #75 = Utf8               ()I
   #76 = Utf8               (Ljava/lang/Object;)Z
   #77 = Utf8               o
   #78 = Utf8               Ljava/lang/Object;
   #79 = Utf8               SourceFile
   #80 = Utf8               ClanHallDeco.java
   #81 = Utf8               Record
   #82 = Utf8               BootstrapMethods
   #83 = String             #84           // name;type;level;depth;days;price
   #84 = Utf8               name;type;level;depth;days;price
   #85 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/ClanHallDeco.name:Ljava/lang/String;
   #86 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/ClanHallDeco.type:I
   #87 = MethodHandle       1:#17         // REF_getField ext/mods/gameserver/model/records/ClanHallDeco.level:I
   #88 = MethodHandle       1:#20         // REF_getField ext/mods/gameserver/model/records/ClanHallDeco.depth:I
   #89 = MethodHandle       1:#23         // REF_getField ext/mods/gameserver/model/records/ClanHallDeco.days:I
   #90 = MethodHandle       1:#26         // REF_getField ext/mods/gameserver/model/records/ClanHallDeco.price:I
   #91 = MethodHandle       6:#92         // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #92 = Methodref          #93.#94       // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #93 = Class              #95           // java/lang/runtime/ObjectMethods
   #94 = NameAndType        #96:#97       // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #95 = Utf8               java/lang/runtime/ObjectMethods
   #96 = Utf8               bootstrap
   #97 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #98 = Utf8               InnerClasses
   #99 = Class              #100          // java/lang/invoke/MethodHandles$Lookup
  #100 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #101 = Class              #102          // java/lang/invoke/MethodHandles
  #102 = Utf8               java/lang/invoke/MethodHandles
  #103 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.ClanHallDeco(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #29                 // String name
         4: ldc           #30                 // String
         6: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         9: aload_1
        10: ldc           #38                 // String type
        12: iconst_0
        13: invokevirtual #39                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        16: aload_1
        17: ldc           #43                 // String level
        19: iconst_0
        20: invokevirtual #39                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        23: aload_1
        24: ldc           #44                 // String depth
        26: invokevirtual #45                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        29: aload_1
        30: ldc           #48                 // String days
        32: invokevirtual #45                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        35: aload_1
        36: ldc           #49                 // String price
        38: invokevirtual #45                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        41: invokespecial #50                 // Method "<init>":(Ljava/lang/String;IIIII)V
        44: return
      LineNumberTable:
        line 26: 0
        line 27: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;
            0      45     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.ClanHallDeco(java.lang.String, int, int, int, int, int);
    descriptor: (Ljava/lang/String;IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field name:Ljava/lang/String;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field type:I
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field level:I
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field depth:I
        25: aload_0
        26: iload         5
        28: putfield      #23                 // Field days:I
        31: aload_0
        32: iload         6
        34: putfield      #26                 // Field price:I
        37: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;
            0      38     1  name   Ljava/lang/String;
            0      38     2  type   I
            0      38     3 level   I
            0      38     4 depth   I
            0      38     5  days   I
            0      38     6 price   I
    MethodParameters:
      Name                           Flags
      name
      type
      level
      depth
      days
      price

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #53,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/ClanHallDeco;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #57,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/ClanHallDeco;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #61,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/ClanHallDeco;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;
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
            0       5     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;

  public int type();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field type:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;

  public int level();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field level:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;

  public int depth();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field depth:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;

  public int days();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field days:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;

  public int price();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field price:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/ClanHallDeco;
}
SourceFile: "ClanHallDeco.java"
  Record: length = 0x26 (unknown attribute)
   00 06 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 10 00 00 00 16 00 10 00 00 00 19 00 10 00 00
   00 1C 00 10 00 00
BootstrapMethods:
  0: #91 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/ClanHallDeco
      #83 name;type;level;depth;days;price
      #85 REF_getField ext/mods/gameserver/model/records/ClanHallDeco.name:Ljava/lang/String;
      #86 REF_getField ext/mods/gameserver/model/records/ClanHallDeco.type:I
      #87 REF_getField ext/mods/gameserver/model/records/ClanHallDeco.level:I
      #88 REF_getField ext/mods/gameserver/model/records/ClanHallDeco.depth:I
      #89 REF_getField ext/mods/gameserver/model/records/ClanHallDeco.days:I
      #90 REF_getField ext/mods/gameserver/model/records/ClanHallDeco.price:I
InnerClasses:
  public static final #103= #99 of #101;  // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
