// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminCursedWeapon
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminCursedWeapon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon.class
  Last modified 9 de jul de 2026; size 6881 bytes
  MD5 checksum c8ef4a27dfdc8192126aa05a6cced27c
  Compiled from "AdminCursedWeapon.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminCursedWeapon implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #21                         // ext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
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
   #16 = Methodref          #7.#17        // java/util/StringTokenizer.hasMoreTokens:()Z
   #17 = NameAndType        #18:#19       // hasMoreTokens:()Z
   #18 = Utf8               hasMoreTokens
   #19 = Utf8               ()Z
   #20 = Methodref          #21.#22       // ext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon.showCursedWeaponSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
   #21 = Class              #23           // ext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon
   #22 = NameAndType        #24:#25       // showCursedWeaponSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
   #23 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon
   #24 = Utf8               showCursedWeaponSelectPage
   #25 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #26 = Methodref          #27.#28       // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #27 = Class              #29           // ext/mods/commons/lang/StringUtil
   #28 = NameAndType        #30:#31       // isDigit:(Ljava/lang/String;)Z
   #29 = Utf8               ext/mods/commons/lang/StringUtil
   #30 = Utf8               isDigit
   #31 = Utf8               (Ljava/lang/String;)Z
   #32 = Methodref          #33.#34       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #33 = Class              #35           // java/lang/Integer
   #34 = NameAndType        #36:#37       // parseInt:(Ljava/lang/String;)I
   #35 = Utf8               java/lang/Integer
   #36 = Utf8               parseInt
   #37 = Utf8               (Ljava/lang/String;)I
   #38 = Methodref          #39.#40       // java/lang/String.replace:(CC)Ljava/lang/String;
   #39 = Class              #41           // java/lang/String
   #40 = NameAndType        #42:#43       // replace:(CC)Ljava/lang/String;
   #41 = Utf8               java/lang/String
   #42 = Utf8               replace
   #43 = Utf8               (CC)Ljava/lang/String;
   #44 = Methodref          #45.#46       // ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #45 = Class              #47           // ext/mods/gameserver/data/manager/CursedWeaponManager
   #46 = NameAndType        #48:#49       // getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #47 = Utf8               ext/mods/gameserver/data/manager/CursedWeaponManager
   #48 = Utf8               getInstance
   #49 = Utf8               ()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #50 = Methodref          #45.#51       // ext/mods/gameserver/data/manager/CursedWeaponManager.getCursedWeapons:()Ljava/util/Collection;
   #51 = NameAndType        #52:#53       // getCursedWeapons:()Ljava/util/Collection;
   #52 = Utf8               getCursedWeapons
   #53 = Utf8               ()Ljava/util/Collection;
   #54 = InterfaceMethodref #55.#56       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #55 = Class              #57           // java/util/Collection
   #56 = NameAndType        #58:#59       // iterator:()Ljava/util/Iterator;
   #57 = Utf8               java/util/Collection
   #58 = Utf8               iterator
   #59 = Utf8               ()Ljava/util/Iterator;
   #60 = InterfaceMethodref #61.#62       // java/util/Iterator.hasNext:()Z
   #61 = Class              #63           // java/util/Iterator
   #62 = NameAndType        #64:#19       // hasNext:()Z
   #63 = Utf8               java/util/Iterator
   #64 = Utf8               hasNext
   #65 = InterfaceMethodref #61.#66       // java/util/Iterator.next:()Ljava/lang/Object;
   #66 = NameAndType        #67:#68       // next:()Ljava/lang/Object;
   #67 = Utf8               next
   #68 = Utf8               ()Ljava/lang/Object;
   #69 = Class              #70           // ext/mods/gameserver/model/entity/CursedWeapon
   #70 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon
   #71 = Methodref          #69.#72       // ext/mods/gameserver/model/entity/CursedWeapon.getName:()Ljava/lang/String;
   #72 = NameAndType        #73:#15       // getName:()Ljava/lang/String;
   #73 = Utf8               getName
   #74 = Methodref          #39.#75       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #75 = NameAndType        #76:#15       // toLowerCase:()Ljava/lang/String;
   #76 = Utf8               toLowerCase
   #77 = Methodref          #39.#78       // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #78 = NameAndType        #79:#80       // contains:(Ljava/lang/CharSequence;)Z
   #79 = Utf8               contains
   #80 = Utf8               (Ljava/lang/CharSequence;)Z
   #81 = Methodref          #69.#82       // ext/mods/gameserver/model/entity/CursedWeapon.getItemId:()I
   #82 = NameAndType        #83:#84       // getItemId:()I
   #83 = Utf8               getItemId
   #84 = Utf8               ()I
   #85 = Methodref          #45.#86       // ext/mods/gameserver/data/manager/CursedWeaponManager.getCursedWeapon:(I)Lext/mods/gameserver/model/entity/CursedWeapon;
   #86 = NameAndType        #87:#88       // getCursedWeapon:(I)Lext/mods/gameserver/model/entity/CursedWeapon;
   #87 = Utf8               getCursedWeapon
   #88 = Utf8               (I)Lext/mods/gameserver/model/entity/CursedWeapon;
   #89 = String             #90           // Unknown cursed weapon ID.
   #90 = Utf8               Unknown cursed weapon ID.
   #91 = Methodref          #92.#93       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #92 = Class              #94           // ext/mods/gameserver/model/actor/Player
   #93 = NameAndType        #95:#11       // sendMessage:(Ljava/lang/String;)V
   #94 = Utf8               ext/mods/gameserver/model/actor/Player
   #95 = Utf8               sendMessage
   #96 = Methodref          #39.#97       // java/lang/String.hashCode:()I
   #97 = NameAndType        #98:#84       // hashCode:()I
   #98 = Utf8               hashCode
   #99 = String             #100          // set
  #100 = Utf8               set
  #101 = Methodref          #39.#102      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #102 = NameAndType        #103:#104     // equals:(Ljava/lang/Object;)Z
  #103 = Utf8               equals
  #104 = Utf8               (Ljava/lang/Object;)Z
  #105 = String             #106          // remove
  #106 = Utf8               remove
  #107 = String             #108          // teleportto
  #108 = Utf8               teleportto
  #109 = Methodref          #69.#110      // ext/mods/gameserver/model/entity/CursedWeapon.isActive:()Z
  #110 = NameAndType        #111:#19      // isActive:()Z
  #111 = Utf8               isActive
  #112 = String             #113          // This cursed weapon is already active.
  #113 = Utf8               This cursed weapon is already active.
  #114 = Methodref          #21.#115      // ext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #115 = NameAndType        #116:#117     // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #116 = Utf8               getTargetPlayer
  #117 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #118 = Methodref          #92.#119      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #119 = NameAndType        #120:#121     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #120 = Utf8               addItem
  #121 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #122 = Methodref          #69.#123      // ext/mods/gameserver/model/entity/CursedWeapon.reActivate:(Z)V
  #123 = NameAndType        #124:#125     // reActivate:(Z)V
  #124 = Utf8               reActivate
  #125 = Utf8               (Z)V
  #126 = Methodref          #69.#127      // ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
  #127 = NameAndType        #128:#6       // endOfLife:()V
  #128 = Utf8               endOfLife
  #129 = Methodref          #69.#130      // ext/mods/gameserver/model/entity/CursedWeapon.teleportTo:(Lext/mods/gameserver/model/actor/Player;)V
  #130 = NameAndType        #131:#25      // teleportTo:(Lext/mods/gameserver/model/actor/Player;)V
  #131 = Utf8               teleportTo
  #132 = Class              #133          // java/lang/Exception
  #133 = Utf8               java/lang/Exception
  #134 = String             #135          // Usage: //cw [set|remove|teleportto itemid|name]
  #135 = Utf8               Usage: //cw [set|remove|teleportto itemid|name]
  #136 = Class              #137          // java/lang/StringBuilder
  #137 = Utf8               java/lang/StringBuilder
  #138 = Methodref          #136.#139     // java/lang/StringBuilder."<init>":(I)V
  #139 = NameAndType        #5:#140       // "<init>":(I)V
  #140 = Utf8               (I)V
  #141 = String             #142          // <table width=280><tr><td>Name:</td><td>
  #142 = Utf8               <table width=280><tr><td>Name:</td><td>
  #143 = String             #144          // </td></tr>
  #144 = Utf8               </td></tr>
  #145 = Methodref          #27.#146      // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #146 = NameAndType        #147:#148     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #147 = Utf8               append
  #148 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #149 = Methodref          #69.#150      // ext/mods/gameserver/model/entity/CursedWeapon.getTimeLeft:()J
  #150 = NameAndType        #151:#152     // getTimeLeft:()J
  #151 = Utf8               getTimeLeft
  #152 = Utf8               ()J
  #153 = Long               1000l
  #155 = Long               60l
  #157 = Double             1000.0d
  #159 = Double             60.0d
  #161 = Methodref          #162.#163     // java/lang/Math.floor:(D)D
  #162 = Class              #164          // java/lang/Math
  #163 = NameAndType        #165:#166     // floor:(D)D
  #164 = Utf8               java/lang/Math
  #165 = Utf8               floor
  #166 = Utf8               (D)D
  #167 = Double             24.0d
  #169 = Methodref          #69.#170      // ext/mods/gameserver/model/entity/CursedWeapon.isActivated:()Z
  #170 = NameAndType        #171:#19      // isActivated:()Z
  #171 = Utf8               isActivated
  #172 = Methodref          #69.#173      // ext/mods/gameserver/model/entity/CursedWeapon.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #173 = NameAndType        #174:#175     // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #174 = Utf8               getPlayer
  #175 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #176 = String             #177          // <tr><td>Owner:</td><td>
  #177 = Utf8               <tr><td>Owner:</td><td>
  #178 = String             #179          // null
  #179 = Utf8               null
  #180 = Methodref          #92.#72       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #181 = String             #182          // </td></tr><tr><td>Stored values:</td><td>Karma=
  #182 = Utf8               </td></tr><tr><td>Stored values:</td><td>Karma=
  #183 = Methodref          #69.#184      // ext/mods/gameserver/model/entity/CursedWeapon.getPlayerKarma:()I
  #184 = NameAndType        #185:#84      // getPlayerKarma:()I
  #185 = Utf8               getPlayerKarma
  #186 = Methodref          #33.#187      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #187 = NameAndType        #188:#189     // valueOf:(I)Ljava/lang/Integer;
  #188 = Utf8               valueOf
  #189 = Utf8               (I)Ljava/lang/Integer;
  #190 = String             #191          //  PKs=
  #191 = Utf8                PKs=
  #192 = Methodref          #69.#193      // ext/mods/gameserver/model/entity/CursedWeapon.getPlayerPkKills:()I
  #193 = NameAndType        #194:#84      // getPlayerPkKills:()I
  #194 = Utf8               getPlayerPkKills
  #195 = String             #196          // </td></tr><tr><td>Current stage:</td><td>
  #196 = Utf8               </td></tr><tr><td>Current stage:</td><td>
  #197 = Methodref          #69.#198      // ext/mods/gameserver/model/entity/CursedWeapon.getCurrentStage:()I
  #198 = NameAndType        #199:#84      // getCurrentStage:()I
  #199 = Utf8               getCurrentStage
  #200 = String             #201          // </td></tr><tr><td>Overall time:</td><td>
  #201 = Utf8               </td></tr><tr><td>Overall time:</td><td>
  #202 = String             #203          // d.
  #203 = Utf8               d.
  #204 = String             #205          // h.
  #205 = Utf8               h.
  #206 = String             #207          // m.</td></tr><tr><td>Hungry time:</td><td>
  #207 = Utf8               m.</td></tr><tr><td>Hungry time:</td><td>
  #208 = Methodref          #69.#209      // ext/mods/gameserver/model/entity/CursedWeapon.getHungryTime:()I
  #209 = NameAndType        #210:#84      // getHungryTime:()I
  #210 = Utf8               getHungryTime
  #211 = String             #212          // m.</td></tr><tr><td>Current kills:</td><td>
  #212 = Utf8               m.</td></tr><tr><td>Current kills:</td><td>
  #213 = Methodref          #69.#214      // ext/mods/gameserver/model/entity/CursedWeapon.getNbKills:()I
  #214 = NameAndType        #215:#84      // getNbKills:()I
  #215 = Utf8               getNbKills
  #216 = String             #217          //  /
  #217 = Utf8                /
  #218 = Methodref          #69.#219      // ext/mods/gameserver/model/entity/CursedWeapon.getNumberBeforeNextStage:()I
  #219 = NameAndType        #220:#84      // getNumberBeforeNextStage:()I
  #220 = Utf8               getNumberBeforeNextStage
  #221 = String             #222          // </td></tr><tr><td><button value=\"Remove CW\" action=\"bypass -h admin_cw remove
  #222 = Utf8               </td></tr><tr><td><button value=\"Remove CW\" action=\"bypass -h admin_cw remove
  #223 = String             #224          // \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td><td><button value=\"Teleport To\" action=\"bypass -h admin_cw teleportto
  #224 = Utf8               \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td><td><button value=\"Teleport To\" action=\"bypass -h admin_cw teleportto
  #225 = String             #226          // \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td></tr>
  #226 = Utf8               \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td></tr>
  #227 = Methodref          #69.#228      // ext/mods/gameserver/model/entity/CursedWeapon.isDropped:()Z
  #228 = NameAndType        #229:#19      // isDropped:()Z
  #229 = Utf8               isDropped
  #230 = String             #231          // <tr><td>Position:</td><td>Lying on the ground</td></tr><tr><td>Overall time:</td><td>
  #231 = Utf8               <tr><td>Position:</td><td>Lying on the ground</td></tr><tr><td>Overall time:</td><td>
  #232 = String             #233          // m.</td></tr><tr><td><button value=\"Remove\" action=\"bypass -h admin_cw remove
  #233 = Utf8               m.</td></tr><tr><td><button value=\"Remove\" action=\"bypass -h admin_cw remove
  #234 = String             #235          // \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td><td><button value=\"Go\" action=\"bypass -h admin_cw teleportto
  #235 = Utf8               \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td><td><button value=\"Go\" action=\"bypass -h admin_cw teleportto
  #236 = String             #237          // <tr><td>Position:</td><td>Doesn\'t exist.</td></tr><tr><td><button value=\"Set CW\" action=\"bypass -h admin_cw set
  #237 = Utf8               <tr><td>Position:</td><td>Doesn\'t exist.</td></tr><tr><td><button value=\"Set CW\" action=\"bypass -h admin_cw set
  #238 = String             #239          // \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td><td></td></tr>
  #239 = Utf8               \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td><td></td></tr>
  #240 = String             #241          // </table>
  #241 = Utf8               </table>
  #242 = Methodref          #136.#243     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #243 = NameAndType        #147:#244     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #244 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #245 = Class              #246          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #246 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #247 = Methodref          #245.#139     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #248 = Methodref          #92.#249      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #249 = NameAndType        #250:#251     // getLocale:()Ljava/util/Locale;
  #250 = Utf8               getLocale
  #251 = Utf8               ()Ljava/util/Locale;
  #252 = String             #253          // html/admin/cwinfo.htm
  #253 = Utf8               html/admin/cwinfo.htm
  #254 = Methodref          #245.#255     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #255 = NameAndType        #256:#257     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #256 = Utf8               setFile
  #257 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #258 = String             #259          // %cwinfo%
  #259 = Utf8               %cwinfo%
  #260 = Methodref          #136.#261     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #261 = NameAndType        #262:#15      // toString:()Ljava/lang/String;
  #262 = Utf8               toString
  #263 = Methodref          #245.#264     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #264 = NameAndType        #42:#265      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #265 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #266 = Methodref          #92.#267      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #267 = NameAndType        #268:#269     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #268 = Utf8               sendPacket
  #269 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #270 = Fieldref           #21.#271      // ext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon.ADMIN_COMMANDS:[Ljava/lang/String;
  #271 = NameAndType        #272:#273     // ADMIN_COMMANDS:[Ljava/lang/String;
  #272 = Utf8               ADMIN_COMMANDS
  #273 = Utf8               [Ljava/lang/String;
  #274 = String             #275          // admin_cw
  #275 = Utf8               admin_cw
  #276 = Class              #277          // ext/mods/gameserver/handler/IAdminCommandHandler
  #277 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #278 = Utf8               Code
  #279 = Utf8               LineNumberTable
  #280 = Utf8               LocalVariableTable
  #281 = Utf8               this
  #282 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon;
  #283 = Utf8               useAdminCommand
  #284 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #285 = Utf8               cwp
  #286 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon;
  #287 = Utf8               targetPlayer
  #288 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #289 = Utf8               type
  #290 = Utf8               Ljava/lang/String;
  #291 = Utf8               id
  #292 = Utf8               I
  #293 = Utf8               parameter
  #294 = Utf8               cw
  #295 = Utf8               e
  #296 = Utf8               Ljava/lang/Exception;
  #297 = Utf8               command
  #298 = Utf8               player
  #299 = Utf8               st
  #300 = Utf8               Ljava/util/StringTokenizer;
  #301 = Utf8               StackMapTable
  #302 = Utf8               cursedPlayer
  #303 = Utf8               milliToStart
  #304 = Utf8               J
  #305 = Utf8               numSecs
  #306 = Utf8               D
  #307 = Utf8               countDown
  #308 = Utf8               numMins
  #309 = Utf8               numHours
  #310 = Utf8               numDays
  #311 = Utf8               cursedWeapon
  #312 = Utf8               sb
  #313 = Utf8               Ljava/lang/StringBuilder;
  #314 = Utf8               html
  #315 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #316 = Class              #317          // "[Ljava/lang/Object;"
  #317 = Utf8               [Ljava/lang/Object;
  #318 = Utf8               getAdminCommandList
  #319 = Utf8               ()[Ljava/lang/String;
  #320 = Utf8               <clinit>
  #321 = Utf8               SourceFile
  #322 = Utf8               AdminCursedWeapon.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminCursedWeapon();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: invokespecial #9                  // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
         8: astore_3
         9: aload_3
        10: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        13: pop
        14: aload_3
        15: invokevirtual #16                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        18: ifne          26
        21: aload_2
        22: invokestatic  #20                 // Method showCursedWeaponSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
        25: return
        26: aload_3
        27: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        30: astore        4
        32: iconst_0
        33: istore        5
        35: aload_3
        36: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        39: astore        6
        41: aload         6
        43: invokestatic  #26                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
        46: ifeq          59
        49: aload         6
        51: invokestatic  #32                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        54: istore        5
        56: goto          137
        59: aload         6
        61: bipush        95
        63: bipush        32
        65: invokevirtual #38                 // Method java/lang/String.replace:(CC)Ljava/lang/String;
        68: astore        6
        70: invokestatic  #44                 // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
        73: invokevirtual #50                 // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getCursedWeapons:()Ljava/util/Collection;
        76: invokeinterface #54,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        81: astore        7
        83: aload         7
        85: invokeinterface #60,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        90: ifeq          137
        93: aload         7
        95: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       100: checkcast     #69                 // class ext/mods/gameserver/model/entity/CursedWeapon
       103: astore        8
       105: aload         8
       107: invokevirtual #71                 // Method ext/mods/gameserver/model/entity/CursedWeapon.getName:()Ljava/lang/String;
       110: invokevirtual #74                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       113: aload         6
       115: invokevirtual #74                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       118: invokevirtual #77                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       121: ifeq          134
       124: aload         8
       126: invokevirtual #81                 // Method ext/mods/gameserver/model/entity/CursedWeapon.getItemId:()I
       129: istore        5
       131: goto          137
       134: goto          83
       137: invokestatic  #44                 // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
       140: iload         5
       142: invokevirtual #85                 // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getCursedWeapon:(I)Lext/mods/gameserver/model/entity/CursedWeapon;
       145: astore        7
       147: aload         7
       149: ifnonnull     159
       152: aload_2
       153: ldc           #89                 // String Unknown cursed weapon ID.
       155: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       158: return
       159: aload         4
       161: astore        8
       163: iconst_m1
       164: istore        9
       166: aload         8
       168: invokevirtual #96                 // Method java/lang/String.hashCode:()I
       171: lookupswitch  { // 3

             -1484003610: 236

              -934610812: 220

                  113762: 204
                 default: 249
            }
       204: aload         8
       206: ldc           #99                 // String set
       208: invokevirtual #101                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       211: ifeq          249
       214: iconst_0
       215: istore        9
       217: goto          249
       220: aload         8
       222: ldc           #105                // String remove
       224: invokevirtual #101                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       227: ifeq          249
       230: iconst_1
       231: istore        9
       233: goto          249
       236: aload         8
       238: ldc           #107                // String teleportto
       240: invokevirtual #101                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       243: ifeq          249
       246: iconst_2
       247: istore        9
       249: iload         9
       251: tableswitch   { // 0 to 2

                       0: 276

                       1: 320

                       2: 328
                 default: 334
            }
       276: aload         7
       278: invokevirtual #109                // Method ext/mods/gameserver/model/entity/CursedWeapon.isActive:()Z
       281: ifeq          293
       284: aload_2
       285: ldc           #112                // String This cursed weapon is already active.
       287: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       290: goto          334
       293: aload_0
       294: aload_2
       295: iconst_1
       296: invokevirtual #114                // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       299: astore        10
       301: aload         10
       303: iload         5
       305: iconst_1
       306: iconst_1
       307: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       310: pop
       311: aload         7
       313: iconst_1
       314: invokevirtual #122                // Method ext/mods/gameserver/model/entity/CursedWeapon.reActivate:(Z)V
       317: goto          334
       320: aload         7
       322: invokevirtual #126                // Method ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
       325: goto          334
       328: aload         7
       330: aload_2
       331: invokevirtual #129                // Method ext/mods/gameserver/model/entity/CursedWeapon.teleportTo:(Lext/mods/gameserver/model/actor/Player;)V
       334: aload_2
       335: invokestatic  #20                 // Method showCursedWeaponSelectPage:(Lext/mods/gameserver/model/actor/Player;)V
       338: goto          349
       341: astore        4
       343: aload_2
       344: ldc           #134                // String Usage: //cw [set|remove|teleportto itemid|name]
       346: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       349: return
      Exception table:
         from    to  target type
            26   158   341   Class java/lang/Exception
           159   338   341   Class java/lang/Exception
      LineNumberTable:
        line 40: 0
        line 41: 9
        line 43: 14
        line 45: 21
        line 46: 25
        line 51: 26
        line 53: 32
        line 55: 35
        line 56: 41
        line 57: 49
        line 60: 59
        line 61: 70
        line 63: 105
        line 65: 124
        line 66: 131
        line 68: 134
        line 71: 137
        line 72: 147
        line 74: 152
        line 75: 158
        line 78: 159
        line 81: 276
        line 82: 284
        line 85: 293
        line 86: 301
        line 88: 311
        line 90: 317
        line 93: 320
        line 94: 325
        line 97: 328
        line 100: 334
        line 105: 338
        line 102: 341
        line 104: 343
        line 106: 349
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          105      29     8   cwp   Lext/mods/gameserver/model/entity/CursedWeapon;
          301      16    10 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           32     306     4  type   Ljava/lang/String;
           35     303     5    id   I
           41     297     6 parameter   Ljava/lang/String;
          147     191     7    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
          343       6     4     e   Ljava/lang/Exception;
            0     350     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon;
            0     350     1 command   Ljava/lang/String;
            0     350     2 player   Lext/mods/gameserver/model/actor/Player;
            9     341     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 17
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/util/StringTokenizer ]
        frame_type = 254 /* append */
          offset_delta = 32
          locals = [ class java/lang/String, int, class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/Iterator ]
        frame_type = 50 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon ]
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 16 /* same */
        frame_type = 26 /* same */
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #270                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminCursedWeapon;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #39                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc_w         #274                // String admin_cw
         9: aastore
        10: putstatic     #270                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        13: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "AdminCursedWeapon.java"
