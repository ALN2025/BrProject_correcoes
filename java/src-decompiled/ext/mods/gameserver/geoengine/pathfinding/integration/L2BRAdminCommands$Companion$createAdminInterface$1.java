// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$Companion$createAdminInterface$1
// File: ext\mods\gameserver\geoengine\pathfinding\integration\L2BRAdminCommands$Companion$createAdminInterface$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1.class
  Last modified 9 de jul de 2026; size 2019 bytes
  MD5 checksum 3fbf7ba75ac8f70c5e81ff8b8fc78cbb
  Compiled from "AdminCommands.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$Companion$createAdminInterface$1 implements ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 3, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
   #6 = Class              #5             // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
   #7 = Utf8               <init>
   #8 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #9 = Utf8               $player
  #10 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #11 = NameAndType        #9:#10         // $player:Lext/mods/gameserver/model/actor/Player;
  #12 = Fieldref           #2.#11         // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1.$player:Lext/mods/gameserver/model/actor/Player;
  #13 = Utf8               ()V
  #14 = NameAndType        #7:#13         // "<init>":()V
  #15 = Methodref          #4.#14         // java/lang/Object."<init>":()V
  #16 = Utf8               this
  #17 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1;
  #18 = Utf8               sendMessage
  #19 = Utf8               (Ljava/lang/String;)V
  #20 = Utf8               ext/mods/gameserver/model/actor/Player
  #21 = Class              #20            // ext/mods/gameserver/model/actor/Player
  #22 = NameAndType        #18:#19        // sendMessage:(Ljava/lang/String;)V
  #23 = Methodref          #21.#22        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #24 = Utf8               message
  #25 = Utf8               Ljava/lang/String;
  #26 = Utf8               getLocation
  #27 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #28 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
  #29 = Class              #28            // ext/mods/gameserver/geoengine/pathfinding/model/Location
  #30 = Utf8               getX
  #31 = Utf8               ()I
  #32 = NameAndType        #30:#31        // getX:()I
  #33 = Methodref          #21.#32        // ext/mods/gameserver/model/actor/Player.getX:()I
  #34 = Utf8               getY
  #35 = NameAndType        #34:#31        // getY:()I
  #36 = Methodref          #21.#35        // ext/mods/gameserver/model/actor/Player.getY:()I
  #37 = Utf8               getZ
  #38 = NameAndType        #37:#31        // getZ:()I
  #39 = Methodref          #21.#38        // ext/mods/gameserver/model/actor/Player.getZ:()I
  #40 = Utf8               (III)V
  #41 = NameAndType        #7:#40         // "<init>":(III)V
  #42 = Methodref          #29.#41        // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
  #43 = Utf8               Lkotlin/Metadata;
  #44 = Utf8               mv
  #45 = Integer            2
  #46 = Integer            3
  #47 = Integer            0
  #48 = Utf8               k
  #49 = Integer            1
  #50 = Utf8               xi
  #51 = Integer            48
  #52 = Utf8               d1
  #53 = Utf8               \u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b
  #54 = Utf8               d2
  #55 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #56 = Utf8
  #57 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #58 = Utf8               Brproject
  #59 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion
  #60 = Class              #59            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion
  #61 = Utf8               createAdminInterface
  #62 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #63 = NameAndType        #61:#62        // createAdminInterface:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #64 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #65 = Class              #64            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #66 = Utf8               AdminInterface
  #67 = Utf8               Companion
  #68 = Utf8               AdminCommands.kt
  #69 = Utf8               Code
  #70 = Utf8               LineNumberTable
  #71 = Utf8               LocalVariableTable
  #72 = Utf8               InnerClasses
  #73 = Utf8               EnclosingMethod
  #74 = Utf8               SourceFile
  #75 = Utf8               RuntimeVisibleAnnotations
{
  final ext.mods.gameserver.model.actor.Player $player;
    descriptor: Lext/mods/gameserver/model/actor/Player;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$Companion$createAdminInterface$1(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #12                 // Field $player:Lext/mods/gameserver/model/actor/Player;
         5: aload_0
         6: invokespecial #15                 // Method java/lang/Object."<init>":()V
         9: return
      LineNumberTable:
        line 570: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1;
            0      10     1 $player   Lext/mods/gameserver/model/actor/Player;

  public void sendMessage(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field $player:Lext/mods/gameserver/model/actor/Player;
         4: aload_1
         5: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 571: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1;
            0       9     1 message   Ljava/lang/String;

  public ext.mods.gameserver.geoengine.pathfinding.model.Location getLocation();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: new           #29                 // class ext/mods/gameserver/geoengine/pathfinding/model/Location
         3: dup
         4: aload_0
         5: getfield      #12                 // Field $player:Lext/mods/gameserver/model/actor/Player;
         8: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
        11: aload_0
        12: getfield      #12                 // Field $player:Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
        18: aload_0
        19: getfield      #12                 // Field $player:Lext/mods/gameserver/model/actor/Player;
        22: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        25: invokespecial #42                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        28: areturn
      LineNumberTable:
        line 572: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1;
}
InnerClasses:
  public static #66= #6 of #65;           // AdminInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  public static final #67= #60 of #65;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  public static final #2;                 // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1
EnclosingMethod: #60.#63                // ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$Companion.createAdminInterface
SourceFile: "AdminCommands.kt"
RuntimeVisibleAnnotations:
  0: #43(#44=[I#45,I#46,I#47],#48=I#49,#50=I#51,#52=[s#53],#54=[s#1,s#55,s#18,s#56,s#24,s#56,s#26,s#57,s#58])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"]
      d2=["ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion$createAdminInterface$1","Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;","sendMessage","","message","","getLocation","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","Brproject"]
    )
