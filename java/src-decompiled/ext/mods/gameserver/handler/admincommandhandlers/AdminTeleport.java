// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminTeleport
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminTeleport.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport.class
  Last modified 9 de jul de 2026; size 5199 bytes
  MD5 checksum 8bb24fcc2fb9c16486e1f412fe950268
  Compiled from "AdminTeleport.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminTeleport implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_tele
    #8 = Utf8               admin_tele
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = String             #16           // teleports.htm
   #16 = Utf8               teleports.htm
   #17 = Methodref          #18.#19       // ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #18 = Class              #20           // ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport
   #19 = NameAndType        #21:#22       // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #20 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport
   #21 = Utf8               sendFile
   #22 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #23 = Class              #24           // java/util/StringTokenizer
   #24 = Utf8               java/util/StringTokenizer
   #25 = Methodref          #23.#26       // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #26 = NameAndType        #5:#27        // "<init>":(Ljava/lang/String;)V
   #27 = Utf8               (Ljava/lang/String;)V
   #28 = Methodref          #23.#29       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #29 = NameAndType        #30:#31       // nextToken:()Ljava/lang/String;
   #30 = Utf8               nextToken
   #31 = Utf8               ()Ljava/lang/String;
   #32 = String             #33           // admin_instant_move
   #33 = Utf8               admin_instant_move
   #34 = Methodref          #10.#35       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #35 = NameAndType        #36:#37       // startsWith:(Ljava/lang/String;)Z
   #36 = Utf8               startsWith
   #37 = Utf8               (Ljava/lang/String;)Z
   #38 = Methodref          #23.#39       // java/util/StringTokenizer.hasMoreTokens:()Z
   #39 = NameAndType        #40:#41       // hasMoreTokens:()Z
   #40 = Utf8               hasMoreTokens
   #41 = Utf8               ()Z
   #42 = Fieldref           #43.#44       // ext/mods/gameserver/enums/TeleportMode.ONE_TIME:Lext/mods/gameserver/enums/TeleportMode;
   #43 = Class              #45           // ext/mods/gameserver/enums/TeleportMode
   #44 = NameAndType        #46:#47       // ONE_TIME:Lext/mods/gameserver/enums/TeleportMode;
   #45 = Utf8               ext/mods/gameserver/enums/TeleportMode
   #46 = Utf8               ONE_TIME
   #47 = Utf8               Lext/mods/gameserver/enums/TeleportMode;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/Player.setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
   #49 = Class              #51           // ext/mods/gameserver/model/actor/Player
   #50 = NameAndType        #52:#53       // setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
   #51 = Utf8               ext/mods/gameserver/model/actor/Player
   #52 = Utf8               setTeleportMode
   #53 = Utf8               (Lext/mods/gameserver/enums/TeleportMode;)V
   #54 = Methodref          #55.#56       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #55 = Class              #57           // java/lang/Integer
   #56 = NameAndType        #58:#59       // parseInt:(Ljava/lang/String;)I
   #57 = Utf8               java/lang/Integer
   #58 = Utf8               parseInt
   #59 = Utf8               (Ljava/lang/String;)I
   #60 = String             #61           // Usage: //instant_move [0|1|2]
   #61 = Utf8               Usage: //instant_move [0|1|2]
   #62 = Methodref          #49.#63       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #63 = NameAndType        #64:#27       // sendMessage:(Ljava/lang/String;)V
   #64 = Utf8               sendMessage
   #65 = Fieldref           #43.#66       // ext/mods/gameserver/enums/TeleportMode.VALUES:[Lext/mods/gameserver/enums/TeleportMode;
   #66 = NameAndType        #67:#68       // VALUES:[Lext/mods/gameserver/enums/TeleportMode;
   #67 = Utf8               VALUES
   #68 = Utf8               [Lext/mods/gameserver/enums/TeleportMode;
   #69 = Class              #70           // java/lang/Exception
   #70 = Utf8               java/lang/Exception
   #71 = String             #72           // admin_recall
   #72 = Utf8               admin_recall
   #73 = Fieldref           #74.#75       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #74 = Class              #76           // ext/mods/gameserver/network/SystemMessageId
   #75 = NameAndType        #77:#78       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #76 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #77 = Utf8               INVALID_TARGET
   #78 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #79 = Methodref          #49.#80       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #80 = NameAndType        #81:#82       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #81 = Utf8               sendPacket
   #82 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #83 = Methodref          #10.#84       // java/lang/String.hashCode:()I
   #84 = NameAndType        #85:#86       // hashCode:()I
   #85 = Utf8               hashCode
   #86 = Utf8               ()I
   #87 = String             #88           // clan
   #88 = Utf8               clan
   #89 = String             #90           // party
   #90 = Utf8               party
   #91 = Methodref          #92.#93       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #92 = Class              #94           // ext/mods/gameserver/model/World
   #93 = NameAndType        #95:#96       // getInstance:()Lext/mods/gameserver/model/World;
   #94 = Utf8               ext/mods/gameserver/model/World
   #95 = Utf8               getInstance
   #96 = Utf8               ()Lext/mods/gameserver/model/World;
   #97 = Methodref          #92.#98       // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #98 = NameAndType        #99:#100      // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #99 = Utf8               getPlayer
  #100 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #101 = Methodref          #49.#102      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #102 = NameAndType        #103:#104     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #103 = Utf8               getClan
  #104 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #105 = Methodref          #49.#106      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #106 = NameAndType        #107:#108     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #107 = Utf8               getPosition
  #108 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #109 = Methodref          #49.#110      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #110 = NameAndType        #111:#112     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #111 = Utf8               teleportTo
  #112 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #113 = Methodref          #114.#115     // ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
  #114 = Class              #116          // ext/mods/gameserver/model/pledge/Clan
  #115 = NameAndType        #117:#118     // getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
  #116 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #117 = Utf8               getOnlineMembers
  #118 = Utf8               ()[Lext/mods/gameserver/model/actor/Player;
  #119 = Methodref          #49.#120      // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #120 = NameAndType        #121:#122     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #121 = Utf8               setTarget
  #122 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #123 = Methodref          #49.#124      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #124 = NameAndType        #125:#126     // getParty:()Lext/mods/gameserver/model/group/Party;
  #125 = Utf8               getParty
  #126 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #127 = Methodref          #128.#129     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #128 = Class              #130          // ext/mods/gameserver/model/group/Party
  #129 = NameAndType        #131:#132     // getMembers:()Ljava/util/List;
  #130 = Utf8               ext/mods/gameserver/model/group/Party
  #131 = Utf8               getMembers
  #132 = Utf8               ()Ljava/util/List;
  #133 = InterfaceMethodref #134.#135     // java/util/List.iterator:()Ljava/util/Iterator;
  #134 = Class              #136          // java/util/List
  #135 = NameAndType        #137:#138     // iterator:()Ljava/util/Iterator;
  #136 = Utf8               java/util/List
  #137 = Utf8               iterator
  #138 = Utf8               ()Ljava/util/Iterator;
  #139 = InterfaceMethodref #140.#141     // java/util/Iterator.hasNext:()Z
  #140 = Class              #142          // java/util/Iterator
  #141 = NameAndType        #143:#41      // hasNext:()Z
  #142 = Utf8               java/util/Iterator
  #143 = Utf8               hasNext
  #144 = InterfaceMethodref #140.#145     // java/util/Iterator.next:()Ljava/lang/Object;
  #145 = NameAndType        #146:#147     // next:()Ljava/lang/Object;
  #146 = Utf8               next
  #147 = Utf8               ()Ljava/lang/Object;
  #148 = String             #149          // admin_sendhome
  #149 = Utf8               admin_sendhome
  #150 = Methodref          #18.#151      // ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #151 = NameAndType        #152:#153     // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #152 = Utf8               getTargetPlayer
  #153 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #154 = Fieldref           #155.#156     // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
  #155 = Class              #157          // ext/mods/gameserver/enums/RestartType
  #156 = NameAndType        #158:#159     // TOWN:Lext/mods/gameserver/enums/RestartType;
  #157 = Utf8               ext/mods/gameserver/enums/RestartType
  #158 = Utf8               TOWN
  #159 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #160 = Methodref          #49.#161      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #161 = NameAndType        #111:#162     // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #162 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
  #163 = Methodref          #49.#164      // ext/mods/gameserver/model/actor/Player.setIsIn7sDungeon:(Z)V
  #164 = NameAndType        #165:#166     // setIsIn7sDungeon:(Z)V
  #165 = Utf8               setIsIn7sDungeon
  #166 = Utf8               (Z)V
  #167 = String             #168          // admin_teleportto
  #168 = Utf8               admin_teleportto
  #169 = String             #170          // admin_teleport
  #170 = Utf8               admin_teleport
  #171 = Methodref          #172.#173     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #172 = Class              #174          // ext/mods/gameserver/geoengine/GeoEngine
  #173 = NameAndType        #95:#175      // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #174 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #175 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #176 = Methodref          #49.#177      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #177 = NameAndType        #178:#86      // getZ:()I
  #178 = Utf8               getZ
  #179 = Methodref          #172.#180     // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #180 = NameAndType        #181:#182     // getHeight:(III)S
  #181 = Utf8               getHeight
  #182 = Utf8               (III)S
  #183 = Methodref          #49.#184      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #184 = NameAndType        #111:#185     // teleportTo:(IIII)Z
  #185 = Utf8               (IIII)Z
  #186 = Fieldref           #18.#187      // ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport.ADMIN_COMMANDS:[Ljava/lang/String;
  #187 = NameAndType        #188:#189     // ADMIN_COMMANDS:[Ljava/lang/String;
  #188 = Utf8               ADMIN_COMMANDS
  #189 = Utf8               [Ljava/lang/String;
  #190 = Class              #191          // ext/mods/gameserver/handler/IAdminCommandHandler
  #191 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #192 = Utf8               Code
  #193 = Utf8               LineNumberTable
  #194 = Utf8               LocalVariableTable
  #195 = Utf8               this
  #196 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminTeleport;
  #197 = Utf8               useAdminCommand
  #198 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #199 = Utf8               mode
  #200 = Utf8               I
  #201 = Utf8               e
  #202 = Utf8               Ljava/lang/Exception;
  #203 = Utf8               clanMember
  #204 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #205 = Utf8               worldPlayer
  #206 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #207 = Utf8               partyMember
  #208 = Utf8               Lext/mods/gameserver/model/group/Party;
  #209 = Utf8               param
  #210 = Utf8               Ljava/lang/String;
  #211 = Utf8               targetPlayer
  #212 = Utf8               x
  #213 = Utf8               y
  #214 = Utf8               z
  #215 = Utf8               command
  #216 = Utf8               player
  #217 = Utf8               st
  #218 = Utf8               Ljava/util/StringTokenizer;
  #219 = Utf8               StackMapTable
  #220 = Class              #221          // "[Lext/mods/gameserver/model/actor/Player;"
  #221 = Utf8               [Lext/mods/gameserver/model/actor/Player;
  #222 = Utf8               getAdminCommandList
  #223 = Utf8               ()[Ljava/lang/String;
  #224 = Utf8               <clinit>
  #225 = Utf8               SourceFile
  #226 = Utf8               AdminTeleport.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminTeleport();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminTeleport;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=13, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_tele
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          17
         9: aload_0
        10: aload_2
        11: ldc           #15                 // String teleports.htm
        13: invokevirtual #17                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        16: return
        17: new           #23                 // class java/util/StringTokenizer
        20: dup
        21: aload_1
        22: invokespecial #25                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
        25: astore_3
        26: aload_3
        27: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        30: pop
        31: aload_1
        32: ldc           #32                 // String admin_instant_move
        34: invokevirtual #34                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        37: ifeq          108
        40: aload_3
        41: invokevirtual #38                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        44: ifne          57
        47: aload_2
        48: getstatic     #42                 // Field ext/mods/gameserver/enums/TeleportMode.ONE_TIME:Lext/mods/gameserver/enums/TeleportMode;
        51: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
        54: goto          723
        57: aload_3
        58: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        61: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        64: istore        4
        66: iload         4
        68: iflt          77
        71: iload         4
        73: iconst_2
        74: if_icmple     84
        77: aload_2
        78: ldc           #60                 // String Usage: //instant_move [0|1|2]
        80: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        83: return
        84: aload_2
        85: getstatic     #65                 // Field ext/mods/gameserver/enums/TeleportMode.VALUES:[Lext/mods/gameserver/enums/TeleportMode;
        88: iload         4
        90: aaload
        91: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.setTeleportMode:(Lext/mods/gameserver/enums/TeleportMode;)V
        94: goto          723
        97: astore        4
        99: aload_2
       100: ldc           #60                 // String Usage: //instant_move [0|1|2]
       102: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       105: goto          723
       108: aload_1
       109: ldc           #71                 // String admin_recall
       111: invokevirtual #34                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       114: ifeq          511
       117: aload_3
       118: invokevirtual #38                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       121: ifne          132
       124: aload_2
       125: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       128: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       131: return
       132: aload_3
       133: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       136: astore        4
       138: aload         4
       140: astore        5
       142: iconst_m1
       143: istore        6
       145: aload         5
       147: invokevirtual #83                 // Method java/lang/String.hashCode:()I
       150: lookupswitch  { // 2

                 3056214: 176

               106437350: 192
                 default: 205
            }
       176: aload         5
       178: ldc           #87                 // String clan
       180: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       183: ifeq          205
       186: iconst_0
       187: istore        6
       189: goto          205
       192: aload         5
       194: ldc           #89                 // String party
       196: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       199: ifeq          205
       202: iconst_1
       203: istore        6
       205: iload         6
       207: lookupswitch  { // 2

                       0: 232

                       1: 350
                 default: 470
            }
       232: aload_3
       233: invokevirtual #38                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       236: ifne          247
       239: aload_2
       240: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       243: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       246: return
       247: invokestatic  #91                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       250: aload_3
       251: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       254: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       257: astore        7
       259: aload         7
       261: ifnonnull     272
       264: aload_2
       265: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       268: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       271: return
       272: aload         7
       274: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       277: astore        8
       279: aload         8
       281: ifnonnull     297
       284: aload         7
       286: aload_2
       287: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       290: iconst_0
       291: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       294: goto          342
       297: aload         8
       299: invokevirtual #113                // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       302: astore        9
       304: aload         9
       306: arraylength
       307: istore        10
       309: iconst_0
       310: istore        11
       312: iload         11
       314: iload         10
       316: if_icmpge     342
       319: aload         9
       321: iload         11
       323: aaload
       324: astore        12
       326: aload         12
       328: aload_2
       329: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       332: iconst_0
       333: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       336: iinc          11, 1
       339: goto          312
       342: aload_2
       343: aconst_null
       344: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       347: goto          508
       350: aload_3
       351: invokevirtual #38                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       354: ifne          365
       357: aload_2
       358: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       361: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       364: return
       365: invokestatic  #91                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       368: aload_3
       369: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       372: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       375: astore        7
       377: aload         7
       379: ifnonnull     390
       382: aload_2
       383: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       386: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       389: return
       390: aload         7
       392: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       395: astore        9
       397: aload         9
       399: ifnonnull     415
       402: aload         7
       404: aload_2
       405: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       408: iconst_0
       409: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       412: goto          462
       415: aload         9
       417: invokevirtual #127                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       420: invokeinterface #133,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       425: astore        10
       427: aload         10
       429: invokeinterface #139,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       434: ifeq          462
       437: aload         10
       439: invokeinterface #144,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       444: checkcast     #49                 // class ext/mods/gameserver/model/actor/Player
       447: astore        11
       449: aload         11
       451: aload_2
       452: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       455: iconst_0
       456: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       459: goto          427
       462: aload_2
       463: aconst_null
       464: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       467: goto          508
       470: invokestatic  #91                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       473: aload         4
       475: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       478: astore        7
       480: aload         7
       482: ifnonnull     493
       485: aload_2
       486: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       489: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       492: return
       493: aload         7
       495: aload_2
       496: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       499: iconst_0
       500: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       503: aload_2
       504: aconst_null
       505: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       508: goto          723
       511: aload_1
       512: ldc           #148                // String admin_sendhome
       514: invokevirtual #34                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       517: ifeq          577
       520: aload_3
       521: invokevirtual #38                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       524: ifeq          552
       527: invokestatic  #91                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       530: aload_3
       531: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       534: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       537: astore        4
       539: aload         4
       541: ifnonnull     560
       544: aload_2
       545: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       548: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       551: return
       552: aload_0
       553: aload_2
       554: iconst_1
       555: invokevirtual #150                // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       558: astore        4
       560: aload         4
       562: getstatic     #154                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
       565: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
       568: aload         4
       570: iconst_0
       571: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.setIsIn7sDungeon:(Z)V
       574: goto          723
       577: aload_1
       578: ldc           #167                // String admin_teleportto
       580: invokevirtual #34                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       583: ifeq          639
       586: aload_3
       587: invokevirtual #38                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       590: ifne          601
       593: aload_2
       594: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       597: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       600: return
       601: invokestatic  #91                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       604: aload_3
       605: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       608: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       611: astore        4
       613: aload         4
       615: ifnonnull     626
       618: aload_2
       619: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       622: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       625: return
       626: aload_2
       627: aload         4
       629: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       632: iconst_0
       633: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       636: goto          723
       639: aload_1
       640: ldc           #169                // String admin_teleport
       642: invokevirtual #34                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       645: ifeq          723
       648: aload_3
       649: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       652: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       655: istore        4
       657: aload_3
       658: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       661: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       664: istore        5
       666: aload_3
       667: invokevirtual #38                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       670: ifeq          683
       673: aload_3
       674: invokevirtual #28                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       677: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       680: goto          697
       683: invokestatic  #171                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       686: iload         4
       688: iload         5
       690: aload_2
       691: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       694: invokevirtual #179                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       697: istore        6
       699: aload_2
       700: iload         4
       702: iload         5
       704: iload         6
       706: iconst_0
       707: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       710: pop
       711: goto          723
       714: astore        4
       716: aload_0
       717: aload_2
       718: ldc           #15                 // String teleports.htm
       720: invokevirtual #17                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       723: return
      Exception table:
         from    to  target type
            57    83    97   Class java/lang/Exception
            84    94    97   Class java/lang/Exception
           648   711   714   Class java/lang/Exception
      LineNumberTable:
        line 47: 0
        line 49: 9
        line 50: 16
        line 53: 17
        line 54: 26
        line 56: 31
        line 58: 40
        line 59: 47
        line 64: 57
        line 65: 66
        line 67: 77
        line 68: 83
        line 71: 84
        line 76: 94
        line 73: 97
        line 75: 99
        line 76: 105
        line 79: 108
        line 81: 117
        line 83: 124
        line 84: 131
        line 87: 132
        line 88: 138
        line 91: 232
        line 93: 239
        line 94: 246
        line 97: 247
        line 98: 259
        line 100: 264
        line 101: 271
        line 104: 272
        line 105: 279
        line 106: 284
        line 109: 297
        line 110: 326
        line 109: 336
        line 113: 342
        line 114: 347
        line 117: 350
        line 119: 357
        line 120: 364
        line 123: 365
        line 124: 377
        line 126: 382
        line 127: 389
        line 130: 390
        line 131: 397
        line 132: 402
        line 135: 415
        line 136: 449
        line 139: 462
        line 140: 467
        line 143: 470
        line 144: 480
        line 146: 485
        line 147: 492
        line 150: 493
        line 152: 503
        line 155: 508
        line 156: 511
        line 160: 520
        line 162: 527
        line 163: 539
        line 165: 544
        line 166: 551
        line 170: 552
        line 172: 560
        line 173: 568
        line 174: 574
        line 175: 577
        line 177: 586
        line 179: 593
        line 180: 600
        line 183: 601
        line 184: 613
        line 186: 618
        line 187: 625
        line 190: 626
        line 191: 636
        line 192: 639
        line 196: 648
        line 197: 657
        line 198: 666
        line 200: 699
        line 205: 711
        line 202: 714
        line 204: 716
        line 207: 723
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66      28     4  mode   I
           99       6     4     e   Ljava/lang/Exception;
          326      10    12 clanMember   Lext/mods/gameserver/model/actor/Player;
          259      91     7 worldPlayer   Lext/mods/gameserver/model/actor/Player;
          279      71     8  clan   Lext/mods/gameserver/model/pledge/Clan;
          449      10    11 partyMember   Lext/mods/gameserver/model/actor/Player;
          377      93     7 worldPlayer   Lext/mods/gameserver/model/actor/Player;
          397      73     9 party   Lext/mods/gameserver/model/group/Party;
          480      28     7 worldPlayer   Lext/mods/gameserver/model/actor/Player;
          138     370     4 param   Ljava/lang/String;
          539      13     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          560      14     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          613      23     4 worldPlayer   Lext/mods/gameserver/model/actor/Player;
          657      54     4     x   I
          666      45     5     y   I
          699      12     6     z   I
          716       7     4     e   Ljava/lang/Exception;
            0     724     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminTeleport;
            0     724     1 command   Ljava/lang/String;
            0     724     2 player   Lext/mods/gameserver/model/actor/Player;
           26     698     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 36
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class java/util/StringTokenizer ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 6 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 23 /* same */
        frame_type = 254 /* append */
          offset_delta = 43
          locals = [ class java/lang/String, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 254 /* append */
          offset_delta = 14
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 29
        frame_type = 249 /* chop */
          offset_delta = 7
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ top, class ext/mods/gameserver/model/group/Party ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34
        frame_type = 248 /* chop */
          offset_delta = 7
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 40 /* same */
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ int, int ]
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTeleport, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 8 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #186                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 212: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminTeleport;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        6
         2: anewarray     #10                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #32                 // String admin_instant_move
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #71                 // String admin_recall
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #148                // String admin_sendhome
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #7                  // String admin_tele
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #169                // String admin_teleport
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #167                // String admin_teleportto
        34: aastore
        35: putstatic     #186                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        38: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "AdminTeleport.java"
