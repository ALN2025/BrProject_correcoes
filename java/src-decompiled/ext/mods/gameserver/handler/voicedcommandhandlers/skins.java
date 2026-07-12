// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.skins
// File: ext\mods\gameserver\handler\voicedcommandhandlers\skins.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/skins.class
  Last modified 9 de jul de 2026; size 10797 bytes
  MD5 checksum 1b2e32af56e21b9eeb227f3c0bdf5147
  Compiled from "skins.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.skins implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #128                        // ext/mods/gameserver/handler/voicedcommandhandlers/skins
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = String             #19           // ARMOR
   #19 = Utf8               ARMOR
   #20 = Methodref          #7.#21        // java/util/StringTokenizer.hasMoreTokens:()Z
   #21 = NameAndType        #22:#23       // hasMoreTokens:()Z
   #22 = Utf8               hasMoreTokens
   #23 = Utf8               ()Z
   #24 = String             #25           // type
   #25 = Utf8               type
   #26 = Methodref          #27.#28       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #27 = Class              #29           // java/lang/String
   #28 = NameAndType        #30:#31       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #29 = Utf8               java/lang/String
   #30 = Utf8               equalsIgnoreCase
   #31 = Utf8               (Ljava/lang/String;)Z
   #32 = Methodref          #27.#33       // java/lang/String.toUpperCase:()Ljava/lang/String;
   #33 = NameAndType        #34:#17       // toUpperCase:()Ljava/lang/String;
   #34 = Utf8               toUpperCase
   #35 = String             #36           // subtype
   #36 = Utf8               subtype
   #37 = String             #38           // page
   #38 = Utf8               page
   #39 = Methodref          #40.#41       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #40 = Class              #42           // java/lang/Integer
   #41 = NameAndType        #43:#44       // parseInt:(Ljava/lang/String;)I
   #42 = Utf8               java/lang/Integer
   #43 = Utf8               parseInt
   #44 = Utf8               (Ljava/lang/String;)I
   #45 = Class              #46           // java/lang/NumberFormatException
   #46 = Utf8               java/lang/NumberFormatException
   #47 = String             #48           // apply
   #48 = Utf8               apply
   #49 = Long               900l
   #51 = Methodref          #52.#53       // java/lang/System.currentTimeMillis:()J
   #52 = Class              #54           // java/lang/System
   #53 = NameAndType        #55:#56       // currentTimeMillis:()J
   #54 = Utf8               java/lang/System
   #55 = Utf8               currentTimeMillis
   #56 = Utf8               ()J
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/actor/Player.getLastDressMeSummonTime:()J
   #58 = Class              #60           // ext/mods/gameserver/model/actor/Player
   #59 = NameAndType        #61:#56       // getLastDressMeSummonTime:()J
   #60 = Utf8               ext/mods/gameserver/model/actor/Player
   #61 = Utf8               getLastDressMeSummonTime
   #62 = String             #63           // You need to wait before summoning another DressMe.
   #63 = Utf8               You need to wait before summoning another DressMe.
   #64 = Methodref          #58.#65       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #65 = NameAndType        #66:#67       // sendMessage:(Ljava/lang/String;)V
   #66 = Utf8               sendMessage
   #67 = Utf8               (Ljava/lang/String;)V
   #68 = Methodref          #69.#70       // ext/mods/dressme/DressMeData.getInstance:()Lext/mods/dressme/DressMeData;
   #69 = Class              #71           // ext/mods/dressme/DressMeData
   #70 = NameAndType        #72:#73       // getInstance:()Lext/mods/dressme/DressMeData;
   #71 = Utf8               ext/mods/dressme/DressMeData
   #72 = Utf8               getInstance
   #73 = Utf8               ()Lext/mods/dressme/DressMeData;
   #74 = Methodref          #69.#75       // ext/mods/dressme/DressMeData.getBySkillId:(I)Lext/mods/dressme/holder/DressMeHolder;
   #75 = NameAndType        #76:#77       // getBySkillId:(I)Lext/mods/dressme/holder/DressMeHolder;
   #76 = Utf8               getBySkillId
   #77 = Utf8               (I)Lext/mods/dressme/holder/DressMeHolder;
   #78 = Methodref          #58.#79       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #79 = NameAndType        #80:#81       // getPremiumService:()I
   #80 = Utf8               getPremiumService
   #81 = Utf8               ()I
   #82 = String             #83           // Este comando é exclusivo para jogadores VIP.
   #83 = Utf8               Este comando é exclusivo para jogadores VIP.
   #84 = Methodref          #85.#86       // ext/mods/dressme/holder/DressMeHolder.isVip:()Z
   #85 = Class              #87           // ext/mods/dressme/holder/DressMeHolder
   #86 = NameAndType        #88:#23       // isVip:()Z
   #87 = Utf8               ext/mods/dressme/holder/DressMeHolder
   #88 = Utf8               isVip
   #89 = Methodref          #58.#90       // ext/mods/gameserver/model/actor/Player.applyDressMe:(Lext/mods/dressme/holder/DressMeHolder;Z)V
   #90 = NameAndType        #91:#92       // applyDressMe:(Lext/mods/dressme/holder/DressMeHolder;Z)V
   #91 = Utf8               applyDressMe
   #92 = Utf8               (Lext/mods/dressme/holder/DressMeHolder;Z)V
   #93 = Methodref          #85.#94       // ext/mods/dressme/holder/DressMeHolder.getName:()Ljava/lang/String;
   #94 = NameAndType        #95:#17       // getName:()Ljava/lang/String;
   #95 = Utf8               getName
   #96 = InvokeDynamic      #0:#97        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #97 = NameAndType        #98:#99       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #98 = Utf8               makeConcatWithConstants
   #99 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #100 = Methodref          #58.#101      // ext/mods/gameserver/model/actor/Player.setLastDressMeSummonTime:(J)V
  #101 = NameAndType        #102:#103     // setLastDressMeSummonTime:(J)V
  #102 = Utf8               setLastDressMeSummonTime
  #103 = Utf8               (J)V
  #104 = String             #105          // preview
  #105 = Utf8               preview
  #106 = Long               60000l
  #108 = InvokeDynamic      #1:#97        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #109 = InvokeDynamic      #2:#110       // #2:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #110 = NameAndType        #111:#112     // run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #111 = Utf8               run
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #113 = Methodref          #114.#115     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #114 = Class              #116          // ext/mods/commons/pool/ThreadPool
  #115 = NameAndType        #117:#118     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #116 = Utf8               ext/mods/commons/pool/ThreadPool
  #117 = Utf8               schedule
  #118 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #119 = String             #120          // clean
  #120 = Utf8               clean
  #121 = Methodref          #58.#122      // ext/mods/gameserver/model/actor/Player.removeDressMeArmor:()V
  #122 = NameAndType        #123:#6       // removeDressMeArmor:()V
  #123 = Utf8               removeDressMeArmor
  #124 = Methodref          #58.#125      // ext/mods/gameserver/model/actor/Player.removeDressMeWeapon:()V
  #125 = NameAndType        #126:#6       // removeDressMeWeapon:()V
  #126 = Utf8               removeDressMeWeapon
  #127 = Methodref          #128.#129     // ext/mods/gameserver/handler/voicedcommandhandlers/skins.showSkins:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;ILjava/lang/String;)V
  #128 = Class              #130          // ext/mods/gameserver/handler/voicedcommandhandlers/skins
  #129 = NameAndType        #131:#132     // showSkins:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;ILjava/lang/String;)V
  #130 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/skins
  #131 = Utf8               showSkins
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;ILjava/lang/String;)V
  #133 = Methodref          #69.#134      // ext/mods/dressme/DressMeData.getEntries:()Ljava/util/List;
  #134 = NameAndType        #135:#136     // getEntries:()Ljava/util/List;
  #135 = Utf8               getEntries
  #136 = Utf8               ()Ljava/util/List;
  #137 = InterfaceMethodref #138.#139     // java/util/List.stream:()Ljava/util/stream/Stream;
  #138 = Class              #140          // java/util/List
  #139 = NameAndType        #141:#142     // stream:()Ljava/util/stream/Stream;
  #140 = Utf8               java/util/List
  #141 = Utf8               stream
  #142 = Utf8               ()Ljava/util/stream/Stream;
  #143 = InvokeDynamic      #3:#144       // #3:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #144 = NameAndType        #145:#146     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #145 = Utf8               test
  #146 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #147 = InterfaceMethodref #148.#149     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #148 = Class              #150          // java/util/stream/Stream
  #149 = NameAndType        #151:#152     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #150 = Utf8               java/util/stream/Stream
  #151 = Utf8               filter
  #152 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #153 = InvokeDynamic      #4:#154       // #4:test:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
  #154 = NameAndType        #145:#155     // test:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
  #155 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
  #156 = Methodref          #157.#158     // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
  #157 = Class              #159          // java/util/stream/Collectors
  #158 = NameAndType        #160:#161     // toList:()Ljava/util/stream/Collector;
  #159 = Utf8               java/util/stream/Collectors
  #160 = Utf8               toList
  #161 = Utf8               ()Ljava/util/stream/Collector;
  #162 = InterfaceMethodref #148.#163     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #163 = NameAndType        #164:#165     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #164 = Utf8               collect
  #165 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #166 = InterfaceMethodref #138.#167     // java/util/List.size:()I
  #167 = NameAndType        #168:#81      // size:()I
  #168 = Utf8               size
  #169 = Double             4.0d
  #171 = Methodref          #172.#173     // java/lang/Math.ceil:(D)D
  #172 = Class              #174          // java/lang/Math
  #173 = NameAndType        #175:#176     // ceil:(D)D
  #174 = Utf8               java/lang/Math
  #175 = Utf8               ceil
  #176 = Utf8               (D)D
  #177 = Methodref          #172.#178     // java/lang/Math.min:(II)I
  #178 = NameAndType        #179:#180     // min:(II)I
  #179 = Utf8               min
  #180 = Utf8               (II)I
  #181 = Methodref          #172.#182     // java/lang/Math.max:(II)I
  #182 = NameAndType        #183:#180     // max:(II)I
  #183 = Utf8               max
  #184 = Class              #185          // java/lang/StringBuilder
  #185 = Utf8               java/lang/StringBuilder
  #186 = Methodref          #184.#3       // java/lang/StringBuilder."<init>":()V
  #187 = String             #188          // <html><title>Skin</title><body><center>
  #188 = Utf8               <html><title>Skin</title><body><center>
  #189 = Methodref          #184.#190     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #190 = NameAndType        #191:#192     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #191 = Utf8               append
  #192 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #193 = String             #194          // <br><font color=LEVEL>Visualizações -
  #194 = Utf8               <br><font color=LEVEL>Visualizações -
  #195 = String             #196          // </font>
  #196 = Utf8               </font>
  #197 = String             #198          // <table><tr>
  #198 = Utf8               <table><tr>
  #199 = String             #200          // <td><button value=\"ARMOR\" action=\"bypass -h voiced_skin type ARMOR\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #200 = Utf8               <td><button value=\"ARMOR\" action=\"bypass -h voiced_skin type ARMOR\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #201 = String             #202          // <td><button value=\"WEAPON\" action=\"bypass -h voiced_skin type WEAPON\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #202 = Utf8               <td><button value=\"WEAPON\" action=\"bypass -h voiced_skin type WEAPON\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #203 = String             #204          // </tr></table><br>
  #204 = Utf8               </tr></table><br>
  #205 = String             #206          // WEAPON
  #206 = Utf8               WEAPON
  #207 = String             #208          // SWORD
  #208 = Utf8               SWORD
  #209 = String             #210          // BOW
  #210 = Utf8               BOW
  #211 = String             #212          // DAGGER
  #212 = Utf8               DAGGER
  #213 = String             #214          // POLE
  #214 = Utf8               POLE
  #215 = String             #216          // BLUNT
  #216 = Utf8               BLUNT
  #217 = String             #218          // DUAL
  #218 = Utf8               DUAL
  #219 = String             #220          // DUALFIST
  #220 = Utf8               DUALFIST
  #221 = String             #222          // ETC
  #222 = Utf8               ETC
  #223 = String             #224          // <table width=300>
  #224 = Utf8               <table width=300>
  #225 = String             #226          // <tr>
  #226 = Utf8               <tr>
  #227 = InvokeDynamic      #5:#228       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #228 = NameAndType        #98:#229      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #229 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #230 = String             #231          // </tr>
  #231 = Utf8               </tr>
  #232 = String             #233          // </table><br>
  #233 = Utf8               </table><br>
  #234 = String             #235          // HELMET
  #235 = Utf8               HELMET
  #236 = InvokeDynamic      #6:#228       // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #237 = InterfaceMethodref #138.#238     // java/util/List.get:(I)Ljava/lang/Object;
  #238 = NameAndType        #239:#240     // get:(I)Ljava/lang/Object;
  #239 = Utf8               get
  #240 = Utf8               (I)Ljava/lang/Object;
  #241 = Methodref          #85.#242      // ext/mods/dressme/holder/DressMeHolder.getType:()Lext/mods/dressme/holder/DressMeVisualType;
  #242 = NameAndType        #243:#244     // getType:()Lext/mods/dressme/holder/DressMeVisualType;
  #243 = Utf8               getType
  #244 = Utf8               ()Lext/mods/dressme/holder/DressMeVisualType;
  #245 = Fieldref           #246.#247     // ext/mods/dressme/holder/DressMeVisualType.WEAPON:Lext/mods/dressme/holder/DressMeVisualType;
  #246 = Class              #248          // ext/mods/dressme/holder/DressMeVisualType
  #247 = NameAndType        #206:#249     // WEAPON:Lext/mods/dressme/holder/DressMeVisualType;
  #248 = Utf8               ext/mods/dressme/holder/DressMeVisualType
  #249 = Utf8               Lext/mods/dressme/holder/DressMeVisualType;
  #250 = Methodref          #85.#251      // ext/mods/dressme/holder/DressMeHolder.getRightHandId:()I
  #251 = NameAndType        #252:#81      // getRightHandId:()I
  #252 = Utf8               getRightHandId
  #253 = Methodref          #85.#254      // ext/mods/dressme/holder/DressMeHolder.getHelmetId:()I
  #254 = NameAndType        #255:#81      // getHelmetId:()I
  #255 = Utf8               getHelmetId
  #256 = Methodref          #85.#257      // ext/mods/dressme/holder/DressMeHolder.getChestId:()I
  #257 = NameAndType        #258:#81      // getChestId:()I
  #258 = Utf8               getChestId
  #259 = String             #260          // <table width=300><tr>
  #260 = Utf8               <table width=300><tr>
  #261 = Methodref          #128.#262     // ext/mods/gameserver/handler/voicedcommandhandlers/skins.getIconName:(I)Ljava/lang/String;
  #262 = NameAndType        #263:#264     // getIconName:(I)Ljava/lang/String;
  #263 = Utf8               getIconName
  #264 = Utf8               (I)Ljava/lang/String;
  #265 = InvokeDynamic      #7:#97        // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #266 = InvokeDynamic      #8:#97        // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #267 = Methodref          #85.#268      // ext/mods/dressme/holder/DressMeHolder.getSkillId:()I
  #268 = NameAndType        #269:#81      // getSkillId:()I
  #269 = Utf8               getSkillId
  #270 = InvokeDynamic      #9:#271       // #9:makeConcatWithConstants:(I)Ljava/lang/String;
  #271 = NameAndType        #98:#264      // makeConcatWithConstants:(I)Ljava/lang/String;
  #272 = InvokeDynamic      #10:#271      // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #273 = String             #274          // <td><button value=\"Limpa\" action=\"bypass -h voiced_skin clean\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #274 = Utf8               <td><button value=\"Limpa\" action=\"bypass -h voiced_skin clean\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #275 = String             #276          // </tr></table>
  #276 = Utf8               </tr></table>
  #277 = String             #278          // </td></tr></table>
  #278 = Utf8               </td></tr></table>
  #279 = InvokeDynamic      #11:#97       // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #280 = String             #281          //
  #281 = Utf8
  #282 = InvokeDynamic      #12:#283      // #12:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #283 = NameAndType        #98:#284      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #284 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #285 = String             #286          // <td width=40></td>
  #286 = Utf8               <td width=40></td>
  #287 = String             #288          // <td width=200 align=center>Page
  #288 = Utf8               <td width=200 align=center>Page
  #289 = Methodref          #184.#290     // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #290 = NameAndType        #191:#291     // append:(I)Ljava/lang/StringBuilder;
  #291 = Utf8               (I)Ljava/lang/StringBuilder;
  #292 = String             #293          //  /
  #293 = Utf8                /
  #294 = String             #295          // </td>
  #295 = Utf8               </td>
  #296 = InvokeDynamic      #13:#283      // #13:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #297 = String             #298          // </center></body></html>
  #298 = Utf8               </center></body></html>
  #299 = Class              #300          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #300 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #301 = Methodref          #299.#302     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #302 = NameAndType        #5:#303       // "<init>":(I)V
  #303 = Utf8               (I)V
  #304 = Methodref          #184.#305     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #305 = NameAndType        #306:#17      // toString:()Ljava/lang/String;
  #306 = Utf8               toString
  #307 = Methodref          #299.#308     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #308 = NameAndType        #309:#67      // setHtml:(Ljava/lang/String;)V
  #309 = Utf8               setHtml
  #310 = Methodref          #58.#311      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #311 = NameAndType        #312:#313     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #312 = Utf8               sendPacket
  #313 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #314 = Methodref          #315.#316     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #315 = Class              #317          // ext/mods/gameserver/data/xml/ItemData
  #316 = NameAndType        #72:#318      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #317 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #318 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #319 = Methodref          #315.#320     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #320 = NameAndType        #321:#322     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #321 = Utf8               getTemplate
  #322 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #323 = Methodref          #324.#325     // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #324 = Class              #326          // ext/mods/gameserver/model/item/kind/Item
  #325 = NameAndType        #327:#17      // getIcon:()Ljava/lang/String;
  #326 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #327 = Utf8               getIcon
  #328 = Fieldref           #128.#329     // ext/mods/gameserver/handler/voicedcommandhandlers/skins.VOICED_COMMANDS:[Ljava/lang/String;
  #329 = NameAndType        #330:#331     // VOICED_COMMANDS:[Ljava/lang/String;
  #330 = Utf8               VOICED_COMMANDS
  #331 = Utf8               [Ljava/lang/String;
  #332 = Methodref          #27.#333      // java/lang/String.isEmpty:()Z
  #333 = NameAndType        #334:#23      // isEmpty:()Z
  #334 = Utf8               isEmpty
  #335 = Methodref          #85.#336      // ext/mods/dressme/holder/DressMeHolder.getWeaponTypeVisual:()Ljava/lang/String;
  #336 = NameAndType        #337:#17      // getWeaponTypeVisual:()Ljava/lang/String;
  #337 = Utf8               getWeaponTypeVisual
  #338 = Methodref          #246.#305     // ext/mods/dressme/holder/DressMeVisualType.toString:()Ljava/lang/String;
  #339 = String             #340          // skin
  #340 = Utf8               skin
  #341 = Class              #342          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #342 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #343 = Utf8               ITEMS_PER_PAGE
  #344 = Utf8               I
  #345 = Utf8               ConstantValue
  #346 = Integer            4
  #347 = Utf8               Code
  #348 = Utf8               LineNumberTable
  #349 = Utf8               LocalVariableTable
  #350 = Utf8               this
  #351 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/skins;
  #352 = Utf8               useVoicedCommand
  #353 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #354 = Utf8               e
  #355 = Utf8               Ljava/lang/NumberFormatException;
  #356 = Utf8               skillId
  #357 = Utf8               cooldown
  #358 = Utf8               J
  #359 = Utf8               currentTime
  #360 = Utf8               Lext/mods/dressme/holder/DressMeHolder;
  #361 = Utf8               token
  #362 = Utf8               Ljava/lang/String;
  #363 = Utf8               command
  #364 = Utf8               player
  #365 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #366 = Utf8               target
  #367 = Utf8               st
  #368 = Utf8               Ljava/util/StringTokenizer;
  #369 = Utf8               StackMapTable
  #370 = Utf8               sub
  #371 = Utf8               i
  #372 = Utf8               subtypes
  #373 = Utf8               iconId
  #374 = Utf8               all
  #375 = Utf8               Ljava/util/List;
  #376 = Utf8               totalPages
  #377 = Utf8               start
  #378 = Utf8               end
  #379 = Utf8               sb
  #380 = Utf8               Ljava/lang/StringBuilder;
  #381 = Utf8               html
  #382 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #383 = Utf8               LocalVariableTypeTable
  #384 = Utf8               Ljava/util/List<Lext/mods/dressme/holder/DressMeHolder;>;
  #385 = Class              #331          // "[Ljava/lang/String;"
  #386 = Utf8               itemId
  #387 = Utf8               getVoicedCommandList
  #388 = Utf8               ()[Ljava/lang/String;
  #389 = Utf8               lambda$showSkins$1
  #390 = Utf8               (Ljava/lang/String;Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
  #391 = Utf8               lambda$showSkins$0
  #392 = Utf8               (Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
  #393 = Utf8               lambda$useVoicedCommand$0
  #394 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #395 = Utf8               <clinit>
  #396 = Utf8               SourceFile
  #397 = Utf8               skins.java
  #398 = Utf8               BootstrapMethods
  #399 = String             #400          // Skin aplicada: \u0001
  #400 = Utf8               Skin aplicada: \u0001
  #401 = String             #402          // Visual temporário: \u0001
  #402 = Utf8               Visual temporário: \u0001
  #403 = MethodType         #6            //  ()V
  #404 = MethodHandle       6:#405        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$useVoicedCommand$0:(Lext/mods/gameserver/model/actor/Player;)V
  #405 = Methodref          #128.#406     // ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$useVoicedCommand$0:(Lext/mods/gameserver/model/actor/Player;)V
  #406 = NameAndType        #393:#394     // lambda$useVoicedCommand$0:(Lext/mods/gameserver/model/actor/Player;)V
  #407 = MethodType         #408          //  (Ljava/lang/Object;)Z
  #408 = Utf8               (Ljava/lang/Object;)Z
  #409 = MethodHandle       6:#410        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$showSkins$0:(Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
  #410 = Methodref          #128.#411     // ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$showSkins$0:(Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
  #411 = NameAndType        #391:#392     // lambda$showSkins$0:(Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
  #412 = MethodType         #413          //  (Lext/mods/dressme/holder/DressMeHolder;)Z
  #413 = Utf8               (Lext/mods/dressme/holder/DressMeHolder;)Z
  #414 = MethodHandle       6:#415        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$showSkins$1:(Ljava/lang/String;Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
  #415 = Methodref          #128.#416     // ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$showSkins$1:(Ljava/lang/String;Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
  #416 = NameAndType        #389:#390     // lambda$showSkins$1:(Ljava/lang/String;Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
  #417 = String             #418          // <td><button value=\"\u0001\" action=\"bypass -h voiced_skin type WEAPON subtype \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #418 = Utf8               <td><button value=\"\u0001\" action=\"bypass -h voiced_skin type WEAPON subtype \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #419 = String             #420          // <td><button value=\"\u0001\" action=\"bypass -h voiced_skin type ARMOR subtype \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #420 = Utf8               <td><button value=\"\u0001\" action=\"bypass -h voiced_skin type ARMOR subtype \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #421 = String             #422          // <td width=32><img src=\"icon.\u0001\" width=32 height=32></td>
  #422 = Utf8               <td width=32><img src=\"icon.\u0001\" width=32 height=32></td>
  #423 = String             #424          // <td><font color=\"LEVEL\">\u0001</font>
  #424 = Utf8               <td><font color=\"LEVEL\">\u0001</font>
  #425 = String             #426          // <td><button value=\"Aplicar\" action=\"bypass -h voiced_skin apply \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #426 = Utf8               <td><button value=\"Aplicar\" action=\"bypass -h voiced_skin apply \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #427 = String             #428          // <td><button value=\"Testar\" action=\"bypass -h voiced_skin preview \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #428 = Utf8               <td><button value=\"Testar\" action=\"bypass -h voiced_skin preview \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #429 = String             #430          //  subtype \u0001
  #430 = Utf8                subtype \u0001
  #431 = String             #432          // <td><button value=\"<<\" action=\"bypass -h voiced_skin type \u0001\u0001 page \u0001\" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #432 = Utf8               <td><button value=\"<<\" action=\"bypass -h voiced_skin type \u0001\u0001 page \u0001\" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #433 = String             #434          // <td><button value=\">>\" action=\"bypass -h voiced_skin type \u0001\u0001 page \u0001\" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #434 = Utf8               <td><button value=\">>\" action=\"bypass -h voiced_skin type \u0001\u0001 page \u0001\" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #435 = MethodHandle       6:#436        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #436 = Methodref          #437.#438     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #437 = Class              #439          // java/lang/invoke/StringConcatFactory
  #438 = NameAndType        #98:#440      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #439 = Utf8               java/lang/invoke/StringConcatFactory
  #440 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #441 = MethodHandle       6:#442        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #442 = Methodref          #443.#444     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #443 = Class              #445          // java/lang/invoke/LambdaMetafactory
  #444 = NameAndType        #446:#447     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #445 = Utf8               java/lang/invoke/LambdaMetafactory
  #446 = Utf8               metafactory
  #447 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #448 = Utf8               InnerClasses
  #449 = Class              #450          // java/lang/invoke/MethodHandles$Lookup
  #450 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #451 = Class              #452          // java/lang/invoke/MethodHandles
  #452 = Utf8               java/lang/invoke/MethodHandles
  #453 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.skins();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/skins;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=15, args_size=4
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore        4
        12: aload         4
        14: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        17: pop
        18: ldc           #18                 // String ARMOR
        20: astore        5
        22: aconst_null
        23: astore        6
        25: iconst_1
        26: istore        7
        28: aload         4
        30: invokevirtual #20                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        33: ifeq          418
        36: aload         4
        38: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        41: astore        8
        43: ldc           #24                 // String type
        45: aload         8
        47: invokevirtual #26                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        50: ifeq          74
        53: aload         4
        55: invokevirtual #20                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        58: ifeq          74
        61: aload         4
        63: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        66: invokevirtual #32                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
        69: astore        5
        71: goto          415
        74: ldc           #35                 // String subtype
        76: aload         8
        78: invokevirtual #26                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        81: ifeq          105
        84: aload         4
        86: invokevirtual #20                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        89: ifeq          105
        92: aload         4
        94: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        97: invokevirtual #32                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
       100: astore        6
       102: goto          415
       105: ldc           #37                 // String page
       107: aload         8
       109: invokevirtual #26                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       112: ifeq          144
       115: aload         4
       117: invokevirtual #20                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       120: ifeq          144
       123: aload         4
       125: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       128: invokestatic  #39                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       131: istore        7
       133: goto          415
       136: astore        9
       138: iconst_1
       139: istore        7
       141: goto          415
       144: ldc           #47                 // String apply
       146: aload         8
       148: invokevirtual #26                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       151: ifeq          279
       154: aload         4
       156: invokevirtual #20                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       159: ifeq          279
       162: aload         4
       164: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       167: invokestatic  #39                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       170: istore        9
       172: ldc2_w        #49                 // long 900l
       175: lstore        10
       177: invokestatic  #51                 // Method java/lang/System.currentTimeMillis:()J
       180: lstore        12
       182: lload         12
       184: aload_2
       185: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.getLastDressMeSummonTime:()J
       188: lsub
       189: ldc2_w        #49                 // long 900l
       192: lcmp
       193: ifge          204
       196: aload_2
       197: ldc           #62                 // String You need to wait before summoning another DressMe.
       199: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       202: iconst_1
       203: ireturn
       204: invokestatic  #68                 // Method ext/mods/dressme/DressMeData.getInstance:()Lext/mods/dressme/DressMeData;
       207: iload         9
       209: invokevirtual #74                 // Method ext/mods/dressme/DressMeData.getBySkillId:(I)Lext/mods/dressme/holder/DressMeHolder;
       212: astore        14
       214: aload         14
       216: ifnull        276
       219: aload_2
       220: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       223: ifgt          234
       226: aload_2
       227: ldc           #82                 // String Este comando é exclusivo para jogadores VIP.
       229: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       232: iconst_1
       233: ireturn
       234: aload         14
       236: invokevirtual #84                 // Method ext/mods/dressme/holder/DressMeHolder.isVip:()Z
       239: ifne          249
       242: aload_2
       243: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       246: ifle          276
       249: aload_2
       250: aload         14
       252: iconst_1
       253: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.applyDressMe:(Lext/mods/dressme/holder/DressMeHolder;Z)V
       256: aload_2
       257: aload         14
       259: invokevirtual #93                 // Method ext/mods/dressme/holder/DressMeHolder.getName:()Ljava/lang/String;
       262: invokedynamic #96,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       267: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       270: aload_2
       271: lload         12
       273: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.setLastDressMeSummonTime:(J)V
       276: goto          415
       279: ldc           #104                // String preview
       281: aload         8
       283: invokevirtual #26                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       286: ifeq          397
       289: aload         4
       291: invokevirtual #20                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       294: ifeq          397
       297: aload         4
       299: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       302: invokestatic  #39                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       305: istore        9
       307: ldc2_w        #106                // long 60000l
       310: lstore        10
       312: invokestatic  #51                 // Method java/lang/System.currentTimeMillis:()J
       315: lstore        12
       317: lload         12
       319: aload_2
       320: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.getLastDressMeSummonTime:()J
       323: lsub
       324: ldc2_w        #106                // long 60000l
       327: lcmp
       328: ifge          339
       331: aload_2
       332: ldc           #62                 // String You need to wait before summoning another DressMe.
       334: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       337: iconst_1
       338: ireturn
       339: invokestatic  #68                 // Method ext/mods/dressme/DressMeData.getInstance:()Lext/mods/dressme/DressMeData;
       342: iload         9
       344: invokevirtual #74                 // Method ext/mods/dressme/DressMeData.getBySkillId:(I)Lext/mods/dressme/holder/DressMeHolder;
       347: astore        14
       349: aload         14
       351: ifnull        394
       354: aload_2
       355: aload         14
       357: iconst_0
       358: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.applyDressMe:(Lext/mods/dressme/holder/DressMeHolder;Z)V
       361: aload_2
       362: aload         14
       364: invokevirtual #93                 // Method ext/mods/dressme/holder/DressMeHolder.getName:()Ljava/lang/String;
       367: invokedynamic #108,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       372: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       375: aload_2
       376: invokedynamic #109,  0            // InvokeDynamic #2:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
       381: ldc2_w        #106                // long 60000l
       384: invokestatic  #113                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       387: pop
       388: aload_2
       389: lload         12
       391: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.setLastDressMeSummonTime:(J)V
       394: goto          415
       397: ldc           #119                // String clean
       399: aload         8
       401: invokevirtual #26                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       404: ifeq          415
       407: aload_2
       408: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.removeDressMeArmor:()V
       411: aload_2
       412: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.removeDressMeWeapon:()V
       415: goto          28
       418: aload_0
       419: aload_2
       420: aload         5
       422: iload         7
       424: aload         6
       426: invokevirtual #127                // Method showSkins:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;ILjava/lang/String;)V
       429: iconst_1
       430: ireturn
      Exception table:
         from    to  target type
           123   133   136   Class java/lang/NumberFormatException
      LineNumberTable:
        line 44: 0
        line 45: 12
        line 47: 18
        line 48: 22
        line 49: 25
        line 51: 28
        line 53: 36
        line 55: 43
        line 57: 61
        line 59: 74
        line 61: 92
        line 63: 105
        line 67: 123
        line 72: 133
        line 69: 136
        line 71: 138
        line 72: 141
        line 74: 144
        line 76: 162
        line 77: 172
        line 79: 177
        line 80: 182
        line 82: 196
        line 83: 202
        line 86: 204
        line 87: 214
        line 89: 219
        line 91: 226
        line 92: 232
        line 95: 234
        line 97: 249
        line 98: 256
        line 99: 270
        line 102: 276
        line 103: 279
        line 105: 297
        line 106: 307
        line 108: 312
        line 109: 317
        line 111: 331
        line 112: 337
        line 115: 339
        line 116: 349
        line 118: 354
        line 119: 361
        line 120: 375
        line 125: 388
        line 127: 394
        line 128: 397
        line 130: 407
        line 131: 411
        line 133: 415
        line 135: 418
        line 136: 429
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          138       3     9     e   Ljava/lang/NumberFormatException;
          172     104     9 skillId   I
          177      99    10 cooldown   J
          182      94    12 currentTime   J
          214      62    14  skin   Lext/mods/dressme/holder/DressMeHolder;
          307      87     9 skillId   I
          312      82    10 cooldown   J
          317      77    12 currentTime   J
          349      45    14  skin   Lext/mods/dressme/holder/DressMeHolder;
           43     372     8 token   Ljava/lang/String;
            0     431     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/skins;
            0     431     1 command   Ljava/lang/String;
            0     431     2 player   Lext/mods/gameserver/model/actor/Player;
            0     431     3 target   Ljava/lang/String;
           12     419     4    st   Ljava/util/StringTokenizer;
           22     409     5  type   Ljava/lang/String;
           25     406     6 subtype   Ljava/lang/String;
           28     403     7  page   I
      StackMapTable: number_of_entries = 15
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/skins, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class java/lang/String ]
        frame_type = 30 /* same */
        frame_type = 94 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 7 /* same */
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ int, long, long ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/dressme/holder/DressMeHolder ]
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/skins, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class java/lang/String ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ int, long, long ]
        frame_type = 248 /* chop */
          offset_delta = 54
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 2 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #328                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 279: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/skins;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #27                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc_w         #339                // String skin
         9: aastore
        10: putstatic     #328                // Field VOICED_COMMANDS:[Ljava/lang/String;
        13: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "skins.java"
BootstrapMethods:
  0: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #399 Skin aplicada: \u0001
  1: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #401 Visual temporário: \u0001
  2: #441 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #403 ()V
      #404 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$useVoicedCommand$0:(Lext/mods/gameserver/model/actor/Player;)V
      #403 ()V
  3: #441 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #407 (Ljava/lang/Object;)Z
      #409 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$showSkins$0:(Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
      #412 (Lext/mods/dressme/holder/DressMeHolder;)Z
  4: #441 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #407 (Ljava/lang/Object;)Z
      #414 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/skins.lambda$showSkins$1:(Ljava/lang/String;Ljava/lang/String;Lext/mods/dressme/holder/DressMeHolder;)Z
      #412 (Lext/mods/dressme/holder/DressMeHolder;)Z
  5: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #417 <td><button value=\"\u0001\" action=\"bypass -h voiced_skin type WEAPON subtype \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  6: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #419 <td><button value=\"\u0001\" action=\"bypass -h voiced_skin type ARMOR subtype \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  7: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #421 <td width=32><img src=\"icon.\u0001\" width=32 height=32></td>
  8: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #423 <td><font color=\"LEVEL\">\u0001</font>
  9: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #425 <td><button value=\"Aplicar\" action=\"bypass -h voiced_skin apply \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  10: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #427 <td><button value=\"Testar\" action=\"bypass -h voiced_skin preview \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  11: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #429  subtype \u0001
  12: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #431 <td><button value=\"<<\" action=\"bypass -h voiced_skin type \u0001\u0001 page \u0001\" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  13: #435 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #433 <td><button value=\">>\" action=\"bypass -h voiced_skin type \u0001\u0001 page \u0001\" width=40 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
InnerClasses:
  public static final #453= #449 of #451; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
