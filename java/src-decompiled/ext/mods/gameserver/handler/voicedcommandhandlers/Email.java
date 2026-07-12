// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Email
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Email.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Email.class
  Last modified 9 de jul de 2026; size 11143 bytes
  MD5 checksum 65f23ea28f0154b0f5cc71f2fd1b1a5f
  Compiled from "Email.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Email implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #166                        // ext/mods/gameserver/handler/voicedcommandhandlers/Email
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // email
    #8 = Utf8               email
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Class              #16           // ext/mods/util/Tokenizer
   #16 = Utf8               ext/mods/util/Tokenizer
   #17 = Methodref          #15.#18       // ext/mods/util/Tokenizer."<init>":(Ljava/lang/String;)V
   #18 = NameAndType        #5:#19        // "<init>":(Ljava/lang/String;)V
   #19 = Utf8               (Ljava/lang/String;)V
   #20 = Methodref          #15.#21       // ext/mods/util/Tokenizer.getToken:(I)Ljava/lang/String;
   #21 = NameAndType        #22:#23       // getToken:(I)Ljava/lang/String;
   #22 = Utf8               getToken
   #23 = Utf8               (I)Ljava/lang/String;
   #24 = Methodref          #15.#25       // ext/mods/util/Tokenizer.countTokens:()I
   #25 = NameAndType        #26:#27       // countTokens:()I
   #26 = Utf8               countTokens
   #27 = Utf8               ()I
   #28 = String             #29           // set_duration
   #29 = Utf8               set_duration
   #30 = Methodref          #10.#31       // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #31 = NameAndType        #32:#33       // contains:(Ljava/lang/CharSequence;)Z
   #32 = Utf8               contains
   #33 = Utf8               (Ljava/lang/CharSequence;)Z
   #34 = String             #35           // voiced_email
   #35 = Utf8               voiced_email
   #36 = String             #37           // bypass
   #37 = Utf8               bypass
   #38 = String             #39           //  -h
   #39 = Utf8                -h
   #40 = Methodref          #41.#42       // ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
   #41 = Class              #43           // ext/mods/Crypta/PlayerEmailManager
   #42 = NameAndType        #44:#45       // getInstance:()Lext/mods/Crypta/PlayerEmailManager;
   #43 = Utf8               ext/mods/Crypta/PlayerEmailManager
   #44 = Utf8               getInstance
   #45 = Utf8               ()Lext/mods/Crypta/PlayerEmailManager;
   #46 = String             #47           // email_main.htm
   #47 = Utf8               email_main.htm
   #48 = Methodref          #41.#49       // ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #49 = NameAndType        #50:#51       // navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #50 = Utf8               navi
   #51 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #52 = Methodref          #10.#53       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #53 = NameAndType        #54:#55       // toLowerCase:()Ljava/lang/String;
   #54 = Utf8               toLowerCase
   #55 = Utf8               ()Ljava/lang/String;
   #56 = Methodref          #10.#57       // java/lang/String.hashCode:()I
   #57 = NameAndType        #58:#27       // hashCode:()I
   #58 = Utf8               hashCode
   #59 = String             #60           // inbox
   #60 = Utf8               inbox
   #61 = Methodref          #10.#62       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #62 = NameAndType        #63:#64       // equals:(Ljava/lang/Object;)Z
   #63 = Utf8               equals
   #64 = Utf8               (Ljava/lang/Object;)Z
   #65 = String             #66           // claim
   #66 = Utf8               claim
   #67 = String             #68           // htm
   #68 = Utf8               htm
   #69 = String             #70           // target
   #70 = Utf8               target
   #71 = String             #72           // clean
   #72 = Utf8               clean
   #73 = String             #74           // select_items
   #74 = Utf8               select_items
   #75 = String             #76           // search
   #76 = Utf8               search
   #77 = String             #78           // finalize_item
   #78 = Utf8               finalize_item
   #79 = String             #80           // confirm_select_item
   #80 = Utf8               confirm_select_item
   #81 = String             #82           // send
   #82 = Utf8               send
   #83 = String             #84           // clear_all_items
   #84 = Utf8               clear_all_items
   #85 = String             #86           // remove_selected_item
   #86 = Utf8               remove_selected_item
   #87 = String             #88           // close
   #88 = Utf8               close
   #89 = Methodref          #41.#90       // ext/mods/Crypta/PlayerEmailManager.showInbox:(Lext/mods/gameserver/model/actor/Player;)V
   #90 = NameAndType        #91:#92       // showInbox:(Lext/mods/gameserver/model/actor/Player;)V
   #91 = Utf8               showInbox
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #93 = Methodref          #15.#94       // ext/mods/util/Tokenizer.getAsInteger:(II)I
   #94 = NameAndType        #95:#96       // getAsInteger:(II)I
   #95 = Utf8               getAsInteger
   #96 = Utf8               (II)I
   #97 = Methodref          #98.#99       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #98 = Class              #100          // ext/mods/gameserver/model/actor/Player
   #99 = NameAndType        #101:#27      // getObjectId:()I
  #100 = Utf8               ext/mods/gameserver/model/actor/Player
  #101 = Utf8               getObjectId
  #102 = Methodref          #103.#104     // ext/mods/email/sql/EmailDAO.claimEmail:(II)V
  #103 = Class              #105          // ext/mods/email/sql/EmailDAO
  #104 = NameAndType        #106:#107     // claimEmail:(II)V
  #105 = Utf8               ext/mods/email/sql/EmailDAO
  #106 = Utf8               claimEmail
  #107 = Utf8               (II)V
  #108 = String             #109          // Email reclamado com sucesso!
  #109 = Utf8               Email reclamado com sucesso!
  #110 = Methodref          #98.#111      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #111 = NameAndType        #112:#19      // sendMessage:(Ljava/lang/String;)V
  #112 = Utf8               sendMessage
  #113 = String             #114          // ID de email inválido.
  #114 = Utf8               ID de email inválido.
  #115 = Methodref          #41.#116      // ext/mods/Crypta/PlayerEmailManager.handlerHtm:(Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
  #116 = NameAndType        #117:#118     // handlerHtm:(Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
  #117 = Utf8               handlerHtm
  #118 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
  #119 = Methodref          #98.#120      // ext/mods/gameserver/model/actor/Player.setSelectedEmailTarget:(Ljava/lang/String;)V
  #120 = NameAndType        #121:#19      // setSelectedEmailTarget:(Ljava/lang/String;)V
  #121 = Utf8               setSelectedEmailTarget
  #122 = Methodref          #98.#123      // ext/mods/gameserver/model/actor/Player.setSelectedEmailDuration:(Ljava/lang/String;)V
  #123 = NameAndType        #124:#19      // setSelectedEmailDuration:(Ljava/lang/String;)V
  #124 = Utf8               setSelectedEmailDuration
  #125 = InvokeDynamic      #0:#126       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #126 = NameAndType        #127:#128     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #127 = Utf8               makeConcatWithConstants
  #128 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #129 = Class              #130          // java/lang/Exception
  #130 = Utf8               java/lang/Exception
  #131 = Methodref          #132.#133     // ext/mods/email/items/EmailItemSelector.showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
  #132 = Class              #134          // ext/mods/email/items/EmailItemSelector
  #133 = NameAndType        #135:#136     // showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
  #134 = Utf8               ext/mods/email/items/EmailItemSelector
  #135 = Utf8               showAvailableItems
  #136 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #137 = String             #138          // Parâmetros incompletos.
  #138 = Utf8               Parâmetros incompletos.
  #139 = Methodref          #41.#140      // ext/mods/Crypta/PlayerEmailManager.searchPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #140 = NameAndType        #141:#51      // searchPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #141 = Utf8               searchPlayer
  #142 = Methodref          #15.#143      // ext/mods/util/Tokenizer.getAsLong:(IJ)J
  #143 = NameAndType        #144:#145     // getAsLong:(IJ)J
  #144 = Utf8               getAsLong
  #145 = Utf8               (IJ)J
  #146 = Methodref          #98.#147      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #147 = NameAndType        #148:#149     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #148 = Utf8               getInventory
  #149 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #150 = Methodref          #151.#152     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #151 = Class              #153          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #152 = NameAndType        #154:#155     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #153 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #154 = Utf8               getItemByObjectId
  #155 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #156 = Methodref          #157.#158     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #157 = Class              #159          // ext/mods/gameserver/model/item/instance/ItemInstance
  #158 = NameAndType        #160:#27      // getCount:()I
  #159 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #160 = Utf8               getCount
  #161 = String             #162          // Quantidade inválida.
  #162 = Utf8               Quantidade inválida.
  #163 = InvokeDynamic      #1:#164       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #164 = NameAndType        #127:#23      // makeConcatWithConstants:(I)Ljava/lang/String;
  #165 = Methodref          #166.#167     // ext/mods/gameserver/handler/voicedcommandhandlers/Email.useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
  #166 = Class              #168          // ext/mods/gameserver/handler/voicedcommandhandlers/Email
  #167 = NameAndType        #169:#170     // useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
  #168 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Email
  #169 = Utf8               useVoicedCommand
  #170 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
  #171 = Methodref          #157.#172     // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
  #172 = NameAndType        #173:#55      // getName:()Ljava/lang/String;
  #173 = Utf8               getName
  #174 = InvokeDynamic      #2:#175       // #2:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
  #175 = NameAndType        #127:#176     // makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
  #176 = Utf8               (JLjava/lang/String;)Ljava/lang/String;
  #177 = Methodref          #98.#178      // ext/mods/gameserver/model/actor/Player.addTempSelectedItem:(IJ)V
  #178 = NameAndType        #179:#180     // addTempSelectedItem:(IJ)V
  #179 = Utf8               addTempSelectedItem
  #180 = Utf8               (IJ)V
  #181 = Methodref          #157.#182     // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #182 = NameAndType        #183:#184     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #183 = Utf8               getItem
  #184 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #185 = Methodref          #186.#187     // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #186 = Class              #188          // ext/mods/gameserver/model/item/kind/Item
  #187 = NameAndType        #189:#55      // getIcon:()Ljava/lang/String;
  #188 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #189 = Utf8               getIcon
  #190 = Methodref          #10.#191      // java/lang/String.isEmpty:()Z
  #191 = NameAndType        #192:#193     // isEmpty:()Z
  #192 = Utf8               isEmpty
  #193 = Utf8               ()Z
  #194 = String             #195          // icon.noimage
  #195 = Utf8               icon.noimage
  #196 = Class              #197          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #197 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #198 = Methodref          #196.#199     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #199 = NameAndType        #5:#200       // "<init>":(I)V
  #200 = Utf8               (I)V
  #201 = Class              #202          // java/lang/StringBuilder
  #202 = Utf8               java/lang/StringBuilder
  #203 = Methodref          #201.#3       // java/lang/StringBuilder."<init>":()V
  #204 = Methodref          #98.#205      // ext/mods/gameserver/model/actor/Player.getTempSelectedItems:()Ljava/util/Map;
  #205 = NameAndType        #206:#207     // getTempSelectedItems:()Ljava/util/Map;
  #206 = Utf8               getTempSelectedItems
  #207 = Utf8               ()Ljava/util/Map;
  #208 = Methodref          #157.#99      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #209 = Methodref          #210.#211     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #210 = Class              #212          // java/lang/Integer
  #211 = NameAndType        #213:#214     // valueOf:(I)Ljava/lang/Integer;
  #212 = Utf8               java/lang/Integer
  #213 = Utf8               valueOf
  #214 = Utf8               (I)Ljava/lang/Integer;
  #215 = Methodref          #216.#217     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #216 = Class              #218          // java/lang/Long
  #217 = NameAndType        #213:#219     // valueOf:(J)Ljava/lang/Long;
  #218 = Utf8               java/lang/Long
  #219 = Utf8               (J)Ljava/lang/Long;
  #220 = InterfaceMethodref #221.#222     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #221 = Class              #223          // java/util/Map
  #222 = NameAndType        #224:#225     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #223 = Utf8               java/util/Map
  #224 = Utf8               getOrDefault
  #225 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #226 = Methodref          #216.#227     // java/lang/Long.longValue:()J
  #227 = NameAndType        #228:#229     // longValue:()J
  #228 = Utf8               longValue
  #229 = Utf8               ()J
  #230 = String             #231          // <html><title>Email Items</title><body><center>
  #231 = Utf8               <html><title>Email Items</title><body><center>
  #232 = Methodref          #201.#233     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #233 = NameAndType        #234:#235     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #234 = Utf8               append
  #235 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #236 = String             #237          // <table width=300 border=0 bgcolor=000000 cellpadding=5>
  #237 = Utf8               <table width=300 border=0 bgcolor=000000 cellpadding=5>
  #238 = String             #239          // <tr>
  #239 = Utf8               <tr>
  #240 = InvokeDynamic      #3:#126       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #241 = InvokeDynamic      #4:#126       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #242 = InvokeDynamic      #5:#164       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #243 = InvokeDynamic      #6:#244       // #6:makeConcatWithConstants:(J)Ljava/lang/String;
  #244 = NameAndType        #127:#245     // makeConcatWithConstants:(J)Ljava/lang/String;
  #245 = Utf8               (J)Ljava/lang/String;
  #246 = String             #247          // </td>
  #247 = Utf8               </td>
  #248 = String             #249          // </tr>
  #249 = Utf8               </tr>
  #250 = String             #251          // </table>
  #251 = Utf8               </table>
  #252 = Methodref          #157.#253     // ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #253 = NameAndType        #254:#255     // getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #254 = Utf8               getAugmentation
  #255 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
  #256 = Methodref          #257.#258     // ext/mods/gameserver/model/Augmentation.getId:()I
  #257 = Class              #259          // ext/mods/gameserver/model/Augmentation
  #258 = NameAndType        #260:#27      // getId:()I
  #259 = Utf8               ext/mods/gameserver/model/Augmentation
  #260 = Utf8               getId
  #261 = Methodref          #262.#263     // ext/mods/gameserver/data/xml/AugmentationData.getInstance:()Lext/mods/gameserver/data/xml/AugmentationData;
  #262 = Class              #264          // ext/mods/gameserver/data/xml/AugmentationData
  #263 = NameAndType        #44:#265      // getInstance:()Lext/mods/gameserver/data/xml/AugmentationData;
  #264 = Utf8               ext/mods/gameserver/data/xml/AugmentationData
  #265 = Utf8               ()Lext/mods/gameserver/data/xml/AugmentationData;
  #266 = Methodref          #262.#267     // ext/mods/gameserver/data/xml/AugmentationData.getAugStatsById:(I)Ljava/util/List;
  #267 = NameAndType        #268:#269     // getAugStatsById:(I)Ljava/util/List;
  #268 = Utf8               getAugStatsById
  #269 = Utf8               (I)Ljava/util/List;
  #270 = InterfaceMethodref #271.#191     // java/util/List.isEmpty:()Z
  #271 = Class              #272          // java/util/List
  #272 = Utf8               java/util/List
  #273 = String             #274          // <br><table width=280 bgcolor=000000>
  #274 = Utf8               <br><table width=280 bgcolor=000000>
  #275 = String             #276          // <tr><td><font color=LEVEL>Stats do Augment:</font></td></tr>
  #276 = Utf8               <tr><td><font color=LEVEL>Stats do Augment:</font></td></tr>
  #277 = InterfaceMethodref #271.#278     // java/util/List.iterator:()Ljava/util/Iterator;
  #278 = NameAndType        #279:#280     // iterator:()Ljava/util/Iterator;
  #279 = Utf8               iterator
  #280 = Utf8               ()Ljava/util/Iterator;
  #281 = InterfaceMethodref #282.#283     // java/util/Iterator.hasNext:()Z
  #282 = Class              #284          // java/util/Iterator
  #283 = NameAndType        #285:#193     // hasNext:()Z
  #284 = Utf8               java/util/Iterator
  #285 = Utf8               hasNext
  #286 = InterfaceMethodref #282.#287     // java/util/Iterator.next:()Ljava/lang/Object;
  #287 = NameAndType        #288:#289     // next:()Ljava/lang/Object;
  #288 = Utf8               next
  #289 = Utf8               ()Ljava/lang/Object;
  #290 = Class              #291          // ext/mods/gameserver/data/xml/AugmentationData$AugStat
  #291 = Utf8               ext/mods/gameserver/data/xml/AugmentationData$AugStat
  #292 = Methodref          #290.#293     // ext/mods/gameserver/data/xml/AugmentationData$AugStat.getStat:()Lext/mods/gameserver/enums/skills/Stats;
  #293 = NameAndType        #294:#295     // getStat:()Lext/mods/gameserver/enums/skills/Stats;
  #294 = Utf8               getStat
  #295 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
  #296 = Methodref          #297.#172     // ext/mods/gameserver/enums/skills/Stats.getName:()Ljava/lang/String;
  #297 = Class              #298          // ext/mods/gameserver/enums/skills/Stats
  #298 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #299 = Methodref          #290.#300     // ext/mods/gameserver/data/xml/AugmentationData$AugStat.getValue:()F
  #300 = NameAndType        #301:#302     // getValue:()F
  #301 = Utf8               getValue
  #302 = Utf8               ()F
  #303 = InvokeDynamic      #7:#304       // #7:makeConcatWithConstants:(Ljava/lang/String;F)Ljava/lang/String;
  #304 = NameAndType        #127:#305     // makeConcatWithConstants:(Ljava/lang/String;F)Ljava/lang/String;
  #305 = Utf8               (Ljava/lang/String;F)Ljava/lang/String;
  #306 = Methodref          #257.#307     // ext/mods/gameserver/model/Augmentation.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #307 = NameAndType        #308:#309     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #308 = Utf8               getSkill
  #309 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #310 = String             #311          // <tr><td><font color=LEVEL>Skill do Augment:</font></td></tr>
  #311 = Utf8               <tr><td><font color=LEVEL>Skill do Augment:</font></td></tr>
  #312 = Methodref          #313.#172     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #313 = Class              #314          // ext/mods/gameserver/skills/L2Skill
  #314 = Utf8               ext/mods/gameserver/skills/L2Skill
  #315 = String             #316          // Special Ability:
  #316 = Utf8               Special Ability:
  #317 = String             #318          // Special
  #318 = Utf8               Special
  #319 = String             #320          // Item Skill:
  #320 = Utf8               Item Skill:
  #321 = String             #322          //
  #322 = Utf8
  #323 = Methodref          #10.#324      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #324 = NameAndType        #325:#326     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #325 = Utf8               replace
  #326 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #327 = Methodref          #10.#328      // java/lang/String.trim:()Ljava/lang/String;
  #328 = NameAndType        #329:#55      // trim:()Ljava/lang/String;
  #329 = Utf8               trim
  #330 = Methodref          #313.#331     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #331 = NameAndType        #332:#27      // getLevel:()I
  #332 = Utf8               getLevel
  #333 = Methodref          #313.#334     // ext/mods/gameserver/skills/L2Skill.isPassive:()Z
  #334 = NameAndType        #335:#193     // isPassive:()Z
  #335 = Utf8               isPassive
  #336 = String             #337          // Passiva
  #337 = Utf8               Passiva
  #338 = String             #339          // Ativa
  #339 = Utf8               Ativa
  #340 = InvokeDynamic      #8:#341       // #8:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #341 = NameAndType        #127:#342     // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #342 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #343 = String             #344          // <br><table width=300 cellpadding=3><tr>
  #344 = Utf8               <br><table width=300 cellpadding=3><tr>
  #345 = String             #346          // <td><font color=LEVEL>Qtd:</font></td>
  #346 = Utf8               <td><font color=LEVEL>Qtd:</font></td>
  #347 = String             #348          // <td><edit var=\"qtd\" width=85 type=number></td>
  #348 = Utf8               <td><edit var=\"qtd\" width=85 type=number></td>
  #349 = InvokeDynamic      #9:#164       // #9:makeConcatWithConstants:(I)Ljava/lang/String;
  #350 = String             #351          // </tr></table>
  #351 = Utf8               </tr></table>
  #352 = String             #353          // <br><table><tr>
  #353 = Utf8               <br><table><tr>
  #354 = InvokeDynamic      #10:#164      // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #355 = String             #356          // <br><button value=\"Voltar\" action=\"bypass -h voiced_email select_items\" width=55 height=15 back=sek.cbui94 fore=sek.cbui92>
  #356 = Utf8               <br><button value=\"Voltar\" action=\"bypass -h voiced_email select_items\" width=55 height=15 back=sek.cbui94 fore=sek.cbui92>
  #357 = String             #358          // </center></body></html>
  #358 = Utf8               </center></body></html>
  #359 = Methodref          #201.#360     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #360 = NameAndType        #361:#55      // toString:()Ljava/lang/String;
  #361 = Utf8               toString
  #362 = Methodref          #196.#363     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #363 = NameAndType        #364:#19      // setHtml:(Ljava/lang/String;)V
  #364 = Utf8               setHtml
  #365 = Methodref          #98.#366      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #366 = NameAndType        #367:#368     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #367 = Utf8               sendPacket
  #368 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #369 = Methodref          #370.#371     // ext/mods/email/items/EmailItemSender.processSendCommand:(Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
  #370 = Class              #372          // ext/mods/email/items/EmailItemSender
  #371 = NameAndType        #373:#118     // processSendCommand:(Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
  #372 = Utf8               ext/mods/email/items/EmailItemSender
  #373 = Utf8               processSendCommand
  #374 = Methodref          #98.#375      // ext/mods/gameserver/model/actor/Player.clearTempSelectedItems:()V
  #375 = NameAndType        #376:#6       // clearTempSelectedItems:()V
  #376 = Utf8               clearTempSelectedItems
  #377 = String             #378          // Itens selecionados foram limpos.
  #378 = Utf8               Itens selecionados foram limpos.
  #379 = Methodref          #98.#380      // ext/mods/gameserver/model/actor/Player.removeTempSelectedItem:(I)V
  #380 = NameAndType        #381:#200     // removeTempSelectedItem:(I)V
  #381 = Utf8               removeTempSelectedItem
  #382 = String             #383          // Item removido da lista.
  #383 = Utf8               Item removido da lista.
  #384 = String             #385          // ID do item não especificado.
  #385 = Utf8               ID do item não especificado.
  #386 = InvokeDynamic      #11:#126      // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #387 = Fieldref           #166.#388     // ext/mods/gameserver/handler/voicedcommandhandlers/Email.VOICED_COMMANDS:[Ljava/lang/String;
  #388 = NameAndType        #389:#390     // VOICED_COMMANDS:[Ljava/lang/String;
  #389 = Utf8               VOICED_COMMANDS
  #390 = Utf8               [Ljava/lang/String;
  #391 = Class              #392          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #392 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #393 = Utf8               Code
  #394 = Utf8               LineNumberTable
  #395 = Utf8               LocalVariableTable
  #396 = Utf8               this
  #397 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Email;
  #398 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #399 = Utf8               i
  #400 = Utf8               I
  #401 = Utf8               emailId
  #402 = Utf8               targetName
  #403 = Utf8               Ljava/lang/String;
  #404 = Utf8               duration
  #405 = Utf8               page
  #406 = Utf8               searchtargetName
  #407 = Utf8               objectIdFinal
  #408 = Utf8               qtd
  #409 = Utf8               J
  #410 = Utf8               finalItem
  #411 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #412 = Utf8               stat
  #413 = Utf8               Lext/mods/gameserver/data/xml/AugmentationData$AugStat;
  #414 = Utf8               palavra
  #415 = Utf8               name
  #416 = Utf8               ocultarPalavras
  #417 = Utf8               augId
  #418 = Utf8               stats
  #419 = Utf8               Ljava/util/List;
  #420 = Utf8               skill
  #421 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #422 = Utf8               objId
  #423 = Utf8               selectedItem
  #424 = Utf8               icon
  #425 = Utf8               html
  #426 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #427 = Utf8               sb
  #428 = Utf8               Ljava/lang/StringBuilder;
  #429 = Utf8               selectedIds
  #430 = Utf8               Ljava/util/Map;
  #431 = Utf8               selectedAmount
  #432 = Utf8               isSelected
  #433 = Utf8               Z
  #434 = Utf8               objectId
  #435 = Utf8               tokenizer
  #436 = Utf8               Lext/mods/util/Tokenizer;
  #437 = Utf8               param
  #438 = Utf8               command
  #439 = Utf8               player
  #440 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #441 = Utf8               LocalVariableTypeTable
  #442 = Utf8               Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugStat;>;
  #443 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #444 = Utf8               StackMapTable
  #445 = Class              #390          // "[Ljava/lang/String;"
  #446 = Utf8               getVoicedCommandList
  #447 = Utf8               ()[Ljava/lang/String;
  #448 = Utf8               <clinit>
  #449 = Utf8               SourceFile
  #450 = Utf8               Email.java
  #451 = Utf8               BootstrapMethods
  #452 = String             #453          // Tempo de expiração definido para: \u0001
  #453 = Utf8               Tempo de expiração definido para: \u0001
  #454 = String             #455          // email confirm_select_item \u0001
  #455 = Utf8               email confirm_select_item \u0001
  #456 = String             #457          // Selecionado \u0001x \u0001
  #457 = Utf8               Selecionado \u0001x \u0001
  #458 = String             #459          // <td width=40><img src=\"\u0001\" width=32 height=32></td>
  #459 = Utf8               <td width=40><img src=\"\u0001\" width=32 height=32></td>
  #460 = String             #461          // <td width=200><font color=LEVEL>\u0001</font><br1>
  #461 = Utf8               <td width=200><font color=LEVEL>\u0001</font><br1>
  #462 = String             #463          // Quantidade disponível: \u0001<br1>
  #463 = Utf8               Quantidade disponível: \u0001<br1>
  #464 = String             #465          // <font color=\"A9F5F2\">Selecionado: \u0001</font>
  #465 = Utf8               <font color=\"A9F5F2\">Selecionado: \u0001</font>
  #466 = String             #467          // <tr><td><font color=FF9900>\u0001</font>: <font color=LEVEL>+\u0001</font></td></tr>
  #467 = Utf8               <tr><td><font color=FF9900>\u0001</font>: <font color=LEVEL>+\u0001</font></td></tr>
  #468 = String             #469          // <tr><td><font color=00FF99>\u0001</font> (Lv \u0001) - \u0001</td></tr>
  #469 = Utf8               <tr><td><font color=00FF99>\u0001</font> (Lv \u0001) - \u0001</td></tr>
  #470 = String             #471          // <td><button value=\"Confirmar\" action=\"bypass -h voiced_email finalize_item \u0001 $qtd\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #471 = Utf8               <td><button value=\"Confirmar\" action=\"bypass -h voiced_email finalize_item \u0001 $qtd\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #472 = String             #473          // <td><button value=\"Remover\" action=\"bypass -h voiced_email remove_selected_item \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normal\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #473 = Utf8               <td><button value=\"Remover\" action=\"bypass -h voiced_email remove_selected_item \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normal\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #474 = String             #475          // Unknown command: \u0001
  #475 = Utf8               Unknown command: \u0001
  #476 = MethodHandle       6:#477        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #477 = Methodref          #478.#479     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #478 = Class              #480          // java/lang/invoke/StringConcatFactory
  #479 = NameAndType        #127:#481     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #480 = Utf8               java/lang/invoke/StringConcatFactory
  #481 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #482 = Utf8               InnerClasses
  #483 = Utf8               AugStat
  #484 = Class              #485          // java/lang/invoke/MethodHandles$Lookup
  #485 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #486 = Class              #487          // java/lang/invoke/MethodHandles
  #487 = Utf8               java/lang/invoke/MethodHandles
  #488 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.Email();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Email;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=35, args_size=4
         0: aload_1
         1: ldc           #7                  // String email
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          1598
         9: new           #15                 // class ext/mods/util/Tokenizer
        12: dup
        13: aload_1
        14: invokespecial #17                 // Method ext/mods/util/Tokenizer."<init>":(Ljava/lang/String;)V
        17: astore        4
        19: aload         4
        21: iconst_1
        22: invokevirtual #20                 // Method ext/mods/util/Tokenizer.getToken:(I)Ljava/lang/String;
        25: astore        5
        27: iconst_0
        28: istore        6
        30: iload         6
        32: aload         4
        34: invokevirtual #24                 // Method ext/mods/util/Tokenizer.countTokens:()I
        37: if_icmpge     46
        40: iinc          6, 1
        43: goto          30
        46: aload_1
        47: ldc           #28                 // String set_duration
        49: invokevirtual #30                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        52: ifeq          55
        55: aload_1
        56: ldc           #34                 // String voiced_email
        58: invokevirtual #30                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        61: ifeq          64
        64: aload_1
        65: ldc           #36                 // String bypass
        67: invokevirtual #30                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        70: ifeq          73
        73: aload_1
        74: ldc           #38                 // String  -h
        76: invokevirtual #30                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        79: ifeq          82
        82: aload         5
        84: ifnonnull     98
        87: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
        90: aload_2
        91: ldc           #46                 // String email_main.htm
        93: invokevirtual #48                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        96: iconst_1
        97: ireturn
        98: aload         5
       100: invokevirtual #52                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       103: astore        6
       105: iconst_m1
       106: istore        7
       108: aload         6
       110: invokevirtual #56                 // Method java/lang/String.hashCode:()I
       113: lookupswitch  { // 14

             -1963573828: 434

             -1920675139: 332

              -907920748: 366

              -906336856: 349

              -880905839: 284

               -55755728: 417

                  103649: 268

                 3526536: 400

                94742588: 252

                94746185: 316

                94756344: 451

               100344454: 236

               848028023: 383

              1928892625: 300
                 default: 465
            }
       236: aload         6
       238: ldc           #59                 // String inbox
       240: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       243: ifeq          465
       246: iconst_0
       247: istore        7
       249: goto          465
       252: aload         6
       254: ldc           #65                 // String claim
       256: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       259: ifeq          465
       262: iconst_1
       263: istore        7
       265: goto          465
       268: aload         6
       270: ldc           #67                 // String htm
       272: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       275: ifeq          465
       278: iconst_2
       279: istore        7
       281: goto          465
       284: aload         6
       286: ldc           #69                 // String target
       288: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       291: ifeq          465
       294: iconst_3
       295: istore        7
       297: goto          465
       300: aload         6
       302: ldc           #28                 // String set_duration
       304: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       307: ifeq          465
       310: iconst_4
       311: istore        7
       313: goto          465
       316: aload         6
       318: ldc           #71                 // String clean
       320: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       323: ifeq          465
       326: iconst_5
       327: istore        7
       329: goto          465
       332: aload         6
       334: ldc           #73                 // String select_items
       336: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       339: ifeq          465
       342: bipush        6
       344: istore        7
       346: goto          465
       349: aload         6
       351: ldc           #75                 // String search
       353: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       356: ifeq          465
       359: bipush        7
       361: istore        7
       363: goto          465
       366: aload         6
       368: ldc           #77                 // String finalize_item
       370: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       373: ifeq          465
       376: bipush        8
       378: istore        7
       380: goto          465
       383: aload         6
       385: ldc           #79                 // String confirm_select_item
       387: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       390: ifeq          465
       393: bipush        9
       395: istore        7
       397: goto          465
       400: aload         6
       402: ldc           #81                 // String send
       404: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       407: ifeq          465
       410: bipush        10
       412: istore        7
       414: goto          465
       417: aload         6
       419: ldc           #83                 // String clear_all_items
       421: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       424: ifeq          465
       427: bipush        11
       429: istore        7
       431: goto          465
       434: aload         6
       436: ldc           #85                 // String remove_selected_item
       438: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       441: ifeq          465
       444: bipush        12
       446: istore        7
       448: goto          465
       451: aload         6
       453: ldc           #87                 // String close
       455: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       458: ifeq          465
       461: bipush        13
       463: istore        7
       465: iload         7
       467: tableswitch   { // 0 to 13

                       0: 536

                       1: 546

                       2: 594

                       3: 606

                       4: 632

                       5: 669

                       6: 686

                       7: 712

                       8: 754

                       9: 860

                      10: 1498

                      11: 1507

                      12: 1526

                      13: 1575
                 default: 1587
            }
       536: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       539: aload_2
       540: invokevirtual #89                 // Method ext/mods/Crypta/PlayerEmailManager.showInbox:(Lext/mods/gameserver/model/actor/Player;)V
       543: goto          1598
       546: aload         4
       548: iconst_2
       549: iconst_0
       550: invokevirtual #93                 // Method ext/mods/util/Tokenizer.getAsInteger:(II)I
       553: istore        8
       555: iload         8
       557: ifle          585
       560: iload         8
       562: aload_2
       563: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       566: invokestatic  #102                // Method ext/mods/email/sql/EmailDAO.claimEmail:(II)V
       569: aload_2
       570: ldc           #108                // String Email reclamado com sucesso!
       572: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       575: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       578: aload_2
       579: invokevirtual #89                 // Method ext/mods/Crypta/PlayerEmailManager.showInbox:(Lext/mods/gameserver/model/actor/Player;)V
       582: goto          1598
       585: aload_2
       586: ldc           #113                // String ID de email inválido.
       588: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       591: goto          1598
       594: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       597: aload_2
       598: aload         4
       600: invokevirtual #115                // Method ext/mods/Crypta/PlayerEmailManager.handlerHtm:(Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
       603: goto          1598
       606: aload         4
       608: iconst_2
       609: invokevirtual #20                 // Method ext/mods/util/Tokenizer.getToken:(I)Ljava/lang/String;
       612: astore        9
       614: aload_2
       615: aload         9
       617: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.setSelectedEmailTarget:(Ljava/lang/String;)V
       620: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       623: aload_2
       624: ldc           #46                 // String email_main.htm
       626: invokevirtual #48                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       629: goto          1598
       632: aload         4
       634: iconst_2
       635: invokevirtual #20                 // Method ext/mods/util/Tokenizer.getToken:(I)Ljava/lang/String;
       638: astore        10
       640: aload_2
       641: aload         10
       643: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.setSelectedEmailDuration:(Ljava/lang/String;)V
       646: aload_2
       647: aload         10
       649: invokedynamic #125,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       654: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       657: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       660: aload_2
       661: ldc           #46                 // String email_main.htm
       663: invokevirtual #48                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       666: goto          1598
       669: aload_2
       670: aconst_null
       671: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.setSelectedEmailTarget:(Ljava/lang/String;)V
       674: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       677: aload_2
       678: ldc           #46                 // String email_main.htm
       680: invokevirtual #48                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       683: goto          1598
       686: iconst_1
       687: istore        11
       689: aload         4
       691: iconst_2
       692: iconst_0
       693: invokevirtual #93                 // Method ext/mods/util/Tokenizer.getAsInteger:(II)I
       696: istore        11
       698: goto          703
       701: astore        12
       703: aload_2
       704: iload         11
       706: invokestatic  #131                // Method ext/mods/email/items/EmailItemSelector.showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
       709: goto          1598
       712: aload         4
       714: iconst_2
       715: invokevirtual #20                 // Method ext/mods/util/Tokenizer.getToken:(I)Ljava/lang/String;
       718: astore        12
       720: aload         12
       722: ifnonnull     742
       725: aload_2
       726: ldc           #137                // String Parâmetros incompletos.
       728: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       731: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       734: aload_2
       735: ldc           #46                 // String email_main.htm
       737: invokevirtual #48                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       740: iconst_1
       741: ireturn
       742: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       745: aload_2
       746: aload         12
       748: invokevirtual #139                // Method ext/mods/Crypta/PlayerEmailManager.searchPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       751: goto          1598
       754: aload         4
       756: iconst_2
       757: iconst_0
       758: invokevirtual #93                 // Method ext/mods/util/Tokenizer.getAsInteger:(II)I
       761: istore        13
       763: aload         4
       765: iconst_3
       766: lconst_0
       767: invokevirtual #142                // Method ext/mods/util/Tokenizer.getAsLong:(IJ)J
       770: lstore        14
       772: aload_2
       773: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       776: iload         13
       778: invokevirtual #150                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       781: astore        16
       783: aload         16
       785: ifnull        807
       788: lload         14
       790: lconst_1
       791: lcmp
       792: iflt          807
       795: lload         14
       797: aload         16
       799: invokevirtual #156                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       802: i2l
       803: lcmp
       804: ifle          828
       807: aload_2
       808: ldc           #161                // String Quantidade inválida.
       810: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       813: aload_0
       814: iload         13
       816: invokedynamic #163,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       821: aload_2
       822: invokevirtual #165                // Method useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
       825: pop
       826: iconst_1
       827: ireturn
       828: aload_2
       829: lload         14
       831: aload         16
       833: invokevirtual #171                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
       836: invokedynamic #174,  0            // InvokeDynamic #2:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
       841: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       844: aload_2
       845: iload         13
       847: lload         14
       849: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.addTempSelectedItem:(IJ)V
       852: aload_2
       853: iconst_1
       854: invokestatic  #131                // Method ext/mods/email/items/EmailItemSelector.showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
       857: goto          1598
       860: aload         4
       862: iconst_2
       863: iconst_0
       864: invokevirtual #93                 // Method ext/mods/util/Tokenizer.getAsInteger:(II)I
       867: istore        17
       869: aload_2
       870: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       873: iload         17
       875: invokevirtual #150                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       878: astore        18
       880: aload         18
       882: ifnonnull     887
       885: iconst_1
       886: ireturn
       887: aload         18
       889: invokevirtual #181                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       892: invokevirtual #185                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       895: astore        19
       897: aload         19
       899: ifnull        910
       902: aload         19
       904: invokevirtual #190                // Method java/lang/String.isEmpty:()Z
       907: ifeq          914
       910: ldc           #194                // String icon.noimage
       912: astore        19
       914: new           #196                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       917: dup
       918: iconst_0
       919: invokespecial #198                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       922: astore        20
       924: new           #201                // class java/lang/StringBuilder
       927: dup
       928: invokespecial #203                // Method java/lang/StringBuilder."<init>":()V
       931: astore        21
       933: aload_2
       934: invokevirtual #204                // Method ext/mods/gameserver/model/actor/Player.getTempSelectedItems:()Ljava/util/Map;
       937: astore        22
       939: aload         22
       941: aload         18
       943: invokevirtual #208                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       946: invokestatic  #209                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       949: lconst_0
       950: invokestatic  #215                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       953: invokeinterface #220,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       958: checkcast     #216                // class java/lang/Long
       961: invokevirtual #226                // Method java/lang/Long.longValue:()J
       964: lstore        23
       966: lload         23
       968: lconst_0
       969: lcmp
       970: ifle          977
       973: iconst_1
       974: goto          978
       977: iconst_0
       978: istore        25
       980: aload         21
       982: ldc           #230                // String <html><title>Email Items</title><body><center>
       984: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       987: pop
       988: aload         21
       990: ldc           #236                // String <table width=300 border=0 bgcolor=000000 cellpadding=5>
       992: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       995: pop
       996: aload         21
       998: ldc           #238                // String <tr>
      1000: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1003: pop
      1004: aload         21
      1006: aload         19
      1008: invokedynamic #240,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1013: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1016: pop
      1017: aload         21
      1019: aload         18
      1021: invokevirtual #171                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
      1024: invokedynamic #241,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1029: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1032: pop
      1033: aload         21
      1035: aload         18
      1037: invokevirtual #156                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
      1040: invokedynamic #242,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
      1045: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1048: pop
      1049: iload         25
      1051: ifeq          1067
      1054: aload         21
      1056: lload         23
      1058: invokedynamic #243,  0            // InvokeDynamic #6:makeConcatWithConstants:(J)Ljava/lang/String;
      1063: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1066: pop
      1067: aload         21
      1069: ldc           #246                // String </td>
      1071: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1074: pop
      1075: aload         21
      1077: ldc           #248                // String </tr>
      1079: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1082: pop
      1083: aload         21
      1085: ldc           #250                // String </table>
      1087: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1090: pop
      1091: aload         18
      1093: invokevirtual #252                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
      1096: ifnull        1367
      1099: aload         18
      1101: invokevirtual #252                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
      1104: invokevirtual #256                // Method ext/mods/gameserver/model/Augmentation.getId:()I
      1107: istore        26
      1109: invokestatic  #261                // Method ext/mods/gameserver/data/xml/AugmentationData.getInstance:()Lext/mods/gameserver/data/xml/AugmentationData;
      1112: iload         26
      1114: invokevirtual #266                // Method ext/mods/gameserver/data/xml/AugmentationData.getAugStatsById:(I)Ljava/util/List;
      1117: astore        27
      1119: aload         27
      1121: invokeinterface #270,  1          // InterfaceMethod java/util/List.isEmpty:()Z
      1126: ifne          1213
      1129: aload         21
      1131: ldc_w         #273                // String <br><table width=280 bgcolor=000000>
      1134: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1137: pop
      1138: aload         21
      1140: ldc_w         #275                // String <tr><td><font color=LEVEL>Stats do Augment:</font></td></tr>
      1143: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1146: pop
      1147: aload         27
      1149: invokeinterface #277,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      1154: astore        28
      1156: aload         28
      1158: invokeinterface #281,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1163: ifeq          1205
      1166: aload         28
      1168: invokeinterface #286,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1173: checkcast     #290                // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
      1176: astore        29
      1178: aload         21
      1180: aload         29
      1182: invokevirtual #292                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat.getStat:()Lext/mods/gameserver/enums/skills/Stats;
      1185: invokevirtual #296                // Method ext/mods/gameserver/enums/skills/Stats.getName:()Ljava/lang/String;
      1188: aload         29
      1190: invokevirtual #299                // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat.getValue:()F
      1193: invokedynamic #303,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;F)Ljava/lang/String;
      1198: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1201: pop
      1202: goto          1156
      1205: aload         21
      1207: ldc           #250                // String </table>
      1209: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1212: pop
      1213: aload         18
      1215: invokevirtual #252                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
      1218: invokevirtual #306                // Method ext/mods/gameserver/model/Augmentation.getSkill:()Lext/mods/gameserver/skills/L2Skill;
      1221: astore        28
      1223: aload         28
      1225: ifnull        1367
      1228: aload         21
      1230: ldc_w         #273                // String <br><table width=280 bgcolor=000000>
      1233: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1236: pop
      1237: aload         21
      1239: ldc_w         #310                // String <tr><td><font color=LEVEL>Skill do Augment:</font></td></tr>
      1242: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1245: pop
      1246: aload         28
      1248: invokevirtual #312                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
      1251: astore        29
      1253: iconst_3
      1254: anewarray     #10                 // class java/lang/String
      1257: dup
      1258: iconst_0
      1259: ldc_w         #315                // String Special Ability:
      1262: aastore
      1263: dup
      1264: iconst_1
      1265: ldc_w         #317                // String Special
      1268: aastore
      1269: dup
      1270: iconst_2
      1271: ldc_w         #319                // String Item Skill:
      1274: aastore
      1275: astore        30
      1277: aload         30
      1279: astore        31
      1281: aload         31
      1283: arraylength
      1284: istore        32
      1286: iconst_0
      1287: istore        33
      1289: iload         33
      1291: iload         32
      1293: if_icmpge     1324
      1296: aload         31
      1298: iload         33
      1300: aaload
      1301: astore        34
      1303: aload         29
      1305: aload         34
      1307: ldc_w         #321                // String
      1310: invokevirtual #323                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1313: invokevirtual #327                // Method java/lang/String.trim:()Ljava/lang/String;
      1316: astore        29
      1318: iinc          33, 1
      1321: goto          1289
      1324: aload         21
      1326: aload         29
      1328: aload         28
      1330: invokevirtual #330                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
      1333: aload         28
      1335: invokevirtual #333                // Method ext/mods/gameserver/skills/L2Skill.isPassive:()Z
      1338: ifeq          1347
      1341: ldc_w         #336                // String Passiva
      1344: goto          1350
      1347: ldc_w         #338                // String Ativa
      1350: invokedynamic #340,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
      1355: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1358: pop
      1359: aload         21
      1361: ldc           #250                // String </table>
      1363: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1366: pop
      1367: iload         25
      1369: ifne          1427
      1372: aload         21
      1374: ldc_w         #343                // String <br><table width=300 cellpadding=3><tr>
      1377: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1380: pop
      1381: aload         21
      1383: ldc_w         #345                // String <td><font color=LEVEL>Qtd:</font></td>
      1386: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1389: pop
      1390: aload         21
      1392: ldc_w         #347                // String <td><edit var=\"qtd\" width=85 type=number></td>
      1395: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1398: pop
      1399: aload         21
      1401: aload         18
      1403: invokevirtual #208                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
      1406: invokedynamic #349,  0            // InvokeDynamic #9:makeConcatWithConstants:(I)Ljava/lang/String;
      1411: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1414: pop
      1415: aload         21
      1417: ldc_w         #350                // String </tr></table>
      1420: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1423: pop
      1424: goto          1461
      1427: aload         21
      1429: ldc_w         #352                // String <br><table><tr>
      1432: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1435: pop
      1436: aload         21
      1438: aload         18
      1440: invokevirtual #208                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
      1443: invokedynamic #354,  0            // InvokeDynamic #10:makeConcatWithConstants:(I)Ljava/lang/String;
      1448: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1451: pop
      1452: aload         21
      1454: ldc_w         #350                // String </tr></table>
      1457: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1460: pop
      1461: aload         21
      1463: ldc_w         #355                // String <br><button value=\"Voltar\" action=\"bypass -h voiced_email select_items\" width=55 height=15 back=sek.cbui94 fore=sek.cbui92>
      1466: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1469: pop
      1470: aload         21
      1472: ldc_w         #357                // String </center></body></html>
      1475: invokevirtual #232                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1478: pop
      1479: aload         20
      1481: aload         21
      1483: invokevirtual #359                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1486: invokevirtual #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
      1489: aload_2
      1490: aload         20
      1492: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1495: goto          1598
      1498: aload_2
      1499: aload         4
      1501: invokestatic  #369                // Method ext/mods/email/items/EmailItemSender.processSendCommand:(Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
      1504: goto          1598
      1507: aload_2
      1508: invokevirtual #374                // Method ext/mods/gameserver/model/actor/Player.clearTempSelectedItems:()V
      1511: aload_2
      1512: ldc_w         #377                // String Itens selecionados foram limpos.
      1515: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1518: aload_2
      1519: iconst_1
      1520: invokestatic  #131                // Method ext/mods/email/items/EmailItemSelector.showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
      1523: goto          1598
      1526: aload         4
      1528: invokevirtual #24                 // Method ext/mods/util/Tokenizer.countTokens:()I
      1531: iconst_2
      1532: if_icmplt     1565
      1535: aload         4
      1537: iconst_2
      1538: iconst_0
      1539: invokevirtual #93                 // Method ext/mods/util/Tokenizer.getAsInteger:(II)I
      1542: istore        26
      1544: aload_2
      1545: iload         26
      1547: invokevirtual #379                // Method ext/mods/gameserver/model/actor/Player.removeTempSelectedItem:(I)V
      1550: aload_2
      1551: ldc_w         #382                // String Item removido da lista.
      1554: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1557: aload_2
      1558: iconst_1
      1559: invokestatic  #131                // Method ext/mods/email/items/EmailItemSelector.showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
      1562: goto          1598
      1565: aload_2
      1566: ldc_w         #384                // String ID do item não especificado.
      1569: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1572: goto          1598
      1575: invokestatic  #40                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
      1578: aload_2
      1579: ldc           #46                 // String email_main.htm
      1581: invokevirtual #48                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1584: goto          1598
      1587: aload_2
      1588: aload         5
      1590: invokedynamic #386,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1595: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1598: iconst_1
      1599: ireturn
      Exception table:
         from    to  target type
           689   698   701   Class java/lang/Exception
      LineNumberTable:
        line 47: 0
        line 49: 9
        line 50: 19
        line 53: 27
        line 56: 46
        line 59: 55
        line 62: 64
        line 65: 73
        line 68: 82
        line 70: 87
        line 71: 96
        line 74: 98
        line 77: 536
        line 78: 543
        line 81: 546
        line 82: 555
        line 83: 560
        line 84: 569
        line 85: 575
        line 87: 585
        line 89: 591
        line 92: 594
        line 93: 603
        line 96: 606
        line 97: 614
        line 98: 620
        line 99: 629
        line 102: 632
        line 103: 640
        line 104: 646
        line 105: 657
        line 106: 666
        line 109: 669
        line 110: 674
        line 111: 683
        line 114: 686
        line 117: 689
        line 121: 698
        line 119: 701
        line 122: 703
        line 123: 709
        line 126: 712
        line 128: 720
        line 130: 725
        line 131: 731
        line 132: 740
        line 135: 742
        line 136: 751
        line 139: 754
        line 140: 763
        line 141: 772
        line 143: 783
        line 145: 807
        line 146: 813
        line 147: 826
        line 150: 828
        line 151: 844
        line 152: 852
        line 154: 857
        line 157: 860
        line 159: 869
        line 160: 880
        line 161: 885
        line 163: 887
        line 164: 897
        line 165: 910
        line 167: 914
        line 168: 924
        line 170: 933
        line 171: 939
        line 172: 966
        line 174: 980
        line 175: 988
        line 176: 996
        line 177: 1004
        line 178: 1017
        line 179: 1033
        line 181: 1049
        line 183: 1054
        line 186: 1067
        line 187: 1075
        line 188: 1083
        line 190: 1091
        line 192: 1099
        line 194: 1109
        line 195: 1119
        line 197: 1129
        line 198: 1138
        line 199: 1147
        line 201: 1178
        line 202: 1202
        line 203: 1205
        line 206: 1213
        line 207: 1223
        line 209: 1228
        line 210: 1237
        line 212: 1246
        line 214: 1253
        line 221: 1277
        line 223: 1303
        line 221: 1318
        line 226: 1324
        line 227: 1359
        line 230: 1367
        line 232: 1372
        line 234: 1381
        line 235: 1390
        line 237: 1399
        line 239: 1415
        line 245: 1427
        line 246: 1436
        line 247: 1452
        line 250: 1461
        line 252: 1470
        line 254: 1479
        line 255: 1489
        line 256: 1495
        line 259: 1498
        line 260: 1504
        line 262: 1507
        line 263: 1511
        line 264: 1518
        line 265: 1523
        line 268: 1526
        line 270: 1535
        line 271: 1544
        line 272: 1550
        line 273: 1557
        line 274: 1562
        line 277: 1565
        line 279: 1572
        line 282: 1575
        line 283: 1584
        line 286: 1587
        line 291: 1598
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      16     6     i   I
          555      39     8 emailId   I
          614      18     9 targetName   Ljava/lang/String;
          640      29    10 duration   Ljava/lang/String;
          689      23    11  page   I
          720      34    12 searchtargetName   Ljava/lang/String;
          763      97    13 objectIdFinal   I
          772      88    14   qtd   J
          783      77    16 finalItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
         1178      24    29  stat   Lext/mods/gameserver/data/xml/AugmentationData$AugStat;
         1303      15    34 palavra   Ljava/lang/String;
         1253     114    29  name   Ljava/lang/String;
         1277      90    30 ocultarPalavras   [Ljava/lang/String;
         1109     258    26 augId   I
         1119     248    27 stats   Ljava/util/List;
         1223     144    28 skill   Lext/mods/gameserver/skills/L2Skill;
          869     629    17 objId   I
          880     618    18 selectedItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          897     601    19  icon   Ljava/lang/String;
          924     574    20  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          933     565    21    sb   Ljava/lang/StringBuilder;
          939     559    22 selectedIds   Ljava/util/Map;
          966     532    23 selectedAmount   J
          980     518    25 isSelected   Z
         1544      18    26 objectId   I
           19    1579     4 tokenizer   Lext/mods/util/Tokenizer;
           27    1571     5 param   Ljava/lang/String;
            0    1600     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Email;
            0    1600     1 command   Ljava/lang/String;
            0    1600     2 player   Lext/mods/gameserver/model/actor/Player;
            0    1600     3 target   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
         1119     248    27 stats   Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugStat;>;
          939     559    22 selectedIds   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
      StackMapTable: number_of_entries = 61
        frame_type = 254 /* append */
          offset_delta = 30
          locals = [ class ext/mods/util/Tokenizer, class java/lang/String, int ]
        frame_type = 250 /* chop */
          offset_delta = 15
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 137
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 11 /* same */
        frame_type = 25 /* same */
        frame_type = 36 /* same */
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, top, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, top, top, int, long, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 20 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, top, top, top, top, top, top, int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/String ]
        frame_type = 3 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, top, top, top, top, top, top, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, class java/util/Map, long ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 88
          locals = [ int ]
        frame_type = 254 /* append */
          offset_delta = 88
          locals = [ int, class java/util/List, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 48
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, top, top, top, top, top, top, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, class java/util/Map, long, int, int, class java/util/List, class ext/mods/gameserver/skills/L2Skill, class java/lang/String, class "[Ljava/lang/String;", class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 34
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, top, top, top, top, top, top, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, class java/util/Map, long, int, int, class java/util/List, class ext/mods/gameserver/skills/L2Skill, class java/lang/String, class "[Ljava/lang/String;" ]
          stack = [ class java/lang/StringBuilder, class java/lang/String, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, top, top, top, top, top, top, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, class java/util/Map, long, int, int, class java/util/List, class ext/mods/gameserver/skills/L2Skill, class java/lang/String, class "[Ljava/lang/String;" ]
          stack = [ class java/lang/StringBuilder, class java/lang/String, int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int, top, top, top, top, top, top, top, top, top, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, class java/util/Map, long, int ]
          stack = []
        frame_type = 59 /* same */
        frame_type = 33 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 8 /* same */
        frame_type = 18 /* same */
        frame_type = 38 /* same */
        frame_type = 9 /* same */
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Email, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #387                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 299: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Email;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String email
         8: aastore
         9: putstatic     #387                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 38: 0
}
SourceFile: "Email.java"
BootstrapMethods:
  0: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #452 Tempo de expiração definido para: \u0001
  1: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #454 email confirm_select_item \u0001
  2: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #456 Selecionado \u0001x \u0001
  3: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #458 <td width=40><img src=\"\u0001\" width=32 height=32></td>
  4: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 <td width=200><font color=LEVEL>\u0001</font><br1>
  5: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #462 Quantidade disponível: \u0001<br1>
  6: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #464 <font color=\"A9F5F2\">Selecionado: \u0001</font>
  7: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #466 <tr><td><font color=FF9900>\u0001</font>: <font color=LEVEL>+\u0001</font></td></tr>
  8: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #468 <tr><td><font color=00FF99>\u0001</font> (Lv \u0001) - \u0001</td></tr>
  9: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #470 <td><button value=\"Confirmar\" action=\"bypass -h voiced_email finalize_item \u0001 $qtd\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  10: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #472 <td><button value=\"Remover\" action=\"bypass -h voiced_email remove_selected_item \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normal\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  11: #476 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #474 Unknown command: \u0001
InnerClasses:
  public static #483= #290 of #262;       // AugStat=class ext/mods/gameserver/data/xml/AugmentationData$AugStat of class ext/mods/gameserver/data/xml/AugmentationData
  public static final #488= #484 of #486; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
