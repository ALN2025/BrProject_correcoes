// Bytecode for: ext.mods.gameserver.model.zone.type.ClanHallZone
// File: ext\mods\gameserver\model\zone\type\ClanHallZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/ClanHallZone.class
  Last modified 9 de jul de 2026; size 3612 bytes
  MD5 checksum f8f77cc19e18e495a94ea1c447f701b0
  Compiled from "ClanHallZone.java"
public class ext.mods.gameserver.model.zone.type.ClanHallZone extends ext.mods.gameserver.model.zone.type.subtype.ResidenceZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/zone/type/ClanHallZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType
  interfaces: 0, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
    #8 = Class              #10           // ext/mods/gameserver/data/manager/ClanHallManager
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #10 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/zone/type/ClanHallZone.getResidenceId:()I
   #14 = Class              #16           // ext/mods/gameserver/model/zone/type/ClanHallZone
   #15 = NameAndType        #17:#18       // getResidenceId:()I
   #16 = Utf8               ext/mods/gameserver/model/zone/type/ClanHallZone
   #17 = Utf8               getResidenceId
   #18 = Utf8               ()I
   #19 = Methodref          #8.#20        // ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #20 = NameAndType        #21:#22       // getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #21 = Utf8               getClanHall
   #22 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #23 = Class              #24           // ext/mods/gameserver/model/actor/Player
   #24 = Utf8               ext/mods/gameserver/model/actor/Player
   #25 = InvokeDynamic      #0:#26        // #0:test:(I)Ljava/util/function/Predicate;
   #26 = NameAndType        #27:#28       // test:(I)Ljava/util/function/Predicate;
   #27 = Utf8               test
   #28 = Utf8               (I)Ljava/util/function/Predicate;
   #29 = Methodref          #14.#30       // ext/mods/gameserver/model/zone/type/ClanHallZone.getKnownTypeInside:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
   #30 = NameAndType        #31:#32       // getKnownTypeInside:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
   #31 = Utf8               getKnownTypeInside
   #32 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
   #33 = InterfaceMethodref #34.#35       // java/util/List.iterator:()Ljava/util/Iterator;
   #34 = Class              #36           // java/util/List
   #35 = NameAndType        #37:#38       // iterator:()Ljava/util/Iterator;
   #36 = Utf8               java/util/List
   #37 = Utf8               iterator
   #38 = Utf8               ()Ljava/util/Iterator;
   #39 = InterfaceMethodref #40.#41       // java/util/Iterator.hasNext:()Z
   #40 = Class              #42           // java/util/Iterator
   #41 = NameAndType        #43:#44       // hasNext:()Z
   #42 = Utf8               java/util/Iterator
   #43 = Utf8               hasNext
   #44 = Utf8               ()Z
   #45 = InterfaceMethodref #40.#46       // java/util/Iterator.next:()Ljava/lang/Object;
   #46 = NameAndType        #47:#48       // next:()Ljava/lang/Object;
   #47 = Utf8               next
   #48 = Utf8               ()Ljava/lang/Object;
   #49 = Fieldref           #50.#51       // ext/mods/gameserver/enums/SpawnType.BANISH:Lext/mods/gameserver/enums/SpawnType;
   #50 = Class              #52           // ext/mods/gameserver/enums/SpawnType
   #51 = NameAndType        #53:#54       // BANISH:Lext/mods/gameserver/enums/SpawnType;
   #52 = Utf8               ext/mods/gameserver/enums/SpawnType
   #53 = Utf8               BANISH
   #54 = Utf8               Lext/mods/gameserver/enums/SpawnType;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/residence/clanhall/ClanHall.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
   #56 = Class              #58           // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #57 = NameAndType        #59:#60       // getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
   #58 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #59 = Utf8               getRndSpawn
   #60 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
   #61 = Methodref          #23.#62       // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #62 = NameAndType        #63:#64       // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #63 = Utf8               teleportTo
   #64 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
   #65 = String             #66           // clanHallId
   #66 = Utf8               clanHallId
   #67 = Methodref          #68.#69       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #68 = Class              #70           // java/lang/String
   #69 = NameAndType        #71:#72       // equals:(Ljava/lang/Object;)Z
   #70 = Utf8               java/lang/String
   #71 = Utf8               equals
   #72 = Utf8               (Ljava/lang/Object;)Z
   #73 = Methodref          #74.#75       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #74 = Class              #76           // java/lang/Integer
   #75 = NameAndType        #77:#78       // parseInt:(Ljava/lang/String;)I
   #76 = Utf8               java/lang/Integer
   #77 = Utf8               parseInt
   #78 = Utf8               (Ljava/lang/String;)I
   #79 = Methodref          #14.#80       // ext/mods/gameserver/model/zone/type/ClanHallZone.setResidenceId:(I)V
   #80 = NameAndType        #81:#6        // setResidenceId:(I)V
   #81 = Utf8               setResidenceId
   #82 = Methodref          #2.#83        // ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #83 = NameAndType        #84:#85       // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #84 = Utf8               setParameter
   #85 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #86 = Fieldref           #87.#88       // ext/mods/gameserver/enums/ZoneId.CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
   #87 = Class              #89           // ext/mods/gameserver/enums/ZoneId
   #88 = NameAndType        #90:#91       // CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
   #89 = Utf8               ext/mods/gameserver/enums/ZoneId
   #90 = Utf8               CLAN_HALL
   #91 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #92 = Methodref          #23.#93       // ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #93 = NameAndType        #94:#95       // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #94 = Utf8               setInsideZone
   #95 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
   #96 = Class              #97           // ext/mods/gameserver/network/serverpackets/ClanHallDecoration
   #97 = Utf8               ext/mods/gameserver/network/serverpackets/ClanHallDecoration
   #98 = Methodref          #96.#99       // ext/mods/gameserver/network/serverpackets/ClanHallDecoration."<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
   #99 = NameAndType        #5:#100       // "<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
  #100 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
  #101 = Methodref          #23.#102      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = NameAndType        #103:#104     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #103 = Utf8               sendPacket
  #104 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #105 = Methodref          #23.#106      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #106 = NameAndType        #107:#18      // getClanId:()I
  #107 = Utf8               getClanId
  #108 = Utf8               Code
  #109 = Utf8               LineNumberTable
  #110 = Utf8               LocalVariableTable
  #111 = Utf8               this
  #112 = Utf8               Lext/mods/gameserver/model/zone/type/ClanHallZone;
  #113 = Utf8               id
  #114 = Utf8               I
  #115 = Utf8               banishForeigners
  #116 = Utf8               player
  #117 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #118 = Utf8               clanId
  #119 = Utf8               ch
  #120 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #121 = Utf8               StackMapTable
  #122 = Utf8               name
  #123 = Utf8               Ljava/lang/String;
  #124 = Utf8               value
  #125 = Utf8               onEnter
  #126 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #127 = Utf8               creature
  #128 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #129 = Utf8               onExit
  #130 = Utf8               lambda$banishForeigners$0
  #131 = Utf8               (ILext/mods/gameserver/model/actor/Player;)Z
  #132 = Utf8               p
  #133 = Utf8               SourceFile
  #134 = Utf8               ClanHallZone.java
  #135 = Utf8               BootstrapMethods
  #136 = MethodType         #72           //  (Ljava/lang/Object;)Z
  #137 = MethodHandle       6:#138        // REF_invokeStatic ext/mods/gameserver/model/zone/type/ClanHallZone.lambda$banishForeigners$0:(ILext/mods/gameserver/model/actor/Player;)Z
  #138 = Methodref          #14.#139      // ext/mods/gameserver/model/zone/type/ClanHallZone.lambda$banishForeigners$0:(ILext/mods/gameserver/model/actor/Player;)Z
  #139 = NameAndType        #130:#131     // lambda$banishForeigners$0:(ILext/mods/gameserver/model/actor/Player;)Z
  #140 = MethodType         #141          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #141 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #142 = MethodHandle       6:#143        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #143 = Methodref          #144.#145     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #144 = Class              #146          // java/lang/invoke/LambdaMetafactory
  #145 = NameAndType        #147:#148     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #146 = Utf8               java/lang/invoke/LambdaMetafactory
  #147 = Utf8               metafactory
  #148 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #149 = Utf8               InnerClasses
  #150 = Class              #151          // java/lang/invoke/MethodHandles$Lookup
  #151 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #152 = Class              #153          // java/lang/invoke/MethodHandles
  #153 = Utf8               java/lang/invoke/MethodHandles
  #154 = Utf8               Lookup
{
  public ext.mods.gameserver.model.zone.type.ClanHallZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 36: 0
        line 37: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/ClanHallZone;
            0       6     1    id   I

  public void banishForeigners(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
         3: aload_0
         4: invokevirtual #13                 // Method getResidenceId:()I
         7: invokevirtual #19                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        10: astore_2
        11: aload_2
        12: ifnonnull     16
        15: return
        16: aload_0
        17: ldc           #23                 // class ext/mods/gameserver/model/actor/Player
        19: iload_1
        20: invokedynamic #25,  0             // InvokeDynamic #0:test:(I)Ljava/util/function/Predicate;
        25: invokevirtual #29                 // Method getKnownTypeInside:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
        28: invokeinterface #33,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        33: astore_3
        34: aload_3
        35: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        40: ifeq          71
        43: aload_3
        44: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        49: checkcast     #23                 // class ext/mods/gameserver/model/actor/Player
        52: astore        4
        54: aload         4
        56: aload_2
        57: getstatic     #49                 // Field ext/mods/gameserver/enums/SpawnType.BANISH:Lext/mods/gameserver/enums/SpawnType;
        60: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
        63: bipush        20
        65: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        68: goto          34
        71: return
      LineNumberTable:
        line 42: 0
        line 43: 11
        line 44: 15
        line 46: 16
        line 47: 54
        line 48: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      14     4 player   Lext/mods/gameserver/model/actor/Player;
            0      72     0  this   Lext/mods/gameserver/model/zone/type/ClanHallZone;
            0      72     1 clanId   I
           11      61     2    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #65                 // String clanHallId
         3: invokevirtual #67                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #73                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: invokevirtual #79                 // Method setResidenceId:(I)V
        17: goto          26
        20: aload_0
        21: aload_1
        22: aload_2
        23: invokespecial #82                 // Method ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
        26: return
      LineNumberTable:
        line 53: 0
        line 54: 9
        line 56: 20
        line 57: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/zone/type/ClanHallZone;
            0      27     1  name   Ljava/lang/String;
            0      27     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 5 /* same */

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=2
         0: aload_1
         1: instanceof    #23                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          48
         7: aload_1
         8: checkcast     #23                 // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #86                 // Field ext/mods/gameserver/enums/ZoneId.CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_1
        17: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
        23: aload_0
        24: invokevirtual #13                 // Method getResidenceId:()I
        27: invokevirtual #19                 // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        30: astore_3
        31: aload_3
        32: ifnonnull     36
        35: return
        36: aload_2
        37: new           #96                 // class ext/mods/gameserver/network/serverpackets/ClanHallDecoration
        40: dup
        41: aload_3
        42: invokespecial #98                 // Method ext/mods/gameserver/network/serverpackets/ClanHallDecoration."<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
        45: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        48: return
      LineNumberTable:
        line 62: 0
        line 64: 12
        line 66: 20
        line 67: 31
        line 68: 35
        line 70: 36
        line 72: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      17     3    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
           12      36     2 player   Lext/mods/gameserver/model/actor/Player;
            0      49     0  this   Lext/mods/gameserver/model/zone/type/ClanHallZone;
            0      49     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 249 /* chop */
          offset_delta = 11

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #23                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          20
         7: aload_1
         8: checkcast     #23                 // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #86                 // Field ext/mods/gameserver/enums/ZoneId.CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_0
        17: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: return
      LineNumberTable:
        line 77: 0
        line 78: 12
        line 79: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       8     2 player   Lext/mods/gameserver/model/actor/Player;
            0      21     0  this   Lext/mods/gameserver/model/zone/type/ClanHallZone;
            0      21     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */
}
SourceFile: "ClanHallZone.java"
BootstrapMethods:
  0: #142 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #136 (Ljava/lang/Object;)Z
      #137 REF_invokeStatic ext/mods/gameserver/model/zone/type/ClanHallZone.lambda$banishForeigners$0:(ILext/mods/gameserver/model/actor/Player;)Z
      #140 (Lext/mods/gameserver/model/actor/Player;)Z
InnerClasses:
  public static final #154= #150 of #152; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
