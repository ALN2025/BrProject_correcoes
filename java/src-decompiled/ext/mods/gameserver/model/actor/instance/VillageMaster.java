// Bytecode for: ext.mods.gameserver.model.actor.instance.VillageMaster
// File: ext\mods\gameserver\model\actor\instance\VillageMaster.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/VillageMaster.class
  Last modified 9 de jul de 2026; size 24023 bytes
  MD5 checksum baaab7108032a6526cee24b1cf45ed76
  Compiled from "VillageMaster.java"
public class ext.mods.gameserver.model.actor.instance.VillageMaster extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #86                         // ext/mods/gameserver/model/actor/instance/VillageMaster
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 13, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            //
    #8 = Utf8
    #9 = InvokeDynamic      #0:#10        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #10 = NameAndType        #11:#12       // makeConcatWithConstants:(I)Ljava/lang/String;
   #11 = Utf8               makeConcatWithConstants
   #12 = Utf8               (I)Ljava/lang/String;
   #13 = InvokeDynamic      #1:#14        // #1:makeConcatWithConstants:(II)Ljava/lang/String;
   #14 = NameAndType        #11:#15       // makeConcatWithConstants:(II)Ljava/lang/String;
   #15 = Utf8               (II)Ljava/lang/String;
   #16 = InvokeDynamic      #2:#17        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #17 = NameAndType        #11:#18       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #18 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #19 = String             #20           //
   #20 = Utf8
   #21 = Methodref          #22.#23       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #22 = Class              #24           // java/lang/String
   #23 = NameAndType        #25:#26       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #24 = Utf8               java/lang/String
   #25 = Utf8               split
   #26 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #27 = String             #28           // create_clan
   #28 = Utf8               create_clan
   #29 = Methodref          #22.#30       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #30 = NameAndType        #31:#32       // startsWith:(Ljava/lang/String;)Z
   #31 = Utf8               startsWith
   #32 = Utf8               (Ljava/lang/String;)Z
   #33 = Methodref          #22.#34       // java/lang/String.length:()I
   #34 = NameAndType        #35:#36       // length:()I
   #35 = Utf8               length
   #36 = Utf8               ()I
   #37 = Methodref          #22.#38       // java/lang/String.substring:(I)Ljava/lang/String;
   #38 = NameAndType        #39:#12       // substring:(I)Ljava/lang/String;
   #39 = Utf8               substring
   #40 = Fieldref           #41.#42       // ext/mods/Config.CLAN_ALLY_NAME_TEMPLATE:Ljava/lang/String;
   #41 = Class              #43           // ext/mods/Config
   #42 = NameAndType        #44:#45       // CLAN_ALLY_NAME_TEMPLATE:Ljava/lang/String;
   #43 = Utf8               ext/mods/Config
   #44 = Utf8               CLAN_ALLY_NAME_TEMPLATE
   #45 = Utf8               Ljava/lang/String;
   #46 = Methodref          #47.#48       // ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
   #47 = Class              #49           // ext/mods/commons/lang/StringUtil
   #48 = NameAndType        #50:#51       // isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
   #49 = Utf8               ext/mods/commons/lang/StringUtil
   #50 = Utf8               isValidString
   #51 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
   #52 = Fieldref           #53.#54       // ext/mods/gameserver/network/SystemMessageId.CLAN_NAME_INVALID:Lext/mods/gameserver/network/SystemMessageId;
   #53 = Class              #55           // ext/mods/gameserver/network/SystemMessageId
   #54 = NameAndType        #56:#57       // CLAN_NAME_INVALID:Lext/mods/gameserver/network/SystemMessageId;
   #55 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #56 = Utf8               CLAN_NAME_INVALID
   #57 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #59 = Class              #61           // ext/mods/gameserver/model/actor/Player
   #60 = NameAndType        #62:#63       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #61 = Utf8               ext/mods/gameserver/model/actor/Player
   #62 = Utf8               sendPacket
   #63 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #64 = Methodref          #65.#66       // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #65 = Class              #67           // ext/mods/gameserver/data/sql/ClanTable
   #66 = NameAndType        #68:#69       // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #67 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #68 = Utf8               getInstance
   #69 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #70 = Methodref          #65.#71       // ext/mods/gameserver/data/sql/ClanTable.createClan:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
   #71 = NameAndType        #72:#73       // createClan:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
   #72 = Utf8               createClan
   #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
   #74 = String             #75           // create_academy
   #75 = Utf8               create_academy
   #76 = Methodref          #22.#77       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #77 = NameAndType        #78:#32       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #78 = Utf8               equalsIgnoreCase
   #79 = Methodref          #22.#80       // java/lang/String.isEmpty:()Z
   #80 = NameAndType        #81:#82       // isEmpty:()Z
   #81 = Utf8               isEmpty
   #82 = Utf8               ()Z
   #83 = Class              #84           // ext/mods/gameserver/model/pledge/Clan
   #84 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #85 = Methodref          #86.#87       // ext/mods/gameserver/model/actor/instance/VillageMaster.createSubPledge:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;II)V
   #86 = Class              #88           // ext/mods/gameserver/model/actor/instance/VillageMaster
   #87 = NameAndType        #89:#90       // createSubPledge:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;II)V
   #88 = Utf8               ext/mods/gameserver/model/actor/instance/VillageMaster
   #89 = Utf8               createSubPledge
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;II)V
   #91 = String             #92           // rename_pledge
   #92 = Utf8               rename_pledge
   #93 = Methodref          #59.#94       // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #94 = NameAndType        #95:#82       // isClanLeader:()Z
   #95 = Utf8               isClanLeader
   #96 = Fieldref           #53.#97       // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
   #97 = NameAndType        #98:#57       // YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
   #98 = Utf8               YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT
   #99 = Methodref          #59.#100      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #100 = NameAndType        #101:#102     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #101 = Utf8               getClan
  #102 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #103 = Methodref          #104.#105     // java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
  #104 = Class              #106          // java/lang/Integer
  #105 = NameAndType        #107:#108     // valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
  #106 = Utf8               java/lang/Integer
  #107 = Utf8               valueOf
  #108 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #109 = Methodref          #104.#110     // java/lang/Integer.intValue:()I
  #110 = NameAndType        #111:#36      // intValue:()I
  #111 = Utf8               intValue
  #112 = Methodref          #83.#113      // ext/mods/gameserver/model/pledge/Clan.getSubPledge:(I)Lext/mods/gameserver/model/pledge/SubPledge;
  #113 = NameAndType        #114:#115     // getSubPledge:(I)Lext/mods/gameserver/model/pledge/SubPledge;
  #114 = Utf8               getSubPledge
  #115 = Utf8               (I)Lext/mods/gameserver/model/pledge/SubPledge;
  #116 = String             #117          // Pledge doesn\'t exist.
  #117 = Utf8               Pledge doesn\'t exist.
  #118 = Methodref          #59.#119      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #119 = NameAndType        #120:#121     // sendMessage:(Ljava/lang/String;)V
  #120 = Utf8               sendMessage
  #121 = Utf8               (Ljava/lang/String;)V
  #122 = Methodref          #47.#123      // ext/mods/commons/lang/StringUtil.isAlphaNumeric:(Ljava/lang/String;)Z
  #123 = NameAndType        #124:#32      // isAlphaNumeric:(Ljava/lang/String;)Z
  #124 = Utf8               isAlphaNumeric
  #125 = Fieldref           #53.#126      // ext/mods/gameserver/network/SystemMessageId.CLAN_NAME_LENGTH_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #126 = NameAndType        #127:#57      // CLAN_NAME_LENGTH_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #127 = Utf8               CLAN_NAME_LENGTH_INCORRECT
  #128 = Methodref          #129.#130     // ext/mods/gameserver/model/pledge/SubPledge.setName:(Ljava/lang/String;)V
  #129 = Class              #131          // ext/mods/gameserver/model/pledge/SubPledge
  #130 = NameAndType        #132:#121     // setName:(Ljava/lang/String;)V
  #131 = Utf8               ext/mods/gameserver/model/pledge/SubPledge
  #132 = Utf8               setName
  #133 = Methodref          #83.#134      // ext/mods/gameserver/model/pledge/Clan.updateSubPledgeInDB:(Lext/mods/gameserver/model/pledge/SubPledge;)V
  #134 = NameAndType        #135:#136     // updateSubPledgeInDB:(Lext/mods/gameserver/model/pledge/SubPledge;)V
  #135 = Utf8               updateSubPledgeInDB
  #136 = Utf8               (Lext/mods/gameserver/model/pledge/SubPledge;)V
  #137 = Class              #138          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #138 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #139 = Class              #140          // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
  #140 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
  #141 = Methodref          #129.#142     // ext/mods/gameserver/model/pledge/SubPledge.getId:()I
  #142 = NameAndType        #143:#36      // getId:()I
  #143 = Utf8               getId
  #144 = Methodref          #139.#145     // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
  #145 = NameAndType        #5:#146       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
  #146 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;I)V
  #147 = Methodref          #83.#148      // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #148 = NameAndType        #149:#150     // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #149 = Utf8               broadcastToMembers
  #150 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #151 = String             #152          // create_royal
  #152 = Utf8               create_royal
  #153 = String             #154          // create_knight
  #154 = Utf8               create_knight
  #155 = String             #156          // assign_subpl_leader
  #156 = Utf8               assign_subpl_leader
  #157 = Methodref          #86.#158      // ext/mods/gameserver/model/actor/instance/VillageMaster.assignSubPledgeLeader:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #158 = NameAndType        #159:#160     // assignSubPledgeLeader:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #159 = Utf8               assignSubPledgeLeader
  #160 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #161 = String             #162          // create_ally
  #162 = Utf8               create_ally
  #163 = Fieldref           #53.#164      // ext/mods/gameserver/network/SystemMessageId.INCORRECT_ALLIANCE_NAME:Lext/mods/gameserver/network/SystemMessageId;
  #164 = NameAndType        #165:#57      // INCORRECT_ALLIANCE_NAME:Lext/mods/gameserver/network/SystemMessageId;
  #165 = Utf8               INCORRECT_ALLIANCE_NAME
  #166 = Fieldref           #53.#167      // ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEADER_CREATE_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
  #167 = NameAndType        #168:#57      // ONLY_CLAN_LEADER_CREATE_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
  #168 = Utf8               ONLY_CLAN_LEADER_CREATE_ALLIANCE
  #169 = Methodref          #83.#170      // ext/mods/gameserver/model/pledge/Clan.createAlly:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #170 = NameAndType        #171:#172     // createAlly:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #171 = Utf8               createAlly
  #172 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #173 = Class              #174          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #174 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #175 = Methodref          #86.#176      // ext/mods/gameserver/model/actor/instance/VillageMaster.getObjectId:()I
  #176 = NameAndType        #177:#36      // getObjectId:()I
  #177 = Utf8               getObjectId
  #178 = Methodref          #173.#179     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #179 = NameAndType        #5:#180       // "<init>":(I)V
  #180 = Utf8               (I)V
  #181 = Methodref          #59.#182      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #182 = NameAndType        #183:#184     // getLocale:()Ljava/util/Locale;
  #183 = Utf8               getLocale
  #184 = Utf8               ()Ljava/util/Locale;
  #185 = String             #186          // html/script/feature/Alliance/9001-05.htm
  #186 = Utf8               html/script/feature/Alliance/9001-05.htm
  #187 = Methodref          #173.#188     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #188 = NameAndType        #189:#190     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #189 = Utf8               setFile
  #190 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #191 = Methodref          #59.#192      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #192 = NameAndType        #62:#193      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #193 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #194 = String             #195          // dissolve_ally
  #195 = Utf8               dissolve_ally
  #196 = Methodref          #83.#197      // ext/mods/gameserver/model/pledge/Clan.dissolveAlly:(Lext/mods/gameserver/model/actor/Player;)V
  #197 = NameAndType        #198:#199     // dissolveAlly:(Lext/mods/gameserver/model/actor/Player;)V
  #198 = Utf8               dissolveAlly
  #199 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #200 = String             #201          // dissolve_clan
  #201 = Utf8               dissolve_clan
  #202 = Methodref          #83.#203      // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
  #203 = NameAndType        #204:#36      // getAllyId:()I
  #204 = Utf8               getAllyId
  #205 = Fieldref           #53.#206      // ext/mods/gameserver/network/SystemMessageId.CANNOT_DISPERSE_THE_CLANS_IN_ALLY:Lext/mods/gameserver/network/SystemMessageId;
  #206 = NameAndType        #207:#57      // CANNOT_DISPERSE_THE_CLANS_IN_ALLY:Lext/mods/gameserver/network/SystemMessageId;
  #207 = Utf8               CANNOT_DISPERSE_THE_CLANS_IN_ALLY
  #208 = Methodref          #83.#209      // ext/mods/gameserver/model/pledge/Clan.isAtWar:()Z
  #209 = NameAndType        #210:#82      // isAtWar:()Z
  #210 = Utf8               isAtWar
  #211 = Fieldref           #53.#212      // ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_WHILE_IN_WAR:Lext/mods/gameserver/network/SystemMessageId;
  #212 = NameAndType        #213:#57      // CANNOT_DISSOLVE_WHILE_IN_WAR:Lext/mods/gameserver/network/SystemMessageId;
  #213 = Utf8               CANNOT_DISSOLVE_WHILE_IN_WAR
  #214 = Methodref          #83.#215      // ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
  #215 = NameAndType        #216:#82      // hasCastle:()Z
  #216 = Utf8               hasCastle
  #217 = Methodref          #83.#218      // ext/mods/gameserver/model/pledge/Clan.hasClanHall:()Z
  #218 = NameAndType        #219:#82      // hasClanHall:()Z
  #219 = Utf8               hasClanHall
  #220 = Fieldref           #53.#221      // ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_WHILE_OWNING_CLAN_HALL_OR_CASTLE:Lext/mods/gameserver/network/SystemMessageId;
  #221 = NameAndType        #222:#57      // CANNOT_DISSOLVE_WHILE_OWNING_CLAN_HALL_OR_CASTLE:Lext/mods/gameserver/network/SystemMessageId;
  #222 = Utf8               CANNOT_DISSOLVE_WHILE_OWNING_CLAN_HALL_OR_CASTLE
  #223 = Methodref          #224.#225     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #224 = Class              #226          // ext/mods/gameserver/data/manager/CastleManager
  #225 = NameAndType        #68:#227      // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #226 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #227 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #228 = Methodref          #224.#229     // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
  #229 = NameAndType        #230:#231     // getCastles:()Ljava/util/Collection;
  #230 = Utf8               getCastles
  #231 = Utf8               ()Ljava/util/Collection;
  #232 = InterfaceMethodref #233.#234     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #233 = Class              #235          // java/util/Collection
  #234 = NameAndType        #236:#237     // iterator:()Ljava/util/Iterator;
  #235 = Utf8               java/util/Collection
  #236 = Utf8               iterator
  #237 = Utf8               ()Ljava/util/Iterator;
  #238 = InterfaceMethodref #239.#240     // java/util/Iterator.hasNext:()Z
  #239 = Class              #241          // java/util/Iterator
  #240 = NameAndType        #242:#82      // hasNext:()Z
  #241 = Utf8               java/util/Iterator
  #242 = Utf8               hasNext
  #243 = InterfaceMethodref #239.#244     // java/util/Iterator.next:()Ljava/lang/Object;
  #244 = NameAndType        #245:#246     // next:()Ljava/lang/Object;
  #245 = Utf8               next
  #246 = Utf8               ()Ljava/lang/Object;
  #247 = Class              #248          // ext/mods/gameserver/model/residence/castle/Castle
  #248 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #249 = Methodref          #247.#250     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #250 = NameAndType        #251:#252     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #251 = Utf8               getSiege
  #252 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #253 = Methodref          #254.#255     // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #254 = Class              #256          // ext/mods/gameserver/model/residence/castle/Siege
  #255 = NameAndType        #257:#258     // checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #256 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #257 = Utf8               checkSides
  #258 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
  #259 = Methodref          #254.#260     // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #260 = NameAndType        #261:#82      // isInProgress:()Z
  #261 = Utf8               isInProgress
  #262 = Fieldref           #53.#263      // ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_WHILE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #263 = NameAndType        #264:#57      // CANNOT_DISSOLVE_WHILE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #264 = Utf8               CANNOT_DISSOLVE_WHILE_IN_SIEGE
  #265 = Fieldref           #53.#266      // ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_CAUSE_CLAN_WILL_PARTICIPATE_IN_CASTLE_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #266 = NameAndType        #267:#57      // CANNOT_DISSOLVE_CAUSE_CLAN_WILL_PARTICIPATE_IN_CASTLE_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #267 = Utf8               CANNOT_DISSOLVE_CAUSE_CLAN_WILL_PARTICIPATE_IN_CASTLE_SIEGE
  #268 = Methodref          #83.#269      // ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
  #269 = NameAndType        #270:#271     // getDissolvingExpiryTime:()J
  #270 = Utf8               getDissolvingExpiryTime
  #271 = Utf8               ()J
  #272 = Methodref          #273.#274     // java/lang/System.currentTimeMillis:()J
  #273 = Class              #275          // java/lang/System
  #274 = NameAndType        #276:#271     // currentTimeMillis:()J
  #275 = Utf8               java/lang/System
  #276 = Utf8               currentTimeMillis
  #277 = Fieldref           #53.#278      // ext/mods/gameserver/network/SystemMessageId.DISSOLUTION_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
  #278 = NameAndType        #279:#57      // DISSOLUTION_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
  #279 = Utf8               DISSOLUTION_IN_PROGRESS
  #280 = Fieldref           #41.#281      // ext/mods/Config.CLAN_DISSOLVE_DAYS:I
  #281 = NameAndType        #282:#283     // CLAN_DISSOLVE_DAYS:I
  #282 = Utf8               CLAN_DISSOLVE_DAYS
  #283 = Utf8               I
  #284 = Long               86400000l
  #286 = Methodref          #83.#287      // ext/mods/gameserver/model/pledge/Clan.setDissolvingExpiryTime:(J)V
  #287 = NameAndType        #288:#289     // setDissolvingExpiryTime:(J)V
  #288 = Utf8               setDissolvingExpiryTime
  #289 = Utf8               (J)V
  #290 = Class              #291          // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
  #291 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
  #292 = Methodref          #290.#293     // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #293 = NameAndType        #5:#294       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #294 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #295 = Methodref          #83.#296      // ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
  #296 = NameAndType        #297:#298     // updateClanInDB:()V
  #297 = Utf8               updateClanInDB
  #298 = Utf8               ()V
  #299 = Methodref          #65.#300      // ext/mods/gameserver/data/sql/ClanTable.scheduleRemoveClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #300 = NameAndType        #301:#294     // scheduleRemoveClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #301 = Utf8               scheduleRemoveClan
  #302 = Methodref          #65.#303      // ext/mods/gameserver/data/sql/ClanTable.destroyClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #303 = NameAndType        #304:#294     // destroyClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #304 = Utf8               destroyClan
  #305 = Methodref          #59.#306      // ext/mods/gameserver/model/actor/Player.applyDeathPenalty:(ZZ)V
  #306 = NameAndType        #307:#308     // applyDeathPenalty:(ZZ)V
  #307 = Utf8               applyDeathPenalty
  #308 = Utf8               (ZZ)V
  #309 = String             #310          // change_clan_leader
  #310 = Utf8               change_clan_leader
  #311 = Methodref          #59.#312      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #312 = NameAndType        #313:#314     // getName:()Ljava/lang/String;
  #313 = Utf8               getName
  #314 = Utf8               ()Ljava/lang/String;
  #315 = Methodref          #83.#316      // ext/mods/gameserver/model/pledge/Clan.getClanMember:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/ClanMember;
  #316 = NameAndType        #317:#318     // getClanMember:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/ClanMember;
  #317 = Utf8               getClanMember
  #318 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/ClanMember;
  #319 = String             #320          // html/script/feature/Clan/9000-07-error.htm
  #320 = Utf8               html/script/feature/Clan/9000-07-error.htm
  #321 = Methodref          #322.#323     // ext/mods/gameserver/model/pledge/ClanMember.isOnline:()Z
  #322 = Class              #324          // ext/mods/gameserver/model/pledge/ClanMember
  #323 = NameAndType        #325:#82      // isOnline:()Z
  #324 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
  #325 = Utf8               isOnline
  #326 = Fieldref           #53.#327      // ext/mods/gameserver/network/SystemMessageId.INVITED_USER_NOT_ONLINE:Lext/mods/gameserver/network/SystemMessageId;
  #327 = NameAndType        #328:#57      // INVITED_USER_NOT_ONLINE:Lext/mods/gameserver/network/SystemMessageId;
  #328 = Utf8               INVITED_USER_NOT_ONLINE
  #329 = Methodref          #322.#330     // ext/mods/gameserver/model/pledge/ClanMember.getPledgeType:()I
  #330 = NameAndType        #331:#36      // getPledgeType:()I
  #331 = Utf8               getPledgeType
  #332 = String             #333          // Selected member cannot be found in main clan.
  #333 = Utf8               Selected member cannot be found in main clan.
  #334 = Methodref          #83.#335      // ext/mods/gameserver/model/pledge/Clan.getNewLeaderId:()I
  #335 = NameAndType        #336:#36      // getNewLeaderId:()I
  #336 = Utf8               getNewLeaderId
  #337 = Methodref          #322.#176     // ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
  #338 = Methodref          #83.#339      // ext/mods/gameserver/model/pledge/Clan.setNewLeaderId:(IZ)V
  #339 = NameAndType        #340:#341     // setNewLeaderId:(IZ)V
  #340 = Utf8               setNewLeaderId
  #341 = Utf8               (IZ)V
  #342 = String             #343          // html/script/feature/Clan/9000-07-success.htm
  #343 = Utf8               html/script/feature/Clan/9000-07-success.htm
  #344 = String             #345          // html/script/feature/Clan/9000-07-in-progress.htm
  #345 = Utf8               html/script/feature/Clan/9000-07-in-progress.htm
  #346 = String             #347          // cancel_clan_leader_change
  #347 = Utf8               cancel_clan_leader_change
  #348 = String             #349          // html/script/feature/Clan/9000-08-success.htm
  #349 = Utf8               html/script/feature/Clan/9000-08-success.htm
  #350 = String             #351          // html/script/feature/Clan/9000-08-no.htm
  #351 = Utf8               html/script/feature/Clan/9000-08-no.htm
  #352 = String             #353          // recover_clan
  #353 = Utf8               recover_clan
  #354 = Fieldref           #53.#355      // ext/mods/gameserver/network/SystemMessageId.NO_REQUESTS_TO_DISPERSE:Lext/mods/gameserver/network/SystemMessageId;
  #355 = NameAndType        #356:#57      // NO_REQUESTS_TO_DISPERSE:Lext/mods/gameserver/network/SystemMessageId;
  #356 = Utf8               NO_REQUESTS_TO_DISPERSE
  #357 = String             #358          // increase_clan_level
  #358 = Utf8               increase_clan_level
  #359 = Methodref          #83.#360      // ext/mods/gameserver/model/pledge/Clan.levelUpClan:(Lext/mods/gameserver/model/actor/Player;)Z
  #360 = NameAndType        #361:#362     // levelUpClan:(Lext/mods/gameserver/model/actor/Player;)Z
  #361 = Utf8               levelUpClan
  #362 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #363 = Class              #364          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #364 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #365 = Methodref          #363.#366     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #366 = NameAndType        #5:#367       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #367 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #368 = Methodref          #59.#369      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #369 = NameAndType        #370:#193     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #370 = Utf8               broadcastPacket
  #371 = String             #372          // learn_clan_skills
  #372 = Utf8               learn_clan_skills
  #373 = Methodref          #86.#374      // ext/mods/gameserver/model/actor/instance/VillageMaster.showPledgeSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #374 = NameAndType        #375:#199     // showPledgeSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #375 = Utf8               showPledgeSkillList
  #376 = String             #377          // Subclass
  #377 = Utf8               Subclass
  #378 = Methodref          #59.#379      // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #379 = NameAndType        #380:#381     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #380 = Utf8               getCast
  #381 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #382 = Methodref          #383.#384     // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #383 = Class              #385          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #384 = NameAndType        #386:#82      // isCastingNow:()Z
  #385 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #386 = Utf8               isCastingNow
  #387 = Methodref          #59.#388      // ext/mods/gameserver/model/actor/Player.isAllSkillsDisabled:()Z
  #388 = NameAndType        #389:#82      // isAllSkillsDisabled:()Z
  #389 = Utf8               isAllSkillsDisabled
  #390 = Fieldref           #53.#391      // ext/mods/gameserver/network/SystemMessageId.SUBCLASS_NO_CHANGE_OR_CREATE_WHILE_SKILL_IN_USE:Lext/mods/gameserver/network/SystemMessageId;
  #391 = NameAndType        #392:#57      // SUBCLASS_NO_CHANGE_OR_CREATE_WHILE_SKILL_IN_USE:Lext/mods/gameserver/network/SystemMessageId;
  #392 = Utf8               SUBCLASS_NO_CHANGE_OR_CREATE_WHILE_SKILL_IN_USE
  #393 = Methodref          #394.#395     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #394 = Class              #396          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #395 = NameAndType        #68:#397      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #396 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #397 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #398 = Methodref          #394.#399     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
  #399 = NameAndType        #400:#362     // isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
  #400 = Utf8               isRegisteredInComp
  #401 = Methodref          #394.#402     // ext/mods/gameserver/model/olympiad/OlympiadManager.unRegisterNoble:(Lext/mods/gameserver/model/actor/Player;)Z
  #402 = NameAndType        #403:#362     // unRegisterNoble:(Lext/mods/gameserver/model/actor/Player;)Z
  #403 = Utf8               unRegisterNoble
  #404 = Methodref          #22.#405      // java/lang/String.substring:(II)Ljava/lang/String;
  #405 = NameAndType        #39:#15       // substring:(II)Ljava/lang/String;
  #406 = Methodref          #22.#407      // java/lang/String.trim:()Ljava/lang/String;
  #407 = NameAndType        #408:#314     // trim:()Ljava/lang/String;
  #408 = Utf8               trim
  #409 = Methodref          #104.#410     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #410 = NameAndType        #411:#412     // parseInt:(Ljava/lang/String;)I
  #411 = Utf8               parseInt
  #412 = Utf8               (Ljava/lang/String;)I
  #413 = Methodref          #22.#414      // java/lang/String.indexOf:(II)I
  #414 = NameAndType        #415:#416     // indexOf:(II)I
  #415 = Utf8               indexOf
  #416 = Utf8               (II)I
  #417 = Class              #418          // java/lang/Exception
  #418 = Utf8               java/lang/Exception
  #419 = String             #420          // html/villagemaster/SubClass.htm
  #420 = Utf8               html/villagemaster/SubClass.htm
  #421 = Methodref          #59.#422      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #422 = NameAndType        #423:#424     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #423 = Utf8               getSummon
  #424 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #425 = Fieldref           #53.#426      // ext/mods/gameserver/network/SystemMessageId.CANT_SUBCLASS_WITH_SUMMONED_SERVITOR:Lext/mods/gameserver/network/SystemMessageId;
  #426 = NameAndType        #427:#57      // CANT_SUBCLASS_WITH_SUMMONED_SERVITOR:Lext/mods/gameserver/network/SystemMessageId;
  #427 = Utf8               CANT_SUBCLASS_WITH_SUMMONED_SERVITOR
  #428 = Methodref          #59.#429      // ext/mods/gameserver/model/actor/Player.isOverweight:()Z
  #429 = NameAndType        #430:#82      // isOverweight:()Z
  #430 = Utf8               isOverweight
  #431 = Fieldref           #53.#432      // ext/mods/gameserver/network/SystemMessageId.NOT_SUBCLASS_WHILE_OVERWEIGHT:Lext/mods/gameserver/network/SystemMessageId;
  #432 = NameAndType        #433:#57      // NOT_SUBCLASS_WHILE_OVERWEIGHT:Lext/mods/gameserver/network/SystemMessageId;
  #433 = Utf8               NOT_SUBCLASS_WHILE_OVERWEIGHT
  #434 = Methodref          #59.#435      // ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
  #435 = NameAndType        #436:#437     // getSubClasses:()Ljava/util/Map;
  #436 = Utf8               getSubClasses
  #437 = Utf8               ()Ljava/util/Map;
  #438 = InterfaceMethodref #439.#440     // java/util/Map.size:()I
  #439 = Class              #441          // java/util/Map
  #440 = NameAndType        #442:#36      // size:()I
  #441 = Utf8               java/util/Map
  #442 = Utf8               size
  #443 = String             #444          // html/villagemaster/SubClass_Fail.htm
  #444 = Utf8               html/villagemaster/SubClass_Fail.htm
  #445 = Methodref          #86.#446      // ext/mods/gameserver/model/actor/instance/VillageMaster.getAvailableSubClasses:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
  #446 = NameAndType        #447:#448     // getAvailableSubClasses:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
  #447 = Utf8               getAvailableSubClasses
  #448 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
  #449 = InterfaceMethodref #450.#80      // java/util/Set.isEmpty:()Z
  #450 = Class              #451          // java/util/Set
  #451 = Utf8               java/util/Set
  #452 = String             #453          // There are no sub classes available at this time.
  #453 = Utf8               There are no sub classes available at this time.
  #454 = Class              #455          // java/lang/StringBuilder
  #455 = Utf8               java/lang/StringBuilder
  #456 = Methodref          #454.#179     // java/lang/StringBuilder."<init>":(I)V
  #457 = InterfaceMethodref #450.#234     // java/util/Set.iterator:()Ljava/util/Iterator;
  #458 = Class              #459          // ext/mods/gameserver/enums/actors/ClassId
  #459 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #460 = Class              #461          // java/lang/Object
  #461 = Utf8               java/lang/Object
  #462 = String             #463          // <a action=\"bypass -h npc_%objectId%_Subclass 4
  #463 = Utf8               <a action=\"bypass -h npc_%objectId%_Subclass 4
  #464 = Methodref          #458.#142     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #465 = Methodref          #104.#466     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #466 = NameAndType        #107:#467     // valueOf:(I)Ljava/lang/Integer;
  #467 = Utf8               (I)Ljava/lang/Integer;
  #468 = String             #469          // \" msg=\"1268;
  #469 = Utf8               \" msg=\"1268;
  #470 = String             #471          // \">
  #471 = Utf8               \">
  #472 = String             #473          // </a><br>
  #473 = Utf8               </a><br>
  #474 = Methodref          #47.#475      // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #475 = NameAndType        #476:#477     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #476 = Utf8               append
  #477 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #478 = String             #479          // html/villagemaster/SubClass_Add.htm
  #479 = Utf8               html/villagemaster/SubClass_Add.htm
  #480 = String             #481          // %list%
  #481 = Utf8               %list%
  #482 = Methodref          #454.#483     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #483 = NameAndType        #484:#314     // toString:()Ljava/lang/String;
  #484 = Utf8               toString
  #485 = Methodref          #173.#486     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #486 = NameAndType        #487:#488     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #487 = Utf8               replace
  #488 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #489 = InterfaceMethodref #439.#80      // java/util/Map.isEmpty:()Z
  #490 = String             #491          // html/villagemaster/SubClass_ChangeNo.htm
  #491 = Utf8               html/villagemaster/SubClass_ChangeNo.htm
  #492 = Methodref          #59.#493      // ext/mods/gameserver/model/actor/Player.getBaseClass:()I
  #493 = NameAndType        #494:#36      // getBaseClass:()I
  #494 = Utf8               getBaseClass
  #495 = Methodref          #86.#496      // ext/mods/gameserver/model/actor/instance/VillageMaster.checkVillageMaster:(I)Z
  #496 = NameAndType        #497:#498     // checkVillageMaster:(I)Z
  #497 = Utf8               checkVillageMaster
  #498 = Utf8               (I)Z
  #499 = String             #500          // <a action=\"bypass -h npc_%objectId%_Subclass 5 0\">
  #500 = Utf8               <a action=\"bypass -h npc_%objectId%_Subclass 5 0\">
  #501 = Methodref          #502.#503     // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #502 = Class              #504          // ext/mods/gameserver/data/xml/PlayerData
  #503 = NameAndType        #68:#505      // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #504 = Utf8               ext/mods/gameserver/data/xml/PlayerData
  #505 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
  #506 = Methodref          #502.#507     // ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
  #507 = NameAndType        #508:#12      // getClassNameById:(I)Ljava/lang/String;
  #508 = Utf8               getClassNameById
  #509 = InterfaceMethodref #439.#510     // java/util/Map.values:()Ljava/util/Collection;
  #510 = NameAndType        #511:#231     // values:()Ljava/util/Collection;
  #511 = Utf8               values
  #512 = Class              #513          // ext/mods/gameserver/model/actor/container/player/SubClass
  #513 = Utf8               ext/mods/gameserver/model/actor/container/player/SubClass
  #514 = Methodref          #512.#515     // ext/mods/gameserver/model/actor/container/player/SubClass.getClassDefinition:()Lext/mods/gameserver/enums/actors/ClassId;
  #515 = NameAndType        #516:#517     // getClassDefinition:()Lext/mods/gameserver/enums/actors/ClassId;
  #516 = Utf8               getClassDefinition
  #517 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #518 = Methodref          #86.#519      // ext/mods/gameserver/model/actor/instance/VillageMaster.checkVillageMaster:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #519 = NameAndType        #497:#520     // checkVillageMaster:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #520 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
  #521 = String             #522          // <a action=\"bypass -h npc_%objectId%_Subclass 5
  #522 = Utf8               <a action=\"bypass -h npc_%objectId%_Subclass 5
  #523 = Methodref          #512.#524     // ext/mods/gameserver/model/actor/container/player/SubClass.getClassIndex:()I
  #524 = NameAndType        #525:#36      // getClassIndex:()I
  #525 = Utf8               getClassIndex
  #526 = Methodref          #454.#34      // java/lang/StringBuilder.length:()I
  #527 = String             #528          // html/villagemaster/SubClass_Change.htm
  #528 = Utf8               html/villagemaster/SubClass_Change.htm
  #529 = String             #530          // html/villagemaster/SubClass_ChangeNotFound.htm
  #530 = Utf8               html/villagemaster/SubClass_ChangeNotFound.htm
  #531 = String             #532          // html/villagemaster/SubClass_ModifyEmpty.htm
  #532 = Utf8               html/villagemaster/SubClass_ModifyEmpty.htm
  #533 = String             #534          // html/villagemaster/SubClass_Modify.htm
  #534 = Utf8               html/villagemaster/SubClass_Modify.htm
  #535 = InterfaceMethodref #439.#536     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #536 = NameAndType        #537:#538     // containsKey:(Ljava/lang/Object;)Z
  #537 = Utf8               containsKey
  #538 = Utf8               (Ljava/lang/Object;)Z
  #539 = String             #540          // %sub1%
  #540 = Utf8               %sub1%
  #541 = InterfaceMethodref #439.#542     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #542 = NameAndType        #543:#544     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #543 = Utf8               get
  #544 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #545 = Methodref          #512.#546     // ext/mods/gameserver/model/actor/container/player/SubClass.getClassId:()I
  #546 = NameAndType        #547:#36      // getClassId:()I
  #547 = Utf8               getClassId
  #548 = String             #549          // <a action=\"bypass -h npc_%objectId%_Subclass 6 1\">%sub1%</a><br>
  #549 = Utf8               <a action=\"bypass -h npc_%objectId%_Subclass 6 1\">%sub1%</a><br>
  #550 = String             #551          // %sub2%
  #551 = Utf8               %sub2%
  #552 = String             #553          // <a action=\"bypass -h npc_%objectId%_Subclass 6 2\">%sub2%</a><br>
  #553 = Utf8               <a action=\"bypass -h npc_%objectId%_Subclass 6 2\">%sub2%</a><br>
  #554 = String             #555          // %sub3%
  #555 = Utf8               %sub3%
  #556 = String             #557          // <a action=\"bypass -h npc_%objectId%_Subclass 6 3\">%sub3%</a><br>
  #557 = Utf8               <a action=\"bypass -h npc_%objectId%_Subclass 6 3\">%sub3%</a><br>
  #558 = Methodref          #59.#559      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #559 = NameAndType        #560:#561     // getClient:()Lext/mods/gameserver/network/GameClient;
  #560 = Utf8               getClient
  #561 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #562 = Fieldref           #563.#564     // ext/mods/gameserver/enums/FloodProtector.SUBCLASS:Lext/mods/gameserver/enums/FloodProtector;
  #563 = Class              #565          // ext/mods/gameserver/enums/FloodProtector
  #564 = NameAndType        #566:#567     // SUBCLASS:Lext/mods/gameserver/enums/FloodProtector;
  #565 = Utf8               ext/mods/gameserver/enums/FloodProtector
  #566 = Utf8               SUBCLASS
  #567 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
  #568 = Methodref          #569.#570     // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #569 = Class              #571          // ext/mods/gameserver/network/GameClient
  #570 = NameAndType        #572:#573     // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #571 = Utf8               ext/mods/gameserver/network/GameClient
  #572 = Utf8               performAction
  #573 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
  #574 = Methodref          #59.#575      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #575 = NameAndType        #576:#577     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #576 = Utf8               getStatus
  #577 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #578 = Methodref          #579.#580     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #579 = Class              #581          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #580 = NameAndType        #582:#36      // getLevel:()I
  #581 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #582 = Utf8               getLevel
  #583 = Methodref          #512.#580     // ext/mods/gameserver/model/actor/container/player/SubClass.getLevel:()I
  #584 = Fieldref           #41.#585      // ext/mods/Config.SUBCLASS_WITHOUT_QUESTS:Z
  #585 = NameAndType        #586:#587     // SUBCLASS_WITHOUT_QUESTS:Z
  #586 = Utf8               SUBCLASS_WITHOUT_QUESTS
  #587 = Utf8               Z
  #588 = Methodref          #86.#589      // ext/mods/gameserver/model/actor/instance/VillageMaster.checkQuests:(Lext/mods/gameserver/model/actor/Player;)Z
  #589 = NameAndType        #590:#362     // checkQuests:(Lext/mods/gameserver/model/actor/Player;)Z
  #590 = Utf8               checkQuests
  #591 = Methodref          #86.#592      // ext/mods/gameserver/model/actor/instance/VillageMaster.isValidNewSubClass:(Lext/mods/gameserver/model/actor/Player;I)Z
  #592 = NameAndType        #593:#594     // isValidNewSubClass:(Lext/mods/gameserver/model/actor/Player;I)Z
  #593 = Utf8               isValidNewSubClass
  #594 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
  #595 = Methodref          #59.#596      // ext/mods/gameserver/model/actor/Player.addSubClass:(II)Z
  #596 = NameAndType        #597:#598     // addSubClass:(II)Z
  #597 = Utf8               addSubClass
  #598 = Utf8               (II)Z
  #599 = Methodref          #59.#600      // ext/mods/gameserver/model/actor/Player.setActiveClass:(I)Z
  #600 = NameAndType        #601:#498     // setActiveClass:(I)Z
  #601 = Utf8               setActiveClass
  #602 = Methodref          #59.#603      // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #603 = NameAndType        #604:#605     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #604 = Utf8               getMissions
  #605 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #606 = Fieldref           #607.#608     // ext/mods/gameserver/enums/actors/MissionType.SUBCLASS:Lext/mods/gameserver/enums/actors/MissionType;
  #607 = Class              #609          // ext/mods/gameserver/enums/actors/MissionType
  #608 = NameAndType        #566:#610     // SUBCLASS:Lext/mods/gameserver/enums/actors/MissionType;
  #609 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #610 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #611 = Methodref          #612.#613     // ext/mods/gameserver/model/actor/container/player/MissionList.getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #612 = Class              #614          // ext/mods/gameserver/model/actor/container/player/MissionList
  #613 = NameAndType        #615:#616     // getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #614 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #615 = Utf8               getMission
  #616 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #617 = Methodref          #618.#619     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #618 = Class              #620          // ext/mods/gameserver/model/holder/IntIntHolder
  #619 = NameAndType        #621:#36      // getValue:()I
  #620 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #621 = Utf8               getValue
  #622 = Methodref          #612.#623     // ext/mods/gameserver/model/actor/container/player/MissionList.set:(Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
  #623 = NameAndType        #624:#625     // set:(Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
  #624 = Utf8               set
  #625 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
  #626 = String             #627          // html/villagemaster/SubClass_AddOk.htm
  #627 = Utf8               html/villagemaster/SubClass_AddOk.htm
  #628 = Fieldref           #53.#629      // ext/mods/gameserver/network/SystemMessageId.ADD_NEW_SUBCLASS:Lext/mods/gameserver/network/SystemMessageId;
  #629 = NameAndType        #630:#57      // ADD_NEW_SUBCLASS:Lext/mods/gameserver/network/SystemMessageId;
  #630 = Utf8               ADD_NEW_SUBCLASS
  #631 = Methodref          #632.#633     // ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #632 = Class              #634          // ext/mods/extensions/listener/manager/PlayerListenerManager
  #633 = NameAndType        #68:#635      // getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #634 = Utf8               ext/mods/extensions/listener/manager/PlayerListenerManager
  #635 = Utf8               ()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #636 = Methodref          #632.#637     // ext/mods/extensions/listener/manager/PlayerListenerManager.notifySetClass:(Lext/mods/gameserver/model/actor/Player;I)V
  #637 = NameAndType        #638:#639     // notifySetClass:(Lext/mods/gameserver/model/actor/Player;I)V
  #638 = Utf8               notifySetClass
  #639 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #640 = Methodref          #59.#524      // ext/mods/gameserver/model/actor/Player.getClassIndex:()I
  #641 = String             #642          // html/villagemaster/SubClass_Current.htm
  #642 = Utf8               html/villagemaster/SubClass_Current.htm
  #643 = Class              #644          // java/lang/NullPointerException
  #644 = Utf8               java/lang/NullPointerException
  #645 = Methodref          #59.#646      // ext/mods/gameserver/model/actor/Player.stopAllEffects:()V
  #646 = NameAndType        #647:#298     // stopAllEffects:()V
  #647 = Utf8               stopAllEffects
  #648 = Fieldref           #53.#649      // ext/mods/gameserver/network/SystemMessageId.SUBCLASS_TRANSFER_COMPLETED:Lext/mods/gameserver/network/SystemMessageId;
  #649 = NameAndType        #650:#57      // SUBCLASS_TRANSFER_COMPLETED:Lext/mods/gameserver/network/SystemMessageId;
  #650 = Utf8               SUBCLASS_TRANSFER_COMPLETED
  #651 = String             #652          // <a action=\"bypass -h npc_%objectId%_Subclass 7
  #652 = Utf8               <a action=\"bypass -h npc_%objectId%_Subclass 7
  #653 = String             #654          // \" msg=\"1445;
  #654 = Utf8               \" msg=\"1445;
  #655 = String             #656          // html/villagemaster/SubClass_ModifyChoice1.htm
  #656 = Utf8               html/villagemaster/SubClass_ModifyChoice1.htm
  #657 = String             #658          // html/villagemaster/SubClass_ModifyChoice2.htm
  #658 = Utf8               html/villagemaster/SubClass_ModifyChoice2.htm
  #659 = String             #660          // html/villagemaster/SubClass_ModifyChoice3.htm
  #660 = Utf8               html/villagemaster/SubClass_ModifyChoice3.htm
  #661 = String             #662          // html/villagemaster/SubClass_ModifyChoice.htm
  #662 = Utf8               html/villagemaster/SubClass_ModifyChoice.htm
  #663 = Methodref          #59.#664      // ext/mods/gameserver/model/actor/Player.modifySubClass:(II)Z
  #664 = NameAndType        #665:#598     // modifySubClass:(II)Z
  #665 = Utf8               modifySubClass
  #666 = String             #667          // html/villagemaster/SubClass_ModifyOk.htm
  #667 = Utf8               html/villagemaster/SubClass_ModifyOk.htm
  #668 = String             #669          // The sub class could not be added, you have been reverted to your base class.
  #669 = Utf8               The sub class could not be added, you have been reverted to your base class.
  #670 = String             #671          // %objectId%
  #671 = Utf8               %objectId%
  #672 = Methodref          #173.#673     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #673 = NameAndType        #487:#674     // replace:(Ljava/lang/String;I)V
  #674 = Utf8               (Ljava/lang/String;I)V
  #675 = Methodref          #2.#676       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #676 = NameAndType        #677:#678     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #677 = Utf8               onBypassFeedback
  #678 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #679 = Methodref          #59.#680      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #680 = NameAndType        #681:#82      // isNoble:()Z
  #681 = Utf8               isNoble
  #682 = Fieldref           #41.#683      // ext/mods/Config.SUBCLASS_REQUIRE_MIMIR:Z
  #683 = NameAndType        #684:#587     // SUBCLASS_REQUIRE_MIMIR:Z
  #684 = Utf8               SUBCLASS_REQUIRE_MIMIR
  #685 = Methodref          #59.#686      // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #686 = NameAndType        #687:#688     // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #687 = Utf8               getQuestList
  #688 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #689 = String             #690          // Q235_MimirsElixir
  #690 = Utf8               Q235_MimirsElixir
  #691 = Methodref          #692.#693     // ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #692 = Class              #694          // ext/mods/gameserver/model/actor/container/player/QuestList
  #693 = NameAndType        #695:#696     // getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #694 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
  #695 = Utf8               getQuestState
  #696 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #697 = Methodref          #698.#699     // ext/mods/gameserver/scripting/QuestState.isCompleted:()Z
  #698 = Class              #700          // ext/mods/gameserver/scripting/QuestState
  #699 = NameAndType        #701:#82      // isCompleted:()Z
  #700 = Utf8               ext/mods/gameserver/scripting/QuestState
  #701 = Utf8               isCompleted
  #702 = Fieldref           #41.#703      // ext/mods/Config.SUBCLASS_REQUIRE_FATE:Z
  #703 = NameAndType        #704:#587     // SUBCLASS_REQUIRE_FATE:Z
  #704 = Utf8               SUBCLASS_REQUIRE_FATE
  #705 = String             #706          // Q234_FatesWhisper
  #706 = Utf8               Q234_FatesWhisper
  #707 = Methodref          #458.#708     // ext/mods/gameserver/enums/actors/ClassId.getAvailableSubclasses:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
  #708 = NameAndType        #709:#448     // getAvailableSubclasses:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
  #709 = Utf8               getAvailableSubclasses
  #710 = InterfaceMethodref #239.#711     // java/util/Iterator.remove:()V
  #711 = NameAndType        #712:#298     // remove:()V
  #712 = Utf8               remove
  #713 = Methodref          #458.#714     // ext/mods/gameserver/enums/actors/ClassId.equalsOrIsChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #714 = NameAndType        #715:#520     // equalsOrIsChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #715 = Utf8               equalsOrIsChildOf
  #716 = Fieldref           #458.#717     // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #717 = NameAndType        #718:#719     // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #718 = Utf8               VALUES
  #719 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #720 = Fieldref           #41.#721      // ext/mods/Config.GAME_SUBCLASS_EVERYWHERE:Z
  #721 = NameAndType        #722:#587     // GAME_SUBCLASS_EVERYWHERE:Z
  #722 = Utf8               GAME_SUBCLASS_EVERYWHERE
  #723 = Methodref          #86.#724      // ext/mods/gameserver/model/actor/instance/VillageMaster.checkVillageMasterRace:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #724 = NameAndType        #725:#520     // checkVillageMasterRace:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #725 = Utf8               checkVillageMasterRace
  #726 = Methodref          #86.#727      // ext/mods/gameserver/model/actor/instance/VillageMaster.checkVillageMasterTeachType:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #727 = NameAndType        #728:#520     // checkVillageMasterTeachType:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #728 = Utf8               checkVillageMasterTeachType
  #729 = Methodref          #83.#580      // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #730 = Fieldref           #53.#731      // ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_CLAN_ACADEMY:Lext/mods/gameserver/network/SystemMessageId;
  #731 = NameAndType        #732:#57      // YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_CLAN_ACADEMY:Lext/mods/gameserver/network/SystemMessageId;
  #732 = Utf8               YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_CLAN_ACADEMY
  #733 = Fieldref           #53.#734      // ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_MILITARY_UNIT:Lext/mods/gameserver/network/SystemMessageId;
  #734 = NameAndType        #735:#57      // YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_MILITARY_UNIT:Lext/mods/gameserver/network/SystemMessageId;
  #735 = Utf8               YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_MILITARY_UNIT
  #736 = Methodref          #65.#737      // ext/mods/gameserver/data/sql/ClanTable.getClans:()Ljava/util/Collection;
  #737 = NameAndType        #738:#231     // getClans:()Ljava/util/Collection;
  #738 = Utf8               getClans
  #739 = Methodref          #83.#740      // ext/mods/gameserver/model/pledge/Clan.getSubPledge:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
  #740 = NameAndType        #114:#741     // getSubPledge:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
  #741 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
  #742 = Fieldref           #53.#743      // ext/mods/gameserver/network/SystemMessageId.S1_ALREADY_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
  #743 = NameAndType        #744:#57      // S1_ALREADY_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
  #744 = Utf8               S1_ALREADY_EXISTS
  #745 = Methodref          #746.#747     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #746 = Class              #748          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #747 = NameAndType        #749:#750     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #748 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #749 = Utf8               getSystemMessage
  #750 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #751 = Methodref          #746.#752     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #752 = NameAndType        #753:#754     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #753 = Utf8               addString
  #754 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #755 = Fieldref           #53.#756      // ext/mods/gameserver/network/SystemMessageId.ANOTHER_MILITARY_UNIT_IS_ALREADY_USING_THAT_NAME:Lext/mods/gameserver/network/SystemMessageId;
  #756 = NameAndType        #757:#57      // ANOTHER_MILITARY_UNIT_IS_ALREADY_USING_THAT_NAME:Lext/mods/gameserver/network/SystemMessageId;
  #757 = Utf8               ANOTHER_MILITARY_UNIT_IS_ALREADY_USING_THAT_NAME
  #758 = Fieldref           #53.#759      // ext/mods/gameserver/network/SystemMessageId.CAPTAIN_OF_ORDER_OF_KNIGHTS_CANNOT_BE_APPOINTED:Lext/mods/gameserver/network/SystemMessageId;
  #759 = NameAndType        #760:#57      // CAPTAIN_OF_ORDER_OF_KNIGHTS_CANNOT_BE_APPOINTED:Lext/mods/gameserver/network/SystemMessageId;
  #760 = Utf8               CAPTAIN_OF_ORDER_OF_KNIGHTS_CANNOT_BE_APPOINTED
  #761 = Fieldref           #53.#762      // ext/mods/gameserver/network/SystemMessageId.CAPTAIN_OF_ROYAL_GUARD_CANNOT_BE_APPOINTED:Lext/mods/gameserver/network/SystemMessageId;
  #762 = NameAndType        #763:#57      // CAPTAIN_OF_ROYAL_GUARD_CANNOT_BE_APPOINTED:Lext/mods/gameserver/network/SystemMessageId;
  #763 = Utf8               CAPTAIN_OF_ROYAL_GUARD_CANNOT_BE_APPOINTED
  #764 = Methodref          #83.#765      // ext/mods/gameserver/model/pledge/Clan.createSubPledge:(Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
  #765 = NameAndType        #89:#766      // createSubPledge:(Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
  #766 = Utf8               (Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
  #767 = Fieldref           #53.#768      // ext/mods/gameserver/network/SystemMessageId.THE_S1S_CLAN_ACADEMY_HAS_BEEN_CREATED:Lext/mods/gameserver/network/SystemMessageId;
  #768 = NameAndType        #769:#57      // THE_S1S_CLAN_ACADEMY_HAS_BEEN_CREATED:Lext/mods/gameserver/network/SystemMessageId;
  #769 = Utf8               THE_S1S_CLAN_ACADEMY_HAS_BEEN_CREATED
  #770 = Methodref          #83.#312      // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #771 = Fieldref           #53.#772      // ext/mods/gameserver/network/SystemMessageId.THE_KNIGHTS_OF_S1_HAVE_BEEN_CREATED:Lext/mods/gameserver/network/SystemMessageId;
  #772 = NameAndType        #773:#57      // THE_KNIGHTS_OF_S1_HAVE_BEEN_CREATED:Lext/mods/gameserver/network/SystemMessageId;
  #773 = Utf8               THE_KNIGHTS_OF_S1_HAVE_BEEN_CREATED
  #774 = Fieldref           #53.#775      // ext/mods/gameserver/network/SystemMessageId.THE_ROYAL_GUARD_OF_S1_HAVE_BEEN_CREATED:Lext/mods/gameserver/network/SystemMessageId;
  #775 = NameAndType        #776:#57      // THE_ROYAL_GUARD_OF_S1_HAVE_BEEN_CREATED:Lext/mods/gameserver/network/SystemMessageId;
  #776 = Utf8               THE_ROYAL_GUARD_OF_S1_HAVE_BEEN_CREATED
  #777 = Fieldref           #53.#778      // ext/mods/gameserver/network/SystemMessageId.CLAN_CREATED:Lext/mods/gameserver/network/SystemMessageId;
  #778 = NameAndType        #779:#57      // CLAN_CREATED:Lext/mods/gameserver/network/SystemMessageId;
  #779 = Utf8               CLAN_CREATED
  #780 = Methodref          #322.#781     // ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
  #781 = NameAndType        #782:#783     // getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
  #782 = Utf8               getPlayerInstance
  #783 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #784 = Methodref          #322.#785     // ext/mods/gameserver/model/pledge/ClanMember.calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
  #785 = NameAndType        #786:#787     // calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
  #786 = Utf8               calculatePledgeClass
  #787 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #788 = Methodref          #59.#789      // ext/mods/gameserver/model/actor/Player.setPledgeClass:(I)V
  #789 = NameAndType        #790:#180     // setPledgeClass:(I)V
  #790 = Utf8               setPledgeClass
  #791 = Class              #792          // ext/mods/gameserver/network/serverpackets/UserInfo
  #792 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #793 = Methodref          #791.#794     // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #794 = NameAndType        #5:#199       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #795 = Fieldref           #53.#796      // ext/mods/gameserver/network/SystemMessageId.NAMING_CHARNAME_UP_TO_16CHARS:Lext/mods/gameserver/network/SystemMessageId;
  #796 = NameAndType        #797:#57      // NAMING_CHARNAME_UP_TO_16CHARS:Lext/mods/gameserver/network/SystemMessageId;
  #797 = Utf8               NAMING_CHARNAME_UP_TO_16CHARS
  #798 = Methodref          #22.#799      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #799 = NameAndType        #800:#538     // equals:(Ljava/lang/Object;)Z
  #800 = Utf8               equals
  #801 = Methodref          #83.#802      // ext/mods/gameserver/model/pledge/Clan.isSubPledgeLeader:(I)Z
  #802 = NameAndType        #803:#498     // isSubPledgeLeader:(I)Z
  #803 = Utf8               isSubPledgeLeader
  #804 = Methodref          #129.#805     // ext/mods/gameserver/model/pledge/SubPledge.setLeaderId:(I)V
  #805 = NameAndType        #806:#180     // setLeaderId:(I)V
  #806 = Utf8               setLeaderId
  #807 = Fieldref           #53.#808      // ext/mods/gameserver/network/SystemMessageId.S1_HAS_BEEN_SELECTED_AS_CAPTAIN_OF_S2:Lext/mods/gameserver/network/SystemMessageId;
  #808 = NameAndType        #809:#57      // S1_HAS_BEEN_SELECTED_AS_CAPTAIN_OF_S2:Lext/mods/gameserver/network/SystemMessageId;
  #809 = Utf8               S1_HAS_BEEN_SELECTED_AS_CAPTAIN_OF_S2
  #810 = String             #811          // html/script/feature/Clan/9000-09-no.htm
  #811 = Utf8               html/script/feature/Clan/9000-09-no.htm
  #812 = Fieldref           #813.#814     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #813 = Class              #815          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #814 = NameAndType        #816:#817     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #815 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #816 = Utf8               STATIC_PACKET
  #817 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #818 = Methodref          #819.#820     // ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #819 = Class              #821          // ext/mods/gameserver/data/xml/SkillTreeData
  #820 = NameAndType        #68:#822      // getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #821 = Utf8               ext/mods/gameserver/data/xml/SkillTreeData
  #822 = Utf8               ()Lext/mods/gameserver/data/xml/SkillTreeData;
  #823 = Methodref          #819.#824     // ext/mods/gameserver/data/xml/SkillTreeData.getClanSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #824 = NameAndType        #825:#826     // getClanSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #825 = Utf8               getClanSkillsFor
  #826 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #827 = InterfaceMethodref #828.#80      // java/util/List.isEmpty:()Z
  #828 = Class              #829          // java/util/List
  #829 = Utf8               java/util/List
  #830 = Fieldref           #53.#831      // ext/mods/gameserver/network/SystemMessageId.DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
  #831 = NameAndType        #832:#57      // DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
  #832 = Utf8               DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1
  #833 = Methodref          #746.#834     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #834 = NameAndType        #835:#836     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #835 = Utf8               addNumber
  #836 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #837 = Class              #838          // ext/mods/gameserver/network/serverpackets/AcquireSkillList
  #838 = Utf8               ext/mods/gameserver/network/serverpackets/AcquireSkillList
  #839 = Fieldref           #840.#841     // ext/mods/gameserver/enums/skills/AcquireSkillType.CLAN:Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #840 = Class              #842          // ext/mods/gameserver/enums/skills/AcquireSkillType
  #841 = NameAndType        #843:#844     // CLAN:Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #842 = Utf8               ext/mods/gameserver/enums/skills/AcquireSkillType
  #843 = Utf8               CLAN
  #844 = Utf8               Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #845 = Methodref          #837.#846     // ext/mods/gameserver/network/serverpackets/AcquireSkillList."<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #846 = NameAndType        #5:#847       // "<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #847 = Utf8               (Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #848 = Utf8               Code
  #849 = Utf8               LineNumberTable
  #850 = Utf8               LocalVariableTable
  #851 = Utf8               this
  #852 = Utf8               Lext/mods/gameserver/model/actor/instance/VillageMaster;
  #853 = Utf8               objectId
  #854 = Utf8               template
  #855 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #856 = Utf8               getHtmlPath
  #857 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #858 = Utf8               player
  #859 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #860 = Utf8               npcId
  #861 = Utf8               val
  #862 = Utf8               filename
  #863 = Utf8               StackMapTable
  #864 = Utf8               clan
  #865 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #866 = Utf8               subPledge
  #867 = Utf8               Lext/mods/gameserver/model/pledge/SubPledge;
  #868 = Utf8               html
  #869 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #870 = Utf8               castle
  #871 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #872 = Utf8               member
  #873 = Utf8               Lext/mods/gameserver/model/pledge/ClanMember;
  #874 = Utf8               endIndex
  #875 = Utf8               subClass
  #876 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #877 = Utf8               sb
  #878 = Utf8               Ljava/lang/StringBuilder;
  #879 = Utf8               subsAvailable
  #880 = Utf8               Ljava/util/Set;
  #881 = Utf8               subclass
  #882 = Utf8               Lext/mods/gameserver/model/actor/container/player/SubClass;
  #883 = Utf8               allowAddition
  #884 = Utf8               e
  #885 = Utf8               Ljava/lang/NullPointerException;
  #886 = Utf8               cmdChoice
  #887 = Utf8               paramOne
  #888 = Utf8               paramTwo
  #889 = Utf8               command
  #890 = Utf8               commandStr
  #891 = Utf8               [Ljava/lang/String;
  #892 = Utf8               actualCommand
  #893 = Utf8               cmdParams
  #894 = Utf8               cmdParams2
  #895 = Utf8               LocalVariableTypeTable
  #896 = Utf8               Ljava/util/Set<Lext/mods/gameserver/enums/actors/ClassId;>;
  #897 = Class              #891          // "[Ljava/lang/String;"
  #898 = Utf8               mimir
  #899 = Utf8               Lext/mods/gameserver/scripting/QuestState;
  #900 = Utf8               fate
  #901 = Utf8               classId
  #902 = Utf8               availSub
  #903 = Utf8               Ljava/util/Iterator;
  #904 = Utf8               availSubs
  #905 = Utf8               Ljava/util/Iterator<Lext/mods/gameserver/enums/actors/ClassId;>;
  #906 = Utf8               Signature
  #907 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set<Lext/mods/gameserver/enums/actors/ClassId;>;
  #908 = Utf8               pclass
  #909 = Utf8               cid
  #910 = Utf8               found
  #911 = Utf8               tempClan
  #912 = Utf8               sm
  #913 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #914 = Utf8               leaderSubPledge
  #915 = Utf8               leaderPlayer
  #916 = Utf8               clanName
  #917 = Utf8               leaderName
  #918 = Utf8               pledgeType
  #919 = Utf8               minClanLvl
  #920 = Utf8               leaderId
  #921 = Utf8               skills
  #922 = Utf8               Ljava/util/List;
  #923 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;>;
  #924 = Utf8               SourceFile
  #925 = Utf8               VillageMaster.java
  #926 = Utf8               BootstrapMethods
  #927 = String             #928          // \u0001
  #928 = Utf8               \u0001
  #929 = String             #930          // \u0001-\u0001
  #930 = Utf8               \u0001-\u0001
  #931 = String             #932          // html/villagemaster/\u0001.htm
  #932 = Utf8               html/villagemaster/\u0001.htm
  #933 = MethodHandle       6:#934        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #934 = Methodref          #935.#936     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #935 = Class              #937          // java/lang/invoke/StringConcatFactory
  #936 = NameAndType        #11:#938      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #937 = Utf8               java/lang/invoke/StringConcatFactory
  #938 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #939 = Utf8               InnerClasses
  #940 = Class              #941          // java/lang/invoke/MethodHandles$Lookup
  #941 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #942 = Class              #943          // java/lang/invoke/MethodHandles
  #943 = Utf8               java/lang/invoke/MethodHandles
  #944 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.VillageMaster(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 62: 0
        line 63: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/VillageMaster;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #7                  // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #9,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #13,  0             // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #16,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 68: 0
        line 70: 4
        line 71: 8
        line 73: 19
        line 75: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/VillageMaster;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=16, args_size=3
         0: aload_2
         1: ldc           #19                 // String
         3: invokevirtual #21                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
         6: astore_3
         7: aload_3
         8: iconst_0
         9: aaload
        10: astore        4
        12: ldc           #7                  // String
        14: astore        5
        16: ldc           #7                  // String
        18: astore        6
        20: aload_3
        21: arraylength
        22: iconst_2
        23: if_icmplt     31
        26: aload_3
        27: iconst_1
        28: aaload
        29: astore        5
        31: aload_3
        32: arraylength
        33: iconst_3
        34: if_icmplt     42
        37: aload_3
        38: iconst_2
        39: aaload
        40: astore        6
        42: aload_2
        43: ldc           #27                 // String create_clan
        45: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        48: ifeq          100
        51: aload_2
        52: invokevirtual #33                 // Method java/lang/String.length:()I
        55: bipush        12
        57: if_icmple     100
        60: aload_2
        61: bipush        12
        63: invokevirtual #37                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        66: astore        7
        68: aload         7
        70: getstatic     #40                 // Field ext/mods/Config.CLAN_ALLY_NAME_TEMPLATE:Ljava/lang/String;
        73: invokestatic  #46                 // Method ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
        76: ifne          87
        79: aload_1
        80: getstatic     #52                 // Field ext/mods/gameserver/network/SystemMessageId.CLAN_NAME_INVALID:Lext/mods/gameserver/network/SystemMessageId;
        83: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        86: return
        87: invokestatic  #64                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        90: aload_1
        91: aload         7
        93: invokevirtual #70                 // Method ext/mods/gameserver/data/sql/ClanTable.createClan:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
        96: pop
        97: goto          2859
       100: aload         4
       102: ldc           #74                 // String create_academy
       104: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       107: ifeq          131
       110: aload         5
       112: invokevirtual #79                 // Method java/lang/String.isEmpty:()Z
       115: ifeq          119
       118: return
       119: aload_1
       120: aload         5
       122: aconst_null
       123: iconst_m1
       124: iconst_5
       125: invokestatic  #85                 // Method createSubPledge:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;II)V
       128: goto          2859
       131: aload         4
       133: ldc           #91                 // String rename_pledge
       135: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       138: ifeq          294
       141: aload         5
       143: invokevirtual #79                 // Method java/lang/String.isEmpty:()Z
       146: ifne          157
       149: aload         6
       151: invokevirtual #79                 // Method java/lang/String.isEmpty:()Z
       154: ifeq          158
       157: return
       158: aload_1
       159: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       162: ifne          173
       165: aload_1
       166: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
       169: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       172: return
       173: aload_1
       174: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       177: astore        7
       179: aload_1
       180: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       183: aload         5
       185: invokestatic  #103                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
       188: invokevirtual #109                // Method java/lang/Integer.intValue:()I
       191: invokevirtual #112                // Method ext/mods/gameserver/model/pledge/Clan.getSubPledge:(I)Lext/mods/gameserver/model/pledge/SubPledge;
       194: astore        8
       196: aload         8
       198: ifnonnull     208
       201: aload_1
       202: ldc           #116                // String Pledge doesn\'t exist.
       204: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       207: return
       208: aload         6
       210: invokestatic  #122                // Method ext/mods/commons/lang/StringUtil.isAlphaNumeric:(Ljava/lang/String;)Z
       213: ifne          224
       216: aload_1
       217: getstatic     #52                 // Field ext/mods/gameserver/network/SystemMessageId.CLAN_NAME_INVALID:Lext/mods/gameserver/network/SystemMessageId;
       220: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       223: return
       224: aload         6
       226: invokevirtual #33                 // Method java/lang/String.length:()I
       229: iconst_2
       230: if_icmplt     243
       233: aload         6
       235: invokevirtual #33                 // Method java/lang/String.length:()I
       238: bipush        16
       240: if_icmple     251
       243: aload_1
       244: getstatic     #125                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_NAME_LENGTH_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       247: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       250: return
       251: aload         8
       253: aload         6
       255: invokevirtual #128                // Method ext/mods/gameserver/model/pledge/SubPledge.setName:(Ljava/lang/String;)V
       258: aload         7
       260: aload         8
       262: invokevirtual #133                // Method ext/mods/gameserver/model/pledge/Clan.updateSubPledgeInDB:(Lext/mods/gameserver/model/pledge/SubPledge;)V
       265: aload         7
       267: iconst_1
       268: anewarray     #137                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       271: dup
       272: iconst_0
       273: new           #139                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
       276: dup
       277: aload         7
       279: aload         8
       281: invokevirtual #141                // Method ext/mods/gameserver/model/pledge/SubPledge.getId:()I
       284: invokespecial #144                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
       287: aastore
       288: invokevirtual #147                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       291: goto          2859
       294: aload         4
       296: ldc           #151                // String create_royal
       298: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       301: ifeq          328
       304: aload         5
       306: invokevirtual #79                 // Method java/lang/String.isEmpty:()Z
       309: ifeq          313
       312: return
       313: aload_1
       314: aload         5
       316: aload         6
       318: bipush        100
       320: bipush        6
       322: invokestatic  #85                 // Method createSubPledge:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;II)V
       325: goto          2859
       328: aload         4
       330: ldc           #153                // String create_knight
       332: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       335: ifeq          363
       338: aload         5
       340: invokevirtual #79                 // Method java/lang/String.isEmpty:()Z
       343: ifeq          347
       346: return
       347: aload_1
       348: aload         5
       350: aload         6
       352: sipush        1001
       355: bipush        7
       357: invokestatic  #85                 // Method createSubPledge:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;II)V
       360: goto          2859
       363: aload         4
       365: ldc           #155                // String assign_subpl_leader
       367: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       370: ifeq          393
       373: aload         5
       375: invokevirtual #79                 // Method java/lang/String.isEmpty:()Z
       378: ifeq          382
       381: return
       382: aload_1
       383: aload         5
       385: aload         6
       387: invokestatic  #157                // Method assignSubPledgeLeader:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
       390: goto          2859
       393: aload         4
       395: ldc           #161                // String create_ally
       397: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       400: ifeq          494
       403: aload         5
       405: invokevirtual #79                 // Method java/lang/String.isEmpty:()Z
       408: ifeq          412
       411: return
       412: aload         5
       414: getstatic     #40                 // Field ext/mods/Config.CLAN_ALLY_NAME_TEMPLATE:Ljava/lang/String;
       417: invokestatic  #46                 // Method ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
       420: ifne          431
       423: aload_1
       424: getstatic     #163                // Field ext/mods/gameserver/network/SystemMessageId.INCORRECT_ALLIANCE_NAME:Lext/mods/gameserver/network/SystemMessageId;
       427: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       430: return
       431: aload_1
       432: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       435: ifnonnull     448
       438: aload_1
       439: getstatic     #166                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEADER_CREATE_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
       442: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       445: goto          2859
       448: aload_1
       449: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       452: aload_1
       453: aload         5
       455: invokevirtual #169                // Method ext/mods/gameserver/model/pledge/Clan.createAlly:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       458: ifeq          2859
       461: new           #173                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       464: dup
       465: aload_0
       466: invokevirtual #175                // Method getObjectId:()I
       469: invokespecial #178                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       472: astore        7
       474: aload         7
       476: aload_1
       477: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       480: ldc           #185                // String html/script/feature/Alliance/9001-05.htm
       482: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       485: aload_1
       486: aload         7
       488: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       491: goto          2859
       494: aload         4
       496: ldc           #194                // String dissolve_ally
       498: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       501: ifeq          515
       504: aload_1
       505: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       508: aload_1
       509: invokevirtual #196                // Method ext/mods/gameserver/model/pledge/Clan.dissolveAlly:(Lext/mods/gameserver/model/actor/Player;)V
       512: goto          2859
       515: aload         4
       517: ldc           #200                // String dissolve_clan
       519: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       522: ifeq          775
       525: aload_1
       526: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       529: ifne          540
       532: aload_1
       533: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
       536: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       539: return
       540: aload_1
       541: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       544: astore        7
       546: aload         7
       548: invokevirtual #202                // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
       551: ifeq          562
       554: aload_1
       555: getstatic     #205                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_DISPERSE_THE_CLANS_IN_ALLY:Lext/mods/gameserver/network/SystemMessageId;
       558: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       561: return
       562: aload         7
       564: invokevirtual #208                // Method ext/mods/gameserver/model/pledge/Clan.isAtWar:()Z
       567: ifeq          578
       570: aload_1
       571: getstatic     #211                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_WHILE_IN_WAR:Lext/mods/gameserver/network/SystemMessageId;
       574: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       577: return
       578: aload         7
       580: invokevirtual #214                // Method ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
       583: ifne          594
       586: aload         7
       588: invokevirtual #217                // Method ext/mods/gameserver/model/pledge/Clan.hasClanHall:()Z
       591: ifeq          602
       594: aload_1
       595: getstatic     #220                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_WHILE_OWNING_CLAN_HALL_OR_CASTLE:Lext/mods/gameserver/network/SystemMessageId;
       598: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       601: return
       602: invokestatic  #223                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       605: invokevirtual #228                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
       608: invokeinterface #232,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       613: astore        8
       615: aload         8
       617: invokeinterface #238,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       622: ifeq          678
       625: aload         8
       627: invokeinterface #243,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       632: checkcast     #247                // class ext/mods/gameserver/model/residence/castle/Castle
       635: astore        9
       637: aload         9
       639: invokevirtual #249                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       642: aload         7
       644: invokevirtual #253                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
       647: ifeq          675
       650: aload_1
       651: aload         9
       653: invokevirtual #249                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       656: invokevirtual #259                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
       659: ifeq          668
       662: getstatic     #262                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_WHILE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       665: goto          671
       668: getstatic     #265                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_CAUSE_CLAN_WILL_PARTICIPATE_IN_CASTLE_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       671: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       674: return
       675: goto          615
       678: aload         7
       680: invokevirtual #268                // Method ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
       683: invokestatic  #272                // Method java/lang/System.currentTimeMillis:()J
       686: lcmp
       687: ifle          698
       690: aload_1
       691: getstatic     #277                // Field ext/mods/gameserver/network/SystemMessageId.DISSOLUTION_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
       694: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       697: return
       698: getstatic     #280                // Field ext/mods/Config.CLAN_DISSOLVE_DAYS:I
       701: ifle          758
       704: aload         7
       706: invokestatic  #272                // Method java/lang/System.currentTimeMillis:()J
       709: getstatic     #280                // Field ext/mods/Config.CLAN_DISSOLVE_DAYS:I
       712: i2l
       713: ldc2_w        #284                // long 86400000l
       716: lmul
       717: ladd
       718: invokevirtual #286                // Method ext/mods/gameserver/model/pledge/Clan.setDissolvingExpiryTime:(J)V
       721: aload         7
       723: iconst_1
       724: anewarray     #137                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       727: dup
       728: iconst_0
       729: new           #290                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
       732: dup
       733: aload         7
       735: invokespecial #292                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       738: aastore
       739: invokevirtual #147                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       742: aload         7
       744: invokevirtual #295                // Method ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
       747: invokestatic  #64                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       750: aload         7
       752: invokevirtual #299                // Method ext/mods/gameserver/data/sql/ClanTable.scheduleRemoveClan:(Lext/mods/gameserver/model/pledge/Clan;)V
       755: goto          766
       758: invokestatic  #64                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       761: aload         7
       763: invokevirtual #302                // Method ext/mods/gameserver/data/sql/ClanTable.destroyClan:(Lext/mods/gameserver/model/pledge/Clan;)V
       766: aload_1
       767: iconst_0
       768: iconst_0
       769: invokevirtual #305                // Method ext/mods/gameserver/model/actor/Player.applyDeathPenalty:(ZZ)V
       772: goto          2859
       775: aload         4
       777: ldc_w         #309                // String change_clan_leader
       780: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       783: ifeq          962
       786: aload         5
       788: invokevirtual #79                 // Method java/lang/String.isEmpty:()Z
       791: ifeq          795
       794: return
       795: aload_1
       796: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       799: ifne          810
       802: aload_1
       803: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
       806: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       809: return
       810: aload_1
       811: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       814: aload         5
       816: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       819: ifeq          823
       822: return
       823: aload_1
       824: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       827: astore        7
       829: aload         7
       831: aload         5
       833: invokevirtual #315                // Method ext/mods/gameserver/model/pledge/Clan.getClanMember:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/ClanMember;
       836: astore        8
       838: new           #173                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       841: dup
       842: aload_0
       843: invokevirtual #175                // Method getObjectId:()I
       846: invokespecial #178                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       849: astore        9
       851: aload         8
       853: ifnonnull     875
       856: aload         9
       858: aload_1
       859: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       862: ldc_w         #319                // String html/script/feature/Clan/9000-07-error.htm
       865: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       868: aload_1
       869: aload         9
       871: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       874: return
       875: aload         8
       877: invokevirtual #321                // Method ext/mods/gameserver/model/pledge/ClanMember.isOnline:()Z
       880: ifne          891
       883: aload_1
       884: getstatic     #326                // Field ext/mods/gameserver/network/SystemMessageId.INVITED_USER_NOT_ONLINE:Lext/mods/gameserver/network/SystemMessageId;
       887: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       890: return
       891: aload         8
       893: invokevirtual #329                // Method ext/mods/gameserver/model/pledge/ClanMember.getPledgeType:()I
       896: ifeq          907
       899: aload_1
       900: ldc_w         #332                // String Selected member cannot be found in main clan.
       903: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       906: return
       907: aload         7
       909: invokevirtual #334                // Method ext/mods/gameserver/model/pledge/Clan.getNewLeaderId:()I
       912: ifne          941
       915: aload         7
       917: aload         8
       919: invokevirtual #337                // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       922: iconst_1
       923: invokevirtual #338                // Method ext/mods/gameserver/model/pledge/Clan.setNewLeaderId:(IZ)V
       926: aload         9
       928: aload_1
       929: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       932: ldc_w         #342                // String html/script/feature/Clan/9000-07-success.htm
       935: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       938: goto          953
       941: aload         9
       943: aload_1
       944: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       947: ldc_w         #344                // String html/script/feature/Clan/9000-07-in-progress.htm
       950: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       953: aload_1
       954: aload         9
       956: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       959: goto          2859
       962: aload         4
       964: ldc_w         #346                // String cancel_clan_leader_change
       967: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       970: ifeq          1058
       973: aload_1
       974: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       977: ifne          988
       980: aload_1
       981: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
       984: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       987: return
       988: aload_1
       989: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       992: astore        7
       994: new           #173                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       997: dup
       998: aload_0
       999: invokevirtual #175                // Method getObjectId:()I
      1002: invokespecial #178                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1005: astore        8
      1007: aload         7
      1009: invokevirtual #334                // Method ext/mods/gameserver/model/pledge/Clan.getNewLeaderId:()I
      1012: ifeq          1037
      1015: aload         7
      1017: iconst_0
      1018: iconst_1
      1019: invokevirtual #338                // Method ext/mods/gameserver/model/pledge/Clan.setNewLeaderId:(IZ)V
      1022: aload         8
      1024: aload_1
      1025: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1028: ldc_w         #348                // String html/script/feature/Clan/9000-08-success.htm
      1031: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1034: goto          1049
      1037: aload         8
      1039: aload_1
      1040: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1043: ldc_w         #350                // String html/script/feature/Clan/9000-08-no.htm
      1046: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1049: aload_1
      1050: aload         8
      1052: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1055: goto          2859
      1058: aload         4
      1060: ldc_w         #352                // String recover_clan
      1063: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1066: ifeq          1143
      1069: aload_1
      1070: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
      1073: ifne          1084
      1076: aload_1
      1077: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
      1080: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1083: return
      1084: aload_1
      1085: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
      1088: astore        7
      1090: aload         7
      1092: invokevirtual #268                // Method ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
      1095: lconst_0
      1096: lcmp
      1097: ifgt          1108
      1100: aload_1
      1101: getstatic     #354                // Field ext/mods/gameserver/network/SystemMessageId.NO_REQUESTS_TO_DISPERSE:Lext/mods/gameserver/network/SystemMessageId;
      1104: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1107: return
      1108: aload         7
      1110: lconst_0
      1111: invokevirtual #286                // Method ext/mods/gameserver/model/pledge/Clan.setDissolvingExpiryTime:(J)V
      1114: aload         7
      1116: iconst_1
      1117: anewarray     #137                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
      1120: dup
      1121: iconst_0
      1122: new           #290                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
      1125: dup
      1126: aload         7
      1128: invokespecial #292                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
      1131: aastore
      1132: invokevirtual #147                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1135: aload         7
      1137: invokevirtual #295                // Method ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
      1140: goto          2859
      1143: aload         4
      1145: ldc_w         #357                // String increase_clan_level
      1148: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1151: ifeq          1187
      1154: aload_1
      1155: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
      1158: aload_1
      1159: invokevirtual #359                // Method ext/mods/gameserver/model/pledge/Clan.levelUpClan:(Lext/mods/gameserver/model/actor/Player;)Z
      1162: ifeq          2859
      1165: aload_1
      1166: new           #363                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
      1169: dup
      1170: aload_1
      1171: aload_1
      1172: sipush        5103
      1175: iconst_1
      1176: iconst_0
      1177: iconst_0
      1178: invokespecial #365                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
      1181: invokevirtual #368                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1184: goto          2859
      1187: aload         4
      1189: ldc_w         #371                // String learn_clan_skills
      1192: invokevirtual #76                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1195: ifeq          1205
      1198: aload_1
      1199: invokestatic  #373                // Method showPledgeSkillList:(Lext/mods/gameserver/model/actor/Player;)V
      1202: goto          2859
      1205: aload_2
      1206: ldc_w         #376                // String Subclass
      1209: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1212: ifeq          2853
      1215: aload_1
      1216: invokevirtual #378                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
      1219: invokevirtual #382                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
      1222: ifne          1232
      1225: aload_1
      1226: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.isAllSkillsDisabled:()Z
      1229: ifeq          1240
      1232: aload_1
      1233: getstatic     #390                // Field ext/mods/gameserver/network/SystemMessageId.SUBCLASS_NO_CHANGE_OR_CREATE_WHILE_SKILL_IN_USE:Lext/mods/gameserver/network/SystemMessageId;
      1236: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1239: return
      1240: invokestatic  #393                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
      1243: aload_1
      1244: invokevirtual #398                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
      1247: ifeq          1258
      1250: invokestatic  #393                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
      1253: aload_1
      1254: invokevirtual #401                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.unRegisterNoble:(Lext/mods/gameserver/model/actor/Player;)Z
      1257: pop
      1258: new           #173                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1261: dup
      1262: aload_0
      1263: invokevirtual #175                // Method getObjectId:()I
      1266: invokespecial #178                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1269: astore        7
      1271: iconst_0
      1272: istore        8
      1274: iconst_0
      1275: istore        9
      1277: iconst_0
      1278: istore        10
      1280: aload_2
      1281: bipush        9
      1283: bipush        10
      1285: invokevirtual #404                // Method java/lang/String.substring:(II)Ljava/lang/String;
      1288: invokevirtual #406                // Method java/lang/String.trim:()Ljava/lang/String;
      1291: invokestatic  #409                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1294: istore        8
      1296: aload_2
      1297: bipush        32
      1299: bipush        11
      1301: invokevirtual #413                // Method java/lang/String.indexOf:(II)I
      1304: istore        11
      1306: iload         11
      1308: iconst_m1
      1309: if_icmpne     1318
      1312: aload_2
      1313: invokevirtual #33                 // Method java/lang/String.length:()I
      1316: istore        11
      1318: aload_2
      1319: bipush        11
      1321: iload         11
      1323: invokevirtual #404                // Method java/lang/String.substring:(II)Ljava/lang/String;
      1326: invokevirtual #406                // Method java/lang/String.trim:()Ljava/lang/String;
      1329: invokestatic  #409                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1332: istore        9
      1334: aload_2
      1335: invokevirtual #33                 // Method java/lang/String.length:()I
      1338: iload         11
      1340: if_icmple     1357
      1343: aload_2
      1344: iload         11
      1346: invokevirtual #37                 // Method java/lang/String.substring:(I)Ljava/lang/String;
      1349: invokevirtual #406                // Method java/lang/String.trim:()Ljava/lang/String;
      1352: invokestatic  #409                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1355: istore        10
      1357: goto          1362
      1360: astore        11
      1362: iload         8
      1364: tableswitch   { // 0 to 7

                       0: 1412

                       1: 1427

                       2: 1640

                       3: 1904

                       4: 2132

                       5: 2394

                       6: 2502

                       7: 2753
                 default: 2832
            }
      1412: aload         7
      1414: aload_1
      1415: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1418: ldc_w         #419                // String html/villagemaster/SubClass.htm
      1421: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1424: goto          2832
      1427: aload_1
      1428: invokevirtual #421                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
      1431: ifnull        1442
      1434: aload_1
      1435: getstatic     #425                // Field ext/mods/gameserver/network/SystemMessageId.CANT_SUBCLASS_WITH_SUMMONED_SERVITOR:Lext/mods/gameserver/network/SystemMessageId;
      1438: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1441: return
      1442: aload_1
      1443: invokevirtual #428                // Method ext/mods/gameserver/model/actor/Player.isOverweight:()Z
      1446: ifeq          1457
      1449: aload_1
      1450: getstatic     #431                // Field ext/mods/gameserver/network/SystemMessageId.NOT_SUBCLASS_WHILE_OVERWEIGHT:Lext/mods/gameserver/network/SystemMessageId;
      1453: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1456: return
      1457: aload_1
      1458: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      1461: invokeinterface #438,  1          // InterfaceMethod java/util/Map.size:()I
      1466: iconst_3
      1467: if_icmplt     1485
      1470: aload         7
      1472: aload_1
      1473: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1476: ldc_w         #443                // String html/villagemaster/SubClass_Fail.htm
      1479: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1482: goto          2832
      1485: aload_0
      1486: aload_1
      1487: invokevirtual #445                // Method getAvailableSubClasses:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
      1490: astore        12
      1492: aload         12
      1494: invokeinterface #449,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
      1499: ifeq          1510
      1502: aload_1
      1503: ldc_w         #452                // String There are no sub classes available at this time.
      1506: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1509: return
      1510: new           #454                // class java/lang/StringBuilder
      1513: dup
      1514: sipush        300
      1517: invokespecial #456                // Method java/lang/StringBuilder."<init>":(I)V
      1520: astore        11
      1522: aload         12
      1524: invokeinterface #457,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      1529: astore        13
      1531: aload         13
      1533: invokeinterface #238,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1538: ifeq          1612
      1541: aload         13
      1543: invokeinterface #243,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1548: checkcast     #458                // class ext/mods/gameserver/enums/actors/ClassId
      1551: astore        14
      1553: aload         11
      1555: bipush        7
      1557: anewarray     #460                // class java/lang/Object
      1560: dup
      1561: iconst_0
      1562: ldc_w         #462                // String <a action=\"bypass -h npc_%objectId%_Subclass 4
      1565: aastore
      1566: dup
      1567: iconst_1
      1568: aload         14
      1570: invokevirtual #464                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
      1573: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1576: aastore
      1577: dup
      1578: iconst_2
      1579: ldc_w         #468                // String \" msg=\"1268;
      1582: aastore
      1583: dup
      1584: iconst_3
      1585: aload         14
      1587: aastore
      1588: dup
      1589: iconst_4
      1590: ldc_w         #470                // String \">
      1593: aastore
      1594: dup
      1595: iconst_5
      1596: aload         14
      1598: aastore
      1599: dup
      1600: bipush        6
      1602: ldc_w         #472                // String </a><br>
      1605: aastore
      1606: invokestatic  #474                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
      1609: goto          1531
      1612: aload         7
      1614: aload_1
      1615: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1618: ldc_w         #478                // String html/villagemaster/SubClass_Add.htm
      1621: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1624: aload         7
      1626: ldc_w         #480                // String %list%
      1629: aload         11
      1631: invokevirtual #482                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1634: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1637: goto          2832
      1640: aload_1
      1641: invokevirtual #421                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
      1644: ifnull        1655
      1647: aload_1
      1648: getstatic     #425                // Field ext/mods/gameserver/network/SystemMessageId.CANT_SUBCLASS_WITH_SUMMONED_SERVITOR:Lext/mods/gameserver/network/SystemMessageId;
      1651: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1654: return
      1655: aload_1
      1656: invokevirtual #428                // Method ext/mods/gameserver/model/actor/Player.isOverweight:()Z
      1659: ifeq          1670
      1662: aload_1
      1663: getstatic     #431                // Field ext/mods/gameserver/network/SystemMessageId.NOT_SUBCLASS_WHILE_OVERWEIGHT:Lext/mods/gameserver/network/SystemMessageId;
      1666: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1669: return
      1670: aload_1
      1671: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      1674: invokeinterface #489,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
      1679: ifeq          1697
      1682: aload         7
      1684: aload_1
      1685: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1688: ldc_w         #490                // String html/villagemaster/SubClass_ChangeNo.htm
      1691: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1694: goto          2832
      1697: new           #454                // class java/lang/StringBuilder
      1700: dup
      1701: sipush        300
      1704: invokespecial #456                // Method java/lang/StringBuilder."<init>":(I)V
      1707: astore        11
      1709: aload_0
      1710: aload_1
      1711: invokevirtual #492                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
      1714: invokevirtual #495                // Method checkVillageMaster:(I)Z
      1717: ifeq          1754
      1720: aload         11
      1722: iconst_3
      1723: anewarray     #460                // class java/lang/Object
      1726: dup
      1727: iconst_0
      1728: ldc_w         #499                // String <a action=\"bypass -h npc_%objectId%_Subclass 5 0\">
      1731: aastore
      1732: dup
      1733: iconst_1
      1734: invokestatic  #501                // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
      1737: aload_1
      1738: invokevirtual #492                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
      1741: invokevirtual #506                // Method ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
      1744: aastore
      1745: dup
      1746: iconst_2
      1747: ldc_w         #472                // String </a><br>
      1750: aastore
      1751: invokestatic  #474                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
      1754: aload_1
      1755: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      1758: invokeinterface #509,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
      1763: invokeinterface #232,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      1768: astore        13
      1770: aload         13
      1772: invokeinterface #238,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1777: ifeq          1853
      1780: aload         13
      1782: invokeinterface #243,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1787: checkcast     #512                // class ext/mods/gameserver/model/actor/container/player/SubClass
      1790: astore        14
      1792: aload_0
      1793: aload         14
      1795: invokevirtual #514                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getClassDefinition:()Lext/mods/gameserver/enums/actors/ClassId;
      1798: invokevirtual #518                // Method checkVillageMaster:(Lext/mods/gameserver/enums/actors/ClassId;)Z
      1801: ifeq          1850
      1804: aload         11
      1806: iconst_5
      1807: anewarray     #460                // class java/lang/Object
      1810: dup
      1811: iconst_0
      1812: ldc_w         #521                // String <a action=\"bypass -h npc_%objectId%_Subclass 5
      1815: aastore
      1816: dup
      1817: iconst_1
      1818: aload         14
      1820: invokevirtual #523                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getClassIndex:()I
      1823: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1826: aastore
      1827: dup
      1828: iconst_2
      1829: ldc_w         #470                // String \">
      1832: aastore
      1833: dup
      1834: iconst_3
      1835: aload         14
      1837: invokevirtual #514                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getClassDefinition:()Lext/mods/gameserver/enums/actors/ClassId;
      1840: aastore
      1841: dup
      1842: iconst_4
      1843: ldc_w         #472                // String </a><br>
      1846: aastore
      1847: invokestatic  #474                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
      1850: goto          1770
      1853: aload         11
      1855: invokevirtual #526                // Method java/lang/StringBuilder.length:()I
      1858: ifle          1889
      1861: aload         7
      1863: aload_1
      1864: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1867: ldc_w         #527                // String html/villagemaster/SubClass_Change.htm
      1870: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1873: aload         7
      1875: ldc_w         #480                // String %list%
      1878: aload         11
      1880: invokevirtual #482                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1883: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1886: goto          2832
      1889: aload         7
      1891: aload_1
      1892: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1895: ldc_w         #529                // String html/villagemaster/SubClass_ChangeNotFound.htm
      1898: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1901: goto          2832
      1904: aload_1
      1905: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      1908: invokeinterface #489,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
      1913: ifeq          1931
      1916: aload         7
      1918: aload_1
      1919: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1922: ldc_w         #531                // String html/villagemaster/SubClass_ModifyEmpty.htm
      1925: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1928: goto          2832
      1931: aload         7
      1933: aload_1
      1934: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1937: ldc_w         #533                // String html/villagemaster/SubClass_Modify.htm
      1940: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1943: aload_1
      1944: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      1947: iconst_1
      1948: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1951: invokeinterface #535,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      1956: ifeq          1995
      1959: aload         7
      1961: ldc_w         #539                // String %sub1%
      1964: invokestatic  #501                // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
      1967: aload_1
      1968: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      1971: iconst_1
      1972: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1975: invokeinterface #541,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      1980: checkcast     #512                // class ext/mods/gameserver/model/actor/container/player/SubClass
      1983: invokevirtual #545                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getClassId:()I
      1986: invokevirtual #506                // Method ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
      1989: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1992: goto          2005
      1995: aload         7
      1997: ldc_w         #548                // String <a action=\"bypass -h npc_%objectId%_Subclass 6 1\">%sub1%</a><br>
      2000: ldc           #7                  // String
      2002: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2005: aload_1
      2006: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2009: iconst_2
      2010: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      2013: invokeinterface #535,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      2018: ifeq          2057
      2021: aload         7
      2023: ldc_w         #550                // String %sub2%
      2026: invokestatic  #501                // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
      2029: aload_1
      2030: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2033: iconst_2
      2034: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      2037: invokeinterface #541,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      2042: checkcast     #512                // class ext/mods/gameserver/model/actor/container/player/SubClass
      2045: invokevirtual #545                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getClassId:()I
      2048: invokevirtual #506                // Method ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
      2051: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2054: goto          2067
      2057: aload         7
      2059: ldc_w         #552                // String <a action=\"bypass -h npc_%objectId%_Subclass 6 2\">%sub2%</a><br>
      2062: ldc           #7                  // String
      2064: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2067: aload_1
      2068: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2071: iconst_3
      2072: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      2075: invokeinterface #535,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      2080: ifeq          2119
      2083: aload         7
      2085: ldc_w         #554                // String %sub3%
      2088: invokestatic  #501                // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
      2091: aload_1
      2092: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2095: iconst_3
      2096: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      2099: invokeinterface #541,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      2104: checkcast     #512                // class ext/mods/gameserver/model/actor/container/player/SubClass
      2107: invokevirtual #545                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getClassId:()I
      2110: invokevirtual #506                // Method ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
      2113: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2116: goto          2832
      2119: aload         7
      2121: ldc_w         #556                // String <a action=\"bypass -h npc_%objectId%_Subclass 6 3\">%sub3%</a><br>
      2124: ldc           #7                  // String
      2126: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2129: goto          2832
      2132: aload_1
      2133: invokevirtual #558                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
      2136: getstatic     #562                // Field ext/mods/gameserver/enums/FloodProtector.SUBCLASS:Lext/mods/gameserver/enums/FloodProtector;
      2139: invokevirtual #568                // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
      2142: ifne          2146
      2145: return
      2146: iconst_1
      2147: istore        13
      2149: aload_1
      2150: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2153: invokeinterface #438,  1          // InterfaceMethod java/util/Map.size:()I
      2158: iconst_3
      2159: if_icmplt     2165
      2162: iconst_0
      2163: istore        13
      2165: aload_1
      2166: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2169: invokevirtual #578                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      2172: bipush        75
      2174: if_icmpge     2180
      2177: iconst_0
      2178: istore        13
      2180: iload         13
      2182: ifeq          2242
      2185: aload_1
      2186: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2189: invokeinterface #509,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
      2194: invokeinterface #232,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      2199: astore        14
      2201: aload         14
      2203: invokeinterface #238,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      2208: ifeq          2242
      2211: aload         14
      2213: invokeinterface #243,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      2218: checkcast     #512                // class ext/mods/gameserver/model/actor/container/player/SubClass
      2221: astore        15
      2223: aload         15
      2225: invokevirtual #583                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getLevel:()I
      2228: bipush        75
      2230: if_icmpge     2239
      2233: iconst_0
      2234: istore        13
      2236: goto          2242
      2239: goto          2201
      2242: iload         13
      2244: ifeq          2260
      2247: getstatic     #584                // Field ext/mods/Config.SUBCLASS_WITHOUT_QUESTS:Z
      2250: ifne          2260
      2253: aload_0
      2254: aload_1
      2255: invokevirtual #588                // Method checkQuests:(Lext/mods/gameserver/model/actor/Player;)Z
      2258: istore        13
      2260: iload         13
      2262: ifeq          2379
      2265: aload_0
      2266: aload_1
      2267: iload         9
      2269: invokevirtual #591                // Method isValidNewSubClass:(Lext/mods/gameserver/model/actor/Player;I)Z
      2272: ifeq          2379
      2275: aload_1
      2276: iload         9
      2278: aload_1
      2279: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2282: invokeinterface #438,  1          // InterfaceMethod java/util/Map.size:()I
      2287: iconst_1
      2288: iadd
      2289: invokevirtual #595                // Method ext/mods/gameserver/model/actor/Player.addSubClass:(II)Z
      2292: ifne          2296
      2295: return
      2296: aload_1
      2297: aload_1
      2298: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2301: invokeinterface #438,  1          // InterfaceMethod java/util/Map.size:()I
      2306: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Player.setActiveClass:(I)Z
      2309: pop
      2310: aload_1
      2311: invokevirtual #602                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
      2314: getstatic     #606                // Field ext/mods/gameserver/enums/actors/MissionType.SUBCLASS:Lext/mods/gameserver/enums/actors/MissionType;
      2317: invokevirtual #611                // Method ext/mods/gameserver/model/actor/container/player/MissionList.getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
      2320: invokevirtual #617                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
      2323: aload_1
      2324: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2327: invokeinterface #438,  1          // InterfaceMethod java/util/Map.size:()I
      2332: if_icmpge     2348
      2335: aload_1
      2336: invokevirtual #602                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
      2339: getstatic     #606                // Field ext/mods/gameserver/enums/actors/MissionType.SUBCLASS:Lext/mods/gameserver/enums/actors/MissionType;
      2342: iconst_1
      2343: iconst_1
      2344: iconst_0
      2345: invokevirtual #622                // Method ext/mods/gameserver/model/actor/container/player/MissionList.set:(Lext/mods/gameserver/enums/actors/MissionType;IZZ)V
      2348: aload         7
      2350: aload_1
      2351: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2354: ldc_w         #626                // String html/villagemaster/SubClass_AddOk.htm
      2357: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2360: aload_1
      2361: getstatic     #628                // Field ext/mods/gameserver/network/SystemMessageId.ADD_NEW_SUBCLASS:Lext/mods/gameserver/network/SystemMessageId;
      2364: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      2367: invokestatic  #631                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
      2370: aload_1
      2371: iload         9
      2373: invokevirtual #636                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.notifySetClass:(Lext/mods/gameserver/model/actor/Player;I)V
      2376: goto          2832
      2379: aload         7
      2381: aload_1
      2382: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2385: ldc_w         #443                // String html/villagemaster/SubClass_Fail.htm
      2388: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2391: goto          2832
      2394: aload_1
      2395: invokevirtual #558                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
      2398: getstatic     #562                // Field ext/mods/gameserver/enums/FloodProtector.SUBCLASS:Lext/mods/gameserver/enums/FloodProtector;
      2401: invokevirtual #568                // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
      2404: ifne          2408
      2407: return
      2408: aload_1
      2409: invokevirtual #640                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
      2412: iload         9
      2414: if_icmpne     2432
      2417: aload         7
      2419: aload_1
      2420: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2423: ldc_w         #641                // String html/villagemaster/SubClass_Current.htm
      2426: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2429: goto          2832
      2432: iload         9
      2434: ifne          2449
      2437: aload_0
      2438: aload_1
      2439: invokevirtual #492                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
      2442: invokevirtual #495                // Method checkVillageMaster:(I)Z
      2445: ifne          2483
      2448: return
      2449: aload_0
      2450: aload_1
      2451: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
      2454: iload         9
      2456: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      2459: invokeinterface #541,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      2464: checkcast     #512                // class ext/mods/gameserver/model/actor/container/player/SubClass
      2467: invokevirtual #514                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getClassDefinition:()Lext/mods/gameserver/enums/actors/ClassId;
      2470: invokevirtual #518                // Method checkVillageMaster:(Lext/mods/gameserver/enums/actors/ClassId;)Z
      2473: ifne          2477
      2476: return
      2477: goto          2483
      2480: astore        14
      2482: return
      2483: aload_1
      2484: invokevirtual #645                // Method ext/mods/gameserver/model/actor/Player.stopAllEffects:()V
      2487: aload_1
      2488: iload         9
      2490: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Player.setActiveClass:(I)Z
      2493: pop
      2494: aload_1
      2495: getstatic     #648                // Field ext/mods/gameserver/network/SystemMessageId.SUBCLASS_TRANSFER_COMPLETED:Lext/mods/gameserver/network/SystemMessageId;
      2498: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      2501: return
      2502: iload         9
      2504: iconst_1
      2505: if_icmplt     2514
      2508: iload         9
      2510: iconst_3
      2511: if_icmple     2515
      2514: return
      2515: aload_0
      2516: aload_1
      2517: invokevirtual #445                // Method getAvailableSubClasses:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
      2520: astore        12
      2522: aload         12
      2524: invokeinterface #449,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
      2529: ifeq          2540
      2532: aload_1
      2533: ldc_w         #452                // String There are no sub classes available at this time.
      2536: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2539: return
      2540: new           #454                // class java/lang/StringBuilder
      2543: dup
      2544: sipush        300
      2547: invokespecial #456                // Method java/lang/StringBuilder."<init>":(I)V
      2550: astore        11
      2552: aload         12
      2554: invokeinterface #457,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      2559: astore        14
      2561: aload         14
      2563: invokeinterface #238,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      2568: ifeq          2651
      2571: aload         14
      2573: invokeinterface #243,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      2578: checkcast     #458                // class ext/mods/gameserver/enums/actors/ClassId
      2581: astore        15
      2583: aload         11
      2585: bipush        8
      2587: anewarray     #460                // class java/lang/Object
      2590: dup
      2591: iconst_0
      2592: ldc_w         #651                // String <a action=\"bypass -h npc_%objectId%_Subclass 7
      2595: aastore
      2596: dup
      2597: iconst_1
      2598: iload         9
      2600: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      2603: aastore
      2604: dup
      2605: iconst_2
      2606: ldc           #19                 // String
      2608: aastore
      2609: dup
      2610: iconst_3
      2611: aload         15
      2613: invokevirtual #464                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
      2616: invokestatic  #465                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      2619: aastore
      2620: dup
      2621: iconst_4
      2622: ldc_w         #653                // String \" msg=\"1445;
      2625: aastore
      2626: dup
      2627: iconst_5
      2628: ldc_w         #470                // String \">
      2631: aastore
      2632: dup
      2633: bipush        6
      2635: aload         15
      2637: aastore
      2638: dup
      2639: bipush        7
      2641: ldc_w         #472                // String </a><br>
      2644: aastore
      2645: invokestatic  #474                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
      2648: goto          2561
      2651: iload         9
      2653: tableswitch   { // 1 to 3

                       1: 2680

                       2: 2695

                       3: 2710
                 default: 2725
            }
      2680: aload         7
      2682: aload_1
      2683: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2686: ldc_w         #655                // String html/villagemaster/SubClass_ModifyChoice1.htm
      2689: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2692: goto          2737
      2695: aload         7
      2697: aload_1
      2698: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2701: ldc_w         #657                // String html/villagemaster/SubClass_ModifyChoice2.htm
      2704: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2707: goto          2737
      2710: aload         7
      2712: aload_1
      2713: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2716: ldc_w         #659                // String html/villagemaster/SubClass_ModifyChoice3.htm
      2719: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2722: goto          2737
      2725: aload         7
      2727: aload_1
      2728: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2731: ldc_w         #661                // String html/villagemaster/SubClass_ModifyChoice.htm
      2734: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2737: aload         7
      2739: ldc_w         #480                // String %list%
      2742: aload         11
      2744: invokevirtual #482                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      2747: invokevirtual #485                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2750: goto          2832
      2753: aload_1
      2754: invokevirtual #558                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
      2757: getstatic     #562                // Field ext/mods/gameserver/enums/FloodProtector.SUBCLASS:Lext/mods/gameserver/enums/FloodProtector;
      2760: invokevirtual #568                // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
      2763: ifne          2767
      2766: return
      2767: aload_0
      2768: aload_1
      2769: iload         10
      2771: invokevirtual #591                // Method isValidNewSubClass:(Lext/mods/gameserver/model/actor/Player;I)Z
      2774: ifne          2778
      2777: return
      2778: aload_1
      2779: iload         9
      2781: iload         10
      2783: invokevirtual #663                // Method ext/mods/gameserver/model/actor/Player.modifySubClass:(II)Z
      2786: ifeq          2818
      2789: aload_1
      2790: iload         9
      2792: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Player.setActiveClass:(I)Z
      2795: pop
      2796: aload         7
      2798: aload_1
      2799: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2802: ldc_w         #666                // String html/villagemaster/SubClass_ModifyOk.htm
      2805: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2808: aload_1
      2809: getstatic     #628                // Field ext/mods/gameserver/network/SystemMessageId.ADD_NEW_SUBCLASS:Lext/mods/gameserver/network/SystemMessageId;
      2812: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      2815: goto          2832
      2818: aload_1
      2819: iconst_0
      2820: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Player.setActiveClass:(I)Z
      2823: pop
      2824: aload_1
      2825: ldc_w         #668                // String The sub class could not be added, you have been reverted to your base class.
      2828: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2831: return
      2832: aload         7
      2834: ldc_w         #670                // String %objectId%
      2837: aload_0
      2838: invokevirtual #175                // Method getObjectId:()I
      2841: invokevirtual #672                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2844: aload_1
      2845: aload         7
      2847: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2850: goto          2859
      2853: aload_0
      2854: aload_1
      2855: aload_2
      2856: invokespecial #675                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      2859: return
      Exception table:
         from    to  target type
          1280  1357  1360   Class java/lang/Exception
          2449  2476  2480   Class java/lang/NullPointerException
      LineNumberTable:
        line 81: 0
        line 82: 7
        line 84: 12
        line 85: 16
        line 87: 20
        line 88: 26
        line 89: 31
        line 90: 37
        line 92: 42
        line 94: 60
        line 96: 68
        line 98: 79
        line 99: 86
        line 102: 87
        line 103: 97
        line 104: 100
        line 106: 110
        line 107: 118
        line 109: 119
        line 111: 131
        line 113: 141
        line 114: 157
        line 116: 158
        line 118: 165
        line 119: 172
        line 122: 173
        line 123: 179
        line 125: 196
        line 127: 201
        line 128: 207
        line 131: 208
        line 133: 216
        line 134: 223
        line 137: 224
        line 139: 243
        line 140: 250
        line 143: 251
        line 145: 258
        line 146: 265
        line 147: 291
        line 148: 294
        line 150: 304
        line 151: 312
        line 153: 313
        line 155: 328
        line 157: 338
        line 158: 346
        line 160: 347
        line 162: 363
        line 164: 373
        line 165: 381
        line 167: 382
        line 169: 393
        line 171: 403
        line 172: 411
        line 174: 412
        line 176: 423
        line 177: 430
        line 180: 431
        line 181: 438
        line 182: 448
        line 184: 461
        line 185: 474
        line 186: 485
        line 187: 491
        line 189: 494
        line 191: 504
        line 193: 515
        line 195: 525
        line 197: 532
        line 198: 539
        line 201: 540
        line 202: 546
        line 204: 554
        line 205: 561
        line 208: 562
        line 210: 570
        line 211: 577
        line 214: 578
        line 216: 594
        line 217: 601
        line 220: 602
        line 222: 637
        line 224: 650
        line 225: 674
        line 227: 675
        line 229: 678
        line 231: 690
        line 232: 697
        line 235: 698
        line 237: 704
        line 238: 721
        line 239: 742
        line 241: 747
        line 244: 758
        line 246: 766
        line 247: 772
        line 248: 775
        line 250: 786
        line 251: 794
        line 253: 795
        line 255: 802
        line 256: 809
        line 259: 810
        line 260: 822
        line 262: 823
        line 263: 829
        line 264: 838
        line 266: 851
        line 268: 856
        line 269: 868
        line 270: 874
        line 273: 875
        line 275: 883
        line 276: 890
        line 279: 891
        line 281: 899
        line 282: 906
        line 285: 907
        line 287: 915
        line 288: 926
        line 291: 941
        line 293: 953
        line 294: 959
        line 295: 962
        line 297: 973
        line 299: 980
        line 300: 987
        line 303: 988
        line 304: 994
        line 305: 1007
        line 307: 1015
        line 308: 1022
        line 311: 1037
        line 313: 1049
        line 314: 1055
        line 315: 1058
        line 317: 1069
        line 319: 1076
        line 320: 1083
        line 323: 1084
        line 324: 1090
        line 326: 1100
        line 327: 1107
        line 330: 1108
        line 331: 1114
        line 332: 1135
        line 333: 1140
        line 334: 1143
        line 336: 1154
        line 337: 1165
        line 339: 1187
        line 340: 1198
        line 341: 1205
        line 343: 1215
        line 345: 1232
        line 346: 1239
        line 349: 1240
        line 350: 1250
        line 352: 1258
        line 354: 1271
        line 355: 1274
        line 356: 1277
        line 360: 1280
        line 362: 1296
        line 363: 1306
        line 364: 1312
        line 366: 1318
        line 367: 1334
        line 368: 1343
        line 372: 1357
        line 370: 1360
        line 377: 1362
        line 380: 1412
        line 381: 1424
        line 384: 1427
        line 386: 1434
        line 387: 1441
        line 390: 1442
        line 392: 1449
        line 393: 1456
        line 396: 1457
        line 398: 1470
        line 399: 1482
        line 402: 1485
        line 403: 1492
        line 405: 1502
        line 406: 1509
        line 409: 1510
        line 410: 1522
        line 411: 1553
        line 413: 1612
        line 414: 1624
        line 415: 1637
        line 418: 1640
        line 420: 1647
        line 421: 1654
        line 424: 1655
        line 426: 1662
        line 427: 1669
        line 430: 1670
        line 431: 1682
        line 434: 1697
        line 436: 1709
        line 437: 1720
        line 439: 1754
        line 441: 1792
        line 442: 1804
        line 443: 1850
        line 445: 1853
        line 447: 1861
        line 448: 1873
        line 451: 1889
        line 453: 1901
        line 456: 1904
        line 458: 1916
        line 459: 1928
        line 462: 1931
        line 463: 1943
        line 464: 1959
        line 466: 1995
        line 468: 2005
        line 469: 2021
        line 471: 2057
        line 473: 2067
        line 474: 2083
        line 476: 2119
        line 477: 2129
        line 480: 2132
        line 481: 2145
        line 483: 2146
        line 485: 2149
        line 486: 2162
        line 488: 2165
        line 489: 2177
        line 491: 2180
        line 493: 2185
        line 495: 2223
        line 497: 2233
        line 498: 2236
        line 500: 2239
        line 503: 2242
        line 504: 2253
        line 506: 2260
        line 508: 2275
        line 509: 2295
        line 511: 2296
        line 513: 2310
        line 514: 2335
        line 516: 2348
        line 517: 2360
        line 518: 2367
        line 521: 2379
        line 522: 2391
        line 525: 2394
        line 526: 2407
        line 528: 2408
        line 530: 2417
        line 531: 2429
        line 534: 2432
        line 536: 2437
        line 537: 2448
        line 543: 2449
        line 544: 2476
        line 549: 2477
        line 546: 2480
        line 548: 2482
        line 552: 2483
        line 553: 2487
        line 554: 2494
        line 555: 2501
        line 558: 2502
        line 559: 2514
        line 561: 2515
        line 563: 2522
        line 565: 2532
        line 566: 2539
        line 569: 2540
        line 570: 2552
        line 571: 2583
        line 573: 2651
        line 576: 2680
        line 577: 2692
        line 580: 2695
        line 581: 2707
        line 584: 2710
        line 585: 2722
        line 588: 2725
        line 590: 2737
        line 591: 2750
        line 594: 2753
        line 595: 2766
        line 597: 2767
        line 598: 2777
        line 600: 2778
        line 602: 2789
        line 604: 2796
        line 605: 2808
        line 609: 2818
        line 611: 2824
        line 612: 2831
        line 617: 2832
        line 618: 2844
        line 619: 2850
        line 622: 2853
        line 624: 2859
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           68      29     7   val   Ljava/lang/String;
          179     112     7  clan   Lext/mods/gameserver/model/pledge/Clan;
          196      95     8 subPledge   Lext/mods/gameserver/model/pledge/SubPledge;
          474      17     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          637      38     9 castle   Lext/mods/gameserver/model/residence/castle/Castle;
          546     226     7  clan   Lext/mods/gameserver/model/pledge/Clan;
          829     130     7  clan   Lext/mods/gameserver/model/pledge/Clan;
          838     121     8 member   Lext/mods/gameserver/model/pledge/ClanMember;
          851     108     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          994      61     7  clan   Lext/mods/gameserver/model/pledge/Clan;
         1007      48     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1090      50     7  clan   Lext/mods/gameserver/model/pledge/Clan;
         1306      51    11 endIndex   I
         1553      56    14 subClass   Lext/mods/gameserver/enums/actors/ClassId;
         1522     118    11    sb   Ljava/lang/StringBuilder;
         1492     148    12 subsAvailable   Ljava/util/Set;
         1792      58    14 subclass   Lext/mods/gameserver/model/actor/container/player/SubClass;
         1709     195    11    sb   Ljava/lang/StringBuilder;
         2223      16    15 subclass   Lext/mods/gameserver/model/actor/container/player/SubClass;
         2149     245    13 allowAddition   Z
         2482       1    14     e   Ljava/lang/NullPointerException;
         2583      65    15 subClass   Lext/mods/gameserver/enums/actors/ClassId;
         2552     201    11    sb   Ljava/lang/StringBuilder;
         2522     231    12 subsAvailable   Ljava/util/Set;
         1271    1579     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1274    1576     8 cmdChoice   I
         1277    1573     9 paramOne   I
         1280    1570    10 paramTwo   I
            0    2860     0  this   Lext/mods/gameserver/model/actor/instance/VillageMaster;
            0    2860     1 player   Lext/mods/gameserver/model/actor/Player;
            0    2860     2 command   Ljava/lang/String;
            7    2853     3 commandStr   [Ljava/lang/String;
           12    2848     4 actualCommand   Ljava/lang/String;
           16    2844     5 cmdParams   Ljava/lang/String;
           20    2840     6 cmdParams2   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
         1492     148    12 subsAvailable   Ljava/util/Set<Lext/mods/gameserver/enums/actors/ClassId;>;
         2522     231    12 subsAvailable   Ljava/util/Set<Lext/mods/gameserver/enums/actors/ClassId;>;
      StackMapTable: number_of_entries = 124
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/actor/instance/VillageMaster, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 18 /* same */
        frame_type = 11 /* same */
        frame_type = 25 /* same */
        frame_type = 0 /* same */
        frame_type = 14 /* same */
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/SubPledge ]
        frame_type = 15 /* same */
        frame_type = 18 /* same */
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 42
        frame_type = 18 /* same */
        frame_type = 14 /* same */
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 18 /* same */
        frame_type = 10 /* same */
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 16 /* same */
        frame_type = 45 /* same */
        frame_type = 20 /* same */
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/actor/instance/VillageMaster, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, class java/util/Iterator, class ext/mods/gameserver/model/residence/castle/Castle ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/VillageMaster, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, class java/util/Iterator, class ext/mods/gameserver/model/residence/castle/Castle ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 250 /* chop */
          offset_delta = 3
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 19 /* same */
        frame_type = 59 /* same */
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 19 /* same */
        frame_type = 14 /* same */
        frame_type = 12 /* same */
        frame_type = 254 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 33 /* same */
        frame_type = 11 /* same */
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 25 /* same */
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 11 /* same */
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 250 /* chop */
          offset_delta = 34
        frame_type = 43 /* same */
        frame_type = 17 /* same */
        frame_type = 26 /* same */
        frame_type = 7 /* same */
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/model/actor/instance/VillageMaster, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 38
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 49 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 27 /* same */
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ top, class java/util/Set ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/VillageMaster, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, class java/lang/StringBuilder, class java/util/Set, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 80
        frame_type = 249 /* chop */
          offset_delta = 27
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class java/lang/StringBuilder ]
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ top, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 79
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 35 /* same */
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 26 /* same */
        frame_type = 63 /* same */
        frame_type = 9 /* same */
        frame_type = 51 /* same */
        frame_type = 9 /* same */
        frame_type = 51 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 254 /* append */
          offset_delta = 18
          locals = [ top, top, int ]
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 17 /* same */
        frame_type = 35 /* same */
        frame_type = 51 /* same */
        frame_type = 30 /* same */
        frame_type = 248 /* chop */
          offset_delta = 14
        frame_type = 13 /* same */
        frame_type = 23 /* same */
        frame_type = 16 /* same */
        frame_type = 27 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/NullPointerException ]
        frame_type = 2 /* same */
        frame_type = 18 /* same */
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ top, class java/util/Set ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/VillageMaster, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, class java/lang/StringBuilder, class java/util/Set, top, class java/util/Iterator ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 89
        frame_type = 28 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 249 /* chop */
          offset_delta = 15
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 39 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/VillageMaster, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 5 /* same */

  protected boolean checkQuests(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #679                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
         4: ifeq          9
         7: iconst_1
         8: ireturn
         9: getstatic     #682                // Field ext/mods/Config.SUBCLASS_REQUIRE_MIMIR:Z
        12: ifeq          39
        15: aload_1
        16: invokevirtual #685                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        19: ldc_w         #689                // String Q235_MimirsElixir
        22: invokevirtual #691                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
        25: astore_2
        26: aload_2
        27: ifnull        37
        30: aload_2
        31: invokevirtual #697                // Method ext/mods/gameserver/scripting/QuestState.isCompleted:()Z
        34: ifne          39
        37: iconst_0
        38: ireturn
        39: getstatic     #702                // Field ext/mods/Config.SUBCLASS_REQUIRE_FATE:Z
        42: ifeq          69
        45: aload_1
        46: invokevirtual #685                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        49: ldc_w         #705                // String Q234_FatesWhisper
        52: invokevirtual #691                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
        55: astore_2
        56: aload_2
        57: ifnull        67
        60: aload_2
        61: invokevirtual #697                // Method ext/mods/gameserver/scripting/QuestState.isCompleted:()Z
        64: ifne          69
        67: iconst_0
        68: ireturn
        69: iconst_1
        70: ireturn
      LineNumberTable:
        line 628: 0
        line 629: 7
        line 631: 9
        line 633: 15
        line 634: 26
        line 635: 37
        line 638: 39
        line 640: 45
        line 641: 56
        line 642: 67
        line 645: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      13     2 mimir   Lext/mods/gameserver/scripting/QuestState;
           56      13     2  fate   Lext/mods/gameserver/scripting/QuestState;
            0      71     0  this   Lext/mods/gameserver/model/actor/instance/VillageMaster;
            0      71     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/scripting/QuestState ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/scripting/QuestState ]
        frame_type = 250 /* chop */
          offset_delta = 1

  protected boolean checkVillageMasterRace(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 715: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/VillageMaster;
            0       2     1 pclass   Lext/mods/gameserver/enums/actors/ClassId;

  protected boolean checkVillageMasterTeachType(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 720: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/VillageMaster;
            0       2     1 pclass   Lext/mods/gameserver/enums/actors/ClassId;

  public final boolean checkVillageMaster(int);
    descriptor: (I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getstatic     #716                // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
         4: iload_1
         5: aaload
         6: invokevirtual #518                // Method checkVillageMaster:(Lext/mods/gameserver/enums/actors/ClassId;)Z
         9: ireturn
      LineNumberTable:
        line 725: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/VillageMaster;
            0      10     1 classId   I

  public final boolean checkVillageMaster(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #720                // Field ext/mods/Config.GAME_SUBCLASS_EVERYWHERE:Z
         3: ifeq          8
         6: iconst_1
         7: ireturn
         8: aload_0
         9: aload_1
        10: invokevirtual #723                // Method checkVillageMasterRace:(Lext/mods/gameserver/enums/actors/ClassId;)Z
        13: ifeq          28
        16: aload_0
        17: aload_1
        18: invokevirtual #726                // Method checkVillageMasterTeachType:(Lext/mods/gameserver/enums/actors/ClassId;)Z
        21: ifeq          28
        24: iconst_1
        25: goto          29
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 730: 0
        line 731: 6
        line 733: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/instance/VillageMaster;
            0      30     1 pclass   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public static final void showPledgeSkillList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
         4: ifne          40
         7: new           #173                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        10: dup
        11: iconst_0
        12: invokespecial #178                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        15: astore_1
        16: aload_1
        17: aload_0
        18: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        21: ldc_w         #810                // String html/script/feature/Clan/9000-09-no.htm
        24: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        27: aload_0
        28: aload_1
        29: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        32: aload_0
        33: getstatic     #812                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        36: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        39: return
        40: invokestatic  #818                // Method ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
        43: aload_0
        44: invokevirtual #823                // Method ext/mods/gameserver/data/xml/SkillTreeData.getClanSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
        47: astore_1
        48: aload_1
        49: invokeinterface #827,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        54: ifeq          74
        57: aload_0
        58: getstatic     #830                // Field ext/mods/gameserver/network/SystemMessageId.DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
        61: invokestatic  #745                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        64: iconst_5
        65: invokevirtual #833                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        68: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        71: goto          89
        74: aload_0
        75: new           #837                // class ext/mods/gameserver/network/serverpackets/AcquireSkillList
        78: dup
        79: getstatic     #839                // Field ext/mods/gameserver/enums/skills/AcquireSkillType.CLAN:Lext/mods/gameserver/enums/skills/AcquireSkillType;
        82: aload_1
        83: invokespecial #845                // Method ext/mods/gameserver/network/serverpackets/AcquireSkillList."<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
        86: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        89: aload_0
        90: getstatic     #812                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        93: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        96: return
      LineNumberTable:
        line 882: 0
        line 884: 7
        line 885: 16
        line 886: 27
        line 887: 32
        line 888: 39
        line 891: 40
        line 892: 48
        line 893: 57
        line 895: 74
        line 897: 89
        line 898: 96
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16      24     1  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0      97     0 player   Lext/mods/gameserver/model/actor/Player;
           48      49     1 skills   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           48      49     1 skills   Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;>;
      StackMapTable: number_of_entries = 3
        frame_type = 40 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class java/util/List ]
        frame_type = 14 /* same */
}
SourceFile: "VillageMaster.java"
BootstrapMethods:
  0: #933 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #927 \u0001
  1: #933 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #929 \u0001-\u0001
  2: #933 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #931 html/villagemaster/\u0001.htm
InnerClasses:
  public static final #944= #940 of #942; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
