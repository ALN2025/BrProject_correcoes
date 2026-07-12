// Bytecode for: ext.mods.gameserver.geoengine.geodata.ABlock
// File: ext\mods\gameserver\geoengine\geodata\ABlock.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/ABlock.class
  Last modified 9 de jul de 2026; size 800 bytes
  MD5 checksum 2bd07ab16f06a810ae8cc537ac968077
  Compiled from "ABlock.java"
public abstract class ext.mods.gameserver.geoengine.geodata.ABlock
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #7                          // ext/mods/gameserver/geoengine/geodata/ABlock
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 9, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/geoengine/geodata/ABlock
   #8 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lext/mods/gameserver/geoengine/geodata/ABlock;
  #14 = Utf8               hasGeoPos
  #15 = Utf8               ()Z
  #16 = Utf8               getHeightNearest
  #17 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #18 = Utf8               getNsweNearest
  #19 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #20 = Utf8               getIndexNearest
  #21 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #22 = Utf8               getIndexAbove
  #23 = Utf8               getIndexBelow
  #24 = Utf8               getHeight
  #25 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #26 = Utf8               getNswe
  #27 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #28 = Utf8               SourceFile
  #29 = Utf8               ABlock.java
{
  public ext.mods.gameserver.geoengine.geodata.ABlock();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/geodata/ABlock;

  public abstract boolean hasGeoPos();
    descriptor: ()Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract short getHeightNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract byte getNsweNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getIndexNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getIndexAbove(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getIndexBelow(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract short getHeight(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract byte getNswe(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "ABlock.java"
