// Bytecode for: ext.mods.gameserver.model.actor.instance.Folk
// File: ext\mods\gameserver\model\actor\instance\Folk.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Folk.class
  Last modified 9 de jul de 2026; size 5526 bytes
  MD5 checksum 5dc559adafef3155284d462dc1b82b5e
  Compiled from "Folk.java"
public class ext.mods.gameserver.model.actor.instance.Folk extends ext.mods.gameserver.model.actor.Npc
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/model/actor/instance/Folk
  super_class: #2                         // ext/mods/gameserver/model/actor/Npc
  interfaces: 0, fields: 0, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Npc
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Npc
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Class              #8            // ext/mods/gameserver/skills/effects/EffectDebuff
    #8 = Utf8               ext/mods/gameserver/skills/effects/EffectDebuff
    #9 = Class              #10           // ext/mods/gameserver/skills/effects/EffectBuff
   #10 = Utf8               ext/mods/gameserver/skills/effects/EffectBuff
   #11 = Methodref          #2.#12        // ext/mods/gameserver/model/actor/Npc.addEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
   #12 = NameAndType        #13:#14       // addEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
   #13 = Utf8               addEffect
   #14 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)V
   #15 = Methodref          #16.#17       // ext/mods/gameserver/skills/AbstractEffect.stopEffectTask:()V
   #16 = Class              #18           // ext/mods/gameserver/skills/AbstractEffect
   #17 = NameAndType        #19:#20       // stopEffectTask:()V
   #18 = Utf8               ext/mods/gameserver/skills/AbstractEffect
   #19 = Utf8               stopEffectTask
   #20 = Utf8               ()V
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/instance/Folk.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #22 = Class              #24           // ext/mods/gameserver/model/actor/instance/Folk
   #23 = NameAndType        #25:#26       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #24 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #25 = Utf8               getTemplate
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getClassId
   #32 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/template/NpcTemplate.canTeach:(Lext/mods/gameserver/enums/actors/ClassId;)Z
   #34 = Class              #36           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #35 = NameAndType        #37:#38       // canTeach:(Lext/mods/gameserver/enums/actors/ClassId;)Z
   #36 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #37 = Utf8               canTeach
   #38 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
   #39 = Class              #40           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #40 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #41 = Methodref          #22.#42       // ext/mods/gameserver/model/actor/instance/Folk.getObjectId:()I
   #42 = NameAndType        #43:#44       // getObjectId:()I
   #43 = Utf8               getObjectId
   #44 = Utf8               ()I
   #45 = Methodref          #39.#46       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #46 = NameAndType        #5:#47        // "<init>":(I)V
   #47 = Utf8               (I)V
   #48 = Methodref          #28.#49       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #49 = NameAndType        #50:#51       // getLocale:()Ljava/util/Locale;
   #50 = Utf8               getLocale
   #51 = Utf8               ()Ljava/util/Locale;
   #52 = Methodref          #34.#53       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #53 = NameAndType        #54:#44       // getNpcId:()I
   #54 = Utf8               getNpcId
   #55 = InvokeDynamic      #0:#56        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #56 = NameAndType        #57:#58       // makeConcatWithConstants:(I)Ljava/lang/String;
   #57 = Utf8               makeConcatWithConstants
   #58 = Utf8               (I)Ljava/lang/String;
   #59 = Methodref          #39.#60       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #60 = NameAndType        #61:#62       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #61 = Utf8               setFile
   #62 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #63 = Methodref          #28.#64       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #64 = NameAndType        #65:#66       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #65 = Utf8               sendPacket
   #66 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #67 = Methodref          #28.#68       // ext/mods/gameserver/model/actor/Player.getAvailableSkills:()Ljava/util/List;
   #68 = NameAndType        #69:#70       // getAvailableSkills:()Ljava/util/List;
   #69 = Utf8               getAvailableSkills
   #70 = Utf8               ()Ljava/util/List;
   #71 = InterfaceMethodref #72.#73       // java/util/List.isEmpty:()Z
   #72 = Class              #74           // java/util/List
   #73 = NameAndType        #75:#76       // isEmpty:()Z
   #74 = Utf8               java/util/List
   #75 = Utf8               isEmpty
   #76 = Utf8               ()Z
   #77 = Methodref          #28.#78       // ext/mods/gameserver/model/actor/Player.getRequiredLevelForNextSkill:()I
   #78 = NameAndType        #79:#44       // getRequiredLevelForNextSkill:()I
   #79 = Utf8               getRequiredLevelForNextSkill
   #80 = Fieldref           #81.#82       // ext/mods/gameserver/network/SystemMessageId.DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Class              #83           // ext/mods/gameserver/network/SystemMessageId
   #82 = NameAndType        #84:#85       // DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
   #83 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #84 = Utf8               DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1
   #85 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #86 = Methodref          #87.#88       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #87 = Class              #89           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #88 = NameAndType        #90:#91       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #89 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #90 = Utf8               getSystemMessage
   #91 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #92 = Methodref          #87.#93       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #93 = NameAndType        #94:#95       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #94 = Utf8               addNumber
   #95 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = Fieldref           #81.#97       // ext/mods/gameserver/network/SystemMessageId.NO_MORE_SKILLS_TO_LEARN:Lext/mods/gameserver/network/SystemMessageId;
   #97 = NameAndType        #98:#85       // NO_MORE_SKILLS_TO_LEARN:Lext/mods/gameserver/network/SystemMessageId;
   #98 = Utf8               NO_MORE_SKILLS_TO_LEARN
   #99 = Methodref          #28.#100      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #100 = NameAndType        #65:#101      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #101 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #102 = Fieldref           #103.#104     // ext/mods/gameserver/network/serverpackets/AcquireSkillDone.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
  #103 = Class              #105          // ext/mods/gameserver/network/serverpackets/AcquireSkillDone
  #104 = NameAndType        #106:#107     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
  #105 = Utf8               ext/mods/gameserver/network/serverpackets/AcquireSkillDone
  #106 = Utf8               STATIC_PACKET
  #107 = Utf8               Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
  #108 = Class              #109          // ext/mods/gameserver/network/serverpackets/AcquireSkillList
  #109 = Utf8               ext/mods/gameserver/network/serverpackets/AcquireSkillList
  #110 = Fieldref           #111.#112     // ext/mods/gameserver/enums/skills/AcquireSkillType.USUAL:Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #111 = Class              #113          // ext/mods/gameserver/enums/skills/AcquireSkillType
  #112 = NameAndType        #114:#115     // USUAL:Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #113 = Utf8               ext/mods/gameserver/enums/skills/AcquireSkillType
  #114 = Utf8               USUAL
  #115 = Utf8               Lext/mods/gameserver/enums/skills/AcquireSkillType;
  #116 = Methodref          #108.#117     // ext/mods/gameserver/network/serverpackets/AcquireSkillList."<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #117 = NameAndType        #5:#118       // "<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #118 = Utf8               (Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
  #119 = Fieldref           #120.#121     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #120 = Class              #122          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #121 = NameAndType        #106:#123     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #122 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #123 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #124 = Methodref          #125.#126     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #125 = Class              #127          // ext/mods/gameserver/enums/actors/ClassId
  #126 = NameAndType        #128:#44      // getLevel:()I
  #127 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #128 = Utf8               getLevel
  #129 = String             #130          // <html><body> You must have 3rd class change quest completed.</body></html>
  #130 = Utf8               <html><body> You must have 3rd class change quest completed.</body></html>
  #131 = Methodref          #39.#132      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #132 = NameAndType        #133:#134     // setHtml:(Ljava/lang/String;)V
  #133 = Utf8               setHtml
  #134 = Utf8               (Ljava/lang/String;)V
  #135 = Methodref          #136.#137     // ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #136 = Class              #138          // ext/mods/gameserver/data/xml/SkillTreeData
  #137 = NameAndType        #139:#140     // getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #138 = Utf8               ext/mods/gameserver/data/xml/SkillTreeData
  #139 = Utf8               getInstance
  #140 = Utf8               ()Lext/mods/gameserver/data/xml/SkillTreeData;
  #141 = Methodref          #136.#142     // ext/mods/gameserver/data/xml/SkillTreeData.getEnchantSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #142 = NameAndType        #143:#144     // getEnchantSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #143 = Utf8               getEnchantSkillsFor
  #144 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #145 = Fieldref           #81.#146      // ext/mods/gameserver/network/SystemMessageId.THERE_IS_NO_SKILL_THAT_ENABLES_ENCHANT:Lext/mods/gameserver/network/SystemMessageId;
  #146 = NameAndType        #147:#85      // THERE_IS_NO_SKILL_THAT_ENABLES_ENCHANT:Lext/mods/gameserver/network/SystemMessageId;
  #147 = Utf8               THERE_IS_NO_SKILL_THAT_ENABLES_ENCHANT
  #148 = Methodref          #28.#149      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #149 = NameAndType        #150:#151     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #150 = Utf8               getStatus
  #151 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #152 = Methodref          #153.#126     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #153 = Class              #154          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #154 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #155 = Class              #156          // ext/mods/gameserver/network/serverpackets/ExEnchantSkillList
  #156 = Utf8               ext/mods/gameserver/network/serverpackets/ExEnchantSkillList
  #157 = Methodref          #155.#158     // ext/mods/gameserver/network/serverpackets/ExEnchantSkillList."<init>":(Ljava/util/List;)V
  #158 = NameAndType        #5:#159       // "<init>":(Ljava/util/List;)V
  #159 = Utf8               (Ljava/util/List;)V
  #160 = String             #161          // SkillList
  #161 = Utf8               SkillList
  #162 = Methodref          #163.#164     // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #163 = Class              #165          // java/lang/String
  #164 = NameAndType        #166:#167     // startsWith:(Ljava/lang/String;)Z
  #165 = Utf8               java/lang/String
  #166 = Utf8               startsWith
  #167 = Utf8               (Ljava/lang/String;)Z
  #168 = Methodref          #22.#169      // ext/mods/gameserver/model/actor/instance/Folk.showSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #169 = NameAndType        #170:#171     // showSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #170 = Utf8               showSkillList
  #171 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #172 = String             #173          // EnchantSkillList
  #173 = Utf8               EnchantSkillList
  #174 = Methodref          #22.#175      // ext/mods/gameserver/model/actor/instance/Folk.showEnchantSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #175 = NameAndType        #176:#171     // showEnchantSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #176 = Utf8               showEnchantSkillList
  #177 = Methodref          #2.#178       // ext/mods/gameserver/model/actor/Npc.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #178 = NameAndType        #179:#180     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #179 = Utf8               onBypassFeedback
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #181 = Utf8               Code
  #182 = Utf8               LineNumberTable
  #183 = Utf8               LocalVariableTable
  #184 = Utf8               this
  #185 = Utf8               Lext/mods/gameserver/model/actor/instance/Folk;
  #186 = Utf8               objectId
  #187 = Utf8               I
  #188 = Utf8               template
  #189 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #190 = Utf8               newEffect
  #191 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #192 = Utf8               StackMapTable
  #193 = Utf8               html
  #194 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #195 = Utf8               minlevel
  #196 = Utf8               player
  #197 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #198 = Utf8               skills
  #199 = Utf8               Ljava/util/List;
  #200 = Utf8               LocalVariableTypeTable
  #201 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;>;
  #202 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;>;
  #203 = Utf8               command
  #204 = Utf8               Ljava/lang/String;
  #205 = Utf8               SourceFile
  #206 = Utf8               Folk.java
  #207 = Utf8               BootstrapMethods
  #208 = String             #209          // html/trainer/\u0001-noskills.htm
  #209 = Utf8               html/trainer/\u0001-noskills.htm
  #210 = MethodHandle       6:#211        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #211 = Methodref          #212.#213     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #212 = Class              #214          // java/lang/invoke/StringConcatFactory
  #213 = NameAndType        #57:#215      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #214 = Utf8               java/lang/invoke/StringConcatFactory
  #215 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #216 = Utf8               InnerClasses
  #217 = Class              #218          // java/lang/invoke/MethodHandles$Lookup
  #218 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #219 = Class              #220          // java/lang/invoke/MethodHandles
  #220 = Utf8               java/lang/invoke/MethodHandles
  #221 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Folk(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 44: 0
        line 45: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Folk;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void addEffect(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/skills/effects/EffectDebuff
         4: ifne          14
         7: aload_1
         8: instanceof    #9                  // class ext/mods/gameserver/skills/effects/EffectBuff
        11: ifeq          22
        14: aload_0
        15: aload_1
        16: invokespecial #11                 // Method ext/mods/gameserver/model/actor/Npc.addEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
        19: goto          30
        22: aload_1
        23: ifnull        30
        26: aload_1
        27: invokevirtual #15                 // Method ext/mods/gameserver/skills/AbstractEffect.stopEffectTask:()V
        30: return
      LineNumberTable:
        line 50: 0
        line 51: 14
        line 52: 22
        line 53: 26
        line 54: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/instance/Folk;
            0      31     1 newEffect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */

  public void showSkillList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #21                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: aload_1
         5: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
         8: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.canTeach:(Lext/mods/gameserver/enums/actors/ClassId;)Z
        11: ifne          52
        14: new           #39                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        17: dup
        18: aload_0
        19: invokevirtual #41                 // Method getObjectId:()I
        22: invokespecial #45                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        25: astore_2
        26: aload_2
        27: aload_1
        28: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        31: aload_0
        32: invokevirtual #21                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        35: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        38: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        43: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        46: aload_1
        47: aload_2
        48: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: return
        52: aload_1
        53: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getAvailableSkills:()Ljava/util/List;
        56: astore_2
        57: aload_2
        58: invokeinterface #71,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        63: ifeq          109
        66: aload_1
        67: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.getRequiredLevelForNextSkill:()I
        70: istore_3
        71: iload_3
        72: ifle          92
        75: aload_1
        76: getstatic     #80                 // Field ext/mods/gameserver/network/SystemMessageId.DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
        79: invokestatic  #86                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        82: iload_3
        83: invokevirtual #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        86: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        89: goto          99
        92: aload_1
        93: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.NO_MORE_SKILLS_TO_LEARN:Lext/mods/gameserver/network/SystemMessageId;
        96: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        99: aload_1
       100: getstatic     #102                // Field ext/mods/gameserver/network/serverpackets/AcquireSkillDone.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
       103: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       106: goto          124
       109: aload_1
       110: new           #108                // class ext/mods/gameserver/network/serverpackets/AcquireSkillList
       113: dup
       114: getstatic     #110                // Field ext/mods/gameserver/enums/skills/AcquireSkillType.USUAL:Lext/mods/gameserver/enums/skills/AcquireSkillType;
       117: aload_2
       118: invokespecial #116                // Method ext/mods/gameserver/network/serverpackets/AcquireSkillList."<init>":(Lext/mods/gameserver/enums/skills/AcquireSkillType;Ljava/util/List;)V
       121: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       124: aload_1
       125: getstatic     #119                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       128: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       131: return
      LineNumberTable:
        line 62: 0
        line 64: 14
        line 65: 26
        line 66: 46
        line 67: 51
        line 70: 52
        line 71: 57
        line 73: 66
        line 74: 71
        line 75: 75
        line 77: 92
        line 79: 99
        line 80: 106
        line 82: 109
        line 84: 124
        line 85: 131
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      26     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           71      35     3 minlevel   I
            0     132     0  this   Lext/mods/gameserver/model/actor/instance/Folk;
            0     132     1 player   Lext/mods/gameserver/model/actor/Player;
           57      75     2 skills   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           57      75     2 skills   Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;>;
      StackMapTable: number_of_entries = 5
        frame_type = 52 /* same */
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class java/util/List, int ]
        frame_type = 6 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 14 /* same */

  public void showEnchantSkillList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #21                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: aload_1
         5: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
         8: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.canTeach:(Lext/mods/gameserver/enums/actors/ClassId;)Z
        11: ifne          52
        14: new           #39                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        17: dup
        18: aload_0
        19: invokevirtual #41                 // Method getObjectId:()I
        22: invokespecial #45                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        25: astore_2
        26: aload_2
        27: aload_1
        28: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        31: aload_0
        32: invokevirtual #21                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        35: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        38: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        43: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        46: aload_1
        47: aload_2
        48: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: return
        52: aload_1
        53: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        56: invokevirtual #124                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
        59: iconst_3
        60: if_icmpge     87
        63: new           #39                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        66: dup
        67: aload_0
        68: invokevirtual #41                 // Method getObjectId:()I
        71: invokespecial #45                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        74: astore_2
        75: aload_2
        76: ldc           #129                // String <html><body> You must have 3rd class change quest completed.</body></html>
        78: invokevirtual #131                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        81: aload_1
        82: aload_2
        83: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        86: return
        87: invokestatic  #135                // Method ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
        90: aload_1
        91: invokevirtual #141                // Method ext/mods/gameserver/data/xml/SkillTreeData.getEnchantSkillsFor:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
        94: astore_2
        95: aload_2
        96: invokeinterface #71,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       101: ifeq          158
       104: aload_1
       105: getstatic     #145                // Field ext/mods/gameserver/network/SystemMessageId.THERE_IS_NO_SKILL_THAT_ENABLES_ENCHANT:Lext/mods/gameserver/network/SystemMessageId;
       108: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       111: aload_1
       112: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       115: invokevirtual #152                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       118: bipush        74
       120: if_icmpge     141
       123: aload_1
       124: getstatic     #80                 // Field ext/mods/gameserver/network/SystemMessageId.DO_NOT_HAVE_FURTHER_SKILLS_TO_LEARN_S1:Lext/mods/gameserver/network/SystemMessageId;
       127: invokestatic  #86                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       130: bipush        74
       132: invokevirtual #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       135: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       138: goto          148
       141: aload_1
       142: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.NO_MORE_SKILLS_TO_LEARN:Lext/mods/gameserver/network/SystemMessageId;
       145: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       148: aload_1
       149: getstatic     #102                // Field ext/mods/gameserver/network/serverpackets/AcquireSkillDone.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/AcquireSkillDone;
       152: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       155: goto          170
       158: aload_1
       159: new           #155                // class ext/mods/gameserver/network/serverpackets/ExEnchantSkillList
       162: dup
       163: aload_2
       164: invokespecial #157                // Method ext/mods/gameserver/network/serverpackets/ExEnchantSkillList."<init>":(Ljava/util/List;)V
       167: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       170: aload_1
       171: getstatic     #119                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       174: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       177: return
      LineNumberTable:
        line 93: 0
        line 95: 14
        line 96: 26
        line 97: 46
        line 98: 51
        line 101: 52
        line 103: 63
        line 104: 75
        line 105: 81
        line 106: 86
        line 109: 87
        line 110: 95
        line 112: 104
        line 114: 111
        line 115: 123
        line 117: 141
        line 119: 148
        line 122: 158
        line 124: 170
        line 125: 177
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      26     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           75      12     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     178     0  this   Lext/mods/gameserver/model/actor/instance/Folk;
            0     178     1 player   Lext/mods/gameserver/model/actor/Player;
           95      83     2 skills   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           95      83     2 skills   Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;>;
      StackMapTable: number_of_entries = 6
        frame_type = 52 /* same */
        frame_type = 34 /* same */
        frame_type = 252 /* append */
          offset_delta = 53
          locals = [ class java/util/List ]
        frame_type = 6 /* same */
        frame_type = 9 /* same */
        frame_type = 11 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_2
         1: ldc           #160                // String SkillList
         3: invokevirtual #162                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          17
         9: aload_0
        10: aload_1
        11: invokevirtual #168                // Method showSkillList:(Lext/mods/gameserver/model/actor/Player;)V
        14: goto          40
        17: aload_2
        18: ldc           #172                // String EnchantSkillList
        20: invokevirtual #162                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        23: ifeq          34
        26: aload_0
        27: aload_1
        28: invokevirtual #174                // Method showEnchantSkillList:(Lext/mods/gameserver/model/actor/Player;)V
        31: goto          40
        34: aload_0
        35: aload_1
        36: aload_2
        37: invokespecial #177                // Method ext/mods/gameserver/model/actor/Npc.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        40: return
      LineNumberTable:
        line 130: 0
        line 131: 9
        line 132: 17
        line 133: 26
        line 135: 34
        line 136: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/instance/Folk;
            0      41     1 player   Lext/mods/gameserver/model/actor/Player;
            0      41     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 16 /* same */
        frame_type = 5 /* same */
}
SourceFile: "Folk.java"
BootstrapMethods:
  0: #210 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #208 html/trainer/\u0001-noskills.htm
InnerClasses:
  public static final #221= #217 of #219; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
