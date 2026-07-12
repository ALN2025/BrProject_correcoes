// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminItem
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminItem.class
  Last modified 9 de jul de 2026; size 7424 bytes
  MD5 checksum 1d5ca01a8480648159d1c494fa7f7e23
  Compiled from "AdminItem.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminItem implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/handler/admincommandhandlers/AdminItem
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/handler/admincommandhandlers/AdminItem.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/handler/admincommandhandlers/AdminItem
    #9 = NameAndType        #11:#12       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminItem
   #11 = Utf8               getTargetPlayer
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #13 = Class              #14           // java/util/StringTokenizer
   #14 = Utf8               java/util/StringTokenizer
   #15 = Methodref          #13.#16       // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #16 = NameAndType        #5:#17        // "<init>":(Ljava/lang/String;)V
   #17 = Utf8               (Ljava/lang/String;)V
   #18 = Methodref          #13.#19       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #19 = NameAndType        #20:#21       // nextToken:()Ljava/lang/String;
   #20 = Utf8               nextToken
   #21 = Utf8               ()Ljava/lang/String;
   #22 = String             #23           // admin_give
   #23 = Utf8               admin_give
   #24 = Methodref          #25.#26       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #25 = Class              #27           // java/lang/String
   #26 = NameAndType        #28:#29       // startsWith:(Ljava/lang/String;)Z
   #27 = Utf8               java/lang/String
   #28 = Utf8               startsWith
   #29 = Utf8               (Ljava/lang/String;)Z
   #30 = Methodref          #13.#31       // java/util/StringTokenizer.hasMoreTokens:()Z
   #31 = NameAndType        #32:#33       // hasMoreTokens:()Z
   #32 = Utf8               hasMoreTokens
   #33 = Utf8               ()Z
   #34 = String             #35           // Usage: //give itemId count
   #35 = Utf8               Usage: //give itemId count
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #37 = Class              #39           // ext/mods/gameserver/model/actor/Player
   #38 = NameAndType        #40:#17       // sendMessage:(Ljava/lang/String;)V
   #39 = Utf8               ext/mods/gameserver/model/actor/Player
   #40 = Utf8               sendMessage
   #41 = Methodref          #42.#43       // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #42 = Class              #44           // ext/mods/commons/lang/StringUtil
   #43 = NameAndType        #45:#29       // isDigit:(Ljava/lang/String;)Z
   #44 = Utf8               ext/mods/commons/lang/StringUtil
   #45 = Utf8               isDigit
   #46 = Methodref          #47.#48       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #47 = Class              #49           // java/lang/Integer
   #48 = NameAndType        #50:#51       // parseInt:(Ljava/lang/String;)I
   #49 = Utf8               java/lang/Integer
   #50 = Utf8               parseInt
   #51 = Utf8               (Ljava/lang/String;)I
   #52 = Methodref          #8.#53        // ext/mods/gameserver/handler/admincommandhandlers/AdminItem.createItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;III)V
   #53 = NameAndType        #54:#55       // createItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;III)V
   #54 = Utf8               createItem
   #55 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;III)V
   #56 = String             #57           // admin_item
   #57 = Utf8               admin_item
   #58 = String             #59           // itemcreation.htm
   #59 = Utf8               itemcreation.htm
   #60 = Methodref          #8.#61        // ext/mods/gameserver/handler/admincommandhandlers/AdminItem.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #61 = NameAndType        #62:#63       // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #62 = Utf8               sendFile
   #63 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #64 = Methodref          #25.#65       // java/lang/String.hashCode:()I
   #65 = NameAndType        #66:#67       // hashCode:()I
   #66 = Utf8               hashCode
   #67 = Utf8               ()I
   #68 = String             #69           // coin
   #69 = Utf8               coin
   #70 = Methodref          #25.#71       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #71 = NameAndType        #72:#73       // equals:(Ljava/lang/Object;)Z
   #72 = Utf8               equals
   #73 = Utf8               (Ljava/lang/Object;)Z
   #74 = String             #75           // set
   #75 = Utf8               set
   #76 = Methodref          #8.#77        // ext/mods/gameserver/handler/admincommandhandlers/AdminItem.getCoinId:(Ljava/lang/String;)I
   #77 = NameAndType        #78:#51       // getCoinId:(Ljava/lang/String;)I
   #78 = Utf8               getCoinId
   #79 = String             #80           // Usage: //item coin name [amount] [radius]
   #80 = Utf8               Usage: //item coin name [amount] [radius]
   #81 = Class              #82           // java/lang/Exception
   #82 = Utf8               java/lang/Exception
   #83 = Methodref          #84.#85       // ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
   #84 = Class              #86           // ext/mods/gameserver/data/xml/ArmorSetData
   #85 = NameAndType        #87:#88       // getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
   #86 = Utf8               ext/mods/gameserver/data/xml/ArmorSetData
   #87 = Utf8               getInstance
   #88 = Utf8               ()Lext/mods/gameserver/data/xml/ArmorSetData;
   #89 = Methodref          #84.#90       // ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
   #90 = NameAndType        #91:#92       // getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
   #91 = Utf8               getSet
   #92 = Utf8               (I)Lext/mods/gameserver/model/item/ArmorSet;
   #93 = String             #94           // This chest has no set.
   #94 = Utf8               This chest has no set.
   #95 = Methodref          #96.#97       // ext/mods/gameserver/model/item/ArmorSet.getSetItemsId:()[I
   #96 = Class              #98           // ext/mods/gameserver/model/item/ArmorSet
   #97 = NameAndType        #99:#100      // getSetItemsId:()[I
   #98 = Utf8               ext/mods/gameserver/model/item/ArmorSet
   #99 = Utf8               getSetItemsId
  #100 = Utf8               ()[I
  #101 = Methodref          #37.#102      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #102 = NameAndType        #103:#104     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #103 = Utf8               getInventory
  #104 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #105 = Methodref          #106.#107     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #106 = Class              #108          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #107 = NameAndType        #109:#110     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #108 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #109 = Utf8               addItem
  #110 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #111 = Methodref          #96.#112      // ext/mods/gameserver/model/item/ArmorSet.getShield:()I
  #112 = NameAndType        #113:#67      // getShield:()I
  #113 = Utf8               getShield
  #114 = Methodref          #96.#115      // ext/mods/gameserver/model/item/ArmorSet.toString:()Ljava/lang/String;
  #115 = NameAndType        #116:#21      // toString:()Ljava/lang/String;
  #116 = Utf8               toString
  #117 = Methodref          #37.#118      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #118 = NameAndType        #119:#21      // getName:()Ljava/lang/String;
  #119 = Utf8               getName
  #120 = InvokeDynamic      #0:#121       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #121 = NameAndType        #122:#123     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #122 = Utf8               makeConcatWithConstants
  #123 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #124 = String             #125          // Usage: //item set [chestId]
  #125 = Utf8               Usage: //item set [chestId]
  #126 = Class              #127          // java/lang/StringBuilder
  #127 = Utf8               java/lang/StringBuilder
  #128 = Methodref          #126.#3       // java/lang/StringBuilder."<init>":()V
  #129 = Methodref          #84.#130      // ext/mods/gameserver/data/xml/ArmorSetData.getSets:()Ljava/util/Collection;
  #130 = NameAndType        #131:#132     // getSets:()Ljava/util/Collection;
  #131 = Utf8               getSets
  #132 = Utf8               ()Ljava/util/Collection;
  #133 = InterfaceMethodref #134.#135     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #134 = Class              #136          // java/util/Collection
  #135 = NameAndType        #137:#138     // iterator:()Ljava/util/Iterator;
  #136 = Utf8               java/util/Collection
  #137 = Utf8               iterator
  #138 = Utf8               ()Ljava/util/Iterator;
  #139 = InterfaceMethodref #140.#141     // java/util/Iterator.hasNext:()Z
  #140 = Class              #142          // java/util/Iterator
  #141 = NameAndType        #143:#33      // hasNext:()Z
  #142 = Utf8               java/util/Iterator
  #143 = Utf8               hasNext
  #144 = InterfaceMethodref #140.#145     // java/util/Iterator.next:()Ljava/lang/Object;
  #145 = NameAndType        #146:#147     // next:()Ljava/lang/Object;
  #146 = Utf8               next
  #147 = Utf8               ()Ljava/lang/Object;
  #148 = String             #149          // <tr>
  #149 = Utf8               <tr>
  #150 = Methodref          #126.#151     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #151 = NameAndType        #152:#153     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #152 = Utf8               append
  #153 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #154 = InvokeDynamic      #1:#155       // #1:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #155 = NameAndType        #122:#156     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #156 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #157 = String             #158          // </tr>
  #158 = Utf8               </tr>
  #159 = Class              #160          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #160 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #161 = Methodref          #159.#162     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #162 = NameAndType        #5:#163       // "<init>":(I)V
  #163 = Utf8               (I)V
  #164 = Methodref          #37.#165      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #165 = NameAndType        #166:#167     // getLocale:()Ljava/util/Locale;
  #166 = Utf8               getLocale
  #167 = Utf8               ()Ljava/util/Locale;
  #168 = String             #169          // html/admin/itemsets.htm
  #169 = Utf8               html/admin/itemsets.htm
  #170 = Methodref          #159.#171     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #171 = NameAndType        #172:#173     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #172 = Utf8               setFile
  #173 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #174 = String             #175          // %sets%
  #175 = Utf8               %sets%
  #176 = Methodref          #126.#115     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #177 = Methodref          #159.#178     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #178 = NameAndType        #179:#180     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #179 = Utf8               replace
  #180 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #181 = Methodref          #37.#182      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #182 = NameAndType        #183:#184     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #183 = Utf8               sendPacket
  #184 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #185 = Fieldref           #8.#186       // ext/mods/gameserver/handler/admincommandhandlers/AdminItem.ADMIN_COMMANDS:[Ljava/lang/String;
  #186 = NameAndType        #187:#188     // ADMIN_COMMANDS:[Ljava/lang/String;
  #187 = Utf8               ADMIN_COMMANDS
  #188 = Utf8               [Ljava/lang/String;
  #189 = Methodref          #190.#191     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #190 = Class              #192          // ext/mods/gameserver/data/xml/ItemData
  #191 = NameAndType        #87:#193      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #192 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #193 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #194 = Methodref          #190.#195     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #195 = NameAndType        #196:#197     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #196 = Utf8               getTemplate
  #197 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #198 = String             #199          // This item doesn\'t exist.
  #199 = Utf8               This item doesn\'t exist.
  #200 = Methodref          #106.#201     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacityByItemId:(II)Z
  #201 = NameAndType        #202:#203     // validateCapacityByItemId:(II)Z
  #202 = Utf8               validateCapacityByItemId
  #203 = Utf8               (II)Z
  #204 = String             #205          // Your target\'s inventory is full.
  #205 = Utf8               Your target\'s inventory is full.
  #206 = InvokeDynamic      #2:#207       // #2:accept:(II)Ljava/util/function/Consumer;
  #207 = NameAndType        #208:#209     // accept:(II)Ljava/util/function/Consumer;
  #208 = Utf8               accept
  #209 = Utf8               (II)Ljava/util/function/Consumer;
  #210 = Methodref          #37.#211      // ext/mods/gameserver/model/actor/Player.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #211 = NameAndType        #212:#213     // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #212 = Utf8               forEachKnownTypeInRadius
  #213 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #214 = Methodref          #215.#118     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #215 = Class              #216          // ext/mods/gameserver/model/item/kind/Item
  #216 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #217 = InvokeDynamic      #3:#218       // #3:makeConcatWithConstants:(ILjava/lang/String;I)Ljava/lang/String;
  #218 = NameAndType        #122:#219     // makeConcatWithConstants:(ILjava/lang/String;I)Ljava/lang/String;
  #219 = Utf8               (ILjava/lang/String;I)Ljava/lang/String;
  #220 = Methodref          #37.#221      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #221 = NameAndType        #109:#222     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #222 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #223 = InvokeDynamic      #4:#224       // #4:makeConcatWithConstants:(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #224 = NameAndType        #122:#225     // makeConcatWithConstants:(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #225 = Utf8               (ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #226 = String             #227          // adena
  #227 = Utf8               adena
  #228 = Methodref          #25.#229      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #229 = NameAndType        #230:#29      // equalsIgnoreCase:(Ljava/lang/String;)Z
  #230 = Utf8               equalsIgnoreCase
  #231 = String             #232          // ancient
  #232 = Utf8               ancient
  #233 = String             #234          // festival
  #234 = Utf8               festival
  #235 = Class              #236          // ext/mods/gameserver/handler/IAdminCommandHandler
  #236 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #237 = Utf8               Code
  #238 = Utf8               LineNumberTable
  #239 = Utf8               LocalVariableTable
  #240 = Utf8               this
  #241 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminItem;
  #242 = Utf8               useAdminCommand
  #243 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #244 = Utf8               param
  #245 = Utf8               Ljava/lang/String;
  #246 = Utf8               id
  #247 = Utf8               I
  #248 = Utf8               count
  #249 = Utf8               radius
  #250 = Utf8               e
  #251 = Utf8               Ljava/lang/Exception;
  #252 = Utf8               itemId
  #253 = Utf8               armorSet
  #254 = Utf8               Lext/mods/gameserver/model/item/ArmorSet;
  #255 = Utf8               isNextLine
  #256 = Utf8               Z
  #257 = Utf8               i
  #258 = Utf8               sb
  #259 = Utf8               Ljava/lang/StringBuilder;
  #260 = Utf8               html
  #261 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #262 = Utf8               command
  #263 = Utf8               player
  #264 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #265 = Utf8               targetPlayer
  #266 = Utf8               st
  #267 = Utf8               Ljava/util/StringTokenizer;
  #268 = Utf8               StackMapTable
  #269 = Class              #270          // "[I"
  #270 = Utf8               [I
  #271 = Utf8               getAdminCommandList
  #272 = Utf8               ()[Ljava/lang/String;
  #273 = Utf8               num
  #274 = Utf8               item
  #275 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #276 = Utf8               name
  #277 = Utf8               lambda$createItem$0
  #278 = Utf8               (IILext/mods/gameserver/model/actor/Player;)V
  #279 = Utf8               p
  #280 = Utf8               <clinit>
  #281 = Utf8               SourceFile
  #282 = Utf8               AdminItem.java
  #283 = Utf8               BootstrapMethods
  #284 = String             #285          // You have spawned \u0001 in \u0001\'s inventory.
  #285 = Utf8               You have spawned \u0001 in \u0001\'s inventory.
  #286 = String             #287          // <td><a action=\"bypass -h admin_item set \u0001\">\u0001</a></td>
  #287 = Utf8               <td><a action=\"bypass -h admin_item set \u0001\">\u0001</a></td>
  #288 = MethodType         #289          //  (Ljava/lang/Object;)V
  #289 = Utf8               (Ljava/lang/Object;)V
  #290 = MethodHandle       6:#291        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminItem.lambda$createItem$0:(IILext/mods/gameserver/model/actor/Player;)V
  #291 = Methodref          #8.#292       // ext/mods/gameserver/handler/admincommandhandlers/AdminItem.lambda$createItem$0:(IILext/mods/gameserver/model/actor/Player;)V
  #292 = NameAndType        #277:#278     // lambda$createItem$0:(IILext/mods/gameserver/model/actor/Player;)V
  #293 = MethodType         #294          //  (Lext/mods/gameserver/model/actor/Player;)V
  #294 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #295 = String             #296          // Surrounding players were rewarded with \u0001 \u0001 in a \u0001 radius.
  #296 = Utf8               Surrounding players were rewarded with \u0001 \u0001 in a \u0001 radius.
  #297 = String             #298          // You have spawned \u0001 \u0001 (\u0001) in \u0001\'s inventory.
  #298 = Utf8               You have spawned \u0001 \u0001 (\u0001) in \u0001\'s inventory.
  #299 = MethodHandle       6:#300        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #300 = Methodref          #301.#302     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #301 = Class              #303          // java/lang/invoke/StringConcatFactory
  #302 = NameAndType        #122:#304     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #303 = Utf8               java/lang/invoke/StringConcatFactory
  #304 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #305 = MethodHandle       6:#306        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #306 = Methodref          #307.#308     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #307 = Class              #309          // java/lang/invoke/LambdaMetafactory
  #308 = NameAndType        #310:#311     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #309 = Utf8               java/lang/invoke/LambdaMetafactory
  #310 = Utf8               metafactory
  #311 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #312 = Utf8               InnerClasses
  #313 = Class              #314          // java/lang/invoke/MethodHandles$Lookup
  #314 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #315 = Class              #316          // java/lang/invoke/MethodHandles
  #316 = Utf8               java/lang/invoke/MethodHandles
  #317 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminItem();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminItem;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=13, args_size=3
         0: aload_0
         1: aload_2
         2: iconst_1
         3: invokevirtual #7                  // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
         6: astore_3
         7: new           #13                 // class java/util/StringTokenizer
        10: dup
        11: aload_1
        12: invokespecial #15                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
        15: astore        4
        17: aload         4
        19: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        22: astore_1
        23: aload_1
        24: ldc           #22                 // String admin_give
        26: invokevirtual #24                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        29: ifeq          111
        32: aload         4
        34: invokevirtual #30                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        37: ifne          47
        40: aload_2
        41: ldc           #34                 // String Usage: //give itemId count
        43: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        46: return
        47: aload         4
        49: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        52: astore        5
        54: aload         5
        56: invokestatic  #41                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
        59: ifne          69
        62: aload_2
        63: ldc           #34                 // String Usage: //give itemId count
        65: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        68: return
        69: aload         5
        71: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        74: istore        6
        76: aload         4
        78: invokevirtual #30                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        81: ifeq          95
        84: aload         4
        86: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        89: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        92: goto          96
        95: iconst_1
        96: istore        7
        98: aload_2
        99: aload_3
       100: iload         6
       102: iload         7
       104: iconst_0
       105: invokestatic  #52                 // Method createItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;III)V
       108: goto          712
       111: aload_1
       112: ldc           #56                 // String admin_item
       114: invokevirtual #24                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       117: ifeq          712
       120: aload         4
       122: invokevirtual #30                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       125: ifne          136
       128: aload_0
       129: aload_2
       130: ldc           #58                 // String itemcreation.htm
       132: invokevirtual #60                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       135: return
       136: aload         4
       138: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       141: astore        5
       143: aload         5
       145: invokestatic  #41                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       148: ifeq          223
       151: aload         5
       153: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       156: istore        6
       158: aload         4
       160: invokevirtual #30                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       163: ifeq          177
       166: aload         4
       168: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       171: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       174: goto          178
       177: iconst_1
       178: istore        7
       180: aload         4
       182: invokevirtual #30                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       185: ifeq          199
       188: aload         4
       190: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       193: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       196: goto          200
       199: iconst_0
       200: istore        8
       202: aload_2
       203: aload_3
       204: iload         6
       206: iload         7
       208: iload         8
       210: invokestatic  #52                 // Method createItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;III)V
       213: aload_0
       214: aload_2
       215: ldc           #58                 // String itemcreation.htm
       217: invokevirtual #60                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       220: goto          712
       223: aload         5
       225: astore        6
       227: iconst_m1
       228: istore        7
       230: aload         6
       232: invokevirtual #64                 // Method java/lang/String.hashCode:()I
       235: lookupswitch  { // 2

                  113762: 276

                 3059345: 260
                 default: 289
            }
       260: aload         6
       262: ldc           #68                 // String coin
       264: invokevirtual #70                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       267: ifeq          289
       270: iconst_0
       271: istore        7
       273: goto          289
       276: aload         6
       278: ldc           #74                 // String set
       280: invokevirtual #70                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       283: ifeq          289
       286: iconst_1
       287: istore        7
       289: iload         7
       291: lookupswitch  { // 2

                       0: 316

                       1: 414
                 default: 712
            }
       316: aload         4
       318: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       321: invokestatic  #76                 // Method getCoinId:(Ljava/lang/String;)I
       324: istore        8
       326: iload         8
       328: ifgt          338
       331: aload_2
       332: ldc           #79                 // String Usage: //item coin name [amount] [radius]
       334: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       337: return
       338: aload         4
       340: invokevirtual #30                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       343: ifeq          357
       346: aload         4
       348: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       351: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       354: goto          358
       357: iconst_1
       358: istore        9
       360: aload         4
       362: invokevirtual #30                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       365: ifeq          379
       368: aload         4
       370: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       373: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       376: goto          380
       379: iconst_0
       380: istore        10
       382: aload_2
       383: aload_3
       384: iload         8
       386: iload         9
       388: iload         10
       390: invokestatic  #52                 // Method createItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;III)V
       393: goto          404
       396: astore        8
       398: aload_2
       399: ldc           #79                 // String Usage: //item coin name [amount] [radius]
       401: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       404: aload_0
       405: aload_2
       406: ldc           #58                 // String itemcreation.htm
       408: invokevirtual #60                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       411: goto          712
       414: aload         4
       416: invokevirtual #30                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       419: ifeq          557
       422: invokestatic  #83                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
       425: aload         4
       427: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       430: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       433: invokevirtual #89                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
       436: astore        8
       438: aload         8
       440: ifnonnull     450
       443: aload_2
       444: ldc           #93                 // String This chest has no set.
       446: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       449: return
       450: aload         8
       452: invokevirtual #95                 // Method ext/mods/gameserver/model/item/ArmorSet.getSetItemsId:()[I
       455: astore        9
       457: aload         9
       459: arraylength
       460: istore        10
       462: iconst_0
       463: istore        11
       465: iload         11
       467: iload         10
       469: if_icmpge     501
       472: aload         9
       474: iload         11
       476: iaload
       477: istore        12
       479: iload         12
       481: ifle          495
       484: aload_3
       485: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       488: iload         12
       490: iconst_1
       491: invokevirtual #105                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       494: pop
       495: iinc          11, 1
       498: goto          465
       501: aload         8
       503: invokevirtual #111                // Method ext/mods/gameserver/model/item/ArmorSet.getShield:()I
       506: ifle          523
       509: aload_3
       510: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       513: aload         8
       515: invokevirtual #111                // Method ext/mods/gameserver/model/item/ArmorSet.getShield:()I
       518: iconst_1
       519: invokevirtual #105                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       522: pop
       523: aload_2
       524: aload_3
       525: if_acmpeq     546
       528: aload_2
       529: aload         8
       531: invokevirtual #114                // Method ext/mods/gameserver/model/item/ArmorSet.toString:()Ljava/lang/String;
       534: aload_3
       535: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       538: invokedynamic #120,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       543: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       546: goto          557
       549: astore        8
       551: aload_2
       552: ldc           #124                // String Usage: //item set [chestId]
       554: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       557: iconst_0
       558: istore        8
       560: new           #126                // class java/lang/StringBuilder
       563: dup
       564: invokespecial #128                // Method java/lang/StringBuilder."<init>":()V
       567: astore        9
       569: invokestatic  #83                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
       572: invokevirtual #129                // Method ext/mods/gameserver/data/xml/ArmorSetData.getSets:()Ljava/util/Collection;
       575: invokeinterface #133,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       580: astore        10
       582: aload         10
       584: invokeinterface #139,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       589: ifeq          673
       592: aload         10
       594: invokeinterface #144,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       599: checkcast     #96                 // class ext/mods/gameserver/model/item/ArmorSet
       602: astore        11
       604: iload         8
       606: iconst_2
       607: irem
       608: ifne          615
       611: iconst_1
       612: goto          616
       615: iconst_0
       616: istore        12
       618: iload         12
       620: ifeq          631
       623: aload         9
       625: ldc           #148                // String <tr>
       627: invokevirtual #150                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       630: pop
       631: aload         9
       633: aload         11
       635: invokevirtual #95                 // Method ext/mods/gameserver/model/item/ArmorSet.getSetItemsId:()[I
       638: iconst_0
       639: iaload
       640: aload         11
       642: invokevirtual #114                // Method ext/mods/gameserver/model/item/ArmorSet.toString:()Ljava/lang/String;
       645: invokedynamic #154,  0            // InvokeDynamic #1:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
       650: invokevirtual #150                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       653: pop
       654: iload         12
       656: ifeq          667
       659: aload         9
       661: ldc           #157                // String </tr>
       663: invokevirtual #150                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       666: pop
       667: iinc          8, 1
       670: goto          582
       673: new           #159                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       676: dup
       677: iconst_0
       678: invokespecial #161                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       681: astore        10
       683: aload         10
       685: aload_2
       686: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       689: ldc           #168                // String html/admin/itemsets.htm
       691: invokevirtual #170                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       694: aload         10
       696: ldc           #174                // String %sets%
       698: aload         9
       700: invokevirtual #176                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       703: invokevirtual #177                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       706: aload_2
       707: aload         10
       709: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       712: return
      Exception table:
         from    to  target type
           316   337   396   Class java/lang/Exception
           338   393   396   Class java/lang/Exception
           422   449   549   Class java/lang/Exception
           450   546   549   Class java/lang/Exception
      LineNumberTable:
        line 43: 0
        line 45: 7
        line 46: 17
        line 48: 23
        line 50: 32
        line 52: 40
        line 53: 46
        line 56: 47
        line 57: 54
        line 59: 62
        line 60: 68
        line 63: 69
        line 64: 76
        line 66: 98
        line 67: 108
        line 68: 111
        line 70: 120
        line 72: 128
        line 73: 135
        line 76: 136
        line 77: 143
        line 79: 151
        line 80: 158
        line 81: 180
        line 83: 202
        line 85: 213
        line 86: 220
        line 89: 223
        line 94: 316
        line 95: 326
        line 97: 331
        line 98: 337
        line 101: 338
        line 102: 360
        line 104: 382
        line 109: 393
        line 106: 396
        line 108: 398
        line 110: 404
        line 111: 411
        line 114: 414
        line 118: 422
        line 119: 438
        line 121: 443
        line 122: 449
        line 125: 450
        line 127: 479
        line 128: 484
        line 125: 495
        line 131: 501
        line 132: 509
        line 134: 523
        line 135: 528
        line 140: 546
        line 137: 549
        line 139: 551
        line 143: 557
        line 145: 560
        line 146: 569
        line 148: 604
        line 149: 618
        line 150: 623
        line 152: 631
        line 154: 654
        line 155: 659
        line 157: 667
        line 158: 670
        line 160: 673
        line 161: 683
        line 162: 694
        line 163: 706
        line 168: 712
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      54     5 param   Ljava/lang/String;
           76      32     6    id   I
           98      10     7 count   I
          158      62     6    id   I
          180      40     7 count   I
          202      18     8 radius   I
          326      67     8    id   I
          360      33     9 count   I
          382      11    10 radius   I
          398       6     8     e   Ljava/lang/Exception;
          479      16    12 itemId   I
          438     108     8 armorSet   Lext/mods/gameserver/model/item/ArmorSet;
          551       6     8     e   Ljava/lang/Exception;
          618      52    12 isNextLine   Z
          604      66    11 armorSet   Lext/mods/gameserver/model/item/ArmorSet;
          560     152     8     i   I
          569     143     9    sb   Ljava/lang/StringBuilder;
          683      29    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          143     569     5 param   Ljava/lang/String;
            0     713     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminItem;
            0     713     1 command   Ljava/lang/String;
            0     713     2 player   Lext/mods/gameserver/model/actor/Player;
            7     706     3 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           17     696     4    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 38
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 24 /* same */
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class java/lang/String, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 22
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminItem, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/item/ArmorSet ]
        frame_type = 254 /* append */
          offset_delta = 14
          locals = [ class "[I", int, int ]
        frame_type = 29 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 21 /* same */
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */
        frame_type = 254 /* append */
          offset_delta = 24
          locals = [ int, class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/item/ArmorSet ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ int ]
        frame_type = 35 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminItem, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #185                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminItem;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #25                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #22                 // String admin_give
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #56                 // String admin_item
        13: aastore
        14: putstatic     #185                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "AdminItem.java"
BootstrapMethods:
  0: #299 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #284 You have spawned \u0001 in \u0001\'s inventory.
  1: #299 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #286 <td><a action=\"bypass -h admin_item set \u0001\">\u0001</a></td>
  2: #305 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #288 (Ljava/lang/Object;)V
      #290 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminItem.lambda$createItem$0:(IILext/mods/gameserver/model/actor/Player;)V
      #293 (Lext/mods/gameserver/model/actor/Player;)V
  3: #299 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #295 Surrounding players were rewarded with \u0001 \u0001 in a \u0001 radius.
  4: #299 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #297 You have spawned \u0001 \u0001 (\u0001) in \u0001\'s inventory.
InnerClasses:
  public static final #317= #313 of #315; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
