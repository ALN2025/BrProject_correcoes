// Bytecode for: ext.mods.gameserver.model.actor.instance.Gatekeeper
// File: ext\mods\gameserver\model\actor\instance\Gatekeeper.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Gatekeeper.class
  Last modified 9 de jul de 2026; size 2196 bytes
  MD5 checksum 5f7b3b4c5909e0003e8f04a2104a2e13
  Compiled from "Gatekeeper.java"
public final class ext.mods.gameserver.model.actor.instance.Gatekeeper extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #34                         // ext/mods/gameserver/model/actor/instance/Gatekeeper
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Folk
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = String             #8             //
   #8 = Utf8
   #9 = InvokeDynamic      #0:#10         // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #10 = NameAndType        #11:#12        // makeConcatWithConstants:(I)Ljava/lang/String;
  #11 = Utf8               makeConcatWithConstants
  #12 = Utf8               (I)Ljava/lang/String;
  #13 = InvokeDynamic      #1:#14         // #1:makeConcatWithConstants:(II)Ljava/lang/String;
  #14 = NameAndType        #11:#15        // makeConcatWithConstants:(II)Ljava/lang/String;
  #15 = Utf8               (II)Ljava/lang/String;
  #16 = InvokeDynamic      #2:#17         // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #17 = NameAndType        #11:#18        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #18 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #19 = Fieldref           #20.#21        // ext/mods/Config.KARMA_PLAYER_CAN_USE_GK:Z
  #20 = Class              #22            // ext/mods/Config
  #21 = NameAndType        #23:#24        // KARMA_PLAYER_CAN_USE_GK:Z
  #22 = Utf8               ext/mods/Config
  #23 = Utf8               KARMA_PLAYER_CAN_USE_GK
  #24 = Utf8               Z
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #26 = Class              #28            // ext/mods/gameserver/model/actor/Player
  #27 = NameAndType        #29:#30        // getKarma:()I
  #28 = Utf8               ext/mods/gameserver/model/actor/Player
  #29 = Utf8               getKarma
  #30 = Utf8               ()I
  #31 = String             #32            // gatekeeper
  #32 = Utf8               gatekeeper
  #33 = Methodref          #34.#35        // ext/mods/gameserver/model/actor/instance/Gatekeeper.showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #34 = Class              #36            // ext/mods/gameserver/model/actor/instance/Gatekeeper
  #35 = NameAndType        #37:#38        // showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #36 = Utf8               ext/mods/gameserver/model/actor/instance/Gatekeeper
  #37 = Utf8               showPkDenyChatWindow
  #38 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #39 = Methodref          #2.#40         // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #40 = NameAndType        #41:#42        // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #41 = Utf8               onBypassFeedback
  #42 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #43 = Methodref          #34.#44        // ext/mods/gameserver/model/actor/instance/Gatekeeper.getNpcId:()I
  #44 = NameAndType        #45:#30        // getNpcId:()I
  #45 = Utf8               getNpcId
  #46 = Methodref          #34.#47        // ext/mods/gameserver/model/actor/instance/Gatekeeper.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #47 = NameAndType        #48:#49        // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #48 = Utf8               getHtmlPath
  #49 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #50 = Methodref          #34.#51        // ext/mods/gameserver/model/actor/instance/Gatekeeper.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #51 = NameAndType        #52:#42        // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #52 = Utf8               showChatWindow
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               LocalVariableTable
  #56 = Utf8               this
  #57 = Utf8               Lext/mods/gameserver/model/actor/instance/Gatekeeper;
  #58 = Utf8               objectId
  #59 = Utf8               I
  #60 = Utf8               template
  #61 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #62 = Utf8               player
  #63 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #64 = Utf8               npcId
  #65 = Utf8               val
  #66 = Utf8               filename
  #67 = Utf8               Ljava/lang/String;
  #68 = Utf8               StackMapTable
  #69 = Class              #70            // java/lang/String
  #70 = Utf8               java/lang/String
  #71 = Utf8               command
  #72 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #73 = Utf8               SourceFile
  #74 = Utf8               Gatekeeper.java
  #75 = Utf8               BootstrapMethods
  #76 = String             #77            // \u0001
  #77 = Utf8               \u0001
  #78 = String             #79            // \u0001-\u0001
  #79 = Utf8               \u0001-\u0001
  #80 = String             #81            // html/gatekeeper/\u0001.htm
  #81 = Utf8               html/gatekeeper/\u0001.htm
  #82 = MethodHandle       6:#83          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #83 = Methodref          #84.#85        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #84 = Class              #86            // java/lang/invoke/StringConcatFactory
  #85 = NameAndType        #11:#87        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #86 = Utf8               java/lang/invoke/StringConcatFactory
  #87 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #88 = Utf8               InnerClasses
  #89 = Class              #90            // java/lang/invoke/MethodHandles$Lookup
  #90 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #91 = Class              #92            // java/lang/invoke/MethodHandles
  #92 = Utf8               java/lang/invoke/MethodHandles
  #93 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Gatekeeper(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 33: 0
        line 34: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Gatekeeper;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #7                  // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #9,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #13,  0             // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #16,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 39: 0
        line 40: 4
        line 41: 8
        line 43: 19
        line 45: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/Gatekeeper;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: getstatic     #19                 // Field ext/mods/Config.KARMA_PLAYER_CAN_USE_GK:Z
         3: ifne          24
         6: aload_1
         7: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        10: ifle          24
        13: aload_0
        14: aload_1
        15: ldc           #31                 // String gatekeeper
        17: invokevirtual #33                 // Method showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        20: ifeq          24
        23: return
        24: aload_0
        25: aload_1
        26: aload_2
        27: invokespecial #39                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        30: return
      LineNumberTable:
        line 51: 0
        line 52: 23
        line 54: 24
        line 55: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/instance/Gatekeeper;
            0      31     1 player   Lext/mods/gameserver/model/actor/Player;
            0      31     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: getstatic     #19                 // Field ext/mods/Config.KARMA_PLAYER_CAN_USE_GK:Z
         3: ifne          24
         6: aload_1
         7: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        10: ifle          24
        13: aload_0
        14: aload_1
        15: ldc           #31                 // String gatekeeper
        17: invokevirtual #33                 // Method showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        20: ifeq          24
        23: return
        24: aload_0
        25: aload_1
        26: aload_0
        27: aload_1
        28: aload_0
        29: invokevirtual #43                 // Method getNpcId:()I
        32: iload_2
        33: invokevirtual #46                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        36: invokevirtual #50                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        39: return
      LineNumberTable:
        line 60: 0
        line 61: 23
        line 63: 24
        line 64: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/actor/instance/Gatekeeper;
            0      40     1 player   Lext/mods/gameserver/model/actor/Player;
            0      40     2   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */
}
SourceFile: "Gatekeeper.java"
BootstrapMethods:
  0: #82 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #76 \u0001
  1: #82 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #78 \u0001-\u0001
  2: #82 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #80 html/gatekeeper/\u0001.htm
InnerClasses:
  public static final #93= #89 of #91;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
