// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminAnnouncements
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminAnnouncements.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements.class
  Last modified 9 de jul de 2026; size 4730 bytes
  MD5 checksum e6437072302ba091ae1569e6d2707e15
  Compiled from "AdminAnnouncements.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminAnnouncements implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #107                        // ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_announce
    #8 = Utf8               admin_announce
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = String             #16           //
   #16 = Utf8
   #17 = Methodref          #10.#18       // java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
   #18 = NameAndType        #19:#20       // split:(Ljava/lang/String;I)[Ljava/lang/String;
   #19 = Utf8               split
   #20 = Utf8               (Ljava/lang/String;I)[Ljava/lang/String;
   #21 = Methodref          #10.#22       // java/lang/String.hashCode:()I
   #22 = NameAndType        #23:#24       // hashCode:()I
   #23 = Utf8               hashCode
   #24 = Utf8               ()I
   #25 = String             #26           // list
   #26 = Utf8               list
   #27 = Methodref          #10.#28       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #28 = NameAndType        #29:#30       // equals:(Ljava/lang/Object;)Z
   #29 = Utf8               equals
   #30 = Utf8               (Ljava/lang/Object;)Z
   #31 = String             #32           // all
   #32 = Utf8               all
   #33 = String             #34           // all_auto
   #34 = Utf8               all_auto
   #35 = String             #36           // add
   #36 = Utf8               add
   #37 = String             #38           // add_auto
   #38 = Utf8               add_auto
   #39 = String             #40           // del
   #40 = Utf8               del
   #41 = Methodref          #42.#43       // ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
   #42 = Class              #44           // ext/mods/gameserver/data/xml/AnnouncementData
   #43 = NameAndType        #45:#46       // getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
   #44 = Utf8               ext/mods/gameserver/data/xml/AnnouncementData
   #45 = Utf8               getInstance
   #46 = Utf8               ()Lext/mods/gameserver/data/xml/AnnouncementData;
   #47 = Methodref          #42.#48       // ext/mods/gameserver/data/xml/AnnouncementData.listAnnouncements:(Lext/mods/gameserver/model/actor/Player;)V
   #48 = NameAndType        #49:#50       // listAnnouncements:(Lext/mods/gameserver/model/actor/Player;)V
   #49 = Utf8               listAnnouncements
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #51 = Methodref          #10.#52       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #52 = NameAndType        #53:#14       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #53 = Utf8               equalsIgnoreCase
   #54 = Methodref          #55.#56       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #55 = Class              #57           // ext/mods/gameserver/model/World
   #56 = NameAndType        #45:#58       // getInstance:()Lext/mods/gameserver/model/World;
   #57 = Utf8               ext/mods/gameserver/model/World
   #58 = Utf8               ()Lext/mods/gameserver/model/World;
   #59 = Methodref          #55.#60       // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
   #60 = NameAndType        #61:#62       // getPlayers:()Ljava/util/Collection;
   #61 = Utf8               getPlayers
   #62 = Utf8               ()Ljava/util/Collection;
   #63 = InvokeDynamic      #0:#64        // #0:accept:(Z)Ljava/util/function/Consumer;
   #64 = NameAndType        #65:#66       // accept:(Z)Ljava/util/function/Consumer;
   #65 = Utf8               accept
   #66 = Utf8               (Z)Ljava/util/function/Consumer;
   #67 = InterfaceMethodref #68.#69       // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
   #68 = Class              #70           // java/util/Collection
   #69 = NameAndType        #71:#72       // forEach:(Ljava/util/function/Consumer;)V
   #70 = Utf8               java/util/Collection
   #71 = Utf8               forEach
   #72 = Utf8               (Ljava/util/function/Consumer;)V
   #73 = Methodref          #74.#75       // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #74 = Class              #76           // java/lang/Boolean
   #75 = NameAndType        #77:#14       // parseBoolean:(Ljava/lang/String;)Z
   #76 = Utf8               java/lang/Boolean
   #77 = Utf8               parseBoolean
   #78 = Methodref          #42.#79       // ext/mods/gameserver/data/xml/AnnouncementData.addAnnouncement:(Ljava/lang/String;ZZIII)Z
   #79 = NameAndType        #80:#81       // addAnnouncement:(Ljava/lang/String;ZZIII)Z
   #80 = Utf8               addAnnouncement
   #81 = Utf8               (Ljava/lang/String;ZZIII)Z
   #82 = String             #83           // Invalid //announce message content ; can\'t be null or empty.
   #83 = Utf8               Invalid //announce message content ; can\'t be null or empty.
   #84 = Methodref          #85.#86       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #85 = Class              #87           // ext/mods/gameserver/model/actor/Player
   #86 = NameAndType        #88:#89       // sendMessage:(Ljava/lang/String;)V
   #87 = Utf8               ext/mods/gameserver/model/actor/Player
   #88 = Utf8               sendMessage
   #89 = Utf8               (Ljava/lang/String;)V
   #90 = Methodref          #91.#92       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #91 = Class              #93           // java/lang/Integer
   #92 = NameAndType        #94:#95       // parseInt:(Ljava/lang/String;)I
   #93 = Utf8               java/lang/Integer
   #94 = Utf8               parseInt
   #95 = Utf8               (Ljava/lang/String;)I
   #96 = Methodref          #42.#97       // ext/mods/gameserver/data/xml/AnnouncementData.delAnnouncement:(I)V
   #97 = NameAndType        #98:#99       // delAnnouncement:(I)V
   #98 = Utf8               delAnnouncement
   #99 = Utf8               (I)V
  #100 = String             #101          // Possible //announce parameters : <list|all|add|add_auto|del>
  #101 = Utf8               Possible //announce parameters : <list|all|add|add_auto|del>
  #102 = Class              #103          // java/lang/Exception
  #103 = Utf8               java/lang/Exception
  #104 = String             #105          // announce.htm
  #105 = Utf8               announce.htm
  #106 = Methodref          #107.#108     // ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #107 = Class              #109          // ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements
  #108 = NameAndType        #110:#111     // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #109 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements
  #110 = Utf8               sendFile
  #111 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #112 = String             #113          // admin_ann
  #113 = Utf8               admin_ann
  #114 = String             #115          // admin_say
  #115 = Utf8               admin_say
  #116 = Methodref          #42.#117      // ext/mods/gameserver/data/xml/AnnouncementData.handleAnnounce:(Ljava/lang/String;IZ)V
  #117 = NameAndType        #118:#119     // handleAnnounce:(Ljava/lang/String;IZ)V
  #118 = Utf8               handleAnnounce
  #119 = Utf8               (Ljava/lang/String;IZ)V
  #120 = String             #121          // admin_gmchat
  #121 = Utf8               admin_gmchat
  #122 = Methodref          #123.#124     // ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
  #123 = Class              #125          // ext/mods/gameserver/data/xml/AdminData
  #124 = NameAndType        #45:#126      // getInstance:()Lext/mods/gameserver/data/xml/AdminData;
  #125 = Utf8               ext/mods/gameserver/data/xml/AdminData
  #126 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
  #127 = Class              #128          // ext/mods/gameserver/network/serverpackets/CreatureSay
  #128 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #129 = Fieldref           #130.#131     // ext/mods/gameserver/enums/SayType.ALLIANCE:Lext/mods/gameserver/enums/SayType;
  #130 = Class              #132          // ext/mods/gameserver/enums/SayType
  #131 = NameAndType        #133:#134     // ALLIANCE:Lext/mods/gameserver/enums/SayType;
  #132 = Utf8               ext/mods/gameserver/enums/SayType
  #133 = Utf8               ALLIANCE
  #134 = Utf8               Lext/mods/gameserver/enums/SayType;
  #135 = Methodref          #10.#136      // java/lang/String.substring:(I)Ljava/lang/String;
  #136 = NameAndType        #137:#138     // substring:(I)Ljava/lang/String;
  #137 = Utf8               substring
  #138 = Utf8               (I)Ljava/lang/String;
  #139 = Methodref          #127.#140     // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #140 = NameAndType        #5:#141       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #141 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #142 = Methodref          #123.#143     // ext/mods/gameserver/data/xml/AdminData.broadcastToGMs:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #143 = NameAndType        #144:#145     // broadcastToGMs:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #144 = Utf8               broadcastToGMs
  #145 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #146 = String             #147          // Invalid //gmchat message content ; can\'t be null or empty.
  #147 = Utf8               Invalid //gmchat message content ; can\'t be null or empty.
  #148 = Fieldref           #107.#149     // ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements.ADMIN_COMMANDS:[Ljava/lang/String;
  #149 = NameAndType        #150:#151     // ADMIN_COMMANDS:[Ljava/lang/String;
  #150 = Utf8               ADMIN_COMMANDS
  #151 = Utf8               [Ljava/lang/String;
  #152 = Methodref          #42.#153      // ext/mods/gameserver/data/xml/AnnouncementData.showAnnouncements:(Lext/mods/gameserver/model/actor/Player;Z)V
  #153 = NameAndType        #154:#155     // showAnnouncements:(Lext/mods/gameserver/model/actor/Player;Z)V
  #154 = Utf8               showAnnouncements
  #155 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #156 = Class              #157          // ext/mods/gameserver/handler/IAdminCommandHandler
  #157 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #158 = Utf8               Code
  #159 = Utf8               LineNumberTable
  #160 = Utf8               LocalVariableTable
  #161 = Utf8               this
  #162 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements;
  #163 = Utf8               useAdminCommand
  #164 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #165 = Utf8               isAuto
  #166 = Utf8               Z
  #167 = Utf8               crit
  #168 = Utf8               auto
  #169 = Utf8               idelay
  #170 = Utf8               I
  #171 = Utf8               delay
  #172 = Utf8               limit
  #173 = Utf8               msg
  #174 = Utf8               Ljava/lang/String;
  #175 = Utf8               tokens
  #176 = Utf8               e
  #177 = Utf8               Ljava/lang/Exception;
  #178 = Utf8               command
  #179 = Utf8               player
  #180 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #181 = Utf8               StackMapTable
  #182 = Class              #151          // "[Ljava/lang/String;"
  #183 = Utf8               getAdminCommandList
  #184 = Utf8               ()[Ljava/lang/String;
  #185 = Utf8               lambda$useAdminCommand$0
  #186 = Utf8               (ZLext/mods/gameserver/model/actor/Player;)V
  #187 = Utf8               p
  #188 = Utf8               <clinit>
  #189 = Utf8               SourceFile
  #190 = Utf8               AdminAnnouncements.java
  #191 = Utf8               BootstrapMethods
  #192 = MethodType         #193          //  (Ljava/lang/Object;)V
  #193 = Utf8               (Ljava/lang/Object;)V
  #194 = MethodHandle       6:#195        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements.lambda$useAdminCommand$0:(ZLext/mods/gameserver/model/actor/Player;)V
  #195 = Methodref          #107.#196     // ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements.lambda$useAdminCommand$0:(ZLext/mods/gameserver/model/actor/Player;)V
  #196 = NameAndType        #185:#186     // lambda$useAdminCommand$0:(ZLext/mods/gameserver/model/actor/Player;)V
  #197 = MethodType         #50           //  (Lext/mods/gameserver/model/actor/Player;)V
  #198 = MethodHandle       6:#199        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #199 = Methodref          #200.#201     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #200 = Class              #202          // java/lang/invoke/LambdaMetafactory
  #201 = NameAndType        #203:#204     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #202 = Utf8               java/lang/invoke/LambdaMetafactory
  #203 = Utf8               metafactory
  #204 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #205 = Utf8               InnerClasses
  #206 = Class              #207          // java/lang/invoke/MethodHandles$Lookup
  #207 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #208 = Class              #209          // java/lang/invoke/MethodHandles
  #209 = Utf8               java/lang/invoke/MethodHandles
  #210 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminAnnouncements();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=14, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_announce
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          465
         9: aload_1
        10: ldc           #15                 // String
        12: iconst_3
        13: invokevirtual #17                 // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        16: astore_3
        17: aload_3
        18: iconst_1
        19: aaload
        20: astore        4
        22: iconst_m1
        23: istore        5
        25: aload         4
        27: invokevirtual #21                 // Method java/lang/String.hashCode:()I
        30: lookupswitch  { // 6

             -1236378995: 152

                   96417: 136

                   96673: 104

                   99339: 168

                 3322014: 88

              1797716365: 120
                 default: 181
            }
        88: aload         4
        90: ldc           #25                 // String list
        92: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        95: ifeq          181
        98: iconst_0
        99: istore        5
       101: goto          181
       104: aload         4
       106: ldc           #31                 // String all
       108: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       111: ifeq          181
       114: iconst_1
       115: istore        5
       117: goto          181
       120: aload         4
       122: ldc           #33                 // String all_auto
       124: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       127: ifeq          181
       130: iconst_2
       131: istore        5
       133: goto          181
       136: aload         4
       138: ldc           #35                 // String add
       140: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       143: ifeq          181
       146: iconst_3
       147: istore        5
       149: goto          181
       152: aload         4
       154: ldc           #37                 // String add_auto
       156: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       159: ifeq          181
       162: iconst_4
       163: istore        5
       165: goto          181
       168: aload         4
       170: ldc           #39                 // String del
       172: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       175: ifeq          181
       178: iconst_5
       179: istore        5
       181: iload         5
       183: tableswitch   { // 0 to 5

                       0: 220

                       1: 230

                       2: 230

                       3: 268

                       4: 323

                       5: 423
                 default: 445
            }
       220: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       223: aload_2
       224: invokevirtual #47                 // Method ext/mods/gameserver/data/xml/AnnouncementData.listAnnouncements:(Lext/mods/gameserver/model/actor/Player;)V
       227: goto          451
       230: aload_3
       231: iconst_1
       232: aaload
       233: ldc           #33                 // String all_auto
       235: invokevirtual #51                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       238: istore        6
       240: invokestatic  #54                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       243: invokevirtual #59                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
       246: iload         6
       248: invokedynamic #63,  0             // InvokeDynamic #0:accept:(Z)Ljava/util/function/Consumer;
       253: invokeinterface #67,  2           // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
       258: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       261: aload_2
       262: invokevirtual #47                 // Method ext/mods/gameserver/data/xml/AnnouncementData.listAnnouncements:(Lext/mods/gameserver/model/actor/Player;)V
       265: goto          451
       268: aload_3
       269: iconst_2
       270: aaload
       271: ldc           #15                 // String
       273: iconst_2
       274: invokevirtual #17                 // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
       277: astore        7
       279: aload         7
       281: iconst_0
       282: aaload
       283: invokestatic  #73                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
       286: istore        8
       288: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       291: aload         7
       293: iconst_1
       294: aaload
       295: iload         8
       297: iconst_0
       298: iconst_m1
       299: iconst_m1
       300: iconst_m1
       301: invokevirtual #78                 // Method ext/mods/gameserver/data/xml/AnnouncementData.addAnnouncement:(Ljava/lang/String;ZZIII)Z
       304: ifne          313
       307: aload_2
       308: ldc           #82                 // String Invalid //announce message content ; can\'t be null or empty.
       310: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       313: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       316: aload_2
       317: invokevirtual #47                 // Method ext/mods/gameserver/data/xml/AnnouncementData.listAnnouncements:(Lext/mods/gameserver/model/actor/Player;)V
       320: goto          451
       323: aload_3
       324: iconst_2
       325: aaload
       326: ldc           #15                 // String
       328: bipush        6
       330: invokevirtual #17                 // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
       333: astore        7
       335: aload         7
       337: iconst_0
       338: aaload
       339: invokestatic  #73                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
       342: istore        8
       344: aload         7
       346: iconst_1
       347: aaload
       348: invokestatic  #73                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
       351: istore        9
       353: aload         7
       355: iconst_2
       356: aaload
       357: invokestatic  #90                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       360: istore        10
       362: aload         7
       364: iconst_3
       365: aaload
       366: invokestatic  #90                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       369: istore        11
       371: aload         7
       373: iconst_4
       374: aaload
       375: invokestatic  #90                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       378: istore        12
       380: aload         7
       382: iconst_5
       383: aaload
       384: astore        13
       386: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       389: aload         13
       391: iload         8
       393: iload         9
       395: iload         10
       397: iload         11
       399: iload         12
       401: invokevirtual #78                 // Method ext/mods/gameserver/data/xml/AnnouncementData.addAnnouncement:(Ljava/lang/String;ZZIII)Z
       404: ifne          413
       407: aload_2
       408: ldc           #82                 // String Invalid //announce message content ; can\'t be null or empty.
       410: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       413: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       416: aload_2
       417: invokevirtual #47                 // Method ext/mods/gameserver/data/xml/AnnouncementData.listAnnouncements:(Lext/mods/gameserver/model/actor/Player;)V
       420: goto          451
       423: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       426: aload_3
       427: iconst_2
       428: aaload
       429: invokestatic  #90                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       432: invokevirtual #96                 // Method ext/mods/gameserver/data/xml/AnnouncementData.delAnnouncement:(I)V
       435: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       438: aload_2
       439: invokevirtual #47                 // Method ext/mods/gameserver/data/xml/AnnouncementData.listAnnouncements:(Lext/mods/gameserver/model/actor/Player;)V
       442: goto          451
       445: aload_2
       446: ldc           #100                // String Possible //announce parameters : <list|all|add|add_auto|del>
       448: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       451: goto          543
       454: astore_3
       455: aload_0
       456: aload_2
       457: ldc           #104                // String announce.htm
       459: invokevirtual #106                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       462: goto          543
       465: aload_1
       466: ldc           #112                // String admin_ann
       468: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       471: ifne          483
       474: aload_1
       475: ldc           #114                // String admin_say
       477: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       480: ifeq          501
       483: invokestatic  #41                 // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
       486: aload_1
       487: bipush        10
       489: aload_1
       490: ldc           #114                // String admin_say
       492: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       495: invokevirtual #116                // Method ext/mods/gameserver/data/xml/AnnouncementData.handleAnnounce:(Ljava/lang/String;IZ)V
       498: goto          543
       501: aload_1
       502: ldc           #120                // String admin_gmchat
       504: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       507: ifeq          543
       510: invokestatic  #122                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       513: new           #127                // class ext/mods/gameserver/network/serverpackets/CreatureSay
       516: dup
       517: aload_2
       518: getstatic     #129                // Field ext/mods/gameserver/enums/SayType.ALLIANCE:Lext/mods/gameserver/enums/SayType;
       521: aload_1
       522: bipush        13
       524: invokevirtual #135                // Method java/lang/String.substring:(I)Ljava/lang/String;
       527: invokespecial #139                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
       530: invokevirtual #142                // Method ext/mods/gameserver/data/xml/AdminData.broadcastToGMs:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       533: goto          543
       536: astore_3
       537: aload_2
       538: ldc           #146                // String Invalid //gmchat message content ; can\'t be null or empty.
       540: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       543: return
      Exception table:
         from    to  target type
             9   451   454   Class java/lang/Exception
           510   533   536   Class java/lang/Exception
      LineNumberTable:
        line 41: 0
        line 45: 9
        line 46: 17
        line 49: 220
        line 50: 227
        line 53: 230
        line 54: 240
        line 56: 258
        line 57: 265
        line 60: 268
        line 61: 279
        line 63: 288
        line 64: 307
        line 66: 313
        line 67: 320
        line 70: 323
        line 71: 335
        line 72: 344
        line 73: 353
        line 74: 362
        line 75: 371
        line 76: 380
        line 78: 386
        line 79: 407
        line 81: 413
        line 82: 420
        line 85: 423
        line 86: 435
        line 87: 442
        line 90: 445
        line 97: 451
        line 94: 454
        line 96: 455
        line 97: 462
        line 99: 465
        line 100: 483
        line 101: 501
        line 105: 510
        line 110: 533
        line 107: 536
        line 109: 537
        line 112: 543
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          240      28     6 isAuto   Z
          279      44     7 split   [Ljava/lang/String;
          288      35     8  crit   Z
          335      88     7 split   [Ljava/lang/String;
          344      79     8  crit   Z
          353      70     9  auto   Z
          362      61    10 idelay   I
          371      52    11 delay   I
          380      43    12 limit   I
          386      37    13   msg   Ljava/lang/String;
           17     434     3 tokens   [Ljava/lang/String;
          455       7     3     e   Ljava/lang/Exception;
          537       6     3     e   Ljava/lang/Exception;
            0     544     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements;
            0     544     1 command   Ljava/lang/String;
            0     544     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 22
        frame_type = 254 /* append */
          offset_delta = 88
          locals = [ class "[Ljava/lang/String;", class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 38 /* same */
        frame_type = 9 /* same */
        frame_type = 37 /* same */
        frame_type = 254 /* append */
          offset_delta = 44
          locals = [ top, class "[Ljava/lang/String;", int ]
        frame_type = 248 /* chop */
          offset_delta = 9
        frame_type = 255 /* full_frame */
          offset_delta = 89
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class "[Ljava/lang/String;", class java/lang/String, int, top, class "[Ljava/lang/String;", int, int, int, int, int, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class "[Ljava/lang/String;", class java/lang/String, int ]
          stack = []
        frame_type = 21 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 98 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 6 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #148                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_4
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_announce
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #112                // String admin_ann
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #114                // String admin_say
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #120                // String admin_gmchat
        23: aastore
        24: putstatic     #148                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        27: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "AdminAnnouncements.java"
BootstrapMethods:
  0: #198 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #192 (Ljava/lang/Object;)V
      #194 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAnnouncements.lambda$useAdminCommand$0:(ZLext/mods/gameserver/model/actor/Player;)V
      #197 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static final #210= #206 of #208; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
