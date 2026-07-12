// Bytecode for: ext.mods.gameserver.geoengine.geodata.BlockFlat
// File: ext\mods\gameserver\geoengine\geodata\BlockFlat.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/BlockFlat.class
  Last modified 9 de jul de 2026; size 2101 bytes
  MD5 checksum 67f7955fe444ef05c571acbbe2912ffe
  Compiled from "BlockFlat.java"
public class ext.mods.gameserver.geoengine.geodata.BlockFlat extends ext.mods.gameserver.geoengine.geodata.ABlock
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/geoengine/geodata/BlockFlat
  super_class: #2                         // ext/mods/gameserver/geoengine/geodata/ABlock
  interfaces: 0, fields: 2, methods: 9, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/geoengine/geodata/ABlock
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/nio/ByteBuffer.getShort:()S
   #8 = Class              #10            // java/nio/ByteBuffer
   #9 = NameAndType        #11:#12        // getShort:()S
  #10 = Utf8               java/nio/ByteBuffer
  #11 = Utf8               getShort
  #12 = Utf8               ()S
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/geoengine/geodata/BlockFlat._height:S
  #14 = Class              #16            // ext/mods/gameserver/geoengine/geodata/BlockFlat
  #15 = NameAndType        #17:#18        // _height:S
  #16 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockFlat
  #17 = Utf8               _height
  #18 = Utf8               S
  #19 = Class              #20            // ext/mods/gameserver/geoengine/geodata/GeoStructure
  #20 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
  #21 = Fieldref           #14.#22        // ext/mods/gameserver/geoengine/geodata/BlockFlat._nswe:B
  #22 = NameAndType        #23:#24        // _nswe:B
  #23 = Utf8               _nswe
  #24 = Utf8               B
  #25 = Fieldref           #26.#27        // ext/mods/gameserver/enums/GeoType.L2OFF:Lext/mods/gameserver/enums/GeoType;
  #26 = Class              #28            // ext/mods/gameserver/enums/GeoType
  #27 = NameAndType        #29:#30        // L2OFF:Lext/mods/gameserver/enums/GeoType;
  #28 = Utf8               ext/mods/gameserver/enums/GeoType
  #29 = Utf8               L2OFF
  #30 = Utf8               Lext/mods/gameserver/enums/GeoType;
  #31 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/gameserver/enums/GeoType;)V
  #32 = Utf8               Code
  #33 = Utf8               LineNumberTable
  #34 = Utf8               LocalVariableTable
  #35 = Utf8               this
  #36 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockFlat;
  #37 = Utf8               bb
  #38 = Utf8               Ljava/nio/ByteBuffer;
  #39 = Utf8               type
  #40 = Utf8               StackMapTable
  #41 = Utf8               hasGeoPos
  #42 = Utf8               ()Z
  #43 = Utf8               getHeightNearest
  #44 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #45 = Utf8               geoX
  #46 = Utf8               I
  #47 = Utf8               geoY
  #48 = Utf8               worldZ
  #49 = Utf8               ignore
  #50 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #51 = Utf8               getNsweNearest
  #52 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #53 = Utf8               getIndexNearest
  #54 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #55 = Utf8               getIndexAbove
  #56 = Utf8               getIndexBelow
  #57 = Utf8               getHeight
  #58 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #59 = Utf8               index
  #60 = Utf8               getNswe
  #61 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #62 = Utf8               SourceFile
  #63 = Utf8               BlockFlat.java
{
  protected final short _height;
    descriptor: S
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected byte _nswe;
    descriptor: B
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.geoengine.geodata.BlockFlat(java.nio.ByteBuffer, ext.mods.gameserver.enums.GeoType);
    descriptor: (Ljava/nio/ByteBuffer;Lext/mods/gameserver/enums/GeoType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
         4: aload_0
         5: aload_1
         6: invokevirtual #7                  // Method java/nio/ByteBuffer.getShort:()S
         9: putfield      #13                 // Field _height:S
        12: aload_0
        13: bipush        15
        15: putfield      #21                 // Field _nswe:B
        18: aload_2
        19: getstatic     #25                 // Field ext/mods/gameserver/enums/GeoType.L2OFF:Lext/mods/gameserver/enums/GeoType;
        22: if_acmpne     30
        25: aload_1
        26: invokevirtual #7                  // Method java/nio/ByteBuffer.getShort:()S
        29: pop
        30: return
      LineNumberTable:
        line 35: 0
        line 36: 4
        line 37: 12
        line 39: 18
        line 40: 25
        line 41: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
            0      31     1    bb   Ljava/nio/ByteBuffer;
            0      31     2  type   Lext/mods/gameserver/enums/GeoType;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/geoengine/geodata/BlockFlat, class java/nio/ByteBuffer, class ext/mods/gameserver/enums/GeoType ]
          stack = []

  public final boolean hasGeoPos();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;

  public final short getHeightNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=5, args_size=5
         0: aload_0
         1: getfield      #13                 // Field _height:S
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
            0       5     1  geoX   I
            0       5     2  geoY   I
            0       5     3 worldZ   I
            0       5     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;

  public final byte getNsweNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=5, args_size=5
         0: aload_0
         1: getfield      #21                 // Field _nswe:B
         4: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
            0       5     1  geoX   I
            0       5     2  geoY   I
            0       5     3 worldZ   I
            0       5     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;

  public final int getIndexNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=5, args_size=5
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
            0       2     1  geoX   I
            0       2     2  geoY   I
            0       2     3 worldZ   I
            0       2     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;

  public final int getIndexAbove(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: getfield      #13                 // Field _height:S
         4: iload_3
         5: if_icmple     12
         8: iconst_0
         9: goto          13
        12: iconst_m1
        13: ireturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
            0      14     1  geoX   I
            0      14     2  geoY   I
            0      14     3 worldZ   I
            0      14     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int getIndexBelow(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: getfield      #13                 // Field _height:S
         4: iload_3
         5: if_icmpge     12
         8: iconst_0
         9: goto          13
        12: iconst_m1
        13: ireturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
            0      14     1  geoX   I
            0      14     2  geoY   I
            0      14     3 worldZ   I
            0      14     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final short getHeight(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=3, args_size=3
         0: aload_0
         1: getfield      #13                 // Field _height:S
         4: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
            0       5     1 index   I
            0       5     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;

  public final byte getNswe(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=3, args_size=3
         0: aload_0
         1: getfield      #21                 // Field _nswe:B
         4: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
            0       5     1 index   I
            0       5     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
}
SourceFile: "BlockFlat.java"
