// Bytecode for: ext.mods.gameserver.model.actor.instance.Merchant
// File: ext\mods\gameserver\model\actor\instance\Merchant.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Merchant.class
  Last modified 9 de jul de 2026; size 6970 bytes
  MD5 checksum 997b9dd1bb98693394568b2272e2fe82
  Compiled from "Merchant.java"
public class ext.mods.gameserver.model.actor.instance.Merchant extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #26                         // ext/mods/gameserver/model/actor/instance/Merchant
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 6, attributes: 3
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
   #19 = Fieldref           #20.#21       // ext/mods/Config.KARMA_PLAYER_CAN_SHOP:Z
   #20 = Class              #22           // ext/mods/Config
   #21 = NameAndType        #23:#24       // KARMA_PLAYER_CAN_SHOP:Z
   #22 = Utf8               ext/mods/Config
   #23 = Utf8               KARMA_PLAYER_CAN_SHOP
   #24 = Utf8               Z
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/actor/instance/Merchant.getNpcId:()I
   #26 = Class              #28           // ext/mods/gameserver/model/actor/instance/Merchant
   #27 = NameAndType        #29:#30       // getNpcId:()I
   #28 = Utf8               ext/mods/gameserver/model/actor/instance/Merchant
   #29 = Utf8               getNpcId
   #30 = Utf8               ()I
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/actor/Player.getKarma:()I
   #32 = Class              #34           // ext/mods/gameserver/model/actor/Player
   #33 = NameAndType        #35:#30       // getKarma:()I
   #34 = Utf8               ext/mods/gameserver/model/actor/Player
   #35 = Utf8               getKarma
   #36 = String             #37           // merchant
   #37 = Utf8               merchant
   #38 = Methodref          #26.#39       // ext/mods/gameserver/model/actor/instance/Merchant.showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #39 = NameAndType        #40:#41       // showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #40 = Utf8               showPkDenyChatWindow
   #41 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #42 = Class              #43           // java/util/StringTokenizer
   #43 = Utf8               java/util/StringTokenizer
   #44 = String             #45           //
   #45 = Utf8
   #46 = Methodref          #42.#47       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #47 = NameAndType        #5:#48        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #48 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #49 = Methodref          #42.#50       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #50 = NameAndType        #51:#52       // nextToken:()Ljava/lang/String;
   #51 = Utf8               nextToken
   #52 = Utf8               ()Ljava/lang/String;
   #53 = String             #54           // Buy
   #54 = Utf8               Buy
   #55 = Methodref          #56.#57       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #56 = Class              #58           // java/lang/String
   #57 = NameAndType        #59:#60       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #58 = Utf8               java/lang/String
   #59 = Utf8               equalsIgnoreCase
   #60 = Utf8               (Ljava/lang/String;)Z
   #61 = Methodref          #42.#62       // java/util/StringTokenizer.countTokens:()I
   #62 = NameAndType        #63:#30       // countTokens:()I
   #63 = Utf8               countTokens
   #64 = Methodref          #65.#66       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #65 = Class              #67           // java/lang/Integer
   #66 = NameAndType        #68:#69       // parseInt:(Ljava/lang/String;)I
   #67 = Utf8               java/lang/Integer
   #68 = Utf8               parseInt
   #69 = Utf8               (Ljava/lang/String;)I
   #70 = Methodref          #26.#71       // ext/mods/gameserver/model/actor/instance/Merchant.showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #71 = NameAndType        #72:#73       // showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #72 = Utf8               showBuyWindow
   #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #74 = String             #75           // Sell
   #75 = Utf8               Sell
   #76 = Methodref          #32.#77       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #77 = NameAndType        #78:#79       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #78 = Utf8               getInventory
   #79 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #80 = Methodref          #81.#82       // ext/mods/gameserver/model/itemcontainer/PcInventory.getSellableItems:()Ljava/util/List;
   #81 = Class              #83           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #82 = NameAndType        #84:#85       // getSellableItems:()Ljava/util/List;
   #83 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #84 = Utf8               getSellableItems
   #85 = Utf8               ()Ljava/util/List;
   #86 = InterfaceMethodref #87.#88       // java/util/List.isEmpty:()Z
   #87 = Class              #89           // java/util/List
   #88 = NameAndType        #90:#91       // isEmpty:()Z
   #89 = Utf8               java/util/List
   #90 = Utf8               isEmpty
   #91 = Utf8               ()Z
   #92 = Methodref          #93.#94       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #93 = Class              #95           // ext/mods/gameserver/data/HTMLData
   #94 = NameAndType        #96:#97       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #95 = Utf8               ext/mods/gameserver/data/HTMLData
   #96 = Utf8               getInstance
   #97 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #98 = Class              #99           // ext/mods/gameserver/model/actor/instance/Fisherman
   #99 = Utf8               ext/mods/gameserver/model/actor/instance/Fisherman
  #100 = String             #101          // fisherman
  #101 = Utf8               fisherman
  #102 = InvokeDynamic      #3:#103       // #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #103 = NameAndType        #11:#104      // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #104 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #105 = Methodref          #93.#106      // ext/mods/gameserver/data/HTMLData.exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #106 = NameAndType        #107:#41      // exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #107 = Utf8               exists
  #108 = Methodref          #93.#109      // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #109 = NameAndType        #110:#111     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #110 = Utf8               getHtm
  #111 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #112 = Class              #113          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #113 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #114 = Methodref          #26.#115      // ext/mods/gameserver/model/actor/instance/Merchant.getObjectId:()I
  #115 = NameAndType        #116:#30      // getObjectId:()I
  #116 = Utf8               getObjectId
  #117 = Methodref          #112.#118     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #118 = NameAndType        #5:#119       // "<init>":(I)V
  #119 = Utf8               (I)V
  #120 = Methodref          #112.#121     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #121 = NameAndType        #122:#123     // setHtml:(Ljava/lang/String;)V
  #122 = Utf8               setHtml
  #123 = Utf8               (Ljava/lang/String;)V
  #124 = String             #125          // %objectId%
  #125 = Utf8               %objectId%
  #126 = Methodref          #112.#127     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #127 = NameAndType        #128:#129     // replace:(Ljava/lang/String;I)V
  #128 = Utf8               replace
  #129 = Utf8               (Ljava/lang/String;I)V
  #130 = Methodref          #32.#131      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #131 = NameAndType        #132:#133     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #132 = Utf8               sendPacket
  #133 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #134 = Class              #135          // ext/mods/gameserver/network/serverpackets/SellList
  #135 = Utf8               ext/mods/gameserver/network/serverpackets/SellList
  #136 = Methodref          #32.#137      // ext/mods/gameserver/model/actor/Player.getAdena:()I
  #137 = NameAndType        #138:#30      // getAdena:()I
  #138 = Utf8               getAdena
  #139 = Methodref          #134.#140     // ext/mods/gameserver/network/serverpackets/SellList."<init>":(ILjava/util/List;)V
  #140 = NameAndType        #5:#141       // "<init>":(ILjava/util/List;)V
  #141 = Utf8               (ILjava/util/List;)V
  #142 = String             #143          // Wear
  #143 = Utf8               Wear
  #144 = Fieldref           #20.#145      // ext/mods/Config.ALLOW_WEAR:Z
  #145 = NameAndType        #146:#24      // ALLOW_WEAR:Z
  #146 = Utf8               ALLOW_WEAR
  #147 = Methodref          #26.#148      // ext/mods/gameserver/model/actor/instance/Merchant.showWearWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #148 = NameAndType        #149:#73      // showWearWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #149 = Utf8               showWearWindow
  #150 = String             #151          // Multisell
  #151 = Utf8               Multisell
  #152 = Methodref          #153.#154     // ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #153 = Class              #155          // ext/mods/gameserver/data/xml/MultisellData
  #154 = NameAndType        #96:#156      // getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #155 = Utf8               ext/mods/gameserver/data/xml/MultisellData
  #156 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
  #157 = Methodref          #153.#158     // ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #158 = NameAndType        #159:#160     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #159 = Utf8               separateAndSend
  #160 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #161 = String             #162          // Multisell_Shadow
  #162 = Utf8               Multisell_Shadow
  #163 = Fieldref           #20.#164      // ext/mods/Config.ALLOW_SHADOW_WEAPONS:Z
  #164 = NameAndType        #165:#24      // ALLOW_SHADOW_WEAPONS:Z
  #165 = Utf8               ALLOW_SHADOW_WEAPONS
  #166 = String             #167          // html/script/feature/ShadowWeapon/message.htm
  #167 = Utf8               html/script/feature/ShadowWeapon/message.htm
  #168 = Methodref          #26.#169      // ext/mods/gameserver/model/actor/instance/Merchant.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #169 = NameAndType        #170:#171     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #170 = Utf8               showChatWindow
  #171 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #172 = Methodref          #32.#173      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #173 = NameAndType        #174:#175     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #174 = Utf8               getStatus
  #175 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #176 = Methodref          #177.#178     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #177 = Class              #179          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #178 = NameAndType        #180:#30      // getLevel:()I
  #179 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #180 = Utf8               getLevel
  #181 = Methodref          #32.#182      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #182 = NameAndType        #183:#184     // getLocale:()Ljava/util/Locale;
  #183 = Utf8               getLocale
  #184 = Utf8               ()Ljava/util/Locale;
  #185 = String             #186          // html/common/shadow_item-lowlevel.htm
  #186 = Utf8               html/common/shadow_item-lowlevel.htm
  #187 = Methodref          #112.#188     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #188 = NameAndType        #189:#190     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #189 = Utf8               setFile
  #190 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #191 = String             #192          // html/common/shadow_item_mi_c.htm
  #192 = Utf8               html/common/shadow_item_mi_c.htm
  #193 = String             #194          // html/common/shadow_item_hi_c.htm
  #194 = Utf8               html/common/shadow_item_hi_c.htm
  #195 = String             #196          // html/common/shadow_item_b.htm
  #196 = Utf8               html/common/shadow_item_b.htm
  #197 = String             #198          // Exc_Multisell
  #198 = Utf8               Exc_Multisell
  #199 = String             #200          // Newbie_Exc_Multisell
  #200 = Utf8               Newbie_Exc_Multisell
  #201 = Methodref          #32.#202      // ext/mods/gameserver/model/actor/Player.isNewbie:(Z)Z
  #202 = NameAndType        #203:#204     // isNewbie:(Z)Z
  #203 = Utf8               isNewbie
  #204 = Utf8               (Z)Z
  #205 = String             #206          // html/exchangelvlimit.htm
  #206 = Utf8               html/exchangelvlimit.htm
  #207 = Methodref          #2.#208       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #208 = NameAndType        #209:#171     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #209 = Utf8               onBypassFeedback
  #210 = Methodref          #26.#211      // ext/mods/gameserver/model/actor/instance/Merchant.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #211 = NameAndType        #212:#213     // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #212 = Utf8               getHtmlPath
  #213 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #214 = Methodref          #215.#216     // ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
  #215 = Class              #217          // ext/mods/gameserver/data/manager/BuyListManager
  #216 = NameAndType        #96:#218      // getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
  #217 = Utf8               ext/mods/gameserver/data/manager/BuyListManager
  #218 = Utf8               ()Lext/mods/gameserver/data/manager/BuyListManager;
  #219 = Methodref          #215.#220     // ext/mods/gameserver/data/manager/BuyListManager.getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #220 = NameAndType        #221:#222     // getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #221 = Utf8               getBuyList
  #222 = Utf8               (I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #223 = Methodref          #224.#225     // ext/mods/gameserver/model/buylist/NpcBuyList.isNpcAllowed:(I)Z
  #224 = Class              #226          // ext/mods/gameserver/model/buylist/NpcBuyList
  #225 = NameAndType        #227:#228     // isNpcAllowed:(I)Z
  #226 = Utf8               ext/mods/gameserver/model/buylist/NpcBuyList
  #227 = Utf8               isNpcAllowed
  #228 = Utf8               (I)Z
  #229 = Methodref          #32.#230      // ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
  #230 = NameAndType        #231:#232     // tempInventoryDisable:()V
  #231 = Utf8               tempInventoryDisable
  #232 = Utf8               ()V
  #233 = Class              #234          // ext/mods/gameserver/network/serverpackets/ShopPreviewList
  #234 = Utf8               ext/mods/gameserver/network/serverpackets/ShopPreviewList
  #235 = Class              #236          // ext/mods/gameserver/skills/L2Skill
  #236 = Utf8               ext/mods/gameserver/skills/L2Skill
  #237 = Methodref          #32.#238      // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
  #238 = NameAndType        #239:#240     // getSkillLevel:(I)I
  #239 = Utf8               getSkillLevel
  #240 = Utf8               (I)I
  #241 = Methodref          #233.#242     // ext/mods/gameserver/network/serverpackets/ShopPreviewList."<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;II)V
  #242 = NameAndType        #5:#243       // "<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;II)V
  #243 = Utf8               (Lext/mods/gameserver/model/buylist/NpcBuyList;II)V
  #244 = Class              #245          // ext/mods/gameserver/network/serverpackets/BuyList
  #245 = Utf8               ext/mods/gameserver/network/serverpackets/BuyList
  #246 = Methodref          #26.#247      // ext/mods/gameserver/model/actor/instance/Merchant.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #247 = NameAndType        #248:#249     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #248 = Utf8               getCastle
  #249 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #250 = Methodref          #251.#252     // ext/mods/gameserver/model/residence/castle/Castle.getTaxRate:()D
  #251 = Class              #253          // ext/mods/gameserver/model/residence/castle/Castle
  #252 = NameAndType        #254:#255     // getTaxRate:()D
  #253 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #254 = Utf8               getTaxRate
  #255 = Utf8               ()D
  #256 = Methodref          #244.#257     // ext/mods/gameserver/network/serverpackets/BuyList."<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #257 = NameAndType        #5:#258       // "<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #258 = Utf8               (Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #259 = Utf8               Code
  #260 = Utf8               LineNumberTable
  #261 = Utf8               LocalVariableTable
  #262 = Utf8               this
  #263 = Utf8               Lext/mods/gameserver/model/actor/instance/Merchant;
  #264 = Utf8               objectId
  #265 = Utf8               I
  #266 = Utf8               template
  #267 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #268 = Utf8               player
  #269 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #270 = Utf8               npcId
  #271 = Utf8               val
  #272 = Utf8               filename
  #273 = Utf8               Ljava/lang/String;
  #274 = Utf8               StackMapTable
  #275 = Utf8               content
  #276 = Utf8               html
  #277 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #278 = Utf8               items
  #279 = Utf8               Ljava/util/List;
  #280 = Utf8               command
  #281 = Utf8               st
  #282 = Utf8               Ljava/util/StringTokenizer;
  #283 = Utf8               actualCommand
  #284 = Utf8               LocalVariableTypeTable
  #285 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #286 = Utf8               buyList
  #287 = Utf8               Lext/mods/gameserver/model/buylist/NpcBuyList;
  #288 = Utf8               SourceFile
  #289 = Utf8               Merchant.java
  #290 = Utf8               BootstrapMethods
  #291 = String             #292          // \u0001
  #292 = Utf8               \u0001
  #293 = String             #294          // \u0001-\u0001
  #294 = Utf8               \u0001-\u0001
  #295 = String             #296          // html/merchant/\u0001.htm
  #296 = Utf8               html/merchant/\u0001.htm
  #297 = String             #298          // \u0001/\u0001-empty.htm
  #298 = Utf8               \u0001/\u0001-empty.htm
  #299 = MethodHandle       6:#300        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #300 = Methodref          #301.#302     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #301 = Class              #303          // java/lang/invoke/StringConcatFactory
  #302 = NameAndType        #11:#304      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #303 = Utf8               java/lang/invoke/StringConcatFactory
  #304 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #305 = Utf8               InnerClasses
  #306 = Class              #307          // java/lang/invoke/MethodHandles$Lookup
  #307 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #308 = Class              #309          // java/lang/invoke/MethodHandles
  #309 = Utf8               java/lang/invoke/MethodHandles
  #310 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Merchant(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 46: 0
        line 47: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Merchant;
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
        line 52: 0
        line 54: 4
        line 55: 8
        line 57: 19
        line 59: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/Merchant;
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
      stack=5, locals=8, args_size=3
         0: getstatic     #19                 // Field ext/mods/Config.KARMA_PLAYER_CAN_SHOP:Z
         3: ifne          34
         6: aload_0
         7: invokevirtual #25                 // Method getNpcId:()I
        10: sipush        30420
        13: if_icmpeq     34
        16: aload_1
        17: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        20: ifle          34
        23: aload_0
        24: aload_1
        25: ldc           #36                 // String merchant
        27: invokevirtual #38                 // Method showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        30: ifeq          34
        33: return
        34: new           #42                 // class java/util/StringTokenizer
        37: dup
        38: aload_2
        39: ldc           #44                 // String
        41: invokespecial #46                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        44: astore_3
        45: aload_3
        46: invokevirtual #49                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        49: astore        4
        51: aload         4
        53: ldc           #53                 // String Buy
        55: invokevirtual #55                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        58: ifeq          85
        61: aload_3
        62: invokevirtual #61                 // Method java/util/StringTokenizer.countTokens:()I
        65: iconst_1
        66: if_icmpge     70
        69: return
        70: aload_0
        71: aload_1
        72: aload_3
        73: invokevirtual #49                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        76: invokestatic  #64                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        79: invokevirtual #70                 // Method showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
        82: goto          552
        85: aload         4
        87: ldc           #74                 // String Sell
        89: invokevirtual #55                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        92: ifeq          237
        95: aload_1
        96: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        99: invokevirtual #80                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getSellableItems:()Ljava/util/List;
       102: astore        5
       104: aload         5
       106: invokeinterface #86,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       111: ifeq          217
       114: invokestatic  #92                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       117: aload_1
       118: aload_0
       119: instanceof    #98                 // class ext/mods/gameserver/model/actor/instance/Fisherman
       122: ifeq          130
       125: ldc           #100                // String fisherman
       127: goto          132
       130: ldc           #36                 // String merchant
       132: aload_0
       133: invokevirtual #25                 // Method getNpcId:()I
       136: invokedynamic #102,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       141: invokevirtual #105                // Method ext/mods/gameserver/data/HTMLData.exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       144: ifeq          217
       147: invokestatic  #92                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       150: aload_1
       151: aload_0
       152: instanceof    #98                 // class ext/mods/gameserver/model/actor/instance/Fisherman
       155: ifeq          163
       158: ldc           #100                // String fisherman
       160: goto          165
       163: ldc           #36                 // String merchant
       165: aload_0
       166: invokevirtual #25                 // Method getNpcId:()I
       169: invokedynamic #102,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       174: invokevirtual #108                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       177: astore        6
       179: new           #112                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       182: dup
       183: aload_0
       184: invokevirtual #114                // Method getObjectId:()I
       187: invokespecial #117                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       190: astore        7
       192: aload         7
       194: aload         6
       196: invokevirtual #120                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       199: aload         7
       201: ldc           #124                // String %objectId%
       203: aload_0
       204: invokevirtual #114                // Method getObjectId:()I
       207: invokevirtual #126                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       210: aload_1
       211: aload         7
       213: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       216: return
       217: aload_1
       218: new           #134                // class ext/mods/gameserver/network/serverpackets/SellList
       221: dup
       222: aload_1
       223: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
       226: aload         5
       228: invokespecial #139                // Method ext/mods/gameserver/network/serverpackets/SellList."<init>":(ILjava/util/List;)V
       231: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       234: goto          552
       237: aload         4
       239: ldc           #142                // String Wear
       241: invokevirtual #55                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       244: ifeq          277
       247: getstatic     #144                // Field ext/mods/Config.ALLOW_WEAR:Z
       250: ifeq          277
       253: aload_3
       254: invokevirtual #61                 // Method java/util/StringTokenizer.countTokens:()I
       257: iconst_1
       258: if_icmpge     262
       261: return
       262: aload_0
       263: aload_1
       264: aload_3
       265: invokevirtual #49                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       268: invokestatic  #64                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       271: invokevirtual #147                // Method showWearWindow:(Lext/mods/gameserver/model/actor/Player;I)V
       274: goto          552
       277: aload         4
       279: ldc           #150                // String Multisell
       281: invokevirtual #55                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       284: ifeq          312
       287: aload_3
       288: invokevirtual #61                 // Method java/util/StringTokenizer.countTokens:()I
       291: iconst_1
       292: if_icmpge     296
       295: return
       296: invokestatic  #152                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       299: aload_3
       300: invokevirtual #49                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       303: aload_1
       304: aload_0
       305: iconst_0
       306: invokevirtual #157                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
       309: goto          552
       312: aload         4
       314: ldc           #161                // String Multisell_Shadow
       316: invokevirtual #55                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       319: ifeq          458
       322: new           #112                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       325: dup
       326: aload_0
       327: invokevirtual #114                // Method getObjectId:()I
       330: invokespecial #117                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       333: astore        5
       335: getstatic     #163                // Field ext/mods/Config.ALLOW_SHADOW_WEAPONS:Z
       338: ifne          349
       341: aload_0
       342: aload_1
       343: ldc           #166                // String html/script/feature/ShadowWeapon/message.htm
       345: invokevirtual #168                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       348: return
       349: aload_1
       350: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       353: invokevirtual #176                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       356: bipush        40
       358: if_icmpge     375
       361: aload         5
       363: aload_1
       364: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       367: ldc           #185                // String html/common/shadow_item-lowlevel.htm
       369: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       372: goto          438
       375: aload_1
       376: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       379: invokevirtual #176                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       382: bipush        46
       384: if_icmpge     401
       387: aload         5
       389: aload_1
       390: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       393: ldc           #191                // String html/common/shadow_item_mi_c.htm
       395: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       398: goto          438
       401: aload_1
       402: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       405: invokevirtual #176                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       408: bipush        52
       410: if_icmpge     427
       413: aload         5
       415: aload_1
       416: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       419: ldc           #193                // String html/common/shadow_item_hi_c.htm
       421: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       424: goto          438
       427: aload         5
       429: aload_1
       430: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       433: ldc           #195                // String html/common/shadow_item_b.htm
       435: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       438: aload         5
       440: ldc           #124                // String %objectId%
       442: aload_0
       443: invokevirtual #114                // Method getObjectId:()I
       446: invokevirtual #126                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       449: aload_1
       450: aload         5
       452: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       455: goto          552
       458: aload         4
       460: ldc           #197                // String Exc_Multisell
       462: invokevirtual #55                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       465: ifeq          493
       468: aload_3
       469: invokevirtual #61                 // Method java/util/StringTokenizer.countTokens:()I
       472: iconst_1
       473: if_icmpge     477
       476: return
       477: invokestatic  #152                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       480: aload_3
       481: invokevirtual #49                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       484: aload_1
       485: aload_0
       486: iconst_1
       487: invokevirtual #157                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
       490: goto          552
       493: aload         4
       495: ldc           #199                // String Newbie_Exc_Multisell
       497: invokevirtual #55                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       500: ifeq          546
       503: aload_3
       504: invokevirtual #61                 // Method java/util/StringTokenizer.countTokens:()I
       507: iconst_1
       508: if_icmpge     512
       511: return
       512: aload_1
       513: iconst_1
       514: invokevirtual #201                // Method ext/mods/gameserver/model/actor/Player.isNewbie:(Z)Z
       517: ifeq          536
       520: invokestatic  #152                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       523: aload_3
       524: invokevirtual #49                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       527: aload_1
       528: aload_0
       529: iconst_1
       530: invokevirtual #157                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
       533: goto          552
       536: aload_0
       537: aload_1
       538: ldc           #205                // String html/exchangelvlimit.htm
       540: invokevirtual #168                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       543: goto          552
       546: aload_0
       547: aload_1
       548: aload_2
       549: invokespecial #207                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       552: return
      LineNumberTable:
        line 65: 0
        line 66: 33
        line 68: 34
        line 69: 45
        line 71: 51
        line 73: 61
        line 74: 69
        line 76: 70
        line 78: 85
        line 80: 95
        line 81: 104
        line 83: 114
        line 85: 147
        line 86: 179
        line 87: 192
        line 88: 199
        line 89: 210
        line 90: 216
        line 94: 217
        line 95: 234
        line 96: 237
        line 98: 253
        line 99: 261
        line 101: 262
        line 103: 277
        line 105: 287
        line 106: 295
        line 108: 296
        line 110: 312
        line 112: 322
        line 114: 335
        line 116: 341
        line 117: 348
        line 120: 349
        line 121: 361
        line 122: 375
        line 123: 387
        line 124: 401
        line 125: 413
        line 127: 427
        line 129: 438
        line 130: 449
        line 131: 455
        line 132: 458
        line 134: 468
        line 135: 476
        line 137: 477
        line 139: 493
        line 141: 503
        line 142: 511
        line 144: 512
        line 145: 520
        line 147: 536
        line 150: 546
        line 151: 552
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          179      38     6 content   Ljava/lang/String;
          192      25     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          104     130     5 items   Ljava/util/List;
          335     120     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     553     0  this   Lext/mods/gameserver/model/actor/instance/Merchant;
            0     553     1 player   Lext/mods/gameserver/model/actor/Player;
            0     553     2 command   Ljava/lang/String;
           45     508     3    st   Ljava/util/StringTokenizer;
           51     502     4 actualCommand   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          104     130     5 items   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 25
        frame_type = 34 /* same */
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/StringTokenizer, class java/lang/String ]
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/actor/instance/Merchant, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/util/List ]
          stack = [ class ext/mods/gameserver/data/HTMLData, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/Merchant, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/util/List ]
          stack = [ class ext/mods/gameserver/data/HTMLData, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/instance/Merchant, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/util/List ]
          stack = [ class ext/mods/gameserver/data/HTMLData, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/Merchant, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/util/List ]
          stack = [ class ext/mods/gameserver/data/HTMLData, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 24 /* same */
        frame_type = 14 /* same */
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 18 /* same */
        frame_type = 23 /* same */
        frame_type = 9 /* same */
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: getstatic     #19                 // Field ext/mods/Config.KARMA_PLAYER_CAN_SHOP:Z
         3: ifne          34
         6: aload_0
         7: invokevirtual #25                 // Method getNpcId:()I
        10: sipush        30420
        13: if_icmpeq     34
        16: aload_1
        17: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        20: ifle          34
        23: aload_0
        24: aload_1
        25: ldc           #36                 // String merchant
        27: invokevirtual #38                 // Method showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        30: ifeq          34
        33: return
        34: aload_0
        35: aload_1
        36: aload_0
        37: aload_1
        38: aload_0
        39: invokevirtual #25                 // Method getNpcId:()I
        42: iload_2
        43: invokevirtual #210                // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        46: invokevirtual #168                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        49: return
      LineNumberTable:
        line 156: 0
        line 157: 33
        line 159: 34
        line 160: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/actor/instance/Merchant;
            0      50     1 player   Lext/mods/gameserver/model/actor/Player;
            0      50     2   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 34 /* same */

  protected final void showBuyWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=7, locals=4, args_size=3
         0: invokestatic  #214                // Method ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
         3: iload_2
         4: invokevirtual #219                // Method ext/mods/gameserver/data/manager/BuyListManager.getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
         7: astore_3
         8: aload_3
         9: ifnull        23
        12: aload_3
        13: aload_0
        14: invokevirtual #25                 // Method getNpcId:()I
        17: invokevirtual #223                // Method ext/mods/gameserver/model/buylist/NpcBuyList.isNpcAllowed:(I)Z
        20: ifne          24
        23: return
        24: aload_1
        25: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
        28: aload_1
        29: new           #244                // class ext/mods/gameserver/network/serverpackets/BuyList
        32: dup
        33: aload_3
        34: aload_1
        35: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
        38: aload_0
        39: invokevirtual #246                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        42: ifnull        55
        45: aload_0
        46: invokevirtual #246                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        49: invokevirtual #250                // Method ext/mods/gameserver/model/residence/castle/Castle.getTaxRate:()D
        52: goto          56
        55: dconst_0
        56: invokespecial #256                // Method ext/mods/gameserver/network/serverpackets/BuyList."<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
        59: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        62: return
      LineNumberTable:
        line 174: 0
        line 175: 8
        line 176: 23
        line 178: 24
        line 179: 28
        line 180: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/actor/instance/Merchant;
            0      63     1 player   Lext/mods/gameserver/model/actor/Player;
            0      63     2   val   I
            8      55     3 buyList   Lext/mods/gameserver/model/buylist/NpcBuyList;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/buylist/NpcBuyList ]
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/instance/Merchant, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/buylist/NpcBuyList ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 29, uninitialized 29, class ext/mods/gameserver/model/buylist/NpcBuyList, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Merchant, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/buylist/NpcBuyList ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 29, uninitialized 29, class ext/mods/gameserver/model/buylist/NpcBuyList, int, double ]
}
SourceFile: "Merchant.java"
BootstrapMethods:
  0: #299 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #291 \u0001
  1: #299 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #293 \u0001-\u0001
  2: #299 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #295 html/merchant/\u0001.htm
  3: #299 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #297 \u0001/\u0001-empty.htm
InnerClasses:
  public static final #310= #306 of #308; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
