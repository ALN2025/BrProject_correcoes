// Bytecode for: ext.mods.gameserver.model.actor.instance.Doorman
// File: ext\mods\gameserver\model\actor\instance\Doorman.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Doorman.class
  Last modified 9 de jul de 2026; size 4264 bytes
  MD5 checksum 552a71c9a1861a7ad1ddbcbbd541e200
  Compiled from "Doorman.java"
public class ext.mods.gameserver.model.actor.instance.Doorman extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/actor/instance/Doorman
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            // open_doors
    #8 = Utf8               open_doors
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/instance/Doorman.openDoors:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #16 = Class              #18           // ext/mods/gameserver/model/actor/instance/Doorman
   #17 = NameAndType        #19:#20       // openDoors:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #18 = Utf8               ext/mods/gameserver/model/actor/instance/Doorman
   #19 = Utf8               openDoors
   #20 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #21 = String             #22           // close_doors
   #22 = Utf8               close_doors
   #23 = Methodref          #16.#24       // ext/mods/gameserver/model/actor/instance/Doorman.closeDoors:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #24 = NameAndType        #25:#20       // closeDoors:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #25 = Utf8               closeDoors
   #26 = Methodref          #2.#27        // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #27 = NameAndType        #28:#20       // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #28 = Utf8               onBypassFeedback
   #29 = Class              #30           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #30 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #31 = Methodref          #16.#32       // ext/mods/gameserver/model/actor/instance/Doorman.getObjectId:()I
   #32 = NameAndType        #33:#34       // getObjectId:()I
   #33 = Utf8               getObjectId
   #34 = Utf8               ()I
   #35 = Methodref          #29.#36       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #36 = NameAndType        #5:#37        // "<init>":(I)V
   #37 = Utf8               (I)V
   #38 = Methodref          #39.#40       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #39 = Class              #41           // ext/mods/gameserver/model/actor/Player
   #40 = NameAndType        #42:#43       // getLocale:()Ljava/util/Locale;
   #41 = Utf8               ext/mods/gameserver/model/actor/Player
   #42 = Utf8               getLocale
   #43 = Utf8               ()Ljava/util/Locale;
   #44 = Methodref          #16.#45       // ext/mods/gameserver/model/actor/instance/Doorman.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #45 = NameAndType        #46:#47       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #46 = Utf8               getTemplate
   #47 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #49 = Class              #51           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #50 = NameAndType        #52:#34       // getNpcId:()I
   #51 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #52 = Utf8               getNpcId
   #53 = Methodref          #16.#54       // ext/mods/gameserver/model/actor/instance/Doorman.isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
   #54 = NameAndType        #55:#56       // isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
   #55 = Utf8               isOwnerClan
   #56 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #57 = String             #58           // -no.htm
   #58 = Utf8               -no.htm
   #59 = String             #60           // .htm
   #60 = Utf8               .htm
   #61 = InvokeDynamic      #0:#62        // #0:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #62 = NameAndType        #63:#64       // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #63 = Utf8               makeConcatWithConstants
   #64 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
   #65 = Methodref          #29.#66       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #66 = NameAndType        #67:#68       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #67 = Utf8               setFile
   #68 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #69 = String             #70           // %objectId%
   #70 = Utf8               %objectId%
   #71 = Methodref          #29.#72       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #72 = NameAndType        #73:#74       // replace:(Ljava/lang/String;I)V
   #73 = Utf8               replace
   #74 = Utf8               (Ljava/lang/String;I)V
   #75 = Methodref          #39.#76       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #76 = NameAndType        #77:#78       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #77 = Utf8               sendPacket
   #78 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #79 = Fieldref           #80.#81       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #80 = Class              #82           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #81 = NameAndType        #83:#84       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #82 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #83 = Utf8               STATIC_PACKET
   #84 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #85 = Class              #86           // java/util/StringTokenizer
   #86 = Utf8               java/util/StringTokenizer
   #87 = Methodref          #10.#88       // java/lang/String.substring:(I)Ljava/lang/String;
   #88 = NameAndType        #89:#90       // substring:(I)Ljava/lang/String;
   #89 = Utf8               substring
   #90 = Utf8               (I)Ljava/lang/String;
   #91 = String             #92           // ,
   #92 = Utf8               ,
   #93 = Methodref          #85.#94       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #94 = NameAndType        #5:#95        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #95 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #96 = Methodref          #85.#97       // java/util/StringTokenizer.hasMoreTokens:()Z
   #97 = NameAndType        #98:#99       // hasMoreTokens:()Z
   #98 = Utf8               hasMoreTokens
   #99 = Utf8               ()Z
  #100 = Methodref          #101.#102     // ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
  #101 = Class              #103          // ext/mods/gameserver/data/xml/DoorData
  #102 = NameAndType        #104:#105     // getInstance:()Lext/mods/gameserver/data/xml/DoorData;
  #103 = Utf8               ext/mods/gameserver/data/xml/DoorData
  #104 = Utf8               getInstance
  #105 = Utf8               ()Lext/mods/gameserver/data/xml/DoorData;
  #106 = Methodref          #85.#107      // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #107 = NameAndType        #108:#109     // nextToken:()Ljava/lang/String;
  #108 = Utf8               nextToken
  #109 = Utf8               ()Ljava/lang/String;
  #110 = Methodref          #111.#112     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #111 = Class              #113          // java/lang/Integer
  #112 = NameAndType        #114:#115     // parseInt:(Ljava/lang/String;)I
  #113 = Utf8               java/lang/Integer
  #114 = Utf8               parseInt
  #115 = Utf8               (Ljava/lang/String;)I
  #116 = Methodref          #101.#117     // ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
  #117 = NameAndType        #118:#119     // getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
  #118 = Utf8               getDoor
  #119 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
  #120 = Methodref          #121.#122     // ext/mods/gameserver/model/actor/instance/Door.openMe:()V
  #121 = Class              #123          // ext/mods/gameserver/model/actor/instance/Door
  #122 = NameAndType        #124:#125     // openMe:()V
  #123 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #124 = Utf8               openMe
  #125 = Utf8               ()V
  #126 = Methodref          #121.#127     // ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
  #127 = NameAndType        #128:#125     // closeMe:()V
  #128 = Utf8               closeMe
  #129 = Methodref          #16.#50       // ext/mods/gameserver/model/actor/instance/Doorman.getNpcId:()I
  #130 = InvokeDynamic      #1:#131       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #131 = NameAndType        #63:#90       // makeConcatWithConstants:(I)Ljava/lang/String;
  #132 = Methodref          #133.#134     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #133 = Class              #135          // ext/mods/gameserver/data/HTMLData
  #134 = NameAndType        #104:#136     // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #135 = Utf8               ext/mods/gameserver/data/HTMLData
  #136 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #137 = Methodref          #133.#138     // ext/mods/gameserver/data/HTMLData.exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #138 = NameAndType        #139:#140     // exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #139 = Utf8               exists
  #140 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #141 = String             #142          // html/doormen/busy.htm
  #142 = Utf8               html/doormen/busy.htm
  #143 = Utf8               Code
  #144 = Utf8               LineNumberTable
  #145 = Utf8               LocalVariableTable
  #146 = Utf8               this
  #147 = Utf8               Lext/mods/gameserver/model/actor/instance/Doorman;
  #148 = Utf8               objectId
  #149 = Utf8               I
  #150 = Utf8               template
  #151 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #152 = Utf8               player
  #153 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #154 = Utf8               command
  #155 = Utf8               Ljava/lang/String;
  #156 = Utf8               StackMapTable
  #157 = Utf8               showChatWindow
  #158 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #159 = Utf8               html
  #160 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #161 = Class              #162          // java/util/Locale
  #162 = Utf8               java/util/Locale
  #163 = Utf8               isTeleportAllowed
  #164 = Utf8               st
  #165 = Utf8               Ljava/util/StringTokenizer;
  #166 = Utf8               cannotManageDoors
  #167 = Utf8               path
  #168 = Utf8               isUnderSiege
  #169 = Utf8               SourceFile
  #170 = Utf8               Doorman.java
  #171 = Utf8               BootstrapMethods
  #172 = String             #173          // html/doormen/\u0001\u0001
  #173 = Utf8               html/doormen/\u0001\u0001
  #174 = String             #175          // html/doormen/\u0001-busy.htm
  #175 = Utf8               html/doormen/\u0001-busy.htm
  #176 = MethodHandle       6:#177        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #177 = Methodref          #178.#179     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #178 = Class              #180          // java/lang/invoke/StringConcatFactory
  #179 = NameAndType        #63:#181      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #180 = Utf8               java/lang/invoke/StringConcatFactory
  #181 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #182 = Utf8               InnerClasses
  #183 = Class              #184          // java/lang/invoke/MethodHandles$Lookup
  #184 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #185 = Class              #186          // java/lang/invoke/MethodHandles
  #186 = Utf8               java/lang/invoke/MethodHandles
  #187 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Doorman(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 40: 0
        line 41: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_2
         1: ldc           #7                  // String open_doors
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          18
         9: aload_0
        10: aload_1
        11: aload_2
        12: invokevirtual #15                 // Method openDoors:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        15: goto          42
        18: aload_2
        19: ldc           #21                 // String close_doors
        21: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        24: ifeq          36
        27: aload_0
        28: aload_1
        29: aload_2
        30: invokevirtual #23                 // Method closeDoors:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        33: goto          42
        36: aload_0
        37: aload_1
        38: aload_2
        39: invokespecial #26                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        42: return
      LineNumberTable:
        line 46: 0
        line 47: 9
        line 48: 18
        line 49: 27
        line 51: 36
        line 52: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
            0      43     1 player   Lext/mods/gameserver/model/actor/Player;
            0      43     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 17 /* same */
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: new           #29                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: aload_0
         5: invokevirtual #31                 // Method getObjectId:()I
         8: invokespecial #35                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        11: astore_2
        12: aload_2
        13: aload_1
        14: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        17: aload_0
        18: invokevirtual #44                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        21: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        24: aload_0
        25: aload_1
        26: invokevirtual #53                 // Method isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
        29: ifne          37
        32: ldc           #57                 // String -no.htm
        34: goto          39
        37: ldc           #59                 // String .htm
        39: invokedynamic #61,  0             // InvokeDynamic #0:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
        44: invokevirtual #65                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        47: aload_2
        48: ldc           #69                 // String %objectId%
        50: aload_0
        51: invokevirtual #31                 // Method getObjectId:()I
        54: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        57: aload_1
        58: aload_2
        59: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        62: aload_1
        63: getstatic     #79                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        66: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        69: return
      LineNumberTable:
        line 57: 0
        line 58: 12
        line 59: 47
        line 60: 57
        line 62: 62
        line 63: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
            0      70     1 player   Lext/mods/gameserver/model/actor/Player;
           12      58     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/instance/Doorman, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/Doorman, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, int, class java/lang/String ]

  public boolean isTeleportAllowed(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #53                 // Method isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
         5: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;

  protected void openDoors(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=3
         0: new           #85                 // class java/util/StringTokenizer
         3: dup
         4: aload_2
         5: bipush        10
         7: invokevirtual #87                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        10: ldc           #91                 // String ,
        12: invokespecial #93                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        15: astore_3
        16: aload_3
        17: invokevirtual #96                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        20: ifeq          42
        23: invokestatic  #100                // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
        26: aload_3
        27: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        30: invokestatic  #110                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        33: invokevirtual #116                // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
        36: invokevirtual #120                // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
        39: goto          16
        42: return
      LineNumberTable:
        line 73: 0
        line 75: 16
        line 76: 23
        line 77: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
            0      43     1 player   Lext/mods/gameserver/model/actor/Player;
            0      43     2 command   Ljava/lang/String;
           16      27     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/StringTokenizer ]
        frame_type = 25 /* same */

  protected void closeDoors(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=3
         0: new           #85                 // class java/util/StringTokenizer
         3: dup
         4: aload_2
         5: bipush        11
         7: invokevirtual #87                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        10: ldc           #91                 // String ,
        12: invokespecial #93                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        15: astore_3
        16: aload_3
        17: invokevirtual #96                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        20: ifeq          42
        23: invokestatic  #100                // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
        26: aload_3
        27: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        30: invokestatic  #110                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        33: invokevirtual #116                // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
        36: invokevirtual #126                // Method ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
        39: goto          16
        42: return
      LineNumberTable:
        line 81: 0
        line 83: 16
        line 84: 23
        line 85: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
            0      43     1 player   Lext/mods/gameserver/model/actor/Player;
            0      43     2 command   Ljava/lang/String;
           16      27     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/StringTokenizer ]
        frame_type = 25 /* same */

  protected void cannotManageDoors(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #129                // Method getNpcId:()I
         4: invokedynamic #130,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
         9: astore_2
        10: invokestatic  #132                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        13: aload_1
        14: aload_2
        15: invokevirtual #137                // Method ext/mods/gameserver/data/HTMLData.exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        18: ifne          24
        21: ldc           #141                // String html/doormen/busy.htm
        23: astore_2
        24: new           #29                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        27: dup
        28: aload_0
        29: invokevirtual #31                 // Method getObjectId:()I
        32: invokespecial #35                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        35: astore_3
        36: aload_3
        37: aload_1
        38: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        41: aload_2
        42: invokevirtual #65                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        45: aload_1
        46: aload_3
        47: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        50: aload_1
        51: getstatic     #79                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        54: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        57: return
      LineNumberTable:
        line 89: 0
        line 90: 10
        line 91: 21
        line 93: 24
        line 94: 36
        line 95: 45
        line 97: 50
        line 98: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
            0      58     1 player   Lext/mods/gameserver/model/actor/Player;
           10      48     2  path   Ljava/lang/String;
           36      22     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/String ]

  protected boolean isOwnerClan(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
            0       2     1 player   Lext/mods/gameserver/model/actor/Player;

  protected boolean isUnderSiege();
    descriptor: ()Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Doorman;
}
SourceFile: "Doorman.java"
BootstrapMethods:
  0: #176 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #172 html/doormen/\u0001\u0001
  1: #176 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #174 html/doormen/\u0001-busy.htm
InnerClasses:
  public static final #187= #183 of #185; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
