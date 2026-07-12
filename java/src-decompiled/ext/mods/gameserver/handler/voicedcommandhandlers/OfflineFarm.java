// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.OfflineFarm
// File: ext\mods\gameserver\handler\voicedcommandhandlers\OfflineFarm.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm.class
  Last modified 9 de jul de 2026; size 6558 bytes
  MD5 checksum e21d5ec0bfe77b46c39ac14c6e5bd02d
  Compiled from "OfflineFarm.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.OfflineFarm implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #222                        // ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // away
    #8 = Utf8               away
    #9 = Methodref          #10.#11       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equalsIgnoreCase
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Fieldref           #16.#17       // ext/mods/Config.ENABLE_OFFLINE_FARM_COMMAND:Z
   #16 = Class              #18           // ext/mods/Config
   #17 = NameAndType        #19:#20       // ENABLE_OFFLINE_FARM_COMMAND:Z
   #18 = Utf8               ext/mods/Config
   #19 = Utf8               ENABLE_OFFLINE_FARM_COMMAND
   #20 = Utf8               Z
   #21 = String             #22           // Offline farm command is disabled.
   #22 = Utf8               Offline farm command is disabled.
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #24 = Class              #26           // ext/mods/gameserver/model/actor/Player
   #25 = NameAndType        #27:#28       // sendMessage:(Ljava/lang/String;)V
   #26 = Utf8               ext/mods/gameserver/model/actor/Player
   #27 = Utf8               sendMessage
   #28 = Utf8               (Ljava/lang/String;)V
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #30 = Class              #32           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #31 = NameAndType        #33:#34       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #32 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #33 = Utf8               STATIC_PACKET
   #34 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #35 = Methodref          #24.#36       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #36 = NameAndType        #37:#38       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #37 = Utf8               sendPacket
   #38 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #39 = Methodref          #24.#40       // ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
   #40 = NameAndType        #41:#42       // isOfflineFarm:()Z
   #41 = Utf8               isOfflineFarm
   #42 = Utf8               ()Z
   #43 = String             #44           // You are already in away mode.
   #44 = Utf8               You are already in away mode.
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #46 = Class              #48           // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #47 = NameAndType        #49:#50       // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #48 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #49 = Utf8               getInstance
   #50 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #51 = Methodref          #24.#52       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #52 = NameAndType        #53:#54       // getObjectId:()I
   #53 = Utf8               getObjectId
   #54 = Utf8               ()I
   #55 = Methodref          #46.#56       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.isPlayerActive:(I)Z
   #56 = NameAndType        #57:#58       // isPlayerActive:(I)Z
   #57 = Utf8               isPlayerActive
   #58 = Utf8               (I)Z
   #59 = String             #60           // You must activate autofarm first to use away mode.
   #60 = Utf8               You must activate autofarm first to use away mode.
   #61 = Fieldref           #16.#62       // ext/mods/Config.OFFLINE_MODE_IN_PEACE_ZONE:Z
   #62 = NameAndType        #63:#20       // OFFLINE_MODE_IN_PEACE_ZONE:Z
   #63 = Utf8               OFFLINE_MODE_IN_PEACE_ZONE
   #64 = Fieldref           #65.#66       // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #65 = Class              #67           // ext/mods/gameserver/enums/ZoneId
   #66 = NameAndType        #68:#69       // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #67 = Utf8               ext/mods/gameserver/enums/ZoneId
   #68 = Utf8               PEACE
   #69 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #70 = Methodref          #24.#71       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #71 = NameAndType        #72:#73       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #72 = Utf8               isInsideZone
   #73 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #74 = String             #75           // You cannot activate away mode in a peace zone.
   #75 = Utf8               You cannot activate away mode in a peace zone.
   #76 = Fieldref           #16.#77       // ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP:I
   #77 = NameAndType        #78:#79       // DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP:I
   #78 = Utf8               DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP
   #79 = Utf8               I
   #80 = Fieldref           #16.#81       // ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP:I
   #81 = NameAndType        #82:#79       // DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP:I
   #82 = Utf8               DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP
   #83 = Methodref          #24.#84       // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
   #84 = NameAndType        #85:#86       // getClient:()Lext/mods/gameserver/network/GameClient;
   #85 = Utf8               getClient
   #86 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #87 = Methodref          #88.#89       // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
   #88 = Class              #90           // ext/mods/gameserver/network/GameClient
   #89 = NameAndType        #91:#92       // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
   #90 = Utf8               ext/mods/gameserver/network/GameClient
   #91 = Utf8               getConnection
   #92 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
   #93 = Methodref          #94.#95       // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
   #94 = Class              #96           // ext/mods/commons/mmocore/MMOConnection
   #95 = NameAndType        #97:#98       // getInetAddress:()Ljava/net/InetAddress;
   #96 = Utf8               ext/mods/commons/mmocore/MMOConnection
   #97 = Utf8               getInetAddress
   #98 = Utf8               ()Ljava/net/InetAddress;
   #99 = Methodref          #100.#101     // java/net/InetAddress.getHostAddress:()Ljava/lang/String;
  #100 = Class              #102          // java/net/InetAddress
  #101 = NameAndType        #103:#104     // getHostAddress:()Ljava/lang/String;
  #102 = Utf8               java/net/InetAddress
  #103 = Utf8               getHostAddress
  #104 = Utf8               ()Ljava/lang/String;
  #105 = Methodref          #106.#107     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #106 = Class              #108          // ext/mods/gameserver/model/World
  #107 = NameAndType        #49:#109      // getInstance:()Lext/mods/gameserver/model/World;
  #108 = Utf8               ext/mods/gameserver/model/World
  #109 = Utf8               ()Lext/mods/gameserver/model/World;
  #110 = Methodref          #106.#111     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #111 = NameAndType        #112:#113     // getPlayers:()Ljava/util/Collection;
  #112 = Utf8               getPlayers
  #113 = Utf8               ()Ljava/util/Collection;
  #114 = InterfaceMethodref #115.#116     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #115 = Class              #117          // java/util/Collection
  #116 = NameAndType        #118:#119     // iterator:()Ljava/util/Iterator;
  #117 = Utf8               java/util/Collection
  #118 = Utf8               iterator
  #119 = Utf8               ()Ljava/util/Iterator;
  #120 = InterfaceMethodref #121.#122     // java/util/Iterator.hasNext:()Z
  #121 = Class              #123          // java/util/Iterator
  #122 = NameAndType        #124:#42      // hasNext:()Z
  #123 = Utf8               java/util/Iterator
  #124 = Utf8               hasNext
  #125 = InterfaceMethodref #121.#126     // java/util/Iterator.next:()Ljava/lang/Object;
  #126 = NameAndType        #127:#128     // next:()Ljava/lang/Object;
  #127 = Utf8               next
  #128 = Utf8               ()Ljava/lang/Object;
  #129 = Methodref          #10.#130      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #130 = NameAndType        #131:#132     // equals:(Ljava/lang/Object;)Z
  #131 = Utf8               equals
  #132 = Utf8               (Ljava/lang/Object;)Z
  #133 = Methodref          #24.#134      // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
  #134 = NameAndType        #135:#54      // getPremiumService:()I
  #135 = Utf8               getPremiumService
  #136 = String             #137          // You have reached the maximum number of offline players per IP.
  #137 = Utf8               You have reached the maximum number of offline players per IP.
  #138 = String             #139          // You have reached the maximum number of premium offline players per IP.
  #139 = Utf8               You have reached the maximum number of premium offline players per IP.
  #140 = Fieldref           #16.#141      // ext/mods/Config.OFFLINE_FARM_PREMIUM:Z
  #141 = NameAndType        #142:#20      // OFFLINE_FARM_PREMIUM:Z
  #142 = Utf8               OFFLINE_FARM_PREMIUM
  #143 = String             #144          // Away mode is only available for premium accounts.
  #144 = Utf8               Away mode is only available for premium accounts.
  #145 = Methodref          #24.#146      // ext/mods/gameserver/model/actor/Player.isInVehicle:()Z
  #146 = NameAndType        #147:#42      // isInVehicle:()Z
  #147 = Utf8               isInVehicle
  #148 = Methodref          #24.#149      // ext/mods/gameserver/model/actor/Player.isOlympiadProtection:()Z
  #149 = NameAndType        #150:#42      // isOlympiadProtection:()Z
  #150 = Utf8               isOlympiadProtection
  #151 = String             #152          // You cannot activate away mode while in a vehicle or under Olympiad protection.
  #152 = Utf8               You cannot activate away mode while in a vehicle or under Olympiad protection.
  #153 = Class              #154          // ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #154 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #155 = Fieldref           #156.#157     // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
  #156 = Class              #158          // ext/mods/gameserver/network/SystemMessageId
  #157 = NameAndType        #159:#160     // S1:Lext/mods/gameserver/network/SystemMessageId;
  #158 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #159 = Utf8               S1
  #160 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #161 = Methodref          #156.#162     // ext/mods/gameserver/network/SystemMessageId.getId:()I
  #162 = NameAndType        #163:#54      // getId:()I
  #163 = Utf8               getId
  #164 = Methodref          #153.#165     // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
  #165 = NameAndType        #5:#166       // "<init>":(I)V
  #166 = Utf8               (I)V
  #167 = String             #168          // Do you want to activate away mode?
  #168 = Utf8               Do you want to activate away mode?
  #169 = Methodref          #153.#170     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #170 = NameAndType        #171:#172     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #171 = Utf8               addString
  #172 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #173 = Methodref          #153.#174     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #174 = NameAndType        #175:#176     // addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #175 = Utf8               addTime
  #176 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #177 = Methodref          #24.#178      // ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
  #178 = NameAndType        #179:#28      // setLastCommand:(Ljava/lang/String;)V
  #179 = Utf8               setLastCommand
  #180 = Methodref          #24.#181      // ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
  #181 = NameAndType        #182:#104     // getLastCommand:()Ljava/lang/String;
  #182 = Utf8               getLastCommand
  #183 = Methodref          #184.#185     // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
  #184 = Class              #186          // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager
  #185 = NameAndType        #49:#187      // getInstance:()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
  #186 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager
  #187 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
  #188 = Methodref          #184.#189     // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.startOfflineFarm:(Lext/mods/gameserver/model/actor/Player;)Z
  #189 = NameAndType        #190:#191     // startOfflineFarm:(Lext/mods/gameserver/model/actor/Player;)Z
  #190 = Utf8               startOfflineFarm
  #191 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #192 = String             #193          // Away mode activated successfully!
  #193 = Utf8               Away mode activated successfully!
  #194 = Class              #195          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #195 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #196 = String             #197          // Away mode activated!
  #197 = Utf8               Away mode activated!
  #198 = Fieldref           #199.#200     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS.BOTTOM_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #199 = Class              #201          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS
  #200 = NameAndType        #202:#203     // BOTTOM_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #201 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS
  #202 = Utf8               BOTTOM_CENTER
  #203 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #204 = Methodref          #194.#205     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #205 = NameAndType        #5:#206       // "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #206 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #207 = InvokeDynamic      #0:#208       // #0:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #208 = NameAndType        #209:#210     // run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #209 = Utf8               run
  #210 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #211 = Long               2000l
  #213 = Methodref          #214.#215     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #214 = Class              #216          // ext/mods/commons/pool/ThreadPool
  #215 = NameAndType        #217:#218     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #216 = Utf8               ext/mods/commons/pool/ThreadPool
  #217 = Utf8               schedule
  #218 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #219 = String             #220          // Failed to activate away mode.
  #220 = Utf8               Failed to activate away mode.
  #221 = Fieldref           #222.#223     // ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm.VOICED_COMMANDS:[Ljava/lang/String;
  #222 = Class              #224          // ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm
  #223 = NameAndType        #225:#226     // VOICED_COMMANDS:[Ljava/lang/String;
  #224 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm
  #225 = Utf8               VOICED_COMMANDS
  #226 = Utf8               [Ljava/lang/String;
  #227 = Methodref          #24.#228      // ext/mods/gameserver/model/actor/Player.setOnlineStatus:(ZZ)V
  #228 = NameAndType        #229:#230     // setOnlineStatus:(ZZ)V
  #229 = Utf8               setOnlineStatus
  #230 = Utf8               (ZZ)V
  #231 = String             #232          // You are now in offline farm mode. Your character will continue farming automatically.
  #232 = Utf8               You are now in offline farm mode. Your character will continue farming automatically.
  #233 = Methodref          #88.#234      // ext/mods/gameserver/network/GameClient.closeNow:()V
  #234 = NameAndType        #235:#6       // closeNow:()V
  #235 = Utf8               closeNow
  #236 = Class              #237          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #237 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #238 = Utf8               Code
  #239 = Utf8               LineNumberTable
  #240 = Utf8               LocalVariableTable
  #241 = Utf8               this
  #242 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm;
  #243 = Utf8               useVoicedCommand
  #244 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #245 = Utf8               p
  #246 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #247 = Utf8               offlineCount
  #248 = Utf8               offlinePremiumCount
  #249 = Utf8               playerIp
  #250 = Utf8               Ljava/lang/String;
  #251 = Utf8               command
  #252 = Utf8               player
  #253 = Utf8               args
  #254 = Utf8               dlg
  #255 = Utf8               Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #256 = Utf8               StackMapTable
  #257 = Utf8               handleConfirmation
  #258 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #259 = Utf8               confirmed
  #260 = Utf8               getVoicedCommandList
  #261 = Utf8               ()[Ljava/lang/String;
  #262 = Utf8               lambda$handleConfirmation$0
  #263 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #264 = Utf8               <clinit>
  #265 = Utf8               SourceFile
  #266 = Utf8               OfflineFarm.java
  #267 = Utf8               BootstrapMethods
  #268 = MethodType         #6            //  ()V
  #269 = MethodHandle       6:#270        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm.lambda$handleConfirmation$0:(Lext/mods/gameserver/model/actor/Player;)V
  #270 = Methodref          #222.#271     // ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm.lambda$handleConfirmation$0:(Lext/mods/gameserver/model/actor/Player;)V
  #271 = NameAndType        #262:#263     // lambda$handleConfirmation$0:(Lext/mods/gameserver/model/actor/Player;)V
  #272 = MethodHandle       6:#273        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #273 = Methodref          #274.#275     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #274 = Class              #276          // java/lang/invoke/LambdaMetafactory
  #275 = NameAndType        #277:#278     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #276 = Utf8               java/lang/invoke/LambdaMetafactory
  #277 = Utf8               metafactory
  #278 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #279 = Utf8               InnerClasses
  #280 = Utf8               SMPOS
  #281 = Class              #282          // java/lang/invoke/MethodHandles$Lookup
  #282 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #283 = Class              #284          // java/lang/invoke/MethodHandles
  #284 = Utf8               java/lang/invoke/MethodHandles
  #285 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.OfflineFarm();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=4
         0: aload_1
         1: ldc           #7                  // String away
         3: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: getstatic     #15                 // Field ext/mods/Config.ENABLE_OFFLINE_FARM_COMMAND:Z
        14: ifne          32
        17: aload_2
        18: ldc           #21                 // String Offline farm command is disabled.
        20: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        23: aload_2
        24: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        27: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        30: iconst_0
        31: ireturn
        32: aload_2
        33: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
        36: ifeq          54
        39: aload_2
        40: ldc           #43                 // String You are already in away mode.
        42: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        45: aload_2
        46: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        49: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        52: iconst_0
        53: ireturn
        54: invokestatic  #45                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
        57: aload_2
        58: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        61: invokevirtual #55                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.isPlayerActive:(I)Z
        64: ifne          82
        67: aload_2
        68: ldc           #59                 // String You must activate autofarm first to use away mode.
        70: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        73: aload_2
        74: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        77: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        80: iconst_0
        81: ireturn
        82: getstatic     #61                 // Field ext/mods/Config.OFFLINE_MODE_IN_PEACE_ZONE:Z
        85: ifne          113
        88: aload_2
        89: getstatic     #64                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        92: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        95: ifeq          113
        98: aload_2
        99: ldc           #74                 // String You cannot activate away mode in a peace zone.
       101: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       104: aload_2
       105: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       108: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       111: iconst_0
       112: ireturn
       113: getstatic     #76                 // Field ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP:I
       116: ifgt          125
       119: getstatic     #80                 // Field ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP:I
       122: ifle          331
       125: iconst_0
       126: istore        4
       128: iconst_0
       129: istore        5
       131: aload_2
       132: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       135: invokevirtual #87                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       138: invokevirtual #93                 // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
       141: invokevirtual #99                 // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
       144: astore        6
       146: invokestatic  #105                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       149: invokevirtual #110                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
       152: invokeinterface #114,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       157: astore        7
       159: aload         7
       161: invokeinterface #120,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       166: ifeq          266
       169: aload         7
       171: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       176: checkcast     #24                 // class ext/mods/gameserver/model/actor/Player
       179: astore        8
       181: aload         8
       183: ifnull        263
       186: aload         8
       188: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
       191: ifeq          263
       194: aload         8
       196: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       199: ifnull        263
       202: aload         8
       204: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       207: invokevirtual #87                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       210: ifnull        263
       213: aload         8
       215: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       218: invokevirtual #87                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       221: invokevirtual #93                 // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
       224: ifnull        263
       227: aload         8
       229: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       232: invokevirtual #87                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       235: invokevirtual #93                 // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
       238: invokevirtual #99                 // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
       241: aload         6
       243: invokevirtual #129                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       246: ifeq          263
       249: iinc          4, 1
       252: aload         8
       254: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       257: ifle          263
       260: iinc          5, 1
       263: goto          159
       266: getstatic     #76                 // Field ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP:I
       269: ifle          295
       272: iload         4
       274: getstatic     #76                 // Field ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP:I
       277: if_icmplt     295
       280: aload_2
       281: ldc           #136                // String You have reached the maximum number of offline players per IP.
       283: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       286: aload_2
       287: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       290: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       293: iconst_0
       294: ireturn
       295: getstatic     #80                 // Field ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP:I
       298: ifle          331
       301: aload_2
       302: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       305: ifle          331
       308: iload         5
       310: getstatic     #80                 // Field ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP:I
       313: if_icmplt     331
       316: aload_2
       317: ldc           #138                // String You have reached the maximum number of premium offline players per IP.
       319: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       322: aload_2
       323: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       326: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       329: iconst_0
       330: ireturn
       331: getstatic     #140                // Field ext/mods/Config.OFFLINE_FARM_PREMIUM:Z
       334: ifeq          359
       337: aload_2
       338: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       341: ifne          359
       344: aload_2
       345: ldc           #143                // String Away mode is only available for premium accounts.
       347: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       350: aload_2
       351: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       354: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       357: iconst_0
       358: ireturn
       359: aload_2
       360: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.isInVehicle:()Z
       363: ifne          373
       366: aload_2
       367: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.isOlympiadProtection:()Z
       370: ifeq          388
       373: aload_2
       374: ldc           #151                // String You cannot activate away mode while in a vehicle or under Olympiad protection.
       376: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       379: aload_2
       380: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       383: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       386: iconst_0
       387: ireturn
       388: new           #153                // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
       391: dup
       392: getstatic     #155                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       395: invokevirtual #161                // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       398: invokespecial #164                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
       401: astore        4
       403: aload         4
       405: ldc           #167                // String Do you want to activate away mode?
       407: invokevirtual #169                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       410: pop
       411: aload         4
       413: sipush        30000
       416: invokevirtual #173                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       419: pop
       420: aload_2
       421: aload         4
       423: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       426: aload_2
       427: ldc           #7                  // String away
       429: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
       432: iconst_1
       433: ireturn
      LineNumberTable:
        line 47: 0
        line 48: 9
        line 50: 11
        line 52: 17
        line 53: 23
        line 54: 30
        line 57: 32
        line 59: 39
        line 60: 45
        line 61: 52
        line 64: 54
        line 66: 67
        line 67: 73
        line 68: 80
        line 71: 82
        line 73: 98
        line 74: 104
        line 75: 111
        line 78: 113
        line 80: 125
        line 81: 128
        line 82: 131
        line 84: 146
        line 86: 181
        line 88: 227
        line 90: 249
        line 91: 252
        line 92: 260
        line 95: 263
        line 97: 266
        line 99: 280
        line 100: 286
        line 101: 293
        line 104: 295
        line 106: 316
        line 107: 322
        line 108: 329
        line 112: 331
        line 114: 344
        line 115: 350
        line 116: 357
        line 119: 359
        line 121: 373
        line 122: 379
        line 123: 386
        line 126: 388
        line 127: 403
        line 128: 411
        line 129: 420
        line 131: 426
        line 133: 432
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          181      82     8     p   Lext/mods/gameserver/model/actor/Player;
          128     203     4 offlineCount   I
          131     200     5 offlinePremiumCount   I
          146     185     6 playerIp   Ljava/lang/String;
            0     434     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm;
            0     434     1 command   Ljava/lang/String;
            0     434     2 player   Lext/mods/gameserver/model/actor/Player;
            0     434     3  args   Ljava/lang/String;
          403      31     4   dlg   Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
      StackMapTable: number_of_entries = 14
        frame_type = 11 /* same */
        frame_type = 20 /* same */
        frame_type = 21 /* same */
        frame_type = 27 /* same */
        frame_type = 30 /* same */
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, int, class java/lang/String, class java/util/Iterator ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 103
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 28 /* same */
        frame_type = 248 /* chop */
          offset_delta = 35
        frame_type = 27 /* same */
        frame_type = 13 /* same */
        frame_type = 14 /* same */

  public boolean handleConfirmation(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=3
         0: iload_2
         1: ifeq          92
         4: ldc           #7                  // String away
         6: aload_1
         7: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
        10: invokevirtual #129                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        13: ifeq          92
        16: invokestatic  #183                // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
        19: aload_1
        20: invokevirtual #188                // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.startOfflineFarm:(Lext/mods/gameserver/model/actor/Player;)Z
        23: ifeq          72
        26: aload_1
        27: ldc           #192                // String Away mode activated successfully!
        29: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        32: aload_1
        33: new           #194                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
        36: dup
        37: ldc           #196                // String Away mode activated!
        39: sipush        3000
        42: getstatic     #198                // Field ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS.BOTTOM_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
        45: iconst_0
        46: invokespecial #204                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
        49: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        52: aload_1
        53: aconst_null
        54: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
        57: aload_1
        58: invokedynamic #207,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
        63: ldc2_w        #211                // long 2000l
        66: invokestatic  #213                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        69: pop
        70: iconst_1
        71: ireturn
        72: aload_1
        73: ldc           #219                // String Failed to activate away mode.
        75: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        78: aload_1
        79: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        82: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        85: aload_1
        86: aconst_null
        87: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
        90: iconst_0
        91: ireturn
        92: aload_1
        93: aconst_null
        94: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
        97: iconst_0
        98: ireturn
      LineNumberTable:
        line 144: 0
        line 146: 16
        line 148: 26
        line 149: 32
        line 150: 52
        line 152: 57
        line 162: 70
        line 165: 72
        line 166: 78
        line 167: 85
        line 168: 90
        line 171: 92
        line 172: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm;
            0      99     1 player   Lext/mods/gameserver/model/actor/Player;
            0      99     2 confirmed   Z
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72
        frame_type = 19 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #221                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String away
         8: aastore
         9: putstatic     #221                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "OfflineFarm.java"
BootstrapMethods:
  0: #272 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #268 ()V
      #269 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm.lambda$handleConfirmation$0:(Lext/mods/gameserver/model/actor/Player;)V
      #268 ()V
InnerClasses:
  public static final #280= #199 of #194; // SMPOS=class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS of class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  public static final #285= #281 of #283; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
