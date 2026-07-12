// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestChangeMoveType
// File: ext\mods\gameserver\network\clientpackets\RequestChangeMoveType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestChangeMoveType.class
  Last modified 9 de jul de 2026; size 1125 bytes
  MD5 checksum d4d5543e28e84565a9c05c2a527d4020
  Compiled from "RequestChangeMoveType.java"
public final class ext.mods.gameserver.network.clientpackets.RequestChangeMoveType extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestChangeMoveType
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/RequestChangeMoveType.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/RequestChangeMoveType
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestChangeMoveType
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/RequestChangeMoveType._typeRun:Z
  #14 = NameAndType        #15:#16        // _typeRun:Z
  #15 = Utf8               _typeRun
  #16 = Utf8               Z
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/RequestChangeMoveType.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #18 = NameAndType        #19:#20        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #19 = Utf8               getClient
  #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #21 = Class              #22            // ext/mods/gameserver/network/GameClient
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Methodref          #21.#24        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #24 = NameAndType        #25:#26        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #25 = Utf8               getPlayer
  #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #27 = Methodref          #28.#29        // ext/mods/gameserver/model/actor/Player.isMounted:()Z
  #28 = Class              #30            // ext/mods/gameserver/model/actor/Player
  #29 = NameAndType        #31:#32        // isMounted:()Z
  #30 = Utf8               ext/mods/gameserver/model/actor/Player
  #31 = Utf8               isMounted
  #32 = Utf8               ()Z
  #33 = Methodref          #28.#34        // ext/mods/gameserver/model/actor/Player.forceRunStance:()V
  #34 = NameAndType        #35:#6         // forceRunStance:()V
  #35 = Utf8               forceRunStance
  #36 = Methodref          #28.#37        // ext/mods/gameserver/model/actor/Player.forceWalkStance:()V
  #37 = NameAndType        #38:#6         // forceWalkStance:()V
  #38 = Utf8               forceWalkStance
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestChangeMoveType;
  #44 = Utf8               readImpl
  #45 = Utf8               StackMapTable
  #46 = Utf8               runImpl
  #47 = Utf8               player
  #48 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #49 = Utf8               SourceFile
  #50 = Utf8               RequestChangeMoveType.java
{
  public ext.mods.gameserver.network.clientpackets.RequestChangeMoveType();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangeMoveType;

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
        14: putfield      #13                 // Field _typeRun:Z
        17: return
      LineNumberTable:
        line 29: 0
        line 30: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangeMoveType;
      StackMapTable: number_of_entries = 2
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/clientpackets/RequestChangeMoveType ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestChangeMoveType ]
          stack = [ class ext/mods/gameserver/network/clientpackets/RequestChangeMoveType, int ]

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        20: ifeq          24
        23: return
        24: aload_0
        25: getfield      #13                 // Field _typeRun:Z
        28: ifeq          38
        31: aload_1
        32: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.forceRunStance:()V
        35: goto          42
        38: aload_1
        39: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.forceWalkStance:()V
        42: return
      LineNumberTable:
        line 35: 0
        line 36: 11
        line 37: 15
        line 39: 16
        line 40: 23
        line 42: 24
        line 43: 31
        line 45: 38
        line 46: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangeMoveType;
           11      32     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 13 /* same */
        frame_type = 3 /* same */
}
SourceFile: "RequestChangeMoveType.java"
