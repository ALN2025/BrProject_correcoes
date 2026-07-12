// Bytecode for: ext.mods.gameserver.enums.items.MaterialType
// File: ext\mods\gameserver\enums\items\MaterialType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/items/MaterialType.class
  Last modified 9 de jul de 2026; size 2365 bytes
  MD5 checksum 1b3451521c3f8fc1de791f40638f89b4
  Compiled from "MaterialType.java"
public final class ext.mods.gameserver.enums.items.MaterialType extends java.lang.Enum<ext.mods.gameserver.enums.items.MaterialType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/items/MaterialType
  super_class: #83                        // java/lang/Enum
  interfaces: 0, fields: 24, methods: 5, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/items/MaterialType
    #2 = Utf8               ext/mods/gameserver/enums/items/MaterialType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/items/MaterialType.STEEL:Lext/mods/gameserver/enums/items/MaterialType;
    #4 = NameAndType        #5:#6         // STEEL:Lext/mods/gameserver/enums/items/MaterialType;
    #5 = Utf8               STEEL
    #6 = Utf8               Lext/mods/gameserver/enums/items/MaterialType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/items/MaterialType.FINE_STEEL:Lext/mods/gameserver/enums/items/MaterialType;
    #8 = NameAndType        #9:#6         // FINE_STEEL:Lext/mods/gameserver/enums/items/MaterialType;
    #9 = Utf8               FINE_STEEL
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/items/MaterialType.COTTON:Lext/mods/gameserver/enums/items/MaterialType;
   #11 = NameAndType        #12:#6        // COTTON:Lext/mods/gameserver/enums/items/MaterialType;
   #12 = Utf8               COTTON
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/items/MaterialType.BLOOD_STEEL:Lext/mods/gameserver/enums/items/MaterialType;
   #14 = NameAndType        #15:#6        // BLOOD_STEEL:Lext/mods/gameserver/enums/items/MaterialType;
   #15 = Utf8               BLOOD_STEEL
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/items/MaterialType.BRONZE:Lext/mods/gameserver/enums/items/MaterialType;
   #17 = NameAndType        #18:#6        // BRONZE:Lext/mods/gameserver/enums/items/MaterialType;
   #18 = Utf8               BRONZE
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/items/MaterialType.SILVER:Lext/mods/gameserver/enums/items/MaterialType;
   #20 = NameAndType        #21:#6        // SILVER:Lext/mods/gameserver/enums/items/MaterialType;
   #21 = Utf8               SILVER
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/items/MaterialType.GOLD:Lext/mods/gameserver/enums/items/MaterialType;
   #23 = NameAndType        #24:#6        // GOLD:Lext/mods/gameserver/enums/items/MaterialType;
   #24 = Utf8               GOLD
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/items/MaterialType.MITHRIL:Lext/mods/gameserver/enums/items/MaterialType;
   #26 = NameAndType        #27:#6        // MITHRIL:Lext/mods/gameserver/enums/items/MaterialType;
   #27 = Utf8               MITHRIL
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/items/MaterialType.ORIHARUKON:Lext/mods/gameserver/enums/items/MaterialType;
   #29 = NameAndType        #30:#6        // ORIHARUKON:Lext/mods/gameserver/enums/items/MaterialType;
   #30 = Utf8               ORIHARUKON
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/items/MaterialType.PAPER:Lext/mods/gameserver/enums/items/MaterialType;
   #32 = NameAndType        #33:#6        // PAPER:Lext/mods/gameserver/enums/items/MaterialType;
   #33 = Utf8               PAPER
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/items/MaterialType.WOOD:Lext/mods/gameserver/enums/items/MaterialType;
   #35 = NameAndType        #36:#6        // WOOD:Lext/mods/gameserver/enums/items/MaterialType;
   #36 = Utf8               WOOD
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/items/MaterialType.CLOTH:Lext/mods/gameserver/enums/items/MaterialType;
   #38 = NameAndType        #39:#6        // CLOTH:Lext/mods/gameserver/enums/items/MaterialType;
   #39 = Utf8               CLOTH
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/items/MaterialType.LEATHER:Lext/mods/gameserver/enums/items/MaterialType;
   #41 = NameAndType        #42:#6        // LEATHER:Lext/mods/gameserver/enums/items/MaterialType;
   #42 = Utf8               LEATHER
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/items/MaterialType.BONE:Lext/mods/gameserver/enums/items/MaterialType;
   #44 = NameAndType        #45:#6        // BONE:Lext/mods/gameserver/enums/items/MaterialType;
   #45 = Utf8               BONE
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/items/MaterialType.HORN:Lext/mods/gameserver/enums/items/MaterialType;
   #47 = NameAndType        #48:#6        // HORN:Lext/mods/gameserver/enums/items/MaterialType;
   #48 = Utf8               HORN
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/items/MaterialType.DAMASCUS:Lext/mods/gameserver/enums/items/MaterialType;
   #50 = NameAndType        #51:#6        // DAMASCUS:Lext/mods/gameserver/enums/items/MaterialType;
   #51 = Utf8               DAMASCUS
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/items/MaterialType.ADAMANTAITE:Lext/mods/gameserver/enums/items/MaterialType;
   #53 = NameAndType        #54:#6        // ADAMANTAITE:Lext/mods/gameserver/enums/items/MaterialType;
   #54 = Utf8               ADAMANTAITE
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/items/MaterialType.CHRYSOLITE:Lext/mods/gameserver/enums/items/MaterialType;
   #56 = NameAndType        #57:#6        // CHRYSOLITE:Lext/mods/gameserver/enums/items/MaterialType;
   #57 = Utf8               CHRYSOLITE
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/items/MaterialType.CRYSTAL:Lext/mods/gameserver/enums/items/MaterialType;
   #59 = NameAndType        #60:#6        // CRYSTAL:Lext/mods/gameserver/enums/items/MaterialType;
   #60 = Utf8               CRYSTAL
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/items/MaterialType.LIQUID:Lext/mods/gameserver/enums/items/MaterialType;
   #62 = NameAndType        #63:#6        // LIQUID:Lext/mods/gameserver/enums/items/MaterialType;
   #63 = Utf8               LIQUID
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/items/MaterialType.SCALE_OF_DRAGON:Lext/mods/gameserver/enums/items/MaterialType;
   #65 = NameAndType        #66:#6        // SCALE_OF_DRAGON:Lext/mods/gameserver/enums/items/MaterialType;
   #66 = Utf8               SCALE_OF_DRAGON
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/items/MaterialType.DYESTUFF:Lext/mods/gameserver/enums/items/MaterialType;
   #68 = NameAndType        #69:#6        // DYESTUFF:Lext/mods/gameserver/enums/items/MaterialType;
   #69 = Utf8               DYESTUFF
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/items/MaterialType.COBWEB:Lext/mods/gameserver/enums/items/MaterialType;
   #71 = NameAndType        #72:#6        // COBWEB:Lext/mods/gameserver/enums/items/MaterialType;
   #72 = Utf8               COBWEB
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/items/MaterialType.$VALUES:[Lext/mods/gameserver/enums/items/MaterialType;
   #74 = NameAndType        #75:#76       // $VALUES:[Lext/mods/gameserver/enums/items/MaterialType;
   #75 = Utf8               $VALUES
   #76 = Utf8               [Lext/mods/gameserver/enums/items/MaterialType;
   #77 = Methodref          #78.#79       // "[Lext/mods/gameserver/enums/items/MaterialType;".clone:()Ljava/lang/Object;
   #78 = Class              #76           // "[Lext/mods/gameserver/enums/items/MaterialType;"
   #79 = NameAndType        #80:#81       // clone:()Ljava/lang/Object;
   #80 = Utf8               clone
   #81 = Utf8               ()Ljava/lang/Object;
   #82 = Methodref          #83.#84       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #83 = Class              #85           // java/lang/Enum
   #84 = NameAndType        #86:#87       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #85 = Utf8               java/lang/Enum
   #86 = Utf8               valueOf
   #87 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #88 = Methodref          #83.#89       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #89 = NameAndType        #90:#91       // "<init>":(Ljava/lang/String;I)V
   #90 = Utf8               <init>
   #91 = Utf8               (Ljava/lang/String;I)V
   #92 = String             #5            // STEEL
   #93 = Methodref          #1.#89        // ext/mods/gameserver/enums/items/MaterialType."<init>":(Ljava/lang/String;I)V
   #94 = String             #9            // FINE_STEEL
   #95 = String             #12           // COTTON
   #96 = String             #15           // BLOOD_STEEL
   #97 = String             #18           // BRONZE
   #98 = String             #21           // SILVER
   #99 = String             #24           // GOLD
  #100 = String             #27           // MITHRIL
  #101 = String             #30           // ORIHARUKON
  #102 = String             #33           // PAPER
  #103 = String             #36           // WOOD
  #104 = String             #39           // CLOTH
  #105 = String             #42           // LEATHER
  #106 = String             #45           // BONE
  #107 = String             #48           // HORN
  #108 = String             #51           // DAMASCUS
  #109 = String             #54           // ADAMANTAITE
  #110 = String             #57           // CHRYSOLITE
  #111 = String             #60           // CRYSTAL
  #112 = String             #63           // LIQUID
  #113 = String             #66           // SCALE_OF_DRAGON
  #114 = String             #69           // DYESTUFF
  #115 = String             #72           // COBWEB
  #116 = Methodref          #1.#117       // ext/mods/gameserver/enums/items/MaterialType.$values:()[Lext/mods/gameserver/enums/items/MaterialType;
  #117 = NameAndType        #118:#119     // $values:()[Lext/mods/gameserver/enums/items/MaterialType;
  #118 = Utf8               $values
  #119 = Utf8               ()[Lext/mods/gameserver/enums/items/MaterialType;
  #120 = Utf8               values
  #121 = Utf8               Code
  #122 = Utf8               LineNumberTable
  #123 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/MaterialType;
  #124 = Utf8               LocalVariableTable
  #125 = Utf8               name
  #126 = Utf8               Ljava/lang/String;
  #127 = Utf8               MethodParameters
  #128 = Utf8               this
  #129 = Utf8               Signature
  #130 = Utf8               ()V
  #131 = Utf8               <clinit>
  #132 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/items/MaterialType;>;
  #133 = Utf8               SourceFile
  #134 = Utf8               MaterialType.java
{
  public static final ext.mods.gameserver.enums.items.MaterialType STEEL;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType FINE_STEEL;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType COTTON;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType BLOOD_STEEL;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType BRONZE;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType SILVER;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType GOLD;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType MITHRIL;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType ORIHARUKON;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType PAPER;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType WOOD;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType CLOTH;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType LEATHER;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType BONE;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType HORN;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType DAMASCUS;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType ADAMANTAITE;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType CHRYSOLITE;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType CRYSTAL;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType LIQUID;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType SCALE_OF_DRAGON;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType DYESTUFF;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.MaterialType COBWEB;
    descriptor: Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.items.MaterialType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #73                 // Field $VALUES:[Lext/mods/gameserver/enums/items/MaterialType;
         3: invokevirtual #77                 // Method "[Lext/mods/gameserver/enums/items/MaterialType;".clone:()Ljava/lang/Object;
         6: checkcast     #78                 // class "[Lext/mods/gameserver/enums/items/MaterialType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.items.MaterialType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/items/MaterialType
         2: aload_0
         3: invokestatic  #82                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/items/MaterialType
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
         0: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
         3: dup
         4: ldc           #92                 // String STEEL
         6: iconst_0
         7: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field STEEL:Lext/mods/gameserver/enums/items/MaterialType;
        13: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
        16: dup
        17: ldc           #94                 // String FINE_STEEL
        19: iconst_1
        20: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field FINE_STEEL:Lext/mods/gameserver/enums/items/MaterialType;
        26: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
        29: dup
        30: ldc           #95                 // String COTTON
        32: iconst_2
        33: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field COTTON:Lext/mods/gameserver/enums/items/MaterialType;
        39: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
        42: dup
        43: ldc           #96                 // String BLOOD_STEEL
        45: iconst_3
        46: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field BLOOD_STEEL:Lext/mods/gameserver/enums/items/MaterialType;
        52: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
        55: dup
        56: ldc           #97                 // String BRONZE
        58: iconst_4
        59: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field BRONZE:Lext/mods/gameserver/enums/items/MaterialType;
        65: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
        68: dup
        69: ldc           #98                 // String SILVER
        71: iconst_5
        72: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field SILVER:Lext/mods/gameserver/enums/items/MaterialType;
        78: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
        81: dup
        82: ldc           #99                 // String GOLD
        84: bipush        6
        86: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field GOLD:Lext/mods/gameserver/enums/items/MaterialType;
        92: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
        95: dup
        96: ldc           #100                // String MITHRIL
        98: bipush        7
       100: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field MITHRIL:Lext/mods/gameserver/enums/items/MaterialType;
       106: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       109: dup
       110: ldc           #101                // String ORIHARUKON
       112: bipush        8
       114: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field ORIHARUKON:Lext/mods/gameserver/enums/items/MaterialType;
       120: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       123: dup
       124: ldc           #102                // String PAPER
       126: bipush        9
       128: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field PAPER:Lext/mods/gameserver/enums/items/MaterialType;
       134: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       137: dup
       138: ldc           #103                // String WOOD
       140: bipush        10
       142: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field WOOD:Lext/mods/gameserver/enums/items/MaterialType;
       148: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       151: dup
       152: ldc           #104                // String CLOTH
       154: bipush        11
       156: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field CLOTH:Lext/mods/gameserver/enums/items/MaterialType;
       162: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       165: dup
       166: ldc           #105                // String LEATHER
       168: bipush        12
       170: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field LEATHER:Lext/mods/gameserver/enums/items/MaterialType;
       176: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       179: dup
       180: ldc           #106                // String BONE
       182: bipush        13
       184: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field BONE:Lext/mods/gameserver/enums/items/MaterialType;
       190: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       193: dup
       194: ldc           #107                // String HORN
       196: bipush        14
       198: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field HORN:Lext/mods/gameserver/enums/items/MaterialType;
       204: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       207: dup
       208: ldc           #108                // String DAMASCUS
       210: bipush        15
       212: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field DAMASCUS:Lext/mods/gameserver/enums/items/MaterialType;
       218: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       221: dup
       222: ldc           #109                // String ADAMANTAITE
       224: bipush        16
       226: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       229: putstatic     #52                 // Field ADAMANTAITE:Lext/mods/gameserver/enums/items/MaterialType;
       232: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       235: dup
       236: ldc           #110                // String CHRYSOLITE
       238: bipush        17
       240: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       243: putstatic     #55                 // Field CHRYSOLITE:Lext/mods/gameserver/enums/items/MaterialType;
       246: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       249: dup
       250: ldc           #111                // String CRYSTAL
       252: bipush        18
       254: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       257: putstatic     #58                 // Field CRYSTAL:Lext/mods/gameserver/enums/items/MaterialType;
       260: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       263: dup
       264: ldc           #112                // String LIQUID
       266: bipush        19
       268: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       271: putstatic     #61                 // Field LIQUID:Lext/mods/gameserver/enums/items/MaterialType;
       274: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       277: dup
       278: ldc           #113                // String SCALE_OF_DRAGON
       280: bipush        20
       282: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       285: putstatic     #64                 // Field SCALE_OF_DRAGON:Lext/mods/gameserver/enums/items/MaterialType;
       288: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       291: dup
       292: ldc           #114                // String DYESTUFF
       294: bipush        21
       296: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       299: putstatic     #67                 // Field DYESTUFF:Lext/mods/gameserver/enums/items/MaterialType;
       302: new           #1                  // class ext/mods/gameserver/enums/items/MaterialType
       305: dup
       306: ldc           #115                // String COBWEB
       308: bipush        22
       310: invokespecial #93                 // Method "<init>":(Ljava/lang/String;I)V
       313: putstatic     #70                 // Field COBWEB:Lext/mods/gameserver/enums/items/MaterialType;
       316: invokestatic  #116                // Method $values:()[Lext/mods/gameserver/enums/items/MaterialType;
       319: putstatic     #73                 // Field $VALUES:[Lext/mods/gameserver/enums/items/MaterialType;
       322: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 27: 65
        line 28: 78
        line 29: 92
        line 30: 106
        line 31: 120
        line 32: 134
        line 33: 148
        line 34: 162
        line 35: 176
        line 36: 190
        line 37: 204
        line 38: 218
        line 39: 232
        line 40: 246
        line 41: 260
        line 42: 274
        line 43: 288
        line 44: 302
        line 20: 316
}
Signature: #132                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/items/MaterialType;>;
SourceFile: "MaterialType.java"
