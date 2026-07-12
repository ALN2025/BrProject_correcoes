// Bytecode for: ext.mods.gameserver.communitybbs.custom.MissionBBSManager
// File: ext\mods\gameserver\communitybbs\custom\MissionBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/MissionBBSManager.class
  Last modified 9 de jul de 2026; size 6608 bytes
  MD5 checksum f859edbd9e7905d29cb9171a9706397a
  Compiled from "MissionBBSManager.java"
public class ext.mods.gameserver.communitybbs.custom.MissionBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #47                         // ext/mods/gameserver/communitybbs/custom/MissionBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 6, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // custom/mission/
    #8 = Utf8               custom/mission/
    #9 = String             #10           // _cbmission;
   #10 = Utf8               _cbmission;
   #11 = Methodref          #12.#13       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #12 = Class              #14           // java/lang/String
   #13 = NameAndType        #15:#16       // startsWith:(Ljava/lang/String;)Z
   #14 = Utf8               java/lang/String
   #15 = Utf8               startsWith
   #16 = Utf8               (Ljava/lang/String;)Z
   #17 = Fieldref           #18.#19       // ext/mods/Config.ENABLE_MISSION:Z
   #18 = Class              #20           // ext/mods/Config
   #19 = NameAndType        #21:#22       // ENABLE_MISSION:Z
   #20 = Utf8               ext/mods/Config
   #21 = Utf8               ENABLE_MISSION
   #22 = Utf8               Z
   #23 = Class              #24           // java/util/StringTokenizer
   #24 = Utf8               java/util/StringTokenizer
   #25 = String             #26           // ;
   #26 = Utf8               ;
   #27 = Methodref          #23.#28       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #28 = NameAndType        #5:#29        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #29 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #30 = Methodref          #23.#31       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #31 = NameAndType        #32:#33       // nextToken:()Ljava/lang/String;
   #32 = Utf8               nextToken
   #33 = Utf8               ()Ljava/lang/String;
   #34 = Methodref          #35.#36       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #35 = Class              #37           // java/lang/Integer
   #36 = NameAndType        #38:#39       // parseInt:(Ljava/lang/String;)I
   #37 = Utf8               java/lang/Integer
   #38 = Utf8               parseInt
   #39 = Utf8               (Ljava/lang/String;)I
   #40 = Methodref          #41.#42       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #41 = Class              #43           // ext/mods/gameserver/data/HTMLData
   #42 = NameAndType        #44:#45       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #43 = Utf8               ext/mods/gameserver/data/HTMLData
   #44 = Utf8               getInstance
   #45 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #46 = Methodref          #47.#48       // ext/mods/gameserver/communitybbs/custom/MissionBBSManager.getFolder:()Ljava/lang/String;
   #47 = Class              #49           // ext/mods/gameserver/communitybbs/custom/MissionBBSManager
   #48 = NameAndType        #50:#33       // getFolder:()Ljava/lang/String;
   #49 = Utf8               ext/mods/gameserver/communitybbs/custom/MissionBBSManager
   #50 = Utf8               getFolder
   #51 = InvokeDynamic      #0:#52        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #52 = NameAndType        #53:#54       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #53 = Utf8               makeConcatWithConstants
   #54 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #55 = Methodref          #41.#56       // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #56 = NameAndType        #57:#58       // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #57 = Utf8               getHtm
   #58 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #59 = Methodref          #47.#60       // ext/mods/gameserver/communitybbs/custom/MissionBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #60 = NameAndType        #61:#62       // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #61 = Utf8               separateAndSend
   #62 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #63 = String             #64           // %list%
   #64 = Utf8               %list%
   #65 = Methodref          #47.#66       // ext/mods/gameserver/communitybbs/custom/MissionBBSManager.getList:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #66 = NameAndType        #67:#68       // getList:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #67 = Utf8               getList
   #68 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #69 = Methodref          #12.#70       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #70 = NameAndType        #71:#72       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #71 = Utf8               valueOf
   #72 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #73 = Methodref          #12.#74       // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #74 = NameAndType        #75:#76       // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #75 = Utf8               replaceAll
   #76 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #77 = Methodref          #2.#60        // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #78 = InvokeDynamic      #1:#52        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #79 = Methodref          #2.#80        // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #80 = NameAndType        #81:#62       // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #81 = Utf8               parseCmd
   #82 = Class              #83           // java/lang/StringBuilder
   #83 = Utf8               java/lang/StringBuilder
   #84 = Methodref          #82.#3        // java/lang/StringBuilder."<init>":()V
   #85 = Class              #86           // ext/mods/commons/data/Pagination
   #86 = Utf8               ext/mods/commons/data/Pagination
   #87 = Methodref          #88.#89       // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #88 = Class              #90           // ext/mods/gameserver/model/actor/Player
   #89 = NameAndType        #91:#92       // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #90 = Utf8               ext/mods/gameserver/model/actor/Player
   #91 = Utf8               getMissions
   #92 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #93 = Methodref          #94.#95       // ext/mods/gameserver/model/actor/container/player/MissionList.getAvailableTypes:()Ljava/util/List;
   #94 = Class              #96           // ext/mods/gameserver/model/actor/container/player/MissionList
   #95 = NameAndType        #97:#98       // getAvailableTypes:()Ljava/util/List;
   #96 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
   #97 = Utf8               getAvailableTypes
   #98 = Utf8               ()Ljava/util/List;
   #99 = InterfaceMethodref #100.#101     // java/util/List.stream:()Ljava/util/stream/Stream;
  #100 = Class              #102          // java/util/List
  #101 = NameAndType        #103:#104     // stream:()Ljava/util/stream/Stream;
  #102 = Utf8               java/util/List
  #103 = Utf8               stream
  #104 = Utf8               ()Ljava/util/stream/Stream;
  #105 = Methodref          #85.#106      // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #106 = NameAndType        #5:#107       // "<init>":(Ljava/util/stream/Stream;II)V
  #107 = Utf8               (Ljava/util/stream/Stream;II)V
  #108 = Methodref          #85.#109      // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #109 = NameAndType        #110:#111     // iterator:()Ljava/util/Iterator;
  #110 = Utf8               iterator
  #111 = Utf8               ()Ljava/util/Iterator;
  #112 = InterfaceMethodref #113.#114     // java/util/Iterator.hasNext:()Z
  #113 = Class              #115          // java/util/Iterator
  #114 = NameAndType        #116:#117     // hasNext:()Z
  #115 = Utf8               java/util/Iterator
  #116 = Utf8               hasNext
  #117 = Utf8               ()Z
  #118 = InterfaceMethodref #113.#119     // java/util/Iterator.next:()Ljava/lang/Object;
  #119 = NameAndType        #120:#121     // next:()Ljava/lang/Object;
  #120 = Utf8               next
  #121 = Utf8               ()Ljava/lang/Object;
  #122 = Class              #123          // ext/mods/gameserver/enums/actors/MissionType
  #123 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #124 = Methodref          #94.#125      // ext/mods/gameserver/model/actor/container/player/MissionList.getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #125 = NameAndType        #126:#127     // getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #126 = Utf8               getMission
  #127 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #128 = Methodref          #129.#130     // ext/mods/gameserver/custom/data/MissionData.getInstance:()Lext/mods/gameserver/custom/data/MissionData;
  #129 = Class              #131          // ext/mods/gameserver/custom/data/MissionData
  #130 = NameAndType        #44:#132      // getInstance:()Lext/mods/gameserver/custom/data/MissionData;
  #131 = Utf8               ext/mods/gameserver/custom/data/MissionData
  #132 = Utf8               ()Lext/mods/gameserver/custom/data/MissionData;
  #133 = Methodref          #134.#135     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #134 = Class              #136          // ext/mods/gameserver/model/holder/IntIntHolder
  #135 = NameAndType        #137:#138     // getId:()I
  #136 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #137 = Utf8               getId
  #138 = Utf8               ()I
  #139 = Methodref          #129.#140     // ext/mods/gameserver/custom/data/MissionData.getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #140 = NameAndType        #141:#142     // getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #141 = Utf8               getMissionByLevel
  #142 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #143 = Methodref          #144.#145     // ext/mods/gameserver/model/Mission.getLevel:()I
  #144 = Class              #146          // ext/mods/gameserver/model/Mission
  #145 = NameAndType        #147:#138     // getLevel:()I
  #146 = Utf8               ext/mods/gameserver/model/Mission
  #147 = Utf8               getLevel
  #148 = Methodref          #144.#149     // ext/mods/gameserver/model/Mission.getRequired:()I
  #149 = NameAndType        #150:#138     // getRequired:()I
  #150 = Utf8               getRequired
  #151 = Methodref          #134.#152     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #152 = NameAndType        #153:#138     // getValue:()I
  #153 = Utf8               getValue
  #154 = Methodref          #47.#155      // ext/mods/gameserver/communitybbs/custom/MissionBBSManager.generateBar:(IIII)Ljava/lang/String;
  #155 = NameAndType        #156:#157     // generateBar:(IIII)Ljava/lang/String;
  #156 = Utf8               generateBar
  #157 = Utf8               (IIII)Ljava/lang/String;
  #158 = InvokeDynamic      #2:#52        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #159 = Methodref          #82.#160      // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #160 = NameAndType        #161:#162     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #161 = Utf8               append
  #162 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #163 = Methodref          #144.#164     // ext/mods/gameserver/model/Mission.getIcon:()Ljava/lang/String;
  #164 = NameAndType        #165:#33      // getIcon:()Ljava/lang/String;
  #165 = Utf8               getIcon
  #166 = InvokeDynamic      #3:#167       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #167 = NameAndType        #53:#76       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #168 = Methodref          #144.#169     // ext/mods/gameserver/model/Mission.getName:()Ljava/lang/String;
  #169 = NameAndType        #170:#33      // getName:()Ljava/lang/String;
  #170 = Utf8               getName
  #171 = String             #172          // <font color=00FF00>Done</font>
  #172 = Utf8               <font color=00FF00>Done</font>
  #173 = String             #174          //
  #174 = Utf8
  #175 = InvokeDynamic      #4:#176       // #4:makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #176 = NameAndType        #53:#177      // makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #177 = Utf8               (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #178 = InvokeDynamic      #5:#52        // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #179 = Methodref          #144.#180     // ext/mods/gameserver/model/Mission.getDescription:()Ljava/lang/String;
  #180 = NameAndType        #181:#33      // getDescription:()Ljava/lang/String;
  #181 = Utf8               getDescription
  #182 = String             #183          // %remain%
  #183 = Utf8               %remain%
  #184 = Methodref          #185.#186     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #185 = Class              #187          // ext/mods/commons/lang/StringUtil
  #186 = NameAndType        #188:#189     // formatNumber:(J)Ljava/lang/String;
  #187 = Utf8               ext/mods/commons/lang/StringUtil
  #188 = Utf8               formatNumber
  #189 = Utf8               (J)Ljava/lang/String;
  #190 = String             #191          // %remaindefault%
  #191 = Utf8               %remaindefault%
  #192 = InvokeDynamic      #6:#52        // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #193 = Methodref          #85.#194      // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #194 = NameAndType        #195:#196     // generateSpace:(I)V
  #195 = Utf8               generateSpace
  #196 = Utf8               (I)V
  #197 = String             #198          // bypass _cbmission;%page%
  #198 = Utf8               bypass _cbmission;%page%
  #199 = Methodref          #85.#200      // ext/mods/commons/data/Pagination.generatePagesMedium:(Ljava/lang/String;I)V
  #200 = NameAndType        #201:#202     // generatePagesMedium:(Ljava/lang/String;I)V
  #201 = Utf8               generatePagesMedium
  #202 = Utf8               (Ljava/lang/String;I)V
  #203 = Methodref          #85.#204      // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #204 = NameAndType        #205:#33      // getContent:()Ljava/lang/String;
  #205 = Utf8               getContent
  #206 = Methodref          #82.#207      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #207 = NameAndType        #208:#33      // toString:()Ljava/lang/String;
  #208 = Utf8               toString
  #209 = Methodref          #210.#211     // java/lang/Math.max:(II)I
  #210 = Class              #212          // java/lang/Math
  #211 = NameAndType        #213:#214     // max:(II)I
  #212 = Utf8               java/lang/Math
  #213 = Utf8               max
  #214 = Utf8               (II)I
  #215 = InvokeDynamic      #7:#216       // #7:makeConcatWithConstants:(IIII)Ljava/lang/String;
  #216 = NameAndType        #53:#157      // makeConcatWithConstants:(IIII)Ljava/lang/String;
  #217 = InvokeDynamic      #8:#218       // #8:makeConcatWithConstants:(III)Ljava/lang/String;
  #218 = NameAndType        #53:#219      // makeConcatWithConstants:(III)Ljava/lang/String;
  #219 = Utf8               (III)Ljava/lang/String;
  #220 = Fieldref           #221.#222     // ext/mods/gameserver/communitybbs/custom/MissionBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
  #221 = Class              #223          // ext/mods/gameserver/communitybbs/custom/MissionBBSManager$SingletonHolder
  #222 = NameAndType        #224:#225     // INSTANCE:Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
  #223 = Utf8               ext/mods/gameserver/communitybbs/custom/MissionBBSManager$SingletonHolder
  #224 = Utf8               INSTANCE
  #225 = Utf8               Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
  #226 = Utf8               Code
  #227 = Utf8               LineNumberTable
  #228 = Utf8               LocalVariableTable
  #229 = Utf8               this
  #230 = Utf8               st
  #231 = Utf8               Ljava/util/StringTokenizer;
  #232 = Utf8               page
  #233 = Utf8               I
  #234 = Utf8               content
  #235 = Utf8               Ljava/lang/String;
  #236 = Utf8               command
  #237 = Utf8               player
  #238 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #239 = Utf8               StackMapTable
  #240 = Utf8               mission
  #241 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #242 = Utf8               data
  #243 = Utf8               Lext/mods/gameserver/model/Mission;
  #244 = Utf8               completed
  #245 = Utf8               type
  #246 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #247 = Utf8               sb
  #248 = Utf8               Ljava/lang/StringBuilder;
  #249 = Utf8               list
  #250 = Utf8               Lext/mods/commons/data/Pagination;
  #251 = Utf8               LocalVariableTypeTable
  #252 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/enums/actors/MissionType;>;
  #253 = Utf8               width
  #254 = Utf8               height
  #255 = Utf8               current
  #256 = Utf8               bar
  #257 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
  #258 = Utf8               SourceFile
  #259 = Utf8               MissionBBSManager.java
  #260 = Utf8               NestMembers
  #261 = Utf8               BootstrapMethods
  #262 = String             #263          // html/CommunityBoard/\u0001index.htm
  #263 = Utf8               html/CommunityBoard/\u0001index.htm
  #264 = String             #265          // html/CommunityBoard/\u0001disabled.htm
  #265 = Utf8               html/CommunityBoard/\u0001disabled.htm
  #266 = String             #267          // <table width=623 bgcolor=000000><tr><td width=610 align=center>\u0001</td></tr></table><table width=623 bgcolor=000000><tr>
  #267 = Utf8               <table width=623 bgcolor=000000><tr><td width=610 align=center>\u0001</td></tr></table><table width=623 bgcolor=000000><tr>
  #268 = String             #269          // <td width=40 height=40 align=right><button width=32 height=32 back=\u0001 fore=\u0001></td>
  #269 = Utf8               <td width=40 height=40 align=right><button width=32 height=32 back=\u0001 fore=\u0001></td>
  #270 = String             #271          // <td width=580><font color=LEVEL>Lv \u0001</font> \u0001 \u0001<br1>
  #271 = Utf8               <td width=580><font color=LEVEL>Lv \u0001</font> \u0001 \u0001<br1>
  #272 = String             #273          // [\u0001 achievement complete]
  #273 = Utf8               [\u0001 achievement complete]
  #274 = String             #275          // <font color=B09878>\u0001</font></td></tr></table><img src=L2UI.SquareGray width=620 height=1>
  #275 = Utf8               <font color=B09878>\u0001</font></td></tr></table><img src=L2UI.SquareGray width=620 height=1>
  #276 = String             #277          // <table width=\u0001 cellspacing=0 cellpadding=0><tr><td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_CP width=\u0001 height=\u0001/></td>
  #277 = Utf8               <table width=\u0001 cellspacing=0 cellpadding=0><tr><td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_CP width=\u0001 height=\u0001/></td>
  #278 = String             #279          // <td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_HP1 width=\u0001 height=\u0001/></td></tr></table>
  #279 = Utf8               <td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_HP1 width=\u0001 height=\u0001/></td></tr></table>
  #280 = MethodHandle       6:#281        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #281 = Methodref          #282.#283     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #282 = Class              #284          // java/lang/invoke/StringConcatFactory
  #283 = NameAndType        #53:#285      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #284 = Utf8               java/lang/invoke/StringConcatFactory
  #285 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #286 = Utf8               InnerClasses
  #287 = Utf8               SingletonHolder
  #288 = Class              #289          // java/lang/invoke/MethodHandles$Lookup
  #289 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #290 = Class              #291          // java/lang/invoke/MethodHandles
  #291 = Utf8               java/lang/invoke/MethodHandles
  #292 = Utf8               Lookup
{
  public ext.mods.gameserver.communitybbs.custom.MissionBBSManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
        line 38: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #7                  // String custom/mission/
         2: areturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=3
         0: aload_1
         1: ldc           #9                  // String _cbmission;
         3: invokevirtual #11                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          127
         9: getstatic     #17                 // Field ext/mods/Config.ENABLE_MISSION:Z
        12: ifeq          97
        15: new           #23                 // class java/util/StringTokenizer
        18: dup
        19: aload_1
        20: ldc           #25                 // String ;
        22: invokespecial #27                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        25: astore_3
        26: aload_3
        27: invokevirtual #30                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        30: pop
        31: aload_3
        32: invokevirtual #30                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        35: invokestatic  #34                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        38: istore        4
        40: invokestatic  #40                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        43: aload_2
        44: aload_0
        45: invokevirtual #46                 // Method getFolder:()Ljava/lang/String;
        48: invokedynamic #51,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        53: invokevirtual #55                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        56: astore        5
        58: aload         5
        60: aload_2
        61: invokestatic  #59                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        64: aload         5
        66: ifnull        88
        69: aload         5
        71: ldc           #63                 // String %list%
        73: aload_0
        74: aload_2
        75: iload         4
        77: invokevirtual #65                 // Method getList:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
        80: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        83: invokevirtual #73                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        86: astore        5
        88: aload         5
        90: aload_2
        91: invokestatic  #77                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        94: goto          133
        97: invokestatic  #40                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       100: aload_2
       101: aload_0
       102: invokevirtual #46                 // Method getFolder:()Ljava/lang/String;
       105: invokedynamic #78,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       110: invokevirtual #55                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       113: astore_3
       114: aload_3
       115: aload_2
       116: invokestatic  #59                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       119: aload_3
       120: aload_2
       121: invokestatic  #77                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       124: goto          133
       127: aload_0
       128: aload_1
       129: aload_2
       130: invokespecial #79                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       133: return
      LineNumberTable:
        line 49: 0
        line 51: 9
        line 53: 15
        line 54: 26
        line 56: 31
        line 58: 40
        line 59: 58
        line 60: 64
        line 61: 69
        line 63: 88
        line 64: 94
        line 67: 97
        line 68: 114
        line 69: 119
        line 70: 124
        line 73: 127
        line 74: 133
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      68     3    st   Ljava/util/StringTokenizer;
           40      54     4  page   I
           58      36     5 content   Ljava/lang/String;
          114      10     3 content   Ljava/lang/String;
            0     134     0  this   Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
            0     134     1 command   Ljava/lang/String;
            0     134     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 88
          locals = [ class java/util/StringTokenizer, int, class java/lang/String ]
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 29 /* same */
        frame_type = 5 /* same */

  protected java.lang.String getList(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=10, args_size=3
         0: new           #82                 // class java/lang/StringBuilder
         3: dup
         4: invokespecial #84                 // Method java/lang/StringBuilder."<init>":()V
         7: astore_3
         8: new           #85                 // class ext/mods/commons/data/Pagination
        11: dup
        12: aload_1
        13: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        16: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/container/player/MissionList.getAvailableTypes:()Ljava/util/List;
        19: invokeinterface #99,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        24: iload_2
        25: bipush        8
        27: invokespecial #105                // Method ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
        30: astore        4
        32: aload         4
        34: invokevirtual #108                // Method ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
        37: astore        5
        39: aload         5
        41: invokeinterface #112,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        46: ifeq          280
        49: aload         5
        51: invokeinterface #118,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        56: checkcast     #122                // class ext/mods/gameserver/enums/actors/MissionType
        59: astore        6
        61: aload_1
        62: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        65: aload         6
        67: invokevirtual #124                // Method ext/mods/gameserver/model/actor/container/player/MissionList.getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
        70: astore        7
        72: invokestatic  #128                // Method ext/mods/gameserver/custom/data/MissionData.getInstance:()Lext/mods/gameserver/custom/data/MissionData;
        75: aload         6
        77: aload         7
        79: invokevirtual #133                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        82: iconst_1
        83: iadd
        84: invokevirtual #139                // Method ext/mods/gameserver/custom/data/MissionData.getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
        87: astore        8
        89: aload         8
        91: ifnonnull     97
        94: goto          39
        97: aload         8
        99: invokevirtual #143                // Method ext/mods/gameserver/model/Mission.getLevel:()I
       102: aload         7
       104: invokevirtual #133                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       107: if_icmpne     114
       110: iconst_1
       111: goto          115
       114: iconst_0
       115: istore        9
       117: aload_3
       118: aload_0
       119: sipush        606
       122: iconst_4
       123: iload         9
       125: ifeq          136
       128: aload         8
       130: invokevirtual #148                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       133: goto          141
       136: aload         7
       138: invokevirtual #151                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       141: aload         8
       143: invokevirtual #148                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       146: invokevirtual #154                // Method generateBar:(IIII)Ljava/lang/String;
       149: invokedynamic #158,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       154: invokevirtual #159                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       157: pop
       158: aload_3
       159: aload         8
       161: invokevirtual #163                // Method ext/mods/gameserver/model/Mission.getIcon:()Ljava/lang/String;
       164: aload         8
       166: invokevirtual #163                // Method ext/mods/gameserver/model/Mission.getIcon:()Ljava/lang/String;
       169: invokedynamic #166,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       174: invokevirtual #159                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       177: pop
       178: aload_3
       179: aload         8
       181: invokevirtual #143                // Method ext/mods/gameserver/model/Mission.getLevel:()I
       184: aload         8
       186: invokevirtual #168                // Method ext/mods/gameserver/model/Mission.getName:()Ljava/lang/String;
       189: iload         9
       191: ifeq          199
       194: ldc           #171                // String <font color=00FF00>Done</font>
       196: goto          201
       199: ldc           #173                // String
       201: invokedynamic #175,  0            // InvokeDynamic #4:makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       206: invokevirtual #159                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       209: pop
       210: aload_3
       211: iload         9
       213: ifeq          229
       216: aload         8
       218: invokevirtual #168                // Method ext/mods/gameserver/model/Mission.getName:()Ljava/lang/String;
       221: invokedynamic #178,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       226: goto          268
       229: aload         8
       231: invokevirtual #179                // Method ext/mods/gameserver/model/Mission.getDescription:()Ljava/lang/String;
       234: ldc           #182                // String %remain%
       236: aload         8
       238: invokevirtual #148                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       241: aload         7
       243: invokevirtual #151                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       246: isub
       247: i2l
       248: invokestatic  #184                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       251: invokevirtual #73                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       254: ldc           #190                // String %remaindefault%
       256: aload         8
       258: invokevirtual #148                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       261: i2l
       262: invokestatic  #184                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       265: invokevirtual #73                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       268: invokedynamic #192,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       273: invokevirtual #159                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       276: pop
       277: goto          39
       280: aload         4
       282: bipush        22
       284: invokevirtual #193                // Method ext/mods/commons/data/Pagination.generateSpace:(I)V
       287: aload         4
       289: ldc           #197                // String bypass _cbmission;%page%
       291: sipush        680
       294: invokevirtual #199                // Method ext/mods/commons/data/Pagination.generatePagesMedium:(Ljava/lang/String;I)V
       297: aload_3
       298: aload         4
       300: invokevirtual #203                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       303: invokevirtual #159                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       306: pop
       307: aload_3
       308: invokevirtual #206                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       311: areturn
      LineNumberTable:
        line 78: 0
        line 79: 8
        line 80: 32
        line 82: 61
        line 83: 72
        line 84: 89
        line 85: 94
        line 87: 97
        line 88: 117
        line 89: 158
        line 90: 178
        line 91: 210
        line 93: 277
        line 95: 280
        line 96: 287
        line 97: 297
        line 98: 307
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           72     205     7 mission   Lext/mods/gameserver/model/holder/IntIntHolder;
           89     188     8  data   Lext/mods/gameserver/model/Mission;
          117     160     9 completed   Z
           61     216     6  type   Lext/mods/gameserver/enums/actors/MissionType;
            0     312     0  this   Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
            0     312     1 player   Lext/mods/gameserver/model/actor/Player;
            0     312     2  page   I
            8     304     3    sb   Ljava/lang/StringBuilder;
           32     280     4  list   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           32     280     4  list   Lext/mods/commons/data/Pagination<Lext/mods/gameserver/enums/actors/MissionType;>;
      StackMapTable: number_of_entries = 11
        frame_type = 254 /* append */
          offset_delta = 39
          locals = [ class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission ]
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/communitybbs/custom/MissionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, class ext/mods/gameserver/communitybbs/custom/MissionBBSManager, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/communitybbs/custom/MissionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, class ext/mods/gameserver/communitybbs/custom/MissionBBSManager, int, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/communitybbs/custom/MissionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/MissionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, int, class java/lang/String, class java/lang/String ]
        frame_type = 91 /* same_locals_1_stack_item */
          stack = [ class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/communitybbs/custom/MissionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/communitybbs/custom/MissionBBSManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination ]
          stack = []

  public java.lang.String generateBar(int, int, int, int);
    descriptor: (IIII)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: new           #82                 // class java/lang/StringBuilder
         3: dup
         4: invokespecial #84                 // Method java/lang/StringBuilder."<init>":()V
         7: astore        5
         9: iload_3
        10: iload         4
        12: if_icmple     20
        15: iload         4
        17: goto          21
        20: iload_3
        21: istore_3
        22: iload_1
        23: iload_3
        24: bipush        100
        26: imul
        27: iload         4
        29: idiv
        30: imul
        31: bipush        100
        33: idiv
        34: iconst_0
        35: invokestatic  #209                // Method java/lang/Math.max:(II)I
        38: istore        6
        40: aload         5
        42: iload_1
        43: iload         6
        45: iload         6
        47: iload_2
        48: invokedynamic #215,  0            // InvokeDynamic #7:makeConcatWithConstants:(IIII)Ljava/lang/String;
        53: invokevirtual #159                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        56: pop
        57: aload         5
        59: iload_1
        60: iload         6
        62: isub
        63: iload_1
        64: iload         6
        66: isub
        67: iload_2
        68: invokedynamic #217,  0            // InvokeDynamic #8:makeConcatWithConstants:(III)Ljava/lang/String;
        73: invokevirtual #159                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        76: pop
        77: aload         5
        79: invokevirtual #206                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        82: areturn
      LineNumberTable:
        line 103: 0
        line 104: 9
        line 105: 22
        line 106: 40
        line 107: 57
        line 108: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
            0      83     1 width   I
            0      83     2 height   I
            0      83     3 current   I
            0      83     4   max   I
            9      74     5    sb   Ljava/lang/StringBuilder;
           40      43     6   bar   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/StringBuilder ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public static ext.mods.gameserver.communitybbs.custom.MissionBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #220                // Field ext/mods/gameserver/communitybbs/custom/MissionBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
         3: areturn
      LineNumberTable:
        line 113: 0
}
SourceFile: "MissionBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/MissionBBSManager$SingletonHolder
BootstrapMethods:
  0: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #262 html/CommunityBoard/\u0001index.htm
  1: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #264 html/CommunityBoard/\u0001disabled.htm
  2: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #266 <table width=623 bgcolor=000000><tr><td width=610 align=center>\u0001</td></tr></table><table width=623 bgcolor=000000><tr>
  3: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #268 <td width=40 height=40 align=right><button width=32 height=32 back=\u0001 fore=\u0001></td>
  4: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #270 <td width=580><font color=LEVEL>Lv \u0001</font> \u0001 \u0001<br1>
  5: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #272 [\u0001 achievement complete]
  6: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #274 <font color=B09878>\u0001</font></td></tr></table><img src=L2UI.SquareGray width=620 height=1>
  7: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #276 <table width=\u0001 cellspacing=0 cellpadding=0><tr><td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_CP width=\u0001 height=\u0001/></td>
  8: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #278 <td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_HP1 width=\u0001 height=\u0001/></td></tr></table>
InnerClasses:
  public static final #292= #288 of #290; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
