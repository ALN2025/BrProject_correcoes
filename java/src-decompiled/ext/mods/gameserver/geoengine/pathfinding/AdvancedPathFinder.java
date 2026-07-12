// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.AdvancedPathFinder
// File: ext\mods\gameserver\geoengine\pathfinding\AdvancedPathFinder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder.class
  Last modified 9 de jul de 2026; size 5649 bytes
  MD5 checksum a2e63f0f18fc8b5482c19e9a1a73b461
  Compiled from "AdvancedPathFinder.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.AdvancedPathFinder
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #10 = Class              #9            // ext/mods/gameserver/geoengine/GeoEngine
   #11 = Utf8               Companion
   #12 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #13 = NameAndType        #11:#12       // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #14 = Fieldref           #10.#13       // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #15 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
   #16 = Class              #15           // ext/mods/gameserver/geoengine/GeoEngine$Companion
   #17 = Utf8               getInstance
   #18 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #19 = NameAndType        #17:#18       // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #20 = Methodref          #16.#19       // ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #21 = Utf8               geoEngine
   #22 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #23 = NameAndType        #21:#22       // geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #24 = Fieldref           #2.#23        // ext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #25 = Utf8               this
   #26 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder;
   #27 = Utf8               findPath
   #28 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #29 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
   #30 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #31 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #32 = Utf8               kotlin/collections/CollectionsKt
   #33 = Class              #32           // kotlin/collections/CollectionsKt
   #34 = Utf8               emptyList
   #35 = Utf8               ()Ljava/util/List;
   #36 = NameAndType        #34:#35       // emptyList:()Ljava/util/List;
   #37 = Methodref          #33.#36       // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
   #38 = Utf8               ext/mods/gameserver/model/actor/Creature
   #39 = Class              #38           // ext/mods/gameserver/model/actor/Creature
   #40 = Utf8               getX
   #41 = Utf8               ()I
   #42 = NameAndType        #40:#41       // getX:()I
   #43 = Methodref          #39.#42       // ext/mods/gameserver/model/actor/Creature.getX:()I
   #44 = Utf8               getY
   #45 = NameAndType        #44:#41       // getY:()I
   #46 = Methodref          #39.#45       // ext/mods/gameserver/model/actor/Creature.getY:()I
   #47 = Utf8               getZ
   #48 = NameAndType        #47:#41       // getZ:()I
   #49 = Methodref          #39.#48       // ext/mods/gameserver/model/actor/Creature.getZ:()I
   #50 = Utf8               ext/mods/gameserver/geoengine/PeaceZoneCollisionManager
   #51 = Class              #50           // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager
   #52 = Utf8               INSTANCE
   #53 = Utf8               Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
   #54 = NameAndType        #52:#53       // INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
   #55 = Fieldref           #51.#54       // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
   #56 = Utf8               canIgnoreCreatureCollision
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #58 = NameAndType        #56:#57       // canIgnoreCreatureCollision:(Lext/mods/gameserver/model/actor/Creature;)Z
   #59 = Methodref          #51.#58       // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.canIgnoreCreatureCollision:(Lext/mods/gameserver/model/actor/Creature;)Z
   #60 = Utf8               findSimplifiedPath
   #61 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #62 = NameAndType        #60:#61       // findSimplifiedPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #63 = Methodref          #2.#62        // ext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder.findSimplifiedPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #64 = Utf8               ext/mods/gameserver/model/actor/Playable
   #65 = Class              #64           // ext/mods/gameserver/model/actor/Playable
   #66 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #67 = NameAndType        #27:#66       // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #68 = Methodref          #10.#67       // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #69 = Utf8               ox
   #70 = Utf8               I
   #71 = Utf8               oy
   #72 = Utf8               oz
   #73 = Utf8               creature
   #74 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #75 = Utf8               tx
   #76 = Utf8               ty
   #77 = Utf8               tz
   #78 = Utf8               debug
   #79 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #80 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
   #81 = Utf8               canMove
   #82 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #83 = NameAndType        #81:#82       // canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #84 = Methodref          #10.#83       // ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #85 = Utf8               ext/mods/gameserver/model/location/Location
   #86 = Class              #85           // ext/mods/gameserver/model/location/Location
   #87 = Utf8               (III)V
   #88 = NameAndType        #5:#87        // "<init>":(III)V
   #89 = Methodref          #86.#88       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #90 = Utf8               listOf
   #91 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
   #92 = NameAndType        #90:#91       // listOf:(Ljava/lang/Object;)Ljava/util/List;
   #93 = Methodref          #33.#92       // kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
   #94 = Utf8               findPathWithCollisionBox
   #95 = Utf8               getCollisionRadius
   #96 = Utf8               ()D
   #97 = NameAndType        #95:#96       // getCollisionRadius:()D
   #98 = Methodref          #39.#97       // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
   #99 = Utf8               canMoveWithCollisionBox
  #100 = Utf8               (IIIIIIDLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #101 = NameAndType        #99:#100      // canMoveWithCollisionBox:(IIIIIIDLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #102 = Methodref          #10.#101      // ext/mods/gameserver/geoengine/GeoEngine.canMoveWithCollisionBox:(IIIIIIDLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #103 = Utf8               java/util/Collection
  #104 = Class              #103          // java/util/Collection
  #105 = Utf8               toMutableList
  #106 = Utf8               (Ljava/util/Collection;)Ljava/util/List;
  #107 = NameAndType        #105:#106     // toMutableList:(Ljava/util/Collection;)Ljava/util/List;
  #108 = Methodref          #33.#107      // kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
  #109 = Utf8               java/util/List
  #110 = Class              #109          // java/util/List
  #111 = Utf8               size
  #112 = NameAndType        #111:#41      // size:()I
  #113 = InterfaceMethodref #110.#112     // java/util/List.size:()I
  #114 = Utf8               optimizePathWithCollisionBox
  #115 = Utf8               (Ljava/util/List;DLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #116 = NameAndType        #114:#115     // optimizePathWithCollisionBox:(Ljava/util/List;DLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #117 = Methodref          #2.#116       // ext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder.optimizePathWithCollisionBox:(Ljava/util/List;DLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #118 = Utf8               collisionRadius
  #119 = Utf8               D
  #120 = Utf8               path
  #121 = Utf8               Ljava/util/List;
  #122 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #123 = Class              #122          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #124 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;DLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #125 = Utf8               listIterator
  #126 = Utf8               ()Ljava/util/ListIterator;
  #127 = NameAndType        #125:#126     // listIterator:()Ljava/util/ListIterator;
  #128 = InterfaceMethodref #110.#127     // java/util/List.listIterator:()Ljava/util/ListIterator;
  #129 = Utf8               get
  #130 = Utf8               (I)Ljava/lang/Object;
  #131 = NameAndType        #129:#130     // get:(I)Ljava/lang/Object;
  #132 = InterfaceMethodref #110.#131     // java/util/List.get:(I)Ljava/lang/Object;
  #133 = Methodref          #86.#42       // ext/mods/gameserver/model/location/Location.getX:()I
  #134 = Methodref          #86.#45       // ext/mods/gameserver/model/location/Location.getY:()I
  #135 = Methodref          #86.#48       // ext/mods/gameserver/model/location/Location.getZ:()I
  #136 = Utf8               java/util/ListIterator
  #137 = Class              #136          // java/util/ListIterator
  #138 = Utf8               next
  #139 = Utf8               ()Ljava/lang/Object;
  #140 = NameAndType        #138:#139     // next:()Ljava/lang/Object;
  #141 = InterfaceMethodref #137.#140     // java/util/ListIterator.next:()Ljava/lang/Object;
  #142 = Utf8               hasNext
  #143 = Utf8               ()Z
  #144 = NameAndType        #142:#143     // hasNext:()Z
  #145 = InterfaceMethodref #137.#144     // java/util/ListIterator.hasNext:()Z
  #146 = Utf8               nextIndex
  #147 = NameAndType        #146:#41      // nextIndex:()I
  #148 = InterfaceMethodref #137.#147     // java/util/ListIterator.nextIndex:()I
  #149 = Utf8               remove
  #150 = NameAndType        #149:#6       // remove:()V
  #151 = InterfaceMethodref #137.#150     // java/util/ListIterator.remove:()V
  #152 = Utf8               java/awt/Color
  #153 = Class              #152          // java/awt/Color
  #154 = Utf8               RED
  #155 = Utf8               Ljava/awt/Color;
  #156 = NameAndType        #154:#155     // RED:Ljava/awt/Color;
  #157 = Fieldref           #153.#156     // java/awt/Color.RED:Ljava/awt/Color;
  #158 = Utf8               addPoint
  #159 = Utf8               (Ljava/awt/Color;III)V
  #160 = NameAndType        #158:#159     // addPoint:(Ljava/awt/Color;III)V
  #161 = Methodref          #123.#160     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;III)V
  #162 = Utf8               GREEN
  #163 = NameAndType        #162:#155     // GREEN:Ljava/awt/Color;
  #164 = Fieldref           #153.#163     // java/awt/Color.GREEN:Ljava/awt/Color;
  #165 = Utf8               nodeC
  #166 = Utf8               Lext/mods/gameserver/model/location/Location;
  #167 = Utf8               pointIterator
  #168 = Utf8               Ljava/util/ListIterator;
  #169 = Utf8               nodeAx
  #170 = Utf8               nodeAy
  #171 = Utf8               nodeAz
  #172 = Utf8               nodeB
  #173 = Utf8               Lkotlin/Metadata;
  #174 = Utf8               mv
  #175 = Integer            2
  #176 = Integer            3
  #177 = Integer            0
  #178 = Utf8               k
  #179 = Integer            1
  #180 = Utf8               xi
  #181 = Integer            48
  #182 = Utf8               d1
  #183 = Utf8               \u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010JH\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b
  #184 = Utf8               d2
  #185 = Utf8
  #186 = Utf8               Brproject
  #187 = Utf8               AdvancedPathFinder.kt
  #188 = Utf8               RuntimeInvisibleAnnotations
  #189 = Utf8               Code
  #190 = Utf8               LineNumberTable
  #191 = Utf8               LocalVariableTable
  #192 = Utf8               StackMapTable
  #193 = Utf8               Signature
  #194 = Utf8               RuntimeInvisibleParameterAnnotations
  #195 = Utf8               InnerClasses
  #196 = Utf8               SourceFile
  #197 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.AdvancedPathFinder();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: getstatic     #14                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         8: invokevirtual #20                 // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        11: putfield      #24                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        14: return
      LineNumberTable:
        line 34: 0
        line 36: 4
        line 34: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder;

  public final java.util.List<ext.mods.gameserver.model.location.Location> findPath(ext.mods.gameserver.model.actor.Creature, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=9, args_size=6
         0: aload_1
         1: ifnonnull     8
         4: invokestatic  #37                 // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
         7: areturn
         8: aload_1
         9: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.getX:()I
        12: istore        6
        14: aload_1
        15: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Creature.getY:()I
        18: istore        7
        20: aload_1
        21: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
        24: istore        8
        26: getstatic     #55                 // Field ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
        29: aload_1
        30: invokevirtual #59                 // Method ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.canIgnoreCreatureCollision:(Lext/mods/gameserver/model/actor/Creature;)Z
        33: ifeq          53
        36: aload_0
        37: iload         6
        39: iload         7
        41: iload         8
        43: iload_2
        44: iload_3
        45: iload         4
        47: aload         5
        49: invokespecial #63                 // Method findSimplifiedPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        52: areturn
        53: aload_0
        54: getfield      #24                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        57: iload         6
        59: iload         7
        61: iload         8
        63: iload_2
        64: iload_3
        65: iload         4
        67: aload_1
        68: instanceof    #65                 // class ext/mods/gameserver/model/actor/Playable
        71: aload         5
        73: invokevirtual #68                 // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        76: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 44
          locals = [ int, int, int ]
      LineNumberTable:
        line 39: 0
        line 40: 8
        line 41: 14
        line 42: 20
        line 43: 26
        line 44: 36
        line 46: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      63     6    ox   I
           20      57     7    oy   I
           26      51     8    oz   I
            0      77     0  this   Lext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder;
            0      77     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      77     2    tx   I
            0      77     3    ty   I
            0      77     4    tz   I
            0      77     5 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    Signature: #29                          // (Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    RuntimeInvisibleAnnotations:
      0: #30()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #31()
          org.jetbrains.annotations.Nullable
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
        0: #31()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #11= #16 of #10;    // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
SourceFile: "AdvancedPathFinder.kt"
RuntimeVisibleAnnotations:
  0: #173(#174=[I#175,I#176,I#177],#178=I#179,#180=I#181,#182=[s#183],#184=[s#26,s#185,s#5,s#6,s#21,s#22,s#27,s#185,s#166,s#73,s#74,s#75,s#185,s#76,s#77,s#78,s#79,s#60,s#69,s#71,s#72,s#94,s#114,s#120,s#185,s#118,s#185,s#186])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010JH\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/AdvancedPathFinder;","","<init>","()V","geoEngine","Lext/mods/gameserver/geoengine/GeoEngine;","findPath","","Lext/mods/gameserver/model/location/Location;","creature","Lext/mods/gameserver/model/actor/Creature;","tx","","ty","tz","debug","Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;","findSimplifiedPath","ox","oy","oz","findPathWithCollisionBox","optimizePathWithCollisionBox","path","","collisionRadius","","Brproject"]
    )
