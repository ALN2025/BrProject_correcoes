// Bytecode for: ext.mods.gameserver.model.actor.instance.ManorManagerNpc
// File: ext\mods\gameserver\model\actor\instance\ManorManagerNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/ManorManagerNpc.class
  Last modified 9 de jul de 2026; size 4497 bytes
  MD5 checksum 9655d7af6e6359849db1a7f58e7d42a0
  Compiled from "ManorManagerNpc.java"
public class ext.mods.gameserver.model.actor.instance.ManorManagerNpc extends ext.mods.gameserver.model.actor.instance.Merchant
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #76                         // ext/mods/gameserver/model/actor/instance/ManorManagerNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Merchant
  interfaces: 0, fields: 0, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Merchant
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Merchant
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            // manor_menu_select
    #8 = Utf8               manor_menu_select
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #16 = Class              #18           // ext/mods/gameserver/data/manager/CastleManorManager
   #17 = NameAndType        #19:#20       // getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #18 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
   #19 = Utf8               getInstance
   #20 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManorManager;
   #21 = Methodref          #16.#22       // ext/mods/gameserver/data/manager/CastleManorManager.isUnderMaintenance:()Z
   #22 = NameAndType        #23:#24       // isUnderMaintenance:()Z
   #23 = Utf8               isUnderMaintenance
   #24 = Utf8               ()Z
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #26 = Class              #28           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #27 = NameAndType        #29:#30       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #28 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #29 = Utf8               STATIC_PACKET
   #30 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #32 = Class              #34           // ext/mods/gameserver/model/actor/Player
   #33 = NameAndType        #35:#36       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #34 = Utf8               ext/mods/gameserver/model/actor/Player
   #35 = Utf8               sendPacket
   #36 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #37 = Fieldref           #38.#39       // ext/mods/gameserver/network/SystemMessageId.THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE:Lext/mods/gameserver/network/SystemMessageId;
   #38 = Class              #40           // ext/mods/gameserver/network/SystemMessageId
   #39 = NameAndType        #41:#42       // THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #41 = Utf8               THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE
   #42 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #43 = Methodref          #32.#44       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #44 = NameAndType        #35:#45       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #45 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #46 = Class              #47           // java/util/StringTokenizer
   #47 = Utf8               java/util/StringTokenizer
   #48 = String             #49           // &
   #49 = Utf8               &
   #50 = Methodref          #46.#51       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #51 = NameAndType        #5:#52        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #52 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #53 = Methodref          #46.#54       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #54 = NameAndType        #55:#56       // nextToken:()Ljava/lang/String;
   #55 = Utf8               nextToken
   #56 = Utf8               ()Ljava/lang/String;
   #57 = String             #58           // =
   #58 = Utf8               =
   #59 = Methodref          #10.#60       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #60 = NameAndType        #61:#62       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #61 = Utf8               split
   #62 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #63 = Methodref          #64.#65       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #64 = Class              #66           // java/lang/Integer
   #65 = NameAndType        #67:#68       // parseInt:(Ljava/lang/String;)I
   #66 = Utf8               java/lang/Integer
   #67 = Utf8               parseInt
   #68 = Utf8               (Ljava/lang/String;)I
   #69 = String             #70           // 1
   #70 = Utf8               1
   #71 = Methodref          #10.#72       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #72 = NameAndType        #73:#74       // equals:(Ljava/lang/Object;)Z
   #73 = Utf8               equals
   #74 = Utf8               (Ljava/lang/Object;)Z
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/actor/instance/ManorManagerNpc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #76 = Class              #78           // ext/mods/gameserver/model/actor/instance/ManorManagerNpc
   #77 = NameAndType        #79:#80       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #78 = Utf8               ext/mods/gameserver/model/actor/instance/ManorManagerNpc
   #79 = Utf8               getCastle
   #80 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #81 = Methodref          #82.#83       // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
   #82 = Class              #84           // ext/mods/gameserver/model/residence/castle/Castle
   #83 = NameAndType        #85:#86       // getId:()I
   #84 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #85 = Utf8               getId
   #86 = Utf8               ()I
   #87 = Fieldref           #38.#88       // ext/mods/gameserver/network/SystemMessageId.HERE_YOU_CAN_BUY_ONLY_SEEDS_OF_S1_MANOR:Lext/mods/gameserver/network/SystemMessageId;
   #88 = NameAndType        #89:#42       // HERE_YOU_CAN_BUY_ONLY_SEEDS_OF_S1_MANOR:Lext/mods/gameserver/network/SystemMessageId;
   #89 = Utf8               HERE_YOU_CAN_BUY_ONLY_SEEDS_OF_S1_MANOR
   #90 = Methodref          #91.#92       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #91 = Class              #93           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #92 = NameAndType        #94:#95       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #93 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #94 = Utf8               getSystemMessage
   #95 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = Methodref          #82.#97       // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
   #97 = NameAndType        #98:#56       // getName:()Ljava/lang/String;
   #98 = Utf8               getName
   #99 = Methodref          #91.#100      // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = NameAndType        #101:#102     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #101 = Utf8               addString
  #102 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #103 = Class              #104          // ext/mods/gameserver/network/serverpackets/BuyListSeed
  #104 = Utf8               ext/mods/gameserver/network/serverpackets/BuyListSeed
  #105 = Methodref          #32.#106      // ext/mods/gameserver/model/actor/Player.getAdena:()I
  #106 = NameAndType        #107:#86      // getAdena:()I
  #107 = Utf8               getAdena
  #108 = Methodref          #103.#109     // ext/mods/gameserver/network/serverpackets/BuyListSeed."<init>":(II)V
  #109 = NameAndType        #5:#110       // "<init>":(II)V
  #110 = Utf8               (II)V
  #111 = Class              #112          // ext/mods/gameserver/network/serverpackets/ExShowSellCropList
  #112 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowSellCropList
  #113 = Methodref          #32.#114      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #114 = NameAndType        #115:#116     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #115 = Utf8               getInventory
  #116 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #117 = Methodref          #111.#118     // ext/mods/gameserver/network/serverpackets/ExShowSellCropList."<init>":(Lext/mods/gameserver/model/itemcontainer/PcInventory;I)V
  #118 = NameAndType        #5:#119       // "<init>":(Lext/mods/gameserver/model/itemcontainer/PcInventory;I)V
  #119 = Utf8               (Lext/mods/gameserver/model/itemcontainer/PcInventory;I)V
  #120 = Class              #121          // ext/mods/gameserver/network/serverpackets/ExShowSeedInfo
  #121 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowSeedInfo
  #122 = Methodref          #120.#123     // ext/mods/gameserver/network/serverpackets/ExShowSeedInfo."<init>":(IZZ)V
  #123 = NameAndType        #5:#124       // "<init>":(IZZ)V
  #124 = Utf8               (IZZ)V
  #125 = Class              #126          // ext/mods/gameserver/network/serverpackets/ExShowCropInfo
  #126 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowCropInfo
  #127 = Methodref          #125.#123     // ext/mods/gameserver/network/serverpackets/ExShowCropInfo."<init>":(IZZ)V
  #128 = Class              #129          // ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo
  #129 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo
  #130 = Methodref          #128.#131     // ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo."<init>":(Z)V
  #131 = NameAndType        #5:#132       // "<init>":(Z)V
  #132 = Utf8               (Z)V
  #133 = Integer            300000
  #134 = Methodref          #76.#135      // ext/mods/gameserver/model/actor/instance/ManorManagerNpc.getNpcId:()I
  #135 = NameAndType        #136:#86      // getNpcId:()I
  #136 = Utf8               getNpcId
  #137 = Methodref          #76.#138      // ext/mods/gameserver/model/actor/instance/ManorManagerNpc.showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #138 = NameAndType        #139:#140     // showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #139 = Utf8               showBuyWindow
  #140 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #141 = Class              #142          // ext/mods/gameserver/network/serverpackets/ExShowProcureCropDetail
  #142 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowProcureCropDetail
  #143 = Methodref          #141.#144     // ext/mods/gameserver/network/serverpackets/ExShowProcureCropDetail."<init>":(I)V
  #144 = NameAndType        #5:#145       // "<init>":(I)V
  #145 = Utf8               (I)V
  #146 = Methodref          #2.#147       // ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #147 = NameAndType        #148:#149     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #148 = Utf8               onBypassFeedback
  #149 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #150 = String             #151          // html/manormanager/manager.htm
  #151 = Utf8               html/manormanager/manager.htm
  #152 = Fieldref           #153.#154     // ext/mods/Config.ALLOW_MANOR:Z
  #153 = Class              #155          // ext/mods/Config
  #154 = NameAndType        #156:#157     // ALLOW_MANOR:Z
  #155 = Utf8               ext/mods/Config
  #156 = Utf8               ALLOW_MANOR
  #157 = Utf8               Z
  #158 = String             #159          // html/npcdefault.htm
  #159 = Utf8               html/npcdefault.htm
  #160 = Methodref          #76.#161      // ext/mods/gameserver/model/actor/instance/ManorManagerNpc.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #161 = NameAndType        #162:#149     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #162 = Utf8               showChatWindow
  #163 = Methodref          #32.#164      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #164 = NameAndType        #165:#166     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #165 = Utf8               getClan
  #166 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #167 = Methodref          #82.#168      // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
  #168 = NameAndType        #169:#86      // getOwnerId:()I
  #169 = Utf8               getOwnerId
  #170 = Methodref          #32.#171      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #171 = NameAndType        #172:#86      // getClanId:()I
  #172 = Utf8               getClanId
  #173 = Methodref          #32.#174      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #174 = NameAndType        #175:#24      // isClanLeader:()Z
  #175 = Utf8               isClanLeader
  #176 = String             #177          // html/manormanager/manager-lord.htm
  #177 = Utf8               html/manormanager/manager-lord.htm
  #178 = Utf8               Code
  #179 = Utf8               LineNumberTable
  #180 = Utf8               LocalVariableTable
  #181 = Utf8               this
  #182 = Utf8               Lext/mods/gameserver/model/actor/instance/ManorManagerNpc;
  #183 = Utf8               objectId
  #184 = Utf8               I
  #185 = Utf8               template
  #186 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #187 = Utf8               st
  #188 = Utf8               Ljava/util/StringTokenizer;
  #189 = Utf8               ask
  #190 = Utf8               state
  #191 = Utf8               time
  #192 = Utf8               castleId
  #193 = Utf8               player
  #194 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #195 = Utf8               command
  #196 = Utf8               Ljava/lang/String;
  #197 = Utf8               StackMapTable
  #198 = Utf8               getHtmlPath
  #199 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #200 = Utf8               npcId
  #201 = Utf8               val
  #202 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #203 = Utf8               SourceFile
  #204 = Utf8               ManorManagerNpc.java
{
  public ext.mods.gameserver.model.actor.instance.ManorManagerNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 40: 0
        line 41: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/ManorManagerNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=3
         0: aload_2
         1: ldc           #7                  // String manor_menu_select
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          323
         9: invokestatic  #15                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
        12: invokevirtual #21                 // Method ext/mods/gameserver/data/manager/CastleManorManager.isUnderMaintenance:()Z
        15: ifeq          33
        18: aload_1
        19: getstatic     #25                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        22: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        25: aload_1
        26: getstatic     #37                 // Field ext/mods/gameserver/network/SystemMessageId.THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE:Lext/mods/gameserver/network/SystemMessageId;
        29: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        32: return
        33: new           #46                 // class java/util/StringTokenizer
        36: dup
        37: aload_2
        38: ldc           #48                 // String &
        40: invokespecial #50                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        43: astore_3
        44: aload_3
        45: invokevirtual #53                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        48: ldc           #57                 // String =
        50: invokevirtual #59                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        53: iconst_1
        54: aaload
        55: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        58: istore        4
        60: aload_3
        61: invokevirtual #53                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        64: ldc           #57                 // String =
        66: invokevirtual #59                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        69: iconst_1
        70: aaload
        71: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        74: istore        5
        76: aload_3
        77: invokevirtual #53                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        80: ldc           #57                 // String =
        82: invokevirtual #59                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        85: iconst_1
        86: aaload
        87: ldc           #69                 // String 1
        89: invokevirtual #71                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        92: istore        6
        94: iload         5
        96: ifge          109
        99: aload_0
       100: invokevirtual #75                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       103: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       106: goto          111
       109: iload         5
       111: istore        7
       113: iload         4
       115: tableswitch   { // 1 to 9

                       1: 164

                       2: 219

                       3: 239

                       4: 258

                       5: 277

                       6: 292

                       7: 320

                       8: 320

                       9: 307
                 default: 320
            }
       164: iload         7
       166: aload_0
       167: invokevirtual #75                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       170: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       173: if_icmpeq     199
       176: aload_1
       177: getstatic     #87                 // Field ext/mods/gameserver/network/SystemMessageId.HERE_YOU_CAN_BUY_ONLY_SEEDS_OF_S1_MANOR:Lext/mods/gameserver/network/SystemMessageId;
       180: invokestatic  #90                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       183: aload_0
       184: invokevirtual #75                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       187: invokevirtual #96                 // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
       190: invokevirtual #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       193: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       196: goto          320
       199: aload_1
       200: new           #103                // class ext/mods/gameserver/network/serverpackets/BuyListSeed
       203: dup
       204: aload_1
       205: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
       208: iload         7
       210: invokespecial #108                // Method ext/mods/gameserver/network/serverpackets/BuyListSeed."<init>":(II)V
       213: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       216: goto          320
       219: aload_1
       220: new           #111                // class ext/mods/gameserver/network/serverpackets/ExShowSellCropList
       223: dup
       224: aload_1
       225: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       228: iload         7
       230: invokespecial #117                // Method ext/mods/gameserver/network/serverpackets/ExShowSellCropList."<init>":(Lext/mods/gameserver/model/itemcontainer/PcInventory;I)V
       233: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       236: goto          320
       239: aload_1
       240: new           #120                // class ext/mods/gameserver/network/serverpackets/ExShowSeedInfo
       243: dup
       244: iload         7
       246: iload         6
       248: iconst_0
       249: invokespecial #122                // Method ext/mods/gameserver/network/serverpackets/ExShowSeedInfo."<init>":(IZZ)V
       252: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       255: goto          320
       258: aload_1
       259: new           #125                // class ext/mods/gameserver/network/serverpackets/ExShowCropInfo
       262: dup
       263: iload         7
       265: iload         6
       267: iconst_0
       268: invokespecial #127                // Method ext/mods/gameserver/network/serverpackets/ExShowCropInfo."<init>":(IZZ)V
       271: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       274: goto          320
       277: aload_1
       278: new           #128                // class ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo
       281: dup
       282: iconst_0
       283: invokespecial #130                // Method ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo."<init>":(Z)V
       286: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       289: goto          320
       292: aload_0
       293: aload_1
       294: ldc           #133                // int 300000
       296: aload_0
       297: invokevirtual #134                // Method getNpcId:()I
       300: iadd
       301: invokevirtual #137                // Method showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
       304: goto          320
       307: aload_1
       308: new           #141                // class ext/mods/gameserver/network/serverpackets/ExShowProcureCropDetail
       311: dup
       312: iload         5
       314: invokespecial #143                // Method ext/mods/gameserver/network/serverpackets/ExShowProcureCropDetail."<init>":(I)V
       317: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       320: goto          329
       323: aload_0
       324: aload_1
       325: aload_2
       326: invokespecial #146                // Method ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       329: return
      LineNumberTable:
        line 46: 0
        line 48: 9
        line 50: 18
        line 51: 25
        line 52: 32
        line 55: 33
        line 57: 44
        line 58: 60
        line 59: 76
        line 61: 94
        line 63: 113
        line 66: 164
        line 67: 176
        line 69: 199
        line 70: 216
        line 73: 219
        line 74: 236
        line 77: 239
        line 78: 255
        line 81: 258
        line 82: 274
        line 85: 277
        line 86: 289
        line 89: 292
        line 90: 304
        line 93: 307
        line 96: 320
        line 98: 323
        line 99: 329
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44     276     3    st   Ljava/util/StringTokenizer;
           60     260     4   ask   I
           76     244     5 state   I
           94     226     6  time   Z
          113     207     7 castleId   I
            0     330     0  this   Lext/mods/gameserver/model/actor/instance/ManorManagerNpc;
            0     330     1 player   Lext/mods/gameserver/model/actor/Player;
            0     330     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 14
        frame_type = 33 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/model/actor/instance/ManorManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, int, int, int ]
          stack = []
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ int ]
        frame_type = 34 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/instance/ManorManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 5 /* same */

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: ldc           #150                // String html/manormanager/manager.htm
         2: areturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/actor/instance/ManorManagerNpc;
            0       3     1 player   Lext/mods/gameserver/model/actor/Player;
            0       3     2 npcId   I
            0       3     3   val   I

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: getstatic     #152                // Field ext/mods/Config.ALLOW_MANOR:Z
         3: ifne          14
         6: aload_0
         7: aload_1
         8: ldc           #158                // String html/npcdefault.htm
        10: invokevirtual #160                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        13: return
        14: aload_0
        15: invokevirtual #75                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: ifnull        59
        21: aload_1
        22: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        25: ifnull        59
        28: aload_0
        29: invokevirtual #75                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        32: invokevirtual #167                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        35: aload_1
        36: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        39: if_icmpne     59
        42: aload_1
        43: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        46: ifeq          59
        49: aload_0
        50: aload_1
        51: ldc           #176                // String html/manormanager/manager-lord.htm
        53: invokevirtual #160                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        56: goto          66
        59: aload_0
        60: aload_1
        61: ldc           #150                // String html/manormanager/manager.htm
        63: invokevirtual #160                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        66: return
      LineNumberTable:
        line 110: 0
        line 112: 6
        line 113: 13
        line 116: 14
        line 117: 49
        line 119: 59
        line 120: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/actor/instance/ManorManagerNpc;
            0      67     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 44 /* same */
        frame_type = 6 /* same */
}
SourceFile: "ManorManagerNpc.java"
