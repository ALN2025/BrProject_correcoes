// Bytecode for: ext.mods.gameserver.model.actor.instance.Monster
// File: ext\mods\gameserver\model\actor\instance\Monster.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Monster.class
  Last modified 9 de jul de 2026; size 27410 bytes
  MD5 checksum 4d58824df9ee97d4ce68c247cdaff010
  Compiled from "Monster.java"
public class ext.mods.gameserver.model.actor.instance.Monster extends ext.mods.gameserver.model.actor.Attackable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/actor/instance/Monster
  super_class: #2                         // ext/mods/gameserver/model/actor/Attackable
  interfaces: 0, fields: 11, methods: 30, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/actor/Attackable."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
     #2 = Class              #4           // ext/mods/gameserver/model/actor/Attackable
     #3 = NameAndType        #5:#6        // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
     #4 = Utf8               ext/mods/gameserver/model/actor/Attackable
     #5 = Utf8               <init>
     #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
     #7 = Class              #8           // java/util/concurrent/ConcurrentHashMap
     #8 = Utf8               java/util/concurrent/ConcurrentHashMap
     #9 = Methodref          #7.#10       // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #10 = NameAndType        #5:#11       // "<init>":()V
    #11 = Utf8               ()V
    #12 = Fieldref           #13.#14      // ext/mods/gameserver/model/actor/instance/Monster._absorbersList:Ljava/util/Map;
    #13 = Class              #15          // ext/mods/gameserver/model/actor/instance/Monster
    #14 = NameAndType        #16:#17      // _absorbersList:Ljava/util/Map;
    #15 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
    #16 = Utf8               _absorbersList
    #17 = Utf8               Ljava/util/Map;
    #18 = Class              #19          // ext/mods/gameserver/model/actor/container/monster/OverhitState
    #19 = Utf8               ext/mods/gameserver/model/actor/container/monster/OverhitState
    #20 = Methodref          #18.#21      // ext/mods/gameserver/model/actor/container/monster/OverhitState."<init>":(Lext/mods/gameserver/model/actor/instance/Monster;)V
    #21 = NameAndType        #5:#22       // "<init>":(Lext/mods/gameserver/model/actor/instance/Monster;)V
    #22 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)V
    #23 = Fieldref           #13.#24      // ext/mods/gameserver/model/actor/instance/Monster._overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
    #24 = NameAndType        #25:#26      // _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
    #25 = Utf8               _overhitState
    #26 = Utf8               Lext/mods/gameserver/model/actor/container/monster/OverhitState;
    #27 = Class              #28          // ext/mods/gameserver/model/actor/container/monster/SpoilState
    #28 = Utf8               ext/mods/gameserver/model/actor/container/monster/SpoilState
    #29 = Methodref          #27.#10      // ext/mods/gameserver/model/actor/container/monster/SpoilState."<init>":()V
    #30 = Fieldref           #13.#31      // ext/mods/gameserver/model/actor/instance/Monster._spoilState:Lext/mods/gameserver/model/actor/container/monster/SpoilState;
    #31 = NameAndType        #32:#33      // _spoilState:Lext/mods/gameserver/model/actor/container/monster/SpoilState;
    #32 = Utf8               _spoilState
    #33 = Utf8               Lext/mods/gameserver/model/actor/container/monster/SpoilState;
    #34 = Class              #35          // ext/mods/gameserver/model/actor/container/monster/SeedState
    #35 = Utf8               ext/mods/gameserver/model/actor/container/monster/SeedState
    #36 = Methodref          #34.#21      // ext/mods/gameserver/model/actor/container/monster/SeedState."<init>":(Lext/mods/gameserver/model/actor/instance/Monster;)V
    #37 = Fieldref           #13.#38      // ext/mods/gameserver/model/actor/instance/Monster._seedState:Lext/mods/gameserver/model/actor/container/monster/SeedState;
    #38 = NameAndType        #39:#40      // _seedState:Lext/mods/gameserver/model/actor/container/monster/SeedState;
    #39 = Utf8               _seedState
    #40 = Utf8               Lext/mods/gameserver/model/actor/container/monster/SeedState;
    #41 = Fieldref           #13.#42      // ext/mods/gameserver/model/actor/instance/Monster.dungeon:Lext/mods/dungeon/Dungeon;
    #42 = NameAndType        #43:#44      // dungeon:Lext/mods/dungeon/Dungeon;
    #43 = Utf8               dungeon
    #44 = Utf8               Lext/mods/dungeon/Dungeon;
    #45 = Methodref          #13.#46      // ext/mods/gameserver/model/actor/instance/Monster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
    #46 = NameAndType        #47:#48      // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
    #47 = Utf8               getTemplate
    #48 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
    #49 = Methodref          #50.#51      // ext/mods/gameserver/model/actor/template/NpcTemplate.isAgathion:()Z
    #50 = Class              #52          // ext/mods/gameserver/model/actor/template/NpcTemplate
    #51 = NameAndType        #53:#54      // isAgathion:()Z
    #52 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
    #53 = Utf8               isAgathion
    #54 = Utf8               ()Z
    #55 = Methodref          #13.#56      // ext/mods/gameserver/model/actor/instance/Monster.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
    #56 = NameAndType        #57:#58      // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
    #57 = Utf8               getAI
    #58 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
    #59 = Methodref          #60.#61      // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #60 = Class              #62          // ext/mods/gameserver/model/actor/ai/type/AttackableAI
    #61 = NameAndType        #63:#64      // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #62 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
    #63 = Utf8               getAggroList
    #64 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #65 = Methodref          #66.#67      // ext/mods/gameserver/model/actor/container/attackable/AggroList.isEmpty:()Z
    #66 = Class              #68          // ext/mods/gameserver/model/actor/container/attackable/AggroList
    #67 = NameAndType        #69:#54      // isEmpty:()Z
    #68 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
    #69 = Utf8               isEmpty
    #70 = Methodref          #66.#71      // ext/mods/gameserver/model/actor/container/attackable/AggroList.values:()Ljava/util/Collection;
    #71 = NameAndType        #72:#73      // values:()Ljava/util/Collection;
    #72 = Utf8               values
    #73 = Utf8               ()Ljava/util/Collection;
    #74 = InterfaceMethodref #75.#76      // java/util/Collection.iterator:()Ljava/util/Iterator;
    #75 = Class              #77          // java/util/Collection
    #76 = NameAndType        #78:#79      // iterator:()Ljava/util/Iterator;
    #77 = Utf8               java/util/Collection
    #78 = Utf8               iterator
    #79 = Utf8               ()Ljava/util/Iterator;
    #80 = InterfaceMethodref #81.#82      // java/util/Iterator.hasNext:()Z
    #81 = Class              #83          // java/util/Iterator
    #82 = NameAndType        #84:#54      // hasNext:()Z
    #83 = Utf8               java/util/Iterator
    #84 = Utf8               hasNext
    #85 = InterfaceMethodref #81.#86      // java/util/Iterator.next:()Ljava/lang/Object;
    #86 = NameAndType        #87:#88      // next:()Ljava/lang/Object;
    #87 = Utf8               next
    #88 = Utf8               ()Ljava/lang/Object;
    #89 = Class              #90          // ext/mods/gameserver/model/actor/container/npc/AggroInfo
    #90 = Utf8               ext/mods/gameserver/model/actor/container/npc/AggroInfo
    #91 = Methodref          #89.#92      // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
    #92 = NameAndType        #93:#94      // getAttacker:()Lext/mods/gameserver/model/actor/Creature;
    #93 = Utf8               getAttacker
    #94 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
    #95 = Class              #96          // ext/mods/gameserver/model/actor/Playable
    #96 = Utf8               ext/mods/gameserver/model/actor/Playable
    #97 = Methodref          #89.#98      // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getDamage:()D
    #98 = NameAndType        #99:#100     // getDamage:()D
    #99 = Utf8               getDamage
   #100 = Utf8               ()D
   #101 = Fieldref           #102.#103    // ext/mods/Config.PARTY_RANGE:I
   #102 = Class              #104         // ext/mods/Config
   #103 = NameAndType        #105:#106    // PARTY_RANGE:I
   #104 = Utf8               ext/mods/Config
   #105 = Utf8               PARTY_RANGE
   #106 = Utf8               I
   #107 = Methodref          #13.#108     // ext/mods/gameserver/model/actor/instance/Monster.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #108 = NameAndType        #109:#110    // isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #109 = Utf8               isInStrictRadius
   #110 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #111 = Methodref          #95.#112     // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #112 = NameAndType        #113:#114    // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #113 = Utf8               getActingPlayer
   #114 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #115 = InterfaceMethodref #116.#117    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #116 = Class              #118         // java/util/Map
   #117 = NameAndType        #119:#120    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #118 = Utf8               java/util/Map
   #119 = Utf8               get
   #120 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #121 = Class              #122         // ext/mods/gameserver/model/actor/container/npc/RewardInfo
   #122 = Utf8               ext/mods/gameserver/model/actor/container/npc/RewardInfo
   #123 = Methodref          #121.#124    // ext/mods/gameserver/model/actor/container/npc/RewardInfo."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
   #124 = NameAndType        #5:#125      // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
   #125 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
   #126 = InterfaceMethodref #116.#127    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #127 = NameAndType        #128:#129    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #128 = Utf8               put
   #129 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #130 = Methodref          #121.#131    // ext/mods/gameserver/model/actor/container/npc/RewardInfo.addDamage:(D)V
   #131 = NameAndType        #132:#133    // addDamage:(D)V
   #132 = Utf8               addDamage
   #133 = Utf8               (D)V
   #134 = Class              #135         // ext/mods/gameserver/model/actor/Summon
   #135 = Utf8               ext/mods/gameserver/model/actor/Summon
   #136 = Methodref          #121.#98     // ext/mods/gameserver/model/actor/container/npc/RewardInfo.getDamage:()D
   #137 = Fieldref           #13.#138     // ext/mods/gameserver/model/actor/instance/Monster._firstCcAttacker:Lext/mods/gameserver/model/group/CommandChannel;
   #138 = NameAndType        #139:#140    // _firstCcAttacker:Lext/mods/gameserver/model/group/CommandChannel;
   #139 = Utf8               _firstCcAttacker
   #140 = Utf8               Lext/mods/gameserver/model/group/CommandChannel;
   #141 = Methodref          #142.#143    // ext/mods/gameserver/model/group/CommandChannel.getLeader:()Lext/mods/gameserver/model/actor/Player;
   #142 = Class              #144         // ext/mods/gameserver/model/group/CommandChannel
   #143 = NameAndType        #145:#114    // getLeader:()Lext/mods/gameserver/model/actor/Player;
   #144 = Utf8               ext/mods/gameserver/model/group/CommandChannel
   #145 = Utf8               getLeader
   #146 = Methodref          #147.#148    // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #147 = Class              #149         // ext/mods/gameserver/model/actor/Player
   #148 = NameAndType        #150:#54     // isOnline:()Z
   #149 = Utf8               ext/mods/gameserver/model/actor/Player
   #150 = Utf8               isOnline
   #151 = Methodref          #13.#152     // ext/mods/gameserver/model/actor/instance/Monster.doItemDrop:(Lext/mods/gameserver/model/actor/Creature;)V
   #152 = NameAndType        #153:#154    // doItemDrop:(Lext/mods/gameserver/model/actor/Creature;)V
   #153 = Utf8               doItemDrop
   #154 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #155 = InterfaceMethodref #116.#71     // java/util/Map.values:()Ljava/util/Collection;
   #156 = Methodref          #121.#157    // ext/mods/gameserver/model/actor/container/npc/RewardInfo.getAttacker:()Lext/mods/gameserver/model/actor/Playable;
   #157 = NameAndType        #93:#158     // getAttacker:()Lext/mods/gameserver/model/actor/Playable;
   #158 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
   #159 = Methodref          #147.#160    // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #160 = NameAndType        #161:#162    // getParty:()Lext/mods/gameserver/model/group/Party;
   #161 = Utf8               getParty
   #162 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #163 = Methodref          #147.#164    // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #164 = NameAndType        #165:#54     // isDead:()Z
   #165 = Utf8               isDead
   #166 = Methodref          #147.#167    // ext/mods/gameserver/model/actor/Player.knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #167 = NameAndType        #168:#169    // knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #168 = Utf8               knows
   #169 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #170 = Methodref          #147.#171    // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #171 = NameAndType        #172:#173    // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #172 = Utf8               getStatus
   #173 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #174 = Methodref          #175.#176    // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #175 = Class              #177         // ext/mods/gameserver/model/actor/status/PlayerStatus
   #176 = NameAndType        #178:#179    // getLevel:()I
   #177 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #178 = Utf8               getLevel
   #179 = Utf8               ()I
   #180 = Methodref          #13.#181     // ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #181 = NameAndType        #172:#182    // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #182 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #183 = Methodref          #184.#176    // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
   #184 = Class              #185         // ext/mods/gameserver/model/actor/status/AttackableStatus
   #185 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
   #186 = Methodref          #147.#187    // ext/mods/gameserver/model/actor/Player.hasServitor:()Z
   #187 = NameAndType        #188:#54     // hasServitor:()Z
   #188 = Utf8               hasServitor
   #189 = Methodref          #147.#190    // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #190 = NameAndType        #191:#192    // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #191 = Utf8               getSummon
   #192 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #193 = Class              #194         // ext/mods/gameserver/model/actor/instance/Servitor
   #194 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
   #195 = Methodref          #193.#196    // ext/mods/gameserver/model/actor/instance/Servitor.getExpPenalty:()F
   #196 = NameAndType        #197:#198    // getExpPenalty:()F
   #197 = Utf8               getExpPenalty
   #198 = Utf8               ()F
   #199 = Methodref          #147.#200    // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #200 = NameAndType        #201:#179    // getPremiumService:()I
   #201 = Utf8               getPremiumService
   #202 = Methodref          #13.#203     // ext/mods/gameserver/model/actor/instance/Monster.calculateExpAndSp:(Lext/mods/gameserver/model/actor/Player;IDDI)[I
   #203 = NameAndType        #204:#205    // calculateExpAndSp:(Lext/mods/gameserver/model/actor/Player;IDDI)[I
   #204 = Utf8               calculateExpAndSp
   #205 = Utf8               (Lext/mods/gameserver/model/actor/Player;IDDI)[I
   #206 = Methodref          #18.#207     // ext/mods/gameserver/model/actor/container/monster/OverhitState.isValidOverhit:(Lext/mods/gameserver/model/actor/Player;)Z
   #207 = NameAndType        #208:#209    // isValidOverhit:(Lext/mods/gameserver/model/actor/Player;)Z
   #208 = Utf8               isValidOverhit
   #209 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #210 = Fieldref           #211.#212    // ext/mods/gameserver/network/SystemMessageId.OVER_HIT:Lext/mods/gameserver/network/SystemMessageId;
   #211 = Class              #213         // ext/mods/gameserver/network/SystemMessageId
   #212 = NameAndType        #214:#215    // OVER_HIT:Lext/mods/gameserver/network/SystemMessageId;
   #213 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #214 = Utf8               OVER_HIT
   #215 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #216 = Methodref          #147.#217    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #217 = NameAndType        #218:#219    // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #218 = Utf8               sendPacket
   #219 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #220 = Methodref          #18.#221     // ext/mods/gameserver/model/actor/container/monster/OverhitState.calculateOverhitExp:(J)J
   #221 = NameAndType        #222:#223    // calculateOverhitExp:(J)J
   #222 = Utf8               calculateOverhitExp
   #223 = Utf8               (J)J
   #224 = Methodref          #147.#225    // ext/mods/gameserver/model/actor/Player.updateKarmaLoss:(J)V
   #225 = NameAndType        #226:#227    // updateKarmaLoss:(J)V
   #226 = Utf8               updateKarmaLoss
   #227 = Utf8               (J)V
   #228 = Methodref          #147.#229    // ext/mods/gameserver/model/actor/Player.addExpAndSp:(JILjava/util/Map;)V
   #229 = NameAndType        #230:#231    // addExpAndSp:(JILjava/util/Map;)V
   #230 = Utf8               addExpAndSp
   #231 = Utf8               (JILjava/util/Map;)V
   #232 = Class              #233         // java/util/ArrayList
   #233 = Utf8               java/util/ArrayList
   #234 = Methodref          #232.#10     // java/util/ArrayList."<init>":()V
   #235 = Class              #236         // java/util/HashMap
   #236 = Utf8               java/util/HashMap
   #237 = Methodref          #235.#10     // java/util/HashMap."<init>":()V
   #238 = Methodref          #239.#240    // ext/mods/gameserver/model/group/Party.isInCommandChannel:()Z
   #239 = Class              #241         // ext/mods/gameserver/model/group/Party
   #240 = NameAndType        #242:#54     // isInCommandChannel:()Z
   #241 = Utf8               ext/mods/gameserver/model/group/Party
   #242 = Utf8               isInCommandChannel
   #243 = Methodref          #239.#244    // ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
   #244 = NameAndType        #245:#246    // getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
   #245 = Utf8               getCommandChannel
   #246 = Utf8               ()Lext/mods/gameserver/model/group/CommandChannel;
   #247 = Methodref          #142.#248    // ext/mods/gameserver/model/group/CommandChannel.getMembers:()Ljava/util/List;
   #248 = NameAndType        #249:#250    // getMembers:()Ljava/util/List;
   #249 = Utf8               getMembers
   #250 = Utf8               ()Ljava/util/List;
   #251 = Methodref          #239.#248    // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
   #252 = InterfaceMethodref #253.#76     // java/util/List.iterator:()Ljava/util/Iterator;
   #253 = Class              #254         // java/util/List
   #254 = Utf8               java/util/List
   #255 = InterfaceMethodref #253.#256    // java/util/List.add:(Ljava/lang/Object;)Z
   #256 = NameAndType        #257:#258    // add:(Ljava/lang/Object;)Z
   #257 = Utf8               add
   #258 = Utf8               (Ljava/lang/Object;)Z
   #259 = Methodref          #142.#176    // ext/mods/gameserver/model/group/CommandChannel.getLevel:()I
   #260 = InterfaceMethodref #116.#261    // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #261 = NameAndType        #262:#120    // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #262 = Utf8               remove
   #263 = Methodref          #147.#264    // ext/mods/gameserver/model/actor/Player.hasPet:()Z
   #264 = NameAndType        #265:#54     // hasPet:()Z
   #265 = Utf8               hasPet
   #266 = InterfaceMethodref #116.#267    // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #267 = NameAndType        #268:#258    // containsKey:(Ljava/lang/Object;)Z
   #268 = Utf8               containsKey
   #269 = Methodref          #239.#270    // ext/mods/gameserver/model/group/Party.distributeXpAndSp:(JJIJILjava/util/List;ILjava/util/Map;)V
   #270 = NameAndType        #271:#272    // distributeXpAndSp:(JJIJILjava/util/List;ILjava/util/Map;)V
   #271 = Utf8               distributeXpAndSp
   #272 = Utf8               (JJIJILjava/util/List;ILjava/util/Map;)V
   #273 = Methodref          #50.#274     // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
   #274 = NameAndType        #275:#179    // getAggroRange:()I
   #275 = Utf8               getAggroRange
   #276 = Methodref          #2.#277      // ext/mods/gameserver/model/actor/Attackable.onSpawn:()V
   #277 = NameAndType        #278:#11     // onSpawn:()V
   #278 = Utf8               onSpawn
   #279 = Methodref          #18.#280     // ext/mods/gameserver/model/actor/container/monster/OverhitState.clear:()V
   #280 = NameAndType        #281:#11     // clear:()V
   #281 = Utf8               clear
   #282 = Methodref          #27.#280     // ext/mods/gameserver/model/actor/container/monster/SpoilState.clear:()V
   #283 = Methodref          #34.#280     // ext/mods/gameserver/model/actor/container/monster/SeedState.clear:()V
   #284 = InterfaceMethodref #116.#280    // java/util/Map.clear:()V
   #285 = Methodref          #13.#286     // ext/mods/gameserver/model/actor/instance/Monster.isRaidBoss:()Z
   #286 = NameAndType        #287:#54     // isRaidBoss:()Z
   #287 = Utf8               isRaidBoss
   #288 = Methodref          #289.#160    // ext/mods/gameserver/model/actor/Creature.getParty:()Lext/mods/gameserver/model/group/Party;
   #289 = Class              #290         // ext/mods/gameserver/model/actor/Creature
   #290 = Utf8               ext/mods/gameserver/model/actor/Creature
   #291 = Methodref          #13.#292     // ext/mods/gameserver/model/actor/instance/Monster.getNpcId:()I
   #292 = NameAndType        #293:#179    // getNpcId:()I
   #293 = Utf8               getNpcId
   #294 = Methodref          #295.#296    // ext/mods/gameserver/enums/BossInfoType.isCcMeetCondition:(Lext/mods/gameserver/model/group/CommandChannel;I)Z
   #295 = Class              #297         // ext/mods/gameserver/enums/BossInfoType
   #296 = NameAndType        #298:#299    // isCcMeetCondition:(Lext/mods/gameserver/model/group/CommandChannel;I)Z
   #297 = Utf8               ext/mods/gameserver/enums/BossInfoType
   #298 = Utf8               isCcMeetCondition
   #299 = Utf8               (Lext/mods/gameserver/model/group/CommandChannel;I)Z
   #300 = Fieldref           #13.#301     // ext/mods/gameserver/model/actor/instance/Monster._ccTask:Ljava/util/concurrent/ScheduledFuture;
   #301 = NameAndType        #302:#303    // _ccTask:Ljava/util/concurrent/ScheduledFuture;
   #302 = Utf8               _ccTask
   #303 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #304 = InvokeDynamic      #0:#305      // #0:run:(Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/Runnable;
   #305 = NameAndType        #306:#307    // run:(Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/Runnable;
   #306 = Utf8               run
   #307 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/Runnable;
   #308 = Long               1000l
   #310 = Methodref          #311.#312    // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #311 = Class              #313         // ext/mods/commons/pool/ThreadPool
   #312 = NameAndType        #314:#315    // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #313 = Utf8               ext/mods/commons/pool/ThreadPool
   #314 = Utf8               scheduleAtFixedRate
   #315 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #316 = Methodref          #317.#318    // java/lang/System.currentTimeMillis:()J
   #317 = Class              #319         // java/lang/System
   #318 = NameAndType        #320:#321    // currentTimeMillis:()J
   #319 = Utf8               java/lang/System
   #320 = Utf8               currentTimeMillis
   #321 = Utf8               ()J
   #322 = Fieldref           #13.#323     // ext/mods/gameserver/model/actor/instance/Monster._lastCcAttack:J
   #323 = NameAndType        #324:#325    // _lastCcAttack:J
   #324 = Utf8               _lastCcAttack
   #325 = Utf8               J
   #326 = Methodref          #295.#327    // ext/mods/gameserver/enums/BossInfoType.getBossInfo:(I)Lext/mods/gameserver/enums/BossInfoType;
   #327 = NameAndType        #328:#329    // getBossInfo:(I)Lext/mods/gameserver/enums/BossInfoType;
   #328 = Utf8               getBossInfo
   #329 = Utf8               (I)Lext/mods/gameserver/enums/BossInfoType;
   #330 = Methodref          #295.#331    // ext/mods/gameserver/enums/BossInfoType.getCcRightsMsg:()Lext/mods/gameserver/network/NpcStringId;
   #331 = NameAndType        #332:#333    // getCcRightsMsg:()Lext/mods/gameserver/network/NpcStringId;
   #332 = Utf8               getCcRightsMsg
   #333 = Utf8               ()Lext/mods/gameserver/network/NpcStringId;
   #334 = Class              #335         // java/lang/Object
   #335 = Utf8               java/lang/Object
   #336 = Methodref          #147.#337    // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #337 = NameAndType        #338:#339    // getName:()Ljava/lang/String;
   #338 = Utf8               getName
   #339 = Utf8               ()Ljava/lang/String;
   #340 = Methodref          #13.#341     // ext/mods/gameserver/model/actor/instance/Monster.broadcastOnScreen:(ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
   #341 = NameAndType        #342:#343    // broadcastOnScreen:(ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
   #342 = Utf8               broadcastOnScreen
   #343 = Utf8               (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
   #344 = Methodref          #142.#345    // ext/mods/gameserver/model/group/CommandChannel.equals:(Lext/mods/gameserver/model/group/CommandChannel;)Z
   #345 = NameAndType        #346:#347    // equals:(Lext/mods/gameserver/model/group/CommandChannel;)Z
   #346 = Utf8               equals
   #347 = Utf8               (Lext/mods/gameserver/model/group/CommandChannel;)Z
   #348 = Methodref          #2.#349      // ext/mods/gameserver/model/actor/Attackable.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #349 = NameAndType        #350:#351    // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #350 = Utf8               reduceCurrentHp
   #351 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #352 = Methodref          #95.#353     // ext/mods/gameserver/model/actor/Playable.getClanId:()I
   #353 = NameAndType        #354:#179    // getClanId:()I
   #354 = Utf8               getClanId
   #355 = Methodref          #13.#353     // ext/mods/gameserver/model/actor/instance/Monster.getClanId:()I
   #356 = Methodref          #2.#357      // ext/mods/gameserver/model/actor/Attackable.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #357 = NameAndType        #358:#359    // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #358 = Utf8               isAttackableBy
   #359 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #360 = Methodref          #13.#357     // ext/mods/gameserver/model/actor/instance/Monster.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #361 = Fieldref           #13.#362     // ext/mods/gameserver/model/actor/instance/Monster._isRaidRelated:Z
   #362 = NameAndType        #363:#364    // _isRaidRelated:Z
   #363 = Utf8               _isRaidRelated
   #364 = Utf8               Z
   #365 = Methodref          #147.#366    // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #366 = NameAndType        #367:#179    // getObjectId:()I
   #367 = Utf8               getObjectId
   #368 = Methodref          #369.#370    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #369 = Class              #371         // java/lang/Integer
   #370 = NameAndType        #372:#373    // valueOf:(I)Ljava/lang/Integer;
   #371 = Utf8               java/lang/Integer
   #372 = Utf8               valueOf
   #373 = Utf8               (I)Ljava/lang/Integer;
   #374 = Class              #375         // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
   #375 = Utf8               ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
   #376 = Methodref          #377.#366    // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #377 = Class              #378         // ext/mods/gameserver/model/item/instance/ItemInstance
   #378 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #379 = Methodref          #374.#380    // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo."<init>":(I)V
   #380 = NameAndType        #5:#381      // "<init>":(I)V
   #381 = Utf8               (I)V
   #382 = Methodref          #374.#383    // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.isRegistered:()Z
   #383 = NameAndType        #384:#54     // isRegistered:()Z
   #384 = Utf8               isRegistered
   #385 = Methodref          #374.#386    // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.setItemId:(I)V
   #386 = NameAndType        #387:#381    // setItemId:(I)V
   #387 = Utf8               setItemId
   #388 = Methodref          #147.#389    // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #389 = NameAndType        #390:#391    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #390 = Utf8               getInventory
   #391 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #392 = Methodref          #374.#393    // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.getItemId:()I
   #393 = NameAndType        #394:#179    // getItemId:()I
   #394 = Utf8               getItemId
   #395 = Methodref          #396.#397    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #396 = Class              #398         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #397 = NameAndType        #399:#400    // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #398 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #399 = Utf8               getItemByObjectId
   #400 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #401 = Methodref          #184.#402    // ext/mods/gameserver/model/actor/status/AttackableStatus.getHpRatio:()D
   #402 = NameAndType        #403:#100    // getHpRatio:()D
   #403 = Utf8               getHpRatio
   #404 = Methodref          #374.#405    // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.setAbsorbedHpPercent:(I)V
   #405 = NameAndType        #406:#381    // setAbsorbedHpPercent:(I)V
   #406 = Utf8               setAbsorbedHpPercent
   #407 = Methodref          #374.#408    // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.setRegistered:(Z)V
   #408 = NameAndType        #409:#410    // setRegistered:(Z)V
   #409 = Utf8               setRegistered
   #410 = Utf8               (Z)V
   #411 = Methodref          #412.#413    // ext/mods/dungeon/Dungeon.onMobKill:(Lext/mods/gameserver/model/actor/Attackable;)V
   #412 = Class              #414         // ext/mods/dungeon/Dungeon
   #413 = NameAndType        #415:#416    // onMobKill:(Lext/mods/gameserver/model/actor/Attackable;)V
   #414 = Utf8               ext/mods/dungeon/Dungeon
   #415 = Utf8               onMobKill
   #416 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)V
   #417 = Methodref          #13.#418     // ext/mods/gameserver/model/actor/instance/Monster.getExpReward:(I)I
   #418 = NameAndType        #419:#420    // getExpReward:(I)I
   #419 = Utf8               getExpReward
   #420 = Utf8               (I)I
   #421 = Methodref          #13.#422     // ext/mods/gameserver/model/actor/instance/Monster.getSpReward:(I)I
   #422 = NameAndType        #423:#420    // getSpReward:(I)I
   #423 = Utf8               getSpReward
   #424 = Double             0.8333333333333334d
   #426 = Methodref          #427.#428    // java/lang/Math.pow:(DD)D
   #427 = Class              #429         // java/lang/Math
   #428 = NameAndType        #430:#431    // pow:(DD)D
   #429 = Utf8               java/lang/Math
   #430 = Utf8               pow
   #431 = Utf8               (DD)D
   #432 = Class              #433         // ext/mods/gameserver/model/actor/instance/GrandBoss
   #433 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
   #434 = Fieldref           #102.#435    // ext/mods/Config.GRANDBOSS_RATE_XP:D
   #435 = NameAndType        #436:#437    // GRANDBOSS_RATE_XP:D
   #436 = Utf8               GRANDBOSS_RATE_XP
   #437 = Utf8               D
   #438 = Fieldref           #102.#439    // ext/mods/Config.GRANDBOSS_RATE_SP:D
   #439 = NameAndType        #440:#437    // GRANDBOSS_RATE_SP:D
   #440 = Utf8               GRANDBOSS_RATE_SP
   #441 = Fieldref           #102.#442    // ext/mods/Config.RAIDBOSS_RATE_XP:D
   #442 = NameAndType        #443:#437    // RAIDBOSS_RATE_XP:D
   #443 = Utf8               RAIDBOSS_RATE_XP
   #444 = Fieldref           #102.#445    // ext/mods/Config.RAIDBOSS_RATE_SP:D
   #445 = NameAndType        #446:#437    // RAIDBOSS_RATE_SP:D
   #446 = Utf8               RAIDBOSS_RATE_SP
   #447 = Methodref          #13.#448     // ext/mods/gameserver/model/actor/instance/Monster.isChampion:()Z
   #448 = NameAndType        #449:#54     // isChampion:()Z
   #449 = Utf8               isChampion
   #450 = Fieldref           #102.#451    // ext/mods/Config.CHAMPION_RATE_XP:D
   #451 = NameAndType        #452:#437    // CHAMPION_RATE_XP:D
   #452 = Utf8               CHAMPION_RATE_XP
   #453 = Fieldref           #102.#454    // ext/mods/Config.CHAMPION_RATE_SP:D
   #454 = NameAndType        #455:#437    // CHAMPION_RATE_SP:D
   #455 = Utf8               CHAMPION_RATE_SP
   #456 = Fieldref           #102.#457    // ext/mods/Config.PREMIUM_CHAMPION_RATE_XP:D
   #457 = NameAndType        #458:#437    // PREMIUM_CHAMPION_RATE_XP:D
   #458 = Utf8               PREMIUM_CHAMPION_RATE_XP
   #459 = Fieldref           #102.#460    // ext/mods/Config.PREMIUM_CHAMPION_RATE_SP:D
   #460 = NameAndType        #461:#437    // PREMIUM_CHAMPION_RATE_SP:D
   #461 = Utf8               PREMIUM_CHAMPION_RATE_SP
   #462 = Fieldref           #102.#463    // ext/mods/Config.DYNAMIC_XP:Z
   #463 = NameAndType        #464:#364    // DYNAMIC_XP:Z
   #464 = Utf8               DYNAMIC_XP
   #465 = Fieldref           #102.#466    // ext/mods/Config.DYNAMIC_XP_RATES:Ljava/util/Map;
   #466 = NameAndType        #467:#17     // DYNAMIC_XP_RATES:Ljava/util/Map;
   #467 = Utf8               DYNAMIC_XP_RATES
   #468 = Class              #469         // java/lang/Double
   #469 = Utf8               java/lang/Double
   #470 = Methodref          #468.#471    // java/lang/Double.doubleValue:()D
   #471 = NameAndType        #472:#100    // doubleValue:()D
   #472 = Utf8               doubleValue
   #473 = Methodref          #474.#475    // ext/mods/gameserver/custom/data/RatesData.getInstance:()Lext/mods/gameserver/custom/data/RatesData;
   #474 = Class              #476         // ext/mods/gameserver/custom/data/RatesData
   #475 = NameAndType        #477:#478    // getInstance:()Lext/mods/gameserver/custom/data/RatesData;
   #476 = Utf8               ext/mods/gameserver/custom/data/RatesData
   #477 = Utf8               getInstance
   #478 = Utf8               ()Lext/mods/gameserver/custom/data/RatesData;
   #479 = Methodref          #474.#480    // ext/mods/gameserver/custom/data/RatesData.getRates:(I)Lext/mods/gameserver/model/records/custom/RatesHolder;
   #480 = NameAndType        #481:#482    // getRates:(I)Lext/mods/gameserver/model/records/custom/RatesHolder;
   #481 = Utf8               getRates
   #482 = Utf8               (I)Lext/mods/gameserver/model/records/custom/RatesHolder;
   #483 = Methodref          #484.#485    // ext/mods/gameserver/model/records/custom/RatesHolder.getXpRate:()F
   #484 = Class              #486         // ext/mods/gameserver/model/records/custom/RatesHolder
   #485 = NameAndType        #487:#198    // getXpRate:()F
   #486 = Utf8               ext/mods/gameserver/model/records/custom/RatesHolder
   #487 = Utf8               getXpRate
   #488 = Methodref          #484.#489    // ext/mods/gameserver/model/records/custom/RatesHolder.getSpRate:()F
   #489 = NameAndType        #490:#198    // getSpRate:()F
   #490 = Utf8               getSpRate
   #491 = Fieldref           #492.#493    // ext/mods/gameserver/enums/skills/Stats.XP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #492 = Class              #494         // ext/mods/gameserver/enums/skills/Stats
   #493 = NameAndType        #495:#496    // XP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #494 = Utf8               ext/mods/gameserver/enums/skills/Stats
   #495 = Utf8               XP_RATE
   #496 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
   #497 = Double             100.0d
   #499 = Methodref          #175.#500    // ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #500 = NameAndType        #501:#502    // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #501 = Utf8               calcStat
   #502 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #503 = Fieldref           #492.#504    // ext/mods/gameserver/enums/skills/Stats.SP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #504 = NameAndType        #505:#496    // SP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #505 = Utf8               SP_RATE
   #506 = Fieldref           #13.#507     // ext/mods/gameserver/model/actor/instance/Monster._isChampion:Z
   #507 = NameAndType        #508:#364    // _isChampion:Z
   #508 = Utf8               _isChampion
   #509 = Fieldref           #102.#510    // ext/mods/Config.DEEPBLUE_DROP_RULES:Z
   #510 = NameAndType        #511:#364    // DEEPBLUE_DROP_RULES:Z
   #511 = Utf8               DEEPBLUE_DROP_RULES
   #512 = Double             0.1d
   #514 = Double             0.18d
   #516 = Methodref          #427.#517    // java/lang/Math.max:(DD)D
   #517 = NameAndType        #518:#431    // max:(DD)D
   #518 = Utf8               max
   #519 = Methodref          #289.#112    // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #520 = Methodref          #521.#522    // ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #521 = Class              #523         // ext/mods/gameserver/data/manager/CursedWeaponManager
   #522 = NameAndType        #477:#524    // getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #523 = Utf8               ext/mods/gameserver/data/manager/CursedWeaponManager
   #524 = Utf8               ()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #525 = Methodref          #521.#526    // ext/mods/gameserver/data/manager/CursedWeaponManager.checkDrop:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
   #526 = NameAndType        #527:#528    // checkDrop:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
   #527 = Utf8               checkDrop
   #528 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
   #529 = Methodref          #13.#530     // ext/mods/gameserver/model/actor/instance/Monster.calculateLevelMultiplier:(Lext/mods/gameserver/model/actor/Player;)D
   #530 = NameAndType        #531:#532    // calculateLevelMultiplier:(Lext/mods/gameserver/model/actor/Player;)D
   #531 = Utf8               calculateLevelMultiplier
   #532 = Utf8               (Lext/mods/gameserver/model/actor/Player;)D
   #533 = Fieldref           #102.#534    // ext/mods/Config.CHAMPION_REWARD:I
   #534 = NameAndType        #535:#106    // CHAMPION_REWARD:I
   #535 = Utf8               CHAMPION_REWARD
   #536 = Methodref          #537.#538    // ext/mods/commons/random/Rnd.get:(I)I
   #537 = Class              #539         // ext/mods/commons/random/Rnd
   #538 = NameAndType        #119:#420    // get:(I)I
   #539 = Utf8               ext/mods/commons/random/Rnd
   #540 = Class              #541         // ext/mods/gameserver/model/holder/IntIntHolder
   #541 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #542 = Fieldref           #102.#543    // ext/mods/Config.CHAMPION_REWARD_ID:I
   #543 = NameAndType        #544:#106    // CHAMPION_REWARD_ID:I
   #544 = Utf8               CHAMPION_REWARD_ID
   #545 = Fieldref           #102.#546    // ext/mods/Config.CHAMPION_REWARD_QTY:I
   #546 = NameAndType        #547:#106    // CHAMPION_REWARD_QTY:I
   #547 = Utf8               CHAMPION_REWARD_QTY
   #548 = Methodref          #537.#549    // ext/mods/commons/random/Rnd.get:(II)I
   #549 = NameAndType        #119:#550    // get:(II)I
   #550 = Utf8               (II)I
   #551 = Methodref          #427.#552    // java/lang/Math.max:(II)I
   #552 = NameAndType        #518:#550    // max:(II)I
   #553 = Methodref          #540.#554    // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
   #554 = NameAndType        #5:#555      // "<init>":(II)V
   #555 = Utf8               (II)V
   #556 = Fieldref           #102.#557    // ext/mods/Config.AUTO_LOOT:Z
   #557 = NameAndType        #558:#364    // AUTO_LOOT:Z
   #558 = Utf8               AUTO_LOOT
   #559 = Methodref          #540.#560    // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
   #560 = NameAndType        #561:#179    // getId:()I
   #561 = Utf8               getId
   #562 = Methodref          #540.#563    // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
   #563 = NameAndType        #564:#179    // getValue:()I
   #564 = Utf8               getValue
   #565 = Methodref          #147.#566    // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #566 = NameAndType        #567:#568    // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #567 = Utf8               addItem
   #568 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #569 = Methodref          #13.#570     // ext/mods/gameserver/model/actor/instance/Monster.dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
   #570 = NameAndType        #571:#572    // dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
   #571 = Utf8               dropItem
   #572 = Utf8               (Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
   #573 = String             #574         // Christmas
   #574 = Utf8               Christmas
   #575 = Methodref          #13.#576     // ext/mods/gameserver/model/actor/instance/Monster.handleEventDrop:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
   #576 = NameAndType        #577:#578    // handleEventDrop:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
   #577 = Utf8               handleEventDrop
   #578 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
   #579 = String             #580         // HeavyMedal
   #580 = Utf8               HeavyMedal
   #581 = String             #582         // L2Day
   #582 = Utf8               L2Day
   #583 = String             #584         // Squash
   #584 = Utf8               Squash
   #585 = Methodref          #586.#587    // ext/mods/Crypta/GlobalDropManager.getInstance:()Lext/mods/Crypta/GlobalDropManager;
   #586 = Class              #588         // ext/mods/Crypta/GlobalDropManager
   #587 = NameAndType        #477:#589    // getInstance:()Lext/mods/Crypta/GlobalDropManager;
   #588 = Utf8               ext/mods/Crypta/GlobalDropManager
   #589 = Utf8               ()Lext/mods/Crypta/GlobalDropManager;
   #590 = Methodref          #586.#591    // ext/mods/Crypta/GlobalDropManager.shouldCancelOriginalDrop:(Lext/mods/gameserver/model/actor/Attackable;)Z
   #591 = NameAndType        #592:#593    // shouldCancelOriginalDrop:(Lext/mods/gameserver/model/actor/Attackable;)Z
   #592 = Utf8               shouldCancelOriginalDrop
   #593 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)Z
   #594 = Methodref          #595.#596    // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #595 = Class              #597         // java/lang/Boolean
   #596 = NameAndType        #372:#598    // valueOf:(Z)Ljava/lang/Boolean;
   #597 = Utf8               java/lang/Boolean
   #598 = Utf8               (Z)Ljava/lang/Boolean;
   #599 = Methodref          #595.#600    // java/lang/Boolean.booleanValue:()Z
   #600 = NameAndType        #601:#54     // booleanValue:()Z
   #601 = Utf8               booleanValue
   #602 = Methodref          #586.#603    // ext/mods/Crypta/GlobalDropManager.onKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
   #603 = NameAndType        #604:#605    // onKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
   #604 = Utf8               onKill
   #605 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
   #606 = Methodref          #484.#607    // ext/mods/gameserver/model/records/custom/RatesHolder.getDropRate:()F
   #607 = NameAndType        #608:#198    // getDropRate:()F
   #608 = Utf8               getDropRate
   #609 = Methodref          #484.#610    // ext/mods/gameserver/model/records/custom/RatesHolder.getSpoilRate:()D
   #610 = NameAndType        #611:#100    // getSpoilRate:()D
   #611 = Utf8               getSpoilRate
   #612 = Methodref          #13.#613     // ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #613 = NameAndType        #614:#615    // getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #614 = Utf8               getSpoilState
   #615 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #616 = Methodref          #27.#617     // ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
   #617 = NameAndType        #618:#54     // isSpoiled:()Z
   #618 = Utf8               isSpoiled
   #619 = Methodref          #13.#620     // ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #620 = NameAndType        #621:#622    // getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #621 = Utf8               getSeedState
   #622 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #623 = Methodref          #34.#624     // ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
   #624 = NameAndType        #625:#54     // isSeeded:()Z
   #625 = Utf8               isSeeded
   #626 = Methodref          #34.#627     // ext/mods/gameserver/model/actor/container/monster/SeedState.getSeed:()Lext/mods/gameserver/model/manor/Seed;
   #627 = NameAndType        #628:#629    // getSeed:()Lext/mods/gameserver/model/manor/Seed;
   #628 = Utf8               getSeed
   #629 = Utf8               ()Lext/mods/gameserver/model/manor/Seed;
   #630 = Methodref          #631.#632    // ext/mods/gameserver/model/manor/Seed.isAlternative:()Z
   #631 = Class              #633         // ext/mods/gameserver/model/manor/Seed
   #632 = NameAndType        #634:#54     // isAlternative:()Z
   #633 = Utf8               ext/mods/gameserver/model/manor/Seed
   #634 = Utf8               isAlternative
   #635 = Methodref          #50.#636     // ext/mods/gameserver/model/actor/template/NpcTemplate.getDropData:()Ljava/util/List;
   #636 = NameAndType        #637:#250    // getDropData:()Ljava/util/List;
   #637 = Utf8               getDropData
   #638 = Class              #639         // ext/mods/gameserver/model/item/DropCategory
   #639 = Utf8               ext/mods/gameserver/model/item/DropCategory
   #640 = Methodref          #638.#641    // ext/mods/gameserver/model/item/DropCategory.getDropType:()Lext/mods/gameserver/enums/DropType;
   #641 = NameAndType        #642:#643    // getDropType:()Lext/mods/gameserver/enums/DropType;
   #642 = Utf8               getDropType
   #643 = Utf8               ()Lext/mods/gameserver/enums/DropType;
   #644 = Fieldref           #645.#646    // ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
   #645 = Class              #647         // ext/mods/gameserver/enums/DropType
   #646 = NameAndType        #648:#649    // SPOIL:Lext/mods/gameserver/enums/DropType;
   #647 = Utf8               ext/mods/gameserver/enums/DropType
   #648 = Utf8               SPOIL
   #649 = Utf8               Lext/mods/gameserver/enums/DropType;
   #650 = Fieldref           #645.#651    // ext/mods/gameserver/enums/DropType.DROP:Lext/mods/gameserver/enums/DropType;
   #651 = NameAndType        #652:#649    // DROP:Lext/mods/gameserver/enums/DropType;
   #652 = Utf8               DROP
   #653 = Fieldref           #102.#654    // ext/mods/Config.ALTERNATE_DROP_LIST:Z
   #654 = NameAndType        #655:#364    // ALTERNATE_DROP_LIST:Z
   #655 = Utf8               ALTERNATE_DROP_LIST
   #656 = Methodref          #638.#657    // ext/mods/gameserver/model/item/DropCategory.calcDropList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Ljava/util/List;
   #657 = NameAndType        #658:#659    // calcDropList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Ljava/util/List;
   #658 = Utf8               calcDropList
   #659 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Ljava/util/List;
   #660 = Methodref          #638.#661    // ext/mods/gameserver/model/item/DropCategory.calculateDrop:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DZ)Ljava/util/List;
   #661 = NameAndType        #662:#663    // calculateDrop:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DZ)Ljava/util/List;
   #662 = Utf8               calculateDrop
   #663 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DZ)Ljava/util/List;
   #664 = Fieldref           #102.#665    // ext/mods/Config.DROP_ITEMS:Z
   #665 = NameAndType        #666:#364    // DROP_ITEMS:Z
   #666 = Utf8               DROP_ITEMS
   #667 = Fieldref           #645.#668    // ext/mods/gameserver/enums/DropType.HERB:Lext/mods/gameserver/enums/DropType;
   #668 = NameAndType        #669:#649    // HERB:Lext/mods/gameserver/enums/DropType;
   #669 = Utf8               HERB
   #670 = Class              #671         // java/util/logging/LogRecord
   #671 = Utf8               java/util/logging/LogRecord
   #672 = Fieldref           #673.#674    // java/util/logging/Level.INFO:Ljava/util/logging/Level;
   #673 = Class              #675         // java/util/logging/Level
   #674 = NameAndType        #676:#677    // INFO:Ljava/util/logging/Level;
   #675 = Utf8               java/util/logging/Level
   #676 = Utf8               INFO
   #677 = Utf8               Ljava/util/logging/Level;
   #678 = Methodref          #645.#679    // ext/mods/gameserver/enums/DropType.name:()Ljava/lang/String;
   #679 = NameAndType        #680:#339    // name:()Ljava/lang/String;
   #680 = Utf8               name
   #681 = Methodref          #670.#682    // java/util/logging/LogRecord."<init>":(Ljava/util/logging/Level;Ljava/lang/String;)V
   #682 = NameAndType        #5:#683      // "<init>":(Ljava/util/logging/Level;Ljava/lang/String;)V
   #683 = Utf8               (Ljava/util/logging/Level;Ljava/lang/String;)V
   #684 = String             #685         // drop
   #685 = Utf8               drop
   #686 = Methodref          #670.#687    // java/util/logging/LogRecord.setLoggerName:(Ljava/lang/String;)V
   #687 = NameAndType        #688:#689    // setLoggerName:(Ljava/lang/String;)V
   #688 = Utf8               setLoggerName
   #689 = Utf8               (Ljava/lang/String;)V
   #690 = Methodref          #691.#692    // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #691 = Class              #693         // ext/mods/gameserver/data/xml/ItemData
   #692 = NameAndType        #477:#694    // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #693 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #694 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #695 = Methodref          #691.#696    // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #696 = NameAndType        #47:#697     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #697 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #698 = InvokeDynamic      #1:#699      // #1:makeConcatWithConstants:(I)Ljava/lang/String;
   #699 = NameAndType        #700:#701    // makeConcatWithConstants:(I)Ljava/lang/String;
   #700 = Utf8               makeConcatWithConstants
   #701 = Utf8               (I)Ljava/lang/String;
   #702 = Methodref          #670.#703    // java/util/logging/LogRecord.setParameters:([Ljava/lang/Object;)V
   #703 = NameAndType        #704:#705    // setParameters:([Ljava/lang/Object;)V
   #704 = Utf8               setParameters
   #705 = Utf8               ([Ljava/lang/Object;)V
   #706 = Fieldref           #13.#707     // ext/mods/gameserver/model/actor/instance/Monster.DROP_LOG:Ljava/util/logging/Logger;
   #707 = NameAndType        #708:#709    // DROP_LOG:Ljava/util/logging/Logger;
   #708 = Utf8               DROP_LOG
   #709 = Utf8               Ljava/util/logging/Logger;
   #710 = Methodref          #711.#712    // java/util/logging/Logger.log:(Ljava/util/logging/LogRecord;)V
   #711 = Class              #713         // java/util/logging/Logger
   #712 = NameAndType        #714:#715    // log:(Ljava/util/logging/LogRecord;)V
   #713 = Utf8               java/util/logging/Logger
   #714 = Utf8               log
   #715 = Utf8               (Ljava/util/logging/LogRecord;)V
   #716 = Methodref          #27.#256     // ext/mods/gameserver/model/actor/container/monster/SpoilState.add:(Ljava/lang/Object;)Z
   #717 = Methodref          #13.#718     // ext/mods/gameserver/model/actor/instance/Monster.dropOrAutoLootHerb:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;)V
   #718 = NameAndType        #719:#720    // dropOrAutoLootHerb:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;)V
   #719 = Utf8               dropOrAutoLootHerb
   #720 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;)V
   #721 = Methodref          #13.#722     // ext/mods/gameserver/model/actor/instance/Monster.dropOrAutoLootItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;)V
   #722 = NameAndType        #723:#720    // dropOrAutoLootItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;)V
   #723 = Utf8               dropOrAutoLootItem
   #724 = Methodref          #725.#726    // ext/mods/gameserver/custom/data/RaidDropAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
   #725 = Class              #727         // ext/mods/gameserver/custom/data/RaidDropAnnounceData
   #726 = NameAndType        #477:#728    // getInstance:()Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
   #727 = Utf8               ext/mods/gameserver/custom/data/RaidDropAnnounceData
   #728 = Utf8               ()Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
   #729 = Methodref          #725.#730    // ext/mods/gameserver/custom/data/RaidDropAnnounceData.isEnabled:()Z
   #730 = NameAndType        #731:#54     // isEnabled:()Z
   #731 = Utf8               isEnabled
   #732 = Methodref          #725.#733    // ext/mods/gameserver/custom/data/RaidDropAnnounceData.shouldAnnounce:(Lext/mods/gameserver/model/item/kind/Item;)Z
   #733 = NameAndType        #734:#735    // shouldAnnounce:(Lext/mods/gameserver/model/item/kind/Item;)Z
   #734 = Utf8               shouldAnnounce
   #735 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;)Z
   #736 = Methodref          #725.#737    // ext/mods/gameserver/custom/data/RaidDropAnnounceData.getMessageTemplate:(Lext/mods/gameserver/model/item/kind/Item;)Ljava/lang/String;
   #737 = NameAndType        #738:#739    // getMessageTemplate:(Lext/mods/gameserver/model/item/kind/Item;)Ljava/lang/String;
   #738 = Utf8               getMessageTemplate
   #739 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;)Ljava/lang/String;
   #740 = Methodref          #741.#67     // java/lang/String.isEmpty:()Z
   #741 = Class              #742         // java/lang/String
   #742 = Utf8               java/lang/String
   #743 = String             #744         // [RAID DROP] {player} killed {boss} and got: {amount}x {item}.
   #744 = Utf8               [RAID DROP] {player} killed {boss} and got: {amount}x {item}.
   #745 = String             #746         // {player}
   #746 = Utf8               {player}
   #747 = Methodref          #741.#748    // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #748 = NameAndType        #749:#750    // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #749 = Utf8               replace
   #750 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #751 = String             #752         // {boss}
   #752 = Utf8               {boss}
   #753 = Methodref          #13.#337     // ext/mods/gameserver/model/actor/instance/Monster.getName:()Ljava/lang/String;
   #754 = String             #755         // {item}
   #755 = Utf8               {item}
   #756 = Methodref          #757.#337    // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
   #757 = Class              #758         // ext/mods/gameserver/model/item/kind/Item
   #758 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #759 = String             #760         // {amount}
   #760 = Utf8               {amount}
   #761 = Methodref          #741.#762    // java/lang/String.valueOf:(I)Ljava/lang/String;
   #762 = NameAndType        #372:#701    // valueOf:(I)Ljava/lang/String;
   #763 = Methodref          #764.#765    // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
   #764 = Class              #766         // ext/mods/gameserver/model/World
   #765 = NameAndType        #767:#768    // announceToOnlinePlayers:(Ljava/lang/String;Z)V
   #766 = Utf8               ext/mods/gameserver/model/World
   #767 = Utf8               announceToOnlinePlayers
   #768 = Utf8               (Ljava/lang/String;Z)V
   #769 = Methodref          #770.#771    // ext/mods/gameserver/data/manager/DropSkipManager.getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
   #770 = Class              #772         // ext/mods/gameserver/data/manager/DropSkipManager
   #771 = NameAndType        #477:#773    // getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
   #772 = Utf8               ext/mods/gameserver/data/manager/DropSkipManager
   #773 = Utf8               ()Lext/mods/gameserver/data/manager/DropSkipManager;
   #774 = Methodref          #770.#775    // ext/mods/gameserver/data/manager/DropSkipManager.isSkipped:(II)Z
   #775 = NameAndType        #776:#777    // isSkipped:(II)Z
   #776 = Utf8               isSkipped
   #777 = Utf8               (II)Z
   #778 = Methodref          #484.#779    // ext/mods/gameserver/model/records/custom/RatesHolder.getAdenaRate:()F
   #779 = NameAndType        #780:#198    // getAdenaRate:()F
   #780 = Utf8               getAdenaRate
   #781 = Fieldref           #102.#782    // ext/mods/Config.ENABLE_MENU:Z
   #782 = NameAndType        #783:#364    // ENABLE_MENU:Z
   #783 = Utf8               ENABLE_MENU
   #784 = Fieldref           #102.#785    // ext/mods/Config.AUTO_LOOT_RAID:Z
   #785 = NameAndType        #786:#364    // AUTO_LOOT_RAID:Z
   #786 = Utf8               AUTO_LOOT_RAID
   #787 = Methodref          #147.#788    // ext/mods/gameserver/model/actor/Player.getAutoLoot:()Z
   #788 = NameAndType        #789:#54     // getAutoLoot:()Z
   #789 = Utf8               getAutoLoot
   #790 = Methodref          #396.#791    // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacityByItemId:(Lext/mods/gameserver/model/holder/IntIntHolder;)Z
   #791 = NameAndType        #792:#793    // validateCapacityByItemId:(Lext/mods/gameserver/model/holder/IntIntHolder;)Z
   #792 = Utf8               validateCapacityByItemId
   #793 = Utf8               (Lext/mods/gameserver/model/holder/IntIntHolder;)Z
   #794 = Methodref          #147.#795    // ext/mods/gameserver/model/actor/Player.isInParty:()Z
   #795 = NameAndType        #796:#54     // isInParty:()Z
   #796 = Utf8               isInParty
   #797 = Methodref          #239.#798    // ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
   #798 = NameAndType        #799:#800    // distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
   #799 = Utf8               distributeItem
   #800 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
   #801 = Integer            2147483647
   #802 = Methodref          #396.#803    // ext/mods/gameserver/model/itemcontainer/PcInventory.getAdena:()I
   #803 = NameAndType        #804:#179    // getAdena:()I
   #804 = Utf8               getAdena
   #805 = Methodref          #147.#806    // ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
   #806 = NameAndType        #807:#808    // addAdena:(IZ)V
   #807 = Utf8               addAdena
   #808 = Utf8               (IZ)V
   #809 = Fieldref           #102.#810    // ext/mods/Config.AUTO_LOOT_ITEM_IDS:Ljava/util/List;
   #810 = NameAndType        #811:#812    // AUTO_LOOT_ITEM_IDS:Ljava/util/List;
   #811 = Utf8               AUTO_LOOT_ITEM_IDS
   #812 = Utf8               Ljava/util/List;
   #813 = Methodref          #757.#393    // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
   #814 = InterfaceMethodref #253.#815    // java/util/List.contains:(Ljava/lang/Object;)Z
   #815 = NameAndType        #816:#258    // contains:(Ljava/lang/Object;)Z
   #816 = Utf8               contains
   #817 = Fieldref           #211.#818    // ext/mods/gameserver/network/SystemMessageId.S1_DIED_DROPPED_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
   #818 = NameAndType        #819:#215    // S1_DIED_DROPPED_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
   #819 = Utf8               S1_DIED_DROPPED_S3_S2
   #820 = Methodref          #821.#822    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #821 = Class              #823         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #822 = NameAndType        #824:#825    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #823 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #824 = Utf8               getSystemMessage
   #825 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #826 = Methodref          #821.#827    // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #827 = NameAndType        #828:#829    // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #828 = Utf8               addCharName
   #829 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #830 = Methodref          #821.#831    // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #831 = NameAndType        #832:#833    // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #832 = Utf8               addItemName
   #833 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #834 = Methodref          #821.#835    // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #835 = NameAndType        #836:#833    // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #836 = Utf8               addNumber
   #837 = Methodref          #13.#838     // ext/mods/gameserver/model/actor/instance/Monster.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #838 = NameAndType        #839:#840    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #839 = Utf8               broadcastPacket
   #840 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #841 = Fieldref           #102.#842    // ext/mods/Config.AUTO_LOOT_HERBS:Z
   #842 = NameAndType        #843:#364    // AUTO_LOOT_HERBS:Z
   #843 = Utf8               AUTO_LOOT_HERBS
   #844 = Methodref          #540.#845    // ext/mods/gameserver/model/holder/IntIntHolder.setValue:(I)V
   #845 = NameAndType        #846:#381    // setValue:(I)V
   #846 = Utf8               setValue
   #847 = Methodref          #377.#848    // ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #848 = NameAndType        #849:#850    // create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #849 = Utf8               create
   #850 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #851 = Methodref          #377.#852    // ext/mods/gameserver/model/item/instance/ItemInstance.setDropProtection:(IZ)V
   #852 = NameAndType        #853:#808    // setDropProtection:(IZ)V
   #853 = Utf8               setDropProtection
   #854 = Methodref          #13.#855     // ext/mods/gameserver/model/actor/instance/Monster.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
   #855 = NameAndType        #856:#857    // getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
   #856 = Utf8               getInstanceMap
   #857 = Utf8               ()Lext/mods/InstanceMap/MapInstance;
   #858 = Methodref          #377.#859    // ext/mods/gameserver/model/item/instance/ItemInstance.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
   #859 = NameAndType        #860:#861    // setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
   #860 = Utf8               setInstanceMap
   #861 = Utf8               (Lext/mods/InstanceMap/MapInstance;Z)V
   #862 = Methodref          #377.#863    // ext/mods/gameserver/model/item/instance/ItemInstance.dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
   #863 = NameAndType        #864:#154    // dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
   #864 = Utf8               dropMe
   #865 = Methodref          #377.#866    // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
   #866 = NameAndType        #867:#54     // isStackable:()Z
   #867 = Utf8               isStackable
   #868 = Fieldref           #102.#869    // ext/mods/Config.MULTIPLE_ITEM_DROP:Z
   #869 = NameAndType        #870:#364    // MULTIPLE_ITEM_DROP:Z
   #870 = Utf8               MULTIPLE_ITEM_DROP
   #871 = Long               300000l
   #873 = InterfaceMethodref #874.#875    // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #874 = Class              #876         // java/util/concurrent/ScheduledFuture
   #875 = NameAndType        #877:#878    // cancel:(Z)Z
   #876 = Utf8               java/util/concurrent/ScheduledFuture
   #877 = Utf8               cancel
   #878 = Utf8               (Z)Z
   #879 = Methodref          #295.#880    // ext/mods/gameserver/enums/BossInfoType.getCcNoRightsMsg:()Lext/mods/gameserver/network/NpcStringId;
   #880 = NameAndType        #881:#333    // getCcNoRightsMsg:()Lext/mods/gameserver/network/NpcStringId;
   #881 = Utf8               getCcNoRightsMsg
   #882 = Methodref          #13.#883     // ext/mods/gameserver/model/actor/instance/Monster.broadcastOnScreen:(ILext/mods/gameserver/network/NpcStringId;)V
   #883 = NameAndType        #342:#884    // broadcastOnScreen:(ILext/mods/gameserver/network/NpcStringId;)V
   #884 = Utf8               (ILext/mods/gameserver/network/NpcStringId;)V
   #885 = Methodref          #741.#886    // java/lang/String.hashCode:()I
   #886 = NameAndType        #887:#179    // hashCode:()I
   #887 = Utf8               hashCode
   #888 = Methodref          #741.#889    // java/lang/String.equals:(Ljava/lang/Object;)Z
   #889 = NameAndType        #346:#258    // equals:(Ljava/lang/Object;)Z
   #890 = Methodref          #891.#892    // ext/mods/gameserver/data/manager/EventsDropManager.getInstance:()Lext/mods/gameserver/data/manager/EventsDropManager;
   #891 = Class              #893         // ext/mods/gameserver/data/manager/EventsDropManager
   #892 = NameAndType        #477:#894    // getInstance:()Lext/mods/gameserver/data/manager/EventsDropManager;
   #893 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager
   #894 = Utf8               ()Lext/mods/gameserver/data/manager/EventsDropManager;
   #895 = Methodref          #891.#896    // ext/mods/gameserver/data/manager/EventsDropManager.haveActiveChristmasEvent:()Z
   #896 = NameAndType        #897:#54     // haveActiveChristmasEvent:()Z
   #897 = Utf8               haveActiveChristmasEvent
   #898 = Methodref          #891.#899    // ext/mods/gameserver/data/manager/EventsDropManager.calculateChristmasRewardItem:(Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #899 = NameAndType        #900:#901    // calculateChristmasRewardItem:(Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #900 = Utf8               calculateChristmasRewardItem
   #901 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #902 = Methodref          #891.#903    // ext/mods/gameserver/data/manager/EventsDropManager.haveActiveMedalsEvent:()Z
   #903 = NameAndType        #904:#54     // haveActiveMedalsEvent:()Z
   #904 = Utf8               haveActiveMedalsEvent
   #905 = Methodref          #891.#906    // ext/mods/gameserver/data/manager/EventsDropManager.calculateMedalsRewardItem:(Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #906 = NameAndType        #907:#901    // calculateMedalsRewardItem:(Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #907 = Utf8               calculateMedalsRewardItem
   #908 = Methodref          #891.#909    // ext/mods/gameserver/data/manager/EventsDropManager.haveActiveL2DayEvent:()Z
   #909 = NameAndType        #910:#54     // haveActiveL2DayEvent:()Z
   #910 = Utf8               haveActiveL2DayEvent
   #911 = Methodref          #891.#912    // ext/mods/gameserver/data/manager/EventsDropManager.calculateL2DayRewardItem:(Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #912 = NameAndType        #913:#901    // calculateL2DayRewardItem:(Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #913 = Utf8               calculateL2DayRewardItem
   #914 = Methodref          #891.#915    // ext/mods/gameserver/data/manager/EventsDropManager.haveActiveSquashEvent:()Z
   #915 = NameAndType        #916:#54     // haveActiveSquashEvent:()Z
   #916 = Utf8               haveActiveSquashEvent
   #917 = Methodref          #891.#918    // ext/mods/gameserver/data/manager/EventsDropManager.calculateSquashRewardItem:(Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #918 = NameAndType        #919:#901    // calculateSquashRewardItem:(Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #919 = Utf8               calculateSquashRewardItem
   #920 = InterfaceMethodref #253.#921    // java/util/List.get:(I)Ljava/lang/Object;
   #921 = NameAndType        #119:#922    // get:(I)Ljava/lang/Object;
   #922 = Utf8               (I)Ljava/lang/Object;
   #923 = Methodref          #369.#924    // java/lang/Integer.intValue:()I
   #924 = NameAndType        #925:#179    // intValue:()I
   #925 = Utf8               intValue
   #926 = Methodref          #927.#928    // ext/mods/gameserver/custom/data/EventsData.getInstance:()Lext/mods/gameserver/custom/data/EventsData;
   #927 = Class              #929         // ext/mods/gameserver/custom/data/EventsData
   #928 = NameAndType        #477:#930    // getInstance:()Lext/mods/gameserver/custom/data/EventsData;
   #929 = Utf8               ext/mods/gameserver/custom/data/EventsData
   #930 = Utf8               ()Lext/mods/gameserver/custom/data/EventsData;
   #931 = Methodref          #927.#932    // ext/mods/gameserver/custom/data/EventsData.getEventsData:(Ljava/lang/String;)Lext/mods/gameserver/model/records/custom/EventsInfo;
   #932 = NameAndType        #933:#934    // getEventsData:(Ljava/lang/String;)Lext/mods/gameserver/model/records/custom/EventsInfo;
   #933 = Utf8               getEventsData
   #934 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/records/custom/EventsInfo;
   #935 = Methodref          #936.#937    // ext/mods/gameserver/model/records/custom/EventsInfo.items:()Ljava/util/List;
   #936 = Class              #938         // ext/mods/gameserver/model/records/custom/EventsInfo
   #937 = NameAndType        #939:#250    // items:()Ljava/util/List;
   #938 = Utf8               ext/mods/gameserver/model/records/custom/EventsInfo
   #939 = Utf8               items
   #940 = InterfaceMethodref #253.#67     // java/util/List.isEmpty:()Z
   #941 = Class              #942         // ext/mods/gameserver/model/records/custom/EventItem
   #942 = Utf8               ext/mods/gameserver/model/records/custom/EventItem
   #943 = Methodref          #941.#944    // ext/mods/gameserver/model/records/custom/EventItem.minLvl:()I
   #944 = NameAndType        #945:#179    // minLvl:()I
   #945 = Utf8               minLvl
   #946 = Methodref          #13.#947     // ext/mods/gameserver/model/actor/instance/Monster.dropItem:(Lext/mods/gameserver/model/actor/Creature;II)V
   #947 = NameAndType        #571:#948    // dropItem:(Lext/mods/gameserver/model/actor/Creature;II)V
   #948 = Utf8               (Lext/mods/gameserver/model/actor/Creature;II)V
   #949 = Methodref          #711.#950    // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #950 = NameAndType        #951:#952    // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #951 = Utf8               getLogger
   #952 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #953 = Utf8               Signature
   #954 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;>;
   #955 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
   #956 = Utf8               Code
   #957 = Utf8               LineNumberTable
   #958 = Utf8               LocalVariableTable
   #959 = Utf8               this
   #960 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
   #961 = Utf8               objectId
   #962 = Utf8               template
   #963 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #964 = Utf8               StackMapTable
   #965 = Utf8               calculateRewards
   #966 = Utf8               attacker
   #967 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #968 = Utf8               damage
   #969 = Utf8               attackerPlayer
   #970 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #971 = Utf8               reward
   #972 = Utf8               Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
   #973 = Utf8               info
   #974 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
   #975 = Utf8               levelDiff
   #976 = Utf8               penalty
   #977 = Utf8               F
   #978 = Utf8               expSp
   #979 = Utf8               [I
   #980 = Utf8               exp
   #981 = Utf8               sp
   #982 = Utf8               isInRange
   #983 = Utf8               reward2
   #984 = Utf8               partyPlayer
   #985 = Utf8               partyDmg
   #986 = Utf8               partyMul
   #987 = Utf8               partyLvl
   #988 = Utf8               rewardedMembers
   #989 = Utf8               playersWithPets
   #990 = Utf8               expSp1
   #991 = Utf8               exp_premium
   #992 = Utf8               sp_premium
   #993 = Utf8               dynamExp
   #994 = Utf8               exp_dynam
   #995 = Utf8               attackerParty
   #996 = Utf8               Lext/mods/gameserver/model/group/Party;
   #997 = Utf8               creature
   #998 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #999 = Utf8               rewards
  #1000 = Utf8               maxDealer
  #1001 = Utf8               maxDamage
  #1002 = Utf8               totalDamage
  #1003 = Utf8               LocalVariableTypeTable
  #1004 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #1005 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;
  #1006 = Class              #979         // "[I"
  #1007 = Utf8               isAggressive
  #1008 = Utf8               cc
  #1009 = Utf8               party
  #1010 = Utf8               awake
  #1011 = Utf8               isDOT
  #1012 = Utf8               skill
  #1013 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1014 = Utf8               playableAttacker
  #1015 = Utf8               isAttackableWithoutForceBy
  #1016 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #1017 = Utf8               isRaidRelated
  #1018 = Utf8               setRaidRelated
  #1019 = Utf8               getOverhitState
  #1020 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
  #1021 = Utf8               addAbsorber
  #1022 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #1023 = Utf8               player
  #1024 = Utf8               crystal
  #1025 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1026 = Utf8               ai
  #1027 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
  #1028 = Utf8               registerAbsorber
  #1029 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #1030 = Utf8               getAbsorbInfo
  #1031 = Utf8               (I)Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
  #1032 = Utf8               npcObjectId
  #1033 = Utf8               dynamicRate
  #1034 = Utf8               partyLevel
  #1035 = Utf8               level
  #1036 = Utf8               rates
  #1037 = Utf8               Lext/mods/gameserver/model/records/custom/RatesHolder;
  #1038 = Utf8               totalXpRate
  #1039 = Utf8               totalSpRate
  #1040 = Utf8               count
  #1041 = Utf8               diff
  #1042 = Utf8               isPremium
  #1043 = Utf8               xp
  #1044 = Utf8               setChampion
  #1045 = Utf8               value
  #1046 = Utf8               item
  #1047 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #1048 = Utf8               dropChance
  #1049 = Utf8               shouldCancel
  #1050 = Utf8               Ljava/lang/Object;
  #1051 = Utf8               logRecord
  #1052 = Utf8               Ljava/util/logging/LogRecord;
  #1053 = Utf8               Ljava/lang/String;
  #1054 = Utf8               msg
  #1055 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #1056 = Utf8               type
  #1057 = Utf8               effectiveMultiplier
  #1058 = Utf8               category
  #1059 = Utf8               Lext/mods/gameserver/model/item/DropCategory;
  #1060 = Utf8               levelMultiplier
  #1061 = Utf8               globalDropManager
  #1062 = Utf8               dropRateMult
  #1063 = Utf8               spoilRateMult
  #1064 = Utf8               isBlockingDrops
  #1065 = Utf8               isRaid
  #1066 = Utf8               adenaAmount
  #1067 = Utf8               holder
  #1068 = Utf8               itemId
  #1069 = Utf8               adenaRate
  #1070 = Utf8               i
  #1071 = Utf8               (Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #1072 = Utf8               checkCcLastAttack
  #1073 = Utf8               eventMinLevel
  #1074 = Utf8               event
  #1075 = Utf8               Lext/mods/gameserver/model/records/custom/EventsInfo;
  #1076 = Utf8               eventName
  #1077 = Utf8               rewardItem
  #1078 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #1079 = Utf8               setDungeon
  #1080 = Utf8               (Lext/mods/dungeon/Dungeon;)V
  #1081 = Utf8               getMonster
  #1082 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Monster;
  #1083 = Utf8               <clinit>
  #1084 = Utf8               SourceFile
  #1085 = Utf8               Monster.java
  #1086 = Utf8               BootstrapMethods
  #1087 = MethodType         #11          //  ()V
  #1088 = MethodHandle       5:#1089      // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Monster.checkCcLastAttack:()V
  #1089 = Methodref          #13.#1090    // ext/mods/gameserver/model/actor/instance/Monster.checkCcLastAttack:()V
  #1090 = NameAndType        #1072:#11    // checkCcLastAttack:()V
  #1091 = String             #1092        // Quantity (\u0001)
  #1092 = Utf8               Quantity (\u0001)
  #1093 = MethodHandle       6:#1094      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1094 = Methodref          #1095.#1096  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1095 = Class              #1097        // java/lang/invoke/LambdaMetafactory
  #1096 = NameAndType        #1098:#1099  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1097 = Utf8               java/lang/invoke/LambdaMetafactory
  #1098 = Utf8               metafactory
  #1099 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1100 = MethodHandle       6:#1101      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1101 = Methodref          #1102.#1103  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1102 = Class              #1104        // java/lang/invoke/StringConcatFactory
  #1103 = NameAndType        #700:#1105   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1104 = Utf8               java/lang/invoke/StringConcatFactory
  #1105 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1106 = Utf8               InnerClasses
  #1107 = Class              #1108        // java/lang/invoke/MethodHandles$Lookup
  #1108 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1109 = Class              #1110        // java/lang/invoke/MethodHandles
  #1110 = Utf8               java/lang/invoke/MethodHandles
  #1111 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Monster(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Attackable."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        10: dup
        11: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        14: putfield      #12                 // Field _absorbersList:Ljava/util/Map;
        17: aload_0
        18: new           #18                 // class ext/mods/gameserver/model/actor/container/monster/OverhitState
        21: dup
        22: aload_0
        23: invokespecial #20                 // Method ext/mods/gameserver/model/actor/container/monster/OverhitState."<init>":(Lext/mods/gameserver/model/actor/instance/Monster;)V
        26: putfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
        29: aload_0
        30: new           #27                 // class ext/mods/gameserver/model/actor/container/monster/SpoilState
        33: dup
        34: invokespecial #29                 // Method ext/mods/gameserver/model/actor/container/monster/SpoilState."<init>":()V
        37: putfield      #30                 // Field _spoilState:Lext/mods/gameserver/model/actor/container/monster/SpoilState;
        40: aload_0
        41: new           #34                 // class ext/mods/gameserver/model/actor/container/monster/SeedState
        44: dup
        45: aload_0
        46: invokespecial #36                 // Method ext/mods/gameserver/model/actor/container/monster/SeedState."<init>":(Lext/mods/gameserver/model/actor/instance/Monster;)V
        49: putfield      #37                 // Field _seedState:Lext/mods/gameserver/model/actor/container/monster/SeedState;
        52: aload_0
        53: aconst_null
        54: putfield      #41                 // Field dungeon:Lext/mods/dungeon/Dungeon;
        57: return
      LineNumberTable:
        line 97: 0
        line 79: 6
        line 81: 17
        line 82: 29
        line 83: 40
        line 861: 52
        line 98: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0      58     1 objectId   I
            0      58     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isAgathion();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #45                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: ifnull        21
         7: aload_0
         8: invokevirtual #45                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        11: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isAgathion:()Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected void calculateRewards(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=12, locals=33, args_size=2
         0: aload_0
         1: invokevirtual #55                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
         4: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
         7: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.isEmpty:()Z
        10: ifeq          14
        13: return
        14: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        17: dup
        18: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        21: astore_2
        22: aconst_null
        23: astore_3
        24: dconst_0
        25: dstore        4
        27: dconst_0
        28: dstore        6
        30: aload_0
        31: invokevirtual #55                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        34: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        37: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.values:()Ljava/util/Collection;
        40: invokeinterface #74,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        45: astore        8
        47: aload         8
        49: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        54: ifeq          263
        57: aload         8
        59: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        64: checkcast     #89                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        67: astore        9
        69: aload         9
        71: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
        74: astore        11
        76: aload         11
        78: instanceof    #95                 // class ext/mods/gameserver/model/actor/Playable
        81: ifeq          47
        84: aload         11
        86: checkcast     #95                 // class ext/mods/gameserver/model/actor/Playable
        89: astore        10
        91: aload         9
        93: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getDamage:()D
        96: dstore        11
        98: dload         11
       100: dconst_1
       101: dcmpg
       102: ifgt          108
       105: goto          47
       108: aload_0
       109: aload         10
       111: getstatic     #101                // Field ext/mods/Config.PARTY_RANGE:I
       114: invokevirtual #107                // Method isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       117: ifne          123
       120: goto          47
       123: aload         10
       125: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       128: astore        13
       130: dload         6
       132: dload         11
       134: dadd
       135: dstore        6
       137: aload_2
       138: aload         10
       140: invokeinterface #115,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       145: checkcast     #121                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       148: astore        14
       150: aload         14
       152: ifnonnull     177
       155: new           #121                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       158: dup
       159: aload         10
       161: invokespecial #123                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
       164: astore        14
       166: aload_2
       167: aload         10
       169: aload         14
       171: invokeinterface #126,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       176: pop
       177: aload         14
       179: dload         11
       181: invokevirtual #130                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.addDamage:(D)V
       184: aload         10
       186: instanceof    #134                // class ext/mods/gameserver/model/actor/Summon
       189: ifeq          239
       192: aload_2
       193: aload         13
       195: invokeinterface #115,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       200: checkcast     #121                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       203: astore        14
       205: aload         14
       207: ifnonnull     232
       210: new           #121                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       213: dup
       214: aload         13
       216: invokespecial #123                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
       219: astore        14
       221: aload_2
       222: aload         13
       224: aload         14
       226: invokeinterface #126,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       231: pop
       232: aload         14
       234: dload         11
       236: invokevirtual #130                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.addDamage:(D)V
       239: aload         14
       241: invokevirtual #136                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.getDamage:()D
       244: dload         4
       246: dcmpl
       247: ifle          260
       250: aload         13
       252: astore_3
       253: aload         14
       255: invokevirtual #136                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.getDamage:()D
       258: dstore        4
       260: goto          47
       263: aload_0
       264: getfield      #137                // Field _firstCcAttacker:Lext/mods/gameserver/model/group/CommandChannel;
       267: ifnull        278
       270: aload_0
       271: getfield      #137                // Field _firstCcAttacker:Lext/mods/gameserver/model/group/CommandChannel;
       274: invokevirtual #141                // Method ext/mods/gameserver/model/group/CommandChannel.getLeader:()Lext/mods/gameserver/model/actor/Player;
       277: astore_3
       278: aload_0
       279: aload_3
       280: ifnull        294
       283: aload_3
       284: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       287: ifeq          294
       290: aload_3
       291: goto          295
       294: aload_1
       295: invokevirtual #151                // Method doItemDrop:(Lext/mods/gameserver/model/actor/Creature;)V
       298: aload_2
       299: invokeinterface #155,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       304: invokeinterface #74,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       309: astore        8
       311: aload         8
       313: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       318: ifeq          1023
       321: aload         8
       323: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       328: checkcast     #121                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       331: astore        9
       333: aload         9
       335: invokevirtual #156                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.getAttacker:()Lext/mods/gameserver/model/actor/Playable;
       338: instanceof    #134                // class ext/mods/gameserver/model/actor/Summon
       341: ifeq          347
       344: goto          311
       347: aload         9
       349: invokevirtual #156                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.getAttacker:()Lext/mods/gameserver/model/actor/Playable;
       352: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       355: astore        10
       357: aload         9
       359: invokevirtual #136                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.getDamage:()D
       362: dstore        11
       364: aload         10
       366: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       369: astore        13
       371: aload         13
       373: ifnonnull     533
       376: aload         10
       378: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       381: ifne          1020
       384: aload         10
       386: aload_0
       387: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.knows:(Lext/mods/gameserver/model/WorldObject;)Z
       390: ifeq          1020
       393: aload         10
       395: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       398: invokevirtual #174                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       401: aload_0
       402: invokevirtual #180                // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       405: invokevirtual #183                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       408: isub
       409: istore        14
       411: aload         10
       413: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.hasServitor:()Z
       416: ifeq          433
       419: aload         10
       421: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       424: checkcast     #193                // class ext/mods/gameserver/model/actor/instance/Servitor
       427: invokevirtual #195                // Method ext/mods/gameserver/model/actor/instance/Servitor.getExpPenalty:()F
       430: goto          434
       433: fconst_0
       434: fstore        15
       436: aload_0
       437: aload         10
       439: iload         14
       441: dload         11
       443: dload         6
       445: aload         10
       447: invokevirtual #199                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       450: invokevirtual #202                // Method calculateExpAndSp:(Lext/mods/gameserver/model/actor/Player;IDDI)[I
       453: astore        16
       455: aload         16
       457: iconst_0
       458: iaload
       459: i2l
       460: lstore        17
       462: aload         16
       464: iconst_1
       465: iaload
       466: istore        19
       468: lload         17
       470: l2f
       471: fconst_1
       472: fload         15
       474: fsub
       475: fmul
       476: f2l
       477: lstore        17
       479: aload_0
       480: getfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
       483: aload         10
       485: invokevirtual #206                // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.isValidOverhit:(Lext/mods/gameserver/model/actor/Player;)Z
       488: ifeq          513
       491: aload         10
       493: getstatic     #210                // Field ext/mods/gameserver/network/SystemMessageId.OVER_HIT:Lext/mods/gameserver/network/SystemMessageId;
       496: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       499: lload         17
       501: aload_0
       502: getfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
       505: lload         17
       507: invokevirtual #220                // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.calculateOverhitExp:(J)J
       510: ladd
       511: lstore        17
       513: aload         10
       515: lload         17
       517: invokevirtual #224                // Method ext/mods/gameserver/model/actor/Player.updateKarmaLoss:(J)V
       520: aload         10
       522: lload         17
       524: iload         19
       526: aload_2
       527: invokevirtual #228                // Method ext/mods/gameserver/model/actor/Player.addExpAndSp:(JILjava/util/Map;)V
       530: goto          1020
       533: dconst_0
       534: dstore        14
       536: dconst_1
       537: dstore        16
       539: iconst_0
       540: istore        18
       542: new           #232                // class java/util/ArrayList
       545: dup
       546: invokespecial #234                // Method java/util/ArrayList."<init>":()V
       549: astore        19
       551: new           #235                // class java/util/HashMap
       554: dup
       555: invokespecial #237                // Method java/util/HashMap."<init>":()V
       558: astore        20
       560: aload         13
       562: invokevirtual #238                // Method ext/mods/gameserver/model/group/Party.isInCommandChannel:()Z
       565: ifeq          579
       568: aload         13
       570: invokevirtual #243                // Method ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
       573: invokevirtual #247                // Method ext/mods/gameserver/model/group/CommandChannel.getMembers:()Ljava/util/List;
       576: goto          584
       579: aload         13
       581: invokevirtual #251                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       584: invokeinterface #252,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       589: astore        21
       591: aload         21
       593: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       598: ifeq          803
       601: aload         21
       603: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       608: checkcast     #147                // class ext/mods/gameserver/model/actor/Player
       611: astore        22
       613: aload         22
       615: ifnull        591
       618: aload         22
       620: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       623: ifeq          629
       626: goto          591
       629: aload_0
       630: aload         22
       632: getstatic     #101                // Field ext/mods/Config.PARTY_RANGE:I
       635: invokevirtual #107                // Method isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       638: istore        23
       640: iload         23
       642: ifeq          697
       645: aload         19
       647: aload         22
       649: invokeinterface #255,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       654: pop
       655: aload         22
       657: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       660: invokevirtual #174                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       663: iload         18
       665: if_icmple     697
       668: aload         13
       670: invokevirtual #238                // Method ext/mods/gameserver/model/group/Party.isInCommandChannel:()Z
       673: ifeq          687
       676: aload         13
       678: invokevirtual #243                // Method ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
       681: invokevirtual #259                // Method ext/mods/gameserver/model/group/CommandChannel.getLevel:()I
       684: goto          695
       687: aload         22
       689: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       692: invokevirtual #174                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       695: istore        18
       697: aload_2
       698: aload         22
       700: invokeinterface #115,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       705: checkcast     #121                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       708: astore        24
       710: aload         24
       712: ifnull        800
       715: iload         23
       717: ifeq          730
       720: dload         14
       722: aload         24
       724: invokevirtual #136                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.getDamage:()D
       727: dadd
       728: dstore        14
       730: aload_2
       731: aload         22
       733: invokeinterface #260,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       738: pop
       739: aload         20
       741: aload         22
       743: aload         24
       745: invokeinterface #126,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       750: pop
       751: aload         22
       753: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.hasPet:()Z
       756: ifeq          800
       759: aload_2
       760: aload         22
       762: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       765: invokeinterface #266,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
       770: ifeq          800
       773: aload         20
       775: aload         22
       777: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       780: aload_2
       781: aload         22
       783: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       786: invokeinterface #115,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       791: checkcast     #121                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       794: invokeinterface #126,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       799: pop
       800: goto          591
       803: dload         14
       805: dload         6
       807: dcmpg
       808: ifge          818
       811: dload         14
       813: dload         6
       815: ddiv
       816: dstore        16
       818: iload         18
       820: aload_0
       821: invokevirtual #180                // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       824: invokevirtual #183                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       827: isub
       828: istore        21
       830: aload_0
       831: aload         10
       833: iload         21
       835: dload         14
       837: dload         6
       839: iconst_1
       840: invokevirtual #202                // Method calculateExpAndSp:(Lext/mods/gameserver/model/actor/Player;IDDI)[I
       843: astore        22
       845: aload         22
       847: iconst_0
       848: iaload
       849: i2d
       850: dload         16
       852: dmul
       853: d2l
       854: lstore        23
       856: aload         22
       858: iconst_1
       859: iaload
       860: i2d
       861: dload         16
       863: dmul
       864: d2i
       865: istore        25
       867: aload_0
       868: aload         10
       870: iload         21
       872: dload         14
       874: dload         6
       876: iconst_0
       877: invokevirtual #202                // Method calculateExpAndSp:(Lext/mods/gameserver/model/actor/Player;IDDI)[I
       880: astore        26
       882: aload         26
       884: iconst_0
       885: iaload
       886: i2d
       887: dload         16
       889: dmul
       890: d2l
       891: lstore        27
       893: aload         26
       895: iconst_1
       896: iaload
       897: i2d
       898: dload         16
       900: dmul
       901: d2i
       902: istore        29
       904: aload_0
       905: aload         10
       907: iload         21
       909: dload         14
       911: dload         6
       913: iconst_0
       914: invokevirtual #202                // Method calculateExpAndSp:(Lext/mods/gameserver/model/actor/Player;IDDI)[I
       917: astore        30
       919: aload         30
       921: iconst_0
       922: iaload
       923: i2d
       924: dload         16
       926: dmul
       927: d2l
       928: lstore        31
       930: aload_0
       931: getfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
       934: aload         10
       936: invokevirtual #206                // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.isValidOverhit:(Lext/mods/gameserver/model/actor/Player;)Z
       939: ifeq          992
       942: aload         10
       944: getstatic     #210                // Field ext/mods/gameserver/network/SystemMessageId.OVER_HIT:Lext/mods/gameserver/network/SystemMessageId;
       947: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       950: lload         27
       952: aload_0
       953: getfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
       956: lload         27
       958: invokevirtual #220                // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.calculateOverhitExp:(J)J
       961: ladd
       962: lstore        27
       964: lload         23
       966: aload_0
       967: getfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
       970: lload         23
       972: invokevirtual #220                // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.calculateOverhitExp:(J)J
       975: ladd
       976: lstore        23
       978: lload         31
       980: aload_0
       981: getfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
       984: lload         31
       986: invokevirtual #220                // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.calculateOverhitExp:(J)J
       989: ladd
       990: lstore        31
       992: dload         14
       994: dconst_0
       995: dcmpl
       996: ifle          1020
       999: aload         13
      1001: lload         31
      1003: lload         23
      1005: iload         25
      1007: lload         27
      1009: iload         29
      1011: aload         19
      1013: iload         18
      1015: aload         20
      1017: invokevirtual #269                // Method ext/mods/gameserver/model/group/Party.distributeXpAndSp:(JJIJILjava/util/List;ILjava/util/Map;)V
      1020: goto          311
      1023: return
      LineNumberTable:
        line 107: 0
        line 108: 13
        line 110: 14
        line 112: 22
        line 113: 24
        line 114: 27
        line 116: 30
        line 118: 69
        line 121: 91
        line 122: 98
        line 123: 105
        line 125: 108
        line 126: 120
        line 128: 123
        line 130: 130
        line 132: 137
        line 133: 150
        line 135: 155
        line 136: 166
        line 138: 177
        line 140: 184
        line 142: 192
        line 143: 205
        line 145: 210
        line 146: 221
        line 148: 232
        line 151: 239
        line 153: 250
        line 154: 253
        line 156: 260
        line 158: 263
        line 159: 270
        line 161: 278
        line 163: 298
        line 165: 333
        line 166: 344
        line 168: 347
        line 170: 357
        line 172: 364
        line 173: 371
        line 175: 376
        line 177: 393
        line 178: 411
        line 179: 436
        line 181: 455
        line 182: 462
        line 184: 468
        line 186: 479
        line 188: 491
        line 189: 499
        line 192: 513
        line 194: 520
        line 195: 530
        line 199: 533
        line 200: 536
        line 202: 539
        line 204: 542
        line 205: 551
        line 207: 560
        line 209: 613
        line 210: 626
        line 212: 629
        line 213: 640
        line 215: 645
        line 217: 655
        line 218: 668
        line 221: 697
        line 222: 710
        line 224: 715
        line 225: 720
        line 227: 730
        line 229: 739
        line 230: 751
        line 231: 773
        line 233: 800
        line 235: 803
        line 236: 811
        line 238: 818
        line 240: 830
        line 241: 845
        line 242: 856
        line 244: 867
        line 245: 882
        line 246: 893
        line 248: 904
        line 249: 919
        line 251: 930
        line 253: 942
        line 254: 950
        line 255: 964
        line 256: 978
        line 259: 992
        line 260: 999
        line 262: 1020
        line 263: 1023
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           91     169    10 attacker   Lext/mods/gameserver/model/actor/Playable;
           98     162    11 damage   D
          130     130    13 attackerPlayer   Lext/mods/gameserver/model/actor/Player;
          150     110    14 reward   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
           69     191     9  info   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
          411     119    14 levelDiff   I
          436      94    15 penalty   F
          455      75    16 expSp   [I
          462      68    17   exp   J
          468      62    19    sp   I
          640     160    23 isInRange   Z
          710      90    24 reward2   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
          613     187    22 partyPlayer   Lext/mods/gameserver/model/actor/Player;
          536     484    14 partyDmg   D
          539     481    16 partyMul   D
          542     478    18 partyLvl   I
          551     469    19 rewardedMembers   Ljava/util/List;
          560     460    20 playersWithPets   Ljava/util/Map;
          830     190    21 levelDiff   I
          845     175    22 expSp1   [I
          856     164    23 exp_premium   J
          867     153    25 sp_premium   I
          882     138    26 expSp   [I
          893     127    27   exp   J
          904     116    29    sp   I
          919     101    30 dynamExp   [I
          930      90    31 exp_dynam   J
          357     663    10 attacker   Lext/mods/gameserver/model/actor/Player;
          364     656    11 damage   D
          371     649    13 attackerParty   Lext/mods/gameserver/model/group/Party;
          333     687     9 reward   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
            0    1024     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0    1024     1 creature   Lext/mods/gameserver/model/actor/Creature;
           22    1002     2 rewards   Ljava/util/Map;
           24    1000     3 maxDealer   Lext/mods/gameserver/model/actor/Player;
           27     997     4 maxDamage   D
           30     994     6 totalDamage   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          551     469    19 rewardedMembers   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
          560     460    20 playersWithPets   Ljava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;
           22    1002     2 rewards   Ljava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;
      StackMapTable: number_of_entries = 32
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double, class java/util/Iterator ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo, class ext/mods/gameserver/model/actor/Playable, double ]
        frame_type = 14 /* same */
        frame_type = 253 /* append */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/container/npc/RewardInfo ]
        frame_type = 54 /* same */
        frame_type = 6 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 14 /* same */
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/container/npc/RewardInfo ]
        frame_type = 255 /* full_frame */
          offset_delta = 85
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double, class java/util/Iterator, class ext/mods/gameserver/model/actor/container/npc/RewardInfo, class ext/mods/gameserver/model/actor/Player, double, class ext/mods/gameserver/model/group/Party, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ float ]
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double, class java/util/Iterator, class ext/mods/gameserver/model/actor/container/npc/RewardInfo, class ext/mods/gameserver/model/actor/Player, double, class ext/mods/gameserver/model/group/Party, int, float, class "[I", long, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double, class java/util/Iterator, class ext/mods/gameserver/model/actor/container/npc/RewardInfo, class ext/mods/gameserver/model/actor/Player, double, class ext/mods/gameserver/model/group/Party ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double, class java/util/Iterator, class ext/mods/gameserver/model/actor/container/npc/RewardInfo, class ext/mods/gameserver/model/actor/Player, double, class ext/mods/gameserver/model/group/Party, double, double, int, class java/util/List, class java/util/Map ]
          stack = []
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 57
          locals = [ int ]
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/container/npc/RewardInfo ]
        frame_type = 248 /* chop */
          offset_delta = 69
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 173
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double, class java/util/Iterator, class ext/mods/gameserver/model/actor/container/npc/RewardInfo, class ext/mods/gameserver/model/actor/Player, double, class ext/mods/gameserver/model/group/Party, double, double, int, class java/util/List, class java/util/Map, int, class "[I", long, int, class "[I", long, int, class "[I", long ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class java/util/Map, class ext/mods/gameserver/model/actor/Player, double, double, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean isAggressive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #45                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #273                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
         7: ifle          14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 268: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #276                // Method ext/mods/gameserver/model/actor/Attackable.onSpawn:()V
         4: aload_0
         5: getfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.clear:()V
        11: aload_0
        12: getfield      #30                 // Field _spoilState:Lext/mods/gameserver/model/actor/container/monster/SpoilState;
        15: invokevirtual #282                // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.clear:()V
        18: aload_0
        19: getfield      #37                 // Field _seedState:Lext/mods/gameserver/model/actor/container/monster/SeedState;
        22: invokevirtual #283                // Method ext/mods/gameserver/model/actor/container/monster/SeedState.clear:()V
        25: aload_0
        26: getfield      #12                 // Field _absorbersList:Ljava/util/Map;
        29: invokeinterface #284,  1          // InterfaceMethod java/util/Map.clear:()V
        34: return
      LineNumberTable:
        line 274: 0
        line 276: 4
        line 278: 11
        line 280: 18
        line 282: 25
        line 284: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/instance/Monster;

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=6
         0: aload_3
         1: ifnull        134
         4: aload_0
         5: invokevirtual #285                // Method isRaidBoss:()Z
         8: ifeq          134
        11: aload_3
        12: invokevirtual #288                // Method ext/mods/gameserver/model/actor/Creature.getParty:()Lext/mods/gameserver/model/group/Party;
        15: astore        7
        17: aload         7
        19: ifnull        134
        22: aload         7
        24: invokevirtual #243                // Method ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
        27: astore        8
        29: aload         8
        31: aload_0
        32: invokevirtual #291                // Method getNpcId:()I
        35: invokestatic  #294                // Method ext/mods/gameserver/enums/BossInfoType.isCcMeetCondition:(Lext/mods/gameserver/model/group/CommandChannel;I)Z
        38: ifeq          134
        41: aload_0
        42: getfield      #300                // Field _ccTask:Ljava/util/concurrent/ScheduledFuture;
        45: ifnonnull     115
        48: aload_0
        49: aload_0
        50: invokedynamic #304,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/Runnable;
        55: ldc2_w        #308                // long 1000l
        58: ldc2_w        #308                // long 1000l
        61: invokestatic  #310                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        64: putfield      #300                // Field _ccTask:Ljava/util/concurrent/ScheduledFuture;
        67: aload_0
        68: invokestatic  #316                // Method java/lang/System.currentTimeMillis:()J
        71: putfield      #322                // Field _lastCcAttack:J
        74: aload_0
        75: aload         8
        77: putfield      #137                // Field _firstCcAttacker:Lext/mods/gameserver/model/group/CommandChannel;
        80: aload_0
        81: sipush        10000
        84: aload_0
        85: invokevirtual #291                // Method getNpcId:()I
        88: invokestatic  #326                // Method ext/mods/gameserver/enums/BossInfoType.getBossInfo:(I)Lext/mods/gameserver/enums/BossInfoType;
        91: invokevirtual #330                // Method ext/mods/gameserver/enums/BossInfoType.getCcRightsMsg:()Lext/mods/gameserver/network/NpcStringId;
        94: iconst_1
        95: anewarray     #334                // class java/lang/Object
        98: dup
        99: iconst_0
       100: aload         8
       102: invokevirtual #141                // Method ext/mods/gameserver/model/group/CommandChannel.getLeader:()Lext/mods/gameserver/model/actor/Player;
       105: invokevirtual #336                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       108: aastore
       109: invokevirtual #340                // Method broadcastOnScreen:(ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
       112: goto          134
       115: aload_0
       116: getfield      #137                // Field _firstCcAttacker:Lext/mods/gameserver/model/group/CommandChannel;
       119: aload         8
       121: invokevirtual #344                // Method ext/mods/gameserver/model/group/CommandChannel.equals:(Lext/mods/gameserver/model/group/CommandChannel;)Z
       124: ifeq          134
       127: aload_0
       128: invokestatic  #316                // Method java/lang/System.currentTimeMillis:()J
       131: putfield      #322                // Field _lastCcAttack:J
       134: aload_0
       135: dload_1
       136: aload_3
       137: iload         4
       139: iload         5
       141: aload         6
       143: invokespecial #348                // Method ext/mods/gameserver/model/actor/Attackable.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
       146: return
      LineNumberTable:
        line 289: 0
        line 291: 11
        line 292: 17
        line 294: 22
        line 295: 29
        line 297: 41
        line 299: 48
        line 300: 67
        line 301: 74
        line 303: 80
        line 305: 115
        line 306: 127
        line 310: 134
        line 311: 146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29     105     8    cc   Lext/mods/gameserver/model/group/CommandChannel;
           17     117     7 party   Lext/mods/gameserver/model/group/Party;
            0     147     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0     147     1 damage   D
            0     147     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0     147     4 awake   Z
            0     147     5 isDOT   Z
            0     147     6 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 115
          locals = [ class ext/mods/gameserver/model/group/Party, class ext/mods/gameserver/model/group/CommandChannel ]
        frame_type = 249 /* chop */
          offset_delta = 18

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: instanceof    #95                 // class ext/mods/gameserver/model/actor/Playable
         4: ifeq          32
         7: aload_1
         8: checkcast     #95                 // class ext/mods/gameserver/model/actor/Playable
        11: astore_2
        12: aload_2
        13: invokevirtual #352                // Method ext/mods/gameserver/model/actor/Playable.getClanId:()I
        16: ifle          32
        19: aload_2
        20: invokevirtual #352                // Method ext/mods/gameserver/model/actor/Playable.getClanId:()I
        23: aload_0
        24: invokevirtual #355                // Method getClanId:()I
        27: if_icmpne     32
        30: iconst_0
        31: ireturn
        32: aload_0
        33: aload_1
        34: invokespecial #356                // Method ext/mods/gameserver/model/actor/Attackable.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
        37: ireturn
      LineNumberTable:
        line 316: 0
        line 317: 30
        line 319: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      20     2 playableAttacker   Lext/mods/gameserver/model/actor/Playable;
            0      38     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0      38     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 32 /* same */

  public boolean isAttackableWithoutForceBy(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #360                // Method isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ireturn
      LineNumberTable:
        line 325: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0       6     1 attacker   Lext/mods/gameserver/model/actor/Playable;

  public boolean isRaidRelated();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #361                // Field _isRaidRelated:Z
         4: ireturn
      LineNumberTable:
        line 331: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Monster;

  public void setRaidRelated();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #361                // Field _isRaidRelated:Z
         5: return
      LineNumberTable:
        line 343: 0
        line 344: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Monster;

  public ext.mods.gameserver.model.actor.container.monster.OverhitState getOverhitState();
    descriptor: ()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _overhitState:Lext/mods/gameserver/model/actor/container/monster/OverhitState;
         4: areturn
      LineNumberTable:
        line 348: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Monster;

  public ext.mods.gameserver.model.actor.container.monster.SpoilState getSpoilState();
    descriptor: ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _spoilState:Lext/mods/gameserver/model/actor/container/monster/SpoilState;
         4: areturn
      LineNumberTable:
        line 353: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Monster;

  public ext.mods.gameserver.model.actor.container.monster.SeedState getSeedState();
    descriptor: ()Lext/mods/gameserver/model/actor/container/monster/SeedState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _seedState:Lext/mods/gameserver/model/actor/container/monster/SeedState;
         4: areturn
      LineNumberTable:
        line 358: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Monster;

  public void addAbsorber(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _absorbersList:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #368                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #115,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #374                // class ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
        19: astore_3
        20: aload_3
        21: ifnonnull     55
        24: aload_0
        25: getfield      #12                 // Field _absorbersList:Ljava/util/Map;
        28: aload_1
        29: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        32: invokestatic  #368                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: new           #374                // class ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
        38: dup
        39: aload_2
        40: invokevirtual #376                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        43: invokespecial #379                // Method ext/mods/gameserver/model/actor/container/npc/AbsorbInfo."<init>":(I)V
        46: invokeinterface #126,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        51: pop
        52: goto          70
        55: aload_3
        56: invokevirtual #382                // Method ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.isRegistered:()Z
        59: ifne          70
        62: aload_3
        63: aload_2
        64: invokevirtual #376                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        67: invokevirtual #385                // Method ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.setItemId:(I)V
        70: return
      LineNumberTable:
        line 368: 0
        line 369: 20
        line 371: 24
        line 375: 55
        line 376: 62
        line 378: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0      71     1 player   Lext/mods/gameserver/model/actor/Player;
            0      71     2 crystal   Lext/mods/gameserver/model/item/instance/ItemInstance;
           20      51     3    ai   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AbsorbInfo ]
        frame_type = 14 /* same */

  public void registerAbsorber(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _absorbersList:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #368                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #115,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #374                // class ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
        19: astore_2
        20: aload_2
        21: ifnonnull     25
        24: return
        25: aload_1
        26: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        29: aload_2
        30: invokevirtual #392                // Method ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.getItemId:()I
        33: invokevirtual #395                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        36: ifnonnull     40
        39: return
        40: aload_2
        41: invokevirtual #382                // Method ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.isRegistered:()Z
        44: ifne          67
        47: aload_2
        48: aload_0
        49: invokevirtual #180                // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        52: invokevirtual #401                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getHpRatio:()D
        55: d2i
        56: bipush        100
        58: imul
        59: invokevirtual #404                // Method ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.setAbsorbedHpPercent:(I)V
        62: aload_2
        63: iconst_1
        64: invokevirtual #407                // Method ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.setRegistered:(Z)V
        67: return
      LineNumberTable:
        line 386: 0
        line 387: 20
        line 388: 24
        line 390: 25
        line 391: 39
        line 393: 40
        line 395: 47
        line 396: 62
        line 398: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0      68     1 player   Lext/mods/gameserver/model/actor/Player;
           20      48     2    ai   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AbsorbInfo ]
        frame_type = 14 /* same */
        frame_type = 26 /* same */

  public ext.mods.gameserver.model.actor.container.npc.AbsorbInfo getAbsorbInfo(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _absorbersList:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #368                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #115,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #374                // class ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
        16: areturn
      LineNumberTable:
        line 402: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0      17     1 npcObjectId   I

  public final boolean isChampion();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #506                // Field _isChampion:Z
         4: ireturn
      LineNumberTable:
        line 532: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Monster;

  public final void setChampion(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #506                // Field _isChampion:Z
         5: return
      LineNumberTable:
        line 537: 0
        line 538: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0       6     1 value   Z

  public void doItemDrop(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=24, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_1
         6: invokevirtual #519                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         9: astore_2
        10: aload_2
        11: ifnonnull     15
        14: return
        15: invokestatic  #520                // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
        18: aload_0
        19: aload_2
        20: invokevirtual #525                // Method ext/mods/gameserver/data/manager/CursedWeaponManager.checkDrop:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
        23: aload_0
        24: aload_2
        25: invokevirtual #529                // Method calculateLevelMultiplier:(Lext/mods/gameserver/model/actor/Player;)D
        28: dstore_3
        29: aload_0
        30: invokevirtual #447                // Method isChampion:()Z
        33: ifeq          132
        36: getstatic     #533                // Field ext/mods/Config.CHAMPION_REWARD:I
        39: ifle          132
        42: aload_2
        43: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        46: invokevirtual #174                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        49: aload_0
        50: invokevirtual #180                // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        53: invokevirtual #183                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
        56: bipush        9
        58: iadd
        59: if_icmpgt     132
        62: getstatic     #533                // Field ext/mods/Config.CHAMPION_REWARD:I
        65: istore        5
        67: bipush        100
        69: invokestatic  #536                // Method ext/mods/commons/random/Rnd.get:(I)I
        72: iload         5
        74: if_icmpge     132
        77: new           #540                // class ext/mods/gameserver/model/holder/IntIntHolder
        80: dup
        81: getstatic     #542                // Field ext/mods/Config.CHAMPION_REWARD_ID:I
        84: iconst_1
        85: iconst_1
        86: getstatic     #545                // Field ext/mods/Config.CHAMPION_REWARD_QTY:I
        89: invokestatic  #548                // Method ext/mods/commons/random/Rnd.get:(II)I
        92: invokestatic  #551                // Method java/lang/Math.max:(II)I
        95: invokespecial #553                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        98: astore        6
       100: getstatic     #556                // Field ext/mods/Config.AUTO_LOOT:Z
       103: ifeq          125
       106: aload_2
       107: aload         6
       109: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       112: aload         6
       114: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       117: iconst_1
       118: invokevirtual #565                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       121: pop
       122: goto          132
       125: aload_0
       126: aload         6
       128: aload_2
       129: invokevirtual #569                // Method dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
       132: aload_0
       133: ldc_w         #573                // String Christmas
       136: aload_1
       137: aload_2
       138: invokevirtual #575                // Method handleEventDrop:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
       141: aload_0
       142: ldc_w         #579                // String HeavyMedal
       145: aload_1
       146: aload_2
       147: invokevirtual #575                // Method handleEventDrop:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
       150: aload_0
       151: ldc_w         #581                // String L2Day
       154: aload_1
       155: aload_2
       156: invokevirtual #575                // Method handleEventDrop:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
       159: aload_0
       160: ldc_w         #583                // String Squash
       163: aload_1
       164: aload_2
       165: invokevirtual #575                // Method handleEventDrop:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
       168: invokestatic  #585                // Method ext/mods/Crypta/GlobalDropManager.getInstance:()Lext/mods/Crypta/GlobalDropManager;
       171: astore        5
       173: aload         5
       175: ifnull        226
       178: invokestatic  #585                // Method ext/mods/Crypta/GlobalDropManager.getInstance:()Lext/mods/Crypta/GlobalDropManager;
       181: aload_0
       182: invokevirtual #590                // Method ext/mods/Crypta/GlobalDropManager.shouldCancelOriginalDrop:(Lext/mods/gameserver/model/actor/Attackable;)Z
       185: invokestatic  #594                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       188: astore        6
       190: aload         6
       192: instanceof    #595                // class java/lang/Boolean
       195: ifeq          218
       198: aload         6
       200: checkcast     #595                // class java/lang/Boolean
       203: invokevirtual #599                // Method java/lang/Boolean.booleanValue:()Z
       206: ifeq          218
       209: invokestatic  #585                // Method ext/mods/Crypta/GlobalDropManager.getInstance:()Lext/mods/Crypta/GlobalDropManager;
       212: aload_2
       213: aload_0
       214: invokevirtual #602                // Method ext/mods/Crypta/GlobalDropManager.onKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
       217: return
       218: invokestatic  #585                // Method ext/mods/Crypta/GlobalDropManager.getInstance:()Lext/mods/Crypta/GlobalDropManager;
       221: aload_2
       222: aload_0
       223: invokevirtual #602                // Method ext/mods/Crypta/GlobalDropManager.onKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
       226: invokestatic  #473                // Method ext/mods/gameserver/custom/data/RatesData.getInstance:()Lext/mods/gameserver/custom/data/RatesData;
       229: aload_2
       230: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       233: invokevirtual #174                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       236: invokevirtual #479                // Method ext/mods/gameserver/custom/data/RatesData.getRates:(I)Lext/mods/gameserver/model/records/custom/RatesHolder;
       239: astore        6
       241: aload         6
       243: ifnull        255
       246: aload         6
       248: invokevirtual #606                // Method ext/mods/gameserver/model/records/custom/RatesHolder.getDropRate:()F
       251: f2d
       252: goto          256
       255: dconst_1
       256: dstore        7
       258: aload         6
       260: ifnull        271
       263: aload         6
       265: invokevirtual #609                // Method ext/mods/gameserver/model/records/custom/RatesHolder.getSpoilRate:()D
       268: goto          272
       271: dconst_1
       272: dstore        9
       274: aload_0
       275: invokevirtual #612                // Method getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
       278: invokevirtual #616                // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
       281: istore        11
       283: aload_0
       284: invokevirtual #619                // Method getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
       287: invokevirtual #623                // Method ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
       290: ifeq          310
       293: aload_0
       294: invokevirtual #619                // Method getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
       297: invokevirtual #626                // Method ext/mods/gameserver/model/actor/container/monster/SeedState.getSeed:()Lext/mods/gameserver/model/manor/Seed;
       300: invokevirtual #630                // Method ext/mods/gameserver/model/manor/Seed.isAlternative:()Z
       303: ifne          310
       306: iconst_1
       307: goto          311
       310: iconst_0
       311: istore        12
       313: aload_0
       314: invokevirtual #285                // Method isRaidBoss:()Z
       317: istore        13
       319: aload_0
       320: invokevirtual #45                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       323: invokevirtual #635                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getDropData:()Ljava/util/List;
       326: invokeinterface #252,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       331: astore        14
       333: aload         14
       335: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       340: ifeq          744
       343: aload         14
       345: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       350: checkcast     #638                // class ext/mods/gameserver/model/item/DropCategory
       353: astore        15
       355: aload         15
       357: invokevirtual #640                // Method ext/mods/gameserver/model/item/DropCategory.getDropType:()Lext/mods/gameserver/enums/DropType;
       360: astore        16
       362: aload         16
       364: getstatic     #644                // Field ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
       367: if_acmpne     378
       370: iload         11
       372: ifne          378
       375: goto          333
       378: aload         16
       380: getstatic     #650                // Field ext/mods/gameserver/enums/DropType.DROP:Lext/mods/gameserver/enums/DropType;
       383: if_acmpne     394
       386: iload         12
       388: ifeq          394
       391: goto          333
       394: dload_3
       395: aload         16
       397: getstatic     #644                // Field ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
       400: if_acmpne     408
       403: dload         9
       405: goto          410
       408: dload         7
       410: dmul
       411: dstore        17
       413: getstatic     #653                // Field ext/mods/Config.ALTERNATE_DROP_LIST:Z
       416: ifeq          438
       419: aload         15
       421: aload_2
       422: aload_0
       423: new           #232                // class java/util/ArrayList
       426: dup
       427: invokespecial #234                // Method java/util/ArrayList."<init>":()V
       430: iload         13
       432: invokevirtual #656                // Method ext/mods/gameserver/model/item/DropCategory.calcDropList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Ljava/util/List;
       435: goto          449
       438: aload         15
       440: aload_2
       441: aload_0
       442: dload         17
       444: iload         13
       446: invokevirtual #660                // Method ext/mods/gameserver/model/item/DropCategory.calculateDrop:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DZ)Ljava/util/List;
       449: invokeinterface #252,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       454: astore        19
       456: aload         19
       458: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       463: ifeq          741
       466: aload         19
       468: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       473: checkcast     #540                // class ext/mods/gameserver/model/holder/IntIntHolder
       476: astore        20
       478: getstatic     #664                // Field ext/mods/Config.DROP_ITEMS:Z
       481: ifeq          569
       484: aload         16
       486: getstatic     #667                // Field ext/mods/gameserver/enums/DropType.HERB:Lext/mods/gameserver/enums/DropType;
       489: if_acmpeq     569
       492: new           #670                // class java/util/logging/LogRecord
       495: dup
       496: getstatic     #672                // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
       499: aload         16
       501: invokevirtual #678                // Method ext/mods/gameserver/enums/DropType.name:()Ljava/lang/String;
       504: invokespecial #681                // Method java/util/logging/LogRecord."<init>":(Ljava/util/logging/Level;Ljava/lang/String;)V
       507: astore        21
       509: aload         21
       511: ldc_w         #684                // String drop
       514: invokevirtual #686                // Method java/util/logging/LogRecord.setLoggerName:(Ljava/lang/String;)V
       517: aload         21
       519: iconst_4
       520: anewarray     #334                // class java/lang/Object
       523: dup
       524: iconst_0
       525: aload_1
       526: aastore
       527: dup
       528: iconst_1
       529: aload_0
       530: aastore
       531: dup
       532: iconst_2
       533: invokestatic  #690                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       536: aload         20
       538: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       541: invokevirtual #695                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       544: aastore
       545: dup
       546: iconst_3
       547: aload         20
       549: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       552: invokedynamic #698,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       557: aastore
       558: invokevirtual #702                // Method java/util/logging/LogRecord.setParameters:([Ljava/lang/Object;)V
       561: getstatic     #706                // Field DROP_LOG:Ljava/util/logging/Logger;
       564: aload         21
       566: invokevirtual #710                // Method java/util/logging/Logger.log:(Ljava/util/logging/LogRecord;)V
       569: aload         16
       571: getstatic     #644                // Field ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
       574: if_acmpne     590
       577: aload_0
       578: invokevirtual #612                // Method getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
       581: aload         20
       583: invokevirtual #716                // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.add:(Ljava/lang/Object;)Z
       586: pop
       587: goto          615
       590: aload         16
       592: getstatic     #667                // Field ext/mods/gameserver/enums/DropType.HERB:Lext/mods/gameserver/enums/DropType;
       595: if_acmpne     608
       598: aload_0
       599: aload_2
       600: aload         20
       602: invokevirtual #717                // Method dropOrAutoLootHerb:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;)V
       605: goto          615
       608: aload_0
       609: aload_2
       610: aload         20
       612: invokevirtual #721                // Method dropOrAutoLootItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;)V
       615: aload_0
       616: invokevirtual #285                // Method isRaidBoss:()Z
       619: ifeq          738
       622: invokestatic  #724                // Method ext/mods/gameserver/custom/data/RaidDropAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
       625: invokevirtual #729                // Method ext/mods/gameserver/custom/data/RaidDropAnnounceData.isEnabled:()Z
       628: ifeq          738
       631: invokestatic  #690                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       634: aload         20
       636: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       639: invokevirtual #695                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       642: astore        21
       644: invokestatic  #724                // Method ext/mods/gameserver/custom/data/RaidDropAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
       647: aload         21
       649: invokevirtual #732                // Method ext/mods/gameserver/custom/data/RaidDropAnnounceData.shouldAnnounce:(Lext/mods/gameserver/model/item/kind/Item;)Z
       652: ifeq          738
       655: invokestatic  #724                // Method ext/mods/gameserver/custom/data/RaidDropAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/RaidDropAnnounceData;
       658: aload         21
       660: invokevirtual #736                // Method ext/mods/gameserver/custom/data/RaidDropAnnounceData.getMessageTemplate:(Lext/mods/gameserver/model/item/kind/Item;)Ljava/lang/String;
       663: astore        22
       665: aload         22
       667: ifnull        678
       670: aload         22
       672: invokevirtual #740                // Method java/lang/String.isEmpty:()Z
       675: ifeq          683
       678: ldc_w         #743                // String [RAID DROP] {player} killed {boss} and got: {amount}x {item}.
       681: astore        22
       683: aload         22
       685: ldc_w         #745                // String {player}
       688: aload_2
       689: invokevirtual #336                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       692: invokevirtual #747                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       695: ldc_w         #751                // String {boss}
       698: aload_0
       699: invokevirtual #753                // Method getName:()Ljava/lang/String;
       702: invokevirtual #747                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       705: ldc_w         #754                // String {item}
       708: aload         21
       710: invokevirtual #756                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
       713: invokevirtual #747                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       716: ldc_w         #759                // String {amount}
       719: aload         20
       721: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       724: invokestatic  #761                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       727: invokevirtual #747                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       730: astore        23
       732: aload         23
       734: iconst_1
       735: invokestatic  #763                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
       738: goto          456
       741: goto          333
       744: return
      LineNumberTable:
        line 562: 0
        line 563: 4
        line 565: 5
        line 566: 10
        line 567: 14
        line 569: 15
        line 571: 23
        line 573: 29
        line 575: 62
        line 577: 67
        line 579: 77
        line 581: 100
        line 582: 106
        line 584: 125
        line 588: 132
        line 589: 141
        line 590: 150
        line 591: 159
        line 593: 168
        line 594: 173
        line 596: 178
        line 597: 190
        line 599: 209
        line 600: 217
        line 603: 218
        line 606: 226
        line 607: 241
        line 608: 258
        line 610: 274
        line 611: 283
        line 612: 313
        line 614: 319
        line 616: 355
        line 618: 362
        line 619: 375
        line 621: 378
        line 622: 391
        line 624: 394
        line 626: 413
        line 628: 478
        line 630: 492
        line 631: 509
        line 632: 517
        line 636: 533
        line 637: 549
        line 632: 558
        line 639: 561
        line 642: 569
        line 643: 577
        line 644: 590
        line 645: 598
        line 647: 608
        line 649: 615
        line 651: 631
        line 652: 644
        line 654: 655
        line 655: 665
        line 656: 678
        line 658: 683
        line 660: 732
        line 664: 738
        line 665: 741
        line 667: 744
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          100      32     6  item   Lext/mods/gameserver/model/holder/IntIntHolder;
           67      65     5 dropChance   I
          190      36     6 shouldCancel   Ljava/lang/Object;
          509      60    21 logRecord   Ljava/util/logging/LogRecord;
          665      73    22 template   Ljava/lang/String;
          732       6    23   msg   Ljava/lang/String;
          644      94    21  item   Lext/mods/gameserver/model/item/kind/Item;
          478     260    20  drop   Lext/mods/gameserver/model/holder/IntIntHolder;
          362     379    16  type   Lext/mods/gameserver/enums/DropType;
          413     328    17 effectiveMultiplier   D
          355     386    15 category   Lext/mods/gameserver/model/item/DropCategory;
            0     745     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0     745     1 creature   Lext/mods/gameserver/model/actor/Creature;
           10     735     2 player   Lext/mods/gameserver/model/actor/Player;
           29     716     3 levelMultiplier   D
          173     572     5 globalDropManager   Ljava/lang/Object;
          241     504     6 rates   Lext/mods/gameserver/model/records/custom/RatesHolder;
          258     487     7 dropRateMult   D
          274     471     9 spoilRateMult   D
          283     462    11 isSpoiled   Z
          313     432    12 isBlockingDrops   Z
          319     426    13 isRaid   Z
      StackMapTable: number_of_entries = 29
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 254 /* append */
          offset_delta = 109
          locals = [ double, int, class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 249 /* chop */
          offset_delta = 6
        frame_type = 253 /* append */
          offset_delta = 85
          locals = [ class java/lang/Object, class java/lang/Object ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/records/custom/RatesHolder ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ double ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ double, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 254 /* append */
          offset_delta = 21
          locals = [ int, int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/item/DropCategory, class ext/mods/gameserver/enums/DropType ]
        frame_type = 15 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, double, class java/lang/Object, class ext/mods/gameserver/model/records/custom/RatesHolder, double, double, int, int, int, class java/util/Iterator, class ext/mods/gameserver/model/item/DropCategory, class ext/mods/gameserver/enums/DropType ]
          stack = [ double, double ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ double ]
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 112
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 20 /* same */
        frame_type = 17 /* same */
        frame_type = 6 /* same */
        frame_type = 253 /* append */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/model/item/kind/Item, class java/lang/String ]
        frame_type = 4 /* same */
        frame_type = 248 /* chop */
          offset_delta = 54
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, double, class java/lang/Object, class ext/mods/gameserver/model/records/custom/RatesHolder, double, double, int, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2

  public void dropOrAutoLootItem(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.holder.IntIntHolder);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=3
         0: aload_2
         1: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
         4: istore_3
         5: invokestatic  #769                // Method ext/mods/gameserver/data/manager/DropSkipManager.getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
         8: aload_1
         9: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        12: iload_3
        13: invokevirtual #774                // Method ext/mods/gameserver/data/manager/DropSkipManager.isSkipped:(II)Z
        16: ifeq          20
        19: return
        20: invokestatic  #690                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        23: aload_2
        24: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        27: invokevirtual #695                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        30: astore        4
        32: invokestatic  #473                // Method ext/mods/gameserver/custom/data/RatesData.getInstance:()Lext/mods/gameserver/custom/data/RatesData;
        35: aload_1
        36: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        39: invokevirtual #174                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        42: invokevirtual #479                // Method ext/mods/gameserver/custom/data/RatesData.getRates:(I)Lext/mods/gameserver/model/records/custom/RatesHolder;
        45: astore        5
        47: aload         5
        49: ifnull        61
        52: aload         5
        54: invokevirtual #778                // Method ext/mods/gameserver/model/records/custom/RatesHolder.getAdenaRate:()F
        57: f2d
        58: goto          62
        61: dconst_1
        62: dstore        6
        64: getstatic     #781                // Field ext/mods/Config.ENABLE_MENU:Z
        67: ifeq          261
        70: aload_0
        71: invokevirtual #285                // Method isRaidBoss:()Z
        74: ifeq          100
        77: getstatic     #784                // Field ext/mods/Config.AUTO_LOOT_RAID:Z
        80: ifeq          100
        83: aload_1
        84: aload_2
        85: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        88: aload_2
        89: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        92: iconst_1
        93: invokevirtual #565                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
        96: pop
        97: goto          113
       100: aload_0
       101: invokevirtual #285                // Method isRaidBoss:()Z
       104: ifeq          113
       107: aload_0
       108: aload_2
       109: aload_1
       110: invokevirtual #569                // Method dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
       113: aload_1
       114: invokevirtual #787                // Method ext/mods/gameserver/model/actor/Player.getAutoLoot:()Z
       117: ifeq          245
       120: aload_0
       121: invokevirtual #285                // Method isRaidBoss:()Z
       124: ifne          245
       127: aload_1
       128: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       131: aload_2
       132: invokevirtual #790                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacityByItemId:(Lext/mods/gameserver/model/holder/IntIntHolder;)Z
       135: ifeq          236
       138: aload_1
       139: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       142: ifeq          159
       145: aload_1
       146: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       149: aload_1
       150: aload_2
       151: iconst_0
       152: aload_0
       153: invokevirtual #797                // Method ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
       156: goto          421
       159: aload_2
       160: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       163: bipush        57
       165: if_icmpne     219
       168: dconst_1
       169: aload_2
       170: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       173: i2d
       174: dload         6
       176: dmul
       177: invokestatic  #516                // Method java/lang/Math.max:(DD)D
       180: d2i
       181: istore        8
       183: ldc_w         #801                // int 2147483647
       186: aload_1
       187: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       190: invokevirtual #802                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAdena:()I
       193: isub
       194: iload         8
       196: isub
       197: ifge          209
       200: aload_0
       201: aload_2
       202: aload_1
       203: invokevirtual #569                // Method dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
       206: goto          216
       209: aload_1
       210: iload         8
       212: iconst_1
       213: invokevirtual #805                // Method ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
       216: goto          421
       219: aload_1
       220: aload_2
       221: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       224: aload_2
       225: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       228: iconst_1
       229: invokevirtual #565                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       232: pop
       233: goto          421
       236: aload_0
       237: aload_2
       238: aload_1
       239: invokevirtual #569                // Method dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
       242: goto          421
       245: aload_0
       246: invokevirtual #285                // Method isRaidBoss:()Z
       249: ifne          421
       252: aload_0
       253: aload_2
       254: aload_1
       255: invokevirtual #569                // Method dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
       258: goto          421
       261: getstatic     #809                // Field ext/mods/Config.AUTO_LOOT_ITEM_IDS:Ljava/util/List;
       264: aload         4
       266: invokevirtual #813                // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
       269: invokestatic  #368                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       272: invokeinterface #814,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       277: ifne          317
       280: aload_0
       281: invokevirtual #285                // Method isRaidBoss:()Z
       284: ifeq          293
       287: getstatic     #784                // Field ext/mods/Config.AUTO_LOOT_RAID:Z
       290: ifne          306
       293: aload_0
       294: invokevirtual #285                // Method isRaidBoss:()Z
       297: ifne          415
       300: getstatic     #556                // Field ext/mods/Config.AUTO_LOOT:Z
       303: ifeq          415
       306: aload_1
       307: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       310: aload_2
       311: invokevirtual #790                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacityByItemId:(Lext/mods/gameserver/model/holder/IntIntHolder;)Z
       314: ifeq          415
       317: aload_1
       318: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       321: ifeq          338
       324: aload_1
       325: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       328: aload_1
       329: aload_2
       330: iconst_0
       331: aload_0
       332: invokevirtual #797                // Method ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
       335: goto          421
       338: aload_2
       339: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       342: bipush        57
       344: if_icmpne     398
       347: dconst_1
       348: aload_2
       349: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       352: i2d
       353: dload         6
       355: dmul
       356: invokestatic  #516                // Method java/lang/Math.max:(DD)D
       359: d2i
       360: istore        8
       362: ldc_w         #801                // int 2147483647
       365: aload_1
       366: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       369: invokevirtual #802                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAdena:()I
       372: isub
       373: iload         8
       375: isub
       376: ifge          388
       379: aload_0
       380: aload_2
       381: aload_1
       382: invokevirtual #569                // Method dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
       385: goto          395
       388: aload_1
       389: iload         8
       391: iconst_1
       392: invokevirtual #805                // Method ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
       395: goto          421
       398: aload_1
       399: aload_2
       400: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       403: aload_2
       404: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       407: iconst_1
       408: invokevirtual #565                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       411: pop
       412: goto          421
       415: aload_0
       416: aload_2
       417: aload_1
       418: invokevirtual #569                // Method dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
       421: aload_0
       422: invokevirtual #285                // Method isRaidBoss:()Z
       425: ifeq          456
       428: aload_0
       429: getstatic     #817                // Field ext/mods/gameserver/network/SystemMessageId.S1_DIED_DROPPED_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
       432: invokestatic  #820                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       435: aload_0
       436: invokevirtual #826                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       439: aload_2
       440: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       443: invokevirtual #830                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       446: aload_2
       447: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       450: invokevirtual #834                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       453: invokevirtual #837                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       456: return
      LineNumberTable:
        line 676: 0
        line 678: 5
        line 679: 19
        line 681: 20
        line 683: 32
        line 684: 47
        line 686: 64
        line 688: 70
        line 689: 83
        line 690: 100
        line 691: 107
        line 693: 113
        line 695: 127
        line 697: 138
        line 698: 145
        line 699: 159
        line 701: 168
        line 702: 183
        line 703: 200
        line 705: 209
        line 706: 216
        line 708: 219
        line 711: 236
        line 713: 245
        line 714: 252
        line 716: 261
        line 718: 317
        line 719: 324
        line 720: 338
        line 722: 347
        line 723: 362
        line 724: 379
        line 726: 388
        line 727: 395
        line 729: 398
        line 732: 415
        line 734: 421
        line 735: 428
        line 736: 456
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          183      33     8 adenaAmount   I
          362      33     8 adenaAmount   I
            0     457     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0     457     1 player   Lext/mods/gameserver/model/actor/Player;
            0     457     2 holder   Lext/mods/gameserver/model/holder/IntIntHolder;
            5     452     3 itemId   I
           32     425     4  item   Lext/mods/gameserver/model/item/kind/Item;
           47     410     5 rates   Lext/mods/gameserver/model/records/custom/RatesHolder;
           64     393     6 adenaRate   D
      StackMapTable: number_of_entries = 22
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/item/kind/Item, class ext/mods/gameserver/model/records/custom/RatesHolder ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ double ]
        frame_type = 12 /* same */
        frame_type = 45 /* same */
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 2 /* same */
        frame_type = 16 /* same */
        frame_type = 8 /* same */
        frame_type = 15 /* same */
        frame_type = 31 /* same */
        frame_type = 12 /* same */
        frame_type = 10 /* same */
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 2 /* same */
        frame_type = 16 /* same */
        frame_type = 5 /* same */
        frame_type = 34 /* same */

  public void dropItem(ext.mods.gameserver.model.holder.IntIntHolder);
    descriptor: (Lext/mods/gameserver/model/holder/IntIntHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokevirtual #569                // Method dropItem:(Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
         6: return
      LineNumberTable:
        line 767: 0
        line 768: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0       7     1 holder   Lext/mods/gameserver/model/holder/IntIntHolder;

  public void dropItem(ext.mods.gameserver.model.holder.IntIntHolder, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/holder/IntIntHolder;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: iconst_0
         1: istore_3
         2: iload_3
         3: aload_1
         4: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
         7: if_icmpge     99
        10: aload_1
        11: invokevirtual #559                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        14: aload_1
        15: invokevirtual #562                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        18: invokestatic  #847                // Method ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        21: astore        4
        23: aload_2
        24: ifnull        40
        27: aload         4
        29: aload_2
        30: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        33: aload_0
        34: invokevirtual #285                // Method isRaidBoss:()Z
        37: invokevirtual #851                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setDropProtection:(IZ)V
        40: aload_0
        41: invokevirtual #854                // Method getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        44: ifnull        60
        47: aload         4
        49: aload_0
        50: invokevirtual #854                // Method getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        53: iconst_1
        54: invokevirtual #858                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
        57: goto          70
        60: aload         4
        62: aload_0
        63: invokevirtual #854                // Method getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        66: iconst_0
        67: invokevirtual #858                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
        70: aload         4
        72: aload_0
        73: invokevirtual #862                // Method ext/mods/gameserver/model/item/instance/ItemInstance.dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
        76: aload         4
        78: invokevirtual #865                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        81: ifne          99
        84: getstatic     #868                // Field ext/mods/Config.MULTIPLE_ITEM_DROP:Z
        87: ifne          93
        90: goto          99
        93: iinc          3, 1
        96: goto          2
        99: return
      LineNumberTable:
        line 777: 0
        line 779: 10
        line 780: 23
        line 781: 27
        line 783: 40
        line 785: 47
        line 789: 60
        line 792: 70
        line 794: 76
        line 795: 90
        line 777: 93
        line 797: 99
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      70     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            2      97     3     i   I
            0     100     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0     100     1 holder   Lext/mods/gameserver/model/holder/IntIntHolder;
            0     100     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 19 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 5

  public void setDungeon(ext.mods.dungeon.Dungeon);
    descriptor: (Lext/mods/dungeon/Dungeon;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #41                 // Field dungeon:Lext/mods/dungeon/Dungeon;
         5: return
      LineNumberTable:
        line 865: 0
        line 866: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Monster;
            0       6     1 dungeon   Lext/mods/dungeon/Dungeon;

  public ext.mods.gameserver.model.actor.instance.Monster getMonster();
    descriptor: ()Lext/mods/gameserver/model/actor/instance/Monster;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: areturn
      LineNumberTable:
        line 871: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Monster;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc_w         #684                // String drop
         3: invokestatic  #949                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         6: putstatic     #706                // Field DROP_LOG:Ljava/util/logging/Logger;
         9: return
      LineNumberTable:
        line 77: 0
}
SourceFile: "Monster.java"
BootstrapMethods:
  0: #1093 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1087 ()V
      #1088 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Monster.checkCcLastAttack:()V
      #1087 ()V
  1: #1100 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1091 Quantity (\u0001)
InnerClasses:
  public static final #1111= #1107 of #1109; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
