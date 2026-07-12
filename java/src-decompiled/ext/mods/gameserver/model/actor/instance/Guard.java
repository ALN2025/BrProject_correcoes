// Bytecode for: ext.mods.gameserver.model.actor.instance.Guard
// File: ext\mods\gameserver\model\actor\instance\Guard.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Guard.class
  Last modified 9 de jul de 2026; size 3319 bytes
  MD5 checksum b72600aae9279d031e82b0275221c155
  Compiled from "Guard.java"
public final class ext.mods.gameserver.model.actor.instance.Guard extends ext.mods.gameserver.model.actor.Attackable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/Guard
  super_class: #2                         // ext/mods/gameserver/model/actor/Attackable
  interfaces: 0, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Attackable."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Attackable
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Attackable
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/instance/Guard.setNoRndWalk:(Z)V
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/Guard
    #9 = NameAndType        #11:#12       // setNoRndWalk:(Z)V
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Guard
   #11 = Utf8               setNoRndWalk
   #12 = Utf8               (Z)V
   #13 = Methodref          #2.#14        // ext/mods/gameserver/model/actor/Attackable.onSpawn:()V
   #14 = NameAndType        #15:#16       // onSpawn:()V
   #15 = Utf8               onSpawn
   #16 = Utf8               ()V
   #17 = String             #18           //
   #18 = Utf8
   #19 = InvokeDynamic      #0:#20        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #20 = NameAndType        #21:#22       // makeConcatWithConstants:(I)Ljava/lang/String;
   #21 = Utf8               makeConcatWithConstants
   #22 = Utf8               (I)Ljava/lang/String;
   #23 = InvokeDynamic      #1:#24        // #1:makeConcatWithConstants:(II)Ljava/lang/String;
   #24 = NameAndType        #21:#25       // makeConcatWithConstants:(II)Ljava/lang/String;
   #25 = Utf8               (II)Ljava/lang/String;
   #26 = InvokeDynamic      #2:#27        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #27 = NameAndType        #21:#28       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #28 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #29 = Methodref          #8.#30        // ext/mods/gameserver/model/actor/instance/Guard.getNpcId:()I
   #30 = NameAndType        #31:#32       // getNpcId:()I
   #31 = Utf8               getNpcId
   #32 = Utf8               ()I
   #33 = Methodref          #8.#34        // ext/mods/gameserver/model/actor/instance/Guard.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #34 = NameAndType        #35:#36       // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #35 = Utf8               getAI
   #36 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #37 = Methodref          #38.#39       // ext/mods/commons/random/Rnd.get:(I)I
   #38 = Class              #40           // ext/mods/commons/random/Rnd
   #39 = NameAndType        #41:#42       // get:(I)I
   #40 = Utf8               ext/mods/commons/random/Rnd
   #41 = Utf8               get
   #42 = Utf8               (I)I
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.onRandomAnimation:(I)V
   #44 = Class              #46           // ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #45 = NameAndType        #47:#48       // onRandomAnimation:(I)V
   #46 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #47 = Utf8               onRandomAnimation
   #48 = Utf8               (I)V
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #50 = Class              #52           // ext/mods/gameserver/model/actor/Player
   #51 = NameAndType        #53:#54       // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #52 = Utf8               ext/mods/gameserver/model/actor/Player
   #53 = Utf8               getQuestList
   #54 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #55 = Methodref          #8.#56        // ext/mods/gameserver/model/actor/instance/Guard.getObjectId:()I
   #56 = NameAndType        #57:#32       // getObjectId:()I
   #57 = Utf8               getObjectId
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/actor/container/player/QuestList.setLastQuestNpcObjectId:(I)V
   #59 = Class              #61           // ext/mods/gameserver/model/actor/container/player/QuestList
   #60 = NameAndType        #62:#48       // setLastQuestNpcObjectId:(I)V
   #61 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
   #62 = Utf8               setLastQuestNpcObjectId
   #63 = Methodref          #8.#64        // ext/mods/gameserver/model/actor/instance/Guard.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #64 = NameAndType        #65:#66       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #65 = Utf8               getTemplate
   #66 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #67 = Fieldref           #68.#69       // ext/mods/gameserver/enums/EventHandler.FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
   #68 = Class              #70           // ext/mods/gameserver/enums/EventHandler
   #69 = NameAndType        #71:#72       // FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
   #70 = Utf8               ext/mods/gameserver/enums/EventHandler
   #71 = Utf8               FIRST_TALK
   #72 = Utf8               Lext/mods/gameserver/enums/EventHandler;
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #74 = Class              #76           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #75 = NameAndType        #77:#78       // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #76 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #77 = Utf8               getEventQuests
   #78 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #79 = InterfaceMethodref #80.#81       // java/util/List.size:()I
   #80 = Class              #82           // java/util/List
   #81 = NameAndType        #83:#32       // size:()I
   #82 = Utf8               java/util/List
   #83 = Utf8               size
   #84 = InterfaceMethodref #80.#85       // java/util/List.get:(I)Ljava/lang/Object;
   #85 = NameAndType        #41:#86       // get:(I)Ljava/lang/Object;
   #86 = Utf8               (I)Ljava/lang/Object;
   #87 = Class              #88           // ext/mods/gameserver/scripting/Quest
   #88 = Utf8               ext/mods/gameserver/scripting/Quest
   #89 = Methodref          #87.#90       // ext/mods/gameserver/scripting/Quest.notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #90 = NameAndType        #91:#92       // notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #91 = Utf8               notifyFirstTalk
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #93 = Methodref          #8.#94        // ext/mods/gameserver/model/actor/instance/Guard.showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #94 = NameAndType        #95:#96       // showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #95 = Utf8               showChatWindow
   #96 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               this
  #101 = Utf8               Lext/mods/gameserver/model/actor/instance/Guard;
  #102 = Utf8               objectId
  #103 = Utf8               I
  #104 = Utf8               template
  #105 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #106 = Utf8               getHtmlPath
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #108 = Utf8               player
  #109 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #110 = Utf8               npcId
  #111 = Utf8               val
  #112 = Utf8               filename
  #113 = Utf8               Ljava/lang/String;
  #114 = Utf8               StackMapTable
  #115 = Class              #116          // java/lang/String
  #116 = Utf8               java/lang/String
  #117 = Utf8               onInteract
  #118 = Utf8               scripts
  #119 = Utf8               Ljava/util/List;
  #120 = Utf8               LocalVariableTypeTable
  #121 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #122 = Utf8               isGuard
  #123 = Utf8               ()Z
  #124 = Utf8               getDriftRange
  #125 = Utf8               SourceFile
  #126 = Utf8               Guard.java
  #127 = Utf8               BootstrapMethods
  #128 = String             #129          // \u0001
  #129 = Utf8               \u0001
  #130 = String             #131          // \u0001-\u0001
  #131 = Utf8               \u0001-\u0001
  #132 = String             #133          // html/guard/\u0001.htm
  #133 = Utf8               html/guard/\u0001.htm
  #134 = MethodHandle       6:#135        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #135 = Methodref          #136.#137     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #136 = Class              #138          // java/lang/invoke/StringConcatFactory
  #137 = NameAndType        #21:#139      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #138 = Utf8               java/lang/invoke/StringConcatFactory
  #139 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #140 = Utf8               InnerClasses
  #141 = Class              #142          // java/lang/invoke/MethodHandles$Lookup
  #142 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #143 = Class              #144          // java/lang/invoke/MethodHandles
  #144 = Utf8               java/lang/invoke/MethodHandles
  #145 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Guard(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 39: 0
        line 40: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Guard;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: invokevirtual #7                  // Method setNoRndWalk:(Z)V
         5: aload_0
         6: invokespecial #13                 // Method ext/mods/gameserver/model/actor/Attackable.onSpawn:()V
         9: return
      LineNumberTable:
        line 45: 0
        line 46: 5
        line 47: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/Guard;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #17                 // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #19,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #23,  0             // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #26,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 52: 0
        line 53: 4
        line 54: 8
        line 56: 19
        line 58: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/Guard;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #29                 // Method getNpcId:()I
         4: lookupswitch  { // 10

                   30733: 96

                   31032: 96

                   31033: 96

                   31034: 96

                   31035: 96

                   31036: 96

                   31671: 96

                   31672: 96

                   31673: 96

                   31674: 96
                 default: 97
            }
        96: return
        97: aload_0
        98: invokevirtual #33                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       101: bipush        8
       103: invokestatic  #37                 // Method ext/mods/commons/random/Rnd.get:(I)I
       106: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.onRandomAnimation:(I)V
       109: aload_1
       110: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
       113: aload_0
       114: invokevirtual #55                 // Method getObjectId:()I
       117: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/container/player/QuestList.setLastQuestNpcObjectId:(I)V
       120: aload_0
       121: invokevirtual #63                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       124: getstatic     #67                 // Field ext/mods/gameserver/enums/EventHandler.FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
       127: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       130: astore_2
       131: aload_2
       132: invokeinterface #79,  1           // InterfaceMethod java/util/List.size:()I
       137: iconst_1
       138: if_icmpne     159
       141: aload_2
       142: iconst_0
       143: invokeinterface #84,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       148: checkcast     #87                 // class ext/mods/gameserver/scripting/Quest
       151: aload_0
       152: aload_1
       153: invokevirtual #89                 // Method ext/mods/gameserver/scripting/Quest.notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
       156: goto          164
       159: aload_0
       160: aload_1
       161: invokevirtual #93                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
       164: return
      LineNumberTable:
        line 64: 0
        line 67: 96
        line 70: 97
        line 72: 109
        line 74: 120
        line 75: 131
        line 76: 141
        line 78: 159
        line 79: 164
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     165     0  this   Lext/mods/gameserver/model/actor/instance/Guard;
            0     165     1 player   Lext/mods/gameserver/model/actor/Player;
          131      34     2 scripts   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          131      34     2 scripts   Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
      StackMapTable: number_of_entries = 4
        frame_type = 251 /* same_frame_extended */
          offset_delta = 96
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 61
          locals = [ class java/util/List ]
        frame_type = 4 /* same */

  public boolean isGuard();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Guard;

  public int getDriftRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: bipush        20
         2: ireturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/actor/instance/Guard;
}
SourceFile: "Guard.java"
BootstrapMethods:
  0: #134 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #128 \u0001
  1: #134 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #130 \u0001-\u0001
  2: #134 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #132 html/guard/\u0001.htm
InnerClasses:
  public static final #145= #141 of #143; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
