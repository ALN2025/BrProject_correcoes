// Bytecode for: ext.mods.gameserver.model.actor.move.CreatureMove$Companion
// File: ext\mods\gameserver\model\actor\move\CreatureMove$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/CreatureMove$Companion.class
  Last modified 9 de jul de 2026; size 1314 bytes
  MD5 checksum 6d3e33828c53e0d15b5a55ae62b3c970
  Compiled from "CreatureMove.kt"
public final class ext.mods.gameserver.model.actor.move.CreatureMove$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/model/actor/move/CreatureMove$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove$Companion
   #2 = Class              #1             // ext/mods/gameserver/model/actor/move/CreatureMove$Companion
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove$Companion;
  #11 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #12 = Methodref          #2.#7          // ext/mods/gameserver/model/actor/move/CreatureMove$Companion."<init>":()V
  #13 = Utf8               $constructor_marker
  #14 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #15 = Utf8               Lkotlin/Metadata;
  #16 = Utf8               mv
  #17 = Integer            2
  #18 = Integer            3
  #19 = Integer            0
  #20 = Utf8               k
  #21 = Integer            1
  #22 = Utf8               xi
  #23 = Integer            48
  #24 = Utf8               d1
  #25 = Utf8               \u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f
  #26 = Utf8               d2
  #27 = Utf8
  #28 = Utf8               LOGGER
  #29 = Utf8               Lext/mods/commons/logging/CLogger;
  #30 = Utf8               MOVE_UPDATE_INTERVAL
  #31 = Utf8               FOLLOW_INTERVAL
  #32 = Utf8               ATTACK_FOLLOW_INTERVAL
  #33 = Utf8               geoEngine
  #34 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
  #35 = Utf8               GEOENGINE_PROPS
  #36 = Utf8               Lext/mods/commons/config/ExProperties;
  #37 = Utf8               MOVEMENT_UPDATE_INTERVAL
  #38 = Utf8               Brproject
  #39 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #40 = Class              #39            // ext/mods/gameserver/model/actor/move/CreatureMove
  #41 = Utf8               Companion
  #42 = Utf8               CreatureMove.kt
  #43 = Utf8               Code
  #44 = Utf8               LineNumberTable
  #45 = Utf8               LocalVariableTable
  #46 = Utf8               InnerClasses
  #47 = Utf8               SourceFile
  #48 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.model.actor.move.CreatureMove$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #12                 // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #41= #2 of #40;     // Companion=class ext/mods/gameserver/model/actor/move/CreatureMove$Companion of class ext/mods/gameserver/model/actor/move/CreatureMove
SourceFile: "CreatureMove.kt"
RuntimeVisibleAnnotations:
  0: #15(#16=[I#17,I#18,I#19],#20=I#21,#22=I#23,#24=[s#25],#26=[s#10,s#27,s#5,s#6,s#28,s#29,s#30,s#27,s#31,s#32,s#33,s#34,s#35,s#36,s#37,s#38])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"]
      d2=["Lext/mods/gameserver/model/actor/move/CreatureMove$Companion;","","<init>","()V","LOGGER","Lext/mods/commons/logging/CLogger;","MOVE_UPDATE_INTERVAL","","FOLLOW_INTERVAL","ATTACK_FOLLOW_INTERVAL","geoEngine","Lext/mods/gameserver/geoengine/GeoEngine;","GEOENGINE_PROPS","Lext/mods/commons/config/ExProperties;","MOVEMENT_UPDATE_INTERVAL","Brproject"]
    )
