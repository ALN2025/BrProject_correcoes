// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface
// File: ext\mods\gameserver\geoengine\pathfinding\integration\L2BRAdminCommands$AdminInterface.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.class
  Last modified 9 de jul de 2026; size 1000 bytes
  MD5 checksum 0723bcc4e8b2406e696af2c0ecd45466
  Compiled from "AdminCommands.kt"
public interface ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               sendMessage
   #6 = Utf8               (Ljava/lang/String;)V
   #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #8 = Utf8               getLocation
   #9 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #10 = Utf8               Lkotlin/Metadata;
  #11 = Utf8               mv
  #12 = Integer            2
  #13 = Integer            3
  #14 = Integer            0
  #15 = Utf8               k
  #16 = Integer            1
  #17 = Utf8               xi
  #18 = Integer            48
  #19 = Utf8               d1
  #20 = Utf8               \u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003
  #21 = Utf8               d2
  #22 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #23 = Utf8
  #24 = Utf8               message
  #25 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #26 = Utf8               Brproject
  #27 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #28 = Class              #27            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #29 = Utf8               AdminInterface
  #30 = Utf8               AdminCommands.kt
  #31 = Utf8               RuntimeInvisibleParameterAnnotations
  #32 = Utf8               RuntimeInvisibleAnnotations
  #33 = Utf8               InnerClasses
  #34 = Utf8               SourceFile
  #35 = Utf8               RuntimeVisibleAnnotations
{
  public abstract void sendMessage(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public abstract ext.mods.gameserver.geoengine.pathfinding.model.Location getLocation();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static #29= #2 of #28;           // AdminInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
SourceFile: "AdminCommands.kt"
RuntimeVisibleAnnotations:
  0: #10(#11=[I#12,I#13,I#14],#15=I#16,#17=I#18,#19=[s#20],#21=[s#22,s#23,s#5,s#23,s#24,s#23,s#8,s#25,s#26])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;","","sendMessage","","message","","getLocation","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","Brproject"]
    )
