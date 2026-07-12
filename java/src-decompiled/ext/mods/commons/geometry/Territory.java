// Bytecode for: ext.mods.commons.geometry.Territory
// File: ext\mods\commons\geometry\Territory.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/geometry/Territory.class
  Last modified 9 de jul de 2026; size 6430 bytes
  MD5 checksum 13822fc8725659b5b32721f0229a6b7b
  Compiled from "Territory.java"
public class ext.mods.commons.geometry.Territory
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #24                         // ext/mods/commons/geometry/Territory
  super_class: #30                        // java/lang/Object
  interfaces: 0, fields: 8, methods: 17, attributes: 1
Constant pool:
    #1 = String             #2            // name
    #2 = Utf8               name
    #3 = Methodref          #4.#5         // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #4 = Class              #6            // ext/mods/commons/data/StatSet
    #5 = NameAndType        #7:#8         // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #6 = Utf8               ext/mods/commons/data/StatSet
    #7 = Utf8               getString
    #8 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #9 = String             #10           // minZ
   #10 = Utf8               minZ
   #11 = Methodref          #4.#12        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #12 = NameAndType        #13:#14       // getInteger:(Ljava/lang/String;)I
   #13 = Utf8               getInteger
   #14 = Utf8               (Ljava/lang/String;)I
   #15 = String             #16           // maxZ
   #16 = Utf8               maxZ
   #17 = String             #18           // coords
   #18 = Utf8               coords
   #19 = Methodref          #4.#20        // ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
   #20 = NameAndType        #21:#22       // getList:(Ljava/lang/String;)Ljava/util/List;
   #21 = Utf8               getList
   #22 = Utf8               (Ljava/lang/String;)Ljava/util/List;
   #23 = Methodref          #24.#25       // ext/mods/commons/geometry/Territory."<init>":(Ljava/lang/String;IILjava/util/List;)V
   #24 = Class              #26           // ext/mods/commons/geometry/Territory
   #25 = NameAndType        #27:#28       // "<init>":(Ljava/lang/String;IILjava/util/List;)V
   #26 = Utf8               ext/mods/commons/geometry/Territory
   #27 = Utf8               <init>
   #28 = Utf8               (Ljava/lang/String;IILjava/util/List;)V
   #29 = Methodref          #30.#31       // java/lang/Object."<init>":()V
   #30 = Class              #32           // java/lang/Object
   #31 = NameAndType        #27:#33       // "<init>":()V
   #32 = Utf8               java/lang/Object
   #33 = Utf8               ()V
   #34 = InterfaceMethodref #35.#36       // java/util/List.size:()I
   #35 = Class              #37           // java/util/List
   #36 = NameAndType        #38:#39       // size:()I
   #37 = Utf8               java/util/List
   #38 = Utf8               size
   #39 = Utf8               ()I
   #40 = Class              #41           // ext/mods/commons/geometry/Polygon
   #41 = Utf8               ext/mods/commons/geometry/Polygon
   #42 = Methodref          #40.#43       // ext/mods/commons/geometry/Polygon."<init>":(Ljava/util/List;)V
   #43 = NameAndType        #27:#44       // "<init>":(Ljava/util/List;)V
   #44 = Utf8               (Ljava/util/List;)V
   #45 = Fieldref           #24.#46       // ext/mods/commons/geometry/Territory._shape:Lext/mods/commons/geometry/AShape;
   #46 = NameAndType        #47:#48       // _shape:Lext/mods/commons/geometry/AShape;
   #47 = Utf8               _shape
   #48 = Utf8               Lext/mods/commons/geometry/AShape;
   #49 = Class              #50           // ext/mods/commons/geometry/Triangle
   #50 = Utf8               ext/mods/commons/geometry/Triangle
   #51 = Methodref          #49.#43       // ext/mods/commons/geometry/Triangle."<init>":(Ljava/util/List;)V
   #52 = Class              #53           // ext/mods/commons/geometry/Rectangle
   #53 = Utf8               ext/mods/commons/geometry/Rectangle
   #54 = Methodref          #52.#43       // ext/mods/commons/geometry/Rectangle."<init>":(Ljava/util/List;)V
   #55 = Class              #56           // java/lang/IllegalArgumentException
   #56 = Utf8               java/lang/IllegalArgumentException
   #57 = String             #58           // Invalid number of coordinates for Territory
   #58 = Utf8               Invalid number of coordinates for Territory
   #59 = Methodref          #55.#60       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #60 = NameAndType        #27:#61       // "<init>":(Ljava/lang/String;)V
   #61 = Utf8               (Ljava/lang/String;)V
   #62 = Fieldref           #24.#63       // ext/mods/commons/geometry/Territory._name:Ljava/lang/String;
   #63 = NameAndType        #64:#65       // _name:Ljava/lang/String;
   #64 = Utf8               _name
   #65 = Utf8               Ljava/lang/String;
   #66 = Fieldref           #24.#67       // ext/mods/commons/geometry/Territory._minZ:I
   #67 = NameAndType        #68:#69       // _minZ:I
   #68 = Utf8               _minZ
   #69 = Utf8               I
   #70 = Fieldref           #24.#71       // ext/mods/commons/geometry/Territory._maxZ:I
   #71 = NameAndType        #72:#69       // _maxZ:I
   #72 = Utf8               _maxZ
   #73 = Fieldref           #24.#74       // ext/mods/commons/geometry/Territory._avgZ:I
   #74 = NameAndType        #75:#69       // _avgZ:I
   #75 = Utf8               _avgZ
   #76 = Methodref          #40.#77       // ext/mods/commons/geometry/Polygon."<init>":(Ljava/util/Set;)V
   #77 = NameAndType        #27:#78       // "<init>":(Ljava/util/Set;)V
   #78 = Utf8               (Ljava/util/Set;)V
   #79 = Methodref          #80.#81       // ext/mods/commons/geometry/AShape.isInside:(II)Z
   #80 = Class              #82           // ext/mods/commons/geometry/AShape
   #81 = NameAndType        #83:#84       // isInside:(II)Z
   #82 = Utf8               ext/mods/commons/geometry/AShape
   #83 = Utf8               isInside
   #84 = Utf8               (II)Z
   #85 = Methodref          #86.#87       // ext/mods/gameserver/model/location/Location.getX:()I
   #86 = Class              #88           // ext/mods/gameserver/model/location/Location
   #87 = NameAndType        #89:#39       // getX:()I
   #88 = Utf8               ext/mods/gameserver/model/location/Location
   #89 = Utf8               getX
   #90 = Methodref          #86.#91       // ext/mods/gameserver/model/location/Location.getY:()I
   #91 = NameAndType        #92:#39       // getY:()I
   #92 = Utf8               getY
   #93 = Methodref          #86.#94       // ext/mods/gameserver/model/location/Location.getZ:()I
   #94 = NameAndType        #95:#39       // getZ:()I
   #95 = Utf8               getZ
   #96 = Methodref          #24.#97       // ext/mods/commons/geometry/Territory.isInside:(III)Z
   #97 = NameAndType        #83:#98       // isInside:(III)Z
   #98 = Utf8               (III)Z
   #99 = Methodref          #100.#101     // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #100 = Class              #102          // ext/mods/gameserver/model/WorldObject
  #101 = NameAndType        #103:#104     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #102 = Utf8               ext/mods/gameserver/model/WorldObject
  #103 = Utf8               getPosition
  #104 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #105 = Methodref          #24.#106      // ext/mods/commons/geometry/Territory.isInside:(Lext/mods/gameserver/model/location/Location;)Z
  #106 = NameAndType        #83:#107      // isInside:(Lext/mods/gameserver/model/location/Location;)Z
  #107 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
  #108 = Fieldref           #109.#110     // ext/mods/Config.NPC_Z_INDEX:I
  #109 = Class              #111          // ext/mods/Config
  #110 = NameAndType        #112:#69      // NPC_Z_INDEX:I
  #111 = Utf8               ext/mods/Config
  #112 = Utf8               NPC_Z_INDEX
  #113 = Methodref          #114.#115     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #114 = Class              #116          // ext/mods/gameserver/geoengine/GeoEngine
  #115 = NameAndType        #117:#118     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #116 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #117 = Utf8               getInstance
  #118 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #119 = Methodref          #114.#120     // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #120 = NameAndType        #121:#122     // getHeight:(III)S
  #121 = Utf8               getHeight
  #122 = Utf8               (III)S
  #123 = Methodref          #80.#124      // ext/mods/commons/geometry/AShape.getRandomLocation:()Lext/mods/gameserver/model/location/Location;
  #124 = NameAndType        #125:#126     // getRandomLocation:()Lext/mods/gameserver/model/location/Location;
  #125 = Utf8               getRandomLocation
  #126 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #127 = Methodref          #24.#128      // ext/mods/commons/geometry/Territory.resolveGeoZ:(II)I
  #128 = NameAndType        #129:#130     // resolveGeoZ:(II)I
  #129 = Utf8               resolveGeoZ
  #130 = Utf8               (II)I
  #131 = Methodref          #86.#132      // ext/mods/gameserver/model/location/Location.setZ:(I)V
  #132 = NameAndType        #133:#134     // setZ:(I)V
  #133 = Utf8               setZ
  #134 = Utf8               (I)V
  #135 = Methodref          #114.#136     // ext/mods/gameserver/geoengine/GeoEngine.canMoveAround:(III)Z
  #136 = NameAndType        #137:#98      // canMoveAround:(III)Z
  #137 = Utf8               canMoveAround
  #138 = Class              #139          // ext/mods/gameserver/model/location/SpawnLocation
  #139 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #140 = Integer            65536
  #141 = Methodref          #142.#143     // ext/mods/commons/random/Rnd.get:(I)I
  #142 = Class              #144          // ext/mods/commons/random/Rnd
  #143 = NameAndType        #145:#146     // get:(I)I
  #144 = Utf8               ext/mods/commons/random/Rnd
  #145 = Utf8               get
  #146 = Utf8               (I)I
  #147 = Methodref          #138.#148     // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
  #148 = NameAndType        #27:#149      // "<init>":(IIII)V
  #149 = Utf8               (IIII)V
  #150 = Fieldref           #109.#151     // ext/mods/Config.DEVELOPER:Z
  #151 = NameAndType        #152:#153     // DEVELOPER:Z
  #152 = Utf8               DEVELOPER
  #153 = Utf8               Z
  #154 = Fieldref           #24.#155      // ext/mods/commons/geometry/Territory.LOGGER:Lext/mods/commons/logging/CLogger;
  #155 = NameAndType        #156:#157     // LOGGER:Lext/mods/commons/logging/CLogger;
  #156 = Utf8               LOGGER
  #157 = Utf8               Lext/mods/commons/logging/CLogger;
  #158 = String             #159          // Territory name \"{}\", wrong Z {}, wrong geo {}
  #159 = Utf8               Territory name \"{}\", wrong Z {}, wrong geo {}
  #160 = Methodref          #161.#162     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #161 = Class              #163          // java/lang/Integer
  #162 = NameAndType        #164:#165     // valueOf:(I)Ljava/lang/Integer;
  #163 = Utf8               java/lang/Integer
  #164 = Utf8               valueOf
  #165 = Utf8               (I)Ljava/lang/Integer;
  #166 = Methodref          #167.#168     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #167 = Class              #169          // ext/mods/commons/logging/CLogger
  #168 = NameAndType        #170:#171     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #169 = Utf8               ext/mods/commons/logging/CLogger
  #170 = Utf8               warn
  #171 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #172 = String             #173          // Territory name \"{}\", wrong Z {}, wrong geo {}, wrong ban {}
  #173 = Utf8               Territory name \"{}\", wrong Z {}, wrong geo {}, wrong ban {}
  #174 = Methodref          #80.#175      // ext/mods/commons/geometry/AShape.visualize3D:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
  #175 = NameAndType        #176:#177     // visualize3D:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
  #176 = Utf8               visualize3D
  #177 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
  #178 = Methodref          #179.#180     // java/lang/Class.getName:()Ljava/lang/String;
  #179 = Class              #181          // java/lang/Class
  #180 = NameAndType        #182:#183     // getName:()Ljava/lang/String;
  #181 = Utf8               java/lang/Class
  #182 = Utf8               getName
  #183 = Utf8               ()Ljava/lang/String;
  #184 = Methodref          #167.#60      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #185 = Utf8               MAX_ITERATIONS
  #186 = Utf8               ConstantValue
  #187 = Integer            90
  #188 = Utf8               MAX_ITERATIONS_BANNED
  #189 = Integer            120
  #190 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #191 = Utf8               Code
  #192 = Utf8               LineNumberTable
  #193 = Utf8               LocalVariableTable
  #194 = Utf8               this
  #195 = Utf8               Lext/mods/commons/geometry/Territory;
  #196 = Utf8               set
  #197 = Utf8               Lext/mods/commons/data/StatSet;
  #198 = Utf8               Ljava/util/List;
  #199 = Utf8               coordsNumber
  #200 = Utf8               LocalVariableTypeTable
  #201 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
  #202 = Utf8               StackMapTable
  #203 = Class              #204          // java/lang/String
  #204 = Utf8               java/lang/String
  #205 = Utf8               Signature
  #206 = Utf8               (Ljava/lang/String;IILjava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)V
  #207 = Utf8               (Ljava/lang/String;IILjava/util/Set;)V
  #208 = Utf8               shapes
  #209 = Utf8               Ljava/util/Set;
  #210 = Utf8               Ljava/util/Set<Lext/mods/commons/geometry/Triangle;>;
  #211 = Utf8               (Ljava/lang/String;IILjava/util/Set<Lext/mods/commons/geometry/Triangle;>;)V
  #212 = Utf8               getMinZ
  #213 = Utf8               getMaxZ
  #214 = Utf8               getAvgZ
  #215 = Utf8               getShape
  #216 = Utf8               ()Lext/mods/commons/geometry/AShape;
  #217 = Utf8               x
  #218 = Utf8               y
  #219 = Utf8               z
  #220 = Utf8               loc
  #221 = Utf8               Lext/mods/gameserver/model/location/Location;
  #222 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #223 = Utf8               object
  #224 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #225 = Utf8               ref
  #226 = Utf8               bias
  #227 = Class              #228          // "[I"
  #228 = Utf8               [I
  #229 = Utf8               getRandomGeoLocation
  #230 = Utf8               i
  #231 = Utf8               failedZ
  #232 = Utf8               failedGeo
  #233 = Utf8               (Lext/mods/commons/geometry/Territory;)Lext/mods/gameserver/model/location/SpawnLocation;
  #234 = Utf8               bannedTerritory
  #235 = Utf8               failedBan
  #236 = Utf8               maxIter
  #237 = Utf8               visualize
  #238 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #239 = Utf8               debug
  #240 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #241 = Utf8               <clinit>
  #242 = Utf8               SourceFile
  #243 = Utf8               Territory.java
{
  public ext.mods.commons.geometry.Territory(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #1                  // String name
         4: aconst_null
         5: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         8: aload_1
         9: ldc           #9                  // String minZ
        11: invokevirtual #11                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        14: aload_1
        15: ldc           #15                 // String maxZ
        17: invokevirtual #11                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        20: aload_1
        21: ldc           #17                 // String coords
        23: invokevirtual #19                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
        26: invokespecial #23                 // Method "<init>":(Ljava/lang/String;IILjava/util/List;)V
        29: return
      LineNumberTable:
        line 57: 0
        line 58: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/commons/geometry/Territory;
            0      30     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.commons.geometry.Territory(java.lang.String, int, int, java.util.List<ext.mods.gameserver.model.location.Point2D>);
    descriptor: (Ljava/lang/String;IILjava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=5
         0: aload_0
         1: invokespecial #29                 // Method java/lang/Object."<init>":()V
         4: aload         4
         6: invokeinterface #34,  1           // InterfaceMethod java/util/List.size:()I
        11: istore        5
        13: iload         5
        15: iconst_4
        16: if_icmplt     35
        19: aload_0
        20: new           #40                 // class ext/mods/commons/geometry/Polygon
        23: dup
        24: aload         4
        26: invokespecial #42                 // Method ext/mods/commons/geometry/Polygon."<init>":(Ljava/util/List;)V
        29: putfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
        32: goto          89
        35: iload         5
        37: iconst_3
        38: if_icmpne     57
        41: aload_0
        42: new           #49                 // class ext/mods/commons/geometry/Triangle
        45: dup
        46: aload         4
        48: invokespecial #51                 // Method ext/mods/commons/geometry/Triangle."<init>":(Ljava/util/List;)V
        51: putfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
        54: goto          89
        57: iload         5
        59: iconst_2
        60: if_icmpne     79
        63: aload_0
        64: new           #52                 // class ext/mods/commons/geometry/Rectangle
        67: dup
        68: aload         4
        70: invokespecial #54                 // Method ext/mods/commons/geometry/Rectangle."<init>":(Ljava/util/List;)V
        73: putfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
        76: goto          89
        79: new           #55                 // class java/lang/IllegalArgumentException
        82: dup
        83: ldc           #57                 // String Invalid number of coordinates for Territory
        85: invokespecial #59                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        88: athrow
        89: aload_0
        90: aload_1
        91: putfield      #62                 // Field _name:Ljava/lang/String;
        94: aload_0
        95: iload_2
        96: putfield      #66                 // Field _minZ:I
        99: aload_0
       100: iload_3
       101: putfield      #70                 // Field _maxZ:I
       104: aload_0
       105: aload_0
       106: getfield      #66                 // Field _minZ:I
       109: aload_0
       110: getfield      #70                 // Field _maxZ:I
       113: iadd
       114: iconst_2
       115: idiv
       116: putfield      #73                 // Field _avgZ:I
       119: return
      LineNumberTable:
        line 61: 0
        line 62: 4
        line 63: 13
        line 64: 19
        line 65: 35
        line 66: 41
        line 67: 57
        line 68: 63
        line 70: 79
        line 72: 89
        line 74: 94
        line 75: 99
        line 76: 104
        line 77: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     120     0  this   Lext/mods/commons/geometry/Territory;
            0     120     1  name   Ljava/lang/String;
            0     120     2  minZ   I
            0     120     3  maxZ   I
            0     120     4 coords   Ljava/util/List;
           13     107     5 coordsNumber   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     120     4 coords   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/commons/geometry/Territory, class java/lang/String, int, int, class java/util/List, int ]
          stack = []
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 9 /* same */
    Signature: #206                         // (Ljava/lang/String;IILjava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)V

  public ext.mods.commons.geometry.Territory(java.lang.String, int, int, java.util.Set<ext.mods.commons.geometry.Triangle>);
    descriptor: (Ljava/lang/String;IILjava/util/Set;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: invokespecial #29                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #40                 // class ext/mods/commons/geometry/Polygon
         8: dup
         9: aload         4
        11: invokespecial #76                 // Method ext/mods/commons/geometry/Polygon."<init>":(Ljava/util/Set;)V
        14: putfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
        17: aload_0
        18: aload_1
        19: putfield      #62                 // Field _name:Ljava/lang/String;
        22: aload_0
        23: iload_2
        24: putfield      #66                 // Field _minZ:I
        27: aload_0
        28: iload_3
        29: putfield      #70                 // Field _maxZ:I
        32: aload_0
        33: aload_0
        34: getfield      #66                 // Field _minZ:I
        37: aload_0
        38: getfield      #70                 // Field _maxZ:I
        41: iadd
        42: iconst_2
        43: idiv
        44: putfield      #73                 // Field _avgZ:I
        47: return
      LineNumberTable:
        line 80: 0
        line 81: 4
        line 83: 17
        line 85: 22
        line 86: 27
        line 87: 32
        line 88: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/commons/geometry/Territory;
            0      48     1  name   Ljava/lang/String;
            0      48     2  minZ   I
            0      48     3  maxZ   I
            0      48     4 shapes   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      48     4 shapes   Ljava/util/Set<Lext/mods/commons/geometry/Triangle;>;
    Signature: #211                         // (Ljava/lang/String;IILjava/util/Set<Lext/mods/commons/geometry/Triangle;>;)V

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/Territory;

  public final int getMinZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #66                 // Field _minZ:I
         4: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/Territory;

  public final int getMaxZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #70                 // Field _maxZ:I
         4: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/Territory;

  public final int getAvgZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _avgZ:I
         4: ireturn
      LineNumberTable:
        line 119: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/Territory;

  public final ext.mods.commons.geometry.AShape getShape();
    descriptor: ()Lext/mods/commons/geometry/AShape;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
         4: areturn
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/Territory;

  public boolean isInside(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
         4: iload_1
         5: iload_2
         6: invokevirtual #79                 // Method ext/mods/commons/geometry/AShape.isInside:(II)Z
         9: ireturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/geometry/Territory;
            0      10     1     x   I
            0      10     2     y   I

  public boolean isInside(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: iload_3
         1: aload_0
         2: getfield      #66                 // Field _minZ:I
         5: if_icmplt     16
         8: iload_3
         9: aload_0
        10: getfield      #70                 // Field _maxZ:I
        13: if_icmple     18
        16: iconst_0
        17: ireturn
        18: aload_0
        19: getfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
        22: iload_1
        23: iload_2
        24: invokevirtual #79                 // Method ext/mods/commons/geometry/AShape.isInside:(II)Z
        27: ireturn
      LineNumberTable:
        line 148: 0
        line 149: 16
        line 151: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/commons/geometry/Territory;
            0      28     1     x   I
            0      28     2     y   I
            0      28     3     z   I
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 1 /* same */

  public boolean isInside(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: ifnull        27
         4: aload_0
         5: aload_1
         6: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
         9: aload_1
        10: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
        13: aload_1
        14: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        17: invokevirtual #96                 // Method isInside:(III)Z
        20: ifeq          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 156: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/commons/geometry/Territory;
            0      29     1   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isInside(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        19
         4: aload_0
         5: aload_1
         6: invokevirtual #99                 // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         9: invokevirtual #105                // Method isInside:(Lext/mods/gameserver/model/location/Location;)Z
        12: ifeq          19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
      LineNumberTable:
        line 161: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/geometry/Territory;
            0      21     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.location.SpawnLocation getRandomGeoLocation();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=1
         0: aconst_null
         1: astore_1
         2: iconst_0
         3: istore_2
         4: iconst_0
         5: istore_3
         6: iconst_0
         7: istore        4
         9: iload         4
        11: bipush        90
        13: if_icmpge     126
        16: aload_0
        17: getfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
        20: invokevirtual #123                // Method ext/mods/commons/geometry/AShape.getRandomLocation:()Lext/mods/gameserver/model/location/Location;
        23: astore_1
        24: aload_1
        25: aload_0
        26: aload_1
        27: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
        30: aload_1
        31: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
        34: invokevirtual #127                // Method resolveGeoZ:(II)I
        37: invokevirtual #131                // Method ext/mods/gameserver/model/location/Location.setZ:(I)V
        40: aload_1
        41: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        44: aload_0
        45: getfield      #66                 // Field _minZ:I
        48: if_icmplt     62
        51: aload_1
        52: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        55: aload_0
        56: getfield      #70                 // Field _maxZ:I
        59: if_icmple     68
        62: iinc          2, 1
        65: goto          120
        68: invokestatic  #113                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        71: aload_1
        72: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
        75: aload_1
        76: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
        79: aload_1
        80: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        83: invokevirtual #135                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveAround:(III)Z
        86: ifne          95
        89: iinc          3, 1
        92: goto          120
        95: new           #138                // class ext/mods/gameserver/model/location/SpawnLocation
        98: dup
        99: aload_1
       100: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
       103: aload_1
       104: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
       107: aload_1
       108: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
       111: ldc           #140                // int 65536
       113: invokestatic  #141                // Method ext/mods/commons/random/Rnd.get:(I)I
       116: invokespecial #147                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
       119: areturn
       120: iinc          4, 1
       123: goto          9
       126: getstatic     #150                // Field ext/mods/Config.DEVELOPER:Z
       129: ifeq          165
       132: getstatic     #154                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       135: ldc           #158                // String Territory name \"{}\", wrong Z {}, wrong geo {}
       137: iconst_3
       138: anewarray     #30                 // class java/lang/Object
       141: dup
       142: iconst_0
       143: aload_0
       144: getfield      #62                 // Field _name:Ljava/lang/String;
       147: aastore
       148: dup
       149: iconst_1
       150: iload_2
       151: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       154: aastore
       155: dup
       156: iconst_2
       157: iload_3
       158: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       161: aastore
       162: invokevirtual #166                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       165: aload_1
       166: ifnonnull     173
       169: aconst_null
       170: goto          197
       173: new           #138                // class ext/mods/gameserver/model/location/SpawnLocation
       176: dup
       177: aload_1
       178: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
       181: aload_1
       182: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
       185: aload_1
       186: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
       189: ldc           #140                // int 65536
       191: invokestatic  #141                // Method ext/mods/commons/random/Rnd.get:(I)I
       194: invokespecial #147                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
       197: areturn
      LineNumberTable:
        line 181: 0
        line 183: 2
        line 184: 4
        line 186: 6
        line 188: 16
        line 189: 24
        line 191: 40
        line 193: 62
        line 194: 65
        line 197: 68
        line 199: 89
        line 200: 92
        line 203: 95
        line 186: 120
        line 206: 126
        line 207: 132
        line 209: 165
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9     117     4     i   I
            0     198     0  this   Lext/mods/commons/geometry/Territory;
            2     196     1   loc   Lext/mods/gameserver/model/location/Location;
            4     194     2 failedZ   I
            6     192     3 failedGeo   I
      StackMapTable: number_of_entries = 9
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/commons/geometry/Territory, class ext/mods/gameserver/model/location/Location, int, int, int ]
          stack = []
        frame_type = 52 /* same */
        frame_type = 5 /* same */
        frame_type = 26 /* same */
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 38 /* same */
        frame_type = 7 /* same */
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/SpawnLocation ]

  public ext.mods.gameserver.model.location.SpawnLocation getRandomGeoLocation(ext.mods.commons.geometry.Territory);
    descriptor: (Lext/mods/commons/geometry/Territory;)Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=2
         0: aconst_null
         1: astore_2
         2: iconst_0
         3: istore_3
         4: iconst_0
         5: istore        4
         7: iconst_0
         8: istore        5
        10: aload_1
        11: ifnull        19
        14: bipush        120
        16: goto          21
        19: bipush        90
        21: istore        6
        23: iconst_0
        24: istore        7
        26: iload         7
        28: iload         6
        30: if_icmpge     161
        33: aload_0
        34: getfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
        37: invokevirtual #123                // Method ext/mods/commons/geometry/AShape.getRandomLocation:()Lext/mods/gameserver/model/location/Location;
        40: astore_2
        41: aload_2
        42: aload_0
        43: aload_2
        44: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
        47: aload_2
        48: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
        51: invokevirtual #127                // Method resolveGeoZ:(II)I
        54: invokevirtual #131                // Method ext/mods/gameserver/model/location/Location.setZ:(I)V
        57: aload_1
        58: ifnull        75
        61: aload_1
        62: aload_2
        63: invokevirtual #105                // Method isInside:(Lext/mods/gameserver/model/location/Location;)Z
        66: ifeq          75
        69: iinc          5, 1
        72: goto          155
        75: aload_2
        76: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        79: aload_0
        80: getfield      #66                 // Field _minZ:I
        83: if_icmplt     97
        86: aload_2
        87: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        90: aload_0
        91: getfield      #70                 // Field _maxZ:I
        94: if_icmple     103
        97: iinc          3, 1
       100: goto          155
       103: invokestatic  #113                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       106: aload_2
       107: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
       110: aload_2
       111: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
       114: aload_2
       115: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
       118: invokevirtual #135                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveAround:(III)Z
       121: ifne          130
       124: iinc          4, 1
       127: goto          155
       130: new           #138                // class ext/mods/gameserver/model/location/SpawnLocation
       133: dup
       134: aload_2
       135: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
       138: aload_2
       139: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
       142: aload_2
       143: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
       146: ldc           #140                // int 65536
       148: invokestatic  #141                // Method ext/mods/commons/random/Rnd.get:(I)I
       151: invokespecial #147                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
       154: areturn
       155: iinc          7, 1
       158: goto          26
       161: getstatic     #150                // Field ext/mods/Config.DEVELOPER:Z
       164: ifeq          209
       167: getstatic     #154                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       170: ldc           #172                // String Territory name \"{}\", wrong Z {}, wrong geo {}, wrong ban {}
       172: iconst_4
       173: anewarray     #30                 // class java/lang/Object
       176: dup
       177: iconst_0
       178: aload_0
       179: getfield      #62                 // Field _name:Ljava/lang/String;
       182: aastore
       183: dup
       184: iconst_1
       185: iload_3
       186: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       189: aastore
       190: dup
       191: iconst_2
       192: iload         4
       194: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       197: aastore
       198: dup
       199: iconst_3
       200: iload         5
       202: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       205: aastore
       206: invokevirtual #166                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       209: aload_2
       210: ifnonnull     217
       213: aconst_null
       214: goto          241
       217: new           #138                // class ext/mods/gameserver/model/location/SpawnLocation
       220: dup
       221: aload_2
       222: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getX:()I
       225: aload_2
       226: invokevirtual #90                 // Method ext/mods/gameserver/model/location/Location.getY:()I
       229: aload_2
       230: invokevirtual #93                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
       233: ldc           #140                // int 65536
       235: invokestatic  #141                // Method ext/mods/commons/random/Rnd.get:(I)I
       238: invokespecial #147                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
       241: areturn
      LineNumberTable:
        line 218: 0
        line 220: 2
        line 221: 4
        line 222: 7
        line 223: 10
        line 225: 23
        line 227: 33
        line 228: 41
        line 230: 57
        line 232: 69
        line 233: 72
        line 236: 75
        line 238: 97
        line 239: 100
        line 242: 103
        line 244: 124
        line 245: 127
        line 248: 130
        line 225: 155
        line 251: 161
        line 252: 167
        line 254: 209
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26     135     7     i   I
            0     242     0  this   Lext/mods/commons/geometry/Territory;
            0     242     1 bannedTerritory   Lext/mods/commons/geometry/Territory;
            2     240     2   loc   Lext/mods/gameserver/model/location/Location;
            4     238     3 failedZ   I
            7     235     4 failedGeo   I
           10     232     5 failedBan   I
           23     219     6 maxIter   I
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/commons/geometry/Territory, class ext/mods/commons/geometry/Territory, class ext/mods/gameserver/model/location/Location, int, int, int ]
          stack = []
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 4
          locals = [ int, int ]
        frame_type = 48 /* same */
        frame_type = 21 /* same */
        frame_type = 5 /* same */
        frame_type = 26 /* same */
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 47 /* same */
        frame_type = 7 /* same */
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/SpawnLocation ]

  public void visualize(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getfield      #45                 // Field _shape:Lext/mods/commons/geometry/AShape;
         4: aload_0
         5: getfield      #62                 // Field _name:Ljava/lang/String;
         8: aload_1
         9: aload_0
        10: getfield      #66                 // Field _minZ:I
        13: aload_0
        14: getfield      #70                 // Field _maxZ:I
        17: invokevirtual #174                // Method ext/mods/commons/geometry/AShape.visualize3D:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
        20: return
      LineNumberTable:
        line 259: 0
        line 260: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/geometry/Territory;
            0      21     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #167                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #24                 // class ext/mods/commons/geometry/Territory
         6: invokevirtual #178                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #184                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #154                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "Territory.java"
