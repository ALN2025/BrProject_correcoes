// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.Loto
// File: ext\mods\gameserver\handler\bypasshandlers\Loto.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/Loto.class
  Last modified 9 de jul de 2026; size 9274 bytes
  MD5 checksum 30567bca256886af522e59174e55a2e7
  Compiled from "Loto.java"
public class ext.mods.gameserver.handler.bypasshandlers.Loto implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #32                         // ext/mods/gameserver/handler/bypasshandlers/Loto
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Npc
    #8 = Utf8               ext/mods/gameserver/model/actor/Npc
    #9 = Methodref          #10.#11       // java/lang/String.substring:(I)Ljava/lang/String;
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // substring:(I)Ljava/lang/String;
   #12 = Utf8               java/lang/String
   #13 = Utf8               substring
   #14 = Utf8               (I)Ljava/lang/String;
   #15 = Methodref          #16.#17       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #16 = Class              #18           // java/lang/Integer
   #17 = NameAndType        #19:#20       // parseInt:(Ljava/lang/String;)I
   #18 = Utf8               java/lang/Integer
   #19 = Utf8               parseInt
   #20 = Utf8               (Ljava/lang/String;)I
   #21 = Class              #22           // java/lang/IndexOutOfBoundsException
   #22 = Utf8               java/lang/IndexOutOfBoundsException
   #23 = Class              #24           // java/lang/NumberFormatException
   #24 = Utf8               java/lang/NumberFormatException
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/actor/Player.setLoto:(II)V
   #26 = Class              #28           // ext/mods/gameserver/model/actor/Player
   #27 = NameAndType        #29:#30       // setLoto:(II)V
   #28 = Utf8               ext/mods/gameserver/model/actor/Player
   #29 = Utf8               setLoto
   #30 = Utf8               (II)V
   #31 = Methodref          #32.#33       // ext/mods/gameserver/handler/bypasshandlers/Loto.showLotoWindow:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Npc;)V
   #32 = Class              #34           // ext/mods/gameserver/handler/bypasshandlers/Loto
   #33 = NameAndType        #35:#36       // showLotoWindow:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Npc;)V
   #34 = Utf8               ext/mods/gameserver/handler/bypasshandlers/Loto
   #35 = Utf8               showLotoWindow
   #36 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Npc;)V
   #37 = Methodref          #7.#38        // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #38 = NameAndType        #39:#40       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #39 = Utf8               getTemplate
   #40 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #41 = Methodref          #42.#43       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #42 = Class              #44           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #43 = NameAndType        #45:#46       // getNpcId:()I
   #44 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #45 = Utf8               getNpcId
   #46 = Utf8               ()I
   #47 = Class              #48           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #48 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #49 = Methodref          #7.#50        // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
   #50 = NameAndType        #51:#46       // getObjectId:()I
   #51 = Utf8               getObjectId
   #52 = Methodref          #47.#53       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #53 = NameAndType        #5:#54        // "<init>":(I)V
   #54 = Utf8               (I)V
   #55 = Methodref          #26.#56       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #56 = NameAndType        #57:#58       // getLocale:()Ljava/util/Locale;
   #57 = Utf8               getLocale
   #58 = Utf8               ()Ljava/util/Locale;
   #59 = Methodref          #7.#60        // ext/mods/gameserver/model/actor/Npc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #60 = NameAndType        #61:#62       // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #61 = Utf8               getHtmlPath
   #62 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #63 = Methodref          #47.#64       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #64 = NameAndType        #65:#66       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #65 = Utf8               setFile
   #66 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #67 = Methodref          #68.#69       // ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
   #68 = Class              #70           // ext/mods/gameserver/data/manager/LotteryManager
   #69 = NameAndType        #71:#72       // getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
   #70 = Utf8               ext/mods/gameserver/data/manager/LotteryManager
   #71 = Utf8               getInstance
   #72 = Utf8               ()Lext/mods/gameserver/data/manager/LotteryManager;
   #73 = Methodref          #68.#74       // ext/mods/gameserver/data/manager/LotteryManager.isStarted:()Z
   #74 = NameAndType        #75:#76       // isStarted:()Z
   #75 = Utf8               isStarted
   #76 = Utf8               ()Z
   #77 = Fieldref           #78.#79       // ext/mods/gameserver/network/SystemMessageId.NO_LOTTERY_TICKETS_CURRENT_SOLD:Lext/mods/gameserver/network/SystemMessageId;
   #78 = Class              #80           // ext/mods/gameserver/network/SystemMessageId
   #79 = NameAndType        #81:#82       // NO_LOTTERY_TICKETS_CURRENT_SOLD:Lext/mods/gameserver/network/SystemMessageId;
   #80 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #81 = Utf8               NO_LOTTERY_TICKETS_CURRENT_SOLD
   #82 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #83 = Methodref          #26.#84       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #84 = NameAndType        #85:#86       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #85 = Utf8               sendPacket
   #86 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #87 = Methodref          #68.#88       // ext/mods/gameserver/data/manager/LotteryManager.isSellableTickets:()Z
   #88 = NameAndType        #89:#76       // isSellableTickets:()Z
   #89 = Utf8               isSellableTickets
   #90 = Fieldref           #78.#91       // ext/mods/gameserver/network/SystemMessageId.NO_LOTTERY_TICKETS_AVAILABLE:Lext/mods/gameserver/network/SystemMessageId;
   #91 = NameAndType        #92:#82       // NO_LOTTERY_TICKETS_AVAILABLE:Lext/mods/gameserver/network/SystemMessageId;
   #92 = Utf8               NO_LOTTERY_TICKETS_AVAILABLE
   #93 = Methodref          #26.#94       // ext/mods/gameserver/model/actor/Player.getLoto:(I)I
   #94 = NameAndType        #95:#96       // getLoto:(I)I
   #95 = Utf8               getLoto
   #96 = Utf8               (I)I
   #97 = Methodref          #10.#98       // java/lang/String.valueOf:(I)Ljava/lang/String;
   #98 = NameAndType        #99:#14       // valueOf:(I)Ljava/lang/String;
   #99 = Utf8               valueOf
  #100 = InvokeDynamic      #0:#101       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #101 = NameAndType        #102:#103     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #102 = Utf8               makeConcatWithConstants
  #103 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #104 = InvokeDynamic      #1:#105       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #105 = NameAndType        #102:#106     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #106 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #107 = InvokeDynamic      #2:#105       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #108 = Methodref          #47.#109      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #109 = NameAndType        #110:#111     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #110 = Utf8               replace
  #111 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #112 = Methodref          #26.#113      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #113 = NameAndType        #114:#115     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #114 = Utf8               getSysString
  #115 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #116 = InvokeDynamic      #3:#101       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #117 = InvokeDynamic      #4:#101       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #118 = Methodref          #68.#119      // ext/mods/gameserver/data/manager/LotteryManager.getId:()I
  #119 = NameAndType        #120:#46      // getId:()I
  #120 = Utf8               getId
  #121 = Double             2.0d
  #123 = Methodref          #124.#125     // java/lang/Math.pow:(DD)D
  #124 = Class              #126          // java/lang/Math
  #125 = NameAndType        #127:#128     // pow:(DD)D
  #126 = Utf8               java/lang/Math
  #127 = Utf8               pow
  #128 = Utf8               (DD)D
  #129 = Fieldref           #130.#131     // ext/mods/Config.LOTTERY_TICKET_PRICE:I
  #130 = Class              #132          // ext/mods/Config
  #131 = NameAndType        #133:#134     // LOTTERY_TICKET_PRICE:I
  #132 = Utf8               ext/mods/Config
  #133 = Utf8               LOTTERY_TICKET_PRICE
  #134 = Utf8               I
  #135 = Methodref          #26.#136      // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #136 = NameAndType        #137:#138     // reduceAdena:(IZ)Z
  #137 = Utf8               reduceAdena
  #138 = Utf8               (IZ)Z
  #139 = Methodref          #68.#140      // ext/mods/gameserver/data/manager/LotteryManager.increasePrize:(I)V
  #140 = NameAndType        #141:#54      // increasePrize:(I)V
  #141 = Utf8               increasePrize
  #142 = Methodref          #26.#143      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #143 = NameAndType        #144:#145     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #144 = Utf8               addItem
  #145 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #146 = Methodref          #147.#148     // ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType1:(I)V
  #147 = Class              #149          // ext/mods/gameserver/model/item/instance/ItemInstance
  #148 = NameAndType        #150:#54      // setCustomType1:(I)V
  #149 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #150 = Utf8               setCustomType1
  #151 = Methodref          #147.#152     // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #152 = NameAndType        #153:#154     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #153 = Utf8               setEnchantLevel
  #154 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #155 = Methodref          #147.#156     // ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType2:(I)V
  #156 = NameAndType        #157:#54      // setCustomType2:(I)V
  #157 = Utf8               setCustomType2
  #158 = Fieldref           #78.#159      // ext/mods/gameserver/network/SystemMessageId.EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #159 = NameAndType        #160:#82      // EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #160 = Utf8               EARNED_ITEM_S1
  #161 = Methodref          #162.#163     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #162 = Class              #164          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #163 = NameAndType        #165:#166     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #164 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #165 = Utf8               getSystemMessage
  #166 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #167 = Methodref          #162.#168     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #168 = NameAndType        #169:#170     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #169 = Utf8               addItemName
  #170 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #171 = Methodref          #26.#172      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #172 = NameAndType        #85:#173      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #173 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #174 = Class              #175          // java/lang/StringBuilder
  #175 = Utf8               java/lang/StringBuilder
  #176 = Methodref          #174.#3       // java/lang/StringBuilder."<init>":()V
  #177 = Methodref          #26.#178      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #178 = NameAndType        #179:#180     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #179 = Utf8               getInventory
  #180 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #181 = Methodref          #182.#183     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItems:()Ljava/util/Set;
  #182 = Class              #184          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #183 = NameAndType        #185:#186     // getItems:()Ljava/util/Set;
  #184 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #185 = Utf8               getItems
  #186 = Utf8               ()Ljava/util/Set;
  #187 = InterfaceMethodref #188.#189     // java/util/Set.iterator:()Ljava/util/Iterator;
  #188 = Class              #190          // java/util/Set
  #189 = NameAndType        #191:#192     // iterator:()Ljava/util/Iterator;
  #190 = Utf8               java/util/Set
  #191 = Utf8               iterator
  #192 = Utf8               ()Ljava/util/Iterator;
  #193 = InterfaceMethodref #194.#195     // java/util/Iterator.hasNext:()Z
  #194 = Class              #196          // java/util/Iterator
  #195 = NameAndType        #197:#76      // hasNext:()Z
  #196 = Utf8               java/util/Iterator
  #197 = Utf8               hasNext
  #198 = InterfaceMethodref #194.#199     // java/util/Iterator.next:()Ljava/lang/Object;
  #199 = NameAndType        #200:#201     // next:()Ljava/lang/Object;
  #200 = Utf8               next
  #201 = Utf8               ()Ljava/lang/Object;
  #202 = Methodref          #147.#203     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #203 = NameAndType        #204:#46      // getItemId:()I
  #204 = Utf8               getItemId
  #205 = Methodref          #147.#206     // ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
  #206 = NameAndType        #207:#46      // getCustomType1:()I
  #207 = Utf8               getCustomType1
  #208 = String             #209          // <a action=\"bypass -h npc_%objectId%_Loto
  #209 = Utf8               <a action=\"bypass -h npc_%objectId%_Loto
  #210 = Methodref          #147.#50      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #211 = Methodref          #16.#212      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #212 = NameAndType        #99:#213      // valueOf:(I)Ljava/lang/Integer;
  #213 = Utf8               (I)Ljava/lang/Integer;
  #214 = String             #215          // \">
  #215 = Utf8               \">
  #216 = String             #217          //  Event Number
  #217 = Utf8                Event Number
  #218 = Methodref          #219.#220     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #219 = Class              #221          // ext/mods/commons/lang/StringUtil
  #220 = NameAndType        #222:#223     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #221 = Utf8               ext/mods/commons/lang/StringUtil
  #222 = Utf8               append
  #223 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #224 = Methodref          #147.#225     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #225 = NameAndType        #226:#46      // getEnchantLevel:()I
  #226 = Utf8               getEnchantLevel
  #227 = Methodref          #147.#228     // ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
  #228 = NameAndType        #229:#46      // getCustomType2:()I
  #229 = Utf8               getCustomType2
  #230 = Methodref          #68.#231      // ext/mods/gameserver/data/manager/LotteryManager.decodeNumbers:(II)[I
  #231 = NameAndType        #232:#233     // decodeNumbers:(II)[I
  #232 = Utf8               decodeNumbers
  #233 = Utf8               (II)[I
  #234 = String             #235          //
  #235 = Utf8
  #236 = Methodref          #68.#237      // ext/mods/gameserver/data/manager/LotteryManager.checkTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[I
  #237 = NameAndType        #238:#239     // checkTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[I
  #238 = Utf8               checkTicket
  #239 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)[I
  #240 = String             #241          // - 1st Prize
  #241 = Utf8               - 1st Prize
  #242 = Methodref          #174.#243     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #243 = NameAndType        #222:#244     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #244 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #245 = String             #246          // - 2nd Prize
  #246 = Utf8               - 2nd Prize
  #247 = String             #248          // - 3th Prize
  #248 = Utf8               - 3th Prize
  #249 = String             #250          // - 4th Prize
  #250 = Utf8               - 4th Prize
  #251 = String             #252          // a.
  #252 = Utf8               a.
  #253 = String             #254          // </a><br>
  #254 = Utf8               </a><br>
  #255 = Methodref          #174.#256     // java/lang/StringBuilder.length:()I
  #256 = NameAndType        #257:#46      // length:()I
  #257 = Utf8               length
  #258 = String             #259          // There is no winning lottery ticket...<br>
  #259 = Utf8               There is no winning lottery ticket...<br>
  #260 = String             #261          // %result%
  #261 = Utf8               %result%
  #262 = Methodref          #174.#263     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #263 = NameAndType        #264:#265     // toString:()Ljava/lang/String;
  #264 = Utf8               toString
  #265 = Utf8               ()Ljava/lang/String;
  #266 = String             #267          // %prize5%
  #267 = Utf8               %prize5%
  #268 = Fieldref           #130.#269     // ext/mods/Config.LOTTERY_5_NUMBER_RATE:D
  #269 = NameAndType        #270:#271     // LOTTERY_5_NUMBER_RATE:D
  #270 = Utf8               LOTTERY_5_NUMBER_RATE
  #271 = Utf8               D
  #272 = Double             100.0d
  #274 = Methodref          #47.#275      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
  #275 = NameAndType        #110:#276     // replace:(Ljava/lang/String;D)V
  #276 = Utf8               (Ljava/lang/String;D)V
  #277 = String             #278          // %prize4%
  #278 = Utf8               %prize4%
  #279 = Fieldref           #130.#280     // ext/mods/Config.LOTTERY_4_NUMBER_RATE:D
  #280 = NameAndType        #281:#271     // LOTTERY_4_NUMBER_RATE:D
  #281 = Utf8               LOTTERY_4_NUMBER_RATE
  #282 = String             #283          // %prize3%
  #283 = Utf8               %prize3%
  #284 = Fieldref           #130.#285     // ext/mods/Config.LOTTERY_3_NUMBER_RATE:D
  #285 = NameAndType        #286:#271     // LOTTERY_3_NUMBER_RATE:D
  #286 = Utf8               LOTTERY_3_NUMBER_RATE
  #287 = String             #288          // %prize2%
  #288 = Utf8               %prize2%
  #289 = Fieldref           #130.#290     // ext/mods/Config.LOTTERY_2_AND_1_NUMBER_PRIZE:I
  #290 = NameAndType        #291:#134     // LOTTERY_2_AND_1_NUMBER_PRIZE:I
  #291 = Utf8               LOTTERY_2_AND_1_NUMBER_PRIZE
  #292 = Methodref          #47.#293      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #293 = NameAndType        #110:#294     // replace:(Ljava/lang/String;I)V
  #294 = Utf8               (Ljava/lang/String;I)V
  #295 = Methodref          #182.#296     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #296 = NameAndType        #297:#298     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #297 = Utf8               getItemByObjectId
  #298 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #299 = Methodref          #26.#300      // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #300 = NameAndType        #301:#302     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #301 = Utf8               destroyItem
  #302 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #303 = Methodref          #26.#304      // ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
  #304 = NameAndType        #305:#306     // addAdena:(IZ)V
  #305 = Utf8               addAdena
  #306 = Utf8               (IZ)V
  #307 = Methodref          #26.#308      // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #308 = NameAndType        #309:#310     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #309 = Utf8               getMissions
  #310 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #311 = Fieldref           #312.#313     // ext/mods/gameserver/enums/actors/MissionType.LOTTERY_WIN:Lext/mods/gameserver/enums/actors/MissionType;
  #312 = Class              #314          // ext/mods/gameserver/enums/actors/MissionType
  #313 = NameAndType        #315:#316     // LOTTERY_WIN:Lext/mods/gameserver/enums/actors/MissionType;
  #314 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #315 = Utf8               LOTTERY_WIN
  #316 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #317 = Methodref          #318.#319     // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #318 = Class              #320          // ext/mods/gameserver/model/actor/container/player/MissionList
  #319 = NameAndType        #321:#322     // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #320 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #321 = Utf8               update
  #322 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #323 = String             #324          // %objectId%
  #324 = Utf8               %objectId%
  #325 = String             #326          // %race%
  #326 = Utf8               %race%
  #327 = String             #328          // %adena%
  #328 = Utf8               %adena%
  #329 = Methodref          #68.#330      // ext/mods/gameserver/data/manager/LotteryManager.getPrize:()I
  #330 = NameAndType        #331:#46      // getPrize:()I
  #331 = Utf8               getPrize
  #332 = String             #333          // %ticket_price%
  #333 = Utf8               %ticket_price%
  #334 = String             #335          // %enddate%
  #335 = Utf8               %enddate%
  #336 = Methodref          #337.#338     // java/text/DateFormat.getDateInstance:()Ljava/text/DateFormat;
  #337 = Class              #339          // java/text/DateFormat
  #338 = NameAndType        #340:#341     // getDateInstance:()Ljava/text/DateFormat;
  #339 = Utf8               java/text/DateFormat
  #340 = Utf8               getDateInstance
  #341 = Utf8               ()Ljava/text/DateFormat;
  #342 = Methodref          #68.#343      // ext/mods/gameserver/data/manager/LotteryManager.getEndDate:()J
  #343 = NameAndType        #344:#345     // getEndDate:()J
  #344 = Utf8               getEndDate
  #345 = Utf8               ()J
  #346 = Methodref          #347.#348     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #347 = Class              #349          // java/lang/Long
  #348 = NameAndType        #99:#350      // valueOf:(J)Ljava/lang/Long;
  #349 = Utf8               java/lang/Long
  #350 = Utf8               (J)Ljava/lang/Long;
  #351 = Methodref          #337.#352     // java/text/DateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #352 = NameAndType        #353:#354     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #353 = Utf8               format
  #354 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #355 = Fieldref           #356.#357     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #356 = Class              #358          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #357 = NameAndType        #359:#360     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #358 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #359 = Utf8               STATIC_PACKET
  #360 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #361 = Fieldref           #32.#362      // ext/mods/gameserver/handler/bypasshandlers/Loto.COMMANDS:[Ljava/lang/String;
  #362 = NameAndType        #363:#364     // COMMANDS:[Ljava/lang/String;
  #363 = Utf8               COMMANDS
  #364 = Utf8               [Ljava/lang/String;
  #365 = String             #366          // Loto
  #366 = Utf8               Loto
  #367 = Class              #368          // ext/mods/gameserver/handler/IBypassHandler
  #368 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #369 = Utf8               Code
  #370 = Utf8               LineNumberTable
  #371 = Utf8               LocalVariableTable
  #372 = Utf8               this
  #373 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/Loto;
  #374 = Utf8               useBypass
  #375 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #376 = Utf8               i
  #377 = Utf8               val
  #378 = Utf8               npc
  #379 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #380 = Utf8               command
  #381 = Utf8               Ljava/lang/String;
  #382 = Utf8               player
  #383 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #384 = Utf8               target
  #385 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #386 = Utf8               StackMapTable
  #387 = Class              #388          // ext/mods/gameserver/model/actor/Creature
  #388 = Utf8               ext/mods/gameserver/model/actor/Creature
  #389 = Class              #390          // java/lang/RuntimeException
  #390 = Utf8               java/lang/RuntimeException
  #391 = Utf8               button
  #392 = Utf8               search
  #393 = Utf8               count
  #394 = Utf8               found
  #395 = Utf8               lotonumber
  #396 = Utf8               enchant
  #397 = Utf8               type2
  #398 = Utf8               ticket
  #399 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #400 = Utf8               numbers
  #401 = Utf8               [I
  #402 = Utf8               check
  #403 = Utf8               item
  #404 = Utf8               lotoNumber
  #405 = Utf8               sb
  #406 = Utf8               Ljava/lang/StringBuilder;
  #407 = Utf8               adena
  #408 = Utf8               npcId
  #409 = Utf8               html
  #410 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #411 = Class              #401          // "[I"
  #412 = Utf8               getBypassList
  #413 = Utf8               ()[Ljava/lang/String;
  #414 = Utf8               <clinit>
  #415 = Utf8               SourceFile
  #416 = Utf8               Loto.java
  #417 = Utf8               BootstrapMethods
  #418 = String             #419          // 0\u0001
  #419 = Utf8               0\u0001
  #420 = String             #421          // fore=\"L2UI.lottoNum\u0001\" back=\"L2UI.lottoNum\u0001a_check\"
  #421 = Utf8               fore=\"L2UI.lottoNum\u0001\" back=\"L2UI.lottoNum\u0001a_check\"
  #422 = String             #423          // fore=\"L2UI.lottoNum\u0001a_check\" back=\"L2UI.lottoNum\u0001\"
  #423 = Utf8               fore=\"L2UI.lottoNum\u0001a_check\" back=\"L2UI.lottoNum\u0001\"
  #424 = String             #425          // 0\">\u0001
  #425 = Utf8               0\">\u0001
  #426 = String             #427          // 22\">\u0001
  #427 = Utf8               22\">\u0001
  #428 = MethodHandle       6:#429        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #429 = Methodref          #430.#431     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #430 = Class              #432          // java/lang/invoke/StringConcatFactory
  #431 = NameAndType        #102:#433     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #432 = Utf8               java/lang/invoke/StringConcatFactory
  #433 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #434 = Utf8               InnerClasses
  #435 = Class              #436          // java/lang/invoke/MethodHandles$Lookup
  #436 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #437 = Class              #438          // java/lang/invoke/MethodHandles
  #438 = Utf8               java/lang/invoke/MethodHandles
  #439 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.bypasshandlers.Loto();
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
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/Loto;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_3
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Npc
         4: ifeq          67
         7: aload_3
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Npc
        11: astore        4
        13: iconst_0
        14: istore        5
        16: aload_1
        17: iconst_5
        18: invokevirtual #9                  // Method java/lang/String.substring:(I)Ljava/lang/String;
        21: invokestatic  #15                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        24: istore        5
        26: goto          31
        29: astore        6
        31: iload         5
        33: ifne          58
        36: iconst_0
        37: istore        6
        39: iload         6
        41: iconst_5
        42: if_icmpge     58
        45: aload_2
        46: iload         6
        48: iconst_0
        49: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.setLoto:(II)V
        52: iinc          6, 1
        55: goto          39
        58: aload_0
        59: aload_2
        60: iload         5
        62: aload         4
        64: invokevirtual #31                 // Method showLotoWindow:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Npc;)V
        67: iconst_1
        68: ireturn
      Exception table:
         from    to  target type
            16    26    29   Class java/lang/IndexOutOfBoundsException
            16    26    29   Class java/lang/NumberFormatException
      LineNumberTable:
        line 44: 0
        line 46: 13
        line 49: 16
        line 53: 26
        line 51: 29
        line 55: 31
        line 57: 36
        line 58: 45
        line 57: 52
        line 60: 58
        line 62: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      19     6     i   I
           16      51     5   val   I
           13      54     4   npc   Lext/mods/gameserver/model/actor/Npc;
            0      69     0  this   Lext/mods/gameserver/handler/bypasshandlers/Loto;
            0      69     1 command   Ljava/lang/String;
            0      69     2 player   Lext/mods/gameserver/model/actor/Player;
            0      69     3 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/Loto, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Npc, int ]
          stack = [ class java/lang/RuntimeException ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 18
        frame_type = 249 /* chop */
          offset_delta = 8

  public void showLotoWindow(ext.mods.gameserver.model.actor.Player, int, ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=12, args_size=4
         0: aload_3
         1: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
         7: istore        4
         9: new           #47                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        12: dup
        13: aload_3
        14: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
        17: invokespecial #52                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        20: astore        5
        22: iload_2
        23: ifne          46
        26: aload         5
        28: aload_1
        29: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        32: aload_3
        33: aload_1
        34: iload         4
        36: iconst_1
        37: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Npc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        40: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        43: goto          1154
        46: iload_2
        47: iconst_1
        48: if_icmplt     361
        51: iload_2
        52: bipush        21
        54: if_icmpgt     361
        57: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
        60: invokevirtual #73                 // Method ext/mods/gameserver/data/manager/LotteryManager.isStarted:()Z
        63: ifne          74
        66: aload_1
        67: getstatic     #77                 // Field ext/mods/gameserver/network/SystemMessageId.NO_LOTTERY_TICKETS_CURRENT_SOLD:Lext/mods/gameserver/network/SystemMessageId;
        70: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        73: return
        74: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
        77: invokevirtual #87                 // Method ext/mods/gameserver/data/manager/LotteryManager.isSellableTickets:()Z
        80: ifne          91
        83: aload_1
        84: getstatic     #90                 // Field ext/mods/gameserver/network/SystemMessageId.NO_LOTTERY_TICKETS_AVAILABLE:Lext/mods/gameserver/network/SystemMessageId;
        87: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        90: return
        91: aload         5
        93: aload_1
        94: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        97: aload_3
        98: aload_1
        99: iload         4
       101: iconst_5
       102: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Npc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       105: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       108: iconst_0
       109: istore        6
       111: iconst_0
       112: istore        7
       114: iconst_0
       115: istore        8
       117: iload         8
       119: iconst_5
       120: if_icmpge     164
       123: aload_1
       124: iload         8
       126: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       129: iload_2
       130: if_icmpne     146
       133: aload_1
       134: iload         8
       136: iconst_0
       137: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.setLoto:(II)V
       140: iconst_1
       141: istore        7
       143: goto          158
       146: aload_1
       147: iload         8
       149: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       152: ifle          158
       155: iinc          6, 1
       158: iinc          8, 1
       161: goto          117
       164: iload         6
       166: iconst_5
       167: if_icmpge     215
       170: iload         7
       172: ifne          215
       175: iload_2
       176: bipush        20
       178: if_icmpgt     215
       181: iconst_0
       182: istore        8
       184: iload         8
       186: iconst_5
       187: if_icmpge     215
       190: aload_1
       191: iload         8
       193: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       196: ifne          209
       199: aload_1
       200: iload         8
       202: iload_2
       203: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.setLoto:(II)V
       206: goto          215
       209: iinc          8, 1
       212: goto          184
       215: iconst_0
       216: istore        6
       218: iconst_0
       219: istore        8
       221: iload         8
       223: iconst_5
       224: if_icmpge     307
       227: aload_1
       228: iload         8
       230: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       233: ifle          301
       236: iinc          6, 1
       239: aload_1
       240: iload         8
       242: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       245: invokestatic  #97                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       248: astore        9
       250: aload_1
       251: iload         8
       253: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       256: bipush        10
       258: if_icmpge     270
       261: aload         9
       263: invokedynamic #100,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       268: astore        9
       270: aload         9
       272: aload         9
       274: invokedynamic #104,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       279: astore        10
       281: aload         9
       283: aload         9
       285: invokedynamic #107,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       290: astore        11
       292: aload         5
       294: aload         10
       296: aload         11
       298: invokevirtual #108                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       301: iinc          8, 1
       304: goto          221
       307: iload         6
       309: iconst_5
       310: if_icmpne     358
       313: aload_1
       314: sipush        10171
       317: iconst_0
       318: anewarray     #2                  // class java/lang/Object
       321: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       324: invokedynamic #116,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       329: astore        8
       331: aload_1
       332: sipush        10172
       335: iconst_0
       336: anewarray     #2                  // class java/lang/Object
       339: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       342: invokedynamic #117,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       347: astore        9
       349: aload         5
       351: aload         8
       353: aload         9
       355: invokevirtual #108                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       358: goto          1154
       361: iload_2
       362: bipush        22
       364: if_icmpne     589
       367: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
       370: invokevirtual #73                 // Method ext/mods/gameserver/data/manager/LotteryManager.isStarted:()Z
       373: ifne          384
       376: aload_1
       377: getstatic     #77                 // Field ext/mods/gameserver/network/SystemMessageId.NO_LOTTERY_TICKETS_CURRENT_SOLD:Lext/mods/gameserver/network/SystemMessageId;
       380: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       383: return
       384: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
       387: invokevirtual #87                 // Method ext/mods/gameserver/data/manager/LotteryManager.isSellableTickets:()Z
       390: ifne          401
       393: aload_1
       394: getstatic     #90                 // Field ext/mods/gameserver/network/SystemMessageId.NO_LOTTERY_TICKETS_AVAILABLE:Lext/mods/gameserver/network/SystemMessageId;
       397: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       400: return
       401: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
       404: invokevirtual #118                // Method ext/mods/gameserver/data/manager/LotteryManager.getId:()I
       407: istore        6
       409: iconst_0
       410: istore        7
       412: iconst_0
       413: istore        8
       415: iconst_0
       416: istore        9
       418: iload         9
       420: iconst_5
       421: if_icmpge     499
       424: aload_1
       425: iload         9
       427: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       430: ifne          434
       433: return
       434: aload_1
       435: iload         9
       437: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       440: bipush        17
       442: if_icmpge     470
       445: iload         7
       447: i2d
       448: ldc2_w        #121                // double 2.0d
       451: aload_1
       452: iload         9
       454: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       457: iconst_1
       458: isub
       459: i2d
       460: invokestatic  #123                // Method java/lang/Math.pow:(DD)D
       463: dadd
       464: d2i
       465: istore        7
       467: goto          493
       470: iload         8
       472: i2d
       473: ldc2_w        #121                // double 2.0d
       476: aload_1
       477: iload         9
       479: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getLoto:(I)I
       482: bipush        17
       484: isub
       485: i2d
       486: invokestatic  #123                // Method java/lang/Math.pow:(DD)D
       489: dadd
       490: d2i
       491: istore        8
       493: iinc          9, 1
       496: goto          418
       499: aload_1
       500: getstatic     #129                // Field ext/mods/Config.LOTTERY_TICKET_PRICE:I
       503: iconst_1
       504: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       507: ifne          511
       510: return
       511: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
       514: getstatic     #129                // Field ext/mods/Config.LOTTERY_TICKET_PRICE:I
       517: invokevirtual #139                // Method ext/mods/gameserver/data/manager/LotteryManager.increasePrize:(I)V
       520: aload_1
       521: sipush        4442
       524: iconst_1
       525: iconst_0
       526: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       529: astore        9
       531: aload         9
       533: iload         6
       535: invokevirtual #146                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType1:(I)V
       538: aload         9
       540: iload         7
       542: aload_1
       543: invokevirtual #151                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       546: aload         9
       548: iload         8
       550: invokevirtual #155                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType2:(I)V
       553: aload_1
       554: getstatic     #158                // Field ext/mods/gameserver/network/SystemMessageId.EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
       557: invokestatic  #161                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       560: sipush        4442
       563: invokevirtual #167                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       566: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       569: aload         5
       571: aload_1
       572: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       575: aload_3
       576: aload_1
       577: iload         4
       579: iconst_3
       580: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Npc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       583: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       586: goto          1154
       589: iload_2
       590: bipush        23
       592: if_icmpne     615
       595: aload         5
       597: aload_1
       598: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       601: aload_3
       602: aload_1
       603: iload         4
       605: iconst_3
       606: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Npc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       609: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       612: goto          1154
       615: iload_2
       616: bipush        24
       618: if_icmpne     983
       621: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
       624: invokevirtual #118                // Method ext/mods/gameserver/data/manager/LotteryManager.getId:()I
       627: istore        6
       629: new           #174                // class java/lang/StringBuilder
       632: dup
       633: invokespecial #176                // Method java/lang/StringBuilder."<init>":()V
       636: astore        7
       638: aload_1
       639: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       642: invokevirtual #181                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItems:()Ljava/util/Set;
       645: invokeinterface #187,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       650: astore        8
       652: aload         8
       654: invokeinterface #193,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       659: ifeq          933
       662: aload         8
       664: invokeinterface #198,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       669: checkcast     #147                // class ext/mods/gameserver/model/item/instance/ItemInstance
       672: astore        9
       674: aload         9
       676: ifnonnull     682
       679: goto          652
       682: aload         9
       684: invokevirtual #202                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       687: sipush        4442
       690: if_icmpne     930
       693: aload         9
       695: invokevirtual #205                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
       698: iload         6
       700: if_icmpge     930
       703: aload         7
       705: iconst_5
       706: anewarray     #2                  // class java/lang/Object
       709: dup
       710: iconst_0
       711: ldc           #208                // String <a action=\"bypass -h npc_%objectId%_Loto
       713: aastore
       714: dup
       715: iconst_1
       716: aload         9
       718: invokevirtual #210                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       721: invokestatic  #211                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       724: aastore
       725: dup
       726: iconst_2
       727: ldc           #214                // String \">
       729: aastore
       730: dup
       731: iconst_3
       732: aload         9
       734: invokevirtual #205                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
       737: invokestatic  #211                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       740: aastore
       741: dup
       742: iconst_4
       743: ldc           #216                // String  Event Number
       745: aastore
       746: invokestatic  #218                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       749: aload         9
       751: invokevirtual #224                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       754: aload         9
       756: invokevirtual #227                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
       759: invokestatic  #230                // Method ext/mods/gameserver/data/manager/LotteryManager.decodeNumbers:(II)[I
       762: astore        10
       764: iconst_0
       765: istore        11
       767: iload         11
       769: iconst_5
       770: if_icmpge     804
       773: aload         7
       775: iconst_2
       776: anewarray     #2                  // class java/lang/Object
       779: dup
       780: iconst_0
       781: aload         10
       783: iload         11
       785: iaload
       786: invokestatic  #211                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       789: aastore
       790: dup
       791: iconst_1
       792: ldc           #234                // String
       794: aastore
       795: invokestatic  #218                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       798: iinc          11, 1
       801: goto          767
       804: aload         9
       806: invokestatic  #236                // Method ext/mods/gameserver/data/manager/LotteryManager.checkTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[I
       809: astore        11
       811: aload         11
       813: iconst_0
       814: iaload
       815: ifle          922
       818: aload         11
       820: iconst_0
       821: iaload
       822: tableswitch   { // 1 to 4

                       1: 852

                       2: 863

                       3: 874

                       4: 885
                 default: 893
            }
       852: aload         7
       854: ldc           #240                // String - 1st Prize
       856: invokevirtual #242                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       859: pop
       860: goto          893
       863: aload         7
       865: ldc           #245                // String - 2nd Prize
       867: invokevirtual #242                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       870: pop
       871: goto          893
       874: aload         7
       876: ldc           #247                // String - 3th Prize
       878: invokevirtual #242                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       881: pop
       882: goto          893
       885: aload         7
       887: ldc           #249                // String - 4th Prize
       889: invokevirtual #242                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       892: pop
       893: aload         7
       895: iconst_3
       896: anewarray     #2                  // class java/lang/Object
       899: dup
       900: iconst_0
       901: ldc           #234                // String
       903: aastore
       904: dup
       905: iconst_1
       906: aload         11
       908: iconst_1
       909: iaload
       910: invokestatic  #211                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       913: aastore
       914: dup
       915: iconst_2
       916: ldc           #251                // String a.
       918: aastore
       919: invokestatic  #218                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       922: aload         7
       924: ldc           #253                // String </a><br>
       926: invokevirtual #242                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       929: pop
       930: goto          652
       933: aload         7
       935: invokevirtual #255                // Method java/lang/StringBuilder.length:()I
       938: ifne          950
       941: aload         7
       943: ldc_w         #258                // String There is no winning lottery ticket...<br>
       946: invokevirtual #242                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       949: pop
       950: aload         5
       952: aload_1
       953: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       956: aload_3
       957: aload_1
       958: iload         4
       960: iconst_4
       961: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Npc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       964: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       967: aload         5
       969: ldc_w         #260                // String %result%
       972: aload         7
       974: invokevirtual #262                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       977: invokevirtual #108                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       980: goto          1154
       983: iload_2
       984: bipush        25
       986: if_icmpne     1065
       989: aload         5
       991: aload_1
       992: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       995: aload_3
       996: aload_1
       997: iload         4
       999: iconst_2
      1000: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Npc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
      1003: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1006: aload         5
      1008: ldc_w         #266                // String %prize5%
      1011: getstatic     #268                // Field ext/mods/Config.LOTTERY_5_NUMBER_RATE:D
      1014: ldc2_w        #272                // double 100.0d
      1017: dmul
      1018: invokevirtual #274                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
      1021: aload         5
      1023: ldc_w         #277                // String %prize4%
      1026: getstatic     #279                // Field ext/mods/Config.LOTTERY_4_NUMBER_RATE:D
      1029: ldc2_w        #272                // double 100.0d
      1032: dmul
      1033: invokevirtual #274                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
      1036: aload         5
      1038: ldc_w         #282                // String %prize3%
      1041: getstatic     #284                // Field ext/mods/Config.LOTTERY_3_NUMBER_RATE:D
      1044: ldc2_w        #272                // double 100.0d
      1047: dmul
      1048: invokevirtual #274                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
      1051: aload         5
      1053: ldc_w         #287                // String %prize2%
      1056: getstatic     #289                // Field ext/mods/Config.LOTTERY_2_AND_1_NUMBER_PRIZE:I
      1059: invokevirtual #292                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1062: goto          1154
      1065: iload_2
      1066: bipush        25
      1068: if_icmple     1154
      1071: aload_1
      1072: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1075: iload_2
      1076: invokevirtual #295                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1079: astore        6
      1081: aload         6
      1083: ifnull        1111
      1086: aload         6
      1088: invokevirtual #202                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
      1091: sipush        4442
      1094: if_icmpne     1111
      1097: aload         6
      1099: invokevirtual #205                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
      1102: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
      1105: invokevirtual #118                // Method ext/mods/gameserver/data/manager/LotteryManager.getId:()I
      1108: if_icmplt     1112
      1111: return
      1112: aload_1
      1113: aload         6
      1115: iconst_1
      1116: invokevirtual #299                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
      1119: ifeq          1153
      1122: aload         6
      1124: invokestatic  #236                // Method ext/mods/gameserver/data/manager/LotteryManager.checkTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[I
      1127: iconst_1
      1128: iaload
      1129: istore        7
      1131: iload         7
      1133: ifle          1143
      1136: aload_1
      1137: iload         7
      1139: iconst_1
      1140: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
      1143: aload_1
      1144: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
      1147: getstatic     #311                // Field ext/mods/gameserver/enums/actors/MissionType.LOTTERY_WIN:Lext/mods/gameserver/enums/actors/MissionType;
      1150: invokevirtual #317                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
      1153: return
      1154: aload         5
      1156: ldc_w         #323                // String %objectId%
      1159: aload_3
      1160: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
      1163: invokevirtual #292                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1166: aload         5
      1168: ldc_w         #325                // String %race%
      1171: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
      1174: invokevirtual #118                // Method ext/mods/gameserver/data/manager/LotteryManager.getId:()I
      1177: invokevirtual #292                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1180: aload         5
      1182: ldc_w         #327                // String %adena%
      1185: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
      1188: invokevirtual #329                // Method ext/mods/gameserver/data/manager/LotteryManager.getPrize:()I
      1191: invokevirtual #292                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1194: aload         5
      1196: ldc_w         #332                // String %ticket_price%
      1199: getstatic     #129                // Field ext/mods/Config.LOTTERY_TICKET_PRICE:I
      1202: invokevirtual #292                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1205: aload         5
      1207: ldc_w         #334                // String %enddate%
      1210: invokestatic  #336                // Method java/text/DateFormat.getDateInstance:()Ljava/text/DateFormat;
      1213: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
      1216: invokevirtual #342                // Method ext/mods/gameserver/data/manager/LotteryManager.getEndDate:()J
      1219: invokestatic  #346                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      1222: invokevirtual #351                // Method java/text/DateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      1225: invokevirtual #108                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1228: aload_1
      1229: aload         5
      1231: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1234: aload_1
      1235: getstatic     #355                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1238: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1241: return
      LineNumberTable:
        line 82: 0
        line 84: 9
        line 86: 22
        line 87: 26
        line 88: 46
        line 90: 57
        line 92: 66
        line 93: 73
        line 96: 74
        line 98: 83
        line 99: 90
        line 102: 91
        line 104: 108
        line 105: 111
        line 106: 114
        line 108: 123
        line 110: 133
        line 111: 140
        line 113: 146
        line 114: 155
        line 106: 158
        line 117: 164
        line 118: 181
        line 119: 190
        line 121: 199
        line 122: 206
        line 118: 209
        line 125: 215
        line 126: 218
        line 127: 227
        line 129: 236
        line 130: 239
        line 131: 250
        line 132: 261
        line 134: 270
        line 135: 281
        line 136: 292
        line 126: 301
        line 139: 307
        line 141: 313
        line 142: 331
        line 143: 349
        line 145: 358
        line 146: 361
        line 148: 367
        line 150: 376
        line 151: 383
        line 154: 384
        line 156: 393
        line 157: 400
        line 160: 401
        line 162: 409
        line 163: 412
        line 165: 415
        line 167: 424
        line 168: 433
        line 170: 434
        line 171: 445
        line 173: 470
        line 165: 493
        line 176: 499
        line 177: 510
        line 179: 511
        line 181: 520
        line 182: 531
        line 183: 538
        line 184: 546
        line 186: 553
        line 188: 569
        line 189: 586
        line 190: 589
        line 191: 595
        line 192: 615
        line 194: 621
        line 196: 629
        line 197: 638
        line 199: 674
        line 200: 679
        line 202: 682
        line 204: 703
        line 206: 749
        line 207: 764
        line 208: 773
        line 207: 798
        line 210: 804
        line 211: 811
        line 213: 818
        line 216: 852
        line 217: 860
        line 219: 863
        line 220: 871
        line 222: 874
        line 223: 882
        line 225: 885
        line 228: 893
        line 230: 922
        line 232: 930
        line 234: 933
        line 235: 941
        line 237: 950
        line 238: 967
        line 239: 980
        line 240: 983
        line 242: 989
        line 243: 1006
        line 244: 1021
        line 245: 1036
        line 246: 1051
        line 248: 1065
        line 250: 1071
        line 251: 1081
        line 252: 1111
        line 254: 1112
        line 256: 1122
        line 257: 1131
        line 258: 1136
        line 260: 1143
        line 262: 1153
        line 264: 1154
        line 265: 1166
        line 266: 1180
        line 267: 1194
        line 268: 1205
        line 270: 1228
        line 271: 1234
        line 272: 1241
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          117      47     8     i   I
          184      31     8     i   I
          250      51     9 button   Ljava/lang/String;
          281      20    10 search   Ljava/lang/String;
          292       9    11 replace   Ljava/lang/String;
          221      86     8     i   I
          331      27     8 search   Ljava/lang/String;
          349       9     9 replace   Ljava/lang/String;
          111     247     6 count   I
          114     244     7 found   I
          418      81     9     i   I
          409     177     6 lotonumber   I
          412     174     7 enchant   I
          415     171     8 type2   I
          531      55     9 ticket   Lext/mods/gameserver/model/item/instance/ItemInstance;
          767      37    11     i   I
          764     166    10 numbers   [I
          811     119    11 check   [I
          674     256     9  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          629     351     6 lotoNumber   I
          638     342     7    sb   Ljava/lang/StringBuilder;
         1131      22     7 adena   I
         1081      73     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0    1242     0  this   Lext/mods/gameserver/handler/bypasshandlers/Loto;
            0    1242     1 player   Lext/mods/gameserver/model/actor/Player;
            0    1242     2   val   I
            0    1242     3   npc   Lext/mods/gameserver/model/actor/Npc;
            9    1233     4 npcId   I
           22    1220     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 46
        frame_type = 253 /* append */
          offset_delta = 46
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 27 /* same */
        frame_type = 16 /* same */
        frame_type = 254 /* append */
          offset_delta = 25
          locals = [ int, int, int ]
        frame_type = 28 /* same */
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 5
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 30
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 249 /* chop */
          offset_delta = 50
        frame_type = 2 /* same */
        frame_type = 22 /* same */
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/Loto, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/actor/Npc, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 35 /* same */
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 11 /* same */
        frame_type = 248 /* chop */
          offset_delta = 77
        frame_type = 25 /* same */
        frame_type = 254 /* append */
          offset_delta = 36
          locals = [ int, class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 253 /* append */
          offset_delta = 84
          locals = [ class "[I", int ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class "[I" ]
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 7 /* same */
        frame_type = 28 /* same */
        frame_type = 248 /* chop */
          offset_delta = 7
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 16 /* same */
        frame_type = 249 /* chop */
          offset_delta = 32
        frame_type = 251 /* same_frame_extended */
          offset_delta = 81
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 0

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #361                // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 277: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/Loto;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc_w         #365                // String Loto
         9: aastore
        10: putstatic     #361                // Field COMMANDS:[Ljava/lang/String;
        13: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "Loto.java"
BootstrapMethods:
  0: #428 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #418 0\u0001
  1: #428 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #420 fore=\"L2UI.lottoNum\u0001\" back=\"L2UI.lottoNum\u0001a_check\"
  2: #428 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #422 fore=\"L2UI.lottoNum\u0001a_check\" back=\"L2UI.lottoNum\u0001\"
  3: #428 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #424 0\">\u0001
  4: #428 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #426 22\">\u0001
InnerClasses:
  public static final #439= #435 of #437; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
