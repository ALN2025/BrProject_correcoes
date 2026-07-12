// Bytecode for: ext.mods.gameserver.model.actor.container.player.ShortcutList
// File: ext\mods\gameserver\model\actor\container\player\ShortcutList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/ShortcutList.class
  Last modified 9 de jul de 2026; size 11410 bytes
  MD5 checksum 5ed0f6934cb5122eddeb08eb7f6bc757
  Compiled from "ShortcutList.java"
public class ext.mods.gameserver.model.actor.container.player.ShortcutList extends java.util.concurrent.ConcurrentSkipListMap<java.lang.Integer, ext.mods.gameserver.model.Shortcut>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/ShortcutList
  super_class: #2                         // java/util/concurrent/ConcurrentSkipListMap
  interfaces: 0, fields: 7, methods: 12, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // java/util/concurrent/ConcurrentSkipListMap."<init>":()V
    #2 = Class              #4            // java/util/concurrent/ConcurrentSkipListMap
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/concurrent/ConcurrentSkipListMap
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/player/ShortcutList._owner:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/player/ShortcutList
    #9 = NameAndType        #11:#12       // _owner:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/player/ShortcutList
   #11 = Utf8               _owner
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/container/player/ShortcutList.values:()Ljava/util/Collection;
   #14 = NameAndType        #15:#16       // values:()Ljava/util/Collection;
   #15 = Utf8               values
   #16 = Utf8               ()Ljava/util/Collection;
   #17 = InterfaceMethodref #18.#19       // java/util/Collection.size:()I
   #18 = Class              #20           // java/util/Collection
   #19 = NameAndType        #21:#22       // size:()I
   #20 = Utf8               java/util/Collection
   #21 = Utf8               size
   #22 = Utf8               ()I
   #23 = Class              #24           // ext/mods/gameserver/model/Shortcut
   #24 = Utf8               ext/mods/gameserver/model/Shortcut
   #25 = InterfaceMethodref #18.#26       // java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #26 = NameAndType        #27:#28       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #27 = Utf8               toArray
   #28 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #29 = Class              #30           // "[Lext/mods/gameserver/model/Shortcut;"
   #30 = Utf8               [Lext/mods/gameserver/model/Shortcut;
   #31 = Methodref          #8.#32        // ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;ZZ)V
   #32 = NameAndType        #33:#34       // addShortcut:(Lext/mods/gameserver/model/Shortcut;ZZ)V
   #33 = Utf8               addShortcut
   #34 = Utf8               (Lext/mods/gameserver/model/Shortcut;ZZ)V
   #35 = Fieldref           #36.#37       // ext/mods/gameserver/model/actor/container/player/ShortcutList$1.$SwitchMap$ext$mods$gameserver$enums$ShortcutType:[I
   #36 = Class              #38           // ext/mods/gameserver/model/actor/container/player/ShortcutList$1
   #37 = NameAndType        #39:#40       // $SwitchMap$ext$mods$gameserver$enums$ShortcutType:[I
   #38 = Utf8               ext/mods/gameserver/model/actor/container/player/ShortcutList$1
   #39 = Utf8               $SwitchMap$ext$mods$gameserver$enums$ShortcutType
   #40 = Utf8               [I
   #41 = Methodref          #23.#42       // ext/mods/gameserver/model/Shortcut.getType:()Lext/mods/gameserver/enums/ShortcutType;
   #42 = NameAndType        #43:#44       // getType:()Lext/mods/gameserver/enums/ShortcutType;
   #43 = Utf8               getType
   #44 = Utf8               ()Lext/mods/gameserver/enums/ShortcutType;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/enums/ShortcutType.ordinal:()I
   #46 = Class              #48           // ext/mods/gameserver/enums/ShortcutType
   #47 = NameAndType        #49:#22       // ordinal:()I
   #48 = Utf8               ext/mods/gameserver/enums/ShortcutType
   #49 = Utf8               ordinal
   #50 = Methodref          #51.#52       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #51 = Class              #53           // ext/mods/gameserver/model/actor/Player
   #52 = NameAndType        #54:#55       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #53 = Utf8               ext/mods/gameserver/model/actor/Player
   #54 = Utf8               getInventory
   #55 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #56 = Methodref          #23.#57       // ext/mods/gameserver/model/Shortcut.getId:()I
   #57 = NameAndType        #58:#22       // getId:()I
   #58 = Utf8               getId
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #60 = Class              #62           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #61 = NameAndType        #63:#64       // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #62 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #63 = Utf8               getItemByObjectId
   #64 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/item/instance/ItemInstance.isEtcItem:()Z
   #66 = Class              #68           // ext/mods/gameserver/model/item/instance/ItemInstance
   #67 = NameAndType        #69:#70       // isEtcItem:()Z
   #68 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #69 = Utf8               isEtcItem
   #70 = Utf8               ()Z
   #71 = Methodref          #66.#72       // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #72 = NameAndType        #73:#74       // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #73 = Utf8               getEtcItem
   #74 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/item/kind/EtcItem.getSharedReuseGroup:()I
   #76 = Class              #78           // ext/mods/gameserver/model/item/kind/EtcItem
   #77 = NameAndType        #79:#22       // getSharedReuseGroup:()I
   #78 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
   #79 = Utf8               getSharedReuseGroup
   #80 = Methodref          #23.#81       // ext/mods/gameserver/model/Shortcut.setSharedReuseGroup:(I)V
   #81 = NameAndType        #82:#83       // setSharedReuseGroup:(I)V
   #82 = Utf8               setSharedReuseGroup
   #83 = Utf8               (I)V
   #84 = Methodref          #51.#85       // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
   #85 = NameAndType        #86:#87       // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
   #86 = Utf8               getSkill
   #87 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
   #88 = Methodref          #89.#90       // ext/mods/gameserver/skills/L2Skill.getLevel:()I
   #89 = Class              #91           // ext/mods/gameserver/skills/L2Skill
   #90 = NameAndType        #92:#22       // getLevel:()I
   #91 = Utf8               ext/mods/gameserver/skills/L2Skill
   #92 = Utf8               getLevel
   #93 = Methodref          #23.#90       // ext/mods/gameserver/model/Shortcut.getLevel:()I
   #94 = Methodref          #23.#95       // ext/mods/gameserver/model/Shortcut.setLevel:(I)V
   #95 = NameAndType        #96:#83       // setLevel:(I)V
   #96 = Utf8               setLevel
   #97 = Methodref          #51.#98       // ext/mods/gameserver/model/actor/Player.getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
   #98 = NameAndType        #99:#100      // getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
   #99 = Utf8               getMacroList
  #100 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MacroList;
  #101 = Methodref          #102.#103     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #102 = Class              #104          // java/lang/Integer
  #103 = NameAndType        #105:#106     // valueOf:(I)Ljava/lang/Integer;
  #104 = Utf8               java/lang/Integer
  #105 = Utf8               valueOf
  #106 = Utf8               (I)Ljava/lang/Integer;
  #107 = Methodref          #108.#109     // ext/mods/gameserver/model/actor/container/player/MacroList.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #108 = Class              #110          // ext/mods/gameserver/model/actor/container/player/MacroList
  #109 = NameAndType        #111:#112     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #110 = Utf8               ext/mods/gameserver/model/actor/container/player/MacroList
  #111 = Utf8               get
  #112 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #113 = Class              #114          // ext/mods/gameserver/model/Macro
  #114 = Utf8               ext/mods/gameserver/model/Macro
  #115 = Methodref          #51.#116      // ext/mods/gameserver/model/actor/Player.getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
  #116 = NameAndType        #117:#118     // getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
  #117 = Utf8               getRecipeBook
  #118 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
  #119 = Methodref          #120.#121     // ext/mods/gameserver/model/actor/container/player/RecipeBook.hasRecipe:(I)Z
  #120 = Class              #122          // ext/mods/gameserver/model/actor/container/player/RecipeBook
  #121 = NameAndType        #123:#124     // hasRecipe:(I)Z
  #122 = Utf8               ext/mods/gameserver/model/actor/container/player/RecipeBook
  #123 = Utf8               hasRecipe
  #124 = Utf8               (I)Z
  #125 = Methodref          #23.#126      // ext/mods/gameserver/model/Shortcut.getSlot:()I
  #126 = NameAndType        #127:#22      // getSlot:()I
  #127 = Utf8               getSlot
  #128 = Methodref          #23.#129      // ext/mods/gameserver/model/Shortcut.getPage:()I
  #129 = NameAndType        #130:#22      // getPage:()I
  #130 = Utf8               getPage
  #131 = Methodref          #8.#132       // ext/mods/gameserver/model/actor/container/player/ShortcutList.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #132 = NameAndType        #133:#134     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #133 = Utf8               put
  #134 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #135 = Methodref          #8.#136       // ext/mods/gameserver/model/actor/container/player/ShortcutList.deleteShortCutFromDb:(Lext/mods/gameserver/model/Shortcut;)V
  #136 = NameAndType        #137:#138     // deleteShortCutFromDb:(Lext/mods/gameserver/model/Shortcut;)V
  #137 = Utf8               deleteShortCutFromDb
  #138 = Utf8               (Lext/mods/gameserver/model/Shortcut;)V
  #139 = Methodref          #140.#141     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #140 = Class              #142          // ext/mods/commons/pool/ConnectionPool
  #141 = NameAndType        #143:#144     // getConnection:()Ljava/sql/Connection;
  #142 = Utf8               ext/mods/commons/pool/ConnectionPool
  #143 = Utf8               getConnection
  #144 = Utf8               ()Ljava/sql/Connection;
  #145 = String             #146          // REPLACE INTO character_shortcuts (char_obj_id,slot,page,type,id,level,class_index) values(?,?,?,?,?,?,?)
  #146 = Utf8               REPLACE INTO character_shortcuts (char_obj_id,slot,page,type,id,level,class_index) values(?,?,?,?,?,?,?)
  #147 = InterfaceMethodref #148.#149     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #148 = Class              #150          // java/sql/Connection
  #149 = NameAndType        #151:#152     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #150 = Utf8               java/sql/Connection
  #151 = Utf8               prepareStatement
  #152 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #153 = Methodref          #51.#154      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #154 = NameAndType        #155:#22      // getObjectId:()I
  #155 = Utf8               getObjectId
  #156 = InterfaceMethodref #157.#158     // java/sql/PreparedStatement.setInt:(II)V
  #157 = Class              #159          // java/sql/PreparedStatement
  #158 = NameAndType        #160:#161     // setInt:(II)V
  #159 = Utf8               java/sql/PreparedStatement
  #160 = Utf8               setInt
  #161 = Utf8               (II)V
  #162 = Methodref          #46.#163      // ext/mods/gameserver/enums/ShortcutType.toString:()Ljava/lang/String;
  #163 = NameAndType        #164:#165     // toString:()Ljava/lang/String;
  #164 = Utf8               toString
  #165 = Utf8               ()Ljava/lang/String;
  #166 = InterfaceMethodref #157.#167     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #167 = NameAndType        #168:#169     // setString:(ILjava/lang/String;)V
  #168 = Utf8               setString
  #169 = Utf8               (ILjava/lang/String;)V
  #170 = Methodref          #51.#171      // ext/mods/gameserver/model/actor/Player.getClassIndex:()I
  #171 = NameAndType        #172:#22      // getClassIndex:()I
  #172 = Utf8               getClassIndex
  #173 = InterfaceMethodref #157.#174     // java/sql/PreparedStatement.execute:()Z
  #174 = NameAndType        #175:#70      // execute:()Z
  #175 = Utf8               execute
  #176 = InterfaceMethodref #157.#177     // java/sql/PreparedStatement.close:()V
  #177 = NameAndType        #178:#6       // close:()V
  #178 = Utf8               close
  #179 = Class              #180          // java/lang/Throwable
  #180 = Utf8               java/lang/Throwable
  #181 = Methodref          #179.#182     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #182 = NameAndType        #183:#184     // addSuppressed:(Ljava/lang/Throwable;)V
  #183 = Utf8               addSuppressed
  #184 = Utf8               (Ljava/lang/Throwable;)V
  #185 = InterfaceMethodref #148.#177     // java/sql/Connection.close:()V
  #186 = Class              #187          // java/lang/Exception
  #187 = Utf8               java/lang/Exception
  #188 = Fieldref           #8.#189       // ext/mods/gameserver/model/actor/container/player/ShortcutList.LOGGER:Lext/mods/commons/logging/CLogger;
  #189 = NameAndType        #190:#191     // LOGGER:Lext/mods/commons/logging/CLogger;
  #190 = Utf8               LOGGER
  #191 = Utf8               Lext/mods/commons/logging/CLogger;
  #192 = String             #193          // Couldn\'t store shortcut.
  #193 = Utf8               Couldn\'t store shortcut.
  #194 = Methodref          #195.#196     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #195 = Class              #197          // ext/mods/commons/logging/CLogger
  #196 = NameAndType        #198:#199     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #197 = Utf8               ext/mods/commons/logging/CLogger
  #198 = Utf8               error
  #199 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #200 = Methodref          #8.#201       // ext/mods/gameserver/model/actor/container/player/ShortcutList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #201 = NameAndType        #202:#112     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #202 = Utf8               remove
  #203 = Fieldref           #46.#204      // ext/mods/gameserver/enums/ShortcutType.ITEM:Lext/mods/gameserver/enums/ShortcutType;
  #204 = NameAndType        #205:#206     // ITEM:Lext/mods/gameserver/enums/ShortcutType;
  #205 = Utf8               ITEM
  #206 = Utf8               Lext/mods/gameserver/enums/ShortcutType;
  #207 = Methodref          #66.#208      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #208 = NameAndType        #209:#210     // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #209 = Utf8               getItemType
  #210 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #211 = Fieldref           #212.#213     // ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
  #212 = Class              #214          // ext/mods/gameserver/enums/items/EtcItemType
  #213 = NameAndType        #215:#216     // SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
  #214 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
  #215 = Utf8               SHOT
  #216 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
  #217 = Methodref          #66.#218      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #218 = NameAndType        #219:#22      // getItemId:()I
  #219 = Utf8               getItemId
  #220 = Methodref          #51.#221      // ext/mods/gameserver/model/actor/Player.removeAutoSoulShot:(I)Z
  #221 = NameAndType        #222:#124     // removeAutoSoulShot:(I)Z
  #222 = Utf8               removeAutoSoulShot
  #223 = Class              #224          // ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
  #224 = Utf8               ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
  #225 = Methodref          #223.#226     // ext/mods/gameserver/network/serverpackets/ExAutoSoulShot."<init>":(II)V
  #226 = NameAndType        #5:#161       // "<init>":(II)V
  #227 = Methodref          #51.#228      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #228 = NameAndType        #229:#230     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #229 = Utf8               sendPacket
  #230 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #231 = Class              #232          // ext/mods/gameserver/network/serverpackets/ShortCutDelete
  #232 = Utf8               ext/mods/gameserver/network/serverpackets/ShortCutDelete
  #233 = Methodref          #231.#234     // ext/mods/gameserver/network/serverpackets/ShortCutDelete."<init>":(I)V
  #234 = NameAndType        #5:#83        // "<init>":(I)V
  #235 = Methodref          #51.#236      // ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
  #236 = NameAndType        #237:#238     // getAutoSoulShot:()Ljava/util/Set;
  #237 = Utf8               getAutoSoulShot
  #238 = Utf8               ()Ljava/util/Set;
  #239 = InterfaceMethodref #240.#241     // java/util/Set.iterator:()Ljava/util/Iterator;
  #240 = Class              #242          // java/util/Set
  #241 = NameAndType        #243:#244     // iterator:()Ljava/util/Iterator;
  #242 = Utf8               java/util/Set
  #243 = Utf8               iterator
  #244 = Utf8               ()Ljava/util/Iterator;
  #245 = InterfaceMethodref #246.#247     // java/util/Iterator.hasNext:()Z
  #246 = Class              #248          // java/util/Iterator
  #247 = NameAndType        #249:#70      // hasNext:()Z
  #248 = Utf8               java/util/Iterator
  #249 = Utf8               hasNext
  #250 = InterfaceMethodref #246.#251     // java/util/Iterator.next:()Ljava/lang/Object;
  #251 = NameAndType        #252:#253     // next:()Ljava/lang/Object;
  #252 = Utf8               next
  #253 = Utf8               ()Ljava/lang/Object;
  #254 = Methodref          #102.#255     // java/lang/Integer.intValue:()I
  #255 = NameAndType        #256:#22      // intValue:()I
  #256 = Utf8               intValue
  #257 = String             #258          // DELETE FROM character_shortcuts WHERE char_obj_id=? AND slot=? AND page=? AND class_index=?
  #258 = Utf8               DELETE FROM character_shortcuts WHERE char_obj_id=? AND slot=? AND page=? AND class_index=?
  #259 = String             #260          // Couldn\'t delete shortcut.
  #260 = Utf8               Couldn\'t delete shortcut.
  #261 = Methodref          #8.#262       // ext/mods/gameserver/model/actor/container/player/ShortcutList.clear:()V
  #262 = NameAndType        #263:#6       // clear:()V
  #263 = Utf8               clear
  #264 = String             #265          // SELECT char_obj_id, slot, page, type, id, level FROM character_shortcuts WHERE char_obj_id=? AND class_index=?
  #265 = Utf8               SELECT char_obj_id, slot, page, type, id, level FROM character_shortcuts WHERE char_obj_id=? AND class_index=?
  #266 = InterfaceMethodref #157.#267     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #267 = NameAndType        #268:#269     // executeQuery:()Ljava/sql/ResultSet;
  #268 = Utf8               executeQuery
  #269 = Utf8               ()Ljava/sql/ResultSet;
  #270 = InterfaceMethodref #271.#272     // java/sql/ResultSet.next:()Z
  #271 = Class              #273          // java/sql/ResultSet
  #272 = NameAndType        #252:#70      // next:()Z
  #273 = Utf8               java/sql/ResultSet
  #274 = String             #275          // slot
  #275 = Utf8               slot
  #276 = InterfaceMethodref #271.#277     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #277 = NameAndType        #278:#279     // getInt:(Ljava/lang/String;)I
  #278 = Utf8               getInt
  #279 = Utf8               (Ljava/lang/String;)I
  #280 = String             #281          // page
  #281 = Utf8               page
  #282 = String             #283          // type
  #283 = Utf8               type
  #284 = InterfaceMethodref #271.#285     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #285 = NameAndType        #286:#287     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #286 = Utf8               getString
  #287 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #288 = Methodref          #289.#290     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #289 = Class              #291          // java/lang/Enum
  #290 = NameAndType        #105:#292     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #291 = Utf8               java/lang/Enum
  #292 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #293 = String             #294          // id
  #294 = Utf8               id
  #295 = String             #296          // level
  #296 = Utf8               level
  #297 = Methodref          #23.#298      // ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
  #298 = NameAndType        #5:#299       // "<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
  #299 = Utf8               (IILext/mods/gameserver/enums/ShortcutType;III)V
  #300 = InterfaceMethodref #271.#177     // java/sql/ResultSet.close:()V
  #301 = String             #302          // Couldn\'t restore shortcuts.
  #302 = Utf8               Couldn\'t restore shortcuts.
  #303 = InterfaceMethodref #18.#304      // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #304 = NameAndType        #305:#306     // stream:()Ljava/util/stream/Stream;
  #305 = Utf8               stream
  #306 = Utf8               ()Ljava/util/stream/Stream;
  #307 = InterfaceMethodref #308.#309     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #308 = Class              #310          // java/util/stream/Stream
  #309 = NameAndType        #311:#312     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #310 = Utf8               java/util/stream/Stream
  #311 = Utf8               filter
  #312 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #313 = InterfaceMethodref #308.#314     // java/util/stream/Stream.toList:()Ljava/util/List;
  #314 = NameAndType        #315:#316     // toList:()Ljava/util/List;
  #315 = Utf8               toList
  #316 = Utf8               ()Ljava/util/List;
  #317 = InterfaceMethodref #318.#319     // java/util/List.isEmpty:()Z
  #318 = Class              #320          // java/util/List
  #319 = NameAndType        #321:#70      // isEmpty:()Z
  #320 = Utf8               java/util/List
  #321 = Utf8               isEmpty
  #322 = InterfaceMethodref #318.#241     // java/util/List.iterator:()Ljava/util/Iterator;
  #323 = Class              #324          // ext/mods/gameserver/network/serverpackets/ShortCutRegister
  #324 = Utf8               ext/mods/gameserver/network/serverpackets/ShortCutRegister
  #325 = Methodref          #323.#326     // ext/mods/gameserver/network/serverpackets/ShortCutRegister."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Shortcut;)V
  #326 = NameAndType        #5:#327       // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Shortcut;)V
  #327 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Shortcut;)V
  #328 = InterfaceMethodref #157.#329     // java/sql/PreparedStatement.addBatch:()V
  #329 = NameAndType        #330:#6       // addBatch:()V
  #330 = Utf8               addBatch
  #331 = InterfaceMethodref #157.#332     // java/sql/PreparedStatement.executeBatch:()[I
  #332 = NameAndType        #333:#334     // executeBatch:()[I
  #333 = Utf8               executeBatch
  #334 = Utf8               ()[I
  #335 = String             #336          // Couldn\'t store shortcuts.
  #336 = Utf8               Couldn\'t store shortcuts.
  #337 = InvokeDynamic      #0:#338       // #0:accept:(Lext/mods/gameserver/model/actor/container/player/ShortcutList;)Ljava/util/function/Consumer;
  #338 = NameAndType        #339:#340     // accept:(Lext/mods/gameserver/model/actor/container/player/ShortcutList;)Ljava/util/function/Consumer;
  #339 = Utf8               accept
  #340 = Utf8               (Lext/mods/gameserver/model/actor/container/player/ShortcutList;)Ljava/util/function/Consumer;
  #341 = InterfaceMethodref #308.#342     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #342 = NameAndType        #343:#344     // forEach:(Ljava/util/function/Consumer;)V
  #343 = Utf8               forEach
  #344 = Utf8               (Ljava/util/function/Consumer;)V
  #345 = InterfaceMethodref #18.#241      // java/util/Collection.iterator:()Ljava/util/Iterator;
  #346 = Methodref          #8.#347       // ext/mods/gameserver/model/actor/container/player/ShortcutList.deleteShortcut:(II)V
  #347 = NameAndType        #348:#161     // deleteShortcut:(II)V
  #348 = Utf8               deleteShortcut
  #349 = Methodref          #350.#351     // java/lang/Class.getName:()Ljava/lang/String;
  #350 = Class              #352          // java/lang/Class
  #351 = NameAndType        #353:#165     // getName:()Ljava/lang/String;
  #352 = Utf8               java/lang/Class
  #353 = Utf8               getName
  #354 = Methodref          #195.#355     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #355 = NameAndType        #5:#356       // "<init>":(Ljava/lang/String;)V
  #356 = Utf8               (Ljava/lang/String;)V
  #357 = Utf8               serialVersionUID
  #358 = Utf8               J
  #359 = Utf8               ConstantValue
  #360 = Long               1l
  #362 = Utf8               INSERT_SHORTCUT
  #363 = Utf8               Ljava/lang/String;
  #364 = Utf8               DELETE_SHORTCUT
  #365 = Utf8               LOAD_SHORTCUTS
  #366 = Utf8               MAX_SHORTCUTS_PER_BAR
  #367 = Utf8               I
  #368 = Integer            12
  #369 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #370 = Utf8               Code
  #371 = Utf8               LineNumberTable
  #372 = Utf8               LocalVariableTable
  #373 = Utf8               this
  #374 = Utf8               Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #375 = Utf8               owner
  #376 = Utf8               getShortcuts
  #377 = Utf8               ()[Lext/mods/gameserver/model/Shortcut;
  #378 = Utf8               shortcut
  #379 = Utf8               Lext/mods/gameserver/model/Shortcut;
  #380 = Utf8               item
  #381 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #382 = Utf8               skill
  #383 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #384 = Utf8               macro
  #385 = Utf8               Lext/mods/gameserver/model/Macro;
  #386 = Utf8               ps
  #387 = Utf8               Ljava/sql/PreparedStatement;
  #388 = Utf8               con
  #389 = Utf8               Ljava/sql/Connection;
  #390 = Utf8               e
  #391 = Utf8               Ljava/lang/Exception;
  #392 = Utf8               checkIntegrity
  #393 = Utf8               Z
  #394 = Utf8               store
  #395 = Utf8               oldShortcut
  #396 = Utf8               StackMapTable
  #397 = Utf8               shotId
  #398 = Utf8               restore
  #399 = Utf8               rs
  #400 = Utf8               Ljava/sql/ResultSet;
  #401 = Utf8               refreshShortcuts
  #402 = Utf8               (Ljava/util/function/Predicate;I)V
  #403 = Utf8               s
  #404 = Utf8               predicate
  #405 = Utf8               Ljava/util/function/Predicate;
  #406 = Utf8               shortcuts
  #407 = Utf8               Ljava/util/List;
  #408 = Utf8               LocalVariableTypeTable
  #409 = Utf8               Ljava/util/function/Predicate<Lext/mods/gameserver/model/Shortcut;>;
  #410 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/Shortcut;>;
  #411 = Class              #412          // java/util/function/Predicate
  #412 = Utf8               java/util/function/Predicate
  #413 = Utf8               Signature
  #414 = Utf8               (Ljava/util/function/Predicate<Lext/mods/gameserver/model/Shortcut;>;I)V
  #415 = Utf8               (Ljava/util/function/Predicate;)V
  #416 = Utf8               (Ljava/util/function/Predicate<Lext/mods/gameserver/model/Shortcut;>;)V
  #417 = Utf8               deleteShortcuts
  #418 = Utf8               (ILext/mods/gameserver/enums/ShortcutType;)V
  #419 = Utf8               lambda$refreshShortcuts$0
  #420 = Utf8               <clinit>
  #421 = Utf8               Ljava/util/concurrent/ConcurrentSkipListMap<Ljava/lang/Integer;Lext/mods/gameserver/model/Shortcut;>;
  #422 = Utf8               SourceFile
  #423 = Utf8               ShortcutList.java
  #424 = Utf8               NestMembers
  #425 = Utf8               BootstrapMethods
  #426 = MethodType         #427          //  (Ljava/lang/Object;)V
  #427 = Utf8               (Ljava/lang/Object;)V
  #428 = MethodHandle       5:#429        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/ShortcutList.lambda$refreshShortcuts$0:(Lext/mods/gameserver/model/Shortcut;)V
  #429 = Methodref          #8.#430       // ext/mods/gameserver/model/actor/container/player/ShortcutList.lambda$refreshShortcuts$0:(Lext/mods/gameserver/model/Shortcut;)V
  #430 = NameAndType        #419:#138     // lambda$refreshShortcuts$0:(Lext/mods/gameserver/model/Shortcut;)V
  #431 = MethodType         #138          //  (Lext/mods/gameserver/model/Shortcut;)V
  #432 = MethodHandle       6:#433        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #433 = Methodref          #434.#435     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #434 = Class              #436          // java/lang/invoke/LambdaMetafactory
  #435 = NameAndType        #437:#438     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #436 = Utf8               java/lang/invoke/LambdaMetafactory
  #437 = Utf8               metafactory
  #438 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #439 = Utf8               InnerClasses
  #440 = Class              #441          // java/lang/invoke/MethodHandles$Lookup
  #441 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #442 = Class              #443          // java/lang/invoke/MethodHandles
  #443 = Utf8               java/lang/invoke/MethodHandles
  #444 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.player.ShortcutList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/concurrent/ConcurrentSkipListMap."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
         9: return
      LineNumberTable:
        line 56: 0
        line 57: 4
        line 58: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;
            0      10     1 owner   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.Shortcut[] getShortcuts();
    descriptor: ()[Lext/mods/gameserver/model/Shortcut;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #13                 // Method values:()Ljava/util/Collection;
         4: aload_0
         5: invokevirtual #13                 // Method values:()Ljava/util/Collection;
         8: invokeinterface #17,  1           // InterfaceMethod java/util/Collection.size:()I
        13: anewarray     #23                 // class ext/mods/gameserver/model/Shortcut
        16: invokeinterface #25,  2           // InterfaceMethod java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        21: checkcast     #29                 // class "[Lext/mods/gameserver/model/Shortcut;"
        24: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;

  public void addShortcut(ext.mods.gameserver.model.Shortcut);
    descriptor: (Lext/mods/gameserver/model/Shortcut;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_1
         3: iconst_1
         4: invokevirtual #31                 // Method addShortcut:(Lext/mods/gameserver/model/Shortcut;ZZ)V
         7: return
      LineNumberTable:
        line 71: 0
        line 72: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;
            0       8     1 shortcut   Lext/mods/gameserver/model/Shortcut;

  public void addShortcut(ext.mods.gameserver.model.Shortcut, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/Shortcut;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=4
         0: iload_2
         1: ifeq          178
         4: getstatic     #35                 // Field ext/mods/gameserver/model/actor/container/player/ShortcutList$1.$SwitchMap$ext$mods$gameserver$enums$ShortcutType:[I
         7: aload_1
         8: invokevirtual #41                 // Method ext/mods/gameserver/model/Shortcut.getType:()Lext/mods/gameserver/enums/ShortcutType;
        11: invokevirtual #45                 // Method ext/mods/gameserver/enums/ShortcutType.ordinal:()I
        14: iaload
        15: tableswitch   { // 1 to 4

                       1: 44

                       2: 89

                       3: 132

                       4: 160
                 default: 178
            }
        44: aload_0
        45: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        48: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        51: aload_1
        52: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
        55: invokevirtual #59                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        58: astore        4
        60: aload         4
        62: ifnonnull     66
        65: return
        66: aload         4
        68: invokevirtual #65                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEtcItem:()Z
        71: ifeq          178
        74: aload_1
        75: aload         4
        77: invokevirtual #71                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
        80: invokevirtual #75                 // Method ext/mods/gameserver/model/item/kind/EtcItem.getSharedReuseGroup:()I
        83: invokevirtual #80                 // Method ext/mods/gameserver/model/Shortcut.setSharedReuseGroup:(I)V
        86: goto          178
        89: aload_0
        90: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        93: aload_1
        94: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
        97: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
       100: astore        5
       102: aload         5
       104: ifnonnull     108
       107: return
       108: aload         5
       110: invokevirtual #88                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       113: aload_1
       114: invokevirtual #93                 // Method ext/mods/gameserver/model/Shortcut.getLevel:()I
       117: if_icmpeq     178
       120: aload_1
       121: aload         5
       123: invokevirtual #88                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       126: invokevirtual #94                 // Method ext/mods/gameserver/model/Shortcut.setLevel:(I)V
       129: goto          178
       132: aload_0
       133: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       136: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
       139: aload_1
       140: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
       143: invokestatic  #101                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       146: invokevirtual #107                // Method ext/mods/gameserver/model/actor/container/player/MacroList.get:(Ljava/lang/Object;)Ljava/lang/Object;
       149: checkcast     #113                // class ext/mods/gameserver/model/Macro
       152: astore        6
       154: aload         6
       156: ifnonnull     178
       159: return
       160: aload_0
       161: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       164: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
       167: aload_1
       168: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
       171: invokevirtual #119                // Method ext/mods/gameserver/model/actor/container/player/RecipeBook.hasRecipe:(I)Z
       174: ifne          178
       177: return
       178: aload_0
       179: aload_1
       180: invokevirtual #125                // Method ext/mods/gameserver/model/Shortcut.getSlot:()I
       183: aload_1
       184: invokevirtual #128                // Method ext/mods/gameserver/model/Shortcut.getPage:()I
       187: bipush        12
       189: imul
       190: iadd
       191: invokestatic  #101                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       194: aload_1
       195: invokevirtual #131                // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       198: checkcast     #23                 // class ext/mods/gameserver/model/Shortcut
       201: astore        4
       203: iload_3
       204: ifeq          440
       207: aload         4
       209: ifnull        218
       212: aload_0
       213: aload         4
       215: invokevirtual #135                // Method deleteShortCutFromDb:(Lext/mods/gameserver/model/Shortcut;)V
       218: invokestatic  #139                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       221: astore        5
       223: aload         5
       225: ldc           #145                // String REPLACE INTO character_shortcuts (char_obj_id,slot,page,type,id,level,class_index) values(?,?,?,?,?,?,?)
       227: invokeinterface #147,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       232: astore        6
       234: aload         6
       236: iconst_1
       237: aload_0
       238: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       241: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       244: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       249: aload         6
       251: iconst_2
       252: aload_1
       253: invokevirtual #125                // Method ext/mods/gameserver/model/Shortcut.getSlot:()I
       256: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       261: aload         6
       263: iconst_3
       264: aload_1
       265: invokevirtual #128                // Method ext/mods/gameserver/model/Shortcut.getPage:()I
       268: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       273: aload         6
       275: iconst_4
       276: aload_1
       277: invokevirtual #41                 // Method ext/mods/gameserver/model/Shortcut.getType:()Lext/mods/gameserver/enums/ShortcutType;
       280: invokevirtual #162                // Method ext/mods/gameserver/enums/ShortcutType.toString:()Ljava/lang/String;
       283: invokeinterface #166,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       288: aload         6
       290: iconst_5
       291: aload_1
       292: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
       295: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       300: aload         6
       302: bipush        6
       304: aload_1
       305: invokevirtual #93                 // Method ext/mods/gameserver/model/Shortcut.getLevel:()I
       308: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       313: aload         6
       315: bipush        7
       317: aload_0
       318: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       321: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
       324: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       329: aload         6
       331: invokeinterface #173,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       336: pop
       337: aload         6
       339: ifnull        381
       342: aload         6
       344: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       349: goto          381
       352: astore        7
       354: aload         6
       356: ifnull        378
       359: aload         6
       361: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       366: goto          378
       369: astore        8
       371: aload         7
       373: aload         8
       375: invokevirtual #181                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       378: aload         7
       380: athrow
       381: aload         5
       383: ifnull        425
       386: aload         5
       388: invokeinterface #185,  1          // InterfaceMethod java/sql/Connection.close:()V
       393: goto          425
       396: astore        6
       398: aload         5
       400: ifnull        422
       403: aload         5
       405: invokeinterface #185,  1          // InterfaceMethod java/sql/Connection.close:()V
       410: goto          422
       413: astore        7
       415: aload         6
       417: aload         7
       419: invokevirtual #181                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       422: aload         6
       424: athrow
       425: goto          440
       428: astore        5
       430: getstatic     #188                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       433: ldc           #192                // String Couldn\'t store shortcut.
       435: aload         5
       437: invokevirtual #194                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       440: return
      Exception table:
         from    to  target type
           234   337   352   Class java/lang/Throwable
           359   366   369   Class java/lang/Throwable
           223   381   396   Class java/lang/Throwable
           403   410   413   Class java/lang/Throwable
           218   425   428   Class java/lang/Exception
      LineNumberTable:
        line 82: 0
        line 84: 4
        line 87: 44
        line 88: 60
        line 89: 65
        line 91: 66
        line 92: 74
        line 96: 89
        line 97: 102
        line 98: 107
        line 100: 108
        line 101: 120
        line 105: 132
        line 106: 154
        line 107: 159
        line 111: 160
        line 112: 177
        line 117: 178
        line 119: 203
        line 121: 207
        line 122: 212
        line 124: 218
        line 125: 223
        line 127: 234
        line 128: 249
        line 129: 261
        line 130: 273
        line 131: 288
        line 132: 300
        line 133: 313
        line 134: 329
        line 135: 337
        line 124: 352
        line 135: 381
        line 124: 396
        line 139: 425
        line 136: 428
        line 138: 430
        line 141: 440
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60      29     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          102      30     5 skill   Lext/mods/gameserver/skills/L2Skill;
          154       6     6 macro   Lext/mods/gameserver/model/Macro;
          234     147     6    ps   Ljava/sql/PreparedStatement;
          223     202     5   con   Ljava/sql/Connection;
          430      10     5     e   Ljava/lang/Exception;
            0     441     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;
            0     441     1 shortcut   Lext/mods/gameserver/model/Shortcut;
            0     441     2 checkIntegrity   Z
            0     441     3 store   Z
          203     238     4 oldShortcut   Lext/mods/gameserver/model/Shortcut;
      StackMapTable: number_of_entries = 18
        frame_type = 44 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ top, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 249 /* chop */
          offset_delta = 23
        frame_type = 27 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/Shortcut ]
        frame_type = 255 /* full_frame */
          offset_delta = 133
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class ext/mods/gameserver/model/Shortcut, int, int, class ext/mods/gameserver/model/Shortcut, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class ext/mods/gameserver/model/Shortcut, int, int, class ext/mods/gameserver/model/Shortcut, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class ext/mods/gameserver/model/Shortcut, int, int, class ext/mods/gameserver/model/Shortcut, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public void deleteShortcut(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=3
         0: iload_1
         1: iload_2
         2: bipush        12
         4: imul
         5: iadd
         6: istore_1
         7: aload_0
         8: iload_1
         9: invokestatic  #101                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        12: invokevirtual #200                // Method remove:(Ljava/lang/Object;)Ljava/lang/Object;
        15: checkcast     #23                 // class ext/mods/gameserver/model/Shortcut
        18: astore_3
        19: aload_3
        20: ifnull        30
        23: aload_0
        24: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        27: ifnonnull     31
        30: return
        31: aload_0
        32: aload_3
        33: invokevirtual #135                // Method deleteShortCutFromDb:(Lext/mods/gameserver/model/Shortcut;)V
        36: aload_3
        37: invokevirtual #41                 // Method ext/mods/gameserver/model/Shortcut.getType:()Lext/mods/gameserver/enums/ShortcutType;
        40: getstatic     #203                // Field ext/mods/gameserver/enums/ShortcutType.ITEM:Lext/mods/gameserver/enums/ShortcutType;
        43: if_acmpne     113
        46: aload_0
        47: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        50: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        53: aload_3
        54: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
        57: invokevirtual #59                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        60: astore        4
        62: aload         4
        64: ifnull        113
        67: aload         4
        69: invokevirtual #207                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        72: getstatic     #211                // Field ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
        75: if_acmpne     113
        78: aload_0
        79: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        82: aload         4
        84: invokevirtual #217                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        87: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Player.removeAutoSoulShot:(I)Z
        90: ifeq          113
        93: aload_0
        94: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        97: new           #223                // class ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
       100: dup
       101: aload         4
       103: invokevirtual #217                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       106: iconst_0
       107: invokespecial #225                // Method ext/mods/gameserver/network/serverpackets/ExAutoSoulShot."<init>":(II)V
       110: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: aload_0
       114: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       117: new           #231                // class ext/mods/gameserver/network/serverpackets/ShortCutDelete
       120: dup
       121: iload_1
       122: invokespecial #233                // Method ext/mods/gameserver/network/serverpackets/ShortCutDelete."<init>":(I)V
       125: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       128: aload_0
       129: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       132: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
       135: invokeinterface #239,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       140: astore        4
       142: aload         4
       144: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       149: ifeq          187
       152: aload         4
       154: invokeinterface #250,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       159: checkcast     #102                // class java/lang/Integer
       162: invokevirtual #254                // Method java/lang/Integer.intValue:()I
       165: istore        5
       167: aload_0
       168: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       171: new           #223                // class ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
       174: dup
       175: iload         5
       177: iconst_1
       178: invokespecial #225                // Method ext/mods/gameserver/network/serverpackets/ExAutoSoulShot."<init>":(II)V
       181: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       184: goto          142
       187: return
      LineNumberTable:
        line 150: 0
        line 152: 7
        line 153: 19
        line 154: 30
        line 156: 31
        line 157: 36
        line 159: 46
        line 161: 62
        line 162: 93
        line 165: 113
        line 167: 128
        line 168: 167
        line 169: 187
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           62      51     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          167      17     5 shotId   I
            0     188     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;
            0     188     1  slot   I
            0     188     2  page   I
           19     169     3 oldShortcut   Lext/mods/gameserver/model/Shortcut;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/Shortcut ]
        frame_type = 0 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 81
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 44

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=8, args_size=1
         0: aload_0
         1: invokevirtual #261                // Method clear:()V
         4: invokestatic  #139                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         7: astore_1
         8: aload_1
         9: ldc_w         #264                // String SELECT char_obj_id, slot, page, type, id, level FROM character_shortcuts WHERE char_obj_id=? AND class_index=?
        12: invokeinterface #147,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        17: astore_2
        18: aload_2
        19: iconst_1
        20: aload_0
        21: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        27: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        32: aload_2
        33: iconst_2
        34: aload_0
        35: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        38: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        41: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        46: aload_2
        47: invokeinterface #266,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        52: astore_3
        53: aload_3
        54: invokeinterface #270,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        59: ifeq          211
        62: aload_3
        63: ldc_w         #274                // String slot
        66: invokeinterface #276,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        71: istore        4
        73: aload_3
        74: ldc_w         #280                // String page
        77: invokeinterface #276,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        82: istore        5
        84: new           #23                 // class ext/mods/gameserver/model/Shortcut
        87: dup
        88: iload         4
        90: iload         5
        92: ldc           #46                 // class ext/mods/gameserver/enums/ShortcutType
        94: aload_3
        95: ldc_w         #282                // String type
        98: invokeinterface #284,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       103: invokestatic  #288                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       106: checkcast     #46                 // class ext/mods/gameserver/enums/ShortcutType
       109: aload_3
       110: ldc_w         #293                // String id
       113: invokeinterface #276,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       118: aload_3
       119: ldc_w         #295                // String level
       122: invokeinterface #276,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       127: iconst_1
       128: invokespecial #297                // Method ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
       131: astore        6
       133: aload         6
       135: invokevirtual #41                 // Method ext/mods/gameserver/model/Shortcut.getType:()Lext/mods/gameserver/enums/ShortcutType;
       138: getstatic     #203                // Field ext/mods/gameserver/enums/ShortcutType.ITEM:Lext/mods/gameserver/enums/ShortcutType;
       141: if_acmpne     190
       144: aload_0
       145: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       148: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       151: aload         6
       153: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
       156: invokevirtual #59                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       159: astore        7
       161: aload         7
       163: ifnonnull     169
       166: goto          53
       169: aload         7
       171: invokevirtual #65                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEtcItem:()Z
       174: ifeq          190
       177: aload         6
       179: aload         7
       181: invokevirtual #71                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       184: invokevirtual #75                 // Method ext/mods/gameserver/model/item/kind/EtcItem.getSharedReuseGroup:()I
       187: invokevirtual #80                 // Method ext/mods/gameserver/model/Shortcut.setSharedReuseGroup:(I)V
       190: aload_0
       191: iload         4
       193: iload         5
       195: bipush        12
       197: imul
       198: iadd
       199: invokestatic  #101                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       202: aload         6
       204: invokevirtual #131                // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       207: pop
       208: goto          53
       211: aload_3
       212: ifnull        251
       215: aload_3
       216: invokeinterface #300,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       221: goto          251
       224: astore        4
       226: aload_3
       227: ifnull        248
       230: aload_3
       231: invokeinterface #300,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       236: goto          248
       239: astore        5
       241: aload         4
       243: aload         5
       245: invokevirtual #181                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       248: aload         4
       250: athrow
       251: aload_2
       252: ifnull        288
       255: aload_2
       256: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       261: goto          288
       264: astore_3
       265: aload_2
       266: ifnull        286
       269: aload_2
       270: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       275: goto          286
       278: astore        4
       280: aload_3
       281: aload         4
       283: invokevirtual #181                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       286: aload_3
       287: athrow
       288: aload_1
       289: ifnull        323
       292: aload_1
       293: invokeinterface #185,  1          // InterfaceMethod java/sql/Connection.close:()V
       298: goto          323
       301: astore_2
       302: aload_1
       303: ifnull        321
       306: aload_1
       307: invokeinterface #185,  1          // InterfaceMethod java/sql/Connection.close:()V
       312: goto          321
       315: astore_3
       316: aload_2
       317: aload_3
       318: invokevirtual #181                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       321: aload_2
       322: athrow
       323: goto          337
       326: astore_1
       327: getstatic     #188                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       330: ldc_w         #301                // String Couldn\'t restore shortcuts.
       333: aload_1
       334: invokevirtual #194                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       337: return
      Exception table:
         from    to  target type
            53   211   224   Class java/lang/Throwable
           230   236   239   Class java/lang/Throwable
            18   251   264   Class java/lang/Throwable
           269   275   278   Class java/lang/Throwable
             8   288   301   Class java/lang/Throwable
           306   312   315   Class java/lang/Throwable
             4   323   326   Class java/lang/Exception
      LineNumberTable:
        line 193: 0
        line 195: 4
        line 196: 8
        line 198: 18
        line 199: 32
        line 201: 46
        line 203: 53
        line 205: 62
        line 206: 73
        line 207: 84
        line 209: 133
        line 211: 144
        line 212: 161
        line 213: 166
        line 215: 169
        line 216: 177
        line 219: 190
        line 220: 208
        line 221: 211
        line 201: 224
        line 222: 251
        line 195: 264
        line 222: 288
        line 195: 301
        line 226: 323
        line 223: 326
        line 225: 327
        line 227: 337
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          161      29     7  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           73     135     4  slot   I
           84     124     5  page   I
          133      75     6 shortcut   Lext/mods/gameserver/model/Shortcut;
           53     198     3    rs   Ljava/sql/ResultSet;
           18     270     2    ps   Ljava/sql/PreparedStatement;
            8     315     1   con   Ljava/sql/Connection;
          327      10     1     e   Ljava/lang/Exception;
            0     338     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;
      StackMapTable: number_of_entries = 18
        frame_type = 254 /* append */
          offset_delta = 53
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 255 /* full_frame */
          offset_delta = 115
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class ext/mods/gameserver/model/Shortcut, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 20
        frame_type = 248 /* chop */
          offset_delta = 20
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void refreshShortcuts(java.util.function.Predicate<ext.mods.gameserver.model.Shortcut>, int);
    descriptor: (Ljava/util/function/Predicate;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=3
         0: aload_0
         1: invokevirtual #13                 // Method values:()Ljava/util/Collection;
         4: invokeinterface #303,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokeinterface #307,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        15: invokeinterface #313,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        20: astore_3
        21: aload_3
        22: invokeinterface #317,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        27: ifeq          31
        30: return
        31: invokestatic  #139                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        34: astore        4
        36: aload         4
        38: ldc           #145                // String REPLACE INTO character_shortcuts (char_obj_id,slot,page,type,id,level,class_index) values(?,?,?,?,?,?,?)
        40: invokeinterface #147,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        45: astore        5
        47: aload_3
        48: invokeinterface #322,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        53: astore        6
        55: aload         6
        57: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        62: ifeq          217
        65: aload         6
        67: invokeinterface #250,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        72: checkcast     #23                 // class ext/mods/gameserver/model/Shortcut
        75: astore        7
        77: iload_2
        78: ifle          87
        81: aload         7
        83: iload_2
        84: invokevirtual #94                 // Method ext/mods/gameserver/model/Shortcut.setLevel:(I)V
        87: aload_0
        88: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        91: new           #323                // class ext/mods/gameserver/network/serverpackets/ShortCutRegister
        94: dup
        95: aload_0
        96: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        99: aload         7
       101: invokespecial #325                // Method ext/mods/gameserver/network/serverpackets/ShortCutRegister."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Shortcut;)V
       104: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       107: aload         5
       109: iconst_1
       110: aload_0
       111: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       114: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       117: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       122: aload         5
       124: iconst_2
       125: aload         7
       127: invokevirtual #125                // Method ext/mods/gameserver/model/Shortcut.getSlot:()I
       130: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       135: aload         5
       137: iconst_3
       138: aload         7
       140: invokevirtual #128                // Method ext/mods/gameserver/model/Shortcut.getPage:()I
       143: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       148: aload         5
       150: iconst_4
       151: aload         7
       153: invokevirtual #41                 // Method ext/mods/gameserver/model/Shortcut.getType:()Lext/mods/gameserver/enums/ShortcutType;
       156: invokevirtual #162                // Method ext/mods/gameserver/enums/ShortcutType.toString:()Ljava/lang/String;
       159: invokeinterface #166,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       164: aload         5
       166: iconst_5
       167: aload         7
       169: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
       172: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       177: aload         5
       179: bipush        6
       181: aload         7
       183: invokevirtual #93                 // Method ext/mods/gameserver/model/Shortcut.getLevel:()I
       186: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       191: aload         5
       193: bipush        7
       195: aload_0
       196: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
       199: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
       202: invokeinterface #156,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       207: aload         5
       209: invokeinterface #328,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       214: goto          55
       217: aload         5
       219: invokeinterface #331,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       224: pop
       225: aload         5
       227: ifnull        269
       230: aload         5
       232: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       237: goto          269
       240: astore        6
       242: aload         5
       244: ifnull        266
       247: aload         5
       249: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       254: goto          266
       257: astore        7
       259: aload         6
       261: aload         7
       263: invokevirtual #181                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       266: aload         6
       268: athrow
       269: aload         4
       271: ifnull        313
       274: aload         4
       276: invokeinterface #185,  1          // InterfaceMethod java/sql/Connection.close:()V
       281: goto          313
       284: astore        5
       286: aload         4
       288: ifnull        310
       291: aload         4
       293: invokeinterface #185,  1          // InterfaceMethod java/sql/Connection.close:()V
       298: goto          310
       301: astore        6
       303: aload         5
       305: aload         6
       307: invokevirtual #181                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       310: aload         5
       312: athrow
       313: goto          329
       316: astore        4
       318: getstatic     #188                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       321: ldc_w         #335                // String Couldn\'t store shortcuts.
       324: aload         4
       326: invokevirtual #194                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       329: return
      Exception table:
         from    to  target type
            47   225   240   Class java/lang/Throwable
           247   254   257   Class java/lang/Throwable
            36   269   284   Class java/lang/Throwable
           291   298   301   Class java/lang/Throwable
            31   313   316   Class java/lang/Exception
      LineNumberTable:
        line 236: 0
        line 237: 21
        line 238: 30
        line 240: 31
        line 241: 36
        line 243: 47
        line 245: 77
        line 246: 81
        line 248: 87
        line 250: 107
        line 251: 122
        line 252: 135
        line 253: 148
        line 254: 164
        line 255: 177
        line 256: 191
        line 257: 207
        line 258: 214
        line 259: 217
        line 260: 225
        line 240: 240
        line 260: 269
        line 240: 284
        line 264: 313
        line 261: 316
        line 263: 318
        line 265: 329
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           77     137     7     s   Lext/mods/gameserver/model/Shortcut;
           47     222     5    ps   Ljava/sql/PreparedStatement;
           36     277     4   con   Ljava/sql/Connection;
          318      11     4     e   Ljava/lang/Exception;
            0     330     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;
            0     330     1 predicate   Ljava/util/function/Predicate;
            0     330     2 level   I
           21     309     3 shortcuts   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     330     1 predicate   Ljava/util/function/Predicate<Lext/mods/gameserver/model/Shortcut;>;
           21     309     3 shortcuts   Ljava/util/List<Lext/mods/gameserver/model/Shortcut;>;
      StackMapTable: number_of_entries = 14
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class java/util/List ]
        frame_type = 254 /* append */
          offset_delta = 23
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/Shortcut ]
        frame_type = 249 /* chop */
          offset_delta = 129
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class java/util/function/Predicate, int, class java/util/List, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/ShortcutList, class java/util/function/Predicate, int, class java/util/List, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
    Signature: #414                         // (Ljava/util/function/Predicate<Lext/mods/gameserver/model/Shortcut;>;I)V

  public void refreshShortcuts(java.util.function.Predicate<ext.mods.gameserver.model.Shortcut>);
    descriptor: (Ljava/util/function/Predicate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #13                 // Method values:()Ljava/util/Collection;
         4: invokeinterface #303,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokeinterface #307,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        15: aload_0
        16: invokedynamic #337,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/actor/container/player/ShortcutList;)Ljava/util/function/Consumer;
        21: invokeinterface #341,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        26: return
      LineNumberTable:
        line 273: 0
        line 274: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;
            0      27     1 predicate   Ljava/util/function/Predicate;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      27     1 predicate   Ljava/util/function/Predicate<Lext/mods/gameserver/model/Shortcut;>;
    Signature: #416                         // (Ljava/util/function/Predicate<Lext/mods/gameserver/model/Shortcut;>;)V

  public void deleteShortcuts(int, ext.mods.gameserver.enums.ShortcutType);
    descriptor: (ILext/mods/gameserver/enums/ShortcutType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: invokevirtual #13                 // Method values:()Ljava/util/Collection;
         4: invokeinterface #345,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          65
        19: aload_3
        20: invokeinterface #250,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #23                 // class ext/mods/gameserver/model/Shortcut
        28: astore        4
        30: aload         4
        32: invokevirtual #56                 // Method ext/mods/gameserver/model/Shortcut.getId:()I
        35: iload_1
        36: if_icmpne     62
        39: aload         4
        41: invokevirtual #41                 // Method ext/mods/gameserver/model/Shortcut.getType:()Lext/mods/gameserver/enums/ShortcutType;
        44: aload_2
        45: if_acmpne     62
        48: aload_0
        49: aload         4
        51: invokevirtual #125                // Method ext/mods/gameserver/model/Shortcut.getSlot:()I
        54: aload         4
        56: invokevirtual #128                // Method ext/mods/gameserver/model/Shortcut.getPage:()I
        59: invokevirtual #346                // Method deleteShortcut:(II)V
        62: goto          10
        65: return
      LineNumberTable:
        line 283: 0
        line 285: 30
        line 286: 48
        line 287: 62
        line 288: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      32     4 shortcut   Lext/mods/gameserver/model/Shortcut;
            0      66     0  this   Lext/mods/gameserver/model/actor/container/player/ShortcutList;
            0      66     1    id   I
            0      66     2  type   Lext/mods/gameserver/enums/ShortcutType;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #195                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/actor/container/player/ShortcutList
         6: invokevirtual #349                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #354                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #188                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 45: 0
}
Signature: #421                         // Ljava/util/concurrent/ConcurrentSkipListMap<Ljava/lang/Integer;Lext/mods/gameserver/model/Shortcut;>;
SourceFile: "ShortcutList.java"
NestMembers:
  ext/mods/gameserver/model/actor/container/player/ShortcutList$1
BootstrapMethods:
  0: #432 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #426 (Ljava/lang/Object;)V
      #428 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/ShortcutList.lambda$refreshShortcuts$0:(Lext/mods/gameserver/model/Shortcut;)V
      #431 (Lext/mods/gameserver/model/Shortcut;)V
InnerClasses:
  static #36;                             // class ext/mods/gameserver/model/actor/container/player/ShortcutList$1
  public static final #444= #440 of #442; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
