// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminPremium
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminPremium.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.class
  Last modified 9 de jul de 2026; size 6561 bytes
  MD5 checksum e71aef71b69790bd37dcb66c0630681a
  Compiled from "AdminPremium.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminPremium implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #46                         // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.USE_PREMIUM_SERVICE:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // USE_PREMIUM_SERVICE:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               USE_PREMIUM_SERVICE
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Player
   #15 = NameAndType        #17:#18       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #16 = Utf8               ext/mods/gameserver/model/actor/Player
   #17 = Utf8               getSysString
   #18 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #20 = NameAndType        #21:#22       // sendMessage:(Ljava/lang/String;)V
   #21 = Utf8               sendMessage
   #22 = Utf8               (Ljava/lang/String;)V
   #23 = Class              #24           // java/util/StringTokenizer
   #24 = Utf8               java/util/StringTokenizer
   #25 = Methodref          #23.#26       // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #26 = NameAndType        #5:#22        // "<init>":(Ljava/lang/String;)V
   #27 = Methodref          #23.#28       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #28 = NameAndType        #29:#30       // nextToken:()Ljava/lang/String;
   #29 = Utf8               nextToken
   #30 = Utf8               ()Ljava/lang/String;
   #31 = String             #32           // admin_premium_menu
   #32 = Utf8               admin_premium_menu
   #33 = Methodref          #34.#35       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #34 = Class              #36           // java/lang/String
   #35 = NameAndType        #37:#38       // startsWith:(Ljava/lang/String;)Z
   #36 = Utf8               java/lang/String
   #37 = Utf8               startsWith
   #38 = Utf8               (Ljava/lang/String;)Z
   #39 = Methodref          #23.#40       // java/util/StringTokenizer.hasMoreTokens:()Z
   #40 = NameAndType        #41:#42       // hasMoreTokens:()Z
   #41 = Utf8               hasMoreTokens
   #42 = Utf8               ()Z
   #43 = String             #44           // premium_menu.htm
   #44 = Utf8               premium_menu.htm
   #45 = Methodref          #46.#47       // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #46 = Class              #48           // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium
   #47 = NameAndType        #49:#50       // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #48 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminPremium
   #49 = Utf8               sendFile
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #51 = Methodref          #46.#52       // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #52 = NameAndType        #53:#54       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #53 = Utf8               getTargetPlayer
   #54 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #55 = Methodref          #14.#56       // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
   #56 = NameAndType        #57:#30       // getAccountName:()Ljava/lang/String;
   #57 = Utf8               getAccountName
   #58 = Methodref          #34.#59       // java/lang/String.hashCode:()I
   #59 = NameAndType        #60:#61       // hashCode:()I
   #60 = Utf8               hashCode
   #61 = Utf8               ()I
   #62 = String             #63           // add
   #63 = Utf8               add
   #64 = Methodref          #34.#65       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #65 = NameAndType        #66:#67       // equals:(Ljava/lang/Object;)Z
   #66 = Utf8               equals
   #67 = Utf8               (Ljava/lang/Object;)Z
   #68 = String             #69           // add2
   #69 = Utf8               add2
   #70 = String             #71           // add3
   #71 = Utf8               add3
   #72 = Methodref          #73.#74       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #73 = Class              #75           // java/lang/Integer
   #74 = NameAndType        #76:#77       // parseInt:(Ljava/lang/String;)I
   #75 = Utf8               java/lang/Integer
   #76 = Utf8               parseInt
   #77 = Utf8               (Ljava/lang/String;)I
   #78 = Methodref          #46.#79       // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.addPremiumServices:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #79 = NameAndType        #80:#81       // addPremiumServices:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #80 = Utf8               addPremiumServices
   #81 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #82 = Class              #83           // java/lang/NumberFormatException
   #83 = Utf8               java/lang/NumberFormatException
   #84 = Methodref          #46.#85       // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.addPremiumServices2:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #85 = NameAndType        #86:#81       // addPremiumServices2:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #86 = Utf8               addPremiumServices2
   #87 = Methodref          #46.#88       // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.addPremiumServices3:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #88 = NameAndType        #89:#81       // addPremiumServices3:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #89 = Utf8               addPremiumServices3
   #90 = String             #91           // admin_premium_remove
   #91 = Utf8               admin_premium_remove
   #92 = Methodref          #46.#93       // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.removePremiumServices:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #93 = NameAndType        #94:#50       // removePremiumServices:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #94 = Utf8               removePremiumServices
   #95 = Methodref          #96.#97       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #96 = Class              #98           // ext/mods/commons/pool/ConnectionPool
   #97 = NameAndType        #99:#100      // getConnection:()Ljava/sql/Connection;
   #98 = Utf8               ext/mods/commons/pool/ConnectionPool
   #99 = Utf8               getConnection
  #100 = Utf8               ()Ljava/sql/Connection;
  #101 = String             #102          // REPLACE INTO account_premium (premium_service,enddate,account_name) values(?,?,?)
  #102 = Utf8               REPLACE INTO account_premium (premium_service,enddate,account_name) values(?,?,?)
  #103 = InterfaceMethodref #104.#105     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #104 = Class              #106          // java/sql/Connection
  #105 = NameAndType        #107:#108     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #106 = Utf8               java/sql/Connection
  #107 = Utf8               prepareStatement
  #108 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #109 = Methodref          #110.#111     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #110 = Class              #112          // java/util/Calendar
  #111 = NameAndType        #113:#114     // getInstance:()Ljava/util/Calendar;
  #112 = Utf8               java/util/Calendar
  #113 = Utf8               getInstance
  #114 = Utf8               ()Ljava/util/Calendar;
  #115 = Methodref          #110.#116     // java/util/Calendar.add:(II)V
  #116 = NameAndType        #63:#117      // add:(II)V
  #117 = Utf8               (II)V
  #118 = InterfaceMethodref #119.#120     // java/sql/PreparedStatement.setInt:(II)V
  #119 = Class              #121          // java/sql/PreparedStatement
  #120 = NameAndType        #122:#117     // setInt:(II)V
  #121 = Utf8               java/sql/PreparedStatement
  #122 = Utf8               setInt
  #123 = Methodref          #110.#124     // java/util/Calendar.getTimeInMillis:()J
  #124 = NameAndType        #125:#126     // getTimeInMillis:()J
  #125 = Utf8               getTimeInMillis
  #126 = Utf8               ()J
  #127 = InterfaceMethodref #119.#128     // java/sql/PreparedStatement.setLong:(IJ)V
  #128 = NameAndType        #129:#130     // setLong:(IJ)V
  #129 = Utf8               setLong
  #130 = Utf8               (IJ)V
  #131 = InterfaceMethodref #119.#132     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #132 = NameAndType        #133:#134     // setString:(ILjava/lang/String;)V
  #133 = Utf8               setString
  #134 = Utf8               (ILjava/lang/String;)V
  #135 = InterfaceMethodref #119.#136     // java/sql/PreparedStatement.execute:()Z
  #136 = NameAndType        #137:#42      // execute:()Z
  #137 = Utf8               execute
  #138 = Methodref          #139.#140     // ext/mods/gameserver/taskmanager/PremiumTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
  #139 = Class              #141          // ext/mods/gameserver/taskmanager/PremiumTaskManager
  #140 = NameAndType        #113:#142     // getInstance:()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
  #141 = Utf8               ext/mods/gameserver/taskmanager/PremiumTaskManager
  #142 = Utf8               ()Lext/mods/gameserver/taskmanager/PremiumTaskManager;
  #143 = Methodref          #139.#144     // ext/mods/gameserver/taskmanager/PremiumTaskManager.add:(Lext/mods/gameserver/model/actor/Player;)V
  #144 = NameAndType        #63:#145      // add:(Lext/mods/gameserver/model/actor/Player;)V
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #146 = Methodref          #110.#147     // java/util/Calendar.getTime:()Ljava/util/Date;
  #147 = NameAndType        #148:#149     // getTime:()Ljava/util/Date;
  #148 = Utf8               getTime
  #149 = Utf8               ()Ljava/util/Date;
  #150 = InterfaceMethodref #119.#151     // java/sql/PreparedStatement.close:()V
  #151 = NameAndType        #152:#6       // close:()V
  #152 = Utf8               close
  #153 = Class              #154          // java/lang/Throwable
  #154 = Utf8               java/lang/Throwable
  #155 = Methodref          #153.#156     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #156 = NameAndType        #157:#158     // addSuppressed:(Ljava/lang/Throwable;)V
  #157 = Utf8               addSuppressed
  #158 = Utf8               (Ljava/lang/Throwable;)V
  #159 = InterfaceMethodref #104.#151     // java/sql/Connection.close:()V
  #160 = Class              #161          // java/sql/SQLException
  #161 = Utf8               java/sql/SQLException
  #162 = Fieldref           #46.#163      // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.LOGGER:Lext/mods/commons/logging/CLogger;
  #163 = NameAndType        #164:#165     // LOGGER:Lext/mods/commons/logging/CLogger;
  #164 = Utf8               LOGGER
  #165 = Utf8               Lext/mods/commons/logging/CLogger;
  #166 = Methodref          #167.#168     // java/lang/Class.getName:()Ljava/lang/String;
  #167 = Class              #169          // java/lang/Class
  #168 = NameAndType        #170:#30      // getName:()Ljava/lang/String;
  #169 = Utf8               java/lang/Class
  #170 = Utf8               getName
  #171 = Methodref          #34.#172      // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #172 = NameAndType        #173:#174     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #173 = Utf8               valueOf
  #174 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #175 = InvokeDynamic      #0:#176       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #176 = NameAndType        #177:#178     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #177 = Utf8               makeConcatWithConstants
  #178 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #179 = Methodref          #180.#181     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #180 = Class              #182          // ext/mods/commons/logging/CLogger
  #181 = NameAndType        #183:#184     // warn:(Ljava/lang/Object;)V
  #182 = Utf8               ext/mods/commons/logging/CLogger
  #183 = Utf8               warn
  #184 = Utf8               (Ljava/lang/Object;)V
  #185 = Methodref          #46.#186      // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.addPremiumServices:(Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;)V
  #186 = NameAndType        #80:#187      // addPremiumServices:(Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;)V
  #187 = Utf8               (Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;)V
  #188 = String             #189          // DELETE FROM account_premium WHERE account_name=?
  #189 = Utf8               DELETE FROM account_premium WHERE account_name=?
  #190 = InvokeDynamic      #1:#191       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #191 = NameAndType        #177:#192     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #192 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #193 = InvokeDynamic      #2:#176       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #194 = Fieldref           #46.#195      // ext/mods/gameserver/handler/admincommandhandlers/AdminPremium.ADMIN_COMMANDS:[Ljava/lang/String;
  #195 = NameAndType        #196:#197     // ADMIN_COMMANDS:[Ljava/lang/String;
  #196 = Utf8               ADMIN_COMMANDS
  #197 = Utf8               [Ljava/lang/String;
  #198 = Methodref          #180.#26      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #199 = Class              #200          // ext/mods/gameserver/handler/IAdminCommandHandler
  #200 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #201 = Utf8               UPDATE_PREMIUMSERVICE
  #202 = Utf8               Ljava/lang/String;
  #203 = Utf8               ConstantValue
  #204 = Utf8               DELETE_PREMIUMSERVICE
  #205 = Utf8               Code
  #206 = Utf8               LineNumberTable
  #207 = Utf8               LocalVariableTable
  #208 = Utf8               this
  #209 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminPremium;
  #210 = Utf8               useAdminCommand
  #211 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #212 = Utf8               month
  #213 = Utf8               I
  #214 = Utf8               e
  #215 = Utf8               Ljava/lang/NumberFormatException;
  #216 = Utf8               dayOfmonth
  #217 = Utf8               hourOfDay
  #218 = Utf8               action
  #219 = Utf8               targetPlayer
  #220 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #221 = Utf8               accName
  #222 = Utf8               command
  #223 = Utf8               player
  #224 = Utf8               st
  #225 = Utf8               Ljava/util/StringTokenizer;
  #226 = Utf8               StackMapTable
  #227 = Utf8               finishtime
  #228 = Utf8               Ljava/util/Calendar;
  #229 = Utf8               statement
  #230 = Utf8               Ljava/sql/PreparedStatement;
  #231 = Utf8               con
  #232 = Utf8               Ljava/sql/Connection;
  #233 = Utf8               Ljava/sql/SQLException;
  #234 = Utf8               field
  #235 = Utf8               value
  #236 = Utf8               dayOfMonth
  #237 = Utf8               getAdminCommandList
  #238 = Utf8               ()[Ljava/lang/String;
  #239 = Utf8               <clinit>
  #240 = Utf8               SourceFile
  #241 = Utf8               AdminPremium.java
  #242 = Utf8               BootstrapMethods
  #243 = String             #244          // \u0001 Could not add premium services:\u0001
  #244 = Utf8               \u0001 Could not add premium services:\u0001
  #245 = String             #246          // The premium has been remove for account: \u0001
  #246 = Utf8               The premium has been remove for account: \u0001
  #247 = String             #248          // \u0001 Could not remove premium services:\u0001
  #248 = Utf8               \u0001 Could not remove premium services:\u0001
  #249 = MethodHandle       6:#250        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #250 = Methodref          #251.#252     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #251 = Class              #253          // java/lang/invoke/StringConcatFactory
  #252 = NameAndType        #177:#254     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #253 = Utf8               java/lang/invoke/StringConcatFactory
  #254 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #255 = Utf8               InnerClasses
  #256 = Class              #257          // java/lang/invoke/MethodHandles$Lookup
  #257 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #258 = Class              #259          // java/lang/invoke/MethodHandles
  #259 = Utf8               java/lang/invoke/MethodHandles
  #260 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminPremium();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPremium;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=3
         0: getstatic     #7                  // Field ext/mods/Config.USE_PREMIUM_SERVICE:Z
         3: ifne          22
         6: aload_2
         7: aload_2
         8: sipush        10093
        11: iconst_0
        12: anewarray     #2                  // class java/lang/Object
        15: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        18: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        21: return
        22: new           #23                 // class java/util/StringTokenizer
        25: dup
        26: aload_1
        27: invokespecial #25                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
        30: astore_3
        31: aload_3
        32: invokevirtual #27                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        35: pop
        36: aload_1
        37: ldc           #31                 // String admin_premium_menu
        39: invokevirtual #33                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        42: ifeq          443
        45: aload_3
        46: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        49: ifne          60
        52: aload_0
        53: aload_2
        54: ldc           #43                 // String premium_menu.htm
        56: invokevirtual #45                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        59: return
        60: aload_3
        61: invokevirtual #27                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        64: astore        4
        66: aload_0
        67: aload_2
        68: iconst_1
        69: invokevirtual #51                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
        72: astore        5
        74: aload         5
        76: ifnull        87
        79: aload         5
        81: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
        84: goto          102
        87: aload_3
        88: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        91: ifeq          101
        94: aload_3
        95: invokevirtual #27                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        98: goto          102
       101: aconst_null
       102: astore        6
       104: aload         6
       106: ifnonnull     125
       109: aload_2
       110: aload_2
       111: sipush        10094
       114: iconst_0
       115: anewarray     #2                  // class java/lang/Object
       118: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       121: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       124: return
       125: aload         4
       127: astore        7
       129: iconst_m1
       130: istore        8
       132: aload         7
       134: invokevirtual #58                 // Method java/lang/String.hashCode:()I
       137: lookupswitch  { // 3

                   96417: 172

                 2988977: 188

                 2988978: 204
                 default: 217
            }
       172: aload         7
       174: ldc           #62                 // String add
       176: invokevirtual #64                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       179: ifeq          217
       182: iconst_0
       183: istore        8
       185: goto          217
       188: aload         7
       190: ldc           #68                 // String add2
       192: invokevirtual #64                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       195: ifeq          217
       198: iconst_1
       199: istore        8
       201: goto          217
       204: aload         7
       206: ldc           #70                 // String add3
       208: invokevirtual #64                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       211: ifeq          217
       214: iconst_2
       215: istore        8
       217: iload         8
       219: tableswitch   { // 0 to 2

                       0: 244

                       1: 307

                       2: 370
                 default: 433
            }
       244: aload_3
       245: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       248: ifne          267
       251: aload_2
       252: aload_2
       253: sipush        10095
       256: iconst_0
       257: anewarray     #2                  // class java/lang/Object
       260: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       263: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       266: return
       267: aload_3
       268: invokevirtual #27                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       271: invokestatic  #72                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       274: istore        9
       276: aload_2
       277: iload         9
       279: aload         6
       281: invokestatic  #78                 // Method addPremiumServices:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       284: goto          440
       287: astore        9
       289: aload_2
       290: aload_2
       291: sipush        10095
       294: iconst_0
       295: anewarray     #2                  // class java/lang/Object
       298: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       301: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       304: goto          440
       307: aload_3
       308: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       311: ifne          330
       314: aload_2
       315: aload_2
       316: sipush        10096
       319: iconst_0
       320: anewarray     #2                  // class java/lang/Object
       323: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       326: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       329: return
       330: aload_3
       331: invokevirtual #27                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       334: invokestatic  #72                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       337: istore        9
       339: aload_2
       340: iload         9
       342: aload         6
       344: invokestatic  #84                 // Method addPremiumServices2:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       347: goto          440
       350: astore        9
       352: aload_2
       353: aload_2
       354: sipush        10096
       357: iconst_0
       358: anewarray     #2                  // class java/lang/Object
       361: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       364: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       367: goto          440
       370: aload_3
       371: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       374: ifne          393
       377: aload_2
       378: aload_2
       379: sipush        10097
       382: iconst_0
       383: anewarray     #2                  // class java/lang/Object
       386: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       389: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       392: return
       393: aload_3
       394: invokevirtual #27                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       397: invokestatic  #72                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       400: istore        9
       402: aload_2
       403: iload         9
       405: aload         6
       407: invokestatic  #87                 // Method addPremiumServices3:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       410: goto          440
       413: astore        9
       415: aload_2
       416: aload_2
       417: sipush        10097
       420: iconst_0
       421: anewarray     #2                  // class java/lang/Object
       424: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       427: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       430: goto          440
       433: aload_0
       434: aload_2
       435: ldc           #43                 // String premium_menu.htm
       437: invokevirtual #45                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       440: goto          496
       443: aload_1
       444: ldc           #90                 // String admin_premium_remove
       446: invokevirtual #33                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       449: ifeq          496
       452: aload_0
       453: aload_2
       454: iconst_1
       455: invokevirtual #51                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       458: astore        4
       460: aload         4
       462: ifnull        473
       465: aload         4
       467: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
       470: goto          488
       473: aload_3
       474: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       477: ifeq          487
       480: aload_3
       481: invokevirtual #27                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       484: goto          488
       487: aconst_null
       488: astore        5
       490: aload_2
       491: aload         5
       493: invokestatic  #92                 // Method removePremiumServices:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       496: return
      Exception table:
         from    to  target type
           244   266   287   Class java/lang/NumberFormatException
           267   284   287   Class java/lang/NumberFormatException
           307   329   350   Class java/lang/NumberFormatException
           330   347   350   Class java/lang/NumberFormatException
           370   392   413   Class java/lang/NumberFormatException
           393   410   413   Class java/lang/NumberFormatException
      LineNumberTable:
        line 50: 0
        line 52: 6
        line 53: 21
        line 56: 22
        line 57: 31
        line 59: 36
        line 61: 45
        line 63: 52
        line 64: 59
        line 67: 60
        line 69: 66
        line 70: 74
        line 72: 104
        line 74: 109
        line 75: 124
        line 78: 125
        line 83: 244
        line 85: 251
        line 86: 266
        line 88: 267
        line 89: 276
        line 94: 284
        line 91: 287
        line 93: 289
        line 95: 304
        line 99: 307
        line 101: 314
        line 102: 329
        line 104: 330
        line 105: 339
        line 110: 347
        line 107: 350
        line 109: 352
        line 111: 367
        line 115: 370
        line 117: 377
        line 118: 392
        line 120: 393
        line 121: 402
        line 126: 410
        line 123: 413
        line 125: 415
        line 127: 430
        line 131: 433
        line 134: 440
        line 135: 443
        line 137: 452
        line 138: 460
        line 139: 490
        line 141: 496
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          276       8     9 month   I
          289      15     9     e   Ljava/lang/NumberFormatException;
          339       8     9 dayOfmonth   I
          352      15     9     e   Ljava/lang/NumberFormatException;
          402       8     9 hourOfDay   I
          415      15     9     e   Ljava/lang/NumberFormatException;
           66     374     4 action   Ljava/lang/String;
           74     366     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          104     336     6 accName   Ljava/lang/String;
          460      36     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          490       6     5 accName   Ljava/lang/String;
            0     497     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPremium;
            0     497     1 command   Ljava/lang/String;
            0     497     2 player   Lext/mods/gameserver/model/actor/Player;
           31     466     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 26
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/util/StringTokenizer ]
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 46
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 22 /* same */
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 19 /* same */
        frame_type = 22 /* same */
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 19 /* same */
        frame_type = 22 /* same */
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 19 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPremium, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 7

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #194                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 199: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPremium;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #180                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #46                 // class ext/mods/gameserver/handler/admincommandhandlers/AdminPremium
         6: invokevirtual #166                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #198                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #162                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: iconst_2
        16: anewarray     #34                 // class java/lang/String
        19: dup
        20: iconst_0
        21: ldc           #31                 // String admin_premium_menu
        23: aastore
        24: dup
        25: iconst_1
        26: ldc           #90                 // String admin_premium_remove
        28: aastore
        29: putstatic     #194                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        32: return
      LineNumberTable:
        line 36: 0
        line 41: 15
}
SourceFile: "AdminPremium.java"
BootstrapMethods:
  0: #249 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #243 \u0001 Could not add premium services:\u0001
  1: #249 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #245 The premium has been remove for account: \u0001
  2: #249 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #247 \u0001 Could not remove premium services:\u0001
InnerClasses:
  public static final #260= #256 of #258; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
