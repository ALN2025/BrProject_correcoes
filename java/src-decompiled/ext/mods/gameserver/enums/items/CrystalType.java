// Bytecode for: ext.mods.gameserver.enums.items.CrystalType
// File: ext\mods\gameserver\enums\items\CrystalType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/items/CrystalType.class
  Last modified 9 de jul de 2026; size 2747 bytes
  MD5 checksum 7ed894f5907ac7f24940783aac89902b
  Compiled from "CrystalType.java"
public final class ext.mods.gameserver.enums.items.CrystalType extends java.lang.Enum<ext.mods.gameserver.enums.items.CrystalType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/items/CrystalType
  super_class: #32                        // java/lang/Enum
  interfaces: 0, fields: 13, methods: 13, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/items/CrystalType
    #2 = Utf8               ext/mods/gameserver/enums/items/CrystalType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/items/CrystalType.NONE:Lext/mods/gameserver/enums/items/CrystalType;
    #4 = NameAndType        #5:#6         // NONE:Lext/mods/gameserver/enums/items/CrystalType;
    #5 = Utf8               NONE
    #6 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/items/CrystalType.D:Lext/mods/gameserver/enums/items/CrystalType;
    #8 = NameAndType        #9:#6         // D:Lext/mods/gameserver/enums/items/CrystalType;
    #9 = Utf8               D
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/items/CrystalType.C:Lext/mods/gameserver/enums/items/CrystalType;
   #11 = NameAndType        #12:#6        // C:Lext/mods/gameserver/enums/items/CrystalType;
   #12 = Utf8               C
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/items/CrystalType.B:Lext/mods/gameserver/enums/items/CrystalType;
   #14 = NameAndType        #15:#6        // B:Lext/mods/gameserver/enums/items/CrystalType;
   #15 = Utf8               B
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/items/CrystalType.A:Lext/mods/gameserver/enums/items/CrystalType;
   #17 = NameAndType        #18:#6        // A:Lext/mods/gameserver/enums/items/CrystalType;
   #18 = Utf8               A
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/items/CrystalType.S:Lext/mods/gameserver/enums/items/CrystalType;
   #20 = NameAndType        #21:#6        // S:Lext/mods/gameserver/enums/items/CrystalType;
   #21 = Utf8               S
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/items/CrystalType.$VALUES:[Lext/mods/gameserver/enums/items/CrystalType;
   #23 = NameAndType        #24:#25       // $VALUES:[Lext/mods/gameserver/enums/items/CrystalType;
   #24 = Utf8               $VALUES
   #25 = Utf8               [Lext/mods/gameserver/enums/items/CrystalType;
   #26 = Methodref          #27.#28       // "[Lext/mods/gameserver/enums/items/CrystalType;".clone:()Ljava/lang/Object;
   #27 = Class              #25           // "[Lext/mods/gameserver/enums/items/CrystalType;"
   #28 = NameAndType        #29:#30       // clone:()Ljava/lang/Object;
   #29 = Utf8               clone
   #30 = Utf8               ()Ljava/lang/Object;
   #31 = Methodref          #32.#33       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #32 = Class              #34           // java/lang/Enum
   #33 = NameAndType        #35:#36       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #34 = Utf8               java/lang/Enum
   #35 = Utf8               valueOf
   #36 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #37 = Methodref          #32.#38       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #38 = NameAndType        #39:#40       // "<init>":(Ljava/lang/String;I)V
   #39 = Utf8               <init>
   #40 = Utf8               (Ljava/lang/String;I)V
   #41 = Fieldref           #1.#42        // ext/mods/gameserver/enums/items/CrystalType._id:I
   #42 = NameAndType        #43:#44       // _id:I
   #43 = Utf8               _id
   #44 = Utf8               I
   #45 = Fieldref           #1.#46        // ext/mods/gameserver/enums/items/CrystalType._crystalId:I
   #46 = NameAndType        #47:#44       // _crystalId:I
   #47 = Utf8               _crystalId
   #48 = Fieldref           #1.#49        // ext/mods/gameserver/enums/items/CrystalType._crystalEnchantBonusArmor:I
   #49 = NameAndType        #50:#44       // _crystalEnchantBonusArmor:I
   #50 = Utf8               _crystalEnchantBonusArmor
   #51 = Fieldref           #1.#52        // ext/mods/gameserver/enums/items/CrystalType._crystalEnchantBonusWeapon:I
   #52 = NameAndType        #53:#44       // _crystalEnchantBonusWeapon:I
   #53 = Utf8               _crystalEnchantBonusWeapon
   #54 = Fieldref           #1.#55        // ext/mods/gameserver/enums/items/CrystalType._gemstoneId:I
   #55 = NameAndType        #56:#44       // _gemstoneId:I
   #56 = Utf8               _gemstoneId
   #57 = Fieldref           #1.#58        // ext/mods/gameserver/enums/items/CrystalType._gemstoneCount:I
   #58 = NameAndType        #59:#44       // _gemstoneCount:I
   #59 = Utf8               _gemstoneCount
   #60 = Methodref          #1.#61        // ext/mods/gameserver/enums/items/CrystalType.getId:()I
   #61 = NameAndType        #62:#63       // getId:()I
   #62 = Utf8               getId
   #63 = Utf8               ()I
   #64 = String             #5            // NONE
   #65 = Methodref          #1.#66        // ext/mods/gameserver/enums/items/CrystalType."<init>":(Ljava/lang/String;IIIIIII)V
   #66 = NameAndType        #39:#67       // "<init>":(Ljava/lang/String;IIIIIII)V
   #67 = Utf8               (Ljava/lang/String;IIIIIII)V
   #68 = String             #9            // D
   #69 = String             #12           // C
   #70 = String             #15           // B
   #71 = String             #18           // A
   #72 = String             #21           // S
   #73 = Methodref          #1.#74        // ext/mods/gameserver/enums/items/CrystalType.$values:()[Lext/mods/gameserver/enums/items/CrystalType;
   #74 = NameAndType        #75:#76       // $values:()[Lext/mods/gameserver/enums/items/CrystalType;
   #75 = Utf8               $values
   #76 = Utf8               ()[Lext/mods/gameserver/enums/items/CrystalType;
   #77 = Utf8               values
   #78 = Utf8               Code
   #79 = Utf8               LineNumberTable
   #80 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/CrystalType;
   #81 = Utf8               LocalVariableTable
   #82 = Utf8               name
   #83 = Utf8               Ljava/lang/String;
   #84 = Utf8               MethodParameters
   #85 = Utf8               this
   #86 = Utf8               id
   #87 = Utf8               crystalId
   #88 = Utf8               crystalEnchantBonusArmor
   #89 = Utf8               crystalEnchantBonusWeapon
   #90 = Utf8               gemstoneId
   #91 = Utf8               gemstoneCount
   #92 = Utf8               Signature
   #93 = Utf8               (IIIIII)V
   #94 = Utf8               getCrystalId
   #95 = Utf8               getCrystalEnchantBonusArmor
   #96 = Utf8               getCrystalEnchantBonusWeapon
   #97 = Utf8               getGemstoneId
   #98 = Utf8               getGemstoneCount
   #99 = Utf8               isGreater
  #100 = Utf8               (Lext/mods/gameserver/enums/items/CrystalType;)Z
  #101 = Utf8               crystalType
  #102 = Utf8               StackMapTable
  #103 = Utf8               isLesser
  #104 = Utf8               <clinit>
  #105 = Utf8               ()V
  #106 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/items/CrystalType;>;
  #107 = Utf8               SourceFile
  #108 = Utf8               CrystalType.java
{
  public static final ext.mods.gameserver.enums.items.CrystalType NONE;
    descriptor: Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.CrystalType D;
    descriptor: Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.CrystalType C;
    descriptor: Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.CrystalType B;
    descriptor: Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.CrystalType A;
    descriptor: Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.CrystalType S;
    descriptor: Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.items.CrystalType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/items/CrystalType;
         3: invokevirtual #26                 // Method "[Lext/mods/gameserver/enums/items/CrystalType;".clone:()Ljava/lang/Object;
         6: checkcast     #27                 // class "[Lext/mods/gameserver/enums/items/CrystalType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.items.CrystalType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/items/CrystalType
         2: aload_0
         3: invokestatic  #31                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/items/CrystalType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/CrystalType;

  public int getCrystalId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _crystalId:I
         4: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/CrystalType;

  public int getCrystalEnchantBonusArmor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _crystalEnchantBonusArmor:I
         4: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/CrystalType;

  public int getCrystalEnchantBonusWeapon();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _crystalEnchantBonusWeapon:I
         4: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/CrystalType;

  public int getGemstoneId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #54                 // Field _gemstoneId:I
         4: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/CrystalType;

  public int getGemstoneCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _gemstoneCount:I
         4: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/CrystalType;

  public boolean isGreater(ext.mods.gameserver.enums.items.CrystalType);
    descriptor: (Lext/mods/gameserver/enums/items/CrystalType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #60                 // Method getId:()I
         4: aload_1
         5: invokevirtual #60                 // Method getId:()I
         8: if_icmple     15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/enums/items/CrystalType;
            0      17     1 crystalType   Lext/mods/gameserver/enums/items/CrystalType;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isLesser(ext.mods.gameserver.enums.items.CrystalType);
    descriptor: (Lext/mods/gameserver/enums/items/CrystalType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #60                 // Method getId:()I
         4: aload_1
         5: invokevirtual #60                 // Method getId:()I
         8: if_icmpge     15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/enums/items/CrystalType;
            0      17     1 crystalType   Lext/mods/gameserver/enums/items/CrystalType;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=10, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/items/CrystalType
         3: dup
         4: ldc           #64                 // String NONE
         6: iconst_0
         7: iconst_0
         8: iconst_0
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: invokespecial #65                 // Method "<init>":(Ljava/lang/String;IIIIIII)V
        16: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/items/CrystalType;
        19: new           #1                  // class ext/mods/gameserver/enums/items/CrystalType
        22: dup
        23: ldc           #68                 // String D
        25: iconst_1
        26: iconst_1
        27: sipush        1458
        30: bipush        11
        32: bipush        90
        34: iconst_0
        35: iconst_0
        36: invokespecial #65                 // Method "<init>":(Ljava/lang/String;IIIIIII)V
        39: putstatic     #7                  // Field D:Lext/mods/gameserver/enums/items/CrystalType;
        42: new           #1                  // class ext/mods/gameserver/enums/items/CrystalType
        45: dup
        46: ldc           #69                 // String C
        48: iconst_2
        49: iconst_2
        50: sipush        1459
        53: bipush        6
        55: bipush        45
        57: sipush        2130
        60: bipush        20
        62: invokespecial #65                 // Method "<init>":(Ljava/lang/String;IIIIIII)V
        65: putstatic     #10                 // Field C:Lext/mods/gameserver/enums/items/CrystalType;
        68: new           #1                  // class ext/mods/gameserver/enums/items/CrystalType
        71: dup
        72: ldc           #70                 // String B
        74: iconst_3
        75: iconst_3
        76: sipush        1460
        79: bipush        11
        81: bipush        67
        83: sipush        2130
        86: bipush        30
        88: invokespecial #65                 // Method "<init>":(Ljava/lang/String;IIIIIII)V
        91: putstatic     #13                 // Field B:Lext/mods/gameserver/enums/items/CrystalType;
        94: new           #1                  // class ext/mods/gameserver/enums/items/CrystalType
        97: dup
        98: ldc           #71                 // String A
       100: iconst_4
       101: iconst_4
       102: sipush        1461
       105: bipush        19
       107: sipush        144
       110: sipush        2131
       113: bipush        20
       115: invokespecial #65                 // Method "<init>":(Ljava/lang/String;IIIIIII)V
       118: putstatic     #16                 // Field A:Lext/mods/gameserver/enums/items/CrystalType;
       121: new           #1                  // class ext/mods/gameserver/enums/items/CrystalType
       124: dup
       125: ldc           #72                 // String S
       127: iconst_5
       128: iconst_5
       129: sipush        1462
       132: bipush        25
       134: sipush        250
       137: sipush        2131
       140: bipush        25
       142: invokespecial #65                 // Method "<init>":(Ljava/lang/String;IIIIIII)V
       145: putstatic     #19                 // Field S:Lext/mods/gameserver/enums/items/CrystalType;
       148: invokestatic  #73                 // Method $values:()[Lext/mods/gameserver/enums/items/CrystalType;
       151: putstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/items/CrystalType;
       154: return
      LineNumberTable:
        line 22: 0
        line 23: 19
        line 24: 42
        line 25: 68
        line 26: 94
        line 27: 121
        line 20: 148
}
Signature: #106                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/items/CrystalType;>;
SourceFile: "CrystalType.java"
