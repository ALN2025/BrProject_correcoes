// Bytecode for: ext.mods.gameserver.model.zone.type.DamageZone
// File: ext\mods\gameserver\model\zone\type\DamageZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/DamageZone.class
  Last modified 9 de jul de 2026; size 5225 bytes
  MD5 checksum 30535eb7f9d9f80e83e1e9eae57c07b9
  Compiled from "DamageZone.java"
public class ext.mods.gameserver.model.zone.type.DamageZone extends ext.mods.gameserver.model.zone.type.subtype.CastleZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/DamageZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
  interfaces: 0, fields: 4, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/zone/type/DamageZone._hpDamage:I
    #8 = Class              #10           // ext/mods/gameserver/model/zone/type/DamageZone
    #9 = NameAndType        #11:#12       // _hpDamage:I
   #10 = Utf8               ext/mods/gameserver/model/zone/type/DamageZone
   #11 = Utf8               _hpDamage
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/zone/type/DamageZone._initialDelay:I
   #14 = NameAndType        #15:#12       // _initialDelay:I
   #15 = Utf8               _initialDelay
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/zone/type/DamageZone._reuseDelay:I
   #17 = NameAndType        #18:#12       // _reuseDelay:I
   #18 = Utf8               _reuseDelay
   #19 = String             #20           // hpDamage
   #20 = Utf8               hpDamage
   #21 = Methodref          #22.#23       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #22 = Class              #24           // java/lang/String
   #23 = NameAndType        #25:#26       // equals:(Ljava/lang/Object;)Z
   #24 = Utf8               java/lang/String
   #25 = Utf8               equals
   #26 = Utf8               (Ljava/lang/Object;)Z
   #27 = Methodref          #28.#29       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #28 = Class              #30           // java/lang/Integer
   #29 = NameAndType        #31:#32       // parseInt:(Ljava/lang/String;)I
   #30 = Utf8               java/lang/Integer
   #31 = Utf8               parseInt
   #32 = Utf8               (Ljava/lang/String;)I
   #33 = String             #34           // initialDelay
   #34 = Utf8               initialDelay
   #35 = Methodref          #22.#36       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #36 = NameAndType        #37:#38       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #37 = Utf8               equalsIgnoreCase
   #38 = Utf8               (Ljava/lang/String;)Z
   #39 = String             #40           // reuseDelay
   #40 = Utf8               reuseDelay
   #41 = Methodref          #2.#42        // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #42 = NameAndType        #43:#44       // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #43 = Utf8               setParameter
   #44 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #45 = Class              #46           // ext/mods/gameserver/model/actor/Playable
   #46 = Utf8               ext/mods/gameserver/model/actor/Playable
   #47 = Methodref          #8.#48        // ext/mods/gameserver/model/zone/type/DamageZone.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #48 = NameAndType        #49:#50       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #49 = Utf8               getCastle
   #50 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #51 = Methodref          #8.#52        // ext/mods/gameserver/model/zone/type/DamageZone.isEnabled:()Z
   #52 = NameAndType        #53:#54       // isEnabled:()Z
   #53 = Utf8               isEnabled
   #54 = Utf8               ()Z
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #56 = Class              #58           // ext/mods/gameserver/model/residence/castle/Castle
   #57 = NameAndType        #59:#60       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #58 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #59 = Utf8               getSiege
   #60 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #61 = Methodref          #62.#63       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #62 = Class              #64           // ext/mods/gameserver/model/residence/castle/Siege
   #63 = NameAndType        #65:#54       // isInProgress:()Z
   #64 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #65 = Utf8               isInProgress
   #66 = Fieldref           #8.#67        // ext/mods/gameserver/model/zone/type/DamageZone._task:Ljava/util/concurrent/Future;
   #67 = NameAndType        #68:#69       // _task:Ljava/util/concurrent/Future;
   #68 = Utf8               _task
   #69 = Utf8               Ljava/util/concurrent/Future;
   #70 = InvokeDynamic      #0:#71        // #0:run:(Lext/mods/gameserver/model/zone/type/DamageZone;)Ljava/lang/Runnable;
   #71 = NameAndType        #72:#73       // run:(Lext/mods/gameserver/model/zone/type/DamageZone;)Ljava/lang/Runnable;
   #72 = Utf8               run
   #73 = Utf8               (Lext/mods/gameserver/model/zone/type/DamageZone;)Ljava/lang/Runnable;
   #74 = Methodref          #75.#76       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #75 = Class              #77           // ext/mods/commons/pool/ThreadPool
   #76 = NameAndType        #78:#79       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #77 = Utf8               ext/mods/commons/pool/ThreadPool
   #78 = Utf8               scheduleAtFixedRate
   #79 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #80 = Fieldref           #81.#82       // ext/mods/gameserver/network/SystemMessageId.A_TRAP_DEVICE_HAS_BEEN_TRIPPED:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Class              #83           // ext/mods/gameserver/network/SystemMessageId
   #82 = NameAndType        #84:#85       // A_TRAP_DEVICE_HAS_BEEN_TRIPPED:Lext/mods/gameserver/network/SystemMessageId;
   #83 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #84 = Utf8               A_TRAP_DEVICE_HAS_BEEN_TRIPPED
   #85 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #86 = Class              #87           // ext/mods/gameserver/enums/SiegeSide
   #87 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #88 = Fieldref           #86.#89       // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #89 = NameAndType        #90:#91       // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #90 = Utf8               DEFENDER
   #91 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #92 = Methodref          #62.#93       // ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #93 = NameAndType        #94:#95       // announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #94 = Utf8               announce
   #95 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #96 = Class              #97           // ext/mods/gameserver/model/actor/Player
   #97 = Utf8               ext/mods/gameserver/model/actor/Player
   #98 = Fieldref           #99.#100      // ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
   #99 = Class              #101          // ext/mods/gameserver/enums/ZoneId
  #100 = NameAndType        #102:#103     // DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
  #101 = Utf8               ext/mods/gameserver/enums/ZoneId
  #102 = Utf8               DANGER_AREA
  #103 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #104 = Methodref          #96.#105      // ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #105 = NameAndType        #106:#107     // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #106 = Utf8               setInsideZone
  #107 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #108 = Class              #109          // ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
  #109 = Utf8               ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
  #110 = Methodref          #108.#111     // ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #111 = NameAndType        #5:#112       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #113 = Methodref          #96.#114      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #114 = NameAndType        #115:#116     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #115 = Utf8               sendPacket
  #116 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #117 = Methodref          #96.#118      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #118 = NameAndType        #119:#120     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #119 = Utf8               isInsideZone
  #120 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #121 = InterfaceMethodref #122.#123     // java/util/concurrent/Future.cancel:(Z)Z
  #122 = Class              #124          // java/util/concurrent/Future
  #123 = NameAndType        #125:#126     // cancel:(Z)Z
  #124 = Utf8               java/util/concurrent/Future
  #125 = Utf8               cancel
  #126 = Utf8               (Z)Z
  #127 = Fieldref           #8.#128       // ext/mods/gameserver/model/zone/type/DamageZone._creatures:Ljava/util/Set;
  #128 = NameAndType        #129:#130     // _creatures:Ljava/util/Set;
  #129 = Utf8               _creatures
  #130 = Utf8               Ljava/util/Set;
  #131 = InterfaceMethodref #132.#133     // java/util/Set.isEmpty:()Z
  #132 = Class              #134          // java/util/Set
  #133 = NameAndType        #135:#54      // isEmpty:()Z
  #134 = Utf8               java/util/Set
  #135 = Utf8               isEmpty
  #136 = Methodref          #8.#137       // ext/mods/gameserver/model/zone/type/DamageZone.stopTask:()V
  #137 = NameAndType        #138:#139     // stopTask:()V
  #138 = Utf8               stopTask
  #139 = Utf8               ()V
  #140 = InterfaceMethodref #132.#141     // java/util/Set.iterator:()Ljava/util/Iterator;
  #141 = NameAndType        #142:#143     // iterator:()Ljava/util/Iterator;
  #142 = Utf8               iterator
  #143 = Utf8               ()Ljava/util/Iterator;
  #144 = InterfaceMethodref #145.#146     // java/util/Iterator.hasNext:()Z
  #145 = Class              #147          // java/util/Iterator
  #146 = NameAndType        #148:#54      // hasNext:()Z
  #147 = Utf8               java/util/Iterator
  #148 = Utf8               hasNext
  #149 = InterfaceMethodref #145.#150     // java/util/Iterator.next:()Ljava/lang/Object;
  #150 = NameAndType        #151:#152     // next:()Ljava/lang/Object;
  #151 = Utf8               next
  #152 = Utf8               ()Ljava/lang/Object;
  #153 = Class              #154          // ext/mods/gameserver/model/actor/Creature
  #154 = Utf8               ext/mods/gameserver/model/actor/Creature
  #155 = Methodref          #153.#156     // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #156 = NameAndType        #157:#54      // isDead:()Z
  #157 = Utf8               isDead
  #158 = Methodref          #153.#159     // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #159 = NameAndType        #160:#161     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #160 = Utf8               getStatus
  #161 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #162 = Fieldref           #163.#164     // ext/mods/gameserver/enums/skills/Stats.DAMAGE_ZONE_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #163 = Class              #165          // ext/mods/gameserver/enums/skills/Stats
  #164 = NameAndType        #166:#167     // DAMAGE_ZONE_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #165 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #166 = Utf8               DAMAGE_ZONE_VULN
  #167 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #168 = Methodref          #169.#170     // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #169 = Class              #171          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #170 = NameAndType        #172:#173     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #171 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #172 = Utf8               calcStat
  #173 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #174 = Double             100.0d
  #176 = Methodref          #153.#177     // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #177 = NameAndType        #178:#179     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #178 = Utf8               reduceCurrentHp
  #179 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #180 = Utf8               Signature
  #181 = Utf8               Ljava/util/concurrent/Future<*>;
  #182 = Utf8               Code
  #183 = Utf8               LineNumberTable
  #184 = Utf8               LocalVariableTable
  #185 = Utf8               this
  #186 = Utf8               Lext/mods/gameserver/model/zone/type/DamageZone;
  #187 = Utf8               id
  #188 = Utf8               name
  #189 = Utf8               Ljava/lang/String;
  #190 = Utf8               value
  #191 = Utf8               StackMapTable
  #192 = Utf8               isAffected
  #193 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #194 = Utf8               creature
  #195 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #196 = Utf8               onEnter
  #197 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #198 = Utf8               task
  #199 = Utf8               player
  #200 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #201 = Utf8               LocalVariableTypeTable
  #202 = Class              #203          // java/lang/Object
  #203 = Utf8               java/lang/Object
  #204 = Class              #205          // java/lang/Throwable
  #205 = Utf8               java/lang/Throwable
  #206 = Utf8               onExit
  #207 = Utf8               lambda$onEnter$0
  #208 = Utf8               temp
  #209 = Utf8               i$
  #210 = Utf8               Ljava/util/Iterator;
  #211 = Utf8               SourceFile
  #212 = Utf8               DamageZone.java
  #213 = Utf8               BootstrapMethods
  #214 = MethodType         #139          //  ()V
  #215 = MethodHandle       5:#216        // REF_invokeVirtual ext/mods/gameserver/model/zone/type/DamageZone.lambda$onEnter$0:()V
  #216 = Methodref          #8.#217       // ext/mods/gameserver/model/zone/type/DamageZone.lambda$onEnter$0:()V
  #217 = NameAndType        #207:#139     // lambda$onEnter$0:()V
  #218 = MethodHandle       6:#219        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #219 = Methodref          #220.#221     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #220 = Class              #222          // java/lang/invoke/LambdaMetafactory
  #221 = NameAndType        #223:#224     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #222 = Utf8               java/lang/invoke/LambdaMetafactory
  #223 = Utf8               metafactory
  #224 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #225 = Utf8               InnerClasses
  #226 = Class              #227          // java/lang/invoke/MethodHandles$Lookup
  #227 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #228 = Class              #229          // java/lang/invoke/MethodHandles
  #229 = Utf8               java/lang/invoke/MethodHandles
  #230 = Utf8               Lookup
{
  public ext.mods.gameserver.model.zone.type.DamageZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/CastleZoneType."<init>":(I)V
         5: aload_0
         6: sipush        200
         9: putfield      #7                  // Field _hpDamage:I
        12: aload_0
        13: sipush        1000
        16: putfield      #13                 // Field _initialDelay:I
        19: aload_0
        20: sipush        5000
        23: putfield      #16                 // Field _reuseDelay:I
        26: return
      LineNumberTable:
        line 49: 0
        line 43: 5
        line 44: 12
        line 45: 19
        line 50: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/zone/type/DamageZone;
            0      27     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #19                 // String hpDamage
         3: invokevirtual #21                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #27                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: putfield      #7                  // Field _hpDamage:I
        17: goto          66
        20: aload_1
        21: ldc           #33                 // String initialDelay
        23: invokevirtual #35                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        26: ifeq          40
        29: aload_0
        30: aload_2
        31: invokestatic  #27                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        34: putfield      #13                 // Field _initialDelay:I
        37: goto          66
        40: aload_1
        41: ldc           #39                 // String reuseDelay
        43: invokevirtual #35                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        46: ifeq          60
        49: aload_0
        50: aload_2
        51: invokestatic  #27                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        54: putfield      #16                 // Field _reuseDelay:I
        57: goto          66
        60: aload_0
        61: aload_1
        62: aload_2
        63: invokespecial #41                 // Method ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
        66: return
      LineNumberTable:
        line 55: 0
        line 56: 9
        line 57: 20
        line 58: 29
        line 59: 40
        line 60: 49
        line 62: 60
        line 63: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/zone/type/DamageZone;
            0      67     1  name   Ljava/lang/String;
            0      67     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 20 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 5 /* same */

  protected boolean isAffected(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: instanceof    #45                 // class ext/mods/gameserver/model/actor/Playable
         4: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/DamageZone;
            0       5     1 creature   Lext/mods/gameserver/model/actor/Creature;

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=5, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _hpDamage:I
         4: ifle          124
         7: aload_0
         8: invokevirtual #47                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        11: ifnull        35
        14: aload_0
        15: invokevirtual #51                 // Method isEnabled:()Z
        18: ifeq          34
        21: aload_0
        22: invokevirtual #47                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        25: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        28: invokevirtual #61                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        31: ifne          35
        34: return
        35: aload_0
        36: getfield      #66                 // Field _task:Ljava/util/concurrent/Future;
        39: astore_2
        40: aload_2
        41: ifnonnull     124
        44: aload_0
        45: dup
        46: astore_3
        47: monitorenter
        48: aload_0
        49: getfield      #66                 // Field _task:Ljava/util/concurrent/Future;
        52: astore_2
        53: aload_2
        54: ifnonnull     82
        57: aload_0
        58: aload_0
        59: invokedynamic #70,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/zone/type/DamageZone;)Ljava/lang/Runnable;
        64: aload_0
        65: getfield      #13                 // Field _initialDelay:I
        68: i2l
        69: aload_0
        70: getfield      #16                 // Field _reuseDelay:I
        73: i2l
        74: invokestatic  #74                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        77: dup
        78: astore_2
        79: putfield      #66                 // Field _task:Ljava/util/concurrent/Future;
        82: aload_0
        83: invokevirtual #47                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        86: ifnull        112
        89: aload_0
        90: invokevirtual #47                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        93: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        96: getstatic     #80                 // Field ext/mods/gameserver/network/SystemMessageId.A_TRAP_DEVICE_HAS_BEEN_TRIPPED:Lext/mods/gameserver/network/SystemMessageId;
        99: iconst_1
       100: anewarray     #86                 // class ext/mods/gameserver/enums/SiegeSide
       103: dup
       104: iconst_0
       105: getstatic     #88                 // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       108: aastore
       109: invokevirtual #92                 // Method ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
       112: aload_3
       113: monitorexit
       114: goto          124
       117: astore        4
       119: aload_3
       120: monitorexit
       121: aload         4
       123: athrow
       124: aload_1
       125: instanceof    #96                 // class ext/mods/gameserver/model/actor/Player
       128: ifeq          156
       131: aload_1
       132: checkcast     #96                 // class ext/mods/gameserver/model/actor/Player
       135: astore_2
       136: aload_2
       137: getstatic     #98                 // Field ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
       140: iconst_1
       141: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
       144: aload_2
       145: new           #108                // class ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
       148: dup
       149: aload_2
       150: invokespecial #110                // Method ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       153: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       156: return
      Exception table:
         from    to  target type
            48   114   117   any
           117   121   117   any
      LineNumberTable:
        line 74: 0
        line 76: 7
        line 77: 34
        line 79: 35
        line 80: 40
        line 82: 44
        line 84: 48
        line 85: 53
        line 86: 57
        line 101: 82
        line 102: 89
        line 103: 112
        line 107: 124
        line 109: 136
        line 110: 144
        line 112: 156
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      84     2  task   Ljava/util/concurrent/Future;
          136      20     2 player   Lext/mods/gameserver/model/actor/Player;
            0     157     0  this   Lext/mods/gameserver/model/zone/type/DamageZone;
            0     157     1 creature   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           40      84     2  task   Ljava/util/concurrent/Future<*>;
      StackMapTable: number_of_entries = 7
        frame_type = 34 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 46
          locals = [ class java/util/concurrent/Future, class java/lang/Object ]
        frame_type = 29 /* same */
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 249 /* chop */
          offset_delta = 6
        frame_type = 31 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: instanceof    #96                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          42
         7: aload_1
         8: checkcast     #96                 // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #98                 // Field ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_0
        17: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_2
        21: getstatic     #98                 // Field ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
        24: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        27: ifne          42
        30: aload_2
        31: new           #108                // class ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
        34: dup
        35: aload_2
        36: invokespecial #110                // Method ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        39: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        42: return
      LineNumberTable:
        line 117: 0
        line 119: 12
        line 121: 20
        line 122: 30
        line 124: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      30     2 player   Lext/mods/gameserver/model/actor/Player;
            0      43     0  this   Lext/mods/gameserver/model/zone/type/DamageZone;
            0      43     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 42 /* same */
}
SourceFile: "DamageZone.java"
BootstrapMethods:
  0: #218 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #214 ()V
      #215 REF_invokeVirtual ext/mods/gameserver/model/zone/type/DamageZone.lambda$onEnter$0:()V
      #214 ()V
InnerClasses:
  public static final #230= #226 of #228; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
