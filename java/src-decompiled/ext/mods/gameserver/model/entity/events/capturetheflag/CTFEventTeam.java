// Bytecode for: ext.mods.gameserver.model.entity.events.capturetheflag.CTFEventTeam
// File: ext\mods\gameserver\model\entity\events\capturetheflag\CTFEventTeam.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.class
  Last modified 9 de jul de 2026; size 2389 bytes
  MD5 checksum 977374c013c1c47307c7d325776243ee
  Compiled from "CTFEventTeam.java"
public class ext.mods.gameserver.model.entity.events.capturetheflag.CTFEventTeam
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 11, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam._coordinates:[I
   #8 = Class              #10            // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
   #9 = NameAndType        #11:#12        // _coordinates:[I
  #10 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
  #11 = Utf8               _coordinates
  #12 = Utf8               [I
  #13 = Class              #14            // java/util/concurrent/ConcurrentHashMap
  #14 = Utf8               java/util/concurrent/ConcurrentHashMap
  #15 = Methodref          #13.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam._participatedPlayers:Ljava/util/Map;
  #17 = NameAndType        #18:#19        // _participatedPlayers:Ljava/util/Map;
  #18 = Utf8               _participatedPlayers
  #19 = Utf8               Ljava/util/Map;
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam._name:Ljava/lang/String;
  #21 = NameAndType        #22:#23        // _name:Ljava/lang/String;
  #22 = Utf8               _name
  #23 = Utf8               Ljava/lang/String;
  #24 = Fieldref           #8.#25         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam._points:S
  #25 = NameAndType        #26:#27        // _points:S
  #26 = Utf8               _points
  #27 = Utf8               S
  #28 = Methodref          #29.#30        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #29 = Class              #31            // ext/mods/gameserver/model/actor/Player
  #30 = NameAndType        #32:#33        // getObjectId:()I
  #31 = Utf8               ext/mods/gameserver/model/actor/Player
  #32 = Utf8               getObjectId
  #33 = Utf8               ()I
  #34 = Methodref          #35.#36        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #35 = Class              #37            // java/lang/Integer
  #36 = NameAndType        #38:#39        // valueOf:(I)Ljava/lang/Integer;
  #37 = Utf8               java/lang/Integer
  #38 = Utf8               valueOf
  #39 = Utf8               (I)Ljava/lang/Integer;
  #40 = InterfaceMethodref #41.#42        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #41 = Class              #43            // java/util/Map
  #42 = NameAndType        #44:#45        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #43 = Utf8               java/util/Map
  #44 = Utf8               put
  #45 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #46 = InterfaceMethodref #41.#47        // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #47 = NameAndType        #48:#49        // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #48 = Utf8               remove
  #49 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #50 = InterfaceMethodref #41.#51        // java/util/Map.clear:()V
  #51 = NameAndType        #52:#6         // clear:()V
  #52 = Utf8               clear
  #53 = InterfaceMethodref #41.#54        // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #54 = NameAndType        #55:#56        // containsKey:(Ljava/lang/Object;)Z
  #55 = Utf8               containsKey
  #56 = Utf8               (Ljava/lang/Object;)Z
  #57 = InterfaceMethodref #41.#58        // java/util/Map.size:()I
  #58 = NameAndType        #59:#33        // size:()I
  #59 = Utf8               size
  #60 = Utf8               Signature
  #61 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
  #62 = Utf8               (Ljava/lang/String;[I)V
  #63 = Utf8               Code
  #64 = Utf8               LineNumberTable
  #65 = Utf8               LocalVariableTable
  #66 = Utf8               this
  #67 = Utf8               Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
  #68 = Utf8               name
  #69 = Utf8               coordinates
  #70 = Utf8               addPlayer
  #71 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #72 = Utf8               player
  #73 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #74 = Utf8               StackMapTable
  #75 = Utf8               removePlayer
  #76 = Utf8               (I)V
  #77 = Utf8               objectId
  #78 = Utf8               I
  #79 = Utf8               increasePoints
  #80 = Utf8               cleanMe
  #81 = Utf8               containsPlayer
  #82 = Utf8               (I)Z
  #83 = Utf8               getName
  #84 = Utf8               ()Ljava/lang/String;
  #85 = Utf8               getCoordinates
  #86 = Utf8               ()[I
  #87 = Utf8               getPoints
  #88 = Utf8               ()S
  #89 = Utf8               getParticipatedPlayers
  #90 = Utf8               ()Ljava/util/Map;
  #91 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
  #92 = Utf8               getParticipatedPlayerCount
  #93 = Utf8               SourceFile
  #94 = Utf8               CTFEventTeam.java
{
  public ext.mods.gameserver.model.entity.events.capturetheflag.CTFEventTeam(java.lang.String, int[]);
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
        23: aload_1
        24: putfield      #20                 // Field _name:Ljava/lang/String;
        27: aload_0
        28: aload_2
        29: putfield      #7                  // Field _coordinates:[I
        32: aload_0
        33: iconst_0
        34: putfield      #24                 // Field _points:S
        37: return
      LineNumberTable:
        line 36: 0
        line 29: 4
        line 33: 11
        line 37: 22
        line 38: 27
        line 39: 32
        line 40: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
            0      38     1  name   Ljava/lang/String;
            0      38     2 coordinates   [I

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
        11: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        14: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        17: aload_1
        18: invokeinterface #40,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        23: pop
        24: iconst_1
        25: ireturn
      LineNumberTable:
        line 44: 0
        line 45: 4
        line 47: 6
        line 48: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
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
         5: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #46,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: pop
        14: return
      LineNumberTable:
        line 53: 0
        line 54: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
            0      15     1 objectId   I

  public void increasePoints();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: dup
         2: getfield      #24                 // Field _points:S
         5: iconst_1
         6: iadd
         7: i2s
         8: putfield      #24                 // Field _points:S
        11: return
      LineNumberTable:
        line 58: 0
        line 59: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;

  public void cleanMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: invokeinterface #50,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: iconst_0
        11: putfield      #24                 // Field _points:S
        14: return
      LineNumberTable:
        line 63: 0
        line 64: 9
        line 65: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;

  public boolean containsPlayer(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #53,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
            0      14     1 objectId   I

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;

  public int[] getCoordinates();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _coordinates:[I
         4: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;

  public short getPoints();
    descriptor: ()S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _points:S
         4: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.actor.Player> getParticipatedPlayers();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
    Signature: #91                          // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;

  public int getParticipatedPlayerCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _participatedPlayers:Ljava/util/Map;
         4: invokeinterface #57,  1           // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
}
SourceFile: "CTFEventTeam.java"
