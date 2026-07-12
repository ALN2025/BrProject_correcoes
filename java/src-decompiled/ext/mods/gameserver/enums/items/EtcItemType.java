// Bytecode for: ext.mods.gameserver.enums.items.EtcItemType
// File: ext\mods\gameserver\enums\items\EtcItemType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/items/EtcItemType.class
  Last modified 9 de jul de 2026; size 2771 bytes
  MD5 checksum 5dd6a143dbcc069103faa4d3f885ef91
  Compiled from "EtcItemType.java"
public final class ext.mods.gameserver.enums.items.EtcItemType extends java.lang.Enum<ext.mods.gameserver.enums.items.EtcItemType> implements ext.mods.gameserver.enums.items.ItemType
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/items/EtcItemType
  super_class: #95                        // java/lang/Enum
  interfaces: 1, fields: 28, methods: 6, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/items/EtcItemType
    #2 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/items/EtcItemType.NONE:Lext/mods/gameserver/enums/items/EtcItemType;
    #4 = NameAndType        #5:#6         // NONE:Lext/mods/gameserver/enums/items/EtcItemType;
    #5 = Utf8               NONE
    #6 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
    #8 = NameAndType        #9:#6         // ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
    #9 = Utf8               ARROW
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/items/EtcItemType.POTION:Lext/mods/gameserver/enums/items/EtcItemType;
   #11 = NameAndType        #12:#6        // POTION:Lext/mods/gameserver/enums/items/EtcItemType;
   #12 = Utf8               POTION
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/items/EtcItemType.SCRL_ENCHANT_WP:Lext/mods/gameserver/enums/items/EtcItemType;
   #14 = NameAndType        #15:#6        // SCRL_ENCHANT_WP:Lext/mods/gameserver/enums/items/EtcItemType;
   #15 = Utf8               SCRL_ENCHANT_WP
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/items/EtcItemType.SCRL_ENCHANT_AM:Lext/mods/gameserver/enums/items/EtcItemType;
   #17 = NameAndType        #18:#6        // SCRL_ENCHANT_AM:Lext/mods/gameserver/enums/items/EtcItemType;
   #18 = Utf8               SCRL_ENCHANT_AM
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/items/EtcItemType.SCROLL:Lext/mods/gameserver/enums/items/EtcItemType;
   #20 = NameAndType        #21:#6        // SCROLL:Lext/mods/gameserver/enums/items/EtcItemType;
   #21 = Utf8               SCROLL
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/items/EtcItemType.RECIPE:Lext/mods/gameserver/enums/items/EtcItemType;
   #23 = NameAndType        #24:#6        // RECIPE:Lext/mods/gameserver/enums/items/EtcItemType;
   #24 = Utf8               RECIPE
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/items/EtcItemType.MATERIAL:Lext/mods/gameserver/enums/items/EtcItemType;
   #26 = NameAndType        #27:#6        // MATERIAL:Lext/mods/gameserver/enums/items/EtcItemType;
   #27 = Utf8               MATERIAL
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/items/EtcItemType.PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
   #29 = NameAndType        #30:#6        // PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
   #30 = Utf8               PET_COLLAR
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/items/EtcItemType.CASTLE_GUARD:Lext/mods/gameserver/enums/items/EtcItemType;
   #32 = NameAndType        #33:#6        // CASTLE_GUARD:Lext/mods/gameserver/enums/items/EtcItemType;
   #33 = Utf8               CASTLE_GUARD
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/items/EtcItemType.LOTTO:Lext/mods/gameserver/enums/items/EtcItemType;
   #35 = NameAndType        #36:#6        // LOTTO:Lext/mods/gameserver/enums/items/EtcItemType;
   #36 = Utf8               LOTTO
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/items/EtcItemType.RACE_TICKET:Lext/mods/gameserver/enums/items/EtcItemType;
   #38 = NameAndType        #39:#6        // RACE_TICKET:Lext/mods/gameserver/enums/items/EtcItemType;
   #39 = Utf8               RACE_TICKET
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/items/EtcItemType.DYE:Lext/mods/gameserver/enums/items/EtcItemType;
   #41 = NameAndType        #42:#6        // DYE:Lext/mods/gameserver/enums/items/EtcItemType;
   #42 = Utf8               DYE
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/items/EtcItemType.SEED:Lext/mods/gameserver/enums/items/EtcItemType;
   #44 = NameAndType        #45:#6        // SEED:Lext/mods/gameserver/enums/items/EtcItemType;
   #45 = Utf8               SEED
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/items/EtcItemType.CROP:Lext/mods/gameserver/enums/items/EtcItemType;
   #47 = NameAndType        #48:#6        // CROP:Lext/mods/gameserver/enums/items/EtcItemType;
   #48 = Utf8               CROP
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/items/EtcItemType.MATURECROP:Lext/mods/gameserver/enums/items/EtcItemType;
   #50 = NameAndType        #51:#6        // MATURECROP:Lext/mods/gameserver/enums/items/EtcItemType;
   #51 = Utf8               MATURECROP
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/items/EtcItemType.HARVEST:Lext/mods/gameserver/enums/items/EtcItemType;
   #53 = NameAndType        #54:#6        // HARVEST:Lext/mods/gameserver/enums/items/EtcItemType;
   #54 = Utf8               HARVEST
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/items/EtcItemType.SEED2:Lext/mods/gameserver/enums/items/EtcItemType;
   #56 = NameAndType        #57:#6        // SEED2:Lext/mods/gameserver/enums/items/EtcItemType;
   #57 = Utf8               SEED2
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/items/EtcItemType.TICKET_OF_LORD:Lext/mods/gameserver/enums/items/EtcItemType;
   #59 = NameAndType        #60:#6        // TICKET_OF_LORD:Lext/mods/gameserver/enums/items/EtcItemType;
   #60 = Utf8               TICKET_OF_LORD
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/items/EtcItemType.LURE:Lext/mods/gameserver/enums/items/EtcItemType;
   #62 = NameAndType        #63:#6        // LURE:Lext/mods/gameserver/enums/items/EtcItemType;
   #63 = Utf8               LURE
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/items/EtcItemType.BLESS_SCRL_ENCHANT_WP:Lext/mods/gameserver/enums/items/EtcItemType;
   #65 = NameAndType        #66:#6        // BLESS_SCRL_ENCHANT_WP:Lext/mods/gameserver/enums/items/EtcItemType;
   #66 = Utf8               BLESS_SCRL_ENCHANT_WP
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/items/EtcItemType.BLESS_SCRL_ENCHANT_AM:Lext/mods/gameserver/enums/items/EtcItemType;
   #68 = NameAndType        #69:#6        // BLESS_SCRL_ENCHANT_AM:Lext/mods/gameserver/enums/items/EtcItemType;
   #69 = Utf8               BLESS_SCRL_ENCHANT_AM
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/items/EtcItemType.COUPON:Lext/mods/gameserver/enums/items/EtcItemType;
   #71 = NameAndType        #72:#6        // COUPON:Lext/mods/gameserver/enums/items/EtcItemType;
   #72 = Utf8               COUPON
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/items/EtcItemType.ELIXIR:Lext/mods/gameserver/enums/items/EtcItemType;
   #74 = NameAndType        #75:#6        // ELIXIR:Lext/mods/gameserver/enums/items/EtcItemType;
   #75 = Utf8               ELIXIR
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
   #77 = NameAndType        #78:#6        // SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
   #78 = Utf8               SHOT
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
   #80 = NameAndType        #81:#6        // HERB:Lext/mods/gameserver/enums/items/EtcItemType;
   #81 = Utf8               HERB
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/items/EtcItemType.QUEST:Lext/mods/gameserver/enums/items/EtcItemType;
   #83 = NameAndType        #84:#6        // QUEST:Lext/mods/gameserver/enums/items/EtcItemType;
   #84 = Utf8               QUEST
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/items/EtcItemType.$VALUES:[Lext/mods/gameserver/enums/items/EtcItemType;
   #86 = NameAndType        #87:#88       // $VALUES:[Lext/mods/gameserver/enums/items/EtcItemType;
   #87 = Utf8               $VALUES
   #88 = Utf8               [Lext/mods/gameserver/enums/items/EtcItemType;
   #89 = Methodref          #90.#91       // "[Lext/mods/gameserver/enums/items/EtcItemType;".clone:()Ljava/lang/Object;
   #90 = Class              #88           // "[Lext/mods/gameserver/enums/items/EtcItemType;"
   #91 = NameAndType        #92:#93       // clone:()Ljava/lang/Object;
   #92 = Utf8               clone
   #93 = Utf8               ()Ljava/lang/Object;
   #94 = Methodref          #95.#96       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #95 = Class              #97           // java/lang/Enum
   #96 = NameAndType        #98:#99       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #97 = Utf8               java/lang/Enum
   #98 = Utf8               valueOf
   #99 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #100 = Methodref          #95.#101      // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #101 = NameAndType        #102:#103     // "<init>":(Ljava/lang/String;I)V
  #102 = Utf8               <init>
  #103 = Utf8               (Ljava/lang/String;I)V
  #104 = String             #5            // NONE
  #105 = Methodref          #1.#101       // ext/mods/gameserver/enums/items/EtcItemType."<init>":(Ljava/lang/String;I)V
  #106 = String             #9            // ARROW
  #107 = String             #12           // POTION
  #108 = String             #15           // SCRL_ENCHANT_WP
  #109 = String             #18           // SCRL_ENCHANT_AM
  #110 = String             #21           // SCROLL
  #111 = String             #24           // RECIPE
  #112 = String             #27           // MATERIAL
  #113 = String             #30           // PET_COLLAR
  #114 = String             #33           // CASTLE_GUARD
  #115 = String             #36           // LOTTO
  #116 = String             #39           // RACE_TICKET
  #117 = String             #42           // DYE
  #118 = String             #45           // SEED
  #119 = String             #48           // CROP
  #120 = String             #51           // MATURECROP
  #121 = String             #54           // HARVEST
  #122 = String             #57           // SEED2
  #123 = String             #60           // TICKET_OF_LORD
  #124 = String             #63           // LURE
  #125 = String             #66           // BLESS_SCRL_ENCHANT_WP
  #126 = String             #69           // BLESS_SCRL_ENCHANT_AM
  #127 = String             #72           // COUPON
  #128 = String             #75           // ELIXIR
  #129 = String             #78           // SHOT
  #130 = String             #81           // HERB
  #131 = String             #84           // QUEST
  #132 = Methodref          #1.#133       // ext/mods/gameserver/enums/items/EtcItemType.$values:()[Lext/mods/gameserver/enums/items/EtcItemType;
  #133 = NameAndType        #134:#135     // $values:()[Lext/mods/gameserver/enums/items/EtcItemType;
  #134 = Utf8               $values
  #135 = Utf8               ()[Lext/mods/gameserver/enums/items/EtcItemType;
  #136 = Class              #137          // ext/mods/gameserver/enums/items/ItemType
  #137 = Utf8               ext/mods/gameserver/enums/items/ItemType
  #138 = Utf8               values
  #139 = Utf8               Code
  #140 = Utf8               LineNumberTable
  #141 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/EtcItemType;
  #142 = Utf8               LocalVariableTable
  #143 = Utf8               name
  #144 = Utf8               Ljava/lang/String;
  #145 = Utf8               MethodParameters
  #146 = Utf8               this
  #147 = Utf8               Signature
  #148 = Utf8               ()V
  #149 = Utf8               mask
  #150 = Utf8               ()I
  #151 = Utf8               <clinit>
  #152 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/items/EtcItemType;>;Lext/mods/gameserver/enums/items/ItemType;
  #153 = Utf8               SourceFile
  #154 = Utf8               EtcItemType.java
{
  public static final ext.mods.gameserver.enums.items.EtcItemType NONE;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType ARROW;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType POTION;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType SCRL_ENCHANT_WP;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType SCRL_ENCHANT_AM;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType SCROLL;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType RECIPE;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType MATERIAL;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType PET_COLLAR;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType CASTLE_GUARD;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType LOTTO;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType RACE_TICKET;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType DYE;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType SEED;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType CROP;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType MATURECROP;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType HARVEST;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType SEED2;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType TICKET_OF_LORD;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType LURE;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType BLESS_SCRL_ENCHANT_WP;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType BLESS_SCRL_ENCHANT_AM;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType COUPON;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType ELIXIR;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType SHOT;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType HERB;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.EtcItemType QUEST;
    descriptor: Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.items.EtcItemType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #85                 // Field $VALUES:[Lext/mods/gameserver/enums/items/EtcItemType;
         3: invokevirtual #89                 // Method "[Lext/mods/gameserver/enums/items/EtcItemType;".clone:()Ljava/lang/Object;
         6: checkcast     #90                 // class "[Lext/mods/gameserver/enums/items/EtcItemType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.items.EtcItemType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
         2: aload_0
         3: invokestatic  #94                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/items/EtcItemType
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
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/enums/items/EtcItemType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
         3: dup
         4: ldc           #104                // String NONE
         6: iconst_0
         7: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/items/EtcItemType;
        13: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
        16: dup
        17: ldc           #106                // String ARROW
        19: iconst_1
        20: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
        26: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
        29: dup
        30: ldc           #107                // String POTION
        32: iconst_2
        33: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field POTION:Lext/mods/gameserver/enums/items/EtcItemType;
        39: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
        42: dup
        43: ldc           #108                // String SCRL_ENCHANT_WP
        45: iconst_3
        46: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field SCRL_ENCHANT_WP:Lext/mods/gameserver/enums/items/EtcItemType;
        52: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
        55: dup
        56: ldc           #109                // String SCRL_ENCHANT_AM
        58: iconst_4
        59: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field SCRL_ENCHANT_AM:Lext/mods/gameserver/enums/items/EtcItemType;
        65: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
        68: dup
        69: ldc           #110                // String SCROLL
        71: iconst_5
        72: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field SCROLL:Lext/mods/gameserver/enums/items/EtcItemType;
        78: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
        81: dup
        82: ldc           #111                // String RECIPE
        84: bipush        6
        86: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field RECIPE:Lext/mods/gameserver/enums/items/EtcItemType;
        92: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
        95: dup
        96: ldc           #112                // String MATERIAL
        98: bipush        7
       100: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field MATERIAL:Lext/mods/gameserver/enums/items/EtcItemType;
       106: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       109: dup
       110: ldc           #113                // String PET_COLLAR
       112: bipush        8
       114: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
       120: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       123: dup
       124: ldc           #114                // String CASTLE_GUARD
       126: bipush        9
       128: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field CASTLE_GUARD:Lext/mods/gameserver/enums/items/EtcItemType;
       134: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       137: dup
       138: ldc           #115                // String LOTTO
       140: bipush        10
       142: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field LOTTO:Lext/mods/gameserver/enums/items/EtcItemType;
       148: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       151: dup
       152: ldc           #116                // String RACE_TICKET
       154: bipush        11
       156: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field RACE_TICKET:Lext/mods/gameserver/enums/items/EtcItemType;
       162: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       165: dup
       166: ldc           #117                // String DYE
       168: bipush        12
       170: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field DYE:Lext/mods/gameserver/enums/items/EtcItemType;
       176: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       179: dup
       180: ldc           #118                // String SEED
       182: bipush        13
       184: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field SEED:Lext/mods/gameserver/enums/items/EtcItemType;
       190: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       193: dup
       194: ldc           #119                // String CROP
       196: bipush        14
       198: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field CROP:Lext/mods/gameserver/enums/items/EtcItemType;
       204: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       207: dup
       208: ldc           #120                // String MATURECROP
       210: bipush        15
       212: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field MATURECROP:Lext/mods/gameserver/enums/items/EtcItemType;
       218: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       221: dup
       222: ldc           #121                // String HARVEST
       224: bipush        16
       226: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       229: putstatic     #52                 // Field HARVEST:Lext/mods/gameserver/enums/items/EtcItemType;
       232: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       235: dup
       236: ldc           #122                // String SEED2
       238: bipush        17
       240: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       243: putstatic     #55                 // Field SEED2:Lext/mods/gameserver/enums/items/EtcItemType;
       246: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       249: dup
       250: ldc           #123                // String TICKET_OF_LORD
       252: bipush        18
       254: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       257: putstatic     #58                 // Field TICKET_OF_LORD:Lext/mods/gameserver/enums/items/EtcItemType;
       260: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       263: dup
       264: ldc           #124                // String LURE
       266: bipush        19
       268: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       271: putstatic     #61                 // Field LURE:Lext/mods/gameserver/enums/items/EtcItemType;
       274: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       277: dup
       278: ldc           #125                // String BLESS_SCRL_ENCHANT_WP
       280: bipush        20
       282: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       285: putstatic     #64                 // Field BLESS_SCRL_ENCHANT_WP:Lext/mods/gameserver/enums/items/EtcItemType;
       288: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       291: dup
       292: ldc           #126                // String BLESS_SCRL_ENCHANT_AM
       294: bipush        21
       296: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       299: putstatic     #67                 // Field BLESS_SCRL_ENCHANT_AM:Lext/mods/gameserver/enums/items/EtcItemType;
       302: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       305: dup
       306: ldc           #127                // String COUPON
       308: bipush        22
       310: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       313: putstatic     #70                 // Field COUPON:Lext/mods/gameserver/enums/items/EtcItemType;
       316: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       319: dup
       320: ldc           #128                // String ELIXIR
       322: bipush        23
       324: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       327: putstatic     #73                 // Field ELIXIR:Lext/mods/gameserver/enums/items/EtcItemType;
       330: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       333: dup
       334: ldc           #129                // String SHOT
       336: bipush        24
       338: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       341: putstatic     #76                 // Field SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
       344: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       347: dup
       348: ldc           #130                // String HERB
       350: bipush        25
       352: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       355: putstatic     #79                 // Field HERB:Lext/mods/gameserver/enums/items/EtcItemType;
       358: new           #1                  // class ext/mods/gameserver/enums/items/EtcItemType
       361: dup
       362: ldc           #131                // String QUEST
       364: bipush        26
       366: invokespecial #105                // Method "<init>":(Ljava/lang/String;I)V
       369: putstatic     #82                 // Field QUEST:Lext/mods/gameserver/enums/items/EtcItemType;
       372: invokestatic  #132                // Method $values:()[Lext/mods/gameserver/enums/items/EtcItemType;
       375: putstatic     #85                 // Field $VALUES:[Lext/mods/gameserver/enums/items/EtcItemType;
       378: return
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
        line 45: 316
        line 47: 330
        line 48: 344
        line 49: 358
        line 20: 372
}
Signature: #152                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/items/EtcItemType;>;Lext/mods/gameserver/enums/items/ItemType;
SourceFile: "EtcItemType.java"
