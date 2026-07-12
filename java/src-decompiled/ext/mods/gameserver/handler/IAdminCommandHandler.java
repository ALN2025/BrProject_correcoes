// Bytecode for: ext.mods.gameserver.handler.IAdminCommandHandler
// File: ext\mods\gameserver\handler\IAdminCommandHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/IAdminCommandHandler.class
  Last modified 9 de jul de 2026; size 3907 bytes
  MD5 checksum 4b852867b0620ce067222f8843c78c08
  Compiled from "IAdminCommandHandler.java"
public interface ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #12                         // ext/mods/gameserver/handler/IAdminCommandHandler
  super_class: #29                        // java/lang/Object
  interfaces: 0, fields: 9, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
    #2 = Class              #4            // ext/mods/gameserver/model/World
    #3 = NameAndType        #5:#6         // getInstance:()Lext/mods/gameserver/model/World;
    #4 = Utf8               ext/mods/gameserver/model/World
    #5 = Utf8               getInstance
    #6 = Utf8               ()Lext/mods/gameserver/model/World;
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
    #8 = NameAndType        #9:#10        // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
    #9 = Utf8               getPlayer
   #10 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #11 = InterfaceMethodref #12.#13       // ext/mods/gameserver/handler/IAdminCommandHandler.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #12 = Class              #14           // ext/mods/gameserver/handler/IAdminCommandHandler
   #13 = NameAndType        #15:#16       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #14 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #15 = Utf8               getTargetPlayer
   #16 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #17 = Class              #18           // ext/mods/gameserver/model/actor/Player
   #18 = Utf8               ext/mods/gameserver/model/actor/Player
   #19 = InterfaceMethodref #12.#20       // ext/mods/gameserver/handler/IAdminCommandHandler.getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #20 = NameAndType        #21:#22       // getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #21 = Utf8               getTarget
   #22 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #23 = Class              #24           // ext/mods/gameserver/model/actor/Creature
   #24 = Utf8               ext/mods/gameserver/model/actor/Creature
   #25 = Methodref          #17.#26       // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #26 = NameAndType        #21:#27       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #27 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #28 = Methodref          #29.#30       // java/lang/Object.getClass:()Ljava/lang/Class;
   #29 = Class              #31           // java/lang/Object
   #30 = NameAndType        #32:#33       // getClass:()Ljava/lang/Class;
   #31 = Utf8               java/lang/Object
   #32 = Utf8               getClass
   #33 = Utf8               ()Ljava/lang/Class;
   #34 = Methodref          #35.#36       // java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
   #35 = Class              #37           // java/lang/Class
   #36 = NameAndType        #38:#39       // isAssignableFrom:(Ljava/lang/Class;)Z
   #37 = Utf8               java/lang/Class
   #38 = Utf8               isAssignableFrom
   #39 = Utf8               (Ljava/lang/Class;)Z
   #40 = Methodref          #35.#41       // java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
   #41 = NameAndType        #42:#43       // cast:(Ljava/lang/Object;)Ljava/lang/Object;
   #42 = Utf8               cast
   #43 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #44 = Class              #45           // ext/mods/gameserver/model/WorldObject
   #45 = Utf8               ext/mods/gameserver/model/WorldObject
   #46 = Class              #47           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #47 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #48 = Methodref          #46.#49       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #49 = NameAndType        #50:#51       // "<init>":(I)V
   #50 = Utf8               <init>
   #51 = Utf8               (I)V
   #52 = Methodref          #17.#53       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #53 = NameAndType        #54:#55       // getLocale:()Ljava/util/Locale;
   #54 = Utf8               getLocale
   #55 = Utf8               ()Ljava/util/Locale;
   #56 = InvokeDynamic      #0:#57        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #57 = NameAndType        #58:#59       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #58 = Utf8               makeConcatWithConstants
   #59 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #60 = Methodref          #46.#61       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #61 = NameAndType        #62:#63       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #62 = Utf8               setFile
   #63 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #64 = Methodref          #17.#65       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #65 = NameAndType        #66:#67       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #66 = Utf8               sendPacket
   #67 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #68 = Class              #69           // ext/mods/commons/logging/CLogger
   #69 = Utf8               ext/mods/commons/logging/CLogger
   #70 = Methodref          #35.#71       // java/lang/Class.getName:()Ljava/lang/String;
   #71 = NameAndType        #72:#73       // getName:()Ljava/lang/String;
   #72 = Utf8               getName
   #73 = Utf8               ()Ljava/lang/String;
   #74 = Methodref          #68.#75       // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
   #75 = NameAndType        #50:#76       // "<init>":(Ljava/lang/String;)V
   #76 = Utf8               (Ljava/lang/String;)V
   #77 = Fieldref           #12.#78       // ext/mods/gameserver/handler/IAdminCommandHandler.LOGGER:Lext/mods/commons/logging/CLogger;
   #78 = NameAndType        #79:#80       // LOGGER:Lext/mods/commons/logging/CLogger;
   #79 = Utf8               LOGGER
   #80 = Utf8               Lext/mods/commons/logging/CLogger;
   #81 = Utf8               PAGE_LIMIT_1
   #82 = Utf8               I
   #83 = Utf8               ConstantValue
   #84 = Integer            1
   #85 = Utf8               PAGE_LIMIT_7
   #86 = Integer            7
   #87 = Utf8               PAGE_LIMIT_8
   #88 = Integer            8
   #89 = Utf8               PAGE_LIMIT_10
   #90 = Integer            10
   #91 = Utf8               PAGE_LIMIT_12
   #92 = Integer            12
   #93 = Utf8               PAGE_LIMIT_14
   #94 = Integer            14
   #95 = Utf8               PAGE_LIMIT_15
   #96 = Integer            15
   #97 = Utf8               PAGE_LIMIT_20
   #98 = Integer            20
   #99 = Utf8               useAdminCommand
  #100 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #101 = Utf8               getAdminCommandList
  #102 = Utf8               ()[Ljava/lang/String;
  #103 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
  #104 = Utf8               Code
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               this
  #108 = Utf8               Lext/mods/gameserver/handler/IAdminCommandHandler;
  #109 = Utf8               player
  #110 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #111 = Utf8               playerName
  #112 = Utf8               Ljava/lang/String;
  #113 = Utf8               defaultAdmin
  #114 = Utf8               Z
  #115 = Utf8               toTest
  #116 = Utf8               StackMapTable
  #117 = Utf8               getTargetCreature
  #118 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #119 = Utf8               type
  #120 = Utf8               Ljava/lang/Class;
  #121 = Utf8               target
  #122 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #123 = Utf8               LocalVariableTypeTable
  #124 = Utf8               Ljava/lang/Class<TA;>;
  #125 = Utf8               Signature
  #126 = Utf8               <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Lext/mods/gameserver/model/actor/Player;Z)TA;
  #127 = Utf8               sendFile
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #129 = Utf8               filename
  #130 = Utf8               html
  #131 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #132 = Utf8               <clinit>
  #133 = Utf8               ()V
  #134 = Utf8               SourceFile
  #135 = Utf8               IAdminCommandHandler.java
  #136 = Utf8               BootstrapMethods
  #137 = String             #138          // html/admin/\u0001
  #138 = Utf8               html/admin/\u0001
  #139 = MethodHandle       6:#140        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #140 = Methodref          #141.#142     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #141 = Class              #143          // java/lang/invoke/StringConcatFactory
  #142 = NameAndType        #58:#144      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #143 = Utf8               java/lang/invoke/StringConcatFactory
  #144 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #145 = Utf8               InnerClasses
  #146 = Class              #147          // java/lang/invoke/MethodHandles$Lookup
  #147 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #148 = Class              #149          // java/lang/invoke/MethodHandles
  #149 = Utf8               java/lang/invoke/MethodHandles
  #150 = Utf8               Lookup
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final int PAGE_LIMIT_1;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int PAGE_LIMIT_7;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 7

  public static final int PAGE_LIMIT_8;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int PAGE_LIMIT_10;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 10

  public static final int PAGE_LIMIT_12;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 12

  public static final int PAGE_LIMIT_14;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 14

  public static final int PAGE_LIMIT_15;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 15

  public static final int PAGE_LIMIT_20;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 20

  public abstract void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public default ext.mods.gameserver.model.actor.Player getTargetPlayer(ext.mods.gameserver.model.actor.Player, java.lang.String, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: invokestatic  #1                  // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: aload_2
         4: invokevirtual #7                  // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
         7: astore        4
         9: aload         4
        11: ifnonnull     25
        14: aload_0
        15: aload_1
        16: iload_3
        17: invokeinterface #11,  3           // InterfaceMethod getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
        22: goto          27
        25: aload         4
        27: areturn
      LineNumberTable:
        line 47: 0
        line 48: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/handler/IAdminCommandHandler;
            0      28     1 player   Lext/mods/gameserver/model/actor/Player;
            0      28     2 playerName   Ljava/lang/String;
            0      28     3 defaultAdmin   Z
            9      19     4 toTest   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]

  public default ext.mods.gameserver.model.actor.Player getTargetPlayer(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: ldc           #17                 // class ext/mods/gameserver/model/actor/Player
         3: aload_1
         4: iload_2
         5: invokeinterface #19,  4           // InterfaceMethod getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
        10: checkcast     #17                 // class ext/mods/gameserver/model/actor/Player
        13: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/handler/IAdminCommandHandler;
            0      14     1 player   Lext/mods/gameserver/model/actor/Player;
            0      14     2 defaultAdmin   Z

  public default ext.mods.gameserver.model.actor.Creature getTargetCreature(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: ldc           #23                 // class ext/mods/gameserver/model/actor/Creature
         3: aload_1
         4: iload_2
         5: invokeinterface #19,  4           // InterfaceMethod getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
        10: checkcast     #23                 // class ext/mods/gameserver/model/actor/Creature
        13: areturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/handler/IAdminCommandHandler;
            0      14     1 player   Lext/mods/gameserver/model/actor/Player;
            0      14     2 defaultAdmin   Z

  public default <A extends ext.mods.gameserver.model.WorldObject> A getTarget(java.lang.Class<A>, ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: aload_2
         1: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: astore        4
         6: aload         4
         8: ifnull        23
        11: aload_1
        12: aload         4
        14: invokevirtual #28                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        17: invokevirtual #34                 // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        20: ifne          51
        23: iload_3
        24: ifeq          49
        27: aload_1
        28: aload_2
        29: invokevirtual #28                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        32: invokevirtual #34                 // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        35: ifeq          49
        38: aload_1
        39: aload_2
        40: invokevirtual #40                 // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        43: checkcast     #44                 // class ext/mods/gameserver/model/WorldObject
        46: goto          50
        49: aconst_null
        50: areturn
        51: aload_1
        52: aload         4
        54: invokevirtual #40                 // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        57: checkcast     #44                 // class ext/mods/gameserver/model/WorldObject
        60: areturn
      LineNumberTable:
        line 70: 0
        line 72: 6
        line 73: 23
        line 75: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/handler/IAdminCommandHandler;
            0      61     1  type   Ljava/lang/Class;
            0      61     2 player   Lext/mods/gameserver/model/actor/Player;
            0      61     3 defaultAdmin   Z
            6      55     4 target   Lext/mods/gameserver/model/WorldObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      61     1  type   Ljava/lang/Class<TA;>;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 25 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 0 /* same */
    Signature: #126                         // <A:Lext/mods/gameserver/model/WorldObject;>(Ljava/lang/Class<TA;>;Lext/mods/gameserver/model/actor/Player;Z)TA;

  public default void sendFile(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: new           #46                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #48                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_3
         9: aload_3
        10: aload_1
        11: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        14: aload_2
        15: invokedynamic #56,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        20: invokevirtual #60                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        23: aload_1
        24: aload_3
        25: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        28: return
      LineNumberTable:
        line 80: 0
        line 81: 9
        line 82: 23
        line 83: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/handler/IAdminCommandHandler;
            0      29     1 player   Lext/mods/gameserver/model/actor/Player;
            0      29     2 filename   Ljava/lang/String;
            9      20     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #68                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #12                 // class ext/mods/gameserver/handler/IAdminCommandHandler
         6: invokevirtual #70                 // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #74                 // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "IAdminCommandHandler.java"
BootstrapMethods:
  0: #139 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #137 html/admin/\u0001
InnerClasses:
  public static final #150= #146 of #148; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
