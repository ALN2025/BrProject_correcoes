// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.PremiumStatus
// File: ext\mods\gameserver\handler\voicedcommandhandlers\PremiumStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus.class
  Last modified 9 de jul de 2026; size 3085 bytes
  MD5 checksum 65e6746bc9702187f130d4ae2fe0b738
  Compiled from "PremiumStatus.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.PremiumStatus implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #85                         // ext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.USE_PREMIUM_SERVICE:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // USE_PREMIUM_SERVICE:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               USE_PREMIUM_SERVICE
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Player
   #15 = NameAndType        #17:#18       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #16 = Utf8               ext/mods/gameserver/model/actor/Player
   #17 = Utf8               getSysString
   #18 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #20 = NameAndType        #21:#22       // sendMessage:(Ljava/lang/String;)V
   #21 = Utf8               sendMessage
   #22 = Utf8               (Ljava/lang/String;)V
   #23 = String             #24           // premium
   #24 = Utf8               premium
   #25 = Methodref          #26.#27       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #26 = Class              #28           // java/lang/String
   #27 = NameAndType        #29:#30       // equals:(Ljava/lang/Object;)Z
   #28 = Utf8               java/lang/String
   #29 = Utf8               equals
   #30 = Utf8               (Ljava/lang/Object;)Z
   #31 = Class              #32           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #32 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #33 = Methodref          #31.#34       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #34 = NameAndType        #5:#35        // "<init>":(I)V
   #35 = Utf8               (I)V
   #36 = Methodref          #14.#37       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #37 = NameAndType        #38:#39       // getLocale:()Ljava/util/Locale;
   #38 = Utf8               getLocale
   #39 = Utf8               ()Ljava/util/Locale;
   #40 = Methodref          #14.#41       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #41 = NameAndType        #42:#43       // getPremiumService:()I
   #42 = Utf8               getPremiumService
   #43 = Utf8               ()I
   #44 = String             #45           // html/mods/premium/normal.htm
   #45 = Utf8               html/mods/premium/normal.htm
   #46 = String             #47           // html/mods/premium/premium.htm
   #47 = Utf8               html/mods/premium/premium.htm
   #48 = Methodref          #31.#49       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #49 = NameAndType        #50:#51       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #50 = Utf8               setFile
   #51 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #52 = String             #53           // %rate_xp%
   #53 = Utf8               %rate_xp%
   #54 = Fieldref           #8.#55        // ext/mods/Config.RATE_XP:D
   #55 = NameAndType        #56:#57       // RATE_XP:D
   #56 = Utf8               RATE_XP
   #57 = Utf8               D
   #58 = Methodref          #31.#59       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
   #59 = NameAndType        #60:#61       // replace:(Ljava/lang/String;D)V
   #60 = Utf8               replace
   #61 = Utf8               (Ljava/lang/String;D)V
   #62 = String             #63           // %rate_sp%
   #63 = Utf8               %rate_sp%
   #64 = Fieldref           #8.#65        // ext/mods/Config.RATE_SP:D
   #65 = NameAndType        #66:#57       // RATE_SP:D
   #66 = Utf8               RATE_SP
   #67 = String             #68           // %rate_drop%
   #68 = Utf8               %rate_drop%
   #69 = Fieldref           #8.#70        // ext/mods/Config.RATE_DROP_ITEMS:D
   #70 = NameAndType        #71:#57       // RATE_DROP_ITEMS:D
   #71 = Utf8               RATE_DROP_ITEMS
   #72 = String             #73           // %rate_spoil%
   #73 = Utf8               %rate_spoil%
   #74 = Fieldref           #8.#75        // ext/mods/Config.RATE_DROP_SPOIL:D
   #75 = NameAndType        #76:#57       // RATE_DROP_SPOIL:D
   #76 = Utf8               RATE_DROP_SPOIL
   #77 = String             #78           // %rate_currency%
   #78 = Utf8               %rate_currency%
   #79 = Fieldref           #8.#80        // ext/mods/Config.RATE_DROP_CURRENCY:D
   #80 = NameAndType        #81:#57       // RATE_DROP_CURRENCY:D
   #81 = Utf8               RATE_DROP_CURRENCY
   #82 = String             #83           // %current%
   #83 = Utf8               %current%
   #84 = Fieldref           #85.#86       // ext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus.DATE_FORMAT:Ljava/text/SimpleDateFormat;
   #85 = Class              #87           // ext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus
   #86 = NameAndType        #88:#89       // DATE_FORMAT:Ljava/text/SimpleDateFormat;
   #87 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus
   #88 = Utf8               DATE_FORMAT
   #89 = Utf8               Ljava/text/SimpleDateFormat;
   #90 = Methodref          #91.#92       // java/lang/System.currentTimeMillis:()J
   #91 = Class              #93           // java/lang/System
   #92 = NameAndType        #94:#95       // currentTimeMillis:()J
   #93 = Utf8               java/lang/System
   #94 = Utf8               currentTimeMillis
   #95 = Utf8               ()J
   #96 = Methodref          #97.#98       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #97 = Class              #99           // java/lang/Long
   #98 = NameAndType        #100:#101     // valueOf:(J)Ljava/lang/Long;
   #99 = Utf8               java/lang/Long
  #100 = Utf8               valueOf
  #101 = Utf8               (J)Ljava/lang/Long;
  #102 = Methodref          #103.#104     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #103 = Class              #105          // java/text/SimpleDateFormat
  #104 = NameAndType        #106:#107     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #105 = Utf8               java/text/SimpleDateFormat
  #106 = Utf8               format
  #107 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #108 = Methodref          #26.#109      // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #109 = NameAndType        #100:#107     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #110 = Methodref          #31.#111      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #111 = NameAndType        #60:#112      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #112 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #113 = String             #114          // %prem_rate_xp%
  #114 = Utf8               %prem_rate_xp%
  #115 = Fieldref           #8.#116       // ext/mods/Config.PREMIUM_RATE_XP:D
  #116 = NameAndType        #117:#57      // PREMIUM_RATE_XP:D
  #117 = Utf8               PREMIUM_RATE_XP
  #118 = String             #119          // %prem_rate_sp%
  #119 = Utf8               %prem_rate_sp%
  #120 = Fieldref           #8.#121       // ext/mods/Config.PREMIUM_RATE_SP:D
  #121 = NameAndType        #122:#57      // PREMIUM_RATE_SP:D
  #122 = Utf8               PREMIUM_RATE_SP
  #123 = String             #124          // %prem_rate_drop%
  #124 = Utf8               %prem_rate_drop%
  #125 = Fieldref           #8.#126       // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS:D
  #126 = NameAndType        #127:#57      // PREMIUM_RATE_DROP_ITEMS:D
  #127 = Utf8               PREMIUM_RATE_DROP_ITEMS
  #128 = String             #129          // %prem_rate_spoil%
  #129 = Utf8               %prem_rate_spoil%
  #130 = Fieldref           #8.#131       // ext/mods/Config.PREMIUM_RATE_DROP_SPOIL:D
  #131 = NameAndType        #132:#57      // PREMIUM_RATE_DROP_SPOIL:D
  #132 = Utf8               PREMIUM_RATE_DROP_SPOIL
  #133 = String             #134          // %prem_currency%
  #134 = Utf8               %prem_currency%
  #135 = Fieldref           #8.#136       // ext/mods/Config.PREMIUM_RATE_DROP_CURRENCY:D
  #136 = NameAndType        #137:#57      // PREMIUM_RATE_DROP_CURRENCY:D
  #137 = Utf8               PREMIUM_RATE_DROP_CURRENCY
  #138 = String             #139          // %expires%
  #139 = Utf8               %expires%
  #140 = Methodref          #14.#141      // ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
  #141 = NameAndType        #142:#95      // getPremServiceData:()J
  #142 = Utf8               getPremServiceData
  #143 = Methodref          #14.#144      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #144 = NameAndType        #145:#146     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #145 = Utf8               sendPacket
  #146 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #147 = Fieldref           #85.#148      // ext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus.VOICED_COMMANDS:[Ljava/lang/String;
  #148 = NameAndType        #149:#150     // VOICED_COMMANDS:[Ljava/lang/String;
  #149 = Utf8               VOICED_COMMANDS
  #150 = Utf8               [Ljava/lang/String;
  #151 = String             #152          // dd/MM/yyyy HH:mm
  #152 = Utf8               dd/MM/yyyy HH:mm
  #153 = Methodref          #103.#154     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #154 = NameAndType        #5:#22        // "<init>":(Ljava/lang/String;)V
  #155 = Class              #156          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #156 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #157 = Utf8               Code
  #158 = Utf8               LineNumberTable
  #159 = Utf8               LocalVariableTable
  #160 = Utf8               this
  #161 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus;
  #162 = Utf8               useVoicedCommand
  #163 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #164 = Utf8               htm
  #165 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #166 = Utf8               command
  #167 = Utf8               Ljava/lang/String;
  #168 = Utf8               player
  #169 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #170 = Utf8               target
  #171 = Utf8               StackMapTable
  #172 = Class              #173          // java/util/Locale
  #173 = Utf8               java/util/Locale
  #174 = Utf8               getVoicedCommandList
  #175 = Utf8               ()[Ljava/lang/String;
  #176 = Utf8               <clinit>
  #177 = Utf8               SourceFile
  #178 = Utf8               PremiumStatus.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.PremiumStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: getstatic     #7                  // Field ext/mods/Config.USE_PREMIUM_SERVICE:Z
         3: ifne          23
         6: aload_2
         7: aload_2
         8: sipush        10200
        11: iconst_0
        12: anewarray     #2                  // class java/lang/Object
        15: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        18: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        21: iconst_0
        22: ireturn
        23: ldc           #23                 // String premium
        25: aload_1
        26: invokevirtual #25                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        29: ifeq          225
        32: new           #31                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        35: dup
        36: iconst_0
        37: invokespecial #33                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        40: astore        4
        42: aload         4
        44: aload_2
        45: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        48: aload_2
        49: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        52: ifne          60
        55: ldc           #44                 // String html/mods/premium/normal.htm
        57: goto          62
        60: ldc           #46                 // String html/mods/premium/premium.htm
        62: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        65: aload         4
        67: ldc           #52                 // String %rate_xp%
        69: getstatic     #54                 // Field ext/mods/Config.RATE_XP:D
        72: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
        75: aload         4
        77: ldc           #62                 // String %rate_sp%
        79: getstatic     #64                 // Field ext/mods/Config.RATE_SP:D
        82: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
        85: aload         4
        87: ldc           #67                 // String %rate_drop%
        89: getstatic     #69                 // Field ext/mods/Config.RATE_DROP_ITEMS:D
        92: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
        95: aload         4
        97: ldc           #72                 // String %rate_spoil%
        99: getstatic     #74                 // Field ext/mods/Config.RATE_DROP_SPOIL:D
       102: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       105: aload         4
       107: ldc           #77                 // String %rate_currency%
       109: getstatic     #79                 // Field ext/mods/Config.RATE_DROP_CURRENCY:D
       112: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       115: aload         4
       117: ldc           #82                 // String %current%
       119: getstatic     #84                 // Field DATE_FORMAT:Ljava/text/SimpleDateFormat;
       122: invokestatic  #90                 // Method java/lang/System.currentTimeMillis:()J
       125: invokestatic  #96                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       128: invokevirtual #102                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       131: invokestatic  #108                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       134: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       137: aload         4
       139: ldc           #113                // String %prem_rate_xp%
       141: getstatic     #115                // Field ext/mods/Config.PREMIUM_RATE_XP:D
       144: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       147: aload         4
       149: ldc           #118                // String %prem_rate_sp%
       151: getstatic     #120                // Field ext/mods/Config.PREMIUM_RATE_SP:D
       154: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       157: aload         4
       159: ldc           #123                // String %prem_rate_drop%
       161: getstatic     #125                // Field ext/mods/Config.PREMIUM_RATE_DROP_ITEMS:D
       164: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       167: aload         4
       169: ldc           #128                // String %prem_rate_spoil%
       171: getstatic     #130                // Field ext/mods/Config.PREMIUM_RATE_DROP_SPOIL:D
       174: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       177: aload         4
       179: ldc           #133                // String %prem_currency%
       181: getstatic     #135                // Field ext/mods/Config.PREMIUM_RATE_DROP_CURRENCY:D
       184: invokevirtual #58                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       187: aload_2
       188: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       191: ifeq          217
       194: aload         4
       196: ldc           #138                // String %expires%
       198: getstatic     #84                 // Field DATE_FORMAT:Ljava/text/SimpleDateFormat;
       201: aload_2
       202: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
       205: invokestatic  #96                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       208: invokevirtual #102                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       211: invokestatic  #108                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       214: invokevirtual #110                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       217: aload_2
       218: aload         4
       220: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       223: iconst_1
       224: ireturn
       225: iconst_0
       226: ireturn
      LineNumberTable:
        line 39: 0
        line 41: 6
        line 42: 21
        line 45: 23
        line 47: 32
        line 48: 42
        line 50: 65
        line 51: 75
        line 52: 85
        line 53: 95
        line 54: 105
        line 55: 115
        line 56: 137
        line 57: 147
        line 58: 157
        line 59: 167
        line 60: 177
        line 61: 187
        line 62: 194
        line 64: 217
        line 65: 223
        line 67: 225
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42     183     4   htm   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     227     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus;
            0     227     1 command   Ljava/lang/String;
            0     227     2 player   Lext/mods/gameserver/model/actor/Player;
            0     227     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 5
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 154
        frame_type = 250 /* chop */
          offset_delta = 7

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #147                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/PremiumStatus;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #26                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #23                 // String premium
         8: aastore
         9: putstatic     #147                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: new           #103                // class java/text/SimpleDateFormat
        15: dup
        16: ldc           #151                // String dd/MM/yyyy HH:mm
        18: invokespecial #153                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
        21: putstatic     #84                 // Field DATE_FORMAT:Ljava/text/SimpleDateFormat;
        24: return
      LineNumberTable:
        line 29: 0
        line 34: 12
}
SourceFile: "PremiumStatus.java"
