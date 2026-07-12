// Bytecode for: ext.mods.gameserver.data.LocalizedString
// File: ext\mods\gameserver\data\LocalizedString.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/LocalizedString.class
  Last modified 9 de jul de 2026; size 1991 bytes
  MD5 checksum 1aec0de33c9adecf7a220f0b9a3c30f5
  Compiled from "LocalizedString.java"
public final class ext.mods.gameserver.data.LocalizedString extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/LocalizedString
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 2, methods: 7, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/LocalizedString.key:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/data/LocalizedString
   #9 = NameAndType        #11:#12        // key:Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/data/LocalizedString
  #11 = Utf8               key
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/data/LocalizedString.source:Lext/mods/gameserver/data/AbstractLocaleData;
  #14 = NameAndType        #15:#16        // source:Lext/mods/gameserver/data/AbstractLocaleData;
  #15 = Utf8               source
  #16 = Utf8               Lext/mods/gameserver/data/AbstractLocaleData;
  #17 = Methodref          #18.#19        // ext/mods/gameserver/data/AbstractLocaleData.get:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #18 = Class              #20            // ext/mods/gameserver/data/AbstractLocaleData
  #19 = NameAndType        #21:#22        // get:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #20 = Utf8               ext/mods/gameserver/data/AbstractLocaleData
  #21 = Utf8               get
  #22 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #23 = InvokeDynamic      #0:#24         // #0:toString:(Lext/mods/gameserver/data/LocalizedString;)Ljava/lang/String;
  #24 = NameAndType        #25:#26        // toString:(Lext/mods/gameserver/data/LocalizedString;)Ljava/lang/String;
  #25 = Utf8               toString
  #26 = Utf8               (Lext/mods/gameserver/data/LocalizedString;)Ljava/lang/String;
  #27 = InvokeDynamic      #0:#28         // #0:hashCode:(Lext/mods/gameserver/data/LocalizedString;)I
  #28 = NameAndType        #29:#30        // hashCode:(Lext/mods/gameserver/data/LocalizedString;)I
  #29 = Utf8               hashCode
  #30 = Utf8               (Lext/mods/gameserver/data/LocalizedString;)I
  #31 = InvokeDynamic      #0:#32         // #0:equals:(Lext/mods/gameserver/data/LocalizedString;Ljava/lang/Object;)Z
  #32 = NameAndType        #33:#34        // equals:(Lext/mods/gameserver/data/LocalizedString;Ljava/lang/Object;)Z
  #33 = Utf8               equals
  #34 = Utf8               (Lext/mods/gameserver/data/LocalizedString;Ljava/lang/Object;)Z
  #35 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/data/AbstractLocaleData;)V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/gameserver/data/LocalizedString;
  #41 = Utf8               MethodParameters
  #42 = Utf8               (Ljava/util/Locale;)Ljava/lang/String;
  #43 = Utf8               locale
  #44 = Utf8               Ljava/util/Locale;
  #45 = Utf8               ()Ljava/lang/String;
  #46 = Utf8               ()I
  #47 = Utf8               (Ljava/lang/Object;)Z
  #48 = Utf8               o
  #49 = Utf8               Ljava/lang/Object;
  #50 = Utf8               ()Lext/mods/gameserver/data/AbstractLocaleData;
  #51 = Utf8               SourceFile
  #52 = Utf8               LocalizedString.java
  #53 = Utf8               Record
  #54 = Utf8               BootstrapMethods
  #55 = String             #56            // key;source
  #56 = Utf8               key;source
  #57 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/data/LocalizedString.key:Ljava/lang/String;
  #58 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/data/LocalizedString.source:Lext/mods/gameserver/data/AbstractLocaleData;
  #59 = MethodHandle       6:#60          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #60 = Methodref          #61.#62        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #61 = Class              #63            // java/lang/runtime/ObjectMethods
  #62 = NameAndType        #64:#65        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #63 = Utf8               java/lang/runtime/ObjectMethods
  #64 = Utf8               bootstrap
  #65 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #66 = Utf8               InnerClasses
  #67 = Class              #68            // java/lang/invoke/MethodHandles$Lookup
  #68 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #69 = Class              #70            // java/lang/invoke/MethodHandles
  #70 = Utf8               java/lang/invoke/MethodHandles
  #71 = Utf8               Lookup
{
  public ext.mods.gameserver.data.LocalizedString(java.lang.String, ext.mods.gameserver.data.AbstractLocaleData);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/data/AbstractLocaleData;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field key:Ljava/lang/String;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field source:Lext/mods/gameserver/data/AbstractLocaleData;
        14: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/LocalizedString;
            0      15     1   key   Ljava/lang/String;
            0      15     2 source   Lext/mods/gameserver/data/AbstractLocaleData;
    MethodParameters:
      Name                           Flags
      key
      source

  public java.lang.String get(java.util.Locale);
    descriptor: (Ljava/util/Locale;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field source:Lext/mods/gameserver/data/AbstractLocaleData;
         4: aload_1
         5: aload_0
         6: getfield      #7                  // Field key:Ljava/lang/String;
         9: invokevirtual #17                 // Method ext/mods/gameserver/data/AbstractLocaleData.get:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        12: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/data/LocalizedString;
            0      13     1 locale   Ljava/util/Locale;

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #23,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/data/LocalizedString;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/LocalizedString;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #27,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/data/LocalizedString;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/LocalizedString;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #31,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/data/LocalizedString;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/data/LocalizedString;
            0       8     1     o   Ljava/lang/Object;

  public java.lang.String key();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field key:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/LocalizedString;

  public ext.mods.gameserver.data.AbstractLocaleData source();
    descriptor: ()Lext/mods/gameserver/data/AbstractLocaleData;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field source:Lext/mods/gameserver/data/AbstractLocaleData;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/LocalizedString;
}
SourceFile: "LocalizedString.java"
  Record: length = 0xE (unknown attribute)
   00 02 00 0B 00 0C 00 00 00 0F 00 10 00 00
BootstrapMethods:
  0: #59 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/data/LocalizedString
      #55 key;source
      #57 REF_getField ext/mods/gameserver/data/LocalizedString.key:Ljava/lang/String;
      #58 REF_getField ext/mods/gameserver/data/LocalizedString.source:Lext/mods/gameserver/data/AbstractLocaleData;
InnerClasses:
  public static final #71= #67 of #69;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
