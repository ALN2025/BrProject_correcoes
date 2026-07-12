// Bytecode for: ext.mods.gameserver.model.actor.instance.DerbyTrackManagerNpc
// File: ext\mods\gameserver\model\actor\instance\DerbyTrackManagerNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc.class
  Last modified 9 de jul de 2026; size 11245 bytes
  MD5 checksum de5d67b1e1b153ae19863482f3f039af
  Compiled from "DerbyTrackManagerNpc.java"
public class ext.mods.gameserver.model.actor.instance.DerbyTrackManagerNpc extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #68                         // ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            // BuyTicket
    #8 = Utf8               BuyTicket
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
   #16 = Class              #18           // ext/mods/gameserver/data/manager/DerbyTrackManager
   #17 = NameAndType        #19:#20       // getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
   #18 = Utf8               ext/mods/gameserver/data/manager/DerbyTrackManager
   #19 = Utf8               getInstance
   #20 = Utf8               ()Lext/mods/gameserver/data/manager/DerbyTrackManager;
   #21 = Methodref          #16.#22       // ext/mods/gameserver/data/manager/DerbyTrackManager.getCurrentRaceState:()Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #22 = NameAndType        #23:#24       // getCurrentRaceState:()Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #23 = Utf8               getCurrentRaceState
   #24 = Utf8               ()Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #26 = Class              #28           // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
   #27 = NameAndType        #29:#30       // ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #28 = Utf8               ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
   #29 = Utf8               ACCEPTING_BETS
   #30 = Utf8               Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #31 = Fieldref           #32.#33       // ext/mods/gameserver/network/SystemMessageId.MONSRACE_TICKETS_NOT_AVAILABLE:Lext/mods/gameserver/network/SystemMessageId;
   #32 = Class              #34           // ext/mods/gameserver/network/SystemMessageId
   #33 = NameAndType        #35:#36       // MONSRACE_TICKETS_NOT_AVAILABLE:Lext/mods/gameserver/network/SystemMessageId;
   #34 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #35 = Utf8               MONSRACE_TICKETS_NOT_AVAILABLE
   #36 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #37 = Methodref          #38.#39       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #38 = Class              #40           // ext/mods/gameserver/model/actor/Player
   #39 = NameAndType        #41:#42       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #40 = Utf8               ext/mods/gameserver/model/actor/Player
   #41 = Utf8               sendPacket
   #42 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #43 = String             #44           // Chat 0
   #44 = Utf8               Chat 0
   #45 = Methodref          #2.#46        // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #46 = NameAndType        #47:#48       // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #47 = Utf8               onBypassFeedback
   #48 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #49 = Methodref          #10.#50       // java/lang/String.substring:(I)Ljava/lang/String;
   #50 = NameAndType        #51:#52       // substring:(I)Ljava/lang/String;
   #51 = Utf8               substring
   #52 = Utf8               (I)Ljava/lang/String;
   #53 = Methodref          #54.#55       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #54 = Class              #56           // java/lang/Integer
   #55 = NameAndType        #57:#58       // parseInt:(Ljava/lang/String;)I
   #56 = Utf8               java/lang/Integer
   #57 = Utf8               parseInt
   #58 = Utf8               (Ljava/lang/String;)I
   #59 = Methodref          #38.#60       // ext/mods/gameserver/model/actor/Player.setRace:(II)V
   #60 = NameAndType        #61:#62       // setRace:(II)V
   #61 = Utf8               setRace
   #62 = Utf8               (II)V
   #63 = Methodref          #38.#64       // ext/mods/gameserver/model/actor/Player.getRace:(I)I
   #64 = NameAndType        #65:#66       // getRace:(I)I
   #65 = Utf8               getRace
   #66 = Utf8               (I)I
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #68 = Class              #70           // ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc
   #69 = NameAndType        #71:#72       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #70 = Utf8               ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc
   #71 = Utf8               getTemplate
   #72 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #74 = Class              #76           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #75 = NameAndType        #77:#78       // getNpcId:()I
   #76 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #77 = Utf8               getNpcId
   #78 = Utf8               ()I
   #79 = Class              #80           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #80 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #81 = Methodref          #68.#82       // ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc.getObjectId:()I
   #82 = NameAndType        #83:#78       // getObjectId:()I
   #83 = Utf8               getObjectId
   #84 = Methodref          #79.#85       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #85 = NameAndType        #5:#86        // "<init>":(I)V
   #86 = Utf8               (I)V
   #87 = Methodref          #38.#88       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #88 = NameAndType        #89:#90       // getLocale:()Ljava/util/Locale;
   #89 = Utf8               getLocale
   #90 = Utf8               ()Ljava/util/Locale;
   #91 = Methodref          #68.#92       // ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #92 = NameAndType        #93:#94       // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #93 = Utf8               getHtmlPath
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #95 = Methodref          #79.#96       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #96 = NameAndType        #97:#98       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #97 = Utf8               setFile
   #98 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #99 = InvokeDynamic      #0:#100       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #100 = NameAndType        #101:#52      // makeConcatWithConstants:(I)Ljava/lang/String;
  #101 = Utf8               makeConcatWithConstants
  #102 = Methodref          #16.#103      // ext/mods/gameserver/data/manager/DerbyTrackManager.getRunnerName:(I)Ljava/lang/String;
  #103 = NameAndType        #104:#52      // getRunnerName:(I)Ljava/lang/String;
  #104 = Utf8               getRunnerName
  #105 = Methodref          #79.#106      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #106 = NameAndType        #107:#108     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #107 = Utf8               replace
  #108 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #109 = String             #110          // No1
  #110 = Utf8               No1
  #111 = String             #112          //
  #112 = Utf8
  #113 = Methodref          #79.#114      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #114 = NameAndType        #107:#115     // replace:(Ljava/lang/String;I)V
  #115 = Utf8               (Ljava/lang/String;I)V
  #116 = String             #117          // 0place
  #117 = Utf8               0place
  #118 = String             #119          // Mob1
  #119 = Utf8               Mob1
  #120 = String             #121          // 0adena
  #121 = Utf8               0adena
  #122 = Fieldref           #68.#123      // ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc.TICKET_PRICES:[I
  #123 = NameAndType        #124:#125     // TICKET_PRICES:[I
  #124 = Utf8               TICKET_PRICES
  #125 = Utf8               [I
  #126 = String             #127          // 0tax
  #127 = Utf8               0tax
  #128 = String             #129          // 0total
  #129 = Utf8               0total
  #130 = Methodref          #38.#131      // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #131 = NameAndType        #132:#133     // reduceAdena:(IZ)Z
  #132 = Utf8               reduceAdena
  #133 = Utf8               (IZ)Z
  #134 = Methodref          #38.#135      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #135 = NameAndType        #136:#137     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #136 = Utf8               addItem
  #137 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #138 = Methodref          #16.#139      // ext/mods/gameserver/data/manager/DerbyTrackManager.getRaceNumber:()I
  #139 = NameAndType        #140:#78      // getRaceNumber:()I
  #140 = Utf8               getRaceNumber
  #141 = Methodref          #142.#143     // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #142 = Class              #144          // ext/mods/gameserver/model/item/instance/ItemInstance
  #143 = NameAndType        #145:#146     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #144 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #145 = Utf8               setEnchantLevel
  #146 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #147 = Methodref          #142.#148     // ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType1:(I)V
  #148 = NameAndType        #149:#86      // setCustomType1:(I)V
  #149 = Utf8               setCustomType1
  #150 = Methodref          #142.#151     // ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType2:(I)V
  #151 = NameAndType        #152:#86      // setCustomType2:(I)V
  #152 = Utf8               setCustomType2
  #153 = Fieldref           #32.#154      // ext/mods/gameserver/network/SystemMessageId.ACQUIRED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
  #154 = NameAndType        #155:#36      // ACQUIRED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
  #155 = Utf8               ACQUIRED_S1_S2
  #156 = Methodref          #157.#158     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #157 = Class              #159          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #158 = NameAndType        #160:#161     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #159 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #160 = Utf8               getSystemMessage
  #161 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #162 = Methodref          #157.#163     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #163 = NameAndType        #164:#165     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #164 = Utf8               addNumber
  #165 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #166 = Methodref          #157.#167     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #167 = NameAndType        #168:#165     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #168 = Utf8               addItemName
  #169 = Methodref          #38.#170      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #170 = NameAndType        #41:#171      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #171 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #172 = Methodref          #16.#173      // ext/mods/gameserver/data/manager/DerbyTrackManager.setBetOnLane:(IJZ)V
  #173 = NameAndType        #174:#175     // setBetOnLane:(IJZ)V
  #174 = Utf8               setBetOnLane
  #175 = Utf8               (IJZ)V
  #176 = String             #177          // 1race
  #177 = Utf8               1race
  #178 = String             #179          // %objectId%
  #179 = Utf8               %objectId%
  #180 = Fieldref           #181.#182     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #181 = Class              #183          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #182 = NameAndType        #184:#185     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #183 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #184 = Utf8               STATIC_PACKET
  #185 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #186 = String             #187          // ShowOdds
  #187 = Utf8               ShowOdds
  #188 = Methodref          #10.#189      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #189 = NameAndType        #190:#191     // equals:(Ljava/lang/Object;)Z
  #190 = Utf8               equals
  #191 = Utf8               (Ljava/lang/Object;)Z
  #192 = Fieldref           #32.#193      // ext/mods/gameserver/network/SystemMessageId.MONSRACE_NO_PAYOUT_INFO:Lext/mods/gameserver/network/SystemMessageId;
  #193 = NameAndType        #194:#36      // MONSRACE_NO_PAYOUT_INFO:Lext/mods/gameserver/network/SystemMessageId;
  #194 = Utf8               MONSRACE_NO_PAYOUT_INFO
  #195 = Methodref          #16.#196      // ext/mods/gameserver/data/manager/DerbyTrackManager.getOdds:()Ljava/util/List;
  #196 = NameAndType        #197:#198     // getOdds:()Ljava/util/List;
  #197 = Utf8               getOdds
  #198 = Utf8               ()Ljava/util/List;
  #199 = InterfaceMethodref #200.#201     // java/util/List.get:(I)Ljava/lang/Object;
  #200 = Class              #202          // java/util/List
  #201 = NameAndType        #203:#204     // get:(I)Ljava/lang/Object;
  #202 = Utf8               java/util/List
  #203 = Utf8               get
  #204 = Utf8               (I)Ljava/lang/Object;
  #205 = Class              #206          // java/lang/Double
  #206 = Utf8               java/lang/Double
  #207 = Methodref          #205.#208     // java/lang/Double.doubleValue:()D
  #208 = NameAndType        #209:#210     // doubleValue:()D
  #209 = Utf8               doubleValue
  #210 = Utf8               ()D
  #211 = InvokeDynamic      #1:#100       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #212 = Fieldref           #213.#214     // java/util/Locale.ENGLISH:Ljava/util/Locale;
  #213 = Class              #215          // java/util/Locale
  #214 = NameAndType        #216:#217     // ENGLISH:Ljava/util/Locale;
  #215 = Utf8               java/util/Locale
  #216 = Utf8               ENGLISH
  #217 = Utf8               Ljava/util/Locale;
  #218 = String             #219          // %.1f
  #219 = Utf8               %.1f
  #220 = Class              #221          // java/lang/Object
  #221 = Utf8               java/lang/Object
  #222 = Methodref          #205.#223     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #223 = NameAndType        #224:#225     // valueOf:(D)Ljava/lang/Double;
  #224 = Utf8               valueOf
  #225 = Utf8               (D)Ljava/lang/Double;
  #226 = Methodref          #10.#227      // java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #227 = NameAndType        #228:#229     // format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #228 = Utf8               format
  #229 = Utf8               (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #230 = String             #231          // &$804;
  #231 = Utf8               &$804;
  #232 = String             #233          // ShowInfo
  #233 = Utf8               ShowInfo
  #234 = String             #235          // ShowTickets
  #235 = Utf8               ShowTickets
  #236 = Class              #237          // java/lang/StringBuilder
  #237 = Utf8               java/lang/StringBuilder
  #238 = Methodref          #236.#239     // java/lang/StringBuilder."<init>":()V
  #239 = NameAndType        #5:#240       // "<init>":()V
  #240 = Utf8               ()V
  #241 = Methodref          #38.#242      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #242 = NameAndType        #243:#244     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #243 = Utf8               getInventory
  #244 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #245 = Methodref          #246.#247     // ext/mods/gameserver/model/itemcontainer/PcInventory.getAllItemsByItemId:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #246 = Class              #248          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #247 = NameAndType        #249:#250     // getAllItemsByItemId:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #248 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #249 = Utf8               getAllItemsByItemId
  #250 = Utf8               (I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #251 = Methodref          #142.#252     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #252 = NameAndType        #253:#78      // getEnchantLevel:()I
  #253 = Utf8               getEnchantLevel
  #254 = String             #255          // <tr><td><a action=\"bypass -h npc_%objectId%_ShowTicket
  #255 = Utf8               <tr><td><a action=\"bypass -h npc_%objectId%_ShowTicket
  #256 = Methodref          #142.#82      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #257 = Methodref          #54.#258      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #258 = NameAndType        #224:#259     // valueOf:(I)Ljava/lang/Integer;
  #259 = Utf8               (I)Ljava/lang/Integer;
  #260 = String             #261          // \">
  #261 = Utf8               \">
  #262 = String             #263          //  Race Number</a></td><td align=right><font color=\"LEVEL\">
  #263 = Utf8                Race Number</a></td><td align=right><font color=\"LEVEL\">
  #264 = Methodref          #142.#265     // ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
  #265 = NameAndType        #266:#78      // getCustomType1:()I
  #266 = Utf8               getCustomType1
  #267 = String             #268          // </font> Number</td><td align=right><font color=\"LEVEL\">
  #268 = Utf8               </font> Number</td><td align=right><font color=\"LEVEL\">
  #269 = Methodref          #142.#270     // ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
  #270 = NameAndType        #271:#78      // getCustomType2:()I
  #271 = Utf8               getCustomType2
  #272 = String             #273          // </font> Adena</td></tr>
  #273 = Utf8               </font> Adena</td></tr>
  #274 = Methodref          #275.#276     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #275 = Class              #277          // ext/mods/commons/lang/StringUtil
  #276 = NameAndType        #278:#279     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #277 = Utf8               ext/mods/commons/lang/StringUtil
  #278 = Utf8               append
  #279 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #280 = String             #281          // %tickets%
  #281 = Utf8               %tickets%
  #282 = Methodref          #236.#283     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #283 = NameAndType        #284:#285     // toString:()Ljava/lang/String;
  #284 = Utf8               toString
  #285 = Utf8               ()Ljava/lang/String;
  #286 = String             #287          // ShowTicket
  #287 = Utf8               ShowTicket
  #288 = Methodref          #246.#289     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #289 = NameAndType        #290:#291     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #290 = Utf8               getItemByObjectId
  #291 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #292 = Methodref          #16.#293      // ext/mods/gameserver/data/manager/DerbyTrackManager.getHistoryInfo:(I)Lext/mods/gameserver/model/HistoryInfo;
  #293 = NameAndType        #294:#295     // getHistoryInfo:(I)Lext/mods/gameserver/model/HistoryInfo;
  #294 = Utf8               getHistoryInfo
  #295 = Utf8               (I)Lext/mods/gameserver/model/HistoryInfo;
  #296 = String             #297          // %raceId%
  #297 = Utf8               %raceId%
  #298 = String             #299          // %lane%
  #299 = Utf8               %lane%
  #300 = String             #301          // %bet%
  #301 = Utf8               %bet%
  #302 = String             #303          // %firstLane%
  #303 = Utf8               %firstLane%
  #304 = Methodref          #305.#306     // ext/mods/gameserver/model/HistoryInfo.getFirst:()I
  #305 = Class              #307          // ext/mods/gameserver/model/HistoryInfo
  #306 = NameAndType        #308:#78      // getFirst:()I
  #307 = Utf8               ext/mods/gameserver/model/HistoryInfo
  #308 = Utf8               getFirst
  #309 = String             #310          // %odd%
  #310 = Utf8               %odd%
  #311 = String             #312          // %.2f
  #312 = Utf8               %.2f
  #313 = Methodref          #305.#314     // ext/mods/gameserver/model/HistoryInfo.getOddRate:()D
  #314 = NameAndType        #315:#210     // getOddRate:()D
  #315 = Utf8               getOddRate
  #316 = String             #317          // 0.01
  #317 = Utf8               0.01
  #318 = String             #319          // %ticketObjectId%
  #319 = Utf8               %ticketObjectId%
  #320 = String             #321          // CalculateWin
  #321 = Utf8               CalculateWin
  #322 = Methodref          #38.#323      // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #323 = NameAndType        #324:#325     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #324 = Utf8               destroyItem
  #325 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #326 = Double             0.01d
  #328 = Methodref          #38.#329      // ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
  #329 = NameAndType        #330:#331     // addAdena:(IZ)V
  #330 = Utf8               addAdena
  #331 = Utf8               (IZ)V
  #332 = String             #333          // ViewHistory
  #333 = Utf8               ViewHistory
  #334 = Methodref          #16.#335      // ext/mods/gameserver/data/manager/DerbyTrackManager.getLastHistoryEntries:()Ljava/util/List;
  #335 = NameAndType        #336:#198     // getLastHistoryEntries:()Ljava/util/List;
  #336 = Utf8               getLastHistoryEntries
  #337 = InterfaceMethodref #200.#338     // java/util/List.iterator:()Ljava/util/Iterator;
  #338 = NameAndType        #339:#340     // iterator:()Ljava/util/Iterator;
  #339 = Utf8               iterator
  #340 = Utf8               ()Ljava/util/Iterator;
  #341 = InterfaceMethodref #342.#343     // java/util/Iterator.hasNext:()Z
  #342 = Class              #344          // java/util/Iterator
  #343 = NameAndType        #345:#346     // hasNext:()Z
  #344 = Utf8               java/util/Iterator
  #345 = Utf8               hasNext
  #346 = Utf8               ()Z
  #347 = InterfaceMethodref #342.#348     // java/util/Iterator.next:()Ljava/lang/Object;
  #348 = NameAndType        #349:#350     // next:()Ljava/lang/Object;
  #349 = Utf8               next
  #350 = Utf8               ()Ljava/lang/Object;
  #351 = String             #352          // <tr><td><font color=\"LEVEL\">
  #352 = Utf8               <tr><td><font color=\"LEVEL\">
  #353 = Methodref          #305.#354     // ext/mods/gameserver/model/HistoryInfo.getRaceId:()I
  #354 = NameAndType        #355:#78      // getRaceId:()I
  #355 = Utf8               getRaceId
  #356 = String             #357          // </font> th</td><td><font color=\"LEVEL\">
  #357 = Utf8               </font> th</td><td><font color=\"LEVEL\">
  #358 = String             #359          // </font> Lane </td><td><font color=\"LEVEL\">
  #359 = Utf8               </font> Lane </td><td><font color=\"LEVEL\">
  #360 = Methodref          #305.#361     // ext/mods/gameserver/model/HistoryInfo.getSecond:()I
  #361 = NameAndType        #362:#78      // getSecond:()I
  #362 = Utf8               getSecond
  #363 = String             #364          // </font> Lane</td><td align=right><font color=00ffff>
  #364 = Utf8               </font> Lane</td><td align=right><font color=00ffff>
  #365 = String             #366          // </font> Times</td></tr>
  #366 = Utf8               </font> Times</td></tr>
  #367 = String             #368          // %infos%
  #368 = Utf8               %infos%
  #369 = Methodref          #16.#370      // ext/mods/gameserver/data/manager/DerbyTrackManager.getRacePacket:()Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
  #370 = NameAndType        #371:#372     // getRacePacket:()Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
  #371 = Utf8               getRacePacket
  #372 = Utf8               ()Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
  #373 = Methodref          #2.#374       // ext/mods/gameserver/model/actor/instance/Folk.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #374 = NameAndType        #375:#376     // removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #375 = Utf8               removeKnownObject
  #376 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #377 = Methodref          #16.#378      // ext/mods/gameserver/data/manager/DerbyTrackManager.getRunners:()Ljava/util/List;
  #378 = NameAndType        #379:#198     // getRunners:()Ljava/util/List;
  #379 = Utf8               getRunners
  #380 = Class              #381          // ext/mods/gameserver/model/actor/Npc
  #381 = Utf8               ext/mods/gameserver/model/actor/Npc
  #382 = Class              #383          // ext/mods/gameserver/network/serverpackets/DeleteObject
  #383 = Utf8               ext/mods/gameserver/network/serverpackets/DeleteObject
  #384 = Methodref          #382.#385     // ext/mods/gameserver/network/serverpackets/DeleteObject."<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #385 = NameAndType        #5:#376       // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #386 = Integer            50000
  #387 = Integer            100000
  #388 = Utf8               Code
  #389 = Utf8               LineNumberTable
  #390 = Utf8               LocalVariableTable
  #391 = Utf8               this
  #392 = Utf8               Lext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc;
  #393 = Utf8               objectId
  #394 = Utf8               I
  #395 = Utf8               template
  #396 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #397 = Utf8               n
  #398 = Utf8               search
  #399 = Utf8               Ljava/lang/String;
  #400 = Utf8               i
  #401 = Utf8               price
  #402 = Utf8               tax
  #403 = Utf8               total
  #404 = Utf8               lane
  #405 = Utf8               priceId
  #406 = Utf8               ticket
  #407 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #408 = Utf8               val
  #409 = Utf8               npcId
  #410 = Utf8               html
  #411 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #412 = Utf8               odd
  #413 = Utf8               D
  #414 = Utf8               sb
  #415 = Utf8               Ljava/lang/StringBuilder;
  #416 = Utf8               raceId
  #417 = Utf8               bet
  #418 = Utf8               info
  #419 = Utf8               Lext/mods/gameserver/model/HistoryInfo;
  #420 = Utf8               raceNumber
  #421 = Utf8               player
  #422 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #423 = Utf8               command
  #424 = Utf8               StackMapTable
  #425 = Class              #426          // "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
  #426 = Utf8               [Lext/mods/gameserver/model/item/instance/ItemInstance;
  #427 = Class              #428          // "[Ljava/lang/Object;"
  #428 = Utf8               [Ljava/lang/Object;
  #429 = Utf8               addKnownObject
  #430 = Utf8               objectPlayer
  #431 = Utf8               object
  #432 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #433 = Utf8               npc
  #434 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #435 = Utf8               <clinit>
  #436 = Utf8               SourceFile
  #437 = Utf8               DerbyTrackManagerNpc.java
  #438 = Utf8               BootstrapMethods
  #439 = String             #440          // Mob\u0001
  #440 = Utf8               Mob\u0001
  #441 = String             #442          // Odd\u0001
  #442 = Utf8               Odd\u0001
  #443 = MethodHandle       6:#444        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #444 = Methodref          #445.#446     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #445 = Class              #447          // java/lang/invoke/StringConcatFactory
  #446 = NameAndType        #101:#448     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #447 = Utf8               java/lang/invoke/StringConcatFactory
  #448 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #449 = Utf8               InnerClasses
  #450 = Utf8               RaceState
  #451 = Class              #452          // java/lang/invoke/MethodHandles$Lookup
  #452 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #453 = Class              #454          // java/lang/invoke/MethodHandles
  #454 = Utf8               java/lang/invoke/MethodHandles
  #455 = Utf8               Lookup
{
  protected static final int[] TICKET_PRICES;
    descriptor: [I
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.model.actor.instance.DerbyTrackManagerNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 54: 0
        line 55: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=11, args_size=3
         0: aload_2
         1: ldc           #7                  // String BuyTicket
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          691
         9: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
        12: invokevirtual #21                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getCurrentRaceState:()Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        15: getstatic     #25                 // Field ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        18: if_acmpeq     36
        21: aload_1
        22: getstatic     #31                 // Field ext/mods/gameserver/network/SystemMessageId.MONSRACE_TICKETS_NOT_AVAILABLE:Lext/mods/gameserver/network/SystemMessageId;
        25: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        28: aload_0
        29: aload_1
        30: ldc           #43                 // String Chat 0
        32: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        35: return
        36: aload_2
        37: bipush        10
        39: invokevirtual #49                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        42: invokestatic  #53                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        45: istore_3
        46: iload_3
        47: ifne          62
        50: aload_1
        51: iconst_0
        52: iconst_0
        53: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.setRace:(II)V
        56: aload_1
        57: iconst_1
        58: iconst_0
        59: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.setRace:(II)V
        62: iload_3
        63: bipush        10
        65: if_icmpne     76
        68: aload_1
        69: iconst_0
        70: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
        73: ifeq          98
        76: iload_3
        77: bipush        20
        79: if_icmpne     100
        82: aload_1
        83: iconst_0
        84: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
        87: ifne          100
        90: aload_1
        91: iconst_1
        92: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
        95: ifne          100
        98: iconst_0
        99: istore_3
       100: aload_0
       101: invokevirtual #67                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       104: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
       107: istore        4
       109: new           #79                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       112: dup
       113: aload_0
       114: invokevirtual #81                 // Method getObjectId:()I
       117: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       120: astore        7
       122: iload_3
       123: bipush        10
       125: if_icmpge     228
       128: aload         7
       130: aload_1
       131: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       134: aload_0
       135: aload_1
       136: iload         4
       138: iconst_2
       139: invokevirtual #91                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       142: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       145: iconst_0
       146: istore        8
       148: iload         8
       150: bipush        8
       152: if_icmpge     191
       155: iload         8
       157: iconst_1
       158: iadd
       159: istore        9
       161: iload         9
       163: invokedynamic #99,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       168: astore        5
       170: aload         7
       172: aload         5
       174: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       177: iload         8
       179: invokevirtual #102                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRunnerName:(I)Ljava/lang/String;
       182: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       185: iinc          8, 1
       188: goto          148
       191: ldc           #109                // String No1
       193: astore        5
       195: iload_3
       196: ifne          211
       199: aload         7
       201: aload         5
       203: ldc           #111                // String
       205: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       208: goto          651
       211: aload         7
       213: aload         5
       215: iload_3
       216: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       219: aload_1
       220: iconst_0
       221: iload_3
       222: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.setRace:(II)V
       225: goto          651
       228: iload_3
       229: bipush        20
       231: if_icmpge     349
       234: aload_1
       235: iconst_0
       236: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       239: ifne          243
       242: return
       243: aload         7
       245: aload_1
       246: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       249: aload_0
       250: aload_1
       251: iload         4
       253: iconst_3
       254: invokevirtual #91                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       257: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       260: aload         7
       262: ldc           #116                // String 0place
       264: aload_1
       265: iconst_0
       266: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       269: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       272: ldc           #118                // String Mob1
       274: astore        5
       276: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       279: aload_1
       280: iconst_0
       281: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       284: iconst_1
       285: isub
       286: invokevirtual #102                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRunnerName:(I)Ljava/lang/String;
       289: astore        6
       291: aload         7
       293: aload         5
       295: aload         6
       297: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       300: ldc           #120                // String 0adena
       302: astore        5
       304: iload_3
       305: bipush        10
       307: if_icmpne     322
       310: aload         7
       312: aload         5
       314: ldc           #111                // String
       316: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       319: goto          651
       322: aload         7
       324: aload         5
       326: getstatic     #122                // Field TICKET_PRICES:[I
       329: iload_3
       330: bipush        11
       332: isub
       333: iaload
       334: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       337: aload_1
       338: iconst_1
       339: iload_3
       340: bipush        10
       342: isub
       343: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.setRace:(II)V
       346: goto          651
       349: iload_3
       350: bipush        20
       352: if_icmpne     494
       355: aload_1
       356: iconst_0
       357: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       360: ifeq          371
       363: aload_1
       364: iconst_1
       365: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       368: ifne          372
       371: return
       372: aload         7
       374: aload_1
       375: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       378: aload_0
       379: aload_1
       380: iload         4
       382: iconst_4
       383: invokevirtual #91                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       386: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       389: aload         7
       391: ldc           #116                // String 0place
       393: aload_1
       394: iconst_0
       395: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       398: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       401: ldc           #118                // String Mob1
       403: astore        5
       405: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       408: aload_1
       409: iconst_0
       410: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       413: iconst_1
       414: isub
       415: invokevirtual #102                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRunnerName:(I)Ljava/lang/String;
       418: astore        6
       420: aload         7
       422: aload         5
       424: aload         6
       426: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       429: ldc           #120                // String 0adena
       431: astore        5
       433: getstatic     #122                // Field TICKET_PRICES:[I
       436: aload_1
       437: iconst_1
       438: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       441: iconst_1
       442: isub
       443: iaload
       444: istore        8
       446: aload         7
       448: aload         5
       450: iload         8
       452: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       455: ldc           #126                // String 0tax
       457: astore        5
       459: iconst_0
       460: istore        9
       462: aload         7
       464: aload         5
       466: iload         9
       468: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       471: ldc           #128                // String 0total
       473: astore        5
       475: iload         8
       477: iload         9
       479: iadd
       480: istore        10
       482: aload         7
       484: aload         5
       486: iload         10
       488: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       491: goto          651
       494: aload_1
       495: iconst_0
       496: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       499: ifeq          510
       502: aload_1
       503: iconst_1
       504: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       507: ifne          511
       510: return
       511: aload_1
       512: iconst_0
       513: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       516: istore        8
       518: aload_1
       519: iconst_1
       520: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getRace:(I)I
       523: istore        9
       525: aload_1
       526: getstatic     #122                // Field TICKET_PRICES:[I
       529: iload         9
       531: iconst_1
       532: isub
       533: iaload
       534: iconst_1
       535: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       538: ifne          542
       541: return
       542: aload_1
       543: iconst_0
       544: iconst_0
       545: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.setRace:(II)V
       548: aload_1
       549: iconst_1
       550: iconst_0
       551: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.setRace:(II)V
       554: aload_1
       555: sipush        4443
       558: iconst_1
       559: iconst_0
       560: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       563: astore        10
       565: aload         10
       567: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       570: invokevirtual #138                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRaceNumber:()I
       573: aload_1
       574: invokevirtual #141                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       577: aload         10
       579: iload         8
       581: invokevirtual #147                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType1:(I)V
       584: aload         10
       586: getstatic     #122                // Field TICKET_PRICES:[I
       589: iload         9
       591: iconst_1
       592: isub
       593: iaload
       594: bipush        100
       596: idiv
       597: invokevirtual #150                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType2:(I)V
       600: aload_1
       601: getstatic     #153                // Field ext/mods/gameserver/network/SystemMessageId.ACQUIRED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
       604: invokestatic  #156                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       607: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       610: invokevirtual #138                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRaceNumber:()I
       613: invokevirtual #162                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       616: sipush        4443
       619: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       622: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       625: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       628: iload         8
       630: getstatic     #122                // Field TICKET_PRICES:[I
       633: iload         9
       635: iconst_1
       636: isub
       637: iaload
       638: i2l
       639: iconst_1
       640: invokevirtual #172                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.setBetOnLane:(IJZ)V
       643: aload_0
       644: aload_1
       645: ldc           #43                 // String Chat 0
       647: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       650: return
       651: aload         7
       653: ldc           #176                // String 1race
       655: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       658: invokevirtual #138                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRaceNumber:()I
       661: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       664: aload         7
       666: ldc           #178                // String %objectId%
       668: aload_0
       669: invokevirtual #81                 // Method getObjectId:()I
       672: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       675: aload_1
       676: aload         7
       678: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       681: aload_1
       682: getstatic     #180                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       685: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       688: goto          1955
       691: aload_2
       692: ldc           #186                // String ShowOdds
       694: invokevirtual #188                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       697: ifeq          902
       700: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       703: invokevirtual #21                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getCurrentRaceState:()Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
       706: getstatic     #25                 // Field ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
       709: if_acmpne     727
       712: aload_1
       713: getstatic     #192                // Field ext/mods/gameserver/network/SystemMessageId.MONSRACE_NO_PAYOUT_INFO:Lext/mods/gameserver/network/SystemMessageId;
       716: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       719: aload_0
       720: aload_1
       721: ldc           #43                 // String Chat 0
       723: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       726: return
       727: new           #79                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       730: dup
       731: aload_0
       732: invokevirtual #81                 // Method getObjectId:()I
       735: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       738: astore_3
       739: aload_3
       740: aload_1
       741: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       744: aload_0
       745: aload_1
       746: aload_0
       747: invokevirtual #67                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       750: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
       753: iconst_5
       754: invokevirtual #91                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       757: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       760: iconst_0
       761: istore        4
       763: iload         4
       765: bipush        8
       767: if_icmpge     865
       770: iload         4
       772: iconst_1
       773: iadd
       774: istore        5
       776: aload_3
       777: iload         5
       779: invokedynamic #99,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       784: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       787: iload         4
       789: invokevirtual #102                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRunnerName:(I)Ljava/lang/String;
       792: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       795: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       798: invokevirtual #195                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getOdds:()Ljava/util/List;
       801: iload         4
       803: invokeinterface #199,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       808: checkcast     #205                // class java/lang/Double
       811: invokevirtual #207                // Method java/lang/Double.doubleValue:()D
       814: dstore        6
       816: aload_3
       817: iload         5
       819: invokedynamic #211,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       824: dload         6
       826: dconst_0
       827: dcmpl
       828: ifle          854
       831: getstatic     #212                // Field java/util/Locale.ENGLISH:Ljava/util/Locale;
       834: ldc           #218                // String %.1f
       836: iconst_1
       837: anewarray     #220                // class java/lang/Object
       840: dup
       841: iconst_0
       842: dload         6
       844: invokestatic  #222                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       847: aastore
       848: invokestatic  #226                // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       851: goto          856
       854: ldc           #230                // String &$804;
       856: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       859: iinc          4, 1
       862: goto          763
       865: aload_3
       866: ldc           #176                // String 1race
       868: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       871: invokevirtual #138                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRaceNumber:()I
       874: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       877: aload_3
       878: ldc           #178                // String %objectId%
       880: aload_0
       881: invokevirtual #81                 // Method getObjectId:()I
       884: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       887: aload_1
       888: aload_3
       889: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       892: aload_1
       893: getstatic     #180                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       896: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       899: goto          1955
       902: aload_2
       903: ldc           #232                // String ShowInfo
       905: invokevirtual #188                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       908: ifeq          1015
       911: new           #79                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       914: dup
       915: aload_0
       916: invokevirtual #81                 // Method getObjectId:()I
       919: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       922: astore_3
       923: aload_3
       924: aload_1
       925: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       928: aload_0
       929: aload_1
       930: aload_0
       931: invokevirtual #67                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       934: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
       937: bipush        6
       939: invokevirtual #91                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       942: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       945: iconst_0
       946: istore        4
       948: iload         4
       950: bipush        8
       952: if_icmpge     990
       955: iload         4
       957: iconst_1
       958: iadd
       959: istore        5
       961: iload         5
       963: invokedynamic #99,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       968: astore        6
       970: aload_3
       971: aload         6
       973: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
       976: iload         4
       978: invokevirtual #102                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRunnerName:(I)Ljava/lang/String;
       981: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       984: iinc          4, 1
       987: goto          948
       990: aload_3
       991: ldc           #178                // String %objectId%
       993: aload_0
       994: invokevirtual #81                 // Method getObjectId:()I
       997: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1000: aload_1
      1001: aload_3
      1002: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1005: aload_1
      1006: getstatic     #180                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1009: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1012: goto          1955
      1015: aload_2
      1016: ldc           #234                // String ShowTickets
      1018: invokevirtual #188                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1021: ifeq          1252
      1024: new           #236                // class java/lang/StringBuilder
      1027: dup
      1028: invokespecial #238                // Method java/lang/StringBuilder."<init>":()V
      1031: astore_3
      1032: aload_1
      1033: invokevirtual #241                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1036: sipush        4443
      1039: invokevirtual #245                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAllItemsByItemId:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
      1042: astore        4
      1044: aload         4
      1046: arraylength
      1047: istore        5
      1049: iconst_0
      1050: istore        6
      1052: iload         6
      1054: iload         5
      1056: if_icmpge     1177
      1059: aload         4
      1061: iload         6
      1063: aaload
      1064: astore        7
      1066: aload         7
      1068: invokevirtual #251                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
      1071: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
      1074: invokevirtual #138                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRaceNumber:()I
      1077: if_icmpne     1083
      1080: goto          1171
      1083: aload_3
      1084: bipush        9
      1086: anewarray     #220                // class java/lang/Object
      1089: dup
      1090: iconst_0
      1091: ldc           #254                // String <tr><td><a action=\"bypass -h npc_%objectId%_ShowTicket
      1093: aastore
      1094: dup
      1095: iconst_1
      1096: aload         7
      1098: invokevirtual #256                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
      1101: invokestatic  #257                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1104: aastore
      1105: dup
      1106: iconst_2
      1107: ldc_w         #260                // String \">
      1110: aastore
      1111: dup
      1112: iconst_3
      1113: aload         7
      1115: invokevirtual #251                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
      1118: invokestatic  #257                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1121: aastore
      1122: dup
      1123: iconst_4
      1124: ldc_w         #262                // String  Race Number</a></td><td align=right><font color=\"LEVEL\">
      1127: aastore
      1128: dup
      1129: iconst_5
      1130: aload         7
      1132: invokevirtual #264                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
      1135: invokestatic  #257                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1138: aastore
      1139: dup
      1140: bipush        6
      1142: ldc_w         #267                // String </font> Number</td><td align=right><font color=\"LEVEL\">
      1145: aastore
      1146: dup
      1147: bipush        7
      1149: aload         7
      1151: invokevirtual #269                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
      1154: bipush        100
      1156: imul
      1157: invokestatic  #257                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1160: aastore
      1161: dup
      1162: bipush        8
      1164: ldc_w         #272                // String </font> Adena</td></tr>
      1167: aastore
      1168: invokestatic  #274                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
      1171: iinc          6, 1
      1174: goto          1052
      1177: new           #79                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1180: dup
      1181: aload_0
      1182: invokevirtual #81                 // Method getObjectId:()I
      1185: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1188: astore        4
      1190: aload         4
      1192: aload_1
      1193: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1196: aload_0
      1197: aload_1
      1198: aload_0
      1199: invokevirtual #67                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
      1202: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
      1205: bipush        7
      1207: invokevirtual #91                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
      1210: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1213: aload         4
      1215: ldc_w         #280                // String %tickets%
      1218: aload_3
      1219: invokevirtual #282                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1222: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1225: aload         4
      1227: ldc           #178                // String %objectId%
      1229: aload_0
      1230: invokevirtual #81                 // Method getObjectId:()I
      1233: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1236: aload_1
      1237: aload         4
      1239: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1242: aload_1
      1243: getstatic     #180                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1246: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1249: goto          1955
      1252: aload_2
      1253: ldc_w         #286                // String ShowTicket
      1256: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1259: ifeq          1521
      1262: aload_2
      1263: bipush        11
      1265: invokevirtual #49                 // Method java/lang/String.substring:(I)Ljava/lang/String;
      1268: invokestatic  #53                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1271: istore_3
      1272: iload_3
      1273: ifne          1284
      1276: aload_0
      1277: aload_1
      1278: ldc           #43                 // String Chat 0
      1280: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1283: return
      1284: aload_1
      1285: invokevirtual #241                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1288: iload_3
      1289: invokevirtual #288                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1292: astore        4
      1294: aload         4
      1296: ifnonnull     1307
      1299: aload_0
      1300: aload_1
      1301: ldc           #43                 // String Chat 0
      1303: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1306: return
      1307: aload         4
      1309: invokevirtual #251                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
      1312: istore        5
      1314: aload         4
      1316: invokevirtual #264                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
      1319: istore        6
      1321: aload         4
      1323: invokevirtual #269                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
      1326: bipush        100
      1328: imul
      1329: istore        7
      1331: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
      1334: iload         5
      1336: invokevirtual #292                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getHistoryInfo:(I)Lext/mods/gameserver/model/HistoryInfo;
      1339: astore        8
      1341: aload         8
      1343: ifnonnull     1354
      1346: aload_0
      1347: aload_1
      1348: ldc           #43                 // String Chat 0
      1350: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1353: return
      1354: new           #79                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1357: dup
      1358: aload_0
      1359: invokevirtual #81                 // Method getObjectId:()I
      1362: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1365: astore        9
      1367: aload         9
      1369: aload_1
      1370: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1373: aload_0
      1374: aload_1
      1375: aload_0
      1376: invokevirtual #67                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
      1379: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
      1382: bipush        8
      1384: invokevirtual #91                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
      1387: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1390: aload         9
      1392: ldc_w         #296                // String %raceId%
      1395: iload         5
      1397: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1400: aload         9
      1402: ldc_w         #298                // String %lane%
      1405: iload         6
      1407: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1410: aload         9
      1412: ldc_w         #300                // String %bet%
      1415: iload         7
      1417: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1420: aload         9
      1422: ldc_w         #302                // String %firstLane%
      1425: aload         8
      1427: invokevirtual #304                // Method ext/mods/gameserver/model/HistoryInfo.getFirst:()I
      1430: iconst_1
      1431: iadd
      1432: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1435: aload         9
      1437: ldc_w         #309                // String %odd%
      1440: iload         6
      1442: aload         8
      1444: invokevirtual #304                // Method ext/mods/gameserver/model/HistoryInfo.getFirst:()I
      1447: iconst_1
      1448: iadd
      1449: if_icmpne     1479
      1452: getstatic     #212                // Field java/util/Locale.ENGLISH:Ljava/util/Locale;
      1455: ldc_w         #311                // String %.2f
      1458: iconst_1
      1459: anewarray     #220                // class java/lang/Object
      1462: dup
      1463: iconst_0
      1464: aload         8
      1466: invokevirtual #313                // Method ext/mods/gameserver/model/HistoryInfo.getOddRate:()D
      1469: invokestatic  #222                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
      1472: aastore
      1473: invokestatic  #226                // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      1476: goto          1482
      1479: ldc_w         #316                // String 0.01
      1482: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1485: aload         9
      1487: ldc           #178                // String %objectId%
      1489: aload_0
      1490: invokevirtual #81                 // Method getObjectId:()I
      1493: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1496: aload         9
      1498: ldc_w         #318                // String %ticketObjectId%
      1501: iload_3
      1502: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1505: aload_1
      1506: aload         9
      1508: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1511: aload_1
      1512: getstatic     #180                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1515: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1518: goto          1955
      1521: aload_2
      1522: ldc_w         #320                // String CalculateWin
      1525: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1528: ifeq          1676
      1531: aload_2
      1532: bipush        13
      1534: invokevirtual #49                 // Method java/lang/String.substring:(I)Ljava/lang/String;
      1537: invokestatic  #53                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1540: istore_3
      1541: iload_3
      1542: ifne          1553
      1545: aload_0
      1546: aload_1
      1547: ldc           #43                 // String Chat 0
      1549: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1552: return
      1553: aload_1
      1554: invokevirtual #241                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1557: iload_3
      1558: invokevirtual #288                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1561: astore        4
      1563: aload         4
      1565: ifnonnull     1576
      1568: aload_0
      1569: aload_1
      1570: ldc           #43                 // String Chat 0
      1572: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1575: return
      1576: aload         4
      1578: invokevirtual #251                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
      1581: istore        5
      1583: aload         4
      1585: invokevirtual #264                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
      1588: istore        6
      1590: aload         4
      1592: invokevirtual #269                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
      1595: bipush        100
      1597: imul
      1598: istore        7
      1600: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
      1603: iload         5
      1605: invokevirtual #292                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getHistoryInfo:(I)Lext/mods/gameserver/model/HistoryInfo;
      1608: astore        8
      1610: aload         8
      1612: ifnonnull     1623
      1615: aload_0
      1616: aload_1
      1617: ldc           #43                 // String Chat 0
      1619: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1622: return
      1623: aload_1
      1624: aload         4
      1626: iconst_1
      1627: invokevirtual #322                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
      1630: ifeq          1666
      1633: aload_1
      1634: iload         7
      1636: i2d
      1637: iload         6
      1639: aload         8
      1641: invokevirtual #304                // Method ext/mods/gameserver/model/HistoryInfo.getFirst:()I
      1644: iconst_1
      1645: iadd
      1646: if_icmpne     1657
      1649: aload         8
      1651: invokevirtual #313                // Method ext/mods/gameserver/model/HistoryInfo.getOddRate:()D
      1654: goto          1660
      1657: ldc2_w        #326                // double 0.01d
      1660: dmul
      1661: d2i
      1662: iconst_1
      1663: invokevirtual #328                // Method ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
      1666: aload_0
      1667: aload_1
      1668: ldc           #43                 // String Chat 0
      1670: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1673: goto          1955
      1676: aload_2
      1677: ldc_w         #332                // String ViewHistory
      1680: invokevirtual #188                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1683: ifeq          1949
      1686: new           #236                // class java/lang/StringBuilder
      1689: dup
      1690: invokespecial #238                // Method java/lang/StringBuilder."<init>":()V
      1693: astore_3
      1694: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
      1697: invokevirtual #138                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRaceNumber:()I
      1700: istore        4
      1702: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
      1705: invokevirtual #334                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getLastHistoryEntries:()Ljava/util/List;
      1708: invokeinterface #337,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      1713: astore        5
      1715: aload         5
      1717: invokeinterface #341,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1722: ifeq          1874
      1725: aload         5
      1727: invokeinterface #347,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1732: checkcast     #305                // class ext/mods/gameserver/model/HistoryInfo
      1735: astore        6
      1737: aload_3
      1738: bipush        9
      1740: anewarray     #220                // class java/lang/Object
      1743: dup
      1744: iconst_0
      1745: ldc_w         #351                // String <tr><td><font color=\"LEVEL\">
      1748: aastore
      1749: dup
      1750: iconst_1
      1751: aload         6
      1753: invokevirtual #353                // Method ext/mods/gameserver/model/HistoryInfo.getRaceId:()I
      1756: invokestatic  #257                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1759: aastore
      1760: dup
      1761: iconst_2
      1762: ldc_w         #356                // String </font> th</td><td><font color=\"LEVEL\">
      1765: aastore
      1766: dup
      1767: iconst_3
      1768: iload         4
      1770: aload         6
      1772: invokevirtual #353                // Method ext/mods/gameserver/model/HistoryInfo.getRaceId:()I
      1775: if_icmpne     1782
      1778: iconst_0
      1779: goto          1789
      1782: aload         6
      1784: invokevirtual #304                // Method ext/mods/gameserver/model/HistoryInfo.getFirst:()I
      1787: iconst_1
      1788: iadd
      1789: invokestatic  #257                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1792: aastore
      1793: dup
      1794: iconst_4
      1795: ldc_w         #358                // String </font> Lane </td><td><font color=\"LEVEL\">
      1798: aastore
      1799: dup
      1800: iconst_5
      1801: iload         4
      1803: aload         6
      1805: invokevirtual #353                // Method ext/mods/gameserver/model/HistoryInfo.getRaceId:()I
      1808: if_icmpne     1815
      1811: iconst_0
      1812: goto          1822
      1815: aload         6
      1817: invokevirtual #360                // Method ext/mods/gameserver/model/HistoryInfo.getSecond:()I
      1820: iconst_1
      1821: iadd
      1822: invokestatic  #257                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1825: aastore
      1826: dup
      1827: bipush        6
      1829: ldc_w         #363                // String </font> Lane</td><td align=right><font color=00ffff>
      1832: aastore
      1833: dup
      1834: bipush        7
      1836: getstatic     #212                // Field java/util/Locale.ENGLISH:Ljava/util/Locale;
      1839: ldc_w         #311                // String %.2f
      1842: iconst_1
      1843: anewarray     #220                // class java/lang/Object
      1846: dup
      1847: iconst_0
      1848: aload         6
      1850: invokevirtual #313                // Method ext/mods/gameserver/model/HistoryInfo.getOddRate:()D
      1853: invokestatic  #222                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
      1856: aastore
      1857: invokestatic  #226                // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      1860: aastore
      1861: dup
      1862: bipush        8
      1864: ldc_w         #365                // String </font> Times</td></tr>
      1867: aastore
      1868: invokestatic  #274                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
      1871: goto          1715
      1874: new           #79                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1877: dup
      1878: aload_0
      1879: invokevirtual #81                 // Method getObjectId:()I
      1882: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1885: astore        5
      1887: aload         5
      1889: aload_1
      1890: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1893: aload_0
      1894: aload_1
      1895: aload_0
      1896: invokevirtual #67                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
      1899: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
      1902: bipush        9
      1904: invokevirtual #91                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
      1907: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1910: aload         5
      1912: ldc_w         #367                // String %infos%
      1915: aload_3
      1916: invokevirtual #282                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1919: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1922: aload         5
      1924: ldc           #178                // String %objectId%
      1926: aload_0
      1927: invokevirtual #81                 // Method getObjectId:()I
      1930: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1933: aload_1
      1934: aload         5
      1936: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1939: aload_1
      1940: getstatic     #180                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1943: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1946: goto          1955
      1949: aload_0
      1950: aload_1
      1951: aload_2
      1952: invokespecial #45                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1955: return
      LineNumberTable:
        line 60: 0
        line 62: 9
        line 64: 21
        line 65: 28
        line 66: 35
        line 69: 36
        line 70: 46
        line 72: 50
        line 73: 56
        line 76: 62
        line 77: 98
        line 79: 100
        line 84: 109
        line 86: 122
        line 88: 128
        line 89: 145
        line 91: 155
        line 92: 161
        line 93: 170
        line 89: 185
        line 95: 191
        line 96: 195
        line 97: 199
        line 100: 211
        line 101: 219
        line 104: 228
        line 106: 234
        line 107: 242
        line 109: 243
        line 110: 260
        line 111: 272
        line 112: 276
        line 113: 291
        line 114: 300
        line 116: 304
        line 117: 310
        line 120: 322
        line 121: 337
        line 124: 349
        line 126: 355
        line 127: 371
        line 129: 372
        line 130: 389
        line 131: 401
        line 132: 405
        line 133: 420
        line 134: 429
        line 135: 433
        line 136: 446
        line 137: 455
        line 138: 459
        line 139: 462
        line 140: 471
        line 141: 475
        line 142: 482
        line 143: 491
        line 146: 494
        line 147: 510
        line 149: 511
        line 150: 518
        line 152: 525
        line 153: 541
        line 155: 542
        line 156: 548
        line 158: 554
        line 159: 565
        line 160: 577
        line 161: 584
        line 163: 600
        line 165: 625
        line 166: 643
        line 167: 650
        line 169: 651
        line 170: 664
        line 171: 675
        line 172: 681
        line 173: 688
        line 174: 691
        line 176: 700
        line 178: 712
        line 179: 719
        line 180: 726
        line 183: 727
        line 184: 739
        line 185: 760
        line 187: 770
        line 189: 776
        line 191: 795
        line 192: 816
        line 185: 859
        line 194: 865
        line 195: 877
        line 196: 887
        line 197: 892
        line 198: 899
        line 199: 902
        line 201: 911
        line 202: 923
        line 204: 945
        line 206: 955
        line 207: 961
        line 208: 970
        line 204: 984
        line 210: 990
        line 211: 1000
        line 212: 1005
        line 213: 1012
        line 214: 1015
        line 216: 1024
        line 218: 1032
        line 220: 1066
        line 221: 1080
        line 223: 1083
        line 218: 1171
        line 226: 1177
        line 227: 1190
        line 228: 1213
        line 229: 1225
        line 230: 1236
        line 231: 1242
        line 232: 1249
        line 233: 1252
        line 235: 1262
        line 236: 1272
        line 238: 1276
        line 239: 1283
        line 242: 1284
        line 243: 1294
        line 245: 1299
        line 246: 1306
        line 249: 1307
        line 250: 1314
        line 251: 1321
        line 253: 1331
        line 254: 1341
        line 256: 1346
        line 257: 1353
        line 260: 1354
        line 261: 1367
        line 262: 1390
        line 263: 1400
        line 264: 1410
        line 265: 1420
        line 266: 1435
        line 267: 1485
        line 268: 1496
        line 269: 1505
        line 270: 1511
        line 271: 1518
        line 272: 1521
        line 274: 1531
        line 275: 1541
        line 277: 1545
        line 278: 1552
        line 281: 1553
        line 282: 1563
        line 284: 1568
        line 285: 1575
        line 288: 1576
        line 289: 1583
        line 290: 1590
        line 292: 1600
        line 293: 1610
        line 295: 1615
        line 296: 1622
        line 299: 1623
        line 300: 1633
        line 302: 1666
        line 303: 1673
        line 304: 1676
        line 306: 1686
        line 308: 1694
        line 310: 1702
        line 311: 1737
        line 313: 1874
        line 314: 1887
        line 315: 1910
        line 316: 1922
        line 317: 1933
        line 318: 1939
        line 319: 1946
        line 321: 1949
        line 322: 1955
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          161      24     9     n   I
          170      21     5 search   Ljava/lang/String;
          148      43     8     i   I
          195      33     5 search   Ljava/lang/String;
          276      73     5 search   Ljava/lang/String;
          291      58     6 replace   Ljava/lang/String;
          446      45     8 price   I
          462      29     9   tax   I
          482       9    10 total   I
          405      89     5 search   Ljava/lang/String;
          420      74     6 replace   Ljava/lang/String;
          518     133     8  lane   I
          525     126     9 priceId   I
          565      86    10 ticket   Lext/mods/gameserver/model/item/instance/ItemInstance;
           46     642     3   val   I
          109     579     4 npcId   I
          651      37     5 search   Ljava/lang/String;
          122     566     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          776      83     5     n   I
          816      43     6   odd   D
          763     102     4     i   I
          739     160     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          961      23     5     n   I
          970      14     6 search   Ljava/lang/String;
          948      42     4     i   I
          923      89     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1066     105     7 ticket   Lext/mods/gameserver/model/item/instance/ItemInstance;
         1032     217     3    sb   Ljava/lang/StringBuilder;
         1190      59     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1272     246     3   val   I
         1294     224     4 ticket   Lext/mods/gameserver/model/item/instance/ItemInstance;
         1314     204     5 raceId   I
         1321     197     6  lane   I
         1331     187     7   bet   I
         1341     177     8  info   Lext/mods/gameserver/model/HistoryInfo;
         1367     151     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1541     132     3   val   I
         1563     110     4 ticket   Lext/mods/gameserver/model/item/instance/ItemInstance;
         1583      90     5 raceId   I
         1590      83     6  lane   I
         1600      73     7   bet   I
         1610      63     8  info   Lext/mods/gameserver/model/HistoryInfo;
         1737     134     6  info   Lext/mods/gameserver/model/HistoryInfo;
         1694     252     3    sb   Ljava/lang/StringBuilder;
         1702     244     4 raceNumber   I
         1887      59     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0    1956     0  this   Lext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc;
            0    1956     1 player   Lext/mods/gameserver/model/actor/Player;
            0    1956     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 55
        frame_type = 36 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 21 /* same */
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, int, top, top, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 42
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, int, class java/lang/String, top, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, int, top, top, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, int, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, int, top, top, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 21 /* same */
        frame_type = 0 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 121
        frame_type = 15 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 108
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, int, class java/lang/String, top, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []
        frame_type = 35 /* same */
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 90
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, double ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, double ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 250 /* chop */
          offset_delta = 41
        frame_type = 250 /* chop */
          offset_delta = 24
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/StringBuilder, class "[Lext/mods/gameserver/model/item/instance/ItemInstance;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 87
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 74
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, class ext/mods/gameserver/model/HistoryInfo ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 124
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, class ext/mods/gameserver/model/HistoryInfo, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, class ext/mods/gameserver/model/HistoryInfo, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, class ext/mods/gameserver/model/HistoryInfo ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, class ext/mods/gameserver/model/HistoryInfo ]
          stack = [ class ext/mods/gameserver/model/actor/Player, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, class ext/mods/gameserver/model/HistoryInfo ]
          stack = [ class ext/mods/gameserver/model/actor/Player, double, double ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 38
          locals = [ class java/lang/StringBuilder, int, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/StringBuilder, int, class java/util/Iterator, class ext/mods/gameserver/model/HistoryInfo ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/StringBuilder, int, class java/util/Iterator, class ext/mods/gameserver/model/HistoryInfo ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/StringBuilder, int, class java/util/Iterator, class ext/mods/gameserver/model/HistoryInfo ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/StringBuilder, int, class java/util/Iterator, class ext/mods/gameserver/model/HistoryInfo ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, int ]
        frame_type = 249 /* chop */
          offset_delta = 51
        frame_type = 249 /* chop */
          offset_delta = 74
        frame_type = 5 /* same */

  public void addKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: instanceof    #38                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          22
         7: aload_1
         8: checkcast     #38                 // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
        16: invokevirtual #369                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRacePacket:()Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
        19: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        22: return
      LineNumberTable:
        line 327: 0
        line 328: 12
        line 329: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      10     2 objectPlayer   Lext/mods/gameserver/model/actor/Player;
            0      23     0  this   Lext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc;
            0      23     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public void removeKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #373                // Method ext/mods/gameserver/model/actor/instance/Folk.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
         5: aload_1
         6: instanceof    #38                 // class ext/mods/gameserver/model/actor/Player
         9: ifeq          65
        12: aload_1
        13: checkcast     #38                 // class ext/mods/gameserver/model/actor/Player
        16: astore_2
        17: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
        20: invokevirtual #377                // Method ext/mods/gameserver/data/manager/DerbyTrackManager.getRunners:()Ljava/util/List;
        23: invokeinterface #337,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore_3
        29: aload_3
        30: invokeinterface #341,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          65
        38: aload_3
        39: invokeinterface #347,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #380                // class ext/mods/gameserver/model/actor/Npc
        47: astore        4
        49: aload_2
        50: new           #382                // class ext/mods/gameserver/network/serverpackets/DeleteObject
        53: dup
        54: aload         4
        56: invokespecial #384                // Method ext/mods/gameserver/network/serverpackets/DeleteObject."<init>":(Lext/mods/gameserver/model/WorldObject;)V
        59: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        62: goto          29
        65: return
      LineNumberTable:
        line 334: 0
        line 336: 5
        line 338: 17
        line 339: 49
        line 341: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      13     4   npc   Lext/mods/gameserver/model/actor/Npc;
           17      48     2 objectPlayer   Lext/mods/gameserver/model/actor/Player;
            0      66     0  this   Lext/mods/gameserver/model/actor/instance/DerbyTrackManagerNpc;
            0      66     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 35

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        8
         2: newarray       int
         4: dup
         5: iconst_0
         6: bipush        100
         8: iastore
         9: dup
        10: iconst_1
        11: sipush        500
        14: iastore
        15: dup
        16: iconst_2
        17: sipush        1000
        20: iastore
        21: dup
        22: iconst_3
        23: sipush        5000
        26: iastore
        27: dup
        28: iconst_4
        29: sipush        10000
        32: iastore
        33: dup
        34: iconst_5
        35: sipush        20000
        38: iastore
        39: dup
        40: bipush        6
        42: ldc_w         #386                // int 50000
        45: iastore
        46: dup
        47: bipush        7
        49: ldc_w         #387                // int 100000
        52: iastore
        53: putstatic     #122                // Field TICKET_PRICES:[I
        56: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "DerbyTrackManagerNpc.java"
BootstrapMethods:
  0: #443 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #439 Mob\u0001
  1: #443 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #441 Odd\u0001
InnerClasses:
  public static final #450= #26 of #16;   // RaceState=class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState of class ext/mods/gameserver/data/manager/DerbyTrackManager
  public static final #455= #451 of #453; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
