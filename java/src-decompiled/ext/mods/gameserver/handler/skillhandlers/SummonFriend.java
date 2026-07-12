// Bytecode for: ext.mods.gameserver.handler.skillhandlers.SummonFriend
// File: ext\mods\gameserver\handler\skillhandlers\SummonFriend.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/SummonFriend.class
  Last modified 9 de jul de 2026; size 7104 bytes
  MD5 checksum 31e7251a6870a946181555fbf0914618
  Compiled from "SummonFriend.java"
public class ext.mods.gameserver.handler.skillhandlers.SummonFriend implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/handler/skillhandlers/SummonFriend
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/handler/skillhandlers/SummonFriend.checkSummoner:(Lext/mods/gameserver/model/actor/Player;)Z
   #10 = Class              #12           // ext/mods/gameserver/handler/skillhandlers/SummonFriend
   #11 = NameAndType        #13:#14       // checkSummoner:(Lext/mods/gameserver/model/actor/Player;)Z
   #12 = Utf8               ext/mods/gameserver/handler/skillhandlers/SummonFriend
   #13 = Utf8               checkSummoner
   #14 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #16 = Class              #18           // ext/mods/gameserver/skills/L2Skill
   #17 = NameAndType        #19:#20       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #18 = Utf8               ext/mods/gameserver/skills/L2Skill
   #19 = Utf8               getSkillType
   #20 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/enums/skills/SkillType.SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
   #22 = Class              #24           // ext/mods/gameserver/enums/skills/SkillType
   #23 = NameAndType        #25:#26       // SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
   #24 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #25 = Utf8               SUMMON_PARTY
   #26 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #27 = Methodref          #7.#28        // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #28 = NameAndType        #29:#30       // getParty:()Lext/mods/gameserver/model/group/Party;
   #29 = Utf8               getParty
   #30 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
   #32 = Class              #34           // ext/mods/gameserver/model/group/Party
   #33 = NameAndType        #35:#36       // getMembers:()Ljava/util/List;
   #34 = Utf8               ext/mods/gameserver/model/group/Party
   #35 = Utf8               getMembers
   #36 = Utf8               ()Ljava/util/List;
   #37 = InterfaceMethodref #38.#39       // java/util/List.iterator:()Ljava/util/Iterator;
   #38 = Class              #40           // java/util/List
   #39 = NameAndType        #41:#42       // iterator:()Ljava/util/Iterator;
   #40 = Utf8               java/util/List
   #41 = Utf8               iterator
   #42 = Utf8               ()Ljava/util/Iterator;
   #43 = InterfaceMethodref #44.#45       // java/util/Iterator.hasNext:()Z
   #44 = Class              #46           // java/util/Iterator
   #45 = NameAndType        #47:#48       // hasNext:()Z
   #46 = Utf8               java/util/Iterator
   #47 = Utf8               hasNext
   #48 = Utf8               ()Z
   #49 = InterfaceMethodref #44.#50       // java/util/Iterator.next:()Ljava/lang/Object;
   #50 = NameAndType        #51:#52       // next:()Ljava/lang/Object;
   #51 = Utf8               next
   #52 = Utf8               ()Ljava/lang/Object;
   #53 = Methodref          #10.#54       // ext/mods/gameserver/handler/skillhandlers/SummonFriend.checkSummoned:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
   #54 = NameAndType        #55:#56       // checkSummoned:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
   #55 = Utf8               checkSummoned
   #56 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
   #57 = Methodref          #10.#58       // ext/mods/gameserver/handler/skillhandlers/SummonFriend.teleportTo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #58 = NameAndType        #59:#60       // teleportTo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #59 = Utf8               teleportTo
   #60 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #61 = Methodref          #7.#62        // ext/mods/gameserver/model/actor/Player.teleportRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
   #62 = NameAndType        #63:#64       // teleportRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
   #63 = Utf8               teleportRequest
   #64 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
   #65 = Fieldref           #66.#67       // ext/mods/gameserver/network/SystemMessageId.S1_ALREADY_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
   #66 = Class              #68           // ext/mods/gameserver/network/SystemMessageId
   #67 = NameAndType        #69:#70       // S1_ALREADY_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
   #68 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #69 = Utf8               S1_ALREADY_SUMMONED
   #70 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #71 = Methodref          #72.#73       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #72 = Class              #74           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #73 = NameAndType        #75:#76       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #74 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #75 = Utf8               getSystemMessage
   #76 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #77 = Methodref          #72.#78       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #78 = NameAndType        #79:#80       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #79 = Utf8               addCharName
   #80 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #81 = Methodref          #7.#82        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #82 = NameAndType        #83:#84       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #83 = Utf8               sendPacket
   #84 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #85 = Methodref          #16.#86       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #86 = NameAndType        #87:#88       // getId:()I
   #87 = Utf8               getId
   #88 = Utf8               ()I
   #89 = Class              #90           // ext/mods/gameserver/network/serverpackets/ConfirmDlg
   #90 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
   #91 = Fieldref           #66.#92       // ext/mods/gameserver/network/SystemMessageId.S1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT:Lext/mods/gameserver/network/SystemMessageId;
   #92 = NameAndType        #93:#70       // S1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT:Lext/mods/gameserver/network/SystemMessageId;
   #93 = Utf8               S1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT
   #94 = Methodref          #66.#86       // ext/mods/gameserver/network/SystemMessageId.getId:()I
   #95 = Methodref          #89.#96       // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
   #96 = NameAndType        #5:#97        // "<init>":(I)V
   #97 = Utf8               (I)V
   #98 = Methodref          #89.#99       // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
   #99 = NameAndType        #79:#100      // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #100 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #101 = Methodref          #7.#102       // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #102 = NameAndType        #103:#104     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #103 = Utf8               getPosition
  #104 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #105 = Methodref          #89.#106      // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addZoneName:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #106 = NameAndType        #107:#108     // addZoneName:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #107 = Utf8               addZoneName
  #108 = Utf8               (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #109 = Methodref          #89.#110      // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #110 = NameAndType        #111:#112     // addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #111 = Utf8               addTime
  #112 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #113 = Methodref          #7.#114       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #114 = NameAndType        #115:#88      // getObjectId:()I
  #115 = Utf8               getObjectId
  #116 = Methodref          #89.#117      // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #117 = NameAndType        #118:#112     // addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #118 = Utf8               addRequesterId
  #119 = Fieldref           #10.#120      // ext/mods/gameserver/handler/skillhandlers/SummonFriend.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #120 = NameAndType        #121:#122     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #121 = Utf8               SKILL_IDS
  #122 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #123 = Methodref          #7.#124       // ext/mods/gameserver/model/actor/Player.isMounted:()Z
  #124 = NameAndType        #125:#48      // isMounted:()Z
  #125 = Utf8               isMounted
  #126 = Methodref          #7.#127       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #127 = NameAndType        #128:#48      // isInOlympiadMode:()Z
  #128 = Utf8               isInOlympiadMode
  #129 = Methodref          #7.#130       // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #130 = NameAndType        #131:#48      // isInObserverMode:()Z
  #131 = Utf8               isInObserverMode
  #132 = Fieldref           #133.#134     // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #133 = Class              #135          // ext/mods/gameserver/enums/ZoneId
  #134 = NameAndType        #136:#137     // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #135 = Utf8               ext/mods/gameserver/enums/ZoneId
  #136 = Utf8               NO_SUMMON_FRIEND
  #137 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #138 = Methodref          #7.#139       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #139 = NameAndType        #140:#141     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #140 = Utf8               isInsideZone
  #141 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #142 = Fieldref           #66.#143      // ext/mods/gameserver/network/SystemMessageId.YOU_MAY_NOT_SUMMON_FROM_YOUR_CURRENT_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
  #143 = NameAndType        #144:#70      // YOU_MAY_NOT_SUMMON_FROM_YOUR_CURRENT_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
  #144 = Utf8               YOU_MAY_NOT_SUMMON_FROM_YOUR_CURRENT_LOCATION
  #145 = Methodref          #7.#146       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #146 = NameAndType        #83:#147      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #147 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #148 = Methodref          #149.#150     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #149 = Class              #151          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #150 = NameAndType        #152:#153     // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #151 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #152 = Utf8               getInstance
  #153 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #154 = Methodref          #149.#155     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onEscapeUse:(I)Z
  #155 = NameAndType        #156:#157     // onEscapeUse:(I)Z
  #156 = Utf8               onEscapeUse
  #157 = Utf8               (I)Z
  #158 = Methodref          #159.#160     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #159 = Class              #161          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #160 = NameAndType        #152:#162     // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #161 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #162 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #163 = Methodref          #159.#155     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onEscapeUse:(I)Z
  #164 = Methodref          #165.#166     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #165 = Class              #167          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #166 = NameAndType        #152:#168     // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #167 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #168 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #169 = Methodref          #165.#155     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onEscapeUse:(I)Z
  #170 = Fieldref           #66.#171      // ext/mods/gameserver/network/SystemMessageId.YOUR_TARGET_IS_IN_AN_AREA_WHICH_BLOCKS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
  #171 = NameAndType        #172:#70      // YOUR_TARGET_IS_IN_AN_AREA_WHICH_BLOCKS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
  #172 = Utf8               YOUR_TARGET_IS_IN_AN_AREA_WHICH_BLOCKS_SUMMONING
  #173 = Fieldref           #66.#174      // ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
  #174 = NameAndType        #175:#70      // CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
  #175 = Utf8               CANNOT_USE_ON_YOURSELF
  #176 = Methodref          #7.#177       // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #177 = NameAndType        #178:#48      // isAlikeDead:()Z
  #178 = Utf8               isAlikeDead
  #179 = Fieldref           #66.#180      // ext/mods/gameserver/network/SystemMessageId.S1_IS_DEAD_AT_THE_MOMENT_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
  #180 = NameAndType        #181:#70      // S1_IS_DEAD_AT_THE_MOMENT_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
  #181 = Utf8               S1_IS_DEAD_AT_THE_MOMENT_AND_CANNOT_BE_SUMMONED
  #182 = Methodref          #7.#183       // ext/mods/gameserver/model/actor/Player.isOperating:()Z
  #183 = NameAndType        #184:#48      // isOperating:()Z
  #184 = Utf8               isOperating
  #185 = Fieldref           #66.#186      // ext/mods/gameserver/network/SystemMessageId.S1_CURRENTLY_TRADING_OR_OPERATING_PRIVATE_STORE_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
  #186 = NameAndType        #187:#70      // S1_CURRENTLY_TRADING_OR_OPERATING_PRIVATE_STORE_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
  #187 = Utf8               S1_CURRENTLY_TRADING_OR_OPERATING_PRIVATE_STORE_AND_CANNOT_BE_SUMMONED
  #188 = Methodref          #7.#189       // ext/mods/gameserver/model/actor/Player.isRooted:()Z
  #189 = NameAndType        #190:#48      // isRooted:()Z
  #190 = Utf8               isRooted
  #191 = Methodref          #7.#192       // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #192 = NameAndType        #193:#48      // isInCombat:()Z
  #193 = Utf8               isInCombat
  #194 = Fieldref           #66.#195      // ext/mods/gameserver/network/SystemMessageId.S1_IS_ENGAGED_IN_COMBAT_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
  #195 = NameAndType        #196:#70      // S1_IS_ENGAGED_IN_COMBAT_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
  #196 = Utf8               S1_IS_ENGAGED_IN_COMBAT_AND_CANNOT_BE_SUMMONED
  #197 = Fieldref           #66.#198      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_SUMMON_PLAYERS_WHO_ARE_IN_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #198 = NameAndType        #199:#70      // YOU_CANNOT_SUMMON_PLAYERS_WHO_ARE_IN_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #199 = Utf8               YOU_CANNOT_SUMMON_PLAYERS_WHO_ARE_IN_OLYMPIAD
  #200 = Methodref          #7.#201       // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
  #201 = NameAndType        #202:#48      // isFestivalParticipant:()Z
  #202 = Utf8               isFestivalParticipant
  #203 = Methodref          #7.#204       // ext/mods/gameserver/model/actor/Player.isFlying:()Z
  #204 = NameAndType        #205:#48      // isFlying:()Z
  #205 = Utf8               isFlying
  #206 = Fieldref           #66.#207      // ext/mods/gameserver/network/SystemMessageId.S1_IN_SUMMON_BLOCKING_AREA:Lext/mods/gameserver/network/SystemMessageId;
  #207 = NameAndType        #208:#70      // S1_IN_SUMMON_BLOCKING_AREA:Lext/mods/gameserver/network/SystemMessageId;
  #208 = Utf8               S1_IN_SUMMON_BLOCKING_AREA
  #209 = Methodref          #210.#211     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #210 = Class              #212          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #211 = NameAndType        #152:#213     // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #212 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #213 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #214 = Methodref          #210.#155     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onEscapeUse:(I)Z
  #215 = Methodref          #16.#216      // ext/mods/gameserver/skills/L2Skill.getTargetConsumeId:()I
  #216 = NameAndType        #217:#88      // getTargetConsumeId:()I
  #217 = Utf8               getTargetConsumeId
  #218 = Methodref          #16.#219      // ext/mods/gameserver/skills/L2Skill.getTargetConsume:()I
  #219 = NameAndType        #220:#88      // getTargetConsume:()I
  #220 = Utf8               getTargetConsume
  #221 = Methodref          #7.#222       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #222 = NameAndType        #223:#224     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #223 = Utf8               getInventory
  #224 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #225 = Methodref          #226.#227     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
  #226 = Class              #228          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #227 = NameAndType        #229:#230     // getItemCount:(I)I
  #228 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #229 = Utf8               getItemCount
  #230 = Utf8               (I)I
  #231 = Fieldref           #66.#232      // ext/mods/gameserver/network/SystemMessageId.S1_REQUIRED_FOR_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
  #232 = NameAndType        #233:#70      // S1_REQUIRED_FOR_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
  #233 = Utf8               S1_REQUIRED_FOR_SUMMONING
  #234 = Methodref          #72.#235      // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #235 = NameAndType        #236:#237     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #236 = Utf8               addItemName
  #237 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #238 = Methodref          #7.#239       // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #239 = NameAndType        #240:#241     // destroyItemByItemId:(IIZ)Z
  #240 = Utf8               destroyItemByItemId
  #241 = Utf8               (IIZ)Z
  #242 = Methodref          #7.#243       // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #243 = NameAndType        #59:#244      // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #244 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #245 = Fieldref           #22.#246      // ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #246 = NameAndType        #247:#26      // SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #247 = Utf8               SUMMON_FRIEND
  #248 = Class              #249          // ext/mods/gameserver/handler/ISkillHandler
  #249 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #250 = Utf8               Code
  #251 = Utf8               LineNumberTable
  #252 = Utf8               LocalVariableTable
  #253 = Utf8               this
  #254 = Utf8               Lext/mods/gameserver/handler/skillhandlers/SummonFriend;
  #255 = Utf8               useSkill
  #256 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #257 = Utf8               player
  #258 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #259 = Utf8               member
  #260 = Utf8               party
  #261 = Utf8               Lext/mods/gameserver/model/group/Party;
  #262 = Utf8               confirm
  #263 = Utf8               Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #264 = Utf8               target
  #265 = Utf8               obj
  #266 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #267 = Utf8               creature
  #268 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #269 = Utf8               skill
  #270 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #271 = Utf8               targets
  #272 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #273 = Utf8               item
  #274 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #275 = Utf8               StackMapTable
  #276 = Class              #272          // "[Lext/mods/gameserver/model/WorldObject;"
  #277 = Class              #278          // ext/mods/gameserver/model/WorldObject
  #278 = Utf8               ext/mods/gameserver/model/WorldObject
  #279 = Utf8               getSkillIds
  #280 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #281 = Utf8               targetPlayer
  #282 = Utf8               <clinit>
  #283 = Utf8               SourceFile
  #284 = Utf8               SummonFriend.java
{
  public ext.mods.gameserver.handler.skillhandlers.SummonFriend();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/SummonFriend;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=12, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload         5
        19: invokestatic  #9                  // Method checkSummoner:(Lext/mods/gameserver/model/actor/Player;)Z
        22: ifne          26
        25: return
        26: aload_2
        27: invokevirtual #15                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        30: getstatic     #21                 // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
        33: if_acmpne     120
        36: aload         5
        38: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        41: astore        6
        43: aload         6
        45: ifnonnull     49
        48: return
        49: aload         6
        51: invokevirtual #31                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        54: invokeinterface #37,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        59: astore        7
        61: aload         7
        63: invokeinterface #43,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        68: ifeq          117
        71: aload         7
        73: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        78: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        81: astore        8
        83: aload         8
        85: aload         5
        87: if_acmpne     93
        90: goto          61
        93: aload         5
        95: aload         8
        97: invokestatic  #53                 // Method checkSummoned:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
       100: ifne          106
       103: goto          61
       106: aload         8
       108: aload         5
       110: aload_2
       111: invokestatic  #57                 // Method teleportTo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
       114: goto          61
       117: goto          299
       120: aload_3
       121: astore        6
       123: aload         6
       125: arraylength
       126: istore        7
       128: iconst_0
       129: istore        8
       131: iload         8
       133: iload         7
       135: if_icmpge     299
       138: aload         6
       140: iload         8
       142: aaload
       143: astore        9
       145: aload         9
       147: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
       150: ifeq          293
       153: aload         9
       155: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
       158: astore        10
       160: aload         5
       162: aload         10
       164: invokestatic  #53                 // Method checkSummoned:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
       167: ifne          173
       170: goto          293
       173: aload         10
       175: aload         5
       177: aload_2
       178: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.teleportRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
       181: ifne          203
       184: aload         5
       186: getstatic     #65                 // Field ext/mods/gameserver/network/SystemMessageId.S1_ALREADY_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
       189: invokestatic  #71                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       192: aload         10
       194: invokevirtual #77                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       197: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       200: goto          293
       203: aload_2
       204: invokevirtual #85                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       207: sipush        1403
       210: if_icmpne     277
       213: new           #89                 // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
       216: dup
       217: getstatic     #91                 // Field ext/mods/gameserver/network/SystemMessageId.S1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT:Lext/mods/gameserver/network/SystemMessageId;
       220: invokevirtual #94                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       223: invokespecial #95                 // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
       226: astore        11
       228: aload         11
       230: aload         5
       232: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       235: pop
       236: aload         11
       238: aload         5
       240: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       243: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addZoneName:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       246: pop
       247: aload         11
       249: sipush        30000
       252: invokevirtual #109                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       255: pop
       256: aload         11
       258: aload         5
       260: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       263: invokevirtual #116                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       266: pop
       267: aload         10
       269: aload         11
       271: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       274: goto          293
       277: aload         10
       279: aload         5
       281: aload_2
       282: invokestatic  #57                 // Method teleportTo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
       285: aload         10
       287: aconst_null
       288: aconst_null
       289: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.teleportRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
       292: pop
       293: iinc          8, 1
       296: goto          131
       299: return
      LineNumberTable:
        line 48: 0
        line 49: 16
        line 51: 17
        line 52: 25
        line 54: 26
        line 56: 36
        line 57: 43
        line 58: 48
        line 60: 49
        line 62: 83
        line 63: 90
        line 65: 93
        line 66: 103
        line 68: 106
        line 69: 114
        line 70: 117
        line 73: 120
        line 75: 145
        line 78: 160
        line 79: 170
        line 81: 173
        line 83: 184
        line 84: 200
        line 87: 203
        line 89: 213
        line 90: 228
        line 91: 236
        line 92: 247
        line 93: 256
        line 94: 267
        line 95: 274
        line 98: 277
        line 99: 285
        line 73: 293
        line 103: 299
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
           83      31     8 member   Lext/mods/gameserver/model/actor/Player;
           43      74     6 party   Lext/mods/gameserver/model/group/Party;
          228      46    11 confirm   Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
          160     133    10 target   Lext/mods/gameserver/model/actor/Player;
          145     148     9   obj   Lext/mods/gameserver/model/WorldObject;
            0     300     0  this   Lext/mods/gameserver/handler/skillhandlers/SummonFriend;
            0     300     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     300     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     300     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     300     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     283     5 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 15
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/group/Party ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 12 /* same */
        frame_type = 248 /* chop */
          offset_delta = 10
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 29 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 73
        frame_type = 249 /* chop */
          offset_delta = 15
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #119                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/SummonFriend;

  public static boolean checkSummoner(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
         4: ifeq          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        13: ifne          33
        16: aload_0
        17: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        20: ifne          33
        23: aload_0
        24: getstatic     #132                // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        27: invokevirtual #138                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        30: ifeq          42
        33: aload_0
        34: getstatic     #142                // Field ext/mods/gameserver/network/SystemMessageId.YOU_MAY_NOT_SUMMON_FROM_YOUR_CURRENT_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
        37: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        40: iconst_0
        41: ireturn
        42: invokestatic  #148                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        45: aload_0
        46: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        49: invokevirtual #154                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onEscapeUse:(I)Z
        52: ifeq          81
        55: invokestatic  #158                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        58: aload_0
        59: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        62: invokevirtual #163                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onEscapeUse:(I)Z
        65: ifeq          81
        68: invokestatic  #164                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        71: aload_0
        72: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        75: invokevirtual #169                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onEscapeUse:(I)Z
        78: ifne          90
        81: aload_0
        82: getstatic     #170                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_TARGET_IS_IN_AN_AREA_WHICH_BLOCKS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
        85: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        88: iconst_0
        89: ireturn
        90: iconst_1
        91: ireturn
      LineNumberTable:
        line 118: 0
        line 119: 7
        line 121: 9
        line 123: 33
        line 124: 40
        line 127: 42
        line 129: 81
        line 130: 88
        line 133: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 23 /* same */
        frame_type = 8 /* same */
        frame_type = 38 /* same */
        frame_type = 8 /* same */

  public static boolean checkSummoned(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifne          9
         7: iconst_0
         8: ireturn
         9: aload_1
        10: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        13: astore_2
        14: aload_2
        15: aload_0
        16: if_acmpne     28
        19: aload_0
        20: getstatic     #173                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
        23: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        26: iconst_0
        27: ireturn
        28: aload_2
        29: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
        32: ifeq          51
        35: aload_0
        36: getstatic     #179                // Field ext/mods/gameserver/network/SystemMessageId.S1_IS_DEAD_AT_THE_MOMENT_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
        39: invokestatic  #71                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        42: aload_2
        43: invokevirtual #77                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        46: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        49: iconst_0
        50: ireturn
        51: aload_2
        52: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
        55: ifeq          74
        58: aload_0
        59: getstatic     #185                // Field ext/mods/gameserver/network/SystemMessageId.S1_CURRENTLY_TRADING_OR_OPERATING_PRIVATE_STORE_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
        62: invokestatic  #71                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        65: aload_2
        66: invokevirtual #77                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        69: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        72: iconst_0
        73: ireturn
        74: aload_2
        75: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Player.isRooted:()Z
        78: ifne          88
        81: aload_2
        82: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
        85: ifeq          104
        88: aload_0
        89: getstatic     #194                // Field ext/mods/gameserver/network/SystemMessageId.S1_IS_ENGAGED_IN_COMBAT_AND_CANNOT_BE_SUMMONED:Lext/mods/gameserver/network/SystemMessageId;
        92: invokestatic  #71                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        95: aload_2
        96: invokevirtual #77                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        99: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       102: iconst_0
       103: ireturn
       104: aload_2
       105: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       108: ifeq          120
       111: aload_0
       112: getstatic     #197                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_SUMMON_PLAYERS_WHO_ARE_IN_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
       115: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       118: iconst_0
       119: ireturn
       120: aload_2
       121: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       124: ifne          134
       127: aload_2
       128: invokevirtual #203                // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
       131: ifeq          143
       134: aload_0
       135: getstatic     #170                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_TARGET_IS_IN_AN_AREA_WHICH_BLOCKS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
       138: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       141: iconst_0
       142: ireturn
       143: aload_2
       144: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
       147: ifne          160
       150: aload_2
       151: getstatic     #132                // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
       154: invokevirtual #138                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       157: ifeq          176
       160: aload_0
       161: getstatic     #206                // Field ext/mods/gameserver/network/SystemMessageId.S1_IN_SUMMON_BLOCKING_AREA:Lext/mods/gameserver/network/SystemMessageId;
       164: invokestatic  #71                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       167: aload_2
       168: invokevirtual #77                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       171: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       174: iconst_0
       175: ireturn
       176: invokestatic  #209                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       179: aload_0
       180: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       183: invokevirtual #214                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onEscapeUse:(I)Z
       186: ifeq          228
       189: invokestatic  #158                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       192: aload_0
       193: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       196: invokevirtual #163                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onEscapeUse:(I)Z
       199: ifeq          228
       202: invokestatic  #164                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       205: aload_0
       206: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       209: invokevirtual #169                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onEscapeUse:(I)Z
       212: ifeq          228
       215: invokestatic  #148                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       218: aload_0
       219: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       222: invokevirtual #154                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onEscapeUse:(I)Z
       225: ifne          237
       228: aload_0
       229: getstatic     #170                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_TARGET_IS_IN_AN_AREA_WHICH_BLOCKS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
       232: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       235: iconst_0
       236: ireturn
       237: iconst_1
       238: ireturn
      LineNumberTable:
        line 144: 0
        line 145: 7
        line 147: 9
        line 149: 14
        line 151: 19
        line 152: 26
        line 155: 28
        line 157: 35
        line 158: 49
        line 161: 51
        line 163: 58
        line 164: 72
        line 167: 74
        line 169: 88
        line 170: 102
        line 173: 104
        line 175: 111
        line 176: 118
        line 179: 120
        line 181: 134
        line 182: 141
        line 185: 143
        line 187: 160
        line 188: 174
        line 191: 176
        line 193: 228
        line 194: 235
        line 197: 237
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     239     0 player   Lext/mods/gameserver/model/actor/Player;
            0     239     1 target   Lext/mods/gameserver/model/WorldObject;
           14     225     2 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 13
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 22 /* same */
        frame_type = 22 /* same */
        frame_type = 13 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 13 /* same */
        frame_type = 8 /* same */
        frame_type = 16 /* same */
        frame_type = 15 /* same */
        frame_type = 51 /* same */
        frame_type = 8 /* same */

  public static void teleportTo(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokestatic  #9                  // Method checkSummoner:(Lext/mods/gameserver/model/actor/Player;)Z
         4: ifeq          15
         7: aload_0
         8: aload_1
         9: invokestatic  #53                 // Method checkSummoned:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
        12: ifne          16
        15: return
        16: aload_2
        17: invokevirtual #215                // Method ext/mods/gameserver/skills/L2Skill.getTargetConsumeId:()I
        20: ifle          80
        23: aload_2
        24: invokevirtual #218                // Method ext/mods/gameserver/skills/L2Skill.getTargetConsume:()I
        27: ifle          80
        30: aload_0
        31: invokevirtual #221                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        34: aload_2
        35: invokevirtual #215                // Method ext/mods/gameserver/skills/L2Skill.getTargetConsumeId:()I
        38: invokevirtual #225                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
        41: aload_2
        42: invokevirtual #218                // Method ext/mods/gameserver/skills/L2Skill.getTargetConsume:()I
        45: if_icmpge     66
        48: aload_0
        49: getstatic     #231                // Field ext/mods/gameserver/network/SystemMessageId.S1_REQUIRED_FOR_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
        52: invokestatic  #71                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        55: aload_2
        56: invokevirtual #215                // Method ext/mods/gameserver/skills/L2Skill.getTargetConsumeId:()I
        59: invokevirtual #234                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        62: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: return
        66: aload_0
        67: aload_2
        68: invokevirtual #215                // Method ext/mods/gameserver/skills/L2Skill.getTargetConsumeId:()I
        71: aload_2
        72: invokevirtual #218                // Method ext/mods/gameserver/skills/L2Skill.getTargetConsume:()I
        75: iconst_1
        76: invokevirtual #238                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        79: pop
        80: aload_0
        81: aload_1
        82: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        85: iconst_0
        86: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        89: return
      LineNumberTable:
        line 210: 0
        line 211: 15
        line 213: 16
        line 215: 30
        line 217: 48
        line 218: 65
        line 221: 66
        line 223: 80
        line 224: 89
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      90     0 player   Lext/mods/gameserver/model/actor/Player;
            0      90     1 target   Lext/mods/gameserver/model/actor/Player;
            0      90     2 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 4
        frame_type = 15 /* same */
        frame_type = 0 /* same */
        frame_type = 49 /* same */
        frame_type = 13 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #22                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #245                // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #21                 // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #119                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "SummonFriend.java"
