// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Acp
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Acp.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Acp.class
  Last modified 9 de jul de 2026; size 4792 bytes
  MD5 checksum 3f9880db64748d619ec26b370901de36
  Compiled from "Acp.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Acp implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #61                         // ext/mods/gameserver/handler/voicedcommandhandlers/Acp
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.AUTO_POTIONS_ENABLED:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // AUTO_POTIONS_ENABLED:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               AUTO_POTIONS_ENABLED
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
   #23 = Methodref          #14.#24       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #24 = NameAndType        #25:#26       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #25 = Utf8               getStatus
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #28 = Class              #30           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #29 = NameAndType        #31:#32       // getLevel:()I
   #30 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #31 = Utf8               getLevel
   #32 = Utf8               ()I
   #33 = Fieldref           #8.#34        // ext/mods/Config.AUTO_POTION_MIN_LEVEL:I
   #34 = NameAndType        #35:#36       // AUTO_POTION_MIN_LEVEL:I
   #35 = Utf8               AUTO_POTION_MIN_LEVEL
   #36 = Utf8               I
   #37 = Methodref          #38.#39       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #38 = Class              #40           // java/lang/Integer
   #39 = NameAndType        #41:#42       // valueOf:(I)Ljava/lang/Integer;
   #40 = Utf8               java/lang/Integer
   #41 = Utf8               valueOf
   #42 = Utf8               (I)Ljava/lang/Integer;
   #43 = Methodref          #44.#45       // java/lang/String.hashCode:()I
   #44 = Class              #46           // java/lang/String
   #45 = NameAndType        #47:#32       // hashCode:()I
   #46 = Utf8               java/lang/String
   #47 = Utf8               hashCode
   #48 = String             #49           // acp
   #49 = Utf8               acp
   #50 = Methodref          #44.#51       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #51 = NameAndType        #52:#53       // equals:(Ljava/lang/Object;)Z
   #52 = Utf8               equals
   #53 = Utf8               (Ljava/lang/Object;)Z
   #54 = String             #55           // acpEnabled
   #55 = Utf8               acpEnabled
   #56 = String             #57           // acpDisabled
   #57 = Utf8               acpDisabled
   #58 = String             #59           //
   #59 = Utf8
   #60 = Methodref          #61.#62       // ext/mods/gameserver/handler/voicedcommandhandlers/Acp.sendAcpHtml:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #61 = Class              #63           // ext/mods/gameserver/handler/voicedcommandhandlers/Acp
   #62 = NameAndType        #64:#65       // sendAcpHtml:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #63 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Acp
   #64 = Utf8               sendAcpHtml
   #65 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #66 = Methodref          #67.#68       // ext/mods/gameserver/taskmanager/AutoPotionTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AutoPotionTaskManager;
   #67 = Class              #69           // ext/mods/gameserver/taskmanager/AutoPotionTaskManager
   #68 = NameAndType        #70:#71       // getInstance:()Lext/mods/gameserver/taskmanager/AutoPotionTaskManager;
   #69 = Utf8               ext/mods/gameserver/taskmanager/AutoPotionTaskManager
   #70 = Utf8               getInstance
   #71 = Utf8               ()Lext/mods/gameserver/taskmanager/AutoPotionTaskManager;
   #72 = Methodref          #67.#73       // ext/mods/gameserver/taskmanager/AutoPotionTaskManager.add:(Lext/mods/gameserver/model/actor/Player;)V
   #73 = NameAndType        #74:#75       // add:(Lext/mods/gameserver/model/actor/Player;)V
   #74 = Utf8               add
   #75 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #76 = Methodref          #67.#77       // ext/mods/gameserver/taskmanager/AutoPotionTaskManager.remove:(Lext/mods/gameserver/model/actor/Player;)V
   #77 = NameAndType        #78:#75       // remove:(Lext/mods/gameserver/model/actor/Player;)V
   #78 = Utf8               remove
   #79 = String             #80           // setCp
   #80 = Utf8               setCp
   #81 = Methodref          #44.#82       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #82 = NameAndType        #83:#84       // startsWith:(Ljava/lang/String;)Z
   #83 = Utf8               startsWith
   #84 = Utf8               (Ljava/lang/String;)Z
   #85 = Fieldref           #8.#86        // ext/mods/Config.AUTO_CP_ENABLED:Z
   #86 = NameAndType        #87:#12       // AUTO_CP_ENABLED:Z
   #87 = Utf8               AUTO_CP_ENABLED
   #88 = String             #89           // Cp
   #89 = Utf8               Cp
   #90 = Methodref          #61.#91       // ext/mods/gameserver/handler/voicedcommandhandlers/Acp.setAutoPotionValue:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #91 = NameAndType        #92:#93       // setAutoPotionValue:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #92 = Utf8               setAutoPotionValue
   #93 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #94 = String             #95           // setHp
   #95 = Utf8               setHp
   #96 = Fieldref           #8.#97        // ext/mods/Config.AUTO_HP_ENABLED:Z
   #97 = NameAndType        #98:#12       // AUTO_HP_ENABLED:Z
   #98 = Utf8               AUTO_HP_ENABLED
   #99 = String             #100          // Hp
  #100 = Utf8               Hp
  #101 = String             #102          // setMp
  #102 = Utf8               setMp
  #103 = Fieldref           #8.#104       // ext/mods/Config.AUTO_MP_ENABLED:Z
  #104 = NameAndType        #105:#12      // AUTO_MP_ENABLED:Z
  #105 = Utf8               AUTO_MP_ENABLED
  #106 = String             #107          // Mp
  #107 = Utf8               Mp
  #108 = Class              #109          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #109 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #110 = Methodref          #108.#111     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #111 = NameAndType        #5:#112       // "<init>":(I)V
  #112 = Utf8               (I)V
  #113 = Methodref          #14.#114      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #114 = NameAndType        #115:#116     // getLocale:()Ljava/util/Locale;
  #115 = Utf8               getLocale
  #116 = Utf8               ()Ljava/util/Locale;
  #117 = String             #118          // html/mods/acp.htm
  #118 = Utf8               html/mods/acp.htm
  #119 = Methodref          #108.#120     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #120 = NameAndType        #121:#122     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #121 = Utf8               setFile
  #122 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #123 = String             #124          // %valueCp%
  #124 = Utf8               %valueCp%
  #125 = Methodref          #14.#126      // ext/mods/gameserver/model/actor/Player.isAcpCp:()I
  #126 = NameAndType        #127:#32      // isAcpCp:()I
  #127 = Utf8               isAcpCp
  #128 = Methodref          #108.#129     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #129 = NameAndType        #130:#131     // replace:(Ljava/lang/String;I)V
  #130 = Utf8               replace
  #131 = Utf8               (Ljava/lang/String;I)V
  #132 = String             #133          // %valueHp%
  #133 = Utf8               %valueHp%
  #134 = Methodref          #14.#135      // ext/mods/gameserver/model/actor/Player.isAcpHp:()I
  #135 = NameAndType        #136:#32      // isAcpHp:()I
  #136 = Utf8               isAcpHp
  #137 = String             #138          // %valueMp%
  #138 = Utf8               %valueMp%
  #139 = Methodref          #14.#140      // ext/mods/gameserver/model/actor/Player.isAcpMp:()I
  #140 = NameAndType        #141:#32      // isAcpMp:()I
  #141 = Utf8               isAcpMp
  #142 = String             #143          // %msg%
  #143 = Utf8               %msg%
  #144 = Methodref          #108.#145     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #145 = NameAndType        #130:#146     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #146 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #147 = Methodref          #14.#148      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #148 = NameAndType        #149:#150     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #149 = Utf8               sendPacket
  #150 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #151 = Methodref          #44.#152      // java/lang/String.length:()I
  #152 = NameAndType        #153:#32      // length:()I
  #153 = Utf8               length
  #154 = Methodref          #44.#155      // java/lang/String.substring:(I)Ljava/lang/String;
  #155 = NameAndType        #156:#157     // substring:(I)Ljava/lang/String;
  #156 = Utf8               substring
  #157 = Utf8               (I)Ljava/lang/String;
  #158 = Methodref          #44.#159      // java/lang/String.trim:()Ljava/lang/String;
  #159 = NameAndType        #160:#161     // trim:()Ljava/lang/String;
  #160 = Utf8               trim
  #161 = Utf8               ()Ljava/lang/String;
  #162 = InvokeDynamic      #0:#163       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #163 = NameAndType        #164:#165     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #164 = Utf8               makeConcatWithConstants
  #165 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #166 = Methodref          #44.#167      // java/lang/String.isEmpty:()Z
  #167 = NameAndType        #168:#169     // isEmpty:()Z
  #168 = Utf8               isEmpty
  #169 = Utf8               ()Z
  #170 = Methodref          #38.#171      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #171 = NameAndType        #172:#173     // parseInt:(Ljava/lang/String;)I
  #172 = Utf8               parseInt
  #173 = Utf8               (Ljava/lang/String;)I
  #174 = Methodref          #14.#175      // ext/mods/gameserver/model/actor/Player.setAcpCp:(I)V
  #175 = NameAndType        #176:#112     // setAcpCp:(I)V
  #176 = Utf8               setAcpCp
  #177 = Methodref          #14.#178      // ext/mods/gameserver/model/actor/Player.setAcpHp:(I)V
  #178 = NameAndType        #179:#112     // setAcpHp:(I)V
  #179 = Utf8               setAcpHp
  #180 = Methodref          #14.#181      // ext/mods/gameserver/model/actor/Player.setAcpMp:(I)V
  #181 = NameAndType        #182:#112     // setAcpMp:(I)V
  #182 = Utf8               setAcpMp
  #183 = InvokeDynamic      #1:#163       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #184 = Class              #185          // java/lang/NumberFormatException
  #185 = Utf8               java/lang/NumberFormatException
  #186 = Fieldref           #61.#187      // ext/mods/gameserver/handler/voicedcommandhandlers/Acp.VOICED_COMMANDS:[Ljava/lang/String;
  #187 = NameAndType        #188:#189     // VOICED_COMMANDS:[Ljava/lang/String;
  #188 = Utf8               VOICED_COMMANDS
  #189 = Utf8               [Ljava/lang/String;
  #190 = Class              #191          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #191 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #192 = Utf8               Code
  #193 = Utf8               LineNumberTable
  #194 = Utf8               LocalVariableTable
  #195 = Utf8               this
  #196 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Acp;
  #197 = Utf8               useVoicedCommand
  #198 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #199 = Utf8               command
  #200 = Utf8               Ljava/lang/String;
  #201 = Utf8               player
  #202 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #203 = Utf8               target
  #204 = Utf8               StackMapTable
  #205 = Utf8               message
  #206 = Utf8               htm
  #207 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #208 = Utf8               value
  #209 = Utf8               type
  #210 = Utf8               valueStr
  #211 = Utf8               getVoicedCommandList
  #212 = Utf8               ()[Ljava/lang/String;
  #213 = Utf8               <clinit>
  #214 = Utf8               SourceFile
  #215 = Utf8               Acp.java
  #216 = Utf8               BootstrapMethods
  #217 = String             #218          // <font color=\"FF0000\">\u0001</font>
  #218 = Utf8               <font color=\"FF0000\">\u0001</font>
  #219 = String             #220          // <font color=\"00FF00\">\u0001</font>
  #220 = Utf8               <font color=\"00FF00\">\u0001</font>
  #221 = MethodHandle       6:#222        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #222 = Methodref          #223.#224     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #223 = Class              #225          // java/lang/invoke/StringConcatFactory
  #224 = NameAndType        #164:#226     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #225 = Utf8               java/lang/invoke/StringConcatFactory
  #226 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #227 = Utf8               InnerClasses
  #228 = Class              #229          // java/lang/invoke/MethodHandles$Lookup
  #229 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #230 = Class              #231          // java/lang/invoke/MethodHandles
  #231 = Utf8               java/lang/invoke/MethodHandles
  #232 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.Acp();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Acp;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=4
         0: getstatic     #7                  // Field ext/mods/Config.AUTO_POTIONS_ENABLED:Z
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
        23: aload_2
        24: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        27: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        30: getstatic     #33                 // Field ext/mods/Config.AUTO_POTION_MIN_LEVEL:I
        33: if_icmpge     62
        36: aload_2
        37: aload_2
        38: sipush        10188
        41: iconst_1
        42: anewarray     #2                  // class java/lang/Object
        45: dup
        46: iconst_0
        47: getstatic     #33                 // Field ext/mods/Config.AUTO_POTION_MIN_LEVEL:I
        50: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        53: aastore
        54: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        57: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        60: iconst_0
        61: ireturn
        62: aload_1
        63: astore        4
        65: iconst_m1
        66: istore        5
        68: aload         4
        70: invokevirtual #43                 // Method java/lang/String.hashCode:()I
        73: lookupswitch  { // 3

              -721442518: 140

                   96398: 108

              1544982227: 124
                 default: 153
            }
       108: aload         4
       110: ldc           #48                 // String acp
       112: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       115: ifeq          153
       118: iconst_0
       119: istore        5
       121: goto          153
       124: aload         4
       126: ldc           #54                 // String acpEnabled
       128: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       131: ifeq          153
       134: iconst_1
       135: istore        5
       137: goto          153
       140: aload         4
       142: ldc           #56                 // String acpDisabled
       144: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       147: ifeq          153
       150: iconst_2
       151: istore        5
       153: iload         5
       155: tableswitch   { // 0 to 2

                       0: 180

                       1: 190

                       2: 215
                 default: 240
            }
       180: aload_0
       181: aload_2
       182: ldc           #58                 // String
       184: invokevirtual #60                 // Method sendAcpHtml:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       187: goto          315
       190: invokestatic  #66                 // Method ext/mods/gameserver/taskmanager/AutoPotionTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AutoPotionTaskManager;
       193: aload_2
       194: invokevirtual #72                 // Method ext/mods/gameserver/taskmanager/AutoPotionTaskManager.add:(Lext/mods/gameserver/model/actor/Player;)V
       197: aload_2
       198: aload_2
       199: sipush        10189
       202: iconst_0
       203: anewarray     #2                  // class java/lang/Object
       206: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       209: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       212: goto          315
       215: invokestatic  #66                 // Method ext/mods/gameserver/taskmanager/AutoPotionTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AutoPotionTaskManager;
       218: aload_2
       219: invokevirtual #76                 // Method ext/mods/gameserver/taskmanager/AutoPotionTaskManager.remove:(Lext/mods/gameserver/model/actor/Player;)V
       222: aload_2
       223: aload_2
       224: sipush        10190
       227: iconst_0
       228: anewarray     #2                  // class java/lang/Object
       231: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       234: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       237: goto          315
       240: aload_1
       241: ldc           #79                 // String setCp
       243: invokevirtual #81                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       246: ifeq          266
       249: getstatic     #85                 // Field ext/mods/Config.AUTO_CP_ENABLED:Z
       252: ifeq          266
       255: aload_0
       256: aload_1
       257: aload_2
       258: ldc           #88                 // String Cp
       260: invokevirtual #90                 // Method setAutoPotionValue:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       263: goto          315
       266: aload_1
       267: ldc           #94                 // String setHp
       269: invokevirtual #81                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       272: ifeq          292
       275: getstatic     #96                 // Field ext/mods/Config.AUTO_HP_ENABLED:Z
       278: ifeq          292
       281: aload_0
       282: aload_1
       283: aload_2
       284: ldc           #99                 // String Hp
       286: invokevirtual #90                 // Method setAutoPotionValue:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       289: goto          315
       292: aload_1
       293: ldc           #101                // String setMp
       295: invokevirtual #81                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       298: ifeq          315
       301: getstatic     #103                // Field ext/mods/Config.AUTO_MP_ENABLED:Z
       304: ifeq          315
       307: aload_0
       308: aload_1
       309: aload_2
       310: ldc           #106                // String Mp
       312: invokevirtual #90                 // Method setAutoPotionValue:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       315: iconst_1
       316: ireturn
      LineNumberTable:
        line 41: 0
        line 43: 6
        line 44: 21
        line 47: 23
        line 49: 36
        line 50: 60
        line 53: 62
        line 56: 180
        line 57: 187
        line 60: 190
        line 61: 197
        line 62: 212
        line 65: 215
        line 66: 222
        line 67: 237
        line 70: 240
        line 71: 255
        line 72: 266
        line 73: 281
        line 74: 292
        line 75: 307
        line 78: 315
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     317     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Acp;
            0     317     1 command   Ljava/lang/String;
            0     317     2 player   Lext/mods/gameserver/model/actor/Player;
            0     317     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 13
        frame_type = 23 /* same */
        frame_type = 38 /* same */
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 9 /* same */
        frame_type = 24 /* same */
        frame_type = 24 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 249 /* chop */
          offset_delta = 22

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #186                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 140: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Acp;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        6
         2: anewarray     #44                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #48                 // String acp
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #79                 // String setCp
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #94                 // String setHp
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #101                // String setMp
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #54                 // String acpEnabled
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #56                 // String acpDisabled
        34: aastore
        35: putstatic     #186                // Field VOICED_COMMANDS:[Ljava/lang/String;
        38: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "Acp.java"
BootstrapMethods:
  0: #221 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #217 <font color=\"FF0000\">\u0001</font>
  1: #221 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #219 <font color=\"00FF00\">\u0001</font>
InnerClasses:
  public static final #232= #228 of #230; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
