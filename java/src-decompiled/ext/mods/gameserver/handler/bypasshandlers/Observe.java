// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.Observe
// File: ext\mods\gameserver\handler\bypasshandlers\Observe.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/Observe.class
  Last modified 9 de jul de 2026; size 3081 bytes
  MD5 checksum cc4b5ca4d428d1fbe9588cd5d1dbe99f
  Compiled from "Observe.java"
public class ext.mods.gameserver.handler.bypasshandlers.Observe implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #98                         // ext/mods/gameserver/handler/bypasshandlers/Observe
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = Methodref          #7.#10        // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #10 = NameAndType        #5:#11        // "<init>":(Ljava/lang/String;)V
   #11 = Utf8               (Ljava/lang/String;)V
   #12 = Methodref          #7.#13        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #13 = NameAndType        #14:#15       // nextToken:()Ljava/lang/String;
   #14 = Utf8               nextToken
   #15 = Utf8               ()Ljava/lang/String;
   #16 = Methodref          #17.#18       // ext/mods/gameserver/data/xml/ObserverGroupData.getInstance:()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #17 = Class              #19           // ext/mods/gameserver/data/xml/ObserverGroupData
   #18 = NameAndType        #20:#21       // getInstance:()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #19 = Utf8               ext/mods/gameserver/data/xml/ObserverGroupData
   #20 = Utf8               getInstance
   #21 = Utf8               ()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #22 = Methodref          #23.#24       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #23 = Class              #25           // java/lang/Integer
   #24 = NameAndType        #26:#27       // parseInt:(Ljava/lang/String;)I
   #25 = Utf8               java/lang/Integer
   #26 = Utf8               parseInt
   #27 = Utf8               (Ljava/lang/String;)I
   #28 = Methodref          #17.#29       // ext/mods/gameserver/data/xml/ObserverGroupData.getObserverLocation:(I)Lext/mods/gameserver/model/location/ObserverLocation;
   #29 = NameAndType        #30:#31       // getObserverLocation:(I)Lext/mods/gameserver/model/location/ObserverLocation;
   #30 = Utf8               getObserverLocation
   #31 = Utf8               (I)Lext/mods/gameserver/model/location/ObserverLocation;
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #33 = Class              #35           // ext/mods/gameserver/model/actor/Player
   #34 = NameAndType        #36:#37       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #35 = Utf8               ext/mods/gameserver/model/actor/Player
   #36 = Utf8               getSummon
   #37 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #38 = Methodref          #39.#40       // ext/mods/gameserver/model/location/ObserverLocation.getCastleId:()I
   #39 = Class              #41           // ext/mods/gameserver/model/location/ObserverLocation
   #40 = NameAndType        #42:#43       // getCastleId:()I
   #41 = Utf8               ext/mods/gameserver/model/location/ObserverLocation
   #42 = Utf8               getCastleId
   #43 = Utf8               ()I
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/network/SystemMessageId.NO_OBSERVE_WITH_PET:Lext/mods/gameserver/network/SystemMessageId;
   #45 = Class              #47           // ext/mods/gameserver/network/SystemMessageId
   #46 = NameAndType        #48:#49       // NO_OBSERVE_WITH_PET:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #48 = Utf8               NO_OBSERVE_WITH_PET
   #49 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #50 = Methodref          #33.#51       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #51 = NameAndType        #52:#53       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #52 = Utf8               sendPacket
   #53 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #54 = Methodref          #55.#56       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #55 = Class              #57           // ext/mods/gameserver/data/manager/CastleManager
   #56 = NameAndType        #20:#58       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #57 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #58 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #59 = Methodref          #55.#60       // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #60 = NameAndType        #61:#62       // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #61 = Utf8               getCastleById
   #62 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
   #63 = Methodref          #64.#65       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #64 = Class              #66           // ext/mods/gameserver/model/residence/castle/Castle
   #65 = NameAndType        #67:#68       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #66 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #67 = Utf8               getSiege
   #68 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #70 = Class              #72           // ext/mods/gameserver/model/residence/castle/Siege
   #71 = NameAndType        #73:#74       // isInProgress:()Z
   #72 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #73 = Utf8               isInProgress
   #74 = Utf8               ()Z
   #75 = Fieldref           #45.#76       // ext/mods/gameserver/network/SystemMessageId.ONLY_VIEW_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #76 = NameAndType        #77:#49       // ONLY_VIEW_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #77 = Utf8               ONLY_VIEW_SIEGE
   #78 = Methodref          #33.#79       // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
   #79 = NameAndType        #80:#74       // isInCombat:()Z
   #80 = Utf8               isInCombat
   #81 = Fieldref           #45.#82       // ext/mods/gameserver/network/SystemMessageId.CANNOT_OBSERVE_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
   #82 = NameAndType        #83:#49       // CANNOT_OBSERVE_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
   #83 = Utf8               CANNOT_OBSERVE_IN_COMBAT
   #84 = Methodref          #85.#86       // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #85 = Class              #87           // ext/mods/gameserver/model/olympiad/OlympiadManager
   #86 = NameAndType        #20:#88       // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #87 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
   #88 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #89 = Methodref          #85.#90       // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
   #90 = NameAndType        #91:#92       // isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
   #91 = Utf8               isRegisteredInComp
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #93 = Methodref          #33.#94       // ext/mods/gameserver/model/actor/Player.enterObserverMode:(Lext/mods/gameserver/model/location/ObserverLocation;)V
   #94 = NameAndType        #95:#96       // enterObserverMode:(Lext/mods/gameserver/model/location/ObserverLocation;)V
   #95 = Utf8               enterObserverMode
   #96 = Utf8               (Lext/mods/gameserver/model/location/ObserverLocation;)V
   #97 = Fieldref           #98.#99       // ext/mods/gameserver/handler/bypasshandlers/Observe.COMMANDS:[Ljava/lang/String;
   #98 = Class              #100          // ext/mods/gameserver/handler/bypasshandlers/Observe
   #99 = NameAndType        #101:#102     // COMMANDS:[Ljava/lang/String;
  #100 = Utf8               ext/mods/gameserver/handler/bypasshandlers/Observe
  #101 = Utf8               COMMANDS
  #102 = Utf8               [Ljava/lang/String;
  #103 = Class              #104          // java/lang/String
  #104 = Utf8               java/lang/String
  #105 = String             #106          // observe
  #106 = Utf8               observe
  #107 = Class              #108          // ext/mods/gameserver/handler/IBypassHandler
  #108 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               this
  #113 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/Observe;
  #114 = Utf8               useBypass
  #115 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #116 = Utf8               castle
  #117 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #118 = Utf8               command
  #119 = Utf8               Ljava/lang/String;
  #120 = Utf8               player
  #121 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #122 = Utf8               target
  #123 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #124 = Utf8               st
  #125 = Utf8               Ljava/util/StringTokenizer;
  #126 = Utf8               loc
  #127 = Utf8               Lext/mods/gameserver/model/location/ObserverLocation;
  #128 = Utf8               hasSummon
  #129 = Utf8               Z
  #130 = Utf8               StackMapTable
  #131 = Utf8               getBypassList
  #132 = Utf8               ()[Ljava/lang/String;
  #133 = Utf8               <clinit>
  #134 = Utf8               SourceFile
  #135 = Utf8               Observe.java
{
  public ext.mods.gameserver.handler.bypasshandlers.Observe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/Observe;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: invokespecial #9                  // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
         8: astore        4
        10: aload         4
        12: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: invokestatic  #16                 // Method ext/mods/gameserver/data/xml/ObserverGroupData.getInstance:()Lext/mods/gameserver/data/xml/ObserverGroupData;
        19: aload         4
        21: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        24: invokestatic  #22                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        27: invokevirtual #28                 // Method ext/mods/gameserver/data/xml/ObserverGroupData.getObserverLocation:(I)Lext/mods/gameserver/model/location/ObserverLocation;
        30: astore        5
        32: aload         5
        34: ifnonnull     39
        37: iconst_0
        38: ireturn
        39: aload_2
        40: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        43: ifnull        50
        46: iconst_1
        47: goto          51
        50: iconst_0
        51: istore        6
        53: aload         5
        55: invokevirtual #38                 // Method ext/mods/gameserver/model/location/ObserverLocation.getCastleId:()I
        58: ifle          116
        61: iload         6
        63: ifeq          75
        66: aload_2
        67: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.NO_OBSERVE_WITH_PET:Lext/mods/gameserver/network/SystemMessageId;
        70: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        73: iconst_0
        74: ireturn
        75: invokestatic  #54                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        78: aload         5
        80: invokevirtual #38                 // Method ext/mods/gameserver/model/location/ObserverLocation.getCastleId:()I
        83: invokevirtual #59                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
        86: astore        7
        88: aload         7
        90: ifnull        104
        93: aload         7
        95: invokevirtual #63                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        98: invokevirtual #69                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
       101: ifne          113
       104: aload_2
       105: getstatic     #75                 // Field ext/mods/gameserver/network/SystemMessageId.ONLY_VIEW_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       108: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       111: iconst_0
       112: ireturn
       113: goto          123
       116: iload         6
       118: ifeq          123
       121: iconst_0
       122: ireturn
       123: aload_2
       124: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
       127: ifeq          139
       130: aload_2
       131: getstatic     #81                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_OBSERVE_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
       134: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       137: iconst_0
       138: ireturn
       139: invokestatic  #84                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       142: aload_2
       143: invokevirtual #89                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
       146: ifeq          151
       149: iconst_0
       150: ireturn
       151: aload_2
       152: aload         5
       154: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.enterObserverMode:(Lext/mods/gameserver/model/location/ObserverLocation;)V
       157: iconst_1
       158: ireturn
      LineNumberTable:
        line 39: 0
        line 40: 10
        line 42: 16
        line 43: 32
        line 44: 37
        line 46: 39
        line 48: 53
        line 50: 61
        line 52: 66
        line 53: 73
        line 56: 75
        line 57: 88
        line 59: 104
        line 60: 111
        line 62: 113
        line 63: 116
        line 64: 121
        line 66: 123
        line 68: 130
        line 69: 137
        line 72: 139
        line 73: 149
        line 75: 151
        line 76: 157
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           88      25     7 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0     159     0  this   Lext/mods/gameserver/handler/bypasshandlers/Observe;
            0     159     1 command   Ljava/lang/String;
            0     159     2 player   Lext/mods/gameserver/model/actor/Player;
            0     159     3 target   Lext/mods/gameserver/model/actor/Creature;
           10     149     4    st   Ljava/util/StringTokenizer;
           32     127     5   loc   Lext/mods/gameserver/model/location/ObserverLocation;
           53     106     6 hasSummon   Z
      StackMapTable: number_of_entries = 10
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class java/util/StringTokenizer, class ext/mods/gameserver/model/location/ObserverLocation ]
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 6 /* same */
        frame_type = 15 /* same */
        frame_type = 11 /* same */

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #97                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/Observe;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #103                // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #105                // String observe
         8: aastore
         9: putstatic     #97                 // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "Observe.java"
