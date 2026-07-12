// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminPetition
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminPetition.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminPetition.class
  Last modified 9 de jul de 2026; size 11178 bytes
  MD5 checksum 6c1dba62fea44d8aafe9ab6d38012478
  Compiled from "AdminPetition.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminPetition implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/handler/admincommandhandlers/AdminPetition
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
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
   #18 = String             #19           // admin_petition
   #19 = Utf8               admin_petition
   #20 = Methodref          #21.#22       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #21 = Class              #23           // java/lang/String
   #22 = NameAndType        #24:#25       // startsWith:(Ljava/lang/String;)Z
   #23 = Utf8               java/lang/String
   #24 = Utf8               startsWith
   #25 = Utf8               (Ljava/lang/String;)Z
   #26 = Methodref          #7.#27        // java/util/StringTokenizer.hasMoreTokens:()Z
   #27 = NameAndType        #28:#29       // hasMoreTokens:()Z
   #28 = Utf8               hasMoreTokens
   #29 = Utf8               ()Z
   #30 = Methodref          #31.#32       // ext/mods/gameserver/handler/admincommandhandlers/AdminPetition.showPendingPetitions:(Lext/mods/gameserver/model/actor/Player;I)V
   #31 = Class              #33           // ext/mods/gameserver/handler/admincommandhandlers/AdminPetition
   #32 = NameAndType        #34:#35       // showPendingPetitions:(Lext/mods/gameserver/model/actor/Player;I)V
   #33 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminPetition
   #34 = Utf8               showPendingPetitions
   #35 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #36 = Methodref          #37.#38       // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #37 = Class              #39           // ext/mods/commons/lang/StringUtil
   #38 = NameAndType        #40:#25       // isDigit:(Ljava/lang/String;)Z
   #39 = Utf8               ext/mods/commons/lang/StringUtil
   #40 = Utf8               isDigit
   #41 = Methodref          #42.#43       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #42 = Class              #44           // java/lang/Integer
   #43 = NameAndType        #45:#46       // parseInt:(Ljava/lang/String;)I
   #44 = Utf8               java/lang/Integer
   #45 = Utf8               parseInt
   #46 = Utf8               (Ljava/lang/String;)I
   #47 = Methodref          #21.#48       // java/lang/String.hashCode:()I
   #48 = NameAndType        #49:#50       // hashCode:()I
   #49 = Utf8               hashCode
   #50 = Utf8               ()I
   #51 = String             #52           // join
   #52 = Utf8               join
   #53 = Methodref          #21.#54       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #54 = NameAndType        #55:#56       // equals:(Ljava/lang/Object;)Z
   #55 = Utf8               equals
   #56 = Utf8               (Ljava/lang/Object;)Z
   #57 = String             #58           // reject
   #58 = Utf8               reject
   #59 = String             #60           // reset
   #60 = Utf8               reset
   #61 = String             #62           // show
   #62 = Utf8               show
   #63 = String             #64           // unfollow
   #64 = Utf8               unfollow
   #65 = String             #66           // view
   #66 = Utf8               view
   #67 = Methodref          #68.#69       // ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
   #68 = Class              #70           // ext/mods/gameserver/data/manager/PetitionManager
   #69 = NameAndType        #71:#72       // getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
   #70 = Utf8               ext/mods/gameserver/data/manager/PetitionManager
   #71 = Utf8               getInstance
   #72 = Utf8               ()Lext/mods/gameserver/data/manager/PetitionManager;
   #73 = Methodref          #68.#74       // ext/mods/gameserver/data/manager/PetitionManager.joinPetition:(Lext/mods/gameserver/model/actor/Player;IZ)Z
   #74 = NameAndType        #75:#76       // joinPetition:(Lext/mods/gameserver/model/actor/Player;IZ)Z
   #75 = Utf8               joinPetition
   #76 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZ)Z
   #77 = Fieldref           #78.#79       // ext/mods/gameserver/network/SystemMessageId.NOT_UNDER_PETITION_CONSULTATION:Lext/mods/gameserver/network/SystemMessageId;
   #78 = Class              #80           // ext/mods/gameserver/network/SystemMessageId
   #79 = NameAndType        #81:#82       // NOT_UNDER_PETITION_CONSULTATION:Lext/mods/gameserver/network/SystemMessageId;
   #80 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #81 = Utf8               NOT_UNDER_PETITION_CONSULTATION
   #82 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #84 = Class              #86           // ext/mods/gameserver/model/actor/Player
   #85 = NameAndType        #87:#88       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #86 = Utf8               ext/mods/gameserver/model/actor/Player
   #87 = Utf8               sendPacket
   #88 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #89 = Methodref          #68.#90       // ext/mods/gameserver/data/manager/PetitionManager.rejectPetition:(Lext/mods/gameserver/model/actor/Player;I)Z
   #90 = NameAndType        #91:#92       // rejectPetition:(Lext/mods/gameserver/model/actor/Player;I)Z
   #91 = Utf8               rejectPetition
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
   #93 = Fieldref           #78.#94       // ext/mods/gameserver/network/SystemMessageId.FAILED_CANCEL_PETITION_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
   #94 = NameAndType        #95:#82       // FAILED_CANCEL_PETITION_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
   #95 = Utf8               FAILED_CANCEL_PETITION_TRY_LATER
   #96 = Methodref          #68.#97       // ext/mods/gameserver/data/manager/PetitionManager.isAnyPetitionInProcess:()Z
   #97 = NameAndType        #98:#29       // isAnyPetitionInProcess:()Z
   #98 = Utf8               isAnyPetitionInProcess
   #99 = Fieldref           #78.#100      // ext/mods/gameserver/network/SystemMessageId.PETITION_UNDER_PROCESS:Lext/mods/gameserver/network/SystemMessageId;
  #100 = NameAndType        #101:#82      // PETITION_UNDER_PROCESS:Lext/mods/gameserver/network/SystemMessageId;
  #101 = Utf8               PETITION_UNDER_PROCESS
  #102 = Methodref          #68.#103      // ext/mods/gameserver/data/manager/PetitionManager.clearPetitions:()V
  #103 = NameAndType        #104:#6       // clearPetitions:()V
  #104 = Utf8               clearPetitions
  #105 = Methodref          #68.#106      // ext/mods/gameserver/data/manager/PetitionManager.showCompleteLog:(Lext/mods/gameserver/model/actor/Player;I)V
  #106 = NameAndType        #107:#35      // showCompleteLog:(Lext/mods/gameserver/model/actor/Player;I)V
  #107 = Utf8               showCompleteLog
  #108 = Methodref          #68.#109      // ext/mods/gameserver/data/manager/PetitionManager.abortActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
  #109 = NameAndType        #110:#111     // abortActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
  #110 = Utf8               abortActivePetition
  #111 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #112 = Methodref          #31.#113      // ext/mods/gameserver/handler/admincommandhandlers/AdminPetition.showPetition:(Lext/mods/gameserver/model/actor/Player;I)V
  #113 = NameAndType        #114:#35      // showPetition:(Lext/mods/gameserver/model/actor/Player;I)V
  #114 = Utf8               showPetition
  #115 = String             #116          // Usage: //petition [join|reject|reset|show|unfollow|view]
  #116 = Utf8               Usage: //petition [join|reject|reset|show|unfollow|view]
  #117 = Methodref          #84.#118      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #118 = NameAndType        #119:#120     // sendMessage:(Ljava/lang/String;)V
  #119 = Utf8               sendMessage
  #120 = Utf8               (Ljava/lang/String;)V
  #121 = Class              #122          // java/lang/Exception
  #122 = Utf8               java/lang/Exception
  #123 = String             #124          // admin_add_peti_chat
  #124 = Utf8               admin_add_peti_chat
  #125 = Methodref          #31.#126      // ext/mods/gameserver/handler/admincommandhandlers/AdminPetition.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #126 = NameAndType        #127:#128     // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #127 = Utf8               getTargetPlayer
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
  #129 = Methodref          #84.#130      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #130 = NameAndType        #131:#29      // isOnline:()Z
  #131 = Utf8               isOnline
  #132 = Fieldref           #78.#133      // ext/mods/gameserver/network/SystemMessageId.CLIENT_NOT_LOGGED_ONTO_GAME_SERVER:Lext/mods/gameserver/network/SystemMessageId;
  #133 = NameAndType        #134:#82      // CLIENT_NOT_LOGGED_ONTO_GAME_SERVER:Lext/mods/gameserver/network/SystemMessageId;
  #134 = Utf8               CLIENT_NOT_LOGGED_ONTO_GAME_SERVER
  #135 = Fieldref           #78.#136      // ext/mods/gameserver/network/SystemMessageId.PETITION_ADDING_S1_FAILED_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
  #136 = NameAndType        #137:#82      // PETITION_ADDING_S1_FAILED_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
  #137 = Utf8               PETITION_ADDING_S1_FAILED_ERROR_NUMBER_S2
  #138 = Methodref          #139.#140     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #139 = Class              #141          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #140 = NameAndType        #142:#143     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #141 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #142 = Utf8               getSystemMessage
  #143 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #144 = Methodref          #139.#145     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #145 = NameAndType        #146:#147     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #146 = Utf8               addCharName
  #147 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #148 = Methodref          #139.#149     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #149 = NameAndType        #150:#151     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #150 = Utf8               addNumber
  #151 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #152 = Methodref          #84.#153      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #153 = NameAndType        #87:#154      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #154 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #155 = Methodref          #68.#156      // ext/mods/gameserver/data/manager/PetitionManager.getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #156 = NameAndType        #157:#158     // getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #157 = Utf8               getPetitionInProcess
  #158 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #159 = Methodref          #160.#161     // ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
  #160 = Class              #162          // ext/mods/gameserver/model/Petition
  #161 = NameAndType        #163:#50      // getPetitionerObjectId:()I
  #162 = Utf8               ext/mods/gameserver/model/Petition
  #163 = Utf8               getPetitionerObjectId
  #164 = Methodref          #84.#165      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #165 = NameAndType        #166:#50      // getObjectId:()I
  #166 = Utf8               getObjectId
  #167 = Methodref          #160.#168     // ext/mods/gameserver/model/Petition.getResponders:()Ljava/util/List;
  #168 = NameAndType        #169:#170     // getResponders:()Ljava/util/List;
  #169 = Utf8               getResponders
  #170 = Utf8               ()Ljava/util/List;
  #171 = Methodref          #42.#172      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #172 = NameAndType        #173:#174     // valueOf:(I)Ljava/lang/Integer;
  #173 = Utf8               valueOf
  #174 = Utf8               (I)Ljava/lang/Integer;
  #175 = InterfaceMethodref #176.#177     // java/util/List.contains:(Ljava/lang/Object;)Z
  #176 = Class              #178          // java/util/List
  #177 = NameAndType        #179:#56      // contains:(Ljava/lang/Object;)Z
  #178 = Utf8               java/util/List
  #179 = Utf8               contains
  #180 = Methodref          #160.#181     // ext/mods/gameserver/model/Petition.addAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #181 = NameAndType        #182:#183     // addAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #182 = Utf8               addAdditionalResponder
  #183 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #184 = String             #185          // admin_force_peti
  #185 = Utf8               admin_force_peti
  #186 = Fieldref           #78.#187      // ext/mods/gameserver/network/SystemMessageId.PETITION_FAILED_FOR_S1_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
  #187 = NameAndType        #188:#82      // PETITION_FAILED_FOR_S1_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
  #188 = Utf8               PETITION_FAILED_FOR_S1_ERROR_NUMBER_S2
  #189 = Methodref          #68.#190      // ext/mods/gameserver/data/manager/PetitionManager.isActivePetition:(Lext/mods/gameserver/model/actor/Player;)Z
  #190 = NameAndType        #191:#192     // isActivePetition:(Lext/mods/gameserver/model/actor/Player;)Z
  #191 = Utf8               isActivePetition
  #192 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #193 = Fieldref           #78.#194      // ext/mods/gameserver/network/SystemMessageId.PETITION_FAILED_S1_ALREADY_SUBMITTED:Lext/mods/gameserver/network/SystemMessageId;
  #194 = NameAndType        #195:#82      // PETITION_FAILED_S1_ALREADY_SUBMITTED:Lext/mods/gameserver/network/SystemMessageId;
  #195 = Utf8               PETITION_FAILED_S1_ALREADY_SUBMITTED
  #196 = Fieldref           #197.#198     // ext/mods/gameserver/enums/petitions/PetitionType.OTHER:Lext/mods/gameserver/enums/petitions/PetitionType;
  #197 = Class              #199          // ext/mods/gameserver/enums/petitions/PetitionType
  #198 = NameAndType        #200:#201     // OTHER:Lext/mods/gameserver/enums/petitions/PetitionType;
  #199 = Utf8               ext/mods/gameserver/enums/petitions/PetitionType
  #200 = Utf8               OTHER
  #201 = Utf8               Lext/mods/gameserver/enums/petitions/PetitionType;
  #202 = String             #203          //
  #203 = Utf8
  #204 = Methodref          #68.#205      // ext/mods/gameserver/data/manager/PetitionManager.submitPetition:(Lext/mods/gameserver/enums/petitions/PetitionType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)I
  #205 = NameAndType        #206:#207     // submitPetition:(Lext/mods/gameserver/enums/petitions/PetitionType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)I
  #206 = Utf8               submitPetition
  #207 = Utf8               (Lext/mods/gameserver/enums/petitions/PetitionType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)I
  #208 = Class              #209          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #209 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #210 = Methodref          #208.#211     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #211 = NameAndType        #5:#212       // "<init>":(I)V
  #212 = Utf8               (I)V
  #213 = Methodref          #84.#214      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #214 = NameAndType        #215:#216     // getLocale:()Ljava/util/Locale;
  #215 = Utf8               getLocale
  #216 = Utf8               ()Ljava/util/Locale;
  #217 = String             #218          // html/admin/petitions.htm
  #218 = Utf8               html/admin/petitions.htm
  #219 = Methodref          #208.#220     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #220 = NameAndType        #221:#222     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #221 = Utf8               setFile
  #222 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #223 = String             #224          // %unfollow%
  #224 = Utf8               %unfollow%
  #225 = String             #226          // <td><button value=\"Unfollow\" action=\"bypass -h admin_petition unfollow\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>
  #226 = Utf8               <td><button value=\"Unfollow\" action=\"bypass -h admin_petition unfollow\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>
  #227 = Methodref          #208.#228     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #228 = NameAndType        #229:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #229 = Utf8               replace
  #230 = Class              #231          // ext/mods/commons/data/Pagination
  #231 = Utf8               ext/mods/commons/data/Pagination
  #232 = Methodref          #68.#233      // ext/mods/gameserver/data/manager/PetitionManager.getPetitions:()Ljava/util/Map;
  #233 = NameAndType        #234:#235     // getPetitions:()Ljava/util/Map;
  #234 = Utf8               getPetitions
  #235 = Utf8               ()Ljava/util/Map;
  #236 = InterfaceMethodref #237.#238     // java/util/Map.values:()Ljava/util/Collection;
  #237 = Class              #239          // java/util/Map
  #238 = NameAndType        #240:#241     // values:()Ljava/util/Collection;
  #239 = Utf8               java/util/Map
  #240 = Utf8               values
  #241 = Utf8               ()Ljava/util/Collection;
  #242 = InterfaceMethodref #243.#244     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #243 = Class              #245          // java/util/Collection
  #244 = NameAndType        #246:#247     // stream:()Ljava/util/stream/Stream;
  #245 = Utf8               java/util/Collection
  #246 = Utf8               stream
  #247 = Utf8               ()Ljava/util/stream/Stream;
  #248 = Class              #249          // ext/mods/gameserver/handler/IAdminCommandHandler
  #249 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #250 = Methodref          #230.#251     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #251 = NameAndType        #5:#252       // "<init>":(Ljava/util/stream/Stream;II)V
  #252 = Utf8               (Ljava/util/stream/Stream;II)V
  #253 = Methodref          #230.#254     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #254 = NameAndType        #255:#256     // iterator:()Ljava/util/Iterator;
  #255 = Utf8               iterator
  #256 = Utf8               ()Ljava/util/Iterator;
  #257 = InterfaceMethodref #258.#259     // java/util/Iterator.hasNext:()Z
  #258 = Class              #260          // java/util/Iterator
  #259 = NameAndType        #261:#29      // hasNext:()Z
  #260 = Utf8               java/util/Iterator
  #261 = Utf8               hasNext
  #262 = InterfaceMethodref #258.#263     // java/util/Iterator.next:()Ljava/lang/Object;
  #263 = NameAndType        #264:#265     // next:()Ljava/lang/Object;
  #264 = Utf8               next
  #265 = Utf8               ()Ljava/lang/Object;
  #266 = Methodref          #160.#267     // ext/mods/gameserver/model/Petition.isUnread:()Z
  #267 = NameAndType        #268:#29      // isUnread:()Z
  #268 = Utf8               isUnread
  #269 = String             #270          // party_styleicon1_2
  #270 = Utf8               party_styleicon1_2
  #271 = String             #272          // QuestWndInfoIcon_5
  #272 = Utf8               QuestWndInfoIcon_5
  #273 = Methodref          #274.#275     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #274 = Class              #276          // ext/mods/gameserver/model/World
  #275 = NameAndType        #71:#277      // getInstance:()Lext/mods/gameserver/model/World;
  #276 = Utf8               ext/mods/gameserver/model/World
  #277 = Utf8               ()Lext/mods/gameserver/model/World;
  #278 = Methodref          #274.#279     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #279 = NameAndType        #280:#281     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #280 = Utf8               getPlayer
  #281 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #282 = Methodref          #84.#283      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #283 = NameAndType        #284:#17      // getName:()Ljava/lang/String;
  #284 = Utf8               getName
  #285 = String             #286          // 1
  #286 = Utf8               1
  #287 = Methodref          #160.#288     // ext/mods/gameserver/model/Petition.getPetitionerName:()Ljava/lang/String;
  #288 = NameAndType        #289:#17      // getPetitionerName:()Ljava/lang/String;
  #289 = Utf8               getPetitionerName
  #290 = String             #291          // 4
  #291 = Utf8               4
  #292 = Methodref          #230.#293     // ext/mods/commons/data/Pagination.indexOf:(Ljava/lang/Object;)I
  #293 = NameAndType        #294:#295     // indexOf:(Ljava/lang/Object;)I
  #294 = Utf8               indexOf
  #295 = Utf8               (Ljava/lang/Object;)I
  #296 = String             #297          // <table width=280 height=40 bgcolor=000000>
  #297 = Utf8               <table width=280 height=40 bgcolor=000000>
  #298 = String             #299          // <table width=280 height=40>
  #299 = Utf8               <table width=280 height=40>
  #300 = Methodref          #230.#301     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #301 = NameAndType        #302:#303     // append:([Ljava/lang/Object;)V
  #302 = Utf8               append
  #303 = Utf8               ([Ljava/lang/Object;)V
  #304 = String             #305          // <tr><td width=20 align=center><img src=\"L2UI_CH3.msnicon
  #305 = Utf8               <tr><td width=20 align=center><img src=\"L2UI_CH3.msnicon
  #306 = String             #307          // \" width=12 height=16><img src=\"L2UI_CH3.
  #307 = Utf8               \" width=12 height=16><img src=\"L2UI_CH3.
  #308 = String             #309          // \" width=11 height=16></td>
  #309 = Utf8               \" width=11 height=16></td>
  #310 = Methodref          #160.#311     // ext/mods/gameserver/model/Petition.getId:()I
  #311 = NameAndType        #312:#50      // getId:()I
  #312 = Utf8               getId
  #313 = String             #314          // <td width=260>#
  #314 = Utf8               <td width=260>#
  #315 = String             #316          //  by
  #316 = Utf8                by
  #317 = String             #318          // <br1><font color=B09878>Type:</font>
  #318 = Utf8               <br1><font color=B09878>Type:</font>
  #319 = Methodref          #160.#320     // ext/mods/gameserver/model/Petition.getType:()Lext/mods/gameserver/enums/petitions/PetitionType;
  #320 = NameAndType        #321:#322     // getType:()Lext/mods/gameserver/enums/petitions/PetitionType;
  #321 = Utf8               getType
  #322 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionType;
  #323 = String             #324          //  <font color=B09878>State:</font>
  #324 = Utf8                <font color=B09878>State:</font>
  #325 = Methodref          #160.#326     // ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
  #326 = NameAndType        #327:#328     // getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
  #327 = Utf8               getState
  #328 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionState;
  #329 = String             #330          // </td>
  #330 = Utf8               </td>
  #331 = String             #332          // <td width=260><a action=\"bypass -h admin_petition view
  #332 = Utf8               <td width=260><a action=\"bypass -h admin_petition view
  #333 = String             #334          // \">#
  #334 = Utf8               \">#
  #335 = String             #336          // </a><br1><font color=B09878>Type:</font>
  #336 = Utf8               </a><br1><font color=B09878>Type:</font>
  #337 = String             #338          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #338 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #339 = Methodref          #230.#340     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #340 = NameAndType        #341:#212     // generateSpace:(I)V
  #341 = Utf8               generateSpace
  #342 = String             #343          // bypass admin_petition %page%
  #343 = Utf8               bypass admin_petition %page%
  #344 = Methodref          #230.#345     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #345 = NameAndType        #346:#120     // generatePages:(Ljava/lang/String;)V
  #346 = Utf8               generatePages
  #347 = String             #348          // %content%
  #348 = Utf8               %content%
  #349 = Methodref          #230.#350     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #350 = NameAndType        #351:#17      // getContent:()Ljava/lang/String;
  #351 = Utf8               getContent
  #352 = Methodref          #84.#353      // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #353 = NameAndType        #354:#29      // isGM:()Z
  #354 = Utf8               isGM
  #355 = InterfaceMethodref #237.#356     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #356 = NameAndType        #357:#358     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #357 = Utf8               get
  #358 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #359 = String             #360          // online
  #360 = Utf8               online
  #361 = String             #362          // offline
  #362 = Utf8               offline
  #363 = Methodref          #160.#364     // ext/mods/gameserver/model/Petition.setAsRead:()V
  #364 = NameAndType        #365:#6       // setAsRead:()V
  #365 = Utf8               setAsRead
  #366 = String             #367          // html/admin/petition.htm
  #367 = Utf8               html/admin/petition.htm
  #368 = String             #369          // %submitDate%
  #369 = Utf8               %submitDate%
  #370 = Class              #371          // java/text/SimpleDateFormat
  #371 = Utf8               java/text/SimpleDateFormat
  #372 = String             #373          // dd-MM-yyyy HH:mm
  #373 = Utf8               dd-MM-yyyy HH:mm
  #374 = Methodref          #370.#375     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #375 = NameAndType        #5:#120       // "<init>":(Ljava/lang/String;)V
  #376 = Methodref          #160.#377     // ext/mods/gameserver/model/Petition.getSubmitDate:()J
  #377 = NameAndType        #378:#379     // getSubmitDate:()J
  #378 = Utf8               getSubmitDate
  #379 = Utf8               ()J
  #380 = Methodref          #381.#382     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #381 = Class              #383          // java/lang/Long
  #382 = NameAndType        #173:#384     // valueOf:(J)Ljava/lang/Long;
  #383 = Utf8               java/lang/Long
  #384 = Utf8               (J)Ljava/lang/Long;
  #385 = Methodref          #370.#386     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #386 = NameAndType        #387:#388     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #387 = Utf8               format
  #388 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #389 = String             #390          // %petitionerName%
  #390 = Utf8               %petitionerName%
  #391 = String             #392          // %petitionerStatus%
  #392 = Utf8               %petitionerStatus%
  #393 = String             #394          // %type%
  #394 = Utf8               %type%
  #395 = Methodref          #197.#396     // ext/mods/gameserver/enums/petitions/PetitionType.toString:()Ljava/lang/String;
  #396 = NameAndType        #397:#17      // toString:()Ljava/lang/String;
  #397 = Utf8               toString
  #398 = String             #399          // %state%
  #399 = Utf8               %state%
  #400 = Methodref          #401.#396     // ext/mods/gameserver/enums/petitions/PetitionState.toString:()Ljava/lang/String;
  #401 = Class              #402          // ext/mods/gameserver/enums/petitions/PetitionState
  #402 = Utf8               ext/mods/gameserver/enums/petitions/PetitionState
  #403 = String             #404          // %responders%
  #404 = Utf8               %responders%
  #405 = Methodref          #160.#406     // ext/mods/gameserver/model/Petition.getFormattedResponders:()Ljava/lang/String;
  #406 = NameAndType        #407:#17      // getFormattedResponders:()Ljava/lang/String;
  #407 = Utf8               getFormattedResponders
  #408 = Methodref          #160.#350     // ext/mods/gameserver/model/Petition.getContent:()Ljava/lang/String;
  #409 = Fieldref           #401.#410     // ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
  #410 = NameAndType        #411:#412     // PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
  #411 = Utf8               PENDING
  #412 = Utf8               Lext/mods/gameserver/enums/petitions/PetitionState;
  #413 = Fieldref           #401.#414     // ext/mods/gameserver/enums/petitions/PetitionState.ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #414 = NameAndType        #415:#412     // ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #415 = Utf8               ACCEPTED
  #416 = String             #417          // %buttonsOrFeedback%
  #417 = Utf8               %buttonsOrFeedback%
  #418 = String             #419          // <center><img src=\"L2UI.SquareGray\" width=280 height=1><br><table width=130><tr><td><button value=\"Join\" action=\"bypass -h admin_petition join %id%\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td><td><button value=\"Reject\" action=\"bypass -h admin_petition reject %id%\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td></tr></table></center>
  #419 = Utf8               <center><img src=\"L2UI.SquareGray\" width=280 height=1><br><table width=130><tr><td><button value=\"Join\" action=\"bypass -h admin_petition join %id%\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td><td><button value=\"Reject\" action=\"bypass -h admin_petition reject %id%\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td></tr></table></center>
  #420 = Fieldref           #401.#421     // ext/mods/gameserver/enums/petitions/PetitionState.CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #421 = NameAndType        #422:#412     // CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #422 = Utf8               CLOSED
  #423 = String             #424          // <center><img src=\"L2UI.SquareGray\" width=280 height=1><br><table width=280><tr><td>Rate: %rate%</td></tr><tr><td>Feedback: %feedback%</td></tr></table></center>
  #424 = Utf8               <center><img src=\"L2UI.SquareGray\" width=280 height=1><br><table width=280><tr><td>Rate: %rate%</td></tr><tr><td>Feedback: %feedback%</td></tr></table></center>
  #425 = String             #426          // %rate%
  #426 = Utf8               %rate%
  #427 = Methodref          #160.#428     // ext/mods/gameserver/model/Petition.getRate:()Lext/mods/gameserver/enums/petitions/PetitionRate;
  #428 = NameAndType        #429:#430     // getRate:()Lext/mods/gameserver/enums/petitions/PetitionRate;
  #429 = Utf8               getRate
  #430 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionRate;
  #431 = Methodref          #432.#433     // ext/mods/gameserver/enums/petitions/PetitionRate.getDesc:()Ljava/lang/String;
  #432 = Class              #434          // ext/mods/gameserver/enums/petitions/PetitionRate
  #433 = NameAndType        #435:#17      // getDesc:()Ljava/lang/String;
  #434 = Utf8               ext/mods/gameserver/enums/petitions/PetitionRate
  #435 = Utf8               getDesc
  #436 = String             #437          // %feedback%
  #437 = Utf8               %feedback%
  #438 = Methodref          #160.#439     // ext/mods/gameserver/model/Petition.getFeedback:()Ljava/lang/String;
  #439 = NameAndType        #440:#17      // getFeedback:()Ljava/lang/String;
  #440 = Utf8               getFeedback
  #441 = String             #442          // %id%
  #442 = Utf8               %id%
  #443 = Methodref          #208.#444     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #444 = NameAndType        #229:#445     // replace:(Ljava/lang/String;I)V
  #445 = Utf8               (Ljava/lang/String;I)V
  #446 = Fieldref           #31.#447      // ext/mods/gameserver/handler/admincommandhandlers/AdminPetition.ADMIN_COMMANDS:[Ljava/lang/String;
  #447 = NameAndType        #448:#449     // ADMIN_COMMANDS:[Ljava/lang/String;
  #448 = Utf8               ADMIN_COMMANDS
  #449 = Utf8               [Ljava/lang/String;
  #450 = Utf8               UNFOLLOW_BUTTON
  #451 = Utf8               Ljava/lang/String;
  #452 = Utf8               ConstantValue
  #453 = Utf8               BUTTONS
  #454 = Utf8               FEEDBACK
  #455 = Utf8               Code
  #456 = Utf8               LineNumberTable
  #457 = Utf8               LocalVariableTable
  #458 = Utf8               this
  #459 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminPetition;
  #460 = Utf8               useAdminCommand
  #461 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #462 = Utf8               petitionId
  #463 = Utf8               I
  #464 = Utf8               e
  #465 = Utf8               Ljava/lang/Exception;
  #466 = Utf8               page
  #467 = Utf8               param
  #468 = Utf8               targetPlayer
  #469 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #470 = Utf8               petition
  #471 = Utf8               Lext/mods/gameserver/model/Petition;
  #472 = Utf8               command
  #473 = Utf8               player
  #474 = Utf8               st
  #475 = Utf8               Ljava/util/StringTokenizer;
  #476 = Utf8               StackMapTable
  #477 = Utf8               playerName
  #478 = Utf8               petitionerStatus
  #479 = Utf8               isReaded
  #480 = Utf8               petitioner
  #481 = Utf8               activePetition
  #482 = Utf8               html
  #483 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #484 = Utf8               list
  #485 = Utf8               Lext/mods/commons/data/Pagination;
  #486 = Utf8               LocalVariableTypeTable
  #487 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/Petition;>;
  #488 = Class              #489          // "[Ljava/lang/Object;"
  #489 = Utf8               [Ljava/lang/Object;
  #490 = Utf8               id
  #491 = Utf8               getAdminCommandList
  #492 = Utf8               ()[Ljava/lang/String;
  #493 = Utf8               <clinit>
  #494 = Utf8               SourceFile
  #495 = Utf8               AdminPetition.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminPetition();
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
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPetition;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_1
        17: ldc           #18                 // String admin_petition
        19: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        22: ifeq          432
        25: iconst_1
        26: istore        4
        28: aload_3
        29: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        32: ifne          43
        35: aload_0
        36: aload_2
        37: iload         4
        39: invokevirtual #30                 // Method showPendingPetitions:(Lext/mods/gameserver/model/actor/Player;I)V
        42: return
        43: aload_3
        44: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        47: astore        5
        49: aload         5
        51: invokestatic  #36                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
        54: ifeq          67
        57: aload         5
        59: invokestatic  #41                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        62: istore        4
        64: goto          422
        67: aload         5
        69: astore        6
        71: iconst_m1
        72: istore        7
        74: aload         6
        76: invokevirtual #47                 // Method java/lang/String.hashCode:()I
        79: lookupswitch  { // 6

              -934710369: 152

              -382454902: 200

                 3267882: 136

                 3529469: 184

                 3619493: 216

               108404047: 168
                 default: 229
            }
       136: aload         6
       138: ldc           #51                 // String join
       140: invokevirtual #53                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       143: ifeq          229
       146: iconst_0
       147: istore        7
       149: goto          229
       152: aload         6
       154: ldc           #57                 // String reject
       156: invokevirtual #53                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       159: ifeq          229
       162: iconst_1
       163: istore        7
       165: goto          229
       168: aload         6
       170: ldc           #59                 // String reset
       172: invokevirtual #53                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       175: ifeq          229
       178: iconst_2
       179: istore        7
       181: goto          229
       184: aload         6
       186: ldc           #61                 // String show
       188: invokevirtual #53                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       191: ifeq          229
       194: iconst_3
       195: istore        7
       197: goto          229
       200: aload         6
       202: ldc           #63                 // String unfollow
       204: invokevirtual #53                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       207: ifeq          229
       210: iconst_4
       211: istore        7
       213: goto          229
       216: aload         6
       218: ldc           #65                 // String view
       220: invokevirtual #53                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       223: ifeq          229
       226: iconst_5
       227: istore        7
       229: iload         7
       231: tableswitch   { // 0 to 5

                       0: 268

                       1: 300

                       2: 331

                       3: 357

                       4: 378

                       5: 388
                 default: 405
            }
       268: aload_3
       269: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       272: invokestatic  #41                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       275: istore        8
       277: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       280: aload_2
       281: iload         8
       283: iconst_0
       284: invokevirtual #73                 // Method ext/mods/gameserver/data/manager/PetitionManager.joinPetition:(Lext/mods/gameserver/model/actor/Player;IZ)Z
       287: ifne          411
       290: aload_2
       291: getstatic     #77                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_UNDER_PETITION_CONSULTATION:Lext/mods/gameserver/network/SystemMessageId;
       294: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       297: goto          411
       300: aload_3
       301: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       304: invokestatic  #41                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       307: istore        8
       309: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       312: aload_2
       313: iload         8
       315: invokevirtual #89                 // Method ext/mods/gameserver/data/manager/PetitionManager.rejectPetition:(Lext/mods/gameserver/model/actor/Player;I)Z
       318: ifne          411
       321: aload_2
       322: getstatic     #93                 // Field ext/mods/gameserver/network/SystemMessageId.FAILED_CANCEL_PETITION_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
       325: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       328: goto          411
       331: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       334: invokevirtual #96                 // Method ext/mods/gameserver/data/manager/PetitionManager.isAnyPetitionInProcess:()Z
       337: ifeq          348
       340: aload_2
       341: getstatic     #99                 // Field ext/mods/gameserver/network/SystemMessageId.PETITION_UNDER_PROCESS:Lext/mods/gameserver/network/SystemMessageId;
       344: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       347: return
       348: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       351: invokevirtual #102                // Method ext/mods/gameserver/data/manager/PetitionManager.clearPetitions:()V
       354: goto          411
       357: aload_3
       358: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       361: invokestatic  #41                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       364: istore        8
       366: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       369: aload_2
       370: iload         8
       372: invokevirtual #105                // Method ext/mods/gameserver/data/manager/PetitionManager.showCompleteLog:(Lext/mods/gameserver/model/actor/Player;I)V
       375: goto          411
       378: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       381: aload_2
       382: invokevirtual #108                // Method ext/mods/gameserver/data/manager/PetitionManager.abortActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
       385: goto          411
       388: aload_3
       389: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       392: invokestatic  #41                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       395: istore        8
       397: aload_0
       398: aload_2
       399: iload         8
       401: invokevirtual #112                // Method showPetition:(Lext/mods/gameserver/model/actor/Player;I)V
       404: return
       405: aload_2
       406: ldc           #115                // String Usage: //petition [join|reject|reset|show|unfollow|view]
       408: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       411: goto          422
       414: astore        6
       416: aload_2
       417: ldc           #115                // String Usage: //petition [join|reject|reset|show|unfollow|view]
       419: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       422: aload_0
       423: aload_2
       424: iload         4
       426: invokevirtual #30                 // Method showPendingPetitions:(Lext/mods/gameserver/model/actor/Player;I)V
       429: goto          742
       432: aload_1
       433: ldc           #123                // String admin_add_peti_chat
       435: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       438: ifeq          616
       441: aload_0
       442: aload_2
       443: iconst_0
       444: invokevirtual #125                // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       447: astore        4
       449: aload         4
       451: ifnull        462
       454: aload         4
       456: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       459: ifne          470
       462: aload_2
       463: getstatic     #132                // Field ext/mods/gameserver/network/SystemMessageId.CLIENT_NOT_LOGGED_ONTO_GAME_SERVER:Lext/mods/gameserver/network/SystemMessageId;
       466: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       469: return
       470: aload_2
       471: aload         4
       473: if_acmpne     496
       476: aload_2
       477: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_ADDING_S1_FAILED_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
       480: invokestatic  #138                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       483: aload         4
       485: invokevirtual #144                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       488: iconst_1
       489: invokevirtual #148                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       492: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       495: return
       496: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       499: aload_2
       500: invokevirtual #155                // Method ext/mods/gameserver/data/manager/PetitionManager.getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
       503: astore        5
       505: aload         5
       507: ifnonnull     530
       510: aload_2
       511: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_ADDING_S1_FAILED_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
       514: invokestatic  #138                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       517: aload         4
       519: invokevirtual #144                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       522: iconst_2
       523: invokevirtual #148                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       526: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       529: return
       530: aload         5
       532: invokevirtual #159                // Method ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
       535: aload         4
       537: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       540: if_icmpne     563
       543: aload_2
       544: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_ADDING_S1_FAILED_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
       547: invokestatic  #138                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       550: aload         4
       552: invokevirtual #144                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       555: iconst_3
       556: invokevirtual #148                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       559: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       562: return
       563: aload         5
       565: invokevirtual #167                // Method ext/mods/gameserver/model/Petition.getResponders:()Ljava/util/List;
       568: aload         4
       570: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       573: invokestatic  #171                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       576: invokeinterface #175,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       581: ifeq          604
       584: aload_2
       585: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_ADDING_S1_FAILED_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
       588: invokestatic  #138                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       591: aload         4
       593: invokevirtual #144                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       596: iconst_4
       597: invokevirtual #148                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       600: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       603: return
       604: aload         5
       606: aload_2
       607: aload         4
       609: invokevirtual #180                // Method ext/mods/gameserver/model/Petition.addAdditionalResponder:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
       612: pop
       613: goto          742
       616: aload_1
       617: ldc           #184                // String admin_force_peti
       619: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       622: ifeq          742
       625: aload_0
       626: aload_2
       627: iconst_0
       628: invokevirtual #125                // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       631: astore        4
       633: aload         4
       635: ifnull        646
       638: aload         4
       640: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       643: ifne          654
       646: aload_2
       647: getstatic     #132                // Field ext/mods/gameserver/network/SystemMessageId.CLIENT_NOT_LOGGED_ONTO_GAME_SERVER:Lext/mods/gameserver/network/SystemMessageId;
       650: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       653: return
       654: aload_2
       655: aload         4
       657: if_acmpne     680
       660: aload_2
       661: getstatic     #186                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_FAILED_FOR_S1_ERROR_NUMBER_S2:Lext/mods/gameserver/network/SystemMessageId;
       664: invokestatic  #138                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       667: aload         4
       669: invokevirtual #144                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       672: iconst_1
       673: invokevirtual #148                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       676: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       679: return
       680: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       683: aload         4
       685: invokevirtual #189                // Method ext/mods/gameserver/data/manager/PetitionManager.isActivePetition:(Lext/mods/gameserver/model/actor/Player;)Z
       688: ifeq          707
       691: aload_2
       692: getstatic     #193                // Field ext/mods/gameserver/network/SystemMessageId.PETITION_FAILED_S1_ALREADY_SUBMITTED:Lext/mods/gameserver/network/SystemMessageId;
       695: invokestatic  #138                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       698: aload         4
       700: invokevirtual #144                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       703: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       706: return
       707: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       710: getstatic     #196                // Field ext/mods/gameserver/enums/petitions/PetitionType.OTHER:Lext/mods/gameserver/enums/petitions/PetitionType;
       713: aload         4
       715: ldc           #202                // String
       717: invokevirtual #204                // Method ext/mods/gameserver/data/manager/PetitionManager.submitPetition:(Lext/mods/gameserver/enums/petitions/PetitionType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)I
       720: istore        5
       722: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       725: aload_2
       726: iload         5
       728: iconst_1
       729: invokevirtual #73                 // Method ext/mods/gameserver/data/manager/PetitionManager.joinPetition:(Lext/mods/gameserver/model/actor/Player;IZ)Z
       732: ifne          742
       735: aload_2
       736: getstatic     #77                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_UNDER_PETITION_CONSULTATION:Lext/mods/gameserver/network/SystemMessageId;
       739: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       742: return
      Exception table:
         from    to  target type
            67   347   414   Class java/lang/Exception
           348   404   414   Class java/lang/Exception
           405   411   414   Class java/lang/Exception
      LineNumberTable:
        line 53: 0
        line 54: 11
        line 56: 16
        line 58: 25
        line 60: 28
        line 62: 35
        line 63: 42
        line 66: 43
        line 67: 49
        line 68: 57
        line 73: 67
        line 76: 268
        line 78: 277
        line 79: 290
        line 83: 300
        line 84: 309
        line 85: 321
        line 89: 331
        line 91: 340
        line 92: 347
        line 94: 348
        line 95: 354
        line 98: 357
        line 99: 366
        line 100: 375
        line 103: 378
        line 104: 385
        line 107: 388
        line 108: 397
        line 109: 404
        line 112: 405
        line 119: 411
        line 116: 414
        line 118: 416
        line 121: 422
        line 122: 429
        line 123: 432
        line 125: 441
        line 126: 449
        line 128: 462
        line 129: 469
        line 132: 470
        line 134: 476
        line 135: 495
        line 138: 496
        line 139: 505
        line 141: 510
        line 142: 529
        line 145: 530
        line 147: 543
        line 148: 562
        line 151: 563
        line 153: 584
        line 154: 603
        line 157: 604
        line 158: 613
        line 159: 616
        line 161: 625
        line 162: 633
        line 164: 646
        line 165: 653
        line 168: 654
        line 170: 660
        line 171: 679
        line 174: 680
        line 176: 691
        line 177: 706
        line 180: 707
        line 182: 722
        line 183: 735
        line 185: 742
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          277      23     8 petitionId   I
          309      22     8 petitionId   I
          366      12     8 petitionId   I
          397       8     8 petitionId   I
          416       6     6     e   Ljava/lang/Exception;
           28     401     4  page   I
           49     380     5 param   Ljava/lang/String;
          449     164     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          505     108     5 petition   Lext/mods/gameserver/model/Petition;
          633     109     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          722      20     5 petitionId   I
            0     743     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPetition;
            0     743     1 command   Ljava/lang/String;
            0     743     2 player   Lext/mods/gameserver/model/actor/Player;
           11     732     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 33
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class java/util/StringTokenizer, int ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 68
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 38 /* same */
        frame_type = 31 /* same */
        frame_type = 30 /* same */
        frame_type = 16 /* same */
        frame_type = 8 /* same */
        frame_type = 20 /* same */
        frame_type = 9 /* same */
        frame_type = 16 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 32 /* same */
        frame_type = 40 /* same */
        frame_type = 249 /* chop */
          offset_delta = 11
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 25 /* same */
        frame_type = 26 /* same */
        frame_type = 250 /* chop */
          offset_delta = 34

  public void showPendingPetitions(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=12, args_size=3
         0: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
         3: aload_1
         4: invokevirtual #155                // Method ext/mods/gameserver/data/manager/PetitionManager.getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
         7: astore_3
         8: new           #208                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        11: dup
        12: iconst_0
        13: invokespecial #210                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        16: astore        4
        18: aload         4
        20: aload_1
        21: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        24: ldc           #217                // String html/admin/petitions.htm
        26: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        29: aload         4
        31: ldc           #223                // String %unfollow%
        33: aload_3
        34: ifnull        42
        37: ldc           #225                // String <td><button value=\"Unfollow\" action=\"bypass -h admin_petition unfollow\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>
        39: goto          44
        42: ldc           #202                // String
        44: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        47: new           #230                // class ext/mods/commons/data/Pagination
        50: dup
        51: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
        54: invokevirtual #232                // Method ext/mods/gameserver/data/manager/PetitionManager.getPetitions:()Ljava/util/Map;
        57: invokeinterface #236,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        62: invokeinterface #242,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        67: iload_2
        68: bipush        7
        70: invokespecial #250                // Method ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
        73: astore        5
        75: aload         5
        77: invokevirtual #253                // Method ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
        80: astore        6
        82: aload         6
        84: invokeinterface #257,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        89: ifeq          452
        92: aload         6
        94: invokeinterface #262,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        99: checkcast     #160                // class ext/mods/gameserver/model/Petition
       102: astore        7
       104: aload         7
       106: invokevirtual #266                // Method ext/mods/gameserver/model/Petition.isUnread:()Z
       109: ifne          118
       112: ldc_w         #269                // String party_styleicon1_2
       115: goto          121
       118: ldc_w         #271                // String QuestWndInfoIcon_5
       121: astore        8
       123: invokestatic  #273                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       126: aload         7
       128: invokevirtual #159                // Method ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
       131: invokevirtual #278                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       134: astore        11
       136: aload         11
       138: ifnull        164
       141: aload         11
       143: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       146: ifeq          164
       149: aload         11
       151: invokevirtual #282                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       154: astore        9
       156: ldc_w         #285                // String 1
       159: astore        10
       161: goto          176
       164: aload         7
       166: invokevirtual #287                // Method ext/mods/gameserver/model/Petition.getPetitionerName:()Ljava/lang/String;
       169: astore        9
       171: ldc_w         #290                // String 4
       174: astore        10
       176: aload         5
       178: iconst_1
       179: anewarray     #2                  // class java/lang/Object
       182: dup
       183: iconst_0
       184: aload         5
       186: aload         7
       188: invokevirtual #292                // Method ext/mods/commons/data/Pagination.indexOf:(Ljava/lang/Object;)I
       191: iconst_2
       192: irem
       193: ifne          202
       196: ldc_w         #296                // String <table width=280 height=40 bgcolor=000000>
       199: goto          205
       202: ldc_w         #298                // String <table width=280 height=40>
       205: aastore
       206: invokevirtual #300                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       209: aload         5
       211: iconst_5
       212: anewarray     #2                  // class java/lang/Object
       215: dup
       216: iconst_0
       217: ldc_w         #304                // String <tr><td width=20 align=center><img src=\"L2UI_CH3.msnicon
       220: aastore
       221: dup
       222: iconst_1
       223: aload         10
       225: aastore
       226: dup
       227: iconst_2
       228: ldc_w         #306                // String \" width=12 height=16><img src=\"L2UI_CH3.
       231: aastore
       232: dup
       233: iconst_3
       234: aload         8
       236: aastore
       237: dup
       238: iconst_4
       239: ldc_w         #308                // String \" width=11 height=16></td>
       242: aastore
       243: invokevirtual #300                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       246: aload_3
       247: ifnull        340
       250: aload_3
       251: invokevirtual #310                // Method ext/mods/gameserver/model/Petition.getId:()I
       254: aload         7
       256: invokevirtual #310                // Method ext/mods/gameserver/model/Petition.getId:()I
       259: if_icmpne     340
       262: aload         5
       264: bipush        9
       266: anewarray     #2                  // class java/lang/Object
       269: dup
       270: iconst_0
       271: ldc_w         #313                // String <td width=260>#
       274: aastore
       275: dup
       276: iconst_1
       277: aload         7
       279: invokevirtual #310                // Method ext/mods/gameserver/model/Petition.getId:()I
       282: invokestatic  #171                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       285: aastore
       286: dup
       287: iconst_2
       288: ldc_w         #315                // String  by
       291: aastore
       292: dup
       293: iconst_3
       294: aload         9
       296: aastore
       297: dup
       298: iconst_4
       299: ldc_w         #317                // String <br1><font color=B09878>Type:</font>
       302: aastore
       303: dup
       304: iconst_5
       305: aload         7
       307: invokevirtual #319                // Method ext/mods/gameserver/model/Petition.getType:()Lext/mods/gameserver/enums/petitions/PetitionType;
       310: aastore
       311: dup
       312: bipush        6
       314: ldc_w         #323                // String  <font color=B09878>State:</font>
       317: aastore
       318: dup
       319: bipush        7
       321: aload         7
       323: invokevirtual #325                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
       326: aastore
       327: dup
       328: bipush        8
       330: ldc_w         #329                // String </td>
       333: aastore
       334: invokevirtual #300                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       337: goto          434
       340: aload         5
       342: bipush        11
       344: anewarray     #2                  // class java/lang/Object
       347: dup
       348: iconst_0
       349: ldc_w         #331                // String <td width=260><a action=\"bypass -h admin_petition view
       352: aastore
       353: dup
       354: iconst_1
       355: aload         7
       357: invokevirtual #310                // Method ext/mods/gameserver/model/Petition.getId:()I
       360: invokestatic  #171                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       363: aastore
       364: dup
       365: iconst_2
       366: ldc_w         #333                // String \">#
       369: aastore
       370: dup
       371: iconst_3
       372: aload         7
       374: invokevirtual #310                // Method ext/mods/gameserver/model/Petition.getId:()I
       377: invokestatic  #171                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       380: aastore
       381: dup
       382: iconst_4
       383: ldc_w         #315                // String  by
       386: aastore
       387: dup
       388: iconst_5
       389: aload         9
       391: aastore
       392: dup
       393: bipush        6
       395: ldc_w         #335                // String </a><br1><font color=B09878>Type:</font>
       398: aastore
       399: dup
       400: bipush        7
       402: aload         7
       404: invokevirtual #319                // Method ext/mods/gameserver/model/Petition.getType:()Lext/mods/gameserver/enums/petitions/PetitionType;
       407: aastore
       408: dup
       409: bipush        8
       411: ldc_w         #323                // String  <font color=B09878>State:</font>
       414: aastore
       415: dup
       416: bipush        9
       418: aload         7
       420: invokevirtual #325                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
       423: aastore
       424: dup
       425: bipush        10
       427: ldc_w         #329                // String </td>
       430: aastore
       431: invokevirtual #300                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       434: aload         5
       436: iconst_1
       437: anewarray     #2                  // class java/lang/Object
       440: dup
       441: iconst_0
       442: ldc_w         #337                // String </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
       445: aastore
       446: invokevirtual #300                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       449: goto          82
       452: aload         5
       454: bipush        41
       456: invokevirtual #339                // Method ext/mods/commons/data/Pagination.generateSpace:(I)V
       459: aload         5
       461: ldc_w         #342                // String bypass admin_petition %page%
       464: invokevirtual #344                // Method ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
       467: aload         4
       469: ldc_w         #347                // String %content%
       472: aload         5
       474: invokevirtual #349                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       477: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       480: aload_1
       481: aload         4
       483: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       486: return
      LineNumberTable:
        line 189: 0
        line 191: 8
        line 192: 18
        line 193: 29
        line 195: 47
        line 196: 75
        line 198: 104
        line 202: 123
        line 203: 136
        line 205: 149
        line 206: 156
        line 210: 164
        line 211: 171
        line 214: 176
        line 216: 209
        line 218: 246
        line 219: 262
        line 221: 340
        line 223: 434
        line 224: 449
        line 225: 452
        line 226: 459
        line 228: 467
        line 229: 480
        line 230: 486
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          156       8     9 playerName   Ljava/lang/String;
          161       3    10 petitionerStatus   Ljava/lang/String;
          123     326     8 isReaded   Ljava/lang/String;
          171     278     9 playerName   Ljava/lang/String;
          176     273    10 petitionerStatus   Ljava/lang/String;
          136     313    11 petitioner   Lext/mods/gameserver/model/actor/Player;
          104     345     7 petition   Lext/mods/gameserver/model/Petition;
            0     487     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPetition;
            0     487     1 player   Lext/mods/gameserver/model/actor/Player;
            0     487     2  page   I
            8     479     3 activePetition   Lext/mods/gameserver/model/Petition;
           18     469     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           75     412     5  list   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           75     412     5  list   Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/Petition;>;
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPetition, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPetition, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ class ext/mods/commons/data/Pagination, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPetition, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/model/Petition, class java/lang/String, top, top, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPetition, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/model/Petition, class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPetition, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/model/Petition, class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPetition, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/model/Petition, class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 134
        frame_type = 251 /* same_frame_extended */
          offset_delta = 93
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminPetition, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/Petition, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/commons/data/Pagination ]
          stack = []

  public void showPetition(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=3
         0: aload_1
         1: invokevirtual #352                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
         4: ifne          8
         7: return
         8: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
        11: invokevirtual #232                // Method ext/mods/gameserver/data/manager/PetitionManager.getPetitions:()Ljava/util/Map;
        14: iload_2
        15: invokestatic  #171                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        18: invokeinterface #355,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        23: checkcast     #160                // class ext/mods/gameserver/model/Petition
        26: astore_3
        27: aload_3
        28: ifnonnull     32
        31: return
        32: invokestatic  #273                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        35: aload_3
        36: invokevirtual #159                // Method ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
        39: invokevirtual #278                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        42: astore        4
        44: aload         4
        46: ifnull        63
        49: aload         4
        51: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        54: ifeq          63
        57: ldc_w         #359                // String online
        60: goto          66
        63: ldc_w         #361                // String offline
        66: astore        5
        68: aload_3
        69: invokevirtual #363                // Method ext/mods/gameserver/model/Petition.setAsRead:()V
        72: new           #208                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        75: dup
        76: iconst_0
        77: invokespecial #210                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        80: astore        6
        82: aload         6
        84: aload_1
        85: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        88: ldc_w         #366                // String html/admin/petition.htm
        91: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        94: aload         6
        96: ldc_w         #368                // String %submitDate%
        99: new           #370                // class java/text/SimpleDateFormat
       102: dup
       103: ldc_w         #372                // String dd-MM-yyyy HH:mm
       106: invokespecial #374                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       109: aload_3
       110: invokevirtual #376                // Method ext/mods/gameserver/model/Petition.getSubmitDate:()J
       113: invokestatic  #380                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       116: invokevirtual #385                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       119: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       122: aload         6
       124: ldc_w         #389                // String %petitionerName%
       127: aload_3
       128: invokevirtual #287                // Method ext/mods/gameserver/model/Petition.getPetitionerName:()Ljava/lang/String;
       131: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       134: aload         6
       136: ldc_w         #391                // String %petitionerStatus%
       139: aload         5
       141: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       144: aload         6
       146: ldc_w         #393                // String %type%
       149: aload_3
       150: invokevirtual #319                // Method ext/mods/gameserver/model/Petition.getType:()Lext/mods/gameserver/enums/petitions/PetitionType;
       153: invokevirtual #395                // Method ext/mods/gameserver/enums/petitions/PetitionType.toString:()Ljava/lang/String;
       156: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       159: aload         6
       161: ldc_w         #398                // String %state%
       164: aload_3
       165: invokevirtual #325                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
       168: invokevirtual #400                // Method ext/mods/gameserver/enums/petitions/PetitionState.toString:()Ljava/lang/String;
       171: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       174: aload         6
       176: ldc_w         #403                // String %responders%
       179: aload_3
       180: invokevirtual #405                // Method ext/mods/gameserver/model/Petition.getFormattedResponders:()Ljava/lang/String;
       183: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       186: aload         6
       188: ldc_w         #347                // String %content%
       191: aload_3
       192: invokevirtual #408                // Method ext/mods/gameserver/model/Petition.getContent:()Ljava/lang/String;
       195: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       198: aload_3
       199: invokevirtual #325                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
       202: getstatic     #409                // Field ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
       205: if_acmpeq     218
       208: aload_3
       209: invokevirtual #325                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
       212: getstatic     #413                // Field ext/mods/gameserver/enums/petitions/PetitionState.ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
       215: if_acmpne     232
       218: aload         6
       220: ldc_w         #416                // String %buttonsOrFeedback%
       223: ldc_w         #418                // String <center><img src=\"L2UI.SquareGray\" width=280 height=1><br><table width=130><tr><td><button value=\"Join\" action=\"bypass -h admin_petition join %id%\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td><td><button value=\"Reject\" action=\"bypass -h admin_petition reject %id%\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td></tr></table></center>
       226: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       229: goto          293
       232: aload_3
       233: invokevirtual #325                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
       236: getstatic     #420                // Field ext/mods/gameserver/enums/petitions/PetitionState.CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
       239: if_acmpne     283
       242: aload         6
       244: ldc_w         #416                // String %buttonsOrFeedback%
       247: ldc_w         #423                // String <center><img src=\"L2UI.SquareGray\" width=280 height=1><br><table width=280><tr><td>Rate: %rate%</td></tr><tr><td>Feedback: %feedback%</td></tr></table></center>
       250: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       253: aload         6
       255: ldc_w         #425                // String %rate%
       258: aload_3
       259: invokevirtual #427                // Method ext/mods/gameserver/model/Petition.getRate:()Lext/mods/gameserver/enums/petitions/PetitionRate;
       262: invokevirtual #431                // Method ext/mods/gameserver/enums/petitions/PetitionRate.getDesc:()Ljava/lang/String;
       265: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       268: aload         6
       270: ldc_w         #436                // String %feedback%
       273: aload_3
       274: invokevirtual #438                // Method ext/mods/gameserver/model/Petition.getFeedback:()Ljava/lang/String;
       277: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       280: goto          293
       283: aload         6
       285: ldc_w         #416                // String %buttonsOrFeedback%
       288: ldc           #202                // String
       290: invokevirtual #227                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       293: aload         6
       295: ldc_w         #441                // String %id%
       298: aload_3
       299: invokevirtual #310                // Method ext/mods/gameserver/model/Petition.getId:()I
       302: invokevirtual #443                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       305: aload_1
       306: aload         6
       308: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       311: return
      LineNumberTable:
        line 234: 0
        line 235: 7
        line 237: 8
        line 238: 27
        line 239: 31
        line 241: 32
        line 242: 44
        line 244: 68
        line 246: 72
        line 247: 82
        line 248: 94
        line 249: 122
        line 250: 134
        line 251: 144
        line 252: 159
        line 253: 174
        line 254: 186
        line 256: 198
        line 257: 218
        line 258: 232
        line 260: 242
        line 261: 253
        line 262: 268
        line 265: 283
        line 267: 293
        line 268: 305
        line 269: 311
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     312     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPetition;
            0     312     1 player   Lext/mods/gameserver/model/actor/Player;
            0     312     2    id   I
           27     285     3 petition   Lext/mods/gameserver/model/Petition;
           44     268     4 petitioner   Lext/mods/gameserver/model/actor/Player;
           68     244     5 petitionerStatus   Ljava/lang/String;
           82     230     6  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 8
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 151
          locals = [ class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 13 /* same */
        frame_type = 50 /* same */
        frame_type = 9 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #446                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 274: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminPetition;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #21                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #18                 // String admin_petition
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #184                // String admin_force_peti
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #123                // String admin_add_peti_chat
        18: aastore
        19: putstatic     #446                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        22: return
      LineNumberTable:
        line 43: 0
}
SourceFile: "AdminPetition.java"
