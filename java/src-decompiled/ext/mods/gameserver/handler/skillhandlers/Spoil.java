// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Spoil
// File: ext\mods\gameserver\handler\skillhandlers\Spoil.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Spoil.class
  Last modified 9 de jul de 2026; size 3501 bytes
  MD5 checksum 01aeab05d604c0a110ac612549d643ab
  Compiled from "Spoil.java"
public class ext.mods.gameserver.handler.skillhandlers.Spoil implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #93                         // ext/mods/gameserver/handler/skillhandlers/Spoil
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Class              #10           // ext/mods/gameserver/model/actor/instance/Monster
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #11 = Methodref          #9.#12        // ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
   #12 = NameAndType        #13:#14       // isDead:()Z
   #13 = Utf8               isDead
   #14 = Utf8               ()Z
   #15 = Methodref          #9.#16        // ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #16 = NameAndType        #17:#18       // getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #17 = Utf8               getSpoilState
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
   #20 = Class              #22           // ext/mods/gameserver/model/actor/container/monster/SpoilState
   #21 = NameAndType        #23:#14       // isSpoiled:()Z
   #22 = Utf8               ext/mods/gameserver/model/actor/container/monster/SpoilState
   #23 = Utf8               isSpoiled
   #24 = Fieldref           #25.#26       // ext/mods/gameserver/network/SystemMessageId.ALREADY_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
   #25 = Class              #27           // ext/mods/gameserver/network/SystemMessageId
   #26 = NameAndType        #28:#29       // ALREADY_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
   #27 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #28 = Utf8               ALREADY_SPOILED
   #29 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #30 = Methodref          #7.#31        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #31 = NameAndType        #32:#33       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #32 = Utf8               sendPacket
   #33 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #34 = Methodref          #35.#36       // ext/mods/gameserver/skills/Formulas.calcMagicSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #35 = Class              #37           // ext/mods/gameserver/skills/Formulas
   #36 = NameAndType        #38:#39       // calcMagicSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #37 = Utf8               ext/mods/gameserver/skills/Formulas
   #38 = Utf8               calcMagicSuccess
   #39 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #40 = Methodref          #7.#41        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #41 = NameAndType        #42:#43       // getObjectId:()I
   #42 = Utf8               getObjectId
   #43 = Utf8               ()I
   #44 = Methodref          #20.#45       // ext/mods/gameserver/model/actor/container/monster/SpoilState.setSpoilerId:(I)V
   #45 = NameAndType        #46:#47       // setSpoilerId:(I)V
   #46 = Utf8               setSpoilerId
   #47 = Utf8               (I)V
   #48 = Fieldref           #25.#49       // ext/mods/gameserver/network/SystemMessageId.SPOIL_SUCCESS:Lext/mods/gameserver/network/SystemMessageId;
   #49 = NameAndType        #50:#29       // SPOIL_SUCCESS:Lext/mods/gameserver/network/SystemMessageId;
   #50 = Utf8               SPOIL_SUCCESS
   #51 = Methodref          #7.#52        // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #52 = NameAndType        #53:#54       // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #53 = Utf8               getMissions
   #54 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #55 = Fieldref           #56.#57       // ext/mods/gameserver/enums/actors/MissionType.SPOIL:Lext/mods/gameserver/enums/actors/MissionType;
   #56 = Class              #58           // ext/mods/gameserver/enums/actors/MissionType
   #57 = NameAndType        #59:#60       // SPOIL:Lext/mods/gameserver/enums/actors/MissionType;
   #58 = Utf8               ext/mods/gameserver/enums/actors/MissionType
   #59 = Utf8               SPOIL
   #60 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
   #61 = Methodref          #62.#63       // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
   #62 = Class              #64           // ext/mods/gameserver/model/actor/container/player/MissionList
   #63 = NameAndType        #65:#66       // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
   #64 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
   #65 = Utf8               update
   #66 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
   #67 = Fieldref           #25.#68       // ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
   #68 = NameAndType        #69:#29       // S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
   #69 = Utf8               S1_RESISTED_YOUR_S2
   #70 = Methodref          #71.#72       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #71 = Class              #73           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #72 = NameAndType        #74:#75       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #73 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #74 = Utf8               getSystemMessage
   #75 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #76 = Methodref          #71.#77       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #77 = NameAndType        #78:#79       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #78 = Utf8               addCharName
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #80 = Methodref          #81.#82       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #81 = Class              #83           // ext/mods/gameserver/skills/L2Skill
   #82 = NameAndType        #84:#43       // getId:()I
   #83 = Utf8               ext/mods/gameserver/skills/L2Skill
   #84 = Utf8               getId
   #85 = Methodref          #71.#86       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #86 = NameAndType        #87:#88       // addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #87 = Utf8               addSkillName
   #88 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #89 = Methodref          #7.#90        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #90 = NameAndType        #32:#91       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #91 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = Fieldref           #93.#94       // ext/mods/gameserver/handler/skillhandlers/Spoil.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #93 = Class              #95           // ext/mods/gameserver/handler/skillhandlers/Spoil
   #94 = NameAndType        #96:#97       // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #95 = Utf8               ext/mods/gameserver/handler/skillhandlers/Spoil
   #96 = Utf8               SKILL_IDS
   #97 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
   #98 = Class              #99           // ext/mods/gameserver/enums/skills/SkillType
   #99 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #100 = Fieldref           #98.#101      // ext/mods/gameserver/enums/skills/SkillType.SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
  #101 = NameAndType        #59:#102      // SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
  #102 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #103 = Class              #104          // ext/mods/gameserver/handler/ISkillHandler
  #104 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               LocalVariableTable
  #108 = Utf8               this
  #109 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Spoil;
  #110 = Utf8               useSkill
  #111 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #112 = Utf8               player
  #113 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #114 = Utf8               targetMonster
  #115 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #116 = Utf8               target
  #117 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #118 = Utf8               creature
  #119 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #120 = Utf8               skill
  #121 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #122 = Utf8               targets
  #123 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #124 = Utf8               item
  #125 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #126 = Utf8               StackMapTable
  #127 = Class              #123          // "[Lext/mods/gameserver/model/WorldObject;"
  #128 = Class              #129          // ext/mods/gameserver/model/WorldObject
  #129 = Utf8               ext/mods/gameserver/model/WorldObject
  #130 = Utf8               getSkillIds
  #131 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #132 = Utf8               <clinit>
  #133 = Utf8               SourceFile
  #134 = Utf8               Spoil.java
{
  public ext.mods.gameserver.handler.skillhandlers.Spoil();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Spoil;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=11, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload_3
        18: astore        6
        20: aload         6
        22: arraylength
        23: istore        7
        25: iconst_0
        26: istore        8
        28: iload         8
        30: iload         7
        32: if_icmpge     165
        35: aload         6
        37: iload         8
        39: aaload
        40: astore        9
        42: aload         9
        44: instanceof    #9                  // class ext/mods/gameserver/model/actor/instance/Monster
        47: ifeq          159
        50: aload         9
        52: checkcast     #9                  // class ext/mods/gameserver/model/actor/instance/Monster
        55: astore        10
        57: aload         10
        59: invokevirtual #11                 // Method ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
        62: ifeq          68
        65: goto          159
        68: aload         10
        70: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
        73: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
        76: ifeq          90
        79: aload         5
        81: getstatic     #24                 // Field ext/mods/gameserver/network/SystemMessageId.ALREADY_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
        84: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        87: goto          159
        90: aload         5
        92: aload         10
        94: aload_2
        95: invokestatic  #34                 // Method ext/mods/gameserver/skills/Formulas.calcMagicSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        98: ifeq          136
       101: aload         10
       103: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
       106: aload         5
       108: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       111: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.setSpoilerId:(I)V
       114: aload         5
       116: getstatic     #48                 // Field ext/mods/gameserver/network/SystemMessageId.SPOIL_SUCCESS:Lext/mods/gameserver/network/SystemMessageId;
       119: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       122: aload         5
       124: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       127: getstatic     #55                 // Field ext/mods/gameserver/enums/actors/MissionType.SPOIL:Lext/mods/gameserver/enums/actors/MissionType;
       130: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       133: goto          159
       136: aload         5
       138: getstatic     #67                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
       141: invokestatic  #70                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       144: aload         10
       146: invokevirtual #76                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       149: aload_2
       150: invokevirtual #80                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       153: invokevirtual #85                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       156: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       159: iinc          8, 1
       162: goto          28
       165: return
      LineNumberTable:
        line 43: 0
        line 44: 16
        line 46: 17
        line 48: 42
        line 51: 57
        line 52: 65
        line 54: 68
        line 56: 79
        line 57: 87
        line 60: 90
        line 62: 101
        line 64: 114
        line 66: 122
        line 69: 136
        line 46: 159
        line 71: 165
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
           57     102    10 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
           42     117     9 target   Lext/mods/gameserver/model/WorldObject;
            0     166     0  this   Lext/mods/gameserver/handler/skillhandlers/Spoil;
            0     166     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     166     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     166     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     166     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     149     5 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 8
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 21 /* same */
        frame_type = 45 /* same */
        frame_type = 249 /* chop */
          offset_delta = 22
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #92                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Spoil;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #98                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #100                // Field ext/mods/gameserver/enums/skills/SkillType.SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #92                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "Spoil.java"
