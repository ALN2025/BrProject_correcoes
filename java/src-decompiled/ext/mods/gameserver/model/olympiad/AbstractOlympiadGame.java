// Bytecode for: ext.mods.gameserver.model.olympiad.AbstractOlympiadGame
// File: ext\mods\gameserver\model\olympiad\AbstractOlympiadGame.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.class
  Last modified 9 de jul de 2026; size 13792 bytes
  MD5 checksum 3a54edb384553d6fb6e013b98eeeaa81
  Compiled from "AbstractOlympiadGame.java"
public abstract class ext.mods.gameserver.model.olympiad.AbstractOlympiadGame
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 40, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame._startTime:J
    #8 = Class              #10           // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
    #9 = NameAndType        #11:#12       // _startTime:J
   #10 = Utf8               ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
   #11 = Utf8               _startTime
   #12 = Utf8               J
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame._aborted:Z
   #14 = NameAndType        #15:#16       // _aborted:Z
   #15 = Utf8               _aborted
   #16 = Utf8               Z
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame._stadiumId:I
   #18 = NameAndType        #19:#20       // _stadiumId:I
   #19 = Utf8               _stadiumId
   #20 = Utf8               I
   #21 = Methodref          #22.#23       // java/lang/System.currentTimeMillis:()J
   #22 = Class              #24           // java/lang/System
   #23 = NameAndType        #25:#26       // currentTimeMillis:()J
   #24 = Utf8               java/lang/System
   #25 = Utf8               currentTimeMillis
   #26 = Utf8               ()J
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #28 = Class              #30           // ext/mods/gameserver/model/olympiad/Participant
   #29 = NameAndType        #31:#32       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = Utf8               ext/mods/gameserver/model/olympiad/Participant
   #31 = Utf8               getPlayer
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Player
   #35 = NameAndType        #37:#38       // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #36 = Utf8               ext/mods/gameserver/model/actor/Player
   #37 = Utf8               getMissions
   #38 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT:Lext/mods/gameserver/enums/actors/MissionType;
   #40 = Class              #42           // ext/mods/gameserver/enums/actors/MissionType
   #41 = NameAndType        #43:#44       // OLYMPIAD_FIGHT:Lext/mods/gameserver/enums/actors/MissionType;
   #42 = Utf8               ext/mods/gameserver/enums/actors/MissionType
   #43 = Utf8               OLYMPIAD_FIGHT
   #44 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
   #46 = Class              #48           // ext/mods/gameserver/model/actor/container/player/MissionList
   #47 = NameAndType        #49:#50       // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
   #48 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
   #49 = Utf8               update
   #50 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
   #51 = Fieldref           #40.#52       // ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT_WON:Lext/mods/gameserver/enums/actors/MissionType;
   #52 = NameAndType        #53:#44       // OLYMPIAD_FIGHT_WON:Lext/mods/gameserver/enums/actors/MissionType;
   #53 = Utf8               OLYMPIAD_FIGHT_WON
   #54 = String             #55           // olympiad_points
   #55 = Utf8               olympiad_points
   #56 = Methodref          #28.#57       // ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
   #57 = NameAndType        #58:#59       // updateStat:(Ljava/lang/String;I)V
   #58 = Utf8               updateStat
   #59 = Utf8               (Ljava/lang/String;I)V
   #60 = Fieldref           #61.#62       // ext/mods/gameserver/network/SystemMessageId.S1_HAS_GAINED_S2_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
   #61 = Class              #63           // ext/mods/gameserver/network/SystemMessageId
   #62 = NameAndType        #64:#65       // S1_HAS_GAINED_S2_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
   #63 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #64 = Utf8               S1_HAS_GAINED_S2_OLYMPIAD_POINTS
   #65 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #67 = Class              #69           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #68 = NameAndType        #70:#71       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #69 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #70 = Utf8               getSystemMessage
   #71 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #72 = Methodref          #28.#73       // ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
   #73 = NameAndType        #74:#75       // getName:()Ljava/lang/String;
   #74 = Utf8               getName
   #75 = Utf8               ()Ljava/lang/String;
   #76 = Methodref          #67.#77       // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #77 = NameAndType        #78:#79       // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #78 = Utf8               addString
   #79 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #80 = Methodref          #67.#81       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #81 = NameAndType        #82:#83       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #82 = Utf8               addNumber
   #83 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #84 = Methodref          #8.#85        // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #85 = NameAndType        #86:#87       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #86 = Utf8               broadcastPacket
   #87 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #88 = Fieldref           #40.#89       // ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT_LOST:Lext/mods/gameserver/enums/actors/MissionType;
   #89 = NameAndType        #90:#44       // OLYMPIAD_FIGHT_LOST:Lext/mods/gameserver/enums/actors/MissionType;
   #90 = Utf8               OLYMPIAD_FIGHT_LOST
   #91 = Fieldref           #61.#92       // ext/mods/gameserver/network/SystemMessageId.S1_HAS_LOST_S2_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
   #92 = NameAndType        #93:#65       // S1_HAS_LOST_S2_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
   #93 = Utf8               S1_HAS_LOST_S2_OLYMPIAD_POINTS
   #94 = Methodref          #34.#95       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #95 = NameAndType        #96:#97       // isOnline:()Z
   #96 = Utf8               isOnline
   #97 = Utf8               ()Z
   #98 = Fieldref           #61.#99       // ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_ENDS_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #99 = NameAndType        #100:#65      // THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_ENDS_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #100 = Utf8               THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_ENDS_THE_GAME
  #101 = Methodref          #34.#102      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #102 = NameAndType        #103:#104     // getClient:()Lext/mods/gameserver/network/GameClient;
  #103 = Utf8               getClient
  #104 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #105 = Methodref          #106.#107     // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #106 = Class              #108          // ext/mods/gameserver/network/GameClient
  #107 = NameAndType        #109:#97      // isDetached:()Z
  #108 = Utf8               ext/mods/gameserver/network/GameClient
  #109 = Utf8               isDetached
  #110 = Methodref          #34.#111      // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #111 = NameAndType        #112:#97      // isInObserverMode:()Z
  #112 = Utf8               isInObserverMode
  #113 = Fieldref           #61.#114      // ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #114 = NameAndType        #115:#65      // THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #115 = Utf8               THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME
  #116 = Methodref          #34.#117      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #117 = NameAndType        #118:#97      // isDead:()Z
  #118 = Utf8               isDead
  #119 = Fieldref           #61.#120      // ext/mods/gameserver/network/SystemMessageId.CANNOT_PARTICIPATE_OLYMPIAD_WHILE_DEAD:Lext/mods/gameserver/network/SystemMessageId;
  #120 = NameAndType        #121:#65      // CANNOT_PARTICIPATE_OLYMPIAD_WHILE_DEAD:Lext/mods/gameserver/network/SystemMessageId;
  #121 = Utf8               CANNOT_PARTICIPATE_OLYMPIAD_WHILE_DEAD
  #122 = Methodref          #34.#123      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #123 = NameAndType        #124:#125     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #124 = Utf8               sendPacket
  #125 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #126 = Methodref          #34.#127      // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
  #127 = NameAndType        #128:#97      // isSubClassActive:()Z
  #128 = Utf8               isSubClassActive
  #129 = Fieldref           #61.#130      // ext/mods/gameserver/network/SystemMessageId.SINCE_YOU_HAVE_CHANGED_YOUR_CLASS_INTO_A_SUB_JOB_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #130 = NameAndType        #131:#65      // SINCE_YOU_HAVE_CHANGED_YOUR_CLASS_INTO_A_SUB_JOB_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #131 = Utf8               SINCE_YOU_HAVE_CHANGED_YOUR_CLASS_INTO_A_SUB_JOB_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD
  #132 = Methodref          #34.#133      // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #133 = NameAndType        #134:#97      // isCursedWeaponEquipped:()Z
  #134 = Utf8               isCursedWeaponEquipped
  #135 = Fieldref           #61.#136      // ext/mods/gameserver/network/SystemMessageId.CANNOT_JOIN_OLYMPIAD_POSSESSING_S1:Lext/mods/gameserver/network/SystemMessageId;
  #136 = NameAndType        #137:#65      // CANNOT_JOIN_OLYMPIAD_POSSESSING_S1:Lext/mods/gameserver/network/SystemMessageId;
  #137 = Utf8               CANNOT_JOIN_OLYMPIAD_POSSESSING_S1
  #138 = Methodref          #34.#139      // ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
  #139 = NameAndType        #140:#141     // getCursedWeaponEquippedId:()I
  #140 = Utf8               getCursedWeaponEquippedId
  #141 = Utf8               ()I
  #142 = Methodref          #67.#143      // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #143 = NameAndType        #144:#83      // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #144 = Utf8               addItemName
  #145 = Methodref          #34.#146      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #146 = NameAndType        #124:#87      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #147 = Methodref          #34.#148      // ext/mods/gameserver/model/actor/Player.isOverweight:()Z
  #148 = NameAndType        #149:#97      // isOverweight:()Z
  #149 = Utf8               isOverweight
  #150 = Fieldref           #61.#151      // ext/mods/gameserver/network/SystemMessageId.SINCE_80_PERCENT_OR_MORE_OF_YOUR_INVENTORY_SLOTS_ARE_FULL_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #151 = NameAndType        #152:#65      // SINCE_80_PERCENT_OR_MORE_OF_YOUR_INVENTORY_SLOTS_ARE_FULL_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #152 = Utf8               SINCE_80_PERCENT_OR_MORE_OF_YOUR_INVENTORY_SLOTS_ARE_FULL_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD
  #153 = Methodref          #154.#155     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #154 = Class              #156          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #155 = NameAndType        #157:#158     // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #156 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #157 = Utf8               getInstance
  #158 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #159 = Methodref          #34.#160      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #160 = NameAndType        #161:#141     // getObjectId:()I
  #161 = Utf8               getObjectId
  #162 = Methodref          #154.#163     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
  #163 = NameAndType        #164:#165     // isPlayerParticipant:(I)Z
  #164 = Utf8               isPlayerParticipant
  #165 = Utf8               (I)Z
  #166 = Methodref          #167.#168     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #167 = Class              #169          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #168 = NameAndType        #157:#170     // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #169 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #170 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #171 = Methodref          #167.#163     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
  #172 = Methodref          #173.#174     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #173 = Class              #175          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #174 = NameAndType        #157:#176     // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #175 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #176 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #177 = Methodref          #173.#163     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
  #178 = Methodref          #179.#180     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #179 = Class              #181          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #180 = NameAndType        #157:#182     // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #181 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #182 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #183 = Methodref          #179.#163     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
  #184 = Methodref          #34.#185      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #185 = NameAndType        #186:#187     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #186 = Utf8               getSysString
  #187 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #188 = Methodref          #34.#189      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #189 = NameAndType        #190:#191     // sendMessage:(Ljava/lang/String;)V
  #190 = Utf8               sendMessage
  #191 = Utf8               (Ljava/lang/String;)V
  #192 = Methodref          #34.#193      // ext/mods/gameserver/model/actor/Player.getSavedLocation:()Lext/mods/gameserver/model/location/Location;
  #193 = NameAndType        #194:#195     // getSavedLocation:()Lext/mods/gameserver/model/location/Location;
  #194 = Utf8               getSavedLocation
  #195 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #196 = Methodref          #34.#197      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #197 = NameAndType        #198:#199     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #198 = Utf8               getPosition
  #199 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #200 = Methodref          #201.#202     // ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
  #201 = Class              #203          // ext/mods/gameserver/model/location/Location
  #202 = NameAndType        #204:#205     // set:(Lext/mods/gameserver/model/location/Location;)V
  #203 = Utf8               ext/mods/gameserver/model/location/Location
  #204 = Utf8               set
  #205 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #206 = Methodref          #34.#207      // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #207 = NameAndType        #208:#209     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #208 = Utf8               setTarget
  #209 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #210 = Methodref          #34.#211      // ext/mods/gameserver/model/actor/Player.setOlympiadGameId:(I)V
  #211 = NameAndType        #212:#213     // setOlympiadGameId:(I)V
  #212 = Utf8               setOlympiadGameId
  #213 = Utf8               (I)V
  #214 = Methodref          #34.#215      // ext/mods/gameserver/model/actor/Player.setOlympiadMode:(Z)V
  #215 = NameAndType        #216:#217     // setOlympiadMode:(Z)V
  #216 = Utf8               setOlympiadMode
  #217 = Utf8               (Z)V
  #218 = Methodref          #34.#219      // ext/mods/gameserver/model/actor/Player.setOlympiadStart:(Z)V
  #219 = NameAndType        #220:#217     // setOlympiadStart:(Z)V
  #220 = Utf8               setOlympiadStart
  #221 = Methodref          #28.#222      // ext/mods/gameserver/model/olympiad/Participant.getSide:()I
  #222 = NameAndType        #223:#141     // getSide:()I
  #223 = Utf8               getSide
  #224 = Methodref          #34.#225      // ext/mods/gameserver/model/actor/Player.setOlympiadSide:(I)V
  #225 = NameAndType        #226:#213     // setOlympiadSide:(I)V
  #226 = Utf8               setOlympiadSide
  #227 = Methodref          #34.#228      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #228 = NameAndType        #229:#230     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #229 = Utf8               teleportTo
  #230 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #231 = Class              #232          // ext/mods/gameserver/network/serverpackets/ExOlympiadMode
  #232 = Utf8               ext/mods/gameserver/network/serverpackets/ExOlympiadMode
  #233 = Methodref          #231.#234     // ext/mods/gameserver/network/serverpackets/ExOlympiadMode."<init>":(I)V
  #234 = NameAndType        #5:#213       // "<init>":(I)V
  #235 = Methodref          #34.#236      // ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #236 = NameAndType        #237:#6       // stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #237 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
  #238 = Methodref          #34.#239      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #239 = NameAndType        #240:#241     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #240 = Utf8               getClan
  #241 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #242 = Methodref          #243.#244     // ext/mods/gameserver/model/pledge/Clan.getClanSkills:()Ljava/util/Map;
  #243 = Class              #245          // ext/mods/gameserver/model/pledge/Clan
  #244 = NameAndType        #246:#247     // getClanSkills:()Ljava/util/Map;
  #245 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #246 = Utf8               getClanSkills
  #247 = Utf8               ()Ljava/util/Map;
  #248 = InterfaceMethodref #249.#250     // java/util/Map.values:()Ljava/util/Collection;
  #249 = Class              #251          // java/util/Map
  #250 = NameAndType        #252:#253     // values:()Ljava/util/Collection;
  #251 = Utf8               java/util/Map
  #252 = Utf8               values
  #253 = Utf8               ()Ljava/util/Collection;
  #254 = InterfaceMethodref #255.#256     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #255 = Class              #257          // java/util/Collection
  #256 = NameAndType        #258:#259     // iterator:()Ljava/util/Iterator;
  #257 = Utf8               java/util/Collection
  #258 = Utf8               iterator
  #259 = Utf8               ()Ljava/util/Iterator;
  #260 = InterfaceMethodref #261.#262     // java/util/Iterator.hasNext:()Z
  #261 = Class              #263          // java/util/Iterator
  #262 = NameAndType        #264:#97      // hasNext:()Z
  #263 = Utf8               java/util/Iterator
  #264 = Utf8               hasNext
  #265 = InterfaceMethodref #261.#266     // java/util/Iterator.next:()Ljava/lang/Object;
  #266 = NameAndType        #267:#268     // next:()Ljava/lang/Object;
  #267 = Utf8               next
  #268 = Utf8               ()Ljava/lang/Object;
  #269 = Class              #270          // ext/mods/gameserver/skills/L2Skill
  #270 = Utf8               ext/mods/gameserver/skills/L2Skill
  #271 = Methodref          #269.#272     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #272 = NameAndType        #273:#141     // getId:()I
  #273 = Utf8               getId
  #274 = Methodref          #34.#275      // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #275 = NameAndType        #276:#277     // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #276 = Utf8               removeSkill
  #277 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
  #278 = Methodref          #34.#279      // ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
  #279 = NameAndType        #280:#217     // abortAll:(Z)V
  #280 = Utf8               abortAll
  #281 = Methodref          #34.#282      // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #282 = NameAndType        #283:#284     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #283 = Utf8               getAppearance
  #284 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #285 = Methodref          #286.#287     // ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
  #286 = Class              #288          // ext/mods/gameserver/model/actor/container/player/Appearance
  #287 = NameAndType        #289:#217     // setVisible:(Z)V
  #288 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #289 = Utf8               setVisible
  #290 = Methodref          #34.#291      // ext/mods/gameserver/model/actor/Player.isHero:()Z
  #291 = NameAndType        #292:#97      // isHero:()Z
  #292 = Utf8               isHero
  #293 = Methodref          #294.#295     // ext/mods/gameserver/data/SkillTable.getHeroSkills:()[Lext/mods/gameserver/skills/L2Skill;
  #294 = Class              #296          // ext/mods/gameserver/data/SkillTable
  #295 = NameAndType        #297:#298     // getHeroSkills:()[Lext/mods/gameserver/skills/L2Skill;
  #296 = Utf8               ext/mods/gameserver/data/SkillTable
  #297 = Utf8               getHeroSkills
  #298 = Utf8               ()[Lext/mods/gameserver/skills/L2Skill;
  #299 = Methodref          #34.#300      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #300 = NameAndType        #301:#302     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #301 = Utf8               getStatus
  #302 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #303 = Methodref          #304.#305     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
  #304 = Class              #306          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #305 = NameAndType        #307:#6       // setMaxCpHpMp:()V
  #306 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #307 = Utf8               setMaxCpHpMp
  #308 = Methodref          #34.#309      // ext/mods/gameserver/model/actor/Player.isMounted:()Z
  #309 = NameAndType        #310:#97      // isMounted:()Z
  #310 = Utf8               isMounted
  #311 = Methodref          #34.#312      // ext/mods/gameserver/model/actor/Player.dismount:()V
  #312 = NameAndType        #313:#6       // dismount:()V
  #313 = Utf8               dismount
  #314 = Methodref          #34.#315      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #315 = NameAndType        #316:#317     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #316 = Utf8               getSummon
  #317 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #318 = Class              #319          // ext/mods/gameserver/model/actor/instance/Pet
  #319 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #320 = Methodref          #321.#322     // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #321 = Class              #323          // ext/mods/gameserver/model/actor/Summon
  #322 = NameAndType        #324:#325     // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #323 = Utf8               ext/mods/gameserver/model/actor/Summon
  #324 = Utf8               unSummon
  #325 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #326 = Methodref          #321.#236     // ext/mods/gameserver/model/actor/Summon.stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #327 = Methodref          #321.#279     // ext/mods/gameserver/model/actor/Summon.abortAll:(Z)V
  #328 = Methodref          #34.#329      // ext/mods/gameserver/model/actor/Player.getCubicList:()Lext/mods/gameserver/model/actor/container/player/CubicList;
  #329 = NameAndType        #330:#331     // getCubicList:()Lext/mods/gameserver/model/actor/container/player/CubicList;
  #330 = Utf8               getCubicList
  #331 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/CubicList;
  #332 = Methodref          #333.#334     // ext/mods/gameserver/model/actor/container/player/CubicList.stopCubicsGivenByOthers:()V
  #333 = Class              #335          // ext/mods/gameserver/model/actor/container/player/CubicList
  #334 = NameAndType        #336:#6       // stopCubicsGivenByOthers:()V
  #335 = Utf8               ext/mods/gameserver/model/actor/container/player/CubicList
  #336 = Utf8               stopCubicsGivenByOthers
  #337 = Methodref          #34.#338      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #338 = NameAndType        #339:#340     // getParty:()Lext/mods/gameserver/model/group/Party;
  #339 = Utf8               getParty
  #340 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #341 = Fieldref           #342.#343     // ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #342 = Class              #344          // ext/mods/gameserver/enums/MessageType
  #343 = NameAndType        #345:#346     // EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #344 = Utf8               ext/mods/gameserver/enums/MessageType
  #345 = Utf8               EXPELLED
  #346 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #347 = Methodref          #348.#349     // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #348 = Class              #350          // ext/mods/gameserver/model/group/Party
  #349 = NameAndType        #351:#352     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #350 = Utf8               ext/mods/gameserver/model/group/Party
  #351 = Utf8               removePartyMember
  #352 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #353 = Methodref          #34.#354      // ext/mods/gameserver/model/actor/Player.checkItemRestriction:()V
  #354 = NameAndType        #355:#6       // checkItemRestriction:()V
  #355 = Utf8               checkItemRestriction
  #356 = Methodref          #34.#357      // ext/mods/gameserver/model/actor/Player.disableAutoShotsAll:()V
  #357 = NameAndType        #358:#6       // disableAutoShotsAll:()V
  #358 = Utf8               disableAutoShotsAll
  #359 = Methodref          #34.#360      // ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #360 = NameAndType        #361:#362     // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #361 = Utf8               getActiveWeaponInstance
  #362 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #363 = Methodref          #364.#365     // ext/mods/gameserver/model/item/instance/ItemInstance.unChargeAllShots:()V
  #364 = Class              #366          // ext/mods/gameserver/model/item/instance/ItemInstance
  #365 = NameAndType        #367:#6       // unChargeAllShots:()V
  #366 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #367 = Utf8               unChargeAllShots
  #368 = Class              #369          // ext/mods/gameserver/network/serverpackets/SkillList
  #369 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
  #370 = Methodref          #368.#371     // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #371 = NameAndType        #5:#325       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #372 = Methodref          #294.#373     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #373 = NameAndType        #157:#374     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #374 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #375 = Methodref          #294.#376     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #376 = NameAndType        #377:#378     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #377 = Utf8               getInfo
  #378 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #379 = Methodref          #269.#380     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #380 = NameAndType        #381:#382     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #381 = Utf8               getEffects
  #382 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #383 = Methodref          #34.#384      // ext/mods/gameserver/model/actor/Player.isMageClass:()Z
  #384 = NameAndType        #385:#97      // isMageClass:()Z
  #385 = Utf8               isMageClass
  #386 = Methodref          #34.#387      // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #387 = NameAndType        #388:#389     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #388 = Utf8               getAI
  #389 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #390 = Methodref          #391.#392     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
  #391 = Class              #393          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #392 = NameAndType        #394:#6       // tryToIdle:()V
  #393 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #394 = Utf8               tryToIdle
  #395 = Methodref          #34.#396      // ext/mods/gameserver/model/actor/Player.setIsDead:(Z)V
  #396 = NameAndType        #397:#217     // setIsDead:(Z)V
  #397 = Utf8               setIsDead
  #398 = Methodref          #321.#117     // ext/mods/gameserver/model/actor/Summon.isDead:()Z
  #399 = Methodref          #321.#400     // ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #400 = NameAndType        #388:#401     // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #401 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #402 = Methodref          #403.#392     // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
  #403 = Class              #404          // ext/mods/gameserver/model/actor/ai/type/SummonAI
  #404 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
  #405 = Methodref          #304.#406     // ext/mods/gameserver/model/actor/status/PlayerStatus.startHpMpRegeneration:()V
  #406 = NameAndType        #407:#6       // startHpMpRegeneration:()V
  #407 = Utf8               startHpMpRegeneration
  #408 = Methodref          #34.#409      // ext/mods/gameserver/model/actor/Player.clearCharges:()V
  #409 = NameAndType        #410:#6       // clearCharges:()V
  #410 = Utf8               clearCharges
  #411 = Methodref          #243.#412     // ext/mods/gameserver/model/pledge/Clan.checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
  #412 = NameAndType        #413:#414     // checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
  #413 = Utf8               checkAndAddClanSkills
  #414 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #415 = Fieldref           #416.#417     // ext/mods/Config.DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
  #416 = Class              #418          // ext/mods/Config
  #417 = NameAndType        #419:#20      // DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
  #418 = Utf8               ext/mods/Config
  #419 = Utf8               DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP
  #420 = Methodref          #421.#422     // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #421 = Class              #423          // ext/mods/gameserver/data/manager/AntiFeedManager
  #422 = NameAndType        #157:#424     // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #423 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
  #424 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #425 = Methodref          #421.#426     // ext/mods/gameserver/data/manager/AntiFeedManager.removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
  #426 = NameAndType        #427:#428     // removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
  #427 = Utf8               removePlayer
  #428 = Utf8               (ILext/mods/gameserver/model/actor/Player;)Z
  #429 = Methodref          #34.#430      // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #430 = NameAndType        #431:#432     // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #431 = Utf8               addSkill
  #432 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
  #433 = Fieldref           #201.#434     // ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
  #434 = NameAndType        #435:#436     // DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
  #435 = Utf8               DUMMY_LOC
  #436 = Utf8               Lext/mods/gameserver/model/location/Location;
  #437 = Methodref          #201.#438     // ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
  #438 = NameAndType        #439:#440     // equals:(Ljava/lang/Object;)Z
  #439 = Utf8               equals
  #440 = Utf8               (Ljava/lang/Object;)Z
  #441 = Methodref          #201.#442     // ext/mods/gameserver/model/location/Location.clean:()V
  #442 = NameAndType        #443:#6       // clean:()V
  #443 = Utf8               clean
  #444 = Fieldref           #8.#445       // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.GIRAN_LOC:Lext/mods/gameserver/model/location/Location;
  #445 = NameAndType        #446:#436     // GIRAN_LOC:Lext/mods/gameserver/model/location/Location;
  #446 = Utf8               GIRAN_LOC
  #447 = Methodref          #201.#448     // ext/mods/gameserver/model/location/Location.getX:()I
  #448 = NameAndType        #449:#141     // getX:()I
  #449 = Utf8               getX
  #450 = Methodref          #201.#451     // ext/mods/gameserver/model/location/Location.getY:()I
  #451 = NameAndType        #452:#141     // getY:()I
  #452 = Utf8               getY
  #453 = Methodref          #201.#454     // ext/mods/gameserver/model/location/Location.getZ:()I
  #454 = NameAndType        #455:#141     // getZ:()I
  #455 = Utf8               getZ
  #456 = Methodref          #201.#457     // ext/mods/gameserver/model/location/Location.set:(III)V
  #457 = NameAndType        #204:#458     // set:(III)V
  #458 = Utf8               (III)V
  #459 = Methodref          #34.#460      // ext/mods/gameserver/model/actor/Player.storeCharBase:()V
  #460 = NameAndType        #461:#6       // storeCharBase:()V
  #461 = Utf8               storeCharBase
  #462 = Methodref          #463.#464     // ext/mods/commons/util/ArraysUtil.isEmpty:([Ljava/lang/Object;)Z
  #463 = Class              #465          // ext/mods/commons/util/ArraysUtil
  #464 = NameAndType        #466:#467     // isEmpty:([Ljava/lang/Object;)Z
  #465 = Utf8               ext/mods/commons/util/ArraysUtil
  #466 = Utf8               isEmpty
  #467 = Utf8               ([Ljava/lang/Object;)Z
  #468 = Methodref          #34.#469      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #469 = NameAndType        #470:#471     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #470 = Utf8               getInventory
  #471 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #472 = Methodref          #473.#272     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #473 = Class              #474          // ext/mods/gameserver/model/holder/IntIntHolder
  #474 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #475 = Methodref          #473.#476     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #476 = NameAndType        #477:#141     // getValue:()I
  #477 = Utf8               getValue
  #478 = Methodref          #479.#480     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #479 = Class              #481          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #480 = NameAndType        #482:#483     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #481 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #482 = Utf8               addItem
  #483 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #484 = Fieldref           #61.#485      // ext/mods/gameserver/network/SystemMessageId.EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #485 = NameAndType        #486:#65      // EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #486 = Utf8               EARNED_S2_S1_S
  #487 = Class              #488          // ext/mods/commons/logging/CLogger
  #488 = Utf8               ext/mods/commons/logging/CLogger
  #489 = Methodref          #490.#73      // java/lang/Class.getName:()Ljava/lang/String;
  #490 = Class              #491          // java/lang/Class
  #491 = Utf8               java/lang/Class
  #492 = Methodref          #487.#493     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #493 = NameAndType        #5:#191       // "<init>":(Ljava/lang/String;)V
  #494 = Fieldref           #8.#495       // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.LOGGER:Lext/mods/commons/logging/CLogger;
  #495 = NameAndType        #496:#497     // LOGGER:Lext/mods/commons/logging/CLogger;
  #496 = Utf8               LOGGER
  #497 = Utf8               Lext/mods/commons/logging/CLogger;
  #498 = Integer            83314
  #499 = Integer            148012
  #500 = Methodref          #201.#501     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #501 = NameAndType        #5:#458       // "<init>":(III)V
  #502 = Utf8               POINTS
  #503 = Utf8               Ljava/lang/String;
  #504 = Utf8               ConstantValue
  #505 = Utf8               COMP_DONE
  #506 = String             #507          // competitions_done
  #507 = Utf8               competitions_done
  #508 = Utf8               COMP_WON
  #509 = String             #510          // competitions_won
  #510 = Utf8               competitions_won
  #511 = Utf8               COMP_LOST
  #512 = String             #513          // competitions_lost
  #513 = Utf8               competitions_lost
  #514 = Utf8               COMP_DRAWN
  #515 = String             #516          // competitions_drawn
  #516 = Utf8               competitions_drawn
  #517 = Utf8               Code
  #518 = Utf8               LineNumberTable
  #519 = Utf8               LocalVariableTable
  #520 = Utf8               this
  #521 = Utf8               Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #522 = Utf8               id
  #523 = Utf8               getType
  #524 = Utf8               ()Lext/mods/gameserver/enums/OlympiadType;
  #525 = Utf8               getPlayerNames
  #526 = Utf8               ()[Ljava/lang/String;
  #527 = Utf8               containsParticipant
  #528 = Utf8               sendOlympiadInfo
  #529 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #530 = Utf8               broadcastOlympiadInfo
  #531 = Utf8               (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
  #532 = Utf8               checkDefection
  #533 = Utf8               removals
  #534 = Utf8               buffPlayers
  #535 = Utf8               healPlayers
  #536 = Utf8               portPlayersToArena
  #537 = Utf8               (Ljava/util/List;)Z
  #538 = Utf8               Signature
  #539 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Z
  #540 = Utf8               cleanEffects
  #541 = Utf8               portPlayersBack
  #542 = Utf8               playersStatusBack
  #543 = Utf8               clearPlayers
  #544 = Utf8               handleDisconnect
  #545 = Utf8               resetDamage
  #546 = Utf8               addDamage
  #547 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #548 = Utf8               checkBattleStatus
  #549 = Utf8               haveWinner
  #550 = Utf8               validateWinner
  #551 = Utf8               getDivider
  #552 = Utf8               getReward
  #553 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #554 = Utf8               isAborted
  #555 = Utf8               getStadiumId
  #556 = Utf8               makeCompetitionStart
  #557 = Utf8               StackMapTable
  #558 = Utf8               addPointsToParticipant
  #559 = Utf8               (Lext/mods/gameserver/model/olympiad/Participant;I)V
  #560 = Utf8               par
  #561 = Utf8               Lext/mods/gameserver/model/olympiad/Participant;
  #562 = Utf8               points
  #563 = Utf8               removePointsFromParticipant
  #564 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #565 = Utf8               player
  #566 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #567 = Utf8               portPlayerToArena
  #568 = Utf8               (Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/location/Location;I)Z
  #569 = Utf8               loc
  #570 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #571 = Utf8               skill
  #572 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #573 = Utf8               summon
  #574 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #575 = Utf8               party
  #576 = Utf8               Lext/mods/gameserver/model/group/Party;
  #577 = Utf8               removeParty
  #578 = Utf8               clan
  #579 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #580 = Utf8               item
  #581 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #582 = Class              #583          // "[Lext/mods/gameserver/skills/L2Skill;"
  #583 = Utf8               [Lext/mods/gameserver/skills/L2Skill;
  #584 = Utf8               buffPlayer
  #585 = Utf8               playerStatusBack
  #586 = Utf8               portPlayerBack
  #587 = Utf8               setSavedLocationToGiran
  #588 = Utf8               portPlayerToGiranPersistent
  #589 = Utf8               rewardParticipant
  #590 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #591 = Utf8               it
  #592 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #593 = Utf8               reward
  #594 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #595 = Class              #594          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #596 = Utf8               <clinit>
  #597 = Utf8               SourceFile
  #598 = Utf8               AbstractOlympiadGame.java
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected static final java.lang.String POINTS;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String olympiad_points

  protected static final java.lang.String COMP_DONE;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String competitions_done

  protected static final java.lang.String COMP_WON;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String competitions_won

  protected static final java.lang.String COMP_LOST;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String competitions_lost

  protected static final java.lang.String COMP_DRAWN;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String competitions_drawn

  protected final int _stadiumId;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected long _startTime;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected boolean _aborted;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.olympiad.AbstractOlympiadGame(int);
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: lconst_0
         6: putfield      #7                  // Field _startTime:J
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field _aborted:Z
        14: aload_0
        15: iload_1
        16: putfield      #17                 // Field _stadiumId:I
        19: return
      LineNumberTable:
        line 71: 0
        line 67: 4
        line 68: 9
        line 72: 14
        line 73: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
            0      20     1    id   I

  public abstract ext.mods.gameserver.enums.OlympiadType getType();
    descriptor: ()Lext/mods/gameserver/enums/OlympiadType;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.lang.String[] getPlayerNames();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean containsParticipant(int);
    descriptor: (I)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void sendOlympiadInfo(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void broadcastOlympiadInfo(ext.mods.gameserver.model.zone.type.OlympiadStadiumZone);
    descriptor: (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  protected abstract void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract boolean checkDefection();
    descriptor: ()Z
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void removals();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void buffPlayers();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void healPlayers();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract boolean portPlayersToArena(java.util.List<ext.mods.gameserver.model.location.Location>);
    descriptor: (Ljava/util/List;)Z
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT
    Signature: #539                         // (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Z

  protected abstract void cleanEffects();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void portPlayersBack();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void playersStatusBack();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void clearPlayers();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void handleDisconnect(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void resetDamage();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void addDamage(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract boolean checkBattleStatus();
    descriptor: ()Z
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract boolean haveWinner();
    descriptor: ()Z
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void validateWinner(ext.mods.gameserver.model.zone.type.OlympiadStadiumZone);
    descriptor: (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract int getDivider();
    descriptor: ()I
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract ext.mods.gameserver.model.holder.IntIntHolder[] getReward();
    descriptor: ()[Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  public final boolean isAborted();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _aborted:Z
         4: ireturn
      LineNumberTable:
        line 201: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;

  public final int getStadiumId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _stadiumId:I
         4: ireturn
      LineNumberTable:
        line 206: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;

  protected boolean makeCompetitionStart();
    descriptor: ()Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #21                 // Method java/lang/System.currentTimeMillis:()J
         4: putfield      #7                  // Field _startTime:J
         7: aload_0
         8: getfield      #13                 // Field _aborted:Z
        11: ifne          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 211: 0
        line 212: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected final void addPointsToParticipant(ext.mods.gameserver.model.olympiad.Participant, int);
    descriptor: (Lext/mods/gameserver/model/olympiad/Participant;I)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: invokevirtual #27                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: ifnull        33
         7: aload_1
         8: invokevirtual #27                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        14: getstatic     #39                 // Field ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT:Lext/mods/gameserver/enums/actors/MissionType;
        17: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
        20: aload_1
        21: invokevirtual #27                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        27: getstatic     #51                 // Field ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT_WON:Lext/mods/gameserver/enums/actors/MissionType;
        30: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
        33: aload_1
        34: ldc           #54                 // String olympiad_points
        36: iload_2
        37: invokevirtual #56                 // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
        40: aload_0
        41: getstatic     #60                 // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_GAINED_S2_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
        44: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        47: aload_1
        48: invokevirtual #72                 // Method ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
        51: invokevirtual #76                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        54: iload_2
        55: invokevirtual #80                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        58: invokevirtual #84                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        61: return
      LineNumberTable:
        line 217: 0
        line 219: 7
        line 220: 20
        line 223: 33
        line 225: 40
        line 226: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
            0      62     1   par   Lext/mods/gameserver/model/olympiad/Participant;
            0      62     2 points   I
      StackMapTable: number_of_entries = 1
        frame_type = 33 /* same */

  protected final void removePointsFromParticipant(ext.mods.gameserver.model.olympiad.Participant, int);
    descriptor: (Lext/mods/gameserver/model/olympiad/Participant;I)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: invokevirtual #27                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: ifnull        33
         7: aload_1
         8: invokevirtual #27                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        14: getstatic     #39                 // Field ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT:Lext/mods/gameserver/enums/actors/MissionType;
        17: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
        20: aload_1
        21: invokevirtual #27                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        27: getstatic     #88                 // Field ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT_LOST:Lext/mods/gameserver/enums/actors/MissionType;
        30: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
        33: aload_1
        34: ldc           #54                 // String olympiad_points
        36: iload_2
        37: ineg
        38: invokevirtual #56                 // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
        41: aload_0
        42: getstatic     #91                 // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_LOST_S2_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
        45: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        48: aload_1
        49: invokevirtual #72                 // Method ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
        52: invokevirtual #76                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        55: iload_2
        56: invokevirtual #80                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        59: invokevirtual #84                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        62: return
      LineNumberTable:
        line 230: 0
        line 232: 7
        line 233: 20
        line 236: 33
        line 238: 41
        line 239: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
            0      63     1   par   Lext/mods/gameserver/model/olympiad/Participant;
            0      63     2 points   I
      StackMapTable: number_of_entries = 1
        frame_type = 33 /* same */

  protected static ext.mods.gameserver.network.serverpackets.SystemMessage checkDefection(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: ifnull        11
         4: aload_0
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
         8: ifne          18
        11: getstatic     #98                 // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_ENDS_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        14: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        17: areturn
        18: aload_0
        19: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        22: ifnull        35
        25: aload_0
        26: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        29: invokevirtual #105                // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        32: ifeq          42
        35: getstatic     #98                 // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_ENDS_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        38: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        41: areturn
        42: aload_0
        43: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        46: ifeq          56
        49: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        52: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        55: areturn
        56: aload_0
        57: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        60: ifeq          77
        63: aload_0
        64: getstatic     #119                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_PARTICIPATE_OLYMPIAD_WHILE_DEAD:Lext/mods/gameserver/network/SystemMessageId;
        67: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        70: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        73: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        76: areturn
        77: aload_0
        78: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
        81: ifeq          98
        84: aload_0
        85: getstatic     #129                // Field ext/mods/gameserver/network/SystemMessageId.SINCE_YOU_HAVE_CHANGED_YOUR_CLASS_INTO_A_SUB_JOB_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
        88: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        91: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        94: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        97: areturn
        98: aload_0
        99: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       102: ifeq          129
       105: aload_0
       106: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_JOIN_OLYMPIAD_POSSESSING_S1:Lext/mods/gameserver/network/SystemMessageId;
       109: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       112: aload_0
       113: invokevirtual #138                // Method ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
       116: invokevirtual #142                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       119: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       122: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
       125: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       128: areturn
       129: aload_0
       130: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.isOverweight:()Z
       133: ifeq          150
       136: aload_0
       137: getstatic     #150                // Field ext/mods/gameserver/network/SystemMessageId.SINCE_80_PERCENT_OR_MORE_OF_YOUR_INVENTORY_SLOTS_ARE_FULL_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
       140: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       143: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
       146: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       149: areturn
       150: invokestatic  #153                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       153: aload_0
       154: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       157: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
       160: ifne          202
       163: invokestatic  #166                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       166: aload_0
       167: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       170: invokevirtual #171                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
       173: ifne          202
       176: invokestatic  #172                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       179: aload_0
       180: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       183: invokevirtual #177                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
       186: ifne          202
       189: invokestatic  #178                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       192: aload_0
       193: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       196: invokevirtual #183                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
       199: ifeq          224
       202: aload_0
       203: aload_0
       204: sipush        10103
       207: iconst_0
       208: anewarray     #2                  // class java/lang/Object
       211: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       214: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       217: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_HAS_BEEN_CANCELLED_BECAUSE_THE_OTHER_PARTY_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_JOINING_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
       220: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       223: areturn
       224: aconst_null
       225: areturn
      LineNumberTable:
        line 247: 0
        line 248: 11
        line 250: 18
        line 251: 35
        line 253: 42
        line 254: 49
        line 256: 56
        line 258: 63
        line 259: 70
        line 262: 77
        line 264: 84
        line 265: 91
        line 268: 98
        line 270: 105
        line 271: 122
        line 274: 129
        line 276: 136
        line 277: 143
        line 280: 150
        line 282: 202
        line 283: 217
        line 286: 224
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     226     0 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 11
        frame_type = 11 /* same */
        frame_type = 6 /* same */
        frame_type = 16 /* same */
        frame_type = 6 /* same */
        frame_type = 13 /* same */
        frame_type = 20 /* same */
        frame_type = 20 /* same */
        frame_type = 30 /* same */
        frame_type = 20 /* same */
        frame_type = 51 /* same */
        frame_type = 21 /* same */

  protected static final boolean portPlayerToArena(ext.mods.gameserver.model.olympiad.Participant, ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/location/Location;I)Z
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: invokevirtual #27                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore_3
         5: aload_3
         6: ifnull        16
         9: aload_3
        10: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        13: ifne          18
        16: iconst_0
        17: ireturn
        18: aload_3
        19: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Player.getSavedLocation:()Lext/mods/gameserver/model/location/Location;
        22: aload_3
        23: invokevirtual #196                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        26: invokevirtual #200                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
        29: aload_3
        30: aconst_null
        31: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
        34: aload_3
        35: iload_2
        36: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.setOlympiadGameId:(I)V
        39: aload_3
        40: iconst_1
        41: invokevirtual #214                // Method ext/mods/gameserver/model/actor/Player.setOlympiadMode:(Z)V
        44: aload_3
        45: iconst_0
        46: invokevirtual #218                // Method ext/mods/gameserver/model/actor/Player.setOlympiadStart:(Z)V
        49: aload_3
        50: aload_0
        51: invokevirtual #221                // Method ext/mods/gameserver/model/olympiad/Participant.getSide:()I
        54: invokevirtual #224                // Method ext/mods/gameserver/model/actor/Player.setOlympiadSide:(I)V
        57: aload_3
        58: aload_1
        59: iconst_0
        60: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        63: aload_3
        64: new           #231                // class ext/mods/gameserver/network/serverpackets/ExOlympiadMode
        67: dup
        68: aload_0
        69: invokevirtual #221                // Method ext/mods/gameserver/model/olympiad/Participant.getSide:()I
        72: invokespecial #233                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadMode."<init>":(I)V
        75: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        78: iconst_1
        79: ireturn
      LineNumberTable:
        line 297: 0
        line 298: 5
        line 299: 16
        line 301: 18
        line 303: 29
        line 305: 34
        line 306: 39
        line 307: 44
        line 308: 49
        line 309: 57
        line 310: 63
        line 311: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0   par   Lext/mods/gameserver/model/olympiad/Participant;
            0      80     1   loc   Lext/mods/gameserver/model/location/Location;
            0      80     2    id   I
            5      75     3 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 1 /* same */

  protected static final void removals(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: ifnonnull     5
         4: return
         5: aload_0
         6: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
         9: aload_0
        10: invokevirtual #238                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        13: astore_2
        14: aload_2
        15: ifnull        67
        18: aload_2
        19: invokevirtual #242                // Method ext/mods/gameserver/model/pledge/Clan.getClanSkills:()Ljava/util/Map;
        22: invokeinterface #248,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        27: invokeinterface #254,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        32: astore_3
        33: aload_3
        34: invokeinterface #260,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        39: ifeq          67
        42: aload_3
        43: invokeinterface #265,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        48: checkcast     #269                // class ext/mods/gameserver/skills/L2Skill
        51: astore        4
        53: aload_0
        54: aload         4
        56: invokevirtual #271                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        59: iconst_0
        60: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
        63: pop
        64: goto          33
        67: aload_0
        68: iconst_1
        69: invokevirtual #278                // Method ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
        72: aload_0
        73: invokevirtual #281                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        76: iconst_1
        77: invokevirtual #285                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
        80: aload_0
        81: invokevirtual #290                // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
        84: ifeq          128
        87: invokestatic  #293                // Method ext/mods/gameserver/data/SkillTable.getHeroSkills:()[Lext/mods/gameserver/skills/L2Skill;
        90: astore_3
        91: aload_3
        92: arraylength
        93: istore        4
        95: iconst_0
        96: istore        5
        98: iload         5
       100: iload         4
       102: if_icmpge     128
       105: aload_3
       106: iload         5
       108: aaload
       109: astore        6
       111: aload_0
       112: aload         6
       114: invokevirtual #271                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       117: iconst_0
       118: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       121: pop
       122: iinc          5, 1
       125: goto          98
       128: aload_0
       129: invokevirtual #299                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       132: invokevirtual #303                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
       135: aload_0
       136: invokevirtual #308                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
       139: ifeq          149
       142: aload_0
       143: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.dismount:()V
       146: goto          182
       149: aload_0
       150: invokevirtual #314                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       153: astore_3
       154: aload_3
       155: ifnull        182
       158: aload_3
       159: instanceof    #318                // class ext/mods/gameserver/model/actor/instance/Pet
       162: ifeq          173
       165: aload_3
       166: aload_0
       167: invokevirtual #320                // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
       170: goto          182
       173: aload_3
       174: invokevirtual #326                // Method ext/mods/gameserver/model/actor/Summon.stopAllEffectsExceptThoseThatLastThroughDeath:()V
       177: aload_3
       178: iconst_1
       179: invokevirtual #327                // Method ext/mods/gameserver/model/actor/Summon.abortAll:(Z)V
       182: aload_0
       183: invokevirtual #328                // Method ext/mods/gameserver/model/actor/Player.getCubicList:()Lext/mods/gameserver/model/actor/container/player/CubicList;
       186: invokevirtual #332                // Method ext/mods/gameserver/model/actor/container/player/CubicList.stopCubicsGivenByOthers:()V
       189: iload_1
       190: ifeq          210
       193: aload_0
       194: invokevirtual #337                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       197: astore_3
       198: aload_3
       199: ifnull        210
       202: aload_3
       203: aload_0
       204: getstatic     #341                // Field ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
       207: invokevirtual #347                // Method ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
       210: aload_0
       211: invokevirtual #353                // Method ext/mods/gameserver/model/actor/Player.checkItemRestriction:()V
       214: aload_0
       215: invokevirtual #356                // Method ext/mods/gameserver/model/actor/Player.disableAutoShotsAll:()V
       218: aload_0
       219: invokevirtual #359                // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
       222: astore_3
       223: aload_3
       224: ifnull        231
       227: aload_3
       228: invokevirtual #363                // Method ext/mods/gameserver/model/item/instance/ItemInstance.unChargeAllShots:()V
       231: aload_0
       232: new           #368                // class ext/mods/gameserver/network/serverpackets/SkillList
       235: dup
       236: aload_0
       237: invokespecial #370                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       240: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       243: return
      LineNumberTable:
        line 321: 0
        line 322: 4
        line 324: 5
        line 326: 9
        line 327: 14
        line 329: 18
        line 330: 53
        line 333: 67
        line 335: 72
        line 337: 80
        line 339: 87
        line 340: 111
        line 339: 122
        line 343: 128
        line 345: 135
        line 346: 142
        line 349: 149
        line 350: 154
        line 352: 158
        line 353: 165
        line 356: 173
        line 357: 177
        line 362: 182
        line 364: 189
        line 366: 193
        line 367: 198
        line 368: 202
        line 371: 210
        line 373: 214
        line 375: 218
        line 376: 223
        line 377: 227
        line 379: 231
        line 380: 243
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      11     4 skill   Lext/mods/gameserver/skills/L2Skill;
          111      11     6 skill   Lext/mods/gameserver/skills/L2Skill;
          154      28     3 summon   Lext/mods/gameserver/model/actor/Summon;
          198      12     3 party   Lext/mods/gameserver/model/group/Party;
            0     244     0 player   Lext/mods/gameserver/model/actor/Player;
            0     244     1 removeParty   Z
           14     230     2  clan   Lext/mods/gameserver/model/pledge/Clan;
          223      21     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 10
        frame_type = 5 /* same */
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 33
        frame_type = 254 /* append */
          offset_delta = 30
          locals = [ class "[Lext/mods/gameserver/skills/L2Skill;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 29
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  protected static final void buffPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=1
         0: invokestatic  #372                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: sipush        1204
         6: iconst_2
         7: invokevirtual #375                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        10: astore_1
        11: aload_1
        12: ifnull        22
        15: aload_1
        16: aload_0
        17: aload_0
        18: invokevirtual #379                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        21: pop
        22: aload_0
        23: invokevirtual #383                // Method ext/mods/gameserver/model/actor/Player.isMageClass:()Z
        26: ifne          51
        29: invokestatic  #372                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        32: sipush        1086
        35: iconst_1
        36: invokevirtual #375                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        39: astore_1
        40: aload_1
        41: ifnull        51
        44: aload_1
        45: aload_0
        46: aload_0
        47: invokevirtual #379                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        50: pop
        51: return
      LineNumberTable:
        line 388: 0
        line 389: 11
        line 390: 15
        line 392: 22
        line 394: 29
        line 395: 40
        line 396: 44
        line 398: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0 player   Lext/mods/gameserver/model/actor/Player;
           11      41     1 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 28 /* same */

  protected static final void cleanEffects(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: iconst_0
         2: invokevirtual #218                // Method ext/mods/gameserver/model/actor/Player.setOlympiadStart:(Z)V
         5: aload_0
         6: iconst_1
         7: invokevirtual #278                // Method ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
        10: aload_0
        11: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        14: invokevirtual #390                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
        17: aload_0
        18: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        21: ifeq          29
        24: aload_0
        25: iconst_0
        26: invokevirtual #395                // Method ext/mods/gameserver/model/actor/Player.setIsDead:(Z)V
        29: aload_0
        30: invokevirtual #314                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        33: astore_1
        34: aload_1
        35: ifnull        57
        38: aload_1
        39: invokevirtual #398                // Method ext/mods/gameserver/model/actor/Summon.isDead:()Z
        42: ifne          57
        45: aload_1
        46: iconst_1
        47: invokevirtual #327                // Method ext/mods/gameserver/model/actor/Summon.abortAll:(Z)V
        50: aload_1
        51: invokevirtual #399                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
        54: invokevirtual #402                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
        57: aload_0
        58: invokevirtual #299                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        61: invokevirtual #303                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
        64: aload_0
        65: invokevirtual #299                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        68: invokevirtual #405                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.startHpMpRegeneration:()V
        71: return
      LineNumberTable:
        line 406: 0
        line 407: 5
        line 408: 10
        line 410: 17
        line 411: 24
        line 413: 29
        line 414: 34
        line 416: 45
        line 417: 50
        line 420: 57
        line 421: 64
        line 422: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0 player   Lext/mods/gameserver/model/actor/Player;
           34      38     1 summon   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/Summon ]

  protected static final void playerStatusBack(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=6, args_size=1
         0: aload_0
         1: iconst_0
         2: invokevirtual #214                // Method ext/mods/gameserver/model/actor/Player.setOlympiadMode:(Z)V
         5: aload_0
         6: iconst_0
         7: invokevirtual #218                // Method ext/mods/gameserver/model/actor/Player.setOlympiadStart:(Z)V
        10: aload_0
        11: iconst_m1
        12: invokevirtual #224                // Method ext/mods/gameserver/model/actor/Player.setOlympiadSide:(I)V
        15: aload_0
        16: iconst_m1
        17: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.setOlympiadGameId:(I)V
        20: aload_0
        21: new           #231                // class ext/mods/gameserver/network/serverpackets/ExOlympiadMode
        24: dup
        25: iconst_0
        26: invokespecial #233                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadMode."<init>":(I)V
        29: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        32: aload_0
        33: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
        36: aload_0
        37: invokevirtual #408                // Method ext/mods/gameserver/model/actor/Player.clearCharges:()V
        40: aload_0
        41: invokevirtual #314                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        44: astore_1
        45: aload_1
        46: ifnull        60
        49: aload_1
        50: invokevirtual #398                // Method ext/mods/gameserver/model/actor/Summon.isDead:()Z
        53: ifne          60
        56: aload_1
        57: invokevirtual #326                // Method ext/mods/gameserver/model/actor/Summon.stopAllEffectsExceptThoseThatLastThroughDeath:()V
        60: aload_0
        61: invokevirtual #238                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        64: ifnull        83
        67: aload_0
        68: invokevirtual #238                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        71: aload_0
        72: invokevirtual #411                // Method ext/mods/gameserver/model/pledge/Clan.checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
        75: pop
        76: aload_0
        77: invokevirtual #299                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        80: invokevirtual #303                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
        83: getstatic     #415                // Field ext/mods/Config.DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
        86: ifle          98
        89: invokestatic  #420                // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
        92: iconst_1
        93: aload_0
        94: invokevirtual #425                // Method ext/mods/gameserver/data/manager/AntiFeedManager.removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
        97: pop
        98: aload_0
        99: invokevirtual #290                // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
       102: ifeq          141
       105: invokestatic  #293                // Method ext/mods/gameserver/data/SkillTable.getHeroSkills:()[Lext/mods/gameserver/skills/L2Skill;
       108: astore_2
       109: aload_2
       110: arraylength
       111: istore_3
       112: iconst_0
       113: istore        4
       115: iload         4
       117: iload_3
       118: if_icmpge     141
       121: aload_2
       122: iload         4
       124: aaload
       125: astore        5
       127: aload_0
       128: aload         5
       130: iconst_0
       131: invokevirtual #429                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       134: pop
       135: iinc          4, 1
       138: goto          115
       141: aload_0
       142: new           #368                // class ext/mods/gameserver/network/serverpackets/SkillList
       145: dup
       146: aload_0
       147: invokespecial #370                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       150: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       153: return
      LineNumberTable:
        line 430: 0
        line 431: 5
        line 432: 10
        line 433: 15
        line 434: 20
        line 436: 32
        line 437: 36
        line 439: 40
        line 440: 45
        line 441: 56
        line 443: 60
        line 445: 67
        line 447: 76
        line 450: 83
        line 451: 89
        line 453: 98
        line 455: 105
        line 456: 127
        line 455: 135
        line 458: 141
        line 459: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          127       8     5 skill   Lext/mods/gameserver/skills/L2Skill;
            0     154     0 player   Lext/mods/gameserver/model/actor/Player;
           45     109     1 summon   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 22 /* same */
        frame_type = 14 /* same */
        frame_type = 254 /* append */
          offset_delta = 16
          locals = [ class "[Lext/mods/gameserver/skills/L2Skill;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 25

  protected static final void portPlayerBack(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ifnull        17
         4: aload_0
         5: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Player.getSavedLocation:()Lext/mods/gameserver/model/location/Location;
         8: getstatic     #433                // Field ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
        11: invokevirtual #437                // Method ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
        14: ifeq          18
        17: return
        18: aload_0
        19: aload_0
        20: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Player.getSavedLocation:()Lext/mods/gameserver/model/location/Location;
        23: iconst_0
        24: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        27: aload_0
        28: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Player.getSavedLocation:()Lext/mods/gameserver/model/location/Location;
        31: invokevirtual #441                // Method ext/mods/gameserver/model/location/Location.clean:()V
        34: return
      LineNumberTable:
        line 470: 0
        line 471: 17
        line 473: 18
        line 474: 27
        line 475: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 0 /* same */

  protected static final void setSavedLocationToGiran(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: ifnonnull     5
         4: return
         5: aload_0
         6: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Player.getSavedLocation:()Lext/mods/gameserver/model/location/Location;
         9: getstatic     #444                // Field GIRAN_LOC:Lext/mods/gameserver/model/location/Location;
        12: invokevirtual #447                // Method ext/mods/gameserver/model/location/Location.getX:()I
        15: getstatic     #444                // Field GIRAN_LOC:Lext/mods/gameserver/model/location/Location;
        18: invokevirtual #450                // Method ext/mods/gameserver/model/location/Location.getY:()I
        21: getstatic     #444                // Field GIRAN_LOC:Lext/mods/gameserver/model/location/Location;
        24: invokevirtual #453                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        27: invokevirtual #456                // Method ext/mods/gameserver/model/location/Location.set:(III)V
        30: return
      LineNumberTable:
        line 484: 0
        line 485: 4
        line 486: 5
        line 487: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  protected static final void portPlayerToGiranPersistent(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getstatic     #444                // Field GIRAN_LOC:Lext/mods/gameserver/model/location/Location;
         9: iconst_0
        10: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        13: aload_0
        14: invokevirtual #459                // Method ext/mods/gameserver/model/actor/Player.storeCharBase:()V
        17: return
      LineNumberTable:
        line 496: 0
        line 497: 4
        line 498: 5
        line 499: 13
        line 500: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public static final void rewardParticipant(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.holder.IntIntHolder[]);
    descriptor: (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=7, args_size=2
         0: aload_0
         1: ifnull        18
         4: aload_0
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
         8: ifeq          18
        11: aload_1
        12: invokestatic  #462                // Method ext/mods/commons/util/ArraysUtil.isEmpty:([Ljava/lang/Object;)Z
        15: ifeq          19
        18: return
        19: aload_1
        20: astore_2
        21: aload_2
        22: arraylength
        23: istore_3
        24: iconst_0
        25: istore        4
        27: iload         4
        29: iload_3
        30: if_icmpge     98
        33: aload_2
        34: iload         4
        36: aaload
        37: astore        5
        39: aload_0
        40: invokevirtual #468                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        43: aload         5
        45: invokevirtual #472                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        48: aload         5
        50: invokevirtual #475                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        53: invokevirtual #478                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        56: astore        6
        58: aload         6
        60: ifnonnull     66
        63: goto          92
        66: aload_0
        67: getstatic     #484                // Field ext/mods/gameserver/network/SystemMessageId.EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
        70: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        73: aload         5
        75: invokevirtual #472                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        78: invokevirtual #142                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        81: aload         5
        83: invokevirtual #475                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        86: invokevirtual #80                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        89: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        92: iinc          4, 1
        95: goto          27
        98: return
      LineNumberTable:
        line 509: 0
        line 510: 18
        line 512: 19
        line 514: 39
        line 515: 58
        line 516: 63
        line 518: 66
        line 512: 92
        line 520: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      34     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           39      53     5    it   Lext/mods/gameserver/model/holder/IntIntHolder;
            0      99     0 player   Lext/mods/gameserver/model/actor/Player;
            0      99     1 reward   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 6
        frame_type = 18 /* same */
        frame_type = 0 /* same */
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 248 /* chop */
          offset_delta = 5

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #487                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
         6: invokevirtual #489                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #492                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #494                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #201                // class ext/mods/gameserver/model/location/Location
        18: dup
        19: ldc_w         #498                // int 83314
        22: ldc_w         #499                // int 148012
        25: sipush        -3400
        28: invokespecial #500                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        31: putstatic     #444                // Field GIRAN_LOC:Lext/mods/gameserver/model/location/Location;
        34: return
      LineNumberTable:
        line 57: 0
        line 462: 15
}
SourceFile: "AbstractOlympiadGame.java"
