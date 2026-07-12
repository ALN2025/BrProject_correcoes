// Bytecode for: ext.mods.gameserver.geoengine.geodata.GeoStructure
// File: ext\mods\gameserver\geoengine\geodata\GeoStructure.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/GeoStructure.class
  Last modified 9 de jul de 2026; size 1460 bytes
  MD5 checksum 933debbc367cb2e0677afdf4a2506a6f
  Compiled from "GeoStructure.java"
public final class ext.mods.gameserver.geoengine.geodata.GeoStructure
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #1                          // ext/mods/gameserver/geoengine/geodata/GeoStructure
  super_class: #6                         // java/lang/Object
  interfaces: 0, fields: 27, methods: 1, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/geoengine/geodata/GeoStructure
   #2 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
   #3 = Class              #4             // ext/mods/gameserver/model/World
   #4 = Utf8               ext/mods/gameserver/model/World
   #5 = Methodref          #6.#7          // java/lang/Object."<init>":()V
   #6 = Class              #8             // java/lang/Object
   #7 = NameAndType        #9:#10         // "<init>":()V
   #8 = Utf8               java/lang/Object
   #9 = Utf8               <init>
  #10 = Utf8               ()V
  #11 = Class              #12            // java/lang/IllegalStateException
  #12 = Utf8               java/lang/IllegalStateException
  #13 = String             #14            // Utility class
  #14 = Utf8               Utility class
  #15 = Methodref          #11.#16        // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #16 = NameAndType        #9:#17         // "<init>":(Ljava/lang/String;)V
  #17 = Utf8               (Ljava/lang/String;)V
  #18 = Utf8               CELL_FLAG_NONE
  #19 = Utf8               B
  #20 = Utf8               ConstantValue
  #21 = Integer            0
  #22 = Utf8               CELL_FLAG_E
  #23 = Integer            1
  #24 = Utf8               CELL_FLAG_W
  #25 = Integer            2
  #26 = Utf8               CELL_FLAG_S
  #27 = Integer            4
  #28 = Utf8               CELL_FLAG_N
  #29 = Integer            8
  #30 = Utf8               CELL_FLAG_ALL
  #31 = Integer            15
  #32 = Utf8               CELL_SIZE
  #33 = Utf8               I
  #34 = Integer            16
  #35 = Utf8               CELL_HEIGHT
  #36 = Utf8               CELL_IGNORE_HEIGHT
  #37 = Integer            48
  #38 = Utf8               TYPE_FLAT_L2J_L2OFF
  #39 = Utf8               TYPE_COMPLEX_L2J
  #40 = Utf8               TYPE_COMPLEX_L2OFF
  #41 = Integer            64
  #42 = Utf8               TYPE_MULTILAYER_L2J
  #43 = Utf8               BLOCK_CELLS_X
  #44 = Utf8               BLOCK_CELLS_Y
  #45 = Utf8               BLOCK_CELLS
  #46 = Utf8               REGION_BLOCKS_X
  #47 = Integer            256
  #48 = Utf8               REGION_BLOCKS_Y
  #49 = Utf8               REGION_BLOCKS
  #50 = Integer            65536
  #51 = Utf8               REGION_CELLS_X
  #52 = Integer            2048
  #53 = Utf8               REGION_CELLS_Y
  #54 = Utf8               GEO_REGIONS_X
  #55 = Integer            11
  #56 = Utf8               GEO_REGIONS_Y
  #57 = Utf8               GEO_BLOCKS_X
  #58 = Integer            2816
  #59 = Utf8               GEO_BLOCKS_Y
  #60 = Integer            4096
  #61 = Utf8               GEO_CELLS_X
  #62 = Integer            22528
  #63 = Utf8               GEO_CELLS_Y
  #64 = Integer            32768
  #65 = Utf8               Code
  #66 = Utf8               LineNumberTable
  #67 = Utf8               LocalVariableTable
  #68 = Utf8               this
  #69 = Utf8               Lext/mods/gameserver/geoengine/geodata/GeoStructure;
  #70 = Utf8               SourceFile
  #71 = Utf8               GeoStructure.java
{
  public static final byte CELL_FLAG_NONE;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final byte CELL_FLAG_E;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final byte CELL_FLAG_W;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final byte CELL_FLAG_S;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final byte CELL_FLAG_N;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final byte CELL_FLAG_ALL;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 15

  public static final int CELL_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16

  public static final int CELL_HEIGHT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int CELL_IGNORE_HEIGHT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 48

  public static final byte TYPE_FLAT_L2J_L2OFF;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final byte TYPE_COMPLEX_L2J;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final byte TYPE_COMPLEX_L2OFF;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 64

  public static final byte TYPE_MULTILAYER_L2J;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int BLOCK_CELLS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int BLOCK_CELLS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int BLOCK_CELLS;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 64

  public static final int REGION_BLOCKS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 256

  public static final int REGION_BLOCKS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 256

  public static final int REGION_BLOCKS;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 65536

  public static final int REGION_CELLS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2048

  public static final int REGION_CELLS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2048

  public static final int GEO_REGIONS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 11

  public static final int GEO_REGIONS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16

  public static final int GEO_BLOCKS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2816

  public static final int GEO_BLOCKS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4096

  public static final int GEO_CELLS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 22528

  public static final int GEO_CELLS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32768

}
SourceFile: "GeoStructure.java"
