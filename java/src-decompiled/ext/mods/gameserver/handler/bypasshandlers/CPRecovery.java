// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.CPRecovery
// File: ext\mods\gameserver\handler\bypasshandlers\CPRecovery.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/CPRecovery.class
  Last modified 9 de jul de 2026; size 2403 bytes
  MD5 checksum 709527dade8188595bf11687b881eaec
  Compiled from "CPRecovery.java"
public class ext.mods.gameserver.handler.bypasshandlers.CPRecovery implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #62                         // ext/mods/gameserver/handler/bypasshandlers/CPRecovery
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Npc
   #8 = Utf8               ext/mods/gameserver/model/actor/Npc
   #9 = Methodref          #7.#10         // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
  #10 = NameAndType        #11:#12        // getNpcId:()I
  #11 = Utf8               getNpcId
  #12 = Utf8               ()I
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Player
  #15 = NameAndType        #17:#18        // reduceAdena:(IZ)Z
  #16 = Utf8               ext/mods/gameserver/model/actor/Player
  #17 = Utf8               reduceAdena
  #18 = Utf8               (IZ)Z
  #19 = Methodref          #7.#20         // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #20 = NameAndType        #21:#22        // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #21 = Utf8               getAI
  #22 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ARENA_CP_RECOVERY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #24 = Class              #26            // ext/mods/gameserver/data/SkillTable$FrequentSkill
  #25 = NameAndType        #27:#28        // ARENA_CP_RECOVERY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #26 = Utf8               ext/mods/gameserver/data/SkillTable$FrequentSkill
  #27 = Utf8               ARENA_CP_RECOVERY
  #28 = Utf8               Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #29 = Methodref          #24.#30        // ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #30 = NameAndType        #31:#32        // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #31 = Utf8               getSkill
  #32 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #33 = Double             1000000.0d
  #35 = Methodref          #36.#37        // ext/mods/gameserver/model/actor/ai/type/NpcAI.addCastDesireHold:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #36 = Class              #38            // ext/mods/gameserver/model/actor/ai/type/NpcAI
  #37 = NameAndType        #39:#40        // addCastDesireHold:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #38 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #39 = Utf8               addCastDesireHold
  #40 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #41 = Fieldref           #42.#43        // ext/mods/gameserver/network/SystemMessageId.S1_CP_WILL_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
  #42 = Class              #44            // ext/mods/gameserver/network/SystemMessageId
  #43 = NameAndType        #45:#46        // S1_CP_WILL_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
  #44 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #45 = Utf8               S1_CP_WILL_BE_RESTORED
  #46 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #47 = Methodref          #48.#49        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #48 = Class              #50            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #49 = NameAndType        #51:#52        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #50 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #51 = Utf8               getSystemMessage
  #52 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #53 = Methodref          #48.#54        // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #54 = NameAndType        #55:#56        // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #55 = Utf8               addCharName
  #56 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #57 = Methodref          #14.#58        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #58 = NameAndType        #59:#60        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #59 = Utf8               sendPacket
  #60 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #61 = Fieldref           #62.#63        // ext/mods/gameserver/handler/bypasshandlers/CPRecovery.COMMANDS:[Ljava/lang/String;
  #62 = Class              #64            // ext/mods/gameserver/handler/bypasshandlers/CPRecovery
  #63 = NameAndType        #65:#66        // COMMANDS:[Ljava/lang/String;
  #64 = Utf8               ext/mods/gameserver/handler/bypasshandlers/CPRecovery
  #65 = Utf8               COMMANDS
  #66 = Utf8               [Ljava/lang/String;
  #67 = Class              #68            // java/lang/String
  #68 = Utf8               java/lang/String
  #69 = String             #70            // CPRecovery
  #70 = Utf8               CPRecovery
  #71 = Class              #72            // ext/mods/gameserver/handler/IBypassHandler
  #72 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #73 = Utf8               Code
  #74 = Utf8               LineNumberTable
  #75 = Utf8               LocalVariableTable
  #76 = Utf8               this
  #77 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/CPRecovery;
  #78 = Utf8               useBypass
  #79 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #80 = Utf8               npc
  #81 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #82 = Utf8               command
  #83 = Utf8               Ljava/lang/String;
  #84 = Utf8               player
  #85 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #86 = Utf8               target
  #87 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #88 = Utf8               StackMapTable
  #89 = Utf8               getBypassList
  #90 = Utf8               ()[Ljava/lang/String;
  #91 = Utf8               <clinit>
  #92 = Utf8               SourceFile
  #93 = Utf8               CPRecovery.java
  #94 = Utf8               InnerClasses
  #95 = Class              #96            // ext/mods/gameserver/data/SkillTable
  #96 = Utf8               ext/mods/gameserver/data/SkillTable
  #97 = Utf8               FrequentSkill
{
  public ext.mods.gameserver.handler.bypasshandlers.CPRecovery();
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
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/CPRecovery;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: aload_3
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Npc
         4: ifeq          79
         7: aload_3
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Npc
        11: astore        4
        13: aload         4
        15: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        18: sipush        31225
        21: if_icmpeq     37
        24: aload         4
        26: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        29: sipush        31226
        32: if_icmpeq     37
        35: iconst_0
        36: ireturn
        37: aload_2
        38: bipush        100
        40: iconst_1
        41: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
        44: ifeq          79
        47: aload         4
        49: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        52: aload_2
        53: getstatic     #23                 // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.ARENA_CP_RECOVERY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        56: invokevirtual #29                 // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        59: ldc2_w        #33                 // double 1000000.0d
        62: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.addCastDesireHold:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
        65: aload_2
        66: getstatic     #41                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CP_WILL_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
        69: invokestatic  #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        72: aload_2
        73: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        76: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        79: iconst_1
        80: ireturn
      LineNumberTable:
        line 35: 0
        line 37: 13
        line 38: 35
        line 40: 37
        line 42: 47
        line 43: 65
        line 46: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      66     4   npc   Lext/mods/gameserver/model/actor/Npc;
            0      81     0  this   Lext/mods/gameserver/handler/bypasshandlers/CPRecovery;
            0      81     1 command   Ljava/lang/String;
            0      81     2 player   Lext/mods/gameserver/model/actor/Player;
            0      81     3 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 250 /* chop */
          offset_delta = 41

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #61                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/CPRecovery;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #67                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #69                 // String CPRecovery
         8: aastore
         9: putstatic     #61                 // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "CPRecovery.java"
InnerClasses:
  public static final #97= #24 of #95;    // FrequentSkill=class ext/mods/gameserver/data/SkillTable$FrequentSkill of class ext/mods/gameserver/data/SkillTable
