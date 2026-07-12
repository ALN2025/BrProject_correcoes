// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminMovieMaker
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminMovieMaker.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.class
  Last modified 9 de jul de 2026; size 8153 bytes
  MD5 checksum ca050d8709b02ec2eed603b5444fb41e
  Compiled from "AdminMovieMaker.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminMovieMaker implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #39                         // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 8, attributes: 3
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
   #18 = String             #19           // admin_movie
   #19 = Utf8               admin_movie
   #20 = Methodref          #21.#22       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #21 = Class              #23           // java/lang/String
   #22 = NameAndType        #24:#25       // startsWith:(Ljava/lang/String;)Z
   #23 = Utf8               java/lang/String
   #24 = Utf8               startsWith
   #25 = Utf8               (Ljava/lang/String;)Z
   #26 = Methodref          #21.#27       // java/lang/String.hashCode:()I
   #27 = NameAndType        #28:#29       // hashCode:()I
   #28 = Utf8               hashCode
   #29 = Utf8               ()I
   #30 = String             #31           // play
   #31 = Utf8               play
   #32 = Methodref          #21.#33       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #33 = NameAndType        #34:#35       // equals:(Ljava/lang/Object;)Z
   #34 = Utf8               equals
   #35 = Utf8               (Ljava/lang/Object;)Z
   #36 = String             #37           // broadcast
   #37 = Utf8               broadcast
   #38 = Methodref          #39.#40       // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.playMovie:(ILext/mods/gameserver/model/actor/Player;)V
   #39 = Class              #41           // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker
   #40 = NameAndType        #42:#43       // playMovie:(ILext/mods/gameserver/model/actor/Player;)V
   #41 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker
   #42 = Utf8               playMovie
   #43 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
   #44 = Class              #45           // java/lang/Exception
   #45 = Utf8               java/lang/Exception
   #46 = Methodref          #39.#47       // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
   #47 = NameAndType        #48:#49       // mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
   #48 = Utf8               mainHtm
   #49 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #50 = String             #51           // admin_sequence
   #51 = Utf8               admin_sequence
   #52 = Methodref          #7.#53        // java/util/StringTokenizer.hasMoreTokens:()Z
   #53 = NameAndType        #54:#55       // hasMoreTokens:()Z
   #54 = Utf8               hasMoreTokens
   #55 = Utf8               ()Z
   #56 = String             #57           // add
   #57 = Utf8               add
   #58 = String             #59           // delete
   #59 = Utf8               delete
   #60 = Class              #61           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #61 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #62 = Methodref          #60.#63       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #63 = NameAndType        #5:#64        // "<init>":(I)V
   #64 = Utf8               (I)V
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #66 = Class              #68           // ext/mods/gameserver/model/actor/Player
   #67 = NameAndType        #69:#70       // getLocale:()Ljava/util/Locale;
   #68 = Utf8               ext/mods/gameserver/model/actor/Player
   #69 = Utf8               getLocale
   #70 = Utf8               ()Ljava/util/Locale;
   #71 = String             #72           // html/admin/movie/add_sequence.htm
   #72 = Utf8               html/admin/movie/add_sequence.htm
   #73 = Methodref          #60.#74       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #74 = NameAndType        #75:#76       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #75 = Utf8               setFile
   #76 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #77 = Methodref          #66.#78       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #78 = NameAndType        #79:#80       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #79 = Utf8               sendPacket
   #80 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #81 = Methodref          #82.#83       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #82 = Class              #84           // java/lang/Integer
   #83 = NameAndType        #85:#86       // parseInt:(Ljava/lang/String;)I
   #84 = Utf8               java/lang/Integer
   #85 = Utf8               parseInt
   #86 = Utf8               (Ljava/lang/String;)I
   #87 = String             #88           // The sequence id is invalid.
   #88 = Utf8               The sequence id is invalid.
   #89 = Methodref          #66.#90       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #90 = NameAndType        #91:#92       // sendMessage:(Ljava/lang/String;)V
   #91 = Utf8               sendMessage
   #92 = Utf8               (Ljava/lang/String;)V
   #93 = Fieldref           #39.#94       // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker._sequences:Ljava/util/Map;
   #94 = NameAndType        #95:#96       // _sequences:Ljava/util/Map;
   #95 = Utf8               _sequences
   #96 = Utf8               Ljava/util/Map;
   #97 = Methodref          #82.#98       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #98 = NameAndType        #99:#100      // valueOf:(I)Ljava/lang/Integer;
   #99 = Utf8               valueOf
  #100 = Utf8               (I)Ljava/lang/Integer;
  #101 = InterfaceMethodref #102.#103     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #102 = Class              #104          // java/util/Map
  #103 = NameAndType        #105:#106     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #104 = Utf8               java/util/Map
  #105 = Utf8               get
  #106 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #107 = Class              #108          // ext/mods/gameserver/model/records/Sequence
  #108 = Utf8               ext/mods/gameserver/model/records/Sequence
  #109 = String             #110          // The sequence couldn\'t be updated.
  #110 = Utf8               The sequence couldn\'t be updated.
  #111 = String             #112          // html/admin/movie/edit_sequence.htm
  #112 = Utf8               html/admin/movie/edit_sequence.htm
  #113 = String             #114          // %sId%
  #114 = Utf8               %sId%
  #115 = Methodref          #107.#116     // ext/mods/gameserver/model/records/Sequence.sequenceId:()I
  #116 = NameAndType        #117:#29      // sequenceId:()I
  #117 = Utf8               sequenceId
  #118 = Methodref          #60.#119      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #119 = NameAndType        #120:#121     // replace:(Ljava/lang/String;I)V
  #120 = Utf8               replace
  #121 = Utf8               (Ljava/lang/String;I)V
  #122 = String             #123          // %sDist%
  #123 = Utf8               %sDist%
  #124 = Methodref          #107.#125     // ext/mods/gameserver/model/records/Sequence.dist:()I
  #125 = NameAndType        #126:#29      // dist:()I
  #126 = Utf8               dist
  #127 = String             #128          // %sYaw%
  #128 = Utf8               %sYaw%
  #129 = Methodref          #107.#130     // ext/mods/gameserver/model/records/Sequence.yaw:()I
  #130 = NameAndType        #131:#29      // yaw:()I
  #131 = Utf8               yaw
  #132 = String             #133          // %sPitch%
  #133 = Utf8               %sPitch%
  #134 = Methodref          #107.#135     // ext/mods/gameserver/model/records/Sequence.pitch:()I
  #135 = NameAndType        #136:#29      // pitch:()I
  #136 = Utf8               pitch
  #137 = String             #138          // %sTime%
  #138 = Utf8               %sTime%
  #139 = Methodref          #107.#140     // ext/mods/gameserver/model/records/Sequence.time:()I
  #140 = NameAndType        #141:#29      // time:()I
  #141 = Utf8               time
  #142 = String             #143          // %sDuration%
  #143 = Utf8               %sDuration%
  #144 = Methodref          #107.#145     // ext/mods/gameserver/model/records/Sequence.duration:()I
  #145 = NameAndType        #146:#29      // duration:()I
  #146 = Utf8               duration
  #147 = String             #148          // %sTurn%
  #148 = Utf8               %sTurn%
  #149 = Methodref          #107.#150     // ext/mods/gameserver/model/records/Sequence.turn:()I
  #150 = NameAndType        #151:#29      // turn:()I
  #151 = Utf8               turn
  #152 = String             #153          // %sRise%
  #153 = Utf8               %sRise%
  #154 = Methodref          #107.#155     // ext/mods/gameserver/model/records/Sequence.rise:()I
  #155 = NameAndType        #156:#29      // rise:()I
  #156 = Utf8               rise
  #157 = String             #158          // %sWidescreen%
  #158 = Utf8               %sWidescreen%
  #159 = Methodref          #107.#160     // ext/mods/gameserver/model/records/Sequence.widescreen:()I
  #160 = NameAndType        #161:#29      // widescreen:()I
  #161 = Utf8               widescreen
  #162 = Methodref          #7.#163       // java/util/StringTokenizer.countTokens:()I
  #163 = NameAndType        #164:#29      // countTokens:()I
  #164 = Utf8               countTokens
  #165 = String             #166          // Some arguments are missing.
  #166 = Utf8               Some arguments are missing.
  #167 = Class              #168          // ext/mods/gameserver/model/WorldObject
  #168 = Utf8               ext/mods/gameserver/model/WorldObject
  #169 = Methodref          #39.#170      // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
  #170 = NameAndType        #171:#172     // getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
  #171 = Utf8               getTarget
  #172 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
  #173 = InvokeDynamic      #0:#174       // #0:apply:(ILext/mods/gameserver/model/WorldObject;IIIIIIII)Ljava/util/function/Function;
  #174 = NameAndType        #175:#176     // apply:(ILext/mods/gameserver/model/WorldObject;IIIIIIII)Ljava/util/function/Function;
  #175 = Utf8               apply
  #176 = Utf8               (ILext/mods/gameserver/model/WorldObject;IIIIIIII)Ljava/util/function/Function;
  #177 = InterfaceMethodref #102.#178     // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #178 = NameAndType        #179:#180     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #179 = Utf8               computeIfAbsent
  #180 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #181 = InterfaceMethodref #102.#182     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #182 = NameAndType        #183:#106     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #183 = Utf8               remove
  #184 = String             #185          // The sequence id doesn\'t exist.
  #185 = Utf8               The sequence id doesn\'t exist.
  #186 = String             #187          // You entered an invalid sequence id.
  #187 = Utf8               You entered an invalid sequence id.
  #188 = Class              #189          // ext/mods/gameserver/network/serverpackets/SpecialCamera
  #189 = Utf8               ext/mods/gameserver/network/serverpackets/SpecialCamera
  #190 = Methodref          #188.#191     // ext/mods/gameserver/network/serverpackets/SpecialCamera."<init>":(Lext/mods/gameserver/model/records/Sequence;)V
  #191 = NameAndType        #5:#192       // "<init>":(Lext/mods/gameserver/model/records/Sequence;)V
  #192 = Utf8               (Lext/mods/gameserver/model/records/Sequence;)V
  #193 = Methodref          #66.#194      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #194 = NameAndType        #195:#80      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #195 = Utf8               broadcastPacket
  #196 = Fieldref           #39.#197      // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.ADMIN_COMMANDS:[Ljava/lang/String;
  #197 = NameAndType        #198:#199     // ADMIN_COMMANDS:[Ljava/lang/String;
  #198 = Utf8               ADMIN_COMMANDS
  #199 = Utf8               [Ljava/lang/String;
  #200 = InterfaceMethodref #102.#201     // java/util/Map.isEmpty:()Z
  #201 = NameAndType        #202:#55      // isEmpty:()Z
  #202 = Utf8               isEmpty
  #203 = String             #204          // html/admin/movie/main_empty.htm
  #204 = Utf8               html/admin/movie/main_empty.htm
  #205 = Class              #206          // java/lang/StringBuilder
  #206 = Utf8               java/lang/StringBuilder
  #207 = Methodref          #205.#3       // java/lang/StringBuilder."<init>":()V
  #208 = InterfaceMethodref #102.#209     // java/util/Map.values:()Ljava/util/Collection;
  #209 = NameAndType        #210:#211     // values:()Ljava/util/Collection;
  #210 = Utf8               values
  #211 = Utf8               ()Ljava/util/Collection;
  #212 = InterfaceMethodref #213.#214     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #213 = Class              #215          // java/util/Collection
  #214 = NameAndType        #216:#217     // iterator:()Ljava/util/Iterator;
  #215 = Utf8               java/util/Collection
  #216 = Utf8               iterator
  #217 = Utf8               ()Ljava/util/Iterator;
  #218 = InterfaceMethodref #219.#220     // java/util/Iterator.hasNext:()Z
  #219 = Class              #221          // java/util/Iterator
  #220 = NameAndType        #222:#55      // hasNext:()Z
  #221 = Utf8               java/util/Iterator
  #222 = Utf8               hasNext
  #223 = InterfaceMethodref #219.#224     // java/util/Iterator.next:()Ljava/lang/Object;
  #224 = NameAndType        #225:#226     // next:()Ljava/lang/Object;
  #225 = Utf8               next
  #226 = Utf8               ()Ljava/lang/Object;
  #227 = String             #228          // <tr><td>
  #228 = Utf8               <tr><td>
  #229 = String             #230          // </td><td>
  #230 = Utf8               </td><td>
  #231 = String             #232          // </td></tr>
  #232 = Utf8               </td></tr>
  #233 = Methodref          #234.#235     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #234 = Class              #236          // ext/mods/commons/lang/StringUtil
  #235 = NameAndType        #237:#238     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #236 = Utf8               ext/mods/commons/lang/StringUtil
  #237 = Utf8               append
  #238 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #239 = String             #240          // html/admin/movie/main_notempty.htm
  #240 = Utf8               html/admin/movie/main_notempty.htm
  #241 = String             #242          // %sequences%
  #242 = Utf8               %sequences%
  #243 = Methodref          #205.#244     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #244 = NameAndType        #245:#17      // toString:()Ljava/lang/String;
  #245 = Utf8               toString
  #246 = Methodref          #60.#247      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #247 = NameAndType        #120:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #248 = String             #249          // There is nothing to play.
  #249 = Utf8               There is nothing to play.
  #250 = Long               500l
  #252 = InvokeDynamic      #1:#253       // #1:run:(ILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Sequence;)Ljava/lang/Runnable;
  #253 = NameAndType        #254:#255     // run:(ILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Sequence;)Ljava/lang/Runnable;
  #254 = Utf8               run
  #255 = Utf8               (ILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Sequence;)Ljava/lang/Runnable;
  #256 = Methodref          #257.#258     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #257 = Class              #259          // ext/mods/commons/pool/ThreadPool
  #258 = NameAndType        #260:#261     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #259 = Utf8               ext/mods/commons/pool/ThreadPool
  #260 = Utf8               schedule
  #261 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #262 = Methodref          #167.#263     // ext/mods/gameserver/model/WorldObject.getObjectId:()I
  #263 = NameAndType        #264:#29      // getObjectId:()I
  #264 = Utf8               getObjectId
  #265 = Methodref          #107.#266     // ext/mods/gameserver/model/records/Sequence."<init>":(IIIIIIIIII)V
  #266 = NameAndType        #5:#267       // "<init>":(IIIIIIIIII)V
  #267 = Utf8               (IIIIIIIIII)V
  #268 = Class              #269          // java/util/TreeMap
  #269 = Utf8               java/util/TreeMap
  #270 = Methodref          #268.#3       // java/util/TreeMap."<init>":()V
  #271 = Class              #272          // ext/mods/gameserver/handler/IAdminCommandHandler
  #272 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #273 = Utf8               Signature
  #274 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/Sequence;>;
  #275 = Utf8               Code
  #276 = Utf8               LineNumberTable
  #277 = Utf8               LocalVariableTable
  #278 = Utf8               this
  #279 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker;
  #280 = Utf8               useAdminCommand
  #281 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #282 = Utf8               param
  #283 = Utf8               Ljava/lang/String;
  #284 = Utf8               e
  #285 = Utf8               Ljava/lang/Exception;
  #286 = Utf8               html
  #287 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #288 = Utf8               sequence
  #289 = Utf8               Lext/mods/gameserver/model/records/Sequence;
  #290 = Utf8               targetWorldObject
  #291 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #292 = Utf8               I
  #293 = Utf8               command
  #294 = Utf8               player
  #295 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #296 = Utf8               st
  #297 = Utf8               Ljava/util/StringTokenizer;
  #298 = Utf8               StackMapTable
  #299 = Utf8               getAdminCommandList
  #300 = Utf8               ()[Ljava/lang/String;
  #301 = Utf8               sb
  #302 = Utf8               Ljava/lang/StringBuilder;
  #303 = Utf8               timer
  #304 = Utf8               J
  #305 = Utf8               lambda$playMovie$0
  #306 = Utf8               (ILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Sequence;)V
  #307 = Utf8               lambda$useAdminCommand$0
  #308 = Utf8               (ILext/mods/gameserver/model/WorldObject;IIIIIIIILjava/lang/Integer;)Lext/mods/gameserver/model/records/Sequence;
  #309 = Utf8               s
  #310 = Utf8               Ljava/lang/Integer;
  #311 = Utf8               <clinit>
  #312 = Utf8               SourceFile
  #313 = Utf8               AdminMovieMaker.java
  #314 = Utf8               BootstrapMethods
  #315 = MethodType         #106          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #316 = MethodHandle       6:#317        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.lambda$useAdminCommand$0:(ILext/mods/gameserver/model/WorldObject;IIIIIIIILjava/lang/Integer;)Lext/mods/gameserver/model/records/Sequence;
  #317 = Methodref          #39.#318      // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.lambda$useAdminCommand$0:(ILext/mods/gameserver/model/WorldObject;IIIIIIIILjava/lang/Integer;)Lext/mods/gameserver/model/records/Sequence;
  #318 = NameAndType        #307:#308     // lambda$useAdminCommand$0:(ILext/mods/gameserver/model/WorldObject;IIIIIIIILjava/lang/Integer;)Lext/mods/gameserver/model/records/Sequence;
  #319 = MethodType         #320          //  (Ljava/lang/Integer;)Lext/mods/gameserver/model/records/Sequence;
  #320 = Utf8               (Ljava/lang/Integer;)Lext/mods/gameserver/model/records/Sequence;
  #321 = MethodType         #6            //  ()V
  #322 = MethodHandle       6:#323        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.lambda$playMovie$0:(ILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Sequence;)V
  #323 = Methodref          #39.#324      // ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.lambda$playMovie$0:(ILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Sequence;)V
  #324 = NameAndType        #305:#306     // lambda$playMovie$0:(ILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Sequence;)V
  #325 = MethodHandle       6:#326        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #326 = Methodref          #327.#328     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #327 = Class              #329          // java/lang/invoke/LambdaMetafactory
  #328 = NameAndType        #330:#331     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #329 = Utf8               java/lang/invoke/LambdaMetafactory
  #330 = Utf8               metafactory
  #331 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #332 = Utf8               InnerClasses
  #333 = Class              #334          // java/lang/invoke/MethodHandles$Lookup
  #334 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #335 = Class              #336          // java/lang/invoke/MethodHandles
  #336 = Utf8               java/lang/invoke/MethodHandles
  #337 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminMovieMaker();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=12, locals=17, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_1
        17: ldc           #18                 // String admin_movie
        19: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        22: ifeq          149
        25: aload_3
        26: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        29: astore        4
        31: aload         4
        33: astore        5
        35: iconst_m1
        36: istore        6
        38: aload         5
        40: invokevirtual #26                 // Method java/lang/String.hashCode:()I
        43: lookupswitch  { // 2

             -1618876223: 84

                 3443508: 68
                 default: 97
            }
        68: aload         5
        70: ldc           #30                 // String play
        72: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        75: ifeq          97
        78: iconst_0
        79: istore        6
        81: goto          97
        84: aload         5
        86: ldc           #36                 // String broadcast
        88: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        91: ifeq          97
        94: iconst_1
        95: istore        6
        97: iload         6
        99: lookupswitch  { // 2

                       0: 124

                       1: 132
                 default: 137
            }
       124: iconst_0
       125: aload_2
       126: invokestatic  #38                 // Method playMovie:(ILext/mods/gameserver/model/actor/Player;)V
       129: goto          137
       132: iconst_1
       133: aload_2
       134: invokestatic  #38                 // Method playMovie:(ILext/mods/gameserver/model/actor/Player;)V
       137: goto          902
       140: astore        4
       142: aload_2
       143: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       146: goto          902
       149: aload_1
       150: ldc           #50                 // String admin_sequence
       152: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       155: ifeq          902
       158: aload_3
       159: invokevirtual #52                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       162: ifne          170
       165: aload_2
       166: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       169: return
       170: aload_3
       171: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       174: astore        4
       176: aload         4
       178: astore        5
       180: iconst_m1
       181: istore        6
       183: aload         5
       185: invokevirtual #26                 // Method java/lang/String.hashCode:()I
       188: lookupswitch  { // 4

             -1618876223: 280

             -1335458389: 248

                   96417: 232

                 3443508: 264
                 default: 293
            }
       232: aload         5
       234: ldc           #56                 // String add
       236: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       239: ifeq          293
       242: iconst_0
       243: istore        6
       245: goto          293
       248: aload         5
       250: ldc           #58                 // String delete
       252: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       255: ifeq          293
       258: iconst_1
       259: istore        6
       261: goto          293
       264: aload         5
       266: ldc           #30                 // String play
       268: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       271: ifeq          293
       274: iconst_2
       275: istore        6
       277: goto          293
       280: aload         5
       282: ldc           #36                 // String broadcast
       284: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       287: ifeq          293
       290: iconst_3
       291: istore        6
       293: iload         6
       295: tableswitch   { // 0 to 3

                       0: 324

                       1: 720

                       2: 765

                       3: 835
                 default: 902
            }
       324: aload_3
       325: invokevirtual #52                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       328: ifne          359
       331: new           #60                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       334: dup
       335: iconst_0
       336: invokespecial #62                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       339: astore        7
       341: aload         7
       343: aload_2
       344: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       347: ldc           #71                 // String html/admin/movie/add_sequence.htm
       349: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       352: aload_2
       353: aload         7
       355: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       358: return
       359: aload_3
       360: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       363: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       366: istore        7
       368: iload         7
       370: ifge          384
       373: aload_2
       374: ldc           #87                 // String The sequence id is invalid.
       376: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       379: aload_2
       380: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       383: return
       384: aload_3
       385: invokevirtual #52                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       388: ifne          563
       391: getstatic     #93                 // Field _sequences:Ljava/util/Map;
       394: iload         7
       396: invokestatic  #97                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       399: invokeinterface #101,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       404: checkcast     #107                // class ext/mods/gameserver/model/records/Sequence
       407: astore        8
       409: aload         8
       411: ifnonnull     425
       414: aload_2
       415: ldc           #109                // String The sequence couldn\'t be updated.
       417: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       420: aload_2
       421: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       424: return
       425: new           #60                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       428: dup
       429: iconst_0
       430: invokespecial #62                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       433: astore        9
       435: aload         9
       437: aload_2
       438: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       441: ldc           #111                // String html/admin/movie/edit_sequence.htm
       443: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       446: aload         9
       448: ldc           #113                // String %sId%
       450: aload         8
       452: invokevirtual #115                // Method ext/mods/gameserver/model/records/Sequence.sequenceId:()I
       455: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       458: aload         9
       460: ldc           #122                // String %sDist%
       462: aload         8
       464: invokevirtual #124                // Method ext/mods/gameserver/model/records/Sequence.dist:()I
       467: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       470: aload         9
       472: ldc           #127                // String %sYaw%
       474: aload         8
       476: invokevirtual #129                // Method ext/mods/gameserver/model/records/Sequence.yaw:()I
       479: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       482: aload         9
       484: ldc           #132                // String %sPitch%
       486: aload         8
       488: invokevirtual #134                // Method ext/mods/gameserver/model/records/Sequence.pitch:()I
       491: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       494: aload         9
       496: ldc           #137                // String %sTime%
       498: aload         8
       500: invokevirtual #139                // Method ext/mods/gameserver/model/records/Sequence.time:()I
       503: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       506: aload         9
       508: ldc           #142                // String %sDuration%
       510: aload         8
       512: invokevirtual #144                // Method ext/mods/gameserver/model/records/Sequence.duration:()I
       515: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       518: aload         9
       520: ldc           #147                // String %sTurn%
       522: aload         8
       524: invokevirtual #149                // Method ext/mods/gameserver/model/records/Sequence.turn:()I
       527: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       530: aload         9
       532: ldc           #152                // String %sRise%
       534: aload         8
       536: invokevirtual #154                // Method ext/mods/gameserver/model/records/Sequence.rise:()I
       539: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       542: aload         9
       544: ldc           #157                // String %sWidescreen%
       546: aload         8
       548: invokevirtual #159                // Method ext/mods/gameserver/model/records/Sequence.widescreen:()I
       551: invokevirtual #118                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       554: aload_2
       555: aload         9
       557: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       560: goto          708
       563: aload_3
       564: invokevirtual #162                // Method java/util/StringTokenizer.countTokens:()I
       567: bipush        8
       569: if_icmpeq     583
       572: aload_2
       573: ldc           #165                // String Some arguments are missing.
       575: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       578: aload_2
       579: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       582: return
       583: aload_0
       584: ldc           #167                // class ext/mods/gameserver/model/WorldObject
       586: aload_2
       587: iconst_1
       588: invokevirtual #169                // Method getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
       591: astore        8
       593: aload_3
       594: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       597: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       600: istore        9
       602: aload_3
       603: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       606: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       609: istore        10
       611: aload_3
       612: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       615: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       618: istore        11
       620: aload_3
       621: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       624: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       627: istore        12
       629: aload_3
       630: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       633: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       636: istore        13
       638: aload_3
       639: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       642: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       645: istore        14
       647: aload_3
       648: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       651: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       654: istore        15
       656: aload_3
       657: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       660: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       663: istore        16
       665: getstatic     #93                 // Field _sequences:Ljava/util/Map;
       668: iload         7
       670: invokestatic  #97                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       673: iload         7
       675: aload         8
       677: iload         9
       679: iload         10
       681: iload         11
       683: iload         12
       685: iload         13
       687: iload         14
       689: iload         15
       691: iload         16
       693: invokedynamic #173,  0            // InvokeDynamic #0:apply:(ILext/mods/gameserver/model/WorldObject;IIIIIIII)Ljava/util/function/Function;
       698: invokeinterface #177,  3          // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
       703: pop
       704: aload_2
       705: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       708: goto          902
       711: astore        7
       713: aload_2
       714: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       717: goto          902
       720: getstatic     #93                 // Field _sequences:Ljava/util/Map;
       723: aload_3
       724: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       727: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       730: invokestatic  #97                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       733: invokeinterface #181,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       738: ifnonnull     747
       741: aload_2
       742: ldc           #184                // String The sequence id doesn\'t exist.
       744: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       747: goto          758
       750: astore        7
       752: aload_2
       753: ldc           #186                // String You entered an invalid sequence id.
       755: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       758: aload_2
       759: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       762: goto          902
       765: getstatic     #93                 // Field _sequences:Ljava/util/Map;
       768: aload_3
       769: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       772: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       775: invokestatic  #97                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       778: invokeinterface #101,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       783: checkcast     #107                // class ext/mods/gameserver/model/records/Sequence
       786: astore        7
       788: aload         7
       790: ifnonnull     804
       793: aload_2
       794: ldc           #184                // String The sequence id doesn\'t exist.
       796: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       799: aload_2
       800: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       803: return
       804: aload_2
       805: new           #188                // class ext/mods/gameserver/network/serverpackets/SpecialCamera
       808: dup
       809: aload         7
       811: invokespecial #190                // Method ext/mods/gameserver/network/serverpackets/SpecialCamera."<init>":(Lext/mods/gameserver/model/records/Sequence;)V
       814: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       817: goto          902
       820: astore        7
       822: aload_2
       823: ldc           #186                // String You entered an invalid sequence id.
       825: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       828: aload_2
       829: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       832: goto          902
       835: getstatic     #93                 // Field _sequences:Ljava/util/Map;
       838: aload_3
       839: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       842: invokestatic  #81                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       845: invokestatic  #97                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       848: invokeinterface #101,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       853: checkcast     #107                // class ext/mods/gameserver/model/records/Sequence
       856: astore        7
       858: aload         7
       860: ifnonnull     874
       863: aload_2
       864: ldc           #184                // String The sequence id doesn\'t exist.
       866: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       869: aload_2
       870: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       873: return
       874: aload_2
       875: new           #188                // class ext/mods/gameserver/network/serverpackets/SpecialCamera
       878: dup
       879: aload         7
       881: invokespecial #190                // Method ext/mods/gameserver/network/serverpackets/SpecialCamera."<init>":(Lext/mods/gameserver/model/records/Sequence;)V
       884: invokevirtual #193                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       887: goto          902
       890: astore        7
       892: aload_2
       893: ldc           #186                // String You entered an invalid sequence id.
       895: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       898: aload_2
       899: invokestatic  #46                 // Method mainHtm:(Lext/mods/gameserver/model/actor/Player;)V
       902: return
      Exception table:
         from    to  target type
            25   137   140   Class java/lang/Exception
           359   383   711   Class java/lang/Exception
           384   424   711   Class java/lang/Exception
           425   582   711   Class java/lang/Exception
           583   708   711   Class java/lang/Exception
           720   747   750   Class java/lang/Exception
           765   803   820   Class java/lang/Exception
           804   817   820   Class java/lang/Exception
           835   873   890   Class java/lang/Exception
           874   887   890   Class java/lang/Exception
      LineNumberTable:
        line 47: 0
        line 48: 11
        line 50: 16
        line 54: 25
        line 55: 31
        line 58: 124
        line 59: 129
        line 62: 132
        line 69: 137
        line 66: 140
        line 68: 142
        line 69: 146
        line 71: 149
        line 73: 158
        line 75: 165
        line 76: 169
        line 79: 170
        line 80: 176
        line 83: 324
        line 85: 331
        line 86: 341
        line 87: 352
        line 88: 358
        line 93: 359
        line 94: 368
        line 96: 373
        line 97: 379
        line 98: 383
        line 101: 384
        line 103: 391
        line 104: 409
        line 106: 414
        line 107: 420
        line 108: 424
        line 111: 425
        line 112: 435
        line 113: 446
        line 114: 458
        line 115: 470
        line 116: 482
        line 117: 494
        line 118: 506
        line 119: 518
        line 120: 530
        line 121: 542
        line 122: 554
        line 123: 560
        line 126: 563
        line 128: 572
        line 129: 578
        line 130: 582
        line 133: 583
        line 135: 593
        line 136: 602
        line 137: 611
        line 138: 620
        line 139: 629
        line 140: 638
        line 141: 647
        line 142: 656
        line 144: 665
        line 145: 704
        line 151: 708
        line 148: 711
        line 150: 713
        line 152: 717
        line 157: 720
        line 158: 741
        line 163: 747
        line 160: 750
        line 162: 752
        line 164: 758
        line 165: 762
        line 170: 765
        line 171: 788
        line 173: 793
        line 174: 799
        line 175: 803
        line 178: 804
        line 184: 817
        line 180: 820
        line 182: 822
        line 183: 828
        line 185: 832
        line 190: 835
        line 191: 858
        line 193: 863
        line 194: 869
        line 195: 873
        line 198: 874
        line 204: 887
        line 200: 890
        line 202: 892
        line 203: 898
        line 208: 902
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31     106     4 param   Ljava/lang/String;
          142       4     4     e   Ljava/lang/Exception;
          341      18     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          409     151     8 sequence   Lext/mods/gameserver/model/records/Sequence;
          435     125     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          593     115     8 targetWorldObject   Lext/mods/gameserver/model/WorldObject;
          602     106     9  dist   I
          611      97    10   yaw   I
          620      88    11 pitch   I
          629      79    12  time   I
          638      70    13 duration   I
          647      61    14  turn   I
          656      52    15  rise   I
          665      43    16 widescreen   I
          368     340     7 sequenceId   I
          713       4     7     e   Ljava/lang/Exception;
          752       6     7     e   Ljava/lang/Exception;
          788      29     7 sequence   Lext/mods/gameserver/model/records/Sequence;
          822      10     7     e   Ljava/lang/Exception;
          858      29     7 sequence   Lext/mods/gameserver/model/records/Sequence;
          892      10     7     e   Ljava/lang/Exception;
          176     726     4 param   Ljava/lang/String;
            0     903     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker;
            0     903     1 command   Ljava/lang/String;
            0     903     2 player   Lext/mods/gameserver/model/actor/Player;
           11     892     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 33
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 7 /* same */
        frame_type = 248 /* chop */
          offset_delta = 4
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 8 /* same */
        frame_type = 20 /* same */
        frame_type = 254 /* append */
          offset_delta = 61
          locals = [ class java/lang/String, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 30 /* same */
        frame_type = 34 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/records/Sequence ]
        frame_type = 250 /* chop */
          offset_delta = 137
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 124
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 8 /* same */
        frame_type = 26 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/records/Sequence ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/records/Sequence ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 248 /* chop */
          offset_delta = 11

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #196                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #268                // class java/util/TreeMap
         3: dup
         4: invokespecial #270                // Method java/util/TreeMap."<init>":()V
         7: putstatic     #93                 // Field _sequences:Ljava/util/Map;
        10: iconst_2
        11: anewarray     #21                 // class java/lang/String
        14: dup
        15: iconst_0
        16: ldc           #18                 // String admin_movie
        18: aastore
        19: dup
        20: iconst_1
        21: ldc           #50                 // String admin_sequence
        23: aastore
        24: putstatic     #196                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        27: return
      LineNumberTable:
        line 36: 0
        line 38: 10
}
SourceFile: "AdminMovieMaker.java"
BootstrapMethods:
  0: #325 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #315 (Ljava/lang/Object;)Ljava/lang/Object;
      #316 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.lambda$useAdminCommand$0:(ILext/mods/gameserver/model/WorldObject;IIIIIIIILjava/lang/Integer;)Lext/mods/gameserver/model/records/Sequence;
      #319 (Ljava/lang/Integer;)Lext/mods/gameserver/model/records/Sequence;
  1: #325 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #321 ()V
      #322 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminMovieMaker.lambda$playMovie$0:(ILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Sequence;)V
      #321 ()V
InnerClasses:
  public static final #337= #333 of #335; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
