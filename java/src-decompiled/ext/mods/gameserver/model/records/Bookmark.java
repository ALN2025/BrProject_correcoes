// Bytecode for: ext.mods.gameserver.model.records.Bookmark
// File: ext\mods\gameserver\model\records\Bookmark.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/Bookmark.class
  Last modified 9 de jul de 2026; size 1929 bytes
  MD5 checksum 7888713cfe4c2b9b1e3a06fcc2efcd8a
  Compiled from "Bookmark.java"
public final class ext.mods.gameserver.model.records.Bookmark extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/Bookmark
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 5, methods: 9, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/Bookmark.name:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/model/records/Bookmark
   #9 = NameAndType        #11:#12        // name:Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/model/records/Bookmark
  #11 = Utf8               name
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/Bookmark.id:I
  #14 = NameAndType        #15:#16        // id:I
  #15 = Utf8               id
  #16 = Utf8               I
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/records/Bookmark.x:I
  #18 = NameAndType        #19:#16        // x:I
  #19 = Utf8               x
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/records/Bookmark.y:I
  #21 = NameAndType        #22:#16        // y:I
  #22 = Utf8               y
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/model/records/Bookmark.z:I
  #24 = NameAndType        #25:#16        // z:I
  #25 = Utf8               z
  #26 = InvokeDynamic      #0:#27         // #0:toString:(Lext/mods/gameserver/model/records/Bookmark;)Ljava/lang/String;
  #27 = NameAndType        #28:#29        // toString:(Lext/mods/gameserver/model/records/Bookmark;)Ljava/lang/String;
  #28 = Utf8               toString
  #29 = Utf8               (Lext/mods/gameserver/model/records/Bookmark;)Ljava/lang/String;
  #30 = InvokeDynamic      #0:#31         // #0:hashCode:(Lext/mods/gameserver/model/records/Bookmark;)I
  #31 = NameAndType        #32:#33        // hashCode:(Lext/mods/gameserver/model/records/Bookmark;)I
  #32 = Utf8               hashCode
  #33 = Utf8               (Lext/mods/gameserver/model/records/Bookmark;)I
  #34 = InvokeDynamic      #0:#35         // #0:equals:(Lext/mods/gameserver/model/records/Bookmark;Ljava/lang/Object;)Z
  #35 = NameAndType        #36:#37        // equals:(Lext/mods/gameserver/model/records/Bookmark;Ljava/lang/Object;)Z
  #36 = Utf8               equals
  #37 = Utf8               (Lext/mods/gameserver/model/records/Bookmark;Ljava/lang/Object;)Z
  #38 = Utf8               (Ljava/lang/String;IIII)V
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/model/records/Bookmark;
  #44 = Utf8               MethodParameters
  #45 = Utf8               ()Ljava/lang/String;
  #46 = Utf8               ()I
  #47 = Utf8               (Ljava/lang/Object;)Z
  #48 = Utf8               o
  #49 = Utf8               Ljava/lang/Object;
  #50 = Utf8               SourceFile
  #51 = Utf8               Bookmark.java
  #52 = Utf8               Record
  #53 = Utf8               BootstrapMethods
  #54 = String             #55            // name;id;x;y;z
  #55 = Utf8               name;id;x;y;z
  #56 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/Bookmark.name:Ljava/lang/String;
  #57 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/Bookmark.id:I
  #58 = MethodHandle       1:#17          // REF_getField ext/mods/gameserver/model/records/Bookmark.x:I
  #59 = MethodHandle       1:#20          // REF_getField ext/mods/gameserver/model/records/Bookmark.y:I
  #60 = MethodHandle       1:#23          // REF_getField ext/mods/gameserver/model/records/Bookmark.z:I
  #61 = MethodHandle       6:#62          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #62 = Methodref          #63.#64        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #63 = Class              #65            // java/lang/runtime/ObjectMethods
  #64 = NameAndType        #66:#67        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #65 = Utf8               java/lang/runtime/ObjectMethods
  #66 = Utf8               bootstrap
  #67 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #68 = Utf8               InnerClasses
  #69 = Class              #70            // java/lang/invoke/MethodHandles$Lookup
  #70 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #71 = Class              #72            // java/lang/invoke/MethodHandles
  #72 = Utf8               java/lang/invoke/MethodHandles
  #73 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.Bookmark(java.lang.String, int, int, int, int);
    descriptor: (Ljava/lang/String;IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field name:Ljava/lang/String;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field id:I
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field x:I
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field y:I
        25: aload_0
        26: iload         5
        28: putfield      #23                 // Field z:I
        31: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/records/Bookmark;
            0      32     1  name   Ljava/lang/String;
            0      32     2    id   I
            0      32     3     x   I
            0      32     4     y   I
            0      32     5     z   I
    MethodParameters:
      Name                           Flags
      name
      id
      x
      y
      z

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #26,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/Bookmark;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Bookmark;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #30,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/Bookmark;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Bookmark;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #34,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/Bookmark;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/Bookmark;
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
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Bookmark;

  public int id();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field id:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Bookmark;

  public int x();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Bookmark;

  public int y();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Bookmark;

  public int z();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field z:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Bookmark;
}
SourceFile: "Bookmark.java"
  Record: length = 0x20 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 10 00 00 00 16 00 10 00 00 00 19 00 10 00 00

BootstrapMethods:
  0: #61 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/Bookmark
      #54 name;id;x;y;z
      #56 REF_getField ext/mods/gameserver/model/records/Bookmark.name:Ljava/lang/String;
      #57 REF_getField ext/mods/gameserver/model/records/Bookmark.id:I
      #58 REF_getField ext/mods/gameserver/model/records/Bookmark.x:I
      #59 REF_getField ext/mods/gameserver/model/records/Bookmark.y:I
      #60 REF_getField ext/mods/gameserver/model/records/Bookmark.z:I
InnerClasses:
  public static final #73= #69 of #71;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
