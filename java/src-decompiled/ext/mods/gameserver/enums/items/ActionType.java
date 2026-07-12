// Bytecode for: ext.mods.gameserver.enums.items.ActionType
// File: ext\mods\gameserver\enums\items\ActionType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/items/ActionType.class
  Last modified 9 de jul de 2026; size 2583 bytes
  MD5 checksum bf2443a669be6407a1c7ad5c91c07d94
  Compiled from "ActionType.java"
public final class ext.mods.gameserver.enums.items.ActionType extends java.lang.Enum<ext.mods.gameserver.enums.items.ActionType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/items/ActionType
  super_class: #92                        // java/lang/Enum
  interfaces: 0, fields: 27, methods: 5, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/items/ActionType
    #2 = Utf8               ext/mods/gameserver/enums/items/ActionType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/items/ActionType.calc:Lext/mods/gameserver/enums/items/ActionType;
    #4 = NameAndType        #5:#6         // calc:Lext/mods/gameserver/enums/items/ActionType;
    #5 = Utf8               calc
    #6 = Utf8               Lext/mods/gameserver/enums/items/ActionType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/items/ActionType.call_skill:Lext/mods/gameserver/enums/items/ActionType;
    #8 = NameAndType        #9:#6         // call_skill:Lext/mods/gameserver/enums/items/ActionType;
    #9 = Utf8               call_skill
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/items/ActionType.capsule:Lext/mods/gameserver/enums/items/ActionType;
   #11 = NameAndType        #12:#6        // capsule:Lext/mods/gameserver/enums/items/ActionType;
   #12 = Utf8               capsule
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/items/ActionType.create_mpcc:Lext/mods/gameserver/enums/items/ActionType;
   #14 = NameAndType        #15:#6        // create_mpcc:Lext/mods/gameserver/enums/items/ActionType;
   #15 = Utf8               create_mpcc
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/items/ActionType.dice:Lext/mods/gameserver/enums/items/ActionType;
   #17 = NameAndType        #18:#6        // dice:Lext/mods/gameserver/enums/items/ActionType;
   #18 = Utf8               dice
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/items/ActionType.equip:Lext/mods/gameserver/enums/items/ActionType;
   #20 = NameAndType        #21:#6        // equip:Lext/mods/gameserver/enums/items/ActionType;
   #21 = Utf8               equip
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/items/ActionType.fishingshot:Lext/mods/gameserver/enums/items/ActionType;
   #23 = NameAndType        #24:#6        // fishingshot:Lext/mods/gameserver/enums/items/ActionType;
   #24 = Utf8               fishingshot
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/items/ActionType.harvest:Lext/mods/gameserver/enums/items/ActionType;
   #26 = NameAndType        #27:#6        // harvest:Lext/mods/gameserver/enums/items/ActionType;
   #27 = Utf8               harvest
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/items/ActionType.hide_name:Lext/mods/gameserver/enums/items/ActionType;
   #29 = NameAndType        #30:#6        // hide_name:Lext/mods/gameserver/enums/items/ActionType;
   #30 = Utf8               hide_name
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/items/ActionType.keep_exp:Lext/mods/gameserver/enums/items/ActionType;
   #32 = NameAndType        #33:#6        // keep_exp:Lext/mods/gameserver/enums/items/ActionType;
   #33 = Utf8               keep_exp
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/items/ActionType.nick_color:Lext/mods/gameserver/enums/items/ActionType;
   #35 = NameAndType        #36:#6        // nick_color:Lext/mods/gameserver/enums/items/ActionType;
   #36 = Utf8               nick_color
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/items/ActionType.none:Lext/mods/gameserver/enums/items/ActionType;
   #38 = NameAndType        #39:#6        // none:Lext/mods/gameserver/enums/items/ActionType;
   #39 = Utf8               none
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/items/ActionType.peel:Lext/mods/gameserver/enums/items/ActionType;
   #41 = NameAndType        #42:#6        // peel:Lext/mods/gameserver/enums/items/ActionType;
   #42 = Utf8               peel
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/items/ActionType.recipe:Lext/mods/gameserver/enums/items/ActionType;
   #44 = NameAndType        #45:#6        // recipe:Lext/mods/gameserver/enums/items/ActionType;
   #45 = Utf8               recipe
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/items/ActionType.seed:Lext/mods/gameserver/enums/items/ActionType;
   #47 = NameAndType        #48:#6        // seed:Lext/mods/gameserver/enums/items/ActionType;
   #48 = Utf8               seed
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/items/ActionType.show_adventurer_guide_book:Lext/mods/gameserver/enums/items/ActionType;
   #50 = NameAndType        #51:#6        // show_adventurer_guide_book:Lext/mods/gameserver/enums/items/ActionType;
   #51 = Utf8               show_adventurer_guide_book
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/items/ActionType.show_html:Lext/mods/gameserver/enums/items/ActionType;
   #53 = NameAndType        #54:#6        // show_html:Lext/mods/gameserver/enums/items/ActionType;
   #54 = Utf8               show_html
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/items/ActionType.show_ssq_status:Lext/mods/gameserver/enums/items/ActionType;
   #56 = NameAndType        #57:#6        // show_ssq_status:Lext/mods/gameserver/enums/items/ActionType;
   #57 = Utf8               show_ssq_status
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/items/ActionType.skill_maintain:Lext/mods/gameserver/enums/items/ActionType;
   #59 = NameAndType        #60:#6        // skill_maintain:Lext/mods/gameserver/enums/items/ActionType;
   #60 = Utf8               skill_maintain
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/items/ActionType.skill_reduce:Lext/mods/gameserver/enums/items/ActionType;
   #62 = NameAndType        #63:#6        // skill_reduce:Lext/mods/gameserver/enums/items/ActionType;
   #63 = Utf8               skill_reduce
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/items/ActionType.soulshot:Lext/mods/gameserver/enums/items/ActionType;
   #65 = NameAndType        #66:#6        // soulshot:Lext/mods/gameserver/enums/items/ActionType;
   #66 = Utf8               soulshot
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/items/ActionType.spiritshot:Lext/mods/gameserver/enums/items/ActionType;
   #68 = NameAndType        #69:#6        // spiritshot:Lext/mods/gameserver/enums/items/ActionType;
   #69 = Utf8               spiritshot
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/items/ActionType.start_quest:Lext/mods/gameserver/enums/items/ActionType;
   #71 = NameAndType        #72:#6        // start_quest:Lext/mods/gameserver/enums/items/ActionType;
   #72 = Utf8               start_quest
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/items/ActionType.summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
   #74 = NameAndType        #75:#6        // summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
   #75 = Utf8               summon_soulshot
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/items/ActionType.summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
   #77 = NameAndType        #78:#6        // summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
   #78 = Utf8               summon_spiritshot
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/items/ActionType.xmas_open:Lext/mods/gameserver/enums/items/ActionType;
   #80 = NameAndType        #81:#6        // xmas_open:Lext/mods/gameserver/enums/items/ActionType;
   #81 = Utf8               xmas_open
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/items/ActionType.$VALUES:[Lext/mods/gameserver/enums/items/ActionType;
   #83 = NameAndType        #84:#85       // $VALUES:[Lext/mods/gameserver/enums/items/ActionType;
   #84 = Utf8               $VALUES
   #85 = Utf8               [Lext/mods/gameserver/enums/items/ActionType;
   #86 = Methodref          #87.#88       // "[Lext/mods/gameserver/enums/items/ActionType;".clone:()Ljava/lang/Object;
   #87 = Class              #85           // "[Lext/mods/gameserver/enums/items/ActionType;"
   #88 = NameAndType        #89:#90       // clone:()Ljava/lang/Object;
   #89 = Utf8               clone
   #90 = Utf8               ()Ljava/lang/Object;
   #91 = Methodref          #92.#93       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #92 = Class              #94           // java/lang/Enum
   #93 = NameAndType        #95:#96       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #94 = Utf8               java/lang/Enum
   #95 = Utf8               valueOf
   #96 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #97 = Methodref          #92.#98       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #98 = NameAndType        #99:#100      // "<init>":(Ljava/lang/String;I)V
   #99 = Utf8               <init>
  #100 = Utf8               (Ljava/lang/String;I)V
  #101 = String             #5            // calc
  #102 = Methodref          #1.#98        // ext/mods/gameserver/enums/items/ActionType."<init>":(Ljava/lang/String;I)V
  #103 = String             #9            // call_skill
  #104 = String             #12           // capsule
  #105 = String             #15           // create_mpcc
  #106 = String             #18           // dice
  #107 = String             #21           // equip
  #108 = String             #24           // fishingshot
  #109 = String             #27           // harvest
  #110 = String             #30           // hide_name
  #111 = String             #33           // keep_exp
  #112 = String             #36           // nick_color
  #113 = String             #39           // none
  #114 = String             #42           // peel
  #115 = String             #45           // recipe
  #116 = String             #48           // seed
  #117 = String             #51           // show_adventurer_guide_book
  #118 = String             #54           // show_html
  #119 = String             #57           // show_ssq_status
  #120 = String             #60           // skill_maintain
  #121 = String             #63           // skill_reduce
  #122 = String             #66           // soulshot
  #123 = String             #69           // spiritshot
  #124 = String             #72           // start_quest
  #125 = String             #75           // summon_soulshot
  #126 = String             #78           // summon_spiritshot
  #127 = String             #81           // xmas_open
  #128 = Methodref          #1.#129       // ext/mods/gameserver/enums/items/ActionType.$values:()[Lext/mods/gameserver/enums/items/ActionType;
  #129 = NameAndType        #130:#131     // $values:()[Lext/mods/gameserver/enums/items/ActionType;
  #130 = Utf8               $values
  #131 = Utf8               ()[Lext/mods/gameserver/enums/items/ActionType;
  #132 = Utf8               values
  #133 = Utf8               Code
  #134 = Utf8               LineNumberTable
  #135 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ActionType;
  #136 = Utf8               LocalVariableTable
  #137 = Utf8               name
  #138 = Utf8               Ljava/lang/String;
  #139 = Utf8               MethodParameters
  #140 = Utf8               this
  #141 = Utf8               Signature
  #142 = Utf8               ()V
  #143 = Utf8               <clinit>
  #144 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/items/ActionType;>;
  #145 = Utf8               SourceFile
  #146 = Utf8               ActionType.java
{
  public static final ext.mods.gameserver.enums.items.ActionType calc;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType call_skill;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType capsule;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType create_mpcc;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType dice;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType equip;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType fishingshot;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType harvest;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType hide_name;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType keep_exp;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType nick_color;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType none;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType peel;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType recipe;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType seed;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType show_adventurer_guide_book;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType show_html;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType show_ssq_status;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType skill_maintain;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType skill_reduce;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType soulshot;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType spiritshot;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType start_quest;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType summon_soulshot;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType summon_spiritshot;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ActionType xmas_open;
    descriptor: Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.items.ActionType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #82                 // Field $VALUES:[Lext/mods/gameserver/enums/items/ActionType;
         3: invokevirtual #86                 // Method "[Lext/mods/gameserver/enums/items/ActionType;".clone:()Ljava/lang/Object;
         6: checkcast     #87                 // class "[Lext/mods/gameserver/enums/items/ActionType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.items.ActionType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/items/ActionType
         2: aload_0
         3: invokestatic  #91                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/items/ActionType
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
         0: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
         3: dup
         4: ldc           #101                // String calc
         6: iconst_0
         7: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field calc:Lext/mods/gameserver/enums/items/ActionType;
        13: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
        16: dup
        17: ldc           #103                // String call_skill
        19: iconst_1
        20: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field call_skill:Lext/mods/gameserver/enums/items/ActionType;
        26: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
        29: dup
        30: ldc           #104                // String capsule
        32: iconst_2
        33: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field capsule:Lext/mods/gameserver/enums/items/ActionType;
        39: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
        42: dup
        43: ldc           #105                // String create_mpcc
        45: iconst_3
        46: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field create_mpcc:Lext/mods/gameserver/enums/items/ActionType;
        52: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
        55: dup
        56: ldc           #106                // String dice
        58: iconst_4
        59: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field dice:Lext/mods/gameserver/enums/items/ActionType;
        65: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
        68: dup
        69: ldc           #107                // String equip
        71: iconst_5
        72: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field equip:Lext/mods/gameserver/enums/items/ActionType;
        78: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
        81: dup
        82: ldc           #108                // String fishingshot
        84: bipush        6
        86: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field fishingshot:Lext/mods/gameserver/enums/items/ActionType;
        92: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
        95: dup
        96: ldc           #109                // String harvest
        98: bipush        7
       100: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field harvest:Lext/mods/gameserver/enums/items/ActionType;
       106: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       109: dup
       110: ldc           #110                // String hide_name
       112: bipush        8
       114: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field hide_name:Lext/mods/gameserver/enums/items/ActionType;
       120: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       123: dup
       124: ldc           #111                // String keep_exp
       126: bipush        9
       128: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field keep_exp:Lext/mods/gameserver/enums/items/ActionType;
       134: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       137: dup
       138: ldc           #112                // String nick_color
       140: bipush        10
       142: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field nick_color:Lext/mods/gameserver/enums/items/ActionType;
       148: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       151: dup
       152: ldc           #113                // String none
       154: bipush        11
       156: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field none:Lext/mods/gameserver/enums/items/ActionType;
       162: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       165: dup
       166: ldc           #114                // String peel
       168: bipush        12
       170: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field peel:Lext/mods/gameserver/enums/items/ActionType;
       176: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       179: dup
       180: ldc           #115                // String recipe
       182: bipush        13
       184: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field recipe:Lext/mods/gameserver/enums/items/ActionType;
       190: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       193: dup
       194: ldc           #116                // String seed
       196: bipush        14
       198: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field seed:Lext/mods/gameserver/enums/items/ActionType;
       204: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       207: dup
       208: ldc           #117                // String show_adventurer_guide_book
       210: bipush        15
       212: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field show_adventurer_guide_book:Lext/mods/gameserver/enums/items/ActionType;
       218: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       221: dup
       222: ldc           #118                // String show_html
       224: bipush        16
       226: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       229: putstatic     #52                 // Field show_html:Lext/mods/gameserver/enums/items/ActionType;
       232: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       235: dup
       236: ldc           #119                // String show_ssq_status
       238: bipush        17
       240: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       243: putstatic     #55                 // Field show_ssq_status:Lext/mods/gameserver/enums/items/ActionType;
       246: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       249: dup
       250: ldc           #120                // String skill_maintain
       252: bipush        18
       254: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       257: putstatic     #58                 // Field skill_maintain:Lext/mods/gameserver/enums/items/ActionType;
       260: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       263: dup
       264: ldc           #121                // String skill_reduce
       266: bipush        19
       268: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       271: putstatic     #61                 // Field skill_reduce:Lext/mods/gameserver/enums/items/ActionType;
       274: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       277: dup
       278: ldc           #122                // String soulshot
       280: bipush        20
       282: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       285: putstatic     #64                 // Field soulshot:Lext/mods/gameserver/enums/items/ActionType;
       288: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       291: dup
       292: ldc           #123                // String spiritshot
       294: bipush        21
       296: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       299: putstatic     #67                 // Field spiritshot:Lext/mods/gameserver/enums/items/ActionType;
       302: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       305: dup
       306: ldc           #124                // String start_quest
       308: bipush        22
       310: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       313: putstatic     #70                 // Field start_quest:Lext/mods/gameserver/enums/items/ActionType;
       316: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       319: dup
       320: ldc           #125                // String summon_soulshot
       322: bipush        23
       324: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       327: putstatic     #73                 // Field summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
       330: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       333: dup
       334: ldc           #126                // String summon_spiritshot
       336: bipush        24
       338: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       341: putstatic     #76                 // Field summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
       344: new           #1                  // class ext/mods/gameserver/enums/items/ActionType
       347: dup
       348: ldc           #127                // String xmas_open
       350: bipush        25
       352: invokespecial #102                // Method "<init>":(Ljava/lang/String;I)V
       355: putstatic     #79                 // Field xmas_open:Lext/mods/gameserver/enums/items/ActionType;
       358: invokestatic  #128                // Method $values:()[Lext/mods/gameserver/enums/items/ActionType;
       361: putstatic     #82                 // Field $VALUES:[Lext/mods/gameserver/enums/items/ActionType;
       364: return
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
        line 46: 330
        line 47: 344
        line 20: 358
}
Signature: #144                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/items/ActionType;>;
SourceFile: "ActionType.java"
