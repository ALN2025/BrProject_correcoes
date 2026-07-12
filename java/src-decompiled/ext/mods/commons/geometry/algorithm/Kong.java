// Bytecode for: ext.mods.commons.geometry.algorithm.Kong
// File: ext\mods\commons\geometry\algorithm\Kong.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/geometry/algorithm/Kong.class
  Last modified 9 de jul de 2026; size 6145 bytes
  MD5 checksum de295fb4a6f280aa01fd678a86c2a2d2
  Compiled from "Kong.java"
public class ext.mods.commons.geometry.algorithm.Kong
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #26                         // ext/mods/commons/geometry/algorithm/Kong
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 10, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/IllegalStateException
    #8 = Utf8               java/lang/IllegalStateException
    #9 = String             #10           // Utility class
   #10 = Utf8               Utility class
   #11 = Methodref          #7.#12        // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;)V
   #14 = InterfaceMethodref #15.#16       // java/util/List.size:()I
   #15 = Class              #17           // java/util/List
   #16 = NameAndType        #18:#19       // size:()I
   #17 = Utf8               java/util/List
   #18 = Utf8               size
   #19 = Utf8               ()I
   #20 = Class              #21           // java/lang/IndexOutOfBoundsException
   #21 = Utf8               java/lang/IndexOutOfBoundsException
   #22 = String             #23           // Can\'t triangulate polygon from less than 3 coordinates.
   #23 = Utf8               Can\'t triangulate polygon from less than 3 coordinates.
   #24 = Methodref          #20.#12       // java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
   #25 = Methodref          #26.#27       // ext/mods/commons/geometry/algorithm/Kong.getPolygonOrientation:(Ljava/util/List;)Z
   #26 = Class              #28           // ext/mods/commons/geometry/algorithm/Kong
   #27 = NameAndType        #29:#30       // getPolygonOrientation:(Ljava/util/List;)Z
   #28 = Utf8               ext/mods/commons/geometry/algorithm/Kong
   #29 = Utf8               getPolygonOrientation
   #30 = Utf8               (Ljava/util/List;)Z
   #31 = Methodref          #26.#32       // ext/mods/commons/geometry/algorithm/Kong.calculateNonConvexPoints:(Ljava/util/List;Z)Ljava/util/List;
   #32 = NameAndType        #33:#34       // calculateNonConvexPoints:(Ljava/util/List;Z)Ljava/util/List;
   #33 = Utf8               calculateNonConvexPoints
   #34 = Utf8               (Ljava/util/List;Z)Ljava/util/List;
   #35 = Methodref          #26.#36       // ext/mods/commons/geometry/algorithm/Kong.doTriangulationAlgorithm:(Ljava/util/List;ZLjava/util/List;)Ljava/util/List;
   #36 = NameAndType        #37:#38       // doTriangulationAlgorithm:(Ljava/util/List;ZLjava/util/List;)Ljava/util/List;
   #37 = Utf8               doTriangulationAlgorithm
   #38 = Utf8               (Ljava/util/List;ZLjava/util/List;)Ljava/util/List;
   #39 = InterfaceMethodref #15.#40       // java/util/List.get:(I)Ljava/lang/Object;
   #40 = NameAndType        #41:#42       // get:(I)Ljava/lang/Object;
   #41 = Utf8               get
   #42 = Utf8               (I)Ljava/lang/Object;
   #43 = Class              #44           // ext/mods/gameserver/model/location/Point2D
   #44 = Utf8               ext/mods/gameserver/model/location/Point2D
   #45 = Methodref          #43.#46       // ext/mods/gameserver/model/location/Point2D.getX:()I
   #46 = NameAndType        #47:#19       // getX:()I
   #47 = Utf8               getX
   #48 = Methodref          #43.#49       // ext/mods/gameserver/model/location/Point2D.getY:()I
   #49 = NameAndType        #50:#19       // getY:()I
   #50 = Utf8               getY
   #51 = Methodref          #26.#52       // ext/mods/commons/geometry/algorithm/Kong.getPrevIndex:(II)I
   #52 = NameAndType        #53:#54       // getPrevIndex:(II)I
   #53 = Utf8               getPrevIndex
   #54 = Utf8               (II)I
   #55 = Methodref          #26.#56       // ext/mods/commons/geometry/algorithm/Kong.getNextIndex:(II)I
   #56 = NameAndType        #57:#54       // getNextIndex:(II)I
   #57 = Utf8               getNextIndex
   #58 = Class              #59           // java/util/ArrayList
   #59 = Utf8               java/util/ArrayList
   #60 = Methodref          #58.#3        // java/util/ArrayList."<init>":()V
   #61 = InterfaceMethodref #15.#62       // java/util/List.add:(Ljava/lang/Object;)Z
   #62 = NameAndType        #63:#64       // add:(Ljava/lang/Object;)Z
   #63 = Utf8               add
   #64 = Utf8               (Ljava/lang/Object;)Z
   #65 = Methodref          #26.#66       // ext/mods/commons/geometry/algorithm/Kong.isEar:(ZLjava/util/List;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
   #66 = NameAndType        #67:#68       // isEar:(ZLjava/util/List;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
   #67 = Utf8               isEar
   #68 = Utf8               (ZLjava/util/List;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
   #69 = Class              #70           // ext/mods/commons/geometry/Triangle
   #70 = Utf8               ext/mods/commons/geometry/Triangle
   #71 = Methodref          #69.#72       // ext/mods/commons/geometry/Triangle."<init>":(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)V
   #72 = NameAndType        #5:#73        // "<init>":(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)V
   #73 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)V
   #74 = InterfaceMethodref #15.#75       // java/util/List.remove:(I)Ljava/lang/Object;
   #75 = NameAndType        #76:#42       // remove:(I)Ljava/lang/Object;
   #76 = Utf8               remove
   #77 = Class              #78           // java/lang/IllegalArgumentException
   #78 = Utf8               java/lang/IllegalArgumentException
   #79 = String             #80           // Coordinates are not aligned to form monotone polygon.
   #80 = Utf8               Coordinates are not aligned to form monotone polygon.
   #81 = Methodref          #77.#12       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #82 = Methodref          #26.#83       // ext/mods/commons/geometry/algorithm/Kong.isConvex:(ZLext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
   #83 = NameAndType        #84:#85       // isConvex:(ZLext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
   #84 = Utf8               isConvex
   #85 = Utf8               (ZLext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
   #86 = InterfaceMethodref #15.#87       // java/util/List.iterator:()Ljava/util/Iterator;
   #87 = NameAndType        #88:#89       // iterator:()Ljava/util/Iterator;
   #88 = Utf8               iterator
   #89 = Utf8               ()Ljava/util/Iterator;
   #90 = InterfaceMethodref #91.#92       // java/util/Iterator.hasNext:()Z
   #91 = Class              #93           // java/util/Iterator
   #92 = NameAndType        #94:#95       // hasNext:()Z
   #93 = Utf8               java/util/Iterator
   #94 = Utf8               hasNext
   #95 = Utf8               ()Z
   #96 = InterfaceMethodref #91.#97       // java/util/Iterator.next:()Ljava/lang/Object;
   #97 = NameAndType        #98:#99       // next:()Ljava/lang/Object;
   #98 = Utf8               next
   #99 = Utf8               ()Ljava/lang/Object;
  #100 = Methodref          #26.#101      // ext/mods/commons/geometry/algorithm/Kong.isInside:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
  #101 = NameAndType        #102:#103     // isInside:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
  #102 = Utf8               isInside
  #103 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
  #104 = Utf8               TRIANGULATION_MAX_LOOPS
  #105 = Utf8               I
  #106 = Utf8               ConstantValue
  #107 = Integer            100
  #108 = Utf8               Code
  #109 = Utf8               LineNumberTable
  #110 = Utf8               LocalVariableTable
  #111 = Utf8               this
  #112 = Utf8               Lext/mods/commons/geometry/algorithm/Kong;
  #113 = Utf8               doTriangulation
  #114 = Utf8               (Ljava/util/List;)Ljava/util/List;
  #115 = Utf8               points
  #116 = Utf8               Ljava/util/List;
  #117 = Utf8               isCw
  #118 = Utf8               Z
  #119 = Utf8               nonConvexPoints
  #120 = Utf8               LocalVariableTypeTable
  #121 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
  #122 = Utf8               StackMapTable
  #123 = Utf8               Exceptions
  #124 = Utf8               Signature
  #125 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)Ljava/util/List<Lext/mods/commons/geometry/Triangle;>;
  #126 = Utf8               pt
  #127 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #128 = Utf8               i
  #129 = Utf8               index
  #130 = Utf8               point
  #131 = Utf8               pointPrev
  #132 = Utf8               pointNext
  #133 = Utf8               vx
  #134 = Utf8               vy
  #135 = Utf8               res
  #136 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)Z
  #137 = Utf8               pointNextNext
  #138 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;Z)Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
  #139 = Utf8               indexPrev
  #140 = Utf8               indexNext
  #141 = Utf8               triangles
  #142 = Utf8               loops
  #143 = Utf8               Ljava/util/List<Lext/mods/commons/geometry/Triangle;>;
  #144 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;ZLjava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)Ljava/util/List<Lext/mods/commons/geometry/Triangle;>;
  #145 = Utf8               p
  #146 = Utf8               A
  #147 = Utf8               B
  #148 = Utf8               C
  #149 = Utf8               (ZLjava/util/List<Lext/mods/gameserver/model/location/Point2D;>;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Z
  #150 = Utf8               BAx
  #151 = Utf8               BAy
  #152 = Utf8               cw
  #153 = Utf8               P
  #154 = Utf8               CAx
  #155 = Utf8               CAy
  #156 = Utf8               PAx
  #157 = Utf8               PAy
  #158 = Utf8               detXYZ
  #159 = Utf8               D
  #160 = Utf8               ba
  #161 = Utf8               ca
  #162 = Utf8               SourceFile
  #163 = Utf8               Kong.java
{
  public static final java.util.List<ext.mods.commons.geometry.Triangle> doTriangulation(java.util.List<ext.mods.gameserver.model.location.Point2D>) throws java.lang.IndexOutOfBoundsException, java.lang.IllegalArgumentException;
    descriptor: (Ljava/util/List;)Ljava/util/List;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: invokeinterface #14,  1           // InterfaceMethod java/util/List.size:()I
         6: iconst_3
         7: if_icmpge     20
        10: new           #20                 // class java/lang/IndexOutOfBoundsException
        13: dup
        14: ldc           #22                 // String Can\'t triangulate polygon from less than 3 coordinates.
        16: invokespecial #24                 // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
        19: athrow
        20: aload_0
        21: invokestatic  #25                 // Method getPolygonOrientation:(Ljava/util/List;)Z
        24: istore_1
        25: aload_0
        26: iload_1
        27: invokestatic  #31                 // Method calculateNonConvexPoints:(Ljava/util/List;Z)Ljava/util/List;
        30: astore_2
        31: aload_0
        32: iload_1
        33: aload_2
        34: invokestatic  #35                 // Method doTriangulationAlgorithm:(Ljava/util/List;ZLjava/util/List;)Ljava/util/List;
        37: areturn
      LineNumberTable:
        line 47: 0
        line 48: 10
        line 50: 20
        line 52: 25
        line 54: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0 points   Ljava/util/List;
           25      13     1  isCw   Z
           31       7     2 nonConvexPoints   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      38     0 points   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
           31       7     2 nonConvexPoints   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */
    Exceptions:
      throws java.lang.IndexOutOfBoundsException, java.lang.IllegalArgumentException
    Signature: #125                         // (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)Ljava/util/List<Lext/mods/commons/geometry/Triangle;>;
}
SourceFile: "Kong.java"
