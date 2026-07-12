// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.VoicedTopEnchantCmd
// File: ext\mods\gameserver\handler\voicedcommandhandlers\VoicedTopEnchantCmd.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd.class
  Last modified 9 de jul de 2026; size 6744 bytes
  MD5 checksum 32545eca0becedbdfcbdf802b29e36c1
  Compiled from "VoicedTopEnchantCmd.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.VoicedTopEnchantCmd implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #37                         // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // topenchant
    #8 = Utf8               topenchant
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Class              #16           // java/util/StringTokenizer
   #16 = Utf8               java/util/StringTokenizer
   #17 = String             #18           //
   #18 = Utf8
   #19 = Methodref          #15.#20       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #20 = NameAndType        #5:#21        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #21 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #22 = Methodref          #15.#23       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #23 = NameAndType        #24:#25       // nextToken:()Ljava/lang/String;
   #24 = Utf8               nextToken
   #25 = Utf8               ()Ljava/lang/String;
   #26 = Methodref          #15.#27       // java/util/StringTokenizer.hasMoreTokens:()Z
   #27 = NameAndType        #28:#29       // hasMoreTokens:()Z
   #28 = Utf8               hasMoreTokens
   #29 = Utf8               ()Z
   #30 = Methodref          #31.#32       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #31 = Class              #33           // java/lang/Integer
   #32 = NameAndType        #34:#35       // parseInt:(Ljava/lang/String;)I
   #33 = Utf8               java/lang/Integer
   #34 = Utf8               parseInt
   #35 = Utf8               (Ljava/lang/String;)I
   #36 = Methodref          #37.#38       // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd.htmlTopRankingEnchant:(Lext/mods/gameserver/model/actor/Player;I)V
   #37 = Class              #39           // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd
   #38 = NameAndType        #40:#41       // htmlTopRankingEnchant:(Lext/mods/gameserver/model/actor/Player;I)V
   #39 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd
   #40 = Utf8               htmlTopRankingEnchant
   #41 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #42 = Class              #43           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #43 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #44 = Methodref          #42.#45       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #45 = NameAndType        #5:#46        // "<init>":(I)V
   #46 = Utf8               (I)V
   #47 = Class              #48           // java/lang/StringBuilder
   #48 = Utf8               java/lang/StringBuilder
   #49 = Methodref          #47.#3        // java/lang/StringBuilder."<init>":()V
   #50 = String             #51           // <html><body>
   #51 = Utf8               <html><body>
   #52 = Methodref          #47.#53       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #53 = NameAndType        #54:#55       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #54 = Utf8               append
   #55 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #56 = String             #57           // <br><br>
   #57 = Utf8               <br><br>
   #58 = String             #59           // <table width=285 bgcolor=000000 cellspacing=0 cellpadding=5>
   #59 = Utf8               <table width=285 bgcolor=000000 cellspacing=0 cellpadding=5>
   #60 = String             #61           // <tr><td colspan=2 align=center><font color=LEVEL><b>Top Enchant Ranking</b></font></td></tr>
   #61 = Utf8               <tr><td colspan=2 align=center><font color=LEVEL><b>Top Enchant Ranking</b></font></td></tr>
   #62 = String             #63           // </table>
   #63 = Utf8               </table>
   #64 = String             #65           // <img src=\"L2UI.SquareGray\" width=320 height=1><br>
   #65 = Utf8               <img src=\"L2UI.SquareGray\" width=320 height=1><br>
   #66 = Methodref          #67.#68       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #67 = Class              #69           // ext/mods/commons/pool/ConnectionPool
   #68 = NameAndType        #70:#71       // getConnection:()Ljava/sql/Connection;
   #69 = Utf8               ext/mods/commons/pool/ConnectionPool
   #70 = Utf8               getConnection
   #71 = Utf8               ()Ljava/sql/Connection;
   #72 = String             #73           // SELECT cha.char_name, it.enchant_level, it.item_id FROM characters cha INNER JOIN items it ON cha.obj_Id = it.owner_id WHERE it.enchant_level > 1 AND cha.accesslevel = 0 ORDER BY it.enchant_level DESC LIMIT ?, ?
   #73 = Utf8               SELECT cha.char_name, it.enchant_level, it.item_id FROM characters cha INNER JOIN items it ON cha.obj_Id = it.owner_id WHERE it.enchant_level > 1 AND cha.accesslevel = 0 ORDER BY it.enchant_level DESC LIMIT ?, ?
   #74 = InterfaceMethodref #75.#76       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #75 = Class              #77           // java/sql/Connection
   #76 = NameAndType        #78:#79       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #77 = Utf8               java/sql/Connection
   #78 = Utf8               prepareStatement
   #79 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #80 = InterfaceMethodref #81.#82       // java/sql/PreparedStatement.setInt:(II)V
   #81 = Class              #83           // java/sql/PreparedStatement
   #82 = NameAndType        #84:#85       // setInt:(II)V
   #83 = Utf8               java/sql/PreparedStatement
   #84 = Utf8               setInt
   #85 = Utf8               (II)V
   #86 = InterfaceMethodref #81.#87       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #87 = NameAndType        #88:#89       // executeQuery:()Ljava/sql/ResultSet;
   #88 = Utf8               executeQuery
   #89 = Utf8               ()Ljava/sql/ResultSet;
   #90 = InterfaceMethodref #91.#92       // java/sql/ResultSet.next:()Z
   #91 = Class              #93           // java/sql/ResultSet
   #92 = NameAndType        #94:#29       // next:()Z
   #93 = Utf8               java/sql/ResultSet
   #94 = Utf8               next
   #95 = Methodref          #96.#97       // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #96 = Class              #98           // ext/mods/gameserver/data/xml/ItemData
   #97 = NameAndType        #99:#100      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #98 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #99 = Utf8               getInstance
  #100 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #101 = String             #102          // it.item_id
  #102 = Utf8               it.item_id
  #103 = InterfaceMethodref #91.#104      // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #104 = NameAndType        #105:#35      // getInt:(Ljava/lang/String;)I
  #105 = Utf8               getInt
  #106 = Methodref          #96.#107      // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #107 = NameAndType        #108:#109     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #108 = Utf8               getTemplate
  #109 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #110 = Class              #111          // ext/mods/gameserver/model/item/kind/Weapon
  #111 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #112 = Methodref          #113.#114     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #113 = Class              #115          // ext/mods/gameserver/model/item/kind/Item
  #114 = NameAndType        #116:#25      // getName:()Ljava/lang/String;
  #115 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #116 = Utf8               getName
  #117 = Methodref          #10.#118      // java/lang/String.length:()I
  #118 = NameAndType        #119:#120     // length:()I
  #119 = Utf8               length
  #120 = Utf8               ()I
  #121 = Methodref          #10.#122      // java/lang/String.substring:(II)Ljava/lang/String;
  #122 = NameAndType        #123:#124     // substring:(II)Ljava/lang/String;
  #123 = Utf8               substring
  #124 = Utf8               (II)Ljava/lang/String;
  #125 = InvokeDynamic      #0:#126       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #126 = NameAndType        #127:#128     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #127 = Utf8               makeConcatWithConstants
  #128 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #130 = Class              #132          // ext/mods/gameserver/model/World
  #131 = NameAndType        #99:#133      // getInstance:()Lext/mods/gameserver/model/World;
  #132 = Utf8               ext/mods/gameserver/model/World
  #133 = Utf8               ()Lext/mods/gameserver/model/World;
  #134 = Methodref          #135.#114     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #135 = Class              #136          // ext/mods/gameserver/model/actor/Player
  #136 = Utf8               ext/mods/gameserver/model/actor/Player
  #137 = Methodref          #130.#138     // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #138 = NameAndType        #139:#140     // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #139 = Utf8               getPlayer
  #140 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #141 = Methodref          #135.#142     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #142 = NameAndType        #143:#29      // isOnline:()Z
  #143 = Utf8               isOnline
  #144 = String             #145          // 4
  #145 = Utf8               4
  #146 = String             #147          // 1
  #147 = Utf8               1
  #148 = InvokeDynamic      #1:#126       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #149 = String             #150          // 000000
  #150 = Utf8               000000
  #151 = InvokeDynamic      #2:#126       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #152 = String             #153          // <tr>
  #153 = Utf8               <tr>
  #154 = InvokeDynamic      #3:#126       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #155 = String             #156          // <td align=left>
  #156 = Utf8               <td align=left>
  #157 = String             #158          // cha.char_name
  #158 = Utf8               cha.char_name
  #159 = InterfaceMethodref #91.#160      // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #160 = NameAndType        #161:#128     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #161 = Utf8               getString
  #162 = InvokeDynamic      #4:#126       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #163 = String             #164          // it.enchant_level
  #164 = Utf8               it.enchant_level
  #165 = InvokeDynamic      #5:#166       // #5:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #166 = NameAndType        #127:#167     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #167 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #168 = String             #169          // </td>
  #169 = Utf8               </td>
  #170 = String             #171          // </tr>
  #171 = Utf8               </tr>
  #172 = String             #173          // <img src=\"L2UI.SquareGray\" width=320 height=1>
  #173 = Utf8               <img src=\"L2UI.SquareGray\" width=320 height=1>
  #174 = InterfaceMethodref #91.#175      // java/sql/ResultSet.close:()V
  #175 = NameAndType        #176:#6       // close:()V
  #176 = Utf8               close
  #177 = Class              #178          // java/lang/Throwable
  #178 = Utf8               java/lang/Throwable
  #179 = Methodref          #177.#180     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #180 = NameAndType        #181:#182     // addSuppressed:(Ljava/lang/Throwable;)V
  #181 = Utf8               addSuppressed
  #182 = Utf8               (Ljava/lang/Throwable;)V
  #183 = InterfaceMethodref #81.#175      // java/sql/PreparedStatement.close:()V
  #184 = InterfaceMethodref #75.#175      // java/sql/Connection.close:()V
  #185 = Class              #186          // java/lang/Exception
  #186 = Utf8               java/lang/Exception
  #187 = Methodref          #185.#188     // java/lang/Exception.printStackTrace:()V
  #188 = NameAndType        #189:#6       // printStackTrace:()V
  #189 = Utf8               printStackTrace
  #190 = String             #191          // <br>
  #191 = Utf8               <br>
  #192 = String             #193          // <table width=285 cellpadding=3>
  #193 = Utf8               <table width=285 cellpadding=3>
  #194 = String             #195          // <a action=\"bypass -h voiced_topenchant
  #195 = Utf8               <a action=\"bypass -h voiced_topenchant
  #196 = Methodref          #47.#197      // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #197 = NameAndType        #54:#198      // append:(I)Ljava/lang/StringBuilder;
  #198 = Utf8               (I)Ljava/lang/StringBuilder;
  #199 = String             #200          // \"><font color=99BBFF>&lt;&lt; Anterior</font></a>
  #200 = Utf8               \"><font color=99BBFF>&lt;&lt; Anterior</font></a>
  #201 = String             #202          // <font color=000000>&lt;&lt; Anterior</font>
  #202 = Utf8               <font color=000000>&lt;&lt; Anterior</font>
  #203 = String             #204          // <td align=center><font color=LEVEL> Página
  #204 = Utf8               <td align=center><font color=LEVEL> Página
  #205 = String             #206          //  </font></td>
  #206 = Utf8                </font></td>
  #207 = String             #208          // <td align=right>
  #208 = Utf8               <td align=right>
  #209 = String             #210          // \"><font color=99BBFF>Próxima &gt;&gt;</font></a>
  #210 = Utf8               \"><font color=99BBFF>Próxima &gt;&gt;</font></a>
  #211 = String             #212          // </body></html>
  #212 = Utf8               </body></html>
  #213 = Methodref          #47.#214      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #214 = NameAndType        #215:#25      // toString:()Ljava/lang/String;
  #215 = Utf8               toString
  #216 = Methodref          #42.#217      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #217 = NameAndType        #218:#219     // setHtml:(Ljava/lang/String;)V
  #218 = Utf8               setHtml
  #219 = Utf8               (Ljava/lang/String;)V
  #220 = String             #221          // %info%
  #221 = Utf8               %info%
  #222 = Methodref          #42.#223      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #223 = NameAndType        #224:#21      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #224 = Utf8               replace
  #225 = Methodref          #135.#226     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #226 = NameAndType        #227:#228     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #227 = Utf8               sendPacket
  #228 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #229 = Fieldref           #37.#230      // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd.VOICED_COMMANDS:[Ljava/lang/String;
  #230 = NameAndType        #231:#232     // VOICED_COMMANDS:[Ljava/lang/String;
  #231 = Utf8               VOICED_COMMANDS
  #232 = Utf8               [Ljava/lang/String;
  #233 = Class              #234          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #234 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #235 = Utf8               PAGE_LIMIT_TOP_ENCHANT_RANKING
  #236 = Utf8               I
  #237 = Utf8               ConstantValue
  #238 = Integer            30
  #239 = Utf8               Code
  #240 = Utf8               LineNumberTable
  #241 = Utf8               LocalVariableTable
  #242 = Utf8               this
  #243 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd;
  #244 = Utf8               useVoicedCommand
  #245 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #246 = Utf8               st
  #247 = Utf8               Ljava/util/StringTokenizer;
  #248 = Utf8               page
  #249 = Utf8               command
  #250 = Utf8               Ljava/lang/String;
  #251 = Utf8               player
  #252 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #253 = Utf8               target
  #254 = Utf8               StackMapTable
  #255 = Utf8               itemName
  #256 = Utf8               databasePlayer
  #257 = Utf8               status
  #258 = Utf8               item
  #259 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #260 = Utf8               index
  #261 = Utf8               rs
  #262 = Utf8               Ljava/sql/ResultSet;
  #263 = Utf8               ps
  #264 = Utf8               Ljava/sql/PreparedStatement;
  #265 = Utf8               con
  #266 = Utf8               Ljava/sql/Connection;
  #267 = Utf8               e
  #268 = Utf8               Ljava/lang/Exception;
  #269 = Utf8               htm
  #270 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #271 = Utf8               sb
  #272 = Utf8               Ljava/lang/StringBuilder;
  #273 = Utf8               offset
  #274 = Utf8               getVoicedCommandList
  #275 = Utf8               ()[Ljava/lang/String;
  #276 = Utf8               <clinit>
  #277 = Utf8               SourceFile
  #278 = Utf8               VoicedTopEnchantCmd.java
  #279 = Utf8               BootstrapMethods
  #280 = String             #281          // \u0001...
  #281 = Utf8               \u0001...
  #282 = String             #283          // L2UI_CH3.msnicon\u0001
  #283 = Utf8               L2UI_CH3.msnicon\u0001
  #284 = String             #285          // <table width=285 bgcolor=\u0001 cellspacing=0 cellpadding=4>
  #285 = Utf8               <table width=285 bgcolor=\u0001 cellspacing=0 cellpadding=4>
  #286 = String             #287          // <td width=16><img src=\"\u0001\" width=16 height=16></td>
  #287 = Utf8               <td width=16><img src=\"\u0001\" width=16 height=16></td>
  #288 = String             #289          // <font color=LEVEL><b>\u0001</b></font><br1>
  #289 = Utf8               <font color=LEVEL><b>\u0001</b></font><br1>
  #290 = String             #291          // <font color=B09878>\u0001 +<b>\u0001</b></font>
  #291 = Utf8               <font color=B09878>\u0001 +<b>\u0001</b></font>
  #292 = MethodHandle       6:#293        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #293 = Methodref          #294.#295     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #294 = Class              #296          // java/lang/invoke/StringConcatFactory
  #295 = NameAndType        #127:#297     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #296 = Utf8               java/lang/invoke/StringConcatFactory
  #297 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #298 = Utf8               InnerClasses
  #299 = Class              #300          // java/lang/invoke/MethodHandles$Lookup
  #300 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #301 = Class              #302          // java/lang/invoke/MethodHandles
  #302 = Utf8               java/lang/invoke/MethodHandles
  #303 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.VoicedTopEnchantCmd();
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
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_1
         1: ldc           #7                  // String topenchant
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          54
         9: new           #15                 // class java/util/StringTokenizer
        12: dup
        13: aload_1
        14: ldc           #17                 // String
        16: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        19: astore        4
        21: aload         4
        23: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        26: pop
        27: iconst_1
        28: istore        5
        30: aload         4
        32: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        35: ifeq          48
        38: aload         4
        40: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        43: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        46: istore        5
        48: aload_2
        49: iload         5
        51: invokestatic  #36                 // Method htmlTopRankingEnchant:(Lext/mods/gameserver/model/actor/Player;I)V
        54: iconst_1
        55: ireturn
      LineNumberTable:
        line 50: 0
        line 52: 9
        line 53: 21
        line 54: 27
        line 55: 30
        line 57: 38
        line 59: 48
        line 62: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21      33     4    st   Ljava/util/StringTokenizer;
           30      24     5  page   I
            0      56     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd;
            0      56     1 command   Ljava/lang/String;
            0      56     2 player   Lext/mods/gameserver/model/actor/Player;
            0      56     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ class java/util/StringTokenizer, int ]
        frame_type = 249 /* chop */
          offset_delta = 5

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #229                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedTopEnchantCmd;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String topenchant
         8: aastore
         9: putstatic     #229                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "VoicedTopEnchantCmd.java"
BootstrapMethods:
  0: #292 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #280 \u0001...
  1: #292 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #282 L2UI_CH3.msnicon\u0001
  2: #292 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #284 <table width=285 bgcolor=\u0001 cellspacing=0 cellpadding=4>
  3: #292 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #286 <td width=16><img src=\"\u0001\" width=16 height=16></td>
  4: #292 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #288 <font color=LEVEL><b>\u0001</b></font><br1>
  5: #292 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #290 <font color=B09878>\u0001 +<b>\u0001</b></font>
InnerClasses:
  public static final #303= #299 of #301; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
