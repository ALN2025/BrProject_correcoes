// Bytecode for: ext.mods.gameserver.communitybbs.custom.GateKeeperBBSManager
// File: ext\mods\gameserver\communitybbs\custom\GateKeeperBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.class
  Last modified 9 de jul de 2026; size 5134 bytes
  MD5 checksum 26d5d741bcf31a5a35ecaec0a2c1a32a
  Compiled from "GateKeeperBBSManager.java"
public class ext.mods.gameserver.communitybbs.custom.GateKeeperBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 6, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // _bbsgetfav
    #8 = Utf8               _bbsgetfav
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.showPage:(ILext/mods/gameserver/model/actor/Player;)V
   #16 = Class              #18           // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager
   #17 = NameAndType        #19:#20       // showPage:(ILext/mods/gameserver/model/actor/Player;)V
   #18 = Utf8               ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager
   #19 = Utf8               showPage
   #20 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
   #21 = String             #22           // _bbsgetfav;page
   #22 = Utf8               _bbsgetfav;page
   #23 = Methodref          #10.#24       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #24 = NameAndType        #25:#26       // startsWith:(Ljava/lang/String;)Z
   #25 = Utf8               startsWith
   #26 = Utf8               (Ljava/lang/String;)Z
   #27 = String             #28           //
   #28 = Utf8
   #29 = Methodref          #10.#30       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #30 = NameAndType        #31:#32       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #31 = Utf8               split
   #32 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #33 = Methodref          #34.#35       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #34 = Class              #36           // java/lang/Integer
   #35 = NameAndType        #37:#38       // parseInt:(Ljava/lang/String;)I
   #36 = Utf8               java/lang/Integer
   #37 = Utf8               parseInt
   #38 = Utf8               (Ljava/lang/String;)I
   #39 = String             #40           // _bbsgetfav;go
   #40 = Utf8               _bbsgetfav;go
   #41 = Methodref          #16.#42       // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.teleport:(Lext/mods/gameserver/model/actor/Player;I)V
   #42 = NameAndType        #43:#44       // teleport:(Lext/mods/gameserver/model/actor/Player;I)V
   #43 = Utf8               teleport
   #44 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #45 = Class              #46           // ext/mods/gameserver/network/serverpackets/ShowBoard
   #46 = Utf8               ext/mods/gameserver/network/serverpackets/ShowBoard
   #47 = Methodref          #45.#3        // ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":()V
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #49 = Class              #51           // ext/mods/gameserver/model/actor/Player
   #50 = NameAndType        #52:#53       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #51 = Utf8               ext/mods/gameserver/model/actor/Player
   #52 = Utf8               sendPacket
   #53 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #54 = Methodref          #55.#56       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #55 = Class              #57           // ext/mods/gameserver/data/HTMLData
   #56 = NameAndType        #58:#59       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #57 = Utf8               ext/mods/gameserver/data/HTMLData
   #58 = Utf8               getInstance
   #59 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #60 = Methodref          #49.#61       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #61 = NameAndType        #62:#63       // getLocale:()Ljava/util/Locale;
   #62 = Utf8               getLocale
   #63 = Utf8               ()Ljava/util/Locale;
   #64 = Methodref          #16.#65       // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.getFolder:()Ljava/lang/String;
   #65 = NameAndType        #66:#67       // getFolder:()Ljava/lang/String;
   #66 = Utf8               getFolder
   #67 = Utf8               ()Ljava/lang/String;
   #68 = InvokeDynamic      #0:#69        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #69 = NameAndType        #70:#71       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #70 = Utf8               makeConcatWithConstants
   #71 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #72 = Class              #73           // java/lang/Object
   #73 = Utf8               java/lang/Object
   #74 = Methodref          #34.#75       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #75 = NameAndType        #76:#77       // valueOf:(I)Ljava/lang/Integer;
   #76 = Utf8               valueOf
   #77 = Utf8               (I)Ljava/lang/Integer;
   #78 = Methodref          #10.#79       // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #79 = NameAndType        #80:#81       // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #80 = Utf8               format
   #81 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #82 = Methodref          #55.#83       // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #83 = NameAndType        #84:#85       // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #84 = Utf8               getHtm
   #85 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #86 = InvokeDynamic      #1:#69        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #87 = Methodref          #16.#88       // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #88 = NameAndType        #89:#90       // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #89 = Utf8               separateAndSend
   #90 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #91 = Methodref          #92.#93       // ext/mods/gameserver/data/xml/TeleportData.getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
   #92 = Class              #94           // ext/mods/gameserver/data/xml/TeleportData
   #93 = NameAndType        #58:#95       // getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
   #94 = Utf8               ext/mods/gameserver/data/xml/TeleportData
   #95 = Utf8               ()Lext/mods/gameserver/data/xml/TeleportData;
   #96 = Integer            50010
   #97 = Methodref          #92.#98       // ext/mods/gameserver/data/xml/TeleportData.getTeleports:(I)Ljava/util/List;
   #98 = NameAndType        #99:#100      // getTeleports:(I)Ljava/util/List;
   #99 = Utf8               getTeleports
  #100 = Utf8               (I)Ljava/util/List;
  #101 = InterfaceMethodref #102.#103     // java/util/List.size:()I
  #102 = Class              #104          // java/util/List
  #103 = NameAndType        #105:#106     // size:()I
  #104 = Utf8               java/util/List
  #105 = Utf8               size
  #106 = Utf8               ()I
  #107 = InterfaceMethodref #102.#108     // java/util/List.get:(I)Ljava/lang/Object;
  #108 = NameAndType        #109:#110     // get:(I)Ljava/lang/Object;
  #109 = Utf8               get
  #110 = Utf8               (I)Ljava/lang/Object;
  #111 = Class              #112          // ext/mods/gameserver/model/location/TeleportLocation
  #112 = Utf8               ext/mods/gameserver/model/location/TeleportLocation
  #113 = Methodref          #111.#114     // ext/mods/gameserver/model/location/TeleportLocation.getCastleId:()I
  #114 = NameAndType        #115:#106     // getCastleId:()I
  #115 = Utf8               getCastleId
  #116 = Methodref          #117.#118     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #117 = Class              #119          // ext/mods/gameserver/data/manager/CastleManager
  #118 = NameAndType        #58:#120      // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #119 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #120 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #121 = Methodref          #117.#122     // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
  #122 = NameAndType        #123:#124     // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
  #123 = Utf8               getCastleById
  #124 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
  #125 = Methodref          #126.#127     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #126 = Class              #128          // ext/mods/gameserver/model/residence/castle/Castle
  #127 = NameAndType        #129:#130     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #128 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #129 = Utf8               getSiege
  #130 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #131 = Methodref          #132.#133     // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #132 = Class              #134          // ext/mods/gameserver/model/residence/castle/Siege
  #133 = NameAndType        #135:#136     // isInProgress:()Z
  #134 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #135 = Utf8               isInProgress
  #136 = Utf8               ()Z
  #137 = Fieldref           #138.#139     // ext/mods/gameserver/network/SystemMessageId.CANNOT_PORT_VILLAGE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #138 = Class              #140          // ext/mods/gameserver/network/SystemMessageId
  #139 = NameAndType        #141:#142     // CANNOT_PORT_VILLAGE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #140 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #141 = Utf8               CANNOT_PORT_VILLAGE_IN_SIEGE
  #142 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #143 = Methodref          #49.#144      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #144 = NameAndType        #52:#145      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #145 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #146 = Fieldref           #147.#148     // ext/mods/Config.FREE_TELEPORT:Z
  #147 = Class              #149          // ext/mods/Config
  #148 = NameAndType        #150:#151     // FREE_TELEPORT:Z
  #149 = Utf8               ext/mods/Config
  #150 = Utf8               FREE_TELEPORT
  #151 = Utf8               Z
  #152 = Methodref          #49.#153      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #153 = NameAndType        #154:#155     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #154 = Utf8               getStatus
  #155 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #156 = Methodref          #157.#158     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #157 = Class              #159          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #158 = NameAndType        #160:#106     // getLevel:()I
  #159 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #160 = Utf8               getLevel
  #161 = Fieldref           #147.#162     // ext/mods/Config.LVL_FREE_TELEPORT:I
  #162 = NameAndType        #163:#164     // LVL_FREE_TELEPORT:I
  #163 = Utf8               LVL_FREE_TELEPORT
  #164 = Utf8               I
  #165 = Methodref          #111.#166     // ext/mods/gameserver/model/location/TeleportLocation.getPriceCount:()I
  #166 = NameAndType        #167:#106     // getPriceCount:()I
  #167 = Utf8               getPriceCount
  #168 = Methodref          #111.#169     // ext/mods/gameserver/model/location/TeleportLocation.getPriceId:()I
  #169 = NameAndType        #170:#106     // getPriceId:()I
  #170 = Utf8               getPriceId
  #171 = Methodref          #49.#172      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #172 = NameAndType        #173:#174     // destroyItemByItemId:(IIZ)Z
  #173 = Utf8               destroyItemByItemId
  #174 = Utf8               (IIZ)Z
  #175 = Methodref          #49.#176      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #176 = NameAndType        #177:#178     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #177 = Utf8               teleportTo
  #178 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #179 = Fieldref           #180.#181     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #180 = Class              #182          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #181 = NameAndType        #183:#184     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #182 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #183 = Utf8               STATIC_PACKET
  #184 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #185 = String             #186          // custom/gk/
  #186 = Utf8               custom/gk/
  #187 = Fieldref           #188.#189     // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
  #188 = Class              #190          // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager$SingletonHolder
  #189 = NameAndType        #191:#192     // INSTANCE:Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
  #190 = Utf8               ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager$SingletonHolder
  #191 = Utf8               INSTANCE
  #192 = Utf8               Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
  #193 = Utf8               Code
  #194 = Utf8               LineNumberTable
  #195 = Utf8               LocalVariableTable
  #196 = Utf8               this
  #197 = Utf8               parseCmd
  #198 = Utf8               args
  #199 = Utf8               [Ljava/lang/String;
  #200 = Utf8               command
  #201 = Utf8               Ljava/lang/String;
  #202 = Utf8               player
  #203 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #204 = Utf8               StackMapTable
  #205 = Class              #199          // "[Ljava/lang/String;"
  #206 = Utf8               content
  #207 = Utf8               page
  #208 = Utf8               castle
  #209 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #210 = Utf8               index
  #211 = Utf8               teleports
  #212 = Utf8               Ljava/util/List;
  #213 = Utf8               Lext/mods/gameserver/model/location/TeleportLocation;
  #214 = Utf8               LocalVariableTypeTable
  #215 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
  #216 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
  #217 = Utf8               SourceFile
  #218 = Utf8               GateKeeperBBSManager.java
  #219 = Utf8               NestMembers
  #220 = Utf8               BootstrapMethods
  #221 = String             #222          // html/CommunityBoard/\u000150010-%d.htm
  #222 = Utf8               html/CommunityBoard/\u000150010-%d.htm
  #223 = String             #224          // html/CommunityBoard/\u000150010.htm
  #224 = Utf8               html/CommunityBoard/\u000150010.htm
  #225 = MethodHandle       6:#226        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #226 = Methodref          #227.#228     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #227 = Class              #229          // java/lang/invoke/StringConcatFactory
  #228 = NameAndType        #70:#230      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #229 = Utf8               java/lang/invoke/StringConcatFactory
  #230 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #231 = Utf8               InnerClasses
  #232 = Utf8               SingletonHolder
  #233 = Class              #234          // java/lang/invoke/MethodHandles$Lookup
  #234 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #235 = Class              #236          // java/lang/invoke/MethodHandles
  #236 = Utf8               java/lang/invoke/MethodHandles
  #237 = Utf8               Lookup
{
  public ext.mods.gameserver.communitybbs.custom.GateKeeperBBSManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_1
         1: ldc           #7                  // String _bbsgetfav
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          18
         9: aload_0
        10: iconst_0
        11: aload_2
        12: invokevirtual #15                 // Method showPage:(ILext/mods/gameserver/model/actor/Player;)V
        15: goto          104
        18: aload_1
        19: ldc           #21                 // String _bbsgetfav;page
        21: invokevirtual #23                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        24: ifeq          54
        27: aload_1
        28: ldc           #27                 // String
        30: invokevirtual #29                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        33: astore_3
        34: aload_3
        35: arraylength
        36: iconst_1
        37: if_icmple     51
        40: aload_0
        41: aload_3
        42: iconst_1
        43: aaload
        44: invokestatic  #33                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        47: aload_2
        48: invokevirtual #15                 // Method showPage:(ILext/mods/gameserver/model/actor/Player;)V
        51: goto          104
        54: aload_1
        55: ldc           #39                 // String _bbsgetfav;go
        57: invokevirtual #23                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        60: ifeq          104
        63: aload_1
        64: ldc           #27                 // String
        66: invokevirtual #29                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        69: astore_3
        70: aload_3
        71: arraylength
        72: iconst_1
        73: if_icmple     87
        76: aload_0
        77: aload_2
        78: aload_3
        79: iconst_1
        80: aaload
        81: invokestatic  #33                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        84: invokevirtual #41                 // Method teleport:(Lext/mods/gameserver/model/actor/Player;I)V
        87: aload_0
        88: iconst_0
        89: aload_2
        90: invokevirtual #15                 // Method showPage:(ILext/mods/gameserver/model/actor/Player;)V
        93: aload_2
        94: new           #45                 // class ext/mods/gameserver/network/serverpackets/ShowBoard
        97: dup
        98: invokespecial #47                 // Method ext/mods/gameserver/network/serverpackets/ShowBoard."<init>":()V
       101: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       104: return
      LineNumberTable:
        line 40: 0
        line 41: 9
        line 42: 18
        line 44: 27
        line 45: 34
        line 46: 40
        line 47: 51
        line 48: 54
        line 50: 63
        line 51: 70
        line 52: 76
        line 54: 87
        line 56: 93
        line 59: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      17     3  args   [Ljava/lang/String;
           70      34     3  args   [Ljava/lang/String;
            0     105     0  this   Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
            0     105     1 command   Ljava/lang/String;
            0     105     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 18 /* same */
        frame_type = 32 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 250 /* chop */
          offset_delta = 16

  protected void teleport(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=6, args_size=3
         0: invokestatic  #91                 // Method ext/mods/gameserver/data/xml/TeleportData.getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
         3: ldc           #96                 // int 50010
         5: invokevirtual #97                 // Method ext/mods/gameserver/data/xml/TeleportData.getTeleports:(I)Ljava/util/List;
         8: astore_3
         9: aload_3
        10: ifnull        23
        13: iload_2
        14: aload_3
        15: invokeinterface #101,  1          // InterfaceMethod java/util/List.size:()I
        20: if_icmple     24
        23: return
        24: aload_3
        25: iload_2
        26: invokeinterface #107,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        31: checkcast     #111                // class ext/mods/gameserver/model/location/TeleportLocation
        34: astore        4
        36: aload         4
        38: ifnonnull     42
        41: return
        42: aload         4
        44: invokevirtual #113                // Method ext/mods/gameserver/model/location/TeleportLocation.getCastleId:()I
        47: ifle          87
        50: invokestatic  #116                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        53: aload         4
        55: invokevirtual #113                // Method ext/mods/gameserver/model/location/TeleportLocation.getCastleId:()I
        58: invokevirtual #121                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
        61: astore        5
        63: aload         5
        65: ifnull        87
        68: aload         5
        70: invokevirtual #125                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        73: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        76: ifeq          87
        79: aload_1
        80: getstatic     #137                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_PORT_VILLAGE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
        83: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        86: return
        87: getstatic     #146                // Field ext/mods/Config.FREE_TELEPORT:Z
        90: ifne          132
        93: aload_1
        94: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        97: invokevirtual #156                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       100: getstatic     #161                // Field ext/mods/Config.LVL_FREE_TELEPORT:I
       103: if_icmple     132
       106: aload         4
       108: invokevirtual #165                // Method ext/mods/gameserver/model/location/TeleportLocation.getPriceCount:()I
       111: ifeq          132
       114: aload_1
       115: aload         4
       117: invokevirtual #168                // Method ext/mods/gameserver/model/location/TeleportLocation.getPriceId:()I
       120: aload         4
       122: invokevirtual #165                // Method ext/mods/gameserver/model/location/TeleportLocation.getPriceCount:()I
       125: iconst_1
       126: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       129: ifeq          140
       132: aload_1
       133: aload         4
       135: bipush        20
       137: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       140: aload_1
       141: getstatic     #179                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       144: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       147: return
      LineNumberTable:
        line 80: 0
        line 81: 9
        line 82: 23
        line 84: 24
        line 85: 36
        line 86: 41
        line 88: 42
        line 90: 50
        line 91: 63
        line 93: 79
        line 94: 86
        line 98: 87
        line 99: 132
        line 101: 140
        line 102: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           63      24     5 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0     148     0  this   Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
            0     148     1 player   Lext/mods/gameserver/model/actor/Player;
            0     148     2 index   I
            9     139     3 teleports   Ljava/util/List;
           36     112     4 teleport   Lext/mods/gameserver/model/location/TeleportLocation;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     139     3 teleports   Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/List ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/location/TeleportLocation ]
        frame_type = 44 /* same */
        frame_type = 44 /* same */
        frame_type = 7 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #185                // String custom/gk/
         2: areturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;

  public static ext.mods.gameserver.communitybbs.custom.GateKeeperBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #187                // Field ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
         3: areturn
      LineNumberTable:
        line 112: 0
}
SourceFile: "GateKeeperBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager$SingletonHolder
BootstrapMethods:
  0: #225 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #221 html/CommunityBoard/\u000150010-%d.htm
  1: #225 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #223 html/CommunityBoard/\u000150010.htm
InnerClasses:
  public static final #237= #233 of #235; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
