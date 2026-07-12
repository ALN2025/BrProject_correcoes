// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetCorpseAlly
// File: ext\mods\gameserver\handler\targethandlers\TargetCorpseAlly.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetCorpseAlly.class
  Last modified 9 de jul de 2026; size 4368 bytes
  MD5 checksum 46bf887fa697f29ac7bf0e8d45468d98
  Compiled from "TargetCorpseAlly.java"
public class ext.mods.gameserver.handler.targethandlers.TargetCorpseAlly implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #116                        // ext/mods/gameserver/handler/targethandlers/TargetCorpseAlly
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               CORPSE_ALLY
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
   #22 = Methodref          #23.#24       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #23 = Class              #25           // ext/mods/gameserver/model/actor/Player
   #24 = NameAndType        #26:#27       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #25 = Utf8               ext/mods/gameserver/model/actor/Player
   #26 = Utf8               getClan
   #27 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #28 = Methodref          #29.#30       // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #29 = Class              #31           // ext/mods/gameserver/skills/L2Skill
   #30 = NameAndType        #32:#33       // getSkillRadius:()I
   #31 = Utf8               ext/mods/gameserver/skills/L2Skill
   #32 = Utf8               getSkillRadius
   #33 = Utf8               ()I
   #34 = InvokeDynamic      #0:#35        // #0:test:()Ljava/util/function/Predicate;
   #35 = NameAndType        #36:#37       // test:()Ljava/util/function/Predicate;
   #36 = Utf8               test
   #37 = Utf8               ()Ljava/util/function/Predicate;
   #38 = Methodref          #23.#39       // ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #39 = NameAndType        #40:#41       // getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #40 = Utf8               getKnownTypeInRadius
   #41 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
   #42 = InterfaceMethodref #43.#44       // java/util/List.iterator:()Ljava/util/Iterator;
   #43 = Class              #45           // java/util/List
   #44 = NameAndType        #46:#47       // iterator:()Ljava/util/Iterator;
   #45 = Utf8               java/util/List
   #46 = Utf8               iterator
   #47 = Utf8               ()Ljava/util/Iterator;
   #48 = InterfaceMethodref #49.#50       // java/util/Iterator.hasNext:()Z
   #49 = Class              #51           // java/util/Iterator
   #50 = NameAndType        #52:#53       // hasNext:()Z
   #51 = Utf8               java/util/Iterator
   #52 = Utf8               hasNext
   #53 = Utf8               ()Z
   #54 = InterfaceMethodref #49.#55       // java/util/Iterator.next:()Ljava/lang/Object;
   #55 = NameAndType        #56:#57       // next:()Ljava/lang/Object;
   #56 = Utf8               next
   #57 = Utf8               ()Ljava/lang/Object;
   #58 = Methodref          #23.#59       // ext/mods/gameserver/model/actor/Player.isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
   #59 = NameAndType        #60:#61       // isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
   #60 = Utf8               isInSameClan
   #61 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #62 = Methodref          #23.#63       // ext/mods/gameserver/model/actor/Player.isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
   #63 = NameAndType        #64:#61       // isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
   #64 = Utf8               isInSameAlly
   #65 = Methodref          #23.#66       // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
   #66 = NameAndType        #67:#53       // isInDuel:()Z
   #67 = Utf8               isInDuel
   #68 = Methodref          #23.#69       // ext/mods/gameserver/model/actor/Player.getDuelId:()I
   #69 = NameAndType        #70:#33       // getDuelId:()I
   #70 = Utf8               getDuelId
   #71 = Methodref          #23.#72       // ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
   #72 = NameAndType        #73:#74       // getTeam:()Lext/mods/gameserver/enums/TeamType;
   #73 = Utf8               getTeam
   #74 = Utf8               ()Lext/mods/gameserver/enums/TeamType;
   #75 = InterfaceMethodref #43.#76       // java/util/List.add:(Ljava/lang/Object;)Z
   #76 = NameAndType        #77:#78       // add:(Ljava/lang/Object;)Z
   #77 = Utf8               add
   #78 = Utf8               (Ljava/lang/Object;)Z
   #79 = InterfaceMethodref #43.#80       // java/util/List.isEmpty:()Z
   #80 = NameAndType        #81:#53       // isEmpty:()Z
   #81 = Utf8               isEmpty
   #82 = InterfaceMethodref #43.#83       // java/util/List.size:()I
   #83 = NameAndType        #84:#33       // size:()I
   #84 = Utf8               size
   #85 = InterfaceMethodref #43.#86       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #86 = NameAndType        #87:#88       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #87 = Utf8               toArray
   #88 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #89 = Class              #90           // "[Lext/mods/gameserver/model/actor/Creature;"
   #90 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #91 = Methodref          #92.#15       // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #92 = Class              #93           // ext/mods/gameserver/model/actor/Playable
   #93 = Utf8               ext/mods/gameserver/model/actor/Playable
   #94 = Methodref          #23.#95       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #95 = NameAndType        #96:#53       // isInOlympiadMode:()Z
   #96 = Utf8               isInOlympiadMode
   #97 = Fieldref           #98.#99       // ext/mods/gameserver/network/SystemMessageId.THIS_SKILL_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
   #98 = Class              #100          // ext/mods/gameserver/network/SystemMessageId
   #99 = NameAndType        #101:#102     // THIS_SKILL_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #100 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #101 = Utf8               THIS_SKILL_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT
  #102 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #103 = Methodref          #104.#105     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #104 = Class              #106          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #105 = NameAndType        #107:#108     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #106 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #107 = Utf8               getSystemMessage
  #108 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #109 = Methodref          #92.#110      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = NameAndType        #111:#112     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Utf8               sendPacket
  #112 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = Methodref          #23.#114      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #114 = NameAndType        #115:#53      // isDead:()Z
  #115 = Utf8               isDead
  #116 = Class              #117          // ext/mods/gameserver/handler/targethandlers/TargetCorpseAlly
  #117 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetCorpseAlly
  #118 = Class              #119          // ext/mods/gameserver/handler/ITargetHandler
  #119 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #120 = Utf8               Code
  #121 = Utf8               LineNumberTable
  #122 = Utf8               LocalVariableTable
  #123 = Utf8               this
  #124 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetCorpseAlly;
  #125 = Utf8               getTargetType
  #126 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #127 = Utf8               getTargetList
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #129 = Utf8               targetPlayer
  #130 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #131 = Utf8               caster
  #132 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #133 = Utf8               target
  #134 = Utf8               skill
  #135 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #136 = Utf8               player
  #137 = Utf8               list
  #138 = Utf8               Ljava/util/List;
  #139 = Utf8               LocalVariableTypeTable
  #140 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #141 = Utf8               StackMapTable
  #142 = Utf8               getFinalTarget
  #143 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #144 = Utf8               meetCastConditions
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #146 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #147 = Utf8               isCtrlPressed
  #148 = Utf8               Z
  #149 = Utf8               lambda$getTargetList$0
  #150 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #151 = Utf8               p
  #152 = Utf8               SourceFile
  #153 = Utf8               TargetCorpseAlly.java
  #154 = Utf8               BootstrapMethods
  #155 = MethodType         #78           //  (Ljava/lang/Object;)Z
  #156 = MethodHandle       6:#157        // REF_invokeStatic ext/mods/gameserver/handler/targethandlers/TargetCorpseAlly.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #157 = Methodref          #116.#158     // ext/mods/gameserver/handler/targethandlers/TargetCorpseAlly.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #158 = NameAndType        #149:#150     // lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #159 = MethodType         #150          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #160 = MethodHandle       6:#161        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #161 = Methodref          #162.#163     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #162 = Class              #164          // java/lang/invoke/LambdaMetafactory
  #163 = NameAndType        #165:#166     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #164 = Utf8               java/lang/invoke/LambdaMetafactory
  #165 = Utf8               metafactory
  #166 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #167 = Utf8               InnerClasses
  #168 = Class              #169          // java/lang/invoke/MethodHandles$Lookup
  #169 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #170 = Class              #171          // java/lang/invoke/MethodHandles
  #171 = Utf8               java/lang/invoke/MethodHandles
  #172 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.targethandlers.TargetCorpseAlly();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseAlly;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseAlly;

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
        15: aload         4
        17: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        20: ifnull        141
        23: aload         4
        25: ldc           #23                 // class ext/mods/gameserver/model/actor/Player
        27: aload_3
        28: invokevirtual #28                 // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
        31: invokedynamic #34,  0             // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        36: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
        39: invokeinterface #42,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        44: astore        6
        46: aload         6
        48: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        53: ifeq          141
        56: aload         6
        58: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        63: checkcast     #23                 // class ext/mods/gameserver/model/actor/Player
        66: astore        7
        68: aload         7
        70: aload         4
        72: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
        75: ifne          91
        78: aload         7
        80: aload         4
        82: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
        85: ifne          91
        88: goto          46
        91: aload         4
        93: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
        96: ifeq          128
        99: aload         4
       101: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       104: aload         7
       106: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       109: if_icmpne     46
       112: aload         4
       114: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       117: aload         7
       119: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       122: if_acmpeq     128
       125: goto          46
       128: aload         5
       130: aload         7
       132: invokeinterface #75,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       137: pop
       138: goto          46
       141: aload         5
       143: invokeinterface #79,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       148: ifeq          160
       151: iconst_1
       152: anewarray     #14                 // class ext/mods/gameserver/model/actor/Creature
       155: dup
       156: iconst_0
       157: aload_1
       158: aastore
       159: areturn
       160: aload         5
       162: aload         5
       164: invokeinterface #82,  1           // InterfaceMethod java/util/List.size:()I
       169: anewarray     #14                 // class ext/mods/gameserver/model/actor/Creature
       172: invokeinterface #85,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       177: checkcast     #89                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       180: areturn
      LineNumberTable:
        line 43: 0
        line 45: 6
        line 47: 15
        line 49: 23
        line 51: 68
        line 52: 88
        line 54: 91
        line 55: 125
        line 57: 128
        line 58: 138
        line 61: 141
        line 62: 151
        line 67: 160
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           68      70     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     181     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseAlly;
            0     181     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     181     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     181     3 skill   Lext/mods/gameserver/skills/L2Skill;
            6     175     4 player   Lext/mods/gameserver/model/actor/Player;
           15     166     5  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           15     166     5  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 5
        frame_type = 254 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 36 /* same */
        frame_type = 249 /* chop */
          offset_delta = 12
        frame_type = 18 /* same */

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_1
         1: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseAlly;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=5
         0: aload_1
         1: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore        5
         6: aload         5
         8: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        11: ifeq          26
        14: aload_1
        15: getstatic     #97                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_SKILL_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
        18: invokestatic  #103                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        21: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        24: iconst_0
        25: ireturn
        26: iconst_1
        27: ireturn
      LineNumberTable:
        line 79: 0
        line 80: 6
        line 82: 14
        line 83: 24
        line 85: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseAlly;
            0      28     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      28     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      28     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      28     4 isCtrlPressed   Z
            6      22     5 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/Player ]
}
SourceFile: "TargetCorpseAlly.java"
BootstrapMethods:
  0: #160 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #155 (Ljava/lang/Object;)Z
      #156 REF_invokeStatic ext/mods/gameserver/handler/targethandlers/TargetCorpseAlly.lambda$getTargetList$0:(Lext/mods/gameserver/model/actor/Player;)Z
      #159 (Lext/mods/gameserver/model/actor/Player;)Z
InnerClasses:
  public static final #172= #168 of #170; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
