// Bytecode for: ext.mods.gameserver.model.records.CursedWeaponInfo
// File: ext\mods\gameserver\model\records\CursedWeaponInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/CursedWeaponInfo.class
  Last modified 9 de jul de 2026; size 1859 bytes
  MD5 checksum 67982e6761f7f38f22d74e333f9cbfbc
  Compiled from "CursedWeaponInfo.java"
public final class ext.mods.gameserver.model.records.CursedWeaponInfo extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/CursedWeaponInfo
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 7, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/CursedWeaponInfo.pos:Lext/mods/gameserver/model/location/Location;
   #8 = Class              #10            // ext/mods/gameserver/model/records/CursedWeaponInfo
   #9 = NameAndType        #11:#12        // pos:Lext/mods/gameserver/model/location/Location;
  #10 = Utf8               ext/mods/gameserver/model/records/CursedWeaponInfo
  #11 = Utf8               pos
  #12 = Utf8               Lext/mods/gameserver/model/location/Location;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/CursedWeaponInfo.id:I
  #14 = NameAndType        #15:#16        // id:I
  #15 = Utf8               id
  #16 = Utf8               I
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/records/CursedWeaponInfo.activated:I
  #18 = NameAndType        #19:#16        // activated:I
  #19 = Utf8               activated
  #20 = InvokeDynamic      #0:#21         // #0:toString:(Lext/mods/gameserver/model/records/CursedWeaponInfo;)Ljava/lang/String;
  #21 = NameAndType        #22:#23        // toString:(Lext/mods/gameserver/model/records/CursedWeaponInfo;)Ljava/lang/String;
  #22 = Utf8               toString
  #23 = Utf8               (Lext/mods/gameserver/model/records/CursedWeaponInfo;)Ljava/lang/String;
  #24 = InvokeDynamic      #0:#25         // #0:hashCode:(Lext/mods/gameserver/model/records/CursedWeaponInfo;)I
  #25 = NameAndType        #26:#27        // hashCode:(Lext/mods/gameserver/model/records/CursedWeaponInfo;)I
  #26 = Utf8               hashCode
  #27 = Utf8               (Lext/mods/gameserver/model/records/CursedWeaponInfo;)I
  #28 = InvokeDynamic      #0:#29         // #0:equals:(Lext/mods/gameserver/model/records/CursedWeaponInfo;Ljava/lang/Object;)Z
  #29 = NameAndType        #30:#31        // equals:(Lext/mods/gameserver/model/records/CursedWeaponInfo;Ljava/lang/Object;)Z
  #30 = Utf8               equals
  #31 = Utf8               (Lext/mods/gameserver/model/records/CursedWeaponInfo;Ljava/lang/Object;)Z
  #32 = Utf8               (Lext/mods/gameserver/model/location/Location;II)V
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/gameserver/model/records/CursedWeaponInfo;
  #38 = Utf8               MethodParameters
  #39 = Utf8               ()Ljava/lang/String;
  #40 = Utf8               ()I
  #41 = Utf8               (Ljava/lang/Object;)Z
  #42 = Utf8               o
  #43 = Utf8               Ljava/lang/Object;
  #44 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #45 = Utf8               SourceFile
  #46 = Utf8               CursedWeaponInfo.java
  #47 = Utf8               Record
  #48 = Utf8               BootstrapMethods
  #49 = String             #50            // pos;id;activated
  #50 = Utf8               pos;id;activated
  #51 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/CursedWeaponInfo.pos:Lext/mods/gameserver/model/location/Location;
  #52 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/CursedWeaponInfo.id:I
  #53 = MethodHandle       1:#17          // REF_getField ext/mods/gameserver/model/records/CursedWeaponInfo.activated:I
  #54 = MethodHandle       6:#55          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #55 = Methodref          #56.#57        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #56 = Class              #58            // java/lang/runtime/ObjectMethods
  #57 = NameAndType        #59:#60        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #58 = Utf8               java/lang/runtime/ObjectMethods
  #59 = Utf8               bootstrap
  #60 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #61 = Utf8               InnerClasses
  #62 = Class              #63            // java/lang/invoke/MethodHandles$Lookup
  #63 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #64 = Class              #65            // java/lang/invoke/MethodHandles
  #65 = Utf8               java/lang/invoke/MethodHandles
  #66 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.CursedWeaponInfo(ext.mods.gameserver.model.location.Location, int, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field pos:Lext/mods/gameserver/model/location/Location;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field id:I
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field activated:I
        19: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/records/CursedWeaponInfo;
            0      20     1   pos   Lext/mods/gameserver/model/location/Location;
            0      20     2    id   I
            0      20     3 activated   I
    MethodParameters:
      Name                           Flags
      pos
      id
      activated

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #20,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/CursedWeaponInfo;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/CursedWeaponInfo;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #24,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/CursedWeaponInfo;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/CursedWeaponInfo;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #28,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/CursedWeaponInfo;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/CursedWeaponInfo;
            0       8     1     o   Ljava/lang/Object;

  public ext.mods.gameserver.model.location.Location pos();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field pos:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/CursedWeaponInfo;

  public int id();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field id:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/CursedWeaponInfo;

  public int activated();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field activated:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/CursedWeaponInfo;
}
SourceFile: "CursedWeaponInfo.java"
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 10 00 00
BootstrapMethods:
  0: #54 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/CursedWeaponInfo
      #49 pos;id;activated
      #51 REF_getField ext/mods/gameserver/model/records/CursedWeaponInfo.pos:Lext/mods/gameserver/model/location/Location;
      #52 REF_getField ext/mods/gameserver/model/records/CursedWeaponInfo.id:I
      #53 REF_getField ext/mods/gameserver/model/records/CursedWeaponInfo.activated:I
InnerClasses:
  public static final #66= #62 of #64;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
