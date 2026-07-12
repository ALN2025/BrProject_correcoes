// Bytecode for: ext.mods.gameserver.model.entity.autofarm.AutoFarmManager
// File: ext\mods\gameserver\model\entity\autofarm\AutoFarmManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.class
  Last modified 9 de jul de 2026; size 56720 bytes
  MD5 checksum 15cdc7e005afddcfd196538e714ab767
  Compiled from "AutoFarmManager.java"
public class ext.mods.gameserver.model.entity.autofarm.AutoFarmManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 9, methods: 74, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Class              #8           // java/util/concurrent/ConcurrentHashMap
     #8 = Utf8               java/util/concurrent/ConcurrentHashMap
     #9 = Methodref          #7.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #10 = Fieldref           #11.#12      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager._players:Ljava/util/Map;
    #11 = Class              #13          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
    #12 = NameAndType        #14:#15      // _players:Ljava/util/Map;
    #13 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
    #14 = Utf8               _players
    #15 = Utf8               Ljava/util/Map;
    #16 = Fieldref           #11.#17      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager._lastUpdateTime:Ljava/util/Map;
    #17 = NameAndType        #18:#15      // _lastUpdateTime:Ljava/util/Map;
    #18 = Utf8               _lastUpdateTime
    #19 = Fieldref           #11.#20      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager._screenMessageTasks:Ljava/util/Map;
    #20 = NameAndType        #21:#15      // _screenMessageTasks:Ljava/util/Map;
    #21 = Utf8               _screenMessageTasks
    #22 = Fieldref           #11.#23      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager._refreshTasks:Ljava/util/Map;
    #23 = NameAndType        #24:#15      // _refreshTasks:Ljava/util/Map;
    #24 = Utf8               _refreshTasks
    #25 = String             #26          //
    #26 = Utf8
    #27 = String             #28          // &
    #28 = Utf8               &
    #29 = String             #30          // &amp;
    #30 = Utf8               &amp;
    #31 = Methodref          #32.#33      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    #32 = Class              #34          // java/lang/String
    #33 = NameAndType        #35:#36      // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    #34 = Utf8               java/lang/String
    #35 = Utf8               replace
    #36 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    #37 = String             #38          // <
    #38 = Utf8               <
    #39 = String             #40          // &lt;
    #40 = Utf8               &lt;
    #41 = String             #42          // >
    #42 = Utf8               >
    #43 = String             #44          // &gt;
    #44 = Utf8               &gt;
    #45 = String             #46          // \"
    #46 = Utf8               \"
    #47 = String             #48          // &quot;
    #48 = Utf8               &quot;
    #49 = InterfaceMethodref #50.#51      // java/util/Map.values:()Ljava/util/Collection;
    #50 = Class              #52          // java/util/Map
    #51 = NameAndType        #53:#54      // values:()Ljava/util/Collection;
    #52 = Utf8               java/util/Map
    #53 = Utf8               values
    #54 = Utf8               ()Ljava/util/Collection;
    #55 = Methodref          #56.#57      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
    #56 = Class              #58          // java/lang/Integer
    #57 = NameAndType        #59:#60      // valueOf:(I)Ljava/lang/Integer;
    #58 = Utf8               java/lang/Integer
    #59 = Utf8               valueOf
    #60 = Utf8               (I)Ljava/lang/Integer;
    #61 = InterfaceMethodref #50.#62      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
    #62 = NameAndType        #63:#64      // get:(Ljava/lang/Object;)Ljava/lang/Object;
    #63 = Utf8               get
    #64 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #65 = Class              #66          // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
    #66 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
    #67 = Methodref          #68.#69      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
    #68 = Class              #70          // ext/mods/gameserver/model/actor/Player
    #69 = NameAndType        #71:#72      // getObjectId:()I
    #70 = Utf8               ext/mods/gameserver/model/actor/Player
    #71 = Utf8               getObjectId
    #72 = Utf8               ()I
    #73 = InvokeDynamic      #0:#74       // #0:apply:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Function;
    #74 = NameAndType        #75:#76      // apply:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Function;
    #75 = Utf8               apply
    #76 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Function;
    #77 = InterfaceMethodref #50.#78      // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    #78 = NameAndType        #79:#80      // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    #79 = Utf8               computeIfAbsent
    #80 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    #81 = InterfaceMethodref #50.#82      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
    #82 = NameAndType        #83:#84      // containsKey:(Ljava/lang/Object;)Z
    #83 = Utf8               containsKey
    #84 = Utf8               (Ljava/lang/Object;)Z
    #85 = Methodref          #11.#86      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #86 = NameAndType        #87:#88      // getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #87 = Utf8               getPlayer
    #88 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #89 = Methodref          #65.#90      // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isAddingLocation:()Z
    #90 = NameAndType        #91:#92      // isAddingLocation:()Z
    #91 = Utf8               isAddingLocation
    #92 = Utf8               ()Z
    #93 = Methodref          #65.#94      // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
    #94 = NameAndType        #95:#92      // isEnabled:()Z
    #95 = Utf8               isEnabled
    #96 = Methodref          #65.#97      // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    #97 = NameAndType        #98:#99      // getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    #98 = Utf8               getSelectedArea
    #99 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #100 = Methodref          #101.#102    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #101 = Class              #103         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #102 = NameAndType        #104:#105    // getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #103 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #104 = Utf8               getType
   #105 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #106 = Fieldref           #107.#108    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #107 = Class              #109         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #108 = NameAndType        #110:#111    // ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #109 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #110 = Utf8               ROTA
   #111 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #112 = Methodref          #113.#114    // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
   #113 = Class              #115         // ext/mods/gameserver/model/entity/autofarm/AutoFarmData
   #114 = NameAndType        #116:#117    // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
   #115 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmData
   #116 = Utf8               getInstance
   #117 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
   #118 = Methodref          #113.#119    // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.restorePlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #119 = NameAndType        #120:#121    // restorePlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #120 = Utf8               restorePlayer
   #121 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #122 = Methodref          #11.#123     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #123 = NameAndType        #124:#125    // getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #124 = Utf8               getProfile
   #125 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #126 = Methodref          #65.#127     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.updatePlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #127 = NameAndType        #128:#121    // updatePlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #128 = Utf8               updatePlayer
   #129 = Methodref          #113.#130    // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.loadPlayerTimeUsage:(I)J
   #130 = NameAndType        #131:#132    // loadPlayerTimeUsage:(I)J
   #131 = Utf8               loadPlayerTimeUsage
   #132 = Utf8               (I)J
   #133 = Methodref          #65.#134     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setDailyTimeUsed:(J)V
   #134 = NameAndType        #135:#136    // setDailyTimeUsed:(J)V
   #135 = Utf8               setDailyTimeUsed
   #136 = Utf8               (J)V
   #137 = Methodref          #65.#138     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getDailyTimeUsed:()J
   #138 = NameAndType        #139:#140    // getDailyTimeUsed:()J
   #139 = Utf8               getDailyTimeUsed
   #140 = Utf8               ()J
   #141 = Methodref          #65.#142     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.stopTimeTracking:()V
   #142 = NameAndType        #143:#6      // stopTimeTracking:()V
   #143 = Utf8               stopTimeTracking
   #144 = Methodref          #65.#145     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getCurrentSessionTime:()J
   #145 = NameAndType        #146:#140    // getCurrentSessionTime:()J
   #146 = Utf8               getCurrentSessionTime
   #147 = Methodref          #11.#148     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopTimeDisplay:(Lext/mods/gameserver/model/actor/Player;)V
   #148 = NameAndType        #149:#121    // stopTimeDisplay:(Lext/mods/gameserver/model/actor/Player;)V
   #149 = Utf8               stopTimeDisplay
   #150 = Methodref          #68.#151     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #151 = NameAndType        #152:#92     // isOnline:()Z
   #152 = Utf8               isOnline
   #153 = Methodref          #65.#154     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayerTitle:()Ljava/lang/String;
   #154 = NameAndType        #155:#156    // getPlayerTitle:()Ljava/lang/String;
   #155 = Utf8               getPlayerTitle
   #156 = Utf8               ()Ljava/lang/String;
   #157 = Methodref          #68.#158     // ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
   #158 = NameAndType        #159:#160    // setTitle:(Ljava/lang/String;)V
   #159 = Utf8               setTitle
   #160 = Utf8               (Ljava/lang/String;)V
   #161 = Methodref          #68.#162     // ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
   #162 = NameAndType        #163:#6      // broadcastTitleInfo:()V
   #163 = Utf8               broadcastTitleInfo
   #164 = Fieldref           #165.#166    // ext/mods/Config.AUTOFARM_CHANGE_PLAYER_NAME_COLOR:Z
   #165 = Class              #167         // ext/mods/Config
   #166 = NameAndType        #168:#169    // AUTOFARM_CHANGE_PLAYER_NAME_COLOR:Z
   #167 = Utf8               ext/mods/Config
   #168 = Utf8               AUTOFARM_CHANGE_PLAYER_NAME_COLOR
   #169 = Utf8               Z
   #170 = Methodref          #68.#171     // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #171 = NameAndType        #172:#173    // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #172 = Utf8               getAppearance
   #173 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #174 = Methodref          #68.#175     // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #175 = NameAndType        #176:#177    // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #176 = Utf8               getAccessLevel
   #177 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
   #178 = Methodref          #179.#180    // ext/mods/gameserver/model/AccessLevel.getNameColor:()I
   #179 = Class              #181         // ext/mods/gameserver/model/AccessLevel
   #180 = NameAndType        #182:#72     // getNameColor:()I
   #181 = Utf8               ext/mods/gameserver/model/AccessLevel
   #182 = Utf8               getNameColor
   #183 = Methodref          #184.#185    // ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
   #184 = Class              #186         // ext/mods/gameserver/model/actor/container/player/Appearance
   #185 = NameAndType        #187:#188    // setNameColor:(I)V
   #186 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #187 = Utf8               setNameColor
   #188 = Utf8               (I)V
   #189 = Methodref          #179.#190    // ext/mods/gameserver/model/AccessLevel.getTitleColor:()I
   #190 = NameAndType        #191:#72     // getTitleColor:()I
   #191 = Utf8               getTitleColor
   #192 = Methodref          #184.#193    // ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
   #193 = NameAndType        #194:#188    // setTitleColor:(I)V
   #194 = Utf8               setTitleColor
   #195 = Methodref          #68.#196     // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #196 = NameAndType        #197:#6      // broadcastUserInfo:()V
   #197 = Utf8               broadcastUserInfo
   #198 = Methodref          #199.#200    // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
   #199 = Class              #201         // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder
   #200 = NameAndType        #116:#202    // getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
   #201 = Utf8               ext/mods/gameserver/model/entity/autofarm/ZoneBuilder
   #202 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
   #203 = Methodref          #199.#204    // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
   #204 = NameAndType        #205:#121    // clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
   #205 = Utf8               clearAllPreview
   #206 = Methodref          #65.#207     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setEnabled:(Z)V
   #207 = NameAndType        #208:#209    // setEnabled:(Z)V
   #208 = Utf8               setEnabled
   #209 = Utf8               (Z)V
   #210 = Methodref          #113.#211    // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.updatePlayerTimeUsage:(IJ)V
   #211 = NameAndType        #212:#213    // updatePlayerTimeUsage:(IJ)V
   #212 = Utf8               updatePlayerTimeUsage
   #213 = Utf8               (IJ)V
   #214 = Methodref          #215.#216    // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
   #215 = Class              #217         // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager
   #216 = NameAndType        #116:#218    // getInstance:()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
   #217 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager
   #218 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
   #219 = Methodref          #215.#220    // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.onPlayerLogout:(Lext/mods/gameserver/model/actor/Player;)V
   #220 = NameAndType        #221:#121    // onPlayerLogout:(Lext/mods/gameserver/model/actor/Player;)V
   #221 = Utf8               onPlayerLogout
   #222 = Class              #223         // java/lang/Exception
   #223 = Utf8               java/lang/Exception
   #224 = Fieldref           #11.#225     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #225 = NameAndType        #226:#227    // LOGGER:Lext/mods/commons/logging/CLogger;
   #226 = Utf8               LOGGER
   #227 = Utf8               Lext/mods/commons/logging/CLogger;
   #228 = String             #229         // Error during autofarm logout for player {}: {}
   #229 = Utf8               Error during autofarm logout for player {}: {}
   #230 = Methodref          #68.#231     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #231 = NameAndType        #232:#156    // getName:()Ljava/lang/String;
   #232 = Utf8               getName
   #233 = Methodref          #222.#234    // java/lang/Exception.getMessage:()Ljava/lang/String;
   #234 = NameAndType        #235:#156    // getMessage:()Ljava/lang/String;
   #235 = Utf8               getMessage
   #236 = Methodref          #237.#238    // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #237 = Class              #239         // ext/mods/commons/logging/CLogger
   #238 = NameAndType        #240:#241    // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #239 = Utf8               ext/mods/commons/logging/CLogger
   #240 = Utf8               error
   #241 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #242 = Methodref          #65.#243     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDeathReturnEnabled:()Z
   #243 = NameAndType        #244:#92     // isDeathReturnEnabled:()Z
   #244 = Utf8               isDeathReturnEnabled
   #245 = String             #246         // You have died. Autofarm has been stopped.
   #246 = Utf8               You have died. Autofarm has been stopped.
   #247 = Methodref          #11.#248     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
   #248 = NameAndType        #249:#250    // stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
   #249 = Utf8               stopPlayer
   #250 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
   #251 = Methodref          #215.#252    // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.onPlayerDeath:(Lext/mods/gameserver/model/actor/Player;)V
   #252 = NameAndType        #253:#121    // onPlayerDeath:(Lext/mods/gameserver/model/actor/Player;)V
   #253 = Utf8               onPlayerDeath
   #254 = String             #255         // Error during autofarm death for player {}: {}
   #255 = Utf8               Error during autofarm death for player {}: {}
   #256 = Fieldref           #165.#257    // ext/mods/Config.AUTOFARM_ENABLED:Z
   #257 = NameAndType        #258:#169    // AUTOFARM_ENABLED:Z
   #258 = Utf8               AUTOFARM_ENABLED
   #259 = Methodref          #68.#260     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #260 = NameAndType        #261:#262    // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #261 = Utf8               getSysString
   #262 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #263 = Methodref          #11.#264     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #264 = NameAndType        #265:#266    // showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #265 = Utf8               showIndexWindow
   #266 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #267 = Methodref          #68.#268     // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #268 = NameAndType        #269:#92     // isDead:()Z
   #269 = Utf8               isDead
   #270 = Class              #271         // java/util/StringTokenizer
   #271 = Utf8               java/util/StringTokenizer
   #272 = String             #273         //
   #273 = Utf8
   #274 = Methodref          #270.#275    // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #275 = NameAndType        #5:#276      // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #276 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #277 = Methodref          #270.#278    // java/util/StringTokenizer.hasMoreTokens:()Z
   #278 = NameAndType        #279:#92     // hasMoreTokens:()Z
   #279 = Utf8               hasMoreTokens
   #280 = Methodref          #270.#281    // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #281 = NameAndType        #282:#156    // nextToken:()Ljava/lang/String;
   #282 = Utf8               nextToken
   #283 = String             #284         // zb addnode
   #284 = Utf8               zb addnode
   #285 = Methodref          #32.#286     // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #286 = NameAndType        #287:#288    // startsWith:(Ljava/lang/String;)Z
   #287 = Utf8               startsWith
   #288 = Utf8               (Ljava/lang/String;)Z
   #289 = String             #290         // zb lock_new_nodes
   #290 = Utf8               zb lock_new_nodes
   #291 = Methodref          #65.#292     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setAddingLocation:(Z)V
   #292 = NameAndType        #293:#209    // setAddingLocation:(Z)V
   #293 = Utf8               setAddingLocation
   #294 = String             #295         // index
   #295 = Utf8               index
   #296 = Methodref          #32.#297     // java/lang/String.equals:(Ljava/lang/Object;)Z
   #297 = NameAndType        #298:#84     // equals:(Ljava/lang/Object;)Z
   #298 = Utf8               equals
   #299 = Methodref          #65.#300     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.checkLastClassId:()V
   #300 = NameAndType        #301:#6      // checkLastClassId:()V
   #301 = Utf8               checkLastClassId
   #302 = String             #303         // list_areas
   #303 = Utf8               list_areas
   #304 = Methodref          #11.#305     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleListAreasBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #305 = NameAndType        #306:#307    // handleListAreasBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #306 = Utf8               handleListAreasBypass
   #307 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #308 = String             #309         // skills
   #309 = Utf8               skills
   #310 = Methodref          #11.#311     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleSkillsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #311 = NameAndType        #312:#307    // handleSkillsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #312 = Utf8               handleSkillsBypass
   #313 = String             #314         // targets
   #314 = Utf8               targets
   #315 = Methodref          #11.#316     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleTargetsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #316 = NameAndType        #317:#307    // handleTargetsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #317 = Utf8               handleTargetsBypass
   #318 = String             #319         // macro
   #319 = Utf8               macro
   #320 = Methodref          #11.#321     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleMacroBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #321 = NameAndType        #322:#307    // handleMacroBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #322 = Utf8               handleMacroBypass
   #323 = String             #324         // zb
   #324 = Utf8               zb
   #325 = Methodref          #11.#326     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleZoneBuilderBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #326 = NameAndType        #327:#307    // handleZoneBuilderBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #327 = Utf8               handleZoneBuilderBypass
   #328 = String             #329         // select_area
   #329 = Utf8               select_area
   #330 = Methodref          #56.#331     // java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #331 = NameAndType        #59:#332     // valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #332 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #333 = Methodref          #56.#334     // java/lang/Integer.intValue:()I
   #334 = NameAndType        #335:#72     // intValue:()I
   #335 = Utf8               intValue
   #336 = Methodref          #11.#337     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleSelectAreaBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #337 = NameAndType        #338:#339    // handleSelectAreaBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #338 = Utf8               handleSelectAreaBypass
   #339 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #340 = String             #341         // timer
   #341 = Utf8               timer
   #342 = Methodref          #11.#343     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleTimerBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #343 = NameAndType        #344:#307    // handleTimerBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #344 = Utf8               handleTimerBypass
   #345 = String             #346         // options
   #346 = Utf8               options
   #347 = Methodref          #11.#348     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleAreaOptionsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #348 = NameAndType        #349:#307    // handleAreaOptionsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #349 = Utf8               handleAreaOptionsBypass
   #350 = String             #351         // toggle
   #351 = Utf8               toggle
   #352 = Methodref          #11.#353     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleToggleBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
   #353 = NameAndType        #354:#355    // handleToggleBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
   #354 = Utf8               handleToggleBypass
   #355 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
   #356 = String             #357         // clearpreview
   #357 = Utf8               clearpreview
   #358 = String             #359         // help
   #359 = Utf8               help
   #360 = Class              #361         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #361 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #362 = Methodref          #360.#363    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #363 = NameAndType        #5:#188      // "<init>":(I)V
   #364 = Methodref          #68.#365     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #365 = NameAndType        #366:#367    // getLocale:()Ljava/util/Locale;
   #366 = Utf8               getLocale
   #367 = Utf8               ()Ljava/util/Locale;
   #368 = InvokeDynamic      #1:#369      // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #369 = NameAndType        #370:#371    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #370 = Utf8               makeConcatWithConstants
   #371 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #372 = Methodref          #360.#373    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #373 = NameAndType        #374:#375    // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #374 = Utf8               setFile
   #375 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #376 = Methodref          #68.#377     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #377 = NameAndType        #378:#379    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #378 = Utf8               sendPacket
   #379 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #380 = String             #381         // change_status
   #381 = Utf8               change_status
   #382 = Methodref          #11.#383     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #383 = NameAndType        #249:#266    // stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #384 = Methodref          #11.#385     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.startPlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #385 = NameAndType        #386:#121    // startPlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #386 = Utf8               startPlayer
   #387 = String             #388         // Failed to handle AutoFarmManager bypass. Player: {}, Bypass: {}
   #388 = Utf8               Failed to handle AutoFarmManager bypass. Player: {}, Bypass: {}
   #389 = Methodref          #237.#390    // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #390 = NameAndType        #391:#241    // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #391 = Utf8               warn
   #392 = Methodref          #393.#394    // java/lang/System.currentTimeMillis:()J
   #393 = Class              #395         // java/lang/System
   #394 = NameAndType        #396:#140    // currentTimeMillis:()J
   #395 = Utf8               java/lang/System
   #396 = Utf8               currentTimeMillis
   #397 = Methodref          #398.#399    // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #398 = Class              #400         // java/lang/Long
   #399 = NameAndType        #59:#401     // valueOf:(J)Ljava/lang/Long;
   #400 = Utf8               java/lang/Long
   #401 = Utf8               (J)Ljava/lang/Long;
   #402 = InterfaceMethodref #50.#403     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #403 = NameAndType        #404:#405    // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #404 = Utf8               getOrDefault
   #405 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #406 = Methodref          #398.#407    // java/lang/Long.longValue:()J
   #407 = NameAndType        #408:#140    // longValue:()J
   #408 = Utf8               longValue
   #409 = Long               1000l
   #411 = InterfaceMethodref #50.#412     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #412 = NameAndType        #413:#405    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #413 = Utf8               put
   #414 = Methodref          #65.#415     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.checkTimeLimit:()V
   #415 = NameAndType        #416:#6      // checkTimeLimit:()V
   #416 = Utf8               checkTimeLimit
   #417 = String             #418         // autopotion
   #418 = Utf8               autopotion
   #419 = Methodref          #65.#420     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleAutoPotion:()V
   #420 = NameAndType        #421:#6      // toggleAutoPotion:()V
   #421 = Utf8               toggleAutoPotion
   #422 = String             #423         // attackraid
   #423 = Utf8               attackraid
   #424 = Methodref          #65.#425     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleAttackRaid:()V
   #425 = NameAndType        #426:#6      // toggleAttackRaid:()V
   #426 = Utf8               toggleAttackRaid
   #427 = String             #428         // attacksummon
   #428 = Utf8               attacksummon
   #429 = Methodref          #65.#430     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleAttackSummon:()V
   #430 = NameAndType        #431:#6      // toggleAttackSummon:()V
   #431 = Utf8               toggleAttackSummon
   #432 = String             #433         // defensive
   #433 = Utf8               defensive
   #434 = Methodref          #65.#435     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDefensiveMode:()Z
   #435 = NameAndType        #436:#92     // isDefensiveMode:()Z
   #436 = Utf8               isDefensiveMode
   #437 = Methodref          #65.#438     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setDefensiveMode:(Z)V
   #438 = NameAndType        #439:#209    // setDefensiveMode:(Z)V
   #439 = Utf8               setDefensiveMode
   #440 = String             #441         // offensive
   #441 = Utf8               offensive
   #442 = Methodref          #65.#443     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isOffensiveMode:()Z
   #443 = NameAndType        #444:#92     // isOffensiveMode:()Z
   #444 = Utf8               isOffensiveMode
   #445 = Methodref          #65.#446     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setOffensiveMode:(Z)V
   #446 = NameAndType        #447:#209    // setOffensiveMode:(Z)V
   #447 = Utf8               setOffensiveMode
   #448 = String             #449         // spoilsweep
   #449 = Utf8               spoilsweep
   #450 = Methodref          #68.#451     // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
   #451 = NameAndType        #452:#453    // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
   #452 = Utf8               getSkill
   #453 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
   #454 = Methodref          #65.#455     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleSpoilSweep:()V
   #455 = NameAndType        #456:#6      // toggleSpoilSweep:()V
   #456 = Utf8               toggleSpoilSweep
   #457 = String             #458         // You don\'t have Sweep skills.
   #458 = Utf8               You don\'t have Sweep skills.
   #459 = String             #460         // pickup
   #460 = Utf8               pickup
   #461 = Methodref          #65.#462     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isPickingUpItems:()Z
   #462 = NameAndType        #463:#92     // isPickingUpItems:()Z
   #463 = Utf8               isPickingUpItems
   #464 = Methodref          #101.#465    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isMovementAllowed:()Z
   #465 = NameAndType        #466:#92     // isMovementAllowed:()Z
   #466 = Utf8               isMovementAllowed
   #467 = String             #468         // Option unavailable for routes.
   #468 = Utf8               Option unavailable for routes.
   #469 = String             #470         // Incompatible with your range and the area radius.
   #470 = Utf8               Incompatible with your range and the area radius.
   #471 = Methodref          #65.#472     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleItemPickup:()V
   #472 = NameAndType        #473:#6      // toggleItemPickup:()V
   #473 = Utf8               toggleItemPickup
   #474 = String             #475         // return
   #475 = Utf8               return
   #476 = Methodref          #65.#477     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleDeathReturn:()V
   #477 = NameAndType        #478:#6      // toggleDeathReturn:()V
   #478 = Utf8               toggleDeathReturn
   #479 = String             #480         // set
   #480 = Utf8               set
   #481 = Fieldref           #165.#482    // ext/mods/Config.AUTOFARM_MAX_TIMER:I
   #482 = NameAndType        #483:#484    // AUTOFARM_MAX_TIMER:I
   #483 = Utf8               AUTOFARM_MAX_TIMER
   #484 = Utf8               I
   #485 = InvokeDynamic      #2:#486      // #2:makeConcatWithConstants:(I)Ljava/lang/String;
   #486 = NameAndType        #370:#487    // makeConcatWithConstants:(I)Ljava/lang/String;
   #487 = Utf8               (I)Ljava/lang/String;
   #488 = Methodref          #11.#489     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showTimerWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
   #489 = NameAndType        #490:#355    // showTimerWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
   #490 = Utf8               showTimerWindow
   #491 = Fieldref           #492.#493    // java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
   #492 = Class              #494         // java/util/concurrent/TimeUnit
   #493 = NameAndType        #495:#496    // MINUTES:Ljava/util/concurrent/TimeUnit;
   #494 = Utf8               java/util/concurrent/TimeUnit
   #495 = Utf8               MINUTES
   #496 = Utf8               Ljava/util/concurrent/TimeUnit;
   #497 = Methodref          #492.#498    // java/util/concurrent/TimeUnit.toMillis:(J)J
   #498 = NameAndType        #499:#500    // toMillis:(J)J
   #499 = Utf8               toMillis
   #500 = Utf8               (J)J
   #501 = Methodref          #65.#502     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setEndTime:(J)V
   #502 = NameAndType        #503:#136    // setEndTime:(J)V
   #503 = Utf8               setEndTime
   #504 = String             #505         // Choose your area first.
   #505 = Utf8               Choose your area first.
   #506 = Fieldref           #107.#507    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #507 = NameAndType        #508:#111    // ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #508 = Utf8               ZONA
   #509 = String             #510         // Your current area is incompatible with this option.
   #510 = Utf8               Your current area is incompatible with this option.
   #511 = String             #512         // radius
   #512 = Utf8               radius
   #513 = Methodref          #65.#514     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaMaxRadius:()I
   #514 = NameAndType        #515:#72     // getAreaMaxRadius:()I
   #515 = Utf8               getAreaMaxRadius
   #516 = Methodref          #65.#517     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setRadius:(I)V
   #517 = NameAndType        #518:#188    // setRadius:(I)V
   #518 = Utf8               setRadius
   #519 = Class              #520         // java/util/LinkedHashSet
   #520 = Utf8               java/util/LinkedHashSet
   #521 = Methodref          #519.#3      // java/util/LinkedHashSet."<init>":()V
   #522 = Methodref          #65.#523     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
   #523 = NameAndType        #524:#72     // getFinalRadius:()I
   #524 = Utf8               getFinalRadius
   #525 = InterfaceMethodref #526.#527    // java/util/Set.add:(Ljava/lang/Object;)Z
   #526 = Class              #528         // java/util/Set
   #527 = NameAndType        #529:#84     // add:(Ljava/lang/Object;)Z
   #528 = Utf8               java/util/Set
   #529 = Utf8               add
   #530 = String             #531         // html/mods/autofarm/arealist_options.htm
   #531 = Utf8               html/mods/autofarm/arealist_options.htm
   #532 = String             #533         // %current_radius%
   #533 = Utf8               %current_radius%
   #534 = Methodref          #360.#535    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #535 = NameAndType        #35:#536     // replace:(Ljava/lang/String;I)V
   #536 = Utf8               (Ljava/lang/String;I)V
   #537 = String             #538         // %attack_range%
   #538 = Utf8               %attack_range%
   #539 = Methodref          #65.#540     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAttackRange:()I
   #540 = NameAndType        #541:#72     // getAttackRange:()I
   #541 = Utf8               getAttackRange
   #542 = String             #543         // %radius%
   #543 = Utf8               %radius%
   #544 = InterfaceMethodref #526.#545    // java/util/Set.stream:()Ljava/util/stream/Stream;
   #545 = NameAndType        #546:#547    // stream:()Ljava/util/stream/Stream;
   #546 = Utf8               stream
   #547 = Utf8               ()Ljava/util/stream/Stream;
   #548 = InvokeDynamic      #3:#549      // #3:apply:()Ljava/util/function/Function;
   #549 = NameAndType        #75:#550     // apply:()Ljava/util/function/Function;
   #550 = Utf8               ()Ljava/util/function/Function;
   #551 = InterfaceMethodref #552.#553    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #552 = Class              #554         // java/util/stream/Stream
   #553 = NameAndType        #555:#556    // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #554 = Utf8               java/util/stream/Stream
   #555 = Utf8               map
   #556 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #557 = String             #558         // ;
   #558 = Utf8               ;
   #559 = Methodref          #560.#561    // java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #560 = Class              #562         // java/util/stream/Collectors
   #561 = NameAndType        #563:#564    // joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #562 = Utf8               java/util/stream/Collectors
   #563 = Utf8               joining
   #564 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #565 = InterfaceMethodref #552.#566    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #566 = NameAndType        #567:#568    // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #567 = Utf8               collect
   #568 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #569 = Methodref          #360.#570    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #570 = NameAndType        #35:#276     // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #571 = String             #572         // %msg%
   #572 = Utf8               %msg%
   #573 = Methodref          #11.#574     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
   #574 = NameAndType        #575:#371    // escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
   #575 = Utf8               escapeHtml
   #576 = InvokeDynamic      #4:#369      // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #577 = Methodref          #65.#578     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #578 = NameAndType        #579:#580    // getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #579 = Utf8               getAreaById
   #580 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #581 = String             #582         // Action unavailable at the moment.
   #582 = Utf8               Action unavailable at the moment.
   #583 = Methodref          #65.#584     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
   #584 = NameAndType        #585:#72     // getSelectedAreaId:()I
   #585 = Utf8               getSelectedAreaId
   #586 = Methodref          #65.#587     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setSelectedAreaId:(I)V
   #587 = NameAndType        #588:#188    // setSelectedAreaId:(I)V
   #588 = Utf8               setSelectedAreaId
   #589 = Methodref          #11.#590     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #590 = NameAndType        #591:#592    // showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #591 = Utf8               showAreaListWindow
   #592 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #593 = Fieldref           #107.#594    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #594 = NameAndType        #595:#111    // OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #595 = Utf8               OPEN
   #596 = Methodref          #101.#597    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isFromDb:()Z
   #597 = NameAndType        #598:#92     // isFromDb:()Z
   #598 = Utf8               isFromDb
   #599 = String             #600         // Invalid zone.
   #600 = Utf8               Invalid zone.
   #601 = Methodref          #11.#602     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
   #602 = NameAndType        #591:#603    // showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
   #603 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
   #604 = Methodref          #11.#605     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.canSeeArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #605 = NameAndType        #606:#607    // canSeeArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #606 = Utf8               canSeeArea
   #607 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #608 = String             #609         // Area too far to be used.
   #609 = Utf8               Area too far to be used.
   #610 = Methodref          #101.#611    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
   #611 = NameAndType        #612:#613    // getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
   #612 = Utf8               getFarmZone
   #613 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
   #614 = Methodref          #615.#616    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.isBuilt:()Z
   #615 = Class              #617         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
   #616 = NameAndType        #618:#92     // isBuilt:()Z
   #617 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
   #618 = Utf8               isBuilt
   #619 = Methodref          #615.#620    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.addToWorld:()V
   #620 = NameAndType        #621:#6      // addToWorld:()V
   #621 = Utf8               addToWorld
   #622 = Methodref          #65.#623     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isOpenPreviewShown:()Z
   #623 = NameAndType        #624:#92     // isOpenPreviewShown:()Z
   #624 = Utf8               isOpenPreviewShown
   #625 = Methodref          #11.#626     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showOpenPreviewTemporary:(Lext/mods/gameserver/model/actor/Player;I)V
   #626 = NameAndType        #627:#628    // showOpenPreviewTemporary:(Lext/mods/gameserver/model/actor/Player;I)V
   #627 = Utf8               showOpenPreviewTemporary
   #628 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #629 = Methodref          #199.#630    // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.previewFinalArea:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #630 = NameAndType        #631:#632    // previewFinalArea:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #631 = Utf8               previewFinalArea
   #632 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #633 = Methodref          #65.#634     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
   #634 = NameAndType        #635:#72     // getBuildingAreaId:()I
   #635 = Utf8               getBuildingAreaId
   #636 = Methodref          #65.#637     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #637 = NameAndType        #638:#99     // getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #638 = Utf8               getBuildingArea
   #639 = Methodref          #101.#640    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isChanged:()Z
   #640 = NameAndType        #641:#92     // isChanged:()Z
   #641 = Utf8               isChanged
   #642 = Methodref          #11.#643     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showConfirmChangeWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
   #643 = NameAndType        #644:#645    // showConfirmChangeWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
   #644 = Utf8               showConfirmChangeWindow
   #645 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
   #646 = Methodref          #107.#647    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #647 = NameAndType        #59:#648     // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #648 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #649 = Methodref          #65.#650     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
   #650 = NameAndType        #651:#140    // getEndTime:()J
   #651 = Utf8               getEndTime
   #652 = String             #653         // <font color=FFA000>Macros can be used when a duration is specified for AutoFarm.</font>
   #653 = Utf8               <font color=FFA000>Macros can be used when a duration is specified for AutoFarm.</font>
   #654 = Methodref          #11.#655     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showMacroWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
   #655 = NameAndType        #656:#355    // showMacroWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
   #656 = Utf8               showMacroWindow
   #657 = Methodref          #658.#659    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #658 = Class              #660         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
   #659 = NameAndType        #59:#661     // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #660 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
   #661 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #662 = Methodref          #65.#663     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacro:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #663 = NameAndType        #664:#665    // getMacro:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #664 = Utf8               getMacro
   #665 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #666 = Methodref          #65.#667     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setMacro:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;I)V
   #667 = NameAndType        #668:#669    // setMacro:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;I)V
   #668 = Utf8               setMacro
   #669 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;I)V
   #670 = String             #671         // list
   #671 = Utf8               list
   #672 = Fieldref           #658.#673    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ITEM:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #673 = NameAndType        #674:#675    // ITEM:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #674 = Utf8               ITEM
   #675 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #676 = Methodref          #11.#677     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showMacroItemWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #677 = NameAndType        #678:#628    // showMacroItemWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #678 = Utf8               showMacroItemWindow
   #679 = Fieldref           #658.#680    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.SKILL:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #680 = NameAndType        #681:#675    // SKILL:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #681 = Utf8               SKILL
   #682 = Methodref          #11.#683     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showMacroSkillWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #683 = NameAndType        #684:#628    // showMacroSkillWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #684 = Utf8               showMacroSkillWindow
   #685 = String             #686         // Action currently unavailable.
   #686 = Utf8               Action currently unavailable.
   #687 = String             #688         // new
   #688 = Utf8               new
   #689 = Methodref          #11.#690     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.createArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #690 = NameAndType        #691:#307    // createArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
   #691 = Utf8               createArea
   #692 = String             #693         // addnode
   #693 = Utf8               addnode
   #694 = Methodref          #11.#695     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.newNodeMode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Z)V
   #695 = NameAndType        #696:#697    // newNodeMode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Z)V
   #696 = Utf8               newNodeMode
   #697 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Z)V
   #698 = String             #699         // lock_new_nodes
   #699 = Utf8               lock_new_nodes
   #700 = String             #701         // removenode
   #701 = Utf8               removenode
   #702 = Methodref          #11.#703     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.removeAreaNode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #703 = NameAndType        #704:#339    // removeAreaNode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #704 = Utf8               removeAreaNode
   #705 = String             #706         // clearnodes
   #706 = Utf8               clearnodes
   #707 = Methodref          #199.#708    // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
   #708 = NameAndType        #709:#710    // getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
   #709 = Utf8               getPoints
   #710 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
   #711 = InterfaceMethodref #50.#712     // java/util/Map.isEmpty:()Z
   #712 = NameAndType        #713:#92     // isEmpty:()Z
   #713 = Utf8               isEmpty
   #714 = Methodref          #101.#715    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
   #715 = NameAndType        #716:#717    // getNodes:()Ljava/util/List;
   #716 = Utf8               getNodes
   #717 = Utf8               ()Ljava/util/List;
   #718 = InterfaceMethodref #719.#712    // java/util/List.isEmpty:()Z
   #719 = Class              #720         // java/util/List
   #720 = Utf8               java/util/List
   #721 = InvokeDynamic      #5:#722      // #5:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #722 = NameAndType        #723:#724    // run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #723 = Utf8               run
   #724 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #725 = Methodref          #726.#727    // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
   #726 = Class              #728         // ext/mods/commons/pool/ThreadPool
   #727 = NameAndType        #729:#730    // execute:(Ljava/lang/Runnable;)V
   #728 = Utf8               ext/mods/commons/pool/ThreadPool
   #729 = Utf8               execute
   #730 = Utf8               (Ljava/lang/Runnable;)V
   #731 = InterfaceMethodref #50.#732     // java/util/Map.clear:()V
   #732 = NameAndType        #733:#6      // clear:()V
   #733 = Utf8               clear
   #734 = Methodref          #101.#735    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setIsChanged:(Z)V
   #735 = NameAndType        #736:#209    // setIsChanged:(Z)V
   #736 = Utf8               setIsChanged
   #737 = Methodref          #11.#738     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #738 = NameAndType        #739:#740    // showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #739 = Utf8               showEditAreaWindow
   #740 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #741 = String             #742         // save
   #742 = Utf8               save
   #743 = Methodref          #11.#744     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.saveArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
   #744 = NameAndType        #745:#746    // saveArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
   #745 = Utf8               saveArea
   #746 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
   #747 = String             #748         // discart
   #748 = Utf8               discart
   #749 = String             #750         // delete
   #750 = Utf8               delete
   #751 = Methodref          #11.#752     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.deleteArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #752 = NameAndType        #753:#339    // deleteArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #753 = Utf8               deleteArea
   #754 = String             #755         // edit
   #755 = Utf8               edit
   #756 = Methodref          #65.#757     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setBuildingAreaId:(I)V
   #757 = NameAndType        #758:#188    // setBuildingAreaId:(I)V
   #758 = Utf8               setBuildingAreaId
   #759 = String             #760         // preview
   #760 = Utf8               preview
   #761 = String             #762         // FINAL
   #762 = Utf8               FINAL
   #763 = Methodref          #11.#764     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.previewArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;IZ)V
   #764 = NameAndType        #765:#766    // previewArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;IZ)V
   #765 = Utf8               previewArea
   #766 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;IZ)V
   #767 = String             #768         // page
   #768 = Utf8               page
   #769 = Methodref          #65.#770     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setCurrentSkillSlot:(I)V
   #770 = NameAndType        #771:#188    // setCurrentSkillSlot:(I)V
   #771 = Utf8               setCurrentSkillSlot
   #772 = Methodref          #11.#773     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showSkillsWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #773 = NameAndType        #774:#339    // showSkillsWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #774 = Utf8               showSkillsWindow
   #775 = Methodref          #65.#776     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSkills:()Ljava/util/Map;
   #776 = NameAndType        #777:#778    // getSkills:()Ljava/util/Map;
   #777 = Utf8               getSkills
   #778 = Utf8               ()Ljava/util/Map;
   #779 = String             #733         // clear
   #780 = String             #529         // add
   #781 = InterfaceMethodref #50.#782     // java/util/Map.size:()I
   #782 = NameAndType        #783:#72     // size:()I
   #783 = Utf8               size
   #784 = String             #785         // Maximum number of skills reached.
   #785 = Utf8               Maximum number of skills reached.
   #786 = Methodref          #65.#787     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getCurrentSkillSlot:()I
   #787 = NameAndType        #788:#72     // getCurrentSkillSlot:()I
   #788 = Utf8               getCurrentSkillSlot
   #789 = Class              #790         // java/util/ArrayList
   #790 = Utf8               java/util/ArrayList
   #791 = Methodref          #789.#3      // java/util/ArrayList."<init>":()V
   #792 = InterfaceMethodref #719.#527    // java/util/List.add:(Ljava/lang/Object;)Z
   #793 = InterfaceMethodref #719.#794    // java/util/List.get:(I)Ljava/lang/Object;
   #794 = NameAndType        #63:#795     // get:(I)Ljava/lang/Object;
   #795 = Utf8               (I)Ljava/lang/Object;
   #796 = String             #797         // remove
   #797 = Utf8               remove
   #798 = InterfaceMethodref #50.#799     // java/util/Map.entrySet:()Ljava/util/Set;
   #799 = NameAndType        #800:#801    // entrySet:()Ljava/util/Set;
   #800 = Utf8               entrySet
   #801 = Utf8               ()Ljava/util/Set;
   #802 = InvokeDynamic      #6:#803      // #6:test:(I)Ljava/util/function/Predicate;
   #803 = NameAndType        #804:#805    // test:(I)Ljava/util/function/Predicate;
   #804 = Utf8               test
   #805 = Utf8               (I)Ljava/util/function/Predicate;
   #806 = InterfaceMethodref #552.#807    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #807 = NameAndType        #808:#809    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #808 = Utf8               filter
   #809 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #810 = InvokeDynamic      #7:#549      // #7:apply:()Ljava/util/function/Function;
   #811 = InterfaceMethodref #552.#812    // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #812 = NameAndType        #813:#814    // findFirst:()Ljava/util/Optional;
   #813 = Utf8               findFirst
   #814 = Utf8               ()Ljava/util/Optional;
   #815 = Methodref          #816.#817    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #816 = Class              #818         // java/util/Optional
   #817 = NameAndType        #819:#64     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #818 = Utf8               java/util/Optional
   #819 = Utf8               orElse
   #820 = InterfaceMethodref #50.#821     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #821 = NameAndType        #797:#64     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #822 = Methodref          #113.#823    // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.storeSkills:(Lext/mods/gameserver/model/actor/Player;)V
   #823 = NameAndType        #824:#121    // storeSkills:(Lext/mods/gameserver/model/actor/Player;)V
   #824 = Utf8               storeSkills
   #825 = String             #826         // Choose an area first.
   #826 = Utf8               Choose an area first.
   #827 = Methodref          #11.#828     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showTargetsWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #828 = NameAndType        #829:#339    // showTargetsWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
   #829 = Utf8               showTargetsWindow
   #830 = Methodref          #65.#831     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getTargets:()Ljava/util/Set;
   #831 = NameAndType        #832:#801    // getTargets:()Ljava/util/Set;
   #832 = Utf8               getTargets
   #833 = InterfaceMethodref #526.#732    // java/util/Set.clear:()V
   #834 = Methodref          #835.#836    // ext/mods/gameserver/model/entity/autofarm/Util.getRemainingTokens:(Ljava/util/StringTokenizer;)Ljava/lang/String;
   #835 = Class              #837         // ext/mods/gameserver/model/entity/autofarm/Util
   #836 = NameAndType        #838:#839    // getRemainingTokens:(Ljava/util/StringTokenizer;)Ljava/lang/String;
   #837 = Utf8               ext/mods/gameserver/model/entity/autofarm/Util
   #838 = Utf8               getRemainingTokens
   #839 = Utf8               (Ljava/util/StringTokenizer;)Ljava/lang/String;
   #840 = Methodref          #32.#712     // java/lang/String.isEmpty:()Z
   #841 = InterfaceMethodref #526.#842    // java/util/Set.remove:(Ljava/lang/Object;)Z
   #842 = NameAndType        #797:#84     // remove:(Ljava/lang/Object;)Z
   #843 = Class              #844         // java/lang/StringBuilder
   #844 = Utf8               java/lang/StringBuilder
   #845 = Methodref          #843.#3      // java/lang/StringBuilder."<init>":()V
   #846 = Class              #847         // ext/mods/commons/data/Pagination
   #847 = Utf8               ext/mods/commons/data/Pagination
   #848 = Methodref          #68.#849     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #849 = NameAndType        #850:#851    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #850 = Utf8               getInventory
   #851 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #852 = Methodref          #853.#854    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItems:()Ljava/util/Set;
   #853 = Class              #855         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #854 = NameAndType        #856:#801    // getItems:()Ljava/util/Set;
   #855 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #856 = Utf8               getItems
   #857 = InvokeDynamic      #8:#858      // #8:test:()Ljava/util/function/Predicate;
   #858 = NameAndType        #804:#859    // test:()Ljava/util/function/Predicate;
   #859 = Utf8               ()Ljava/util/function/Predicate;
   #860 = Methodref          #846.#861    // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
   #861 = NameAndType        #5:#862      // "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
   #862 = Utf8               (Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
   #863 = Methodref          #846.#864    // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
   #864 = NameAndType        #865:#866    // iterator:()Ljava/util/Iterator;
   #865 = Utf8               iterator
   #866 = Utf8               ()Ljava/util/Iterator;
   #867 = InterfaceMethodref #868.#869    // java/util/Iterator.hasNext:()Z
   #868 = Class              #870         // java/util/Iterator
   #869 = NameAndType        #871:#92     // hasNext:()Z
   #870 = Utf8               java/util/Iterator
   #871 = Utf8               hasNext
   #872 = InterfaceMethodref #868.#873    // java/util/Iterator.next:()Ljava/lang/Object;
   #873 = NameAndType        #874:#875    // next:()Ljava/lang/Object;
   #874 = Utf8               next
   #875 = Utf8               ()Ljava/lang/Object;
   #876 = Class              #877         // ext/mods/gameserver/model/item/instance/ItemInstance
   #877 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #878 = Methodref          #879.#880    // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #879 = Class              #881         // ext/mods/gameserver/data/HTMLData
   #880 = NameAndType        #116:#882    // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #881 = Utf8               ext/mods/gameserver/data/HTMLData
   #882 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #883 = String             #884         // html/mods/autofarm/parts/macro_table.htm
   #884 = Utf8               html/mods/autofarm/parts/macro_table.htm
   #885 = Methodref          #879.#886    // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #886 = NameAndType        #887:#888    // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #887 = Utf8               getHtm
   #888 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #889 = String             #890         // %icon%
   #890 = Utf8               %icon%
   #891 = Methodref          #876.#892    // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #892 = NameAndType        #893:#894    // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #893 = Utf8               getItem
   #894 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #895 = Methodref          #896.#897    // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
   #896 = Class              #898         // ext/mods/gameserver/model/item/kind/Item
   #897 = NameAndType        #899:#156    // getIcon:()Ljava/lang/String;
   #898 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #899 = Utf8               getIcon
   #900 = String             #901         // %id%
   #901 = Utf8               %id%
   #902 = Methodref          #876.#903    // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #903 = NameAndType        #904:#72     // getItemId:()I
   #904 = Utf8               getItemId
   #905 = Methodref          #32.#906     // java/lang/String.valueOf:(I)Ljava/lang/String;
   #906 = NameAndType        #59:#487     // valueOf:(I)Ljava/lang/String;
   #907 = String             #908         // %name%
   #908 = Utf8               %name%
   #909 = Methodref          #876.#231    // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
   #910 = Methodref          #843.#911    // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #911 = NameAndType        #912:#913    // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #912 = Utf8               append
   #913 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #914 = Methodref          #843.#712    // java/lang/StringBuilder.isEmpty:()Z
   #915 = String             #916         // <tr><td width=280 align=center><br>No compatible item available</td></tr>
   #916 = Utf8               <tr><td width=280 align=center><br>No compatible item available</td></tr>
   #917 = Methodref          #846.#918    // ext/mods/commons/data/Pagination.totalEntries:()I
   #918 = NameAndType        #919:#72     // totalEntries:()I
   #919 = Utf8               totalEntries
   #920 = Methodref          #846.#921    // ext/mods/commons/data/Pagination.generateSpace:(I)V
   #921 = NameAndType        #922:#188    // generateSpace:(I)V
   #922 = Utf8               generateSpace
   #923 = String             #924         // bypass autofarm macro list ITEM %page%
   #924 = Utf8               bypass autofarm macro list ITEM %page%
   #925 = Methodref          #846.#926    // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
   #926 = NameAndType        #927:#160    // generatePages:(Ljava/lang/String;)V
   #927 = Utf8               generatePages
   #928 = String             #929         // html/mods/autofarm/macro_list.htm
   #929 = Utf8               html/mods/autofarm/macro_list.htm
   #930 = String             #931         // %list%
   #931 = Utf8               %list%
   #932 = Methodref          #843.#933    // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #933 = NameAndType        #934:#156    // toString:()Ljava/lang/String;
   #934 = Utf8               toString
   #935 = String             #936         // %pagination%
   #936 = Utf8               %pagination%
   #937 = Methodref          #846.#938    // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
   #938 = NameAndType        #939:#156    // getContent:()Ljava/lang/String;
   #939 = Utf8               getContent
   #940 = String             #941         // %type%
   #941 = Utf8               %type%
   #942 = String             #674         // ITEM
   #943 = Methodref          #68.#776     // ext/mods/gameserver/model/actor/Player.getSkills:()Ljava/util/Map;
   #944 = InterfaceMethodref #945.#545    // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #945 = Class              #946         // java/util/Collection
   #946 = Utf8               java/util/Collection
   #947 = InvokeDynamic      #9:#858      // #9:test:()Ljava/util/function/Predicate;
   #948 = Class              #949         // ext/mods/gameserver/skills/L2Skill
   #949 = Utf8               ext/mods/gameserver/skills/L2Skill
   #950 = Methodref          #948.#951    // ext/mods/gameserver/skills/L2Skill.getId:()I
   #951 = NameAndType        #952:#72     // getId:()I
   #952 = Utf8               getId
   #953 = Methodref          #948.#897    // ext/mods/gameserver/skills/L2Skill.getIcon:()Ljava/lang/String;
   #954 = Methodref          #948.#231    // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
   #955 = String             #956         // <tr><td width=280 align=center><br>No compatible skill available</td></tr>
   #956 = Utf8               <tr><td width=280 align=center><br>No compatible skill available</td></tr>
   #957 = String             #958         // bypass autofarm macro list SKILL %page%
   #958 = Utf8               bypass autofarm macro list SKILL %page%
   #959 = String             #681         // SKILL
   #960 = String             #961         // html/mods/autofarm/macro.htm
   #961 = Utf8               html/mods/autofarm/macro.htm
   #962 = Methodref          #658.#963    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #963 = NameAndType        #53:#964     // values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #964 = Utf8               ()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #965 = String             #966         // %item_bypass%
   #966 = Utf8               %item_bypass%
   #967 = String             #968         // set ITEM 0
   #968 = Utf8               set ITEM 0
   #969 = String             #970         // %item_name%
   #970 = Utf8               %item_name%
   #971 = Methodref          #972.#973    // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #972 = Class              #974         // ext/mods/gameserver/data/xml/ItemData
   #973 = NameAndType        #116:#975    // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #974 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #975 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #976 = Methodref          #65.#977     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacroAdditionalId:()I
   #977 = NameAndType        #978:#72     // getMacroAdditionalId:()I
   #978 = Utf8               getMacroAdditionalId
   #979 = Methodref          #972.#980    // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #980 = NameAndType        #981:#982    // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #981 = Utf8               getTemplate
   #982 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #983 = Methodref          #896.#231    // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
   #984 = InvokeDynamic      #10:#369     // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #985 = String             #986         // %skill_bypass%
   #986 = Utf8               %skill_bypass%
   #987 = String             #988         // set SKILL 0
   #988 = Utf8               set SKILL 0
   #989 = String             #990         // %skill_name%
   #990 = Utf8               %skill_name%
   #991 = Methodref          #658.#992    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.name:()Ljava/lang/String;
   #992 = NameAndType        #993:#156    // name:()Ljava/lang/String;
   #993 = Utf8               name
   #994 = InvokeDynamic      #11:#369     // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #995 = String             #996         // checked
   #996 = Utf8               checked
   #997 = String             #998         // unchecked
   #998 = Utf8               unchecked
   #999 = String             #1000        // list SKILL 1
  #1000 = Utf8               list SKILL 1
  #1001 = String             #1002        // list ITEM 1
  #1002 = Utf8               list ITEM 1
  #1003 = Methodref          #101.#1004   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getMonsterHistory:()Ljava/util/Set;
  #1004 = NameAndType        #1005:#801   // getMonsterHistory:()Ljava/util/Set;
  #1005 = Utf8               getMonsterHistory
  #1006 = Methodref          #835.#1007   // ext/mods/gameserver/model/entity/autofarm/Util.getMonsterComparator:(Ljava/util/Set;)Ljava/util/Comparator;
  #1007 = NameAndType        #1008:#1009  // getMonsterComparator:(Ljava/util/Set;)Ljava/util/Comparator;
  #1008 = Utf8               getMonsterComparator
  #1009 = Utf8               (Ljava/util/Set;)Ljava/util/Comparator;
  #1010 = Methodref          #846.#1011   // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/Comparator;)V
  #1011 = NameAndType        #5:#1012     // "<init>":(Ljava/util/stream/Stream;IILjava/util/Comparator;)V
  #1012 = Utf8               (Ljava/util/stream/Stream;IILjava/util/Comparator;)V
  #1013 = String             #1014        // html/mods/autofarm/parts/targets_table.htm
  #1014 = Utf8               html/mods/autofarm/parts/targets_table.htm
  #1015 = InterfaceMethodref #526.#1016   // java/util/Set.contains:(Ljava/lang/Object;)Z
  #1016 = NameAndType        #1017:#84    // contains:(Ljava/lang/Object;)Z
  #1017 = Utf8               contains
  #1018 = String             #1019        // %action%
  #1019 = Utf8               %action%
  #1020 = String             #1021        // %button_back%
  #1021 = Utf8               %button_back%
  #1022 = String             #1023        // L2UI_CH3.mapbutton_zoomout2
  #1023 = Utf8               L2UI_CH3.mapbutton_zoomout2
  #1024 = String             #1025        // %button_fore%
  #1025 = Utf8               %button_fore%
  #1026 = String             #1027        // L2UI_CH3.mapbutton_zoomout1
  #1027 = Utf8               L2UI_CH3.mapbutton_zoomout1
  #1028 = String             #1029        // L2UI_CH3.mapbutton_zoomin2
  #1029 = Utf8               L2UI_CH3.mapbutton_zoomin2
  #1030 = String             #1031        // L2UI_CH3.mapbutton_zoomin1
  #1031 = Utf8               L2UI_CH3.mapbutton_zoomin1
  #1032 = String             #1033        // %npc_name%
  #1033 = Utf8               %npc_name%
  #1034 = String             #1035        // <tr><td width=280 align=center>Empty</td></tr>
  #1035 = Utf8               <tr><td width=280 align=center>Empty</td></tr>
  #1036 = String             #1037        // bypass autofarm targets page %page%
  #1037 = Utf8               bypass autofarm targets page %page%
  #1038 = String             #1039        // html/mods/autofarm/targets.htm
  #1039 = Utf8               html/mods/autofarm/targets.htm
  #1040 = String             #1041        // %target_count%
  #1041 = Utf8               %target_count%
  #1042 = InterfaceMethodref #526.#782    // java/util/Set.size:()I
  #1043 = String             #1044        // %area%
  #1044 = Utf8               %area%
  #1045 = Methodref          #107.#992    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.name:()Ljava/lang/String;
  #1046 = String             #1047        // %area_name%
  #1047 = Utf8               %area_name%
  #1048 = Methodref          #101.#231    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
  #1049 = InvokeDynamic      #12:#858     // #12:test:()Ljava/util/function/Predicate;
  #1050 = Methodref          #835.#1051   // ext/mods/gameserver/model/entity/autofarm/Util.getSkillComparator:(Ljava/util/Collection;)Ljava/util/Comparator;
  #1051 = NameAndType        #1052:#1053  // getSkillComparator:(Ljava/util/Collection;)Ljava/util/Comparator;
  #1052 = Utf8               getSkillComparator
  #1053 = Utf8               (Ljava/util/Collection;)Ljava/util/Comparator;
  #1054 = Methodref          #846.#1055   // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
  #1055 = NameAndType        #5:#1056     // "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
  #1056 = Utf8               (Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
  #1057 = String             #1058        // html/mods/autofarm/parts/skills_table.htm
  #1058 = Utf8               html/mods/autofarm/parts/skills_table.htm
  #1059 = InterfaceMethodref #945.#1016   // java/util/Collection.contains:(Ljava/lang/Object;)Z
  #1060 = Methodref          #948.#1061   // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
  #1061 = NameAndType        #1062:#72    // getCastRange:()I
  #1062 = Utf8               getCastRange
  #1063 = Methodref          #948.#1064   // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
  #1064 = NameAndType        #1065:#72    // getSkillRadius:()I
  #1065 = Utf8               getSkillRadius
  #1066 = String             #1067        // %skill_icon%
  #1067 = Utf8               %skill_icon%
  #1068 = String             #1069        // %skill_id%
  #1069 = Utf8               %skill_id%
  #1070 = String             #1071        // %skill_type%
  #1071 = Utf8               %skill_type%
  #1072 = Methodref          #948.#1073   // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
  #1073 = NameAndType        #1074:#92    // isDebuff:()Z
  #1074 = Utf8               isDebuff
  #1075 = String             #1076        // Debuff
  #1076 = Utf8               Debuff
  #1077 = Methodref          #948.#1078   // ext/mods/gameserver/skills/L2Skill.isSkillTypeOffensive:()Z
  #1078 = NameAndType        #1079:#92    // isSkillTypeOffensive:()Z
  #1079 = Utf8               isSkillTypeOffensive
  #1080 = String             #1081        // Attack
  #1081 = Utf8               Attack
  #1082 = String             #1083        // Buff
  #1083 = Utf8               Buff
  #1084 = String             #1085        // %skill_range%
  #1085 = Utf8               %skill_range%
  #1086 = Methodref          #948.#1087   // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #1087 = NameAndType        #1088:#92    // isOffensive:()Z
  #1088 = Utf8               isOffensive
  #1089 = InvokeDynamic      #13:#486     // #13:makeConcatWithConstants:(I)Ljava/lang/String;
  #1090 = String             #1091        // bypass autofarm skills page %page%
  #1091 = Utf8               bypass autofarm skills page %page%
  #1092 = String             #1093        // html/mods/autofarm/skills.htm
  #1093 = Utf8               html/mods/autofarm/skills.htm
  #1094 = InvokeDynamic      #14:#486     // #14:makeConcatWithConstants:(I)Ljava/lang/String;
  #1095 = String             #1096        // %page%
  #1096 = Utf8               %page%
  #1097 = Methodref          #11.#1098    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #1098 = NameAndType        #1099:#266   // handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #1099 = Utf8               handleBypass
  #1100 = Methodref          #68.#1101    // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #1101 = NameAndType        #1102:#1103  // getClient:()Lext/mods/gameserver/network/GameClient;
  #1102 = Utf8               getClient
  #1103 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #1104 = Methodref          #1105.#1106  // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #1105 = Class              #1107        // ext/mods/gameserver/network/GameClient
  #1106 = NameAndType        #1108:#92    // isDetached:()Z
  #1107 = Utf8               ext/mods/gameserver/network/GameClient
  #1108 = Utf8               isDetached
  #1109 = String             #1110        // html/mods/autofarm/index.htm
  #1110 = Utf8               html/mods/autofarm/index.htm
  #1111 = Methodref          #1112.#1113  // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #1112 = Class              #1114        // ext/mods/gameserver/data/SkillTable
  #1113 = NameAndType        #116:#1115   // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #1114 = Utf8               ext/mods/gameserver/data/SkillTable
  #1115 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #1116 = Methodref          #1112.#1117  // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #1117 = NameAndType        #1118:#1119  // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #1118 = Utf8               getInfo
  #1119 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #1120 = InvokeDynamic      #15:#486     // #15:makeConcatWithConstants:(I)Ljava/lang/String;
  #1121 = InvokeDynamic      #16:#486     // #16:makeConcatWithConstants:(I)Ljava/lang/String;
  #1122 = InvokeDynamic      #17:#486     // #17:makeConcatWithConstants:(I)Ljava/lang/String;
  #1123 = InvokeDynamic      #18:#486     // #18:makeConcatWithConstants:(I)Ljava/lang/String;
  #1124 = InvokeDynamic      #19:#486     // #19:makeConcatWithConstants:(I)Ljava/lang/String;
  #1125 = InvokeDynamic      #20:#486     // #20:makeConcatWithConstants:(I)Ljava/lang/String;
  #1126 = String             #1127        // L2UI_CH3.refineslot2
  #1127 = Utf8               L2UI_CH3.refineslot2
  #1128 = InvokeDynamic      #21:#486     // #21:makeConcatWithConstants:(I)Ljava/lang/String;
  #1129 = InvokeDynamic      #22:#486     // #22:makeConcatWithConstants:(I)Ljava/lang/String;
  #1130 = String             #1131        // L2UI_CH3.multisell_plusicon
  #1131 = Utf8               L2UI_CH3.multisell_plusicon
  #1132 = String             #1133        // %remaining_time%
  #1133 = Utf8               %remaining_time%
  #1134 = Fieldref           #492.#1135   // java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #1135 = NameAndType        #1136:#496   // MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #1136 = Utf8               MILLISECONDS
  #1137 = Methodref          #65.#1138    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalEndTime:()J
  #1138 = NameAndType        #1139:#140   // getFinalEndTime:()J
  #1139 = Utf8               getFinalEndTime
  #1140 = Methodref          #492.#1141   // java/util/concurrent/TimeUnit.toMinutes:(J)J
  #1141 = NameAndType        #1142:#500   // toMinutes:(J)J
  #1142 = Utf8               toMinutes
  #1143 = InvokeDynamic      #23:#1144    // #23:makeConcatWithConstants:(J)Ljava/lang/String;
  #1144 = NameAndType        #370:#1145   // makeConcatWithConstants:(J)Ljava/lang/String;
  #1145 = Utf8               (J)Ljava/lang/String;
  #1146 = String             #1147        // 0 min
  #1147 = Utf8               0 min
  #1148 = String             #1149        // %end_time%
  #1149 = Utf8               %end_time%
  #1150 = Class              #1151        // java/text/SimpleDateFormat
  #1151 = Utf8               java/text/SimpleDateFormat
  #1152 = String             #1153        // HH:mm:ss
  #1153 = Utf8               HH:mm:ss
  #1154 = Methodref          #1150.#1155  // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #1155 = NameAndType        #5:#160      // "<init>":(Ljava/lang/String;)V
  #1156 = Methodref          #1150.#1157  // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #1157 = NameAndType        #1158:#1159  // format:(Ljava/lang/Object;)Ljava/lang/String;
  #1158 = Utf8               format
  #1159 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #1160 = String             #1161        // 00:00:00
  #1161 = Utf8               00:00:00
  #1162 = String             #1163        // %start_time%
  #1163 = Utf8               %start_time%
  #1164 = Methodref          #65.#1165    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getStartTime:()J
  #1165 = NameAndType        #1166:#140   // getStartTime:()J
  #1166 = Utf8               getStartTime
  #1167 = String             #1168        // %status_color%
  #1168 = Utf8               %status_color%
  #1169 = String             #1170        // 00FF00
  #1170 = Utf8               00FF00
  #1171 = String             #1172        // %status%
  #1172 = Utf8               %status%
  #1173 = String             #1174        // ON
  #1174 = Utf8               ON
  #1175 = String             #1176        // FF0000
  #1176 = Utf8               FF0000
  #1177 = String             #1178        // OFF
  #1178 = Utf8               OFF
  #1179 = Methodref          #65.#1180    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getTotalAvailableTime:()J
  #1180 = NameAndType        #1181:#140   // getTotalAvailableTime:()J
  #1181 = Utf8               getTotalAvailableTime
  #1182 = Methodref          #65.#1183    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getExtraTimeAvailable:()J
  #1183 = NameAndType        #1184:#140   // getExtraTimeAvailable:()J
  #1184 = Utf8               getExtraTimeAvailable
  #1185 = Methodref          #68.#1186    // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
  #1186 = NameAndType        #1187:#72    // getPremiumService:()I
  #1187 = Utf8               getPremiumService
  #1188 = Methodref          #65.#1189    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getRemainingTime:()J
  #1189 = NameAndType        #1190:#140   // getRemainingTime:()J
  #1190 = Utf8               getRemainingTime
  #1191 = String             #1192        // %autofarm_time_remaining%
  #1192 = Utf8               %autofarm_time_remaining%
  #1193 = Methodref          #11.#1194    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.formatAutoFarmTime:(J)Ljava/lang/String;
  #1194 = NameAndType        #1195:#1145  // formatAutoFarmTime:(J)Ljava/lang/String;
  #1195 = Utf8               formatAutoFarmTime
  #1196 = String             #1197        // %autofarm_time_used%
  #1197 = Utf8               %autofarm_time_used%
  #1198 = String             #1199        // %autofarm_daily_limit%
  #1199 = Utf8               %autofarm_daily_limit%
  #1200 = String             #1201        // %autofarm_extra_time%
  #1201 = Utf8               %autofarm_extra_time%
  #1202 = String             #1203        // %autofarm_status%
  #1203 = Utf8               %autofarm_status%
  #1204 = String             #1205        // Premium (Sem Limite)
  #1205 = Utf8               Premium (Sem Limite)
  #1206 = InvokeDynamic      #24:#369     // #24:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1207 = String             #1208        // Normal (2h/dia)
  #1208 = Utf8               Normal (2h/dia)
  #1209 = String             #1210        // %autofarm_status_color%
  #1210 = Utf8               %autofarm_status_color%
  #1211 = String             #1212        // LEVEL
  #1212 = Utf8               LEVEL
  #1213 = String             #1214        // define
  #1214 = Utf8               define
  #1215 = Methodref          #1216.#1217  // ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #1216 = Class              #1218        // ext/mods/commons/lang/StringUtil
  #1217 = NameAndType        #1219:#1220  // trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #1218 = Utf8               ext/mods/commons/lang/StringUtil
  #1219 = Utf8               trimAndDress
  #1220 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #1221 = Methodref          #65.#1222    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaTypeName:()Ljava/lang/String;
  #1222 = NameAndType        #1223:#156   // getAreaTypeName:()Ljava/lang/String;
  #1223 = Utf8               getAreaTypeName
  #1224 = String             #595         // OPEN
  #1225 = String             #1226        // [O]
  #1226 = Utf8               [O]
  #1227 = String             #508         // ZONA
  #1228 = String             #1229        // [Z]
  #1229 = Utf8               [Z]
  #1230 = String             #110         // ROTA
  #1231 = String             #1232        // [R]
  #1232 = Utf8               [R]
  #1233 = InvokeDynamic      #25:#1234    // #25:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1234 = NameAndType        #370:#1235   // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1235 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1236 = String             #1237        // %targets%
  #1237 = Utf8               %targets%
  #1238 = InterfaceMethodref #526.#712    // java/util/Set.isEmpty:()Z
  #1239 = String             #1240        // %duration%
  #1240 = Utf8               %duration%
  #1241 = InvokeDynamic      #26:#1144    // #26:makeConcatWithConstants:(J)Ljava/lang/String;
  #1242 = String             #1243        // %macro%
  #1243 = Utf8               %macro%
  #1244 = Methodref          #658.#933    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.toString:()Ljava/lang/String;
  #1245 = Methodref          #32.#1246    // java/lang/String.toLowerCase:()Ljava/lang/String;
  #1246 = NameAndType        #1247:#156   // toLowerCase:()Ljava/lang/String;
  #1247 = Utf8               toLowerCase
  #1248 = String             #1249        // %autopotion%
  #1249 = Utf8               %autopotion%
  #1250 = Methodref          #65.#1251    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.useAutoPotion:()Z
  #1251 = NameAndType        #1252:#92    // useAutoPotion:()Z
  #1252 = Utf8               useAutoPotion
  #1253 = String             #1254        // %attack_raid%
  #1254 = Utf8               %attack_raid%
  #1255 = Methodref          #65.#1256    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.attackRaid:()Z
  #1256 = NameAndType        #1257:#92    // attackRaid:()Z
  #1257 = Utf8               attackRaid
  #1258 = String             #1259        // %attack_summon%
  #1259 = Utf8               %attack_summon%
  #1260 = Methodref          #65.#1261    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.attackSummon:()Z
  #1261 = NameAndType        #1262:#92    // attackSummon:()Z
  #1262 = Utf8               attackSummon
  #1263 = String             #1264        // %pickup%
  #1264 = Utf8               %pickup%
  #1265 = String             #1266        // %spoilsweep%
  #1266 = Utf8               %spoilsweep%
  #1267 = Methodref          #65.#1268    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.useSpoilSweep:()Z
  #1268 = NameAndType        #1269:#92    // useSpoilSweep:()Z
  #1269 = Utf8               useSpoilSweep
  #1270 = String             #1271        // %defensive%
  #1271 = Utf8               %defensive%
  #1272 = String             #1273        // %offensive%
  #1273 = Utf8               %offensive%
  #1274 = String             #1275        // %def_color%
  #1275 = Utf8               %def_color%
  #1276 = String             #1277        // %off_color%
  #1277 = Utf8               %off_color%
  #1278 = String             #1279        // %return%
  #1279 = Utf8               %return%
  #1280 = String             #1281        // %alert%
  #1281 = Utf8               %alert%
  #1282 = String             #1283        // html/mods/autofarm/parts/index_alert.htm
  #1283 = Utf8               html/mods/autofarm/parts/index_alert.htm
  #1284 = String             #1285        // %fix%
  #1285 = Utf8               %fix%
  #1286 = String             #1287        // <img height=\"-6\">
  #1287 = Utf8               <img height=\"-6\">
  #1288 = String             #1289        // %optional%
  #1289 = Utf8               %optional%
  #1290 = Methodref          #68.#1291    // ext/mods/gameserver/model/actor/Player.isMageClass:()Z
  #1291 = NameAndType        #1292:#92    // isMageClass:()Z
  #1292 = Utf8               isMageClass
  #1293 = String             #1294        // (optional)
  #1294 = Utf8               (optional)
  #1295 = String             #1296        // %auto_refresh%
  #1296 = Utf8               %auto_refresh%
  #1297 = Long               9223372036854775807l
  #1299 = String             #1300        // Ilimitado
  #1300 = Utf8               Ilimitado
  #1301 = Long               3600000l
  #1303 = Long               60000l
  #1305 = String             #1306        // %02d:%02d:%02d
  #1306 = Utf8               %02d:%02d:%02d
  #1307 = Methodref          #32.#1308    // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1308 = NameAndType        #1158:#1309  // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1309 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1310 = String             #1311        // html/mods/autofarm/areaedit.htm
  #1311 = Utf8               html/mods/autofarm/areaedit.htm
  #1312 = String             #1313        // html/mods/autofarm/parts/areaedit_table.htm
  #1313 = Utf8               html/mods/autofarm/parts/areaedit_table.htm
  #1314 = String             #1315        // %node%
  #1315 = Utf8               %node%
  #1316 = String             #1317        // 0
  #1317 = Utf8               0
  #1318 = Methodref          #32.#1319    // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1319 = NameAndType        #1320:#1235  // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1320 = Utf8               replaceAll
  #1321 = String             #1322        // %x%
  #1322 = Utf8               %x%
  #1323 = String             #1324        // %y%
  #1324 = Utf8               %y%
  #1325 = String             #1326        // %z%
  #1326 = Utf8               %z%
  #1327 = InterfaceMethodref #719.#864    // java/util/List.iterator:()Ljava/util/Iterator;
  #1328 = Class              #1329        // ext/mods/gameserver/model/location/Location
  #1329 = Utf8               ext/mods/gameserver/model/location/Location
  #1330 = Methodref          #1328.#1331  // ext/mods/gameserver/model/location/Location.getX:()I
  #1331 = NameAndType        #1332:#72    // getX:()I
  #1332 = Utf8               getX
  #1333 = Methodref          #1328.#1334  // ext/mods/gameserver/model/location/Location.getY:()I
  #1334 = NameAndType        #1335:#72    // getY:()I
  #1335 = Utf8               getY
  #1336 = Methodref          #1328.#1337  // ext/mods/gameserver/model/location/Location.getZ:()I
  #1337 = NameAndType        #1338:#72    // getZ:()I
  #1338 = Utf8               getZ
  #1339 = InterfaceMethodref #526.#864    // java/util/Set.iterator:()Ljava/util/Iterator;
  #1340 = Class              #1341        // java/util/Map$Entry
  #1341 = Utf8               java/util/Map$Entry
  #1342 = InterfaceMethodref #1340.#1343  // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #1343 = NameAndType        #1344:#875   // getKey:()Ljava/lang/Object;
  #1344 = Utf8               getKey
  #1345 = Methodref          #32.#1346    // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1346 = NameAndType        #59:#1159    // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1347 = InterfaceMethodref #1340.#1348  // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #1348 = NameAndType        #1349:#875   // getValue:()Ljava/lang/Object;
  #1349 = Utf8               getValue
  #1350 = Class              #1351        // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
  #1351 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
  #1352 = Methodref          #1350.#1331  // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getX:()I
  #1353 = Methodref          #1350.#1334  // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getY:()I
  #1354 = Methodref          #1350.#1337  // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getZ:()I
  #1355 = String             #1356        // %checkbox%
  #1356 = Utf8               %checkbox%
  #1357 = String             #1358        // %lock%
  #1358 = Utf8               %lock%
  #1359 = Methodref          #65.#1360    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isAddingLocationLocked:()Z
  #1360 = NameAndType        #1361:#92    // isAddingLocationLocked:()Z
  #1361 = Utf8               isAddingLocationLocked
  #1362 = String             #1363        // locked
  #1363 = Utf8               locked
  #1364 = String             #1365        // lock
  #1365 = Utf8               lock
  #1366 = String             #1367        // %adding%
  #1367 = Utf8               %adding%
  #1368 = String             #1369        // -
  #1369 = Utf8               -
  #1370 = String             #1371        // +
  #1371 = Utf8               +
  #1372 = String             #1373        // html/mods/autofarm/arealist_open.htm
  #1373 = Utf8               html/mods/autofarm/arealist_open.htm
  #1374 = Methodref          #1375.#1376  // java/lang/Math.max:(II)I
  #1375 = Class              #1377        // java/lang/Math
  #1376 = NameAndType        #1378:#1379  // max:(II)I
  #1377 = Utf8               java/lang/Math
  #1378 = Utf8               max
  #1379 = Utf8               (II)I
  #1380 = Methodref          #65.#1381    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
  #1381 = NameAndType        #1382:#778   // getAreas:()Ljava/util/Map;
  #1382 = Utf8               getAreas
  #1383 = InvokeDynamic      #27:#1384    // #27:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)Ljava/util/function/Predicate;
  #1384 = NameAndType        #804:#1385   // test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)Ljava/util/function/Predicate;
  #1385 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)Ljava/util/function/Predicate;
  #1386 = InvokeDynamic      #28:#549     // #28:apply:()Ljava/util/function/Function;
  #1387 = InterfaceMethodref #1388.#1389  // java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #1388 = Class              #1390        // java/util/Comparator
  #1389 = NameAndType        #1391:#1392  // comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #1390 = Utf8               java/util/Comparator
  #1391 = Utf8               comparing
  #1392 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
  #1393 = InterfaceMethodref #552.#1394   // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #1394 = NameAndType        #1395:#1396  // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #1395 = Utf8               sorted
  #1396 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #1397 = InterfaceMethodref #552.#1398   // java/util/stream/Stream.toList:()Ljava/util/List;
  #1398 = NameAndType        #1399:#717   // toList:()Ljava/util/List;
  #1399 = Utf8               toList
  #1400 = String             #1401        // arealist_zone.htm
  #1401 = Utf8               arealist_zone.htm
  #1402 = String             #1403        // arealist_route.htm
  #1403 = Utf8               arealist_route.htm
  #1404 = InvokeDynamic      #29:#369     // #29:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1405 = String             #1406        // empty
  #1406 = Utf8               empty
  #1407 = String             #1408        // html/mods/autofarm/parts/arealist_table.htm
  #1408 = Utf8               html/mods/autofarm/parts/arealist_table.htm
  #1409 = Methodref          #101.#951    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
  #1410 = InvokeDynamic      #30:#369     // #30:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1411 = String             #1412        // html/mods/autofarm/timer.htm
  #1412 = Utf8               html/mods/autofarm/timer.htm
  #1413 = String             #1414        // %current%
  #1414 = Utf8               %current%
  #1415 = InvokeDynamic      #31:#1144    // #31:makeConcatWithConstants:(J)Ljava/lang/String;
  #1416 = String             #1417        // confirm_change.htm
  #1417 = Utf8               confirm_change.htm
  #1418 = String             #1419        // confirm_save.htm
  #1419 = Utf8               confirm_save.htm
  #1420 = Methodref          #107.#933    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.toString:()Ljava/lang/String;
  #1421 = Methodref          #101.#1422   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #1422 = NameAndType        #1423:#1424  // getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #1423 = Utf8               getZone
  #1424 = Utf8               ()Lext/mods/gameserver/model/zone/ZoneForm;
  #1425 = Methodref          #199.#1426   // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.setAutoFarmAreaZone:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #1426 = NameAndType        #1427:#645   // setAutoFarmAreaZone:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #1427 = Utf8               setAutoFarmAreaZone
  #1428 = InterfaceMethodref #719.#545    // java/util/List.stream:()Ljava/util/stream/Stream;
  #1429 = InvokeDynamic      #32:#1430    // #32:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #1430 = NameAndType        #804:#1431   // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #1431 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #1432 = InterfaceMethodref #552.#1433   // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
  #1433 = NameAndType        #1434:#1435  // anyMatch:(Ljava/util/function/Predicate;)Z
  #1434 = Utf8               anyMatch
  #1435 = Utf8               (Ljava/util/function/Predicate;)Z
  #1436 = Methodref          #101.#1437   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isOwnerNearOrInside:(I)Z
  #1437 = NameAndType        #1438:#1439  // isOwnerNearOrInside:(I)Z
  #1438 = Utf8               isOwnerNearOrInside
  #1439 = Utf8               (I)Z
  #1440 = Methodref          #11.#1441    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.startPlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
  #1441 = NameAndType        #386:#1442   // startPlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
  #1442 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #1443 = Methodref          #68.#1444    // ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
  #1444 = NameAndType        #1445:#92    // denyAiAction:()Z
  #1445 = Utf8               denyAiAction
  #1446 = Methodref          #68.#1447    // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1447 = NameAndType        #1448:#1449  // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1448 = Utf8               getCast
  #1449 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1450 = Methodref          #1451.#1452  // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #1451 = Class              #1453        // ext/mods/gameserver/model/actor/cast/PlayerCast
  #1452 = NameAndType        #1454:#92    // isCastingNow:()Z
  #1453 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #1454 = Utf8               isCastingNow
  #1455 = Fieldref           #165.#1456   // ext/mods/Config.AUTOFARM_DISABLE_TOWN:Z
  #1456 = NameAndType        #1457:#169   // AUTOFARM_DISABLE_TOWN:Z
  #1457 = Utf8               AUTOFARM_DISABLE_TOWN
  #1458 = Fieldref           #1459.#1460  // ext/mods/gameserver/enums/ZoneId.TOWN:Lext/mods/gameserver/enums/ZoneId;
  #1459 = Class              #1461        // ext/mods/gameserver/enums/ZoneId
  #1460 = NameAndType        #1462:#1463  // TOWN:Lext/mods/gameserver/enums/ZoneId;
  #1461 = Utf8               ext/mods/gameserver/enums/ZoneId
  #1462 = Utf8               TOWN
  #1463 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #1464 = Methodref          #68.#1465    // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #1465 = NameAndType        #1466:#1467  // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #1466 = Utf8               isInsideZone
  #1467 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #1468 = String             #1469        // It is not possible to start in the city
  #1469 = Utf8               It is not possible to start in the city
  #1470 = Methodref          #65.#1471    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.canUseAutoFarm:()Z
  #1471 = NameAndType        #1472:#92    // canUseAutoFarm:()Z
  #1472 = Utf8               canUseAutoFarm
  #1473 = String             #1474        // Esgotado, use itens de tempo para continuar.
  #1474 = Utf8               Esgotado, use itens de tempo para continuar.
  #1475 = String             #1476        // It is necessary to select an area.
  #1476 = Utf8               It is necessary to select an area.
  #1477 = String             #1478        // 1
  #1478 = Utf8               1
  #1479 = String             #1480        // It is necessary to set a duration.
  #1480 = Utf8               It is necessary to set a duration.
  #1481 = Methodref          #1105.#1482  // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #1482 = NameAndType        #1483:#1484  // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #1483 = Utf8               getConnection
  #1484 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
  #1485 = Methodref          #1486.#1487  // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
  #1486 = Class              #1488        // ext/mods/commons/mmocore/MMOConnection
  #1487 = NameAndType        #1489:#1490  // getInetAddress:()Ljava/net/InetAddress;
  #1488 = Utf8               ext/mods/commons/mmocore/MMOConnection
  #1489 = Utf8               getInetAddress
  #1490 = Utf8               ()Ljava/net/InetAddress;
  #1491 = Methodref          #1492.#1493  // java/net/InetAddress.getHostAddress:()Ljava/lang/String;
  #1492 = Class              #1494        // java/net/InetAddress
  #1493 = NameAndType        #1495:#156   // getHostAddress:()Ljava/lang/String;
  #1494 = Utf8               java/net/InetAddress
  #1495 = Utf8               getHostAddress
  #1496 = Fieldref           #165.#1497   // ext/mods/Config.AUTOFARM_ALLOW_DUALBOX:Z
  #1497 = NameAndType        #1498:#169   // AUTOFARM_ALLOW_DUALBOX:Z
  #1498 = Utf8               AUTOFARM_ALLOW_DUALBOX
  #1499 = InvokeDynamic      #33:#858     // #33:test:()Ljava/util/function/Predicate;
  #1500 = InvokeDynamic      #34:#1501    // #34:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #1501 = NameAndType        #804:#1502   // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #1502 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #1503 = String             #1504        // Dualboxing is not allowed
  #1504 = Utf8               Dualboxing is not allowed
  #1505 = String             #1506        // Area too distant to be viewed
  #1506 = Utf8               Area too distant to be viewed
  #1507 = Methodref          #65.#1508    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.markOpenPreviewShown:()V
  #1508 = NameAndType        #1509:#6     // markOpenPreviewShown:()V
  #1509 = Utf8               markOpenPreviewShown
  #1510 = Fieldref           #1459.#1511  // ext/mods/gameserver/enums/ZoneId.AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
  #1511 = NameAndType        #1512:#1463  // AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
  #1512 = Utf8               AUTO_FARM
  #1513 = Methodref          #615.#1514   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.tryGoBackInside:()Z
  #1514 = NameAndType        #1515:#92    // tryGoBackInside:()Z
  #1515 = Utf8               tryGoBackInside
  #1516 = String             #1517        // Move to the inside of the zone.
  #1517 = Utf8               Move to the inside of the zone.
  #1518 = Methodref          #68.#1519    // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #1519 = NameAndType        #1520:#1521  // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #1520 = Utf8               getTarget
  #1521 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #1522 = Methodref          #68.#1523    // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #1523 = NameAndType        #1524:#1525  // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #1524 = Utf8               setTarget
  #1525 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #1526 = Fieldref           #165.#1527   // ext/mods/Config.AUTOFARM_CHANGE_PLAYER_TITLE:Z
  #1527 = NameAndType        #1528:#169   // AUTOFARM_CHANGE_PLAYER_TITLE:Z
  #1528 = Utf8               AUTOFARM_CHANGE_PLAYER_TITLE
  #1529 = Methodref          #68.#1530    // ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
  #1530 = NameAndType        #1531:#156   // getTitle:()Ljava/lang/String;
  #1531 = Utf8               getTitle
  #1532 = Methodref          #65.#1533    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setPlayerTitle:(Ljava/lang/String;)V
  #1533 = NameAndType        #1534:#160   // setPlayerTitle:(Ljava/lang/String;)V
  #1534 = Utf8               setPlayerTitle
  #1535 = String             #1536        // Auto Farming
  #1536 = Utf8               Auto Farming
  #1537 = Fieldref           #165.#1538   // ext/mods/Config.AUTOFARM_PLAYER_NAME_COLOR:Ljava/lang/String;
  #1538 = NameAndType        #1539:#1540  // AUTOFARM_PLAYER_NAME_COLOR:Ljava/lang/String;
  #1539 = Utf8               AUTOFARM_PLAYER_NAME_COLOR
  #1540 = Utf8               Ljava/lang/String;
  #1541 = InvokeDynamic      #35:#369     // #35:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1542 = Methodref          #56.#1543    // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #1543 = NameAndType        #1544:#332   // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #1544 = Utf8               decode
  #1545 = Methodref          #101.#1546   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
  #1546 = NameAndType        #1547:#1548  // getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
  #1547 = Utf8               getRouteZone
  #1548 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
  #1549 = Methodref          #1550.#1551  // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.reset:()V
  #1550 = Class              #1552        // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
  #1551 = NameAndType        #1553:#6     // reset:()V
  #1552 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
  #1553 = Utf8               reset
  #1554 = Methodref          #101.#1555   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.startDeathMonitor:()V
  #1555 = NameAndType        #1556:#6     // startDeathMonitor:()V
  #1556 = Utf8               startDeathMonitor
  #1557 = Methodref          #65.#1558    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.startTimeTracking:()V
  #1558 = NameAndType        #1559:#6     // startTimeTracking:()V
  #1559 = Utf8               startTimeTracking
  #1560 = Methodref          #65.#1561    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.startRoutine:()V
  #1561 = NameAndType        #1562:#6     // startRoutine:()V
  #1562 = Utf8               startRoutine
  #1563 = Methodref          #11.#1564    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.startTimeDisplay:(Lext/mods/gameserver/model/actor/Player;)V
  #1564 = NameAndType        #1565:#121   // startTimeDisplay:(Lext/mods/gameserver/model/actor/Player;)V
  #1565 = Utf8               startTimeDisplay
  #1566 = Methodref          #65.#1567    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1567 = NameAndType        #87:#1568    // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1568 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #1569 = Methodref          #68.#1570    // ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
  #1570 = NameAndType        #1571:#209   // abortAll:(Z)V
  #1571 = Utf8               abortAll
  #1572 = Methodref          #101.#1573   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.stopDeathMonitor:()V
  #1573 = NameAndType        #1574:#6     // stopDeathMonitor:()V
  #1574 = Utf8               stopDeathMonitor
  #1575 = String             #1576        // Error stopping autofarm for player {}: {}
  #1576 = Utf8               Error stopping autofarm for player {}: {}
  #1577 = Methodref          #11.#1578    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopRealTimeRefresh:(Lext/mods/gameserver/model/actor/Player;)V
  #1578 = NameAndType        #1579:#121   // stopRealTimeRefresh:(Lext/mods/gameserver/model/actor/Player;)V
  #1579 = Utf8               stopRealTimeRefresh
  #1580 = InvokeDynamic      #36:#1581    // #36:run:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/lang/Runnable;
  #1581 = NameAndType        #723:#1582   // run:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/lang/Runnable;
  #1582 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/lang/Runnable;
  #1583 = Methodref          #726.#1584   // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #1584 = NameAndType        #1585:#1586  // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #1585 = Utf8               scheduleAtFixedRate
  #1586 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #1587 = Class              #1588        // java/util/concurrent/ScheduledFuture
  #1588 = Utf8               java/util/concurrent/ScheduledFuture
  #1589 = InterfaceMethodref #1587.#1590  // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #1590 = NameAndType        #1591:#1592  // cancel:(Z)Z
  #1591 = Utf8               cancel
  #1592 = Utf8               (Z)Z
  #1593 = InvokeDynamic      #37:#1594    // #37:run:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #1594 = NameAndType        #723:#1595   // run:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #1595 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #1596 = String             #1597        // Vip
  #1597 = Utf8               Vip
  #1598 = String             #1599        // ^[A-Za-z0-9]{1,12}$
  #1599 = Utf8               ^[A-Za-z0-9]{1,12}$
  #1600 = Methodref          #1216.#1601  // ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
  #1601 = NameAndType        #1602:#1603  // isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
  #1602 = Utf8               isValidString
  #1603 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
  #1604 = String             #1605        // Invalid name.
  #1605 = Utf8               Invalid name.
  #1606 = InvokeDynamic      #38:#1501    // #38:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #1607 = String             #1608        // Name already in use.
  #1608 = Utf8               Name already in use.
  #1609 = Methodref          #68.#1610    // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #1610 = NameAndType        #1611:#92    // isGM:()Z
  #1611 = Utf8               isGM
  #1612 = InvokeDynamic      #39:#858     // #39:test:()Ljava/util/function/Predicate;
  #1613 = InterfaceMethodref #552.#1614   // java/util/stream/Stream.count:()J
  #1614 = NameAndType        #1615:#140   // count:()J
  #1615 = Utf8               count
  #1616 = Fieldref           #165.#1617   // ext/mods/Config.AUTOFARM_MAX_ZONES:I
  #1617 = NameAndType        #1618:#484   // AUTOFARM_MAX_ZONES:I
  #1618 = Utf8               AUTOFARM_MAX_ZONES
  #1619 = String             #1620        // Zone limit reached.
  #1620 = Utf8               Zone limit reached.
  #1621 = Methodref          #615.#1622   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone."<init>":(Ljava/lang/String;I)V
  #1622 = NameAndType        #5:#536      // "<init>":(Ljava/lang/String;I)V
  #1623 = Methodref          #615.#951    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getId:()I
  #1624 = InvokeDynamic      #40:#858     // #40:test:()Ljava/util/function/Predicate;
  #1625 = Fieldref           #165.#1626   // ext/mods/Config.AUTOFARM_MAX_ROUTES:I
  #1626 = NameAndType        #1627:#484   // AUTOFARM_MAX_ROUTES:I
  #1627 = Utf8               AUTOFARM_MAX_ROUTES
  #1628 = String             #1629        // Route limit reached.
  #1629 = Utf8               Route limit reached.
  #1630 = Methodref          #1550.#1622  // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute."<init>":(Ljava/lang/String;I)V
  #1631 = Methodref          #1550.#951   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getId:()I
  #1632 = Methodref          #65.#1633    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleAddingLocationLock:()V
  #1633 = NameAndType        #1634:#6     // toggleAddingLocationLock:()V
  #1634 = Utf8               toggleAddingLocationLock
  #1635 = String             #1636        // Indicate the location with the mouse.
  #1636 = Utf8               Indicate the location with the mouse.
  #1637 = String             #1638        // Area too distant to be viewed.
  #1638 = Utf8               Area too distant to be viewed.
  #1639 = Methodref          #199.#1640   // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.restoreDebugPoints:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #1640 = NameAndType        #1641:#1642  // restoreDebugPoints:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #1641 = Utf8               restoreDebugPoints
  #1642 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #1643 = Methodref          #199.#1644   // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.preview:(Lext/mods/gameserver/model/actor/Player;)V
  #1644 = NameAndType        #760:#121    // preview:(Lext/mods/gameserver/model/actor/Player;)V
  #1645 = Fieldref           #165.#1646   // ext/mods/Config.AUTOFARM_MAX_ZONE_NODES:I
  #1646 = NameAndType        #1647:#484   // AUTOFARM_MAX_ZONE_NODES:I
  #1647 = Utf8               AUTOFARM_MAX_ZONE_NODES
  #1648 = Methodref          #1375.#1649  // java/lang/Math.min:(II)I
  #1649 = NameAndType        #1650:#1379  // min:(II)I
  #1650 = Utf8               min
  #1651 = String             #1652        // Your zone has reached the maximum number of points.
  #1652 = Utf8               Your zone has reached the maximum number of points.
  #1653 = Fieldref           #165.#1654   // ext/mods/Config.AUTOFARM_MAX_ROUTE_NODES:I
  #1654 = NameAndType        #1655:#484   // AUTOFARM_MAX_ROUTE_NODES:I
  #1655 = Utf8               AUTOFARM_MAX_ROUTE_NODES
  #1656 = String             #1657        // Your route has reached the maximum number of points.
  #1657 = Utf8               Your route has reached the maximum number of points.
  #1658 = Methodref          #1659.#1660  // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #1659 = Class              #1661        // ext/mods/gameserver/data/manager/ZoneManager
  #1660 = NameAndType        #116:#1662   // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #1661 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #1662 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #1663 = Class              #1664        // ext/mods/gameserver/model/zone/type/TownZone
  #1664 = Utf8               ext/mods/gameserver/model/zone/type/TownZone
  #1665 = Methodref          #1659.#1666  // ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #1666 = NameAndType        #1423:#1667  // getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #1667 = Utf8               (IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #1668 = String             #1669        // Invalid location.
  #1669 = Utf8               Invalid location.
  #1670 = Fieldref           #165.#1671   // ext/mods/Config.AUTOFARM_MAX_ZONE_AREA:I
  #1671 = NameAndType        #1672:#484   // AUTOFARM_MAX_ZONE_AREA:I
  #1672 = Utf8               AUTOFARM_MAX_ZONE_AREA
  #1673 = Methodref          #199.#1674   // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.calculateArea:(Lext/mods/gameserver/model/actor/Player;)D
  #1674 = NameAndType        #1675:#1676  // calculateArea:(Lext/mods/gameserver/model/actor/Player;)D
  #1675 = Utf8               calculateArea
  #1676 = Utf8               (Lext/mods/gameserver/model/actor/Player;)D
  #1677 = String             #1678        // Your zone has reached the maximum size.
  #1678 = Utf8               Your zone has reached the maximum size.
  #1679 = Fieldref           #165.#1680   // ext/mods/Config.AUTOFARM_MAX_ROUTE_PERIMITER:I
  #1680 = NameAndType        #1681:#484   // AUTOFARM_MAX_ROUTE_PERIMITER:I
  #1681 = Utf8               AUTOFARM_MAX_ROUTE_PERIMITER
  #1682 = Methodref          #199.#1683   // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.calculatePerimeter:(Lext/mods/gameserver/model/actor/Player;)D
  #1683 = NameAndType        #1684:#1676  // calculatePerimeter:(Lext/mods/gameserver/model/actor/Player;)D
  #1684 = Utf8               calculatePerimeter
  #1685 = String             #1686        // Your route has reached the maximum length.
  #1686 = Utf8               Your route has reached the maximum length.
  #1687 = Methodref          #1688.#1689  // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1688 = Class              #1690        // ext/mods/gameserver/geoengine/GeoEngine
  #1689 = NameAndType        #116:#1691   // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1690 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #1691 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #1692 = Methodref          #1688.#1693  // ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1693 = NameAndType        #1694:#1695  // canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1694 = Utf8               canSee
  #1695 = Utf8               (IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1696 = String             #1697        // Geographically unavailable point.
  #1697 = Utf8               Geographically unavailable point.
  #1698 = Methodref          #1350.#1699  // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1699 = NameAndType        #1700:#1701  // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1700 = Utf8               distance3D
  #1701 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #1702 = Double             1500.0d
  #1704 = String             #1705        // Point too distant.
  #1705 = Utf8               Point too distant.
  #1706 = Methodref          #199.#1707   // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.addPoint:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #1707 = NameAndType        #1708:#1709  // addPoint:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #1708 = Utf8               addPoint
  #1709 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #1710 = Methodref          #199.#1711   // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.removePoint:(Lext/mods/gameserver/model/actor/Player;I)V
  #1711 = NameAndType        #1712:#628   // removePoint:(Lext/mods/gameserver/model/actor/Player;I)V
  #1712 = Utf8               removePoint
  #1713 = Methodref          #835.#1714   // ext/mods/gameserver/model/entity/autofarm/Util.isNodeListEquals:(Ljava/util/Collection;Ljava/util/List;)Z
  #1714 = NameAndType        #1715:#1716  // isNodeListEquals:(Ljava/util/Collection;Ljava/util/List;)Z
  #1715 = Utf8               isNodeListEquals
  #1716 = Utf8               (Ljava/util/Collection;Ljava/util/List;)Z
  #1717 = Methodref          #113.#1718   // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.deleteArea:(II)V
  #1718 = NameAndType        #753:#1719   // deleteArea:(II)V
  #1719 = Utf8               (II)V
  #1720 = Methodref          #615.#1721   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.removeFromWorld:()V
  #1721 = NameAndType        #1722:#6     // removeFromWorld:()V
  #1722 = Utf8               removeFromWorld
  #1723 = String             #1724        // Build your zone before saving.
  #1724 = Utf8               Build your zone before saving.
  #1725 = String             #1726        // A route needs at least 2 points.
  #1726 = Utf8               A route needs at least 2 points.
  #1727 = String             #1728        // A zone needs at least 3 points.
  #1728 = Utf8               A zone needs at least 3 points.
  #1729 = InterfaceMethodref #719.#732    // java/util/List.clear:()V
  #1730 = Methodref          #113.#1731   // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.insertArea:(ILext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #1731 = NameAndType        #1732:#1733  // insertArea:(ILext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #1732 = Utf8               insertArea
  #1733 = Utf8               (ILext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #1734 = Methodref          #113.#1735   // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.insertNodes:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #1735 = NameAndType        #1736:#1737  // insertNodes:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #1736 = Utf8               insertNodes
  #1737 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #1738 = String             #1739        // Saved!
  #1739 = Utf8               Saved!
  #1740 = String             #1741        // html/mods/autofarm/time_status.htm
  #1741 = Utf8               html/mods/autofarm/time_status.htm
  #1742 = Methodref          #11.#1743    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.formatTime:(J)Ljava/lang/String;
  #1743 = NameAndType        #1744:#1145  // formatTime:(J)Ljava/lang/String;
  #1744 = Utf8               formatTime
  #1745 = String             #1746        // %used_time%
  #1746 = Utf8               %used_time%
  #1747 = String             #1748        // %daily_limit%
  #1748 = Utf8               %daily_limit%
  #1749 = Long               7200000l
  #1751 = String             #1752        // %premium_status%
  #1752 = Utf8               %premium_status%
  #1753 = Fieldref           #1754.#1755  // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #1754 = Class              #1756        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$SingletonHolder
  #1755 = NameAndType        #1757:#1758  // INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #1756 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$SingletonHolder
  #1757 = Utf8               INSTANCE
  #1758 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #1759 = Methodref          #11.#1760    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showTimeRemaining:(Lext/mods/gameserver/model/actor/Player;)V
  #1760 = NameAndType        #1761:#121   // showTimeRemaining:(Lext/mods/gameserver/model/actor/Player;)V
  #1761 = Utf8               showTimeRemaining
  #1762 = Methodref          #11.#1763    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showTimeUpdate:(Lext/mods/gameserver/model/actor/Player;)V
  #1763 = NameAndType        #1764:#121   // showTimeUpdate:(Lext/mods/gameserver/model/actor/Player;)V
  #1764 = Utf8               showTimeUpdate
  #1765 = Methodref          #1688.#1766  // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #1766 = NameAndType        #1767:#1768  // canMoveToTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #1767 = Utf8               canMoveToTarget
  #1768 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #1769 = Methodref          #835.#1770   // ext/mods/gameserver/model/entity/autofarm/Util.isSkillCompatible:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1770 = NameAndType        #1771:#1772  // isSkillCompatible:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1771 = Utf8               isSkillCompatible
  #1772 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #1773 = Methodref          #948.#1774   // ext/mods/gameserver/skills/L2Skill.isPassive:()Z
  #1774 = NameAndType        #1775:#92    // isPassive:()Z
  #1775 = Utf8               isPassive
  #1776 = Methodref          #876.#1777   // ext/mods/gameserver/model/item/instance/ItemInstance.isEtcItem:()Z
  #1777 = NameAndType        #1778:#92    // isEtcItem:()Z
  #1778 = Utf8               isEtcItem
  #1779 = Methodref          #876.#1780   // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #1780 = NameAndType        #1781:#1782  // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #1781 = Utf8               getEtcItem
  #1782 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #1783 = Methodref          #1784.#1785  // ext/mods/gameserver/model/item/kind/EtcItem.getHandlerName:()Ljava/lang/String;
  #1784 = Class              #1786        // ext/mods/gameserver/model/item/kind/EtcItem
  #1785 = NameAndType        #1787:#156   // getHandlerName:()Ljava/lang/String;
  #1786 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
  #1787 = Utf8               getHandlerName
  #1788 = Methodref          #65.#1789    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #1789 = NameAndType        #5:#121      // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #1790 = Methodref          #1791.#231   // java/lang/Class.getName:()Ljava/lang/String;
  #1791 = Class              #1792        // java/lang/Class
  #1792 = Utf8               java/lang/Class
  #1793 = Methodref          #237.#1155   // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #1794 = Utf8               MAX_ROUTE_LINE_LENGTH
  #1795 = Utf8               ConstantValue
  #1796 = Integer            1500
  #1797 = Utf8               HTML_PATH
  #1798 = String             #1799        // html/mods/autofarm/
  #1799 = Utf8               html/mods/autofarm/
  #1800 = Utf8               ZONE_NAME_REGEX
  #1801 = Utf8               Signature
  #1802 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;>;
  #1803 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #1804 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/ScheduledFuture<*>;>;
  #1805 = Utf8               UPDATE_INTERVAL
  #1806 = Utf8               J
  #1807 = Utf8               Code
  #1808 = Utf8               LineNumberTable
  #1809 = Utf8               LocalVariableTable
  #1810 = Utf8               this
  #1811 = Utf8               s
  #1812 = Utf8               StackMapTable
  #1813 = Utf8               getPlayers
  #1814 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;>;
  #1815 = Utf8               id
  #1816 = Utf8               player
  #1817 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1818 = Utf8               isPlayerAddingLoc
  #1819 = Utf8               playerId
  #1820 = Utf8               isPlayerActive
  #1821 = Utf8               isRouteFarmActive
  #1822 = Utf8               onPlayerLogin
  #1823 = Utf8               autoFarmProfile
  #1824 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #1825 = Utf8               timeUsed
  #1826 = Utf8               totalTimeUsed
  #1827 = Utf8               e
  #1828 = Utf8               Ljava/lang/Exception;
  #1829 = Utf8               html
  #1830 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #1831 = Utf8               st
  #1832 = Utf8               Ljava/util/StringTokenizer;
  #1833 = Utf8               command
  #1834 = Utf8               bypass
  #1835 = Utf8               currentTime
  #1836 = Utf8               lastUpdate
  #1837 = Utf8               hasSweep
  #1838 = Utf8               action
  #1839 = Utf8               msg
  #1840 = Utf8               value
  #1841 = Utf8               range
  #1842 = Utf8               i
  #1843 = Utf8               Ljava/util/Set;
  #1844 = Utf8               maxRange
  #1845 = Utf8               LocalVariableTypeTable
  #1846 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #1847 = Utf8               areaId
  #1848 = Utf8               area
  #1849 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #1850 = Utf8               type
  #1851 = Utf8               Exceptions
  #1852 = Class              #1853        // java/lang/IllegalArgumentException
  #1853 = Utf8               java/lang/IllegalArgumentException
  #1854 = Class              #1855        // java/lang/NumberFormatException
  #1855 = Utf8               java/lang/NumberFormatException
  #1856 = Class              #1857        // java/util/NoSuchElementException
  #1857 = Utf8               java/util/NoSuchElementException
  #1858 = Utf8               slots
  #1859 = Utf8               Ljava/util/List;
  #1860 = Utf8               slot
  #1861 = Utf8               skillId
  #1862 = Utf8               changed
  #1863 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #1864 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #1865 = Utf8               targetName
  #1866 = Utf8               table
  #1867 = Utf8               item
  #1868 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1869 = Utf8               sb
  #1870 = Utf8               Ljava/lang/StringBuilder;
  #1871 = Utf8               pagination
  #1872 = Utf8               Lext/mods/commons/data/Pagination;
  #1873 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #1874 = Utf8               skill
  #1875 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1876 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/skills/L2Skill;>;
  #1877 = Class              #1878        // "[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;"
  #1878 = Utf8               [Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #1879 = Utf8               monster
  #1880 = Utf8               Lext/mods/commons/data/Pagination<Ljava/lang/String;>;
  #1881 = Utf8               skillRange
  #1882 = Utf8               extraTime
  #1883 = Utf8               typeName
  #1884 = Utf8               showingSkill
  #1885 = Utf8               totalAvailableTime
  #1886 = Utf8               usedTime
  #1887 = Utf8               extraTimeAvailable
  #1888 = Utf8               isPremium
  #1889 = Utf8               remainingTime
  #1890 = Utf8               areaDisplay
  #1891 = Utf8               timeMs
  #1892 = Utf8               hours
  #1893 = Utf8               minutes
  #1894 = Utf8               seconds
  #1895 = Utf8               showZoneWindow
  #1896 = Utf8               loc
  #1897 = Utf8               Lext/mods/gameserver/model/location/Location;
  #1898 = Utf8               indice
  #1899 = Utf8               entry
  #1900 = Utf8               Ljava/util/Map$Entry;
  #1901 = Utf8               profile
  #1902 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;
  #1903 = Utf8               areas
  #1904 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;>;
  #1905 = Class              #1906        // java/util/Locale
  #1906 = Utf8               java/util/Locale
  #1907 = Utf8               color
  #1908 = Utf8               sendWindow
  #1909 = Utf8               playerIp
  #1910 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
  #1911 = Utf8               startRealTimeRefresh
  #1912 = Utf8               task
  #1913 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #1914 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #1915 = Utf8               timeDisplay
  #1916 = Utf8               message
  #1917 = Utf8               zone
  #1918 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #1919 = Utf8               route
  #1920 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
  #1921 = Utf8               addAreaNode
  #1922 = Utf8               lastPoint
  #1923 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;
  #1924 = Utf8               points
  #1925 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;
  #1926 = Utf8               nodeId
  #1927 = Utf8               clearPreview
  #1928 = Utf8               toggleFarmStatus
  #1929 = Utf8               finalView
  #1930 = Utf8               showTimeStatusWindow
  #1931 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #1932 = Utf8               lambda$createArea$2
  #1933 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #1934 = Utf8               a
  #1935 = Utf8               lambda$createArea$1
  #1936 = Utf8               lambda$createArea$0
  #1937 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #1938 = Utf8               lambda$startTimeDisplay$0
  #1939 = Utf8               lambda$startRealTimeRefresh$0
  #1940 = Utf8               lambda$startPlayer$0
  #1941 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
  #1942 = Utf8               p
  #1943 = Utf8               lambda$canSeeArea$0
  #1944 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #1945 = Utf8               n
  #1946 = Utf8               lambda$showAreaListWindow$0
  #1947 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #1948 = Utf8               lambda$showSkillsWindow$0
  #1949 = Utf8               lambda$showMacroSkillWindow$0
  #1950 = Utf8               lambda$showMacroItemWindow$0
  #1951 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1952 = Utf8               lambda$handleSkillsBypass$0
  #1953 = Utf8               (ILjava/util/Map$Entry;)Z
  #1954 = Utf8               m
  #1955 = Utf8               lambda$handleZoneBuilderBypass$0
  #1956 = Utf8               lambda$getProfile$0
  #1957 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #1958 = Utf8               k
  #1959 = Utf8               Ljava/lang/Integer;
  #1960 = Utf8               <clinit>
  #1961 = Utf8               SourceFile
  #1962 = Utf8               AutoFarmManager.java
  #1963 = Utf8               NestMembers
  #1964 = Utf8               BootstrapMethods
  #1965 = MethodType         #64          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1966 = MethodHandle       6:#1967      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$getProfile$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #1967 = Methodref          #11.#1968    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$getProfile$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #1968 = NameAndType        #1956:#1957  // lambda$getProfile$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #1969 = MethodType         #1970        //  (Ljava/lang/Integer;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #1970 = Utf8               (Ljava/lang/Integer;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #1971 = String             #1972        // html/mods/autofarm/help/\u0001
  #1972 = Utf8               html/mods/autofarm/help/\u0001
  #1973 = String             #1974        // Choose a value between 1 and \u0001
  #1974 = Utf8               Choose a value between 1 and \u0001
  #1975 = MethodHandle       6:#1345      // REF_invokeStatic java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1976 = MethodType         #1977        //  (Ljava/lang/Integer;)Ljava/lang/String;
  #1977 = Utf8               (Ljava/lang/Integer;)Ljava/lang/String;
  #1978 = String             #1979        // \u0001<br>
  #1979 = Utf8               \u0001<br>
  #1980 = MethodType         #6           //  ()V
  #1981 = MethodHandle       6:#1982      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$handleZoneBuilderBypass$0:(Lext/mods/gameserver/model/actor/Player;)V
  #1982 = Methodref          #11.#1983    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$handleZoneBuilderBypass$0:(Lext/mods/gameserver/model/actor/Player;)V
  #1983 = NameAndType        #1955:#121   // lambda$handleZoneBuilderBypass$0:(Lext/mods/gameserver/model/actor/Player;)V
  #1984 = MethodType         #84          //  (Ljava/lang/Object;)Z
  #1985 = MethodHandle       6:#1986      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$handleSkillsBypass$0:(ILjava/util/Map$Entry;)Z
  #1986 = Methodref          #11.#1987    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$handleSkillsBypass$0:(ILjava/util/Map$Entry;)Z
  #1987 = NameAndType        #1952:#1953  // lambda$handleSkillsBypass$0:(ILjava/util/Map$Entry;)Z
  #1988 = MethodType         #1989        //  (Ljava/util/Map$Entry;)Z
  #1989 = Utf8               (Ljava/util/Map$Entry;)Z
  #1990 = MethodHandle       9:#1342      // REF_invokeInterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #1991 = MethodType         #1992        //  (Ljava/util/Map$Entry;)Ljava/lang/Integer;
  #1992 = Utf8               (Ljava/util/Map$Entry;)Ljava/lang/Integer;
  #1993 = MethodHandle       6:#1994      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showMacroItemWindow$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1994 = Methodref          #11.#1995    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showMacroItemWindow$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1995 = NameAndType        #1950:#1951  // lambda$showMacroItemWindow$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1996 = MethodType         #1951        //  (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1997 = MethodHandle       6:#1998      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showMacroSkillWindow$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1998 = Methodref          #11.#1999    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showMacroSkillWindow$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1999 = NameAndType        #1949:#1772  // lambda$showMacroSkillWindow$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2000 = MethodType         #1772        //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #2001 = String             #2002        // (\u0001)
  #2002 = Utf8               (\u0001)
  #2003 = String             #2004        // %\u0001%
  #2004 = Utf8               %\u0001%
  #2005 = MethodHandle       6:#2006      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showSkillsWindow$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2006 = Methodref          #11.#2007    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showSkillsWindow$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2007 = NameAndType        #1948:#1772  // lambda$showSkillsWindow$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2008 = String             #2009        //  - \u0001
  #2009 = Utf8                - \u0001
  #2010 = String             #2011        // Selecionadas: \u0001
  #2011 = Utf8               Selecionadas: \u0001
  #2012 = String             #2013        // %1_negative_height%\u0001
  #2013 = Utf8               %1_negative_height%\u0001
  #2014 = String             #2015        // %skill_icon%\u0001
  #2015 = Utf8               %skill_icon%\u0001
  #2016 = String             #2017        // %skill_width%\u0001
  #2017 = Utf8               %skill_width%\u0001
  #2018 = String             #2019        // %skill_height%\u0001
  #2019 = Utf8               %skill_height%\u0001
  #2020 = String             #2021        // %2_negative_height%\u0001
  #2021 = Utf8               %2_negative_height%\u0001
  #2022 = String             #2023        // %bg_icon%\u0001
  #2023 = Utf8               %bg_icon%\u0001
  #2024 = String             #2025        // %bg_width%\u0001
  #2025 = Utf8               %bg_width%\u0001
  #2026 = String             #2027        // %bg_height%\u0001
  #2027 = Utf8               %bg_height%\u0001
  #2028 = String             #2029        // \u0001 min
  #2029 = Utf8               \u0001 min
  #2030 = String             #2031        // Normal (2h + \u0001 extra)
  #2031 = Utf8               Normal (2h + \u0001 extra)
  #2032 = String             #2033        // \u0001 \u0001
  #2033 = Utf8               \u0001 \u0001
  #2034 = String             #2035        // \u0001 m
  #2035 = Utf8               \u0001 m
  #2036 = MethodHandle       6:#2037      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showAreaListWindow$0:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2037 = Methodref          #11.#2038    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showAreaListWindow$0:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2038 = NameAndType        #1946:#1947  // lambda$showAreaListWindow$0:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2039 = MethodType         #1933        //  (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2040 = MethodHandle       5:#1048      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
  #2041 = MethodType         #2042        //  (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/String;
  #2042 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/String;
  #2043 = String             #2044        // html/mods/autofarm/\u0001
  #2044 = Utf8               html/mods/autofarm/\u0001
  #2045 = String             #2046        // <font color=FFA000>\u0001</font><br>
  #2046 = Utf8               <font color=FFA000>\u0001</font><br>
  #2047 = String             #2048        // \u0001 minute(s)<br>
  #2048 = Utf8               \u0001 minute(s)<br>
  #2049 = MethodHandle       6:#2050      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$canSeeArea$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #2050 = Methodref          #11.#2051    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$canSeeArea$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #2051 = NameAndType        #1943:#1944  // lambda$canSeeArea$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #2052 = MethodType         #2053        //  (Lext/mods/gameserver/model/location/Location;)Z
  #2053 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
  #2054 = MethodHandle       5:#93        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
  #2055 = MethodType         #2056        //  (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
  #2056 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
  #2057 = MethodHandle       6:#2058      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startPlayer$0:(Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
  #2058 = Methodref          #11.#2059    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startPlayer$0:(Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
  #2059 = NameAndType        #1940:#1941  // lambda$startPlayer$0:(Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
  #2060 = String             #2061        // 0x\u0001
  #2061 = Utf8               0x\u0001
  #2062 = MethodHandle       5:#2063      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startRealTimeRefresh$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
  #2063 = Methodref          #11.#2064    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startRealTimeRefresh$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
  #2064 = NameAndType        #1939:#746   // lambda$startRealTimeRefresh$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
  #2065 = MethodHandle       5:#2066      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startTimeDisplay$0:(Lext/mods/gameserver/model/actor/Player;)V
  #2066 = Methodref          #11.#2067    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startTimeDisplay$0:(Lext/mods/gameserver/model/actor/Player;)V
  #2067 = NameAndType        #1938:#121   // lambda$startTimeDisplay$0:(Lext/mods/gameserver/model/actor/Player;)V
  #2068 = MethodHandle       6:#2069      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$0:(Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2069 = Methodref          #11.#2070    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$0:(Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2070 = NameAndType        #1936:#1937  // lambda$createArea$0:(Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2071 = MethodHandle       6:#2072      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$1:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2072 = Methodref          #11.#2073    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$1:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2073 = NameAndType        #1935:#1933  // lambda$createArea$1:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2074 = MethodHandle       6:#2075      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$2:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2075 = Methodref          #11.#2076    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$2:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2076 = NameAndType        #1932:#1933  // lambda$createArea$2:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  #2077 = MethodHandle       6:#2078      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #2078 = Methodref          #2079.#2080  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #2079 = Class              #2081        // java/lang/invoke/LambdaMetafactory
  #2080 = NameAndType        #2082:#2083  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #2081 = Utf8               java/lang/invoke/LambdaMetafactory
  #2082 = Utf8               metafactory
  #2083 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #2084 = MethodHandle       6:#2085      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #2085 = Methodref          #2086.#2087  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #2086 = Class              #2088        // java/lang/invoke/StringConcatFactory
  #2087 = NameAndType        #370:#2089   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #2088 = Utf8               java/lang/invoke/StringConcatFactory
  #2089 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #2090 = Utf8               InnerClasses
  #2091 = Utf8               AutoFarmType
  #2092 = Utf8               AutoFarmMacro
  #2093 = Utf8               Entry
  #2094 = Class              #2095        // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #2095 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #2096 = Utf8               Point
  #2097 = Utf8               SingletonHolder
  #2098 = Class              #2099        // java/lang/invoke/MethodHandles$Lookup
  #2099 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #2100 = Class              #2101        // java/lang/invoke/MethodHandles
  #2101 = Utf8               java/lang/invoke/MethodHandles
  #2102 = Utf8               Lookup
{
  public static final int MAX_ROUTE_LINE_LENGTH;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1500

  public ext.mods.gameserver.model.entity.autofarm.AutoFarmManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _players:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        19: dup
        20: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        23: putfield      #16                 // Field _lastUpdateTime:Ljava/util/Map;
        26: aload_0
        27: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        30: dup
        31: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        34: putfield      #19                 // Field _screenMessageTasks:Ljava/util/Map;
        37: aload_0
        38: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        41: dup
        42: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        45: putfield      #22                 // Field _refreshTasks:Ljava/util/Map;
        48: return
      LineNumberTable:
        line 59: 0
        line 74: 4
        line 76: 15
        line 77: 26
        line 80: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;

  public java.util.Collection<ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile> getPlayers();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _players:Ljava/util/Map;
         4: invokeinterface #49,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
    Signature: #1814                        // ()Ljava/util/Collection<Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;>;

  public ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile getPlayer(int);
    descriptor: (I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _players:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #61,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #65                 // class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
        16: areturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      17     1    id   I

  public ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile getProfile(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _players:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aload_1
        12: invokedynamic #73,  0             // InvokeDynamic #0:apply:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Function;
        17: invokeinterface #77,  3           // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        22: checkcast     #65                 // class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
        25: areturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      26     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean isPlayerAddingLoc(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _players:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #81,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ifeq          31
        16: aload_0
        17: iload_1
        18: invokevirtual #85                 // Method getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        21: invokevirtual #89                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isAddingLocation:()Z
        24: ifeq          31
        27: iconst_1
        28: goto          32
        31: iconst_0
        32: ireturn
      LineNumberTable:
        line 114: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      33     1 playerId   I
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isPlayerActive(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _players:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #81,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ifeq          31
        16: aload_0
        17: iload_1
        18: invokevirtual #85                 // Method getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        21: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        24: ifeq          31
        27: iconst_1
        28: goto          32
        31: iconst_0
        32: ireturn
      LineNumberTable:
        line 119: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      33     1 playerId   I
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isRouteFarmActive(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _players:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #81,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ifeq          48
        16: aload_0
        17: iload_1
        18: invokevirtual #85                 // Method getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        21: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        24: ifeq          48
        27: aload_0
        28: iload_1
        29: invokevirtual #85                 // Method getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        32: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        35: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        38: getstatic     #106                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        41: if_acmpne     48
        44: iconst_1
        45: goto          49
        48: iconst_0
        49: ireturn
      LineNumberTable:
        line 124: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      50     1 playerId   I
      StackMapTable: number_of_entries = 2
        frame_type = 48 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void onPlayerLogin(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: invokestatic  #112                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
         3: aload_1
         4: invokevirtual #118                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.restorePlayer:(Lext/mods/gameserver/model/actor/Player;)V
         7: aload_0
         8: aload_1
         9: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        12: astore_2
        13: aload_2
        14: aload_1
        15: invokevirtual #126                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.updatePlayer:(Lext/mods/gameserver/model/actor/Player;)V
        18: invokestatic  #112                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
        21: aload_1
        22: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        25: invokevirtual #129                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.loadPlayerTimeUsage:(I)J
        28: lstore_3
        29: aload_2
        30: lload_3
        31: invokevirtual #133                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setDailyTimeUsed:(J)V
        34: return
      LineNumberTable:
        line 129: 0
        line 130: 7
        line 131: 13
        line 132: 18
        line 133: 29
        line 134: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      35     1 player   Lext/mods/gameserver/model/actor/Player;
           13      22     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           29       6     3 timeUsed   J

  public void onPlayerLogout(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: invokevirtual #85                 // Method getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         8: astore_2
         9: aload_2
        10: ifnonnull     14
        13: return
        14: aload_2
        15: invokevirtual #137                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getDailyTimeUsed:()J
        18: lstore_3
        19: aload_2
        20: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        23: ifeq          121
        26: aload_2
        27: invokevirtual #141                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.stopTimeTracking:()V
        30: aload_2
        31: invokevirtual #144                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getCurrentSessionTime:()J
        34: aload_2
        35: invokevirtual #137                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getDailyTimeUsed:()J
        38: ladd
        39: lstore_3
        40: aload_0
        41: aload_1
        42: invokevirtual #147                // Method stopTimeDisplay:(Lext/mods/gameserver/model/actor/Player;)V
        45: aload_1
        46: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        49: ifeq          109
        52: aload_2
        53: invokevirtual #153                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayerTitle:()Ljava/lang/String;
        56: ifnull        71
        59: aload_1
        60: aload_2
        61: invokevirtual #153                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayerTitle:()Ljava/lang/String;
        64: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
        67: aload_1
        68: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
        71: getstatic     #164                // Field ext/mods/Config.AUTOFARM_CHANGE_PLAYER_NAME_COLOR:Z
        74: ifeq          109
        77: aload_1
        78: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        81: aload_1
        82: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
        85: invokevirtual #178                // Method ext/mods/gameserver/model/AccessLevel.getNameColor:()I
        88: invokevirtual #183                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
        91: aload_1
        92: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        95: aload_1
        96: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
        99: invokevirtual #189                // Method ext/mods/gameserver/model/AccessLevel.getTitleColor:()I
       102: invokevirtual #192                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
       105: aload_1
       106: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       109: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       112: aload_1
       113: invokevirtual #203                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
       116: aload_2
       117: iconst_0
       118: invokevirtual #206                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setEnabled:(Z)V
       121: lload_3
       122: lconst_0
       123: lcmp
       124: ifle          138
       127: invokestatic  #112                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
       130: aload_1
       131: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       134: lload_3
       135: invokevirtual #210                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.updatePlayerTimeUsage:(IJ)V
       138: aload_2
       139: aconst_null
       140: invokevirtual #126                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.updatePlayer:(Lext/mods/gameserver/model/actor/Player;)V
       143: invokestatic  #214                // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
       146: aload_1
       147: invokevirtual #219                // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.onPlayerLogout:(Lext/mods/gameserver/model/actor/Player;)V
       150: goto          181
       153: astore_2
       154: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       157: ldc           #228                // String Error during autofarm logout for player {}: {}
       159: aload_2
       160: iconst_2
       161: anewarray     #2                  // class java/lang/Object
       164: dup
       165: iconst_0
       166: aload_1
       167: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       170: aastore
       171: dup
       172: iconst_1
       173: aload_2
       174: invokevirtual #233                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       177: aastore
       178: invokevirtual #236                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       181: return
      Exception table:
         from    to  target type
             0    13   153   Class java/lang/Exception
            14   150   153   Class java/lang/Exception
      LineNumberTable:
        line 140: 0
        line 141: 9
        line 142: 13
        line 144: 14
        line 146: 19
        line 148: 26
        line 149: 30
        line 150: 40
        line 152: 45
        line 154: 52
        line 156: 59
        line 157: 67
        line 160: 71
        line 162: 77
        line 163: 91
        line 164: 105
        line 168: 109
        line 169: 116
        line 172: 121
        line 174: 127
        line 177: 138
        line 178: 143
        line 183: 150
        line 180: 153
        line 182: 154
        line 184: 181
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9     141     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           19     131     3 totalTimeUsed   J
          154      27     2     e   Ljava/lang/Exception;
            0     182     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     182     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ long ]
        frame_type = 37 /* same */
        frame_type = 11 /* same */
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class java/lang/Exception ]
        frame_type = 27 /* same */

  public void onPlayerDeath(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: invokevirtual #85                 // Method getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         8: astore_2
         9: aload_2
        10: ifnonnull     14
        13: return
        14: aload_2
        15: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        18: ifeq          36
        21: aload_2
        22: invokevirtual #242                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDeathReturnEnabled:()Z
        25: ifne          36
        28: aload_0
        29: aload_1
        30: ldc           #245                // String You have died. Autofarm has been stopped.
        32: iconst_0
        33: invokevirtual #247                // Method stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
        36: invokestatic  #214                // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
        39: aload_1
        40: invokevirtual #251                // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.onPlayerDeath:(Lext/mods/gameserver/model/actor/Player;)V
        43: goto          74
        46: astore_2
        47: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        50: ldc           #254                // String Error during autofarm death for player {}: {}
        52: aload_2
        53: iconst_2
        54: anewarray     #2                  // class java/lang/Object
        57: dup
        58: iconst_0
        59: aload_1
        60: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        63: aastore
        64: dup
        65: iconst_1
        66: aload_2
        67: invokevirtual #233                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        70: aastore
        71: invokevirtual #236                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        74: return
      Exception table:
         from    to  target type
             0    13    46   Class java/lang/Exception
            14    43    46   Class java/lang/Exception
      LineNumberTable:
        line 190: 0
        line 191: 9
        line 192: 13
        line 194: 14
        line 196: 21
        line 197: 28
        line 200: 36
        line 205: 43
        line 202: 46
        line 204: 47
        line 206: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      34     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           47      27     2     e   Ljava/lang/Exception;
            0      75     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      75     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class java/lang/Exception ]
        frame_type = 27 /* same */

  public void handleBypass(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=3
         0: getstatic     #256                // Field ext/mods/Config.AUTOFARM_ENABLED:Z
         3: ifne          23
         6: aload_0
         7: aload_1
         8: aload_1
         9: sipush        10200
        12: iconst_0
        13: anewarray     #2                  // class java/lang/Object
        16: invokevirtual #259                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        19: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        22: return
        23: aload_1
        24: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        27: ifeq          31
        30: return
        31: new           #270                // class java/util/StringTokenizer
        34: dup
        35: aload_2
        36: ldc_w         #272                // String
        39: invokespecial #274                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        42: astore_3
        43: aload_3
        44: invokevirtual #277                // Method java/util/StringTokenizer.hasMoreTokens:()Z
        47: ifne          51
        50: return
        51: aload_3
        52: invokevirtual #280                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        55: astore        4
        57: aload_0
        58: aload_1
        59: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        62: astore        5
        64: aload_2
        65: ldc_w         #283                // String zb addnode
        68: invokevirtual #285                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        71: ifne          90
        74: aload_2
        75: ldc_w         #289                // String zb lock_new_nodes
        78: invokevirtual #285                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        81: ifne          90
        84: aload         5
        86: iconst_0
        87: invokevirtual #291                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setAddingLocation:(Z)V
        90: aload         4
        92: ldc_w         #294                // String index
        95: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        98: ifeq          115
       101: aload         5
       103: invokevirtual #299                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.checkLastClassId:()V
       106: aload_0
       107: aload_1
       108: aconst_null
       109: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       112: goto          435
       115: aload         4
       117: ldc_w         #302                // String list_areas
       120: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       123: ifeq          137
       126: aload_0
       127: aload_1
       128: aload         5
       130: aload_3
       131: invokevirtual #304                // Method handleListAreasBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
       134: goto          435
       137: aload         4
       139: ldc_w         #308                // String skills
       142: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       145: ifeq          159
       148: aload_0
       149: aload_1
       150: aload         5
       152: aload_3
       153: invokevirtual #310                // Method handleSkillsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
       156: goto          435
       159: aload         4
       161: ldc_w         #313                // String targets
       164: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       167: ifeq          181
       170: aload_0
       171: aload_1
       172: aload         5
       174: aload_3
       175: invokevirtual #315                // Method handleTargetsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
       178: goto          435
       181: aload         4
       183: ldc_w         #318                // String macro
       186: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       189: ifeq          203
       192: aload_0
       193: aload_1
       194: aload         5
       196: aload_3
       197: invokevirtual #320                // Method handleMacroBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
       200: goto          435
       203: aload         4
       205: ldc_w         #323                // String zb
       208: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       211: ifeq          225
       214: aload_0
       215: aload_1
       216: aload         5
       218: aload_3
       219: invokevirtual #325                // Method handleZoneBuilderBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
       222: goto          435
       225: aload         4
       227: ldc_w         #328                // String select_area
       230: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       233: ifeq          256
       236: aload_0
       237: aload_1
       238: aload         5
       240: aload_3
       241: invokevirtual #280                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       244: invokestatic  #330                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
       247: invokevirtual #333                // Method java/lang/Integer.intValue:()I
       250: invokevirtual #336                // Method handleSelectAreaBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
       253: goto          435
       256: aload         4
       258: ldc_w         #340                // String timer
       261: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       264: ifeq          278
       267: aload_0
       268: aload_1
       269: aload         5
       271: aload_3
       272: invokevirtual #342                // Method handleTimerBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
       275: goto          435
       278: aload         4
       280: ldc_w         #345                // String options
       283: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       286: ifeq          300
       289: aload_0
       290: aload_1
       291: aload         5
       293: aload_3
       294: invokevirtual #347                // Method handleAreaOptionsBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
       297: goto          435
       300: aload         4
       302: ldc_w         #350                // String toggle
       305: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       308: ifeq          325
       311: aload_0
       312: aload_1
       313: aload         5
       315: aload_3
       316: invokevirtual #280                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       319: invokevirtual #352                // Method handleToggleBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
       322: goto          435
       325: aload         4
       327: ldc_w         #356                // String clearpreview
       330: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       333: ifeq          354
       336: aload         5
       338: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
       341: ifne          435
       344: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       347: aload_1
       348: invokevirtual #203                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
       351: goto          435
       354: aload         4
       356: ldc_w         #358                // String help
       359: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       362: ifeq          402
       365: new           #360                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       368: dup
       369: iconst_0
       370: invokespecial #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       373: astore        6
       375: aload         6
       377: aload_1
       378: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       381: aload_3
       382: invokevirtual #280                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       385: invokedynamic #368,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       390: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       393: aload_1
       394: aload         6
       396: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       399: goto          435
       402: aload         4
       404: ldc_w         #380                // String change_status
       407: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       410: ifeq          435
       413: aload         5
       415: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
       418: ifeq          430
       421: aload_0
       422: aload_1
       423: aconst_null
       424: invokevirtual #382                // Method stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       427: goto          435
       430: aload_0
       431: aload_1
       432: invokevirtual #384                // Method startPlayer:(Lext/mods/gameserver/model/actor/Player;)V
       435: goto          464
       438: astore_3
       439: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       442: ldc_w         #387                // String Failed to handle AutoFarmManager bypass. Player: {}, Bypass: {}
       445: aload_3
       446: iconst_2
       447: anewarray     #2                  // class java/lang/Object
       450: dup
       451: iconst_0
       452: aload_1
       453: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       456: aastore
       457: dup
       458: iconst_1
       459: aload_2
       460: aastore
       461: invokevirtual #389                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       464: return
      Exception table:
         from    to  target type
             0    22   438   Class java/lang/Exception
            23    30   438   Class java/lang/Exception
            31    50   438   Class java/lang/Exception
            51   435   438   Class java/lang/Exception
      LineNumberTable:
        line 212: 0
        line 214: 6
        line 215: 22
        line 218: 23
        line 219: 30
        line 221: 31
        line 222: 43
        line 223: 50
        line 225: 51
        line 226: 57
        line 228: 64
        line 229: 84
        line 231: 90
        line 233: 101
        line 234: 106
        line 236: 115
        line 237: 126
        line 238: 137
        line 239: 148
        line 240: 159
        line 241: 170
        line 242: 181
        line 243: 192
        line 244: 203
        line 245: 214
        line 246: 225
        line 247: 236
        line 248: 256
        line 249: 267
        line 250: 278
        line 251: 289
        line 252: 300
        line 253: 311
        line 254: 325
        line 256: 336
        line 257: 344
        line 259: 354
        line 261: 365
        line 262: 375
        line 263: 393
        line 264: 399
        line 265: 402
        line 267: 413
        line 268: 421
        line 270: 430
        line 276: 435
        line 273: 438
        line 275: 439
        line 277: 464
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          375      24     6  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           43     392     3    st   Ljava/util/StringTokenizer;
           57     378     4 command   Ljava/lang/String;
           64     371     5 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
          439      25     3     e   Ljava/lang/Exception;
            0     465     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     465     1 player   Lext/mods/gameserver/model/actor/Player;
            0     465     2 bypass   Ljava/lang/String;
      StackMapTable: number_of_entries = 20
        frame_type = 23 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/StringTokenizer ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 24 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 30 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 24 /* same */
        frame_type = 28 /* same */
        frame_type = 47 /* same */
        frame_type = 27 /* same */
        frame_type = 248 /* chop */
          offset_delta = 4
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 25 /* same */

  public void showTimeUpdate(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         5: astore_2
         6: invokestatic  #392                // Method java/lang/System.currentTimeMillis:()J
         9: lstore_3
        10: aload_0
        11: getfield      #16                 // Field _lastUpdateTime:Ljava/util/Map;
        14: aload_1
        15: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        18: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        21: lconst_0
        22: invokestatic  #397                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        25: invokeinterface #402,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #398                // class java/lang/Long
        33: invokevirtual #406                // Method java/lang/Long.longValue:()J
        36: lstore        5
        38: lload_3
        39: lload         5
        41: lsub
        42: ldc2_w        #409                // long 1000l
        45: lcmp
        46: ifge          50
        49: return
        50: aload_0
        51: getfield      #16                 // Field _lastUpdateTime:Ljava/util/Map;
        54: aload_1
        55: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        58: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        61: lload_3
        62: invokestatic  #397                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        65: invokeinterface #411,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        70: pop
        71: aload_2
        72: invokevirtual #414                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.checkTimeLimit:()V
        75: aload_0
        76: aload_1
        77: aconst_null
        78: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        81: return
      LineNumberTable:
        line 281: 0
        line 282: 6
        line 283: 10
        line 285: 38
        line 287: 50
        line 288: 71
        line 290: 75
        line 291: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      82     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      82     1 player   Lext/mods/gameserver/model/actor/Player;
            6      76     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           10      72     3 currentTime   J
           38      44     5 lastUpdate   J
      StackMapTable: number_of_entries = 1
        frame_type = 254 /* append */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, long, long ]

  public void showMacroWindow(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=4
         0: new           #360                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore        4
        10: aload         4
        12: aload_1
        13: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        16: ldc_w         #960                // String html/mods/autofarm/macro.htm
        19: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        22: invokestatic  #962                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        25: astore        5
        27: aload         5
        29: arraylength
        30: istore        6
        32: iconst_0
        33: istore        7
        35: iload         7
        37: iload         6
        39: if_icmpge     194
        42: aload         5
        44: iload         7
        46: aaload
        47: astore        8
        49: aload         8
        51: aload_2
        52: invokevirtual #662                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacro:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        55: if_acmpne     155
        58: aload         8
        60: getstatic     #672                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ITEM:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        63: if_acmpne     109
        66: aload         4
        68: ldc_w         #965                // String %item_bypass%
        71: ldc_w         #967                // String set ITEM 0
        74: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        77: aload         4
        79: ldc_w         #969                // String %item_name%
        82: invokestatic  #971                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        85: aload_2
        86: invokevirtual #976                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacroAdditionalId:()I
        89: invokevirtual #979                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        92: invokevirtual #983                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        95: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
        98: invokedynamic #984,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       103: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       106: goto          155
       109: aload         8
       111: getstatic     #679                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.SKILL:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
       114: if_acmpne     155
       117: aload         4
       119: ldc_w         #985                // String %skill_bypass%
       122: ldc_w         #987                // String set SKILL 0
       125: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       128: aload         4
       130: ldc_w         #989                // String %skill_name%
       133: aload_1
       134: aload_2
       135: invokevirtual #976                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacroAdditionalId:()I
       138: invokevirtual #450                // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
       141: invokevirtual #954                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
       144: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
       147: invokedynamic #984,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       152: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       155: aload         4
       157: aload         8
       159: invokevirtual #991                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.name:()Ljava/lang/String;
       162: invokedynamic #994,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       167: aload         8
       169: aload_2
       170: invokevirtual #662                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacro:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
       173: if_acmpne     182
       176: ldc_w         #995                // String checked
       179: goto          185
       182: ldc_w         #997                // String unchecked
       185: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       188: iinc          7, 1
       191: goto          35
       194: aload         4
       196: ldc_w         #571                // String %msg%
       199: aload_3
       200: ifnull        215
       203: aload_3
       204: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
       207: invokedynamic #576,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       212: goto          217
       215: ldc           #25                 // String
       217: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       220: aload         4
       222: ldc_w         #985                // String %skill_bypass%
       225: ldc_w         #999                // String list SKILL 1
       228: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       231: aload         4
       233: ldc_w         #965                // String %item_bypass%
       236: ldc_w         #1001               // String list ITEM 1
       239: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       242: aload         4
       244: ldc_w         #969                // String %item_name%
       247: ldc           #25                 // String
       249: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       252: aload         4
       254: ldc_w         #989                // String %skill_name%
       257: ldc           #25                 // String
       259: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       262: aload_1
       263: aload         4
       265: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       268: return
      LineNumberTable:
        line 742: 0
        line 743: 10
        line 745: 22
        line 747: 49
        line 749: 58
        line 751: 66
        line 752: 77
        line 754: 109
        line 756: 117
        line 757: 128
        line 760: 155
        line 745: 188
        line 763: 194
        line 764: 220
        line 765: 231
        line 766: 242
        line 767: 252
        line 768: 262
        line 769: 268
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49     139     8 macro   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
            0     269     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     269     1 player   Lext/mods/gameserver/model/actor/Player;
            0     269     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0     269     3   msg   Ljava/lang/String;
           10     259     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class "[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro ]
        frame_type = 45 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class "[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;", int, int, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class "[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;", int, int, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public void showIndexWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc_w         #294                // String index
         5: invokevirtual #1097               // Method handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 869: 0
        line 870: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0       9     1 player   Lext/mods/gameserver/model/actor/Player;

  public void showIndexWindow(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=18, args_size=3
         0: aload_1
         1: ifnull        21
         4: aload_1
         5: invokevirtual #1100               // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
         8: ifnull        21
        11: aload_1
        12: invokevirtual #1100               // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        15: invokevirtual #1104               // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        18: ifeq          22
        21: return
        22: aload_0
        23: aload_1
        24: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        27: astore_3
        28: new           #360                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        31: dup
        32: iconst_0
        33: invokespecial #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        36: astore        4
        38: aload         4
        40: aload_1
        41: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        44: ldc_w         #1109               // String html/mods/autofarm/index.htm
        47: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        50: iconst_0
        51: istore        5
        53: iconst_0
        54: istore        6
        56: iload         6
        58: bipush        6
        60: if_icmpge     365
        63: aload_3
        64: invokevirtual #775                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSkills:()Ljava/util/Map;
        67: iload         6
        69: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        72: invokeinterface #81,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        77: ifeq          235
        80: iconst_1
        81: istore        5
        83: aload_3
        84: invokevirtual #775                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSkills:()Ljava/util/Map;
        87: iload         6
        89: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        92: invokeinterface #61,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        97: checkcast     #56                 // class java/lang/Integer
       100: invokevirtual #333                // Method java/lang/Integer.intValue:()I
       103: istore        7
       105: invokestatic  #1111               // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       108: iload         7
       110: iconst_1
       111: invokevirtual #1116               // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       114: astore        8
       116: aload         4
       118: iload         6
       120: invokedynamic #1120,  0           // InvokeDynamic #15:makeConcatWithConstants:(I)Ljava/lang/String;
       125: bipush        -2
       127: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       130: aload         4
       132: iload         6
       134: invokedynamic #1121,  0           // InvokeDynamic #16:makeConcatWithConstants:(I)Ljava/lang/String;
       139: aload         8
       141: invokevirtual #953                // Method ext/mods/gameserver/skills/L2Skill.getIcon:()Ljava/lang/String;
       144: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       147: aload         4
       149: iload         6
       151: invokedynamic #1122,  0           // InvokeDynamic #17:makeConcatWithConstants:(I)Ljava/lang/String;
       156: bipush        31
       158: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       161: aload         4
       163: iload         6
       165: invokedynamic #1123,  0           // InvokeDynamic #18:makeConcatWithConstants:(I)Ljava/lang/String;
       170: bipush        32
       172: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       175: aload         4
       177: iload         6
       179: invokedynamic #1124,  0           // InvokeDynamic #19:makeConcatWithConstants:(I)Ljava/lang/String;
       184: bipush        -48
       186: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       189: aload         4
       191: iload         6
       193: invokedynamic #1125,  0           // InvokeDynamic #20:makeConcatWithConstants:(I)Ljava/lang/String;
       198: ldc_w         #1126               // String L2UI_CH3.refineslot2
       201: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       204: aload         4
       206: iload         6
       208: invokedynamic #1128,  0           // InvokeDynamic #21:makeConcatWithConstants:(I)Ljava/lang/String;
       213: bipush        36
       215: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       218: aload         4
       220: iload         6
       222: invokedynamic #1129,  0           // InvokeDynamic #22:makeConcatWithConstants:(I)Ljava/lang/String;
       227: bipush        48
       229: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       232: goto          359
       235: aload         4
       237: iload         6
       239: invokedynamic #1120,  0           // InvokeDynamic #15:makeConcatWithConstants:(I)Ljava/lang/String;
       244: bipush        -12
       246: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       249: aload         4
       251: iload         6
       253: invokedynamic #1121,  0           // InvokeDynamic #16:makeConcatWithConstants:(I)Ljava/lang/String;
       258: ldc_w         #1126               // String L2UI_CH3.refineslot2
       261: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       264: aload         4
       266: iload         6
       268: invokedynamic #1122,  0           // InvokeDynamic #17:makeConcatWithConstants:(I)Ljava/lang/String;
       273: bipush        36
       275: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       278: aload         4
       280: iload         6
       282: invokedynamic #1123,  0           // InvokeDynamic #18:makeConcatWithConstants:(I)Ljava/lang/String;
       287: bipush        48
       289: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       292: aload         4
       294: iload         6
       296: invokedynamic #1124,  0           // InvokeDynamic #19:makeConcatWithConstants:(I)Ljava/lang/String;
       301: iload         5
       303: ifeq          311
       306: bipush        -48
       308: goto          313
       311: bipush        -42
       313: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       316: aload         4
       318: iload         6
       320: invokedynamic #1125,  0           // InvokeDynamic #20:makeConcatWithConstants:(I)Ljava/lang/String;
       325: ldc_w         #1130               // String L2UI_CH3.multisell_plusicon
       328: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       331: aload         4
       333: iload         6
       335: invokedynamic #1128,  0           // InvokeDynamic #21:makeConcatWithConstants:(I)Ljava/lang/String;
       340: bipush        31
       342: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       345: aload         4
       347: iload         6
       349: invokedynamic #1129,  0           // InvokeDynamic #22:makeConcatWithConstants:(I)Ljava/lang/String;
       354: bipush        30
       356: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       359: iinc          6, 1
       362: goto          56
       365: aload_3
       366: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
       369: ifeq          510
       372: aload         4
       374: ldc_w         #1132               // String %remaining_time%
       377: aload_3
       378: invokevirtual #649                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
       381: lconst_0
       382: lcmp
       383: ifeq          408
       386: getstatic     #1134               // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
       389: aload_3
       390: invokevirtual #1137               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalEndTime:()J
       393: invokestatic  #392                // Method java/lang/System.currentTimeMillis:()J
       396: lsub
       397: invokevirtual #1140               // Method java/util/concurrent/TimeUnit.toMinutes:(J)J
       400: invokedynamic #1143,  0           // InvokeDynamic #23:makeConcatWithConstants:(J)Ljava/lang/String;
       405: goto          411
       408: ldc_w         #1146               // String 0 min
       411: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       414: aload         4
       416: ldc_w         #1148               // String %end_time%
       419: aload_3
       420: invokevirtual #649                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
       423: lconst_0
       424: lcmp
       425: ifeq          451
       428: new           #1150               // class java/text/SimpleDateFormat
       431: dup
       432: ldc_w         #1152               // String HH:mm:ss
       435: invokespecial #1154               // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       438: aload_3
       439: invokevirtual #1137               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalEndTime:()J
       442: invokestatic  #397                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       445: invokevirtual #1156               // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       448: goto          454
       451: ldc_w         #1160               // String 00:00:00
       454: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       457: aload         4
       459: ldc_w         #1162               // String %start_time%
       462: new           #1150               // class java/text/SimpleDateFormat
       465: dup
       466: ldc_w         #1152               // String HH:mm:ss
       469: invokespecial #1154               // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       472: aload_3
       473: invokevirtual #1164               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getStartTime:()J
       476: invokestatic  #397                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       479: invokevirtual #1156               // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       482: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       485: aload         4
       487: ldc_w         #1167               // String %status_color%
       490: ldc_w         #1169               // String 00FF00
       493: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       496: aload         4
       498: ldc_w         #1171               // String %status%
       501: ldc_w         #1173               // String ON
       504: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       507: goto          565
       510: aload         4
       512: ldc_w         #1132               // String %remaining_time%
       515: ldc_w         #1146               // String 0 min
       518: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       521: aload         4
       523: ldc_w         #1148               // String %end_time%
       526: ldc_w         #1160               // String 00:00:00
       529: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       532: aload         4
       534: ldc_w         #1162               // String %start_time%
       537: ldc_w         #1160               // String 00:00:00
       540: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       543: aload         4
       545: ldc_w         #1167               // String %status_color%
       548: ldc_w         #1175               // String FF0000
       551: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       554: aload         4
       556: ldc_w         #1171               // String %status%
       559: ldc_w         #1177               // String OFF
       562: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       565: aload_3
       566: invokevirtual #1179               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getTotalAvailableTime:()J
       569: lstore        6
       571: aload_3
       572: invokevirtual #137                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getDailyTimeUsed:()J
       575: lstore        8
       577: aload_3
       578: invokevirtual #1182               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getExtraTimeAvailable:()J
       581: lstore        10
       583: aload_1
       584: invokevirtual #1185               // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       587: ifle          594
       590: iconst_1
       591: goto          595
       594: iconst_0
       595: istore        12
       597: aload_3
       598: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
       601: ifeq          615
       604: aload_3
       605: invokevirtual #144                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getCurrentSessionTime:()J
       608: aload_3
       609: invokevirtual #137                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getDailyTimeUsed:()J
       612: ladd
       613: lstore        8
       615: aload_3
       616: invokevirtual #1188               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getRemainingTime:()J
       619: lstore        13
       621: aload         4
       623: ldc_w         #1191               // String %autofarm_time_remaining%
       626: aload_0
       627: lload         13
       629: invokevirtual #1193               // Method formatAutoFarmTime:(J)Ljava/lang/String;
       632: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       635: aload         4
       637: ldc_w         #1196               // String %autofarm_time_used%
       640: aload_0
       641: lload         8
       643: invokevirtual #1193               // Method formatAutoFarmTime:(J)Ljava/lang/String;
       646: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       649: aload         4
       651: ldc_w         #1198               // String %autofarm_daily_limit%
       654: aload_0
       655: lload         6
       657: invokevirtual #1193               // Method formatAutoFarmTime:(J)Ljava/lang/String;
       660: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       663: aload         4
       665: ldc_w         #1200               // String %autofarm_extra_time%
       668: aload_0
       669: lload         10
       671: invokevirtual #1193               // Method formatAutoFarmTime:(J)Ljava/lang/String;
       674: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       677: iload         12
       679: ifeq          696
       682: aload         4
       684: ldc_w         #1202               // String %autofarm_status%
       687: ldc_w         #1204               // String Premium (Sem Limite)
       690: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       693: goto          740
       696: lload         10
       698: lstore        15
       700: lload         15
       702: lconst_0
       703: lcmp
       704: ifle          729
       707: aload         4
       709: ldc_w         #1202               // String %autofarm_status%
       712: aload_0
       713: lload         15
       715: invokevirtual #1193               // Method formatAutoFarmTime:(J)Ljava/lang/String;
       718: invokedynamic #1206,  0           // InvokeDynamic #24:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       723: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       726: goto          740
       729: aload         4
       731: ldc_w         #1202               // String %autofarm_status%
       734: ldc_w         #1207               // String Normal (2h/dia)
       737: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       740: aload         4
       742: ldc_w         #1209               // String %autofarm_status_color%
       745: iload         12
       747: ifeq          756
       750: ldc_w         #1211               // String LEVEL
       753: goto          759
       756: ldc_w         #1211               // String LEVEL
       759: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       762: ldc_w         #1213               // String define
       765: astore        15
       767: aload_3
       768: invokevirtual #583                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
       771: ifeq          859
       774: aload_3
       775: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       778: invokevirtual #1048               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
       781: bipush        10
       783: invokestatic  #1215               // Method ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
       786: astore        16
       788: aload_3
       789: invokevirtual #1221               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaTypeName:()Ljava/lang/String;
       792: astore        17
       794: aload         17
       796: ldc_w         #1224               // String OPEN
       799: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       802: ifeq          813
       805: ldc_w         #1225               // String [O]
       808: astore        17
       810: goto          848
       813: aload         17
       815: ldc_w         #1227               // String ZONA
       818: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       821: ifeq          832
       824: ldc_w         #1228               // String [Z]
       827: astore        17
       829: goto          848
       832: aload         17
       834: ldc_w         #1230               // String ROTA
       837: invokevirtual #296                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       840: ifeq          848
       843: ldc_w         #1231               // String [R]
       846: astore        17
       848: aload         16
       850: aload         17
       852: invokedynamic #1233,  0           // InvokeDynamic #25:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       857: astore        15
       859: aload         4
       861: ldc_w         #1043               // String %area%
       864: aload         15
       866: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
       869: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       872: aload         4
       874: ldc_w         #1236               // String %targets%
       877: aload_3
       878: invokevirtual #830                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getTargets:()Ljava/util/Set;
       881: invokeinterface #1238,  1         // InterfaceMethod java/util/Set.isEmpty:()Z
       886: ifne          904
       889: aload_3
       890: invokevirtual #830                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getTargets:()Ljava/util/Set;
       893: invokeinterface #1042,  1         // InterfaceMethod java/util/Set.size:()I
       898: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       901: goto          907
       904: ldc_w         #1213               // String define
       907: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       910: aload         4
       912: ldc_w         #1239               // String %duration%
       915: aload_3
       916: invokevirtual #649                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
       919: lconst_0
       920: lcmp
       921: ifeq          942
       924: getstatic     #1134               // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
       927: aload_3
       928: invokevirtual #649                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
       931: invokevirtual #1140               // Method java/util/concurrent/TimeUnit.toMinutes:(J)J
       934: invokedynamic #1241,  0           // InvokeDynamic #26:makeConcatWithConstants:(J)Ljava/lang/String;
       939: goto          945
       942: ldc_w         #1213               // String define
       945: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       948: aload         4
       950: ldc_w         #1242               // String %macro%
       953: aload_3
       954: invokevirtual #662                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacro:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
       957: ifnull        973
       960: aload_3
       961: invokevirtual #662                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacro:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
       964: invokevirtual #1244               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.toString:()Ljava/lang/String;
       967: invokevirtual #1245               // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       970: goto          976
       973: ldc_w         #1213               // String define
       976: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       979: aload         4
       981: ldc_w         #1248               // String %autopotion%
       984: aload_3
       985: invokevirtual #1250               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.useAutoPotion:()Z
       988: ifeq          997
       991: ldc_w         #995                // String checked
       994: goto          1000
       997: ldc_w         #997                // String unchecked
      1000: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1003: aload         4
      1005: ldc_w         #1253               // String %attack_raid%
      1008: aload_3
      1009: invokevirtual #1255               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.attackRaid:()Z
      1012: ifeq          1021
      1015: ldc_w         #995                // String checked
      1018: goto          1024
      1021: ldc_w         #997                // String unchecked
      1024: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1027: aload         4
      1029: ldc_w         #1258               // String %attack_summon%
      1032: aload_3
      1033: invokevirtual #1260               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.attackSummon:()Z
      1036: ifeq          1045
      1039: ldc_w         #995                // String checked
      1042: goto          1048
      1045: ldc_w         #997                // String unchecked
      1048: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1051: aload         4
      1053: ldc_w         #1263               // String %pickup%
      1056: aload_3
      1057: invokevirtual #461                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isPickingUpItems:()Z
      1060: ifeq          1069
      1063: ldc_w         #995                // String checked
      1066: goto          1072
      1069: ldc_w         #997                // String unchecked
      1072: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1075: aload         4
      1077: ldc_w         #1265               // String %spoilsweep%
      1080: aload_3
      1081: invokevirtual #1267               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.useSpoilSweep:()Z
      1084: ifeq          1093
      1087: ldc_w         #995                // String checked
      1090: goto          1096
      1093: ldc_w         #997                // String unchecked
      1096: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1099: aload         4
      1101: ldc_w         #1270               // String %defensive%
      1104: aload_3
      1105: invokevirtual #434                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDefensiveMode:()Z
      1108: ifeq          1117
      1111: ldc_w         #995                // String checked
      1114: goto          1120
      1117: ldc_w         #997                // String unchecked
      1120: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1123: aload         4
      1125: ldc_w         #1272               // String %offensive%
      1128: aload_3
      1129: invokevirtual #442                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isOffensiveMode:()Z
      1132: ifeq          1141
      1135: ldc_w         #995                // String checked
      1138: goto          1144
      1141: ldc_w         #997                // String unchecked
      1144: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1147: aload         4
      1149: ldc_w         #1274               // String %def_color%
      1152: aload_3
      1153: invokevirtual #434                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDefensiveMode:()Z
      1156: ifeq          1165
      1159: ldc_w         #1169               // String 00FF00
      1162: goto          1168
      1165: ldc_w         #1211               // String LEVEL
      1168: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1171: aload         4
      1173: ldc_w         #1276               // String %off_color%
      1176: aload_3
      1177: invokevirtual #442                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isOffensiveMode:()Z
      1180: ifeq          1189
      1183: ldc_w         #1169               // String 00FF00
      1186: goto          1192
      1189: ldc_w         #1211               // String LEVEL
      1192: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1195: aload         4
      1197: ldc_w         #1278               // String %return%
      1200: aload_3
      1201: invokevirtual #242                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDeathReturnEnabled:()Z
      1204: ifeq          1213
      1207: ldc_w         #995                // String checked
      1210: goto          1216
      1213: ldc_w         #997                // String unchecked
      1216: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1219: aload         4
      1221: ldc_w         #1280               // String %alert%
      1224: aload_2
      1225: ifnull        1254
      1228: invokestatic  #878                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
      1231: aload_1
      1232: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1235: ldc_w         #1282               // String html/mods/autofarm/parts/index_alert.htm
      1238: invokevirtual #885                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
      1241: ldc_w         #571                // String %msg%
      1244: aload_2
      1245: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
      1248: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1251: goto          1256
      1254: ldc           #25                 // String
      1256: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1259: aload         4
      1261: ldc_w         #1284               // String %fix%
      1264: iload         5
      1266: ifeq          1275
      1269: ldc_w         #1286               // String <img height=\"-6\">
      1272: goto          1277
      1275: ldc           #25                 // String
      1277: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1280: aload         4
      1282: ldc_w         #1288               // String %optional%
      1285: aload_1
      1286: invokevirtual #1290               // Method ext/mods/gameserver/model/actor/Player.isMageClass:()Z
      1289: ifeq          1297
      1292: ldc           #25                 // String
      1294: goto          1300
      1297: ldc_w         #1293               // String (optional)
      1300: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1303: aload         4
      1305: ldc_w         #1295               // String %auto_refresh%
      1308: ldc           #25                 // String
      1310: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1313: aload_1
      1314: aload         4
      1316: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1319: return
      LineNumberTable:
        line 874: 0
        line 875: 21
        line 877: 22
        line 878: 28
        line 879: 38
        line 881: 50
        line 882: 53
        line 884: 63
        line 886: 80
        line 887: 83
        line 888: 105
        line 890: 116
        line 891: 130
        line 892: 147
        line 893: 161
        line 894: 175
        line 895: 189
        line 896: 204
        line 897: 218
        line 898: 232
        line 901: 235
        line 902: 249
        line 903: 264
        line 904: 278
        line 905: 292
        line 906: 316
        line 907: 331
        line 908: 345
        line 882: 359
        line 912: 365
        line 914: 372
        line 915: 414
        line 916: 457
        line 917: 485
        line 918: 496
        line 922: 510
        line 923: 521
        line 924: 532
        line 925: 543
        line 926: 554
        line 929: 565
        line 930: 571
        line 931: 577
        line 932: 583
        line 934: 597
        line 936: 604
        line 939: 615
        line 941: 621
        line 942: 635
        line 943: 649
        line 944: 663
        line 946: 677
        line 948: 682
        line 952: 696
        line 953: 700
        line 955: 707
        line 959: 729
        line 963: 740
        line 965: 762
        line 966: 767
        line 967: 774
        line 968: 788
        line 969: 794
        line 970: 813
        line 971: 832
        line 972: 848
        line 974: 859
        line 976: 872
        line 977: 910
        line 978: 948
        line 980: 979
        line 981: 1003
        line 982: 1027
        line 983: 1051
        line 984: 1075
        line 985: 1099
        line 986: 1123
        line 988: 1147
        line 989: 1171
        line 990: 1195
        line 992: 1219
        line 993: 1259
        line 994: 1280
        line 995: 1303
        line 997: 1313
        line 998: 1319
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          105     127     7 skillId   I
          116     116     8 skill   Lext/mods/gameserver/skills/L2Skill;
           56     309     6  slot   I
          700      40    15 extraTime   J
          788      71    16  name   Ljava/lang/String;
          794      65    17 typeName   Ljava/lang/String;
            0    1320     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0    1320     1 player   Lext/mods/gameserver/model/actor/Player;
            0    1320     2   msg   Ljava/lang/String;
           28    1292     3 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           38    1282     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           53    1267     5 showingSkill   Z
          571     749     6 totalAvailableTime   J
          577     743     8 usedTime   J
          583     737    10 extraTimeAvailable   J
          597     723    12 isPremium   Z
          621     699    13 remainingTime   J
          767     553    15 areaDisplay   Ljava/lang/String;
      StackMapTable: number_of_entries = 58
        frame_type = 21 /* same */
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 178
        frame_type = 255 /* full_frame */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, int ]
        frame_type = 45 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 55 /* same */
        frame_type = 54 /* same */
        frame_type = 254 /* append */
          offset_delta = 28
          locals = [ long, long, long ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 80
          locals = [ long ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ long ]
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 254 /* append */
          offset_delta = 53
          locals = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 249 /* chop */
          offset_delta = 10
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, long, long, long, int, long, class java/lang/String ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public void showZoneWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aload_0
         3: aload_1
         4: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         7: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
        10: aconst_null
        11: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
        14: return
      LineNumberTable:
        line 1013: 0
        line 1014: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      15     1 player   Lext/mods/gameserver/model/actor/Player;

  public void showEditAreaWindow(ext.mods.gameserver.model.actor.Player, int, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         5: iload_2
         6: invokevirtual #577                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
         9: astore        4
        11: aload         4
        13: ifnonnull     17
        16: return
        17: new           #360                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        20: dup
        21: iconst_0
        22: invokespecial #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        25: astore        5
        27: aload         5
        29: aload_1
        30: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        33: ldc_w         #1310               // String html/mods/autofarm/areaedit.htm
        36: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        39: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        42: aload_1
        43: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
        46: invokeinterface #711,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        51: ifeq          155
        54: aload         4
        56: invokevirtual #639                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isChanged:()Z
        59: ifne          75
        62: aload         4
        64: invokevirtual #714                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
        67: invokeinterface #718,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        72: ifeq          155
        75: invokestatic  #878                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        78: aload_1
        79: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        82: ldc_w         #1312               // String html/mods/autofarm/parts/areaedit_table.htm
        85: invokevirtual #885                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        88: astore        6
        90: aload         6
        92: ldc_w         #1314               // String %node%
        95: ldc_w         #1316               // String 0
        98: invokevirtual #1318               // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       101: astore        6
       103: aload         6
       105: ldc_w         #1321               // String %x%
       108: ldc_w         #1316               // String 0
       111: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       114: astore        6
       116: aload         6
       118: ldc_w         #1323               // String %y%
       121: ldc_w         #1316               // String 0
       124: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       127: astore        6
       129: aload         6
       131: ldc_w         #1325               // String %z%
       134: ldc_w         #1316               // String 0
       137: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       140: astore        6
       142: aload         5
       144: ldc_w         #930                // String %list%
       147: aload         6
       149: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       152: goto          495
       155: new           #843                // class java/lang/StringBuilder
       158: dup
       159: invokespecial #845                // Method java/lang/StringBuilder."<init>":()V
       162: astore        6
       164: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       167: aload_1
       168: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
       171: invokeinterface #711,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
       176: ifeq          317
       179: iconst_0
       180: istore        7
       182: aload         4
       184: invokevirtual #714                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
       187: invokeinterface #1327,  1         // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       192: astore        8
       194: aload         8
       196: invokeinterface #867,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       201: ifeq          314
       204: aload         8
       206: invokeinterface #872,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       211: checkcast     #1328               // class ext/mods/gameserver/model/location/Location
       214: astore        9
       216: iinc          7, 1
       219: invokestatic  #878                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       222: aload_1
       223: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       226: ldc_w         #1312               // String html/mods/autofarm/parts/areaedit_table.htm
       229: invokevirtual #885                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
       232: astore        10
       234: aload         10
       236: ldc_w         #1314               // String %node%
       239: iload         7
       241: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       244: invokevirtual #1318               // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       247: astore        10
       249: aload         10
       251: ldc_w         #1321               // String %x%
       254: aload         9
       256: invokevirtual #1330               // Method ext/mods/gameserver/model/location/Location.getX:()I
       259: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       262: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       265: astore        10
       267: aload         10
       269: ldc_w         #1323               // String %y%
       272: aload         9
       274: invokevirtual #1333               // Method ext/mods/gameserver/model/location/Location.getY:()I
       277: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       280: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       283: astore        10
       285: aload         10
       287: ldc_w         #1325               // String %z%
       290: aload         9
       292: invokevirtual #1336               // Method ext/mods/gameserver/model/location/Location.getZ:()I
       295: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       298: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       301: astore        10
       303: aload         6
       305: aload         10
       307: invokevirtual #910                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       310: pop
       311: goto          194
       314: goto          482
       317: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       320: aload_1
       321: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
       324: invokeinterface #798,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       329: invokeinterface #1339,  1         // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       334: astore        7
       336: aload         7
       338: invokeinterface #867,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       343: ifeq          482
       346: aload         7
       348: invokeinterface #872,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       353: checkcast     #1340               // class java/util/Map$Entry
       356: astore        8
       358: invokestatic  #878                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       361: aload_1
       362: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       365: ldc_w         #1312               // String html/mods/autofarm/parts/areaedit_table.htm
       368: invokevirtual #885                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
       371: astore        9
       373: aload         9
       375: ldc_w         #1314               // String %node%
       378: aload         8
       380: invokeinterface #1342,  1         // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       385: invokestatic  #1345               // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       388: invokevirtual #1318               // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       391: astore        9
       393: aload         9
       395: ldc_w         #1321               // String %x%
       398: aload         8
       400: invokeinterface #1347,  1         // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       405: checkcast     #1350               // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
       408: invokevirtual #1352               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getX:()I
       411: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       414: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       417: astore        9
       419: aload         9
       421: ldc_w         #1323               // String %y%
       424: aload         8
       426: invokeinterface #1347,  1         // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       431: checkcast     #1350               // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
       434: invokevirtual #1353               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getY:()I
       437: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       440: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       443: astore        9
       445: aload         9
       447: ldc_w         #1325               // String %z%
       450: aload         8
       452: invokeinterface #1347,  1         // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       457: checkcast     #1350               // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
       460: invokevirtual #1354               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getZ:()I
       463: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       466: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       469: astore        9
       471: aload         6
       473: aload         9
       475: invokevirtual #910                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       478: pop
       479: goto          336
       482: aload         5
       484: ldc_w         #930                // String %list%
       487: aload         6
       489: invokevirtual #932                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       492: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       495: aload_0
       496: aload_1
       497: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
       500: astore        6
       502: aload         5
       504: ldc_w         #1355               // String %checkbox%
       507: aload         6
       509: invokevirtual #583                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
       512: iload_2
       513: if_icmpne     522
       516: ldc_w         #995                // String checked
       519: goto          525
       522: ldc_w         #997                // String unchecked
       525: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       528: aload         5
       530: ldc_w         #907                // String %name%
       533: aload         4
       535: invokevirtual #1048               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
       538: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
       541: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       544: aload         5
       546: ldc_w         #900                // String %id%
       549: iload_2
       550: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       553: aload         5
       555: ldc_w         #571                // String %msg%
       558: aload_3
       559: ifnull        574
       562: aload_3
       563: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
       566: invokedynamic #576,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       571: goto          576
       574: ldc           #25                 // String
       576: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       579: aload         5
       581: ldc_w         #940                // String %type%
       584: aload         4
       586: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       589: invokevirtual #1045               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.name:()Ljava/lang/String;
       592: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       595: aload         5
       597: ldc_w         #1357               // String %lock%
       600: aload         6
       602: invokevirtual #1359               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isAddingLocationLocked:()Z
       605: ifeq          614
       608: ldc_w         #1362               // String locked
       611: goto          617
       614: ldc_w         #1364               // String lock
       617: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       620: aload         5
       622: ldc_w         #1366               // String %adding%
       625: aload         6
       627: invokevirtual #89                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isAddingLocation:()Z
       630: ifeq          639
       633: ldc_w         #1368               // String -
       636: goto          642
       639: ldc_w         #1370               // String +
       642: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       645: aload_1
       646: aload         5
       648: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       651: return
      LineNumberTable:
        line 1018: 0
        line 1019: 11
        line 1020: 16
        line 1022: 17
        line 1023: 27
        line 1025: 39
        line 1027: 75
        line 1028: 90
        line 1029: 103
        line 1030: 116
        line 1031: 129
        line 1032: 142
        line 1033: 152
        line 1036: 155
        line 1037: 164
        line 1039: 179
        line 1040: 182
        line 1042: 216
        line 1043: 219
        line 1044: 234
        line 1045: 249
        line 1046: 267
        line 1047: 285
        line 1048: 303
        line 1049: 311
        line 1050: 314
        line 1053: 317
        line 1055: 358
        line 1056: 373
        line 1057: 393
        line 1058: 419
        line 1059: 445
        line 1060: 471
        line 1061: 479
        line 1063: 482
        line 1066: 495
        line 1067: 502
        line 1068: 528
        line 1069: 544
        line 1070: 553
        line 1071: 579
        line 1072: 595
        line 1073: 620
        line 1074: 645
        line 1075: 651
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           90      62     6 table   Ljava/lang/String;
          234      77    10 table   Ljava/lang/String;
          216      95     9   loc   Lext/mods/gameserver/model/location/Location;
          182     132     7 indice   I
          373     106     9 table   Ljava/lang/String;
          358     121     8 entry   Ljava/util/Map$Entry;
          164     331     6    sb   Ljava/lang/StringBuilder;
            0     652     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     652     1 player   Lext/mods/gameserver/model/actor/Player;
            0     652     2 areaId   I
            0     652     3   msg   Ljava/lang/String;
           11     641     4  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
           27     625     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          502     150     6 profile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          358     121     8 entry   Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;
      StackMapTable: number_of_entries = 17
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea ]
        frame_type = 252 /* append */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 79
        frame_type = 254 /* append */
          offset_delta = 38
          locals = [ class java/lang/StringBuilder, int, class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 119
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 145
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public void showAreaListWindow(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmManager$AutoFarmType);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: aconst_null
         4: invokevirtual #601                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
         7: return
      LineNumberTable:
        line 1079: 0
        line 1080: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0       8     1 player   Lext/mods/gameserver/model/actor/Player;
            0       8     2  type   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;

  public void showAreaListWindow(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmManager$AutoFarmType, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=4
         0: new           #360                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore        4
        10: aload_0
        11: aload_1
        12: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        15: astore        5
        17: aload_2
        18: getstatic     #593                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        21: if_acmpne     82
        24: aload         4
        26: aload_1
        27: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        30: ldc_w         #1372               // String html/mods/autofarm/arealist_open.htm
        33: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        36: aload         4
        38: ldc_w         #542                // String %radius%
        41: iconst_0
        42: aload         5
        44: invokevirtual #522                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
        47: invokestatic  #1374               // Method java/lang/Math.max:(II)I
        50: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        53: aload         4
        55: ldc_w         #1355               // String %checkbox%
        58: aload         5
        60: invokevirtual #583                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
        63: iconst_1
        64: if_icmpne     73
        67: ldc_w         #995                // String checked
        70: goto          76
        73: ldc_w         #997                // String unchecked
        76: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        79: goto          332
        82: aload_0
        83: aload_1
        84: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        87: invokevirtual #1380               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
        90: invokeinterface #49,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        95: invokeinterface #944,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
       100: aload_2
       101: invokedynamic #1383,  0           // InvokeDynamic #27:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)Ljava/util/function/Predicate;
       106: invokeinterface #806,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       111: invokedynamic #1386,  0           // InvokeDynamic #28:apply:()Ljava/util/function/Function;
       116: invokestatic  #1387               // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
       119: invokeinterface #1393,  2         // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
       124: invokeinterface #1397,  1         // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
       129: astore        6
       131: aload         4
       133: aload_1
       134: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       137: aload_2
       138: getstatic     #506                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       141: if_acmpne     150
       144: ldc_w         #1400               // String arealist_zone.htm
       147: goto          153
       150: ldc_w         #1402               // String arealist_route.htm
       153: invokedynamic #1404,  0           // InvokeDynamic #29:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       158: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       161: aload         6
       163: invokeinterface #718,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       168: ifeq          185
       171: aload         4
       173: ldc_w         #930                // String %list%
       176: ldc_w         #1405               // String empty
       179: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       182: goto          332
       185: new           #843                // class java/lang/StringBuilder
       188: dup
       189: invokespecial #845                // Method java/lang/StringBuilder."<init>":()V
       192: astore        7
       194: aload         6
       196: invokeinterface #1327,  1         // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       201: astore        8
       203: aload         8
       205: invokeinterface #867,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       210: ifeq          319
       213: aload         8
       215: invokeinterface #872,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       220: checkcast     #101                // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
       223: astore        9
       225: invokestatic  #878                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       228: aload_1
       229: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       232: ldc_w         #1407               // String html/mods/autofarm/parts/arealist_table.htm
       235: invokevirtual #885                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
       238: astore        10
       240: aload         10
       242: ldc_w         #900                // String %id%
       245: aload         9
       247: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       250: invokestatic  #905                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       253: invokevirtual #1318               // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       256: astore        10
       258: aload         10
       260: ldc_w         #907                // String %name%
       263: aload         9
       265: invokevirtual #1048               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
       268: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
       271: invokevirtual #31                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       274: astore        10
       276: aload         10
       278: ldc_w         #1355               // String %checkbox%
       281: aload         5
       283: invokevirtual #583                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
       286: aload         9
       288: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       291: if_icmpne     300
       294: ldc_w         #995                // String checked
       297: goto          303
       300: ldc_w         #997                // String unchecked
       303: invokevirtual #1318               // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       306: astore        10
       308: aload         7
       310: aload         10
       312: invokevirtual #910                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       315: pop
       316: goto          203
       319: aload         4
       321: ldc_w         #930                // String %list%
       324: aload         7
       326: invokevirtual #932                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       329: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       332: aload         4
       334: ldc_w         #571                // String %msg%
       337: aload_3
       338: ifnull        353
       341: aload_3
       342: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
       345: invokedynamic #1410,  0           // InvokeDynamic #30:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       350: goto          355
       353: ldc           #25                 // String
       355: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       358: aload_1
       359: aload         4
       361: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       364: return
      LineNumberTable:
        line 1084: 0
        line 1085: 10
        line 1087: 17
        line 1089: 24
        line 1090: 36
        line 1091: 53
        line 1095: 82
        line 1096: 131
        line 1098: 161
        line 1100: 171
        line 1104: 185
        line 1105: 194
        line 1107: 225
        line 1108: 240
        line 1109: 258
        line 1110: 276
        line 1111: 308
        line 1112: 316
        line 1113: 319
        line 1117: 332
        line 1118: 358
        line 1119: 364
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          240      76    10 table   Ljava/lang/String;
          225      91     9  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
          194     138     7    sb   Ljava/lang/StringBuilder;
          131     201     6 areas   Ljava/util/List;
            0     365     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     365     1 player   Lext/mods/gameserver/model/actor/Player;
            0     365     2  type   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
            0     365     3   msg   Ljava/lang/String;
           10     355     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           17     348     5 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          131     201     6 areas   Ljava/util/List<Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;>;
      StackMapTable: number_of_entries = 13
        frame_type = 255 /* full_frame */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/util/List ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/util/List ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]
        frame_type = 31 /* same */
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 96
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/util/List, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/util/List, class java/lang/StringBuilder, class java/util/Iterator, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/lang/String ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 248 /* chop */
          offset_delta = 15
        frame_type = 249 /* chop */
          offset_delta = 12
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public void showTimerWindow(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=4
         0: new           #360                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore        4
        10: aload         4
        12: aload_1
        13: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        16: ldc_w         #1411               // String html/mods/autofarm/timer.htm
        19: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        22: aload         4
        24: ldc_w         #571                // String %msg%
        27: aload_3
        28: ifnull        43
        31: aload_3
        32: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
        35: invokedynamic #1410,  0           // InvokeDynamic #30:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        40: goto          45
        43: ldc           #25                 // String
        45: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        48: aload         4
        50: ldc_w         #1413               // String %current%
        53: aload_2
        54: invokevirtual #649                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
        57: lconst_0
        58: lcmp
        59: ifne          67
        62: ldc           #25                 // String
        64: goto          82
        67: getstatic     #1134               // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        70: aload_2
        71: invokevirtual #649                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
        74: invokevirtual #1140               // Method java/util/concurrent/TimeUnit.toMinutes:(J)J
        77: invokedynamic #1415,  0           // InvokeDynamic #31:makeConcatWithConstants:(J)Ljava/lang/String;
        82: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        85: aload_1
        86: aload         4
        88: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        91: return
      LineNumberTable:
        line 1123: 0
        line 1124: 10
        line 1125: 22
        line 1126: 48
        line 1127: 85
        line 1128: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      92     1 player   Lext/mods/gameserver/model/actor/Player;
            0      92     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      92     3   msg   Ljava/lang/String;
           10      82     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public void showConfirmChangeWindow(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: new           #360                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_3
         9: aload_3
        10: aload_1
        11: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        14: aload_2
        15: invokevirtual #596                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isFromDb:()Z
        18: ifeq          27
        21: ldc_w         #1416               // String confirm_change.htm
        24: goto          30
        27: ldc_w         #1418               // String confirm_save.htm
        30: invokedynamic #1404,  0           // InvokeDynamic #29:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        38: aload_3
        39: ldc_w         #940                // String %type%
        42: aload_2
        43: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        46: invokevirtual #1420               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.toString:()Ljava/lang/String;
        49: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        52: aload_3
        53: ldc_w         #907                // String %name%
        56: aload_2
        57: invokevirtual #1048               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
        60: invokestatic  #573                // Method escapeHtml:(Ljava/lang/String;)Ljava/lang/String;
        63: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        66: aload_3
        67: ldc_w         #900                // String %id%
        70: aload_2
        71: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
        74: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        77: aload_1
        78: aload_3
        79: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        82: return
      LineNumberTable:
        line 1132: 0
        line 1133: 9
        line 1134: 38
        line 1135: 52
        line 1136: 66
        line 1137: 77
        line 1138: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      83     1 player   Lext/mods/gameserver/model/actor/Player;
            0      83     2  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            9      74     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]

  public boolean canSeeArea(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_2
         1: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         4: getstatic     #593                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         7: if_acmpne     12
        10: iconst_1
        11: ireturn
        12: aload_2
        13: invokevirtual #1421               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
        16: ifnonnull     34
        19: aload_2
        20: invokevirtual #596                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isFromDb:()Z
        23: ifeq          34
        26: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        29: aload_1
        30: aload_2
        31: invokevirtual #1425               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.setAutoFarmAreaZone:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
        34: aload_2
        35: invokevirtual #714                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
        38: invokeinterface #1428,  1         // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        43: aload_1
        44: invokedynamic #1429,  0           // InvokeDynamic #32:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        49: invokeinterface #1432,  2         // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        54: ifeq          59
        57: iconst_1
        58: ireturn
        59: aload_2
        60: sipush        500
        63: invokevirtual #1436               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isOwnerNearOrInside:(I)Z
        66: ireturn
      LineNumberTable:
        line 1142: 0
        line 1143: 10
        line 1145: 12
        line 1146: 26
        line 1148: 34
        line 1149: 57
        line 1151: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      67     1 player   Lext/mods/gameserver/model/actor/Player;
            0      67     2  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
      StackMapTable: number_of_entries = 3
        frame_type = 12 /* same */
        frame_type = 21 /* same */
        frame_type = 24 /* same */

  public void startPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_1
         3: invokevirtual #1440               // Method startPlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
         6: return
      LineNumberTable:
        line 1156: 0
        line 1157: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0       7     1 player   Lext/mods/gameserver/model/actor/Player;

  public void startPlayer(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: aload_1
         1: invokevirtual #1443               // Method ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
         4: ifne          17
         7: aload_1
         8: invokevirtual #1446               // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        11: invokevirtual #1450               // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        14: ifeq          18
        17: return
        18: getstatic     #1455               // Field ext/mods/Config.AUTOFARM_DISABLE_TOWN:Z
        21: ifeq          43
        24: aload_1
        25: getstatic     #1458               // Field ext/mods/gameserver/enums/ZoneId.TOWN:Lext/mods/gameserver/enums/ZoneId;
        28: invokevirtual #1464               // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        31: ifeq          43
        34: aload_0
        35: aload_1
        36: ldc_w         #1468               // String It is not possible to start in the city
        39: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        42: return
        43: aload_0
        44: aload_1
        45: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        48: astore_3
        49: aload_3
        50: invokevirtual #1470               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.canUseAutoFarm:()Z
        53: ifne          65
        56: aload_0
        57: aload_1
        58: ldc_w         #1473               // String Esgotado, use itens de tempo para continuar.
        61: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        64: return
        65: aload_3
        66: invokevirtual #583                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
        69: ifne          96
        72: aload_0
        73: aload_1
        74: ldc_w         #1475               // String It is necessary to select an area.
        77: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        80: aload_0
        81: aload_1
        82: aload_3
        83: ldc_w         #1477               // String 1
        86: invokestatic  #330                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        89: invokevirtual #333                // Method java/lang/Integer.intValue:()I
        92: invokevirtual #336                // Method handleSelectAreaBypass:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
        95: return
        96: getstatic     #481                // Field ext/mods/Config.AUTOFARM_MAX_TIMER:I
        99: ifeq          120
       102: aload_3
       103: invokevirtual #649                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
       106: lconst_0
       107: lcmp
       108: ifne          120
       111: aload_0
       112: aload_1
       113: ldc_w         #1479               // String It is necessary to set a duration.
       116: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       119: return
       120: aload_1
       121: invokevirtual #1100               // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       124: invokevirtual #1481               // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       127: invokevirtual #1485               // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
       130: invokevirtual #1491               // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
       133: astore        4
       135: getstatic     #1496               // Field ext/mods/Config.AUTOFARM_ALLOW_DUALBOX:Z
       138: ifne          189
       141: aload_0
       142: getfield      #10                 // Field _players:Ljava/util/Map;
       145: invokeinterface #49,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       150: invokeinterface #944,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
       155: invokedynamic #1499,  0           // InvokeDynamic #33:test:()Ljava/util/function/Predicate;
       160: invokeinterface #806,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       165: aload         4
       167: invokedynamic #1500,  0           // InvokeDynamic #34:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
       172: invokeinterface #1432,  2         // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
       177: ifeq          189
       180: aload_0
       181: aload_1
       182: ldc_w         #1503               // String Dualboxing is not allowed
       185: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       188: return
       189: aload_0
       190: aload_1
       191: aload_3
       192: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       195: invokevirtual #604                // Method canSeeArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
       198: ifne          210
       201: aload_0
       202: aload_1
       203: ldc_w         #1505               // String Area too distant to be viewed
       206: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       209: return
       210: aload_3
       211: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       214: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       217: getstatic     #593                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       220: if_acmpne     249
       223: aload_3
       224: invokevirtual #622                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isOpenPreviewShown:()Z
       227: ifeq          242
       230: aload_0
       231: aload_1
       232: aload_3
       233: invokevirtual #522                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
       236: invokevirtual #625                // Method showOpenPreviewTemporary:(Lext/mods/gameserver/model/actor/Player;I)V
       239: goto          260
       242: aload_3
       243: invokevirtual #1507               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.markOpenPreviewShown:()V
       246: goto          260
       249: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       252: aload_3
       253: aload_3
       254: invokevirtual #583                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
       257: invokevirtual #629                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.previewFinalArea:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
       260: aload_3
       261: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       264: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       267: getstatic     #506                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       270: if_acmpne     305
       273: aload_1
       274: getstatic     #1510               // Field ext/mods/gameserver/enums/ZoneId.AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
       277: invokevirtual #1464               // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       280: ifne          305
       283: aload_3
       284: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       287: invokevirtual #610                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
       290: invokevirtual #1513               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.tryGoBackInside:()Z
       293: ifne          305
       296: aload_0
       297: aload_1
       298: ldc_w         #1516               // String Move to the inside of the zone.
       301: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       304: return
       305: aload_1
       306: invokevirtual #1518               // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
       309: ifnull        317
       312: aload_1
       313: aconst_null
       314: invokevirtual #1522               // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       317: getstatic     #1526               // Field ext/mods/Config.AUTOFARM_CHANGE_PLAYER_TITLE:Z
       320: ifeq          342
       323: aload_3
       324: aload_1
       325: invokevirtual #1529               // Method ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
       328: invokevirtual #1532               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setPlayerTitle:(Ljava/lang/String;)V
       331: aload_1
       332: ldc_w         #1535               // String Auto Farming
       335: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
       338: aload_1
       339: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
       342: getstatic     #164                // Field ext/mods/Config.AUTOFARM_CHANGE_PLAYER_NAME_COLOR:Z
       345: ifeq          386
       348: getstatic     #1537               // Field ext/mods/Config.AUTOFARM_PLAYER_NAME_COLOR:Ljava/lang/String;
       351: invokedynamic #1541,  0           // InvokeDynamic #35:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       356: invokestatic  #1542               // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       359: invokevirtual #333                // Method java/lang/Integer.intValue:()I
       362: istore        5
       364: aload_1
       365: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       368: iload         5
       370: invokevirtual #183                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
       373: aload_1
       374: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       377: iload         5
       379: invokevirtual #192                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
       382: aload_1
       383: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       386: aload_3
       387: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       390: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       393: getstatic     #106                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       396: if_acmpne     409
       399: aload_3
       400: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       403: invokevirtual #1545               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
       406: invokevirtual #1549               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.reset:()V
       409: aload_3
       410: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       413: ifnull        423
       416: aload_3
       417: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       420: invokevirtual #1554               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.startDeathMonitor:()V
       423: aload_3
       424: invokevirtual #1557               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.startTimeTracking:()V
       427: aload_3
       428: iconst_1
       429: invokevirtual #206                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setEnabled:(Z)V
       432: aload_3
       433: invokevirtual #1560               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.startRoutine:()V
       436: aload_0
       437: aload_1
       438: invokevirtual #1563               // Method startTimeDisplay:(Lext/mods/gameserver/model/actor/Player;)V
       441: iload_2
       442: ifeq          451
       445: aload_0
       446: aload_1
       447: aconst_null
       448: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       451: return
      LineNumberTable:
        line 1161: 0
        line 1162: 17
        line 1164: 18
        line 1166: 34
        line 1167: 42
        line 1170: 43
        line 1172: 49
        line 1174: 56
        line 1175: 64
        line 1178: 65
        line 1180: 72
        line 1181: 80
        line 1182: 95
        line 1185: 96
        line 1187: 111
        line 1188: 119
        line 1191: 120
        line 1192: 135
        line 1194: 180
        line 1195: 188
        line 1198: 189
        line 1200: 201
        line 1201: 209
        line 1204: 210
        line 1206: 223
        line 1207: 230
        line 1209: 242
        line 1213: 249
        line 1216: 260
        line 1218: 296
        line 1219: 304
        line 1222: 305
        line 1223: 312
        line 1225: 317
        line 1227: 323
        line 1228: 331
        line 1229: 338
        line 1232: 342
        line 1234: 348
        line 1235: 364
        line 1236: 373
        line 1237: 382
        line 1240: 386
        line 1242: 399
        line 1244: 409
        line 1245: 416
        line 1247: 423
        line 1249: 427
        line 1250: 432
        line 1252: 436
        line 1254: 441
        line 1255: 445
        line 1256: 451
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          364      22     5 color   I
            0     452     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     452     1 player   Lext/mods/gameserver/model/actor/Player;
            0     452     2 sendWindow   Z
           49     403     3 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
          135     317     4 playerIp   Ljava/lang/String;
      StackMapTable: number_of_entries = 18
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 30 /* same */
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 68
          locals = [ class java/lang/String ]
        frame_type = 20 /* same */
        frame_type = 31 /* same */
        frame_type = 6 /* same */
        frame_type = 10 /* same */
        frame_type = 44 /* same */
        frame_type = 11 /* same */
        frame_type = 24 /* same */
        frame_type = 43 /* same */
        frame_type = 22 /* same */
        frame_type = 13 /* same */
        frame_type = 27 /* same */

  public void stopPlayer(ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #1566               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         5: aload_2
         6: invokevirtual #382                // Method stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
         9: return
      LineNumberTable:
        line 1274: 0
        line 1275: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      10     1 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      10     2   msg   Ljava/lang/String;

  public void stopPlayer(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: iconst_1
         4: invokevirtual #247                // Method stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
         7: return
      LineNumberTable:
        line 1279: 0
        line 1280: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0       8     1 player   Lext/mods/gameserver/model/actor/Player;
            0       8     2   msg   Ljava/lang/String;

  public void stopPlayer(ext.mods.gameserver.model.actor.Player, java.lang.String, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: invokevirtual #85                 // Method getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         8: ifnonnull     12
        11: return
        12: aload_0
        13: aload_1
        14: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        17: astore        4
        19: aload_1
        20: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        23: ifne          32
        26: aload         4
        28: aconst_null
        29: invokevirtual #126                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.updatePlayer:(Lext/mods/gameserver/model/actor/Player;)V
        32: aload         4
        34: invokevirtual #137                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getDailyTimeUsed:()J
        37: lstore        5
        39: aload         4
        41: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        44: ifeq          170
        47: aload         4
        49: invokevirtual #141                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.stopTimeTracking:()V
        52: aload         4
        54: invokevirtual #144                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getCurrentSessionTime:()J
        57: aload         4
        59: invokevirtual #137                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getDailyTimeUsed:()J
        62: ladd
        63: lstore        5
        65: aload_0
        66: aload_1
        67: invokevirtual #147                // Method stopTimeDisplay:(Lext/mods/gameserver/model/actor/Player;)V
        70: aload_1
        71: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        74: ifeq          141
        77: aload         4
        79: invokevirtual #153                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayerTitle:()Ljava/lang/String;
        82: ifnull        98
        85: aload_1
        86: aload         4
        88: invokevirtual #153                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayerTitle:()Ljava/lang/String;
        91: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
        94: aload_1
        95: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
        98: getstatic     #164                // Field ext/mods/Config.AUTOFARM_CHANGE_PLAYER_NAME_COLOR:Z
       101: ifeq          136
       104: aload_1
       105: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       108: aload_1
       109: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
       112: invokevirtual #178                // Method ext/mods/gameserver/model/AccessLevel.getNameColor:()I
       115: invokevirtual #183                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
       118: aload_1
       119: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       122: aload_1
       123: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
       126: invokevirtual #189                // Method ext/mods/gameserver/model/AccessLevel.getTitleColor:()I
       129: invokevirtual #192                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
       132: aload_1
       133: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       136: aload_1
       137: iconst_0
       138: invokevirtual #1569               // Method ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
       141: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       144: aload_1
       145: invokevirtual #203                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
       148: aload         4
       150: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       153: ifnull        164
       156: aload         4
       158: invokevirtual #96                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       161: invokevirtual #1572               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.stopDeathMonitor:()V
       164: aload         4
       166: iconst_0
       167: invokevirtual #206                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setEnabled:(Z)V
       170: lload         5
       172: lconst_0
       173: lcmp
       174: ifle          189
       177: invokestatic  #112                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
       180: aload_1
       181: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       184: lload         5
       186: invokevirtual #210                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.updatePlayerTimeUsage:(IJ)V
       189: iload_3
       190: ifeq          206
       193: aload_1
       194: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       197: ifeq          206
       200: aload_0
       201: aload_1
       202: aload_2
       203: invokevirtual #263                // Method showIndexWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       206: goto          241
       209: astore        4
       211: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       214: ldc_w         #1575               // String Error stopping autofarm for player {}: {}
       217: aload         4
       219: iconst_2
       220: anewarray     #2                  // class java/lang/Object
       223: dup
       224: iconst_0
       225: aload_1
       226: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       229: aastore
       230: dup
       231: iconst_1
       232: aload         4
       234: invokevirtual #233                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       237: aastore
       238: invokevirtual #236                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       241: return
      Exception table:
         from    to  target type
             0    11   209   Class java/lang/Exception
            12   206   209   Class java/lang/Exception
      LineNumberTable:
        line 1286: 0
        line 1287: 11
        line 1289: 12
        line 1291: 19
        line 1292: 26
        line 1294: 32
        line 1296: 39
        line 1298: 47
        line 1299: 52
        line 1300: 65
        line 1302: 70
        line 1304: 77
        line 1306: 85
        line 1307: 94
        line 1310: 98
        line 1312: 104
        line 1313: 118
        line 1314: 132
        line 1317: 136
        line 1320: 141
        line 1321: 148
        line 1322: 156
        line 1323: 164
        line 1326: 170
        line 1328: 177
        line 1331: 189
        line 1332: 200
        line 1337: 206
        line 1334: 209
        line 1336: 211
        line 1338: 241
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19     187     4 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           39     167     5 totalTimeUsed   J
          211      30     4     e   Ljava/lang/Exception;
            0     242     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     242     1 player   Lext/mods/gameserver/model/actor/Player;
            0     242     2   msg   Ljava/lang/String;
            0     242     3 sendWindow   Z
      StackMapTable: number_of_entries = 11
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 252 /* append */
          offset_delta = 65
          locals = [ long ]
        frame_type = 37 /* same */
        frame_type = 4 /* same */
        frame_type = 22 /* same */
        frame_type = 5 /* same */
        frame_type = 18 /* same */
        frame_type = 249 /* chop */
          offset_delta = 16
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 31 /* same */

  public void createArea(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, java.util.StringTokenizer) throws java.lang.IllegalArgumentException, java.lang.NumberFormatException;
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Ljava/util/StringTokenizer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_3
         1: invokevirtual #277                // Method java/util/StringTokenizer.hasMoreTokens:()Z
         4: ifne          8
         7: return
         8: aload_3
         9: invokevirtual #280                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        12: invokestatic  #646                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        15: astore        4
        17: aload_3
        18: invokevirtual #277                // Method java/util/StringTokenizer.hasMoreTokens:()Z
        21: ifeq          34
        24: aload_3
        25: invokevirtual #280                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        28: invokevirtual #1245               // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        31: goto          36
        34: ldc           #25                 // String
        36: astore        5
        38: aload         5
        40: invokevirtual #840                // Method java/lang/String.isEmpty:()Z
        43: ifne          57
        46: aload         5
        48: ldc_w         #1598               // String ^[A-Za-z0-9]{1,12}$
        51: invokestatic  #1600               // Method ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
        54: ifne          68
        57: aload_0
        58: aload_1
        59: aload         4
        61: ldc_w         #1604               // String Invalid name.
        64: invokevirtual #601                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
        67: return
        68: aload_2
        69: invokevirtual #1380               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
        72: invokeinterface #49,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        77: invokeinterface #944,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        82: aload         5
        84: invokedynamic #1606,  0           // InvokeDynamic #38:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        89: invokeinterface #1432,  2         // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        94: ifeq          108
        97: aload_0
        98: aload_1
        99: aload         4
       101: ldc_w         #1607               // String Name already in use.
       104: invokevirtual #601                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
       107: return
       108: aload         4
       110: getstatic     #506                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       113: if_acmpne     218
       116: aload_1
       117: invokevirtual #1609               // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       120: ifne          171
       123: aload_2
       124: invokevirtual #1380               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
       127: invokeinterface #49,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       132: invokeinterface #944,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
       137: invokedynamic #1612,  0           // InvokeDynamic #39:test:()Ljava/util/function/Predicate;
       142: invokeinterface #806,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       147: invokeinterface #1613,  1         // InterfaceMethod java/util/stream/Stream.count:()J
       152: getstatic     #1616               // Field ext/mods/Config.AUTOFARM_MAX_ZONES:I
       155: i2l
       156: lcmp
       157: iflt          171
       160: aload_0
       161: aload_1
       162: aload         4
       164: ldc_w         #1619               // String Zone limit reached.
       167: invokevirtual #601                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
       170: return
       171: new           #615                // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
       174: dup
       175: aload         5
       177: aload_1
       178: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       181: invokespecial #1621               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone."<init>":(Ljava/lang/String;I)V
       184: astore        6
       186: aload_2
       187: invokevirtual #1380               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
       190: aload         6
       192: invokevirtual #1623               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getId:()I
       195: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       198: aload         6
       200: invokeinterface #411,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       205: pop
       206: aload_2
       207: aload         6
       209: invokevirtual #1623               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getId:()I
       212: invokevirtual #756                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setBuildingAreaId:(I)V
       215: goto          325
       218: aload         4
       220: getstatic     #106                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       223: if_acmpne     325
       226: aload_1
       227: invokevirtual #1609               // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       230: ifne          281
       233: aload_2
       234: invokevirtual #1380               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
       237: invokeinterface #49,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       242: invokeinterface #944,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
       247: invokedynamic #1624,  0           // InvokeDynamic #40:test:()Ljava/util/function/Predicate;
       252: invokeinterface #806,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       257: invokeinterface #1613,  1         // InterfaceMethod java/util/stream/Stream.count:()J
       262: getstatic     #1625               // Field ext/mods/Config.AUTOFARM_MAX_ROUTES:I
       265: i2l
       266: lcmp
       267: iflt          281
       270: aload_0
       271: aload_1
       272: aload         4
       274: ldc_w         #1628               // String Route limit reached.
       277: invokevirtual #601                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
       280: return
       281: new           #1550               // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
       284: dup
       285: aload         5
       287: aload_1
       288: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       291: invokespecial #1630               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute."<init>":(Ljava/lang/String;I)V
       294: astore        6
       296: aload_2
       297: invokevirtual #1380               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
       300: aload         6
       302: invokevirtual #1631               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getId:()I
       305: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       308: aload         6
       310: invokeinterface #411,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       315: pop
       316: aload_2
       317: aload         6
       319: invokevirtual #1631               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getId:()I
       322: invokevirtual #756                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setBuildingAreaId:(I)V
       325: aload_0
       326: aload_1
       327: aload         4
       329: invokevirtual #589                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
       332: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       335: aload_1
       336: invokevirtual #203                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
       339: return
      LineNumberTable:
        line 1424: 0
        line 1425: 7
        line 1427: 8
        line 1428: 17
        line 1430: 38
        line 1432: 57
        line 1433: 67
        line 1436: 68
        line 1438: 97
        line 1439: 107
        line 1442: 108
        line 1444: 116
        line 1446: 160
        line 1447: 170
        line 1450: 171
        line 1451: 186
        line 1452: 206
        line 1453: 215
        line 1454: 218
        line 1456: 226
        line 1458: 270
        line 1459: 280
        line 1462: 281
        line 1463: 296
        line 1464: 316
        line 1467: 325
        line 1468: 332
        line 1469: 339
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          186      29     6  zone   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
          296      29     6 route   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
            0     340     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     340     1 player   Lext/mods/gameserver/model/actor/Player;
            0     340     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0     340     3    st   Ljava/util/StringTokenizer;
           17     323     4  type   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
           38     302     5  name   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/String ]
        frame_type = 10 /* same */
        frame_type = 39 /* same */
        frame_type = 62 /* same */
        frame_type = 46 /* same */
        frame_type = 62 /* same */
        frame_type = 43 /* same */
    Exceptions:
      throws java.lang.IllegalArgumentException, java.lang.NumberFormatException

  public void newNodeMode(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_2
         1: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
         4: ifnonnull     8
         7: return
         8: aload_2
         9: invokevirtual #89                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isAddingLocation:()Z
        12: ifeq          55
        15: iload_3
        16: ifeq          26
        19: aload_2
        20: invokevirtual #1632               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleAddingLocationLock:()V
        23: goto          31
        26: aload_2
        27: iconst_0
        28: invokevirtual #291                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setAddingLocation:(Z)V
        31: aload_0
        32: aload_1
        33: aload_2
        34: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
        37: aload_2
        38: invokevirtual #89                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isAddingLocation:()Z
        41: ifeq          50
        44: ldc_w         #1635               // String Indicate the location with the mouse.
        47: goto          51
        50: aconst_null
        51: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
        54: return
        55: aload_2
        56: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        59: invokevirtual #1421               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
        62: ifnull        90
        65: aload_0
        66: aload_1
        67: aload_2
        68: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        71: invokevirtual #604                // Method canSeeArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
        74: ifne          90
        77: aload_0
        78: aload_1
        79: aload_2
        80: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
        83: ldc_w         #1637               // String Area too distant to be viewed.
        86: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
        89: return
        90: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        93: aload_1
        94: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
        97: invokeinterface #711,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
       102: ifeq          136
       105: aload_2
       106: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       109: invokevirtual #639                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isChanged:()Z
       112: ifne          136
       115: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       118: aload_1
       119: aload_2
       120: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       123: invokevirtual #714                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
       126: invokevirtual #1639               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.restoreDebugPoints:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
       129: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       132: aload_1
       133: invokevirtual #1643               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.preview:(Lext/mods/gameserver/model/actor/Player;)V
       136: aload_2
       137: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       140: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       143: getstatic     #506                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       146: if_acmpne     185
       149: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       152: aload_1
       153: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
       156: invokeinterface #781,  1          // InterfaceMethod java/util/Map.size:()I
       161: getstatic     #1645               // Field ext/mods/Config.AUTOFARM_MAX_ZONE_NODES:I
       164: bipush        20
       166: invokestatic  #1648               // Method java/lang/Math.min:(II)I
       169: if_icmplt     185
       172: aload_0
       173: aload_1
       174: aload_2
       175: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
       178: ldc_w         #1651               // String Your zone has reached the maximum number of points.
       181: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       184: return
       185: aload_2
       186: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       189: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       192: getstatic     #106                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       195: if_acmpne     234
       198: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       201: aload_1
       202: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
       205: invokeinterface #781,  1          // InterfaceMethod java/util/Map.size:()I
       210: getstatic     #1653               // Field ext/mods/Config.AUTOFARM_MAX_ROUTE_NODES:I
       213: bipush        20
       215: invokestatic  #1648               // Method java/lang/Math.min:(II)I
       218: if_icmplt     234
       221: aload_0
       222: aload_1
       223: aload_2
       224: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
       227: ldc_w         #1656               // String Your route has reached the maximum number of points.
       230: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       233: return
       234: iload_3
       235: ifeq          245
       238: aload_2
       239: invokevirtual #1632               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleAddingLocationLock:()V
       242: goto          250
       245: aload_2
       246: iconst_1
       247: invokevirtual #291                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setAddingLocation:(Z)V
       250: aload_0
       251: aload_1
       252: aload_2
       253: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
       256: ldc_w         #1635               // String Indicate the location with the mouse.
       259: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       262: return
      LineNumberTable:
        line 1473: 0
        line 1474: 7
        line 1476: 8
        line 1478: 15
        line 1479: 19
        line 1481: 26
        line 1483: 31
        line 1484: 54
        line 1487: 55
        line 1489: 77
        line 1490: 89
        line 1493: 90
        line 1495: 115
        line 1496: 129
        line 1499: 136
        line 1501: 172
        line 1502: 184
        line 1504: 185
        line 1506: 221
        line 1507: 233
        line 1510: 234
        line 1511: 238
        line 1513: 245
        line 1515: 250
        line 1516: 262
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     263     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     263     1 player   Lext/mods/gameserver/model/actor/Player;
            0     263     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0     263     3  lock   Z
      StackMapTable: number_of_entries = 12
        frame_type = 8 /* same */
        frame_type = 17 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String ]
        frame_type = 3 /* same */
        frame_type = 34 /* same */
        frame_type = 45 /* same */
        frame_type = 48 /* same */
        frame_type = 48 /* same */
        frame_type = 10 /* same */
        frame_type = 4 /* same */

  public void addAreaNode(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=13, locals=8, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         5: astore_3
         6: aload_3
         7: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        10: astore        4
        12: aload         4
        14: ifnonnull     18
        17: return
        18: aconst_null
        19: astore        5
        21: getstatic     #1455               // Field ext/mods/Config.AUTOFARM_DISABLE_TOWN:Z
        24: ifeq          59
        27: invokestatic  #1658               // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        30: aload_2
        31: invokevirtual #1330               // Method ext/mods/gameserver/model/location/Location.getX:()I
        34: aload_2
        35: invokevirtual #1333               // Method ext/mods/gameserver/model/location/Location.getY:()I
        38: aload_2
        39: invokevirtual #1336               // Method ext/mods/gameserver/model/location/Location.getZ:()I
        42: ldc_w         #1663               // class ext/mods/gameserver/model/zone/type/TownZone
        45: invokevirtual #1665               // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        48: ifnull        59
        51: ldc_w         #1668               // String Invalid location.
        54: astore        5
        56: goto          249
        59: aload         4
        61: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        64: getstatic     #506                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        67: if_acmpne     99
        70: getstatic     #1670               // Field ext/mods/Config.AUTOFARM_MAX_ZONE_AREA:I
        73: ifeq          99
        76: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        79: aload_1
        80: invokevirtual #1673               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.calculateArea:(Lext/mods/gameserver/model/actor/Player;)D
        83: getstatic     #1670               // Field ext/mods/Config.AUTOFARM_MAX_ZONE_AREA:I
        86: i2d
        87: dcmpl
        88: ifle          99
        91: ldc_w         #1677               // String Your zone has reached the maximum size.
        94: astore        5
        96: goto          249
        99: aload         4
       101: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       104: getstatic     #106                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       107: if_acmpne     139
       110: getstatic     #1679               // Field ext/mods/Config.AUTOFARM_MAX_ROUTE_PERIMITER:I
       113: ifeq          139
       116: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       119: aload_1
       120: invokevirtual #1682               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.calculatePerimeter:(Lext/mods/gameserver/model/actor/Player;)D
       123: getstatic     #1679               // Field ext/mods/Config.AUTOFARM_MAX_ROUTE_PERIMITER:I
       126: i2d
       127: dcmpl
       128: ifle          139
       131: ldc_w         #1685               // String Your route has reached the maximum length.
       134: astore        5
       136: goto          249
       139: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       142: aload_1
       143: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
       146: astore        6
       148: aload         6
       150: invokeinterface #781,  1          // InterfaceMethod java/util/Map.size:()I
       155: ifle          249
       158: aload         6
       160: aload         6
       162: invokeinterface #781,  1          // InterfaceMethod java/util/Map.size:()I
       167: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       170: invokeinterface #61,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       175: checkcast     #1350               // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
       178: astore        7
       180: invokestatic  #1687               // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       183: aload         7
       185: invokevirtual #1352               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getX:()I
       188: aload         7
       190: invokevirtual #1353               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getY:()I
       193: aload         7
       195: invokevirtual #1354               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getZ:()I
       198: bipush        20
       200: iadd
       201: dconst_0
       202: aload_2
       203: invokevirtual #1330               // Method ext/mods/gameserver/model/location/Location.getX:()I
       206: aload_2
       207: invokevirtual #1333               // Method ext/mods/gameserver/model/location/Location.getY:()I
       210: aload_2
       211: invokevirtual #1336               // Method ext/mods/gameserver/model/location/Location.getZ:()I
       214: dconst_0
       215: aconst_null
       216: aconst_null
       217: invokevirtual #1692               // Method ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       220: ifne          231
       223: ldc_w         #1696               // String Geographically unavailable point.
       226: astore        5
       228: goto          249
       231: aload         7
       233: aload_2
       234: invokevirtual #1698               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.distance3D:(Lext/mods/gameserver/model/location/Location;)D
       237: ldc2_w        #1702               // double 1500.0d
       240: dcmpl
       241: ifle          249
       244: ldc_w         #1704               // String Point too distant.
       247: astore        5
       249: aload         5
       251: ifnonnull     268
       254: aload         4
       256: iconst_1
       257: invokevirtual #734                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setIsChanged:(Z)V
       260: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       263: aload_1
       264: aload_2
       265: invokevirtual #1706               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.addPoint:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
       268: aload_3
       269: invokevirtual #1359               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isAddingLocationLocked:()Z
       272: ifne          280
       275: aload_3
       276: iconst_0
       277: invokevirtual #291                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setAddingLocation:(Z)V
       280: aload_0
       281: aload_1
       282: aload         4
       284: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       287: aload         5
       289: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       292: return
      LineNumberTable:
        line 1520: 0
        line 1521: 6
        line 1522: 12
        line 1523: 17
        line 1525: 18
        line 1526: 21
        line 1527: 51
        line 1528: 59
        line 1529: 91
        line 1530: 99
        line 1531: 131
        line 1534: 139
        line 1535: 148
        line 1537: 158
        line 1538: 180
        line 1539: 223
        line 1540: 231
        line 1541: 244
        line 1545: 249
        line 1547: 254
        line 1548: 260
        line 1551: 268
        line 1552: 275
        line 1554: 280
        line 1555: 292
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          180      69     7 lastPoint   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;
          148     101     6 points   Ljava/util/Map;
            0     293     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     293     1 player   Lext/mods/gameserver/model/actor/Player;
            0     293     2   loc   Lext/mods/gameserver/model/location/Location;
            6     287     3 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           12     281     4  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
           21     272     5   msg   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          148     101     6 points   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class java/lang/String ]
        frame_type = 39 /* same */
        frame_type = 39 /* same */
        frame_type = 253 /* append */
          offset_delta = 91
          locals = [ class java/util/Map, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point ]
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 18 /* same */
        frame_type = 11 /* same */

  public void removeAreaNode(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=4
         0: aload_2
         1: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
         4: ifnull        11
         7: iload_3
         8: ifge          12
        11: return
        12: aload_2
        13: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        16: invokevirtual #1421               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
        19: ifnull        47
        22: aload_0
        23: aload_1
        24: aload_2
        25: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        28: invokevirtual #604                // Method canSeeArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
        31: ifne          47
        34: aload_0
        35: aload_1
        36: aload_2
        37: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
        40: ldc_w         #1637               // String Area too distant to be viewed.
        43: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
        46: return
        47: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        50: aload_1
        51: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
        54: astore        4
        56: aload         4
        58: invokeinterface #711,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        63: ifeq          80
        66: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        69: aload_1
        70: aload_2
        71: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        74: invokevirtual #714                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
        77: invokevirtual #1639               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.restoreDebugPoints:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
        80: aload         4
        82: invokeinterface #711,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        87: ifne          101
        90: aload         4
        92: invokeinterface #781,  1          // InterfaceMethod java/util/Map.size:()I
        97: iload_3
        98: if_icmpge     102
       101: return
       102: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       105: aload_1
       106: iload_3
       107: invokevirtual #1710               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.removePoint:(Lext/mods/gameserver/model/actor/Player;I)V
       110: aload         4
       112: invokeinterface #49,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       117: aload_2
       118: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       121: invokevirtual #714                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
       124: invokestatic  #1713               // Method ext/mods/gameserver/model/entity/autofarm/Util.isNodeListEquals:(Ljava/util/Collection;Ljava/util/List;)Z
       127: ifeq          141
       130: aload_2
       131: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       134: iconst_0
       135: invokevirtual #734                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setIsChanged:(Z)V
       138: goto          149
       141: aload_2
       142: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       145: iconst_1
       146: invokevirtual #734                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setIsChanged:(Z)V
       149: aload_0
       150: aload_1
       151: aload_2
       152: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
       155: aconst_null
       156: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       159: return
      LineNumberTable:
        line 1559: 0
        line 1560: 11
        line 1562: 12
        line 1564: 34
        line 1565: 46
        line 1568: 47
        line 1570: 56
        line 1571: 66
        line 1573: 80
        line 1574: 101
        line 1576: 102
        line 1578: 110
        line 1579: 130
        line 1581: 141
        line 1583: 149
        line 1584: 159
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     160     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     160     1 player   Lext/mods/gameserver/model/actor/Player;
            0     160     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0     160     3 nodeId   I
           56     104     4 points   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           56     104     4 points   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;
      StackMapTable: number_of_entries = 8
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 34 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/util/Map ]
        frame_type = 20 /* same */
        frame_type = 0 /* same */
        frame_type = 38 /* same */
        frame_type = 7 /* same */

  public void deleteArea(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: aload_2
         1: iload_3
         2: invokevirtual #577                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
         5: astore        4
         7: aload         4
         9: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        12: getstatic     #593                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        15: if_acmpne     19
        18: return
        19: aload         4
        21: invokevirtual #596                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isFromDb:()Z
        24: ifeq          38
        27: invokestatic  #112                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
        30: aload_1
        31: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        34: iload_3
        35: invokevirtual #1717               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.deleteArea:(II)V
        38: aload         4
        40: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        43: getstatic     #506                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        46: if_acmpne     57
        49: aload         4
        51: invokevirtual #610                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
        54: invokevirtual #1720               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.removeFromWorld:()V
        57: iconst_0
        58: istore        5
        60: aload_2
        61: invokevirtual #583                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
        64: iload_3
        65: if_icmpne     76
        68: iconst_1
        69: istore        5
        71: aload_2
        72: iconst_0
        73: invokevirtual #586                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setSelectedAreaId:(I)V
        76: aload_2
        77: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
        80: iload_3
        81: if_icmpne     92
        84: iconst_1
        85: istore        5
        87: aload_2
        88: iconst_0
        89: invokevirtual #756                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setBuildingAreaId:(I)V
        92: iload         5
        94: ifeq          104
        97: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       100: aload_1
       101: invokevirtual #203                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
       104: aload_2
       105: invokevirtual #1380               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
       108: iload_3
       109: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       112: invokeinterface #820,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       117: pop
       118: aload_2
       119: invokevirtual #830                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getTargets:()Ljava/util/Set;
       122: invokeinterface #833,  1          // InterfaceMethod java/util/Set.clear:()V
       127: aload_0
       128: aload_1
       129: aload         4
       131: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       134: invokevirtual #589                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
       137: return
      LineNumberTable:
        line 1588: 0
        line 1589: 7
        line 1590: 18
        line 1592: 19
        line 1593: 27
        line 1595: 38
        line 1596: 49
        line 1598: 57
        line 1599: 60
        line 1601: 68
        line 1602: 71
        line 1605: 76
        line 1607: 84
        line 1608: 87
        line 1611: 92
        line 1612: 97
        line 1614: 104
        line 1615: 118
        line 1616: 127
        line 1617: 137
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     138     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     138     1 player   Lext/mods/gameserver/model/actor/Player;
            0     138     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0     138     3 areaId   I
            7     131     4  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
           60      78     5 clearPreview   Z
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea ]
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 11 /* same */

  public void saveArea(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_2
         1: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
         4: astore_3
         5: aload_3
         6: ifnonnull     10
         9: return
        10: aload_3
        11: invokevirtual #639                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isChanged:()Z
        14: ifne          28
        17: aload_0
        18: aload_1
        19: aload_3
        20: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
        23: aconst_null
        24: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
        27: return
        28: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        31: aload_1
        32: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
        35: invokeinterface #711,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        40: ifeq          56
        43: aload_0
        44: aload_1
        45: aload_3
        46: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
        49: ldc_w         #1723               // String Build your zone before saving.
        52: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
        55: return
        56: aload_3
        57: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        60: getstatic     #106                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        63: if_acmpne     95
        66: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        69: aload_1
        70: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
        73: invokeinterface #781,  1          // InterfaceMethod java/util/Map.size:()I
        78: iconst_2
        79: if_icmpge     124
        82: aload_0
        83: aload_1
        84: aload_3
        85: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
        88: ldc_w         #1725               // String A route needs at least 2 points.
        91: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
        94: return
        95: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        98: aload_1
        99: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
       102: invokeinterface #781,  1          // InterfaceMethod java/util/Map.size:()I
       107: iconst_3
       108: if_icmpge     124
       111: aload_0
       112: aload_1
       113: aload_3
       114: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       117: ldc_w         #1727               // String A zone needs at least 3 points.
       120: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       123: return
       124: aload_3
       125: invokevirtual #714                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
       128: invokeinterface #1729,  1         // InterfaceMethod java/util/List.clear:()V
       133: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       136: aload_1
       137: aload_3
       138: invokevirtual #1425               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.setAutoFarmAreaZone:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
       141: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       144: aload_2
       145: aload_3
       146: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       149: invokevirtual #629                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.previewFinalArea:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
       152: aload_2
       153: aload_3
       154: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       157: invokevirtual #586                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setSelectedAreaId:(I)V
       160: aload_3
       161: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       164: getstatic     #506                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       167: if_acmpne     184
       170: aload_3
       171: invokevirtual #610                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
       174: invokevirtual #1720               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.removeFromWorld:()V
       177: aload_3
       178: invokevirtual #610                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
       181: invokevirtual #619                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.addToWorld:()V
       184: aload_3
       185: invokevirtual #596                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isFromDb:()Z
       188: ifne          205
       191: invokestatic  #112                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
       194: aload_1
       195: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       198: aload_2
       199: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       202: invokevirtual #1730               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.insertArea:(ILext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
       205: aload_3
       206: iconst_0
       207: invokevirtual #734                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setIsChanged:(Z)V
       210: invokestatic  #112                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
       213: aload_2
       214: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       217: invokevirtual #1734               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.insertNodes:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
       220: aload_0
       221: aload_1
       222: aload_3
       223: invokevirtual #1409               // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       226: ldc_w         #1738               // String Saved!
       229: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       232: return
      LineNumberTable:
        line 1621: 0
        line 1622: 5
        line 1623: 9
        line 1625: 10
        line 1627: 17
        line 1628: 27
        line 1631: 28
        line 1633: 43
        line 1634: 55
        line 1637: 56
        line 1639: 66
        line 1641: 82
        line 1642: 94
        line 1647: 95
        line 1649: 111
        line 1650: 123
        line 1654: 124
        line 1655: 133
        line 1656: 141
        line 1657: 152
        line 1659: 160
        line 1661: 170
        line 1662: 177
        line 1665: 184
        line 1666: 191
        line 1668: 205
        line 1669: 210
        line 1670: 220
        line 1671: 232
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     233     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     233     1 player   Lext/mods/gameserver/model/actor/Player;
            0     233     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            5     228     3  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea ]
        frame_type = 17 /* same */
        frame_type = 27 /* same */
        frame_type = 38 /* same */
        frame_type = 28 /* same */
        frame_type = 59 /* same */
        frame_type = 20 /* same */

  public void toggleFarmStatus(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         5: astore_2
         6: aload_2
         7: invokevirtual #93                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        10: ifeq          23
        13: aload_0
        14: aload_1
        15: aconst_null
        16: iconst_0
        17: invokevirtual #247                // Method stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
        20: goto          29
        23: aload_0
        24: aload_1
        25: iconst_0
        26: invokevirtual #1440               // Method startPlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
        29: return
      LineNumberTable:
        line 1675: 0
        line 1676: 6
        line 1678: 13
        line 1682: 23
        line 1684: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0      30     1 player   Lext/mods/gameserver/model/actor/Player;
            6      24     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 5 /* same */

  public void previewArea(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=5
         0: aload_2
         1: iload_3
         2: invokevirtual #577                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
         5: astore        5
         7: aload         5
         9: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        12: getstatic     #593                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        15: if_acmpeq     26
        18: aload         5
        20: invokevirtual #639                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isChanged:()Z
        23: ifne          34
        26: aload         5
        28: invokevirtual #596                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isFromDb:()Z
        31: ifne          35
        34: return
        35: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        38: aload_1
        39: invokevirtual #707                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
        42: invokeinterface #711,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        47: ifne          66
        50: aload_2
        51: invokevirtual #633                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingAreaId:()I
        54: iload_3
        55: if_icmpne     66
        58: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
        61: aload_1
        62: invokevirtual #203                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
        65: return
        66: aload_0
        67: aload_1
        68: aload         5
        70: invokevirtual #604                // Method canSeeArea:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
        73: ifne          107
        76: iload         4
        78: ifeq          97
        81: aload_0
        82: aload_1
        83: aload         5
        85: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        88: ldc_w         #1637               // String Area too distant to be viewed.
        91: invokevirtual #601                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Ljava/lang/String;)V
        94: goto          106
        97: aload_0
        98: aload_1
        99: iload_3
       100: ldc_w         #1637               // String Area too distant to be viewed.
       103: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       106: return
       107: iload         4
       109: ifeq          133
       112: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       115: aload_2
       116: iload_3
       117: invokevirtual #629                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.previewFinalArea:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
       120: aload_0
       121: aload_1
       122: aload         5
       124: invokevirtual #100                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       127: invokevirtual #589                // Method showAreaListWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
       130: goto          161
       133: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       136: aload_1
       137: aload_2
       138: invokevirtual #636                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuildingArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       141: invokevirtual #714                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
       144: invokevirtual #1639               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.restoreDebugPoints:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
       147: invokestatic  #198                // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getInstance:()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
       150: aload_1
       151: invokevirtual #1643               // Method ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.preview:(Lext/mods/gameserver/model/actor/Player;)V
       154: aload_0
       155: aload_1
       156: iload_3
       157: aconst_null
       158: invokevirtual #737                // Method showEditAreaWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       161: aload_2
       162: iload_3
       163: invokevirtual #756                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.setBuildingAreaId:(I)V
       166: return
      LineNumberTable:
        line 1688: 0
        line 1689: 7
        line 1690: 34
        line 1692: 35
        line 1694: 58
        line 1695: 65
        line 1698: 66
        line 1700: 76
        line 1701: 81
        line 1703: 97
        line 1705: 106
        line 1708: 107
        line 1710: 112
        line 1711: 120
        line 1715: 133
        line 1716: 147
        line 1717: 154
        line 1720: 161
        line 1721: 166
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     167     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     167     1 player   Lext/mods/gameserver/model/actor/Player;
            0     167     2 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0     167     3 areaId   I
            0     167     4 finalView   Z
            7     160     5  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea ]
        frame_type = 7 /* same */
        frame_type = 0 /* same */
        frame_type = 30 /* same */
        frame_type = 30 /* same */
        frame_type = 8 /* same */
        frame_type = 0 /* same */
        frame_type = 25 /* same */
        frame_type = 27 /* same */

  public void showTimeStatusWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #122                // Method getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         5: astore_2
         6: new           #360                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         9: dup
        10: iconst_0
        11: invokespecial #362                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        14: astore_3
        15: aload_3
        16: aload_1
        17: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        20: ldc_w         #1740               // String html/mods/autofarm/time_status.htm
        23: invokevirtual #372                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        26: aload_2
        27: invokevirtual #1188               // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getRemainingTime:()J
        30: lstore        4
        32: aload_2
        33: invokevirtual #137                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getDailyTimeUsed:()J
        36: lstore        6
        38: aload_1
        39: invokevirtual #1185               // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        42: ifle          49
        45: iconst_1
        46: goto          50
        49: iconst_0
        50: istore        8
        52: aload_3
        53: ldc_w         #1132               // String %remaining_time%
        56: aload_0
        57: lload         4
        59: invokevirtual #1742               // Method formatTime:(J)Ljava/lang/String;
        62: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        65: aload_3
        66: ldc_w         #1745               // String %used_time%
        69: aload_0
        70: lload         6
        72: invokevirtual #1742               // Method formatTime:(J)Ljava/lang/String;
        75: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        78: aload_3
        79: ldc_w         #1747               // String %daily_limit%
        82: aload_0
        83: iload         8
        85: ifeq          94
        88: ldc2_w        #1297               // long 9223372036854775807l
        91: goto          97
        94: ldc2_w        #1749               // long 7200000l
        97: invokevirtual #1742               // Method formatTime:(J)Ljava/lang/String;
       100: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       103: aload_3
       104: ldc_w         #1751               // String %premium_status%
       107: iload         8
       109: ifeq          118
       112: ldc_w         #1204               // String Premium (Sem Limite)
       115: goto          121
       118: ldc_w         #1207               // String Normal (2h/dia)
       121: invokevirtual #569                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       124: aload_1
       125: aload_3
       126: invokevirtual #376                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       129: return
      LineNumberTable:
        line 1725: 0
        line 1726: 6
        line 1727: 15
        line 1729: 26
        line 1730: 32
        line 1731: 38
        line 1733: 52
        line 1734: 65
        line 1735: 78
        line 1736: 103
        line 1738: 124
        line 1739: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     130     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
            0     130     1 player   Lext/mods/gameserver/model/actor/Player;
            6     124     2 profile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           15     115     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           32      98     4 remainingTime   J
           38      92     6 usedTime   J
           52      78     8 isPremium   Z
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, long, long ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, long, long, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, long, long, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, long, long, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, long, long, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public static final ext.mods.gameserver.model.entity.autofarm.AutoFarmManager getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #1753               // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
         3: areturn
      LineNumberTable:
        line 1754: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #237                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
         6: invokevirtual #1790               // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #1793               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 63: 0
}
SourceFile: "AutoFarmManager.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$SingletonHolder
  ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
  ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
BootstrapMethods:
  0: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1965 (Ljava/lang/Object;)Ljava/lang/Object;
      #1966 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$getProfile$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      #1969 (Ljava/lang/Integer;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  1: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1971 html/mods/autofarm/help/\u0001
  2: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1973 Choose a value between 1 and \u0001
  3: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1965 (Ljava/lang/Object;)Ljava/lang/Object;
      #1975 REF_invokeStatic java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      #1976 (Ljava/lang/Integer;)Ljava/lang/String;
  4: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1978 \u0001<br>
  5: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1980 ()V
      #1981 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$handleZoneBuilderBypass$0:(Lext/mods/gameserver/model/actor/Player;)V
      #1980 ()V
  6: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #1985 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$handleSkillsBypass$0:(ILjava/util/Map$Entry;)Z
      #1988 (Ljava/util/Map$Entry;)Z
  7: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1965 (Ljava/lang/Object;)Ljava/lang/Object;
      #1990 REF_invokeInterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
      #1991 (Ljava/util/Map$Entry;)Ljava/lang/Integer;
  8: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #1993 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showMacroItemWindow$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #1996 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  9: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #1997 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showMacroSkillWindow$0:(Lext/mods/gameserver/skills/L2Skill;)Z
      #2000 (Lext/mods/gameserver/skills/L2Skill;)Z
  10: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2001 (\u0001)
  11: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2003 %\u0001%
  12: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #2005 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showSkillsWindow$0:(Lext/mods/gameserver/skills/L2Skill;)Z
      #2000 (Lext/mods/gameserver/skills/L2Skill;)Z
  13: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2008  - \u0001
  14: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2010 Selecionadas: \u0001
  15: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2012 %1_negative_height%\u0001
  16: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2014 %skill_icon%\u0001
  17: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2016 %skill_width%\u0001
  18: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2018 %skill_height%\u0001
  19: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2020 %2_negative_height%\u0001
  20: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2022 %bg_icon%\u0001
  21: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2024 %bg_width%\u0001
  22: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2026 %bg_height%\u0001
  23: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2028 \u0001 min
  24: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2030 Normal (2h + \u0001 extra)
  25: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2032 \u0001 \u0001
  26: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2034 \u0001 m
  27: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #2036 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$showAreaListWindow$0:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
      #2039 (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  28: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1965 (Ljava/lang/Object;)Ljava/lang/Object;
      #2040 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
      #2041 (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/String;
  29: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2043 html/mods/autofarm/\u0001
  30: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2045 <font color=FFA000>\u0001</font><br>
  31: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2047 \u0001 minute(s)<br>
  32: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #2049 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$canSeeArea$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
      #2052 (Lext/mods/gameserver/model/location/Location;)Z
  33: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #2054 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
      #2055 (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
  34: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #2057 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startPlayer$0:(Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
      #2055 (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Z
  35: #2084 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2060 0x\u0001
  36: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1980 ()V
      #2062 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startRealTimeRefresh$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
      #1980 ()V
  37: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1980 ()V
      #2065 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$startTimeDisplay$0:(Lext/mods/gameserver/model/actor/Player;)V
      #1980 ()V
  38: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #2068 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$0:(Ljava/lang/String;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
      #2039 (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  39: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #2071 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$1:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
      #2039 (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
  40: #2077 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1984 (Ljava/lang/Object;)Z
      #2074 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.lambda$createArea$2:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
      #2039 (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
InnerClasses:
  public static final #2091= #107 of #11; // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #2092= #658 of #11; // AutoFarmMacro=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static #2093= #1340 of #50;      // Entry=class java/util/Map$Entry of class java/util/Map
  public static #2096= #1350 of #2094;    // Point=class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point of class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  public static final #2102= #2098 of #2100; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
