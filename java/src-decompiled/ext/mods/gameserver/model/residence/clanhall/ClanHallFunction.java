// Bytecode for: ext.mods.gameserver.model.residence.clanhall.ClanHallFunction
// File: ext\mods\gameserver\model\residence\clanhall\ClanHallFunction.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.class
  Last modified 9 de jul de 2026; size 6986 bytes
  MD5 checksum 4ca1772b5880a7c155614d4d86ff8da4
  Compiled from "ClanHallFunction.java"
public class ext.mods.gameserver.model.residence.clanhall.ClanHallFunction
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 14, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction._ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
    #8 = Class              #10           // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
    #9 = NameAndType        #11:#12       // _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #10 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
   #11 = Utf8               _ch
   #12 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction._type:I
   #14 = NameAndType        #15:#16       // _type:I
   #15 = Utf8               _type
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction._lvl:I
   #18 = NameAndType        #19:#16       // _lvl:I
   #19 = Utf8               _lvl
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction._fee:I
   #21 = NameAndType        #22:#16       // _fee:I
   #22 = Utf8               _fee
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction._rate:J
   #24 = NameAndType        #25:#26       // _rate:J
   #25 = Utf8               _rate
   #26 = Utf8               J
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction._endDate:J
   #28 = NameAndType        #29:#26       // _endDate:J
   #29 = Utf8               _endDate
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/residence/clanhall/ClanHall.isFree:()Z
   #31 = Class              #33           // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #32 = NameAndType        #34:#35       // isFree:()Z
   #33 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #34 = Utf8               isFree
   #35 = Utf8               ()Z
   #36 = Fieldref           #8.#37        // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.LOGGER:Lext/mods/commons/logging/CLogger;
   #37 = NameAndType        #38:#39       // LOGGER:Lext/mods/commons/logging/CLogger;
   #38 = Utf8               LOGGER
   #39 = Utf8               Lext/mods/commons/logging/CLogger;
   #40 = Methodref          #31.#41       // ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
   #41 = NameAndType        #42:#43       // getId:()I
   #42 = Utf8               getId
   #43 = Utf8               ()I
   #44 = InvokeDynamic      #0:#45        // #0:makeConcatWithConstants:(IJI)Ljava/lang/String;
   #45 = NameAndType        #46:#47       // makeConcatWithConstants:(IJI)Ljava/lang/String;
   #46 = Utf8               makeConcatWithConstants
   #47 = Utf8               (IJI)Ljava/lang/String;
   #48 = Methodref          #49.#50       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #49 = Class              #51           // ext/mods/commons/logging/CLogger
   #50 = NameAndType        #52:#53       // warn:(Ljava/lang/Object;)V
   #51 = Utf8               ext/mods/commons/logging/CLogger
   #52 = Utf8               warn
   #53 = Utf8               (Ljava/lang/Object;)V
   #54 = Methodref          #55.#56       // java/lang/System.currentTimeMillis:()J
   #55 = Class              #57           // java/lang/System
   #56 = NameAndType        #58:#59       // currentTimeMillis:()J
   #57 = Utf8               java/lang/System
   #58 = Utf8               currentTimeMillis
   #59 = Utf8               ()J
   #60 = InvokeDynamic      #1:#61        // #1:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;)Ljava/lang/Runnable;
   #61 = NameAndType        #62:#63       // run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;)Ljava/lang/Runnable;
   #62 = Utf8               run
   #63 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;)Ljava/lang/Runnable;
   #64 = Methodref          #65.#66       // ext/mods/commons/pool/ThreadPool.scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #65 = Class              #67           // ext/mods/commons/pool/ThreadPool
   #66 = NameAndType        #68:#69       // scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #67 = Utf8               ext/mods/commons/pool/ThreadPool
   #68 = Utf8               scheduleIO
   #69 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #70 = Fieldref           #8.#71        // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction._feeTask:Ljava/util/concurrent/ScheduledFuture;
   #71 = NameAndType        #72:#73       // _feeTask:Ljava/util/concurrent/ScheduledFuture;
   #72 = Utf8               _feeTask
   #73 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #74 = Methodref          #65.#75       // ext/mods/commons/pool/ThreadPool.executeIO:(Ljava/lang/Runnable;)V
   #75 = NameAndType        #76:#77       // executeIO:(Ljava/lang/Runnable;)V
   #76 = Utf8               executeIO
   #77 = Utf8               (Ljava/lang/Runnable;)V
   #78 = Class              #79           // ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #79 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #80 = Methodref          #8.#81        // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getRate:()J
   #81 = NameAndType        #82:#59       // getRate:()J
   #82 = Utf8               getRate
   #83 = InterfaceMethodref #84.#85       // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #84 = Class              #86           // java/util/concurrent/ScheduledFuture
   #85 = NameAndType        #87:#88       // cancel:(Z)Z
   #86 = Utf8               java/util/concurrent/ScheduledFuture
   #87 = Utf8               cancel
   #88 = Utf8               (Z)Z
   #89 = Methodref          #90.#91       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #90 = Class              #92           // ext/mods/commons/pool/ConnectionPool
   #91 = NameAndType        #93:#94       // getConnection:()Ljava/sql/Connection;
   #92 = Utf8               ext/mods/commons/pool/ConnectionPool
   #93 = Utf8               getConnection
   #94 = Utf8               ()Ljava/sql/Connection;
   #95 = String             #96           // REPLACE INTO clanhall_functions (hall_id, type, lvl, lease, rate, endTime) VALUES (?,?,?,?,?,?)
   #96 = Utf8               REPLACE INTO clanhall_functions (hall_id, type, lvl, lease, rate, endTime) VALUES (?,?,?,?,?,?)
   #97 = InterfaceMethodref #98.#99       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #98 = Class              #100          // java/sql/Connection
   #99 = NameAndType        #101:#102     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #100 = Utf8               java/sql/Connection
  #101 = Utf8               prepareStatement
  #102 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #103 = InterfaceMethodref #104.#105     // java/sql/PreparedStatement.setInt:(II)V
  #104 = Class              #106          // java/sql/PreparedStatement
  #105 = NameAndType        #107:#108     // setInt:(II)V
  #106 = Utf8               java/sql/PreparedStatement
  #107 = Utf8               setInt
  #108 = Utf8               (II)V
  #109 = Methodref          #8.#110       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getType:()I
  #110 = NameAndType        #111:#43      // getType:()I
  #111 = Utf8               getType
  #112 = Methodref          #8.#113       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
  #113 = NameAndType        #114:#43      // getLvl:()I
  #114 = Utf8               getLvl
  #115 = Methodref          #8.#116       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
  #116 = NameAndType        #117:#43      // getLease:()I
  #117 = Utf8               getLease
  #118 = InterfaceMethodref #104.#119     // java/sql/PreparedStatement.setLong:(IJ)V
  #119 = NameAndType        #120:#121     // setLong:(IJ)V
  #120 = Utf8               setLong
  #121 = Utf8               (IJ)V
  #122 = Methodref          #8.#123       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
  #123 = NameAndType        #124:#59      // getEndTime:()J
  #124 = Utf8               getEndTime
  #125 = InterfaceMethodref #104.#126     // java/sql/PreparedStatement.execute:()Z
  #126 = NameAndType        #127:#35      // execute:()Z
  #127 = Utf8               execute
  #128 = InterfaceMethodref #104.#129     // java/sql/PreparedStatement.close:()V
  #129 = NameAndType        #130:#6       // close:()V
  #130 = Utf8               close
  #131 = Class              #132          // java/lang/Throwable
  #132 = Utf8               java/lang/Throwable
  #133 = Methodref          #131.#134     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #134 = NameAndType        #135:#136     // addSuppressed:(Ljava/lang/Throwable;)V
  #135 = Utf8               addSuppressed
  #136 = Utf8               (Ljava/lang/Throwable;)V
  #137 = InterfaceMethodref #98.#129      // java/sql/Connection.close:()V
  #138 = Class              #139          // java/lang/Exception
  #139 = Utf8               java/lang/Exception
  #140 = String             #141          // Couldn\'t save clan hall function.
  #141 = Utf8               Couldn\'t save clan hall function.
  #142 = Methodref          #49.#143      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #143 = NameAndType        #144:#145     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #144 = Utf8               error
  #145 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #146 = Methodref          #8.#147       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.stopFeeTask:()V
  #147 = NameAndType        #148:#6       // stopFeeTask:()V
  #148 = Utf8               stopFeeTask
  #149 = Methodref          #31.#150      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunctions:()Ljava/util/Map;
  #150 = NameAndType        #151:#152     // getFunctions:()Ljava/util/Map;
  #151 = Utf8               getFunctions
  #152 = Utf8               ()Ljava/util/Map;
  #153 = Methodref          #154.#155     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #154 = Class              #156          // java/lang/Integer
  #155 = NameAndType        #157:#158     // valueOf:(I)Ljava/lang/Integer;
  #156 = Utf8               java/lang/Integer
  #157 = Utf8               valueOf
  #158 = Utf8               (I)Ljava/lang/Integer;
  #159 = InterfaceMethodref #160.#161     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #160 = Class              #162          // java/util/Map
  #161 = NameAndType        #163:#164     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #162 = Utf8               java/util/Map
  #163 = Utf8               remove
  #164 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #165 = String             #166          // DELETE FROM clanhall_functions WHERE hall_id=? AND type=?
  #166 = Utf8               DELETE FROM clanhall_functions WHERE hall_id=? AND type=?
  #167 = String             #168          // Couldn\'t remove clan hall function.
  #168 = Utf8               Couldn\'t remove clan hall function.
  #169 = Methodref          #8.#170       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.refreshEndTime:()V
  #170 = NameAndType        #171:#6       // refreshEndTime:()V
  #171 = Utf8               refreshEndTime
  #172 = Methodref          #8.#173       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.dbSave:()V
  #173 = NameAndType        #174:#6       // dbSave:()V
  #174 = Utf8               dbSave
  #175 = Long               60000l
  #177 = InvokeDynamic      #2:#178       // #2:makeConcatWithConstants:(IIJ)Ljava/lang/String;
  #178 = NameAndType        #46:#179      // makeConcatWithConstants:(IIJ)Ljava/lang/String;
  #179 = Utf8               (IIJ)Ljava/lang/String;
  #180 = Methodref          #8.#181       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.removeFunction:()V
  #181 = NameAndType        #182:#6       // removeFunction:()V
  #182 = Utf8               removeFunction
  #183 = Methodref          #184.#185     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #184 = Class              #186          // ext/mods/gameserver/data/sql/ClanTable
  #185 = NameAndType        #187:#188     // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #186 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #187 = Utf8               getInstance
  #188 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #189 = Methodref          #31.#190      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
  #190 = NameAndType        #191:#43      // getOwnerId:()I
  #191 = Utf8               getOwnerId
  #192 = Methodref          #184.#193     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #193 = NameAndType        #194:#195     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #194 = Utf8               getClan
  #195 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #196 = Methodref          #197.#198     // ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #197 = Class              #199          // ext/mods/gameserver/model/pledge/Clan
  #198 = NameAndType        #200:#201     // getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #199 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #200 = Utf8               getWarehouse
  #201 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #202 = Methodref          #203.#204     // ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
  #203 = Class              #205          // ext/mods/gameserver/model/itemcontainer/ItemContainer
  #204 = NameAndType        #206:#43      // getAdena:()I
  #205 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
  #206 = Utf8               getAdena
  #207 = Methodref          #203.#208     // ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #208 = NameAndType        #209:#210     // destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #209 = Utf8               destroyItemByItemId
  #210 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #211 = Methodref          #212.#213     // java/lang/Class.getName:()Ljava/lang/String;
  #212 = Class              #214          // java/lang/Class
  #213 = NameAndType        #215:#216     // getName:()Ljava/lang/String;
  #214 = Utf8               java/lang/Class
  #215 = Utf8               getName
  #216 = Utf8               ()Ljava/lang/String;
  #217 = Methodref          #49.#218      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #218 = NameAndType        #5:#219       // "<init>":(Ljava/lang/String;)V
  #219 = Utf8               (Ljava/lang/String;)V
  #220 = Utf8               UPDATE_FUNCTION
  #221 = Utf8               Ljava/lang/String;
  #222 = Utf8               ConstantValue
  #223 = Utf8               DELETE_FUNCTION
  #224 = Utf8               Signature
  #225 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #226 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;IIIJJ)V
  #227 = Utf8               Code
  #228 = Utf8               LineNumberTable
  #229 = Utf8               LocalVariableTable
  #230 = Utf8               this
  #231 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
  #232 = Utf8               ch
  #233 = Utf8               type
  #234 = Utf8               lvl
  #235 = Utf8               fee
  #236 = Utf8               rate
  #237 = Utf8               endDate
  #238 = Utf8               currentTime
  #239 = Utf8               StackMapTable
  #240 = Utf8               getFuncLvl
  #241 = Utf8               funcLevel
  #242 = Utf8               ps
  #243 = Utf8               Ljava/sql/PreparedStatement;
  #244 = Utf8               con
  #245 = Utf8               Ljava/sql/Connection;
  #246 = Utf8               e
  #247 = Utf8               Ljava/lang/Exception;
  #248 = Utf8               refreshFunction
  #249 = Utf8               payFunctionFee
  #250 = Utf8               clan
  #251 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #252 = Utf8               <clinit>
  #253 = Utf8               SourceFile
  #254 = Utf8               ClanHallFunction.java
  #255 = Utf8               BootstrapMethods
  #256 = String             #257          // ClanHall: Hall ID \u0001 has an invalid rate (\u0001ms) for function type \u0001. Task cancelled to prevent DB spam.
  #257 = Utf8               ClanHall: Hall ID \u0001 has an invalid rate (\u0001ms) for function type \u0001. Task cancelled to prevent DB spam.
  #258 = MethodType         #6            //  ()V
  #259 = MethodHandle       5:#260        // REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.payFunctionFee:()V
  #260 = Methodref          #8.#261       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.payFunctionFee:()V
  #261 = NameAndType        #249:#6       // payFunctionFee:()V
  #262 = String             #263          // ClanHall: Hall ID \u0001 function type \u0001 has extremely low rate (\u0001ms). Removing function to stop DB spam.
  #263 = Utf8               ClanHall: Hall ID \u0001 function type \u0001 has extremely low rate (\u0001ms). Removing function to stop DB spam.
  #264 = MethodHandle       6:#265        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #265 = Methodref          #266.#267     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #266 = Class              #268          // java/lang/invoke/StringConcatFactory
  #267 = NameAndType        #46:#269      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #268 = Utf8               java/lang/invoke/StringConcatFactory
  #269 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #270 = MethodHandle       6:#271        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #271 = Methodref          #272.#273     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #272 = Class              #274          // java/lang/invoke/LambdaMetafactory
  #273 = NameAndType        #275:#276     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #274 = Utf8               java/lang/invoke/LambdaMetafactory
  #275 = Utf8               metafactory
  #276 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #277 = Utf8               InnerClasses
  #278 = Class              #279          // java/lang/invoke/MethodHandles$Lookup
  #279 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #280 = Class              #281          // java/lang/invoke/MethodHandles
  #281 = Utf8               java/lang/invoke/MethodHandles
  #282 = Utf8               Lookup
{
  public ext.mods.gameserver.model.residence.clanhall.ClanHallFunction(ext.mods.gameserver.model.residence.clanhall.ClanHall, int, int, int, long, long);
    descriptor: (Lext/mods/gameserver/model/residence/clanhall/ClanHall;IIIJJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _type:I
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field _lvl:I
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field _fee:I
        25: aload_0
        26: lload         5
        28: putfield      #23                 // Field _rate:J
        31: aload_0
        32: lload         7
        34: putfield      #27                 // Field _endDate:J
        37: aload_0
        38: getfield      #7                  // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        41: invokevirtual #30                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.isFree:()Z
        44: ifeq          48
        47: return
        48: aload_0
        49: getfield      #23                 // Field _rate:J
        52: lconst_0
        53: lcmp
        54: ifgt          84
        57: getstatic     #36                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        60: aload_0
        61: getfield      #7                  // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        64: invokevirtual #40                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
        67: aload_0
        68: getfield      #23                 // Field _rate:J
        71: aload_0
        72: getfield      #13                 // Field _type:I
        75: invokedynamic #44,  0             // InvokeDynamic #0:makeConcatWithConstants:(IJI)Ljava/lang/String;
        80: invokevirtual #48                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        83: return
        84: invokestatic  #54                 // Method java/lang/System.currentTimeMillis:()J
        87: lstore        9
        89: aload_0
        90: getfield      #27                 // Field _endDate:J
        93: lload         9
        95: lcmp
        96: ifle          122
        99: aload_0
       100: aload_0
       101: invokedynamic #60,  0             // InvokeDynamic #1:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;)Ljava/lang/Runnable;
       106: aload_0
       107: getfield      #27                 // Field _endDate:J
       110: lload         9
       112: lsub
       113: invokestatic  #64                 // Method ext/mods/commons/pool/ThreadPool.scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       116: putfield      #70                 // Field _feeTask:Ljava/util/concurrent/ScheduledFuture;
       119: goto          131
       122: aload_0
       123: invokedynamic #60,  0             // InvokeDynamic #1:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;)Ljava/lang/Runnable;
       128: invokestatic  #74                 // Method ext/mods/commons/pool/ThreadPool.executeIO:(Ljava/lang/Runnable;)V
       131: return
      LineNumberTable:
        line 72: 0
        line 73: 4
        line 74: 9
        line 75: 14
        line 76: 19
        line 77: 25
        line 78: 31
        line 80: 37
        line 81: 47
        line 83: 48
        line 85: 57
        line 86: 83
        line 89: 84
        line 90: 89
        line 91: 99
        line 93: 122
        line 94: 131
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     132     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
            0     132     1    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
            0     132     2  type   I
            0     132     3   lvl   I
            0     132     4   fee   I
            0     132     5  rate   J
            0     132     7 endDate   J
           89      43     9 currentTime   J
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHall, int, int, int, long, long ]
          stack = []
        frame_type = 35 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ long ]
        frame_type = 8 /* same */

  public int getType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _type:I
         4: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;

  public int getLvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _lvl:I
         4: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;

  public int getFuncLvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #13                 // Field _type:I
         6: tableswitch   { // 1 to 12

                       1: 68

                       2: 79

                       3: 97

                       4: 79

                       5: 89

                       6: 97

                       7: 89

                       8: 97

                       9: 89

                      10: 97

                      11: 89

                      12: 89
                 default: 97
            }
        68: aload_0
        69: getfield      #17                 // Field _lvl:I
        72: bipush        20
        74: idiv
        75: istore_1
        76: goto          99
        79: aload_0
        80: getfield      #17                 // Field _lvl:I
        83: iconst_5
        84: idiv
        85: istore_1
        86: goto          99
        89: aload_0
        90: getfield      #17                 // Field _lvl:I
        93: istore_1
        94: goto          99
        97: iconst_0
        98: ireturn
        99: aload_0
       100: getfield      #7                  // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       103: instanceof    #78                 // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       106: ifeq          116
       109: iload_1
       110: ifle          116
       113: iinc          1, 10
       116: iload_1
       117: ireturn
      LineNumberTable:
        line 108: 0
        line 110: 2
        line 113: 68
        line 114: 76
        line 116: 79
        line 117: 86
        line 119: 89
        line 120: 94
        line 122: 97
        line 125: 99
        line 126: 113
        line 128: 116
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     118     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
            2     116     1 funcLevel   I
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 68
          locals = [ int ]
        frame_type = 10 /* same */
        frame_type = 9 /* same */
        frame_type = 7 /* same */
        frame_type = 1 /* same */
        frame_type = 16 /* same */

  public int getLease();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _fee:I
         4: ireturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;

  public long getRate();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _rate:J
         4: lreturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;

  public long getEndTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _endDate:J
         4: lreturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;

  public void refreshEndTime();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #54                 // Method java/lang/System.currentTimeMillis:()J
         4: aload_0
         5: invokevirtual #80                 // Method getRate:()J
         8: ladd
         9: putfield      #27                 // Field _endDate:J
        12: return
      LineNumberTable:
        line 148: 0
        line 149: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;

  public void stopFeeTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #70                 // Field _feeTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #70                 // Field _feeTask:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #83,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #70                 // Field _feeTask:Ljava/util/concurrent/ScheduledFuture;
        23: return
      LineNumberTable:
        line 156: 0
        line 158: 7
        line 159: 18
        line 161: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void dbSave();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: invokestatic  #89                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #95                 // String REPLACE INTO clanhall_functions (hall_id, type, lvl, lease, rate, endTime) VALUES (?,?,?,?,?,?)
         7: invokeinterface #97,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: getfield      #7                  // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        19: invokevirtual #40                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
        22: invokeinterface #103,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        27: aload_2
        28: iconst_2
        29: aload_0
        30: invokevirtual #109                // Method getType:()I
        33: invokeinterface #103,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        38: aload_2
        39: iconst_3
        40: aload_0
        41: invokevirtual #112                // Method getLvl:()I
        44: invokeinterface #103,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        49: aload_2
        50: iconst_4
        51: aload_0
        52: invokevirtual #115                // Method getLease:()I
        55: invokeinterface #103,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        60: aload_2
        61: iconst_5
        62: aload_0
        63: invokevirtual #80                 // Method getRate:()J
        66: invokeinterface #118,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        71: aload_2
        72: bipush        6
        74: aload_0
        75: invokevirtual #122                // Method getEndTime:()J
        78: invokeinterface #118,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        83: aload_2
        84: invokeinterface #125,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        89: pop
        90: aload_2
        91: ifnull        127
        94: aload_2
        95: invokeinterface #128,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       100: goto          127
       103: astore_3
       104: aload_2
       105: ifnull        125
       108: aload_2
       109: invokeinterface #128,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       114: goto          125
       117: astore        4
       119: aload_3
       120: aload         4
       122: invokevirtual #133                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       125: aload_3
       126: athrow
       127: aload_1
       128: ifnull        162
       131: aload_1
       132: invokeinterface #137,  1          // InterfaceMethod java/sql/Connection.close:()V
       137: goto          162
       140: astore_2
       141: aload_1
       142: ifnull        160
       145: aload_1
       146: invokeinterface #137,  1          // InterfaceMethod java/sql/Connection.close:()V
       151: goto          160
       154: astore_3
       155: aload_2
       156: aload_3
       157: invokevirtual #133                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       160: aload_2
       161: athrow
       162: goto          175
       165: astore_1
       166: getstatic     #36                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       169: ldc           #140                // String Couldn\'t save clan hall function.
       171: aload_1
       172: invokevirtual #142                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       175: return
      Exception table:
         from    to  target type
            13    90   103   Class java/lang/Throwable
           108   114   117   Class java/lang/Throwable
             4   127   140   Class java/lang/Throwable
           145   151   154   Class java/lang/Throwable
             0   162   165   Class java/lang/Exception
      LineNumberTable:
        line 168: 0
        line 169: 4
        line 171: 13
        line 172: 27
        line 173: 38
        line 174: 49
        line 175: 60
        line 176: 71
        line 177: 83
        line 178: 90
        line 168: 103
        line 178: 127
        line 168: 140
        line 182: 162
        line 179: 165
        line 181: 166
        line 183: 175
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13     114     2    ps   Ljava/sql/PreparedStatement;
            4     158     1   con   Ljava/sql/Connection;
          166       9     1     e   Ljava/lang/Exception;
            0     176     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 103
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void removeFunction();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #146                // Method stopFeeTask:()V
         4: aload_0
         5: getfield      #7                  // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         8: invokevirtual #149                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunctions:()Ljava/util/Map;
        11: aload_0
        12: invokevirtual #109                // Method getType:()I
        15: invokestatic  #153                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        18: invokeinterface #159,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        23: pop
        24: invokestatic  #89                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        27: astore_1
        28: aload_1
        29: ldc           #165                // String DELETE FROM clanhall_functions WHERE hall_id=? AND type=?
        31: invokeinterface #97,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        36: astore_2
        37: aload_2
        38: iconst_1
        39: aload_0
        40: getfield      #7                  // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        43: invokevirtual #40                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
        46: invokeinterface #103,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        51: aload_2
        52: iconst_2
        53: aload_0
        54: invokevirtual #109                // Method getType:()I
        57: invokeinterface #103,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        62: aload_2
        63: invokeinterface #125,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        68: pop
        69: aload_2
        70: ifnull        106
        73: aload_2
        74: invokeinterface #128,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        79: goto          106
        82: astore_3
        83: aload_2
        84: ifnull        104
        87: aload_2
        88: invokeinterface #128,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        93: goto          104
        96: astore        4
        98: aload_3
        99: aload         4
       101: invokevirtual #133                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       104: aload_3
       105: athrow
       106: aload_1
       107: ifnull        141
       110: aload_1
       111: invokeinterface #137,  1          // InterfaceMethod java/sql/Connection.close:()V
       116: goto          141
       119: astore_2
       120: aload_1
       121: ifnull        139
       124: aload_1
       125: invokeinterface #137,  1          // InterfaceMethod java/sql/Connection.close:()V
       130: goto          139
       133: astore_3
       134: aload_2
       135: aload_3
       136: invokevirtual #133                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       139: aload_2
       140: athrow
       141: goto          154
       144: astore_1
       145: getstatic     #36                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       148: ldc           #167                // String Couldn\'t remove clan hall function.
       150: aload_1
       151: invokevirtual #142                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       154: return
      Exception table:
         from    to  target type
            37    69    82   Class java/lang/Throwable
            87    93    96   Class java/lang/Throwable
            28   106   119   Class java/lang/Throwable
           124   130   133   Class java/lang/Throwable
            24   141   144   Class java/lang/Exception
      LineNumberTable:
        line 190: 0
        line 192: 4
        line 194: 24
        line 195: 28
        line 197: 37
        line 198: 51
        line 199: 62
        line 200: 69
        line 194: 82
        line 200: 106
        line 194: 119
        line 204: 141
        line 201: 144
        line 203: 145
        line 205: 154
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      69     2    ps   Ljava/sql/PreparedStatement;
           28     113     1   con   Ljava/sql/Connection;
          145       9     1     e   Ljava/lang/Exception;
            0     155     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 82
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void refreshFunction(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #146                // Method stopFeeTask:()V
         4: aload_0
         5: iload_1
         6: putfield      #20                 // Field _fee:I
         9: aload_0
        10: iload_2
        11: putfield      #17                 // Field _lvl:I
        14: aload_0
        15: invokevirtual #169                // Method refreshEndTime:()V
        18: aload_0
        19: invokevirtual #172                // Method dbSave:()V
        22: aload_0
        23: getfield      #23                 // Field _rate:J
        26: lconst_0
        27: lcmp
        28: ifle          48
        31: aload_0
        32: aload_0
        33: invokedynamic #60,  0             // InvokeDynamic #1:run:(Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;)Ljava/lang/Runnable;
        38: aload_0
        39: invokevirtual #80                 // Method getRate:()J
        42: invokestatic  #64                 // Method ext/mods/commons/pool/ThreadPool.scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        45: putfield      #70                 // Field _feeTask:Ljava/util/concurrent/ScheduledFuture;
        48: return
      LineNumberTable:
        line 214: 0
        line 216: 4
        line 217: 9
        line 218: 14
        line 220: 18
        line 222: 22
        line 224: 31
        line 226: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
            0      49     1   fee   I
            0      49     2   lvl   I
      StackMapTable: number_of_entries = 1
        frame_type = 48 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #49                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
         6: invokevirtual #211                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #217                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #36                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 57: 0
}
SourceFile: "ClanHallFunction.java"
BootstrapMethods:
  0: #264 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #256 ClanHall: Hall ID \u0001 has an invalid rate (\u0001ms) for function type \u0001. Task cancelled to prevent DB spam.
  1: #270 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #258 ()V
      #259 REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.payFunctionFee:()V
      #258 ()V
  2: #264 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #262 ClanHall: Hall ID \u0001 function type \u0001 has extremely low rate (\u0001ms). Removing function to stop DB spam.
InnerClasses:
  public static final #282= #278 of #280; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
