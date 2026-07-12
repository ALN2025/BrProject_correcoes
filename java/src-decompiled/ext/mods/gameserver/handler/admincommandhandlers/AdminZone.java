// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminZone
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminZone.class
  Last modified 9 de jul de 2026; size 6486 bytes
  MD5 checksum 478728f38a0262fb6d17582e8d9f3193
  Compiled from "AdminZone.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminZone implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #23                         // ext/mods/gameserver/handler/admincommandhandlers/AdminZone
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 3
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
   #18 = Methodref          #7.#19        // java/util/StringTokenizer.hasMoreTokens:()Z
   #19 = NameAndType        #20:#21       // hasMoreTokens:()Z
   #20 = Utf8               hasMoreTokens
   #21 = Utf8               ()Z
   #22 = Methodref          #23.#24       // ext/mods/gameserver/handler/admincommandhandlers/AdminZone.showHtml:(Lext/mods/gameserver/model/actor/Player;)V
   #23 = Class              #25           // ext/mods/gameserver/handler/admincommandhandlers/AdminZone
   #24 = NameAndType        #26:#27       // showHtml:(Lext/mods/gameserver/model/actor/Player;)V
   #25 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminZone
   #26 = Utf8               showHtml
   #27 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #28 = Methodref          #29.#30       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #29 = Class              #31           // java/lang/String
   #30 = NameAndType        #32:#17       // toLowerCase:()Ljava/lang/String;
   #31 = Utf8               java/lang/String
   #32 = Utf8               toLowerCase
   #33 = Methodref          #29.#34       // java/lang/String.hashCode:()I
   #34 = NameAndType        #35:#36       // hashCode:()I
   #35 = Utf8               hashCode
   #36 = Utf8               ()I
   #37 = String             #38           // show
   #38 = Utf8               show
   #39 = Methodref          #29.#40       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #40 = NameAndType        #41:#42       // equals:(Ljava/lang/Object;)Z
   #41 = Utf8               equals
   #42 = Utf8               (Ljava/lang/Object;)Z
   #43 = String             #44           // ZONE
   #44 = Utf8               ZONE
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #46 = Class              #48           // ext/mods/gameserver/model/actor/Player
   #47 = NameAndType        #49:#50       // getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #48 = Utf8               ext/mods/gameserver/model/actor/Player
   #49 = Utf8               getDebugPacket
   #50 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #51 = Methodref          #52.#53       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
   #52 = Class              #54           // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #53 = NameAndType        #55:#6        // reset:()V
   #54 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #55 = Utf8               reset
   #56 = String             #57           // all
   #57 = Utf8               all
   #58 = String             #59           // clear
   #59 = Utf8               clear
   #60 = Methodref          #46.#61       // ext/mods/gameserver/model/actor/Player.getZones:(Z)Ljava/util/List;
   #61 = NameAndType        #62:#63       // getZones:(Z)Ljava/util/List;
   #62 = Utf8               getZones
   #63 = Utf8               (Z)Ljava/util/List;
   #64 = InterfaceMethodref #65.#66       // java/util/List.iterator:()Ljava/util/Iterator;
   #65 = Class              #67           // java/util/List
   #66 = NameAndType        #68:#69       // iterator:()Ljava/util/Iterator;
   #67 = Utf8               java/util/List
   #68 = Utf8               iterator
   #69 = Utf8               ()Ljava/util/Iterator;
   #70 = InterfaceMethodref #71.#72       // java/util/Iterator.hasNext:()Z
   #71 = Class              #73           // java/util/Iterator
   #72 = NameAndType        #74:#21       // hasNext:()Z
   #73 = Utf8               java/util/Iterator
   #74 = Utf8               hasNext
   #75 = InterfaceMethodref #71.#76       // java/util/Iterator.next:()Ljava/lang/Object;
   #76 = NameAndType        #77:#78       // next:()Ljava/lang/Object;
   #77 = Utf8               next
   #78 = Utf8               ()Ljava/lang/Object;
   #79 = Class              #80           // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #80 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #81 = Methodref          #79.#82       // ext/mods/gameserver/model/zone/type/subtype/ZoneType.visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
   #82 = NameAndType        #83:#84       // visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
   #83 = Utf8               visualizeZone
   #84 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
   #85 = Methodref          #52.#86       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
   #86 = NameAndType        #87:#27       // sendTo:(Lext/mods/gameserver/model/actor/Player;)V
   #87 = Utf8               sendTo
   #88 = Methodref          #89.#90       // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #89 = Class              #91           // ext/mods/gameserver/data/manager/ZoneManager
   #90 = NameAndType        #92:#93       // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #91 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #92 = Utf8               getInstance
   #93 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #94 = Methodref          #95.#96       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #95 = Class              #97           // java/lang/Integer
   #96 = NameAndType        #98:#99       // parseInt:(Ljava/lang/String;)I
   #97 = Utf8               java/lang/Integer
   #98 = Utf8               parseInt
   #99 = Utf8               (Ljava/lang/String;)I
  #100 = Methodref          #89.#101      // ext/mods/gameserver/data/manager/ZoneManager.getZoneById:(I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #101 = NameAndType        #102:#103     // getZoneById:(I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #102 = Utf8               getZoneById
  #103 = Utf8               (I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #104 = Class              #105          // java/lang/Exception
  #105 = Utf8               java/lang/Exception
  #106 = String             #107          // Invalid parameter for //zone show.
  #107 = Utf8               Invalid parameter for //zone show.
  #108 = Methodref          #46.#109      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #109 = NameAndType        #110:#111     // sendMessage:(Ljava/lang/String;)V
  #110 = Utf8               sendMessage
  #111 = Utf8               (Ljava/lang/String;)V
  #112 = Methodref          #46.#113      // ext/mods/gameserver/model/actor/Player.getX:()I
  #113 = NameAndType        #114:#36      // getX:()I
  #114 = Utf8               getX
  #115 = Methodref          #46.#116      // ext/mods/gameserver/model/actor/Player.getY:()I
  #116 = NameAndType        #117:#36      // getY:()I
  #117 = Utf8               getY
  #118 = Class              #119          // ext/mods/gameserver/model/World
  #119 = Utf8               ext/mods/gameserver/model/World
  #120 = Integer            -131072
  #121 = Integer            32768
  #122 = Integer            -262144
  #123 = Methodref          #124.#125     // ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #124 = Class              #126          // ext/mods/gameserver/data/xml/RestartPointData
  #125 = NameAndType        #92:#127      // getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #126 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
  #127 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
  #128 = Methodref          #124.#129     // ext/mods/gameserver/data/xml/RestartPointData.getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #129 = NameAndType        #130:#131     // getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #130 = Utf8               getRestartPoint
  #131 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #132 = Methodref          #124.#133     // ext/mods/gameserver/data/xml/RestartPointData.getCalculatedRestartPoint:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartPoint;
  #133 = NameAndType        #134:#135     // getCalculatedRestartPoint:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartPoint;
  #134 = Utf8               getCalculatedRestartPoint
  #135 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartPoint;
  #136 = Class              #137          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #137 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #138 = Methodref          #136.#139     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #139 = NameAndType        #5:#140       // "<init>":(I)V
  #140 = Utf8               (I)V
  #141 = Methodref          #46.#142      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #142 = NameAndType        #143:#144     // getLocale:()Ljava/util/Locale;
  #143 = Utf8               getLocale
  #144 = Utf8               ()Ljava/util/Locale;
  #145 = String             #146          // html/admin/zone.htm
  #146 = Utf8               html/admin/zone.htm
  #147 = Methodref          #136.#148     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #148 = NameAndType        #149:#150     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #149 = Utf8               setFile
  #150 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #151 = String             #152          // %GEOREGION%
  #152 = Utf8               %GEOREGION%
  #153 = InvokeDynamic      #0:#154       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #154 = NameAndType        #155:#156     // makeConcatWithConstants:(II)Ljava/lang/String;
  #155 = Utf8               makeConcatWithConstants
  #156 = Utf8               (II)Ljava/lang/String;
  #157 = Methodref          #136.#158     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #158 = NameAndType        #159:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #159 = Utf8               replace
  #160 = String             #161          // %RA%
  #161 = Utf8               %RA%
  #162 = Methodref          #124.#163     // ext/mods/gameserver/data/xml/RestartPointData.getRestartArea:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
  #163 = NameAndType        #164:#165     // getRestartArea:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
  #164 = Utf8               getRestartArea
  #165 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
  #166 = Methodref          #136.#167     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
  #167 = NameAndType        #159:#168     // replace:(Ljava/lang/String;Z)V
  #168 = Utf8               (Ljava/lang/String;Z)V
  #169 = String             #170          // %CALCULATED_RP%
  #170 = Utf8               %CALCULATED_RP%
  #171 = String             #172          // N/A
  #172 = Utf8               N/A
  #173 = Methodref          #174.#175     // ext/mods/gameserver/model/restart/RestartPoint.getName:()Ljava/lang/String;
  #174 = Class              #176          // ext/mods/gameserver/model/restart/RestartPoint
  #175 = NameAndType        #177:#17      // getName:()Ljava/lang/String;
  #176 = Utf8               ext/mods/gameserver/model/restart/RestartPoint
  #177 = Utf8               getName
  #178 = String             #179          // %CURRENT_RP%
  #179 = Utf8               %CURRENT_RP%
  #180 = String             #181          // %CURRENTLOC%
  #181 = Utf8               %CURRENTLOC%
  #182 = Methodref          #46.#183      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #183 = NameAndType        #184:#36      // getZ:()I
  #184 = Utf8               getZ
  #185 = InvokeDynamic      #1:#186       // #1:makeConcatWithConstants:(III)Ljava/lang/String;
  #186 = NameAndType        #155:#187     // makeConcatWithConstants:(III)Ljava/lang/String;
  #187 = Utf8               (III)Ljava/lang/String;
  #188 = Class              #189          // java/lang/StringBuilder
  #189 = Utf8               java/lang/StringBuilder
  #190 = Methodref          #188.#139     // java/lang/StringBuilder."<init>":(I)V
  #191 = Fieldref           #192.#193     // ext/mods/gameserver/enums/ZoneId.VALUES:[Lext/mods/gameserver/enums/ZoneId;
  #192 = Class              #194          // ext/mods/gameserver/enums/ZoneId
  #193 = NameAndType        #195:#196     // VALUES:[Lext/mods/gameserver/enums/ZoneId;
  #194 = Utf8               ext/mods/gameserver/enums/ZoneId
  #195 = Utf8               VALUES
  #196 = Utf8               [Lext/mods/gameserver/enums/ZoneId;
  #197 = Methodref          #46.#198      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #198 = NameAndType        #199:#200     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #199 = Utf8               isInsideZone
  #200 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #201 = String             #202          // <br1>
  #202 = Utf8               <br1>
  #203 = Methodref          #204.#205     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #204 = Class              #206          // ext/mods/commons/lang/StringUtil
  #205 = NameAndType        #207:#208     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #206 = Utf8               ext/mods/commons/lang/StringUtil
  #207 = Utf8               append
  #208 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #209 = String             #210          // %ZONES%
  #210 = Utf8               %ZONES%
  #211 = Methodref          #188.#212     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #212 = NameAndType        #213:#17      // toString:()Ljava/lang/String;
  #213 = Utf8               toString
  #214 = Methodref          #188.#215     // java/lang/StringBuilder.setLength:(I)V
  #215 = NameAndType        #216:#140     // setLength:(I)V
  #216 = Utf8               setLength
  #217 = Methodref          #118.#218     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #218 = NameAndType        #92:#219      // getInstance:()Lext/mods/gameserver/model/World;
  #219 = Utf8               ()Lext/mods/gameserver/model/World;
  #220 = Methodref          #118.#221     // ext/mods/gameserver/model/World.getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
  #221 = NameAndType        #222:#223     // getRegion:(II)Lext/mods/gameserver/model/WorldRegion;
  #222 = Utf8               getRegion
  #223 = Utf8               (II)Lext/mods/gameserver/model/WorldRegion;
  #224 = Methodref          #225.#226     // ext/mods/gameserver/model/WorldRegion.getZones:()Ljava/util/List;
  #225 = Class              #227          // ext/mods/gameserver/model/WorldRegion
  #226 = NameAndType        #62:#228      // getZones:()Ljava/util/List;
  #227 = Utf8               ext/mods/gameserver/model/WorldRegion
  #228 = Utf8               ()Ljava/util/List;
  #229 = Methodref          #79.#230      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInZone:(Lext/mods/gameserver/model/actor/Creature;)Z
  #230 = NameAndType        #231:#232     // isInZone:(Lext/mods/gameserver/model/actor/Creature;)Z
  #231 = Utf8               isInZone
  #232 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #233 = Methodref          #79.#234      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getId:()I
  #234 = NameAndType        #235:#36      // getId:()I
  #235 = Utf8               getId
  #236 = Methodref          #95.#237      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #237 = NameAndType        #238:#239     // valueOf:(I)Ljava/lang/Integer;
  #238 = Utf8               valueOf
  #239 = Utf8               (I)Ljava/lang/Integer;
  #240 = String             #241          // %ZLIST%
  #241 = Utf8               %ZLIST%
  #242 = Methodref          #46.#243      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #243 = NameAndType        #244:#245     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #244 = Utf8               sendPacket
  #245 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #246 = Fieldref           #23.#247      // ext/mods/gameserver/handler/admincommandhandlers/AdminZone.ADMIN_COMMANDS:[Ljava/lang/String;
  #247 = NameAndType        #248:#249     // ADMIN_COMMANDS:[Ljava/lang/String;
  #248 = Utf8               ADMIN_COMMANDS
  #249 = Utf8               [Ljava/lang/String;
  #250 = String             #251          // admin_zone
  #251 = Utf8               admin_zone
  #252 = Class              #253          // ext/mods/gameserver/handler/IAdminCommandHandler
  #253 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #254 = Utf8               Code
  #255 = Utf8               LineNumberTable
  #256 = Utf8               LocalVariableTable
  #257 = Utf8               this
  #258 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminZone;
  #259 = Utf8               useAdminCommand
  #260 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #261 = Utf8               zone
  #262 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #263 = Utf8               debug
  #264 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #265 = Utf8               param
  #266 = Utf8               Ljava/lang/String;
  #267 = Utf8               e
  #268 = Utf8               Ljava/lang/Exception;
  #269 = Utf8               command
  #270 = Utf8               player
  #271 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #272 = Utf8               st
  #273 = Utf8               Ljava/util/StringTokenizer;
  #274 = Utf8               StackMapTable
  #275 = Utf8               zoneId
  #276 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #277 = Utf8               zoneType
  #278 = Utf8               x
  #279 = Utf8               I
  #280 = Utf8               y
  #281 = Utf8               rx
  #282 = Utf8               ry
  #283 = Utf8               currentRp
  #284 = Utf8               Lext/mods/gameserver/model/restart/RestartPoint;
  #285 = Utf8               currentCrp
  #286 = Utf8               html
  #287 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #288 = Utf8               sb
  #289 = Utf8               Ljava/lang/StringBuilder;
  #290 = Class              #196          // "[Lext/mods/gameserver/enums/ZoneId;"
  #291 = Utf8               getAdminCommandList
  #292 = Utf8               ()[Ljava/lang/String;
  #293 = Utf8               <clinit>
  #294 = Utf8               SourceFile
  #295 = Utf8               AdminZone.java
  #296 = Utf8               BootstrapMethods
  #297 = String             #298          // \u0001_\u0001
  #298 = Utf8               \u0001_\u0001
  #299 = String             #300          // \u0001, \u0001, \u0001
  #300 = Utf8               \u0001, \u0001, \u0001
  #301 = MethodHandle       6:#302        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #302 = Methodref          #303.#304     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #303 = Class              #305          // java/lang/invoke/StringConcatFactory
  #304 = NameAndType        #155:#306     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #305 = Utf8               java/lang/invoke/StringConcatFactory
  #306 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #307 = Utf8               InnerClasses
  #308 = Class              #309          // java/lang/invoke/MethodHandles$Lookup
  #309 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #310 = Class              #311          // java/lang/invoke/MethodHandles
  #311 = Utf8               java/lang/invoke/MethodHandles
  #312 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminZone();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminZone;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=12, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_3
        17: invokevirtual #18                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        20: ifne          28
        23: aload_2
        24: invokestatic  #22                 // Method showHtml:(Lext/mods/gameserver/model/actor/Player;)V
        27: return
        28: aload_3
        29: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        32: invokevirtual #28                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        35: astore        4
        37: iconst_m1
        38: istore        5
        40: aload         4
        42: invokevirtual #33                 // Method java/lang/String.hashCode:()I
        45: lookupswitch  { // 1

                 3529469: 64
                 default: 77
            }
        64: aload         4
        66: ldc           #37                 // String show
        68: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        71: ifeq          77
        74: iconst_0
        75: istore        5
        77: iload         5
        79: lookupswitch  { // 1

                       0: 96
                 default: 318
            }
        96: aload_2
        97: ldc           #43                 // String ZONE
        99: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       102: astore        6
       104: aload         6
       106: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
       109: aload_3
       110: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       113: invokevirtual #28                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       116: astore        7
       118: aload         7
       120: astore        8
       122: iconst_m1
       123: istore        9
       125: aload         8
       127: invokevirtual #33                 // Method java/lang/String.hashCode:()I
       130: lookupswitch  { // 2

                   96673: 156

                94746189: 172
                 default: 185
            }
       156: aload         8
       158: ldc           #56                 // String all
       160: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       163: ifeq          185
       166: iconst_0
       167: istore        9
       169: goto          185
       172: aload         8
       174: ldc           #58                 // String clear
       176: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       179: ifeq          185
       182: iconst_1
       183: istore        9
       185: iload         9
       187: lookupswitch  { // 2

                       0: 212

                       1: 269
                 default: 282
            }
       212: aload_2
       213: iconst_0
       214: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getZones:(Z)Ljava/util/List;
       217: invokeinterface #64,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       222: astore        10
       224: aload         10
       226: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       231: ifeq          256
       234: aload         10
       236: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       241: checkcast     #79                 // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
       244: astore        11
       246: aload         11
       248: aload         6
       250: invokevirtual #81                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
       253: goto          224
       256: aload         6
       258: aload_2
       259: invokevirtual #85                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       262: aload_2
       263: invokestatic  #22                 // Method showHtml:(Lext/mods/gameserver/model/actor/Player;)V
       266: goto          304
       269: aload         6
       271: aload_2
       272: invokevirtual #85                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       275: aload_2
       276: invokestatic  #22                 // Method showHtml:(Lext/mods/gameserver/model/actor/Player;)V
       279: goto          304
       282: invokestatic  #88                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       285: aload         7
       287: invokestatic  #94                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       290: invokevirtual #100                // Method ext/mods/gameserver/data/manager/ZoneManager.getZoneById:(I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       293: aload         6
       295: invokevirtual #81                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
       298: aload         6
       300: aload_2
       301: invokevirtual #85                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       304: goto          322
       307: astore        6
       309: aload_2
       310: ldc           #106                // String Invalid parameter for //zone show.
       312: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       315: goto          322
       318: aload_2
       319: invokestatic  #22                 // Method showHtml:(Lext/mods/gameserver/model/actor/Player;)V
       322: return
      Exception table:
         from    to  target type
            96   304   307   Class java/lang/Exception
      LineNumberTable:
        line 45: 0
        line 46: 11
        line 48: 16
        line 50: 23
        line 51: 27
        line 54: 28
        line 59: 96
        line 60: 104
        line 62: 109
        line 63: 118
        line 66: 212
        line 67: 246
        line 69: 256
        line 71: 262
        line 72: 266
        line 75: 269
        line 77: 275
        line 78: 279
        line 81: 282
        line 83: 298
        line 90: 304
        line 87: 307
        line 89: 309
        line 91: 315
        line 94: 318
        line 97: 322
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          246       7    11  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
          104     200     6 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          118     186     7 param   Ljava/lang/String;
          309       6     6     e   Ljava/lang/Exception;
            0     323     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminZone;
            0     323     1 command   Ljava/lang/String;
            0     323     2 player   Lext/mods/gameserver/model/actor/Player;
           11     312     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 16
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/StringTokenizer ]
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/lang/String, int ]
        frame_type = 12 /* same */
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminZone, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminZone, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 249 /* chop */
          offset_delta = 3

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #246                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 140: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminZone;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #29                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #250                // String admin_zone
         8: aastore
         9: putstatic     #246                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 37: 0
}
SourceFile: "AdminZone.java"
BootstrapMethods:
  0: #301 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #297 \u0001_\u0001
  1: #301 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #299 \u0001, \u0001, \u0001
InnerClasses:
  public static final #312= #308 of #310; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
