// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.RouletteVoiced
// File: ext\mods\gameserver\handler\voicedcommandhandlers\RouletteVoiced.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.class
  Last modified 9 de jul de 2026; size 9900 bytes
  MD5 checksum cb8e74717461c61dd03daaf258a16850
  Compiled from "RouletteVoiced.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.RouletteVoiced implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 13, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced._nextUse:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced
   #12 = NameAndType        #14:#15       // _nextUse:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced
   #14 = Utf8               _nextUse
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced._activeTasks:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _activeTasks:Ljava/util/Map;
   #18 = Utf8               _activeTasks
   #19 = String             #20           // roulette
   #20 = Utf8               roulette
   #21 = Methodref          #22.#23       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #22 = Class              #24           // java/lang/String
   #23 = NameAndType        #25:#26       // startsWith:(Ljava/lang/String;)Z
   #24 = Utf8               java/lang/String
   #25 = Utf8               startsWith
   #26 = Utf8               (Ljava/lang/String;)Z
   #27 = Methodref          #11.#28       // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.navi:(Lext/mods/gameserver/model/actor/Player;)V
   #28 = NameAndType        #29:#30       // navi:(Lext/mods/gameserver/model/actor/Player;)V
   #29 = Utf8               navi
   #30 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #31 = String             #32           // spin
   #32 = Utf8               spin
   #33 = Methodref          #11.#34       // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.trySpin:(Lext/mods/gameserver/model/actor/Player;)V
   #34 = NameAndType        #35:#30       // trySpin:(Lext/mods/gameserver/model/actor/Player;)V
   #35 = Utf8               trySpin
   #36 = Class              #37           // java/lang/StringBuilder
   #37 = Utf8               java/lang/StringBuilder
   #38 = Methodref          #36.#3        // java/lang/StringBuilder."<init>":()V
   #39 = String             #40           // <html><body><center>
   #40 = Utf8               <html><body><center>
   #41 = Methodref          #36.#42       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #42 = NameAndType        #43:#44       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #43 = Utf8               append
   #44 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #45 = String             #46           // <table width=280 bgcolor=000000>
   #46 = Utf8               <table width=280 bgcolor=000000>
   #47 = String             #48           // <tr><td align=center><font color=\"LEVEL\">Lucky Roulette</font></td></tr>
   #48 = Utf8               <tr><td align=center><font color=\"LEVEL\">Lucky Roulette</font></td></tr>
   #49 = String             #50           // </table><br>
   #50 = Utf8               </table><br>
   #51 = String             #52           // <table width=250><tr><td align=center>
   #52 = Utf8               <table width=250><tr><td align=center>
   #53 = String             #54           // <img src=\"sek.cbui183\" width=64 height=64><br1>
   #54 = Utf8               <img src=\"sek.cbui183\" width=64 height=64><br1>
   #55 = String             #56           // <font color=\"LEVEL\">Spin and win amazing prizes!</font><br>
   #56 = Utf8               <font color=\"LEVEL\">Spin and win amazing prizes!</font><br>
   #57 = String             #58           // <font color=\"FFFFFF\">Cost to spin: <font color=\"LEVEL\">10.000 Adena</font></font><br1>
   #58 = Utf8               <font color=\"FFFFFF\">Cost to spin: <font color=\"LEVEL\">10.000 Adena</font></font><br1>
   #59 = String             #60           // <font color=\"999999\">(Can re-spin every 5 seconds)</font>
   #60 = Utf8               <font color=\"999999\">(Can re-spin every 5 seconds)</font>
   #61 = String             #62           // </td></tr></table><br>
   #62 = Utf8               </td></tr></table><br>
   #63 = String             #64           // <button value=\"Spin Roulette\" action=\"bypass -h voiced_spin\" width=75 height=16 back=\"sek.cbui307\" fore=\"sek.cbui308\">
   #64 = Utf8               <button value=\"Spin Roulette\" action=\"bypass -h voiced_spin\" width=75 height=16 back=\"sek.cbui307\" fore=\"sek.cbui308\">
   #65 = String             #66           // <br><br><table width=280 bgcolor=000000>
   #66 = Utf8               <br><br><table width=280 bgcolor=000000>
   #67 = String             #68           // <tr><td align=center><font color=\"999999\">Good luck!</font></td></tr>
   #68 = Utf8               <tr><td align=center><font color=\"999999\">Good luck!</font></td></tr>
   #69 = String             #70           // </table>
   #70 = Utf8               </table>
   #71 = String             #72           // </center></body></html>
   #72 = Utf8               </center></body></html>
   #73 = Class              #74           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #74 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #75 = Methodref          #73.#76       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #76 = NameAndType        #5:#77        // "<init>":(I)V
   #77 = Utf8               (I)V
   #78 = Methodref          #36.#79       // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #79 = NameAndType        #80:#81       // toString:()Ljava/lang/String;
   #80 = Utf8               toString
   #81 = Utf8               ()Ljava/lang/String;
   #82 = Methodref          #73.#83       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
   #83 = NameAndType        #84:#85       // setHtml:(Ljava/lang/String;)V
   #84 = Utf8               setHtml
   #85 = Utf8               (Ljava/lang/String;)V
   #86 = Methodref          #87.#88       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = Class              #89           // ext/mods/gameserver/model/actor/Player
   #88 = NameAndType        #90:#91       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #89 = Utf8               ext/mods/gameserver/model/actor/Player
   #90 = Utf8               sendPacket
   #91 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = Methodref          #87.#93       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #93 = NameAndType        #94:#95       // getObjectId:()I
   #94 = Utf8               getObjectId
   #95 = Utf8               ()I
   #96 = Methodref          #97.#98       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #97 = Class              #99           // java/lang/Integer
   #98 = NameAndType        #100:#101     // valueOf:(I)Ljava/lang/Integer;
   #99 = Utf8               java/lang/Integer
  #100 = Utf8               valueOf
  #101 = Utf8               (I)Ljava/lang/Integer;
  #102 = InterfaceMethodref #103.#104     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #103 = Class              #105          // java/util/Map
  #104 = NameAndType        #106:#107     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #105 = Utf8               java/util/Map
  #106 = Utf8               get
  #107 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #108 = Class              #109          // java/util/concurrent/ScheduledFuture
  #109 = Utf8               java/util/concurrent/ScheduledFuture
  #110 = InterfaceMethodref #108.#111     // java/util/concurrent/ScheduledFuture.isDone:()Z
  #111 = NameAndType        #112:#113     // isDone:()Z
  #112 = Utf8               isDone
  #113 = Utf8               ()Z
  #114 = String             #115          // You are already spinning the roulette wheel!
  #115 = Utf8               You are already spinning the roulette wheel!
  #116 = Methodref          #87.#117      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #117 = NameAndType        #118:#85      // sendMessage:(Ljava/lang/String;)V
  #118 = Utf8               sendMessage
  #119 = InterfaceMethodref #103.#120     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #120 = NameAndType        #121:#122     // containsKey:(Ljava/lang/Object;)Z
  #121 = Utf8               containsKey
  #122 = Utf8               (Ljava/lang/Object;)Z
  #123 = Class              #124          // java/lang/Long
  #124 = Utf8               java/lang/Long
  #125 = Methodref          #123.#126     // java/lang/Long.longValue:()J
  #126 = NameAndType        #127:#128     // longValue:()J
  #127 = Utf8               longValue
  #128 = Utf8               ()J
  #129 = Methodref          #130.#131     // java/lang/System.currentTimeMillis:()J
  #130 = Class              #132          // java/lang/System
  #131 = NameAndType        #133:#128     // currentTimeMillis:()J
  #132 = Utf8               java/lang/System
  #133 = Utf8               currentTimeMillis
  #134 = String             #135          // You must wait before spinning again.
  #135 = Utf8               You must wait before spinning again.
  #136 = Methodref          #137.#138     // ext/mods/roulette/RouletteData.getInstance:()Lext/mods/roulette/RouletteData;
  #137 = Class              #139          // ext/mods/roulette/RouletteData
  #138 = NameAndType        #140:#141     // getInstance:()Lext/mods/roulette/RouletteData;
  #139 = Utf8               ext/mods/roulette/RouletteData
  #140 = Utf8               getInstance
  #141 = Utf8               ()Lext/mods/roulette/RouletteData;
  #142 = Methodref          #137.#143     // ext/mods/roulette/RouletteData.isUseAdena:()Z
  #143 = NameAndType        #144:#113     // isUseAdena:()Z
  #144 = Utf8               isUseAdena
  #145 = Methodref          #137.#146     // ext/mods/roulette/RouletteData.getAdenaCost:()I
  #146 = NameAndType        #147:#95      // getAdenaCost:()I
  #147 = Utf8               getAdenaCost
  #148 = Methodref          #87.#149      // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #149 = NameAndType        #150:#151     // reduceAdena:(IZ)Z
  #150 = Utf8               reduceAdena
  #151 = Utf8               (IZ)Z
  #152 = String             #153          // You don\'t have enough Adena!
  #153 = Utf8               You don\'t have enough Adena!
  #154 = Methodref          #87.#155      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #155 = NameAndType        #156:#157     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #156 = Utf8               getInventory
  #157 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #158 = Methodref          #137.#159     // ext/mods/roulette/RouletteData.getItemId:()I
  #159 = NameAndType        #160:#95      // getItemId:()I
  #160 = Utf8               getItemId
  #161 = Methodref          #137.#162     // ext/mods/roulette/RouletteData.getItemCount:()I
  #162 = NameAndType        #163:#95      // getItemCount:()I
  #163 = Utf8               getItemCount
  #164 = Methodref          #165.#166     // ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #165 = Class              #167          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #166 = NameAndType        #168:#169     // destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #167 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #168 = Utf8               destroyItemByItemId
  #169 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #170 = String             #171          // You don\'t have enough required items!
  #171 = Utf8               You don\'t have enough required items!
  #172 = Long               5000l
  #174 = Methodref          #123.#175     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #175 = NameAndType        #100:#176     // valueOf:(J)Ljava/lang/Long;
  #176 = Utf8               (J)Ljava/lang/Long;
  #177 = InterfaceMethodref #103.#178     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #178 = NameAndType        #179:#180     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #179 = Utf8               put
  #180 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #181 = Methodref          #11.#182      // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.startSpin:(Lext/mods/gameserver/model/actor/Player;)V
  #182 = NameAndType        #183:#30      // startSpin:(Lext/mods/gameserver/model/actor/Player;)V
  #183 = Utf8               startSpin
  #184 = InvokeDynamic      #0:#185       // #0:run:(Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #185 = NameAndType        #186:#187     // run:(Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #186 = Utf8               run
  #187 = Utf8               (Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #188 = Long               500l
  #190 = Long               1000l
  #192 = Methodref          #193.#194     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #193 = Class              #195          // ext/mods/commons/pool/ThreadPool
  #194 = NameAndType        #196:#197     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #195 = Utf8               ext/mods/commons/pool/ThreadPool
  #196 = Utf8               scheduleAtFixedRate
  #197 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #198 = InvokeDynamic      #1:#185       // #1:run:(Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #199 = Long               10000l
  #201 = Methodref          #193.#202     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #202 = NameAndType        #203:#204     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #203 = Utf8               schedule
  #204 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #205 = String             #206          // <font color=\"LEVEL\">Spinning...</font><br1>
  #206 = Utf8               <font color=\"LEVEL\">Spinning...</font><br1>
  #207 = String             #208          // <table width=300><tr>
  #208 = Utf8               <table width=300><tr>
  #209 = Methodref          #137.#210     // ext/mods/roulette/RouletteData.getRandomVisualItem:()Lext/mods/roulette/holder/RouletteHolder;
  #210 = NameAndType        #211:#212     // getRandomVisualItem:()Lext/mods/roulette/holder/RouletteHolder;
  #211 = Utf8               getRandomVisualItem
  #212 = Utf8               ()Lext/mods/roulette/holder/RouletteHolder;
  #213 = String             #214          // <td align=center>
  #214 = Utf8               <td align=center>
  #215 = Methodref          #216.#217     // ext/mods/roulette/holder/RouletteHolder.getId:()I
  #216 = Class              #218          // ext/mods/roulette/holder/RouletteHolder
  #217 = NameAndType        #219:#95      // getId:()I
  #218 = Utf8               ext/mods/roulette/holder/RouletteHolder
  #219 = Utf8               getId
  #220 = Methodref          #11.#221      // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.getItemIcon:(I)Ljava/lang/String;
  #221 = NameAndType        #222:#223     // getItemIcon:(I)Ljava/lang/String;
  #222 = Utf8               getItemIcon
  #223 = Utf8               (I)Ljava/lang/String;
  #224 = InvokeDynamic      #2:#225       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #225 = NameAndType        #226:#227     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #226 = Utf8               makeConcatWithConstants
  #227 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #228 = String             #229          // </td>
  #229 = Utf8               </td>
  #230 = String             #231          // <td align=center>?</td>
  #231 = Utf8               <td align=center>?</td>
  #232 = String             #233          // </tr></table>
  #233 = Utf8               </tr></table>
  #234 = String             #235          // <br><font color=LEVEL>Good luck!</font>
  #235 = Utf8               <br><font color=LEVEL>Good luck!</font>
  #236 = String             #237          // <font color=\"LEVEL\">You won!</font><br>
  #237 = Utf8               <font color=\"LEVEL\">You won!</font><br>
  #238 = InvokeDynamic      #3:#225       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #239 = Methodref          #11.#240      // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.getItemNameId:(I)Ljava/lang/String;
  #240 = NameAndType        #241:#223     // getItemNameId:(I)Ljava/lang/String;
  #241 = Utf8               getItemNameId
  #242 = InvokeDynamic      #4:#225       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #243 = Methodref          #216.#244     // ext/mods/roulette/holder/RouletteHolder.getCount:()I
  #244 = NameAndType        #245:#95      // getCount:()I
  #245 = Utf8               getCount
  #246 = InvokeDynamic      #5:#247       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #247 = NameAndType        #226:#223     // makeConcatWithConstants:(I)Ljava/lang/String;
  #248 = String             #249          // <br><button value=\"Spin Again\" action=\"bypass -h voiced_spin\" width=75 height=16 back=\"sek.cbui307\" fore=\"sek.cbui308\">
  #249 = Utf8               <br><button value=\"Spin Again\" action=\"bypass -h voiced_spin\" width=75 height=16 back=\"sek.cbui307\" fore=\"sek.cbui308\">
  #250 = Methodref          #251.#252     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #251 = Class              #253          // ext/mods/gameserver/data/xml/ItemData
  #252 = NameAndType        #140:#254     // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #253 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #254 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #255 = Methodref          #251.#256     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #256 = NameAndType        #257:#258     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #257 = Utf8               getTemplate
  #258 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #259 = Methodref          #260.#261     // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #260 = Class              #262          // ext/mods/gameserver/model/item/kind/Item
  #261 = NameAndType        #263:#81      // getIcon:()Ljava/lang/String;
  #262 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #263 = Utf8               getIcon
  #264 = String             #265          // Unknown Item
  #265 = Utf8               Unknown Item
  #266 = Methodref          #260.#267     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #267 = NameAndType        #268:#81      // getName:()Ljava/lang/String;
  #268 = Utf8               getName
  #269 = String             #270          // Icon.NOIMAGE
  #270 = Utf8               Icon.NOIMAGE
  #271 = Fieldref           #11.#272      // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced._voicedCommands:[Ljava/lang/String;
  #272 = NameAndType        #273:#274     // _voicedCommands:[Ljava/lang/String;
  #273 = Utf8               _voicedCommands
  #274 = Utf8               [Ljava/lang/String;
  #275 = Methodref          #137.#276     // ext/mods/roulette/RouletteData.getRandomItem:()Lext/mods/roulette/holder/RouletteHolder;
  #276 = NameAndType        #277:#212     // getRandomItem:()Lext/mods/roulette/holder/RouletteHolder;
  #277 = Utf8               getRandomItem
  #278 = InterfaceMethodref #103.#279     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #279 = NameAndType        #280:#107     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #280 = Utf8               remove
  #281 = InterfaceMethodref #108.#282     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #282 = NameAndType        #283:#284     // cancel:(Z)Z
  #283 = Utf8               cancel
  #284 = Utf8               (Z)Z
  #285 = Methodref          #216.#286     // ext/mods/roulette/holder/RouletteHolder.getEnchant:()I
  #286 = NameAndType        #287:#95      // getEnchant:()I
  #287 = Utf8               getEnchant
  #288 = Methodref          #165.#289     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #289 = NameAndType        #290:#169     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #290 = Utf8               addItem
  #291 = Methodref          #292.#293     // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #292 = Class              #294          // ext/mods/gameserver/model/item/instance/ItemInstance
  #293 = NameAndType        #295:#296     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #294 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #295 = Utf8               setEnchantLevel
  #296 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #297 = Methodref          #292.#298     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #298 = NameAndType        #299:#95      // getEnchantLevel:()I
  #299 = Utf8               getEnchantLevel
  #300 = Fieldref           #301.#302     // ext/mods/gameserver/network/SystemMessageId.S1_SUCCESSFULLY_ENCHANTED:Lext/mods/gameserver/network/SystemMessageId;
  #301 = Class              #303          // ext/mods/gameserver/network/SystemMessageId
  #302 = NameAndType        #304:#305     // S1_SUCCESSFULLY_ENCHANTED:Lext/mods/gameserver/network/SystemMessageId;
  #303 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #304 = Utf8               S1_SUCCESSFULLY_ENCHANTED
  #305 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #306 = Methodref          #307.#308     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #307 = Class              #309          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #308 = NameAndType        #310:#311     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #309 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #310 = Utf8               getSystemMessage
  #311 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #312 = Methodref          #292.#159     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #313 = Methodref          #307.#314     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #314 = NameAndType        #315:#316     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #315 = Utf8               addItemName
  #316 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #317 = Fieldref           #301.#318     // ext/mods/gameserver/network/SystemMessageId.S1_S2_SUCCESSFULLY_ENCHANTED:Lext/mods/gameserver/network/SystemMessageId;
  #318 = NameAndType        #319:#305     // S1_S2_SUCCESSFULLY_ENCHANTED:Lext/mods/gameserver/network/SystemMessageId;
  #319 = Utf8               S1_S2_SUCCESSFULLY_ENCHANTED
  #320 = Methodref          #307.#321     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #321 = NameAndType        #322:#316     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #322 = Utf8               addNumber
  #323 = Class              #324          // ext/mods/gameserver/network/serverpackets/ItemList
  #324 = Utf8               ext/mods/gameserver/network/serverpackets/ItemList
  #325 = Methodref          #323.#326     // ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #326 = NameAndType        #5:#327       // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #327 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #328 = Methodref          #11.#329      // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.showPrizeHtml:(Lext/mods/gameserver/model/actor/Player;Lext/mods/roulette/holder/RouletteHolder;)V
  #329 = NameAndType        #330:#331     // showPrizeHtml:(Lext/mods/gameserver/model/actor/Player;Lext/mods/roulette/holder/RouletteHolder;)V
  #330 = Utf8               showPrizeHtml
  #331 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/roulette/holder/RouletteHolder;)V
  #332 = Methodref          #11.#333      // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.sendRollingHtml:(Lext/mods/gameserver/model/actor/Player;)V
  #333 = NameAndType        #334:#30      // sendRollingHtml:(Lext/mods/gameserver/model/actor/Player;)V
  #334 = Utf8               sendRollingHtml
  #335 = Class              #336          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #336 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #337 = Utf8               Signature
  #338 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #339 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/ScheduledFuture<*>;>;
  #340 = Utf8               Code
  #341 = Utf8               LineNumberTable
  #342 = Utf8               LocalVariableTable
  #343 = Utf8               this
  #344 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;
  #345 = Utf8               useVoicedCommand
  #346 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #347 = Utf8               command
  #348 = Utf8               Ljava/lang/String;
  #349 = Utf8               player
  #350 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #351 = Utf8               params
  #352 = Utf8               StackMapTable
  #353 = Utf8               sb
  #354 = Utf8               Ljava/lang/StringBuilder;
  #355 = Utf8               html
  #356 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #357 = Utf8               activeTask
  #358 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #359 = Utf8               canSpin
  #360 = Utf8               Z
  #361 = Utf8               roleta
  #362 = Utf8               Lext/mods/roulette/RouletteData;
  #363 = Utf8               LocalVariableTypeTable
  #364 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #365 = Utf8               task
  #366 = Utf8               randomItem
  #367 = Utf8               Lext/mods/roulette/holder/RouletteHolder;
  #368 = Utf8               i
  #369 = Utf8               I
  #370 = Utf8               block
  #371 = Utf8               prize
  #372 = Utf8               itemId
  #373 = Utf8               item
  #374 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #375 = Utf8               getVoicedCommandList
  #376 = Utf8               ()[Ljava/lang/String;
  #377 = Utf8               lambda$startSpin$1
  #378 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #379 = Utf8               lambda$startSpin$0
  #380 = Utf8               <clinit>
  #381 = Utf8               SourceFile
  #382 = Utf8               RouletteVoiced.java
  #383 = Utf8               BootstrapMethods
  #384 = MethodType         #6            //  ()V
  #385 = MethodHandle       5:#386        // REF_invokeVirtual ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.lambda$startSpin$0:(Lext/mods/gameserver/model/actor/Player;)V
  #386 = Methodref          #11.#387      // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.lambda$startSpin$0:(Lext/mods/gameserver/model/actor/Player;)V
  #387 = NameAndType        #379:#30      // lambda$startSpin$0:(Lext/mods/gameserver/model/actor/Player;)V
  #388 = MethodHandle       5:#389        // REF_invokeVirtual ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.lambda$startSpin$1:(Lext/mods/gameserver/model/actor/Player;)V
  #389 = Methodref          #11.#390      // ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.lambda$startSpin$1:(Lext/mods/gameserver/model/actor/Player;)V
  #390 = NameAndType        #377:#30      // lambda$startSpin$1:(Lext/mods/gameserver/model/actor/Player;)V
  #391 = String             #392          // <img src=\"\u0001\" width=32 height=32>
  #392 = Utf8               <img src=\"\u0001\" width=32 height=32>
  #393 = String             #394          // <img src=\"\u0001\" width=32 height=32><br>
  #394 = Utf8               <img src=\"\u0001\" width=32 height=32><br>
  #395 = String             #396          // <font color=\"FFFFFF\">\u0001</font><br>
  #396 = Utf8               <font color=\"FFFFFF\">\u0001</font><br>
  #397 = String             #398          // <font color=\"LEVEL\">Amount:</font> <font color=\"FFFFFF\">\u0001</font><br>
  #398 = Utf8               <font color=\"LEVEL\">Amount:</font> <font color=\"FFFFFF\">\u0001</font><br>
  #399 = MethodHandle       6:#400        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #400 = Methodref          #401.#402     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #401 = Class              #403          // java/lang/invoke/LambdaMetafactory
  #402 = NameAndType        #404:#405     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #403 = Utf8               java/lang/invoke/LambdaMetafactory
  #404 = Utf8               metafactory
  #405 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #406 = MethodHandle       6:#407        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #407 = Methodref          #408.#409     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #408 = Class              #410          // java/lang/invoke/StringConcatFactory
  #409 = NameAndType        #226:#411     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #410 = Utf8               java/lang/invoke/StringConcatFactory
  #411 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #412 = Utf8               InnerClasses
  #413 = Class              #414          // java/lang/invoke/MethodHandles$Lookup
  #414 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #415 = Class              #416          // java/lang/invoke/MethodHandles
  #416 = Utf8               java/lang/invoke/MethodHandles
  #417 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.RouletteVoiced();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _nextUse:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/HashMap
        19: dup
        20: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        23: putfield      #16                 // Field _activeTasks:Ljava/util/Map;
        26: return
      LineNumberTable:
        line 39: 0
        line 41: 4
        line 42: 15
        line 44: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_2
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: ldc           #19                 // String roulette
         9: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        12: ifeq          19
        15: aload_2
        16: invokestatic  #27                 // Method navi:(Lext/mods/gameserver/model/actor/Player;)V
        19: aload_1
        20: ldc           #31                 // String spin
        22: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        25: ifeq          33
        28: aload_0
        29: aload_2
        30: invokevirtual #33                 // Method trySpin:(Lext/mods/gameserver/model/actor/Player;)V
        33: iconst_1
        34: ireturn
      LineNumberTable:
        line 53: 0
        line 54: 4
        line 56: 6
        line 58: 15
        line 61: 19
        line 63: 28
        line 65: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;
            0      35     1 command   Ljava/lang/String;
            0      35     2 player   Lext/mods/gameserver/model/actor/Player;
            0      35     3 params   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */

  public static void navi(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=3, args_size=1
         0: new           #36                 // class java/lang/StringBuilder
         3: dup
         4: invokespecial #38                 // Method java/lang/StringBuilder."<init>":()V
         7: astore_1
         8: aload_1
         9: ldc           #39                 // String <html><body><center>
        11: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        14: pop
        15: aload_1
        16: ldc           #45                 // String <table width=280 bgcolor=000000>
        18: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        21: ldc           #47                 // String <tr><td align=center><font color=\"LEVEL\">Lucky Roulette</font></td></tr>
        23: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        26: ldc           #49                 // String </table><br>
        28: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        31: pop
        32: aload_1
        33: ldc           #51                 // String <table width=250><tr><td align=center>
        35: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        38: ldc           #53                 // String <img src=\"sek.cbui183\" width=64 height=64><br1>
        40: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        43: ldc           #55                 // String <font color=\"LEVEL\">Spin and win amazing prizes!</font><br>
        45: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        48: ldc           #57                 // String <font color=\"FFFFFF\">Cost to spin: <font color=\"LEVEL\">10.000 Adena</font></font><br1>
        50: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        53: ldc           #59                 // String <font color=\"999999\">(Can re-spin every 5 seconds)</font>
        55: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        58: ldc           #61                 // String </td></tr></table><br>
        60: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        63: pop
        64: aload_1
        65: ldc           #63                 // String <button value=\"Spin Roulette\" action=\"bypass -h voiced_spin\" width=75 height=16 back=\"sek.cbui307\" fore=\"sek.cbui308\">
        67: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        70: pop
        71: aload_1
        72: ldc           #65                 // String <br><br><table width=280 bgcolor=000000>
        74: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        77: ldc           #67                 // String <tr><td align=center><font color=\"999999\">Good luck!</font></td></tr>
        79: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        82: ldc           #69                 // String </table>
        84: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        87: pop
        88: aload_1
        89: ldc           #71                 // String </center></body></html>
        91: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        94: pop
        95: new           #73                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        98: dup
        99: iconst_0
       100: invokespecial #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       103: astore_2
       104: aload_2
       105: aload_1
       106: invokevirtual #78                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       109: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       112: aload_0
       113: aload_2
       114: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       117: return
      LineNumberTable:
        line 70: 0
        line 72: 8
        line 74: 15
        line 76: 32
        line 78: 64
        line 80: 71
        line 82: 88
        line 84: 95
        line 85: 104
        line 86: 112
        line 87: 117
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     118     0 player   Lext/mods/gameserver/model/actor/Player;
            8     110     1    sb   Ljava/lang/StringBuilder;
          104      14     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;

  public void sendRollingHtml(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: new           #36                 // class java/lang/StringBuilder
         3: dup
         4: invokespecial #38                 // Method java/lang/StringBuilder."<init>":()V
         7: astore_2
         8: aload_2
         9: ldc           #39                 // String <html><body><center>
        11: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        14: pop
        15: aload_2
        16: ldc           #205                // String <font color=\"LEVEL\">Spinning...</font><br1>
        18: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        21: pop
        22: iconst_0
        23: istore_3
        24: iload_3
        25: bipush        8
        27: if_icmpge     121
        30: aload_2
        31: ldc           #207                // String <table width=300><tr>
        33: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        36: pop
        37: iconst_0
        38: istore        4
        40: iload         4
        42: iconst_5
        43: if_icmpge     108
        46: invokestatic  #136                // Method ext/mods/roulette/RouletteData.getInstance:()Lext/mods/roulette/RouletteData;
        49: invokevirtual #209                // Method ext/mods/roulette/RouletteData.getRandomVisualItem:()Lext/mods/roulette/holder/RouletteHolder;
        52: astore        5
        54: aload         5
        56: ifnull        95
        59: aload_2
        60: ldc           #213                // String <td align=center>
        62: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        65: pop
        66: aload_2
        67: aload_0
        68: aload         5
        70: invokevirtual #215                // Method ext/mods/roulette/holder/RouletteHolder.getId:()I
        73: invokevirtual #220                // Method getItemIcon:(I)Ljava/lang/String;
        76: invokedynamic #224,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        81: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        84: pop
        85: aload_2
        86: ldc           #228                // String </td>
        88: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        91: pop
        92: goto          102
        95: aload_2
        96: ldc           #230                // String <td align=center>?</td>
        98: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       101: pop
       102: iinc          4, 1
       105: goto          40
       108: aload_2
       109: ldc           #232                // String </tr></table>
       111: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       114: pop
       115: iinc          3, 1
       118: goto          24
       121: aload_2
       122: ldc           #234                // String <br><font color=LEVEL>Good luck!</font>
       124: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       127: pop
       128: aload_2
       129: ldc           #71                 // String </center></body></html>
       131: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       134: pop
       135: new           #73                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       138: dup
       139: iconst_0
       140: invokespecial #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       143: astore_3
       144: aload_3
       145: aload_2
       146: invokevirtual #78                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       149: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       152: aload_1
       153: aload_3
       154: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       157: return
      LineNumberTable:
        line 178: 0
        line 179: 8
        line 180: 15
        line 182: 22
        line 184: 30
        line 186: 37
        line 188: 46
        line 189: 54
        line 191: 59
        line 192: 66
        line 193: 85
        line 198: 95
        line 186: 102
        line 202: 108
        line 182: 115
        line 205: 121
        line 206: 128
        line 208: 135
        line 209: 144
        line 210: 152
        line 211: 157
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      48     5 randomItem   Lext/mods/roulette/holder/RouletteHolder;
           40      68     4     i   I
           24      97     3 block   I
            0     158     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;
            0     158     1 player   Lext/mods/gameserver/model/actor/Player;
            8     150     2    sb   Ljava/lang/StringBuilder;
          144      14     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class java/lang/StringBuilder, int ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class ext/mods/roulette/holder/RouletteHolder ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 12

  public void showPrizeHtml(ext.mods.gameserver.model.actor.Player, ext.mods.roulette.holder.RouletteHolder);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/roulette/holder/RouletteHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: new           #36                 // class java/lang/StringBuilder
         3: dup
         4: invokespecial #38                 // Method java/lang/StringBuilder."<init>":()V
         7: astore_3
         8: aload_3
         9: ldc           #39                 // String <html><body><center>
        11: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        14: pop
        15: aload_3
        16: ldc           #236                // String <font color=\"LEVEL\">You won!</font><br>
        18: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        21: pop
        22: aload_3
        23: aload_0
        24: aload_2
        25: invokevirtual #215                // Method ext/mods/roulette/holder/RouletteHolder.getId:()I
        28: invokevirtual #220                // Method getItemIcon:(I)Ljava/lang/String;
        31: invokedynamic #238,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        36: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        39: pop
        40: aload_3
        41: aload_0
        42: aload_2
        43: invokevirtual #215                // Method ext/mods/roulette/holder/RouletteHolder.getId:()I
        46: invokevirtual #239                // Method getItemNameId:(I)Ljava/lang/String;
        49: invokedynamic #242,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        54: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        57: pop
        58: aload_3
        59: aload_2
        60: invokevirtual #243                // Method ext/mods/roulette/holder/RouletteHolder.getCount:()I
        63: invokedynamic #246,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
        68: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        71: pop
        72: aload_3
        73: ldc           #248                // String <br><button value=\"Spin Again\" action=\"bypass -h voiced_spin\" width=75 height=16 back=\"sek.cbui307\" fore=\"sek.cbui308\">
        75: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        78: pop
        79: aload_3
        80: ldc           #71                 // String </center></body></html>
        82: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        85: pop
        86: new           #73                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        89: dup
        90: iconst_0
        91: invokespecial #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        94: astore        4
        96: aload         4
        98: aload_3
        99: invokevirtual #78                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       102: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       105: aload_1
       106: aload         4
       108: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       111: return
      LineNumberTable:
        line 215: 0
        line 216: 8
        line 217: 15
        line 218: 22
        line 219: 40
        line 220: 58
        line 221: 72
        line 222: 79
        line 224: 86
        line 225: 96
        line 226: 105
        line 227: 111
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     112     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;
            0     112     1 player   Lext/mods/gameserver/model/actor/Player;
            0     112     2 prize   Lext/mods/roulette/holder/RouletteHolder;
            8     104     3    sb   Ljava/lang/StringBuilder;
           96      16     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;

  public java.lang.String getItemIcon(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: invokestatic  #250                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
         3: iload_1
         4: invokevirtual #255                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
         7: astore_2
         8: aload_2
         9: ifnull        19
        12: aload_2
        13: invokevirtual #259                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
        16: goto          22
        19: ldc_w         #264                // String Unknown Item
        22: areturn
      LineNumberTable:
        line 231: 0
        line 232: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;
            0      23     1 itemId   I
            8      15     2  item   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public java.lang.String getItemNameId(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: invokestatic  #250                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
         3: iload_1
         4: invokevirtual #255                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
         7: astore_2
         8: aload_2
         9: ifnull        19
        12: aload_2
        13: invokevirtual #266                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        16: goto          22
        19: ldc_w         #269                // String Icon.NOIMAGE
        22: areturn
      LineNumberTable:
        line 237: 0
        line 238: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;
            0      23     1 itemId   I
            8      15     2  item   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #271                // Field _voicedCommands:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 244: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #22                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #19                 // String roulette
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #31                 // String spin
        13: aastore
        14: putstatic     #271                // Field _voicedCommands:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 44: 0
}
SourceFile: "RouletteVoiced.java"
BootstrapMethods:
  0: #399 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #384 ()V
      #385 REF_invokeVirtual ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.lambda$startSpin$0:(Lext/mods/gameserver/model/actor/Player;)V
      #384 ()V
  1: #399 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #384 ()V
      #388 REF_invokeVirtual ext/mods/gameserver/handler/voicedcommandhandlers/RouletteVoiced.lambda$startSpin$1:(Lext/mods/gameserver/model/actor/Player;)V
      #384 ()V
  2: #406 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #391 <img src=\"\u0001\" width=32 height=32>
  3: #406 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #393 <img src=\"\u0001\" width=32 height=32><br>
  4: #406 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #395 <font color=\"FFFFFF\">\u0001</font><br>
  5: #406 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #397 <font color=\"LEVEL\">Amount:</font> <font color=\"FFFFFF\">\u0001</font><br>
InnerClasses:
  public static final #417= #413 of #415; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
