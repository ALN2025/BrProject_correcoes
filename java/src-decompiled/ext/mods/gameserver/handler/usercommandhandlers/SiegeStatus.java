// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.SiegeStatus
// File: ext\mods\gameserver\handler\usercommandhandlers\SiegeStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/SiegeStatus.class
  Last modified 9 de jul de 2026; size 4204 bytes
  MD5 checksum 7a69e35ea639c7df501b85031ec90694
  Compiled from "SiegeStatus.java"
public class ext.mods.gameserver.handler.usercommandhandlers.SiegeStatus implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #112                        // ext/mods/gameserver/handler/usercommandhandlers/SiegeStatus
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // isClanLeader:()Z
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               isClanLeader
   #12 = Utf8               ()Z
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEADER_CAN_ISSUE_COMMANDS:Lext/mods/gameserver/network/SystemMessageId;
   #14 = Class              #16           // ext/mods/gameserver/network/SystemMessageId
   #15 = NameAndType        #17:#18       // ONLY_CLAN_LEADER_CAN_ISSUE_COMMANDS:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #17 = Utf8               ONLY_CLAN_LEADER_CAN_ISSUE_COMMANDS
   #18 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #20 = NameAndType        #21:#22       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #21 = Utf8               sendPacket
   #22 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/actor/Player.isNoble:()Z
   #24 = NameAndType        #25:#12       // isNoble:()Z
   #25 = Utf8               isNoble
   #26 = Fieldref           #14.#27       // ext/mods/gameserver/network/SystemMessageId.ONLY_NOBLESSE_LEADER_CAN_VIEW_SIEGE_STATUS_WINDOW:Lext/mods/gameserver/network/SystemMessageId;
   #27 = NameAndType        #28:#18       // ONLY_NOBLESSE_LEADER_CAN_VIEW_SIEGE_STATUS_WINDOW:Lext/mods/gameserver/network/SystemMessageId;
   #28 = Utf8               ONLY_NOBLESSE_LEADER_CAN_VIEW_SIEGE_STATUS_WINDOW
   #29 = Methodref          #8.#30        // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #30 = NameAndType        #31:#32       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #31 = Utf8               getClan
   #32 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #33 = Class              #34           // java/lang/StringBuilder
   #34 = Utf8               java/lang/StringBuilder
   #35 = Methodref          #33.#3        // java/lang/StringBuilder."<init>":()V
   #36 = Methodref          #37.#38       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #37 = Class              #39           // ext/mods/gameserver/data/manager/CastleManager
   #38 = NameAndType        #40:#41       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #39 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #40 = Utf8               getInstance
   #41 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #42 = Methodref          #37.#43       // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
   #43 = NameAndType        #44:#45       // getCastles:()Ljava/util/Collection;
   #44 = Utf8               getCastles
   #45 = Utf8               ()Ljava/util/Collection;
   #46 = InterfaceMethodref #47.#48       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #47 = Class              #49           // java/util/Collection
   #48 = NameAndType        #50:#51       // iterator:()Ljava/util/Iterator;
   #49 = Utf8               java/util/Collection
   #50 = Utf8               iterator
   #51 = Utf8               ()Ljava/util/Iterator;
   #52 = InterfaceMethodref #53.#54       // java/util/Iterator.hasNext:()Z
   #53 = Class              #55           // java/util/Iterator
   #54 = NameAndType        #56:#12       // hasNext:()Z
   #55 = Utf8               java/util/Iterator
   #56 = Utf8               hasNext
   #57 = InterfaceMethodref #53.#58       // java/util/Iterator.next:()Ljava/lang/Object;
   #58 = NameAndType        #59:#60       // next:()Ljava/lang/Object;
   #59 = Utf8               next
   #60 = Utf8               ()Ljava/lang/Object;
   #61 = Class              #62           // ext/mods/gameserver/model/residence/castle/Castle
   #62 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #63 = Methodref          #61.#64       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #64 = NameAndType        #65:#66       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #65 = Utf8               getSiege
   #66 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #68 = Class              #70           // ext/mods/gameserver/model/residence/castle/Siege
   #69 = NameAndType        #71:#12       // isInProgress:()Z
   #70 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #71 = Utf8               isInProgress
   #72 = Class              #73           // ext/mods/gameserver/enums/SiegeSide
   #73 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #74 = Fieldref           #72.#75       // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #75 = NameAndType        #76:#77       // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #76 = Utf8               ATTACKER
   #77 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #78 = Fieldref           #72.#79       // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #79 = NameAndType        #80:#77       // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #80 = Utf8               DEFENDER
   #81 = Fieldref           #72.#82       // ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
   #82 = NameAndType        #83:#77       // OWNER:Lext/mods/gameserver/enums/SiegeSide;
   #83 = Utf8               OWNER
   #84 = Methodref          #68.#85       // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #85 = NameAndType        #86:#87       // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #86 = Utf8               checkSides
   #87 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #88 = Methodref          #89.#90       // ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #89 = Class              #91           // ext/mods/gameserver/model/pledge/Clan
   #90 = NameAndType        #92:#93       // getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #91 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #92 = Utf8               getOnlineMembers
   #93 = Utf8               ()[Lext/mods/gameserver/model/actor/Player;
   #94 = String             #95           // <tr><td width=170>
   #95 = Utf8               <tr><td width=170>
   #96 = Methodref          #8.#97        // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #97 = NameAndType        #98:#99       // getName:()Ljava/lang/String;
   #98 = Utf8               getName
   #99 = Utf8               ()Ljava/lang/String;
  #100 = String             #101          // </td><td width=100>
  #101 = Utf8               </td><td width=100>
  #102 = Methodref          #61.#103      // ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #103 = NameAndType        #104:#105     // getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #104 = Utf8               getSiegeZone
  #105 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #106 = Methodref          #107.#108     // ext/mods/gameserver/model/zone/type/SiegeZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
  #107 = Class              #109          // ext/mods/gameserver/model/zone/type/SiegeZone
  #108 = NameAndType        #110:#111     // isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
  #109 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
  #110 = Utf8               isInsideZone
  #111 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #112 = Class              #113          // ext/mods/gameserver/handler/usercommandhandlers/SiegeStatus
  #113 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/SiegeStatus
  #114 = String             #115          // Castle Siege in Progress
  #115 = Utf8               Castle Siege in Progress
  #116 = String             #117          // Outside Castle Siege Zone
  #117 = Utf8               Outside Castle Siege Zone
  #118 = String             #119          // </td></tr>
  #119 = Utf8               </td></tr>
  #120 = Methodref          #121.#122     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #121 = Class              #123          // ext/mods/commons/lang/StringUtil
  #122 = NameAndType        #124:#125     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #123 = Utf8               ext/mods/commons/lang/StringUtil
  #124 = Utf8               append
  #125 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #126 = Class              #127          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #127 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #128 = Methodref          #126.#129     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #129 = NameAndType        #5:#130       // "<init>":(I)V
  #130 = Utf8               (I)V
  #131 = Methodref          #8.#132       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #132 = NameAndType        #133:#134     // getLocale:()Ljava/util/Locale;
  #133 = Utf8               getLocale
  #134 = Utf8               ()Ljava/util/Locale;
  #135 = String             #136          // html/siege_status.htm
  #136 = Utf8               html/siege_status.htm
  #137 = Methodref          #126.#138     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #138 = NameAndType        #139:#140     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #139 = Utf8               setFile
  #140 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #141 = String             #142          // %kills%
  #142 = Utf8               %kills%
  #143 = Methodref          #89.#144      // ext/mods/gameserver/model/pledge/Clan.getSiegeKills:()I
  #144 = NameAndType        #145:#146     // getSiegeKills:()I
  #145 = Utf8               getSiegeKills
  #146 = Utf8               ()I
  #147 = Methodref          #126.#148     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #148 = NameAndType        #149:#150     // replace:(Ljava/lang/String;I)V
  #149 = Utf8               replace
  #150 = Utf8               (Ljava/lang/String;I)V
  #151 = String             #152          // %deaths%
  #152 = Utf8               %deaths%
  #153 = Methodref          #89.#154      // ext/mods/gameserver/model/pledge/Clan.getSiegeDeaths:()I
  #154 = NameAndType        #155:#146     // getSiegeDeaths:()I
  #155 = Utf8               getSiegeDeaths
  #156 = String             #157          // %content%
  #157 = Utf8               %content%
  #158 = Methodref          #33.#159      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #159 = NameAndType        #160:#99      // toString:()Ljava/lang/String;
  #160 = Utf8               toString
  #161 = Methodref          #126.#162     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #162 = NameAndType        #149:#163     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #163 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #164 = Methodref          #8.#165       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #165 = NameAndType        #21:#166      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #166 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #167 = Fieldref           #14.#168      // ext/mods/gameserver/network/SystemMessageId.ONLY_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #168 = NameAndType        #169:#18      // ONLY_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #169 = Utf8               ONLY_DURING_SIEGE
  #170 = Fieldref           #112.#171     // ext/mods/gameserver/handler/usercommandhandlers/SiegeStatus.COMMAND_IDS:[I
  #171 = NameAndType        #172:#173     // COMMAND_IDS:[I
  #172 = Utf8               COMMAND_IDS
  #173 = Utf8               [I
  #174 = Class              #175          // ext/mods/gameserver/handler/IUserCommandHandler
  #175 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #176 = Utf8               IN_PROGRESS
  #177 = Utf8               Ljava/lang/String;
  #178 = Utf8               ConstantValue
  #179 = Utf8               OUTSIDE_ZONE
  #180 = Utf8               Code
  #181 = Utf8               LineNumberTable
  #182 = Utf8               LocalVariableTable
  #183 = Utf8               this
  #184 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/SiegeStatus;
  #185 = Utf8               useUserCommand
  #186 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #187 = Utf8               member
  #188 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #189 = Utf8               html
  #190 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #191 = Utf8               castle
  #192 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #193 = Utf8               id
  #194 = Utf8               I
  #195 = Utf8               player
  #196 = Utf8               clan
  #197 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #198 = Utf8               sb
  #199 = Utf8               Ljava/lang/StringBuilder;
  #200 = Utf8               StackMapTable
  #201 = Class              #202          // "[Lext/mods/gameserver/model/actor/Player;"
  #202 = Utf8               [Lext/mods/gameserver/model/actor/Player;
  #203 = Class              #204          // "[Ljava/lang/Object;"
  #204 = Utf8               [Ljava/lang/Object;
  #205 = Class              #206          // java/lang/String
  #206 = Utf8               java/lang/String
  #207 = Utf8               getUserCommandList
  #208 = Utf8               ()[I
  #209 = Utf8               <clinit>
  #210 = Utf8               SourceFile
  #211 = Utf8               SiegeStatus.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.SiegeStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/SiegeStatus;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
         4: ifne          15
         7: aload_2
         8: getstatic     #13                 // Field ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEADER_CAN_ISSUE_COMMANDS:Lext/mods/gameserver/network/SystemMessageId;
        11: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        14: return
        15: aload_2
        16: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
        19: ifne          30
        22: aload_2
        23: getstatic     #26                 // Field ext/mods/gameserver/network/SystemMessageId.ONLY_NOBLESSE_LEADER_CAN_VIEW_SIEGE_STATUS_WINDOW:Lext/mods/gameserver/network/SystemMessageId;
        26: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        29: return
        30: aload_2
        31: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        34: astore_3
        35: new           #33                 // class java/lang/StringBuilder
        38: dup
        39: invokespecial #35                 // Method java/lang/StringBuilder."<init>":()V
        42: astore        4
        44: invokestatic  #36                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        47: invokevirtual #42                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
        50: invokeinterface #46,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        55: astore        5
        57: aload         5
        59: invokeinterface #52,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        64: ifeq          278
        67: aload         5
        69: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        74: checkcast     #61                 // class ext/mods/gameserver/model/residence/castle/Castle
        77: astore        6
        79: aload         6
        81: invokevirtual #63                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        84: invokevirtual #67                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        87: ifeq          57
        90: aload         6
        92: invokevirtual #63                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        95: aload_3
        96: iconst_3
        97: anewarray     #72                 // class ext/mods/gameserver/enums/SiegeSide
       100: dup
       101: iconst_0
       102: getstatic     #74                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       105: aastore
       106: dup
       107: iconst_1
       108: getstatic     #78                 // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       111: aastore
       112: dup
       113: iconst_2
       114: getstatic     #81                 // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
       117: aastore
       118: invokevirtual #84                 // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
       121: ifne          127
       124: goto          57
       127: aload_3
       128: invokevirtual #88                 // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       131: astore        7
       133: aload         7
       135: arraylength
       136: istore        8
       138: iconst_0
       139: istore        9
       141: iload         9
       143: iload         8
       145: if_icmpge     216
       148: aload         7
       150: iload         9
       152: aaload
       153: astore        10
       155: aload         4
       157: iconst_5
       158: anewarray     #2                  // class java/lang/Object
       161: dup
       162: iconst_0
       163: ldc           #94                 // String <tr><td width=170>
       165: aastore
       166: dup
       167: iconst_1
       168: aload         10
       170: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       173: aastore
       174: dup
       175: iconst_2
       176: ldc           #100                // String </td><td width=100>
       178: aastore
       179: dup
       180: iconst_3
       181: aload         6
       183: invokevirtual #102                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
       186: aload         10
       188: invokevirtual #106                // Method ext/mods/gameserver/model/zone/type/SiegeZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
       191: ifeq          199
       194: ldc           #114                // String Castle Siege in Progress
       196: goto          201
       199: ldc           #116                // String Outside Castle Siege Zone
       201: aastore
       202: dup
       203: iconst_4
       204: ldc           #118                // String </td></tr>
       206: aastore
       207: invokestatic  #120                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       210: iinc          9, 1
       213: goto          141
       216: new           #126                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       219: dup
       220: iconst_0
       221: invokespecial #128                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       224: astore        7
       226: aload         7
       228: aload_2
       229: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       232: ldc           #135                // String html/siege_status.htm
       234: invokevirtual #137                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       237: aload         7
       239: ldc           #141                // String %kills%
       241: aload_3
       242: invokevirtual #143                // Method ext/mods/gameserver/model/pledge/Clan.getSiegeKills:()I
       245: invokevirtual #147                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       248: aload         7
       250: ldc           #151                // String %deaths%
       252: aload_3
       253: invokevirtual #153                // Method ext/mods/gameserver/model/pledge/Clan.getSiegeDeaths:()I
       256: invokevirtual #147                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       259: aload         7
       261: ldc           #156                // String %content%
       263: aload         4
       265: invokevirtual #158                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       268: invokevirtual #161                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       271: aload_2
       272: aload         7
       274: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       277: return
       278: aload_2
       279: getstatic     #167                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       282: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       285: return
      LineNumberTable:
        line 44: 0
        line 46: 7
        line 47: 14
        line 50: 15
        line 52: 22
        line 53: 29
        line 56: 30
        line 58: 35
        line 60: 44
        line 62: 79
        line 63: 124
        line 65: 127
        line 66: 155
        line 65: 210
        line 68: 216
        line 69: 226
        line 70: 237
        line 71: 248
        line 72: 259
        line 73: 271
        line 74: 277
        line 77: 278
        line 78: 285
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          155      55    10 member   Lext/mods/gameserver/model/actor/Player;
          226      52     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           79     199     6 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0     286     0  this   Lext/mods/gameserver/handler/usercommandhandlers/SiegeStatus;
            0     286     1    id   I
            0     286     2 player   Lext/mods/gameserver/model/actor/Player;
           35     251     3  clan   Lext/mods/gameserver/model/pledge/Clan;
           44     242     4    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 9
        frame_type = 15 /* same */
        frame_type = 14 /* same */
        frame_type = 254 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/SiegeStatus, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/model/residence/castle/Castle, class "[Lext/mods/gameserver/model/actor/Player;", int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/SiegeStatus, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/model/residence/castle/Castle, class "[Lext/mods/gameserver/model/actor/Player;", int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/SiegeStatus, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/model/residence/castle/Castle ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 61

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #170                // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/SiegeStatus;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        99
         7: iastore
         8: putstatic     #170                // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "SiegeStatus.java"
