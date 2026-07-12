// Bytecode for: ext.mods.gameserver.enums.FloodProtector
// File: ext\mods\gameserver\enums\FloodProtector.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/FloodProtector.class
  Last modified 9 de jul de 2026; size 2992 bytes
  MD5 checksum 00680e80e874dff8954ab94ffa7c13a4
  Compiled from "FloodProtector.java"
public final class ext.mods.gameserver.enums.FloodProtector extends java.lang.Enum<ext.mods.gameserver.enums.FloodProtector>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/FloodProtector
  super_class: #65                        // java/lang/Enum
  interfaces: 0, fields: 21, methods: 7, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/FloodProtector
    #2 = Utf8               ext/mods/gameserver/enums/FloodProtector
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/FloodProtector.ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
    #4 = NameAndType        #5:#6         // ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
    #5 = Utf8               ROLL_DICE
    #6 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/FloodProtector.HERO_VOICE:Lext/mods/gameserver/enums/FloodProtector;
    #8 = NameAndType        #9:#6         // HERO_VOICE:Lext/mods/gameserver/enums/FloodProtector;
    #9 = Utf8               HERO_VOICE
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/FloodProtector.SUBCLASS:Lext/mods/gameserver/enums/FloodProtector;
   #11 = NameAndType        #12:#6        // SUBCLASS:Lext/mods/gameserver/enums/FloodProtector;
   #12 = Utf8               SUBCLASS
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/FloodProtector.DROP_ITEM:Lext/mods/gameserver/enums/FloodProtector;
   #14 = NameAndType        #15:#6        // DROP_ITEM:Lext/mods/gameserver/enums/FloodProtector;
   #15 = Utf8               DROP_ITEM
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/FloodProtector.SERVER_BYPASS:Lext/mods/gameserver/enums/FloodProtector;
   #17 = NameAndType        #18:#6        // SERVER_BYPASS:Lext/mods/gameserver/enums/FloodProtector;
   #18 = Utf8               SERVER_BYPASS
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/FloodProtector.MULTISELL:Lext/mods/gameserver/enums/FloodProtector;
   #20 = NameAndType        #21:#6        // MULTISELL:Lext/mods/gameserver/enums/FloodProtector;
   #21 = Utf8               MULTISELL
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/FloodProtector.MANUFACTURE:Lext/mods/gameserver/enums/FloodProtector;
   #23 = NameAndType        #24:#6        // MANUFACTURE:Lext/mods/gameserver/enums/FloodProtector;
   #24 = Utf8               MANUFACTURE
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/FloodProtector.MANOR:Lext/mods/gameserver/enums/FloodProtector;
   #26 = NameAndType        #27:#6        // MANOR:Lext/mods/gameserver/enums/FloodProtector;
   #27 = Utf8               MANOR
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/FloodProtector.SENDMAIL:Lext/mods/gameserver/enums/FloodProtector;
   #29 = NameAndType        #30:#6        // SENDMAIL:Lext/mods/gameserver/enums/FloodProtector;
   #30 = Utf8               SENDMAIL
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/FloodProtector.CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
   #32 = NameAndType        #33:#6        // CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
   #33 = Utf8               CHARACTER_SELECT
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/FloodProtector.GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #35 = NameAndType        #36:#6        // GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #36 = Utf8               GLOBAL_CHAT
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/FloodProtector.TRADE_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #38 = NameAndType        #39:#6        // TRADE_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #39 = Utf8               TRADE_CHAT
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/FloodProtector.SOCIAL:Lext/mods/gameserver/enums/FloodProtector;
   #41 = NameAndType        #42:#6        // SOCIAL:Lext/mods/gameserver/enums/FloodProtector;
   #42 = Utf8               SOCIAL
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/FloodProtector.USE_ITEM:Lext/mods/gameserver/enums/FloodProtector;
   #44 = NameAndType        #45:#6        // USE_ITEM:Lext/mods/gameserver/enums/FloodProtector;
   #45 = Utf8               USE_ITEM
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/FloodProtector.ACTION:Lext/mods/gameserver/enums/FloodProtector;
   #47 = NameAndType        #48:#6        // ACTION:Lext/mods/gameserver/enums/FloodProtector;
   #48 = Utf8               ACTION
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/FloodProtector.DONATION_PAY:Lext/mods/gameserver/enums/FloodProtector;
   #50 = NameAndType        #51:#6        // DONATION_PAY:Lext/mods/gameserver/enums/FloodProtector;
   #51 = Utf8               DONATION_PAY
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/FloodProtector.DONATION_CHECK:Lext/mods/gameserver/enums/FloodProtector;
   #53 = NameAndType        #54:#6        // DONATION_CHECK:Lext/mods/gameserver/enums/FloodProtector;
   #54 = Utf8               DONATION_CHECK
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/FloodProtector.$VALUES:[Lext/mods/gameserver/enums/FloodProtector;
   #56 = NameAndType        #57:#58       // $VALUES:[Lext/mods/gameserver/enums/FloodProtector;
   #57 = Utf8               $VALUES
   #58 = Utf8               [Lext/mods/gameserver/enums/FloodProtector;
   #59 = Methodref          #60.#61       // "[Lext/mods/gameserver/enums/FloodProtector;".clone:()Ljava/lang/Object;
   #60 = Class              #58           // "[Lext/mods/gameserver/enums/FloodProtector;"
   #61 = NameAndType        #62:#63       // clone:()Ljava/lang/Object;
   #62 = Utf8               clone
   #63 = Utf8               ()Ljava/lang/Object;
   #64 = Methodref          #65.#66       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #65 = Class              #67           // java/lang/Enum
   #66 = NameAndType        #68:#69       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #67 = Utf8               java/lang/Enum
   #68 = Utf8               valueOf
   #69 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #70 = Methodref          #65.#71       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #71 = NameAndType        #72:#73       // "<init>":(Ljava/lang/String;I)V
   #72 = Utf8               <init>
   #73 = Utf8               (Ljava/lang/String;I)V
   #74 = Fieldref           #1.#75        // ext/mods/gameserver/enums/FloodProtector._id:I
   #75 = NameAndType        #76:#77       // _id:I
   #76 = Utf8               _id
   #77 = Utf8               I
   #78 = Fieldref           #1.#79        // ext/mods/gameserver/enums/FloodProtector._reuseDelay:I
   #79 = NameAndType        #80:#77       // _reuseDelay:I
   #80 = Utf8               _reuseDelay
   #81 = String             #5            // ROLL_DICE
   #82 = Fieldref           #83.#84       // ext/mods/Config.ROLL_DICE_TIME:I
   #83 = Class              #85           // ext/mods/Config
   #84 = NameAndType        #86:#77       // ROLL_DICE_TIME:I
   #85 = Utf8               ext/mods/Config
   #86 = Utf8               ROLL_DICE_TIME
   #87 = Methodref          #1.#88        // ext/mods/gameserver/enums/FloodProtector."<init>":(Ljava/lang/String;III)V
   #88 = NameAndType        #72:#89       // "<init>":(Ljava/lang/String;III)V
   #89 = Utf8               (Ljava/lang/String;III)V
   #90 = String             #9            // HERO_VOICE
   #91 = Fieldref           #83.#92       // ext/mods/Config.HERO_VOICE_TIME:I
   #92 = NameAndType        #93:#77       // HERO_VOICE_TIME:I
   #93 = Utf8               HERO_VOICE_TIME
   #94 = String             #12           // SUBCLASS
   #95 = Fieldref           #83.#96       // ext/mods/Config.SUBCLASS_TIME:I
   #96 = NameAndType        #97:#77       // SUBCLASS_TIME:I
   #97 = Utf8               SUBCLASS_TIME
   #98 = String             #15           // DROP_ITEM
   #99 = Fieldref           #83.#100      // ext/mods/Config.DROP_ITEM_TIME:I
  #100 = NameAndType        #101:#77      // DROP_ITEM_TIME:I
  #101 = Utf8               DROP_ITEM_TIME
  #102 = String             #18           // SERVER_BYPASS
  #103 = Fieldref           #83.#104      // ext/mods/Config.SERVER_BYPASS_TIME:I
  #104 = NameAndType        #105:#77      // SERVER_BYPASS_TIME:I
  #105 = Utf8               SERVER_BYPASS_TIME
  #106 = String             #21           // MULTISELL
  #107 = Fieldref           #83.#108      // ext/mods/Config.MULTISELL_TIME:I
  #108 = NameAndType        #109:#77      // MULTISELL_TIME:I
  #109 = Utf8               MULTISELL_TIME
  #110 = String             #24           // MANUFACTURE
  #111 = Fieldref           #83.#112      // ext/mods/Config.MANUFACTURE_TIME:I
  #112 = NameAndType        #113:#77      // MANUFACTURE_TIME:I
  #113 = Utf8               MANUFACTURE_TIME
  #114 = String             #27           // MANOR
  #115 = Fieldref           #83.#116      // ext/mods/Config.MANOR_TIME:I
  #116 = NameAndType        #117:#77      // MANOR_TIME:I
  #117 = Utf8               MANOR_TIME
  #118 = String             #30           // SENDMAIL
  #119 = Fieldref           #83.#120      // ext/mods/Config.SENDMAIL_TIME:I
  #120 = NameAndType        #121:#77      // SENDMAIL_TIME:I
  #121 = Utf8               SENDMAIL_TIME
  #122 = String             #33           // CHARACTER_SELECT
  #123 = Fieldref           #83.#124      // ext/mods/Config.CHARACTER_SELECT_TIME:I
  #124 = NameAndType        #125:#77      // CHARACTER_SELECT_TIME:I
  #125 = Utf8               CHARACTER_SELECT_TIME
  #126 = String             #36           // GLOBAL_CHAT
  #127 = Fieldref           #83.#128      // ext/mods/Config.GLOBAL_CHAT_TIME:I
  #128 = NameAndType        #129:#77      // GLOBAL_CHAT_TIME:I
  #129 = Utf8               GLOBAL_CHAT_TIME
  #130 = String             #39           // TRADE_CHAT
  #131 = Fieldref           #83.#132      // ext/mods/Config.TRADE_CHAT_TIME:I
  #132 = NameAndType        #133:#77      // TRADE_CHAT_TIME:I
  #133 = Utf8               TRADE_CHAT_TIME
  #134 = String             #42           // SOCIAL
  #135 = Fieldref           #83.#136      // ext/mods/Config.SOCIAL_TIME:I
  #136 = NameAndType        #137:#77      // SOCIAL_TIME:I
  #137 = Utf8               SOCIAL_TIME
  #138 = String             #45           // USE_ITEM
  #139 = Fieldref           #83.#140      // ext/mods/Config.ITEM_TIME:I
  #140 = NameAndType        #141:#77      // ITEM_TIME:I
  #141 = Utf8               ITEM_TIME
  #142 = String             #48           // ACTION
  #143 = Fieldref           #83.#144      // ext/mods/Config.ACTION_TIME:I
  #144 = NameAndType        #145:#77      // ACTION_TIME:I
  #145 = Utf8               ACTION_TIME
  #146 = String             #51           // DONATION_PAY
  #147 = Fieldref           #83.#148      // ext/mods/Config.DONATION_PAY_TIME:I
  #148 = NameAndType        #149:#77      // DONATION_PAY_TIME:I
  #149 = Utf8               DONATION_PAY_TIME
  #150 = String             #54           // DONATION_CHECK
  #151 = Fieldref           #83.#152      // ext/mods/Config.DONATION_CHECK_TIME:I
  #152 = NameAndType        #153:#77      // DONATION_CHECK_TIME:I
  #153 = Utf8               DONATION_CHECK_TIME
  #154 = Methodref          #1.#155       // ext/mods/gameserver/enums/FloodProtector.$values:()[Lext/mods/gameserver/enums/FloodProtector;
  #155 = NameAndType        #156:#157     // $values:()[Lext/mods/gameserver/enums/FloodProtector;
  #156 = Utf8               $values
  #157 = Utf8               ()[Lext/mods/gameserver/enums/FloodProtector;
  #158 = Methodref          #1.#159       // ext/mods/gameserver/enums/FloodProtector.values:()[Lext/mods/gameserver/enums/FloodProtector;
  #159 = NameAndType        #160:#157     // values:()[Lext/mods/gameserver/enums/FloodProtector;
  #160 = Utf8               values
  #161 = Fieldref           #1.#162       // ext/mods/gameserver/enums/FloodProtector.VALUES_LENGTH:I
  #162 = NameAndType        #163:#77      // VALUES_LENGTH:I
  #163 = Utf8               VALUES_LENGTH
  #164 = Utf8               Code
  #165 = Utf8               LineNumberTable
  #166 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/FloodProtector;
  #167 = Utf8               LocalVariableTable
  #168 = Utf8               name
  #169 = Utf8               Ljava/lang/String;
  #170 = Utf8               MethodParameters
  #171 = Utf8               this
  #172 = Utf8               id
  #173 = Utf8               reuseDelay
  #174 = Utf8               Signature
  #175 = Utf8               (II)V
  #176 = Utf8               getId
  #177 = Utf8               ()I
  #178 = Utf8               getReuseDelay
  #179 = Utf8               <clinit>
  #180 = Utf8               ()V
  #181 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/FloodProtector;>;
  #182 = Utf8               SourceFile
  #183 = Utf8               FloodProtector.java
{
  public static final ext.mods.gameserver.enums.FloodProtector ROLL_DICE;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector HERO_VOICE;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector SUBCLASS;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector DROP_ITEM;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector SERVER_BYPASS;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector MULTISELL;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector MANUFACTURE;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector MANOR;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector SENDMAIL;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector CHARACTER_SELECT;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector GLOBAL_CHAT;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector TRADE_CHAT;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector SOCIAL;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector USE_ITEM;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector ACTION;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector DONATION_PAY;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FloodProtector DONATION_CHECK;
    descriptor: Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final int VALUES_LENGTH;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.FloodProtector[] values();
    descriptor: ()[Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #55                 // Field $VALUES:[Lext/mods/gameserver/enums/FloodProtector;
         3: invokevirtual #59                 // Method "[Lext/mods/gameserver/enums/FloodProtector;".clone:()Ljava/lang/Object;
         6: checkcast     #60                 // class "[Lext/mods/gameserver/enums/FloodProtector;"
         9: areturn
      LineNumberTable:
        line 22: 0

  public static ext.mods.gameserver.enums.FloodProtector valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/FloodProtector;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/FloodProtector
         2: aload_0
         3: invokestatic  #64                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/FloodProtector
         9: areturn
      LineNumberTable:
        line 22: 0
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
         1: getfield      #74                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/FloodProtector;

  public int getReuseDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _reuseDelay:I
         4: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/FloodProtector;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
         3: dup
         4: ldc           #81                 // String ROLL_DICE
         6: iconst_0
         7: iconst_0
         8: getstatic     #82                 // Field ext/mods/Config.ROLL_DICE_TIME:I
        11: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
        14: putstatic     #3                  // Field ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
        17: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
        20: dup
        21: ldc           #90                 // String HERO_VOICE
        23: iconst_1
        24: iconst_1
        25: getstatic     #91                 // Field ext/mods/Config.HERO_VOICE_TIME:I
        28: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
        31: putstatic     #7                  // Field HERO_VOICE:Lext/mods/gameserver/enums/FloodProtector;
        34: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
        37: dup
        38: ldc           #94                 // String SUBCLASS
        40: iconst_2
        41: iconst_2
        42: getstatic     #95                 // Field ext/mods/Config.SUBCLASS_TIME:I
        45: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
        48: putstatic     #10                 // Field SUBCLASS:Lext/mods/gameserver/enums/FloodProtector;
        51: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
        54: dup
        55: ldc           #98                 // String DROP_ITEM
        57: iconst_3
        58: iconst_3
        59: getstatic     #99                 // Field ext/mods/Config.DROP_ITEM_TIME:I
        62: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
        65: putstatic     #13                 // Field DROP_ITEM:Lext/mods/gameserver/enums/FloodProtector;
        68: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
        71: dup
        72: ldc           #102                // String SERVER_BYPASS
        74: iconst_4
        75: iconst_4
        76: getstatic     #103                // Field ext/mods/Config.SERVER_BYPASS_TIME:I
        79: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
        82: putstatic     #16                 // Field SERVER_BYPASS:Lext/mods/gameserver/enums/FloodProtector;
        85: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
        88: dup
        89: ldc           #106                // String MULTISELL
        91: iconst_5
        92: iconst_5
        93: getstatic     #107                // Field ext/mods/Config.MULTISELL_TIME:I
        96: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
        99: putstatic     #19                 // Field MULTISELL:Lext/mods/gameserver/enums/FloodProtector;
       102: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       105: dup
       106: ldc           #110                // String MANUFACTURE
       108: bipush        6
       110: bipush        6
       112: getstatic     #111                // Field ext/mods/Config.MANUFACTURE_TIME:I
       115: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       118: putstatic     #22                 // Field MANUFACTURE:Lext/mods/gameserver/enums/FloodProtector;
       121: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       124: dup
       125: ldc           #114                // String MANOR
       127: bipush        7
       129: bipush        7
       131: getstatic     #115                // Field ext/mods/Config.MANOR_TIME:I
       134: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       137: putstatic     #25                 // Field MANOR:Lext/mods/gameserver/enums/FloodProtector;
       140: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       143: dup
       144: ldc           #118                // String SENDMAIL
       146: bipush        8
       148: bipush        8
       150: getstatic     #119                // Field ext/mods/Config.SENDMAIL_TIME:I
       153: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       156: putstatic     #28                 // Field SENDMAIL:Lext/mods/gameserver/enums/FloodProtector;
       159: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       162: dup
       163: ldc           #122                // String CHARACTER_SELECT
       165: bipush        9
       167: bipush        9
       169: getstatic     #123                // Field ext/mods/Config.CHARACTER_SELECT_TIME:I
       172: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       175: putstatic     #31                 // Field CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
       178: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       181: dup
       182: ldc           #126                // String GLOBAL_CHAT
       184: bipush        10
       186: bipush        10
       188: getstatic     #127                // Field ext/mods/Config.GLOBAL_CHAT_TIME:I
       191: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       194: putstatic     #34                 // Field GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
       197: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       200: dup
       201: ldc           #130                // String TRADE_CHAT
       203: bipush        11
       205: bipush        11
       207: getstatic     #131                // Field ext/mods/Config.TRADE_CHAT_TIME:I
       210: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       213: putstatic     #37                 // Field TRADE_CHAT:Lext/mods/gameserver/enums/FloodProtector;
       216: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       219: dup
       220: ldc           #134                // String SOCIAL
       222: bipush        12
       224: bipush        12
       226: getstatic     #135                // Field ext/mods/Config.SOCIAL_TIME:I
       229: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       232: putstatic     #40                 // Field SOCIAL:Lext/mods/gameserver/enums/FloodProtector;
       235: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       238: dup
       239: ldc           #138                // String USE_ITEM
       241: bipush        13
       243: bipush        13
       245: getstatic     #139                // Field ext/mods/Config.ITEM_TIME:I
       248: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       251: putstatic     #43                 // Field USE_ITEM:Lext/mods/gameserver/enums/FloodProtector;
       254: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       257: dup
       258: ldc           #142                // String ACTION
       260: bipush        14
       262: bipush        14
       264: getstatic     #143                // Field ext/mods/Config.ACTION_TIME:I
       267: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       270: putstatic     #46                 // Field ACTION:Lext/mods/gameserver/enums/FloodProtector;
       273: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       276: dup
       277: ldc           #146                // String DONATION_PAY
       279: bipush        15
       281: bipush        15
       283: getstatic     #147                // Field ext/mods/Config.DONATION_PAY_TIME:I
       286: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       289: putstatic     #49                 // Field DONATION_PAY:Lext/mods/gameserver/enums/FloodProtector;
       292: new           #1                  // class ext/mods/gameserver/enums/FloodProtector
       295: dup
       296: ldc           #150                // String DONATION_CHECK
       298: bipush        16
       300: bipush        16
       302: getstatic     #151                // Field ext/mods/Config.DONATION_CHECK_TIME:I
       305: invokespecial #87                 // Method "<init>":(Ljava/lang/String;III)V
       308: putstatic     #52                 // Field DONATION_CHECK:Lext/mods/gameserver/enums/FloodProtector;
       311: invokestatic  #154                // Method $values:()[Lext/mods/gameserver/enums/FloodProtector;
       314: putstatic     #55                 // Field $VALUES:[Lext/mods/gameserver/enums/FloodProtector;
       317: invokestatic  #158                // Method values:()[Lext/mods/gameserver/enums/FloodProtector;
       320: arraylength
       321: putstatic     #161                // Field VALUES_LENGTH:I
       324: return
      LineNumberTable:
        line 24: 0
        line 25: 17
        line 26: 34
        line 27: 51
        line 28: 68
        line 29: 85
        line 30: 102
        line 31: 121
        line 32: 140
        line 33: 159
        line 34: 178
        line 35: 197
        line 36: 216
        line 37: 235
        line 38: 254
        line 39: 273
        line 40: 292
        line 22: 311
        line 61: 317
}
Signature: #181                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/FloodProtector;>;
SourceFile: "FloodProtector.java"
