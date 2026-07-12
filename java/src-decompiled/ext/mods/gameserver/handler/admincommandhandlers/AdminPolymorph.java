// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminPolymorph
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminPolymorph.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph.class
  Last modified 9 de jul de 2026; size 2252 bytes
  MD5 checksum aabdf1d4cfc797c46c106d1dfb534b54
  Compiled from "AdminPolymorph.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminPolymorph implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph.getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
    #8 = Class              #10           // ext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph
    #9 = NameAndType        #11:#12       // getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
   #10 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph
   #11 = Utf8               getTargetCreature
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Creature
   #15 = NameAndType        #17:#18       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #16 = Utf8               ext/mods/gameserver/model/actor/Creature
   #17 = Utf8               getActingPlayer
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Player
   #21 = NameAndType        #23:#24       // isMounted:()Z
   #22 = Utf8               ext/mods/gameserver/model/actor/Player
   #23 = Utf8               isMounted
   #24 = Utf8               ()Z
   #25 = Methodref          #20.#26       // ext/mods/gameserver/model/actor/Player.dismount:()V
   #26 = NameAndType        #27:#6        // dismount:()V
   #27 = Utf8               dismount
   #28 = Methodref          #14.#29       // ext/mods/gameserver/model/actor/Creature.getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #29 = NameAndType        #30:#31       // getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #30 = Utf8               getPolymorphTemplate
   #31 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #32 = Methodref          #14.#33       // ext/mods/gameserver/model/actor/Creature.unpolymorph:()V
   #33 = NameAndType        #34:#6        // unpolymorph:()V
   #34 = Utf8               unpolymorph
   #35 = Class              #36           // java/util/StringTokenizer
   #36 = Utf8               java/util/StringTokenizer
   #37 = Methodref          #35.#38       // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #38 = NameAndType        #5:#39        // "<init>":(Ljava/lang/String;)V
   #39 = Utf8               (Ljava/lang/String;)V
   #40 = Methodref          #35.#41       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #41 = NameAndType        #42:#43       // nextToken:()Ljava/lang/String;
   #42 = Utf8               nextToken
   #43 = Utf8               ()Ljava/lang/String;
   #44 = Methodref          #45.#46       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #45 = Class              #47           // java/lang/Integer
   #46 = NameAndType        #48:#49       // parseInt:(Ljava/lang/String;)I
   #47 = Utf8               java/lang/Integer
   #48 = Utf8               parseInt
   #49 = Utf8               (Ljava/lang/String;)I
   #50 = Methodref          #14.#51       // ext/mods/gameserver/model/actor/Creature.polymorph:(I)Z
   #51 = NameAndType        #52:#53       // polymorph:(I)Z
   #52 = Utf8               polymorph
   #53 = Utf8               (I)Z
   #54 = Fieldref           #55.#56       // ext/mods/gameserver/network/SystemMessageId.APPLICANT_INFORMATION_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
   #55 = Class              #57           // ext/mods/gameserver/network/SystemMessageId
   #56 = NameAndType        #58:#59       // APPLICANT_INFORMATION_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
   #57 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #58 = Utf8               APPLICANT_INFORMATION_INCORRECT
   #59 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #60 = Methodref          #20.#61       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #61 = NameAndType        #62:#63       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #62 = Utf8               sendPacket
   #63 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #64 = Class              #65           // java/lang/Exception
   #65 = Utf8               java/lang/Exception
   #66 = String             #67           // Usage: //polymorph npcId
   #67 = Utf8               Usage: //polymorph npcId
   #68 = Methodref          #20.#69       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #69 = NameAndType        #70:#39       // sendMessage:(Ljava/lang/String;)V
   #70 = Utf8               sendMessage
   #71 = Fieldref           #8.#72        // ext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph.ADMIN_COMMANDS:[Ljava/lang/String;
   #72 = NameAndType        #73:#74       // ADMIN_COMMANDS:[Ljava/lang/String;
   #73 = Utf8               ADMIN_COMMANDS
   #74 = Utf8               [Ljava/lang/String;
   #75 = Class              #76           // java/lang/String
   #76 = Utf8               java/lang/String
   #77 = String             #78           // admin_polymorph
   #78 = Utf8               admin_polymorph
   #79 = Class              #80           // ext/mods/gameserver/handler/IAdminCommandHandler
   #80 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #81 = Utf8               Code
   #82 = Utf8               LineNumberTable
   #83 = Utf8               LocalVariableTable
   #84 = Utf8               this
   #85 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph;
   #86 = Utf8               useAdminCommand
   #87 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #88 = Utf8               st
   #89 = Utf8               Ljava/util/StringTokenizer;
   #90 = Utf8               e
   #91 = Utf8               Ljava/lang/Exception;
   #92 = Utf8               command
   #93 = Utf8               Ljava/lang/String;
   #94 = Utf8               player
   #95 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #96 = Utf8               targetCreature
   #97 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #98 = Utf8               targetPlayer
   #99 = Utf8               StackMapTable
  #100 = Utf8               getAdminCommandList
  #101 = Utf8               ()[Ljava/lang/String;
  #102 = Utf8               <clinit>
  #103 = Utf8               SourceFile
  #104 = Utf8               AdminPolymorph.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminPolymorph();
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
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_0
         1: aload_2
         2: iconst_1
         3: invokevirtual #7                  // Method getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
         6: astore_3
         7: aload_3
         8: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        11: astore        4
        13: aload         4
        15: ifnull        31
        18: aload         4
        20: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        23: ifeq          31
        26: aload         4
        28: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.dismount:()V
        31: aload_3
        32: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Creature.getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        35: ifnull        45
        38: aload_3
        39: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Creature.unpolymorph:()V
        42: goto          94
        45: new           #35                 // class java/util/StringTokenizer
        48: dup
        49: aload_1
        50: invokespecial #37                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
        53: astore        5
        55: aload         5
        57: invokevirtual #40                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        60: pop
        61: aload_3
        62: aload         5
        64: invokevirtual #40                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        67: invokestatic  #44                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        70: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.polymorph:(I)Z
        73: ifne          83
        76: aload_2
        77: getstatic     #54                 // Field ext/mods/gameserver/network/SystemMessageId.APPLICANT_INFORMATION_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
        80: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        83: goto          94
        86: astore        5
        88: aload_2
        89: ldc           #66                 // String Usage: //polymorph npcId
        91: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        94: return
      Exception table:
         from    to  target type
            45    83    86   Class java/lang/Exception
      LineNumberTable:
        line 37: 0
        line 39: 7
        line 40: 13
        line 41: 26
        line 43: 31
        line 44: 38
        line 49: 45
        line 50: 55
        line 52: 61
        line 53: 76
        line 58: 83
        line 55: 86
        line 57: 88
        line 60: 94
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      28     5    st   Ljava/util/StringTokenizer;
           88       6     5     e   Ljava/lang/Exception;
            0      95     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph;
            0      95     1 command   Ljava/lang/String;
            0      95     2 player   Lext/mods/gameserver/model/actor/Player;
            7      88     3 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           13      82     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 37 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #71                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPolymorph;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #75                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #77                 // String admin_polymorph
         8: aastore
         9: putstatic     #71                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "AdminPolymorph.java"
