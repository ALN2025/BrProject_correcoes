// Bytecode for: ext.mods.gameserver.enums.items.ArmorType
// File: ext\mods\gameserver\enums\items\ArmorType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/items/ArmorType.class
  Last modified 9 de jul de 2026; size 1766 bytes
  MD5 checksum 1400353651c1c886b9076950f2201a7e
  Compiled from "ArmorType.java"
public final class ext.mods.gameserver.enums.items.ArmorType extends java.lang.Enum<ext.mods.gameserver.enums.items.ArmorType> implements ext.mods.gameserver.enums.items.ItemType
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/items/ArmorType
  super_class: #32                        // java/lang/Enum
  interfaces: 1, fields: 9, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/items/ArmorType
   #2 = Utf8               ext/mods/gameserver/enums/items/ArmorType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/items/ArmorType.NONE:Lext/mods/gameserver/enums/items/ArmorType;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/items/ArmorType;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/items/ArmorType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/items/ArmorType.LIGHT:Lext/mods/gameserver/enums/items/ArmorType;
   #8 = NameAndType        #9:#6          // LIGHT:Lext/mods/gameserver/enums/items/ArmorType;
   #9 = Utf8               LIGHT
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/items/ArmorType.HEAVY:Lext/mods/gameserver/enums/items/ArmorType;
  #11 = NameAndType        #12:#6         // HEAVY:Lext/mods/gameserver/enums/items/ArmorType;
  #12 = Utf8               HEAVY
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/items/ArmorType.MAGIC:Lext/mods/gameserver/enums/items/ArmorType;
  #14 = NameAndType        #15:#6         // MAGIC:Lext/mods/gameserver/enums/items/ArmorType;
  #15 = Utf8               MAGIC
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/items/ArmorType.PET:Lext/mods/gameserver/enums/items/ArmorType;
  #17 = NameAndType        #18:#6         // PET:Lext/mods/gameserver/enums/items/ArmorType;
  #18 = Utf8               PET
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/items/ArmorType.SHIELD:Lext/mods/gameserver/enums/items/ArmorType;
  #20 = NameAndType        #21:#6         // SHIELD:Lext/mods/gameserver/enums/items/ArmorType;
  #21 = Utf8               SHIELD
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/items/ArmorType.$VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
  #23 = NameAndType        #24:#25        // $VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
  #24 = Utf8               $VALUES
  #25 = Utf8               [Lext/mods/gameserver/enums/items/ArmorType;
  #26 = Methodref          #27.#28        // "[Lext/mods/gameserver/enums/items/ArmorType;".clone:()Ljava/lang/Object;
  #27 = Class              #25            // "[Lext/mods/gameserver/enums/items/ArmorType;"
  #28 = NameAndType        #29:#30        // clone:()Ljava/lang/Object;
  #29 = Utf8               clone
  #30 = Utf8               ()Ljava/lang/Object;
  #31 = Methodref          #32.#33        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #32 = Class              #34            // java/lang/Enum
  #33 = NameAndType        #35:#36        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Utf8               java/lang/Enum
  #35 = Utf8               valueOf
  #36 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #37 = Methodref          #32.#38        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #38 = NameAndType        #39:#40        // "<init>":(Ljava/lang/String;I)V
  #39 = Utf8               <init>
  #40 = Utf8               (Ljava/lang/String;I)V
  #41 = Methodref          #1.#42         // ext/mods/gameserver/enums/items/ArmorType.ordinal:()I
  #42 = NameAndType        #43:#44        // ordinal:()I
  #43 = Utf8               ordinal
  #44 = Utf8               ()I
  #45 = Methodref          #46.#47        // ext/mods/gameserver/enums/items/WeaponType.values:()[Lext/mods/gameserver/enums/items/WeaponType;
  #46 = Class              #48            // ext/mods/gameserver/enums/items/WeaponType
  #47 = NameAndType        #49:#50        // values:()[Lext/mods/gameserver/enums/items/WeaponType;
  #48 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #49 = Utf8               values
  #50 = Utf8               ()[Lext/mods/gameserver/enums/items/WeaponType;
  #51 = Fieldref           #1.#52         // ext/mods/gameserver/enums/items/ArmorType._mask:I
  #52 = NameAndType        #53:#54        // _mask:I
  #53 = Utf8               _mask
  #54 = Utf8               I
  #55 = String             #5             // NONE
  #56 = Methodref          #1.#38         // ext/mods/gameserver/enums/items/ArmorType."<init>":(Ljava/lang/String;I)V
  #57 = String             #9             // LIGHT
  #58 = String             #12            // HEAVY
  #59 = String             #15            // MAGIC
  #60 = String             #18            // PET
  #61 = String             #21            // SHIELD
  #62 = Methodref          #1.#63         // ext/mods/gameserver/enums/items/ArmorType.$values:()[Lext/mods/gameserver/enums/items/ArmorType;
  #63 = NameAndType        #64:#65        // $values:()[Lext/mods/gameserver/enums/items/ArmorType;
  #64 = Utf8               $values
  #65 = Utf8               ()[Lext/mods/gameserver/enums/items/ArmorType;
  #66 = Methodref          #1.#67         // ext/mods/gameserver/enums/items/ArmorType.values:()[Lext/mods/gameserver/enums/items/ArmorType;
  #67 = NameAndType        #49:#65        // values:()[Lext/mods/gameserver/enums/items/ArmorType;
  #68 = Fieldref           #1.#69         // ext/mods/gameserver/enums/items/ArmorType.VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
  #69 = NameAndType        #70:#25        // VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
  #70 = Utf8               VALUES
  #71 = Class              #72            // ext/mods/gameserver/enums/items/ItemType
  #72 = Utf8               ext/mods/gameserver/enums/items/ItemType
  #73 = Utf8               Code
  #74 = Utf8               LineNumberTable
  #75 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ArmorType;
  #76 = Utf8               LocalVariableTable
  #77 = Utf8               name
  #78 = Utf8               Ljava/lang/String;
  #79 = Utf8               MethodParameters
  #80 = Utf8               this
  #81 = Utf8               Signature
  #82 = Utf8               ()V
  #83 = Utf8               mask
  #84 = Utf8               <clinit>
  #85 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/items/ArmorType;>;Lext/mods/gameserver/enums/items/ItemType;
  #86 = Utf8               SourceFile
  #87 = Utf8               ArmorType.java
{
  public static final ext.mods.gameserver.enums.items.ArmorType NONE;
    descriptor: Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ArmorType LIGHT;
    descriptor: Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ArmorType HEAVY;
    descriptor: Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ArmorType MAGIC;
    descriptor: Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ArmorType PET;
    descriptor: Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ArmorType SHIELD;
    descriptor: Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ArmorType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.items.ArmorType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
         3: invokevirtual #26                 // Method "[Lext/mods/gameserver/enums/items/ArmorType;".clone:()Ljava/lang/Object;
         6: checkcast     #27                 // class "[Lext/mods/gameserver/enums/items/ArmorType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.items.ArmorType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/items/ArmorType
         2: aload_0
         3: invokestatic  #31                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/items/ArmorType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int mask();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _mask:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/ArmorType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/items/ArmorType
         3: dup
         4: ldc           #55                 // String NONE
         6: iconst_0
         7: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/items/ArmorType;
        13: new           #1                  // class ext/mods/gameserver/enums/items/ArmorType
        16: dup
        17: ldc           #57                 // String LIGHT
        19: iconst_1
        20: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field LIGHT:Lext/mods/gameserver/enums/items/ArmorType;
        26: new           #1                  // class ext/mods/gameserver/enums/items/ArmorType
        29: dup
        30: ldc           #58                 // String HEAVY
        32: iconst_2
        33: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field HEAVY:Lext/mods/gameserver/enums/items/ArmorType;
        39: new           #1                  // class ext/mods/gameserver/enums/items/ArmorType
        42: dup
        43: ldc           #59                 // String MAGIC
        45: iconst_3
        46: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field MAGIC:Lext/mods/gameserver/enums/items/ArmorType;
        52: new           #1                  // class ext/mods/gameserver/enums/items/ArmorType
        55: dup
        56: ldc           #60                 // String PET
        58: iconst_4
        59: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field PET:Lext/mods/gameserver/enums/items/ArmorType;
        65: new           #1                  // class ext/mods/gameserver/enums/items/ArmorType
        68: dup
        69: ldc           #61                 // String SHIELD
        71: iconst_5
        72: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field SHIELD:Lext/mods/gameserver/enums/items/ArmorType;
        78: invokestatic  #62                 // Method $values:()[Lext/mods/gameserver/enums/items/ArmorType;
        81: putstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
        84: invokestatic  #66                 // Method values:()[Lext/mods/gameserver/enums/items/ArmorType;
        87: putstatic     #68                 // Field VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
        90: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 27: 65
        line 20: 78
        line 29: 84
}
Signature: #85                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/items/ArmorType;>;Lext/mods/gameserver/enums/items/ItemType;
SourceFile: "ArmorType.java"
