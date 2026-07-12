// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestChangeWaitType
// File: ext\mods\gameserver\network\clientpackets\RequestChangeWaitType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestChangeWaitType.class
  Last modified 9 de jul de 2026; size 1434 bytes
  MD5 checksum bfec8c762dec53d595cb851cb27980c4
  Compiled from "RequestChangeWaitType.java"
public final class ext.mods.gameserver.network.clientpackets.RequestChangeWaitType extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestChangeWaitType
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/RequestChangeWaitType.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/RequestChangeWaitType
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestChangeWaitType
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/RequestChangeWaitType._typeStand:Z
  #14 = NameAndType        #15:#16        // _typeStand:Z
  #15 = Utf8               _typeStand
  #16 = Utf8               Z
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/RequestChangeWaitType.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #18 = NameAndType        #19:#20        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #19 = Utf8               getClient
  #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #21 = Class              #22            // ext/mods/gameserver/network/GameClient
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Methodref          #21.#24        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #24 = NameAndType        #25:#26        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #25 = Utf8               getPlayer
  #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #27 = Methodref          #28.#29        // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #28 = Class              #30            // ext/mods/gameserver/model/actor/Player
  #29 = NameAndType        #31:#32        // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #30 = Utf8               ext/mods/gameserver/model/actor/Player
  #31 = Utf8               getTarget
  #32 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #33 = Methodref          #28.#34        // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #34 = NameAndType        #35:#36        // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #35 = Utf8               getAI
  #36 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #37 = Methodref          #38.#39        // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToStand:()V
  #38 = Class              #40            // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #39 = NameAndType        #41:#6         // tryToStand:()V
  #40 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #41 = Utf8               tryToStand
  #42 = Methodref          #38.#43        // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToSit:(Lext/mods/gameserver/model/WorldObject;)V
  #43 = NameAndType        #44:#45        // tryToSit:(Lext/mods/gameserver/model/WorldObject;)V
  #44 = Utf8               tryToSit
  #45 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #46 = Utf8               Code
  #47 = Utf8               LineNumberTable
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               this
  #50 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestChangeWaitType;
  #51 = Utf8               readImpl
  #52 = Utf8               StackMapTable
  #53 = Utf8               runImpl
  #54 = Utf8               player
  #55 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #56 = Utf8               target
  #57 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #58 = Class              #59            // ext/mods/gameserver/model/WorldObject
  #59 = Utf8               ext/mods/gameserver/model/WorldObject
  #60 = Utf8               SourceFile
  #61 = Utf8               RequestChangeWaitType.java
{
  public ext.mods.gameserver.network.clientpackets.RequestChangeWaitType();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangeWaitType;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: iconst_1
         6: if_icmpne     13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: putfield      #13                 // Field _typeStand:Z
        17: return
      LineNumberTable:
        line 30: 0
        line 31: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangeWaitType;
      StackMapTable: number_of_entries = 2
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/clientpackets/RequestChangeWaitType ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestChangeWaitType ]
          stack = [ class ext/mods/gameserver/network/clientpackets/RequestChangeWaitType, int ]

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field _typeStand:Z
        25: ifeq          38
        28: aload_1
        29: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        32: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToStand:()V
        35: goto          46
        38: aload_1
        39: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        42: aload_2
        43: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToSit:(Lext/mods/gameserver/model/WorldObject;)V
        46: return
      LineNumberTable:
        line 36: 0
        line 37: 11
        line 38: 15
        line 40: 16
        line 42: 21
        line 43: 28
        line 45: 38
        line 46: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangeWaitType;
           11      36     1 player   Lext/mods/gameserver/model/actor/Player;
           21      26     2 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 7 /* same */
}
SourceFile: "RequestChangeWaitType.java"
