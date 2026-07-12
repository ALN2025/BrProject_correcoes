// Bytecode for: ext.mods.gameserver.model.actor.instance.Fence
// File: ext\mods\gameserver\model\actor\instance\Fence.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Fence.class
  Last modified 9 de jul de 2026; size 3127 bytes
  MD5 checksum 4401df700e49daab9f0b73ed9f2e48b2
  Compiled from "Fence.java"
public class ext.mods.gameserver.model.actor.instance.Fence extends ext.mods.gameserver.model.WorldObject implements ext.mods.gameserver.geoengine.geodata.IGeoObject
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/model/actor/instance/Fence
  super_class: #12                        // ext/mods/gameserver/model/WorldObject
  interfaces: 1, fields: 11, methods: 12, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
    #2 = Class              #4            // ext/mods/gameserver/idfactory/IdFactory
    #3 = NameAndType        #5:#6         // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
    #4 = Utf8               ext/mods/gameserver/idfactory/IdFactory
    #5 = Utf8               getInstance
    #6 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
    #7 = Methodref          #2.#8         // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
    #8 = NameAndType        #9:#10        // getNextId:()I
    #9 = Utf8               getNextId
   #10 = Utf8               ()I
   #11 = Methodref          #12.#13       // ext/mods/gameserver/model/WorldObject."<init>":(I)V
   #12 = Class              #14           // ext/mods/gameserver/model/WorldObject
   #13 = NameAndType        #15:#16       // "<init>":(I)V
   #14 = Utf8               ext/mods/gameserver/model/WorldObject
   #15 = Utf8               <init>
   #16 = Utf8               (I)V
   #17 = Fieldref           #18.#19       // ext/mods/gameserver/model/actor/instance/Fence._type:I
   #18 = Class              #20           // ext/mods/gameserver/model/actor/instance/Fence
   #19 = NameAndType        #21:#22       // _type:I
   #20 = Utf8               ext/mods/gameserver/model/actor/instance/Fence
   #21 = Utf8               _type
   #22 = Utf8               I
   #23 = Fieldref           #18.#24       // ext/mods/gameserver/model/actor/instance/Fence._sizeX:I
   #24 = NameAndType        #25:#22       // _sizeX:I
   #25 = Utf8               _sizeX
   #26 = Fieldref           #18.#27       // ext/mods/gameserver/model/actor/instance/Fence._sizeY:I
   #27 = NameAndType        #28:#22       // _sizeY:I
   #28 = Utf8               _sizeY
   #29 = Fieldref           #18.#30       // ext/mods/gameserver/model/actor/instance/Fence._height:I
   #30 = NameAndType        #31:#22       // _height:I
   #31 = Utf8               _height
   #32 = Class              #33           // ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence
   #33 = Utf8               ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence
   #34 = Methodref          #32.#35       // ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence."<init>":(Lext/mods/gameserver/model/actor/instance/Fence;Lext/mods/gameserver/model/actor/instance/Fence;)V
   #35 = NameAndType        #15:#36       // "<init>":(Lext/mods/gameserver/model/actor/instance/Fence;Lext/mods/gameserver/model/actor/instance/Fence;)V
   #36 = Utf8               (Lext/mods/gameserver/model/actor/instance/Fence;Lext/mods/gameserver/model/actor/instance/Fence;)V
   #37 = Fieldref           #18.#38       // ext/mods/gameserver/model/actor/instance/Fence._object2:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
   #38 = NameAndType        #39:#40       // _object2:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
   #39 = Utf8               _object2
   #40 = Utf8               Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
   #41 = Fieldref           #18.#42       // ext/mods/gameserver/model/actor/instance/Fence._object3:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
   #42 = NameAndType        #43:#40       // _object3:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
   #43 = Utf8               _object3
   #44 = Fieldref           #18.#45       // ext/mods/gameserver/model/actor/instance/Fence._geoX:I
   #45 = NameAndType        #46:#22       // _geoX:I
   #46 = Utf8               _geoX
   #47 = Fieldref           #18.#48       // ext/mods/gameserver/model/actor/instance/Fence._geoY:I
   #48 = NameAndType        #49:#22       // _geoY:I
   #49 = Utf8               _geoY
   #50 = Fieldref           #18.#51       // ext/mods/gameserver/model/actor/instance/Fence._geoZ:I
   #51 = NameAndType        #52:#22       // _geoZ:I
   #52 = Utf8               _geoZ
   #53 = Fieldref           #18.#54       // ext/mods/gameserver/model/actor/instance/Fence._geoData:[[B
   #54 = NameAndType        #55:#56       // _geoData:[[B
   #55 = Utf8               _geoData
   #56 = Utf8               [[B
   #57 = Methodref          #12.#58       // ext/mods/gameserver/model/WorldObject.onSpawn:()V
   #58 = NameAndType        #59:#60       // onSpawn:()V
   #59 = Utf8               onSpawn
   #60 = Utf8               ()V
   #61 = Methodref          #18.#62       // ext/mods/gameserver/model/actor/instance/Fence.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #62 = NameAndType        #63:#64       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #63 = Utf8               getPosition
   #64 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #65 = Methodref          #32.#66       // ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
   #66 = NameAndType        #67:#68       // spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
   #67 = Utf8               spawnMe
   #68 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
   #69 = Methodref          #32.#70       // ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence.decayMe:()V
   #70 = NameAndType        #71:#60       // decayMe:()V
   #71 = Utf8               decayMe
   #72 = Methodref          #12.#70       // ext/mods/gameserver/model/WorldObject.decayMe:()V
   #73 = Class              #74           // ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo
   #74 = Utf8               ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo
   #75 = Methodref          #18.#76       // ext/mods/gameserver/model/actor/instance/Fence.getObjectId:()I
   #76 = NameAndType        #77:#10       // getObjectId:()I
   #77 = Utf8               getObjectId
   #78 = Methodref          #73.#79       // ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo."<init>":(ILext/mods/gameserver/model/actor/instance/Fence;)V
   #79 = NameAndType        #15:#80       // "<init>":(ILext/mods/gameserver/model/actor/instance/Fence;)V
   #80 = Utf8               (ILext/mods/gameserver/model/actor/instance/Fence;)V
   #81 = Methodref          #82.#83       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #82 = Class              #84           // ext/mods/gameserver/model/actor/Player
   #83 = NameAndType        #85:#86       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #84 = Utf8               ext/mods/gameserver/model/actor/Player
   #85 = Utf8               sendPacket
   #86 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = Class              #88           // ext/mods/gameserver/geoengine/geodata/IGeoObject
   #88 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
   #89 = Utf8               FENCE_HEIGHT
   #90 = Utf8               ConstantValue
   #91 = Integer            24
   #92 = Utf8               (IIIIIII[[B)V
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               LocalVariableTable
   #96 = Utf8               this
   #97 = Utf8               Lext/mods/gameserver/model/actor/instance/Fence;
   #98 = Utf8               type
   #99 = Utf8               sizeZ
  #100 = Utf8               sizeY
  #101 = Utf8               height
  #102 = Utf8               geoX
  #103 = Utf8               geoY
  #104 = Utf8               geoZ
  #105 = Utf8               geoData
  #106 = Utf8               StackMapTable
  #107 = Class              #56           // "[[B"
  #108 = Utf8               getType
  #109 = Utf8               getSizeX
  #110 = Utf8               getSizeY
  #111 = Utf8               sendInfo
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #113 = Utf8               player
  #114 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #115 = Utf8               getGeoX
  #116 = Utf8               getGeoY
  #117 = Utf8               getGeoZ
  #118 = Utf8               getHeight
  #119 = Utf8               getObjectGeoData
  #120 = Utf8               ()[[B
  #121 = Utf8               SourceFile
  #122 = Utf8               Fence.java
  #123 = Utf8               NestMembers
  #124 = Utf8               InnerClasses
  #125 = Utf8               L2DummyFence
{
  public ext.mods.gameserver.model.actor.instance.Fence(int, int, int, int, int, int, int, byte[][]);
    descriptor: (IIIIIII[[B)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=9
         0: aload_0
         1: invokestatic  #1                  // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
         4: invokevirtual #7                  // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
         7: invokespecial #11                 // Method ext/mods/gameserver/model/WorldObject."<init>":(I)V
        10: aload_0
        11: iload_1
        12: putfield      #17                 // Field _type:I
        15: aload_0
        16: iload_2
        17: putfield      #23                 // Field _sizeX:I
        20: aload_0
        21: iload_3
        22: putfield      #26                 // Field _sizeY:I
        25: aload_0
        26: iload         4
        28: bipush        24
        30: imul
        31: putfield      #29                 // Field _height:I
        34: aload_0
        35: iload         4
        37: iconst_1
        38: if_icmple     53
        41: new           #32                 // class ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence
        44: dup
        45: aload_0
        46: aload_0
        47: invokespecial #34                 // Method ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence."<init>":(Lext/mods/gameserver/model/actor/instance/Fence;Lext/mods/gameserver/model/actor/instance/Fence;)V
        50: goto          54
        53: aconst_null
        54: putfield      #37                 // Field _object2:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
        57: aload_0
        58: iload         4
        60: iconst_2
        61: if_icmple     76
        64: new           #32                 // class ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence
        67: dup
        68: aload_0
        69: aload_0
        70: invokespecial #34                 // Method ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence."<init>":(Lext/mods/gameserver/model/actor/instance/Fence;Lext/mods/gameserver/model/actor/instance/Fence;)V
        73: goto          77
        76: aconst_null
        77: putfield      #41                 // Field _object3:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
        80: aload_0
        81: iload         5
        83: putfield      #44                 // Field _geoX:I
        86: aload_0
        87: iload         6
        89: putfield      #47                 // Field _geoY:I
        92: aload_0
        93: iload         7
        95: putfield      #50                 // Field _geoZ:I
        98: aload_0
        99: aload         8
       101: putfield      #53                 // Field _geoData:[[B
       104: return
      LineNumberTable:
        line 45: 0
        line 47: 10
        line 48: 15
        line 49: 20
        line 50: 25
        line 52: 34
        line 53: 57
        line 55: 80
        line 56: 86
        line 57: 92
        line 58: 98
        line 59: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     105     0  this   Lext/mods/gameserver/model/actor/instance/Fence;
            0     105     1  type   I
            0     105     2 sizeZ   I
            0     105     3 sizeY   I
            0     105     4 height   I
            0     105     5  geoX   I
            0     105     6  geoY   I
            0     105     7  geoZ   I
            0     105     8 geoData   [[B
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/actor/instance/Fence, int, int, int, int, int, int, int, class "[[B" ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Fence ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Fence, int, int, int, int, int, int, int, class "[[B" ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Fence, class ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence ]
        frame_type = 85 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/instance/Fence ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Fence, int, int, int, int, int, int, int, class "[[B" ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Fence, class ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence ]

  public int getType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _type:I
         4: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Fence;

  public int getSizeX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _sizeX:I
         4: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Fence;

  public int getSizeY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _sizeY:I
         4: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Fence;

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #57                 // Method ext/mods/gameserver/model/WorldObject.onSpawn:()V
         4: aload_0
         5: getfield      #37                 // Field _object2:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
         8: ifnull        22
        11: aload_0
        12: getfield      #37                 // Field _object2:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
        15: aload_0
        16: invokevirtual #61                 // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        19: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
        22: aload_0
        23: getfield      #41                 // Field _object3:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
        26: ifnull        40
        29: aload_0
        30: getfield      #41                 // Field _object3:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
        33: aload_0
        34: invokevirtual #61                 // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        37: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
        40: return
      LineNumberTable:
        line 79: 0
        line 81: 4
        line 82: 11
        line 83: 22
        line 84: 29
        line 85: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/instance/Fence;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 17 /* same */

  public void decayMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _object2:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
         4: ifnull        14
         7: aload_0
         8: getfield      #37                 // Field _object2:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
        11: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence.decayMe:()V
        14: aload_0
        15: getfield      #41                 // Field _object3:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
        18: ifnull        28
        21: aload_0
        22: getfield      #41                 // Field _object3:Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
        25: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence.decayMe:()V
        28: aload_0
        29: invokespecial #72                 // Method ext/mods/gameserver/model/WorldObject.decayMe:()V
        32: return
      LineNumberTable:
        line 90: 0
        line 91: 7
        line 92: 14
        line 93: 21
        line 95: 28
        line 96: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/instance/Fence;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 13 /* same */

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: new           #73                 // class ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo
         4: dup
         5: aload_0
         6: invokevirtual #75                 // Method getObjectId:()I
         9: aload_0
        10: invokespecial #78                 // Method ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo."<init>":(ILext/mods/gameserver/model/actor/instance/Fence;)V
        13: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        16: return
      LineNumberTable:
        line 101: 0
        line 102: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/instance/Fence;
            0      17     1 player   Lext/mods/gameserver/model/actor/Player;

  public int getGeoX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _geoX:I
         4: ireturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Fence;

  public int getGeoY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _geoY:I
         4: ireturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Fence;

  public int getGeoZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _geoZ:I
         4: ireturn
      LineNumberTable:
        line 119: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Fence;

  public int getHeight();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _height:I
         4: ireturn
      LineNumberTable:
        line 125: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Fence;

  public byte[][] getObjectGeoData();
    descriptor: ()[[B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _geoData:[[B
         4: areturn
      LineNumberTable:
        line 131: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Fence;
}
SourceFile: "Fence.java"
NestMembers:
  ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence
InnerClasses:
  protected #125= #32 of #18;             // L2DummyFence=class ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence of class ext/mods/gameserver/model/actor/instance/Fence
