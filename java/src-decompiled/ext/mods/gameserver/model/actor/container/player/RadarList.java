// Bytecode for: ext.mods.gameserver.model.actor.container.player.RadarList
// File: ext\mods\gameserver\model\actor\container\player\RadarList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/RadarList.class
  Last modified 9 de jul de 2026; size 2447 bytes
  MD5 checksum 2f8c7f2404b69df34ffe381372b28d5b
  Compiled from "RadarList.java"
public final class ext.mods.gameserver.model.actor.container.player.RadarList extends java.util.ArrayList<ext.mods.gameserver.model.location.RadarMarker>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/RadarList
  super_class: #2                         // java/util/ArrayList
  interfaces: 0, fields: 2, methods: 7, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // java/util/ArrayList."<init>":()V
    #2 = Class              #4            // java/util/ArrayList
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/ArrayList
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/player/RadarList._player:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/player/RadarList
    #9 = NameAndType        #11:#12       // _player:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/player/RadarList
   #11 = Utf8               _player
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/location/Location.getX:()I
   #14 = Class              #16           // ext/mods/gameserver/model/location/Location
   #15 = NameAndType        #17:#18       // getX:()I
   #16 = Utf8               ext/mods/gameserver/model/location/Location
   #17 = Utf8               getX
   #18 = Utf8               ()I
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/location/Location.getY:()I
   #20 = NameAndType        #21:#18       // getY:()I
   #21 = Utf8               getY
   #22 = Methodref          #14.#23       // ext/mods/gameserver/model/location/Location.getZ:()I
   #23 = NameAndType        #24:#18       // getZ:()I
   #24 = Utf8               getZ
   #25 = Methodref          #8.#26        // ext/mods/gameserver/model/actor/container/player/RadarList.addMarker:(III)V
   #26 = NameAndType        #27:#28       // addMarker:(III)V
   #27 = Utf8               addMarker
   #28 = Utf8               (III)V
   #29 = Class              #30           // ext/mods/gameserver/model/location/RadarMarker
   #30 = Utf8               ext/mods/gameserver/model/location/RadarMarker
   #31 = Methodref          #29.#32       // ext/mods/gameserver/model/location/RadarMarker."<init>":(III)V
   #32 = NameAndType        #5:#28        // "<init>":(III)V
   #33 = Methodref          #8.#34        // ext/mods/gameserver/model/actor/container/player/RadarList.add:(Ljava/lang/Object;)Z
   #34 = NameAndType        #35:#36       // add:(Ljava/lang/Object;)Z
   #35 = Utf8               add
   #36 = Utf8               (Ljava/lang/Object;)Z
   #37 = Class              #38           // ext/mods/gameserver/network/serverpackets/RadarControl
   #38 = Utf8               ext/mods/gameserver/network/serverpackets/RadarControl
   #39 = Methodref          #37.#40       // ext/mods/gameserver/network/serverpackets/RadarControl."<init>":(IIIII)V
   #40 = NameAndType        #5:#41        // "<init>":(IIIII)V
   #41 = Utf8               (IIIII)V
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #43 = Class              #45           // ext/mods/gameserver/model/actor/Player
   #44 = NameAndType        #46:#47       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #45 = Utf8               ext/mods/gameserver/model/actor/Player
   #46 = Utf8               sendPacket
   #47 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #48 = Methodref          #8.#49        // ext/mods/gameserver/model/actor/container/player/RadarList.removeMarker:(III)V
   #49 = NameAndType        #50:#28       // removeMarker:(III)V
   #50 = Utf8               removeMarker
   #51 = Methodref          #8.#52        // ext/mods/gameserver/model/actor/container/player/RadarList.remove:(Ljava/lang/Object;)Z
   #52 = NameAndType        #53:#36       // remove:(Ljava/lang/Object;)Z
   #53 = Utf8               remove
   #54 = Methodref          #43.#55       // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #55 = NameAndType        #56:#57       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #56 = Utf8               getPosition
   #57 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #58 = Methodref          #37.#59       // ext/mods/gameserver/network/serverpackets/RadarControl."<init>":(IILext/mods/gameserver/model/location/Location;)V
   #59 = NameAndType        #5:#60        // "<init>":(IILext/mods/gameserver/model/location/Location;)V
   #60 = Utf8               (IILext/mods/gameserver/model/location/Location;)V
   #61 = Methodref          #8.#62        // ext/mods/gameserver/model/actor/container/player/RadarList.iterator:()Ljava/util/Iterator;
   #62 = NameAndType        #63:#64       // iterator:()Ljava/util/Iterator;
   #63 = Utf8               iterator
   #64 = Utf8               ()Ljava/util/Iterator;
   #65 = InterfaceMethodref #66.#67       // java/util/Iterator.hasNext:()Z
   #66 = Class              #68           // java/util/Iterator
   #67 = NameAndType        #69:#70       // hasNext:()Z
   #68 = Utf8               java/util/Iterator
   #69 = Utf8               hasNext
   #70 = Utf8               ()Z
   #71 = InterfaceMethodref #66.#72       // java/util/Iterator.next:()Ljava/lang/Object;
   #72 = NameAndType        #73:#74       // next:()Ljava/lang/Object;
   #73 = Utf8               next
   #74 = Utf8               ()Ljava/lang/Object;
   #75 = Methodref          #8.#76        // ext/mods/gameserver/model/actor/container/player/RadarList.clear:()V
   #76 = NameAndType        #77:#6        // clear:()V
   #77 = Utf8               clear
   #78 = Utf8               serialVersionUID
   #79 = Utf8               J
   #80 = Utf8               ConstantValue
   #81 = Long               1l
   #83 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #84 = Utf8               Code
   #85 = Utf8               LineNumberTable
   #86 = Utf8               LocalVariableTable
   #87 = Utf8               this
   #88 = Utf8               Lext/mods/gameserver/model/actor/container/player/RadarList;
   #89 = Utf8               player
   #90 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #91 = Utf8               loc
   #92 = Utf8               Lext/mods/gameserver/model/location/Location;
   #93 = Utf8               x
   #94 = Utf8               I
   #95 = Utf8               y
   #96 = Utf8               z
   #97 = Utf8               loadMarkers
   #98 = Utf8               marker
   #99 = Utf8               Lext/mods/gameserver/model/location/RadarMarker;
  #100 = Utf8               StackMapTable
  #101 = Utf8               removeAllMarkers
  #102 = Utf8               Signature
  #103 = Utf8               Ljava/util/ArrayList<Lext/mods/gameserver/model/location/RadarMarker;>;
  #104 = Utf8               SourceFile
  #105 = Utf8               RadarList.java
{
  public ext.mods.gameserver.model.actor.container.player.RadarList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/ArrayList."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         9: return
      LineNumberTable:
        line 34: 0
        line 35: 4
        line 36: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/player/RadarList;
            0      10     1 player   Lext/mods/gameserver/model/actor/Player;

  public void addMarker(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #13                 // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #19                 // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #22                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: invokevirtual #25                 // Method addMarker:(III)V
        16: return
      LineNumberTable:
        line 44: 0
        line 45: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/container/player/RadarList;
            0      17     1   loc   Lext/mods/gameserver/model/location/Location;

  public void addMarker(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=4, args_size=4
         0: aload_0
         1: new           #29                 // class ext/mods/gameserver/model/location/RadarMarker
         4: dup
         5: iload_1
         6: iload_2
         7: iload_3
         8: invokespecial #31                 // Method ext/mods/gameserver/model/location/RadarMarker."<init>":(III)V
        11: invokevirtual #33                 // Method add:(Ljava/lang/Object;)Z
        14: pop
        15: aload_0
        16: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        19: new           #37                 // class ext/mods/gameserver/network/serverpackets/RadarControl
        22: dup
        23: iconst_2
        24: iconst_2
        25: iload_1
        26: iload_2
        27: iload_3
        28: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/RadarControl."<init>":(IIIII)V
        31: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: aload_0
        35: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        38: new           #37                 // class ext/mods/gameserver/network/serverpackets/RadarControl
        41: dup
        42: iconst_0
        43: iconst_1
        44: iload_1
        45: iload_2
        46: iload_3
        47: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/RadarControl."<init>":(IIIII)V
        50: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        53: return
      LineNumberTable:
        line 55: 0
        line 57: 15
        line 58: 34
        line 59: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/model/actor/container/player/RadarList;
            0      54     1     x   I
            0      54     2     y   I
            0      54     3     z   I

  public void removeMarker(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #13                 // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #19                 // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #22                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: invokevirtual #48                 // Method removeMarker:(III)V
        16: return
      LineNumberTable:
        line 67: 0
        line 68: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/container/player/RadarList;
            0      17     1   loc   Lext/mods/gameserver/model/location/Location;

  public void removeMarker(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=4, args_size=4
         0: aload_0
         1: new           #29                 // class ext/mods/gameserver/model/location/RadarMarker
         4: dup
         5: iload_1
         6: iload_2
         7: iload_3
         8: invokespecial #31                 // Method ext/mods/gameserver/model/location/RadarMarker."<init>":(III)V
        11: invokevirtual #51                 // Method remove:(Ljava/lang/Object;)Z
        14: pop
        15: aload_0
        16: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        19: new           #37                 // class ext/mods/gameserver/network/serverpackets/RadarControl
        22: dup
        23: iconst_1
        24: iconst_1
        25: iload_1
        26: iload_2
        27: iload_3
        28: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/RadarControl."<init>":(IIIII)V
        31: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: return
      LineNumberTable:
        line 78: 0
        line 80: 15
        line 81: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/container/player/RadarList;
            0      35     1     x   I
            0      35     2     y   I
            0      35     3     z   I

  public void loadMarkers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: new           #37                 // class ext/mods/gameserver/network/serverpackets/RadarControl
         7: dup
         8: iconst_2
         9: iconst_2
        10: aload_0
        11: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        17: invokespecial #58                 // Method ext/mods/gameserver/network/serverpackets/RadarControl."<init>":(IILext/mods/gameserver/model/location/Location;)V
        20: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        23: aload_0
        24: invokevirtual #61                 // Method iterator:()Ljava/util/Iterator;
        27: astore_1
        28: aload_1
        29: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        34: ifeq          67
        37: aload_1
        38: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        43: checkcast     #29                 // class ext/mods/gameserver/model/location/RadarMarker
        46: astore_2
        47: aload_0
        48: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        51: new           #37                 // class ext/mods/gameserver/network/serverpackets/RadarControl
        54: dup
        55: iconst_0
        56: iconst_1
        57: aload_2
        58: invokespecial #58                 // Method ext/mods/gameserver/network/serverpackets/RadarControl."<init>":(IILext/mods/gameserver/model/location/Location;)V
        61: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        64: goto          28
        67: return
      LineNumberTable:
        line 88: 0
        line 90: 23
        line 91: 47
        line 92: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47      17     2 marker   Lext/mods/gameserver/model/location/RadarMarker;
            0      68     0  this   Lext/mods/gameserver/model/actor/container/player/RadarList;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 38

  public void removeAllMarkers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #61                 // Method iterator:()Ljava/util/Iterator;
         4: astore_1
         5: aload_1
         6: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        11: ifeq          44
        14: aload_1
        15: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        20: checkcast     #29                 // class ext/mods/gameserver/model/location/RadarMarker
        23: astore_2
        24: aload_0
        25: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        28: new           #37                 // class ext/mods/gameserver/network/serverpackets/RadarControl
        31: dup
        32: iconst_2
        33: iconst_2
        34: aload_2
        35: invokespecial #58                 // Method ext/mods/gameserver/network/serverpackets/RadarControl."<init>":(IILext/mods/gameserver/model/location/Location;)V
        38: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        41: goto          5
        44: aload_0
        45: invokevirtual #75                 // Method clear:()V
        48: return
      LineNumberTable:
        line 99: 0
        line 100: 24
        line 102: 44
        line 103: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      17     2 marker   Lext/mods/gameserver/model/location/RadarMarker;
            0      49     0  this   Lext/mods/gameserver/model/actor/container/player/RadarList;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 5
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 38
}
Signature: #103                         // Ljava/util/ArrayList<Lext/mods/gameserver/model/location/RadarMarker;>;
SourceFile: "RadarList.java"
