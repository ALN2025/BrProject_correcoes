// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleAdapter
// File: ext\mods\gameserver\geoengine\pathfinding\dynamic\DynamicObstacleAdapter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter.class
  Last modified 9 de jul de 2026; size 3403 bytes
  MD5 checksum f886200feb1a7f6e2a34a0e71dbef699
  Compiled from "DynamicObstacleLayer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleAdapter
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 5, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;II)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               layer
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #13 = NameAndType        #11:#12       // layer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter.layer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #15 = Utf8               regionOffsetX
   #16 = Utf8               I
   #17 = NameAndType        #15:#16       // regionOffsetX:I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter.regionOffsetX:I
   #19 = Utf8               regionOffsetY
   #20 = NameAndType        #19:#16       // regionOffsetY:I
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter.regionOffsetY:I
   #22 = Utf8               this
   #23 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter;
   #24 = Utf8               geoToNodeId
   #25 = Utf8               (II)I
   #26 = Utf8               localX
   #27 = Utf8               localY
   #28 = Utf8               geoX
   #29 = Utf8               geoY
   #30 = Utf8               registerGeoObject
   #31 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;)V
   #32 = Utf8               calculateCoveredNodes
   #33 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;)[I
   #34 = NameAndType        #32:#33       // calculateCoveredNodes:(Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;)[I
   #35 = Methodref          #2.#34        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter.calculateCoveredNodes:(Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;)[I
   #36 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter
   #37 = Class              #36           // ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter
   #38 = Utf8               getObjectId
   #39 = Utf8               ()Ljava/lang/String;
   #40 = NameAndType        #38:#39       // getObjectId:()Ljava/lang/String;
   #41 = InterfaceMethodref #37.#40       // ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter.getObjectId:()Ljava/lang/String;
   #42 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
   #43 = Class              #42           // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
   #44 = Utf8               DOOR
   #45 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #46 = NameAndType        #44:#45       // DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #47 = Fieldref           #43.#46       // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #48 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #49 = Class              #48           // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #50 = Utf8               registerObject
   #51 = Utf8               (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
   #52 = NameAndType        #50:#51       // registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
   #53 = Methodref          #49.#52       // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
   #54 = Utf8               nodeIds
   #55 = Utf8               [I
   #56 = Utf8               obj
   #57 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;
   #58 = Utf8               removeGeoObject
   #59 = Utf8               unregisterObject
   #60 = Utf8               (Ljava/lang/String;)V
   #61 = NameAndType        #59:#60       // unregisterObject:(Ljava/lang/String;)V
   #62 = Methodref          #49.#61       // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.unregisterObject:(Ljava/lang/String;)V
   #63 = Utf8               java/util/ArrayList
   #64 = Class              #63           // java/util/ArrayList
   #65 = Methodref          #64.#9        // java/util/ArrayList."<init>":()V
   #66 = Utf8               java/util/List
   #67 = Class              #66           // java/util/List
   #68 = Utf8               getGeoX
   #69 = Utf8               ()I
   #70 = NameAndType        #68:#69       // getGeoX:()I
   #71 = InterfaceMethodref #37.#70       // ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter.getGeoX:()I
   #72 = Utf8               getGeoY
   #73 = NameAndType        #72:#69       // getGeoY:()I
   #74 = InterfaceMethodref #37.#73       // ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter.getGeoY:()I
   #75 = Utf8               getWidth
   #76 = NameAndType        #75:#69       // getWidth:()I
   #77 = InterfaceMethodref #37.#76       // ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter.getWidth:()I
   #78 = Utf8               getHeight
   #79 = NameAndType        #78:#69       // getHeight:()I
   #80 = InterfaceMethodref #37.#79       // ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter.getHeight:()I
   #81 = NameAndType        #24:#25       // geoToNodeId:(II)I
   #82 = Methodref          #2.#81        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter.geoToNodeId:(II)I
   #83 = Utf8               java/lang/Integer
   #84 = Class              #83           // java/lang/Integer
   #85 = Utf8               valueOf
   #86 = Utf8               (I)Ljava/lang/Integer;
   #87 = NameAndType        #85:#86       // valueOf:(I)Ljava/lang/Integer;
   #88 = Methodref          #84.#87       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #89 = Utf8               add
   #90 = Utf8               (Ljava/lang/Object;)Z
   #91 = NameAndType        #89:#90       // add:(Ljava/lang/Object;)Z
   #92 = InterfaceMethodref #67.#91       // java/util/List.add:(Ljava/lang/Object;)Z
   #93 = Utf8               java/util/Collection
   #94 = Class              #93           // java/util/Collection
   #95 = Utf8               kotlin/collections/CollectionsKt
   #96 = Class              #95           // kotlin/collections/CollectionsKt
   #97 = Utf8               toIntArray
   #98 = Utf8               (Ljava/util/Collection;)[I
   #99 = NameAndType        #97:#98       // toIntArray:(Ljava/util/Collection;)[I
  #100 = Methodref          #96.#99       // kotlin/collections/CollectionsKt.toIntArray:(Ljava/util/Collection;)[I
  #101 = Utf8               dy
  #102 = Utf8               dx
  #103 = Utf8               nodes
  #104 = Utf8               Ljava/util/List;
  #105 = Utf8               startX
  #106 = Utf8               startY
  #107 = Utf8               width
  #108 = Utf8               height
  #109 = Utf8               Lkotlin/Metadata;
  #110 = Utf8               mv
  #111 = Integer            2
  #112 = Integer            3
  #113 = Integer            0
  #114 = Utf8               k
  #115 = Integer            1
  #116 = Utf8               xi
  #117 = Integer            48
  #118 = Utf8               d1
  #119 = Utf8               \u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013
  #120 = Utf8               d2
  #121 = Utf8
  #122 = Utf8               Brproject
  #123 = Utf8               ObjectType
  #124 = Utf8               DynamicObstacleLayer.kt
  #125 = Utf8               RuntimeInvisibleAnnotations
  #126 = Utf8               Code
  #127 = Utf8               LineNumberTable
  #128 = Utf8               LocalVariableTable
  #129 = Utf8               RuntimeInvisibleParameterAnnotations
  #130 = Utf8               StackMapTable
  #131 = Utf8               InnerClasses
  #132 = Utf8               SourceFile
  #133 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleAdapter(ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer, int, int);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #14                 // Field layer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
         9: aload_0
        10: iload_2
        11: putfield      #18                 // Field regionOffsetX:I
        14: aload_0
        15: iload_3
        16: putfield      #21                 // Field regionOffsetY:I
        19: return
      LineNumberTable:
        line 205: 0
        line 206: 4
        line 207: 9
        line 208: 14
        line 205: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter;
            0      20     1 layer   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
            0      20     2 regionOffsetX   I
            0      20     3 regionOffsetY   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:

  public final int geoToNodeId(int, int);
    descriptor: (II)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=3
         0: iload_1
         1: aload_0
         2: getfield      #18                 // Field regionOffsetX:I
         5: isub
         6: istore_3
         7: iload_2
         8: aload_0
         9: getfield      #21                 // Field regionOffsetY:I
        12: isub
        13: istore        4
        15: iload         4
        17: sipush        256
        20: imul
        21: iload_3
        22: iadd
        23: ireturn
      LineNumberTable:
        line 212: 0
        line 213: 7
        line 214: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7      17     3 localX   I
           15       9     4 localY   I
            0      24     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter;
            0      24     1  geoX   I
            0      24     2  geoY   I

  public final void registerGeoObject(ext.mods.gameserver.geoengine.pathfinding.dynamic.GeoObjectAdapter);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #35                 // Method calculateCoveredNodes:(Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;)[I
         5: astore_2
         6: aload_0
         7: getfield      #14                 // Field layer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
        10: aload_1
        11: invokeinterface #41,  1           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter.getObjectId:()Ljava/lang/String;
        16: aload_2
        17: getstatic     #47                 // Field ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        20: invokevirtual #53                 // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
        23: return
      LineNumberTable:
        line 218: 0
        line 219: 6
        line 220: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            6      18     2 nodeIds   [I
            0      24     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter;
            0      24     1   obj   Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final void removeGeoObject(ext.mods.gameserver.geoengine.pathfinding.dynamic.GeoObjectAdapter);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #14                 // Field layer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
         4: aload_1
         5: invokeinterface #41,  1           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter.getObjectId:()Ljava/lang/String;
        10: invokevirtual #62                 // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.unregisterObject:(Ljava/lang/String;)V
        13: return
      LineNumberTable:
        line 223: 0
        line 224: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter;
            0      14     1   obj   Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static final #123= #43 of #49;   // ObjectType=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
SourceFile: "DynamicObstacleLayer.kt"
RuntimeVisibleAnnotations:
  0: #109(#110=[I#111,I#112,I#113],#114=I#115,#116=I#117,#118=[s#119],#120=[s#23,s#121,s#11,s#12,s#15,s#121,s#19,s#5,s#6,s#24,s#28,s#29,s#30,s#121,s#56,s#57,s#58,s#32,s#121,s#122])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleAdapter;","","layer","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;","regionOffsetX","","regionOffsetY","<init>","(Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;II)V","geoToNodeId","geoX","geoY","registerGeoObject","","obj","Lext/mods/gameserver/geoengine/pathfinding/dynamic/GeoObjectAdapter;","removeGeoObject","calculateCoveredNodes","","Brproject"]
    )
