// Bytecode for: ext.mods.commons.geometry.AShape
// File: ext\mods\commons\geometry\AShape.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/geometry/AShape.class
  Last modified 9 de jul de 2026; size 950 bytes
  MD5 checksum 0ae6bd1ae7acd487656eee476f6920de
  Compiled from "AShape.java"
public abstract class ext.mods.commons.geometry.AShape
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/commons/geometry/AShape
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 8, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/geometry/AShape._center:Lext/mods/gameserver/model/location/Point2D;
   #8 = Class              #10            // ext/mods/commons/geometry/AShape
   #9 = NameAndType        #11:#12        // _center:Lext/mods/gameserver/model/location/Point2D;
  #10 = Utf8               ext/mods/commons/geometry/AShape
  #11 = Utf8               _center
  #12 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #13 = Fieldref           #8.#14         // ext/mods/commons/geometry/AShape._area:J
  #14 = NameAndType        #15:#16        // _area:J
  #15 = Utf8               _area
  #16 = Utf8               J
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lext/mods/commons/geometry/AShape;
  #22 = Utf8               isInside
  #23 = Utf8               (II)Z
  #24 = Utf8               intersects
  #25 = Utf8               (IIII)Z
  #26 = Utf8               getRandomLocation
  #27 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #28 = Utf8               visualize
  #29 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
  #30 = Utf8               visualize3D
  #31 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
  #32 = Utf8               getCenter
  #33 = Utf8               ()Lext/mods/gameserver/model/location/Point2D;
  #34 = Utf8               getArea
  #35 = Utf8               ()J
  #36 = Utf8               SourceFile
  #37 = Utf8               AShape.java
{
  protected ext.mods.gameserver.model.location.Point2D _center;
    descriptor: Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0004) ACC_PROTECTED

  protected long _area;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.commons.geometry.AShape();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/AShape;

  public abstract boolean isInside(int, int);
    descriptor: (II)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean intersects(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.location.Location getRandomLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void visualize(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive, int);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void visualize3D(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive, int, int);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public ext.mods.gameserver.model.location.Point2D getCenter();
    descriptor: ()Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _center:Lext/mods/gameserver/model/location/Point2D;
         4: areturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/AShape;

  public long getArea();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _area:J
         4: lreturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/AShape;
}
SourceFile: "AShape.java"
