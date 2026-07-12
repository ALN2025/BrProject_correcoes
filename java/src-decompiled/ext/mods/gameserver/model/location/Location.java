// Bytecode for: ext.mods.gameserver.model.location.Location
// File: ext\mods\gameserver\model\location\Location.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/Location.class
  Last modified 9 de jul de 2026; size 5976 bytes
  MD5 checksum fd33238d8090da5a277a86cab05459eb
  Compiled from "Location.java"
public class ext.mods.gameserver.model.location.Location extends ext.mods.gameserver.model.location.Point2D
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/location/Location
  super_class: #2                         // ext/mods/gameserver/model/location/Point2D
  interfaces: 0, fields: 2, methods: 23, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
    #2 = Class              #4            // ext/mods/gameserver/model/location/Point2D
    #3 = NameAndType        #5:#6         // "<init>":(II)V
    #4 = Utf8               ext/mods/gameserver/model/location/Point2D
    #5 = Utf8               <init>
    #6 = Utf8               (II)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/location/Location._z:I
    #8 = Class              #10           // ext/mods/gameserver/model/location/Location
    #9 = NameAndType        #11:#12       // _z:I
   #10 = Utf8               ext/mods/gameserver/model/location/Location
   #11 = Utf8               _z
   #12 = Utf8               I
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/location/Location.getX:()I
   #14 = NameAndType        #15:#16       // getX:()I
   #15 = Utf8               getX
   #16 = Utf8               ()I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/model/location/Location.getY:()I
   #18 = NameAndType        #19:#16       // getY:()I
   #19 = Utf8               getY
   #20 = Methodref          #8.#21        // ext/mods/gameserver/model/location/Location.getZ:()I
   #21 = NameAndType        #22:#16       // getZ:()I
   #22 = Utf8               getZ
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #24 = NameAndType        #5:#25        // "<init>":(III)V
   #25 = Utf8               (III)V
   #26 = String             #27           // x
   #27 = Utf8               x
   #28 = Methodref          #29.#30       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #29 = Class              #31           // ext/mods/commons/data/StatSet
   #30 = NameAndType        #32:#33       // getInteger:(Ljava/lang/String;)I
   #31 = Utf8               ext/mods/commons/data/StatSet
   #32 = Utf8               getInteger
   #33 = Utf8               (Ljava/lang/String;)I
   #34 = String             #35           // y
   #35 = Utf8               y
   #36 = String             #37           // z
   #37 = Utf8               z
   #38 = Fieldref           #8.#39        // ext/mods/gameserver/model/location/Location._x:I
   #39 = NameAndType        #40:#12       // _x:I
   #40 = Utf8               _x
   #41 = Fieldref           #8.#42        // ext/mods/gameserver/model/location/Location._y:I
   #42 = NameAndType        #43:#12       // _y:I
   #43 = Utf8               _y
   #44 = Methodref          #2.#45        // ext/mods/gameserver/model/location/Point2D.toString:()Ljava/lang/String;
   #45 = NameAndType        #46:#47       // toString:()Ljava/lang/String;
   #46 = Utf8               toString
   #47 = Utf8               ()Ljava/lang/String;
   #48 = InvokeDynamic      #0:#49        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #49 = NameAndType        #50:#51       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #50 = Utf8               makeConcatWithConstants
   #51 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #52 = Methodref          #2.#53        // ext/mods/gameserver/model/location/Point2D.hashCode:()I
   #53 = NameAndType        #54:#16       // hashCode:()I
   #54 = Utf8               hashCode
   #55 = Class              #56           // java/lang/Object
   #56 = Utf8               java/lang/Object
   #57 = Methodref          #58.#59       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #58 = Class              #60           // java/lang/Integer
   #59 = NameAndType        #61:#62       // valueOf:(I)Ljava/lang/Integer;
   #60 = Utf8               java/lang/Integer
   #61 = Utf8               valueOf
   #62 = Utf8               (I)Ljava/lang/Integer;
   #63 = Methodref          #64.#65       // java/util/Objects.hash:([Ljava/lang/Object;)I
   #64 = Class              #66           // java/util/Objects
   #65 = NameAndType        #67:#68       // hash:([Ljava/lang/Object;)I
   #66 = Utf8               java/util/Objects
   #67 = Utf8               hash
   #68 = Utf8               ([Ljava/lang/Object;)I
   #69 = Methodref          #2.#70        // ext/mods/gameserver/model/location/Point2D.equals:(Ljava/lang/Object;)Z
   #70 = NameAndType        #71:#72       // equals:(Ljava/lang/Object;)Z
   #71 = Utf8               equals
   #72 = Utf8               (Ljava/lang/Object;)Z
   #73 = Methodref          #55.#74       // java/lang/Object.getClass:()Ljava/lang/Class;
   #74 = NameAndType        #75:#76       // getClass:()Ljava/lang/Class;
   #75 = Utf8               getClass
   #76 = Utf8               ()Ljava/lang/Class;
   #77 = Methodref          #2.#78        // ext/mods/gameserver/model/location/Point2D.clean:()V
   #78 = NameAndType        #79:#80       // clean:()V
   #79 = Utf8               clean
   #80 = Utf8               ()V
   #81 = Methodref          #2.#82        // ext/mods/gameserver/model/location/Point2D.equals:(II)Z
   #82 = NameAndType        #71:#83       // equals:(II)Z
   #83 = Utf8               (II)Z
   #84 = Methodref          #2.#85        // ext/mods/gameserver/model/location/Point2D.set:(II)V
   #85 = NameAndType        #86:#6        // set:(II)V
   #86 = Utf8               set
   #87 = Methodref          #8.#88        // ext/mods/gameserver/model/location/Location.set:(III)V
   #88 = NameAndType        #86:#25       // set:(III)V
   #89 = Methodref          #90.#91       // java/lang/Math.sqrt:(D)D
   #90 = Class              #92           // java/lang/Math
   #91 = NameAndType        #93:#94       // sqrt:(D)D
   #92 = Utf8               java/lang/Math
   #93 = Utf8               sqrt
   #94 = Utf8               (D)D
   #95 = Methodref          #8.#96        // ext/mods/gameserver/model/location/Location.distance3D:(III)D
   #96 = NameAndType        #97:#98       // distance3D:(III)D
   #97 = Utf8               distance3D
   #98 = Utf8               (III)D
   #99 = Methodref          #8.#100       // ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #100 = NameAndType        #97:#101      // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #101 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #102 = Methodref          #103.#104     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #103 = Class              #105          // java/util/Arrays
  #104 = NameAndType        #106:#107     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #105 = Utf8               java/util/Arrays
  #106 = Utf8               stream
  #107 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #108 = InvokeDynamic      #1:#109       // #1:applyAsDouble:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/ToDoubleFunction;
  #109 = NameAndType        #110:#111     // applyAsDouble:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/ToDoubleFunction;
  #110 = Utf8               applyAsDouble
  #111 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/function/ToDoubleFunction;
  #112 = InterfaceMethodref #113.#114     // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #113 = Class              #115          // java/util/Comparator
  #114 = NameAndType        #116:#117     // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #115 = Utf8               java/util/Comparator
  #116 = Utf8               comparingDouble
  #117 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #118 = InterfaceMethodref #119.#120     // java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #119 = Class              #121          // java/util/stream/Stream
  #120 = NameAndType        #122:#123     // min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #121 = Utf8               java/util/stream/Stream
  #122 = Utf8               min
  #123 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
  #124 = Methodref          #125.#126     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #125 = Class              #127          // java/util/Optional
  #126 = NameAndType        #128:#129     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #127 = Utf8               java/util/Optional
  #128 = Utf8               orElse
  #129 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #130 = Methodref          #131.#132     // java/util/Collections.reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
  #131 = Class              #133          // java/util/Collections
  #132 = NameAndType        #134:#135     // reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
  #133 = Utf8               java/util/Collections
  #134 = Utf8               reverseOrder
  #135 = Utf8               (Ljava/util/Comparator;)Ljava/util/Comparator;
  #136 = InterfaceMethodref #119.#137     // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #137 = NameAndType        #138:#139     // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #138 = Utf8               sorted
  #139 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #140 = InterfaceMethodref #119.#141     // java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
  #141 = NameAndType        #142:#143     // limit:(J)Ljava/util/stream/Stream;
  #142 = Utf8               limit
  #143 = Utf8               (J)Ljava/util/stream/Stream;
  #144 = InterfaceMethodref #119.#145     // java/util/stream/Stream.toList:()Ljava/util/List;
  #145 = NameAndType        #146:#147     // toList:()Ljava/util/List;
  #146 = Utf8               toList
  #147 = Utf8               ()Ljava/util/List;
  #148 = Methodref          #8.#149       // ext/mods/gameserver/model/location/Location.clone:()Lext/mods/gameserver/model/location/Location;
  #149 = NameAndType        #150:#151     // clone:()Lext/mods/gameserver/model/location/Location;
  #150 = Utf8               clone
  #151 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #152 = Fieldref           #8.#153       // ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
  #153 = NameAndType        #154:#155     // DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
  #154 = Utf8               DUMMY_LOC
  #155 = Utf8               Lext/mods/gameserver/model/location/Location;
  #156 = Utf8               Code
  #157 = Utf8               LineNumberTable
  #158 = Utf8               LocalVariableTable
  #159 = Utf8               this
  #160 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #161 = Utf8               loc
  #162 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #163 = Utf8               Lext/mods/commons/data/StatSet;
  #164 = Utf8               obj
  #165 = Utf8               Ljava/lang/Object;
  #166 = Utf8               other
  #167 = Utf8               StackMapTable
  #168 = Utf8               (III)Z
  #169 = Utf8               setZ
  #170 = Utf8               (I)V
  #171 = Utf8               setLocationMinusOffset
  #172 = Utf8               (Lext/mods/gameserver/model/location/Location;D)V
  #173 = Utf8               offset
  #174 = Utf8               D
  #175 = Utf8               dx
  #176 = Utf8               dy
  #177 = Utf8               dz
  #178 = Utf8               fraction
  #179 = Utf8               isIn3DRadius
  #180 = Utf8               (IIII)Z
  #181 = Utf8               radius
  #182 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
  #183 = Utf8               point
  #184 = Utf8               getClosestPosition
  #185 = Utf8               ([Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #186 = Utf8               positions
  #187 = Utf8               [Lext/mods/gameserver/model/location/Location;
  #188 = Utf8               getClosestPositionList
  #189 = Utf8               ([Lext/mods/gameserver/model/location/Location;I)Ljava/util/List;
  #190 = Utf8               count
  #191 = Utf8               Signature
  #192 = Utf8               ([Lext/mods/gameserver/model/location/Location;I)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #193 = Utf8               ()Lext/mods/gameserver/model/location/Point2D;
  #194 = Utf8               ()Ljava/lang/Object;
  #195 = Utf8               Exceptions
  #196 = Class              #197          // java/lang/CloneNotSupportedException
  #197 = Utf8               java/lang/CloneNotSupportedException
  #198 = Utf8               <clinit>
  #199 = Utf8               SourceFile
  #200 = Utf8               Location.java
  #201 = Utf8               BootstrapMethods
  #202 = String             #203          // \u0001, \u0001
  #203 = Utf8               \u0001, \u0001
  #204 = MethodType         #205          //  (Ljava/lang/Object;)D
  #205 = Utf8               (Ljava/lang/Object;)D
  #206 = MethodHandle       5:#99         // REF_invokeVirtual ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #207 = MethodType         #101          //  (Lext/mods/gameserver/model/location/Location;)D
  #208 = MethodHandle       6:#209        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #209 = Methodref          #210.#211     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #210 = Class              #212          // java/lang/invoke/StringConcatFactory
  #211 = NameAndType        #50:#213      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #212 = Utf8               java/lang/invoke/StringConcatFactory
  #213 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #214 = MethodHandle       6:#215        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #215 = Methodref          #216.#217     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #216 = Class              #218          // java/lang/invoke/LambdaMetafactory
  #217 = NameAndType        #219:#220     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #218 = Utf8               java/lang/invoke/LambdaMetafactory
  #219 = Utf8               metafactory
  #220 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #221 = Utf8               InnerClasses
  #222 = Class              #223          // java/lang/invoke/MethodHandles$Lookup
  #223 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #224 = Class              #225          // java/lang/invoke/MethodHandles
  #225 = Utf8               java/lang/invoke/MethodHandles
  #226 = Utf8               Lookup
{
  public static final ext.mods.gameserver.model.location.Location DUMMY_LOC;
    descriptor: Lext/mods/gameserver/model/location/Location;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  protected int _z;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.location.Location(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
         6: aload_0
         7: iload_3
         8: putfield      #7                  // Field _z:I
        11: return
      LineNumberTable:
        line 39: 0
        line 41: 6
        line 42: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/location/Location;
            0      12     1     x   I
            0      12     2     y   I
            0      12     3     z   I

  public ext.mods.gameserver.model.location.Location(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #13                 // Method getX:()I
         5: aload_1
         6: invokevirtual #17                 // Method getY:()I
         9: aload_1
        10: invokevirtual #20                 // Method getZ:()I
        13: invokespecial #23                 // Method "<init>":(III)V
        16: return
      LineNumberTable:
        line 46: 0
        line 47: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/location/Location;
            0      17     1   loc   Lext/mods/gameserver/model/location/Location;

  public ext.mods.gameserver.model.location.Location(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #26                 // String x
         4: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #34                 // String y
        10: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #36                 // String z
        16: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        19: invokespecial #23                 // Method "<init>":(III)V
        22: return
      LineNumberTable:
        line 51: 0
        line 52: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/location/Location;
            0      23     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.location.Location clone();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: new           #8                  // class ext/mods/gameserver/model/location/Location
         3: dup
         4: aload_0
         5: getfield      #38                 // Field _x:I
         8: aload_0
         9: getfield      #41                 // Field _y:I
        12: aload_0
        13: getfield      #7                  // Field _z:I
        16: invokespecial #23                 // Method "<init>":(III)V
        19: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/location/Location;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #44                 // Method ext/mods/gameserver/model/location/Point2D.toString:()Ljava/lang/String;
         4: aload_0
         5: getfield      #7                  // Field _z:I
         8: invokedynamic #48,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/location/Location;

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: bipush        31
         2: aload_0
         3: invokespecial #52                 // Method ext/mods/gameserver/model/location/Point2D.hashCode:()I
         6: imul
         7: iconst_1
         8: anewarray     #55                 // class java/lang/Object
        11: dup
        12: iconst_0
        13: aload_0
        14: getfield      #7                  // Field _z:I
        17: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        20: aastore
        21: invokestatic  #63                 // Method java/util/Objects.hash:([Ljava/lang/Object;)I
        24: iadd
        25: ireturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/location/Location;

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
         7: aload_0
         8: aload_1
         9: invokespecial #69                 // Method ext/mods/gameserver/model/location/Point2D.equals:(Ljava/lang/Object;)Z
        12: ifne          17
        15: iconst_0
        16: ireturn
        17: aload_0
        18: invokevirtual #73                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        21: aload_1
        22: invokevirtual #73                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        25: if_acmpeq     30
        28: iconst_0
        29: ireturn
        30: aload_1
        31: checkcast     #8                  // class ext/mods/gameserver/model/location/Location
        34: astore_2
        35: aload_0
        36: getfield      #7                  // Field _z:I
        39: aload_2
        40: getfield      #7                  // Field _z:I
        43: if_icmpne     50
        46: iconst_1
        47: goto          51
        50: iconst_0
        51: ireturn
      LineNumberTable:
        line 75: 0
        line 76: 5
        line 78: 7
        line 79: 15
        line 81: 17
        line 82: 28
        line 84: 30
        line 85: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/location/Location;
            0      52     1   obj   Ljava/lang/Object;
           35      17     2 other   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 9 /* same */
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void clean();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #77                 // Method ext/mods/gameserver/model/location/Point2D.clean:()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _z:I
         9: return
      LineNumberTable:
        line 91: 0
        line 93: 4
        line 94: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/location/Location;

  public boolean equals(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #81                 // Method ext/mods/gameserver/model/location/Point2D.equals:(II)Z
         6: ifeq          21
         9: aload_0
        10: getfield      #7                  // Field _z:I
        13: iload_3
        14: if_icmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/location/Location;
            0      23     1     x   I
            0      23     2     y   I
            0      23     3     z   I
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _z:I
         4: ireturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/Location;

  public void setZ(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _z:I
         5: return
      LineNumberTable:
        line 114: 0
        line 115: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/location/Location;
            0       6     1     z   I

  public void set(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #84                 // Method ext/mods/gameserver/model/location/Point2D.set:(II)V
         6: aload_0
         7: iload_3
         8: putfield      #7                  // Field _z:I
        11: return
      LineNumberTable:
        line 119: 0
        line 121: 6
        line 122: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/location/Location;
            0      12     1     x   I
            0      12     2     y   I
            0      12     3     z   I

  public void set(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #13                 // Method getX:()I
         5: aload_1
         6: invokevirtual #17                 // Method getY:()I
         9: aload_1
        10: invokevirtual #20                 // Method getZ:()I
        13: invokevirtual #87                 // Method set:(III)V
        16: return
      LineNumberTable:
        line 126: 0
        line 127: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/location/Location;
            0      17     1   loc   Lext/mods/gameserver/model/location/Location;

  public void setLocationMinusOffset(ext.mods.gameserver.model.location.Location, double);
    descriptor: (Lext/mods/gameserver/model/location/Location;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=3
         0: aload_1
         1: invokevirtual #13                 // Method getX:()I
         4: aload_0
         5: getfield      #38                 // Field _x:I
         8: isub
         9: istore        4
        11: aload_1
        12: invokevirtual #17                 // Method getY:()I
        15: aload_0
        16: getfield      #41                 // Field _y:I
        19: isub
        20: istore        5
        22: aload_1
        23: invokevirtual #20                 // Method getZ:()I
        26: aload_0
        27: getfield      #7                  // Field _z:I
        30: isub
        31: istore        6
        33: iload         4
        35: iload         4
        37: imul
        38: iload         5
        40: iload         5
        42: imul
        43: iadd
        44: iload         6
        46: iload         6
        48: imul
        49: iadd
        50: i2d
        51: invokestatic  #89                 // Method java/lang/Math.sqrt:(D)D
        54: dstore        7
        56: dconst_1
        57: dload_2
        58: dload         7
        60: ddiv
        61: dsub
        62: dstore        7
        64: aload_0
        65: dup
        66: getfield      #38                 // Field _x:I
        69: iload         4
        71: i2d
        72: dload         7
        74: dmul
        75: d2i
        76: iadd
        77: putfield      #38                 // Field _x:I
        80: aload_0
        81: dup
        82: getfield      #41                 // Field _y:I
        85: iload         5
        87: i2d
        88: dload         7
        90: dmul
        91: d2i
        92: iadd
        93: putfield      #41                 // Field _y:I
        96: aload_0
        97: dup
        98: getfield      #7                  // Field _z:I
       101: iload         6
       103: i2d
       104: dload         7
       106: dmul
       107: d2i
       108: iadd
       109: putfield      #7                  // Field _z:I
       112: return
      LineNumberTable:
        line 136: 0
        line 137: 11
        line 138: 22
        line 140: 33
        line 141: 56
        line 143: 64
        line 144: 80
        line 145: 96
        line 146: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     113     0  this   Lext/mods/gameserver/model/location/Location;
            0     113     1   loc   Lext/mods/gameserver/model/location/Location;
            0     113     2 offset   D
           11     102     4    dx   I
           22      91     5    dy   I
           33      80     6    dz   I
           56      57     7 fraction   D

  public double distance3D(int, int, int);
    descriptor: (III)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=10, args_size=4
         0: aload_0
         1: getfield      #38                 // Field _x:I
         4: i2d
         5: iload_1
         6: i2d
         7: dsub
         8: dstore        4
        10: aload_0
        11: getfield      #41                 // Field _y:I
        14: i2d
        15: iload_2
        16: i2d
        17: dsub
        18: dstore        6
        20: aload_0
        21: getfield      #7                  // Field _z:I
        24: i2d
        25: iload_3
        26: i2d
        27: dsub
        28: dstore        8
        30: dload         4
        32: dload         4
        34: dmul
        35: dload         6
        37: dload         6
        39: dmul
        40: dadd
        41: dload         8
        43: dload         8
        45: dmul
        46: dadd
        47: invokestatic  #89                 // Method java/lang/Math.sqrt:(D)D
        50: dreturn
      LineNumberTable:
        line 156: 0
        line 157: 10
        line 158: 20
        line 160: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/model/location/Location;
            0      51     1     x   I
            0      51     2     y   I
            0      51     3     z   I
           10      41     4    dx   D
           20      31     6    dy   D
           30      21     8    dz   D

  public double distance3D(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #13                 // Method getX:()I
         5: aload_1
         6: invokevirtual #17                 // Method getY:()I
         9: aload_1
        10: invokevirtual #20                 // Method getZ:()I
        13: invokevirtual #95                 // Method distance3D:(III)D
        16: dreturn
      LineNumberTable:
        line 169: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/location/Location;
            0      17     1   loc   Lext/mods/gameserver/model/location/Location;

  public boolean isIn3DRadius(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: invokevirtual #95                 // Method distance3D:(III)D
         7: iload         4
         9: i2d
        10: dcmpg
        11: ifge          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 181: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/location/Location;
            0      20     1     x   I
            0      20     2     y   I
            0      20     3     z   I
            0      20     4 radius   I
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isIn3DRadius(ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #99                 // Method distance3D:(Lext/mods/gameserver/model/location/Location;)D
         5: iload_2
         6: i2d
         7: dcmpg
         8: ifge          15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      LineNumberTable:
        line 191: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/location/Location;
            0      17     1 point   Lext/mods/gameserver/model/location/Location;
            0      17     2 radius   I
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.location.Location getClosestPosition(ext.mods.gameserver.model.location.Location[]);
    descriptor: ([Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokestatic  #102                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         4: aload_0
         5: invokedynamic #108,  0            // InvokeDynamic #1:applyAsDouble:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/ToDoubleFunction;
        10: invokestatic  #112                // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
        13: invokeinterface #118,  2          // InterfaceMethod java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        18: aconst_null
        19: invokevirtual #124                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        22: checkcast     #8                  // class ext/mods/gameserver/model/location/Location
        25: areturn
      LineNumberTable:
        line 200: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/location/Location;
            0      26     1 positions   [Lext/mods/gameserver/model/location/Location;

  public java.util.List<ext.mods.gameserver.model.location.Location> getClosestPositionList(ext.mods.gameserver.model.location.Location[], int);
    descriptor: ([Lext/mods/gameserver/model/location/Location;I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: invokestatic  #102                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         4: aload_0
         5: invokedynamic #108,  0            // InvokeDynamic #1:applyAsDouble:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/ToDoubleFunction;
        10: invokestatic  #112                // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
        13: invokestatic  #130                // Method java/util/Collections.reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
        16: invokeinterface #136,  2          // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
        21: iload_2
        22: i2l
        23: invokeinterface #140,  3          // InterfaceMethod java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
        28: invokeinterface #144,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        33: areturn
      LineNumberTable:
        line 210: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/location/Location;
            0      34     1 positions   [Lext/mods/gameserver/model/location/Location;
            0      34     2 count   I
    Signature: #192                         // ([Lext/mods/gameserver/model/location/Location;I)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public ext.mods.gameserver.model.location.Point2D clone();
    descriptor: ()Lext/mods/gameserver/model/location/Point2D;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #148                // Method clone:()Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/Location;

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;
    descriptor: ()Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #148                // Method clone:()Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/Location;
    Exceptions:
      throws java.lang.CloneNotSupportedException

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #8                  // class ext/mods/gameserver/model/location/Location
         3: dup
         4: iconst_0
         5: iconst_0
         6: iconst_0
         7: invokespecial #23                 // Method "<init>":(III)V
        10: putstatic     #152                // Field DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
        13: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "Location.java"
BootstrapMethods:
  0: #208 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #202 \u0001, \u0001
  1: #214 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #204 (Ljava/lang/Object;)D
      #206 REF_invokeVirtual ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
      #207 (Lext/mods/gameserver/model/location/Location;)D
InnerClasses:
  public static final #226= #222 of #224; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
