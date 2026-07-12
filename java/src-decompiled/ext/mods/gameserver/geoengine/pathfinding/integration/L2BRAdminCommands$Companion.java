// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$Companion
// File: ext\mods\gameserver\geoengine\pathfinding\integration\L2BRAdminCommands$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion.class
  Last modified 9 de jul de 2026; size 1808 bytes
  MD5 checksum 1b652ae291f8fd77774bb089899c17d2
  Compiled from "AdminCommands.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
  #11 = Utf8               createAdminInterface
  #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #13 = Utf8               Lkotlin/jvm/JvmStatic;
  #14 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #15 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1
  #16 = Class              #15            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1
  #17 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #18 = NameAndType        #5:#17         // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #19 = Methodref          #16.#18        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #20 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  #21 = Class              #20            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  #22 = Utf8               player
  #23 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #24 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #25 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion."<init>":()V
  #26 = Utf8               $constructor_marker
  #27 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #28 = Utf8               Lkotlin/Metadata;
  #29 = Utf8               mv
  #30 = Integer            2
  #31 = Integer            3
  #32 = Integer            0
  #33 = Utf8               k
  #34 = Integer            1
  #35 = Utf8               xi
  #36 = Integer            48
  #37 = Utf8               d1
  #38 = Utf8               \u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b
  #39 = Utf8               d2
  #40 = Utf8
  #41 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #42 = Utf8               Brproject
  #43 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #44 = Class              #43            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #45 = Utf8               AdminInterface
  #46 = Utf8               Companion
  #47 = Utf8               AdminCommands.kt
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               RuntimeVisibleAnnotations
  #52 = Utf8               RuntimeInvisibleAnnotations
  #53 = Utf8               RuntimeInvisibleParameterAnnotations
  #54 = Utf8               InnerClasses
  #55 = Utf8               SourceFile
{
  public final ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface createAdminInterface(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: new           #16                 // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1
         3: dup
         4: aload_1
         5: invokespecial #19                 // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1."<init>":(Lext/mods/gameserver/model/actor/Player;)V
         8: checkcast     #21                 // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
        11: areturn
      LineNumberTable:
        line 570: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
            0      12     1 player   Lext/mods/gameserver/model/actor/Player;
    RuntimeVisibleAnnotations:
      0: #13()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #14()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #14()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #25                 // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static #45= #21 of #44;          // AdminInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  public static final #46= #2 of #44;     // Companion=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  public static final #16;                // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1
SourceFile: "AdminCommands.kt"
RuntimeVisibleAnnotations:
  0: #28(#29=[I#30,I#31,I#32],#33=I#34,#35=I#36,#37=[s#38],#39=[s#10,s#40,s#5,s#6,s#11,s#41,s#22,s#23,s#42])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;","","<init>","()V","createAdminInterface","Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;","player","Lext/mods/gameserver/model/actor/Player;","Brproject"]
    )
