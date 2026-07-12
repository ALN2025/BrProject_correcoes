// Bytecode for: ext.mods.gameserver.model.actor.instance.CastleBlacksmith
// File: ext\mods\gameserver\model\actor\instance\CastleBlacksmith.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/CastleBlacksmith.class
  Last modified 9 de jul de 2026; size 4369 bytes
  MD5 checksum cd96ec8207a257e5a321bf06b9d4c183
  Compiled from "CastleBlacksmith.java"
public class ext.mods.gameserver.model.actor.instance.CastleBlacksmith extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/actor/instance/CastleBlacksmith
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 4, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/Config.ALLOW_MANOR:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // ALLOW_MANOR:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               ALLOW_MANOR
   #12 = Utf8               Z
   #13 = Class              #14           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #14 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/instance/CastleBlacksmith.getObjectId:()I
   #16 = Class              #18           // ext/mods/gameserver/model/actor/instance/CastleBlacksmith
   #17 = NameAndType        #19:#20       // getObjectId:()I
   #18 = Utf8               ext/mods/gameserver/model/actor/instance/CastleBlacksmith
   #19 = Utf8               getObjectId
   #20 = Utf8               ()I
   #21 = Methodref          #13.#22       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #22 = NameAndType        #5:#23        // "<init>":(I)V
   #23 = Utf8               (I)V
   #24 = Methodref          #25.#26       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #25 = Class              #27           // ext/mods/gameserver/model/actor/Player
   #26 = NameAndType        #28:#29       // getLocale:()Ljava/util/Locale;
   #27 = Utf8               ext/mods/gameserver/model/actor/Player
   #28 = Utf8               getLocale
   #29 = Utf8               ()Ljava/util/Locale;
   #30 = String             #31           // html/npcdefault.htm
   #31 = Utf8               html/npcdefault.htm
   #32 = Methodref          #13.#33       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #33 = NameAndType        #34:#35       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #34 = Utf8               setFile
   #35 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #36 = String             #37           // %objectId%
   #37 = Utf8               %objectId%
   #38 = Methodref          #13.#39       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #39 = NameAndType        #40:#41       // replace:(Ljava/lang/String;I)V
   #40 = Utf8               replace
   #41 = Utf8               (Ljava/lang/String;I)V
   #42 = String             #43           // %npcname%
   #43 = Utf8               %npcname%
   #44 = Methodref          #16.#45       // ext/mods/gameserver/model/actor/instance/CastleBlacksmith.getName:()Ljava/lang/String;
   #45 = NameAndType        #46:#47       // getName:()Ljava/lang/String;
   #46 = Utf8               getName
   #47 = Utf8               ()Ljava/lang/String;
   #48 = Methodref          #13.#49       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #49 = NameAndType        #40:#50       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #50 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #51 = Methodref          #25.#52       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = NameAndType        #53:#54       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Utf8               sendPacket
   #54 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = Methodref          #16.#56       // ext/mods/gameserver/model/actor/instance/CastleBlacksmith.getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #56 = NameAndType        #57:#58       // getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #57 = Utf8               getNpcTalkCond
   #58 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #59 = Fieldref           #60.#61       // ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #60 = Class              #62           // ext/mods/gameserver/enums/actors/NpcTalkCond
   #61 = NameAndType        #63:#64       // OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #62 = Utf8               ext/mods/gameserver/enums/actors/NpcTalkCond
   #63 = Utf8               OWNER
   #64 = Utf8               Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #65 = String             #66           // Chat
   #66 = Utf8               Chat
   #67 = Methodref          #68.#69       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #68 = Class              #70           // java/lang/String
   #69 = NameAndType        #71:#72       // startsWith:(Ljava/lang/String;)Z
   #70 = Utf8               java/lang/String
   #71 = Utf8               startsWith
   #72 = Utf8               (Ljava/lang/String;)Z
   #73 = Methodref          #68.#74       // java/lang/String.substring:(I)Ljava/lang/String;
   #74 = NameAndType        #75:#76       // substring:(I)Ljava/lang/String;
   #75 = Utf8               substring
   #76 = Utf8               (I)Ljava/lang/String;
   #77 = Methodref          #78.#79       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #78 = Class              #80           // java/lang/Integer
   #79 = NameAndType        #81:#82       // parseInt:(Ljava/lang/String;)I
   #80 = Utf8               java/lang/Integer
   #81 = Utf8               parseInt
   #82 = Utf8               (Ljava/lang/String;)I
   #83 = Class              #84           // java/lang/IndexOutOfBoundsException
   #84 = Utf8               java/lang/IndexOutOfBoundsException
   #85 = Class              #86           // java/lang/NumberFormatException
   #86 = Utf8               java/lang/NumberFormatException
   #87 = Methodref          #16.#88       // ext/mods/gameserver/model/actor/instance/CastleBlacksmith.showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #88 = NameAndType        #89:#90       // showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #89 = Utf8               showChatWindow
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #91 = Methodref          #2.#92        // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #92 = NameAndType        #93:#94       // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #93 = Utf8               onBypassFeedback
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #95 = Fieldref           #96.#97       // ext/mods/gameserver/model/actor/instance/CastleBlacksmith$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
   #96 = Class              #98           // ext/mods/gameserver/model/actor/instance/CastleBlacksmith$1
   #97 = NameAndType        #99:#100      // $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
   #98 = Utf8               ext/mods/gameserver/model/actor/instance/CastleBlacksmith$1
   #99 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond
  #100 = Utf8               [I
  #101 = Methodref          #60.#102      // ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
  #102 = NameAndType        #103:#20      // ordinal:()I
  #103 = Utf8               ordinal
  #104 = String             #105          // html/castleblacksmith/castleblacksmith-no.htm
  #105 = Utf8               html/castleblacksmith/castleblacksmith-no.htm
  #106 = String             #107          // html/castleblacksmith/castleblacksmith-busy.htm
  #107 = Utf8               html/castleblacksmith/castleblacksmith-busy.htm
  #108 = String             #109          // html/castleblacksmith/castleblacksmith.htm
  #109 = Utf8               html/castleblacksmith/castleblacksmith.htm
  #110 = InvokeDynamic      #0:#111       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #111 = NameAndType        #112:#76      // makeConcatWithConstants:(I)Ljava/lang/String;
  #112 = Utf8               makeConcatWithConstants
  #113 = String             #114          // %castleid%
  #114 = Utf8               %castleid%
  #115 = Methodref          #16.#116      // ext/mods/gameserver/model/actor/instance/CastleBlacksmith.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #116 = NameAndType        #117:#118     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #117 = Utf8               getCastle
  #118 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #119 = Methodref          #120.#121     // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #120 = Class              #122          // ext/mods/gameserver/model/residence/castle/Castle
  #121 = NameAndType        #123:#20      // getId:()I
  #122 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #123 = Utf8               getId
  #124 = Methodref          #25.#125      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #125 = NameAndType        #126:#127     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #126 = Utf8               getClan
  #127 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #128 = Methodref          #120.#129     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #129 = NameAndType        #130:#131     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #130 = Utf8               getSiege
  #131 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #132 = Methodref          #133.#134     // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #133 = Class              #135          // ext/mods/gameserver/model/residence/castle/Siege
  #134 = NameAndType        #136:#137     // isInProgress:()Z
  #135 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #136 = Utf8               isInProgress
  #137 = Utf8               ()Z
  #138 = Fieldref           #60.#139      // ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #139 = NameAndType        #140:#64      // UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #140 = Utf8               UNDER_SIEGE
  #141 = Methodref          #120.#142     // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
  #142 = NameAndType        #143:#20      // getOwnerId:()I
  #143 = Utf8               getOwnerId
  #144 = Methodref          #25.#145      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #145 = NameAndType        #146:#20      // getClanId:()I
  #146 = Utf8               getClanId
  #147 = Fieldref           #148.#149     // ext/mods/gameserver/enums/PrivilegeType.CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
  #148 = Class              #150          // ext/mods/gameserver/enums/PrivilegeType
  #149 = NameAndType        #151:#152     // CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
  #150 = Utf8               ext/mods/gameserver/enums/PrivilegeType
  #151 = Utf8               CP_MANOR_ADMINISTRATION
  #152 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
  #153 = Methodref          #25.#154      // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #154 = NameAndType        #155:#156     // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #155 = Utf8               hasClanPrivileges
  #156 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
  #157 = Fieldref           #60.#158      // ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #158 = NameAndType        #159:#64      // NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #159 = Utf8               NONE
  #160 = Utf8               Code
  #161 = Utf8               LineNumberTable
  #162 = Utf8               LocalVariableTable
  #163 = Utf8               this
  #164 = Utf8               Lext/mods/gameserver/model/actor/instance/CastleBlacksmith;
  #165 = Utf8               objectId
  #166 = Utf8               I
  #167 = Utf8               template
  #168 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #169 = Utf8               html
  #170 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #171 = Utf8               val
  #172 = Utf8               player
  #173 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #174 = Utf8               command
  #175 = Utf8               Ljava/lang/String;
  #176 = Utf8               StackMapTable
  #177 = Class              #178          // java/lang/RuntimeException
  #178 = Utf8               java/lang/RuntimeException
  #179 = Utf8               SourceFile
  #180 = Utf8               CastleBlacksmith.java
  #181 = Utf8               NestMembers
  #182 = Utf8               BootstrapMethods
  #183 = String             #184          // html/castleblacksmith/castleblacksmith-\u0001.htm
  #184 = Utf8               html/castleblacksmith/castleblacksmith-\u0001.htm
  #185 = MethodHandle       6:#186        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #186 = Methodref          #187.#188     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #187 = Class              #189          // java/lang/invoke/StringConcatFactory
  #188 = NameAndType        #112:#190     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #189 = Utf8               java/lang/invoke/StringConcatFactory
  #190 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #191 = Utf8               InnerClasses
  #192 = Class              #193          // java/lang/invoke/MethodHandles$Lookup
  #193 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #194 = Class              #195          // java/lang/invoke/MethodHandles
  #195 = Utf8               java/lang/invoke/MethodHandles
  #196 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.CastleBlacksmith(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 31: 0
        line 32: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/CastleBlacksmith;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: getstatic     #7                  // Field ext/mods/Config.ALLOW_MANOR:Z
         3: ifne          54
         6: new           #13                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         9: dup
        10: aload_0
        11: invokevirtual #15                 // Method getObjectId:()I
        14: invokespecial #21                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        17: astore_3
        18: aload_3
        19: aload_1
        20: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        23: ldc           #30                 // String html/npcdefault.htm
        25: invokevirtual #32                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        28: aload_3
        29: ldc           #36                 // String %objectId%
        31: aload_0
        32: invokevirtual #15                 // Method getObjectId:()I
        35: invokevirtual #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        38: aload_3
        39: ldc           #42                 // String %npcname%
        41: aload_0
        42: invokevirtual #44                 // Method getName:()Ljava/lang/String;
        45: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        48: aload_1
        49: aload_3
        50: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        53: return
        54: aload_0
        55: aload_1
        56: invokevirtual #55                 // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
        59: getstatic     #59                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        62: if_acmpeq     66
        65: return
        66: aload_2
        67: ldc           #65                 // String Chat
        69: invokevirtual #67                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        72: ifeq          100
        75: iconst_0
        76: istore_3
        77: aload_2
        78: iconst_5
        79: invokevirtual #73                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        82: invokestatic  #77                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        85: istore_3
        86: goto          91
        89: astore        4
        91: aload_0
        92: aload_1
        93: iload_3
        94: invokevirtual #87                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
        97: goto          106
       100: aload_0
       101: aload_1
       102: aload_2
       103: invokespecial #91                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       106: return
      Exception table:
         from    to  target type
            77    86    89   Class java/lang/IndexOutOfBoundsException
            77    86    89   Class java/lang/NumberFormatException
      LineNumberTable:
        line 37: 0
        line 39: 6
        line 40: 18
        line 41: 28
        line 42: 38
        line 43: 48
        line 44: 53
        line 47: 54
        line 48: 65
        line 50: 66
        line 52: 75
        line 55: 77
        line 59: 86
        line 57: 89
        line 60: 91
        line 61: 97
        line 63: 100
        line 64: 106
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      36     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           77      20     3   val   I
            0     107     0  this   Lext/mods/gameserver/model/actor/instance/CastleBlacksmith;
            0     107     1 player   Lext/mods/gameserver/model/actor/Player;
            0     107     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 6
        frame_type = 54 /* same */
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleBlacksmith, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int ]
          stack = [ class java/lang/RuntimeException ]
        frame_type = 1 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: getstatic     #7                  // Field ext/mods/Config.ALLOW_MANOR:Z
         3: ifne          54
         6: new           #13                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         9: dup
        10: aload_0
        11: invokevirtual #15                 // Method getObjectId:()I
        14: invokespecial #21                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        17: astore_3
        18: aload_3
        19: aload_1
        20: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        23: ldc           #30                 // String html/npcdefault.htm
        25: invokevirtual #32                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        28: aload_3
        29: ldc           #36                 // String %objectId%
        31: aload_0
        32: invokevirtual #15                 // Method getObjectId:()I
        35: invokevirtual #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        38: aload_3
        39: ldc           #42                 // String %npcname%
        41: aload_0
        42: invokevirtual #44                 // Method getName:()Ljava/lang/String;
        45: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        48: aload_1
        49: aload_3
        50: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        53: return
        54: new           #13                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        57: dup
        58: aload_0
        59: invokevirtual #15                 // Method getObjectId:()I
        62: invokespecial #21                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        65: astore_3
        66: getstatic     #95                 // Field ext/mods/gameserver/model/actor/instance/CastleBlacksmith$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
        69: aload_0
        70: aload_1
        71: invokevirtual #55                 // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
        74: invokevirtual #101                // Method ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
        77: iaload
        78: lookupswitch  { // 2

                       1: 104

                       2: 117
                 default: 130
            }
       104: aload_3
       105: aload_1
       106: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       109: ldc           #104                // String html/castleblacksmith/castleblacksmith-no.htm
       111: invokevirtual #32                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       114: goto          161
       117: aload_3
       118: aload_1
       119: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       122: ldc           #106                // String html/castleblacksmith/castleblacksmith-busy.htm
       124: invokevirtual #32                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       127: goto          161
       130: iload_2
       131: ifne          147
       134: aload_3
       135: aload_1
       136: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       139: ldc           #108                // String html/castleblacksmith/castleblacksmith.htm
       141: invokevirtual #32                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       144: goto          161
       147: aload_3
       148: aload_1
       149: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       152: iload_2
       153: invokedynamic #110,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       158: invokevirtual #32                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       161: aload_3
       162: ldc           #36                 // String %objectId%
       164: aload_0
       165: invokevirtual #15                 // Method getObjectId:()I
       168: invokevirtual #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       171: aload_3
       172: ldc           #42                 // String %npcname%
       174: aload_0
       175: invokevirtual #44                 // Method getName:()Ljava/lang/String;
       178: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       181: aload_3
       182: ldc           #113                // String %castleid%
       184: aload_0
       185: invokevirtual #115                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       188: invokevirtual #119                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       191: invokevirtual #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       194: aload_1
       195: aload_3
       196: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       199: return
      LineNumberTable:
        line 69: 0
        line 71: 6
        line 72: 18
        line 73: 28
        line 74: 38
        line 75: 48
        line 76: 53
        line 79: 54
        line 81: 66
        line 84: 104
        line 85: 114
        line 88: 117
        line 89: 127
        line 92: 130
        line 93: 134
        line 95: 147
        line 99: 161
        line 100: 171
        line 101: 181
        line 102: 194
        line 103: 199
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      36     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     200     0  this   Lext/mods/gameserver/model/actor/instance/CastleBlacksmith;
            0     200     1 player   Lext/mods/gameserver/model/actor/Player;
            0     200     2   val   I
           66     134     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 6
        frame_type = 54 /* same */
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */

  protected ext.mods.gameserver.enums.actors.NpcTalkCond getNpcTalkCond(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #115                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
         4: ifnull        59
         7: aload_1
         8: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        11: ifnull        59
        14: aload_0
        15: invokevirtual #115                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: invokevirtual #128                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        21: invokevirtual #132                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        24: ifeq          31
        27: getstatic     #138                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        30: areturn
        31: aload_0
        32: invokevirtual #115                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        35: invokevirtual #141                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        38: aload_1
        39: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        42: if_icmpne     59
        45: aload_1
        46: getstatic     #147                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
        49: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
        52: ifeq          59
        55: getstatic     #59                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        58: areturn
        59: getstatic     #157                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        62: areturn
      LineNumberTable:
        line 108: 0
        line 110: 14
        line 111: 27
        line 113: 31
        line 114: 55
        line 116: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/actor/instance/CastleBlacksmith;
            0      63     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 27 /* same */
}
SourceFile: "CastleBlacksmith.java"
NestMembers:
  ext/mods/gameserver/model/actor/instance/CastleBlacksmith$1
BootstrapMethods:
  0: #185 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #183 html/castleblacksmith/castleblacksmith-\u0001.htm
InnerClasses:
  static #96;                             // class ext/mods/gameserver/model/actor/instance/CastleBlacksmith$1
  public static final #196= #192 of #194; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
