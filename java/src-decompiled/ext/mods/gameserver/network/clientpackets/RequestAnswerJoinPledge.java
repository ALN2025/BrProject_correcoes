// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAnswerJoinPledge
// File: ext\mods\gameserver\network\clientpackets\RequestAnswerJoinPledge.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.class
  Last modified 9 de jul de 2026; size 7250 bytes
  MD5 checksum 9079b5530f1bcb263ad1a293a0cf858c
  Compiled from "RequestAnswerJoinPledge.java"
public final class ext.mods.gameserver.network.clientpackets.RequestAnswerJoinPledge extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge._answer:I
   #14 = NameAndType        #15:#16       // _answer:I
   #15 = Utf8               _answer
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #18 = NameAndType        #19:#20       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #19 = Utf8               getClient
   #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #21 = Class              #22           // ext/mods/gameserver/network/GameClient
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Methodref          #21.#24       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               getPlayer
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getRequest
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Request;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/container/player/Request.getPartner:()Lext/mods/gameserver/model/actor/Player;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/container/player/Request
   #35 = NameAndType        #37:#26       // getPartner:()Lext/mods/gameserver/model/actor/Player;
   #36 = Utf8               ext/mods/gameserver/model/actor/container/player/Request
   #37 = Utf8               getPartner
   #38 = Fieldref           #39.#40       // ext/mods/gameserver/network/SystemMessageId.YOU_DID_NOT_RESPOND_TO_S1_CLAN_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
   #39 = Class              #41           // ext/mods/gameserver/network/SystemMessageId
   #40 = NameAndType        #42:#43       // YOU_DID_NOT_RESPOND_TO_S1_CLAN_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
   #41 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #42 = Utf8               YOU_DID_NOT_RESPOND_TO_S1_CLAN_INVITATION
   #43 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #44 = Methodref          #45.#46       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #45 = Class              #47           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #46 = NameAndType        #48:#49       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #47 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #48 = Utf8               getSystemMessage
   #49 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #50 = Methodref          #45.#51       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #51 = NameAndType        #52:#53       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #52 = Utf8               addCharName
   #53 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #54 = Methodref          #28.#55       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = NameAndType        #56:#57       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Utf8               sendPacket
   #57 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #58 = Fieldref           #39.#59       // ext/mods/gameserver/network/SystemMessageId.S1_DID_NOT_RESPOND_TO_CLAN_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
   #59 = NameAndType        #60:#43       // S1_DID_NOT_RESPOND_TO_CLAN_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
   #60 = Utf8               S1_DID_NOT_RESPOND_TO_CLAN_INVITATION
   #61 = Methodref          #34.#62       // ext/mods/gameserver/model/actor/container/player/Request.getRequestPacket:()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #62 = NameAndType        #63:#64       // getRequestPacket:()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #63 = Utf8               getRequestPacket
   #64 = Utf8               ()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #65 = Class              #66           // ext/mods/gameserver/network/clientpackets/RequestJoinPledge
   #66 = Utf8               ext/mods/gameserver/network/clientpackets/RequestJoinPledge
   #67 = Methodref          #28.#68       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #68 = NameAndType        #69:#70       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #69 = Utf8               getClan
   #70 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #71 = Methodref          #65.#72       // ext/mods/gameserver/network/clientpackets/RequestJoinPledge.getPledgeType:()I
   #72 = NameAndType        #73:#12       // getPledgeType:()I
   #73 = Utf8               getPledgeType
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/pledge/Clan.checkClanJoinCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)Z
   #75 = Class              #77           // ext/mods/gameserver/model/pledge/Clan
   #76 = NameAndType        #78:#79       // checkClanJoinCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)Z
   #77 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #78 = Utf8               checkClanJoinCondition
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)Z
   #80 = Class              #81           // ext/mods/gameserver/network/serverpackets/JoinPledge
   #81 = Utf8               ext/mods/gameserver/network/serverpackets/JoinPledge
   #82 = Methodref          #28.#83       // ext/mods/gameserver/model/actor/Player.getClanId:()I
   #83 = NameAndType        #84:#12       // getClanId:()I
   #84 = Utf8               getClanId
   #85 = Methodref          #80.#86       // ext/mods/gameserver/network/serverpackets/JoinPledge."<init>":(I)V
   #86 = NameAndType        #5:#87        // "<init>":(I)V
   #87 = Utf8               (I)V
   #88 = Methodref          #28.#89       // ext/mods/gameserver/model/actor/Player.setPledgeType:(I)V
   #89 = NameAndType        #90:#87       // setPledgeType:(I)V
   #90 = Utf8               setPledgeType
   #91 = Methodref          #28.#92       // ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
   #92 = NameAndType        #93:#87       // setPowerGrade:(I)V
   #93 = Utf8               setPowerGrade
   #94 = Methodref          #28.#95       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #95 = NameAndType        #96:#97       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #96 = Utf8               getStatus
   #97 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #98 = Methodref          #99.#100      // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #99 = Class              #101          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #100 = NameAndType        #102:#12      // getLevel:()I
  #101 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #102 = Utf8               getLevel
  #103 = Methodref          #28.#104      // ext/mods/gameserver/model/actor/Player.setLvlJoinedAcademy:(I)V
  #104 = NameAndType        #105:#87      // setLvlJoinedAcademy:(I)V
  #105 = Utf8               setLvlJoinedAcademy
  #106 = Methodref          #75.#107      // ext/mods/gameserver/model/pledge/Clan.addClanMember:(Lext/mods/gameserver/model/actor/Player;)V
  #107 = NameAndType        #108:#109     // addClanMember:(Lext/mods/gameserver/model/actor/Player;)V
  #108 = Utf8               addClanMember
  #109 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #110 = Fieldref           #39.#111      // ext/mods/gameserver/network/SystemMessageId.ENTERED_THE_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #111 = NameAndType        #112:#43      // ENTERED_THE_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #112 = Utf8               ENTERED_THE_CLAN
  #113 = Methodref          #28.#114      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #114 = NameAndType        #56:#115      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #115 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #116 = Class              #117          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #117 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #118 = Fieldref           #39.#119      // ext/mods/gameserver/network/SystemMessageId.S1_HAS_JOINED_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #119 = NameAndType        #120:#43      // S1_HAS_JOINED_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #120 = Utf8               S1_HAS_JOINED_CLAN
  #121 = Class              #122          // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAdd
  #122 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAdd
  #123 = Methodref          #121.#124     // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAdd."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #124 = NameAndType        #5:#109       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #125 = Methodref          #75.#126      // ext/mods/gameserver/model/pledge/Clan.broadcastToMembersExcept:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #126 = NameAndType        #127:#128     // broadcastToMembersExcept:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #127 = Utf8               broadcastToMembersExcept
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #129 = Class              #130          // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
  #130 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
  #131 = Methodref          #129.#132     // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #132 = NameAndType        #5:#133       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #133 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #134 = Methodref          #75.#135      // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #135 = NameAndType        #136:#137     // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #136 = Utf8               broadcastToMembers
  #137 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #138 = Methodref          #139.#140     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #139 = Class              #141          // ext/mods/gameserver/data/manager/CastleManager
  #140 = NameAndType        #142:#143     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #141 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #142 = Utf8               getInstance
  #143 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #144 = Methodref          #139.#145     // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
  #145 = NameAndType        #146:#147     // getCastles:()Ljava/util/Collection;
  #146 = Utf8               getCastles
  #147 = Utf8               ()Ljava/util/Collection;
  #148 = InterfaceMethodref #149.#150     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #149 = Class              #151          // java/util/Collection
  #150 = NameAndType        #152:#153     // iterator:()Ljava/util/Iterator;
  #151 = Utf8               java/util/Collection
  #152 = Utf8               iterator
  #153 = Utf8               ()Ljava/util/Iterator;
  #154 = InterfaceMethodref #155.#156     // java/util/Iterator.hasNext:()Z
  #155 = Class              #157          // java/util/Iterator
  #156 = NameAndType        #158:#159     // hasNext:()Z
  #157 = Utf8               java/util/Iterator
  #158 = Utf8               hasNext
  #159 = Utf8               ()Z
  #160 = InterfaceMethodref #155.#161     // java/util/Iterator.next:()Ljava/lang/Object;
  #161 = NameAndType        #162:#163     // next:()Ljava/lang/Object;
  #162 = Utf8               next
  #163 = Utf8               ()Ljava/lang/Object;
  #164 = Class              #165          // ext/mods/gameserver/model/residence/castle/Castle
  #165 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #166 = Methodref          #28.#167      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #167 = NameAndType        #168:#159     // isClanLeader:()Z
  #168 = Utf8               isClanLeader
  #169 = Methodref          #164.#170     // ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
  #170 = NameAndType        #171:#172     // getSkillsLeader:()Ljava/util/Map;
  #171 = Utf8               getSkillsLeader
  #172 = Utf8               ()Ljava/util/Map;
  #173 = Methodref          #164.#174     // ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
  #174 = NameAndType        #175:#172     // getSkillsMember:()Ljava/util/Map;
  #175 = Utf8               getSkillsMember
  #176 = Methodref          #164.#177     // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #177 = NameAndType        #178:#12      // getId:()I
  #178 = Utf8               getId
  #179 = Methodref          #75.#180      // ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
  #180 = NameAndType        #181:#12      // getCastleId:()I
  #181 = Utf8               getCastleId
  #182 = InvokeDynamic      #0:#183       // #0:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #183 = NameAndType        #184:#185     // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #184 = Utf8               accept
  #185 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #186 = InterfaceMethodref #187.#188     // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
  #187 = Class              #189          // java/util/Map
  #188 = NameAndType        #190:#191     // forEach:(Ljava/util/function/BiConsumer;)V
  #189 = Utf8               java/util/Map
  #190 = Utf8               forEach
  #191 = Utf8               (Ljava/util/function/BiConsumer;)V
  #192 = Class              #193          // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
  #193 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
  #194 = Methodref          #192.#195     // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
  #195 = NameAndType        #5:#196       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
  #196 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;I)V
  #197 = Methodref          #75.#198      // ext/mods/gameserver/model/pledge/Clan.getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
  #198 = NameAndType        #199:#200     // getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
  #199 = Utf8               getAllSubPledges
  #200 = Utf8               ()[Lext/mods/gameserver/model/pledge/SubPledge;
  #201 = Methodref          #202.#177     // ext/mods/gameserver/model/pledge/SubPledge.getId:()I
  #202 = Class              #203          // ext/mods/gameserver/model/pledge/SubPledge
  #203 = Utf8               ext/mods/gameserver/model/pledge/SubPledge
  #204 = Methodref          #28.#205      // ext/mods/gameserver/model/actor/Player.setClanJoinExpiryTime:(J)V
  #205 = NameAndType        #206:#207     // setClanJoinExpiryTime:(J)V
  #206 = Utf8               setClanJoinExpiryTime
  #207 = Utf8               (J)V
  #208 = Methodref          #28.#209      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #209 = NameAndType        #210:#6       // broadcastUserInfo:()V
  #210 = Utf8               broadcastUserInfo
  #211 = InvokeDynamic      #1:#212       // #1:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #212 = NameAndType        #213:#214     // test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #213 = Utf8               test
  #214 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #215 = InvokeDynamic      #2:#216       // #2:accept:()Ljava/util/function/Consumer;
  #216 = NameAndType        #184:#217     // accept:()Ljava/util/function/Consumer;
  #217 = Utf8               ()Ljava/util/function/Consumer;
  #218 = Methodref          #28.#219      // ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #219 = NameAndType        #220:#221     // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #220 = Utf8               forEachKnownType
  #221 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #222 = Methodref          #34.#223      // ext/mods/gameserver/model/actor/container/player/Request.onRequestResponse:()V
  #223 = NameAndType        #224:#6       // onRequestResponse:()V
  #224 = Utf8               onRequestResponse
  #225 = Methodref          #75.#226      // ext/mods/gameserver/model/pledge/Clan.getWarList:()Ljava/util/Set;
  #226 = NameAndType        #227:#228     // getWarList:()Ljava/util/Set;
  #227 = Utf8               getWarList
  #228 = Utf8               ()Ljava/util/Set;
  #229 = Methodref          #230.#231     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #230 = Class              #232          // java/lang/Integer
  #231 = NameAndType        #233:#234     // valueOf:(I)Ljava/lang/Integer;
  #232 = Utf8               java/lang/Integer
  #233 = Utf8               valueOf
  #234 = Utf8               (I)Ljava/lang/Integer;
  #235 = InterfaceMethodref #236.#237     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #236 = Class              #238          // java/util/Set
  #237 = NameAndType        #239:#240     // contains:(Ljava/lang/Object;)Z
  #238 = Utf8               java/util/Set
  #239 = Utf8               contains
  #240 = Utf8               (Ljava/lang/Object;)Z
  #241 = Methodref          #242.#243     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #242 = Class              #244          // ext/mods/gameserver/data/SkillTable
  #243 = NameAndType        #142:#245     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #244 = Utf8               ext/mods/gameserver/data/SkillTable
  #245 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #246 = Methodref          #230.#247     // java/lang/Integer.intValue:()I
  #247 = NameAndType        #248:#12      // intValue:()I
  #248 = Utf8               intValue
  #249 = Methodref          #242.#250     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #250 = NameAndType        #251:#252     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #251 = Utf8               getInfo
  #252 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #253 = Methodref          #28.#254      // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #254 = NameAndType        #255:#256     // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #255 = Utf8               addSkill
  #256 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
  #257 = Utf8               Code
  #258 = Utf8               LineNumberTable
  #259 = Utf8               LocalVariableTable
  #260 = Utf8               this
  #261 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge;
  #262 = Utf8               readImpl
  #263 = Utf8               runImpl
  #264 = Utf8               rjp
  #265 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestJoinPledge;
  #266 = Utf8               skill
  #267 = Utf8               Ljava/util/Map;
  #268 = Utf8               castle
  #269 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #270 = Utf8               sp
  #271 = Utf8               Lext/mods/gameserver/model/pledge/SubPledge;
  #272 = Utf8               clan
  #273 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #274 = Utf8               player
  #275 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #276 = Utf8               requestor
  #277 = Utf8               LocalVariableTypeTable
  #278 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #279 = Utf8               StackMapTable
  #280 = Class              #281          // "[Lext/mods/gameserver/model/pledge/SubPledge;"
  #281 = Utf8               [Lext/mods/gameserver/model/pledge/SubPledge;
  #282 = Utf8               lambda$runImpl$1
  #283 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)Z
  #284 = Utf8               attacker
  #285 = Utf8               lambda$runImpl$0
  #286 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #287 = Utf8               skillId
  #288 = Utf8               Ljava/lang/Integer;
  #289 = Utf8               skillLvl
  #290 = Utf8               SourceFile
  #291 = Utf8               RequestAnswerJoinPledge.java
  #292 = Utf8               BootstrapMethods
  #293 = MethodType         #294          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #294 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #295 = MethodHandle       6:#296        // REF_invokeStatic ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.lambda$runImpl$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #296 = Methodref          #8.#297       // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.lambda$runImpl$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #297 = NameAndType        #285:#286     // lambda$runImpl$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #298 = MethodType         #299          //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #299 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #300 = MethodType         #240          //  (Ljava/lang/Object;)Z
  #301 = MethodHandle       6:#302        // REF_invokeStatic ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.lambda$runImpl$1:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)Z
  #302 = Methodref          #8.#303       // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.lambda$runImpl$1:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)Z
  #303 = NameAndType        #282:#283     // lambda$runImpl$1:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)Z
  #304 = MethodType         #305          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #305 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #306 = MethodType         #307          //  (Ljava/lang/Object;)V
  #307 = Utf8               (Ljava/lang/Object;)V
  #308 = MethodHandle       5:#208        // REF_invokeVirtual ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #309 = MethodType         #109          //  (Lext/mods/gameserver/model/actor/Player;)V
  #310 = MethodHandle       6:#311        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #311 = Methodref          #312.#313     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #312 = Class              #314          // java/lang/invoke/LambdaMetafactory
  #313 = NameAndType        #315:#316     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #314 = Utf8               java/lang/invoke/LambdaMetafactory
  #315 = Utf8               metafactory
  #316 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #317 = Utf8               InnerClasses
  #318 = Class              #319          // java/lang/invoke/MethodHandles$Lookup
  #319 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #320 = Class              #321          // java/lang/invoke/MethodHandles
  #321 = Utf8               java/lang/invoke/MethodHandles
  #322 = Utf8               Lookup
{
  public ext.mods.gameserver.network.clientpackets.RequestAnswerJoinPledge();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _answer:I
         8: return
      LineNumberTable:
        line 42: 0
        line 43: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=8, locals=9, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
        20: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/container/player/Request.getPartner:()Lext/mods/gameserver/model/actor/Player;
        23: astore_2
        24: aload_2
        25: ifnonnull     29
        28: return
        29: aload_0
        30: getfield      #13                 // Field _answer:I
        33: ifne          67
        36: aload_1
        37: getstatic     #38                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_DID_NOT_RESPOND_TO_S1_CLAN_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
        40: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        43: aload_2
        44: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        47: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        50: aload_2
        51: getstatic     #58                 // Field ext/mods/gameserver/network/SystemMessageId.S1_DID_NOT_RESPOND_TO_CLAN_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
        54: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        57: aload_1
        58: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        61: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        64: goto          504
        67: aload_2
        68: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
        71: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/container/player/Request.getRequestPacket:()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
        74: astore        4
        76: aload         4
        78: instanceof    #65                 // class ext/mods/gameserver/network/clientpackets/RequestJoinPledge
        81: ifeq          93
        84: aload         4
        86: checkcast     #65                 // class ext/mods/gameserver/network/clientpackets/RequestJoinPledge
        89: astore_3
        90: goto          94
        93: return
        94: aload_2
        95: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        98: astore        4
       100: aload         4
       102: aload_2
       103: aload_1
       104: aload_3
       105: invokevirtual #71                 // Method ext/mods/gameserver/network/clientpackets/RequestJoinPledge.getPledgeType:()I
       108: invokevirtual #74                 // Method ext/mods/gameserver/model/pledge/Clan.checkClanJoinCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)Z
       111: ifeq          504
       114: aload_1
       115: new           #80                 // class ext/mods/gameserver/network/serverpackets/JoinPledge
       118: dup
       119: aload_2
       120: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       123: invokespecial #85                 // Method ext/mods/gameserver/network/serverpackets/JoinPledge."<init>":(I)V
       126: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       129: aload_1
       130: aload_3
       131: invokevirtual #71                 // Method ext/mods/gameserver/network/clientpackets/RequestJoinPledge.getPledgeType:()I
       134: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.setPledgeType:(I)V
       137: aload_3
       138: invokevirtual #71                 // Method ext/mods/gameserver/network/clientpackets/RequestJoinPledge.getPledgeType:()I
       141: lookupswitch  { // 7

                      -1: 208

                     100: 228

                     200: 228

                    1001: 237

                    1002: 237

                    2001: 237

                    2002: 237
                 default: 246
            }
       208: aload_1
       209: bipush        9
       211: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
       214: aload_1
       215: aload_1
       216: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       219: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       222: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.setLvlJoinedAcademy:(I)V
       225: goto          252
       228: aload_1
       229: bipush        7
       231: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
       234: goto          252
       237: aload_1
       238: bipush        8
       240: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
       243: goto          252
       246: aload_1
       247: bipush        6
       249: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
       252: aload         4
       254: aload_1
       255: invokevirtual #106                // Method ext/mods/gameserver/model/pledge/Clan.addClanMember:(Lext/mods/gameserver/model/actor/Player;)V
       258: aload_1
       259: getstatic     #110                // Field ext/mods/gameserver/network/SystemMessageId.ENTERED_THE_CLAN:Lext/mods/gameserver/network/SystemMessageId;
       262: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       265: aload         4
       267: aload_1
       268: iconst_2
       269: anewarray     #116                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       272: dup
       273: iconst_0
       274: getstatic     #118                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_JOINED_CLAN:Lext/mods/gameserver/network/SystemMessageId;
       277: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       280: aload_1
       281: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       284: aastore
       285: dup
       286: iconst_1
       287: new           #121                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAdd
       290: dup
       291: aload_1
       292: invokespecial #123                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAdd."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       295: aastore
       296: invokevirtual #125                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembersExcept:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       299: aload         4
       301: iconst_1
       302: anewarray     #116                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       305: dup
       306: iconst_0
       307: new           #129                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
       310: dup
       311: aload         4
       313: invokespecial #131                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       316: aastore
       317: invokevirtual #134                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       320: invokestatic  #138                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       323: invokevirtual #144                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
       326: invokeinterface #148,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       331: astore        5
       333: aload         5
       335: invokeinterface #154,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       340: ifeq          408
       343: aload         5
       345: invokeinterface #160,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       350: checkcast     #164                // class ext/mods/gameserver/model/residence/castle/Castle
       353: astore        6
       355: aload_1
       356: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       359: ifeq          370
       362: aload         6
       364: invokevirtual #169                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
       367: goto          375
       370: aload         6
       372: invokevirtual #173                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
       375: astore        7
       377: aload         6
       379: invokevirtual #176                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       382: aload_1
       383: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       386: invokevirtual #179                // Method ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
       389: if_icmpne     405
       392: aload         7
       394: aload_1
       395: invokedynamic #182,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       400: invokeinterface #186,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       405: goto          333
       408: aload_1
       409: new           #192                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
       412: dup
       413: aload         4
       415: iconst_0
       416: invokespecial #194                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
       419: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       422: aload_1
       423: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       426: invokevirtual #197                // Method ext/mods/gameserver/model/pledge/Clan.getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
       429: astore        5
       431: aload         5
       433: arraylength
       434: istore        6
       436: iconst_0
       437: istore        7
       439: iload         7
       441: iload         6
       443: if_icmpge     477
       446: aload         5
       448: iload         7
       450: aaload
       451: astore        8
       453: aload_1
       454: new           #192                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
       457: dup
       458: aload         4
       460: aload         8
       462: invokevirtual #201                // Method ext/mods/gameserver/model/pledge/SubPledge.getId:()I
       465: invokespecial #194                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
       468: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       471: iinc          7, 1
       474: goto          439
       477: aload_1
       478: lconst_0
       479: invokevirtual #204                // Method ext/mods/gameserver/model/actor/Player.setClanJoinExpiryTime:(J)V
       482: aload_1
       483: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       486: aload_1
       487: ldc           #28                 // class ext/mods/gameserver/model/actor/Player
       489: aload         4
       491: invokedynamic #211,  0            // InvokeDynamic #1:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
       496: invokedynamic #215,  0            // InvokeDynamic #2:accept:()Ljava/util/function/Consumer;
       501: invokevirtual #218                // Method ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
       504: aload_1
       505: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
       508: invokevirtual #222                // Method ext/mods/gameserver/model/actor/container/player/Request.onRequestResponse:()V
       511: return
      LineNumberTable:
        line 48: 0
        line 49: 11
        line 50: 15
        line 52: 16
        line 53: 24
        line 54: 28
        line 56: 29
        line 58: 36
        line 59: 50
        line 63: 67
        line 64: 93
        line 66: 94
        line 68: 100
        line 70: 114
        line 72: 129
        line 74: 137
        line 77: 208
        line 78: 214
        line 79: 225
        line 82: 228
        line 83: 234
        line 86: 237
        line 87: 243
        line 90: 246
        line 93: 252
        line 95: 258
        line 97: 265
        line 98: 299
        line 100: 320
        line 102: 355
        line 103: 377
        line 105: 392
        line 110: 405
        line 112: 408
        line 113: 422
        line 114: 453
        line 113: 471
        line 116: 477
        line 117: 482
        line 119: 486
        line 122: 504
        line 123: 511
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           90       3     3   rjp   Lext/mods/gameserver/network/clientpackets/RequestJoinPledge;
          377      28     7 skill   Ljava/util/Map;
          355      50     6 castle   Lext/mods/gameserver/model/residence/castle/Castle;
          453      18     8    sp   Lext/mods/gameserver/model/pledge/SubPledge;
           94     410     3   rjp   Lext/mods/gameserver/network/clientpackets/RequestJoinPledge;
          100     404     4  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     512     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge;
           11     501     1 player   Lext/mods/gameserver/model/actor/Player;
           24     488     2 requestor   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          377      28     7 skill   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 18
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 37 /* same */
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestJoinPledge ]
        frame_type = 252 /* append */
          offset_delta = 113
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 19 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 80
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 30
          locals = [ class "[Lext/mods/gameserver/model/pledge/SubPledge;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 37
        frame_type = 249 /* chop */
          offset_delta = 26
}
SourceFile: "RequestAnswerJoinPledge.java"
BootstrapMethods:
  0: #310 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #293 (Ljava/lang/Object;Ljava/lang/Object;)V
      #295 REF_invokeStatic ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.lambda$runImpl$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #298 (Ljava/lang/Integer;Ljava/lang/Integer;)V
  1: #310 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 (Ljava/lang/Object;)Z
      #301 REF_invokeStatic ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge.lambda$runImpl$1:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)Z
      #304 (Lext/mods/gameserver/model/actor/Player;)Z
  2: #310 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #306 (Ljava/lang/Object;)V
      #308 REF_invokeVirtual ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      #309 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static final #322= #318 of #320; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
