// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.PathNode$Companion
// File: ext\mods\gameserver\geoengine\pathfinding\model\PathNode$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion.class
  Last modified 9 de jul de 2026; size 2162 bytes
  MD5 checksum e173fad743d2fb6caba7963ba498b0c2
  Compiled from "PathNode.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.PathNode$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
  #11 = Utf8               fromMemory
  #12 = Utf8               (Ljava/lang/foreign/MemorySegment;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #13 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #14 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  #15 = Class              #14            // ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  #16 = Utf8               (Ljava/lang/foreign/MemorySegment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #17 = NameAndType        #5:#16         // "<init>":(Ljava/lang/foreign/MemorySegment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #18 = Methodref          #15.#17        // ext/mods/gameserver/geoengine/pathfinding/model/PathNode."<init>":(Ljava/lang/foreign/MemorySegment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #19 = Utf8               segment
  #20 = Utf8               Ljava/lang/foreign/MemorySegment;
  #21 = Utf8               nodeId
  #22 = Utf8               I
  #23 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #24 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion."<init>":()V
  #25 = Utf8               $constructor_marker
  #26 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #27 = Utf8               Lkotlin/Metadata;
  #28 = Utf8               mv
  #29 = Integer            2
  #30 = Integer            3
  #31 = Integer            0
  #32 = Utf8               k
  #33 = Integer            1
  #34 = Utf8               xi
  #35 = Integer            48
  #36 = Utf8               d1
  #37 = Utf8               \u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c
  #38 = Utf8               d2
  #39 = Utf8
  #40 = Utf8               NODE_SIZE
  #41 = Utf8               OFFSET_X
  #42 = Utf8               OFFSET_Y
  #43 = Utf8               OFFSET_Z
  #44 = Utf8               OFFSET_FLAGS
  #45 = Utf8               OFFSET_JPS_DISTANCES
  #46 = Utf8               OFFSET_SUCCESSOR_OFFSET
  #47 = Utf8               OFFSET_SUCCESSOR_COUNT
  #48 = Utf8               OFFSET_CLUSTER_ID
  #49 = Utf8               FLAG_WALKABLE
  #50 = Utf8               FLAG_DYNAMIC
  #51 = Utf8               FLAG_MULTILAYER
  #52 = Utf8               FLAG_RESERVED1
  #53 = Utf8               FLAG_RESERVED2
  #54 = Utf8               FLAG_RESERVED3
  #55 = Utf8               FLAG_RESERVED4
  #56 = Utf8               FLAG_RESERVED5
  #57 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #58 = Utf8               Brproject
  #59 = Utf8               Companion
  #60 = Utf8               PathNode.kt
  #61 = Utf8               Code
  #62 = Utf8               LineNumberTable
  #63 = Utf8               LocalVariableTable
  #64 = Utf8               RuntimeInvisibleAnnotations
  #65 = Utf8               RuntimeInvisibleParameterAnnotations
  #66 = Utf8               InnerClasses
  #67 = Utf8               SourceFile
  #68 = Utf8               RuntimeVisibleAnnotations
{
  public final ext.mods.gameserver.geoengine.pathfinding.model.PathNode fromMemory(java.lang.foreign.MemorySegment, int);
    descriptor: (Ljava/lang/foreign/MemorySegment;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=3, args_size=3
         0: new           #15                 // class ext/mods/gameserver/geoengine/pathfinding/model/PathNode
         3: dup
         4: aload_1
         5: iload_2
         6: aconst_null
         7: invokespecial #18                 // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode."<init>":(Ljava/lang/foreign/MemorySegment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        10: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
            0      11     1 segment   Ljava/lang/foreign/MemorySegment;
            0      11     2 nodeId   I
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public ext.mods.gameserver.geoengine.pathfinding.model.PathNode$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #24                 // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #59= #2 of #15;     // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/PathNode
SourceFile: "PathNode.kt"
RuntimeVisibleAnnotations:
  0: #27(#28=[I#29,I#30,I#31],#32=I#33,#34=I#35,#36=[s#37],#38=[s#10,s#39,s#5,s#6,s#40,s#39,s#41,s#42,s#43,s#44,s#45,s#46,s#47,s#48,s#49,s#39,s#50,s#51,s#52,s#53,s#54,s#55,s#56,s#11,s#57,s#19,s#20,s#21,s#58])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;","","<init>","()V","NODE_SIZE","","OFFSET_X","OFFSET_Y","OFFSET_Z","OFFSET_FLAGS","OFFSET_JPS_DISTANCES","OFFSET_SUCCESSOR_OFFSET","OFFSET_SUCCESSOR_COUNT","OFFSET_CLUSTER_ID","FLAG_WALKABLE","","FLAG_DYNAMIC","FLAG_MULTILAYER","FLAG_RESERVED1","FLAG_RESERVED2","FLAG_RESERVED3","FLAG_RESERVED4","FLAG_RESERVED5","fromMemory","Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;","segment","Ljava/lang/foreign/MemorySegment;","nodeId","Brproject"]
    )
