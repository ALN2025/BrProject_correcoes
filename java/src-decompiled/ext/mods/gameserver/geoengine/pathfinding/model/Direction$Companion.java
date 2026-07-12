// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.Direction$Companion
// File: ext\mods\gameserver\geoengine\pathfinding\model\Direction$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion.class
  Last modified 9 de jul de 2026; size 2500 bytes
  MD5 checksum 4eaa169872b602ae624dbba75af971ac
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.Direction$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 5
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
  #11 = Utf8               fromIndex
  #12 = Utf8               (I)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #13 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #14 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
  #15 = Class              #14            // ext/mods/gameserver/geoengine/pathfinding/model/Direction
  #16 = Utf8               getEntries
  #17 = Utf8               ()Lkotlin/enums/EnumEntries;
  #18 = NameAndType        #16:#17        // getEntries:()Lkotlin/enums/EnumEntries;
  #19 = Methodref          #15.#18        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getEntries:()Lkotlin/enums/EnumEntries;
  #20 = Utf8               kotlin/enums/EnumEntries
  #21 = Class              #20            // kotlin/enums/EnumEntries
  #22 = Utf8               get
  #23 = Utf8               (I)Ljava/lang/Object;
  #24 = NameAndType        #22:#23        // get:(I)Ljava/lang/Object;
  #25 = InterfaceMethodref #21.#24        // kotlin/enums/EnumEntries.get:(I)Ljava/lang/Object;
  #26 = Utf8               index
  #27 = Utf8               I
  #28 = Utf8               fromDelta
  #29 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #30 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #31 = Utf8               java/lang/Iterable
  #32 = Class              #31            // java/lang/Iterable
  #33 = Utf8               iterator
  #34 = Utf8               ()Ljava/util/Iterator;
  #35 = NameAndType        #33:#34        // iterator:()Ljava/util/Iterator;
  #36 = InterfaceMethodref #32.#35        // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #37 = Utf8               java/util/Iterator
  #38 = Class              #37            // java/util/Iterator
  #39 = Utf8               hasNext
  #40 = Utf8               ()Z
  #41 = NameAndType        #39:#40        // hasNext:()Z
  #42 = InterfaceMethodref #38.#41        // java/util/Iterator.hasNext:()Z
  #43 = Utf8               next
  #44 = Utf8               ()Ljava/lang/Object;
  #45 = NameAndType        #43:#44        // next:()Ljava/lang/Object;
  #46 = InterfaceMethodref #38.#45        // java/util/Iterator.next:()Ljava/lang/Object;
  #47 = Utf8               getDx
  #48 = Utf8               ()I
  #49 = NameAndType        #47:#48        // getDx:()I
  #50 = Methodref          #15.#49        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getDx:()I
  #51 = Utf8               getDy
  #52 = NameAndType        #51:#48        // getDy:()I
  #53 = Methodref          #15.#52        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getDy:()I
  #54 = Utf8               $i$a$-find-Direction$Companion$fromDelta$1
  #55 = Utf8               it
  #56 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #57 = Utf8               dx
  #58 = Utf8               dy
  #59 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #60 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion."<init>":()V
  #61 = Utf8               $constructor_marker
  #62 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #63 = Utf8               Lkotlin/Metadata;
  #64 = Utf8               mv
  #65 = Integer            2
  #66 = Integer            3
  #67 = Integer            0
  #68 = Utf8               k
  #69 = Integer            1
  #70 = Utf8               xi
  #71 = Integer            48
  #72 = Utf8               d1
  #73 = Utf8               \u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b
  #74 = Utf8               d2
  #75 = Utf8
  #76 = Utf8               Brproject
  #77 = Utf8               Companion
  #78 = Utf8               Location.kt
  #79 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #80 = Utf8               value
  #81 = Utf8               SMAP\nLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Location.kt\next/mods/gameserver/geoengine/pathfinding/model/Direction$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n
  #82 = Utf8               Code
  #83 = Utf8               LineNumberTable
  #84 = Utf8               LocalVariableTable
  #85 = Utf8               RuntimeInvisibleAnnotations
  #86 = Utf8               StackMapTable
  #87 = Utf8               InnerClasses
  #88 = Utf8               SourceFile
  #89 = Utf8               SourceDebugExtension
  #90 = Utf8               RuntimeVisibleAnnotations
{
  public final ext.mods.gameserver.geoengine.pathfinding.model.Direction fromIndex(int);
    descriptor: (I)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: invokestatic  #19                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.getEntries:()Lkotlin/enums/EnumEntries;
         3: iload_1
         4: invokeinterface #25,  2           // InterfaceMethod kotlin/enums/EnumEntries.get:(I)Ljava/lang/Object;
         9: checkcast     #15                 // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        12: areturn
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
            0      13     1 index   I
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.model.Direction fromDelta(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=8, args_size=3
         0: invokestatic  #19                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.getEntries:()Lkotlin/enums/EnumEntries;
         3: checkcast     #32                 // class java/lang/Iterable
         6: astore_3
         7: aload_3
         8: invokeinterface #36,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        13: astore        4
        15: aload         4
        17: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        22: ifeq          75
        25: aload         4
        27: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        32: astore        5
        34: aload         5
        36: checkcast     #15                 // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        39: astore        6
        41: iconst_0
        42: istore        7
        44: aload         6
        46: invokevirtual #50                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.getDx:()I
        49: iload_1
        50: if_icmpne     66
        53: aload         6
        55: invokevirtual #53                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.getDy:()I
        58: iload_2
        59: if_icmpne     66
        62: iconst_1
        63: goto          67
        66: iconst_0
        67: ifeq          15
        70: aload         5
        72: goto          76
        75: aconst_null
        76: checkcast     #15                 // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        79: areturn
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ class java/lang/Iterable, class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 50
          locals = [ class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/model/Direction, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 7
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Object ]
      LineNumberTable:
        line 149: 0
        line 184: 41
        line 149: 44
        line 149: 67
        line 149: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      23     7 $i$a$-find-Direction$Companion$fromDelta$1   I
           41      26     6    it   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
            0      80     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
            0      80     1    dx   I
            0      80     2    dy   I
    RuntimeInvisibleAnnotations:
      0: #30()
        org.jetbrains.annotations.Nullable

  public ext.mods.gameserver.geoengine.pathfinding.model.Direction$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #60                 // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #77= #2 of #15;     // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/Direction
SourceFile: "Location.kt"
SourceDebugExtension:
  SMAP
  Location.kt
  Kotlin
  *S Kotlin
  *F
  + 1 Location.kt
  ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
  + 2 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,183:1
  1#2:184
  *E
RuntimeVisibleAnnotations:
  0: #63(#64=[I#65,I#66,I#67],#68=I#69,#70=I#71,#72=[s#73],#74=[s#10,s#75,s#5,s#6,s#11,s#56,s#26,s#75,s#28,s#57,s#58,s#76])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;","","<init>","()V","fromIndex","Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","index","","fromDelta","dx","dy","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #79(#80=[s#81])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Location.kt\next/mods/gameserver/geoengine/pathfinding/model/Direction$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"]
    )
