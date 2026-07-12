// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.DropListUI
// File: ext\mods\gameserver\handler\bypasshandlers\DropListUI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/DropListUI.class
  Last modified 9 de jul de 2026; size 9037 bytes
  MD5 checksum 459329cc56a05f708d12dce2ab10df98
  Compiled from "DropListUI.java"
public class ext.mods.gameserver.handler.bypasshandlers.DropListUI
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #110                        // ext/mods/gameserver/handler/bypasshandlers/DropListUI
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
    #8 = Class              #10           // ext/mods/gameserver/data/xml/NpcData
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #10 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #14 = NameAndType        #15:#16       // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #15 = Utf8               getTemplate
   #16 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/template/NpcTemplate.getDropData:()Ljava/util/List;
   #18 = Class              #20           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #19 = NameAndType        #21:#22       // getDropData:()Ljava/util/List;
   #20 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #21 = Utf8               getDropData
   #22 = Utf8               ()Ljava/util/List;
   #23 = InterfaceMethodref #24.#25       // java/util/List.isEmpty:()Z
   #24 = Class              #26           // java/util/List
   #25 = NameAndType        #27:#28       // isEmpty:()Z
   #26 = Utf8               java/util/List
   #27 = Utf8               isEmpty
   #28 = Utf8               ()Z
   #29 = String             #30           // This target has no drop information.
   #30 = Utf8               This target has no drop information.
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #32 = Class              #34           // ext/mods/gameserver/model/actor/Player
   #33 = NameAndType        #35:#36       // sendMessage:(Ljava/lang/String;)V
   #34 = Utf8               ext/mods/gameserver/model/actor/Player
   #35 = Utf8               sendMessage
   #36 = Utf8               (Ljava/lang/String;)V
   #37 = Class              #38           // java/util/ArrayList
   #38 = Utf8               java/util/ArrayList
   #39 = Methodref          #37.#3        // java/util/ArrayList."<init>":()V
   #40 = InterfaceMethodref #24.#41       // java/util/List.iterator:()Ljava/util/Iterator;
   #41 = NameAndType        #42:#43       // iterator:()Ljava/util/Iterator;
   #42 = Utf8               iterator
   #43 = Utf8               ()Ljava/util/Iterator;
   #44 = InterfaceMethodref #45.#46       // java/util/Iterator.hasNext:()Z
   #45 = Class              #47           // java/util/Iterator
   #46 = NameAndType        #48:#28       // hasNext:()Z
   #47 = Utf8               java/util/Iterator
   #48 = Utf8               hasNext
   #49 = InterfaceMethodref #45.#50       // java/util/Iterator.next:()Ljava/lang/Object;
   #50 = NameAndType        #51:#52       // next:()Ljava/lang/Object;
   #51 = Utf8               next
   #52 = Utf8               ()Ljava/lang/Object;
   #53 = Class              #54           // ext/mods/gameserver/model/item/DropCategory
   #54 = Utf8               ext/mods/gameserver/model/item/DropCategory
   #55 = Methodref          #53.#56       // ext/mods/gameserver/model/item/DropCategory.getDropType:()Lext/mods/gameserver/enums/DropType;
   #56 = NameAndType        #57:#58       // getDropType:()Lext/mods/gameserver/enums/DropType;
   #57 = Utf8               getDropType
   #58 = Utf8               ()Lext/mods/gameserver/enums/DropType;
   #59 = Fieldref           #60.#61       // ext/mods/gameserver/enums/DropType.HERB:Lext/mods/gameserver/enums/DropType;
   #60 = Class              #62           // ext/mods/gameserver/enums/DropType
   #61 = NameAndType        #63:#64       // HERB:Lext/mods/gameserver/enums/DropType;
   #62 = Utf8               ext/mods/gameserver/enums/DropType
   #63 = Utf8               HERB
   #64 = Utf8               Lext/mods/gameserver/enums/DropType;
   #65 = Methodref          #53.#66       // ext/mods/gameserver/model/item/DropCategory.getAllDrops:()Ljava/util/List;
   #66 = NameAndType        #67:#22       // getAllDrops:()Ljava/util/List;
   #67 = Utf8               getAllDrops
   #68 = Class              #69           // ext/mods/gameserver/model/item/DropData
   #69 = Utf8               ext/mods/gameserver/model/item/DropData
   #70 = Methodref          #71.#72       // ext/mods/gameserver/data/xml/SkipData.getInstance:()Lext/mods/gameserver/data/xml/SkipData;
   #71 = Class              #73           // ext/mods/gameserver/data/xml/SkipData
   #72 = NameAndType        #11:#74       // getInstance:()Lext/mods/gameserver/data/xml/SkipData;
   #73 = Utf8               ext/mods/gameserver/data/xml/SkipData
   #74 = Utf8               ()Lext/mods/gameserver/data/xml/SkipData;
   #75 = Methodref          #68.#76       // ext/mods/gameserver/model/item/DropData.getItemId:()I
   #76 = NameAndType        #77:#78       // getItemId:()I
   #77 = Utf8               getItemId
   #78 = Utf8               ()I
   #79 = Methodref          #71.#80       // ext/mods/gameserver/data/xml/SkipData.isSkipped:(I)Z
   #80 = NameAndType        #81:#82       // isSkipped:(I)Z
   #81 = Utf8               isSkipped
   #82 = Utf8               (I)Z
   #83 = Methodref          #68.#84       // ext/mods/gameserver/model/item/DropData.setCategoryType:(Lext/mods/gameserver/enums/DropType;)V
   #84 = NameAndType        #85:#86       // setCategoryType:(Lext/mods/gameserver/enums/DropType;)V
   #85 = Utf8               setCategoryType
   #86 = Utf8               (Lext/mods/gameserver/enums/DropType;)V
   #87 = InterfaceMethodref #24.#88       // java/util/List.add:(Ljava/lang/Object;)Z
   #88 = NameAndType        #89:#90       // add:(Ljava/lang/Object;)Z
   #89 = Utf8               add
   #90 = Utf8               (Ljava/lang/Object;)Z
   #91 = InvokeDynamic      #0:#92        // #0:compare:()Ljava/util/Comparator;
   #92 = NameAndType        #93:#94       // compare:()Ljava/util/Comparator;
   #93 = Utf8               compare
   #94 = Utf8               ()Ljava/util/Comparator;
   #95 = InterfaceMethodref #24.#96       // java/util/List.sort:(Ljava/util/Comparator;)V
   #96 = NameAndType        #97:#98       // sort:(Ljava/util/Comparator;)V
   #97 = Utf8               sort
   #98 = Utf8               (Ljava/util/Comparator;)V
   #99 = Class              #100          // java/lang/StringBuilder
  #100 = Utf8               java/lang/StringBuilder
  #101 = Methodref          #99.#3        // java/lang/StringBuilder."<init>":()V
  #102 = Methodref          #103.#104     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #103 = Class              #105          // ext/mods/gameserver/data/xml/ItemData
  #104 = NameAndType        #11:#106      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #105 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #106 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #107 = Methodref          #103.#108     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #108 = NameAndType        #15:#109      // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #109 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #110 = Class              #111          // ext/mods/gameserver/handler/bypasshandlers/DropListUI
  #111 = Utf8               ext/mods/gameserver/handler/bypasshandlers/DropListUI
  #112 = Methodref          #68.#113      // ext/mods/gameserver/model/item/DropData.getCategoryType:()Lext/mods/gameserver/enums/DropType;
  #113 = NameAndType        #114:#58      // getCategoryType:()Lext/mods/gameserver/enums/DropType;
  #114 = Utf8               getCategoryType
  #115 = Fieldref           #60.#116      // ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
  #116 = NameAndType        #117:#64      // SPOIL:Lext/mods/gameserver/enums/DropType;
  #117 = Utf8               SPOIL
  #118 = String             #119          // RaidBoss
  #119 = Utf8               RaidBoss
  #120 = Methodref          #18.#121      // ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
  #121 = NameAndType        #122:#123     // isType:(Ljava/lang/String;)Z
  #122 = Utf8               isType
  #123 = Utf8               (Ljava/lang/String;)Z
  #124 = String             #125          // GrandBoss
  #125 = Utf8               GrandBoss
  #126 = Methodref          #32.#127      // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #127 = NameAndType        #128:#129     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #128 = Utf8               getTarget
  #129 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #130 = Class              #131          // ext/mods/gameserver/model/actor/Npc
  #131 = Utf8               ext/mods/gameserver/model/actor/Npc
  #132 = Methodref          #130.#133     // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
  #133 = NameAndType        #134:#78      // getNpcId:()I
  #134 = Utf8               getNpcId
  #135 = String             #136          // You must target the correct NPC to view its drop list.
  #136 = Utf8               You must target the correct NPC to view its drop list.
  #137 = Methodref          #138.#139     // ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
  #138 = Class              #140          // ext/mods/gameserver/data/DropCalc
  #139 = NameAndType        #11:#141      // getInstance:()Lext/mods/gameserver/data/DropCalc;
  #140 = Utf8               ext/mods/gameserver/data/DropCalc
  #141 = Utf8               ()Lext/mods/gameserver/data/DropCalc;
  #142 = Methodref          #138.#143     // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #143 = NameAndType        #144:#145     // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #144 = Utf8               calcDropChance
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #146 = Double             0.01d
  #148 = Double             99.999d
  #150 = Methodref          #151.#152     // java/lang/Math.min:(DD)D
  #151 = Class              #153          // java/lang/Math
  #152 = NameAndType        #154:#155     // min:(DD)D
  #153 = Utf8               java/lang/Math
  #154 = Utf8               min
  #155 = Utf8               (DD)D
  #156 = Fieldref           #110.#157     // ext/mods/gameserver/handler/bypasshandlers/DropListUI.PERCENT:Ljava/text/DecimalFormat;
  #157 = NameAndType        #158:#159     // PERCENT:Ljava/text/DecimalFormat;
  #158 = Utf8               PERCENT
  #159 = Utf8               Ljava/text/DecimalFormat;
  #160 = Methodref          #161.#162     // java/text/DecimalFormat.format:(D)Ljava/lang/String;
  #161 = Class              #163          // java/text/DecimalFormat
  #162 = NameAndType        #164:#165     // format:(D)Ljava/lang/String;
  #163 = Utf8               java/text/DecimalFormat
  #164 = Utf8               format
  #165 = Utf8               (D)Ljava/lang/String;
  #166 = Methodref          #167.#168     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #167 = Class              #169          // ext/mods/gameserver/model/item/kind/Item
  #168 = NameAndType        #170:#171     // getName:()Ljava/lang/String;
  #169 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #170 = Utf8               getName
  #171 = Utf8               ()Ljava/lang/String;
  #172 = String             #173          // Recipe:
  #173 = Utf8               Recipe:
  #174 = Methodref          #175.#176     // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #175 = Class              #177          // java/lang/String
  #176 = NameAndType        #178:#123     // startsWith:(Ljava/lang/String;)Z
  #177 = Utf8               java/lang/String
  #178 = Utf8               startsWith
  #179 = Methodref          #175.#180     // java/lang/String.substring:(I)Ljava/lang/String;
  #180 = NameAndType        #181:#182     // substring:(I)Ljava/lang/String;
  #181 = Utf8               substring
  #182 = Utf8               (I)Ljava/lang/String;
  #183 = InvokeDynamic      #1:#184       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #184 = NameAndType        #185:#186     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #185 = Utf8               makeConcatWithConstants
  #186 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #187 = Methodref          #175.#188     // java/lang/String.length:()I
  #188 = NameAndType        #189:#78      // length:()I
  #189 = Utf8               length
  #190 = Methodref          #175.#191     // java/lang/String.substring:(II)Ljava/lang/String;
  #191 = NameAndType        #181:#192     // substring:(II)Ljava/lang/String;
  #192 = Utf8               (II)Ljava/lang/String;
  #193 = InvokeDynamic      #2:#184       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #194 = Methodref          #195.#196     // ext/mods/gameserver/data/manager/DropSkipManager.getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
  #195 = Class              #197          // ext/mods/gameserver/data/manager/DropSkipManager
  #196 = NameAndType        #11:#198      // getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
  #197 = Utf8               ext/mods/gameserver/data/manager/DropSkipManager
  #198 = Utf8               ()Lext/mods/gameserver/data/manager/DropSkipManager;
  #199 = Methodref          #32.#200      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #200 = NameAndType        #201:#78      // getObjectId:()I
  #201 = Utf8               getObjectId
  #202 = Methodref          #195.#203     // ext/mods/gameserver/data/manager/DropSkipManager.isSkipped:(II)Z
  #203 = NameAndType        #81:#204      // isSkipped:(II)Z
  #204 = Utf8               (II)Z
  #205 = String             #206          // SKIP
  #206 = Utf8               SKIP
  #207 = String             #208          // RECEIVE
  #208 = Utf8               RECEIVE
  #209 = Methodref          #167.#210     // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #210 = NameAndType        #211:#171     // getIcon:()Ljava/lang/String;
  #211 = Utf8               getIcon
  #212 = String             #213          // icon.noimage
  #213 = Utf8               icon.noimage
  #214 = String             #215          // <table width=280 bgcolor=000000><tr>
  #215 = Utf8               <table width=280 bgcolor=000000><tr>
  #216 = Methodref          #99.#217      // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #217 = NameAndType        #218:#219     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #218 = Utf8               append
  #219 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #220 = String             #221          // <td width=44 height=41 align=center>
  #221 = Utf8               <td width=44 height=41 align=center>
  #222 = String             #223          // FF00FF
  #223 = Utf8               FF00FF
  #224 = String             #225          // FFFFFF
  #225 = Utf8               FFFFFF
  #226 = InvokeDynamic      #3:#184       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #227 = InvokeDynamic      #4:#228       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #228 = NameAndType        #185:#229     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #229 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #230 = String             #231          // </td></tr></table></td>
  #231 = Utf8               </td></tr></table></td>
  #232 = String             #233          // <td width=240>
  #233 = Utf8               <td width=240>
  #234 = InvokeDynamic      #5:#184       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #235 = String             #236          // Spoil
  #236 = Utf8               Spoil
  #237 = String             #238          // Drop
  #238 = Utf8               Drop
  #239 = InvokeDynamic      #6:#228       // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #240 = String             #241          // </td>
  #241 = Utf8               </td>
  #242 = String             #243          // <td width=20>
  #243 = Utf8               <td width=20>
  #244 = InvokeDynamic      #7:#245       // #7:makeConcatWithConstants:(Ljava/lang/String;III)Ljava/lang/String;
  #245 = NameAndType        #185:#246     // makeConcatWithConstants:(Ljava/lang/String;III)Ljava/lang/String;
  #246 = Utf8               (Ljava/lang/String;III)Ljava/lang/String;
  #247 = String             #248          // </td></tr></table><img src=L2UI.SquareGray width=280 height=1>
  #248 = Utf8               </td></tr></table><img src=L2UI.SquareGray width=280 height=1>
  #249 = String             #250          // <img height=
  #250 = Utf8               <img height=
  #251 = Methodref          #99.#252      // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #252 = NameAndType        #218:#253     // append:(I)Ljava/lang/StringBuilder;
  #253 = Utf8               (I)Ljava/lang/StringBuilder;
  #254 = String             #255          // >
  #255 = Utf8               >
  #256 = String             #257          // <img height=8><img src=L2UI.SquareGray width=280 height=1>
  #257 = Utf8               <img height=8><img src=L2UI.SquareGray width=280 height=1>
  #258 = String             #259          // <td align=center width=70>
  #259 = Utf8               <td align=center width=70>
  #260 = InvokeDynamic      #8:#261       // #8:makeConcatWithConstants:(II)Ljava/lang/String;
  #261 = NameAndType        #185:#192     // makeConcatWithConstants:(II)Ljava/lang/String;
  #262 = String             #263          // </td><td align=center width=140>Page
  #263 = Utf8               </td><td align=center width=140>Page
  #264 = String             #265          // </td><td align=center width=70>
  #265 = Utf8               </td><td align=center width=70>
  #266 = InvokeDynamic      #9:#261       // #9:makeConcatWithConstants:(II)Ljava/lang/String;
  #267 = Class              #268          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #268 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #269 = Methodref          #267.#270     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #270 = NameAndType        #5:#271       // "<init>":(I)V
  #271 = Utf8               (I)V
  #272 = Methodref          #18.#168      // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #273 = Methodref          #175.#274     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #274 = NameAndType        #275:#276     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #275 = Utf8               valueOf
  #276 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #277 = InvokeDynamic      #10:#228      // #10:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #278 = Methodref          #267.#279     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #279 = NameAndType        #280:#36      // setHtml:(Ljava/lang/String;)V
  #280 = Utf8               setHtml
  #281 = Methodref          #32.#282      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #282 = NameAndType        #283:#284     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #283 = Utf8               sendPacket
  #284 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #285 = String             #286          // ##.##
  #286 = Utf8               ##.##
  #287 = Methodref          #161.#288     // java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
  #288 = NameAndType        #5:#36        // "<init>":(Ljava/lang/String;)V
  #289 = Utf8               ITEMS_PER_LIST
  #290 = Utf8               I
  #291 = Utf8               ConstantValue
  #292 = Integer            7
  #293 = Utf8               checkon
  #294 = Utf8               Ljava/lang/String;
  #295 = Utf8               checkoff
  #296 = Utf8               Code
  #297 = Utf8               LineNumberTable
  #298 = Utf8               LocalVariableTable
  #299 = Utf8               this
  #300 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/DropListUI;
  #301 = Utf8               sendNpcDrop
  #302 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #303 = Utf8               drop
  #304 = Utf8               Lext/mods/gameserver/model/item/DropData;
  #305 = Utf8               category
  #306 = Utf8               Lext/mods/gameserver/model/item/DropCategory;
  #307 = Utf8               itemId
  #308 = Utf8               item
  #309 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #310 = Utf8               isSweep
  #311 = Utf8               Z
  #312 = Utf8               npcTemplate
  #313 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #314 = Utf8               isRaid
  #315 = Utf8               isGrand
  #316 = Utf8               npc
  #317 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #318 = Utf8               chance
  #319 = Utf8               D
  #320 = Utf8               safeChance
  #321 = Utf8               normChance
  #322 = Utf8               percent
  #323 = Utf8               itemName
  #324 = Utf8               skipped
  #325 = Utf8               STATUS
  #326 = Utf8               icon
  #327 = Utf8               player
  #328 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #329 = Utf8               npcId
  #330 = Utf8               page
  #331 = Utf8               template
  #332 = Utf8               dropList
  #333 = Utf8               Ljava/util/List;
  #334 = Utf8               sb
  #335 = Utf8               Ljava/lang/StringBuilder;
  #336 = Utf8               pageIndex
  #337 = Utf8               i
  #338 = Utf8               shown
  #339 = Utf8               hasMore
  #340 = Utf8               html
  #341 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #342 = Utf8               LocalVariableTypeTable
  #343 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/DropData;>;
  #344 = Utf8               StackMapTable
  #345 = Utf8               lambda$sendNpcDrop$0
  #346 = Utf8               (Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/item/DropData;)I
  #347 = Utf8               a
  #348 = Utf8               b
  #349 = Utf8               <clinit>
  #350 = Utf8               SourceFile
  #351 = Utf8               DropListUI.java
  #352 = Utf8               BootstrapMethods
  #353 = MethodType         #354          //  (Ljava/lang/Object;Ljava/lang/Object;)I
  #354 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #355 = MethodHandle       6:#356        // REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/DropListUI.lambda$sendNpcDrop$0:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/item/DropData;)I
  #356 = Methodref          #110.#357     // ext/mods/gameserver/handler/bypasshandlers/DropListUI.lambda$sendNpcDrop$0:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/item/DropData;)I
  #357 = NameAndType        #345:#346     // lambda$sendNpcDrop$0:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/item/DropData;)I
  #358 = MethodType         #346          //  (Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/item/DropData;)I
  #359 = String             #360          // R: \u0001
  #360 = Utf8               R: \u0001
  #361 = String             #362          // \u0001...
  #362 = Utf8               \u0001...
  #363 = String             #364          // <table bgcolor=\u0001 cellpadding=6 cellspacing=\"-5\"><tr><td>
  #364 = Utf8               <table bgcolor=\u0001 cellpadding=6 cellspacing=\"-5\"><tr><td>
  #365 = String             #366          // <button width=32 height=32 back=\u0001 fore=\u0001>
  #366 = Utf8               <button width=32 height=32 back=\u0001 fore=\u0001>
  #367 = String             #368          // <font color=ff00ff>\u0001</font>
  #368 = Utf8               <font color=ff00ff>\u0001</font>
  #369 = String             #370          // <br1><font color=B09878>\u0001 Chance : \u0001%</font>
  #370 = Utf8               <br1><font color=B09878>\u0001 Chance : \u0001%</font>
  #371 = String             #372          // <button value=\u0001 action=\"bypass -h droplist \u0001 \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  #372 = Utf8               <button value=\u0001 action=\"bypass -h droplist \u0001 \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  #373 = String             #374          // <button value=\"< PREV\" action=\"bypass -h droplist \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  #374 = Utf8               <button value=\"< PREV\" action=\"bypass -h droplist \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  #375 = String             #376          // <button value=\"NEXT >\" action=\"bypass -h droplist \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  #376 = Utf8               <button value=\"NEXT >\" action=\"bypass -h droplist \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  #377 = String             #378          // <html><title>Droplist : \u0001</title><body><img height=14><font color=B09878>* NOTE : Uncheck to ignore specific drop.</font><img src=L2UI.SquareGray width=280 height=1>\u0001</body></html>
  #378 = Utf8               <html><title>Droplist : \u0001</title><body><img height=14><font color=B09878>* NOTE : Uncheck to ignore specific drop.</font><img src=L2UI.SquareGray width=280 height=1>\u0001</body></html>
  #379 = MethodHandle       6:#380        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #380 = Methodref          #381.#382     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #381 = Class              #383          // java/lang/invoke/LambdaMetafactory
  #382 = NameAndType        #384:#385     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #383 = Utf8               java/lang/invoke/LambdaMetafactory
  #384 = Utf8               metafactory
  #385 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #386 = MethodHandle       6:#387        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #387 = Methodref          #388.#389     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #388 = Class              #390          // java/lang/invoke/StringConcatFactory
  #389 = NameAndType        #185:#391     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #390 = Utf8               java/lang/invoke/StringConcatFactory
  #391 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #392 = Utf8               InnerClasses
  #393 = Class              #394          // java/lang/invoke/MethodHandles$Lookup
  #394 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #395 = Class              #396          // java/lang/invoke/MethodHandles
  #396 = Utf8               java/lang/invoke/MethodHandles
  #397 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.bypasshandlers.DropListUI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/DropListUI;

  public static void sendNpcDrop(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=30, args_size=3
         0: invokestatic  #7                  // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
         3: iload_1
         4: invokevirtual #13                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
         7: astore_3
         8: aload_3
         9: ifnonnull     13
        12: return
        13: aload_3
        14: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getDropData:()Ljava/util/List;
        17: invokeinterface #23,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        22: ifeq          32
        25: aload_0
        26: ldc           #29                 // String This target has no drop information.
        28: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        31: return
        32: new           #37                 // class java/util/ArrayList
        35: dup
        36: invokespecial #39                 // Method java/util/ArrayList."<init>":()V
        39: astore        4
        41: aload_3
        42: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getDropData:()Ljava/util/List;
        45: invokeinterface #40,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        50: astore        5
        52: aload         5
        54: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        59: ifeq          165
        62: aload         5
        64: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        69: checkcast     #53                 // class ext/mods/gameserver/model/item/DropCategory
        72: astore        6
        74: aload         6
        76: invokevirtual #55                 // Method ext/mods/gameserver/model/item/DropCategory.getDropType:()Lext/mods/gameserver/enums/DropType;
        79: getstatic     #59                 // Field ext/mods/gameserver/enums/DropType.HERB:Lext/mods/gameserver/enums/DropType;
        82: if_acmpne     88
        85: goto          52
        88: aload         6
        90: invokevirtual #65                 // Method ext/mods/gameserver/model/item/DropCategory.getAllDrops:()Ljava/util/List;
        93: invokeinterface #40,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        98: astore        7
       100: aload         7
       102: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       107: ifeq          162
       110: aload         7
       112: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       117: checkcast     #68                 // class ext/mods/gameserver/model/item/DropData
       120: astore        8
       122: invokestatic  #70                 // Method ext/mods/gameserver/data/xml/SkipData.getInstance:()Lext/mods/gameserver/data/xml/SkipData;
       125: aload         8
       127: invokevirtual #75                 // Method ext/mods/gameserver/model/item/DropData.getItemId:()I
       130: invokevirtual #79                 // Method ext/mods/gameserver/data/xml/SkipData.isSkipped:(I)Z
       133: ifeq          139
       136: goto          100
       139: aload         8
       141: aload         6
       143: invokevirtual #55                 // Method ext/mods/gameserver/model/item/DropCategory.getDropType:()Lext/mods/gameserver/enums/DropType;
       146: invokevirtual #83                 // Method ext/mods/gameserver/model/item/DropData.setCategoryType:(Lext/mods/gameserver/enums/DropType;)V
       149: aload         4
       151: aload         8
       153: invokeinterface #87,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       158: pop
       159: goto          100
       162: goto          52
       165: aload         4
       167: invokedynamic #91,  0             // InvokeDynamic #0:compare:()Ljava/util/Comparator;
       172: invokeinterface #95,  2           // InterfaceMethod java/util/List.sort:(Ljava/util/Comparator;)V
       177: new           #99                 // class java/lang/StringBuilder
       180: dup
       181: invokespecial #101                // Method java/lang/StringBuilder."<init>":()V
       184: astore        5
       186: iconst_1
       187: istore        6
       189: iconst_0
       190: istore        7
       192: iconst_0
       193: istore        8
       195: iconst_0
       196: istore        9
       198: aload         4
       200: invokeinterface #40,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       205: astore        10
       207: aload         10
       209: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       214: ifeq          718
       217: aload         10
       219: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       224: checkcast     #68                 // class ext/mods/gameserver/model/item/DropData
       227: astore        11
       229: aload         11
       231: invokevirtual #75                 // Method ext/mods/gameserver/model/item/DropData.getItemId:()I
       234: istore        12
       236: invokestatic  #102                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       239: iload         12
       241: invokevirtual #107                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       244: astore        13
       246: aload         13
       248: ifnonnull     254
       251: goto          207
       254: iload         6
       256: iload_2
       257: if_icmpeq     279
       260: iinc          7, 1
       263: iload         7
       265: bipush        7
       267: if_icmpne     207
       270: iinc          6, 1
       273: iconst_0
       274: istore        7
       276: goto          207
       279: iload         8
       281: bipush        7
       283: if_icmpne     292
       286: iconst_1
       287: istore        9
       289: goto          718
       292: aload         11
       294: invokevirtual #112                // Method ext/mods/gameserver/model/item/DropData.getCategoryType:()Lext/mods/gameserver/enums/DropType;
       297: getstatic     #115                // Field ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
       300: if_acmpne     307
       303: iconst_1
       304: goto          308
       307: iconst_0
       308: istore        14
       310: invokestatic  #7                  // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       313: iload_1
       314: invokevirtual #13                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       317: astore        15
       319: aload         15
       321: ldc           #118                // String RaidBoss
       323: invokevirtual #120                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
       326: istore        16
       328: aload         15
       330: ldc           #124                // String GrandBoss
       332: invokevirtual #120                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
       335: istore        17
       337: aload_0
       338: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
       341: instanceof    #130                // class ext/mods/gameserver/model/actor/Npc
       344: ifeq          357
       347: aload_0
       348: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
       351: checkcast     #130                // class ext/mods/gameserver/model/actor/Npc
       354: goto          358
       357: aconst_null
       358: astore        18
       360: aload         18
       362: ifnull        374
       365: aload         18
       367: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
       370: iload_1
       371: if_icmpeq     381
       374: aload_0
       375: ldc           #135                // String You must target the correct NPC to view its drop list.
       377: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       380: return
       381: invokestatic  #137                // Method ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
       384: aload_0
       385: aload         18
       387: aload         11
       389: aload         11
       391: invokevirtual #112                // Method ext/mods/gameserver/model/item/DropData.getCategoryType:()Lext/mods/gameserver/enums/DropType;
       394: iload         16
       396: iload         17
       398: invokevirtual #142                // Method ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
       401: dstore        19
       403: dload         19
       405: dconst_0
       406: dcmpl
       407: ifle          425
       410: dload         19
       412: ldc2_w        #146                // double 0.01d
       415: dcmpg
       416: ifge          425
       419: ldc2_w        #146                // double 0.01d
       422: goto          427
       425: dload         19
       427: dstore        21
       429: ldc2_w        #148                // double 99.999d
       432: dload         21
       434: invokestatic  #150                // Method java/lang/Math.min:(DD)D
       437: dstore        23
       439: getstatic     #156                // Field PERCENT:Ljava/text/DecimalFormat;
       442: dload         23
       444: invokevirtual #160                // Method java/text/DecimalFormat.format:(D)Ljava/lang/String;
       447: astore        25
       449: aload         13
       451: invokevirtual #166                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
       454: astore        26
       456: aload         26
       458: ldc           #172                // String Recipe:
       460: invokevirtual #174                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       463: ifeq          480
       466: aload         26
       468: bipush        8
       470: invokevirtual #179                // Method java/lang/String.substring:(I)Ljava/lang/String;
       473: invokedynamic #183,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       478: astore        26
       480: aload         26
       482: invokevirtual #187                // Method java/lang/String.length:()I
       485: bipush        40
       487: if_icmplt     505
       490: aload         26
       492: iconst_0
       493: bipush        37
       495: invokevirtual #190                // Method java/lang/String.substring:(II)Ljava/lang/String;
       498: invokedynamic #193,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       503: astore        26
       505: invokestatic  #194                // Method ext/mods/gameserver/data/manager/DropSkipManager.getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
       508: aload_0
       509: invokevirtual #199                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       512: iload         12
       514: invokevirtual #202                // Method ext/mods/gameserver/data/manager/DropSkipManager.isSkipped:(II)Z
       517: istore        27
       519: iload         27
       521: ifeq          529
       524: ldc           #205                // String SKIP
       526: goto          531
       529: ldc           #207                // String RECEIVE
       531: astore        28
       533: aload         13
       535: invokevirtual #209                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       538: ifnull        549
       541: aload         13
       543: invokevirtual #209                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       546: goto          551
       549: ldc           #212                // String icon.noimage
       551: astore        29
       553: aload         5
       555: ldc           #214                // String <table width=280 bgcolor=000000><tr>
       557: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       560: pop
       561: aload         5
       563: ldc           #220                // String <td width=44 height=41 align=center>
       565: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       568: pop
       569: aload         5
       571: iload         14
       573: ifeq          581
       576: ldc           #222                // String FF00FF
       578: goto          583
       581: ldc           #224                // String FFFFFF
       583: invokedynamic #226,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       588: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       591: pop
       592: aload         5
       594: aload         29
       596: aload         29
       598: invokedynamic #227,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       603: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       606: pop
       607: aload         5
       609: ldc           #230                // String </td></tr></table></td>
       611: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       614: pop
       615: aload         5
       617: ldc           #232                // String <td width=240>
       619: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       622: pop
       623: aload         5
       625: iload         14
       627: ifeq          640
       630: aload         26
       632: invokedynamic #234,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       637: goto          642
       640: aload         26
       642: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       645: pop
       646: aload         5
       648: iload         14
       650: ifeq          658
       653: ldc           #235                // String Spoil
       655: goto          660
       658: ldc           #237                // String Drop
       660: aload         25
       662: invokedynamic #239,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       667: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       670: pop
       671: aload         5
       673: ldc           #240                // String </td>
       675: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       678: pop
       679: aload         5
       681: ldc           #242                // String <td width=20>
       683: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       686: pop
       687: aload         5
       689: aload         28
       691: iload_1
       692: iload_2
       693: iload         12
       695: invokedynamic #244,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;III)Ljava/lang/String;
       700: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       703: pop
       704: aload         5
       706: ldc           #247                // String </td></tr></table><img src=L2UI.SquareGray width=280 height=1>
       708: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       711: pop
       712: iinc          8, 1
       715: goto          207
       718: aload         5
       720: ldc           #249                // String <img height=
       722: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       725: sipush        294
       728: iload         8
       730: bipush        42
       732: imul
       733: isub
       734: invokevirtual #251                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       737: ldc           #254                // String >
       739: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       742: pop
       743: aload         5
       745: ldc_w         #256                // String <img height=8><img src=L2UI.SquareGray width=280 height=1>
       748: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       751: pop
       752: aload         5
       754: ldc           #214                // String <table width=280 bgcolor=000000><tr>
       756: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       759: pop
       760: aload         5
       762: ldc_w         #258                // String <td align=center width=70>
       765: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       768: pop
       769: iload_2
       770: iconst_1
       771: if_icmple     789
       774: aload         5
       776: iload_1
       777: iload_2
       778: iconst_1
       779: isub
       780: invokedynamic #260,  0            // InvokeDynamic #8:makeConcatWithConstants:(II)Ljava/lang/String;
       785: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       788: pop
       789: aload         5
       791: ldc_w         #262                // String </td><td align=center width=140>Page
       794: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       797: iload_2
       798: invokevirtual #251                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       801: ldc_w         #264                // String </td><td align=center width=70>
       804: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       807: pop
       808: iload         9
       810: ifeq          828
       813: aload         5
       815: iload_1
       816: iload_2
       817: iconst_1
       818: iadd
       819: invokedynamic #266,  0            // InvokeDynamic #9:makeConcatWithConstants:(II)Ljava/lang/String;
       824: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       827: pop
       828: aload         5
       830: ldc           #247                // String </td></tr></table><img src=L2UI.SquareGray width=280 height=1>
       832: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       835: pop
       836: new           #267                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       839: dup
       840: sipush        200
       843: invokespecial #269                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       846: astore        10
       848: aload         10
       850: aload_3
       851: invokevirtual #272                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
       854: aload         5
       856: invokestatic  #273                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       859: invokedynamic #277,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       864: invokevirtual #278                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       867: aload_0
       868: aload         10
       870: invokevirtual #281                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       873: return
      LineNumberTable:
        line 48: 0
        line 49: 8
        line 50: 12
        line 52: 13
        line 54: 25
        line 55: 31
        line 58: 32
        line 59: 41
        line 61: 74
        line 62: 85
        line 64: 88
        line 67: 122
        line 68: 136
        line 71: 139
        line 72: 149
        line 73: 159
        line 74: 162
        line 76: 165
        line 85: 177
        line 86: 186
        line 87: 195
        line 89: 198
        line 91: 229
        line 92: 236
        line 93: 246
        line 94: 251
        line 96: 254
        line 98: 260
        line 99: 263
        line 101: 270
        line 102: 273
        line 107: 279
        line 109: 286
        line 110: 289
        line 113: 292
        line 115: 310
        line 116: 319
        line 117: 328
        line 119: 337
        line 121: 360
        line 123: 374
        line 124: 380
        line 127: 381
        line 128: 403
        line 129: 429
        line 130: 439
        line 133: 449
        line 134: 456
        line 135: 466
        line 136: 480
        line 137: 490
        line 139: 505
        line 141: 519
        line 143: 533
        line 145: 553
        line 146: 561
        line 147: 569
        line 148: 592
        line 149: 607
        line 151: 615
        line 152: 623
        line 153: 646
        line 154: 671
        line 156: 679
        line 157: 687
        line 158: 704
        line 159: 712
        line 161: 715
        line 163: 718
        line 164: 743
        line 166: 752
        line 167: 760
        line 168: 769
        line 169: 774
        line 170: 789
        line 171: 808
        line 172: 813
        line 173: 828
        line 175: 836
        line 176: 848
        line 177: 867
        line 178: 873
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          122      37     8  drop   Lext/mods/gameserver/model/item/DropData;
           74      88     6 category   Lext/mods/gameserver/model/item/DropCategory;
          236     479    12 itemId   I
          246     469    13  item   Lext/mods/gameserver/model/item/kind/Item;
          310     405    14 isSweep   Z
          319     396    15 npcTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
          328     387    16 isRaid   Z
          337     378    17 isGrand   Z
          360     355    18   npc   Lext/mods/gameserver/model/actor/Npc;
          403     312    19 chance   D
          429     286    21 safeChance   D
          439     276    23 normChance   D
          449     266    25 percent   Ljava/lang/String;
          456     259    26 itemName   Ljava/lang/String;
          519     196    27 skipped   Z
          533     182    28 STATUS   Ljava/lang/String;
          553     162    29  icon   Ljava/lang/String;
          229     486    11  drop   Lext/mods/gameserver/model/item/DropData;
            0     874     0 player   Lext/mods/gameserver/model/actor/Player;
            0     874     1 npcId   I
            0     874     2  page   I
            8     866     3 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
           41     833     4 dropList   Ljava/util/List;
          186     688     5    sb   Ljava/lang/StringBuilder;
          189     685     6 pageIndex   I
          192     682     7     i   I
          195     679     8 shown   I
          198     676     9 hasMore   Z
          848      26    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           41     833     4 dropList   Ljava/util/List<Lext/mods/gameserver/model/item/DropData;>;
      StackMapTable: number_of_entries = 35
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 18 /* same */
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/item/DropCategory ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/item/DropData ]
        frame_type = 248 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/List, class java/lang/StringBuilder, int, int, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/item/DropData, int, class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 24 /* same */
        frame_type = 12 /* same */
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/List, class java/lang/StringBuilder, int, int, int, int, class java/util/Iterator, class ext/mods/gameserver/model/item/DropData, int, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, int, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ double ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/List, class java/lang/StringBuilder, int, int, int, int, class java/util/Iterator, class ext/mods/gameserver/model/item/DropData, int, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, int, int, class ext/mods/gameserver/model/actor/Npc, double, double, double, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/List, class java/lang/StringBuilder, int, int, int, int, class java/util/Iterator, class ext/mods/gameserver/model/item/DropData, int, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, int, int, class ext/mods/gameserver/model/actor/Npc, double, double, double, class java/lang/String, class java/lang/String, int, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/List, class java/lang/StringBuilder, int, int, int, int, class java/util/Iterator, class ext/mods/gameserver/model/item/DropData, int, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, int, int, class ext/mods/gameserver/model/actor/Npc, double, double, double, class java/lang/String, class java/lang/String, int, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/StringBuilder, class java/lang/String ]
        frame_type = 120 /* same_locals_1_stack_item */
          stack = [ class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/List, class java/lang/StringBuilder, int, int, int, int, class java/util/Iterator, class ext/mods/gameserver/model/item/DropData, int, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, int, int, class ext/mods/gameserver/model/actor/Npc, double, double, double, class java/lang/String, class java/lang/String, int, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/StringBuilder, class java/lang/String ]
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/List, class java/lang/StringBuilder, int, int, int, int, class java/util/Iterator, class ext/mods/gameserver/model/item/DropData, int, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, int, int, class ext/mods/gameserver/model/actor/Npc, double, double, double, class java/lang/String, class java/lang/String, int, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/StringBuilder, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/List, class java/lang/StringBuilder, int, int, int, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 38 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #161                // class java/text/DecimalFormat
         3: dup
         4: ldc_w         #285                // String ##.##
         7: invokespecial #287                // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        10: putstatic     #156                // Field PERCENT:Ljava/text/DecimalFormat;
        13: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "DropListUI.java"
BootstrapMethods:
  0: #379 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353 (Ljava/lang/Object;Ljava/lang/Object;)I
      #355 REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/DropListUI.lambda$sendNpcDrop$0:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/item/DropData;)I
      #358 (Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/item/DropData;)I
  1: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #359 R: \u0001
  2: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #361 \u0001...
  3: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #363 <table bgcolor=\u0001 cellpadding=6 cellspacing=\"-5\"><tr><td>
  4: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #365 <button width=32 height=32 back=\u0001 fore=\u0001>
  5: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #367 <font color=ff00ff>\u0001</font>
  6: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #369 <br1><font color=B09878>\u0001 Chance : \u0001%</font>
  7: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #371 <button value=\u0001 action=\"bypass -h droplist \u0001 \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  8: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #373 <button value=\"< PREV\" action=\"bypass -h droplist \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  9: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #375 <button value=\"NEXT >\" action=\"bypass -h droplist \u0001 \u0001\" width=65 height=19 back=L2UI_ch3.smallbutton2_over fore=L2UI_ch3.smallbutton2>
  10: #386 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #377 <html><title>Droplist : \u0001</title><body><img height=14><font color=B09878>* NOTE : Uncheck to ignore specific drop.</font><img src=L2UI.SquareGray width=280 height=1>\u0001</body></html>
InnerClasses:
  public static final #397= #393 of #395; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
