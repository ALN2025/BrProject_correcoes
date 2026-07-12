// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Color
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Color.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Color.class
  Last modified 9 de jul de 2026; size 5016 bytes
  MD5 checksum 5e92db611b61755f76a3027b1d94f030
  Compiled from "Color.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Color implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #148                        // ext/mods/gameserver/handler/voicedcommandhandlers/Color
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // color
    #8 = Utf8               color
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #16 = Class              #18           // ext/mods/gameserver/model/actor/Player
   #17 = NameAndType        #19:#20       // getPremiumService:()I
   #18 = Utf8               ext/mods/gameserver/model/actor/Player
   #19 = Utf8               getPremiumService
   #20 = Utf8               ()I
   #21 = String             #22           // Este comando é exclusivo para jogadores VIP.
   #22 = Utf8               Este comando é exclusivo para jogadores VIP.
   #23 = Methodref          #16.#24       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #24 = NameAndType        #25:#26       // sendMessage:(Ljava/lang/String;)V
   #25 = Utf8               sendMessage
   #26 = Utf8               (Ljava/lang/String;)V
   #27 = Methodref          #16.#28       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #28 = NameAndType        #29:#30       // getName:()Ljava/lang/String;
   #29 = Utf8               getName
   #30 = Utf8               ()Ljava/lang/String;
   #31 = Methodref          #16.#32       // ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
   #32 = NameAndType        #33:#30       // getTitle:()Ljava/lang/String;
   #33 = Utf8               getTitle
   #34 = Class              #35           // java/lang/StringBuilder
   #35 = Utf8               java/lang/StringBuilder
   #36 = Methodref          #34.#3        // java/lang/StringBuilder."<init>":()V
   #37 = String             #38           // <html><body>
   #38 = Utf8               <html><body>
   #39 = Methodref          #34.#40       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #40 = NameAndType        #41:#42       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #41 = Utf8               append
   #42 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #43 = String             #44           // <table width=80>
   #44 = Utf8               <table width=80>
   #45 = String             #46           // <tr><td><button value=\"\" action=\"bypass voiced_menu\" width=35 height=23 back=\"L2UI_CH3.calculate2_bs_down\" fore=\"L2UI_CH3.calculate2_bs\"></td>
   #46 = Utf8               <tr><td><button value=\"\" action=\"bypass voiced_menu\" width=35 height=23 back=\"L2UI_CH3.calculate2_bs_down\" fore=\"L2UI_CH3.calculate2_bs\"></td>
   #47 = String             #48           // <td> Menu </td></tr></table>
   #48 = Utf8               <td> Menu </td></tr></table>
   #49 = String             #50           // <center><br>
   #50 = Utf8               <center><br>
   #51 = String             #52           // <img src=\"l2ui_ch3.herotower_deco\" width=256 height=32><br>
   #52 = Utf8               <img src=\"l2ui_ch3.herotower_deco\" width=256 height=32><br>
   #53 = String             #54           // <img src=\"L2UI.SquareGray\" width=295 height=1>
   #54 = Utf8               <img src=\"L2UI.SquareGray\" width=295 height=1>
   #55 = InvokeDynamic      #0:#56        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #56 = NameAndType        #57:#58       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #57 = Utf8               makeConcatWithConstants
   #58 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #59 = String             #60           // <img src=\"L2UI.SquareGray\" width=295 height=1><br>
   #60 = Utf8               <img src=\"L2UI.SquareGray\" width=295 height=1><br>
   #61 = String             #62           // NAME COLOR
   #62 = Utf8               NAME COLOR
   #63 = String             #64           // <table width=300 height=80>
   #64 = Utf8               <table width=300 height=80>
   #65 = Integer            39168
   #66 = Integer            16744192
   #67 = Integer            10043427
   #68 = Integer            65535
   #69 = Integer            5000268
   #70 = Integer            10028082
   #71 = Integer            7396243
   #72 = Integer            10461087
   #73 = Integer            16776960
   #74 = Integer            39423
   #75 = Integer            3342438
   #76 = Integer            16738047
   #77 = String             #78           // 009900
   #78 = Utf8               009900
   #79 = String             #80           // 0099ff
   #80 = Utf8               0099ff
   #81 = String             #82           // 234099
   #82 = Utf8               234099
   #83 = String             #84           // ffff00
   #84 = Utf8               ffff00
   #85 = String             #86           // 4c4c4c
   #86 = Utf8               4c4c4c
   #87 = String             #88           // 320499
   #88 = Utf8               320499
   #89 = String             #90           // 80FF80
   #90 = Utf8               80FF80
   #91 = String             #92           // AAAAAA
   #92 = Utf8               AAAAAA
   #93 = String             #94           // 00FFFF
   #94 = Utf8               00FFFF
   #95 = String             #96           // ff9900
   #96 = Utf8               ff9900
   #97 = String             #98           // 660033
   #98 = Utf8               660033
   #99 = String             #100          // ff66ff
  #100 = Utf8               ff66ff
  #101 = String             #102          // <tr>
  #102 = Utf8               <tr>
  #103 = InvokeDynamic      #1:#104       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #104 = NameAndType        #57:#105      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #105 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #106 = String             #107          // </tr>
  #107 = Utf8               </tr>
  #108 = String             #109          // </table><br>
  #109 = Utf8               </table><br>
  #110 = InvokeDynamic      #2:#56        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #111 = String             #112          // TITLE COLOR
  #112 = Utf8               TITLE COLOR
  #113 = InvokeDynamic      #3:#104       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #114 = String             #115          // </table><br><center>
  #115 = Utf8               </table><br><center>
  #116 = String             #117          // <br><img src=\"L2UI.SquareGray\" width=295 height=1><br>
  #117 = Utf8               <br><img src=\"L2UI.SquareGray\" width=295 height=1><br>
  #118 = String             #119          // <font color=\"LEVEL\">Ou use um código hexadecimal manual:</font><br><br>
  #119 = Utf8               <font color=\"LEVEL\">Ou use um código hexadecimal manual:</font><br><br>
  #120 = String             #121          // <table width=200>
  #121 = Utf8               <table width=200>
  #122 = String             #123          // <tr><td>Cor do Nome:</td><td><edit var=\"name\" width=80></td></tr>
  #123 = Utf8               <tr><td>Cor do Nome:</td><td><edit var=\"name\" width=80></td></tr>
  #124 = String             #125          // <tr><td>Cor do Título:</td><td><edit var=\"title\" width=80></td></tr>
  #125 = Utf8               <tr><td>Cor do Título:</td><td><edit var=\"title\" width=80></td></tr>
  #126 = String             #127          // </table>
  #127 = Utf8               </table>
  #128 = String             #129          // <br><button value=\"Salvar\" action=\"bypass -h voiced_savecolor $name $title\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\">
  #129 = Utf8               <br><button value=\"Salvar\" action=\"bypass -h voiced_savecolor $name $title\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\">
  #130 = String             #131          // </center></body></html>
  #131 = Utf8               </center></body></html>
  #132 = Class              #133          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #133 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #134 = Methodref          #132.#135     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #135 = NameAndType        #5:#136       // "<init>":(I)V
  #136 = Utf8               (I)V
  #137 = Methodref          #34.#138      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #138 = NameAndType        #139:#30      // toString:()Ljava/lang/String;
  #139 = Utf8               toString
  #140 = Methodref          #132.#141     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #141 = NameAndType        #142:#26      // setHtml:(Ljava/lang/String;)V
  #142 = Utf8               setHtml
  #143 = Methodref          #16.#144      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #144 = NameAndType        #145:#146     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #145 = Utf8               sendPacket
  #146 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #147 = Fieldref           #148.#149     // ext/mods/gameserver/handler/voicedcommandhandlers/Color.VOICED_COMMANDS:[Ljava/lang/String;
  #148 = Class              #150          // ext/mods/gameserver/handler/voicedcommandhandlers/Color
  #149 = NameAndType        #151:#152     // VOICED_COMMANDS:[Ljava/lang/String;
  #150 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Color
  #151 = Utf8               VOICED_COMMANDS
  #152 = Utf8               [Ljava/lang/String;
  #153 = Class              #154          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #154 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #155 = Utf8               Code
  #156 = Utf8               LineNumberTable
  #157 = Utf8               LocalVariableTable
  #158 = Utf8               this
  #159 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Color;
  #160 = Utf8               useVoicedCommand
  #161 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #162 = Utf8               idx
  #163 = Utf8               I
  #164 = Utf8               j
  #165 = Utf8               i
  #166 = Utf8               name
  #167 = Utf8               Ljava/lang/String;
  #168 = Utf8               title
  #169 = Utf8               sb
  #170 = Utf8               Ljava/lang/StringBuilder;
  #171 = Utf8               nameColors
  #172 = Utf8               [I
  #173 = Utf8               nameColorHex
  #174 = Utf8               html
  #175 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #176 = Utf8               command
  #177 = Utf8               player
  #178 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #179 = Utf8               target
  #180 = Utf8               StackMapTable
  #181 = Class              #172          // "[I"
  #182 = Class              #152          // "[Ljava/lang/String;"
  #183 = Utf8               getVoicedCommandList
  #184 = Utf8               ()[Ljava/lang/String;
  #185 = Utf8               <clinit>
  #186 = Utf8               SourceFile
  #187 = Utf8               Color.java
  #188 = Utf8               BootstrapMethods
  #189 = String             #190          // <table bgcolor=000000 width=300><tr><td><center><font color=\"ae9977\">Change the color name for \u0001</font></center></td></tr></table>
  #190 = Utf8               <table bgcolor=000000 width=300><tr><td><center><font color=\"ae9977\">Change the color name for \u0001</font></center></td></tr></table>
  #191 = String             #192          // <td align=center><a action=\"bypass voiced_namecolor \u0001\"><font color=\"\u0001\">Select Color</font></a></td>
  #192 = Utf8               <td align=center><a action=\"bypass voiced_namecolor \u0001\"><font color=\"\u0001\">Select Color</font></a></td>
  #193 = String             #194          // <table bgcolor=000000 width=300><tr><td><center><font color=\"ae9977\">Change the color title for \u0001</font></center></td></tr></table>
  #194 = Utf8               <table bgcolor=000000 width=300><tr><td><center><font color=\"ae9977\">Change the color title for \u0001</font></center></td></tr></table>
  #195 = String             #196          // <td align=center><a action=\"bypass voiced_titlecolor \u0001\"><font color=\"\u0001\">Select Color</font></a></td>
  #196 = Utf8               <td align=center><a action=\"bypass voiced_titlecolor \u0001\"><font color=\"\u0001\">Select Color</font></a></td>
  #197 = MethodHandle       6:#198        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #198 = Methodref          #199.#200     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #199 = Class              #201          // java/lang/invoke/StringConcatFactory
  #200 = NameAndType        #57:#202      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #201 = Utf8               java/lang/invoke/StringConcatFactory
  #202 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #203 = Utf8               InnerClasses
  #204 = Class              #205          // java/lang/invoke/MethodHandles$Lookup
  #205 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #206 = Class              #207          // java/lang/invoke/MethodHandles
  #207 = Utf8               java/lang/invoke/MethodHandles
  #208 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.Color();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Color;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=12, args_size=4
         0: aload_1
         1: ldc           #7                  // String color
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          602
         9: aload_2
        10: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        13: ifgt          24
        16: aload_2
        17: ldc           #21                 // String Este comando é exclusivo para jogadores VIP.
        19: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        22: iconst_0
        23: ireturn
        24: aload_2
        25: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        28: astore        4
        30: aload_2
        31: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
        34: astore        5
        36: new           #34                 // class java/lang/StringBuilder
        39: dup
        40: invokespecial #36                 // Method java/lang/StringBuilder."<init>":()V
        43: astore        6
        45: aload         6
        47: ldc           #37                 // String <html><body>
        49: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        52: pop
        53: aload         6
        55: ldc           #43                 // String <table width=80>
        57: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        60: pop
        61: aload         6
        63: ldc           #45                 // String <tr><td><button value=\"\" action=\"bypass voiced_menu\" width=35 height=23 back=\"L2UI_CH3.calculate2_bs_down\" fore=\"L2UI_CH3.calculate2_bs\"></td>
        65: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        68: pop
        69: aload         6
        71: ldc           #47                 // String <td> Menu </td></tr></table>
        73: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        76: pop
        77: aload         6
        79: ldc           #49                 // String <center><br>
        81: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        84: pop
        85: aload         6
        87: ldc           #51                 // String <img src=\"l2ui_ch3.herotower_deco\" width=256 height=32><br>
        89: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        92: pop
        93: aload         6
        95: ldc           #53                 // String <img src=\"L2UI.SquareGray\" width=295 height=1>
        97: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       100: pop
       101: aload         6
       103: aload         4
       105: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       110: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       113: pop
       114: aload         6
       116: ldc           #59                 // String <img src=\"L2UI.SquareGray\" width=295 height=1><br>
       118: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       121: pop
       122: aload         6
       124: ldc           #61                 // String NAME COLOR
       126: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       129: pop
       130: aload         6
       132: ldc           #63                 // String <table width=300 height=80>
       134: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       137: pop
       138: bipush        12
       140: newarray       int
       142: dup
       143: iconst_0
       144: ldc           #65                 // int 39168
       146: iastore
       147: dup
       148: iconst_1
       149: ldc           #66                 // int 16744192
       151: iastore
       152: dup
       153: iconst_2
       154: ldc           #67                 // int 10043427
       156: iastore
       157: dup
       158: iconst_3
       159: ldc           #68                 // int 65535
       161: iastore
       162: dup
       163: iconst_4
       164: ldc           #69                 // int 5000268
       166: iastore
       167: dup
       168: iconst_5
       169: ldc           #70                 // int 10028082
       171: iastore
       172: dup
       173: bipush        6
       175: ldc           #71                 // int 7396243
       177: iastore
       178: dup
       179: bipush        7
       181: ldc           #72                 // int 10461087
       183: iastore
       184: dup
       185: bipush        8
       187: ldc           #73                 // int 16776960
       189: iastore
       190: dup
       191: bipush        9
       193: ldc           #74                 // int 39423
       195: iastore
       196: dup
       197: bipush        10
       199: ldc           #75                 // int 3342438
       201: iastore
       202: dup
       203: bipush        11
       205: ldc           #76                 // int 16738047
       207: iastore
       208: astore        7
       210: bipush        12
       212: anewarray     #10                 // class java/lang/String
       215: dup
       216: iconst_0
       217: ldc           #77                 // String 009900
       219: aastore
       220: dup
       221: iconst_1
       222: ldc           #79                 // String 0099ff
       224: aastore
       225: dup
       226: iconst_2
       227: ldc           #81                 // String 234099
       229: aastore
       230: dup
       231: iconst_3
       232: ldc           #83                 // String ffff00
       234: aastore
       235: dup
       236: iconst_4
       237: ldc           #85                 // String 4c4c4c
       239: aastore
       240: dup
       241: iconst_5
       242: ldc           #87                 // String 320499
       244: aastore
       245: dup
       246: bipush        6
       248: ldc           #89                 // String 80FF80
       250: aastore
       251: dup
       252: bipush        7
       254: ldc           #91                 // String AAAAAA
       256: aastore
       257: dup
       258: bipush        8
       260: ldc           #93                 // String 00FFFF
       262: aastore
       263: dup
       264: bipush        9
       266: ldc           #95                 // String ff9900
       268: aastore
       269: dup
       270: bipush        10
       272: ldc           #97                 // String 660033
       274: aastore
       275: dup
       276: bipush        11
       278: ldc           #99                 // String ff66ff
       280: aastore
       281: astore        8
       283: iconst_0
       284: istore        9
       286: iload         9
       288: aload         7
       290: arraylength
       291: if_icmpge     367
       294: aload         6
       296: ldc           #101                // String <tr>
       298: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       301: pop
       302: iconst_0
       303: istore        10
       305: iload         10
       307: iconst_3
       308: if_icmpge     353
       311: iload         9
       313: iload         10
       315: iadd
       316: istore        11
       318: iload         11
       320: aload         7
       322: arraylength
       323: if_icmpge     347
       326: aload         6
       328: aload         8
       330: iload         11
       332: aaload
       333: aload         8
       335: iload         11
       337: aaload
       338: invokedynamic #103,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       343: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       346: pop
       347: iinc          10, 1
       350: goto          305
       353: aload         6
       355: ldc           #106                // String </tr>
       357: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       360: pop
       361: iinc          9, 3
       364: goto          286
       367: aload         6
       369: ldc           #108                // String </table><br>
       371: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       374: pop
       375: aload         6
       377: ldc           #53                 // String <img src=\"L2UI.SquareGray\" width=295 height=1>
       379: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       382: pop
       383: aload         6
       385: aload         5
       387: invokedynamic #110,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       392: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       395: pop
       396: aload         6
       398: ldc           #59                 // String <img src=\"L2UI.SquareGray\" width=295 height=1><br>
       400: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       403: pop
       404: aload         6
       406: ldc           #111                // String TITLE COLOR
       408: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       411: pop
       412: aload         6
       414: ldc           #63                 // String <table width=300 height=80>
       416: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       419: pop
       420: iconst_0
       421: istore        9
       423: iload         9
       425: aload         7
       427: arraylength
       428: if_icmpge     504
       431: aload         6
       433: ldc           #101                // String <tr>
       435: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       438: pop
       439: iconst_0
       440: istore        10
       442: iload         10
       444: iconst_3
       445: if_icmpge     490
       448: iload         9
       450: iload         10
       452: iadd
       453: istore        11
       455: iload         11
       457: aload         7
       459: arraylength
       460: if_icmpge     484
       463: aload         6
       465: aload         8
       467: iload         11
       469: aaload
       470: aload         8
       472: iload         11
       474: aaload
       475: invokedynamic #113,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       480: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       483: pop
       484: iinc          10, 1
       487: goto          442
       490: aload         6
       492: ldc           #106                // String </tr>
       494: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       497: pop
       498: iinc          9, 3
       501: goto          423
       504: aload         6
       506: ldc           #114                // String </table><br><center>
       508: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       511: pop
       512: aload         6
       514: ldc           #116                // String <br><img src=\"L2UI.SquareGray\" width=295 height=1><br>
       516: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       519: pop
       520: aload         6
       522: ldc           #118                // String <font color=\"LEVEL\">Ou use um código hexadecimal manual:</font><br><br>
       524: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       527: pop
       528: aload         6
       530: ldc           #120                // String <table width=200>
       532: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       535: pop
       536: aload         6
       538: ldc           #122                // String <tr><td>Cor do Nome:</td><td><edit var=\"name\" width=80></td></tr>
       540: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       543: pop
       544: aload         6
       546: ldc           #124                // String <tr><td>Cor do Título:</td><td><edit var=\"title\" width=80></td></tr>
       548: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       551: pop
       552: aload         6
       554: ldc           #126                // String </table>
       556: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       559: pop
       560: aload         6
       562: ldc           #128                // String <br><button value=\"Salvar\" action=\"bypass -h voiced_savecolor $name $title\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\">
       564: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       567: pop
       568: aload         6
       570: ldc           #130                // String </center></body></html>
       572: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       575: pop
       576: new           #132                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       579: dup
       580: iconst_0
       581: invokespecial #134                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       584: astore        9
       586: aload         9
       588: aload         6
       590: invokevirtual #137                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       593: invokevirtual #140                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       596: aload_2
       597: aload         9
       599: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       602: iconst_1
       603: ireturn
      LineNumberTable:
        line 34: 0
        line 36: 9
        line 38: 16
        line 39: 22
        line 42: 24
        line 43: 30
        line 45: 36
        line 46: 45
        line 47: 53
        line 48: 61
        line 49: 69
        line 50: 77
        line 51: 85
        line 52: 93
        line 53: 101
        line 54: 114
        line 55: 122
        line 56: 130
        line 57: 138
        line 72: 210
        line 87: 283
        line 89: 294
        line 90: 302
        line 92: 311
        line 93: 318
        line 95: 326
        line 90: 347
        line 98: 353
        line 87: 361
        line 100: 367
        line 101: 375
        line 102: 383
        line 103: 396
        line 104: 404
        line 105: 412
        line 106: 420
        line 108: 431
        line 109: 439
        line 111: 448
        line 112: 455
        line 114: 463
        line 109: 484
        line 117: 490
        line 106: 498
        line 119: 504
        line 121: 512
        line 122: 520
        line 123: 528
        line 124: 536
        line 125: 544
        line 126: 552
        line 127: 560
        line 128: 568
        line 130: 576
        line 131: 586
        line 132: 596
        line 135: 602
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          318      29    11   idx   I
          305      48    10     j   I
          286      81     9     i   I
          455      29    11   idx   I
          442      48    10     j   I
          423      81     9     i   I
           30     572     4  name   Ljava/lang/String;
           36     566     5 title   Ljava/lang/String;
           45     557     6    sb   Ljava/lang/StringBuilder;
          210     392     7 nameColors   [I
          283     319     8 nameColorHex   [Ljava/lang/String;
          586      16     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     604     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Color;
            0     604     1 command   Ljava/lang/String;
            0     604     2 player   Lext/mods/gameserver/model/actor/Player;
            0     604     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 12
        frame_type = 24 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 261
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Color, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/StringBuilder, class "[I", class "[Ljava/lang/String;", int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 41 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 13
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 41 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 13
        frame_type = 255 /* full_frame */
          offset_delta = 97
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Color, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #147                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 141: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Color;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String color
         8: aastore
         9: putstatic     #147                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 26: 0
}
SourceFile: "Color.java"
BootstrapMethods:
  0: #197 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #189 <table bgcolor=000000 width=300><tr><td><center><font color=\"ae9977\">Change the color name for \u0001</font></center></td></tr></table>
  1: #197 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #191 <td align=center><a action=\"bypass voiced_namecolor \u0001\"><font color=\"\u0001\">Select Color</font></a></td>
  2: #197 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #193 <table bgcolor=000000 width=300><tr><td><center><font color=\"ae9977\">Change the color title for \u0001</font></center></td></tr></table>
  3: #197 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 <td align=center><a action=\"bypass voiced_titlecolor \u0001\"><font color=\"\u0001\">Select Color</font></a></td>
InnerClasses:
  public static final #208= #204 of #206; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
