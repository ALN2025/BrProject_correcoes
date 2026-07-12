// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAcquireSkillInfo
// File: ext\mods\gameserver\network\clientpackets\RequestAcquireSkillInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo.class
  Last modified 9 de jul de 2026; size 4480 bytes
  MD5 checksum 40872c0226d0ca1e67385af348bb50f2
  Compiled from "RequestAcquireSkillInfo.java"
public class ext.mods.gameserver.network.clientpackets.RequestAcquireSkillInfo extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 3, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo._skillId:I
   #14 = NameAndType        #15:#16       // _skillId:I
   #15 = Utf8               _skillId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo._skillLevel:I
   #18 = NameAndType        #19:#16       // _skillLevel:I
   #19 = Utf8               _skillLevel
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo._skillType:I
   #21 = NameAndType        #22:#16       // _skillType:I
   #22 = Utf8               _skillType
   #23 = Methodref          #8.#24        // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #24 = NameAndType        #25:#26       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #25 = Utf8               getClient
   #26 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #27 = Class              #28           // ext/mods/gameserver/network/GameClient
   #28 = Utf8               ext/mods/gameserver/network/GameClient
   #29 = Methodref          #27.#30       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = NameAndType        #31:#32       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #31 = Utf8               getPlayer
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Player
   #35 = NameAndType        #37:#38       // getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #36 = Utf8               ext/mods/gameserver/model/actor/Player
   #37 = Utf8               getCurrentFolk
   #38 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Folk;
   #39 = Methodref          #34.#40       // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #40 = NameAndType        #41:#42       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #41 = Utf8               getAI
   #42 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #44 = Class              #46           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #45 = NameAndType        #47:#48       // canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #46 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #47 = Utf8               canDoInteract
   #48 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #49 = Methodref          #50.#51       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #50 = Class              #52           // ext/mods/gameserver/data/SkillTable
   #51 = NameAndType        #53:#54       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #52 = Utf8               ext/mods/gameserver/data/SkillTable
   #53 = Utf8               getInstance
   #54 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #55 = Methodref          #50.#56       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #56 = NameAndType        #57:#58       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #57 = Utf8               getInfo
   #58 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #59 = Methodref          #34.#60       // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
   #60 = NameAndType        #61:#62       // getSkillLevel:(I)I
   #61 = Utf8               getSkillLevel
   #62 = Utf8               (I)I
   #63 = Methodref          #64.#65       // ext/mods/gameserver/model/actor/instance/Folk.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #64 = Class              #66           // ext/mods/gameserver/model/actor/instance/Folk
   #65 = NameAndType        #67:#68       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #66 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #67 = Utf8               getTemplate
   #68 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #69 = Methodref          #34.#70       // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #70 = NameAndType        #71:#72       // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #71 = Utf8               getClassId
   #72 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/template/NpcTemplate.canTeach:(Lext/mods/gameserver/enums/actors/ClassId;)Z
   #74 = Class              #76           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #75 = NameAndType        #77:#78       // canTeach:(Lext/mods/gameserver/enums/actors/ClassId;)Z
   #76 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #77 = Utf8               canTeach
   #78 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
   #79 = Methodref          #34.#80       // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #80 = NameAndType        #67:#81       // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #81 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/actor/template/PlayerTemplate.findSkill:(II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
   #83 = Class              #85           // ext/mods/gameserver/model/actor/template/PlayerTemplate
   #84 = NameAndType        #86:#87       // findSkill:(II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
   #85 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
   #86 = Utf8               findSkill
   #87 = Utf8               (II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
   #88 = Class              #89           // ext/mods/gameserver/network/serverpackets/AcquireSkillInfo
   #89 = Utf8               ext/mods/gameserver/network/serverpackets/AcquireSkillInfo
   #90 = Methodref          #91.#92       // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getCorrectedCost:()I
   #91 = Class              #93           // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
   #92 = NameAndType        #94:#12       // getCorrectedCost:()I
   #93 = Utf8               ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
   #94 = Utf8               getCorrectedCost
   #95 = Methodref          #88.#96       // ext/mods/gameserver/network/serverpackets/AcquireSkillInfo."<init>":(IIII)V
   #96 = NameAndType        #5:#97        // "<init>":(IIII)V
   #97 = Utf8               (IIII)V
   #98 = Methodref          #99.#100      // ext/mods/gameserver/data/xml/SpellbookData.getInstance:()Lext/mods/gameserver/data/xml/SpellbookData;
   #99 = Class              #101          // ext/mods/gameserver/data/xml/SpellbookData
  #100 = NameAndType        #53:#102      // getInstance:()Lext/mods/gameserver/data/xml/SpellbookData;
  #101 = Utf8               ext/mods/gameserver/data/xml/SpellbookData
  #102 = Utf8               ()Lext/mods/gameserver/data/xml/SpellbookData;
  #103 = Methodref          #99.#104      // ext/mods/gameserver/data/xml/SpellbookData.getBookForSkill:(II)I
  #104 = NameAndType        #105:#106     // getBookForSkill:(II)I
  #105 = Utf8               getBookForSkill
  #106 = Utf8               (II)I
  #107 = Methodref          #88.#108      // ext/mods/gameserver/network/serverpackets/AcquireSkillInfo.addRequirement:(IIII)V
  #108 = NameAndType        #109:#97      // addRequirement:(IIII)V
  #109 = Utf8               addRequirement
  #110 = Methodref          #8.#111       // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = NameAndType        #112:#113     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #112 = Utf8               sendPacket
  #113 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #114 = Methodref          #115.#116     // ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #115 = Class              #117          // ext/mods/gameserver/data/xml/SkillTreeData
  #116 = NameAndType        #53:#118      // getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #117 = Utf8               ext/mods/gameserver/data/xml/SkillTreeData
  #118 = Utf8               ()Lext/mods/gameserver/data/xml/SkillTreeData;
  #119 = Methodref          #115.#120     // ext/mods/gameserver/data/xml/SkillTreeData.getFishingSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #120 = NameAndType        #121:#122     // getFishingSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #121 = Utf8               getFishingSkillFor
  #122 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #123 = Methodref          #124.#125     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getItemId:()I
  #124 = Class              #126          // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  #125 = NameAndType        #127:#12      // getItemId:()I
  #126 = Utf8               ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  #127 = Utf8               getItemId
  #128 = Methodref          #124.#129     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getItemCount:()I
  #129 = NameAndType        #130:#12      // getItemCount:()I
  #130 = Utf8               getItemCount
  #131 = Methodref          #34.#132      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #132 = NameAndType        #133:#134     // isClanLeader:()Z
  #133 = Utf8               isClanLeader
  #134 = Utf8               ()Z
  #135 = Methodref          #115.#136     // ext/mods/gameserver/data/xml/SkillTreeData.getClanSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #136 = NameAndType        #137:#138     // getClanSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #137 = Utf8               getClanSkillFor
  #138 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #139 = Methodref          #140.#141     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #140 = Class              #142          // ext/mods/gameserver/skills/L2Skill
  #141 = NameAndType        #143:#12      // getId:()I
  #142 = Utf8               ext/mods/gameserver/skills/L2Skill
  #143 = Utf8               getId
  #144 = Methodref          #140.#145     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #145 = NameAndType        #146:#12      // getLevel:()I
  #146 = Utf8               getLevel
  #147 = Methodref          #148.#149     // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getCost:()I
  #148 = Class              #150          // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode
  #149 = NameAndType        #151:#12      // getCost:()I
  #150 = Utf8               ext/mods/gameserver/model/holder/skillnode/ClanSkillNode
  #151 = Utf8               getCost
  #152 = Fieldref           #153.#154     // ext/mods/Config.LIFE_CRYSTAL_NEEDED:Z
  #153 = Class              #155          // ext/mods/Config
  #154 = NameAndType        #156:#157     // LIFE_CRYSTAL_NEEDED:Z
  #155 = Utf8               ext/mods/Config
  #156 = Utf8               LIFE_CRYSTAL_NEEDED
  #157 = Utf8               Z
  #158 = Methodref          #148.#125     // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getItemId:()I
  #159 = Utf8               Code
  #160 = Utf8               LineNumberTable
  #161 = Utf8               LocalVariableTable
  #162 = Utf8               this
  #163 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo;
  #164 = Utf8               readImpl
  #165 = Utf8               runImpl
  #166 = Utf8               bookId
  #167 = Utf8               asi
  #168 = Utf8               Lext/mods/gameserver/network/serverpackets/AcquireSkillInfo;
  #169 = Utf8               skillLvl
  #170 = Utf8               gsn
  #171 = Utf8               Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
  #172 = Utf8               fsn
  #173 = Utf8               Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #174 = Utf8               csn
  #175 = Utf8               Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #176 = Utf8               player
  #177 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #178 = Utf8               folk
  #179 = Utf8               Lext/mods/gameserver/model/actor/instance/Folk;
  #180 = Utf8               skill
  #181 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #182 = Utf8               StackMapTable
  #183 = Utf8               SourceFile
  #184 = Utf8               RequestAcquireSkillInfo.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAcquireSkillInfo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _skillId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _skillLevel:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _skillType:I
        24: return
      LineNumberTable:
        line 41: 0
        line 42: 8
        line 43: 16
        line 44: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=9, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _skillId:I
         4: ifle          14
         7: aload_0
         8: getfield      #17                 // Field _skillLevel:I
        11: ifgt          15
        14: return
        15: aload_0
        16: invokevirtual #23                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        19: checkcast     #27                 // class ext/mods/gameserver/network/GameClient
        22: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        25: astore_1
        26: aload_1
        27: ifnonnull     31
        30: return
        31: aload_1
        32: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
        35: astore_2
        36: aload_2
        37: ifnull        51
        40: aload_1
        41: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        44: aload_2
        45: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
        48: ifne          52
        51: return
        52: invokestatic  #49                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        55: aload_0
        56: getfield      #13                 // Field _skillId:I
        59: aload_0
        60: getfield      #17                 // Field _skillLevel:I
        63: invokevirtual #55                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        66: astore_3
        67: aload_3
        68: ifnonnull     72
        71: return
        72: aload_0
        73: getfield      #20                 // Field _skillType:I
        76: tableswitch   { // 0 to 2

                       0: 104

                       1: 238

                       2: 337
                 default: 423
            }
       104: aload_1
       105: aload_0
       106: getfield      #13                 // Field _skillId:I
       109: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
       112: istore        5
       114: iload         5
       116: aload_0
       117: getfield      #17                 // Field _skillLevel:I
       120: if_icmplt     124
       123: return
       124: iload         5
       126: aload_0
       127: getfield      #17                 // Field _skillLevel:I
       130: iconst_1
       131: isub
       132: if_icmpeq     136
       135: return
       136: aload_2
       137: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/instance/Folk.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       140: aload_1
       141: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       144: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.canTeach:(Lext/mods/gameserver/enums/actors/ClassId;)Z
       147: ifne          151
       150: return
       151: aload_1
       152: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
       155: aload_0
       156: getfield      #13                 // Field _skillId:I
       159: aload_0
       160: getfield      #17                 // Field _skillLevel:I
       163: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.findSkill:(II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
       166: astore        6
       168: aload         6
       170: ifnull        423
       173: new           #88                 // class ext/mods/gameserver/network/serverpackets/AcquireSkillInfo
       176: dup
       177: aload_0
       178: getfield      #13                 // Field _skillId:I
       181: aload_0
       182: getfield      #17                 // Field _skillLevel:I
       185: aload         6
       187: invokevirtual #90                 // Method ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getCorrectedCost:()I
       190: iconst_0
       191: invokespecial #95                 // Method ext/mods/gameserver/network/serverpackets/AcquireSkillInfo."<init>":(IIII)V
       194: astore        4
       196: invokestatic  #98                 // Method ext/mods/gameserver/data/xml/SpellbookData.getInstance:()Lext/mods/gameserver/data/xml/SpellbookData;
       199: aload_0
       200: getfield      #13                 // Field _skillId:I
       203: aload_0
       204: getfield      #17                 // Field _skillLevel:I
       207: invokevirtual #103                // Method ext/mods/gameserver/data/xml/SpellbookData.getBookForSkill:(II)I
       210: istore        7
       212: iload         7
       214: ifeq          229
       217: aload         4
       219: bipush        99
       221: iload         7
       223: iconst_1
       224: bipush        50
       226: invokevirtual #107                // Method ext/mods/gameserver/network/serverpackets/AcquireSkillInfo.addRequirement:(IIII)V
       229: aload_0
       230: aload         4
       232: invokevirtual #110                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       235: goto          423
       238: aload_1
       239: aload_0
       240: getfield      #13                 // Field _skillId:I
       243: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
       246: istore        5
       248: iload         5
       250: aload_0
       251: getfield      #17                 // Field _skillLevel:I
       254: if_icmplt     258
       257: return
       258: iload         5
       260: aload_0
       261: getfield      #17                 // Field _skillLevel:I
       264: iconst_1
       265: isub
       266: if_icmpeq     270
       269: return
       270: invokestatic  #114                // Method ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
       273: aload_1
       274: aload_0
       275: getfield      #13                 // Field _skillId:I
       278: aload_0
       279: getfield      #17                 // Field _skillLevel:I
       282: invokevirtual #119                // Method ext/mods/gameserver/data/xml/SkillTreeData.getFishingSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
       285: astore        7
       287: aload         7
       289: ifnull        423
       292: new           #88                 // class ext/mods/gameserver/network/serverpackets/AcquireSkillInfo
       295: dup
       296: aload_0
       297: getfield      #13                 // Field _skillId:I
       300: aload_0
       301: getfield      #17                 // Field _skillLevel:I
       304: iconst_0
       305: iconst_1
       306: invokespecial #95                 // Method ext/mods/gameserver/network/serverpackets/AcquireSkillInfo."<init>":(IIII)V
       309: astore        4
       311: aload         4
       313: iconst_4
       314: aload         7
       316: invokevirtual #123                // Method ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getItemId:()I
       319: aload         7
       321: invokevirtual #128                // Method ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getItemCount:()I
       324: iconst_0
       325: invokevirtual #107                // Method ext/mods/gameserver/network/serverpackets/AcquireSkillInfo.addRequirement:(IIII)V
       328: aload_0
       329: aload         4
       331: invokevirtual #110                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       334: goto          423
       337: aload_1
       338: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       341: ifne          345
       344: return
       345: invokestatic  #114                // Method ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
       348: aload_1
       349: aload_0
       350: getfield      #13                 // Field _skillId:I
       353: aload_0
       354: getfield      #17                 // Field _skillLevel:I
       357: invokevirtual #135                // Method ext/mods/gameserver/data/xml/SkillTreeData.getClanSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
       360: astore        8
       362: aload         8
       364: ifnull        423
       367: new           #88                 // class ext/mods/gameserver/network/serverpackets/AcquireSkillInfo
       370: dup
       371: aload_3
       372: invokevirtual #139                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       375: aload_3
       376: invokevirtual #144                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       379: aload         8
       381: invokevirtual #147                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getCost:()I
       384: iconst_2
       385: invokespecial #95                 // Method ext/mods/gameserver/network/serverpackets/AcquireSkillInfo."<init>":(IIII)V
       388: astore        4
       390: getstatic     #152                // Field ext/mods/Config.LIFE_CRYSTAL_NEEDED:Z
       393: ifeq          417
       396: aload         8
       398: invokevirtual #158                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getItemId:()I
       401: ifeq          417
       404: aload         4
       406: iconst_1
       407: aload         8
       409: invokevirtual #158                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getItemId:()I
       412: iconst_1
       413: iconst_0
       414: invokevirtual #107                // Method ext/mods/gameserver/network/serverpackets/AcquireSkillInfo.addRequirement:(IIII)V
       417: aload_0
       418: aload         4
       420: invokevirtual #110                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       423: return
      LineNumberTable:
        line 49: 0
        line 50: 14
        line 52: 15
        line 53: 26
        line 54: 30
        line 56: 31
        line 57: 36
        line 58: 51
        line 60: 52
        line 61: 67
        line 62: 71
        line 66: 72
        line 69: 104
        line 70: 114
        line 71: 123
        line 73: 124
        line 74: 135
        line 76: 136
        line 77: 150
        line 79: 151
        line 80: 168
        line 82: 173
        line 83: 196
        line 84: 212
        line 85: 217
        line 86: 229
        line 87: 235
        line 91: 238
        line 92: 248
        line 93: 257
        line 95: 258
        line 96: 269
        line 98: 270
        line 99: 287
        line 101: 292
        line 102: 311
        line 103: 328
        line 108: 337
        line 109: 344
        line 111: 345
        line 112: 362
        line 114: 367
        line 115: 390
        line 116: 404
        line 117: 417
        line 121: 423
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          212      23     7 bookId   I
          196      42     4   asi   Lext/mods/gameserver/network/serverpackets/AcquireSkillInfo;
          114     124     5 skillLvl   I
          168      70     6   gsn   Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
          311      26     4   asi   Lext/mods/gameserver/network/serverpackets/AcquireSkillInfo;
          248      89     5 skillLvl   I
          287      50     7   fsn   Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
          390      33     4   asi   Lext/mods/gameserver/network/serverpackets/AcquireSkillInfo;
          362      61     8   csn   Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
            0     424     0  this   Lext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo;
           26     398     1 player   Lext/mods/gameserver/model/actor/Player;
           36     388     2  folk   Lext/mods/gameserver/model/actor/instance/Folk;
           67     357     3 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 18
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/Folk ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 31 /* same */
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ top, int ]
        frame_type = 11 /* same */
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 77
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/network/serverpackets/AcquireSkillInfo, int, class ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/skills/L2Skill ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ top, int ]
        frame_type = 11 /* same */
        frame_type = 249 /* chop */
          offset_delta = 66
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/network/serverpackets/AcquireSkillInfo, top, top, top, class ext/mods/gameserver/model/holder/skillnode/ClanSkillNode ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/skills/L2Skill ]
          stack = []
}
SourceFile: "RequestAcquireSkillInfo.java"
