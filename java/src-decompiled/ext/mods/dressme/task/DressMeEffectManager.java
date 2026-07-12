// Bytecode for: ext.mods.dressme.task.DressMeEffectManager
// File: ext\mods\dressme\task\DressMeEffectManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dressme/task/DressMeEffectManager.class
  Last modified 9 de jul de 2026; size 4460 bytes
  MD5 checksum 50f0ac3840aca34b64108f307e0958cc
  Compiled from "DressMeEffectManager.java"
public class ext.mods.dressme.task.DressMeEffectManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/dressme/task/DressMeEffectManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 6, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/dressme/task/DressMeEffectManager._activeEffects:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/dressme/task/DressMeEffectManager
   #12 = NameAndType        #14:#15       // _activeEffects:Ljava/util/Map;
   #13 = Utf8               ext/mods/dressme/task/DressMeEffectManager
   #14 = Utf8               _activeEffects
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // ext/mods/dressme/holder/DressMeHolder.getEffect:()Lext/mods/dressme/holder/DressMeEffectHolder;
   #17 = Class              #19           // ext/mods/dressme/holder/DressMeHolder
   #18 = NameAndType        #20:#21       // getEffect:()Lext/mods/dressme/holder/DressMeEffectHolder;
   #19 = Utf8               ext/mods/dressme/holder/DressMeHolder
   #20 = Utf8               getEffect
   #21 = Utf8               ()Lext/mods/dressme/holder/DressMeEffectHolder;
   #22 = Methodref          #23.#24       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #23 = Class              #25           // ext/mods/gameserver/model/actor/Player
   #24 = NameAndType        #26:#27       // getObjectId:()I
   #25 = Utf8               ext/mods/gameserver/model/actor/Player
   #26 = Utf8               getObjectId
   #27 = Utf8               ()I
   #28 = Methodref          #29.#30       // ext/mods/dressme/holder/DressMeEffectHolder.getSkillId:()I
   #29 = Class              #31           // ext/mods/dressme/holder/DressMeEffectHolder
   #30 = NameAndType        #32:#27       // getSkillId:()I
   #31 = Utf8               ext/mods/dressme/holder/DressMeEffectHolder
   #32 = Utf8               getSkillId
   #33 = Methodref          #29.#34       // ext/mods/dressme/holder/DressMeEffectHolder.getLevel:()I
   #34 = NameAndType        #35:#27       // getLevel:()I
   #35 = Utf8               getLevel
   #36 = Methodref          #29.#37       // ext/mods/dressme/holder/DressMeEffectHolder.getInterval:()I
   #37 = NameAndType        #38:#27       // getInterval:()I
   #38 = Utf8               getInterval
   #39 = Methodref          #11.#40       // ext/mods/dressme/task/DressMeEffectManager.stopEffect:(Lext/mods/gameserver/model/actor/Player;)V
   #40 = NameAndType        #41:#42       // stopEffect:(Lext/mods/gameserver/model/actor/Player;)V
   #41 = Utf8               stopEffect
   #42 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #43 = Methodref          #11.#44       // ext/mods/dressme/task/DressMeEffectManager.applySkill:(Lext/mods/gameserver/model/actor/Player;II)V
   #44 = NameAndType        #45:#46       // applySkill:(Lext/mods/gameserver/model/actor/Player;II)V
   #45 = Utf8               applySkill
   #46 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
   #47 = InvokeDynamic      #0:#48        // #0:run:(Lext/mods/dressme/task/DressMeEffectManager;Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/Runnable;
   #48 = NameAndType        #49:#50       // run:(Lext/mods/dressme/task/DressMeEffectManager;Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/Runnable;
   #49 = Utf8               run
   #50 = Utf8               (Lext/mods/dressme/task/DressMeEffectManager;Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/Runnable;
   #51 = Long               1000l
   #53 = Methodref          #54.#55       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #54 = Class              #56           // ext/mods/commons/pool/ThreadPool
   #55 = NameAndType        #57:#58       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #56 = Utf8               ext/mods/commons/pool/ThreadPool
   #57 = Utf8               scheduleAtFixedRate
   #58 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #59 = Methodref          #60.#61       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #60 = Class              #62           // java/lang/Integer
   #61 = NameAndType        #63:#64       // valueOf:(I)Ljava/lang/Integer;
   #62 = Utf8               java/lang/Integer
   #63 = Utf8               valueOf
   #64 = Utf8               (I)Ljava/lang/Integer;
   #65 = Class              #66           // ext/mods/dressme/task/DressMeEffectManager$ActiveEffect
   #66 = Utf8               ext/mods/dressme/task/DressMeEffectManager$ActiveEffect
   #67 = Methodref          #65.#68       // ext/mods/dressme/task/DressMeEffectManager$ActiveEffect."<init>":(ILjava/util/concurrent/ScheduledFuture;)V
   #68 = NameAndType        #5:#69        // "<init>":(ILjava/util/concurrent/ScheduledFuture;)V
   #69 = Utf8               (ILjava/util/concurrent/ScheduledFuture;)V
   #70 = InterfaceMethodref #71.#72       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #71 = Class              #73           // java/util/Map
   #72 = NameAndType        #74:#75       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #73 = Utf8               java/util/Map
   #74 = Utf8               put
   #75 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #76 = InterfaceMethodref #71.#77       // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #77 = NameAndType        #78:#79       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #78 = Utf8               remove
   #79 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #80 = Fieldref           #65.#81       // ext/mods/dressme/task/DressMeEffectManager$ActiveEffect._task:Ljava/util/concurrent/ScheduledFuture;
   #81 = NameAndType        #82:#83       // _task:Ljava/util/concurrent/ScheduledFuture;
   #82 = Utf8               _task
   #83 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #84 = InterfaceMethodref #85.#86       // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #85 = Class              #87           // java/util/concurrent/ScheduledFuture
   #86 = NameAndType        #88:#89       // cancel:(Z)Z
   #87 = Utf8               java/util/concurrent/ScheduledFuture
   #88 = Utf8               cancel
   #89 = Utf8               (Z)Z
   #90 = Fieldref           #65.#91       // ext/mods/dressme/task/DressMeEffectManager$ActiveEffect._skillId:I
   #91 = NameAndType        #92:#93       // _skillId:I
   #92 = Utf8               _skillId
   #93 = Utf8               I
   #94 = Methodref          #23.#95       // ext/mods/gameserver/model/actor/Player.stopSkillEffects:(I)V
   #95 = NameAndType        #96:#97       // stopSkillEffects:(I)V
   #96 = Utf8               stopSkillEffects
   #97 = Utf8               (I)V
   #98 = Methodref          #99.#100      // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #99 = Class              #101          // ext/mods/gameserver/data/SkillTable
  #100 = NameAndType        #102:#103     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #101 = Utf8               ext/mods/gameserver/data/SkillTable
  #102 = Utf8               getInstance
  #103 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #104 = Methodref          #99.#105      // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #105 = NameAndType        #106:#107     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #106 = Utf8               getInfo
  #107 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #108 = Class              #109          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #109 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #110 = Methodref          #111.#112     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #111 = Class              #113          // ext/mods/gameserver/skills/L2Skill
  #112 = NameAndType        #114:#27      // getId:()I
  #113 = Utf8               ext/mods/gameserver/skills/L2Skill
  #114 = Utf8               getId
  #115 = Methodref          #108.#116     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
  #116 = NameAndType        #5:#117       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
  #117 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
  #118 = Methodref          #111.#119     // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
  #119 = NameAndType        #120:#27      // getSkillRadius:()I
  #120 = Utf8               getSkillRadius
  #121 = Methodref          #23.#122      // ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #122 = NameAndType        #123:#124     // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #123 = Utf8               broadcastPacketInRadius
  #124 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #125 = Fieldref           #126.#127     // ext/mods/dressme/task/DressMeEffectManager$SingletonHolder.INSTANCE:Lext/mods/dressme/task/DressMeEffectManager;
  #126 = Class              #128          // ext/mods/dressme/task/DressMeEffectManager$SingletonHolder
  #127 = NameAndType        #129:#130     // INSTANCE:Lext/mods/dressme/task/DressMeEffectManager;
  #128 = Utf8               ext/mods/dressme/task/DressMeEffectManager$SingletonHolder
  #129 = Utf8               INSTANCE
  #130 = Utf8               Lext/mods/dressme/task/DressMeEffectManager;
  #131 = Methodref          #132.#133     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #132 = Class              #134          // ext/mods/gameserver/model/World
  #133 = NameAndType        #102:#135     // getInstance:()Lext/mods/gameserver/model/World;
  #134 = Utf8               ext/mods/gameserver/model/World
  #135 = Utf8               ()Lext/mods/gameserver/model/World;
  #136 = Methodref          #132.#137     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #137 = NameAndType        #138:#139     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #138 = Utf8               getPlayer
  #139 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #140 = Utf8               Signature
  #141 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/dressme/task/DressMeEffectManager$ActiveEffect;>;
  #142 = Utf8               Code
  #143 = Utf8               LineNumberTable
  #144 = Utf8               LocalVariableTable
  #145 = Utf8               this
  #146 = Utf8               startEffect
  #147 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/dressme/holder/DressMeHolder;)V
  #148 = Utf8               player
  #149 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #150 = Utf8               skin
  #151 = Utf8               Lext/mods/dressme/holder/DressMeHolder;
  #152 = Utf8               playerId
  #153 = Utf8               skillId
  #154 = Utf8               skillLevel
  #155 = Utf8               interval
  #156 = Utf8               task
  #157 = Utf8               LocalVariableTypeTable
  #158 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #159 = Utf8               StackMapTable
  #160 = Utf8               effect
  #161 = Utf8               Lext/mods/dressme/task/DressMeEffectManager$ActiveEffect;
  #162 = Utf8               skill
  #163 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #164 = Utf8               ()Lext/mods/dressme/task/DressMeEffectManager;
  #165 = Utf8               lambda$startEffect$0
  #166 = Utf8               checkOnplayer
  #167 = Utf8               SourceFile
  #168 = Utf8               DressMeEffectManager.java
  #169 = Utf8               NestMembers
  #170 = Utf8               BootstrapMethods
  #171 = MethodType         #6            //  ()V
  #172 = MethodHandle       5:#173        // REF_invokeVirtual ext/mods/dressme/task/DressMeEffectManager.lambda$startEffect$0:(Lext/mods/gameserver/model/actor/Player;II)V
  #173 = Methodref          #11.#174      // ext/mods/dressme/task/DressMeEffectManager.lambda$startEffect$0:(Lext/mods/gameserver/model/actor/Player;II)V
  #174 = NameAndType        #165:#46      // lambda$startEffect$0:(Lext/mods/gameserver/model/actor/Player;II)V
  #175 = MethodHandle       6:#176        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #176 = Methodref          #177.#178     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #177 = Class              #179          // java/lang/invoke/LambdaMetafactory
  #178 = NameAndType        #180:#181     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #179 = Utf8               java/lang/invoke/LambdaMetafactory
  #180 = Utf8               metafactory
  #181 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #182 = Utf8               InnerClasses
  #183 = Utf8               ActiveEffect
  #184 = Utf8               SingletonHolder
  #185 = Class              #186          // java/lang/invoke/MethodHandles$Lookup
  #186 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #187 = Class              #188          // java/lang/invoke/MethodHandles
  #188 = Utf8               java/lang/invoke/MethodHandles
  #189 = Utf8               Lookup
{
  public void startEffect(ext.mods.gameserver.model.actor.Player, ext.mods.dressme.holder.DressMeHolder);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/dressme/holder/DressMeHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=3
         0: aload_1
         1: ifnull        11
         4: aload_2
         5: invokevirtual #16                 // Method ext/mods/dressme/holder/DressMeHolder.getEffect:()Lext/mods/dressme/holder/DressMeEffectHolder;
         8: ifnonnull     12
        11: return
        12: aload_1
        13: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: istore_3
        17: aload_2
        18: invokevirtual #16                 // Method ext/mods/dressme/holder/DressMeHolder.getEffect:()Lext/mods/dressme/holder/DressMeEffectHolder;
        21: invokevirtual #28                 // Method ext/mods/dressme/holder/DressMeEffectHolder.getSkillId:()I
        24: istore        4
        26: aload_2
        27: invokevirtual #16                 // Method ext/mods/dressme/holder/DressMeHolder.getEffect:()Lext/mods/dressme/holder/DressMeEffectHolder;
        30: invokevirtual #33                 // Method ext/mods/dressme/holder/DressMeEffectHolder.getLevel:()I
        33: istore        5
        35: aload_2
        36: invokevirtual #16                 // Method ext/mods/dressme/holder/DressMeHolder.getEffect:()Lext/mods/dressme/holder/DressMeEffectHolder;
        39: invokevirtual #36                 // Method ext/mods/dressme/holder/DressMeEffectHolder.getInterval:()I
        42: istore        6
        44: aload_0
        45: aload_1
        46: invokevirtual #39                 // Method stopEffect:(Lext/mods/gameserver/model/actor/Player;)V
        49: aload_1
        50: iload         4
        52: iload         5
        54: invokestatic  #43                 // Method applySkill:(Lext/mods/gameserver/model/actor/Player;II)V
        57: aload_0
        58: aload_1
        59: iload         4
        61: iload         5
        63: invokedynamic #47,  0             // InvokeDynamic #0:run:(Lext/mods/dressme/task/DressMeEffectManager;Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/Runnable;
        68: iload         6
        70: i2l
        71: ldc2_w        #51                 // long 1000l
        74: lmul
        75: iload         6
        77: i2l
        78: ldc2_w        #51                 // long 1000l
        81: lmul
        82: invokestatic  #53                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        85: astore        7
        87: aload_0
        88: getfield      #10                 // Field _activeEffects:Ljava/util/Map;
        91: iload_3
        92: invokestatic  #59                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        95: new           #65                 // class ext/mods/dressme/task/DressMeEffectManager$ActiveEffect
        98: dup
        99: iload         4
       101: aload         7
       103: invokespecial #67                 // Method ext/mods/dressme/task/DressMeEffectManager$ActiveEffect."<init>":(ILjava/util/concurrent/ScheduledFuture;)V
       106: invokeinterface #70,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       111: pop
       112: return
      LineNumberTable:
        line 57: 0
        line 58: 11
        line 60: 12
        line 61: 17
        line 62: 26
        line 63: 35
        line 65: 44
        line 67: 49
        line 69: 57
        line 85: 87
        line 86: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     113     0  this   Lext/mods/dressme/task/DressMeEffectManager;
            0     113     1 player   Lext/mods/gameserver/model/actor/Player;
            0     113     2  skin   Lext/mods/dressme/holder/DressMeHolder;
           17      96     3 playerId   I
           26      87     4 skillId   I
           35      78     5 skillLevel   I
           44      69     6 interval   I
           87      26     7  task   Ljava/util/concurrent/ScheduledFuture;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           87      26     7  task   Ljava/util/concurrent/ScheduledFuture<*>;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 0 /* same */

  public void stopEffect(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #10                 // Field _activeEffects:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        13: invokestatic  #59                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: invokeinterface #76,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        21: checkcast     #65                 // class ext/mods/dressme/task/DressMeEffectManager$ActiveEffect
        24: astore_2
        25: aload_2
        26: ifnull        48
        29: aload_2
        30: getfield      #80                 // Field ext/mods/dressme/task/DressMeEffectManager$ActiveEffect._task:Ljava/util/concurrent/ScheduledFuture;
        33: iconst_0
        34: invokeinterface #84,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        39: pop
        40: aload_1
        41: aload_2
        42: getfield      #90                 // Field ext/mods/dressme/task/DressMeEffectManager$ActiveEffect._skillId:I
        45: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.stopSkillEffects:(I)V
        48: return
      LineNumberTable:
        line 90: 0
        line 91: 4
        line 93: 5
        line 94: 25
        line 96: 29
        line 97: 40
        line 99: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/dressme/task/DressMeEffectManager;
            0      49     1 player   Lext/mods/gameserver/model/actor/Player;
           25      24     2 effect   Lext/mods/dressme/task/DressMeEffectManager$ActiveEffect;
      StackMapTable: number_of_entries = 2
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/dressme/task/DressMeEffectManager$ActiveEffect ]

  public static ext.mods.dressme.task.DressMeEffectManager getInstance();
    descriptor: ()Lext/mods/dressme/task/DressMeEffectManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #125                // Field ext/mods/dressme/task/DressMeEffectManager$SingletonHolder.INSTANCE:Lext/mods/dressme/task/DressMeEffectManager;
         3: areturn
      LineNumberTable:
        line 113: 0
}
SourceFile: "DressMeEffectManager.java"
NestMembers:
  ext/mods/dressme/task/DressMeEffectManager$SingletonHolder
  ext/mods/dressme/task/DressMeEffectManager$ActiveEffect
BootstrapMethods:
  0: #175 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #171 ()V
      #172 REF_invokeVirtual ext/mods/dressme/task/DressMeEffectManager.lambda$startEffect$0:(Lext/mods/gameserver/model/actor/Player;II)V
      #171 ()V
InnerClasses:
  public static final #189= #185 of #187; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
