// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminDoor
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminDoor.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminDoor.class
  Last modified 9 de jul de 2026; size 2302 bytes
  MD5 checksum 9fc5cd86d088b7726955913de3dccb4f
  Compiled from "AdminDoor.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminDoor implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #36                         // ext/mods/gameserver/handler/admincommandhandlers/AdminDoor
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // admin_open
   #8 = Utf8               admin_open
   #9 = Methodref          #10.#11        // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // startsWith:(Ljava/lang/String;)Z
  #12 = Utf8               java/lang/String
  #13 = Utf8               startsWith
  #14 = Utf8               (Ljava/lang/String;)Z
  #15 = Methodref          #16.#17        // ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
  #16 = Class              #18            // ext/mods/gameserver/data/xml/DoorData
  #17 = NameAndType        #19:#20        // getInstance:()Lext/mods/gameserver/data/xml/DoorData;
  #18 = Utf8               ext/mods/gameserver/data/xml/DoorData
  #19 = Utf8               getInstance
  #20 = Utf8               ()Lext/mods/gameserver/data/xml/DoorData;
  #21 = Methodref          #10.#22        // java/lang/String.substring:(I)Ljava/lang/String;
  #22 = NameAndType        #23:#24        // substring:(I)Ljava/lang/String;
  #23 = Utf8               substring
  #24 = Utf8               (I)Ljava/lang/String;
  #25 = Methodref          #26.#27        // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #26 = Class              #28            // java/lang/Integer
  #27 = NameAndType        #29:#30        // parseInt:(Ljava/lang/String;)I
  #28 = Utf8               java/lang/Integer
  #29 = Utf8               parseInt
  #30 = Utf8               (Ljava/lang/String;)I
  #31 = Methodref          #16.#32        // ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
  #32 = NameAndType        #33:#34        // getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
  #33 = Utf8               getDoor
  #34 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
  #35 = Methodref          #36.#37        // ext/mods/gameserver/handler/admincommandhandlers/AdminDoor.testDoor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Z)V
  #36 = Class              #38            // ext/mods/gameserver/handler/admincommandhandlers/AdminDoor
  #37 = NameAndType        #39:#40        // testDoor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Z)V
  #38 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminDoor
  #39 = Utf8               testDoor
  #40 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Z)V
  #41 = Class              #42            // java/lang/Exception
  #42 = Utf8               java/lang/Exception
  #43 = Methodref          #44.#45        // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #44 = Class              #46            // ext/mods/gameserver/model/actor/Player
  #45 = NameAndType        #47:#48        // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #46 = Utf8               ext/mods/gameserver/model/actor/Player
  #47 = Utf8               getTarget
  #48 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #49 = String             #50            // admin_close
  #50 = Utf8               admin_close
  #51 = Fieldref           #36.#52        // ext/mods/gameserver/handler/admincommandhandlers/AdminDoor.ADMIN_COMMANDS:[Ljava/lang/String;
  #52 = NameAndType        #53:#54        // ADMIN_COMMANDS:[Ljava/lang/String;
  #53 = Utf8               ADMIN_COMMANDS
  #54 = Utf8               [Ljava/lang/String;
  #55 = Class              #56            // ext/mods/gameserver/model/actor/instance/Door
  #56 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #57 = Methodref          #55.#58        // ext/mods/gameserver/model/actor/instance/Door.changeState:(ZZ)V
  #58 = NameAndType        #59:#60        // changeState:(ZZ)V
  #59 = Utf8               changeState
  #60 = Utf8               (ZZ)V
  #61 = Fieldref           #62.#63        // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #62 = Class              #64            // ext/mods/gameserver/network/SystemMessageId
  #63 = NameAndType        #65:#66        // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #64 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #65 = Utf8               INVALID_TARGET
  #66 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #67 = Methodref          #44.#68        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #68 = NameAndType        #69:#70        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #69 = Utf8               sendPacket
  #70 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #71 = Class              #72            // ext/mods/gameserver/handler/IAdminCommandHandler
  #72 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #73 = Utf8               Code
  #74 = Utf8               LineNumberTable
  #75 = Utf8               LocalVariableTable
  #76 = Utf8               this
  #77 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminDoor;
  #78 = Utf8               useAdminCommand
  #79 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #80 = Utf8               e
  #81 = Utf8               Ljava/lang/Exception;
  #82 = Utf8               command
  #83 = Utf8               Ljava/lang/String;
  #84 = Utf8               player
  #85 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #86 = Utf8               StackMapTable
  #87 = Utf8               getAdminCommandList
  #88 = Utf8               ()[Ljava/lang/String;
  #89 = Utf8               door
  #90 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #91 = Utf8               worldObject
  #92 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #93 = Utf8               isOpenCondition
  #94 = Utf8               Z
  #95 = Utf8               <clinit>
  #96 = Utf8               SourceFile
  #97 = Utf8               AdminDoor.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminDoor();
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
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminDoor;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_open
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          45
         9: aload_2
        10: invokestatic  #15                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
        13: aload_1
        14: bipush        11
        16: invokevirtual #21                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        19: invokestatic  #25                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        22: invokevirtual #31                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
        25: iconst_1
        26: invokestatic  #35                 // Method testDoor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Z)V
        29: goto          87
        32: astore_3
        33: aload_2
        34: aload_2
        35: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        38: iconst_1
        39: invokestatic  #35                 // Method testDoor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Z)V
        42: goto          87
        45: aload_1
        46: ldc           #49                 // String admin_close
        48: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        51: ifeq          87
        54: aload_2
        55: invokestatic  #15                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
        58: aload_1
        59: bipush        12
        61: invokevirtual #21                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        64: invokestatic  #25                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        67: invokevirtual #31                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
        70: iconst_0
        71: invokestatic  #35                 // Method testDoor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Z)V
        74: goto          87
        77: astore_3
        78: aload_2
        79: aload_2
        80: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        83: iconst_0
        84: invokestatic  #35                 // Method testDoor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Z)V
        87: return
      Exception table:
         from    to  target type
             9    29    32   Class java/lang/Exception
            54    74    77   Class java/lang/Exception
      LineNumberTable:
        line 38: 0
        line 42: 9
        line 47: 29
        line 44: 32
        line 46: 33
        line 47: 42
        line 49: 45
        line 53: 54
        line 58: 74
        line 55: 77
        line 57: 78
        line 60: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33       9     3     e   Ljava/lang/Exception;
           78       9     3     e   Ljava/lang/Exception;
            0      88     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminDoor;
            0      88     1 command   Ljava/lang/String;
            0      88     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 96 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 95 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #51                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminDoor;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_open
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #49                 // String admin_close
        13: aastore
        14: putstatic     #51                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "AdminDoor.java"
