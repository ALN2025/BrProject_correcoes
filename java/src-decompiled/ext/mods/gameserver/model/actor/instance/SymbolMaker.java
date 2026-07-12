// Bytecode for: ext.mods.gameserver.model.actor.instance.SymbolMaker
// File: ext\mods\gameserver\model\actor\instance\SymbolMaker.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/SymbolMaker.class
  Last modified 9 de jul de 2026; size 1918 bytes
  MD5 checksum 7b28caa8b9d38e640ea2dccc396a8e4c
  Compiled from "SymbolMaker.java"
public class ext.mods.gameserver.model.actor.instance.SymbolMaker extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #56                         // ext/mods/gameserver/model/actor/instance/SymbolMaker
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Folk
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = String             #8             // Draw
   #8 = Utf8               Draw
   #9 = Methodref          #10.#11        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // equals:(Ljava/lang/Object;)Z
  #12 = Utf8               java/lang/String
  #13 = Utf8               equals
  #14 = Utf8               (Ljava/lang/Object;)Z
  #15 = Class              #16            // ext/mods/gameserver/network/serverpackets/HennaEquipList
  #16 = Utf8               ext/mods/gameserver/network/serverpackets/HennaEquipList
  #17 = Methodref          #15.#18        // ext/mods/gameserver/network/serverpackets/HennaEquipList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #18 = NameAndType        #5:#19         // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #19 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #20 = Methodref          #21.#22        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #21 = Class              #23            // ext/mods/gameserver/model/actor/Player
  #22 = NameAndType        #24:#25        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #23 = Utf8               ext/mods/gameserver/model/actor/Player
  #24 = Utf8               sendPacket
  #25 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #26 = String             #27            // RemoveList
  #27 = Utf8               RemoveList
  #28 = Methodref          #21.#29        // ext/mods/gameserver/model/actor/Player.getHennaList:()Lext/mods/gameserver/model/actor/container/player/HennaList;
  #29 = NameAndType        #30:#31        // getHennaList:()Lext/mods/gameserver/model/actor/container/player/HennaList;
  #30 = Utf8               getHennaList
  #31 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/HennaList;
  #32 = Methodref          #33.#34        // ext/mods/gameserver/model/actor/container/player/HennaList.isEmpty:()Z
  #33 = Class              #35            // ext/mods/gameserver/model/actor/container/player/HennaList
  #34 = NameAndType        #36:#37        // isEmpty:()Z
  #35 = Utf8               ext/mods/gameserver/model/actor/container/player/HennaList
  #36 = Utf8               isEmpty
  #37 = Utf8               ()Z
  #38 = Fieldref           #39.#40        // ext/mods/gameserver/network/SystemMessageId.SYMBOL_NOT_FOUND:Lext/mods/gameserver/network/SystemMessageId;
  #39 = Class              #41            // ext/mods/gameserver/network/SystemMessageId
  #40 = NameAndType        #42:#43        // SYMBOL_NOT_FOUND:Lext/mods/gameserver/network/SystemMessageId;
  #41 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #42 = Utf8               SYMBOL_NOT_FOUND
  #43 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #44 = Methodref          #21.#45        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #45 = NameAndType        #24:#46        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #46 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #47 = Class              #48            // ext/mods/gameserver/network/serverpackets/HennaUnequipList
  #48 = Utf8               ext/mods/gameserver/network/serverpackets/HennaUnequipList
  #49 = Methodref          #47.#18        // ext/mods/gameserver/network/serverpackets/HennaUnequipList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #50 = Methodref          #2.#51         // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #51 = NameAndType        #52:#53        // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #52 = Utf8               onBypassFeedback
  #53 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #54 = String             #55            // html/symbolmaker/SymbolMaker.htm
  #55 = Utf8               html/symbolmaker/SymbolMaker.htm
  #56 = Class              #57            // ext/mods/gameserver/model/actor/instance/SymbolMaker
  #57 = Utf8               ext/mods/gameserver/model/actor/instance/SymbolMaker
  #58 = Utf8               Code
  #59 = Utf8               LineNumberTable
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               this
  #62 = Utf8               Lext/mods/gameserver/model/actor/instance/SymbolMaker;
  #63 = Utf8               objectID
  #64 = Utf8               I
  #65 = Utf8               template
  #66 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #67 = Utf8               player
  #68 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #69 = Utf8               command
  #70 = Utf8               Ljava/lang/String;
  #71 = Utf8               StackMapTable
  #72 = Utf8               getHtmlPath
  #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #74 = Utf8               npcId
  #75 = Utf8               val
  #76 = Utf8               SourceFile
  #77 = Utf8               SymbolMaker.java
{
  public ext.mods.gameserver.model.actor.instance.SymbolMaker(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 30: 0
        line 31: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/SymbolMaker;
            0       7     1 objectID   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_2
         1: ldc           #7                  // String Draw
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          24
         9: aload_1
        10: new           #15                 // class ext/mods/gameserver/network/serverpackets/HennaEquipList
        13: dup
        14: aload_1
        15: invokespecial #17                 // Method ext/mods/gameserver/network/serverpackets/HennaEquipList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        18: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        21: goto          72
        24: aload_2
        25: ldc           #26                 // String RemoveList
        27: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        30: ifeq          66
        33: aload_1
        34: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.getHennaList:()Lext/mods/gameserver/model/actor/container/player/HennaList;
        37: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/container/player/HennaList.isEmpty:()Z
        40: ifeq          51
        43: aload_1
        44: getstatic     #38                 // Field ext/mods/gameserver/network/SystemMessageId.SYMBOL_NOT_FOUND:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: return
        51: aload_1
        52: new           #47                 // class ext/mods/gameserver/network/serverpackets/HennaUnequipList
        55: dup
        56: aload_1
        57: invokespecial #49                 // Method ext/mods/gameserver/network/serverpackets/HennaUnequipList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        60: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        63: goto          72
        66: aload_0
        67: aload_1
        68: aload_2
        69: invokespecial #50                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        72: return
      LineNumberTable:
        line 36: 0
        line 37: 9
        line 38: 24
        line 40: 33
        line 42: 43
        line 43: 50
        line 46: 51
        line 49: 66
        line 50: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/model/actor/instance/SymbolMaker;
            0      73     1 player   Lext/mods/gameserver/model/actor/Player;
            0      73     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 24 /* same */
        frame_type = 26 /* same */
        frame_type = 14 /* same */
        frame_type = 5 /* same */

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: ldc           #54                 // String html/symbolmaker/SymbolMaker.htm
         2: areturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/actor/instance/SymbolMaker;
            0       3     1 player   Lext/mods/gameserver/model/actor/Player;
            0       3     2 npcId   I
            0       3     3   val   I
}
SourceFile: "SymbolMaker.java"
