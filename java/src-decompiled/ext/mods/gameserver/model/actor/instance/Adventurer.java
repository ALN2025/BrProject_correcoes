// Bytecode for: ext.mods.gameserver.model.actor.instance.Adventurer
// File: ext\mods\gameserver\model\actor\instance\Adventurer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Adventurer.class
  Last modified 9 de jul de 2026; size 2494 bytes
  MD5 checksum f2a8dcda82cf3213b4066b84971328e6
  Compiled from "Adventurer.java"
public class ext.mods.gameserver.model.actor.instance.Adventurer extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #35                         // ext/mods/gameserver/model/actor/instance/Adventurer
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            // raidInfo
    #8 = Utf8               raidInfo
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #10.#16       // java/lang/String.substring:(I)Ljava/lang/String;
   #16 = NameAndType        #17:#18       // substring:(I)Ljava/lang/String;
   #17 = Utf8               substring
   #18 = Utf8               (I)Ljava/lang/String;
   #19 = Methodref          #10.#20       // java/lang/String.trim:()Ljava/lang/String;
   #20 = NameAndType        #21:#22       // trim:()Ljava/lang/String;
   #21 = Utf8               trim
   #22 = Utf8               ()Ljava/lang/String;
   #23 = Methodref          #24.#25       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #24 = Class              #26           // java/lang/Integer
   #25 = NameAndType        #27:#28       // parseInt:(Ljava/lang/String;)I
   #26 = Utf8               java/lang/Integer
   #27 = Utf8               parseInt
   #28 = Utf8               (Ljava/lang/String;)I
   #29 = String             #30           // html/adventurer_guildsman/raid_info/info.htm
   #30 = Utf8               html/adventurer_guildsman/raid_info/info.htm
   #31 = InvokeDynamic      #0:#32        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #32 = NameAndType        #33:#18       // makeConcatWithConstants:(I)Ljava/lang/String;
   #33 = Utf8               makeConcatWithConstants
   #34 = Methodref          #35.#36       // ext/mods/gameserver/model/actor/instance/Adventurer.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #35 = Class              #37           // ext/mods/gameserver/model/actor/instance/Adventurer
   #36 = NameAndType        #38:#39       // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #37 = Utf8               ext/mods/gameserver/model/actor/instance/Adventurer
   #38 = Utf8               showChatWindow
   #39 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #40 = String             #41           // questlist
   #41 = Utf8               questlist
   #42 = Methodref          #10.#43       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #43 = NameAndType        #44:#14       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #44 = Utf8               equalsIgnoreCase
   #45 = Fieldref           #46.#47       // ext/mods/gameserver/network/serverpackets/ExShowQuestInfo.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowQuestInfo;
   #46 = Class              #48           // ext/mods/gameserver/network/serverpackets/ExShowQuestInfo
   #47 = NameAndType        #49:#50       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowQuestInfo;
   #48 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowQuestInfo
   #49 = Utf8               STATIC_PACKET
   #50 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowQuestInfo;
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = Class              #54           // ext/mods/gameserver/model/actor/Player
   #53 = NameAndType        #55:#56       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #54 = Utf8               ext/mods/gameserver/model/actor/Player
   #55 = Utf8               sendPacket
   #56 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #57 = Methodref          #2.#58        // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #58 = NameAndType        #59:#39       // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #59 = Utf8               onBypassFeedback
   #60 = String             #61           //
   #61 = Utf8
   #62 = InvokeDynamic      #1:#32        // #1:makeConcatWithConstants:(I)Ljava/lang/String;
   #63 = InvokeDynamic      #2:#64        // #2:makeConcatWithConstants:(II)Ljava/lang/String;
   #64 = NameAndType        #33:#65       // makeConcatWithConstants:(II)Ljava/lang/String;
   #65 = Utf8               (II)Ljava/lang/String;
   #66 = InvokeDynamic      #3:#67        // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #67 = NameAndType        #33:#68       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #68 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #69 = Utf8               Code
   #70 = Utf8               LineNumberTable
   #71 = Utf8               LocalVariableTable
   #72 = Utf8               this
   #73 = Utf8               Lext/mods/gameserver/model/actor/instance/Adventurer;
   #74 = Utf8               objectId
   #75 = Utf8               I
   #76 = Utf8               template
   #77 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #78 = Utf8               bossLevel
   #79 = Utf8               filename
   #80 = Utf8               Ljava/lang/String;
   #81 = Utf8               player
   #82 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #83 = Utf8               command
   #84 = Utf8               StackMapTable
   #85 = Utf8               getHtmlPath
   #86 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #87 = Utf8               npcId
   #88 = Utf8               val
   #89 = Utf8               SourceFile
   #90 = Utf8               Adventurer.java
   #91 = Utf8               BootstrapMethods
   #92 = String             #93           // html/adventurer_guildsman/raid_info/level\u0001.htm
   #93 = Utf8               html/adventurer_guildsman/raid_info/level\u0001.htm
   #94 = String             #95           // \u0001
   #95 = Utf8               \u0001
   #96 = String             #97           // \u0001-\u0001
   #97 = Utf8               \u0001-\u0001
   #98 = String             #99           // html/adventurer_guildsman/\u0001.htm
   #99 = Utf8               html/adventurer_guildsman/\u0001.htm
  #100 = MethodHandle       6:#101        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #101 = Methodref          #102.#103     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #102 = Class              #104          // java/lang/invoke/StringConcatFactory
  #103 = NameAndType        #33:#105      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Utf8               java/lang/invoke/StringConcatFactory
  #105 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #106 = Utf8               InnerClasses
  #107 = Class              #108          // java/lang/invoke/MethodHandles$Lookup
  #108 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #109 = Class              #110          // java/lang/invoke/MethodHandles
  #110 = Utf8               java/lang/invoke/MethodHandles
  #111 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Adventurer(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 28: 0
        line 29: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Adventurer;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_2
         1: ldc           #7                  // String raidInfo
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          48
         9: aload_2
        10: bipush        9
        12: invokevirtual #15                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        15: invokevirtual #19                 // Method java/lang/String.trim:()Ljava/lang/String;
        18: invokestatic  #23                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        21: istore_3
        22: ldc           #29                 // String html/adventurer_guildsman/raid_info/info.htm
        24: astore        4
        26: iload_3
        27: ifeq          38
        30: iload_3
        31: invokedynamic #31,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        36: astore        4
        38: aload_0
        39: aload_1
        40: aload         4
        42: invokevirtual #34                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        45: goto          73
        48: aload_2
        49: ldc           #40                 // String questlist
        51: invokevirtual #42                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        54: ifeq          67
        57: aload_1
        58: getstatic     #45                 // Field ext/mods/gameserver/network/serverpackets/ExShowQuestInfo.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowQuestInfo;
        61: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        64: goto          73
        67: aload_0
        68: aload_1
        69: aload_2
        70: invokespecial #57                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        73: return
      LineNumberTable:
        line 34: 0
        line 36: 9
        line 37: 22
        line 38: 26
        line 39: 30
        line 41: 38
        line 42: 45
        line 43: 48
        line 44: 57
        line 46: 67
        line 47: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      23     3 bossLevel   I
           26      19     4 filename   Ljava/lang/String;
            0      74     0  this   Lext/mods/gameserver/model/actor/instance/Adventurer;
            0      74     1 player   Lext/mods/gameserver/model/actor/Player;
            0      74     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ int, class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 18 /* same */
        frame_type = 5 /* same */

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #60                 // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #62,  0             // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #63,  0             // InvokeDynamic #2:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #66,  0             // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 52: 0
        line 54: 4
        line 55: 8
        line 57: 19
        line 59: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/Adventurer;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */
}
SourceFile: "Adventurer.java"
BootstrapMethods:
  0: #100 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #92 html/adventurer_guildsman/raid_info/level\u0001.htm
  1: #100 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #94 \u0001
  2: #100 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #96 \u0001-\u0001
  3: #100 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #98 html/adventurer_guildsman/\u0001.htm
InnerClasses:
  public static final #111= #107 of #109; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
