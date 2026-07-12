// Bytecode for: ext.mods.gameserver.geoengine.PathfindingCache$CachedPath
// File: ext\mods\gameserver\geoengine\PathfindingCache$CachedPath.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/PathfindingCache$CachedPath.class
  Last modified 9 de jul de 2026; size 820 bytes
  MD5 checksum a8bc9286e1f65e742ce699ffc36588fc
  Compiled from "PathfindingCache.java"
class ext.mods.gameserver.geoengine.PathfindingCache$CachedPath
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/geoengine/PathfindingCache$CachedPath
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/geoengine/PathfindingCache$CachedPath.path:Ljava/util/List;
   #8 = Class              #10            // ext/mods/gameserver/geoengine/PathfindingCache$CachedPath
   #9 = NameAndType        #11:#12        // path:Ljava/util/List;
  #10 = Utf8               ext/mods/gameserver/geoengine/PathfindingCache$CachedPath
  #11 = Utf8               path
  #12 = Utf8               Ljava/util/List;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/geoengine/PathfindingCache$CachedPath.timestamp:J
  #14 = NameAndType        #15:#16        // timestamp:J
  #15 = Utf8               timestamp
  #16 = Utf8               J
  #17 = Utf8               Signature
  #18 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #19 = Utf8               (Ljava/util/List;J)V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/gameserver/geoengine/PathfindingCache$CachedPath;
  #25 = Utf8               LocalVariableTypeTable
  #26 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;J)V
  #27 = Utf8               SourceFile
  #28 = Utf8               PathfindingCache.java
  #29 = Utf8               NestHost
  #30 = Class              #31            // ext/mods/gameserver/geoengine/PathfindingCache
  #31 = Utf8               ext/mods/gameserver/geoengine/PathfindingCache
  #32 = Utf8               InnerClasses
  #33 = Utf8               CachedPath
{
  final java.util.List<ext.mods.gameserver.model.location.Location> path;
    descriptor: Ljava/util/List;
    flags: (0x0010) ACC_FINAL
    Signature: #18                          // Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  final long timestamp;
    descriptor: J
    flags: (0x0010) ACC_FINAL

  ext.mods.gameserver.geoengine.PathfindingCache$CachedPath(java.util.List<ext.mods.gameserver.model.location.Location>, long);
    descriptor: (Ljava/util/List;J)V
    flags: (0x0000)
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field path:Ljava/util/List;
         9: aload_0
        10: lload_2
        11: putfield      #13                 // Field timestamp:J
        14: return
      LineNumberTable:
        line 202: 0
        line 203: 4
        line 204: 9
        line 205: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/PathfindingCache$CachedPath;
            0      15     1  path   Ljava/util/List;
            0      15     2 timestamp   J
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     1  path   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    Signature: #26                          // (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;J)V
}
SourceFile: "PathfindingCache.java"
NestHost: class ext/mods/gameserver/geoengine/PathfindingCache
