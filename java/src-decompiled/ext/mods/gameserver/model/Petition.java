// Bytecode for: ext.mods.gameserver.model.Petition
// File: ext\mods\gameserver\model\Petition.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/Petition.class
  Last modified 9 de jul de 2026; size 10985 bytes
  MD5 checksum 6e155317b20d758ddeaac2d65c7434f7
  Compiled from "Petition.java"
public class ext.mods.gameserver.model.Petition
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/Petition
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 12, methods: 30, attributes: 1
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/Petition._messages:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/model/Petition
   #12 = NameAndType        #14:#15       // _messages:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/model/Petition
   #14 = Utf8               _messages
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/Petition._responders:Ljava/util/List;
   #17 = NameAndType        #18:#15       // _responders:Ljava/util/List;
   #18 = Utf8               _responders
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/model/Petition._isUnread:Z
   #20 = NameAndType        #21:#22       // _isUnread:Z
   #21 = Utf8               _isUnread
   #22 = Utf8               Z
   #23 = Fieldref           #11.#24       // ext/mods/gameserver/model/Petition._isUnderFeedback:Z
   #24 = NameAndType        #25:#22       // _isUnderFeedback:Z
   #25 = Utf8               _isUnderFeedback
   #26 = Fieldref           #27.#28       // ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
   #27 = Class              #29           // ext/mods/gameserver/enums/petitions/PetitionState
   #28 = NameAndType        #30:#31       // PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
   #29 = Utf8               ext/mods/gameserver/enums/petitions/PetitionState
   #30 = Utf8               PENDING
   #31 = Utf8               Lext/mods/gameserver/enums/petitions/PetitionState;
   #32 = Fieldref           #11.#33       // ext/mods/gameserver/model/Petition._state:Lext/mods/gameserver/enums/petitions/PetitionState;
   #33 = NameAndType        #34:#31       // _state:Lext/mods/gameserver/enums/petitions/PetitionState;
   #34 = Utf8               _state
   #35 = Fieldref           #36.#37       // ext/mods/gameserver/enums/petitions/PetitionRate.FAIR:Lext/mods/gameserver/enums/petitions/PetitionRate;
   #36 = Class              #38           // ext/mods/gameserver/enums/petitions/PetitionRate
   #37 = NameAndType        #39:#40       // FAIR:Lext/mods/gameserver/enums/petitions/PetitionRate;
   #38 = Utf8               ext/mods/gameserver/enums/petitions/PetitionRate
   #39 = Utf8               FAIR
   #40 = Utf8               Lext/mods/gameserver/enums/petitions/PetitionRate;
   #41 = Fieldref           #11.#42       // ext/mods/gameserver/model/Petition._rate:Lext/mods/gameserver/enums/petitions/PetitionRate;
   #42 = NameAndType        #43:#40       // _rate:Lext/mods/gameserver/enums/petitions/PetitionRate;
   #43 = Utf8               _rate
   #44 = String             #45           //
   #45 = Utf8
   #46 = Fieldref           #11.#47       // ext/mods/gameserver/model/Petition._feedback:Ljava/lang/String;
   #47 = NameAndType        #48:#49       // _feedback:Ljava/lang/String;
   #48 = Utf8               _feedback
   #49 = Utf8               Ljava/lang/String;
   #50 = Methodref          #51.#52       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #51 = Class              #53           // ext/mods/gameserver/idfactory/IdFactory
   #52 = NameAndType        #54:#55       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #53 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #54 = Utf8               getInstance
   #55 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #56 = Methodref          #51.#57       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #57 = NameAndType        #58:#59       // getNextId:()I
   #58 = Utf8               getNextId
   #59 = Utf8               ()I
   #60 = Fieldref           #11.#61       // ext/mods/gameserver/model/Petition._id:I
   #61 = NameAndType        #62:#63       // _id:I
   #62 = Utf8               _id
   #63 = Utf8               I
   #64 = Fieldref           #11.#65       // ext/mods/gameserver/model/Petition._type:Lext/mods/gameserver/enums/petitions/PetitionType;
   #65 = NameAndType        #66:#67       // _type:Lext/mods/gameserver/enums/petitions/PetitionType;
   #66 = Utf8               _type
   #67 = Utf8               Lext/mods/gameserver/enums/petitions/PetitionType;
   #68 = Fieldref           #11.#69       // ext/mods/gameserver/model/Petition._petitionerObjectId:I
   #69 = NameAndType        #70:#63       // _petitionerObjectId:I
   #70 = Utf8               _petitionerObjectId
   #71 = Methodref          #72.#73       // java/lang/System.currentTimeMillis:()J
   #72 = Class              #74           // java/lang/System
   #73 = NameAndType        #75:#76       // currentTimeMillis:()J
   #74 = Utf8               java/lang/System
   #75 = Utf8               currentTimeMillis
   #76 = Utf8               ()J
   #77 = Fieldref           #11.#78       // ext/mods/gameserver/model/Petition._submitDate:J
   #78 = NameAndType        #79:#80       // _submitDate:J
   #79 = Utf8               _submitDate
   #80 = Utf8               J
   #81 = Fieldref           #11.#82       // ext/mods/gameserver/model/Petition._content:Ljava/lang/String;
   #82 = NameAndType        #83:#49       // _content:Ljava/lang/String;
   #83 = Utf8               _content
   #84 = String             #85           // oid
   #85 = Utf8               oid
   #86 = InterfaceMethodref #87.#88       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #87 = Class              #89           // java/sql/ResultSet
   #88 = NameAndType        #90:#91       // getInt:(Ljava/lang/String;)I
   #89 = Utf8               java/sql/ResultSet
   #90 = Utf8               getInt
   #91 = Utf8               (Ljava/lang/String;)I
   #92 = Class              #93           // ext/mods/gameserver/enums/petitions/PetitionType
   #93 = Utf8               ext/mods/gameserver/enums/petitions/PetitionType
   #94 = String             #95           // type
   #95 = Utf8               type
   #96 = InterfaceMethodref #87.#97       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #97 = NameAndType        #98:#99       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #98 = Utf8               getString
   #99 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #100 = Methodref          #101.#102     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #101 = Class              #103          // java/lang/Enum
  #102 = NameAndType        #104:#105     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #103 = Utf8               java/lang/Enum
  #104 = Utf8               valueOf
  #105 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #106 = String             #107          // petitioner_oid
  #107 = Utf8               petitioner_oid
  #108 = String             #109          // submit_date
  #109 = Utf8               submit_date
  #110 = InterfaceMethodref #87.#111      // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #111 = NameAndType        #112:#113     // getLong:(Ljava/lang/String;)J
  #112 = Utf8               getLong
  #113 = Utf8               (Ljava/lang/String;)J
  #114 = String             #115          // content
  #115 = Utf8               content
  #116 = String             #117          // is_unread
  #117 = Utf8               is_unread
  #118 = String             #119          // state
  #119 = Utf8               state
  #120 = String             #121          // rate
  #121 = Utf8               rate
  #122 = String             #123          // feedback
  #123 = Utf8               feedback
  #124 = String             #125          // responders
  #125 = Utf8               responders
  #126 = Class              #127          // java/lang/String
  #127 = Utf8               java/lang/String
  #128 = Methodref          #129.#130     // ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
  #129 = Class              #131          // ext/mods/commons/lang/StringUtil
  #130 = NameAndType        #132:#133     // isEmpty:([Ljava/lang/String;)Z
  #131 = Utf8               ext/mods/commons/lang/StringUtil
  #132 = Utf8               isEmpty
  #133 = Utf8               ([Ljava/lang/String;)Z
  #134 = String             #135          // ;
  #135 = Utf8               ;
  #136 = Methodref          #126.#137     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #137 = NameAndType        #138:#139     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #138 = Utf8               split
  #139 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #140 = Methodref          #141.#142     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #141 = Class              #143          // java/lang/Integer
  #142 = NameAndType        #144:#91      // parseInt:(Ljava/lang/String;)I
  #143 = Utf8               java/lang/Integer
  #144 = Utf8               parseInt
  #145 = Methodref          #141.#146     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #146 = NameAndType        #104:#147     // valueOf:(I)Ljava/lang/Integer;
  #147 = Utf8               (I)Ljava/lang/Integer;
  #148 = InterfaceMethodref #149.#150     // java/util/List.add:(Ljava/lang/Object;)Z
  #149 = Class              #151          // java/util/List
  #150 = NameAndType        #152:#153     // add:(Ljava/lang/Object;)Z
  #151 = Utf8               java/util/List
  #152 = Utf8               add
  #153 = Utf8               (Ljava/lang/Object;)Z
  #154 = Class              #155          // java/lang/StringBuilder
  #155 = Utf8               java/lang/StringBuilder
  #156 = InterfaceMethodref #149.#157     // java/util/List.size:()I
  #157 = NameAndType        #158:#59      // size:()I
  #158 = Utf8               size
  #159 = Methodref          #154.#160     // java/lang/StringBuilder."<init>":(I)V
  #160 = NameAndType        #5:#161       // "<init>":(I)V
  #161 = Utf8               (I)V
  #162 = InterfaceMethodref #149.#163     // java/util/List.iterator:()Ljava/util/Iterator;
  #163 = NameAndType        #164:#165     // iterator:()Ljava/util/Iterator;
  #164 = Utf8               iterator
  #165 = Utf8               ()Ljava/util/Iterator;
  #166 = InterfaceMethodref #167.#168     // java/util/Iterator.hasNext:()Z
  #167 = Class              #169          // java/util/Iterator
  #168 = NameAndType        #170:#171     // hasNext:()Z
  #169 = Utf8               java/util/Iterator
  #170 = Utf8               hasNext
  #171 = Utf8               ()Z
  #172 = InterfaceMethodref #167.#173     // java/util/Iterator.next:()Ljava/lang/Object;
  #173 = NameAndType        #174:#175     // next:()Ljava/lang/Object;
  #174 = Utf8               next
  #175 = Utf8               ()Ljava/lang/Object;
  #176 = Methodref          #141.#177     // java/lang/Integer.intValue:()I
  #177 = NameAndType        #178:#59      // intValue:()I
  #178 = Utf8               intValue
  #179 = Methodref          #180.#181     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #180 = Class              #182          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #181 = NameAndType        #54:#183      // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #182 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #183 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #184 = Methodref          #180.#185     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
  #185 = NameAndType        #186:#187     // getPlayerName:(I)Ljava/lang/String;
  #186 = Utf8               getPlayerName
  #187 = Utf8               (I)Ljava/lang/String;
  #188 = Methodref          #154.#189     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #189 = NameAndType        #190:#191     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #190 = Utf8               append
  #191 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #192 = String             #193          //
  #193 = Utf8
  #194 = Methodref          #154.#195     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #195 = NameAndType        #196:#197     // toString:()Ljava/lang/String;
  #196 = Utf8               toString
  #197 = Utf8               ()Ljava/lang/String;
  #198 = Methodref          #199.#200     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #199 = Class              #201          // ext/mods/gameserver/model/actor/Player
  #200 = NameAndType        #202:#59      // getObjectId:()I
  #201 = Utf8               ext/mods/gameserver/model/actor/Player
  #202 = Utf8               getObjectId
  #203 = InterfaceMethodref #149.#204     // java/util/List.contains:(Ljava/lang/Object;)Z
  #204 = NameAndType        #205:#153     // contains:(Ljava/lang/Object;)Z
  #205 = Utf8               contains
  #206 = Methodref          #11.#207      // ext/mods/gameserver/model/Petition.addResponder:(Lext/mods/gameserver/model/actor/Player;)Z
  #207 = NameAndType        #208:#209     // addResponder:(Lext/mods/gameserver/model/actor/Player;)Z
  #208 = Utf8               addResponder
  #209 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #210 = Fieldref           #211.#212     // ext/mods/gameserver/network/SystemMessageId.FAILED_ADDING_S1_TO_PETITION:Lext/mods/gameserver/network/SystemMessageId;
  #211 = Class              #213          // ext/mods/gameserver/network/SystemMessageId
  #212 = NameAndType        #214:#215     // FAILED_ADDING_S1_TO_PETITION:Lext/mods/gameserver/network/SystemMessageId;
  #213 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #214 = Utf8               FAILED_ADDING_S1_TO_PETITION
  #215 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #216 = Methodref          #217.#218     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #217 = Class              #219          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #218 = NameAndType        #220:#221     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #219 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #220 = Utf8               getSystemMessage
  #221 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #222 = Methodref          #217.#223     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #223 = NameAndType        #224:#225     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #224 = Utf8               addCharName
  #225 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #226 = Methodref          #199.#227     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #227 = NameAndType        #228:#229     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #228 = Utf8               sendPacket
  #229 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #230 = InterfaceMethodref #149.#231     // java/util/List.isEmpty:()Z
  #231 = NameAndType        #132:#171     // isEmpty:()Z
  #232 = Methodref          #11.#233      // ext/mods/gameserver/model/Petition.showCompleteLog:(Lext/mods/gameserver/model/actor/Player;)V
  #233 = NameAndType        #234:#235     // showCompleteLog:(Lext/mods/gameserver/model/actor/Player;)V
  #234 = Utf8               showCompleteLog
  #235 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #236 = Fieldref           #211.#237     // ext/mods/gameserver/network/SystemMessageId.S1_PARTICIPATE_PETITION:Lext/mods/gameserver/network/SystemMessageId;
  #237 = NameAndType        #238:#215     // S1_PARTICIPATE_PETITION:Lext/mods/gameserver/network/SystemMessageId;
  #238 = Utf8               S1_PARTICIPATE_PETITION
  #239 = Methodref          #11.#240      // ext/mods/gameserver/model/Petition.sendPetitionerPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #240 = NameAndType        #241:#229     // sendPetitionerPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #241 = Utf8               sendPetitionerPacket
  #242 = Methodref          #11.#243      // ext/mods/gameserver/model/Petition.sendResponderPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #243 = NameAndType        #244:#229     // sendResponderPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #244 = Utf8               sendResponderPacket
  #245 = Fieldref           #211.#246     // ext/mods/gameserver/network/SystemMessageId.S1_LEFT_PETITION_CHAT:Lext/mods/gameserver/network/SystemMessageId;
  #246 = NameAndType        #247:#215     // S1_LEFT_PETITION_CHAT:Lext/mods/gameserver/network/SystemMessageId;
  #247 = Utf8               S1_LEFT_PETITION_CHAT
  #248 = InterfaceMethodref #149.#249     // java/util/List.remove:(Ljava/lang/Object;)Z
  #249 = NameAndType        #250:#153     // remove:(Ljava/lang/Object;)Z
  #250 = Utf8               remove
  #251 = Fieldref           #27.#252      // ext/mods/gameserver/enums/petitions/PetitionState.ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #252 = NameAndType        #253:#31      // ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #253 = Utf8               ACCEPTED
  #254 = Methodref          #11.#255      // ext/mods/gameserver/model/Petition.addAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #255 = NameAndType        #256:#257     // addAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #256 = Utf8               addAdditionalResponder
  #257 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #258 = Methodref          #11.#259      // ext/mods/gameserver/model/Petition.setState:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
  #259 = NameAndType        #260:#261     // setState:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
  #260 = Utf8               setState
  #261 = Utf8               (Lext/mods/gameserver/enums/petitions/PetitionState;)V
  #262 = Fieldref           #211.#263     // ext/mods/gameserver/network/SystemMessageId.S1_RECEIVED_CONSULTATION_REQUEST:Lext/mods/gameserver/network/SystemMessageId;
  #263 = NameAndType        #264:#215     // S1_RECEIVED_CONSULTATION_REQUEST:Lext/mods/gameserver/network/SystemMessageId;
  #264 = Utf8               S1_RECEIVED_CONSULTATION_REQUEST
  #265 = Methodref          #11.#266      // ext/mods/gameserver/model/Petition.getPetitionerName:()Ljava/lang/String;
  #266 = NameAndType        #267:#197     // getPetitionerName:()Ljava/lang/String;
  #267 = Utf8               getPetitionerName
  #268 = Methodref          #217.#269     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #269 = NameAndType        #270:#271     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #270 = Utf8               addString
  #271 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #272 = Fieldref           #211.#273     // ext/mods/gameserver/network/SystemMessageId.PETITION_S1_RECEIVED_CODE_IS_S2:Lext/mods/gameserver/network/SystemMessageId;
  #273 = NameAndType        #274:#215     // PETITION_S1_RECEIVED_CODE_IS_S2:Lext/mods/gameserver/network/SystemMessageId;
  #274 = Utf8               PETITION_S1_RECEIVED_CODE_IS_S2
  #275 = Methodref          #217.#276     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #276 = NameAndType        #277:#278     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #277 = Utf8               addNumber
  #278 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #279 = Fieldref           #211.#280     // ext/mods/gameserver/network/SystemMessageId.PETITION_APP_ACCEPTED:Lext/mods/gameserver/network/SystemMessageId;
  #280 = NameAndType        #281:#215     // PETITION_APP_ACCEPTED:Lext/mods/gameserver/network/SystemMessageId;
  #281 = Utf8               PETITION_APP_ACCEPTED
  #282 = Fieldref           #211.#283     // ext/mods/gameserver/network/SystemMessageId.PETITION_WITH_S1_UNDER_WAY:Lext/mods/gameserver/network/SystemMessageId;
  #283 = NameAndType        #284:#215     // PETITION_WITH_S1_UNDER_WAY:Lext/mods/gameserver/network/SystemMessageId;
  #284 = Utf8               PETITION_WITH_S1_UNDER_WAY
  #285 = Methodref          #286.#287     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #286 = Class              #288          // ext/mods/gameserver/model/World
  #287 = NameAndType        #54:#289      // getInstance:()Lext/mods/gameserver/model/World;
  #288 = Utf8               ext/mods/gameserver/model/World
  #289 = Utf8               ()Lext/mods/gameserver/model/World;
  #290 = Methodref          #286.#291     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #291 = NameAndType        #292:#293     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #292 = Utf8               getPlayer
  #293 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #294 = Methodref          #199.#295     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #295 = NameAndType        #296:#171     // isOnline:()Z
  #296 = Utf8               isOnline
  #297 = Methodref          #199.#298     // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #298 = NameAndType        #299:#171     // isGM:()Z
  #299 = Utf8               isGM
  #300 = Methodref          #11.#301      // ext/mods/gameserver/model/Petition.endConsultation:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
  #301 = NameAndType        #302:#261     // endConsultation:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
  #302 = Utf8               endConsultation
  #303 = Methodref          #11.#304      // ext/mods/gameserver/model/Petition.removeAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;)V
  #304 = NameAndType        #305:#235     // removeAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;)V
  #305 = Utf8               removeAdditionalResponder
  #306 = Methodref          #199.#307     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #307 = NameAndType        #308:#197     // getName:()Ljava/lang/String;
  #308 = Utf8               getName
  #309 = Fieldref           #211.#310     // ext/mods/gameserver/network/SystemMessageId.PETITION_ENDED_WITH_S1:Lext/mods/gameserver/network/SystemMessageId;
  #310 = NameAndType        #311:#215     // PETITION_ENDED_WITH_S1:Lext/mods/gameserver/network/SystemMessageId;
  #311 = Utf8               PETITION_ENDED_WITH_S1
  #312 = Fieldref           #27.#313      // ext/mods/gameserver/enums/petitions/PetitionState.CANCELLED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #313 = NameAndType        #314:#31      // CANCELLED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #314 = Utf8               CANCELLED
  #315 = Fieldref           #211.#316     // ext/mods/gameserver/network/SystemMessageId.RECEIPT_NO_S1_CANCELED:Lext/mods/gameserver/network/SystemMessageId;
  #316 = NameAndType        #317:#215     // RECEIPT_NO_S1_CANCELED:Lext/mods/gameserver/network/SystemMessageId;
  #317 = Utf8               RECEIPT_NO_S1_CANCELED
  #318 = Methodref          #11.#319      // ext/mods/gameserver/model/Petition.getId:()I
  #319 = NameAndType        #320:#59      // getId:()I
  #320 = Utf8               getId
  #321 = String             #322          // The GM
  #322 = Utf8               The GM
  #323 = Fieldref           #27.#324      // ext/mods/gameserver/enums/petitions/PetitionState.CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #324 = NameAndType        #325:#31      // CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #325 = Utf8               CLOSED
  #326 = Fieldref           #211.#327     // ext/mods/gameserver/network/SystemMessageId.THIS_END_THE_PETITION_PLEASE_PROVIDE_FEEDBACK:Lext/mods/gameserver/network/SystemMessageId;
  #327 = NameAndType        #328:#215     // THIS_END_THE_PETITION_PLEASE_PROVIDE_FEEDBACK:Lext/mods/gameserver/network/SystemMessageId;
  #328 = Utf8               THIS_END_THE_PETITION_PLEASE_PROVIDE_FEEDBACK
  #329 = Methodref          #199.#330     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #330 = NameAndType        #228:#331     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #331 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #332 = Fieldref           #333.#334     // ext/mods/gameserver/network/serverpackets/PetitionVote.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PetitionVote;
  #333 = Class              #335          // ext/mods/gameserver/network/serverpackets/PetitionVote
  #334 = NameAndType        #336:#337     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PetitionVote;
  #335 = Utf8               ext/mods/gameserver/network/serverpackets/PetitionVote
  #336 = Utf8               STATIC_PACKET
  #337 = Utf8               Lext/mods/gameserver/network/serverpackets/PetitionVote;
  #338 = InterfaceMethodref #149.#339     // java/util/List.clear:()V
  #339 = NameAndType        #340:#6       // clear:()V
  #340 = Utf8               clear
  #341 = Class              #342          // ext/mods/gameserver/network/serverpackets/CreatureSay
  #342 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #343 = Methodref          #11.#344      // ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
  #344 = NameAndType        #345:#59      // getPetitionerObjectId:()I
  #345 = Utf8               getPetitionerObjectId
  #346 = Fieldref           #347.#348     // ext/mods/gameserver/enums/SayType.PETITION_PLAYER:Lext/mods/gameserver/enums/SayType;
  #347 = Class              #349          // ext/mods/gameserver/enums/SayType
  #348 = NameAndType        #350:#351     // PETITION_PLAYER:Lext/mods/gameserver/enums/SayType;
  #349 = Utf8               ext/mods/gameserver/enums/SayType
  #350 = Utf8               PETITION_PLAYER
  #351 = Utf8               Lext/mods/gameserver/enums/SayType;
  #352 = Methodref          #341.#353     // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #353 = NameAndType        #5:#354       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #354 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #355 = Fieldref           #347.#356     // ext/mods/gameserver/enums/SayType.PETITION_GM:Lext/mods/gameserver/enums/SayType;
  #356 = NameAndType        #357:#351     // PETITION_GM:Lext/mods/gameserver/enums/SayType;
  #357 = Utf8               PETITION_GM
  #358 = Methodref          #11.#359      // ext/mods/gameserver/model/Petition.addMessage:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
  #359 = NameAndType        #360:#361     // addMessage:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
  #360 = Utf8               addMessage
  #361 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
  #362 = Utf8               Signature
  #363 = Utf8               Ljava/util/List<Lext/mods/gameserver/network/serverpackets/CreatureSay;>;
  #364 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #365 = Utf8               (Lext/mods/gameserver/enums/petitions/PetitionType;ILjava/lang/String;)V
  #366 = Utf8               Code
  #367 = Utf8               LineNumberTable
  #368 = Utf8               LocalVariableTable
  #369 = Utf8               this
  #370 = Utf8               Lext/mods/gameserver/model/Petition;
  #371 = Utf8               petitionerObjectId
  #372 = Utf8               (Ljava/sql/ResultSet;)V
  #373 = Utf8               string
  #374 = Utf8               rs
  #375 = Utf8               Ljava/sql/ResultSet;
  #376 = Utf8               StackMapTable
  #377 = Class              #378          // "[Ljava/lang/String;"
  #378 = Utf8               [Ljava/lang/String;
  #379 = Utf8               Exceptions
  #380 = Class              #381          // java/sql/SQLException
  #381 = Utf8               java/sql/SQLException
  #382 = Utf8               getMessages
  #383 = Utf8               ()Ljava/util/List;
  #384 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/network/serverpackets/CreatureSay;>;
  #385 = Utf8               cs
  #386 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #387 = Utf8               getResponders
  #388 = Utf8               ()Ljava/util/List<Ljava/lang/Integer;>;
  #389 = Utf8               getFormattedResponders
  #390 = Utf8               playerName
  #391 = Utf8               responderId
  #392 = Utf8               sb
  #393 = Utf8               Ljava/lang/StringBuilder;
  #394 = Utf8               getType
  #395 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionType;
  #396 = Utf8               getSubmitDate
  #397 = Utf8               getContent
  #398 = Utf8               isUnread
  #399 = Utf8               setAsRead
  #400 = Utf8               isUnderFeedback
  #401 = Utf8               getState
  #402 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionState;
  #403 = Utf8               getRate
  #404 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionRate;
  #405 = Utf8               getFeedback
  #406 = Utf8               setFeedback
  #407 = Utf8               (Lext/mods/gameserver/enums/petitions/PetitionRate;Ljava/lang/String;)V
  #408 = Utf8               player
  #409 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #410 = Utf8               targetPlayer
  #411 = Utf8               join
  #412 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #413 = Utf8               isEnforcing
  #414 = Utf8               abortConsultation
  #415 = Utf8               responder
  #416 = Utf8               wasLastRegisteredGm
  #417 = Utf8               endState
  #418 = Utf8               petitioner
  #419 = Utf8               petitionerName
  #420 = Utf8               packet
  #421 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #422 = Utf8               sendMessage
  #423 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #424 = Utf8               message
  #425 = Utf8               SourceFile
  #426 = Utf8               Petition.java
{
  public ext.mods.gameserver.model.Petition(ext.mods.gameserver.enums.petitions.PetitionType, int, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/petitions/PetitionType;ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _messages:Ljava/util/List;
        15: aload_0
        16: new           #7                  // class java/util/ArrayList
        19: dup
        20: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        23: putfield      #16                 // Field _responders:Ljava/util/List;
        26: aload_0
        27: iconst_1
        28: putfield      #19                 // Field _isUnread:Z
        31: aload_0
        32: iconst_0
        33: putfield      #23                 // Field _isUnderFeedback:Z
        36: aload_0
        37: getstatic     #26                 // Field ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
        40: putfield      #32                 // Field _state:Lext/mods/gameserver/enums/petitions/PetitionState;
        43: aload_0
        44: getstatic     #35                 // Field ext/mods/gameserver/enums/petitions/PetitionRate.FAIR:Lext/mods/gameserver/enums/petitions/PetitionRate;
        47: putfield      #41                 // Field _rate:Lext/mods/gameserver/enums/petitions/PetitionRate;
        50: aload_0
        51: ldc           #44                 // String
        53: putfield      #46                 // Field _feedback:Ljava/lang/String;
        56: aload_0
        57: invokestatic  #50                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        60: invokevirtual #56                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        63: putfield      #60                 // Field _id:I
        66: aload_0
        67: aload_1
        68: putfield      #64                 // Field _type:Lext/mods/gameserver/enums/petitions/PetitionType;
        71: aload_0
        72: iload_2
        73: putfield      #68                 // Field _petitionerObjectId:I
        76: aload_0
        77: invokestatic  #71                 // Method java/lang/System.currentTimeMillis:()J
        80: putfield      #77                 // Field _submitDate:J
        83: aload_0
        84: aload_3
        85: putfield      #81                 // Field _content:Ljava/lang/String;
        88: return
      LineNumberTable:
        line 62: 0
        line 45: 4
        line 46: 15
        line 54: 26
        line 55: 31
        line 57: 36
        line 58: 43
        line 59: 50
        line 63: 56
        line 64: 66
        line 65: 71
        line 66: 76
        line 67: 83
        line 68: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      89     0  this   Lext/mods/gameserver/model/Petition;
            0      89     1  type   Lext/mods/gameserver/enums/petitions/PetitionType;
            0      89     2 petitionerObjectId   I
            0      89     3 content   Ljava/lang/String;

  public ext.mods.gameserver.model.Petition(java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _messages:Ljava/util/List;
        15: aload_0
        16: new           #7                  // class java/util/ArrayList
        19: dup
        20: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        23: putfield      #16                 // Field _responders:Ljava/util/List;
        26: aload_0
        27: iconst_1
        28: putfield      #19                 // Field _isUnread:Z
        31: aload_0
        32: iconst_0
        33: putfield      #23                 // Field _isUnderFeedback:Z
        36: aload_0
        37: getstatic     #26                 // Field ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
        40: putfield      #32                 // Field _state:Lext/mods/gameserver/enums/petitions/PetitionState;
        43: aload_0
        44: getstatic     #35                 // Field ext/mods/gameserver/enums/petitions/PetitionRate.FAIR:Lext/mods/gameserver/enums/petitions/PetitionRate;
        47: putfield      #41                 // Field _rate:Lext/mods/gameserver/enums/petitions/PetitionRate;
        50: aload_0
        51: ldc           #44                 // String
        53: putfield      #46                 // Field _feedback:Ljava/lang/String;
        56: aload_0
        57: aload_1
        58: ldc           #84                 // String oid
        60: invokeinterface #86,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        65: putfield      #60                 // Field _id:I
        68: aload_0
        69: ldc           #92                 // class ext/mods/gameserver/enums/petitions/PetitionType
        71: aload_1
        72: ldc           #94                 // String type
        74: invokeinterface #96,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        79: invokestatic  #100                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        82: checkcast     #92                 // class ext/mods/gameserver/enums/petitions/PetitionType
        85: putfield      #64                 // Field _type:Lext/mods/gameserver/enums/petitions/PetitionType;
        88: aload_0
        89: aload_1
        90: ldc           #106                // String petitioner_oid
        92: invokeinterface #86,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        97: putfield      #68                 // Field _petitionerObjectId:I
       100: aload_0
       101: aload_1
       102: ldc           #108                // String submit_date
       104: invokeinterface #110,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       109: putfield      #77                 // Field _submitDate:J
       112: aload_0
       113: aload_1
       114: ldc           #114                // String content
       116: invokeinterface #96,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       121: putfield      #81                 // Field _content:Ljava/lang/String;
       124: aload_0
       125: aload_1
       126: ldc           #116                // String is_unread
       128: invokeinterface #86,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       133: ifeq          140
       136: iconst_1
       137: goto          141
       140: iconst_0
       141: putfield      #19                 // Field _isUnread:Z
       144: aload_0
       145: ldc           #27                 // class ext/mods/gameserver/enums/petitions/PetitionState
       147: aload_1
       148: ldc           #118                // String state
       150: invokeinterface #96,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       155: invokestatic  #100                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       158: checkcast     #27                 // class ext/mods/gameserver/enums/petitions/PetitionState
       161: putfield      #32                 // Field _state:Lext/mods/gameserver/enums/petitions/PetitionState;
       164: aload_0
       165: ldc           #36                 // class ext/mods/gameserver/enums/petitions/PetitionRate
       167: aload_1
       168: ldc           #120                // String rate
       170: invokeinterface #96,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       175: invokestatic  #100                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       178: checkcast     #36                 // class ext/mods/gameserver/enums/petitions/PetitionRate
       181: putfield      #41                 // Field _rate:Lext/mods/gameserver/enums/petitions/PetitionRate;
       184: aload_0
       185: aload_1
       186: ldc           #122                // String feedback
       188: invokeinterface #96,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       193: putfield      #46                 // Field _feedback:Ljava/lang/String;
       196: aload_1
       197: ldc           #124                // String responders
       199: invokeinterface #96,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       204: astore_2
       205: iconst_1
       206: anewarray     #126                // class java/lang/String
       209: dup
       210: iconst_0
       211: aload_2
       212: aastore
       213: invokestatic  #128                // Method ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
       216: ifne          270
       219: aload_2
       220: ldc           #134                // String ;
       222: invokevirtual #136                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       225: astore_3
       226: aload_3
       227: arraylength
       228: istore        4
       230: iconst_0
       231: istore        5
       233: iload         5
       235: iload         4
       237: if_icmpge     270
       240: aload_3
       241: iload         5
       243: aaload
       244: astore        6
       246: aload_0
       247: getfield      #16                 // Field _responders:Ljava/util/List;
       250: aload         6
       252: invokestatic  #140                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       255: invokestatic  #145                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       258: invokeinterface #148,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       263: pop
       264: iinc          5, 1
       267: goto          233
       270: return
      LineNumberTable:
        line 71: 0
        line 45: 4
        line 46: 15
        line 54: 26
        line 55: 31
        line 57: 36
        line 58: 43
        line 59: 50
        line 72: 56
        line 73: 68
        line 74: 88
        line 75: 100
        line 76: 112
        line 77: 124
        line 78: 144
        line 79: 164
        line 80: 184
        line 82: 196
        line 83: 205
        line 85: 219
        line 86: 246
        line 85: 264
        line 88: 270
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          246      18     6 string   Ljava/lang/String;
            0     271     0  this   Lext/mods/gameserver/model/Petition;
            0     271     1    rs   Ljava/sql/ResultSet;
          205      66     2 responders   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 140
          locals = [ class ext/mods/gameserver/model/Petition, class java/sql/ResultSet ]
          stack = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/Petition, class java/sql/ResultSet ]
          stack = [ class ext/mods/gameserver/model/Petition, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 91
          locals = [ class ext/mods/gameserver/model/Petition, class java/sql/ResultSet, class java/lang/String, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 36
    Exceptions:
      throws java.sql.SQLException

  public java.util.List<ext.mods.gameserver.network.serverpackets.CreatureSay> getMessages();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _messages:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;
    Signature: #384                         // ()Ljava/util/List<Lext/mods/gameserver/network/serverpackets/CreatureSay;>;

  public boolean addMessage(ext.mods.gameserver.network.serverpackets.CreatureSay);
    descriptor: (Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _messages:Ljava/util/List;
         4: aload_1
         5: invokeinterface #148,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/Petition;
            0      11     1    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;

  public java.util.List<java.lang.Integer> getResponders();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _responders:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;
    Signature: #388                         // ()Ljava/util/List<Ljava/lang/Integer;>;

  public java.lang.String getFormattedResponders();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: new           #154                // class java/lang/StringBuilder
         3: dup
         4: aload_0
         5: getfield      #16                 // Field _responders:Ljava/util/List;
         8: invokeinterface #156,  1          // InterfaceMethod java/util/List.size:()I
        13: bipush        20
        15: imul
        16: invokespecial #159                // Method java/lang/StringBuilder."<init>":(I)V
        19: astore_1
        20: aload_0
        21: getfield      #16                 // Field _responders:Ljava/util/List;
        24: invokeinterface #162,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        29: astore_2
        30: aload_2
        31: invokeinterface #166,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        36: ifeq          84
        39: aload_2
        40: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        45: checkcast     #141                // class java/lang/Integer
        48: invokevirtual #176                // Method java/lang/Integer.intValue:()I
        51: istore_3
        52: invokestatic  #179                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        55: iload_3
        56: invokevirtual #184                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
        59: astore        4
        61: aload         4
        63: ifnonnull     69
        66: goto          30
        69: aload_1
        70: aload         4
        72: invokevirtual #188                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        75: ldc           #192                // String
        77: invokevirtual #188                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        80: pop
        81: goto          30
        84: aload_1
        85: invokevirtual #194                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        88: areturn
      LineNumberTable:
        line 107: 0
        line 108: 20
        line 110: 52
        line 111: 61
        line 112: 66
        line 114: 69
        line 115: 81
        line 116: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           61      20     4 playerName   Ljava/lang/String;
           52      29     3 responderId   I
            0      89     0  this   Lext/mods/gameserver/model/Petition;
           20      69     1    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ int, class java/lang/String ]
        frame_type = 248 /* chop */
          offset_delta = 14

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #60                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 121: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public ext.mods.gameserver.enums.petitions.PetitionType getType();
    descriptor: ()Lext/mods/gameserver/enums/petitions/PetitionType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field _type:Lext/mods/gameserver/enums/petitions/PetitionType;
         4: areturn
      LineNumberTable:
        line 126: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public int getPetitionerObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _petitionerObjectId:I
         4: ireturn
      LineNumberTable:
        line 131: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public java.lang.String getPetitionerName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #179                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
         3: aload_0
         4: getfield      #68                 // Field _petitionerObjectId:I
         7: invokevirtual #184                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
        10: areturn
      LineNumberTable:
        line 136: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/Petition;

  public long getSubmitDate();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #77                 // Field _submitDate:J
         4: lreturn
      LineNumberTable:
        line 141: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public java.lang.String getContent();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #81                 // Field _content:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public boolean isUnread();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _isUnread:Z
         4: ireturn
      LineNumberTable:
        line 151: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public void setAsRead();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #19                 // Field _isUnread:Z
         5: return
      LineNumberTable:
        line 156: 0
        line 157: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/Petition;

  public boolean isUnderFeedback();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _isUnderFeedback:Z
         4: ireturn
      LineNumberTable:
        line 161: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public ext.mods.gameserver.enums.petitions.PetitionState getState();
    descriptor: ()Lext/mods/gameserver/enums/petitions/PetitionState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _state:Lext/mods/gameserver/enums/petitions/PetitionState;
         4: areturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public void setState(ext.mods.gameserver.enums.petitions.PetitionState);
    descriptor: (Lext/mods/gameserver/enums/petitions/PetitionState;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #32                 // Field _state:Lext/mods/gameserver/enums/petitions/PetitionState;
         5: return
      LineNumberTable:
        line 171: 0
        line 172: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/Petition;
            0       6     1 state   Lext/mods/gameserver/enums/petitions/PetitionState;

  public ext.mods.gameserver.enums.petitions.PetitionRate getRate();
    descriptor: ()Lext/mods/gameserver/enums/petitions/PetitionRate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _rate:Lext/mods/gameserver/enums/petitions/PetitionRate;
         4: areturn
      LineNumberTable:
        line 176: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public java.lang.String getFeedback();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _feedback:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 181: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Petition;

  public void setFeedback(ext.mods.gameserver.enums.petitions.PetitionRate, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/petitions/PetitionRate;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: iconst_0
         2: putfield      #23                 // Field _isUnderFeedback:Z
         5: aload_0
         6: aload_1
         7: putfield      #41                 // Field _rate:Lext/mods/gameserver/enums/petitions/PetitionRate;
        10: aload_0
        11: aload_2
        12: putfield      #46                 // Field _feedback:Ljava/lang/String;
        15: return
      LineNumberTable:
        line 186: 0
        line 188: 5
        line 189: 10
        line 190: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/Petition;
            0      16     1  rate   Lext/mods/gameserver/enums/petitions/PetitionRate;
            0      16     2 feedback   Ljava/lang/String;

  public boolean addResponder(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        57
         4: aload_1
         5: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: aload_0
         9: getfield      #68                 // Field _petitionerObjectId:I
        12: if_icmpeq     57
        15: aload_0
        16: getfield      #16                 // Field _responders:Ljava/util/List;
        19: aload_1
        20: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        23: invokestatic  #145                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        26: invokeinterface #203,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        31: ifne          57
        34: aload_0
        35: getfield      #16                 // Field _responders:Ljava/util/List;
        38: aload_1
        39: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        42: invokestatic  #145                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        45: invokeinterface #148,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        50: ifeq          57
        53: iconst_1
        54: goto          58
        57: iconst_0
        58: ireturn
      LineNumberTable:
        line 199: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/Petition;
            0      59     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 57 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean addAdditionalResponder(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: invokevirtual #206                // Method addResponder:(Lext/mods/gameserver/model/actor/Player;)Z
         5: ifne          24
         8: aload_1
         9: getstatic     #210                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_ADDING_S1_TO_PETITION:Lext/mods/gameserver/network/SystemMessageId;
        12: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        15: aload_2
        16: invokevirtual #222                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        19: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        22: iconst_0
        23: ireturn
        24: aload_0
        25: getfield      #10                 // Field _messages:Ljava/util/List;
        28: invokeinterface #230,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        33: ifne          41
        36: aload_0
        37: aload_2
        38: invokevirtual #232                // Method showCompleteLog:(Lext/mods/gameserver/model/actor/Player;)V
        41: aload_0
        42: getstatic     #236                // Field ext/mods/gameserver/network/SystemMessageId.S1_PARTICIPATE_PETITION:Lext/mods/gameserver/network/SystemMessageId;
        45: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        48: aload_2
        49: invokevirtual #222                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        52: invokevirtual #239                // Method sendPetitionerPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        55: aload_0
        56: getstatic     #236                // Field ext/mods/gameserver/network/SystemMessageId.S1_PARTICIPATE_PETITION:Lext/mods/gameserver/network/SystemMessageId;
        59: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        62: aload_2
        63: invokevirtual #222                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        66: invokevirtual #242                // Method sendResponderPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        69: iconst_1
        70: ireturn
      LineNumberTable:
        line 204: 0
        line 206: 8
        line 207: 22
        line 210: 24
        line 211: 36
        line 213: 41
        line 214: 55
        line 215: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/Petition;
            0      71     1 player   Lext/mods/gameserver/model/actor/Player;
            0      71     2 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 16 /* same */

  public void removeAdditionalResponder(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getstatic     #245                // Field ext/mods/gameserver/network/SystemMessageId.S1_LEFT_PETITION_CHAT:Lext/mods/gameserver/network/SystemMessageId;
         4: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
         7: aload_1
         8: invokevirtual #222                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        11: invokevirtual #239                // Method sendPetitionerPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        14: aload_0
        15: getstatic     #245                // Field ext/mods/gameserver/network/SystemMessageId.S1_LEFT_PETITION_CHAT:Lext/mods/gameserver/network/SystemMessageId;
        18: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        21: aload_1
        22: invokevirtual #222                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        25: invokevirtual #242                // Method sendResponderPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        28: aload_0
        29: getfield      #16                 // Field _responders:Ljava/util/List;
        32: aload_1
        33: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        36: invokestatic  #145                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        39: invokeinterface #248,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        44: pop
        45: return
      LineNumberTable:
        line 220: 0
        line 221: 14
        line 223: 28
        line 224: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/Petition;
            0      46     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean join(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #32                 // Field _state:Lext/mods/gameserver/enums/petitions/PetitionState;
         4: getstatic     #251                // Field ext/mods/gameserver/enums/petitions/PetitionState.ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
         7: if_acmpne     17
        10: aload_0
        11: aload_1
        12: aload_1
        13: invokevirtual #254                // Method addAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
        16: ireturn
        17: aload_0
        18: getfield      #32                 // Field _state:Lext/mods/gameserver/enums/petitions/PetitionState;
        21: getstatic     #26                 // Field ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
        24: if_acmpeq     29
        27: iconst_0
        28: ireturn
        29: aload_0
        30: aload_1
        31: invokevirtual #206                // Method addResponder:(Lext/mods/gameserver/model/actor/Player;)Z
        34: ifne          39
        37: iconst_0
        38: ireturn
        39: aload_0
        40: getstatic     #251                // Field ext/mods/gameserver/enums/petitions/PetitionState.ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
        43: invokevirtual #258                // Method setState:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
        46: aload_0
        47: getfield      #10                 // Field _messages:Ljava/util/List;
        50: invokeinterface #230,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        55: ifne          66
        58: aload_0
        59: aload_1
        60: invokevirtual #232                // Method showCompleteLog:(Lext/mods/gameserver/model/actor/Player;)V
        63: goto          138
        66: iload_2
        67: ifeq          111
        70: aload_0
        71: getstatic     #262                // Field ext/mods/gameserver/network/SystemMessageId.S1_RECEIVED_CONSULTATION_REQUEST:Lext/mods/gameserver/network/SystemMessageId;
        74: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        77: aload_0
        78: invokevirtual #265                // Method getPetitionerName:()Ljava/lang/String;
        81: invokevirtual #268                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        84: invokevirtual #239                // Method sendPetitionerPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        87: aload_0
        88: getstatic     #272                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_S1_RECEIVED_CODE_IS_S2:Lext/mods/gameserver/network/SystemMessageId;
        91: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        94: aload_1
        95: invokevirtual #222                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        98: aload_0
        99: getfield      #60                 // Field _id:I
       102: invokevirtual #275                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       105: invokevirtual #242                // Method sendResponderPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       108: goto          138
       111: aload_0
       112: getstatic     #279                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_APP_ACCEPTED:Lext/mods/gameserver/network/SystemMessageId;
       115: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       118: invokevirtual #239                // Method sendPetitionerPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       121: aload_0
       122: getstatic     #282                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_WITH_S1_UNDER_WAY:Lext/mods/gameserver/network/SystemMessageId;
       125: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       128: aload_0
       129: invokevirtual #265                // Method getPetitionerName:()Ljava/lang/String;
       132: invokevirtual #268                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       135: invokevirtual #242                // Method sendResponderPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       138: iconst_1
       139: ireturn
      LineNumberTable:
        line 236: 0
        line 237: 10
        line 239: 17
        line 240: 27
        line 242: 29
        line 243: 37
        line 245: 39
        line 247: 46
        line 248: 58
        line 251: 66
        line 253: 70
        line 254: 87
        line 258: 111
        line 259: 121
        line 262: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     140     0  this   Lext/mods/gameserver/model/Petition;
            0     140     1 player   Lext/mods/gameserver/model/actor/Player;
            0     140     2 isEnforcing   Z
      StackMapTable: number_of_entries = 6
        frame_type = 17 /* same */
        frame_type = 11 /* same */
        frame_type = 9 /* same */
        frame_type = 26 /* same */
        frame_type = 44 /* same */
        frame_type = 26 /* same */

  public void abortConsultation(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: iconst_1
         1: istore_2
         2: aload_0
         3: getfield      #16                 // Field _responders:Ljava/util/List;
         6: invokeinterface #162,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        11: astore_3
        12: aload_3
        13: invokeinterface #166,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          86
        21: aload_3
        22: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #141                // class java/lang/Integer
        30: invokevirtual #176                // Method java/lang/Integer.intValue:()I
        33: istore        4
        35: iload         4
        37: aload_1
        38: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        41: if_icmpne     47
        44: goto          12
        47: invokestatic  #285                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        50: iload         4
        52: invokevirtual #290                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        55: astore        5
        57: aload         5
        59: ifnull        12
        62: aload         5
        64: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        67: ifeq          12
        70: aload         5
        72: invokevirtual #297                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        75: ifne          81
        78: goto          12
        81: iconst_0
        82: istore_2
        83: goto          86
        86: aload_0
        87: getfield      #16                 // Field _responders:Ljava/util/List;
        90: invokeinterface #156,  1          // InterfaceMethod java/util/List.size:()I
        95: iconst_1
        96: if_icmpeq     103
        99: iload_2
       100: ifeq          113
       103: aload_0
       104: getstatic     #26                 // Field ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
       107: invokevirtual #300                // Method endConsultation:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
       110: goto          118
       113: aload_0
       114: aload_1
       115: invokevirtual #303                // Method removeAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;)V
       118: return
      LineNumberTable:
        line 271: 0
        line 272: 2
        line 274: 35
        line 275: 44
        line 277: 47
        line 278: 57
        line 279: 78
        line 281: 81
        line 282: 83
        line 285: 86
        line 286: 103
        line 288: 113
        line 289: 118
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57      29     5 responder   Lext/mods/gameserver/model/actor/Player;
           35      51     4 responderId   I
            0     119     0  this   Lext/mods/gameserver/model/Petition;
            0     119     1 player   Lext/mods/gameserver/model/actor/Player;
            2     117     2 wasLastRegisteredGm   Z
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 248 /* chop */
          offset_delta = 4
        frame_type = 16 /* same */
        frame_type = 9 /* same */
        frame_type = 4 /* same */

  public void endConsultation(ext.mods.gameserver.enums.petitions.PetitionState);
    descriptor: (Lext/mods/gameserver/enums/petitions/PetitionState;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: invokestatic  #285                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: aload_0
         4: getfield      #68                 // Field _petitionerObjectId:I
         7: invokevirtual #290                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        10: astore_2
        11: aload_2
        12: ifnonnull     22
        15: aload_0
        16: invokevirtual #265                // Method getPetitionerName:()Ljava/lang/String;
        19: goto          26
        22: aload_2
        23: invokevirtual #306                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        26: astore_3
        27: aload_0
        28: aload_1
        29: invokevirtual #258                // Method setState:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
        32: aload_0
        33: getfield      #16                 // Field _responders:Ljava/util/List;
        36: invokeinterface #162,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        41: astore        4
        43: aload         4
        45: invokeinterface #166,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        50: ifeq          137
        53: aload         4
        55: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        60: checkcast     #141                // class java/lang/Integer
        63: invokevirtual #176                // Method java/lang/Integer.intValue:()I
        66: istore        5
        68: invokestatic  #285                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        71: iload         5
        73: invokevirtual #290                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        76: astore        6
        78: aload         6
        80: ifnull        43
        83: aload         6
        85: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        88: ifne          94
        91: goto          43
        94: aload         6
        96: getstatic     #309                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_ENDED_WITH_S1:Lext/mods/gameserver/network/SystemMessageId;
        99: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       102: aload_3
       103: invokevirtual #268                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       106: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       109: aload_1
       110: getstatic     #312                // Field ext/mods/gameserver/enums/petitions/PetitionState.CANCELLED:Lext/mods/gameserver/enums/petitions/PetitionState;
       113: if_acmpne     134
       116: aload         6
       118: getstatic     #315                // Field ext/mods/gameserver/network/SystemMessageId.RECEIPT_NO_S1_CANCELED:Lext/mods/gameserver/network/SystemMessageId;
       121: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       124: aload_0
       125: invokevirtual #318                // Method getId:()I
       128: invokevirtual #275                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       131: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       134: goto          43
       137: aload_2
       138: ifnull        200
       141: aload_2
       142: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       145: ifeq          200
       148: aload_1
       149: getstatic     #26                 // Field ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
       152: if_acmpne     174
       155: aload_2
       156: getstatic     #245                // Field ext/mods/gameserver/network/SystemMessageId.S1_LEFT_PETITION_CHAT:Lext/mods/gameserver/network/SystemMessageId;
       159: invokestatic  #216                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       162: ldc_w         #321                // String The GM
       165: invokevirtual #268                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       168: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       171: goto          200
       174: aload_1
       175: getstatic     #323                // Field ext/mods/gameserver/enums/petitions/PetitionState.CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
       178: if_acmpne     200
       181: aload_0
       182: iconst_1
       183: putfield      #23                 // Field _isUnderFeedback:Z
       186: aload_2
       187: getstatic     #326                // Field ext/mods/gameserver/network/SystemMessageId.THIS_END_THE_PETITION_PLEASE_PROVIDE_FEEDBACK:Lext/mods/gameserver/network/SystemMessageId;
       190: invokevirtual #329                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       193: aload_2
       194: getstatic     #332                // Field ext/mods/gameserver/network/serverpackets/PetitionVote.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PetitionVote;
       197: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       200: aload_1
       201: getstatic     #323                // Field ext/mods/gameserver/enums/petitions/PetitionState.CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
       204: if_acmpeq     216
       207: aload_0
       208: getfield      #16                 // Field _responders:Ljava/util/List;
       211: invokeinterface #338,  1          // InterfaceMethod java/util/List.clear:()V
       216: return
      LineNumberTable:
        line 299: 0
        line 300: 11
        line 302: 27
        line 304: 32
        line 306: 68
        line 307: 78
        line 308: 91
        line 310: 94
        line 312: 109
        line 313: 116
        line 314: 134
        line 316: 137
        line 318: 148
        line 319: 155
        line 320: 174
        line 322: 181
        line 324: 186
        line 325: 193
        line 329: 200
        line 330: 207
        line 331: 216
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           78      56     6 responder   Lext/mods/gameserver/model/actor/Player;
           68      66     5 responderId   I
            0     217     0  this   Lext/mods/gameserver/model/Petition;
            0     217     1 endState   Lext/mods/gameserver/enums/petitions/PetitionState;
           11     206     2 petitioner   Lext/mods/gameserver/model/actor/Player;
           27     190     3 petitionerName   Ljava/lang/String;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 16
          locals = [ class java/lang/String, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 39
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 36 /* same */
        frame_type = 25 /* same */
        frame_type = 15 /* same */

  public void sendPetitionerPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: invokestatic  #285                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: aload_0
         4: getfield      #68                 // Field _petitionerObjectId:I
         7: invokevirtual #290                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        10: astore_2
        11: aload_2
        12: ifnull        22
        15: aload_2
        16: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        19: ifne          23
        22: return
        23: aload_2
        24: aload_1
        25: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        28: return
      LineNumberTable:
        line 339: 0
        line 340: 11
        line 341: 22
        line 343: 23
        line 344: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/Petition;
            0      29     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
           11      18     2 petitioner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 0 /* same */

  public void sendResponderPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _responders:Ljava/util/List;
         4: invokeinterface #230,  1          // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          20
        12: aload_0
        13: getstatic     #26                 // Field ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
        16: invokevirtual #300                // Method endConsultation:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
        19: return
        20: aload_0
        21: getfield      #16                 // Field _responders:Ljava/util/List;
        24: invokeinterface #162,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        29: astore_2
        30: aload_2
        31: invokeinterface #166,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        36: ifeq          84
        39: aload_2
        40: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        45: checkcast     #141                // class java/lang/Integer
        48: invokevirtual #176                // Method java/lang/Integer.intValue:()I
        51: istore_3
        52: invokestatic  #285                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        55: iload_3
        56: invokevirtual #290                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        59: astore        4
        61: aload         4
        63: ifnull        74
        66: aload         4
        68: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        71: ifne          75
        74: return
        75: aload         4
        77: aload_1
        78: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        81: goto          30
        84: return
      LineNumberTable:
        line 354: 0
        line 356: 12
        line 357: 19
        line 360: 20
        line 362: 52
        line 363: 61
        line 364: 74
        line 366: 75
        line 367: 81
        line 368: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           61      20     4 responder   Lext/mods/gameserver/model/actor/Player;
           52      29     3 responderId   I
            0      85     0  this   Lext/mods/gameserver/model/Petition;
            0      85     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 5
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 0 /* same */
        frame_type = 248 /* chop */
          offset_delta = 8

  public void showCompleteLog(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _messages:Ljava/util/List;
         4: invokeinterface #162,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #166,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          37
        19: aload_2
        20: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #341                // class ext/mods/gameserver/network/serverpackets/CreatureSay
        28: astore_3
        29: aload_1
        30: aload_3
        31: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: goto          10
        37: return
      LineNumberTable:
        line 372: 0
        line 373: 29
        line 374: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       5     3    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
            0      38     0  this   Lext/mods/gameserver/model/Petition;
            0      38     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26

  public void sendMessage(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aconst_null
         1: astore_3
         2: aload_0
         3: invokevirtual #343                // Method getPetitionerObjectId:()I
         6: aload_1
         7: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: if_icmpne     29
        13: new           #341                // class ext/mods/gameserver/network/serverpackets/CreatureSay
        16: dup
        17: aload_1
        18: getstatic     #346                // Field ext/mods/gameserver/enums/SayType.PETITION_PLAYER:Lext/mods/gameserver/enums/SayType;
        21: aload_2
        22: invokespecial #352                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
        25: astore_3
        26: goto          74
        29: aload_0
        30: getfield      #16                 // Field _responders:Ljava/util/List;
        33: aload_1
        34: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        37: invokestatic  #145                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        40: invokeinterface #203,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        45: ifeq          74
        48: new           #341                // class ext/mods/gameserver/network/serverpackets/CreatureSay
        51: dup
        52: aload_1
        53: aload_1
        54: invokevirtual #297                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        57: ifeq          66
        60: getstatic     #355                // Field ext/mods/gameserver/enums/SayType.PETITION_GM:Lext/mods/gameserver/enums/SayType;
        63: goto          69
        66: getstatic     #346                // Field ext/mods/gameserver/enums/SayType.PETITION_PLAYER:Lext/mods/gameserver/enums/SayType;
        69: aload_2
        70: invokespecial #352                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
        73: astore_3
        74: aload_3
        75: ifnull        94
        78: aload_0
        79: aload_3
        80: invokevirtual #358                // Method addMessage:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
        83: pop
        84: aload_0
        85: aload_3
        86: invokevirtual #242                // Method sendResponderPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        89: aload_0
        90: aload_3
        91: invokevirtual #239                // Method sendPetitionerPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        94: return
      LineNumberTable:
        line 383: 0
        line 385: 2
        line 386: 13
        line 387: 29
        line 388: 48
        line 390: 74
        line 392: 78
        line 393: 84
        line 394: 89
        line 396: 94
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      95     0  this   Lext/mods/gameserver/model/Petition;
            0      95     1 player   Lext/mods/gameserver/model/actor/Player;
            0      95     2 message   Ljava/lang/String;
            2      93     3    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/network/serverpackets/CreatureSay ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/network/serverpackets/CreatureSay ]
          stack = [ uninitialized 48, uninitialized 48, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/network/serverpackets/CreatureSay ]
          stack = [ uninitialized 48, uninitialized 48, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/SayType ]
        frame_type = 4 /* same */
        frame_type = 19 /* same */
}
SourceFile: "Petition.java"
