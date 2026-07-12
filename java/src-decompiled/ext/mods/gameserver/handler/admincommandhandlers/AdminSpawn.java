// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminSpawn
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminSpawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.class
  Last modified 9 de jul de 2026; size 17951 bytes
  MD5 checksum 340a8ad187b1b47bb2c5a5364d00d57a
  Compiled from "AdminSpawn.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminSpawn implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #39                         // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_list_spawns
    #8 = Utf8               admin_list_spawns
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Class              #16           // java/util/StringTokenizer
   #16 = Utf8               java/util/StringTokenizer
   #17 = String             #18           //
   #18 = Utf8
   #19 = Methodref          #15.#20       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #20 = NameAndType        #5:#21        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #21 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #22 = Methodref          #15.#23       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #23 = NameAndType        #24:#25       // nextToken:()Ljava/lang/String;
   #24 = Utf8               nextToken
   #25 = Utf8               ()Ljava/lang/String;
   #26 = Methodref          #15.#27       // java/util/StringTokenizer.hasMoreTokens:()Z
   #27 = NameAndType        #28:#29       // hasMoreTokens:()Z
   #28 = Utf8               hasMoreTokens
   #29 = Utf8               ()Z
   #30 = Methodref          #31.#32       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #31 = Class              #33           // java/lang/Integer
   #32 = NameAndType        #34:#35       // parseInt:(Ljava/lang/String;)I
   #33 = Utf8               java/lang/Integer
   #34 = Utf8               parseInt
   #35 = Utf8               (Ljava/lang/String;)I
   #36 = Class              #37           // ext/mods/gameserver/model/actor/Npc
   #37 = Utf8               ext/mods/gameserver/model/actor/Npc
   #38 = Methodref          #39.#40       // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #39 = Class              #41           // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn
   #40 = NameAndType        #42:#43       // getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #41 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn
   #42 = Utf8               getTarget
   #43 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #45 = Class              #47           // ext/mods/gameserver/network/SystemMessageId
   #46 = NameAndType        #48:#49       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #48 = Utf8               INVALID_TARGET
   #49 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #50 = Methodref          #51.#52       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #51 = Class              #53           // ext/mods/gameserver/model/actor/Player
   #52 = NameAndType        #54:#55       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #53 = Utf8               ext/mods/gameserver/model/actor/Player
   #54 = Utf8               sendPacket
   #55 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #56 = Methodref          #36.#57       // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #57 = NameAndType        #58:#59       // getNpcId:()I
   #58 = Utf8               getNpcId
   #59 = Utf8               ()I
   #60 = Methodref          #61.#62       // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #61 = Class              #63           // ext/mods/commons/lang/StringUtil
   #62 = NameAndType        #64:#14       // isDigit:(Ljava/lang/String;)Z
   #63 = Utf8               ext/mods/commons/lang/StringUtil
   #64 = Utf8               isDigit
   #65 = Methodref          #66.#67       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #66 = Class              #68           // ext/mods/gameserver/data/xml/NpcData
   #67 = NameAndType        #69:#70       // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #68 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #69 = Utf8               getInstance
   #70 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #71 = Methodref          #66.#72       // ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #72 = NameAndType        #73:#74       // getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #73 = Utf8               getTemplateByName
   #74 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #75 = Methodref          #76.#57       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #76 = Class              #77           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #77 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #78 = Class              #79           // ext/mods/commons/data/Pagination
   #79 = Utf8               ext/mods/commons/data/Pagination
   #80 = Methodref          #81.#82       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #81 = Class              #83           // ext/mods/gameserver/model/World
   #82 = NameAndType        #69:#84       // getInstance:()Lext/mods/gameserver/model/World;
   #83 = Utf8               ext/mods/gameserver/model/World
   #84 = Utf8               ()Lext/mods/gameserver/model/World;
   #85 = Methodref          #81.#86       // ext/mods/gameserver/model/World.getNpcs:(I)Ljava/util/List;
   #86 = NameAndType        #87:#88       // getNpcs:(I)Ljava/util/List;
   #87 = Utf8               getNpcs
   #88 = Utf8               (I)Ljava/util/List;
   #89 = InterfaceMethodref #90.#91       // java/util/List.stream:()Ljava/util/stream/Stream;
   #90 = Class              #92           // java/util/List
   #91 = NameAndType        #93:#94       // stream:()Ljava/util/stream/Stream;
   #92 = Utf8               java/util/List
   #93 = Utf8               stream
   #94 = Utf8               ()Ljava/util/stream/Stream;
   #95 = Class              #96           // ext/mods/gameserver/handler/IAdminCommandHandler
   #96 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #97 = Methodref          #78.#98       // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
   #98 = NameAndType        #5:#99        // "<init>":(Ljava/util/stream/Stream;II)V
   #99 = Utf8               (Ljava/util/stream/Stream;II)V
  #100 = String             #101          // <html><body>
  #101 = Utf8               <html><body>
  #102 = Methodref          #78.#103      // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #103 = NameAndType        #104:#105     // append:([Ljava/lang/Object;)V
  #104 = Utf8               append
  #105 = Utf8               ([Ljava/lang/Object;)V
  #106 = Methodref          #78.#107      // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #107 = NameAndType        #108:#109     // iterator:()Ljava/util/Iterator;
  #108 = Utf8               iterator
  #109 = Utf8               ()Ljava/util/Iterator;
  #110 = InterfaceMethodref #111.#112     // java/util/Iterator.hasNext:()Z
  #111 = Class              #113          // java/util/Iterator
  #112 = NameAndType        #114:#29      // hasNext:()Z
  #113 = Utf8               java/util/Iterator
  #114 = Utf8               hasNext
  #115 = InterfaceMethodref #111.#116     // java/util/Iterator.next:()Ljava/lang/Object;
  #116 = NameAndType        #117:#118     // next:()Ljava/lang/Object;
  #117 = Utf8               next
  #118 = Utf8               ()Ljava/lang/Object;
  #119 = String             #120          // <table width=280 height=41 bgcolor=000000><tr>
  #120 = Utf8               <table width=280 height=41 bgcolor=000000><tr>
  #121 = String             #122          // <table width=280 height=41><tr>
  #122 = Utf8               <table width=280 height=41><tr>
  #123 = String             #124          // <td><a action=\"bypass -h admin_teleport
  #124 = Utf8               <td><a action=\"bypass -h admin_teleport
  #125 = Methodref          #36.#126      // ext/mods/gameserver/model/actor/Npc.getX:()I
  #126 = NameAndType        #127:#59      // getX:()I
  #127 = Utf8               getX
  #128 = Methodref          #31.#129      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #129 = NameAndType        #130:#131     // valueOf:(I)Ljava/lang/Integer;
  #130 = Utf8               valueOf
  #131 = Utf8               (I)Ljava/lang/Integer;
  #132 = Methodref          #36.#133      // ext/mods/gameserver/model/actor/Npc.getY:()I
  #133 = NameAndType        #134:#59      // getY:()I
  #134 = Utf8               getY
  #135 = Methodref          #36.#136      // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #136 = NameAndType        #137:#59      // getZ:()I
  #137 = Utf8               getZ
  #138 = String             #139          // \">
  #139 = Utf8               \">
  #140 = Methodref          #36.#141      // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #141 = NameAndType        #142:#143     // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #142 = Utf8               getSpawn
  #143 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
  #144 = String             #145          //  - (
  #145 = Utf8                - (
  #146 = Methodref          #36.#147      // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #147 = NameAndType        #148:#149     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #148 = Utf8               getPosition
  #149 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #150 = String             #151          // )
  #151 = Utf8               )
  #152 = String             #153          // </a>
  #153 = Utf8               </a>
  #154 = String             #155          //  -
  #155 = Utf8                -
  #156 = String             #157          // </a><br1>
  #157 = Utf8               </a><br1>
  #158 = Methodref          #159.#160     // ext/mods/gameserver/model/spawn/ASpawn.getDescription:()Ljava/lang/String;
  #159 = Class              #161          // ext/mods/gameserver/model/spawn/ASpawn
  #160 = NameAndType        #162:#25      // getDescription:()Ljava/lang/String;
  #161 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
  #162 = Utf8               getDescription
  #163 = String             #164          // </td></tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #164 = Utf8               </td></tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #165 = Methodref          #78.#166      // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #166 = NameAndType        #167:#168     // generateSpace:(I)V
  #167 = Utf8               generateSpace
  #168 = Utf8               (I)V
  #169 = InvokeDynamic      #0:#170       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #170 = NameAndType        #171:#172     // makeConcatWithConstants:(I)Ljava/lang/String;
  #171 = Utf8               makeConcatWithConstants
  #172 = Utf8               (I)Ljava/lang/String;
  #173 = Methodref          #78.#174      // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #174 = NameAndType        #175:#176     // generatePages:(Ljava/lang/String;)V
  #175 = Utf8               generatePages
  #176 = Utf8               (Ljava/lang/String;)V
  #177 = String             #178          // </body></html>
  #178 = Utf8               </body></html>
  #179 = Class              #180          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #180 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #181 = Methodref          #179.#182     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #182 = NameAndType        #5:#168       // "<init>":(I)V
  #183 = Methodref          #78.#184      // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #184 = NameAndType        #185:#25      // getContent:()Ljava/lang/String;
  #185 = Utf8               getContent
  #186 = Methodref          #179.#187     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #187 = NameAndType        #188:#176     // setHtml:(Ljava/lang/String;)V
  #188 = Utf8               setHtml
  #189 = Methodref          #51.#190      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #190 = NameAndType        #54:#191      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #191 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #192 = String             #193          // admin_show_spawns
  #193 = Utf8               admin_show_spawns
  #194 = Methodref          #10.#195      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #195 = NameAndType        #196:#197     // equals:(Ljava/lang/Object;)Z
  #196 = Utf8               equals
  #197 = Utf8               (Ljava/lang/Object;)Z
  #198 = String             #199          // spawns.htm
  #199 = Utf8               spawns.htm
  #200 = Methodref          #39.#201      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #201 = NameAndType        #202:#203     // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #202 = Utf8               sendFile
  #203 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #204 = String             #205          // admin_spawn_index
  #205 = Utf8               admin_spawn_index
  #206 = Class              #207          // java/util/NoSuchElementException
  #207 = Utf8               java/util/NoSuchElementException
  #208 = Methodref          #39.#209      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.showMonsters:(Lext/mods/gameserver/model/actor/Player;II)V
  #209 = NameAndType        #210:#211     // showMonsters:(Lext/mods/gameserver/model/actor/Player;II)V
  #210 = Utf8               showMonsters
  #211 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #212 = Class              #213          // java/lang/Exception
  #213 = Utf8               java/lang/Exception
  #214 = String             #215          // admin_show_npcs
  #215 = Utf8               admin_show_npcs
  #216 = String             #217          // npcs.htm
  #217 = Utf8               npcs.htm
  #218 = String             #219          // admin_npc_index
  #219 = Utf8               admin_npc_index
  #220 = Methodref          #39.#221      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.showNpcs:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #221 = NameAndType        #222:#223     // showNpcs:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #222 = Utf8               showNpcs
  #223 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #224 = String             #225          // admin_unspawnall
  #225 = Utf8               admin_unspawnall
  #226 = Fieldref           #45.#227      // ext/mods/gameserver/network/SystemMessageId.NPC_SERVER_NOT_OPERATING:Lext/mods/gameserver/network/SystemMessageId;
  #227 = NameAndType        #228:#49      // NPC_SERVER_NOT_OPERATING:Lext/mods/gameserver/network/SystemMessageId;
  #228 = Utf8               NPC_SERVER_NOT_OPERATING
  #229 = Methodref          #230.#231     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #230 = Class              #232          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #231 = NameAndType        #233:#234     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #232 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #233 = Utf8               getSystemMessage
  #234 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #235 = Methodref          #81.#236      // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #236 = NameAndType        #237:#191     // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #237 = Utf8               toAllOnlinePlayers
  #238 = Methodref          #239.#240     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #239 = Class              #241          // ext/mods/gameserver/data/manager/SpawnManager
  #240 = NameAndType        #69:#242      // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #241 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #242 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #243 = Methodref          #239.#244     // ext/mods/gameserver/data/manager/SpawnManager.despawn:()V
  #244 = NameAndType        #245:#6       // despawn:()V
  #245 = Utf8               despawn
  #246 = Methodref          #81.#247      // ext/mods/gameserver/model/World.deleteVisibleNpcSpawns:()V
  #247 = NameAndType        #248:#6       // deleteVisibleNpcSpawns:()V
  #248 = Utf8               deleteVisibleNpcSpawns
  #249 = Methodref          #250.#251     // ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
  #250 = Class              #252          // ext/mods/gameserver/data/xml/AdminData
  #251 = NameAndType        #69:#253      // getInstance:()Lext/mods/gameserver/data/xml/AdminData;
  #252 = Utf8               ext/mods/gameserver/data/xml/AdminData
  #253 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
  #254 = String             #255          // NPCs\' unspawn is now complete.
  #255 = Utf8               NPCs\' unspawn is now complete.
  #256 = Methodref          #250.#257     // ext/mods/gameserver/data/xml/AdminData.broadcastMessageToGMs:(Ljava/lang/String;)V
  #257 = NameAndType        #258:#176     // broadcastMessageToGMs:(Ljava/lang/String;)V
  #258 = Utf8               broadcastMessageToGMs
  #259 = String             #260          // admin_respawnall
  #260 = Utf8               admin_respawnall
  #261 = Methodref          #66.#262      // ext/mods/gameserver/data/xml/NpcData.reload:()V
  #262 = NameAndType        #263:#6       // reload:()V
  #263 = Utf8               reload
  #264 = Methodref          #239.#262     // ext/mods/gameserver/data/manager/SpawnManager.reload:()V
  #265 = String             #266          // NPCs\' respawn is now complete.
  #266 = Utf8               NPCs\' respawn is now complete.
  #267 = String             #268          // admin_spawnfence
  #268 = Utf8               admin_spawnfence
  #269 = Methodref          #270.#271     // java/lang/Math.min:(II)I
  #270 = Class              #272          // java/lang/Math
  #271 = NameAndType        #273:#274     // min:(II)I
  #272 = Utf8               java/lang/Math
  #273 = Utf8               min
  #274 = Utf8               (II)I
  #275 = Methodref          #276.#277     // ext/mods/gameserver/data/manager/FenceManager.getInstance:()Lext/mods/gameserver/data/manager/FenceManager;
  #276 = Class              #278          // ext/mods/gameserver/data/manager/FenceManager
  #277 = NameAndType        #69:#279      // getInstance:()Lext/mods/gameserver/data/manager/FenceManager;
  #278 = Utf8               ext/mods/gameserver/data/manager/FenceManager
  #279 = Utf8               ()Lext/mods/gameserver/data/manager/FenceManager;
  #280 = Methodref          #51.#126      // ext/mods/gameserver/model/actor/Player.getX:()I
  #281 = Methodref          #51.#133      // ext/mods/gameserver/model/actor/Player.getY:()I
  #282 = Methodref          #51.#136      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #283 = Methodref          #276.#284     // ext/mods/gameserver/data/manager/FenceManager.addFence:(IIIIIII)Lext/mods/gameserver/model/actor/instance/Fence;
  #284 = NameAndType        #285:#286     // addFence:(IIIIIII)Lext/mods/gameserver/model/actor/instance/Fence;
  #285 = Utf8               addFence
  #286 = Utf8               (IIIIIII)Lext/mods/gameserver/model/actor/instance/Fence;
  #287 = Methodref          #39.#288      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.listFences:(Lext/mods/gameserver/model/actor/Player;)V
  #288 = NameAndType        #289:#290     // listFences:(Lext/mods/gameserver/model/actor/Player;)V
  #289 = Utf8               listFences
  #290 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #291 = String             #292          // Usage: //spawnfence <type> <width> <length> [height]
  #292 = Utf8               Usage: //spawnfence <type> <width> <length> [height]
  #293 = Methodref          #51.#294      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #294 = NameAndType        #295:#176     // sendMessage:(Ljava/lang/String;)V
  #295 = Utf8               sendMessage
  #296 = String             #297          // admin_deletefence
  #297 = Utf8               admin_deletefence
  #298 = Methodref          #81.#299      // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #299 = NameAndType        #300:#301     // getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #300 = Utf8               getObject
  #301 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
  #302 = Class              #303          // ext/mods/gameserver/model/actor/instance/Fence
  #303 = Utf8               ext/mods/gameserver/model/actor/instance/Fence
  #304 = Methodref          #276.#305     // ext/mods/gameserver/data/manager/FenceManager.removeFence:(Lext/mods/gameserver/model/actor/instance/Fence;)V
  #305 = NameAndType        #306:#307     // removeFence:(Lext/mods/gameserver/model/actor/instance/Fence;)V
  #306 = Utf8               removeFence
  #307 = Utf8               (Lext/mods/gameserver/model/actor/instance/Fence;)V
  #308 = String             #309          // Usage: //deletefence <objectId>
  #309 = Utf8               Usage: //deletefence <objectId>
  #310 = String             #311          // admin_listfence
  #311 = Utf8               admin_listfence
  #312 = String             #313          // admin_spawn
  #313 = Utf8               admin_spawn
  #314 = Class              #315          // ext/mods/gameserver/model/WorldObject
  #315 = Utf8               ext/mods/gameserver/model/WorldObject
  #316 = String             #317          // [0-9]*
  #317 = Utf8               [0-9]*
  #318 = Methodref          #10.#319      // java/lang/String.matches:(Ljava/lang/String;)Z
  #319 = NameAndType        #320:#14      // matches:(Ljava/lang/String;)Z
  #320 = Utf8               matches
  #321 = Methodref          #66.#322      // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #322 = NameAndType        #323:#324     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #323 = Utf8               getTemplate
  #324 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #325 = Methodref          #10.#326      // java/lang/String.replace:(CC)Ljava/lang/String;
  #326 = NameAndType        #327:#328     // replace:(CC)Ljava/lang/String;
  #327 = Utf8               replace
  #328 = Utf8               (CC)Ljava/lang/String;
  #329 = Class              #330          // ext/mods/gameserver/model/spawn/Spawn
  #330 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #331 = Methodref          #329.#332     // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #332 = NameAndType        #5:#333       // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #333 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #334 = Methodref          #314.#147     // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #335 = Methodref          #329.#336     // ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #336 = NameAndType        #337:#338     // setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #337 = Utf8               setLoc
  #338 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #339 = Methodref          #329.#340     // ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
  #340 = NameAndType        #341:#168     // setRespawnDelay:(I)V
  #341 = Utf8               setRespawnDelay
  #342 = Methodref          #329.#343     // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #343 = NameAndType        #344:#345     // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #344 = Utf8               doSpawn
  #345 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #346 = Methodref          #239.#347     // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;Z)V
  #347 = NameAndType        #348:#349     // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;Z)V
  #348 = Utf8               addSpawn
  #349 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;Z)V
  #350 = Methodref          #76.#351      // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #351 = NameAndType        #352:#25      // getName:()Ljava/lang/String;
  #352 = Utf8               getName
  #353 = InvokeDynamic      #1:#354       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #354 = NameAndType        #171:#355     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #355 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #356 = Fieldref           #45.#357      // ext/mods/gameserver/network/SystemMessageId.APPLICANT_INFORMATION_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #357 = NameAndType        #358:#49      // APPLICANT_INFORMATION_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #358 = Utf8               APPLICANT_INFORMATION_INCORRECT
  #359 = String             #360          // admin_delete
  #360 = Utf8               admin_delete
  #361 = Methodref          #51.#362      // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #362 = NameAndType        #42:#363      // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #363 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #364 = Class              #365          // ext/mods/gameserver/model/spawn/MultiSpawn
  #365 = Utf8               ext/mods/gameserver/model/spawn/MultiSpawn
  #366 = Methodref          #364.#367     // ext/mods/gameserver/model/spawn/MultiSpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #367 = NameAndType        #368:#369     // getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #368 = Utf8               getNpc
  #369 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #370 = Methodref          #36.#351      // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
  #371 = String             #372          // (\\s|\')+
  #372 = Utf8               (\\s|\')+
  #373 = String             #374          //
  #374 = Utf8
  #375 = Methodref          #10.#376      // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #376 = NameAndType        #377:#355     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #377 = Utf8               replaceAll
  #378 = Methodref          #10.#379      // java/lang/String.toLowerCase:()Ljava/lang/String;
  #379 = NameAndType        #380:#25      // toLowerCase:()Ljava/lang/String;
  #380 = Utf8               toLowerCase
  #381 = Methodref          #364.#382     // ext/mods/gameserver/model/spawn/MultiSpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #382 = NameAndType        #383:#149     // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #383 = Utf8               getSpawnLocation
  #384 = Methodref          #385.#126     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #385 = Class              #386          // ext/mods/gameserver/model/location/SpawnLocation
  #386 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #387 = Methodref          #385.#133     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #388 = InvokeDynamic      #2:#389       // #2:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #389 = NameAndType        #171:#390     // makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #390 = Utf8               (Ljava/lang/String;II)Ljava/lang/String;
  #391 = InvokeDynamic      #3:#389       // #3:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #392 = Methodref          #159.#367     // ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #393 = Integer            -131072
  #394 = Integer            -262144
  #395 = Class              #396          // java/io/File
  #396 = Utf8               java/io/File
  #397 = Fieldref           #39.#398      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.OTHER_XML_FOLDER:Ljava/lang/String;
  #398 = NameAndType        #399:#400     // OTHER_XML_FOLDER:Ljava/lang/String;
  #399 = Utf8               OTHER_XML_FOLDER
  #400 = Utf8               Ljava/lang/String;
  #401 = InvokeDynamic      #4:#402       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
  #402 = NameAndType        #171:#403     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
  #403 = Utf8               (Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
  #404 = Methodref          #395.#405     // java/io/File."<init>":(Ljava/lang/String;)V
  #405 = NameAndType        #5:#176       // "<init>":(Ljava/lang/String;)V
  #406 = Methodref          #395.#407     // java/io/File.exists:()Z
  #407 = NameAndType        #408:#29      // exists:()Z
  #408 = Utf8               exists
  #409 = Methodref          #364.#410     // ext/mods/gameserver/model/spawn/MultiSpawn.doDelete:()V
  #410 = NameAndType        #411:#6       // doDelete:()V
  #411 = Utf8               doDelete
  #412 = InvokeDynamic      #5:#402       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
  #413 = Class              #414          // java/io/BufferedReader
  #414 = Utf8               java/io/BufferedReader
  #415 = Class              #416          // java/io/FileReader
  #416 = Utf8               java/io/FileReader
  #417 = Methodref          #415.#418     // java/io/FileReader."<init>":(Ljava/io/File;)V
  #418 = NameAndType        #5:#419       // "<init>":(Ljava/io/File;)V
  #419 = Utf8               (Ljava/io/File;)V
  #420 = Methodref          #413.#421     // java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
  #421 = NameAndType        #5:#422       // "<init>":(Ljava/io/Reader;)V
  #422 = Utf8               (Ljava/io/Reader;)V
  #423 = Class              #424          // java/io/BufferedWriter
  #424 = Utf8               java/io/BufferedWriter
  #425 = Class              #426          // java/io/FileWriter
  #426 = Utf8               java/io/FileWriter
  #427 = Methodref          #425.#418     // java/io/FileWriter."<init>":(Ljava/io/File;)V
  #428 = Methodref          #423.#429     // java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
  #429 = NameAndType        #5:#430       // "<init>":(Ljava/io/Writer;)V
  #430 = Utf8               (Ljava/io/Writer;)V
  #431 = Methodref          #413.#432     // java/io/BufferedReader.readLine:()Ljava/lang/String;
  #432 = NameAndType        #433:#25      // readLine:()Ljava/lang/String;
  #433 = Utf8               readLine
  #434 = InvokeDynamic      #6:#435       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #435 = NameAndType        #171:#436     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #436 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #437 = Methodref          #10.#438      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #438 = NameAndType        #439:#440     // contains:(Ljava/lang/CharSequence;)Z
  #439 = Utf8               contains
  #440 = Utf8               (Ljava/lang/CharSequence;)Z
  #441 = InvokeDynamic      #7:#435       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #442 = String             #443          // </territory>
  #443 = Utf8               </territory>
  #444 = String             #445          // </npcmaker>
  #445 = Utf8               </npcmaker>
  #446 = InvokeDynamic      #8:#435       // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #447 = Methodref          #423.#448     // java/io/BufferedWriter.write:(Ljava/lang/String;)V
  #448 = NameAndType        #449:#176     // write:(Ljava/lang/String;)V
  #449 = Utf8               write
  #450 = Methodref          #423.#451     // java/io/BufferedWriter.close:()V
  #451 = NameAndType        #452:#6       // close:()V
  #452 = Utf8               close
  #453 = Methodref          #413.#451     // java/io/BufferedReader.close:()V
  #454 = Methodref          #395.#455     // java/io/File.delete:()Z
  #455 = NameAndType        #456:#29      // delete:()Z
  #456 = Utf8               delete
  #457 = Methodref          #395.#458     // java/io/File.renameTo:(Ljava/io/File;)Z
  #458 = NameAndType        #459:#460     // renameTo:(Ljava/io/File;)Z
  #459 = Utf8               renameTo
  #460 = Utf8               (Ljava/io/File;)Z
  #461 = Class              #462          // java/lang/Throwable
  #462 = Utf8               java/lang/Throwable
  #463 = Methodref          #461.#464     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #464 = NameAndType        #465:#466     // addSuppressed:(Ljava/lang/Throwable;)V
  #465 = Utf8               addSuppressed
  #466 = Utf8               (Ljava/lang/Throwable;)V
  #467 = Fieldref           #39.#468      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.LOGGER:Lext/mods/commons/logging/CLogger;
  #468 = NameAndType        #469:#470     // LOGGER:Lext/mods/commons/logging/CLogger;
  #469 = Utf8               LOGGER
  #470 = Utf8               Lext/mods/commons/logging/CLogger;
  #471 = Methodref          #10.#472      // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #472 = NameAndType        #130:#473     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #473 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #474 = InvokeDynamic      #9:#435       // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #475 = Methodref          #476.#477     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #476 = Class              #478          // ext/mods/commons/logging/CLogger
  #477 = NameAndType        #479:#480     // warn:(Ljava/lang/Object;)V
  #478 = Utf8               ext/mods/commons/logging/CLogger
  #479 = Utf8               warn
  #480 = Utf8               (Ljava/lang/Object;)V
  #481 = Methodref          #239.#482     // ext/mods/gameserver/data/manager/SpawnManager.isEmptyXml:(Ljava/io/File;)Z
  #482 = NameAndType        #483:#460     // isEmptyXml:(Ljava/io/File;)Z
  #483 = Utf8               isEmptyXml
  #484 = Methodref          #36.#485      // ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
  #485 = NameAndType        #486:#6       // cancelRespawn:()V
  #486 = Utf8               cancelRespawn
  #487 = Methodref          #36.#488      // ext/mods/gameserver/model/actor/Npc.setReadyForRespawn:(Z)V
  #488 = NameAndType        #489:#490     // setReadyForRespawn:(Z)V
  #489 = Utf8               setReadyForRespawn
  #490 = Utf8               (Z)V
  #491 = Methodref          #36.#492      // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #492 = NameAndType        #493:#6       // deleteMe:()V
  #493 = Utf8               deleteMe
  #494 = Methodref          #239.#495     // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;Z)V
  #495 = NameAndType        #496:#349     // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;Z)V
  #496 = Utf8               deleteSpawn
  #497 = Methodref          #239.#498     // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #498 = NameAndType        #496:#499     // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #499 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
  #500 = Methodref          #329.#410     // ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
  #501 = InvokeDynamic      #10:#435      // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #502 = Methodref          #276.#503     // ext/mods/gameserver/data/manager/FenceManager.getFences:()Ljava/util/List;
  #503 = NameAndType        #504:#505     // getFences:()Ljava/util/List;
  #504 = Utf8               getFences
  #505 = Utf8               ()Ljava/util/List;
  #506 = Class              #507          // java/lang/StringBuilder
  #507 = Utf8               java/lang/StringBuilder
  #508 = Methodref          #506.#3       // java/lang/StringBuilder."<init>":()V
  #509 = InterfaceMethodref #90.#510      // java/util/List.size:()I
  #510 = NameAndType        #511:#59      // size:()I
  #511 = Utf8               size
  #512 = InvokeDynamic      #11:#170      // #11:makeConcatWithConstants:(I)Ljava/lang/String;
  #513 = Methodref          #506.#514     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #514 = NameAndType        #104:#515     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #515 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #516 = InterfaceMethodref #90.#107      // java/util/List.iterator:()Ljava/util/Iterator;
  #517 = Methodref          #302.#518     // ext/mods/gameserver/model/actor/instance/Fence.getObjectId:()I
  #518 = NameAndType        #519:#59      // getObjectId:()I
  #519 = Utf8               getObjectId
  #520 = Methodref          #302.#126     // ext/mods/gameserver/model/actor/instance/Fence.getX:()I
  #521 = Methodref          #302.#133     // ext/mods/gameserver/model/actor/instance/Fence.getY:()I
  #522 = Methodref          #302.#136     // ext/mods/gameserver/model/actor/instance/Fence.getZ:()I
  #523 = InvokeDynamic      #12:#524      // #12:makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #524 = NameAndType        #171:#525     // makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #525 = Utf8               (IIIII)Ljava/lang/String;
  #526 = Methodref          #506.#527     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #527 = NameAndType        #528:#25      // toString:()Ljava/lang/String;
  #528 = Utf8               toString
  #529 = InvokeDynamic      #13:#530      // #13:test:(I)Ljava/util/function/Predicate;
  #530 = NameAndType        #531:#532     // test:(I)Ljava/util/function/Predicate;
  #531 = Utf8               test
  #532 = Utf8               (I)Ljava/util/function/Predicate;
  #533 = Methodref          #66.#534      // ext/mods/gameserver/data/xml/NpcData.getTemplates:(Ljava/util/function/Predicate;)Ljava/util/List;
  #534 = NameAndType        #535:#536     // getTemplates:(Ljava/util/function/Predicate;)Ljava/util/List;
  #535 = Utf8               getTemplates
  #536 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/List;
  #537 = Methodref          #506.#182     // java/lang/StringBuilder."<init>":(I)V
  #538 = String             #539          // <html><title>Spawn Monster</title><body><table width=570><tr><td>Level:
  #539 = Utf8               <html><title>Spawn Monster</title><body><table width=570><tr><td>Level:
  #540 = String             #541          // </td><td>Total Npc\'s:
  #541 = Utf8               </td><td>Total Npc\'s:
  #542 = String             #543          // </td></tr></table><br>
  #543 = Utf8               </td></tr></table><br>
  #544 = Methodref          #61.#545      // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #545 = NameAndType        #104:#546     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #546 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #547 = String             #548          // <a action=\"bypass -h admin_spawn
  #548 = Utf8               <a action=\"bypass -h admin_spawn
  #549 = InterfaceMethodref #90.#550      // java/util/List.get:(I)Ljava/lang/Object;
  #550 = NameAndType        #551:#552     // get:(I)Ljava/lang/Object;
  #551 = Utf8               get
  #552 = Utf8               (I)Ljava/lang/Object;
  #553 = String             #554          // </a><br>
  #554 = Utf8               </a><br>
  #555 = String             #556          // <br><center><button value=\"Back\" action=\"bypass -h admin_show_spawns\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></center></body></html>
  #556 = Utf8               <br><center><button value=\"Back\" action=\"bypass -h admin_show_spawns\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></center></body></html>
  #557 = String             #558          // <br><center><table width=\"520\"><tr><td><button value=\"Back\" action=\"bypass -h admin_show_spawns\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td><td><button value=\"Next\" action=\"bypass -h admin_spawn_index
  #558 = Utf8               <br><center><table width=\"520\"><tr><td><button value=\"Back\" action=\"bypass -h admin_show_spawns\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td><td><button value=\"Next\" action=\"bypass -h admin_spawn_index
  #559 = String             #560          // \" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td></tr></table></center></body></html>
  #560 = Utf8               \" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td></tr></table></center></body></html>
  #561 = InvokeDynamic      #14:#562      // #14:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #562 = NameAndType        #531:#563     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #563 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #564 = String             #565          // <html><title>Spawn Monster</title><body><p> There are
  #565 = Utf8               <html><title>Spawn Monster</title><body><p> There are
  #566 = String             #567          //  Npcs whose name starts with
  #567 = Utf8                Npcs whose name starts with
  #568 = String             #569          // :<br>
  #569 = Utf8               :<br>
  #570 = String             #571          // <br><center><button value=\"Back\" action=\"bypass -h admin_show_npcs\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></center></body></html>
  #571 = Utf8               <br><center><button value=\"Back\" action=\"bypass -h admin_show_npcs\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></center></body></html>
  #572 = String             #573          // <br><center><table width=\"520\"><tr><td><button value=\"Back\" action=\"bypass -h admin_show_npcs\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td><td><button value=\"Next\" action=\"bypass -h admin_npc_index
  #573 = Utf8               <br><center><table width=\"520\"><tr><td><button value=\"Back\" action=\"bypass -h admin_show_npcs\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td><td><button value=\"Next\" action=\"bypass -h admin_npc_index
  #574 = Fieldref           #39.#575      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.ADMIN_COMMANDS:[Ljava/lang/String;
  #575 = NameAndType        #576:#577     // ADMIN_COMMANDS:[Ljava/lang/String;
  #576 = Utf8               ADMIN_COMMANDS
  #577 = Utf8               [Ljava/lang/String;
  #578 = String             #579          // Folk
  #579 = Utf8               Folk
  #580 = Methodref          #76.#581      // ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
  #581 = NameAndType        #582:#14      // isType:(Ljava/lang/String;)Z
  #582 = Utf8               isType
  #583 = String             #584          // Monster
  #584 = Utf8               Monster
  #585 = Methodref          #76.#586      // ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #586 = NameAndType        #587:#588     // getLevel:()B
  #587 = Utf8               getLevel
  #588 = Utf8               ()B
  #589 = Fieldref           #590.#591     // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
  #590 = Class              #592          // ext/mods/Config
  #591 = NameAndType        #593:#594     // DATA_PATH:Ljava/nio/file/Path;
  #592 = Utf8               ext/mods/Config
  #593 = Utf8               DATA_PATH
  #594 = Utf8               Ljava/nio/file/Path;
  #595 = String             #596          // xml/spawnlist/custom
  #596 = Utf8               xml/spawnlist/custom
  #597 = InterfaceMethodref #598.#599     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #598 = Class              #600          // java/nio/file/Path
  #599 = NameAndType        #601:#602     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #600 = Utf8               java/nio/file/Path
  #601 = Utf8               resolve
  #602 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #603 = InterfaceMethodref #598.#527     // java/nio/file/Path.toString:()Ljava/lang/String;
  #604 = String             #605          // admin_spawn_once
  #605 = Utf8               admin_spawn_once
  #606 = Utf8               Code
  #607 = Utf8               LineNumberTable
  #608 = Utf8               LocalVariableTable
  #609 = Utf8               this
  #610 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminSpawn;
  #611 = Utf8               useAdminCommand
  #612 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #613 = Utf8               npc
  #614 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #615 = Utf8               template
  #616 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #617 = Utf8               spawn
  #618 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #619 = Utf8               st
  #620 = Utf8               Ljava/util/StringTokenizer;
  #621 = Utf8               npcId
  #622 = Utf8               I
  #623 = Utf8               entry
  #624 = Utf8               page
  #625 = Utf8               row
  #626 = Utf8               list
  #627 = Utf8               Lext/mods/commons/data/Pagination;
  #628 = Utf8               html
  #629 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #630 = Utf8               level
  #631 = Utf8               from
  #632 = Utf8               e
  #633 = Utf8               Ljava/lang/Exception;
  #634 = Utf8               letter
  #635 = Utf8               type
  #636 = Utf8               sizeX
  #637 = Utf8               sizeY
  #638 = Utf8               height
  #639 = Utf8               fence
  #640 = Utf8               Lext/mods/gameserver/model/actor/instance/Fence;
  #641 = Utf8               worldObject
  #642 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #643 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #644 = Utf8               cmd
  #645 = Utf8               idOrName
  #646 = Utf8               respawnTime
  #647 = Utf8               targetWorldObject
  #648 = Utf8               targetNpc
  #649 = Utf8               currentLine
  #650 = Utf8               inTerritory
  #651 = Utf8               Z
  #652 = Utf8               inNpcMaker
  #653 = Utf8               needToDelete
  #654 = Utf8               writer
  #655 = Utf8               Ljava/io/BufferedWriter;
  #656 = Utf8               reader
  #657 = Utf8               Ljava/io/BufferedReader;
  #658 = Utf8               name
  #659 = Utf8               npcMakerName
  #660 = Utf8               fileName
  #661 = Utf8               x
  #662 = Utf8               y
  #663 = Utf8               spawnFile
  #664 = Utf8               Ljava/io/File;
  #665 = Utf8               tempFile
  #666 = Utf8               multi
  #667 = Utf8               Lext/mods/gameserver/model/spawn/MultiSpawn;
  #668 = Utf8               spawnObj
  #669 = Utf8               command
  #670 = Utf8               player
  #671 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #672 = Utf8               LocalVariableTypeTable
  #673 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/actor/Npc;>;
  #674 = Utf8               StackMapTable
  #675 = Class              #676          // "[Ljava/lang/Object;"
  #676 = Utf8               [Ljava/lang/Object;
  #677 = Utf8               fences
  #678 = Utf8               Ljava/util/List;
  #679 = Utf8               sb
  #680 = Utf8               Ljava/lang/StringBuilder;
  #681 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Fence;>;
  #682 = Utf8               j
  #683 = Utf8               mobs
  #684 = Utf8               i
  #685 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #686 = Utf8               starting
  #687 = Utf8               npcs
  #688 = Utf8               getAdminCommandList
  #689 = Utf8               ()[Ljava/lang/String;
  #690 = Utf8               lambda$showNpcs$0
  #691 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #692 = Utf8               t
  #693 = Utf8               lambda$showMonsters$0
  #694 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #695 = Utf8               <clinit>
  #696 = Utf8               SourceFile
  #697 = Utf8               AdminSpawn.java
  #698 = Utf8               BootstrapMethods
  #699 = String             #700          // bypass admin_list_spawns \u0001 %page%
  #700 = Utf8               bypass admin_list_spawns \u0001 %page%
  #701 = String             #702          // You spawned \u0001. - Cmd: \u0001
  #702 = Utf8               You spawned \u0001. - Cmd: \u0001
  #703 = String             #704          // \u0001_\u0001\u0001
  #704 = Utf8               \u0001_\u0001\u0001
  #705 = String             #706          // \u0001_\u0001\u00011
  #706 = Utf8               \u0001_\u0001\u00011
  #707 = String             #708          // \u0001/\u0001_\u0001_\u0001.xml
  #708 = Utf8               \u0001/\u0001_\u0001_\u0001.xml
  #709 = String             #710          // \u0001/\u0001_\u0001_\u0001.tmp
  #710 = Utf8               \u0001/\u0001_\u0001_\u0001.tmp
  #711 = String             #712          // <territory name=\"\u0001
  #712 = Utf8               <territory name=\"\u0001
  #713 = String             #714          // <npcmaker name=\"\u0001
  #714 = Utf8               <npcmaker name=\"\u0001
  #715 = String             #716          // \u0001\n
  #716 = Utf8               \u0001\n
  #717 = String             #718          // Could not remove spawn from the spawn XML files: \u0001
  #718 = Utf8               Could not remove spawn from the spawn XML files: \u0001
  #719 = String             #720          // You deleted \u0001 (respawn prevented).
  #720 = Utf8               You deleted \u0001 (respawn prevented).
  #721 = String             #722          // <html><body>Total Fences: \u0001<br><br>
  #722 = Utf8               <html><body>Total Fences: \u0001<br><br>
  #723 = String             #724          // <a action=\"bypass -h admin_deletefence \u0001 1\">Fence: \u0001 [\u0001 \u0001 \u0001]</a><br>
  #724 = Utf8               <a action=\"bypass -h admin_deletefence \u0001 1\">Fence: \u0001 [\u0001 \u0001 \u0001]</a><br>
  #725 = MethodType         #197          //  (Ljava/lang/Object;)Z
  #726 = MethodHandle       6:#727        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.lambda$showMonsters$0:(ILext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #727 = Methodref          #39.#728      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.lambda$showMonsters$0:(ILext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #728 = NameAndType        #693:#694     // lambda$showMonsters$0:(ILext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #729 = MethodType         #730          //  (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #730 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #731 = MethodHandle       6:#732        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.lambda$showNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #732 = Methodref          #39.#733      // ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.lambda$showNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #733 = NameAndType        #690:#691     // lambda$showNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #734 = MethodHandle       6:#735        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #735 = Methodref          #736.#737     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #736 = Class              #738          // java/lang/invoke/StringConcatFactory
  #737 = NameAndType        #171:#739     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #738 = Utf8               java/lang/invoke/StringConcatFactory
  #739 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #740 = MethodHandle       6:#741        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #741 = Methodref          #742.#743     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #742 = Class              #744          // java/lang/invoke/LambdaMetafactory
  #743 = NameAndType        #745:#746     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #744 = Utf8               java/lang/invoke/LambdaMetafactory
  #745 = Utf8               metafactory
  #746 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #747 = Utf8               InnerClasses
  #748 = Class              #749          // java/lang/invoke/MethodHandles$Lookup
  #749 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #750 = Class              #751          // java/lang/invoke/MethodHandles
  #751 = Utf8               java/lang/invoke/MethodHandles
  #752 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSpawn;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=20, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_list_spawns
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          499
         9: new           #15                 // class java/util/StringTokenizer
        12: dup
        13: aload_1
        14: ldc           #17                 // String
        16: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        19: astore_3
        20: aload_3
        21: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        24: pop
        25: iconst_0
        26: istore        4
        28: aload_3
        29: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        32: ifeq          42
        35: aload_3
        36: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        39: goto          43
        42: aconst_null
        43: astore        5
        45: aload_3
        46: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        49: ifeq          62
        52: aload_3
        53: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        56: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        59: goto          63
        62: iconst_1
        63: istore        6
        65: aload         5
        67: ifnonnull     106
        70: aload_0
        71: ldc           #36                 // class ext/mods/gameserver/model/actor/Npc
        73: aload_2
        74: iconst_0
        75: invokevirtual #38                 // Method getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
        78: checkcast     #36                 // class ext/mods/gameserver/model/actor/Npc
        81: astore        7
        83: aload         7
        85: ifnonnull     96
        88: aload_2
        89: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        92: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        95: return
        96: aload         7
        98: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
       101: istore        4
       103: goto          146
       106: aload         5
       108: invokestatic  #60                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       111: ifeq          124
       114: aload         5
       116: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       119: istore        4
       121: goto          146
       124: invokestatic  #65                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       127: aload         5
       129: invokevirtual #71                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       132: astore        7
       134: aload         7
       136: ifnull        146
       139: aload         7
       141: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
       144: istore        4
       146: iload         4
       148: ifne          159
       151: aload_2
       152: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       155: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       158: return
       159: iconst_0
       160: bipush        8
       162: iload         6
       164: iconst_1
       165: isub
       166: imul
       167: iadd
       168: istore        7
       170: new           #78                 // class ext/mods/commons/data/Pagination
       173: dup
       174: invokestatic  #80                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       177: iload         4
       179: invokevirtual #85                 // Method ext/mods/gameserver/model/World.getNpcs:(I)Ljava/util/List;
       182: invokeinterface #89,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       187: iload         6
       189: bipush        8
       191: invokespecial #97                 // Method ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
       194: astore        8
       196: aload         8
       198: iconst_1
       199: anewarray     #2                  // class java/lang/Object
       202: dup
       203: iconst_0
       204: ldc           #100                // String <html><body>
       206: aastore
       207: invokevirtual #102                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       210: aload         8
       212: invokevirtual #106                // Method ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
       215: astore        9
       217: aload         9
       219: invokeinterface #110,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       224: ifeq          437
       227: aload         9
       229: invokeinterface #115,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       234: checkcast     #36                 // class ext/mods/gameserver/model/actor/Npc
       237: astore        10
       239: aload         8
       241: iconst_1
       242: anewarray     #2                  // class java/lang/Object
       245: dup
       246: iconst_0
       247: iload         7
       249: iconst_2
       250: irem
       251: ifne          259
       254: ldc           #119                // String <table width=280 height=41 bgcolor=000000><tr>
       256: goto          261
       259: ldc           #121                // String <table width=280 height=41><tr>
       261: aastore
       262: invokevirtual #102                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       265: aload         8
       267: bipush        8
       269: anewarray     #2                  // class java/lang/Object
       272: dup
       273: iconst_0
       274: ldc           #123                // String <td><a action=\"bypass -h admin_teleport
       276: aastore
       277: dup
       278: iconst_1
       279: aload         10
       281: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       284: invokestatic  #128                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       287: aastore
       288: dup
       289: iconst_2
       290: ldc           #17                 // String
       292: aastore
       293: dup
       294: iconst_3
       295: aload         10
       297: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       300: invokestatic  #128                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       303: aastore
       304: dup
       305: iconst_4
       306: ldc           #17                 // String
       308: aastore
       309: dup
       310: iconst_5
       311: aload         10
       313: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       316: invokestatic  #128                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       319: aastore
       320: dup
       321: bipush        6
       323: ldc           #138                // String \">
       325: aastore
       326: dup
       327: bipush        7
       329: iload         7
       331: invokestatic  #128                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       334: aastore
       335: invokevirtual #102                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       338: aload         10
       340: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
       343: astore        11
       345: aload         11
       347: ifnonnull     385
       350: aload         8
       352: iconst_4
       353: anewarray     #2                  // class java/lang/Object
       356: dup
       357: iconst_0
       358: ldc           #144                // String  - (
       360: aastore
       361: dup
       362: iconst_1
       363: aload         10
       365: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       368: aastore
       369: dup
       370: iconst_2
       371: ldc           #150                // String )
       373: aastore
       374: dup
       375: iconst_3
       376: ldc           #152                // String </a>
       378: aastore
       379: invokevirtual #102                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       382: goto          417
       385: aload         8
       387: iconst_4
       388: anewarray     #2                  // class java/lang/Object
       391: dup
       392: iconst_0
       393: ldc           #154                // String  -
       395: aastore
       396: dup
       397: iconst_1
       398: aload         11
       400: aastore
       401: dup
       402: iconst_2
       403: ldc           #156                // String </a><br1>
       405: aastore
       406: dup
       407: iconst_3
       408: aload         11
       410: invokevirtual #158                // Method ext/mods/gameserver/model/spawn/ASpawn.getDescription:()Ljava/lang/String;
       413: aastore
       414: invokevirtual #102                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       417: aload         8
       419: iconst_1
       420: anewarray     #2                  // class java/lang/Object
       423: dup
       424: iconst_0
       425: ldc           #163                // String </td></tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
       427: aastore
       428: invokevirtual #102                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       431: iinc          7, 1
       434: goto          217
       437: aload         8
       439: bipush        42
       441: invokevirtual #165                // Method ext/mods/commons/data/Pagination.generateSpace:(I)V
       444: aload         8
       446: iload         4
       448: invokedynamic #169,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       453: invokevirtual #173                // Method ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
       456: aload         8
       458: iconst_1
       459: anewarray     #2                  // class java/lang/Object
       462: dup
       463: iconst_0
       464: ldc           #177                // String </body></html>
       466: aastore
       467: invokevirtual #102                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       470: new           #179                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       473: dup
       474: iconst_0
       475: invokespecial #181                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       478: astore        9
       480: aload         9
       482: aload         8
       484: invokevirtual #183                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       487: invokevirtual #186                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       490: aload_2
       491: aload         9
       493: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       496: goto          1880
       499: aload_1
       500: ldc           #192                // String admin_show_spawns
       502: invokevirtual #194                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       505: ifeq          518
       508: aload_0
       509: aload_2
       510: ldc           #198                // String spawns.htm
       512: invokevirtual #200                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       515: goto          1880
       518: aload_1
       519: ldc           #204                // String admin_spawn_index
       521: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       524: ifeq          592
       527: new           #15                 // class java/util/StringTokenizer
       530: dup
       531: aload_1
       532: ldc           #17                 // String
       534: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       537: astore_3
       538: aload_3
       539: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       542: pop
       543: aload_3
       544: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       547: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       550: istore        4
       552: iconst_0
       553: istore        5
       555: aload_3
       556: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       559: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       562: istore        5
       564: goto          569
       567: astore        6
       569: aload_2
       570: iload         4
       572: iload         5
       574: invokestatic  #208                // Method showMonsters:(Lext/mods/gameserver/model/actor/Player;II)V
       577: goto          589
       580: astore        4
       582: aload_0
       583: aload_2
       584: ldc           #198                // String spawns.htm
       586: invokevirtual #200                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       589: goto          1880
       592: aload_1
       593: ldc           #214                // String admin_show_npcs
       595: invokevirtual #194                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       598: ifeq          611
       601: aload_0
       602: aload_2
       603: ldc           #216                // String npcs.htm
       605: invokevirtual #200                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       608: goto          1880
       611: aload_1
       612: ldc           #218                // String admin_npc_index
       614: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       617: ifeq          682
       620: new           #15                 // class java/util/StringTokenizer
       623: dup
       624: aload_1
       625: ldc           #17                 // String
       627: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       630: astore_3
       631: aload_3
       632: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       635: pop
       636: aload_3
       637: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       640: astore        4
       642: iconst_0
       643: istore        5
       645: aload_3
       646: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       649: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       652: istore        5
       654: goto          659
       657: astore        6
       659: aload_2
       660: aload         4
       662: iload         5
       664: invokestatic  #220                // Method showNpcs:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
       667: goto          679
       670: astore        4
       672: aload_0
       673: aload_2
       674: ldc           #216                // String npcs.htm
       676: invokevirtual #200                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       679: goto          1880
       682: aload_1
       683: ldc           #224                // String admin_unspawnall
       685: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       688: ifeq          723
       691: getstatic     #226                // Field ext/mods/gameserver/network/SystemMessageId.NPC_SERVER_NOT_OPERATING:Lext/mods/gameserver/network/SystemMessageId;
       694: invokestatic  #229                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       697: invokestatic  #235                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       700: invokestatic  #238                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       703: invokevirtual #243                // Method ext/mods/gameserver/data/manager/SpawnManager.despawn:()V
       706: invokestatic  #80                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       709: invokevirtual #246                // Method ext/mods/gameserver/model/World.deleteVisibleNpcSpawns:()V
       712: invokestatic  #249                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       715: ldc           #254                // String NPCs\' unspawn is now complete.
       717: invokevirtual #256                // Method ext/mods/gameserver/data/xml/AdminData.broadcastMessageToGMs:(Ljava/lang/String;)V
       720: goto          1880
       723: aload_1
       724: ldc_w         #259                // String admin_respawnall
       727: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       730: ifeq          769
       733: invokestatic  #238                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       736: invokevirtual #243                // Method ext/mods/gameserver/data/manager/SpawnManager.despawn:()V
       739: invokestatic  #80                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       742: invokevirtual #246                // Method ext/mods/gameserver/model/World.deleteVisibleNpcSpawns:()V
       745: invokestatic  #65                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       748: invokevirtual #261                // Method ext/mods/gameserver/data/xml/NpcData.reload:()V
       751: invokestatic  #238                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       754: invokevirtual #264                // Method ext/mods/gameserver/data/manager/SpawnManager.reload:()V
       757: invokestatic  #249                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       760: ldc_w         #265                // String NPCs\' respawn is now complete.
       763: invokevirtual #256                // Method ext/mods/gameserver/data/xml/AdminData.broadcastMessageToGMs:(Ljava/lang/String;)V
       766: goto          1880
       769: aload_1
       770: ldc_w         #267                // String admin_spawnfence
       773: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       776: ifeq          903
       779: new           #15                 // class java/util/StringTokenizer
       782: dup
       783: aload_1
       784: ldc           #17                 // String
       786: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       789: astore_3
       790: aload_3
       791: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       794: pop
       795: aload_3
       796: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       799: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       802: istore        4
       804: aload_3
       805: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       808: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       811: bipush        100
       813: idiv
       814: bipush        100
       816: imul
       817: istore        5
       819: aload_3
       820: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       823: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       826: bipush        100
       828: idiv
       829: bipush        100
       831: imul
       832: istore        6
       834: iconst_1
       835: istore        7
       837: aload_3
       838: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       841: ifeq          857
       844: aload_3
       845: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       848: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       851: iconst_3
       852: invokestatic  #269                // Method java/lang/Math.min:(II)I
       855: istore        7
       857: invokestatic  #275                // Method ext/mods/gameserver/data/manager/FenceManager.getInstance:()Lext/mods/gameserver/data/manager/FenceManager;
       860: aload_2
       861: invokevirtual #280                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       864: aload_2
       865: invokevirtual #281                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       868: aload_2
       869: invokevirtual #282                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       872: iload         4
       874: iload         5
       876: iload         6
       878: iload         7
       880: invokevirtual #283                // Method ext/mods/gameserver/data/manager/FenceManager.addFence:(IIIIIII)Lext/mods/gameserver/model/actor/instance/Fence;
       883: pop
       884: aload_2
       885: invokestatic  #287                // Method listFences:(Lext/mods/gameserver/model/actor/Player;)V
       888: goto          900
       891: astore        4
       893: aload_2
       894: ldc_w         #291                // String Usage: //spawnfence <type> <width> <length> [height]
       897: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       900: goto          1880
       903: aload_1
       904: ldc_w         #296                // String admin_deletefence
       907: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       910: ifeq          1003
       913: new           #15                 // class java/util/StringTokenizer
       916: dup
       917: aload_1
       918: ldc           #17                 // String
       920: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       923: astore_3
       924: aload_3
       925: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       928: pop
       929: invokestatic  #80                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       932: aload_3
       933: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       936: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       939: invokevirtual #298                // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
       942: astore        4
       944: aload         4
       946: instanceof    #302                // class ext/mods/gameserver/model/actor/instance/Fence
       949: ifeq          981
       952: aload         4
       954: checkcast     #302                // class ext/mods/gameserver/model/actor/instance/Fence
       957: astore        5
       959: invokestatic  #275                // Method ext/mods/gameserver/data/manager/FenceManager.getInstance:()Lext/mods/gameserver/data/manager/FenceManager;
       962: aload         5
       964: invokevirtual #304                // Method ext/mods/gameserver/data/manager/FenceManager.removeFence:(Lext/mods/gameserver/model/actor/instance/Fence;)V
       967: aload_3
       968: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       971: ifeq          988
       974: aload_2
       975: invokestatic  #287                // Method listFences:(Lext/mods/gameserver/model/actor/Player;)V
       978: goto          988
       981: aload_2
       982: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       985: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       988: goto          1000
       991: astore        4
       993: aload_2
       994: ldc_w         #308                // String Usage: //deletefence <objectId>
       997: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1000: goto          1880
      1003: aload_1
      1004: ldc_w         #310                // String admin_listfence
      1007: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1010: ifeq          1020
      1013: aload_2
      1014: invokestatic  #287                // Method listFences:(Lext/mods/gameserver/model/actor/Player;)V
      1017: goto          1880
      1020: aload_1
      1021: ldc_w         #312                // String admin_spawn
      1024: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1027: ifeq          1216
      1030: new           #15                 // class java/util/StringTokenizer
      1033: dup
      1034: aload_1
      1035: ldc           #17                 // String
      1037: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      1040: astore_3
      1041: aload_3
      1042: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1045: astore        4
      1047: aload_3
      1048: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1051: astore        5
      1053: aload_3
      1054: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1057: ifeq          1070
      1060: aload_3
      1061: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1064: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1067: goto          1072
      1070: bipush        60
      1072: istore        6
      1074: aload_0
      1075: ldc_w         #314                // class ext/mods/gameserver/model/WorldObject
      1078: aload_2
      1079: iconst_1
      1080: invokevirtual #38                 // Method getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
      1083: astore        7
      1085: aload         5
      1087: ldc_w         #316                // String [0-9]*
      1090: invokevirtual #318                // Method java/lang/String.matches:(Ljava/lang/String;)Z
      1093: ifeq          1112
      1096: invokestatic  #65                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
      1099: aload         5
      1101: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1104: invokevirtual #321                // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
      1107: astore        8
      1109: goto          1129
      1112: invokestatic  #65                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
      1115: aload         5
      1117: bipush        95
      1119: bipush        32
      1121: invokevirtual #325                // Method java/lang/String.replace:(CC)Ljava/lang/String;
      1124: invokevirtual #71                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
      1127: astore        8
      1129: new           #329                // class ext/mods/gameserver/model/spawn/Spawn
      1132: dup
      1133: aload         8
      1135: invokespecial #331                // Method ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
      1138: astore        9
      1140: aload         9
      1142: aload         7
      1144: invokevirtual #334                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
      1147: invokevirtual #335                // Method ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
      1150: aload         9
      1152: iload         6
      1154: invokevirtual #339                // Method ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
      1157: aload         9
      1159: iconst_0
      1160: invokevirtual #342                // Method ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
      1163: pop
      1164: invokestatic  #238                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
      1167: aload         9
      1169: iconst_1
      1170: invokevirtual #346                // Method ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;Z)V
      1173: aload_2
      1174: aload         8
      1176: invokevirtual #350                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
      1179: aload         4
      1181: invokedynamic #353,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1186: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1189: goto          1201
      1192: astore        9
      1194: aload_2
      1195: getstatic     #356                // Field ext/mods/gameserver/network/SystemMessageId.APPLICANT_INFORMATION_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
      1198: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1201: goto          1213
      1204: astore        4
      1206: aload_0
      1207: aload_2
      1208: ldc           #198                // String spawns.htm
      1210: invokevirtual #200                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1213: goto          1880
      1216: aload_1
      1217: ldc_w         #359                // String admin_delete
      1220: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1223: ifeq          1880
      1226: aload_2
      1227: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
      1230: astore_3
      1231: aload_3
      1232: instanceof    #36                 // class ext/mods/gameserver/model/actor/Npc
      1235: ifeq          1247
      1238: aload_3
      1239: checkcast     #36                 // class ext/mods/gameserver/model/actor/Npc
      1242: astore        4
      1244: goto          1255
      1247: aload_2
      1248: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1251: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1254: return
      1255: aload         4
      1257: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
      1260: astore        5
      1262: aload         5
      1264: instanceof    #364                // class ext/mods/gameserver/model/spawn/MultiSpawn
      1267: ifeq          1796
      1270: aload         5
      1272: checkcast     #364                // class ext/mods/gameserver/model/spawn/MultiSpawn
      1275: astore        6
      1277: aload         6
      1279: invokevirtual #366                // Method ext/mods/gameserver/model/spawn/MultiSpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
      1282: invokevirtual #370                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
      1285: ldc_w         #371                // String (\\s|\')+
      1288: ldc_w         #373                // String
      1291: invokevirtual #375                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1294: invokevirtual #378                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
      1297: aload         6
      1299: invokevirtual #381                // Method ext/mods/gameserver/model/spawn/MultiSpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
      1302: invokevirtual #384                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
      1305: aload         6
      1307: invokevirtual #381                // Method ext/mods/gameserver/model/spawn/MultiSpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
      1310: invokevirtual #387                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
      1313: invokedynamic #388,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
      1318: astore        7
      1320: aload         6
      1322: invokevirtual #366                // Method ext/mods/gameserver/model/spawn/MultiSpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
      1325: invokevirtual #370                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
      1328: ldc_w         #371                // String (\\s|\')+
      1331: ldc_w         #373                // String
      1334: invokevirtual #375                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1337: invokevirtual #378                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
      1340: aload         6
      1342: invokevirtual #381                // Method ext/mods/gameserver/model/spawn/MultiSpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
      1345: invokevirtual #384                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
      1348: aload         6
      1350: invokevirtual #381                // Method ext/mods/gameserver/model/spawn/MultiSpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
      1353: invokevirtual #387                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
      1356: invokedynamic #391,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
      1361: astore        8
      1363: aload         6
      1365: invokevirtual #366                // Method ext/mods/gameserver/model/spawn/MultiSpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
      1368: invokevirtual #370                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
      1371: ldc_w         #371                // String (\\s|\')+
      1374: ldc_w         #373                // String
      1377: invokevirtual #375                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1380: invokevirtual #378                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
      1383: astore        9
      1385: aload         5
      1387: invokevirtual #392                // Method ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
      1390: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
      1393: ldc_w         #393                // int -131072
      1396: isub
      1397: bipush        15
      1399: ishr
      1400: bipush        16
      1402: iadd
      1403: istore        10
      1405: aload         5
      1407: invokevirtual #392                // Method ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
      1410: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
      1413: ldc_w         #394                // int -262144
      1416: isub
      1417: bipush        15
      1419: ishr
      1420: bipush        10
      1422: iadd
      1423: istore        11
      1425: new           #395                // class java/io/File
      1428: dup
      1429: getstatic     #397                // Field OTHER_XML_FOLDER:Ljava/lang/String;
      1432: aload         9
      1434: iload         10
      1436: iload         11
      1438: invokedynamic #401,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
      1443: invokespecial #404                // Method java/io/File."<init>":(Ljava/lang/String;)V
      1446: astore        12
      1448: aload         12
      1450: invokevirtual #406                // Method java/io/File.exists:()Z
      1453: ifne          1464
      1456: aload_2
      1457: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1460: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1463: return
      1464: aload         6
      1466: invokevirtual #409                // Method ext/mods/gameserver/model/spawn/MultiSpawn.doDelete:()V
      1469: new           #395                // class java/io/File
      1472: dup
      1473: getstatic     #397                // Field OTHER_XML_FOLDER:Ljava/lang/String;
      1476: aload         9
      1478: iload         10
      1480: iload         11
      1482: invokedynamic #412,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
      1487: invokespecial #404                // Method java/io/File."<init>":(Ljava/lang/String;)V
      1490: astore        13
      1492: new           #413                // class java/io/BufferedReader
      1495: dup
      1496: new           #415                // class java/io/FileReader
      1499: dup
      1500: aload         12
      1502: invokespecial #417                // Method java/io/FileReader."<init>":(Ljava/io/File;)V
      1505: invokespecial #420                // Method java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
      1508: astore        14
      1510: new           #423                // class java/io/BufferedWriter
      1513: dup
      1514: new           #425                // class java/io/FileWriter
      1517: dup
      1518: aload         13
      1520: invokespecial #427                // Method java/io/FileWriter."<init>":(Ljava/io/File;)V
      1523: invokespecial #428                // Method java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
      1526: astore        15
      1528: iconst_0
      1529: istore        17
      1531: iconst_0
      1532: istore        18
      1534: iconst_0
      1535: istore        19
      1537: aload         14
      1539: invokevirtual #431                // Method java/io/BufferedReader.readLine:()Ljava/lang/String;
      1542: dup
      1543: astore        16
      1545: ifnull        1660
      1548: aload         16
      1550: aload         7
      1552: invokedynamic #434,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1557: invokevirtual #437                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
      1560: ifeq          1566
      1563: iconst_1
      1564: istore        17
      1566: aload         16
      1568: aload         8
      1570: invokedynamic #441,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1575: invokevirtual #437                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
      1578: ifeq          1584
      1581: iconst_1
      1582: istore        18
      1584: iload         17
      1586: ifne          1594
      1589: iload         18
      1591: ifeq          1645
      1594: aload         16
      1596: ldc_w         #442                // String </territory>
      1599: invokevirtual #437                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
      1602: ifne          1616
      1605: aload         16
      1607: ldc_w         #444                // String </npcmaker>
      1610: invokevirtual #437                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
      1613: ifeq          1639
      1616: iconst_0
      1617: istore        17
      1619: iconst_0
      1620: istore        18
      1622: iload         19
      1624: ifne          1639
      1627: aload         15
      1629: aload         16
      1631: invokedynamic #446,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1636: invokevirtual #447                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
      1639: iconst_1
      1640: istore        19
      1642: goto          1537
      1645: aload         15
      1647: aload         16
      1649: invokedynamic #446,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1654: invokevirtual #447                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
      1657: goto          1537
      1660: aload         15
      1662: invokevirtual #450                // Method java/io/BufferedWriter.close:()V
      1665: aload         14
      1667: invokevirtual #453                // Method java/io/BufferedReader.close:()V
      1670: iload         19
      1672: ifeq          1692
      1675: aload         12
      1677: invokevirtual #454                // Method java/io/File.delete:()Z
      1680: pop
      1681: aload         13
      1683: aload         12
      1685: invokevirtual #457                // Method java/io/File.renameTo:(Ljava/io/File;)Z
      1688: pop
      1689: goto          1698
      1692: aload         13
      1694: invokevirtual #454                // Method java/io/File.delete:()Z
      1697: pop
      1698: aload         15
      1700: invokevirtual #450                // Method java/io/BufferedWriter.close:()V
      1703: goto          1728
      1706: astore        16
      1708: aload         15
      1710: invokevirtual #450                // Method java/io/BufferedWriter.close:()V
      1713: goto          1725
      1716: astore        17
      1718: aload         16
      1720: aload         17
      1722: invokevirtual #463                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1725: aload         16
      1727: athrow
      1728: aload         14
      1730: invokevirtual #453                // Method java/io/BufferedReader.close:()V
      1733: goto          1758
      1736: astore        15
      1738: aload         14
      1740: invokevirtual #453                // Method java/io/BufferedReader.close:()V
      1743: goto          1755
      1746: astore        16
      1748: aload         15
      1750: aload         16
      1752: invokevirtual #463                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1755: aload         15
      1757: athrow
      1758: goto          1779
      1761: astore        14
      1763: getstatic     #467                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1766: aload         14
      1768: invokestatic  #471                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1771: invokedynamic #474,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1776: invokevirtual #475                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
      1779: aload         12
      1781: invokestatic  #481                // Method ext/mods/gameserver/data/manager/SpawnManager.isEmptyXml:(Ljava/io/File;)Z
      1784: ifeq          1793
      1787: aload         12
      1789: invokevirtual #454                // Method java/io/File.delete:()Z
      1792: pop
      1793: goto          1880
      1796: aload         5
      1798: instanceof    #329                // class ext/mods/gameserver/model/spawn/Spawn
      1801: ifne          1812
      1804: aload_2
      1805: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1808: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1811: return
      1812: aload         5
      1814: checkcast     #329                // class ext/mods/gameserver/model/spawn/Spawn
      1817: astore        7
      1819: aload         7
      1821: iconst_0
      1822: invokevirtual #339                // Method ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
      1825: aload         4
      1827: invokevirtual #484                // Method ext/mods/gameserver/model/actor/Npc.cancelRespawn:()V
      1830: aload         4
      1832: iconst_0
      1833: invokevirtual #487                // Method ext/mods/gameserver/model/actor/Npc.setReadyForRespawn:(Z)V
      1836: aload         4
      1838: invokevirtual #491                // Method ext/mods/gameserver/model/actor/Npc.deleteMe:()V
      1841: invokestatic  #238                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
      1844: aload         5
      1846: checkcast     #329                // class ext/mods/gameserver/model/spawn/Spawn
      1849: iconst_0
      1850: invokevirtual #494                // Method ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;Z)V
      1853: invokestatic  #238                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
      1856: aload         7
      1858: invokevirtual #497                // Method ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
      1861: aload         7
      1863: invokevirtual #500                // Method ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
      1866: aload_2
      1867: aload         4
      1869: invokevirtual #370                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
      1872: invokedynamic #501,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1877: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1880: return
      Exception table:
         from    to  target type
           555   564   567   Class java/util/NoSuchElementException
           538   577   580   Class java/lang/Exception
           645   654   657   Class java/util/NoSuchElementException
           631   667   670   Class java/lang/Exception
           790   888   891   Class java/lang/Exception
           929   988   991   Class java/lang/Exception
          1129  1189  1192   Class java/lang/Exception
          1041  1201  1204   Class java/lang/Exception
          1528  1698  1706   Class java/lang/Throwable
          1708  1713  1716   Class java/lang/Throwable
          1510  1728  1736   Class java/lang/Throwable
          1738  1743  1746   Class java/lang/Throwable
          1492  1758  1761   Class java/lang/Exception
      LineNumberTable:
        line 74: 0
        line 76: 9
        line 77: 20
        line 79: 25
        line 81: 28
        line 82: 45
        line 84: 65
        line 86: 70
        line 87: 83
        line 89: 88
        line 90: 95
        line 93: 96
        line 94: 103
        line 95: 106
        line 96: 114
        line 99: 124
        line 100: 134
        line 101: 139
        line 104: 146
        line 106: 151
        line 107: 158
        line 110: 159
        line 112: 170
        line 113: 196
        line 115: 210
        line 117: 239
        line 118: 265
        line 120: 338
        line 121: 345
        line 122: 350
        line 124: 385
        line 126: 417
        line 128: 431
        line 129: 434
        line 131: 437
        line 132: 444
        line 133: 456
        line 135: 470
        line 136: 480
        line 137: 490
        line 138: 496
        line 139: 499
        line 140: 508
        line 141: 518
        line 143: 527
        line 146: 538
        line 147: 543
        line 148: 552
        line 151: 555
        line 155: 564
        line 153: 567
        line 156: 569
        line 161: 577
        line 158: 580
        line 160: 582
        line 162: 589
        line 163: 592
        line 164: 601
        line 165: 611
        line 167: 620
        line 170: 631
        line 171: 636
        line 172: 642
        line 175: 645
        line 179: 654
        line 177: 657
        line 180: 659
        line 185: 667
        line 182: 670
        line 184: 672
        line 186: 679
        line 187: 682
        line 189: 691
        line 190: 700
        line 191: 706
        line 192: 712
        line 194: 723
        line 196: 733
        line 197: 739
        line 199: 745
        line 200: 751
        line 201: 757
        line 203: 769
        line 205: 779
        line 208: 790
        line 209: 795
        line 210: 804
        line 211: 819
        line 212: 834
        line 213: 837
        line 214: 844
        line 216: 857
        line 218: 884
        line 223: 888
        line 220: 891
        line 222: 893
        line 224: 900
        line 225: 903
        line 227: 913
        line 228: 924
        line 231: 929
        line 232: 944
        line 234: 959
        line 236: 967
        line 237: 974
        line 240: 981
        line 245: 988
        line 242: 991
        line 244: 993
        line 246: 1000
        line 247: 1003
        line 248: 1013
        line 249: 1020
        line 251: 1030
        line 254: 1041
        line 255: 1047
        line 256: 1053
        line 258: 1074
        line 262: 1085
        line 263: 1096
        line 265: 1112
        line 269: 1129
        line 270: 1140
        line 271: 1150
        line 272: 1157
        line 273: 1164
        line 275: 1173
        line 280: 1189
        line 277: 1192
        line 279: 1194
        line 285: 1201
        line 282: 1204
        line 284: 1206
        line 286: 1213
        line 287: 1216
        line 289: 1226
        line 290: 1231
        line 292: 1247
        line 293: 1254
        line 296: 1255
        line 297: 1262
        line 299: 1277
        line 300: 1320
        line 301: 1363
        line 303: 1385
        line 304: 1405
        line 306: 1425
        line 308: 1448
        line 310: 1456
        line 311: 1463
        line 314: 1464
        line 316: 1469
        line 318: 1492
        line 319: 1510
        line 322: 1528
        line 323: 1531
        line 324: 1534
        line 326: 1537
        line 328: 1548
        line 329: 1563
        line 331: 1566
        line 332: 1581
        line 334: 1584
        line 336: 1594
        line 338: 1616
        line 339: 1619
        line 340: 1622
        line 341: 1627
        line 343: 1639
        line 346: 1645
        line 349: 1660
        line 350: 1665
        line 352: 1670
        line 354: 1675
        line 355: 1681
        line 358: 1692
        line 359: 1698
        line 318: 1706
        line 359: 1728
        line 318: 1736
        line 363: 1758
        line 360: 1761
        line 362: 1763
        line 365: 1779
        line 366: 1787
        line 367: 1793
        line 370: 1796
        line 372: 1804
        line 373: 1811
        line 375: 1812
        line 376: 1819
        line 377: 1825
        line 379: 1830
        line 381: 1836
        line 383: 1841
        line 385: 1853
        line 387: 1861
        line 389: 1866
        line 394: 1880
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           83      20     7   npc   Lext/mods/gameserver/model/actor/Npc;
          134      12     7 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
          345      89    11 spawn   Lext/mods/gameserver/model/spawn/ASpawn;
          239     195    10   npc   Lext/mods/gameserver/model/actor/Npc;
           20     476     3    st   Ljava/util/StringTokenizer;
           28     468     4 npcId   I
           45     451     5 entry   Ljava/lang/String;
           65     431     6  page   I
          170     326     7   row   I
          196     300     8  list   Lext/mods/commons/data/Pagination;
          480      16     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          552      25     4 level   I
          555      22     5  from   I
          582       7     4     e   Ljava/lang/Exception;
          538      51     3    st   Ljava/util/StringTokenizer;
          642      25     4 letter   Ljava/lang/String;
          645      22     5  from   I
          672       7     4     e   Ljava/lang/Exception;
          631      48     3    st   Ljava/util/StringTokenizer;
          804      84     4  type   I
          819      69     5 sizeX   I
          834      54     6 sizeY   I
          837      51     7 height   I
          893       7     4     e   Ljava/lang/Exception;
          790     110     3    st   Ljava/util/StringTokenizer;
          959      22     5 fence   Lext/mods/gameserver/model/actor/instance/Fence;
          944      44     4 worldObject   Lext/mods/gameserver/model/WorldObject;
          993       7     4     e   Ljava/lang/Exception;
          924      76     3    st   Ljava/util/StringTokenizer;
         1109       3     8 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
         1140      49     9 spawn   Lext/mods/gameserver/model/spawn/Spawn;
         1194       7     9     e   Ljava/lang/Exception;
         1047     154     4   cmd   Ljava/lang/String;
         1053     148     5 idOrName   Ljava/lang/String;
         1074     127     6 respawnTime   I
         1085     116     7 targetWorldObject   Lext/mods/gameserver/model/WorldObject;
         1129      72     8 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
         1206       7     4     e   Ljava/lang/Exception;
         1041     172     3    st   Ljava/util/StringTokenizer;
         1244       3     4 targetNpc   Lext/mods/gameserver/model/actor/Npc;
         1545     153    16 currentLine   Ljava/lang/String;
         1531     167    17 inTerritory   Z
         1534     164    18 inNpcMaker   Z
         1537     161    19 needToDelete   Z
         1528     200    15 writer   Ljava/io/BufferedWriter;
         1510     248    14 reader   Ljava/io/BufferedReader;
         1763      16    14     e   Ljava/lang/Exception;
         1320     473     7  name   Ljava/lang/String;
         1363     430     8 npcMakerName   Ljava/lang/String;
         1385     408     9 fileName   Ljava/lang/String;
         1405     388    10     x   I
         1425     368    11     y   I
         1448     345    12 spawnFile   Ljava/io/File;
         1492     301    13 tempFile   Ljava/io/File;
         1277     519     6 multi   Lext/mods/gameserver/model/spawn/MultiSpawn;
         1819      61     7 spawnObj   Lext/mods/gameserver/model/spawn/Spawn;
         1231     649     3 targetWorldObject   Lext/mods/gameserver/model/WorldObject;
         1255     625     4 targetNpc   Lext/mods/gameserver/model/actor/Npc;
         1262     618     5 spawn   Lext/mods/gameserver/model/spawn/ASpawn;
            0    1881     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSpawn;
            0    1881     1 command   Ljava/lang/String;
            0    1881     2 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          196     300     8  list   Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/actor/Npc;>;
      StackMapTable: number_of_entries = 76
        frame_type = 253 /* append */
          offset_delta = 42
          locals = [ class java/util/StringTokenizer, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ int, class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 17 /* same */
        frame_type = 21 /* same */
        frame_type = 12 /* same */
        frame_type = 254 /* append */
          offset_delta = 57
          locals = [ int, class ext/mods/commons/data/Pagination, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, class java/lang/String, int, int, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/model/actor/Npc ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, class java/lang/String, int, int, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/model/actor/Npc ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 123
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn ]
        frame_type = 31 /* same */
        frame_type = 248 /* chop */
          offset_delta = 19
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, int ]
          stack = [ class java/util/NoSuchElementException ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = [ class java/util/NoSuchElementException ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 40 /* same */
        frame_type = 45 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 87
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 77
          locals = [ class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 16 /* same */
        frame_type = 254 /* append */
          offset_delta = 49
          locals = [ class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ int, class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 126 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 255 /* full_frame */
          offset_delta = 208
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/spawn/MultiSpawn, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 72
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/spawn/MultiSpawn, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter, top, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/spawn/MultiSpawn, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter, class java/lang/String, int, int, int ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 9 /* same */
        frame_type = 21 /* same */
        frame_type = 22 /* same */
        frame_type = 5 /* same */
        frame_type = 14 /* same */
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/spawn/MultiSpawn, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter ]
          stack = []
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/spawn/MultiSpawn, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/spawn/MultiSpawn, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/spawn/ASpawn, class ext/mods/gameserver/model/spawn/MultiSpawn ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 15 /* same */
        frame_type = 248 /* chop */
          offset_delta = 67

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #574                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 456: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSpawn;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: getstatic     #589                // Field ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
         3: ldc_w         #595                // String xml/spawnlist/custom
         6: invokeinterface #597,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        11: invokeinterface #603,  1          // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
        16: putstatic     #397                // Field OTHER_XML_FOLDER:Ljava/lang/String;
        19: bipush        13
        21: anewarray     #10                 // class java/lang/String
        24: dup
        25: iconst_0
        26: ldc           #7                  // String admin_list_spawns
        28: aastore
        29: dup
        30: iconst_1
        31: ldc           #192                // String admin_show_spawns
        33: aastore
        34: dup
        35: iconst_2
        36: ldc_w         #312                // String admin_spawn
        39: aastore
        40: dup
        41: iconst_3
        42: ldc_w         #359                // String admin_delete
        45: aastore
        46: dup
        47: iconst_4
        48: ldc           #204                // String admin_spawn_index
        50: aastore
        51: dup
        52: iconst_5
        53: ldc           #224                // String admin_unspawnall
        55: aastore
        56: dup
        57: bipush        6
        59: ldc_w         #259                // String admin_respawnall
        62: aastore
        63: dup
        64: bipush        7
        66: ldc           #218                // String admin_npc_index
        68: aastore
        69: dup
        70: bipush        8
        72: ldc_w         #604                // String admin_spawn_once
        75: aastore
        76: dup
        77: bipush        9
        79: ldc           #214                // String admin_show_npcs
        81: aastore
        82: dup
        83: bipush        10
        85: ldc_w         #267                // String admin_spawnfence
        88: aastore
        89: dup
        90: bipush        11
        92: ldc_w         #296                // String admin_deletefence
        95: aastore
        96: dup
        97: bipush        12
        99: ldc_w         #310                // String admin_listfence
       102: aastore
       103: putstatic     #574                // Field ADMIN_COMMANDS:[Ljava/lang/String;
       106: return
      LineNumberTable:
        line 52: 0
        line 54: 19
}
SourceFile: "AdminSpawn.java"
BootstrapMethods:
  0: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #699 bypass admin_list_spawns \u0001 %page%
  1: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #701 You spawned \u0001. - Cmd: \u0001
  2: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #703 \u0001_\u0001\u0001
  3: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #705 \u0001_\u0001\u00011
  4: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #707 \u0001/\u0001_\u0001_\u0001.xml
  5: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #709 \u0001/\u0001_\u0001_\u0001.tmp
  6: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #711 <territory name=\"\u0001
  7: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #713 <npcmaker name=\"\u0001
  8: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #715 \u0001\n
  9: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #717 Could not remove spawn from the spawn XML files: \u0001
  10: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #719 You deleted \u0001 (respawn prevented).
  11: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #721 <html><body>Total Fences: \u0001<br><br>
  12: #734 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #723 <a action=\"bypass -h admin_deletefence \u0001 1\">Fence: \u0001 [\u0001 \u0001 \u0001]</a><br>
  13: #740 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #725 (Ljava/lang/Object;)Z
      #726 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.lambda$showMonsters$0:(ILext/mods/gameserver/model/actor/template/NpcTemplate;)Z
      #729 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  14: #740 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #725 (Ljava/lang/Object;)Z
      #731 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminSpawn.lambda$showNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
      #729 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
InnerClasses:
  public static final #752= #748 of #750; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
