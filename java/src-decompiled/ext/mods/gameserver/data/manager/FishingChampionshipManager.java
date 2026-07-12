// Bytecode for: ext.mods.gameserver.data.manager.FishingChampionshipManager
// File: ext\mods\gameserver\data\manager\FishingChampionshipManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/FishingChampionshipManager.class
  Last modified 9 de jul de 2026; size 14117 bytes
  MD5 checksum 387f94a6aa804a32bc0ea06e27e14e20
  Compiled from "FishingChampionshipManager.java"
public class ext.mods.gameserver.data.manager.FishingChampionshipManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/FishingChampionshipManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 13, methods: 21, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/FishingChampionshipManager._playersName:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/FishingChampionshipManager
   #12 = NameAndType        #14:#15       // _playersName:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager
   #14 = Utf8               _playersName
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/manager/FishingChampionshipManager._fishLength:Ljava/util/List;
   #17 = NameAndType        #18:#15       // _fishLength:Ljava/util/List;
   #18 = Utf8               _fishLength
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/manager/FishingChampionshipManager._winPlayersName:Ljava/util/List;
   #20 = NameAndType        #21:#15       // _winPlayersName:Ljava/util/List;
   #21 = Utf8               _winPlayersName
   #22 = Fieldref           #11.#23       // ext/mods/gameserver/data/manager/FishingChampionshipManager._winFishLength:Ljava/util/List;
   #23 = NameAndType        #24:#15       // _winFishLength:Ljava/util/List;
   #24 = Utf8               _winFishLength
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/manager/FishingChampionshipManager._tmpPlayers:Ljava/util/List;
   #26 = NameAndType        #27:#15       // _tmpPlayers:Ljava/util/List;
   #27 = Utf8               _tmpPlayers
   #28 = Fieldref           #11.#29       // ext/mods/gameserver/data/manager/FishingChampionshipManager._winPlayers:Ljava/util/List;
   #29 = NameAndType        #30:#15       // _winPlayers:Ljava/util/List;
   #30 = Utf8               _winPlayers
   #31 = Fieldref           #11.#32       // ext/mods/gameserver/data/manager/FishingChampionshipManager._endDate:J
   #32 = NameAndType        #33:#34       // _endDate:J
   #33 = Utf8               _endDate
   #34 = Utf8               J
   #35 = Fieldref           #11.#36       // ext/mods/gameserver/data/manager/FishingChampionshipManager._minFishLength:D
   #36 = NameAndType        #37:#38       // _minFishLength:D
   #37 = Utf8               _minFishLength
   #38 = Utf8               D
   #39 = Fieldref           #11.#40       // ext/mods/gameserver/data/manager/FishingChampionshipManager._needRefresh:Z
   #40 = NameAndType        #41:#42       // _needRefresh:Z
   #41 = Utf8               _needRefresh
   #42 = Utf8               Z
   #43 = Methodref          #11.#44       // ext/mods/gameserver/data/manager/FishingChampionshipManager.restoreData:()V
   #44 = NameAndType        #45:#6        // restoreData:()V
   #45 = Utf8               restoreData
   #46 = Methodref          #11.#47       // ext/mods/gameserver/data/manager/FishingChampionshipManager.refreshWinResult:()V
   #47 = NameAndType        #48:#6        // refreshWinResult:()V
   #48 = Utf8               refreshWinResult
   #49 = Methodref          #11.#50       // ext/mods/gameserver/data/manager/FishingChampionshipManager.recalculateMinLength:()V
   #50 = NameAndType        #51:#6        // recalculateMinLength:()V
   #51 = Utf8               recalculateMinLength
   #52 = Methodref          #53.#54       // java/lang/System.currentTimeMillis:()J
   #53 = Class              #55           // java/lang/System
   #54 = NameAndType        #56:#57       // currentTimeMillis:()J
   #55 = Utf8               java/lang/System
   #56 = Utf8               currentTimeMillis
   #57 = Utf8               ()J
   #58 = Methodref          #11.#59       // ext/mods/gameserver/data/manager/FishingChampionshipManager.finishChamp:()V
   #59 = NameAndType        #60:#6        // finishChamp:()V
   #60 = Utf8               finishChamp
   #61 = InvokeDynamic      #0:#62        // #0:run:(Lext/mods/gameserver/data/manager/FishingChampionshipManager;)Ljava/lang/Runnable;
   #62 = NameAndType        #63:#64       // run:(Lext/mods/gameserver/data/manager/FishingChampionshipManager;)Ljava/lang/Runnable;
   #63 = Utf8               run
   #64 = Utf8               (Lext/mods/gameserver/data/manager/FishingChampionshipManager;)Ljava/lang/Runnable;
   #65 = Methodref          #66.#67       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #66 = Class              #68           // ext/mods/commons/pool/ThreadPool
   #67 = NameAndType        #69:#70       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #68 = Utf8               ext/mods/commons/pool/ThreadPool
   #69 = Utf8               schedule
   #70 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #71 = Methodref          #72.#73       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #72 = Class              #74           // java/util/Calendar
   #73 = NameAndType        #75:#76       // getInstance:()Ljava/util/Calendar;
   #74 = Utf8               java/util/Calendar
   #75 = Utf8               getInstance
   #76 = Utf8               ()Ljava/util/Calendar;
   #77 = Methodref          #72.#78       // java/util/Calendar.setTimeInMillis:(J)V
   #78 = NameAndType        #79:#80       // setTimeInMillis:(J)V
   #79 = Utf8               setTimeInMillis
   #80 = Utf8               (J)V
   #81 = Methodref          #72.#82       // java/util/Calendar.set:(II)V
   #82 = NameAndType        #83:#84       // set:(II)V
   #83 = Utf8               set
   #84 = Utf8               (II)V
   #85 = Methodref          #72.#86       // java/util/Calendar.add:(II)V
   #86 = NameAndType        #87:#84       // add:(II)V
   #87 = Utf8               add
   #88 = Methodref          #72.#89       // java/util/Calendar.getTimeInMillis:()J
   #89 = NameAndType        #90:#57       // getTimeInMillis:()J
   #90 = Utf8               getTimeInMillis
   #91 = Methodref          #92.#93       // ext/mods/gameserver/data/sql/ServerMemoTable.getInstance:()Lext/mods/gameserver/data/sql/ServerMemoTable;
   #92 = Class              #94           // ext/mods/gameserver/data/sql/ServerMemoTable
   #93 = NameAndType        #75:#95       // getInstance:()Lext/mods/gameserver/data/sql/ServerMemoTable;
   #94 = Utf8               ext/mods/gameserver/data/sql/ServerMemoTable
   #95 = Utf8               ()Lext/mods/gameserver/data/sql/ServerMemoTable;
   #96 = String             #97           // fishChampionshipEnd
   #97 = Utf8               fishChampionshipEnd
   #98 = Methodref          #92.#99       // ext/mods/gameserver/data/sql/ServerMemoTable.getLong:(Ljava/lang/String;J)J
   #99 = NameAndType        #100:#101     // getLong:(Ljava/lang/String;J)J
  #100 = Utf8               getLong
  #101 = Utf8               (Ljava/lang/String;J)J
  #102 = Methodref          #103.#104     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #103 = Class              #105          // ext/mods/commons/pool/ConnectionPool
  #104 = NameAndType        #106:#107     // getConnection:()Ljava/sql/Connection;
  #105 = Utf8               ext/mods/commons/pool/ConnectionPool
  #106 = Utf8               getConnection
  #107 = Utf8               ()Ljava/sql/Connection;
  #108 = String             #109          // SELECT `player_name`, `fish_length`, `rewarded` FROM fishing_championship
  #109 = Utf8               SELECT `player_name`, `fish_length`, `rewarded` FROM fishing_championship
  #110 = InterfaceMethodref #111.#112     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #111 = Class              #113          // java/sql/Connection
  #112 = NameAndType        #114:#115     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #113 = Utf8               java/sql/Connection
  #114 = Utf8               prepareStatement
  #115 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #116 = InterfaceMethodref #117.#118     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #117 = Class              #119          // java/sql/PreparedStatement
  #118 = NameAndType        #120:#121     // executeQuery:()Ljava/sql/ResultSet;
  #119 = Utf8               java/sql/PreparedStatement
  #120 = Utf8               executeQuery
  #121 = Utf8               ()Ljava/sql/ResultSet;
  #122 = InterfaceMethodref #123.#124     // java/sql/ResultSet.next:()Z
  #123 = Class              #125          // java/sql/ResultSet
  #124 = NameAndType        #126:#127     // next:()Z
  #125 = Utf8               java/sql/ResultSet
  #126 = Utf8               next
  #127 = Utf8               ()Z
  #128 = String             #129          // rewarded
  #129 = Utf8               rewarded
  #130 = InterfaceMethodref #123.#131     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #131 = NameAndType        #132:#133     // getInt:(Ljava/lang/String;)I
  #132 = Utf8               getInt
  #133 = Utf8               (Ljava/lang/String;)I
  #134 = Class              #135          // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
  #135 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
  #136 = String             #137          // player_name
  #137 = Utf8               player_name
  #138 = InterfaceMethodref #123.#139     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #139 = NameAndType        #140:#141     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #140 = Utf8               getString
  #141 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #142 = String             #143          // fish_length
  #143 = Utf8               fish_length
  #144 = InterfaceMethodref #123.#145     // java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
  #145 = NameAndType        #146:#147     // getDouble:(Ljava/lang/String;)D
  #146 = Utf8               getDouble
  #147 = Utf8               (Ljava/lang/String;)D
  #148 = Methodref          #134.#149     // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher."<init>":(Lext/mods/gameserver/data/manager/FishingChampionshipManager;Ljava/lang/String;DI)V
  #149 = NameAndType        #5:#150       // "<init>":(Lext/mods/gameserver/data/manager/FishingChampionshipManager;Ljava/lang/String;DI)V
  #150 = Utf8               (Lext/mods/gameserver/data/manager/FishingChampionshipManager;Ljava/lang/String;DI)V
  #151 = InterfaceMethodref #152.#153     // java/util/List.add:(Ljava/lang/Object;)Z
  #152 = Class              #154          // java/util/List
  #153 = NameAndType        #87:#155      // add:(Ljava/lang/Object;)Z
  #154 = Utf8               java/util/List
  #155 = Utf8               (Ljava/lang/Object;)Z
  #156 = InterfaceMethodref #123.#157     // java/sql/ResultSet.close:()V
  #157 = NameAndType        #158:#6       // close:()V
  #158 = Utf8               close
  #159 = Class              #160          // java/lang/Throwable
  #160 = Utf8               java/lang/Throwable
  #161 = Methodref          #159.#162     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #162 = NameAndType        #163:#164     // addSuppressed:(Ljava/lang/Throwable;)V
  #163 = Utf8               addSuppressed
  #164 = Utf8               (Ljava/lang/Throwable;)V
  #165 = InterfaceMethodref #117.#157     // java/sql/PreparedStatement.close:()V
  #166 = InterfaceMethodref #111.#157     // java/sql/Connection.close:()V
  #167 = Class              #168          // java/lang/Exception
  #168 = Utf8               java/lang/Exception
  #169 = Fieldref           #11.#170      // ext/mods/gameserver/data/manager/FishingChampionshipManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #170 = NameAndType        #171:#172     // LOGGER:Lext/mods/commons/logging/CLogger;
  #171 = Utf8               LOGGER
  #172 = Utf8               Lext/mods/commons/logging/CLogger;
  #173 = String             #174          // Couldn\'t restore fishing championship data.
  #174 = Utf8               Couldn\'t restore fishing championship data.
  #175 = Methodref          #176.#177     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #176 = Class              #178          // ext/mods/commons/logging/CLogger
  #177 = NameAndType        #179:#180     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #178 = Utf8               ext/mods/commons/logging/CLogger
  #179 = Utf8               error
  #180 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #181 = InterfaceMethodref #152.#182     // java/util/List.clear:()V
  #182 = NameAndType        #183:#6       // clear:()V
  #183 = Utf8               clear
  #184 = InterfaceMethodref #152.#185     // java/util/List.size:()I
  #185 = NameAndType        #186:#187     // size:()I
  #186 = Utf8               size
  #187 = Utf8               ()I
  #188 = InterfaceMethodref #152.#189     // java/util/List.get:(I)Ljava/lang/Object;
  #189 = NameAndType        #190:#191     // get:(I)Ljava/lang/Object;
  #190 = Utf8               get
  #191 = Utf8               (I)Ljava/lang/Object;
  #192 = Methodref          #134.#193     // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getLength:()D
  #193 = NameAndType        #194:#195     // getLength:()D
  #194 = Utf8               getLength
  #195 = Utf8               ()D
  #196 = InterfaceMethodref #152.#197     // java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
  #197 = NameAndType        #83:#198      // set:(ILjava/lang/Object;)Ljava/lang/Object;
  #198 = Utf8               (ILjava/lang/Object;)Ljava/lang/Object;
  #199 = Methodref          #134.#200     // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getName:()Ljava/lang/String;
  #200 = NameAndType        #201:#202     // getName:()Ljava/lang/String;
  #201 = Utf8               getName
  #202 = Utf8               ()Ljava/lang/String;
  #203 = Methodref          #204.#205     // java/lang/String.valueOf:(D)Ljava/lang/String;
  #204 = Class              #206          // java/lang/String
  #205 = NameAndType        #207:#208     // valueOf:(D)Ljava/lang/String;
  #206 = Utf8               java/lang/String
  #207 = Utf8               valueOf
  #208 = Utf8               (D)Ljava/lang/String;
  #209 = InterfaceMethodref #152.#210     // java/util/List.iterator:()Ljava/util/Iterator;
  #210 = NameAndType        #211:#212     // iterator:()Ljava/util/Iterator;
  #211 = Utf8               iterator
  #212 = Utf8               ()Ljava/util/Iterator;
  #213 = InterfaceMethodref #214.#215     // java/util/Iterator.hasNext:()Z
  #214 = Class              #216          // java/util/Iterator
  #215 = NameAndType        #217:#127     // hasNext:()Z
  #216 = Utf8               java/util/Iterator
  #217 = Utf8               hasNext
  #218 = InterfaceMethodref #214.#219     // java/util/Iterator.next:()Ljava/lang/Object;
  #219 = NameAndType        #126:#220     // next:()Ljava/lang/Object;
  #220 = Utf8               ()Ljava/lang/Object;
  #221 = Methodref          #134.#222     // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.setRewardType:(I)V
  #222 = NameAndType        #223:#224     // setRewardType:(I)V
  #223 = Utf8               setRewardType
  #224 = Utf8               (I)V
  #225 = Methodref          #11.#226      // ext/mods/gameserver/data/manager/FishingChampionshipManager.setEndOfChamp:()V
  #226 = NameAndType        #227:#6       // setEndOfChamp:()V
  #227 = Utf8               setEndOfChamp
  #228 = Methodref          #11.#229      // ext/mods/gameserver/data/manager/FishingChampionshipManager.shutdown:()V
  #229 = NameAndType        #230:#6       // shutdown:()V
  #230 = Utf8               shutdown
  #231 = String             #232          // A new Fishing Championship event period has started.
  #232 = Utf8               A new Fishing Championship event period has started.
  #233 = Methodref          #176.#234     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #234 = NameAndType        #235:#236     // info:(Ljava/lang/Object;)V
  #235 = Utf8               info
  #236 = Utf8               (Ljava/lang/Object;)V
  #237 = Double             99999.0d
  #239 = Fieldref           #240.#241     // ext/mods/Config.ALLOW_FISH_CHAMPIONSHIP:Z
  #240 = Class              #242          // ext/mods/Config
  #241 = NameAndType        #243:#42      // ALLOW_FISH_CHAMPIONSHIP:Z
  #242 = Utf8               ext/mods/Config
  #243 = Utf8               ALLOW_FISH_CHAMPIONSHIP
  #244 = Methodref          #245.#246     // ext/mods/commons/random/Rnd.get:(II)I
  #245 = Class              #247          // ext/mods/commons/random/Rnd
  #246 = NameAndType        #190:#248     // get:(II)I
  #247 = Utf8               ext/mods/commons/random/Rnd
  #248 = Utf8               (II)I
  #249 = Double             1000.0d
  #251 = Fieldref           #252.#253     // ext/mods/gameserver/network/SystemMessageId.CAUGHT_FISH_S1_LENGTH:Lext/mods/gameserver/network/SystemMessageId;
  #252 = Class              #254          // ext/mods/gameserver/network/SystemMessageId
  #253 = NameAndType        #255:#256     // CAUGHT_FISH_S1_LENGTH:Lext/mods/gameserver/network/SystemMessageId;
  #254 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #255 = Utf8               CAUGHT_FISH_S1_LENGTH
  #256 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #257 = Methodref          #258.#259     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #258 = Class              #260          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #259 = NameAndType        #261:#262     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #260 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #261 = Utf8               getSystemMessage
  #262 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #263 = Methodref          #258.#264     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #264 = NameAndType        #265:#266     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #265 = Utf8               addString
  #266 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #267 = Methodref          #268.#269     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #268 = Class              #270          // ext/mods/gameserver/model/actor/Player
  #269 = NameAndType        #271:#272     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #270 = Utf8               ext/mods/gameserver/model/actor/Player
  #271 = Utf8               sendPacket
  #272 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #273 = Methodref          #268.#200     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #274 = Methodref          #204.#275     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #275 = NameAndType        #276:#277     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #276 = Utf8               equalsIgnoreCase
  #277 = Utf8               (Ljava/lang/String;)Z
  #278 = Methodref          #134.#279     // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.setLength:(D)V
  #279 = NameAndType        #280:#281     // setLength:(D)V
  #280 = Utf8               setLength
  #281 = Utf8               (D)V
  #282 = Fieldref           #252.#283     // ext/mods/gameserver/network/SystemMessageId.REGISTERED_IN_FISH_SIZE_RANKING:Lext/mods/gameserver/network/SystemMessageId;
  #283 = NameAndType        #284:#256     // REGISTERED_IN_FISH_SIZE_RANKING:Lext/mods/gameserver/network/SystemMessageId;
  #284 = Utf8               REGISTERED_IN_FISH_SIZE_RANKING
  #285 = Methodref          #268.#286     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #286 = NameAndType        #271:#287     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #287 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #288 = InterfaceMethodref #152.#289     // java/util/List.remove:(Ljava/lang/Object;)Z
  #289 = NameAndType        #290:#155     // remove:(Ljava/lang/Object;)Z
  #290 = Utf8               remove
  #291 = Long               60000l
  #293 = String             #294          // None
  #294 = Utf8               None
  #295 = String             #296          // 0
  #296 = Utf8               0
  #297 = Methodref          #204.#298     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #298 = NameAndType        #299:#155     // equals:(Ljava/lang/Object;)Z
  #299 = Utf8               equals
  #300 = Methodref          #134.#301     // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getRewardType:()I
  #301 = NameAndType        #302:#187     // getRewardType:()I
  #302 = Utf8               getRewardType
  #303 = Fieldref           #240.#304     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_1:I
  #304 = NameAndType        #305:#306     // FISH_CHAMPIONSHIP_REWARD_1:I
  #305 = Utf8               FISH_CHAMPIONSHIP_REWARD_1
  #306 = Utf8               I
  #307 = Fieldref           #240.#308     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_2:I
  #308 = NameAndType        #309:#306     // FISH_CHAMPIONSHIP_REWARD_2:I
  #309 = Utf8               FISH_CHAMPIONSHIP_REWARD_2
  #310 = Fieldref           #240.#311     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_3:I
  #311 = NameAndType        #312:#306     // FISH_CHAMPIONSHIP_REWARD_3:I
  #312 = Utf8               FISH_CHAMPIONSHIP_REWARD_3
  #313 = Fieldref           #240.#314     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_4:I
  #314 = NameAndType        #315:#306     // FISH_CHAMPIONSHIP_REWARD_4:I
  #315 = Utf8               FISH_CHAMPIONSHIP_REWARD_4
  #316 = Fieldref           #240.#317     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_5:I
  #317 = NameAndType        #318:#306     // FISH_CHAMPIONSHIP_REWARD_5:I
  #318 = Utf8               FISH_CHAMPIONSHIP_REWARD_5
  #319 = Fieldref           #240.#320     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_ITEM:I
  #320 = NameAndType        #321:#306     // FISH_CHAMPIONSHIP_REWARD_ITEM:I
  #321 = Utf8               FISH_CHAMPIONSHIP_REWARD_ITEM
  #322 = Methodref          #268.#323     // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #323 = NameAndType        #324:#325     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #324 = Utf8               addItem
  #325 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #326 = Class              #327          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #327 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #328 = Methodref          #326.#329     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #329 = NameAndType        #5:#224       // "<init>":(I)V
  #330 = Methodref          #268.#331     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #331 = NameAndType        #332:#333     // getLocale:()Ljava/util/Locale;
  #332 = Utf8               getLocale
  #333 = Utf8               ()Ljava/util/Locale;
  #334 = String             #335          // html/fisherman/championship/fish_event_reward001.htm
  #335 = Utf8               html/fisherman/championship/fish_event_reward001.htm
  #336 = Methodref          #326.#337     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #337 = NameAndType        #338:#339     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #338 = Utf8               setFile
  #339 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #340 = String             #341          // html/fisherman/championship/fish_event003.htm
  #341 = Utf8               html/fisherman/championship/fish_event003.htm
  #342 = Methodref          #11.#343      // ext/mods/gameserver/data/manager/FishingChampionshipManager.refreshResult:()V
  #343 = NameAndType        #344:#6       // refreshResult:()V
  #344 = Utf8               refreshResult
  #345 = InvokeDynamic      #1:#62        // #1:run:(Lext/mods/gameserver/data/manager/FishingChampionshipManager;)Ljava/lang/Runnable;
  #346 = String             #347          // html/fisherman/championship/fish_event002.htm
  #347 = Utf8               html/fisherman/championship/fish_event002.htm
  #348 = Class              #349          // java/lang/StringBuilder
  #349 = Utf8               java/lang/StringBuilder
  #350 = Methodref          #348.#329     // java/lang/StringBuilder."<init>":(I)V
  #351 = String             #352          // <tr><td width=70 align=center>
  #352 = Utf8               <tr><td width=70 align=center>
  #353 = Methodref          #354.#355     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #354 = Class              #356          // java/lang/Integer
  #355 = NameAndType        #207:#357     // valueOf:(I)Ljava/lang/Integer;
  #356 = Utf8               java/lang/Integer
  #357 = Utf8               (I)Ljava/lang/Integer;
  #358 = String             #359          // </td>
  #359 = Utf8               </td>
  #360 = Methodref          #361.#362     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #361 = Class              #363          // ext/mods/commons/lang/StringUtil
  #362 = NameAndType        #364:#365     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #363 = Utf8               ext/mods/commons/lang/StringUtil
  #364 = Utf8               append
  #365 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #366 = String             #367          // <td width=110 align=center>
  #367 = Utf8               <td width=110 align=center>
  #368 = Methodref          #11.#369      // ext/mods/gameserver/data/manager/FishingChampionshipManager.getCurrentName:(I)Ljava/lang/String;
  #369 = NameAndType        #370:#371     // getCurrentName:(I)Ljava/lang/String;
  #370 = Utf8               getCurrentName
  #371 = Utf8               (I)Ljava/lang/String;
  #372 = String             #373          // <td width=80 align=center>
  #373 = Utf8               <td width=80 align=center>
  #374 = Methodref          #11.#375      // ext/mods/gameserver/data/manager/FishingChampionshipManager.getCurrentFishLength:(I)Ljava/lang/String;
  #375 = NameAndType        #376:#371     // getCurrentFishLength:(I)Ljava/lang/String;
  #376 = Utf8               getCurrentFishLength
  #377 = String             #378          // </td></tr>
  #378 = Utf8               </td></tr>
  #379 = String             #380          // %TABLE%
  #380 = Utf8               %TABLE%
  #381 = Methodref          #348.#382     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #382 = NameAndType        #383:#202     // toString:()Ljava/lang/String;
  #383 = Utf8               toString
  #384 = Methodref          #326.#385     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #385 = NameAndType        #386:#387     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #386 = Utf8               replace
  #387 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #388 = String             #389          // %prizeItem%
  #389 = Utf8               %prizeItem%
  #390 = Methodref          #391.#392     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #391 = Class              #393          // ext/mods/gameserver/data/xml/ItemData
  #392 = NameAndType        #75:#394      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #393 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #394 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #395 = Methodref          #391.#396     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #396 = NameAndType        #397:#398     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #397 = Utf8               getTemplate
  #398 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #399 = Methodref          #400.#200     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #400 = Class              #401          // ext/mods/gameserver/model/item/kind/Item
  #401 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #402 = String             #403          // %prizeFirst%
  #403 = Utf8               %prizeFirst%
  #404 = Methodref          #326.#405     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #405 = NameAndType        #386:#406     // replace:(Ljava/lang/String;I)V
  #406 = Utf8               (Ljava/lang/String;I)V
  #407 = String             #408          // %prizeTwo%
  #408 = Utf8               %prizeTwo%
  #409 = String             #410          // %prizeThree%
  #410 = Utf8               %prizeThree%
  #411 = String             #412          // %prizeFour%
  #412 = Utf8               %prizeFour%
  #413 = String             #414          // %prizeFive%
  #414 = Utf8               %prizeFive%
  #415 = String             #416          // html/fisherman/championship/fish_event001.htm
  #416 = Utf8               html/fisherman/championship/fish_event001.htm
  #417 = Methodref          #11.#418      // ext/mods/gameserver/data/manager/FishingChampionshipManager.getWinnerName:(I)Ljava/lang/String;
  #418 = NameAndType        #419:#371     // getWinnerName:(I)Ljava/lang/String;
  #419 = Utf8               getWinnerName
  #420 = Methodref          #11.#421      // ext/mods/gameserver/data/manager/FishingChampionshipManager.getFishLength:(I)Ljava/lang/String;
  #421 = NameAndType        #422:#371     // getFishLength:(I)Ljava/lang/String;
  #422 = Utf8               getFishLength
  #423 = String             #424          // %refresh%
  #424 = Utf8               %refresh%
  #425 = Methodref          #11.#426      // ext/mods/gameserver/data/manager/FishingChampionshipManager.getTimeRemaining:()J
  #426 = NameAndType        #427:#57      // getTimeRemaining:()J
  #427 = Utf8               getTimeRemaining
  #428 = Methodref          #326.#429     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;J)V
  #429 = NameAndType        #386:#430     // replace:(Ljava/lang/String;J)V
  #430 = Utf8               (Ljava/lang/String;J)V
  #431 = String             #432          // %objectId%
  #432 = Utf8               %objectId%
  #433 = Methodref          #92.#434      // ext/mods/gameserver/data/sql/ServerMemoTable.set:(Ljava/lang/String;J)V
  #434 = NameAndType        #83:#430      // set:(Ljava/lang/String;J)V
  #435 = String             #436          // TRUNCATE fishing_championship
  #436 = Utf8               TRUNCATE fishing_championship
  #437 = String             #438          // INSERT INTO fishing_championship(player_name,fish_length,rewarded) VALUES (?,?,?)
  #438 = Utf8               INSERT INTO fishing_championship(player_name,fish_length,rewarded) VALUES (?,?,?)
  #439 = InterfaceMethodref #117.#440     // java/sql/PreparedStatement.execute:()Z
  #440 = NameAndType        #441:#127     // execute:()Z
  #441 = Utf8               execute
  #442 = InterfaceMethodref #117.#443     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #443 = NameAndType        #444:#445     // setString:(ILjava/lang/String;)V
  #444 = Utf8               setString
  #445 = Utf8               (ILjava/lang/String;)V
  #446 = InterfaceMethodref #117.#447     // java/sql/PreparedStatement.setDouble:(ID)V
  #447 = NameAndType        #448:#449     // setDouble:(ID)V
  #448 = Utf8               setDouble
  #449 = Utf8               (ID)V
  #450 = InterfaceMethodref #117.#451     // java/sql/PreparedStatement.setInt:(II)V
  #451 = NameAndType        #452:#84      // setInt:(II)V
  #452 = Utf8               setInt
  #453 = InterfaceMethodref #117.#454     // java/sql/PreparedStatement.addBatch:()V
  #454 = NameAndType        #455:#6       // addBatch:()V
  #455 = Utf8               addBatch
  #456 = InterfaceMethodref #117.#457     // java/sql/PreparedStatement.executeBatch:()[I
  #457 = NameAndType        #458:#459     // executeBatch:()[I
  #458 = Utf8               executeBatch
  #459 = Utf8               ()[I
  #460 = String             #461          // Couldn\'t update fishing championship data.
  #461 = Utf8               Couldn\'t update fishing championship data.
  #462 = Fieldref           #463.#464     // ext/mods/gameserver/data/manager/FishingChampionshipManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #463 = Class              #465          // ext/mods/gameserver/data/manager/FishingChampionshipManager$SingletonHolder
  #464 = NameAndType        #466:#467     // INSTANCE:Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #465 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager$SingletonHolder
  #466 = Utf8               INSTANCE
  #467 = Utf8               Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #468 = Methodref          #469.#200     // java/lang/Class.getName:()Ljava/lang/String;
  #469 = Class              #470          // java/lang/Class
  #470 = Utf8               java/lang/Class
  #471 = Methodref          #176.#472     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #472 = NameAndType        #5:#473       // "<init>":(Ljava/lang/String;)V
  #473 = Utf8               (Ljava/lang/String;)V
  #474 = Utf8               INSERT
  #475 = Utf8               Ljava/lang/String;
  #476 = Utf8               ConstantValue
  #477 = Utf8               TRUNCATE
  #478 = Utf8               SELECT
  #479 = Utf8               Signature
  #480 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #481 = Utf8               Ljava/util/List<Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;>;
  #482 = Utf8               Code
  #483 = Utf8               LineNumberTable
  #484 = Utf8               LocalVariableTable
  #485 = Utf8               this
  #486 = Utf8               StackMapTable
  #487 = Utf8               cal
  #488 = Utf8               Ljava/util/Calendar;
  #489 = Utf8               rs
  #490 = Utf8               Ljava/sql/ResultSet;
  #491 = Utf8               ps
  #492 = Utf8               Ljava/sql/PreparedStatement;
  #493 = Utf8               con
  #494 = Utf8               Ljava/sql/Connection;
  #495 = Utf8               e
  #496 = Utf8               Ljava/lang/Exception;
  #497 = Utf8               fisher1
  #498 = Utf8               Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
  #499 = Utf8               fisher2
  #500 = Utf8               y
  #501 = Utf8               x
  #502 = Utf8               fisher
  #503 = Utf8               minLen
  #504 = Utf8               newFish
  #505 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #506 = Utf8               minFisher
  #507 = Utf8               player
  #508 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #509 = Utf8               lureId
  #510 = Utf8               len
  #511 = Utf8               par
  #512 = Utf8               isWinner
  #513 = Utf8               name
  #514 = Utf8               playerName
  #515 = Utf8               getReward
  #516 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #517 = Utf8               html
  #518 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #519 = Utf8               rewardCnt
  #520 = Utf8               showMidResult
  #521 = Utf8               sb
  #522 = Utf8               Ljava/lang/StringBuilder;
  #523 = Utf8               showChampScreen
  #524 = Utf8               objectId
  #525 = Utf8               ps2
  #526 = Utf8               ()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #527 = Utf8               lambda$showMidResult$0
  #528 = Utf8               <clinit>
  #529 = Utf8               SourceFile
  #530 = Utf8               FishingChampionshipManager.java
  #531 = Utf8               NestMembers
  #532 = Utf8               BootstrapMethods
  #533 = MethodType         #6            //  ()V
  #534 = MethodHandle       5:#58         // REF_invokeVirtual ext/mods/gameserver/data/manager/FishingChampionshipManager.finishChamp:()V
  #535 = MethodHandle       5:#536        // REF_invokeVirtual ext/mods/gameserver/data/manager/FishingChampionshipManager.lambda$showMidResult$0:()V
  #536 = Methodref          #11.#537      // ext/mods/gameserver/data/manager/FishingChampionshipManager.lambda$showMidResult$0:()V
  #537 = NameAndType        #527:#6       // lambda$showMidResult$0:()V
  #538 = MethodHandle       6:#539        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #539 = Methodref          #540.#541     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #540 = Class              #542          // java/lang/invoke/LambdaMetafactory
  #541 = NameAndType        #543:#544     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #542 = Utf8               java/lang/invoke/LambdaMetafactory
  #543 = Utf8               metafactory
  #544 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #545 = Utf8               InnerClasses
  #546 = Utf8               Fisher
  #547 = Utf8               SingletonHolder
  #548 = Class              #549          // java/lang/invoke/MethodHandles$Lookup
  #549 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #550 = Class              #551          // java/lang/invoke/MethodHandles
  #551 = Utf8               java/lang/invoke/MethodHandles
  #552 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.FishingChampionshipManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _playersName:Ljava/util/List;
        15: aload_0
        16: new           #7                  // class java/util/ArrayList
        19: dup
        20: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        23: putfield      #16                 // Field _fishLength:Ljava/util/List;
        26: aload_0
        27: new           #7                  // class java/util/ArrayList
        30: dup
        31: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        34: putfield      #19                 // Field _winPlayersName:Ljava/util/List;
        37: aload_0
        38: new           #7                  // class java/util/ArrayList
        41: dup
        42: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        45: putfield      #22                 // Field _winFishLength:Ljava/util/List;
        48: aload_0
        49: new           #7                  // class java/util/ArrayList
        52: dup
        53: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        56: putfield      #25                 // Field _tmpPlayers:Ljava/util/List;
        59: aload_0
        60: new           #7                  // class java/util/ArrayList
        63: dup
        64: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        67: putfield      #28                 // Field _winPlayers:Ljava/util/List;
        70: aload_0
        71: lconst_0
        72: putfield      #31                 // Field _endDate:J
        75: aload_0
        76: dconst_0
        77: putfield      #35                 // Field _minFishLength:D
        80: aload_0
        81: iconst_1
        82: putfield      #39                 // Field _needRefresh:Z
        85: aload_0
        86: invokevirtual #43                 // Method restoreData:()V
        89: aload_0
        90: invokevirtual #46                 // Method refreshWinResult:()V
        93: aload_0
        94: invokevirtual #49                 // Method recalculateMinLength:()V
        97: aload_0
        98: getfield      #31                 // Field _endDate:J
       101: invokestatic  #52                 // Method java/lang/System.currentTimeMillis:()J
       104: lcmp
       105: ifgt          122
       108: aload_0
       109: invokestatic  #52                 // Method java/lang/System.currentTimeMillis:()J
       112: putfield      #31                 // Field _endDate:J
       115: aload_0
       116: invokevirtual #58                 // Method finishChamp:()V
       119: goto          140
       122: aload_0
       123: invokedynamic #61,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/data/manager/FishingChampionshipManager;)Ljava/lang/Runnable;
       128: aload_0
       129: getfield      #31                 // Field _endDate:J
       132: invokestatic  #52                 // Method java/lang/System.currentTimeMillis:()J
       135: lsub
       136: invokestatic  #65                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       139: pop
       140: return
      LineNumberTable:
        line 88: 0
        line 76: 4
        line 77: 15
        line 78: 26
        line 79: 37
        line 80: 48
        line 81: 59
        line 83: 70
        line 84: 75
        line 85: 80
        line 89: 85
        line 90: 89
        line 91: 93
        line 93: 97
        line 95: 108
        line 96: 115
        line 99: 122
        line 100: 140
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     141     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 122
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager ]
          stack = []
        frame_type = 17 /* same */

  public synchronized void newFish(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=8, locals=10, args_size=3
         0: getstatic     #239                // Field ext/mods/Config.ALLOW_FISH_CHAMPIONSHIP:Z
         3: ifne          7
         6: return
         7: bipush        60
         9: bipush        89
        11: invokestatic  #244                // Method ext/mods/commons/random/Rnd.get:(II)I
        14: i2d
        15: iconst_0
        16: sipush        1000
        19: invokestatic  #244                // Method ext/mods/commons/random/Rnd.get:(II)I
        22: i2d
        23: ldc2_w        #249                // double 1000.0d
        26: ddiv
        27: dadd
        28: dstore_3
        29: iload_2
        30: sipush        8484
        33: if_icmplt     58
        36: iload_2
        37: sipush        8486
        40: if_icmpgt     58
        43: dload_3
        44: iconst_0
        45: sipush        3000
        48: invokestatic  #244                // Method ext/mods/commons/random/Rnd.get:(II)I
        51: i2d
        52: ldc2_w        #249                // double 1000.0d
        55: ddiv
        56: dadd
        57: dstore_3
        58: aload_1
        59: getstatic     #251                // Field ext/mods/gameserver/network/SystemMessageId.CAUGHT_FISH_S1_LENGTH:Lext/mods/gameserver/network/SystemMessageId;
        62: invokestatic  #257                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        65: dload_3
        66: invokestatic  #203                // Method java/lang/String.valueOf:(D)Ljava/lang/String;
        69: invokevirtual #263                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        72: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: aload_0
        76: getfield      #25                 // Field _tmpPlayers:Ljava/util/List;
        79: invokeinterface #184,  1          // InterfaceMethod java/util/List.size:()I
        84: iconst_5
        85: if_icmpge     205
        88: aload_0
        89: getfield      #25                 // Field _tmpPlayers:Ljava/util/List;
        92: invokeinterface #209,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        97: astore        5
        99: aload         5
       101: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       106: ifeq          167
       109: aload         5
       111: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       116: checkcast     #134                // class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
       119: astore        6
       121: aload         6
       123: invokevirtual #199                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getName:()Ljava/lang/String;
       126: aload_1
       127: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       130: invokevirtual #274                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       133: ifeq          164
       136: aload         6
       138: invokevirtual #192                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getLength:()D
       141: dload_3
       142: dcmpg
       143: ifge          163
       146: aload         6
       148: dload_3
       149: invokevirtual #278                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.setLength:(D)V
       152: aload_1
       153: getstatic     #282                // Field ext/mods/gameserver/network/SystemMessageId.REGISTERED_IN_FISH_SIZE_RANKING:Lext/mods/gameserver/network/SystemMessageId;
       156: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       159: aload_0
       160: invokevirtual #49                 // Method recalculateMinLength:()V
       163: return
       164: goto          99
       167: aload_0
       168: getfield      #25                 // Field _tmpPlayers:Ljava/util/List;
       171: new           #134                // class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
       174: dup
       175: aload_0
       176: aload_1
       177: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       180: dload_3
       181: iconst_0
       182: invokespecial #148                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher."<init>":(Lext/mods/gameserver/data/manager/FishingChampionshipManager;Ljava/lang/String;DI)V
       185: invokeinterface #151,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       190: pop
       191: aload_1
       192: getstatic     #282                // Field ext/mods/gameserver/network/SystemMessageId.REGISTERED_IN_FISH_SIZE_RANKING:Lext/mods/gameserver/network/SystemMessageId;
       195: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       198: aload_0
       199: invokevirtual #49                 // Method recalculateMinLength:()V
       202: goto          406
       205: aload_0
       206: getfield      #35                 // Field _minFishLength:D
       209: dload_3
       210: dcmpg
       211: ifge          406
       214: aload_0
       215: getfield      #25                 // Field _tmpPlayers:Ljava/util/List;
       218: invokeinterface #209,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       223: astore        5
       225: aload         5
       227: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       232: ifeq          293
       235: aload         5
       237: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       242: checkcast     #134                // class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
       245: astore        6
       247: aload         6
       249: invokevirtual #199                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getName:()Ljava/lang/String;
       252: aload_1
       253: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       256: invokevirtual #274                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       259: ifeq          290
       262: aload         6
       264: invokevirtual #192                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getLength:()D
       267: dload_3
       268: dcmpg
       269: ifge          289
       272: aload         6
       274: dload_3
       275: invokevirtual #278                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.setLength:(D)V
       278: aload_1
       279: getstatic     #282                // Field ext/mods/gameserver/network/SystemMessageId.REGISTERED_IN_FISH_SIZE_RANKING:Lext/mods/gameserver/network/SystemMessageId;
       282: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       285: aload_0
       286: invokevirtual #49                 // Method recalculateMinLength:()V
       289: return
       290: goto          225
       293: aconst_null
       294: astore        5
       296: ldc2_w        #237                // double 99999.0d
       299: dstore        6
       301: aload_0
       302: getfield      #25                 // Field _tmpPlayers:Ljava/util/List;
       305: invokeinterface #209,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       310: astore        8
       312: aload         8
       314: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       319: ifeq          359
       322: aload         8
       324: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       329: checkcast     #134                // class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
       332: astore        9
       334: aload         9
       336: invokevirtual #192                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getLength:()D
       339: dload         6
       341: dcmpg
       342: ifge          356
       345: aload         9
       347: astore        5
       349: aload         5
       351: invokevirtual #192                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getLength:()D
       354: dstore        6
       356: goto          312
       359: aload_0
       360: getfield      #25                 // Field _tmpPlayers:Ljava/util/List;
       363: aload         5
       365: invokeinterface #288,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
       370: pop
       371: aload_0
       372: getfield      #25                 // Field _tmpPlayers:Ljava/util/List;
       375: new           #134                // class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
       378: dup
       379: aload_0
       380: aload_1
       381: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       384: dload_3
       385: iconst_0
       386: invokespecial #148                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher."<init>":(Lext/mods/gameserver/data/manager/FishingChampionshipManager;Ljava/lang/String;DI)V
       389: invokeinterface #151,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       394: pop
       395: aload_1
       396: getstatic     #282                // Field ext/mods/gameserver/network/SystemMessageId.REGISTERED_IN_FISH_SIZE_RANKING:Lext/mods/gameserver/network/SystemMessageId;
       399: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       402: aload_0
       403: invokevirtual #49                 // Method recalculateMinLength:()V
       406: return
      LineNumberTable:
        line 231: 0
        line 232: 6
        line 234: 7
        line 235: 29
        line 236: 43
        line 238: 58
        line 240: 75
        line 242: 88
        line 244: 121
        line 246: 136
        line 248: 146
        line 249: 152
        line 250: 159
        line 252: 163
        line 254: 164
        line 255: 167
        line 256: 191
        line 257: 198
        line 259: 205
        line 261: 214
        line 263: 247
        line 265: 262
        line 267: 272
        line 268: 278
        line 269: 285
        line 271: 289
        line 273: 290
        line 275: 293
        line 276: 296
        line 277: 301
        line 279: 334
        line 281: 345
        line 282: 349
        line 284: 356
        line 285: 359
        line 286: 371
        line 287: 395
        line 288: 402
        line 290: 406
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          121      43     6 fisher   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
          247      43     6 fisher   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
          334      22     9 fisher   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
          296     110     5 minFisher   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
          301     105     6 minLen   D
            0     407     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0     407     1 player   Lext/mods/gameserver/model/actor/Player;
            0     407     2 lureId   I
           29     378     3   len   D
      StackMapTable: number_of_entries = 15
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ double ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 37 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher, double, class java/util/Iterator ]
        frame_type = 43 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 249 /* chop */
          offset_delta = 46

  public long getTimeRemaining();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _endDate:J
         4: invokestatic  #52                 // Method java/lang/System.currentTimeMillis:()J
         7: lsub
         8: ldc2_w        #291                // long 60000l
        11: ldiv
        12: lreturn
      LineNumberTable:
        line 294: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;

  public java.lang.String getWinnerName(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _winPlayersName:Ljava/util/List;
         4: invokeinterface #184,  1          // InterfaceMethod java/util/List.size:()I
         9: iload_1
        10: if_icmplt     29
        13: aload_0
        14: getfield      #19                 // Field _winPlayersName:Ljava/util/List;
        17: iload_1
        18: iconst_1
        19: isub
        20: invokeinterface #188,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        25: checkcast     #204                // class java/lang/String
        28: areturn
        29: ldc_w         #293                // String None
        32: areturn
      LineNumberTable:
        line 299: 0
        line 300: 13
        line 302: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0      33     1   par   I
      StackMapTable: number_of_entries = 1
        frame_type = 29 /* same */

  public java.lang.String getCurrentName(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _playersName:Ljava/util/List;
         4: invokeinterface #184,  1          // InterfaceMethod java/util/List.size:()I
         9: iload_1
        10: if_icmplt     29
        13: aload_0
        14: getfield      #10                 // Field _playersName:Ljava/util/List;
        17: iload_1
        18: iconst_1
        19: isub
        20: invokeinterface #188,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        25: checkcast     #204                // class java/lang/String
        28: areturn
        29: ldc_w         #293                // String None
        32: areturn
      LineNumberTable:
        line 307: 0
        line 308: 13
        line 310: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0      33     1   par   I
      StackMapTable: number_of_entries = 1
        frame_type = 29 /* same */

  public java.lang.String getFishLength(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field _winFishLength:Ljava/util/List;
         4: invokeinterface #184,  1          // InterfaceMethod java/util/List.size:()I
         9: iload_1
        10: if_icmplt     29
        13: aload_0
        14: getfield      #22                 // Field _winFishLength:Ljava/util/List;
        17: iload_1
        18: iconst_1
        19: isub
        20: invokeinterface #188,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        25: checkcast     #204                // class java/lang/String
        28: areturn
        29: ldc_w         #295                // String 0
        32: areturn
      LineNumberTable:
        line 315: 0
        line 316: 13
        line 318: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0      33     1   par   I
      StackMapTable: number_of_entries = 1
        frame_type = 29 /* same */

  public java.lang.String getCurrentFishLength(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _fishLength:Ljava/util/List;
         4: invokeinterface #184,  1          // InterfaceMethod java/util/List.size:()I
         9: iload_1
        10: if_icmplt     29
        13: aload_0
        14: getfield      #16                 // Field _fishLength:Ljava/util/List;
        17: iload_1
        18: iconst_1
        19: isub
        20: invokeinterface #188,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        25: checkcast     #204                // class java/lang/String
        28: areturn
        29: ldc_w         #295                // String 0
        32: areturn
      LineNumberTable:
        line 323: 0
        line 324: 13
        line 326: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0      33     1   par   I
      StackMapTable: number_of_entries = 1
        frame_type = 29 /* same */

  public boolean isWinner(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _winPlayersName:Ljava/util/List;
         4: invokeinterface #209,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_2
        20: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #204                // class java/lang/String
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokevirtual #297                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        34: ifeq          39
        37: iconst_1
        38: ireturn
        39: goto          10
        42: iconst_0
        43: ireturn
      LineNumberTable:
        line 331: 0
        line 333: 29
        line 334: 37
        line 335: 39
        line 336: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      10     3  name   Ljava/lang/String;
            0      44     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0      44     1 playerName   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void getReward(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_0
         1: getfield      #28                 // Field _winPlayers:Ljava/util/List;
         4: invokeinterface #209,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          227
        19: aload_2
        20: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #134                // class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
        28: astore_3
        29: aload_3
        30: invokevirtual #300                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getRewardType:()I
        33: iconst_2
        34: if_icmpeq     224
        37: aload_3
        38: invokevirtual #199                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getName:()Ljava/lang/String;
        41: aload_1
        42: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        45: invokevirtual #274                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        48: ifeq          224
        51: iconst_0
        52: istore        4
        54: iconst_0
        55: istore        5
        57: iload         5
        59: aload_0
        60: getfield      #19                 // Field _winPlayersName:Ljava/util/List;
        63: invokeinterface #184,  1          // InterfaceMethod java/util/List.size:()I
        68: if_icmpge     175
        71: aload_0
        72: getfield      #19                 // Field _winPlayersName:Ljava/util/List;
        75: iload         5
        77: invokeinterface #188,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        82: checkcast     #204                // class java/lang/String
        85: aload_1
        86: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        89: invokevirtual #274                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        92: ifeq          169
        95: iload         5
        97: tableswitch   { // 0 to 4

                       0: 132

                       1: 140

                       2: 148

                       3: 156

                       4: 164
                 default: 169
            }
       132: getstatic     #303                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_1:I
       135: istore        4
       137: goto          169
       140: getstatic     #307                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_2:I
       143: istore        4
       145: goto          169
       148: getstatic     #310                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_3:I
       151: istore        4
       153: goto          169
       156: getstatic     #313                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_4:I
       159: istore        4
       161: goto          169
       164: getstatic     #316                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_5:I
       167: istore        4
       169: iinc          5, 1
       172: goto          57
       175: aload_3
       176: iconst_2
       177: invokevirtual #221                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.setRewardType:(I)V
       180: iload         4
       182: ifle          224
       185: aload_1
       186: getstatic     #319                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_ITEM:I
       189: iload         4
       191: iconst_1
       192: invokevirtual #322                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       195: pop
       196: new           #326                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       199: dup
       200: iconst_0
       201: invokespecial #328                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       204: astore        5
       206: aload         5
       208: aload_1
       209: invokevirtual #330                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       212: ldc_w         #334                // String html/fisherman/championship/fish_event_reward001.htm
       215: invokevirtual #336                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       218: aload_1
       219: aload         5
       221: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       224: goto          10
       227: return
      LineNumberTable:
        line 341: 0
        line 343: 29
        line 345: 51
        line 346: 54
        line 348: 71
        line 350: 95
        line 353: 132
        line 354: 137
        line 357: 140
        line 358: 145
        line 361: 148
        line 362: 153
        line 365: 156
        line 366: 161
        line 369: 164
        line 346: 169
        line 375: 175
        line 377: 180
        line 379: 185
        line 381: 196
        line 382: 206
        line 383: 218
        line 386: 224
        line 387: 227
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57     118     5     x   I
          206      18     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           54     170     4 rewardCnt   I
           29     195     3 fisher   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
            0     228     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0     228     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher, int, int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 4 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 249 /* chop */
          offset_delta = 48
        frame_type = 250 /* chop */
          offset_delta = 2

  public void showMidResult(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=2
         0: new           #326                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #328                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_2
         9: aload_0
        10: getfield      #39                 // Field _needRefresh:Z
        13: ifeq          50
        16: aload_2
        17: aload_1
        18: invokevirtual #330                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        21: ldc_w         #340                // String html/fisherman/championship/fish_event003.htm
        24: invokevirtual #336                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        27: aload_1
        28: aload_2
        29: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        32: aload_0
        33: invokevirtual #342                // Method refreshResult:()V
        36: aload_0
        37: invokedynamic #345,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/data/manager/FishingChampionshipManager;)Ljava/lang/Runnable;
        42: ldc2_w        #291                // long 60000l
        45: invokestatic  #65                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        48: pop
        49: return
        50: aload_2
        51: aload_1
        52: invokevirtual #330                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        55: ldc_w         #346                // String html/fisherman/championship/fish_event002.htm
        58: invokevirtual #336                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        61: new           #348                // class java/lang/StringBuilder
        64: dup
        65: bipush        100
        67: invokespecial #350                // Method java/lang/StringBuilder."<init>":(I)V
        70: astore_3
        71: iconst_1
        72: istore        4
        74: iload         4
        76: iconst_5
        77: if_icmpgt     172
        80: aload_3
        81: iconst_3
        82: anewarray     #2                  // class java/lang/Object
        85: dup
        86: iconst_0
        87: ldc_w         #351                // String <tr><td width=70 align=center>
        90: aastore
        91: dup
        92: iconst_1
        93: iload         4
        95: invokestatic  #353                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        98: aastore
        99: dup
       100: iconst_2
       101: ldc_w         #358                // String </td>
       104: aastore
       105: invokestatic  #360                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       108: aload_3
       109: iconst_3
       110: anewarray     #2                  // class java/lang/Object
       113: dup
       114: iconst_0
       115: ldc_w         #366                // String <td width=110 align=center>
       118: aastore
       119: dup
       120: iconst_1
       121: aload_0
       122: iload         4
       124: invokevirtual #368                // Method getCurrentName:(I)Ljava/lang/String;
       127: aastore
       128: dup
       129: iconst_2
       130: ldc_w         #358                // String </td>
       133: aastore
       134: invokestatic  #360                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       137: aload_3
       138: iconst_3
       139: anewarray     #2                  // class java/lang/Object
       142: dup
       143: iconst_0
       144: ldc_w         #372                // String <td width=80 align=center>
       147: aastore
       148: dup
       149: iconst_1
       150: aload_0
       151: iload         4
       153: invokevirtual #374                // Method getCurrentFishLength:(I)Ljava/lang/String;
       156: aastore
       157: dup
       158: iconst_2
       159: ldc_w         #377                // String </td></tr>
       162: aastore
       163: invokestatic  #360                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       166: iinc          4, 1
       169: goto          74
       172: aload_2
       173: ldc_w         #379                // String %TABLE%
       176: aload_3
       177: invokevirtual #381                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       180: invokevirtual #384                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       183: aload_2
       184: ldc_w         #388                // String %prizeItem%
       187: invokestatic  #390                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       190: getstatic     #319                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_ITEM:I
       193: invokevirtual #395                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       196: invokevirtual #399                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
       199: invokevirtual #384                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       202: aload_2
       203: ldc_w         #402                // String %prizeFirst%
       206: getstatic     #303                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_1:I
       209: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       212: aload_2
       213: ldc_w         #407                // String %prizeTwo%
       216: getstatic     #307                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_2:I
       219: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       222: aload_2
       223: ldc_w         #409                // String %prizeThree%
       226: getstatic     #310                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_3:I
       229: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       232: aload_2
       233: ldc_w         #411                // String %prizeFour%
       236: getstatic     #313                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_4:I
       239: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       242: aload_2
       243: ldc_w         #413                // String %prizeFive%
       246: getstatic     #316                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_5:I
       249: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       252: aload_1
       253: aload_2
       254: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       257: return
      LineNumberTable:
        line 391: 0
        line 393: 9
        line 395: 16
        line 396: 27
        line 398: 32
        line 399: 36
        line 400: 49
        line 403: 50
        line 405: 61
        line 406: 71
        line 408: 80
        line 409: 108
        line 410: 137
        line 406: 166
        line 412: 172
        line 413: 183
        line 414: 202
        line 415: 212
        line 416: 222
        line 417: 232
        line 418: 242
        line 419: 252
        line 420: 257
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      98     4     x   I
            0     258     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0     258     1 player   Lext/mods/gameserver/model/actor/Player;
            9     249     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           71     187     3    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/lang/StringBuilder, int ]
        frame_type = 250 /* chop */
          offset_delta = 97

  public void showChampScreen(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=3
         0: new           #326                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iload_2
         5: invokespecial #328                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_3
         9: aload_3
        10: aload_1
        11: invokevirtual #330                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        14: ldc_w         #415                // String html/fisherman/championship/fish_event001.htm
        17: invokevirtual #336                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        20: new           #348                // class java/lang/StringBuilder
        23: dup
        24: bipush        100
        26: invokespecial #350                // Method java/lang/StringBuilder."<init>":(I)V
        29: astore        4
        31: iconst_1
        32: istore        5
        34: iload         5
        36: iconst_5
        37: if_icmpgt     135
        40: aload         4
        42: iconst_3
        43: anewarray     #2                  // class java/lang/Object
        46: dup
        47: iconst_0
        48: ldc_w         #351                // String <tr><td width=70 align=center>
        51: aastore
        52: dup
        53: iconst_1
        54: iload         5
        56: invokestatic  #353                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        59: aastore
        60: dup
        61: iconst_2
        62: ldc_w         #358                // String </td>
        65: aastore
        66: invokestatic  #360                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        69: aload         4
        71: iconst_3
        72: anewarray     #2                  // class java/lang/Object
        75: dup
        76: iconst_0
        77: ldc_w         #366                // String <td width=110 align=center>
        80: aastore
        81: dup
        82: iconst_1
        83: aload_0
        84: iload         5
        86: invokevirtual #417                // Method getWinnerName:(I)Ljava/lang/String;
        89: aastore
        90: dup
        91: iconst_2
        92: ldc_w         #358                // String </td>
        95: aastore
        96: invokestatic  #360                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        99: aload         4
       101: iconst_3
       102: anewarray     #2                  // class java/lang/Object
       105: dup
       106: iconst_0
       107: ldc_w         #372                // String <td width=80 align=center>
       110: aastore
       111: dup
       112: iconst_1
       113: aload_0
       114: iload         5
       116: invokevirtual #420                // Method getFishLength:(I)Ljava/lang/String;
       119: aastore
       120: dup
       121: iconst_2
       122: ldc_w         #377                // String </td></tr>
       125: aastore
       126: invokestatic  #360                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       129: iinc          5, 1
       132: goto          34
       135: aload_3
       136: ldc_w         #379                // String %TABLE%
       139: aload         4
       141: invokevirtual #381                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       144: invokevirtual #384                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       147: aload_3
       148: ldc_w         #388                // String %prizeItem%
       151: invokestatic  #390                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       154: getstatic     #319                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_ITEM:I
       157: invokevirtual #395                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       160: invokevirtual #399                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
       163: invokevirtual #384                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       166: aload_3
       167: ldc_w         #402                // String %prizeFirst%
       170: getstatic     #303                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_1:I
       173: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       176: aload_3
       177: ldc_w         #407                // String %prizeTwo%
       180: getstatic     #307                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_2:I
       183: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       186: aload_3
       187: ldc_w         #409                // String %prizeThree%
       190: getstatic     #310                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_3:I
       193: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       196: aload_3
       197: ldc_w         #411                // String %prizeFour%
       200: getstatic     #313                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_4:I
       203: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       206: aload_3
       207: ldc_w         #413                // String %prizeFive%
       210: getstatic     #316                // Field ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_5:I
       213: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       216: aload_3
       217: ldc_w         #423                // String %refresh%
       220: aload_0
       221: invokevirtual #425                // Method getTimeRemaining:()J
       224: invokevirtual #428                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;J)V
       227: aload_3
       228: ldc_w         #431                // String %objectId%
       231: iload_2
       232: invokevirtual #404                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       235: aload_1
       236: aload_3
       237: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       240: return
      LineNumberTable:
        line 424: 0
        line 425: 9
        line 427: 20
        line 428: 31
        line 430: 40
        line 431: 69
        line 432: 99
        line 428: 129
        line 434: 135
        line 435: 147
        line 436: 166
        line 437: 176
        line 438: 186
        line 439: 196
        line 440: 206
        line 441: 216
        line 442: 227
        line 443: 235
        line 444: 240
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34     101     5     x   I
            0     241     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
            0     241     1 player   Lext/mods/gameserver/model/actor/Player;
            0     241     2 objectId   I
            9     232     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           31     210     4    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, int ]
        frame_type = 250 /* chop */
          offset_delta = 100

  public void shutdown();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=1
         0: invokestatic  #91                 // Method ext/mods/gameserver/data/sql/ServerMemoTable.getInstance:()Lext/mods/gameserver/data/sql/ServerMemoTable;
         3: ldc           #96                 // String fishChampionshipEnd
         5: aload_0
         6: getfield      #31                 // Field _endDate:J
         9: invokevirtual #433                // Method ext/mods/gameserver/data/sql/ServerMemoTable.set:(Ljava/lang/String;J)V
        12: invokestatic  #102                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        15: astore_1
        16: aload_1
        17: ldc_w         #435                // String TRUNCATE fishing_championship
        20: invokeinterface #110,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        25: astore_2
        26: aload_1
        27: ldc_w         #437                // String INSERT INTO fishing_championship(player_name,fish_length,rewarded) VALUES (?,?,?)
        30: invokeinterface #110,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        35: astore_3
        36: aload_2
        37: invokeinterface #439,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        42: pop
        43: aload_0
        44: getfield      #28                 // Field _winPlayers:Ljava/util/List;
        47: invokeinterface #209,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        52: astore        4
        54: aload         4
        56: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        61: ifeq          121
        64: aload         4
        66: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        71: checkcast     #134                // class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
        74: astore        5
        76: aload_3
        77: iconst_1
        78: aload         5
        80: invokevirtual #199                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getName:()Ljava/lang/String;
        83: invokeinterface #442,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        88: aload_3
        89: iconst_2
        90: aload         5
        92: invokevirtual #192                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getLength:()D
        95: invokeinterface #446,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
       100: aload_3
       101: iconst_3
       102: aload         5
       104: invokevirtual #300                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getRewardType:()I
       107: invokeinterface #450,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       112: aload_3
       113: invokeinterface #453,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       118: goto          54
       121: aload_0
       122: getfield      #25                 // Field _tmpPlayers:Ljava/util/List;
       125: invokeinterface #209,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       130: astore        4
       132: aload         4
       134: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       139: ifeq          195
       142: aload         4
       144: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       149: checkcast     #134                // class ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
       152: astore        5
       154: aload_3
       155: iconst_1
       156: aload         5
       158: invokevirtual #199                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getName:()Ljava/lang/String;
       161: invokeinterface #442,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       166: aload_3
       167: iconst_2
       168: aload         5
       170: invokevirtual #192                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.getLength:()D
       173: invokeinterface #446,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
       178: aload_3
       179: iconst_3
       180: iconst_0
       181: invokeinterface #450,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       186: aload_3
       187: invokeinterface #453,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       192: goto          132
       195: aload_3
       196: invokeinterface #456,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       201: pop
       202: aload_3
       203: ifnull        242
       206: aload_3
       207: invokeinterface #165,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       212: goto          242
       215: astore        4
       217: aload_3
       218: ifnull        239
       221: aload_3
       222: invokeinterface #165,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       227: goto          239
       230: astore        5
       232: aload         4
       234: aload         5
       236: invokevirtual #161                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       239: aload         4
       241: athrow
       242: aload_2
       243: ifnull        279
       246: aload_2
       247: invokeinterface #165,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       252: goto          279
       255: astore_3
       256: aload_2
       257: ifnull        277
       260: aload_2
       261: invokeinterface #165,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       266: goto          277
       269: astore        4
       271: aload_3
       272: aload         4
       274: invokevirtual #161                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       277: aload_3
       278: athrow
       279: aload_1
       280: ifnull        314
       283: aload_1
       284: invokeinterface #166,  1          // InterfaceMethod java/sql/Connection.close:()V
       289: goto          314
       292: astore_2
       293: aload_1
       294: ifnull        312
       297: aload_1
       298: invokeinterface #166,  1          // InterfaceMethod java/sql/Connection.close:()V
       303: goto          312
       306: astore_3
       307: aload_2
       308: aload_3
       309: invokevirtual #161                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       312: aload_2
       313: athrow
       314: goto          328
       317: astore_1
       318: getstatic     #169                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       321: ldc_w         #460                // String Couldn\'t update fishing championship data.
       324: aload_1
       325: invokevirtual #175                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       328: return
      Exception table:
         from    to  target type
            36   202   215   Class java/lang/Throwable
           221   227   230   Class java/lang/Throwable
            26   242   255   Class java/lang/Throwable
           260   266   269   Class java/lang/Throwable
            16   279   292   Class java/lang/Throwable
           297   303   306   Class java/lang/Throwable
            12   314   317   Class java/lang/Exception
      LineNumberTable:
        line 448: 0
        line 450: 12
        line 451: 16
        line 452: 26
        line 454: 36
        line 456: 43
        line 458: 76
        line 459: 88
        line 460: 100
        line 461: 112
        line 462: 118
        line 464: 121
        line 466: 154
        line 467: 166
        line 468: 178
        line 469: 186
        line 470: 192
        line 471: 195
        line 472: 202
        line 450: 215
        line 472: 242
        line 450: 255
        line 472: 279
        line 450: 292
        line 476: 314
        line 473: 317
        line 475: 318
        line 477: 328
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           76      42     5 fisher   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
          154      38     5 fisher   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
           36     206     3   ps2   Ljava/sql/PreparedStatement;
           26     253     2    ps   Ljava/sql/PreparedStatement;
           16     298     1   con   Ljava/sql/Connection;
          318      10     1     e   Ljava/lang/Exception;
            0     329     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager;
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 66
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 62
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/FishingChampionshipManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public static final ext.mods.gameserver.data.manager.FishingChampionshipManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #462                // Field ext/mods/gameserver/data/manager/FishingChampionshipManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/FishingChampionshipManager;
         3: areturn
      LineNumberTable:
        line 520: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #176                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/FishingChampionshipManager
         6: invokevirtual #468                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #471                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #169                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 70: 0
}
SourceFile: "FishingChampionshipManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/FishingChampionshipManager$SingletonHolder
  ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
BootstrapMethods:
  0: #538 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #533 ()V
      #534 REF_invokeVirtual ext/mods/gameserver/data/manager/FishingChampionshipManager.finishChamp:()V
      #533 ()V
  1: #538 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #533 ()V
      #535 REF_invokeVirtual ext/mods/gameserver/data/manager/FishingChampionshipManager.lambda$showMidResult$0:()V
      #533 ()V
InnerClasses:
  public static final #552= #548 of #550; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
