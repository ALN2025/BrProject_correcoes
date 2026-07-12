// Bytecode for: ext.mods.gameserver.network.clientpackets.CannotMoveAnymoreInVehicle
// File: ext\mods\gameserver\network\clientpackets\CannotMoveAnymoreInVehicle.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle.class
  Last modified 9 de jul de 2026; size 2030 bytes
  MD5 checksum fc6f511fd89ae4567758570d4067f892
  Compiled from "CannotMoveAnymoreInVehicle.java"
public final class ext.mods.gameserver.network.clientpackets.CannotMoveAnymoreInVehicle extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 5, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle._boatId:I
  #14 = NameAndType        #15:#16        // _boatId:I
  #15 = Utf8               _boatId
  #16 = Utf8               I
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle._x:I
  #18 = NameAndType        #19:#16        // _x:I
  #19 = Utf8               _x
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle._y:I
  #21 = NameAndType        #22:#16        // _y:I
  #22 = Utf8               _y
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle._z:I
  #24 = NameAndType        #25:#16        // _z:I
  #25 = Utf8               _z
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle._heading:I
  #27 = NameAndType        #28:#16        // _heading:I
  #28 = Utf8               _heading
  #29 = Methodref          #8.#30         // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #30 = NameAndType        #31:#32        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #31 = Utf8               getClient
  #32 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #33 = Class              #34            // ext/mods/gameserver/network/GameClient
  #34 = Utf8               ext/mods/gameserver/network/GameClient
  #35 = Methodref          #33.#36        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #36 = NameAndType        #37:#38        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #37 = Utf8               getPlayer
  #38 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #39 = Methodref          #40.#41        // ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #40 = Class              #42            // ext/mods/gameserver/model/actor/Player
  #41 = NameAndType        #43:#44        // getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #42 = Utf8               ext/mods/gameserver/model/actor/Player
  #43 = Utf8               getBoatInfo
  #44 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #45 = Methodref          #46.#47        // ext/mods/gameserver/model/actor/container/player/BoatInfo.isInBoat:()Z
  #46 = Class              #48            // ext/mods/gameserver/model/actor/container/player/BoatInfo
  #47 = NameAndType        #49:#50        // isInBoat:()Z
  #48 = Utf8               ext/mods/gameserver/model/actor/container/player/BoatInfo
  #49 = Utf8               isInBoat
  #50 = Utf8               ()Z
  #51 = Methodref          #46.#52        // ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #52 = NameAndType        #53:#54        // getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #53 = Utf8               getBoat
  #54 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
  #55 = Methodref          #56.#57        // ext/mods/gameserver/model/actor/Boat.getObjectId:()I
  #56 = Class              #58            // ext/mods/gameserver/model/actor/Boat
  #57 = NameAndType        #59:#12        // getObjectId:()I
  #58 = Utf8               ext/mods/gameserver/model/actor/Boat
  #59 = Utf8               getObjectId
  #60 = Methodref          #46.#61        // ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #61 = NameAndType        #62:#63        // getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #62 = Utf8               getBoatPosition
  #63 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #64 = Methodref          #65.#66        // ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
  #65 = Class              #67            // ext/mods/gameserver/model/location/SpawnLocation
  #66 = NameAndType        #68:#69        // set:(IIII)V
  #67 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #68 = Utf8               set
  #69 = Utf8               (IIII)V
  #70 = Methodref          #46.#71        // ext/mods/gameserver/model/actor/container/player/BoatInfo.stopMoveInVehicle:(I)V
  #71 = NameAndType        #72:#73        // stopMoveInVehicle:(I)V
  #72 = Utf8               stopMoveInVehicle
  #73 = Utf8               (I)V
  #74 = Fieldref           #75.#76        // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #75 = Class              #77            // ext/mods/gameserver/network/serverpackets/ActionFailed
  #76 = NameAndType        #78:#79        // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #77 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #78 = Utf8               STATIC_PACKET
  #79 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #80 = Methodref          #40.#81        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #81 = NameAndType        #82:#83        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #82 = Utf8               sendPacket
  #83 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #84 = Utf8               Code
  #85 = Utf8               LineNumberTable
  #86 = Utf8               LocalVariableTable
  #87 = Utf8               this
  #88 = Utf8               Lext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle;
  #89 = Utf8               readImpl
  #90 = Utf8               runImpl
  #91 = Utf8               player
  #92 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #93 = Utf8               info
  #94 = Utf8               Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #95 = Utf8               StackMapTable
  #96 = Utf8               SourceFile
  #97 = Utf8               CannotMoveAnymoreInVehicle.java
{
  public ext.mods.gameserver.network.clientpackets.CannotMoveAnymoreInVehicle();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _boatId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _x:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _y:I
        24: aload_0
        25: aload_0
        26: invokevirtual #7                  // Method readD:()I
        29: putfield      #23                 // Field _z:I
        32: aload_0
        33: aload_0
        34: invokevirtual #7                  // Method readD:()I
        37: putfield      #26                 // Field _heading:I
        40: return
      LineNumberTable:
        line 35: 0
        line 36: 8
        line 37: 16
        line 38: 24
        line 39: 32
        line 40: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #29                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #33                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #35                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
        20: astore_2
        21: aload_2
        22: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.isInBoat:()Z
        25: ifeq          80
        28: aload_2
        29: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoat:()Lext/mods/gameserver/model/actor/Boat;
        32: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Boat.getObjectId:()I
        35: aload_0
        36: getfield      #13                 // Field _boatId:I
        39: if_icmpne     80
        42: aload_2
        43: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        46: aload_0
        47: getfield      #17                 // Field _x:I
        50: aload_0
        51: getfield      #20                 // Field _y:I
        54: aload_0
        55: getfield      #23                 // Field _z:I
        58: aload_0
        59: getfield      #26                 // Field _heading:I
        62: invokevirtual #64                 // Method ext/mods/gameserver/model/location/SpawnLocation.set:(IIII)V
        65: aload_2
        66: aload_0
        67: getfield      #13                 // Field _boatId:I
        70: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.stopMoveInVehicle:(I)V
        73: aload_1
        74: getstatic     #74                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        77: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        80: return
      LineNumberTable:
        line 45: 0
        line 46: 11
        line 47: 15
        line 49: 16
        line 51: 21
        line 53: 42
        line 54: 65
        line 55: 73
        line 57: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle;
           11      70     1 player   Lext/mods/gameserver/model/actor/Player;
           21      60     2  info   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/model/actor/container/player/BoatInfo ]
}
SourceFile: "CannotMoveAnymoreInVehicle.java"
