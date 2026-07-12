// Bytecode for: ext.mods.gameserver.handler.skillhandlers.TakeCastle
// File: ext\mods\gameserver\handler\skillhandlers\TakeCastle.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/TakeCastle.class
  Last modified 9 de jul de 2026; size 4214 bytes
  MD5 checksum 220931069bf69b4d1cb6f79393c40a12
  Compiled from "TakeCastle.java"
public class ext.mods.gameserver.handler.skillhandlers.TakeCastle implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/handler/skillhandlers/TakeCastle
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #10 = NameAndType        #11:#12       // isClanLeader:()Z
   #11 = Utf8               isClanLeader
   #12 = Utf8               ()Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/handler/skillhandlers/TakeCastle.check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
   #14 = Class              #16           // ext/mods/gameserver/handler/skillhandlers/TakeCastle
   #15 = NameAndType        #17:#18       // check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
   #16 = Utf8               ext/mods/gameserver/handler/skillhandlers/TakeCastle
   #17 = Utf8               check
   #18 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
   #19 = Methodref          #7.#20        // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #20 = NameAndType        #21:#22       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #21 = Utf8               getClan
   #22 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/residence/castle/Castle.engrave:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/WorldObject;)V
   #24 = Class              #26           // ext/mods/gameserver/model/residence/castle/Castle
   #25 = NameAndType        #27:#28       // engrave:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/WorldObject;)V
   #26 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #27 = Utf8               engrave
   #28 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/WorldObject;)V
   #29 = Fieldref           #14.#30       // ext/mods/gameserver/handler/skillhandlers/TakeCastle.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #30 = NameAndType        #31:#32       // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #31 = Utf8               SKILL_IDS
   #32 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #34 = Class              #36           // ext/mods/gameserver/data/manager/CastleManager
   #35 = NameAndType        #37:#38       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #36 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #37 = Utf8               getInstance
   #38 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #39 = Methodref          #34.#40       // ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
   #40 = NameAndType        #41:#42       // getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
   #41 = Utf8               getCastle
   #42 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
   #43 = Methodref          #24.#44       // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
   #44 = NameAndType        #45:#46       // getId:()I
   #45 = Utf8               getId
   #46 = Utf8               ()I
   #47 = Fieldref           #48.#49       // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #48 = Class              #50           // ext/mods/gameserver/network/SystemMessageId
   #49 = NameAndType        #51:#52       // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #50 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #51 = Utf8               S1_CANNOT_BE_USED
   #52 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #53 = Methodref          #54.#55       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #54 = Class              #56           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #55 = NameAndType        #57:#58       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #56 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #57 = Utf8               getSystemMessage
   #58 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #59 = Methodref          #54.#60       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #60 = NameAndType        #61:#62       // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #61 = Utf8               addSkillName
   #62 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #63 = Methodref          #7.#64        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #64 = NameAndType        #65:#66       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #65 = Utf8               sendPacket
   #66 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #67 = Methodref          #24.#68       // ext/mods/gameserver/model/residence/castle/Castle.isGoodArtifact:(Lext/mods/gameserver/model/WorldObject;)Z
   #68 = NameAndType        #69:#70       // isGoodArtifact:(Lext/mods/gameserver/model/WorldObject;)Z
   #69 = Utf8               isGoodArtifact
   #70 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #71 = Fieldref           #48.#72       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #72 = NameAndType        #73:#52       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #73 = Utf8               INVALID_TARGET
   #74 = Methodref          #24.#75       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #75 = NameAndType        #76:#77       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #76 = Utf8               getSiege
   #77 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #78 = Methodref          #79.#80       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #79 = Class              #81           // ext/mods/gameserver/model/residence/castle/Siege
   #80 = NameAndType        #82:#12       // isInProgress:()Z
   #81 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #82 = Utf8               isInProgress
   #83 = Methodref          #7.#84        // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #84 = NameAndType        #85:#86       // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #85 = Utf8               isIn3DRadius
   #86 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #87 = Fieldref           #48.#88       // ext/mods/gameserver/network/SystemMessageId.DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
   #88 = NameAndType        #89:#52       // DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
   #89 = Utf8               DIST_TOO_FAR_CASTING_STOPPED
   #90 = Fieldref           #91.#92       // ext/mods/gameserver/enums/ZoneId.CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
   #91 = Class              #93           // ext/mods/gameserver/enums/ZoneId
   #92 = NameAndType        #94:#95       // CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
   #93 = Utf8               ext/mods/gameserver/enums/ZoneId
   #94 = Utf8               CAST_ON_ARTIFACT
   #95 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #96 = Methodref          #7.#97        // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #97 = NameAndType        #98:#99       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #98 = Utf8               isInsideZone
   #99 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #100 = Fieldref           #101.#102     // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #101 = Class              #103          // ext/mods/gameserver/enums/SiegeSide
  #102 = NameAndType        #104:#105     // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #103 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #104 = Utf8               ATTACKER
  #105 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #106 = Methodref          #79.#107      // ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #107 = NameAndType        #108:#109     // checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #108 = Utf8               checkSide
  #109 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #110 = Fieldref           #48.#111      // ext/mods/gameserver/network/SystemMessageId.OPPONENT_STARTED_ENGRAVING:Lext/mods/gameserver/network/SystemMessageId;
  #111 = NameAndType        #112:#52      // OPPONENT_STARTED_ENGRAVING:Lext/mods/gameserver/network/SystemMessageId;
  #112 = Utf8               OPPONENT_STARTED_ENGRAVING
  #113 = Fieldref           #101.#114     // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #114 = NameAndType        #115:#105     // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #115 = Utf8               DEFENDER
  #116 = Methodref          #79.#117      // ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #117 = NameAndType        #118:#119     // announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #118 = Utf8               announce
  #119 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #120 = Class              #121          // ext/mods/gameserver/enums/skills/SkillType
  #121 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #122 = Fieldref           #120.#123     // ext/mods/gameserver/enums/skills/SkillType.TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
  #123 = NameAndType        #124:#125     // TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
  #124 = Utf8               TAKE_CASTLE
  #125 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #126 = Class              #127          // ext/mods/gameserver/handler/ISkillHandler
  #127 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #128 = Utf8               Code
  #129 = Utf8               LineNumberTable
  #130 = Utf8               LocalVariableTable
  #131 = Utf8               this
  #132 = Utf8               Lext/mods/gameserver/handler/skillhandlers/TakeCastle;
  #133 = Utf8               useSkill
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #135 = Utf8               player
  #136 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #137 = Utf8               creature
  #138 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #139 = Utf8               skill
  #140 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #141 = Utf8               targets
  #142 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #143 = Utf8               item
  #144 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #145 = Utf8               castle
  #146 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #147 = Utf8               StackMapTable
  #148 = Utf8               getSkillIds
  #149 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #150 = Utf8               target
  #151 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #152 = Utf8               Z
  #153 = Utf8               <clinit>
  #154 = Utf8               SourceFile
  #155 = Utf8               TakeCastle.java
{
  public ext.mods.gameserver.handler.skillhandlers.TakeCastle();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/TakeCastle;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload_3
        18: arraylength
        19: ifne          23
        22: return
        23: aload         5
        25: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        28: ifne          32
        31: return
        32: aload         5
        34: aload_3
        35: iconst_0
        36: aaload
        37: aload_2
        38: iconst_0
        39: invokestatic  #13                 // Method check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
        42: astore        6
        44: aload         6
        46: ifnonnull     50
        49: return
        50: aload         6
        52: aload         5
        54: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        57: aload_3
        58: iconst_0
        59: aaload
        60: invokevirtual #23                 // Method ext/mods/gameserver/model/residence/castle/Castle.engrave:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/WorldObject;)V
        63: return
      LineNumberTable:
        line 44: 0
        line 45: 16
        line 47: 17
        line 48: 22
        line 50: 23
        line 51: 31
        line 53: 32
        line 54: 44
        line 55: 49
        line 57: 50
        line 58: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
            0      64     0  this   Lext/mods/gameserver/handler/skillhandlers/TakeCastle;
            0      64     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      64     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0      64     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0      64     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17      47     5 player   Lext/mods/gameserver/model/actor/Player;
           44      20     6 castle   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 5
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 5 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #29                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/TakeCastle;

  public static ext.mods.gameserver.model.residence.castle.Castle check(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=5, args_size=4
         0: invokestatic  #33                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
         3: aload_0
         4: invokevirtual #39                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
         7: astore        4
         9: aload         4
        11: ifnull        22
        14: aload         4
        16: invokevirtual #43                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        19: ifgt          39
        22: aload_0
        23: getstatic     #47                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        26: invokestatic  #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        29: aload_2
        30: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        33: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        36: goto          203
        39: aload         4
        41: aload_1
        42: invokevirtual #67                 // Method ext/mods/gameserver/model/residence/castle/Castle.isGoodArtifact:(Lext/mods/gameserver/model/WorldObject;)Z
        45: ifne          61
        48: aload_0
        49: getstatic     #71                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        52: invokestatic  #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        55: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: goto          203
        61: aload         4
        63: invokevirtual #74                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        66: invokevirtual #78                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        69: ifne          89
        72: aload_0
        73: getstatic     #47                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        76: invokestatic  #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        79: aload_2
        80: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        83: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        86: goto          203
        89: aload_0
        90: aload_1
        91: sipush        200
        94: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        97: ifne          113
       100: aload_0
       101: getstatic     #87                 // Field ext/mods/gameserver/network/SystemMessageId.DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
       104: invokestatic  #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       107: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       110: goto          203
       113: aload_0
       114: getstatic     #90                 // Field ext/mods/gameserver/enums/ZoneId.CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
       117: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       120: ifne          140
       123: aload_0
       124: getstatic     #47                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       127: invokestatic  #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       130: aload_2
       131: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       134: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       137: goto          203
       140: aload         4
       142: invokevirtual #74                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       145: aload_0
       146: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       149: getstatic     #100                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       152: invokevirtual #106                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
       155: ifne          175
       158: aload_0
       159: getstatic     #47                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       162: invokestatic  #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       165: aload_2
       166: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       169: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       172: goto          203
       175: iload_3
       176: ifeq          200
       179: aload         4
       181: invokevirtual #74                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       184: getstatic     #110                // Field ext/mods/gameserver/network/SystemMessageId.OPPONENT_STARTED_ENGRAVING:Lext/mods/gameserver/network/SystemMessageId;
       187: iconst_1
       188: anewarray     #101                // class ext/mods/gameserver/enums/SiegeSide
       191: dup
       192: iconst_0
       193: getstatic     #113                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       196: aastore
       197: invokevirtual #116                // Method ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
       200: aload         4
       202: areturn
       203: aconst_null
       204: areturn
      LineNumberTable:
        line 75: 0
        line 76: 9
        line 77: 22
        line 78: 39
        line 79: 48
        line 80: 61
        line 81: 72
        line 82: 89
        line 83: 100
        line 84: 113
        line 85: 123
        line 86: 140
        line 87: 158
        line 90: 175
        line 91: 179
        line 93: 200
        line 95: 203
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     205     0 player   Lext/mods/gameserver/model/actor/Player;
            0     205     1 target   Lext/mods/gameserver/model/WorldObject;
            0     205     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     205     3 announce   Z
            9     196     4 castle   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 16 /* same */
        frame_type = 21 /* same */
        frame_type = 27 /* same */
        frame_type = 23 /* same */
        frame_type = 26 /* same */
        frame_type = 34 /* same */
        frame_type = 24 /* same */
        frame_type = 2 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #120                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #122                // Field ext/mods/gameserver/enums/skills/SkillType.TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #29                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "TakeCastle.java"
