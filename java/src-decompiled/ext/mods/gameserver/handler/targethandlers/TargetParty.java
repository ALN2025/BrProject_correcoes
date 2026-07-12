// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetParty
// File: ext\mods\gameserver\handler\targethandlers\TargetParty.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetParty.class
  Last modified 9 de jul de 2026; size 3557 bytes
  MD5 checksum d62f7ddb6e2655e2ef687b685afeb996
  Compiled from "TargetParty.java"
public class ext.mods.gameserver.handler.targethandlers.TargetParty implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #80                         // ext/mods/gameserver/handler/targethandlers/TargetParty
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               PARTY
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Creature
   #15 = NameAndType        #17:#18       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #16 = Utf8               ext/mods/gameserver/model/actor/Creature
   #17 = Utf8               getActingPlayer
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #19 = Class              #20           // java/util/ArrayList
   #20 = Utf8               java/util/ArrayList
   #21 = Methodref          #19.#3        // java/util/ArrayList."<init>":()V
   #22 = InterfaceMethodref #23.#24       // java/util/List.add:(Ljava/lang/Object;)Z
   #23 = Class              #25           // java/util/List
   #24 = NameAndType        #26:#27       // add:(Ljava/lang/Object;)Z
   #25 = Utf8               java/util/List
   #26 = Utf8               add
   #27 = Utf8               (Ljava/lang/Object;)Z
   #28 = Class              #29           // ext/mods/gameserver/model/actor/Playable
   #29 = Utf8               ext/mods/gameserver/model/actor/Playable
   #30 = Methodref          #31.#32       // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #31 = Class              #33           // ext/mods/gameserver/skills/L2Skill
   #32 = NameAndType        #34:#35       // getSkillRadius:()I
   #33 = Utf8               ext/mods/gameserver/skills/L2Skill
   #34 = Utf8               getSkillRadius
   #35 = Utf8               ()I
   #36 = InvokeDynamic      #0:#37        // #0:test:()Ljava/util/function/Predicate;
   #37 = NameAndType        #38:#39       // test:()Ljava/util/function/Predicate;
   #38 = Utf8               test
   #39 = Utf8               ()Ljava/util/function/Predicate;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #41 = Class              #43           // ext/mods/gameserver/model/actor/Player
   #42 = NameAndType        #44:#45       // getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #43 = Utf8               ext/mods/gameserver/model/actor/Player
   #44 = Utf8               getKnownTypeInRadius
   #45 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #46 = InterfaceMethodref #23.#47       // java/util/List.iterator:()Ljava/util/Iterator;
   #47 = NameAndType        #48:#49       // iterator:()Ljava/util/Iterator;
   #48 = Utf8               iterator
   #49 = Utf8               ()Ljava/util/Iterator;
   #50 = InterfaceMethodref #51.#52       // java/util/Iterator.hasNext:()Z
   #51 = Class              #53           // java/util/Iterator
   #52 = NameAndType        #54:#55       // hasNext:()Z
   #53 = Utf8               java/util/Iterator
   #54 = Utf8               hasNext
   #55 = Utf8               ()Z
   #56 = InterfaceMethodref #51.#57       // java/util/Iterator.next:()Ljava/lang/Object;
   #57 = NameAndType        #58:#59       // next:()Ljava/lang/Object;
   #58 = Utf8               next
   #59 = Utf8               ()Ljava/lang/Object;
   #60 = Methodref          #41.#61       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #61 = NameAndType        #62:#63       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #62 = Utf8               getSummon
   #63 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #64 = Methodref          #28.#65       // ext/mods/gameserver/model/actor/Playable.isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
   #65 = NameAndType        #66:#67       // isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
   #66 = Utf8               isInSameParty
   #67 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #68 = InterfaceMethodref #23.#69       // java/util/List.size:()I
   #69 = NameAndType        #70:#35       // size:()I
   #70 = Utf8               size
   #71 = InterfaceMethodref #23.#72       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #72 = NameAndType        #73:#74       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #73 = Utf8               toArray
   #74 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #75 = Class              #76           // "[Lext/mods/gameserver/model/actor/Creature;"
   #76 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #77 = Methodref          #28.#78       // ext/mods/gameserver/model/actor/Playable.isDead:()Z
   #78 = NameAndType        #79:#55       // isDead:()Z
   #79 = Utf8               isDead
   #80 = Class              #81           // ext/mods/gameserver/handler/targethandlers/TargetParty
   #81 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetParty
   #82 = Class              #83           // ext/mods/gameserver/handler/ITargetHandler
   #83 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #84 = Utf8               Code
   #85 = Utf8               LineNumberTable
   #86 = Utf8               LocalVariableTable
   #87 = Utf8               this
   #88 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetParty;
   #89 = Utf8               getTargetType
   #90 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #91 = Utf8               getTargetList
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
   #93 = Utf8               playable
   #94 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #95 = Utf8               caster
   #96 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #97 = Utf8               target
   #98 = Utf8               skill
   #99 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #100 = Utf8               player
  #101 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #102 = Utf8               list
  #103 = Utf8               Ljava/util/List;
  #104 = Utf8               LocalVariableTypeTable
  #105 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #106 = Utf8               StackMapTable
  #107 = Utf8               getFinalTarget
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #109 = Utf8               meetCastConditions
  #110 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #111 = Utf8               isCtrlPressed
  #112 = Utf8               Z
  #113 = Utf8               lambda$getTargetList$0
  #114 = Utf8               p
  #115 = Utf8               SourceFile
  #116 = Utf8               TargetParty.java
  #117 = Utf8               BootstrapMethods
  #118 = MethodType         #27           //  (Ljava/lang/Object;)Z
  #119 = MethodHandle       6:#120        // REF_invokeStatic ext/mods/gameserver/handler/targethandlers/TargetParty.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Playable;)Z
  #120 = Methodref          #80.#121      // ext/mods/gameserver/handler/targethandlers/TargetParty.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Playable;)Z
  #121 = NameAndType        #113:#67      // lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Playable;)Z
  #122 = MethodType         #67           //  (Lext/mods/gameserver/model/actor/Playable;)Z
  #123 = MethodHandle       6:#124        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #124 = Methodref          #125.#126     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #125 = Class              #127          // java/lang/invoke/LambdaMetafactory
  #126 = NameAndType        #128:#129     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #127 = Utf8               java/lang/invoke/LambdaMetafactory
  #128 = Utf8               metafactory
  #129 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #130 = Utf8               InnerClasses
  #131 = Class              #132          // java/lang/invoke/MethodHandles$Lookup
  #132 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #133 = Class              #134          // java/lang/invoke/MethodHandles
  #134 = Utf8               java/lang/invoke/MethodHandles
  #135 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.targethandlers.TargetParty();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetParty;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetParty;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=4
         0: aload_1
         1: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore        4
         6: new           #19                 // class java/util/ArrayList
         9: dup
        10: invokespecial #21                 // Method java/util/ArrayList."<init>":()V
        13: astore        5
        15: aload         5
        17: aload         4
        19: invokeinterface #22,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload         4
        27: ldc           #28                 // class ext/mods/gameserver/model/actor/Playable
        29: aload_3
        30: invokevirtual #30                 // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
        33: invokedynamic #36,  0             // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        38: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
        41: invokeinterface #46,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        46: astore        6
        48: aload         6
        50: invokeinterface #50,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        55: ifeq          106
        58: aload         6
        60: invokeinterface #56,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        65: checkcast     #28                 // class ext/mods/gameserver/model/actor/Playable
        68: astore        7
        70: aload         7
        72: aload         4
        74: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        77: if_acmpeq     93
        80: aload         7
        82: aload         4
        84: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Playable.isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
        87: ifne          93
        90: goto          48
        93: aload         5
        95: aload         7
        97: invokeinterface #22,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       102: pop
       103: goto          48
       106: aload         5
       108: aload         5
       110: invokeinterface #68,  1           // InterfaceMethod java/util/List.size:()I
       115: anewarray     #14                 // class ext/mods/gameserver/model/actor/Creature
       118: invokeinterface #71,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       123: checkcast     #75                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       126: areturn
      LineNumberTable:
        line 41: 0
        line 43: 6
        line 44: 15
        line 46: 25
        line 48: 70
        line 50: 80
        line 51: 90
        line 54: 93
        line 55: 103
        line 57: 106
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           70      33     7 playable   Lext/mods/gameserver/model/actor/Playable;
            0     127     0  this   Lext/mods/gameserver/handler/targethandlers/TargetParty;
            0     127     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     127     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     127     3 skill   Lext/mods/gameserver/skills/L2Skill;
            6     121     4 player   Lext/mods/gameserver/model/actor/Player;
           15     112     5  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           15     112     5  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
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
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetParty;
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
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetParty;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0       2     4 isCtrlPressed   Z
}
SourceFile: "TargetParty.java"
BootstrapMethods:
  0: #123 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #118 (Ljava/lang/Object;)Z
      #119 REF_invokeStatic ext/mods/gameserver/handler/targethandlers/TargetParty.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Playable;)Z
      #122 (Lext/mods/gameserver/model/actor/Playable;)Z
InnerClasses:
  public static final #135= #131 of #133; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
