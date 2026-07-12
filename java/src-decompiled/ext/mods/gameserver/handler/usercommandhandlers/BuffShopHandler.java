// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.BuffShopHandler
// File: ext\mods\gameserver\handler\usercommandhandlers\BuffShopHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler.class
  Last modified 9 de jul de 2026; size 1033 bytes
  MD5 checksum 913d410544d9cfb10499a864cf6e0495
  Compiled from "BuffShopHandler.java"
public class ext.mods.gameserver.handler.usercommandhandlers.BuffShopHandler implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/sellBuffEngine/BuffShopUIManager.getInstance:()Lext/mods/sellBuffEngine/BuffShopUIManager;
   #8 = Class              #10            // ext/mods/sellBuffEngine/BuffShopUIManager
   #9 = NameAndType        #11:#12        // getInstance:()Lext/mods/sellBuffEngine/BuffShopUIManager;
  #10 = Utf8               ext/mods/sellBuffEngine/BuffShopUIManager
  #11 = Utf8               getInstance
  #12 = Utf8               ()Lext/mods/sellBuffEngine/BuffShopUIManager;
  #13 = Methodref          #8.#14         // ext/mods/sellBuffEngine/BuffShopUIManager.showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #14 = NameAndType        #15:#16        // showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #15 = Utf8               showIndexWindow
  #16 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #17 = Fieldref           #18.#19        // ext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler.COMMAND_IDS:[I
  #18 = Class              #20            // ext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler
  #19 = NameAndType        #21:#22        // COMMAND_IDS:[I
  #20 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler
  #21 = Utf8               COMMAND_IDS
  #22 = Utf8               [I
  #23 = Class              #24            // ext/mods/gameserver/handler/IUserCommandHandler
  #24 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler;
  #30 = Utf8               useUserCommand
  #31 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #32 = Utf8               id
  #33 = Utf8               I
  #34 = Utf8               player
  #35 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #36 = Utf8               getUserCommandList
  #37 = Utf8               ()[I
  #38 = Utf8               <clinit>
  #39 = Utf8               SourceFile
  #40 = Utf8               BuffShopHandler.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.BuffShopHandler();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: invokestatic  #7                  // Method ext/mods/sellBuffEngine/BuffShopUIManager.getInstance:()Lext/mods/sellBuffEngine/BuffShopUIManager;
         3: aload_2
         4: aconst_null
         5: invokevirtual #13                 // Method ext/mods/sellBuffEngine/BuffShopUIManager.showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 34: 0
        line 35: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler;
            0       9     1    id   I
            0       9     2 player   Lext/mods/gameserver/model/actor/Player;

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #17                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/BuffShopHandler;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: sipush        203
         8: iastore
         9: putstatic     #17                 // Field COMMAND_IDS:[I
        12: return
      LineNumberTable:
        line 26: 0
}
SourceFile: "BuffShopHandler.java"
