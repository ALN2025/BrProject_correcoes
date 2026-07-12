// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineLegacyAdapter
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineLegacyAdapter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter.class
  Last modified 9 de jul de 2026; size 8099 bytes
  MD5 checksum eb742c6889c65e7ff417d16e699f674d
  Compiled from "GeoEngineLegacyAdapter.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineLegacyAdapter implements ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$GeoEngineInterface
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 12, attributes: 5
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
    #6 = Class              #5            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
    #7 = Utf8               <init>
    #8 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;)V
    #9 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #10 = Utf8               ()V
   #11 = NameAndType        #7:#10        // "<init>":()V
   #12 = Methodref          #4.#11        // java/lang/Object."<init>":()V
   #13 = Utf8               geoEngine
   #14 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #15 = NameAndType        #13:#14       // geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #17 = Utf8               this
   #18 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
   #19 = Utf8               findPath
   #20 = Utf8               (IIIIIIZLjava/lang/Object;)Ljava/util/List;
   #21 = Utf8               (IIIIIIZLjava/lang/Object;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
   #22 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #23 = Utf8               ext/mods/gameserver/model/World
   #24 = Class              #23           // ext/mods/gameserver/model/World
   #25 = Utf8               isOutOfWorld
   #26 = Utf8               (II)Z
   #27 = NameAndType        #25:#26       // isOutOfWorld:(II)Z
   #28 = Methodref          #24.#27       // ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
   #29 = Utf8               kotlin/collections/CollectionsKt
   #30 = Class              #29           // kotlin/collections/CollectionsKt
   #31 = Utf8               emptyList
   #32 = Utf8               ()Ljava/util/List;
   #33 = NameAndType        #31:#32       // emptyList:()Ljava/util/List;
   #34 = Methodref          #30.#33       // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
   #35 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #36 = Class              #35           // ext/mods/gameserver/geoengine/GeoEngine
   #37 = Utf8               Companion
   #38 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #39 = NameAndType        #37:#38       // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #40 = Fieldref           #36.#39       // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #41 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
   #42 = Class              #41           // ext/mods/gameserver/geoengine/GeoEngine$Companion
   #43 = Utf8               getGeoX
   #44 = Utf8               (I)I
   #45 = NameAndType        #43:#44       // getGeoX:(I)I
   #46 = Methodref          #42.#45       // ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
   #47 = Utf8               getGeoY
   #48 = NameAndType        #47:#44       // getGeoY:(I)I
   #49 = Methodref          #42.#48       // ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
   #50 = Utf8               hasGeoPos
   #51 = NameAndType        #50:#26       // hasGeoPos:(II)Z
   #52 = Methodref          #36.#51       // ext/mods/gameserver/geoengine/GeoEngine.hasGeoPos:(II)Z
   #53 = Utf8               getHeightNearest
   #54 = Utf8               (III)S
   #55 = NameAndType        #53:#54       // getHeightNearest:(III)S
   #56 = Methodref          #36.#55       // ext/mods/gameserver/geoengine/GeoEngine.getHeightNearest:(III)S
   #57 = Utf8               java/lang/Math
   #58 = Class              #57           // java/lang/Math
   #59 = Utf8               abs
   #60 = NameAndType        #59:#44       // abs:(I)I
   #61 = Methodref          #58.#60       // java/lang/Math.abs:(I)I
   #62 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #63 = Class              #62           // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #64 = Utf8               computeLegacyPathRaw
   #65 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #66 = NameAndType        #64:#65       // computeLegacyPathRaw:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #67 = Methodref          #36.#66       // ext/mods/gameserver/geoengine/GeoEngine.computeLegacyPathRaw:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #68 = Utf8               java/lang/Iterable
   #69 = Class              #68           // java/lang/Iterable
   #70 = Utf8               java/util/ArrayList
   #71 = Class              #70           // java/util/ArrayList
   #72 = Utf8               collectionSizeOrDefault
   #73 = Utf8               (Ljava/lang/Iterable;I)I
   #74 = NameAndType        #72:#73       // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
   #75 = Methodref          #30.#74       // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
   #76 = Utf8               (I)V
   #77 = NameAndType        #7:#76        // "<init>":(I)V
   #78 = Methodref          #71.#77       // java/util/ArrayList."<init>":(I)V
   #79 = Utf8               java/util/Collection
   #80 = Class              #79           // java/util/Collection
   #81 = Utf8               iterator
   #82 = Utf8               ()Ljava/util/Iterator;
   #83 = NameAndType        #81:#82       // iterator:()Ljava/util/Iterator;
   #84 = InterfaceMethodref #69.#83       // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #85 = Utf8               java/util/Iterator
   #86 = Class              #85           // java/util/Iterator
   #87 = Utf8               hasNext
   #88 = Utf8               ()Z
   #89 = NameAndType        #87:#88       // hasNext:()Z
   #90 = InterfaceMethodref #86.#89       // java/util/Iterator.hasNext:()Z
   #91 = Utf8               next
   #92 = Utf8               ()Ljava/lang/Object;
   #93 = NameAndType        #91:#92       // next:()Ljava/lang/Object;
   #94 = InterfaceMethodref #86.#93       // java/util/Iterator.next:()Ljava/lang/Object;
   #95 = Utf8               ext/mods/gameserver/model/location/Location
   #96 = Class              #95           // ext/mods/gameserver/model/location/Location
   #97 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
   #98 = Class              #97           // ext/mods/gameserver/geoengine/pathfinding/model/Location
   #99 = Utf8               getX
  #100 = Utf8               ()I
  #101 = NameAndType        #99:#100      // getX:()I
  #102 = Methodref          #96.#101      // ext/mods/gameserver/model/location/Location.getX:()I
  #103 = Utf8               getY
  #104 = NameAndType        #103:#100     // getY:()I
  #105 = Methodref          #96.#104      // ext/mods/gameserver/model/location/Location.getY:()I
  #106 = Utf8               getZ
  #107 = NameAndType        #106:#100     // getZ:()I
  #108 = Methodref          #96.#107      // ext/mods/gameserver/model/location/Location.getZ:()I
  #109 = Utf8               (III)V
  #110 = NameAndType        #7:#109       // "<init>":(III)V
  #111 = Methodref          #98.#110      // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
  #112 = Utf8               add
  #113 = Utf8               (Ljava/lang/Object;)Z
  #114 = NameAndType        #112:#113     // add:(Ljava/lang/Object;)Z
  #115 = InterfaceMethodref #80.#114      // java/util/Collection.add:(Ljava/lang/Object;)Z
  #116 = Utf8               java/util/List
  #117 = Class              #116          // java/util/List
  #118 = Utf8               $i$a$-map-GeoEngineLegacyAdapter$findPath$1
  #119 = Utf8               I
  #120 = Utf8               it
  #121 = Utf8               Lext/mods/gameserver/model/location/Location;
  #122 = Utf8               item$iv$iv
  #123 = Utf8               Ljava/lang/Object;
  #124 = Utf8               $i$f$mapTo
  #125 = Utf8               $this$mapTo$iv$iv
  #126 = Utf8               Ljava/lang/Iterable;
  #127 = Utf8               destination$iv$iv
  #128 = Utf8               Ljava/util/Collection;
  #129 = Utf8               $i$f$map
  #130 = Utf8               $this$map$iv
  #131 = Utf8               gox
  #132 = Utf8               goy
  #133 = Utf8               goz
  #134 = Utf8               gtx
  #135 = Utf8               gty
  #136 = Utf8               gtz
  #137 = Utf8               path
  #138 = Utf8               Ljava/util/List;
  #139 = Utf8               ox
  #140 = Utf8               oy
  #141 = Utf8               oz
  #142 = Utf8               tx
  #143 = Utf8               ty
  #144 = Utf8               tz
  #145 = Utf8               playable
  #146 = Utf8               Z
  #147 = Utf8               debug
  #148 = Utf8               canMove
  #149 = Utf8               (IIIIII)Z
  #150 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #151 = NameAndType        #148:#150     // canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #152 = Methodref          #36.#151      // ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #153 = Utf8               canSee
  #154 = Utf8               (IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
  #155 = Utf8               (IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #156 = NameAndType        #153:#155     // canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #157 = Methodref          #36.#156      // ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #158 = Utf8               oheight
  #159 = Utf8               D
  #160 = Utf8               theight
  #161 = Utf8               ignore
  #162 = Utf8               getHeight
  #163 = NameAndType        #162:#54      // getHeight:(III)S
  #164 = Methodref          #36.#163      // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #165 = Utf8               worldX
  #166 = Utf8               worldY
  #167 = Utf8               worldZ
  #168 = Utf8               getValidLocation
  #169 = Utf8               (IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #170 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #171 = NameAndType        #168:#170     // getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #172 = Methodref          #36.#171      // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #173 = Utf8               loc
  #174 = Utf8               addGeoObject
  #175 = Utf8               (Ljava/lang/Object;)V
  #176 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
  #177 = Class              #176          // ext/mods/gameserver/geoengine/geodata/IGeoObject
  #178 = Utf8               (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #179 = NameAndType        #174:#178     // addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #180 = Methodref          #36.#179      // ext/mods/gameserver/geoengine/GeoEngine.addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #181 = Utf8               $i$a$-let-GeoEngineLegacyAdapter$addGeoObject$1
  #182 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #183 = Utf8               obj
  #184 = Utf8               removeGeoObject
  #185 = NameAndType        #184:#178     // removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #186 = Methodref          #36.#185      // ext/mods/gameserver/geoengine/GeoEngine.removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #187 = Utf8               $i$a$-let-GeoEngineLegacyAdapter$removeGeoObject$1
  #188 = Utf8               getWorldX
  #189 = NameAndType        #188:#44      // getWorldX:(I)I
  #190 = Methodref          #42.#189      // ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldX:(I)I
  #191 = Utf8               geoX
  #192 = Utf8               getWorldY
  #193 = NameAndType        #192:#44      // getWorldY:(I)I
  #194 = Methodref          #42.#193      // ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldY:(I)I
  #195 = Utf8               geoY
  #196 = Utf8               Lkotlin/Metadata;
  #197 = Utf8               mv
  #198 = Integer            2
  #199 = Integer            3
  #200 = Integer            0
  #201 = Utf8               k
  #202 = Integer            1
  #203 = Utf8               xi
  #204 = Integer            48
  #205 = Utf8               d1
  #206 = Utf8               \u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J8\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\\\u0010\u0015\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0016JB\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0016J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*
  #207 = Utf8               d2
  #208 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
  #209 = Utf8
  #210 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #211 = Utf8               Brproject
  #212 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #213 = Class              #212          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #214 = Utf8               GeoEngineInterface
  #215 = Utf8               GeoEngineLegacyAdapter.kt
  #216 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #217 = Utf8               value
  #218 = Utf8               SMAP\nGeoEngineLegacyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngineLegacyAdapter.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1586#2:75\n1661#2,3:76\n1#3:79\n*S KotlinDebug\n*F\n+ 1 GeoEngineLegacyAdapter.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter\n*L\n49#1:75\n49#1:76,3\n*E\n
  #219 = Utf8               RuntimeInvisibleAnnotations
  #220 = Utf8               Code
  #221 = Utf8               LineNumberTable
  #222 = Utf8               LocalVariableTable
  #223 = Utf8               RuntimeInvisibleParameterAnnotations
  #224 = Utf8               StackMapTable
  #225 = Utf8               Signature
  #226 = Utf8               InnerClasses
  #227 = Utf8               SourceFile
  #228 = Utf8               SourceDebugExtension
  #229 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineLegacyAdapter(ext.mods.gameserver.geoengine.GeoEngine);
    descriptor: (Lext/mods/gameserver/geoengine/GeoEngine;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #12                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         9: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0      10     1 geoEngine   Lext/mods/gameserver/geoengine/GeoEngine;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location> findPath(int, int, int, int, int, int, boolean, java.lang.Object);
    descriptor: (IIIIIIZLjava/lang/Object;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=26, args_size=9
         0: iload         4
         2: iload         5
         4: invokestatic  #28                 // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
         7: ifeq          14
        10: invokestatic  #34                 // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        13: areturn
        14: getstatic     #40                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        17: iload_1
        18: invokevirtual #46                 // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        21: istore        9
        23: getstatic     #40                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        26: iload_2
        27: invokevirtual #49                 // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        30: istore        10
        32: aload_0
        33: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        36: iload         9
        38: iload         10
        40: invokevirtual #52                 // Method ext/mods/gameserver/geoengine/GeoEngine.hasGeoPos:(II)Z
        43: ifne          50
        46: invokestatic  #34                 // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        49: areturn
        50: aload_0
        51: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        54: iload         9
        56: iload         10
        58: iload_3
        59: invokevirtual #56                 // Method ext/mods/gameserver/geoengine/GeoEngine.getHeightNearest:(III)S
        62: istore        11
        64: getstatic     #40                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        67: iload         4
        69: invokevirtual #46                 // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        72: istore        12
        74: getstatic     #40                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        77: iload         5
        79: invokevirtual #49                 // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        82: istore        13
        84: aload_0
        85: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        88: iload         12
        90: iload         13
        92: invokevirtual #52                 // Method ext/mods/gameserver/geoengine/GeoEngine.hasGeoPos:(II)Z
        95: ifne          102
        98: invokestatic  #34                 // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
       101: areturn
       102: aload_0
       103: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       106: iload         12
       108: iload         13
       110: iload         6
       112: invokevirtual #56                 // Method ext/mods/gameserver/geoengine/GeoEngine.getHeightNearest:(III)S
       115: istore        14
       117: iload         14
       119: iload         6
       121: isub
       122: invokestatic  #61                 // Method java/lang/Math.abs:(I)I
       125: sipush        500
       128: if_icmple     135
       131: invokestatic  #34                 // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
       134: areturn
       135: aload_0
       136: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       139: iload         9
       141: iload         10
       143: iload         11
       145: iload         12
       147: iload         13
       149: iload         14
       151: aload         8
       153: instanceof    #63                 // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
       156: ifeq          167
       159: aload         8
       161: checkcast     #63                 // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
       164: goto          168
       167: aconst_null
       168: invokevirtual #67                 // Method ext/mods/gameserver/geoengine/GeoEngine.computeLegacyPathRaw:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       171: astore        15
       173: aload         15
       175: checkcast     #69                 // class java/lang/Iterable
       178: astore        16
       180: iconst_0
       181: istore        17
       183: aload         16
       185: astore        18
       187: new           #71                 // class java/util/ArrayList
       190: dup
       191: aload         16
       193: bipush        10
       195: invokestatic  #75                 // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       198: invokespecial #78                 // Method java/util/ArrayList."<init>":(I)V
       201: checkcast     #80                 // class java/util/Collection
       204: astore        19
       206: iconst_0
       207: istore        20
       209: aload         18
       211: invokeinterface #84,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       216: astore        21
       218: aload         21
       220: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       225: ifeq          285
       228: aload         21
       230: invokeinterface #94,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       235: astore        22
       237: aload         19
       239: aload         22
       241: checkcast     #96                 // class ext/mods/gameserver/model/location/Location
       244: astore        23
       246: astore        25
       248: iconst_0
       249: istore        24
       251: new           #98                 // class ext/mods/gameserver/geoengine/pathfinding/model/Location
       254: dup
       255: aload         23
       257: invokevirtual #102                // Method ext/mods/gameserver/model/location/Location.getX:()I
       260: aload         23
       262: invokevirtual #105                // Method ext/mods/gameserver/model/location/Location.getY:()I
       265: aload         23
       267: invokevirtual #108                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       270: invokespecial #111                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
       273: aload         25
       275: swap
       276: invokeinterface #115,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       281: pop
       282: goto          218
       285: aload         19
       287: checkcast     #117                // class java/util/List
       290: nop
       291: areturn
      StackMapTable: number_of_entries = 8
        frame_type = 14 /* same */
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ int, int ]
        frame_type = 254 /* append */
          offset_delta = 51
          locals = [ int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter, int, int, int, int, int, int, int, class java/lang/Object, int, int, int, int, int, int ]
          stack = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter, int, int, int, int, int, int, int, class java/lang/Object, int, int, int, int, int, int ]
          stack = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter, int, int, int, int, int, int, int, class java/lang/Object, int, int, int, int, int, int, class java/util/List, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
      LineNumberTable:
        line 38: 0
        line 39: 14
        line 40: 23
        line 41: 32
        line 42: 50
        line 43: 64
        line 44: 74
        line 45: 84
        line 46: 102
        line 47: 117
        line 47: 125
        line 48: 135
        line 49: 173
        line 75: 183
        line 76: 209
        line 77: 237
        line 49: 251
        line 77: 276
        line 78: 285
        line 75: 290
        line 49: 291
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          251      22    24 $i$a$-map-GeoEngineLegacyAdapter$findPath$1   I
          248      25    23    it   Lext/mods/gameserver/model/location/Location;
          237      45    22 item$iv$iv   Ljava/lang/Object;
          209      78    20 $i$f$mapTo   I
          206      81    18 $this$mapTo$iv$iv   Ljava/lang/Iterable;
          206      81    19 destination$iv$iv   Ljava/util/Collection;
          183     108    17 $i$f$map   I
          180     111    16 $this$map$iv   Ljava/lang/Iterable;
           23     269     9   gox   I
           32     260    10   goy   I
           64     228    11   goz   I
           74     218    12   gtx   I
           84     208    13   gty   I
          117     175    14   gtz   I
          173     119    15  path   Ljava/util/List;
            0     292     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0     292     1    ox   I
            0     292     2    oy   I
            0     292     3    oz   I
            0     292     4    tx   I
            0     292     5    ty   I
            0     292     6    tz   I
            0     292     7 playable   Z
            0     292     8 debug   Ljava/lang/Object;
    Signature: #21                          // (IIIIIIZLjava/lang/Object;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
        0: #22()
          org.jetbrains.annotations.Nullable

  public boolean canMove(int, int, int, int, int, int);
    descriptor: (IIIIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=7, args_size=7
         0: aload_0
         1: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: iload         6
        13: aconst_null
        14: invokevirtual #152                // Method ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
        17: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0      18     1    ox   I
            0      18     2    oy   I
            0      18     3    oz   I
            0      18     4    tx   I
            0      18     5    ty   I
            0      18     6    tz   I

  public boolean canSee(int, int, int, double, int, int, int, double, java.lang.Object, java.lang.Object);
    descriptor: (IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=13, locals=13, args_size=11
         0: aload_0
         1: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         4: iload_1
         5: iload_2
         6: iload_3
         7: dload         4
         9: iload         6
        11: iload         7
        13: iload         8
        15: dload         9
        17: aconst_null
        18: aload         12
        20: instanceof    #63                 // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
        23: ifeq          34
        26: aload         12
        28: checkcast     #63                 // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
        31: goto          35
        34: aconst_null
        35: invokevirtual #157                // Method ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
        38: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter, int, int, int, double, int, int, int, double, class java/lang/Object, class java/lang/Object ]
          stack = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, null ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter, int, int, int, double, int, int, int, double, class java/lang/Object, class java/lang/Object ]
          stack = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, null, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0      39     1    ox   I
            0      39     2    oy   I
            0      39     3    oz   I
            0      39     4 oheight   D
            0      39     6    tx   I
            0      39     7    ty   I
            0      39     8    tz   I
            0      39     9 theight   D
            0      39    11 ignore   Ljava/lang/Object;
            0      39    12 debug   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
      parameter 8:
        0: #22()
          org.jetbrains.annotations.Nullable
      parameter 9:
        0: #22()
          org.jetbrains.annotations.Nullable

  public short getHeight(int, int, int);
    descriptor: (III)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #164                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
        10: ireturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0      11     1 worldX   I
            0      11     2 worldY   I
            0      11     3 worldZ   I

  public ext.mods.gameserver.geoengine.pathfinding.model.Location getValidLocation(int, int, int, int, int, int, java.lang.Object);
    descriptor: (IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=9, args_size=8
         0: aload_0
         1: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: iload         6
        13: aload         7
        15: instanceof    #63                 // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
        18: ifeq          29
        21: aload         7
        23: checkcast     #63                 // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
        26: goto          30
        29: aconst_null
        30: invokevirtual #172                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
        33: astore        8
        35: new           #98                 // class ext/mods/gameserver/geoengine/pathfinding/model/Location
        38: dup
        39: aload         8
        41: invokevirtual #102                // Method ext/mods/gameserver/model/location/Location.getX:()I
        44: aload         8
        46: invokevirtual #105                // Method ext/mods/gameserver/model/location/Location.getY:()I
        49: aload         8
        51: invokevirtual #108                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        54: invokespecial #111                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        57: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter, int, int, int, int, int, int, class java/lang/Object ]
          stack = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter, int, int, int, int, int, int, class java/lang/Object ]
          stack = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
      LineNumberTable:
        line 61: 0
        line 62: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      23     8   loc   Lext/mods/gameserver/model/location/Location;
            0      58     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0      58     1    ox   I
            0      58     2    oy   I
            0      58     3    oz   I
            0      58     4    tx   I
            0      58     5    ty   I
            0      58     6    tz   I
            0      58     7 debug   Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #22()
          org.jetbrains.annotations.Nullable

  public void addGeoObject(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: instanceof    #177                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
         4: ifeq          14
         7: aload_1
         8: checkcast     #177                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
        11: goto          15
        14: aconst_null
        15: dup
        16: ifnull        33
        19: astore_2
        20: iconst_0
        21: istore_3
        22: aload_0
        23: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        26: aload_2
        27: invokevirtual #180                // Method ext/mods/gameserver/geoengine/GeoEngine.addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
        30: goto          35
        33: pop
        34: nop
        35: return
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/geodata/IGeoObject ]
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/geodata/IGeoObject ]
        frame_type = 1 /* same */
      LineNumberTable:
        line 65: 0
        line 79: 20
        line 65: 22
        line 65: 30
        line 65: 33
        line 66: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22       8     3 $i$a$-let-GeoEngineLegacyAdapter$addGeoObject$1   I
           20      10     2    it   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0      36     1   obj   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public void removeGeoObject(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: instanceof    #177                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
         4: ifeq          14
         7: aload_1
         8: checkcast     #177                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
        11: goto          15
        14: aconst_null
        15: dup
        16: ifnull        33
        19: astore_2
        20: iconst_0
        21: istore_3
        22: aload_0
        23: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        26: aload_2
        27: invokevirtual #186                // Method ext/mods/gameserver/geoengine/GeoEngine.removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
        30: goto          35
        33: pop
        34: nop
        35: return
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/geodata/IGeoObject ]
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/geodata/IGeoObject ]
        frame_type = 1 /* same */
      LineNumberTable:
        line 68: 0
        line 79: 20
        line 68: 22
        line 68: 30
        line 68: 33
        line 69: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22       8     3 $i$a$-let-GeoEngineLegacyAdapter$removeGeoObject$1   I
           20      10     2    it   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0      36     1   obj   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public int getGeoX(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #40                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_1
         4: invokevirtual #46                 // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
         7: ireturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0       8     1 worldX   I

  public int getGeoY(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #40                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_1
         4: invokevirtual #49                 // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
         7: ireturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0       8     1 worldY   I

  public int getWorldX(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #40                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_1
         4: invokevirtual #190                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldX:(I)I
         7: ireturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0       8     1  geoX   I

  public int getWorldY(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #40                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_1
         4: invokevirtual #194                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldY:(I)I
         7: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
            0       8     1  geoY   I
}
InnerClasses:
  public static final #37= #42 of #36;    // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
  public static #214= #6 of #213;         // GeoEngineInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
SourceFile: "GeoEngineLegacyAdapter.kt"
SourceDebugExtension:
  SMAP
  GeoEngineLegacyAdapter.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GeoEngineLegacyAdapter.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 3 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,74:1
  1586#2:75
  1661#2,3:76
  1#3:79
  *S KotlinDebug
  *F
  + 1 GeoEngineLegacyAdapter.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter
  *L
  49#1:75
  49#1:76,3
  *E
RuntimeVisibleAnnotations:
  0: #196(#197=[I#198,I#199,I#200],#201=I#202,#203=I#204,#205=[s#206],#207=[s#18,s#208,s#13,s#14,s#7,s#8,s#19,s#209,s#210,s#139,s#209,s#140,s#141,s#142,s#143,s#144,s#145,s#209,s#147,s#209,s#148,s#153,s#158,s#209,s#160,s#161,s#162,s#209,s#165,s#166,s#167,s#168,s#174,s#209,s#183,s#184,s#43,s#47,s#188,s#191,s#192,s#195,s#211])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J8\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\\\u0010\u0015\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0016JB\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0016J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;","Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;","geoEngine","Lext/mods/gameserver/geoengine/GeoEngine;","<init>","(Lext/mods/gameserver/geoengine/GeoEngine;)V","findPath","","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","ox","","oy","oz","tx","ty","tz","playable","","debug","","canMove","canSee","oheight","","theight","ignore","getHeight","","worldX","worldY","worldZ","getValidLocation","addGeoObject","","obj","removeGeoObject","getGeoX","getGeoY","getWorldX","geoX","getWorldY","geoY","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #216(#217=[s#218])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGeoEngineLegacyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngineLegacyAdapter.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1586#2:75\n1661#2,3:76\n1#3:79\n*S KotlinDebug\n*F\n+ 1 GeoEngineLegacyAdapter.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter\n*L\n49#1:75\n49#1:76,3\n*E\n"]
    )
