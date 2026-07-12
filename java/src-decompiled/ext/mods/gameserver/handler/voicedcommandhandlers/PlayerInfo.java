// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.PlayerInfo
// File: ext\mods\gameserver\handler\voicedcommandhandlers\PlayerInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo.class
  Last modified 9 de jul de 2026; size 7127 bytes
  MD5 checksum 37e1753637f96f20f901cb393d8ab3dd
  Compiled from "PlayerInfo.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.PlayerInfo implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #287                        // ext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getTarget
   #12 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #13 = String             #14           // Você precisa selecionar um jogador como alvo.
   #14 = Utf8               Você precisa selecionar um jogador como alvo.
   #15 = Methodref          #8.#16        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #16 = NameAndType        #17:#18       // sendMessage:(Ljava/lang/String;)V
   #17 = Utf8               sendMessage
   #18 = Utf8               (Ljava/lang/String;)V
   #19 = Class              #20           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #20 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #21 = Methodref          #19.#22       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #22 = NameAndType        #5:#23        // "<init>":(I)V
   #23 = Utf8               (I)V
   #24 = Class              #25           // java/lang/StringBuilder
   #25 = Utf8               java/lang/StringBuilder
   #26 = Methodref          #24.#3        // java/lang/StringBuilder."<init>":()V
   #27 = String             #28           // <html><title>Player Info</title><body>
   #28 = Utf8               <html><title>Player Info</title><body>
   #29 = Methodref          #24.#30       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #30 = NameAndType        #31:#32       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #31 = Utf8               append
   #32 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #33 = String             #34           // <font color=LEVEL><b>
   #34 = Utf8               <font color=LEVEL><b>
   #35 = Methodref          #8.#36        // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #36 = NameAndType        #37:#38       // getName:()Ljava/lang/String;
   #37 = Utf8               getName
   #38 = Utf8               ()Ljava/lang/String;
   #39 = String             #40           // </b></font><br><br>
   #40 = Utf8               </b></font><br><br>
   #41 = String             #42           // <center><table width=300><tr>
   #42 = Utf8               <center><table width=300><tr>
   #43 = String             #44           // <td><button value=\"Status\" action=\"bypass -h voiced_info\" width=100 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
   #44 = Utf8               <td><button value=\"Status\" action=\"bypass -h voiced_info\" width=100 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
   #45 = String             #46           // <td><button value=\"Equipamentos\" action=\"bypass -h voiced_item\" width=100 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
   #46 = Utf8               <td><button value=\"Equipamentos\" action=\"bypass -h voiced_item\" width=100 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
   #47 = String             #48           // </tr></table></center><br>
   #48 = Utf8               </tr></table></center><br>
   #49 = String             #50           // info
   #50 = Utf8               info
   #51 = Methodref          #52.#53       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #52 = Class              #54           // java/lang/String
   #53 = NameAndType        #55:#56       // equals:(Ljava/lang/Object;)Z
   #54 = Utf8               java/lang/String
   #55 = Utf8               equals
   #56 = Utf8               (Ljava/lang/Object;)Z
   #57 = String             #58           // <table width=300 bgcolor=000000>
   #58 = Utf8               <table width=300 bgcolor=000000>
   #59 = String             #60           // <tr><td width=120><font color=LEVEL>HP:</font></td><td>
   #60 = Utf8               <tr><td width=120><font color=LEVEL>HP:</font></td><td>
   #61 = Methodref          #8.#62        // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #62 = NameAndType        #63:#64       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #63 = Utf8               getStatus
   #64 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
   #66 = Class              #68           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #67 = NameAndType        #69:#70       // getHp:()D
   #68 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #69 = Utf8               getHp
   #70 = Utf8               ()D
   #71 = Methodref          #24.#72       // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
   #72 = NameAndType        #31:#73       // append:(I)Ljava/lang/StringBuilder;
   #73 = Utf8               (I)Ljava/lang/StringBuilder;
   #74 = String             #75           //  /
   #75 = Utf8                /
   #76 = Methodref          #66.#77       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
   #77 = NameAndType        #78:#79       // getMaxHp:()I
   #78 = Utf8               getMaxHp
   #79 = Utf8               ()I
   #80 = String             #81           // </td></tr>
   #81 = Utf8               </td></tr>
   #82 = String             #83           // <tr><td><font color=LEVEL>MP:</font></td><td>
   #83 = Utf8               <tr><td><font color=LEVEL>MP:</font></td><td>
   #84 = Methodref          #66.#85       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
   #85 = NameAndType        #86:#70       // getMp:()D
   #86 = Utf8               getMp
   #87 = Methodref          #66.#88       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
   #88 = NameAndType        #89:#79       // getMaxMp:()I
   #89 = Utf8               getMaxMp
   #90 = String             #91           // <tr><td><font color=LEVEL>CP:</font></td><td>
   #91 = Utf8               <tr><td><font color=LEVEL>CP:</font></td><td>
   #92 = Methodref          #66.#93       // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
   #93 = NameAndType        #94:#70       // getCp:()D
   #94 = Utf8               getCp
   #95 = Methodref          #66.#96       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
   #96 = NameAndType        #97:#79       // getMaxCp:()I
   #97 = Utf8               getMaxCp
   #98 = String             #99           // <tr><td><font color=LEVEL>Level:</font></td><td>
   #99 = Utf8               <tr><td><font color=LEVEL>Level:</font></td><td>
  #100 = Methodref          #66.#101      // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #101 = NameAndType        #102:#79      // getLevel:()I
  #102 = Utf8               getLevel
  #103 = String             #104          // <tr><td><font color=LEVEL>Classe:</font></td><td>
  #104 = Utf8               <tr><td><font color=LEVEL>Classe:</font></td><td>
  #105 = Methodref          #8.#106       // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #106 = NameAndType        #107:#108     // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #107 = Utf8               getTemplate
  #108 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #109 = Methodref          #110.#111     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
  #110 = Class              #112          // ext/mods/gameserver/model/actor/template/PlayerTemplate
  #111 = NameAndType        #113:#38      // getClassName:()Ljava/lang/String;
  #112 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
  #113 = Utf8               getClassName
  #114 = String             #115          // <tr><td><font color=LEVEL>P. Atk:</font></td><td>
  #115 = Utf8               <tr><td><font color=LEVEL>P. Atk:</font></td><td>
  #116 = Methodref          #66.#117      // ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #117 = NameAndType        #118:#119     // getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #118 = Utf8               getPAtk
  #119 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
  #120 = String             #121          // <tr><td><font color=LEVEL>M. Atk:</font></td><td>
  #121 = Utf8               <tr><td><font color=LEVEL>M. Atk:</font></td><td>
  #122 = Methodref          #66.#123      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #123 = NameAndType        #124:#125     // getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #124 = Utf8               getMAtk
  #125 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #126 = String             #127          // <tr><td><font color=LEVEL>P. Def:</font></td><td>
  #127 = Utf8               <tr><td><font color=LEVEL>P. Def:</font></td><td>
  #128 = Methodref          #66.#129      // ext/mods/gameserver/model/actor/status/PlayerStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
  #129 = NameAndType        #130:#119     // getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
  #130 = Utf8               getPDef
  #131 = String             #132          // <tr><td><font color=LEVEL>M. Def:</font></td><td>
  #132 = Utf8               <tr><td><font color=LEVEL>M. Def:</font></td><td>
  #133 = Methodref          #66.#134      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #134 = NameAndType        #135:#125     // getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #135 = Utf8               getMDef
  #136 = String             #137          // <tr><td><font color=LEVEL>P. atkSpeed:</font></td><td>
  #137 = Utf8               <tr><td><font color=LEVEL>P. atkSpeed:</font></td><td>
  #138 = Methodref          #66.#139      // ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtkSpd:()I
  #139 = NameAndType        #140:#79      // getPAtkSpd:()I
  #140 = Utf8               getPAtkSpd
  #141 = String             #142          // <tr><td><font color=LEVEL>C. Speed:</font></td><td>
  #142 = Utf8               <tr><td><font color=LEVEL>C. Speed:</font></td><td>
  #143 = Methodref          #66.#144      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtkSpd:()I
  #144 = NameAndType        #145:#79      // getMAtkSpd:()I
  #145 = Utf8               getMAtkSpd
  #146 = String             #147          // <tr><td><font color=LEVEL>STR:</font></td><td>
  #147 = Utf8               <tr><td><font color=LEVEL>STR:</font></td><td>
  #148 = Methodref          #66.#149      // ext/mods/gameserver/model/actor/status/PlayerStatus.getSTR:()I
  #149 = NameAndType        #150:#79      // getSTR:()I
  #150 = Utf8               getSTR
  #151 = String             #152          // <tr><td><font color=LEVEL>CON:</font></td><td>
  #152 = Utf8               <tr><td><font color=LEVEL>CON:</font></td><td>
  #153 = Methodref          #66.#154      // ext/mods/gameserver/model/actor/status/PlayerStatus.getCON:()I
  #154 = NameAndType        #155:#79      // getCON:()I
  #155 = Utf8               getCON
  #156 = String             #157          // <tr><td><font color=LEVEL>DEX:</font></td><td>
  #157 = Utf8               <tr><td><font color=LEVEL>DEX:</font></td><td>
  #158 = Methodref          #66.#159      // ext/mods/gameserver/model/actor/status/PlayerStatus.getDEX:()I
  #159 = NameAndType        #160:#79      // getDEX:()I
  #160 = Utf8               getDEX
  #161 = String             #162          // <tr><td><font color=LEVEL>INT:</font></td><td>
  #162 = Utf8               <tr><td><font color=LEVEL>INT:</font></td><td>
  #163 = Methodref          #66.#164      // ext/mods/gameserver/model/actor/status/PlayerStatus.getINT:()I
  #164 = NameAndType        #165:#79      // getINT:()I
  #165 = Utf8               getINT
  #166 = String             #167          // <tr><td><font color=LEVEL>MEN:</font></td><td>
  #167 = Utf8               <tr><td><font color=LEVEL>MEN:</font></td><td>
  #168 = Methodref          #66.#169      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMEN:()I
  #169 = NameAndType        #170:#79      // getMEN:()I
  #170 = Utf8               getMEN
  #171 = String             #172          // <tr><td><font color=LEVEL>WIT:</font></td><td>
  #172 = Utf8               <tr><td><font color=LEVEL>WIT:</font></td><td>
  #173 = Methodref          #66.#174      // ext/mods/gameserver/model/actor/status/PlayerStatus.getWIT:()I
  #174 = NameAndType        #175:#79      // getWIT:()I
  #175 = Utf8               getWIT
  #176 = String             #177          // </table>
  #177 = Utf8               </table>
  #178 = String             #179          // item
  #179 = Utf8               item
  #180 = Methodref          #52.#181      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #181 = NameAndType        #182:#183     // startsWith:(Ljava/lang/String;)Z
  #182 = Utf8               startsWith
  #183 = Utf8               (Ljava/lang/String;)Z
  #184 = String             #185          //
  #185 = Utf8
  #186 = Methodref          #52.#187      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #187 = NameAndType        #188:#189     // contains:(Ljava/lang/CharSequence;)Z
  #188 = Utf8               contains
  #189 = Utf8               (Ljava/lang/CharSequence;)Z
  #190 = Methodref          #52.#191      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #191 = NameAndType        #192:#193     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #192 = Utf8               split
  #193 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #194 = Methodref          #195.#196     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #195 = Class              #197          // java/lang/Integer
  #196 = NameAndType        #198:#199     // parseInt:(Ljava/lang/String;)I
  #197 = Utf8               java/lang/Integer
  #198 = Utf8               parseInt
  #199 = Utf8               (Ljava/lang/String;)I
  #200 = Class              #201          // java/lang/Exception
  #201 = Utf8               java/lang/Exception
  #202 = Methodref          #8.#203       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #203 = NameAndType        #204:#205     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #204 = Utf8               getInventory
  #205 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #206 = Methodref          #207.#208     // ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
  #207 = Class              #209          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #208 = NameAndType        #210:#211     // getPaperdollItems:()Ljava/util/List;
  #209 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #210 = Utf8               getPaperdollItems
  #211 = Utf8               ()Ljava/util/List;
  #212 = InterfaceMethodref #213.#214     // java/util/List.size:()I
  #213 = Class              #215          // java/util/List
  #214 = NameAndType        #216:#79      // size:()I
  #215 = Utf8               java/util/List
  #216 = Utf8               size
  #217 = Methodref          #218.#219     // java/lang/Math.ceil:(D)D
  #218 = Class              #220          // java/lang/Math
  #219 = NameAndType        #221:#222     // ceil:(D)D
  #220 = Utf8               java/lang/Math
  #221 = Utf8               ceil
  #222 = Utf8               (D)D
  #223 = Methodref          #218.#224     // java/lang/Math.min:(II)I
  #224 = NameAndType        #225:#226     // min:(II)I
  #225 = Utf8               min
  #226 = Utf8               (II)I
  #227 = InterfaceMethodref #213.#228     // java/util/List.get:(I)Ljava/lang/Object;
  #228 = NameAndType        #229:#230     // get:(I)Ljava/lang/Object;
  #229 = Utf8               get
  #230 = Utf8               (I)Ljava/lang/Object;
  #231 = Class              #232          // ext/mods/gameserver/model/item/instance/ItemInstance
  #232 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #233 = String             #234          // <tr>
  #234 = Utf8               <tr>
  #235 = String             #236          // <td width=40><img src=\"
  #236 = Utf8               <td width=40><img src=\"
  #237 = Methodref          #231.#238     // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #238 = NameAndType        #239:#240     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #239 = Utf8               getItem
  #240 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #241 = Methodref          #242.#243     // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #242 = Class              #244          // ext/mods/gameserver/model/item/kind/Item
  #243 = NameAndType        #245:#38      // getIcon:()Ljava/lang/String;
  #244 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #245 = Utf8               getIcon
  #246 = String             #247          // \" width=32 height=32></td>
  #247 = Utf8               \" width=32 height=32></td>
  #248 = String             #249          // <td>
  #249 = Utf8               <td>
  #250 = Methodref          #242.#36      // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #251 = Methodref          #231.#252     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #252 = NameAndType        #253:#79      // getEnchantLevel:()I
  #253 = Utf8               getEnchantLevel
  #254 = String             #255          //  +
  #255 = Utf8                +
  #256 = String             #257          // </table><br>
  #257 = Utf8               </table><br>
  #258 = String             #259          // <table width=300><tr>
  #259 = Utf8               <table width=300><tr>
  #260 = String             #261          // <td><button value=\"<<\" action=\"bypass -h voiced_item
  #261 = Utf8               <td><button value=\"<<\" action=\"bypass -h voiced_item
  #262 = String             #263          // \" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #263 = Utf8               \" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #264 = String             #265          // <td width=40></td>
  #265 = Utf8               <td width=40></td>
  #266 = String             #267          // <td align=center><font color=LEVEL>Página
  #267 = Utf8               <td align=center><font color=LEVEL>Página
  #268 = String             #269          // </font></td>
  #269 = Utf8               </font></td>
  #270 = String             #271          // <td align=right><button value=\">>\" action=\"bypass -h voiced_item
  #271 = Utf8               <td align=right><button value=\">>\" action=\"bypass -h voiced_item
  #272 = String             #273          // </tr></table>
  #273 = Utf8               </tr></table>
  #274 = String             #275          // </body></html>
  #275 = Utf8               </body></html>
  #276 = Methodref          #24.#277      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #277 = NameAndType        #278:#38      // toString:()Ljava/lang/String;
  #278 = Utf8               toString
  #279 = Methodref          #19.#280      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #280 = NameAndType        #281:#18      // setHtml:(Ljava/lang/String;)V
  #281 = Utf8               setHtml
  #282 = Methodref          #8.#283       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #283 = NameAndType        #284:#285     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #284 = Utf8               sendPacket
  #285 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #286 = Fieldref           #287.#288     // ext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo.VOICED_COMMANDS:[Ljava/lang/String;
  #287 = Class              #289          // ext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo
  #288 = NameAndType        #290:#291     // VOICED_COMMANDS:[Ljava/lang/String;
  #289 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo
  #290 = Utf8               VOICED_COMMANDS
  #291 = Utf8               [Ljava/lang/String;
  #292 = Class              #293          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #293 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #294 = Utf8               Code
  #295 = Utf8               LineNumberTable
  #296 = Utf8               LocalVariableTable
  #297 = Utf8               this
  #298 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo;
  #299 = Utf8               useVoicedCommand
  #300 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #301 = Utf8               e
  #302 = Utf8               Ljava/lang/Exception;
  #303 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #304 = Utf8               i
  #305 = Utf8               I
  #306 = Utf8               page
  #307 = Utf8               paperdoll
  #308 = Utf8               Ljava/util/List;
  #309 = Utf8               itemsPerPage
  #310 = Utf8               totalItems
  #311 = Utf8               totalPages
  #312 = Utf8               start
  #313 = Utf8               end
  #314 = Utf8               command
  #315 = Utf8               Ljava/lang/String;
  #316 = Utf8               player
  #317 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #318 = Utf8               target
  #319 = Utf8               targetPlayer
  #320 = Utf8               html
  #321 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #322 = Utf8               sb
  #323 = Utf8               Ljava/lang/StringBuilder;
  #324 = Utf8               LocalVariableTypeTable
  #325 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #326 = Utf8               StackMapTable
  #327 = Utf8               getVoicedCommandList
  #328 = Utf8               ()[Ljava/lang/String;
  #329 = Utf8               <clinit>
  #330 = Utf8               SourceFile
  #331 = Utf8               PlayerInfo.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.PlayerInfo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=16, args_size=4
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: ifnull        17
         7: aload_2
         8: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        11: instanceof    #8                  // class ext/mods/gameserver/model/actor/Player
        14: ifne          25
        17: aload_2
        18: ldc           #13                 // String Você precisa selecionar um jogador como alvo.
        20: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        23: iconst_0
        24: ireturn
        25: aload_2
        26: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        29: checkcast     #8                  // class ext/mods/gameserver/model/actor/Player
        32: astore        4
        34: new           #19                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        37: dup
        38: iconst_0
        39: invokespecial #21                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        42: astore        5
        44: new           #24                 // class java/lang/StringBuilder
        47: dup
        48: invokespecial #26                 // Method java/lang/StringBuilder."<init>":()V
        51: astore        6
        53: aload         6
        55: ldc           #27                 // String <html><title>Player Info</title><body>
        57: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        60: pop
        61: aload         6
        63: ldc           #33                 // String <font color=LEVEL><b>
        65: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        68: aload         4
        70: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        73: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        76: ldc           #39                 // String </b></font><br><br>
        78: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        81: pop
        82: aload         6
        84: ldc           #41                 // String <center><table width=300><tr>
        86: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        89: pop
        90: aload         6
        92: ldc           #43                 // String <td><button value=\"Status\" action=\"bypass -h voiced_info\" width=100 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
        94: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        97: pop
        98: aload         6
       100: ldc           #45                 // String <td><button value=\"Equipamentos\" action=\"bypass -h voiced_item\" width=100 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
       102: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       105: pop
       106: aload         6
       108: ldc           #47                 // String </tr></table></center><br>
       110: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       113: pop
       114: aload_1
       115: ldc           #49                 // String info
       117: invokevirtual #51                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       120: ifeq          607
       123: aload         6
       125: ldc           #57                 // String <table width=300 bgcolor=000000>
       127: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       130: pop
       131: aload         6
       133: ldc           #59                 // String <tr><td width=120><font color=LEVEL>HP:</font></td><td>
       135: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       138: aload         4
       140: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       143: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
       146: d2i
       147: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       150: ldc           #74                 // String  /
       152: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       155: aload         4
       157: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       160: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
       163: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       166: ldc           #80                 // String </td></tr>
       168: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       171: pop
       172: aload         6
       174: ldc           #82                 // String <tr><td><font color=LEVEL>MP:</font></td><td>
       176: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       179: aload         4
       181: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       184: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
       187: d2i
       188: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       191: ldc           #74                 // String  /
       193: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       196: aload         4
       198: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       201: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
       204: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       207: ldc           #80                 // String </td></tr>
       209: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       212: pop
       213: aload         6
       215: ldc           #90                 // String <tr><td><font color=LEVEL>CP:</font></td><td>
       217: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       220: aload         4
       222: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       225: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
       228: d2i
       229: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       232: ldc           #74                 // String  /
       234: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       237: aload         4
       239: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       242: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
       245: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       248: ldc           #80                 // String </td></tr>
       250: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       253: pop
       254: aload         6
       256: ldc           #98                 // String <tr><td><font color=LEVEL>Level:</font></td><td>
       258: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       261: aload         4
       263: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       266: invokevirtual #100                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       269: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       272: ldc           #80                 // String </td></tr>
       274: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       277: pop
       278: aload         6
       280: ldc           #103                // String <tr><td><font color=LEVEL>Classe:</font></td><td>
       282: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       285: aload         4
       287: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
       290: invokevirtual #109                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
       293: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       296: ldc           #80                 // String </td></tr>
       298: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       301: pop
       302: aload         6
       304: ldc           #114                // String <tr><td><font color=LEVEL>P. Atk:</font></td><td>
       306: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       309: aload         4
       311: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       314: aconst_null
       315: invokevirtual #116                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
       318: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       321: ldc           #80                 // String </td></tr>
       323: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       326: pop
       327: aload         6
       329: ldc           #120                // String <tr><td><font color=LEVEL>M. Atk:</font></td><td>
       331: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       334: aload         4
       336: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       339: aconst_null
       340: aconst_null
       341: invokevirtual #122                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
       344: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       347: ldc           #80                 // String </td></tr>
       349: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       352: pop
       353: aload         6
       355: ldc           #126                // String <tr><td><font color=LEVEL>P. Def:</font></td><td>
       357: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       360: aload         4
       362: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       365: aconst_null
       366: invokevirtual #128                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
       369: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       372: ldc           #80                 // String </td></tr>
       374: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       377: pop
       378: aload         6
       380: ldc           #131                // String <tr><td><font color=LEVEL>M. Def:</font></td><td>
       382: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       385: aload         4
       387: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       390: aconst_null
       391: aconst_null
       392: invokevirtual #133                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
       395: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       398: ldc           #80                 // String </td></tr>
       400: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       403: pop
       404: aload         6
       406: ldc           #136                // String <tr><td><font color=LEVEL>P. atkSpeed:</font></td><td>
       408: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       411: aload         4
       413: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       416: invokevirtual #138                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtkSpd:()I
       419: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       422: ldc           #80                 // String </td></tr>
       424: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       427: pop
       428: aload         6
       430: ldc           #141                // String <tr><td><font color=LEVEL>C. Speed:</font></td><td>
       432: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       435: aload         4
       437: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       440: invokevirtual #143                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtkSpd:()I
       443: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       446: ldc           #80                 // String </td></tr>
       448: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       451: pop
       452: aload         6
       454: ldc           #146                // String <tr><td><font color=LEVEL>STR:</font></td><td>
       456: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       459: aload         4
       461: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       464: invokevirtual #148                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSTR:()I
       467: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       470: ldc           #80                 // String </td></tr>
       472: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       475: pop
       476: aload         6
       478: ldc           #151                // String <tr><td><font color=LEVEL>CON:</font></td><td>
       480: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       483: aload         4
       485: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       488: invokevirtual #153                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCON:()I
       491: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       494: ldc           #80                 // String </td></tr>
       496: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       499: pop
       500: aload         6
       502: ldc           #156                // String <tr><td><font color=LEVEL>DEX:</font></td><td>
       504: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       507: aload         4
       509: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       512: invokevirtual #158                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getDEX:()I
       515: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       518: ldc           #80                 // String </td></tr>
       520: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       523: pop
       524: aload         6
       526: ldc           #161                // String <tr><td><font color=LEVEL>INT:</font></td><td>
       528: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       531: aload         4
       533: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       536: invokevirtual #163                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getINT:()I
       539: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       542: ldc           #80                 // String </td></tr>
       544: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       547: pop
       548: aload         6
       550: ldc           #166                // String <tr><td><font color=LEVEL>MEN:</font></td><td>
       552: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       555: aload         4
       557: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       560: invokevirtual #168                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMEN:()I
       563: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       566: ldc           #80                 // String </td></tr>
       568: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       571: pop
       572: aload         6
       574: ldc           #171                // String <tr><td><font color=LEVEL>WIT:</font></td><td>
       576: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       579: aload         4
       581: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       584: invokevirtual #173                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getWIT:()I
       587: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       590: ldc           #80                 // String </td></tr>
       592: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       595: pop
       596: aload         6
       598: ldc           #176                // String </table>
       600: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       603: pop
       604: goto          971
       607: aload_1
       608: ldc           #178                // String item
       610: invokevirtual #180                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       613: ifeq          971
       616: iconst_1
       617: istore        7
       619: aload_1
       620: ldc           #184                // String
       622: invokevirtual #186                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       625: ifeq          649
       628: aload_1
       629: ldc           #184                // String
       631: invokevirtual #190                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       634: iconst_1
       635: aaload
       636: invokestatic  #194                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       639: istore        7
       641: goto          649
       644: astore        8
       646: iconst_1
       647: istore        7
       649: aload         4
       651: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       654: invokevirtual #206                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
       657: astore        8
       659: bipush        7
       661: istore        9
       663: aload         8
       665: invokeinterface #212,  1          // InterfaceMethod java/util/List.size:()I
       670: istore        10
       672: iload         10
       674: i2d
       675: iload         9
       677: i2d
       678: ddiv
       679: invokestatic  #217                // Method java/lang/Math.ceil:(D)D
       682: d2i
       683: istore        11
       685: iload         7
       687: iconst_1
       688: isub
       689: iload         9
       691: imul
       692: istore        12
       694: iload         12
       696: iload         9
       698: iadd
       699: iload         10
       701: invokestatic  #223                // Method java/lang/Math.min:(II)I
       704: istore        13
       706: aload         6
       708: ldc           #57                 // String <table width=300 bgcolor=000000>
       710: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       713: pop
       714: iload         12
       716: istore        14
       718: iload         14
       720: iload         13
       722: if_icmpge     833
       725: aload         8
       727: iload         14
       729: invokeinterface #227,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       734: checkcast     #231                // class ext/mods/gameserver/model/item/instance/ItemInstance
       737: astore        15
       739: aload         15
       741: ifnull        827
       744: aload         6
       746: ldc           #233                // String <tr>
       748: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       751: pop
       752: aload         6
       754: ldc           #235                // String <td width=40><img src=\"
       756: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       759: aload         15
       761: invokevirtual #237                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       764: invokevirtual #241                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       767: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       770: ldc           #246                // String \" width=32 height=32></td>
       772: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       775: pop
       776: aload         6
       778: ldc           #248                // String <td>
       780: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       783: aload         15
       785: invokevirtual #237                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       788: invokevirtual #250                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
       791: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       794: pop
       795: aload         15
       797: invokevirtual #251                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       800: ifle          819
       803: aload         6
       805: ldc           #254                // String  +
       807: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       810: aload         15
       812: invokevirtual #251                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       815: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       818: pop
       819: aload         6
       821: ldc           #80                 // String </td></tr>
       823: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       826: pop
       827: iinc          14, 1
       830: goto          718
       833: aload         6
       835: ldc_w         #256                // String </table><br>
       838: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       841: pop
       842: aload         6
       844: ldc_w         #258                // String <table width=300><tr>
       847: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       850: pop
       851: iload         7
       853: iconst_1
       854: if_icmple     882
       857: aload         6
       859: ldc_w         #260                // String <td><button value=\"<<\" action=\"bypass -h voiced_item
       862: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       865: iload         7
       867: iconst_1
       868: isub
       869: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       872: ldc_w         #262                // String \" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
       875: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       878: pop
       879: goto          891
       882: aload         6
       884: ldc_w         #264                // String <td width=40></td>
       887: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       890: pop
       891: aload         6
       893: ldc_w         #266                // String <td align=center><font color=LEVEL>Página
       896: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       899: iload         7
       901: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       904: ldc           #74                 // String  /
       906: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       909: iload         11
       911: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       914: ldc_w         #268                // String </font></td>
       917: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       920: pop
       921: iload         7
       923: iload         11
       925: if_icmpge     953
       928: aload         6
       930: ldc_w         #270                // String <td align=right><button value=\">>\" action=\"bypass -h voiced_item
       933: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       936: iload         7
       938: iconst_1
       939: iadd
       940: invokevirtual #71                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
       943: ldc_w         #262                // String \" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
       946: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       949: pop
       950: goto          962
       953: aload         6
       955: ldc_w         #264                // String <td width=40></td>
       958: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       961: pop
       962: aload         6
       964: ldc_w         #272                // String </tr></table>
       967: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       970: pop
       971: aload         6
       973: ldc_w         #274                // String </body></html>
       976: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       979: pop
       980: aload         5
       982: aload         6
       984: invokevirtual #276                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       987: invokevirtual #279                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       990: aload_2
       991: aload         5
       993: invokevirtual #282                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       996: iconst_1
       997: ireturn
      Exception table:
         from    to  target type
           628   641   644   Class java/lang/Exception
      LineNumberTable:
        line 38: 0
        line 40: 17
        line 41: 23
        line 44: 25
        line 45: 34
        line 46: 44
        line 48: 53
        line 49: 61
        line 51: 82
        line 52: 90
        line 53: 98
        line 54: 106
        line 56: 114
        line 58: 123
        line 59: 131
        line 60: 172
        line 61: 213
        line 62: 254
        line 63: 278
        line 64: 302
        line 65: 327
        line 66: 353
        line 67: 378
        line 68: 404
        line 69: 428
        line 70: 452
        line 71: 476
        line 72: 500
        line 73: 524
        line 74: 548
        line 75: 572
        line 76: 596
        line 79: 607
        line 81: 616
        line 82: 619
        line 86: 628
        line 91: 641
        line 88: 644
        line 90: 646
        line 94: 649
        line 95: 659
        line 96: 663
        line 97: 672
        line 99: 685
        line 100: 694
        line 102: 706
        line 103: 714
        line 105: 725
        line 106: 739
        line 108: 744
        line 109: 752
        line 110: 776
        line 111: 795
        line 112: 803
        line 113: 819
        line 103: 827
        line 116: 833
        line 118: 842
        line 119: 851
        line 120: 857
        line 122: 882
        line 124: 891
        line 126: 921
        line 127: 928
        line 129: 953
        line 130: 962
        line 133: 971
        line 134: 980
        line 135: 990
        line 137: 996
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          646       3     8     e   Ljava/lang/Exception;
          739      88    15  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          718     115    14     i   I
          619     352     7  page   I
          659     312     8 paperdoll   Ljava/util/List;
          663     308     9 itemsPerPage   I
          672     299    10 totalItems   I
          685     286    11 totalPages   I
          694     277    12 start   I
          706     265    13   end   I
            0     998     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo;
            0     998     1 command   Ljava/lang/String;
            0     998     2 player   Lext/mods/gameserver/model/actor/Player;
            0     998     3 target   Ljava/lang/String;
           34     964     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           44     954     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           53     945     6    sb   Ljava/lang/StringBuilder;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          659     312     8 paperdoll   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 14
        frame_type = 17 /* same */
        frame_type = 7 /* same */
        frame_type = 254 /* append */
          offset_delta = 581
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, int, class java/util/List, int, int, int, int, int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 100
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 48 /* same */
        frame_type = 8 /* same */
        frame_type = 61 /* same */
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder ]
          stack = []

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #286                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/PlayerInfo;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #52                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #49                 // String info
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #178                // String item
        13: aastore
        14: putstatic     #286                // Field VOICED_COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "PlayerInfo.java"
