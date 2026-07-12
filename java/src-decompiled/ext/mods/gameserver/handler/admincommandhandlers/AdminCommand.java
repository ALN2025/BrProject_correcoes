// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminCommand
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminCommand.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminCommand.class
  Last modified 9 de jul de 2026; size 6406 bytes
  MD5 checksum b74d682d0b7a10fe17cff09612726a86
  Compiled from "AdminCommand.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminCommand implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/handler/admincommandhandlers/AdminCommand
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // fakeplayers/
    #8 = Utf8               fakeplayers/
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/handler/admincommandhandlers/AdminCommand.fakesFolder:Ljava/lang/String;
   #10 = Class              #12           // ext/mods/gameserver/handler/admincommandhandlers/AdminCommand
   #11 = NameAndType        #13:#14       // fakesFolder:Ljava/lang/String;
   #12 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminCommand
   #13 = Utf8               fakesFolder
   #14 = Utf8               Ljava/lang/String;
   #15 = Methodref          #16.#17       // ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
   #16 = Class              #18           // ext/mods/fakeplayer/FakePlayerManager
   #17 = NameAndType        #19:#20       // getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
   #18 = Utf8               ext/mods/fakeplayer/FakePlayerManager
   #19 = Utf8               getInstance
   #20 = Utf8               ()Lext/mods/fakeplayer/FakePlayerManager;
   #21 = Methodref          #16.#22       // ext/mods/fakeplayer/FakePlayerManager.getFakePlayers:()Ljava/util/List;
   #22 = NameAndType        #23:#24       // getFakePlayers:()Ljava/util/List;
   #23 = Utf8               getFakePlayers
   #24 = Utf8               ()Ljava/util/List;
   #25 = InterfaceMethodref #26.#27       // java/util/List.size:()I
   #26 = Class              #28           // java/util/List
   #27 = NameAndType        #29:#30       // size:()I
   #28 = Utf8               java/util/List
   #29 = Utf8               size
   #30 = Utf8               ()I
   #31 = Class              #32           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #32 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #33 = Methodref          #31.#34       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #34 = NameAndType        #5:#35        // "<init>":(I)V
   #35 = Utf8               (I)V
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #37 = Class              #39           // ext/mods/gameserver/model/actor/Player
   #38 = NameAndType        #40:#41       // getLocale:()Ljava/util/Locale;
   #39 = Utf8               ext/mods/gameserver/model/actor/Player
   #40 = Utf8               getLocale
   #41 = Utf8               ()Ljava/util/Locale;
   #42 = String             #43           // html/admin/fakeplayers/index.htm
   #43 = Utf8               html/admin/fakeplayers/index.htm
   #44 = Methodref          #31.#45       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #45 = NameAndType        #46:#47       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #46 = Utf8               setFile
   #47 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #48 = String             #49           // %fakecount%
   #49 = Utf8               %fakecount%
   #50 = String             #51           // 0
   #51 = Utf8               0
   #52 = Methodref          #31.#53       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #53 = NameAndType        #54:#55       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #54 = Utf8               replace
   #55 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #56 = String             #57           // %taskcount%
   #57 = Utf8               %taskcount%
   #58 = Methodref          #59.#60       // ext/mods/fakeplayer/FakePlayerTaskManager.getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
   #59 = Class              #61           // ext/mods/fakeplayer/FakePlayerTaskManager
   #60 = NameAndType        #19:#62       // getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
   #61 = Utf8               ext/mods/fakeplayer/FakePlayerTaskManager
   #62 = Utf8               ()Lext/mods/fakeplayer/FakePlayerTaskManager;
   #63 = Methodref          #59.#64       // ext/mods/fakeplayer/FakePlayerTaskManager.getTaskCount:()I
   #64 = NameAndType        #65:#30       // getTaskCount:()I
   #65 = Utf8               getTaskCount
   #66 = Methodref          #31.#67       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #67 = NameAndType        #54:#68       // replace:(Ljava/lang/String;I)V
   #68 = Utf8               (Ljava/lang/String;I)V
   #69 = String             #70           // %list%
   #70 = Utf8               %list%
   #71 = String             #72           //
   #72 = Utf8
   #73 = String             #74           // %pages%
   #74 = Utf8               %pages%
   #75 = Methodref          #37.#76       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #76 = NameAndType        #77:#78       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #77 = Utf8               sendPacket
   #78 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #79 = Double             10.0d
   #81 = Methodref          #82.#83       // java/lang/Math.ceil:(D)D
   #82 = Class              #84           // java/lang/Math
   #83 = NameAndType        #85:#86       // ceil:(D)D
   #84 = Utf8               java/lang/Math
   #85 = Utf8               ceil
   #86 = Utf8               (D)D
   #87 = Methodref          #82.#88       // java/lang/Math.min:(II)I
   #88 = NameAndType        #89:#90       // min:(II)I
   #89 = Utf8               min
   #90 = Utf8               (II)I
   #91 = Methodref          #82.#92       // java/lang/Math.max:(II)I
   #92 = NameAndType        #93:#90       // max:(II)I
   #93 = Utf8               max
   #94 = Class              #95           // java/lang/StringBuilder
   #95 = Utf8               java/lang/StringBuilder
   #96 = String             #97           // <table width=300>
   #97 = Utf8               <table width=300>
   #98 = Methodref          #94.#99       // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
   #99 = NameAndType        #5:#100       // "<init>":(Ljava/lang/String;)V
  #100 = Utf8               (Ljava/lang/String;)V
  #101 = InterfaceMethodref #26.#102      // java/util/List.get:(I)Ljava/lang/Object;
  #102 = NameAndType        #103:#104     // get:(I)Ljava/lang/Object;
  #103 = Utf8               get
  #104 = Utf8               (I)Ljava/lang/Object;
  #105 = Class              #106          // ext/mods/fakeplayer/FakePlayer
  #106 = Utf8               ext/mods/fakeplayer/FakePlayer
  #107 = Methodref          #105.#108     // ext/mods/fakeplayer/FakePlayer.getName:()Ljava/lang/String;
  #108 = NameAndType        #109:#110     // getName:()Ljava/lang/String;
  #109 = Utf8               getName
  #110 = Utf8               ()Ljava/lang/String;
  #111 = InvokeDynamic      #0:#112       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #112 = NameAndType        #113:#114     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #113 = Utf8               makeConcatWithConstants
  #114 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #115 = Methodref          #94.#116      // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #116 = NameAndType        #117:#118     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #117 = Utf8               append
  #118 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #119 = String             #120          // </table>
  #120 = Utf8               </table>
  #121 = Methodref          #94.#3        // java/lang/StringBuilder."<init>":()V
  #122 = String             #123          // <table width=150><tr>
  #123 = Utf8               <table width=150><tr>
  #124 = String             #125          // <td><button value=\"1\" action=\"bypass -h admin_fakes 1\" width=32 height=16 back=\"sek.cbui94\" fore=\"sek.cbui92\"></button></td>
  #125 = Utf8               <td><button value=\"1\" action=\"bypass -h admin_fakes 1\" width=32 height=16 back=\"sek.cbui94\" fore=\"sek.cbui92\"></button></td>
  #126 = InvokeDynamic      #1:#127       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #127 = NameAndType        #113:#128     // makeConcatWithConstants:(I)Ljava/lang/String;
  #128 = Utf8               (I)Ljava/lang/String;
  #129 = InvokeDynamic      #2:#130       // #2:makeConcatWithConstants:(II)Ljava/lang/String;
  #130 = NameAndType        #113:#131     // makeConcatWithConstants:(II)Ljava/lang/String;
  #131 = Utf8               (II)Ljava/lang/String;
  #132 = String             #133          // </tr></table>
  #133 = Utf8               </tr></table>
  #134 = Methodref          #135.#136     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #135 = Class              #137          // java/lang/String
  #136 = NameAndType        #138:#128     // valueOf:(I)Ljava/lang/String;
  #137 = Utf8               java/lang/String
  #138 = Utf8               valueOf
  #139 = Methodref          #94.#140      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #140 = NameAndType        #141:#110     // toString:()Ljava/lang/String;
  #141 = Utf8               toString
  #142 = String             #143          // admin_fakes
  #143 = Utf8               admin_fakes
  #144 = Methodref          #135.#145     // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #145 = NameAndType        #146:#147     // startsWith:(Ljava/lang/String;)Z
  #146 = Utf8               startsWith
  #147 = Utf8               (Ljava/lang/String;)Z
  #148 = String             #149          //
  #149 = Utf8
  #150 = Methodref          #135.#151     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #151 = NameAndType        #152:#153     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #152 = Utf8               split
  #153 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #154 = Methodref          #10.#155      // ext/mods/gameserver/handler/admincommandhandlers/AdminCommand.showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
  #155 = NameAndType        #156:#157     // showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
  #156 = Utf8               showFakeDashboard
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #158 = Methodref          #159.#160     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #159 = Class              #161          // java/lang/Integer
  #160 = NameAndType        #162:#163     // parseInt:(Ljava/lang/String;)I
  #161 = Utf8               java/lang/Integer
  #162 = Utf8               parseInt
  #163 = Utf8               (Ljava/lang/String;)I
  #164 = Class              #165          // java/lang/Exception
  #165 = Utf8               java/lang/Exception
  #166 = String             #167          // admin_deletefake
  #167 = Utf8               admin_deletefake
  #168 = Methodref          #37.#169      // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #169 = NameAndType        #170:#171     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #170 = Utf8               getTarget
  #171 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #172 = Methodref          #105.#173     // ext/mods/fakeplayer/FakePlayer.despawnPlayer:()V
  #173 = NameAndType        #174:#6       // despawnPlayer:()V
  #174 = Utf8               despawnPlayer
  #175 = String             #176          // admin_spawnrandom
  #176 = Utf8               admin_spawnrandom
  #177 = Methodref          #37.#178      // ext/mods/gameserver/model/actor/Player.getX:()I
  #178 = NameAndType        #179:#30      // getX:()I
  #179 = Utf8               getX
  #180 = Methodref          #37.#181      // ext/mods/gameserver/model/actor/Player.getY:()I
  #181 = NameAndType        #182:#30      // getY:()I
  #182 = Utf8               getY
  #183 = Methodref          #37.#184      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #184 = NameAndType        #185:#30      // getZ:()I
  #185 = Utf8               getZ
  #186 = Methodref          #16.#187      // ext/mods/fakeplayer/FakePlayerManager.spawnPlayer:(III)Lext/mods/fakeplayer/FakePlayer;
  #187 = NameAndType        #188:#189     // spawnPlayer:(III)Lext/mods/fakeplayer/FakePlayer;
  #188 = Utf8               spawnPlayer
  #189 = Utf8               (III)Lext/mods/fakeplayer/FakePlayer;
  #190 = String             #191          // admin_spawnrandomgrupe
  #191 = Utf8               admin_spawnrandomgrupe
  #192 = Methodref          #16.#193      // ext/mods/fakeplayer/FakePlayerManager.spawnPlayerGroup:(IIII)Ljava/util/List;
  #193 = NameAndType        #194:#195     // spawnPlayerGroup:(IIII)Ljava/util/List;
  #194 = Utf8               spawnPlayerGroup
  #195 = Utf8               (IIII)Ljava/util/List;
  #196 = String             #197          // admin_findfake
  #197 = Utf8               admin_findfake
  #198 = String             #199          // Uso correto: //admin_findfake <nome>
  #199 = Utf8               Uso correto: //admin_findfake <nome>
  #200 = Methodref          #37.#201      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #201 = NameAndType        #202:#100     // sendMessage:(Ljava/lang/String;)V
  #202 = Utf8               sendMessage
  #203 = InterfaceMethodref #26.#204      // java/util/List.iterator:()Ljava/util/Iterator;
  #204 = NameAndType        #205:#206     // iterator:()Ljava/util/Iterator;
  #205 = Utf8               iterator
  #206 = Utf8               ()Ljava/util/Iterator;
  #207 = InterfaceMethodref #208.#209     // java/util/Iterator.hasNext:()Z
  #208 = Class              #210          // java/util/Iterator
  #209 = NameAndType        #211:#212     // hasNext:()Z
  #210 = Utf8               java/util/Iterator
  #211 = Utf8               hasNext
  #212 = Utf8               ()Z
  #213 = InterfaceMethodref #208.#214     // java/util/Iterator.next:()Ljava/lang/Object;
  #214 = NameAndType        #215:#216     // next:()Ljava/lang/Object;
  #215 = Utf8               next
  #216 = Utf8               ()Ljava/lang/Object;
  #217 = Methodref          #135.#218     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #218 = NameAndType        #219:#147     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #219 = Utf8               equalsIgnoreCase
  #220 = Methodref          #105.#178     // ext/mods/fakeplayer/FakePlayer.getX:()I
  #221 = Methodref          #105.#181     // ext/mods/fakeplayer/FakePlayer.getY:()I
  #222 = Methodref          #105.#184     // ext/mods/fakeplayer/FakePlayer.getZ:()I
  #223 = Methodref          #37.#224      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #224 = NameAndType        #225:#226     // teleportTo:(IIII)Z
  #225 = Utf8               teleportTo
  #226 = Utf8               (IIII)Z
  #227 = InvokeDynamic      #3:#112       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #228 = InvokeDynamic      #4:#112       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #229 = Fieldref           #10.#230      // ext/mods/gameserver/handler/admincommandhandlers/AdminCommand.ADMIN_COMMANDS:[Ljava/lang/String;
  #230 = NameAndType        #231:#232     // ADMIN_COMMANDS:[Ljava/lang/String;
  #231 = Utf8               ADMIN_COMMANDS
  #232 = Utf8               [Ljava/lang/String;
  #233 = Class              #234          // ext/mods/gameserver/handler/IAdminCommandHandler
  #234 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #235 = Utf8               ConstantValue
  #236 = Utf8               PAGE_SIZE
  #237 = Utf8               I
  #238 = Integer            10
  #239 = Utf8               MAX_VISIBLE_PAGES
  #240 = Integer            3
  #241 = Utf8               Code
  #242 = Utf8               LineNumberTable
  #243 = Utf8               LocalVariableTable
  #244 = Utf8               this
  #245 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminCommand;
  #246 = Utf8               html
  #247 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #248 = Utf8               fake
  #249 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #250 = Utf8               i
  #251 = Utf8               admin
  #252 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #253 = Utf8               page
  #254 = Utf8               allFakes
  #255 = Utf8               Ljava/util/List;
  #256 = Utf8               total
  #257 = Utf8               totalPages
  #258 = Utf8               start
  #259 = Utf8               end
  #260 = Utf8               list
  #261 = Utf8               Ljava/lang/StringBuilder;
  #262 = Utf8               pages
  #263 = Utf8               half
  #264 = Utf8               startPage
  #265 = Utf8               endPage
  #266 = Utf8               LocalVariableTypeTable
  #267 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
  #268 = Utf8               StackMapTable
  #269 = Utf8               useAdminCommand
  #270 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #271 = Utf8               parts
  #272 = Utf8               e
  #273 = Utf8               Ljava/lang/Exception;
  #274 = Utf8               fakePlayer
  #275 = Utf8               fakeName
  #276 = Utf8               targetFake
  #277 = Utf8               params
  #278 = Utf8               command
  #279 = Class              #232          // "[Ljava/lang/String;"
  #280 = Utf8               getAdminCommandList
  #281 = Utf8               ()[Ljava/lang/String;
  #282 = Utf8               <clinit>
  #283 = Utf8               SourceFile
  #284 = Utf8               AdminCommand.java
  #285 = Utf8               BootstrapMethods
  #286 = String             #287          // <tr><td align=left width=300><font color=\"LEVEL\">\u0001</font></td></tr>
  #287 = Utf8               <tr><td align=left width=300><font color=\"LEVEL\">\u0001</font></td></tr>
  #288 = String             #289          // <td><button value=\"\u0001\" action=\"\" width=32 height=16 back=\"sek.cbui92\" fore=\"sek.cbui94\"></button></td>
  #289 = Utf8               <td><button value=\"\u0001\" action=\"\" width=32 height=16 back=\"sek.cbui92\" fore=\"sek.cbui94\"></button></td>
  #290 = String             #291          // <td><button value=\"\u0001\" action=\"bypass -h admin_fakes \u0001\" width=32 height=16 back=\"sek.cbui94\" fore=\"sek.cbui92\"></button></td>
  #291 = Utf8               <td><button value=\"\u0001\" action=\"bypass -h admin_fakes \u0001\" width=32 height=16 back=\"sek.cbui94\" fore=\"sek.cbui92\"></button></td>
  #292 = String             #293          // Teletransportado para FakePlayer: \u0001
  #293 = Utf8               Teletransportado para FakePlayer: \u0001
  #294 = String             #295          // FakePlayer \u0001 não encontrado.
  #295 = Utf8               FakePlayer \u0001 não encontrado.
  #296 = MethodHandle       6:#297        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #297 = Methodref          #298.#299     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #298 = Class              #300          // java/lang/invoke/StringConcatFactory
  #299 = NameAndType        #113:#301     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #300 = Utf8               java/lang/invoke/StringConcatFactory
  #301 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #302 = Utf8               InnerClasses
  #303 = Class              #304          // java/lang/invoke/MethodHandles$Lookup
  #304 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #305 = Class              #306          // java/lang/invoke/MethodHandles
  #306 = Utf8               java/lang/invoke/MethodHandles
  #307 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminCommand();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: ldc           #7                  // String fakeplayers/
         7: putfield      #9                  // Field fakesFolder:Ljava/lang/String;
        10: return
      LineNumberTable:
        line 30: 0
        line 32: 4
        line 36: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminCommand;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=3
         0: aload_1
         1: ldc           #142                // String admin_fakes
         3: invokevirtual #144                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          56
         9: aload_1
        10: ldc           #148                // String
        12: invokevirtual #150                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        15: astore_3
        16: aload_3
        17: arraylength
        18: iconst_2
        19: if_icmpge     31
        22: aload_0
        23: aload_2
        24: iconst_1
        25: invokevirtual #154                // Method showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
        28: goto          46
        31: aload_3
        32: iconst_1
        33: aaload
        34: invokestatic  #158                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        37: istore        4
        39: aload_0
        40: aload_2
        41: iload         4
        43: invokevirtual #154                // Method showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
        46: goto          56
        49: astore_3
        50: aload_0
        51: aload_2
        52: iconst_1
        53: invokevirtual #154                // Method showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
        56: aload_1
        57: ldc           #166                // String admin_deletefake
        59: invokevirtual #144                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        62: ifeq          100
        65: aload_2
        66: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        69: ifnull        94
        72: aload_2
        73: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        76: instanceof    #105                // class ext/mods/fakeplayer/FakePlayer
        79: ifeq          94
        82: aload_2
        83: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        86: checkcast     #105                // class ext/mods/fakeplayer/FakePlayer
        89: astore_3
        90: aload_3
        91: invokevirtual #172                // Method ext/mods/fakeplayer/FakePlayer.despawnPlayer:()V
        94: aload_0
        95: aload_2
        96: iconst_1
        97: invokevirtual #154                // Method showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
       100: aload_1
       101: ldc           #175                // String admin_spawnrandom
       103: invokevirtual #144                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       106: ifeq          134
       109: invokestatic  #15                 // Method ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
       112: aload_2
       113: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       116: aload_2
       117: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       120: aload_2
       121: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       124: invokevirtual #186                // Method ext/mods/fakeplayer/FakePlayerManager.spawnPlayer:(III)Lext/mods/fakeplayer/FakePlayer;
       127: pop
       128: aload_0
       129: aload_2
       130: iconst_1
       131: invokevirtual #154                // Method showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
       134: aload_1
       135: ldc           #190                // String admin_spawnrandomgrupe
       137: invokevirtual #144                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       140: ifeq          170
       143: invokestatic  #15                 // Method ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
       146: aload_2
       147: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       150: aload_2
       151: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       154: aload_2
       155: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       158: bipush        8
       160: invokevirtual #192                // Method ext/mods/fakeplayer/FakePlayerManager.spawnPlayerGroup:(IIII)Ljava/util/List;
       163: pop
       164: aload_0
       165: aload_2
       166: iconst_1
       167: invokevirtual #154                // Method showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
       170: aload_1
       171: ldc           #196                // String admin_findfake
       173: invokevirtual #144                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       176: ifeq          325
       179: aload_1
       180: ldc           #148                // String
       182: invokevirtual #150                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       185: astore_3
       186: aload_3
       187: arraylength
       188: iconst_2
       189: if_icmpge     201
       192: aload_2
       193: ldc           #198                // String Uso correto: //admin_findfake <nome>
       195: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       198: goto          319
       201: aload_3
       202: iconst_1
       203: aaload
       204: astore        4
       206: aconst_null
       207: astore        5
       209: invokestatic  #15                 // Method ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
       212: invokevirtual #21                 // Method ext/mods/fakeplayer/FakePlayerManager.getFakePlayers:()Ljava/util/List;
       215: invokeinterface #203,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       220: astore        6
       222: aload         6
       224: invokeinterface #207,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       229: ifeq          267
       232: aload         6
       234: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       239: checkcast     #105                // class ext/mods/fakeplayer/FakePlayer
       242: astore        7
       244: aload         7
       246: invokevirtual #107                // Method ext/mods/fakeplayer/FakePlayer.getName:()Ljava/lang/String;
       249: aload         4
       251: invokevirtual #217                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       254: ifeq          264
       257: aload         7
       259: astore        5
       261: goto          267
       264: goto          222
       267: aload         5
       269: ifnull        308
       272: aload_2
       273: aload         5
       275: invokevirtual #220                // Method ext/mods/fakeplayer/FakePlayer.getX:()I
       278: aload         5
       280: invokevirtual #221                // Method ext/mods/fakeplayer/FakePlayer.getY:()I
       283: aload         5
       285: invokevirtual #222                // Method ext/mods/fakeplayer/FakePlayer.getZ:()I
       288: bipush        75
       290: invokevirtual #223                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       293: pop
       294: aload_2
       295: aload         4
       297: invokedynamic #227,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       302: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       305: goto          319
       308: aload_2
       309: aload         4
       311: invokedynamic #228,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       316: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       319: aload_0
       320: aload_2
       321: iconst_1
       322: invokevirtual #154                // Method showFakeDashboard:(Lext/mods/gameserver/model/actor/Player;I)V
       325: return
      Exception table:
         from    to  target type
             9    46    49   Class java/lang/Exception
      LineNumberTable:
        line 121: 0
        line 125: 9
        line 127: 16
        line 129: 22
        line 133: 31
        line 134: 39
        line 141: 46
        line 138: 49
        line 140: 50
        line 145: 56
        line 147: 65
        line 149: 82
        line 150: 90
        line 152: 94
        line 155: 100
        line 157: 109
        line 159: 128
        line 162: 134
        line 164: 143
        line 165: 164
        line 168: 170
        line 170: 179
        line 171: 186
        line 173: 192
        line 177: 201
        line 178: 206
        line 180: 209
        line 182: 244
        line 184: 257
        line 185: 261
        line 187: 264
        line 189: 267
        line 191: 272
        line 192: 294
        line 196: 308
        line 199: 319
        line 201: 325
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39       7     4  page   I
           16      30     3 parts   [Ljava/lang/String;
           50       6     3     e   Ljava/lang/Exception;
           90       4     3 fakePlayer   Lext/mods/fakeplayer/FakePlayer;
          244      20     7  fake   Lext/mods/fakeplayer/FakePlayer;
          206     113     4 fakeName   Ljava/lang/String;
          209     110     5 targetFake   Lext/mods/fakeplayer/FakePlayer;
          186     139     3 params   [Ljava/lang/String;
            0     326     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminCommand;
            0     326     1 command   Ljava/lang/String;
            0     326     2 admin   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 15
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 6 /* same */
        frame_type = 37 /* same */
        frame_type = 5 /* same */
        frame_type = 33 /* same */
        frame_type = 35 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class java/lang/String, class ext/mods/fakeplayer/FakePlayer, class java/util/Iterator ]
        frame_type = 41 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 40 /* same */
        frame_type = 249 /* chop */
          offset_delta = 10
        frame_type = 250 /* chop */
          offset_delta = 5

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #229                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 206: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminCommand;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_5
         1: anewarray     #135                // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #142                // String admin_fakes
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #175                // String admin_spawnrandom
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #190                // String admin_spawnrandomgrupe
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #166                // String admin_deletefake
        23: aastore
        24: dup
        25: iconst_4
        26: ldc           #196                // String admin_findfake
        28: aastore
        29: putstatic     #229                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        32: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "AdminCommand.java"
BootstrapMethods:
  0: #296 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #286 <tr><td align=left width=300><font color=\"LEVEL\">\u0001</font></td></tr>
  1: #296 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #288 <td><button value=\"\u0001\" action=\"\" width=32 height=16 back=\"sek.cbui92\" fore=\"sek.cbui94\"></button></td>
  2: #296 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #290 <td><button value=\"\u0001\" action=\"bypass -h admin_fakes \u0001\" width=32 height=16 back=\"sek.cbui94\" fore=\"sek.cbui92\"></button></td>
  3: #296 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #292 Teletransportado para FakePlayer: \u0001
  4: #296 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 FakePlayer \u0001 não encontrado.
InnerClasses:
  public static final #307= #303 of #305; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
