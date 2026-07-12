// Bytecode for: ext.mods.gameserver.model.records.custom.EventItem
// File: ext\mods\gameserver\model\records\custom\EventItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/custom/EventItem.class
  Last modified 9 de jul de 2026; size 1836 bytes
  MD5 checksum 22405fbfe52cea2f5280298dbbf42e16
  Compiled from "EventItem.java"
public final class ext.mods.gameserver.model.records.custom.EventItem extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/custom/EventItem
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 4, methods: 8, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/custom/EventItem.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/custom/EventItem
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/records/custom/EventItem
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/custom/EventItem.count:I
  #14 = NameAndType        #15:#12        // count:I
  #15 = Utf8               count
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/custom/EventItem.chance:I
  #17 = NameAndType        #18:#12        // chance:I
  #18 = Utf8               chance
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/records/custom/EventItem.minLvl:I
  #20 = NameAndType        #21:#12        // minLvl:I
  #21 = Utf8               minLvl
  #22 = InvokeDynamic      #0:#23         // #0:toString:(Lext/mods/gameserver/model/records/custom/EventItem;)Ljava/lang/String;
  #23 = NameAndType        #24:#25        // toString:(Lext/mods/gameserver/model/records/custom/EventItem;)Ljava/lang/String;
  #24 = Utf8               toString
  #25 = Utf8               (Lext/mods/gameserver/model/records/custom/EventItem;)Ljava/lang/String;
  #26 = InvokeDynamic      #0:#27         // #0:hashCode:(Lext/mods/gameserver/model/records/custom/EventItem;)I
  #27 = NameAndType        #28:#29        // hashCode:(Lext/mods/gameserver/model/records/custom/EventItem;)I
  #28 = Utf8               hashCode
  #29 = Utf8               (Lext/mods/gameserver/model/records/custom/EventItem;)I
  #30 = InvokeDynamic      #0:#31         // #0:equals:(Lext/mods/gameserver/model/records/custom/EventItem;Ljava/lang/Object;)Z
  #31 = NameAndType        #32:#33        // equals:(Lext/mods/gameserver/model/records/custom/EventItem;Ljava/lang/Object;)Z
  #32 = Utf8               equals
  #33 = Utf8               (Lext/mods/gameserver/model/records/custom/EventItem;Ljava/lang/Object;)Z
  #34 = Utf8               (IIII)V
  #35 = Utf8               Code
  #36 = Utf8               LineNumberTable
  #37 = Utf8               LocalVariableTable
  #38 = Utf8               this
  #39 = Utf8               Lext/mods/gameserver/model/records/custom/EventItem;
  #40 = Utf8               MethodParameters
  #41 = Utf8               ()Ljava/lang/String;
  #42 = Utf8               ()I
  #43 = Utf8               (Ljava/lang/Object;)Z
  #44 = Utf8               o
  #45 = Utf8               Ljava/lang/Object;
  #46 = Utf8               SourceFile
  #47 = Utf8               EventItem.java
  #48 = Utf8               Record
  #49 = Utf8               BootstrapMethods
  #50 = String             #51            // id;count;chance;minLvl
  #51 = Utf8               id;count;chance;minLvl
  #52 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/custom/EventItem.id:I
  #53 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/custom/EventItem.count:I
  #54 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/custom/EventItem.chance:I
  #55 = MethodHandle       1:#19          // REF_getField ext/mods/gameserver/model/records/custom/EventItem.minLvl:I
  #56 = MethodHandle       6:#57          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #57 = Methodref          #58.#59        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #58 = Class              #60            // java/lang/runtime/ObjectMethods
  #59 = NameAndType        #61:#62        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #60 = Utf8               java/lang/runtime/ObjectMethods
  #61 = Utf8               bootstrap
  #62 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #63 = Utf8               InnerClasses
  #64 = Class              #65            // java/lang/invoke/MethodHandles$Lookup
  #65 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #66 = Class              #67            // java/lang/invoke/MethodHandles
  #67 = Utf8               java/lang/invoke/MethodHandles
  #68 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.custom.EventItem(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field id:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field count:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field chance:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field minLvl:I
        25: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/records/custom/EventItem;
            0      26     1    id   I
            0      26     2 count   I
            0      26     3 chance   I
            0      26     4 minLvl   I
    MethodParameters:
      Name                           Flags
      id
      count
      chance
      minLvl

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #22,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/custom/EventItem;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/EventItem;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #26,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/custom/EventItem;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/EventItem;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #30,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/custom/EventItem;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/custom/EventItem;
            0       8     1     o   Ljava/lang/Object;

  public int id();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field id:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EventItem;

  public int count();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field count:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EventItem;

  public int chance();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field chance:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EventItem;

  public int minLvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field minLvl:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EventItem;
}
SourceFile: "EventItem.java"
  Record: length = 0x1A (unknown attribute)
   00 04 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00
BootstrapMethods:
  0: #56 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/custom/EventItem
      #50 id;count;chance;minLvl
      #52 REF_getField ext/mods/gameserver/model/records/custom/EventItem.id:I
      #53 REF_getField ext/mods/gameserver/model/records/custom/EventItem.count:I
      #54 REF_getField ext/mods/gameserver/model/records/custom/EventItem.chance:I
      #55 REF_getField ext/mods/gameserver/model/records/custom/EventItem.minLvl:I
InnerClasses:
  public static final #68= #64 of #66;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
