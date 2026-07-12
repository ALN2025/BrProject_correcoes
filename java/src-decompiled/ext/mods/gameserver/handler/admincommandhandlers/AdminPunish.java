// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminPunish
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminPunish.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.class
  Last modified 9 de jul de 2026; size 11728 bytes
  MD5 checksum 67b187f4b5518414f1c5c5d295ddd874
  Compiled from "AdminPunish.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminPunish implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #45                         // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 5, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = Methodref          #7.#10        // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #10 = NameAndType        #5:#11        // "<init>":(Ljava/lang/String;)V
   #11 = Utf8               (Ljava/lang/String;)V
   #12 = Methodref          #7.#13        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #13 = NameAndType        #14:#15       // nextToken:()Ljava/lang/String;
   #14 = Utf8               nextToken
   #15 = Utf8               ()Ljava/lang/String;
   #16 = String             #17           // admin_ban
   #17 = Utf8               admin_ban
   #18 = Methodref          #19.#20       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #19 = Class              #21           // java/lang/String
   #20 = NameAndType        #22:#23       // startsWith:(Ljava/lang/String;)Z
   #21 = Utf8               java/lang/String
   #22 = Utf8               startsWith
   #23 = Utf8               (Ljava/lang/String;)Z
   #24 = Methodref          #7.#25        // java/util/StringTokenizer.hasMoreTokens:()Z
   #25 = NameAndType        #26:#27       // hasMoreTokens:()Z
   #26 = Utf8               hasMoreTokens
   #27 = Utf8               ()Z
   #28 = Methodref          #29.#30       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #29 = Class              #31           // ext/mods/gameserver/model/World
   #30 = NameAndType        #32:#33       // getInstance:()Lext/mods/gameserver/model/World;
   #31 = Utf8               ext/mods/gameserver/model/World
   #32 = Utf8               getInstance
   #33 = Utf8               ()Lext/mods/gameserver/model/World;
   #34 = Methodref          #29.#35       // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #35 = NameAndType        #36:#37       // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #36 = Utf8               getPlayer
   #37 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #38 = Methodref          #39.#40       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #39 = Class              #41           // java/lang/Integer
   #40 = NameAndType        #42:#43       // parseInt:(Ljava/lang/String;)I
   #41 = Utf8               java/lang/Integer
   #42 = Utf8               parseInt
   #43 = Utf8               (Ljava/lang/String;)I
   #44 = Methodref          #45.#46       // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #45 = Class              #47           // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish
   #46 = NameAndType        #48:#49       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #47 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminPunish
   #48 = Utf8               getTargetPlayer
   #49 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #50 = Fieldref           #51.#52       // ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
   #51 = Class              #53           // ext/mods/gameserver/network/SystemMessageId
   #52 = NameAndType        #54:#55       // CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
   #53 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #54 = Utf8               CANNOT_USE_ON_YOURSELF
   #55 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #57 = Class              #59           // ext/mods/gameserver/model/actor/Player
   #58 = NameAndType        #60:#61       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #59 = Utf8               ext/mods/gameserver/model/actor/Player
   #60 = Utf8               sendPacket
   #61 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #62 = Methodref          #19.#63       // java/lang/String.hashCode:()I
   #63 = NameAndType        #64:#65       // hashCode:()I
   #64 = Utf8               hashCode
   #65 = Utf8               ()I
   #66 = String             #67           // account
   #67 = Utf8               account
   #68 = Methodref          #19.#69       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #69 = NameAndType        #70:#71       // equals:(Ljava/lang/Object;)Z
   #70 = Utf8               equals
   #71 = Utf8               (Ljava/lang/Object;)Z
   #72 = String             #73           // chat
   #73 = Utf8               chat
   #74 = String             #75           // player
   #75 = Utf8               player
   #76 = Methodref          #77.#78       // ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
   #77 = Class              #79           // ext/mods/commons/lang/StringUtil
   #78 = NameAndType        #80:#81       // isEmpty:([Ljava/lang/String;)Z
   #79 = Utf8               ext/mods/commons/lang/StringUtil
   #80 = Utf8               isEmpty
   #81 = Utf8               ([Ljava/lang/String;)Z
   #82 = String             #83           // Usage: //ban account [name].
   #83 = Utf8               Usage: //ban account [name].
   #84 = Methodref          #57.#85       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #85 = NameAndType        #86:#11       // sendMessage:(Ljava/lang/String;)V
   #86 = Utf8               sendMessage
   #87 = Methodref          #88.#89       // ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
   #88 = Class              #90           // ext/mods/gameserver/LoginServerThread
   #89 = NameAndType        #32:#91       // getInstance:()Lext/mods/gameserver/LoginServerThread;
   #90 = Utf8               ext/mods/gameserver/LoginServerThread
   #91 = Utf8               ()Lext/mods/gameserver/LoginServerThread;
   #92 = Methodref          #88.#93       // ext/mods/gameserver/LoginServerThread.sendAccessLevel:(Ljava/lang/String;I)V
   #93 = NameAndType        #94:#95       // sendAccessLevel:(Ljava/lang/String;I)V
   #94 = Utf8               sendAccessLevel
   #95 = Utf8               (Ljava/lang/String;I)V
   #96 = InvokeDynamic      #0:#97        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #97 = NameAndType        #98:#99       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #98 = Utf8               makeConcatWithConstants
   #99 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #100 = Methodref          #57.#101      // ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
  #101 = NameAndType        #102:#103     // getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
  #102 = Utf8               getPunishment
  #103 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Punishment;
  #104 = Fieldref           #105.#106     // ext/mods/gameserver/enums/PunishmentType.ACC:Lext/mods/gameserver/enums/PunishmentType;
  #105 = Class              #107          // ext/mods/gameserver/enums/PunishmentType
  #106 = NameAndType        #108:#109     // ACC:Lext/mods/gameserver/enums/PunishmentType;
  #107 = Utf8               ext/mods/gameserver/enums/PunishmentType
  #108 = Utf8               ACC
  #109 = Utf8               Lext/mods/gameserver/enums/PunishmentType;
  #110 = Methodref          #111.#112     // ext/mods/gameserver/model/actor/container/player/Punishment.setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
  #111 = Class              #113          // ext/mods/gameserver/model/actor/container/player/Punishment
  #112 = NameAndType        #114:#115     // setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
  #113 = Utf8               ext/mods/gameserver/model/actor/container/player/Punishment
  #114 = Utf8               setType
  #115 = Utf8               (Lext/mods/gameserver/enums/PunishmentType;I)V
  #116 = Methodref          #57.#117      // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
  #117 = NameAndType        #118:#15      // getAccountName:()Ljava/lang/String;
  #118 = Utf8               getAccountName
  #119 = InvokeDynamic      #1:#97        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #120 = String             #121          // Usage: //ban chat [name duration].
  #121 = Utf8               Usage: //ban chat [name duration].
  #122 = Methodref          #45.#123      // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.banChatOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;IZ)V
  #123 = NameAndType        #124:#125     // banChatOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;IZ)V
  #124 = Utf8               banChatOfflinePlayer
  #125 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;IZ)V
  #126 = Methodref          #111.#127     // ext/mods/gameserver/model/actor/container/player/Punishment.getType:()Lext/mods/gameserver/enums/PunishmentType;
  #127 = NameAndType        #128:#129     // getType:()Lext/mods/gameserver/enums/PunishmentType;
  #128 = Utf8               getType
  #129 = Utf8               ()Lext/mods/gameserver/enums/PunishmentType;
  #130 = Fieldref           #105.#131     // ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
  #131 = NameAndType        #132:#109     // NONE:Lext/mods/gameserver/enums/PunishmentType;
  #132 = Utf8               NONE
  #133 = Methodref          #57.#134      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #134 = NameAndType        #135:#15      // getName:()Ljava/lang/String;
  #135 = Utf8               getName
  #136 = Methodref          #105.#137     // ext/mods/gameserver/enums/PunishmentType.getDescription:()Ljava/lang/String;
  #137 = NameAndType        #138:#15      // getDescription:()Ljava/lang/String;
  #138 = Utf8               getDescription
  #139 = InvokeDynamic      #2:#140       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #140 = NameAndType        #98:#141      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #141 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #142 = Fieldref           #105.#143     // ext/mods/gameserver/enums/PunishmentType.CHAT:Lext/mods/gameserver/enums/PunishmentType;
  #143 = NameAndType        #144:#109     // CHAT:Lext/mods/gameserver/enums/PunishmentType;
  #144 = Utf8               CHAT
  #145 = InvokeDynamic      #3:#146       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #146 = NameAndType        #98:#147      // makeConcatWithConstants:(I)Ljava/lang/String;
  #147 = Utf8               (I)Ljava/lang/String;
  #148 = String             #149          // .
  #149 = Utf8               .
  #150 = InvokeDynamic      #4:#140       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #151 = Methodref          #45.#152      // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.changeCharAccessLevel:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;I)V
  #152 = NameAndType        #153:#154     // changeCharAccessLevel:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;I)V
  #153 = Utf8               changeCharAccessLevel
  #154 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;I)V
  #155 = Class              #156          // java/lang/Exception
  #156 = Utf8               java/lang/Exception
  #157 = String             #158          // Usage : //ban account|chat|player [name [time]]
  #158 = Utf8               Usage : //ban account|chat|player [name [time]]
  #159 = String             #160          // admin_kick
  #160 = Utf8               admin_kick
  #161 = String             #162          // all
  #162 = Utf8               all
  #163 = Methodref          #29.#164      // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #164 = NameAndType        #165:#166     // getPlayers:()Ljava/util/Collection;
  #165 = Utf8               getPlayers
  #166 = Utf8               ()Ljava/util/Collection;
  #167 = InterfaceMethodref #168.#169     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #168 = Class              #170          // java/util/Collection
  #169 = NameAndType        #171:#172     // iterator:()Ljava/util/Iterator;
  #170 = Utf8               java/util/Collection
  #171 = Utf8               iterator
  #172 = Utf8               ()Ljava/util/Iterator;
  #173 = InterfaceMethodref #174.#175     // java/util/Iterator.hasNext:()Z
  #174 = Class              #176          // java/util/Iterator
  #175 = NameAndType        #177:#27      // hasNext:()Z
  #176 = Utf8               java/util/Iterator
  #177 = Utf8               hasNext
  #178 = InterfaceMethodref #174.#179     // java/util/Iterator.next:()Ljava/lang/Object;
  #179 = NameAndType        #180:#181     // next:()Ljava/lang/Object;
  #180 = Utf8               next
  #181 = Utf8               ()Ljava/lang/Object;
  #182 = Methodref          #57.#183      // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #183 = NameAndType        #184:#27      // isGM:()Z
  #184 = Utf8               isGM
  #185 = Methodref          #57.#186      // ext/mods/gameserver/model/actor/Player.logout:(Z)V
  #186 = NameAndType        #187:#188     // logout:(Z)V
  #187 = Utf8               logout
  #188 = Utf8               (Z)V
  #189 = Methodref          #45.#190      // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
  #190 = NameAndType        #48:#191      // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
  #191 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
  #192 = Fieldref           #51.#193      // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #193 = NameAndType        #194:#55      // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #194 = Utf8               INVALID_TARGET
  #195 = String             #196          // Usage : //kick [all|name]
  #196 = Utf8               Usage : //kick [all|name]
  #197 = String             #198          // admin_jail
  #198 = Utf8               admin_jail
  #199 = Methodref          #45.#200      // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.jailOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #200 = NameAndType        #201:#202     // jailOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #201 = Utf8               jailOfflinePlayer
  #202 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #203 = Fieldref           #105.#204     // ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #204 = NameAndType        #205:#109     // JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #205 = Utf8               JAIL
  #206 = InvokeDynamic      #5:#140       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #207 = String             #208          // admin_unban
  #208 = Utf8               admin_unban
  #209 = InvokeDynamic      #6:#97        // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #210 = InvokeDynamic      #7:#97        // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #211 = Methodref          #57.#212      // ext/mods/gameserver/model/actor/Player.isChatBanned:()Z
  #212 = NameAndType        #213:#27      // isChatBanned:()Z
  #213 = Utf8               isChatBanned
  #214 = InvokeDynamic      #8:#97        // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #215 = InvokeDynamic      #9:#97        // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #216 = InvokeDynamic      #10:#97       // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #217 = String             #218          // Usage : //unban account|chat|player name
  #218 = Utf8               Usage : //unban account|chat|player name
  #219 = String             #220          // admin_unjail
  #220 = Utf8               admin_unjail
  #221 = Methodref          #45.#222      // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.unjailOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #222 = NameAndType        #223:#224     // unjailOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #223 = Utf8               unjailOfflinePlayer
  #224 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #225 = InvokeDynamic      #11:#97       // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #226 = String             #227          // Usage : //unjail name
  #227 = Utf8               Usage : //unjail name
  #228 = Fieldref           #45.#229      // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.ADMIN_COMMANDS:[Ljava/lang/String;
  #229 = NameAndType        #230:#231     // ADMIN_COMMANDS:[Ljava/lang/String;
  #230 = Utf8               ADMIN_COMMANDS
  #231 = Utf8               [Ljava/lang/String;
  #232 = Long               60000l
  #234 = Methodref          #235.#236     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #235 = Class              #237          // ext/mods/commons/pool/ConnectionPool
  #236 = NameAndType        #238:#239     // getConnection:()Ljava/sql/Connection;
  #237 = Utf8               ext/mods/commons/pool/ConnectionPool
  #238 = Utf8               getConnection
  #239 = Utf8               ()Ljava/sql/Connection;
  #240 = String             #241          // UPDATE characters SET punish_level=?, punish_timer=? WHERE char_name=?
  #241 = Utf8               UPDATE characters SET punish_level=?, punish_timer=? WHERE char_name=?
  #242 = InterfaceMethodref #243.#244     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #243 = Class              #245          // java/sql/Connection
  #244 = NameAndType        #246:#247     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #245 = Utf8               java/sql/Connection
  #246 = Utf8               prepareStatement
  #247 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #248 = Methodref          #105.#249     // ext/mods/gameserver/enums/PunishmentType.ordinal:()I
  #249 = NameAndType        #250:#65      // ordinal:()I
  #250 = Utf8               ordinal
  #251 = InterfaceMethodref #252.#253     // java/sql/PreparedStatement.setInt:(II)V
  #252 = Class              #254          // java/sql/PreparedStatement
  #253 = NameAndType        #255:#256     // setInt:(II)V
  #254 = Utf8               java/sql/PreparedStatement
  #255 = Utf8               setInt
  #256 = Utf8               (II)V
  #257 = InterfaceMethodref #252.#258     // java/sql/PreparedStatement.setLong:(IJ)V
  #258 = NameAndType        #259:#260     // setLong:(IJ)V
  #259 = Utf8               setLong
  #260 = Utf8               (IJ)V
  #261 = InterfaceMethodref #252.#262     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #262 = NameAndType        #263:#264     // setString:(ILjava/lang/String;)V
  #263 = Utf8               setString
  #264 = Utf8               (ILjava/lang/String;)V
  #265 = InterfaceMethodref #252.#266     // java/sql/PreparedStatement.execute:()Z
  #266 = NameAndType        #267:#27      // execute:()Z
  #267 = Utf8               execute
  #268 = InterfaceMethodref #252.#269     // java/sql/PreparedStatement.getUpdateCount:()I
  #269 = NameAndType        #270:#65      // getUpdateCount:()I
  #270 = Utf8               getUpdateCount
  #271 = String             #272          // This Player isn\'t found.
  #272 = Utf8               This Player isn\'t found.
  #273 = InterfaceMethodref #252.#274     // java/sql/PreparedStatement.close:()V
  #274 = NameAndType        #275:#6       // close:()V
  #275 = Utf8               close
  #276 = Class              #277          // java/lang/Throwable
  #277 = Utf8               java/lang/Throwable
  #278 = Methodref          #276.#279     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #279 = NameAndType        #280:#281     // addSuppressed:(Ljava/lang/Throwable;)V
  #280 = Utf8               addSuppressed
  #281 = Utf8               (Ljava/lang/Throwable;)V
  #282 = InterfaceMethodref #243.#274     // java/sql/Connection.close:()V
  #283 = Fieldref           #45.#284      // ext/mods/gameserver/handler/admincommandhandlers/AdminPunish.LOGGER:Lext/mods/commons/logging/CLogger;
  #284 = NameAndType        #285:#286     // LOGGER:Lext/mods/commons/logging/CLogger;
  #285 = Utf8               LOGGER
  #286 = Utf8               Lext/mods/commons/logging/CLogger;
  #287 = String             #288          // Couldn\'t chatban offline Player.
  #288 = Utf8               Couldn\'t chatban offline Player.
  #289 = Methodref          #290.#291     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #290 = Class              #292          // ext/mods/commons/logging/CLogger
  #291 = NameAndType        #293:#294     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #292 = Utf8               ext/mods/commons/logging/CLogger
  #293 = Utf8               error
  #294 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #295 = String             #296          // UPDATE characters SET x=-114356, y=-249645, z=-2984, punish_level=?, punish_timer=? WHERE char_name=?
  #296 = Utf8               UPDATE characters SET x=-114356, y=-249645, z=-2984, punish_level=?, punish_timer=? WHERE char_name=?
  #297 = InvokeDynamic      #12:#140      // #12:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #298 = String             #299          // Couldn\'t jail offline Player.
  #299 = Utf8               Couldn\'t jail offline Player.
  #300 = String             #301          // UPDATE characters SET x=17836, y=170178, z=-3507, punish_level=0, punish_timer=0 WHERE char_name=?
  #301 = Utf8               UPDATE characters SET x=17836, y=170178, z=-3507, punish_level=0, punish_timer=0 WHERE char_name=?
  #302 = String             #303          // Couldn\'t unjail offline Player.
  #303 = Utf8               Couldn\'t unjail offline Player.
  #304 = Methodref          #57.#305      // ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
  #305 = NameAndType        #306:#307     // setAccessLevel:(I)V
  #306 = Utf8               setAccessLevel
  #307 = Utf8               (I)V
  #308 = InvokeDynamic      #13:#97       // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #309 = String             #310          // Usage: //unban player [name].
  #310 = Utf8               Usage: //unban player [name].
  #311 = String             #312          // Usage: //ban player [name].
  #312 = Utf8               Usage: //ban player [name].
  #313 = String             #314          // UPDATE characters SET accesslevel=? WHERE char_name=?
  #314 = Utf8               UPDATE characters SET accesslevel=? WHERE char_name=?
  #315 = String             #316          // This Player isn\'t found, or the AccessLevel was unaltered.
  #316 = Utf8               This Player isn\'t found, or the AccessLevel was unaltered.
  #317 = InvokeDynamic      #14:#318      // #14:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #318 = NameAndType        #98:#319      // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #319 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #320 = String             #321          // Couldn\'t change Player\'s AccessLevel.
  #321 = Utf8               Couldn\'t change Player\'s AccessLevel.
  #322 = Class              #323          // ext/mods/gameserver/handler/IAdminCommandHandler
  #323 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #324 = Utf8               UPDATE_BAN
  #325 = Utf8               Ljava/lang/String;
  #326 = Utf8               ConstantValue
  #327 = Utf8               UPDATE_JAIL
  #328 = Utf8               UPDATE_UNJAIL
  #329 = Utf8               UPDATE_ACCESS
  #330 = Utf8               Code
  #331 = Utf8               LineNumberTable
  #332 = Utf8               LocalVariableTable
  #333 = Utf8               this
  #334 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminPunish;
  #335 = Utf8               useAdminCommand
  #336 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #337 = Utf8               param
  #338 = Utf8               name
  #339 = Utf8               duration
  #340 = Utf8               I
  #341 = Utf8               targetPlayer
  #342 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #343 = Utf8               e
  #344 = Utf8               Ljava/lang/Exception;
  #345 = Utf8               worldPlayer
  #346 = Utf8               command
  #347 = Utf8               st
  #348 = Utf8               Ljava/util/StringTokenizer;
  #349 = Utf8               StackMapTable
  #350 = Utf8               getAdminCommandList
  #351 = Utf8               ()[Ljava/lang/String;
  #352 = Utf8               punishement
  #353 = Utf8               count
  #354 = Utf8               ps
  #355 = Utf8               Ljava/sql/PreparedStatement;
  #356 = Utf8               con
  #357 = Utf8               Ljava/sql/Connection;
  #358 = Utf8               playerName
  #359 = Utf8               delay
  #360 = Utf8               ban
  #361 = Utf8               Z
  #362 = Utf8               value
  #363 = Utf8               J
  #364 = Utf8               lvl
  #365 = Utf8               <clinit>
  #366 = Utf8               SourceFile
  #367 = Utf8               AdminPunish.java
  #368 = Utf8               BootstrapMethods
  #369 = String             #370          // Ban request sent for account \u0001.
  #370 = Utf8               Ban request sent for account \u0001.
  #371 = String             #372          // \u0001 account is banned.
  #372 = Utf8               \u0001 account is banned.
  #373 = String             #374          // \u0001 is already \u0001, and can\'t receive another punishment.
  #374 = Utf8               \u0001 is already \u0001, and can\'t receive another punishment.
  #375 = String             #376          //  for \u0001 minutes.
  #376 = Utf8                for \u0001 minutes.
  #377 = String             #378          // \u0001 is chat banned\u0001
  #378 = Utf8               \u0001 is chat banned\u0001
  #379 = String             #380          // \u0001 is jailed\u0001
  #380 = Utf8               \u0001 is jailed\u0001
  #381 = String             #382          // \u0001 account isn\'t actually banned.
  #382 = Utf8               \u0001 account isn\'t actually banned.
  #383 = String             #384          // Unban request sent for account \u0001.
  #384 = Utf8               Unban request sent for account \u0001.
  #385 = String             #386          // \u0001\'s chat ban has been lifted.
  #386 = Utf8               \u0001\'s chat ban has been lifted.
  #387 = String             #388          // \u0001 isn\'t currently chat banned.
  #388 = Utf8               \u0001 isn\'t currently chat banned.
  #389 = String             #390          // \u0001 player isn\'t actually banned.
  #390 = Utf8               \u0001 player isn\'t actually banned.
  #391 = String             #392          // \u0001 has been unjailed.
  #392 = Utf8               \u0001 has been unjailed.
  #393 = String             #394          // \u0001 has been jailed\u0001
  #394 = Utf8               \u0001 has been jailed\u0001
  #395 = String             #396          // \u0001 has been banned.
  #396 = Utf8               \u0001 has been banned.
  #397 = String             #398          // \u0001 now has an access level of \u0001.
  #398 = Utf8               \u0001 now has an access level of \u0001.
  #399 = MethodHandle       6:#400        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #400 = Methodref          #401.#402     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #401 = Class              #403          // java/lang/invoke/StringConcatFactory
  #402 = NameAndType        #98:#404      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #403 = Utf8               java/lang/invoke/StringConcatFactory
  #404 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #405 = Utf8               InnerClasses
  #406 = Class              #407          // java/lang/invoke/MethodHandles$Lookup
  #407 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #408 = Class              #409          // java/lang/invoke/MethodHandles
  #409 = Utf8               java/lang/invoke/MethodHandles
  #410 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminPunish();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPunish;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: invokespecial #9                  // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
         8: astore_3
         9: aload_3
        10: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        13: pop
        14: aload_1
        15: ldc           #16                 // String admin_ban
        17: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        20: ifeq          449
        23: aload_3
        24: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        27: astore        4
        29: aconst_null
        30: astore        5
        32: iconst_m1
        33: istore        6
        35: aconst_null
        36: astore        7
        38: aload_3
        39: invokevirtual #24                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        42: ifeq          80
        45: aload_3
        46: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        49: astore        5
        51: invokestatic  #28                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        54: aload         5
        56: invokevirtual #34                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
        59: astore        7
        61: aload_3
        62: invokevirtual #24                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        65: ifeq          88
        68: aload_3
        69: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        72: invokestatic  #38                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        75: istore        6
        77: goto          88
        80: aload_0
        81: aload_2
        82: iconst_0
        83: invokevirtual #44                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
        86: astore        7
        88: aload_2
        89: aload         7
        91: if_acmpne     102
        94: aload_2
        95: getstatic     #50                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
        98: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       101: return
       102: aload         4
       104: astore        8
       106: iconst_m1
       107: istore        9
       109: aload         8
       111: invokevirtual #62                 // Method java/lang/String.hashCode:()I
       114: lookupswitch  { // 3

             -1177318867: 148

              -985752863: 180

                 3052376: 164
                 default: 193
            }
       148: aload         8
       150: ldc           #66                 // String account
       152: invokevirtual #68                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       155: ifeq          193
       158: iconst_0
       159: istore        9
       161: goto          193
       164: aload         8
       166: ldc           #72                 // String chat
       168: invokevirtual #68                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       171: ifeq          193
       174: iconst_1
       175: istore        9
       177: goto          193
       180: aload         8
       182: ldc           #74                 // String player
       184: invokevirtual #68                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       187: ifeq          193
       190: iconst_2
       191: istore        9
       193: iload         9
       195: tableswitch   { // 0 to 2

                       0: 220

                       1: 300

                       2: 426
                 default: 435
            }
       220: aload         7
       222: ifnonnull     271
       225: iconst_1
       226: anewarray     #19                 // class java/lang/String
       229: dup
       230: iconst_0
       231: aload         5
       233: aastore
       234: invokestatic  #76                 // Method ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
       237: ifeq          247
       240: aload_2
       241: ldc           #82                 // String Usage: //ban account [name].
       243: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       246: return
       247: invokestatic  #87                 // Method ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
       250: aload         5
       252: bipush        -100
       254: invokevirtual #92                 // Method ext/mods/gameserver/LoginServerThread.sendAccessLevel:(Ljava/lang/String;I)V
       257: aload_2
       258: aload         5
       260: invokedynamic #96,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       265: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       268: goto          435
       271: aload         7
       273: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
       276: getstatic     #104                // Field ext/mods/gameserver/enums/PunishmentType.ACC:Lext/mods/gameserver/enums/PunishmentType;
       279: iconst_0
       280: invokevirtual #110                // Method ext/mods/gameserver/model/actor/container/player/Punishment.setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
       283: aload_2
       284: aload         7
       286: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
       289: invokedynamic #119,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       294: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       297: goto          435
       300: aload         7
       302: ifnonnull     339
       305: iconst_1
       306: anewarray     #19                 // class java/lang/String
       309: dup
       310: iconst_0
       311: aload         5
       313: aastore
       314: invokestatic  #76                 // Method ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
       317: ifeq          327
       320: aload_2
       321: ldc           #120                // String Usage: //ban chat [name duration].
       323: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       326: return
       327: aload_2
       328: aload         5
       330: iload         6
       332: iconst_1
       333: invokestatic  #122                // Method banChatOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;IZ)V
       336: goto          435
       339: aload         7
       341: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
       344: invokevirtual #126                // Method ext/mods/gameserver/model/actor/container/player/Punishment.getType:()Lext/mods/gameserver/enums/PunishmentType;
       347: getstatic     #130                // Field ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
       350: if_acmpeq     379
       353: aload_2
       354: aload         7
       356: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       359: aload         7
       361: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
       364: invokevirtual #126                // Method ext/mods/gameserver/model/actor/container/player/Punishment.getType:()Lext/mods/gameserver/enums/PunishmentType;
       367: invokevirtual #136                // Method ext/mods/gameserver/enums/PunishmentType.getDescription:()Ljava/lang/String;
       370: invokedynamic #139,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       375: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       378: return
       379: aload         7
       381: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
       384: getstatic     #142                // Field ext/mods/gameserver/enums/PunishmentType.CHAT:Lext/mods/gameserver/enums/PunishmentType;
       387: iload         6
       389: invokevirtual #110                // Method ext/mods/gameserver/model/actor/container/player/Punishment.setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
       392: aload_2
       393: aload         7
       395: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       398: iload         6
       400: ifle          413
       403: iload         6
       405: invokedynamic #145,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       410: goto          415
       413: ldc           #148                // String .
       415: invokedynamic #150,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       420: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       423: goto          435
       426: aload         7
       428: aload         5
       430: aload_2
       431: iconst_m1
       432: invokestatic  #151                // Method changeCharAccessLevel:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;I)V
       435: goto          1204
       438: astore        4
       440: aload_2
       441: ldc           #157                // String Usage : //ban account|chat|player [name [time]]
       443: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       446: goto          1204
       449: aload_1
       450: ldc           #159                // String admin_kick
       452: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       455: ifeq          629
       458: aload_3
       459: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       462: astore        4
       464: aload         4
       466: astore        5
       468: iconst_m1
       469: istore        6
       471: aload         5
       473: invokevirtual #62                 // Method java/lang/String.hashCode:()I
       476: lookupswitch  { // 1

                   96673: 496
                 default: 509
            }
       496: aload         5
       498: ldc           #161                // String all
       500: invokevirtual #68                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       503: ifeq          509
       506: iconst_0
       507: istore        6
       509: iload         6
       511: lookupswitch  { // 1

                       0: 528
                 default: 586
            }
       528: invokestatic  #28                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       531: invokevirtual #163                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
       534: invokeinterface #167,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       539: astore        7
       541: aload         7
       543: invokeinterface #173,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       548: ifeq          583
       551: aload         7
       553: invokeinterface #178,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       558: checkcast     #57                 // class ext/mods/gameserver/model/actor/Player
       561: astore        8
       563: aload         8
       565: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       568: ifeq          574
       571: goto          541
       574: aload         8
       576: iconst_0
       577: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       580: goto          541
       583: goto          615
       586: aload_0
       587: aload_2
       588: aload         4
       590: iconst_0
       591: invokevirtual #189                // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
       594: astore        7
       596: aload         7
       598: ifnonnull     609
       601: aload_2
       602: getstatic     #192                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       605: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       608: return
       609: aload         7
       611: iconst_0
       612: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       615: goto          1204
       618: astore        4
       620: aload_2
       621: ldc           #195                // String Usage : //kick [all|name]
       623: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       626: goto          1204
       629: aload_1
       630: ldc           #197                // String admin_jail
       632: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       635: ifeq          774
       638: aconst_null
       639: astore        4
       641: iconst_m1
       642: istore        5
       644: aconst_null
       645: astore        6
       647: aload_3
       648: invokevirtual #24                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       651: ifeq          689
       654: aload_3
       655: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       658: astore        4
       660: invokestatic  #28                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       663: aload         4
       665: invokevirtual #34                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       668: astore        6
       670: aload_3
       671: invokevirtual #24                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       674: ifeq          697
       677: aload_3
       678: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       681: invokestatic  #38                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       684: istore        5
       686: goto          697
       689: aload_0
       690: aload_2
       691: iconst_0
       692: invokevirtual #44                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       695: astore        6
       697: aload_2
       698: aload         6
       700: if_acmpne     711
       703: aload_2
       704: getstatic     #50                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
       707: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       710: return
       711: aload         6
       713: ifnonnull     727
       716: aload_2
       717: aload         4
       719: iload         5
       721: invokestatic  #199                // Method jailOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
       724: goto          771
       727: aload         6
       729: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
       732: getstatic     #203                // Field ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
       735: iload         5
       737: invokevirtual #110                // Method ext/mods/gameserver/model/actor/container/player/Punishment.setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
       740: aload_2
       741: aload         6
       743: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       746: iload         5
       748: ifle          761
       751: iload         5
       753: invokedynamic #145,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       758: goto          763
       761: ldc           #148                // String .
       763: invokedynamic #206,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       768: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       771: goto          1204
       774: aload_1
       775: ldc           #207                // String admin_unban
       777: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       780: ifeq          1107
       783: aload_3
       784: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       787: astore        4
       789: aconst_null
       790: astore        5
       792: aconst_null
       793: astore        6
       795: aload_3
       796: invokevirtual #24                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       799: ifeq          818
       802: aload_3
       803: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       806: astore        5
       808: invokestatic  #28                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       811: aload         5
       813: invokevirtual #34                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       816: astore        6
       818: aload_2
       819: aload         6
       821: if_acmpne     832
       824: aload_2
       825: getstatic     #50                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
       828: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       831: return
       832: aload         4
       834: astore        7
       836: iconst_m1
       837: istore        8
       839: aload         7
       841: invokevirtual #62                 // Method java/lang/String.hashCode:()I
       844: lookupswitch  { // 3

             -1177318867: 880

              -985752863: 912

                 3052376: 896
                 default: 925
            }
       880: aload         7
       882: ldc           #66                 // String account
       884: invokevirtual #68                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       887: ifeq          925
       890: iconst_0
       891: istore        8
       893: goto          925
       896: aload         7
       898: ldc           #72                 // String chat
       900: invokevirtual #68                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       903: ifeq          925
       906: iconst_1
       907: istore        8
       909: goto          925
       912: aload         7
       914: ldc           #74                 // String player
       916: invokevirtual #68                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       919: ifeq          925
       922: iconst_2
       923: istore        8
       925: iload         8
       927: tableswitch   { // 0 to 2

                       0: 952

                       1: 995

                       2: 1065
                 default: 1093
            }
       952: aload         6
       954: ifnull        972
       957: aload_2
       958: aload         6
       960: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       963: invokedynamic #209,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       968: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       971: return
       972: invokestatic  #87                 // Method ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
       975: aload         5
       977: iconst_0
       978: invokevirtual #92                 // Method ext/mods/gameserver/LoginServerThread.sendAccessLevel:(Ljava/lang/String;I)V
       981: aload_2
       982: aload         5
       984: invokedynamic #210,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       989: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       992: goto          1093
       995: aload         6
       997: ifnonnull     1011
      1000: aload_2
      1001: aload         5
      1003: iconst_0
      1004: iconst_0
      1005: invokestatic  #122                // Method banChatOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;IZ)V
      1008: goto          1093
      1011: aload         6
      1013: invokevirtual #211                // Method ext/mods/gameserver/model/actor/Player.isChatBanned:()Z
      1016: ifeq          1048
      1019: aload         6
      1021: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
      1024: getstatic     #130                // Field ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
      1027: iconst_0
      1028: invokevirtual #110                // Method ext/mods/gameserver/model/actor/container/player/Punishment.setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
      1031: aload_2
      1032: aload         6
      1034: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1037: invokedynamic #214,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1042: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1045: goto          1093
      1048: aload_2
      1049: aload         6
      1051: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1054: invokedynamic #215,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1059: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1062: goto          1093
      1065: aload         6
      1067: ifnull        1085
      1070: aload_2
      1071: aload         6
      1073: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1076: invokedynamic #216,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1081: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1084: return
      1085: aconst_null
      1086: aload         5
      1088: aload_2
      1089: iconst_0
      1090: invokestatic  #151                // Method changeCharAccessLevel:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;I)V
      1093: goto          1204
      1096: astore        4
      1098: aload_2
      1099: ldc           #217                // String Usage : //unban account|chat|player name
      1101: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1104: goto          1204
      1107: aload_1
      1108: ldc           #219                // String admin_unjail
      1110: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1113: ifeq          1204
      1116: aconst_null
      1117: astore        4
      1119: aload_3
      1120: invokevirtual #24                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1123: ifeq          1145
      1126: aload_3
      1127: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1130: astore        4
      1132: invokestatic  #28                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      1135: aload         4
      1137: invokevirtual #34                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
      1140: astore        5
      1142: goto          1153
      1145: aload_0
      1146: aload_2
      1147: iconst_0
      1148: invokevirtual #44                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
      1151: astore        5
      1153: aload         5
      1155: ifnonnull     1167
      1158: aload_2
      1159: aload         4
      1161: invokestatic  #221                // Method unjailOfflinePlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1164: goto          1193
      1167: aload         5
      1169: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
      1172: getstatic     #130                // Field ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
      1175: iconst_0
      1176: invokevirtual #110                // Method ext/mods/gameserver/model/actor/container/player/Punishment.setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
      1179: aload_2
      1180: aload         5
      1182: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1185: invokedynamic #225,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1190: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1193: goto          1204
      1196: astore        4
      1198: aload_2
      1199: ldc           #226                // String Usage : //unjail name
      1201: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1204: return
      Exception table:
         from    to  target type
            23   101   438   Class java/lang/Exception
           102   246   438   Class java/lang/Exception
           247   326   438   Class java/lang/Exception
           327   378   438   Class java/lang/Exception
           379   435   438   Class java/lang/Exception
           458   608   618   Class java/lang/Exception
           609   615   618   Class java/lang/Exception
           783   831  1096   Class java/lang/Exception
           832   971  1096   Class java/lang/Exception
           972  1084  1096   Class java/lang/Exception
          1085  1093  1096   Class java/lang/Exception
          1116  1193  1196   Class java/lang/Exception
      LineNumberTable:
        line 53: 0
        line 54: 9
        line 56: 14
        line 60: 23
        line 62: 29
        line 63: 32
        line 64: 35
        line 66: 38
        line 68: 45
        line 69: 51
        line 71: 61
        line 72: 68
        line 75: 80
        line 77: 88
        line 79: 94
        line 80: 101
        line 83: 102
        line 86: 220
        line 88: 225
        line 90: 240
        line 91: 246
        line 94: 247
        line 95: 257
        line 99: 271
        line 100: 283
        line 102: 297
        line 105: 300
        line 107: 305
        line 109: 320
        line 110: 326
        line 113: 327
        line 117: 339
        line 119: 353
        line 120: 378
        line 123: 379
        line 125: 392
        line 127: 423
        line 130: 426
        line 137: 435
        line 134: 438
        line 136: 440
        line 137: 446
        line 139: 449
        line 143: 458
        line 144: 464
        line 147: 528
        line 149: 563
        line 150: 571
        line 152: 574
        line 153: 580
        line 154: 583
        line 157: 586
        line 158: 596
        line 160: 601
        line 161: 608
        line 163: 609
        line 170: 615
        line 167: 618
        line 169: 620
        line 170: 626
        line 172: 629
        line 174: 638
        line 175: 641
        line 176: 644
        line 178: 647
        line 180: 654
        line 181: 660
        line 183: 670
        line 184: 677
        line 187: 689
        line 189: 697
        line 191: 703
        line 192: 710
        line 195: 711
        line 196: 716
        line 199: 727
        line 200: 740
        line 202: 771
        line 203: 774
        line 207: 783
        line 209: 789
        line 210: 792
        line 212: 795
        line 214: 802
        line 215: 808
        line 218: 818
        line 220: 824
        line 221: 831
        line 224: 832
        line 227: 952
        line 229: 957
        line 230: 971
        line 233: 972
        line 234: 981
        line 235: 992
        line 238: 995
        line 239: 1000
        line 242: 1011
        line 244: 1019
        line 245: 1031
        line 248: 1048
        line 250: 1062
        line 253: 1065
        line 255: 1070
        line 256: 1084
        line 259: 1085
        line 266: 1093
        line 263: 1096
        line 265: 1098
        line 266: 1104
        line 268: 1107
        line 272: 1116
        line 275: 1119
        line 277: 1126
        line 278: 1132
        line 281: 1145
        line 283: 1153
        line 284: 1158
        line 287: 1167
        line 288: 1179
        line 294: 1193
        line 291: 1196
        line 293: 1198
        line 296: 1204
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29     406     4 param   Ljava/lang/String;
           32     403     5  name   Ljava/lang/String;
           35     400     6 duration   I
           38     397     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          440       6     4     e   Ljava/lang/Exception;
          563      17     8 worldPlayer   Lext/mods/gameserver/model/actor/Player;
          596      19     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          464     151     4 param   Ljava/lang/String;
          620       6     4     e   Ljava/lang/Exception;
          641     130     4  name   Ljava/lang/String;
          644     127     5 duration   I
          647     124     6 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          789     304     4 param   Ljava/lang/String;
          792     301     5  name   Ljava/lang/String;
          795     298     6 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1098       6     4     e   Ljava/lang/Exception;
         1142       3     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1119      74     4  name   Ljava/lang/String;
         1153      40     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1198       6     4     e   Ljava/lang/Exception;
            0    1205     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPunish;
            0    1205     1 command   Ljava/lang/String;
            0    1205     2 player   Lext/mods/gameserver/model/actor/Player;
            9    1196     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 61
        frame_type = 255 /* full_frame */
          offset_delta = 80
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPunish, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 7 /* same */
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 26 /* same */
        frame_type = 23 /* same */
        frame_type = 28 /* same */
        frame_type = 26 /* same */
        frame_type = 11 /* same */
        frame_type = 39 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPunish, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPunish, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPunish, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 254 /* append */
          offset_delta = 46
          locals = [ class java/lang/String, class java/lang/String, int ]
        frame_type = 12 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPunish, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ class java/lang/String, int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 13 /* same */
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPunish, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPunish, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
        frame_type = 248 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 43
          locals = [ class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 19 /* same */
        frame_type = 22 /* same */
        frame_type = 15 /* same */
        frame_type = 36 /* same */
        frame_type = 16 /* same */
        frame_type = 19 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPunish, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #228                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 301: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPunish;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_5
         1: anewarray     #19                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #16                 // String admin_ban
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #197                // String admin_jail
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #159                // String admin_kick
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #207                // String admin_unban
        23: aastore
        24: dup
        25: iconst_4
        26: ldc           #219                // String admin_unjail
        28: aastore
        29: putstatic     #228                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        32: return
      LineNumberTable:
        line 41: 0
}
SourceFile: "AdminPunish.java"
BootstrapMethods:
  0: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #369 Ban request sent for account \u0001.
  1: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #371 \u0001 account is banned.
  2: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #373 \u0001 is already \u0001, and can\'t receive another punishment.
  3: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #375  for \u0001 minutes.
  4: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #377 \u0001 is chat banned\u0001
  5: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #379 \u0001 is jailed\u0001
  6: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #381 \u0001 account isn\'t actually banned.
  7: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #383 Unban request sent for account \u0001.
  8: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #385 \u0001\'s chat ban has been lifted.
  9: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #387 \u0001 isn\'t currently chat banned.
  10: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #389 \u0001 player isn\'t actually banned.
  11: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #391 \u0001 has been unjailed.
  12: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #393 \u0001 has been jailed\u0001
  13: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #395 \u0001 has been banned.
  14: #399 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #397 \u0001 now has an access level of \u0001.
InnerClasses:
  public static final #410= #406 of #408; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
