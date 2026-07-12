// Bytecode for: ext.mods.gameserver.data.manager.DuelManager
// File: ext\mods\gameserver\data\manager\DuelManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/DuelManager.class
  Last modified 9 de jul de 2026; size 3544 bytes
  MD5 checksum 51d2265c4d1a012b2dd115dd74cdec3a
  Compiled from "DuelManager.java"
public final class ext.mods.gameserver.data.manager.DuelManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/DuelManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 9, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/DuelManager._duels:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/DuelManager
   #12 = NameAndType        #14:#15       // _duels:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/DuelManager
   #14 = Utf8               _duels
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #17 = Class              #19           // java/lang/Integer
   #18 = NameAndType        #20:#21       // valueOf:(I)Ljava/lang/Integer;
   #19 = Utf8               java/lang/Integer
   #20 = Utf8               valueOf
   #21 = Utf8               (I)Ljava/lang/Integer;
   #22 = InterfaceMethodref #23.#24       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #23 = Class              #25           // java/util/Map
   #24 = NameAndType        #26:#27       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #25 = Utf8               java/util/Map
   #26 = Utf8               get
   #27 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #28 = Class              #29           // ext/mods/gameserver/model/entity/Duel
   #29 = Utf8               ext/mods/gameserver/model/entity/Duel
   #30 = Methodref          #31.#32       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #31 = Class              #33           // ext/mods/gameserver/idfactory/IdFactory
   #32 = NameAndType        #34:#35       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #33 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #34 = Utf8               getInstance
   #35 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #36 = Methodref          #31.#37       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #37 = NameAndType        #38:#39       // getNextId:()I
   #38 = Utf8               getNextId
   #39 = Utf8               ()I
   #40 = Methodref          #28.#41       // ext/mods/gameserver/model/entity/Duel."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;ZI)V
   #41 = NameAndType        #5:#42        // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;ZI)V
   #42 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;ZI)V
   #43 = InterfaceMethodref #23.#44       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #44 = NameAndType        #45:#46       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #45 = Utf8               put
   #46 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Methodref          #31.#48       // ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
   #48 = NameAndType        #49:#50       // releaseId:(I)V
   #49 = Utf8               releaseId
   #50 = Utf8               (I)V
   #51 = InterfaceMethodref #23.#52       // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #52 = NameAndType        #53:#27       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #53 = Utf8               remove
   #54 = Methodref          #55.#56       // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
   #55 = Class              #57           // ext/mods/gameserver/model/actor/Player
   #56 = NameAndType        #58:#59       // isInDuel:()Z
   #57 = Utf8               ext/mods/gameserver/model/actor/Player
   #58 = Utf8               isInDuel
   #59 = Utf8               ()Z
   #60 = Methodref          #55.#61       // ext/mods/gameserver/model/actor/Player.getDuelId:()I
   #61 = NameAndType        #62:#39       // getDuelId:()I
   #62 = Utf8               getDuelId
   #63 = Methodref          #11.#64       // ext/mods/gameserver/data/manager/DuelManager.getDuel:(I)Lext/mods/gameserver/model/entity/Duel;
   #64 = NameAndType        #65:#66       // getDuel:(I)Lext/mods/gameserver/model/entity/Duel;
   #65 = Utf8               getDuel
   #66 = Utf8               (I)Lext/mods/gameserver/model/entity/Duel;
   #67 = Methodref          #28.#68       // ext/mods/gameserver/model/entity/Duel.doSurrender:(Lext/mods/gameserver/model/actor/Player;)V
   #68 = NameAndType        #69:#70       // doSurrender:(Lext/mods/gameserver/model/actor/Player;)V
   #69 = Utf8               doSurrender
   #70 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #71 = Methodref          #28.#72       // ext/mods/gameserver/model/entity/Duel.onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
   #72 = NameAndType        #73:#70       // onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
   #73 = Utf8               onPlayerDefeat
   #74 = Methodref          #28.#75       // ext/mods/gameserver/model/entity/Duel.onPartyEdit:()V
   #75 = NameAndType        #76:#6        // onPartyEdit:()V
   #76 = Utf8               onPartyEdit
   #77 = Methodref          #28.#78       // ext/mods/gameserver/model/entity/Duel.getPlayerA:()Lext/mods/gameserver/model/actor/Player;
   #78 = NameAndType        #79:#80       // getPlayerA:()Lext/mods/gameserver/model/actor/Player;
   #79 = Utf8               getPlayerA
   #80 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #81 = Methodref          #28.#82       // ext/mods/gameserver/model/entity/Duel.getPlayerB:()Lext/mods/gameserver/model/actor/Player;
   #82 = NameAndType        #83:#80       // getPlayerB:()Lext/mods/gameserver/model/actor/Player;
   #83 = Utf8               getPlayerB
   #84 = Methodref          #28.#85       // ext/mods/gameserver/model/entity/Duel.isPartyDuel:()Z
   #85 = NameAndType        #86:#59       // isPartyDuel:()Z
   #86 = Utf8               isPartyDuel
   #87 = Methodref          #55.#88       // ext/mods/gameserver/model/actor/Player.isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
   #88 = NameAndType        #89:#90       // isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
   #89 = Utf8               isInSameParty
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #91 = Class              #92           // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #92 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #93 = Methodref          #28.#94       // ext/mods/gameserver/model/entity/Duel.broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #94 = NameAndType        #95:#96       // broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #95 = Utf8               broadcastTo
   #96 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #97 = Fieldref           #98.#99       // ext/mods/gameserver/data/manager/DuelManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/DuelManager;
   #98 = Class              #100          // ext/mods/gameserver/data/manager/DuelManager$SingletonHolder
   #99 = NameAndType        #101:#102     // INSTANCE:Lext/mods/gameserver/data/manager/DuelManager;
  #100 = Utf8               ext/mods/gameserver/data/manager/DuelManager$SingletonHolder
  #101 = Utf8               INSTANCE
  #102 = Utf8               Lext/mods/gameserver/data/manager/DuelManager;
  #103 = Utf8               Signature
  #104 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/entity/Duel;>;
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               LocalVariableTable
  #108 = Utf8               this
  #109 = Utf8               duelId
  #110 = Utf8               I
  #111 = Utf8               addDuel
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
  #113 = Utf8               playerA
  #114 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #115 = Utf8               playerB
  #116 = Utf8               Z
  #117 = Utf8               StackMapTable
  #118 = Utf8               removeDuel
  #119 = Utf8               player
  #120 = Utf8               duel
  #121 = Utf8               Lext/mods/gameserver/model/entity/Duel;
  #122 = Utf8               broadcastToOppositeTeam
  #123 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #124 = Utf8               packet
  #125 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #126 = Utf8               ()Lext/mods/gameserver/data/manager/DuelManager;
  #127 = Utf8               SourceFile
  #128 = Utf8               DuelManager.java
  #129 = Utf8               NestMembers
  #130 = Utf8               InnerClasses
  #131 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.data.manager.DuelManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _duels:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 36: 0
        line 33: 4
        line 37: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/manager/DuelManager;

  public ext.mods.gameserver.model.entity.Duel getDuel(int);
    descriptor: (I)Lext/mods/gameserver/model/entity/Duel;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _duels:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #22,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #28                 // class ext/mods/gameserver/model/entity/Duel
        16: areturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/DuelManager;
            0      17     1 duelId   I

  public void addDuel(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=5, args_size=4
         0: aload_1
         1: ifnull        8
         4: aload_2
         5: ifnonnull     9
         8: return
         9: invokestatic  #30                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        12: invokevirtual #36                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        15: istore        4
        17: aload_0
        18: getfield      #10                 // Field _duels:Ljava/util/Map;
        21: iload         4
        23: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        26: new           #28                 // class ext/mods/gameserver/model/entity/Duel
        29: dup
        30: aload_1
        31: aload_2
        32: iload_3
        33: iload         4
        35: invokespecial #40                 // Method ext/mods/gameserver/model/entity/Duel."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;ZI)V
        38: invokeinterface #43,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        43: pop
        44: return
      LineNumberTable:
        line 52: 0
        line 53: 8
        line 55: 9
        line 57: 17
        line 58: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/data/manager/DuelManager;
            0      45     1 playerA   Lext/mods/gameserver/model/actor/Player;
            0      45     2 playerB   Lext/mods/gameserver/model/actor/Player;
            0      45     3 isPartyDuel   Z
           17      28     4 duelId   I
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 0 /* same */

  public void removeDuel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: invokestatic  #30                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
         3: iload_1
         4: invokevirtual #47                 // Method ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
         7: aload_0
         8: getfield      #10                 // Field _duels:Ljava/util/Map;
        11: iload_1
        12: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #51,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        20: pop
        21: return
      LineNumberTable:
        line 66: 0
        line 68: 7
        line 69: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/data/manager/DuelManager;
            0      22     1 duelId   I

  public void doSurrender(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
         8: ifne          12
        11: return
        12: aload_0
        13: aload_1
        14: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
        17: invokevirtual #63                 // Method getDuel:(I)Lext/mods/gameserver/model/entity/Duel;
        20: astore_2
        21: aload_2
        22: ifnull        30
        25: aload_2
        26: aload_1
        27: invokevirtual #67                 // Method ext/mods/gameserver/model/entity/Duel.doSurrender:(Lext/mods/gameserver/model/actor/Player;)V
        30: return
      LineNumberTable:
        line 77: 0
        line 78: 11
        line 80: 12
        line 81: 21
        line 82: 25
        line 83: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/DuelManager;
            0      31     1 player   Lext/mods/gameserver/model/actor/Player;
           21      10     2  duel   Lext/mods/gameserver/model/entity/Duel;
      StackMapTable: number_of_entries = 3
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/entity/Duel ]

  public void onPlayerDefeat(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
         8: ifne          12
        11: return
        12: aload_0
        13: aload_1
        14: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
        17: invokevirtual #63                 // Method getDuel:(I)Lext/mods/gameserver/model/entity/Duel;
        20: astore_2
        21: aload_2
        22: ifnull        30
        25: aload_2
        26: aload_1
        27: invokevirtual #71                 // Method ext/mods/gameserver/model/entity/Duel.onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
        30: return
      LineNumberTable:
        line 91: 0
        line 92: 11
        line 94: 12
        line 95: 21
        line 96: 25
        line 97: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/DuelManager;
            0      31     1 player   Lext/mods/gameserver/model/actor/Player;
           21      10     2  duel   Lext/mods/gameserver/model/entity/Duel;
      StackMapTable: number_of_entries = 3
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/entity/Duel ]

  public void onPartyEdit(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
         8: ifne          12
        11: return
        12: aload_0
        13: aload_1
        14: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
        17: invokevirtual #63                 // Method getDuel:(I)Lext/mods/gameserver/model/entity/Duel;
        20: astore_2
        21: aload_2
        22: ifnull        29
        25: aload_2
        26: invokevirtual #74                 // Method ext/mods/gameserver/model/entity/Duel.onPartyEdit:()V
        29: return
      LineNumberTable:
        line 105: 0
        line 106: 11
        line 108: 12
        line 109: 21
        line 110: 25
        line 111: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/data/manager/DuelManager;
            0      30     1 player   Lext/mods/gameserver/model/actor/Player;
           21       9     2  duel   Lext/mods/gameserver/model/entity/Duel;
      StackMapTable: number_of_entries = 3
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/Duel ]

  public void broadcastToOppositeTeam(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=3
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
         8: ifne          12
        11: return
        12: aload_0
        13: aload_1
        14: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
        17: invokevirtual #63                 // Method getDuel:(I)Lext/mods/gameserver/model/entity/Duel;
        20: astore_3
        21: aload_3
        22: ifnonnull     26
        25: return
        26: aload_3
        27: invokevirtual #77                 // Method ext/mods/gameserver/model/entity/Duel.getPlayerA:()Lext/mods/gameserver/model/actor/Player;
        30: astore        4
        32: aload_3
        33: invokevirtual #81                 // Method ext/mods/gameserver/model/entity/Duel.getPlayerB:()Lext/mods/gameserver/model/actor/Player;
        36: astore        5
        38: aload         4
        40: aload_1
        41: if_acmpeq     60
        44: aload_3
        45: invokevirtual #84                 // Method ext/mods/gameserver/model/entity/Duel.isPartyDuel:()Z
        48: ifeq          77
        51: aload         4
        53: aload_1
        54: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
        57: ifeq          77
        60: aload_3
        61: aload         5
        63: iconst_1
        64: anewarray     #91                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        67: dup
        68: iconst_0
        69: aload_2
        70: aastore
        71: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/Duel.broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        74: goto          113
        77: aload         5
        79: aload_1
        80: if_acmpeq     99
        83: aload_3
        84: invokevirtual #84                 // Method ext/mods/gameserver/model/entity/Duel.isPartyDuel:()Z
        87: ifeq          113
        90: aload         5
        92: aload_1
        93: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
        96: ifeq          113
        99: aload_3
       100: aload         4
       102: iconst_1
       103: anewarray     #91                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       106: dup
       107: iconst_0
       108: aload_2
       109: aastore
       110: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/Duel.broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: return
      LineNumberTable:
        line 120: 0
        line 121: 11
        line 123: 12
        line 124: 21
        line 125: 25
        line 127: 26
        line 128: 32
        line 130: 38
        line 131: 60
        line 132: 77
        line 133: 99
        line 134: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/data/manager/DuelManager;
            0     114     1 player   Lext/mods/gameserver/model/actor/Player;
            0     114     2 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
           21      93     3  duel   Lext/mods/gameserver/model/entity/Duel;
           32      82     4 playerA   Lext/mods/gameserver/model/actor/Player;
           38      76     5 playerB   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 7
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/Duel ]
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 16 /* same */
        frame_type = 21 /* same */
        frame_type = 13 /* same */

  public static final ext.mods.gameserver.data.manager.DuelManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/DuelManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #97                 // Field ext/mods/gameserver/data/manager/DuelManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/DuelManager;
         3: areturn
      LineNumberTable:
        line 138: 0
}
SourceFile: "DuelManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/DuelManager$SingletonHolder
