// Bytecode for: ext.mods.gameserver.network.clientpackets.AttackRequest
// File: ext\mods\gameserver\network\clientpackets\AttackRequest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/AttackRequest.class
  Last modified 9 de jul de 2026; size 2197 bytes
  MD5 checksum 4fc2fd2ed599375b0176b344e5c3ae01
  Compiled from "AttackRequest.java"
public final class ext.mods.gameserver.network.clientpackets.AttackRequest extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/AttackRequest
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/AttackRequest.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/AttackRequest
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/AttackRequest
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/AttackRequest._objectId:I
  #14 = NameAndType        #15:#16        // _objectId:I
  #15 = Utf8               _objectId
  #16 = Utf8               I
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/AttackRequest.readC:()I
  #18 = NameAndType        #19:#12        // readC:()I
  #19 = Utf8               readC
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/network/clientpackets/AttackRequest._isShiftAction:Z
  #21 = NameAndType        #22:#23        // _isShiftAction:Z
  #22 = Utf8               _isShiftAction
  #23 = Utf8               Z
  #24 = Methodref          #8.#25         // ext/mods/gameserver/network/clientpackets/AttackRequest.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #25 = NameAndType        #26:#27        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #26 = Utf8               getClient
  #27 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #28 = Class              #29            // ext/mods/gameserver/network/GameClient
  #29 = Utf8               ext/mods/gameserver/network/GameClient
  #30 = Methodref          #28.#31        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #31 = NameAndType        #32:#33        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #32 = Utf8               getPlayer
  #33 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #34 = Methodref          #35.#36        // ext/mods/gameserver/model/actor/Player.isOutOfControl:()Z
  #35 = Class              #37            // ext/mods/gameserver/model/actor/Player
  #36 = NameAndType        #38:#39        // isOutOfControl:()Z
  #37 = Utf8               ext/mods/gameserver/model/actor/Player
  #38 = Utf8               isOutOfControl
  #39 = Utf8               ()Z
  #40 = Fieldref           #41.#42        // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #41 = Class              #43            // ext/mods/gameserver/network/serverpackets/ActionFailed
  #42 = NameAndType        #44:#45        // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #43 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #44 = Utf8               STATIC_PACKET
  #45 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #46 = Methodref          #35.#47        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #47 = NameAndType        #48:#49        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #48 = Utf8               sendPacket
  #49 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #50 = Methodref          #35.#51        // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #51 = NameAndType        #52:#39        // isInObserverMode:()Z
  #52 = Utf8               isInObserverMode
  #53 = Fieldref           #54.#55        // ext/mods/gameserver/network/SystemMessageId.OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
  #54 = Class              #56            // ext/mods/gameserver/network/SystemMessageId
  #55 = NameAndType        #57:#58        // OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
  #56 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #57 = Utf8               OBSERVERS_CANNOT_PARTICIPATE
  #58 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #59 = Methodref          #35.#60        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #60 = NameAndType        #48:#61        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #61 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #62 = Methodref          #35.#63        // ext/mods/gameserver/model/actor/Player.getTargetId:()I
  #63 = NameAndType        #64:#12        // getTargetId:()I
  #64 = Utf8               getTargetId
  #65 = Methodref          #35.#66        // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #66 = NameAndType        #67:#68        // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #67 = Utf8               getTarget
  #68 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #69 = Methodref          #70.#71        // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #70 = Class              #72            // ext/mods/gameserver/model/World
  #71 = NameAndType        #73:#74        // getInstance:()Lext/mods/gameserver/model/World;
  #72 = Utf8               ext/mods/gameserver/model/World
  #73 = Utf8               getInstance
  #74 = Utf8               ()Lext/mods/gameserver/model/World;
  #75 = Methodref          #70.#76        // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #76 = NameAndType        #77:#78        // getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #77 = Utf8               getObject
  #78 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
  #79 = Methodref          #80.#81        // ext/mods/gameserver/model/WorldObject.onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #80 = Class              #82            // ext/mods/gameserver/model/WorldObject
  #81 = NameAndType        #83:#84        // onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #82 = Utf8               ext/mods/gameserver/model/WorldObject
  #83 = Utf8               onAction
  #84 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #85 = Utf8               Code
  #86 = Utf8               LineNumberTable
  #87 = Utf8               LocalVariableTable
  #88 = Utf8               this
  #89 = Utf8               Lext/mods/gameserver/network/clientpackets/AttackRequest;
  #90 = Utf8               readImpl
  #91 = Utf8               StackMapTable
  #92 = Utf8               runImpl
  #93 = Utf8               player
  #94 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #95 = Utf8               target
  #96 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #97 = Utf8               SourceFile
  #98 = Utf8               AttackRequest.java
{
  public ext.mods.gameserver.network.clientpackets.AttackRequest();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/AttackRequest;

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
        line 34: 0
        line 35: 8
        line 36: 13
        line 37: 18
        line 38: 23
        line 39: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/network/clientpackets/AttackRequest;
      StackMapTable: number_of_entries = 2
        frame_type = 99 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/clientpackets/AttackRequest ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/AttackRequest ]
          stack = [ class ext/mods/gameserver/network/clientpackets/AttackRequest, int ]

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #24                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #28                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #30                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.isOutOfControl:()Z
        20: ifeq          31
        23: aload_1
        24: getstatic     #40                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        27: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        30: return
        31: aload_1
        32: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        35: ifeq          53
        38: aload_1
        39: getstatic     #53                 // Field ext/mods/gameserver/network/SystemMessageId.OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
        42: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        45: aload_1
        46: getstatic     #40                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        49: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
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
        87: getstatic     #40                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        90: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        93: return
        94: aload_2
        95: aload_1
        96: aload_1
        97: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
       100: aload_2
       101: if_acmpne     108
       104: iconst_1
       105: goto          109
       108: iconst_0
       109: aload_0
       110: getfield      #20                 // Field _isShiftAction:Z
       113: invokevirtual #79                 // Method ext/mods/gameserver/model/WorldObject.onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
       116: return
      LineNumberTable:
        line 44: 0
        line 45: 11
        line 46: 15
        line 48: 16
        line 50: 23
        line 51: 30
        line 54: 31
        line 56: 38
        line 57: 45
        line 58: 52
        line 61: 53
        line 63: 82
        line 65: 86
        line 66: 93
        line 69: 94
        line 70: 116
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     117     0  this   Lext/mods/gameserver/network/clientpackets/AttackRequest;
           11     106     1 player   Lext/mods/gameserver/model/actor/Player;
           82      35     2 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 14 /* same */
        frame_type = 21 /* same */
        frame_type = 17 /* same */
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/network/clientpackets/AttackRequest, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject ]
          stack = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/AttackRequest, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject ]
          stack = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player, int ]
}
SourceFile: "AttackRequest.java"
