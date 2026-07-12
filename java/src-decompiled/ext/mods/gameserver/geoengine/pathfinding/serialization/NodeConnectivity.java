// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\NodeConnectivity.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity.class
  Last modified 9 de jul de 2026; size 3101 bytes
  MD5 checksum 0992a8b47cf6bf698f9bfa7099231c9a
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 8, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               (Ljava/util/List;)V
   #7 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;>;)V
   #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #9 = Utf8               ()V
  #10 = NameAndType        #5:#9          // "<init>":()V
  #11 = Methodref          #4.#10         // java/lang/Object."<init>":()V
  #12 = Utf8               edges
  #13 = Utf8               Ljava/util/List;
  #14 = NameAndType        #12:#13        // edges:Ljava/util/List;
  #15 = Fieldref           #2.#14         // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity.edges:Ljava/util/List;
  #16 = Utf8               this
  #17 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #18 = Utf8               getEdges
  #19 = Utf8               ()Ljava/util/List;
  #20 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;>;
  #21 = Utf8               component1
  #22 = Utf8               copy
  #23 = Utf8               (Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #24 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;>;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #25 = NameAndType        #5:#6          // "<init>":(Ljava/util/List;)V
  #26 = Methodref          #2.#25         // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity."<init>":(Ljava/util/List;)V
  #27 = Utf8               copy$default
  #28 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Ljava/util/List;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #29 = NameAndType        #22:#23        // copy:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #30 = Methodref          #2.#29         // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity.copy:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #31 = Utf8               toString
  #32 = Utf8               ()Ljava/lang/String;
  #33 = Utf8               NodeConnectivity(edges=\u0001)
  #34 = String             #33            // NodeConnectivity(edges=\u0001)
  #35 = Utf8               java/lang/invoke/StringConcatFactory
  #36 = Class              #35            // java/lang/invoke/StringConcatFactory
  #37 = Utf8               makeConcatWithConstants
  #38 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #39 = NameAndType        #37:#38        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #40 = Methodref          #36.#39        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #41 = MethodHandle       6:#40          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #42 = Utf8               (Ljava/util/List;)Ljava/lang/String;
  #43 = NameAndType        #37:#42        // makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
  #44 = InvokeDynamic      #0:#43         // #0:makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
  #45 = Utf8               hashCode
  #46 = Utf8               ()I
  #47 = NameAndType        #45:#46        // hashCode:()I
  #48 = Methodref          #4.#47         // java/lang/Object.hashCode:()I
  #49 = Utf8               equals
  #50 = Utf8               (Ljava/lang/Object;)Z
  #51 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #52 = Utf8               kotlin/jvm/internal/Intrinsics
  #53 = Class              #52            // kotlin/jvm/internal/Intrinsics
  #54 = Utf8               areEqual
  #55 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #56 = NameAndType        #54:#55        // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #57 = Methodref          #53.#56        // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #58 = Utf8               other
  #59 = Utf8               Ljava/lang/Object;
  #60 = Utf8               Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;>;
  #61 = Utf8               Lkotlin/Metadata;
  #62 = Utf8               mv
  #63 = Integer            2
  #64 = Integer            3
  #65 = Integer            0
  #66 = Utf8               k
  #67 = Integer            1
  #68 = Utf8               xi
  #69 = Integer            48
  #70 = Utf8               d1
  #71 = Utf8               \u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012
  #72 = Utf8               d2
  #73 = Utf8
  #74 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
  #75 = Utf8               Brproject
  #76 = Utf8               L2BRSerializer.kt
  #77 = Utf8               Signature
  #78 = Utf8               RuntimeInvisibleAnnotations
  #79 = Utf8               Code
  #80 = Utf8               LineNumberTable
  #81 = Utf8               LocalVariableTable
  #82 = Utf8               RuntimeInvisibleParameterAnnotations
  #83 = Utf8               StackMapTable
  #84 = Utf8               SourceFile
  #85 = Utf8               RuntimeVisibleAnnotations
  #86 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity(java.util.List<ext.mods.gameserver.geoengine.pathfinding.serialization.Connection>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #11                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #15                 // Field edges:Ljava/util/List;
         9: return
      LineNumberTable:
        line 433: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
            0      10     1 edges   Ljava/util/List;
    Signature: #7                           // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;>;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.serialization.Connection> getEdges();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field edges:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 433: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    Signature: #20                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.serialization.Connection> component1();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field edges:Ljava/util/List;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    Signature: #20                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity copy(java.util.List<ext.mods.gameserver.geoengine.pathfinding.serialization.Connection>);
    descriptor: (Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
         3: dup
         4: aload_1
         5: invokespecial #26                 // Method "<init>":(Ljava/util/List;)V
         8: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
            0       9     1 edges   Ljava/util/List;
    Signature: #24                          // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;>;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity copy$default(ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity, java.util.List, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Ljava/util/List;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_2
         1: iconst_1
         2: iand
         3: ifeq          11
         6: aload_0
         7: getfield      #15                 // Field edges:Ljava/util/List;
        10: astore_1
        11: aload_0
        12: aload_1
        13: invokevirtual #30                 // Method copy:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
        16: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field edges:Ljava/util/List;
         4: invokedynamic #44,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
         9: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field edges:Ljava/util/List;
         4: invokevirtual #48                 // Method java/lang/Object.hashCode:()I
         7: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
        20: astore_2
        21: aload_0
        22: getfield      #15                 // Field edges:Ljava/util/List;
        25: aload_2
        26: getfield      #15                 // Field edges:Ljava/util/List;
        29: invokestatic  #57                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        32: ifne          37
        35: iconst_0
        36: ireturn
        37: iconst_1
        38: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity ]
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
            0      39     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #51()
          org.jetbrains.annotations.Nullable
}
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #61(#62=[I#63,I#64,I#65],#66=I#67,#68=I#69,#70=[s#71],#72=[s#17,s#73,s#12,s#73,s#74,s#5,s#6,s#18,s#19,s#21,s#22,s#49,s#73,s#58,s#45,s#73,s#31,s#73,s#75])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;","","edges","","Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;","<init>","(Ljava/util/List;)V","getEdges","()Ljava/util/List;","component1","copy","equals","","other","hashCode","","toString","","Brproject"]
    )
BootstrapMethods:
  0: #41 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #34 NodeConnectivity(edges=\u0001)
