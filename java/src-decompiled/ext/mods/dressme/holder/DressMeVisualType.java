// Bytecode for: ext.mods.dressme.holder.DressMeVisualType
// File: ext\mods\dressme\holder\DressMeVisualType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dressme/holder/DressMeVisualType.class
  Last modified 9 de jul de 2026; size 1228 bytes
  MD5 checksum 0bba71c137509d9fefe0ccf7e40a79c1
  Compiled from "DressMeVisualType.java"
public final class ext.mods.dressme.holder.DressMeVisualType extends java.lang.Enum<ext.mods.dressme.holder.DressMeVisualType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/dressme/holder/DressMeVisualType
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/dressme/holder/DressMeVisualType
   #2 = Utf8               ext/mods/dressme/holder/DressMeVisualType
   #3 = Fieldref           #1.#4          // ext/mods/dressme/holder/DressMeVisualType.ARMOR:Lext/mods/dressme/holder/DressMeVisualType;
   #4 = NameAndType        #5:#6          // ARMOR:Lext/mods/dressme/holder/DressMeVisualType;
   #5 = Utf8               ARMOR
   #6 = Utf8               Lext/mods/dressme/holder/DressMeVisualType;
   #7 = Fieldref           #1.#8          // ext/mods/dressme/holder/DressMeVisualType.CLOAK:Lext/mods/dressme/holder/DressMeVisualType;
   #8 = NameAndType        #9:#6          // CLOAK:Lext/mods/dressme/holder/DressMeVisualType;
   #9 = Utf8               CLOAK
  #10 = Fieldref           #1.#11         // ext/mods/dressme/holder/DressMeVisualType.WEAPON:Lext/mods/dressme/holder/DressMeVisualType;
  #11 = NameAndType        #12:#6         // WEAPON:Lext/mods/dressme/holder/DressMeVisualType;
  #12 = Utf8               WEAPON
  #13 = Fieldref           #1.#14         // ext/mods/dressme/holder/DressMeVisualType.$VALUES:[Lext/mods/dressme/holder/DressMeVisualType;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/dressme/holder/DressMeVisualType;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/dressme/holder/DressMeVisualType;
  #17 = Methodref          #18.#19        // "[Lext/mods/dressme/holder/DressMeVisualType;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/dressme/holder/DressMeVisualType;"
  #19 = NameAndType        #20:#21        // clone:()Ljava/lang/Object;
  #20 = Utf8               clone
  #21 = Utf8               ()Ljava/lang/Object;
  #22 = Methodref          #23.#24        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #23 = Class              #25            // java/lang/Enum
  #24 = NameAndType        #26:#27        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #25 = Utf8               java/lang/Enum
  #26 = Utf8               valueOf
  #27 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #28 = Methodref          #23.#29        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #29 = NameAndType        #30:#31        // "<init>":(Ljava/lang/String;I)V
  #30 = Utf8               <init>
  #31 = Utf8               (Ljava/lang/String;I)V
  #32 = String             #5             // ARMOR
  #33 = Methodref          #1.#29         // ext/mods/dressme/holder/DressMeVisualType."<init>":(Ljava/lang/String;I)V
  #34 = String             #9             // CLOAK
  #35 = String             #12            // WEAPON
  #36 = Methodref          #1.#37         // ext/mods/dressme/holder/DressMeVisualType.$values:()[Lext/mods/dressme/holder/DressMeVisualType;
  #37 = NameAndType        #38:#39        // $values:()[Lext/mods/dressme/holder/DressMeVisualType;
  #38 = Utf8               $values
  #39 = Utf8               ()[Lext/mods/dressme/holder/DressMeVisualType;
  #40 = Utf8               values
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               (Ljava/lang/String;)Lext/mods/dressme/holder/DressMeVisualType;
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               name
  #46 = Utf8               Ljava/lang/String;
  #47 = Utf8               MethodParameters
  #48 = Utf8               this
  #49 = Utf8               Signature
  #50 = Utf8               ()V
  #51 = Utf8               <clinit>
  #52 = Utf8               Ljava/lang/Enum<Lext/mods/dressme/holder/DressMeVisualType;>;
  #53 = Utf8               SourceFile
  #54 = Utf8               DressMeVisualType.java
{
  public static final ext.mods.dressme.holder.DressMeVisualType ARMOR;
    descriptor: Lext/mods/dressme/holder/DressMeVisualType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.dressme.holder.DressMeVisualType CLOAK;
    descriptor: Lext/mods/dressme/holder/DressMeVisualType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.dressme.holder.DressMeVisualType WEAPON;
    descriptor: Lext/mods/dressme/holder/DressMeVisualType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.dressme.holder.DressMeVisualType[] values();
    descriptor: ()[Lext/mods/dressme/holder/DressMeVisualType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/dressme/holder/DressMeVisualType;
         3: invokevirtual #17                 // Method "[Lext/mods/dressme/holder/DressMeVisualType;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/dressme/holder/DressMeVisualType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.dressme.holder.DressMeVisualType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/dressme/holder/DressMeVisualType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/dressme/holder/DressMeVisualType
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/dressme/holder/DressMeVisualType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/dressme/holder/DressMeVisualType
         3: dup
         4: ldc           #32                 // String ARMOR
         6: iconst_0
         7: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field ARMOR:Lext/mods/dressme/holder/DressMeVisualType;
        13: new           #1                  // class ext/mods/dressme/holder/DressMeVisualType
        16: dup
        17: ldc           #34                 // String CLOAK
        19: iconst_1
        20: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field CLOAK:Lext/mods/dressme/holder/DressMeVisualType;
        26: new           #1                  // class ext/mods/dressme/holder/DressMeVisualType
        29: dup
        30: ldc           #35                 // String WEAPON
        32: iconst_2
        33: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field WEAPON:Lext/mods/dressme/holder/DressMeVisualType;
        39: invokestatic  #36                 // Method $values:()[Lext/mods/dressme/holder/DressMeVisualType;
        42: putstatic     #13                 // Field $VALUES:[Lext/mods/dressme/holder/DressMeVisualType;
        45: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 20: 39
}
Signature: #52                          // Ljava/lang/Enum<Lext/mods/dressme/holder/DressMeVisualType;>;
SourceFile: "DressMeVisualType.java"
