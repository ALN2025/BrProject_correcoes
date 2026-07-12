// Bytecode for: ext.mods.gameserver.geoengine.geodata.IBlockDynamic
// File: ext\mods\gameserver\geoengine\geodata\IBlockDynamic.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/IBlockDynamic.class
  Last modified 9 de jul de 2026; size 250 bytes
  MD5 checksum 33dbe68b6aeccdfab8c17869492f777b
  Compiled from "IBlockDynamic.java"
public interface ext.mods.gameserver.geoengine.geodata.IBlockDynamic
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/gameserver/geoengine/geodata/IBlockDynamic
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/geoengine/geodata/IBlockDynamic
   #2 = Utf8               ext/mods/gameserver/geoengine/geodata/IBlockDynamic
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               addGeoObject
   #6 = Utf8               (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #7 = Utf8               removeGeoObject
   #8 = Utf8               SourceFile
   #9 = Utf8               IBlockDynamic.java
{
  public abstract void addGeoObject(ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void removeGeoObject(ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "IBlockDynamic.java"
