// Bytecode for: ext.mods.commons.geometry.Polygon
// File: ext\mods\commons\geometry\Polygon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/geometry/Polygon.class
  Last modified 9 de jul de 2026; size 3524 bytes
  MD5 checksum e6f67d669d280ddc77b8257be3ac191d
  Compiled from "Polygon.java"
public class ext.mods.commons.geometry.Polygon extends ext.mods.commons.geometry.AShape
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/commons/geometry/Polygon
  super_class: #16                        // ext/mods/commons/geometry/AShape
  interfaces: 0, fields: 1, methods: 9, attributes: 1
Constant pool:
    #1 = String             #2            // coords
    #2 = Utf8               coords
    #3 = Methodref          #4.#5         // ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
    #4 = Class              #6            // ext/mods/commons/data/StatSet
    #5 = NameAndType        #7:#8         // getList:(Ljava/lang/String;)Ljava/util/List;
    #6 = Utf8               ext/mods/commons/data/StatSet
    #7 = Utf8               getList
    #8 = Utf8               (Ljava/lang/String;)Ljava/util/List;
    #9 = Methodref          #10.#11       // ext/mods/commons/geometry/Polygon."<init>":(Ljava/util/List;)V
   #10 = Class              #12           // ext/mods/commons/geometry/Polygon
   #11 = NameAndType        #13:#14       // "<init>":(Ljava/util/List;)V
   #12 = Utf8               ext/mods/commons/geometry/Polygon
   #13 = Utf8               <init>
   #14 = Utf8               (Ljava/util/List;)V
   #15 = Methodref          #16.#17       // ext/mods/commons/geometry/AShape."<init>":()V
   #16 = Class              #18           // ext/mods/commons/geometry/AShape
   #17 = NameAndType        #13:#19       // "<init>":()V
   #18 = Utf8               ext/mods/commons/geometry/AShape
   #19 = Utf8               ()V
   #20 = Methodref          #21.#22       // ext/mods/commons/geometry/algorithm/Kong.doTriangulation:(Ljava/util/List;)Ljava/util/List;
   #21 = Class              #23           // ext/mods/commons/geometry/algorithm/Kong
   #22 = NameAndType        #24:#25       // doTriangulation:(Ljava/util/List;)Ljava/util/List;
   #23 = Utf8               ext/mods/commons/geometry/algorithm/Kong
   #24 = Utf8               doTriangulation
   #25 = Utf8               (Ljava/util/List;)Ljava/util/List;
   #26 = Fieldref           #10.#27       // ext/mods/commons/geometry/Polygon._shapes:Ljava/util/Collection;
   #27 = NameAndType        #28:#29       // _shapes:Ljava/util/Collection;
   #28 = Utf8               _shapes
   #29 = Utf8               Ljava/util/Collection;
   #30 = InterfaceMethodref #31.#32       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #31 = Class              #33           // java/util/Collection
   #32 = NameAndType        #34:#35       // iterator:()Ljava/util/Iterator;
   #33 = Utf8               java/util/Collection
   #34 = Utf8               iterator
   #35 = Utf8               ()Ljava/util/Iterator;
   #36 = InterfaceMethodref #37.#38       // java/util/Iterator.hasNext:()Z
   #37 = Class              #39           // java/util/Iterator
   #38 = NameAndType        #40:#41       // hasNext:()Z
   #39 = Utf8               java/util/Iterator
   #40 = Utf8               hasNext
   #41 = Utf8               ()Z
   #42 = InterfaceMethodref #37.#43       // java/util/Iterator.next:()Ljava/lang/Object;
   #43 = NameAndType        #44:#45       // next:()Ljava/lang/Object;
   #44 = Utf8               next
   #45 = Utf8               ()Ljava/lang/Object;
   #46 = Class              #47           // ext/mods/commons/geometry/Triangle
   #47 = Utf8               ext/mods/commons/geometry/Triangle
   #48 = Fieldref           #10.#49       // ext/mods/commons/geometry/Polygon._area:J
   #49 = NameAndType        #50:#51       // _area:J
   #50 = Utf8               _area
   #51 = Utf8               J
   #52 = Methodref          #46.#53       // ext/mods/commons/geometry/Triangle.getArea:()J
   #53 = NameAndType        #54:#55       // getArea:()J
   #54 = Utf8               getArea
   #55 = Utf8               ()J
   #56 = Methodref          #46.#57       // ext/mods/commons/geometry/Triangle.isInside:(II)Z
   #57 = NameAndType        #58:#59       // isInside:(II)Z
   #58 = Utf8               isInside
   #59 = Utf8               (II)Z
   #60 = Methodref          #46.#61       // ext/mods/commons/geometry/Triangle.intersects:(IIII)Z
   #61 = NameAndType        #62:#63       // intersects:(IIII)Z
   #62 = Utf8               intersects
   #63 = Utf8               (IIII)Z
   #64 = Methodref          #65.#66       // ext/mods/commons/random/Rnd.get:(J)J
   #65 = Class              #67           // ext/mods/commons/random/Rnd
   #66 = NameAndType        #68:#69       // get:(J)J
   #67 = Utf8               ext/mods/commons/random/Rnd
   #68 = Utf8               get
   #69 = Utf8               (J)J
   #70 = Methodref          #46.#71       // ext/mods/commons/geometry/Triangle.getRandomLocation:()Lext/mods/gameserver/model/location/Location;
   #71 = NameAndType        #72:#73       // getRandomLocation:()Lext/mods/gameserver/model/location/Location;
   #72 = Utf8               getRandomLocation
   #73 = Utf8               ()Lext/mods/gameserver/model/location/Location;
   #74 = Methodref          #46.#75       // ext/mods/commons/geometry/Triangle.visualize:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
   #75 = NameAndType        #76:#77       // visualize:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
   #76 = Utf8               visualize
   #77 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
   #78 = Methodref          #46.#79       // ext/mods/commons/geometry/Triangle.visualize3D:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
   #79 = NameAndType        #80:#81       // visualize3D:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
   #80 = Utf8               visualize3D
   #81 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
   #82 = Utf8               Signature
   #83 = Utf8               Ljava/util/Collection<Lext/mods/commons/geometry/Triangle;>;
   #84 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #85 = Utf8               Code
   #86 = Utf8               LineNumberTable
   #87 = Utf8               LocalVariableTable
   #88 = Utf8               this
   #89 = Utf8               Lext/mods/commons/geometry/Polygon;
   #90 = Utf8               set
   #91 = Utf8               Lext/mods/commons/data/StatSet;
   #92 = Utf8               shape
   #93 = Utf8               Lext/mods/commons/geometry/Triangle;
   #94 = Utf8               Ljava/util/List;
   #95 = Utf8               LocalVariableTypeTable
   #96 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
   #97 = Utf8               StackMapTable
   #98 = Class              #99           // java/util/List
   #99 = Utf8               java/util/List
  #100 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)V
  #101 = Utf8               (Ljava/util/Set;)V
  #102 = Utf8               shapes
  #103 = Utf8               Ljava/util/Set;
  #104 = Utf8               Ljava/util/Set<Lext/mods/commons/geometry/Triangle;>;
  #105 = Class              #106          // java/util/Set
  #106 = Utf8               java/util/Set
  #107 = Utf8               (Ljava/util/Set<Lext/mods/commons/geometry/Triangle;>;)V
  #108 = Utf8               x
  #109 = Utf8               I
  #110 = Utf8               y
  #111 = Utf8               x1
  #112 = Utf8               y1
  #113 = Utf8               x2
  #114 = Utf8               y2
  #115 = Utf8               size
  #116 = Utf8               info
  #117 = Utf8               Ljava/lang/String;
  #118 = Utf8               debug
  #119 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #120 = Utf8               z
  #121 = Utf8               minZ
  #122 = Utf8               maxZ
  #123 = Utf8               getShapes
  #124 = Utf8               ()Ljava/util/Collection;
  #125 = Utf8               ()Ljava/util/Collection<Lext/mods/commons/geometry/Triangle;>;
  #126 = Utf8               SourceFile
  #127 = Utf8               Polygon.java
{
  protected final java.util.Collection<ext.mods.commons.geometry.Triangle> _shapes;
    descriptor: Ljava/util/Collection;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #83                          // Ljava/util/Collection<Lext/mods/commons/geometry/Triangle;>;

  public ext.mods.commons.geometry.Polygon(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #1                  // String coords
         4: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
         7: invokespecial #9                  // Method "<init>":(Ljava/util/List;)V
        10: return
      LineNumberTable:
        line 41: 0
        line 42: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/geometry/Polygon;
            0      11     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.commons.geometry.Polygon(java.util.List<ext.mods.gameserver.model.location.Point2D>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: invokespecial #15                 // Method ext/mods/commons/geometry/AShape."<init>":()V
         4: aload_0
         5: aload_1
         6: invokestatic  #20                 // Method ext/mods/commons/geometry/algorithm/Kong.doTriangulation:(Ljava/util/List;)Ljava/util/List;
         9: putfield      #26                 // Field _shapes:Ljava/util/Collection;
        12: aload_0
        13: getfield      #26                 // Field _shapes:Ljava/util/Collection;
        16: invokeinterface #30,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        21: astore_2
        22: aload_2
        23: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        28: ifeq          57
        31: aload_2
        32: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #46                 // class ext/mods/commons/geometry/Triangle
        40: astore_3
        41: aload_0
        42: dup
        43: getfield      #48                 // Field _area:J
        46: aload_3
        47: invokevirtual #52                 // Method ext/mods/commons/geometry/Triangle.getArea:()J
        50: ladd
        51: putfield      #48                 // Field _area:J
        54: goto          22
        57: return
      LineNumberTable:
        line 45: 0
        line 46: 4
        line 48: 12
        line 49: 41
        line 50: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      13     3 shape   Lext/mods/commons/geometry/Triangle;
            0      58     0  this   Lext/mods/commons/geometry/Polygon;
            0      58     1 coords   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      58     1 coords   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/commons/geometry/Polygon, class java/util/List, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 34
    Signature: #100                         // (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)V

  public ext.mods.commons.geometry.Polygon(java.util.Set<ext.mods.commons.geometry.Triangle>);
    descriptor: (Ljava/util/Set;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: invokespecial #15                 // Method ext/mods/commons/geometry/AShape."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #26                 // Field _shapes:Ljava/util/Collection;
         9: aload_0
        10: getfield      #26                 // Field _shapes:Ljava/util/Collection;
        13: invokeinterface #30,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        18: astore_2
        19: aload_2
        20: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        25: ifeq          54
        28: aload_2
        29: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        34: checkcast     #46                 // class ext/mods/commons/geometry/Triangle
        37: astore_3
        38: aload_0
        39: dup
        40: getfield      #48                 // Field _area:J
        43: aload_3
        44: invokevirtual #52                 // Method ext/mods/commons/geometry/Triangle.getArea:()J
        47: ladd
        48: putfield      #48                 // Field _area:J
        51: goto          19
        54: return
      LineNumberTable:
        line 53: 0
        line 54: 4
        line 56: 9
        line 57: 38
        line 58: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      13     3 shape   Lext/mods/commons/geometry/Triangle;
            0      55     0  this   Lext/mods/commons/geometry/Polygon;
            0      55     1 shapes   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      55     1 shapes   Ljava/util/Set<Lext/mods/commons/geometry/Triangle;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/commons/geometry/Polygon, class java/util/Set, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 34
    Signature: #107                         // (Ljava/util/Set<Lext/mods/commons/geometry/Triangle;>;)V

  public boolean isInside(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #26                 // Field _shapes:Ljava/util/Collection;
         4: invokeinterface #30,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          45
        19: aload_3
        20: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #46                 // class ext/mods/commons/geometry/Triangle
        28: astore        4
        30: aload         4
        32: iload_1
        33: iload_2
        34: invokevirtual #56                 // Method ext/mods/commons/geometry/Triangle.isInside:(II)Z
        37: ifeq          42
        40: iconst_1
        41: ireturn
        42: goto          10
        45: iconst_0
        46: ireturn
      LineNumberTable:
        line 63: 0
        line 65: 30
        line 66: 40
        line 67: 42
        line 68: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      12     4 shape   Lext/mods/commons/geometry/Triangle;
            0      47     0  this   Lext/mods/commons/geometry/Polygon;
            0      47     1     x   I
            0      47     2     y   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 31 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean intersects(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: aload_0
         1: getfield      #26                 // Field _shapes:Ljava/util/Collection;
         4: invokeinterface #30,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
         9: astore        5
        11: aload         5
        13: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          51
        21: aload         5
        23: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #46                 // class ext/mods/commons/geometry/Triangle
        31: astore        6
        33: aload         6
        35: iload_1
        36: iload_2
        37: iload_3
        38: iload         4
        40: invokevirtual #60                 // Method ext/mods/commons/geometry/Triangle.intersects:(IIII)Z
        43: ifeq          48
        46: iconst_1
        47: ireturn
        48: goto          11
        51: iconst_0
        52: ireturn
      LineNumberTable:
        line 74: 0
        line 76: 33
        line 77: 46
        line 78: 48
        line 79: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      15     6 shape   Lext/mods/commons/geometry/Triangle;
            0      53     0  this   Lext/mods/commons/geometry/Polygon;
            0      53     1    x1   I
            0      53     2    y1   I
            0      53     3    x2   I
            0      53     4    y2   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.location.Location getRandomLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _area:J
         4: invokestatic  #64                 // Method ext/mods/commons/random/Rnd.get:(J)J
         7: lstore_1
         8: aload_0
         9: getfield      #26                 // Field _shapes:Ljava/util/Collection;
        12: invokeinterface #30,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        17: astore_3
        18: aload_3
        19: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          61
        27: aload_3
        28: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #46                 // class ext/mods/commons/geometry/Triangle
        36: astore        4
        38: lload_1
        39: aload         4
        41: invokevirtual #52                 // Method ext/mods/commons/geometry/Triangle.getArea:()J
        44: lsub
        45: lstore_1
        46: lload_1
        47: lconst_0
        48: lcmp
        49: ifge          58
        52: aload         4
        54: invokevirtual #70                 // Method ext/mods/commons/geometry/Triangle.getRandomLocation:()Lext/mods/gameserver/model/location/Location;
        57: areturn
        58: goto          18
        61: aconst_null
        62: areturn
      LineNumberTable:
        line 85: 0
        line 87: 8
        line 89: 38
        line 90: 46
        line 91: 52
        line 92: 58
        line 94: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      20     4 shape   Lext/mods/commons/geometry/Triangle;
            0      63     0  this   Lext/mods/commons/geometry/Polygon;
            8      55     1  size   J
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ long, class java/util/Iterator ]
        frame_type = 39 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void visualize(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive, int);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: getfield      #26                 // Field _shapes:Ljava/util/Collection;
         4: invokeinterface #30,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
         9: astore        4
        11: aload         4
        13: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          44
        21: aload         4
        23: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #46                 // class ext/mods/commons/geometry/Triangle
        31: astore        5
        33: aload         5
        35: aload_1
        36: aload_2
        37: iload_3
        38: invokevirtual #74                 // Method ext/mods/commons/geometry/Triangle.visualize:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
        41: goto          11
        44: return
      LineNumberTable:
        line 100: 0
        line 101: 33
        line 102: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33       8     5 shape   Lext/mods/commons/geometry/Triangle;
            0      45     0  this   Lext/mods/commons/geometry/Polygon;
            0      45     1  info   Ljava/lang/String;
            0      45     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            0      45     3     z   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32

  public void visualize3D(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive, int, int);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: aload_0
         1: getfield      #26                 // Field _shapes:Ljava/util/Collection;
         4: invokeinterface #30,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
         9: astore        5
        11: aload         5
        13: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          46
        21: aload         5
        23: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #46                 // class ext/mods/commons/geometry/Triangle
        31: astore        6
        33: aload         6
        35: aload_1
        36: aload_2
        37: iload_3
        38: iload         4
        40: invokevirtual #78                 // Method ext/mods/commons/geometry/Triangle.visualize3D:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
        43: goto          11
        46: return
      LineNumberTable:
        line 107: 0
        line 108: 33
        line 109: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      10     6 shape   Lext/mods/commons/geometry/Triangle;
            0      47     0  this   Lext/mods/commons/geometry/Polygon;
            0      47     1  info   Ljava/lang/String;
            0      47     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            0      47     3  minZ   I
            0      47     4  maxZ   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34

  public java.util.Collection<ext.mods.commons.geometry.Triangle> getShapes();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _shapes:Ljava/util/Collection;
         4: areturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/Polygon;
    Signature: #125                         // ()Ljava/util/Collection<Lext/mods/commons/geometry/Triangle;>;
}
SourceFile: "Polygon.java"
