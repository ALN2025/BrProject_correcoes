// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.hwidAdminBan
// File: ext\mods\gameserver\handler\admincommandhandlers\hwidAdminBan.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan.class
  Last modified 9 de jul de 2026; size 2241 bytes
  MD5 checksum 006c285fb01d57ea55472bad25fe241c
  Compiled from "hwidAdminBan.java"
public class ext.mods.gameserver.handler.admincommandhandlers.hwidAdminBan implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #57                         // ext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.ALLOW_GUARD_SYSTEM:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // ALLOW_GUARD_SYSTEM:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               ALLOW_GUARD_SYSTEM
   #12 = Utf8               Z
   #13 = String             #14           // admin_hwid_ban
   #14 = Utf8               admin_hwid_ban
   #15 = Methodref          #16.#17       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #16 = Class              #18           // java/lang/String
   #17 = NameAndType        #19:#20       // startsWith:(Ljava/lang/String;)Z
   #18 = Utf8               java/lang/String
   #19 = Utf8               startsWith
   #20 = Utf8               (Ljava/lang/String;)Z
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #22 = Class              #24           // ext/mods/gameserver/model/actor/Player
   #23 = NameAndType        #25:#26       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #24 = Utf8               ext/mods/gameserver/model/actor/Player
   #25 = Utf8               getTarget
   #26 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #27 = String             #28           // Target is empty
   #28 = Utf8               Target is empty
   #29 = Methodref          #22.#30       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #30 = NameAndType        #31:#32       // sendMessage:(Ljava/lang/String;)V
   #31 = Utf8               sendMessage
   #32 = Utf8               (Ljava/lang/String;)V
   #33 = Methodref          #22.#34       // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
   #34 = NameAndType        #35:#36       // getClient:()Lext/mods/gameserver/network/GameClient;
   #35 = Utf8               getClient
   #36 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #37 = Methodref          #38.#39       // ext/mods/protection/hwid/manager/hwidBan.addHWIDBan:(Lext/mods/gameserver/network/GameClient;)V
   #38 = Class              #40           // ext/mods/protection/hwid/manager/hwidBan
   #39 = NameAndType        #41:#42       // addHWIDBan:(Lext/mods/gameserver/network/GameClient;)V
   #40 = Utf8               ext/mods/protection/hwid/manager/hwidBan
   #41 = Utf8               addHWIDBan
   #42 = Utf8               (Lext/mods/gameserver/network/GameClient;)V
   #43 = Methodref          #22.#44       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #44 = NameAndType        #45:#46       // getName:()Ljava/lang/String;
   #45 = Utf8               getName
   #46 = Utf8               ()Ljava/lang/String;
   #47 = InvokeDynamic      #0:#48        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #48 = NameAndType        #49:#50       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #49 = Utf8               makeConcatWithConstants
   #50 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #51 = InvokeDynamic      #1:#48        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #52 = Methodref          #22.#53       // ext/mods/gameserver/model/actor/Player.logout:(Z)V
   #53 = NameAndType        #54:#55       // logout:(Z)V
   #54 = Utf8               logout
   #55 = Utf8               (Z)V
   #56 = Fieldref           #57.#58       // ext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan.ADMIN_COMMANDS:[Ljava/lang/String;
   #57 = Class              #59           // ext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan
   #58 = NameAndType        #60:#61       // ADMIN_COMMANDS:[Ljava/lang/String;
   #59 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan
   #60 = Utf8               ADMIN_COMMANDS
   #61 = Utf8               [Ljava/lang/String;
   #62 = Class              #63           // ext/mods/gameserver/handler/IAdminCommandHandler
   #63 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #64 = Utf8               Code
   #65 = Utf8               LineNumberTable
   #66 = Utf8               LocalVariableTable
   #67 = Utf8               this
   #68 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan;
   #69 = Utf8               useAdminCommand
   #70 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #71 = Utf8               playerTarget
   #72 = Utf8               Lext/mods/gameserver/model/WorldObject;
   #73 = Utf8               target
   #74 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #75 = Utf8               command
   #76 = Utf8               Ljava/lang/String;
   #77 = Utf8               player
   #78 = Utf8               StackMapTable
   #79 = Class              #80           // ext/mods/gameserver/model/WorldObject
   #80 = Utf8               ext/mods/gameserver/model/WorldObject
   #81 = Utf8               getAdminCommandList
   #82 = Utf8               ()[Ljava/lang/String;
   #83 = Utf8               <clinit>
   #84 = Utf8               SourceFile
   #85 = Utf8               hwidAdminBan.java
   #86 = Utf8               BootstrapMethods
   #87 = String             #88           // \u0001 banned in HWID
   #88 = Utf8               \u0001 banned in HWID
   #89 = String             #90           // \u0001 Kick
   #90 = Utf8               \u0001 Kick
   #91 = MethodHandle       6:#92         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #92 = Methodref          #93.#94       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #93 = Class              #95           // java/lang/invoke/StringConcatFactory
   #94 = NameAndType        #49:#96       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #95 = Utf8               java/lang/invoke/StringConcatFactory
   #96 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #97 = Utf8               InnerClasses
   #98 = Class              #99           // java/lang/invoke/MethodHandles$Lookup
   #99 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #100 = Class              #101          // java/lang/invoke/MethodHandles
  #101 = Utf8               java/lang/invoke/MethodHandles
  #102 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.hwidAdminBan();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: getstatic     #7                  // Field ext/mods/Config.ALLOW_GUARD_SYSTEM:Z
         3: ifeq          10
         6: aload_2
         7: ifnonnull     11
        10: return
        11: aload_1
        12: ldc           #13                 // String admin_hwid_ban
        14: invokevirtual #15                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        17: ifeq          87
        20: aload_2
        21: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        24: astore_3
        25: aload_3
        26: instanceof    #22                 // class ext/mods/gameserver/model/actor/Player
        29: ifne          39
        32: aload_2
        33: ldc           #27                 // String Target is empty
        35: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        38: return
        39: aload_3
        40: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        43: astore        4
        45: aload         4
        47: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        50: invokestatic  #37                 // Method ext/mods/protection/hwid/manager/hwidBan.addHWIDBan:(Lext/mods/gameserver/network/GameClient;)V
        53: aload_2
        54: aload         4
        56: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        59: invokedynamic #47,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        64: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        67: aload_2
        68: aload         4
        70: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        73: invokedynamic #51,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        78: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        81: aload         4
        83: iconst_0
        84: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
        87: return
      LineNumberTable:
        line 36: 0
        line 37: 10
        line 39: 11
        line 41: 20
        line 42: 25
        line 44: 32
        line 45: 38
        line 47: 39
        line 48: 45
        line 49: 53
        line 50: 67
        line 51: 81
        line 53: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      62     3 playerTarget   Lext/mods/gameserver/model/WorldObject;
           45      42     4 target   Lext/mods/gameserver/model/actor/Player;
            0      88     0  this   Lext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan;
            0      88     1 command   Ljava/lang/String;
            0      88     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 10 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 250 /* chop */
          offset_delta = 47

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #56                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/hwidAdminBan;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #16                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #13                 // String admin_hwid_ban
         8: aastore
         9: putstatic     #56                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "hwidAdminBan.java"
BootstrapMethods:
  0: #91 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #87 \u0001 banned in HWID
  1: #91 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #89 \u0001 Kick
InnerClasses:
  public static final #102= #98 of #100;  // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
