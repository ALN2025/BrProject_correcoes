// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.InstantTeleport
// File: ext\mods\gameserver\handler\bypasshandlers\InstantTeleport.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/InstantTeleport.class
  Last modified 9 de jul de 2026; size 2855 bytes
  MD5 checksum 26b002c428ea6ed245245ecfabca84b0
  Compiled from "InstantTeleport.java"
public class ext.mods.gameserver.handler.bypasshandlers.InstantTeleport implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #27                         // ext/mods/gameserver/handler/bypasshandlers/InstantTeleport
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = Class              #19           // ext/mods/gameserver/model/actor/Npc
   #19 = Utf8               ext/mods/gameserver/model/actor/Npc
   #20 = Methodref          #21.#22       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #21 = Class              #23           // java/lang/Integer
   #22 = NameAndType        #24:#25       // parseInt:(Ljava/lang/String;)I
   #23 = Utf8               java/lang/Integer
   #24 = Utf8               parseInt
   #25 = Utf8               (Ljava/lang/String;)I
   #26 = Methodref          #27.#28       // ext/mods/gameserver/handler/bypasshandlers/InstantTeleport.instantTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
   #27 = Class              #29           // ext/mods/gameserver/handler/bypasshandlers/InstantTeleport
   #28 = NameAndType        #30:#31       // instantTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
   #29 = Utf8               ext/mods/gameserver/handler/bypasshandlers/InstantTeleport
   #30 = Utf8               instantTeleport
   #31 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
   #32 = Class              #33           // java/lang/Exception
   #33 = Utf8               java/lang/Exception
   #34 = Fieldref           #35.#36       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #35 = Class              #37           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #36 = NameAndType        #38:#39       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #37 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #38 = Utf8               STATIC_PACKET
   #39 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #41 = Class              #43           // ext/mods/gameserver/model/actor/Player
   #42 = NameAndType        #44:#45       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #43 = Utf8               ext/mods/gameserver/model/actor/Player
   #44 = Utf8               sendPacket
   #45 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #46 = Methodref          #18.#47       // ext/mods/gameserver/model/actor/Npc.isTeleportAllowed:(Lext/mods/gameserver/model/actor/Player;)Z
   #47 = NameAndType        #48:#49       // isTeleportAllowed:(Lext/mods/gameserver/model/actor/Player;)Z
   #48 = Utf8               isTeleportAllowed
   #49 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #50 = Methodref          #51.#52       // ext/mods/gameserver/data/xml/InstantTeleportData.getInstance:()Lext/mods/gameserver/data/xml/InstantTeleportData;
   #51 = Class              #53           // ext/mods/gameserver/data/xml/InstantTeleportData
   #52 = NameAndType        #54:#55       // getInstance:()Lext/mods/gameserver/data/xml/InstantTeleportData;
   #53 = Utf8               ext/mods/gameserver/data/xml/InstantTeleportData
   #54 = Utf8               getInstance
   #55 = Utf8               ()Lext/mods/gameserver/data/xml/InstantTeleportData;
   #56 = Methodref          #18.#57       // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #57 = NameAndType        #58:#59       // getNpcId:()I
   #58 = Utf8               getNpcId
   #59 = Utf8               ()I
   #60 = Methodref          #51.#61       // ext/mods/gameserver/data/xml/InstantTeleportData.getTeleports:(I)Ljava/util/List;
   #61 = NameAndType        #62:#63       // getTeleports:(I)Ljava/util/List;
   #62 = Utf8               getTeleports
   #63 = Utf8               (I)Ljava/util/List;
   #64 = InterfaceMethodref #65.#66       // java/util/List.size:()I
   #65 = Class              #67           // java/util/List
   #66 = NameAndType        #68:#59       // size:()I
   #67 = Utf8               java/util/List
   #68 = Utf8               size
   #69 = InterfaceMethodref #65.#70       // java/util/List.get:(I)Ljava/lang/Object;
   #70 = NameAndType        #71:#72       // get:(I)Ljava/lang/Object;
   #71 = Utf8               get
   #72 = Utf8               (I)Ljava/lang/Object;
   #73 = Class              #74           // ext/mods/gameserver/model/location/Location
   #74 = Utf8               ext/mods/gameserver/model/location/Location
   #75 = Methodref          #41.#76       // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #76 = NameAndType        #77:#78       // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #77 = Utf8               teleportTo
   #78 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
   #79 = Fieldref           #27.#80       // ext/mods/gameserver/handler/bypasshandlers/InstantTeleport.COMMANDS:[Ljava/lang/String;
   #80 = NameAndType        #81:#82       // COMMANDS:[Ljava/lang/String;
   #81 = Utf8               COMMANDS
   #82 = Utf8               [Ljava/lang/String;
   #83 = Class              #84           // java/lang/String
   #84 = Utf8               java/lang/String
   #85 = String             #86           // instant_teleport
   #86 = Utf8               instant_teleport
   #87 = Class              #88           // ext/mods/gameserver/handler/IBypassHandler
   #88 = Utf8               ext/mods/gameserver/handler/IBypassHandler
   #89 = Utf8               Code
   #90 = Utf8               LineNumberTable
   #91 = Utf8               LocalVariableTable
   #92 = Utf8               this
   #93 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/InstantTeleport;
   #94 = Utf8               useBypass
   #95 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #96 = Utf8               npc
   #97 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #98 = Utf8               st
   #99 = Utf8               Ljava/util/StringTokenizer;
  #100 = Utf8               e
  #101 = Utf8               Ljava/lang/Exception;
  #102 = Utf8               command
  #103 = Utf8               Ljava/lang/String;
  #104 = Utf8               player
  #105 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #106 = Utf8               target
  #107 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #108 = Utf8               StackMapTable
  #109 = Utf8               index
  #110 = Utf8               I
  #111 = Utf8               teleports
  #112 = Utf8               Ljava/util/List;
  #113 = Utf8               teleport
  #114 = Utf8               Lext/mods/gameserver/model/location/Location;
  #115 = Utf8               LocalVariableTypeTable
  #116 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #117 = Utf8               getBypassList
  #118 = Utf8               ()[Ljava/lang/String;
  #119 = Utf8               <clinit>
  #120 = Utf8               SourceFile
  #121 = Utf8               InstantTeleport.java
{
  public ext.mods.gameserver.handler.bypasshandlers.InstantTeleport();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/InstantTeleport;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore        4
        12: aload         4
        14: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        17: pop
        18: aload_3
        19: instanceof    #18                 // class ext/mods/gameserver/model/actor/Npc
        22: ifeq          46
        25: aload_3
        26: checkcast     #18                 // class ext/mods/gameserver/model/actor/Npc
        29: astore        5
        31: aload_0
        32: aload_2
        33: aload         5
        35: aload         4
        37: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        40: invokestatic  #20                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        43: invokevirtual #26                 // Method instantTeleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
        46: goto          58
        49: astore        4
        51: aload_2
        52: getstatic     #34                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        55: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: iconst_1
        59: ireturn
      Exception table:
         from    to  target type
             0    46    49   Class java/lang/Exception
      LineNumberTable:
        line 40: 0
        line 41: 12
        line 43: 18
        line 44: 31
        line 49: 46
        line 46: 49
        line 48: 51
        line 50: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      15     5   npc   Lext/mods/gameserver/model/actor/Npc;
           12      34     4    st   Ljava/util/StringTokenizer;
           51       7     4     e   Ljava/lang/Exception;
            0      60     0  this   Lext/mods/gameserver/handler/bypasshandlers/InstantTeleport;
            0      60     1 command   Ljava/lang/String;
            0      60     2 player   Lext/mods/gameserver/model/actor/Player;
            0      60     3 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 46 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 8 /* same */

  public void instantTeleport(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: aload_2
         1: aload_1
         2: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Npc.isTeleportAllowed:(Lext/mods/gameserver/model/actor/Player;)Z
         5: ifne          9
         8: return
         9: invokestatic  #50                 // Method ext/mods/gameserver/data/xml/InstantTeleportData.getInstance:()Lext/mods/gameserver/data/xml/InstantTeleportData;
        12: aload_2
        13: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        16: invokevirtual #60                 // Method ext/mods/gameserver/data/xml/InstantTeleportData.getTeleports:(I)Ljava/util/List;
        19: astore        4
        21: aload         4
        23: ifnull        37
        26: iload_3
        27: aload         4
        29: invokeinterface #64,  1           // InterfaceMethod java/util/List.size:()I
        34: if_icmple     38
        37: return
        38: aload         4
        40: iload_3
        41: invokeinterface #69,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        46: checkcast     #73                 // class ext/mods/gameserver/model/location/Location
        49: astore        5
        51: aload         5
        53: ifnonnull     57
        56: return
        57: aload_1
        58: aload         5
        60: bipush        20
        62: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        65: return
      LineNumberTable:
        line 63: 0
        line 64: 8
        line 66: 9
        line 67: 21
        line 68: 37
        line 70: 38
        line 71: 51
        line 72: 56
        line 74: 57
        line 75: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/handler/bypasshandlers/InstantTeleport;
            0      66     1 player   Lext/mods/gameserver/model/actor/Player;
            0      66     2   npc   Lext/mods/gameserver/model/actor/Npc;
            0      66     3 index   I
           21      45     4 teleports   Ljava/util/List;
           51      15     5 teleport   Lext/mods/gameserver/model/location/Location;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           21      45     4 teleports   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 4
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/List ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/location/Location ]

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #79                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/InstantTeleport;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #83                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #85                 // String instant_teleport
         8: aastore
         9: putstatic     #79                 // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "InstantTeleport.java"
