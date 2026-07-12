// Bytecode for: ext.mods.gameserver.model.actor.Attackable
// File: ext\mods\gameserver\model\actor\Attackable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Attackable.class
  Last modified 9 de jul de 2026; size 12623 bytes
  MD5 checksum 6ae08aef8c465af43225fd9caf103917
  Compiled from "Attackable.java"
public class ext.mods.gameserver.model.actor.Attackable extends ext.mods.gameserver.model.actor.Npc
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/Attackable
  super_class: #2                         // ext/mods/gameserver/model/actor/Npc
  interfaces: 0, fields: 2, methods: 26, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Npc
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Npc
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #8 = Class              #10           // java/util/concurrent/ConcurrentHashMap
    #9 = NameAndType        #11:#12       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #10 = Utf8               java/util/concurrent/ConcurrentHashMap
   #11 = Utf8               newKeySet
   #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/Attackable._attackedBy:Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Attackable
   #15 = NameAndType        #17:#18       // _attackedBy:Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #17 = Utf8               _attackedBy
   #18 = Utf8               Ljava/util/Set;
   #19 = Fieldref           #14.#20       // ext/mods/gameserver/model/actor/Attackable._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #20 = NameAndType        #21:#22       // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #21 = Utf8               _ai
   #22 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #23 = Class              #24           // ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #24 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #25 = Methodref          #23.#26       // ext/mods/gameserver/model/actor/ai/type/AttackableAI."<init>":(Lext/mods/gameserver/model/actor/Attackable;)V
   #26 = NameAndType        #5:#27        // "<init>":(Lext/mods/gameserver/model/actor/Attackable;)V
   #27 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)V
   #28 = Fieldref           #14.#29       // ext/mods/gameserver/model/actor/Attackable._status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #29 = NameAndType        #30:#31       // _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #30 = Utf8               _status
   #31 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #32 = Class              #33           // ext/mods/gameserver/model/actor/status/AttackableStatus
   #33 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
   #34 = Methodref          #32.#26       // ext/mods/gameserver/model/actor/status/AttackableStatus."<init>":(Lext/mods/gameserver/model/actor/Attackable;)V
   #35 = Methodref          #2.#36        // ext/mods/gameserver/model/actor/Npc.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
   #36 = NameAndType        #37:#38       // removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
   #37 = Utf8               removeKnownObject
   #38 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #39 = Class              #40           // ext/mods/gameserver/model/actor/Creature
   #40 = Utf8               ext/mods/gameserver/model/actor/Creature
   #41 = Methodref          #14.#42       // ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #42 = NameAndType        #43:#44       // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #43 = Utf8               getAI
   #44 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #45 = Methodref          #23.#46       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #46 = NameAndType        #47:#48       // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #47 = Utf8               getAggroList
   #48 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/actor/container/attackable/AggroList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #50 = Class              #52           // ext/mods/gameserver/model/actor/container/attackable/AggroList
   #51 = NameAndType        #53:#54       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #52 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
   #53 = Utf8               remove
   #54 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #55 = Methodref          #14.#56       // ext/mods/gameserver/model/actor/Attackable.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #56 = NameAndType        #57:#58       // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #57 = Utf8               reduceCurrentHp
   #58 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #59 = Methodref          #2.#60        // ext/mods/gameserver/model/actor/Npc.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #60 = NameAndType        #61:#62       // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #61 = Utf8               doDie
   #62 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #63 = Methodref          #39.#64       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #64 = NameAndType        #65:#66       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #65 = Utf8               getActingPlayer
   #66 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #67 = Methodref          #68.#69       // ext/mods/extensions/listener/manager/NpcListenerManager.getInstance:()Lext/mods/extensions/listener/manager/NpcListenerManager;
   #68 = Class              #70           // ext/mods/extensions/listener/manager/NpcListenerManager
   #69 = NameAndType        #71:#72       // getInstance:()Lext/mods/extensions/listener/manager/NpcListenerManager;
   #70 = Utf8               ext/mods/extensions/listener/manager/NpcListenerManager
   #71 = Utf8               getInstance
   #72 = Utf8               ()Lext/mods/extensions/listener/manager/NpcListenerManager;
   #73 = Methodref          #68.#74       // ext/mods/extensions/listener/manager/NpcListenerManager.notifyNpcKill:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #74 = NameAndType        #75:#76       // notifyNpcKill:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #75 = Utf8               notifyNpcKill
   #76 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #77 = Methodref          #78.#79       // ext/mods/gameserver/data/manager/PcCafeManager.getInstance:()Lext/mods/gameserver/data/manager/PcCafeManager;
   #78 = Class              #80           // ext/mods/gameserver/data/manager/PcCafeManager
   #79 = NameAndType        #71:#81       // getInstance:()Lext/mods/gameserver/data/manager/PcCafeManager;
   #80 = Utf8               ext/mods/gameserver/data/manager/PcCafeManager
   #81 = Utf8               ()Lext/mods/gameserver/data/manager/PcCafeManager;
   #82 = Methodref          #78.#83       // ext/mods/gameserver/data/manager/PcCafeManager.onAttackableKill:(Lext/mods/gameserver/model/actor/Player;)V
   #83 = NameAndType        #84:#85       // onAttackableKill:(Lext/mods/gameserver/model/actor/Player;)V
   #84 = Utf8               onAttackableKill
   #85 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #86 = Methodref          #87.#88       // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
   #87 = Class              #89           // ext/mods/Crypta/RandomManager
   #88 = NameAndType        #71:#90       // getInstance:()Lext/mods/Crypta/RandomManager;
   #89 = Utf8               ext/mods/Crypta/RandomManager
   #90 = Utf8               ()Lext/mods/Crypta/RandomManager;
   #91 = Methodref          #87.#92       // ext/mods/Crypta/RandomManager.onKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
   #92 = NameAndType        #93:#94       // onKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
   #93 = Utf8               onKill
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
   #95 = Methodref          #14.#96       // ext/mods/gameserver/model/actor/Attackable.setQuestKiller:(Lext/mods/gameserver/model/actor/Player;)V
   #96 = NameAndType        #97:#85       // setQuestKiller:(Lext/mods/gameserver/model/actor/Player;)V
   #97 = Utf8               setQuestKiller
   #98 = Methodref          #99.#100      // ext/mods/gameserver/model/actor/Player.isInBattleBoss:()Z
   #99 = Class              #101          // ext/mods/gameserver/model/actor/Player
  #100 = NameAndType        #102:#103     // isInBattleBoss:()Z
  #101 = Utf8               ext/mods/gameserver/model/actor/Player
  #102 = Utf8               isInBattleBoss
  #103 = Utf8               ()Z
  #104 = Methodref          #105.#106     // ext/mods/battlerboss/register/BattleBossOpenRegister.getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #105 = Class              #107          // ext/mods/battlerboss/register/BattleBossOpenRegister
  #106 = NameAndType        #71:#108      // getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #107 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister
  #108 = Utf8               ()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #109 = Methodref          #105.#110     // ext/mods/battlerboss/register/BattleBossOpenRegister.onPlayerDeathMonster:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #110 = NameAndType        #111:#112     // onPlayerDeathMonster:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #111 = Utf8               onPlayerDeathMonster
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #113 = Class              #114          // java/lang/Exception
  #114 = Utf8               java/lang/Exception
  #115 = Fieldref           #14.#116      // ext/mods/gameserver/model/actor/Attackable.LOGGER:Lext/mods/commons/logging/CLogger;
  #116 = NameAndType        #117:#118     // LOGGER:Lext/mods/commons/logging/CLogger;
  #117 = Utf8               LOGGER
  #118 = Utf8               Lext/mods/commons/logging/CLogger;
  #119 = String             #120          // Erro em doDie Quest System:
  #120 = Utf8               Erro em doDie Quest System:
  #121 = Methodref          #122.#123     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #122 = Class              #124          // ext/mods/commons/logging/CLogger
  #123 = NameAndType        #125:#126     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #124 = Utf8               ext/mods/commons/logging/CLogger
  #125 = Utf8               warn
  #126 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #127 = InterfaceMethodref #128.#129     // java/util/Set.clear:()V
  #128 = Class              #130          // java/util/Set
  #129 = NameAndType        #131:#132     // clear:()V
  #130 = Utf8               java/util/Set
  #131 = Utf8               clear
  #132 = Utf8               ()V
  #133 = Methodref          #99.#134      // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #134 = NameAndType        #135:#136     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #135 = Utf8               getClassId
  #136 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #138 = Class              #140          // ext/mods/gameserver/enums/actors/ClassId
  #139 = NameAndType        #141:#142     // getId:()I
  #140 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #141 = Utf8               getId
  #142 = Utf8               ()I
  #143 = Methodref          #99.#144      // ext/mods/gameserver/model/actor/Player.getActiveQuestIds:()Ljava/util/Set;
  #144 = NameAndType        #145:#146     // getActiveQuestIds:()Ljava/util/Set;
  #145 = Utf8               getActiveQuestIds
  #146 = Utf8               ()Ljava/util/Set;
  #147 = InterfaceMethodref #128.#148     // java/util/Set.iterator:()Ljava/util/Iterator;
  #148 = NameAndType        #149:#150     // iterator:()Ljava/util/Iterator;
  #149 = Utf8               iterator
  #150 = Utf8               ()Ljava/util/Iterator;
  #151 = InterfaceMethodref #152.#153     // java/util/Iterator.hasNext:()Z
  #152 = Class              #154          // java/util/Iterator
  #153 = NameAndType        #155:#103     // hasNext:()Z
  #154 = Utf8               java/util/Iterator
  #155 = Utf8               hasNext
  #156 = InterfaceMethodref #152.#157     // java/util/Iterator.next:()Ljava/lang/Object;
  #157 = NameAndType        #158:#159     // next:()Ljava/lang/Object;
  #158 = Utf8               next
  #159 = Utf8               ()Ljava/lang/Object;
  #160 = Class              #161          // java/lang/Integer
  #161 = Utf8               java/lang/Integer
  #162 = Methodref          #160.#163     // java/lang/Integer.intValue:()I
  #163 = NameAndType        #164:#142     // intValue:()I
  #164 = Utf8               intValue
  #165 = Methodref          #99.#166      // ext/mods/gameserver/model/actor/Player.isQuestCompleted:(I)Z
  #166 = NameAndType        #167:#168     // isQuestCompleted:(I)Z
  #167 = Utf8               isQuestCompleted
  #168 = Utf8               (I)Z
  #169 = Methodref          #170.#171     // ext/mods/quests/QuestData.getInstance:()Lext/mods/quests/QuestData;
  #170 = Class              #172          // ext/mods/quests/QuestData
  #171 = NameAndType        #71:#173      // getInstance:()Lext/mods/quests/QuestData;
  #172 = Utf8               ext/mods/quests/QuestData
  #173 = Utf8               ()Lext/mods/quests/QuestData;
  #174 = Methodref          #170.#175     // ext/mods/quests/QuestData.getQuest:(I)Lext/mods/quests/holder/QuestHolder;
  #175 = NameAndType        #176:#177     // getQuest:(I)Lext/mods/quests/holder/QuestHolder;
  #176 = Utf8               getQuest
  #177 = Utf8               (I)Lext/mods/quests/holder/QuestHolder;
  #178 = Methodref          #179.#180     // ext/mods/quests/holder/QuestHolder.getObjectivesForClass:(I)Ljava/util/List;
  #179 = Class              #181          // ext/mods/quests/holder/QuestHolder
  #180 = NameAndType        #182:#183     // getObjectivesForClass:(I)Ljava/util/List;
  #181 = Utf8               ext/mods/quests/holder/QuestHolder
  #182 = Utf8               getObjectivesForClass
  #183 = Utf8               (I)Ljava/util/List;
  #184 = InterfaceMethodref #185.#186     // java/util/List.isEmpty:()Z
  #185 = Class              #187          // java/util/List
  #186 = NameAndType        #188:#103     // isEmpty:()Z
  #187 = Utf8               java/util/List
  #188 = Utf8               isEmpty
  #189 = InterfaceMethodref #185.#148     // java/util/List.iterator:()Ljava/util/Iterator;
  #190 = Class              #191          // ext/mods/quests/holder/QuestObjective
  #191 = Utf8               ext/mods/quests/holder/QuestObjective
  #192 = Methodref          #190.#193     // ext/mods/quests/holder/QuestObjective.getNpcId:()I
  #193 = NameAndType        #194:#142     // getNpcId:()I
  #194 = Utf8               getNpcId
  #195 = Methodref          #14.#193      // ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
  #196 = Methodref          #99.#197      // ext/mods/gameserver/model/actor/Player.increaseQuestKillCount:(II)V
  #197 = NameAndType        #198:#199     // increaseQuestKillCount:(II)V
  #198 = Utf8               increaseQuestKillCount
  #199 = Utf8               (II)V
  #200 = Methodref          #99.#201      // ext/mods/gameserver/model/actor/Player.getQuestKillCount:(II)J
  #201 = NameAndType        #202:#203     // getQuestKillCount:(II)J
  #202 = Utf8               getQuestKillCount
  #203 = Utf8               (II)J
  #204 = Methodref          #190.#205     // ext/mods/quests/holder/QuestObjective.getCount:()I
  #205 = NameAndType        #206:#142     // getCount:()I
  #206 = Utf8               getCount
  #207 = String             #208          // Objective complete: You have killed all required monsters.
  #208 = Utf8               Objective complete: You have killed all required monsters.
  #209 = Methodref          #99.#210      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #210 = NameAndType        #211:#212     // sendMessage:(Ljava/lang/String;)V
  #211 = Utf8               sendMessage
  #212 = Utf8               (Ljava/lang/String;)V
  #213 = Methodref          #179.#214     // ext/mods/quests/holder/QuestHolder.getRewardsForClass:(I)Ljava/util/List;
  #214 = NameAndType        #215:#183     // getRewardsForClass:(I)Ljava/util/List;
  #215 = Utf8               getRewardsForClass
  #216 = Class              #217          // ext/mods/quests/holder/QuestReward
  #217 = Utf8               ext/mods/quests/holder/QuestReward
  #218 = Methodref          #219.#220     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #219 = Class              #221          // ext/mods/gameserver/data/xml/ItemData
  #220 = NameAndType        #71:#222      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #221 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #222 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #223 = Methodref          #216.#224     // ext/mods/quests/holder/QuestReward.getItemId:()I
  #224 = NameAndType        #225:#142     // getItemId:()I
  #225 = Utf8               getItemId
  #226 = Methodref          #219.#227     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #227 = NameAndType        #228:#229     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #228 = Utf8               getTemplate
  #229 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #230 = Methodref          #216.#205     // ext/mods/quests/holder/QuestReward.getCount:()I
  #231 = Methodref          #99.#232      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #232 = NameAndType        #233:#234     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #233 = Utf8               addItem
  #234 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #235 = Methodref          #179.#139     // ext/mods/quests/holder/QuestHolder.getId:()I
  #236 = Methodref          #99.#237      // ext/mods/gameserver/model/actor/Player.resetQuestKillCount:(II)V
  #237 = NameAndType        #238:#199     // resetQuestKillCount:(II)V
  #238 = Utf8               resetQuestKillCount
  #239 = Methodref          #99.#240      // ext/mods/gameserver/model/actor/Player.setQuestCompleted:(IZ)V
  #240 = NameAndType        #241:#242     // setQuestCompleted:(IZ)V
  #241 = Utf8               setQuestCompleted
  #242 = Utf8               (IZ)V
  #243 = Methodref          #179.#244     // ext/mods/quests/holder/QuestHolder.getSound:()Ljava/lang/String;
  #244 = NameAndType        #245:#246     // getSound:()Ljava/lang/String;
  #245 = Utf8               getSound
  #246 = Utf8               ()Ljava/lang/String;
  #247 = Methodref          #248.#186     // java/lang/String.isEmpty:()Z
  #248 = Class              #249          // java/lang/String
  #249 = Utf8               java/lang/String
  #250 = Class              #251          // ext/mods/gameserver/network/serverpackets/PlaySound
  #251 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #252 = Methodref          #250.#253     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
  #253 = NameAndType        #5:#212       // "<init>":(Ljava/lang/String;)V
  #254 = Methodref          #99.#255      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #255 = NameAndType        #256:#257     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #256 = Utf8               sendPacket
  #257 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #258 = String             #259          // ItemSound.quest_tutorial
  #259 = Utf8               ItemSound.quest_tutorial
  #260 = Methodref          #261.#262     // ext/mods/quests/QuestManager.getInstance:()Lext/mods/quests/QuestManager;
  #261 = Class              #263          // ext/mods/quests/QuestManager
  #262 = NameAndType        #71:#264      // getInstance:()Lext/mods/quests/QuestManager;
  #263 = Utf8               ext/mods/quests/QuestManager
  #264 = Utf8               ()Lext/mods/quests/QuestManager;
  #265 = Methodref          #261.#266     // ext/mods/quests/QuestManager.showCompleteQuest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/quests/holder/QuestHolder;I)V
  #266 = NameAndType        #267:#268     // showCompleteQuest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/quests/holder/QuestHolder;I)V
  #267 = Utf8               showCompleteQuest
  #268 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/quests/holder/QuestHolder;I)V
  #269 = Methodref          #50.#129      // ext/mods/gameserver/model/actor/container/attackable/AggroList.clear:()V
  #270 = Methodref          #23.#271      // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #271 = NameAndType        #272:#273     // getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #272 = Utf8               getHateList
  #273 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #274 = Methodref          #275.#129     // ext/mods/gameserver/model/actor/container/attackable/HateList.clear:()V
  #275 = Class              #276          // ext/mods/gameserver/model/actor/container/attackable/HateList
  #276 = Utf8               ext/mods/gameserver/model/actor/container/attackable/HateList
  #277 = Methodref          #2.#278       // ext/mods/gameserver/model/actor/Npc.onSpawn:()V
  #278 = NameAndType        #279:#132     // onSpawn:()V
  #279 = Utf8               onSpawn
  #280 = Methodref          #14.#281      // ext/mods/gameserver/model/actor/Attackable.isInActiveRegion:()Z
  #281 = NameAndType        #282:#103     // isInActiveRegion:()Z
  #282 = Utf8               isInActiveRegion
  #283 = Methodref          #23.#284      // ext/mods/gameserver/model/actor/ai/type/AttackableAI.stopAITask:()V
  #284 = NameAndType        #285:#132     // stopAITask:()V
  #285 = Utf8               stopAITask
  #286 = Methodref          #14.#287      // ext/mods/gameserver/model/actor/Attackable.getAttackByList:()Ljava/util/Set;
  #287 = NameAndType        #288:#146     // getAttackByList:()Ljava/util/Set;
  #288 = Utf8               getAttackByList
  #289 = Methodref          #2.#290       // ext/mods/gameserver/model/actor/Npc.onInactiveRegion:()V
  #290 = NameAndType        #291:#132     // onInactiveRegion:()V
  #291 = Utf8               onInactiveRegion
  #292 = InterfaceMethodref #128.#293     // java/util/Set.add:(Ljava/lang/Object;)Z
  #293 = NameAndType        #294:#295     // add:(Ljava/lang/Object;)Z
  #294 = Utf8               add
  #295 = Utf8               (Ljava/lang/Object;)Z
  #296 = Methodref          #14.#297      // ext/mods/gameserver/model/actor/Attackable.isInMyTerritory:()Z
  #297 = NameAndType        #298:#103     // isInMyTerritory:()Z
  #298 = Utf8               isInMyTerritory
  #299 = Methodref          #275.#186     // ext/mods/gameserver/model/actor/container/attackable/HateList.isEmpty:()Z
  #300 = Methodref          #14.#301      // ext/mods/gameserver/model/actor/Attackable.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #301 = NameAndType        #302:#303     // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #302 = Utf8               getSpawnLocation
  #303 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #304 = Methodref          #14.#305      // ext/mods/gameserver/model/actor/Attackable.getDriftRange:()I
  #305 = NameAndType        #306:#142     // getDriftRange:()I
  #306 = Utf8               getDriftRange
  #307 = Methodref          #14.#308      // ext/mods/gameserver/model/actor/Attackable.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #308 = NameAndType        #309:#310     // isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #309 = Utf8               isIn2DRadius
  #310 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
  #311 = Methodref          #50.#312      // ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
  #312 = NameAndType        #313:#132     // cleanAllHate:()V
  #313 = Utf8               cleanAllHate
  #314 = Methodref          #14.#315      // ext/mods/gameserver/model/actor/Attackable.forceWalkStance:()V
  #315 = NameAndType        #316:#132     // forceWalkStance:()V
  #316 = Utf8               forceWalkStance
  #317 = Methodref          #14.#318      // ext/mods/gameserver/model/actor/Attackable.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #318 = NameAndType        #319:#320     // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #319 = Utf8               getMove
  #320 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #321 = Methodref          #322.#323     // ext/mods/gameserver/model/actor/move/CreatureMove.getGeoPathFailCount:()I
  #322 = Class              #324          // ext/mods/gameserver/model/actor/move/CreatureMove
  #323 = NameAndType        #325:#142     // getGeoPathFailCount:()I
  #324 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #325 = Utf8               getGeoPathFailCount
  #326 = Methodref          #14.#327      // ext/mods/gameserver/model/actor/Attackable.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #327 = NameAndType        #328:#329     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #328 = Utf8               teleportTo
  #329 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #330 = Methodref          #322.#331     // ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #331 = NameAndType        #332:#333     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #332 = Utf8               maybeMoveToLocation
  #333 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #334 = InvokeDynamic      #0:#335       // #0:run:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/lang/Runnable;
  #335 = NameAndType        #336:#337     // run:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/lang/Runnable;
  #336 = Utf8               run
  #337 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)Ljava/lang/Runnable;
  #338 = Methodref          #339.#340     // ext/mods/commons/random/Rnd.get:(II)I
  #339 = Class              #341          // ext/mods/commons/random/Rnd
  #340 = NameAndType        #342:#343     // get:(II)I
  #341 = Utf8               ext/mods/commons/random/Rnd
  #342 = Utf8               get
  #343 = Utf8               (II)I
  #344 = Float              100.0f
  #345 = Methodref          #14.#346      // ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #346 = NameAndType        #347:#348     // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #347 = Utf8               getStatus
  #348 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #349 = Methodref          #32.#350      // ext/mods/gameserver/model/actor/status/AttackableStatus.getMoveSpeed:()F
  #350 = NameAndType        #351:#352     // getMoveSpeed:()F
  #351 = Utf8               getMoveSpeed
  #352 = Utf8               ()F
  #353 = Methodref          #354.#355     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #354 = Class              #356          // ext/mods/commons/pool/ThreadPool
  #355 = NameAndType        #357:#358     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #356 = Utf8               ext/mods/commons/pool/ThreadPool
  #357 = Utf8               schedule
  #358 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #359 = Fieldref           #360.#361     // ext/mods/Config.MAX_DRIFT_RANGE:I
  #360 = Class              #362          // ext/mods/Config
  #361 = NameAndType        #363:#364     // MAX_DRIFT_RANGE:I
  #362 = Utf8               ext/mods/Config
  #363 = Utf8               MAX_DRIFT_RANGE
  #364 = Utf8               I
  #365 = Fieldref           #14.#366      // ext/mods/gameserver/model/actor/Attackable._isNoRndWalk:Z
  #366 = NameAndType        #367:#368     // _isNoRndWalk:Z
  #367 = Utf8               _isNoRndWalk
  #368 = Utf8               Z
  #369 = Methodref          #23.#370      // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #370 = NameAndType        #371:#372     // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #371 = Utf8               getCurrentIntention
  #372 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #373 = Methodref          #374.#375     // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
  #374 = Class              #376          // ext/mods/gameserver/model/actor/ai/Intention
  #375 = NameAndType        #377:#378     // getType:()Lext/mods/gameserver/enums/IntentionType;
  #376 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #377 = Utf8               getType
  #378 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
  #379 = Fieldref           #380.#381     // ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
  #380 = Class              #382          // ext/mods/gameserver/enums/IntentionType
  #381 = NameAndType        #383:#384     // WANDER:Lext/mods/gameserver/enums/IntentionType;
  #382 = Utf8               ext/mods/gameserver/enums/IntentionType
  #383 = Utf8               WANDER
  #384 = Utf8               Lext/mods/gameserver/enums/IntentionType;
  #385 = Methodref          #14.#386      // ext/mods/gameserver/model/actor/Attackable.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #386 = NameAndType        #387:#303     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #387 = Utf8               getPosition
  #388 = Methodref          #389.#390     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #389 = Class              #391          // ext/mods/gameserver/model/location/SpawnLocation
  #390 = NameAndType        #392:#142     // getX:()I
  #391 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #392 = Utf8               getX
  #393 = Methodref          #389.#394     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #394 = NameAndType        #395:#142     // getY:()I
  #395 = Utf8               getY
  #396 = Methodref          #14.#397      // ext/mods/gameserver/model/actor/Attackable.getHeading:()I
  #397 = NameAndType        #398:#142     // getHeading:()I
  #398 = Utf8               getHeading
  #399 = Methodref          #400.#401     // ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
  #400 = Class              #402          // ext/mods/commons/math/MathUtil
  #401 = NameAndType        #403:#404     // convertHeadingToDegree:(I)D
  #402 = Utf8               ext/mods/commons/math/MathUtil
  #403 = Utf8               convertHeadingToDegree
  #404 = Utf8               (I)D
  #405 = Double             180.0d
  #407 = Methodref          #14.#408      // ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #408 = NameAndType        #228:#409     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #409 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #410 = Methodref          #411.#412     // ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionRadius:()D
  #411 = Class              #413          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #412 = NameAndType        #414:#415     // getCollisionRadius:()D
  #413 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #414 = Utf8               getCollisionRadius
  #415 = Utf8               ()D
  #416 = Methodref          #417.#418     // java/lang/Math.min:(II)I
  #417 = Class              #419          // java/lang/Math
  #418 = NameAndType        #420:#343     // min:(II)I
  #419 = Utf8               java/lang/Math
  #420 = Utf8               min
  #421 = Methodref          #400.#422     // ext/mods/commons/math/MathUtil.getNewLocationByDistanceAndDegree:(IIDI)Lext/mods/gameserver/model/location/Point2D;
  #422 = NameAndType        #423:#424     // getNewLocationByDistanceAndDegree:(IIDI)Lext/mods/gameserver/model/location/Point2D;
  #423 = Utf8               getNewLocationByDistanceAndDegree
  #424 = Utf8               (IIDI)Lext/mods/gameserver/model/location/Point2D;
  #425 = Class              #426          // ext/mods/gameserver/model/location/Location
  #426 = Utf8               ext/mods/gameserver/model/location/Location
  #427 = Methodref          #428.#390     // ext/mods/gameserver/model/location/Point2D.getX:()I
  #428 = Class              #429          // ext/mods/gameserver/model/location/Point2D
  #429 = Utf8               ext/mods/gameserver/model/location/Point2D
  #430 = Methodref          #428.#394     // ext/mods/gameserver/model/location/Point2D.getY:()I
  #431 = Methodref          #389.#432     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #432 = NameAndType        #433:#142     // getZ:()I
  #433 = Utf8               getZ
  #434 = Methodref          #425.#435     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #435 = NameAndType        #5:#436       // "<init>":(III)V
  #436 = Utf8               (III)V
  #437 = Utf8               Signature
  #438 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;
  #439 = Utf8               Code
  #440 = Utf8               LineNumberTable
  #441 = Utf8               LocalVariableTable
  #442 = Utf8               this
  #443 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #444 = Utf8               objectId
  #445 = Utf8               template
  #446 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #447 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI<+Lext/mods/gameserver/model/actor/Attackable;>;
  #448 = Utf8               setAI
  #449 = Utf8               setStatus
  #450 = Utf8               creature
  #451 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #452 = Utf8               object
  #453 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #454 = Utf8               StackMapTable
  #455 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #456 = Utf8               damage
  #457 = Utf8               D
  #458 = Utf8               attacker
  #459 = Utf8               skill
  #460 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #461 = Utf8               randomManagerInstance
  #462 = Utf8               Ljava/lang/Object;
  #463 = Utf8               player
  #464 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #465 = Utf8               e
  #466 = Utf8               Ljava/lang/Exception;
  #467 = Utf8               killer
  #468 = Class              #469          // java/lang/Object
  #469 = Utf8               java/lang/Object
  #470 = Utf8               obj
  #471 = Utf8               Lext/mods/quests/holder/QuestObjective;
  #472 = Utf8               currentKills
  #473 = Utf8               J
  #474 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #475 = Utf8               reward
  #476 = Utf8               Lext/mods/quests/holder/QuestReward;
  #477 = Utf8               quest
  #478 = Utf8               Lext/mods/quests/holder/QuestHolder;
  #479 = Utf8               objectives
  #480 = Utf8               Ljava/util/List;
  #481 = Utf8               isQuestNpc
  #482 = Utf8               allRequirementsMet
  #483 = Utf8               questId
  #484 = Utf8               playerClassId
  #485 = Utf8               LocalVariableTypeTable
  #486 = Utf8               Ljava/util/List<Lext/mods/quests/holder/QuestObjective;>;
  #487 = Utf8               onInteract
  #488 = Utf8               isLethalable
  #489 = Utf8               addAttacker
  #490 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #491 = Utf8               returnHome
  #492 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;
  #493 = Utf8               isNoRndWalk
  #494 = Utf8               setNoRndWalk
  #495 = Utf8               (Z)V
  #496 = Utf8               value
  #497 = Utf8               getActiveWeapon
  #498 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #499 = Utf8               isGuard
  #500 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #501 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #502 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #503 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #504 = Utf8               lambda$returnHome$0
  #505 = Utf8               backwardsPoint
  #506 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #507 = Utf8               SourceFile
  #508 = Utf8               Attackable.java
  #509 = Utf8               BootstrapMethods
  #510 = MethodType         #132          //  ()V
  #511 = MethodHandle       5:#512        // REF_invokeVirtual ext/mods/gameserver/model/actor/Attackable.lambda$returnHome$0:()V
  #512 = Methodref          #14.#513      // ext/mods/gameserver/model/actor/Attackable.lambda$returnHome$0:()V
  #513 = NameAndType        #504:#132     // lambda$returnHome$0:()V
  #514 = MethodHandle       6:#515        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #515 = Methodref          #516.#517     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #516 = Class              #518          // java/lang/invoke/LambdaMetafactory
  #517 = NameAndType        #519:#520     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #518 = Utf8               java/lang/invoke/LambdaMetafactory
  #519 = Utf8               metafactory
  #520 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #521 = Utf8               InnerClasses
  #522 = Class              #523          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #523 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #524 = Utf8               KeySetView
  #525 = Class              #526          // java/lang/invoke/MethodHandles$Lookup
  #526 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #527 = Class              #528          // java/lang/invoke/MethodHandles
  #528 = Utf8               java/lang/invoke/MethodHandles
  #529 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.Attackable(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        10: putfield      #13                 // Field _attackedBy:Ljava/util/Set;
        13: return
      LineNumberTable:
        line 62: 0
        line 56: 6
        line 63: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Attackable;
            0      14     1 objectId   I
            0      14     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public ext.mods.gameserver.model.actor.ai.type.AttackableAI<? extends ext.mods.gameserver.model.actor.Attackable> getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #23                 // class ext/mods/gameserver/model/actor/ai/type/AttackableAI
         7: areturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Attackable;
    Signature: #447                         // ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI<+Lext/mods/gameserver/model/actor/Attackable;>;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #23                 // class ext/mods/gameserver/model/actor/ai/type/AttackableAI
         4: dup
         5: aload_0
         6: invokespecial #25                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI."<init>":(Lext/mods/gameserver/model/actor/Attackable;)V
         9: putfield      #19                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 74: 0
        line 75: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public ext.mods.gameserver.model.actor.status.AttackableStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: checkcast     #32                 // class ext/mods/gameserver/model/actor/status/AttackableStatus
         7: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public void setStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #32                 // class ext/mods/gameserver/model/actor/status/AttackableStatus
         4: dup
         5: aload_0
         6: invokespecial #34                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus."<init>":(Lext/mods/gameserver/model/actor/Attackable;)V
         9: putfield      #28                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        12: return
      LineNumberTable:
        line 86: 0
        line 87: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public void removeKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #35                 // Method ext/mods/gameserver/model/actor/Npc.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
         5: aload_1
         6: instanceof    #39                 // class ext/mods/gameserver/model/actor/Creature
         9: ifeq          29
        12: aload_1
        13: checkcast     #39                 // class ext/mods/gameserver/model/actor/Creature
        16: astore_2
        17: aload_0
        18: invokevirtual #41                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        21: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        24: aload_2
        25: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        28: pop
        29: return
      LineNumberTable:
        line 92: 0
        line 94: 5
        line 95: 17
        line 96: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      12     2 creature   Lext/mods/gameserver/model/actor/Creature;
            0      30     0  this   Lext/mods/gameserver/model/actor/Attackable;
            0      30     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 1
        frame_type = 29 /* same */

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=4
         0: aload_0
         1: dload_1
         2: aload_3
         3: iconst_1
         4: iconst_0
         5: aload         4
         7: invokevirtual #55                 // Method reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
        10: return
      LineNumberTable:
        line 101: 0
        line 102: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Attackable;
            0      11     1 damage   D
            0      11     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      11     4 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #59                 // Method ext/mods/gameserver/model/actor/Npc.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: ifnull        21
        14: aload_1
        15: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        18: goto          22
        21: aconst_null
        22: astore_2
        23: aload_2
        24: ifnull        78
        27: invokestatic  #67                 // Method ext/mods/extensions/listener/manager/NpcListenerManager.getInstance:()Lext/mods/extensions/listener/manager/NpcListenerManager;
        30: aload_0
        31: aload_2
        32: invokevirtual #73                 // Method ext/mods/extensions/listener/manager/NpcListenerManager.notifyNpcKill:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        35: invokestatic  #77                 // Method ext/mods/gameserver/data/manager/PcCafeManager.getInstance:()Lext/mods/gameserver/data/manager/PcCafeManager;
        38: aload_2
        39: invokevirtual #82                 // Method ext/mods/gameserver/data/manager/PcCafeManager.onAttackableKill:(Lext/mods/gameserver/model/actor/Player;)V
        42: invokestatic  #86                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        45: astore_3
        46: aload_3
        47: ifnull        58
        50: invokestatic  #86                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        53: aload_2
        54: aload_0
        55: invokevirtual #91                 // Method ext/mods/Crypta/RandomManager.onKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
        58: aload_0
        59: aload_2
        60: invokevirtual #95                 // Method setQuestKiller:(Lext/mods/gameserver/model/actor/Player;)V
        63: aload_2
        64: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.isInBattleBoss:()Z
        67: ifeq          78
        70: invokestatic  #104                // Method ext/mods/battlerboss/register/BattleBossOpenRegister.getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
        73: aload_2
        74: aload_0
        75: invokevirtual #109                // Method ext/mods/battlerboss/register/BattleBossOpenRegister.onPlayerDeathMonster:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
        78: goto          91
        81: astore_2
        82: getstatic     #115                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        85: ldc           #119                // String Erro em doDie Quest System:
        87: aload_2
        88: invokevirtual #121                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
        91: aload_0
        92: getfield      #13                 // Field _attackedBy:Ljava/util/Set;
        95: invokeinterface #127,  1          // InterfaceMethod java/util/Set.clear:()V
       100: iconst_1
       101: ireturn
      Exception table:
         from    to  target type
            10    78    81   Class java/lang/Exception
      LineNumberTable:
        line 107: 0
        line 108: 8
        line 112: 10
        line 114: 23
        line 116: 27
        line 117: 35
        line 119: 42
        line 120: 46
        line 121: 50
        line 124: 58
        line 125: 63
        line 127: 70
        line 134: 78
        line 131: 81
        line 133: 82
        line 136: 91
        line 137: 100
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      32     3 randomManagerInstance   Ljava/lang/Object;
           23      55     2 player   Lext/mods/gameserver/model/actor/Player;
           82       9     2     e   Ljava/lang/Exception;
            0     102     0  this   Lext/mods/gameserver/model/actor/Attackable;
            0     102     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 7
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/Object ]
        frame_type = 249 /* chop */
          offset_delta = 19
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void setQuestKiller(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=13, args_size=2
         0: aload_1
         1: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
         4: invokevirtual #137                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
         7: istore_2
         8: aload_1
         9: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.getActiveQuestIds:()Ljava/util/Set;
        12: invokeinterface #147,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        17: astore_3
        18: aload_3
        19: invokeinterface #151,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          425
        27: aload_3
        28: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #160                // class java/lang/Integer
        36: invokevirtual #162                // Method java/lang/Integer.intValue:()I
        39: istore        4
        41: aload_1
        42: iload         4
        44: invokevirtual #165                // Method ext/mods/gameserver/model/actor/Player.isQuestCompleted:(I)Z
        47: ifeq          53
        50: goto          18
        53: invokestatic  #169                // Method ext/mods/quests/QuestData.getInstance:()Lext/mods/quests/QuestData;
        56: iload         4
        58: invokevirtual #174                // Method ext/mods/quests/QuestData.getQuest:(I)Lext/mods/quests/holder/QuestHolder;
        61: astore        5
        63: aload         5
        65: ifnonnull     71
        68: goto          18
        71: aload         5
        73: iload_2
        74: invokevirtual #178                // Method ext/mods/quests/holder/QuestHolder.getObjectivesForClass:(I)Ljava/util/List;
        77: astore        6
        79: aload         6
        81: invokeinterface #184,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        86: ifeq          92
        89: goto          18
        92: iconst_0
        93: istore        7
        95: aload         6
        97: invokeinterface #189,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       102: astore        8
       104: aload         8
       106: invokeinterface #151,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       111: ifeq          147
       114: aload         8
       116: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       121: checkcast     #190                // class ext/mods/quests/holder/QuestObjective
       124: astore        9
       126: aload         9
       128: invokevirtual #192                // Method ext/mods/quests/holder/QuestObjective.getNpcId:()I
       131: aload_0
       132: invokevirtual #195                // Method getNpcId:()I
       135: if_icmpne     144
       138: iconst_1
       139: istore        7
       141: goto          147
       144: goto          104
       147: iload         7
       149: ifne          155
       152: goto          18
       155: aload_1
       156: iload         4
       158: aload_0
       159: invokevirtual #195                // Method getNpcId:()I
       162: invokevirtual #196                // Method ext/mods/gameserver/model/actor/Player.increaseQuestKillCount:(II)V
       165: iconst_1
       166: istore        8
       168: aload         6
       170: invokeinterface #189,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       175: astore        9
       177: aload         9
       179: invokeinterface #151,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       184: ifeq          233
       187: aload         9
       189: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       194: checkcast     #190                // class ext/mods/quests/holder/QuestObjective
       197: astore        10
       199: aload_1
       200: iload         4
       202: aload         10
       204: invokevirtual #192                // Method ext/mods/quests/holder/QuestObjective.getNpcId:()I
       207: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Player.getQuestKillCount:(II)J
       210: lstore        11
       212: lload         11
       214: aload         10
       216: invokevirtual #204                // Method ext/mods/quests/holder/QuestObjective.getCount:()I
       219: i2l
       220: lcmp
       221: ifge          230
       224: iconst_0
       225: istore        8
       227: goto          233
       230: goto          177
       233: iload         8
       235: ifeq          422
       238: aload_1
       239: ldc           #207                // String Objective complete: You have killed all required monsters.
       241: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       244: aload         5
       246: iload_2
       247: invokevirtual #213                // Method ext/mods/quests/holder/QuestHolder.getRewardsForClass:(I)Ljava/util/List;
       250: invokeinterface #189,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       255: astore        9
       257: aload         9
       259: invokeinterface #151,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       264: ifeq          316
       267: aload         9
       269: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       274: checkcast     #216                // class ext/mods/quests/holder/QuestReward
       277: astore        10
       279: invokestatic  #218                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       282: aload         10
       284: invokevirtual #223                // Method ext/mods/quests/holder/QuestReward.getItemId:()I
       287: invokevirtual #226                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       290: astore        11
       292: aload         11
       294: ifnull        313
       297: aload_1
       298: aload         10
       300: invokevirtual #223                // Method ext/mods/quests/holder/QuestReward.getItemId:()I
       303: aload         10
       305: invokevirtual #230                // Method ext/mods/quests/holder/QuestReward.getCount:()I
       308: iconst_1
       309: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       312: pop
       313: goto          257
       316: aload         6
       318: invokeinterface #189,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       323: astore        9
       325: aload         9
       327: invokeinterface #151,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       332: ifeq          364
       335: aload         9
       337: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       342: checkcast     #190                // class ext/mods/quests/holder/QuestObjective
       345: astore        10
       347: aload_1
       348: aload         5
       350: invokevirtual #235                // Method ext/mods/quests/holder/QuestHolder.getId:()I
       353: aload         10
       355: invokevirtual #192                // Method ext/mods/quests/holder/QuestObjective.getNpcId:()I
       358: invokevirtual #236                // Method ext/mods/gameserver/model/actor/Player.resetQuestKillCount:(II)V
       361: goto          325
       364: aload_1
       365: iload         4
       367: iconst_1
       368: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Player.setQuestCompleted:(IZ)V
       371: aload         5
       373: invokevirtual #243                // Method ext/mods/quests/holder/QuestHolder.getSound:()Ljava/lang/String;
       376: invokevirtual #247                // Method java/lang/String.isEmpty:()Z
       379: ifne          398
       382: aload_1
       383: new           #250                // class ext/mods/gameserver/network/serverpackets/PlaySound
       386: dup
       387: aload         5
       389: invokevirtual #243                // Method ext/mods/quests/holder/QuestHolder.getSound:()Ljava/lang/String;
       392: invokespecial #252                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
       395: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       398: aload_1
       399: new           #250                // class ext/mods/gameserver/network/serverpackets/PlaySound
       402: dup
       403: ldc_w         #258                // String ItemSound.quest_tutorial
       406: invokespecial #252                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
       409: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       412: invokestatic  #260                // Method ext/mods/quests/QuestManager.getInstance:()Lext/mods/quests/QuestManager;
       415: aload_1
       416: aload         5
       418: iconst_1
       419: invokevirtual #265                // Method ext/mods/quests/QuestManager.showCompleteQuest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/quests/holder/QuestHolder;I)V
       422: goto          18
       425: return
      LineNumberTable:
        line 142: 0
        line 144: 8
        line 146: 41
        line 147: 50
        line 149: 53
        line 150: 63
        line 151: 68
        line 153: 71
        line 154: 79
        line 155: 89
        line 157: 92
        line 158: 95
        line 160: 126
        line 162: 138
        line 163: 141
        line 165: 144
        line 167: 147
        line 168: 152
        line 170: 155
        line 172: 165
        line 173: 168
        line 175: 199
        line 176: 212
        line 178: 224
        line 179: 227
        line 181: 230
        line 183: 233
        line 185: 238
        line 187: 244
        line 189: 279
        line 190: 292
        line 192: 297
        line 194: 313
        line 196: 316
        line 198: 347
        line 199: 361
        line 201: 364
        line 203: 371
        line 205: 382
        line 208: 398
        line 210: 412
        line 212: 422
        line 213: 425
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          126      18     9   obj   Lext/mods/quests/holder/QuestObjective;
          212      18    11 currentKills   J
          199      31    10   obj   Lext/mods/quests/holder/QuestObjective;
          292      21    11 template   Lext/mods/gameserver/model/item/kind/Item;
          279      34    10 reward   Lext/mods/quests/holder/QuestReward;
          347      14    10   obj   Lext/mods/quests/holder/QuestObjective;
           63     359     5 quest   Lext/mods/quests/holder/QuestHolder;
           79     343     6 objectives   Ljava/util/List;
           95     327     7 isQuestNpc   Z
          168     254     8 allRequirementsMet   Z
           41     381     4 questId   I
            0     426     0  this   Lext/mods/gameserver/model/actor/Attackable;
            0     426     1 player   Lext/mods/gameserver/model/actor/Player;
            8     418     2 playerClassId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           79     343     6 objectives   Ljava/util/List<Lext/mods/quests/holder/QuestObjective;>;
      StackMapTable: number_of_entries = 19
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/quests/holder/QuestHolder ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/util/List ]
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ int, class java/util/Iterator ]
        frame_type = 39 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 7 /* same */
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ int, class java/util/Iterator ]
        frame_type = 52 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/Iterator ]
        frame_type = 55 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 38
        frame_type = 33 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/Attackable, class ext/mods/gameserver/model/actor/Player, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #41                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
         4: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
         7: invokevirtual #269                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.clear:()V
        10: aload_0
        11: invokevirtual #41                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        14: invokevirtual #270                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
        17: invokevirtual #274                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.clear:()V
        20: aload_0
        21: invokespecial #277                // Method ext/mods/gameserver/model/actor/Npc.onSpawn:()V
        24: aload_0
        25: invokevirtual #280                // Method isInActiveRegion:()Z
        28: ifne          38
        31: aload_0
        32: invokevirtual #41                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        35: invokevirtual #283                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.stopAITask:()V
        38: return
      LineNumberTable:
        line 218: 0
        line 219: 10
        line 221: 20
        line 223: 24
        line 224: 31
        line 225: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/Attackable;
      StackMapTable: number_of_entries = 1
        frame_type = 38 /* same */

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 230: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Attackable;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;

  public void onInactiveRegion();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #286                // Method getAttackByList:()Ljava/util/Set;
         4: invokeinterface #127,  1          // InterfaceMethod java/util/Set.clear:()V
         9: aload_0
        10: invokespecial #289                // Method ext/mods/gameserver/model/actor/Npc.onInactiveRegion:()V
        13: return
      LineNumberTable:
        line 235: 0
        line 237: 9
        line 238: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public boolean isLethalable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #195                // Method getNpcId:()I
         4: lookupswitch  { // 8

                   22215: 80

                   22216: 80

                   22217: 80

                   35062: 80

                   35368: 80

                   35375: 80

                   35410: 80

                   35629: 80
                 default: 82
            }
        80: iconst_0
        81: ireturn
        82: iconst_1
        83: ireturn
      LineNumberTable:
        line 243: 0
        line 253: 80
        line 255: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/actor/Attackable;
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 80
        frame_type = 1 /* same */

  public void addAttacker(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        9
         4: aload_1
         5: aload_0
         6: if_acmpne     10
         9: return
        10: aload_0
        11: getfield      #13                 // Field _attackedBy:Ljava/util/Set;
        14: aload_1
        15: invokeinterface #292,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        20: pop
        21: return
      LineNumberTable:
        line 264: 0
        line 265: 9
        line 267: 10
        line 268: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/Attackable;
            0      22     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 0 /* same */

  public boolean returnHome();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #296                // Method isInMyTerritory:()Z
         4: ifeq          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: invokevirtual #41                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        13: invokevirtual #270                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
        16: invokevirtual #299                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.isEmpty:()Z
        19: ifne          24
        22: iconst_0
        23: ireturn
        24: aload_0
        25: invokevirtual #300                // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        28: ifnull        46
        31: aload_0
        32: aload_0
        33: invokevirtual #300                // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        36: aload_0
        37: invokevirtual #304                // Method getDriftRange:()I
        40: invokevirtual #307                // Method isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        43: ifeq          48
        46: iconst_0
        47: ireturn
        48: aload_0
        49: invokevirtual #41                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        52: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        55: invokevirtual #311                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
        58: aload_0
        59: invokevirtual #314                // Method forceWalkStance:()V
        62: aload_0
        63: invokevirtual #317                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        66: invokevirtual #321                // Method ext/mods/gameserver/model/actor/move/CreatureMove.getGeoPathFailCount:()I
        69: bipush        10
        71: if_icmplt     86
        74: aload_0
        75: aload_0
        76: invokevirtual #300                // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        79: iconst_0
        80: invokevirtual #326                // Method teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        83: goto          135
        86: aload_0
        87: invokevirtual #317                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        90: aload_0
        91: invokevirtual #300                // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        94: iconst_0
        95: iconst_1
        96: iconst_0
        97: invokevirtual #330                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       100: pop
       101: aload_0
       102: invokedynamic #334,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/lang/Runnable;
       107: sipush        1500
       110: sipush        2500
       113: invokestatic  #338                // Method ext/mods/commons/random/Rnd.get:(II)I
       116: i2f
       117: ldc_w         #344                // float 100.0f
       120: aload_0
       121: invokevirtual #345                // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       124: invokevirtual #349                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getMoveSpeed:()F
       127: fdiv
       128: fmul
       129: f2i
       130: i2l
       131: invokestatic  #353                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       134: pop
       135: iconst_1
       136: ireturn
      LineNumberTable:
        line 275: 0
        line 276: 7
        line 278: 9
        line 279: 22
        line 281: 24
        line 282: 46
        line 284: 48
        line 286: 58
        line 288: 62
        line 289: 74
        line 292: 86
        line 293: 101
        line 300: 113
        line 293: 131
        line 303: 135
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     137     0  this   Lext/mods/gameserver/model/actor/Attackable;
      StackMapTable: number_of_entries = 6
        frame_type = 9 /* same */
        frame_type = 14 /* same */
        frame_type = 21 /* same */
        frame_type = 1 /* same */
        frame_type = 37 /* same */
        frame_type = 48 /* same */

  public int getDriftRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #359                // Field ext/mods/Config.MAX_DRIFT_RANGE:I
         3: ireturn
      LineNumberTable:
        line 308: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public final java.util.Set<ext.mods.gameserver.model.actor.Creature> getAttackByList();
    descriptor: ()Ljava/util/Set;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _attackedBy:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 313: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Attackable;
    Signature: #492                         // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;

  public final boolean isNoRndWalk();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #365                // Field _isNoRndWalk:Z
         4: ireturn
      LineNumberTable:
        line 318: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public final void setNoRndWalk(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #365                // Field _isNoRndWalk:Z
         5: return
      LineNumberTable:
        line 323: 0
        line 324: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Attackable;
            0       6     1 value   Z

  public ext.mods.gameserver.model.item.instance.ItemInstance getActiveWeapon();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 331: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public boolean isGuard();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 336: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public ext.mods.gameserver.model.actor.status.NpcStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/NpcStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #345                // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
         4: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public ext.mods.gameserver.model.actor.ai.type.NpcAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #41                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
         4: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public ext.mods.gameserver.model.actor.status.CreatureStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #345                // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
         4: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Attackable;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #41                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
         4: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Attackable;
}
SourceFile: "Attackable.java"
BootstrapMethods:
  0: #514 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #510 ()V
      #511 REF_invokeVirtual ext/mods/gameserver/model/actor/Attackable.lambda$returnHome$0:()V
      #510 ()V
InnerClasses:
  public static final #524= #522 of #8;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #529= #525 of #527; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
