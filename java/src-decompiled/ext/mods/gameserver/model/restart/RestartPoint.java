// Bytecode for: ext.mods.gameserver.model.restart.RestartPoint
// File: ext\mods\gameserver\model\restart\RestartPoint.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/restart/RestartPoint.class
  Last modified 9 de jul de 2026; size 3550 bytes
  MD5 checksum 54042c521cbe6f317f9bfbd1aaa3232b
  Compiled from "RestartPoint.java"
public class ext.mods.gameserver.model.restart.RestartPoint
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/restart/RestartPoint
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 10, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // name
    #8 = Utf8               name
    #9 = Methodref          #10.#11       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #10 = Class              #12           // ext/mods/commons/data/StatSet
   #11 = NameAndType        #13:#14       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #12 = Utf8               ext/mods/commons/data/StatSet
   #13 = Utf8               getString
   #14 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/model/restart/RestartPoint._name:Ljava/lang/String;
   #16 = Class              #18           // ext/mods/gameserver/model/restart/RestartPoint
   #17 = NameAndType        #19:#20       // _name:Ljava/lang/String;
   #18 = Utf8               ext/mods/gameserver/model/restart/RestartPoint
   #19 = Utf8               _name
   #20 = Utf8               Ljava/lang/String;
   #21 = String             #22           // points
   #22 = Utf8               points
   #23 = Methodref          #10.#24       // ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
   #24 = NameAndType        #25:#26       // getList:(Ljava/lang/String;)Ljava/util/List;
   #25 = Utf8               getList
   #26 = Utf8               (Ljava/lang/String;)Ljava/util/List;
   #27 = Fieldref           #16.#28       // ext/mods/gameserver/model/restart/RestartPoint._points:Ljava/util/List;
   #28 = NameAndType        #29:#30       // _points:Ljava/util/List;
   #29 = Utf8               _points
   #30 = Utf8               Ljava/util/List;
   #31 = String             #32           // chaoPoints
   #32 = Utf8               chaoPoints
   #33 = Fieldref           #16.#34       // ext/mods/gameserver/model/restart/RestartPoint._chaoPoints:Ljava/util/List;
   #34 = NameAndType        #35:#30       // _chaoPoints:Ljava/util/List;
   #35 = Utf8               _chaoPoints
   #36 = String             #37           // mapRegions
   #37 = Utf8               mapRegions
   #38 = Fieldref           #16.#39       // ext/mods/gameserver/model/restart/RestartPoint._mapRegions:Ljava/util/List;
   #39 = NameAndType        #40:#30       // _mapRegions:Ljava/util/List;
   #40 = Utf8               _mapRegions
   #41 = String             #42           // bbs
   #42 = Utf8               bbs
   #43 = Methodref          #10.#44       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #44 = NameAndType        #45:#46       // getInteger:(Ljava/lang/String;)I
   #45 = Utf8               getInteger
   #46 = Utf8               (Ljava/lang/String;)I
   #47 = Fieldref           #16.#48       // ext/mods/gameserver/model/restart/RestartPoint._bbs:I
   #48 = NameAndType        #49:#50       // _bbs:I
   #49 = Utf8               _bbs
   #50 = Utf8               I
   #51 = String             #52           // locName
   #52 = Utf8               locName
   #53 = Fieldref           #16.#54       // ext/mods/gameserver/model/restart/RestartPoint._locName:I
   #54 = NameAndType        #55:#50       // _locName:I
   #55 = Utf8               _locName
   #56 = String             #57           // bannedRace
   #57 = Utf8               bannedRace
   #58 = Methodref          #10.#59       // ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
   #59 = NameAndType        #60:#61       // containsKey:(Ljava/lang/Object;)Z
   #60 = Utf8               containsKey
   #61 = Utf8               (Ljava/lang/Object;)Z
   #62 = String             #63           // ;
   #63 = Utf8               ;
   #64 = Methodref          #65.#66       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #65 = Class              #67           // java/lang/String
   #66 = NameAndType        #68:#69       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #67 = Utf8               java/lang/String
   #68 = Utf8               split
   #69 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #70 = Class              #71           // ext/mods/gameserver/enums/actors/ClassRace
   #71 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
   #72 = Methodref          #73.#74       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #73 = Class              #75           // java/lang/Enum
   #74 = NameAndType        #76:#77       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #75 = Utf8               java/lang/Enum
   #76 = Utf8               valueOf
   #77 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #78 = Fieldref           #16.#79       // ext/mods/gameserver/model/restart/RestartPoint._bannedRace:Lext/mods/gameserver/enums/actors/ClassRace;
   #79 = NameAndType        #80:#81       // _bannedRace:Lext/mods/gameserver/enums/actors/ClassRace;
   #80 = Utf8               _bannedRace
   #81 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
   #82 = Fieldref           #16.#83       // ext/mods/gameserver/model/restart/RestartPoint._bannedPoint:Ljava/lang/String;
   #83 = NameAndType        #84:#20       // _bannedPoint:Ljava/lang/String;
   #84 = Utf8               _bannedPoint
   #85 = Methodref          #86.#87       // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
   #86 = Class              #88           // ext/mods/commons/random/Rnd
   #87 = NameAndType        #89:#90       // get:(Ljava/util/List;)Ljava/lang/Object;
   #88 = Utf8               ext/mods/commons/random/Rnd
   #89 = Utf8               get
   #90 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
   #91 = Class              #92           // ext/mods/gameserver/model/location/Location
   #92 = Utf8               ext/mods/gameserver/model/location/Location
   #93 = InterfaceMethodref #94.#95       // java/util/List.iterator:()Ljava/util/Iterator;
   #94 = Class              #96           // java/util/List
   #95 = NameAndType        #97:#98       // iterator:()Ljava/util/Iterator;
   #96 = Utf8               java/util/List
   #97 = Utf8               iterator
   #98 = Utf8               ()Ljava/util/Iterator;
   #99 = InterfaceMethodref #100.#101     // java/util/Iterator.hasNext:()Z
  #100 = Class              #102          // java/util/Iterator
  #101 = NameAndType        #103:#104     // hasNext:()Z
  #102 = Utf8               java/util/Iterator
  #103 = Utf8               hasNext
  #104 = Utf8               ()Z
  #105 = InterfaceMethodref #100.#106     // java/util/Iterator.next:()Ljava/lang/Object;
  #106 = NameAndType        #107:#108     // next:()Ljava/lang/Object;
  #107 = Utf8               next
  #108 = Utf8               ()Ljava/lang/Object;
  #109 = String             #110          // point
  #110 = Utf8               point
  #111 = Fieldref           #112.#113     // java/awt/Color.GREEN:Ljava/awt/Color;
  #112 = Class              #114          // java/awt/Color
  #113 = NameAndType        #115:#116     // GREEN:Ljava/awt/Color;
  #114 = Utf8               java/awt/Color
  #115 = Utf8               GREEN
  #116 = Utf8               Ljava/awt/Color;
  #117 = Methodref          #118.#119     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #118 = Class              #120          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #119 = NameAndType        #121:#122     // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #120 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #121 = Utf8               addPoint
  #122 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #123 = String             #124          // chaoPoint
  #124 = Utf8               chaoPoint
  #125 = Fieldref           #112.#126     // java/awt/Color.RED:Ljava/awt/Color;
  #126 = NameAndType        #127:#116     // RED:Ljava/awt/Color;
  #127 = Utf8               RED
  #128 = Utf8               Signature
  #129 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #130 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #131 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #132 = Utf8               Code
  #133 = Utf8               LineNumberTable
  #134 = Utf8               LocalVariableTable
  #135 = Utf8               parsedBanned
  #136 = Utf8               [Ljava/lang/String;
  #137 = Utf8               this
  #138 = Utf8               Lext/mods/gameserver/model/restart/RestartPoint;
  #139 = Utf8               set
  #140 = Utf8               Lext/mods/commons/data/StatSet;
  #141 = Utf8               StackMapTable
  #142 = Utf8               getName
  #143 = Utf8               ()Ljava/lang/String;
  #144 = Utf8               getRandomPoint
  #145 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #146 = Utf8               getRandomChaoPoint
  #147 = Utf8               getMapRegions
  #148 = Utf8               ()Ljava/util/List;
  #149 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #150 = Utf8               getBbs
  #151 = Utf8               ()I
  #152 = Utf8               getLocName
  #153 = Utf8               getBannedRace
  #154 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #155 = Utf8               getBannedPoint
  #156 = Utf8               visualizeZone
  #157 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #158 = Utf8               Lext/mods/gameserver/model/location/Location;
  #159 = Utf8               debug
  #160 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #161 = Utf8               SourceFile
  #162 = Utf8               RestartPoint.java
{
  public ext.mods.gameserver.model.restart.RestartPoint(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String name
         8: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        11: putfield      #15                 // Field _name:Ljava/lang/String;
        14: aload_0
        15: aload_1
        16: ldc           #21                 // String points
        18: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
        21: putfield      #27                 // Field _points:Ljava/util/List;
        24: aload_0
        25: aload_1
        26: ldc           #31                 // String chaoPoints
        28: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
        31: putfield      #33                 // Field _chaoPoints:Ljava/util/List;
        34: aload_0
        35: aload_1
        36: ldc           #36                 // String mapRegions
        38: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
        41: putfield      #38                 // Field _mapRegions:Ljava/util/List;
        44: aload_0
        45: aload_1
        46: ldc           #41                 // String bbs
        48: invokevirtual #43                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        51: putfield      #47                 // Field _bbs:I
        54: aload_0
        55: aload_1
        56: ldc           #51                 // String locName
        58: invokevirtual #43                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        61: putfield      #53                 // Field _locName:I
        64: aload_1
        65: ldc           #56                 // String bannedRace
        67: invokevirtual #58                 // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
        70: ifeq          107
        73: aload_1
        74: ldc           #56                 // String bannedRace
        76: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        79: ldc           #62                 // String ;
        81: invokevirtual #64                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        84: astore_2
        85: aload_0
        86: ldc           #70                 // class ext/mods/gameserver/enums/actors/ClassRace
        88: aload_2
        89: iconst_0
        90: aaload
        91: invokestatic  #72                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        94: checkcast     #70                 // class ext/mods/gameserver/enums/actors/ClassRace
        97: putfield      #78                 // Field _bannedRace:Lext/mods/gameserver/enums/actors/ClassRace;
       100: aload_0
       101: aload_2
       102: iconst_1
       103: aaload
       104: putfield      #82                 // Field _bannedPoint:Ljava/lang/String;
       107: return
      LineNumberTable:
        line 51: 0
        line 52: 4
        line 54: 14
        line 55: 24
        line 56: 34
        line 58: 44
        line 59: 54
        line 61: 64
        line 63: 73
        line 65: 85
        line 66: 100
        line 68: 107
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      22     2 parsedBanned   [Ljava/lang/String;
            0     108     0  this   Lext/mods/gameserver/model/restart/RestartPoint;
            0     108     1   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 107
          locals = [ class ext/mods/gameserver/model/restart/RestartPoint, class ext/mods/commons/data/StatSet ]
          stack = []

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/restart/RestartPoint;

  public ext.mods.gameserver.model.location.Location getRandomPoint();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _points:Ljava/util/List;
         4: invokestatic  #85                 // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
         7: checkcast     #91                 // class ext/mods/gameserver/model/location/Location
        10: areturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/restart/RestartPoint;

  public ext.mods.gameserver.model.location.Location getRandomChaoPoint();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _chaoPoints:Ljava/util/List;
         4: invokestatic  #85                 // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
         7: checkcast     #91                 // class ext/mods/gameserver/model/location/Location
        10: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/restart/RestartPoint;

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> getMapRegions();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _mapRegions:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/restart/RestartPoint;
    Signature: #149                         // ()Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;

  public int getBbs();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _bbs:I
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/restart/RestartPoint;

  public int getLocName();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _locName:I
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/restart/RestartPoint;

  public ext.mods.gameserver.enums.actors.ClassRace getBannedRace();
    descriptor: ()Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _bannedRace:Lext/mods/gameserver/enums/actors/ClassRace;
         4: areturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/restart/RestartPoint;

  public java.lang.String getBannedPoint();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #82                 // Field _bannedPoint:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/restart/RestartPoint;

  public void visualizeZone(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: getfield      #27                 // Field _points:Ljava/util/List;
         4: invokeinterface #93,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          43
        19: aload_2
        20: invokeinterface #105,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #91                 // class ext/mods/gameserver/model/location/Location
        28: astore_3
        29: aload_1
        30: ldc           #109                // String point
        32: getstatic     #111                // Field java/awt/Color.GREEN:Ljava/awt/Color;
        35: iconst_1
        36: aload_3
        37: invokevirtual #117                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
        40: goto          10
        43: aload_0
        44: getfield      #33                 // Field _chaoPoints:Ljava/util/List;
        47: invokeinterface #93,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        52: astore_2
        53: aload_2
        54: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        59: ifeq          86
        62: aload_2
        63: invokeinterface #105,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        68: checkcast     #91                 // class ext/mods/gameserver/model/location/Location
        71: astore_3
        72: aload_1
        73: ldc           #123                // String chaoPoint
        75: getstatic     #125                // Field java/awt/Color.RED:Ljava/awt/Color;
        78: iconst_1
        79: aload_3
        80: invokevirtual #117                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
        83: goto          53
        86: return
      LineNumberTable:
        line 112: 0
        line 113: 29
        line 115: 43
        line 116: 72
        line 117: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      11     3 point   Lext/mods/gameserver/model/location/Location;
           72      11     3 chaoPoint   Lext/mods/gameserver/model/location/Location;
            0      87     0  this   Lext/mods/gameserver/model/restart/RestartPoint;
            0      87     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32
}
SourceFile: "RestartPoint.java"
