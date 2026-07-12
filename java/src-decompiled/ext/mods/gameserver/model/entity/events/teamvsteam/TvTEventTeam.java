// Bytecode for: ext.mods.gameserver.model.entity.events.teamvsteam.TvTEventTeam
// File: ext\mods\gameserver\model\entity\events\teamvsteam\TvTEventTeam.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.class
  Last modified 9 de jul de 2026; size 2896 bytes
  MD5 checksum 49b4b7583d1d437465ac1c4f84522157
  Compiled from "TvTEventTeam.java"
public class ext.mods.gameserver.model.entity.events.teamvsteam.TvTEventTeam
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 13, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam._coordinates:[I
    #8 = Class              #10           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
    #9 = NameAndType        #11:#12       // _coordinates:[I
   #10 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
   #11 = Utf8               _coordinates
   #12 = Utf8               [I
   #13 = Class              #14           // java/util/concurrent/ConcurrentHashMap
   #14 = Utf8               java/util/concurrent/ConcurrentHashMap
   #15 = Methodref          #13.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam._participatedPlayers:Ljava/util/Map;
   #17 = NameAndType        #18:#19       // _participatedPlayers:Ljava/util/Map;
   #18 = Utf8               _participatedPlayers
   #19 = Utf8               Ljava/util/Map;
   #20 = Class              #21           // java/util/HashMap
   #21 = Utf8               java/util/HashMap
   #22 = Methodref          #20.#3        // java/util/HashMap."<init>":()V
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam._pointPlayers:Ljava/util/Map;
   #24 = NameAndType        #25:#19       // _pointPlayers:Ljava/util/Map;
   #25 = Utf8               _pointPlayers
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam._name:Ljava/lang/String;
   #27 = NameAndType        #28:#29       // _name:Ljava/lang/String;
   #28 = Utf8               _name
   #29 = Utf8               Ljava/lang/String;
   #30 = Fieldref           #8.#31        // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam._points:S
   #31 = NameAndType        #32:#33       // _points:S
   #32 = Utf8               _points
   #33 = Utf8               S
   #34 = Methodref          #35.#36       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #35 = Class              #37           // ext/mods/gameserver/model/actor/Player
   #36 = NameAndType        #38:#39       // getObjectId:()I
   #37 = Utf8               ext/mods/gameserver/model/actor/Player
   #38 = Utf8               getObjectId
   #39 = Utf8               ()I
   #40 = Methodref          #41.#42       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #41 = Class              #43           // java/lang/Integer
   #42 = NameAndType        #44:#45       // valueOf:(I)Ljava/lang/Integer;
   #43 = Utf8               java/lang/Integer
   #44 = Utf8               valueOf
   #45 = Utf8               (I)Ljava/lang/Integer;
   #46 = InterfaceMethodref #47.#48       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Class              #49           // java/util/Map
   #48 = NameAndType        #50:#51       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #49 = Utf8               java/util/Map
   #50 = Utf8               put
   #51 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #52 = InterfaceMethodref #47.#53       // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #53 = NameAndType        #54:#55       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #54 = Utf8               remove
   #55 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #56 = InterfaceMethodref #47.#57       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #57 = NameAndType        #58:#59       // containsKey:(Ljava/lang/Object;)Z
   #58 = Utf8               containsKey
   #59 = Utf8               (Ljava/lang/Object;)Z
   #60 = InterfaceMethodref #47.#61       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #61 = NameAndType        #62:#55       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #62 = Utf8               get
   #63 = Methodref          #41.#64       // java/lang/Integer.intValue:()I
   #64 = NameAndType        #65:#39       // intValue:()I
   #65 = Utf8               intValue
   #66 = InterfaceMethodref #47.#67       // java/util/Map.clear:()V
   #67 = NameAndType        #68:#6        // clear:()V
   #68 = Utf8               clear
   #69 = InterfaceMethodref #47.#70       // java/util/Map.size:()I
   #70 = NameAndType        #71:#39       // size:()I
   #71 = Utf8               size
   #72 = Utf8               Signature
   #73 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
   #74 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
   #75 = Utf8               (Ljava/lang/String;[I)V
   #76 = Utf8               Code
   #77 = Utf8               LineNumberTable
   #78 = Utf8               LocalVariableTable
   #79 = Utf8               this
   #80 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
   #81 = Utf8               name
   #82 = Utf8               coordinates
   #83 = Utf8               addPlayer
   #84 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #85 = Utf8               player
   #86 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #87 = Utf8               StackMapTable
   #88 = Utf8               removePlayer
   #89 = Utf8               (I)V
   #90 = Utf8               objectId
   #91 = Utf8               I
   #92 = Utf8               increasePoints
   #93 = Utf8               charId
   #94 = Utf8               cleanMe
   #95 = Utf8               containsPlayer
   #96 = Utf8               (I)Z
   #97 = Utf8               getName
   #98 = Utf8               ()Ljava/lang/String;
   #99 = Utf8               getCoordinates
  #100 = Utf8               ()[I
  #101 = Utf8               getPoints
  #102 = Utf8               ()S
  #103 = Utf8               getParticipatedPlayers
  #104 = Utf8               ()Ljava/util/Map;
  #105 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
  #106 = Utf8               getParticipatedPlayerCount
  #107 = Utf8               onScoredPlayer
  #108 = Utf8               SourceFile
  #109 = Utf8               TvTEventTeam.java
{
  public ext.mods.gameserver.model.entity.events.teamvsteam.TvTEventTeam(java.lang.String, int[]);
    descriptor: (Ljava/lang/String;[I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_3
         6: newarray       int
         8: putfield      #7                  // Field _coordinates:[I
        11: aload_0
        12: new           #13                 // class java/util/concurrent/ConcurrentHashMap
        15: dup
        16: invokespecial #15                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        19: putfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
        22: aload_0
        23: new           #20                 // class java/util/HashMap
        26: dup
        27: invokespecial #22                 // Method java/util/HashMap."<init>":()V
        30: putfield      #23                 // Field _pointPlayers:Ljava/util/Map;
        33: aload_0
        34: aload_1
        35: putfield      #26                 // Field _name:Ljava/lang/String;
        38: aload_0
        39: aload_2
        40: putfield      #7                  // Field _coordinates:[I
        43: aload_0
        44: iconst_0
        45: putfield      #30                 // Field _points:S
        48: return
      LineNumberTable:
        line 38: 0
        line 30: 4
        line 34: 11
        line 35: 22
        line 39: 33
        line 40: 38
        line 41: 43
        line 42: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
            0      49     1  name   Ljava/lang/String;
            0      49     2 coordinates   [I

  public boolean addPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
        10: aload_1
        11: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        14: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        17: aload_1
        18: invokeinterface #46,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        23: pop
        24: iconst_1
        25: ireturn
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 49: 6
        line 50: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
            0      26     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  public void removePlayer(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #52,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: pop
        14: return
      LineNumberTable:
        line 55: 0
        line 56: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
            0      15     1 objectId   I

  public void increasePoints();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: dup
         2: getfield      #30                 // Field _points:S
         5: iconst_1
         6: iadd
         7: i2s
         8: putfield      #30                 // Field _points:S
        11: return
      LineNumberTable:
        line 60: 0
        line 61: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;

  public void increasePoints(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _pointPlayers:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #56,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ifeq          57
        16: aload_0
        17: getfield      #23                 // Field _pointPlayers:Ljava/util/Map;
        20: iload_1
        21: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        24: aload_0
        25: getfield      #23                 // Field _pointPlayers:Ljava/util/Map;
        28: iload_1
        29: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: invokeinterface #60,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        37: checkcast     #41                 // class java/lang/Integer
        40: invokevirtual #63                 // Method java/lang/Integer.intValue:()I
        43: iconst_1
        44: iadd
        45: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        48: invokeinterface #46,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        53: pop
        54: goto          75
        57: aload_0
        58: getfield      #23                 // Field _pointPlayers:Ljava/util/Map;
        61: iload_1
        62: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        65: iconst_1
        66: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        69: invokeinterface #46,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        74: pop
        75: return
      LineNumberTable:
        line 65: 0
        line 66: 16
        line 68: 57
        line 69: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      76     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
            0      76     1 charId   I
      StackMapTable: number_of_entries = 2
        frame_type = 57 /* same */
        frame_type = 17 /* same */

  public void cleanMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: invokeinterface #66,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: getfield      #23                 // Field _pointPlayers:Ljava/util/Map;
        13: invokeinterface #66,  1           // InterfaceMethod java/util/Map.clear:()V
        18: aload_0
        19: iconst_0
        20: putfield      #30                 // Field _points:S
        23: return
      LineNumberTable:
        line 73: 0
        line 74: 9
        line 75: 18
        line 76: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;

  public boolean containsPlayer(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #56,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
            0      14     1 objectId   I

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;

  public int[] getCoordinates();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _coordinates:[I
         4: areturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;

  public short getPoints();
    descriptor: ()S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _points:S
         4: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.actor.Player> getParticipatedPlayers();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
    Signature: #105                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;

  public int getParticipatedPlayerCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: invokeinterface #69,  1           // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;

  public boolean onScoredPlayer(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _pointPlayers:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #56,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ifeq          44
        16: aload_0
        17: getfield      #23                 // Field _pointPlayers:Ljava/util/Map;
        20: iload_1
        21: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        24: invokeinterface #60,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #41                 // class java/lang/Integer
        32: invokevirtual #63                 // Method java/lang/Integer.intValue:()I
        35: ifle          42
        38: iconst_1
        39: goto          43
        42: iconst_0
        43: ireturn
        44: iconst_0
        45: ireturn
      LineNumberTable:
        line 110: 0
        line 111: 16
        line 113: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
            0      46     1 charId   I
      StackMapTable: number_of_entries = 3
        frame_type = 42 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
}
SourceFile: "TvTEventTeam.java"
