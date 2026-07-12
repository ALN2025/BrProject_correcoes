// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.Multisell
// File: ext\mods\gameserver\handler\bypasshandlers\Multisell.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/Multisell.class
  Last modified 9 de jul de 2026; size 1955 bytes
  MD5 checksum 26d046eda127277f39345eab9da3884e
  Compiled from "Multisell.java"
public class ext.mods.gameserver.handler.bypasshandlers.Multisell implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/bypasshandlers/Multisell
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Npc
   #8 = Utf8               ext/mods/gameserver/model/actor/Npc
   #9 = Methodref          #10.#11        // java/lang/String.toLowerCase:()Ljava/lang/String;
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // toLowerCase:()Ljava/lang/String;
  #12 = Utf8               java/lang/String
  #13 = Utf8               toLowerCase
  #14 = Utf8               ()Ljava/lang/String;
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/handler/bypasshandlers/Multisell.COMMANDS:[Ljava/lang/String;
  #16 = Class              #18            // ext/mods/gameserver/handler/bypasshandlers/Multisell
  #17 = NameAndType        #19:#20        // COMMANDS:[Ljava/lang/String;
  #18 = Utf8               ext/mods/gameserver/handler/bypasshandlers/Multisell
  #19 = Utf8               COMMANDS
  #20 = Utf8               [Ljava/lang/String;
  #21 = Methodref          #10.#22        // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #22 = NameAndType        #23:#24        // startsWith:(Ljava/lang/String;)Z
  #23 = Utf8               startsWith
  #24 = Utf8               (Ljava/lang/String;)Z
  #25 = Methodref          #26.#27        // ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #26 = Class              #28            // ext/mods/gameserver/data/xml/MultisellData
  #27 = NameAndType        #29:#30        // getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #28 = Utf8               ext/mods/gameserver/data/xml/MultisellData
  #29 = Utf8               getInstance
  #30 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
  #31 = Methodref          #10.#32        // java/lang/String.substring:(I)Ljava/lang/String;
  #32 = NameAndType        #33:#34        // substring:(I)Ljava/lang/String;
  #33 = Utf8               substring
  #34 = Utf8               (I)Ljava/lang/String;
  #35 = Methodref          #10.#36        // java/lang/String.trim:()Ljava/lang/String;
  #36 = NameAndType        #37:#14        // trim:()Ljava/lang/String;
  #37 = Utf8               trim
  #38 = Methodref          #26.#39        // ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #39 = NameAndType        #40:#41        // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #40 = Utf8               separateAndSend
  #41 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #42 = Class              #43            // java/lang/Exception
  #43 = Utf8               java/lang/Exception
  #44 = Fieldref           #16.#45        // ext/mods/gameserver/handler/bypasshandlers/Multisell.LOGGER:Lext/mods/commons/logging/CLogger;
  #45 = NameAndType        #46:#47        // LOGGER:Lext/mods/commons/logging/CLogger;
  #46 = Utf8               LOGGER
  #47 = Utf8               Lext/mods/commons/logging/CLogger;
  #48 = Methodref          #42.#49        // java/lang/Exception.getMessage:()Ljava/lang/String;
  #49 = NameAndType        #50:#14        // getMessage:()Ljava/lang/String;
  #50 = Utf8               getMessage
  #51 = Methodref          #52.#53        // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #52 = Class              #54            // ext/mods/commons/logging/CLogger
  #53 = NameAndType        #55:#56        // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #54 = Utf8               ext/mods/commons/logging/CLogger
  #55 = Utf8               warn
  #56 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #57 = String             #58            // multisell
  #58 = Utf8               multisell
  #59 = String             #60            // exc_multisell
  #60 = Utf8               exc_multisell
  #61 = Class              #62            // ext/mods/gameserver/handler/IBypassHandler
  #62 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #63 = Utf8               Code
  #64 = Utf8               LineNumberTable
  #65 = Utf8               LocalVariableTable
  #66 = Utf8               this
  #67 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/Multisell;
  #68 = Utf8               useBypass
  #69 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #70 = Utf8               npc
  #71 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #72 = Utf8               e
  #73 = Utf8               Ljava/lang/Exception;
  #74 = Utf8               command
  #75 = Utf8               Ljava/lang/String;
  #76 = Utf8               player
  #77 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #78 = Utf8               target
  #79 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #80 = Utf8               StackMapTable
  #81 = Utf8               getBypassList
  #82 = Utf8               ()[Ljava/lang/String;
  #83 = Utf8               <clinit>
  #84 = Utf8               SourceFile
  #85 = Utf8               Multisell.java
{
  public ext.mods.gameserver.handler.bypasshandlers.Multisell();
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
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/Multisell;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: aload_3
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Npc
         4: ifeq          85
         7: aload_3
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Npc
        11: astore        4
        13: aload_1
        14: invokevirtual #9                  // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        17: getstatic     #15                 // Field COMMANDS:[Ljava/lang/String;
        20: iconst_0
        21: aaload
        22: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        25: ifeq          49
        28: invokestatic  #25                 // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
        31: aload_1
        32: bipush        9
        34: invokevirtual #31                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        37: invokevirtual #35                 // Method java/lang/String.trim:()Ljava/lang/String;
        40: aload_2
        41: aload         4
        43: iconst_0
        44: invokevirtual #38                 // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
        47: iconst_1
        48: ireturn
        49: aload_1
        50: invokevirtual #9                  // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        53: getstatic     #15                 // Field COMMANDS:[Ljava/lang/String;
        56: iconst_1
        57: aaload
        58: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        61: ifeq          85
        64: invokestatic  #25                 // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
        67: aload_1
        68: bipush        13
        70: invokevirtual #31                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        73: invokevirtual #35                 // Method java/lang/String.trim:()Ljava/lang/String;
        76: aload_2
        77: aload         4
        79: iconst_1
        80: invokevirtual #38                 // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
        83: iconst_1
        84: ireturn
        85: iconst_0
        86: ireturn
        87: astore        4
        89: getstatic     #44                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        92: aload         4
        94: invokevirtual #48                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        97: aload         4
        99: invokevirtual #51                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       102: iconst_0
       103: ireturn
      Exception table:
         from    to  target type
             0    48    87   Class java/lang/Exception
            49    84    87   Class java/lang/Exception
            85    86    87   Class java/lang/Exception
      LineNumberTable:
        line 36: 0
        line 38: 13
        line 40: 28
        line 41: 47
        line 43: 49
        line 45: 64
        line 46: 83
        line 49: 85
        line 51: 87
        line 52: 89
        line 54: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      72     4   npc   Lext/mods/gameserver/model/actor/Npc;
           89      13     4     e   Ljava/lang/Exception;
            0     104     0  this   Lext/mods/gameserver/handler/bypasshandlers/Multisell;
            0     104     1 command   Ljava/lang/String;
            0     104     2 player   Lext/mods/gameserver/model/actor/Player;
            0     104     3 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 250 /* chop */
          offset_delta = 35
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #15                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/Multisell;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #57                 // String multisell
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #59                 // String exc_multisell
        13: aastore
        14: putstatic     #15                 // Field COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "Multisell.java"
