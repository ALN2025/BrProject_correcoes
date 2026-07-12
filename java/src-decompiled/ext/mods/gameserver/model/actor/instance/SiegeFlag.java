// Bytecode for: ext.mods.gameserver.model.actor.instance.SiegeFlag
// File: ext\mods\gameserver\model\actor\instance\SiegeFlag.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/SiegeFlag.class
  Last modified 9 de jul de 2026; size 3602 bytes
  MD5 checksum 20d94e0ac6aed0c12f2c9501de564d75
  Compiled from "SiegeFlag.java"
public class ext.mods.gameserver.model.actor.instance.SiegeFlag extends ext.mods.gameserver.model.actor.Npc
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/model/actor/instance/SiegeFlag
  super_class: #2                         // ext/mods/gameserver/model/actor/Npc
  interfaces: 0, fields: 2, methods: 10, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Npc
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Npc
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/actor/Npc.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
    #8 = NameAndType        #9:#10        // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
    #9 = Utf8               doDie
   #10 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #11 = Fieldref           #12.#13       // ext/mods/gameserver/model/actor/instance/SiegeFlag._clan:Lext/mods/gameserver/model/pledge/Clan;
   #12 = Class              #14           // ext/mods/gameserver/model/actor/instance/SiegeFlag
   #13 = NameAndType        #15:#16       // _clan:Lext/mods/gameserver/model/pledge/Clan;
   #14 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeFlag
   #15 = Utf8               _clan
   #16 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/pledge/Clan.setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
   #18 = Class              #20           // ext/mods/gameserver/model/pledge/Clan
   #19 = NameAndType        #21:#22       // setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
   #20 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #21 = Utf8               setFlag
   #22 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
   #23 = Fieldref           #12.#24       // ext/mods/gameserver/model/actor/instance/SiegeFlag._task:Ljava/util/concurrent/Future;
   #24 = NameAndType        #25:#26       // _task:Ljava/util/concurrent/Future;
   #25 = Utf8               _task
   #26 = Utf8               Ljava/util/concurrent/Future;
   #27 = InterfaceMethodref #28.#29       // java/util/concurrent/Future.cancel:(Z)Z
   #28 = Class              #30           // java/util/concurrent/Future
   #29 = NameAndType        #31:#32       // cancel:(Z)Z
   #30 = Utf8               java/util/concurrent/Future
   #31 = Utf8               cancel
   #32 = Utf8               (Z)Z
   #33 = Methodref          #2.#34        // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
   #34 = NameAndType        #35:#36       // deleteMe:()V
   #35 = Utf8               deleteMe
   #36 = Utf8               ()V
   #37 = Class              #38           // ext/mods/gameserver/model/actor/instance/SiegeSummon
   #38 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeSummon
   #39 = Methodref          #37.#40       // ext/mods/gameserver/model/actor/instance/SiegeSummon.getNpcId:()I
   #40 = NameAndType        #41:#42       // getNpcId:()I
   #41 = Utf8               getNpcId
   #42 = Utf8               ()I
   #43 = InvokeDynamic      #0:#44        // #0:run:(Lext/mods/gameserver/model/actor/instance/SiegeFlag;)Ljava/lang/Runnable;
   #44 = NameAndType        #45:#46       // run:(Lext/mods/gameserver/model/actor/instance/SiegeFlag;)Ljava/lang/Runnable;
   #45 = Utf8               run
   #46 = Utf8               (Lext/mods/gameserver/model/actor/instance/SiegeFlag;)Ljava/lang/Runnable;
   #47 = Long               30000l
   #49 = Methodref          #50.#51       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #50 = Class              #52           // ext/mods/commons/pool/ThreadPool
   #51 = NameAndType        #53:#54       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #52 = Utf8               ext/mods/commons/pool/ThreadPool
   #53 = Utf8               schedule
   #54 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #55 = Class              #56           // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #56 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #57 = Fieldref           #58.#59       // ext/mods/gameserver/network/SystemMessageId.BASE_UNDER_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
   #58 = Class              #60           // ext/mods/gameserver/network/SystemMessageId
   #59 = NameAndType        #61:#62       // BASE_UNDER_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
   #60 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #61 = Utf8               BASE_UNDER_ATTACK
   #62 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #63 = Methodref          #64.#65       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #64 = Class              #66           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #65 = NameAndType        #67:#68       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #66 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #67 = Utf8               getSystemMessage
   #68 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #69 = Methodref          #18.#70       // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #70 = NameAndType        #71:#72       // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #71 = Utf8               broadcastToMembers
   #72 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #73 = Methodref          #2.#74        // ext/mods/gameserver/model/actor/Npc.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #74 = NameAndType        #75:#76       // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #75 = Utf8               reduceCurrentHp
   #76 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #77 = Utf8               Signature
   #78 = Utf8               Ljava/util/concurrent/Future<*>;
   #79 = Utf8               Code
   #80 = Utf8               LineNumberTable
   #81 = Utf8               LocalVariableTable
   #82 = Utf8               this
   #83 = Utf8               Lext/mods/gameserver/model/actor/instance/SiegeFlag;
   #84 = Utf8               objectId
   #85 = Utf8               I
   #86 = Utf8               template
   #87 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #88 = Utf8               killer
   #89 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #90 = Utf8               StackMapTable
   #91 = Utf8               onInteract
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #93 = Utf8               player
   #94 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #95 = Utf8               siegeSummon
   #96 = Utf8               Lext/mods/gameserver/model/actor/instance/SiegeSummon;
   #97 = Utf8               damage
   #98 = Utf8               D
   #99 = Utf8               attacker
  #100 = Utf8               skill
  #101 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #102 = Utf8               addFuncsToNewCharacter
  #103 = Utf8               canBeHealed
  #104 = Utf8               ()Z
  #105 = Utf8               isLethalable
  #106 = Utf8               setClan
  #107 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #108 = Utf8               clan
  #109 = Utf8               lambda$reduceCurrentHp$0
  #110 = Utf8               SourceFile
  #111 = Utf8               SiegeFlag.java
  #112 = Utf8               BootstrapMethods
  #113 = MethodType         #36           //  ()V
  #114 = MethodHandle       5:#115        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/SiegeFlag.lambda$reduceCurrentHp$0:()V
  #115 = Methodref          #12.#116      // ext/mods/gameserver/model/actor/instance/SiegeFlag.lambda$reduceCurrentHp$0:()V
  #116 = NameAndType        #109:#36      // lambda$reduceCurrentHp$0:()V
  #117 = MethodHandle       6:#118        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #118 = Methodref          #119.#120     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #119 = Class              #121          // java/lang/invoke/LambdaMetafactory
  #120 = NameAndType        #122:#123     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #121 = Utf8               java/lang/invoke/LambdaMetafactory
  #122 = Utf8               metafactory
  #123 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #124 = Utf8               InnerClasses
  #125 = Class              #126          // java/lang/invoke/MethodHandles$Lookup
  #126 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #127 = Class              #128          // java/lang/invoke/MethodHandles
  #128 = Utf8               java/lang/invoke/MethodHandles
  #129 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.SiegeFlag(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 41: 0
        line 42: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #7                  // Method ext/mods/gameserver/model/actor/Npc.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: getfield      #11                 // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
        14: aconst_null
        15: invokevirtual #17                 // Method ext/mods/gameserver/model/pledge/Clan.setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
        18: iconst_1
        19: ireturn
      LineNumberTable:
        line 47: 0
        line 48: 8
        line 50: 10
        line 52: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;
            0      20     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 10 /* same */

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _task:Ljava/util/concurrent/Future;
         4: ifnull        23
         7: aload_0
         8: getfield      #23                 // Field _task:Ljava/util/concurrent/Future;
        11: iconst_0
        12: invokeinterface #27,  2           // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #23                 // Field _task:Ljava/util/concurrent/Future;
        23: aload_0
        24: invokespecial #33                 // Method ext/mods/gameserver/model/actor/Npc.deleteMe:()V
        27: return
      LineNumberTable:
        line 58: 0
        line 60: 7
        line 61: 18
        line 64: 23
        line 65: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=4
         0: aload_3
         1: instanceof    #37                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
         4: ifeq          25
         7: aload_3
         8: checkcast     #37                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
        11: astore        5
        13: aload         5
        15: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/instance/SiegeSummon.getNpcId:()I
        18: sipush        14839
        21: if_icmpne     25
        24: return
        25: aload_0
        26: getfield      #23                 // Field _task:Ljava/util/concurrent/Future;
        29: ifnonnull     68
        32: aload_0
        33: aload_0
        34: invokedynamic #43,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/instance/SiegeFlag;)Ljava/lang/Runnable;
        39: ldc2_w        #47                 // long 30000l
        42: invokestatic  #49                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        45: putfield      #23                 // Field _task:Ljava/util/concurrent/Future;
        48: aload_0
        49: getfield      #11                 // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
        52: iconst_1
        53: anewarray     #55                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        56: dup
        57: iconst_0
        58: getstatic     #57                 // Field ext/mods/gameserver/network/SystemMessageId.BASE_UNDER_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
        61: invokestatic  #63                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        64: aastore
        65: invokevirtual #69                 // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        68: aload_0
        69: dload_1
        70: aload_3
        71: aload         4
        73: invokespecial #73                 // Method ext/mods/gameserver/model/actor/Npc.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        76: return
      LineNumberTable:
        line 75: 0
        line 76: 24
        line 78: 25
        line 80: 32
        line 82: 48
        line 84: 68
        line 85: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      12     5 siegeSummon   Lext/mods/gameserver/model/actor/instance/SiegeSummon;
            0      77     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;
            0      77     1 damage   D
            0      77     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      77     4 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 42 /* same */

  public void addFuncsToNewCharacter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;

  public boolean canBeHealed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;

  public boolean isLethalable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;

  public void setClan(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #11                 // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         5: aload_0
         6: getfield      #11                 // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         9: aload_0
        10: invokevirtual #17                 // Method ext/mods/gameserver/model/pledge/Clan.setFlag:(Lext/mods/gameserver/model/actor/Npc;)V
        13: return
      LineNumberTable:
        line 106: 0
        line 107: 5
        line 108: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/instance/SiegeFlag;
            0      14     1  clan   Lext/mods/gameserver/model/pledge/Clan;
}
SourceFile: "SiegeFlag.java"
BootstrapMethods:
  0: #117 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #113 ()V
      #114 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/SiegeFlag.lambda$reduceCurrentHp$0:()V
      #113 ()V
InnerClasses:
  public static final #129= #125 of #127; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
