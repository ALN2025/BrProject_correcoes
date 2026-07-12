// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode
// File: ext\mods\gameserver\geoengine\pathfinding\model\IndexedNode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.class
  Last modified 9 de jul de 2026; size 5998 bytes
  MD5 checksum 0183354de19711f390eacbca3ba94542
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 26, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               id
   #12 = Utf8               I
   #13 = NameAndType        #11:#12       // id:I
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.id:I
   #15 = Utf8               geoX
   #16 = NameAndType        #15:#12       // geoX:I
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.geoX:I
   #18 = Utf8               geoY
   #19 = NameAndType        #18:#12       // geoY:I
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.geoY:I
   #21 = Utf8               worldZ
   #22 = Utf8               S
   #23 = NameAndType        #21:#22       // worldZ:S
   #24 = Fieldref           #2.#23        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.worldZ:S
   #25 = Utf8               nswe
   #26 = Utf8               B
   #27 = NameAndType        #25:#26       // nswe:B
   #28 = Fieldref           #2.#27        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.nswe:B
   #29 = Utf8               layer
   #30 = NameAndType        #29:#12       // layer:I
   #31 = Fieldref           #2.#30        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.layer:I
   #32 = Utf8               blockType
   #33 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #34 = NameAndType        #32:#33       // blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #35 = Fieldref           #2.#34        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #36 = Utf8               this
   #37 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
   #38 = Utf8               (IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #39 = NameAndType        #5:#6         // "<init>":(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
   #40 = Methodref          #2.#39        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode."<init>":(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
   #41 = Utf8               getId
   #42 = Utf8               ()I
   #43 = Utf8               getGeoX
   #44 = Utf8               getGeoY
   #45 = Utf8               getWorldZ
   #46 = Utf8               ()S
   #47 = Utf8               getNswe
   #48 = Utf8               ()B
   #49 = Utf8               getLayer
   #50 = Utf8               getBlockType
   #51 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #52 = Utf8               isWalkable
   #53 = Utf8               ()Z
   #54 = Utf8               getWorldX
   #55 = Integer            65536
   #56 = Utf8               getWorldY
   #57 = Integer            40960
   #58 = Utf8               toLocation
   #59 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #60 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
   #61 = Class              #60           // ext/mods/gameserver/geoengine/pathfinding/model/Location
   #62 = NameAndType        #54:#42       // getWorldX:()I
   #63 = Methodref          #2.#62        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getWorldX:()I
   #64 = NameAndType        #56:#42       // getWorldY:()I
   #65 = Methodref          #2.#64        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getWorldY:()I
   #66 = Utf8               (III)V
   #67 = NameAndType        #5:#66        // "<init>":(III)V
   #68 = Methodref          #61.#67       // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
   #69 = Utf8               toGeoLocation
   #70 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #71 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
   #72 = Class              #71           // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
   #73 = Utf8               (IIS)V
   #74 = NameAndType        #5:#73        // "<init>":(IIS)V
   #75 = Methodref          #72.#74       // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
   #76 = Utf8               component1
   #77 = Utf8               component2
   #78 = Utf8               component3
   #79 = Utf8               component4
   #80 = Utf8               component5
   #81 = Utf8               component6
   #82 = Utf8               component7
   #83 = Utf8               copy
   #84 = Utf8               (IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
   #85 = Utf8               copy$default
   #86 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
   #87 = NameAndType        #83:#84       // copy:(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
   #88 = Methodref          #2.#87        // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.copy:(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
   #89 = Utf8               toString
   #90 = Utf8               ()Ljava/lang/String;
   #91 = Utf8               IndexedNode(id=\u0001, geoX=\u0001, geoY=\u0001, worldZ=\u0001, nswe=\u0001, layer=\u0001, blockType=\u0001)
   #92 = String             #91           // IndexedNode(id=\u0001, geoX=\u0001, geoY=\u0001, worldZ=\u0001, nswe=\u0001, layer=\u0001, blockType=\u0001)
   #93 = Utf8               java/lang/invoke/StringConcatFactory
   #94 = Class              #93           // java/lang/invoke/StringConcatFactory
   #95 = Utf8               makeConcatWithConstants
   #96 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #97 = NameAndType        #95:#96       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #98 = Methodref          #94.#97       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #99 = MethodHandle       6:#98         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #100 = Utf8               (IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Ljava/lang/String;
  #101 = NameAndType        #95:#100      // makeConcatWithConstants:(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Ljava/lang/String;
  #102 = InvokeDynamic      #0:#101       // #0:makeConcatWithConstants:(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Ljava/lang/String;
  #103 = Utf8               hashCode
  #104 = Utf8               java/lang/Integer
  #105 = Class              #104          // java/lang/Integer
  #106 = Utf8               (I)I
  #107 = NameAndType        #103:#106     // hashCode:(I)I
  #108 = Methodref          #105.#107     // java/lang/Integer.hashCode:(I)I
  #109 = Utf8               java/lang/Short
  #110 = Class              #109          // java/lang/Short
  #111 = Utf8               (S)I
  #112 = NameAndType        #103:#111     // hashCode:(S)I
  #113 = Methodref          #110.#112     // java/lang/Short.hashCode:(S)I
  #114 = Utf8               java/lang/Byte
  #115 = Class              #114          // java/lang/Byte
  #116 = Utf8               (B)I
  #117 = NameAndType        #103:#116     // hashCode:(B)I
  #118 = Methodref          #115.#117     // java/lang/Byte.hashCode:(B)I
  #119 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/BlockType
  #120 = Class              #119          // ext/mods/gameserver/geoengine/pathfinding/model/BlockType
  #121 = NameAndType        #103:#42      // hashCode:()I
  #122 = Methodref          #120.#121     // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.hashCode:()I
  #123 = Utf8               result
  #124 = Utf8               equals
  #125 = Utf8               (Ljava/lang/Object;)Z
  #126 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #127 = Utf8               other
  #128 = Utf8               Ljava/lang/Object;
  #129 = Utf8               Lkotlin/Metadata;
  #130 = Utf8               mv
  #131 = Integer            2
  #132 = Integer            3
  #133 = Integer            0
  #134 = Utf8               k
  #135 = Integer            1
  #136 = Utf8               xi
  #137 = Integer            48
  #138 = Utf8               d1
  #139 = Utf8               \u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010\'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010-\u001a\u00020\u001b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u0010¨\u00062
  #140 = Utf8               d2
  #141 = Utf8
  #142 = Utf8               worldX
  #143 = Utf8               worldY
  #144 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #145 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #146 = Utf8               Brproject
  #147 = Utf8               Location.kt
  #148 = Utf8               RuntimeInvisibleAnnotations
  #149 = Utf8               Code
  #150 = Utf8               LineNumberTable
  #151 = Utf8               LocalVariableTable
  #152 = Utf8               RuntimeInvisibleParameterAnnotations
  #153 = Utf8               StackMapTable
  #154 = Utf8               SourceFile
  #155 = Utf8               RuntimeVisibleAnnotations
  #156 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode(int, int, int, short, byte, int, ext.mods.gameserver.geoengine.pathfinding.model.BlockType);
    descriptor: (IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=8, args_size=8
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #14                 // Field id:I
         9: aload_0
        10: iload_2
        11: putfield      #17                 // Field geoX:I
        14: aload_0
        15: iload_3
        16: putfield      #20                 // Field geoY:I
        19: aload_0
        20: iload         4
        22: putfield      #24                 // Field worldZ:S
        25: aload_0
        26: iload         5
        28: putfield      #28                 // Field nswe:B
        31: aload_0
        32: iload         6
        34: putfield      #31                 // Field layer:I
        37: aload_0
        38: aload         7
        40: putfield      #35                 // Field blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        43: return
      LineNumberTable:
        line 104: 0
        line 105: 4
        line 106: 9
        line 107: 14
        line 108: 19
        line 109: 25
        line 110: 31
        line 111: 37
        line 104: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
            0      44     1    id   I
            0      44     2  geoX   I
            0      44     3  geoY   I
            0      44     4 worldZ   S
            0      44     5  nswe   B
            0      44     6 layer   I
            0      44     7 blockType   Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #7()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode(int, int, int, short, byte, int, ext.mods.gameserver.geoengine.pathfinding.model.BlockType, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=10
         0: iload         8
         2: bipush        32
         4: iand
         5: ifeq          11
         8: iconst_0
         9: istore        6
        11: aload_0
        12: iload_1
        13: iload_2
        14: iload_3
        15: iload         4
        17: iload         5
        19: iload         6
        21: aload         7
        23: invokespecial #40                 // Method "<init>":(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
        26: return
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */
      LineNumberTable:
        line 104: 0
        line 110: 8
        line 104: 11
        line 112: 26

  public final int getId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field id:I
         4: ireturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final int getGeoX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field geoX:I
         4: ireturn
      LineNumberTable:
        line 106: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final int getGeoY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field geoY:I
         4: ireturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final short getWorldZ();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field worldZ:S
         4: ireturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final byte getNswe();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field nswe:B
         4: ireturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final int getLayer();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field layer:I
         4: ireturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final ext.mods.gameserver.geoengine.pathfinding.model.BlockType getBlockType();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
         4: areturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final boolean isWalkable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field nswe:B
         4: ifeq          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 114: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final int getWorldX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field geoX:I
         4: bipush        16
         6: imul
         7: ldc           #55                 // int 65536
         9: iadd
        10: ireturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final int getWorldY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field geoY:I
         4: bipush        16
         6: imul
         7: ldc           #57                 // int 40960
         9: iadd
        10: ireturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final ext.mods.gameserver.geoengine.pathfinding.model.Location toLocation();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=1, args_size=1
         0: new           #61                 // class ext/mods/gameserver/geoengine/pathfinding/model/Location
         3: dup
         4: aload_0
         5: invokevirtual #63                 // Method getWorldX:()I
         8: aload_0
         9: invokevirtual #65                 // Method getWorldY:()I
        12: aload_0
        13: getfield      #24                 // Field worldZ:S
        16: invokespecial #68                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        19: areturn
      LineNumberTable:
        line 122: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation toGeoLocation();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=1, args_size=1
         0: new           #72                 // class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
         3: dup
         4: aload_0
         5: getfield      #17                 // Field geoX:I
         8: aload_0
         9: getfield      #20                 // Field geoY:I
        12: aload_0
        13: getfield      #24                 // Field worldZ:S
        16: invokespecial #75                 // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
        19: areturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field id:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field geoX:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field geoY:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final short component4();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field worldZ:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final byte component5();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field nswe:B
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final int component6();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field layer:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public final ext.mods.gameserver.geoengine.pathfinding.model.BlockType component7();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode copy(int, int, int, short, byte, int, ext.mods.gameserver.geoengine.pathfinding.model.BlockType);
    descriptor: (IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=8, args_size=8
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: iload         6
        13: aload         7
        15: invokespecial #40                 // Method "<init>":(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
        18: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
            0      19     1    id   I
            0      19     2  geoX   I
            0      19     3  geoY   I
            0      19     4 worldZ   S
            0      19     5  nswe   B
            0      19     6 layer   I
            0      19     7 blockType   Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode copy$default(ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode, int, int, int, short, byte, int, ext.mods.gameserver.geoengine.pathfinding.model.BlockType, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=10
         0: iload         8
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #14                 // Field id:I
        11: istore_1
        12: iload         8
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #17                 // Field geoX:I
        23: istore_2
        24: iload         8
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #20                 // Field geoY:I
        35: istore_3
        36: iload         8
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #24                 // Field worldZ:S
        48: istore        4
        50: iload         8
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #28                 // Field nswe:B
        62: istore        5
        64: iload         8
        66: bipush        32
        68: iand
        69: ifeq          78
        72: aload_0
        73: getfield      #31                 // Field layer:I
        76: istore        6
        78: iload         8
        80: bipush        64
        82: iand
        83: ifeq          92
        86: aload_0
        87: getfield      #35                 // Field blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        90: astore        7
        92: aload_0
        93: iload_1
        94: iload_2
        95: iload_3
        96: iload         4
        98: iload         5
       100: iload         6
       102: aload         7
       104: invokevirtual #88                 // Method copy:(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
       107: areturn
      StackMapTable: number_of_entries = 7
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field id:I
         4: aload_0
         5: getfield      #17                 // Field geoX:I
         8: aload_0
         9: getfield      #20                 // Field geoY:I
        12: aload_0
        13: getfield      #24                 // Field worldZ:S
        16: aload_0
        17: getfield      #28                 // Field nswe:B
        20: aload_0
        21: getfield      #31                 // Field layer:I
        24: aload_0
        25: getfield      #35                 // Field blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        28: invokedynamic #102,  0            // InvokeDynamic #0:makeConcatWithConstants:(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Ljava/lang/String;
        33: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #14                 // Field id:I
         4: invokestatic  #108                // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #17                 // Field geoX:I
        16: invokestatic  #108                // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #20                 // Field geoY:I
        29: invokestatic  #108                // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #24                 // Field worldZ:S
        42: invokestatic  #113                // Method java/lang/Short.hashCode:(S)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #28                 // Field nswe:B
        55: invokestatic  #118                // Method java/lang/Byte.hashCode:(B)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #31                 // Field layer:I
        68: invokestatic  #108                // Method java/lang/Integer.hashCode:(I)I
        71: iadd
        72: istore_1
        73: iload_1
        74: bipush        31
        76: imul
        77: aload_0
        78: getfield      #35                 // Field blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        81: invokevirtual #122                // Method ext/mods/gameserver/geoengine/pathfinding/model/BlockType.hashCode:()I
        84: iadd
        85: istore_1
        86: iload_1
        87: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      80     1 result   I
            0      88     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
        20: astore_2
        21: aload_0
        22: getfield      #14                 // Field id:I
        25: aload_2
        26: getfield      #14                 // Field id:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #17                 // Field geoX:I
        38: aload_2
        39: getfield      #17                 // Field geoX:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #20                 // Field geoY:I
        51: aload_2
        52: getfield      #20                 // Field geoY:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #24                 // Field worldZ:S
        64: aload_2
        65: getfield      #24                 // Field worldZ:S
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: aload_0
        74: getfield      #28                 // Field nswe:B
        77: aload_2
        78: getfield      #28                 // Field nswe:B
        81: if_icmpeq     86
        84: iconst_0
        85: ireturn
        86: aload_0
        87: getfield      #31                 // Field layer:I
        90: aload_2
        91: getfield      #31                 // Field layer:I
        94: if_icmpeq     99
        97: iconst_0
        98: ireturn
        99: aload_0
       100: getfield      #35                 // Field blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
       103: aload_2
       104: getfield      #35                 // Field blockType:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
       107: if_acmpeq     112
       110: iconst_0
       111: ireturn
       112: iconst_1
       113: ireturn
      StackMapTable: number_of_entries = 9
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
            0     114     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #126()
          org.jetbrains.annotations.Nullable
}
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #129(#130=[I#131,I#132,I#133],#134=I#135,#136=I#137,#138=[s#139],#140=[s#37,s#141,s#11,s#141,s#15,s#18,s#21,s#141,s#25,s#141,s#29,s#32,s#33,s#5,s#6,s#41,s#42,s#43,s#44,s#45,s#46,s#47,s#48,s#49,s#50,s#51,s#52,s#141,s#53,s#142,s#54,s#143,s#56,s#58,s#144,s#69,s#145,s#76,s#77,s#78,s#79,s#80,s#81,s#82,s#83,s#124,s#127,s#103,s#89,s#141,s#146])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010\'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010-\u001a\u00020\u001b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u0010¨\u00062"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;","","id","","geoX","geoY","worldZ","","nswe","","layer","blockType","Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;","<init>","(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V","getId","()I","getGeoX","getGeoY","getWorldZ","()S","getNswe","()B","getLayer","getBlockType","()Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;","isWalkable","","()Z","worldX","getWorldX","worldY","getWorldY","toLocation","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","toGeoLocation","Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;","component1","component2","component3","component4","component5","component6","component7","copy","equals","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #92 IndexedNode(id=\u0001, geoX=\u0001, geoY=\u0001, worldZ=\u0001, nswe=\u0001, layer=\u0001, blockType=\u0001)
