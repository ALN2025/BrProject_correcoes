// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminSkill
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.class
  Last modified 9 de jul de 2026; size 16898 bytes
  MD5 checksum a3f3f1bc20bd2224cb77f5ed13a359bc
  Compiled from "AdminSkill.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminSkill implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 13, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill
    #9 = NameAndType        #11:#12       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminSkill
   #11 = Utf8               getTargetPlayer
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #13 = String             #14           // admin_show_skills
   #14 = Utf8               admin_show_skills
   #15 = Methodref          #16.#17       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #16 = Class              #18           // java/lang/String
   #17 = NameAndType        #19:#20       // equals:(Ljava/lang/Object;)Z
   #18 = Utf8               java/lang/String
   #19 = Utf8               equals
   #20 = Utf8               (Ljava/lang/Object;)Z
   #21 = Methodref          #8.#22        // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.showMainPage:(Lext/mods/gameserver/model/actor/Player;)V
   #22 = NameAndType        #23:#24       // showMainPage:(Lext/mods/gameserver/model/actor/Player;)V
   #23 = Utf8               showMainPage
   #24 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #25 = String             #26           // admin_remove_skills
   #26 = Utf8               admin_remove_skills
   #27 = Methodref          #16.#28       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #28 = NameAndType        #29:#30       // startsWith:(Ljava/lang/String;)Z
   #29 = Utf8               startsWith
   #30 = Utf8               (Ljava/lang/String;)Z
   #31 = Methodref          #16.#32       // java/lang/String.substring:(I)Ljava/lang/String;
   #32 = NameAndType        #33:#34       // substring:(I)Ljava/lang/String;
   #33 = Utf8               substring
   #34 = Utf8               (I)Ljava/lang/String;
   #35 = Methodref          #36.#37       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #36 = Class              #38           // java/lang/Integer
   #37 = NameAndType        #39:#40       // parseInt:(Ljava/lang/String;)I
   #38 = Utf8               java/lang/Integer
   #39 = Utf8               parseInt
   #40 = Utf8               (Ljava/lang/String;)I
   #41 = Methodref          #8.#42        // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.removeSkillsPage:(Lext/mods/gameserver/model/actor/Player;I)V
   #42 = NameAndType        #43:#44       // removeSkillsPage:(Lext/mods/gameserver/model/actor/Player;I)V
   #43 = Utf8               removeSkillsPage
   #44 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #45 = Class              #46           // java/lang/Exception
   #46 = Utf8               java/lang/Exception
   #47 = String             #48           // admin_skill_list
   #48 = Utf8               admin_skill_list
   #49 = String             #50           // skills.htm
   #50 = Utf8               skills.htm
   #51 = Methodref          #8.#52        // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #52 = NameAndType        #53:#54       // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #53 = Utf8               sendFile
   #54 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #55 = String             #56           // admin_skill_index
   #56 = Utf8               admin_skill_index
   #57 = InvokeDynamic      #0:#58        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #58 = NameAndType        #59:#60       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #59 = Utf8               makeConcatWithConstants
   #60 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #61 = String             #62           // admin_add_skill
   #62 = Utf8               admin_add_skill
   #63 = Methodref          #8.#64        // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.adminAddSkill:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #64 = NameAndType        #65:#54       // adminAddSkill:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #65 = Utf8               adminAddSkill
   #66 = String             #67           // Usage: //add_skill <skill_id> <level>
   #67 = Utf8               Usage: //add_skill <skill_id> <level>
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #69 = Class              #71           // ext/mods/gameserver/model/actor/Player
   #70 = NameAndType        #72:#73       // sendMessage:(Ljava/lang/String;)V
   #71 = Utf8               ext/mods/gameserver/model/actor/Player
   #72 = Utf8               sendMessage
   #73 = Utf8               (Ljava/lang/String;)V
   #74 = String             #75           // admin_remove_skill
   #75 = Utf8               admin_remove_skill
   #76 = Methodref          #8.#77        // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.adminRemoveSkill:(Lext/mods/gameserver/model/actor/Player;I)V
   #77 = NameAndType        #78:#44       // adminRemoveSkill:(Lext/mods/gameserver/model/actor/Player;I)V
   #78 = Utf8               adminRemoveSkill
   #79 = String             #80           // Usage: //remove_skill <skill_id>
   #80 = Utf8               Usage: //remove_skill <skill_id>
   #81 = String             #82           // admin_give_all_skills
   #82 = Utf8               admin_give_all_skills
   #83 = Methodref          #8.#84        // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.adminGiveAllSkills:(Lext/mods/gameserver/model/actor/Player;)V
   #84 = NameAndType        #85:#24       // adminGiveAllSkills:(Lext/mods/gameserver/model/actor/Player;)V
   #85 = Utf8               adminGiveAllSkills
   #86 = String             #87           // admin_remove_all_skills
   #87 = Utf8               admin_remove_all_skills
   #88 = Methodref          #69.#89       // ext/mods/gameserver/model/actor/Player.getSkills:()Ljava/util/Map;
   #89 = NameAndType        #90:#91       // getSkills:()Ljava/util/Map;
   #90 = Utf8               getSkills
   #91 = Utf8               ()Ljava/util/Map;
   #92 = InterfaceMethodref #93.#94       // java/util/Map.values:()Ljava/util/Collection;
   #93 = Class              #95           // java/util/Map
   #94 = NameAndType        #96:#97       // values:()Ljava/util/Collection;
   #95 = Utf8               java/util/Map
   #96 = Utf8               values
   #97 = Utf8               ()Ljava/util/Collection;
   #98 = InterfaceMethodref #99.#100      // java/util/Collection.iterator:()Ljava/util/Iterator;
   #99 = Class              #101          // java/util/Collection
  #100 = NameAndType        #102:#103     // iterator:()Ljava/util/Iterator;
  #101 = Utf8               java/util/Collection
  #102 = Utf8               iterator
  #103 = Utf8               ()Ljava/util/Iterator;
  #104 = InterfaceMethodref #105.#106     // java/util/Iterator.hasNext:()Z
  #105 = Class              #107          // java/util/Iterator
  #106 = NameAndType        #108:#109     // hasNext:()Z
  #107 = Utf8               java/util/Iterator
  #108 = Utf8               hasNext
  #109 = Utf8               ()Z
  #110 = InterfaceMethodref #105.#111     // java/util/Iterator.next:()Ljava/lang/Object;
  #111 = NameAndType        #112:#113     // next:()Ljava/lang/Object;
  #112 = Utf8               next
  #113 = Utf8               ()Ljava/lang/Object;
  #114 = Class              #115          // ext/mods/gameserver/skills/L2Skill
  #115 = Utf8               ext/mods/gameserver/skills/L2Skill
  #116 = Methodref          #114.#117     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #117 = NameAndType        #118:#119     // getId:()I
  #118 = Utf8               getId
  #119 = Utf8               ()I
  #120 = Methodref          #69.#121      // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #121 = NameAndType        #122:#123     // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #122 = Utf8               removeSkill
  #123 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
  #124 = Methodref          #69.#125      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #125 = NameAndType        #126:#127     // getName:()Ljava/lang/String;
  #126 = Utf8               getName
  #127 = Utf8               ()Ljava/lang/String;
  #128 = InvokeDynamic      #1:#58        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #129 = String             #130          // Admin removed all skills from you.
  #130 = Utf8               Admin removed all skills from you.
  #131 = Class              #132          // ext/mods/gameserver/network/serverpackets/SkillList
  #132 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
  #133 = Methodref          #131.#134     // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #134 = NameAndType        #5:#24        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #135 = Methodref          #69.#136      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #136 = NameAndType        #137:#138     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #137 = Utf8               sendPacket
  #138 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #139 = String             #140          // admin_learn_skill
  #140 = Utf8               admin_learn_skill
  #141 = String             #142          //
  #142 = Utf8
  #143 = Methodref          #16.#144      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #144 = NameAndType        #145:#146     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #145 = Utf8               split
  #146 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #147 = Methodref          #8.#148       // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.adminLearnSkill:(Lext/mods/gameserver/model/actor/Player;IIII)V
  #148 = NameAndType        #149:#150     // adminLearnSkill:(Lext/mods/gameserver/model/actor/Player;IIII)V
  #149 = Utf8               adminLearnSkill
  #150 = Utf8               (Lext/mods/gameserver/model/actor/Player;IIII)V
  #151 = String             #152          // Usage: //learn_skill <skill_id> <skill_level> <class_name> <page>
  #152 = Utf8               Usage: //learn_skill <skill_id> <skill_level> <class_name> <page>
  #153 = String             #154          // admin_show_skills_by_class
  #154 = Utf8               admin_show_skills_by_class
  #155 = Class              #156          // java/util/StringTokenizer
  #156 = Utf8               java/util/StringTokenizer
  #157 = Methodref          #155.#158     // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #158 = NameAndType        #5:#159       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #159 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #160 = Methodref          #155.#161     // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #161 = NameAndType        #162:#127     // nextToken:()Ljava/lang/String;
  #162 = Utf8               nextToken
  #163 = Methodref          #155.#164     // java/util/StringTokenizer.hasMoreTokens:()Z
  #164 = NameAndType        #165:#109     // hasMoreTokens:()Z
  #165 = Utf8               hasMoreTokens
  #166 = Methodref          #8.#167       // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.showSkillsByClass:(Lext/mods/gameserver/model/actor/Player;II)V
  #167 = NameAndType        #168:#169     // showSkillsByClass:(Lext/mods/gameserver/model/actor/Player;II)V
  #168 = Utf8               showSkillsByClass
  #169 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #170 = String             #171          // Usage: //show_skills_by_class <class_name> [<page_number>]
  #171 = Utf8               Usage: //show_skills_by_class <class_name> [<page_number>]
  #172 = String             #173          // admin_clan_skill
  #173 = Utf8               admin_clan_skill
  #174 = Methodref          #155.#175     // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
  #175 = NameAndType        #5:#73        // "<init>":(Ljava/lang/String;)V
  #176 = Methodref          #69.#177      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #177 = NameAndType        #178:#109     // isClanLeader:()Z
  #178 = Utf8               isClanLeader
  #179 = Fieldref           #180.#181     // ext/mods/gameserver/network/SystemMessageId.S1_IS_NOT_A_CLAN_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #180 = Class              #182          // ext/mods/gameserver/network/SystemMessageId
  #181 = NameAndType        #183:#184     // S1_IS_NOT_A_CLAN_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #182 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #183 = Utf8               S1_IS_NOT_A_CLAN_LEADER
  #184 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #185 = Methodref          #186.#187     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #186 = Class              #188          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #187 = NameAndType        #189:#190     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #188 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #189 = Utf8               getSystemMessage
  #190 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #191 = Methodref          #186.#192     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #192 = NameAndType        #193:#194     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #193 = Utf8               addCharName
  #194 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #195 = Methodref          #69.#196      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #196 = NameAndType        #197:#198     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #197 = Utf8               getClan
  #198 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #199 = Methodref          #8.#200       // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.showClanSkillList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/pledge/Clan;I)V
  #200 = NameAndType        #201:#202     // showClanSkillList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/pledge/Clan;I)V
  #201 = Utf8               showClanSkillList
  #202 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/pledge/Clan;I)V
  #203 = Methodref          #204.#205     // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
  #204 = Class              #206          // ext/mods/commons/lang/StringUtil
  #205 = NameAndType        #207:#30      // isDigit:(Ljava/lang/String;)Z
  #206 = Utf8               ext/mods/commons/lang/StringUtil
  #207 = Utf8               isDigit
  #208 = Methodref          #16.#209      // java/lang/String.hashCode:()I
  #209 = NameAndType        #210:#119     // hashCode:()I
  #210 = Utf8               hashCode
  #211 = String             #212          // set
  #212 = Utf8               set
  #213 = String             #214          // remove
  #214 = Utf8               remove
  #215 = String             #216          // all
  #216 = Utf8               all
  #217 = Methodref          #218.#219     // ext/mods/gameserver/model/pledge/Clan.addAllClanSkills:()Z
  #218 = Class              #220          // ext/mods/gameserver/model/pledge/Clan
  #219 = NameAndType        #221:#109     // addAllClanSkills:()Z
  #220 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #221 = Utf8               addAllClanSkills
  #222 = Methodref          #218.#125     // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #223 = InvokeDynamic      #2:#58        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #224 = String             #225          // Usage: //clan_skill set id level [page]
  #225 = Utf8               Usage: //clan_skill set id level [page]
  #226 = Methodref          #227.#228     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #227 = Class              #229          // ext/mods/gameserver/data/SkillTable
  #228 = NameAndType        #230:#231     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #229 = Utf8               ext/mods/gameserver/data/SkillTable
  #230 = Utf8               getInstance
  #231 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #232 = Methodref          #227.#233     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #233 = NameAndType        #234:#235     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #234 = Utf8               getInfo
  #235 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #236 = Methodref          #218.#237     // ext/mods/gameserver/model/pledge/Clan.addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #237 = NameAndType        #238:#239     // addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #238 = Utf8               addClanSkill
  #239 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
  #240 = Methodref          #114.#125     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #241 = InvokeDynamic      #3:#242       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #242 = NameAndType        #59:#243      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #243 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #244 = Methodref          #218.#245     // ext/mods/gameserver/model/pledge/Clan.removeAllClanSkills:()Z
  #245 = NameAndType        #246:#109     // removeAllClanSkills:()Z
  #246 = Utf8               removeAllClanSkills
  #247 = InvokeDynamic      #4:#58        // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #248 = Methodref          #218.#249     // ext/mods/gameserver/model/pledge/Clan.removeClanSkill:(I)Z
  #249 = NameAndType        #250:#251     // removeClanSkill:(I)Z
  #250 = Utf8               removeClanSkill
  #251 = Utf8               (I)Z
  #252 = InvokeDynamic      #5:#253       // #5:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #253 = NameAndType        #59:#254      // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #254 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #255 = String             #256          // Usage: //clan_skill remove id|all [page]
  #256 = Utf8               Usage: //clan_skill remove id|all [page]
  #257 = Methodref          #69.#258      // ext/mods/gameserver/model/actor/Player.rewardSkills:()V
  #258 = NameAndType        #259:#6       // rewardSkills:()V
  #259 = Utf8               rewardSkills
  #260 = InvokeDynamic      #6:#58        // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #261 = Fieldref           #180.#262     // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #262 = NameAndType        #263:#184     // TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #263 = Utf8               TARGET_IS_INCORRECT
  #264 = Methodref          #69.#265      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #265 = NameAndType        #137:#266     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #266 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #267 = Class              #268          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #268 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #269 = Methodref          #267.#270     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #270 = NameAndType        #5:#271       // "<init>":(I)V
  #271 = Utf8               (I)V
  #272 = Class              #273          // ext/mods/commons/data/Pagination
  #273 = Utf8               ext/mods/commons/data/Pagination
  #274 = InterfaceMethodref #99.#275      // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #275 = NameAndType        #276:#277     // stream:()Ljava/util/stream/Stream;
  #276 = Utf8               stream
  #277 = Utf8               ()Ljava/util/stream/Stream;
  #278 = Class              #279          // ext/mods/gameserver/handler/IAdminCommandHandler
  #279 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #280 = Methodref          #272.#281     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #281 = NameAndType        #5:#282       // "<init>":(Ljava/util/stream/Stream;II)V
  #282 = Utf8               (Ljava/util/stream/Stream;II)V
  #283 = String             #284          // <html><body><table width=270><tr>
  #284 = Utf8               <html><body><table width=270><tr>
  #285 = Methodref          #272.#286     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #286 = NameAndType        #287:#288     // append:([Ljava/lang/Object;)V
  #287 = Utf8               append
  #288 = Utf8               ([Ljava/lang/Object;)V
  #289 = String             #290          // <td width=45><button value=\"Main\" action=\"bypass -h admin_admin\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #290 = Utf8               <td width=45><button value=\"Main\" action=\"bypass -h admin_admin\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #291 = String             #292          // <td width=180><center>Delete Skills Menu</center></td>
  #292 = Utf8               <td width=180><center>Delete Skills Menu</center></td>
  #293 = String             #294          // <td width=45><button value=\"Back\" action=\"bypass -h admin_show_skills\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #294 = Utf8               <td width=45><button value=\"Back\" action=\"bypass -h admin_show_skills\" width=40 height=15 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #295 = String             #296          // </tr></table><br><br><center>Editing <font color=\"LEVEL\">
  #296 = Utf8               </tr></table><br><br><center>Editing <font color=\"LEVEL\">
  #297 = String             #298          // </font>,
  #298 = Utf8               </font>,
  #299 = Methodref          #69.#300      // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #300 = NameAndType        #301:#302     // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #301 = Utf8               getTemplate
  #302 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #303 = Methodref          #304.#305     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
  #304 = Class              #306          // ext/mods/gameserver/model/actor/template/PlayerTemplate
  #305 = NameAndType        #307:#127     // getClassName:()Ljava/lang/String;
  #306 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
  #307 = Utf8               getClassName
  #308 = String             #309          //  lvl
  #309 = Utf8                lvl
  #310 = Methodref          #69.#311      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #311 = NameAndType        #312:#313     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #312 = Utf8               getStatus
  #313 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #314 = Methodref          #315.#316     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #315 = Class              #317          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #316 = NameAndType        #318:#119     // getLevel:()I
  #317 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #318 = Utf8               getLevel
  #319 = Methodref          #36.#320      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #320 = NameAndType        #321:#322     // valueOf:(I)Ljava/lang/Integer;
  #321 = Utf8               valueOf
  #322 = Utf8               (I)Ljava/lang/Integer;
  #323 = String             #324          // .<br>
  #324 = Utf8               .<br>
  #325 = String             #326          // bypass -h admin_remove_skills %page%
  #326 = Utf8               bypass -h admin_remove_skills %page%
  #327 = Methodref          #272.#328     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #328 = NameAndType        #329:#73      // generatePages:(Ljava/lang/String;)V
  #329 = Utf8               generatePages
  #330 = String             #331          // <table width=270><tr><td width=80>Name:</td><td width=60>Level:</td><td width=40>Id:</td></tr>
  #331 = Utf8               <table width=270><tr><td width=80>Name:</td><td width=60>Level:</td><td width=40>Id:</td></tr>
  #332 = Methodref          #272.#100     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #333 = String             #334          // <tr>
  #334 = Utf8               <tr>
  #335 = String             #336          // <td width=80><a action=\"bypass -h admin_remove_skill
  #336 = Utf8               <td width=80><a action=\"bypass -h admin_remove_skill
  #337 = String             #338          // \">
  #338 = Utf8               \">
  #339 = String             #340          // </a></td>
  #340 = Utf8               </a></td>
  #341 = String             #342          // <td width=60>
  #342 = Utf8               <td width=60>
  #343 = Methodref          #114.#316     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #344 = String             #345          // </td>
  #345 = Utf8               </td>
  #346 = String             #347          // <td width=40>
  #347 = Utf8               <td width=40>
  #348 = String             #349          // </tr>
  #349 = Utf8               </tr>
  #350 = String             #351          // </table><br><center><table width=200><tr>
  #351 = Utf8               </table><br><center><table width=200><tr>
  #352 = String             #353          // <td width=50 align=right>Id: </td>
  #353 = Utf8               <td width=50 align=right>Id: </td>
  #354 = String             #355          // <td><edit var=\"id_to_remove\" width=55></td>
  #355 = Utf8               <td><edit var=\"id_to_remove\" width=55></td>
  #356 = String             #357          // <td width=100><button value=\"Remove skill\" action=\"bypass -h admin_remove_skill $id_to_remove\" width=95 height=21 back=\"bigbutton_over\" fore=\"bigbutton\"></td>
  #357 = Utf8               <td width=100><button value=\"Remove skill\" action=\"bypass -h admin_remove_skill $id_to_remove\" width=95 height=21 back=\"bigbutton_over\" fore=\"bigbutton\"></td>
  #358 = String             #359          // </tr><tr>
  #359 = Utf8               </tr><tr>
  #360 = String             #361          // <td></td><td></td><td><button value=\"Back to stats\" action=\"bypass -h admin_debug\" width=95 height=21 back=\"bigbutton_over\" fore=\"bigbutton\"></td>
  #361 = Utf8               <td></td><td></td><td><button value=\"Back to stats\" action=\"bypass -h admin_debug\" width=95 height=21 back=\"bigbutton_over\" fore=\"bigbutton\"></td>
  #362 = String             #363          // </tr></table></center></body></html>
  #363 = Utf8               </tr></table></center></body></html>
  #364 = Methodref          #272.#365     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #365 = NameAndType        #366:#127     // getContent:()Ljava/lang/String;
  #366 = Utf8               getContent
  #367 = Methodref          #267.#368     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #368 = NameAndType        #369:#73      // setHtml:(Ljava/lang/String;)V
  #369 = Utf8               setHtml
  #370 = Fieldref           #180.#371     // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #371 = NameAndType        #372:#184     // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #372 = Utf8               INVALID_TARGET
  #373 = Methodref          #69.#374      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #374 = NameAndType        #375:#376     // getLocale:()Ljava/util/Locale;
  #375 = Utf8               getLocale
  #376 = Utf8               ()Ljava/util/Locale;
  #377 = String             #378          // html/admin/charskills.htm
  #378 = Utf8               html/admin/charskills.htm
  #379 = Methodref          #267.#380     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #380 = NameAndType        #381:#382     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #381 = Utf8               setFile
  #382 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #383 = String             #384          // %name%
  #384 = Utf8               %name%
  #385 = Methodref          #267.#386     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #386 = NameAndType        #387:#159     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #387 = Utf8               replace
  #388 = String             #389          // %level%
  #389 = Utf8               %level%
  #390 = Methodref          #267.#391     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #391 = NameAndType        #387:#392     // replace:(Ljava/lang/String;I)V
  #392 = Utf8               (Ljava/lang/String;I)V
  #393 = String             #394          // %class%
  #394 = Utf8               %class%
  #395 = Methodref          #155.#396     // java/util/StringTokenizer.countTokens:()I
  #396 = NameAndType        #397:#119     // countTokens:()I
  #397 = Utf8               countTokens
  #398 = Methodref          #69.#399      // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #399 = NameAndType        #400:#401     // addSkill:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #400 = Utf8               addSkill
  #401 = Utf8               (Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #402 = InvokeDynamic      #7:#58        // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #403 = InvokeDynamic      #8:#242       // #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #404 = String             #405          // Error: there is no such skill.
  #405 = Utf8               Error: there is no such skill.
  #406 = InvokeDynamic      #9:#242       // #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #407 = InvokeDynamic      #10:#58       // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #408 = Methodref          #409.#410     // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #409 = Class              #411          // ext/mods/gameserver/data/xml/PlayerData
  #410 = NameAndType        #230:#412     // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #411 = Utf8               ext/mods/gameserver/data/xml/PlayerData
  #412 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
  #413 = Methodref          #409.#414     // ext/mods/gameserver/data/xml/PlayerData.getSkillsByClassId:(I)Ljava/util/List;
  #414 = NameAndType        #415:#416     // getSkillsByClassId:(I)Ljava/util/List;
  #415 = Utf8               getSkillsByClassId
  #416 = Utf8               (I)Ljava/util/List;
  #417 = InterfaceMethodref #418.#419     // java/util/List.isEmpty:()Z
  #418 = Class              #420          // java/util/List
  #419 = NameAndType        #421:#109     // isEmpty:()Z
  #420 = Utf8               java/util/List
  #421 = Utf8               isEmpty
  #422 = InvokeDynamic      #11:#423      // #11:makeConcatWithConstants:(I)Ljava/lang/String;
  #423 = NameAndType        #59:#34       // makeConcatWithConstants:(I)Ljava/lang/String;
  #424 = InterfaceMethodref #418.#275     // java/util/List.stream:()Ljava/util/stream/Stream;
  #425 = InvokeDynamic      #12:#426      // #12:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #426 = NameAndType        #427:#428     // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #427 = Utf8               test
  #428 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #429 = InterfaceMethodref #430.#431     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #430 = Class              #432          // java/util/stream/Stream
  #431 = NameAndType        #433:#434     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #432 = Utf8               java/util/stream/Stream
  #433 = Utf8               filter
  #434 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #435 = InterfaceMethodref #430.#436     // java/util/stream/Stream.toList:()Ljava/util/List;
  #436 = NameAndType        #437:#438     // toList:()Ljava/util/List;
  #437 = Utf8               toList
  #438 = Utf8               ()Ljava/util/List;
  #439 = String             #440          // <html><body>
  #440 = Utf8               <html><body>
  #441 = String             #442          // <table width=270><tr>
  #442 = Utf8               <table width=270><tr>
  #443 = String             #444          // <td width=180 align=center>Skills for
  #444 = Utf8               <td width=180 align=center>Skills for
  #445 = Methodref          #409.#446     // ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
  #446 = NameAndType        #447:#34      // getClassNameById:(I)Ljava/lang/String;
  #447 = Utf8               getClassNameById
  #448 = String             #449          // </tr></table><br><br>
  #449 = Utf8               </tr></table><br><br>
  #450 = InvokeDynamic      #13:#423      // #13:makeConcatWithConstants:(I)Ljava/lang/String;
  #451 = String             #452          // <table width=300><tr><td width=32>Icon: </td><td width=80>Name:</td><td width=30>Id:</td></tr>
  #452 = Utf8               <table width=300><tr><td width=32>Icon: </td><td width=80>Name:</td><td width=30>Id:</td></tr>
  #453 = String             #454          // <td width=32><button action=\"bypass admin_learn_skill
  #454 = Utf8               <td width=32><button action=\"bypass admin_learn_skill
  #455 = String             #456          // \" width=32 height=32 back=\"
  #456 = Utf8               \" width=32 height=32 back=\"
  #457 = Methodref          #114.#458     // ext/mods/gameserver/skills/L2Skill.getIcon:()Ljava/lang/String;
  #458 = NameAndType        #459:#127     // getIcon:()Ljava/lang/String;
  #459 = Utf8               getIcon
  #460 = String             #461          // \" fore=\"
  #461 = Utf8               \" fore=\"
  #462 = String             #463          // \" /></td>
  #463 = Utf8               \" /></td>
  #464 = String             #465          // <td width=160>
  #465 = Utf8               <td width=160>
  #466 = String             #467          // <a action=\"bypass -h admin_learn_skill
  #467 = Utf8               <a action=\"bypass -h admin_learn_skill
  #468 = String             #469          //  Lvl.
  #469 = Utf8                Lvl.
  #470 = String             #471          // <td width=30>
  #471 = Utf8               <td width=30>
  #472 = String             #473          // </table>
  #473 = Utf8               </table>
  #474 = String             #475          // </body></html>
  #475 = Utf8               </body></html>
  #476 = InvokeDynamic      #14:#477      // #14:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #477 = NameAndType        #59:#478      // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #478 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #479 = String             #480          // html/admin/clan_skills.htm
  #480 = Utf8               html/admin/clan_skills.htm
  #481 = Methodref          #227.#482     // ext/mods/gameserver/data/SkillTable.getClanSkills:()[Lext/mods/gameserver/skills/L2Skill;
  #482 = NameAndType        #483:#484     // getClanSkills:()[Lext/mods/gameserver/skills/L2Skill;
  #483 = Utf8               getClanSkills
  #484 = Utf8               ()[Lext/mods/gameserver/skills/L2Skill;
  #485 = Methodref          #486.#487     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #486 = Class              #488          // java/util/Arrays
  #487 = NameAndType        #276:#489     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #488 = Utf8               java/util/Arrays
  #489 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #490 = String             #491          // <table width=270><tr><td width=220>Name</td><td width=20>Lvl</td><td width=30>Id</td></tr>
  #491 = Utf8               <table width=270><tr><td width=220>Name</td><td width=20>Lvl</td><td width=30>Id</td></tr>
  #492 = Methodref          #218.#493     // ext/mods/gameserver/model/pledge/Clan.getClanSkills:()Ljava/util/Map;
  #493 = NameAndType        #483:#91      // getClanSkills:()Ljava/util/Map;
  #494 = InterfaceMethodref #93.#495      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #495 = NameAndType        #496:#497     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #496 = Utf8               get
  #497 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #498 = String             #499          // <tr><td>
  #499 = Utf8               <tr><td>
  #500 = String             #501          // </td><td>
  #501 = Utf8               </td><td>
  #502 = String             #503          // </td></tr>
  #503 = Utf8               </td></tr>
  #504 = String             #505          // <tr><td><a action=\"bypass -h admin_clan_skill remove
  #505 = Utf8               <tr><td><a action=\"bypass -h admin_clan_skill remove
  #506 = String             #507          // </a>
  #507 = Utf8               </a>
  #508 = String             #509          // </table><br>
  #509 = Utf8               </table><br>
  #510 = Methodref          #272.#511     // ext/mods/commons/data/Pagination.generateSpace:()V
  #511 = NameAndType        #512:#6       // generateSpace:()V
  #512 = Utf8               generateSpace
  #513 = String             #514          // bypass admin_clan_skill %page%
  #514 = Utf8               bypass admin_clan_skill %page%
  #515 = String             #516          // %content%
  #516 = Utf8               %content%
  #517 = Fieldref           #8.#518       // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.ADMIN_COMMANDS:[Ljava/lang/String;
  #518 = NameAndType        #519:#520     // ADMIN_COMMANDS:[Ljava/lang/String;
  #519 = Utf8               ADMIN_COMMANDS
  #520 = Utf8               [Ljava/lang/String;
  #521 = Utf8               Code
  #522 = Utf8               LineNumberTable
  #523 = Utf8               LocalVariableTable
  #524 = Utf8               this
  #525 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminSkill;
  #526 = Utf8               useAdminCommand
  #527 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #528 = Utf8               e
  #529 = Utf8               Ljava/lang/Exception;
  #530 = Utf8               val
  #531 = Utf8               Ljava/lang/String;
  #532 = Utf8               id
  #533 = Utf8               idval
  #534 = Utf8               I
  #535 = Utf8               skill
  #536 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #537 = Utf8               parts
  #538 = Utf8               skillId
  #539 = Utf8               skillLevel
  #540 = Utf8               classId
  #541 = Utf8               page
  #542 = Utf8               st
  #543 = Utf8               Ljava/util/StringTokenizer;
  #544 = Utf8               level
  #545 = Utf8               param2
  #546 = Utf8               param3
  #547 = Utf8               clan
  #548 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #549 = Utf8               param
  #550 = Utf8               command
  #551 = Utf8               player
  #552 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #553 = Utf8               targetPlayer
  #554 = Utf8               StackMapTable
  #555 = Utf8               html
  #556 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #557 = Utf8               list
  #558 = Utf8               Lext/mods/commons/data/Pagination;
  #559 = Utf8               LocalVariableTypeTable
  #560 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/skills/L2Skill;>;
  #561 = Utf8               levelval
  #562 = Utf8               name
  #563 = Utf8               playerData
  #564 = Utf8               Lext/mods/gameserver/data/xml/PlayerData;
  #565 = Utf8               skills
  #566 = Utf8               Ljava/util/List;
  #567 = Utf8               filteredSkills
  #568 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #569 = Utf8               currentSkill
  #570 = Utf8               targetClan
  #571 = Utf8               getAdminCommandList
  #572 = Utf8               ()[Ljava/lang/String;
  #573 = Utf8               lambda$showSkillsByClass$0
  #574 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #575 = Utf8               existingSkill
  #576 = Utf8               <clinit>
  #577 = Utf8               SourceFile
  #578 = Utf8               AdminSkill.java
  #579 = Utf8               BootstrapMethods
  #580 = String             #581          // skills/\u0001.htm
  #581 = Utf8               skills/\u0001.htm
  #582 = String             #583          // You removed all skills from \u0001.
  #583 = Utf8               You removed all skills from \u0001.
  #584 = String             #585          // You gave all available skills to \u0001 clan.
  #585 = Utf8               You gave all available skills to \u0001 clan.
  #586 = String             #587          // You gave \u0001 skill to \u0001 clan.
  #587 = Utf8               You gave \u0001 skill to \u0001 clan.
  #588 = String             #589          // You removed all skills from \u0001 clan.
  #589 = Utf8               You removed all skills from \u0001 clan.
  #590 = String             #591          // You removed \u0001 skillId from \u0001 clan.
  #591 = Utf8               You removed \u0001 skillId from \u0001 clan.
  #592 = String             #593          // You gave all available skills to \u0001.
  #593 = Utf8               You gave all available skills to \u0001.
  #594 = String             #595          // Admin gave you the skill \u0001.
  #595 = Utf8               Admin gave you the skill \u0001.
  #596 = String             #597          // You gave the skill \u0001 to \u0001.
  #597 = Utf8               You gave the skill \u0001 to \u0001.
  #598 = String             #599          // You removed the skill \u0001 from \u0001.
  #599 = Utf8               You removed the skill \u0001 from \u0001.
  #600 = String             #601          // Admin removed the skill \u0001 from your skills list.
  #601 = Utf8               Admin removed the skill \u0001 from your skills list.
  #602 = String             #603          // No skills found for class: \u0001
  #603 = Utf8               No skills found for class: \u0001
  #604 = MethodType         #20           //  (Ljava/lang/Object;)Z
  #605 = MethodHandle       6:#606        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.lambda$showSkillsByClass$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #606 = Methodref          #8.#607       // ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.lambda$showSkillsByClass$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #607 = NameAndType        #573:#574     // lambda$showSkillsByClass$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #608 = MethodType         #609          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #609 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #610 = String             #611          // bypass -h admin_show_skills_by_class \u0001 %page%
  #611 = Utf8               bypass -h admin_show_skills_by_class \u0001 %page%
  #612 = String             #613          // Admin gave you the skill \u0001 \u0001 lvl.
  #613 = Utf8               Admin gave you the skill \u0001 \u0001 lvl.
  #614 = MethodHandle       6:#615        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #615 = Methodref          #616.#617     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #616 = Class              #618          // java/lang/invoke/StringConcatFactory
  #617 = NameAndType        #59:#619      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #618 = Utf8               java/lang/invoke/StringConcatFactory
  #619 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #620 = MethodHandle       6:#621        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #621 = Methodref          #622.#623     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #622 = Class              #624          // java/lang/invoke/LambdaMetafactory
  #623 = NameAndType        #625:#626     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #624 = Utf8               java/lang/invoke/LambdaMetafactory
  #625 = Utf8               metafactory
  #626 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #627 = Utf8               InnerClasses
  #628 = Class              #629          // java/lang/invoke/MethodHandles$Lookup
  #629 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #630 = Class              #631          // java/lang/invoke/MethodHandles
  #631 = Utf8               java/lang/invoke/MethodHandles
  #632 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminSkill();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSkill;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=14, args_size=3
         0: aload_0
         1: aload_2
         2: iconst_1
         3: invokevirtual #7                  // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
         6: astore_3
         7: aload_1
         8: ldc           #13                 // String admin_show_skills
        10: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        13: ifeq          24
        16: aload_0
        17: aload_2
        18: invokevirtual #21                 // Method showMainPage:(Lext/mods/gameserver/model/actor/Player;)V
        21: goto          998
        24: aload_1
        25: ldc           #25                 // String admin_remove_skills
        27: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        30: ifeq          61
        33: aload_0
        34: aload_2
        35: aload_1
        36: bipush        20
        38: invokevirtual #31                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        41: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        44: invokevirtual #41                 // Method removeSkillsPage:(Lext/mods/gameserver/model/actor/Player;I)V
        47: goto          998
        50: astore        4
        52: aload_0
        53: aload_2
        54: iconst_1
        55: invokevirtual #41                 // Method removeSkillsPage:(Lext/mods/gameserver/model/actor/Player;I)V
        58: goto          998
        61: aload_1
        62: ldc           #47                 // String admin_skill_list
        64: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        67: ifeq          80
        70: aload_0
        71: aload_2
        72: ldc           #49                 // String skills.htm
        74: invokevirtual #51                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        77: goto          998
        80: aload_1
        81: ldc           #55                 // String admin_skill_index
        83: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        86: ifeq          117
        89: aload_1
        90: bipush        18
        92: invokevirtual #31                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        95: astore        4
        97: aload_0
        98: aload_2
        99: aload         4
       101: invokedynamic #57,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       106: invokevirtual #51                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       109: goto          998
       112: astore        4
       114: goto          998
       117: aload_1
       118: ldc           #61                 // String admin_add_skill
       120: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       123: ifeq          155
       126: aload_1
       127: bipush        15
       129: invokevirtual #31                 // Method java/lang/String.substring:(I)Ljava/lang/String;
       132: astore        4
       134: aload_0
       135: aload_2
       136: aload         4
       138: invokevirtual #63                 // Method adminAddSkill:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       141: goto          998
       144: astore        4
       146: aload_2
       147: ldc           #66                 // String Usage: //add_skill <skill_id> <level>
       149: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       152: goto          998
       155: aload_1
       156: ldc           #74                 // String admin_remove_skill
       158: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       161: ifeq          200
       164: aload_1
       165: bipush        19
       167: invokevirtual #31                 // Method java/lang/String.substring:(I)Ljava/lang/String;
       170: astore        4
       172: aload         4
       174: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       177: istore        5
       179: aload_0
       180: aload_2
       181: iload         5
       183: invokevirtual #76                 // Method adminRemoveSkill:(Lext/mods/gameserver/model/actor/Player;I)V
       186: goto          998
       189: astore        4
       191: aload_2
       192: ldc           #79                 // String Usage: //remove_skill <skill_id>
       194: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       197: goto          998
       200: aload_1
       201: ldc           #81                 // String admin_give_all_skills
       203: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       206: ifeq          217
       209: aload_0
       210: aload_2
       211: invokevirtual #83                 // Method adminGiveAllSkills:(Lext/mods/gameserver/model/actor/Player;)V
       214: goto          998
       217: aload_1
       218: ldc           #86                 // String admin_remove_all_skills
       220: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       223: ifeq          326
       226: aload_3
       227: ifnull        998
       230: aload_3
       231: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getSkills:()Ljava/util/Map;
       234: invokeinterface #92,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       239: invokeinterface #98,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       244: astore        4
       246: aload         4
       248: invokeinterface #104,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       253: ifeq          282
       256: aload         4
       258: invokeinterface #110,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       263: checkcast     #114                // class ext/mods/gameserver/skills/L2Skill
       266: astore        5
       268: aload_3
       269: aload         5
       271: invokevirtual #116                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       274: iconst_1
       275: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       278: pop
       279: goto          246
       282: aload_2
       283: aload_3
       284: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       287: invokedynamic #128,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       292: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       295: aload_3
       296: aload_2
       297: if_acmpeq     306
       300: aload_3
       301: ldc           #129                // String Admin removed all skills from you.
       303: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       306: aload_3
       307: new           #131                // class ext/mods/gameserver/network/serverpackets/SkillList
       310: dup
       311: aload_2
       312: invokespecial #133                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       315: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       318: aload_0
       319: aload_2
       320: invokevirtual #21                 // Method showMainPage:(Lext/mods/gameserver/model/actor/Player;)V
       323: goto          998
       326: aload_1
       327: ldc           #139                // String admin_learn_skill
       329: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       332: ifeq          406
       335: aload_1
       336: ldc           #141                // String
       338: invokevirtual #143                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       341: astore        4
       343: aload         4
       345: iconst_1
       346: aaload
       347: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       350: istore        5
       352: aload         4
       354: iconst_2
       355: aaload
       356: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       359: istore        6
       361: aload         4
       363: iconst_3
       364: aaload
       365: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       368: istore        7
       370: aload         4
       372: iconst_4
       373: aaload
       374: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       377: istore        8
       379: aload_0
       380: aload_2
       381: iload         5
       383: iload         6
       385: iload         7
       387: iload         8
       389: invokevirtual #147                // Method adminLearnSkill:(Lext/mods/gameserver/model/actor/Player;IIII)V
       392: goto          998
       395: astore        4
       397: aload_2
       398: ldc           #151                // String Usage: //learn_skill <skill_id> <skill_level> <class_name> <page>
       400: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       403: goto          998
       406: aload_1
       407: ldc           #153                // String admin_show_skills_by_class
       409: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       412: ifeq          500
       415: new           #155                // class java/util/StringTokenizer
       418: dup
       419: aload_1
       420: ldc           #141                // String
       422: invokespecial #157                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       425: astore        4
       427: aload         4
       429: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       432: pop
       433: aload         4
       435: invokevirtual #163                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       438: ifeq          452
       441: aload         4
       443: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       446: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       449: goto          453
       452: iconst_1
       453: istore        5
       455: aload         4
       457: invokevirtual #163                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       460: ifeq          474
       463: aload         4
       465: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       468: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       471: goto          475
       474: iconst_1
       475: istore        6
       477: aload_0
       478: aload_2
       479: iload         5
       481: iload         6
       483: invokevirtual #166                // Method showSkillsByClass:(Lext/mods/gameserver/model/actor/Player;II)V
       486: goto          998
       489: astore        4
       491: aload_2
       492: ldc           #170                // String Usage: //show_skills_by_class <class_name> [<page_number>]
       494: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       497: goto          998
       500: aload_1
       501: ldc           #172                // String admin_clan_skill
       503: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       506: ifeq          998
       509: new           #155                // class java/util/StringTokenizer
       512: dup
       513: aload_1
       514: invokespecial #174                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
       517: astore        4
       519: aload         4
       521: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       524: pop
       525: iconst_1
       526: istore        5
       528: aload_3
       529: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       532: ifne          555
       535: aload_2
       536: getstatic     #179                // Field ext/mods/gameserver/network/SystemMessageId.S1_IS_NOT_A_CLAN_LEADER:Lext/mods/gameserver/network/SystemMessageId;
       539: invokestatic  #185                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       542: aload_3
       543: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       546: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       549: aload_0
       550: aload_2
       551: invokevirtual #21                 // Method showMainPage:(Lext/mods/gameserver/model/actor/Player;)V
       554: return
       555: aload_3
       556: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       559: astore        6
       561: aload         4
       563: invokevirtual #163                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       566: ifne          578
       569: aload_2
       570: aload         6
       572: iload         5
       574: invokestatic  #199                // Method showClanSkillList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/pledge/Clan;I)V
       577: return
       578: aload         4
       580: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       583: astore        7
       585: aload         7
       587: invokestatic  #203                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       590: ifeq          603
       593: aload         7
       595: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       598: istore        5
       600: goto          990
       603: aload         7
       605: astore        8
       607: iconst_m1
       608: istore        9
       610: aload         8
       612: invokevirtual #208                // Method java/lang/String.hashCode:()I
       615: lookupswitch  { // 2

              -934610812: 656

                  113762: 640
                 default: 669
            }
       640: aload         8
       642: ldc           #211                // String set
       644: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       647: ifeq          669
       650: iconst_0
       651: istore        9
       653: goto          669
       656: aload         8
       658: ldc           #213                // String remove
       660: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       663: ifeq          669
       666: iconst_1
       667: istore        9
       669: iload         9
       671: lookupswitch  { // 2

                       0: 696

                       1: 874
                 default: 960
            }
       696: aload         4
       698: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       701: astore        10
       703: aload         10
       705: ldc           #215                // String all
       707: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       710: ifeq          738
       713: aload         6
       715: invokevirtual #217                // Method ext/mods/gameserver/model/pledge/Clan.addAllClanSkills:()Z
       718: ifeq          860
       721: aload_2
       722: aload         6
       724: invokevirtual #222                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       727: invokedynamic #223,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       732: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       735: goto          860
       738: aload         10
       740: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       743: istore        11
       745: aload         4
       747: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       750: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       753: istore        12
       755: iload         11
       757: sipush        370
       760: if_icmplt     783
       763: iload         11
       765: sipush        391
       768: if_icmpgt     783
       771: iload         12
       773: iconst_1
       774: if_icmplt     783
       777: iload         12
       779: iconst_3
       780: if_icmple     798
       783: aload_2
       784: ldc           #224                // String Usage: //clan_skill set id level [page]
       786: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       789: aload_2
       790: aload         6
       792: iload         5
       794: invokestatic  #199                // Method showClanSkillList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/pledge/Clan;I)V
       797: return
       798: invokestatic  #226                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       801: iload         11
       803: iload         12
       805: invokevirtual #232                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       808: astore        13
       810: aload         13
       812: ifnonnull     830
       815: aload_2
       816: ldc           #224                // String Usage: //clan_skill set id level [page]
       818: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       821: aload_2
       822: aload         6
       824: iload         5
       826: invokestatic  #199                // Method showClanSkillList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/pledge/Clan;I)V
       829: return
       830: aload         6
       832: aload         13
       834: iconst_0
       835: invokevirtual #236                // Method ext/mods/gameserver/model/pledge/Clan.addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       838: ifeq          860
       841: aload_2
       842: aload         13
       844: invokevirtual #240                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
       847: aload         6
       849: invokevirtual #222                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       852: invokedynamic #241,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       857: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       860: goto          960
       863: astore        10
       865: aload_2
       866: ldc           #224                // String Usage: //clan_skill set id level [page]
       868: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       871: goto          960
       874: aload         4
       876: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       879: astore        10
       881: aload         10
       883: ldc           #215                // String all
       885: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       888: ifeq          916
       891: aload         6
       893: invokevirtual #244                // Method ext/mods/gameserver/model/pledge/Clan.removeAllClanSkills:()Z
       896: ifeq          949
       899: aload_2
       900: aload         6
       902: invokevirtual #222                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       905: invokedynamic #247,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       910: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       913: goto          949
       916: aload         10
       918: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       921: istore        11
       923: aload         6
       925: iload         11
       927: invokevirtual #248                // Method ext/mods/gameserver/model/pledge/Clan.removeClanSkill:(I)Z
       930: ifeq          949
       933: aload_2
       934: iload         11
       936: aload         6
       938: invokevirtual #222                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       941: invokedynamic #252,  0            // InvokeDynamic #5:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
       946: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       949: goto          960
       952: astore        10
       954: aload_2
       955: ldc           #255                // String Usage: //clan_skill remove id|all [page]
       957: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       960: aload         4
       962: invokevirtual #163                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       965: ifeq          990
       968: aload         4
       970: invokevirtual #160                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       973: astore        8
       975: aload         8
       977: invokestatic  #203                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       980: ifeq          990
       983: aload         8
       985: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       988: istore        5
       990: aload_2
       991: aload         6
       993: iload         5
       995: invokestatic  #199                // Method showClanSkillList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/pledge/Clan;I)V
       998: return
      Exception table:
         from    to  target type
            33    47    50   Class java/lang/Exception
            89   109   112   Class java/lang/Exception
           126   141   144   Class java/lang/Exception
           164   186   189   Class java/lang/Exception
           335   392   395   Class java/lang/Exception
           415   486   489   Class java/lang/Exception
           696   797   863   Class java/lang/Exception
           798   829   863   Class java/lang/Exception
           830   860   863   Class java/lang/Exception
           874   949   952   Class java/lang/Exception
      LineNumberTable:
        line 58: 0
        line 60: 7
        line 61: 16
        line 62: 24
        line 66: 33
        line 71: 47
        line 68: 50
        line 70: 52
        line 71: 58
        line 73: 61
        line 74: 70
        line 75: 80
        line 79: 89
        line 80: 97
        line 84: 109
        line 82: 112
        line 84: 114
        line 86: 117
        line 90: 126
        line 91: 134
        line 96: 141
        line 93: 144
        line 95: 146
        line 96: 152
        line 98: 155
        line 102: 164
        line 103: 172
        line 104: 179
        line 109: 186
        line 106: 189
        line 108: 191
        line 109: 197
        line 111: 200
        line 112: 209
        line 113: 217
        line 115: 226
        line 117: 230
        line 118: 268
        line 120: 282
        line 121: 295
        line 122: 300
        line 124: 306
        line 125: 318
        line 128: 326
        line 132: 335
        line 133: 343
        line 134: 352
        line 135: 361
        line 136: 370
        line 138: 379
        line 143: 392
        line 140: 395
        line 142: 397
        line 143: 403
        line 145: 406
        line 149: 415
        line 150: 427
        line 151: 433
        line 152: 455
        line 154: 477
        line 159: 486
        line 156: 489
        line 158: 491
        line 159: 497
        line 161: 500
        line 163: 509
        line 164: 519
        line 166: 525
        line 167: 528
        line 169: 535
        line 170: 549
        line 171: 554
        line 174: 555
        line 176: 561
        line 178: 569
        line 179: 577
        line 182: 578
        line 183: 585
        line 184: 593
        line 187: 603
        line 192: 696
        line 193: 703
        line 195: 713
        line 196: 721
        line 200: 738
        line 201: 745
        line 203: 755
        line 205: 783
        line 206: 789
        line 207: 797
        line 210: 798
        line 211: 810
        line 213: 815
        line 214: 821
        line 215: 829
        line 218: 830
        line 219: 841
        line 226: 860
        line 222: 863
        line 224: 865
        line 227: 871
        line 232: 874
        line 233: 881
        line 235: 891
        line 236: 899
        line 240: 916
        line 242: 923
        line 243: 933
        line 249: 949
        line 246: 952
        line 248: 954
        line 253: 960
        line 255: 968
        line 256: 975
        line 257: 983
        line 261: 990
        line 264: 998
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52       6     4     e   Ljava/lang/Exception;
           97      12     4   val   Ljava/lang/String;
          134       7     4   val   Ljava/lang/String;
          146       6     4     e   Ljava/lang/Exception;
          172      14     4    id   Ljava/lang/String;
          179       7     5 idval   I
          191       6     4     e   Ljava/lang/Exception;
          268      11     5 skill   Lext/mods/gameserver/skills/L2Skill;
          343      49     4 parts   [Ljava/lang/String;
          352      40     5 skillId   I
          361      31     6 skillLevel   I
          370      22     7 classId   I
          379      13     8  page   I
          397       6     4     e   Ljava/lang/Exception;
          427      59     4    st   Ljava/util/StringTokenizer;
          455      31     5 classId   I
          477       9     6  page   I
          491       6     4     e   Ljava/lang/Exception;
          745     115    11    id   I
          755     105    12 level   I
          810      50    13 skill   Lext/mods/gameserver/skills/L2Skill;
          703     157    10 param2   Ljava/lang/String;
          865       6    10     e   Ljava/lang/Exception;
          923      26    11 skillId   I
          881      68    10 param2   Ljava/lang/String;
          954       6    10     e   Ljava/lang/Exception;
          975      15     8 param3   Ljava/lang/String;
          519     479     4    st   Ljava/util/StringTokenizer;
          528     470     5  page   I
          561     437     6  clan   Lext/mods/gameserver/model/pledge/Clan;
          585     413     7 param   Ljava/lang/String;
            0     999     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSkill;
            0     999     1 command   Ljava/lang/String;
            0     999     2 player   Lext/mods/gameserver/model/actor/Player;
            7     992     3 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 43
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 89 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 18 /* same */
        frame_type = 95 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 97 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 35
        frame_type = 23 /* same */
        frame_type = 19 /* same */
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 68
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class java/util/StringTokenizer ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSkill, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ class java/util/StringTokenizer, int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ int, int ]
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSkill, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, class ext/mods/gameserver/model/pledge/Clan, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 249 /* chop */
          offset_delta = 7
        frame_type = 29 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSkill, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
          stack = []

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #517                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 517: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSkill;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        11
         2: anewarray     #16                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #13                 // String admin_show_skills
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #25                 // String admin_remove_skills
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #47                 // String admin_skill_list
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #55                 // String admin_skill_index
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #61                 // String admin_add_skill
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #74                 // String admin_remove_skill
        34: aastore
        35: dup
        36: bipush        6
        38: ldc           #81                 // String admin_give_all_skills
        40: aastore
        41: dup
        42: bipush        7
        44: ldc           #86                 // String admin_remove_all_skills
        46: aastore
        47: dup
        48: bipush        8
        50: ldc           #153                // String admin_show_skills_by_class
        52: aastore
        53: dup
        54: bipush        9
        56: ldc           #139                // String admin_learn_skill
        58: aastore
        59: dup
        60: bipush        10
        62: ldc           #172                // String admin_clan_skill
        64: aastore
        65: putstatic     #517                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        68: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "AdminSkill.java"
BootstrapMethods:
  0: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #580 skills/\u0001.htm
  1: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #582 You removed all skills from \u0001.
  2: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #584 You gave all available skills to \u0001 clan.
  3: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #586 You gave \u0001 skill to \u0001 clan.
  4: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #588 You removed all skills from \u0001 clan.
  5: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #590 You removed \u0001 skillId from \u0001 clan.
  6: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #592 You gave all available skills to \u0001.
  7: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #594 Admin gave you the skill \u0001.
  8: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #596 You gave the skill \u0001 to \u0001.
  9: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #598 You removed the skill \u0001 from \u0001.
  10: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 Admin removed the skill \u0001 from your skills list.
  11: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #602 No skills found for class: \u0001
  12: #620 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #604 (Ljava/lang/Object;)Z
      #605 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminSkill.lambda$showSkillsByClass$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
      #608 (Lext/mods/gameserver/skills/L2Skill;)Z
  13: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #610 bypass -h admin_show_skills_by_class \u0001 %page%
  14: #614 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #612 Admin gave you the skill \u0001 \u0001 lvl.
InnerClasses:
  public static final #632= #628 of #630; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
