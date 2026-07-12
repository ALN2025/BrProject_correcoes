// Bytecode for: ext.mods.gameserver.data.manager.CountryLocaleManager$CountryInfo
// File: ext\mods\gameserver\data\manager\CountryLocaleManager$CountryInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.class
  Last modified 9 de jul de 2026; size 1848 bytes
  MD5 checksum 3a1bf6c520a22691387fb5252454e5a8
  Compiled from "CountryLocaleManager.java"
public final class ext.mods.gameserver.data.manager.CountryLocaleManager$CountryInfo extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 2, methods: 6, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.countryCode:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo
   #9 = NameAndType        #11:#12        // countryCode:Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo
  #11 = Utf8               countryCode
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.countryName:Ljava/lang/String;
  #14 = NameAndType        #15:#12        // countryName:Ljava/lang/String;
  #15 = Utf8               countryName
  #16 = InvokeDynamic      #0:#17         // #0:toString:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)Ljava/lang/String;
  #17 = NameAndType        #18:#19        // toString:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)Ljava/lang/String;
  #18 = Utf8               toString
  #19 = Utf8               (Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)Ljava/lang/String;
  #20 = InvokeDynamic      #0:#21         // #0:hashCode:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)I
  #21 = NameAndType        #22:#23        // hashCode:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)I
  #22 = Utf8               hashCode
  #23 = Utf8               (Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)I
  #24 = InvokeDynamic      #0:#25         // #0:equals:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;Ljava/lang/Object;)Z
  #25 = NameAndType        #26:#27        // equals:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;Ljava/lang/Object;)Z
  #26 = Utf8               equals
  #27 = Utf8               (Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;Ljava/lang/Object;)Z
  #28 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #29 = Utf8               Code
  #30 = Utf8               LineNumberTable
  #31 = Utf8               LocalVariableTable
  #32 = Utf8               this
  #33 = Utf8               Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
  #34 = Utf8               MethodParameters
  #35 = Utf8               ()Ljava/lang/String;
  #36 = Utf8               ()I
  #37 = Utf8               (Ljava/lang/Object;)Z
  #38 = Utf8               o
  #39 = Utf8               Ljava/lang/Object;
  #40 = Utf8               SourceFile
  #41 = Utf8               CountryLocaleManager.java
  #42 = Utf8               NestHost
  #43 = Class              #44            // ext/mods/gameserver/data/manager/CountryLocaleManager
  #44 = Utf8               ext/mods/gameserver/data/manager/CountryLocaleManager
  #45 = Utf8               Record
  #46 = Utf8               BootstrapMethods
  #47 = String             #48            // countryCode;countryName
  #48 = Utf8               countryCode;countryName
  #49 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.countryCode:Ljava/lang/String;
  #50 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.countryName:Ljava/lang/String;
  #51 = MethodHandle       6:#52          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #52 = Methodref          #53.#54        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #53 = Class              #55            // java/lang/runtime/ObjectMethods
  #54 = NameAndType        #56:#57        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #55 = Utf8               java/lang/runtime/ObjectMethods
  #56 = Utf8               bootstrap
  #57 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #58 = Utf8               InnerClasses
  #59 = Utf8               CountryInfo
  #60 = Class              #61            // java/lang/invoke/MethodHandles$Lookup
  #61 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #62 = Class              #63            // java/lang/invoke/MethodHandles
  #63 = Utf8               java/lang/invoke/MethodHandles
  #64 = Utf8               Lookup
{
  public ext.mods.gameserver.data.manager.CountryLocaleManager$CountryInfo(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field countryCode:Ljava/lang/String;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field countryName:Ljava/lang/String;
        14: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
            0      15     1 countryCode   Ljava/lang/String;
            0      15     2 countryName   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      countryCode
      countryName

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #16,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #20,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)I
         6: ireturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #24,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
            0       8     1     o   Ljava/lang/Object;

  public java.lang.String countryCode();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field countryCode:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;

  public java.lang.String countryName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field countryName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
}
SourceFile: "CountryLocaleManager.java"
NestHost: class ext/mods/gameserver/data/manager/CountryLocaleManager
  Record: length = 0xE (unknown attribute)
   00 02 00 0B 00 0C 00 00 00 0F 00 0C 00 00
BootstrapMethods:
  0: #51 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo
      #47 countryCode;countryName
      #49 REF_getField ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.countryCode:Ljava/lang/String;
      #50 REF_getField ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.countryName:Ljava/lang/String;
InnerClasses:
  public static final #59= #8 of #43;     // CountryInfo=class ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo of class ext/mods/gameserver/data/manager/CountryLocaleManager
  public static final #64= #60 of #62;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
