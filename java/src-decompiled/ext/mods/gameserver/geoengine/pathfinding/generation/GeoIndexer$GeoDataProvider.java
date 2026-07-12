// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$GeoDataProvider.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.class
  Last modified 9 de jul de 2026; size 2198 bytes
  MD5 checksum b938b6c9a4e4aa8b592e1bd738c97ded
  Compiled from "GeoIndexer.kt"
public interface ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 9, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               getBlockType
   #6 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #8 = Utf8               getHeight
   #9 = Utf8               (II)S
  #10 = Utf8               getNswe
  #11 = Utf8               (II)B
  #12 = Utf8               getLayers
  #13 = Utf8               (II)Ljava/util/List;
  #14 = Utf8               (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;
  #15 = Utf8               isLoaded
  #16 = Utf8               (II)Z
  #17 = Utf8               hasL2JData
  #18 = Utf8               hasConvDatData
  #19 = Utf8               getConvDatHeight
  #20 = Utf8               (II)Ljava/lang/Short;
  #21 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #22 = Utf8               getSourcePriority
  #23 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #24 = Utf8               Lkotlin/Metadata;
  #25 = Utf8               mv
  #26 = Integer            2
  #27 = Integer            3
  #28 = Integer            0
  #29 = Utf8               k
  #30 = Integer            1
  #31 = Utf8               xi
  #32 = Integer            48
  #33 = Utf8               d1
  #34 = Utf8               \u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u001aÀ\u0006\u0003
  #35 = Utf8               d2
  #36 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #37 = Utf8
  #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #39 = Utf8               geoX
  #40 = Utf8               geoY
  #41 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #42 = Utf8               regionX
  #43 = Utf8               regionY
  #44 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #45 = Utf8               SourcePriority
  #46 = Utf8               LayerInfo
  #47 = Utf8               Brproject
  #48 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #49 = Class              #48            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #50 = Utf8               GeoDataProvider
  #51 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  #52 = Class              #51            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  #53 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
  #54 = Class              #53            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
  #55 = Utf8               GeoIndexer.kt
  #56 = Utf8               RuntimeInvisibleAnnotations
  #57 = Utf8               Signature
  #58 = Utf8               InnerClasses
  #59 = Utf8               SourceFile
  #60 = Utf8               RuntimeVisibleAnnotations
{
  public abstract ext.mods.gameserver.geoengine.pathfinding.model.BlockType getBlockType(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public abstract short getHeight(int, int);
    descriptor: (II)S
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract byte getNswe(int, int);
    descriptor: (II)B
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.util.List<ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo> getLayers(int, int);
    descriptor: (II)Ljava/util/List;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #14                          // (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public abstract boolean isLoaded(int, int);
    descriptor: (II)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean hasL2JData(int, int);
    descriptor: (II)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean hasConvDatData(int, int);
    descriptor: (II)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.lang.Short getConvDatHeight(int, int);
    descriptor: (II)Ljava/lang/Short;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleAnnotations:
      0: #21()
        org.jetbrains.annotations.Nullable

  public abstract ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$SourcePriority getSourcePriority();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static #50= #2 of #49;           // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #46= #52 of #2;     // LayerInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static final #45= #54 of #2;     // SourcePriority=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #24(#25=[I#26,I#27,I#28],#29=I#30,#31=I#32,#33=[s#34],#35=[s#36,s#37,s#5,s#38,s#39,s#37,s#40,s#8,s#37,s#10,s#37,s#12,s#37,s#41,s#15,s#37,s#17,s#42,s#43,s#18,s#19,s#20,s#22,s#44,s#45,s#46,s#47])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u001aÀ\u0006\u0003"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;","","getBlockType","Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;","geoX","","geoY","getHeight","","getNswe","","getLayers","","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;","isLoaded","","hasL2JData","regionX","regionY","hasConvDatData","getConvDatHeight","(II)Ljava/lang/Short;","getSourcePriority","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;","SourcePriority","LayerInfo","Brproject"]
    )
