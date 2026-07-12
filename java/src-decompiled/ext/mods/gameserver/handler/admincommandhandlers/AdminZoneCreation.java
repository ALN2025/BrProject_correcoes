// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminZoneCreation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.class
  Last modified 9 de jul de 2026; size 11264 bytes
  MD5 checksum 86ab38cbee6c68282d228d91e0e7cbb6
  Compiled from "AdminZoneCreation.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #25                         // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 8, methods: 16, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = Methodref          #7.#10        // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #10 = NameAndType        #5:#11        // "<init>":(Ljava/lang/String;)V
   #11 = Utf8               (Ljava/lang/String;)V
   #12 = Methodref          #7.#13        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #13 = NameAndType        #14:#15       // nextToken:()Ljava/lang/String;
   #14 = Utf8               nextToken
   #15 = Utf8               ()Ljava/lang/String;
   #16 = String             #17           // admin_createzone
   #17 = Utf8               admin_createzone
   #18 = Methodref          #19.#20       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #19 = Class              #21           // java/lang/String
   #20 = NameAndType        #22:#23       // startsWith:(Ljava/lang/String;)Z
   #21 = Utf8               java/lang/String
   #22 = Utf8               startsWith
   #23 = Utf8               (Ljava/lang/String;)Z
   #24 = Methodref          #25.#26       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.openHtml:(Lext/mods/gameserver/model/actor/Player;)V
   #25 = Class              #27           // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation
   #26 = NameAndType        #28:#29       // openHtml:(Lext/mods/gameserver/model/actor/Player;)V
   #27 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation
   #28 = Utf8               openHtml
   #29 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #30 = String             #31           // admin_setZoneType
   #31 = Utf8               admin_setZoneType
   #32 = Methodref          #19.#33       // java/lang/String.trim:()Ljava/lang/String;
   #33 = NameAndType        #34:#15       // trim:()Ljava/lang/String;
   #34 = Utf8               trim
   #35 = Methodref          #19.#36       // java/lang/String.toUpperCase:()Ljava/lang/String;
   #36 = NameAndType        #37:#15       // toUpperCase:()Ljava/lang/String;
   #37 = Utf8               toUpperCase
   #38 = Methodref          #39.#40       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
   #39 = Class              #41           // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType
   #40 = NameAndType        #42:#43       // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
   #41 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType
   #42 = Utf8               valueOf
   #43 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
   #44 = Fieldref           #25.#45       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.zoneType:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
   #45 = NameAndType        #46:#47       // zoneType:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
   #46 = Utf8               zoneType
   #47 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
   #48 = Methodref          #39.#49       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType.ordinal:()I
   #49 = NameAndType        #50:#51       // ordinal:()I
   #50 = Utf8               ordinal
   #51 = Utf8               ()I
   #52 = Class              #53           // java/lang/Exception
   #53 = Utf8               java/lang/Exception
   #54 = String             #55           // Error: Invalid or missing zone type.
   #55 = Utf8               Error: Invalid or missing zone type.
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #57 = Class              #59           // ext/mods/gameserver/model/actor/Player
   #58 = NameAndType        #60:#11       // sendMessage:(Ljava/lang/String;)V
   #59 = Utf8               ext/mods/gameserver/model/actor/Player
   #60 = Utf8               sendMessage
   #61 = Methodref          #52.#62       // java/lang/Exception.printStackTrace:()V
   #62 = NameAndType        #63:#6        // printStackTrace:()V
   #63 = Utf8               printStackTrace
   #64 = String             #65           // admin_setType
   #65 = Utf8               admin_setType
   #66 = Methodref          #25.#67       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.clear:()V
   #67 = NameAndType        #68:#6        // clear:()V
   #68 = Utf8               clear
   #69 = Methodref          #70.#71       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #70 = Class              #72           // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
   #71 = NameAndType        #42:#73       // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #72 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
   #73 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #74 = Fieldref           #25.#75       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.shape:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #75 = NameAndType        #76:#77       // shape:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #76 = Utf8               shape
   #77 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #78 = Methodref          #70.#49       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.ordinal:()I
   #79 = String             #80           // You can add unlimited but atleast 3 coordinates in this shape.
   #80 = Utf8               You can add unlimited but atleast 3 coordinates in this shape.
   #81 = String             #82           // You must add 2 coordinates (in order to make a square) in this shape.
   #82 = Utf8               You must add 2 coordinates (in order to make a square) in this shape.
   #83 = String             #84           // You must add 1 coordinates and radius (in order to make a circle) in this shape.
   #84 = Utf8               You must add 1 coordinates and radius (in order to make a circle) in this shape.
   #85 = String             #86           // You have to select the zone shape first.
   #86 = Utf8               You have to select the zone shape first.
   #87 = String             #88           // admin_saveLoc
   #88 = Utf8               admin_saveLoc
   #89 = Methodref          #25.#90       // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.canSaveLoc:(Lext/mods/gameserver/model/actor/Player;)Z
   #90 = NameAndType        #91:#92       // canSaveLoc:(Lext/mods/gameserver/model/actor/Player;)Z
   #91 = Utf8               canSaveLoc
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #93 = Class              #94           // ext/mods/gameserver/model/location/Location
   #94 = Utf8               ext/mods/gameserver/model/location/Location
   #95 = Methodref          #57.#96       // ext/mods/gameserver/model/actor/Player.getX:()I
   #96 = NameAndType        #97:#51       // getX:()I
   #97 = Utf8               getX
   #98 = Methodref          #57.#99       // ext/mods/gameserver/model/actor/Player.getY:()I
   #99 = NameAndType        #100:#51      // getY:()I
  #100 = Utf8               getY
  #101 = Methodref          #57.#102      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #102 = NameAndType        #103:#51      // getZ:()I
  #103 = Utf8               getZ
  #104 = Methodref          #93.#105      // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #105 = NameAndType        #5:#106       // "<init>":(III)V
  #106 = Utf8               (III)V
  #107 = Fieldref           #25.#108      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.savedLocs:Ljava/util/List;
  #108 = NameAndType        #109:#110     // savedLocs:Ljava/util/List;
  #109 = Utf8               savedLocs
  #110 = Utf8               Ljava/util/List;
  #111 = InterfaceMethodref #112.#113     // java/util/List.add:(Ljava/lang/Object;)Z
  #112 = Class              #114          // java/util/List
  #113 = NameAndType        #115:#116     // add:(Ljava/lang/Object;)Z
  #114 = Utf8               java/util/List
  #115 = Utf8               add
  #116 = Utf8               (Ljava/lang/Object;)Z
  #117 = Methodref          #19.#118      // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #118 = NameAndType        #42:#119      // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #119 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #120 = InvokeDynamic      #0:#121       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #121 = NameAndType        #122:#123     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #122 = Utf8               makeConcatWithConstants
  #123 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #124 = String             #125          // admin_reset
  #125 = Utf8               admin_reset
  #126 = String             #127          // Reset completed.
  #127 = Utf8               Reset completed.
  #128 = String             #129          // admin_removeLoc
  #129 = Utf8               admin_removeLoc
  #130 = InterfaceMethodref #112.#131     // java/util/List.size:()I
  #131 = NameAndType        #132:#51      // size:()I
  #132 = Utf8               size
  #133 = InterfaceMethodref #112.#134     // java/util/List.remove:(I)Ljava/lang/Object;
  #134 = NameAndType        #135:#136     // remove:(I)Ljava/lang/Object;
  #135 = Utf8               remove
  #136 = Utf8               (I)Ljava/lang/Object;
  #137 = InvokeDynamic      #1:#121       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #138 = String             #139          // admin_storeLocs
  #139 = Utf8               admin_storeLocs
  #140 = InterfaceMethodref #112.#141     // java/util/List.isEmpty:()Z
  #141 = NameAndType        #142:#143     // isEmpty:()Z
  #142 = Utf8               isEmpty
  #143 = Utf8               ()Z
  #144 = String             #145          // Empty locs..
  #145 = Utf8               Empty locs..
  #146 = Methodref          #25.#147      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.store:(Lext/mods/gameserver/model/actor/Player;)V
  #147 = NameAndType        #148:#29      // store:(Lext/mods/gameserver/model/actor/Player;)V
  #148 = Utf8               store
  #149 = String             #150          // admin_setRad
  #150 = Utf8               admin_setRad
  #151 = Methodref          #7.#152       // java/util/StringTokenizer.hasMoreTokens:()Z
  #152 = NameAndType        #153:#143     // hasMoreTokens:()Z
  #153 = Utf8               hasMoreTokens
  #154 = Methodref          #25.#155      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.parseInt:(Ljava/lang/String;)I
  #155 = NameAndType        #156:#157     // parseInt:(Ljava/lang/String;)I
  #156 = Utf8               parseInt
  #157 = Utf8               (Ljava/lang/String;)I
  #158 = Methodref          #25.#159      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.setRadius:(I)Z
  #159 = NameAndType        #160:#161     // setRadius:(I)Z
  #160 = Utf8               setRadius
  #161 = Utf8               (I)Z
  #162 = String             #163          // Invalid value or shape.
  #163 = Utf8               Invalid value or shape.
  #164 = String             #165          // Radius stored.
  #165 = Utf8               Radius stored.
  #166 = InterfaceMethodref #112.#167     // java/util/List.stream:()Ljava/util/stream/Stream;
  #167 = NameAndType        #168:#169     // stream:()Ljava/util/stream/Stream;
  #168 = Utf8               stream
  #169 = Utf8               ()Ljava/util/stream/Stream;
  #170 = InvokeDynamic      #2:#171       // #2:applyAsInt:()Ljava/util/function/ToIntFunction;
  #171 = NameAndType        #172:#173     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #172 = Utf8               applyAsInt
  #173 = Utf8               ()Ljava/util/function/ToIntFunction;
  #174 = InterfaceMethodref #175.#176     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #175 = Class              #177          // java/util/stream/Stream
  #176 = NameAndType        #178:#179     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #177 = Utf8               java/util/stream/Stream
  #178 = Utf8               mapToInt
  #179 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #180 = InterfaceMethodref #181.#182     // java/util/stream/IntStream.sum:()I
  #181 = Class              #183          // java/util/stream/IntStream
  #182 = NameAndType        #184:#51      // sum:()I
  #183 = Utf8               java/util/stream/IntStream
  #184 = Utf8               sum
  #185 = Methodref          #186.#155     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #186 = Class              #187          // java/lang/Integer
  #187 = Utf8               java/lang/Integer
  #188 = Class              #189          // java/lang/NumberFormatException
  #189 = Utf8               java/lang/NumberFormatException
  #190 = Methodref          #25.#191      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.canStoreLocs:(Lext/mods/gameserver/model/actor/Player;)Z
  #191 = NameAndType        #192:#92      // canStoreLocs:(Lext/mods/gameserver/model/actor/Player;)Z
  #192 = Utf8               canStoreLocs
  #193 = String             #194          // coordinates%s.xml
  #194 = Utf8               coordinates%s.xml
  #195 = Methodref          #70.#196      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.name:()Ljava/lang/String;
  #196 = NameAndType        #197:#15      // name:()Ljava/lang/String;
  #197 = Utf8               name
  #198 = Methodref          #25.#199      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.getTimeStamp:()Ljava/lang/String;
  #199 = NameAndType        #200:#15      // getTimeStamp:()Ljava/lang/String;
  #200 = Utf8               getTimeStamp
  #201 = InvokeDynamic      #3:#202       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #202 = NameAndType        #122:#203     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #203 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #204 = Methodref          #19.#205      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #205 = NameAndType        #206:#207     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #206 = Utf8               format
  #207 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #208 = String             #209          //
  #209 = Utf8
  #210 = Class              #211          // java/io/BufferedWriter
  #211 = Utf8               java/io/BufferedWriter
  #212 = Class              #213          // java/io/FileWriter
  #213 = Utf8               java/io/FileWriter
  #214 = Methodref          #212.#10      // java/io/FileWriter."<init>":(Ljava/lang/String;)V
  #215 = Methodref          #210.#216     // java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
  #216 = NameAndType        #5:#217       // "<init>":(Ljava/io/Writer;)V
  #217 = Utf8               (Ljava/io/Writer;)V
  #218 = Class              #219          // java/io/File
  #219 = Utf8               java/io/File
  #220 = Methodref          #218.#10      // java/io/File."<init>":(Ljava/lang/String;)V
  #221 = Methodref          #218.#222     // java/io/File.getAbsolutePath:()Ljava/lang/String;
  #222 = NameAndType        #223:#15      // getAbsolutePath:()Ljava/lang/String;
  #223 = Utf8               getAbsolutePath
  #224 = String             #225          // \\\\
  #225 = Utf8               \\\\
  #226 = String             #227          // /
  #227 = Utf8               /
  #228 = Methodref          #19.#229      // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #229 = NameAndType        #230:#203     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #230 = Utf8               replaceAll
  #231 = Methodref          #25.#232      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.getHeadLine:()Ljava/lang/String;
  #232 = NameAndType        #233:#15      // getHeadLine:()Ljava/lang/String;
  #233 = Utf8               getHeadLine
  #234 = Methodref          #210.#235     // java/io/BufferedWriter.write:(Ljava/lang/String;)V
  #235 = NameAndType        #236:#11      // write:(Ljava/lang/String;)V
  #236 = Utf8               write
  #237 = InterfaceMethodref #112.#238     // java/util/List.iterator:()Ljava/util/Iterator;
  #238 = NameAndType        #239:#240     // iterator:()Ljava/util/Iterator;
  #239 = Utf8               iterator
  #240 = Utf8               ()Ljava/util/Iterator;
  #241 = InterfaceMethodref #242.#243     // java/util/Iterator.hasNext:()Z
  #242 = Class              #244          // java/util/Iterator
  #243 = NameAndType        #245:#143     // hasNext:()Z
  #244 = Utf8               java/util/Iterator
  #245 = Utf8               hasNext
  #246 = InterfaceMethodref #242.#247     // java/util/Iterator.next:()Ljava/lang/Object;
  #247 = NameAndType        #248:#249     // next:()Ljava/lang/Object;
  #248 = Utf8               next
  #249 = Utf8               ()Ljava/lang/Object;
  #250 = String             #251          // \t<node x=\"%s\" y=\"%s\" />\r\n
  #251 = Utf8               \t<node x=\"%s\" y=\"%s\" />\r\n
  #252 = Methodref          #93.#96       // ext/mods/gameserver/model/location/Location.getX:()I
  #253 = Methodref          #186.#254     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #254 = NameAndType        #42:#255      // valueOf:(I)Ljava/lang/Integer;
  #255 = Utf8               (I)Ljava/lang/Integer;
  #256 = Methodref          #93.#99       // ext/mods/gameserver/model/location/Location.getY:()I
  #257 = String             #258          // </zone>
  #258 = Utf8               </zone>
  #259 = Methodref          #210.#260     // java/io/BufferedWriter.close:()V
  #260 = NameAndType        #261:#6       // close:()V
  #261 = Utf8               close
  #262 = Class              #263          // java/lang/Throwable
  #263 = Utf8               java/lang/Throwable
  #264 = Methodref          #262.#265     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #265 = NameAndType        #266:#267     // addSuppressed:(Ljava/lang/Throwable;)V
  #266 = Utf8               addSuppressed
  #267 = Utf8               (Ljava/lang/Throwable;)V
  #268 = Class              #269          // java/io/IOException
  #269 = Utf8               java/io/IOException
  #270 = String             #271          // Couldn\'t store coordinates in %s file.
  #271 = Utf8               Couldn\'t store coordinates in %s file.
  #272 = Methodref          #268.#62      // java/io/IOException.printStackTrace:()V
  #273 = InvokeDynamic      #4:#121       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #274 = Class              #275          // java/text/SimpleDateFormat
  #275 = Utf8               java/text/SimpleDateFormat
  #276 = String             #277          // hh-mm-ss
  #277 = Utf8               hh-mm-ss
  #278 = Methodref          #274.#10      // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #279 = Class              #280          // java/util/Date
  #280 = Utf8               java/util/Date
  #281 = Methodref          #279.#3       // java/util/Date."<init>":()V
  #282 = Methodref          #274.#283     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #283 = NameAndType        #206:#284     // format:(Ljava/util/Date;)Ljava/lang/String;
  #284 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #285 = String             #286          // You have to set atleast 3 coordinates!
  #286 = Utf8               You have to set atleast 3 coordinates!
  #287 = String             #288          // You have to set 2 coordinates.
  #288 = Utf8               You have to set 2 coordinates.
  #289 = String             #290          // Only 1 location required for this shape.
  #290 = Utf8               Only 1 location required for this shape.
  #291 = String             #292          // You have reached the maximum locations for this shape.
  #292 = Utf8               You have reached the maximum locations for this shape.
  #293 = String             #294          // Only 1 locations required for this shape.
  #294 = Utf8               Only 1 locations required for this shape.
  #295 = String             #296          // <zone shape=\'NPoly\' minZ=\'%s\' maxZ=\'%s\'>\r\n
  #296 = Utf8               <zone shape=\'NPoly\' minZ=\'%s\' maxZ=\'%s\'>\r\n
  #297 = Methodref          #25.#298      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.calcZ:(Z)I
  #298 = NameAndType        #299:#300     // calcZ:(Z)I
  #299 = Utf8               calcZ
  #300 = Utf8               (Z)I
  #301 = String             #302          // <zone shape=\'Cuboid\' minZ=\'%s\' maxZ=\'%s\'>\r\n
  #302 = Utf8               <zone shape=\'Cuboid\' minZ=\'%s\' maxZ=\'%s\'>\r\n
  #303 = String             #304          // <zone shape=\'Cylinder\' minZ=\'%s\' maxZ=\'%s\' rad=\'%s\'>\r\n
  #304 = Utf8               <zone shape=\'Cylinder\' minZ=\'%s\' maxZ=\'%s\' rad=\'%s\'>\r\n
  #305 = Methodref          #25.#306      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.getRad:()I
  #306 = NameAndType        #307:#51      // getRad:()I
  #307 = Utf8               getRad
  #308 = Fieldref           #70.#309      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.Cylinder:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #309 = NameAndType        #310:#77      // Cylinder:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #310 = Utf8               Cylinder
  #311 = Fieldref           #25.#312      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.radius:I
  #312 = NameAndType        #313:#314     // radius:I
  #313 = Utf8               radius
  #314 = Utf8               I
  #315 = Class              #316          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #316 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #317 = Methodref          #315.#318     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #318 = NameAndType        #5:#319       // "<init>":(I)V
  #319 = Utf8               (I)V
  #320 = Methodref          #57.#321      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #321 = NameAndType        #322:#323     // getLocale:()Ljava/util/Locale;
  #322 = Utf8               getLocale
  #323 = Utf8               ()Ljava/util/Locale;
  #324 = String             #325          // html/admin/zone_create.htm
  #325 = Utf8               html/admin/zone_create.htm
  #326 = Methodref          #315.#327     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #327 = NameAndType        #328:#329     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #328 = Utf8               setFile
  #329 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #330 = Fieldref           #39.#331      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType.NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
  #331 = NameAndType        #332:#47      // NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
  #332 = Utf8               NONE
  #333 = Methodref          #39.#196      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType.name:()Ljava/lang/String;
  #334 = String             #335          // Empty
  #335 = Utf8               Empty
  #336 = String             #337          // %zoneShape%
  #337 = Utf8               %zoneShape%
  #338 = Methodref          #315.#339     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #339 = NameAndType        #340:#341     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #340 = Utf8               replace
  #341 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #342 = String             #343          // %zoneTypes%
  #343 = Utf8               %zoneTypes%
  #344 = String             #345          // %locsSize%
  #345 = Utf8               %locsSize%
  #346 = String             #347          // Locations Saved: Null
  #347 = Utf8               Locations Saved: Null
  #348 = String             #349          // %proceed%
  #349 = Utf8               %proceed%
  #350 = String             #351          // %undo%
  #351 = Utf8               %undo%
  #352 = String             #353          // <button value=\"Undo\" action=\"bypass admin_removeLoc\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\">
  #353 = Utf8               <button value=\"Undo\" action=\"bypass admin_removeLoc\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\">
  #354 = String             #355          // %dist%
  #355 = Utf8               %dist%
  #356 = InvokeDynamic      #5:#357       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #357 = NameAndType        #122:#358     // makeConcatWithConstants:(I)Ljava/lang/String;
  #358 = Utf8               (I)Ljava/lang/String;
  #359 = String             #360          // <button value=\"Store\" action=\"bypass admin_storeLocs\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\">
  #360 = Utf8               <button value=\"Store\" action=\"bypass admin_storeLocs\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\">
  #361 = String             #362          // Set the radius: <edit var=\"Radius\" width=110 height=15> <button value=\"Save\" action=\"bypass admin_setRad $Radius\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\">
  #362 = Utf8               Set the radius: <edit var=\"Radius\" width=110 height=15> <button value=\"Save\" action=\"bypass admin_setRad $Radius\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\">
  #363 = Methodref          #57.#364      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #364 = NameAndType        #365:#366     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #365 = Utf8               sendPacket
  #366 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #367 = Fieldref           #70.#368      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #368 = NameAndType        #332:#77      // NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #369 = InterfaceMethodref #112.#67      // java/util/List.clear:()V
  #370 = Fieldref           #25.#371      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.ADMIN_COMMANDS:[Ljava/lang/String;
  #371 = NameAndType        #372:#373     // ADMIN_COMMANDS:[Ljava/lang/String;
  #372 = Utf8               ADMIN_COMMANDS
  #373 = Utf8               [Ljava/lang/String;
  #374 = Methodref          #93.#102      // ext/mods/gameserver/model/location/Location.getZ:()I
  #375 = Class              #376          // java/util/ArrayList
  #376 = Utf8               java/util/ArrayList
  #377 = Methodref          #375.#3       // java/util/ArrayList."<init>":()V
  #378 = Class              #379          // ext/mods/gameserver/handler/IAdminCommandHandler
  #379 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #380 = Utf8               Signature
  #381 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #382 = Utf8               fileName
  #383 = Utf8               Ljava/lang/String;
  #384 = Utf8               ConstantValue
  #385 = Utf8               zDifference
  #386 = Integer            1000
  #387 = Utf8               maxLocs
  #388 = Utf8               Code
  #389 = Utf8               LineNumberTable
  #390 = Utf8               LocalVariableTable
  #391 = Utf8               this
  #392 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation;
  #393 = Utf8               useAdminCommand
  #394 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #395 = Utf8               input
  #396 = Utf8               e
  #397 = Utf8               Ljava/lang/Exception;
  #398 = Utf8               loc
  #399 = Utf8               Lext/mods/gameserver/model/location/Location;
  #400 = Utf8               command
  #401 = Utf8               activeChar
  #402 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #403 = Utf8               st
  #404 = Utf8               Ljava/util/StringTokenizer;
  #405 = Utf8               StackMapTable
  #406 = Utf8               minZ
  #407 = Utf8               Z
  #408 = Utf8               Ljava/lang/NumberFormatException;
  #409 = Utf8               file
  #410 = Utf8               Ljava/io/File;
  #411 = Utf8               writer
  #412 = Utf8               Ljava/io/BufferedWriter;
  #413 = Utf8               Ljava/io/IOException;
  #414 = Utf8               gm
  #415 = Utf8               fName
  #416 = Utf8               filePath
  #417 = Utf8               val
  #418 = Utf8               html
  #419 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #420 = Utf8               zoneTypeName
  #421 = Utf8               getAdminCommandList
  #422 = Utf8               ()[Ljava/lang/String;
  #423 = Utf8               lambda$calcZ$0
  #424 = Utf8               (Lext/mods/gameserver/model/location/Location;)I
  #425 = Utf8               <clinit>
  #426 = Utf8               SourceFile
  #427 = Utf8               AdminZoneCreation.java
  #428 = Utf8               NestMembers
  #429 = Utf8               BootstrapMethods
  #430 = String             #431          // \u0001 saved..
  #431 = Utf8               \u0001 saved..
  #432 = String             #433          // \u0001 removed.
  #433 = Utf8               \u0001 removed.
  #434 = MethodType         #435          //  (Ljava/lang/Object;)I
  #435 = Utf8               (Ljava/lang/Object;)I
  #436 = MethodHandle       6:#437        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.lambda$calcZ$0:(Lext/mods/gameserver/model/location/Location;)I
  #437 = Methodref          #25.#438      // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.lambda$calcZ$0:(Lext/mods/gameserver/model/location/Location;)I
  #438 = NameAndType        #423:#424     // lambda$calcZ$0:(Lext/mods/gameserver/model/location/Location;)I
  #439 = MethodType         #424          //  (Lext/mods/gameserver/model/location/Location;)I
  #440 = String             #441          // _\u0001_\u0001
  #441 = Utf8               _\u0001_\u0001
  #442 = String             #443          // Coordinates has been successfully stored at \u0001
  #443 = Utf8               Coordinates has been successfully stored at \u0001
  #444 = String             #445          // Locations Saved: \u0001
  #445 = Utf8               Locations Saved: \u0001
  #446 = MethodHandle       6:#447        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #447 = Methodref          #448.#449     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #448 = Class              #450          // java/lang/invoke/StringConcatFactory
  #449 = NameAndType        #122:#451     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #450 = Utf8               java/lang/invoke/StringConcatFactory
  #451 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #452 = MethodHandle       6:#453        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #453 = Methodref          #454.#455     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #454 = Class              #456          // java/lang/invoke/LambdaMetafactory
  #455 = NameAndType        #457:#458     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #456 = Utf8               java/lang/invoke/LambdaMetafactory
  #457 = Utf8               metafactory
  #458 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #459 = Utf8               InnerClasses
  #460 = Utf8               ZoneType
  #461 = Utf8               ZoneShape
  #462 = Class              #463          // java/lang/invoke/MethodHandles$Lookup
  #463 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #464 = Class              #465          // java/lang/invoke/MethodHandles
  #465 = Utf8               java/lang/invoke/MethodHandles
  #466 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation();
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
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: invokespecial #9                  // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
         8: astore_3
         9: aload_3
        10: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        13: pop
        14: aload_1
        15: ldc           #16                 // String admin_createzone
        17: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        20: ifeq          30
        23: aload_2
        24: invokestatic  #24                 // Method openHtml:(Lext/mods/gameserver/model/actor/Player;)V
        27: goto          451
        30: aload_1
        31: ldc           #30                 // String admin_setZoneType
        33: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        36: ifeq          121
        39: aload_3
        40: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        43: invokevirtual #32                 // Method java/lang/String.trim:()Ljava/lang/String;
        46: invokevirtual #35                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
        49: astore        4
        51: aload         4
        53: invokestatic  #38                 // Method ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
        56: putstatic     #44                 // Field zoneType:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
        59: getstatic     #44                 // Field zoneType:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
        62: invokevirtual #48                 // Method ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType.ordinal:()I
        65: tableswitch   { // 0 to 2

                       0: 92

                       1: 95

                       2: 98
                 default: 98
            }
        92: goto          98
        95: goto          98
        98: goto          114
       101: astore        4
       103: aload_2
       104: ldc           #54                 // String Error: Invalid or missing zone type.
       106: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       109: aload         4
       111: invokevirtual #61                 // Method java/lang/Exception.printStackTrace:()V
       114: aload_2
       115: invokestatic  #24                 // Method openHtml:(Lext/mods/gameserver/model/actor/Player;)V
       118: goto          451
       121: aload_1
       122: ldc           #64                 // String admin_setType
       124: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       127: ifeq          216
       130: invokestatic  #66                 // Method clear:()V
       133: aload_3
       134: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       137: invokestatic  #69                 // Method ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
       140: putstatic     #74                 // Field shape:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
       143: getstatic     #74                 // Field shape:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
       146: invokevirtual #78                 // Method ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.ordinal:()I
       149: tableswitch   { // 1 to 3

                       1: 176

                       2: 185

                       3: 194
                 default: 203
            }
       176: aload_2
       177: ldc           #79                 // String You can add unlimited but atleast 3 coordinates in this shape.
       179: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       182: goto          209
       185: aload_2
       186: ldc           #81                 // String You must add 2 coordinates (in order to make a square) in this shape.
       188: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       191: goto          209
       194: aload_2
       195: ldc           #83                 // String You must add 1 coordinates and radius (in order to make a circle) in this shape.
       197: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       200: goto          209
       203: aload_2
       204: ldc           #85                 // String You have to select the zone shape first.
       206: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       209: aload_2
       210: invokestatic  #24                 // Method openHtml:(Lext/mods/gameserver/model/actor/Player;)V
       213: goto          451
       216: aload_1
       217: ldc           #87                 // String admin_saveLoc
       219: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       222: ifeq          287
       225: aload_2
       226: invokestatic  #89                 // Method canSaveLoc:(Lext/mods/gameserver/model/actor/Player;)Z
       229: ifeq          280
       232: new           #93                 // class ext/mods/gameserver/model/location/Location
       235: dup
       236: aload_2
       237: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
       240: aload_2
       241: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
       244: aload_2
       245: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       248: invokespecial #104                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       251: astore        4
       253: getstatic     #107                // Field savedLocs:Ljava/util/List;
       256: aload         4
       258: invokeinterface #111,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       263: ifeq          280
       266: aload_2
       267: aload         4
       269: invokestatic  #117                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       272: invokedynamic #120,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       277: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       280: aload_2
       281: invokestatic  #24                 // Method openHtml:(Lext/mods/gameserver/model/actor/Player;)V
       284: goto          451
       287: aload_1
       288: ldc           #124                // String admin_reset
       290: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       293: ifeq          312
       296: invokestatic  #66                 // Method clear:()V
       299: aload_2
       300: ldc           #126                // String Reset completed.
       302: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       305: aload_2
       306: invokestatic  #24                 // Method openHtml:(Lext/mods/gameserver/model/actor/Player;)V
       309: goto          451
       312: aload_1
       313: ldc           #128                // String admin_removeLoc
       315: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       318: ifeq          369
       321: getstatic     #107                // Field savedLocs:Ljava/util/List;
       324: invokeinterface #130,  1          // InterfaceMethod java/util/List.size:()I
       329: ifle          362
       332: aload_2
       333: getstatic     #107                // Field savedLocs:Ljava/util/List;
       336: getstatic     #107                // Field savedLocs:Ljava/util/List;
       339: invokeinterface #130,  1          // InterfaceMethod java/util/List.size:()I
       344: iconst_1
       345: isub
       346: invokeinterface #133,  2          // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
       351: invokestatic  #117                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       354: invokedynamic #137,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       359: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       362: aload_2
       363: invokestatic  #24                 // Method openHtml:(Lext/mods/gameserver/model/actor/Player;)V
       366: goto          451
       369: aload_1
       370: ldc           #138                // String admin_storeLocs
       372: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       375: ifeq          403
       378: getstatic     #107                // Field savedLocs:Ljava/util/List;
       381: invokeinterface #140,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       386: ifeq          396
       389: aload_2
       390: ldc           #144                // String Empty locs..
       392: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       395: return
       396: aload_2
       397: invokestatic  #146                // Method store:(Lext/mods/gameserver/model/actor/Player;)V
       400: goto          451
       403: aload_1
       404: ldc           #149                // String admin_setRad
       406: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       409: ifeq          451
       412: aload_3
       413: invokevirtual #151                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       416: ifeq          432
       419: aload_3
       420: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       423: invokestatic  #154                // Method parseInt:(Ljava/lang/String;)I
       426: invokestatic  #158                // Method setRadius:(I)Z
       429: ifne          441
       432: aload_2
       433: ldc           #162                // String Invalid value or shape.
       435: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       438: goto          447
       441: aload_2
       442: ldc           #164                // String Radius stored.
       444: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       447: aload_2
       448: invokestatic  #24                 // Method openHtml:(Lext/mods/gameserver/model/actor/Player;)V
       451: return
      Exception table:
         from    to  target type
            39    98   101   Class java/lang/Exception
      LineNumberTable:
        line 76: 0
        line 77: 9
        line 78: 14
        line 79: 23
        line 80: 30
        line 84: 39
        line 86: 51
        line 88: 59
        line 92: 92
        line 95: 95
        line 105: 98
        line 101: 101
        line 103: 103
        line 104: 109
        line 107: 114
        line 110: 121
        line 112: 130
        line 113: 133
        line 114: 143
        line 117: 176
        line 118: 182
        line 120: 185
        line 121: 191
        line 123: 194
        line 124: 200
        line 126: 203
        line 128: 209
        line 130: 216
        line 132: 225
        line 134: 232
        line 135: 253
        line 136: 266
        line 138: 280
        line 140: 287
        line 142: 296
        line 143: 299
        line 144: 305
        line 146: 312
        line 148: 321
        line 149: 332
        line 150: 362
        line 152: 369
        line 154: 378
        line 156: 389
        line 157: 395
        line 159: 396
        line 161: 403
        line 163: 412
        line 164: 432
        line 166: 441
        line 168: 447
        line 170: 451
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      47     4 input   Ljava/lang/String;
          103      11     4     e   Ljava/lang/Exception;
          253      27     4   loc   Lext/mods/gameserver/model/location/Location;
            0     452     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation;
            0     452     1 command   Ljava/lang/String;
            0     452     2 activeChar   Lext/mods/gameserver/model/actor/Player;
            9     443     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 24
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/util/StringTokenizer ]
        frame_type = 252 /* append */
          offset_delta = 61
          locals = [ class java/lang/String ]
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 6 /* same */
        frame_type = 54 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 5 /* same */
        frame_type = 6 /* same */
        frame_type = 63 /* same */
        frame_type = 6 /* same */
        frame_type = 24 /* same */
        frame_type = 49 /* same */
        frame_type = 6 /* same */
        frame_type = 26 /* same */
        frame_type = 6 /* same */
        frame_type = 28 /* same */
        frame_type = 8 /* same */
        frame_type = 5 /* same */
        frame_type = 3 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #370                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 381: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #375                // class java/util/ArrayList
         3: dup
         4: invokespecial #377                // Method java/util/ArrayList."<init>":()V
         7: putstatic     #107                // Field savedLocs:Ljava/util/List;
        10: getstatic     #367                // Field ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
        13: putstatic     #74                 // Field shape:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
        16: iconst_0
        17: putstatic     #311                // Field radius:I
        20: bipush        8
        22: anewarray     #19                 // class java/lang/String
        25: dup
        26: iconst_0
        27: ldc           #16                 // String admin_createzone
        29: aastore
        30: dup
        31: iconst_1
        32: ldc           #64                 // String admin_setType
        34: aastore
        35: dup
        36: iconst_2
        37: ldc           #149                // String admin_setRad
        39: aastore
        40: dup
        41: iconst_3
        42: ldc           #87                 // String admin_saveLoc
        44: aastore
        45: dup
        46: iconst_4
        47: ldc           #124                // String admin_reset
        49: aastore
        50: dup
        51: iconst_5
        52: ldc           #128                // String admin_removeLoc
        54: aastore
        55: dup
        56: bipush        6
        58: ldc           #138                // String admin_storeLocs
        60: aastore
        61: dup
        62: bipush        7
        64: ldc           #30                 // String admin_setZoneType
        66: aastore
        67: putstatic     #370                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        70: getstatic     #330                // Field ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType.NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
        73: putstatic     #44                 // Field zoneType:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType;
        76: return
      LineNumberTable:
        line 37: 0
        line 39: 10
        line 42: 16
        line 52: 20
        line 63: 70
}
SourceFile: "AdminZoneCreation.java"
NestMembers:
  ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneType
  ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
BootstrapMethods:
  0: #446 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #430 \u0001 saved..
  1: #446 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #432 \u0001 removed.
  2: #452 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #434 (Ljava/lang/Object;)I
      #436 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation.lambda$calcZ$0:(Lext/mods/gameserver/model/location/Location;)I
      #439 (Lext/mods/gameserver/model/location/Location;)I
  3: #446 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #440 _\u0001_\u0001
  4: #446 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #442 Coordinates has been successfully stored at \u0001
  5: #446 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #444 Locations Saved: \u0001
InnerClasses:
  public static final #466= #462 of #464; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
