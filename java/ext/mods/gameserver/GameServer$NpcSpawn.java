// Bytecode for: ext.mods.gameserver.GameServer$NpcSpawn
// File: ext\mods\gameserver\GameServer$NpcSpawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/GameServer$NpcSpawn.class
  Last modified 9 de jul de 2026; size 1244 bytes
  MD5 checksum c4e7db6b9ff2118a639d7ed7f38638f9
  Compiled from "GameServer.kt"
public final class ext.mods.gameserver.GameServer$NpcSpawn implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/GameServer$NpcSpawn
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/GameServer$NpcSpawn
   #2 = Class              #1             // ext/mods/gameserver/GameServer$NpcSpawn
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               java/lang/Runnable
   #6 = Class              #5             // java/lang/Runnable
   #7 = Utf8               <init>
   #8 = Utf8               (Lext/mods/gameserver/GameServer;)V
   #9 = Utf8               ()V
  #10 = Utf8               this$0
  #11 = Utf8               Lext/mods/gameserver/GameServer;
  #12 = NameAndType        #10:#11        // this$0:Lext/mods/gameserver/GameServer;
  #13 = Fieldref           #2.#12         // ext/mods/gameserver/GameServer$NpcSpawn.this$0:Lext/mods/gameserver/GameServer;
  #14 = NameAndType        #7:#9          // "<init>":()V
  #15 = Methodref          #4.#14         // java/lang/Object."<init>":()V
  #16 = Utf8               this
  #17 = Utf8               Lext/mods/gameserver/GameServer$NpcSpawn;
  #18 = Utf8               run
  #19 = Utf8               ext/mods/gameserver/GameServer
  #20 = Class              #19            // ext/mods/gameserver/GameServer
  #21 = Utf8               access$getLOGGER$cp
  #22 = Utf8               ()Lext/mods/commons/logging/CLogger;
  #23 = NameAndType        #21:#22        // access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
  #24 = Methodref          #20.#23        // ext/mods/gameserver/GameServer.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
  #25 = Utf8               Emulation npc spawn: Task initialization...
  #26 = String             #25            // Emulation npc spawn: Task initialization...
  #27 = Utf8               ext/mods/commons/logging/CLogger
  #28 = Class              #27            // ext/mods/commons/logging/CLogger
  #29 = Utf8               info
  #30 = Utf8               (Ljava/lang/Object;)V
  #31 = NameAndType        #29:#30        // info:(Ljava/lang/Object;)V
  #32 = Methodref          #28.#31        // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #33 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #34 = Class              #33            // ext/mods/gameserver/data/manager/SpawnManager
  #35 = Utf8               getInstance
  #36 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #37 = NameAndType        #35:#36        // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #38 = Methodref          #34.#37        // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #39 = Utf8               spawn
  #40 = NameAndType        #39:#9         // spawn:()V
  #41 = Methodref          #34.#40        // ext/mods/gameserver/data/manager/SpawnManager.spawn:()V
  #42 = Utf8               Lkotlin/Metadata;
  #43 = Utf8               mv
  #44 = Integer            2
  #45 = Integer            3
  #46 = Integer            0
  #47 = Utf8               k
  #48 = Integer            1
  #49 = Utf8               xi
  #50 = Integer            48
  #51 = Utf8               d1
  #52 = Utf8               \u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006
  #53 = Utf8               d2
  #54 = Utf8               Ljava/lang/Runnable;
  #55 = Utf8
  #56 = Utf8               Brproject
  #57 = Utf8               NpcSpawn
  #58 = Utf8               GameServer.kt
  #59 = Utf8               Code
  #60 = Utf8               LineNumberTable
  #61 = Utf8               LocalVariableTable
  #62 = Utf8               Signature
  #63 = Utf8               InnerClasses
  #64 = Utf8               SourceFile
  #65 = Utf8               RuntimeVisibleAnnotations
{
  final ext.mods.gameserver.GameServer this$0;
    descriptor: Lext/mods/gameserver/GameServer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.GameServer$NpcSpawn();
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #13                 // Field this$0:Lext/mods/gameserver/GameServer;
         5: aload_0
         6: invokespecial #15                 // Method java/lang/Object."<init>":()V
         9: return
      LineNumberTable:
        line 695: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/GameServer$NpcSpawn;
            0      10     1 this$0   Lext/mods/gameserver/GameServer;
    Signature: #9                           // ()V

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #24                 // Method ext/mods/gameserver/GameServer.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
         3: ldc           #26                 // String Emulation npc spawn: Task initialization...
         5: invokevirtual #32                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
         8: invokestatic  #38                 // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        11: invokevirtual #41                 // Method ext/mods/gameserver/data/manager/SpawnManager.spawn:()V
        14: return
      LineNumberTable:
        line 697: 0
        line 698: 8
        line 699: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/GameServer$NpcSpawn;
}
InnerClasses:
  public final #57= #2 of #20;            // NpcSpawn=class ext/mods/gameserver/GameServer$NpcSpawn of class ext/mods/gameserver/GameServer
SourceFile: "GameServer.kt"
RuntimeVisibleAnnotations:
  0: #42(#43=[I#44,I#45,I#46],#47=I#48,#49=I#50,#51=[s#52],#53=[s#17,s#54,s#7,s#8,s#18,s#55,s#56])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"]
      d2=["Lext/mods/gameserver/GameServer$NpcSpawn;","Ljava/lang/Runnable;","<init>","(Lext/mods/gameserver/GameServer;)V","run","","Brproject"]
    )
