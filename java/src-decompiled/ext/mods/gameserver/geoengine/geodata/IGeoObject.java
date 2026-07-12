// Bytecode for: ext.mods.gameserver.geoengine.geodata.IGeoObject
// File: ext\mods\gameserver\geoengine\geodata\IGeoObject.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/IGeoObject.class
  Last modified 9 de jul de 2026; size 254 bytes
  MD5 checksum ec05c9c88b440047aa8303768fc37930
  Compiled from "IGeoObject.java"
public interface ext.mods.gameserver.geoengine.geodata.IGeoObject
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/gameserver/geoengine/geodata/IGeoObject
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/geoengine/geodata/IGeoObject
   #2 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               getGeoX
   #6 = Utf8               ()I
   #7 = Utf8               getGeoY
   #8 = Utf8               getGeoZ
   #9 = Utf8               getHeight
  #10 = Utf8               getObjectGeoData
  #11 = Utf8               ()[[B
  #12 = Utf8               SourceFile
  #13 = Utf8               IGeoObject.java
{
  public abstract int getGeoX();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getGeoY();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getGeoZ();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getHeight();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract byte[][] getObjectGeoData();
    descriptor: ()[[B
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "IGeoObject.java"
