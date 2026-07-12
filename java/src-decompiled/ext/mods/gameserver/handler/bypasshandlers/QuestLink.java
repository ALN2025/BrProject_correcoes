// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.QuestLink
// File: ext\mods\gameserver\handler\bypasshandlers\QuestLink.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/QuestLink.class
  Last modified 9 de jul de 2026; size 7011 bytes
  MD5 checksum 7aaceffe1c2dab110d59e878c587b04a
  Compiled from "QuestLink.java"
public class ext.mods.gameserver.handler.bypasshandlers.QuestLink implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #28                         // ext/mods/gameserver/handler/bypasshandlers/QuestLink
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            //
    #8 = Utf8
    #9 = Methodref          #10.#11       // java/lang/String.substring:(I)Ljava/lang/String;
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // substring:(I)Ljava/lang/String;
   #12 = Utf8               java/lang/String
   #13 = Utf8               substring
   #14 = Utf8               (I)Ljava/lang/String;
   #15 = Methodref          #10.#16       // java/lang/String.trim:()Ljava/lang/String;
   #16 = NameAndType        #17:#18       // trim:()Ljava/lang/String;
   #17 = Utf8               trim
   #18 = Utf8               ()Ljava/lang/String;
   #19 = Class              #20           // java/lang/IndexOutOfBoundsException
   #20 = Utf8               java/lang/IndexOutOfBoundsException
   #21 = Class              #22           // ext/mods/gameserver/model/actor/Npc
   #22 = Utf8               ext/mods/gameserver/model/actor/Npc
   #23 = Methodref          #10.#24       // java/lang/String.isEmpty:()Z
   #24 = NameAndType        #25:#26       // isEmpty:()Z
   #25 = Utf8               isEmpty
   #26 = Utf8               ()Z
   #27 = Methodref          #28.#29       // ext/mods/gameserver/handler/bypasshandlers/QuestLink.showQuestWindowGeneral:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
   #28 = Class              #30           // ext/mods/gameserver/handler/bypasshandlers/QuestLink
   #29 = NameAndType        #31:#32       // showQuestWindowGeneral:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
   #30 = Utf8               ext/mods/gameserver/handler/bypasshandlers/QuestLink
   #31 = Utf8               showQuestWindowGeneral
   #32 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
   #33 = Methodref          #34.#35       // ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
   #34 = Class              #36           // ext/mods/gameserver/data/xml/ScriptData
   #35 = NameAndType        #37:#38       // getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
   #36 = Utf8               ext/mods/gameserver/data/xml/ScriptData
   #37 = Utf8               getInstance
   #38 = Utf8               ()Lext/mods/gameserver/data/xml/ScriptData;
   #39 = Methodref          #34.#40       // ext/mods/gameserver/data/xml/ScriptData.getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
   #40 = NameAndType        #41:#42       // getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
   #41 = Utf8               getQuest
   #42 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
   #43 = Methodref          #28.#44       // ext/mods/gameserver/handler/bypasshandlers/QuestLink.showQuestWindowSingle:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;)V
   #44 = NameAndType        #45:#46       // showQuestWindowSingle:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;)V
   #45 = Utf8               showQuestWindowSingle
   #46 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;)V
   #47 = Class              #48           // java/util/ArrayList
   #48 = Utf8               java/util/ArrayList
   #49 = Methodref          #47.#3        // java/util/ArrayList."<init>":()V
   #50 = Methodref          #21.#51       // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #51 = NameAndType        #52:#53       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #52 = Utf8               getTemplate
   #53 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #54 = Fieldref           #55.#56       // ext/mods/gameserver/enums/EventHandler.TALKED:Lext/mods/gameserver/enums/EventHandler;
   #55 = Class              #57           // ext/mods/gameserver/enums/EventHandler
   #56 = NameAndType        #58:#59       // TALKED:Lext/mods/gameserver/enums/EventHandler;
   #57 = Utf8               ext/mods/gameserver/enums/EventHandler
   #58 = Utf8               TALKED
   #59 = Utf8               Lext/mods/gameserver/enums/EventHandler;
   #60 = Methodref          #61.#62       // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #61 = Class              #63           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #62 = NameAndType        #64:#65       // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #63 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #64 = Utf8               getEventQuests
   #65 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #66 = InterfaceMethodref #67.#68       // java/util/List.iterator:()Ljava/util/Iterator;
   #67 = Class              #69           // java/util/List
   #68 = NameAndType        #70:#71       // iterator:()Ljava/util/Iterator;
   #69 = Utf8               java/util/List
   #70 = Utf8               iterator
   #71 = Utf8               ()Ljava/util/Iterator;
   #72 = InterfaceMethodref #73.#74       // java/util/Iterator.hasNext:()Z
   #73 = Class              #75           // java/util/Iterator
   #74 = NameAndType        #76:#26       // hasNext:()Z
   #75 = Utf8               java/util/Iterator
   #76 = Utf8               hasNext
   #77 = InterfaceMethodref #73.#78       // java/util/Iterator.next:()Ljava/lang/Object;
   #78 = NameAndType        #79:#80       // next:()Ljava/lang/Object;
   #79 = Utf8               next
   #80 = Utf8               ()Ljava/lang/Object;
   #81 = Class              #82           // ext/mods/gameserver/scripting/Quest
   #82 = Utf8               ext/mods/gameserver/scripting/Quest
   #83 = Methodref          #81.#84       // ext/mods/gameserver/scripting/Quest.isRealQuest:()Z
   #84 = NameAndType        #85:#26       // isRealQuest:()Z
   #85 = Utf8               isRealQuest
   #86 = InterfaceMethodref #67.#87       // java/util/List.contains:(Ljava/lang/Object;)Z
   #87 = NameAndType        #88:#89       // contains:(Ljava/lang/Object;)Z
   #88 = Utf8               contains
   #89 = Utf8               (Ljava/lang/Object;)Z
   #90 = Methodref          #91.#92       // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #91 = Class              #93           // ext/mods/gameserver/model/actor/Player
   #92 = NameAndType        #94:#95       // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #93 = Utf8               ext/mods/gameserver/model/actor/Player
   #94 = Utf8               getQuestList
   #95 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #96 = Methodref          #81.#97       // ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
   #97 = NameAndType        #98:#18       // getName:()Ljava/lang/String;
   #98 = Utf8               getName
   #99 = Methodref          #100.#101     // ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #100 = Class              #102          // ext/mods/gameserver/model/actor/container/player/QuestList
  #101 = NameAndType        #103:#104     // getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #102 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
  #103 = Utf8               getQuestState
  #104 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #105 = Methodref          #106.#107     // ext/mods/gameserver/scripting/QuestState.isCreated:()Z
  #106 = Class              #108          // ext/mods/gameserver/scripting/QuestState
  #107 = NameAndType        #109:#26      // isCreated:()Z
  #108 = Utf8               ext/mods/gameserver/scripting/QuestState
  #109 = Utf8               isCreated
  #110 = InterfaceMethodref #67.#111      // java/util/List.add:(Ljava/lang/Object;)Z
  #111 = NameAndType        #112:#89      // add:(Ljava/lang/Object;)Z
  #112 = Utf8               add
  #113 = Fieldref           #55.#114      // ext/mods/gameserver/enums/EventHandler.QUEST_START:Lext/mods/gameserver/enums/EventHandler;
  #114 = NameAndType        #115:#59      // QUEST_START:Lext/mods/gameserver/enums/EventHandler;
  #115 = Utf8               QUEST_START
  #116 = InterfaceMethodref #67.#24       // java/util/List.isEmpty:()Z
  #117 = InterfaceMethodref #67.#118      // java/util/List.size:()I
  #118 = NameAndType        #119:#120     // size:()I
  #119 = Utf8               size
  #120 = Utf8               ()I
  #121 = InterfaceMethodref #67.#122      // java/util/List.get:(I)Ljava/lang/Object;
  #122 = NameAndType        #123:#124     // get:(I)Ljava/lang/Object;
  #123 = Utf8               get
  #124 = Utf8               (I)Ljava/lang/Object;
  #125 = Methodref          #28.#126      // ext/mods/gameserver/handler/bypasshandlers/QuestLink.showQuestWindowChoose:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/util/List;)V
  #126 = NameAndType        #127:#128     // showQuestWindowChoose:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/util/List;)V
  #127 = Utf8               showQuestWindowChoose
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/util/List;)V
  #129 = Class              #130          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #130 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #131 = Methodref          #21.#132      // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #132 = NameAndType        #133:#120     // getObjectId:()I
  #133 = Utf8               getObjectId
  #134 = Methodref          #129.#135     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #135 = NameAndType        #5:#136       // "<init>":(I)V
  #136 = Utf8               (I)V
  #137 = Methodref          #91.#138      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #138 = NameAndType        #139:#140     // getLocale:()Ljava/util/Locale;
  #139 = Utf8               getLocale
  #140 = Utf8               ()Ljava/util/Locale;
  #141 = Methodref          #81.#142      // ext/mods/gameserver/scripting/Quest.getNoQuestMsg:()Ljava/lang/String;
  #142 = NameAndType        #143:#18      // getNoQuestMsg:()Ljava/lang/String;
  #143 = Utf8               getNoQuestMsg
  #144 = Methodref          #129.#145     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #145 = NameAndType        #146:#147     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #146 = Utf8               setFile
  #147 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #148 = Methodref          #91.#149      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #149 = NameAndType        #150:#151     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #150 = Utf8               sendPacket
  #151 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #152 = Fieldref           #153.#154     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #153 = Class              #155          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #154 = NameAndType        #156:#157     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #155 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #156 = Utf8               STATIC_PACKET
  #157 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #158 = Methodref          #91.#159      // ext/mods/gameserver/model/actor/Player.isOverweight:()Z
  #159 = NameAndType        #160:#26      // isOverweight:()Z
  #160 = Utf8               isOverweight
  #161 = Fieldref           #162.#163     // ext/mods/gameserver/network/SystemMessageId.INVENTORY_LESS_THAN_80_PERCENT:Lext/mods/gameserver/network/SystemMessageId;
  #162 = Class              #164          // ext/mods/gameserver/network/SystemMessageId
  #163 = NameAndType        #165:#166     // INVENTORY_LESS_THAN_80_PERCENT:Lext/mods/gameserver/network/SystemMessageId;
  #164 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #165 = Utf8               INVENTORY_LESS_THAN_80_PERCENT
  #166 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #167 = Methodref          #91.#168      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #168 = NameAndType        #150:#169     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #169 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #170 = Methodref          #100.#171     // ext/mods/gameserver/model/actor/container/player/QuestList.getAllQuests:(Z)Ljava/util/List;
  #171 = NameAndType        #172:#173     // getAllQuests:(Z)Ljava/util/List;
  #172 = Utf8               getAllQuests
  #173 = Utf8               (Z)Ljava/util/List;
  #174 = Methodref          #81.#175      // ext/mods/gameserver/scripting/Quest.getTooMuchQuestsMsg:()Ljava/lang/String;
  #175 = NameAndType        #176:#18      // getTooMuchQuestsMsg:()Ljava/lang/String;
  #176 = Utf8               getTooMuchQuestsMsg
  #177 = Methodref          #81.#178      // ext/mods/gameserver/scripting/Quest.newQuestState:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/scripting/QuestState;
  #178 = NameAndType        #179:#180     // newQuestState:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/scripting/QuestState;
  #179 = Utf8               newQuestState
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/scripting/QuestState;
  #181 = Methodref          #100.#182     // ext/mods/gameserver/model/actor/container/player/QuestList.setLastQuestNpcObjectId:(I)V
  #182 = NameAndType        #183:#136     // setLastQuestNpcObjectId:(I)V
  #183 = Utf8               setLastQuestNpcObjectId
  #184 = Methodref          #81.#185      // ext/mods/gameserver/scripting/Quest.notifyTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #185 = NameAndType        #186:#187     // notifyTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #186 = Utf8               notifyTalk
  #187 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #188 = Class              #189          // java/lang/StringBuilder
  #189 = Utf8               java/lang/StringBuilder
  #190 = String             #191          // <html><body>
  #191 = Utf8               <html><body>
  #192 = Methodref          #188.#193     // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #193 = NameAndType        #5:#194       // "<init>":(Ljava/lang/String;)V
  #194 = Utf8               (Ljava/lang/String;)V
  #195 = String             #196          // <a action=\"bypass -h npc_%objectId%_Quest
  #196 = Utf8               <a action=\"bypass -h npc_%objectId%_Quest
  #197 = String             #198          // \">[
  #198 = Utf8               \">[
  #199 = Methodref          #81.#200      // ext/mods/gameserver/scripting/Quest.getDescr:()Ljava/lang/String;
  #200 = NameAndType        #201:#18      // getDescr:()Ljava/lang/String;
  #201 = Utf8               getDescr
  #202 = Methodref          #203.#204     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #203 = Class              #205          // ext/mods/commons/lang/StringUtil
  #204 = NameAndType        #206:#207     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #205 = Utf8               ext/mods/commons/lang/StringUtil
  #206 = Utf8               append
  #207 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #208 = Methodref          #106.#209     // ext/mods/gameserver/scripting/QuestState.isStarted:()Z
  #209 = NameAndType        #210:#26      // isStarted:()Z
  #210 = Utf8               isStarted
  #211 = Methodref          #91.#212      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #212 = NameAndType        #213:#214     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #213 = Utf8               getSysString
  #214 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #215 = InvokeDynamic      #0:#216       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #216 = NameAndType        #217:#218     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #217 = Utf8               makeConcatWithConstants
  #218 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #219 = Methodref          #188.#220     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #220 = NameAndType        #206:#221     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #221 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #222 = Methodref          #106.#223     // ext/mods/gameserver/scripting/QuestState.isCompleted:()Z
  #223 = NameAndType        #224:#26      // isCompleted:()Z
  #224 = Utf8               isCompleted
  #225 = String             #226          // ]</a><br>
  #226 = Utf8               ]</a><br>
  #227 = String             #228          // </body></html>
  #228 = Utf8               </body></html>
  #229 = Methodref          #188.#230     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #230 = NameAndType        #231:#18      // toString:()Ljava/lang/String;
  #231 = Utf8               toString
  #232 = Methodref          #129.#233     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #233 = NameAndType        #234:#194     // setHtml:(Ljava/lang/String;)V
  #234 = Utf8               setHtml
  #235 = String             #236          // %objectId%
  #236 = Utf8               %objectId%
  #237 = Methodref          #129.#238     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #238 = NameAndType        #239:#240     // replace:(Ljava/lang/String;I)V
  #239 = Utf8               replace
  #240 = Utf8               (Ljava/lang/String;I)V
  #241 = Fieldref           #28.#242      // ext/mods/gameserver/handler/bypasshandlers/QuestLink.COMMANDS:[Ljava/lang/String;
  #242 = NameAndType        #243:#244     // COMMANDS:[Ljava/lang/String;
  #243 = Utf8               COMMANDS
  #244 = Utf8               [Ljava/lang/String;
  #245 = String             #246          // Quest
  #246 = Utf8               Quest
  #247 = Class              #248          // ext/mods/gameserver/handler/IBypassHandler
  #248 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #249 = Utf8               Code
  #250 = Utf8               LineNumberTable
  #251 = Utf8               LocalVariableTable
  #252 = Utf8               this
  #253 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/QuestLink;
  #254 = Utf8               useBypass
  #255 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #256 = Utf8               npc
  #257 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #258 = Utf8               command
  #259 = Utf8               Ljava/lang/String;
  #260 = Utf8               player
  #261 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #262 = Utf8               target
  #263 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #264 = Utf8               quest
  #265 = Utf8               StackMapTable
  #266 = Class              #267          // ext/mods/gameserver/model/actor/Creature
  #267 = Utf8               ext/mods/gameserver/model/actor/Creature
  #268 = Utf8               qs
  #269 = Utf8               Lext/mods/gameserver/scripting/QuestState;
  #270 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #271 = Utf8               quests
  #272 = Utf8               Ljava/util/List;
  #273 = Utf8               LocalVariableTypeTable
  #274 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #275 = Utf8               html
  #276 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #277 = Utf8               q
  #278 = Utf8               sb
  #279 = Utf8               Ljava/lang/StringBuilder;
  #280 = Utf8               Signature
  #281 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;)V
  #282 = Utf8               getBypassList
  #283 = Utf8               ()[Ljava/lang/String;
  #284 = Utf8               <clinit>
  #285 = Utf8               SourceFile
  #286 = Utf8               QuestLink.java
  #287 = Utf8               BootstrapMethods
  #288 = String             #289          // \u0001</a><br>
  #289 = Utf8               \u0001</a><br>
  #290 = MethodHandle       6:#291        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #291 = Methodref          #292.#293     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #292 = Class              #294          // java/lang/invoke/StringConcatFactory
  #293 = NameAndType        #217:#295     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #294 = Utf8               java/lang/invoke/StringConcatFactory
  #295 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #296 = Utf8               InnerClasses
  #297 = Class              #298          // java/lang/invoke/MethodHandles$Lookup
  #298 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #299 = Class              #300          // java/lang/invoke/MethodHandles
  #300 = Utf8               java/lang/invoke/MethodHandles
  #301 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.bypasshandlers.QuestLink();
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
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/QuestLink;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: ldc           #7                  // String
         2: astore        4
         4: aload_1
         5: iconst_5
         6: invokevirtual #9                  // Method java/lang/String.substring:(I)Ljava/lang/String;
         9: invokevirtual #15                 // Method java/lang/String.trim:()Ljava/lang/String;
        12: astore        4
        14: goto          19
        17: astore        5
        19: aload_3
        20: instanceof    #21                 // class ext/mods/gameserver/model/actor/Npc
        23: ifeq          63
        26: aload_3
        27: checkcast     #21                 // class ext/mods/gameserver/model/actor/Npc
        30: astore        5
        32: aload         4
        34: invokevirtual #23                 // Method java/lang/String.isEmpty:()Z
        37: ifeq          49
        40: aload_2
        41: aload         5
        43: invokestatic  #27                 // Method showQuestWindowGeneral:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
        46: goto          63
        49: aload_2
        50: aload         5
        52: invokestatic  #33                 // Method ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
        55: aload         4
        57: invokevirtual #39                 // Method ext/mods/gameserver/data/xml/ScriptData.getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
        60: invokestatic  #43                 // Method showQuestWindowSingle:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;)V
        63: iconst_1
        64: ireturn
      Exception table:
         from    to  target type
             4    14    17   Class java/lang/IndexOutOfBoundsException
      LineNumberTable:
        line 45: 0
        line 48: 4
        line 52: 14
        line 50: 17
        line 54: 19
        line 56: 32
        line 57: 40
        line 59: 49
        line 61: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32      31     5   npc   Lext/mods/gameserver/model/actor/Npc;
            0      65     0  this   Lext/mods/gameserver/handler/bypasshandlers/QuestLink;
            0      65     1 command   Ljava/lang/String;
            0      65     2 player   Lext/mods/gameserver/model/actor/Player;
            0      65     3 target   Lext/mods/gameserver/model/actor/Creature;
            4      61     4 quest   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/QuestLink, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class java/lang/String ]
          stack = [ class java/lang/IndexOutOfBoundsException ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 250 /* chop */
          offset_delta = 13

  public static void showQuestWindowGeneral(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=6, args_size=2
         0: new           #47                 // class java/util/ArrayList
         3: dup
         4: invokespecial #49                 // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: aload_1
         9: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        12: getstatic     #54                 // Field ext/mods/gameserver/enums/EventHandler.TALKED:Lext/mods/gameserver/enums/EventHandler;
        15: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        18: invokeinterface #66,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        23: astore_3
        24: aload_3
        25: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          113
        33: aload_3
        34: invokeinterface #77,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #81                 // class ext/mods/gameserver/scripting/Quest
        42: astore        4
        44: aload         4
        46: ifnull        24
        49: aload         4
        51: invokevirtual #83                 // Method ext/mods/gameserver/scripting/Quest.isRealQuest:()Z
        54: ifeq          24
        57: aload_2
        58: aload         4
        60: invokeinterface #86,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        65: ifeq          71
        68: goto          24
        71: aload_0
        72: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        75: aload         4
        77: invokevirtual #96                 // Method ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
        80: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
        83: astore        5
        85: aload         5
        87: ifnull        24
        90: aload         5
        92: invokevirtual #105                // Method ext/mods/gameserver/scripting/QuestState.isCreated:()Z
        95: ifeq          101
        98: goto          24
       101: aload_2
       102: aload         4
       104: invokeinterface #110,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       109: pop
       110: goto          24
       113: aload_1
       114: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       117: getstatic     #113                // Field ext/mods/gameserver/enums/EventHandler.QUEST_START:Lext/mods/gameserver/enums/EventHandler;
       120: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       123: invokeinterface #66,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       128: astore_3
       129: aload_3
       130: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       135: ifeq          188
       138: aload_3
       139: invokeinterface #77,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       144: checkcast     #81                 // class ext/mods/gameserver/scripting/Quest
       147: astore        4
       149: aload         4
       151: ifnull        129
       154: aload         4
       156: invokevirtual #83                 // Method ext/mods/gameserver/scripting/Quest.isRealQuest:()Z
       159: ifeq          129
       162: aload_2
       163: aload         4
       165: invokeinterface #86,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       170: ifeq          176
       173: goto          129
       176: aload_2
       177: aload         4
       179: invokeinterface #110,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       184: pop
       185: goto          129
       188: aload_2
       189: invokeinterface #116,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       194: ifeq          206
       197: aload_0
       198: aload_1
       199: aconst_null
       200: invokestatic  #43                 // Method showQuestWindowSingle:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;)V
       203: goto          240
       206: aload_2
       207: invokeinterface #117,  1          // InterfaceMethod java/util/List.size:()I
       212: iconst_1
       213: if_icmpne     234
       216: aload_0
       217: aload_1
       218: aload_2
       219: iconst_0
       220: invokeinterface #121,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       225: checkcast     #81                 // class ext/mods/gameserver/scripting/Quest
       228: invokestatic  #43                 // Method showQuestWindowSingle:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;)V
       231: goto          240
       234: aload_0
       235: aload_1
       236: aload_2
       237: invokestatic  #125                // Method showQuestWindowChoose:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/util/List;)V
       240: return
      LineNumberTable:
        line 71: 0
        line 73: 8
        line 75: 44
        line 76: 68
        line 78: 71
        line 79: 85
        line 80: 98
        line 82: 101
        line 83: 110
        line 85: 113
        line 87: 149
        line 88: 173
        line 90: 176
        line 91: 185
        line 93: 188
        line 94: 197
        line 95: 206
        line 96: 216
        line 98: 234
        line 99: 240
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      25     5    qs   Lext/mods/gameserver/scripting/QuestState;
           44      66     4 quest   Lext/mods/gameserver/scripting/Quest;
          149      36     4 quest   Lext/mods/gameserver/scripting/Quest;
            0     241     0 player   Lext/mods/gameserver/model/actor/Player;
            0     241     1   npc   Lext/mods/gameserver/model/actor/Npc;
            8     233     2 quests   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     233     2 quests   Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
      StackMapTable: number_of_entries = 10
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/scripting/Quest ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/scripting/QuestState ]
        frame_type = 248 /* chop */
          offset_delta = 11
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/scripting/Quest ]
        frame_type = 249 /* chop */
          offset_delta = 11
        frame_type = 17 /* same */
        frame_type = 27 /* same */
        frame_type = 5 /* same */

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #241                // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 184: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/QuestLink;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #245                // String Quest
         8: aastore
         9: putstatic     #241                // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "QuestLink.java"
BootstrapMethods:
  0: #290 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #288 \u0001</a><br>
InnerClasses:
  public static final #301= #297 of #299; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
