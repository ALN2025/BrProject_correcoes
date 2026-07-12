// Bytecode for: ext.mods.gameserver.communitybbs.custom.ServiceBBSManager
// File: ext\mods\gameserver\communitybbs\custom\ServiceBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.class
  Last modified 9 de jul de 2026; size 6245 bytes
  MD5 checksum b1a2e6b652d76acf23a847ec189083d1
  Compiled from "ServiceBBSManager.java"
public class ext.mods.gameserver.communitybbs.custom.ServiceBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #59                         // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 7, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = Methodref          #19.#20       // java/lang/String.hashCode:()I
   #19 = Class              #21           // java/lang/String
   #20 = NameAndType        #22:#23       // hashCode:()I
   #21 = Utf8               java/lang/String
   #22 = Utf8               hashCode
   #23 = Utf8               ()I
   #24 = String             #25           // _bbsgetfav_add
   #25 = Utf8               _bbsgetfav_add
   #26 = Methodref          #19.#27       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #27 = NameAndType        #28:#29       // equals:(Ljava/lang/Object;)Z
   #28 = Utf8               equals
   #29 = Utf8               (Ljava/lang/Object;)Z
   #30 = String             #31           // _bbsgetfav_add;page
   #31 = Utf8               _bbsgetfav_add;page
   #32 = String             #33           // _bbsgetfav_add;nobles
   #33 = Utf8               _bbsgetfav_add;nobles
   #34 = String             #35           // _bbsgetfav_add;hero
   #35 = Utf8               _bbsgetfav_add;hero
   #36 = String             #37           // _bbsgetfav_add;setnamecolor
   #37 = Utf8               _bbsgetfav_add;setnamecolor
   #38 = String             #39           // _bbsgetfav_add;settitlecolor
   #39 = Utf8               _bbsgetfav_add;settitlecolor
   #40 = String             #41           // _bbsgetfav_add;setname
   #41 = Utf8               _bbsgetfav_add;setname
   #42 = String             #43           // _bbsgetfav_add;premium
   #43 = Utf8               _bbsgetfav_add;premium
   #44 = String             #45           // _bbsgetfav_add;gender
   #45 = Utf8               _bbsgetfav_add;gender
   #46 = String             #47           // _bbsgetfav_add;nullpk
   #47 = Utf8               _bbsgetfav_add;nullpk
   #48 = String             #49           // _bbsgetfav_add;clanlvl
   #49 = Utf8               _bbsgetfav_add;clanlvl
   #50 = String             #51           // _bbsgetfav_add;clanskill
   #51 = Utf8               _bbsgetfav_add;clanskill
   #52 = String             #53           // _bbsgetfav_add;clanrep
   #53 = Utf8               _bbsgetfav_add;clanrep
   #54 = String             #55           // _bbsgetfav_add;multisell
   #55 = Utf8               _bbsgetfav_add;multisell
   #56 = String             #57           // index
   #57 = Utf8               index
   #58 = Methodref          #59.#60       // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #59 = Class              #61           // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager
   #60 = NameAndType        #62:#63       // showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #61 = Utf8               ext/mods/gameserver/communitybbs/custom/ServiceBBSManager
   #62 = Utf8               showPage
   #63 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #64 = String             #65           // character
   #65 = Utf8               character
   #66 = Methodref          #59.#67       // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
   #67 = NameAndType        #68:#69       // scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
   #68 = Utf8               scanService
   #69 = Utf8               (Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
   #70 = Methodref          #59.#71       // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #71 = NameAndType        #72:#73       // checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #72 = Utf8               checkService
   #73 = Utf8               (Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #74 = Methodref          #75.#76       // ext/mods/gameserver/custom/data/DonateData.setNobless:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
   #75 = Class              #77           // ext/mods/gameserver/custom/data/DonateData
   #76 = NameAndType        #78:#79       // setNobless:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
   #77 = Utf8               ext/mods/gameserver/custom/data/DonateData
   #78 = Utf8               setNobless
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
   #80 = Methodref          #75.#81       // ext/mods/gameserver/custom/data/DonateData.setHero:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
   #81 = NameAndType        #82:#79       // setHero:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
   #82 = Utf8               setHero
   #83 = String             #84           // colorname
   #84 = Utf8               colorname
   #85 = Methodref          #7.#86        // java/util/StringTokenizer.hasMoreTokens:()Z
   #86 = NameAndType        #87:#88       // hasMoreTokens:()Z
   #87 = Utf8               hasMoreTokens
   #88 = Utf8               ()Z
   #89 = Methodref          #75.#90       // ext/mods/gameserver/custom/data/DonateData.setNameColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
   #90 = NameAndType        #91:#92       // setNameColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
   #91 = Utf8               setNameColor
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
   #93 = String             #94           // colortitle
   #94 = Utf8               colortitle
   #95 = Methodref          #75.#96       // ext/mods/gameserver/custom/data/DonateData.setTitleColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
   #96 = NameAndType        #97:#92       // setTitleColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
   #97 = Utf8               setTitleColor
   #98 = String             #99           // name
   #99 = Utf8               name
  #100 = Methodref          #75.#101      // ext/mods/gameserver/custom/data/DonateData.setName:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #101 = NameAndType        #102:#92      // setName:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #102 = Utf8               setName
  #103 = String             #104          // premium
  #104 = Utf8               premium
  #105 = Methodref          #75.#106      // ext/mods/gameserver/custom/data/DonateData.setPremium:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #106 = NameAndType        #107:#79      // setPremium:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #107 = Utf8               setPremium
  #108 = Methodref          #75.#109      // ext/mods/gameserver/custom/data/DonateData.setGender:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #109 = NameAndType        #110:#79      // setGender:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #110 = Utf8               setGender
  #111 = Methodref          #75.#112      // ext/mods/gameserver/custom/data/DonateData.clearPK:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #112 = NameAndType        #113:#79      // clearPK:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #113 = Utf8               clearPK
  #114 = String             #115          // clan
  #115 = Utf8               clan
  #116 = Methodref          #75.#117      // ext/mods/gameserver/custom/data/DonateData.setClanLevel:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #117 = NameAndType        #118:#79      // setClanLevel:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #118 = Utf8               setClanLevel
  #119 = Methodref          #75.#120      // ext/mods/gameserver/custom/data/DonateData.addClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #120 = NameAndType        #121:#79      // addClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #121 = Utf8               addClanSkill
  #122 = Methodref          #75.#123      // ext/mods/gameserver/custom/data/DonateData.addClanRep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #123 = NameAndType        #124:#79      // addClanRep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #124 = Utf8               addClanRep
  #125 = Methodref          #19.#126      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #126 = NameAndType        #127:#128     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #127 = Utf8               split
  #128 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #129 = Methodref          #130.#131     // ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #130 = Class              #132          // ext/mods/gameserver/data/xml/MultisellData
  #131 = NameAndType        #133:#134     // getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #132 = Utf8               ext/mods/gameserver/data/xml/MultisellData
  #133 = Utf8               getInstance
  #134 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
  #135 = Methodref          #130.#136     // ext/mods/gameserver/data/xml/MultisellData.separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #136 = NameAndType        #137:#138     // separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #137 = Utf8               separateAndSendCb
  #138 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #139 = Methodref          #140.#141     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #140 = Class              #142          // ext/mods/gameserver/data/HTMLData
  #141 = NameAndType        #133:#143     // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #142 = Utf8               ext/mods/gameserver/data/HTMLData
  #143 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #145 = Class              #147          // ext/mods/gameserver/model/actor/Player
  #146 = NameAndType        #148:#149     // getLocale:()Ljava/util/Locale;
  #147 = Utf8               ext/mods/gameserver/model/actor/Player
  #148 = Utf8               getLocale
  #149 = Utf8               ()Ljava/util/Locale;
  #150 = Methodref          #59.#151      // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.getFolder:()Ljava/lang/String;
  #151 = NameAndType        #152:#17      // getFolder:()Ljava/lang/String;
  #152 = Utf8               getFolder
  #153 = InvokeDynamic      #0:#154       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #154 = NameAndType        #155:#156     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #155 = Utf8               makeConcatWithConstants
  #156 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #157 = Methodref          #140.#158     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #158 = NameAndType        #159:#160     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #159 = Utf8               getHtm
  #160 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #161 = String             #162          // %name%
  #162 = Utf8               %name%
  #163 = Methodref          #145.#164     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #164 = NameAndType        #165:#17      // getName:()Ljava/lang/String;
  #165 = Utf8               getName
  #166 = Methodref          #19.#167      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #167 = NameAndType        #168:#169     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #168 = Utf8               replace
  #169 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #170 = Methodref          #59.#171      // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #171 = NameAndType        #172:#63      // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #172 = Utf8               separateAndSend
  #173 = Methodref          #75.#174      // ext/mods/gameserver/custom/data/DonateData.getInstance:()Lext/mods/gameserver/custom/data/DonateData;
  #174 = NameAndType        #133:#175     // getInstance:()Lext/mods/gameserver/custom/data/DonateData;
  #175 = Utf8               ()Lext/mods/gameserver/custom/data/DonateData;
  #176 = Methodref          #177.#178     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #177 = Class              #179          // java/lang/Integer
  #178 = NameAndType        #180:#181     // parseInt:(Ljava/lang/String;)I
  #179 = Utf8               java/lang/Integer
  #180 = Utf8               parseInt
  #181 = Utf8               (Ljava/lang/String;)I
  #182 = Methodref          #75.#183      // ext/mods/gameserver/custom/data/DonateData.getDonate:(I)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #183 = NameAndType        #184:#185     // getDonate:(I)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #184 = Utf8               getDonate
  #185 = Utf8               (I)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #186 = Fieldref           #59.#187      // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #187 = NameAndType        #188:#189     // LOGGER:Lext/mods/commons/logging/CLogger;
  #188 = Utf8               LOGGER
  #189 = Utf8               Lext/mods/commons/logging/CLogger;
  #190 = String             #191          // pc[{}] use missing service[{}]
  #191 = Utf8               pc[{}] use missing service[{}]
  #192 = Class              #193          // java/lang/Object
  #193 = Utf8               java/lang/Object
  #194 = Methodref          #195.#196     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #195 = Class              #197          // ext/mods/commons/logging/CLogger
  #196 = NameAndType        #198:#199     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #197 = Utf8               ext/mods/commons/logging/CLogger
  #198 = Utf8               info
  #199 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #200 = String             #201          // custom/donate/
  #201 = Utf8               custom/donate/
  #202 = Fieldref           #203.#204     // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
  #203 = Class              #205          // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager$SingletonHolder
  #204 = NameAndType        #206:#207     // INSTANCE:Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
  #205 = Utf8               ext/mods/gameserver/communitybbs/custom/ServiceBBSManager$SingletonHolder
  #206 = Utf8               INSTANCE
  #207 = Utf8               Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
  #208 = Utf8               Code
  #209 = Utf8               LineNumberTable
  #210 = Utf8               LocalVariableTable
  #211 = Utf8               this
  #212 = Utf8               parseCmd
  #213 = Utf8               page
  #214 = Utf8               Ljava/lang/String;
  #215 = Utf8               service
  #216 = Utf8               Lext/mods/gameserver/custom/data/DonateData$Donate;
  #217 = Utf8               args
  #218 = Utf8               [Ljava/lang/String;
  #219 = Utf8               command
  #220 = Utf8               player
  #221 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #222 = Utf8               st
  #223 = Utf8               Ljava/util/StringTokenizer;
  #224 = Utf8               action
  #225 = Utf8               StackMapTable
  #226 = Class              #227          // ext/mods/gameserver/custom/data/DonateData$Donate
  #227 = Utf8               ext/mods/gameserver/custom/data/DonateData$Donate
  #228 = Class              #218          // "[Ljava/lang/String;"
  #229 = Utf8               content
  #230 = Utf8               donate
  #231 = Utf8               pc
  #232 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
  #233 = Utf8               SourceFile
  #234 = Utf8               ServiceBBSManager.java
  #235 = Utf8               NestMembers
  #236 = Utf8               BootstrapMethods
  #237 = String             #238          // html/CommunityBoard/\u0001\u0001.htm
  #238 = Utf8               html/CommunityBoard/\u0001\u0001.htm
  #239 = MethodHandle       6:#240        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #240 = Methodref          #241.#242     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #241 = Class              #243          // java/lang/invoke/StringConcatFactory
  #242 = NameAndType        #155:#244     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #243 = Utf8               java/lang/invoke/StringConcatFactory
  #244 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #245 = Utf8               InnerClasses
  #246 = Utf8               Donate
  #247 = Utf8               SingletonHolder
  #248 = Class              #249          // java/lang/invoke/MethodHandles$Lookup
  #249 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #250 = Class              #251          // java/lang/invoke/MethodHandles
  #251 = Utf8               java/lang/invoke/MethodHandles
  #252 = Utf8               Lookup
{
  public ext.mods.gameserver.communitybbs.custom.ServiceBBSManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: astore        4
        17: aload         4
        19: astore        5
        21: iconst_m1
        22: istore        6
        24: aload         5
        26: invokevirtual #18                 // Method java/lang/String.hashCode:()I
        29: lookupswitch  { // 14

             -1900692517: 152

             -1652963795: 232

             -1414995327: 282

             -1205705863: 184

             -1199866494: 299

             -1153444201: 265

              -474523573: 367

              -305352774: 200

              -305118641: 168

                18473548: 316

                18478791: 350

               548455766: 216

               579347963: 333

              1150762541: 248
                 default: 381
            }
       152: aload         5
       154: ldc           #24                 // String _bbsgetfav_add
       156: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       159: ifeq          381
       162: iconst_0
       163: istore        6
       165: goto          381
       168: aload         5
       170: ldc           #30                 // String _bbsgetfav_add;page
       172: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       175: ifeq          381
       178: iconst_1
       179: istore        6
       181: goto          381
       184: aload         5
       186: ldc           #32                 // String _bbsgetfav_add;nobles
       188: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       191: ifeq          381
       194: iconst_2
       195: istore        6
       197: goto          381
       200: aload         5
       202: ldc           #34                 // String _bbsgetfav_add;hero
       204: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       207: ifeq          381
       210: iconst_3
       211: istore        6
       213: goto          381
       216: aload         5
       218: ldc           #36                 // String _bbsgetfav_add;setnamecolor
       220: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       223: ifeq          381
       226: iconst_4
       227: istore        6
       229: goto          381
       232: aload         5
       234: ldc           #38                 // String _bbsgetfav_add;settitlecolor
       236: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       239: ifeq          381
       242: iconst_5
       243: istore        6
       245: goto          381
       248: aload         5
       250: ldc           #40                 // String _bbsgetfav_add;setname
       252: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       255: ifeq          381
       258: bipush        6
       260: istore        6
       262: goto          381
       265: aload         5
       267: ldc           #42                 // String _bbsgetfav_add;premium
       269: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       272: ifeq          381
       275: bipush        7
       277: istore        6
       279: goto          381
       282: aload         5
       284: ldc           #44                 // String _bbsgetfav_add;gender
       286: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       289: ifeq          381
       292: bipush        8
       294: istore        6
       296: goto          381
       299: aload         5
       301: ldc           #46                 // String _bbsgetfav_add;nullpk
       303: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       306: ifeq          381
       309: bipush        9
       311: istore        6
       313: goto          381
       316: aload         5
       318: ldc           #48                 // String _bbsgetfav_add;clanlvl
       320: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       323: ifeq          381
       326: bipush        10
       328: istore        6
       330: goto          381
       333: aload         5
       335: ldc           #50                 // String _bbsgetfav_add;clanskill
       337: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       340: ifeq          381
       343: bipush        11
       345: istore        6
       347: goto          381
       350: aload         5
       352: ldc           #52                 // String _bbsgetfav_add;clanrep
       354: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       357: ifeq          381
       360: bipush        12
       362: istore        6
       364: goto          381
       367: aload         5
       369: ldc           #54                 // String _bbsgetfav_add;multisell
       371: invokevirtual #26                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       374: ifeq          381
       377: bipush        13
       379: istore        6
       381: iload         6
       383: tableswitch   { // 0 to 13

                       0: 452

                       1: 462

                       2: 478

                       3: 511

                       4: 544

                       5: 589

                       6: 634

                       7: 679

                       8: 712

                       9: 745

                      10: 778

                      11: 811

                      12: 844

                      13: 877
                 default: 905
            }
       452: aload_0
       453: ldc           #56                 // String index
       455: aload_2
       456: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       459: goto          905
       462: aload_3
       463: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       466: astore        7
       468: aload_0
       469: aload         7
       471: aload_2
       472: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       475: goto          905
       478: aload_0
       479: ldc           #64                 // String character
       481: aload_2
       482: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       485: aload_3
       486: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       489: astore        7
       491: aload         7
       493: aload_2
       494: aload_1
       495: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       498: ifne          502
       501: return
       502: aload_2
       503: aload         7
       505: invokestatic  #74                 // Method ext/mods/gameserver/custom/data/DonateData.setNobless:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       508: goto          905
       511: aload_0
       512: ldc           #64                 // String character
       514: aload_2
       515: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       518: aload_3
       519: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       522: astore        7
       524: aload         7
       526: aload_2
       527: aload_1
       528: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       531: ifne          535
       534: return
       535: aload_2
       536: aload         7
       538: invokestatic  #80                 // Method ext/mods/gameserver/custom/data/DonateData.setHero:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       541: goto          905
       544: aload_0
       545: ldc           #83                 // String colorname
       547: aload_2
       548: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       551: aload_3
       552: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       555: astore        7
       557: aload         7
       559: aload_2
       560: aload_1
       561: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       564: ifne          568
       567: return
       568: aload_3
       569: invokevirtual #85                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       572: ifne          576
       575: return
       576: aload_2
       577: aload         7
       579: aload_3
       580: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       583: invokestatic  #89                 // Method ext/mods/gameserver/custom/data/DonateData.setNameColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
       586: goto          905
       589: aload_0
       590: ldc           #93                 // String colortitle
       592: aload_2
       593: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       596: aload_3
       597: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       600: astore        7
       602: aload         7
       604: aload_2
       605: aload_1
       606: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       609: ifne          613
       612: return
       613: aload_3
       614: invokevirtual #85                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       617: ifne          621
       620: return
       621: aload_2
       622: aload         7
       624: aload_3
       625: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       628: invokestatic  #95                 // Method ext/mods/gameserver/custom/data/DonateData.setTitleColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
       631: goto          905
       634: aload_0
       635: ldc           #98                 // String name
       637: aload_2
       638: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       641: aload_3
       642: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       645: astore        7
       647: aload         7
       649: aload_2
       650: aload_1
       651: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       654: ifne          658
       657: return
       658: aload_3
       659: invokevirtual #85                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       662: ifne          666
       665: return
       666: aload_2
       667: aload         7
       669: aload_3
       670: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       673: invokestatic  #100                // Method ext/mods/gameserver/custom/data/DonateData.setName:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
       676: goto          905
       679: aload_0
       680: ldc           #103                // String premium
       682: aload_2
       683: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       686: aload_3
       687: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       690: astore        7
       692: aload         7
       694: aload_2
       695: aload_1
       696: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       699: ifne          703
       702: return
       703: aload_2
       704: aload         7
       706: invokestatic  #105                // Method ext/mods/gameserver/custom/data/DonateData.setPremium:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       709: goto          905
       712: aload_0
       713: ldc           #64                 // String character
       715: aload_2
       716: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       719: aload_3
       720: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       723: astore        7
       725: aload         7
       727: aload_2
       728: aload_1
       729: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       732: ifne          736
       735: return
       736: aload_2
       737: aload         7
       739: invokestatic  #108                // Method ext/mods/gameserver/custom/data/DonateData.setGender:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       742: goto          905
       745: aload_0
       746: ldc           #64                 // String character
       748: aload_2
       749: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       752: aload_3
       753: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       756: astore        7
       758: aload         7
       760: aload_2
       761: aload_1
       762: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       765: ifne          769
       768: return
       769: aload_2
       770: aload         7
       772: invokestatic  #111                // Method ext/mods/gameserver/custom/data/DonateData.clearPK:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       775: goto          905
       778: aload_0
       779: ldc           #114                // String clan
       781: aload_2
       782: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       785: aload_3
       786: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       789: astore        7
       791: aload         7
       793: aload_2
       794: aload_1
       795: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       798: ifne          802
       801: return
       802: aload_2
       803: aload         7
       805: invokestatic  #116                // Method ext/mods/gameserver/custom/data/DonateData.setClanLevel:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       808: goto          905
       811: aload_0
       812: ldc           #114                // String clan
       814: aload_2
       815: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       818: aload_3
       819: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       822: astore        7
       824: aload         7
       826: aload_2
       827: aload_1
       828: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       831: ifne          835
       834: return
       835: aload_2
       836: aload         7
       838: invokestatic  #119                // Method ext/mods/gameserver/custom/data/DonateData.addClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       841: goto          905
       844: aload_0
       845: ldc           #114                // String clan
       847: aload_2
       848: invokevirtual #58                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       851: aload_3
       852: invokestatic  #66                 // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       855: astore        7
       857: aload         7
       859: aload_2
       860: aload_1
       861: invokestatic  #70                 // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       864: ifne          868
       867: return
       868: aload_2
       869: aload         7
       871: invokestatic  #122                // Method ext/mods/gameserver/custom/data/DonateData.addClanRep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       874: goto          905
       877: aload_1
       878: ldc           #9                  // String
       880: invokevirtual #125                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       883: astore        7
       885: aload         7
       887: arraylength
       888: iconst_2
       889: if_icmpge     893
       892: return
       893: invokestatic  #129                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       896: aload         7
       898: iconst_1
       899: aaload
       900: aload_2
       901: iconst_0
       902: invokevirtual #135                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
       905: return
      LineNumberTable:
        line 33: 0
        line 34: 11
        line 35: 17
        line 38: 452
        line 39: 459
        line 42: 462
        line 43: 468
        line 44: 475
        line 47: 478
        line 48: 485
        line 49: 491
        line 50: 501
        line 52: 502
        line 53: 508
        line 56: 511
        line 57: 518
        line 58: 524
        line 59: 534
        line 61: 535
        line 62: 541
        line 65: 544
        line 66: 551
        line 67: 557
        line 68: 567
        line 70: 568
        line 71: 575
        line 73: 576
        line 74: 586
        line 77: 589
        line 78: 596
        line 79: 602
        line 80: 612
        line 82: 613
        line 83: 620
        line 85: 621
        line 86: 631
        line 89: 634
        line 90: 641
        line 91: 647
        line 92: 657
        line 94: 658
        line 95: 665
        line 97: 666
        line 98: 676
        line 101: 679
        line 102: 686
        line 103: 692
        line 104: 702
        line 106: 703
        line 107: 709
        line 110: 712
        line 111: 719
        line 112: 725
        line 113: 735
        line 115: 736
        line 116: 742
        line 119: 745
        line 120: 752
        line 121: 758
        line 122: 768
        line 124: 769
        line 125: 775
        line 128: 778
        line 129: 785
        line 130: 791
        line 131: 801
        line 133: 802
        line 134: 808
        line 137: 811
        line 138: 818
        line 139: 824
        line 140: 834
        line 142: 835
        line 143: 841
        line 145: 844
        line 146: 851
        line 147: 857
        line 148: 867
        line 150: 868
        line 151: 874
        line 154: 877
        line 155: 885
        line 156: 892
        line 158: 893
        line 161: 905
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          468       7     7  page   Ljava/lang/String;
          491      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          524      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          557      29     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          602      29     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          647      29     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          692      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          725      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          758      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          791      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          824      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          857      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          885      20     7  args   [Ljava/lang/String;
            0     906     0  this   Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
            0     906     1 command   Ljava/lang/String;
            0     906     2 player   Lext/mods/gameserver/model/actor/Player;
           11     895     3    st   Ljava/util/StringTokenizer;
           17     889     4 action   Ljava/lang/String;
      StackMapTable: number_of_entries = 45
        frame_type = 255 /* full_frame */
          offset_delta = 152
          locals = [ class ext/mods/gameserver/communitybbs/custom/ServiceBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 9 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 248 /* chop */
          offset_delta = 11

  public static ext.mods.gameserver.custom.data.DonateData$Donate scanService(java.util.StringTokenizer);
    descriptor: (Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #173                // Method ext/mods/gameserver/custom/data/DonateData.getInstance:()Lext/mods/gameserver/custom/data/DonateData;
         3: aload_0
         4: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
         7: invokestatic  #176                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        10: invokevirtual #182                // Method ext/mods/gameserver/custom/data/DonateData.getDonate:(I)Lext/mods/gameserver/custom/data/DonateData$Donate;
        13: areturn
      LineNumberTable:
        line 172: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0    st   Ljava/util/StringTokenizer;

  public static boolean checkService(ext.mods.gameserver.custom.data.DonateData$Donate, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: ifnull        6
         4: iconst_1
         5: ireturn
         6: getstatic     #186                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #190                // String pc[{}] use missing service[{}]
        11: iconst_2
        12: anewarray     #192                // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_1
        18: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        21: aastore
        22: dup
        23: iconst_1
        24: aload_2
        25: aastore
        26: invokevirtual #194                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        29: iconst_0
        30: ireturn
      LineNumberTable:
        line 177: 0
        line 178: 4
        line 180: 6
        line 181: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0 donate   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0      31     1    pc   Lext/mods/gameserver/model/actor/Player;
            0      31     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #200                // String custom/donate/
         2: areturn
      LineNumberTable:
        line 187: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;

  public static ext.mods.gameserver.communitybbs.custom.ServiceBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #202                // Field ext/mods/gameserver/communitybbs/custom/ServiceBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
         3: areturn
      LineNumberTable:
        line 192: 0
}
SourceFile: "ServiceBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/ServiceBBSManager$SingletonHolder
BootstrapMethods:
  0: #239 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #237 html/CommunityBoard/\u0001\u0001.htm
InnerClasses:
  public static final #246= #226 of #75;  // Donate=class ext/mods/gameserver/custom/data/DonateData$Donate of class ext/mods/gameserver/custom/data/DonateData
  public static final #252= #248 of #250; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
