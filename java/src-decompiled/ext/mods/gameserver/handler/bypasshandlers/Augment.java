// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.Augment
// File: ext\mods\gameserver\handler\bypasshandlers\Augment.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/Augment.class
  Last modified 9 de jul de 2026; size 2025 bytes
  MD5 checksum c80c0f5dfe5631654db315f391342f1f
  Compiled from "Augment.java"
public class ext.mods.gameserver.handler.bypasshandlers.Augment implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #53                         // ext/mods/gameserver/handler/bypasshandlers/Augment
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/lang/String.substring:(II)Ljava/lang/String;
   #8 = Class              #10            // java/lang/String
   #9 = NameAndType        #11:#12        // substring:(II)Ljava/lang/String;
  #10 = Utf8               java/lang/String
  #11 = Utf8               substring
  #12 = Utf8               (II)Ljava/lang/String;
  #13 = Methodref          #8.#14         // java/lang/String.trim:()Ljava/lang/String;
  #14 = NameAndType        #15:#16        // trim:()Ljava/lang/String;
  #15 = Utf8               trim
  #16 = Utf8               ()Ljava/lang/String;
  #17 = Methodref          #18.#19        // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #18 = Class              #20            // java/lang/Integer
  #19 = NameAndType        #21:#22        // parseInt:(Ljava/lang/String;)I
  #20 = Utf8               java/lang/Integer
  #21 = Utf8               parseInt
  #22 = Utf8               (Ljava/lang/String;)I
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/network/SystemMessageId.SELECT_THE_ITEM_TO_BE_AUGMENTED:Lext/mods/gameserver/network/SystemMessageId;
  #24 = Class              #26            // ext/mods/gameserver/network/SystemMessageId
  #25 = NameAndType        #27:#28        // SELECT_THE_ITEM_TO_BE_AUGMENTED:Lext/mods/gameserver/network/SystemMessageId;
  #26 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #27 = Utf8               SELECT_THE_ITEM_TO_BE_AUGMENTED
  #28 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #30 = Class              #32            // ext/mods/gameserver/model/actor/Player
  #31 = NameAndType        #33:#34        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #32 = Utf8               ext/mods/gameserver/model/actor/Player
  #33 = Utf8               sendPacket
  #34 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #35 = Fieldref           #36.#37        // ext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow;
  #36 = Class              #38            // ext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow
  #37 = NameAndType        #39:#40        // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow;
  #38 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow
  #39 = Utf8               STATIC_PACKET
  #40 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow;
  #41 = Methodref          #30.#42        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #42 = NameAndType        #33:#43        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #43 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #44 = Fieldref           #24.#45        // ext/mods/gameserver/network/SystemMessageId.SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION:Lext/mods/gameserver/network/SystemMessageId;
  #45 = NameAndType        #46:#28        // SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION:Lext/mods/gameserver/network/SystemMessageId;
  #46 = Utf8               SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION
  #47 = Fieldref           #48.#49        // ext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow;
  #48 = Class              #50            // ext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow
  #49 = NameAndType        #39:#51        // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow;
  #50 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow
  #51 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow;
  #52 = Fieldref           #53.#54        // ext/mods/gameserver/handler/bypasshandlers/Augment.COMMANDS:[Ljava/lang/String;
  #53 = Class              #55            // ext/mods/gameserver/handler/bypasshandlers/Augment
  #54 = NameAndType        #56:#57        // COMMANDS:[Ljava/lang/String;
  #55 = Utf8               ext/mods/gameserver/handler/bypasshandlers/Augment
  #56 = Utf8               COMMANDS
  #57 = Utf8               [Ljava/lang/String;
  #58 = String             #59            // Augment
  #59 = Utf8               Augment
  #60 = Class              #61            // ext/mods/gameserver/handler/IBypassHandler
  #61 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #62 = Utf8               Code
  #63 = Utf8               LineNumberTable
  #64 = Utf8               LocalVariableTable
  #65 = Utf8               this
  #66 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/Augment;
  #67 = Utf8               useBypass
  #68 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #69 = Utf8               command
  #70 = Utf8               Ljava/lang/String;
  #71 = Utf8               player
  #72 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #73 = Utf8               target
  #74 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #75 = Utf8               cmdChoice
  #76 = Utf8               I
  #77 = Utf8               StackMapTable
  #78 = Utf8               getBypassList
  #79 = Utf8               ()[Ljava/lang/String;
  #80 = Utf8               <clinit>
  #81 = Utf8               SourceFile
  #82 = Utf8               Augment.java
{
  public ext.mods.gameserver.handler.bypasshandlers.Augment();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/Augment;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_1
         1: bipush        8
         3: bipush        9
         5: invokevirtual #7                  // Method java/lang/String.substring:(II)Ljava/lang/String;
         8: invokevirtual #13                 // Method java/lang/String.trim:()Ljava/lang/String;
        11: invokestatic  #17                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: istore        4
        16: iload         4
        18: lookupswitch  { // 2

                       1: 44

                       2: 61
                 default: 75
            }
        44: aload_2
        45: getstatic     #23                 // Field ext/mods/gameserver/network/SystemMessageId.SELECT_THE_ITEM_TO_BE_AUGMENTED:Lext/mods/gameserver/network/SystemMessageId;
        48: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        51: aload_2
        52: getstatic     #35                 // Field ext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow;
        55: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: goto          75
        61: aload_2
        62: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION:Lext/mods/gameserver/network/SystemMessageId;
        65: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        68: aload_2
        69: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow;
        72: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: iconst_0
        76: ireturn
      LineNumberTable:
        line 37: 0
        line 38: 16
        line 41: 44
        line 42: 51
        line 43: 58
        line 45: 61
        line 46: 68
        line 49: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      77     0  this   Lext/mods/gameserver/handler/bypasshandlers/Augment;
            0      77     1 command   Ljava/lang/String;
            0      77     2 player   Lext/mods/gameserver/model/actor/Player;
            0      77     3 target   Lext/mods/gameserver/model/actor/Creature;
           16      61     4 cmdChoice   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ int ]
        frame_type = 16 /* same */
        frame_type = 13 /* same */

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #52                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/Augment;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #8                  // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #58                 // String Augment
         8: aastore
         9: putstatic     #52                 // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "Augment.java"
