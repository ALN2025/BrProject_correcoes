// Bytecode for: ext.mods.gameserver.data.manager.BotsPreventionManager$reportCheckTask
// File: ext\mods\gameserver\data\manager\BotsPreventionManager$reportCheckTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask.class
  Last modified 9 de jul de 2026; size 1385 bytes
  MD5 checksum 7c256b5bf15fb08985cfc971ca98421d
  Compiled from "BotsPreventionManager.java"
class ext.mods.gameserver.data.manager.BotsPreventionManager$reportCheckTask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 2, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask.this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #8 = Class              #10            // ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
  #10 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/gameserver/data/manager/BotsPreventionManager;
  #13 = Methodref          #14.#15        // java/lang/Object."<init>":()V
  #14 = Class              #16            // java/lang/Object
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/lang/Object
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask._player:Lext/mods/gameserver/model/actor/Player;
  #20 = NameAndType        #21:#22        // _player:Lext/mods/gameserver/model/actor/Player;
  #21 = Utf8               _player
  #22 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/data/manager/BotsPreventionManager._validation:Ljava/util/Map;
  #24 = Class              #26            // ext/mods/gameserver/data/manager/BotsPreventionManager
  #25 = NameAndType        #27:#28        // _validation:Ljava/util/Map;
  #26 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager
  #27 = Utf8               _validation
  #28 = Utf8               Ljava/util/Map;
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #30 = Class              #32            // ext/mods/gameserver/model/actor/Player
  #31 = NameAndType        #33:#34        // getObjectId:()I
  #32 = Utf8               ext/mods/gameserver/model/actor/Player
  #33 = Utf8               getObjectId
  #34 = Utf8               ()I
  #35 = Methodref          #36.#37        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #36 = Class              #38            // java/lang/Integer
  #37 = NameAndType        #39:#40        // valueOf:(I)Ljava/lang/Integer;
  #38 = Utf8               java/lang/Integer
  #39 = Utf8               valueOf
  #40 = Utf8               (I)Ljava/lang/Integer;
  #41 = InterfaceMethodref #42.#43        // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #42 = Class              #44            // java/util/Map
  #43 = NameAndType        #45:#6         // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #44 = Utf8               java/util/Map
  #45 = Utf8               get
  #46 = Methodref          #24.#47        // ext/mods/gameserver/data/manager/BotsPreventionManager.banPunishment:(Lext/mods/gameserver/model/actor/Player;)V
  #47 = NameAndType        #48:#49        // banPunishment:(Lext/mods/gameserver/model/actor/Player;)V
  #48 = Utf8               banPunishment
  #49 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #50 = Class              #51            // java/lang/Runnable
  #51 = Utf8               java/lang/Runnable
  #52 = Utf8               (Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;)V
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               LocalVariableTable
  #56 = Utf8               this
  #57 = Utf8               Lext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask;
  #58 = Utf8               player
  #59 = Utf8               MethodParameters
  #60 = Utf8               run
  #61 = Utf8               StackMapTable
  #62 = Utf8               SourceFile
  #63 = Utf8               BotsPreventionManager.java
  #64 = Utf8               NestHost
  #65 = Utf8               InnerClasses
  #66 = Utf8               reportCheckTask
{
  final ext.mods.gameserver.data.manager.BotsPreventionManager this$0;
    descriptor: Lext/mods/gameserver/data/manager/BotsPreventionManager;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.data.manager.BotsPreventionManager$reportCheckTask(ext.mods.gameserver.data.manager.BotsPreventionManager, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: aload_0
        15: aload_2
        16: putfield      #19                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        19: return
      LineNumberTable:
        line 407: 0
        line 408: 14
        line 409: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask;
            0      20     2 player   Lext/mods/gameserver/model/actor/Player;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic
      <no name>

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #23                 // Field ext/mods/gameserver/data/manager/BotsPreventionManager._validation:Ljava/util/Map;
         3: aload_0
         4: getfield      #19                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         7: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: invokeinterface #41,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        18: ifnull        32
        21: aload_0
        22: getfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
        25: aload_0
        26: getfield      #19                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        29: invokevirtual #46                 // Method ext/mods/gameserver/data/manager/BotsPreventionManager.banPunishment:(Lext/mods/gameserver/model/actor/Player;)V
        32: return
      LineNumberTable:
        line 414: 0
        line 415: 21
        line 416: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask;
      StackMapTable: number_of_entries = 1
        frame_type = 32 /* same */
}
SourceFile: "BotsPreventionManager.java"
NestHost: class ext/mods/gameserver/data/manager/BotsPreventionManager
