// Bytecode for: ext.mods.gameserver.model.actor.instance.FriendlyMonster
// File: ext\mods\gameserver\model\actor\instance\FriendlyMonster.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/FriendlyMonster.class
  Last modified 9 de jul de 2026; size 2142 bytes
  MD5 checksum 4637272855c4bbcb8621579b873069ec
  Compiled from "FriendlyMonster.java"
public class ext.mods.gameserver.model.actor.instance.FriendlyMonster extends ext.mods.gameserver.model.actor.Attackable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/FriendlyMonster
  super_class: #2                         // ext/mods/gameserver/model/actor/Attackable
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/Attackable."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/Attackable
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/instance/FriendlyMonster.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/instance/FriendlyMonster
   #9 = NameAndType        #11:#12        // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #10 = Utf8               ext/mods/gameserver/model/actor/instance/FriendlyMonster
  #11 = Utf8               getAI
  #12 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #13 = Methodref          #14.#15        // ext/mods/commons/random/Rnd.get:(I)I
  #14 = Class              #16            // ext/mods/commons/random/Rnd
  #15 = NameAndType        #17:#18        // get:(I)I
  #16 = Utf8               ext/mods/commons/random/Rnd
  #17 = Utf8               get
  #18 = Utf8               (I)I
  #19 = Methodref          #20.#21        // ext/mods/gameserver/model/actor/ai/type/AttackableAI.onRandomAnimation:(I)V
  #20 = Class              #22            // ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #21 = NameAndType        #23:#24        // onRandomAnimation:(I)V
  #22 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #23 = Utf8               onRandomAnimation
  #24 = Utf8               (I)V
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #26 = Class              #28            // ext/mods/gameserver/model/actor/Player
  #27 = NameAndType        #29:#30        // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #28 = Utf8               ext/mods/gameserver/model/actor/Player
  #29 = Utf8               getQuestList
  #30 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #31 = Methodref          #8.#32         // ext/mods/gameserver/model/actor/instance/FriendlyMonster.getObjectId:()I
  #32 = NameAndType        #33:#34        // getObjectId:()I
  #33 = Utf8               getObjectId
  #34 = Utf8               ()I
  #35 = Methodref          #36.#37        // ext/mods/gameserver/model/actor/container/player/QuestList.setLastQuestNpcObjectId:(I)V
  #36 = Class              #38            // ext/mods/gameserver/model/actor/container/player/QuestList
  #37 = NameAndType        #39:#24        // setLastQuestNpcObjectId:(I)V
  #38 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
  #39 = Utf8               setLastQuestNpcObjectId
  #40 = Methodref          #8.#41         // ext/mods/gameserver/model/actor/instance/FriendlyMonster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #41 = NameAndType        #42:#43        // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #42 = Utf8               getTemplate
  #43 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #44 = Fieldref           #45.#46        // ext/mods/gameserver/enums/EventHandler.FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
  #45 = Class              #47            // ext/mods/gameserver/enums/EventHandler
  #46 = NameAndType        #48:#49        // FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
  #47 = Utf8               ext/mods/gameserver/enums/EventHandler
  #48 = Utf8               FIRST_TALK
  #49 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #50 = Methodref          #51.#52        // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #51 = Class              #53            // ext/mods/gameserver/model/actor/template/NpcTemplate
  #52 = NameAndType        #54:#55        // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #53 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #54 = Utf8               getEventQuests
  #55 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #56 = InterfaceMethodref #57.#58        // java/util/List.size:()I
  #57 = Class              #59            // java/util/List
  #58 = NameAndType        #60:#34        // size:()I
  #59 = Utf8               java/util/List
  #60 = Utf8               size
  #61 = InterfaceMethodref #57.#62        // java/util/List.get:(I)Ljava/lang/Object;
  #62 = NameAndType        #17:#63        // get:(I)Ljava/lang/Object;
  #63 = Utf8               (I)Ljava/lang/Object;
  #64 = Class              #65            // ext/mods/gameserver/scripting/Quest
  #65 = Utf8               ext/mods/gameserver/scripting/Quest
  #66 = Methodref          #64.#67        // ext/mods/gameserver/scripting/Quest.notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #67 = NameAndType        #68:#69        // notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #68 = Utf8               notifyFirstTalk
  #69 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #70 = Methodref          #8.#71         // ext/mods/gameserver/model/actor/instance/FriendlyMonster.showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #71 = NameAndType        #72:#73        // showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #72 = Utf8               showChatWindow
  #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #74 = Utf8               Code
  #75 = Utf8               LineNumberTable
  #76 = Utf8               LocalVariableTable
  #77 = Utf8               this
  #78 = Utf8               Lext/mods/gameserver/model/actor/instance/FriendlyMonster;
  #79 = Utf8               objectId
  #80 = Utf8               I
  #81 = Utf8               template
  #82 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #83 = Utf8               onInteract
  #84 = Utf8               player
  #85 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #86 = Utf8               scripts
  #87 = Utf8               Ljava/util/List;
  #88 = Utf8               LocalVariableTypeTable
  #89 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #90 = Utf8               StackMapTable
  #91 = Utf8               isAggressive
  #92 = Utf8               ()Z
  #93 = Utf8               SourceFile
  #94 = Utf8               FriendlyMonster.java
{
  public ext.mods.gameserver.model.actor.instance.FriendlyMonster(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Attackable."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 38: 0
        line 39: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/FriendlyMonster;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #7                  // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
         4: bipush        8
         6: invokestatic  #13                 // Method ext/mods/commons/random/Rnd.get:(I)I
         9: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.onRandomAnimation:(I)V
        12: aload_1
        13: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        16: aload_0
        17: invokevirtual #31                 // Method getObjectId:()I
        20: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/container/player/QuestList.setLastQuestNpcObjectId:(I)V
        23: aload_0
        24: invokevirtual #40                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        27: getstatic     #44                 // Field ext/mods/gameserver/enums/EventHandler.FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
        30: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        33: astore_2
        34: aload_2
        35: invokeinterface #56,  1           // InterfaceMethod java/util/List.size:()I
        40: iconst_1
        41: if_icmpne     62
        44: aload_2
        45: iconst_0
        46: invokeinterface #61,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        51: checkcast     #64                 // class ext/mods/gameserver/scripting/Quest
        54: aload_0
        55: aload_1
        56: invokevirtual #66                 // Method ext/mods/gameserver/scripting/Quest.notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        59: goto          67
        62: aload_0
        63: aload_1
        64: invokevirtual #70                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
        67: return
      LineNumberTable:
        line 44: 0
        line 46: 12
        line 48: 23
        line 49: 34
        line 50: 44
        line 52: 62
        line 53: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/gameserver/model/actor/instance/FriendlyMonster;
            0      68     1 player   Lext/mods/gameserver/model/actor/Player;
           34      34     2 scripts   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           34      34     2 scripts   Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 62
          locals = [ class java/util/List ]
        frame_type = 4 /* same */

  public boolean isAggressive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/FriendlyMonster;
}
SourceFile: "FriendlyMonster.java"
