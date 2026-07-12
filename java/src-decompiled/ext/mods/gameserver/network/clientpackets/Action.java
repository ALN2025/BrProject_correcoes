// Bytecode for: ext.mods.gameserver.network.clientpackets.Action
// File: ext\mods\gameserver\network\clientpackets\Action.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/Action.class
  Last modified 9 de jul de 2026; size 2537 bytes
  MD5 checksum c2a9cce85798f311c559351a45a39058
  Compiled from "Action.java"
public final class ext.mods.gameserver.network.clientpackets.Action extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/Action
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 2, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/Action.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/Action
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/Action
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/Action._objectId:I
   #14 = NameAndType        #15:#16       // _objectId:I
   #15 = Utf8               _objectId
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/Action.readC:()I
   #18 = NameAndType        #19:#12       // readC:()I
   #19 = Utf8               readC
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/Action._isShiftAction:Z
   #21 = NameAndType        #22:#23       // _isShiftAction:Z
   #22 = Utf8               _isShiftAction
   #23 = Utf8               Z
   #24 = Methodref          #8.#25        // ext/mods/gameserver/network/clientpackets/Action.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #25 = NameAndType        #26:#27       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #26 = Utf8               getClient
   #27 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #28 = Class              #29           // ext/mods/gameserver/network/GameClient
   #29 = Utf8               ext/mods/gameserver/network/GameClient
   #30 = Methodref          #28.#31       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #31 = NameAndType        #32:#33       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #32 = Utf8               getPlayer
   #33 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #34 = Methodref          #35.#36       // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
   #35 = Class              #37           // ext/mods/gameserver/model/actor/Player
   #36 = NameAndType        #38:#39       // isInObserverMode:()Z
   #37 = Utf8               ext/mods/gameserver/model/actor/Player
   #38 = Utf8               isInObserverMode
   #39 = Utf8               ()Z
   #40 = Fieldref           #41.#42       // ext/mods/gameserver/network/SystemMessageId.OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
   #41 = Class              #43           // ext/mods/gameserver/network/SystemMessageId
   #42 = NameAndType        #44:#45       // OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
   #43 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #44 = Utf8               OBSERVERS_CANNOT_PARTICIPATE
   #45 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #46 = Methodref          #35.#47       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #47 = NameAndType        #48:#49       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #48 = Utf8               sendPacket
   #49 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #50 = Fieldref           #51.#52       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #51 = Class              #53           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #52 = NameAndType        #54:#55       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #53 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #54 = Utf8               STATIC_PACKET
   #55 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #56 = Methodref          #35.#57       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #57 = NameAndType        #48:#58       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #58 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #59 = Methodref          #35.#60       // ext/mods/gameserver/model/actor/Player.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
   #60 = NameAndType        #61:#33       // getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
   #61 = Utf8               getActiveRequester
   #62 = Methodref          #35.#63       // ext/mods/gameserver/model/actor/Player.getTargetId:()I
   #63 = NameAndType        #64:#12       // getTargetId:()I
   #64 = Utf8               getTargetId
   #65 = Methodref          #35.#66       // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #66 = NameAndType        #67:#68       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #67 = Utf8               getTarget
   #68 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #70 = Class              #72           // ext/mods/gameserver/model/World
   #71 = NameAndType        #73:#74       // getInstance:()Lext/mods/gameserver/model/World;
   #72 = Utf8               ext/mods/gameserver/model/World
   #73 = Utf8               getInstance
   #74 = Utf8               ()Lext/mods/gameserver/model/World;
   #75 = Methodref          #70.#76       // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #76 = NameAndType        #77:#78       // getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #77 = Utf8               getObject
   #78 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
   #79 = Methodref          #80.#81       // ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #80 = Class              #82           // ext/mods/gameserver/model/WorldObject
   #81 = NameAndType        #83:#33       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #82 = Utf8               ext/mods/gameserver/model/WorldObject
   #83 = Utf8               getActingPlayer
   #84 = Methodref          #35.#85       // ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
   #85 = NameAndType        #86:#87       // getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
   #86 = Utf8               getDuelState
   #87 = Utf8               ()Lext/mods/gameserver/enums/duels/DuelState;
   #88 = Fieldref           #89.#90       // ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
   #89 = Class              #91           // ext/mods/gameserver/enums/duels/DuelState
   #90 = NameAndType        #92:#93       // DEAD:Lext/mods/gameserver/enums/duels/DuelState;
   #91 = Utf8               ext/mods/gameserver/enums/duels/DuelState
   #92 = Utf8               DEAD
   #93 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
   #94 = Fieldref           #41.#95       // ext/mods/gameserver/network/SystemMessageId.OTHER_PARTY_IS_FROZEN:Lext/mods/gameserver/network/SystemMessageId;
   #95 = NameAndType        #96:#45       // OTHER_PARTY_IS_FROZEN:Lext/mods/gameserver/network/SystemMessageId;
   #96 = Utf8               OTHER_PARTY_IS_FROZEN
   #97 = Methodref          #80.#98       // ext/mods/gameserver/model/WorldObject.onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
   #98 = NameAndType        #99:#100      // onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
   #99 = Utf8               onAction
  #100 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #101 = Utf8               Code
  #102 = Utf8               LineNumberTable
  #103 = Utf8               LocalVariableTable
  #104 = Utf8               this
  #105 = Utf8               Lext/mods/gameserver/network/clientpackets/Action;
  #106 = Utf8               readImpl
  #107 = Utf8               StackMapTable
  #108 = Utf8               runImpl
  #109 = Utf8               player
  #110 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #111 = Utf8               target
  #112 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #113 = Utf8               targetPlayer
  #114 = Utf8               triggersOnActionRequest
  #115 = Utf8               SourceFile
  #116 = Utf8               Action.java
{
  public ext.mods.gameserver.network.clientpackets.Action();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/Action;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _objectId:I
         8: aload_0
         9: invokevirtual #7                  // Method readD:()I
        12: pop
        13: aload_0
        14: invokevirtual #7                  // Method readD:()I
        17: pop
        18: aload_0
        19: invokevirtual #7                  // Method readD:()I
        22: pop
        23: aload_0
        24: aload_0
        25: invokevirtual #17                 // Method readC:()I
        28: ifeq          35
        31: iconst_1
        32: goto          36
        35: iconst_0
        36: putfield      #20                 // Field _isShiftAction:Z
        39: return
      LineNumberTable:
        line 35: 0
        line 36: 8
        line 37: 13
        line 38: 18
        line 39: 23
        line 40: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/network/clientpackets/Action;
      StackMapTable: number_of_entries = 2
        frame_type = 99 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/clientpackets/Action ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/Action ]
          stack = [ class ext/mods/gameserver/network/clientpackets/Action, int ]

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #24                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #28                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #30                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        20: ifeq          38
        23: aload_1
        24: getstatic     #40                 // Field ext/mods/gameserver/network/SystemMessageId.OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
        27: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        30: aload_1
        31: getstatic     #50                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        34: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        37: return
        38: aload_1
        39: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
        42: ifnull        53
        45: aload_1
        46: getstatic     #50                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        49: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        52: return
        53: aload_1
        54: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getTargetId:()I
        57: aload_0
        58: getfield      #13                 // Field _objectId:I
        61: if_icmpne     71
        64: aload_1
        65: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        68: goto          81
        71: invokestatic  #69                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        74: aload_0
        75: getfield      #13                 // Field _objectId:I
        78: invokevirtual #75                 // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        81: astore_2
        82: aload_2
        83: ifnonnull     94
        86: aload_1
        87: getstatic     #50                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        90: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        93: return
        94: aload_2
        95: invokevirtual #79                 // Method ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        98: astore_3
        99: aload_3
       100: ifnull        128
       103: aload_3
       104: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       107: getstatic     #88                 // Field ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
       110: if_acmpne     128
       113: aload_1
       114: getstatic     #94                 // Field ext/mods/gameserver/network/SystemMessageId.OTHER_PARTY_IS_FROZEN:Lext/mods/gameserver/network/SystemMessageId;
       117: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       120: aload_1
       121: getstatic     #50                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       124: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       127: return
       128: aload_2
       129: aload_1
       130: iconst_0
       131: aload_0
       132: getfield      #20                 // Field _isShiftAction:Z
       135: invokevirtual #97                 // Method ext/mods/gameserver/model/WorldObject.onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
       138: return
      LineNumberTable:
        line 45: 0
        line 46: 11
        line 47: 15
        line 49: 16
        line 51: 23
        line 52: 30
        line 53: 37
        line 56: 38
        line 58: 45
        line 59: 52
        line 62: 53
        line 63: 82
        line 65: 86
        line 66: 93
        line 69: 94
        line 70: 99
        line 72: 113
        line 73: 120
        line 74: 127
        line 77: 128
        line 78: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     139     0  this   Lext/mods/gameserver/network/clientpackets/Action;
           11     128     1 player   Lext/mods/gameserver/model/actor/Player;
           82      57     2 target   Lext/mods/gameserver/model/WorldObject;
           99      40     3 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 21 /* same */
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/actor/Player ]

  protected boolean triggersOnActionRequest();
    descriptor: ()Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/network/clientpackets/Action;
}
SourceFile: "Action.java"
