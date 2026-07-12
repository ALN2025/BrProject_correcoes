// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.dynamic.GeoObjectAdapter
// File: ext\mods\gameserver\geoengine\pathfinding\dynamic\GeoObjectAdapter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter.class
  Last modified 9 de jul de 2026; size 828 bytes
  MD5 checksum f779052139c3cd1d5ff342476ca16ef4
  Compiled from "DynamicObstacleLayer.kt"
public interface ext.mods.gameserver.geoengine.pathfinding.dynamic.GeoObjectAdapter
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 7, attributes: 2
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               getObjectId
   #6 = Utf8               ()Ljava/lang/String;
   #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #8 = Utf8               getGeoX
   #9 = Utf8               ()I
  #10 = Utf8               getGeoY
  #11 = Utf8               getGeoZ
  #12 = Utf8               ()S
  #13 = Utf8               getWidth
  #14 = Utf8               getHeight
  #15 = Utf8               isSolid
  #16 = Utf8               ()Z
  #17 = Utf8               Lkotlin/Metadata;
  #18 = Utf8               mv
  #19 = Integer            2
  #20 = Integer            3
  #21 = Integer            0
  #22 = Utf8               k
  #23 = Integer            1
  #24 = Utf8               xi
  #25 = Integer            48
  #26 = Utf8               d1
  #27 = Utf8               \u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\rÀ\u0006\u0003
  #28 = Utf8               d2
  #29 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;
  #30 = Utf8
  #31 = Utf8               Brproject
  #32 = Utf8               DynamicObstacleLayer.kt
  #33 = Utf8               RuntimeInvisibleAnnotations
  #34 = Utf8               SourceFile
  #35 = Utf8               RuntimeVisibleAnnotations
{
  public abstract java.lang.String getObjectId();
    descriptor: ()Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public abstract int getGeoX();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getGeoY();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract short getGeoZ();
    descriptor: ()S
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getWidth();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getHeight();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean isSolid();
    descriptor: ()Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "DynamicObstacleLayer.kt"
RuntimeVisibleAnnotations:
  0: #17(#18=[I#19,I#20,I#21],#22=I#23,#24=I#25,#26=[s#27],#28=[s#29,s#30,s#5,s#30,s#8,s#30,s#10,s#11,s#30,s#13,s#14,s#15,s#30,s#31])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\rÀ\u0006\u0003"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;","","getObjectId","","getGeoX","","getGeoY","getGeoZ","","getWidth","getHeight","isSolid","","Brproject"]
    )
