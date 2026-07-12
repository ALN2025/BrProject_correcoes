// Bytecode for: ext.mods.gameserver.geoengine.geodata.BlockNull
// File: ext\mods\gameserver\geoengine\geodata\BlockNull.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/BlockNull.class
  Last modified 9 de jul de 2026; size 2587 bytes
  MD5 checksum 04a922c49447ed7349376bee224343ec
  Compiled from "BlockNull.kt"
public final class ext.mods.gameserver.geoengine.geodata.BlockNull extends ext.mods.gameserver.geoengine.geodata.ABlock
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/geodata/BlockNull
  super_class: #4                         // ext/mods/gameserver/geoengine/geodata/ABlock
  interfaces: 0, fields: 1, methods: 10, attributes: 2
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockNull
   #2 = Class              #1             // ext/mods/gameserver/geoengine/geodata/BlockNull
   #3 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
   #4 = Class              #3             // ext/mods/gameserver/geoengine/geodata/ABlock
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockNull;
  #11 = Utf8               hasGeoPos
  #12 = Utf8               ()Z
  #13 = Utf8               getHeightNearest
  #14 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #15 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #16 = Utf8               geoX
  #17 = Utf8               I
  #18 = Utf8               geoY
  #19 = Utf8               worldZ
  #20 = Utf8               ignore
  #21 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #22 = Utf8               getNsweNearest
  #23 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #24 = Utf8               getIndexNearest
  #25 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #26 = Utf8               getIndexAbove
  #27 = Utf8               getIndexBelow
  #28 = Utf8               getHeight
  #29 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #30 = Utf8               index
  #31 = Utf8               getNswe
  #32 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #33 = Utf8               <clinit>
  #34 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/geodata/BlockNull."<init>":()V
  #35 = Utf8               INSTANCE
  #36 = NameAndType        #35:#10        // INSTANCE:Lext/mods/gameserver/geoengine/geodata/BlockNull;
  #37 = Fieldref           #2.#36         // ext/mods/gameserver/geoengine/geodata/BlockNull.INSTANCE:Lext/mods/gameserver/geoengine/geodata/BlockNull;
  #38 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #39 = Utf8               Lkotlin/Metadata;
  #40 = Utf8               mv
  #41 = Integer            2
  #42 = Integer            3
  #43 = Integer            0
  #44 = Utf8               k
  #45 = Integer            1
  #46 = Utf8               xi
  #47 = Integer            48
  #48 = Utf8               d1
  #49 = Utf8               \u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0016
  #50 = Utf8               d2
  #51 = Utf8               Lext/mods/gameserver/geoengine/geodata/ABlock;
  #52 = Utf8
  #53 = Utf8               Brproject
  #54 = Utf8               BlockNull.kt
  #55 = Utf8               RuntimeInvisibleAnnotations
  #56 = Utf8               Code
  #57 = Utf8               LineNumberTable
  #58 = Utf8               LocalVariableTable
  #59 = Utf8               RuntimeInvisibleParameterAnnotations
  #60 = Utf8               SourceFile
  #61 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.geodata.BlockNull INSTANCE;
    descriptor: Lext/mods/gameserver/geoengine/geodata/BlockNull;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #38()
        org.jetbrains.annotations.NotNull

  public boolean hasGeoPos();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockNull;

  public short getHeightNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: iload_3
         1: i2s
         2: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/geoengine/geodata/BlockNull;
            0       3     1  geoX   I
            0       3     2  geoY   I
            0       3     3 worldZ   I
            0       3     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #15()
          org.jetbrains.annotations.Nullable

  public byte getNsweNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: bipush        15
         2: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/geoengine/geodata/BlockNull;
            0       3     1  geoX   I
            0       3     2  geoY   I
            0       3     3 worldZ   I
            0       3     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #15()
          org.jetbrains.annotations.Nullable

  public int getIndexNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockNull;
            0       2     1  geoX   I
            0       2     2  geoY   I
            0       2     3 worldZ   I
            0       2     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #15()
          org.jetbrains.annotations.Nullable

  public int getIndexAbove(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockNull;
            0       2     1  geoX   I
            0       2     2  geoY   I
            0       2     3 worldZ   I
            0       2     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #15()
          org.jetbrains.annotations.Nullable

  public int getIndexBelow(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockNull;
            0       2     1  geoX   I
            0       2     2  geoY   I
            0       2     3 worldZ   I
            0       2     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #15()
          org.jetbrains.annotations.Nullable

  public short getHeight(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockNull;
            0       2     1 index   I
            0       2     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #15()
          org.jetbrains.annotations.Nullable

  public byte getNswe(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: bipush        15
         2: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/geoengine/geodata/BlockNull;
            0       3     1 index   I
            0       3     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #15()
          org.jetbrains.annotations.Nullable

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/geodata/BlockNull
         3: dup
         4: invokespecial #34                 // Method "<init>":()V
         7: putstatic     #37                 // Field INSTANCE:Lext/mods/gameserver/geoengine/geodata/BlockNull;
        10: return
}
SourceFile: "BlockNull.kt"
RuntimeVisibleAnnotations:
  0: #39(#40=[I#41,I#42,I#43],#44=I#45,#46=I#47,#48=[s#49],#50=[s#10,s#51,s#5,s#6,s#11,s#52,s#13,s#52,s#16,s#52,s#18,s#19,s#20,s#21,s#22,s#52,s#24,s#26,s#27,s#28,s#30,s#31,s#53])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0016"]
      d2=["Lext/mods/gameserver/geoengine/geodata/BlockNull;","Lext/mods/gameserver/geoengine/geodata/ABlock;","<init>","()V","hasGeoPos","","getHeightNearest","","geoX","","geoY","worldZ","ignore","Lext/mods/gameserver/geoengine/geodata/IGeoObject;","getNsweNearest","","getIndexNearest","getIndexAbove","getIndexBelow","getHeight","index","getNswe","Brproject"]
    )
