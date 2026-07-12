// Bytecode for: ext.mods.gameserver.model.actor.instance.SiegeNpc
// File: ext\mods\gameserver\model\actor\instance\SiegeNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/SiegeNpc.class
  Last modified 9 de jul de 2026; size 2919 bytes
  MD5 checksum 7ea50777d5b07a6f5e757d50db01213c
  Compiled from "SiegeNpc.java"
public class ext.mods.gameserver.model.actor.instance.SiegeNpc extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/SiegeNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/instance/SiegeNpc.isLordOwner:(Lext/mods/gameserver/model/actor/Player;)Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/SiegeNpc
    #9 = NameAndType        #11:#12       // isLordOwner:(Lext/mods/gameserver/model/actor/Player;)Z
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeNpc
   #11 = Utf8               isLordOwner
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/instance/SiegeNpc.getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #14 = NameAndType        #15:#16       // getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #15 = Utf8               getSiegableHall
   #16 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
   #18 = Class              #20           // ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #19 = NameAndType        #21:#22       // isInSiege:()Z
   #20 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #21 = Utf8               isInSiege
   #22 = Utf8               ()Z
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/actor/instance/SiegeNpc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #24 = NameAndType        #25:#26       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #25 = Utf8               getCastle
   #26 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #28 = Class              #30           // ext/mods/gameserver/model/residence/castle/Castle
   #29 = NameAndType        #31:#32       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #30 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #31 = Utf8               getSiege
   #32 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #34 = Class              #36           // ext/mods/gameserver/model/residence/castle/Siege
   #35 = NameAndType        #37:#22       // isInProgress:()Z
   #36 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #37 = Utf8               isInProgress
   #38 = String             #39           // 03
   #39 = Utf8               03
   #40 = String             #41           // 01
   #41 = Utf8               01
   #42 = String             #43           // 02
   #43 = Utf8               02
   #44 = Class              #45           // ext/mods/gameserver/network/serverpackets/SiegeInfo
   #45 = Utf8               ext/mods/gameserver/network/serverpackets/SiegeInfo
   #46 = Methodref          #44.#47       // ext/mods/gameserver/network/serverpackets/SiegeInfo."<init>":(Lext/mods/gameserver/model/residence/clanhall/SiegableHall;)V
   #47 = NameAndType        #5:#48        // "<init>":(Lext/mods/gameserver/model/residence/clanhall/SiegableHall;)V
   #48 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/SiegableHall;)V
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #50 = Class              #52           // ext/mods/gameserver/model/actor/Player
   #51 = NameAndType        #53:#54       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = Utf8               ext/mods/gameserver/model/actor/Player
   #53 = Utf8               sendPacket
   #54 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = Methodref          #44.#56       // ext/mods/gameserver/network/serverpackets/SiegeInfo."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
   #56 = NameAndType        #5:#57        // "<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
   #57 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)V
   #58 = Class              #59           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #59 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #60 = Methodref          #8.#61        // ext/mods/gameserver/model/actor/instance/SiegeNpc.getObjectId:()I
   #61 = NameAndType        #62:#63       // getObjectId:()I
   #62 = Utf8               getObjectId
   #63 = Utf8               ()I
   #64 = Methodref          #58.#65       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #65 = NameAndType        #5:#66        // "<init>":(I)V
   #66 = Utf8               (I)V
   #67 = Methodref          #50.#68       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #68 = NameAndType        #69:#70       // getLocale:()Ljava/util/Locale;
   #69 = Utf8               getLocale
   #70 = Utf8               ()Ljava/util/Locale;
   #71 = InvokeDynamic      #0:#72        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #72 = NameAndType        #73:#74       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #73 = Utf8               makeConcatWithConstants
   #74 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #75 = Methodref          #58.#76       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #76 = NameAndType        #77:#78       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #77 = Utf8               setFile
   #78 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #79 = Fieldref           #80.#81       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #80 = Class              #82           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #81 = NameAndType        #83:#84       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #82 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #83 = Utf8               STATIC_PACKET
   #84 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #85 = Utf8               Code
   #86 = Utf8               LineNumberTable
   #87 = Utf8               LocalVariableTable
   #88 = Utf8               this
   #89 = Utf8               Lext/mods/gameserver/model/actor/instance/SiegeNpc;
   #90 = Utf8               objectId
   #91 = Utf8               I
   #92 = Utf8               template
   #93 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #94 = Utf8               showChatWindow
   #95 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #96 = Utf8               html
   #97 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
   #98 = Utf8               player
   #99 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #100 = Utf8               isOwningClanLeader
  #101 = Utf8               Z
  #102 = Utf8               isUnderSiege
  #103 = Utf8               htmltext
  #104 = Utf8               Ljava/lang/String;
  #105 = Utf8               StackMapTable
  #106 = Class              #107          // java/lang/String
  #107 = Utf8               java/lang/String
  #108 = Utf8               SourceFile
  #109 = Utf8               SiegeNpc.java
  #110 = Utf8               BootstrapMethods
  #111 = String             #112          // html/siege/\u0001.htm
  #112 = Utf8               html/siege/\u0001.htm
  #113 = MethodHandle       6:#114        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #114 = Methodref          #115.#116     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #115 = Class              #117          // java/lang/invoke/StringConcatFactory
  #116 = NameAndType        #73:#118      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #117 = Utf8               java/lang/invoke/StringConcatFactory
  #118 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #119 = Utf8               InnerClasses
  #120 = Class              #121          // java/lang/invoke/MethodHandles$Lookup
  #121 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #122 = Class              #123          // java/lang/invoke/MethodHandles
  #123 = Utf8               java/lang/invoke/MethodHandles
  #124 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.SiegeNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 30: 0
        line 31: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/SiegeNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #7                  // Method isLordOwner:(Lext/mods/gameserver/model/actor/Player;)Z
         5: istore_2
         6: aload_0
         7: invokevirtual #13                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        10: ifnull        23
        13: aload_0
        14: invokevirtual #13                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        17: invokevirtual #17                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
        20: ifne          43
        23: aload_0
        24: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        27: ifnull        47
        30: aload_0
        31: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        34: invokevirtual #27                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        37: invokevirtual #33                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        40: ifeq          47
        43: iconst_1
        44: goto          48
        47: iconst_0
        48: istore_3
        49: aconst_null
        50: astore        4
        52: iload_2
        53: ifeq          72
        56: iload_3
        57: ifeq          65
        60: ldc           #38                 // String 03
        62: goto          67
        65: ldc           #40                 // String 01
        67: astore        4
        69: goto          130
        72: iload_3
        73: ifeq          83
        76: ldc           #42                 // String 02
        78: astore        4
        80: goto          130
        83: aload_0
        84: invokevirtual #13                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        87: ifnull        108
        90: aload_1
        91: new           #44                 // class ext/mods/gameserver/network/serverpackets/SiegeInfo
        94: dup
        95: aload_0
        96: invokevirtual #13                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        99: invokespecial #46                 // Method ext/mods/gameserver/network/serverpackets/SiegeInfo."<init>":(Lext/mods/gameserver/model/residence/clanhall/SiegableHall;)V
       102: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       105: goto          130
       108: aload_0
       109: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       112: ifnull        130
       115: aload_1
       116: new           #44                 // class ext/mods/gameserver/network/serverpackets/SiegeInfo
       119: dup
       120: aload_0
       121: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       124: invokespecial #55                 // Method ext/mods/gameserver/network/serverpackets/SiegeInfo."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
       127: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       130: aload         4
       132: ifnull        177
       135: new           #58                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       138: dup
       139: aload_0
       140: invokevirtual #60                 // Method getObjectId:()I
       143: invokespecial #64                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       146: astore        5
       148: aload         5
       150: aload_1
       151: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       154: aload         4
       156: invokedynamic #71,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       161: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       164: aload_1
       165: aload         5
       167: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       170: aload_1
       171: getstatic     #79                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       174: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       177: return
      LineNumberTable:
        line 36: 0
        line 37: 6
        line 39: 49
        line 41: 52
        line 42: 56
        line 43: 72
        line 44: 76
        line 47: 83
        line 48: 90
        line 49: 108
        line 50: 115
        line 53: 130
        line 55: 135
        line 56: 148
        line 57: 164
        line 58: 170
        line 60: 177
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          148      29     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     178     0  this   Lext/mods/gameserver/model/actor/instance/SiegeNpc;
            0     178     1 player   Lext/mods/gameserver/model/actor/Player;
            6     172     2 isOwningClanLeader   Z
           49     129     3 isUnderSiege   Z
           52     126     4 htmltext   Ljava/lang/String;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 16
          locals = [ int, class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 4 /* same */
        frame_type = 10 /* same */
        frame_type = 24 /* same */
        frame_type = 21 /* same */
        frame_type = 46 /* same */
}
SourceFile: "SiegeNpc.java"
BootstrapMethods:
  0: #113 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #111 html/siege/\u0001.htm
InnerClasses:
  public static final #124= #120 of #122; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
