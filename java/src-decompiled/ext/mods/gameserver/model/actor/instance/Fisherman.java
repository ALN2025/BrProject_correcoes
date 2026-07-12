// Bytecode for: ext.mods.gameserver.model.actor.instance.Fisherman
// File: ext\mods\gameserver\model\actor\instance\Fisherman.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Fisherman.class
  Last modified 9 de jul de 2026; size 5267 bytes
  MD5 checksum 4eda89e45fe59a1d8b212d5b6da05358
  Compiled from "Fisherman.java"
public class ext.mods.gameserver.model.actor.instance.Fisherman extends ext.mods.gameserver.model.actor.instance.Merchant
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #34                         // ext/mods/gameserver/model/actor/instance/Fisherman
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Merchant
  interfaces: 0, fields: 0, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Merchant
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Merchant
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            //
    #8 = Utf8
    #9 = InvokeDynamic      #0:#10        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #10 = NameAndType        #11:#12       // makeConcatWithConstants:(I)Ljava/lang/String;
   #11 = Utf8               makeConcatWithConstants
   #12 = Utf8               (I)Ljava/lang/String;
   #13 = InvokeDynamic      #1:#14        // #1:makeConcatWithConstants:(II)Ljava/lang/String;
   #14 = NameAndType        #11:#15       // makeConcatWithConstants:(II)Ljava/lang/String;
   #15 = Utf8               (II)Ljava/lang/String;
   #16 = InvokeDynamic      #2:#17        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #17 = NameAndType        #11:#18       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #18 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #19 = Fieldref           #20.#21       // ext/mods/Config.KARMA_PLAYER_CAN_SHOP:Z
   #20 = Class              #22           // ext/mods/Config
   #21 = NameAndType        #23:#24       // KARMA_PLAYER_CAN_SHOP:Z
   #22 = Utf8               ext/mods/Config
   #23 = Utf8               KARMA_PLAYER_CAN_SHOP
   #24 = Utf8               Z
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/actor/Player.getKarma:()I
   #26 = Class              #28           // ext/mods/gameserver/model/actor/Player
   #27 = NameAndType        #29:#30       // getKarma:()I
   #28 = Utf8               ext/mods/gameserver/model/actor/Player
   #29 = Utf8               getKarma
   #30 = Utf8               ()I
   #31 = String             #32           // fisherman
   #32 = Utf8               fisherman
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/instance/Fisherman.showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #34 = Class              #36           // ext/mods/gameserver/model/actor/instance/Fisherman
   #35 = NameAndType        #37:#38       // showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #36 = Utf8               ext/mods/gameserver/model/actor/instance/Fisherman
   #37 = Utf8               showPkDenyChatWindow
   #38 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #39 = String             #40           // FishSkillList
   #40 = Utf8               FishSkillList
   #41 = Methodref          #42.#43       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #42 = Class              #44           // java/lang/String
   #43 = NameAndType        #45:#46       // startsWith:(Ljava/lang/String;)Z
   #44 = Utf8               java/lang/String
   #45 = Utf8               startsWith
   #46 = Utf8               (Ljava/lang/String;)Z
   #47 = Methodref          #34.#48       // ext/mods/gameserver/model/actor/instance/Fisherman.showFishSkillList:(Lext/mods/gameserver/model/actor/Player;)V
   #48 = NameAndType        #49:#50       // showFishSkillList:(Lext/mods/gameserver/model/actor/Player;)V
   #49 = Utf8               showFishSkillList
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #51 = String             #52           // FishingChampionship
   #52 = Utf8               FishingChampionship
   #53 = Fieldref           #20.#54       // ext/mods/Config.ALLOW_FISH_CHAMPIONSHIP:Z
   #54 = NameAndType        #55:#24       // ALLOW_FISH_CHAMPIONSHIP:Z
   #55 = Utf8               ALLOW_FISH_CHAMPIONSHIP
   #56 = Class              #57           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #57 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #58 = Methodref          #34.#59       // ext/mods/gameserver/model/actor/instance/Fisherman.getObjectId:()I
   #59 = NameAndType        #60:#30       // getObjectId:()I
   #60 = Utf8               getObjectId
   #61 = Methodref          #56.#62       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #62 = NameAndType        #5:#63        // "<init>":(I)V
   #63 = Utf8               (I)V
   #64 = Methodref          #26.#65       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #65 = NameAndType        #66:#67       // getLocale:()Ljava/util/Locale;
   #66 = Utf8               getLocale
   #67 = Utf8               ()Ljava/util/Locale;
   #68 = String             #69           // html/fisherman/championship/no_fish_event001.htm
   #69 = Utf8               html/fisherman/championship/no_fish_event001.htm
   #70 = Methodref          #56.#71       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #71 = NameAndType        #72:#73       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #72 = Utf8               setFile
   #73 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #74 = Methodref          #26.#75       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #75 = NameAndType        #76:#77       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #76 = Utf8               sendPacket
   #77 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #78 = Methodref          #79.#80       // ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
   #79 = Class              #81           // ext/mods/gameserver/data/manager/FishingChampionshipManager
   #80 = NameAndType        #82:#83       // getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
   #81 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager
   #82 = Utf8               getInstance
   #83 = Utf8               ()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
   #84 = Methodref          #79.#85       // ext/mods/gameserver/data/manager/FishingChampionshipManager.showChampScreen:(Lext/mods/gameserver/model/actor/Player;I)V
   #85 = NameAndType        #86:#87       // showChampScreen:(Lext/mods/gameserver/model/actor/Player;I)V
   #86 = Utf8               showChampScreen
   #87 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #88 = String             #89           // FishingReward
   #89 = Utf8               FishingReward
   #90 = Methodref          #26.#91       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #91 = NameAndType        #92:#93       // getName:()Ljava/lang/String;
   #92 = Utf8               getName
   #93 = Utf8               ()Ljava/lang/String;
   #94 = Methodref          #79.#95       // ext/mods/gameserver/data/manager/FishingChampionshipManager.isWinner:(Ljava/lang/String;)Z
   #95 = NameAndType        #96:#46       // isWinner:(Ljava/lang/String;)Z
   #96 = Utf8               isWinner
   #97 = String             #98           // html/fisherman/championship/no_fish_event_reward001.htm
   #98 = Utf8               html/fisherman/championship/no_fish_event_reward001.htm
   #99 = Methodref          #79.#100      // ext/mods/gameserver/data/manager/FishingChampionshipManager.getReward:(Lext/mods/gameserver/model/actor/Player;)V
  #100 = NameAndType        #101:#50      // getReward:(Lext/mods/gameserver/model/actor/Player;)V
  #101 = Utf8               getReward
  #102 = Methodref          #2.#103       // ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #103 = NameAndType        #104:#105     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #104 = Utf8               onBypassFeedback
  #105 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #106 = Methodref          #34.#107      // ext/mods/gameserver/model/actor/instance/Fisherman.getNpcId:()I
  #107 = NameAndType        #108:#30      // getNpcId:()I
  #108 = Utf8               getNpcId
  #109 = Methodref          #34.#110      // ext/mods/gameserver/model/actor/instance/Fisherman.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #110 = NameAndType        #111:#112     // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #111 = Utf8               getHtmlPath
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #113 = Methodref          #34.#114      // ext/mods/gameserver/model/actor/instance/Fisherman.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #114 = NameAndType        #115:#105     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #115 = Utf8               showChatWindow
  #116 = Methodref          #117.#118     // ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #117 = Class              #119          // ext/mods/gameserver/data/xml/SkillTreeData
  #118 = NameAndType        #82:#120      // getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #119 = Utf8               ext/mods/gameserver/data/xml/SkillTreeData
  #120 = Utf8               ()Lext/mods/gameserver/data/xml/SkillTreeData;
  #121 = Methodref          #117.#122     // ext/mods/gameserver/data/xml/SkillTreeData.getFishingSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #122 = NameAndType        #123:#124     // getFishingSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #123 = Utf8               getFishingSkillsFor
  #124 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #125 = InterfaceMethodref #126.#127     // java/util/List.isEmpty:()Z
  #126 = Class              #128          // java/util/List
  #127 = NameAndType        #129:#130     // isEmpty:()Z
  #128 = Utf8               java/util/List
  #129 = Utf8               isEmpty
  #130 = Utf8               ()Z
  #131 = Methodref          #117.#132     // ext/mods/gameserver/data/xml/SkillTreeData.getRequiredLevelForNextFishingSkill:(Lext/mods/gameserver/model/actor/Player;)I
  #132 = NameAndType        #133:#134     // getRequiredLevelForNextFishingSkill:(Lext/mods/gameserver/model/actor/Player;)I
  #133 = Utf8               getRequiredLevelForNextFishingSkill
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #135 = Fieldref           #136.#137     // ext/mods/gameserver/network/SystemMessageId.DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
  #136 = Class              #138          // ext/mods/gameserver/network/SystemMessageId
  #137 = NameAndType        #139:#140     // DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
  #138 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #139 = Utf8               DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1
  #140 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #141 = Methodref          #142.#143     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #142 = Class              #144          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #143 = NameAndType        #145:#146     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #144 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #145 = Utf8               getSystemMessage
  #146 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #147 = Methodref          #142.#148     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #148 = NameAndType        #149:#150     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #149 = Utf8               addNumber
  #150 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #151 = Fieldref           #136.#152     // ext/mods/gameserver/network/SystemMessageId.NO_MORE_SKILLS_TO_LEARN:Lext/mods/gameserver/network/SystemMessageId;
  #152 = NameAndType        #153:#140     // NO_MORE_SKILLS_TO_LEARN:Lext/mods/gameserver/network/SystemMessageId;
  #153 = Utf8               NO_MORE_SKILLS_TO_LEARN
  #154 = Methodref          #26.#155      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #155 = NameAndType        #76:#156      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #156 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #157 = Fieldref           #158.#159     // ext/mods/gameserver/network/serverpackets/AcquireSkillDone.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
  #158 = Class              #160          // ext/mods/gameserver/network/serverpackets/AcquireSkillDone
  #159 = NameAndType        #161:#162     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
  #160 = Utf8               ext/mods/gameserver/network/serverpackets/AcquireSkillDone
  #161 = Utf8               STATIC_PACKET
  #162 = Utf8               Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
  #163 = Class              #164          // ext/mods/gameserver/network/serverpackets/AcquireSkillList
  #164 = Utf8               ext/mods/gameserver/network/serverpackets/AcquireSkillList
  #165 = Fieldref           #166.#167     // ext/mods/gameserver/enums/skills/AcquireSkillType.FISHING:Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #166 = Class              #168          // ext/mods/gameserver/enums/skills/AcquireSkillType
  #167 = NameAndType        #169:#170     // FISHING:Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #168 = Utf8               ext/mods/gameserver/enums/skills/AcquireSkillType
  #169 = Utf8               FISHING
  #170 = Utf8               Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #171 = Methodref          #163.#172     // ext/mods/gameserver/network/serverpackets/AcquireSkillList."<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #172 = NameAndType        #5:#173       // "<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #173 = Utf8               (Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #174 = Fieldref           #175.#176     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #175 = Class              #177          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #176 = NameAndType        #161:#178     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #177 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #178 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #179 = Utf8               Code
  #180 = Utf8               LineNumberTable
  #181 = Utf8               LocalVariableTable
  #182 = Utf8               this
  #183 = Utf8               Lext/mods/gameserver/model/actor/instance/Fisherman;
  #184 = Utf8               objectId
  #185 = Utf8               I
  #186 = Utf8               template
  #187 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #188 = Utf8               player
  #189 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #190 = Utf8               npcId
  #191 = Utf8               val
  #192 = Utf8               filename
  #193 = Utf8               Ljava/lang/String;
  #194 = Utf8               StackMapTable
  #195 = Utf8               html
  #196 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #197 = Utf8               command
  #198 = Utf8               minlevel
  #199 = Utf8               skills
  #200 = Utf8               Ljava/util/List;
  #201 = Utf8               LocalVariableTypeTable
  #202 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;>;
  #203 = Utf8               SourceFile
  #204 = Utf8               Fisherman.java
  #205 = Utf8               BootstrapMethods
  #206 = String             #207          // \u0001
  #207 = Utf8               \u0001
  #208 = String             #209          // \u0001-\u0001
  #209 = Utf8               \u0001-\u0001
  #210 = String             #211          // html/fisherman/\u0001.htm
  #211 = Utf8               html/fisherman/\u0001.htm
  #212 = MethodHandle       6:#213        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #213 = Methodref          #214.#215     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #214 = Class              #216          // java/lang/invoke/StringConcatFactory
  #215 = NameAndType        #11:#217      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #216 = Utf8               java/lang/invoke/StringConcatFactory
  #217 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #218 = Utf8               InnerClasses
  #219 = Class              #220          // java/lang/invoke/MethodHandles$Lookup
  #220 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #221 = Class              #222          // java/lang/invoke/MethodHandles
  #222 = Utf8               java/lang/invoke/MethodHandles
  #223 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Fisherman(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 43: 0
        line 44: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Fisherman;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #7                  // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #9,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #13,  0             // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #16,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 49: 0
        line 51: 4
        line 52: 8
        line 54: 19
        line 56: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/Fisherman;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: getstatic     #19                 // Field ext/mods/Config.KARMA_PLAYER_CAN_SHOP:Z
         3: ifne          24
         6: aload_1
         7: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        10: ifle          24
        13: aload_0
        14: aload_1
        15: ldc           #31                 // String fisherman
        17: invokevirtual #33                 // Method showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        20: ifeq          24
        23: return
        24: aload_2
        25: ldc           #39                 // String FishSkillList
        27: invokevirtual #41                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        30: ifeq          40
        33: aload_1
        34: invokestatic  #47                 // Method showFishSkillList:(Lext/mods/gameserver/model/actor/Player;)V
        37: goto          197
        40: aload_2
        41: ldc           #51                 // String FishingChampionship
        43: invokevirtual #41                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        46: ifeq          97
        49: getstatic     #53                 // Field ext/mods/Config.ALLOW_FISH_CHAMPIONSHIP:Z
        52: ifne          83
        55: new           #56                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        58: dup
        59: aload_0
        60: invokevirtual #58                 // Method getObjectId:()I
        63: invokespecial #61                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        66: astore_3
        67: aload_3
        68: aload_1
        69: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        72: ldc           #68                 // String html/fisherman/championship/no_fish_event001.htm
        74: invokevirtual #70                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        77: aload_1
        78: aload_3
        79: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        82: return
        83: invokestatic  #78                 // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
        86: aload_1
        87: aload_0
        88: invokevirtual #58                 // Method getObjectId:()I
        91: invokevirtual #84                 // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.showChampScreen:(Lext/mods/gameserver/model/actor/Player;I)V
        94: goto          197
        97: aload_2
        98: ldc           #88                 // String FishingReward
       100: invokevirtual #41                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       103: ifeq          191
       106: getstatic     #53                 // Field ext/mods/Config.ALLOW_FISH_CHAMPIONSHIP:Z
       109: ifne          140
       112: new           #56                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       115: dup
       116: aload_0
       117: invokevirtual #58                 // Method getObjectId:()I
       120: invokespecial #61                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       123: astore_3
       124: aload_3
       125: aload_1
       126: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       129: ldc           #68                 // String html/fisherman/championship/no_fish_event001.htm
       131: invokevirtual #70                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       134: aload_1
       135: aload_3
       136: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       139: return
       140: invokestatic  #78                 // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
       143: aload_1
       144: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       147: invokevirtual #94                 // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.isWinner:(Ljava/lang/String;)Z
       150: ifne          181
       153: new           #56                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       156: dup
       157: aload_0
       158: invokevirtual #58                 // Method getObjectId:()I
       161: invokespecial #61                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       164: astore_3
       165: aload_3
       166: aload_1
       167: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       170: ldc           #97                 // String html/fisherman/championship/no_fish_event_reward001.htm
       172: invokevirtual #70                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       175: aload_1
       176: aload_3
       177: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       180: return
       181: invokestatic  #78                 // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
       184: aload_1
       185: invokevirtual #99                 // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.getReward:(Lext/mods/gameserver/model/actor/Player;)V
       188: goto          197
       191: aload_0
       192: aload_1
       193: aload_2
       194: invokespecial #102                // Method ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       197: return
      LineNumberTable:
        line 62: 0
        line 63: 23
        line 65: 24
        line 66: 33
        line 67: 40
        line 69: 49
        line 71: 55
        line 72: 67
        line 73: 77
        line 74: 82
        line 76: 83
        line 78: 97
        line 80: 106
        line 82: 112
        line 83: 124
        line 84: 134
        line 85: 139
        line 88: 140
        line 90: 153
        line 91: 165
        line 92: 175
        line 93: 180
        line 95: 181
        line 98: 191
        line 99: 197
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67      16     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          124      16     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          165      16     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     198     0  this   Lext/mods/gameserver/model/actor/instance/Fisherman;
            0     198     1 player   Lext/mods/gameserver/model/actor/Player;
            0     198     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 8
        frame_type = 24 /* same */
        frame_type = 15 /* same */
        frame_type = 42 /* same */
        frame_type = 13 /* same */
        frame_type = 42 /* same */
        frame_type = 40 /* same */
        frame_type = 9 /* same */
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: getstatic     #19                 // Field ext/mods/Config.KARMA_PLAYER_CAN_SHOP:Z
         3: ifne          24
         6: aload_1
         7: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        10: ifle          24
        13: aload_0
        14: aload_1
        15: ldc           #31                 // String fisherman
        17: invokevirtual #33                 // Method showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        20: ifeq          24
        23: return
        24: aload_0
        25: aload_1
        26: aload_0
        27: aload_1
        28: aload_0
        29: invokevirtual #106                // Method getNpcId:()I
        32: iload_2
        33: invokevirtual #109                // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        36: invokevirtual #113                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        39: return
      LineNumberTable:
        line 104: 0
        line 105: 23
        line 107: 24
        line 108: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/actor/instance/Fisherman;
            0      40     1 player   Lext/mods/gameserver/model/actor/Player;
            0      40     2   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public static void showFishSkillList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=3, args_size=1
         0: invokestatic  #116                // Method ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
         3: aload_0
         4: invokevirtual #121                // Method ext/mods/gameserver/data/xml/SkillTreeData.getFishingSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
         7: astore_1
         8: aload_1
         9: invokeinterface #125,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        14: ifeq          63
        17: invokestatic  #116                // Method ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
        20: aload_0
        21: invokevirtual #131                // Method ext/mods/gameserver/data/xml/SkillTreeData.getRequiredLevelForNextFishingSkill:(Lext/mods/gameserver/model/actor/Player;)I
        24: istore_2
        25: iload_2
        26: ifle          46
        29: aload_0
        30: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
        33: invokestatic  #141                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        36: iload_2
        37: invokevirtual #147                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        40: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: goto          53
        46: aload_0
        47: getstatic     #151                // Field ext/mods/gameserver/network/SystemMessageId.NO_MORE_SKILLS_TO_LEARN:Lext/mods/gameserver/network/SystemMessageId;
        50: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        53: aload_0
        54: getstatic     #157                // Field ext/mods/gameserver/network/serverpackets/AcquireSkillDone.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
        57: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        60: goto          78
        63: aload_0
        64: new           #163                // class ext/mods/gameserver/network/serverpackets/AcquireSkillList
        67: dup
        68: getstatic     #165                // Field ext/mods/gameserver/enums/skills/AcquireSkillType.FISHING:Lext/mods/gameserver/enums/skills/AcquireSkillType;
        71: aload_1
        72: invokespecial #171                // Method ext/mods/gameserver/network/serverpackets/AcquireSkillList."<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
        75: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        78: aload_0
        79: getstatic     #174                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        82: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        85: return
      LineNumberTable:
        line 112: 0
        line 113: 8
        line 115: 17
        line 116: 25
        line 117: 29
        line 119: 46
        line 121: 53
        line 122: 60
        line 124: 63
        line 126: 78
        line 127: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      35     2 minlevel   I
            0      86     0 player   Lext/mods/gameserver/model/actor/Player;
            8      78     1 skills   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      78     1 skills   Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 46
          locals = [ class java/util/List, int ]
        frame_type = 6 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 14 /* same */
}
SourceFile: "Fisherman.java"
BootstrapMethods:
  0: #212 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #206 \u0001
  1: #212 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #208 \u0001-\u0001
  2: #212 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #210 html/fisherman/\u0001.htm
InnerClasses:
  public static final #223= #219 of #221; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
