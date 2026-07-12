// Bytecode for: ext.mods.gameserver.network.clientpackets.CannotMoveAnymore
// File: ext\mods\gameserver\network\clientpackets\CannotMoveAnymore.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/CannotMoveAnymore.class
  Last modified 9 de jul de 2026; size 1508 bytes
  MD5 checksum 8b556a2414000afe88e215d59527f23b
  Compiled from "CannotMoveAnymore.java"
public final class ext.mods.gameserver.network.clientpackets.CannotMoveAnymore extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 4, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/CannotMoveAnymore
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore._x:I
  #14 = NameAndType        #15:#16        // _x:I
  #15 = Utf8               _x
  #16 = Utf8               I
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore._y:I
  #18 = NameAndType        #19:#16        // _y:I
  #19 = Utf8               _y
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore._z:I
  #21 = NameAndType        #22:#16        // _z:I
  #22 = Utf8               _z
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore._heading:I
  #24 = NameAndType        #25:#16        // _heading:I
  #25 = Utf8               _heading
  #26 = Methodref          #8.#27         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #27 = NameAndType        #28:#29        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #28 = Utf8               getClient
  #29 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #30 = Class              #31            // ext/mods/gameserver/network/GameClient
  #31 = Utf8               ext/mods/gameserver/network/GameClient
  #32 = Methodref          #30.#33        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #33 = NameAndType        #34:#35        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #34 = Utf8               getPlayer
  #35 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #36 = Methodref          #37.#38        // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #37 = Class              #39            // ext/mods/gameserver/model/actor/Player
  #38 = NameAndType        #40:#41        // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #39 = Utf8               ext/mods/gameserver/model/actor/Player
  #40 = Utf8               getAI
  #41 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #42 = Fieldref           #43.#44        // ext/mods/gameserver/enums/AiEventType.ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
  #43 = Class              #45            // ext/mods/gameserver/enums/AiEventType
  #44 = NameAndType        #46:#47        // ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
  #45 = Utf8               ext/mods/gameserver/enums/AiEventType
  #46 = Utf8               ARRIVED_BLOCKED
  #47 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #48 = Class              #49            // ext/mods/gameserver/model/location/SpawnLocation
  #49 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #50 = Methodref          #48.#51        // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
  #51 = NameAndType        #5:#52         // "<init>":(IIII)V
  #52 = Utf8               (IIII)V
  #53 = Methodref          #54.#55        // ext/mods/gameserver/model/actor/ai/type/PlayerAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #54 = Class              #56            // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #55 = NameAndType        #57:#58        // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #56 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #57 = Utf8               notifyEvent
  #58 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #59 = Utf8               Code
  #60 = Utf8               LineNumberTable
  #61 = Utf8               LocalVariableTable
  #62 = Utf8               this
  #63 = Utf8               Lext/mods/gameserver/network/clientpackets/CannotMoveAnymore;
  #64 = Utf8               readImpl
  #65 = Utf8               runImpl
  #66 = Utf8               player
  #67 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #68 = Utf8               StackMapTable
  #69 = Utf8               SourceFile
  #70 = Utf8               CannotMoveAnymore.java
{
  public ext.mods.gameserver.network.clientpackets.CannotMoveAnymore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/CannotMoveAnymore;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _x:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _y:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _z:I
        24: aload_0
        25: aload_0
        26: invokevirtual #7                  // Method readD:()I
        29: putfield      #23                 // Field _heading:I
        32: return
      LineNumberTable:
        line 34: 0
        line 35: 8
        line 36: 16
        line 37: 24
        line 38: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/network/clientpackets/CannotMoveAnymore;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=8, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #26                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #30                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #32                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        20: getstatic     #42                 // Field ext/mods/gameserver/enums/AiEventType.ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
        23: new           #48                 // class ext/mods/gameserver/model/location/SpawnLocation
        26: dup
        27: aload_0
        28: getfield      #13                 // Field _x:I
        31: aload_0
        32: getfield      #17                 // Field _y:I
        35: aload_0
        36: getfield      #20                 // Field _z:I
        39: aload_0
        40: getfield      #23                 // Field _heading:I
        43: invokespecial #50                 // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        46: aconst_null
        47: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        50: return
      LineNumberTable:
        line 43: 0
        line 44: 11
        line 45: 15
        line 47: 16
        line 48: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/network/clientpackets/CannotMoveAnymore;
           11      40     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
}
SourceFile: "CannotMoveAnymore.java"
