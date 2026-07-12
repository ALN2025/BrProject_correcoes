// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminSiege
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminSiege.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminSiege.class
  Last modified 9 de jul de 2026; size 10679 bytes
  MD5 checksum 8f9b206e1a4c00952dc9e20f499e9f9c
  Compiled from "AdminSiege.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminSiege implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #33                         // ext/mods/gameserver/handler/admincommandhandlers/AdminSiege
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = Methodref          #7.#19        // java/util/StringTokenizer.countTokens:()I
   #19 = NameAndType        #20:#21       // countTokens:()I
   #20 = Utf8               countTokens
   #21 = Utf8               ()I
   #22 = Methodref          #23.#24       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #23 = Class              #25           // ext/mods/gameserver/data/manager/CastleManager
   #24 = NameAndType        #26:#27       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #25 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #26 = Utf8               getInstance
   #27 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #28 = Methodref          #23.#29       // ext/mods/gameserver/data/manager/CastleManager.getCastleByAlias:(Ljava/lang/String;)Lext/mods/gameserver/model/residence/castle/Castle;
   #29 = NameAndType        #30:#31       // getCastleByAlias:(Ljava/lang/String;)Lext/mods/gameserver/model/residence/castle/Castle;
   #30 = Utf8               getCastleByAlias
   #31 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/residence/castle/Castle;
   #32 = Methodref          #33.#34       // ext/mods/gameserver/handler/admincommandhandlers/AdminSiege.showCastleSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
   #33 = Class              #35           // ext/mods/gameserver/handler/admincommandhandlers/AdminSiege
   #34 = NameAndType        #36:#37       // showCastleSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
   #35 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminSiege
   #36 = Utf8               showCastleSelectPage
   #37 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #38 = Methodref          #33.#39       // ext/mods/gameserver/handler/admincommandhandlers/AdminSiege.showCastleSelectPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/castle/Castle;)V
   #39 = NameAndType        #36:#40       // showCastleSelectPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/castle/Castle;)V
   #40 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/castle/Castle;)V
   #41 = String             #42           // admin_castle
   #42 = Utf8               admin_castle
   #43 = Methodref          #44.#45       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #44 = Class              #46           // java/lang/String
   #45 = NameAndType        #47:#48       // startsWith:(Ljava/lang/String;)Z
   #46 = Utf8               java/lang/String
   #47 = Utf8               startsWith
   #48 = Utf8               (Ljava/lang/String;)Z
   #49 = Methodref          #44.#50       // java/lang/String.hashCode:()I
   #50 = NameAndType        #51:#21       // hashCode:()I
   #51 = Utf8               hashCode
   #52 = String             #53           // set
   #53 = Utf8               set
   #54 = Methodref          #44.#55       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #55 = NameAndType        #56:#57       // equals:(Ljava/lang/Object;)Z
   #56 = Utf8               equals
   #57 = Utf8               (Ljava/lang/Object;)Z
   #58 = String             #59           // remove
   #59 = Utf8               remove
   #60 = String             #61           // certificates
   #61 = Utf8               certificates
   #62 = String             #63           // tax
   #63 = Utf8               tax
   #64 = Methodref          #33.#65       // ext/mods/gameserver/handler/admincommandhandlers/AdminSiege.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #65 = NameAndType        #66:#67       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #66 = Utf8               getTargetPlayer
   #67 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #69 = Class              #71           // ext/mods/gameserver/model/actor/Player
   #70 = NameAndType        #72:#73       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #71 = Utf8               ext/mods/gameserver/model/actor/Player
   #72 = Utf8               getClan
   #73 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #74 = Fieldref           #75.#76       // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
   #75 = Class              #77           // ext/mods/gameserver/network/SystemMessageId
   #76 = NameAndType        #78:#79       // TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
   #77 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #78 = Utf8               TARGET_IS_INCORRECT
   #79 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #80 = Methodref          #69.#81       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #81 = NameAndType        #82:#83       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #82 = Utf8               sendPacket
   #83 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #84 = Methodref          #85.#86       // ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
   #85 = Class              #87           // ext/mods/gameserver/model/pledge/Clan
   #86 = NameAndType        #88:#89       // hasCastle:()Z
   #87 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #88 = Utf8               hasCastle
   #89 = Utf8               ()Z
   #90 = Methodref          #69.#91       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #91 = NameAndType        #92:#17       // getName:()Ljava/lang/String;
   #92 = Utf8               getName
   #93 = InvokeDynamic      #0:#94        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #94 = NameAndType        #95:#96       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #95 = Utf8               makeConcatWithConstants
   #96 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #97 = Methodref          #69.#98       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #98 = NameAndType        #99:#100      // sendMessage:(Ljava/lang/String;)V
   #99 = Utf8               sendMessage
  #100 = Utf8               (Ljava/lang/String;)V
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/residence/castle/Castle.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
  #102 = Class              #104          // ext/mods/gameserver/model/residence/castle/Castle
  #103 = NameAndType        #105:#106     // setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
  #104 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #105 = Utf8               setOwner
  #106 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #107 = Methodref          #69.#108      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #108 = NameAndType        #109:#89      // isClanLeader:()Z
  #109 = Utf8               isClanLeader
  #110 = Methodref          #102.#111     // ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
  #111 = NameAndType        #112:#113     // getSkillsLeader:()Ljava/util/Map;
  #112 = Utf8               getSkillsLeader
  #113 = Utf8               ()Ljava/util/Map;
  #114 = Methodref          #102.#115     // ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
  #115 = NameAndType        #116:#113     // getSkillsMember:()Ljava/util/Map;
  #116 = Utf8               getSkillsMember
  #117 = Methodref          #102.#118     // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #118 = NameAndType        #119:#21      // getId:()I
  #119 = Utf8               getId
  #120 = Methodref          #85.#121      // ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
  #121 = NameAndType        #122:#21      // getCastleId:()I
  #122 = Utf8               getCastleId
  #123 = InvokeDynamic      #1:#124       // #1:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #124 = NameAndType        #125:#126     // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #125 = Utf8               accept
  #126 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #127 = InterfaceMethodref #128.#129     // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
  #128 = Class              #130          // java/util/Map
  #129 = NameAndType        #131:#132     // forEach:(Ljava/util/function/BiConsumer;)V
  #130 = Utf8               java/util/Map
  #131 = Utf8               forEach
  #132 = Utf8               (Ljava/util/function/BiConsumer;)V
  #133 = Methodref          #102.#134     // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
  #134 = NameAndType        #135:#21      // getOwnerId:()I
  #135 = Utf8               getOwnerId
  #136 = Methodref          #102.#137     // ext/mods/gameserver/model/residence/castle/Castle.removeOwner:()V
  #137 = NameAndType        #138:#6       // removeOwner:()V
  #138 = Utf8               removeOwner
  #139 = String             #140          // This castle does not have an owner.
  #140 = Utf8               This castle does not have an owner.
  #141 = Methodref          #102.#142     // ext/mods/gameserver/model/residence/castle/Castle.setLeftCertificates:(IZ)V
  #142 = NameAndType        #143:#144     // setLeftCertificates:(IZ)V
  #143 = Utf8               setLeftCertificates
  #144 = Utf8               (IZ)V
  #145 = Methodref          #102.#91      // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
  #146 = InvokeDynamic      #2:#94        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #147 = Methodref          #102.#148     // ext/mods/gameserver/model/residence/castle/Castle.updateTaxes:()V
  #148 = NameAndType        #149:#6       // updateTaxes:()V
  #149 = Utf8               updateTaxes
  #150 = InvokeDynamic      #3:#94        // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #151 = String             #152          // Usage: //castle [set|remove|certificates|tax castleName].
  #152 = Utf8               Usage: //castle [set|remove|certificates|tax castleName].
  #153 = String             #154          // admin_siege
  #154 = Utf8               admin_siege
  #155 = String             #156          // attack
  #156 = Utf8               attack
  #157 = String             #158          // clear
  #158 = Utf8               clear
  #159 = String             #160          // defend
  #160 = Utf8               defend
  #161 = String             #162          // end
  #162 = Utf8               end
  #163 = String             #164          // list
  #164 = Utf8               list
  #165 = String             #166          // start
  #166 = Utf8               start
  #167 = Methodref          #102.#168     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #168 = NameAndType        #169:#170     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #169 = Utf8               getSiege
  #170 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #171 = Methodref          #172.#173     // ext/mods/gameserver/model/residence/castle/Siege.registerAttacker:(Lext/mods/gameserver/model/actor/Player;)V
  #172 = Class              #174          // ext/mods/gameserver/model/residence/castle/Siege
  #173 = NameAndType        #175:#37      // registerAttacker:(Lext/mods/gameserver/model/actor/Player;)V
  #174 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #175 = Utf8               registerAttacker
  #176 = Methodref          #172.#177     // ext/mods/gameserver/model/residence/castle/Siege.clearAllClans:()V
  #177 = NameAndType        #178:#6       // clearAllClans:()V
  #178 = Utf8               clearAllClans
  #179 = Methodref          #172.#180     // ext/mods/gameserver/model/residence/castle/Siege.registerDefender:(Lext/mods/gameserver/model/actor/Player;)V
  #180 = NameAndType        #181:#37      // registerDefender:(Lext/mods/gameserver/model/actor/Player;)V
  #181 = Utf8               registerDefender
  #182 = Methodref          #172.#183     // ext/mods/gameserver/model/residence/castle/Siege.endSiege:()V
  #183 = NameAndType        #184:#6       // endSiege:()V
  #184 = Utf8               endSiege
  #185 = Class              #186          // ext/mods/gameserver/network/serverpackets/SiegeInfo
  #186 = Utf8               ext/mods/gameserver/network/serverpackets/SiegeInfo
  #187 = Methodref          #185.#188     // ext/mods/gameserver/network/serverpackets/SiegeInfo."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
  #188 = NameAndType        #5:#189       // "<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
  #189 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)V
  #190 = Methodref          #69.#191      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #191 = NameAndType        #82:#192      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #192 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #193 = Methodref          #172.#194     // ext/mods/gameserver/model/residence/castle/Siege.startSiege:()V
  #194 = NameAndType        #195:#6       // startSiege:()V
  #195 = Utf8               startSiege
  #196 = String             #197          // Usage: //siege [attack|clear|defend|end|list|start castleName].
  #197 = Utf8               Usage: //siege [attack|clear|defend|end|list|start castleName].
  #198 = Class              #199          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #199 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #200 = Methodref          #198.#201     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #201 = NameAndType        #5:#202       // "<init>":(I)V
  #202 = Utf8               (I)V
  #203 = Methodref          #69.#204      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #204 = NameAndType        #205:#206     // getLocale:()Ljava/util/Locale;
  #205 = Utf8               getLocale
  #206 = Utf8               ()Ljava/util/Locale;
  #207 = String             #208          // html/admin/castle.htm
  #208 = Utf8               html/admin/castle.htm
  #209 = Methodref          #198.#210     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #210 = NameAndType        #211:#212     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #211 = Utf8               setFile
  #212 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #213 = String             #214          // %castleName%
  #214 = Utf8               %castleName%
  #215 = Methodref          #198.#216     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #216 = NameAndType        #217:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #217 = Utf8               replace
  #218 = String             #219          // %castleAlias%
  #219 = Utf8               %castleAlias%
  #220 = Methodref          #102.#221     // ext/mods/gameserver/model/residence/castle/Castle.getAlias:()Ljava/lang/String;
  #221 = NameAndType        #222:#17      // getAlias:()Ljava/lang/String;
  #222 = Utf8               getAlias
  #223 = String             #224          // %circletId%
  #224 = Utf8               %circletId%
  #225 = Methodref          #102.#226     // ext/mods/gameserver/model/residence/castle/Castle.getCircletId:()I
  #226 = NameAndType        #227:#21      // getCircletId:()I
  #227 = Utf8               getCircletId
  #228 = Methodref          #198.#229     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #229 = NameAndType        #217:#230     // replace:(Ljava/lang/String;I)V
  #230 = Utf8               (Ljava/lang/String;I)V
  #231 = String             #232          // %artifactId%
  #232 = Utf8               %artifactId%
  #233 = Methodref          #102.#234     // ext/mods/gameserver/model/residence/castle/Castle.getArtifacts:()Ljava/util/Map;
  #234 = NameAndType        #235:#113     // getArtifacts:()Ljava/util/Map;
  #235 = Utf8               getArtifacts
  #236 = InterfaceMethodref #128.#237     // java/util/Map.toString:()Ljava/lang/String;
  #237 = NameAndType        #238:#17      // toString:()Ljava/lang/String;
  #238 = Utf8               toString
  #239 = String             #240          // %ticketsNumber%
  #240 = Utf8               %ticketsNumber%
  #241 = Methodref          #102.#242     // ext/mods/gameserver/model/residence/castle/Castle.getTickets:()Ljava/util/List;
  #242 = NameAndType        #243:#244     // getTickets:()Ljava/util/List;
  #243 = Utf8               getTickets
  #244 = Utf8               ()Ljava/util/List;
  #245 = InterfaceMethodref #246.#247     // java/util/List.size:()I
  #246 = Class              #248          // java/util/List
  #247 = NameAndType        #249:#21      // size:()I
  #248 = Utf8               java/util/List
  #249 = Utf8               size
  #250 = String             #251          // %droppedTicketsNumber%
  #251 = Utf8               %droppedTicketsNumber%
  #252 = Methodref          #102.#253     // ext/mods/gameserver/model/residence/castle/Castle.getDroppedTickets:()Ljava/util/Set;
  #253 = NameAndType        #254:#255     // getDroppedTickets:()Ljava/util/Set;
  #254 = Utf8               getDroppedTickets
  #255 = Utf8               ()Ljava/util/Set;
  #256 = InterfaceMethodref #257.#247     // java/util/Set.size:()I
  #257 = Class              #258          // java/util/Set
  #258 = Utf8               java/util/Set
  #259 = String             #260          // %npcsNumber%
  #260 = Utf8               %npcsNumber%
  #261 = Methodref          #102.#262     // ext/mods/gameserver/model/residence/castle/Castle.getNpcs:()Ljava/util/List;
  #262 = NameAndType        #263:#244     // getNpcs:()Ljava/util/List;
  #263 = Utf8               getNpcs
  #264 = String             #265          // %certificates%
  #265 = Utf8               %certificates%
  #266 = Methodref          #102.#267     // ext/mods/gameserver/model/residence/castle/Castle.getLeftCertificates:()I
  #267 = NameAndType        #268:#21      // getLeftCertificates:()I
  #268 = Utf8               getLeftCertificates
  #269 = String             #270          // %parent%
  #270 = Utf8               %parent%
  #271 = Methodref          #102.#272     // ext/mods/gameserver/model/residence/castle/Castle.getParentId:()I
  #272 = NameAndType        #273:#21      // getParentId:()I
  #273 = Utf8               getParentId
  #274 = String             #275          // %aliveLifeTowers%
  #275 = Utf8               %aliveLifeTowers%
  #276 = Methodref          #102.#277     // ext/mods/gameserver/model/residence/castle/Castle.getAliveLifeTowerCount:()I
  #277 = NameAndType        #278:#21      // getAliveLifeTowerCount:()I
  #278 = Utf8               getAliveLifeTowerCount
  #279 = String             #280          // %defaultTax%
  #280 = Utf8               %defaultTax%
  #281 = Methodref          #102.#282     // ext/mods/gameserver/model/residence/castle/Castle.getDefaultTaxRate:()I
  #282 = NameAndType        #283:#21      // getDefaultTaxRate:()I
  #283 = Utf8               getDefaultTaxRate
  #284 = String             #285          // %currentTax%
  #285 = Utf8               %currentTax%
  #286 = Methodref          #102.#287     // ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
  #287 = NameAndType        #288:#21      // getCurrentTaxPercent:()I
  #288 = Utf8               getCurrentTaxPercent
  #289 = String             #290          // %nextTax%
  #290 = Utf8               %nextTax%
  #291 = Methodref          #102.#292     // ext/mods/gameserver/model/residence/castle/Castle.getNextTaxPercent:()I
  #292 = NameAndType        #293:#21      // getNextTaxPercent:()I
  #293 = Utf8               getNextTaxPercent
  #294 = String             #295          // %taxSysgetRate%
  #295 = Utf8               %taxSysgetRate%
  #296 = Methodref          #102.#297     // ext/mods/gameserver/model/residence/castle/Castle.getTaxSysgetRate:()I
  #297 = NameAndType        #298:#21      // getTaxSysgetRate:()I
  #298 = Utf8               getTaxSysgetRate
  #299 = String             #300          // %taxRevenue%
  #300 = Utf8               %taxRevenue%
  #301 = Methodref          #102.#302     // ext/mods/gameserver/model/residence/castle/Castle.getTaxRevenue:()J
  #302 = NameAndType        #303:#304     // getTaxRevenue:()J
  #303 = Utf8               getTaxRevenue
  #304 = Utf8               ()J
  #305 = Methodref          #306.#307     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #306 = Class              #308          // ext/mods/commons/lang/StringUtil
  #307 = NameAndType        #309:#310     // formatNumber:(J)Ljava/lang/String;
  #308 = Utf8               ext/mods/commons/lang/StringUtil
  #309 = Utf8               formatNumber
  #310 = Utf8               (J)Ljava/lang/String;
  #311 = String             #312          // %tributeRate%
  #312 = Utf8               %tributeRate%
  #313 = Methodref          #102.#314     // ext/mods/gameserver/model/residence/castle/Castle.getTributeRate:()I
  #314 = NameAndType        #315:#21      // getTributeRate:()I
  #315 = Utf8               getTributeRate
  #316 = String             #317          // %seedIncome%
  #317 = Utf8               %seedIncome%
  #318 = Methodref          #102.#319     // ext/mods/gameserver/model/residence/castle/Castle.getSeedIncome:()J
  #319 = NameAndType        #320:#304     // getSeedIncome:()J
  #320 = Utf8               getSeedIncome
  #321 = String             #322          // %treasury%
  #322 = Utf8               %treasury%
  #323 = Methodref          #102.#324     // ext/mods/gameserver/model/residence/castle/Castle.getTreasury:()J
  #324 = NameAndType        #325:#304     // getTreasury:()J
  #325 = Utf8               getTreasury
  #326 = Class              #327          // java/lang/StringBuilder
  #327 = Utf8               java/lang/StringBuilder
  #328 = Methodref          #326.#3       // java/lang/StringBuilder."<init>":()V
  #329 = InterfaceMethodref #128.#330     // java/util/Map.values:()Ljava/util/Collection;
  #330 = NameAndType        #331:#332     // values:()Ljava/util/Collection;
  #331 = Utf8               values
  #332 = Utf8               ()Ljava/util/Collection;
  #333 = InterfaceMethodref #334.#335     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #334 = Class              #336          // java/util/Collection
  #335 = NameAndType        #337:#338     // iterator:()Ljava/util/Iterator;
  #336 = Utf8               java/util/Collection
  #337 = Utf8               iterator
  #338 = Utf8               ()Ljava/util/Iterator;
  #339 = InterfaceMethodref #340.#341     // java/util/Iterator.hasNext:()Z
  #340 = Class              #342          // java/util/Iterator
  #341 = NameAndType        #343:#89      // hasNext:()Z
  #342 = Utf8               java/util/Iterator
  #343 = Utf8               hasNext
  #344 = InterfaceMethodref #340.#345     // java/util/Iterator.next:()Ljava/lang/Object;
  #345 = NameAndType        #346:#347     // next:()Ljava/lang/Object;
  #346 = Utf8               next
  #347 = Utf8               ()Ljava/lang/Object;
  #348 = Class              #349          // ext/mods/gameserver/model/location/SpawnLocation
  #349 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #350 = String             #351          // <a action=\"bypass -h admin_teleport
  #351 = Utf8               <a action=\"bypass -h admin_teleport
  #352 = Methodref          #348.#237     // ext/mods/gameserver/model/location/SpawnLocation.toString:()Ljava/lang/String;
  #353 = String             #354          // ,
  #354 = Utf8               ,
  #355 = String             #356          //
  #356 = Utf8
  #357 = Methodref          #44.#358      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #358 = NameAndType        #217:#359     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #359 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #360 = String             #361          // \">[
  #361 = Utf8               \">[
  #362 = Methodref          #363.#364     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #363 = Class              #365          // java/lang/Integer
  #364 = NameAndType        #366:#367     // valueOf:(I)Ljava/lang/Integer;
  #365 = Utf8               java/lang/Integer
  #366 = Utf8               valueOf
  #367 = Utf8               (I)Ljava/lang/Integer;
  #368 = String             #369          // ]</a>&nbsp;&nbsp;
  #369 = Utf8               ]</a>&nbsp;&nbsp;
  #370 = Methodref          #306.#371     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #371 = NameAndType        #372:#373     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #372 = Utf8               append
  #373 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #374 = String             #375          // %artifacts%
  #375 = Utf8               %artifacts%
  #376 = Methodref          #326.#237     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #377 = Methodref          #326.#378     // java/lang/StringBuilder.setLength:(I)V
  #378 = NameAndType        #379:#202     // setLength:(I)V
  #379 = Utf8               setLength
  #380 = Methodref          #102.#381     // ext/mods/gameserver/model/residence/castle/Castle.getControlTowers:()Ljava/util/List;
  #381 = NameAndType        #382:#244     // getControlTowers:()Ljava/util/List;
  #382 = Utf8               getControlTowers
  #383 = InterfaceMethodref #246.#335     // java/util/List.iterator:()Ljava/util/Iterator;
  #384 = Class              #385          // ext/mods/gameserver/model/location/TowerSpawnLocation
  #385 = Utf8               ext/mods/gameserver/model/location/TowerSpawnLocation
  #386 = Methodref          #384.#237     // ext/mods/gameserver/model/location/TowerSpawnLocation.toString:()Ljava/lang/String;
  #387 = String             #388          // %ct%
  #388 = Utf8               %ct%
  #389 = String             #390          // html/admin/castles.htm
  #390 = Utf8               html/admin/castles.htm
  #391 = Methodref          #23.#392      // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
  #392 = NameAndType        #393:#332     // getCastles:()Ljava/util/Collection;
  #393 = Utf8               getCastles
  #394 = String             #395          // <table width=300 bgcolor=000000><tr>
  #395 = Utf8               <table width=300 bgcolor=000000><tr>
  #396 = String             #397          // <table width=300><tr>
  #397 = Utf8               <table width=300><tr>
  #398 = Methodref          #326.#399     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #399 = NameAndType        #372:#400     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #400 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #401 = String             #402          // <td width=90><a action=\"bypass -h admin_siege
  #402 = Utf8               <td width=90><a action=\"bypass -h admin_siege
  #403 = String             #404          // \">
  #404 = Utf8               \">
  #405 = String             #406          // </a></td><td width=130>
  #406 = Utf8               </a></td><td width=130>
  #407 = Methodref          #172.#408     // ext/mods/gameserver/model/residence/castle/Siege.getStatus:()Lext/mods/gameserver/enums/SiegeStatus;
  #408 = NameAndType        #409:#410     // getStatus:()Lext/mods/gameserver/enums/SiegeStatus;
  #409 = Utf8               getStatus
  #410 = Utf8               ()Lext/mods/gameserver/enums/SiegeStatus;
  #411 = Methodref          #172.#412     // ext/mods/gameserver/model/residence/castle/Siege.getStatusTranslation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeStatus;)Ljava/lang/String;
  #412 = NameAndType        #413:#414     // getStatusTranslation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeStatus;)Ljava/lang/String;
  #413 = Utf8               getStatusTranslation
  #414 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/SiegeStatus;)Ljava/lang/String;
  #415 = String             #416          // </td><td width=80 align=right><a action=\"bypass admin_siege list
  #416 = Utf8               </td><td width=80 align=right><a action=\"bypass admin_siege list
  #417 = Methodref          #69.#418      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #418 = NameAndType        #419:#420     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #419 = Utf8               getSysString
  #420 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #421 = InvokeDynamic      #4:#94        // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #422 = String             #423          // </tr></table><img src=\"L2UI.SquareGray\" width=270 height=1>
  #423 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=270 height=1>
  #424 = String             #425          // %castles%
  #425 = Utf8               %castles%
  #426 = Fieldref           #33.#427      // ext/mods/gameserver/handler/admincommandhandlers/AdminSiege.ADMIN_COMMANDS:[Ljava/lang/String;
  #427 = NameAndType        #428:#429     // ADMIN_COMMANDS:[Ljava/lang/String;
  #428 = Utf8               ADMIN_COMMANDS
  #429 = Utf8               [Ljava/lang/String;
  #430 = Methodref          #431.#432     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #431 = Class              #433          // ext/mods/gameserver/data/SkillTable
  #432 = NameAndType        #26:#434      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #433 = Utf8               ext/mods/gameserver/data/SkillTable
  #434 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #435 = Methodref          #363.#436     // java/lang/Integer.intValue:()I
  #436 = NameAndType        #437:#21      // intValue:()I
  #437 = Utf8               intValue
  #438 = Methodref          #431.#439     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #439 = NameAndType        #440:#441     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #440 = Utf8               getInfo
  #441 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #442 = Methodref          #69.#443      // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #443 = NameAndType        #444:#445     // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #444 = Utf8               addSkill
  #445 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
  #446 = Class              #447          // ext/mods/gameserver/handler/IAdminCommandHandler
  #447 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #448 = Utf8               Code
  #449 = Utf8               LineNumberTable
  #450 = Utf8               LocalVariableTable
  #451 = Utf8               this
  #452 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminSiege;
  #453 = Utf8               useAdminCommand
  #454 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #455 = Utf8               skill
  #456 = Utf8               Ljava/util/Map;
  #457 = Utf8               targetPlayer
  #458 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #459 = Utf8               command
  #460 = Utf8               Ljava/lang/String;
  #461 = Utf8               player
  #462 = Utf8               st
  #463 = Utf8               Ljava/util/StringTokenizer;
  #464 = Utf8               param
  #465 = Utf8               castle
  #466 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #467 = Utf8               paramCount
  #468 = Utf8               I
  #469 = Utf8               LocalVariableTypeTable
  #470 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #471 = Utf8               StackMapTable
  #472 = Utf8               spawn
  #473 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #474 = Utf8               Lext/mods/gameserver/model/location/TowerSpawnLocation;
  #475 = Utf8               html
  #476 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #477 = Utf8               sb
  #478 = Utf8               Ljava/lang/StringBuilder;
  #479 = Utf8               index
  #480 = Utf8               row
  #481 = Utf8               getAdminCommandList
  #482 = Utf8               ()[Ljava/lang/String;
  #483 = Utf8               lambda$useAdminCommand$0
  #484 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #485 = Utf8               skillId
  #486 = Utf8               Ljava/lang/Integer;
  #487 = Utf8               skillLvl
  #488 = Utf8               <clinit>
  #489 = Utf8               SourceFile
  #490 = Utf8               AdminSiege.java
  #491 = Utf8               BootstrapMethods
  #492 = String             #493          // \u0001\'s clan already owns a castle.
  #493 = Utf8               \u0001\'s clan already owns a castle.
  #494 = MethodType         #495          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #495 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #496 = MethodHandle       6:#497        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminSiege.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #497 = Methodref          #33.#498      // ext/mods/gameserver/handler/admincommandhandlers/AdminSiege.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #498 = NameAndType        #483:#484     // lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #499 = MethodType         #500          //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #500 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #501 = String             #502          // \u0001\'s castle certificates are reset.
  #502 = Utf8               \u0001\'s castle certificates are reset.
  #503 = String             #504          // \u0001\'s taxes have been updated.
  #504 = Utf8               \u0001\'s taxes have been updated.
  #505 = String             #506          // \">\u0001</a></td>
  #506 = Utf8               \">\u0001</a></td>
  #507 = MethodHandle       6:#508        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #508 = Methodref          #509.#510     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #509 = Class              #511          // java/lang/invoke/StringConcatFactory
  #510 = NameAndType        #95:#512      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #511 = Utf8               java/lang/invoke/StringConcatFactory
  #512 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #513 = MethodHandle       6:#514        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #514 = Methodref          #515.#516     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #515 = Class              #517          // java/lang/invoke/LambdaMetafactory
  #516 = NameAndType        #518:#519     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #517 = Utf8               java/lang/invoke/LambdaMetafactory
  #518 = Utf8               metafactory
  #519 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #520 = Utf8               InnerClasses
  #521 = Class              #522          // java/lang/invoke/MethodHandles$Lookup
  #522 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #523 = Class              #524          // java/lang/invoke/MethodHandles
  #524 = Utf8               java/lang/invoke/MethodHandles
  #525 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminSiege();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSiege;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: astore_1
        16: aconst_null
        17: astore        4
        19: aconst_null
        20: astore        5
        22: aload_3
        23: invokevirtual #18                 // Method java/util/StringTokenizer.countTokens:()I
        26: istore        6
        28: iload         6
        30: iconst_1
        31: if_icmpne     49
        34: invokestatic  #22                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        37: aload_3
        38: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        41: invokevirtual #28                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastleByAlias:(Ljava/lang/String;)Lext/mods/gameserver/model/residence/castle/Castle;
        44: astore        5
        46: goto          73
        49: iload         6
        51: iconst_2
        52: if_icmpne     73
        55: aload_3
        56: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        59: astore        4
        61: invokestatic  #22                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        64: aload_3
        65: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        68: invokevirtual #28                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastleByAlias:(Ljava/lang/String;)Lext/mods/gameserver/model/residence/castle/Castle;
        71: astore        5
        73: aload         5
        75: ifnonnull     83
        78: aload_2
        79: invokestatic  #32                 // Method showCastleSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
        82: return
        83: aload         4
        85: ifnonnull     95
        88: aload_2
        89: aload         5
        91: invokestatic  #38                 // Method showCastleSelectPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/castle/Castle;)V
        94: return
        95: aload_1
        96: ldc           #41                 // String admin_castle
        98: invokevirtual #43                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       101: ifeq          457
       104: aload         4
       106: astore        7
       108: iconst_m1
       109: istore        8
       111: aload         7
       113: invokevirtual #49                 // Method java/lang/String.hashCode:()I
       116: lookupswitch  { // 4

              -934610812: 176

                  113762: 160

                  114603: 208

               394850748: 192
                 default: 221
            }
       160: aload         7
       162: ldc           #52                 // String set
       164: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       167: ifeq          221
       170: iconst_0
       171: istore        8
       173: goto          221
       176: aload         7
       178: ldc           #58                 // String remove
       180: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       183: ifeq          221
       186: iconst_1
       187: istore        8
       189: goto          221
       192: aload         7
       194: ldc           #60                 // String certificates
       196: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       199: ifeq          221
       202: iconst_2
       203: istore        8
       205: goto          221
       208: aload         7
       210: ldc           #62                 // String tax
       212: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       215: ifeq          221
       218: iconst_3
       219: istore        8
       221: iload         8
       223: tableswitch   { // 0 to 3

                       0: 252

                       1: 375

                       2: 400

                       3: 426
                 default: 448
            }
       252: aload_0
       253: aload_2
       254: iconst_0
       255: invokevirtual #64                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       258: astore        9
       260: aload         9
       262: ifnull        273
       265: aload         9
       267: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       270: ifnonnull     283
       273: aload_2
       274: getstatic     #74                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       277: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       280: goto          454
       283: aload         9
       285: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       288: invokevirtual #84                 // Method ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
       291: ifeq          311
       294: aload_2
       295: aload         9
       297: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       300: invokedynamic #93,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       305: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       308: goto          454
       311: aload         5
       313: aload         9
       315: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       318: invokevirtual #101                // Method ext/mods/gameserver/model/residence/castle/Castle.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
       321: aload_2
       322: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       325: ifeq          336
       328: aload         5
       330: invokevirtual #110                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
       333: goto          341
       336: aload         5
       338: invokevirtual #114                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
       341: astore        10
       343: aload         5
       345: invokevirtual #117                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       348: aload         9
       350: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       353: invokevirtual #120                // Method ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
       356: if_icmpne     372
       359: aload         10
       361: aload_2
       362: invokedynamic #123,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       367: invokeinterface #127,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       372: goto          454
       375: aload         5
       377: invokevirtual #133                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       380: ifle          391
       383: aload         5
       385: invokevirtual #136                // Method ext/mods/gameserver/model/residence/castle/Castle.removeOwner:()V
       388: goto          454
       391: aload_2
       392: ldc           #139                // String This castle does not have an owner.
       394: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       397: goto          454
       400: aload         5
       402: sipush        300
       405: iconst_1
       406: invokevirtual #141                // Method ext/mods/gameserver/model/residence/castle/Castle.setLeftCertificates:(IZ)V
       409: aload_2
       410: aload         5
       412: invokevirtual #145                // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
       415: invokedynamic #146,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       420: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       423: goto          454
       426: aload         5
       428: invokevirtual #147                // Method ext/mods/gameserver/model/residence/castle/Castle.updateTaxes:()V
       431: aload_2
       432: aload         5
       434: invokevirtual #145                // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
       437: invokedynamic #150,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       442: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       445: goto          454
       448: aload_2
       449: ldc           #151                // String Usage: //castle [set|remove|certificates|tax castleName].
       451: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       454: goto          793
       457: aload_1
       458: ldc           #153                // String admin_siege
       460: invokevirtual #43                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       463: ifeq          793
       466: aload         4
       468: astore        7
       470: iconst_m1
       471: istore        8
       473: aload         7
       475: invokevirtual #49                 // Method java/lang/String.hashCode:()I
       478: lookupswitch  { // 6

             -1407259064: 536

             -1335637322: 568

                  100571: 584

                 3322014: 600

                94746189: 552

               109757538: 616
                 default: 629
            }
       536: aload         7
       538: ldc           #155                // String attack
       540: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       543: ifeq          629
       546: iconst_0
       547: istore        8
       549: goto          629
       552: aload         7
       554: ldc           #157                // String clear
       556: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       559: ifeq          629
       562: iconst_1
       563: istore        8
       565: goto          629
       568: aload         7
       570: ldc           #159                // String defend
       572: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       575: ifeq          629
       578: iconst_2
       579: istore        8
       581: goto          629
       584: aload         7
       586: ldc           #161                // String end
       588: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       591: ifeq          629
       594: iconst_3
       595: istore        8
       597: goto          629
       600: aload         7
       602: ldc           #163                // String list
       604: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       607: ifeq          629
       610: iconst_4
       611: istore        8
       613: goto          629
       616: aload         7
       618: ldc           #165                // String start
       620: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       623: ifeq          629
       626: iconst_5
       627: istore        8
       629: iload         8
       631: tableswitch   { // 0 to 5

                       0: 668

                       1: 704

                       2: 715

                       3: 751

                       4: 762

                       5: 776
                 default: 787
            }
       668: aload_0
       669: aload_2
       670: iconst_0
       671: invokevirtual #64                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       674: astore        9
       676: aload         9
       678: ifnonnull     691
       681: aload_2
       682: getstatic     #74                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       685: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       688: goto          793
       691: aload         5
       693: invokevirtual #167                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       696: aload         9
       698: invokevirtual #171                // Method ext/mods/gameserver/model/residence/castle/Siege.registerAttacker:(Lext/mods/gameserver/model/actor/Player;)V
       701: goto          793
       704: aload         5
       706: invokevirtual #167                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       709: invokevirtual #176                // Method ext/mods/gameserver/model/residence/castle/Siege.clearAllClans:()V
       712: goto          793
       715: aload_0
       716: aload_2
       717: iconst_0
       718: invokevirtual #64                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       721: astore        9
       723: aload         9
       725: ifnonnull     738
       728: aload_2
       729: getstatic     #74                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       732: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       735: goto          793
       738: aload         5
       740: invokevirtual #167                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       743: aload         9
       745: invokevirtual #179                // Method ext/mods/gameserver/model/residence/castle/Siege.registerDefender:(Lext/mods/gameserver/model/actor/Player;)V
       748: goto          793
       751: aload         5
       753: invokevirtual #167                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       756: invokevirtual #182                // Method ext/mods/gameserver/model/residence/castle/Siege.endSiege:()V
       759: goto          793
       762: aload_2
       763: new           #185                // class ext/mods/gameserver/network/serverpackets/SiegeInfo
       766: dup
       767: aload         5
       769: invokespecial #187                // Method ext/mods/gameserver/network/serverpackets/SiegeInfo."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
       772: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       775: return
       776: aload         5
       778: invokevirtual #167                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       781: invokevirtual #193                // Method ext/mods/gameserver/model/residence/castle/Siege.startSiege:()V
       784: goto          793
       787: aload_2
       788: ldc           #196                // String Usage: //siege [attack|clear|defend|end|list|start castleName].
       790: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       793: aload_2
       794: aload         5
       796: invokestatic  #38                 // Method showCastleSelectPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/residence/castle/Castle;)V
       799: return
      LineNumberTable:
        line 47: 0
        line 48: 11
        line 50: 16
        line 51: 19
        line 53: 22
        line 54: 28
        line 55: 34
        line 56: 49
        line 58: 55
        line 59: 61
        line 62: 73
        line 64: 78
        line 65: 82
        line 68: 83
        line 70: 88
        line 71: 94
        line 74: 95
        line 76: 104
        line 79: 252
        line 80: 260
        line 81: 273
        line 82: 283
        line 83: 294
        line 86: 311
        line 88: 321
        line 89: 343
        line 91: 359
        line 97: 372
        line 100: 375
        line 101: 383
        line 103: 391
        line 104: 397
        line 107: 400
        line 108: 409
        line 109: 423
        line 112: 426
        line 113: 431
        line 114: 445
        line 117: 448
        line 119: 454
        line 121: 457
        line 123: 466
        line 126: 668
        line 127: 676
        line 128: 681
        line 130: 691
        line 131: 701
        line 134: 704
        line 135: 712
        line 138: 715
        line 139: 723
        line 140: 728
        line 142: 738
        line 143: 748
        line 146: 751
        line 147: 759
        line 150: 762
        line 151: 775
        line 154: 776
        line 155: 784
        line 158: 787
        line 162: 793
        line 163: 799
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          343      29    10 skill   Ljava/util/Map;
          260     115     9 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          676      28     9 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          723      28     9 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     800     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSiege;
            0     800     1 command   Ljava/lang/String;
            0     800     2 player   Lext/mods/gameserver/model/actor/Player;
           11     789     3    st   Ljava/util/StringTokenizer;
           19     781     4 param   Ljava/lang/String;
           22     778     5 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           28     772     6 paramCount   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          343      29    10 skill   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 40
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSiege, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class ext/mods/gameserver/model/residence/castle/Castle, int ]
          stack = []
        frame_type = 23 /* same */
        frame_type = 9 /* same */
        frame_type = 11 /* same */
        frame_type = 253 /* append */
          offset_delta = 64
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 30 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 9 /* same */
        frame_type = 27 /* same */
        frame_type = 24 /* same */
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 15 /* same */
        frame_type = 8 /* same */
        frame_type = 25 /* same */
        frame_type = 21 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 78
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 38 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 10 /* same */
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #426                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 246: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSiege;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #44                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #41                 // String admin_castle
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #153                // String admin_siege
        13: aastore
        14: putstatic     #426                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 38: 0
}
SourceFile: "AdminSiege.java"
BootstrapMethods:
  0: #507 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #492 \u0001\'s clan already owns a castle.
  1: #513 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #494 (Ljava/lang/Object;Ljava/lang/Object;)V
      #496 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminSiege.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #499 (Ljava/lang/Integer;Ljava/lang/Integer;)V
  2: #507 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #501 \u0001\'s castle certificates are reset.
  3: #507 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #503 \u0001\'s taxes have been updated.
  4: #507 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #505 \">\u0001</a></td>
InnerClasses:
  public static final #525= #521 of #523; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
