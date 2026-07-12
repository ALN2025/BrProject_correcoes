// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminOlympiad
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminOlympiad.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad.class
  Last modified 9 de jul de 2026; size 3220 bytes
  MD5 checksum 5892bdc62b11fa532a2a3652b3b05410
  Compiled from "AdminOlympiad.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminOlympiad implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #35                         // ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_endoly
    #8 = Utf8               admin_endoly
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #16 = Class              #18           // ext/mods/gameserver/model/olympiad/Olympiad
   #17 = NameAndType        #19:#20       // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #18 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
   #19 = Utf8               getInstance
   #20 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
   #21 = Methodref          #16.#22       // ext/mods/gameserver/model/olympiad/Olympiad.manualSelectHeroes:()V
   #22 = NameAndType        #23:#6        // manualSelectHeroes:()V
   #23 = Utf8               manualSelectHeroes
   #24 = String             #25           // Heroes have been formed.
   #25 = Utf8               Heroes have been formed.
   #26 = Methodref          #27.#28       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #27 = Class              #29           // ext/mods/gameserver/model/actor/Player
   #28 = NameAndType        #30:#31       // sendMessage:(Ljava/lang/String;)V
   #29 = Utf8               ext/mods/gameserver/model/actor/Player
   #30 = Utf8               sendMessage
   #31 = Utf8               (Ljava/lang/String;)V
   #32 = String             #33           // admin_sethero
   #33 = Utf8               admin_sethero
   #34 = Methodref          #35.#36       // ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #35 = Class              #37           // ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad
   #36 = NameAndType        #38:#39       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #37 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad
   #38 = Utf8               getTargetPlayer
   #39 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #40 = Methodref          #27.#41       // ext/mods/gameserver/model/actor/Player.isHero:()Z
   #41 = NameAndType        #42:#43       // isHero:()Z
   #42 = Utf8               isHero
   #43 = Utf8               ()Z
   #44 = Methodref          #27.#45       // ext/mods/gameserver/model/actor/Player.setHero:(Z)V
   #45 = NameAndType        #46:#47       // setHero:(Z)V
   #46 = Utf8               setHero
   #47 = Utf8               (Z)V
   #48 = Methodref          #27.#49       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #49 = NameAndType        #50:#6        // broadcastUserInfo:()V
   #50 = Utf8               broadcastUserInfo
   #51 = Methodref          #27.#52       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #52 = NameAndType        #53:#54       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #53 = Utf8               getInventory
   #54 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
   #56 = Class              #58           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #57 = NameAndType        #59:#60       // getPaperdollItems:()Ljava/util/List;
   #58 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #59 = Utf8               getPaperdollItems
   #60 = Utf8               ()Ljava/util/List;
   #61 = InterfaceMethodref #62.#63       // java/util/List.iterator:()Ljava/util/Iterator;
   #62 = Class              #64           // java/util/List
   #63 = NameAndType        #65:#66       // iterator:()Ljava/util/Iterator;
   #64 = Utf8               java/util/List
   #65 = Utf8               iterator
   #66 = Utf8               ()Ljava/util/Iterator;
   #67 = InterfaceMethodref #68.#69       // java/util/Iterator.hasNext:()Z
   #68 = Class              #70           // java/util/Iterator
   #69 = NameAndType        #71:#43       // hasNext:()Z
   #70 = Utf8               java/util/Iterator
   #71 = Utf8               hasNext
   #72 = InterfaceMethodref #68.#73       // java/util/Iterator.next:()Ljava/lang/Object;
   #73 = NameAndType        #74:#75       // next:()Ljava/lang/Object;
   #74 = Utf8               next
   #75 = Utf8               ()Ljava/lang/Object;
   #76 = Class              #77           // ext/mods/gameserver/model/item/instance/ItemInstance
   #77 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #78 = Methodref          #76.#79       // ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
   #79 = NameAndType        #80:#43       // isHeroItem:()Z
   #80 = Utf8               isHeroItem
   #81 = Methodref          #27.#82       // ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #82 = NameAndType        #83:#84       // useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #83 = Utf8               useEquippableItem
   #84 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #85 = Methodref          #56.#86       // ext/mods/gameserver/model/itemcontainer/PcInventory.getAvailableItems:(ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #86 = NameAndType        #87:#88       // getAvailableItems:(ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #87 = Utf8               getAvailableItems
   #88 = Utf8               (ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #89 = Methodref          #27.#90       // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #90 = NameAndType        #91:#92       // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #91 = Utf8               destroyItem
   #92 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #93 = Methodref          #27.#94       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #94 = NameAndType        #95:#96       // getName:()Ljava/lang/String;
   #95 = Utf8               getName
   #96 = Utf8               ()Ljava/lang/String;
   #97 = InvokeDynamic      #0:#98        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #98 = NameAndType        #99:#100      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #99 = Utf8               makeConcatWithConstants
  #100 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #101 = Fieldref           #35.#102      // ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad.ADMIN_COMMANDS:[Ljava/lang/String;
  #102 = NameAndType        #103:#104     // ADMIN_COMMANDS:[Ljava/lang/String;
  #103 = Utf8               ADMIN_COMMANDS
  #104 = Utf8               [Ljava/lang/String;
  #105 = Class              #106          // ext/mods/gameserver/handler/IAdminCommandHandler
  #106 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #107 = Utf8               Code
  #108 = Utf8               LineNumberTable
  #109 = Utf8               LocalVariableTable
  #110 = Utf8               this
  #111 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad;
  #112 = Utf8               useAdminCommand
  #113 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #114 = Utf8               item
  #115 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #116 = Utf8               targetPlayer
  #117 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #118 = Utf8               command
  #119 = Utf8               Ljava/lang/String;
  #120 = Utf8               player
  #121 = Utf8               StackMapTable
  #122 = Class              #123          // "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
  #123 = Utf8               [Lext/mods/gameserver/model/item/instance/ItemInstance;
  #124 = Utf8               getAdminCommandList
  #125 = Utf8               ()[Ljava/lang/String;
  #126 = Utf8               <clinit>
  #127 = Utf8               SourceFile
  #128 = Utf8               AdminOlympiad.java
  #129 = Utf8               BootstrapMethods
  #130 = String             #131          // You have modified \u0001\'s hero status.
  #131 = Utf8               You have modified \u0001\'s hero status.
  #132 = MethodHandle       6:#133        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #133 = Methodref          #134.#135     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #134 = Class              #136          // java/lang/invoke/StringConcatFactory
  #135 = NameAndType        #99:#137      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #136 = Utf8               java/lang/invoke/StringConcatFactory
  #137 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #138 = Utf8               InnerClasses
  #139 = Class              #140          // java/lang/invoke/MethodHandles$Lookup
  #140 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #141 = Class              #142          // java/lang/invoke/MethodHandles
  #142 = Utf8               java/lang/invoke/MethodHandles
  #143 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminOlympiad();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_endoly
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          24
         9: invokestatic  #15                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
        12: invokevirtual #21                 // Method ext/mods/gameserver/model/olympiad/Olympiad.manualSelectHeroes:()V
        15: aload_2
        16: ldc           #24                 // String Heroes have been formed.
        18: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        21: goto          193
        24: aload_1
        25: ldc           #32                 // String admin_sethero
        27: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        30: ifeq          193
        33: aload_0
        34: aload_2
        35: iconst_1
        36: invokevirtual #34                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
        39: astore_3
        40: aload_3
        41: aload_3
        42: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
        45: ifne          52
        48: iconst_1
        49: goto          53
        52: iconst_0
        53: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.setHero:(Z)V
        56: aload_3
        57: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        60: aload_3
        61: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
        64: ifne          180
        67: aload_3
        68: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        71: invokevirtual #55                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
        74: invokeinterface #61,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        79: astore        4
        81: aload         4
        83: invokeinterface #67,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        88: ifeq          121
        91: aload         4
        93: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        98: checkcast     #76                 // class ext/mods/gameserver/model/item/instance/ItemInstance
       101: astore        5
       103: aload         5
       105: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
       108: ifeq          118
       111: aload_3
       112: aload         5
       114: iconst_1
       115: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       118: goto          81
       121: aload_3
       122: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       125: iconst_0
       126: iconst_1
       127: iconst_0
       128: invokevirtual #85                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAvailableItems:(ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
       131: astore        4
       133: aload         4
       135: arraylength
       136: istore        5
       138: iconst_0
       139: istore        6
       141: iload         6
       143: iload         5
       145: if_icmpge     180
       148: aload         4
       150: iload         6
       152: aaload
       153: astore        7
       155: aload         7
       157: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
       160: ifne          166
       163: goto          174
       166: aload_3
       167: aload         7
       169: iconst_1
       170: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       173: pop
       174: iinc          6, 1
       177: goto          141
       180: aload_2
       181: aload_3
       182: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       185: invokedynamic #97,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       190: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       193: return
      LineNumberTable:
        line 36: 0
        line 38: 9
        line 39: 15
        line 41: 24
        line 43: 33
        line 44: 40
        line 45: 56
        line 47: 60
        line 49: 67
        line 51: 103
        line 52: 111
        line 53: 118
        line 55: 121
        line 57: 155
        line 58: 163
        line 60: 166
        line 55: 174
        line 64: 180
        line 66: 193
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          103      15     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          155      19     7  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           40     153     3 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     194     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad;
            0     194     1 command   Ljava/lang/String;
            0     194     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 11
        frame_type = 24 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/Iterator ]
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 19
          locals = [ class "[Lext/mods/gameserver/model/item/instance/ItemInstance;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 12

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #101                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminOlympiad;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_endoly
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #32                 // String admin_sethero
        13: aastore
        14: putstatic     #101                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "AdminOlympiad.java"
BootstrapMethods:
  0: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #130 You have modified \u0001\'s hero status.
InnerClasses:
  public static final #143= #139 of #141; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
