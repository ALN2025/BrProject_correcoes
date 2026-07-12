// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.ClanPenalty
// File: ext\mods\gameserver\handler\usercommandhandlers\ClanPenalty.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/ClanPenalty.class
  Last modified 9 de jul de 2026; size 4867 bytes
  MD5 checksum a5aee6619abfc35791b0564c81bdcc53
  Compiled from "ClanPenalty.java"
public class ext.mods.gameserver.handler.usercommandhandlers.ClanPenalty implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #154                        // ext/mods/gameserver/handler/usercommandhandlers/ClanPenalty
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/text/SimpleDateFormat
    #8 = Utf8               java/text/SimpleDateFormat
    #9 = String             #10           // yyyy-MM-dd
   #10 = Utf8               yyyy-MM-dd
   #11 = Methodref          #7.#12        // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;)V
   #14 = Class              #15           // java/lang/StringBuilder
   #15 = Utf8               java/lang/StringBuilder
   #16 = Methodref          #14.#3        // java/lang/StringBuilder."<init>":()V
   #17 = Methodref          #18.#19       // java/lang/System.currentTimeMillis:()J
   #18 = Class              #20           // java/lang/System
   #19 = NameAndType        #21:#22       // currentTimeMillis:()J
   #20 = Utf8               java/lang/System
   #21 = Utf8               currentTimeMillis
   #22 = Utf8               ()J
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/Player.getClanJoinExpiryTime:()J
   #24 = Class              #26           // ext/mods/gameserver/model/actor/Player
   #25 = NameAndType        #27:#22       // getClanJoinExpiryTime:()J
   #26 = Utf8               ext/mods/gameserver/model/actor/Player
   #27 = Utf8               getClanJoinExpiryTime
   #28 = String             #29           // <tr><td width=170>Unable to join a clan.</td><td width=100 align=center>
   #29 = Utf8               <tr><td width=170>Unable to join a clan.</td><td width=100 align=center>
   #30 = Methodref          #31.#32       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #31 = Class              #33           // java/lang/Long
   #32 = NameAndType        #34:#35       // valueOf:(J)Ljava/lang/Long;
   #33 = Utf8               java/lang/Long
   #34 = Utf8               valueOf
   #35 = Utf8               (J)Ljava/lang/Long;
   #36 = Methodref          #7.#37        // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
   #37 = NameAndType        #38:#39       // format:(Ljava/lang/Object;)Ljava/lang/String;
   #38 = Utf8               format
   #39 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #40 = String             #41           // </td></tr>
   #41 = Utf8               </td></tr>
   #42 = Methodref          #43.#44       // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #43 = Class              #45           // ext/mods/commons/lang/StringUtil
   #44 = NameAndType        #46:#47       // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #45 = Utf8               ext/mods/commons/lang/StringUtil
   #46 = Utf8               append
   #47 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #48 = Methodref          #24.#49       // ext/mods/gameserver/model/actor/Player.getClanCreateExpiryTime:()J
   #49 = NameAndType        #50:#22       // getClanCreateExpiryTime:()J
   #50 = Utf8               getClanCreateExpiryTime
   #51 = String             #52           // <tr><td width=170>Unable to create a clan.</td><td width=100 align=center>
   #52 = Utf8               <tr><td width=170>Unable to create a clan.</td><td width=100 align=center>
   #53 = Methodref          #24.#54       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #54 = NameAndType        #55:#56       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #55 = Utf8               getClan
   #56 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/pledge/Clan.getCharPenaltyExpiryTime:()J
   #58 = Class              #60           // ext/mods/gameserver/model/pledge/Clan
   #59 = NameAndType        #61:#22       // getCharPenaltyExpiryTime:()J
   #60 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #61 = Utf8               getCharPenaltyExpiryTime
   #62 = String             #63           // <tr><td width=170>Unable to invite a clan member.</td><td width=100 align=center>
   #63 = Utf8               <tr><td width=170>Unable to invite a clan member.</td><td width=100 align=center>
   #64 = Methodref          #58.#65       // ext/mods/gameserver/model/pledge/Clan.getAllyPenaltyType:()I
   #65 = NameAndType        #66:#67       // getAllyPenaltyType:()I
   #66 = Utf8               getAllyPenaltyType
   #67 = Utf8               ()I
   #68 = Methodref          #58.#69       // ext/mods/gameserver/model/pledge/Clan.getAllyPenaltyExpiryTime:()J
   #69 = NameAndType        #70:#22       // getAllyPenaltyExpiryTime:()J
   #70 = Utf8               getAllyPenaltyExpiryTime
   #71 = String             #72           // <tr><td width=170>Unable to join an alliance.</td><td width=100 align=center>
   #72 = Utf8               <tr><td width=170>Unable to join an alliance.</td><td width=100 align=center>
   #73 = String             #74           // <tr><td width=170>Unable to invite a new alliance member.</td><td width=100 align=center>
   #74 = Utf8               <tr><td width=170>Unable to invite a new alliance member.</td><td width=100 align=center>
   #75 = String             #76           // <tr><td width=170>Unable to create an alliance.</td><td width=100 align=center>
   #76 = Utf8               <tr><td width=170>Unable to create an alliance.</td><td width=100 align=center>
   #77 = Methodref          #58.#78       // ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
   #78 = NameAndType        #79:#22       // getDissolvingExpiryTime:()J
   #79 = Utf8               getDissolvingExpiryTime
   #80 = String             #81           // <tr><td width=170>The request to dissolve the clan is currently being processed.  (Restrictions are now going to be imposed on the use of clan functions.)</td><td width=100 align=center>
   #81 = Utf8               <tr><td width=170>The request to dissolve the clan is currently being processed.  (Restrictions are now going to be imposed on the use of clan functions.)</td><td width=100 align=center>
   #82 = Methodref          #83.#84       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #83 = Class              #85           // ext/mods/gameserver/data/manager/CastleManager
   #84 = NameAndType        #86:#87       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #85 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #86 = Utf8               getInstance
   #87 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #88 = Methodref          #83.#89       // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
   #89 = NameAndType        #90:#91       // getCastles:()Ljava/util/Collection;
   #90 = Utf8               getCastles
   #91 = Utf8               ()Ljava/util/Collection;
   #92 = InterfaceMethodref #93.#94       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #93 = Class              #95           // java/util/Collection
   #94 = NameAndType        #96:#97       // iterator:()Ljava/util/Iterator;
   #95 = Utf8               java/util/Collection
   #96 = Utf8               iterator
   #97 = Utf8               ()Ljava/util/Iterator;
   #98 = InterfaceMethodref #99.#100      // java/util/Iterator.hasNext:()Z
   #99 = Class              #101          // java/util/Iterator
  #100 = NameAndType        #102:#103     // hasNext:()Z
  #101 = Utf8               java/util/Iterator
  #102 = Utf8               hasNext
  #103 = Utf8               ()Z
  #104 = InterfaceMethodref #99.#105      // java/util/Iterator.next:()Ljava/lang/Object;
  #105 = NameAndType        #106:#107     // next:()Ljava/lang/Object;
  #106 = Utf8               next
  #107 = Utf8               ()Ljava/lang/Object;
  #108 = Class              #109          // ext/mods/gameserver/model/residence/castle/Castle
  #109 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #110 = Methodref          #108.#111     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #111 = NameAndType        #112:#113     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #112 = Utf8               getSiege
  #113 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #114 = Methodref          #115.#116     // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #115 = Class              #117          // ext/mods/gameserver/model/residence/castle/Siege
  #116 = NameAndType        #118:#119     // checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #117 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #118 = Utf8               checkSides
  #119 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
  #120 = Methodref          #58.#121      // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
  #121 = NameAndType        #122:#67      // getAllyId:()I
  #122 = Utf8               getAllyId
  #123 = Methodref          #58.#124      // ext/mods/gameserver/model/pledge/Clan.isAtWar:()Z
  #124 = NameAndType        #125:#103     // isAtWar:()Z
  #125 = Utf8               isAtWar
  #126 = Methodref          #58.#127      // ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
  #127 = NameAndType        #128:#103     // hasCastle:()Z
  #128 = Utf8               hasCastle
  #129 = Methodref          #58.#130      // ext/mods/gameserver/model/pledge/Clan.hasClanHall:()Z
  #130 = NameAndType        #131:#103     // hasClanHall:()Z
  #131 = Utf8               hasClanHall
  #132 = String             #133          // <tr><td width=170>Unable to dissolve a clan.</td><td></td></tr>
  #133 = Utf8               <tr><td width=170>Unable to dissolve a clan.</td><td></td></tr>
  #134 = Class              #135          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #135 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #136 = Methodref          #134.#137     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #137 = NameAndType        #5:#138       // "<init>":(I)V
  #138 = Utf8               (I)V
  #139 = Methodref          #24.#140      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #140 = NameAndType        #141:#142     // getLocale:()Ljava/util/Locale;
  #141 = Utf8               getLocale
  #142 = Utf8               ()Ljava/util/Locale;
  #143 = String             #144          // html/clan_penalty.htm
  #144 = Utf8               html/clan_penalty.htm
  #145 = Methodref          #134.#146     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #146 = NameAndType        #147:#148     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #147 = Utf8               setFile
  #148 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #149 = String             #150          // %content%
  #150 = Utf8               %content%
  #151 = Methodref          #14.#152      // java/lang/StringBuilder.length:()I
  #152 = NameAndType        #153:#67      // length:()I
  #153 = Utf8               length
  #154 = Class              #155          // ext/mods/gameserver/handler/usercommandhandlers/ClanPenalty
  #155 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/ClanPenalty
  #156 = String             #157          // <tr><td width=170>No penalty is imposed.</td><td width=100 align=center></td></tr>
  #157 = Utf8               <tr><td width=170>No penalty is imposed.</td><td width=100 align=center></td></tr>
  #158 = Methodref          #14.#159      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #159 = NameAndType        #160:#161     // toString:()Ljava/lang/String;
  #160 = Utf8               toString
  #161 = Utf8               ()Ljava/lang/String;
  #162 = Methodref          #134.#163     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #163 = NameAndType        #164:#165     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #164 = Utf8               replace
  #165 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #166 = Methodref          #24.#167      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #167 = NameAndType        #168:#169     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #168 = Utf8               sendPacket
  #169 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #170 = Fieldref           #154.#171     // ext/mods/gameserver/handler/usercommandhandlers/ClanPenalty.COMMAND_IDS:[I
  #171 = NameAndType        #172:#173     // COMMAND_IDS:[I
  #172 = Utf8               COMMAND_IDS
  #173 = Utf8               [I
  #174 = Class              #175          // ext/mods/gameserver/handler/IUserCommandHandler
  #175 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #176 = Utf8               NO_PENALTY
  #177 = Utf8               Ljava/lang/String;
  #178 = Utf8               ConstantValue
  #179 = Utf8               Code
  #180 = Utf8               LineNumberTable
  #181 = Utf8               LocalVariableTable
  #182 = Utf8               this
  #183 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/ClanPenalty;
  #184 = Utf8               useUserCommand
  #185 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #186 = Utf8               expiryTime
  #187 = Utf8               J
  #188 = Utf8               castle
  #189 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #190 = Utf8               penaltyType
  #191 = Utf8               I
  #192 = Utf8               registeredOnAnySiege
  #193 = Utf8               Z
  #194 = Utf8               id
  #195 = Utf8               player
  #196 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #197 = Utf8               sdf
  #198 = Utf8               Ljava/text/SimpleDateFormat;
  #199 = Utf8               sb
  #200 = Utf8               Ljava/lang/StringBuilder;
  #201 = Utf8               currentTime
  #202 = Utf8               clan
  #203 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #204 = Utf8               html
  #205 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #206 = Utf8               StackMapTable
  #207 = Class              #208          // java/lang/String
  #208 = Utf8               java/lang/String
  #209 = Utf8               getUserCommandList
  #210 = Utf8               ()[I
  #211 = Utf8               <clinit>
  #212 = Utf8               SourceFile
  #213 = Utf8               ClanPenalty.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.ClanPenalty();
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
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ClanPenalty;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=12, args_size=3
         0: new           #7                  // class java/text/SimpleDateFormat
         3: dup
         4: ldc           #9                  // String yyyy-MM-dd
         6: invokespecial #11                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
         9: astore_3
        10: new           #14                 // class java/lang/StringBuilder
        13: dup
        14: invokespecial #16                 // Method java/lang/StringBuilder."<init>":()V
        17: astore        4
        19: invokestatic  #17                 // Method java/lang/System.currentTimeMillis:()J
        22: lstore        5
        24: aload_2
        25: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getClanJoinExpiryTime:()J
        28: lload         5
        30: lcmp
        31: ifle          67
        34: aload         4
        36: iconst_3
        37: anewarray     #2                  // class java/lang/Object
        40: dup
        41: iconst_0
        42: ldc           #28                 // String <tr><td width=170>Unable to join a clan.</td><td width=100 align=center>
        44: aastore
        45: dup
        46: iconst_1
        47: aload_3
        48: aload_2
        49: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getClanJoinExpiryTime:()J
        52: invokestatic  #30                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        55: invokevirtual #36                 // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
        58: aastore
        59: dup
        60: iconst_2
        61: ldc           #40                 // String </td></tr>
        63: aastore
        64: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        67: aload_2
        68: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getClanCreateExpiryTime:()J
        71: lload         5
        73: lcmp
        74: ifle          110
        77: aload         4
        79: iconst_3
        80: anewarray     #2                  // class java/lang/Object
        83: dup
        84: iconst_0
        85: ldc           #51                 // String <tr><td width=170>Unable to create a clan.</td><td width=100 align=center>
        87: aastore
        88: dup
        89: iconst_1
        90: aload_3
        91: aload_2
        92: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getClanCreateExpiryTime:()J
        95: invokestatic  #30                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        98: invokevirtual #36                 // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       101: aastore
       102: dup
       103: iconst_2
       104: ldc           #40                 // String </td></tr>
       106: aastore
       107: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       110: aload_2
       111: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       114: astore        7
       116: aload         7
       118: ifnull        472
       121: aload         7
       123: invokevirtual #57                 // Method ext/mods/gameserver/model/pledge/Clan.getCharPenaltyExpiryTime:()J
       126: lload         5
       128: lcmp
       129: ifle          166
       132: aload         4
       134: iconst_3
       135: anewarray     #2                  // class java/lang/Object
       138: dup
       139: iconst_0
       140: ldc           #62                 // String <tr><td width=170>Unable to invite a clan member.</td><td width=100 align=center>
       142: aastore
       143: dup
       144: iconst_1
       145: aload_3
       146: aload         7
       148: invokevirtual #57                 // Method ext/mods/gameserver/model/pledge/Clan.getCharPenaltyExpiryTime:()J
       151: invokestatic  #30                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       154: invokevirtual #36                 // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       157: aastore
       158: dup
       159: iconst_2
       160: ldc           #40                 // String </td></tr>
       162: aastore
       163: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       166: aload         7
       168: invokevirtual #64                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyPenaltyType:()I
       171: istore        8
       173: iload         8
       175: ifeq          316
       178: aload         7
       180: invokevirtual #68                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyPenaltyExpiryTime:()J
       183: lstore        9
       185: lload         9
       187: lload         5
       189: lcmp
       190: ifle          316
       193: iload         8
       195: iconst_1
       196: if_icmpeq     205
       199: iload         8
       201: iconst_2
       202: if_icmpne     239
       205: aload         4
       207: iconst_3
       208: anewarray     #2                  // class java/lang/Object
       211: dup
       212: iconst_0
       213: ldc           #71                 // String <tr><td width=170>Unable to join an alliance.</td><td width=100 align=center>
       215: aastore
       216: dup
       217: iconst_1
       218: aload_3
       219: lload         9
       221: invokestatic  #30                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       224: invokevirtual #36                 // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       227: aastore
       228: dup
       229: iconst_2
       230: ldc           #40                 // String </td></tr>
       232: aastore
       233: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       236: goto          316
       239: iload         8
       241: iconst_3
       242: if_icmpne     279
       245: aload         4
       247: iconst_3
       248: anewarray     #2                  // class java/lang/Object
       251: dup
       252: iconst_0
       253: ldc           #73                 // String <tr><td width=170>Unable to invite a new alliance member.</td><td width=100 align=center>
       255: aastore
       256: dup
       257: iconst_1
       258: aload_3
       259: lload         9
       261: invokestatic  #30                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       264: invokevirtual #36                 // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       267: aastore
       268: dup
       269: iconst_2
       270: ldc           #40                 // String </td></tr>
       272: aastore
       273: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       276: goto          316
       279: iload         8
       281: iconst_4
       282: if_icmpne     316
       285: aload         4
       287: iconst_3
       288: anewarray     #2                  // class java/lang/Object
       291: dup
       292: iconst_0
       293: ldc           #75                 // String <tr><td width=170>Unable to create an alliance.</td><td width=100 align=center>
       295: aastore
       296: dup
       297: iconst_1
       298: aload_3
       299: lload         9
       301: invokestatic  #30                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       304: invokevirtual #36                 // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       307: aastore
       308: dup
       309: iconst_2
       310: ldc           #40                 // String </td></tr>
       312: aastore
       313: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       316: aload         7
       318: invokevirtual #77                 // Method ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
       321: lload         5
       323: lcmp
       324: ifle          361
       327: aload         4
       329: iconst_3
       330: anewarray     #2                  // class java/lang/Object
       333: dup
       334: iconst_0
       335: ldc           #80                 // String <tr><td width=170>The request to dissolve the clan is currently being processed.  (Restrictions are now going to be imposed on the use of clan functions.)</td><td width=100 align=center>
       337: aastore
       338: dup
       339: iconst_1
       340: aload_3
       341: aload         7
       343: invokevirtual #77                 // Method ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
       346: invokestatic  #30                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       349: invokevirtual #36                 // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       352: aastore
       353: dup
       354: iconst_2
       355: ldc           #40                 // String </td></tr>
       357: aastore
       358: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       361: iconst_0
       362: istore        9
       364: invokestatic  #82                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       367: invokevirtual #88                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
       370: invokeinterface #92,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       375: astore        10
       377: aload         10
       379: invokeinterface #98,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       384: ifeq          421
       387: aload         10
       389: invokeinterface #104,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       394: checkcast     #108                // class ext/mods/gameserver/model/residence/castle/Castle
       397: astore        11
       399: aload         11
       401: invokevirtual #110                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       404: aload         7
       406: invokevirtual #114                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
       409: ifeq          418
       412: iconst_1
       413: istore        9
       415: goto          421
       418: goto          377
       421: aload         7
       423: invokevirtual #120                // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
       426: ifne          458
       429: aload         7
       431: invokevirtual #123                // Method ext/mods/gameserver/model/pledge/Clan.isAtWar:()Z
       434: ifne          458
       437: aload         7
       439: invokevirtual #126                // Method ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
       442: ifne          458
       445: aload         7
       447: invokevirtual #129                // Method ext/mods/gameserver/model/pledge/Clan.hasClanHall:()Z
       450: ifne          458
       453: iload         9
       455: ifeq          472
       458: aload         4
       460: iconst_1
       461: anewarray     #2                  // class java/lang/Object
       464: dup
       465: iconst_0
       466: ldc           #132                // String <tr><td width=170>Unable to dissolve a clan.</td><td></td></tr>
       468: aastore
       469: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       472: new           #134                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       475: dup
       476: iconst_0
       477: invokespecial #136                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       480: astore        8
       482: aload         8
       484: aload_2
       485: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       488: ldc           #143                // String html/clan_penalty.htm
       490: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       493: aload         8
       495: ldc           #149                // String %content%
       497: aload         4
       499: invokevirtual #151                // Method java/lang/StringBuilder.length:()I
       502: ifne          510
       505: ldc           #156                // String <tr><td width=170>No penalty is imposed.</td><td width=100 align=center></td></tr>
       507: goto          515
       510: aload         4
       512: invokevirtual #158                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       515: invokevirtual #162                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       518: aload_2
       519: aload         8
       521: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       524: return
      LineNumberTable:
        line 43: 0
        line 44: 10
        line 45: 19
        line 47: 24
        line 48: 34
        line 50: 67
        line 51: 77
        line 53: 110
        line 54: 116
        line 56: 121
        line 57: 132
        line 59: 166
        line 60: 173
        line 62: 178
        line 63: 185
        line 65: 193
        line 66: 205
        line 67: 239
        line 68: 245
        line 69: 279
        line 70: 285
        line 74: 316
        line 75: 327
        line 77: 361
        line 78: 364
        line 80: 399
        line 82: 412
        line 83: 415
        line 85: 418
        line 87: 421
        line 88: 458
        line 91: 472
        line 92: 482
        line 93: 493
        line 94: 518
        line 95: 524
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          185     131     9 expiryTime   J
          399      19    11 castle   Lext/mods/gameserver/model/residence/castle/Castle;
          173     299     8 penaltyType   I
          364     108     9 registeredOnAnySiege   Z
            0     525     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ClanPenalty;
            0     525     1    id   I
            0     525     2 player   Lext/mods/gameserver/model/actor/Player;
           10     515     3   sdf   Ljava/text/SimpleDateFormat;
           19     506     4    sb   Ljava/lang/StringBuilder;
           24     501     5 currentTime   J
          116     409     7  clan   Lext/mods/gameserver/model/pledge/Clan;
          482      43     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 15
        frame_type = 254 /* append */
          offset_delta = 67
          locals = [ class java/text/SimpleDateFormat, class java/lang/StringBuilder, long ]
        frame_type = 42 /* same */
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ int, long ]
        frame_type = 33 /* same */
        frame_type = 39 /* same */
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 44 /* same */
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ int, class java/util/Iterator ]
        frame_type = 40 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 36 /* same */
        frame_type = 249 /* chop */
          offset_delta = 13
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/ClanPenalty, int, class ext/mods/gameserver/model/actor/Player, class java/text/SimpleDateFormat, class java/lang/StringBuilder, long, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/ClanPenalty, int, class ext/mods/gameserver/model/actor/Player, class java/text/SimpleDateFormat, class java/lang/StringBuilder, long, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #170                // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ClanPenalty;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        100
         7: iastore
         8: putstatic     #170                // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "ClanPenalty.java"
