// Bytecode for: ext.mods.gameserver.model.actor.cast.PlayableCast
// File: ext\mods\gameserver\model\actor\cast\PlayableCast.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/cast/PlayableCast.class
  Last modified 9 de jul de 2026; size 5491 bytes
  MD5 checksum 698c6179d4f115049ca685e66c024cef
  Compiled from "PlayableCast.java"
public class ext.mods.gameserver.model.actor.cast.PlayableCast<T extends ext.mods.gameserver.model.actor.Playable> extends ext.mods.gameserver.model.actor.cast.CreatureCast<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/cast/PlayableCast
  super_class: #2                         // ext/mods/gameserver/model/actor/cast/CreatureCast
  interfaces: 0, fields: 0, methods: 6, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/cast/CreatureCast."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/cast/CreatureCast
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/item/instance/ItemInstance.isHerb:()Z
    #8 = Class              #10           // ext/mods/gameserver/model/item/instance/ItemInstance
    #9 = NameAndType        #11:#12       // isHerb:()Z
   #10 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #11 = Utf8               isHerb
   #12 = Utf8               ()Z
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/cast/PlayableCast._actor:Lext/mods/gameserver/model/actor/Creature;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/cast/PlayableCast
   #15 = NameAndType        #17:#18       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #16 = Utf8               ext/mods/gameserver/model/actor/cast/PlayableCast
   #17 = Utf8               _actor
   #18 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #19 = Class              #20           // ext/mods/gameserver/model/actor/Playable
   #20 = Utf8               ext/mods/gameserver/model/actor/Playable
   #21 = Methodref          #8.#22        // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #22 = NameAndType        #23:#24       // getObjectId:()I
   #23 = Utf8               getObjectId
   #24 = Utf8               ()I
   #25 = Methodref          #26.#27       // ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
   #26 = Class              #28           // ext/mods/gameserver/skills/L2Skill
   #27 = NameAndType        #29:#24       // getItemConsumeId:()I
   #28 = Utf8               ext/mods/gameserver/skills/L2Skill
   #29 = Utf8               getItemConsumeId
   #30 = Methodref          #26.#31       // ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
   #31 = NameAndType        #32:#24       // getItemConsume:()I
   #32 = Utf8               getItemConsume
   #33 = Methodref          #19.#34       // ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
   #34 = NameAndType        #35:#36       // destroyItem:(IIZ)Z
   #35 = Utf8               destroyItem
   #36 = Utf8               (IIZ)Z
   #37 = Fieldref           #38.#39       // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
   #38 = Class              #40           // ext/mods/gameserver/network/SystemMessageId
   #39 = NameAndType        #41:#42       // NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #41 = Utf8               NOT_ENOUGH_ITEMS
   #42 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #43 = Methodref          #19.#44       // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #44 = NameAndType        #45:#46       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #45 = Utf8               sendPacket
   #46 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #47 = Methodref          #26.#48       // ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
   #48 = NameAndType        #49:#24       // getReuseDelay:()I
   #49 = Utf8               getReuseDelay
   #50 = Methodref          #19.#51       // ext/mods/gameserver/model/actor/Playable.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
   #51 = NameAndType        #52:#53       // disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
   #52 = Utf8               disableSkill
   #53 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
   #54 = Class              #55           // ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #55 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #56 = Methodref          #26.#57       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #57 = NameAndType        #58:#24       // getId:()I
   #58 = Utf8               getId
   #59 = Methodref          #26.#60       // ext/mods/gameserver/skills/L2Skill.getLevel:()I
   #60 = NameAndType        #61:#24       // getLevel:()I
   #61 = Utf8               getLevel
   #62 = Methodref          #54.#63       // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #63 = NameAndType        #5:#64        // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #64 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #65 = Methodref          #19.#66       // ext/mods/gameserver/model/actor/Playable.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #66 = NameAndType        #67:#68       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #67 = Utf8               broadcastPacket
   #68 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #69 = Class              #70           // ext/mods/gameserver/model/actor/Creature
   #70 = Utf8               ext/mods/gameserver/model/actor/Creature
   #71 = Methodref          #14.#72       // ext/mods/gameserver/model/actor/cast/PlayableCast.callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #72 = NameAndType        #73:#74       // callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #73 = Utf8               callSkill
   #74 = Utf8               (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #75 = Methodref          #8.#76        // ext/mods/gameserver/model/item/instance/ItemInstance.isSummonItem:()Z
   #76 = NameAndType        #77:#12       // isSummonItem:()Z
   #77 = Utf8               isSummonItem
   #78 = Methodref          #19.#79       // ext/mods/gameserver/model/actor/Playable.addItemSkillTimeStamp:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #79 = NameAndType        #80:#81       // addItemSkillTimeStamp:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #80 = Utf8               addItemSkillTimeStamp
   #81 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #82 = Methodref          #2.#83        // ext/mods/gameserver/model/actor/cast/CreatureCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #83 = NameAndType        #84:#85       // doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #84 = Utf8               doCast
   #85 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #86 = Methodref          #2.#87        // ext/mods/gameserver/model/actor/cast/CreatureCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
   #87 = NameAndType        #88:#89       // canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
   #88 = Utf8               canCast
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
   #90 = Methodref          #26.#91       // ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #91 = NameAndType        #92:#93       // checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #92 = Utf8               checkCondition
   #93 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #94 = Methodref          #19.#95       // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #95 = NameAndType        #96:#97       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #96 = Utf8               getActingPlayer
   #97 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #98 = Methodref          #99.#100      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #99 = Class              #101          // ext/mods/gameserver/model/actor/Player
  #100 = NameAndType        #102:#12      // isInOlympiadMode:()Z
  #101 = Utf8               ext/mods/gameserver/model/actor/Player
  #102 = Utf8               isInOlympiadMode
  #103 = Methodref          #26.#104      // ext/mods/gameserver/skills/L2Skill.isHeroSkill:()Z
  #104 = NameAndType        #105:#12      // isHeroSkill:()Z
  #105 = Utf8               isHeroSkill
  #106 = Methodref          #26.#107      // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #107 = NameAndType        #108:#109     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #108 = Utf8               getSkillType
  #109 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #110 = Fieldref           #111.#112     // ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
  #111 = Class              #113          // ext/mods/gameserver/enums/skills/SkillType
  #112 = NameAndType        #114:#115     // RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
  #113 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #114 = Utf8               RESURRECT
  #115 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #116 = Fieldref           #38.#117      // ext/mods/gameserver/network/SystemMessageId.THIS_SKILL_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #117 = NameAndType        #118:#42      // THIS_SKILL_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #118 = Utf8               THIS_SKILL_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT
  #119 = Methodref          #99.#44       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #120 = Methodref          #99.#121      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #121 = NameAndType        #122:#123     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #122 = Utf8               getInventory
  #123 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #124 = Methodref          #125.#126     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #125 = Class              #127          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #126 = NameAndType        #128:#129     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #127 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #128 = Utf8               getItemByObjectId
  #129 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #130 = Methodref          #125.#131     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #131 = NameAndType        #132:#129     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #132 = Utf8               getItemByItemId
  #133 = Methodref          #8.#134       // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #134 = NameAndType        #135:#24      // getCount:()I
  #135 = Utf8               getCount
  #136 = Fieldref           #38.#137      // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #137 = NameAndType        #138:#42      // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #138 = Utf8               S1_CANNOT_BE_USED
  #139 = Methodref          #140.#141     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #140 = Class              #142          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #141 = NameAndType        #143:#144     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #142 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #143 = Utf8               getSystemMessage
  #144 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #145 = Methodref          #140.#146     // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #146 = NameAndType        #147:#148     // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #147 = Utf8               addSkillName
  #148 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #149 = Methodref          #99.#150      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #150 = NameAndType        #45:#68       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #151 = Methodref          #26.#152      // ext/mods/gameserver/skills/L2Skill.meetCastConditions:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #152 = NameAndType        #153:#154     // meetCastConditions:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #153 = Utf8               meetCastConditions
  #154 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #155 = Methodref          #2.#156       // ext/mods/gameserver/model/actor/cast/CreatureCast.stop:()V
  #156 = NameAndType        #157:#158     // stop:()V
  #157 = Utf8               stop
  #158 = Utf8               ()V
  #159 = Methodref          #19.#160      // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #160 = NameAndType        #161:#162     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #161 = Utf8               getAI
  #162 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #163 = Methodref          #164.#165     // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToIdle:()V
  #164 = Class              #166          // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #165 = NameAndType        #167:#158     // tryToIdle:()V
  #166 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #167 = Utf8               tryToIdle
  #168 = Methodref          #19.#169      // ext/mods/gameserver/model/actor/Playable.testCursesOnSkillSee:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)Z
  #169 = NameAndType        #170:#171     // testCursesOnSkillSee:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)Z
  #170 = Utf8               testCursesOnSkillSee
  #171 = Utf8               (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)Z
  #172 = Methodref          #2.#72        // ext/mods/gameserver/model/actor/cast/CreatureCast.callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #173 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
  #174 = Utf8               Code
  #175 = Utf8               LineNumberTable
  #176 = Utf8               LocalVariableTable
  #177 = Utf8               this
  #178 = Utf8               Lext/mods/gameserver/model/actor/cast/PlayableCast;
  #179 = Utf8               actor
  #180 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #181 = Utf8               LocalVariableTypeTable
  #182 = Utf8               Lext/mods/gameserver/model/actor/cast/PlayableCast<TT;>;
  #183 = Utf8               TT;
  #184 = Utf8               Signature
  #185 = Utf8               (TT;)V
  #186 = Utf8               doInstantCast
  #187 = Utf8               skill
  #188 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #189 = Utf8               item
  #190 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #191 = Utf8               reuseDelay
  #192 = Utf8               I
  #193 = Utf8               StackMapTable
  #194 = Utf8               target
  #195 = Utf8               itemInstance
  #196 = Utf8               requiredItems
  #197 = Utf8               isCtrlPressed
  #198 = Utf8               Z
  #199 = Utf8               itemObjectId
  #200 = Utf8               player
  #201 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #202 = Utf8               targets
  #203 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #204 = Utf8               <T:Lext/mods/gameserver/model/actor/Playable;>Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
  #205 = Utf8               SourceFile
  #206 = Utf8               PlayableCast.java
{
  public ext.mods.gameserver.model.actor.cast.PlayableCast(T);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/cast/CreatureCast."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 38: 0
        line 39: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Playable;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast<TT;>;
            0       6     1 actor   TT;
    Signature: #185                         // (TT;)V

  public void doInstantCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=4, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHerb:()Z
         4: ifne          61
         7: aload_0
         8: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        14: aload_2
        15: invokevirtual #21                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        18: aload_1
        19: invokevirtual #25                 // Method ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
        22: ifne          39
        25: aload_1
        26: invokevirtual #30                 // Method ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
        29: ifle          39
        32: aload_1
        33: invokevirtual #30                 // Method ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
        36: goto          40
        39: iconst_1
        40: iconst_0
        41: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
        44: ifne          61
        47: aload_0
        48: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        54: getstatic     #37                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        57: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        60: return
        61: aload_1
        62: invokevirtual #47                 // Method ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
        65: istore_3
        66: iload_3
        67: bipush        10
        69: if_icmple     85
        72: aload_0
        73: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        76: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        79: aload_1
        80: iload_3
        81: i2l
        82: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Playable.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
        85: aload_0
        86: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        89: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        92: new           #54                 // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        95: dup
        96: aload_0
        97: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       100: aload_0
       101: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       104: aload_1
       105: invokevirtual #56                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       108: aload_1
       109: invokevirtual #59                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       112: iconst_0
       113: iconst_0
       114: invokespecial #62                 // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       117: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Playable.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       120: aload_0
       121: aload_1
       122: iconst_1
       123: anewarray     #69                 // class ext/mods/gameserver/model/actor/Creature
       126: dup
       127: iconst_0
       128: aload_0
       129: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       132: aastore
       133: aload_2
       134: invokevirtual #71                 // Method callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       137: return
      LineNumberTable:
        line 44: 0
        line 46: 47
        line 47: 60
        line 50: 61
        line 51: 66
        line 52: 72
        line 54: 85
        line 56: 120
        line 60: 137
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     138     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast;
            0     138     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     138     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           66      72     3 reuseDelay   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     138     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/cast/PlayableCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/Playable, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/cast/PlayableCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/Playable, int, int ]
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]

  public void doCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_3
         1: ifnull        63
         4: aload_3
         5: invokevirtual #7                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHerb:()Z
         8: ifne          51
        11: aload_3
        12: invokevirtual #75                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isSummonItem:()Z
        15: ifne          51
        18: aload_0
        19: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        25: aload_3
        26: invokevirtual #21                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        29: iconst_1
        30: iconst_0
        31: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
        34: ifne          51
        37: aload_0
        38: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        44: getstatic     #37                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: return
        51: aload_0
        52: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        58: aload_1
        59: aload_3
        60: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Playable.addItemSkillTimeStamp:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        63: aload_0
        64: aload_1
        65: aload_2
        66: aload_3
        67: invokespecial #82                 // Method ext/mods/gameserver/model/actor/cast/CreatureCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        70: return
      LineNumberTable:
        line 65: 0
        line 67: 4
        line 69: 37
        line 70: 50
        line 73: 51
        line 76: 63
        line 77: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast;
            0      71     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      71     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      71     3 itemInstance   Lext/mods/gameserver/model/item/instance/ItemInstance;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 51 /* same */
        frame_type = 11 /* same */

  public boolean canCast(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: aload_0
         1: aload_1
         2: aload_2
         3: iload_3
         4: iload         4
         6: invokespecial #86                 // Method ext/mods/gameserver/model/actor/cast/CreatureCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
         9: ifne          14
        12: iconst_0
        13: ireturn
        14: aload_2
        15: aload_0
        16: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        19: aload_1
        20: iconst_0
        21: invokevirtual #90                 // Method ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
        24: ifne          29
        27: iconst_0
        28: ireturn
        29: aload_0
        30: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        33: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        36: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        39: astore        5
        41: aload         5
        43: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        46: ifeq          76
        49: aload_2
        50: invokevirtual #103                // Method ext/mods/gameserver/skills/L2Skill.isHeroSkill:()Z
        53: ifne          66
        56: aload_2
        57: invokevirtual #106                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        60: getstatic     #110                // Field ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
        63: if_acmpne     76
        66: aload         5
        68: getstatic     #116                // Field ext/mods/gameserver/network/SystemMessageId.THIS_SKILL_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
        71: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        74: iconst_0
        75: ireturn
        76: iload         4
        78: ifeq          104
        81: aload         5
        83: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        86: iload         4
        88: invokevirtual #124                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        91: ifnonnull     104
        94: aload         5
        96: getstatic     #37                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        99: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       102: iconst_0
       103: ireturn
       104: aload_2
       105: invokevirtual #25                 // Method ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
       108: ifle          159
       111: aload         5
       113: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       116: aload_2
       117: invokevirtual #25                 // Method ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
       120: invokevirtual #130                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       123: astore        6
       125: aload         6
       127: ifnull        142
       130: aload         6
       132: invokevirtual #133                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       135: aload_2
       136: invokevirtual #30                 // Method ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
       139: if_icmpge     159
       142: aload         5
       144: getstatic     #136                // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       147: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       150: aload_2
       151: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       154: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       157: iconst_0
       158: ireturn
       159: aload_2
       160: aload_0
       161: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       164: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
       167: aload_1
       168: iload_3
       169: invokevirtual #151                // Method ext/mods/gameserver/skills/L2Skill.meetCastConditions:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Z)Z
       172: ireturn
      LineNumberTable:
        line 82: 0
        line 83: 12
        line 85: 14
        line 86: 27
        line 88: 29
        line 90: 41
        line 92: 66
        line 93: 74
        line 96: 76
        line 98: 94
        line 99: 102
        line 102: 104
        line 104: 111
        line 105: 125
        line 107: 142
        line 108: 157
        line 112: 159
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          125      34     6 requiredItems   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     173     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast;
            0     173     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     173     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     173     3 isCtrlPressed   Z
            0     173     4 itemObjectId   I
           41     132     5 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     173     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast<TT;>;
      StackMapTable: number_of_entries = 7
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 9 /* same */
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 16

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #155                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.stop:()V
         4: aload_0
         5: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
        11: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
        14: invokevirtual #163                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToIdle:()V
        17: return
      LineNumberTable:
        line 118: 0
        line 120: 4
        line 121: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast<TT;>;

  public void callSkill(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Playable
         7: aload_1
         8: aload_2
         9: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Playable.testCursesOnSkillSee:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)Z
        12: ifeq          16
        15: return
        16: aload_0
        17: aload_1
        18: aload_2
        19: aload_3
        20: invokespecial #172                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        23: return
      LineNumberTable:
        line 126: 0
        line 127: 15
        line 129: 16
        line 130: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast;
            0      24     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      24     2 targets   [Lext/mods/gameserver/model/actor/Creature;
            0      24     3 itemInstance   Lext/mods/gameserver/model/item/instance/ItemInstance;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/cast/PlayableCast<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */
}
Signature: #204                         // <T:Lext/mods/gameserver/model/actor/Playable;>Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
SourceFile: "PlayableCast.java"
