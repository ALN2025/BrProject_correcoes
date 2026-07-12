// Bytecode for: ext.mods.gameserver.model.records.CnfDlgData
// File: ext\mods\gameserver\model\records\CnfDlgData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/CnfDlgData.class
  Last modified 9 de jul de 2026; size 1598 bytes
  MD5 checksum d314557436ea8337c5fc7640edf1ac87
  Compiled from "CnfDlgData.java"
public final class ext.mods.gameserver.model.records.CnfDlgData extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/CnfDlgData
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 2, methods: 6, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/CnfDlgData.type:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/CnfDlgData
   #9 = NameAndType        #11:#12        // type:I
  #10 = Utf8               ext/mods/gameserver/model/records/CnfDlgData
  #11 = Utf8               type
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/CnfDlgData.object:Ljava/lang/Object;
  #14 = NameAndType        #15:#16        // object:Ljava/lang/Object;
  #15 = Utf8               object
  #16 = Utf8               Ljava/lang/Object;
  #17 = InvokeDynamic      #0:#18         // #0:toString:(Lext/mods/gameserver/model/records/CnfDlgData;)Ljava/lang/String;
  #18 = NameAndType        #19:#20        // toString:(Lext/mods/gameserver/model/records/CnfDlgData;)Ljava/lang/String;
  #19 = Utf8               toString
  #20 = Utf8               (Lext/mods/gameserver/model/records/CnfDlgData;)Ljava/lang/String;
  #21 = InvokeDynamic      #0:#22         // #0:hashCode:(Lext/mods/gameserver/model/records/CnfDlgData;)I
  #22 = NameAndType        #23:#24        // hashCode:(Lext/mods/gameserver/model/records/CnfDlgData;)I
  #23 = Utf8               hashCode
  #24 = Utf8               (Lext/mods/gameserver/model/records/CnfDlgData;)I
  #25 = InvokeDynamic      #0:#26         // #0:equals:(Lext/mods/gameserver/model/records/CnfDlgData;Ljava/lang/Object;)Z
  #26 = NameAndType        #27:#28        // equals:(Lext/mods/gameserver/model/records/CnfDlgData;Ljava/lang/Object;)Z
  #27 = Utf8               equals
  #28 = Utf8               (Lext/mods/gameserver/model/records/CnfDlgData;Ljava/lang/Object;)Z
  #29 = Utf8               (ILjava/lang/Object;)V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/gameserver/model/records/CnfDlgData;
  #35 = Utf8               MethodParameters
  #36 = Utf8               ()Ljava/lang/String;
  #37 = Utf8               ()I
  #38 = Utf8               (Ljava/lang/Object;)Z
  #39 = Utf8               o
  #40 = Utf8               ()Ljava/lang/Object;
  #41 = Utf8               SourceFile
  #42 = Utf8               CnfDlgData.java
  #43 = Utf8               Record
  #44 = Utf8               BootstrapMethods
  #45 = String             #46            // type;object
  #46 = Utf8               type;object
  #47 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/CnfDlgData.type:I
  #48 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/CnfDlgData.object:Ljava/lang/Object;
  #49 = MethodHandle       6:#50          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #50 = Methodref          #51.#52        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #51 = Class              #53            // java/lang/runtime/ObjectMethods
  #52 = NameAndType        #54:#55        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #53 = Utf8               java/lang/runtime/ObjectMethods
  #54 = Utf8               bootstrap
  #55 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #56 = Utf8               InnerClasses
  #57 = Class              #58            // java/lang/invoke/MethodHandles$Lookup
  #58 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #59 = Class              #60            // java/lang/invoke/MethodHandles
  #60 = Utf8               java/lang/invoke/MethodHandles
  #61 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.CnfDlgData(int, java.lang.Object);
    descriptor: (ILjava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field type:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field object:Ljava/lang/Object;
        14: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/records/CnfDlgData;
            0      15     1  type   I
            0      15     2 object   Ljava/lang/Object;
    MethodParameters:
      Name                           Flags
      type
      object

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #17,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/CnfDlgData;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/CnfDlgData;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #21,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/CnfDlgData;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/CnfDlgData;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #25,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/CnfDlgData;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/CnfDlgData;
            0       8     1     o   Ljava/lang/Object;

  public int type();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field type:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/CnfDlgData;

  public java.lang.Object object();
    descriptor: ()Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field object:Ljava/lang/Object;
         4: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/CnfDlgData;
}
SourceFile: "CnfDlgData.java"
  Record: length = 0xE (unknown attribute)
   00 02 00 0B 00 0C 00 00 00 0F 00 10 00 00
BootstrapMethods:
  0: #49 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/CnfDlgData
      #45 type;object
      #47 REF_getField ext/mods/gameserver/model/records/CnfDlgData.type:I
      #48 REF_getField ext/mods/gameserver/model/records/CnfDlgData.object:Ljava/lang/Object;
InnerClasses:
  public static final #61= #57 of #59;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
