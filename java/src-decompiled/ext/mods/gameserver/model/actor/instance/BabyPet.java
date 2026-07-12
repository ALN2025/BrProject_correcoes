// Bytecode for: ext.mods.gameserver.model.actor.instance.BabyPet
// File: ext\mods\gameserver\model\actor\instance\BabyPet.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/BabyPet.class
  Last modified 9 de jul de 2026; size 4809 bytes
  MD5 checksum 1ecd8a8ef67698a82ce9d1aa73ae2b95
  Compiled from "BabyPet.java"
public final class ext.mods.gameserver.model.actor.instance.BabyPet extends ext.mods.gameserver.model.actor.instance.Pet
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/model/actor/instance/BabyPet
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Pet
  interfaces: 0, fields: 1, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Pet."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Pet
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/actor/instance/Pet.onSpawn:()V
    #8 = NameAndType        #9:#10        // onSpawn:()V
    #9 = Utf8               onSpawn
   #10 = Utf8               ()V
   #11 = Methodref          #12.#13       // ext/mods/gameserver/model/actor/instance/BabyPet.startCastTask:()V
   #12 = Class              #14           // ext/mods/gameserver/model/actor/instance/BabyPet
   #13 = NameAndType        #15:#10       // startCastTask:()V
   #14 = Utf8               ext/mods/gameserver/model/actor/instance/BabyPet
   #15 = Utf8               startCastTask
   #16 = Methodref          #2.#17        // ext/mods/gameserver/model/actor/instance/Pet.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #17 = NameAndType        #18:#19       // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #18 = Utf8               doDie
   #19 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #20 = Methodref          #12.#21       // ext/mods/gameserver/model/actor/instance/BabyPet.stopCastTask:()V
   #21 = NameAndType        #22:#10       // stopCastTask:()V
   #22 = Utf8               stopCastTask
   #23 = Methodref          #2.#24        // ext/mods/gameserver/model/actor/instance/Pet.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #24 = NameAndType        #25:#26       // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #25 = Utf8               unSummon
   #26 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #27 = Methodref          #2.#28        // ext/mods/gameserver/model/actor/instance/Pet.doRevive:()V
   #28 = NameAndType        #29:#10       // doRevive:()V
   #29 = Utf8               doRevive
   #30 = Methodref          #12.#31       // ext/mods/gameserver/model/actor/instance/BabyPet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
   #31 = NameAndType        #32:#33       // getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
   #32 = Utf8               getStatus
   #33 = Utf8               ()Lext/mods/gameserver/model/actor/status/PetStatus;
   #34 = Methodref          #35.#36       // ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
   #35 = Class              #37           // ext/mods/gameserver/model/actor/status/PetStatus
   #36 = NameAndType        #38:#39       // getLevel:()I
   #37 = Utf8               ext/mods/gameserver/model/actor/status/PetStatus
   #38 = Utf8               getLevel
   #39 = Utf8               ()I
   #40 = Methodref          #41.#42       // java/lang/Math.max:(II)I
   #41 = Class              #43           // java/lang/Math
   #42 = NameAndType        #44:#45       // max:(II)I
   #43 = Utf8               java/lang/Math
   #44 = Utf8               max
   #45 = Utf8               (II)I
   #46 = Methodref          #41.#47       // java/lang/Math.min:(II)I
   #47 = NameAndType        #48:#45       // min:(II)I
   #48 = Utf8               min
   #49 = Fieldref           #12.#50       // ext/mods/gameserver/model/actor/instance/BabyPet._castTask:Ljava/util/concurrent/Future;
   #50 = NameAndType        #51:#52       // _castTask:Ljava/util/concurrent/Future;
   #51 = Utf8               _castTask
   #52 = Utf8               Ljava/util/concurrent/Future;
   #53 = Methodref          #12.#54       // ext/mods/gameserver/model/actor/instance/BabyPet.isDead:()Z
   #54 = NameAndType        #55:#56       // isDead:()Z
   #55 = Utf8               isDead
   #56 = Utf8               ()Z
   #57 = InvokeDynamic      #0:#58        // #0:run:(Lext/mods/gameserver/model/actor/instance/BabyPet;)Ljava/lang/Runnable;
   #58 = NameAndType        #59:#60       // run:(Lext/mods/gameserver/model/actor/instance/BabyPet;)Ljava/lang/Runnable;
   #59 = Utf8               run
   #60 = Utf8               (Lext/mods/gameserver/model/actor/instance/BabyPet;)Ljava/lang/Runnable;
   #61 = Long               3000l
   #63 = Long               1000l
   #65 = Methodref          #66.#67       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #66 = Class              #68           // ext/mods/commons/pool/ThreadPool
   #67 = NameAndType        #69:#70       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #68 = Utf8               ext/mods/commons/pool/ThreadPool
   #69 = Utf8               scheduleAtFixedRate
   #70 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #71 = InterfaceMethodref #72.#73       // java/util/concurrent/Future.cancel:(Z)Z
   #72 = Class              #74           // java/util/concurrent/Future
   #73 = NameAndType        #75:#76       // cancel:(Z)Z
   #74 = Utf8               java/util/concurrent/Future
   #75 = Utf8               cancel
   #76 = Utf8               (Z)Z
   #77 = Methodref          #12.#78       // ext/mods/gameserver/model/actor/instance/BabyPet.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #78 = NameAndType        #79:#80       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #79 = Utf8               getOwner
   #80 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #81 = Methodref          #82.#54       // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #82 = Class              #83           // ext/mods/gameserver/model/actor/Player
   #83 = Utf8               ext/mods/gameserver/model/actor/Player
   #84 = Methodref          #82.#85       // ext/mods/gameserver/model/actor/Player.isInvul:()Z
   #85 = NameAndType        #86:#56       // isInvul:()Z
   #86 = Utf8               isInvul
   #87 = Methodref          #82.#88       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #88 = NameAndType        #32:#89       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #89 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #90 = Methodref          #91.#92       // ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
   #91 = Class              #93           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #92 = NameAndType        #94:#95       // getHpRatio:()D
   #93 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #94 = Utf8               getHpRatio
   #95 = Utf8               ()D
   #96 = Methodref          #97.#98       // ext/mods/commons/random/Rnd.get:(I)I
   #97 = Class              #99           // ext/mods/commons/random/Rnd
   #98 = NameAndType        #100:#101     // get:(I)I
   #99 = Utf8               ext/mods/commons/random/Rnd
  #100 = Utf8               get
  #101 = Utf8               (I)I
  #102 = Methodref          #103.#104     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #103 = Class              #105          // ext/mods/gameserver/data/SkillTable
  #104 = NameAndType        #106:#107     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #105 = Utf8               ext/mods/gameserver/data/SkillTable
  #106 = Utf8               getInstance
  #107 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #108 = Methodref          #12.#109      // ext/mods/gameserver/model/actor/instance/BabyPet.getSkillLevel:(I)I
  #109 = NameAndType        #110:#101     // getSkillLevel:(I)I
  #110 = Utf8               getSkillLevel
  #111 = Methodref          #103.#112     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #112 = NameAndType        #113:#114     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #113 = Utf8               getInfo
  #114 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #115 = Methodref          #12.#116      // ext/mods/gameserver/model/actor/instance/BabyPet.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #116 = NameAndType        #117:#118     // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #117 = Utf8               isSkillDisabled
  #118 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #119 = Methodref          #35.#120      // ext/mods/gameserver/model/actor/status/PetStatus.getMp:()D
  #120 = NameAndType        #121:#95      // getMp:()D
  #121 = Utf8               getMp
  #122 = Methodref          #123.#124     // ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
  #123 = Class              #125          // ext/mods/gameserver/skills/L2Skill
  #124 = NameAndType        #126:#39      // getMpConsume:()I
  #125 = Utf8               ext/mods/gameserver/skills/L2Skill
  #126 = Utf8               getMpConsume
  #127 = Double             0.8d
  #129 = Methodref          #12.#130      // ext/mods/gameserver/model/actor/instance/BabyPet.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #130 = NameAndType        #131:#132     // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #131 = Utf8               getAI
  #132 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #133 = Methodref          #134.#135     // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #134 = Class              #136          // ext/mods/gameserver/model/actor/ai/type/SummonAI
  #135 = NameAndType        #137:#138     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #136 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
  #137 = Utf8               tryToCast
  #138 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #139 = Fieldref           #140.#141     // ext/mods/gameserver/network/SystemMessageId.PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
  #140 = Class              #142          // ext/mods/gameserver/network/SystemMessageId
  #141 = NameAndType        #143:#144     // PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
  #142 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #143 = Utf8               PET_USES_S1
  #144 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #145 = Methodref          #146.#147     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #146 = Class              #148          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #147 = NameAndType        #149:#150     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #148 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #149 = Utf8               getSystemMessage
  #150 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #151 = Methodref          #146.#152     // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #152 = NameAndType        #153:#154     // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #153 = Utf8               addSkillName
  #154 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #155 = Methodref          #82.#156      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #156 = NameAndType        #157:#158     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #157 = Utf8               sendPacket
  #158 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #159 = Double             0.15d
  #161 = Utf8               Signature
  #162 = Utf8               Ljava/util/concurrent/Future<*>;
  #163 = Utf8               Code
  #164 = Utf8               LineNumberTable
  #165 = Utf8               LocalVariableTable
  #166 = Utf8               this
  #167 = Utf8               Lext/mods/gameserver/model/actor/instance/BabyPet;
  #168 = Utf8               objectId
  #169 = Utf8               I
  #170 = Utf8               template
  #171 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #172 = Utf8               owner
  #173 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #174 = Utf8               control
  #175 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #176 = Utf8               killer
  #177 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #178 = Utf8               StackMapTable
  #179 = Utf8               skillId
  #180 = Utf8               castSkill
  #181 = Utf8               playfulHeal
  #182 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #183 = Utf8               urgentHeal
  #184 = Utf8               hpRatio
  #185 = Utf8               D
  #186 = Utf8               SourceFile
  #187 = Utf8               BabyPet.java
  #188 = Utf8               BootstrapMethods
  #189 = MethodType         #10           //  ()V
  #190 = MethodHandle       5:#191        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/BabyPet.castSkill:()V
  #191 = Methodref          #12.#192      // ext/mods/gameserver/model/actor/instance/BabyPet.castSkill:()V
  #192 = NameAndType        #180:#10      // castSkill:()V
  #193 = MethodHandle       6:#194        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #194 = Methodref          #195.#196     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #195 = Class              #197          // java/lang/invoke/LambdaMetafactory
  #196 = NameAndType        #198:#199     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #197 = Utf8               java/lang/invoke/LambdaMetafactory
  #198 = Utf8               metafactory
  #199 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #200 = Utf8               InnerClasses
  #201 = Class              #202          // java/lang/invoke/MethodHandles$Lookup
  #202 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #203 = Class              #204          // java/lang/invoke/MethodHandles
  #204 = Utf8               java/lang/invoke/MethodHandles
  #205 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.BabyPet(int, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: aload_2
         3: aload_3
         4: aload         4
         6: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Pet."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
         9: return
      LineNumberTable:
        line 48: 0
        line 49: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/BabyPet;
            0      10     1 objectId   I
            0      10     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      10     3 owner   Lext/mods/gameserver/model/actor/Player;
            0      10     4 control   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #7                  // Method ext/mods/gameserver/model/actor/instance/Pet.onSpawn:()V
         4: aload_0
         5: invokevirtual #11                 // Method startCastTask:()V
         8: return
      LineNumberTable:
        line 54: 0
        line 56: 4
        line 57: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/instance/BabyPet;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #16                 // Method ext/mods/gameserver/model/actor/instance/Pet.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: invokevirtual #20                 // Method stopCastTask:()V
        14: iconst_1
        15: ireturn
      LineNumberTable:
        line 62: 0
        line 63: 8
        line 65: 10
        line 67: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/instance/BabyPet;
            0      16     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 10 /* same */

  public synchronized void unSummon(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #20                 // Method stopCastTask:()V
         4: aload_0
         5: aload_1
         6: invokespecial #23                 // Method ext/mods/gameserver/model/actor/instance/Pet.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
         9: return
      LineNumberTable:
        line 73: 0
        line 75: 4
        line 76: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/BabyPet;
            0      10     1 owner   Lext/mods/gameserver/model/actor/Player;

  public void doRevive();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #27                 // Method ext/mods/gameserver/model/actor/instance/Pet.doRevive:()V
         4: aload_0
         5: invokevirtual #11                 // Method startCastTask:()V
         8: return
      LineNumberTable:
        line 81: 0
        line 83: 4
        line 84: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/instance/BabyPet;

  public final int getSkillLevel(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #30                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
         4: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
         7: bipush        70
         9: if_icmpge     27
        12: iconst_1
        13: aload_0
        14: invokevirtual #30                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        17: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
        20: bipush        10
        22: idiv
        23: invokestatic  #40                 // Method java/lang/Math.max:(II)I
        26: ireturn
        27: bipush        12
        29: bipush        7
        31: aload_0
        32: invokevirtual #30                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        35: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
        38: bipush        70
        40: isub
        41: iconst_5
        42: idiv
        43: iadd
        44: invokestatic  #46                 // Method java/lang/Math.min:(II)I
        47: ireturn
      LineNumberTable:
        line 89: 0
        line 90: 12
        line 92: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/actor/instance/BabyPet;
            0      48     1 skillId   I
      StackMapTable: number_of_entries = 1
        frame_type = 27 /* same */
}
SourceFile: "BabyPet.java"
BootstrapMethods:
  0: #193 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #189 ()V
      #190 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/BabyPet.castSkill:()V
      #189 ()V
InnerClasses:
  public static final #205= #201 of #203; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
