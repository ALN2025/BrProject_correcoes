// Bytecode for: ext.mods.gameserver.model.actor.container.player.BoatInfo
// File: ext\mods\gameserver\model\actor\container\player\BoatInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/BoatInfo.class
  Last modified 9 de jul de 2026; size 3279 bytes
  MD5 checksum 8b627816c3ec9af5d94090e99a03ad13
  Compiled from "BoatInfo.java"
public class ext.mods.gameserver.model.actor.container.player.BoatInfo
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/BoatInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 13, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/player/BoatInfo._isBoatMovement:Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/player/BoatInfo
    #9 = NameAndType        #11:#12       // _isBoatMovement:Z
   #10 = Utf8               ext/mods/gameserver/model/actor/container/player/BoatInfo
   #11 = Utf8               _isBoatMovement
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/container/player/BoatInfo._canBoard:Z
   #14 = NameAndType        #15:#12       // _canBoard:Z
   #15 = Utf8               _canBoard
   #16 = Class              #17           // ext/mods/gameserver/model/location/SpawnLocation
   #17 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #18 = Methodref          #16.#19       // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
   #19 = NameAndType        #5:#20        // "<init>":(IIII)V
   #20 = Utf8               (IIII)V
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/actor/container/player/BoatInfo._boatPosition:Lext/mods/gameserver/model/location/SpawnLocation;
   #22 = NameAndType        #23:#24       // _boatPosition:Lext/mods/gameserver/model/location/SpawnLocation;
   #23 = Utf8               _boatPosition
   #24 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/model/actor/container/player/BoatInfo._player:Lext/mods/gameserver/model/actor/Player;
   #26 = NameAndType        #27:#28       // _player:Lext/mods/gameserver/model/actor/Player;
   #27 = Utf8               _player
   #28 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #29 = Class              #30           // ext/mods/gameserver/network/serverpackets/StopMoveInVehicle
   #30 = Utf8               ext/mods/gameserver/network/serverpackets/StopMoveInVehicle
   #31 = Methodref          #29.#32       // ext/mods/gameserver/network/serverpackets/StopMoveInVehicle."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
   #32 = NameAndType        #5:#33        // "<init>":(Lext/mods/gameserver/model/actor/Player;I)V
   #33 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #34 = Methodref          #35.#36       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #35 = Class              #37           // ext/mods/gameserver/model/actor/Player
   #36 = NameAndType        #38:#39       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #37 = Utf8               ext/mods/gameserver/model/actor/Player
   #38 = Utf8               sendPacket
   #39 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #40 = Fieldref           #8.#41        // ext/mods/gameserver/model/actor/container/player/BoatInfo._boat:Lext/mods/gameserver/model/actor/Boat;
   #41 = NameAndType        #42:#43       // _boat:Lext/mods/gameserver/model/actor/Boat;
   #42 = Utf8               _boat
   #43 = Utf8               Lext/mods/gameserver/model/actor/Boat;
   #44 = Methodref          #45.#46       // ext/mods/gameserver/model/actor/Boat.getPassengers:()Ljava/util/Set;
   #45 = Class              #47           // ext/mods/gameserver/model/actor/Boat
   #46 = NameAndType        #48:#49       // getPassengers:()Ljava/util/Set;
   #47 = Utf8               ext/mods/gameserver/model/actor/Boat
   #48 = Utf8               getPassengers
   #49 = Utf8               ()Ljava/util/Set;
   #50 = InterfaceMethodref #51.#52       // java/util/Set.remove:(Ljava/lang/Object;)Z
   #51 = Class              #53           // java/util/Set
   #52 = NameAndType        #54:#55       // remove:(Ljava/lang/Object;)Z
   #53 = Utf8               java/util/Set
   #54 = Utf8               remove
   #55 = Utf8               (Ljava/lang/Object;)Z
   #56 = Methodref          #16.#57       // ext/mods/gameserver/model/location/SpawnLocation.clean:()V
   #57 = NameAndType        #58:#6        // clean:()V
   #58 = Utf8               clean
   #59 = Class              #60           // ext/mods/gameserver/network/serverpackets/GetOnVehicle
   #60 = Utf8               ext/mods/gameserver/network/serverpackets/GetOnVehicle
   #61 = Methodref          #59.#62       // ext/mods/gameserver/network/serverpackets/GetOnVehicle."<init>":(Lext/mods/gameserver/model/actor/container/player/BoatInfo;)V
   #62 = NameAndType        #5:#63        // "<init>":(Lext/mods/gameserver/model/actor/container/player/BoatInfo;)V
   #63 = Utf8               (Lext/mods/gameserver/model/actor/container/player/BoatInfo;)V
   #64 = Fieldref           #65.#66       // ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
   #65 = Class              #67           // ext/mods/gameserver/model/location/Location
   #66 = NameAndType        #68:#69       // DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
   #67 = Utf8               ext/mods/gameserver/model/location/Location
   #68 = Utf8               DUMMY_LOC
   #69 = Utf8               Lext/mods/gameserver/model/location/Location;
   #70 = Methodref          #45.#71       // ext/mods/gameserver/model/actor/Boat.getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
   #71 = NameAndType        #72:#73       // getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
   #72 = Utf8               getEngine
   #73 = Utf8               ()Lext/mods/gameserver/model/boat/BoatEngine;
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/boat/BoatEngine.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
   #75 = Class              #77           // ext/mods/gameserver/model/boat/BoatEngine
   #76 = NameAndType        #78:#79       // getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
   #77 = Utf8               ext/mods/gameserver/model/boat/BoatEngine
   #78 = Utf8               getDock
   #79 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatDock;
   #80 = Methodref          #81.#82       // ext/mods/gameserver/enums/boats/BoatDock.getOustLoc:()Lext/mods/gameserver/model/location/Location;
   #81 = Class              #83           // ext/mods/gameserver/enums/boats/BoatDock
   #82 = NameAndType        #84:#85       // getOustLoc:()Lext/mods/gameserver/model/location/Location;
   #83 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
   #84 = Utf8               getOustLoc
   #85 = Utf8               ()Lext/mods/gameserver/model/location/Location;
   #86 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #87 = Utf8               Code
   #88 = Utf8               LineNumberTable
   #89 = Utf8               LocalVariableTable
   #90 = Utf8               this
   #91 = Utf8               Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #92 = Utf8               player
   #93 = Utf8               getPlayer
   #94 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #95 = Utf8               stopMoveInVehicle
   #96 = Utf8               (I)V
   #97 = Utf8               boatId
   #98 = Utf8               I
   #99 = Utf8               isBoatMovement
  #100 = Utf8               ()Z
  #101 = Utf8               setBoatMovement
  #102 = Utf8               (Z)V
  #103 = Utf8               canBoard
  #104 = Utf8               setCanBoard
  #105 = Utf8               isInBoat
  #106 = Utf8               StackMapTable
  #107 = Utf8               getBoat
  #108 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
  #109 = Utf8               setBoat
  #110 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)V
  #111 = Utf8               boat
  #112 = Utf8               getBoatPosition
  #113 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #114 = Utf8               sendInfo
  #115 = Utf8               getDockLocation
  #116 = Utf8               engine
  #117 = Utf8               Lext/mods/gameserver/model/boat/BoatEngine;
  #118 = Utf8               SourceFile
  #119 = Utf8               BoatInfo.java
{
  public ext.mods.gameserver.model.actor.container.player.BoatInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _isBoatMovement:Z
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field _canBoard:Z
        14: aload_0
        15: new           #16                 // class ext/mods/gameserver/model/location/SpawnLocation
        18: dup
        19: iconst_0
        20: iconst_0
        21: iconst_0
        22: iconst_0
        23: invokespecial #18                 // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        26: putfield      #21                 // Field _boatPosition:Lext/mods/gameserver/model/location/SpawnLocation;
        29: aload_0
        30: aload_1
        31: putfield      #25                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        34: return
      LineNumberTable:
        line 40: 0
        line 34: 4
        line 35: 9
        line 37: 14
        line 41: 29
        line 42: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
            0      35     1 player   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;

  public void stopMoveInVehicle(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: new           #29                 // class ext/mods/gameserver/network/serverpackets/StopMoveInVehicle
         7: dup
         8: aload_0
         9: getfield      #25                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        12: iload_1
        13: invokespecial #31                 // Method ext/mods/gameserver/network/serverpackets/StopMoveInVehicle."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
        16: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        19: return
      LineNumberTable:
        line 51: 0
        line 52: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
            0      20     1 boatId   I

  public boolean isBoatMovement();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _isBoatMovement:Z
         4: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;

  public void setBoatMovement(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _isBoatMovement:Z
         5: return
      LineNumberTable:
        line 61: 0
        line 62: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
            0       6     1 isBoatMovement   Z

  public boolean canBoard();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _canBoard:Z
         4: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;

  public void setCanBoard(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _canBoard:Z
         5: return
      LineNumberTable:
        line 71: 0
        line 72: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
            0       6     1 canBoard   Z

  public boolean isInBoat();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.actor.Boat getBoat();
    descriptor: ()Lext/mods/gameserver/model/actor/Boat;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
         4: areturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;

  public void setBoat(ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/actor/Boat;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     35
         4: aload_0
         5: getfield      #40                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
         8: ifnull        35
        11: aload_0
        12: getfield      #40                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
        15: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Boat.getPassengers:()Ljava/util/Set;
        18: aload_0
        19: getfield      #25                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        22: invokeinterface #50,  2           // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        27: pop
        28: aload_0
        29: getfield      #21                 // Field _boatPosition:Lext/mods/gameserver/model/location/SpawnLocation;
        32: invokevirtual #56                 // Method ext/mods/gameserver/model/location/SpawnLocation.clean:()V
        35: aload_0
        36: aload_1
        37: putfield      #40                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
        40: return
      LineNumberTable:
        line 98: 0
        line 100: 11
        line 102: 28
        line 104: 35
        line 105: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
            0      41     1  boat   Lext/mods/gameserver/model/actor/Boat;
      StackMapTable: number_of_entries = 1
        frame_type = 35 /* same */

  public ext.mods.gameserver.model.location.SpawnLocation getBoatPosition();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _boatPosition:Lext/mods/gameserver/model/location/SpawnLocation;
         4: areturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #40                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
         4: ifnull        19
         7: aload_1
         8: new           #59                 // class ext/mods/gameserver/network/serverpackets/GetOnVehicle
        11: dup
        12: aload_0
        13: invokespecial #61                 // Method ext/mods/gameserver/network/serverpackets/GetOnVehicle."<init>":(Lext/mods/gameserver/model/actor/container/player/BoatInfo;)V
        16: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        19: return
      LineNumberTable:
        line 117: 0
        line 118: 7
        line 119: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
            0      20     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  public ext.mods.gameserver.model.location.Location getDockLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
         4: ifnonnull     11
         7: getstatic     #64                 // Field ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
        10: areturn
        11: aload_0
        12: getfield      #40                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
        15: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Boat.getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
        18: astore_1
        19: aload_1
        20: ifnonnull     27
        23: getstatic     #64                 // Field ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
        26: areturn
        27: aload_1
        28: invokevirtual #74                 // Method ext/mods/gameserver/model/boat/BoatEngine.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        31: invokevirtual #80                 // Method ext/mods/gameserver/enums/boats/BoatDock.getOustLoc:()Lext/mods/gameserver/model/location/Location;
        34: areturn
      LineNumberTable:
        line 126: 0
        line 127: 7
        line 129: 11
        line 130: 19
        line 131: 23
        line 133: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
           19      16     1 engine   Lext/mods/gameserver/model/boat/BoatEngine;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/boat/BoatEngine ]
}
SourceFile: "BoatInfo.java"
