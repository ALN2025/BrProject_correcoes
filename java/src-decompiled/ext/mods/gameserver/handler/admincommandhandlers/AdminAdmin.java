// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminAdmin
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminAdmin.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.class
  Last modified 9 de jul de 2026; size 21257 bytes
  MD5 checksum 2ab81802d1c172770ede9981c30448c3
  Compiled from "AdminAdmin.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminAdmin implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 13, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_admin
    #8 = Utf8               admin_admin
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.showMainPage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #16 = Class              #18           // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin
   #17 = NameAndType        #19:#20       // showMainPage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #18 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin
   #19 = Utf8               showMainPage
   #20 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #21 = String             #22           // admin_camera
   #22 = Utf8               admin_camera
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/Player.getTeleportMode:()Lext/mods/gameserver/enums/TeleportMode;
   #24 = Class              #26           // ext/mods/gameserver/model/actor/Player
   #25 = NameAndType        #27:#28       // getTeleportMode:()Lext/mods/gameserver/enums/TeleportMode;
   #26 = Utf8               ext/mods/gameserver/model/actor/Player
   #27 = Utf8               getTeleportMode
   #28 = Utf8               ()Lext/mods/gameserver/enums/TeleportMode;
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/enums/TeleportMode.CAMERA_MODE:Lext/mods/gameserver/enums/TeleportMode;
   #30 = Class              #32           // ext/mods/gameserver/enums/TeleportMode
   #31 = NameAndType        #33:#34       // CAMERA_MODE:Lext/mods/gameserver/enums/TeleportMode;
   #32 = Utf8               ext/mods/gameserver/enums/TeleportMode
   #33 = Utf8               CAMERA_MODE
   #34 = Utf8               Lext/mods/gameserver/enums/TeleportMode;
   #35 = Methodref          #24.#36       // ext/mods/gameserver/model/actor/Player.setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
   #36 = NameAndType        #37:#38       // setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
   #37 = Utf8               setTeleportMode
   #38 = Utf8               (Lext/mods/gameserver/enums/TeleportMode;)V
   #39 = Methodref          #24.#40       // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #40 = NameAndType        #41:#42       // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #41 = Utf8               getAppearance
   #42 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
   #44 = Class              #46           // ext/mods/gameserver/model/actor/container/player/Appearance
   #45 = NameAndType        #47:#48       // setVisible:(Z)V
   #46 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #47 = Utf8               setVisible
   #48 = Utf8               (Z)V
   #49 = Class              #50           // ext/mods/gameserver/network/serverpackets/CameraMode
   #50 = Utf8               ext/mods/gameserver/network/serverpackets/CameraMode
   #51 = Methodref          #49.#52       // ext/mods/gameserver/network/serverpackets/CameraMode."<init>":(I)V
   #52 = NameAndType        #5:#53        // "<init>":(I)V
   #53 = Utf8               (I)V
   #54 = Methodref          #24.#55       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = NameAndType        #56:#57       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Utf8               sendPacket
   #57 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #58 = Fieldref           #30.#59       // ext/mods/gameserver/enums/TeleportMode.NONE:Lext/mods/gameserver/enums/TeleportMode;
   #59 = NameAndType        #60:#34       // NONE:Lext/mods/gameserver/enums/TeleportMode;
   #60 = Utf8               NONE
   #61 = Methodref          #24.#62       // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #62 = NameAndType        #63:#64       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #63 = Utf8               getPosition
   #64 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #65 = Methodref          #24.#66       // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #66 = NameAndType        #67:#68       // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #67 = Utf8               teleportTo
   #68 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
   #69 = String             #70           // admin_gmlist
   #70 = Utf8               admin_gmlist
   #71 = Methodref          #72.#73       // ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
   #72 = Class              #74           // ext/mods/gameserver/data/xml/AdminData
   #73 = NameAndType        #75:#76       // getInstance:()Lext/mods/gameserver/data/xml/AdminData;
   #74 = Utf8               ext/mods/gameserver/data/xml/AdminData
   #75 = Utf8               getInstance
   #76 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
   #77 = Methodref          #72.#78       // ext/mods/gameserver/data/xml/AdminData.showOrHideGm:(Lext/mods/gameserver/model/actor/Player;)Z
   #78 = NameAndType        #79:#80       // showOrHideGm:(Lext/mods/gameserver/model/actor/Player;)Z
   #79 = Utf8               showOrHideGm
   #80 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #81 = String             #82           // Removed from GMList.
   #82 = Utf8               Removed from GMList.
   #83 = String             #84           // Registered into GMList.
   #84 = Utf8               Registered into GMList.
   #85 = Methodref          #24.#86       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #86 = NameAndType        #87:#88       // sendMessage:(Ljava/lang/String;)V
   #87 = Utf8               sendMessage
   #88 = Utf8               (Ljava/lang/String;)V
   #89 = Class              #90           // java/util/StringTokenizer
   #90 = Utf8               java/util/StringTokenizer
   #91 = String             #92           //
   #92 = Utf8
   #93 = Methodref          #89.#94       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #94 = NameAndType        #5:#95        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #95 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #96 = Methodref          #89.#97       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #97 = NameAndType        #98:#99       // nextToken:()Ljava/lang/String;
   #98 = Utf8               nextToken
   #99 = Utf8               ()Ljava/lang/String;
  #100 = String             #101          // admin_buy
  #101 = Utf8               admin_buy
  #102 = Methodref          #89.#103      // java/util/StringTokenizer.hasMoreTokens:()Z
  #103 = NameAndType        #104:#105     // hasMoreTokens:()Z
  #104 = Utf8               hasMoreTokens
  #105 = Utf8               ()Z
  #106 = String             #107          // gmshops.htm
  #107 = Utf8               gmshops.htm
  #108 = Methodref          #16.#109      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #109 = NameAndType        #110:#20      // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #110 = Utf8               sendFile
  #111 = Methodref          #112.#113     // ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
  #112 = Class              #114          // ext/mods/gameserver/data/manager/BuyListManager
  #113 = NameAndType        #75:#115      // getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
  #114 = Utf8               ext/mods/gameserver/data/manager/BuyListManager
  #115 = Utf8               ()Lext/mods/gameserver/data/manager/BuyListManager;
  #116 = Methodref          #117.#118     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #117 = Class              #119          // java/lang/Integer
  #118 = NameAndType        #120:#121     // parseInt:(Ljava/lang/String;)I
  #119 = Utf8               java/lang/Integer
  #120 = Utf8               parseInt
  #121 = Utf8               (Ljava/lang/String;)I
  #122 = Methodref          #112.#123     // ext/mods/gameserver/data/manager/BuyListManager.getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #123 = NameAndType        #124:#125     // getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #124 = Utf8               getBuyList
  #125 = Utf8               (I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #126 = String             #127          // Invalid buylist id.
  #127 = Utf8               Invalid buylist id.
  #128 = Class              #129          // ext/mods/gameserver/network/serverpackets/BuyList
  #129 = Utf8               ext/mods/gameserver/network/serverpackets/BuyList
  #130 = Methodref          #24.#131      // ext/mods/gameserver/model/actor/Player.getAdena:()I
  #131 = NameAndType        #132:#133     // getAdena:()I
  #132 = Utf8               getAdena
  #133 = Utf8               ()I
  #134 = Methodref          #128.#135     // ext/mods/gameserver/network/serverpackets/BuyList."<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #135 = NameAndType        #5:#136       // "<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #136 = Utf8               (Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #137 = Class              #138          // java/lang/Exception
  #138 = Utf8               java/lang/Exception
  #139 = String             #140          // admin_gmoff
  #140 = Utf8               admin_gmoff
  #141 = String             #142          // Invalid timer set for //gm ; default time is used.
  #142 = Utf8               Invalid timer set for //gm ; default time is used.
  #143 = Methodref          #24.#144      // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #144 = NameAndType        #145:#146     // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #145 = Utf8               getAccessLevel
  #146 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
  #147 = Methodref          #148.#149     // ext/mods/gameserver/model/AccessLevel.getLevel:()I
  #148 = Class              #150          // ext/mods/gameserver/model/AccessLevel
  #149 = NameAndType        #151:#133     // getLevel:()I
  #150 = Utf8               ext/mods/gameserver/model/AccessLevel
  #151 = Utf8               getLevel
  #152 = Methodref          #24.#153      // ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
  #153 = NameAndType        #154:#53      // setAccessLevel:(I)V
  #154 = Utf8               setAccessLevel
  #155 = InvokeDynamic      #0:#156       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #156 = NameAndType        #157:#158     // makeConcatWithConstants:(I)Ljava/lang/String;
  #157 = Utf8               makeConcatWithConstants
  #158 = Utf8               (I)Ljava/lang/String;
  #159 = InvokeDynamic      #1:#160       // #1:run:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/Runnable;
  #160 = NameAndType        #161:#162     // run:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/Runnable;
  #161 = Utf8               run
  #162 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/Runnable;
  #163 = Long               60000l
  #165 = Methodref          #166.#167     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #166 = Class              #168          // ext/mods/commons/pool/ThreadPool
  #167 = NameAndType        #169:#170     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #168 = Utf8               ext/mods/commons/pool/ThreadPool
  #169 = Utf8               schedule
  #170 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #171 = String             #172          // admin_help
  #172 = Utf8               admin_help
  #173 = Methodref          #10.#174      // java/lang/String.toLowerCase:()Ljava/lang/String;
  #174 = NameAndType        #175:#99      // toLowerCase:()Ljava/lang/String;
  #175 = Utf8               toLowerCase
  #176 = String             #177          //
  #177 = Utf8
  #178 = Methodref          #16.#179      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.sendHelp:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
  #179 = NameAndType        #180:#181     // sendHelp:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
  #180 = Utf8               sendHelp
  #181 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
  #182 = String             #183          // admin_link
  #183 = Utf8               admin_link
  #184 = String             #185          // main_menu.htm
  #185 = Utf8               main_menu.htm
  #186 = String             #187          // admin_msg
  #187 = Utf8               admin_msg
  #188 = Methodref          #189.#190     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #189 = Class              #191          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #190 = NameAndType        #192:#193     // getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #191 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #192 = Utf8               getSystemMessage
  #193 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #194 = String             #195          // Usage: //msg sysMsgId
  #195 = Utf8               Usage: //msg sysMsgId
  #196 = String             #197          // admin_time
  #197 = Utf8               admin_time
  #198 = Methodref          #199.#200     // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #199 = Class              #201          // ext/mods/gameserver/taskmanager/GameTimeTaskManager
  #200 = NameAndType        #75:#202      // getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #201 = Utf8               ext/mods/gameserver/taskmanager/GameTimeTaskManager
  #202 = Utf8               ()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #203 = Methodref          #199.#204     // ext/mods/gameserver/taskmanager/GameTimeTaskManager.setGameTime:(II)V
  #204 = NameAndType        #205:#206     // setGameTime:(II)V
  #205 = Utf8               setGameTime
  #206 = Utf8               (II)V
  #207 = Methodref          #199.#208     // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getGameTimeFormated:()Ljava/lang/String;
  #208 = NameAndType        #209:#99      // getGameTimeFormated:()Ljava/lang/String;
  #209 = Utf8               getGameTimeFormated
  #210 = InvokeDynamic      #2:#211       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #211 = NameAndType        #157:#212     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #212 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #213 = String             #214          // Usage: //setgametime <hours> <minutes>
  #214 = Utf8               Usage: //setgametime <hours> <minutes>
  #215 = String             #216          // admin_show
  #216 = Utf8               admin_show
  #217 = Methodref          #16.#218      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #218 = NameAndType        #219:#220     // getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #219 = Utf8               getTargetCreature
  #220 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #221 = Methodref          #10.#222      // java/lang/String.hashCode:()I
  #222 = NameAndType        #223:#133     // hashCode:()I
  #223 = Utf8               hashCode
  #224 = String             #225          // boat
  #225 = Utf8               boat
  #226 = Methodref          #10.#227      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #227 = NameAndType        #228:#229     // equals:(Ljava/lang/Object;)Z
  #228 = Utf8               equals
  #229 = Utf8               (Ljava/lang/Object;)Z
  #230 = String             #231          // clear
  #231 = Utf8               clear
  #232 = String             #233          // door
  #233 = Utf8               door
  #234 = String             #235          // html
  #235 = Utf8               html
  #236 = String             #237          // manor
  #237 = Utf8               manor
  #238 = String             #239          // move
  #239 = Utf8               move
  #240 = String             #241          // path
  #241 = Utf8               path
  #242 = String             #243          // restart
  #243 = Utf8               restart
  #244 = String             #245          // walker
  #245 = Utf8               walker
  #246 = String             #247          // BOAT
  #247 = Utf8               BOAT
  #248 = Methodref          #24.#249      // ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #249 = NameAndType        #250:#251     // getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #250 = Utf8               getDebugPacket
  #251 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #252 = Methodref          #253.#254     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
  #253 = Class              #255          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #254 = NameAndType        #256:#6       // reset:()V
  #255 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #256 = Utf8               reset
  #257 = Methodref          #258.#259     // ext/mods/gameserver/data/xml/BoatData.getInstance:()Lext/mods/gameserver/data/xml/BoatData;
  #258 = Class              #260          // ext/mods/gameserver/data/xml/BoatData
  #259 = NameAndType        #75:#261      // getInstance:()Lext/mods/gameserver/data/xml/BoatData;
  #260 = Utf8               ext/mods/gameserver/data/xml/BoatData
  #261 = Utf8               ()Lext/mods/gameserver/data/xml/BoatData;
  #262 = Methodref          #258.#263     // ext/mods/gameserver/data/xml/BoatData.getItineraries:()Ljava/util/List;
  #263 = NameAndType        #264:#265     // getItineraries:()Ljava/util/List;
  #264 = Utf8               getItineraries
  #265 = Utf8               ()Ljava/util/List;
  #266 = InterfaceMethodref #267.#268     // java/util/List.iterator:()Ljava/util/Iterator;
  #267 = Class              #269          // java/util/List
  #268 = NameAndType        #270:#271     // iterator:()Ljava/util/Iterator;
  #269 = Utf8               java/util/List
  #270 = Utf8               iterator
  #271 = Utf8               ()Ljava/util/Iterator;
  #272 = InterfaceMethodref #273.#274     // java/util/Iterator.hasNext:()Z
  #273 = Class              #275          // java/util/Iterator
  #274 = NameAndType        #276:#105     // hasNext:()Z
  #275 = Utf8               java/util/Iterator
  #276 = Utf8               hasNext
  #277 = InterfaceMethodref #273.#278     // java/util/Iterator.next:()Ljava/lang/Object;
  #278 = NameAndType        #279:#280     // next:()Ljava/lang/Object;
  #279 = Utf8               next
  #280 = Utf8               ()Ljava/lang/Object;
  #281 = Class              #282          // ext/mods/gameserver/model/boat/BoatItinerary
  #282 = Utf8               ext/mods/gameserver/model/boat/BoatItinerary
  #283 = Methodref          #281.#284     // ext/mods/gameserver/model/boat/BoatItinerary.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #284 = NameAndType        #285:#286     // visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #285 = Utf8               visualize
  #286 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #287 = Methodref          #253.#288     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
  #288 = NameAndType        #289:#290     // sendTo:(Lext/mods/gameserver/model/actor/Player;)V
  #289 = Utf8               sendTo
  #290 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #291 = Methodref          #24.#292      // ext/mods/gameserver/model/actor/Player.clearDebugPackets:()V
  #292 = NameAndType        #293:#6       // clearDebugPackets:()V
  #293 = Utf8               clearDebugPackets
  #294 = String             #295          // DOOR
  #295 = Utf8               DOOR
  #296 = Class              #297          // ext/mods/gameserver/model/actor/instance/Door
  #297 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #298 = InvokeDynamic      #3:#299       // #3:accept:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
  #299 = NameAndType        #300:#301     // accept:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
  #300 = Utf8               accept
  #301 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
  #302 = Methodref          #24.#303      // ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #303 = NameAndType        #304:#305     // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #304 = Utf8               forEachKnownType
  #305 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #306 = Fieldref           #307.#308     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.SHOW_FILE:Z
  #307 = Class              #309          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #308 = NameAndType        #310:#311     // SHOW_FILE:Z
  #309 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #310 = Utf8               SHOW_FILE
  #311 = Utf8               Z
  #312 = String             #313          // MANOR
  #313 = Utf8               MANOR
  #314 = Methodref          #315.#316     // ext/mods/gameserver/data/xml/ManorAreaData.getInstance:()Lext/mods/gameserver/data/xml/ManorAreaData;
  #315 = Class              #317          // ext/mods/gameserver/data/xml/ManorAreaData
  #316 = NameAndType        #75:#318      // getInstance:()Lext/mods/gameserver/data/xml/ManorAreaData;
  #317 = Utf8               ext/mods/gameserver/data/xml/ManorAreaData
  #318 = Utf8               ()Lext/mods/gameserver/data/xml/ManorAreaData;
  #319 = Methodref          #315.#320     // ext/mods/gameserver/data/xml/ManorAreaData.getManorAreas:()Ljava/util/List;
  #320 = NameAndType        #321:#265     // getManorAreas:()Ljava/util/List;
  #321 = Utf8               getManorAreas
  #322 = Class              #323          // ext/mods/gameserver/model/manor/ManorArea
  #323 = Utf8               ext/mods/gameserver/model/manor/ManorArea
  #324 = Methodref          #322.#284     // ext/mods/gameserver/model/manor/ManorArea.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #325 = Methodref          #326.#327     // ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #326 = Class              #328          // ext/mods/gameserver/model/actor/Creature
  #327 = NameAndType        #329:#330     // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #328 = Utf8               ext/mods/gameserver/model/actor/Creature
  #329 = Utf8               getMove
  #330 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #331 = Methodref          #332.#333     // ext/mods/gameserver/model/actor/move/CreatureMove.isDebugMove:()Z
  #332 = Class              #334          // ext/mods/gameserver/model/actor/move/CreatureMove
  #333 = NameAndType        #335:#105     // isDebugMove:()Z
  #334 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #335 = Utf8               isDebugMove
  #336 = Methodref          #332.#337     // ext/mods/gameserver/model/actor/move/CreatureMove.setDebugMove:(Z)V
  #337 = NameAndType        #338:#48      // setDebugMove:(Z)V
  #338 = Utf8               setDebugMove
  #339 = Methodref          #326.#340     // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
  #340 = NameAndType        #341:#99      // getName:()Ljava/lang/String;
  #341 = Utf8               getName
  #342 = InvokeDynamic      #4:#211       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #343 = String             #344          // Debug move was enabled.
  #344 = Utf8               Debug move was enabled.
  #345 = Methodref          #326.#86      // ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
  #346 = InvokeDynamic      #5:#211       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #347 = String             #348          // Debug move was disabled.
  #348 = Utf8               Debug move was disabled.
  #349 = Methodref          #350.#351     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #350 = Class              #352          // ext/mods/gameserver/model/World
  #351 = NameAndType        #75:#353      // getInstance:()Lext/mods/gameserver/model/World;
  #352 = Utf8               ext/mods/gameserver/model/World
  #353 = Utf8               ()Lext/mods/gameserver/model/World;
  #354 = Methodref          #350.#355     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #355 = NameAndType        #356:#357     // getPlayers:()Ljava/util/Collection;
  #356 = Utf8               getPlayers
  #357 = Utf8               ()Ljava/util/Collection;
  #358 = InterfaceMethodref #359.#360     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #359 = Class              #361          // java/util/Collection
  #360 = NameAndType        #362:#363     // stream:()Ljava/util/stream/Stream;
  #361 = Utf8               java/util/Collection
  #362 = Utf8               stream
  #363 = Utf8               ()Ljava/util/stream/Stream;
  #364 = InvokeDynamic      #6:#365       // #6:test:()Ljava/util/function/Predicate;
  #365 = NameAndType        #366:#367     // test:()Ljava/util/function/Predicate;
  #366 = Utf8               test
  #367 = Utf8               ()Ljava/util/function/Predicate;
  #368 = InterfaceMethodref #369.#370     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #369 = Class              #371          // java/util/stream/Stream
  #370 = NameAndType        #372:#373     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #371 = Utf8               java/util/stream/Stream
  #372 = Utf8               filter
  #373 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #374 = InvokeDynamic      #7:#375       // #7:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #375 = NameAndType        #300:#376     // accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #376 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #377 = InterfaceMethodref #369.#378     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #378 = NameAndType        #379:#380     // forEach:(Ljava/util/function/Consumer;)V
  #379 = Utf8               forEach
  #380 = Utf8               (Ljava/util/function/Consumer;)V
  #381 = Methodref          #24.#382      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #382 = NameAndType        #383:#133     // getObjectId:()I
  #383 = Utf8               getObjectId
  #384 = InvokeDynamic      #8:#156       // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #385 = Methodref          #332.#386     // ext/mods/gameserver/model/actor/move/CreatureMove.isDebugPath:()Z
  #386 = NameAndType        #387:#105     // isDebugPath:()Z
  #387 = Utf8               isDebugPath
  #388 = Methodref          #332.#389     // ext/mods/gameserver/model/actor/move/CreatureMove.setDebugPath:(Z)V
  #389 = NameAndType        #390:#48      // setDebugPath:(Z)V
  #390 = Utf8               setDebugPath
  #391 = InvokeDynamic      #9:#211       // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #392 = String             #393          // Debug path was enabled.
  #393 = Utf8               Debug path was enabled.
  #394 = InvokeDynamic      #10:#211      // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #395 = String             #396          // Debug path was disabled.
  #396 = Utf8               Debug path was disabled.
  #397 = InvokeDynamic      #11:#375      // #11:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #398 = InvokeDynamic      #12:#156      // #12:makeConcatWithConstants:(I)Ljava/lang/String;
  #399 = String             #400          // Usage : //show restart area|point>
  #400 = Utf8               Usage : //show restart area|point>
  #401 = String             #402          // area
  #402 = Utf8               area
  #403 = String             #404          // point
  #404 = Utf8               point
  #405 = String             #406          // RESTART_AREA
  #406 = Utf8               RESTART_AREA
  #407 = Methodref          #408.#409     // ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #408 = Class              #410          // ext/mods/gameserver/data/xml/RestartPointData
  #409 = NameAndType        #75:#411      // getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #410 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
  #411 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
  #412 = Methodref          #408.#413     // ext/mods/gameserver/data/xml/RestartPointData.getRestartAreas:()Ljava/util/List;
  #413 = NameAndType        #414:#265     // getRestartAreas:()Ljava/util/List;
  #414 = Utf8               getRestartAreas
  #415 = Class              #416          // ext/mods/gameserver/model/restart/RestartArea
  #416 = Utf8               ext/mods/gameserver/model/restart/RestartArea
  #417 = Methodref          #415.#284     // ext/mods/gameserver/model/restart/RestartArea.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #418 = String             #419          // RESTART_POINT
  #419 = Utf8               RESTART_POINT
  #420 = Methodref          #408.#421     // ext/mods/gameserver/data/xml/RestartPointData.getRestartPoints:()Ljava/util/List;
  #421 = NameAndType        #422:#265     // getRestartPoints:()Ljava/util/List;
  #422 = Utf8               getRestartPoints
  #423 = Class              #424          // ext/mods/gameserver/model/restart/RestartPoint
  #424 = Utf8               ext/mods/gameserver/model/restart/RestartPoint
  #425 = Methodref          #423.#426     // ext/mods/gameserver/model/restart/RestartPoint.visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #426 = NameAndType        #427:#286     // visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #427 = Utf8               visualizeZone
  #428 = Methodref          #16.#429      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.sendWalkerInfos:(Lext/mods/gameserver/model/actor/Player;I)V
  #429 = NameAndType        #430:#431     // sendWalkerInfos:(Lext/mods/gameserver/model/actor/Player;I)V
  #430 = Utf8               sendWalkerInfos
  #431 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #432 = Methodref          #433.#434     // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
  #433 = Class              #435          // ext/mods/commons/lang/StringUtil
  #434 = NameAndType        #436:#14      // isDigit:(Ljava/lang/String;)Z
  #435 = Utf8               ext/mods/commons/lang/StringUtil
  #436 = Utf8               isDigit
  #437 = Methodref          #438.#439     // ext/mods/gameserver/data/xml/WalkerRouteData.getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
  #438 = Class              #440          // ext/mods/gameserver/data/xml/WalkerRouteData
  #439 = NameAndType        #75:#441      // getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
  #440 = Utf8               ext/mods/gameserver/data/xml/WalkerRouteData
  #441 = Utf8               ()Lext/mods/gameserver/data/xml/WalkerRouteData;
  #442 = Methodref          #438.#443     // ext/mods/gameserver/data/xml/WalkerRouteData.getWalkerRoute:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
  #443 = NameAndType        #444:#445     // getWalkerRoute:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
  #444 = Utf8               getWalkerRoute
  #445 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
  #446 = InterfaceMethodref #267.#447     // java/util/List.isEmpty:()Z
  #447 = NameAndType        #448:#105     // isEmpty:()Z
  #448 = Utf8               isEmpty
  #449 = InvokeDynamic      #13:#211      // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #450 = String             #451          // WALKER
  #451 = Utf8               WALKER
  #452 = InterfaceMethodref #267.#453     // java/util/List.size:()I
  #453 = NameAndType        #454:#133     // size:()I
  #454 = Utf8               size
  #455 = InvokeDynamic      #14:#156      // #14:makeConcatWithConstants:(I)Ljava/lang/String;
  #456 = Fieldref           #457.#458     // java/awt/Color.YELLOW:Ljava/awt/Color;
  #457 = Class              #459          // java/awt/Color
  #458 = NameAndType        #460:#461     // YELLOW:Ljava/awt/Color;
  #459 = Utf8               java/awt/Color
  #460 = Utf8               YELLOW
  #461 = Utf8               Ljava/awt/Color;
  #462 = InterfaceMethodref #267.#463     // java/util/List.get:(I)Ljava/lang/Object;
  #463 = NameAndType        #464:#465     // get:(I)Ljava/lang/Object;
  #464 = Utf8               get
  #465 = Utf8               (I)Ljava/lang/Object;
  #466 = Class              #467          // ext/mods/gameserver/model/location/Location
  #467 = Utf8               ext/mods/gameserver/model/location/Location
  #468 = Methodref          #253.#469     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #469 = NameAndType        #470:#471     // addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #470 = Utf8               addLine
  #471 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #472 = String             #473          // Usage : //show <clear|door|html|manor|move|path|restart|walker>
  #473 = Utf8               Usage : //show <clear|door|html|manor|move|path|restart|walker>
  #474 = Class              #475          // ext/mods/commons/data/Pagination
  #475 = Utf8               ext/mods/commons/data/Pagination
  #476 = Methodref          #72.#477      // ext/mods/gameserver/data/xml/AdminData.getAdminCommands:()Ljava/util/List;
  #477 = NameAndType        #478:#265     // getAdminCommands:()Ljava/util/List;
  #478 = Utf8               getAdminCommands
  #479 = InterfaceMethodref #267.#360     // java/util/List.stream:()Ljava/util/stream/Stream;
  #480 = Class              #481          // ext/mods/gameserver/handler/IAdminCommandHandler
  #481 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #482 = InvokeDynamic      #15:#483      // #15:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #483 = NameAndType        #366:#484     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #484 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #485 = Methodref          #474.#486     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
  #486 = NameAndType        #5:#487       // "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
  #487 = Utf8               (Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
  #488 = String             #489          // <html><body>
  #489 = Utf8               <html><body>
  #490 = Methodref          #474.#491     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #491 = NameAndType        #492:#493     // append:([Ljava/lang/Object;)V
  #492 = Utf8               append
  #493 = Utf8               ([Ljava/lang/Object;)V
  #494 = String             #495          // bypass admin_help
  #495 = Utf8               bypass admin_help
  #496 = Methodref          #474.#497     // ext/mods/commons/data/Pagination.generateSearch:(Ljava/lang/String;I)V
  #497 = NameAndType        #498:#499     // generateSearch:(Ljava/lang/String;I)V
  #498 = Utf8               generateSearch
  #499 = Utf8               (Ljava/lang/String;I)V
  #500 = Methodref          #474.#268     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #501 = Class              #502          // ext/mods/gameserver/model/records/AdminCommand
  #502 = Utf8               ext/mods/gameserver/model/records/AdminCommand
  #503 = Methodref          #474.#504     // ext/mods/commons/data/Pagination.indexOf:(Ljava/lang/Object;)I
  #504 = NameAndType        #505:#506     // indexOf:(Ljava/lang/Object;)I
  #505 = Utf8               indexOf
  #506 = Utf8               (Ljava/lang/Object;)I
  #507 = String             #508          // <table width=280 height=41 bgcolor=000000><tr>
  #508 = Utf8               <table width=280 height=41 bgcolor=000000><tr>
  #509 = String             #510          // <table width=280 height=41><tr>
  #510 = Utf8               <table width=280 height=41><tr>
  #511 = String             #512          // <td width=280 height=34><font color=\"LEVEL\">//
  #512 = Utf8               <td width=280 height=34><font color=\"LEVEL\">//
  #513 = Methodref          #501.#514     // ext/mods/gameserver/model/records/AdminCommand.name:()Ljava/lang/String;
  #514 = NameAndType        #515:#99      // name:()Ljava/lang/String;
  #515 = Utf8               name
  #516 = Methodref          #10.#517      // java/lang/String.substring:(I)Ljava/lang/String;
  #517 = NameAndType        #518:#158     // substring:(I)Ljava/lang/String;
  #518 = Utf8               substring
  #519 = String             #520          // </font>
  #520 = Utf8               </font>
  #521 = Methodref          #501.#522     // ext/mods/gameserver/model/records/AdminCommand.params:()Ljava/lang/String;
  #522 = NameAndType        #523:#99      // params:()Ljava/lang/String;
  #523 = Utf8               params
  #524 = Methodref          #10.#525      // java/lang/String.isBlank:()Z
  #525 = NameAndType        #526:#105     // isBlank:()Z
  #526 = Utf8               isBlank
  #527 = String             #528          //  <font color=\"33cccc\">
  #528 = Utf8                <font color=\"33cccc\">
  #529 = String             #530          // <br1>
  #530 = Utf8               <br1>
  #531 = Methodref          #501.#532     // ext/mods/gameserver/model/records/AdminCommand.desc:()Ljava/lang/String;
  #532 = NameAndType        #533:#99      // desc:()Ljava/lang/String;
  #533 = Utf8               desc
  #534 = String             #535          // </td>
  #535 = Utf8               </td>
  #536 = String             #537          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #537 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #538 = Methodref          #474.#539     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #539 = NameAndType        #540:#53      // generateSpace:(I)V
  #540 = Utf8               generateSpace
  #541 = InvokeDynamic      #16:#211      // #16:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #542 = Methodref          #474.#543     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #543 = NameAndType        #544:#88      // generatePages:(Ljava/lang/String;)V
  #544 = Utf8               generatePages
  #545 = String             #546          // </body></html>
  #546 = Utf8               </body></html>
  #547 = Methodref          #307.#52      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #548 = Methodref          #474.#549     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #549 = NameAndType        #550:#99      // getContent:()Ljava/lang/String;
  #550 = Utf8               getContent
  #551 = Methodref          #307.#552     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #552 = NameAndType        #553:#88      // setHtml:(Ljava/lang/String;)V
  #553 = Utf8               setHtml
  #554 = Methodref          #24.#555      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #555 = NameAndType        #556:#557     // getLocale:()Ljava/util/Locale;
  #556 = Utf8               getLocale
  #557 = Utf8               ()Ljava/util/Locale;
  #558 = String             #559          // html/admin/walker.htm
  #559 = Utf8               html/admin/walker.htm
  #560 = Methodref          #307.#561     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #561 = NameAndType        #562:#563     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #562 = Utf8               setFile
  #563 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #564 = Methodref          #438.#565     // ext/mods/gameserver/data/xml/WalkerRouteData.getWalkerRoutes:()Ljava/util/Map;
  #565 = NameAndType        #566:#567     // getWalkerRoutes:()Ljava/util/Map;
  #566 = Utf8               getWalkerRoutes
  #567 = Utf8               ()Ljava/util/Map;
  #568 = InterfaceMethodref #569.#570     // java/util/Map.values:()Ljava/util/Collection;
  #569 = Class              #571          // java/util/Map
  #570 = NameAndType        #572:#357     // values:()Ljava/util/Collection;
  #571 = Utf8               java/util/Map
  #572 = Utf8               values
  #573 = InvokeDynamic      #17:#574      // #17:apply:()Ljava/util/function/Function;
  #574 = NameAndType        #575:#576     // apply:()Ljava/util/function/Function;
  #575 = Utf8               apply
  #576 = Utf8               ()Ljava/util/function/Function;
  #577 = InterfaceMethodref #369.#578     // java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #578 = NameAndType        #579:#580     // flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #579 = Utf8               flatMap
  #580 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #581 = Methodref          #474.#582     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #582 = NameAndType        #5:#583       // "<init>":(Ljava/util/stream/Stream;II)V
  #583 = Utf8               (Ljava/util/stream/Stream;II)V
  #584 = Class              #585          // java/util/Map$Entry
  #585 = Utf8               java/util/Map$Entry
  #586 = String             #587          // <table width=280 bgcolor=000000><tr>
  #587 = Utf8               <table width=280 bgcolor=000000><tr>
  #588 = String             #589          // <table width=280><tr>
  #589 = Utf8               <table width=280><tr>
  #590 = Methodref          #591.#592     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #591 = Class              #593          // ext/mods/gameserver/data/manager/SpawnManager
  #592 = NameAndType        #75:#594      // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #593 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #594 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #595 = InterfaceMethodref #584.#596     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #596 = NameAndType        #597:#280     // getKey:()Ljava/lang/Object;
  #597 = Utf8               getKey
  #598 = Methodref          #591.#599     // ext/mods/gameserver/data/manager/SpawnManager.getSpawn:(Ljava/lang/String;)Lext/mods/gameserver/model/spawn/ASpawn;
  #599 = NameAndType        #600:#601     // getSpawn:(Ljava/lang/String;)Lext/mods/gameserver/model/spawn/ASpawn;
  #600 = Utf8               getSpawn
  #601 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/ASpawn;
  #602 = InterfaceMethodref #584.#603     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #603 = NameAndType        #604:#280     // getValue:()Ljava/lang/Object;
  #604 = Utf8               getValue
  #605 = Class              #606          // ext/mods/gameserver/model/location/WalkerLocation
  #606 = Utf8               ext/mods/gameserver/model/location/WalkerLocation
  #607 = Methodref          #605.#608     // ext/mods/gameserver/model/location/WalkerLocation.toString:()Ljava/lang/String;
  #608 = NameAndType        #609:#99      // toString:()Ljava/lang/String;
  #609 = Utf8               toString
  #610 = String             #611          // ,
  #611 = Utf8               ,
  #612 = Methodref          #10.#613      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #613 = NameAndType        #614:#615     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #614 = Utf8               replace
  #615 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #616 = String             #617          // <td width=150><a action=\"bypass admin_teleport
  #617 = Utf8               <td width=150><a action=\"bypass admin_teleport
  #618 = String             #619          // \">Unspawned</a></td><td width=40>-</td><td width=50 align=right>-</td><td width=40 align=right><a action=\"bypass admin_show walker
  #619 = Utf8               \">Unspawned</a></td><td width=40>-</td><td width=50 align=right>-</td><td width=40 align=right><a action=\"bypass admin_show walker
  #620 = Methodref          #117.#621     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #621 = NameAndType        #622:#623     // valueOf:(I)Ljava/lang/Integer;
  #622 = Utf8               valueOf
  #623 = Utf8               (I)Ljava/lang/Integer;
  #624 = String             #625          // \">Show</a></td>
  #625 = Utf8               \">Show</a></td>
  #626 = Methodref          #627.#628     // ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #627 = Class              #629          // ext/mods/gameserver/model/spawn/ASpawn
  #628 = NameAndType        #630:#631     // getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #629 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
  #630 = Utf8               getNpc
  #631 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #632 = Methodref          #633.#634     // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #633 = Class              #635          // ext/mods/gameserver/model/actor/Npc
  #634 = NameAndType        #636:#637     // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #635 = Utf8               ext/mods/gameserver/model/actor/Npc
  #636 = Utf8               getAI
  #637 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #638 = Methodref          #639.#640     // ext/mods/gameserver/model/actor/ai/type/NpcAI.getRouteIndex:()I
  #639 = Class              #641          // ext/mods/gameserver/model/actor/ai/type/NpcAI
  #640 = NameAndType        #642:#133     // getRouteIndex:()I
  #641 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #642 = Utf8               getRouteIndex
  #643 = String             #644          // \">
  #644 = Utf8               \">
  #645 = Methodref          #633.#646     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #646 = NameAndType        #647:#648     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #647 = Utf8               getTemplate
  #648 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #649 = Methodref          #650.#651     // ext/mods/gameserver/model/actor/template/NpcTemplate.getAlias:()Ljava/lang/String;
  #650 = Class              #652          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #651 = NameAndType        #653:#99      // getAlias:()Ljava/lang/String;
  #652 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #653 = Utf8               getAlias
  #654 = Methodref          #433.#655     // ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #655 = NameAndType        #656:#657     // trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #656 = Utf8               trimAndDress
  #657 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #658 = String             #659          // </a></td><td width=40>
  #659 = Utf8               </a></td><td width=40>
  #660 = String             #661          //  /
  #661 = Utf8                /
  #662 = String             #663          // </td><td width=50 align=right>
  #663 = Utf8               </td><td width=50 align=right>
  #664 = Methodref          #639.#665     // ext/mods/gameserver/model/actor/ai/type/NpcAI.isReversePath:()Z
  #665 = NameAndType        #666:#105     // isReversePath:()Z
  #666 = Utf8               isReversePath
  #667 = String             #668          // Reverse
  #668 = Utf8               Reverse
  #669 = String             #670          // Regular
  #670 = Utf8               Regular
  #671 = String             #672          // </td><td width=40 align=right><a action=\"bypass admin_show walker
  #672 = Utf8               </td><td width=40 align=right><a action=\"bypass admin_show walker
  #673 = String             #674          // bypass admin_show walker %page%
  #674 = Utf8               bypass admin_show walker %page%
  #675 = String             #676          // %content%
  #676 = Utf8               %content%
  #677 = Methodref          #307.#678     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #678 = NameAndType        #614:#95      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #679 = String             #680          // main
  #680 = Utf8               main
  #681 = Methodref          #89.#682      // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
  #682 = NameAndType        #5:#88        // "<init>":(Ljava/lang/String;)V
  #683 = String             #684          // game
  #684 = Utf8               game
  #685 = String             #686          // effects
  #686 = Utf8               effects
  #687 = String             #688          // server
  #688 = Utf8               server
  #689 = Methodref          #690.#691     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #690 = Class              #692          // ext/mods/gameserver/data/HTMLData
  #691 = NameAndType        #75:#693      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #692 = Utf8               ext/mods/gameserver/data/HTMLData
  #693 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #694 = InvokeDynamic      #18:#211      // #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #695 = Methodref          #690.#696     // ext/mods/gameserver/data/HTMLData.exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #696 = NameAndType        #697:#698     // exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #697 = Utf8               exists
  #698 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #699 = InvokeDynamic      #19:#211      // #19:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #700 = Fieldref           #16.#701      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.ADMIN_COMMANDS:[Ljava/lang/String;
  #701 = NameAndType        #702:#703     // ADMIN_COMMANDS:[Ljava/lang/String;
  #702 = Utf8               ADMIN_COMMANDS
  #703 = Utf8               [Ljava/lang/String;
  #704 = InterfaceMethodref #569.#705     // java/util/Map.entrySet:()Ljava/util/Set;
  #705 = NameAndType        #706:#707     // entrySet:()Ljava/util/Set;
  #706 = Utf8               entrySet
  #707 = Utf8               ()Ljava/util/Set;
  #708 = InterfaceMethodref #709.#360     // java/util/Set.stream:()Ljava/util/stream/Stream;
  #709 = Class              #710          // java/util/Set
  #710 = Utf8               java/util/Set
  #711 = Methodref          #10.#712      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #712 = NameAndType        #713:#714     // contains:(Ljava/lang/CharSequence;)Z
  #713 = Utf8               contains
  #714 = Utf8               (Ljava/lang/CharSequence;)Z
  #715 = Methodref          #326.#382     // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #716 = Methodref          #296.#717     // ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
  #717 = NameAndType        #647:#718     // getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
  #718 = Utf8               ()Lext/mods/gameserver/model/actor/template/DoorTemplate;
  #719 = Methodref          #720.#721     // ext/mods/gameserver/model/actor/template/DoorTemplate.visualizeDoor:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #720 = Class              #722          // ext/mods/gameserver/model/actor/template/DoorTemplate
  #721 = NameAndType        #723:#286     // visualizeDoor:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #722 = Utf8               ext/mods/gameserver/model/actor/template/DoorTemplate
  #723 = Utf8               visualizeDoor
  #724 = Methodref          #24.#725      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #725 = NameAndType        #726:#105     // isOnline:()Z
  #726 = Utf8               isOnline
  #727 = String             #728          // Your previous access level has been rehabilitated.
  #728 = Utf8               Your previous access level has been rehabilitated.
  #729 = Utf8               Code
  #730 = Utf8               LineNumberTable
  #731 = Utf8               LocalVariableTable
  #732 = Utf8               this
  #733 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminAdmin;
  #734 = Utf8               useAdminCommand
  #735 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #736 = Utf8               list
  #737 = Utf8               Lext/mods/gameserver/model/buylist/NpcBuyList;
  #738 = Utf8               e
  #739 = Utf8               Ljava/lang/Exception;
  #740 = Utf8               duration
  #741 = Utf8               I
  #742 = Utf8               previousAccessLevel
  #743 = Utf8               page
  #744 = Utf8               search
  #745 = Utf8               Ljava/lang/String;
  #746 = Utf8               hours
  #747 = Utf8               minutes
  #748 = Utf8               itinerary
  #749 = Utf8               Lext/mods/gameserver/model/boat/BoatItinerary;
  #750 = Utf8               debug
  #751 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #752 = Utf8               targetPlayer
  #753 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #754 = Utf8               ma
  #755 = Utf8               Lext/mods/gameserver/model/manor/ManorArea;
  #756 = Utf8               debugMove
  #757 = Utf8               debugPath
  #758 = Utf8               ra
  #759 = Utf8               Lext/mods/gameserver/model/restart/RestartArea;
  #760 = Utf8               rp
  #761 = Utf8               Lext/mods/gameserver/model/restart/RestartPoint;
  #762 = Utf8               subCommand
  #763 = Utf8               nextIndex
  #764 = Utf8               i
  #765 = Utf8               param
  #766 = Utf8               route
  #767 = Utf8               Ljava/util/List;
  #768 = Utf8               targetCreature
  #769 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #770 = Utf8               st
  #771 = Utf8               Ljava/util/StringTokenizer;
  #772 = Utf8               command
  #773 = Utf8               player
  #774 = Utf8               LocalVariableTypeTable
  #775 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;
  #776 = Utf8               StackMapTable
  #777 = Class              #778          // ext/mods/gameserver/model/buylist/NpcBuyList
  #778 = Utf8               ext/mods/gameserver/model/buylist/NpcBuyList
  #779 = Utf8               Lext/mods/gameserver/model/records/AdminCommand;
  #780 = Utf8               Lext/mods/commons/data/Pagination;
  #781 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #782 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/records/AdminCommand;>;
  #783 = Class              #784          // "[Ljava/lang/Object;"
  #784 = Utf8               [Ljava/lang/Object;
  #785 = Utf8               teleLoc
  #786 = Utf8               npc
  #787 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #788 = Utf8               aSpawn
  #789 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #790 = Utf8               Ljava/util/Map$Entry;
  #791 = Utf8               row
  #792 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;>;
  #793 = Utf8               Lext/mods/commons/data/Pagination<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;>;>;
  #794 = Utf8               mode
  #795 = Utf8               filename
  #796 = Utf8               getAdminCommandList
  #797 = Utf8               ()[Ljava/lang/String;
  #798 = Utf8               lambda$sendWalkerInfos$0
  #799 = Utf8               (Ljava/util/Map;)Ljava/util/stream/Stream;
  #800 = Utf8               routes
  #801 = Utf8               Ljava/util/Map;
  #802 = Utf8               lambda$sendHelp$0
  #803 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
  #804 = Utf8               ac
  #805 = Utf8               lambda$useAdminCommand$3
  #806 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #807 = Utf8               p
  #808 = Utf8               lambda$useAdminCommand$2
  #809 = Utf8               lambda$useAdminCommand$1
  #810 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/instance/Door;)V
  #811 = Utf8               d
  #812 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #813 = Utf8               lambda$useAdminCommand$0
  #814 = Utf8               <clinit>
  #815 = Utf8               SourceFile
  #816 = Utf8               AdminAdmin.java
  #817 = Utf8               BootstrapMethods
  #818 = String             #819          // You no longer have GM status, but will be rehabilitated after \u0001 minutes.
  #819 = Utf8               You no longer have GM status, but will be rehabilitated after \u0001 minutes.
  #820 = MethodType         #6            //  ()V
  #821 = MethodHandle       6:#822        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;I)V
  #822 = Methodref          #16.#823      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;I)V
  #823 = NameAndType        #813:#431     // lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;I)V
  #824 = String             #825          // Game time has been set to: \u0001
  #825 = Utf8               Game time has been set to: \u0001
  #826 = MethodType         #827          //  (Ljava/lang/Object;)V
  #827 = Utf8               (Ljava/lang/Object;)V
  #828 = MethodHandle       6:#829        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$1:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/instance/Door;)V
  #829 = Methodref          #16.#830      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$1:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/instance/Door;)V
  #830 = NameAndType        #809:#810     // lambda$useAdminCommand$1:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/instance/Door;)V
  #831 = MethodType         #832          //  (Lext/mods/gameserver/model/actor/instance/Door;)V
  #832 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)V
  #833 = String             #834          // Debug move enabled on \u0001
  #834 = Utf8               Debug move enabled on \u0001
  #835 = String             #836          // Debug move disabled on \u0001
  #836 = Utf8               Debug move disabled on \u0001
  #837 = MethodType         #229          //  (Ljava/lang/Object;)Z
  #838 = MethodHandle       5:#839        // REF_invokeVirtual ext/mods/gameserver/model/actor/Player.isGM:()Z
  #839 = Methodref          #24.#840      // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #840 = NameAndType        #841:#105     // isGM:()Z
  #841 = Utf8               isGM
  #842 = MethodType         #80           //  (Lext/mods/gameserver/model/actor/Player;)Z
  #843 = MethodHandle       6:#844        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$2:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #844 = Methodref          #16.#845      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$2:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #845 = NameAndType        #808:#806     // lambda$useAdminCommand$2:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #846 = MethodType         #290          //  (Lext/mods/gameserver/model/actor/Player;)V
  #847 = String             #848          // MOVE\u0001
  #848 = Utf8               MOVE\u0001
  #849 = String             #850          // Debug path enabled on \u0001
  #850 = Utf8               Debug path enabled on \u0001
  #851 = String             #852          // Debug path disabled on \u0001
  #852 = Utf8               Debug path disabled on \u0001
  #853 = MethodHandle       6:#854        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$3:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #854 = Methodref          #16.#855      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$3:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #855 = NameAndType        #805:#806     // lambda$useAdminCommand$3:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #856 = String             #857          // PATH\u0001
  #857 = Utf8               PATH\u0001
  #858 = String             #859          // The npcId \u0001 isn\'t linked to any WalkerRoute.
  #859 = Utf8               The npcId \u0001 isn\'t linked to any WalkerRoute.
  #860 = String             #861          // Segment #\u0001
  #861 = Utf8               Segment #\u0001
  #862 = MethodHandle       6:#863        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$sendHelp$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
  #863 = Methodref          #16.#864      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$sendHelp$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
  #864 = NameAndType        #802:#803     // lambda$sendHelp$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
  #865 = MethodType         #866          //  (Lext/mods/gameserver/model/records/AdminCommand;)Z
  #866 = Utf8               (Lext/mods/gameserver/model/records/AdminCommand;)Z
  #867 = String             #868          // bypass admin_help %page% \u0001
  #868 = Utf8               bypass admin_help %page% \u0001
  #869 = MethodType         #870          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #870 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #871 = MethodHandle       6:#872        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$sendWalkerInfos$0:(Ljava/util/Map;)Ljava/util/stream/Stream;
  #872 = Methodref          #16.#873      // ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$sendWalkerInfos$0:(Ljava/util/Map;)Ljava/util/stream/Stream;
  #873 = NameAndType        #798:#799     // lambda$sendWalkerInfos$0:(Ljava/util/Map;)Ljava/util/stream/Stream;
  #874 = MethodType         #799          //  (Ljava/util/Map;)Ljava/util/stream/Stream;
  #875 = String             #876          // html/admin/\u0001_menu.htm
  #876 = Utf8               html/admin/\u0001_menu.htm
  #877 = String             #878          // \u0001_menu.htm
  #878 = Utf8               \u0001_menu.htm
  #879 = MethodHandle       6:#880        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #880 = Methodref          #881.#882     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #881 = Class              #883          // java/lang/invoke/StringConcatFactory
  #882 = NameAndType        #157:#884     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #883 = Utf8               java/lang/invoke/StringConcatFactory
  #884 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #885 = MethodHandle       6:#886        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #886 = Methodref          #887.#888     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #887 = Class              #889          // java/lang/invoke/LambdaMetafactory
  #888 = NameAndType        #890:#891     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #889 = Utf8               java/lang/invoke/LambdaMetafactory
  #890 = Utf8               metafactory
  #891 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #892 = Utf8               InnerClasses
  #893 = Utf8               Entry
  #894 = Class              #895          // java/lang/invoke/MethodHandles$Lookup
  #895 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #896 = Class              #897          // java/lang/invoke/MethodHandles
  #897 = Utf8               java/lang/invoke/MethodHandles
  #898 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminAdmin();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAdmin;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=16, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_admin
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          18
         9: aload_0
        10: aload_2
        11: aload_1
        12: invokevirtual #15                 // Method showMainPage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        15: goto          1888
        18: aload_1
        19: ldc           #21                 // String admin_camera
        21: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        24: ifeq          106
        27: aload_2
        28: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getTeleportMode:()Lext/mods/gameserver/enums/TeleportMode;
        31: getstatic     #29                 // Field ext/mods/gameserver/enums/TeleportMode.CAMERA_MODE:Lext/mods/gameserver/enums/TeleportMode;
        34: if_acmpeq     67
        37: aload_2
        38: getstatic     #29                 // Field ext/mods/gameserver/enums/TeleportMode.CAMERA_MODE:Lext/mods/gameserver/enums/TeleportMode;
        41: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
        44: aload_2
        45: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        48: iconst_0
        49: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
        52: aload_2
        53: new           #49                 // class ext/mods/gameserver/network/serverpackets/CameraMode
        56: dup
        57: iconst_1
        58: invokespecial #51                 // Method ext/mods/gameserver/network/serverpackets/CameraMode."<init>":(I)V
        61: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        64: goto          94
        67: aload_2
        68: getstatic     #58                 // Field ext/mods/gameserver/enums/TeleportMode.NONE:Lext/mods/gameserver/enums/TeleportMode;
        71: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
        74: aload_2
        75: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        78: iconst_1
        79: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
        82: aload_2
        83: new           #49                 // class ext/mods/gameserver/network/serverpackets/CameraMode
        86: dup
        87: iconst_0
        88: invokespecial #51                 // Method ext/mods/gameserver/network/serverpackets/CameraMode."<init>":(I)V
        91: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        94: aload_2
        95: aload_2
        96: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        99: iconst_0
       100: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       103: goto          1888
       106: aload_1
       107: ldc           #69                 // String admin_gmlist
       109: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       112: ifeq          139
       115: aload_2
       116: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       119: aload_2
       120: invokevirtual #77                 // Method ext/mods/gameserver/data/xml/AdminData.showOrHideGm:(Lext/mods/gameserver/model/actor/Player;)Z
       123: ifeq          131
       126: ldc           #81                 // String Removed from GMList.
       128: goto          133
       131: ldc           #83                 // String Registered into GMList.
       133: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       136: goto          1888
       139: new           #89                 // class java/util/StringTokenizer
       142: dup
       143: aload_1
       144: ldc           #91                 // String
       146: invokespecial #93                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       149: astore_3
       150: aload_3
       151: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       154: pop
       155: aload_1
       156: ldc           #100                // String admin_buy
       158: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       161: ifeq          238
       164: aload_3
       165: invokevirtual #102                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       168: ifne          179
       171: aload_0
       172: aload_2
       173: ldc           #106                // String gmshops.htm
       175: invokevirtual #108                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       178: return
       179: invokestatic  #111                // Method ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
       182: aload_3
       183: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       186: invokestatic  #116                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       189: invokevirtual #122                // Method ext/mods/gameserver/data/manager/BuyListManager.getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
       192: astore        4
       194: aload         4
       196: ifnonnull     206
       199: aload_2
       200: ldc           #126                // String Invalid buylist id.
       202: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       205: return
       206: aload_2
       207: new           #128                // class ext/mods/gameserver/network/serverpackets/BuyList
       210: dup
       211: aload         4
       213: aload_2
       214: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
       217: dconst_0
       218: invokespecial #134                // Method ext/mods/gameserver/network/serverpackets/BuyList."<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
       221: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       224: goto          1888
       227: astore        4
       229: aload_2
       230: ldc           #126                // String Invalid buylist id.
       232: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       235: goto          1888
       238: aload_1
       239: ldc           #139                // String admin_gmoff
       241: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       244: ifeq          324
       247: iconst_1
       248: istore        4
       250: aload_3
       251: invokevirtual #102                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       254: ifeq          277
       257: aload_3
       258: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       261: invokestatic  #116                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       264: istore        4
       266: goto          277
       269: astore        5
       271: aload_2
       272: ldc           #141                // String Invalid timer set for //gm ; default time is used.
       274: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       277: aload_2
       278: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
       281: invokevirtual #147                // Method ext/mods/gameserver/model/AccessLevel.getLevel:()I
       284: istore        5
       286: aload_2
       287: iconst_0
       288: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
       291: aload_2
       292: iload         4
       294: invokedynamic #155,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       299: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       302: aload_2
       303: iload         5
       305: invokedynamic #159,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/Runnable;
       310: iload         4
       312: i2l
       313: ldc2_w        #163                // long 60000l
       316: lmul
       317: invokestatic  #165                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       320: pop
       321: goto          1888
       324: aload_1
       325: ldc           #171                // String admin_help
       327: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       330: ifeq          397
       333: aload_3
       334: invokevirtual #102                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       337: ifeq          350
       340: aload_3
       341: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       344: invokestatic  #116                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       347: goto          351
       350: iconst_1
       351: istore        4
       353: aload_3
       354: invokevirtual #102                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       357: ifeq          370
       360: aload_3
       361: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       364: invokevirtual #173                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       367: goto          372
       370: ldc           #176                // String
       372: astore        5
       374: aload_2
       375: iload         4
       377: aload         5
       379: invokestatic  #178                // Method sendHelp:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       382: goto          1888
       385: astore        4
       387: aload_2
       388: iconst_1
       389: ldc           #176                // String
       391: invokestatic  #178                // Method sendHelp:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       394: goto          1888
       397: aload_1
       398: ldc           #182                // String admin_link
       400: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       403: ifeq          430
       406: aload_0
       407: aload_2
       408: aload_3
       409: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       412: invokevirtual #108                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       415: goto          1888
       418: astore        4
       420: aload_0
       421: aload_2
       422: ldc           #184                // String main_menu.htm
       424: invokevirtual #108                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       427: goto          1888
       430: aload_1
       431: ldc           #186                // String admin_msg
       433: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       436: ifeq          467
       439: aload_2
       440: aload_3
       441: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       444: invokestatic  #116                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       447: invokestatic  #188                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       450: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       453: goto          1888
       456: astore        4
       458: aload_2
       459: ldc           #194                // String Usage: //msg sysMsgId
       461: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       464: goto          1888
       467: aload_1
       468: ldc           #196                // String admin_time
       470: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       473: ifeq          533
       476: aload_3
       477: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       480: invokestatic  #116                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       483: istore        4
       485: aload_3
       486: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       489: invokestatic  #116                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       492: istore        5
       494: invokestatic  #198                // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
       497: iload         4
       499: iload         5
       501: invokevirtual #203                // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.setGameTime:(II)V
       504: aload_2
       505: invokestatic  #198                // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
       508: invokevirtual #207                // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getGameTimeFormated:()Ljava/lang/String;
       511: invokedynamic #210,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       516: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       519: goto          1888
       522: astore        4
       524: aload_2
       525: ldc           #213                // String Usage: //setgametime <hours> <minutes>
       527: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       530: goto          1888
       533: aload_1
       534: ldc           #215                // String admin_show
       536: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       539: ifeq          1888
       542: aload_0
       543: aload_2
       544: iconst_1
       545: invokevirtual #217                // Method getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
       548: astore        4
       550: aload_3
       551: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       554: invokevirtual #173                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       557: astore        6
       559: iconst_m1
       560: istore        7
       562: aload         6
       564: invokevirtual #221                // Method java/lang/String.hashCode:()I
       567: lookupswitch  { // 9

              -795193290: 778

                 3029312: 648

                 3089326: 680

                 3213227: 696

                 3357649: 728

                 3433509: 744

                94746189: 664

               103662781: 712

              1097506319: 761
                 default: 792
            }
       648: aload         6
       650: ldc           #224                // String boat
       652: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       655: ifeq          792
       658: iconst_0
       659: istore        7
       661: goto          792
       664: aload         6
       666: ldc           #230                // String clear
       668: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       671: ifeq          792
       674: iconst_1
       675: istore        7
       677: goto          792
       680: aload         6
       682: ldc           #232                // String door
       684: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       687: ifeq          792
       690: iconst_2
       691: istore        7
       693: goto          792
       696: aload         6
       698: ldc           #234                // String html
       700: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       703: ifeq          792
       706: iconst_3
       707: istore        7
       709: goto          792
       712: aload         6
       714: ldc           #236                // String manor
       716: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       719: ifeq          792
       722: iconst_4
       723: istore        7
       725: goto          792
       728: aload         6
       730: ldc           #238                // String move
       732: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       735: ifeq          792
       738: iconst_5
       739: istore        7
       741: goto          792
       744: aload         6
       746: ldc           #240                // String path
       748: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       751: ifeq          792
       754: bipush        6
       756: istore        7
       758: goto          792
       761: aload         6
       763: ldc           #242                // String restart
       765: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       768: ifeq          792
       771: bipush        7
       773: istore        7
       775: goto          792
       778: aload         6
       780: ldc           #244                // String walker
       782: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       785: ifeq          792
       788: bipush        8
       790: istore        7
       792: iload         7
       794: tableswitch   { // 0 to 8

                       0: 844

                       1: 911

                       2: 934

                       3: 971

                       4: 988

                       5: 1056

                       6: 1228

                       7: 1400

                       8: 1656
                 default: 1869
            }
       844: aload_2
       845: ldc           #246                // String BOAT
       847: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       850: astore        5
       852: aload         5
       854: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
       857: invokestatic  #257                // Method ext/mods/gameserver/data/xml/BoatData.getInstance:()Lext/mods/gameserver/data/xml/BoatData;
       860: invokevirtual #262                // Method ext/mods/gameserver/data/xml/BoatData.getItineraries:()Ljava/util/List;
       863: invokeinterface #266,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       868: astore        8
       870: aload         8
       872: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       877: ifeq          902
       880: aload         8
       882: invokeinterface #277,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       887: checkcast     #281                // class ext/mods/gameserver/model/boat/BoatItinerary
       890: astore        9
       892: aload         9
       894: aload         5
       896: invokevirtual #283                // Method ext/mods/gameserver/model/boat/BoatItinerary.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
       899: goto          870
       902: aload         5
       904: aload_2
       905: invokevirtual #287                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       908: goto          1876
       911: aload         4
       913: instanceof    #24                 // class ext/mods/gameserver/model/actor/Player
       916: ifeq          931
       919: aload         4
       921: checkcast     #24                 // class ext/mods/gameserver/model/actor/Player
       924: astore        8
       926: aload         8
       928: invokevirtual #291                // Method ext/mods/gameserver/model/actor/Player.clearDebugPackets:()V
       931: goto          1876
       934: aload_2
       935: ldc_w         #294                // String DOOR
       938: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       941: astore        5
       943: aload         5
       945: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
       948: aload_2
       949: ldc_w         #296                // class ext/mods/gameserver/model/actor/instance/Door
       952: aload         5
       954: invokedynamic #298,  0            // InvokeDynamic #3:accept:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
       959: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
       962: aload         5
       964: aload_2
       965: invokevirtual #287                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       968: goto          1876
       971: getstatic     #306                // Field ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.SHOW_FILE:Z
       974: ifne          981
       977: iconst_1
       978: goto          982
       981: iconst_0
       982: putstatic     #306                // Field ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.SHOW_FILE:Z
       985: goto          1876
       988: aload_2
       989: ldc_w         #312                // String MANOR
       992: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       995: astore        5
       997: aload         5
       999: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1002: invokestatic  #314                // Method ext/mods/gameserver/data/xml/ManorAreaData.getInstance:()Lext/mods/gameserver/data/xml/ManorAreaData;
      1005: invokevirtual #319                // Method ext/mods/gameserver/data/xml/ManorAreaData.getManorAreas:()Ljava/util/List;
      1008: invokeinterface #266,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      1013: astore        8
      1015: aload         8
      1017: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1022: ifeq          1047
      1025: aload         8
      1027: invokeinterface #277,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1032: checkcast     #322                // class ext/mods/gameserver/model/manor/ManorArea
      1035: astore        9
      1037: aload         9
      1039: aload         5
      1041: invokevirtual #324                // Method ext/mods/gameserver/model/manor/ManorArea.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
      1044: goto          1015
      1047: aload         5
      1049: aload_2
      1050: invokevirtual #287                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1053: goto          1876
      1056: aload         4
      1058: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
      1061: invokevirtual #331                // Method ext/mods/gameserver/model/actor/move/CreatureMove.isDebugMove:()Z
      1064: ifne          1071
      1067: iconst_1
      1068: goto          1072
      1071: iconst_0
      1072: istore        8
      1074: aload         4
      1076: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
      1079: iload         8
      1081: invokevirtual #336                // Method ext/mods/gameserver/model/actor/move/CreatureMove.setDebugMove:(Z)V
      1084: iload         8
      1086: ifeq          1120
      1089: aload_2
      1090: aload         4
      1092: invokevirtual #339                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
      1095: invokedynamic #342,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1100: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1103: aload_2
      1104: aload         4
      1106: if_acmpeq     1876
      1109: aload         4
      1111: ldc_w         #343                // String Debug move was enabled.
      1114: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
      1117: goto          1876
      1120: aload_2
      1121: aload         4
      1123: invokevirtual #339                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
      1126: invokedynamic #346,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1131: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1134: aload_2
      1135: aload         4
      1137: if_acmpeq     1148
      1140: aload         4
      1142: ldc_w         #347                // String Debug move was disabled.
      1145: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
      1148: invokestatic  #349                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      1151: invokevirtual #354                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
      1154: invokeinterface #358,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
      1159: invokedynamic #364,  0            // InvokeDynamic #6:test:()Ljava/util/function/Predicate;
      1164: invokeinterface #368,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
      1169: aload         4
      1171: invokedynamic #374,  0            // InvokeDynamic #7:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
      1176: invokeinterface #377,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
      1181: aload         4
      1183: instanceof    #24                 // class ext/mods/gameserver/model/actor/Player
      1186: ifeq          1225
      1189: aload         4
      1191: checkcast     #24                 // class ext/mods/gameserver/model/actor/Player
      1194: astore        9
      1196: aload         9
      1198: aload         9
      1200: invokevirtual #381                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1203: invokedynamic #384,  0            // InvokeDynamic #8:makeConcatWithConstants:(I)Ljava/lang/String;
      1208: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      1211: astore        10
      1213: aload         10
      1215: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1218: aload         10
      1220: aload         9
      1222: invokevirtual #287                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1225: goto          1876
      1228: aload         4
      1230: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
      1233: invokevirtual #385                // Method ext/mods/gameserver/model/actor/move/CreatureMove.isDebugPath:()Z
      1236: ifne          1243
      1239: iconst_1
      1240: goto          1244
      1243: iconst_0
      1244: istore        9
      1246: aload         4
      1248: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
      1251: iload         9
      1253: invokevirtual #388                // Method ext/mods/gameserver/model/actor/move/CreatureMove.setDebugPath:(Z)V
      1256: iload         9
      1258: ifeq          1292
      1261: aload_2
      1262: aload         4
      1264: invokevirtual #339                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
      1267: invokedynamic #391,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1272: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1275: aload_2
      1276: aload         4
      1278: if_acmpeq     1876
      1281: aload         4
      1283: ldc_w         #392                // String Debug path was enabled.
      1286: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
      1289: goto          1876
      1292: aload_2
      1293: aload         4
      1295: invokevirtual #339                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
      1298: invokedynamic #394,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1303: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1306: aload_2
      1307: aload         4
      1309: if_acmpeq     1320
      1312: aload         4
      1314: ldc_w         #395                // String Debug path was disabled.
      1317: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
      1320: invokestatic  #349                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      1323: invokevirtual #354                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
      1326: invokeinterface #358,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
      1331: invokedynamic #364,  0            // InvokeDynamic #6:test:()Ljava/util/function/Predicate;
      1336: invokeinterface #368,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
      1341: aload         4
      1343: invokedynamic #397,  0            // InvokeDynamic #11:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
      1348: invokeinterface #377,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
      1353: aload         4
      1355: instanceof    #24                 // class ext/mods/gameserver/model/actor/Player
      1358: ifeq          1397
      1361: aload         4
      1363: checkcast     #24                 // class ext/mods/gameserver/model/actor/Player
      1366: astore        10
      1368: aload         10
      1370: aload         10
      1372: invokevirtual #381                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1375: invokedynamic #398,  0            // InvokeDynamic #12:makeConcatWithConstants:(I)Ljava/lang/String;
      1380: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      1383: astore        11
      1385: aload         11
      1387: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1390: aload         11
      1392: aload         10
      1394: invokevirtual #287                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1397: goto          1876
      1400: aload_3
      1401: invokevirtual #102                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1404: ifne          1415
      1407: aload_2
      1408: ldc_w         #399                // String Usage : //show restart area|point>
      1411: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1414: return
      1415: aload_3
      1416: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1419: astore        10
      1421: aload         10
      1423: astore        11
      1425: iconst_m1
      1426: istore        12
      1428: aload         11
      1430: invokevirtual #221                // Method java/lang/String.hashCode:()I
      1433: lookupswitch  { // 2

                 3002509: 1460

               106845584: 1477
                 default: 1491
            }
      1460: aload         11
      1462: ldc_w         #401                // String area
      1465: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1468: ifeq          1491
      1471: iconst_0
      1472: istore        12
      1474: goto          1491
      1477: aload         11
      1479: ldc_w         #403                // String point
      1482: invokevirtual #226                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1485: ifeq          1491
      1488: iconst_1
      1489: istore        12
      1491: iload         12
      1493: lookupswitch  { // 2

                       0: 1520

                       1: 1588
                 default: 1653
            }
      1520: aload_2
      1521: ldc_w         #405                // String RESTART_AREA
      1524: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      1527: astore        5
      1529: aload         5
      1531: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1534: invokestatic  #407                // Method ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
      1537: invokevirtual #412                // Method ext/mods/gameserver/data/xml/RestartPointData.getRestartAreas:()Ljava/util/List;
      1540: invokeinterface #266,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      1545: astore        13
      1547: aload         13
      1549: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1554: ifeq          1579
      1557: aload         13
      1559: invokeinterface #277,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1564: checkcast     #415                // class ext/mods/gameserver/model/restart/RestartArea
      1567: astore        14
      1569: aload         14
      1571: aload         5
      1573: invokevirtual #417                // Method ext/mods/gameserver/model/restart/RestartArea.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
      1576: goto          1547
      1579: aload         5
      1581: aload_2
      1582: invokevirtual #287                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1585: goto          1653
      1588: aload_2
      1589: ldc_w         #418                // String RESTART_POINT
      1592: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      1595: astore        5
      1597: aload         5
      1599: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1602: invokestatic  #407                // Method ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
      1605: invokevirtual #420                // Method ext/mods/gameserver/data/xml/RestartPointData.getRestartPoints:()Ljava/util/List;
      1608: invokeinterface #266,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      1613: astore        13
      1615: aload         13
      1617: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1622: ifeq          1647
      1625: aload         13
      1627: invokeinterface #277,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1632: checkcast     #423                // class ext/mods/gameserver/model/restart/RestartPoint
      1635: astore        14
      1637: aload         14
      1639: aload         5
      1641: invokevirtual #425                // Method ext/mods/gameserver/model/restart/RestartPoint.visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
      1644: goto          1615
      1647: aload         5
      1649: aload_2
      1650: invokevirtual #287                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1653: goto          1876
      1656: aload_3
      1657: invokevirtual #102                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1660: ifne          1669
      1663: aload_2
      1664: iconst_1
      1665: invokestatic  #428                // Method sendWalkerInfos:(Lext/mods/gameserver/model/actor/Player;I)V
      1668: return
      1669: iconst_1
      1670: istore        11
      1672: aload_3
      1673: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1676: astore        12
      1678: aload         12
      1680: invokestatic  #432                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
      1683: ifeq          1713
      1686: aload         12
      1688: invokestatic  #116                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1691: istore        11
      1693: aload_3
      1694: invokevirtual #102                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1697: ifne          1707
      1700: aload_2
      1701: iload         11
      1703: invokestatic  #428                // Method sendWalkerInfos:(Lext/mods/gameserver/model/actor/Player;I)V
      1706: return
      1707: aload_3
      1708: invokevirtual #96                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1711: astore        12
      1713: invokestatic  #437                // Method ext/mods/gameserver/data/xml/WalkerRouteData.getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
      1716: aload         12
      1718: aload         12
      1720: invokevirtual #442                // Method ext/mods/gameserver/data/xml/WalkerRouteData.getWalkerRoute:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
      1723: astore        13
      1725: aload         13
      1727: invokeinterface #446,  1          // InterfaceMethod java/util/List.isEmpty:()Z
      1732: ifeq          1747
      1735: aload_2
      1736: aload         12
      1738: invokedynamic #449,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1743: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1746: return
      1747: aload_2
      1748: ldc_w         #450                // String WALKER
      1751: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      1754: astore        5
      1756: aload         5
      1758: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1761: iconst_0
      1762: istore        14
      1764: iload         14
      1766: aload         13
      1768: invokeinterface #452,  1          // InterfaceMethod java/util/List.size:()I
      1773: if_icmpge     1854
      1776: iload         14
      1778: iconst_1
      1779: iadd
      1780: istore        15
      1782: aload         5
      1784: iload         15
      1786: invokedynamic #455,  0            // InvokeDynamic #14:makeConcatWithConstants:(I)Ljava/lang/String;
      1791: getstatic     #456                // Field java/awt/Color.YELLOW:Ljava/awt/Color;
      1794: iconst_1
      1795: aload         13
      1797: iload         14
      1799: invokeinterface #462,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1804: checkcast     #466                // class ext/mods/gameserver/model/location/Location
      1807: iload         15
      1809: aload         13
      1811: invokeinterface #452,  1          // InterfaceMethod java/util/List.size:()I
      1816: if_icmpne     1833
      1819: aload         13
      1821: iconst_0
      1822: invokeinterface #462,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1827: checkcast     #466                // class ext/mods/gameserver/model/location/Location
      1830: goto          1845
      1833: aload         13
      1835: iload         15
      1837: invokeinterface #462,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1842: checkcast     #466                // class ext/mods/gameserver/model/location/Location
      1845: invokevirtual #468                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
      1848: iinc          14, 1
      1851: goto          1764
      1854: aload         5
      1856: aload_2
      1857: invokevirtual #287                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1860: aload_2
      1861: iload         11
      1863: invokestatic  #428                // Method sendWalkerInfos:(Lext/mods/gameserver/model/actor/Player;I)V
      1866: goto          1876
      1869: aload_2
      1870: ldc_w         #472                // String Usage : //show <clear|door|html|manor|move|path|restart|walker>
      1873: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1876: goto          1888
      1879: astore        6
      1881: aload_2
      1882: ldc_w         #472                // String Usage : //show <clear|door|html|manor|move|path|restart|walker>
      1885: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1888: return
      Exception table:
         from    to  target type
           179   205   227   Class java/lang/Exception
           206   224   227   Class java/lang/Exception
           257   266   269   Class java/lang/Exception
           333   382   385   Class java/lang/Exception
           406   415   418   Class java/lang/Exception
           439   453   456   Class java/lang/Exception
           476   519   522   Class java/lang/Exception
           550  1414  1879   Class java/lang/Exception
          1415  1668  1879   Class java/lang/Exception
          1669  1706  1879   Class java/lang/Exception
          1707  1746  1879   Class java/lang/Exception
          1747  1876  1879   Class java/lang/Exception
      LineNumberTable:
        line 79: 0
        line 80: 9
        line 81: 18
        line 83: 27
        line 85: 37
        line 86: 44
        line 88: 52
        line 93: 67
        line 94: 74
        line 96: 82
        line 98: 94
        line 100: 106
        line 101: 115
        line 104: 139
        line 105: 150
        line 107: 155
        line 109: 164
        line 111: 171
        line 112: 178
        line 117: 179
        line 118: 194
        line 120: 199
        line 121: 205
        line 124: 206
        line 129: 224
        line 126: 227
        line 128: 229
        line 129: 235
        line 131: 238
        line 133: 247
        line 134: 250
        line 138: 257
        line 143: 266
        line 140: 269
        line 142: 271
        line 146: 277
        line 148: 286
        line 149: 291
        line 151: 302
        line 159: 321
        line 160: 324
        line 164: 333
        line 165: 353
        line 167: 374
        line 172: 382
        line 169: 385
        line 171: 387
        line 172: 394
        line 174: 397
        line 178: 406
        line 183: 415
        line 180: 418
        line 182: 420
        line 183: 427
        line 185: 430
        line 189: 439
        line 194: 453
        line 191: 456
        line 193: 458
        line 194: 464
        line 196: 467
        line 200: 476
        line 201: 485
        line 203: 494
        line 205: 504
        line 210: 519
        line 207: 522
        line 209: 524
        line 210: 530
        line 212: 533
        line 214: 542
        line 220: 550
        line 223: 844
        line 224: 852
        line 226: 857
        line 227: 892
        line 229: 902
        line 230: 908
        line 233: 911
        line 234: 926
        line 235: 931
        line 238: 934
        line 239: 943
        line 241: 948
        line 243: 962
        line 244: 968
        line 247: 971
        line 248: 985
        line 251: 988
        line 252: 997
        line 254: 1002
        line 255: 1037
        line 257: 1047
        line 258: 1053
        line 261: 1056
        line 262: 1074
        line 264: 1084
        line 266: 1089
        line 267: 1103
        line 268: 1109
        line 272: 1120
        line 273: 1134
        line 274: 1140
        line 276: 1148
        line 283: 1181
        line 285: 1196
        line 286: 1213
        line 287: 1218
        line 290: 1225
        line 293: 1228
        line 294: 1246
        line 296: 1256
        line 298: 1261
        line 299: 1275
        line 300: 1281
        line 304: 1292
        line 305: 1306
        line 306: 1312
        line 308: 1320
        line 315: 1353
        line 317: 1368
        line 318: 1385
        line 319: 1390
        line 322: 1397
        line 325: 1400
        line 327: 1407
        line 328: 1414
        line 331: 1415
        line 332: 1421
        line 335: 1520
        line 336: 1529
        line 338: 1534
        line 339: 1569
        line 341: 1579
        line 342: 1585
        line 345: 1588
        line 346: 1597
        line 348: 1602
        line 349: 1637
        line 351: 1647
        line 354: 1653
        line 357: 1656
        line 359: 1663
        line 360: 1668
        line 363: 1669
        line 364: 1672
        line 365: 1678
        line 367: 1686
        line 369: 1693
        line 371: 1700
        line 372: 1706
        line 375: 1707
        line 378: 1713
        line 379: 1725
        line 381: 1735
        line 382: 1746
        line 385: 1747
        line 386: 1756
        line 388: 1761
        line 390: 1776
        line 391: 1782
        line 388: 1848
        line 394: 1854
        line 396: 1860
        line 397: 1866
        line 400: 1869
        line 407: 1876
        line 404: 1879
        line 406: 1881
        line 410: 1888
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          194      30     4  list   Lext/mods/gameserver/model/buylist/NpcBuyList;
          229       6     4     e   Ljava/lang/Exception;
          271       6     5     e   Ljava/lang/Exception;
          250      71     4 duration   I
          286      35     5 previousAccessLevel   I
          353      29     4  page   I
          374       8     5 search   Ljava/lang/String;
          387       7     4     e   Ljava/lang/Exception;
          420       7     4     e   Ljava/lang/Exception;
          458       6     4     e   Ljava/lang/Exception;
          485      34     4 hours   I
          494      25     5 minutes   I
          524       6     4     e   Ljava/lang/Exception;
          892       7     9 itinerary   Lext/mods/gameserver/model/boat/BoatItinerary;
          852      59     5 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          926       5     8 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          943      28     5 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1037       7     9    ma   Lext/mods/gameserver/model/manor/ManorArea;
          997      59     5 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1213      12    10 debugMove   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1196      29     9 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1074     154     8  move   Z
         1385      12    11 debugPath   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1368      29    10 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1246     154     9  path   Z
         1569       7    14    ra   Lext/mods/gameserver/model/restart/RestartArea;
         1529      59     5 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1637       7    14    rp   Lext/mods/gameserver/model/restart/RestartPoint;
         1597      56     5 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1421     235    10 subCommand   Ljava/lang/String;
         1782      66    15 nextIndex   I
         1764      90    14     i   I
         1756     113     5 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1672     197    11  page   I
         1678     191    12 param   Ljava/lang/String;
         1725     144    13 route   Ljava/util/List;
         1881       7     6     e   Ljava/lang/Exception;
          550    1338     4 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          150    1738     3    st   Ljava/util/StringTokenizer;
            0    1889     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAdmin;
            0    1889     1 command   Ljava/lang/String;
            0    1889     2 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
         1725     144    13 route   Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;
      StackMapTable: number_of_entries = 85
        frame_type = 18 /* same */
        frame_type = 48 /* same */
        frame_type = 26 /* same */
        frame_type = 11 /* same */
        frame_type = 88 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class java/util/StringTokenizer ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/buylist/NpcBuyList ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 46
        frame_type = 25 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 89 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 118 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 114
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, top, class java/lang/String, int ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 51 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 31
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, top, class java/lang/String, int ]
          stack = []
        frame_type = 19 /* same */
        frame_type = 2 /* same */
        frame_type = 36 /* same */
        frame_type = 9 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 31
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, top, class java/lang/String, int ]
          stack = []
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ int ]
        frame_type = 27 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 76
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ top, int ]
        frame_type = 27 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 76
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, top, class java/lang/String, int, top, top, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 28 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, int, top, top, class java/lang/String, class java/lang/String, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 31
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, top, class java/lang/String, int, top, top, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, int, top, top, class java/lang/String, class java/lang/String, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 31
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, top, class java/lang/String, int, top, top, class java/lang/String ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 2
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, top, class java/lang/String, int, top, top, top, int, class java/lang/String ]
          stack = []
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class java/util/List ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, int, top, top, top, int, class java/lang/String, class java/util/List, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, int, top, top, top, int, class java/lang/String, class java/util/List, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, class java/awt/Color, int, class ext/mods/gameserver/model/location/Location ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, int, top, top, top, int, class java/lang/String, class java/util/List, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, class java/awt/Color, int, class ext/mods/gameserver/model/location/Location, class ext/mods/gameserver/model/location/Location ]
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, top, class java/lang/String, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 6
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 249 /* chop */
          offset_delta = 8

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #700                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 525: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAdmin;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        10
         2: anewarray     #10                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #7                  // String admin_admin
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #100                // String admin_buy
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #21                 // String admin_camera
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #69                 // String admin_gmlist
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #139                // String admin_gmoff
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #171                // String admin_help
        34: aastore
        35: dup
        36: bipush        6
        38: ldc           #182                // String admin_link
        40: aastore
        41: dup
        42: bipush        7
        44: ldc           #186                // String admin_msg
        46: aastore
        47: dup
        48: bipush        8
        50: ldc           #215                // String admin_show
        52: aastore
        53: dup
        54: bipush        9
        56: ldc           #196                // String admin_time
        58: aastore
        59: putstatic     #700                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        62: return
      LineNumberTable:
        line 61: 0
}
SourceFile: "AdminAdmin.java"
BootstrapMethods:
  0: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #818 You no longer have GM status, but will be rehabilitated after \u0001 minutes.
  1: #885 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #820 ()V
      #821 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;I)V
      #820 ()V
  2: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #824 Game time has been set to: \u0001
  3: #885 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #826 (Ljava/lang/Object;)V
      #828 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$1:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/instance/Door;)V
      #831 (Lext/mods/gameserver/model/actor/instance/Door;)V
  4: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #833 Debug move enabled on \u0001
  5: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #835 Debug move disabled on \u0001
  6: #885 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #837 (Ljava/lang/Object;)Z
      #838 REF_invokeVirtual ext/mods/gameserver/model/actor/Player.isGM:()Z
      #842 (Lext/mods/gameserver/model/actor/Player;)Z
  7: #885 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #826 (Ljava/lang/Object;)V
      #843 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$2:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
      #846 (Lext/mods/gameserver/model/actor/Player;)V
  8: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #847 MOVE\u0001
  9: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #849 Debug path enabled on \u0001
  10: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #851 Debug path disabled on \u0001
  11: #885 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #826 (Ljava/lang/Object;)V
      #853 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$useAdminCommand$3:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
      #846 (Lext/mods/gameserver/model/actor/Player;)V
  12: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #856 PATH\u0001
  13: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #858 The npcId \u0001 isn\'t linked to any WalkerRoute.
  14: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #860 Segment #\u0001
  15: #885 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #837 (Ljava/lang/Object;)Z
      #862 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$sendHelp$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/AdminCommand;)Z
      #865 (Lext/mods/gameserver/model/records/AdminCommand;)Z
  16: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #867 bypass admin_help %page% \u0001
  17: #885 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #869 (Ljava/lang/Object;)Ljava/lang/Object;
      #871 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAdmin.lambda$sendWalkerInfos$0:(Ljava/util/Map;)Ljava/util/stream/Stream;
      #874 (Ljava/util/Map;)Ljava/util/stream/Stream;
  18: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #875 html/admin/\u0001_menu.htm
  19: #879 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #877 \u0001_menu.htm
InnerClasses:
  public static #893= #584 of #569;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #898= #894 of #896; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
