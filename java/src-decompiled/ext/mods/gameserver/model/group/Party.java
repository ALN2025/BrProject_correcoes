// Bytecode for: ext.mods.gameserver.model.group.Party
// File: ext\mods\gameserver\model\group\Party.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/group/Party.class
  Last modified 9 de jul de 2026; size 22939 bytes
  MD5 checksum a06881518ee2a48f930e7a6377096cf6
  Compiled from "Party.java"
public class ext.mods.gameserver.model.group.Party extends ext.mods.gameserver.model.group.AbstractGroup
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/group/Party
  super_class: #2                         // ext/mods/gameserver/model/group/AbstractGroup
  interfaces: 0, fields: 10, methods: 44, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/group/AbstractGroup."<init>":(Lext/mods/gameserver/model/actor/Player;)V
    #2 = Class              #4            // ext/mods/gameserver/model/group/AbstractGroup
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
    #4 = Utf8               ext/mods/gameserver/model/group/AbstractGroup
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
    #7 = Class              #8            // java/util/concurrent/CopyOnWriteArrayList
    #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #9 = Methodref          #7.#10        // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/group/Party._members:Ljava/util/List;
   #13 = Class              #15           // ext/mods/gameserver/model/group/Party
   #14 = NameAndType        #16:#17       // _members:Ljava/util/List;
   #15 = Utf8               ext/mods/gameserver/model/group/Party
   #16 = Utf8               _members
   #17 = Utf8               Ljava/util/List;
   #18 = InterfaceMethodref #19.#20       // java/util/List.add:(Ljava/lang/Object;)Z
   #19 = Class              #21           // java/util/List
   #20 = NameAndType        #22:#23       // add:(Ljava/lang/Object;)Z
   #21 = Utf8               java/util/List
   #22 = Utf8               add
   #23 = Utf8               (Ljava/lang/Object;)Z
   #24 = Methodref          #25.#26       // ext/mods/gameserver/model/actor/Player.setParty:(Lext/mods/gameserver/model/group/Party;)V
   #25 = Class              #27           // ext/mods/gameserver/model/actor/Player
   #26 = NameAndType        #28:#29       // setParty:(Lext/mods/gameserver/model/group/Party;)V
   #27 = Utf8               ext/mods/gameserver/model/actor/Player
   #28 = Utf8               setParty
   #29 = Utf8               (Lext/mods/gameserver/model/group/Party;)V
   #30 = Fieldref           #13.#31       // ext/mods/gameserver/model/group/Party._lootRule:Lext/mods/gameserver/enums/LootRule;
   #31 = NameAndType        #32:#33       // _lootRule:Lext/mods/gameserver/enums/LootRule;
   #32 = Utf8               _lootRule
   #33 = Utf8               Lext/mods/gameserver/enums/LootRule;
   #34 = Methodref          #13.#35       // ext/mods/gameserver/model/group/Party.recalculateLevel:()V
   #35 = NameAndType        #36:#11       // recalculateLevel:()V
   #36 = Utf8               recalculateLevel
   #37 = Class              #38           // ext/mods/gameserver/network/serverpackets/PartySmallWindowAll
   #38 = Utf8               ext/mods/gameserver/network/serverpackets/PartySmallWindowAll
   #39 = Methodref          #37.#40       // ext/mods/gameserver/network/serverpackets/PartySmallWindowAll."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
   #40 = NameAndType        #5:#41        // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
   #41 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
   #42 = Methodref          #25.#43       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #43 = NameAndType        #44:#45       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #44 = Utf8               sendPacket
   #45 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #46 = Class              #47           // ext/mods/gameserver/network/serverpackets/PartySmallWindowAdd
   #47 = Utf8               ext/mods/gameserver/network/serverpackets/PartySmallWindowAdd
   #48 = Methodref          #46.#40       // ext/mods/gameserver/network/serverpackets/PartySmallWindowAdd."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
   #49 = Fieldref           #50.#51       // ext/mods/gameserver/network/SystemMessageId.YOU_JOINED_S1_PARTY:Lext/mods/gameserver/network/SystemMessageId;
   #50 = Class              #52           // ext/mods/gameserver/network/SystemMessageId
   #51 = NameAndType        #53:#54       // YOU_JOINED_S1_PARTY:Lext/mods/gameserver/network/SystemMessageId;
   #52 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #53 = Utf8               YOU_JOINED_S1_PARTY
   #54 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #56 = Class              #58           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #57 = NameAndType        #59:#60       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #58 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #59 = Utf8               getSystemMessage
   #60 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #61 = Methodref          #56.#62       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #62 = NameAndType        #63:#64       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #63 = Utf8               addCharName
   #64 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #65 = Fieldref           #50.#66       // ext/mods/gameserver/network/SystemMessageId.S1_JOINED_PARTY:Lext/mods/gameserver/network/SystemMessageId;
   #66 = NameAndType        #67:#54       // S1_JOINED_PARTY:Lext/mods/gameserver/network/SystemMessageId;
   #67 = Utf8               S1_JOINED_PARTY
   #68 = InterfaceMethodref #19.#69       // java/util/List.iterator:()Ljava/util/Iterator;
   #69 = NameAndType        #70:#71       // iterator:()Ljava/util/Iterator;
   #70 = Utf8               iterator
   #71 = Utf8               ()Ljava/util/Iterator;
   #72 = InterfaceMethodref #73.#74       // java/util/Iterator.hasNext:()Z
   #73 = Class              #75           // java/util/Iterator
   #74 = NameAndType        #76:#77       // hasNext:()Z
   #75 = Utf8               java/util/Iterator
   #76 = Utf8               hasNext
   #77 = Utf8               ()Z
   #78 = InterfaceMethodref #73.#79       // java/util/Iterator.next:()Ljava/lang/Object;
   #79 = NameAndType        #80:#81       // next:()Ljava/lang/Object;
   #80 = Utf8               next
   #81 = Utf8               ()Ljava/lang/Object;
   #82 = Methodref          #25.#83       // ext/mods/gameserver/model/actor/Player.updateEffectIcons:(Z)V
   #83 = NameAndType        #84:#85       // updateEffectIcons:(Z)V
   #84 = Utf8               updateEffectIcons
   #85 = Utf8               (Z)V
   #86 = Methodref          #25.#87       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #87 = NameAndType        #88:#11       // broadcastUserInfo:()V
   #88 = Utf8               broadcastUserInfo
   #89 = Class              #90           // ext/mods/gameserver/network/serverpackets/PartyMemberPosition
   #90 = Utf8               ext/mods/gameserver/network/serverpackets/PartyMemberPosition
   #91 = Methodref          #89.#92       // ext/mods/gameserver/network/serverpackets/PartyMemberPosition."<init>":(Lext/mods/gameserver/model/group/Party;)V
   #92 = NameAndType        #5:#29        // "<init>":(Lext/mods/gameserver/model/group/Party;)V
   #93 = Fieldref           #13.#94       // ext/mods/gameserver/model/group/Party._positionPacket:Lext/mods/gameserver/network/serverpackets/PartyMemberPosition;
   #94 = NameAndType        #95:#96       // _positionPacket:Lext/mods/gameserver/network/serverpackets/PartyMemberPosition;
   #95 = Utf8               _positionPacket
   #96 = Utf8               Lext/mods/gameserver/network/serverpackets/PartyMemberPosition;
   #97 = InvokeDynamic      #0:#98        // #0:run:(Lext/mods/gameserver/model/group/Party;)Ljava/lang/Runnable;
   #98 = NameAndType        #99:#100      // run:(Lext/mods/gameserver/model/group/Party;)Ljava/lang/Runnable;
   #99 = Utf8               run
  #100 = Utf8               (Lext/mods/gameserver/model/group/Party;)Ljava/lang/Runnable;
  #101 = Long               6000l
  #103 = Long               12000l
  #105 = Methodref          #106.#107     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #106 = Class              #108          // ext/mods/commons/pool/ThreadPool
  #107 = NameAndType        #109:#110     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #108 = Utf8               ext/mods/commons/pool/ThreadPool
  #109 = Utf8               scheduleAtFixedRate
  #110 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #111 = Fieldref           #13.#112      // ext/mods/gameserver/model/group/Party._positionBroadcastTask:Ljava/util/concurrent/Future;
  #112 = NameAndType        #113:#114     // _positionBroadcastTask:Ljava/util/concurrent/Future;
  #113 = Utf8               _positionBroadcastTask
  #114 = Utf8               Ljava/util/concurrent/Future;
  #115 = InterfaceMethodref #19.#116      // java/util/List.size:()I
  #116 = NameAndType        #117:#118     // size:()I
  #117 = Utf8               size
  #118 = Utf8               ()I
  #119 = InterfaceMethodref #19.#120      // java/util/List.contains:(Ljava/lang/Object;)Z
  #120 = NameAndType        #121:#23      // contains:(Ljava/lang/Object;)Z
  #121 = Utf8               contains
  #122 = Methodref          #123.#124     // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #123 = Class              #125          // ext/mods/gameserver/data/manager/RelationManager
  #124 = NameAndType        #126:#127     // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #125 = Utf8               ext/mods/gameserver/data/manager/RelationManager
  #126 = Utf8               getInstance
  #127 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
  #128 = Methodref          #123.#129     // ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #129 = NameAndType        #130:#131     // isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #130 = Utf8               isInBlockList
  #131 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #132 = Class              #133          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #133 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #134 = Methodref          #135.#136     // ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
  #135 = Class              #137          // ext/mods/gameserver/network/NpcStringId
  #136 = NameAndType        #138:#139     // getMessage:()Ljava/lang/String;
  #137 = Utf8               ext/mods/gameserver/network/NpcStringId
  #138 = Utf8               getMessage
  #139 = Utf8               ()Ljava/lang/String;
  #140 = Methodref          #132.#141     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
  #141 = NameAndType        #5:#142       // "<init>":(Ljava/lang/String;I)V
  #142 = Utf8               (Ljava/lang/String;I)V
  #143 = Methodref          #13.#144      // ext/mods/gameserver/model/group/Party.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #144 = NameAndType        #145:#45      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #145 = Utf8               broadcastPacket
  #146 = Methodref          #135.#147     // ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
  #147 = NameAndType        #138:#148     // getMessage:([Ljava/lang/Object;)Ljava/lang/String;
  #148 = Utf8               ([Ljava/lang/Object;)Ljava/lang/String;
  #149 = Methodref          #25.#150      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #150 = NameAndType        #151:#152     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #151 = Utf8               getStatus
  #152 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #153 = Methodref          #154.#155     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #154 = Class              #156          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #155 = NameAndType        #157:#118     // getLevel:()I
  #156 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #157 = Utf8               getLevel
  #158 = Methodref          #13.#159      // ext/mods/gameserver/model/group/Party.setLevel:(I)V
  #159 = NameAndType        #160:#161     // setLevel:(I)V
  #160 = Utf8               setLevel
  #161 = Utf8               (I)V
  #162 = Methodref          #163.#164     // ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
  #163 = Class              #165          // ext/mods/gameserver/data/manager/DuelManager
  #164 = NameAndType        #126:#166     // getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
  #165 = Utf8               ext/mods/gameserver/data/manager/DuelManager
  #166 = Utf8               ()Lext/mods/gameserver/data/manager/DuelManager;
  #167 = Methodref          #13.#168      // ext/mods/gameserver/model/group/Party.getLeader:()Lext/mods/gameserver/model/actor/Player;
  #168 = NameAndType        #169:#170     // getLeader:()Lext/mods/gameserver/model/actor/Player;
  #169 = Utf8               getLeader
  #170 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #171 = Methodref          #163.#172     // ext/mods/gameserver/data/manager/DuelManager.onPartyEdit:(Lext/mods/gameserver/model/actor/Player;)V
  #172 = NameAndType        #173:#6       // onPartyEdit:(Lext/mods/gameserver/model/actor/Player;)V
  #173 = Utf8               onPartyEdit
  #174 = Fieldref           #13.#175      // ext/mods/gameserver/model/group/Party._commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
  #175 = NameAndType        #176:#177     // _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
  #176 = Utf8               _commandChannel
  #177 = Utf8               Lext/mods/gameserver/model/group/CommandChannel;
  #178 = Fieldref           #179.#180     // ext/mods/gameserver/network/serverpackets/ExCloseMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
  #179 = Class              #181          // ext/mods/gameserver/network/serverpackets/ExCloseMPCC
  #180 = NameAndType        #182:#183     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
  #181 = Utf8               ext/mods/gameserver/network/serverpackets/ExCloseMPCC
  #182 = Utf8               STATIC_PACKET
  #183 = Utf8               Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
  #184 = Methodref          #185.#186     // ext/mods/gameserver/model/group/CommandChannel.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #185 = Class              #187          // ext/mods/gameserver/model/group/CommandChannel
  #186 = NameAndType        #188:#189     // isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #187 = Utf8               ext/mods/gameserver/model/group/CommandChannel
  #188 = Utf8               isLeader
  #189 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #190 = Methodref          #185.#191     // ext/mods/gameserver/model/group/CommandChannel.disband:()V
  #191 = NameAndType        #192:#11      // disband:()V
  #192 = Utf8               disband
  #193 = Methodref          #185.#194     // ext/mods/gameserver/model/group/CommandChannel.removeParty:(Lext/mods/gameserver/model/group/Party;)Z
  #194 = NameAndType        #195:#196     // removeParty:(Lext/mods/gameserver/model/group/Party;)Z
  #195 = Utf8               removeParty
  #196 = Utf8               (Lext/mods/gameserver/model/group/Party;)Z
  #197 = Fieldref           #198.#199     // ext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll;
  #198 = Class              #200          // ext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll
  #199 = NameAndType        #182:#201     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll;
  #200 = Utf8               ext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll
  #201 = Utf8               Lext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll;
  #202 = Methodref          #25.#203      // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
  #203 = NameAndType        #204:#77      // isFestivalParticipant:()Z
  #204 = Utf8               isFestivalParticipant
  #205 = Methodref          #206.#207     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #206 = Class              #208          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  #207 = NameAndType        #126:#209     // getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #208 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  #209 = Utf8               ()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #210 = Methodref          #206.#211     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
  #211 = NameAndType        #212:#41      // updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
  #212 = Utf8               updateParticipants
  #213 = Methodref          #25.#214      // ext/mods/gameserver/model/actor/Player.getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #214 = NameAndType        #215:#216     // getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #215 = Utf8               getFusionSkill
  #216 = Utf8               ()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #217 = Methodref          #25.#218      // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #218 = NameAndType        #219:#220     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #219 = Utf8               getCast
  #220 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #221 = Methodref          #222.#223     // ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
  #222 = Class              #224          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #223 = NameAndType        #225:#11      // stop:()V
  #224 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #225 = Utf8               stop
  #226 = Class              #227          // ext/mods/gameserver/model/actor/Creature
  #227 = Utf8               ext/mods/gameserver/model/actor/Creature
  #228 = InvokeDynamic      #1:#229       // #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #229 = NameAndType        #230:#231     // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #230 = Utf8               test
  #231 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #232 = InvokeDynamic      #2:#233       // #2:accept:()Ljava/util/function/Consumer;
  #233 = NameAndType        #234:#235     // accept:()Ljava/util/function/Consumer;
  #234 = Utf8               accept
  #235 = Utf8               ()Ljava/util/function/Consumer;
  #236 = Methodref          #25.#237      // ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #237 = NameAndType        #238:#239     // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #238 = Utf8               forEachKnownType
  #239 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #240 = Fieldref           #50.#241      // ext/mods/gameserver/network/SystemMessageId.PARTY_DISPERSED:Lext/mods/gameserver/network/SystemMessageId;
  #241 = NameAndType        #242:#54      // PARTY_DISPERSED:Lext/mods/gameserver/network/SystemMessageId;
  #242 = Utf8               PARTY_DISPERSED
  #243 = Methodref          #25.#244      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #244 = NameAndType        #44:#245      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #245 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #246 = InterfaceMethodref #19.#247      // java/util/List.clear:()V
  #247 = NameAndType        #248:#11      // clear:()V
  #248 = Utf8               clear
  #249 = InterfaceMethodref #250.#251     // java/util/concurrent/Future.cancel:(Z)Z
  #250 = Class              #252          // java/util/concurrent/Future
  #251 = NameAndType        #253:#254     // cancel:(Z)Z
  #252 = Utf8               java/util/concurrent/Future
  #253 = Utf8               cancel
  #254 = Utf8               (Z)Z
  #255 = Fieldref           #13.#256      // ext/mods/gameserver/model/group/Party._pendingInvitation:Z
  #256 = NameAndType        #257:#258     // _pendingInvitation:Z
  #257 = Utf8               _pendingInvitation
  #258 = Utf8               Z
  #259 = Methodref          #260.#261     // java/lang/System.currentTimeMillis:()J
  #260 = Class              #262          // java/lang/System
  #261 = NameAndType        #263:#264     // currentTimeMillis:()J
  #262 = Utf8               java/lang/System
  #263 = Utf8               currentTimeMillis
  #264 = Utf8               ()J
  #265 = Long               15000l
  #267 = Fieldref           #13.#268      // ext/mods/gameserver/model/group/Party._pendingInviteTimeout:J
  #268 = NameAndType        #269:#270     // _pendingInviteTimeout:J
  #269 = Utf8               _pendingInviteTimeout
  #270 = Utf8               J
  #271 = Class              #272          // java/util/ArrayList
  #272 = Utf8               java/util/ArrayList
  #273 = Methodref          #271.#10      // java/util/ArrayList."<init>":()V
  #274 = Methodref          #25.#275      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #275 = NameAndType        #276:#77      // isDead:()Z
  #276 = Utf8               isDead
  #277 = Methodref          #25.#278      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #278 = NameAndType        #279:#280     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #279 = Utf8               getInventory
  #280 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #281 = Methodref          #282.#283     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacityByItemId:(II)Z
  #282 = Class              #284          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #283 = NameAndType        #285:#286     // validateCapacityByItemId:(II)Z
  #284 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #285 = Utf8               validateCapacityByItemId
  #286 = Utf8               (II)Z
  #287 = Fieldref           #288.#289     // ext/mods/Config.PARTY_RANGE:I
  #288 = Class              #290          // ext/mods/Config
  #289 = NameAndType        #291:#292     // PARTY_RANGE:I
  #290 = Utf8               ext/mods/Config
  #291 = Utf8               PARTY_RANGE
  #292 = Utf8               I
  #293 = Methodref          #25.#294      // ext/mods/gameserver/model/actor/Player.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #294 = NameAndType        #295:#296     // isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #295 = Utf8               isInStrictRadius
  #296 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #297 = InterfaceMethodref #19.#298      // java/util/List.isEmpty:()Z
  #298 = NameAndType        #299:#77      // isEmpty:()Z
  #299 = Utf8               isEmpty
  #300 = Methodref          #301.#302     // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #301 = Class              #303          // ext/mods/commons/random/Rnd
  #302 = NameAndType        #304:#305     // get:(Ljava/util/List;)Ljava/lang/Object;
  #303 = Utf8               ext/mods/commons/random/Rnd
  #304 = Utf8               get
  #305 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #306 = Methodref          #13.#307      // ext/mods/gameserver/model/group/Party.getMembersCount:()I
  #307 = NameAndType        #308:#118     // getMembersCount:()I
  #308 = Utf8               getMembersCount
  #309 = Fieldref           #13.#310      // ext/mods/gameserver/model/group/Party._itemLastLoot:I
  #310 = NameAndType        #311:#292     // _itemLastLoot:I
  #311 = Utf8               _itemLastLoot
  #312 = InterfaceMethodref #19.#313      // java/util/List.get:(I)Ljava/lang/Object;
  #313 = NameAndType        #304:#314     // get:(I)Ljava/lang/Object;
  #314 = Utf8               (I)Ljava/lang/Object;
  #315 = Fieldref           #316.#317     // ext/mods/gameserver/model/group/Party$1.$SwitchMap$ext$mods$gameserver$enums$LootRule:[I
  #316 = Class              #318          // ext/mods/gameserver/model/group/Party$1
  #317 = NameAndType        #319:#320     // $SwitchMap$ext$mods$gameserver$enums$LootRule:[I
  #318 = Utf8               ext/mods/gameserver/model/group/Party$1
  #319 = Utf8               $SwitchMap$ext$mods$gameserver$enums$LootRule
  #320 = Utf8               [I
  #321 = Methodref          #322.#323     // ext/mods/gameserver/enums/LootRule.ordinal:()I
  #322 = Class              #324          // ext/mods/gameserver/enums/LootRule
  #323 = NameAndType        #325:#118     // ordinal:()I
  #324 = Utf8               ext/mods/gameserver/enums/LootRule
  #325 = Utf8               ordinal
  #326 = Methodref          #13.#327      // ext/mods/gameserver/model/group/Party.getRandomValidLooter:(ILext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
  #327 = NameAndType        #328:#329     // getRandomValidLooter:(ILext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
  #328 = Utf8               getRandomValidLooter
  #329 = Utf8               (ILext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
  #330 = Methodref          #13.#331      // ext/mods/gameserver/model/group/Party.getNextValidLooter:(ILext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
  #331 = NameAndType        #332:#329     // getNextValidLooter:(ILext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
  #332 = Utf8               getNextValidLooter
  #333 = Fieldref           #50.#334      // ext/mods/gameserver/network/SystemMessageId.S1_HAS_BECOME_A_PARTY_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #334 = NameAndType        #335:#54      // S1_HAS_BECOME_A_PARTY_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #335 = Utf8               S1_HAS_BECOME_A_PARTY_LEADER
  #336 = InterfaceMethodref #19.#337      // java/util/List.stream:()Ljava/util/stream/Stream;
  #337 = NameAndType        #338:#339     // stream:()Ljava/util/stream/Stream;
  #338 = Utf8               stream
  #339 = Utf8               ()Ljava/util/stream/Stream;
  #340 = InvokeDynamic      #3:#229       // #3:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #341 = InterfaceMethodref #342.#343     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #342 = Class              #344          // java/util/stream/Stream
  #343 = NameAndType        #345:#346     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #344 = Utf8               java/util/stream/Stream
  #345 = Utf8               filter
  #346 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #347 = InvokeDynamic      #4:#348       // #4:accept:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
  #348 = NameAndType        #234:#349     // accept:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
  #349 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
  #350 = InterfaceMethodref #342.#351     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #351 = NameAndType        #352:#353     // forEach:(Ljava/util/function/Consumer;)V
  #352 = Utf8               forEach
  #353 = Utf8               (Ljava/util/function/Consumer;)V
  #354 = Methodref          #13.#155      // ext/mods/gameserver/model/group/Party.getLevel:()I
  #355 = Fieldref           #356.#357     // ext/mods/gameserver/network/serverpackets/ExOpenMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
  #356 = Class              #358          // ext/mods/gameserver/network/serverpackets/ExOpenMPCC
  #357 = NameAndType        #182:#359     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
  #358 = Utf8               ext/mods/gameserver/network/serverpackets/ExOpenMPCC
  #359 = Utf8               Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
  #360 = Methodref          #13.#361      // ext/mods/gameserver/model/group/Party.getPlayerByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #361 = NameAndType        #362:#363     // getPlayerByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #362 = Utf8               getPlayerByName
  #363 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #364 = Methodref          #13.#365      // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #365 = NameAndType        #366:#367     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #366 = Utf8               removePartyMember
  #367 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #368 = Methodref          #13.#186      // ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #369 = Fieldref           #370.#371     // ext/mods/gameserver/enums/MessageType.DISCONNECTED:Lext/mods/gameserver/enums/MessageType;
  #370 = Class              #372          // ext/mods/gameserver/enums/MessageType
  #371 = NameAndType        #373:#374     // DISCONNECTED:Lext/mods/gameserver/enums/MessageType;
  #372 = Utf8               ext/mods/gameserver/enums/MessageType
  #373 = Utf8               DISCONNECTED
  #374 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #375 = Methodref          #13.#191      // ext/mods/gameserver/model/group/Party.disband:()V
  #376 = Methodref          #13.#377      // ext/mods/gameserver/model/group/Party.changePartyLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #377 = NameAndType        #378:#6       // changePartyLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #378 = Utf8               changePartyLeader
  #379 = InterfaceMethodref #19.#380      // java/util/List.remove:(Ljava/lang/Object;)Z
  #380 = NameAndType        #381:#23      // remove:(Ljava/lang/Object;)Z
  #381 = Utf8               remove
  #382 = InvokeDynamic      #5:#229       // #5:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #383 = InvokeDynamic      #6:#233       // #6:accept:()Ljava/util/function/Consumer;
  #384 = Fieldref           #370.#385     // ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #385 = NameAndType        #386:#374     // EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #386 = Utf8               EXPELLED
  #387 = Fieldref           #50.#388      // ext/mods/gameserver/network/SystemMessageId.HAVE_BEEN_EXPELLED_FROM_PARTY:Lext/mods/gameserver/network/SystemMessageId;
  #388 = NameAndType        #389:#54      // HAVE_BEEN_EXPELLED_FROM_PARTY:Lext/mods/gameserver/network/SystemMessageId;
  #389 = Utf8               HAVE_BEEN_EXPELLED_FROM_PARTY
  #390 = Fieldref           #50.#391      // ext/mods/gameserver/network/SystemMessageId.S1_WAS_EXPELLED_FROM_PARTY:Lext/mods/gameserver/network/SystemMessageId;
  #391 = NameAndType        #392:#54      // S1_WAS_EXPELLED_FROM_PARTY:Lext/mods/gameserver/network/SystemMessageId;
  #392 = Utf8               S1_WAS_EXPELLED_FROM_PARTY
  #393 = Fieldref           #370.#394     // ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
  #394 = NameAndType        #395:#374     // LEFT:Lext/mods/gameserver/enums/MessageType;
  #395 = Utf8               LEFT
  #396 = Fieldref           #50.#397      // ext/mods/gameserver/network/SystemMessageId.YOU_LEFT_PARTY:Lext/mods/gameserver/network/SystemMessageId;
  #397 = NameAndType        #398:#54      // YOU_LEFT_PARTY:Lext/mods/gameserver/network/SystemMessageId;
  #398 = Utf8               YOU_LEFT_PARTY
  #399 = Fieldref           #50.#400      // ext/mods/gameserver/network/SystemMessageId.S1_LEFT_PARTY:Lext/mods/gameserver/network/SystemMessageId;
  #400 = NameAndType        #401:#54      // S1_LEFT_PARTY:Lext/mods/gameserver/network/SystemMessageId;
  #401 = Utf8               S1_LEFT_PARTY
  #402 = Class              #403          // ext/mods/gameserver/network/serverpackets/PartySmallWindowDelete
  #403 = Utf8               ext/mods/gameserver/network/serverpackets/PartySmallWindowDelete
  #404 = Methodref          #402.#3       // ext/mods/gameserver/network/serverpackets/PartySmallWindowDelete."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #405 = Methodref          #25.#406      // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
  #406 = NameAndType        #407:#77      // isInDuel:()Z
  #407 = Utf8               isInDuel
  #408 = Fieldref           #50.#409      // ext/mods/gameserver/network/SystemMessageId.YOU_CAN_TRANSFER_RIGHTS_ONLY_TO_ANOTHER_PARTY_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
  #409 = NameAndType        #410:#54      // YOU_CAN_TRANSFER_RIGHTS_ONLY_TO_ANOTHER_PARTY_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
  #410 = Utf8               YOU_CAN_TRANSFER_RIGHTS_ONLY_TO_ANOTHER_PARTY_MEMBER
  #411 = Fieldref           #50.#412      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_TRANSFER_RIGHTS_TO_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
  #412 = NameAndType        #413:#54      // YOU_CANNOT_TRANSFER_RIGHTS_TO_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
  #413 = Utf8               YOU_CANNOT_TRANSFER_RIGHTS_TO_YOURSELF
  #414 = Methodref          #185.#415     // ext/mods/gameserver/model/group/CommandChannel.setLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #415 = NameAndType        #416:#6       // setLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #416 = Utf8               setLeader
  #417 = Fieldref           #50.#418      // ext/mods/gameserver/network/SystemMessageId.COMMAND_CHANNEL_LEADER_NOW_S1:Lext/mods/gameserver/network/SystemMessageId;
  #418 = NameAndType        #419:#54      // COMMAND_CHANNEL_LEADER_NOW_S1:Lext/mods/gameserver/network/SystemMessageId;
  #419 = Utf8               COMMAND_CHANNEL_LEADER_NOW_S1
  #420 = Methodref          #185.#144     // ext/mods/gameserver/model/group/CommandChannel.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #421 = Methodref          #13.#415      // ext/mods/gameserver/model/group/Party.setLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #422 = Methodref          #13.#423      // ext/mods/gameserver/model/group/Party.broadcastNewLeaderStatus:()V
  #423 = NameAndType        #424:#11      // broadcastNewLeaderStatus:()V
  #424 = Utf8               broadcastNewLeaderStatus
  #425 = Methodref          #25.#426      // ext/mods/gameserver/model/actor/Player.isInPartyMatchRoom:()Z
  #426 = NameAndType        #427:#77      // isInPartyMatchRoom:()Z
  #427 = Utf8               isInPartyMatchRoom
  #428 = Methodref          #429.#430     // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #429 = Class              #431          // ext/mods/gameserver/data/manager/PartyMatchRoomManager
  #430 = NameAndType        #126:#432     // getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #431 = Utf8               ext/mods/gameserver/data/manager/PartyMatchRoomManager
  #432 = Utf8               ()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #433 = Methodref          #25.#434      // ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
  #434 = NameAndType        #435:#118     // getPartyRoom:()I
  #435 = Utf8               getPartyRoom
  #436 = Methodref          #429.#437     // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
  #437 = NameAndType        #438:#439     // getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
  #438 = Utf8               getRoom
  #439 = Utf8               (I)Lext/mods/gameserver/model/group/PartyMatchRoom;
  #440 = Methodref          #441.#442     // ext/mods/gameserver/model/group/PartyMatchRoom.changeLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #441 = Class              #443          // ext/mods/gameserver/model/group/PartyMatchRoom
  #442 = NameAndType        #444:#6       // changeLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #443 = Utf8               ext/mods/gameserver/model/group/PartyMatchRoom
  #444 = Utf8               changeLeader
  #445 = Methodref          #25.#446      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #446 = NameAndType        #447:#139     // getName:()Ljava/lang/String;
  #447 = Utf8               getName
  #448 = Methodref          #449.#450     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #449 = Class              #451          // java/lang/String
  #450 = NameAndType        #452:#453     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #451 = Utf8               java/lang/String
  #452 = Utf8               equalsIgnoreCase
  #453 = Utf8               (Ljava/lang/String;)Z
  #454 = Methodref          #455.#456     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #455 = Class              #457          // ext/mods/gameserver/model/item/instance/ItemInstance
  #456 = NameAndType        #458:#118     // getItemId:()I
  #457 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #458 = Utf8               getItemId
  #459 = Methodref          #455.#460     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #460 = NameAndType        #461:#118     // getCount:()I
  #461 = Utf8               getCount
  #462 = Methodref          #13.#463      // ext/mods/gameserver/model/group/Party.distributeAdena:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Creature;)V
  #463 = NameAndType        #464:#465     // distributeAdena:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Creature;)V
  #464 = Utf8               distributeAdena
  #465 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Creature;)V
  #466 = Methodref          #455.#467     // ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
  #467 = NameAndType        #468:#11      // destroyMe:()V
  #468 = Utf8               destroyMe
  #469 = Methodref          #13.#470      // ext/mods/gameserver/model/group/Party.getValidLooter:(Lext/mods/gameserver/model/actor/Player;IZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
  #470 = NameAndType        #471:#472     // getValidLooter:(Lext/mods/gameserver/model/actor/Player;IZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
  #471 = Utf8               getValidLooter
  #472 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
  #473 = Class              #474          // ext/mods/gameserver/model/actor/instance/Pet
  #474 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #475 = Methodref          #476.#477     // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #476 = Class              #478          // ext/mods/gameserver/model/actor/Summon
  #477 = NameAndType        #479:#170     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #478 = Utf8               ext/mods/gameserver/model/actor/Summon
  #479 = Utf8               getOwner
  #480 = Methodref          #476.#481     // ext/mods/gameserver/model/actor/Summon.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #481 = NameAndType        #482:#483     // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #482 = Utf8               addItem
  #483 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #484 = Fieldref           #50.#485      // ext/mods/gameserver/network/SystemMessageId.S1_OBTAINED_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
  #485 = NameAndType        #486:#54      // S1_OBTAINED_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
  #486 = Utf8               S1_OBTAINED_S3_S2
  #487 = Methodref          #56.#488      // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #488 = NameAndType        #489:#490     // addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #489 = Utf8               addItemName
  #490 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #491 = Methodref          #56.#492      // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #492 = NameAndType        #493:#494     // addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #493 = Utf8               addItemNumber
  #494 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #495 = Methodref          #13.#496      // ext/mods/gameserver/model/group/Party.broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #496 = NameAndType        #497:#498     // broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #497 = Utf8               broadcastToPartyMembers
  #498 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #499 = Methodref          #455.#500     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #500 = NameAndType        #501:#118     // getEnchantLevel:()I
  #501 = Utf8               getEnchantLevel
  #502 = Fieldref           #50.#503      // ext/mods/gameserver/network/SystemMessageId.S1_OBTAINED_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
  #503 = NameAndType        #504:#54      // S1_OBTAINED_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
  #504 = Utf8               S1_OBTAINED_S2_S3
  #505 = Methodref          #56.#506      // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #506 = NameAndType        #507:#494     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #507 = Utf8               addNumber
  #508 = Fieldref           #50.#509      // ext/mods/gameserver/network/SystemMessageId.S1_OBTAINED_S2:Lext/mods/gameserver/network/SystemMessageId;
  #509 = NameAndType        #510:#54      // S1_OBTAINED_S2:Lext/mods/gameserver/network/SystemMessageId;
  #510 = Utf8               S1_OBTAINED_S2
  #511 = Methodref          #25.#481      // ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #512 = Methodref          #513.#514     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #513 = Class              #515          // ext/mods/gameserver/model/holder/IntIntHolder
  #514 = NameAndType        #516:#118     // getId:()I
  #515 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #516 = Utf8               getId
  #517 = Methodref          #513.#518     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #518 = NameAndType        #519:#118     // getValue:()I
  #519 = Utf8               getValue
  #520 = Methodref          #25.#521      // ext/mods/gameserver/model/actor/Player.addEarnedItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #521 = NameAndType        #522:#523     // addEarnedItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #522 = Utf8               addEarnedItem
  #523 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #524 = Methodref          #25.#525      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #525 = NameAndType        #482:#523     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #526 = Fieldref           #50.#527      // ext/mods/gameserver/network/SystemMessageId.S1_SWEEPED_UP_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
  #527 = NameAndType        #528:#54      // S1_SWEEPED_UP_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
  #528 = Utf8               S1_SWEEPED_UP_S3_S2
  #529 = Methodref          #56.#530      // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #530 = NameAndType        #489:#494     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #531 = Fieldref           #50.#532      // ext/mods/gameserver/network/SystemMessageId.S1_SWEEPED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
  #532 = NameAndType        #533:#54      // S1_SWEEPED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
  #533 = Utf8               S1_SWEEPED_UP_S2
  #534 = Methodref          #271.#535     // java/util/ArrayList."<init>":(I)V
  #535 = NameAndType        #5:#161       // "<init>":(I)V
  #536 = Methodref          #25.#537      // ext/mods/gameserver/model/actor/Player.getAdena:()I
  #537 = NameAndType        #538:#118     // getAdena:()I
  #538 = Utf8               getAdena
  #539 = Class              #540          // java/lang/Integer
  #540 = Utf8               java/lang/Integer
  #541 = Integer            2147483647
  #542 = Methodref          #25.#543      // ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
  #543 = NameAndType        #544:#545     // addAdena:(IZ)V
  #544 = Utf8               addAdena
  #545 = Utf8               (IZ)V
  #546 = Fieldref           #288.#547     // ext/mods/Config.PARTY_XP_CUTOFF_METHOD:Ljava/lang/String;
  #547 = NameAndType        #548:#549     // PARTY_XP_CUTOFF_METHOD:Ljava/lang/String;
  #548 = Utf8               PARTY_XP_CUTOFF_METHOD
  #549 = Utf8               Ljava/lang/String;
  #550 = String             #551          // level
  #551 = Utf8               level
  #552 = Fieldref           #288.#553     // ext/mods/Config.PARTY_XP_CUTOFF_LEVEL:I
  #553 = NameAndType        #554:#292     // PARTY_XP_CUTOFF_LEVEL:I
  #554 = Utf8               PARTY_XP_CUTOFF_LEVEL
  #555 = String             #556          // percentage
  #556 = Utf8               percentage
  #557 = Fieldref           #288.#558     // ext/mods/Config.PARTY_XP_CUTOFF_PERCENT:D
  #558 = NameAndType        #559:#560     // PARTY_XP_CUTOFF_PERCENT:D
  #559 = Utf8               PARTY_XP_CUTOFF_PERCENT
  #560 = Utf8               D
  #561 = String             #562          // auto
  #562 = Utf8               auto
  #563 = Methodref          #564.#565     // java/lang/Math.clamp:(JII)I
  #564 = Class              #566          // java/lang/Math
  #565 = NameAndType        #567:#568     // clamp:(JII)I
  #566 = Utf8               java/lang/Math
  #567 = Utf8               clamp
  #568 = Utf8               (JII)I
  #569 = Fieldref           #13.#570      // ext/mods/gameserver/model/group/Party.BONUS_EXP_SP:[D
  #570 = NameAndType        #571:#572     // BONUS_EXP_SP:[D
  #571 = Utf8               BONUS_EXP_SP
  #572 = Utf8               [D
  #573 = String             #574          // none
  #574 = Utf8               none
  #575 = InterfaceMethodref #19.#576      // java/util/List.addAll:(Ljava/util/Collection;)Z
  #576 = NameAndType        #577:#578     // addAll:(Ljava/util/Collection;)Z
  #577 = Utf8               addAll
  #578 = Utf8               (Ljava/util/Collection;)Z
  #579 = Methodref          #564.#580     // java/lang/Math.min:(II)I
  #580 = NameAndType        #581:#582     // min:(II)I
  #581 = Utf8               min
  #582 = Utf8               (II)I
  #583 = Fieldref           #288.#584     // ext/mods/Config.RATE_PARTY_XP:D
  #584 = NameAndType        #585:#560     // RATE_PARTY_XP:D
  #585 = Utf8               RATE_PARTY_XP
  #586 = Fieldref           #288.#587     // ext/mods/Config.RATE_PARTY_SP:D
  #587 = NameAndType        #588:#560     // RATE_PARTY_SP:D
  #588 = Utf8               RATE_PARTY_SP
  #589 = Fieldref           #288.#590     // ext/mods/Config.DYNAMIC_XP:Z
  #590 = NameAndType        #591:#258     // DYNAMIC_XP:Z
  #591 = Utf8               DYNAMIC_XP
  #592 = Methodref          #25.#593      // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
  #593 = NameAndType        #594:#118     // getPremiumService:()I
  #594 = Utf8               getPremiumService
  #595 = Methodref          #25.#596      // ext/mods/gameserver/model/actor/Player.hasServitor:()Z
  #596 = NameAndType        #597:#77      // hasServitor:()Z
  #597 = Utf8               hasServitor
  #598 = Methodref          #25.#599      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #599 = NameAndType        #600:#601     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #600 = Utf8               getSummon
  #601 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #602 = Class              #603          // ext/mods/gameserver/model/actor/instance/Servitor
  #603 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
  #604 = Methodref          #602.#605     // ext/mods/gameserver/model/actor/instance/Servitor.getExpPenalty:()F
  #605 = NameAndType        #606:#607     // getExpPenalty:()F
  #606 = Utf8               getExpPenalty
  #607 = Utf8               ()F
  #608 = Methodref          #564.#609     // java/lang/Math.round:(D)J
  #609 = NameAndType        #610:#611     // round:(D)J
  #610 = Utf8               round
  #611 = Utf8               (D)J
  #612 = Methodref          #25.#613      // ext/mods/gameserver/model/actor/Player.updateKarmaLoss:(J)V
  #613 = NameAndType        #614:#615     // updateKarmaLoss:(J)V
  #614 = Utf8               updateKarmaLoss
  #615 = Utf8               (J)V
  #616 = Methodref          #25.#617      // ext/mods/gameserver/model/actor/Player.addExpAndSp:(JILjava/util/Map;)V
  #617 = NameAndType        #618:#619     // addExpAndSp:(JILjava/util/Map;)V
  #618 = Utf8               addExpAndSp
  #619 = Utf8               (JILjava/util/Map;)V
  #620 = Methodref          #25.#621      // ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
  #621 = NameAndType        #618:#622     // addExpAndSp:(JI)V
  #622 = Utf8               (JI)V
  #623 = InvokeDynamic      #7:#624       // #7:test:()Ljava/util/function/Predicate;
  #624 = NameAndType        #230:#625     // test:()Ljava/util/function/Predicate;
  #625 = Utf8               ()Ljava/util/function/Predicate;
  #626 = InterfaceMethodref #342.#627     // java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
  #627 = NameAndType        #628:#629     // allMatch:(Ljava/util/function/Predicate;)Z
  #628 = Utf8               allMatch
  #629 = Utf8               (Ljava/util/function/Predicate;)Z
  #630 = Methodref          #13.#631      // ext/mods/gameserver/model/group/Party.getLeaderObjectId:()I
  #631 = NameAndType        #632:#118     // getLeaderObjectId:()I
  #632 = Utf8               getLeaderObjectId
  #633 = InvokeDynamic      #8:#233       // #8:accept:()Ljava/util/function/Consumer;
  #634 = InterfaceMethodref #19.#351      // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #635 = InvokeDynamic      #9:#233       // #9:accept:()Ljava/util/function/Consumer;
  #636 = Methodref          #226.#637     // ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #637 = NameAndType        #219:#638     // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #638 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #639 = Methodref          #640.#223     // ext/mods/gameserver/model/actor/cast/CreatureCast.stop:()V
  #640 = Class              #641          // ext/mods/gameserver/model/actor/cast/CreatureCast
  #641 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #642 = Methodref          #226.#214     // ext/mods/gameserver/model/actor/Creature.getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #643 = Methodref          #644.#645     // ext/mods/gameserver/model/actor/container/creature/FusionSkill.getTarget:()Lext/mods/gameserver/model/actor/Creature;
  #644 = Class              #646          // ext/mods/gameserver/model/actor/container/creature/FusionSkill
  #645 = NameAndType        #647:#648     // getTarget:()Lext/mods/gameserver/model/actor/Creature;
  #646 = Utf8               ext/mods/gameserver/model/actor/container/creature/FusionSkill
  #647 = Utf8               getTarget
  #648 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #649 = Methodref          #89.#650      // ext/mods/gameserver/network/serverpackets/PartyMemberPosition.reuse:(Lext/mods/gameserver/model/group/Party;)V
  #650 = NameAndType        #651:#29      // reuse:(Lext/mods/gameserver/model/group/Party;)V
  #651 = Utf8               reuse
  #652 = Double             1.3d
  #654 = Double             1.39d
  #656 = Double             1.5d
  #658 = Double             1.54d
  #660 = Double             1.58d
  #662 = Double             1.63d
  #664 = Double             1.67d
  #666 = Double             1.71d
  #668 = Utf8               PARTY_POSITION_BROADCAST
  #669 = Utf8               ConstantValue
  #670 = Integer            12000
  #671 = Utf8               Signature
  #672 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #673 = Utf8               Ljava/util/concurrent/Future<*>;
  #674 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/LootRule;)V
  #675 = Utf8               Code
  #676 = Utf8               LineNumberTable
  #677 = Utf8               LocalVariableTable
  #678 = Utf8               member
  #679 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #680 = Utf8               this
  #681 = Utf8               Lext/mods/gameserver/model/group/Party;
  #682 = Utf8               leader
  #683 = Utf8               target
  #684 = Utf8               lootRule
  #685 = Utf8               StackMapTable
  #686 = Utf8               getMembers
  #687 = Utf8               ()Ljava/util/List;
  #688 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #689 = Utf8               containsPlayer
  #690 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #691 = Utf8               player
  #692 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #693 = Utf8               packet
  #694 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #695 = Utf8               broadcastCreatureSay
  #696 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
  #697 = Utf8               msg
  #698 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #699 = Utf8               broadcaster
  #700 = Utf8               broadcastOnScreen
  #701 = Utf8               (ILext/mods/gameserver/network/NpcStringId;)V
  #702 = Utf8               time
  #703 = Utf8               npcStringId
  #704 = Utf8               Lext/mods/gameserver/network/NpcStringId;
  #705 = Utf8               (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
  #706 = Utf8               params
  #707 = Utf8               [Ljava/lang/Object;
  #708 = Utf8               newLevel
  #709 = Utf8               getPendingInvitation
  #710 = Utf8               setPendingInvitation
  #711 = Utf8               val
  #712 = Utf8               isInvitationRequestExpired
  #713 = Utf8               itemId
  #714 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #715 = Utf8               validMembers
  #716 = Utf8               LocalVariableTypeTable
  #717 = Utf8               i
  #718 = Utf8               isSpoil
  #719 = Utf8               looter
  #720 = Utf8               sm
  #721 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #722 = Utf8               gsp
  #723 = Utf8               addPartyMember
  #724 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/enums/MessageType;)V
  #725 = Utf8               name
  #726 = Utf8               type
  #727 = Utf8               (Ljava/lang/String;)V
  #728 = Utf8               room
  #729 = Utf8               Lext/mods/gameserver/model/group/PartyMatchRoom;
  #730 = Utf8               distributeItem
  #731 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
  #732 = Utf8               item
  #733 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #734 = Utf8               summon
  #735 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #736 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
  #737 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #738 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #739 = Utf8               adena
  #740 = Utf8               toReward
  #741 = Utf8               count
  #742 = Utf8               distributeXpAndSp
  #743 = Utf8               (JJIJILjava/util/List;ILjava/util/Map;)V
  #744 = Utf8               sqLevel
  #745 = Utf8               sqLevelSum
  #746 = Utf8               partySize
  #747 = Utf8               penalty
  #748 = Utf8               F
  #749 = Utf8               preCalculation
  #750 = Utf8               xp
  #751 = Utf8               sp
  #752 = Utf8               xp_dynam
  #753 = Utf8               xpReward_pr
  #754 = Utf8               spReward_pr
  #755 = Utf8               xpReward
  #756 = Utf8               spReward
  #757 = Utf8               rewardedMembers
  #758 = Utf8               topLvl
  #759 = Utf8               rewards
  #760 = Utf8               Ljava/util/Map;
  #761 = Utf8               partyRate
  #762 = Utf8               xpRew
  #763 = Utf8               spRew
  #764 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;
  #765 = Class              #766          // java/util/Map
  #766 = Utf8               java/util/Map
  #767 = Utf8               (JJIJILjava/util/List<Lext/mods/gameserver/model/actor/Player;>;ILjava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;)V
  #768 = Utf8               getLootRule
  #769 = Utf8               ()Lext/mods/gameserver/enums/LootRule;
  #770 = Utf8               isInCommandChannel
  #771 = Utf8               getCommandChannel
  #772 = Utf8               ()Lext/mods/gameserver/model/group/CommandChannel;
  #773 = Utf8               setCommandChannel
  #774 = Utf8               (Lext/mods/gameserver/model/group/CommandChannel;)V
  #775 = Utf8               channel
  #776 = Utf8               wipedOut
  #777 = Utf8               equals
  #778 = Utf8               party
  #779 = Utf8               resetDuelState
  #780 = Utf8               stopToFight
  #781 = Utf8               lambda$removePartyMember$1
  #782 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #783 = Utf8               creature
  #784 = Utf8               lambda$removePartyMember$0
  #785 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #786 = Utf8               lambda$broadcastToPartyMembers$1
  #787 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #788 = Utf8               m
  #789 = Utf8               lambda$broadcastToPartyMembers$0
  #790 = Utf8               lambda$disband$1
  #791 = Utf8               lambda$disband$0
  #792 = Utf8               lambda$new$0
  #793 = Utf8               <clinit>
  #794 = Utf8               SourceFile
  #795 = Utf8               Party.java
  #796 = Utf8               NestMembers
  #797 = Utf8               BootstrapMethods
  #798 = MethodType         #11           //  ()V
  #799 = MethodHandle       5:#800        // REF_invokeVirtual ext/mods/gameserver/model/group/Party.lambda$new$0:()V
  #800 = Methodref          #13.#801      // ext/mods/gameserver/model/group/Party.lambda$new$0:()V
  #801 = NameAndType        #792:#11      // lambda$new$0:()V
  #802 = MethodType         #23           //  (Ljava/lang/Object;)Z
  #803 = MethodHandle       6:#804        // REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$disband$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #804 = Methodref          #13.#805      // ext/mods/gameserver/model/group/Party.lambda$disband$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #805 = NameAndType        #791:#785     // lambda$disband$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #806 = MethodType         #807          //  (Lext/mods/gameserver/model/actor/Creature;)Z
  #807 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #808 = MethodType         #809          //  (Ljava/lang/Object;)V
  #809 = Utf8               (Ljava/lang/Object;)V
  #810 = MethodHandle       6:#811        // REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$disband$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #811 = Methodref          #13.#812      // ext/mods/gameserver/model/group/Party.lambda$disband$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #812 = NameAndType        #790:#782     // lambda$disband$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #813 = MethodType         #782          //  (Lext/mods/gameserver/model/actor/Creature;)V
  #814 = MethodHandle       6:#815        // REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$broadcastToPartyMembers$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #815 = Methodref          #13.#816      // ext/mods/gameserver/model/group/Party.lambda$broadcastToPartyMembers$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #816 = NameAndType        #789:#131     // lambda$broadcastToPartyMembers$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #817 = MethodType         #189          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #818 = MethodHandle       6:#819        // REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$broadcastToPartyMembers$1:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #819 = Methodref          #13.#820      // ext/mods/gameserver/model/group/Party.lambda$broadcastToPartyMembers$1:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #820 = NameAndType        #786:#787     // lambda$broadcastToPartyMembers$1:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #821 = MethodType         #6            //  (Lext/mods/gameserver/model/actor/Player;)V
  #822 = MethodHandle       6:#823        // REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$removePartyMember$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #823 = Methodref          #13.#824      // ext/mods/gameserver/model/group/Party.lambda$removePartyMember$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #824 = NameAndType        #784:#785     // lambda$removePartyMember$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #825 = MethodHandle       6:#826        // REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$removePartyMember$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #826 = Methodref          #13.#827      // ext/mods/gameserver/model/group/Party.lambda$removePartyMember$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #827 = NameAndType        #781:#782     // lambda$removePartyMember$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #828 = MethodHandle       5:#829        // REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #829 = Methodref          #226.#275     // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #830 = MethodHandle       5:#831        // REF_invokeVirtual ext/mods/gameserver/model/actor/Player.resetDuelState:()V
  #831 = Methodref          #25.#832      // ext/mods/gameserver/model/actor/Player.resetDuelState:()V
  #832 = NameAndType        #779:#11      // resetDuelState:()V
  #833 = MethodHandle       5:#834        // REF_invokeVirtual ext/mods/gameserver/model/actor/Player.stopToFight:()V
  #834 = Methodref          #25.#835      // ext/mods/gameserver/model/actor/Player.stopToFight:()V
  #835 = NameAndType        #780:#11      // stopToFight:()V
  #836 = MethodHandle       6:#837        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #837 = Methodref          #838.#839     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #838 = Class              #840          // java/lang/invoke/LambdaMetafactory
  #839 = NameAndType        #841:#842     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #840 = Utf8               java/lang/invoke/LambdaMetafactory
  #841 = Utf8               metafactory
  #842 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #843 = Utf8               InnerClasses
  #844 = Class              #845          // java/lang/invoke/MethodHandles$Lookup
  #845 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #846 = Class              #847          // java/lang/invoke/MethodHandles
  #847 = Utf8               java/lang/invoke/MethodHandles
  #848 = Utf8               Lookup
{
  protected ext.mods.gameserver.network.serverpackets.PartyMemberPosition _positionPacket;
    descriptor: Lext/mods/gameserver/network/serverpackets/PartyMemberPosition;
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.group.Party(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.enums.LootRule);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/LootRule;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=4
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/group/AbstractGroup."<init>":(Lext/mods/gameserver/model/actor/Player;)V
         5: aload_0
         6: new           #7                  // class java/util/concurrent/CopyOnWriteArrayList
         9: dup
        10: invokespecial #9                  // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        13: putfield      #12                 // Field _members:Ljava/util/List;
        16: aload_0
        17: getfield      #12                 // Field _members:Ljava/util/List;
        20: aload_1
        21: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        26: pop
        27: aload_0
        28: getfield      #12                 // Field _members:Ljava/util/List;
        31: aload_2
        32: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        37: pop
        38: aload_1
        39: aload_0
        40: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.setParty:(Lext/mods/gameserver/model/group/Party;)V
        43: aload_2
        44: aload_0
        45: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.setParty:(Lext/mods/gameserver/model/group/Party;)V
        48: aload_0
        49: aload_3
        50: putfield      #30                 // Field _lootRule:Lext/mods/gameserver/enums/LootRule;
        53: aload_0
        54: invokevirtual #34                 // Method recalculateLevel:()V
        57: aload_2
        58: new           #37                 // class ext/mods/gameserver/network/serverpackets/PartySmallWindowAll
        61: dup
        62: aload_2
        63: aload_0
        64: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/PartySmallWindowAll."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
        67: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        70: aload_1
        71: new           #46                 // class ext/mods/gameserver/network/serverpackets/PartySmallWindowAdd
        74: dup
        75: aload_2
        76: aload_0
        77: invokespecial #48                 // Method ext/mods/gameserver/network/serverpackets/PartySmallWindowAdd."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
        80: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        83: aload_2
        84: getstatic     #49                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_JOINED_S1_PARTY:Lext/mods/gameserver/network/SystemMessageId;
        87: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        90: aload_1
        91: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        94: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        97: aload_1
        98: getstatic     #65                 // Field ext/mods/gameserver/network/SystemMessageId.S1_JOINED_PARTY:Lext/mods/gameserver/network/SystemMessageId;
       101: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       104: aload_2
       105: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       108: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       111: aload_0
       112: getfield      #12                 // Field _members:Ljava/util/List;
       115: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       120: astore        4
       122: aload         4
       124: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       129: ifeq          158
       132: aload         4
       134: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       139: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       142: astore        5
       144: aload         5
       146: iconst_1
       147: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:(Z)V
       150: aload         5
       152: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       155: goto          122
       158: aload_0
       159: new           #89                 // class ext/mods/gameserver/network/serverpackets/PartyMemberPosition
       162: dup
       163: aload_0
       164: invokespecial #91                 // Method ext/mods/gameserver/network/serverpackets/PartyMemberPosition."<init>":(Lext/mods/gameserver/model/group/Party;)V
       167: putfield      #93                 // Field _positionPacket:Lext/mods/gameserver/network/serverpackets/PartyMemberPosition;
       170: aload_0
       171: aload_0
       172: invokedynamic #97,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/group/Party;)Ljava/lang/Runnable;
       177: ldc2_w        #101                // long 6000l
       180: ldc2_w        #103                // long 12000l
       183: invokestatic  #105                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       186: putfield      #111                // Field _positionBroadcastTask:Ljava/util/concurrent/Future;
       189: return
      LineNumberTable:
        line 92: 0
        line 78: 5
        line 94: 16
        line 95: 27
        line 97: 38
        line 98: 43
        line 100: 48
        line 102: 53
        line 104: 57
        line 105: 70
        line 107: 83
        line 108: 97
        line 110: 111
        line 112: 144
        line 113: 150
        line 114: 155
        line 116: 158
        line 117: 170
        line 123: 189
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          144      11     5 member   Lext/mods/gameserver/model/actor/Player;
            0     190     0  this   Lext/mods/gameserver/model/group/Party;
            0     190     1 leader   Lext/mods/gameserver/model/actor/Player;
            0     190     2 target   Lext/mods/gameserver/model/actor/Player;
            0     190     3 lootRule   Lext/mods/gameserver/enums/LootRule;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 122
          locals = [ class ext/mods/gameserver/model/group/Party, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/LootRule, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 35

  public final java.util.List<ext.mods.gameserver.model.actor.Player> getMembers();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/Party;
    Signature: #688                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  public int getMembersCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #115,  1          // InterfaceMethod java/util/List.size:()I
         9: ireturn
      LineNumberTable:
        line 134: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/group/Party;

  public boolean containsPlayer(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: aload_1
         5: invokeinterface #119,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        10: ireturn
      LineNumberTable:
        line 140: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/group/Party;
            0      11     1 player   Lext/mods/gameserver/model/WorldObject;

  public void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          37
        19: aload_2
        20: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: goto          10
        37: return
      LineNumberTable:
        line 146: 0
        line 147: 29
        line 148: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       5     3 member   Lext/mods/gameserver/model/actor/Player;
            0      38     0  this   Lext/mods/gameserver/model/group/Party;
            0      38     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26

  public void broadcastCreatureSay(ext.mods.gameserver.network.serverpackets.CreatureSay, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          51
        19: aload_3
        20: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        28: astore        4
        30: invokestatic  #122                // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
        33: aload         4
        35: aload_2
        36: invokevirtual #128                // Method ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
        39: ifne          48
        42: aload         4
        44: aload_1
        45: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        48: goto          10
        51: return
      LineNumberTable:
        line 153: 0
        line 155: 30
        line 156: 42
        line 157: 48
        line 158: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      18     4 member   Lext/mods/gameserver/model/actor/Player;
            0      52     0  this   Lext/mods/gameserver/model/group/Party;
            0      52     1   msg   Lext/mods/gameserver/network/serverpackets/CreatureSay;
            0      52     2 broadcaster   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: new           #132                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
         4: dup
         5: aload_2
         6: invokevirtual #134                // Method ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
         9: iload_1
        10: invokespecial #140                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        13: invokevirtual #143                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        16: return
      LineNumberTable:
        line 163: 0
        line 164: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/group/Party;
            0      17     1  time   I
            0      17     2 npcStringId   Lext/mods/gameserver/network/NpcStringId;

  public void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId, java.lang.Object...);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: new           #132                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
         4: dup
         5: aload_2
         6: aload_3
         7: invokevirtual #146                // Method ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
        10: iload_1
        11: invokespecial #140                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        14: invokevirtual #143                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        17: return
      LineNumberTable:
        line 169: 0
        line 170: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/group/Party;
            0      18     1  time   I
            0      18     2 npcStringId   Lext/mods/gameserver/network/NpcStringId;
            0      18     3 params   [Ljava/lang/Object;

  public void recalculateLevel();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #12                 // Field _members:Ljava/util/List;
         6: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          53
        21: aload_2
        22: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        30: astore_3
        31: aload_3
        32: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        35: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        38: iload_1
        39: if_icmple     50
        42: aload_3
        43: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        46: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        49: istore_1
        50: goto          12
        53: aload_0
        54: iload_1
        55: invokevirtual #158                // Method setLevel:(I)V
        58: return
      LineNumberTable:
        line 175: 0
        line 176: 2
        line 178: 31
        line 179: 42
        line 180: 50
        line 181: 53
        line 182: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      19     3 member   Lext/mods/gameserver/model/actor/Player;
            0      59     0  this   Lext/mods/gameserver/model/group/Party;
            2      57     1 newLevel   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ int, class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void disband();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: invokestatic  #162                // Method ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
         3: aload_0
         4: invokevirtual #167                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
         7: invokevirtual #171                // Method ext/mods/gameserver/data/manager/DuelManager.onPartyEdit:(Lext/mods/gameserver/model/actor/Player;)V
        10: aload_0
        11: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
        14: ifnull        57
        17: aload_0
        18: getstatic     #178                // Field ext/mods/gameserver/network/serverpackets/ExCloseMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
        21: invokevirtual #143                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        24: aload_0
        25: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
        28: aload_0
        29: invokevirtual #167                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
        32: invokevirtual #184                // Method ext/mods/gameserver/model/group/CommandChannel.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        35: ifeq          48
        38: aload_0
        39: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
        42: invokevirtual #190                // Method ext/mods/gameserver/model/group/CommandChannel.disband:()V
        45: goto          57
        48: aload_0
        49: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
        52: aload_0
        53: invokevirtual #193                // Method ext/mods/gameserver/model/group/CommandChannel.removeParty:(Lext/mods/gameserver/model/group/Party;)Z
        56: pop
        57: aload_0
        58: getfield      #12                 // Field _members:Ljava/util/List;
        61: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        66: astore_1
        67: aload_1
        68: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        73: ifeq          154
        76: aload_1
        77: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        82: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        85: astore_2
        86: aload_2
        87: aconst_null
        88: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.setParty:(Lext/mods/gameserver/model/group/Party;)V
        91: aload_2
        92: getstatic     #197                // Field ext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll;
        95: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        98: aload_2
        99: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       102: ifeq          113
       105: invokestatic  #205                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       108: aload_2
       109: aload_0
       110: invokevirtual #210                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
       113: aload_2
       114: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
       117: ifnull        127
       120: aload_2
       121: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       124: invokevirtual #221                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
       127: aload_2
       128: ldc           #226                // class ext/mods/gameserver/model/actor/Creature
       130: aload_2
       131: invokedynamic #228,  0            // InvokeDynamic #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
       136: invokedynamic #232,  0            // InvokeDynamic #2:accept:()Ljava/util/function/Consumer;
       141: invokevirtual #236                // Method ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
       144: aload_2
       145: getstatic     #240                // Field ext/mods/gameserver/network/SystemMessageId.PARTY_DISPERSED:Lext/mods/gameserver/network/SystemMessageId;
       148: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       151: goto          67
       154: aload_0
       155: getfield      #12                 // Field _members:Ljava/util/List;
       158: invokeinterface #246,  1          // InterfaceMethod java/util/List.clear:()V
       163: aload_0
       164: getfield      #111                // Field _positionBroadcastTask:Ljava/util/concurrent/Future;
       167: ifnull        186
       170: aload_0
       171: getfield      #111                // Field _positionBroadcastTask:Ljava/util/concurrent/Future;
       174: iconst_0
       175: invokeinterface #249,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
       180: pop
       181: aload_0
       182: aconst_null
       183: putfield      #111                // Field _positionBroadcastTask:Ljava/util/concurrent/Future;
       186: return
      LineNumberTable:
        line 187: 0
        line 189: 10
        line 191: 17
        line 193: 24
        line 194: 38
        line 196: 48
        line 199: 57
        line 201: 86
        line 202: 91
        line 204: 98
        line 205: 105
        line 207: 113
        line 208: 120
        line 210: 127
        line 212: 144
        line 213: 151
        line 214: 154
        line 216: 163
        line 218: 170
        line 219: 181
        line 221: 186
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           86      65     2 member   Lext/mods/gameserver/model/actor/Player;
            0     187     0  this   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 7
        frame_type = 48 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 31 /* same */

  public boolean getPendingInvitation();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #255                // Field _pendingInvitation:Z
         4: ireturn
      LineNumberTable:
        line 228: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/Party;

  public void setPendingInvitation(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #255                // Field _pendingInvitation:Z
         5: aload_0
         6: invokestatic  #259                // Method java/lang/System.currentTimeMillis:()J
         9: ldc2_w        #265                // long 15000l
        12: ladd
        13: putfield      #267                // Field _pendingInviteTimeout:J
        16: return
      LineNumberTable:
        line 237: 0
        line 238: 5
        line 239: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/group/Party;
            0      17     1   val   Z

  public boolean isInvitationRequestExpired();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #267                // Field _pendingInviteTimeout:J
         4: invokestatic  #259                // Method java/lang/System.currentTimeMillis:()J
         7: lcmp
         8: ifgt          15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      LineNumberTable:
        line 246: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void broadcastNewLeaderStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=1
         0: getstatic     #333                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_BECOME_A_PARTY_LEADER:Lext/mods/gameserver/network/SystemMessageId;
         3: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
         6: aload_0
         7: invokevirtual #167                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
        10: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        13: astore_1
        14: aload_0
        15: getfield      #12                 // Field _members:Ljava/util/List;
        18: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        23: astore_2
        24: aload_2
        25: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          75
        33: aload_2
        34: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        42: astore_3
        43: aload_3
        44: getstatic     #197                // Field ext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll;
        47: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        50: aload_3
        51: new           #37                 // class ext/mods/gameserver/network/serverpackets/PartySmallWindowAll
        54: dup
        55: aload_3
        56: aload_0
        57: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/PartySmallWindowAll."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
        60: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        63: aload_3
        64: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        67: aload_3
        68: aload_1
        69: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        72: goto          24
        75: return
      LineNumberTable:
        line 321: 0
        line 322: 14
        line 324: 43
        line 325: 50
        line 326: 63
        line 327: 67
        line 328: 72
        line 329: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      29     3 member   Lext/mods/gameserver/model/actor/Player;
            0      76     0  this   Lext/mods/gameserver/model/group/Party;
           14      62     1    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 50

  public void broadcastToPartyMembers(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #336,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #340,  0            // InvokeDynamic #3:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        15: invokeinterface #341,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: aload_2
        21: invokedynamic #347,  0            // InvokeDynamic #4:accept:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
        26: invokeinterface #350,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        31: return
      LineNumberTable:
        line 338: 0
        line 339: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/group/Party;
            0      32     1 player   Lext/mods/gameserver/model/actor/Player;
            0      32     2   gsp   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;

  public void addPartyMember(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_1
         1: ifnull        17
         4: aload_0
         5: getfield      #12                 // Field _members:Ljava/util/List;
         8: aload_1
         9: invokeinterface #119,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        14: ifeq          18
        17: return
        18: aload_1
        19: new           #37                 // class ext/mods/gameserver/network/serverpackets/PartySmallWindowAll
        22: dup
        23: aload_1
        24: aload_0
        25: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/PartySmallWindowAll."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
        28: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        31: aload_0
        32: new           #46                 // class ext/mods/gameserver/network/serverpackets/PartySmallWindowAdd
        35: dup
        36: aload_1
        37: aload_0
        38: invokespecial #48                 // Method ext/mods/gameserver/network/serverpackets/PartySmallWindowAdd."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
        41: invokevirtual #143                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        44: aload_1
        45: getstatic     #49                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_JOINED_S1_PARTY:Lext/mods/gameserver/network/SystemMessageId;
        48: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        51: aload_0
        52: invokevirtual #167                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
        55: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        58: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        61: aload_0
        62: getstatic     #65                 // Field ext/mods/gameserver/network/SystemMessageId.S1_JOINED_PARTY:Lext/mods/gameserver/network/SystemMessageId;
        65: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        68: aload_1
        69: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        72: invokevirtual #143                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: invokestatic  #162                // Method ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
        78: aload_0
        79: invokevirtual #167                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
        82: invokevirtual #171                // Method ext/mods/gameserver/data/manager/DuelManager.onPartyEdit:(Lext/mods/gameserver/model/actor/Player;)V
        85: aload_0
        86: getfield      #12                 // Field _members:Ljava/util/List;
        89: aload_1
        90: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        95: pop
        96: aload_1
        97: aload_0
        98: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.setParty:(Lext/mods/gameserver/model/group/Party;)V
       101: aload_1
       102: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       105: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       108: aload_0
       109: invokevirtual #354                // Method getLevel:()I
       112: if_icmple     126
       115: aload_0
       116: aload_1
       117: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       120: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       123: invokevirtual #158                // Method setLevel:(I)V
       126: aload_0
       127: getfield      #12                 // Field _members:Ljava/util/List;
       130: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       135: astore_2
       136: aload_2
       137: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       142: ifeq          167
       145: aload_2
       146: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       151: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       154: astore_3
       155: aload_3
       156: iconst_1
       157: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:(Z)V
       160: aload_3
       161: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       164: goto          136
       167: aload_0
       168: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
       171: ifnull        181
       174: aload_1
       175: getstatic     #355                // Field ext/mods/gameserver/network/serverpackets/ExOpenMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
       178: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       181: return
      LineNumberTable:
        line 347: 0
        line 348: 17
        line 350: 18
        line 351: 31
        line 353: 44
        line 354: 61
        line 356: 75
        line 358: 85
        line 360: 96
        line 362: 101
        line 363: 115
        line 365: 126
        line 367: 155
        line 368: 160
        line 369: 164
        line 371: 167
        line 372: 174
        line 373: 181
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          155       9     3 member   Lext/mods/gameserver/model/actor/Player;
            0     182     0  this   Lext/mods/gameserver/model/group/Party;
            0     182     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 107
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 30
        frame_type = 13 /* same */

  public void removePartyMember(java.lang.String, ext.mods.gameserver.enums.MessageType);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/enums/MessageType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: aload_1
         3: invokevirtual #360                // Method getPlayerByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
         6: aload_2
         7: invokevirtual #364                // Method removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
        10: return
      LineNumberTable:
        line 382: 0
        line 383: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/group/Party;
            0      11     1  name   Ljava/lang/String;
            0      11     2  type   Lext/mods/gameserver/enums/MessageType;

  public void removePartyMember(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.enums.MessageType);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: aload_1
         1: ifnull        17
         4: aload_0
         5: getfield      #12                 // Field _members:Ljava/util/List;
         8: aload_1
         9: invokeinterface #119,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        14: ifne          18
        17: return
        18: aload_0
        19: aload_1
        20: invokevirtual #368                // Method isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        23: istore_3
        24: aload_0
        25: getfield      #12                 // Field _members:Ljava/util/List;
        28: invokeinterface #115,  1          // InterfaceMethod java/util/List.size:()I
        33: iconst_2
        34: if_icmpeq     48
        37: aload_2
        38: getstatic     #369                // Field ext/mods/gameserver/enums/MessageType.DISCONNECTED:Lext/mods/gameserver/enums/MessageType;
        41: if_acmpeq     55
        44: iload_3
        45: ifeq          55
        48: aload_0
        49: invokevirtual #375                // Method disband:()V
        52: goto          285
        55: iload_3
        56: ifeq          110
        59: aload_0
        60: getfield      #12                 // Field _members:Ljava/util/List;
        63: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        68: astore        4
        70: aload         4
        72: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        77: ifeq          110
        80: aload         4
        82: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        87: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        90: astore        5
        92: aload         5
        94: aload_1
        95: if_acmpeq     107
        98: aload_0
        99: aload         5
       101: invokevirtual #376                // Method changePartyLeader:(Lext/mods/gameserver/model/actor/Player;)V
       104: goto          110
       107: goto          70
       110: invokestatic  #162                // Method ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
       113: aload_0
       114: invokevirtual #167                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
       117: invokevirtual #171                // Method ext/mods/gameserver/data/manager/DuelManager.onPartyEdit:(Lext/mods/gameserver/model/actor/Player;)V
       120: aload_0
       121: getfield      #12                 // Field _members:Ljava/util/List;
       124: aload_1
       125: invokeinterface #379,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
       130: pop
       131: aload_0
       132: invokevirtual #34                 // Method recalculateLevel:()V
       135: aload_1
       136: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       139: ifeq          150
       142: invokestatic  #205                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       145: aload_1
       146: aload_0
       147: invokevirtual #210                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
       150: aload_1
       151: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
       154: ifnull        164
       157: aload_1
       158: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       161: invokevirtual #221                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
       164: aload_1
       165: ldc           #226                // class ext/mods/gameserver/model/actor/Creature
       167: aload_1
       168: invokedynamic #382,  0            // InvokeDynamic #5:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
       173: invokedynamic #383,  0            // InvokeDynamic #6:accept:()Ljava/util/function/Consumer;
       178: invokevirtual #236                // Method ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
       181: aload_2
       182: getstatic     #384                // Field ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
       185: if_acmpne     212
       188: aload_1
       189: getstatic     #387                // Field ext/mods/gameserver/network/SystemMessageId.HAVE_BEEN_EXPELLED_FROM_PARTY:Lext/mods/gameserver/network/SystemMessageId;
       192: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       195: aload_0
       196: getstatic     #390                // Field ext/mods/gameserver/network/SystemMessageId.S1_WAS_EXPELLED_FROM_PARTY:Lext/mods/gameserver/network/SystemMessageId;
       199: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       202: aload_1
       203: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       206: invokevirtual #143                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       209: goto          247
       212: aload_2
       213: getstatic     #393                // Field ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
       216: if_acmpeq     226
       219: aload_2
       220: getstatic     #369                // Field ext/mods/gameserver/enums/MessageType.DISCONNECTED:Lext/mods/gameserver/enums/MessageType;
       223: if_acmpne     247
       226: aload_1
       227: getstatic     #396                // Field ext/mods/gameserver/network/SystemMessageId.YOU_LEFT_PARTY:Lext/mods/gameserver/network/SystemMessageId;
       230: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       233: aload_0
       234: getstatic     #399                // Field ext/mods/gameserver/network/SystemMessageId.S1_LEFT_PARTY:Lext/mods/gameserver/network/SystemMessageId;
       237: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       240: aload_1
       241: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       244: invokevirtual #143                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       247: aload_1
       248: aconst_null
       249: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.setParty:(Lext/mods/gameserver/model/group/Party;)V
       252: aload_1
       253: getstatic     #197                // Field ext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PartySmallWindowDeleteAll;
       256: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       259: aload_0
       260: new           #402                // class ext/mods/gameserver/network/serverpackets/PartySmallWindowDelete
       263: dup
       264: aload_1
       265: invokespecial #404                // Method ext/mods/gameserver/network/serverpackets/PartySmallWindowDelete."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       268: invokevirtual #143                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       271: aload_0
       272: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
       275: ifnull        285
       278: aload_1
       279: getstatic     #178                // Field ext/mods/gameserver/network/serverpackets/ExCloseMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
       282: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       285: return
      LineNumberTable:
        line 392: 0
        line 393: 17
        line 395: 18
        line 397: 24
        line 398: 48
        line 401: 55
        line 403: 59
        line 405: 92
        line 407: 98
        line 408: 104
        line 410: 107
        line 413: 110
        line 415: 120
        line 416: 131
        line 418: 135
        line 419: 142
        line 421: 150
        line 422: 157
        line 424: 164
        line 426: 181
        line 428: 188
        line 429: 195
        line 431: 212
        line 433: 226
        line 434: 233
        line 437: 247
        line 438: 252
        line 440: 259
        line 442: 271
        line 443: 278
        line 445: 285
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           92      15     5 member   Lext/mods/gameserver/model/actor/Player;
            0     286     0  this   Lext/mods/gameserver/model/group/Party;
            0     286     1 player   Lext/mods/gameserver/model/actor/Player;
            0     286     2  type   Lext/mods/gameserver/enums/MessageType;
           24     262     3 isLeader   Z
      StackMapTable: number_of_entries = 13
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 39 /* same */
        frame_type = 13 /* same */
        frame_type = 47 /* same */
        frame_type = 13 /* same */
        frame_type = 20 /* same */
        frame_type = 37 /* same */

  public void changePartyLeader(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: aload_1
         3: invokevirtual #360                // Method getPlayerByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
         6: invokevirtual #376                // Method changePartyLeader:(Lext/mods/gameserver/model/actor/Player;)V
         9: return
      LineNumberTable:
        line 453: 0
        line 454: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/group/Party;
            0      10     1  name   Ljava/lang/String;

  public void changePartyLeader(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #405                // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
         8: ifeq          12
        11: return
        12: aload_0
        13: getfield      #12                 // Field _members:Ljava/util/List;
        16: aload_1
        17: invokeinterface #119,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        22: ifne          33
        25: aload_1
        26: getstatic     #408                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CAN_TRANSFER_RIGHTS_ONLY_TO_ANOTHER_PARTY_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
        29: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        32: return
        33: aload_0
        34: aload_1
        35: invokevirtual #368                // Method isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        38: ifeq          49
        41: aload_1
        42: getstatic     #411                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_TRANSFER_RIGHTS_TO_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
        45: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        48: return
        49: aload_0
        50: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
        53: ifnull        95
        56: aload_0
        57: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
        60: aload_0
        61: invokevirtual #167                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
        64: invokevirtual #184                // Method ext/mods/gameserver/model/group/CommandChannel.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        67: ifeq          95
        70: aload_0
        71: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
        74: aload_1
        75: invokevirtual #414                // Method ext/mods/gameserver/model/group/CommandChannel.setLeader:(Lext/mods/gameserver/model/actor/Player;)V
        78: aload_0
        79: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
        82: getstatic     #417                // Field ext/mods/gameserver/network/SystemMessageId.COMMAND_CHANNEL_LEADER_NOW_S1:Lext/mods/gameserver/network/SystemMessageId;
        85: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        88: aload_1
        89: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        92: invokevirtual #420                // Method ext/mods/gameserver/model/group/CommandChannel.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        95: aload_0
        96: aload_1
        97: invokevirtual #421                // Method setLeader:(Lext/mods/gameserver/model/actor/Player;)V
       100: aload_0
       101: invokevirtual #422                // Method broadcastNewLeaderStatus:()V
       104: aload_1
       105: invokevirtual #425                // Method ext/mods/gameserver/model/actor/Player.isInPartyMatchRoom:()Z
       108: ifeq          131
       111: invokestatic  #428                // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
       114: aload_1
       115: invokevirtual #433                // Method ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
       118: invokevirtual #436                // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
       121: astore_2
       122: aload_2
       123: ifnull        131
       126: aload_2
       127: aload_1
       128: invokevirtual #440                // Method ext/mods/gameserver/model/group/PartyMatchRoom.changeLeader:(Lext/mods/gameserver/model/actor/Player;)V
       131: return
      LineNumberTable:
        line 462: 0
        line 463: 11
        line 465: 12
        line 467: 25
        line 468: 32
        line 471: 33
        line 473: 41
        line 474: 48
        line 477: 49
        line 479: 70
        line 480: 78
        line 483: 95
        line 484: 100
        line 486: 104
        line 488: 111
        line 489: 122
        line 490: 126
        line 492: 131
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          122       9     2  room   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0     132     0  this   Lext/mods/gameserver/model/group/Party;
            0     132     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 20 /* same */
        frame_type = 15 /* same */
        frame_type = 45 /* same */
        frame_type = 35 /* same */

  public void distributeItem(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Summon);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: aload_2
         1: invokevirtual #454                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
         4: bipush        57
         6: if_icmpne     24
         9: aload_0
        10: aload_1
        11: aload_2
        12: invokevirtual #459                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        15: aload_1
        16: invokevirtual #462                // Method distributeAdena:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Creature;)V
        19: aload_2
        20: invokevirtual #466                // Method ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
        23: return
        24: aload_0
        25: aload_1
        26: aload_2
        27: invokevirtual #454                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        30: iconst_0
        31: aload_1
        32: invokevirtual #469                // Method getValidLooter:(Lext/mods/gameserver/model/actor/Player;IZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
        35: astore        4
        37: aload         4
        39: ifnonnull     43
        42: return
        43: aload_3
        44: instanceof    #473                // class ext/mods/gameserver/model/actor/instance/Pet
        47: ifeq          68
        50: aload         4
        52: aload_3
        53: invokevirtual #475                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        56: if_acmpne     68
        59: aload_3
        60: aload_2
        61: iconst_1
        62: invokevirtual #480                // Method ext/mods/gameserver/model/actor/Summon.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
        65: goto          173
        68: aload_2
        69: invokevirtual #459                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        72: iconst_1
        73: if_icmple     107
        76: aload_0
        77: aload         4
        79: getstatic     #484                // Field ext/mods/gameserver/network/SystemMessageId.S1_OBTAINED_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
        82: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        85: aload         4
        87: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        90: aload_2
        91: invokevirtual #487                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        94: aload_2
        95: invokevirtual #459                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        98: invokevirtual #491                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       101: invokevirtual #495                // Method broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       104: goto          166
       107: aload_2
       108: invokevirtual #499                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       111: ifle          145
       114: aload_0
       115: aload         4
       117: getstatic     #502                // Field ext/mods/gameserver/network/SystemMessageId.S1_OBTAINED_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
       120: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       123: aload         4
       125: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       128: aload_2
       129: invokevirtual #499                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       132: invokevirtual #505                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       135: aload_2
       136: invokevirtual #487                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       139: invokevirtual #495                // Method broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       142: goto          166
       145: aload_0
       146: aload         4
       148: getstatic     #508                // Field ext/mods/gameserver/network/SystemMessageId.S1_OBTAINED_S2:Lext/mods/gameserver/network/SystemMessageId;
       151: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       154: aload         4
       156: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       159: aload_2
       160: invokevirtual #487                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       163: invokevirtual #495                // Method broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       166: aload         4
       168: aload_2
       169: iconst_1
       170: invokevirtual #511                // Method ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       173: return
      LineNumberTable:
        line 516: 0
        line 518: 9
        line 519: 19
        line 520: 23
        line 523: 24
        line 524: 37
        line 525: 42
        line 527: 43
        line 528: 59
        line 531: 68
        line 532: 76
        line 533: 107
        line 534: 114
        line 536: 145
        line 538: 166
        line 540: 173
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     174     0  this   Lext/mods/gameserver/model/group/Party;
            0     174     1 player   Lext/mods/gameserver/model/actor/Player;
            0     174     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     174     3 summon   Lext/mods/gameserver/model/actor/Summon;
           37     137     4 target   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 7
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 24 /* same */
        frame_type = 38 /* same */
        frame_type = 37 /* same */
        frame_type = 20 /* same */
        frame_type = 6 /* same */

  public void distributeItem(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.holder.IntIntHolder, boolean, ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: aload_2
         1: ifnonnull     5
         4: return
         5: aload_2
         6: invokevirtual #512                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
         9: bipush        57
        11: if_icmpne     26
        14: aload_0
        15: aload_1
        16: aload_2
        17: invokevirtual #517                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        20: aload         4
        22: invokevirtual #462                // Method distributeAdena:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Creature;)V
        25: return
        26: aload_0
        27: aload_1
        28: aload_2
        29: invokevirtual #512                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        32: iload_3
        33: aload         4
        35: invokevirtual #469                // Method getValidLooter:(Lext/mods/gameserver/model/actor/Player;IZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Player;
        38: astore        5
        40: aload         5
        42: ifnonnull     46
        45: return
        46: iload_3
        47: ifeq          68
        50: aload         5
        52: aload_2
        53: invokevirtual #512                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        56: aload_2
        57: invokevirtual #517                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        60: iconst_1
        61: invokevirtual #520                // Method ext/mods/gameserver/model/actor/Player.addEarnedItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
        64: pop
        65: goto          83
        68: aload         5
        70: aload_2
        71: invokevirtual #512                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        74: aload_2
        75: invokevirtual #517                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        78: iconst_1
        79: invokevirtual #524                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
        82: pop
        83: aload_2
        84: invokevirtual #517                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        87: iconst_1
        88: if_icmple     143
        91: iload_3
        92: ifeq          104
        95: getstatic     #526                // Field ext/mods/gameserver/network/SystemMessageId.S1_SWEEPED_UP_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
        98: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       101: goto          110
       104: getstatic     #484                // Field ext/mods/gameserver/network/SystemMessageId.S1_OBTAINED_S3_S2:Lext/mods/gameserver/network/SystemMessageId;
       107: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       110: astore        6
       112: aload         6
       114: aload         5
       116: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       119: pop
       120: aload         6
       122: aload_2
       123: invokevirtual #512                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       126: invokevirtual #529                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       129: pop
       130: aload         6
       132: aload_2
       133: invokevirtual #517                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       136: invokevirtual #491                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       139: pop
       140: goto          182
       143: iload_3
       144: ifeq          156
       147: getstatic     #531                // Field ext/mods/gameserver/network/SystemMessageId.S1_SWEEPED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
       150: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       153: goto          162
       156: getstatic     #508                // Field ext/mods/gameserver/network/SystemMessageId.S1_OBTAINED_S2:Lext/mods/gameserver/network/SystemMessageId;
       159: invokestatic  #55                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       162: astore        6
       164: aload         6
       166: aload         5
       168: invokevirtual #61                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       171: pop
       172: aload         6
       174: aload_2
       175: invokevirtual #512                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       178: invokevirtual #529                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       181: pop
       182: aload_0
       183: aload         5
       185: aload         6
       187: invokevirtual #495                // Method broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       190: return
      LineNumberTable:
        line 551: 0
        line 552: 4
        line 554: 5
        line 556: 14
        line 557: 25
        line 560: 26
        line 561: 40
        line 562: 45
        line 564: 46
        line 565: 50
        line 567: 68
        line 570: 83
        line 572: 91
        line 573: 112
        line 574: 120
        line 575: 130
        line 579: 143
        line 580: 164
        line 581: 172
        line 583: 182
        line 584: 190
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          112      31     6   msg   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0     191     0  this   Lext/mods/gameserver/model/group/Party;
            0     191     1 player   Lext/mods/gameserver/model/actor/Player;
            0     191     2  item   Lext/mods/gameserver/model/holder/IntIntHolder;
            0     191     3 isSpoil   Z
            0     191     4 target   Lext/mods/gameserver/model/actor/Attackable;
           40     151     5 looter   Lext/mods/gameserver/model/actor/Player;
          164      27     6   msg   Lext/mods/gameserver/network/serverpackets/SystemMessage;
      StackMapTable: number_of_entries = 11
        frame_type = 5 /* same */
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 21 /* same */
        frame_type = 14 /* same */
        frame_type = 20 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 32 /* same */
        frame_type = 12 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]

  public void distributeAdena(ext.mods.gameserver.model.actor.Player, int, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: new           #271                // class java/util/ArrayList
         3: dup
         4: aload_0
         5: getfield      #12                 // Field _members:Ljava/util/List;
         8: invokeinterface #115,  1          // InterfaceMethod java/util/List.size:()I
        13: invokespecial #534                // Method java/util/ArrayList."<init>":(I)V
        16: astore        4
        18: aload_0
        19: getfield      #12                 // Field _members:Ljava/util/List;
        22: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        27: astore        5
        29: aload         5
        31: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        36: ifeq          90
        39: aload         5
        41: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        46: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        49: astore        6
        51: aload         6
        53: invokevirtual #536                // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
        56: ldc_w         #541                // int 2147483647
        59: if_icmpeq     29
        62: aload         6
        64: aload_3
        65: getstatic     #287                // Field ext/mods/Config.PARTY_RANGE:I
        68: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        71: ifne          77
        74: goto          29
        77: aload         4
        79: aload         6
        81: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        86: pop
        87: goto          29
        90: aload         4
        92: invokeinterface #297,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        97: ifeq          101
       100: return
       101: iload_2
       102: aload         4
       104: invokeinterface #115,  1          // InterfaceMethod java/util/List.size:()I
       109: idiv
       110: istore        5
       112: aload         4
       114: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       119: astore        6
       121: aload         6
       123: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       128: ifeq          154
       131: aload         6
       133: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       138: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       141: astore        7
       143: aload         7
       145: iload         5
       147: iconst_1
       148: invokevirtual #542                // Method ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
       151: goto          121
       154: return
      LineNumberTable:
        line 594: 0
        line 595: 18
        line 597: 51
        line 598: 74
        line 600: 77
        line 601: 87
        line 603: 90
        line 604: 100
        line 606: 101
        line 607: 112
        line 608: 143
        line 609: 154
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      36     6 member   Lext/mods/gameserver/model/actor/Player;
          143       8     7 member   Lext/mods/gameserver/model/actor/Player;
            0     155     0  this   Lext/mods/gameserver/model/group/Party;
            0     155     1 player   Lext/mods/gameserver/model/actor/Player;
            0     155     2 adena   I
            0     155     3 target   Lext/mods/gameserver/model/actor/Creature;
           18     137     4 toReward   Ljava/util/List;
          112      43     5 count   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           18     137     4 toReward   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 12
        frame_type = 10 /* same */
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32

  public void distributeXpAndSp(long, long, int, long, int, java.util.List<ext.mods.gameserver.model.actor.Player>, int, java.util.Map<ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.container.npc.RewardInfo>);
    descriptor: (JJIJILjava/util/List;ILjava/util/Map;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=13, locals=29, args_size=9
         0: new           #271                // class java/util/ArrayList
         3: dup
         4: invokespecial #273                // Method java/util/ArrayList."<init>":()V
         7: astore        12
         9: getstatic     #546                // Field ext/mods/Config.PARTY_XP_CUTOFF_METHOD:Ljava/lang/String;
        12: ldc_w         #550                // String level
        15: invokevirtual #448                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        18: ifeq          85
        21: aload         9
        23: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore        13
        30: aload         13
        32: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        37: ifeq          82
        40: aload         13
        42: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        47: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        50: astore        14
        52: iload         10
        54: aload         14
        56: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        59: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        62: isub
        63: getstatic     #552                // Field ext/mods/Config.PARTY_XP_CUTOFF_LEVEL:I
        66: if_icmpgt     79
        69: aload         12
        71: aload         14
        73: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        78: pop
        79: goto          30
        82: goto          446
        85: getstatic     #546                // Field ext/mods/Config.PARTY_XP_CUTOFF_METHOD:Ljava/lang/String;
        88: ldc_w         #555                // String percentage
        91: invokevirtual #448                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        94: ifeq          239
        97: iconst_0
        98: istore        13
       100: aload         9
       102: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       107: astore        14
       109: aload         14
       111: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       116: ifeq          156
       119: aload         14
       121: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       126: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       129: astore        15
       131: iload         13
       133: aload         15
       135: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       138: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       141: aload         15
       143: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       146: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       149: imul
       150: iadd
       151: istore        13
       153: goto          109
       156: aload         9
       158: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       163: astore        14
       165: aload         14
       167: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       172: ifeq          236
       175: aload         14
       177: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       182: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       185: astore        15
       187: aload         15
       189: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       192: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       195: aload         15
       197: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       200: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       203: imul
       204: istore        16
       206: iload         16
       208: bipush        100
       210: imul
       211: i2d
       212: iload         13
       214: i2d
       215: getstatic     #557                // Field ext/mods/Config.PARTY_XP_CUTOFF_PERCENT:D
       218: dmul
       219: dcmpl
       220: iflt          233
       223: aload         12
       225: aload         15
       227: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       232: pop
       233: goto          165
       236: goto          446
       239: getstatic     #546                // Field ext/mods/Config.PARTY_XP_CUTOFF_METHOD:Ljava/lang/String;
       242: ldc_w         #561                // String auto
       245: invokevirtual #448                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       248: ifeq          424
       251: iconst_0
       252: istore        13
       254: aload         9
       256: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       261: astore        14
       263: aload         14
       265: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       270: ifeq          310
       273: aload         14
       275: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       280: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       283: astore        15
       285: iload         13
       287: aload         15
       289: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       292: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       295: aload         15
       297: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       300: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       303: imul
       304: iadd
       305: istore        13
       307: goto          263
       310: aload         9
       312: invokeinterface #115,  1          // InterfaceMethod java/util/List.size:()I
       317: i2l
       318: iconst_1
       319: bipush        9
       321: invokestatic  #563                // Method java/lang/Math.clamp:(JII)I
       324: istore        14
       326: aload         9
       328: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       333: astore        15
       335: aload         15
       337: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       342: ifeq          421
       345: aload         15
       347: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       352: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       355: astore        16
       357: aload         16
       359: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       362: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       365: aload         16
       367: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       370: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       373: imul
       374: istore        17
       376: iload         17
       378: i2d
       379: iload         13
       381: i2d
       382: dconst_1
       383: dconst_1
       384: dconst_1
       385: getstatic     #569                // Field BONUS_EXP_SP:[D
       388: iload         14
       390: daload
       391: dadd
       392: getstatic     #569                // Field BONUS_EXP_SP:[D
       395: iload         14
       397: iconst_1
       398: isub
       399: daload
       400: dsub
       401: ddiv
       402: dsub
       403: dmul
       404: dcmpl
       405: iflt          418
       408: aload         12
       410: aload         16
       412: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       417: pop
       418: goto          335
       421: goto          446
       424: getstatic     #546                // Field ext/mods/Config.PARTY_XP_CUTOFF_METHOD:Ljava/lang/String;
       427: ldc_w         #573                // String none
       430: invokevirtual #448                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       433: ifeq          446
       436: aload         12
       438: aload         9
       440: invokeinterface #575,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
       445: pop
       446: getstatic     #569                // Field BONUS_EXP_SP:[D
       449: aload         12
       451: invokeinterface #115,  1          // InterfaceMethod java/util/List.size:()I
       456: bipush        9
       458: invokestatic  #579                // Method java/lang/Math.min:(II)I
       461: daload
       462: dstore        13
       464: lload         6
       466: l2d
       467: dload         13
       469: getstatic     #583                // Field ext/mods/Config.RATE_PARTY_XP:D
       472: dmul
       473: dmul
       474: d2l
       475: lstore        6
       477: iload         8
       479: i2d
       480: dload         13
       482: getstatic     #586                // Field ext/mods/Config.RATE_PARTY_SP:D
       485: dmul
       486: dmul
       487: d2i
       488: istore        8
       490: lload_3
       491: l2d
       492: dload         13
       494: getstatic     #583                // Field ext/mods/Config.RATE_PARTY_XP:D
       497: dmul
       498: dmul
       499: d2l
       500: lstore_3
       501: iload         5
       503: i2d
       504: dload         13
       506: getstatic     #586                // Field ext/mods/Config.RATE_PARTY_SP:D
       509: dmul
       510: dmul
       511: d2i
       512: istore        5
       514: lload_1
       515: l2d
       516: dload         13
       518: getstatic     #583                // Field ext/mods/Config.RATE_PARTY_XP:D
       521: dmul
       522: dmul
       523: d2l
       524: lstore_1
       525: lconst_0
       526: lstore        15
       528: iconst_0
       529: istore        17
       531: iconst_0
       532: istore        18
       534: aload         12
       536: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       541: astore        19
       543: aload         19
       545: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       550: ifeq          590
       553: aload         19
       555: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       560: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       563: astore        20
       565: iload         18
       567: aload         20
       569: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       572: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       575: aload         20
       577: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       580: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       583: imul
       584: iadd
       585: istore        18
       587: goto          543
       590: aload         9
       592: invokeinterface #68,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       597: astore        19
       599: aload         19
       601: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       606: ifeq          797
       609: aload         19
       611: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       616: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       619: astore        20
       621: aload         20
       623: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       626: ifeq          632
       629: goto          599
       632: getstatic     #589                // Field ext/mods/Config.DYNAMIC_XP:Z
       635: ifeq          648
       638: lload_1
       639: lstore        15
       641: iload         8
       643: istore        17
       645: goto          675
       648: aload         20
       650: invokevirtual #592                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       653: iconst_1
       654: if_icmpne     667
       657: lload_3
       658: lstore        15
       660: iload         5
       662: istore        17
       664: goto          675
       667: lload         6
       669: lstore        15
       671: iload         8
       673: istore        17
       675: aload         12
       677: aload         20
       679: invokeinterface #119,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       684: ifeq          787
       687: aload         20
       689: invokevirtual #595                // Method ext/mods/gameserver/model/actor/Player.hasServitor:()Z
       692: ifeq          709
       695: aload         20
       697: invokevirtual #598                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       700: checkcast     #602                // class ext/mods/gameserver/model/actor/instance/Servitor
       703: invokevirtual #604                // Method ext/mods/gameserver/model/actor/instance/Servitor.getExpPenalty:()F
       706: goto          710
       709: fconst_0
       710: fstore        21
       712: aload         20
       714: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       717: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       720: aload         20
       722: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       725: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       728: imul
       729: i2d
       730: dstore        22
       732: dload         22
       734: iload         18
       736: i2d
       737: ddiv
       738: fconst_1
       739: fload         21
       741: fsub
       742: f2d
       743: dmul
       744: dstore        24
       746: lload         15
       748: l2d
       749: dload         24
       751: dmul
       752: invokestatic  #608                // Method java/lang/Math.round:(D)J
       755: lstore        26
       757: iload         17
       759: i2d
       760: dload         24
       762: dmul
       763: d2i
       764: istore        28
       766: aload         20
       768: lload         26
       770: invokevirtual #612                // Method ext/mods/gameserver/model/actor/Player.updateKarmaLoss:(J)V
       773: aload         20
       775: lload         26
       777: iload         28
       779: aload         11
       781: invokevirtual #616                // Method ext/mods/gameserver/model/actor/Player.addExpAndSp:(JILjava/util/Map;)V
       784: goto          794
       787: aload         20
       789: lconst_0
       790: iconst_0
       791: invokevirtual #620                // Method ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
       794: goto          599
       797: return
      LineNumberTable:
        line 628: 0
        line 630: 9
        line 632: 21
        line 634: 52
        line 635: 69
        line 636: 79
        line 638: 85
        line 640: 97
        line 641: 100
        line 642: 131
        line 644: 156
        line 646: 187
        line 647: 206
        line 648: 223
        line 649: 233
        line 650: 236
        line 651: 239
        line 653: 251
        line 654: 254
        line 655: 285
        line 657: 310
        line 659: 326
        line 661: 357
        line 662: 376
        line 663: 408
        line 664: 418
        line 665: 421
        line 666: 424
        line 667: 436
        line 669: 446
        line 671: 464
        line 672: 477
        line 673: 490
        line 674: 501
        line 675: 514
        line 677: 525
        line 678: 528
        line 679: 531
        line 680: 534
        line 681: 565
        line 683: 590
        line 685: 621
        line 686: 629
        line 688: 632
        line 690: 638
        line 691: 641
        line 693: 648
        line 695: 657
        line 696: 660
        line 700: 667
        line 701: 671
        line 704: 675
        line 706: 687
        line 708: 712
        line 709: 732
        line 711: 746
        line 712: 757
        line 714: 766
        line 716: 773
        line 717: 784
        line 719: 787
        line 720: 794
        line 721: 797
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      27    14 member   Lext/mods/gameserver/model/actor/Player;
          131      22    15 member   Lext/mods/gameserver/model/actor/Player;
          206      27    16 sqLevel   I
          187      46    15 member   Lext/mods/gameserver/model/actor/Player;
          100     136    13 sqLevelSum   I
          285      22    15 member   Lext/mods/gameserver/model/actor/Player;
          376      42    17 sqLevel   I
          357      61    16 member   Lext/mods/gameserver/model/actor/Player;
          254     167    13 sqLevelSum   I
          326      95    14 partySize   I
          565      22    20 member   Lext/mods/gameserver/model/actor/Player;
          712      72    21 penalty   F
          732      52    22 sqLevel   D
          746      38    24 preCalculation   D
          757      27    26    xp   J
          766      18    28    sp   I
          621     173    20 member   Lext/mods/gameserver/model/actor/Player;
            0     798     0  this   Lext/mods/gameserver/model/group/Party;
            0     798     1 xp_dynam   J
            0     798     3 xpReward_pr   J
            0     798     5 spReward_pr   I
            0     798     6 xpReward   J
            0     798     8 spReward   I
            0     798     9 rewardedMembers   Ljava/util/List;
            0     798    10 topLvl   I
            0     798    11 rewards   Ljava/util/Map;
            9     789    12 validMembers   Ljava/util/List;
          464     334    13 partyRate   D
          528     270    15 xpRew   J
          531     267    17 spRew   I
          534     264    18 sqLevelSum   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     798     9 rewardedMembers   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
            0     798    11 rewards   Ljava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;
            9     789    12 validMembers   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 29
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 48 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 46
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 46
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ int, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 82
        frame_type = 248 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 96
          locals = [ class ext/mods/gameserver/model/group/Party, long, long, int, long, int, class java/util/List, int, class java/util/Map, class java/util/List, double, long, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 46
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 15 /* same */
        frame_type = 18 /* same */
        frame_type = 7 /* same */
        frame_type = 33 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ float ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 76
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #767                         // (JJIJILjava/util/List<Lext/mods/gameserver/model/actor/Player;>;ILjava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;)V

  public ext.mods.gameserver.enums.LootRule getLootRule();
    descriptor: ()Lext/mods/gameserver/enums/LootRule;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _lootRule:Lext/mods/gameserver/enums/LootRule;
         4: areturn
      LineNumberTable:
        line 725: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/Party;

  public boolean isInCommandChannel();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 730: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.group.CommandChannel getCommandChannel();
    descriptor: ()Lext/mods/gameserver/model/group/CommandChannel;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
         4: areturn
      LineNumberTable:
        line 735: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/Party;

  public void setCommandChannel(ext.mods.gameserver.model.group.CommandChannel);
    descriptor: (Lext/mods/gameserver/model/group/CommandChannel;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #174                // Field _commandChannel:Lext/mods/gameserver/model/group/CommandChannel;
         5: return
      LineNumberTable:
        line 740: 0
        line 741: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/group/Party;
            0       6     1 channel   Lext/mods/gameserver/model/group/CommandChannel;

  public boolean wipedOut();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #336,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: invokedynamic #623,  0            // InvokeDynamic #7:test:()Ljava/util/function/Predicate;
        14: invokeinterface #626,  2          // InterfaceMethod java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
        19: ireturn
      LineNumberTable:
        line 748: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/group/Party;

  public boolean equals(ext.mods.gameserver.model.group.Party);
    descriptor: (Lext/mods/gameserver/model/group/Party;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        19
         4: aload_0
         5: invokevirtual #630                // Method getLeaderObjectId:()I
         8: aload_1
         9: invokevirtual #630                // Method getLeaderObjectId:()I
        12: if_icmpne     19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
      LineNumberTable:
        line 758: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/group/Party;
            0      21     1 party   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void resetDuelState();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokedynamic #633,  0            // InvokeDynamic #8:accept:()Ljava/util/function/Consumer;
         9: invokeinterface #634,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        14: return
      LineNumberTable:
        line 766: 0
        line 767: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/group/Party;

  public void stopToFight();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokedynamic #635,  0            // InvokeDynamic #9:accept:()Ljava/util/function/Consumer;
         9: invokeinterface #634,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        14: return
      LineNumberTable:
        line 774: 0
        line 775: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/group/Party;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: bipush        10
         2: newarray       double
         4: dup
         5: iconst_0
         6: dconst_1
         7: dastore
         8: dup
         9: iconst_1
        10: dconst_1
        11: dastore
        12: dup
        13: iconst_2
        14: ldc2_w        #652                // double 1.3d
        17: dastore
        18: dup
        19: iconst_3
        20: ldc2_w        #654                // double 1.39d
        23: dastore
        24: dup
        25: iconst_4
        26: ldc2_w        #656                // double 1.5d
        29: dastore
        30: dup
        31: iconst_5
        32: ldc2_w        #658                // double 1.54d
        35: dastore
        36: dup
        37: bipush        6
        39: ldc2_w        #660                // double 1.58d
        42: dastore
        43: dup
        44: bipush        7
        46: ldc2_w        #662                // double 1.63d
        49: dastore
        50: dup
        51: bipush        8
        53: ldc2_w        #664                // double 1.67d
        56: dastore
        57: dup
        58: bipush        9
        60: ldc2_w        #666                // double 1.71d
        63: dastore
        64: putstatic     #569                // Field BONUS_EXP_SP:[D
        67: return
      LineNumberTable:
        line 62: 0
}
SourceFile: "Party.java"
NestMembers:
  ext/mods/gameserver/model/group/Party$1
BootstrapMethods:
  0: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #798 ()V
      #799 REF_invokeVirtual ext/mods/gameserver/model/group/Party.lambda$new$0:()V
      #798 ()V
  1: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #802 (Ljava/lang/Object;)Z
      #803 REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$disband$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
      #806 (Lext/mods/gameserver/model/actor/Creature;)Z
  2: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #808 (Ljava/lang/Object;)V
      #810 REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$disband$1:(Lext/mods/gameserver/model/actor/Creature;)V
      #813 (Lext/mods/gameserver/model/actor/Creature;)V
  3: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #802 (Ljava/lang/Object;)Z
      #814 REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$broadcastToPartyMembers$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
      #817 (Lext/mods/gameserver/model/actor/Player;)Z
  4: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #808 (Ljava/lang/Object;)V
      #818 REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$broadcastToPartyMembers$1:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
      #821 (Lext/mods/gameserver/model/actor/Player;)V
  5: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #802 (Ljava/lang/Object;)Z
      #822 REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$removePartyMember$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
      #806 (Lext/mods/gameserver/model/actor/Creature;)Z
  6: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #808 (Ljava/lang/Object;)V
      #825 REF_invokeStatic ext/mods/gameserver/model/group/Party.lambda$removePartyMember$1:(Lext/mods/gameserver/model/actor/Creature;)V
      #813 (Lext/mods/gameserver/model/actor/Creature;)V
  7: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #802 (Ljava/lang/Object;)Z
      #828 REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.isDead:()Z
      #817 (Lext/mods/gameserver/model/actor/Player;)Z
  8: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #808 (Ljava/lang/Object;)V
      #830 REF_invokeVirtual ext/mods/gameserver/model/actor/Player.resetDuelState:()V
      #821 (Lext/mods/gameserver/model/actor/Player;)V
  9: #836 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #808 (Ljava/lang/Object;)V
      #833 REF_invokeVirtual ext/mods/gameserver/model/actor/Player.stopToFight:()V
      #821 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  static #316;                            // class ext/mods/gameserver/model/group/Party$1
  public static final #848= #844 of #846; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
