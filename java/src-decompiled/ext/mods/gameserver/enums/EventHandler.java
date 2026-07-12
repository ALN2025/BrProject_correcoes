// Bytecode for: ext.mods.gameserver.enums.EventHandler
// File: ext\mods\gameserver\enums\EventHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/EventHandler.class
  Last modified 9 de jul de 2026; size 3010 bytes
  MD5 checksum 8fa5db53c0325363bd510417003060e6
  Compiled from "EventHandler.java"
public final class ext.mods.gameserver.enums.EventHandler extends java.lang.Enum<ext.mods.gameserver.enums.EventHandler>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/EventHandler
  super_class: #98                        // java/lang/Enum
  interfaces: 0, fields: 30, methods: 6, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/EventHandler
    #2 = Utf8               ext/mods/gameserver/enums/EventHandler
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/EventHandler.ABNORMAL_STATUS_CHANGED:Lext/mods/gameserver/enums/EventHandler;
    #4 = NameAndType        #5:#6         // ABNORMAL_STATUS_CHANGED:Lext/mods/gameserver/enums/EventHandler;
    #5 = Utf8               ABNORMAL_STATUS_CHANGED
    #6 = Utf8               Lext/mods/gameserver/enums/EventHandler;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/EventHandler.ATTACKED:Lext/mods/gameserver/enums/EventHandler;
    #8 = NameAndType        #9:#6         // ATTACKED:Lext/mods/gameserver/enums/EventHandler;
    #9 = Utf8               ATTACKED
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/EventHandler.ATTACK_FINISHED:Lext/mods/gameserver/enums/EventHandler;
   #11 = NameAndType        #12:#6        // ATTACK_FINISHED:Lext/mods/gameserver/enums/EventHandler;
   #12 = Utf8               ATTACK_FINISHED
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/EventHandler.CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #14 = NameAndType        #15:#6        // CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #15 = Utf8               CLAN_ATTACKED
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/EventHandler.CLAN_DIED:Lext/mods/gameserver/enums/EventHandler;
   #17 = NameAndType        #18:#6        // CLAN_DIED:Lext/mods/gameserver/enums/EventHandler;
   #18 = Utf8               CLAN_DIED
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/EventHandler.CREATED:Lext/mods/gameserver/enums/EventHandler;
   #20 = NameAndType        #21:#6        // CREATED:Lext/mods/gameserver/enums/EventHandler;
   #21 = Utf8               CREATED
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/EventHandler.DECAYED:Lext/mods/gameserver/enums/EventHandler;
   #23 = NameAndType        #24:#6        // DECAYED:Lext/mods/gameserver/enums/EventHandler;
   #24 = Utf8               DECAYED
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/EventHandler.FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
   #26 = NameAndType        #27:#6        // FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
   #27 = Utf8               FIRST_TALK
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/EventHandler.MOVE_TO_FINISHED:Lext/mods/gameserver/enums/EventHandler;
   #29 = NameAndType        #30:#6        // MOVE_TO_FINISHED:Lext/mods/gameserver/enums/EventHandler;
   #30 = Utf8               MOVE_TO_FINISHED
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/EventHandler.MY_DYING:Lext/mods/gameserver/enums/EventHandler;
   #32 = NameAndType        #33:#6        // MY_DYING:Lext/mods/gameserver/enums/EventHandler;
   #33 = Utf8               MY_DYING
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/EventHandler.NO_DESIRE:Lext/mods/gameserver/enums/EventHandler;
   #35 = NameAndType        #36:#6        // NO_DESIRE:Lext/mods/gameserver/enums/EventHandler;
   #36 = Utf8               NO_DESIRE
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/EventHandler.OUT_OF_TERRITORY:Lext/mods/gameserver/enums/EventHandler;
   #38 = NameAndType        #39:#6        // OUT_OF_TERRITORY:Lext/mods/gameserver/enums/EventHandler;
   #39 = Utf8               OUT_OF_TERRITORY
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #41 = NameAndType        #42:#6        // PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #42 = Utf8               PARTY_ATTACKED
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/EventHandler.PARTY_DIED:Lext/mods/gameserver/enums/EventHandler;
   #44 = NameAndType        #45:#6        // PARTY_DIED:Lext/mods/gameserver/enums/EventHandler;
   #45 = Utf8               PARTY_DIED
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/EventHandler.PICKED_ITEM:Lext/mods/gameserver/enums/EventHandler;
   #47 = NameAndType        #48:#6        // PICKED_ITEM:Lext/mods/gameserver/enums/EventHandler;
   #48 = Utf8               PICKED_ITEM
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/EventHandler.QUEST_START:Lext/mods/gameserver/enums/EventHandler;
   #50 = NameAndType        #51:#6        // QUEST_START:Lext/mods/gameserver/enums/EventHandler;
   #51 = Utf8               QUEST_START
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/EventHandler.SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
   #53 = NameAndType        #54:#6        // SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
   #54 = Utf8               SEE_CREATURE
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/EventHandler.SEE_ITEM:Lext/mods/gameserver/enums/EventHandler;
   #56 = NameAndType        #57:#6        // SEE_ITEM:Lext/mods/gameserver/enums/EventHandler;
   #57 = Utf8               SEE_ITEM
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/EventHandler.SEE_SPELL:Lext/mods/gameserver/enums/EventHandler;
   #59 = NameAndType        #60:#6        // SEE_SPELL:Lext/mods/gameserver/enums/EventHandler;
   #60 = Utf8               SEE_SPELL
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/EventHandler.SPELLED:Lext/mods/gameserver/enums/EventHandler;
   #62 = NameAndType        #63:#6        // SPELLED:Lext/mods/gameserver/enums/EventHandler;
   #63 = Utf8               SPELLED
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/EventHandler.STATIC_OBJECT_CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #65 = NameAndType        #66:#6        // STATIC_OBJECT_CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #66 = Utf8               STATIC_OBJECT_CLAN_ATTACKED
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/EventHandler.TALKED:Lext/mods/gameserver/enums/EventHandler;
   #68 = NameAndType        #69:#6        // TALKED:Lext/mods/gameserver/enums/EventHandler;
   #69 = Utf8               TALKED
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/EventHandler.USE_SKILL_FINISHED:Lext/mods/gameserver/enums/EventHandler;
   #71 = NameAndType        #72:#6        // USE_SKILL_FINISHED:Lext/mods/gameserver/enums/EventHandler;
   #72 = Utf8               USE_SKILL_FINISHED
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/EventHandler.ZONE_ENTER:Lext/mods/gameserver/enums/EventHandler;
   #74 = NameAndType        #75:#6        // ZONE_ENTER:Lext/mods/gameserver/enums/EventHandler;
   #75 = Utf8               ZONE_ENTER
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/EventHandler.ZONE_EXIT:Lext/mods/gameserver/enums/EventHandler;
   #77 = NameAndType        #78:#6        // ZONE_EXIT:Lext/mods/gameserver/enums/EventHandler;
   #78 = Utf8               ZONE_EXIT
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/EventHandler.SCRIPT_EVENT:Lext/mods/gameserver/enums/EventHandler;
   #80 = NameAndType        #81:#6        // SCRIPT_EVENT:Lext/mods/gameserver/enums/EventHandler;
   #81 = Utf8               SCRIPT_EVENT
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/EventHandler.AI_TALKED:Lext/mods/gameserver/enums/EventHandler;
   #83 = NameAndType        #84:#6        // AI_TALKED:Lext/mods/gameserver/enums/EventHandler;
   #84 = Utf8               AI_TALKED
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/EventHandler.AI_MENU_SELECTED:Lext/mods/gameserver/enums/EventHandler;
   #86 = NameAndType        #87:#6        // AI_MENU_SELECTED:Lext/mods/gameserver/enums/EventHandler;
   #87 = Utf8               AI_MENU_SELECTED
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/EventHandler.$VALUES:[Lext/mods/gameserver/enums/EventHandler;
   #89 = NameAndType        #90:#91       // $VALUES:[Lext/mods/gameserver/enums/EventHandler;
   #90 = Utf8               $VALUES
   #91 = Utf8               [Lext/mods/gameserver/enums/EventHandler;
   #92 = Methodref          #93.#94       // "[Lext/mods/gameserver/enums/EventHandler;".clone:()Ljava/lang/Object;
   #93 = Class              #91           // "[Lext/mods/gameserver/enums/EventHandler;"
   #94 = NameAndType        #95:#96       // clone:()Ljava/lang/Object;
   #95 = Utf8               clone
   #96 = Utf8               ()Ljava/lang/Object;
   #97 = Methodref          #98.#99       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #98 = Class              #100          // java/lang/Enum
   #99 = NameAndType        #101:#102     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #100 = Utf8               java/lang/Enum
  #101 = Utf8               valueOf
  #102 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #103 = Methodref          #98.#104      // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #104 = NameAndType        #105:#106     // "<init>":(Ljava/lang/String;I)V
  #105 = Utf8               <init>
  #106 = Utf8               (Ljava/lang/String;I)V
  #107 = Fieldref           #1.#108       // ext/mods/gameserver/enums/EventHandler._allowMultipleRegistration:Z
  #108 = NameAndType        #109:#110     // _allowMultipleRegistration:Z
  #109 = Utf8               _allowMultipleRegistration
  #110 = Utf8               Z
  #111 = String             #5            // ABNORMAL_STATUS_CHANGED
  #112 = Methodref          #1.#113       // ext/mods/gameserver/enums/EventHandler."<init>":(Ljava/lang/String;IZ)V
  #113 = NameAndType        #105:#114     // "<init>":(Ljava/lang/String;IZ)V
  #114 = Utf8               (Ljava/lang/String;IZ)V
  #115 = String             #9            // ATTACKED
  #116 = String             #12           // ATTACK_FINISHED
  #117 = String             #15           // CLAN_ATTACKED
  #118 = String             #18           // CLAN_DIED
  #119 = String             #21           // CREATED
  #120 = String             #24           // DECAYED
  #121 = String             #27           // FIRST_TALK
  #122 = String             #30           // MOVE_TO_FINISHED
  #123 = String             #33           // MY_DYING
  #124 = String             #36           // NO_DESIRE
  #125 = String             #39           // OUT_OF_TERRITORY
  #126 = String             #42           // PARTY_ATTACKED
  #127 = String             #45           // PARTY_DIED
  #128 = String             #48           // PICKED_ITEM
  #129 = String             #51           // QUEST_START
  #130 = String             #54           // SEE_CREATURE
  #131 = String             #57           // SEE_ITEM
  #132 = String             #60           // SEE_SPELL
  #133 = String             #63           // SPELLED
  #134 = String             #66           // STATIC_OBJECT_CLAN_ATTACKED
  #135 = String             #69           // TALKED
  #136 = String             #72           // USE_SKILL_FINISHED
  #137 = String             #75           // ZONE_ENTER
  #138 = String             #78           // ZONE_EXIT
  #139 = String             #81           // SCRIPT_EVENT
  #140 = String             #84           // AI_TALKED
  #141 = String             #87           // AI_MENU_SELECTED
  #142 = Methodref          #1.#143       // ext/mods/gameserver/enums/EventHandler.$values:()[Lext/mods/gameserver/enums/EventHandler;
  #143 = NameAndType        #144:#145     // $values:()[Lext/mods/gameserver/enums/EventHandler;
  #144 = Utf8               $values
  #145 = Utf8               ()[Lext/mods/gameserver/enums/EventHandler;
  #146 = Utf8               values
  #147 = Utf8               Code
  #148 = Utf8               LineNumberTable
  #149 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/EventHandler;
  #150 = Utf8               LocalVariableTable
  #151 = Utf8               name
  #152 = Utf8               Ljava/lang/String;
  #153 = Utf8               MethodParameters
  #154 = Utf8               this
  #155 = Utf8               allowMultipleRegistration
  #156 = Utf8               Signature
  #157 = Utf8               (Z)V
  #158 = Utf8               isMultipleRegistrationAllowed
  #159 = Utf8               ()Z
  #160 = Utf8               <clinit>
  #161 = Utf8               ()V
  #162 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/EventHandler;>;
  #163 = Utf8               SourceFile
  #164 = Utf8               EventHandler.java
{
  public static final ext.mods.gameserver.enums.EventHandler ABNORMAL_STATUS_CHANGED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler ATTACKED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler ATTACK_FINISHED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler CLAN_ATTACKED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler CLAN_DIED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler CREATED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler DECAYED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler FIRST_TALK;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler MOVE_TO_FINISHED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler MY_DYING;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler NO_DESIRE;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler OUT_OF_TERRITORY;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler PARTY_ATTACKED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler PARTY_DIED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler PICKED_ITEM;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler QUEST_START;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler SEE_CREATURE;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler SEE_ITEM;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler SEE_SPELL;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler SPELLED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler STATIC_OBJECT_CLAN_ATTACKED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler TALKED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler USE_SKILL_FINISHED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler ZONE_ENTER;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler ZONE_EXIT;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler SCRIPT_EVENT;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler AI_TALKED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.EventHandler AI_MENU_SELECTED;
    descriptor: Lext/mods/gameserver/enums/EventHandler;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.EventHandler[] values();
    descriptor: ()[Lext/mods/gameserver/enums/EventHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #88                 // Field $VALUES:[Lext/mods/gameserver/enums/EventHandler;
         3: invokevirtual #92                 // Method "[Lext/mods/gameserver/enums/EventHandler;".clone:()Ljava/lang/Object;
         6: checkcast     #93                 // class "[Lext/mods/gameserver/enums/EventHandler;"
         9: areturn
      LineNumberTable:
        line 23: 0

  public static ext.mods.gameserver.enums.EventHandler valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/EventHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/EventHandler
         2: aload_0
         3: invokestatic  #97                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/EventHandler
         9: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public boolean isMultipleRegistrationAllowed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #107                // Field _allowMultipleRegistration:Z
         4: ireturn
      LineNumberTable:
        line 171: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/EventHandler;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/EventHandler
         3: dup
         4: ldc           #111                // String ABNORMAL_STATUS_CHANGED
         6: iconst_0
         7: iconst_1
         8: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
        11: putstatic     #3                  // Field ABNORMAL_STATUS_CHANGED:Lext/mods/gameserver/enums/EventHandler;
        14: new           #1                  // class ext/mods/gameserver/enums/EventHandler
        17: dup
        18: ldc           #115                // String ATTACKED
        20: iconst_1
        21: iconst_1
        22: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
        25: putstatic     #7                  // Field ATTACKED:Lext/mods/gameserver/enums/EventHandler;
        28: new           #1                  // class ext/mods/gameserver/enums/EventHandler
        31: dup
        32: ldc           #116                // String ATTACK_FINISHED
        34: iconst_2
        35: iconst_1
        36: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
        39: putstatic     #10                 // Field ATTACK_FINISHED:Lext/mods/gameserver/enums/EventHandler;
        42: new           #1                  // class ext/mods/gameserver/enums/EventHandler
        45: dup
        46: ldc           #117                // String CLAN_ATTACKED
        48: iconst_3
        49: iconst_1
        50: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
        53: putstatic     #13                 // Field CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
        56: new           #1                  // class ext/mods/gameserver/enums/EventHandler
        59: dup
        60: ldc           #118                // String CLAN_DIED
        62: iconst_4
        63: iconst_1
        64: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
        67: putstatic     #16                 // Field CLAN_DIED:Lext/mods/gameserver/enums/EventHandler;
        70: new           #1                  // class ext/mods/gameserver/enums/EventHandler
        73: dup
        74: ldc           #119                // String CREATED
        76: iconst_5
        77: iconst_1
        78: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
        81: putstatic     #19                 // Field CREATED:Lext/mods/gameserver/enums/EventHandler;
        84: new           #1                  // class ext/mods/gameserver/enums/EventHandler
        87: dup
        88: ldc           #120                // String DECAYED
        90: bipush        6
        92: iconst_1
        93: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
        96: putstatic     #22                 // Field DECAYED:Lext/mods/gameserver/enums/EventHandler;
        99: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       102: dup
       103: ldc           #121                // String FIRST_TALK
       105: bipush        7
       107: iconst_0
       108: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       111: putstatic     #25                 // Field FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
       114: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       117: dup
       118: ldc           #122                // String MOVE_TO_FINISHED
       120: bipush        8
       122: iconst_1
       123: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       126: putstatic     #28                 // Field MOVE_TO_FINISHED:Lext/mods/gameserver/enums/EventHandler;
       129: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       132: dup
       133: ldc           #123                // String MY_DYING
       135: bipush        9
       137: iconst_1
       138: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       141: putstatic     #31                 // Field MY_DYING:Lext/mods/gameserver/enums/EventHandler;
       144: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       147: dup
       148: ldc           #124                // String NO_DESIRE
       150: bipush        10
       152: iconst_1
       153: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       156: putstatic     #34                 // Field NO_DESIRE:Lext/mods/gameserver/enums/EventHandler;
       159: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       162: dup
       163: ldc           #125                // String OUT_OF_TERRITORY
       165: bipush        11
       167: iconst_1
       168: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       171: putstatic     #37                 // Field OUT_OF_TERRITORY:Lext/mods/gameserver/enums/EventHandler;
       174: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       177: dup
       178: ldc           #126                // String PARTY_ATTACKED
       180: bipush        12
       182: iconst_1
       183: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       186: putstatic     #40                 // Field PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       189: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       192: dup
       193: ldc           #127                // String PARTY_DIED
       195: bipush        13
       197: iconst_1
       198: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       201: putstatic     #43                 // Field PARTY_DIED:Lext/mods/gameserver/enums/EventHandler;
       204: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       207: dup
       208: ldc           #128                // String PICKED_ITEM
       210: bipush        14
       212: iconst_1
       213: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       216: putstatic     #46                 // Field PICKED_ITEM:Lext/mods/gameserver/enums/EventHandler;
       219: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       222: dup
       223: ldc           #129                // String QUEST_START
       225: bipush        15
       227: iconst_1
       228: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       231: putstatic     #49                 // Field QUEST_START:Lext/mods/gameserver/enums/EventHandler;
       234: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       237: dup
       238: ldc           #130                // String SEE_CREATURE
       240: bipush        16
       242: iconst_1
       243: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       246: putstatic     #52                 // Field SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
       249: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       252: dup
       253: ldc           #131                // String SEE_ITEM
       255: bipush        17
       257: iconst_1
       258: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       261: putstatic     #55                 // Field SEE_ITEM:Lext/mods/gameserver/enums/EventHandler;
       264: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       267: dup
       268: ldc           #132                // String SEE_SPELL
       270: bipush        18
       272: iconst_1
       273: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       276: putstatic     #58                 // Field SEE_SPELL:Lext/mods/gameserver/enums/EventHandler;
       279: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       282: dup
       283: ldc           #133                // String SPELLED
       285: bipush        19
       287: iconst_1
       288: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       291: putstatic     #61                 // Field SPELLED:Lext/mods/gameserver/enums/EventHandler;
       294: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       297: dup
       298: ldc           #134                // String STATIC_OBJECT_CLAN_ATTACKED
       300: bipush        20
       302: iconst_1
       303: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       306: putstatic     #64                 // Field STATIC_OBJECT_CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       309: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       312: dup
       313: ldc           #135                // String TALKED
       315: bipush        21
       317: iconst_1
       318: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       321: putstatic     #67                 // Field TALKED:Lext/mods/gameserver/enums/EventHandler;
       324: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       327: dup
       328: ldc           #136                // String USE_SKILL_FINISHED
       330: bipush        22
       332: iconst_1
       333: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       336: putstatic     #70                 // Field USE_SKILL_FINISHED:Lext/mods/gameserver/enums/EventHandler;
       339: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       342: dup
       343: ldc           #137                // String ZONE_ENTER
       345: bipush        23
       347: iconst_1
       348: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       351: putstatic     #73                 // Field ZONE_ENTER:Lext/mods/gameserver/enums/EventHandler;
       354: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       357: dup
       358: ldc           #138                // String ZONE_EXIT
       360: bipush        24
       362: iconst_1
       363: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       366: putstatic     #76                 // Field ZONE_EXIT:Lext/mods/gameserver/enums/EventHandler;
       369: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       372: dup
       373: ldc           #139                // String SCRIPT_EVENT
       375: bipush        25
       377: iconst_1
       378: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       381: putstatic     #79                 // Field SCRIPT_EVENT:Lext/mods/gameserver/enums/EventHandler;
       384: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       387: dup
       388: ldc           #140                // String AI_TALKED
       390: bipush        26
       392: iconst_0
       393: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       396: putstatic     #82                 // Field AI_TALKED:Lext/mods/gameserver/enums/EventHandler;
       399: new           #1                  // class ext/mods/gameserver/enums/EventHandler
       402: dup
       403: ldc           #141                // String AI_MENU_SELECTED
       405: bipush        27
       407: iconst_0
       408: invokespecial #112                // Method "<init>":(Ljava/lang/String;IZ)V
       411: putstatic     #85                 // Field AI_MENU_SELECTED:Lext/mods/gameserver/enums/EventHandler;
       414: invokestatic  #142                // Method $values:()[Lext/mods/gameserver/enums/EventHandler;
       417: putstatic     #88                 // Field $VALUES:[Lext/mods/gameserver/enums/EventHandler;
       420: return
      LineNumberTable:
        line 28: 0
        line 33: 14
        line 38: 28
        line 43: 42
        line 48: 56
        line 53: 70
        line 58: 84
        line 63: 99
        line 68: 114
        line 73: 129
        line 78: 144
        line 83: 159
        line 88: 174
        line 93: 189
        line 98: 204
        line 103: 219
        line 108: 234
        line 113: 249
        line 118: 264
        line 123: 279
        line 128: 294
        line 133: 309
        line 138: 324
        line 143: 339
        line 148: 354
        line 153: 369
        line 155: 384
        line 157: 399
        line 23: 414
}
Signature: #162                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/EventHandler;>;
SourceFile: "EventHandler.java"
