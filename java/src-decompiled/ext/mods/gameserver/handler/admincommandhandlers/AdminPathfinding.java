// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminPathfinding
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminPathfinding.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding.class
  Last modified 9 de jul de 2026; size 3217 bytes
  MD5 checksum 4d4a981833af168c1573ab4694842c77
  Compiled from "AdminPathfinding.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminPathfinding implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_pathfinding
    #8 = Utf8               admin_pathfinding
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = String             #16           // admin_pf_stats
   #16 = Utf8               admin_pf_stats
   #17 = Methodref          #18.#19       // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding.showPathfindingStats:(Lext/mods/gameserver/model/actor/Player;)V
   #18 = Class              #20           // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding
   #19 = NameAndType        #21:#22       // showPathfindingStats:(Lext/mods/gameserver/model/actor/Player;)V
   #20 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding
   #21 = Utf8               showPathfindingStats
   #22 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #23 = String             #24           // admin_pf_clear
   #24 = Utf8               admin_pf_clear
   #25 = Methodref          #26.#27       // ext/mods/gameserver/geoengine/PathfindingCache.clearCache:()V
   #26 = Class              #28           // ext/mods/gameserver/geoengine/PathfindingCache
   #27 = NameAndType        #29:#6        // clearCache:()V
   #28 = Utf8               ext/mods/gameserver/geoengine/PathfindingCache
   #29 = Utf8               clearCache
   #30 = String             #31           // ? Cache de pathfinding limpo com sucesso!
   #31 = Utf8               ? Cache de pathfinding limpo com sucesso!
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #33 = Class              #35           // ext/mods/gameserver/model/actor/Player
   #34 = NameAndType        #36:#37       // sendMessage:(Ljava/lang/String;)V
   #35 = Utf8               ext/mods/gameserver/model/actor/Player
   #36 = Utf8               sendMessage
   #37 = Utf8               (Ljava/lang/String;)V
   #38 = String             #39           // === PATHFINDING STATS ===
   #39 = Utf8               === PATHFINDING STATS ===
   #40 = String             #41           //
   #41 = Utf8
   #42 = Methodref          #26.#43       // ext/mods/gameserver/geoengine/PathfindingCache.getStats:()Ljava/lang/String;
   #43 = NameAndType        #44:#45       // getStats:()Ljava/lang/String;
   #44 = Utf8               getStats
   #45 = Utf8               ()Ljava/lang/String;
   #46 = InvokeDynamic      #0:#47        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #47 = NameAndType        #48:#49       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #48 = Utf8               makeConcatWithConstants
   #49 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #50 = String             #51           // %.1f%%
   #51 = Utf8               %.1f%%
   #52 = Methodref          #26.#53       // ext/mods/gameserver/geoengine/PathfindingCache.getHitRate:()D
   #53 = NameAndType        #54:#55       // getHitRate:()D
   #54 = Utf8               getHitRate
   #55 = Utf8               ()D
   #56 = Double             100.0d
   #58 = Methodref          #59.#60       // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #59 = Class              #61           // java/lang/Double
   #60 = NameAndType        #62:#63       // valueOf:(D)Ljava/lang/Double;
   #61 = Utf8               java/lang/Double
   #62 = Utf8               valueOf
   #63 = Utf8               (D)Ljava/lang/Double;
   #64 = Methodref          #10.#65       // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #65 = NameAndType        #66:#67       // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #66 = Utf8               format
   #67 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #68 = InvokeDynamic      #1:#47        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #69 = String             #70           // ? Pathfinding ThreadPool:
   #70 = Utf8               ? Pathfinding ThreadPool:
   #71 = Methodref          #72.#73       // ext/mods/commons/pool/ThreadPool.getPathfindingActiveCount:()I
   #72 = Class              #74           // ext/mods/commons/pool/ThreadPool
   #73 = NameAndType        #75:#76       // getPathfindingActiveCount:()I
   #74 = Utf8               ext/mods/commons/pool/ThreadPool
   #75 = Utf8               getPathfindingActiveCount
   #76 = Utf8               ()I
   #77 = InvokeDynamic      #2:#78        // #2:makeConcatWithConstants:(I)Ljava/lang/String;
   #78 = NameAndType        #48:#79       // makeConcatWithConstants:(I)Ljava/lang/String;
   #79 = Utf8               (I)Ljava/lang/String;
   #80 = Methodref          #72.#81       // ext/mods/commons/pool/ThreadPool.getPathfindingQueueSize:()I
   #81 = NameAndType        #82:#76       // getPathfindingQueueSize:()I
   #82 = Utf8               getPathfindingQueueSize
   #83 = InvokeDynamic      #3:#78        // #3:makeConcatWithConstants:(I)Ljava/lang/String;
   #84 = Double             0.3d
   #86 = String             #87           // ?? AVISO: Hit rate baixo (<30%)
   #87 = Utf8               ?? AVISO: Hit rate baixo (<30%)
   #88 = String             #89           //    Considere aumentar PathfindingCacheSize ou PathfindingCacheExpiration
   #89 = Utf8                  Considere aumentar PathfindingCacheSize ou PathfindingCacheExpiration
   #90 = Double             0.7d
   #92 = String             #93           // ? Cache funcionando bem (>70% hit rate)
   #93 = Utf8               ? Cache funcionando bem (>70% hit rate)
   #94 = InvokeDynamic      #4:#78        // #4:makeConcatWithConstants:(I)Ljava/lang/String;
   #95 = String             #96           //    Considere aumentar PathfindingThreads em geoengine.properties
   #96 = Utf8                  Considere aumentar PathfindingThreads em geoengine.properties
   #97 = String             #98           // Use //pf_clear para limpar o cache
   #98 = Utf8               Use //pf_clear para limpar o cache
   #99 = Fieldref           #18.#100      // ext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding.ADMIN_COMMANDS:[Ljava/lang/String;
  #100 = NameAndType        #101:#102     // ADMIN_COMMANDS:[Ljava/lang/String;
  #101 = Utf8               ADMIN_COMMANDS
  #102 = Utf8               [Ljava/lang/String;
  #103 = Class              #104          // ext/mods/gameserver/handler/IAdminCommandHandler
  #104 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               LocalVariableTable
  #108 = Utf8               this
  #109 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding;
  #110 = Utf8               useAdminCommand
  #111 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #112 = Utf8               command
  #113 = Utf8               Ljava/lang/String;
  #114 = Utf8               player
  #115 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #116 = Utf8               StackMapTable
  #117 = Utf8               hitRate
  #118 = Utf8               D
  #119 = Utf8               queueSize
  #120 = Utf8               I
  #121 = Utf8               getAdminCommandList
  #122 = Utf8               ()[Ljava/lang/String;
  #123 = Utf8               <clinit>
  #124 = Utf8               SourceFile
  #125 = Utf8               AdminPathfinding.java
  #126 = Utf8               BootstrapMethods
  #127 = String             #128          // ? \u0001
  #128 = Utf8               ? \u0001
  #129 = String             #130          //    ?? Hit Rate: \u0001
  #130 = Utf8                  ?? Hit Rate: \u0001
  #131 = String             #132          //    ?? Threads Ativas: \u0001
  #132 = Utf8                  ?? Threads Ativas: \u0001
  #133 = String             #134          //    ?? Fila de Espera: \u0001
  #134 = Utf8                  ?? Fila de Espera: \u0001
  #135 = String             #136          // ?? AVISO: Fila de pathfinding alta (\u0001)
  #136 = Utf8               ?? AVISO: Fila de pathfinding alta (\u0001)
  #137 = MethodHandle       6:#138        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #138 = Methodref          #139.#140     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #139 = Class              #141          // java/lang/invoke/StringConcatFactory
  #140 = NameAndType        #48:#142      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #141 = Utf8               java/lang/invoke/StringConcatFactory
  #142 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #143 = Utf8               InnerClasses
  #144 = Class              #145          // java/lang/invoke/MethodHandles$Lookup
  #145 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #146 = Class              #147          // java/lang/invoke/MethodHandles
  #147 = Utf8               java/lang/invoke/MethodHandles
  #148 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminPathfinding();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_pathfinding
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifne          18
         9: aload_1
        10: ldc           #15                 // String admin_pf_stats
        12: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        15: ifeq          26
        18: aload_0
        19: aload_2
        20: invokevirtual #17                 // Method showPathfindingStats:(Lext/mods/gameserver/model/actor/Player;)V
        23: goto          49
        26: aload_1
        27: ldc           #23                 // String admin_pf_clear
        29: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        32: ifeq          49
        35: invokestatic  #25                 // Method ext/mods/gameserver/geoengine/PathfindingCache.clearCache:()V
        38: aload_2
        39: ldc           #30                 // String ? Cache de pathfinding limpo com sucesso!
        41: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        44: aload_0
        45: aload_2
        46: invokevirtual #17                 // Method showPathfindingStats:(Lext/mods/gameserver/model/actor/Player;)V
        49: return
      LineNumberTable:
        line 40: 0
        line 42: 18
        line 44: 26
        line 46: 35
        line 47: 38
        line 48: 44
        line 50: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding;
            0      50     1 command   Ljava/lang/String;
            0      50     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 7 /* same */
        frame_type = 22 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #99                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPathfinding;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_pathfinding
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #15                 // String admin_pf_stats
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #23                 // String admin_pf_clear
        18: aastore
        19: putstatic     #99                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        22: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "AdminPathfinding.java"
BootstrapMethods:
  0: #137 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #127 ? \u0001
  1: #137 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #129    ?? Hit Rate: \u0001
  2: #137 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #131    ?? Threads Ativas: \u0001
  3: #137 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #133    ?? Fila de Espera: \u0001
  4: #137 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #135 ?? AVISO: Fila de pathfinding alta (\u0001)
InnerClasses:
  public static final #148= #144 of #146; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
