// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminManor
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminManor.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminManor.class
  Last modified 9 de jul de 2026; size 3535 bytes
  MD5 checksum 9ac7b767ce88bf601c6789878eb6f3da
  Compiled from "AdminManor.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminManor implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #126                        // ext/mods/gameserver/handler/admincommandhandlers/AdminManor
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_manor
    #8 = Utf8               admin_manor
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Class              #16           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #16 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #17 = Methodref          #15.#18       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #18 = NameAndType        #5:#19        // "<init>":(I)V
   #19 = Utf8               (I)V
   #20 = Methodref          #21.#22       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #21 = Class              #23           // ext/mods/gameserver/model/actor/Player
   #22 = NameAndType        #24:#25       // getLocale:()Ljava/util/Locale;
   #23 = Utf8               ext/mods/gameserver/model/actor/Player
   #24 = Utf8               getLocale
   #25 = Utf8               ()Ljava/util/Locale;
   #26 = String             #27           // html/admin/manor.htm
   #27 = Utf8               html/admin/manor.htm
   #28 = Methodref          #15.#29       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #29 = NameAndType        #30:#31       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #30 = Utf8               setFile
   #31 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #32 = String             #33           // %status%
   #33 = Utf8               %status%
   #34 = Methodref          #35.#36       // ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #35 = Class              #37           // ext/mods/gameserver/data/manager/CastleManorManager
   #36 = NameAndType        #38:#39       // getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #37 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
   #38 = Utf8               getInstance
   #39 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManorManager;
   #40 = Methodref          #35.#41       // ext/mods/gameserver/data/manager/CastleManorManager.getCurrentModeName:()Ljava/lang/String;
   #41 = NameAndType        #42:#43       // getCurrentModeName:()Ljava/lang/String;
   #42 = Utf8               getCurrentModeName
   #43 = Utf8               ()Ljava/lang/String;
   #44 = Methodref          #15.#45       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #45 = NameAndType        #46:#47       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #46 = Utf8               replace
   #47 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #48 = String             #49           // %change%
   #49 = Utf8               %change%
   #50 = Methodref          #35.#51       // ext/mods/gameserver/data/manager/CastleManorManager.getNextModeChange:()Ljava/lang/String;
   #51 = NameAndType        #52:#43       // getNextModeChange:()Ljava/lang/String;
   #52 = Utf8               getNextModeChange
   #53 = Class              #54           // java/lang/StringBuilder
   #54 = Utf8               java/lang/StringBuilder
   #55 = Methodref          #53.#18       // java/lang/StringBuilder."<init>":(I)V
   #56 = Methodref          #57.#58       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #57 = Class              #59           // ext/mods/gameserver/data/manager/CastleManager
   #58 = NameAndType        #38:#60       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #59 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #60 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #61 = Methodref          #57.#62       // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
   #62 = NameAndType        #63:#64       // getCastles:()Ljava/util/Collection;
   #63 = Utf8               getCastles
   #64 = Utf8               ()Ljava/util/Collection;
   #65 = InterfaceMethodref #66.#67       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #66 = Class              #68           // java/util/Collection
   #67 = NameAndType        #69:#70       // iterator:()Ljava/util/Iterator;
   #68 = Utf8               java/util/Collection
   #69 = Utf8               iterator
   #70 = Utf8               ()Ljava/util/Iterator;
   #71 = InterfaceMethodref #72.#73       // java/util/Iterator.hasNext:()Z
   #72 = Class              #74           // java/util/Iterator
   #73 = NameAndType        #75:#76       // hasNext:()Z
   #74 = Utf8               java/util/Iterator
   #75 = Utf8               hasNext
   #76 = Utf8               ()Z
   #77 = InterfaceMethodref #72.#78       // java/util/Iterator.next:()Ljava/lang/Object;
   #78 = NameAndType        #79:#80       // next:()Ljava/lang/Object;
   #79 = Utf8               next
   #80 = Utf8               ()Ljava/lang/Object;
   #81 = Class              #82           // ext/mods/gameserver/model/residence/castle/Castle
   #82 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #83 = Methodref          #81.#84       // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
   #84 = NameAndType        #85:#43       // getName:()Ljava/lang/String;
   #85 = Utf8               getName
   #86 = InvokeDynamic      #0:#87        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #87 = NameAndType        #88:#89       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #88 = Utf8               makeConcatWithConstants
   #89 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #90 = Methodref          #91.#92       // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #91 = Class              #93           // ext/mods/commons/lang/StringUtil
   #92 = NameAndType        #94:#95       // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #93 = Utf8               ext/mods/commons/lang/StringUtil
   #94 = Utf8               append
   #95 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #96 = String             #97           // <tr><td>Current period cost:</td><td><font color=FF9900>
   #97 = Utf8               <tr><td>Current period cost:</td><td><font color=FF9900>
   #98 = Methodref          #81.#99       // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
   #99 = NameAndType        #100:#101     // getId:()I
  #100 = Utf8               getId
  #101 = Utf8               ()I
  #102 = Methodref          #35.#103      // ext/mods/gameserver/data/manager/CastleManorManager.getManorCost:(IZ)J
  #103 = NameAndType        #104:#105     // getManorCost:(IZ)J
  #104 = Utf8               getManorCost
  #105 = Utf8               (IZ)J
  #106 = Methodref          #91.#107      // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #107 = NameAndType        #108:#109     // formatNumber:(J)Ljava/lang/String;
  #108 = Utf8               formatNumber
  #109 = Utf8               (J)Ljava/lang/String;
  #110 = String             #111          //  Adena</font></td></tr>
  #111 = Utf8                Adena</font></td></tr>
  #112 = String             #113          // <tr><td>Next period cost:</td><td><font color=FF9900>
  #113 = Utf8               <tr><td>Next period cost:</td><td><font color=FF9900>
  #114 = String             #115          // <tr><td>&nbsp;</td></tr>
  #115 = Utf8               <tr><td>&nbsp;</td></tr>
  #116 = String             #117          // %castleInfo%
  #117 = Utf8               %castleInfo%
  #118 = Methodref          #53.#119      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #119 = NameAndType        #120:#43      // toString:()Ljava/lang/String;
  #120 = Utf8               toString
  #121 = Methodref          #21.#122      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #122 = NameAndType        #123:#124     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #123 = Utf8               sendPacket
  #124 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #125 = Fieldref           #126.#127     // ext/mods/gameserver/handler/admincommandhandlers/AdminManor.ADMIN_COMMANDS:[Ljava/lang/String;
  #126 = Class              #128          // ext/mods/gameserver/handler/admincommandhandlers/AdminManor
  #127 = NameAndType        #129:#130     // ADMIN_COMMANDS:[Ljava/lang/String;
  #128 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminManor
  #129 = Utf8               ADMIN_COMMANDS
  #130 = Utf8               [Ljava/lang/String;
  #131 = Class              #132          // ext/mods/gameserver/handler/IAdminCommandHandler
  #132 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #133 = Utf8               Code
  #134 = Utf8               LineNumberTable
  #135 = Utf8               LocalVariableTable
  #136 = Utf8               this
  #137 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminManor;
  #138 = Utf8               useAdminCommand
  #139 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #140 = Utf8               castle
  #141 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #142 = Utf8               html
  #143 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #144 = Utf8               sb
  #145 = Utf8               Ljava/lang/StringBuilder;
  #146 = Utf8               command
  #147 = Utf8               Ljava/lang/String;
  #148 = Utf8               player
  #149 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #150 = Utf8               StackMapTable
  #151 = Utf8               getAdminCommandList
  #152 = Utf8               ()[Ljava/lang/String;
  #153 = Utf8               <clinit>
  #154 = Utf8               SourceFile
  #155 = Utf8               AdminManor.java
  #156 = Utf8               BootstrapMethods
  #157 = String             #158          // <tr><td width=110>Name:</td><td width=160><font color=008000>\u0001</font></td></tr>
  #158 = Utf8               <tr><td width=110>Name:</td><td width=160><font color=008000>\u0001</font></td></tr>
  #159 = MethodHandle       6:#160        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #160 = Methodref          #161.#162     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #161 = Class              #163          // java/lang/invoke/StringConcatFactory
  #162 = NameAndType        #88:#164      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #163 = Utf8               java/lang/invoke/StringConcatFactory
  #164 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #165 = Utf8               InnerClasses
  #166 = Class              #167          // java/lang/invoke/MethodHandles$Lookup
  #167 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #168 = Class              #169          // java/lang/invoke/MethodHandles
  #169 = Utf8               java/lang/invoke/MethodHandles
  #170 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminManor();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminManor;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_manor
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          228
         9: new           #15                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        12: dup
        13: iconst_0
        14: invokespecial #17                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        17: astore_3
        18: aload_3
        19: aload_2
        20: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        23: ldc           #26                 // String html/admin/manor.htm
        25: invokevirtual #28                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        28: aload_3
        29: ldc           #32                 // String %status%
        31: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
        34: invokevirtual #40                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getCurrentModeName:()Ljava/lang/String;
        37: invokevirtual #44                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        40: aload_3
        41: ldc           #48                 // String %change%
        43: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
        46: invokevirtual #50                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getNextModeChange:()Ljava/lang/String;
        49: invokevirtual #44                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        52: new           #53                 // class java/lang/StringBuilder
        55: dup
        56: sipush        3400
        59: invokespecial #55                 // Method java/lang/StringBuilder."<init>":(I)V
        62: astore        4
        64: invokestatic  #56                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        67: invokevirtual #61                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
        70: invokeinterface #65,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        75: astore        5
        77: aload         5
        79: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        84: ifeq          212
        87: aload         5
        89: invokeinterface #77,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        94: checkcast     #81                 // class ext/mods/gameserver/model/residence/castle/Castle
        97: astore        6
        99: aload         4
       101: iconst_1
       102: anewarray     #2                  // class java/lang/Object
       105: dup
       106: iconst_0
       107: aload         6
       109: invokevirtual #83                 // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
       112: invokedynamic #86,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       117: aastore
       118: invokestatic  #90                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       121: aload         4
       123: iconst_3
       124: anewarray     #2                  // class java/lang/Object
       127: dup
       128: iconst_0
       129: ldc           #96                 // String <tr><td>Current period cost:</td><td><font color=FF9900>
       131: aastore
       132: dup
       133: iconst_1
       134: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
       137: aload         6
       139: invokevirtual #98                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       142: iconst_0
       143: invokevirtual #102                // Method ext/mods/gameserver/data/manager/CastleManorManager.getManorCost:(IZ)J
       146: invokestatic  #106                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       149: aastore
       150: dup
       151: iconst_2
       152: ldc           #110                // String  Adena</font></td></tr>
       154: aastore
       155: invokestatic  #90                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       158: aload         4
       160: iconst_3
       161: anewarray     #2                  // class java/lang/Object
       164: dup
       165: iconst_0
       166: ldc           #112                // String <tr><td>Next period cost:</td><td><font color=FF9900>
       168: aastore
       169: dup
       170: iconst_1
       171: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
       174: aload         6
       176: invokevirtual #98                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       179: iconst_1
       180: invokevirtual #102                // Method ext/mods/gameserver/data/manager/CastleManorManager.getManorCost:(IZ)J
       183: invokestatic  #106                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       186: aastore
       187: dup
       188: iconst_2
       189: ldc           #110                // String  Adena</font></td></tr>
       191: aastore
       192: invokestatic  #90                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       195: aload         4
       197: iconst_1
       198: anewarray     #2                  // class java/lang/Object
       201: dup
       202: iconst_0
       203: ldc           #114                // String <tr><td>&nbsp;</td></tr>
       205: aastore
       206: invokestatic  #90                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       209: goto          77
       212: aload_3
       213: ldc           #116                // String %castleInfo%
       215: aload         4
       217: invokevirtual #118                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       220: invokevirtual #44                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       223: aload_2
       224: aload_3
       225: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       228: return
      LineNumberTable:
        line 39: 0
        line 41: 9
        line 42: 18
        line 43: 28
        line 44: 40
        line 46: 52
        line 47: 64
        line 49: 99
        line 50: 121
        line 51: 158
        line 52: 195
        line 53: 209
        line 54: 212
        line 56: 223
        line 58: 228
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           99     110     6 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           18     210     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           64     164     4    sb   Ljava/lang/StringBuilder;
            0     229     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminManor;
            0     229     1 command   Ljava/lang/String;
            0     229     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 77
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 134
        frame_type = 249 /* chop */
          offset_delta = 15

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #125                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminManor;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_manor
         8: aastore
         9: putstatic     #125                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "AdminManor.java"
BootstrapMethods:
  0: #159 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #157 <tr><td width=110>Name:</td><td width=160><font color=008000>\u0001</font></td></tr>
InnerClasses:
  public static final #170= #166 of #168; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
