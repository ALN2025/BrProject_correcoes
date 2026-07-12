// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.SaveColor
// File: ext\mods\gameserver\handler\voicedcommandhandlers\SaveColor.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/SaveColor.class
  Last modified 9 de jul de 2026; size 2840 bytes
  MD5 checksum 2af05557061204b17c0f75eea79dacd9
  Compiled from "SaveColor.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.SaveColor implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #97                         // ext/mods/gameserver/handler/voicedcommandhandlers/SaveColor
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // namecolor
    #8 = Utf8               namecolor
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Class              #16           // java/util/StringTokenizer
   #16 = Utf8               java/util/StringTokenizer
   #17 = String             #18           //
   #18 = Utf8
   #19 = Methodref          #15.#20       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #20 = NameAndType        #5:#21        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #21 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #22 = Methodref          #15.#23       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #23 = NameAndType        #24:#25       // nextToken:()Ljava/lang/String;
   #24 = Utf8               nextToken
   #25 = Utf8               ()Ljava/lang/String;
   #26 = Methodref          #10.#27       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #27 = NameAndType        #28:#29       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #28 = Utf8               valueOf
   #29 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Player
   #32 = NameAndType        #34:#35       // getPremiumService:()I
   #33 = Utf8               ext/mods/gameserver/model/actor/Player
   #34 = Utf8               getPremiumService
   #35 = Utf8               ()I
   #36 = String             #37           // Apenas VIPs podem personalizar as cores.
   #37 = Utf8               Apenas VIPs podem personalizar as cores.
   #38 = Methodref          #31.#39       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #39 = NameAndType        #40:#41       // sendMessage:(Ljava/lang/String;)V
   #40 = Utf8               sendMessage
   #41 = Utf8               (Ljava/lang/String;)V
   #42 = Methodref          #10.#43       // java/lang/String.isEmpty:()Z
   #43 = NameAndType        #44:#45       // isEmpty:()Z
   #44 = Utf8               isEmpty
   #45 = Utf8               ()Z
   #46 = String             #47           // Informe uma cor hexadecimal válida, ex: FF0000
   #47 = Utf8               Informe uma cor hexadecimal válida, ex: FF0000
   #48 = Methodref          #31.#49       // ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
   #49 = NameAndType        #50:#51       // getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
   #50 = Utf8               getMemos
   #51 = Utf8               ()Lext/mods/gameserver/model/memo/PlayerMemo;
   #52 = String             #53           // name_color
   #53 = Utf8               name_color
   #54 = Methodref          #55.#56       // ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
   #55 = Class              #57           // ext/mods/gameserver/model/memo/PlayerMemo
   #56 = NameAndType        #58:#21       // set:(Ljava/lang/String;Ljava/lang/String;)V
   #57 = Utf8               ext/mods/gameserver/model/memo/PlayerMemo
   #58 = Utf8               set
   #59 = Methodref          #31.#60       // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #60 = NameAndType        #61:#62       // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #61 = Utf8               getAppearance
   #62 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #63 = Methodref          #64.#65       // java/lang/Integer.parseInt:(Ljava/lang/String;I)I
   #64 = Class              #66           // java/lang/Integer
   #65 = NameAndType        #67:#68       // parseInt:(Ljava/lang/String;I)I
   #66 = Utf8               java/lang/Integer
   #67 = Utf8               parseInt
   #68 = Utf8               (Ljava/lang/String;I)I
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
   #70 = Class              #72           // ext/mods/gameserver/model/actor/container/player/Appearance
   #71 = NameAndType        #73:#74       // setNameColor:(I)V
   #72 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #73 = Utf8               setNameColor
   #74 = Utf8               (I)V
   #75 = Methodref          #31.#76       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #76 = NameAndType        #77:#6        // broadcastUserInfo:()V
   #77 = Utf8               broadcastUserInfo
   #78 = String             #79           // Cores aplicadas com sucesso!
   #79 = Utf8               Cores aplicadas com sucesso!
   #80 = String             #81           // titlecolor
   #81 = Utf8               titlecolor
   #82 = String             #83           // title_color
   #83 = Utf8               title_color
   #84 = Methodref          #70.#85       // ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
   #85 = NameAndType        #86:#74       // setTitleColor:(I)V
   #86 = Utf8               setTitleColor
   #87 = String             #88           // savecolor
   #88 = Utf8               savecolor
   #89 = String             #90           // [0-9A-Fa-f]{6}
   #90 = Utf8               [0-9A-Fa-f]{6}
   #91 = Methodref          #10.#92       // java/lang/String.matches:(Ljava/lang/String;)Z
   #92 = NameAndType        #93:#14       // matches:(Ljava/lang/String;)Z
   #93 = Utf8               matches
   #94 = String             #95           // Use códigos hexadecimais válidos, ex: FF0000.
   #95 = Utf8               Use códigos hexadecimais válidos, ex: FF0000.
   #96 = Fieldref           #97.#98       // ext/mods/gameserver/handler/voicedcommandhandlers/SaveColor.VOICED_COMMANDS:[Ljava/lang/String;
   #97 = Class              #99           // ext/mods/gameserver/handler/voicedcommandhandlers/SaveColor
   #98 = NameAndType        #100:#101     // VOICED_COMMANDS:[Ljava/lang/String;
   #99 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/SaveColor
  #100 = Utf8               VOICED_COMMANDS
  #101 = Utf8               [Ljava/lang/String;
  #102 = Class              #103          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #103 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #104 = Utf8               Code
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               this
  #108 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/SaveColor;
  #109 = Utf8               useVoicedCommand
  #110 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #111 = Utf8               st
  #112 = Utf8               Ljava/util/StringTokenizer;
  #113 = Utf8               nameColor
  #114 = Utf8               Ljava/lang/String;
  #115 = Utf8               titleColor
  #116 = Utf8               command
  #117 = Utf8               player
  #118 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #119 = Utf8               args
  #120 = Utf8               StackMapTable
  #121 = Utf8               getVoicedCommandList
  #122 = Utf8               ()[Ljava/lang/String;
  #123 = Utf8               <clinit>
  #124 = Utf8               SourceFile
  #125 = Utf8               SaveColor.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.SaveColor();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SaveColor;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_1
         1: ldc           #7                  // String namecolor
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          108
         9: new           #15                 // class java/util/StringTokenizer
        12: dup
        13: aload_1
        14: ldc           #17                 // String
        16: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        19: astore        4
        21: aload         4
        23: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        26: pop
        27: aload         4
        29: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        32: invokestatic  #26                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        35: astore        5
        37: aload_2
        38: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        41: ifgt          52
        44: aload_2
        45: ldc           #36                 // String Apenas VIPs podem personalizar as cores.
        47: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        50: iconst_0
        51: ireturn
        52: aload         5
        54: ifnull        65
        57: aload         5
        59: invokevirtual #42                 // Method java/lang/String.isEmpty:()Z
        62: ifeq          73
        65: aload_2
        66: ldc           #46                 // String Informe uma cor hexadecimal válida, ex: FF0000
        68: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        71: iconst_0
        72: ireturn
        73: aload_2
        74: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
        77: ldc           #52                 // String name_color
        79: aload         5
        81: invokevirtual #54                 // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
        84: aload_2
        85: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        88: aload         5
        90: bipush        16
        92: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;I)I
        95: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
        98: aload_2
        99: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       102: aload_2
       103: ldc           #78                 // String Cores aplicadas com sucesso!
       105: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       108: aload_1
       109: ldc           #80                 // String titlecolor
       111: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       114: ifeq          216
       117: aload_2
       118: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       121: ifgt          132
       124: aload_2
       125: ldc           #36                 // String Apenas VIPs podem personalizar as cores.
       127: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       130: iconst_0
       131: ireturn
       132: new           #15                 // class java/util/StringTokenizer
       135: dup
       136: aload_1
       137: ldc           #17                 // String
       139: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       142: astore        4
       144: aload         4
       146: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       149: pop
       150: aload         4
       152: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       155: invokestatic  #26                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       158: astore        5
       160: aload         5
       162: ifnull        173
       165: aload         5
       167: invokevirtual #42                 // Method java/lang/String.isEmpty:()Z
       170: ifeq          181
       173: aload_2
       174: ldc           #46                 // String Informe uma cor hexadecimal válida, ex: FF0000
       176: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       179: iconst_0
       180: ireturn
       181: aload_2
       182: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       185: ldc           #82                 // String title_color
       187: aload         5
       189: invokevirtual #54                 // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
       192: aload_2
       193: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       196: aload         5
       198: bipush        16
       200: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;I)I
       203: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
       206: aload_2
       207: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       210: aload_2
       211: ldc           #78                 // String Cores aplicadas com sucesso!
       213: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       216: aload_1
       217: ldc           #87                 // String savecolor
       219: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       222: ifeq          366
       225: aload_2
       226: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       229: ifgt          240
       232: aload_2
       233: ldc           #36                 // String Apenas VIPs podem personalizar as cores.
       235: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       238: iconst_0
       239: ireturn
       240: new           #15                 // class java/util/StringTokenizer
       243: dup
       244: aload_1
       245: ldc           #17                 // String
       247: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       250: astore        4
       252: aload         4
       254: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       257: pop
       258: aload         4
       260: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       263: invokestatic  #26                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       266: astore        5
       268: aload         4
       270: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       273: invokestatic  #26                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       276: astore        6
       278: aload         6
       280: ldc           #89                 // String [0-9A-Fa-f]{6}
       282: invokevirtual #91                 // Method java/lang/String.matches:(Ljava/lang/String;)Z
       285: ifeq          298
       288: aload         5
       290: ldc           #89                 // String [0-9A-Fa-f]{6}
       292: invokevirtual #91                 // Method java/lang/String.matches:(Ljava/lang/String;)Z
       295: ifne          306
       298: aload_2
       299: ldc           #94                 // String Use códigos hexadecimais válidos, ex: FF0000.
       301: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       304: iconst_0
       305: ireturn
       306: aload_2
       307: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       310: ldc           #52                 // String name_color
       312: aload         6
       314: invokevirtual #54                 // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
       317: aload_2
       318: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       321: ldc           #82                 // String title_color
       323: aload         5
       325: invokevirtual #54                 // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
       328: aload_2
       329: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       332: aload         6
       334: bipush        16
       336: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;I)I
       339: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
       342: aload_2
       343: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       346: aload         5
       348: bipush        16
       350: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;I)I
       353: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
       356: aload_2
       357: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       360: aload_2
       361: ldc           #78                 // String Cores aplicadas com sucesso!
       363: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       366: iconst_1
       367: ireturn
      LineNumberTable:
        line 39: 0
        line 41: 9
        line 42: 21
        line 44: 27
        line 46: 37
        line 48: 44
        line 49: 50
        line 52: 52
        line 54: 65
        line 55: 71
        line 58: 73
        line 60: 84
        line 62: 98
        line 63: 102
        line 67: 108
        line 69: 117
        line 71: 124
        line 72: 130
        line 75: 132
        line 76: 144
        line 78: 150
        line 80: 160
        line 82: 173
        line 83: 179
        line 86: 181
        line 88: 192
        line 89: 206
        line 91: 210
        line 95: 216
        line 97: 225
        line 99: 232
        line 100: 238
        line 103: 240
        line 104: 252
        line 106: 258
        line 107: 268
        line 109: 278
        line 111: 298
        line 112: 304
        line 115: 306
        line 116: 317
        line 118: 328
        line 119: 342
        line 120: 356
        line 122: 360
        line 126: 366
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21      87     4    st   Ljava/util/StringTokenizer;
           37      71     5 nameColor   Ljava/lang/String;
          144      72     4    st   Ljava/util/StringTokenizer;
          160      56     5 titleColor   Ljava/lang/String;
          252     114     4    st   Ljava/util/StringTokenizer;
          268      98     5 titleColor   Ljava/lang/String;
          278      88     6 nameColor   Ljava/lang/String;
            0     368     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SaveColor;
            0     368     1 command   Ljava/lang/String;
            0     368     2 player   Lext/mods/gameserver/model/actor/Player;
            0     368     3  args   Ljava/lang/String;
      StackMapTable: number_of_entries = 12
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class java/util/StringTokenizer, class java/lang/String ]
        frame_type = 12 /* same */
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 34
        frame_type = 23 /* same */
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class java/util/StringTokenizer, class java/lang/String ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 34
        frame_type = 23 /* same */
        frame_type = 254 /* append */
          offset_delta = 57
          locals = [ class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
        frame_type = 7 /* same */
        frame_type = 248 /* chop */
          offset_delta = 59

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #96                 // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SaveColor;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #87                 // String savecolor
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #7                  // String namecolor
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #80                 // String titlecolor
        18: aastore
        19: putstatic     #96                 // Field VOICED_COMMANDS:[Ljava/lang/String;
        22: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "SaveColor.java"
