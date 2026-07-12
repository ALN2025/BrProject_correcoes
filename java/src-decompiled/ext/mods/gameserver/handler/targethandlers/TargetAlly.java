// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetAlly
// File: ext\mods\gameserver\handler\targethandlers\TargetAlly.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetAlly.class
  Last modified 9 de jul de 2026; size 3852 bytes
  MD5 checksum 033efcfd05baa420844f54cd090f91f0
  Compiled from "TargetAlly.java"
public class ext.mods.gameserver.handler.targethandlers.TargetAlly implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #100                        // ext/mods/gameserver/handler/targethandlers/TargetAlly
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               ALLY
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Creature
   #15 = NameAndType        #17:#18       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #16 = Utf8               ext/mods/gameserver/model/actor/Creature
   #17 = Utf8               getActingPlayer
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Player
   #21 = NameAndType        #23:#24       // isInOlympiadMode:()Z
   #22 = Utf8               ext/mods/gameserver/model/actor/Player
   #23 = Utf8               isInOlympiadMode
   #24 = Utf8               ()Z
   #25 = Class              #26           // java/util/ArrayList
   #26 = Utf8               java/util/ArrayList
   #27 = Methodref          #25.#3        // java/util/ArrayList."<init>":()V
   #28 = InterfaceMethodref #29.#30       // java/util/List.add:(Ljava/lang/Object;)Z
   #29 = Class              #31           // java/util/List
   #30 = NameAndType        #32:#33       // add:(Ljava/lang/Object;)Z
   #31 = Utf8               java/util/List
   #32 = Utf8               add
   #33 = Utf8               (Ljava/lang/Object;)Z
   #34 = Class              #35           // ext/mods/gameserver/model/actor/Playable
   #35 = Utf8               ext/mods/gameserver/model/actor/Playable
   #36 = Methodref          #37.#38       // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #37 = Class              #39           // ext/mods/gameserver/skills/L2Skill
   #38 = NameAndType        #40:#41       // getSkillRadius:()I
   #39 = Utf8               ext/mods/gameserver/skills/L2Skill
   #40 = Utf8               getSkillRadius
   #41 = Utf8               ()I
   #42 = InvokeDynamic      #0:#43        // #0:test:()Ljava/util/function/Predicate;
   #43 = NameAndType        #44:#45       // test:()Ljava/util/function/Predicate;
   #44 = Utf8               test
   #45 = Utf8               ()Ljava/util/function/Predicate;
   #46 = Methodref          #20.#47       // ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #47 = NameAndType        #48:#49       // getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #48 = Utf8               getKnownTypeInRadius
   #49 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #50 = InterfaceMethodref #29.#51       // java/util/List.iterator:()Ljava/util/Iterator;
   #51 = NameAndType        #52:#53       // iterator:()Ljava/util/Iterator;
   #52 = Utf8               iterator
   #53 = Utf8               ()Ljava/util/Iterator;
   #54 = InterfaceMethodref #55.#56       // java/util/Iterator.hasNext:()Z
   #55 = Class              #57           // java/util/Iterator
   #56 = NameAndType        #58:#24       // hasNext:()Z
   #57 = Utf8               java/util/Iterator
   #58 = Utf8               hasNext
   #59 = InterfaceMethodref #55.#60       // java/util/Iterator.next:()Ljava/lang/Object;
   #60 = NameAndType        #61:#62       // next:()Ljava/lang/Object;
   #61 = Utf8               next
   #62 = Utf8               ()Ljava/lang/Object;
   #63 = Methodref          #20.#64       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #64 = NameAndType        #65:#66       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #65 = Utf8               getSummon
   #66 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #67 = Methodref          #34.#68       // ext/mods/gameserver/model/actor/Playable.isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
   #68 = NameAndType        #69:#70       // isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
   #69 = Utf8               isInSameClan
   #70 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #71 = Methodref          #34.#72       // ext/mods/gameserver/model/actor/Playable.isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
   #72 = NameAndType        #73:#70       // isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
   #73 = Utf8               isInSameAlly
   #74 = Methodref          #20.#75       // ext/mods/gameserver/model/actor/Player.isInTournament:()Z
   #75 = NameAndType        #76:#24       // isInTournament:()Z
   #76 = Utf8               isInTournament
   #77 = Methodref          #20.#78       // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
   #78 = NameAndType        #79:#24       // isInDuel:()Z
   #79 = Utf8               isInDuel
   #80 = Methodref          #34.#15       // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #81 = Methodref          #20.#82       // ext/mods/gameserver/model/actor/Player.getDuelId:()I
   #82 = NameAndType        #83:#41       // getDuelId:()I
   #83 = Utf8               getDuelId
   #84 = Methodref          #20.#85       // ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
   #85 = NameAndType        #86:#87       // getTeam:()Lext/mods/gameserver/enums/TeamType;
   #86 = Utf8               getTeam
   #87 = Utf8               ()Lext/mods/gameserver/enums/TeamType;
   #88 = InterfaceMethodref #29.#89       // java/util/List.size:()I
   #89 = NameAndType        #90:#41       // size:()I
   #90 = Utf8               size
   #91 = InterfaceMethodref #29.#92       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #92 = NameAndType        #93:#94       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #93 = Utf8               toArray
   #94 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #95 = Class              #96           // "[Lext/mods/gameserver/model/actor/Creature;"
   #96 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #97 = Methodref          #34.#98       // ext/mods/gameserver/model/actor/Playable.isDead:()Z
   #98 = NameAndType        #99:#24       // isDead:()Z
   #99 = Utf8               isDead
  #100 = Class              #101          // ext/mods/gameserver/handler/targethandlers/TargetAlly
  #101 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetAlly
  #102 = Class              #103          // ext/mods/gameserver/handler/ITargetHandler
  #103 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #104 = Utf8               Code
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               this
  #108 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetAlly;
  #109 = Utf8               getTargetType
  #110 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #111 = Utf8               getTargetList
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #113 = Utf8               playable
  #114 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #115 = Utf8               caster
  #116 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #117 = Utf8               target
  #118 = Utf8               skill
  #119 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #120 = Utf8               player
  #121 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #122 = Utf8               list
  #123 = Utf8               Ljava/util/List;
  #124 = Utf8               LocalVariableTypeTable
  #125 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #126 = Utf8               StackMapTable
  #127 = Utf8               getFinalTarget
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #129 = Utf8               meetCastConditions
  #130 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #131 = Utf8               isCtrlPressed
  #132 = Utf8               Z
  #133 = Utf8               lambda$getTargetList$0
  #134 = Utf8               p
  #135 = Utf8               SourceFile
  #136 = Utf8               TargetAlly.java
  #137 = Utf8               BootstrapMethods
  #138 = MethodType         #33           //  (Ljava/lang/Object;)Z
  #139 = MethodHandle       6:#140        // REF_invokeStatic ext/mods/gameserver/handler/targethandlers/TargetAlly.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Playable;)Z
  #140 = Methodref          #100.#141     // ext/mods/gameserver/handler/targethandlers/TargetAlly.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Playable;)Z
  #141 = NameAndType        #133:#70      // lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Playable;)Z
  #142 = MethodType         #70           //  (Lext/mods/gameserver/model/actor/Playable;)Z
  #143 = MethodHandle       6:#144        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #144 = Methodref          #145.#146     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #145 = Class              #147          // java/lang/invoke/LambdaMetafactory
  #146 = NameAndType        #148:#149     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #147 = Utf8               java/lang/invoke/LambdaMetafactory
  #148 = Utf8               metafactory
  #149 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #150 = Utf8               InnerClasses
  #151 = Class              #152          // java/lang/invoke/MethodHandles$Lookup
  #152 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #153 = Class              #154          // java/lang/invoke/MethodHandles
  #154 = Utf8               java/lang/invoke/MethodHandles
  #155 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.targethandlers.TargetAlly();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAlly;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAlly;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=4
         0: aload_1
         1: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore        4
         6: aload         4
         8: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        11: ifeq          23
        14: iconst_1
        15: anewarray     #14                 // class ext/mods/gameserver/model/actor/Creature
        18: dup
        19: iconst_0
        20: aload_1
        21: aastore
        22: areturn
        23: new           #25                 // class java/util/ArrayList
        26: dup
        27: invokespecial #27                 // Method java/util/ArrayList."<init>":()V
        30: astore        5
        32: aload         5
        34: aload         4
        36: invokeinterface #28,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        41: pop
        42: aload         4
        44: ldc           #34                 // class ext/mods/gameserver/model/actor/Playable
        46: aload_3
        47: invokevirtual #36                 // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
        50: invokedynamic #42,  0             // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        55: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
        58: invokeinterface #50,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        63: astore        6
        65: aload         6
        67: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        72: ifeq          187
        75: aload         6
        77: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        82: checkcast     #34                 // class ext/mods/gameserver/model/actor/Playable
        85: astore        7
        87: aload         7
        89: aload         4
        91: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        94: if_acmpeq     174
        97: aload         7
        99: aload         4
       101: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Playable.isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
       104: ifne          120
       107: aload         7
       109: aload         4
       111: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Playable.isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
       114: ifne          120
       117: goto          65
       120: aload         4
       122: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
       125: ifeq          131
       128: goto          65
       131: aload         4
       133: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
       136: ifeq          174
       139: aload         7
       141: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       144: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       147: aload         4
       149: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       152: if_icmpne     65
       155: aload         4
       157: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       160: aload         7
       162: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       165: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       168: if_acmpeq     174
       171: goto          65
       174: aload         5
       176: aload         7
       178: invokeinterface #28,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       183: pop
       184: goto          65
       187: aload         5
       189: aload         5
       191: invokeinterface #88,  1           // InterfaceMethod java/util/List.size:()I
       196: anewarray     #14                 // class ext/mods/gameserver/model/actor/Creature
       199: invokeinterface #91,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       204: checkcast     #95                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       207: areturn
      LineNumberTable:
        line 41: 0
        line 43: 6
        line 44: 14
        line 49: 23
        line 50: 32
        line 52: 42
        line 54: 87
        line 56: 97
        line 57: 117
        line 59: 120
        line 61: 128
        line 64: 131
        line 65: 171
        line 68: 174
        line 69: 184
        line 71: 187
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           87      97     7 playable   Lext/mods/gameserver/model/actor/Playable;
            0     208     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAlly;
            0     208     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     208     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     208     3 skill   Lext/mods/gameserver/skills/L2Skill;
            6     202     4 player   Lext/mods/gameserver/model/actor/Player;
           32     176     5  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           32     176     5  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 10 /* same */
        frame_type = 42 /* same */
        frame_type = 249 /* chop */
          offset_delta = 12

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_1
         1: areturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAlly;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAlly;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0       2     4 isCtrlPressed   Z
}
SourceFile: "TargetAlly.java"
BootstrapMethods:
  0: #143 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #138 (Ljava/lang/Object;)Z
      #139 REF_invokeStatic ext/mods/gameserver/handler/targethandlers/TargetAlly.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Playable;)Z
      #142 (Lext/mods/gameserver/model/actor/Playable;)Z
InnerClasses:
  public static final #155= #151 of #153; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
