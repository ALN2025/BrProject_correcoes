// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$GeoEngineInterface
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineBridge$GeoEngineInterface.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.class
  Last modified 9 de jul de 2026; size 2263 bytes
  MD5 checksum 2e8444742d78a244c6d3bcd75d27b475
  Compiled from "GeoEngineBridge.kt"
public interface ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$GeoEngineInterface
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 11, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               findPath
   #6 = Utf8               (IIIIIIZLjava/lang/Object;)Ljava/util/List;
   #7 = Utf8               (IIIIIIZLjava/lang/Object;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
   #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #9 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #10 = Utf8               canMove
  #11 = Utf8               (IIIIII)Z
  #12 = Utf8               canSee
  #13 = Utf8               (IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
  #14 = Utf8               getHeight
  #15 = Utf8               (III)S
  #16 = Utf8               getValidLocation
  #17 = Utf8               (IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #18 = Utf8               addGeoObject
  #19 = Utf8               (Ljava/lang/Object;)V
  #20 = Utf8               removeGeoObject
  #21 = Utf8               getGeoX
  #22 = Utf8               (I)I
  #23 = Utf8               getGeoY
  #24 = Utf8               getWorldX
  #25 = Utf8               getWorldY
  #26 = Utf8               Lkotlin/Metadata;
  #27 = Utf8               mv
  #28 = Integer            2
  #29 = Integer            3
  #30 = Integer            0
  #31 = Utf8               k
  #32 = Integer            1
  #33 = Utf8               xi
  #34 = Integer            48
  #35 = Utf8               d1
  #36 = Utf8               \u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H&J8\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H&J\\\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H&J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H&JB\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001H&J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001H&J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H&J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H&J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H&¨\u0006%À\u0006\u0003
  #37 = Utf8               d2
  #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
  #39 = Utf8
  #40 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #41 = Utf8               ox
  #42 = Utf8               oy
  #43 = Utf8               oz
  #44 = Utf8               tx
  #45 = Utf8               ty
  #46 = Utf8               tz
  #47 = Utf8               playable
  #48 = Utf8               debug
  #49 = Utf8               oheight
  #50 = Utf8               theight
  #51 = Utf8               ignore
  #52 = Utf8               worldX
  #53 = Utf8               worldY
  #54 = Utf8               worldZ
  #55 = Utf8               obj
  #56 = Utf8               geoX
  #57 = Utf8               geoY
  #58 = Utf8               Brproject
  #59 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #60 = Class              #59            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #61 = Utf8               GeoEngineInterface
  #62 = Utf8               GeoEngineBridge.kt
  #63 = Utf8               Signature
  #64 = Utf8               RuntimeInvisibleAnnotations
  #65 = Utf8               RuntimeInvisibleParameterAnnotations
  #66 = Utf8               InnerClasses
  #67 = Utf8               SourceFile
  #68 = Utf8               RuntimeVisibleAnnotations
{
  public abstract java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location> findPath(int, int, int, int, int, int, boolean, java.lang.Object);
    descriptor: (IIIIIIZLjava/lang/Object;)Ljava/util/List;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #7                           // (IIIIIIZLjava/lang/Object;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
    RuntimeInvisibleAnnotations:
      0: #8()
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
        0: #9()
          org.jetbrains.annotations.Nullable

  public abstract boolean canMove(int, int, int, int, int, int);
    descriptor: (IIIIII)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean canSee(int, int, int, double, int, int, int, double, java.lang.Object, java.lang.Object);
    descriptor: (IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
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
        0: #9()
          org.jetbrains.annotations.Nullable
      parameter 9:
        0: #9()
          org.jetbrains.annotations.Nullable

  public abstract short getHeight(int, int, int);
    descriptor: (III)S
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.geoengine.pathfinding.model.Location getValidLocation(int, int, int, int, int, int, java.lang.Object);
    descriptor: (IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #9()
          org.jetbrains.annotations.Nullable

  public abstract void addGeoObject(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  public abstract void removeGeoObject(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  public abstract int getGeoX(int);
    descriptor: (I)I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getGeoY(int);
    descriptor: (I)I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getWorldX(int);
    descriptor: (I)I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getWorldY(int);
    descriptor: (I)I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
InnerClasses:
  public static #61= #2 of #60;           // GeoEngineInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
SourceFile: "GeoEngineBridge.kt"
RuntimeVisibleAnnotations:
  0: #26(#27=[I#28,I#29,I#30],#31=I#32,#33=I#34,#35=[s#36],#37=[s#38,s#39,s#5,s#39,s#40,s#41,s#39,s#42,s#43,s#44,s#45,s#46,s#47,s#39,s#48,s#10,s#12,s#49,s#39,s#50,s#51,s#14,s#39,s#52,s#53,s#54,s#16,s#18,s#39,s#55,s#20,s#21,s#23,s#24,s#56,s#25,s#57,s#58])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H&J8\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H&J\\\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H&J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H&JB\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001H&J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001H&J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H&J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H&J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H&¨\u0006%À\u0006\u0003"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;","","findPath","","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","ox","","oy","oz","tx","ty","tz","playable","","debug","canMove","canSee","oheight","","theight","ignore","getHeight","","worldX","worldY","worldZ","getValidLocation","addGeoObject","","obj","removeGeoObject","getGeoX","getGeoY","getWorldX","geoX","getWorldY","geoY","Brproject"]
    )
