// Bytecode for: ext.mods.gameserver.model.actor.instance.DungeonGatekeeper
// File: ext\mods\gameserver\model\actor\instance\DungeonGatekeeper.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/DungeonGatekeeper.class
  Last modified 9 de jul de 2026; size 4642 bytes
  MD5 checksum b0321361baecca457318460999a4e24e
  Compiled from "DungeonGatekeeper.java"
public class ext.mods.gameserver.model.actor.instance.DungeonGatekeeper extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #94                         // ext/mods/gameserver/model/actor/instance/DungeonGatekeeper
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
    #8 = Class              #10           // ext/mods/gameserver/network/serverpackets/ActionFailed
    #9 = NameAndType        #11:#12       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #10 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #11 = Utf8               STATIC_PACKET
   #12 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Player
   #15 = NameAndType        #17:#18       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #16 = Utf8               ext/mods/gameserver/model/actor/Player
   #17 = Utf8               sendPacket
   #18 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #19 = Methodref          #20.#21       // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #20 = Class              #22           // ext/mods/gameserver/data/manager/SevenSignsManager
   #21 = NameAndType        #23:#24       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #22 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #23 = Utf8               getInstance
   #24 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #25 = Methodref          #14.#26       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #26 = NameAndType        #27:#28       // getObjectId:()I
   #27 = Utf8               getObjectId
   #28 = Utf8               ()I
   #29 = Methodref          #20.#30       // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
   #30 = NameAndType        #31:#32       // getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
   #31 = Utf8               getPlayerCabal
   #32 = Utf8               (I)Lext/mods/gameserver/enums/CabalType;
   #33 = Methodref          #20.#34       // ext/mods/gameserver/data/manager/SevenSignsManager.allowCatacombsInAnyPeriod:()Z
   #34 = NameAndType        #35:#36       // allowCatacombsInAnyPeriod:()Z
   #35 = Utf8               allowCatacombsInAnyPeriod
   #36 = Utf8               ()Z
   #37 = Class              #38           // ext/mods/gameserver/handler/bypasshandlers/InstantTeleport
   #38 = Utf8               ext/mods/gameserver/handler/bypasshandlers/InstantTeleport
   #39 = Methodref          #37.#40       // ext/mods/gameserver/handler/bypasshandlers/InstantTeleport."<init>":()V
   #40 = NameAndType        #5:#41        // "<init>":()V
   #41 = Utf8               ()V
   #42 = String             #43           // necro
   #43 = Utf8               necro
   #44 = Methodref          #45.#46       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #45 = Class              #47           // java/lang/String
   #46 = NameAndType        #48:#49       // startsWith:(Ljava/lang/String;)Z
   #47 = Utf8               java/lang/String
   #48 = Utf8               startsWith
   #49 = Utf8               (Ljava/lang/String;)Z
   #50 = Methodref          #20.#51       // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
   #51 = NameAndType        #52:#36       // isSealValidationPeriod:()Z
   #52 = Utf8               isSealValidationPeriod
   #53 = Methodref          #20.#54       // ext/mods/gameserver/data/manager/SevenSignsManager.getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
   #54 = NameAndType        #55:#56       // getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
   #55 = Utf8               getWinningCabal
   #56 = Utf8               ()Lext/mods/gameserver/enums/CabalType;
   #57 = Fieldref           #58.#59       // ext/mods/gameserver/enums/SealType.AVARICE:Lext/mods/gameserver/enums/SealType;
   #58 = Class              #60           // ext/mods/gameserver/enums/SealType
   #59 = NameAndType        #61:#62       // AVARICE:Lext/mods/gameserver/enums/SealType;
   #60 = Utf8               ext/mods/gameserver/enums/SealType
   #61 = Utf8               AVARICE
   #62 = Utf8               Lext/mods/gameserver/enums/SealType;
   #63 = Methodref          #20.#64       // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #64 = NameAndType        #65:#66       // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #65 = Utf8               getSealOwner
   #66 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #67 = Fieldref           #68.#69       // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
   #68 = Class              #70           // ext/mods/gameserver/enums/CabalType
   #69 = NameAndType        #71:#72       // DAWN:Lext/mods/gameserver/enums/CabalType;
   #70 = Utf8               ext/mods/gameserver/enums/CabalType
   #71 = Utf8               DAWN
   #72 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #73 = Fieldref           #74.#75       // ext/mods/gameserver/network/SystemMessageId.CAN_BE_USED_BY_DAWN:Lext/mods/gameserver/network/SystemMessageId;
   #74 = Class              #76           // ext/mods/gameserver/network/SystemMessageId
   #75 = NameAndType        #77:#78       // CAN_BE_USED_BY_DAWN:Lext/mods/gameserver/network/SystemMessageId;
   #76 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #77 = Utf8               CAN_BE_USED_BY_DAWN
   #78 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #79 = Methodref          #14.#80       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #80 = NameAndType        #17:#81       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #81 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #82 = Fieldref           #68.#83       // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
   #83 = NameAndType        #84:#72       // DUSK:Lext/mods/gameserver/enums/CabalType;
   #84 = Utf8               DUSK
   #85 = Fieldref           #74.#86       // ext/mods/gameserver/network/SystemMessageId.CAN_BE_USED_BY_DUSK:Lext/mods/gameserver/network/SystemMessageId;
   #86 = NameAndType        #87:#78       // CAN_BE_USED_BY_DUSK:Lext/mods/gameserver/network/SystemMessageId;
   #87 = Utf8               CAN_BE_USED_BY_DUSK
   #88 = Fieldref           #68.#89       // ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
   #89 = NameAndType        #90:#72       // NORMAL:Lext/mods/gameserver/enums/CabalType;
   #90 = Utf8               NORMAL
   #91 = Class              #92           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #92 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #93 = Methodref          #94.#26       // ext/mods/gameserver/model/actor/instance/DungeonGatekeeper.getObjectId:()I
   #94 = Class              #95           // ext/mods/gameserver/model/actor/instance/DungeonGatekeeper
   #95 = Utf8               ext/mods/gameserver/model/actor/instance/DungeonGatekeeper
   #96 = Methodref          #91.#97       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #97 = NameAndType        #5:#98        // "<init>":(I)V
   #98 = Utf8               (I)V
   #99 = Methodref          #14.#100      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #100 = NameAndType        #101:#102     // getLocale:()Ljava/util/Locale;
  #101 = Utf8               getLocale
  #102 = Utf8               ()Ljava/util/Locale;
  #103 = String             #104          // html/seven_signs/necro_no.htm
  #104 = Utf8               html/seven_signs/necro_no.htm
  #105 = Methodref          #91.#106      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #106 = NameAndType        #107:#108     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #107 = Utf8               setFile
  #108 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #109 = Methodref          #37.#110      // ext/mods/gameserver/handler/bypasshandlers/InstantTeleport.instantTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
  #110 = NameAndType        #111:#112     // instantTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
  #111 = Utf8               instantTeleport
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
  #113 = Methodref          #14.#114      // ext/mods/gameserver/model/actor/Player.setIsIn7sDungeon:(Z)V
  #114 = NameAndType        #115:#116     // setIsIn7sDungeon:(Z)V
  #115 = Utf8               setIsIn7sDungeon
  #116 = Utf8               (Z)V
  #117 = String             #118          // cata
  #118 = Utf8               cata
  #119 = Fieldref           #58.#120      // ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
  #120 = NameAndType        #121:#62      // GNOSIS:Lext/mods/gameserver/enums/SealType;
  #121 = Utf8               GNOSIS
  #122 = String             #123          // html/seven_signs/cata_no.htm
  #123 = Utf8               html/seven_signs/cata_no.htm
  #124 = String             #125          // exit
  #125 = Utf8               exit
  #126 = Methodref          #2.#127       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #127 = NameAndType        #128:#129     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #128 = Utf8               onBypassFeedback
  #129 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #130 = String             #131          //
  #131 = Utf8
  #132 = InvokeDynamic      #0:#133       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #133 = NameAndType        #134:#135     // makeConcatWithConstants:(I)Ljava/lang/String;
  #134 = Utf8               makeConcatWithConstants
  #135 = Utf8               (I)Ljava/lang/String;
  #136 = InvokeDynamic      #1:#137       // #1:makeConcatWithConstants:(II)Ljava/lang/String;
  #137 = NameAndType        #134:#138     // makeConcatWithConstants:(II)Ljava/lang/String;
  #138 = Utf8               (II)Ljava/lang/String;
  #139 = InvokeDynamic      #2:#140       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #140 = NameAndType        #134:#141     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #141 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #142 = Utf8               Code
  #143 = Utf8               LineNumberTable
  #144 = Utf8               LocalVariableTable
  #145 = Utf8               this
  #146 = Utf8               Lext/mods/gameserver/model/actor/instance/DungeonGatekeeper;
  #147 = Utf8               objectId
  #148 = Utf8               I
  #149 = Utf8               template
  #150 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #151 = Utf8               winningCabal
  #152 = Utf8               sealAvariceOwner
  #153 = Utf8               html
  #154 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #155 = Utf8               canPort
  #156 = Utf8               Z
  #157 = Utf8               sealGnosisOwner
  #158 = Utf8               player
  #159 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #160 = Utf8               command
  #161 = Utf8               Ljava/lang/String;
  #162 = Utf8               playerCabal
  #163 = Utf8               teleport
  #164 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/InstantTeleport;
  #165 = Utf8               StackMapTable
  #166 = Utf8               getHtmlPath
  #167 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #168 = Utf8               npcId
  #169 = Utf8               val
  #170 = Utf8               filename
  #171 = Utf8               SourceFile
  #172 = Utf8               DungeonGatekeeper.java
  #173 = Utf8               BootstrapMethods
  #174 = String             #175          // \u0001
  #175 = Utf8               \u0001
  #176 = String             #177          // \u0001-\u0001
  #177 = Utf8               \u0001-\u0001
  #178 = String             #179          // html/gatekeeper/\u0001.htm
  #179 = Utf8               html/gatekeeper/\u0001.htm
  #180 = MethodHandle       6:#181        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #181 = Methodref          #182.#183     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #182 = Class              #184          // java/lang/invoke/StringConcatFactory
  #183 = NameAndType        #134:#185     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #184 = Utf8               java/lang/invoke/StringConcatFactory
  #185 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #186 = Utf8               InnerClasses
  #187 = Class              #188          // java/lang/invoke/MethodHandles$Lookup
  #188 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #189 = Class              #190          // java/lang/invoke/MethodHandles
  #190 = Utf8               java/lang/invoke/MethodHandles
  #191 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.DungeonGatekeeper(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 34: 0
        line 35: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/DungeonGatekeeper;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=3
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
         4: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         7: invokestatic  #19                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        10: aload_1
        11: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        14: invokevirtual #29                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
        17: astore_3
        18: invokestatic  #19                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        21: invokevirtual #33                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.allowCatacombsInAnyPeriod:()Z
        24: istore        4
        26: new           #37                 // class ext/mods/gameserver/handler/bypasshandlers/InstantTeleport
        29: dup
        30: invokespecial #39                 // Method ext/mods/gameserver/handler/bypasshandlers/InstantTeleport."<init>":()V
        33: astore        5
        35: aload_2
        36: ldc           #42                 // String necro
        38: invokevirtual #44                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        41: ifeq          250
        44: iconst_1
        45: istore        6
        47: iload         4
        49: ifne          196
        52: invokestatic  #19                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        55: invokevirtual #50                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
        58: ifeq          186
        61: invokestatic  #19                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        64: invokevirtual #53                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
        67: astore        7
        69: invokestatic  #19                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        72: getstatic     #57                 // Field ext/mods/gameserver/enums/SealType.AVARICE:Lext/mods/gameserver/enums/SealType;
        75: invokevirtual #63                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
        78: astore        8
        80: aload         7
        82: getstatic     #67                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        85: if_acmpne     116
        88: aload_3
        89: getstatic     #67                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        92: if_acmpne     103
        95: aload         8
        97: getstatic     #67                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       100: if_acmpeq     116
       103: aload_1
       104: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.CAN_BE_USED_BY_DAWN:Lext/mods/gameserver/network/SystemMessageId;
       107: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       110: iconst_0
       111: istore        6
       113: goto          183
       116: aload         7
       118: getstatic     #82                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       121: if_acmpne     152
       124: aload_3
       125: getstatic     #82                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       128: if_acmpne     139
       131: aload         8
       133: getstatic     #82                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       136: if_acmpeq     152
       139: aload_1
       140: getstatic     #85                 // Field ext/mods/gameserver/network/SystemMessageId.CAN_BE_USED_BY_DUSK:Lext/mods/gameserver/network/SystemMessageId;
       143: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       146: iconst_0
       147: istore        6
       149: goto          183
       152: aload         7
       154: getstatic     #88                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       157: if_acmpne     173
       160: aload_3
       161: getstatic     #88                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       164: if_acmpeq     173
       167: iconst_1
       168: istore        6
       170: goto          183
       173: aload_3
       174: getstatic     #88                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       177: if_acmpne     183
       180: iconst_0
       181: istore        6
       183: goto          196
       186: aload_3
       187: getstatic     #88                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       190: if_acmpne     196
       193: iconst_0
       194: istore        6
       196: iload         6
       198: ifne          234
       201: new           #91                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       204: dup
       205: aload_0
       206: invokevirtual #93                 // Method getObjectId:()I
       209: invokespecial #96                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       212: astore        7
       214: aload         7
       216: aload_1
       217: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       220: ldc           #103                // String html/seven_signs/necro_no.htm
       222: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       225: aload_1
       226: aload         7
       228: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       231: goto          247
       234: aload         5
       236: aload_1
       237: aload_0
       238: iconst_0
       239: invokevirtual #109                // Method ext/mods/gameserver/handler/bypasshandlers/InstantTeleport.instantTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
       242: aload_1
       243: iconst_1
       244: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.setIsIn7sDungeon:(Z)V
       247: goto          496
       250: aload_2
       251: ldc           #117                // String cata
       253: invokevirtual #44                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       256: ifeq          465
       259: iconst_1
       260: istore        6
       262: iload         4
       264: ifne          411
       267: invokestatic  #19                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       270: invokevirtual #50                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       273: ifeq          401
       276: invokestatic  #19                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       279: invokevirtual #53                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
       282: astore        7
       284: invokestatic  #19                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       287: getstatic     #119                // Field ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
       290: invokevirtual #63                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       293: astore        8
       295: aload         7
       297: getstatic     #67                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       300: if_acmpne     331
       303: aload_3
       304: getstatic     #67                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       307: if_acmpne     318
       310: aload         8
       312: getstatic     #67                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       315: if_acmpeq     331
       318: aload_1
       319: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.CAN_BE_USED_BY_DAWN:Lext/mods/gameserver/network/SystemMessageId;
       322: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       325: iconst_0
       326: istore        6
       328: goto          398
       331: aload         7
       333: getstatic     #82                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       336: if_acmpne     367
       339: aload_3
       340: getstatic     #82                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       343: if_acmpne     354
       346: aload         8
       348: getstatic     #82                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       351: if_acmpeq     367
       354: aload_1
       355: getstatic     #85                 // Field ext/mods/gameserver/network/SystemMessageId.CAN_BE_USED_BY_DUSK:Lext/mods/gameserver/network/SystemMessageId;
       358: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       361: iconst_0
       362: istore        6
       364: goto          398
       367: aload         7
       369: getstatic     #88                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       372: if_acmpne     388
       375: aload_3
       376: getstatic     #88                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       379: if_acmpeq     388
       382: iconst_1
       383: istore        6
       385: goto          398
       388: aload_3
       389: getstatic     #88                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       392: if_acmpne     398
       395: iconst_0
       396: istore        6
       398: goto          411
       401: aload_3
       402: getstatic     #88                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       405: if_acmpne     411
       408: iconst_0
       409: istore        6
       411: iload         6
       413: ifne          449
       416: new           #91                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       419: dup
       420: aload_0
       421: invokevirtual #93                 // Method getObjectId:()I
       424: invokespecial #96                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       427: astore        7
       429: aload         7
       431: aload_1
       432: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       435: ldc           #122                // String html/seven_signs/cata_no.htm
       437: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       440: aload_1
       441: aload         7
       443: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       446: goto          462
       449: aload         5
       451: aload_1
       452: aload_0
       453: iconst_0
       454: invokevirtual #109                // Method ext/mods/gameserver/handler/bypasshandlers/InstantTeleport.instantTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
       457: aload_1
       458: iconst_1
       459: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.setIsIn7sDungeon:(Z)V
       462: goto          496
       465: aload_2
       466: ldc           #124                // String exit
       468: invokevirtual #44                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       471: ifeq          490
       474: aload         5
       476: aload_1
       477: aload_0
       478: iconst_0
       479: invokevirtual #109                // Method ext/mods/gameserver/handler/bypasshandlers/InstantTeleport.instantTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
       482: aload_1
       483: iconst_0
       484: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.setIsIn7sDungeon:(Z)V
       487: goto          496
       490: aload_0
       491: aload_1
       492: aload_2
       493: invokespecial #126                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       496: return
      LineNumberTable:
        line 40: 0
        line 42: 7
        line 43: 18
        line 45: 26
        line 47: 35
        line 49: 44
        line 50: 47
        line 52: 52
        line 54: 61
        line 55: 69
        line 57: 80
        line 59: 103
        line 60: 110
        line 62: 116
        line 64: 139
        line 65: 146
        line 67: 152
        line 68: 167
        line 69: 173
        line 70: 180
        line 71: 183
        line 74: 186
        line 75: 193
        line 79: 196
        line 81: 201
        line 82: 214
        line 83: 225
        line 84: 231
        line 87: 234
        line 88: 242
        line 90: 247
        line 91: 250
        line 93: 259
        line 94: 262
        line 96: 267
        line 98: 276
        line 99: 284
        line 101: 295
        line 103: 318
        line 104: 325
        line 106: 331
        line 108: 354
        line 109: 361
        line 111: 367
        line 112: 382
        line 113: 388
        line 114: 395
        line 115: 398
        line 118: 401
        line 119: 408
        line 123: 411
        line 125: 416
        line 126: 429
        line 127: 440
        line 128: 446
        line 131: 449
        line 132: 457
        line 134: 462
        line 135: 465
        line 137: 474
        line 138: 482
        line 141: 490
        line 142: 496
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           69     114     7 winningCabal   Lext/mods/gameserver/enums/CabalType;
           80     103     8 sealAvariceOwner   Lext/mods/gameserver/enums/CabalType;
          214      17     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           47     200     6 canPort   Z
          284     114     7 winningCabal   Lext/mods/gameserver/enums/CabalType;
          295     103     8 sealGnosisOwner   Lext/mods/gameserver/enums/CabalType;
          429      17     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          262     200     6 canPort   Z
            0     497     0  this   Lext/mods/gameserver/model/actor/instance/DungeonGatekeeper;
            0     497     1 player   Lext/mods/gameserver/model/actor/Player;
            0     497     2 command   Ljava/lang/String;
           18     479     3 playerCabal   Lext/mods/gameserver/enums/CabalType;
           26     471     4 allowCatacombsInAnyPeriod   Z
           35     462     5 teleport   Lext/mods/gameserver/handler/bypasshandlers/InstantTeleport;
      StackMapTable: number_of_entries = 24
        frame_type = 255 /* full_frame */
          offset_delta = 103
          locals = [ class ext/mods/gameserver/model/actor/instance/DungeonGatekeeper, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/CabalType, int, class ext/mods/gameserver/handler/bypasshandlers/InstantTeleport, int, class ext/mods/gameserver/enums/CabalType, class ext/mods/gameserver/enums/CabalType ]
          stack = []
        frame_type = 12 /* same */
        frame_type = 22 /* same */
        frame_type = 12 /* same */
        frame_type = 20 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 2 /* same */
        frame_type = 9 /* same */
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 67
          locals = [ int, class ext/mods/gameserver/enums/CabalType, class ext/mods/gameserver/enums/CabalType ]
        frame_type = 12 /* same */
        frame_type = 22 /* same */
        frame_type = 12 /* same */
        frame_type = 20 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 2 /* same */
        frame_type = 9 /* same */
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 2 /* same */
        frame_type = 24 /* same */
        frame_type = 5 /* same */

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #130                // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #132,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #136,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #139,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 147: 0
        line 148: 4
        line 149: 8
        line 151: 19
        line 153: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/DungeonGatekeeper;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */
}
SourceFile: "DungeonGatekeeper.java"
BootstrapMethods:
  0: #180 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #174 \u0001
  1: #180 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #176 \u0001-\u0001
  2: #180 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #178 html/gatekeeper/\u0001.htm
InnerClasses:
  public static final #191= #187 of #189; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
