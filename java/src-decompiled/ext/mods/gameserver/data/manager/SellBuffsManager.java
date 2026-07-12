// Bytecode for: ext.mods.gameserver.data.manager.SellBuffsManager
// File: ext\mods\gameserver\data\manager\SellBuffsManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/SellBuffsManager.class
  Last modified 9 de jul de 2026; size 20274 bytes
  MD5 checksum f6f4193840c7f5cc426bc9c5cf53e619
  Compiled from "SellBuffsManager.java"
public class ext.mods.gameserver.data.manager.SellBuffsManager implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/SellBuffsManager
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 25, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/data/manager/SellBuffsManager.load:()V
    #8 = Class              #10           // ext/mods/gameserver/data/manager/SellBuffsManager
    #9 = NameAndType        #11:#6        // load:()V
   #10 = Utf8               ext/mods/gameserver/data/manager/SellBuffsManager
   #11 = Utf8               load
   #12 = Fieldref           #13.#14       // ext/mods/Config.SELLBUFF_ENABLED:Z
   #13 = Class              #15           // ext/mods/Config
   #14 = NameAndType        #16:#17       // SELLBUFF_ENABLED:Z
   #15 = Utf8               ext/mods/Config
   #16 = Utf8               SELLBUFF_ENABLED
   #17 = Utf8               Z
   #18 = Fieldref           #8.#19        // ext/mods/gameserver/data/manager/SellBuffsManager.ALLOWED_BUFFS:Ljava/util/Set;
   #19 = NameAndType        #20:#21       // ALLOWED_BUFFS:Ljava/util/Set;
   #20 = Utf8               ALLOWED_BUFFS
   #21 = Utf8               Ljava/util/Set;
   #22 = InterfaceMethodref #23.#24       // java/util/Set.clear:()V
   #23 = Class              #25           // java/util/Set
   #24 = NameAndType        #26:#6        // clear:()V
   #25 = Utf8               java/util/Set
   #26 = Utf8               clear
   #27 = String             #28           // custom/mods/sellBuffData.xml
   #28 = Utf8               custom/mods/sellBuffData.xml
   #29 = Methodref          #8.#30        // ext/mods/gameserver/data/manager/SellBuffsManager.parseDataFile:(Ljava/lang/String;)V
   #30 = NameAndType        #31:#32       // parseDataFile:(Ljava/lang/String;)V
   #31 = Utf8               parseDataFile
   #32 = Utf8               (Ljava/lang/String;)V
   #33 = Fieldref           #8.#34        // ext/mods/gameserver/data/manager/SellBuffsManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #34 = NameAndType        #35:#36       // LOGGER:Lext/mods/commons/logging/CLogger;
   #35 = Utf8               LOGGER
   #36 = Utf8               Lext/mods/commons/logging/CLogger;
   #37 = Methodref          #2.#38        // java/lang/Object.getClass:()Ljava/lang/Class;
   #38 = NameAndType        #39:#40       // getClass:()Ljava/lang/Class;
   #39 = Utf8               getClass
   #40 = Utf8               ()Ljava/lang/Class;
   #41 = Methodref          #42.#43       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #42 = Class              #44           // java/lang/Class
   #43 = NameAndType        #45:#46       // getSimpleName:()Ljava/lang/String;
   #44 = Utf8               java/lang/Class
   #45 = Utf8               getSimpleName
   #46 = Utf8               ()Ljava/lang/String;
   #47 = InterfaceMethodref #23.#48       // java/util/Set.size:()I
   #48 = NameAndType        #49:#50       // size:()I
   #49 = Utf8               size
   #50 = Utf8               ()I
   #51 = InvokeDynamic      #0:#52        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #52 = NameAndType        #53:#54       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #53 = Utf8               makeConcatWithConstants
   #54 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #55 = Methodref          #56.#57       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #56 = Class              #58           // ext/mods/commons/logging/CLogger
   #57 = NameAndType        #59:#60       // info:(Ljava/lang/Object;)V
   #58 = Utf8               ext/mods/commons/logging/CLogger
   #59 = Utf8               info
   #60 = Utf8               (Ljava/lang/Object;)V
   #61 = String             #62           // list
   #62 = Utf8               list
   #63 = InvokeDynamic      #1:#64        // #1:accept:(Lext/mods/gameserver/data/manager/SellBuffsManager;)Ljava/util/function/Consumer;
   #64 = NameAndType        #65:#66       // accept:(Lext/mods/gameserver/data/manager/SellBuffsManager;)Ljava/util/function/Consumer;
   #65 = Utf8               accept
   #66 = Utf8               (Lext/mods/gameserver/data/manager/SellBuffsManager;)Ljava/util/function/Consumer;
   #67 = Methodref          #8.#68        // ext/mods/gameserver/data/manager/SellBuffsManager.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #68 = NameAndType        #69:#70       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #69 = Utf8               forEach
   #70 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #71 = Methodref          #72.#73       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #72 = Class              #74           // ext/mods/gameserver/data/HTMLData
   #73 = NameAndType        #75:#76       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #74 = Utf8               ext/mods/gameserver/data/HTMLData
   #75 = Utf8               getInstance
   #76 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #77 = Methodref          #78.#79       // ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
   #78 = Class              #80           // ext/mods/gameserver/model/actor/Player
   #79 = NameAndType        #81:#82       // isSellingBuffs:()Z
   #80 = Utf8               ext/mods/gameserver/model/actor/Player
   #81 = Utf8               isSellingBuffs
   #82 = Utf8               ()Z
   #83 = String             #84           // buffmenu_already.htm
   #84 = Utf8               buffmenu_already.htm
   #85 = String             #86           // buffmenu.htm
   #86 = Utf8               buffmenu.htm
   #87 = InvokeDynamic      #2:#88        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #88 = NameAndType        #53:#89       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #89 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #90 = Methodref          #72.#91       // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #91 = NameAndType        #92:#93       // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #92 = Utf8               getHtm
   #93 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #94 = Methodref          #95.#96       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #95 = Class              #97           // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
   #96 = NameAndType        #98:#99       // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #97 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
   #98 = Utf8               separateAndSend
   #99 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #100 = String             #101          // html/mods/sellbuffs/buffchoice.htm
  #101 = Utf8               html/mods/sellbuffs/buffchoice.htm
  #102 = String             #103          // %list%
  #103 = Utf8               %list%
  #104 = Methodref          #8.#105       // ext/mods/gameserver/data/manager/SellBuffsManager.buildSkillMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
  #105 = NameAndType        #106:#107     // buildSkillMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
  #106 = Utf8               buildSkillMenu
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
  #108 = Methodref          #109.#110     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #109 = Class              #111          // java/lang/String
  #110 = NameAndType        #112:#113     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #111 = Utf8               java/lang/String
  #112 = Utf8               replace
  #113 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #114 = Methodref          #8.#115       // ext/mods/gameserver/data/manager/SellBuffsManager.buildEditMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
  #115 = NameAndType        #116:#107     // buildEditMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
  #116 = Utf8               buildEditMenu
  #117 = Methodref          #78.#118      // ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
  #118 = NameAndType        #119:#120     // getSellingBuffs:()Ljava/util/List;
  #119 = Utf8               getSellingBuffs
  #120 = Utf8               ()Ljava/util/List;
  #121 = InterfaceMethodref #122.#123     // java/util/List.isEmpty:()Z
  #122 = Class              #124          // java/util/List
  #123 = NameAndType        #125:#82      // isEmpty:()Z
  #124 = Utf8               java/util/List
  #125 = Utf8               isEmpty
  #126 = String             #127          // html/mods/sellbuffs/buffbuymenu.htm
  #127 = Utf8               html/mods/sellbuffs/buffbuymenu.htm
  #128 = Methodref          #8.#129       // ext/mods/gameserver/data/manager/SellBuffsManager.buildBuffMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
  #129 = NameAndType        #130:#107     // buildBuffMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
  #130 = Utf8               buildBuffMenu
  #131 = Methodref          #78.#132      // ext/mods/gameserver/model/actor/Player.sitDown:()Z
  #132 = NameAndType        #133:#82      // sitDown:()Z
  #133 = Utf8               sitDown
  #134 = Methodref          #78.#135      // ext/mods/gameserver/model/actor/Player.setSellingBuffs:(Z)V
  #135 = NameAndType        #136:#137     // setSellingBuffs:(Z)V
  #136 = Utf8               setSellingBuffs
  #137 = Utf8               (Z)V
  #138 = Fieldref           #139.#140     // ext/mods/gameserver/enums/actors/OperateType.PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
  #139 = Class              #141          // ext/mods/gameserver/enums/actors/OperateType
  #140 = NameAndType        #142:#143     // PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
  #141 = Utf8               ext/mods/gameserver/enums/actors/OperateType
  #142 = Utf8               PACKAGE_SELL
  #143 = Utf8               Lext/mods/gameserver/enums/actors/OperateType;
  #144 = Methodref          #78.#145      // ext/mods/gameserver/model/actor/Player.setOperateType:(Lext/mods/gameserver/enums/actors/OperateType;)V
  #145 = NameAndType        #146:#147     // setOperateType:(Lext/mods/gameserver/enums/actors/OperateType;)V
  #146 = Utf8               setOperateType
  #147 = Utf8               (Lext/mods/gameserver/enums/actors/OperateType;)V
  #148 = Methodref          #78.#149      // ext/mods/gameserver/model/actor/Player.getSellList:()Lext/mods/gameserver/model/trade/TradeList;
  #149 = NameAndType        #150:#151     // getSellList:()Lext/mods/gameserver/model/trade/TradeList;
  #150 = Utf8               getSellList
  #151 = Utf8               ()Lext/mods/gameserver/model/trade/TradeList;
  #152 = Methodref          #153.#154     // ext/mods/gameserver/model/trade/TradeList.setTitle:(Ljava/lang/String;)V
  #153 = Class              #155          // ext/mods/gameserver/model/trade/TradeList
  #154 = NameAndType        #156:#32      // setTitle:(Ljava/lang/String;)V
  #155 = Utf8               ext/mods/gameserver/model/trade/TradeList
  #156 = Utf8               setTitle
  #157 = Methodref          #153.#158     // ext/mods/gameserver/model/trade/TradeList.setPackaged:(Z)V
  #158 = NameAndType        #159:#137     // setPackaged:(Z)V
  #159 = Utf8               setPackaged
  #160 = Methodref          #78.#161      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #161 = NameAndType        #162:#6       // broadcastUserInfo:()V
  #162 = Utf8               broadcastUserInfo
  #163 = Class              #164          // ext/mods/gameserver/network/serverpackets/PrivateStoreMsgSell
  #164 = Utf8               ext/mods/gameserver/network/serverpackets/PrivateStoreMsgSell
  #165 = Methodref          #163.#166     // ext/mods/gameserver/network/serverpackets/PrivateStoreMsgSell."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #166 = NameAndType        #5:#167       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #167 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #168 = Methodref          #78.#169      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #169 = NameAndType        #170:#171     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #170 = Utf8               broadcastPacket
  #171 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #172 = Methodref          #8.#173       // ext/mods/gameserver/data/manager/SellBuffsManager.sendSellMenu:(Lext/mods/gameserver/model/actor/Player;)V
  #173 = NameAndType        #174:#167     // sendSellMenu:(Lext/mods/gameserver/model/actor/Player;)V
  #174 = Utf8               sendSellMenu
  #175 = Fieldref           #139.#176     // ext/mods/gameserver/enums/actors/OperateType.NONE:Lext/mods/gameserver/enums/actors/OperateType;
  #176 = NameAndType        #177:#143     // NONE:Lext/mods/gameserver/enums/actors/OperateType;
  #177 = Utf8               NONE
  #178 = Methodref          #78.#179      // ext/mods/gameserver/model/actor/Player.standUp:()V
  #179 = NameAndType        #180:#6       // standUp:()V
  #180 = Utf8               standUp
  #181 = Class              #182          // ext/mods/commons/data/Pagination
  #182 = Utf8               ext/mods/commons/data/Pagination
  #183 = InterfaceMethodref #122.#184     // java/util/List.stream:()Ljava/util/stream/Stream;
  #184 = NameAndType        #185:#186     // stream:()Ljava/util/stream/Stream;
  #185 = Utf8               stream
  #186 = Utf8               ()Ljava/util/stream/Stream;
  #187 = Methodref          #181.#188     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #188 = NameAndType        #5:#189       // "<init>":(Ljava/util/stream/Stream;II)V
  #189 = Utf8               (Ljava/util/stream/Stream;II)V
  #190 = Class              #191          // java/lang/StringBuilder
  #191 = Utf8               java/lang/StringBuilder
  #192 = Methodref          #190.#3       // java/lang/StringBuilder."<init>":()V
  #193 = String             #194          // <br>
  #194 = Utf8               <br>
  #195 = Methodref          #190.#196     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #196 = NameAndType        #197:#198     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #197 = Utf8               append
  #198 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #199 = Methodref          #78.#200      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #200 = NameAndType        #201:#202     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #201 = Utf8               getStatus
  #202 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #203 = Methodref          #204.#205     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
  #204 = Class              #206          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #205 = NameAndType        #207:#208     // getMp:()D
  #206 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #207 = Utf8               getMp
  #208 = Utf8               ()D
  #209 = Methodref          #204.#210     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
  #210 = NameAndType        #211:#50      // getMaxMp:()I
  #211 = Utf8               getMaxMp
  #212 = Methodref          #213.#214     // ext/mods/commons/lang/StringUtil.getMpGauge:(IJJZ)Ljava/lang/String;
  #213 = Class              #215          // ext/mods/commons/lang/StringUtil
  #214 = NameAndType        #216:#217     // getMpGauge:(IJJZ)Ljava/lang/String;
  #215 = Utf8               ext/mods/commons/lang/StringUtil
  #216 = Utf8               getMpGauge
  #217 = Utf8               (IJJZ)Ljava/lang/String;
  #218 = Methodref          #181.#219     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #219 = NameAndType        #220:#221     // iterator:()Ljava/util/Iterator;
  #220 = Utf8               iterator
  #221 = Utf8               ()Ljava/util/Iterator;
  #222 = InterfaceMethodref #223.#224     // java/util/Iterator.hasNext:()Z
  #223 = Class              #225          // java/util/Iterator
  #224 = NameAndType        #226:#82      // hasNext:()Z
  #225 = Utf8               java/util/Iterator
  #226 = Utf8               hasNext
  #227 = InterfaceMethodref #223.#228     // java/util/Iterator.next:()Ljava/lang/Object;
  #228 = NameAndType        #229:#230     // next:()Ljava/lang/Object;
  #229 = Utf8               next
  #230 = Utf8               ()Ljava/lang/Object;
  #231 = Class              #232          // ext/mods/gameserver/model/SellBuffHolder
  #232 = Utf8               ext/mods/gameserver/model/SellBuffHolder
  #233 = Methodref          #231.#234     // ext/mods/gameserver/model/SellBuffHolder.getSkillId:()I
  #234 = NameAndType        #235:#50      // getSkillId:()I
  #235 = Utf8               getSkillId
  #236 = Fieldref           #237.#238     // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #237 = Class              #239          // ext/mods/gameserver/enums/actors/NpcSkillType
  #238 = NameAndType        #240:#241     // BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #239 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
  #240 = Utf8               BUFF1
  #241 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
  #242 = Methodref          #8.#243       // ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #243 = NameAndType        #244:#245     // getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #244 = Utf8               getBuffSkill
  #245 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #246 = Fieldref           #237.#247     // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #247 = NameAndType        #248:#241     // BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #248 = Utf8               BUFF2
  #249 = Methodref          #78.#250      // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #250 = NameAndType        #251:#252     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #251 = Utf8               getSkill
  #252 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #253 = Methodref          #254.#255     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #254 = Class              #256          // ext/mods/gameserver/data/xml/ItemData
  #255 = NameAndType        #75:#257      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #256 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #257 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #258 = Fieldref           #13.#259      // ext/mods/Config.SELLBUFF_PAYMENT_ID:I
  #259 = NameAndType        #260:#261     // SELLBUFF_PAYMENT_ID:I
  #260 = Utf8               SELLBUFF_PAYMENT_ID
  #261 = Utf8               I
  #262 = Methodref          #254.#263     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #263 = NameAndType        #264:#265     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #264 = Utf8               getTemplate
  #265 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #266 = String             #267          // <table border=0 cellpadding=0 cellspacing=0 bgcolor=000000 height=32>
  #267 = Utf8               <table border=0 cellpadding=0 cellspacing=0 bgcolor=000000 height=32>
  #268 = String             #269          // <tr>
  #269 = Utf8               <tr>
  #270 = Methodref          #271.#272     // ext/mods/gameserver/skills/L2Skill.getIcon:()Ljava/lang/String;
  #271 = Class              #273          // ext/mods/gameserver/skills/L2Skill
  #272 = NameAndType        #274:#46      // getIcon:()Ljava/lang/String;
  #273 = Utf8               ext/mods/gameserver/skills/L2Skill
  #274 = Utf8               getIcon
  #275 = InvokeDynamic      #3:#88        // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #276 = Methodref          #271.#277     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #277 = NameAndType        #278:#46      // getName:()Ljava/lang/String;
  #278 = Utf8               getName
  #279 = Methodref          #271.#280     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #280 = NameAndType        #281:#50      // getLevel:()I
  #281 = Utf8               getLevel
  #282 = InvokeDynamic      #4:#283       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #283 = NameAndType        #53:#284      // makeConcatWithConstants:(I)Ljava/lang/String;
  #284 = Utf8               (I)Ljava/lang/String;
  #285 = String             #286          // </td>
  #286 = Utf8               </td>
  #287 = InvokeDynamic      #5:#288       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #288 = NameAndType        #53:#289      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #289 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #290 = Methodref          #271.#291     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #291 = NameAndType        #292:#50      // getId:()I
  #292 = Utf8               getId
  #293 = Methodref          #8.#294       // ext/mods/gameserver/data/manager/SellBuffsManager.levelList:(I)Ljava/lang/String;
  #294 = NameAndType        #295:#284     // levelList:(I)Ljava/lang/String;
  #295 = Utf8               levelList
  #296 = InvokeDynamic      #6:#297       // #6:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #297 = NameAndType        #53:#298      // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #298 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #299 = Methodref          #271.#300     // ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
  #300 = NameAndType        #301:#50      // getMpConsume:()I
  #301 = Utf8               getMpConsume
  #302 = Methodref          #303.#304     // java/lang/Math.max:(II)I
  #303 = Class              #305          // java/lang/Math
  #304 = NameAndType        #306:#307     // max:(II)I
  #305 = Utf8               java/lang/Math
  #306 = Utf8               max
  #307 = Utf8               (II)I
  #308 = Fieldref           #13.#309      // ext/mods/Config.SELLBUFF_MP_MULTIPLER:I
  #309 = NameAndType        #310:#261     // SELLBUFF_MP_MULTIPLER:I
  #310 = Utf8               SELLBUFF_MP_MULTIPLER
  #311 = InvokeDynamic      #7:#283       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #312 = Methodref          #231.#313     // ext/mods/gameserver/model/SellBuffHolder.getPrice:()I
  #313 = NameAndType        #314:#50      // getPrice:()I
  #314 = Utf8               getPrice
  #315 = Methodref          #213.#316     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #316 = NameAndType        #317:#318     // formatNumber:(J)Ljava/lang/String;
  #317 = Utf8               formatNumber
  #318 = Utf8               (J)Ljava/lang/String;
  #319 = Methodref          #320.#277     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #320 = Class              #321          // ext/mods/gameserver/model/item/kind/Item
  #321 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #322 = String             #323          //
  #323 = Utf8
  #324 = InvokeDynamic      #8:#288       // #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #325 = Methodref          #78.#326      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #326 = NameAndType        #327:#50      // getObjectId:()I
  #327 = Utf8               getObjectId
  #328 = InvokeDynamic      #9:#329       // #9:makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #329 = NameAndType        #53:#330      // makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #330 = Utf8               (IIIII)Ljava/lang/String;
  #331 = String             #332          // </tr>
  #332 = Utf8               </tr>
  #333 = String             #334          // </table>
  #334 = Utf8               </table>
  #335 = String             #336          // <img height=4>
  #336 = Utf8               <img height=4>
  #337 = Methodref          #181.#338     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #338 = NameAndType        #339:#340     // generateSpace:(I)V
  #339 = Utf8               generateSpace
  #340 = Utf8               (I)V
  #341 = InvokeDynamic      #10:#283      // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #342 = Methodref          #181.#343     // ext/mods/commons/data/Pagination.generatePagesMedium:(Ljava/lang/String;I)V
  #343 = NameAndType        #344:#345     // generatePagesMedium:(Ljava/lang/String;I)V
  #344 = Utf8               generatePagesMedium
  #345 = Utf8               (Ljava/lang/String;I)V
  #346 = Methodref          #181.#347     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #347 = NameAndType        #348:#46      // getContent:()Ljava/lang/String;
  #348 = Utf8               getContent
  #349 = Methodref          #190.#350     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #350 = NameAndType        #351:#46      // toString:()Ljava/lang/String;
  #351 = Utf8               toString
  #352 = String             #353          // <table border=0 cellpadding=0 cellspacing=0
  #353 = Utf8               <table border=0 cellpadding=0 cellspacing=0
  #354 = String             #355          // <br><br><br>
  #355 = Utf8               <br><br><br>
  #356 = String             #357          // <td width=35></td>
  #357 = Utf8               <td width=35></td>
  #358 = String             #359          // <td width=32 align=center></td>
  #359 = Utf8               <td width=32 align=center></td>
  #360 = String             #361          // <td width=150>Name</td>
  #361 = Utf8               <td width=150>Name</td>
  #362 = String             #363          // <td width=80>Level</td>
  #363 = Utf8               <td width=80>Level</td>
  #364 = String             #365          // <td width=80>Old Price</td>
  #365 = Utf8               <td width=80>Old Price</td>
  #366 = String             #367          // <td width=60>New Price</td>
  #367 = Utf8               <td width=60>New Price</td>
  #368 = String             #369          // <td width=100></td>
  #369 = Utf8               <td width=100></td>
  #370 = String             #371          // <td width=20></td>
  #371 = Utf8               <td width=20></td>
  #372 = String             #373          // You don\'t have added any buffs yet!
  #373 = Utf8               You don\'t have added any buffs yet!
  #374 = String             #375          // <table cellpadding=0 cellspacing=0 height=32 bgcolor=000000>
  #375 = Utf8               <table cellpadding=0 cellspacing=0 height=32 bgcolor=000000>
  #376 = InvokeDynamic      #11:#88       // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #377 = String             #378          // <td width=6></td>
  #378 = Utf8               <td width=6></td>
  #379 = Methodref          #231.#380     // ext/mods/gameserver/model/SellBuffHolder.getSkillLvl:()I
  #380 = NameAndType        #381:#50      // getSkillLvl:()I
  #381 = Utf8               getSkillLvl
  #382 = InvokeDynamic      #12:#283      // #12:makeConcatWithConstants:(I)Ljava/lang/String;
  #383 = InvokeDynamic      #13:#88       // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #384 = InvokeDynamic      #14:#283      // #14:makeConcatWithConstants:(I)Ljava/lang/String;
  #385 = InvokeDynamic      #15:#386      // #15:makeConcatWithConstants:(II)Ljava/lang/String;
  #386 = NameAndType        #53:#387      // makeConcatWithConstants:(II)Ljava/lang/String;
  #387 = Utf8               (II)Ljava/lang/String;
  #388 = InvokeDynamic      #16:#283      // #16:makeConcatWithConstants:(I)Ljava/lang/String;
  #389 = String             #390          // bypass sellbuffedit %page%
  #390 = Utf8               bypass sellbuffedit %page%
  #391 = Class              #392          // java/util/ArrayList
  #392 = Utf8               java/util/ArrayList
  #393 = Methodref          #391.#3       // java/util/ArrayList."<init>":()V
  #394 = Methodref          #8.#395       // ext/mods/gameserver/data/manager/SellBuffsManager.addBuffSkills:(Lext/mods/gameserver/model/actor/Player;ILjava/util/List;)V
  #395 = NameAndType        #396:#397     // addBuffSkills:(Lext/mods/gameserver/model/actor/Player;ILjava/util/List;)V
  #396 = Utf8               addBuffSkills
  #397 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/util/List;)V
  #398 = Methodref          #78.#399      // ext/mods/gameserver/model/actor/Player.getSkills:()Ljava/util/Map;
  #399 = NameAndType        #400:#401     // getSkills:()Ljava/util/Map;
  #400 = Utf8               getSkills
  #401 = Utf8               ()Ljava/util/Map;
  #402 = InterfaceMethodref #403.#404     // java/util/Map.values:()Ljava/util/Collection;
  #403 = Class              #405          // java/util/Map
  #404 = NameAndType        #406:#407     // values:()Ljava/util/Collection;
  #405 = Utf8               java/util/Map
  #406 = Utf8               values
  #407 = Utf8               ()Ljava/util/Collection;
  #408 = InterfaceMethodref #409.#219     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #409 = Class              #410          // java/util/Collection
  #410 = Utf8               java/util/Collection
  #411 = InterfaceMethodref #23.#184      // java/util/Set.stream:()Ljava/util/stream/Stream;
  #412 = InvokeDynamic      #17:#413      // #17:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #413 = NameAndType        #414:#415     // test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #414 = Utf8               test
  #415 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #416 = InterfaceMethodref #417.#418     // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
  #417 = Class              #419          // java/util/stream/Stream
  #418 = NameAndType        #420:#421     // anyMatch:(Ljava/util/function/Predicate;)Z
  #419 = Utf8               java/util/stream/Stream
  #420 = Utf8               anyMatch
  #421 = Utf8               (Ljava/util/function/Predicate;)Z
  #422 = Methodref          #8.#423       // ext/mods/gameserver/data/manager/SellBuffsManager.isInSellList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #423 = NameAndType        #424:#425     // isInSellList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #424 = Utf8               isInSellList
  #425 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #426 = InterfaceMethodref #122.#427     // java/util/List.add:(Ljava/lang/Object;)Z
  #427 = NameAndType        #428:#429     // add:(Ljava/lang/Object;)Z
  #428 = Utf8               add
  #429 = Utf8               (Ljava/lang/Object;)Z
  #430 = String             #431          // <table cellpadding=0 cellspacing=0>
  #431 = Utf8               <table cellpadding=0 cellspacing=0>
  #432 = String             #433          // <td align=center width=75>Level</td>
  #433 = Utf8               <td align=center width=75>Level</td>
  #434 = String             #435          // <td align=center width=100>Price</td>
  #435 = Utf8               <td align=center width=100>Price</td>
  #436 = String             #437          // <td width=6></td><td align=center width=14></td>
  #437 = Utf8               <td width=6></td><td align=center width=14></td>
  #438 = Methodref          #181.#123     // ext/mods/commons/data/Pagination.isEmpty:()Z
  #439 = String             #440          // At this moment you cannot add any buffs!
  #440 = Utf8               At this moment you cannot add any buffs!
  #441 = InvokeDynamic      #18:#288      // #18:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #442 = InvokeDynamic      #19:#283      // #19:makeConcatWithConstants:(I)Ljava/lang/String;
  #443 = InvokeDynamic      #20:#283      // #20:makeConcatWithConstants:(I)Ljava/lang/String;
  #444 = InvokeDynamic      #21:#445      // #21:makeConcatWithConstants:(III)Ljava/lang/String;
  #445 = NameAndType        #53:#446      // makeConcatWithConstants:(III)Ljava/lang/String;
  #446 = Utf8               (III)Ljava/lang/String;
  #447 = String             #448          // bypass sellbuffadd %page%
  #448 = Utf8               bypass sellbuffadd %page%
  #449 = Methodref          #190.#450     // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #450 = NameAndType        #197:#451     // append:(I)Ljava/lang/StringBuilder;
  #451 = Utf8               (I)Ljava/lang/StringBuilder;
  #452 = String             #453          // ;
  #453 = Utf8               ;
  #454 = InterfaceMethodref #122.#219     // java/util/List.iterator:()Ljava/util/Iterator;
  #455 = Methodref          #78.#456      // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #456 = NameAndType        #457:#82      // isAlikeDead:()Z
  #457 = Utf8               isAlikeDead
  #458 = String             #459          // You can\'t sell buffs in fake death!
  #459 = Utf8               You can\'t sell buffs in fake death!
  #460 = Methodref          #78.#461      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #461 = NameAndType        #462:#32      // sendMessage:(Ljava/lang/String;)V
  #462 = Utf8               sendMessage
  #463 = Methodref          #78.#464      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #464 = NameAndType        #465:#82      // isInOlympiadMode:()Z
  #465 = Utf8               isInOlympiadMode
  #466 = Methodref          #467.#468     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #467 = Class              #469          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #468 = NameAndType        #75:#470      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #469 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #470 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #471 = Methodref          #467.#472     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #472 = NameAndType        #473:#474     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #473 = Utf8               isRegistered
  #474 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #475 = String             #476          // You can\'t sell buffs with Olympiad status!
  #476 = Utf8               You can\'t sell buffs with Olympiad status!
  #477 = Methodref          #478.#479     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #478 = Class              #480          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #479 = NameAndType        #75:#481      // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #480 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #481 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #482 = Methodref          #478.#483     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
  #483 = NameAndType        #484:#485     // isPlayerParticipant:(I)Z
  #484 = Utf8               isPlayerParticipant
  #485 = Utf8               (I)Z
  #486 = Methodref          #487.#488     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #487 = Class              #489          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #488 = NameAndType        #75:#490      // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #489 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #490 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #491 = Methodref          #487.#483     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
  #492 = Methodref          #493.#494     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #493 = Class              #495          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #494 = NameAndType        #75:#496      // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #495 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #496 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #497 = Methodref          #493.#483     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
  #498 = Methodref          #499.#500     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #499 = Class              #501          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #500 = NameAndType        #75:#502      // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #501 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #502 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #503 = Methodref          #499.#483     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
  #504 = String             #505          // You can\'t sell buffs while registered in an event!
  #505 = Utf8               You can\'t sell buffs while registered in an event!
  #506 = Methodref          #78.#507      // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #507 = NameAndType        #508:#82      // isCursedWeaponEquipped:()Z
  #508 = Utf8               isCursedWeaponEquipped
  #509 = Methodref          #78.#510      // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #510 = NameAndType        #511:#50      // getKarma:()I
  #511 = Utf8               getKarma
  #512 = String             #513          // You can\'t sell buffs in Chaotic state!
  #513 = Utf8               You can\'t sell buffs in Chaotic state!
  #514 = Methodref          #78.#515      // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
  #515 = NameAndType        #516:#82      // isInDuel:()Z
  #516 = Utf8               isInDuel
  #517 = String             #518          // You can\'t sell buffs in Duel state!
  #518 = Utf8               You can\'t sell buffs in Duel state!
  #519 = Methodref          #78.#520      // ext/mods/gameserver/model/actor/Player.isFishing:()Z
  #520 = NameAndType        #521:#82      // isFishing:()Z
  #521 = Utf8               isFishing
  #522 = String             #523          // You can\'t sell buffs while fishing.
  #523 = Utf8               You can\'t sell buffs while fishing.
  #524 = Methodref          #78.#525      // ext/mods/gameserver/model/actor/Player.isMounted:()Z
  #525 = NameAndType        #526:#82      // isMounted:()Z
  #526 = Utf8               isMounted
  #527 = Methodref          #78.#528      // ext/mods/gameserver/model/actor/Player.isFlying:()Z
  #528 = NameAndType        #529:#82      // isFlying:()Z
  #529 = Utf8               isFlying
  #530 = String             #531          // You can\'t sell buffs in Mount state!
  #531 = Utf8               You can\'t sell buffs in Mount state!
  #532 = Fieldref           #533.#534     // ext/mods/gameserver/enums/ZoneId.NO_STORE:Lext/mods/gameserver/enums/ZoneId;
  #533 = Class              #535          // ext/mods/gameserver/enums/ZoneId
  #534 = NameAndType        #536:#537     // NO_STORE:Lext/mods/gameserver/enums/ZoneId;
  #535 = Utf8               ext/mods/gameserver/enums/ZoneId
  #536 = Utf8               NO_STORE
  #537 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #538 = Methodref          #78.#539      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #539 = NameAndType        #540:#541     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #540 = Utf8               isInsideZone
  #541 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #542 = Fieldref           #533.#543     // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #543 = NameAndType        #544:#537     // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #544 = Utf8               PEACE
  #545 = Methodref          #78.#546      // ext/mods/gameserver/model/actor/Player.isInJail:()Z
  #546 = NameAndType        #547:#82      // isInJail:()Z
  #547 = Utf8               isInJail
  #548 = String             #549          // You can\'t sell buffs here!
  #549 = Utf8               You can\'t sell buffs here!
  #550 = Class              #551          // ext/mods/gameserver/skills/l2skills/L2SkillSummon
  #551 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSummon
  #552 = Methodref          #553.#554     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #553 = Class              #555          // ext/mods/gameserver/data/xml/NpcData
  #554 = NameAndType        #75:#556      // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #555 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #556 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #557 = Methodref          #550.#558     // ext/mods/gameserver/skills/l2skills/L2SkillSummon.getNpcId:()I
  #558 = NameAndType        #559:#50      // getNpcId:()I
  #559 = Utf8               getNpcId
  #560 = Methodref          #553.#561     // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #561 = NameAndType        #264:#562     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #562 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #563 = Methodref          #237.#564     // ext/mods/gameserver/enums/actors/NpcSkillType.values:()[Lext/mods/gameserver/enums/actors/NpcSkillType;
  #564 = NameAndType        #406:#565     // values:()[Lext/mods/gameserver/enums/actors/NpcSkillType;
  #565 = Utf8               ()[Lext/mods/gameserver/enums/actors/NpcSkillType;
  #566 = Methodref          #567.#568     // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkill:(Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #567 = Class              #569          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #568 = NameAndType        #251:#570     // getSkill:(Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #569 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #570 = Utf8               (Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #571 = InvokeDynamic      #22:#413      // #22:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #572 = InvokeDynamic      #23:#413      // #23:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #573 = InterfaceMethodref #417.#574     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #574 = NameAndType        #575:#576     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #575 = Utf8               filter
  #576 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #577 = InterfaceMethodref #417.#578     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #578 = NameAndType        #579:#580     // findFirst:()Ljava/util/Optional;
  #579 = Utf8               findFirst
  #580 = Utf8               ()Ljava/util/Optional;
  #581 = Methodref          #582.#583     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #582 = Class              #584          // java/util/Optional
  #583 = NameAndType        #585:#586     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #584 = Utf8               java/util/Optional
  #585 = Utf8               orElse
  #586 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #587 = Class              #588          // ext/mods/gameserver/model/records/SellBuffData
  #588 = Utf8               ext/mods/gameserver/model/records/SellBuffData
  #589 = Fieldref           #590.#591     // ext/mods/gameserver/data/manager/SellBuffsManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/SellBuffsManager;
  #590 = Class              #592          // ext/mods/gameserver/data/manager/SellBuffsManager$SingletonHolder
  #591 = NameAndType        #593:#594     // INSTANCE:Lext/mods/gameserver/data/manager/SellBuffsManager;
  #592 = Utf8               ext/mods/gameserver/data/manager/SellBuffsManager$SingletonHolder
  #593 = Utf8               INSTANCE
  #594 = Utf8               Lext/mods/gameserver/data/manager/SellBuffsManager;
  #595 = Methodref          #587.#234     // ext/mods/gameserver/model/records/SellBuffData.getSkillId:()I
  #596 = String             #597          // skill
  #597 = Utf8               skill
  #598 = InvokeDynamic      #24:#64       // #24:accept:(Lext/mods/gameserver/data/manager/SellBuffsManager;)Ljava/util/function/Consumer;
  #599 = Methodref          #8.#600       // ext/mods/gameserver/data/manager/SellBuffsManager.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #600 = NameAndType        #601:#602     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #601 = Utf8               parseAttributes
  #602 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #603 = String             #604          // id
  #604 = Utf8               id
  #605 = Methodref          #606.#607     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #606 = Class              #608          // ext/mods/commons/data/StatSet
  #607 = NameAndType        #609:#610     // getInteger:(Ljava/lang/String;)I
  #608 = Utf8               ext/mods/commons/data/StatSet
  #609 = Utf8               getInteger
  #610 = Utf8               (Ljava/lang/String;)I
  #611 = String             #612          // time
  #612 = Utf8               time
  #613 = Methodref          #606.#614     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #614 = NameAndType        #609:#615     // getInteger:(Ljava/lang/String;I)I
  #615 = Utf8               (Ljava/lang/String;I)I
  #616 = String             #617          // applyOnPets
  #617 = Utf8               applyOnPets
  #618 = Methodref          #606.#619     // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #619 = NameAndType        #620:#621     // getBool:(Ljava/lang/String;Z)Z
  #620 = Utf8               getBool
  #621 = Utf8               (Ljava/lang/String;Z)Z
  #622 = Methodref          #587.#623     // ext/mods/gameserver/model/records/SellBuffData."<init>":(IIZ)V
  #623 = NameAndType        #5:#624       // "<init>":(IIZ)V
  #624 = Utf8               (IIZ)V
  #625 = InterfaceMethodref #23.#427      // java/util/Set.add:(Ljava/lang/Object;)Z
  #626 = Methodref          #42.#277      // java/lang/Class.getName:()Ljava/lang/String;
  #627 = Methodref          #56.#628      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #628 = NameAndType        #5:#32        // "<init>":(Ljava/lang/String;)V
  #629 = Class              #630          // java/util/HashSet
  #630 = Utf8               java/util/HashSet
  #631 = Methodref          #629.#3       // java/util/HashSet."<init>":()V
  #632 = Class              #633          // ext/mods/commons/data/xml/IXmlReader
  #633 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #634 = Utf8               Signature
  #635 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/records/SellBuffData;>;
  #636 = Utf8               HTML_FOLDER
  #637 = Utf8               Ljava/lang/String;
  #638 = Utf8               ConstantValue
  #639 = String             #640          // html/mods/sellbuffs/
  #640 = Utf8               html/mods/sellbuffs/
  #641 = Utf8               Code
  #642 = Utf8               LineNumberTable
  #643 = Utf8               LocalVariableTable
  #644 = Utf8               this
  #645 = Utf8               StackMapTable
  #646 = Utf8               parseDocument
  #647 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #648 = Utf8               doc
  #649 = Utf8               Lorg/w3c/dom/Document;
  #650 = Utf8               path
  #651 = Utf8               Ljava/nio/file/Path;
  #652 = Utf8               player
  #653 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #654 = Utf8               html
  #655 = Utf8               sendBuffChoiceMenu
  #656 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #657 = Utf8               index
  #658 = Utf8               sendBuffEditMenu
  #659 = Utf8               sendBuffMenu
  #660 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
  #661 = Utf8               seller
  #662 = Utf8               startSellBuffs
  #663 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #664 = Utf8               title
  #665 = Utf8               stopSellBuffs
  #666 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #667 = Utf8               item
  #668 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #669 = Utf8               holder
  #670 = Utf8               Lext/mods/gameserver/model/SellBuffHolder;
  #671 = Utf8               page
  #672 = Utf8               Lext/mods/commons/data/Pagination;
  #673 = Utf8               sb
  #674 = Utf8               Ljava/lang/StringBuilder;
  #675 = Utf8               LocalVariableTypeTable
  #676 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/SellBuffHolder;>;
  #677 = Utf8               skillList
  #678 = Utf8               Ljava/util/List;
  #679 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #680 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/skills/L2Skill;>;
  #681 = Utf8               i
  #682 = Utf8               maxLevel
  #683 = Utf8               str
  #684 = Utf8               canStartSellBuffs
  #685 = Utf8               skillType
  #686 = Utf8               summonTemplate
  #687 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #688 = Utf8               skillSummon
  #689 = Utf8               Lext/mods/gameserver/skills/l2skills/L2SkillSummon;
  #690 = Utf8               skillId
  #691 = Class              #692          // "[Lext/mods/gameserver/enums/actors/NpcSkillType;"
  #692 = Utf8               [Lext/mods/gameserver/enums/actors/NpcSkillType;
  #693 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)V
  #694 = Utf8               summonSkillId
  #695 = Utf8               buffType
  #696 = Utf8               getBuff
  #697 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/SellBuffData;
  #698 = Utf8               ()Lext/mods/gameserver/data/manager/SellBuffsManager;
  #699 = Utf8               lambda$getBuff$0
  #700 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #701 = Utf8               buff
  #702 = Utf8               Lext/mods/gameserver/model/records/SellBuffData;
  #703 = Utf8               lambda$addBuffSkills$0
  #704 = Utf8               lambda$buildSkillMenu$0
  #705 = Utf8               lambda$parseDocument$0
  #706 = Utf8               (Lorg/w3c/dom/Node;)V
  #707 = Utf8               listNode
  #708 = Utf8               Lorg/w3c/dom/Node;
  #709 = Utf8               lambda$parseDocument$1
  #710 = Utf8               skillNode
  #711 = Utf8               set
  #712 = Utf8               Lext/mods/commons/data/StatSet;
  #713 = Utf8               skillTime
  #714 = Utf8               <clinit>
  #715 = Utf8               SourceFile
  #716 = Utf8               SellBuffsManager.java
  #717 = Utf8               NestMembers
  #718 = Utf8               BootstrapMethods
  #719 = String             #720          // \u0001: Loaded \u0001 allowed buffs.
  #720 = Utf8               \u0001: Loaded \u0001 allowed buffs.
  #721 = MethodType         #60           //  (Ljava/lang/Object;)V
  #722 = MethodHandle       5:#723        // REF_invokeVirtual ext/mods/gameserver/data/manager/SellBuffsManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #723 = Methodref          #8.#724       // ext/mods/gameserver/data/manager/SellBuffsManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #724 = NameAndType        #705:#706     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #725 = MethodType         #706          //  (Lorg/w3c/dom/Node;)V
  #726 = String             #727          // html/mods/sellbuffs/\u0001
  #727 = Utf8               html/mods/sellbuffs/\u0001
  #728 = String             #729          // <td width=32 height=32 align=center valign=top><img src=\"\u0001\" width=\"32\" height=\"32\"></td>
  #729 = Utf8               <td width=32 height=32 align=center valign=top><img src=\"\u0001\" width=\"32\" height=\"32\"></td>
  #730 = String             #731          // <font color=\"LEVEL\"> + \u0001</font></td>
  #731 = Utf8               <font color=\"LEVEL\"> + \u0001</font></td>
  #732 = String             #733          // <td align=left valign=center width=150>&nbsp;\u0001\u0001
  #733 = Utf8               <td align=left valign=center width=150>&nbsp;\u0001\u0001
  #734 = String             #735          // <td align=center width=75><img height=6><combobox width=65 var=\"level_\u0001\" list=\"\u0001\"></td>
  #735 = Utf8               <td align=center width=75><img height=6><combobox width=65 var=\"level_\u0001\" list=\"\u0001\"></td>
  #736 = String             #737          // <td align=right width=50> \u0001 <font color=\"1E90FF\">MP</font></td>
  #737 = Utf8               <td align=right width=50> \u0001 <font color=\"1E90FF\">MP</font></td>
  #738 = String             #739          // <td align=right width=120> \u0001 <font color=\"LEVEL\">\u0001</font> </td>
  #739 = Utf8               <td align=right width=120> \u0001 <font color=\"LEVEL\">\u0001</font> </td>
  #740 = String             #741          // <td width=6></td><td align=center width=14><img height=8><button action=\"bypass sellbuffbuyskill \u0001 \u0001  $level_\u0001 \u0001 \u0001\" width=14 height=14 back=L2UI_ch3.QuestWndPlusBtn_over fore=L2UI_ch3.QuestWndPlusBtn></td>
  #741 = Utf8               <td width=6></td><td align=center width=14><img height=8><button action=\"bypass sellbuffbuyskill \u0001 \u0001  $level_\u0001 \u0001 \u0001\" width=14 height=14 back=L2UI_ch3.QuestWndPlusBtn_over fore=L2UI_ch3.QuestWndPlusBtn></td>
  #742 = String             #743          // bypass sellbuffbuymenu \u0001 %page%
  #743 = Utf8               bypass sellbuffbuymenu \u0001 %page%
  #744 = String             #745          // <td align=center width=32 valign=top><img src=\"\u0001\" width=\"32\" height=\"32\"></td>
  #745 = Utf8               <td align=center width=32 valign=top><img src=\"\u0001\" width=\"32\" height=\"32\"></td>
  #746 = String             #747          // <td width=40>\u0001</td>
  #747 = Utf8               <td width=40>\u0001</td>
  #748 = String             #749          // <td align=right width=100> \u0001 <font color=\"LEVEL\">Adena  </font></td>
  #749 = Utf8               <td align=right width=100> \u0001 <font color=\"LEVEL\">Adena  </font></td>
  #750 = String             #751          // <td width=80><img height=6><edit var=\"price_\u0001\" width=75 height=14 type=\"number\"></td>
  #751 = Utf8               <td width=80><img height=6><edit var=\"price_\u0001\" width=75 height=14 type=\"number\"></td>
  #752 = String             #753          // <td width=60 align=center><img height=6><button value=\"Edit\" action=\"bypass sellbuffchangeprice \u0001 $price_\u0001\" width=\"65\" height=\"21\" back=\"smallbutton2_over\" fore=\"smallbutton2\"></td>
  #753 = Utf8               <td width=60 align=center><img height=6><button value=\"Edit\" action=\"bypass sellbuffchangeprice \u0001 $price_\u0001\" width=\"65\" height=\"21\" back=\"smallbutton2_over\" fore=\"smallbutton2\"></td>
  #754 = String             #755          // <td width=6></td><td width=20 valign=center><img height=8><button action=\"bypass sellbuffremove \u0001\" width=16 height=16 back=L2UI_ch3.FrameCloseOnBtn fore=L2UI_ch3.FrameCloseBtn></td>
  #755 = Utf8               <td width=6></td><td width=20 valign=center><img height=8><button action=\"bypass sellbuffremove \u0001\" width=16 height=16 back=L2UI_ch3.FrameCloseOnBtn fore=L2UI_ch3.FrameCloseBtn></td>
  #756 = MethodType         #429          //  (Ljava/lang/Object;)Z
  #757 = MethodHandle       6:#758        // REF_invokeStatic ext/mods/gameserver/data/manager/SellBuffsManager.lambda$buildSkillMenu$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #758 = Methodref          #8.#759       // ext/mods/gameserver/data/manager/SellBuffsManager.lambda$buildSkillMenu$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #759 = NameAndType        #704:#700     // lambda$buildSkillMenu$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #760 = MethodType         #761          //  (Lext/mods/gameserver/model/records/SellBuffData;)Z
  #761 = Utf8               (Lext/mods/gameserver/model/records/SellBuffData;)Z
  #762 = String             #763          // <td align=left valign=center width=150>\u0001\u0001
  #763 = Utf8               <td align=left valign=center width=150>\u0001\u0001
  #764 = String             #765          // <td align=center width=75><img height=6>\u0001 <font color=LEVEL>Lv.</font></td>
  #765 = Utf8               <td align=center width=75><img height=6>\u0001 <font color=LEVEL>Lv.</font></td>
  #766 = String             #767          // <td align=center><img height=6><edit var=\"price_\u0001\" width=100 height=11 type=\"number\"></td>
  #767 = Utf8               <td align=center><img height=6><edit var=\"price_\u0001\" width=100 height=11 type=\"number\"></td>
  #768 = String             #769          // <td width=6></td><td align=center width=14><img height=8><button action=\"bypass sellbuffaddskill \u0001  $price_\u0001 \u0001\" width=14 height=14 back=L2UI_ch3.QuestWndPlusBtn_over fore=L2UI_ch3.QuestWndPlusBtn></td>
  #769 = Utf8               <td width=6></td><td align=center width=14><img height=8><button action=\"bypass sellbuffaddskill \u0001  $price_\u0001 \u0001\" width=14 height=14 back=L2UI_ch3.QuestWndPlusBtn_over fore=L2UI_ch3.QuestWndPlusBtn></td>
  #770 = MethodHandle       6:#771        // REF_invokeStatic ext/mods/gameserver/data/manager/SellBuffsManager.lambda$addBuffSkills$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #771 = Methodref          #8.#772       // ext/mods/gameserver/data/manager/SellBuffsManager.lambda$addBuffSkills$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #772 = NameAndType        #703:#700     // lambda$addBuffSkills$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #773 = MethodHandle       6:#774        // REF_invokeStatic ext/mods/gameserver/data/manager/SellBuffsManager.lambda$getBuff$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #774 = Methodref          #8.#775       // ext/mods/gameserver/data/manager/SellBuffsManager.lambda$getBuff$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #775 = NameAndType        #699:#700     // lambda$getBuff$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
  #776 = MethodHandle       5:#777        // REF_invokeVirtual ext/mods/gameserver/data/manager/SellBuffsManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #777 = Methodref          #8.#778       // ext/mods/gameserver/data/manager/SellBuffsManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #778 = NameAndType        #709:#706     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #779 = MethodHandle       6:#780        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #780 = Methodref          #781.#782     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #781 = Class              #783          // java/lang/invoke/StringConcatFactory
  #782 = NameAndType        #53:#784      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #783 = Utf8               java/lang/invoke/StringConcatFactory
  #784 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #785 = MethodHandle       6:#786        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #786 = Methodref          #787.#788     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #787 = Class              #789          // java/lang/invoke/LambdaMetafactory
  #788 = NameAndType        #790:#791     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #789 = Utf8               java/lang/invoke/LambdaMetafactory
  #790 = Utf8               metafactory
  #791 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #792 = Utf8               InnerClasses
  #793 = Utf8               SingletonHolder
  #794 = Class              #795          // java/lang/invoke/MethodHandles$Lookup
  #795 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #796 = Class              #797          // java/lang/invoke/MethodHandles
  #797 = Utf8               java/lang/invoke/MethodHandles
  #798 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.SellBuffsManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokevirtual #7                  // Method load:()V
         8: return
      LineNumberTable:
        line 62: 0
        line 63: 4
        line 64: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: getstatic     #12                 // Field ext/mods/Config.SELLBUFF_ENABLED:Z
         3: ifeq          46
         6: getstatic     #18                 // Field ALLOWED_BUFFS:Ljava/util/Set;
         9: invokeinterface #22,  1           // InterfaceMethod java/util/Set.clear:()V
        14: aload_0
        15: ldc           #27                 // String custom/mods/sellBuffData.xml
        17: invokevirtual #29                 // Method parseDataFile:(Ljava/lang/String;)V
        20: getstatic     #33                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        23: aload_0
        24: invokevirtual #37                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        27: invokevirtual #41                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        30: getstatic     #18                 // Field ALLOWED_BUFFS:Ljava/util/Set;
        33: invokeinterface #47,  1           // InterfaceMethod java/util/Set.size:()I
        38: invokedynamic #51,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        43: invokevirtual #55                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        46: return
      LineNumberTable:
        line 69: 0
        line 71: 6
        line 72: 14
        line 73: 20
        line 75: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
      StackMapTable: number_of_entries = 1
        frame_type = 46 /* same */

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #61                 // String list
         4: aload_0
         5: invokedynamic #63,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/data/manager/SellBuffsManager;)Ljava/util/function/Consumer;
        10: invokevirtual #67                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 80: 0
        line 89: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void sendSellMenu(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: invokestatic  #71                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
         3: aload_1
         4: aload_1
         5: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
         8: ifeq          16
        11: ldc           #83                 // String buffmenu_already.htm
        13: goto          18
        16: ldc           #85                 // String buffmenu.htm
        18: invokedynamic #87,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        23: invokevirtual #90                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        26: astore_2
        27: aload_2
        28: aload_1
        29: invokestatic  #94                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        32: return
      LineNumberTable:
        line 93: 0
        line 94: 27
        line 95: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      33     1 player   Lext/mods/gameserver/model/actor/Player;
           27       6     2  html   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/SellBuffsManager, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/data/HTMLData, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/data/manager/SellBuffsManager, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/data/HTMLData, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]

  public void sendBuffChoiceMenu(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: invokestatic  #71                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
         3: aload_1
         4: ldc           #100                // String html/mods/sellbuffs/buffchoice.htm
         6: invokevirtual #90                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
         9: astore_3
        10: aload_3
        11: ldc           #102                // String %list%
        13: aload_0
        14: aload_1
        15: iload_2
        16: invokevirtual #104                // Method buildSkillMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
        19: invokevirtual #108                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        22: astore_3
        23: aload_3
        24: aload_1
        25: invokestatic  #94                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        28: return
      LineNumberTable:
        line 99: 0
        line 100: 10
        line 101: 23
        line 102: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      29     1 player   Lext/mods/gameserver/model/actor/Player;
            0      29     2 index   I
           10      19     3  html   Ljava/lang/String;

  public void sendBuffEditMenu(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: invokestatic  #71                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
         3: aload_1
         4: ldc           #100                // String html/mods/sellbuffs/buffchoice.htm
         6: invokevirtual #90                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
         9: astore_3
        10: aload_3
        11: ldc           #102                // String %list%
        13: aload_0
        14: aload_1
        15: iload_2
        16: invokevirtual #114                // Method buildEditMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
        19: invokevirtual #108                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        22: astore_3
        23: aload_3
        24: aload_1
        25: invokestatic  #94                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        28: return
      LineNumberTable:
        line 106: 0
        line 107: 10
        line 108: 23
        line 109: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      29     1 player   Lext/mods/gameserver/model/actor/Player;
            0      29     2 index   I
           10      19     3  html   Ljava/lang/String;

  public void sendBuffMenu(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: aload_2
         1: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
         4: ifeq          19
         7: aload_2
         8: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
        11: invokeinterface #121,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifeq          20
        19: return
        20: invokestatic  #71                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        23: aload_1
        24: ldc           #126                // String html/mods/sellbuffs/buffbuymenu.htm
        26: invokevirtual #90                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        29: astore        4
        31: aload         4
        33: ldc           #102                // String %list%
        35: aload_0
        36: aload_2
        37: iload_3
        38: invokevirtual #128                // Method buildBuffMenu:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
        41: invokevirtual #108                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        44: astore        4
        46: aload         4
        48: aload_1
        49: invokestatic  #94                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        52: return
      LineNumberTable:
        line 113: 0
        line 114: 19
        line 116: 20
        line 117: 31
        line 118: 46
        line 119: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      53     1 player   Lext/mods/gameserver/model/actor/Player;
            0      53     2 seller   Lext/mods/gameserver/model/actor/Player;
            0      53     3 index   I
           31      22     4  html   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 0 /* same */

  public void startSellBuffs(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_1
         1: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sitDown:()Z
         4: pop
         5: aload_1
         6: iconst_1
         7: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Player.setSellingBuffs:(Z)V
        10: aload_1
        11: getstatic     #138                // Field ext/mods/gameserver/enums/actors/OperateType.PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
        14: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.setOperateType:(Lext/mods/gameserver/enums/actors/OperateType;)V
        17: aload_1
        18: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getSellList:()Lext/mods/gameserver/model/trade/TradeList;
        21: aload_2
        22: invokevirtual #152                // Method ext/mods/gameserver/model/trade/TradeList.setTitle:(Ljava/lang/String;)V
        25: aload_1
        26: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getSellList:()Lext/mods/gameserver/model/trade/TradeList;
        29: iconst_1
        30: invokevirtual #157                // Method ext/mods/gameserver/model/trade/TradeList.setPackaged:(Z)V
        33: aload_1
        34: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        37: aload_1
        38: new           #163                // class ext/mods/gameserver/network/serverpackets/PrivateStoreMsgSell
        41: dup
        42: aload_1
        43: invokespecial #165                // Method ext/mods/gameserver/network/serverpackets/PrivateStoreMsgSell."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        46: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        49: aload_0
        50: aload_1
        51: invokevirtual #172                // Method sendSellMenu:(Lext/mods/gameserver/model/actor/Player;)V
        54: return
      LineNumberTable:
        line 123: 0
        line 124: 5
        line 125: 10
        line 126: 17
        line 127: 25
        line 128: 33
        line 130: 37
        line 132: 49
        line 133: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      55     1 player   Lext/mods/gameserver/model/actor/Player;
            0      55     2 title   Ljava/lang/String;

  public void stopSellBuffs(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: iconst_0
         2: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Player.setSellingBuffs:(Z)V
         5: aload_1
         6: getstatic     #175                // Field ext/mods/gameserver/enums/actors/OperateType.NONE:Lext/mods/gameserver/enums/actors/OperateType;
         9: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.setOperateType:(Lext/mods/gameserver/enums/actors/OperateType;)V
        12: aload_1
        13: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.standUp:()V
        16: aload_1
        17: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        20: aload_0
        21: aload_1
        22: invokevirtual #172                // Method sendSellMenu:(Lext/mods/gameserver/model/actor/Player;)V
        25: return
      LineNumberTable:
        line 137: 0
        line 138: 5
        line 139: 12
        line 140: 16
        line 141: 20
        line 142: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      26     1 player   Lext/mods/gameserver/model/actor/Player;

  public static java.lang.String levelList(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: new           #190                // class java/lang/StringBuilder
         3: dup
         4: invokespecial #192                // Method java/lang/StringBuilder."<init>":()V
         7: astore_1
         8: aload_1
         9: iload_0
        10: invokevirtual #449                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        13: pop
        14: iload_0
        15: iconst_1
        16: if_icmple     27
        19: aload_1
        20: ldc_w         #452                // String ;
        23: invokevirtual #195                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        26: pop
        27: iload_0
        28: iconst_1
        29: isub
        30: istore_2
        31: iload_2
        32: ifle          60
        35: aload_1
        36: iload_2
        37: invokevirtual #449                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        40: pop
        41: iload_2
        42: iconst_1
        43: if_icmpeq     54
        46: aload_1
        47: ldc_w         #452                // String ;
        50: invokevirtual #195                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        53: pop
        54: iinc          2, -1
        57: goto          31
        60: aload_1
        61: invokevirtual #349                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        64: areturn
      LineNumberTable:
        line 315: 0
        line 316: 8
        line 317: 14
        line 318: 19
        line 320: 27
        line 322: 35
        line 323: 41
        line 324: 46
        line 320: 54
        line 327: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      29     2     i   I
            0      65     0 maxLevel   I
            8      57     1   str   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/StringBuilder ]
        frame_type = 252 /* append */
          offset_delta = 3
          locals = [ int ]
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5

  public boolean isInSellList(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_1
         1: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
         4: invokeinterface #454,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #222,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          47
        19: aload_3
        20: invokeinterface #227,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #231                // class ext/mods/gameserver/model/SellBuffHolder
        28: astore        4
        30: aload         4
        32: invokevirtual #233                // Method ext/mods/gameserver/model/SellBuffHolder.getSkillId:()I
        35: aload_2
        36: invokevirtual #290                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        39: if_icmpne     44
        42: iconst_1
        43: ireturn
        44: goto          10
        47: iconst_0
        48: ireturn
      LineNumberTable:
        line 332: 0
        line 334: 30
        line 335: 42
        line 336: 44
        line 337: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      14     4 holder   Lext/mods/gameserver/model/SellBuffHolder;
            0      49     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      49     1 player   Lext/mods/gameserver/model/actor/Player;
            0      49     2 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 33 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean canStartSellBuffs(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #455                // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
         4: ifeq          16
         7: aload_1
         8: ldc_w         #458                // String You can\'t sell buffs in fake death!
        11: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        14: iconst_0
        15: ireturn
        16: aload_1
        17: invokevirtual #463                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        20: ifne          33
        23: invokestatic  #466                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        26: aload_1
        27: invokevirtual #471                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
        30: ifeq          42
        33: aload_1
        34: ldc_w         #475                // String You can\'t sell buffs with Olympiad status!
        37: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        40: iconst_0
        41: ireturn
        42: invokestatic  #477                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        45: aload_1
        46: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        49: invokevirtual #482                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
        52: ifne          94
        55: invokestatic  #486                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        58: aload_1
        59: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        62: invokevirtual #491                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
        65: ifne          94
        68: invokestatic  #492                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        71: aload_1
        72: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        75: invokevirtual #497                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
        78: ifne          94
        81: invokestatic  #498                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        84: aload_1
        85: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        88: invokevirtual #503                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
        91: ifeq          103
        94: aload_1
        95: ldc_w         #504                // String You can\'t sell buffs while registered in an event!
        98: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       101: iconst_0
       102: ireturn
       103: aload_1
       104: invokevirtual #506                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       107: ifne          117
       110: aload_1
       111: invokevirtual #509                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       114: ifle          126
       117: aload_1
       118: ldc_w         #512                // String You can\'t sell buffs in Chaotic state!
       121: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       124: iconst_0
       125: ireturn
       126: aload_1
       127: invokevirtual #514                // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
       130: ifeq          142
       133: aload_1
       134: ldc_w         #517                // String You can\'t sell buffs in Duel state!
       137: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       140: iconst_0
       141: ireturn
       142: aload_1
       143: invokevirtual #519                // Method ext/mods/gameserver/model/actor/Player.isFishing:()Z
       146: ifeq          158
       149: aload_1
       150: ldc_w         #522                // String You can\'t sell buffs while fishing.
       153: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       156: iconst_0
       157: ireturn
       158: aload_1
       159: invokevirtual #524                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
       162: ifne          172
       165: aload_1
       166: invokevirtual #527                // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
       169: ifeq          181
       172: aload_1
       173: ldc_w         #530                // String You can\'t sell buffs in Mount state!
       176: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       179: iconst_0
       180: ireturn
       181: aload_1
       182: getstatic     #532                // Field ext/mods/gameserver/enums/ZoneId.NO_STORE:Lext/mods/gameserver/enums/ZoneId;
       185: invokevirtual #538                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       188: ifne          208
       191: aload_1
       192: getstatic     #542                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       195: invokevirtual #538                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       198: ifeq          208
       201: aload_1
       202: invokevirtual #545                // Method ext/mods/gameserver/model/actor/Player.isInJail:()Z
       205: ifeq          217
       208: aload_1
       209: ldc_w         #548                // String You can\'t sell buffs here!
       212: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       215: iconst_0
       216: ireturn
       217: iconst_1
       218: ireturn
      LineNumberTable:
        line 342: 0
        line 344: 7
        line 345: 14
        line 347: 16
        line 349: 33
        line 350: 40
        line 352: 42
        line 354: 94
        line 355: 101
        line 357: 103
        line 359: 117
        line 360: 124
        line 362: 126
        line 364: 133
        line 365: 140
        line 367: 142
        line 369: 149
        line 370: 156
        line 372: 158
        line 374: 172
        line 375: 179
        line 377: 181
        line 379: 208
        line 380: 215
        line 382: 217
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     219     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0     219     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 13
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 8 /* same */
        frame_type = 51 /* same */
        frame_type = 8 /* same */
        frame_type = 13 /* same */
        frame_type = 8 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 13 /* same */
        frame_type = 8 /* same */
        frame_type = 26 /* same */
        frame_type = 8 /* same */

  public ext.mods.gameserver.skills.L2Skill getBuffSkill(ext.mods.gameserver.model.actor.Player, int, ext.mods.gameserver.enums.actors.NpcSkillType);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=4
         0: aload_1
         1: iload_2
         2: invokevirtual #249                // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
         5: astore        5
         7: aload         5
         9: instanceof    #550                // class ext/mods/gameserver/skills/l2skills/L2SkillSummon
        12: ifeq          42
        15: aload         5
        17: checkcast     #550                // class ext/mods/gameserver/skills/l2skills/L2SkillSummon
        20: astore        4
        22: invokestatic  #552                // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
        25: aload         4
        27: invokevirtual #557                // Method ext/mods/gameserver/skills/l2skills/L2SkillSummon.getNpcId:()I
        30: invokevirtual #560                // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
        33: astore        5
        35: aload         5
        37: aload_3
        38: invokevirtual #566                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getSkill:(Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
        41: areturn
        42: aconst_null
        43: areturn
      LineNumberTable:
        line 401: 0
        line 403: 22
        line 404: 35
        line 406: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35       7     5 summonTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
           22      20     4 skillSummon   Lext/mods/gameserver/skills/l2skills/L2SkillSummon;
            0      44     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      44     1 player   Lext/mods/gameserver/model/actor/Player;
            0      44     2 summonSkillId   I
            0      44     3 buffType   Lext/mods/gameserver/enums/actors/NpcSkillType;
      StackMapTable: number_of_entries = 1
        frame_type = 42 /* same */

  public ext.mods.gameserver.model.records.SellBuffData getBuff(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/SellBuffData;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #18                 // Field ALLOWED_BUFFS:Ljava/util/Set;
         3: invokeinterface #411,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         8: aload_1
         9: invokedynamic #572,  0            // InvokeDynamic #23:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
        14: invokeinterface #573,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        19: invokeinterface #577,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        24: aconst_null
        25: invokevirtual #581                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        28: checkcast     #587                // class ext/mods/gameserver/model/records/SellBuffData
        31: areturn
      LineNumberTable:
        line 411: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/data/manager/SellBuffsManager;
            0      32     1 skill   Lext/mods/gameserver/skills/L2Skill;

  public static ext.mods.gameserver.data.manager.SellBuffsManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/SellBuffsManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #589                // Field ext/mods/gameserver/data/manager/SellBuffsManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/SellBuffsManager;
         3: areturn
      LineNumberTable:
        line 416: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #56                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/data/manager/SellBuffsManager
         6: invokevirtual #626                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #627                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #33                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #629                // class java/util/HashSet
        18: dup
        19: invokespecial #631                // Method java/util/HashSet."<init>":()V
        22: putstatic     #18                 // Field ALLOWED_BUFFS:Ljava/util/Set;
        25: return
      LineNumberTable:
        line 57: 0
        line 58: 15
}
SourceFile: "SellBuffsManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/SellBuffsManager$SingletonHolder
BootstrapMethods:
  0: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #719 \u0001: Loaded \u0001 allowed buffs.
  1: #785 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #721 (Ljava/lang/Object;)V
      #722 REF_invokeVirtual ext/mods/gameserver/data/manager/SellBuffsManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #725 (Lorg/w3c/dom/Node;)V
  2: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #726 html/mods/sellbuffs/\u0001
  3: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #728 <td width=32 height=32 align=center valign=top><img src=\"\u0001\" width=\"32\" height=\"32\"></td>
  4: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #730 <font color=\"LEVEL\"> + \u0001</font></td>
  5: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #732 <td align=left valign=center width=150>&nbsp;\u0001\u0001
  6: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #734 <td align=center width=75><img height=6><combobox width=65 var=\"level_\u0001\" list=\"\u0001\"></td>
  7: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #736 <td align=right width=50> \u0001 <font color=\"1E90FF\">MP</font></td>
  8: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #738 <td align=right width=120> \u0001 <font color=\"LEVEL\">\u0001</font> </td>
  9: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #740 <td width=6></td><td align=center width=14><img height=8><button action=\"bypass sellbuffbuyskill \u0001 \u0001  $level_\u0001 \u0001 \u0001\" width=14 height=14 back=L2UI_ch3.QuestWndPlusBtn_over fore=L2UI_ch3.QuestWndPlusBtn></td>
  10: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #742 bypass sellbuffbuymenu \u0001 %page%
  11: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #744 <td align=center width=32 valign=top><img src=\"\u0001\" width=\"32\" height=\"32\"></td>
  12: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #746 <td width=40>\u0001</td>
  13: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #748 <td align=right width=100> \u0001 <font color=\"LEVEL\">Adena  </font></td>
  14: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #750 <td width=80><img height=6><edit var=\"price_\u0001\" width=75 height=14 type=\"number\"></td>
  15: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #752 <td width=60 align=center><img height=6><button value=\"Edit\" action=\"bypass sellbuffchangeprice \u0001 $price_\u0001\" width=\"65\" height=\"21\" back=\"smallbutton2_over\" fore=\"smallbutton2\"></td>
  16: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #754 <td width=6></td><td width=20 valign=center><img height=8><button action=\"bypass sellbuffremove \u0001\" width=16 height=16 back=L2UI_ch3.FrameCloseOnBtn fore=L2UI_ch3.FrameCloseBtn></td>
  17: #785 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #756 (Ljava/lang/Object;)Z
      #757 REF_invokeStatic ext/mods/gameserver/data/manager/SellBuffsManager.lambda$buildSkillMenu$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
      #760 (Lext/mods/gameserver/model/records/SellBuffData;)Z
  18: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #762 <td align=left valign=center width=150>\u0001\u0001
  19: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #764 <td align=center width=75><img height=6>\u0001 <font color=LEVEL>Lv.</font></td>
  20: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #766 <td align=center><img height=6><edit var=\"price_\u0001\" width=100 height=11 type=\"number\"></td>
  21: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #768 <td width=6></td><td align=center width=14><img height=8><button action=\"bypass sellbuffaddskill \u0001  $price_\u0001 \u0001\" width=14 height=14 back=L2UI_ch3.QuestWndPlusBtn_over fore=L2UI_ch3.QuestWndPlusBtn></td>
  22: #785 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #756 (Ljava/lang/Object;)Z
      #770 REF_invokeStatic ext/mods/gameserver/data/manager/SellBuffsManager.lambda$addBuffSkills$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
      #760 (Lext/mods/gameserver/model/records/SellBuffData;)Z
  23: #785 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #756 (Ljava/lang/Object;)Z
      #773 REF_invokeStatic ext/mods/gameserver/data/manager/SellBuffsManager.lambda$getBuff$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/SellBuffData;)Z
      #760 (Lext/mods/gameserver/model/records/SellBuffData;)Z
  24: #785 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #721 (Ljava/lang/Object;)V
      #776 REF_invokeVirtual ext/mods/gameserver/data/manager/SellBuffsManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #725 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #798= #794 of #796; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
