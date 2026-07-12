// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminReloadSummonItems
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminReloadSummonItems.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems.class
  Last modified 9 de jul de 2026; size 2419 bytes
  MD5 checksum 2f60d4ebfe493b1d558e93127ac10c52
  Compiled from "AdminReloadSummonItems.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminReloadSummonItems implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #67                         // ext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_reload_summon_items
    #8 = Utf8               admin_reload_summon_items
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = String             #16           // admin_reload_summon_mobs
   #16 = Utf8               admin_reload_summon_mobs
   #17 = Methodref          #18.#19       // ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
   #18 = Class              #20           // ext/mods/summonmobitem/SummonMobItemData
   #19 = NameAndType        #21:#22       // getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
   #20 = Utf8               ext/mods/summonmobitem/SummonMobItemData
   #21 = Utf8               getInstance
   #22 = Utf8               ()Lext/mods/summonmobitem/SummonMobItemData;
   #23 = Methodref          #18.#24       // ext/mods/summonmobitem/SummonMobItemData.load:()V
   #24 = NameAndType        #25:#6        // load:()V
   #25 = Utf8               load
   #26 = Methodref          #18.#27       // ext/mods/summonmobitem/SummonMobItemData.getLoadedCount:()I
   #27 = NameAndType        #28:#29       // getLoadedCount:()I
   #28 = Utf8               getLoadedCount
   #29 = Utf8               ()I
   #30 = String             #31           // Summon items configuration reloaded successfully!
   #31 = Utf8               Summon items configuration reloaded successfully!
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #33 = Class              #35           // ext/mods/gameserver/model/actor/Player
   #34 = NameAndType        #36:#37       // sendMessage:(Ljava/lang/String;)V
   #35 = Utf8               ext/mods/gameserver/model/actor/Player
   #36 = Utf8               sendMessage
   #37 = Utf8               (Ljava/lang/String;)V
   #38 = InvokeDynamic      #0:#39        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #39 = NameAndType        #40:#41       // makeConcatWithConstants:(I)Ljava/lang/String;
   #40 = Utf8               makeConcatWithConstants
   #41 = Utf8               (I)Ljava/lang/String;
   #42 = Class              #43           // java/lang/Exception
   #43 = Utf8               java/lang/Exception
   #44 = Methodref          #42.#45       // java/lang/Exception.getMessage:()Ljava/lang/String;
   #45 = NameAndType        #46:#47       // getMessage:()Ljava/lang/String;
   #46 = Utf8               getMessage
   #47 = Utf8               ()Ljava/lang/String;
   #48 = InvokeDynamic      #1:#49        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #49 = NameAndType        #40:#50       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #50 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #51 = Fieldref           #52.#53       // java/lang/System.err:Ljava/io/PrintStream;
   #52 = Class              #54           // java/lang/System
   #53 = NameAndType        #55:#56       // err:Ljava/io/PrintStream;
   #54 = Utf8               java/lang/System
   #55 = Utf8               err
   #56 = Utf8               Ljava/io/PrintStream;
   #57 = InvokeDynamic      #2:#49        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #58 = Methodref          #59.#60       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #59 = Class              #61           // java/io/PrintStream
   #60 = NameAndType        #62:#37       // println:(Ljava/lang/String;)V
   #61 = Utf8               java/io/PrintStream
   #62 = Utf8               println
   #63 = Methodref          #42.#64       // java/lang/Exception.printStackTrace:()V
   #64 = NameAndType        #65:#6        // printStackTrace:()V
   #65 = Utf8               printStackTrace
   #66 = Fieldref           #67.#68       // ext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems.ADMIN_COMMANDS:[Ljava/lang/String;
   #67 = Class              #69           // ext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems
   #68 = NameAndType        #70:#71       // ADMIN_COMMANDS:[Ljava/lang/String;
   #69 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems
   #70 = Utf8               ADMIN_COMMANDS
   #71 = Utf8               [Ljava/lang/String;
   #72 = Class              #73           // ext/mods/gameserver/handler/IAdminCommandHandler
   #73 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #74 = Utf8               Code
   #75 = Utf8               LineNumberTable
   #76 = Utf8               LocalVariableTable
   #77 = Utf8               this
   #78 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems;
   #79 = Utf8               useAdminCommand
   #80 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #81 = Utf8               loadedCount
   #82 = Utf8               I
   #83 = Utf8               e
   #84 = Utf8               Ljava/lang/Exception;
   #85 = Utf8               command
   #86 = Utf8               Ljava/lang/String;
   #87 = Utf8               activeChar
   #88 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #89 = Utf8               StackMapTable
   #90 = Utf8               getAdminCommandList
   #91 = Utf8               ()[Ljava/lang/String;
   #92 = Utf8               <clinit>
   #93 = Utf8               SourceFile
   #94 = Utf8               AdminReloadSummonItems.java
   #95 = Utf8               BootstrapMethods
   #96 = String             #97           // Loaded \u0001 summon item configurations.
   #97 = Utf8               Loaded \u0001 summon item configurations.
   #98 = String             #99           // Error reloading summon items configuration: \u0001
   #99 = Utf8               Error reloading summon items configuration: \u0001
  #100 = String             #101          // Error reloading summon items: \u0001
  #101 = Utf8               Error reloading summon items: \u0001
  #102 = MethodHandle       6:#103        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #103 = Methodref          #104.#105     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Class              #106          // java/lang/invoke/StringConcatFactory
  #105 = NameAndType        #40:#107      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #106 = Utf8               java/lang/invoke/StringConcatFactory
  #107 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #108 = Utf8               InnerClasses
  #109 = Class              #110          // java/lang/invoke/MethodHandles$Lookup
  #110 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #111 = Class              #112          // java/lang/invoke/MethodHandles
  #112 = Utf8               java/lang/invoke/MethodHandles
  #113 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminReloadSummonItems();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_reload_summon_items
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifne          18
         9: aload_1
        10: ldc           #15                 // String admin_reload_summon_mobs
        12: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        15: ifeq          83
        18: invokestatic  #17                 // Method ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
        21: invokevirtual #23                 // Method ext/mods/summonmobitem/SummonMobItemData.load:()V
        24: invokestatic  #17                 // Method ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
        27: invokevirtual #26                 // Method ext/mods/summonmobitem/SummonMobItemData.getLoadedCount:()I
        30: istore_3
        31: aload_2
        32: ldc           #30                 // String Summon items configuration reloaded successfully!
        34: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        37: aload_2
        38: iload_3
        39: invokedynamic #38,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        44: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        47: goto          83
        50: astore_3
        51: aload_2
        52: aload_3
        53: invokevirtual #44                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        56: invokedynamic #48,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        61: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        64: getstatic     #51                 // Field java/lang/System.err:Ljava/io/PrintStream;
        67: aload_3
        68: invokevirtual #44                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        71: invokedynamic #57,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        76: invokevirtual #58                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        79: aload_3
        80: invokevirtual #63                 // Method java/lang/Exception.printStackTrace:()V
        83: return
      Exception table:
         from    to  target type
            18    47    50   Class java/lang/Exception
      LineNumberTable:
        line 40: 0
        line 44: 18
        line 46: 24
        line 48: 31
        line 49: 37
        line 56: 47
        line 51: 50
        line 53: 51
        line 54: 64
        line 55: 79
        line 58: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      16     3 loadedCount   I
           51      32     3     e   Ljava/lang/Exception;
            0      84     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems;
            0      84     1 command   Ljava/lang/String;
            0      84     2 activeChar   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 95 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 32 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #66                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminReloadSummonItems;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_reload_summon_items
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #15                 // String admin_reload_summon_mobs
        13: aastore
        14: putstatic     #66                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "AdminReloadSummonItems.java"
BootstrapMethods:
  0: #102 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #96 Loaded \u0001 summon item configurations.
  1: #102 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #98 Error reloading summon items configuration: \u0001
  2: #102 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #100 Error reloading summon items: \u0001
InnerClasses:
  public static final #113= #109 of #111; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
