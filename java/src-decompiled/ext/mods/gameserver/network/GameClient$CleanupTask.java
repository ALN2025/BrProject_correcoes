// Bytecode for: ext.mods.gameserver.network.GameClient$CleanupTask
// File: ext\mods\gameserver\network\GameClient$CleanupTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/GameClient$CleanupTask.class
  Last modified 9 de jul de 2026; size 1687 bytes
  MD5 checksum 41596ebb3dc4ff5f2485eb8aa4b8668f
  Compiled from "GameClient.java"
public class ext.mods.gameserver.network.GameClient$CleanupTask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/GameClient$CleanupTask
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/network/GameClient$CleanupTask.this$0:Lext/mods/gameserver/network/GameClient;
   #8 = Class              #10            // ext/mods/gameserver/network/GameClient$CleanupTask
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/gameserver/network/GameClient;
  #10 = Utf8               ext/mods/gameserver/network/GameClient$CleanupTask
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/gameserver/network/GameClient;
  #13 = Methodref          #14.#15        // java/lang/Object."<init>":()V
  #14 = Class              #16            // java/lang/Object
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/lang/Object
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/network/GameClient._autoSaveInDB:Ljava/util/concurrent/ScheduledFuture;
  #20 = Class              #22            // ext/mods/gameserver/network/GameClient
  #21 = NameAndType        #23:#24        // _autoSaveInDB:Ljava/util/concurrent/ScheduledFuture;
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Utf8               _autoSaveInDB
  #24 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #25 = InterfaceMethodref #26.#27        // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #26 = Class              #28            // java/util/concurrent/ScheduledFuture
  #27 = NameAndType        #29:#30        // cancel:(Z)Z
  #28 = Utf8               java/util/concurrent/ScheduledFuture
  #29 = Utf8               cancel
  #30 = Utf8               (Z)Z
  #31 = Methodref          #20.#32        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #32 = NameAndType        #33:#34        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #33 = Utf8               getPlayer
  #34 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #35 = Methodref          #36.#37        // ext/mods/gameserver/model/actor/Player.setClient:(Lext/mods/gameserver/network/GameClient;)V
  #36 = Class              #38            // ext/mods/gameserver/model/actor/Player
  #37 = NameAndType        #39:#40        // setClient:(Lext/mods/gameserver/network/GameClient;)V
  #38 = Utf8               ext/mods/gameserver/model/actor/Player
  #39 = Utf8               setClient
  #40 = Utf8               (Lext/mods/gameserver/network/GameClient;)V
  #41 = Methodref          #36.#42        // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #42 = NameAndType        #43:#44        // isOnline:()Z
  #43 = Utf8               isOnline
  #44 = Utf8               ()Z
  #45 = Methodref          #36.#46        // ext/mods/gameserver/model/actor/Player.deleteMe:()V
  #46 = NameAndType        #47:#18        // deleteMe:()V
  #47 = Utf8               deleteMe
  #48 = Methodref          #49.#50        // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #49 = Class              #51            // ext/mods/gameserver/data/manager/AntiFeedManager
  #50 = NameAndType        #52:#53        // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #51 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
  #52 = Utf8               getInstance
  #53 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #54 = Methodref          #49.#55        // ext/mods/gameserver/data/manager/AntiFeedManager.onDisconnect:(Lext/mods/gameserver/network/GameClient;)V
  #55 = NameAndType        #56:#40        // onDisconnect:(Lext/mods/gameserver/network/GameClient;)V
  #56 = Utf8               onDisconnect
  #57 = Methodref          #20.#58        // ext/mods/gameserver/network/GameClient.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #58 = NameAndType        #59:#60        // setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #59 = Utf8               setPlayer
  #60 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #61 = Methodref          #62.#63        // ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
  #62 = Class              #64            // ext/mods/gameserver/LoginServerThread
  #63 = NameAndType        #52:#65        // getInstance:()Lext/mods/gameserver/LoginServerThread;
  #64 = Utf8               ext/mods/gameserver/LoginServerThread
  #65 = Utf8               ()Lext/mods/gameserver/LoginServerThread;
  #66 = Methodref          #20.#67        // ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
  #67 = NameAndType        #68:#69        // getAccountName:()Ljava/lang/String;
  #68 = Utf8               getAccountName
  #69 = Utf8               ()Ljava/lang/String;
  #70 = Methodref          #62.#71        // ext/mods/gameserver/LoginServerThread.sendLogout:(Ljava/lang/String;)V
  #71 = NameAndType        #72:#73        // sendLogout:(Ljava/lang/String;)V
  #72 = Utf8               sendLogout
  #73 = Utf8               (Ljava/lang/String;)V
  #74 = Class              #75            // java/lang/Runnable
  #75 = Utf8               java/lang/Runnable
  #76 = Utf8               Code
  #77 = Utf8               LineNumberTable
  #78 = Utf8               LocalVariableTable
  #79 = Utf8               this
  #80 = Utf8               Lext/mods/gameserver/network/GameClient$CleanupTask;
  #81 = Utf8               MethodParameters
  #82 = Utf8               run
  #83 = Utf8               StackMapTable
  #84 = Utf8               SourceFile
  #85 = Utf8               GameClient.java
  #86 = Utf8               NestHost
  #87 = Utf8               InnerClasses
  #88 = Utf8               CleanupTask
{
  final ext.mods.gameserver.network.GameClient this$0;
    descriptor: Lext/mods/gameserver/network/GameClient;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  protected ext.mods.gameserver.network.GameClient$CleanupTask(ext.mods.gameserver.network.GameClient);
    descriptor: (Lext/mods/gameserver/network/GameClient;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 725: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/network/GameClient$CleanupTask;
            0      15     1 this$0   Lext/mods/gameserver/network/GameClient;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
         4: getfield      #19                 // Field ext/mods/gameserver/network/GameClient._autoSaveInDB:Ljava/util/concurrent/ScheduledFuture;
         7: ifnull        24
        10: aload_0
        11: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        14: getfield      #19                 // Field ext/mods/gameserver/network/GameClient._autoSaveInDB:Ljava/util/concurrent/ScheduledFuture;
        17: iconst_1
        18: invokeinterface #25,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        23: pop
        24: aload_0
        25: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        28: invokevirtual #31                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        31: ifnull        78
        34: aload_0
        35: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        38: invokevirtual #31                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        41: aconst_null
        42: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.setClient:(Lext/mods/gameserver/network/GameClient;)V
        45: aload_0
        46: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        49: invokevirtual #31                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        52: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        55: ifeq          68
        58: aload_0
        59: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        62: invokevirtual #31                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        65: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.deleteMe:()V
        68: invokestatic  #48                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
        71: aload_0
        72: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        75: invokevirtual #54                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.onDisconnect:(Lext/mods/gameserver/network/GameClient;)V
        78: aload_0
        79: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        82: aconst_null
        83: invokevirtual #57                 // Method ext/mods/gameserver/network/GameClient.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        86: invokestatic  #61                 // Method ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
        89: aload_0
        90: getfield      #7                  // Field this$0:Lext/mods/gameserver/network/GameClient;
        93: invokevirtual #66                 // Method ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
        96: invokevirtual #70                 // Method ext/mods/gameserver/LoginServerThread.sendLogout:(Ljava/lang/String;)V
        99: return
      LineNumberTable:
        line 730: 0
        line 731: 10
        line 733: 24
        line 735: 34
        line 737: 45
        line 738: 58
        line 740: 68
        line 742: 78
        line 744: 86
        line 745: 99
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     100     0  this   Lext/mods/gameserver/network/GameClient$CleanupTask;
      StackMapTable: number_of_entries = 3
        frame_type = 24 /* same */
        frame_type = 43 /* same */
        frame_type = 9 /* same */
}
SourceFile: "GameClient.java"
NestHost: class ext/mods/gameserver/network/GameClient
InnerClasses:
  protected #88= #8 of #20;               // CleanupTask=class ext/mods/gameserver/network/GameClient$CleanupTask of class ext/mods/gameserver/network/GameClient
