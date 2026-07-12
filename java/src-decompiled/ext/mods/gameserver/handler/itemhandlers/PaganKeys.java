// Bytecode for: ext.mods.gameserver.handler.itemhandlers.PaganKeys
// File: ext\mods\gameserver\handler\itemhandlers\PaganKeys.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/PaganKeys.class
  Last modified 9 de jul de 2026; size 3415 bytes
  MD5 checksum a3c01206de7f3f0b1f7176a2778937a0
  Compiled from "PaganKeys.java"
public class ext.mods.gameserver.handler.itemhandlers.PaganKeys implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #105                        // ext/mods/gameserver/handler/itemhandlers/PaganKeys
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #10 = NameAndType        #11:#12       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #11 = Utf8               getTarget
   #12 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/instance/Door
   #14 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Class              #18           // ext/mods/gameserver/network/SystemMessageId
   #17 = NameAndType        #19:#20       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #18 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #19 = Utf8               INVALID_TARGET
   #20 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #21 = Methodref          #7.#22        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #22 = NameAndType        #23:#24       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #23 = Utf8               sendPacket
   #24 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #26 = Class              #28           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #27 = NameAndType        #29:#30       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #28 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #29 = Utf8               STATIC_PACKET
   #30 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #31 = Methodref          #7.#32        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #32 = NameAndType        #23:#33       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #33 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #34 = Class              #35           // ext/mods/gameserver/model/actor/Npc
   #35 = Utf8               ext/mods/gameserver/model/actor/Npc
   #36 = Methodref          #7.#37        // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #37 = NameAndType        #38:#39       // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #38 = Utf8               isIn3DRadius
   #39 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #40 = Fieldref           #16.#41       // ext/mods/gameserver/network/SystemMessageId.DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
   #41 = NameAndType        #42:#20       // DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
   #42 = Utf8               DIST_TOO_FAR_CASTING_STOPPED
   #43 = Methodref          #7.#44        // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
   #44 = NameAndType        #45:#46       // getClient:()Lext/mods/gameserver/network/GameClient;
   #45 = Utf8               getClient
   #46 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #47 = Fieldref           #48.#49       // ext/mods/gameserver/enums/FloodProtector.ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
   #48 = Class              #50           // ext/mods/gameserver/enums/FloodProtector
   #49 = NameAndType        #51:#52       // ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
   #50 = Utf8               ext/mods/gameserver/enums/FloodProtector
   #51 = Utf8               ROLL_DICE
   #52 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
   #53 = Methodref          #54.#55       // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #54 = Class              #56           // ext/mods/gameserver/network/GameClient
   #55 = NameAndType        #57:#58       // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #56 = Utf8               ext/mods/gameserver/network/GameClient
   #57 = Utf8               performAction
   #58 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #60 = Class              #62           // ext/mods/gameserver/model/item/instance/ItemInstance
   #61 = NameAndType        #63:#64       // getObjectId:()I
   #62 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #63 = Utf8               getObjectId
   #64 = Utf8               ()I
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
   #66 = Class              #68           // ext/mods/gameserver/model/actor/Playable
   #67 = NameAndType        #69:#70       // destroyItem:(IIZ)Z
   #68 = Utf8               ext/mods/gameserver/model/actor/Playable
   #69 = Utf8               destroyItem
   #70 = Utf8               (IIZ)Z
   #71 = Methodref          #13.#72       // ext/mods/gameserver/model/actor/instance/Door.getDoorId:()I
   #72 = NameAndType        #73:#64       // getDoorId:()I
   #73 = Utf8               getDoorId
   #74 = Methodref          #60.#75       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #75 = NameAndType        #76:#64       // getItemId:()I
   #76 = Utf8               getItemId
   #77 = Integer            23150004
   #78 = Integer            23150003
   #79 = Methodref          #80.#81       // ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
   #80 = Class              #82           // ext/mods/gameserver/data/xml/DoorData
   #81 = NameAndType        #83:#84       // getInstance:()Lext/mods/gameserver/data/xml/DoorData;
   #82 = Utf8               ext/mods/gameserver/data/xml/DoorData
   #83 = Utf8               getInstance
   #84 = Utf8               ()Lext/mods/gameserver/data/xml/DoorData;
   #85 = Methodref          #80.#86       // ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
   #86 = NameAndType        #87:#88       // getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
   #87 = Utf8               getDoor
   #88 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
   #89 = Methodref          #13.#90       // ext/mods/gameserver/model/actor/instance/Door.openMe:()V
   #90 = NameAndType        #91:#6        // openMe:()V
   #91 = Utf8               openMe
   #92 = Fieldref           #16.#93       // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #93 = NameAndType        #94:#20       // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Utf8               S1_CANNOT_BE_USED
   #95 = Methodref          #96.#97       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = Class              #98           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #97 = NameAndType        #99:#100      // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #98 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #99 = Utf8               getSystemMessage
  #100 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #101 = Methodref          #96.#102      // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #102 = NameAndType        #103:#104     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #103 = Utf8               addItemName
  #104 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #105 = Class              #106          // ext/mods/gameserver/handler/itemhandlers/PaganKeys
  #106 = Utf8               ext/mods/gameserver/handler/itemhandlers/PaganKeys
  #107 = Class              #108          // ext/mods/gameserver/handler/IItemHandler
  #108 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               this
  #113 = Utf8               Lext/mods/gameserver/handler/itemhandlers/PaganKeys;
  #114 = Utf8               useItem
  #115 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #116 = Utf8               player
  #117 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #118 = Utf8               targetDoor
  #119 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #120 = Utf8               playable
  #121 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #122 = Utf8               item
  #123 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #124 = Utf8               forceUse
  #125 = Utf8               Z
  #126 = Utf8               target
  #127 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #128 = Utf8               doorId
  #129 = Utf8               I
  #130 = Utf8               StackMapTable
  #131 = Class              #132          // ext/mods/gameserver/model/WorldObject
  #132 = Utf8               ext/mods/gameserver/model/WorldObject
  #133 = Utf8               SourceFile
  #134 = Utf8               PaganKeys.java
{
  public ext.mods.gameserver.handler.itemhandlers.PaganKeys();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/PaganKeys;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload         4
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        22: astore        5
        24: aload         5
        26: instanceof    #13                 // class ext/mods/gameserver/model/actor/instance/Door
        29: ifeq          42
        32: aload         5
        34: checkcast     #13                 // class ext/mods/gameserver/model/actor/instance/Door
        37: astore        6
        39: goto          59
        42: aload         4
        44: getstatic     #15                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: aload         4
        52: getstatic     #25                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        55: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: return
        59: aload         4
        61: aload         6
        63: sipush        150
        66: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        69: ifne          89
        72: aload         4
        74: getstatic     #40                 // Field ext/mods/gameserver/network/SystemMessageId.DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
        77: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        80: aload         4
        82: getstatic     #25                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        85: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        88: return
        89: aload         4
        91: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        94: getstatic     #47                 // Field ext/mods/gameserver/enums/FloodProtector.ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
        97: invokevirtual #53                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
       100: ifne          104
       103: return
       104: aload_1
       105: aload_2
       106: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       109: iconst_1
       110: iconst_1
       111: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
       114: ifne          118
       117: return
       118: aload         6
       120: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/instance/Door.getDoorId:()I
       123: istore        7
       125: aload_2
       126: invokevirtual #74                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       129: lookupswitch  { // 4

                    8056: 172

                    8273: 231

                    8274: 314

                    8275: 378
                 default: 439
            }
       172: iload         7
       174: ldc           #77                 // int 23150004
       176: if_icmpeq     186
       179: iload         7
       181: ldc           #78                 // int 23150003
       183: if_icmpne     211
       186: invokestatic  #79                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
       189: ldc           #78                 // int 23150003
       191: invokevirtual #85                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
       194: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
       197: invokestatic  #79                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
       200: ldc           #77                 // int 23150004
       202: invokevirtual #85                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
       205: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
       208: goto          439
       211: aload         4
       213: getstatic     #92                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       216: invokestatic  #95                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       219: sipush        8056
       222: invokevirtual #101                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       225: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       228: goto          439
       231: iload         7
       233: tableswitch   { // 19160002 to 19160009

                19160002: 280

                19160003: 280

                19160004: 280

                19160005: 280

                19160006: 280

                19160007: 280

                19160008: 280

                19160009: 280
                 default: 294
            }
       280: invokestatic  #79                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
       283: iload         7
       285: invokevirtual #85                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
       288: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
       291: goto          439
       294: aload         4
       296: getstatic     #92                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       299: invokestatic  #95                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       302: sipush        8273
       305: invokevirtual #101                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       308: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       311: goto          439
       314: iload         7
       316: lookupswitch  { // 2

                19160010: 344

                19160011: 344
                 default: 358
            }
       344: invokestatic  #79                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
       347: iload         7
       349: invokevirtual #85                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
       352: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
       355: goto          439
       358: aload         4
       360: getstatic     #92                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       363: invokestatic  #95                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       366: sipush        8275
       369: invokevirtual #101                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       372: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       375: goto          439
       378: iload         7
       380: lookupswitch  { // 2

                19160012: 408

                19160013: 408
                 default: 422
            }
       408: invokestatic  #79                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
       411: iload         7
       413: invokevirtual #85                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
       416: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
       419: goto          439
       422: aload         4
       424: getstatic     #92                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       427: invokestatic  #95                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       430: sipush        8275
       433: invokevirtual #101                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       436: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       439: return
      LineNumberTable:
        line 38: 0
        line 39: 16
        line 41: 17
        line 43: 24
        line 45: 42
        line 46: 50
        line 47: 58
        line 50: 59
        line 52: 72
        line 53: 80
        line 54: 88
        line 57: 89
        line 58: 103
        line 60: 104
        line 61: 117
        line 63: 118
        line 65: 125
        line 68: 172
        line 70: 186
        line 71: 197
        line 74: 211
        line 75: 228
        line 78: 231
        line 81: 280
        line 82: 291
        line 85: 294
        line 86: 311
        line 91: 314
        line 94: 344
        line 95: 355
        line 98: 358
        line 99: 375
        line 104: 378
        line 107: 408
        line 108: 419
        line 111: 422
        line 116: 439
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
           39       3     6 targetDoor   Lext/mods/gameserver/model/actor/instance/Door;
            0     440     0  this   Lext/mods/gameserver/handler/itemhandlers/PaganKeys;
            0     440     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     440     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     440     3 forceUse   Z
           17     423     4 player   Lext/mods/gameserver/model/actor/Player;
           24     416     5 target   Lext/mods/gameserver/model/WorldObject;
           59     381     6 targetDoor   Lext/mods/gameserver/model/actor/instance/Door;
          125     315     7 doorId   I
      StackMapTable: number_of_entries = 20
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/instance/Door ]
        frame_type = 29 /* same */
        frame_type = 14 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 53
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 24 /* same */
        frame_type = 19 /* same */
        frame_type = 48 /* same */
        frame_type = 13 /* same */
        frame_type = 19 /* same */
        frame_type = 29 /* same */
        frame_type = 13 /* same */
        frame_type = 19 /* same */
        frame_type = 29 /* same */
        frame_type = 13 /* same */
        frame_type = 16 /* same */
}
SourceFile: "PaganKeys.java"
