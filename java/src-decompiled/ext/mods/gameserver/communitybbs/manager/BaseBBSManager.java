// Bytecode for: ext.mods.gameserver.communitybbs.manager.BaseBBSManager
// File: ext\mods\gameserver\communitybbs\manager\BaseBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/BaseBBSManager.class
  Last modified 9 de jul de 2026; size 4303 bytes
  MD5 checksum 0de340b97b7bf5acdc4c18f83beccbb8
  Compiled from "BaseBBSManager.java"
public abstract class ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #12                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 10, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = InvokeDynamic      #0:#8         // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
    #8 = NameAndType        #9:#10        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
    #9 = Utf8               makeConcatWithConstants
   #10 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #11 = Methodref          #12.#13       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #12 = Class              #14           // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
   #13 = NameAndType        #15:#16       // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #14 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
   #15 = Utf8               separateAndSend
   #16 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #17 = Methodref          #18.#19       // java/lang/String.length:()I
   #18 = Class              #20           // java/lang/String
   #19 = NameAndType        #21:#22       // length:()I
   #20 = Utf8               java/lang/String
   #21 = Utf8               length
   #22 = Utf8               ()I
   #23 = Class              #24           // ext/mods/gameserver/network/serverpackets/ShowBoard
   #24 = Utf8               ext/mods/gameserver/network/serverpackets/ShowBoard
   #25 = String             #26           // 101
   #26 = Utf8               101
   #27 = Methodref          #23.#28       // ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #28 = NameAndType        #5:#29        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #29 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Player
   #32 = NameAndType        #34:#35       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #33 = Utf8               ext/mods/gameserver/model/actor/Player
   #34 = Utf8               sendPacket
   #35 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #36 = Fieldref           #23.#37       // ext/mods/gameserver/network/serverpackets/ShowBoard.STATIC_SHOWBOARD_102:Lext/mods/gameserver/network/serverpackets/ShowBoard;
   #37 = NameAndType        #38:#39       // STATIC_SHOWBOARD_102:Lext/mods/gameserver/network/serverpackets/ShowBoard;
   #38 = Utf8               STATIC_SHOWBOARD_102
   #39 = Utf8               Lext/mods/gameserver/network/serverpackets/ShowBoard;
   #40 = Fieldref           #23.#41       // ext/mods/gameserver/network/serverpackets/ShowBoard.STATIC_SHOWBOARD_103:Lext/mods/gameserver/network/serverpackets/ShowBoard;
   #41 = NameAndType        #42:#39       // STATIC_SHOWBOARD_103:Lext/mods/gameserver/network/serverpackets/ShowBoard;
   #42 = Utf8               STATIC_SHOWBOARD_103
   #43 = Methodref          #18.#44       // java/lang/String.substring:(II)Ljava/lang/String;
   #44 = NameAndType        #45:#46       // substring:(II)Ljava/lang/String;
   #45 = Utf8               substring
   #46 = Utf8               (II)Ljava/lang/String;
   #47 = String             #48           // 102
   #48 = Utf8               102
   #49 = String             #50           // 103
   #50 = Utf8               103
   #51 = String             #52           // 1001
   #52 = Utf8               1001
   #53 = String             #54           //
   #54 = Utf8
   #55 = String             #56           // 0
   #56 = Utf8               0
   #57 = Methodref          #12.#58       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
   #58 = NameAndType        #59:#60       // send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
   #59 = Utf8               send1002
   #60 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
   #61 = Class              #62           // java/util/ArrayList
   #62 = Utf8               java/util/ArrayList
   #63 = Methodref          #61.#3        // java/util/ArrayList."<init>":()V
   #64 = InterfaceMethodref #65.#66       // java/util/List.add:(Ljava/lang/Object;)Z
   #65 = Class              #67           // java/util/List
   #66 = NameAndType        #68:#69       // add:(Ljava/lang/Object;)Z
   #67 = Utf8               java/util/List
   #68 = Utf8               add
   #69 = Utf8               (Ljava/lang/Object;)Z
   #70 = Methodref          #31.#71       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #71 = NameAndType        #72:#73       // getName:()Ljava/lang/String;
   #72 = Utf8               getName
   #73 = Utf8               ()Ljava/lang/String;
   #74 = Methodref          #31.#75       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #75 = NameAndType        #76:#22       // getObjectId:()I
   #76 = Utf8               getObjectId
   #77 = Methodref          #78.#79       // java/lang/Integer.toString:(I)Ljava/lang/String;
   #78 = Class              #80           // java/lang/Integer
   #79 = NameAndType        #81:#82       // toString:(I)Ljava/lang/String;
   #80 = Utf8               java/lang/Integer
   #81 = Utf8               toString
   #82 = Utf8               (I)Ljava/lang/String;
   #83 = Methodref          #31.#84       // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
   #84 = NameAndType        #85:#73       // getAccountName:()Ljava/lang/String;
   #85 = Utf8               getAccountName
   #86 = String             #87           // 9
   #87 = Utf8               9
   #88 = Methodref          #23.#89       // ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/util/List;)V
   #89 = NameAndType        #5:#90        // "<init>":(Ljava/util/List;)V
   #90 = Utf8               (Ljava/util/List;)V
   #91 = Methodref          #92.#93       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #92 = Class              #94           // ext/mods/gameserver/data/HTMLData
   #93 = NameAndType        #95:#96       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #94 = Utf8               ext/mods/gameserver/data/HTMLData
   #95 = Utf8               getInstance
   #96 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #97 = Methodref          #12.#98       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.getFolder:()Ljava/lang/String;
   #98 = NameAndType        #99:#73       // getFolder:()Ljava/lang/String;
   #99 = Utf8               getFolder
  #100 = InvokeDynamic      #1:#101       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #101 = NameAndType        #9:#102       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #102 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #103 = Methodref          #92.#104      // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #104 = NameAndType        #105:#106     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #105 = Utf8               getHtm
  #106 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #107 = String             #108          //
  #108 = Utf8
  #109 = Class              #110          // ext/mods/commons/logging/CLogger
  #110 = Utf8               ext/mods/commons/logging/CLogger
  #111 = Methodref          #112.#71      // java/lang/Class.getName:()Ljava/lang/String;
  #112 = Class              #113          // java/lang/Class
  #113 = Utf8               java/lang/Class
  #114 = Methodref          #109.#115     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #115 = NameAndType        #5:#116       // "<init>":(Ljava/lang/String;)V
  #116 = Utf8               (Ljava/lang/String;)V
  #117 = Fieldref           #12.#118      // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #118 = NameAndType        #119:#120     // LOGGER:Lext/mods/commons/logging/CLogger;
  #119 = Utf8               LOGGER
  #120 = Utf8               Lext/mods/commons/logging/CLogger;
  #121 = Utf8               CB_PATH
  #122 = Utf8               Ljava/lang/String;
  #123 = Utf8               ConstantValue
  #124 = String             #125          // html/CommunityBoard/
  #125 = Utf8               html/CommunityBoard/
  #126 = Utf8               Code
  #127 = Utf8               LineNumberTable
  #128 = Utf8               LocalVariableTable
  #129 = Utf8               this
  #130 = Utf8               Lext/mods/gameserver/communitybbs/manager/BaseBBSManager;
  #131 = Utf8               parseCmd
  #132 = Utf8               command
  #133 = Utf8               player
  #134 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #135 = Utf8               parseWrite
  #136 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #137 = Utf8               ar1
  #138 = Utf8               ar2
  #139 = Utf8               ar3
  #140 = Utf8               ar4
  #141 = Utf8               ar5
  #142 = Utf8               html
  #143 = Utf8               StackMapTable
  #144 = Utf8               send1001
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #146 = Utf8               string
  #147 = Utf8               string2
  #148 = Utf8               string3
  #149 = Utf8               params
  #150 = Utf8               Ljava/util/List;
  #151 = Utf8               LocalVariableTypeTable
  #152 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #153 = Utf8               loadStaticHtm
  #154 = Utf8               file
  #155 = Utf8               <clinit>
  #156 = Utf8               SourceFile
  #157 = Utf8               BaseBBSManager.java
  #158 = Utf8               BootstrapMethods
  #159 = String             #160          // <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
  #160 = Utf8               <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
  #161 = String             #162          // html/CommunityBoard/\u0001\u0001
  #162 = Utf8               html/CommunityBoard/\u0001\u0001
  #163 = MethodHandle       6:#164        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #164 = Methodref          #165.#166     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #165 = Class              #167          // java/lang/invoke/StringConcatFactory
  #166 = NameAndType        #9:#168       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #167 = Utf8               java/lang/invoke/StringConcatFactory
  #168 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #169 = Utf8               InnerClasses
  #170 = Class              #171          // java/lang/invoke/MethodHandles$Lookup
  #171 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #172 = Class              #173          // java/lang/invoke/MethodHandles
  #173 = Utf8               java/lang/invoke/MethodHandles
  #174 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected static final java.lang.String CB_PATH;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String html/CommunityBoard/

  public ext.mods.gameserver.communitybbs.manager.BaseBBSManager();
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
            0       5     0  this   Lext/mods/gameserver/communitybbs/manager/BaseBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: invokedynamic #7,  0              // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         6: aload_2
         7: invokestatic  #11                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        10: return
      LineNumberTable:
        line 37: 0
        line 38: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/communitybbs/manager/BaseBBSManager;
            0      11     1 command   Ljava/lang/String;
            0      11     2 player   Lext/mods/gameserver/model/actor/Player;

  public void parseWrite(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=7
         0: aload_1
         1: invokedynamic #7,  0              // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         6: aload         6
         8: invokestatic  #11                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        11: return
      LineNumberTable:
        line 42: 0
        line 43: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/communitybbs/manager/BaseBBSManager;
            0      12     1   ar1   Ljava/lang/String;
            0      12     2   ar2   Ljava/lang/String;
            0      12     3   ar3   Ljava/lang/String;
            0      12     4   ar4   Ljava/lang/String;
            0      12     5   ar5   Ljava/lang/String;
            0      12     6 player   Lext/mods/gameserver/model/actor/Player;

  public static void separateAndSend(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: ifnull        8
         4: aload_1
         5: ifnonnull     9
         8: return
         9: aload_0
        10: invokevirtual #17                 // Method java/lang/String.length:()I
        13: sipush        4090
        16: if_icmpge     50
        19: aload_1
        20: new           #23                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
        23: dup
        24: aload_0
        25: ldc           #25                 // String 101
        27: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        30: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        33: aload_1
        34: getstatic     #36                 // Field ext/mods/gameserver/network/serverpackets/ShowBoard.STATIC_SHOWBOARD_102:Lext/mods/gameserver/network/serverpackets/ShowBoard;
        37: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        40: aload_1
        41: getstatic     #40                 // Field ext/mods/gameserver/network/serverpackets/ShowBoard.STATIC_SHOWBOARD_103:Lext/mods/gameserver/network/serverpackets/ShowBoard;
        44: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        47: goto          193
        50: aload_0
        51: invokevirtual #17                 // Method java/lang/String.length:()I
        54: sipush        8180
        57: if_icmpge     115
        60: aload_1
        61: new           #23                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
        64: dup
        65: aload_0
        66: iconst_0
        67: sipush        4090
        70: invokevirtual #43                 // Method java/lang/String.substring:(II)Ljava/lang/String;
        73: ldc           #25                 // String 101
        75: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        78: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        81: aload_1
        82: new           #23                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
        85: dup
        86: aload_0
        87: sipush        4090
        90: aload_0
        91: invokevirtual #17                 // Method java/lang/String.length:()I
        94: invokevirtual #43                 // Method java/lang/String.substring:(II)Ljava/lang/String;
        97: ldc           #47                 // String 102
        99: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       102: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       105: aload_1
       106: getstatic     #40                 // Field ext/mods/gameserver/network/serverpackets/ShowBoard.STATIC_SHOWBOARD_103:Lext/mods/gameserver/network/serverpackets/ShowBoard;
       109: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       112: goto          193
       115: aload_0
       116: invokevirtual #17                 // Method java/lang/String.length:()I
       119: sipush        12270
       122: if_icmpge     193
       125: aload_1
       126: new           #23                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
       129: dup
       130: aload_0
       131: iconst_0
       132: sipush        4090
       135: invokevirtual #43                 // Method java/lang/String.substring:(II)Ljava/lang/String;
       138: ldc           #25                 // String 101
       140: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       143: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       146: aload_1
       147: new           #23                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
       150: dup
       151: aload_0
       152: sipush        4090
       155: sipush        8180
       158: invokevirtual #43                 // Method java/lang/String.substring:(II)Ljava/lang/String;
       161: ldc           #47                 // String 102
       163: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       166: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       169: aload_1
       170: new           #23                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
       173: dup
       174: aload_0
       175: sipush        8180
       178: aload_0
       179: invokevirtual #17                 // Method java/lang/String.length:()I
       182: invokevirtual #43                 // Method java/lang/String.substring:(II)Ljava/lang/String;
       185: ldc           #49                 // String 103
       187: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       190: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       193: return
      LineNumberTable:
        line 47: 0
        line 48: 8
        line 50: 9
        line 52: 19
        line 53: 33
        line 54: 40
        line 56: 50
        line 58: 60
        line 59: 81
        line 60: 105
        line 62: 115
        line 64: 125
        line 65: 146
        line 66: 169
        line 68: 193
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     194     0  html   Ljava/lang/String;
            0     194     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 0 /* same */
        frame_type = 40 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 251 /* same_frame_extended */
          offset_delta = 77

  protected static void send1001(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #17                 // Method java/lang/String.length:()I
         4: sipush        8180
         7: if_icmpge     24
        10: aload_1
        11: new           #23                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
        14: dup
        15: aload_0
        16: ldc           #51                 // String 1001
        18: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        21: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        24: return
      LineNumberTable:
        line 72: 0
        line 73: 10
        line 74: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  html   Ljava/lang/String;
            0      25     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  protected static void send1002(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: ldc           #53                 // String
         3: ldc           #53                 // String
         5: ldc           #55                 // String 0
         7: invokestatic  #57                 // Method send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        10: return
      LineNumberTable:
        line 78: 0
        line 79: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0 player   Lext/mods/gameserver/model/actor/Player;

  protected static void send1002(ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Code:
      stack=4, locals=5, args_size=4
         0: new           #61                 // class java/util/ArrayList
         3: dup
         4: invokespecial #63                 // Method java/util/ArrayList."<init>":()V
         7: astore        4
         9: aload         4
        11: ldc           #55                 // String 0
        13: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        18: pop
        19: aload         4
        21: ldc           #55                 // String 0
        23: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        28: pop
        29: aload         4
        31: ldc           #55                 // String 0
        33: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        38: pop
        39: aload         4
        41: ldc           #55                 // String 0
        43: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        48: pop
        49: aload         4
        51: ldc           #55                 // String 0
        53: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        58: pop
        59: aload         4
        61: ldc           #55                 // String 0
        63: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        68: pop
        69: aload         4
        71: aload_0
        72: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        75: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        80: pop
        81: aload         4
        83: aload_0
        84: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        87: invokestatic  #77                 // Method java/lang/Integer.toString:(I)Ljava/lang/String;
        90: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        95: pop
        96: aload         4
        98: aload_0
        99: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
       102: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       107: pop
       108: aload         4
       110: ldc           #86                 // String 9
       112: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       117: pop
       118: aload         4
       120: aload_2
       121: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       126: pop
       127: aload         4
       129: aload_2
       130: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       135: pop
       136: aload         4
       138: aload_1
       139: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       144: pop
       145: aload         4
       147: aload_3
       148: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       153: pop
       154: aload         4
       156: aload_3
       157: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       162: pop
       163: aload         4
       165: ldc           #55                 // String 0
       167: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       172: pop
       173: aload         4
       175: ldc           #55                 // String 0
       177: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       182: pop
       183: aload_0
       184: new           #23                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
       187: dup
       188: aload         4
       190: invokespecial #88                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":(Ljava/util/List;)V
       193: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       196: return
      LineNumberTable:
        line 83: 0
        line 84: 9
        line 85: 19
        line 86: 29
        line 87: 39
        line 88: 49
        line 89: 59
        line 90: 69
        line 91: 81
        line 92: 96
        line 93: 108
        line 94: 118
        line 95: 127
        line 96: 136
        line 97: 145
        line 98: 154
        line 99: 163
        line 100: 173
        line 102: 183
        line 103: 196
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     197     0 player   Lext/mods/gameserver/model/actor/Player;
            0     197     1 string   Ljava/lang/String;
            0     197     2 string2   Ljava/lang/String;
            0     197     3 string3   Ljava/lang/String;
            9     188     4 params   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     188     4 params   Ljava/util/List<Ljava/lang/String;>;

  protected void loadStaticHtm(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=3, args_size=3
         0: invokestatic  #91                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
         3: aload_2
         4: aload_0
         5: invokevirtual #97                 // Method getFolder:()Ljava/lang/String;
         8: aload_1
         9: invokedynamic #100,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        14: invokevirtual #103                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        17: aload_2
        18: invokestatic  #11                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        21: return
      LineNumberTable:
        line 112: 0
        line 113: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/communitybbs/manager/BaseBBSManager;
            0      22     1  file   Ljava/lang/String;
            0      22     2 player   Lext/mods/gameserver/model/actor/Player;

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #107                // String
         2: areturn
      LineNumberTable:
        line 121: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/manager/BaseBBSManager;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #109                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #12                 // class ext/mods/gameserver/communitybbs/manager/BaseBBSManager
         6: invokevirtual #111                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #114                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #117                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "BaseBBSManager.java"
BootstrapMethods:
  0: #163 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #159 <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
  1: #163 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #161 html/CommunityBoard/\u0001\u0001
InnerClasses:
  public static final #174= #170 of #172; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
