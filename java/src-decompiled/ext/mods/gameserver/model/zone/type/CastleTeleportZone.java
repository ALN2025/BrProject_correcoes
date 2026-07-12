// Bytecode for: ext.mods.gameserver.model.zone.type.CastleTeleportZone
// File: ext\mods\gameserver\model\zone\type\CastleTeleportZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/CastleTeleportZone.class
  Last modified 9 de jul de 2026; size 2287 bytes
  MD5 checksum 4a142cebb15048b4e54408891f3da60b
  Compiled from "CastleTeleportZone.java"
public class ext.mods.gameserver.model.zone.type.CastleTeleportZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/CastleTeleportZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 2, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/zone/type/CastleTeleportZone._spawnLoc:[I
    #8 = Class              #10           // ext/mods/gameserver/model/zone/type/CastleTeleportZone
    #9 = NameAndType        #11:#12       // _spawnLoc:[I
   #10 = Utf8               ext/mods/gameserver/model/zone/type/CastleTeleportZone
   #11 = Utf8               _spawnLoc
   #12 = Utf8               [I
   #13 = String             #14           // castleId
   #14 = Utf8               castleId
   #15 = Methodref          #16.#17       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #16 = Class              #18           // java/lang/String
   #17 = NameAndType        #19:#20       // equals:(Ljava/lang/Object;)Z
   #18 = Utf8               java/lang/String
   #19 = Utf8               equals
   #20 = Utf8               (Ljava/lang/Object;)Z
   #21 = Methodref          #22.#23       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #22 = Class              #24           // java/lang/Integer
   #23 = NameAndType        #25:#26       // parseInt:(Ljava/lang/String;)I
   #24 = Utf8               java/lang/Integer
   #25 = Utf8               parseInt
   #26 = Utf8               (Ljava/lang/String;)I
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/zone/type/CastleTeleportZone._castleId:I
   #28 = NameAndType        #29:#30       // _castleId:I
   #29 = Utf8               _castleId
   #30 = Utf8               I
   #31 = String             #32           // spawnMinX
   #32 = Utf8               spawnMinX
   #33 = String             #34           // spawnMaxX
   #34 = Utf8               spawnMaxX
   #35 = String             #36           // spawnMinY
   #36 = Utf8               spawnMinY
   #37 = String             #38           // spawnMaxY
   #38 = Utf8               spawnMaxY
   #39 = String             #40           // spawnZ
   #40 = Utf8               spawnZ
   #41 = Methodref          #2.#42        // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #42 = NameAndType        #43:#44       // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #43 = Utf8               setParameter
   #44 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #45 = Fieldref           #46.#47       // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
   #46 = Class              #48           // ext/mods/gameserver/enums/ZoneId
   #47 = NameAndType        #49:#50       // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
   #48 = Utf8               ext/mods/gameserver/enums/ZoneId
   #49 = Utf8               NO_SUMMON_FRIEND
   #50 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #52 = Class              #54           // ext/mods/gameserver/model/actor/Creature
   #53 = NameAndType        #55:#56       // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #54 = Utf8               ext/mods/gameserver/model/actor/Creature
   #55 = Utf8               setInsideZone
   #56 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
   #57 = Class              #58           // ext/mods/gameserver/model/actor/Player
   #58 = Utf8               ext/mods/gameserver/model/actor/Player
   #59 = Methodref          #8.#60        // ext/mods/gameserver/model/zone/type/CastleTeleportZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
   #60 = NameAndType        #61:#62       // getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
   #61 = Utf8               getKnownTypeInside
   #62 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
   #63 = InterfaceMethodref #64.#65       // java/util/List.iterator:()Ljava/util/Iterator;
   #64 = Class              #66           // java/util/List
   #65 = NameAndType        #67:#68       // iterator:()Ljava/util/Iterator;
   #66 = Utf8               java/util/List
   #67 = Utf8               iterator
   #68 = Utf8               ()Ljava/util/Iterator;
   #69 = InterfaceMethodref #70.#71       // java/util/Iterator.hasNext:()Z
   #70 = Class              #72           // java/util/Iterator
   #71 = NameAndType        #73:#74       // hasNext:()Z
   #72 = Utf8               java/util/Iterator
   #73 = Utf8               hasNext
   #74 = Utf8               ()Z
   #75 = InterfaceMethodref #70.#76       // java/util/Iterator.next:()Ljava/lang/Object;
   #76 = NameAndType        #77:#78       // next:()Ljava/lang/Object;
   #77 = Utf8               next
   #78 = Utf8               ()Ljava/lang/Object;
   #79 = Methodref          #80.#81       // ext/mods/commons/random/Rnd.get:(II)I
   #80 = Class              #82           // ext/mods/commons/random/Rnd
   #81 = NameAndType        #83:#84       // get:(II)I
   #82 = Utf8               ext/mods/commons/random/Rnd
   #83 = Utf8               get
   #84 = Utf8               (II)I
   #85 = Methodref          #57.#86       // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
   #86 = NameAndType        #87:#88       // teleportTo:(IIII)Z
   #87 = Utf8               teleportTo
   #88 = Utf8               (IIII)Z
   #89 = Utf8               Code
   #90 = Utf8               LineNumberTable
   #91 = Utf8               LocalVariableTable
   #92 = Utf8               this
   #93 = Utf8               Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
   #94 = Utf8               id
   #95 = Utf8               name
   #96 = Utf8               Ljava/lang/String;
   #97 = Utf8               value
   #98 = Utf8               StackMapTable
   #99 = Utf8               onEnter
  #100 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #101 = Utf8               creature
  #102 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #103 = Utf8               onExit
  #104 = Utf8               oustAllPlayers
  #105 = Utf8               ()V
  #106 = Utf8               player
  #107 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #108 = Utf8               getCastleId
  #109 = Utf8               ()I
  #110 = Utf8               SourceFile
  #111 = Utf8               CastleTeleportZone.java
{
  public ext.mods.gameserver.model.zone.type.CastleTeleportZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: iconst_5
         7: newarray       int
         9: putfield      #7                  // Field _spawnLoc:[I
        12: return
      LineNumberTable:
        line 39: 0
        line 41: 5
        line 42: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
            0      13     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #13                 // String castleId
         3: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: putfield      #27                 // Field _castleId:I
        17: goto          136
        20: aload_1
        21: ldc           #31                 // String spawnMinX
        23: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        26: ifeq          42
        29: aload_0
        30: getfield      #7                  // Field _spawnLoc:[I
        33: iconst_0
        34: aload_2
        35: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        38: iastore
        39: goto          136
        42: aload_1
        43: ldc           #33                 // String spawnMaxX
        45: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        48: ifeq          64
        51: aload_0
        52: getfield      #7                  // Field _spawnLoc:[I
        55: iconst_1
        56: aload_2
        57: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        60: iastore
        61: goto          136
        64: aload_1
        65: ldc           #35                 // String spawnMinY
        67: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        70: ifeq          86
        73: aload_0
        74: getfield      #7                  // Field _spawnLoc:[I
        77: iconst_2
        78: aload_2
        79: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        82: iastore
        83: goto          136
        86: aload_1
        87: ldc           #37                 // String spawnMaxY
        89: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        92: ifeq          108
        95: aload_0
        96: getfield      #7                  // Field _spawnLoc:[I
        99: iconst_3
       100: aload_2
       101: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       104: iastore
       105: goto          136
       108: aload_1
       109: ldc           #39                 // String spawnZ
       111: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       114: ifeq          130
       117: aload_0
       118: getfield      #7                  // Field _spawnLoc:[I
       121: iconst_4
       122: aload_2
       123: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       126: iastore
       127: goto          136
       130: aload_0
       131: aload_1
       132: aload_2
       133: invokespecial #41                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
       136: return
      LineNumberTable:
        line 47: 0
        line 48: 9
        line 49: 20
        line 50: 29
        line 51: 42
        line 52: 51
        line 53: 64
        line 54: 73
        line 55: 86
        line 56: 95
        line 57: 108
        line 58: 117
        line 60: 130
        line 61: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     137     0  this   Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
            0     137     1  name   Ljava/lang/String;
            0     137     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 7
        frame_type = 20 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 5 /* same */

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: getstatic     #45                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_1
         5: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: return
      LineNumberTable:
        line 66: 0
        line 67: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
            0       9     1 creature   Lext/mods/gameserver/model/actor/Creature;

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: getstatic     #45                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: return
      LineNumberTable:
        line 72: 0
        line 73: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
            0       9     1 creature   Lext/mods/gameserver/model/actor/Creature;

  public void oustAllPlayers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: ldc           #57                 // class ext/mods/gameserver/model/actor/Player
         3: invokevirtual #59                 // Method getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
         6: invokeinterface #63,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        11: astore_1
        12: aload_1
        13: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          76
        21: aload_1
        22: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #57                 // class ext/mods/gameserver/model/actor/Player
        30: astore_2
        31: aload_2
        32: aload_0
        33: getfield      #7                  // Field _spawnLoc:[I
        36: iconst_0
        37: iaload
        38: aload_0
        39: getfield      #7                  // Field _spawnLoc:[I
        42: iconst_1
        43: iaload
        44: invokestatic  #79                 // Method ext/mods/commons/random/Rnd.get:(II)I
        47: aload_0
        48: getfield      #7                  // Field _spawnLoc:[I
        51: iconst_2
        52: iaload
        53: aload_0
        54: getfield      #7                  // Field _spawnLoc:[I
        57: iconst_3
        58: iaload
        59: invokestatic  #79                 // Method ext/mods/commons/random/Rnd.get:(II)I
        62: aload_0
        63: getfield      #7                  // Field _spawnLoc:[I
        66: iconst_4
        67: iaload
        68: iconst_0
        69: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        72: pop
        73: goto          12
        76: return
      LineNumberTable:
        line 77: 0
        line 78: 31
        line 79: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      42     2 player   Lext/mods/gameserver/model/actor/Player;
            0      77     0  this   Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 63

  public int getCastleId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _castleId:I
         4: ireturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/CastleTeleportZone;
}
SourceFile: "CastleTeleportZone.java"
