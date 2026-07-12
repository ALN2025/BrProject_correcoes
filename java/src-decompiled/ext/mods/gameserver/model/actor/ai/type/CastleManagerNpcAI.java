// Bytecode for: ext.mods.gameserver.model.actor.ai.type.CastleManagerNpcAI
// File: ext\mods\gameserver\model\actor\ai\type\CastleManagerNpcAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI.class
  Last modified 9 de jul de 2026; size 2452 bytes
  MD5 checksum 2b8f940bf7315483b08f500a1b94e294
  Compiled from "CastleManagerNpcAI.java"
public class ext.mods.gameserver.model.actor.ai.type.CastleManagerNpcAI extends ext.mods.gameserver.model.actor.ai.type.NpcAI<ext.mods.gameserver.model.actor.instance.CastleChamberlain>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/NpcAI
  interfaces: 0, fields: 0, methods: 2, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/type/NpcAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI
    #9 = NameAndType        #11:#12       // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI
   #11 = Utf8               _currentIntention
   #12 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/ai/Intention
   #15 = NameAndType        #17:#18       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #16 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #17 = Utf8               getSkill
   #18 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #20 = NameAndType        #21:#22       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #21 = Utf8               _actor
   #22 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #23 = Class              #24           // ext/mods/gameserver/model/actor/instance/CastleChamberlain
   #24 = Utf8               ext/mods/gameserver/model/actor/instance/CastleChamberlain
   #25 = Methodref          #23.#26       // ext/mods/gameserver/model/actor/instance/CastleChamberlain.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
   #26 = NameAndType        #27:#28       // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
   #27 = Utf8               isSkillDisabled
   #28 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
   #29 = Methodref          #14.#30       // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #30 = NameAndType        #31:#32       // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #31 = Utf8               getFinalTarget
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #33 = Class              #34           // ext/mods/gameserver/model/actor/Player
   #34 = Utf8               ext/mods/gameserver/model/actor/Player
   #35 = Class              #36           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #36 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #37 = Methodref          #23.#38       // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getObjectId:()I
   #38 = NameAndType        #39:#40       // getObjectId:()I
   #39 = Utf8               getObjectId
   #40 = Utf8               ()I
   #41 = Methodref          #35.#42       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #42 = NameAndType        #5:#43        // "<init>":(I)V
   #43 = Utf8               (I)V
   #44 = Methodref          #23.#45       // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #45 = NameAndType        #46:#47       // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #46 = Utf8               getStatus
   #47 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
   #49 = Class              #51           // ext/mods/gameserver/model/actor/status/NpcStatus
   #50 = NameAndType        #52:#53       // getMp:()D
   #51 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #52 = Utf8               getMp
   #53 = Utf8               ()D
   #54 = Methodref          #55.#56       // ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
   #55 = Class              #57           // ext/mods/gameserver/skills/L2Skill
   #56 = NameAndType        #58:#40       // getMpConsume:()I
   #57 = Utf8               ext/mods/gameserver/skills/L2Skill
   #58 = Utf8               getMpConsume
   #59 = Methodref          #55.#60       // ext/mods/gameserver/skills/L2Skill.getMpInitialConsume:()I
   #60 = NameAndType        #61:#40       // getMpInitialConsume:()I
   #61 = Utf8               getMpInitialConsume
   #62 = Methodref          #33.#63       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #63 = NameAndType        #64:#65       // getLocale:()Ljava/util/Locale;
   #64 = Utf8               getLocale
   #65 = Utf8               ()Ljava/util/Locale;
   #66 = String             #67           // html/chamberlain/support-no_mana.htm
   #67 = Utf8               html/chamberlain/support-no_mana.htm
   #68 = Methodref          #35.#69       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #69 = NameAndType        #70:#71       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #70 = Utf8               setFile
   #71 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #72 = Methodref          #2.#73        // ext/mods/gameserver/model/actor/ai/type/NpcAI.thinkCast:()V
   #73 = NameAndType        #74:#75       // thinkCast:()V
   #74 = Utf8               thinkCast
   #75 = Utf8               ()V
   #76 = String             #77           // html/chamberlain/support-done.htm
   #77 = Utf8               html/chamberlain/support-done.htm
   #78 = String             #79           // %mp%
   #79 = Utf8               %mp%
   #80 = Methodref          #35.#81       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #81 = NameAndType        #82:#83       // replace:(Ljava/lang/String;I)V
   #82 = Utf8               replace
   #83 = Utf8               (Ljava/lang/String;I)V
   #84 = String             #85           // %objectId%
   #85 = Utf8               %objectId%
   #86 = Methodref          #33.#87       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = NameAndType        #88:#89       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #88 = Utf8               sendPacket
   #89 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #90 = Utf8               (Lext/mods/gameserver/model/actor/instance/CastleChamberlain;)V
   #91 = Utf8               Code
   #92 = Utf8               LineNumberTable
   #93 = Utf8               LocalVariableTable
   #94 = Utf8               this
   #95 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
   #96 = Utf8               castleManager
   #97 = Utf8               Lext/mods/gameserver/model/actor/instance/CastleChamberlain;
   #98 = Utf8               skill
   #99 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #100 = Utf8               player
  #101 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #102 = Utf8               html
  #103 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #104 = Utf8               StackMapTable
  #105 = Utf8               Signature
  #106 = Utf8               Lext/mods/gameserver/model/actor/ai/type/NpcAI<Lext/mods/gameserver/model/actor/instance/CastleChamberlain;>;
  #107 = Utf8               SourceFile
  #108 = Utf8               CastleManagerNpcAI.java
{
  public ext.mods.gameserver.model.actor.ai.type.CastleManagerNpcAI(ext.mods.gameserver.model.actor.instance.CastleChamberlain);
    descriptor: (Lext/mods/gameserver/model/actor/instance/CastleChamberlain;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         5: return
      LineNumberTable:
        line 29: 0
        line 30: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
            0       6     1 castleManager   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;

  protected void thinkCast();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
         7: astore_1
         8: aload_0
         9: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: checkcast     #23                 // class ext/mods/gameserver/model/actor/instance/CastleChamberlain
        15: aload_1
        16: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/instance/CastleChamberlain.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
        19: ifeq          23
        22: return
        23: aload_0
        24: getfield      #7                  // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        27: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #33                 // class ext/mods/gameserver/model/actor/Player
        33: astore_2
        34: new           #35                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        37: dup
        38: aload_0
        39: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        42: checkcast     #23                 // class ext/mods/gameserver/model/actor/instance/CastleChamberlain
        45: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/instance/CastleChamberlain.getObjectId:()I
        48: invokespecial #41                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        51: astore_3
        52: aload_0
        53: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        56: checkcast     #23                 // class ext/mods/gameserver/model/actor/instance/CastleChamberlain
        59: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/instance/CastleChamberlain.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        62: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
        65: aload_1
        66: invokevirtual #54                 // Method ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
        69: aload_1
        70: invokevirtual #59                 // Method ext/mods/gameserver/skills/L2Skill.getMpInitialConsume:()I
        73: iadd
        74: i2d
        75: dcmpg
        76: ifge          92
        79: aload_3
        80: aload_2
        81: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        84: ldc           #66                 // String html/chamberlain/support-no_mana.htm
        86: invokevirtual #68                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        89: goto          106
        92: aload_0
        93: invokespecial #72                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.thinkCast:()V
        96: aload_3
        97: aload_2
        98: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       101: ldc           #76                 // String html/chamberlain/support-done.htm
       103: invokevirtual #68                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       106: aload_3
       107: ldc           #78                 // String %mp%
       109: aload_0
       110: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       113: checkcast     #23                 // class ext/mods/gameserver/model/actor/instance/CastleChamberlain
       116: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/instance/CastleChamberlain.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       119: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
       122: d2i
       123: invokevirtual #80                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       126: aload_3
       127: ldc           #84                 // String %objectId%
       129: aload_0
       130: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       133: checkcast     #23                 // class ext/mods/gameserver/model/actor/instance/CastleChamberlain
       136: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/instance/CastleChamberlain.getObjectId:()I
       139: invokevirtual #80                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       142: aload_2
       143: aload_3
       144: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       147: return
      LineNumberTable:
        line 35: 0
        line 37: 8
        line 38: 22
        line 40: 23
        line 42: 34
        line 43: 52
        line 44: 79
        line 47: 92
        line 48: 96
        line 51: 106
        line 52: 126
        line 53: 142
        line 54: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     148     0  this   Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
            8     140     1 skill   Lext/mods/gameserver/skills/L2Skill;
           34     114     2 player   Lext/mods/gameserver/model/actor/Player;
           52      96     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 253 /* append */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 13 /* same */
}
Signature: #106                         // Lext/mods/gameserver/model/actor/ai/type/NpcAI<Lext/mods/gameserver/model/actor/instance/CastleChamberlain;>;
SourceFile: "CastleManagerNpcAI.java"
