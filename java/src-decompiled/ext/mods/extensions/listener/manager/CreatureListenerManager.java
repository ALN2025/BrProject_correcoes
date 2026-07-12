// Bytecode for: ext.mods.extensions.listener.manager.CreatureListenerManager
// File: ext\mods\extensions\listener\manager\CreatureListenerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/CreatureListenerManager.class
  Last modified 9 de jul de 2026; size 5728 bytes
  MD5 checksum e6e6bebba3186aea9498fcb241f8b2c2
  Compiled from "CreatureListenerManager.java"
public class ext.mods.extensions.listener.manager.CreatureListenerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/CreatureListenerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 17, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/CopyOnWriteArrayList
    #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #9 = Methodref          #7.#3         // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/extensions/listener/manager/CreatureListenerManager.reviveListeners:Ljava/util/List;
   #11 = Class              #13           // ext/mods/extensions/listener/manager/CreatureListenerManager
   #12 = NameAndType        #14:#15       // reviveListeners:Ljava/util/List;
   #13 = Utf8               ext/mods/extensions/listener/manager/CreatureListenerManager
   #14 = Utf8               reviveListeners
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/extensions/listener/manager/CreatureListenerManager.moveListeners:Ljava/util/List;
   #17 = NameAndType        #18:#15       // moveListeners:Ljava/util/List;
   #18 = Utf8               moveListeners
   #19 = Fieldref           #11.#20       // ext/mods/extensions/listener/manager/CreatureListenerManager.killListeners:Ljava/util/List;
   #20 = NameAndType        #21:#15       // killListeners:Ljava/util/List;
   #21 = Utf8               killListeners
   #22 = Fieldref           #11.#23       // ext/mods/extensions/listener/manager/CreatureListenerManager.deathListeners:Ljava/util/List;
   #23 = NameAndType        #24:#15       // deathListeners:Ljava/util/List;
   #24 = Utf8               deathListeners
   #25 = Fieldref           #11.#26       // ext/mods/extensions/listener/manager/CreatureListenerManager.hpDamageListeners:Ljava/util/List;
   #26 = NameAndType        #27:#15       // hpDamageListeners:Ljava/util/List;
   #27 = Utf8               hpDamageListeners
   #28 = Fieldref           #11.#29       // ext/mods/extensions/listener/manager/CreatureListenerManager.attackListeners:Ljava/util/List;
   #29 = NameAndType        #30:#15       // attackListeners:Ljava/util/List;
   #30 = Utf8               attackListeners
   #31 = Fieldref           #11.#32       // ext/mods/extensions/listener/manager/CreatureListenerManager.attackHitListeners:Ljava/util/List;
   #32 = NameAndType        #33:#15       // attackHitListeners:Ljava/util/List;
   #33 = Utf8               attackHitListeners
   #34 = Fieldref           #11.#35       // ext/mods/extensions/listener/manager/CreatureListenerManager.INSTANCE:Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #35 = NameAndType        #36:#37       // INSTANCE:Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #36 = Utf8               INSTANCE
   #37 = Utf8               Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #38 = InterfaceMethodref #39.#40       // java/util/List.add:(Ljava/lang/Object;)Z
   #39 = Class              #41           // java/util/List
   #40 = NameAndType        #42:#43       // add:(Ljava/lang/Object;)Z
   #41 = Utf8               java/util/List
   #42 = Utf8               add
   #43 = Utf8               (Ljava/lang/Object;)Z
   #44 = InterfaceMethodref #39.#45       // java/util/List.iterator:()Ljava/util/Iterator;
   #45 = NameAndType        #46:#47       // iterator:()Ljava/util/Iterator;
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
   #58 = Class              #59           // ext/mods/extensions/listener/OnReviveListener
   #59 = Utf8               ext/mods/extensions/listener/OnReviveListener
   #60 = InterfaceMethodref #58.#61       // ext/mods/extensions/listener/OnReviveListener.onRevive:(Lext/mods/gameserver/model/actor/Creature;)V
   #61 = NameAndType        #62:#63       // onRevive:(Lext/mods/gameserver/model/actor/Creature;)V
   #62 = Utf8               onRevive
   #63 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #64 = Class              #65           // ext/mods/extensions/listener/OnMoveListener
   #65 = Utf8               ext/mods/extensions/listener/OnMoveListener
   #66 = InterfaceMethodref #64.#67       // ext/mods/extensions/listener/OnMoveListener.onMove:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #67 = NameAndType        #68:#69       // onMove:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #68 = Utf8               onMove
   #69 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #70 = Class              #71           // ext/mods/extensions/listener/OnKillListener
   #71 = Utf8               ext/mods/extensions/listener/OnKillListener
   #72 = Class              #73           // ext/mods/gameserver/model/actor/Player
   #73 = Utf8               ext/mods/gameserver/model/actor/Player
   #74 = Methodref          #72.#75       // ext/mods/gameserver/model/actor/Player.hasPet:()Z
   #75 = NameAndType        #76:#53       // hasPet:()Z
   #76 = Utf8               hasPet
   #77 = Methodref          #72.#78       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #78 = NameAndType        #79:#80       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #79 = Utf8               getSummon
   #80 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #81 = InterfaceMethodref #70.#82       // ext/mods/extensions/listener/OnKillListener.ignorePetOrSummon:()Z
   #82 = NameAndType        #83:#53       // ignorePetOrSummon:()Z
   #83 = Utf8               ignorePetOrSummon
   #84 = InterfaceMethodref #70.#85       // ext/mods/extensions/listener/OnKillListener.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #85 = NameAndType        #86:#87       // onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #86 = Utf8               onKill
   #87 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #88 = Class              #89           // ext/mods/extensions/listener/OnDeathListener
   #89 = Utf8               ext/mods/extensions/listener/OnDeathListener
   #90 = InterfaceMethodref #88.#91       // ext/mods/extensions/listener/OnDeathListener.onDeath:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #91 = NameAndType        #92:#87       // onDeath:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #92 = Utf8               onDeath
   #93 = Class              #94           // ext/mods/extensions/listener/OnCurrentHpDamageListener
   #94 = Utf8               ext/mods/extensions/listener/OnCurrentHpDamageListener
   #95 = InterfaceMethodref #93.#96       // ext/mods/extensions/listener/OnCurrentHpDamageListener.onCurrentHpDamage:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #96 = NameAndType        #97:#98       // onCurrentHpDamage:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #97 = Utf8               onCurrentHpDamage
   #98 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #99 = Class              #100          // ext/mods/extensions/listener/OnAttackListener
  #100 = Utf8               ext/mods/extensions/listener/OnAttackListener
  #101 = InterfaceMethodref #99.#102      // ext/mods/extensions/listener/OnAttackListener.onAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #102 = NameAndType        #103:#87      // onAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #103 = Utf8               onAttack
  #104 = Class              #105          // ext/mods/extensions/listener/OnAttackHitListener
  #105 = Utf8               ext/mods/extensions/listener/OnAttackHitListener
  #106 = InterfaceMethodref #104.#107     // ext/mods/extensions/listener/OnAttackHitListener.onAttackHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #107 = NameAndType        #108:#87      // onAttackHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #108 = Utf8               onAttackHit
  #109 = Methodref          #11.#3        // ext/mods/extensions/listener/manager/CreatureListenerManager."<init>":()V
  #110 = Utf8               Signature
  #111 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/OnReviveListener;>;
  #112 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/OnMoveListener;>;
  #113 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/OnKillListener;>;
  #114 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/OnDeathListener;>;
  #115 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/OnCurrentHpDamageListener;>;
  #116 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/OnAttackListener;>;
  #117 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/OnAttackHitListener;>;
  #118 = Utf8               Code
  #119 = Utf8               LineNumberTable
  #120 = Utf8               LocalVariableTable
  #121 = Utf8               this
  #122 = Utf8               getInstance
  #123 = Utf8               ()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #124 = Utf8               addReviveListener
  #125 = Utf8               (Lext/mods/extensions/listener/OnReviveListener;)V
  #126 = Utf8               listener
  #127 = Utf8               Lext/mods/extensions/listener/OnReviveListener;
  #128 = Utf8               addMoveListener
  #129 = Utf8               (Lext/mods/extensions/listener/OnMoveListener;)V
  #130 = Utf8               Lext/mods/extensions/listener/OnMoveListener;
  #131 = Utf8               addKillListener
  #132 = Utf8               (Lext/mods/extensions/listener/OnKillListener;)V
  #133 = Utf8               Lext/mods/extensions/listener/OnKillListener;
  #134 = Utf8               addDeathListener
  #135 = Utf8               (Lext/mods/extensions/listener/OnDeathListener;)V
  #136 = Utf8               Lext/mods/extensions/listener/OnDeathListener;
  #137 = Utf8               addHpDamageListener
  #138 = Utf8               (Lext/mods/extensions/listener/OnCurrentHpDamageListener;)V
  #139 = Utf8               Lext/mods/extensions/listener/OnCurrentHpDamageListener;
  #140 = Utf8               addAttackListener
  #141 = Utf8               (Lext/mods/extensions/listener/OnAttackListener;)V
  #142 = Utf8               Lext/mods/extensions/listener/OnAttackListener;
  #143 = Utf8               addAttackHitListener
  #144 = Utf8               (Lext/mods/extensions/listener/OnAttackHitListener;)V
  #145 = Utf8               Lext/mods/extensions/listener/OnAttackHitListener;
  #146 = Utf8               notifyRevive
  #147 = Utf8               creature
  #148 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #149 = Utf8               StackMapTable
  #150 = Utf8               notifyMove
  #151 = Utf8               loc
  #152 = Utf8               Lext/mods/gameserver/model/location/Location;
  #153 = Utf8               notifyKill
  #154 = Utf8               killer
  #155 = Utf8               victim
  #156 = Utf8               notifyDeath
  #157 = Utf8               notifyHpDamage
  #158 = Utf8               damageHp
  #159 = Utf8               D
  #160 = Utf8               target
  #161 = Utf8               skill
  #162 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #163 = Utf8               notifyAttack
  #164 = Utf8               notifyAttackHit
  #165 = Utf8               <clinit>
  #166 = Utf8               SourceFile
  #167 = Utf8               CreatureListenerManager.java
{
  public static ext.mods.extensions.listener.manager.CreatureListenerManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/CreatureListenerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #34                 // Field INSTANCE:Lext/mods/extensions/listener/manager/CreatureListenerManager;
         3: areturn
      LineNumberTable:
        line 53: 0

  public void addReviveListener(ext.mods.extensions.listener.OnReviveListener);
    descriptor: (Lext/mods/extensions/listener/OnReviveListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field reviveListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #38,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 58: 0
        line 59: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/OnReviveListener;

  public void addMoveListener(ext.mods.extensions.listener.OnMoveListener);
    descriptor: (Lext/mods/extensions/listener/OnMoveListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field moveListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #38,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 63: 0
        line 64: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/OnMoveListener;

  public void addKillListener(ext.mods.extensions.listener.OnKillListener);
    descriptor: (Lext/mods/extensions/listener/OnKillListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field killListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #38,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 68: 0
        line 69: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/OnKillListener;

  public void addDeathListener(ext.mods.extensions.listener.OnDeathListener);
    descriptor: (Lext/mods/extensions/listener/OnDeathListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field deathListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #38,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 73: 0
        line 74: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/OnDeathListener;

  public void addHpDamageListener(ext.mods.extensions.listener.OnCurrentHpDamageListener);
    descriptor: (Lext/mods/extensions/listener/OnCurrentHpDamageListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field hpDamageListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #38,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 78: 0
        line 79: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/OnCurrentHpDamageListener;

  public void addAttackListener(ext.mods.extensions.listener.OnAttackListener);
    descriptor: (Lext/mods/extensions/listener/OnAttackListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #28                 // Field attackListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #38,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 83: 0
        line 84: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/OnAttackListener;

  public void addAttackHitListener(ext.mods.extensions.listener.OnAttackHitListener);
    descriptor: (Lext/mods/extensions/listener/OnAttackHitListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #31                 // Field attackHitListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #38,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 88: 0
        line 89: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/OnAttackHitListener;

  public void notifyRevive(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field reviveListeners:Ljava/util/List;
         4: invokeinterface #44,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #58                 // class ext/mods/extensions/listener/OnReviveListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #60,  2           // InterfaceMethod ext/mods/extensions/listener/OnReviveListener.onRevive:(Lext/mods/gameserver/model/actor/Creature;)V
        36: goto          10
        39: return
      LineNumberTable:
        line 94: 0
        line 95: 29
        line 96: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/OnReviveListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      40     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void notifyMove(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #16                 // Field moveListeners:Ljava/util/List;
         4: invokeinterface #44,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #64                 // class ext/mods/extensions/listener/OnMoveListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #66,  3           // InterfaceMethod ext/mods/extensions/listener/OnMoveListener.onMove:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
        39: goto          10
        42: return
      LineNumberTable:
        line 100: 0
        line 101: 30
        line 102: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/OnMoveListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      43     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      43     2   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31

  public void notifyKill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #19                 // Field killListeners:Ljava/util/List;
         4: invokeinterface #44,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          75
        19: aload_3
        20: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #70                 // class ext/mods/extensions/listener/OnKillListener
        28: astore        4
        30: aload_1
        31: checkcast     #72                 // class ext/mods/gameserver/model/actor/Player
        34: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.hasPet:()Z
        37: ifne          50
        40: aload_1
        41: checkcast     #72                 // class ext/mods/gameserver/model/actor/Player
        44: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        47: ifnull        63
        50: aload         4
        52: invokeinterface #81,  1           // InterfaceMethod ext/mods/extensions/listener/OnKillListener.ignorePetOrSummon:()Z
        57: ifeq          63
        60: goto          10
        63: aload         4
        65: aload_1
        66: aload_2
        67: invokeinterface #84,  3           // InterfaceMethod ext/mods/extensions/listener/OnKillListener.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
        72: goto          10
        75: return
      LineNumberTable:
        line 106: 0
        line 109: 30
        line 111: 50
        line 112: 60
        line 114: 63
        line 115: 72
        line 116: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      42     4 listener   Lext/mods/extensions/listener/OnKillListener;
            0      76     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      76     1 killer   Lext/mods/gameserver/model/actor/Creature;
            0      76     2 victim   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/extensions/listener/OnKillListener ]
        frame_type = 12 /* same */
        frame_type = 249 /* chop */
          offset_delta = 11

  public void notifyDeath(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #22                 // Field deathListeners:Ljava/util/List;
         4: invokeinterface #44,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #88                 // class ext/mods/extensions/listener/OnDeathListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #90,  3           // InterfaceMethod ext/mods/extensions/listener/OnDeathListener.onDeath:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
        39: goto          10
        42: return
      LineNumberTable:
        line 120: 0
        line 121: 30
        line 122: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/OnDeathListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      43     1 killer   Lext/mods/gameserver/model/actor/Creature;
            0      43     2 victim   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31

  public void notifyHpDamage(ext.mods.gameserver.model.actor.Creature, double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=5
         0: aload_0
         1: getfield      #25                 // Field hpDamageListeners:Ljava/util/List;
         4: invokeinterface #44,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore        6
        11: aload         6
        13: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          49
        21: aload         6
        23: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #93                 // class ext/mods/extensions/listener/OnCurrentHpDamageListener
        31: astore        7
        33: aload         7
        35: aload_1
        36: dload_2
        37: aload         4
        39: aload         5
        41: invokeinterface #95,  6           // InterfaceMethod ext/mods/extensions/listener/OnCurrentHpDamageListener.onCurrentHpDamage:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        46: goto          11
        49: return
      LineNumberTable:
        line 126: 0
        line 127: 33
        line 128: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      13     7 listener   Lext/mods/extensions/listener/OnCurrentHpDamageListener;
            0      50     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      50     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      50     2 damageHp   D
            0      50     4 target   Lext/mods/gameserver/model/actor/Creature;
            0      50     5 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 37

  public void notifyAttack(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #28                 // Field attackListeners:Ljava/util/List;
         4: invokeinterface #44,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #99                 // class ext/mods/extensions/listener/OnAttackListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #101,  3          // InterfaceMethod ext/mods/extensions/listener/OnAttackListener.onAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
        39: goto          10
        42: return
      LineNumberTable:
        line 132: 0
        line 133: 30
        line 134: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/OnAttackListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      43     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      43     2 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31

  public void notifyAttackHit(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #31                 // Field attackHitListeners:Ljava/util/List;
         4: invokeinterface #44,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #104                // class ext/mods/extensions/listener/OnAttackHitListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #106,  3          // InterfaceMethod ext/mods/extensions/listener/OnAttackHitListener.onAttackHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
        39: goto          10
        42: return
      LineNumberTable:
        line 138: 0
        line 139: 30
        line 140: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/OnAttackHitListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/CreatureListenerManager;
            0      43     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      43     2 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #11                 // class ext/mods/extensions/listener/manager/CreatureListenerManager
         3: dup
         4: invokespecial #109                // Method "<init>":()V
         7: putstatic     #34                 // Field INSTANCE:Lext/mods/extensions/listener/manager/CreatureListenerManager;
        10: return
      LineNumberTable:
        line 37: 0
}
SourceFile: "CreatureListenerManager.java"
