// Bytecode for: ext.mods.gameserver.model.zone.type.subtype.CastleZoneType
// File: ext\mods\gameserver\model\zone\type\subtype\CastleZoneType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.class
  Last modified 9 de jul de 2026; size 3927 bytes
  MD5 checksum eca44d383d64138985bf559fff5e03c9
  Compiled from "CastleZoneType.java"
public abstract class ext.mods.gameserver.model.zone.type.subtype.CastleZoneType extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #22                         // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 4, methods: 10, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = String             #8            // castleId
    #8 = Utf8               castleId
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = Methodref          #16.#17       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #16 = Class              #18           // java/lang/Integer
   #17 = NameAndType        #19:#20       // parseInt:(Ljava/lang/String;)I
   #18 = Utf8               java/lang/Integer
   #19 = Utf8               parseInt
   #20 = Utf8               (Ljava/lang/String;)I
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType._castleId:I
   #22 = Class              #24           // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
   #23 = NameAndType        #25:#26       // _castleId:I
   #24 = Utf8               ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
   #25 = Utf8               _castleId
   #26 = Utf8               I
   #27 = String             #28           // eventId
   #28 = Utf8               eventId
   #29 = Fieldref           #22.#30       // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType._eventId:I
   #30 = NameAndType        #31:#26       // _eventId:I
   #31 = Utf8               _eventId
   #32 = Methodref          #2.#33        // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #33 = NameAndType        #34:#35       // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #34 = Utf8               setParameter
   #35 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #36 = Fieldref           #22.#37       // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType._enabled:Z
   #37 = NameAndType        #38:#39       // _enabled:Z
   #38 = Utf8               _enabled
   #39 = Utf8               Z
   #40 = Class              #41           // ext/mods/gameserver/model/actor/Player
   #41 = Utf8               ext/mods/gameserver/model/actor/Player
   #42 = Class              #43           // ext/mods/gameserver/network/serverpackets/EventTrigger
   #43 = Utf8               ext/mods/gameserver/network/serverpackets/EventTrigger
   #44 = Methodref          #22.#45       // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.getEventId:()I
   #45 = NameAndType        #46:#47       // getEventId:()I
   #46 = Utf8               getEventId
   #47 = Utf8               ()I
   #48 = Methodref          #42.#49       // ext/mods/gameserver/network/serverpackets/EventTrigger."<init>":(IZ)V
   #49 = NameAndType        #5:#50        // "<init>":(IZ)V
   #50 = Utf8               (IZ)V
   #51 = Methodref          #40.#52       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = NameAndType        #53:#54       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Utf8               sendPacket
   #54 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = Fieldref           #22.#56       // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType._castle:Lext/mods/gameserver/model/residence/castle/Castle;
   #56 = NameAndType        #57:#58       // _castle:Lext/mods/gameserver/model/residence/castle/Castle;
   #57 = Utf8               _castle
   #58 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
   #59 = Methodref          #60.#61       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #60 = Class              #62           // ext/mods/gameserver/data/manager/CastleManager
   #61 = NameAndType        #63:#64       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #62 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #63 = Utf8               getInstance
   #64 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #65 = Methodref          #60.#66       // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #66 = NameAndType        #67:#68       // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #67 = Utf8               getCastleById
   #68 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #70 = Class              #72           // ext/mods/gameserver/model/World
   #71 = NameAndType        #63:#73       // getInstance:()Lext/mods/gameserver/model/World;
   #72 = Utf8               ext/mods/gameserver/model/World
   #73 = Utf8               ()Lext/mods/gameserver/model/World;
   #74 = Methodref          #70.#75       // ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Lext/mods/gameserver/model/WorldRegion;
   #75 = NameAndType        #76:#77       // getRegion:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Lext/mods/gameserver/model/WorldRegion;
   #76 = Utf8               getRegion
   #77 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Lext/mods/gameserver/model/WorldRegion;
   #78 = InvokeDynamic      #0:#79        // #0:accept:(Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;Z)Ljava/util/function/Consumer;
   #79 = NameAndType        #80:#81       // accept:(Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;Z)Ljava/util/function/Consumer;
   #80 = Utf8               accept
   #81 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;Z)Ljava/util/function/Consumer;
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/WorldRegion.forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
   #83 = Class              #85           // ext/mods/gameserver/model/WorldRegion
   #84 = NameAndType        #86:#87       // forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
   #85 = Utf8               ext/mods/gameserver/model/WorldRegion
   #86 = Utf8               forEachSurroundingRegion
   #87 = Utf8               (Ljava/util/function/Consumer;)V
   #88 = InvokeDynamic      #1:#79        // #1:accept:(Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;Z)Ljava/util/function/Consumer;
   #89 = Methodref          #83.#90       // ext/mods/gameserver/model/WorldRegion.forEachType:(Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Consumer;)V
   #90 = NameAndType        #91:#92       // forEachType:(Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Consumer;)V
   #91 = Utf8               forEachType
   #92 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/WorldObject;Ljava/util/function/Consumer;)V
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               LocalVariableTable
   #96 = Utf8               this
   #97 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
   #98 = Utf8               id
   #99 = Utf8               name
  #100 = Utf8               Ljava/lang/String;
  #101 = Utf8               value
  #102 = Utf8               StackMapTable
  #103 = Utf8               addKnownObject
  #104 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #105 = Utf8               player
  #106 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #107 = Utf8               object
  #108 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #109 = Utf8               removeKnownObject
  #110 = Utf8               getCastle
  #111 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #112 = Utf8               isEnabled
  #113 = Utf8               ()Z
  #114 = Utf8               setEnabled
  #115 = Utf8               (Z)V
  #116 = Utf8               region
  #117 = Utf8               Lext/mods/gameserver/model/WorldRegion;
  #118 = Utf8               val
  #119 = Utf8               lambda$setEnabled$0
  #120 = Utf8               (ZLext/mods/gameserver/model/WorldRegion;)V
  #121 = Utf8               r
  #122 = Utf8               lambda$setEnabled$1
  #123 = Utf8               (ZLext/mods/gameserver/model/actor/Player;)V
  #124 = Utf8               p
  #125 = Utf8               SourceFile
  #126 = Utf8               CastleZoneType.java
  #127 = Utf8               BootstrapMethods
  #128 = MethodType         #129          //  (Ljava/lang/Object;)V
  #129 = Utf8               (Ljava/lang/Object;)V
  #130 = MethodHandle       5:#131        // REF_invokeVirtual ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.lambda$setEnabled$0:(ZLext/mods/gameserver/model/WorldRegion;)V
  #131 = Methodref          #22.#132      // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.lambda$setEnabled$0:(ZLext/mods/gameserver/model/WorldRegion;)V
  #132 = NameAndType        #119:#120     // lambda$setEnabled$0:(ZLext/mods/gameserver/model/WorldRegion;)V
  #133 = MethodType         #134          //  (Lext/mods/gameserver/model/WorldRegion;)V
  #134 = Utf8               (Lext/mods/gameserver/model/WorldRegion;)V
  #135 = MethodHandle       5:#136        // REF_invokeVirtual ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.lambda$setEnabled$1:(ZLext/mods/gameserver/model/actor/Player;)V
  #136 = Methodref          #22.#137      // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.lambda$setEnabled$1:(ZLext/mods/gameserver/model/actor/Player;)V
  #137 = NameAndType        #122:#123     // lambda$setEnabled$1:(ZLext/mods/gameserver/model/actor/Player;)V
  #138 = MethodType         #139          //  (Lext/mods/gameserver/model/actor/Player;)V
  #139 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #140 = MethodHandle       6:#141        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #141 = Methodref          #142.#143     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #142 = Class              #144          // java/lang/invoke/LambdaMetafactory
  #143 = NameAndType        #145:#146     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #144 = Utf8               java/lang/invoke/LambdaMetafactory
  #145 = Utf8               metafactory
  #146 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #147 = Utf8               InnerClasses
  #148 = Class              #149          // java/lang/invoke/MethodHandles$Lookup
  #149 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #150 = Class              #151          // java/lang/invoke/MethodHandles
  #151 = Utf8               java/lang/invoke/MethodHandles
  #152 = Utf8               Lookup
{
  protected ext.mods.gameserver.model.zone.type.subtype.CastleZoneType(int);
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 41: 0
        line 42: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
            0       6     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #7                  // String castleId
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #15                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: putfield      #21                 // Field _castleId:I
        17: goto          46
        20: aload_1
        21: ldc           #27                 // String eventId
        23: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        26: ifeq          40
        29: aload_0
        30: aload_2
        31: invokestatic  #15                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        34: putfield      #29                 // Field _eventId:I
        37: goto          46
        40: aload_0
        41: aload_1
        42: aload_2
        43: invokespecial #32                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
        46: return
      LineNumberTable:
        line 47: 0
        line 48: 9
        line 49: 20
        line 50: 29
        line 52: 40
        line 53: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
            0      47     1  name   Ljava/lang/String;
            0      47     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 20 /* same */
        frame_type = 19 /* same */
        frame_type = 5 /* same */

  public void addKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: getfield      #29                 // Field _eventId:I
         4: ifle          42
         7: aload_0
         8: getfield      #36                 // Field _enabled:Z
        11: ifeq          42
        14: aload_1
        15: instanceof    #40                 // class ext/mods/gameserver/model/actor/Player
        18: ifeq          42
        21: aload_1
        22: checkcast     #40                 // class ext/mods/gameserver/model/actor/Player
        25: astore_2
        26: aload_2
        27: new           #42                 // class ext/mods/gameserver/network/serverpackets/EventTrigger
        30: dup
        31: aload_0
        32: invokevirtual #44                 // Method getEventId:()I
        35: iconst_1
        36: invokespecial #48                 // Method ext/mods/gameserver/network/serverpackets/EventTrigger."<init>":(IZ)V
        39: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        42: return
      LineNumberTable:
        line 58: 0
        line 59: 26
        line 60: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      16     2 player   Lext/mods/gameserver/model/actor/Player;
            0      43     0  this   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
            0      43     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 1
        frame_type = 42 /* same */

  public void removeKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: getfield      #29                 // Field _eventId:I
         4: ifle          35
         7: aload_1
         8: instanceof    #40                 // class ext/mods/gameserver/model/actor/Player
        11: ifeq          35
        14: aload_1
        15: checkcast     #40                 // class ext/mods/gameserver/model/actor/Player
        18: astore_2
        19: aload_2
        20: new           #42                 // class ext/mods/gameserver/network/serverpackets/EventTrigger
        23: dup
        24: aload_0
        25: invokevirtual #44                 // Method getEventId:()I
        28: iconst_0
        29: invokespecial #48                 // Method ext/mods/gameserver/network/serverpackets/EventTrigger."<init>":(IZ)V
        32: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        35: return
      LineNumberTable:
        line 65: 0
        line 66: 19
        line 67: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      16     2 player   Lext/mods/gameserver/model/actor/Player;
            0      36     0  this   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
            0      36     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 1
        frame_type = 35 /* same */

  public ext.mods.gameserver.model.residence.castle.Castle getCastle();
    descriptor: ()Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _castleId:I
         4: ifle          28
         7: aload_0
         8: getfield      #55                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        11: ifnonnull     28
        14: aload_0
        15: invokestatic  #59                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        18: aload_0
        19: getfield      #21                 // Field _castleId:I
        22: invokevirtual #65                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
        25: putfield      #55                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        28: aload_0
        29: getfield      #55                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        32: areturn
      LineNumberTable:
        line 71: 0
        line 72: 14
        line 74: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
      StackMapTable: number_of_entries = 1
        frame_type = 28 /* same */

  public int getEventId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _eventId:I
         4: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field _enabled:Z
         4: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;

  public void setEnabled(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #36                 // Field _enabled:Z
         5: aload_0
         6: getfield      #29                 // Field _eventId:I
         9: ifle          31
        12: invokestatic  #69                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        15: aload_0
        16: invokevirtual #74                 // Method ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)Lext/mods/gameserver/model/WorldRegion;
        19: astore_2
        20: aload_2
        21: aload_0
        22: iload_1
        23: invokedynamic #78,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;Z)Ljava/util/function/Consumer;
        28: invokevirtual #82                 // Method ext/mods/gameserver/model/WorldRegion.forEachSurroundingRegion:(Ljava/util/function/Consumer;)V
        31: return
      LineNumberTable:
        line 89: 0
        line 91: 5
        line 93: 12
        line 94: 20
        line 96: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      11     2 region   Lext/mods/gameserver/model/WorldRegion;
            0      32     0  this   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
            0      32     1   val   Z
      StackMapTable: number_of_entries = 1
        frame_type = 31 /* same */
}
SourceFile: "CastleZoneType.java"
BootstrapMethods:
  0: #140 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #128 (Ljava/lang/Object;)V
      #130 REF_invokeVirtual ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.lambda$setEnabled$0:(ZLext/mods/gameserver/model/WorldRegion;)V
      #133 (Lext/mods/gameserver/model/WorldRegion;)V
  1: #140 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #128 (Ljava/lang/Object;)V
      #135 REF_invokeVirtual ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.lambda$setEnabled$1:(ZLext/mods/gameserver/model/actor/Player;)V
      #138 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static final #152= #148 of #150; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
