// Bytecode for: ext.mods.gameserver.handler.itemhandlers.ItemPremium
// File: ext\mods\gameserver\handler\itemhandlers\ItemPremium.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/ItemPremium.class
  Last modified 9 de jul de 2026; size 4198 bytes
  MD5 checksum 5d1745e7a88c1908b0ab580cc9223b44
  Compiled from "ItemPremium.java"
public class ext.mods.gameserver.handler.itemhandlers.ItemPremium implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #141                        // ext/mods/gameserver/handler/itemhandlers/ItemPremium
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Fieldref           #10.#11       // ext/mods/Config.USE_PREMIUM_SERVICE:Z
   #10 = Class              #12           // ext/mods/Config
   #11 = NameAndType        #13:#14       // USE_PREMIUM_SERVICE:Z
   #12 = Utf8               ext/mods/Config
   #13 = Utf8               USE_PREMIUM_SERVICE
   #14 = Utf8               Z
   #15 = Methodref          #7.#16        // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #16 = NameAndType        #17:#18       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #17 = Utf8               getSysString
   #18 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #19 = Methodref          #7.#20        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #20 = NameAndType        #21:#22       // sendMessage:(Ljava/lang/String;)V
   #21 = Utf8               sendMessage
   #22 = Utf8               (Ljava/lang/String;)V
   #23 = Methodref          #7.#24        // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #24 = NameAndType        #25:#26       // isInOlympiadMode:()Z
   #25 = Utf8               isInOlympiadMode
   #26 = Utf8               ()Z
   #27 = Fieldref           #28.#29       // ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
   #28 = Class              #30           // ext/mods/gameserver/network/SystemMessageId
   #29 = NameAndType        #31:#32       // THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
   #30 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #31 = Utf8               THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT
   #32 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #33 = Methodref          #7.#34        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #34 = NameAndType        #35:#36       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #35 = Utf8               sendPacket
   #36 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #37 = Methodref          #38.#39       // ext/mods/gameserver/data/manager/ItemPremiumManager.getInstance:()Lext/mods/gameserver/data/manager/ItemPremiumManager;
   #38 = Class              #40           // ext/mods/gameserver/data/manager/ItemPremiumManager
   #39 = NameAndType        #41:#42       // getInstance:()Lext/mods/gameserver/data/manager/ItemPremiumManager;
   #40 = Utf8               ext/mods/gameserver/data/manager/ItemPremiumManager
   #41 = Utf8               getInstance
   #42 = Utf8               ()Lext/mods/gameserver/data/manager/ItemPremiumManager;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #44 = Class              #46           // ext/mods/gameserver/model/item/instance/ItemInstance
   #45 = NameAndType        #47:#48       // getItemId:()I
   #46 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #47 = Utf8               getItemId
   #48 = Utf8               ()I
   #49 = Methodref          #38.#50       // ext/mods/gameserver/data/manager/ItemPremiumManager.isConfigured:(I)Z
   #50 = NameAndType        #51:#52       // isConfigured:(I)Z
   #51 = Utf8               isConfigured
   #52 = Utf8               (I)Z
   #53 = String             #54           // This item is not configured for premium.
   #54 = Utf8               This item is not configured for premium.
   #55 = Methodref          #38.#56       // ext/mods/gameserver/data/manager/ItemPremiumManager.getConfig:(I)Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
   #56 = NameAndType        #57:#58       // getConfig:(I)Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
   #57 = Utf8               getConfig
   #58 = Utf8               (I)Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
   #59 = Methodref          #60.#61       // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig.toMilliseconds:()J
   #60 = Class              #62           // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
   #61 = NameAndType        #63:#64       // toMilliseconds:()J
   #62 = Utf8               ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
   #63 = Utf8               toMilliseconds
   #64 = Utf8               ()J
   #65 = String             #66           // Invalid premium configuration for this item.
   #66 = Utf8               Invalid premium configuration for this item.
   #67 = Methodref          #7.#68        // ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
   #68 = NameAndType        #69:#64       // getPremServiceData:()J
   #69 = Utf8               getPremServiceData
   #70 = Methodref          #71.#72       // java/lang/System.currentTimeMillis:()J
   #71 = Class              #73           // java/lang/System
   #72 = NameAndType        #74:#64       // currentTimeMillis:()J
   #73 = Utf8               java/lang/System
   #74 = Utf8               currentTimeMillis
   #75 = Methodref          #7.#76        // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
   #76 = NameAndType        #77:#78       // getAccountName:()Ljava/lang/String;
   #77 = Utf8               getAccountName
   #78 = Utf8               ()Ljava/lang/String;
   #79 = Methodref          #80.#81       // ext/mods/gameserver/custom/data/DonateData.updateDatabasePremium:(JLjava/lang/String;)V
   #80 = Class              #82           // ext/mods/gameserver/custom/data/DonateData
   #81 = NameAndType        #83:#84       // updateDatabasePremium:(JLjava/lang/String;)V
   #82 = Utf8               ext/mods/gameserver/custom/data/DonateData
   #83 = Utf8               updateDatabasePremium
   #84 = Utf8               (JLjava/lang/String;)V
   #85 = Methodref          #7.#86        // ext/mods/gameserver/model/actor/Player.setPremiumService:(I)V
   #86 = NameAndType        #87:#88       // setPremiumService:(I)V
   #87 = Utf8               setPremiumService
   #88 = Utf8               (I)V
   #89 = Methodref          #90.#91       // ext/mods/gameserver/taskmanager/PremiumTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
   #90 = Class              #92           // ext/mods/gameserver/taskmanager/PremiumTaskManager
   #91 = NameAndType        #41:#93       // getInstance:()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
   #92 = Utf8               ext/mods/gameserver/taskmanager/PremiumTaskManager
   #93 = Utf8               ()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
   #94 = Methodref          #90.#95       // ext/mods/gameserver/taskmanager/PremiumTaskManager.add:(Lext/mods/gameserver/model/actor/Player;)V
   #95 = NameAndType        #96:#97       // add:(Lext/mods/gameserver/model/actor/Player;)V
   #96 = Utf8               add
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #98 = Methodref          #7.#99        // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
   #99 = NameAndType        #100:#101     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
  #100 = Utf8               destroyItem
  #101 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
  #102 = Class              #103          // java/text/SimpleDateFormat
  #103 = Utf8               java/text/SimpleDateFormat
  #104 = String             #105          // dd/MM/yyyy HH:mm
  #105 = Utf8               dd/MM/yyyy HH:mm
  #106 = Methodref          #102.#107     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #107 = NameAndType        #5:#22        // "<init>":(Ljava/lang/String;)V
  #108 = Methodref          #109.#110     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #109 = Class              #111          // java/lang/Long
  #110 = NameAndType        #112:#113     // valueOf:(J)Ljava/lang/Long;
  #111 = Utf8               java/lang/Long
  #112 = Utf8               valueOf
  #113 = Utf8               (J)Ljava/lang/Long;
  #114 = Methodref          #102.#115     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #115 = NameAndType        #116:#117     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #116 = Utf8               format
  #117 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #118 = Fieldref           #28.#119      // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
  #119 = NameAndType        #120:#32      // S1:Lext/mods/gameserver/network/SystemMessageId;
  #120 = Utf8               S1
  #121 = Methodref          #122.#123     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #122 = Class              #124          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #123 = NameAndType        #125:#126     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #124 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #125 = Utf8               getSystemMessage
  #126 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #127 = InvokeDynamic      #0:#128       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #128 = NameAndType        #129:#130     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #129 = Utf8               makeConcatWithConstants
  #130 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #131 = Methodref          #122.#132     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #132 = NameAndType        #133:#134     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #133 = Utf8               addString
  #134 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #135 = Methodref          #7.#136       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #136 = NameAndType        #35:#137      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #137 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #138 = Methodref          #7.#139       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #139 = NameAndType        #140:#6       // broadcastUserInfo:()V
  #140 = Utf8               broadcastUserInfo
  #141 = Class              #142          // ext/mods/gameserver/handler/itemhandlers/ItemPremium
  #142 = Utf8               ext/mods/gameserver/handler/itemhandlers/ItemPremium
  #143 = Class              #144          // ext/mods/gameserver/handler/IItemHandler
  #144 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #145 = Utf8               Code
  #146 = Utf8               LineNumberTable
  #147 = Utf8               LocalVariableTable
  #148 = Utf8               this
  #149 = Utf8               Lext/mods/gameserver/handler/itemhandlers/ItemPremium;
  #150 = Utf8               useItem
  #151 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #152 = Utf8               player
  #153 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #154 = Utf8               playable
  #155 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #156 = Utf8               item
  #157 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #158 = Utf8               forceUse
  #159 = Utf8               manager
  #160 = Utf8               Lext/mods/gameserver/data/manager/ItemPremiumManager;
  #161 = Utf8               config
  #162 = Utf8               Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
  #163 = Utf8               addMs
  #164 = Utf8               J
  #165 = Utf8               currentEnd
  #166 = Utf8               now
  #167 = Utf8               baseTime
  #168 = Utf8               newEndTime
  #169 = Utf8               expiresAt
  #170 = Utf8               Ljava/lang/String;
  #171 = Utf8               StackMapTable
  #172 = Utf8               SourceFile
  #173 = Utf8               ItemPremium.java
  #174 = Utf8               BootstrapMethods
  #175 = String             #176          // Premium VIP adicionado! Expira em: \u0001
  #176 = Utf8               Premium VIP adicionado! Expira em: \u0001
  #177 = MethodHandle       6:#178        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #178 = Methodref          #179.#180     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #179 = Class              #181          // java/lang/invoke/StringConcatFactory
  #180 = NameAndType        #129:#182     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #181 = Utf8               java/lang/invoke/StringConcatFactory
  #182 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #183 = Utf8               InnerClasses
  #184 = Utf8               PremiumConfig
  #185 = Class              #186          // java/lang/invoke/MethodHandles$Lookup
  #186 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #187 = Class              #188          // java/lang/invoke/MethodHandles
  #188 = Utf8               java/lang/invoke/MethodHandles
  #189 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.itemhandlers.ItemPremium();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemPremium;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=18, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: getstatic     #9                  // Field ext/mods/Config.USE_PREMIUM_SERVICE:Z
        20: ifne          41
        23: aload         4
        25: aload         4
        27: sipush        10200
        30: iconst_0
        31: anewarray     #2                  // class java/lang/Object
        34: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        37: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        40: return
        41: aload         4
        43: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        46: ifeq          58
        49: aload         4
        51: getstatic     #27                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
        54: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        57: return
        58: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/ItemPremiumManager.getInstance:()Lext/mods/gameserver/data/manager/ItemPremiumManager;
        61: astore        5
        63: aload         5
        65: aload_2
        66: invokevirtual #43                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        69: invokevirtual #49                 // Method ext/mods/gameserver/data/manager/ItemPremiumManager.isConfigured:(I)Z
        72: ifne          83
        75: aload         4
        77: ldc           #53                 // String This item is not configured for premium.
        79: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        82: return
        83: aload         5
        85: aload_2
        86: invokevirtual #43                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        89: invokevirtual #55                 // Method ext/mods/gameserver/data/manager/ItemPremiumManager.getConfig:(I)Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
        92: astore        6
        94: aload         6
        96: invokevirtual #59                 // Method ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig.toMilliseconds:()J
        99: lstore        7
       101: lload         7
       103: lconst_0
       104: lcmp
       105: ifgt          116
       108: aload         4
       110: ldc           #65                 // String Invalid premium configuration for this item.
       112: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       115: return
       116: aload         4
       118: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
       121: lstore        9
       123: invokestatic  #70                 // Method java/lang/System.currentTimeMillis:()J
       126: lstore        11
       128: lload         9
       130: lload         11
       132: lcmp
       133: ifle          141
       136: lload         9
       138: goto          143
       141: lload         11
       143: lstore        13
       145: lload         13
       147: lload         7
       149: ladd
       150: lstore        15
       152: lload         15
       154: aload         4
       156: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
       159: invokestatic  #79                 // Method ext/mods/gameserver/custom/data/DonateData.updateDatabasePremium:(JLjava/lang/String;)V
       162: aload         4
       164: iconst_1
       165: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.setPremiumService:(I)V
       168: invokestatic  #89                 // Method ext/mods/gameserver/taskmanager/PremiumTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
       171: aload         4
       173: invokevirtual #94                 // Method ext/mods/gameserver/taskmanager/PremiumTaskManager.add:(Lext/mods/gameserver/model/actor/Player;)V
       176: aload         4
       178: aload_2
       179: iconst_1
       180: iconst_0
       181: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
       184: pop
       185: new           #102                // class java/text/SimpleDateFormat
       188: dup
       189: ldc           #104                // String dd/MM/yyyy HH:mm
       191: invokespecial #106                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       194: lload         15
       196: invokestatic  #108                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       199: invokevirtual #114                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       202: astore        17
       204: aload         4
       206: getstatic     #118                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       209: invokestatic  #121                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       212: aload         17
       214: invokedynamic #127,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       219: invokevirtual #131                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       222: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       225: aload         4
       227: invokevirtual #138                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       230: return
      LineNumberTable:
        line 44: 0
        line 45: 16
        line 47: 17
        line 49: 23
        line 50: 40
        line 53: 41
        line 55: 49
        line 56: 57
        line 59: 58
        line 60: 63
        line 62: 75
        line 63: 82
        line 66: 83
        line 67: 94
        line 68: 101
        line 70: 108
        line 71: 115
        line 74: 116
        line 75: 123
        line 76: 128
        line 77: 145
        line 79: 152
        line 80: 162
        line 81: 168
        line 82: 176
        line 83: 185
        line 84: 204
        line 86: 225
        line 87: 230
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0     231     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemPremium;
            0     231     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     231     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     231     3 forceUse   Z
           17     214     4 player   Lext/mods/gameserver/model/actor/Player;
           63     168     5 manager   Lext/mods/gameserver/data/manager/ItemPremiumManager;
           94     137     6 config   Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
          101     130     7 addMs   J
          123     108     9 currentEnd   J
          128     103    11   now   J
          145      86    13 baseTime   J
          152      79    15 newEndTime   J
          204      27    17 expiresAt   Ljava/lang/String;
      StackMapTable: number_of_entries = 8
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 23 /* same */
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/data/manager/ItemPremiumManager ]
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig, long ]
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ long, long ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ long ]
}
SourceFile: "ItemPremium.java"
BootstrapMethods:
  0: #177 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #175 Premium VIP adicionado! Expira em: \u0001
InnerClasses:
  public static final #184= #60 of #38;   // PremiumConfig=class ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig of class ext/mods/gameserver/data/manager/ItemPremiumManager
  public static final #189= #185 of #187; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
