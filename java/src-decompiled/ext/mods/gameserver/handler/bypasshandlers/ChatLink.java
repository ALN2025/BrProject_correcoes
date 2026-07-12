// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.ChatLink
// File: ext\mods\gameserver\handler\bypasshandlers\ChatLink.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/ChatLink.class
  Last modified 9 de jul de 2026; size 1611 bytes
  MD5 checksum 78778b90978e387e447858e53690e91a
  Compiled from "ChatLink.java"
public class ext.mods.gameserver.handler.bypasshandlers.ChatLink implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #30                         // ext/mods/gameserver/handler/bypasshandlers/ChatLink
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
   #9 = Methodref          #10.#11        // java/lang/String.substring:(I)Ljava/lang/String;
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // substring:(I)Ljava/lang/String;
  #12 = Utf8               java/lang/String
  #13 = Utf8               substring
  #14 = Utf8               (I)Ljava/lang/String;
  #15 = Methodref          #16.#17        // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #16 = Class              #18            // java/lang/Integer
  #17 = NameAndType        #19:#20        // parseInt:(Ljava/lang/String;)I
  #18 = Utf8               java/lang/Integer
  #19 = Utf8               parseInt
  #20 = Utf8               (Ljava/lang/String;)I
  #21 = Class              #22            // java/lang/IndexOutOfBoundsException
  #22 = Utf8               java/lang/IndexOutOfBoundsException
  #23 = Class              #24            // java/lang/NumberFormatException
  #24 = Utf8               java/lang/NumberFormatException
  #25 = Methodref          #7.#26         // ext/mods/gameserver/model/actor/Npc.showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #26 = NameAndType        #27:#28        // showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #27 = Utf8               showChatWindow
  #28 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #29 = Fieldref           #30.#31        // ext/mods/gameserver/handler/bypasshandlers/ChatLink.COMMANDS:[Ljava/lang/String;
  #30 = Class              #32            // ext/mods/gameserver/handler/bypasshandlers/ChatLink
  #31 = NameAndType        #33:#34        // COMMANDS:[Ljava/lang/String;
  #32 = Utf8               ext/mods/gameserver/handler/bypasshandlers/ChatLink
  #33 = Utf8               COMMANDS
  #34 = Utf8               [Ljava/lang/String;
  #35 = String             #36            // Chat
  #36 = Utf8               Chat
  #37 = Class              #38            // ext/mods/gameserver/handler/IBypassHandler
  #38 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/ChatLink;
  #44 = Utf8               useBypass
  #45 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #46 = Utf8               val
  #47 = Utf8               I
  #48 = Utf8               npc
  #49 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #50 = Utf8               command
  #51 = Utf8               Ljava/lang/String;
  #52 = Utf8               player
  #53 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #54 = Utf8               target
  #55 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #56 = Utf8               StackMapTable
  #57 = Class              #58            // ext/mods/gameserver/model/actor/Player
  #58 = Utf8               ext/mods/gameserver/model/actor/Player
  #59 = Class              #60            // ext/mods/gameserver/model/actor/Creature
  #60 = Utf8               ext/mods/gameserver/model/actor/Creature
  #61 = Class              #62            // java/lang/RuntimeException
  #62 = Utf8               java/lang/RuntimeException
  #63 = Utf8               getBypassList
  #64 = Utf8               ()[Ljava/lang/String;
  #65 = Utf8               <clinit>
  #66 = Utf8               SourceFile
  #67 = Utf8               ChatLink.java
{
  public ext.mods.gameserver.handler.bypasshandlers.ChatLink();
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
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/ChatLink;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: aload_3
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Npc
         4: ifeq          39
         7: aload_3
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Npc
        11: astore        4
        13: iconst_0
        14: istore        5
        16: aload_1
        17: iconst_5
        18: invokevirtual #9                  // Method java/lang/String.substring:(I)Ljava/lang/String;
        21: invokestatic  #15                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        24: istore        5
        26: goto          31
        29: astore        6
        31: aload         4
        33: aload_2
        34: iload         5
        36: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Npc.showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
        39: iconst_0
        40: ireturn
      Exception table:
         from    to  target type
            16    26    29   Class java/lang/IndexOutOfBoundsException
            16    26    29   Class java/lang/NumberFormatException
      LineNumberTable:
        line 31: 0
        line 33: 13
        line 36: 16
        line 40: 26
        line 38: 29
        line 42: 31
        line 44: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16      23     5   val   I
           13      26     4   npc   Lext/mods/gameserver/model/actor/Npc;
            0      41     0  this   Lext/mods/gameserver/handler/bypasshandlers/ChatLink;
            0      41     1 command   Ljava/lang/String;
            0      41     2 player   Lext/mods/gameserver/model/actor/Player;
            0      41     3 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/ChatLink, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Npc, int ]
          stack = [ class java/lang/RuntimeException ]
        frame_type = 1 /* same */
        frame_type = 249 /* chop */
          offset_delta = 7

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #29                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/ChatLink;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #35                 // String Chat
         8: aastore
         9: putstatic     #29                 // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "ChatLink.java"
