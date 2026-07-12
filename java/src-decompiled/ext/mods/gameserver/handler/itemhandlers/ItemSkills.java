// Bytecode for: ext.mods.gameserver.handler.itemhandlers.ItemSkills
// File: ext\mods\gameserver\handler\itemhandlers\ItemSkills.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/ItemSkills.class
  Last modified 9 de jul de 2026; size 7490 bytes
  MD5 checksum a71d785e59e8132a39f82e12246b1099
  Compiled from "ItemSkills.java"
public class ext.mods.gameserver.handler.itemhandlers.ItemSkills implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #52                         // ext/mods/gameserver/handler/itemhandlers/ItemSkills
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/instance/Servitor
    #8 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
    #9 = Class              #10           // ext/mods/gameserver/model/actor/instance/Pet
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #11 = Methodref          #12.#13       // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #12 = Class              #14           // ext/mods/gameserver/model/actor/Playable
   #13 = NameAndType        #15:#16       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #14 = Utf8               ext/mods/gameserver/model/actor/Playable
   #15 = Utf8               getActingPlayer
   #16 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #17 = Methodref          #12.#18       // ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #18 = NameAndType        #19:#20       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #19 = Utf8               getTarget
   #20 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #21 = Class              #22           // ext/mods/gameserver/model/actor/Creature
   #22 = Utf8               ext/mods/gameserver/model/actor/Creature
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/item/instance/ItemInstance.isTradable:()Z
   #24 = Class              #26           // ext/mods/gameserver/model/item/instance/ItemInstance
   #25 = NameAndType        #27:#28       // isTradable:()Z
   #26 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #27 = Utf8               isTradable
   #28 = Utf8               ()Z
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/network/SystemMessageId.ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
   #30 = Class              #32           // ext/mods/gameserver/network/SystemMessageId
   #31 = NameAndType        #33:#34       // ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
   #32 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #33 = Utf8               ITEM_NOT_FOR_PETS
   #34 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #36 = Class              #38           // ext/mods/gameserver/model/actor/Player
   #37 = NameAndType        #39:#40       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #38 = Utf8               ext/mods/gameserver/model/actor/Player
   #39 = Utf8               sendPacket
   #40 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #41 = Methodref          #24.#42       // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #42 = NameAndType        #43:#44       // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #43 = Utf8               getEtcItem
   #44 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #46 = Class              #48           // ext/mods/gameserver/model/item/kind/EtcItem
   #47 = NameAndType        #49:#50       // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #48 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
   #49 = Utf8               getSkills
   #50 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #51 = Fieldref           #52.#53       // ext/mods/gameserver/handler/itemhandlers/ItemSkills.LOGGER:Lext/mods/commons/logging/CLogger;
   #52 = Class              #54           // ext/mods/gameserver/handler/itemhandlers/ItemSkills
   #53 = NameAndType        #55:#56       // LOGGER:Lext/mods/commons/logging/CLogger;
   #54 = Utf8               ext/mods/gameserver/handler/itemhandlers/ItemSkills
   #55 = Utf8               LOGGER
   #56 = Utf8               Lext/mods/commons/logging/CLogger;
   #57 = String             #58           // {} doesn\'t have any registered skill for handler.
   #58 = Utf8               {} doesn\'t have any registered skill for handler.
   #59 = Methodref          #24.#60       // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
   #60 = NameAndType        #61:#62       // getName:()Ljava/lang/String;
   #61 = Utf8               getName
   #62 = Utf8               ()Ljava/lang/String;
   #63 = Methodref          #64.#65       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #64 = Class              #66           // ext/mods/commons/logging/CLogger
   #65 = NameAndType        #67:#68       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #66 = Utf8               ext/mods/commons/logging/CLogger
   #67 = Utf8               warn
   #68 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #70 = Class              #72           // ext/mods/gameserver/model/holder/IntIntHolder
   #71 = NameAndType        #73:#74       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #72 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #73 = Utf8               getSkill
   #74 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #75 = Methodref          #76.#77       // ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #76 = Class              #78           // ext/mods/gameserver/skills/L2Skill
   #77 = NameAndType        #79:#80       // checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #78 = Utf8               ext/mods/gameserver/skills/L2Skill
   #79 = Utf8               checkCondition
   #80 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #81 = Methodref          #12.#82       // ext/mods/gameserver/model/actor/Playable.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
   #82 = NameAndType        #83:#84       // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
   #83 = Utf8               isSkillDisabled
   #84 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
   #85 = Fieldref           #30.#86       // ext/mods/gameserver/network/SystemMessageId.S1_PREPARED_FOR_REUSE:Lext/mods/gameserver/network/SystemMessageId;
   #86 = NameAndType        #87:#34       // S1_PREPARED_FOR_REUSE:Lext/mods/gameserver/network/SystemMessageId;
   #87 = Utf8               S1_PREPARED_FOR_REUSE
   #88 = Methodref          #89.#90       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #89 = Class              #91           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #90 = NameAndType        #92:#93       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #91 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #92 = Utf8               getSystemMessage
   #93 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #94 = Methodref          #89.#95       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #95 = NameAndType        #96:#97       // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = Utf8               addSkillName
   #97 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #98 = Methodref          #36.#99       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #99 = NameAndType        #39:#100      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #101 = Fieldref           #52.#102      // ext/mods/gameserver/handler/itemhandlers/ItemSkills.SCROLL_ITEM_IDS:Ljava/util/Set;
  #102 = NameAndType        #103:#104     // SCROLL_ITEM_IDS:Ljava/util/Set;
  #103 = Utf8               SCROLL_ITEM_IDS
  #104 = Utf8               Ljava/util/Set;
  #105 = Methodref          #24.#106      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #106 = NameAndType        #107:#108     // getItemId:()I
  #107 = Utf8               getItemId
  #108 = Utf8               ()I
  #109 = Methodref          #110.#111     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #110 = Class              #112          // java/lang/Integer
  #111 = NameAndType        #113:#114     // valueOf:(I)Ljava/lang/Integer;
  #112 = Utf8               java/lang/Integer
  #113 = Utf8               valueOf
  #114 = Utf8               (I)Ljava/lang/Integer;
  #115 = InterfaceMethodref #116.#117     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #116 = Class              #118          // java/util/Set
  #117 = NameAndType        #119:#120     // contains:(Ljava/lang/Object;)Z
  #118 = Utf8               java/util/Set
  #119 = Utf8               contains
  #120 = Utf8               (Ljava/lang/Object;)Z
  #121 = Methodref          #122.#123     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #122 = Class              #124          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #123 = NameAndType        #125:#126     // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #124 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #125 = Utf8               getInstance
  #126 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #127 = Methodref          #122.#128     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
  #128 = NameAndType        #129:#28      // isStarted:()Z
  #129 = Utf8               isStarted
  #130 = Methodref          #12.#131      // ext/mods/gameserver/model/actor/Playable.getObjectId:()I
  #131 = NameAndType        #132:#108     // getObjectId:()I
  #132 = Utf8               getObjectId
  #133 = Methodref          #122.#134     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onScrollUse:(I)Z
  #134 = NameAndType        #135:#136     // onScrollUse:(I)Z
  #135 = Utf8               onScrollUse
  #136 = Utf8               (I)Z
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #138 = Class              #140          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #139 = NameAndType        #125:#141     // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #140 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #141 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #142 = Methodref          #138.#128     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
  #143 = Methodref          #138.#134     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onScrollUse:(I)Z
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #145 = Class              #147          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #146 = NameAndType        #125:#148     // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #147 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #148 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #149 = Methodref          #145.#128     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
  #150 = Methodref          #145.#134     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onScrollUse:(I)Z
  #151 = Methodref          #152.#153     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #152 = Class              #154          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #153 = NameAndType        #125:#155     // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #154 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #155 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #156 = Methodref          #152.#128     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #157 = Methodref          #152.#134     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onScrollUse:(I)Z
  #158 = Methodref          #36.#159      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #159 = NameAndType        #160:#161     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #160 = Utf8               getSysString
  #161 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #162 = Methodref          #12.#163      // ext/mods/gameserver/model/actor/Playable.sendMessage:(Ljava/lang/String;)V
  #163 = NameAndType        #164:#165     // sendMessage:(Ljava/lang/String;)V
  #164 = Utf8               sendMessage
  #165 = Utf8               (Ljava/lang/String;)V
  #166 = Fieldref           #167.#168     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #167 = Class              #169          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #168 = NameAndType        #170:#171     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #169 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #170 = Utf8               STATIC_PACKET
  #171 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #172 = Methodref          #12.#99       // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #173 = Methodref          #122.#174     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onPotionUse:(I)Z
  #174 = NameAndType        #175:#136     // onPotionUse:(I)Z
  #175 = Utf8               onPotionUse
  #176 = Methodref          #138.#174     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onPotionUse:(I)Z
  #177 = Methodref          #145.#174     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onPotionUse:(I)Z
  #178 = Methodref          #152.#174     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onPotionUse:(I)Z
  #179 = Methodref          #76.#180      // ext/mods/gameserver/skills/L2Skill.isPotion:()Z
  #180 = NameAndType        #181:#28      // isPotion:()Z
  #181 = Utf8               isPotion
  #182 = Methodref          #76.#183      // ext/mods/gameserver/skills/L2Skill.isSimultaneousCast:()Z
  #183 = NameAndType        #184:#28      // isSimultaneousCast:()Z
  #184 = Utf8               isSimultaneousCast
  #185 = Methodref          #12.#186      // ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #186 = NameAndType        #187:#188     // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #187 = Utf8               getCast
  #188 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #189 = Methodref          #190.#191     // ext/mods/gameserver/model/actor/cast/CreatureCast.doInstantCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #190 = Class              #192          // ext/mods/gameserver/model/actor/cast/CreatureCast
  #191 = NameAndType        #193:#194     // doInstantCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #192 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #193 = Utf8               doInstantCast
  #194 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #195 = Methodref          #76.#196      // ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
  #196 = NameAndType        #197:#108     // getReuseDelay:()I
  #197 = Utf8               getReuseDelay
  #198 = Methodref          #24.#199      // ext/mods/gameserver/model/item/instance/ItemInstance.isEtcItem:()Z
  #199 = NameAndType        #200:#28      // isEtcItem:()Z
  #200 = Utf8               isEtcItem
  #201 = Methodref          #46.#196      // ext/mods/gameserver/model/item/kind/EtcItem.getReuseDelay:()I
  #202 = Methodref          #12.#203      // ext/mods/gameserver/model/actor/Playable.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
  #203 = NameAndType        #204:#205     // addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
  #204 = Utf8               addTimeStamp
  #205 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
  #206 = Methodref          #12.#207      // ext/mods/gameserver/model/actor/Playable.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #207 = NameAndType        #208:#205     // disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #208 = Utf8               disableSkill
  #209 = Methodref          #46.#210      // ext/mods/gameserver/model/item/kind/EtcItem.getSharedReuseGroup:()I
  #210 = NameAndType        #211:#108     // getSharedReuseGroup:()I
  #211 = Utf8               getSharedReuseGroup
  #212 = Class              #213          // ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem
  #213 = Utf8               ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem
  #214 = Methodref          #212.#215     // ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem."<init>":(IIII)V
  #215 = NameAndType        #5:#216       // "<init>":(IIII)V
  #216 = Utf8               (IIII)V
  #217 = Methodref          #24.#218      // ext/mods/gameserver/model/item/instance/ItemInstance.isHerb:()Z
  #218 = NameAndType        #219:#28      // isHerb:()Z
  #219 = Utf8               isHerb
  #220 = Methodref          #36.#221      // ext/mods/gameserver/model/actor/Player.hasServitor:()Z
  #221 = NameAndType        #222:#28      // hasServitor:()Z
  #222 = Utf8               hasServitor
  #223 = Methodref          #36.#224      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #224 = NameAndType        #225:#226     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #225 = Utf8               getSummon
  #226 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #227 = Methodref          #228.#186     // ext/mods/gameserver/model/actor/Summon.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #228 = Class              #229          // ext/mods/gameserver/model/actor/Summon
  #229 = Utf8               ext/mods/gameserver/model/actor/Summon
  #230 = Methodref          #12.#231      // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #231 = NameAndType        #232:#233     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #232 = Utf8               getAI
  #233 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #234 = Methodref          #24.#131      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #235 = Methodref          #236.#237     // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #236 = Class              #238          // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #237 = NameAndType        #239:#240     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #238 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #239 = Utf8               tryToCast
  #240 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #241 = Fieldref           #30.#242      // ext/mods/gameserver/network/SystemMessageId.PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
  #242 = NameAndType        #243:#34      // PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
  #243 = Utf8               PET_USES_S1
  #244 = Fieldref           #52.#245      // ext/mods/gameserver/handler/itemhandlers/ItemSkills.HP_POTION_SKILL_IDS:[I
  #245 = NameAndType        #246:#247     // HP_POTION_SKILL_IDS:[I
  #246 = Utf8               HP_POTION_SKILL_IDS
  #247 = Utf8               [I
  #248 = Methodref          #70.#249      // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #249 = NameAndType        #250:#108     // getId:()I
  #250 = Utf8               getId
  #251 = Methodref          #252.#253     // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #252 = Class              #254          // ext/mods/commons/util/ArraysUtil
  #253 = NameAndType        #119:#255     // contains:([II)Z
  #254 = Utf8               ext/mods/commons/util/ArraysUtil
  #255 = Utf8               ([II)Z
  #256 = Methodref          #36.#257      // ext/mods/gameserver/model/actor/Player.getShortBuffTaskSkillId:()I
  #257 = NameAndType        #258:#108     // getShortBuffTaskSkillId:()I
  #258 = Utf8               getShortBuffTaskSkillId
  #259 = Methodref          #76.#260      // ext/mods/gameserver/skills/L2Skill.getEffectTemplates:()Ljava/util/List;
  #260 = NameAndType        #261:#262     // getEffectTemplates:()Ljava/util/List;
  #261 = Utf8               getEffectTemplates
  #262 = Utf8               ()Ljava/util/List;
  #263 = InterfaceMethodref #264.#265     // java/util/List.get:(I)Ljava/lang/Object;
  #264 = Class              #266          // java/util/List
  #265 = NameAndType        #267:#268     // get:(I)Ljava/lang/Object;
  #266 = Utf8               java/util/List
  #267 = Utf8               get
  #268 = Utf8               (I)Ljava/lang/Object;
  #269 = Class              #270          // ext/mods/gameserver/skills/effects/EffectTemplate
  #270 = Utf8               ext/mods/gameserver/skills/effects/EffectTemplate
  #271 = Methodref          #70.#272      // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #272 = NameAndType        #273:#108     // getValue:()I
  #273 = Utf8               getValue
  #274 = Methodref          #269.#275     // ext/mods/gameserver/skills/effects/EffectTemplate.getCounter:()I
  #275 = NameAndType        #276:#108     // getCounter:()I
  #276 = Utf8               getCounter
  #277 = Methodref          #269.#278     // ext/mods/gameserver/skills/effects/EffectTemplate.getPeriod:()I
  #278 = NameAndType        #279:#108     // getPeriod:()I
  #279 = Utf8               getPeriod
  #280 = Methodref          #36.#281      // ext/mods/gameserver/model/actor/Player.shortBuffStatusUpdate:(III)V
  #281 = NameAndType        #282:#283     // shortBuffStatusUpdate:(III)V
  #282 = Utf8               shortBuffStatusUpdate
  #283 = Utf8               (III)V
  #284 = InterfaceMethodref #116.#285     // java/util/Set.of:([Ljava/lang/Object;)Ljava/util/Set;
  #285 = NameAndType        #286:#287     // of:([Ljava/lang/Object;)Ljava/util/Set;
  #286 = Utf8               of
  #287 = Utf8               ([Ljava/lang/Object;)Ljava/util/Set;
  #288 = Class              #289          // ext/mods/gameserver/handler/IItemHandler
  #289 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #290 = Utf8               Signature
  #291 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #292 = Utf8               Code
  #293 = Utf8               LineNumberTable
  #294 = Utf8               LocalVariableTable
  #295 = Utf8               this
  #296 = Utf8               Lext/mods/gameserver/handler/itemhandlers/ItemSkills;
  #297 = Utf8               useItem
  #298 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #299 = Utf8               targetCreature
  #300 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #301 = Utf8               group
  #302 = Utf8               I
  #303 = Utf8               reuseDelay
  #304 = Utf8               template
  #305 = Utf8               Lext/mods/gameserver/skills/effects/EffectTemplate;
  #306 = Utf8               itemSkill
  #307 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #308 = Utf8               skillInfo
  #309 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #310 = Utf8               playable
  #311 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #312 = Utf8               item
  #313 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #314 = Utf8               forceUse
  #315 = Utf8               Z
  #316 = Utf8               isPet
  #317 = Utf8               player
  #318 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #319 = Utf8               target
  #320 = Utf8               skills
  #321 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #322 = Utf8               StackMapTable
  #323 = Class              #321          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #324 = Utf8               <clinit>
  #325 = Utf8               SourceFile
  #326 = Utf8               ItemSkills.java
{
  public ext.mods.gameserver.handler.itemhandlers.ItemSkills();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemSkills;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=15, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/instance/Servitor
         4: ifeq          8
         7: return
         8: aload_1
         9: instanceof    #9                  // class ext/mods/gameserver/model/actor/instance/Pet
        12: istore        4
        14: aload_1
        15: invokevirtual #11                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        18: astore        5
        20: aload_1
        21: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
        24: astore        8
        26: aload         8
        28: instanceof    #21                 // class ext/mods/gameserver/model/actor/Creature
        31: ifeq          46
        34: aload         8
        36: checkcast     #21                 // class ext/mods/gameserver/model/actor/Creature
        39: astore        7
        41: aload         7
        43: goto          47
        46: aconst_null
        47: astore        6
        49: iload         4
        51: ifeq          70
        54: aload_2
        55: invokevirtual #23                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isTradable:()Z
        58: ifne          70
        61: aload         5
        63: getstatic     #29                 // Field ext/mods/gameserver/network/SystemMessageId.ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
        66: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        69: return
        70: aload_2
        71: invokevirtual #41                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
        74: invokevirtual #45                 // Method ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
        77: astore        7
        79: aload         7
        81: ifnonnull     104
        84: getstatic     #51                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        87: ldc           #57                 // String {} doesn\'t have any registered skill for handler.
        89: iconst_1
        90: anewarray     #2                  // class java/lang/Object
        93: dup
        94: iconst_0
        95: aload_2
        96: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
        99: aastore
       100: invokevirtual #63                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       103: return
       104: aload         7
       106: astore        8
       108: aload         8
       110: arraylength
       111: istore        9
       113: iconst_0
       114: istore        10
       116: iload         10
       118: iload         9
       120: if_icmpge     754
       123: aload         8
       125: iload         10
       127: aaload
       128: astore        11
       130: aload         11
       132: ifnonnull     138
       135: goto          748
       138: aload         11
       140: invokevirtual #69                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       143: astore        12
       145: aload         12
       147: ifnonnull     153
       150: goto          748
       153: aload         12
       155: aload_1
       156: aload         6
       158: iconst_0
       159: invokevirtual #75                 // Method ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
       162: ifne          166
       165: return
       166: aload_1
       167: aload         12
       169: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Playable.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
       172: ifeq          192
       175: aload         5
       177: getstatic     #85                 // Field ext/mods/gameserver/network/SystemMessageId.S1_PREPARED_FOR_REUSE:Lext/mods/gameserver/network/SystemMessageId;
       180: invokestatic  #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       183: aload         12
       185: invokevirtual #94                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       188: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       191: return
       192: getstatic     #101                // Field SCROLL_ITEM_IDS:Ljava/util/Set;
       195: aload_2
       196: invokevirtual #105                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       199: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       202: invokeinterface #115,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       207: ifeq          322
       210: invokestatic  #121                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       213: invokevirtual #127                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
       216: ifeq          232
       219: invokestatic  #121                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       222: aload_1
       223: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
       226: invokevirtual #133                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onScrollUse:(I)Z
       229: ifne          298
       232: invokestatic  #137                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       235: invokevirtual #142                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
       238: ifeq          254
       241: invokestatic  #137                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       244: aload_1
       245: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
       248: invokevirtual #143                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onScrollUse:(I)Z
       251: ifne          298
       254: invokestatic  #144                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       257: invokevirtual #149                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
       260: ifeq          276
       263: invokestatic  #144                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       266: aload_1
       267: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
       270: invokevirtual #150                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onScrollUse:(I)Z
       273: ifne          298
       276: invokestatic  #151                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       279: invokevirtual #156                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
       282: ifeq          322
       285: invokestatic  #151                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       288: aload_1
       289: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
       292: invokevirtual #157                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onScrollUse:(I)Z
       295: ifeq          322
       298: aload_1
       299: aload         5
       301: sipush        10078
       304: iconst_0
       305: anewarray     #2                  // class java/lang/Object
       308: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       311: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Playable.sendMessage:(Ljava/lang/String;)V
       314: aload_1
       315: getstatic     #166                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       318: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       321: return
       322: invokestatic  #121                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       325: invokevirtual #127                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
       328: ifeq          344
       331: invokestatic  #121                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       334: aload_1
       335: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
       338: invokevirtual #173                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onPotionUse:(I)Z
       341: ifne          410
       344: invokestatic  #137                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       347: invokevirtual #142                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
       350: ifeq          366
       353: invokestatic  #137                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       356: aload_1
       357: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
       360: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onPotionUse:(I)Z
       363: ifne          410
       366: invokestatic  #144                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       369: invokevirtual #149                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
       372: ifeq          388
       375: invokestatic  #144                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       378: aload_1
       379: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
       382: invokevirtual #177                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onPotionUse:(I)Z
       385: ifne          410
       388: invokestatic  #151                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       391: invokevirtual #156                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
       394: ifeq          434
       397: invokestatic  #151                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       400: aload_1
       401: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
       404: invokevirtual #178                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onPotionUse:(I)Z
       407: ifeq          434
       410: aload_1
       411: aload         5
       413: sipush        10079
       416: iconst_0
       417: anewarray     #2                  // class java/lang/Object
       420: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       423: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Playable.sendMessage:(Ljava/lang/String;)V
       426: aload_1
       427: getstatic     #166                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       430: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       433: return
       434: aload         12
       436: invokevirtual #179                // Method ext/mods/gameserver/skills/L2Skill.isPotion:()Z
       439: ifne          450
       442: aload         12
       444: invokevirtual #182                // Method ext/mods/gameserver/skills/L2Skill.isSimultaneousCast:()Z
       447: ifeq          622
       450: aload_1
       451: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
       454: aload         12
       456: aload_2
       457: invokevirtual #189                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.doInstantCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       460: aload         12
       462: invokevirtual #195                // Method ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
       465: istore        13
       467: aload_2
       468: invokevirtual #198                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEtcItem:()Z
       471: ifeq          562
       474: aload_2
       475: invokevirtual #41                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       478: invokevirtual #201                // Method ext/mods/gameserver/model/item/kind/EtcItem.getReuseDelay:()I
       481: iload         13
       483: if_icmple     495
       486: aload_2
       487: invokevirtual #41                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       490: invokevirtual #201                // Method ext/mods/gameserver/model/item/kind/EtcItem.getReuseDelay:()I
       493: istore        13
       495: aload_1
       496: aload         12
       498: iload         13
       500: i2l
       501: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Playable.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
       504: iload         13
       506: ifeq          518
       509: aload_1
       510: aload         12
       512: iload         13
       514: i2l
       515: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Playable.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
       518: iload         4
       520: ifne          585
       523: aload_2
       524: invokevirtual #41                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       527: invokevirtual #209                // Method ext/mods/gameserver/model/item/kind/EtcItem.getSharedReuseGroup:()I
       530: istore        14
       532: iload         14
       534: iflt          559
       537: aload         5
       539: new           #212                // class ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem
       542: dup
       543: aload_2
       544: invokevirtual #105                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       547: iload         14
       549: iload         13
       551: iload         13
       553: invokespecial #214                // Method ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem."<init>":(IIII)V
       556: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       559: goto          585
       562: iload         13
       564: ifle          585
       567: aload_1
       568: aload         12
       570: iload         13
       572: i2l
       573: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Playable.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
       576: aload_1
       577: aload         12
       579: iload         13
       581: i2l
       582: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Playable.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
       585: iload         4
       587: ifne          619
       590: aload_2
       591: invokevirtual #217                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHerb:()Z
       594: ifeq          619
       597: aload         5
       599: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Player.hasServitor:()Z
       602: ifeq          619
       605: aload         5
       607: invokevirtual #223                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       610: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Summon.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
       613: aload         12
       615: aload_2
       616: invokevirtual #189                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.doInstantCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       619: goto          650
       622: aload_1
       623: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
       626: aload         6
       628: aload         12
       630: iload_3
       631: iconst_0
       632: aload_2
       633: invokevirtual #198                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEtcItem:()Z
       636: ifeq          646
       639: aload_2
       640: invokevirtual #234                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       643: goto          647
       646: iconst_0
       647: invokevirtual #235                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
       650: iload         4
       652: ifeq          674
       655: aload         5
       657: getstatic     #241                // Field ext/mods/gameserver/network/SystemMessageId.PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
       660: invokestatic  #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       663: aload         12
       665: invokevirtual #94                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       668: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       671: goto          748
       674: getstatic     #244                // Field HP_POTION_SKILL_IDS:[I
       677: aload         11
       679: invokevirtual #248                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       682: invokestatic  #251                // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
       685: ifeq          748
       688: aload         11
       690: invokevirtual #248                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       693: aload         5
       695: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Player.getShortBuffTaskSkillId:()I
       698: if_icmplt     748
       701: aload         12
       703: invokevirtual #259                // Method ext/mods/gameserver/skills/L2Skill.getEffectTemplates:()Ljava/util/List;
       706: iconst_0
       707: invokeinterface #263,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       712: checkcast     #269                // class ext/mods/gameserver/skills/effects/EffectTemplate
       715: astore        13
       717: aload         13
       719: ifnull        748
       722: aload         5
       724: aload         11
       726: invokevirtual #248                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       729: aload         11
       731: invokevirtual #271                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       734: aload         13
       736: invokevirtual #274                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getCounter:()I
       739: aload         13
       741: invokevirtual #277                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getPeriod:()I
       744: imul
       745: invokevirtual #280                // Method ext/mods/gameserver/model/actor/Player.shortBuffStatusUpdate:(III)V
       748: iinc          10, 1
       751: goto          116
       754: return
      LineNumberTable:
        line 57: 0
        line 58: 7
        line 60: 8
        line 61: 14
        line 62: 20
        line 64: 49
        line 66: 61
        line 67: 69
        line 70: 70
        line 71: 79
        line 73: 84
        line 74: 103
        line 77: 104
        line 79: 130
        line 80: 135
        line 82: 138
        line 83: 145
        line 84: 150
        line 86: 153
        line 87: 165
        line 89: 166
        line 91: 175
        line 92: 191
        line 95: 192
        line 97: 210
        line 99: 298
        line 100: 314
        line 101: 321
        line 105: 322
        line 107: 410
        line 108: 426
        line 109: 433
        line 112: 434
        line 114: 450
        line 116: 460
        line 117: 467
        line 119: 474
        line 120: 486
        line 122: 495
        line 123: 504
        line 124: 509
        line 126: 518
        line 128: 523
        line 129: 532
        line 130: 537
        line 131: 559
        line 133: 562
        line 135: 567
        line 136: 576
        line 139: 585
        line 140: 605
        line 141: 619
        line 143: 622
        line 145: 650
        line 146: 655
        line 147: 674
        line 149: 701
        line 150: 717
        line 151: 722
        line 77: 748
        line 154: 754
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41       5     7 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          532      27    14 group   I
          467     152    13 reuseDelay   I
          717      31    13 template   Lext/mods/gameserver/skills/effects/EffectTemplate;
          145     603    12 itemSkill   Lext/mods/gameserver/skills/L2Skill;
          130     618    11 skillInfo   Lext/mods/gameserver/model/holder/IntIntHolder;
            0     755     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemSkills;
            0     755     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     755     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     755     3 forceUse   Z
           14     741     4 isPet   Z
           20     735     5 player   Lext/mods/gameserver/model/actor/Player;
           49     706     6 target   Lext/mods/gameserver/model/actor/Creature;
           79     676     7 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 34
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;" ]
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 12 /* same */
        frame_type = 25 /* same */
        frame_type = 39 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 23 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 23 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ int ]
        frame_type = 22 /* same */
        frame_type = 40 /* same */
        frame_type = 2 /* same */
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 33
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/handler/itemhandlers/ItemSkills, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/ai/type/PlayableAI, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/itemhandlers/ItemSkills, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/ai/type/PlayableAI, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, int, int, int ]
        frame_type = 2 /* same */
        frame_type = 23 /* same */
        frame_type = 249 /* chop */
          offset_delta = 73
        frame_type = 248 /* chop */
          offset_delta = 5

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        36
         2: anewarray     #110                // class java/lang/Integer
         5: dup
         6: iconst_0
         7: sipush        736
        10: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: aastore
        14: dup
        15: iconst_1
        16: sipush        1538
        19: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        22: aastore
        23: dup
        24: iconst_2
        25: sipush        1829
        28: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        31: aastore
        32: dup
        33: iconst_3
        34: sipush        1830
        37: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        40: aastore
        41: dup
        42: iconst_4
        43: sipush        5858
        46: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        49: aastore
        50: dup
        51: iconst_5
        52: sipush        5859
        55: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        58: aastore
        59: dup
        60: bipush        6
        62: sipush        6663
        65: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        68: aastore
        69: dup
        70: bipush        7
        72: sipush        6664
        75: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        78: aastore
        79: dup
        80: bipush        8
        82: sipush        7117
        85: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        88: aastore
        89: dup
        90: bipush        9
        92: sipush        7118
        95: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        98: aastore
        99: dup
       100: bipush        10
       102: sipush        7119
       105: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       108: aastore
       109: dup
       110: bipush        11
       112: sipush        7120
       115: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       118: aastore
       119: dup
       120: bipush        12
       122: sipush        7121
       125: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       128: aastore
       129: dup
       130: bipush        13
       132: sipush        7122
       135: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       138: aastore
       139: dup
       140: bipush        14
       142: sipush        7123
       145: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       148: aastore
       149: dup
       150: bipush        15
       152: sipush        7124
       155: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       158: aastore
       159: dup
       160: bipush        16
       162: sipush        7125
       165: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       168: aastore
       169: dup
       170: bipush        17
       172: sipush        7126
       175: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       178: aastore
       179: dup
       180: bipush        18
       182: sipush        7127
       185: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       188: aastore
       189: dup
       190: bipush        19
       192: sipush        7128
       195: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       198: aastore
       199: dup
       200: bipush        20
       202: sipush        7129
       205: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       208: aastore
       209: dup
       210: bipush        21
       212: sipush        7130
       215: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       218: aastore
       219: dup
       220: bipush        22
       222: sipush        7131
       225: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       228: aastore
       229: dup
       230: bipush        23
       232: sipush        7132
       235: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       238: aastore
       239: dup
       240: bipush        24
       242: sipush        7133
       245: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       248: aastore
       249: dup
       250: bipush        25
       252: sipush        7134
       255: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       258: aastore
       259: dup
       260: bipush        26
       262: sipush        7135
       265: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       268: aastore
       269: dup
       270: bipush        27
       272: sipush        7554
       275: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       278: aastore
       279: dup
       280: bipush        28
       282: sipush        7555
       285: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       288: aastore
       289: dup
       290: bipush        29
       292: sipush        7556
       295: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       298: aastore
       299: dup
       300: bipush        30
       302: sipush        7557
       305: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       308: aastore
       309: dup
       310: bipush        31
       312: sipush        7558
       315: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       318: aastore
       319: dup
       320: bipush        32
       322: sipush        7559
       325: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       328: aastore
       329: dup
       330: bipush        33
       332: sipush        7618
       335: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       338: aastore
       339: dup
       340: bipush        34
       342: sipush        7619
       345: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       348: aastore
       349: dup
       350: bipush        35
       352: sipush        9156
       355: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       358: aastore
       359: invokestatic  #284                // InterfaceMethod java/util/Set.of:([Ljava/lang/Object;)Ljava/util/Set;
       362: putstatic     #101                // Field SCROLL_ITEM_IDS:Ljava/util/Set;
       365: iconst_3
       366: newarray       int
       368: dup
       369: iconst_0
       370: sipush        2031
       373: iastore
       374: dup
       375: iconst_1
       376: sipush        2032
       379: iastore
       380: dup
       381: iconst_2
       382: sipush        2037
       385: iastore
       386: putstatic     #244                // Field HP_POTION_SKILL_IDS:[I
       389: return
      LineNumberTable:
        line 45: 0
        line 47: 365
}
SourceFile: "ItemSkills.java"
