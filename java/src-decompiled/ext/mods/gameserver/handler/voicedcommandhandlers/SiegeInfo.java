// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.SiegeInfo
// File: ext\mods\gameserver\handler\voicedcommandhandlers\SiegeInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo.class
  Last modified 9 de jul de 2026; size 5660 bytes
  MD5 checksum cb7cd0dc6f30216a6c8568f9f878aad9
  Compiled from "SiegeInfo.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.SiegeInfo implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // siege
    #8 = Utf8               siege
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = Fieldref           #16.#17       // ext/mods/Config.SIEGE_INFO:Z
   #16 = Class              #18           // ext/mods/Config
   #17 = NameAndType        #19:#20       // SIEGE_INFO:Z
   #18 = Utf8               ext/mods/Config
   #19 = Utf8               SIEGE_INFO
   #20 = Utf8               Z
   #21 = Methodref          #22.#23       // ext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo.showSiegeHtm:(Lext/mods/gameserver/model/actor/Player;)V
   #22 = Class              #24           // ext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo
   #23 = NameAndType        #25:#26       // showSiegeHtm:(Lext/mods/gameserver/model/actor/Player;)V
   #24 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo
   #25 = Utf8               showSiegeHtm
   #26 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getSysString
   #32 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #33 = Methodref          #28.#34       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #34 = NameAndType        #35:#36       // sendMessage:(Ljava/lang/String;)V
   #35 = Utf8               sendMessage
   #36 = Utf8               (Ljava/lang/String;)V
   #37 = Class              #38           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #38 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #39 = Methodref          #37.#40       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #40 = NameAndType        #5:#41        // "<init>":(I)V
   #41 = Utf8               (I)V
   #42 = Methodref          #28.#43       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #43 = NameAndType        #44:#45       // getLocale:()Ljava/util/Locale;
   #44 = Utf8               getLocale
   #45 = Utf8               ()Ljava/util/Locale;
   #46 = String             #47           // html/mods/menu/siege.htm
   #47 = Utf8               html/mods/menu/siege.htm
   #48 = Methodref          #37.#49       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #49 = NameAndType        #50:#51       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #50 = Utf8               setFile
   #51 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #52 = Class              #53           // java/lang/StringBuilder
   #53 = Utf8               java/lang/StringBuilder
   #54 = Methodref          #52.#3        // java/lang/StringBuilder."<init>":()V
   #55 = String             #56           // <table width=280><tr><td align=center width=70>Castle</td><td align=center width=140>Siege date</td><td align=center width=70>Skill/Reward</td></tr></table>
   #56 = Utf8               <table width=280><tr><td align=center width=70>Castle</td><td align=center width=140>Siege date</td><td align=center width=70>Skill/Reward</td></tr></table>
   #57 = Methodref          #52.#58       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #58 = NameAndType        #59:#60       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #59 = Utf8               append
   #60 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #61 = String             #62           // <table width=280>
   #62 = Utf8               <table width=280>
   #63 = Methodref          #64.#65       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #64 = Class              #66           // ext/mods/gameserver/data/manager/CastleManager
   #65 = NameAndType        #67:#68       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #66 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #67 = Utf8               getInstance
   #68 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #69 = Methodref          #64.#70       // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
   #70 = NameAndType        #71:#72       // getCastles:()Ljava/util/Collection;
   #71 = Utf8               getCastles
   #72 = Utf8               ()Ljava/util/Collection;
   #73 = InterfaceMethodref #74.#75       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #74 = Class              #76           // java/util/Collection
   #75 = NameAndType        #77:#78       // iterator:()Ljava/util/Iterator;
   #76 = Utf8               java/util/Collection
   #77 = Utf8               iterator
   #78 = Utf8               ()Ljava/util/Iterator;
   #79 = InterfaceMethodref #80.#81       // java/util/Iterator.hasNext:()Z
   #80 = Class              #82           // java/util/Iterator
   #81 = NameAndType        #83:#84       // hasNext:()Z
   #82 = Utf8               java/util/Iterator
   #83 = Utf8               hasNext
   #84 = Utf8               ()Z
   #85 = InterfaceMethodref #80.#86       // java/util/Iterator.next:()Ljava/lang/Object;
   #86 = NameAndType        #87:#88       // next:()Ljava/lang/Object;
   #87 = Utf8               next
   #88 = Utf8               ()Ljava/lang/Object;
   #89 = Class              #90           // ext/mods/gameserver/model/residence/castle/Castle
   #90 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #91 = Class              #92           // java/text/SimpleDateFormat
   #92 = Utf8               java/text/SimpleDateFormat
   #93 = String             #94           // dd.MM.yyyy HH:mm
   #94 = Utf8               dd.MM.yyyy HH:mm
   #95 = Methodref          #91.#96       // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
   #96 = NameAndType        #5:#36        // "<init>":(Ljava/lang/String;)V
   #97 = Class              #98           // java/sql/Date
   #98 = Utf8               java/sql/Date
   #99 = Methodref          #89.#100      // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #100 = NameAndType        #101:#102     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #101 = Utf8               getSiege
  #102 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #103 = Methodref          #104.#105     // ext/mods/gameserver/model/residence/castle/Siege.getSiegeDate:()Ljava/util/Calendar;
  #104 = Class              #106          // ext/mods/gameserver/model/residence/castle/Siege
  #105 = NameAndType        #107:#108     // getSiegeDate:()Ljava/util/Calendar;
  #106 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #107 = Utf8               getSiegeDate
  #108 = Utf8               ()Ljava/util/Calendar;
  #109 = Methodref          #110.#111     // java/util/Calendar.getTimeInMillis:()J
  #110 = Class              #112          // java/util/Calendar
  #111 = NameAndType        #113:#114     // getTimeInMillis:()J
  #112 = Utf8               java/util/Calendar
  #113 = Utf8               getTimeInMillis
  #114 = Utf8               ()J
  #115 = Methodref          #97.#116      // java/sql/Date."<init>":(J)V
  #116 = NameAndType        #5:#117       // "<init>":(J)V
  #117 = Utf8               (J)V
  #118 = Methodref          #91.#119      // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #119 = NameAndType        #120:#121     // format:(Ljava/util/Date;)Ljava/lang/String;
  #120 = Utf8               format
  #121 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #122 = String             #123          // <tr><td>
  #123 = Utf8               <tr><td>
  #124 = String             #125          // <table width=280 height=22 bgcolor=000000><tr>
  #125 = Utf8               <table width=280 height=22 bgcolor=000000><tr>
  #126 = String             #127          // <table width=280 height=22><tr>
  #127 = Utf8               <table width=280 height=22><tr>
  #128 = String             #129          // <td width=100>
  #129 = Utf8               <td width=100>
  #130 = Methodref          #89.#131      // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
  #131 = NameAndType        #132:#133     // getName:()Ljava/lang/String;
  #132 = Utf8               getName
  #133 = Utf8               ()Ljava/lang/String;
  #134 = String             #135          // </td>
  #135 = Utf8               </td>
  #136 = String             #137          // <td width=140 align=center>
  #137 = Utf8               <td width=140 align=center>
  #138 = String             #139          // <td width=70 align=center>
  #139 = Utf8               <td width=70 align=center>
  #140 = Methodref          #89.#141      // ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
  #141 = NameAndType        #142:#143     // getSkillsMember:()Ljava/util/Map;
  #142 = Utf8               getSkillsMember
  #143 = Utf8               ()Ljava/util/Map;
  #144 = InterfaceMethodref #145.#146     // java/util/Map.size:()I
  #145 = Class              #147          // java/util/Map
  #146 = NameAndType        #148:#149     // size:()I
  #147 = Utf8               java/util/Map
  #148 = Utf8               size
  #149 = Utf8               ()I
  #150 = Methodref          #89.#151      // ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
  #151 = NameAndType        #152:#143     // getSkillsLeader:()Ljava/util/Map;
  #152 = Utf8               getSkillsLeader
  #153 = String             #154          // <font color=00FF00>YES</font>
  #154 = Utf8               <font color=00FF00>YES</font>
  #155 = String             #156          // <font color=FF0000>N/A</font>
  #156 = Utf8               <font color=FF0000>N/A</font>
  #157 = Methodref          #89.#158      // ext/mods/gameserver/model/residence/castle/Castle.getItemsMember:()Ljava/util/Map;
  #158 = NameAndType        #159:#143     // getItemsMember:()Ljava/util/Map;
  #159 = Utf8               getItemsMember
  #160 = Methodref          #89.#161      // ext/mods/gameserver/model/residence/castle/Castle.getItemsLeader:()Ljava/util/Map;
  #161 = NameAndType        #162:#143     // getItemsLeader:()Ljava/util/Map;
  #162 = Utf8               getItemsLeader
  #163 = String             #164          //  / <font color=00FF00>YES</font>
  #164 = Utf8                / <font color=00FF00>YES</font>
  #165 = String             #166          //  / <font color=FF0000>N/A</font>
  #166 = Utf8                / <font color=FF0000>N/A</font>
  #167 = String             #168          // </td></tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #168 = Utf8               </td></tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #169 = String             #170          // </td></tr>
  #170 = Utf8               </td></tr>
  #171 = Methodref          #52.#172      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #172 = NameAndType        #173:#133     // toString:()Ljava/lang/String;
  #173 = Utf8               toString
  #174 = String             #175          // </table>
  #175 = Utf8               </table>
  #176 = String             #177          // <table width=300><tr><td align=center width=150>Clan Hall</td><td align=center width=140>Siege date</td></tr></table>
  #177 = Utf8               <table width=300><tr><td align=center width=150>Clan Hall</td><td align=center width=140>Siege date</td></tr></table>
  #178 = String             #179          // <table width=300>
  #179 = Utf8               <table width=300>
  #180 = Methodref          #181.#182     // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #181 = Class              #183          // ext/mods/gameserver/data/manager/ClanHallManager
  #182 = NameAndType        #67:#184      // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #183 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
  #184 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #185 = Methodref          #181.#186     // ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHalls:()Ljava/util/List;
  #186 = NameAndType        #187:#188     // getSiegableHalls:()Ljava/util/List;
  #187 = Utf8               getSiegableHalls
  #188 = Utf8               ()Ljava/util/List;
  #189 = InterfaceMethodref #190.#75      // java/util/List.iterator:()Ljava/util/Iterator;
  #190 = Class              #191          // java/util/List
  #191 = Utf8               java/util/List
  #192 = Class              #193          // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #193 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #194 = Methodref          #192.#105     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeDate:()Ljava/util/Calendar;
  #195 = String             #196          // <table width=320 height=22 bgcolor=000000><tr>
  #196 = Utf8               <table width=320 height=22 bgcolor=000000><tr>
  #197 = String             #198          // <table width=320 height=22><tr>
  #198 = Utf8               <table width=320 height=22><tr>
  #199 = String             #200          // <td width=255>
  #200 = Utf8               <td width=255>
  #201 = Methodref          #192.#131     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getName:()Ljava/lang/String;
  #202 = String             #203          // %castle_list%
  #203 = Utf8               %castle_list%
  #204 = Methodref          #37.#205      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #205 = NameAndType        #206:#207     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #206 = Utf8               replace
  #207 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #208 = String             #209          // %ch_list%
  #209 = Utf8               %ch_list%
  #210 = Methodref          #28.#211      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #211 = NameAndType        #212:#213     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #212 = Utf8               sendPacket
  #213 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #214 = Fieldref           #22.#215      // ext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo.VOICED_COMMANDS:[Ljava/lang/String;
  #215 = NameAndType        #216:#217     // VOICED_COMMANDS:[Ljava/lang/String;
  #216 = Utf8               VOICED_COMMANDS
  #217 = Utf8               [Ljava/lang/String;
  #218 = Class              #219          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #219 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #220 = Utf8               Code
  #221 = Utf8               LineNumberTable
  #222 = Utf8               LocalVariableTable
  #223 = Utf8               this
  #224 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo;
  #225 = Utf8               useVoicedCommand
  #226 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #227 = Utf8               command
  #228 = Utf8               Ljava/lang/String;
  #229 = Utf8               player
  #230 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #231 = Utf8               target
  #232 = Utf8               StackMapTable
  #233 = Utf8               dateFormat
  #234 = Utf8               Ljava/text/SimpleDateFormat;
  #235 = Utf8               siegeDate
  #236 = Utf8               Ljava/sql/Date;
  #237 = Utf8               formattedDate
  #238 = Utf8               html
  #239 = Utf8               Ljava/lang/StringBuilder;
  #240 = Utf8               castle
  #241 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #242 = Utf8               siegableHall
  #243 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #244 = Utf8               htm
  #245 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #246 = Utf8               content
  #247 = Utf8               content2
  #248 = Utf8               n
  #249 = Utf8               I
  #250 = Utf8               getVoicedCommandList
  #251 = Utf8               ()[Ljava/lang/String;
  #252 = Utf8               <clinit>
  #253 = Utf8               SourceFile
  #254 = Utf8               SiegeInfo.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.SiegeInfo();
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
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: ldc           #7                  // String siege
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          23
         9: getstatic     #15                 // Field ext/mods/Config.SIEGE_INFO:Z
        12: ifeq          23
        15: aload_0
        16: aload_2
        17: invokevirtual #21                 // Method showSiegeHtm:(Lext/mods/gameserver/model/actor/Player;)V
        20: goto          38
        23: aload_2
        24: aload_2
        25: sipush        10200
        28: iconst_0
        29: anewarray     #2                  // class java/lang/Object
        32: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        35: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        38: iconst_1
        39: ireturn
      LineNumberTable:
        line 42: 0
        line 43: 15
        line 45: 23
        line 47: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo;
            0      40     1 command   Ljava/lang/String;
            0      40     2 player   Lext/mods/gameserver/model/actor/Player;
            0      40     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 14 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #214                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SiegeInfo;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String siege
         8: aastore
         9: putstatic     #214                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "SiegeInfo.java"
