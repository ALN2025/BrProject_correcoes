// Bytecode for: ext.mods.gameserver.model.actor.container.player.MacroList
// File: ext\mods\gameserver\model\actor\container\player\MacroList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/MacroList.class
  Last modified 9 de jul de 2026; size 8122 bytes
  MD5 checksum 38514b90e05769f29946ff7e166b78ad
  Compiled from "MacroList.java"
public class ext.mods.gameserver.model.actor.container.player.MacroList extends java.util.LinkedHashMap<java.lang.Integer, ext.mods.gameserver.model.Macro>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/MacroList
  super_class: #2                         // java/util/LinkedHashMap
  interfaces: 0, fields: 8, methods: 9, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // java/util/LinkedHashMap."<init>":()V
    #2 = Class              #4            // java/util/LinkedHashMap
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/LinkedHashMap
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/player/MacroList._owner:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/player/MacroList
    #9 = NameAndType        #11:#12       // _owner:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/player/MacroList
   #11 = Utf8               _owner
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/container/player/MacroList._revision:I
   #14 = NameAndType        #15:#16       // _revision:I
   #15 = Utf8               _revision
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/actor/container/player/MacroList._macroId:I
   #18 = NameAndType        #19:#16       // _macroId:I
   #19 = Utf8               _macroId
   #20 = Fieldref           #21.#22       // ext/mods/gameserver/model/Macro.id:I
   #21 = Class              #23           // ext/mods/gameserver/model/Macro
   #22 = NameAndType        #24:#16       // id:I
   #23 = Utf8               ext/mods/gameserver/model/Macro
   #24 = Utf8               id
   #25 = Methodref          #26.#27       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #26 = Class              #28           // java/lang/Integer
   #27 = NameAndType        #29:#30       // valueOf:(I)Ljava/lang/Integer;
   #28 = Utf8               java/lang/Integer
   #29 = Utf8               valueOf
   #30 = Utf8               (I)Ljava/lang/Integer;
   #31 = Methodref          #8.#32        // ext/mods/gameserver/model/actor/container/player/MacroList.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #32 = NameAndType        #33:#34       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #33 = Utf8               get
   #34 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #35 = Methodref          #8.#36        // ext/mods/gameserver/model/actor/container/player/MacroList.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #36 = NameAndType        #37:#38       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #37 = Utf8               put
   #38 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #39 = Methodref          #8.#40        // ext/mods/gameserver/model/actor/container/player/MacroList.registerMacroInDb:(Lext/mods/gameserver/model/Macro;)V
   #40 = NameAndType        #41:#42       // registerMacroInDb:(Lext/mods/gameserver/model/Macro;)V
   #41 = Utf8               registerMacroInDb
   #42 = Utf8               (Lext/mods/gameserver/model/Macro;)V
   #43 = Methodref          #8.#44        // ext/mods/gameserver/model/actor/container/player/MacroList.sendUpdate:()V
   #44 = NameAndType        #45:#6        // sendUpdate:()V
   #45 = Utf8               sendUpdate
   #46 = Methodref          #8.#47        // ext/mods/gameserver/model/actor/container/player/MacroList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #47 = NameAndType        #48:#34       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #48 = Utf8               remove
   #49 = Methodref          #8.#50        // ext/mods/gameserver/model/actor/container/player/MacroList.deleteMacroFromDb:(Lext/mods/gameserver/model/Macro;)V
   #50 = NameAndType        #51:#42       // deleteMacroFromDb:(Lext/mods/gameserver/model/Macro;)V
   #51 = Utf8               deleteMacroFromDb
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
   #53 = Class              #55           // ext/mods/gameserver/model/actor/Player
   #54 = NameAndType        #56:#57       // getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
   #55 = Utf8               ext/mods/gameserver/model/actor/Player
   #56 = Utf8               getShortcutList
   #57 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
   #58 = Fieldref           #59.#60       // ext/mods/gameserver/enums/ShortcutType.MACRO:Lext/mods/gameserver/enums/ShortcutType;
   #59 = Class              #61           // ext/mods/gameserver/enums/ShortcutType
   #60 = NameAndType        #62:#63       // MACRO:Lext/mods/gameserver/enums/ShortcutType;
   #61 = Utf8               ext/mods/gameserver/enums/ShortcutType
   #62 = Utf8               MACRO
   #63 = Utf8               Lext/mods/gameserver/enums/ShortcutType;
   #64 = Methodref          #65.#66       // ext/mods/gameserver/model/actor/container/player/ShortcutList.deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
   #65 = Class              #67           // ext/mods/gameserver/model/actor/container/player/ShortcutList
   #66 = NameAndType        #68:#69       // deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
   #67 = Utf8               ext/mods/gameserver/model/actor/container/player/ShortcutList
   #68 = Utf8               deleteShortcuts
   #69 = Utf8               (ILext/mods/gameserver/enums/ShortcutType;)V
   #70 = Methodref          #8.#71        // ext/mods/gameserver/model/actor/container/player/MacroList.isEmpty:()Z
   #71 = NameAndType        #72:#73       // isEmpty:()Z
   #72 = Utf8               isEmpty
   #73 = Utf8               ()Z
   #74 = Class              #75           // ext/mods/gameserver/network/serverpackets/SendMacroList
   #75 = Utf8               ext/mods/gameserver/network/serverpackets/SendMacroList
   #76 = Methodref          #8.#77        // ext/mods/gameserver/model/actor/container/player/MacroList.size:()I
   #77 = NameAndType        #78:#79       // size:()I
   #78 = Utf8               size
   #79 = Utf8               ()I
   #80 = Methodref          #74.#81       // ext/mods/gameserver/network/serverpackets/SendMacroList."<init>":(IILext/mods/gameserver/model/Macro;)V
   #81 = NameAndType        #5:#82        // "<init>":(IILext/mods/gameserver/model/Macro;)V
   #82 = Utf8               (IILext/mods/gameserver/model/Macro;)V
   #83 = Methodref          #53.#84       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #84 = NameAndType        #85:#86       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #85 = Utf8               sendPacket
   #86 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = Methodref          #8.#88        // ext/mods/gameserver/model/actor/container/player/MacroList.values:()Ljava/util/Collection;
   #88 = NameAndType        #89:#90       // values:()Ljava/util/Collection;
   #89 = Utf8               values
   #90 = Utf8               ()Ljava/util/Collection;
   #91 = InterfaceMethodref #92.#93       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #92 = Class              #94           // java/util/Collection
   #93 = NameAndType        #95:#96       // iterator:()Ljava/util/Iterator;
   #94 = Utf8               java/util/Collection
   #95 = Utf8               iterator
   #96 = Utf8               ()Ljava/util/Iterator;
   #97 = InterfaceMethodref #98.#99       // java/util/Iterator.hasNext:()Z
   #98 = Class              #100          // java/util/Iterator
   #99 = NameAndType        #101:#73      // hasNext:()Z
  #100 = Utf8               java/util/Iterator
  #101 = Utf8               hasNext
  #102 = InterfaceMethodref #98.#103      // java/util/Iterator.next:()Ljava/lang/Object;
  #103 = NameAndType        #104:#105     // next:()Ljava/lang/Object;
  #104 = Utf8               next
  #105 = Utf8               ()Ljava/lang/Object;
  #106 = Class              #107          // java/lang/StringBuilder
  #107 = Utf8               java/lang/StringBuilder
  #108 = Methodref          #106.#109     // java/lang/StringBuilder."<init>":(I)V
  #109 = NameAndType        #5:#110       // "<init>":(I)V
  #110 = Utf8               (I)V
  #111 = Fieldref           #21.#112      // ext/mods/gameserver/model/Macro.commands:[Lext/mods/gameserver/model/records/MacroCmd;
  #112 = NameAndType        #113:#114     // commands:[Lext/mods/gameserver/model/records/MacroCmd;
  #113 = Utf8               commands
  #114 = Utf8               [Lext/mods/gameserver/model/records/MacroCmd;
  #115 = Class              #116          // java/lang/Object
  #116 = Utf8               java/lang/Object
  #117 = Methodref          #118.#119     // ext/mods/gameserver/model/records/MacroCmd.type:()I
  #118 = Class              #120          // ext/mods/gameserver/model/records/MacroCmd
  #119 = NameAndType        #121:#79      // type:()I
  #120 = Utf8               ext/mods/gameserver/model/records/MacroCmd
  #121 = Utf8               type
  #122 = String             #123          // ,
  #123 = Utf8               ,
  #124 = Methodref          #118.#125     // ext/mods/gameserver/model/records/MacroCmd.d1:()I
  #125 = NameAndType        #126:#79      // d1:()I
  #126 = Utf8               d1
  #127 = Methodref          #118.#128     // ext/mods/gameserver/model/records/MacroCmd.d2:()I
  #128 = NameAndType        #129:#79      // d2:()I
  #129 = Utf8               d2
  #130 = Methodref          #131.#132     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #131 = Class              #133          // ext/mods/commons/lang/StringUtil
  #132 = NameAndType        #134:#135     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #133 = Utf8               ext/mods/commons/lang/StringUtil
  #134 = Utf8               append
  #135 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #136 = Methodref          #118.#137     // ext/mods/gameserver/model/records/MacroCmd.cmd:()Ljava/lang/String;
  #137 = NameAndType        #138:#139     // cmd:()Ljava/lang/String;
  #138 = Utf8               cmd
  #139 = Utf8               ()Ljava/lang/String;
  #140 = Methodref          #141.#142     // java/lang/String.length:()I
  #141 = Class              #143          // java/lang/String
  #142 = NameAndType        #144:#79      // length:()I
  #143 = Utf8               java/lang/String
  #144 = Utf8               length
  #145 = Methodref          #106.#146     // java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
  #146 = NameAndType        #134:#147     // append:(C)Ljava/lang/StringBuilder;
  #147 = Utf8               (C)Ljava/lang/StringBuilder;
  #148 = Methodref          #106.#142     // java/lang/StringBuilder.length:()I
  #149 = Methodref          #106.#150     // java/lang/StringBuilder.setLength:(I)V
  #150 = NameAndType        #151:#110     // setLength:(I)V
  #151 = Utf8               setLength
  #152 = Methodref          #153.#154     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #153 = Class              #155          // ext/mods/commons/pool/ConnectionPool
  #154 = NameAndType        #156:#157     // getConnection:()Ljava/sql/Connection;
  #155 = Utf8               ext/mods/commons/pool/ConnectionPool
  #156 = Utf8               getConnection
  #157 = Utf8               ()Ljava/sql/Connection;
  #158 = String             #159          // INSERT INTO character_macroses (char_obj_id,id,icon,name,descr,acronym,commands) VALUES (?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE icon=VALUES(icon),name=VALUES(name),descr=VALUES(descr),acronym=VALUES(acronym),commands=VALUES(commands)
  #159 = Utf8               INSERT INTO character_macroses (char_obj_id,id,icon,name,descr,acronym,commands) VALUES (?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE icon=VALUES(icon),name=VALUES(name),descr=VALUES(descr),acronym=VALUES(acronym),commands=VALUES(commands)
  #160 = InterfaceMethodref #161.#162     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #161 = Class              #163          // java/sql/Connection
  #162 = NameAndType        #164:#165     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #163 = Utf8               java/sql/Connection
  #164 = Utf8               prepareStatement
  #165 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #166 = Methodref          #53.#167      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #167 = NameAndType        #168:#79      // getObjectId:()I
  #168 = Utf8               getObjectId
  #169 = InterfaceMethodref #170.#171     // java/sql/PreparedStatement.setInt:(II)V
  #170 = Class              #172          // java/sql/PreparedStatement
  #171 = NameAndType        #173:#174     // setInt:(II)V
  #172 = Utf8               java/sql/PreparedStatement
  #173 = Utf8               setInt
  #174 = Utf8               (II)V
  #175 = Fieldref           #21.#176      // ext/mods/gameserver/model/Macro.icon:I
  #176 = NameAndType        #177:#16      // icon:I
  #177 = Utf8               icon
  #178 = Fieldref           #21.#179      // ext/mods/gameserver/model/Macro.name:Ljava/lang/String;
  #179 = NameAndType        #180:#181     // name:Ljava/lang/String;
  #180 = Utf8               name
  #181 = Utf8               Ljava/lang/String;
  #182 = InterfaceMethodref #170.#183     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #183 = NameAndType        #184:#185     // setString:(ILjava/lang/String;)V
  #184 = Utf8               setString
  #185 = Utf8               (ILjava/lang/String;)V
  #186 = Fieldref           #21.#187      // ext/mods/gameserver/model/Macro.descr:Ljava/lang/String;
  #187 = NameAndType        #188:#181     // descr:Ljava/lang/String;
  #188 = Utf8               descr
  #189 = Fieldref           #21.#190      // ext/mods/gameserver/model/Macro.acronym:Ljava/lang/String;
  #190 = NameAndType        #191:#181     // acronym:Ljava/lang/String;
  #191 = Utf8               acronym
  #192 = Methodref          #106.#193     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #193 = NameAndType        #194:#139     // toString:()Ljava/lang/String;
  #194 = Utf8               toString
  #195 = InterfaceMethodref #170.#196     // java/sql/PreparedStatement.execute:()Z
  #196 = NameAndType        #197:#73      // execute:()Z
  #197 = Utf8               execute
  #198 = InterfaceMethodref #170.#199     // java/sql/PreparedStatement.close:()V
  #199 = NameAndType        #200:#6       // close:()V
  #200 = Utf8               close
  #201 = Class              #202          // java/lang/Throwable
  #202 = Utf8               java/lang/Throwable
  #203 = Methodref          #201.#204     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #204 = NameAndType        #205:#206     // addSuppressed:(Ljava/lang/Throwable;)V
  #205 = Utf8               addSuppressed
  #206 = Utf8               (Ljava/lang/Throwable;)V
  #207 = InterfaceMethodref #161.#199     // java/sql/Connection.close:()V
  #208 = Class              #209          // java/lang/Exception
  #209 = Utf8               java/lang/Exception
  #210 = Fieldref           #8.#211       // ext/mods/gameserver/model/actor/container/player/MacroList.LOGGER:Lext/mods/commons/logging/CLogger;
  #211 = NameAndType        #212:#213     // LOGGER:Lext/mods/commons/logging/CLogger;
  #212 = Utf8               LOGGER
  #213 = Utf8               Lext/mods/commons/logging/CLogger;
  #214 = String             #215          // Couldn\'t store macro.
  #215 = Utf8               Couldn\'t store macro.
  #216 = Methodref          #217.#218     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #217 = Class              #219          // ext/mods/commons/logging/CLogger
  #218 = NameAndType        #220:#221     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #219 = Utf8               ext/mods/commons/logging/CLogger
  #220 = Utf8               error
  #221 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #222 = String             #223          // DELETE FROM character_macroses WHERE char_obj_id=? AND id=?
  #223 = Utf8               DELETE FROM character_macroses WHERE char_obj_id=? AND id=?
  #224 = String             #225          // Couldn\'t delete macro.
  #225 = Utf8               Couldn\'t delete macro.
  #226 = Methodref          #2.#227       // java/util/LinkedHashMap.clear:()V
  #227 = NameAndType        #228:#6       // clear:()V
  #228 = Utf8               clear
  #229 = String             #230          // SELECT char_obj_id, id, icon, name, descr, acronym, commands FROM character_macroses WHERE char_obj_id=?
  #230 = Utf8               SELECT char_obj_id, id, icon, name, descr, acronym, commands FROM character_macroses WHERE char_obj_id=?
  #231 = InterfaceMethodref #170.#232     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #232 = NameAndType        #233:#234     // executeQuery:()Ljava/sql/ResultSet;
  #233 = Utf8               executeQuery
  #234 = Utf8               ()Ljava/sql/ResultSet;
  #235 = InterfaceMethodref #236.#237     // java/sql/ResultSet.next:()Z
  #236 = Class              #238          // java/sql/ResultSet
  #237 = NameAndType        #104:#73      // next:()Z
  #238 = Utf8               java/sql/ResultSet
  #239 = String             #24           // id
  #240 = InterfaceMethodref #236.#241     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #241 = NameAndType        #242:#243     // getInt:(Ljava/lang/String;)I
  #242 = Utf8               getInt
  #243 = Utf8               (Ljava/lang/String;)I
  #244 = String             #177          // icon
  #245 = String             #180          // name
  #246 = InterfaceMethodref #236.#247     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #247 = NameAndType        #248:#249     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #248 = Utf8               getString
  #249 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #250 = String             #188          // descr
  #251 = String             #191          // acronym
  #252 = Class              #253          // java/util/ArrayList
  #253 = Utf8               java/util/ArrayList
  #254 = Methodref          #252.#3       // java/util/ArrayList."<init>":()V
  #255 = Class              #256          // java/util/StringTokenizer
  #256 = Utf8               java/util/StringTokenizer
  #257 = String             #113          // commands
  #258 = String             #259          // ;
  #259 = Utf8               ;
  #260 = Methodref          #255.#261     // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #261 = NameAndType        #5:#262       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #262 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #263 = Methodref          #255.#264     // java/util/StringTokenizer.hasMoreTokens:()Z
  #264 = NameAndType        #265:#73      // hasMoreTokens:()Z
  #265 = Utf8               hasMoreTokens
  #266 = Methodref          #255.#267     // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #267 = NameAndType        #268:#139     // nextToken:()Ljava/lang/String;
  #268 = Utf8               nextToken
  #269 = Methodref          #255.#270     // java/util/StringTokenizer.countTokens:()I
  #270 = NameAndType        #271:#79      // countTokens:()I
  #271 = Utf8               countTokens
  #272 = Methodref          #26.#273      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #273 = NameAndType        #274:#243     // parseInt:(Ljava/lang/String;)I
  #274 = Utf8               parseInt
  #275 = String             #276          //
  #276 = Utf8
  #277 = InterfaceMethodref #278.#77      // java/util/List.size:()I
  #278 = Class              #279          // java/util/List
  #279 = Utf8               java/util/List
  #280 = Methodref          #118.#281     // ext/mods/gameserver/model/records/MacroCmd."<init>":(IIIILjava/lang/String;)V
  #281 = NameAndType        #5:#282       // "<init>":(IIIILjava/lang/String;)V
  #282 = Utf8               (IIIILjava/lang/String;)V
  #283 = InterfaceMethodref #278.#284     // java/util/List.add:(Ljava/lang/Object;)Z
  #284 = NameAndType        #285:#286     // add:(Ljava/lang/Object;)Z
  #285 = Utf8               add
  #286 = Utf8               (Ljava/lang/Object;)Z
  #287 = InterfaceMethodref #278.#288     // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #288 = NameAndType        #289:#290     // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #289 = Utf8               toArray
  #290 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
  #291 = Class              #114          // "[Lext/mods/gameserver/model/records/MacroCmd;"
  #292 = Methodref          #21.#293      // ext/mods/gameserver/model/Macro."<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
  #293 = NameAndType        #5:#294       // "<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
  #294 = Utf8               (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
  #295 = InterfaceMethodref #236.#199     // java/sql/ResultSet.close:()V
  #296 = String             #297          // Couldn\'t load macros.
  #297 = Utf8               Couldn\'t load macros.
  #298 = Methodref          #299.#300     // java/lang/Class.getName:()Ljava/lang/String;
  #299 = Class              #301          // java/lang/Class
  #300 = NameAndType        #302:#139     // getName:()Ljava/lang/String;
  #301 = Utf8               java/lang/Class
  #302 = Utf8               getName
  #303 = Methodref          #217.#304     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #304 = NameAndType        #5:#305       // "<init>":(Ljava/lang/String;)V
  #305 = Utf8               (Ljava/lang/String;)V
  #306 = Utf8               serialVersionUID
  #307 = Utf8               J
  #308 = Utf8               ConstantValue
  #309 = Long               1l
  #311 = Utf8               INSERT_OR_UPDATE_MACRO
  #312 = Utf8               DELETE_MACRO
  #313 = Utf8               LOAD_MACROS
  #314 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #315 = Utf8               Code
  #316 = Utf8               LineNumberTable
  #317 = Utf8               LocalVariableTable
  #318 = Utf8               this
  #319 = Utf8               Lext/mods/gameserver/model/actor/container/player/MacroList;
  #320 = Utf8               owner
  #321 = Utf8               getRevision
  #322 = Utf8               registerMacro
  #323 = Utf8               macro
  #324 = Utf8               Lext/mods/gameserver/model/Macro;
  #325 = Utf8               StackMapTable
  #326 = Utf8               deleteMacro
  #327 = Utf8               Lext/mods/gameserver/model/records/MacroCmd;
  #328 = Utf8               ps
  #329 = Utf8               Ljava/sql/PreparedStatement;
  #330 = Utf8               con
  #331 = Utf8               Ljava/sql/Connection;
  #332 = Utf8               e
  #333 = Utf8               Ljava/lang/Exception;
  #334 = Utf8               sb
  #335 = Utf8               Ljava/lang/StringBuilder;
  #336 = Utf8               restore
  #337 = Utf8               st
  #338 = Utf8               Ljava/util/StringTokenizer;
  #339 = Utf8               mcmd
  #340 = Utf8               Ljava/util/List;
  #341 = Utf8               st1
  #342 = Utf8               rs
  #343 = Utf8               Ljava/sql/ResultSet;
  #344 = Utf8               LocalVariableTypeTable
  #345 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/MacroCmd;>;
  #346 = Utf8               <clinit>
  #347 = Utf8               Signature
  #348 = Utf8               Ljava/util/LinkedHashMap<Ljava/lang/Integer;Lext/mods/gameserver/model/Macro;>;
  #349 = Utf8               SourceFile
  #350 = Utf8               MacroList.java
{
  public ext.mods.gameserver.model.actor.container.player.MacroList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/LinkedHashMap."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
         9: aload_0
        10: iconst_1
        11: putfield      #13                 // Field _revision:I
        14: aload_0
        15: sipush        1000
        18: putfield      #17                 // Field _macroId:I
        21: return
      LineNumberTable:
        line 57: 0
        line 58: 4
        line 59: 9
        line 60: 14
        line 61: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/container/player/MacroList;
            0      22     1 owner   Lext/mods/gameserver/model/actor/Player;

  public int getRevision();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _revision:I
         4: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/MacroList;

  public void registerMacro(ext.mods.gameserver.model.Macro);
    descriptor: (Lext/mods/gameserver/model/Macro;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: getfield      #20                 // Field ext/mods/gameserver/model/Macro.id:I
         4: ifne          54
         7: aload_1
         8: aload_0
         9: dup
        10: getfield      #17                 // Field _macroId:I
        13: dup_x1
        14: iconst_1
        15: iadd
        16: putfield      #17                 // Field _macroId:I
        19: putfield      #20                 // Field ext/mods/gameserver/model/Macro.id:I
        22: aload_0
        23: aload_1
        24: getfield      #20                 // Field ext/mods/gameserver/model/Macro.id:I
        27: invokestatic  #25                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        30: invokevirtual #31                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
        33: ifnull        54
        36: aload_1
        37: aload_0
        38: dup
        39: getfield      #17                 // Field _macroId:I
        42: dup_x1
        43: iconst_1
        44: iadd
        45: putfield      #17                 // Field _macroId:I
        48: putfield      #20                 // Field ext/mods/gameserver/model/Macro.id:I
        51: goto          22
        54: aload_0
        55: aload_1
        56: getfield      #20                 // Field ext/mods/gameserver/model/Macro.id:I
        59: invokestatic  #25                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        62: aload_1
        63: invokevirtual #35                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        66: pop
        67: aload_0
        68: aload_1
        69: invokevirtual #39                 // Method registerMacroInDb:(Lext/mods/gameserver/model/Macro;)V
        72: aload_0
        73: invokevirtual #43                 // Method sendUpdate:()V
        76: return
      LineNumberTable:
        line 74: 0
        line 76: 7
        line 78: 22
        line 79: 36
        line 82: 54
        line 84: 67
        line 86: 72
        line 87: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      77     0  this   Lext/mods/gameserver/model/actor/container/player/MacroList;
            0      77     1 macro   Lext/mods/gameserver/model/Macro;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 31 /* same */

  public void deleteMacro(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: iload_1
         2: invokestatic  #25                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         5: invokevirtual #46                 // Method remove:(Ljava/lang/Object;)Ljava/lang/Object;
         8: checkcast     #21                 // class ext/mods/gameserver/model/Macro
        11: astore_2
        12: aload_2
        13: ifnonnull     17
        16: return
        17: aload_0
        18: aload_2
        19: invokevirtual #49                 // Method deleteMacroFromDb:(Lext/mods/gameserver/model/Macro;)V
        22: aload_0
        23: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        26: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
        29: iload_1
        30: getstatic     #58                 // Field ext/mods/gameserver/enums/ShortcutType.MACRO:Lext/mods/gameserver/enums/ShortcutType;
        33: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
        36: aload_0
        37: invokevirtual #43                 // Method sendUpdate:()V
        40: return
      LineNumberTable:
        line 95: 0
        line 96: 12
        line 97: 16
        line 99: 17
        line 101: 22
        line 103: 36
        line 104: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/container/player/MacroList;
            0      41     1    id   I
           12      29     2 macro   Lext/mods/gameserver/model/Macro;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/Macro ]

  public void sendUpdate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: dup
         2: getfield      #13                 // Field _revision:I
         5: iconst_1
         6: iadd
         7: putfield      #13                 // Field _revision:I
        10: aload_0
        11: invokevirtual #70                 // Method isEmpty:()Z
        14: ifeq          43
        17: aload_0
        18: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        21: new           #74                 // class ext/mods/gameserver/network/serverpackets/SendMacroList
        24: dup
        25: aload_0
        26: getfield      #13                 // Field _revision:I
        29: aload_0
        30: invokevirtual #76                 // Method size:()I
        33: aconst_null
        34: invokespecial #80                 // Method ext/mods/gameserver/network/serverpackets/SendMacroList."<init>":(IILext/mods/gameserver/model/Macro;)V
        37: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        40: goto          98
        43: aload_0
        44: invokevirtual #87                 // Method values:()Ljava/util/Collection;
        47: invokeinterface #91,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        52: astore_1
        53: aload_1
        54: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        59: ifeq          98
        62: aload_1
        63: invokeinterface #102,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        68: checkcast     #21                 // class ext/mods/gameserver/model/Macro
        71: astore_2
        72: aload_0
        73: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        76: new           #74                 // class ext/mods/gameserver/network/serverpackets/SendMacroList
        79: dup
        80: aload_0
        81: getfield      #13                 // Field _revision:I
        84: aload_0
        85: invokevirtual #76                 // Method size:()I
        88: aload_2
        89: invokespecial #80                 // Method ext/mods/gameserver/network/serverpackets/SendMacroList."<init>":(IILext/mods/gameserver/model/Macro;)V
        92: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        95: goto          53
        98: return
      LineNumberTable:
        line 111: 0
        line 113: 10
        line 114: 17
        line 117: 43
        line 118: 72
        line 120: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           72      23     2 macro   Lext/mods/gameserver/model/Macro;
            0      99     0  this   Lext/mods/gameserver/model/actor/container/player/MacroList;
      StackMapTable: number_of_entries = 3
        frame_type = 43 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 44

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=17, args_size=1
         0: aload_0
         1: invokespecial #226                // Method java/util/LinkedHashMap.clear:()V
         4: invokestatic  #152                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         7: astore_1
         8: aload_1
         9: ldc           #229                // String SELECT char_obj_id, id, icon, name, descr, acronym, commands FROM character_macroses WHERE char_obj_id=?
        11: invokeinterface #160,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        16: astore_2
        17: aload_2
        18: iconst_1
        19: aload_0
        20: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        23: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        26: invokeinterface #169,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        31: aload_2
        32: invokeinterface #231,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        37: astore_3
        38: aload_3
        39: invokeinterface #235,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        44: ifeq          307
        47: aload_3
        48: ldc           #239                // String id
        50: invokeinterface #240,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        55: istore        4
        57: aload_3
        58: ldc           #244                // String icon
        60: invokeinterface #240,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        65: istore        5
        67: aload_3
        68: ldc           #245                // String name
        70: invokeinterface #246,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        75: astore        6
        77: aload_3
        78: ldc           #250                // String descr
        80: invokeinterface #246,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        85: astore        7
        87: aload_3
        88: ldc           #251                // String acronym
        90: invokeinterface #246,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        95: astore        8
        97: new           #252                // class java/util/ArrayList
       100: dup
       101: invokespecial #254                // Method java/util/ArrayList."<init>":()V
       104: astore        9
       106: new           #255                // class java/util/StringTokenizer
       109: dup
       110: aload_3
       111: ldc_w         #257                // String commands
       114: invokeinterface #246,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       119: ldc_w         #258                // String ;
       122: invokespecial #260                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       125: astore        10
       127: aload         10
       129: invokevirtual #263                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       132: ifeq          250
       135: new           #255                // class java/util/StringTokenizer
       138: dup
       139: aload         10
       141: invokevirtual #266                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       144: ldc           #122                // String ,
       146: invokespecial #260                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       149: astore        11
       151: aload         11
       153: invokevirtual #269                // Method java/util/StringTokenizer.countTokens:()I
       156: iconst_3
       157: if_icmpge     163
       160: goto          127
       163: aload         11
       165: invokevirtual #266                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       168: invokestatic  #272                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       171: istore        12
       173: aload         11
       175: invokevirtual #266                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       178: invokestatic  #272                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       181: istore        13
       183: aload         11
       185: invokevirtual #266                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       188: invokestatic  #272                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       191: istore        14
       193: ldc_w         #275                // String
       196: astore        15
       198: aload         11
       200: invokevirtual #263                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       203: ifeq          213
       206: aload         11
       208: invokevirtual #266                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       211: astore        15
       213: new           #118                // class ext/mods/gameserver/model/records/MacroCmd
       216: dup
       217: aload         9
       219: invokeinterface #277,  1          // InterfaceMethod java/util/List.size:()I
       224: iload         12
       226: iload         13
       228: iload         14
       230: aload         15
       232: invokespecial #280                // Method ext/mods/gameserver/model/records/MacroCmd."<init>":(IIIILjava/lang/String;)V
       235: astore        16
       237: aload         9
       239: aload         16
       241: invokeinterface #283,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       246: pop
       247: goto          127
       250: new           #21                 // class ext/mods/gameserver/model/Macro
       253: dup
       254: iload         4
       256: iload         5
       258: aload         6
       260: aload         7
       262: aload         8
       264: aload         9
       266: aload         9
       268: invokeinterface #277,  1          // InterfaceMethod java/util/List.size:()I
       273: anewarray     #118                // class ext/mods/gameserver/model/records/MacroCmd
       276: invokeinterface #287,  2          // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       281: checkcast     #291                // class "[Lext/mods/gameserver/model/records/MacroCmd;"
       284: invokespecial #292                // Method ext/mods/gameserver/model/Macro."<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
       287: astore        11
       289: aload_0
       290: aload         11
       292: getfield      #20                 // Field ext/mods/gameserver/model/Macro.id:I
       295: invokestatic  #25                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       298: aload         11
       300: invokevirtual #35                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       303: pop
       304: goto          38
       307: aload_3
       308: ifnull        347
       311: aload_3
       312: invokeinterface #295,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       317: goto          347
       320: astore        4
       322: aload_3
       323: ifnull        344
       326: aload_3
       327: invokeinterface #295,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       332: goto          344
       335: astore        5
       337: aload         4
       339: aload         5
       341: invokevirtual #203                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       344: aload         4
       346: athrow
       347: aload_2
       348: ifnull        384
       351: aload_2
       352: invokeinterface #198,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       357: goto          384
       360: astore_3
       361: aload_2
       362: ifnull        382
       365: aload_2
       366: invokeinterface #198,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       371: goto          382
       374: astore        4
       376: aload_3
       377: aload         4
       379: invokevirtual #203                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       382: aload_3
       383: athrow
       384: aload_1
       385: ifnull        419
       388: aload_1
       389: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       394: goto          419
       397: astore_2
       398: aload_1
       399: ifnull        417
       402: aload_1
       403: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       408: goto          417
       411: astore_3
       412: aload_2
       413: aload_3
       414: invokevirtual #203                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       417: aload_2
       418: athrow
       419: goto          433
       422: astore_1
       423: getstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       426: ldc_w         #296                // String Couldn\'t load macros.
       429: aload_1
       430: invokevirtual #216                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       433: return
      Exception table:
         from    to  target type
            38   307   320   Class java/lang/Throwable
           326   332   335   Class java/lang/Throwable
            17   347   360   Class java/lang/Throwable
           365   371   374   Class java/lang/Throwable
             8   384   397   Class java/lang/Throwable
           402   408   411   Class java/lang/Throwable
             4   419   422   Class java/lang/Exception
      LineNumberTable:
        line 183: 0
        line 185: 4
        line 186: 8
        line 188: 17
        line 190: 31
        line 192: 38
        line 194: 47
        line 195: 57
        line 196: 67
        line 197: 77
        line 198: 87
        line 200: 97
        line 201: 106
        line 203: 127
        line 205: 135
        line 206: 151
        line 207: 160
        line 209: 163
        line 210: 173
        line 211: 183
        line 213: 193
        line 214: 198
        line 215: 206
        line 217: 213
        line 218: 237
        line 219: 247
        line 221: 250
        line 222: 289
        line 223: 304
        line 224: 307
        line 190: 320
        line 225: 347
        line 185: 360
        line 225: 384
        line 185: 397
        line 229: 419
        line 226: 422
        line 228: 423
        line 230: 433
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          151      96    11    st   Ljava/util/StringTokenizer;
          173      74    12  type   I
          183      64    13    d1   I
          193      54    14    d2   I
          198      49    15   cmd   Ljava/lang/String;
          237      10    16  mcmd   Lext/mods/gameserver/model/records/MacroCmd;
           57     247     4    id   I
           67     237     5  icon   I
           77     227     6  name   Ljava/lang/String;
           87     217     7 descr   Ljava/lang/String;
           97     207     8 acronym   Ljava/lang/String;
          106     198     9 commands   Ljava/util/List;
          127     177    10   st1   Ljava/util/StringTokenizer;
          289      15    11 macro   Lext/mods/gameserver/model/Macro;
           38     309     3    rs   Ljava/sql/ResultSet;
           17     367     2    ps   Ljava/sql/PreparedStatement;
            8     411     1   con   Ljava/sql/Connection;
          423      10     1     e   Ljava/lang/Exception;
            0     434     0  this   Lext/mods/gameserver/model/actor/container/player/MacroList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          106     198     9 commands   Ljava/util/List<Lext/mods/gameserver/model/records/MacroCmd;>;
      StackMapTable: number_of_entries = 20
        frame_type = 254 /* append */
          offset_delta = 38
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 255 /* full_frame */
          offset_delta = 88
          locals = [ class ext/mods/gameserver/model/actor/container/player/MacroList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/lang/String, class java/lang/String, class java/lang/String, class java/util/List, class java/util/StringTokenizer ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class java/util/StringTokenizer ]
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/actor/container/player/MacroList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/lang/String, class java/lang/String, class java/lang/String, class java/util/List, class java/util/StringTokenizer, class java/util/StringTokenizer, int, int, int, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/container/player/MacroList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/lang/String, class java/lang/String, class java/lang/String, class java/util/List, class java/util/StringTokenizer ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/actor/container/player/MacroList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/MacroList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/MacroList, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/MacroList, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #217                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/actor/container/player/MacroList
         6: invokevirtual #298                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #303                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 45: 0
}
Signature: #348                         // Ljava/util/LinkedHashMap<Ljava/lang/Integer;Lext/mods/gameserver/model/Macro;>;
SourceFile: "MacroList.java"
