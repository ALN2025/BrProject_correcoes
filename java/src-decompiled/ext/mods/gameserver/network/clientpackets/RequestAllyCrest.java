// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAllyCrest
// File: ext\mods\gameserver\network\clientpackets\RequestAllyCrest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAllyCrest.class
  Last modified 9 de jul de 2026; size 1475 bytes
  MD5 checksum b7adf9cf1c47fd3a687d76fdc6629935
  Compiled from "RequestAllyCrest.java"
public final class ext.mods.gameserver.network.clientpackets.RequestAllyCrest extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAllyCrest
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/RequestAllyCrest.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/RequestAllyCrest
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAllyCrest
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/RequestAllyCrest._crestId:I
  #14 = NameAndType        #15:#16        // _crestId:I
  #15 = Utf8               _crestId
  #16 = Utf8               I
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/RequestAllyCrest.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #18 = NameAndType        #19:#20        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #19 = Utf8               getClient
  #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #21 = Class              #22            // ext/mods/gameserver/network/GameClient
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Methodref          #21.#24        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #24 = NameAndType        #25:#26        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #25 = Utf8               getPlayer
  #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #27 = Methodref          #28.#29        // ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
  #28 = Class              #30            // ext/mods/gameserver/data/cache/CrestCache
  #29 = NameAndType        #31:#32        // getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
  #30 = Utf8               ext/mods/gameserver/data/cache/CrestCache
  #31 = Utf8               getInstance
  #32 = Utf8               ()Lext/mods/gameserver/data/cache/CrestCache;
  #33 = Fieldref           #34.#35        // ext/mods/gameserver/enums/CrestType.ALLY:Lext/mods/gameserver/enums/CrestType;
  #34 = Class              #36            // ext/mods/gameserver/enums/CrestType
  #35 = NameAndType        #37:#38        // ALLY:Lext/mods/gameserver/enums/CrestType;
  #36 = Utf8               ext/mods/gameserver/enums/CrestType
  #37 = Utf8               ALLY
  #38 = Utf8               Lext/mods/gameserver/enums/CrestType;
  #39 = Methodref          #28.#40        // ext/mods/gameserver/data/cache/CrestCache.getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
  #40 = NameAndType        #41:#42        // getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
  #41 = Utf8               getCrest
  #42 = Utf8               (Lext/mods/gameserver/enums/CrestType;I)[B
  #43 = Class              #44            // ext/mods/gameserver/network/serverpackets/AllyCrest
  #44 = Utf8               ext/mods/gameserver/network/serverpackets/AllyCrest
  #45 = Methodref          #43.#46        // ext/mods/gameserver/network/serverpackets/AllyCrest."<init>":(I[B)V
  #46 = NameAndType        #5:#47         // "<init>":(I[B)V
  #47 = Utf8               (I[B)V
  #48 = Methodref          #49.#50        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #49 = Class              #51            // ext/mods/gameserver/model/actor/Player
  #50 = NameAndType        #52:#53        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #51 = Utf8               ext/mods/gameserver/model/actor/Player
  #52 = Utf8               sendPacket
  #53 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #54 = Utf8               Code
  #55 = Utf8               LineNumberTable
  #56 = Utf8               LocalVariableTable
  #57 = Utf8               this
  #58 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAllyCrest;
  #59 = Utf8               readImpl
  #60 = Utf8               runImpl
  #61 = Utf8               player
  #62 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #63 = Utf8               data
  #64 = Utf8               [B
  #65 = Utf8               StackMapTable
  #66 = Class              #64            // "[B"
  #67 = Utf8               SourceFile
  #68 = Utf8               RequestAllyCrest.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAllyCrest();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAllyCrest;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _crestId:I
         8: return
      LineNumberTable:
        line 32: 0
        line 33: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestAllyCrest;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: invokestatic  #27                 // Method ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
        19: getstatic     #33                 // Field ext/mods/gameserver/enums/CrestType.ALLY:Lext/mods/gameserver/enums/CrestType;
        22: aload_0
        23: getfield      #13                 // Field _crestId:I
        26: invokevirtual #39                 // Method ext/mods/gameserver/data/cache/CrestCache.getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
        29: astore_2
        30: aload_2
        31: ifnonnull     35
        34: return
        35: aload_1
        36: new           #43                 // class ext/mods/gameserver/network/serverpackets/AllyCrest
        39: dup
        40: aload_0
        41: getfield      #13                 // Field _crestId:I
        44: aload_2
        45: invokespecial #45                 // Method ext/mods/gameserver/network/serverpackets/AllyCrest."<init>":(I[B)V
        48: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: return
      LineNumberTable:
        line 38: 0
        line 39: 11
        line 40: 15
        line 42: 16
        line 43: 30
        line 44: 34
        line 46: 35
        line 47: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/network/clientpackets/RequestAllyCrest;
           11      41     1 player   Lext/mods/gameserver/model/actor/Player;
           30      22     2  data   [B
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class "[B" ]
}
SourceFile: "RequestAllyCrest.java"
