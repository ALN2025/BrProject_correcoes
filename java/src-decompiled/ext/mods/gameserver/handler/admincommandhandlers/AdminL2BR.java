// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminL2BR
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminL2BR.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminL2BR.class
  Last modified 9 de jul de 2026; size 3233 bytes
  MD5 checksum fa70b9bd03063a5005122637722c4838
  Compiled from "AdminL2BR.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminL2BR implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #50                         // ext/mods/gameserver/handler/admincommandhandlers/AdminL2BR
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_l2br_
    #8 = Utf8               admin_l2br_
    #9 = String             #10           // //l2br_
   #10 = Utf8               //l2br_
   #11 = Methodref          #12.#13       // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #12 = Class              #14           // java/lang/String
   #13 = NameAndType        #15:#16       // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #14 = Utf8               java/lang/String
   #15 = Utf8               replace
   #16 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #18 = Class              #20           // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
   #19 = NameAndType        #21:#22       // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #20 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
   #21 = Utf8               getInstance
   #22 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #23 = Methodref          #18.#24       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.getAdminCommands:()Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #24 = NameAndType        #25:#26       // getAdminCommands:()Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #25 = Utf8               getAdminCommands
   #26 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #27 = String             #28           // L2BR Pathfinder não está inicializado. Verifique UseL2BRPathfinding em geoengine.properties.
   #28 = Utf8               L2BR Pathfinder não está inicializado. Verifique UseL2BRPathfinding em geoengine.properties.
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #30 = Class              #32           // ext/mods/gameserver/model/actor/Player
   #31 = NameAndType        #33:#34       // sendMessage:(Ljava/lang/String;)V
   #32 = Utf8               ext/mods/gameserver/model/actor/Player
   #33 = Utf8               sendMessage
   #34 = Utf8               (Ljava/lang/String;)V
   #35 = Methodref          #36.#37       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.createAdminInterface:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #36 = Class              #38           // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
   #37 = NameAndType        #39:#40       // createAdminInterface:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #38 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
   #39 = Utf8               createAdminInterface
   #40 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #41 = Methodref          #36.#42       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.processCommand:(Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
   #42 = NameAndType        #43:#44       // processCommand:(Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
   #43 = Utf8               processCommand
   #44 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
   #45 = InvokeDynamic      #0:#46        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #46 = NameAndType        #47:#48       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #47 = Utf8               makeConcatWithConstants
   #48 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #49 = Fieldref           #50.#51       // ext/mods/gameserver/handler/admincommandhandlers/AdminL2BR.ADMIN_COMMANDS:[Ljava/lang/String;
   #50 = Class              #52           // ext/mods/gameserver/handler/admincommandhandlers/AdminL2BR
   #51 = NameAndType        #53:#54       // ADMIN_COMMANDS:[Ljava/lang/String;
   #52 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminL2BR
   #53 = Utf8               ADMIN_COMMANDS
   #54 = Utf8               [Ljava/lang/String;
   #55 = String             #56           // admin_l2br_generate
   #56 = Utf8               admin_l2br_generate
   #57 = String             #58           // admin_l2br_generate_all
   #58 = Utf8               admin_l2br_generate_all
   #59 = String             #60           // admin_l2br_info
   #60 = Utf8               admin_l2br_info
   #61 = String             #62           // admin_l2br_status
   #62 = Utf8               admin_l2br_status
   #63 = String             #64           // admin_l2br_reload
   #64 = Utf8               admin_l2br_reload
   #65 = String             #66           // admin_l2br_unload
   #66 = Utf8               admin_l2br_unload
   #67 = String             #68           // admin_l2br_benchmark
   #68 = Utf8               admin_l2br_benchmark
   #69 = String             #70           // admin_l2br_config
   #70 = Utf8               admin_l2br_config
   #71 = String             #72           // admin_l2br_help
   #72 = Utf8               admin_l2br_help
   #73 = Class              #74           // ext/mods/gameserver/handler/IAdminCommandHandler
   #74 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #75 = Utf8               Code
   #76 = Utf8               LineNumberTable
   #77 = Utf8               LocalVariableTable
   #78 = Utf8               this
   #79 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminL2BR;
   #80 = Utf8               useAdminCommand
   #81 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #82 = Utf8               command
   #83 = Utf8               Ljava/lang/String;
   #84 = Utf8               player
   #85 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #86 = Utf8               l2brCommand
   #87 = Utf8               bridge
   #88 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #89 = Utf8               adminCommands
   #90 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #91 = Utf8               adminInterface
   #92 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #93 = Utf8               handled
   #94 = Utf8               Z
   #95 = Utf8               StackMapTable
   #96 = Class              #97           // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
   #97 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
   #98 = Utf8               getAdminCommandList
   #99 = Utf8               ()[Ljava/lang/String;
  #100 = Utf8               <clinit>
  #101 = Utf8               SourceFile
  #102 = Utf8               AdminL2BR.java
  #103 = Utf8               BootstrapMethods
  #104 = String             #105          // Comando L2BR não reconhecido: \u0001
  #105 = Utf8               Comando L2BR não reconhecido: \u0001
  #106 = MethodHandle       6:#107        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #107 = Methodref          #108.#109     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #108 = Class              #110          // java/lang/invoke/StringConcatFactory
  #109 = NameAndType        #47:#111      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #110 = Utf8               java/lang/invoke/StringConcatFactory
  #111 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #112 = Utf8               InnerClasses
  #113 = Utf8               AdminInterface
  #114 = Class              #115          // java/lang/invoke/MethodHandles$Lookup
  #115 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #116 = Class              #117          // java/lang/invoke/MethodHandles
  #117 = Utf8               java/lang/invoke/MethodHandles
  #118 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminL2BR();
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
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminL2BR;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_l2br_
         3: ldc           #9                  // String //l2br_
         5: invokevirtual #11                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
         8: astore_3
         9: invokestatic  #17                 // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
        12: astore        4
        14: aload         4
        16: invokevirtual #23                 // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.getAdminCommands:()Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        19: astore        5
        21: aload         5
        23: ifnonnull     33
        26: aload_2
        27: ldc           #27                 // String L2BR Pathfinder não está inicializado. Verifique UseL2BRPathfinding em geoengine.properties.
        29: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        32: return
        33: aload_2
        34: invokestatic  #35                 // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.createAdminInterface:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
        37: astore        6
        39: aload         5
        41: aload_3
        42: aload         6
        44: invokevirtual #41                 // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.processCommand:(Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
        47: istore        7
        49: iload         7
        51: ifne          64
        54: aload_2
        55: aload_3
        56: invokedynamic #45,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        61: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        64: return
      LineNumberTable:
        line 46: 0
        line 48: 9
        line 49: 14
        line 51: 21
        line 52: 26
        line 53: 32
        line 56: 33
        line 57: 39
        line 59: 49
        line 60: 54
        line 62: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminL2BR;
            0      65     1 command   Ljava/lang/String;
            0      65     2 player   Lext/mods/gameserver/model/actor/Player;
            9      56     3 l2brCommand   Ljava/lang/String;
           14      51     4 bridge   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
           21      44     5 adminCommands   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
           39      26     6 adminInterface   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
           49      16     7 handled   Z
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 33
          locals = [ class java/lang/String, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands ]
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, int ]

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #49                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminL2BR;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        9
         2: anewarray     #12                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #55                 // String admin_l2br_generate
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #57                 // String admin_l2br_generate_all
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #59                 // String admin_l2br_info
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #61                 // String admin_l2br_status
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #63                 // String admin_l2br_reload
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #65                 // String admin_l2br_unload
        34: aastore
        35: dup
        36: bipush        6
        38: ldc           #67                 // String admin_l2br_benchmark
        40: aastore
        41: dup
        42: bipush        7
        44: ldc           #69                 // String admin_l2br_config
        46: aastore
        47: dup
        48: bipush        8
        50: ldc           #71                 // String admin_l2br_help
        52: aastore
        53: putstatic     #49                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        56: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "AdminL2BR.java"
BootstrapMethods:
  0: #106 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #104 Comando L2BR não reconhecido: \u0001
InnerClasses:
  public static #113= #96 of #36;         // AdminInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  public static final #118= #114 of #116; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
