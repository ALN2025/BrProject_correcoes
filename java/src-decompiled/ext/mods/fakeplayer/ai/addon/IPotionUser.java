// Bytecode for: ext.mods.fakeplayer.ai.addon.IPotionUser
// File: ext\mods\fakeplayer\ai\addon\IPotionUser.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/ai/addon/IPotionUser.class
  Last modified 9 de jul de 2026; size 2321 bytes
  MD5 checksum fa8b22c869caedcac72f4916faa260a4
  Compiled from "IPotionUser.java"
public interface ext.mods.fakeplayer.ai.addon.IPotionUser
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #39                         // ext/mods/fakeplayer/ai/addon/IPotionUser
  super_class: #80                        // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/FakePlayer.isDead:()Z
    #2 = Class              #4            // ext/mods/fakeplayer/FakePlayer
    #3 = NameAndType        #5:#6         // isDead:()Z
    #4 = Utf8               ext/mods/fakeplayer/FakePlayer
    #5 = Utf8               isDead
    #6 = Utf8               ()Z
    #7 = Methodref          #2.#8         // ext/mods/fakeplayer/FakePlayer.isAllSkillsDisabled:()Z
    #8 = NameAndType        #9:#6         // isAllSkillsDisabled:()Z
    #9 = Utf8               isAllSkillsDisabled
   #10 = Methodref          #2.#11        // ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #11 = NameAndType        #12:#13       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #12 = Utf8               getStatus
   #13 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #14 = Methodref          #15.#16       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
   #15 = Class              #17           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #16 = NameAndType        #18:#19       // getMaxCp:()I
   #17 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #18 = Utf8               getMaxCp
   #19 = Utf8               ()I
   #20 = Methodref          #15.#21       // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
   #21 = NameAndType        #22:#23       // getCp:()D
   #22 = Utf8               getCp
   #23 = Utf8               ()D
   #24 = Methodref          #15.#25       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
   #25 = NameAndType        #26:#19       // getMaxHp:()I
   #26 = Utf8               getMaxHp
   #27 = Methodref          #15.#28       // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
   #28 = NameAndType        #29:#23       // getHp:()D
   #29 = Utf8               getHp
   #30 = Methodref          #15.#31       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
   #31 = NameAndType        #32:#19       // getMaxMp:()I
   #32 = Utf8               getMaxMp
   #33 = Methodref          #15.#34       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
   #34 = NameAndType        #35:#23       // getMp:()D
   #35 = Utf8               getMp
   #36 = Double             0.9d
   #38 = InterfaceMethodref #39.#40       // ext/mods/fakeplayer/ai/addon/IPotionUser.usePotion:(Lext/mods/fakeplayer/FakePlayer;I)V
   #39 = Class              #41           // ext/mods/fakeplayer/ai/addon/IPotionUser
   #40 = NameAndType        #42:#43       // usePotion:(Lext/mods/fakeplayer/FakePlayer;I)V
   #41 = Utf8               ext/mods/fakeplayer/ai/addon/IPotionUser
   #42 = Utf8               usePotion
   #43 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
   #44 = Double             0.5d
   #46 = Double             0.3d
   #48 = Methodref          #2.#49        // ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #49 = NameAndType        #50:#51       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #50 = Utf8               getInventory
   #51 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #53 = Class              #55           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #54 = NameAndType        #56:#57       // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #55 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #56 = Utf8               getItemByItemId
   #57 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #58 = Methodref          #59.#60       // ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
   #59 = Class              #61           // ext/mods/gameserver/handler/ItemHandler
   #60 = NameAndType        #62:#63       // getInstance:()Lext/mods/gameserver/handler/ItemHandler;
   #61 = Utf8               ext/mods/gameserver/handler/ItemHandler
   #62 = Utf8               getInstance
   #63 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
   #64 = Methodref          #65.#66       // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #65 = Class              #67           // ext/mods/gameserver/model/item/instance/ItemInstance
   #66 = NameAndType        #68:#69       // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #67 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #68 = Utf8               getEtcItem
   #69 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
   #70 = Methodref          #59.#71       // ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #71 = NameAndType        #72:#73       // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #72 = Utf8               getHandler
   #73 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #74 = InterfaceMethodref #75.#76       // ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #75 = Class              #77           // ext/mods/gameserver/handler/IItemHandler
   #76 = NameAndType        #78:#79       // useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #77 = Utf8               ext/mods/gameserver/handler/IItemHandler
   #78 = Utf8               useItem
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #80 = Class              #81           // java/lang/Object
   #81 = Utf8               java/lang/Object
   #82 = Utf8               handlePotions
   #83 = Utf8               (Lext/mods/fakeplayer/FakePlayer;III)V
   #84 = Utf8               Code
   #85 = Utf8               LineNumberTable
   #86 = Utf8               LocalVariableTable
   #87 = Utf8               this
   #88 = Utf8               Lext/mods/fakeplayer/ai/addon/IPotionUser;
   #89 = Utf8               fakePlayer
   #90 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #91 = Utf8               cpPotionId
   #92 = Utf8               I
   #93 = Utf8               hpPotionId
   #94 = Utf8               mpPotionId
   #95 = Utf8               maxCp
   #96 = Utf8               D
   #97 = Utf8               currentCp
   #98 = Utf8               maxHp
   #99 = Utf8               currentHp
  #100 = Utf8               maxMp
  #101 = Utf8               currentMp
  #102 = Utf8               StackMapTable
  #103 = Utf8               handler
  #104 = Utf8               Lext/mods/gameserver/handler/IItemHandler;
  #105 = Utf8               itemId
  #106 = Utf8               potion
  #107 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #108 = Utf8               SourceFile
  #109 = Utf8               IPotionUser.java
{
  public default void handlePotions(ext.mods.fakeplayer.FakePlayer, int, int, int);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=17, args_size=5
         0: aload_1
         1: ifnull        18
         4: aload_1
         5: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.isDead:()Z
         8: ifne          18
        11: aload_1
        12: invokevirtual #7                  // Method ext/mods/fakeplayer/FakePlayer.isAllSkillsDisabled:()Z
        15: ifeq          19
        18: return
        19: aload_1
        20: invokevirtual #10                 // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        23: invokevirtual #14                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
        26: i2d
        27: dstore        5
        29: aload_1
        30: invokevirtual #10                 // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        33: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
        36: dstore        7
        38: aload_1
        39: invokevirtual #10                 // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        42: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
        45: i2d
        46: dstore        9
        48: aload_1
        49: invokevirtual #10                 // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        52: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
        55: dstore        11
        57: aload_1
        58: invokevirtual #10                 // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        61: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
        64: i2d
        65: dstore        13
        67: aload_1
        68: invokevirtual #10                 // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        71: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
        74: dstore        15
        76: dload         7
        78: dload         5
        80: ddiv
        81: ldc2_w        #36                 // double 0.9d
        84: dcmpg
        85: ifge          96
        88: aload_0
        89: aload_1
        90: iload_2
        91: invokeinterface #38,  3           // InterfaceMethod usePotion:(Lext/mods/fakeplayer/FakePlayer;I)V
        96: dload         11
        98: dload         9
       100: ddiv
       101: ldc2_w        #44                 // double 0.5d
       104: dcmpg
       105: ifge          116
       108: aload_0
       109: aload_1
       110: iload_3
       111: invokeinterface #38,  3           // InterfaceMethod usePotion:(Lext/mods/fakeplayer/FakePlayer;I)V
       116: dload         15
       118: dload         13
       120: ddiv
       121: ldc2_w        #46                 // double 0.3d
       124: dcmpg
       125: ifge          137
       128: aload_0
       129: aload_1
       130: iload         4
       132: invokeinterface #38,  3           // InterfaceMethod usePotion:(Lext/mods/fakeplayer/FakePlayer;I)V
       137: return
      LineNumberTable:
        line 31: 0
        line 32: 18
        line 34: 19
        line 35: 29
        line 37: 38
        line 38: 48
        line 40: 57
        line 41: 67
        line 43: 76
        line 44: 88
        line 46: 96
        line 47: 108
        line 49: 116
        line 50: 128
        line 51: 137
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     138     0  this   Lext/mods/fakeplayer/ai/addon/IPotionUser;
            0     138     1 fakePlayer   Lext/mods/fakeplayer/FakePlayer;
            0     138     2 cpPotionId   I
            0     138     3 hpPotionId   I
            0     138     4 mpPotionId   I
           29     109     5 maxCp   D
           38     100     7 currentCp   D
           48      90     9 maxHp   D
           57      81    11 currentHp   D
           67      71    13 maxMp   D
           76      62    15 currentMp   D
      StackMapTable: number_of_entries = 5
        frame_type = 18 /* same */
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/fakeplayer/ai/addon/IPotionUser, class ext/mods/fakeplayer/FakePlayer, int, int, int, double, double, double, double, double, double ]
          stack = []
        frame_type = 19 /* same */
        frame_type = 20 /* same */

  public default void usePotion(ext.mods.fakeplayer.FakePlayer, int);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: invokevirtual #48                 // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         4: iload_2
         5: invokevirtual #52                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         8: astore_3
         9: aload_3
        10: ifnull        40
        13: invokestatic  #58                 // Method ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
        16: aload_3
        17: invokevirtual #64                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
        20: invokevirtual #70                 // Method ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
        23: astore        4
        25: aload         4
        27: ifnull        40
        30: aload         4
        32: aload_1
        33: aload_3
        34: iconst_0
        35: invokeinterface #74,  4           // InterfaceMethod ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
        40: return
      LineNumberTable:
        line 55: 0
        line 56: 9
        line 58: 13
        line 59: 25
        line 61: 30
        line 65: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      15     4 handler   Lext/mods/gameserver/handler/IItemHandler;
            0      41     0  this   Lext/mods/fakeplayer/ai/addon/IPotionUser;
            0      41     1 fakePlayer   Lext/mods/fakeplayer/FakePlayer;
            0      41     2 itemId   I
            9      32     3 potion   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
}
SourceFile: "IPotionUser.java"
