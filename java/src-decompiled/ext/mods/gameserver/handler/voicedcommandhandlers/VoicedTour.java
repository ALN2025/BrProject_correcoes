// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.VoicedTour
// File: ext\mods\gameserver\handler\voicedcommandhandlers\VoicedTour.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour.class
  Last modified 9 de jul de 2026; size 6762 bytes
  MD5 checksum 6ed711a2c229ebf11cee338a00e16766
  Compiled from "VoicedTour.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.VoicedTour implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #25                         // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // tour
    #8 = Utf8               tour
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Class              #16           // ext/mods/util/Tokenizer
   #16 = Utf8               ext/mods/util/Tokenizer
   #17 = Methodref          #15.#18       // ext/mods/util/Tokenizer."<init>":(Ljava/lang/String;)V
   #18 = NameAndType        #5:#19        // "<init>":(Ljava/lang/String;)V
   #19 = Utf8               (Ljava/lang/String;)V
   #20 = Methodref          #15.#21       // ext/mods/util/Tokenizer.size:()I
   #21 = NameAndType        #22:#23       // size:()I
   #22 = Utf8               size
   #23 = Utf8               ()I
   #24 = Methodref          #25.#26       // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour.navi:(Lext/mods/gameserver/model/actor/Player;)V
   #25 = Class              #27           // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour
   #26 = NameAndType        #28:#29       // navi:(Lext/mods/gameserver/model/actor/Player;)V
   #27 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour
   #28 = Utf8               navi
   #29 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #30 = Methodref          #15.#31       // ext/mods/util/Tokenizer.getToken:(I)Ljava/lang/String;
   #31 = NameAndType        #32:#33       // getToken:(I)Ljava/lang/String;
   #32 = Utf8               getToken
   #33 = Utf8               (I)Ljava/lang/String;
   #34 = Methodref          #10.#35       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #35 = NameAndType        #36:#37       // toLowerCase:()Ljava/lang/String;
   #36 = Utf8               toLowerCase
   #37 = Utf8               ()Ljava/lang/String;
   #38 = Methodref          #10.#39       // java/lang/String.hashCode:()I
   #39 = NameAndType        #40:#23       // hashCode:()I
   #40 = Utf8               hashCode
   #41 = String             #28           // navi
   #42 = Methodref          #10.#43       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #43 = NameAndType        #44:#45       // equals:(Ljava/lang/Object;)Z
   #44 = Utf8               equals
   #45 = Utf8               (Ljava/lang/Object;)Z
   #46 = String             #47           // register
   #47 = Utf8               register
   #48 = String             #49           // unregister
   #49 = Utf8               unregister
   #50 = Methodref          #25.#51       // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour.registerToTournament:(Lext/mods/gameserver/model/actor/Player;)V
   #51 = NameAndType        #52:#29       // registerToTournament:(Lext/mods/gameserver/model/actor/Player;)V
   #52 = Utf8               registerToTournament
   #53 = Methodref          #25.#54       // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour.unregisterToTournament:(Lext/mods/gameserver/model/actor/Player;)V
   #54 = NameAndType        #55:#29       // unregisterToTournament:(Lext/mods/gameserver/model/actor/Player;)V
   #55 = Utf8               unregisterToTournament
   #56 = String             #57           // <html>\n<title>Battle Manager</title>\n<body>\n<center>\n<font color=\"LEVEL\">Tournament Manager</font>\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br><br>\n\n<table width=270>\n<tr>\n<td width=150 align=left>Registration:</td>\n<td width=60 align=center><font color=\"LEVEL\">%registed%</font></td>\n<td align=right><button value=\"Register\" action=\"bypass -h voiced_tour register\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>unRegistration:</td>\n<td width=60 align=center><font color=\"LEVEL\">%registed%</font></td>\n<td align=right><button value=\"Cancel\" action=\"bypass -h voiced_tour unregister\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>Ranking:</td>\n<td width=60></td>\n<td align=right><button value=\"See Ranking\" action=\"bypass -h voiced_tournamentrank\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>Reward:</td>\n<td width=60></td>\n<td align=right><button value=\"See Reward\" action=\"bypass -h voiced_tournamentlistreward\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n</table>\n\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br>\n\n<font color=\"LEVEL\">Tournament Event Info</font>\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br><br>\n\n<table width=270>\n<tr><td align=left>Is Running:</td><td align=right>%isRunning%</td></tr>\n<tr><td align=left>Registration Open:</td><td align=right>%isRegistering%</td></tr>\n<tr><td align=left>Duration:</td><td align=right>%eventDuration% minutes</td></tr>\n<tr><td align=left>Preparation Time:</td><td align=right>%preparationTime% minutes</td></tr>\n<tr><td align=left>Next Times:</td><td align=right>%nextTimes%</td></tr>\n</table>\n\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br>\n</center>\n</body>\n</html>\n
   #57 = Utf8               <html>\n<title>Battle Manager</title>\n<body>\n<center>\n<font color=\"LEVEL\">Tournament Manager</font>\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br><br>\n\n<table width=270>\n<tr>\n<td width=150 align=left>Registration:</td>\n<td width=60 align=center><font color=\"LEVEL\">%registed%</font></td>\n<td align=right><button value=\"Register\" action=\"bypass -h voiced_tour register\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>unRegistration:</td>\n<td width=60 align=center><font color=\"LEVEL\">%registed%</font></td>\n<td align=right><button value=\"Cancel\" action=\"bypass -h voiced_tour unregister\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>Ranking:</td>\n<td width=60></td>\n<td align=right><button value=\"See Ranking\" action=\"bypass -h voiced_tournamentrank\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>Reward:</td>\n<td width=60></td>\n<td align=right><button value=\"See Reward\" action=\"bypass -h voiced_tournamentlistreward\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n</table>\n\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br>\n\n<font color=\"LEVEL\">Tournament Event Info</font>\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br><br>\n\n<table width=270>\n<tr><td align=left>Is Running:</td><td align=right>%isRunning%</td></tr>\n<tr><td align=left>Registration Open:</td><td align=right>%isRegistering%</td></tr>\n<tr><td align=left>Duration:</td><td align=right>%eventDuration% minutes</td></tr>\n<tr><td align=left>Preparation Time:</td><td align=right>%preparationTime% minutes</td></tr>\n<tr><td align=left>Next Times:</td><td align=right>%nextTimes%</td></tr>\n</table>\n\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br>\n</center>\n</body>\n</html>\n
   #58 = String             #59           // %registed%
   #59 = Utf8               %registed%
   #60 = Methodref          #61.#62       // ext/mods/gameserver/model/actor/Player.isInTournament:()Z
   #61 = Class              #63           // ext/mods/gameserver/model/actor/Player
   #62 = NameAndType        #64:#65       // isInTournament:()Z
   #63 = Utf8               ext/mods/gameserver/model/actor/Player
   #64 = Utf8               isInTournament
   #65 = Utf8               ()Z
   #66 = String             #67           // ON
   #67 = Utf8               ON
   #68 = String             #69           // OFF
   #69 = Utf8               OFF
   #70 = Methodref          #10.#71       // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #71 = NameAndType        #72:#73       // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #72 = Utf8               replace
   #73 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #74 = Methodref          #75.#76       // ext/mods/tour/TourData.getInstance:()Lext/mods/tour/TourData;
   #75 = Class              #77           // ext/mods/tour/TourData
   #76 = NameAndType        #78:#79       // getInstance:()Lext/mods/tour/TourData;
   #77 = Utf8               ext/mods/tour/TourData
   #78 = Utf8               getInstance
   #79 = Utf8               ()Lext/mods/tour/TourData;
   #80 = Methodref          #75.#81       // ext/mods/tour/TourData.getConfig:()Lext/mods/tour/holder/TourConfig;
   #81 = NameAndType        #82:#83       // getConfig:()Lext/mods/tour/holder/TourConfig;
   #82 = Utf8               getConfig
   #83 = Utf8               ()Lext/mods/tour/holder/TourConfig;
   #84 = String             #85           // %isRunning%
   #85 = Utf8               %isRunning%
   #86 = Methodref          #87.#88       // ext/mods/tour/TournamentEvent.isRunning:()Z
   #87 = Class              #89           // ext/mods/tour/TournamentEvent
   #88 = NameAndType        #90:#65       // isRunning:()Z
   #89 = Utf8               ext/mods/tour/TournamentEvent
   #90 = Utf8               isRunning
   #91 = String             #92           // <font color=LEVEL>Yes</font>
   #92 = Utf8               <font color=LEVEL>Yes</font>
   #93 = String             #94           // No
   #94 = Utf8               No
   #95 = String             #96           // %isRegistering%
   #96 = Utf8               %isRegistering%
   #97 = Methodref          #87.#98       // ext/mods/tour/TournamentEvent.isRunningRegister:()Z
   #98 = NameAndType        #99:#65       // isRunningRegister:()Z
   #99 = Utf8               isRunningRegister
  #100 = String             #101          // %eventDuration%
  #101 = Utf8               %eventDuration%
  #102 = Methodref          #103.#104     // ext/mods/tour/holder/TourConfig.getDuration:()I
  #103 = Class              #105          // ext/mods/tour/holder/TourConfig
  #104 = NameAndType        #106:#23      // getDuration:()I
  #105 = Utf8               ext/mods/tour/holder/TourConfig
  #106 = Utf8               getDuration
  #107 = Methodref          #10.#108      // java/lang/String.valueOf:(I)Ljava/lang/String;
  #108 = NameAndType        #109:#33      // valueOf:(I)Ljava/lang/String;
  #109 = Utf8               valueOf
  #110 = String             #111          // %preparationTime%
  #111 = Utf8               %preparationTime%
  #112 = Methodref          #103.#113     // ext/mods/tour/holder/TourConfig.getPreparation:()I
  #113 = NameAndType        #114:#23      // getPreparation:()I
  #114 = Utf8               getPreparation
  #115 = String             #116          // %nextTimes%
  #116 = Utf8               %nextTimes%
  #117 = String             #118          // ,
  #118 = Utf8               ,
  #119 = Methodref          #103.#120     // ext/mods/tour/holder/TourConfig.getTimes:()Ljava/util/List;
  #120 = NameAndType        #121:#122     // getTimes:()Ljava/util/List;
  #121 = Utf8               getTimes
  #122 = Utf8               ()Ljava/util/List;
  #123 = Methodref          #10.#124      // java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #124 = NameAndType        #125:#126     // join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #125 = Utf8               join
  #126 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #127 = Class              #128          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #128 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #129 = Methodref          #127.#130     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #130 = NameAndType        #5:#131       // "<init>":(I)V
  #131 = Utf8               (I)V
  #132 = Methodref          #127.#133     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #133 = NameAndType        #134:#19      // setHtml:(Ljava/lang/String;)V
  #134 = Utf8               setHtml
  #135 = Methodref          #61.#136      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #136 = NameAndType        #137:#138     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #137 = Utf8               sendPacket
  #138 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #139 = Methodref          #61.#140      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #140 = NameAndType        #141:#142     // getParty:()Lext/mods/gameserver/model/group/Party;
  #141 = Utf8               getParty
  #142 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #143 = Methodref          #144.#145     // ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #144 = Class              #146          // ext/mods/gameserver/model/group/Party
  #145 = NameAndType        #147:#148     // isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #146 = Utf8               ext/mods/gameserver/model/group/Party
  #147 = Utf8               isLeader
  #148 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #149 = String             #150          // Only the Party Leader can register the party for the Tournament.
  #150 = Utf8               Only the Party Leader can register the party for the Tournament.
  #151 = Methodref          #61.#152      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #152 = NameAndType        #153:#19      // sendMessage:(Ljava/lang/String;)V
  #153 = Utf8               sendMessage
  #154 = Methodref          #144.#155     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #155 = NameAndType        #156:#122     // getMembers:()Ljava/util/List;
  #156 = Utf8               getMembers
  #157 = InterfaceMethodref #158.#159     // java/util/List.iterator:()Ljava/util/Iterator;
  #158 = Class              #160          // java/util/List
  #159 = NameAndType        #161:#162     // iterator:()Ljava/util/Iterator;
  #160 = Utf8               java/util/List
  #161 = Utf8               iterator
  #162 = Utf8               ()Ljava/util/Iterator;
  #163 = InterfaceMethodref #164.#165     // java/util/Iterator.hasNext:()Z
  #164 = Class              #166          // java/util/Iterator
  #165 = NameAndType        #167:#65      // hasNext:()Z
  #166 = Utf8               java/util/Iterator
  #167 = Utf8               hasNext
  #168 = InterfaceMethodref #164.#169     // java/util/Iterator.next:()Ljava/lang/Object;
  #169 = NameAndType        #170:#171     // next:()Ljava/lang/Object;
  #170 = Utf8               next
  #171 = Utf8               ()Ljava/lang/Object;
  #172 = Methodref          #61.#173      // ext/mods/gameserver/model/actor/Player.setInTournament:(Z)V
  #173 = NameAndType        #174:#175     // setInTournament:(Z)V
  #174 = Utf8               setInTournament
  #175 = Utf8               (Z)V
  #176 = String             #177          // You have been registered for the Tournament by your Party Leader!
  #177 = Utf8               You have been registered for the Tournament by your Party Leader!
  #178 = String             #179          // You are already registered for the Tournament.
  #179 = Utf8               You are already registered for the Tournament.
  #180 = String             #181          // You have registered for the Tournament!
  #181 = Utf8               You have registered for the Tournament!
  #182 = String             #183          // Only the Party Leader can unregister the party from the Tournament.
  #183 = Utf8               Only the Party Leader can unregister the party from the Tournament.
  #184 = String             #185          // Your Party Leader has unregistered you from the Tournament.
  #185 = Utf8               Your Party Leader has unregistered you from the Tournament.
  #186 = String             #187          // You were not registered for the Tournament.
  #187 = Utf8               You were not registered for the Tournament.
  #188 = String             #189          // You have unregistered from the Tournament.
  #189 = Utf8               You have unregistered from the Tournament.
  #190 = Fieldref           #25.#191      // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour.VOICED_COMMANDS:[Ljava/lang/String;
  #191 = NameAndType        #192:#193     // VOICED_COMMANDS:[Ljava/lang/String;
  #192 = Utf8               VOICED_COMMANDS
  #193 = Utf8               [Ljava/lang/String;
  #194 = Class              #195          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #195 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #196 = Utf8               Code
  #197 = Utf8               LineNumberTable
  #198 = Utf8               LocalVariableTable
  #199 = Utf8               this
  #200 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour;
  #201 = Utf8               useVoicedCommand
  #202 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #203 = Utf8               tokenizer
  #204 = Utf8               Lext/mods/util/Tokenizer;
  #205 = Utf8               param
  #206 = Utf8               Ljava/lang/String;
  #207 = Utf8               command
  #208 = Utf8               player
  #209 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #210 = Utf8               target
  #211 = Utf8               StackMapTable
  #212 = Utf8               content
  #213 = Utf8               config
  #214 = Utf8               Lext/mods/tour/holder/TourConfig;
  #215 = Utf8               html
  #216 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #217 = Utf8               member
  #218 = Utf8               getVoicedCommandList
  #219 = Utf8               ()[Ljava/lang/String;
  #220 = Utf8               <clinit>
  #221 = Utf8               SourceFile
  #222 = Utf8               VoicedTour.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.VoicedTour();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: aload_1
         1: ldc           #7                  // String tour
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          196
         9: new           #15                 // class ext/mods/util/Tokenizer
        12: dup
        13: aload_1
        14: invokespecial #17                 // Method ext/mods/util/Tokenizer."<init>":(Ljava/lang/String;)V
        17: astore        4
        19: aload         4
        21: invokevirtual #20                 // Method ext/mods/util/Tokenizer.size:()I
        24: iconst_1
        25: if_icmpne     34
        28: aload_2
        29: invokestatic  #24                 // Method navi:(Lext/mods/gameserver/model/actor/Player;)V
        32: iconst_1
        33: ireturn
        34: aload         4
        36: iconst_1
        37: invokevirtual #30                 // Method ext/mods/util/Tokenizer.getToken:(I)Ljava/lang/String;
        40: astore        5
        42: aload         5
        44: ifnonnull     53
        47: aload_2
        48: invokestatic  #24                 // Method navi:(Lext/mods/gameserver/model/actor/Player;)V
        51: iconst_1
        52: ireturn
        53: aload         5
        55: invokevirtual #34                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        58: astore        6
        60: iconst_m1
        61: istore        7
        63: aload         6
        65: invokevirtual #38                 // Method java/lang/String.hashCode:()I
        68: lookupswitch  { // 3

              -690213213: 120

                 3373990: 104

               836015164: 136
                 default: 149
            }
       104: aload         6
       106: ldc           #41                 // String navi
       108: invokevirtual #42                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       111: ifeq          149
       114: iconst_0
       115: istore        7
       117: goto          149
       120: aload         6
       122: ldc           #46                 // String register
       124: invokevirtual #42                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       127: ifeq          149
       130: iconst_1
       131: istore        7
       133: goto          149
       136: aload         6
       138: ldc           #48                 // String unregister
       140: invokevirtual #42                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       143: ifeq          149
       146: iconst_2
       147: istore        7
       149: iload         7
       151: tableswitch   { // 0 to 2

                       0: 176

                       1: 183

                       2: 191
                 default: 196
            }
       176: aload_2
       177: invokestatic  #24                 // Method navi:(Lext/mods/gameserver/model/actor/Player;)V
       180: goto          196
       183: aload_0
       184: aload_2
       185: invokevirtual #50                 // Method registerToTournament:(Lext/mods/gameserver/model/actor/Player;)V
       188: goto          196
       191: aload_0
       192: aload_2
       193: invokevirtual #53                 // Method unregisterToTournament:(Lext/mods/gameserver/model/actor/Player;)V
       196: iconst_1
       197: ireturn
      LineNumberTable:
        line 39: 0
        line 41: 9
        line 43: 19
        line 45: 28
        line 46: 32
        line 49: 34
        line 51: 42
        line 53: 47
        line 54: 51
        line 57: 53
        line 61: 176
        line 62: 180
        line 64: 183
        line 65: 188
        line 67: 191
        line 74: 196
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19     177     4 tokenizer   Lext/mods/util/Tokenizer;
           42     154     5 param   Ljava/lang/String;
            0     198     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour;
            0     198     1 command   Ljava/lang/String;
            0     198     2 player   Lext/mods/gameserver/model/actor/Player;
            0     198     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/util/Tokenizer ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []

  public static void navi(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=4, args_size=1
         0: ldc           #56                 // String <html>\n<title>Battle Manager</title>\n<body>\n<center>\n<font color=\"LEVEL\">Tournament Manager</font>\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br><br>\n\n<table width=270>\n<tr>\n<td width=150 align=left>Registration:</td>\n<td width=60 align=center><font color=\"LEVEL\">%registed%</font></td>\n<td align=right><button value=\"Register\" action=\"bypass -h voiced_tour register\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>unRegistration:</td>\n<td width=60 align=center><font color=\"LEVEL\">%registed%</font></td>\n<td align=right><button value=\"Cancel\" action=\"bypass -h voiced_tour unregister\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>Ranking:</td>\n<td width=60></td>\n<td align=right><button value=\"See Ranking\" action=\"bypass -h voiced_tournamentrank\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n\n<tr>\n<td width=150 align=left>Reward:</td>\n<td width=60></td>\n<td align=right><button value=\"See Reward\" action=\"bypass -h voiced_tournamentlistreward\" width=65 height=16 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>\n</tr>\n</table>\n\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br>\n\n<font color=\"LEVEL\">Tournament Event Info</font>\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br><br>\n\n<table width=270>\n<tr><td align=left>Is Running:</td><td align=right>%isRunning%</td></tr>\n<tr><td align=left>Registration Open:</td><td align=right>%isRegistering%</td></tr>\n<tr><td align=left>Duration:</td><td align=right>%eventDuration% minutes</td></tr>\n<tr><td align=left>Preparation Time:</td><td align=right>%preparationTime% minutes</td></tr>\n<tr><td align=left>Next Times:</td><td align=right>%nextTimes%</td></tr>\n</table>\n\n<br>\n<img src=\"L2UI.SquareGray\" width=270 height=1><br>\n</center>\n</body>\n</html>\n
         2: astore_1
         3: aload_1
         4: ldc           #58                 // String %registed%
         6: aload_0
         7: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
        10: ifeq          18
        13: ldc           #66                 // String ON
        15: goto          20
        18: ldc           #68                 // String OFF
        20: invokevirtual #70                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        23: astore_1
        24: invokestatic  #74                 // Method ext/mods/tour/TourData.getInstance:()Lext/mods/tour/TourData;
        27: invokevirtual #80                 // Method ext/mods/tour/TourData.getConfig:()Lext/mods/tour/holder/TourConfig;
        30: astore_2
        31: aload_1
        32: ldc           #84                 // String %isRunning%
        34: invokestatic  #86                 // Method ext/mods/tour/TournamentEvent.isRunning:()Z
        37: ifeq          45
        40: ldc           #91                 // String <font color=LEVEL>Yes</font>
        42: goto          47
        45: ldc           #93                 // String No
        47: invokevirtual #70                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        50: astore_1
        51: aload_1
        52: ldc           #95                 // String %isRegistering%
        54: invokestatic  #97                 // Method ext/mods/tour/TournamentEvent.isRunningRegister:()Z
        57: ifeq          65
        60: ldc           #91                 // String <font color=LEVEL>Yes</font>
        62: goto          67
        65: ldc           #93                 // String No
        67: invokevirtual #70                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        70: astore_1
        71: aload_1
        72: ldc           #100                // String %eventDuration%
        74: aload_2
        75: invokevirtual #102                // Method ext/mods/tour/holder/TourConfig.getDuration:()I
        78: invokestatic  #107                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        81: invokevirtual #70                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        84: astore_1
        85: aload_1
        86: ldc           #110                // String %preparationTime%
        88: aload_2
        89: invokevirtual #112                // Method ext/mods/tour/holder/TourConfig.getPreparation:()I
        92: invokestatic  #107                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        95: invokevirtual #70                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        98: astore_1
        99: aload_1
       100: ldc           #115                // String %nextTimes%
       102: ldc           #117                // String ,
       104: aload_2
       105: invokevirtual #119                // Method ext/mods/tour/holder/TourConfig.getTimes:()Ljava/util/List;
       108: invokestatic  #123                // Method java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
       111: invokevirtual #70                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       114: astore_1
       115: new           #127                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       118: dup
       119: iconst_0
       120: invokespecial #129                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       123: astore_3
       124: aload_3
       125: aload_1
       126: invokevirtual #132                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       129: aload_0
       130: aload_3
       131: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       134: return
      LineNumberTable:
        line 79: 0
        line 136: 3
        line 138: 24
        line 139: 31
        line 140: 51
        line 141: 71
        line 142: 85
        line 143: 99
        line 145: 115
        line 146: 124
        line 147: 129
        line 148: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     135     0 player   Lext/mods/gameserver/model/actor/Player;
            3     132     1 content   Ljava/lang/String;
           31     104     2 config   Lext/mods/tour/holder/TourConfig;
          124      11     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/tour/holder/TourConfig ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/tour/holder/TourConfig ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/tour/holder/TourConfig ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/tour/holder/TourConfig ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #190                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 237: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedTour;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String tour
         8: aastore
         9: putstatic     #190                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "VoicedTour.java"
